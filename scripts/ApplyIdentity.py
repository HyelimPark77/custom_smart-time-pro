# -*- coding: utf-8 -*-
"""Apply a separate app identity to a decoded standalone APK.
Does not rename Java/JNI classes, modify executable code or change security verdicts.
"""
import argparse
import json
import os
import re
import xml.etree.ElementTree as ET

parser = argparse.ArgumentParser()
parser.add_argument('--decoded', required=True)
parser.add_argument('--profile', required=True)
parser.add_argument('--report', required=True)
args = parser.parse_args()
decoded = os.path.abspath(args.decoded)
profile = json.load(open(args.profile, encoding='utf-8-sig'))
new = profile['application_id']
if not re.fullmatch(r'[a-z][a-z0-9_]*(\.[a-z][a-z0-9_]*){2,}', new):
    raise SystemExit('Invalid application ID')
if not profile['app_name'].strip() or int(profile['version_code']) < 1:
    raise SystemExit('Invalid app label or version code')
if profile['apk_filename'] != os.path.basename(profile['apk_filename']) or not profile['apk_filename'].endswith('.apk'):
    raise SystemExit('Invalid APK filename')

android = '{http://schemas.android.com/apk/res/android}'
ET.register_namespace('android', android[1:-1])
manifest = os.path.join(decoded, 'AndroidManifest.xml')
tree = ET.parse(manifest)
root = tree.getroot()
old = root.get('package')
if old == new:
    raise SystemExit('Identity was already applied; prepare a fresh standalone input')
changes = []
component_tags = {'application', 'activity', 'activity-alias', 'service', 'receiver', 'provider', 'instrumentation'}
class_keys = {'name', 'targetActivity', 'appComponentFactory', 'backupAgent', 'manageSpaceActivity', 'zygotePreloadName'}

# Keep implementation classes at their original namespaces, including relative names.
for item in root.iter():
    if item.tag in component_tags:
        for key in class_keys:
            value = item.get(android + key)
            if not value or value.startswith('@'):
                continue
            if value.startswith('.'):
                item.set(android + key, old + value)
            elif '.' not in value:
                item.set(android + key, old + '.' + value)

identity_keys = {'authorities', 'permission', 'readPermission', 'writePermission', 'taskAffinity', 'process', 'targetPackage'}
for item in root.iter():
    for key, value in list(item.attrib.items()):
        local = key.split('}', 1)[-1]
        scoped = local in identity_keys
        scoped = scoped or (local == 'name' and item.tag in {'permission', 'uses-permission', 'uses-permission-sdk-23', 'permission-group', 'permission-tree', 'action'})
        scoped = scoped or (item.tag == 'data' and local in {'scheme', 'host', 'path', 'pathPrefix', 'pathPattern'})
        if scoped and old in value:
            replacement = value.replace(old, new)
            item.set(key, replacement)
            changes.append({'tag': item.tag, 'attribute': local, 'before': value, 'after': replacement})

root.set('package', new)
root.set(android + 'versionName', profile['version_name'])
root.set(android + 'versionCode', str(profile['version_code']))
app = root.find('application')
app.set(android + 'label', '@string/app_name')
for item in app:
    if item.tag in {'activity', 'activity-alias'}:
        for intent in item.findall('intent-filter'):
            if any(c.get(android + 'name') == 'android.intent.category.LAUNCHER' for c in intent.findall('category')):
                item.set(android + 'label', '@string/app_name')
tree.write(manifest, encoding='utf-8', xml_declaration=True)

localized = []
res = os.path.join(decoded, 'res')
pattern = re.compile(r'(<string\b[^>]*\bname="app_name"[^>]*>)(.*?)(</string>)', re.DOTALL)
from xml.sax.saxutils import escape
label = escape(profile['app_name'])
for folder in os.listdir(res):
    if not folder.startswith('values'):
        continue
    path = os.path.join(res, folder, 'strings.xml')
    if not os.path.isfile(path):
        continue
    with open(path, encoding='utf-8') as f:
        text = f.read()
    text, count = pattern.subn(lambda m: m.group(1) + label + m.group(3), text)
    if count:
        with open(path, 'w', encoding='utf-8', newline='') as f:
            f.write(text)
        localized.append(folder)
if 'values' not in localized:
    raise RuntimeError('Default app_name resource was not found')

yaml_path = os.path.join(decoded, 'apktool.yml')
with open(yaml_path, encoding='utf-8') as f:
    yaml = f.read()
yaml, cn = re.subn(r'(?m)^  versionCode:.*$', '  versionCode: ' + str(profile['version_code']), yaml)
yaml, nn = re.subn(r'(?m)^  versionName:.*$', '  versionName: ' + profile['version_name'], yaml)
if (cn, nn) != (1, 1):
    raise RuntimeError('Unexpected apktool version metadata')
with open(yaml_path, 'w', encoding='utf-8', newline='') as f:
    f.write(yaml)

report = {'old_application_id': old, 'profile': profile, 'manifest_changes': changes,
          'app_name_resource_configurations': localized, 'dex_modified': False,
          'permissions_removed': [], 'security_block_resolved': False,
          'note': 'Separate app identity for coexistence; original runtime implementation retained. External SDK registrations may need new application ID/certificate configuration.'}
os.makedirs(os.path.dirname(os.path.abspath(args.report)), exist_ok=True)
with open(args.report, 'w', encoding='utf-8') as f:
    json.dump(report, f, ensure_ascii=False, indent=2)
print('Applied identity:', new, '| label:', profile['app_name'], '| localized resources:', len(localized))
