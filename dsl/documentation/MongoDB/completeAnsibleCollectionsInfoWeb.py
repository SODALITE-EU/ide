import requests
from bs4 import BeautifulSoup
import json
from pymongo import MongoClient
from pymongo.errors import WriteError

client = MongoClient('localhost', 27017)
db = client['AnsibleDB']
ansible_collections = db['AnsibleGalaxyCollections']
module_base_URL = 'https://docs.ansible.com/ansible/latest/collections/'


# myquery = {"_id": "azure.azcollection"}
# newvalues = {"$set": {"modules.azure_rm_autoscale.parameters.profiles.suboptions.rules.suboptions.cooldown.type": "string"}}
# ansible_collections.update_one(myquery, newvalues)


def extract_subparameters(rows_counter, rows, base_column, id, subdocumentText):
    elements = {}
    while rows_counter + 1 < len(rows):
        rows_counter += 1
        row = rows[rows_counter]
        if len(row.find_all('td', {"class": "elbow-placeholder"})) == base_column:
            queryText = subdocumentText + ".suboptions"
            parameter_name, param_details, rows_counter = extract_parameter_options(row, rows_counter, rows,
                                                                                    base_column, id, queryText)
            elements[parameter_name] = param_details
            queryText = queryText + "." + parameter_name
            type = param_details['type']
            myquery = {"_id": id}
            newvalues = {"$set": {
                queryText + ".type": type}}
            try:
                # update subparameter type in MongoDB
                ansible_collections.update_one(myquery, newvalues)
            except WriteError:
                print('The update ' + queryText + ".type" + ' cannot be performed')
        else:
            rows_counter -= 1
            return elements, rows_counter
    # rows_counter -= 1
    return elements, rows_counter


def extract_parameter_options(row, rows_counter, rows, base_column, id, subdocumentText):
    cols = row.find_all('td')
    param_details = {}
    parameter_name = cols[base_column].find('b').text

    parameter_type = cols[base_column].span.parent.contents[1].text
    if len(cols[base_column].span.parent.text.strip().split('elements=')) > 1:
        parameter_type = parameter_type + '/' + cols[base_column].span.parent.text.strip().split('elements=')[1]
    param_details['type'] = parameter_type
    if len(cols[base_column].span.parent.contents) > 3 and "required" in cols[base_column].text:
        param_details['required'] = True

    if "Choices:" in cols[base_column + 1].text:
        choices = []
        for choice in cols[base_column + 1].text.strip().split("\n")[1:]:
            if "\u2190" in choice:
                param_details['default'] = choice.replace("\u2190", "").strip()
                choices.append(choice.replace("\u2190", "").strip())
            else:
                choices.append(choice)
        param_details['choices'] = choices

    if "Default:" in cols[base_column + 1].text:
        param_details['default'] = cols[base_column + 1].div.text.replace("\"", "")
    subdocumentText = subdocumentText + "." + parameter_name
    # if ("dictionary" in parameter_type) or ("string" in parameter_type) or ("raw" in parameter_type):
    sub_parameters, rows_counter = extract_subparameters(rows_counter, rows, base_column + 1, id, subdocumentText)
    if bool(sub_parameters):
        param_details['subparameters'] = sub_parameters

    return parameter_name, param_details, rows_counter


def extract_parameters(module, namespace, collection_name, module_name):
    module_parameters = {}
    module_URL = module_base_URL + module.find("a").get('href')
    module_page = requests.get(module_URL)
    module_soup = BeautifulSoup(module_page.content, "html.parser")
    parameters_table = module_soup.find('table', attrs={'class': 'documentation-table'})
    if parameters_table is None:
        return module_parameters

    rows = parameters_table.find_all('tr')
    if "Fact" in rows[0].find_all('th')[0].text:
        return module_parameters
    if "Key" in rows[0].find_all('th')[0].text:
        return module_parameters
    rows_num = len(rows)
    rows_counter = 1

    # for row in rows[1:]:
    while rows_counter < rows_num:
        row = rows[rows_counter]
        subdocumentText = "modules." + module_name + ".parameters"
        id = namespace + "." + collection_name
        parameter_name, param_details, rows_counter = extract_parameter_options(row, rows_counter, rows, 0, id,
                                                                                subdocumentText)
        parameter_type = param_details['type']
        myquery = {"_id": namespace + "." + collection_name}
        newvalues = {"$set": {
            "modules." + module_name + ".parameters." + parameter_name + ".type": parameter_type}}
        # update parameter type in MongoDB
        ansible_collections.update_one(myquery, newvalues)
        module_parameters[parameter_name] = param_details
        rows_counter += 1

    return module_parameters


result_collections = []
URL = "https://docs.ansible.com/ansible/latest/collections/index_module.html"
page = requests.get(URL)
soup = BeautifulSoup(page.content, "html.parser")
results = soup.find(id="index-of-all-modules")
# print(results.prettify())
# retrieve Ansible collections from web page
collections = results.find_all("div", class_="section")

for collection in collections:
    full_collection_name = collection.find("h2").text.strip().split("\uf0c1")[
        0]  # use \uf0c1 unicode character because it is used in the html

    namespace = full_collection_name.split(".")[0]
    collection_name = full_collection_name.split('¶')[0].split(".")[
        1]  # use the pilcrow sign because it is used in the html

    if full_collection_name != "ansible.builtin":
        continue
    print('Collection:' + full_collection_name)
    collection_modules = []
    modules_dict = {}
    for module in collection.find_all("p"):
        module_name = module.find("span").text.strip().split(".")[-1]
        fqn_module_name = '%s.%s.%s' % (namespace, collection_name, module_name)
        # module_name = module_name.split(".")[-1]
        print(module_name)
        parameters = extract_parameters(module, namespace=namespace, collection_name=collection_name,
                                        module_name=module_name)
        module_dict = {
            # 'module name': module_name.split(".")[-1],
            'parameters': parameters
        }

        collection_modules.append(module_dict)
        modules_dict[module_name] = parameters

    collection_dict = {
        'namespace': namespace,
        'collection_name': collection_name,
        'modules': modules_dict
    }

    ansible_collections.replace_one({'_id': namespace + "." + collection_name}, collection_dict, upsert=True)

    result_collections.append(collection_dict)
