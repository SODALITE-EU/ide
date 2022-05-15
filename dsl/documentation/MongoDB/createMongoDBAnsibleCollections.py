import os
import shutil
import sys

import requests
import ansible_runner
from pymongo import MongoClient
from pathlib import Path
import tarfile


def extract_roles(file_path):
    role_folder = '%s/roles' % file_path
    collection_roles = []
    if os.path.isdir(role_folder):
        directories = os.listdir(role_folder)
        for directory in directories:
            collection_roles.append(directory)
    return collection_roles


def replace_type(subparameters):
    for subparameter in subparameters:
        if 'type' in subparameters[subparameter]:
            if subparameters[subparameter]['type'] == "str":
                subparameters[subparameter]['type'] = 'string'
            elif subparameters[subparameter]['type'] == "bool":
                subparameters[subparameter]['type'] = 'boolean'
            elif subparameters[subparameter]['type'] == "dict":
                subparameters[subparameter]['type'] = 'dictionary'
            elif subparameters[subparameter]['type'] == "int":
                subparameters[subparameter]['type'] = 'integer'
        if 'suboptions' in subparameters[subparameter]:
            replace_type(subparameters[subparameter]['suboptions'])


def extract_parameters(module_folder, fqn_module_name, metadata_folder):
    module_details, param_err = ansible_runner.interface.get_plugin_docs(
        plugin_names=[fqn_module_name],
        plugin_type='module',
        response_format='json',
        quiet=True,
        private_data_dir=metadata_folder
    )
    # ansible_runner.interface.run_command(executable_cmd = 'ansible-galaxy')
    module_parameters = {}  # in this dictionary will be saved the parameters
    if module_details in (None, ''):
        print("Module " + fqn_module_name + " has not proper "
                                            "documentation")
        # problematic_modules.write('%s:%s\n' % (fqn_module_name, param_err))
        problematic_modules.write('%s:%s\n' % (fqn_module_name, "not proper documentation"))
        return {}
    module_options = []
    try:
        # retrieve parameter data from json response
        module_options = module_details[fqn_module_name]['doc']['options']
        # check if 'options' has the right format in order to traverse the parameters
        if type(module_options) is str:
            problematic_modules.write('%s:Module options is string\n' % fqn_module_name)
            return {}  # wrong definition of 'options'
        elif module_options is None:
            problematic_modules.write('%s:Module options is None\n' % fqn_module_name)
            return {}  # empty definition of 'options'
        elif type(module_options) is list:
            problematic_modules.write('%s:Module options is list\n' % fqn_module_name)
            module_options = module_options[
                0]  # some module documentation metadata enclose the 'options' inside a list,which is wrong
    except KeyError:
        if "facts" in fqn_module_name:
            return {}
        print("Module " + fqn_module_name + " has not proper "
                                            "documentation - KeyError")
        problematic_modules.write('%s:Module options is missing keys\n' % fqn_module_name)
        return {}
    # extract the parameter's data and store each parameter in 'module_parameters' dictionary
    for parameter_name in module_options:
        param_details = {}
        if module_options[parameter_name] is None:
            module_parameters[parameter_name] = param_details
            continue
        if 'type' in module_options[parameter_name]:
            if module_options[parameter_name]['type'] == "str":
                param_details['type'] = 'string'
            elif module_options[parameter_name]['type'] == "bool":
                param_details['type'] = 'boolean'
            elif module_options[parameter_name]['type'] == "dict":
                param_details['type'] = 'dictionary'
            elif module_options[parameter_name]['type'] == "int":
                param_details['type'] = 'integer'
            else:
                param_details['type'] = module_options[parameter_name]['type']

        if 'description' in module_options[parameter_name]:
            param_details['description'] = module_options[parameter_name]['description']
        if 'required' in module_options[parameter_name]:
            if module_options[parameter_name]['required'] != False:
                param_details['required'] = True
        if 'choices' in module_options[parameter_name]:
            param_details['choices'] = module_options[parameter_name]['choices']
        if 'default' in module_options[parameter_name]:
            # some default values when extracted from documentation are not recognised as strings
            if 'type' in param_details and param_details['type'] == 'string' and not isinstance(module_options[parameter_name]['default'], str):
                param_details['default'] = str(module_options[parameter_name]['default'])
            else:
                param_details['default'] = module_options[parameter_name]['default']
        if 'suboptions' in module_options[parameter_name]:
            replace_type(module_options[parameter_name]['suboptions'])
            param_details['suboptions'] = module_options[parameter_name]['suboptions']

        module_parameters[parameter_name] = param_details
    del module_details
    return module_parameters


