import os,shutil,hashlib,uuid
root=os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
workspace=os.path.abspath(os.environ.get('SMART_TIME_WORKSPACE') or os.path.join(root,'workspace','SMART_TIME_PRO_customization'))
if os.name=='nt':
    root='\\\\?\\'+root
    workspace='\\\\?\\'+workspace
if not os.path.isdir(workspace):raise SystemExit('Run Restore-Workspace.ps1 first.')
backup=os.path.join(workspace,'.cache','overlay-backup-'+uuid.uuid4().hex)
count=0
for part in ['base','arm64','xxhdpi']:
    source=os.path.join(root,'patches',part)
    for path,dirs,files in os.walk(source):
        for name in files:
            src=os.path.join(path,name);rel=os.path.relpath(src,source)
            dst=os.path.abspath(os.path.join(workspace,'editable',part,rel))
            if os.path.commonpath([workspace,dst])!=workspace:raise RuntimeError('Invalid destination')
            if os.path.isfile(dst):
                if hashlib.sha256(open(src,'rb').read()).digest()==hashlib.sha256(open(dst,'rb').read()).digest():continue
                old=os.path.join(backup,part,rel);os.makedirs(os.path.dirname(old),exist_ok=True);shutil.copy2(dst,old)
            os.makedirs(os.path.dirname(dst),exist_ok=True);shutil.copy2(src,dst);count+=1
print('Overlay files changed:',count)
