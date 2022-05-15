import os
import shutil
import sys

import requests
import ansible_runner
from pymongo import MongoClient

client = MongoClient('localhost', 28017)
db = client['AnsibleDB']
ansible_galaxy_roles = db['AnsibleGalaxyRoles']
ansible_roles_url = "https://galaxy.ansible.com/api/v1/content/"
last_page = False
ansible_galaxy_roles.update_many({}, {"$set": {"valid": False}})
page = 1
while not last_page:
    print('Page is %s' % page)
    params = {'page': page}
    resp = requests.get(url=ansible_roles_url, params=params)
    data = resp.json()
    contents = data['results']  # content that reside in a page
    if data['next_link'] is None:
        last_page = True

    for content in contents:
        if not content['content_type'] == 'role':
            continue
        try:
            if content['summary_fields']['repository']['deprecated'] is True:
                continue
            role_name = content['name']
            role_namespace = content['summary_fields']['namespace']['name']
            download_count = content['download_count']
            content_score = content['content_score']
            description = content['description']
        except KeyError:
            print("Key error")
            continue
        if download_count is None or content_score is None:
            continue
        if download_count > 10000 and content_score > 4.0:
            role_dict = {
                'role_name': role_name,
                'role_namespace': role_namespace,
                'download_count': download_count,
                'content_score': content_score,
                'description': description,
                'valid': True
            }
            ansible_galaxy_roles.replace_one({'_id': role_namespace + "." + role_name}, role_dict, upsert=True)

    page += 1

ansible_galaxy_roles.delete_many({"valid": False})