def extract_modules(file_path, metadata_folder):
    module_folder = '%s/plugins/modules' % file_path  # folder where the Ansible modules .py files are located inside the collection
    modules_dict = {}
    # traverse the folder where the .py files of the Ansible modules are located and find information for each one
    if os.path.isdir(module_folder):
        for root, directories, files in os.walk(module_folder):
            for file in files:
                if file.endswith('.py') and not file.startswith('_'):
                    module_name = file.split('.py')[0]
                    print(module_name)
                    fqn_module_name = '%s.%s.%s' % (namespace, collection_name, module_name)
                    module_parameters = extract_parameters(module_folder, fqn_module_name, metadata_folder)
                    module_dict = {
                        'parameters': module_parameters
                    }
                    ansible_galaxy_modules.replace_one({'_id': fqn_module_name}, module_dict,
                                                       upsert=True)
                    try:
                        modules_dict[module_name] = module_dict
                    except TypeError as err:
                        problematic_modules.write('%s:%s\n' % (fqn_module_name, err))

    return modules_dict


metadata_folder = sys.argv[1]
# metadata_folder = "/media/mik/Elements/polimi_thesis/Downloaded_Collections2/metadata/"
Path(metadata_folder).mkdir(parents=True, exist_ok=True)
client = MongoClient('localhost', 28017)
db = client['AnsibleDB']
ansible_galaxy_collections = db['AnsibleGalaxyCollections']
ansible_galaxy_modules = db['AnsibleGalaxyModules']
collection_path = sys.argv[2]
# collection_path = '/home/mik/.ansible/collections/'
base_ansible_collection_url = "https://galaxy.ansible.com/api/v2/collections/"
problematic_modules = open('problematic_modules_official.txt', 'a')

f = open("certified_collections.txt", "r")
for collection in f:
    if "ansible.builtin" in collection:
        continue
    # namespace = 'ansible'
    # collection_name = 'posix'
    namespace = collection.split(".")[0]
    collection_name = collection.strip().split(".")[1]
    collection_url = base_ansible_collection_url + namespace + "/" + collection_name + "/"  # URL of the Ansible collection
    response = requests.get(url=collection_url)
    collection_data = response.json()  # get data from the API
    try:
        collection_ref = collection_data['latest_version']['href']
    except KeyError:
        print(namespace + "." + collection_name + " is not available in Ansible Galaxy")
        continue
    collection_response = requests.get(url=collection_ref)
    collection_details = collection_response.json()
    file_url = collection_details['download_url']
    file_name = file_url.split('/')[-1]
    file_path = metadata_folder + file_name
    # file_path = '/media/mik/Elements/polimi_thesis/Downloaded_Collections2/%s' % file_name
    print(file_name)
    collection_file_response = requests.get(url=file_url, stream=True)
    with open(file_path, 'wb') as f:
        f.write(collection_file_response.raw.read())
    extracted_path = '%sansible_collections/%s/%s' % (collection_path, namespace, collection_name)
    tar = tarfile.open(file_path, 'r:*')
    # extract the compressed file that contains the Ansible collection
    tar.extractall(extracted_path)
    tar.close()
    del tar

    modules = extract_modules(file_path=extracted_path, metadata_folder=metadata_folder)
    roles = extract_roles(file_path=extracted_path)
    collection_dict = {
        'namespace': namespace,
        'collection_name': collection_name,
        'modules': modules,
        'roles': roles
    }
    ansible_galaxy_collections.replace_one({'_id': namespace + "." + collection_name}, collection_dict, upsert=True)
    del collection_dict
    del modules
    try:
        shutil.rmtree(collection_path + 'ansible_collections' + '/' + namespace)
    except FileNotFoundError:
        continue
problematic_modules.close()
