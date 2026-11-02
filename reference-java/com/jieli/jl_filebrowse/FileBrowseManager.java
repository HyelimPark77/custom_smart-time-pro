package com.jieli.jl_filebrowse;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.jieli.jl_filebrowse.bean.File;
import com.jieli.jl_filebrowse.bean.FileChangeInfo;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_filebrowse.bean.RegFile;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileBrowseOperator;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_filebrowse.interfaces.LrcDecoder;
import com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback;
import com.jieli.jl_filebrowse.interfaces.OperatCallback;
import com.jieli.jl_filebrowse.interfaces.lrc.LrcReadObserver;
import com.jieli.jl_filebrowse.interfaces.lrc.LrcReadOperator;
import com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback;
import com.jieli.jl_filebrowse.tool.FileObserverHelper;
import com.jieli.jl_filebrowse.tool.LrcReadObserverHelper;
import com.jieli.jl_rcsp.impl.OnFileBrowseCallbackImpl;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.tool.filebrowse.FileBrowseOperatorImpl;
import com.jieli.jl_rcsp.tool.filebrowse.LrcReadOperatorImpl;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class FileBrowseManager implements OnFileBrowseCallback, OnLrcCallback {
    public static int MAX_FOLDER_LEVEL = 8;
    public static long WAITING_CMD_TIMEOUT = 20000;

    /* JADX INFO: renamed from: v */
    public static final String f37787v = "FileBrowseManager";

    /* JADX INFO: renamed from: w */
    public static final int f37788w = 4112;

    /* JADX INFO: renamed from: x */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile FileBrowseManager f37789x = null;

    /* JADX INFO: renamed from: y */
    public static final int f37790y = 3072;

    /* JADX INFO: renamed from: z */
    public static String f37791z;

    /* JADX INFO: renamed from: a */
    public FileBrowseOperator f37792a;

    /* JADX INFO: renamed from: b */
    public LrcReadOperator f37793b;

    /* JADX INFO: renamed from: c */
    public final FileObserverHelper f37794c;

    /* JADX INFO: renamed from: d */
    public final LrcReadObserverHelper f37795d;

    /* JADX INFO: renamed from: i */
    public volatile RcspOpImpl f37800i;

    /* JADX INFO: renamed from: k */
    public volatile SDCardBean f37802k;

    /* JADX INFO: renamed from: l */
    public volatile PathData f37803l;

    /* JADX INFO: renamed from: m */
    public Context f37804m;

    /* JADX INFO: renamed from: o */
    public OnRcspCallback f37806o;

    /* JADX INFO: renamed from: p */
    public final Handler f37807p;

    /* JADX INFO: renamed from: q */
    public byte[] f37808q;

    /* JADX INFO: renamed from: r */
    public int f37809r;

    /* JADX INFO: renamed from: s */
    public FileStruct f37810s;

    /* JADX INFO: renamed from: t */
    public LrcDecoder f37811t;

    /* JADX INFO: renamed from: u */
    public boolean f37812u;

    /* JADX INFO: renamed from: e */
    public final Map<String, Folder> f37796e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final ByteArrayOutputStream f37797f = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: g */
    public final List<SDCardBean> f37798g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f37799h = 10;

    /* JADX INFO: renamed from: j */
    public volatile boolean f37801j = false;

    /* JADX INFO: renamed from: n */
    public volatile boolean f37805n = false;

    public FileBrowseManager() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.jieli.jl_filebrowse.FileBrowseManager.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null) {
                    return false;
                }
                if (message.what == 4112) {
                    int i = message.arg1;
                    JL_Log.m27883i(FileBrowseManager.f37787v, "MSG_WAITING_FOR_DATA_TIMEOUT", "type = " + i + ", " + FileBrowseManager.this.f37802k);
                    FileBrowseManager.this.m27307c();
                    if (i == 1) {
                        FileBrowseManager.this.f37794c.OnFlayCallback(false);
                    } else {
                        FileBrowseManager.this.onFileReadFailed(4099);
                    }
                }
                return true;
            }
        });
        this.f37807p = handler;
        this.f37809r = 0;
        this.f37812u = true;
        this.f37794c = new FileObserverHelper(handler);
        this.f37795d = new LrcReadObserverHelper(handler);
    }

    public static FileBrowseManager getInstance() {
        if (f37789x == null) {
            synchronized (FileBrowseManager.class) {
                f37789x = new FileBrowseManager();
            }
        }
        return f37789x;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void OnFlayCallback(boolean z) {
        JL_Log.m27877d(f37787v, "OnFlayCallback", "isSuccess : " + z);
        m27307c();
        this.f37794c.OnFlayCallback(z);
    }

    public void addFileObserver(FileObserver fileObserver) {
        this.f37794c.registerCallback(fileObserver);
    }

    public void addLrcReadObserver(LrcReadObserver lrcReadObserver) {
        this.f37795d.registerCallback(lrcReadObserver);
    }

    public int appenBrowse(FileStruct fileStruct, SDCardBean sDCardBean) {
        int iListFiles = 4097;
        if (fileStruct != null && sDCardBean != null) {
            if (m27306b(sDCardBean)) {
                return 16384;
            }
            Folder currentReadFile = getCurrentReadFile(sDCardBean);
            if (currentReadFile == null) {
                JL_Log.m27887w(f37787v, "appenBrowse", "No file found. " + fileStruct);
                return 16387;
            }
            File childFile = currentReadFile.getChildFile(fileStruct.getCluster());
            if (childFile == null) {
                childFile = new Folder(currentReadFile, fileStruct);
            }
            if (childFile.isFile()) {
                JL_Log.m27887w(f37787v, "appenBrowse", "Target is not folder. " + fileStruct);
                return 4097;
            }
            Folder folder = (Folder) childFile;
            if (folder.getLevel() > MAX_FOLDER_LEVEL) {
                JL_Log.m27887w(f37787v, "appenBrowse", "Folders are too deep. limit level = " + MAX_FOLDER_LEVEL);
                return 16388;
            }
            if (isReading()) {
                JL_Log.m27887w(f37787v, "appenBrowse", "Reading file data.");
                return 16385;
            }
            String str = f37787v;
            JL_Log.m27877d(str, "appenBrowse", "" + folder);
            this.f37796e.put(m27295a(sDCardBean), folder);
            iListFiles = listFiles(folder, 1);
            if (iListFiles != 0) {
                this.f37796e.put(m27295a(sDCardBean), currentReadFile);
                JL_Log.m27883i(str, "appenBrowse", "result = " + iListFiles + ", target = " + folder + ",\n cacheFolder = " + currentReadFile);
            }
        }
        return iListFiles;
    }

    public int backBrowse(SDCardBean sDCardBean) {
        return backBrowse(sDCardBean, true);
    }

    public void cleanCache() {
        JL_Log.m27883i(f37787v, "cleanCache", "clear all");
        Iterator<SDCardBean> it = this.f37798g.iterator();
        while (it.hasNext()) {
            cleanCache(it.next());
        }
        this.f37798g.clear();
    }

    public int deleteFile(SDCardBean sDCardBean, List<FileStruct> list, DeleteCallback deleteCallback) {
        return deleteFile(sDCardBean, list, true, deleteCallback);
    }

    public int formatDevice(final SDCardBean sDCardBean, final OperatCallback operatCallback) {
        if (sDCardBean == null) {
            return 4097;
        }
        if (m27306b(sDCardBean)) {
            return 16384;
        }
        if (isReading()) {
            return 16385;
        }
        m27301a(true);
        this.f37792a.formatDevice(sDCardBean.getDevHandler(), new OperatCallback() { // from class: com.jieli.jl_filebrowse.FileBrowseManager.2
            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onError(int i) {
                FileBrowseManager.this.m27307c();
                OperatCallback operatCallback2 = operatCallback;
                if (operatCallback2 != null) {
                    operatCallback2.onError(i);
                }
            }

            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onSuccess() {
                FileBrowseManager.this.cleanCache(sDCardBean);
                FileBrowseManager.this.m27307c();
                OperatCallback operatCallback2 = operatCallback;
                if (operatCallback2 != null) {
                    operatCallback2.onSuccess();
                }
            }
        });
        return 0;
    }

    public List<FileStruct> getCurrentFileStructs(SDCardBean sDCardBean) {
        Folder currentReadFile = getCurrentReadFile(sDCardBean);
        return currentReadFile == null ? new ArrayList() : currentReadFile.getChildFileStructs();
    }

    public Folder getCurrentReadFile(SDCardBean sDCardBean) {
        if (m27306b(sDCardBean)) {
            return null;
        }
        return this.f37796e.get(m27295a(sDCardBean));
    }

    public List<SDCardBean> getOnlineDev() {
        ArrayList arrayList = new ArrayList();
        for (SDCardBean sDCardBean : getSdCardBeans()) {
            if (sDCardBean.isOnline()) {
                arrayList.add(sDCardBean);
            }
        }
        return arrayList;
    }

    public SDCardBean getOnlineStorage(FileStruct fileStruct) {
        if (fileStruct == null) {
            return null;
        }
        return m27292a(fileStruct.getDevIndex());
    }

    public int getPageSize() {
        return this.f37799h;
    }

    public List<SDCardBean> getSdCardBeans() {
        return new ArrayList(this.f37798g);
    }

    public void init(RcspOpImpl rcspOpImpl) {
        if (this.f37805n) {
            throw new RuntimeException("It cannot be initialize morn than once!");
        }
        this.f37800i = rcspOpImpl;
        setLrcReadOperator(new LrcReadOperatorImpl(rcspOpImpl));
        setFileBrowseOperator(new FileBrowseOperatorImpl(rcspOpImpl));
        OnFileBrowseCallbackImpl onFileBrowseCallbackImpl = new OnFileBrowseCallbackImpl(rcspOpImpl, this, this);
        this.f37806o = onFileBrowseCallbackImpl;
        rcspOpImpl.registerOnRcspCallback(onFileBrowseCallbackImpl);
        this.f37805n = true;
    }

    public boolean isInit() {
        return this.f37805n;
    }

    public boolean isOnline(int i) {
        for (SDCardBean sDCardBean : getSdCardBeans()) {
            if (sDCardBean.getIndex() == i) {
                return sDCardBean.isOnline();
            }
        }
        return false;
    }

    public boolean isOpenLrcCache() {
        return this.f37812u;
    }

    public boolean isReading() {
        return this.f37801j;
    }

    public int listFiles(Folder folder, int i) {
        return listFiles(folder, i, true);
    }

    public int loadMore(SDCardBean sDCardBean) {
        if (m27306b(sDCardBean)) {
            return 16384;
        }
        Folder currentReadFile = getCurrentReadFile(sDCardBean);
        if (currentReadFile == null) {
            return 16387;
        }
        if (currentReadFile.isLoadFinished(false)) {
            return 16386;
        }
        int childCount = currentReadFile.getChildCount() + 1;
        JL_Log.m27877d(f37787v, "loadMore", currentReadFile + ", offset = " + childCount);
        return listFiles(currentReadFile, childCount);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onBluetoothConnectionChange(BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice == null) {
            return;
        }
        JL_Log.m27883i(f37787v, "onBluetoothConnectionChange", "device : " + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", status : " + i);
        if (i == 0) {
            cleanCache(bluetoothDevice);
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileDataReceive(byte[] bArr) {
        if (isReading()) {
            try {
                String str = f37787v;
                StringBuilder sb = new StringBuilder();
                sb.append("data size = ");
                sb.append(bArr == null ? 0 : bArr.length);
                JL_Log.m27877d(str, "onFileDataReceive", sb.toString());
                m27304b(0);
                this.f37797f.write(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadFailed(int i) {
        if (isReading()) {
            final PathData pathData = this.f37803l;
            final SDCardBean sDCardBean = this.f37802k;
            JL_Log.m27883i(f37787v, "onFileReadFailed", "reason : " + i + "+ " + pathData);
            if (i == 3 && pathData != null && pathData.getRepeatTimes() > 0) {
                this.f37807p.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X1I0iXXX
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4255IO.m27298a(pathData, sDCardBean);
                    }
                }, 500L);
            } else {
                m27307c();
                this.f37794c.onFileReadFailed(i);
            }
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadStart() {
        this.f37794c.onFileReadStart();
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadStop(boolean z) {
        if (isReading()) {
            SDCardBean sDCardBean = this.f37802k;
            PathData pathData = this.f37803l;
            byte[] byteArray = this.f37797f.toByteArray();
            String str = f37787v;
            JL_Log.m27877d(str, "onFileReadStop", "isEnd = " + z + ", storage = " + sDCardBean + ", data size = " + byteArray.length);
            List<FileStruct> dataHasPacket = this.f37792a.dataHasPacket() ? FileBrowseUtil.parseDataHasPacket(byteArray) : FileBrowseUtil.parseData(byteArray);
            this.f37797f.reset();
            Folder currentReadFile = getCurrentReadFile(sDCardBean);
            if (currentReadFile == null) {
                JL_Log.m27880e(str, "onFileReadStop", "not found read folder. " + sDCardBean);
                m27307c();
                this.f37794c.onFileReadFailed(16387);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (FileStruct fileStruct : dataHasPacket) {
                if (fileStruct != null) {
                    JL_Log.m27877d(f37787v, "onFileReadStop", "" + fileStruct);
                    arrayList.add(fileStruct.isFile() ? new RegFile(currentReadFile, fileStruct) : new Folder(currentReadFile, fileStruct));
                }
            }
            if (!arrayList.isEmpty() && arrayList.get(0).getDevIndex() != currentReadFile.getDevIndex()) {
                JL_Log.m27887w(f37787v, "onFileReadStop", "File data does not match.");
                m27305b(pathData, sDCardBean);
                return;
            }
            if (!z && dataHasPacket.isEmpty()) {
                z = true;
            }
            currentReadFile.addChild(arrayList);
            currentReadFile.setLoadFinished(z);
            m27307c();
            this.f37794c.onFileReceiver(dataHasPacket);
            this.f37794c.onFileReadStop(z);
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileStructureChange(FileChangeInfo fileChangeInfo) {
        List<SDCardBean> onlineDev;
        SDCardBean next;
        Folder currentReadFile;
        Folder parent;
        if (fileChangeInfo == null || (onlineDev = getOnlineDev()) == null || onlineDev.isEmpty()) {
            return;
        }
        Iterator<SDCardBean> it = onlineDev.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getDevHandler() != fileChangeInfo.getDevHandle());
        if (next == null || next.getDevHandler() != fileChangeInfo.getDevHandle() || (currentReadFile = getCurrentReadFile(next)) == null) {
            return;
        }
        do {
            parent = currentReadFile.getParent();
            if (parent != null) {
                currentReadFile = parent;
            }
        } while (parent != null);
        String str = f37787v;
        JL_Log.m27877d(str, "onFileStructureChange", currentReadFile + ",\n " + fileChangeInfo);
        Folder folderM27291a = m27291a(currentReadFile, fileChangeInfo.getFilePath());
        JL_Log.m27877d(str, "onFileStructureChange", "op = " + fileChangeInfo.getOp() + ", targetFolder = " + folderM27291a);
        if (folderM27291a == null) {
            return;
        }
        int op = fileChangeInfo.getOp();
        if (op == 1) {
            folderM27291a.removeChild(fileChangeInfo.getCluster());
        } else {
            if (op != 2) {
                return;
            }
            folderM27291a.setLoadFinished(false);
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcDataReceive(byte[] bArr) throws Throwable {
        byte[] bArr2 = this.f37808q;
        if (bArr2 != null) {
            int i = this.f37809r;
            if (bArr.length + i > bArr2.length) {
                byte[] bArr3 = new byte[bArr2.length * 2];
                System.arraycopy(bArr2, 0, bArr3, 0, i);
                this.f37808q = bArr3;
            }
            String str = f37787v;
            StringBuilder sb = new StringBuilder();
            sb.append("lrcBuffer ---> ");
            byte[] bArr4 = this.f37808q;
            sb.append(CHexConver.byte2HexStr(bArr4, bArr4.length));
            JL_Log.m27877d(str, "onLrcDataReceive", sb.toString());
            System.arraycopy(bArr, 3, this.f37808q, this.f37809r, bArr.length - 3);
            this.f37809r += bArr.length - 3;
            if ((bArr[0] & 255) == 255) {
                onLrcReadStop();
            }
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadFailed(int i) {
        JL_Log.m27877d(f37787v, "onLrcReadFailed", "reason : " + i);
        this.f37809r = 0;
        this.f37808q = null;
        this.f37795d.onLrcReadFailed(i);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadStart() {
        this.f37809r = 0;
        this.f37808q = new byte[f37790y];
        this.f37795d.onLrcReadStart();
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadStop() throws Throwable {
        int i;
        String str;
        Throwable th;
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f37808q;
        if (bArr == null || (i = this.f37809r) < 5) {
            onLrcReadFailed(-1);
            return;
        }
        byte[] bytes = new byte[i];
        System.arraycopy(bArr, 0, bytes, 0, i);
        LrcDecoder lrcDecoder = this.f37811t;
        if (lrcDecoder != null) {
            bytes = lrcDecoder.decode(bytes);
        }
        byte b = bytes[0];
        if (b == -1) {
            str = "utf_16le";
        } else if (b == -2 && bytes[1] == -1) {
            str = "utf_16be";
        } else {
            str = (b == -17 && bytes[1] == -69 && bytes[2] == -65) ? "utf-8" : "gbk";
        }
        try {
            bytes = new String(bytes, str).getBytes(StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            fileOutputStream = new FileOutputStream(m27294a(this.f37804m, this.f37810s));
            try {
                try {
                    fileOutputStream.write(bytes);
                    this.f37809r = 0;
                    this.f37808q = null;
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    m27299a(m27294a(this.f37804m, this.f37810s));
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    onLrcReadFailed(16389);
                    this.f37809r = 0;
                    this.f37808q = null;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                this.f37809r = 0;
                this.f37808q = null;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            this.f37809r = 0;
            this.f37808q = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onSdCardChange(List<SDCardBean> list) {
        SDCardBean sDCardBean = this.f37802k;
        this.f37798g.clear();
        this.f37798g.addAll(list);
        for (SDCardBean sDCardBean2 : list) {
            if (!sDCardBean2.isOnline()) {
                cleanCache(sDCardBean2);
                if (sDCardBean2.equals(sDCardBean)) {
                    this.f37807p.removeCallbacksAndMessages(null);
                    if (isReading()) {
                        onFileReadFailed(16384);
                    }
                }
            } else if (getCurrentReadFile(sDCardBean2) == null) {
                this.f37796e.put(m27295a(sDCardBean2), File.createRootFolder(sDCardBean2.getIndex()));
            }
        }
        this.f37794c.onSdCardStatusChange(getOnlineDev());
    }

    public int playFile(FileStruct fileStruct, SDCardBean sDCardBean) {
        if (fileStruct != null && sDCardBean != null) {
            if (m27306b(sDCardBean)) {
                return 16384;
            }
            Folder currentReadFile = getCurrentReadFile(sDCardBean);
            if (currentReadFile == null) {
                return 16387;
            }
            File childFile = currentReadFile.getChildFile(fileStruct.getCluster());
            if (childFile != null && !childFile.isFolder()) {
                return playFile((RegFile) childFile);
            }
        }
        return 4097;
    }

    public void release() {
        JL_Log.m27883i(f37787v, "release", "");
        this.f37805n = false;
        if (this.f37800i != null) {
            this.f37800i.unregisterOnRcspCallback(this.f37806o);
        }
        m27307c();
        cleanCache();
        this.f37794c.release();
        this.f37795d.release();
        this.f37796e.clear();
        f37789x = null;
    }

    public void removeFileObserver(FileObserver fileObserver) {
        this.f37794c.unregisterCallback(fileObserver);
    }

    public void removeLrcReadObserver(LrcReadObserver lrcReadObserver) {
        this.f37795d.unregisterCallback(lrcReadObserver);
    }

    public void setFileBrowseOperator(FileBrowseOperator fileBrowseOperator) {
        this.f37792a = fileBrowseOperator;
    }

    public void setLrcDecoder(LrcDecoder lrcDecoder) {
        this.f37811t = lrcDecoder;
    }

    public void setLrcReadOperator(LrcReadOperator lrcReadOperator) {
        this.f37793b = lrcReadOperator;
    }

    public void setOpenLrcCache(boolean z) {
        this.f37812u = z;
    }

    public void setPageSize(int i) {
        this.f37799h = i;
    }

    public void startLrcRead(Context context, FileStruct fileStruct) {
        if (this.f37793b != null) {
            java.io.File file = new java.io.File(m27294a(context, fileStruct));
            JL_Log.m27877d(f37787v, "startLrcRead", "path : " + file.getPath());
            if (file.exists()) {
                if (isOpenLrcCache()) {
                    m27299a(file.getPath());
                    return;
                }
                file.delete();
            }
            this.f37804m = context;
            this.f37810s = fileStruct;
            this.f37793b.startLrcRead(new OperatCallback() { // from class: com.jieli.jl_filebrowse.FileBrowseManager.5
                @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
                public void onError(int i) {
                    FileBrowseManager.this.onLrcReadFailed(i);
                }

                @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
                public void onSuccess() {
                    FileBrowseManager.this.onLrcReadStart();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m27306b(SDCardBean sDCardBean) {
        if (sDCardBean == null) {
            return true;
        }
        return !isOnline(sDCardBean.getIndex());
    }

    public int backBrowse(SDCardBean sDCardBean, boolean z) {
        if (sDCardBean == null) {
            return 4097;
        }
        if (m27306b(sDCardBean)) {
            return 16384;
        }
        Folder currentReadFile = getCurrentReadFile(sDCardBean);
        if (currentReadFile == null) {
            return 16387;
        }
        if (isReading()) {
            JL_Log.m27887w(f37787v, "backBrowse", "Reading file data.");
            return 16385;
        }
        Folder parent = currentReadFile.getParent();
        if (parent == null) {
            parent = currentReadFile;
        }
        String str = f37787v;
        JL_Log.m27877d(str, "backBrowse", "" + parent);
        this.f37796e.put(m27295a(sDCardBean), parent);
        int iListFiles = listFiles(parent, 1, z);
        if (iListFiles != 0) {
            this.f37796e.put(m27295a(sDCardBean), currentReadFile);
            JL_Log.m27877d(str, "backBrowse", "result = " + iListFiles + ", target = " + parent + ",\n currentFolder = " + currentReadFile);
        }
        return iListFiles;
    }

    /* JADX INFO: renamed from: c */
    public final void m27307c() {
        m27301a(false);
        this.f37797f.reset();
        m27303b();
        this.f37807p.removeCallbacksAndMessages(null);
        this.f37802k = null;
        this.f37803l = null;
    }

    public int deleteFile(SDCardBean sDCardBean, List<FileStruct> list, boolean z, DeleteCallback deleteCallback) {
        if (sDCardBean == null || list == null || list.isEmpty()) {
            return 4097;
        }
        if (m27306b(sDCardBean)) {
            return 16384;
        }
        if (isReading()) {
            return 16385;
        }
        return m27289a(sDCardBean, new ArrayList(list), z, deleteCallback);
    }

    public int listFiles(Folder folder, int i, boolean z) {
        if (folder == null) {
            return 4097;
        }
        SDCardBean onlineStorage = getOnlineStorage(folder);
        if (onlineStorage == null || m27306b(onlineStorage)) {
            JL_Log.m27887w(f37787v, "listFiles", RcspUtil.formatString("Storage[%s] is offline.", onlineStorage));
            return 16384;
        }
        if (onlineStorage.getDevice() == null) {
            JL_Log.m27887w(f37787v, "listFiles", "Wrong parameters.");
            return 4097;
        }
        if (isReading()) {
            JL_Log.m27887w(f37787v, "listFiles", "Reading file data.");
            return 16385;
        }
        final List<FileStruct> listM27296a = m27296a(folder, i);
        int size = listM27296a.size();
        String str = f37787v;
        JL_Log.m27877d(str, "listFiles", folder + ", offset = " + i + ", cacheFiles size = " + size);
        if (size > 0) {
            if (z) {
                JL_Log.m27877d(str, "listFiles", "callback cache file list.");
                final boolean zM27302a = m27302a(folder, listM27296a.get(size - 1));
                this.f37807p.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1X0O1iI
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2777IO.m27300a(listM27296a, zM27302a);
                    }
                }, 300L);
            }
            return 0;
        }
        PathData pathDataConvertPathData = folder.convertPathData(onlineStorage, (short) i, this.f37799h);
        if (pathDataConvertPathData == null) {
            JL_Log.m27887w(str, "listFiles", "File is not in storage.");
            return 16390;
        }
        m27301a(true);
        m27305b(pathDataConvertPathData, onlineStorage);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m27304b(int i) {
        m27303b();
        Handler handler = this.f37807p;
        handler.sendMessageDelayed(handler.obtainMessage(4112, i, 0), WAITING_CMD_TIMEOUT);
    }

    /* JADX INFO: renamed from: b */
    public final void m27303b() {
        this.f37807p.removeMessages(4112);
    }

    public void cleanCache(BluetoothDevice bluetoothDevice) {
        Folder value;
        if (bluetoothDevice == null) {
            return;
        }
        JL_Log.m27883i(f37787v, "cleanCache", "device : " + bluetoothDevice);
        for (Map.Entry<String, Folder> entry : this.f37796e.entrySet()) {
            if (entry.getKey().endsWith(bluetoothDevice.getAddress()) && (value = entry.getValue()) != null) {
                entry.setValue(m27290a(value));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27300a(List list, boolean z) {
        this.f37794c.onFileReceiver(list);
        this.f37794c.onFileReadStop(z);
    }

    /* JADX INFO: renamed from: b */
    public final void m27305b(final PathData pathData, final SDCardBean sDCardBean) {
        if (pathData == null || sDCardBean == null) {
            return;
        }
        this.f37802k = sDCardBean;
        this.f37803l = pathData;
        JL_Log.m27877d(f37787v, "sendPathDataToDevice", pathData + ",\n" + sDCardBean);
        this.f37792a.sendPathDataCmd(pathData, FileBrowseUtil.coverPathDataToCmd(pathData), new OperatCallback() { // from class: com.jieli.jl_filebrowse.FileBrowseManager.4
            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onError(int i) {
                JL_Log.m27877d(FileBrowseManager.f37787v, "sendPathDataToDevice", "onError :: code = " + i + ", data = " + pathData + ", " + sDCardBean);
                if (pathData.getType() == 0) {
                    FileBrowseManager.this.onFileReadFailed(i);
                } else {
                    FileBrowseManager.this.OnFlayCallback(false);
                }
            }

            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onSuccess() {
                FileBrowseManager.this.m27304b(pathData.getType());
                if (pathData.getType() != 0) {
                    JL_Log.m27877d(FileBrowseManager.f37787v, "sendPathDataToDevice", "Ready to play music.");
                } else {
                    JL_Log.m27877d(FileBrowseManager.f37787v, "sendPathDataToDevice", "Ready to receive file data.");
                    FileBrowseManager.this.onFileReadStart();
                }
            }
        });
    }

    public int deleteFile(List<FileStruct> list, boolean z, DeleteCallback deleteCallback) {
        if (list == null || list.isEmpty()) {
            return 4097;
        }
        return deleteFile(getOnlineStorage(list.get(0)), new ArrayList(list), z, deleteCallback);
    }

    public int playFile(RegFile regFile) {
        if (regFile == null) {
            return 4097;
        }
        SDCardBean onlineStorage = getOnlineStorage(regFile);
        if (onlineStorage == null || m27306b(onlineStorage)) {
            return 16384;
        }
        if (isReading()) {
            return 16385;
        }
        JL_Log.m27877d(f37787v, "playFile", "" + regFile);
        m27301a(true);
        m27305b(regFile.convertPathData(onlineStorage, (short) 1, this.f37799h), onlineStorage);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27298a(PathData pathData, SDCardBean sDCardBean) {
        pathData.setRepeatTimes(pathData.getRepeatTimes() - 1);
        m27305b(pathData, sDCardBean);
    }

    /* JADX INFO: renamed from: a */
    public final void m27301a(boolean z) {
        this.f37801j = z;
    }

    /* JADX INFO: renamed from: a */
    public final SDCardBean m27292a(int i) {
        for (SDCardBean sDCardBean : getSdCardBeans()) {
            if (i == sDCardBean.getIndex() && sDCardBean.isOnline()) {
                return sDCardBean;
            }
        }
        return null;
    }

    public void cleanCache(SDCardBean sDCardBean) {
        String strM27295a;
        Folder folder;
        if (sDCardBean == null || (folder = this.f37796e.get((strM27295a = m27295a(sDCardBean)))) == null) {
            return;
        }
        JL_Log.m27883i(f37787v, "cleanCache", sDCardBean + ",\n " + folder);
        this.f37796e.put(strM27295a, m27290a(folder));
    }

    /* JADX INFO: renamed from: a */
    public final int m27289a(final SDCardBean sDCardBean, final List<FileStruct> list, final boolean z, final DeleteCallback deleteCallback) {
        if (sDCardBean == null || list == null) {
            return 4097;
        }
        if (list.isEmpty()) {
            return 0;
        }
        boolean z2 = list.size() == 1;
        final FileStruct fileStructRemove = list.remove(list.size() - 1);
        m27301a(true);
        final boolean z3 = z2;
        this.f37792a.deleteFile(sDCardBean.getDevHandler(), fileStructRemove.isFile() ? (byte) 1 : (byte) 0, fileStructRemove.getCluster(), z2, z, new OperatCallback() { // from class: com.jieli.jl_filebrowse.FileBrowseManager.3
            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onError(int i) {
                FileBrowseManager.this.m27307c();
                DeleteCallback deleteCallback2 = deleteCallback;
                if (deleteCallback2 != null) {
                    deleteCallback2.onError(i, fileStructRemove);
                }
                if (!z3) {
                    FileBrowseManager.this.m27289a(sDCardBean, list, z, deleteCallback);
                    return;
                }
                DeleteCallback deleteCallback3 = deleteCallback;
                if (deleteCallback3 != null) {
                    deleteCallback3.onFinish();
                }
            }

            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onSuccess() {
                FileBrowseManager.this.m27297a(fileStructRemove);
                FileBrowseManager.this.m27307c();
                DeleteCallback deleteCallback2 = deleteCallback;
                if (deleteCallback2 != null) {
                    deleteCallback2.onSuccess(fileStructRemove);
                }
                if (!z3) {
                    FileBrowseManager.this.m27289a(sDCardBean, list, z, deleteCallback);
                    return;
                }
                DeleteCallback deleteCallback3 = deleteCallback;
                if (deleteCallback3 != null) {
                    deleteCallback3.onFinish();
                }
            }
        });
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final String m27295a(SDCardBean sDCardBean) {
        if (sDCardBean == null) {
            return "";
        }
        BluetoothDevice device = sDCardBean.getDevice();
        if (device == null) {
            return String.valueOf(sDCardBean.getIndex());
        }
        return sDCardBean.getIndex() + HelpFormatter.DEFAULT_OPT_PREFIX + device.getAddress();
    }

    public int appenBrowse(Folder folder) {
        if (folder == null) {
            return 4097;
        }
        SDCardBean sDCardBeanM27292a = m27292a(folder.getDevIndex());
        if (sDCardBeanM27292a == null || m27306b(sDCardBeanM27292a)) {
            return 16384;
        }
        return appenBrowse(folder.getFileStruct(), sDCardBeanM27292a);
    }

    /* JADX INFO: renamed from: a */
    public final List<FileStruct> m27296a(Folder folder, int i) {
        SDCardBean onlineStorage = getOnlineStorage(folder);
        if (onlineStorage == null) {
            return new ArrayList();
        }
        Folder currentReadFile = getCurrentReadFile(onlineStorage);
        if (currentReadFile == null) {
            return new ArrayList();
        }
        int childCount = currentReadFile.getChildCount();
        boolean zIsLoadFinished = currentReadFile.isLoadFinished(false);
        JL_Log.m27877d(f37787v, "readCacheFiles", childCount + ", offset = " + i + ", isLoadFinished = " + zIsLoadFinished);
        if (zIsLoadFinished && childCount >= i) {
            int i2 = i - 1;
            return currentReadFile.getChildFileStructs().subList(i2, childCount + i2);
        }
        if (childCount < (this.f37799h + i) - 1) {
            return new ArrayList();
        }
        int i3 = i - 1;
        return currentReadFile.getChildFileStructs().subList(i3, this.f37799h + i3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27302a(Folder folder, FileStruct fileStruct) {
        SDCardBean onlineStorage;
        Folder currentReadFile;
        if (folder == null || fileStruct == null || (onlineStorage = getOnlineStorage(folder)) == null || (currentReadFile = getCurrentReadFile(onlineStorage)) == null) {
            return false;
        }
        return currentReadFile.isEndElement(fileStruct);
    }

    /* JADX INFO: renamed from: a */
    public final void m27297a(FileStruct fileStruct) {
        SDCardBean sDCardBeanM27292a;
        Folder currentReadFile;
        if (fileStruct == null || (sDCardBeanM27292a = m27292a(fileStruct.getDevIndex())) == null || (currentReadFile = getCurrentReadFile(sDCardBeanM27292a)) == null) {
            return;
        }
        for (currentReadFile = getCurrentReadFile(sDCardBeanM27292a); currentReadFile != null && !currentReadFile.removeChild(fileStruct.getCluster()); currentReadFile = currentReadFile.getParent()) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final Folder m27290a(Folder folder) {
        if (folder == null) {
            return null;
        }
        folder.clean();
        Folder parent = folder.getParent();
        while (true) {
            Folder folder2 = parent;
            Folder folder3 = folder;
            folder = folder2;
            if (folder != null) {
                folder.clean();
                parent = folder.getParent();
            } else {
                folder3.clean();
                return folder3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Folder m27291a(Folder folder, String str) {
        if (folder == null || str == null || str.isEmpty()) {
            return null;
        }
        String str2 = java.io.File.separator;
        int iLastIndexOf = str.lastIndexOf(str2);
        if (iLastIndexOf != -1 && !str2.equals(str)) {
            int i = 0;
            String strSubstring = str.substring(0, iLastIndexOf);
            String[] strArrSplit = strSubstring.split(str2);
            if (strArrSplit.length == 0) {
                strArrSplit = new String[]{strSubstring};
            }
            int length = strArrSplit.length;
            while (i < length) {
                Folder folderFindFolderByName = folder.findFolderByName(strArrSplit[i]);
                if (folderFindFolderByName == null) {
                    break;
                }
                i++;
                folder = folderFindFolderByName;
            }
        }
        return folder;
    }

    /* JADX INFO: renamed from: a */
    public final void m27299a(String str) {
        this.f37795d.onLrcReadStop(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m27294a(Context context, FileStruct fileStruct) {
        if (fileStruct == null) {
            return "lrc_Default";
        }
        return m27293a(context) + java.io.File.separator + fileStruct.getName() + fileStruct.getCluster();
    }

    /* JADX INFO: renamed from: a */
    public final String m27293a(Context context) {
        if (context == null) {
            return "";
        }
        if (TextUtils.isEmpty(f37791z)) {
            String path = context.getFilesDir().getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(path);
            String str = java.io.File.separator;
            sb.append(str);
            sb.append(context.getPackageName());
            sb.append(str);
            sb.append("lrcCache");
            f37791z = sb.toString();
        }
        java.io.File file = new java.io.File(f37791z);
        if (!file.exists() && !file.mkdirs()) {
            JL_Log.m27887w(f37787v, "getLrcCachePath", "can not create lrc cache path");
            return "";
        }
        return file.getPath();
    }
}
