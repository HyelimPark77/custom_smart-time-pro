package com.jieli.jl_fatfs;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ironsource.C12616d4;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.IBluetoothCtrl;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.interfaces.OnFatFsInitListener;
import com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.model.FatOpParam;
import com.jieli.jl_fatfs.model.FatWriteOp;
import com.jieli.jl_fatfs.model.FileExtMsg;
import com.jieli.jl_fatfs.tool.PackResFormat;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class FatFileSystem {

    /* JADX INFO: renamed from: u */
    public static final String f37757u = "FatFileSystem";

    /* JADX INFO: renamed from: v */
    public static final String[] f37758v;

    /* JADX INFO: renamed from: a */
    public volatile boolean f37759a;

    /* JADX INFO: renamed from: b */
    public volatile long f37760b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f37761c;

    /* JADX INFO: renamed from: d */
    public final IBluetoothCtrl f37762d;

    /* JADX INFO: renamed from: e */
    public final Handler f37763e;

    /* JADX INFO: renamed from: f */
    public final Map<String, ArrayList<FatFile>> f37764f;

    /* JADX INFO: renamed from: g */
    public String f37765g;

    /* JADX INFO: renamed from: h */
    public byte[] f37766h;

    /* JADX INFO: renamed from: i */
    public int f37767i;

    /* JADX INFO: renamed from: j */
    public short f37768j;

    /* JADX INFO: renamed from: k */
    public int f37769k;

    /* JADX INFO: renamed from: l */
    public byte[] f37770l;

    /* JADX INFO: renamed from: m */
    public int f37771m;

    /* JADX INFO: renamed from: n */
    public byte[] f37772n;

    /* JADX INFO: renamed from: o */
    public int f37773o;

    /* JADX INFO: renamed from: p */
    public final OnFatFsInitListener f37774p;

    /* JADX INFO: renamed from: q */
    public FatOpParam f37775q;

    /* JADX INFO: renamed from: r */
    public PackResFormat f37776r;

    /* JADX INFO: renamed from: s */
    public Gson f37777s;

    /* JADX INFO: renamed from: t */
    public final String[] f37778t;

    static {
        try {
            System.loadLibrary("jl_fatfs");
        } catch (Exception e) {
            e.printStackTrace();
        }
        f37758v = new String[]{BleDeviceInfo.PLATFORM_JL, "FONT", "SIDEBAR"};
    }

    public FatFileSystem(int i, int i2, final int i3, String[] strArr, IBluetoothCtrl iBluetoothCtrl, OnFatFsInitListener onFatFsInitListener, OnFatFileProgressListener onFatFileProgressListener) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f37761c = executorServiceNewSingleThreadExecutor;
        this.f37763e = new Handler(Looper.getMainLooper());
        this.f37764f = new HashMap();
        this.f37765g = "/";
        this.f37766h = null;
        this.f37767i = 0;
        this.f37768j = (short) 0;
        this.f37772n = null;
        this.f37773o = 0;
        this.f37778t = strArr;
        this.f37762d = iBluetoothCtrl;
        this.f37774p = onFatFsInitListener;
        if (iBluetoothCtrl == null) {
            throw new RuntimeException("IBluetoothCtrl cannot be null.");
        }
        this.f37760b = libInit(i > i2 ? i2 : i, i2);
        if (this.f37760b == 0) {
            throw new RuntimeException("init lib failed.");
        }
        m27257a(false);
        updateSysStatus(this.f37760b, i3);
        if (i3 != 0 && onFatFileProgressListener != null) {
            this.f37775q = new FatOpParam().setOp(255).setFilePath("/").setTotalSize(8192L).setProgressListener(onFatFileProgressListener);
        }
        executorServiceNewSingleThreadExecutor.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIXOXX11
            @Override // java.lang.Runnable
            public final void run() {
                this.f1655IO.m27275g(i3);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27246a(OnFatFsOpResultListener onFatFsOpResultListener, int i) {
        if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(Integer.valueOf(i));
        }
    }

    public static boolean isIgnoreFile(String str) {
        String[] strArr;
        if (str != null && (strArr = f37758v) != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m27263b(final OnFatFsOpResultListener onFatFsOpResultListener) {
        final int iMountDevice = mountDevice(this.f37760b);
        if (iMountDevice == 0) {
            JL_Log.m27887w(f37757u, "mount", "FatFs mount ok.");
        }
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O010
            @Override // java.lang.Runnable
            public final void run() {
                FatFileSystem.m27246a(onFatFsOpResultListener, iMountDevice);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m27267c(String str, final OnFatFsOpResultListener onFatFsOpResultListener) {
        final byte[] bArrOpenFile = openFile(str);
        JL_Log.m27887w(f37757u, "openFatFile", "file data : " + CHexConver.byte2HexStr(bArrOpenFile));
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOIX1X
            @Override // java.lang.Runnable
            public final void run() {
                FatFileSystem.m27250b(onFatFsOpResultListener, bArrOpenFile);
            }
        });
    }

    public void callbackProgress(int i) {
        if (this.f37775q != null) {
            m27253a(m27265c(i));
        }
        this.f37767i += i;
        this.f37769k -= i;
        this.f37771m += i;
    }

    public void createFatFile(final String str, final boolean z, final OnFatFileProgressListener onFatFileProgressListener) {
        if (!this.f37759a || this.f37761c.isShutdown()) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(22);
            }
        } else {
            if (this.f37775q == null) {
                this.f37775q = new FatOpParam().setOp(2).setFilePath(str).setProgressListener(onFatFileProgressListener);
                this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIiX1O
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f1697IO.m27258a(z, str, onFatFileProgressListener);
                    }
                });
                return;
            }
            JL_Log.m27887w(f37757u, "createFatFile", "An operation is in progress. " + this.f37775q);
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(4352);
            }
        }
    }

    public native int createNewFile(String str, byte[] bArr);

    public void createReadBuffer(int i) {
        this.f37772n = new byte[i];
        this.f37773o = 0;
    }

    /* JADX INFO: renamed from: d */
    public final long m27268d() {
        return ((long) getFreeSize()) * 4096;
    }

    public void deleteFatFile(String str, OnFatFileProgressListener onFatFileProgressListener) {
        if (!this.f37759a || this.f37761c.isShutdown()) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(22);
            }
        } else {
            if (this.f37775q == null) {
                this.f37775q = new FatOpParam().setOp(3).setFilePath(str).setProgressListener(onFatFileProgressListener).setTotalSize(16384L);
                this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iiIX0IOI
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8589IO.m27274g();
                    }
                });
                return;
            }
            JL_Log.m27887w(f37757u, "deleteFatFile", "An operation is in progress. " + this.f37775q);
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(4352);
            }
        }
    }

    public native int deleteFile(String str);

    public void destroy() {
        JL_Log.m27887w(f37757u, "destroy", "");
        m27278j();
        m27277i();
        if (!this.f37761c.isShutdown()) {
            this.f37761c.shutdownNow();
        }
        this.f37764f.clear();
        PackResFormat packResFormat = this.f37776r;
        if (packResFormat != null) {
            packResFormat.destroy();
            this.f37776r = null;
        }
        this.f37762d.release();
        libDestroy(this.f37760b);
        this.f37760b = 0L;
        this.f37777s = null;
        m27257a(false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m27270e() {
        OnFatFsInitListener onFatFsInitListener = this.f37774p;
        if (onFatFsInitListener != null) {
            onFatFsInitListener.onInitOk();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m27272f() {
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam == null || fatOpParam.getProgressListener() == null) {
            return;
        }
        this.f37775q.getProgressListener().onStart(this.f37775q.getFilePath());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m27275g(int i) {
        m27260b();
        int iInitDiskOp = initDiskOp();
        if (iInitDiskOp != 0) {
            JL_Log.m27880e(f37757u, C12616d4.a.f34169f, "FatFs init error. ret = " + iInitDiskOp);
            m27254a(iInitDiskOp);
            return;
        }
        JL_Log.m27887w(f37757u, C12616d4.a.f34169f, "FatFs init ok.");
        if (i != 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            updateSysStatus(0);
        }
        int iMountDevice = mountDevice(this.f37760b);
        m27257a(iMountDevice == 0);
        if (this.f37759a) {
            JL_Log.m27887w(f37757u, C12616d4.a.f34169f, "FatFs mount ok.");
            m27252a();
            listFatDir("/", null);
            this.f37776r = new PackResFormat();
            this.f37777s = new GsonBuilder().create();
            return;
        }
        JL_Log.m27880e(f37757u, C12616d4.a.f34169f, "FatFs mount failed. res = " + iMountDevice);
        m27254a(iMountDevice);
    }

    public short getCrc16() {
        return this.f37768j;
    }

    public String getCurBrowsePath() {
        return this.f37765g;
    }

    public FatFile getFatFileMsg(String str) {
        FatFile fatFile = null;
        if (str != null && !this.f37764f.isEmpty()) {
            String str2 = f37757u;
            JL_Log.m27877d(str2, "getFatFileMsg", "filePath = " + str);
            int iLastIndexOf = str.lastIndexOf("/");
            if (iLastIndexOf == -1) {
                return null;
            }
            String strSubstring = iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : "/";
            JL_Log.m27877d(str2, "getFatFileMsg", "key = " + strSubstring);
            ArrayList<FatFile> arrayList = this.f37764f.get(strSubstring);
            if (arrayList == null) {
                arrayList = this.f37764f.get(strSubstring + "/");
            }
            if (arrayList != null) {
                for (FatFile fatFile2 : arrayList) {
                    JL_Log.m27877d(f37757u, "getFatFileMsg", "" + fatFile2);
                    if (str.equalsIgnoreCase(fatFile2.getPath())) {
                        fatFile = fatFile2;
                        break;
                    }
                }
            }
            JL_Log.m27877d(f37757u, "getFatFileMsg", "fatFile = " + fatFile);
        }
        return fatFile;
    }

    public void getFatFsFreeSize(final OnFatFsOpResultListener<Long> onFatFsOpResultListener) {
        if (this.f37759a && !this.f37761c.isShutdown()) {
            this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1IiO1I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2728IO.m27255a(onFatFsOpResultListener);
                }
            });
        } else if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(0L);
        }
    }

    public native byte[] getFileHead(String str);

    public void getFileHeadData(final String str, final OnFatFsOpResultListener<byte[]> onFatFsOpResultListener) {
        if (this.f37759a && !this.f37761c.isShutdown()) {
            this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Ii0O0iIXX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2175IO.m27256a(str, onFatFsOpResultListener);
                }
            });
        } else if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(null);
        }
    }

    public int getFlagStatus() {
        return getFlagStatus(this.f37760b);
    }

    public native int getFlagStatus(long j);

    public native int getFreeSize();

    public int getLeftDevSize() {
        return this.f37769k;
    }

    public byte[] getNeedSendLeftData() {
        byte[] bArr = this.f37770l;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i = this.f37771m;
        int i2 = length - i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public byte[] getNeedWriteData() {
        byte[] bArr = this.f37770l;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public byte[] getReadBuffer() {
        byte[] bArr = this.f37772n;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public int getReadLeftSize() {
        byte[] bArr = this.f37772n;
        if (bArr == null) {
            return 0;
        }
        return bArr.length - this.f37773o;
    }

    public int getReadStatus() {
        return getReadStatus(this.f37760b);
    }

    public native int getReadStatus(long j);

    public byte[] getWriteLeftData() {
        byte[] bArr = this.f37766h;
        int length = bArr.length;
        int i = this.f37767i;
        int i2 = length - i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public int getWriteStatus() {
        return getWriteStatus(this.f37760b);
    }

    public native int getWriteStatus(long j);

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m27276h() throws Throwable {
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam == null) {
            m27262b(4097);
            return;
        }
        byte[] fileData = WatchFileUtil.readFileData(fatOpParam.getFilePath());
        if (fileData == null || fileData.length == 0) {
            m27262b(4);
            return;
        }
        if (this.f37762d.getConnectedDevice() == null) {
            m27262b(8192);
            return;
        }
        this.f37775q.setTotalSize(fileData.length + 32768);
        String fatFilePath = FatUtil.getFatFilePath(this.f37765g, this.f37775q.getFilePath());
        if (m27269d(fileData.length)) {
            m27260b();
            int iReplaceFatFile = replaceFatFile(fatFilePath, fileData);
            JL_Log.m27887w(f37757u, "replaceFatFile", "replaceFatFile ---> " + iReplaceFatFile);
            m27262b(iReplaceFatFile);
            return;
        }
        m27260b();
        int iDeleteFile = deleteFile(fatFilePath);
        String str = f37757u;
        JL_Log.m27877d(str, "replaceFatFile", "deleteFile ---> " + iDeleteFile);
        if (iDeleteFile != 0) {
            m27262b(iDeleteFile);
            return;
        }
        int iCreateNewFile = createNewFile(fatFilePath, fileData);
        JL_Log.m27887w(str, "replaceFatFile", "createNewFile ---> " + iCreateNewFile);
        m27262b(iCreateNewFile);
    }

    /* JADX INFO: renamed from: i */
    public final void m27277i() {
        this.f37772n = null;
        this.f37773o = 0;
    }

    public native int initDiskOp();

    public boolean isMatchVersion(String str, byte[] bArr) {
        String jsonFileName = WatchFileUtil.getJsonFileName(str);
        if (this.f37776r != null && jsonFileName != null && bArr != null && bArr.length != 0) {
            String str2 = f37757u;
            JL_Log.m27877d(str2, "isMatchVersion", "filePath = " + str + ", jsonFileName = " + jsonFileName + ", file size = " + bArr.length);
            byte[] fileData = this.f37776r.getFileData(bArr, jsonFileName);
            StringBuilder sb = new StringBuilder();
            sb.append("data = ");
            sb.append(CHexConver.byte2HexStr(fileData));
            sb.append(", text = ");
            sb.append(fileData == null ? "" : new String(fileData));
            JL_Log.m27877d(str2, "isMatchVersion", sb.toString());
            if (fileData == null) {
                return false;
            }
            try {
                FileExtMsg fileExtMsg = (FileExtMsg) m27266c().fromJson(new String(fileData).trim(), FileExtMsg.class);
                JL_Log.m27877d(str2, "isMatchVersion", "fileExtMsg = " + fileExtMsg);
                if (fileExtMsg == null) {
                    return false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("matchVersions = ");
                String[] strArr = this.f37778t;
                sb2.append(strArr == null ? "null" : Arrays.toString(strArr));
                JL_Log.m27877d(str2, "isMatchVersion", sb2.toString());
                String[] strArr2 = this.f37778t;
                if (strArr2 == null || strArr2.length <= 0) {
                    return true;
                }
                for (String str3 : strArr2) {
                    JL_Log.m27877d(f37757u, "isMatchVersion", "version = " + str3);
                    if (str3.equalsIgnoreCase(fileExtMsg.getVersionID())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m27278j() {
        this.f37766h = null;
        this.f37768j = (short) 0;
        this.f37767i = 0;
        this.f37769k = 0;
        this.f37771m = 0;
        this.f37770l = null;
    }

    public boolean judgeWriteFinish(int i) {
        byte[] bArr = this.f37766h;
        return bArr != null && this.f37767i + i >= bArr.length;
    }

    public native void libDestroy(long j);

    public native long libInit(int i, int i2);

    public native ArrayList<FatFile> listDir(String str);

    public void listFatDir(final String str, final OnFatFsOpResultListener<ArrayList<FatFile>> onFatFsOpResultListener) {
        if (this.f37759a && !this.f37761c.isShutdown()) {
            this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iO00I11X
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7972IO.m27264b(str, onFatFsOpResultListener);
                }
            });
        } else if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(null);
        }
    }

    public void mount(final OnFatFsOpResultListener<Integer> onFatFsOpResultListener) {
        if (!this.f37761c.isShutdown()) {
            this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O10XO0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2638IO.m27263b(onFatFsOpResultListener);
                }
            });
        } else if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(8);
        }
    }

    public native int mountDevice(long j);

    public void onReadDataNotify(int i, int i2) {
        IBluetoothCtrl iBluetoothCtrl = this.f37762d;
        iBluetoothCtrl.readFatDataFromDevice(iBluetoothCtrl.getConnectedDevice(), i, i2);
    }

    public void onWriteDataNotify(byte[] bArr, int i) {
        IBluetoothCtrl iBluetoothCtrl = this.f37762d;
        iBluetoothCtrl.writeFatDataToDevice(iBluetoothCtrl.getConnectedDevice(), i, bArr);
    }

    public void onWriteFailed(ArrayList<FatWriteOp> arrayList) {
    }

    public void onWriteFlagNotify(boolean z) {
        IBluetoothCtrl iBluetoothCtrl = this.f37762d;
        iBluetoothCtrl.sendWriteFlag(iBluetoothCtrl.getConnectedDevice(), z);
    }

    public void openFatFile(final String str, final OnFatFsOpResultListener<byte[]> onFatFsOpResultListener) {
        if (this.f37759a && !this.f37761c.isShutdown()) {
            this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Xi0O11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5199IO.m27267c(str, onFatFsOpResultListener);
                }
            });
        } else if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(null);
        }
    }

    public native byte[] openFile(String str);

    public void putDataInReadBuff(byte[] bArr) {
        byte[] bArr2;
        if (bArr != null && bArr.length != 0 && (bArr2 = this.f37772n) != null) {
            int length = bArr.length;
            int i = this.f37773o;
            if (length + i <= bArr2.length) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
                this.f37773o += bArr.length;
                return;
            }
        }
        JL_Log.m27880e(f37757u, "putDataInReadBuff", "readBuffer no enough space.");
    }

    public boolean readBufferIsEmpty() {
        return this.f37772n == null;
    }

    public native int replaceFatFile(String str, byte[] bArr);

    public void replaceFatFile(String str, OnFatFileProgressListener onFatFileProgressListener) {
        if (!this.f37759a || this.f37761c.isShutdown()) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(22);
            }
        } else {
            if (this.f37775q == null) {
                this.f37775q = new FatOpParam().setOp(4).setFilePath(str).setProgressListener(onFatFileProgressListener);
                this.f37761c.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XO1Ii1XI0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f4725IO.m27276h();
                    }
                });
                return;
            }
            JL_Log.m27887w(f37757u, "replaceFatFile", "An operation is in progress. " + this.f37775q);
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(4352);
            }
        }
    }

    public void setNeedWriteData(int i) {
        byte[] bArr = this.f37766h;
        if (bArr != null) {
            int length = bArr.length;
            int i2 = this.f37767i;
            if (length >= i2 + i) {
                this.f37770l = new byte[i];
            } else {
                this.f37770l = new byte[length - i2];
            }
            byte[] bArr2 = this.f37770l;
            System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
            this.f37771m = 0;
        }
        this.f37769k = i;
    }

    public void setWriteBuffer(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f37766h = null;
            this.f37767i = 0;
            return;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        this.f37766h = bArr2;
        short sCRC16 = CryptoUtil.CRC16(bArr2, (short) 0);
        this.f37768j = sCRC16;
        this.f37767i = 0;
        this.f37771m = 0;
        this.f37770l = null;
        JL_Log.m27877d(f37757u, "setWriteBuffer", RcspUtil.formatString("crc16 : %d(0x%X)", Short.valueOf(sCRC16), Short.valueOf(this.f37768j)));
    }

    public native void updateFlagStatus(long j, int i);

    public void updateFlagStatus(boolean z) {
        updateFlagStatus(this.f37760b, z ? 1 : 0);
    }

    public native void updateReadStatus(long j, int i, byte[] bArr);

    public void updateReadStatus(boolean z, byte[] bArr) {
        updateReadStatus(this.f37760b, z ? 1 : 0, bArr);
    }

    public void updateSysStatus(int i) {
        updateSysStatus(this.f37760b, i);
    }

    public native void updateSysStatus(long j, int i);

    public native void updateWriteStatus(long j, int i);

    public void updateWriteStatus(boolean z) {
        if (!z) {
            m27278j();
        }
        updateWriteStatus(this.f37760b, z ? 1 : 0);
    }

    public boolean writeBufferIsEmpty() {
        return this.f37766h == null;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27258a(boolean z, String str, OnFatFileProgressListener onFatFileProgressListener) throws Throwable {
        int iCreateNewFile;
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam == null) {
            m27262b(4097);
            return;
        }
        byte[] fileData = WatchFileUtil.readFileData(fatOpParam.getFilePath());
        if (fileData == null || fileData.length == 0) {
            m27262b(4);
            return;
        }
        if (this.f37762d.getConnectedDevice() == null) {
            m27262b(8192);
            return;
        }
        this.f37775q.setTotalSize(fileData.length + 16384);
        if (!z && !isMatchVersion(this.f37775q.getFilePath(), fileData)) {
            m27262b(16896);
            return;
        }
        String fatFilePath = FatUtil.getFatFilePath(this.f37765g, this.f37775q.getFilePath());
        FatFile fatFileMsg = getFatFileMsg(fatFilePath);
        if (!m27269d(fileData.length)) {
            if (fatFileMsg != null) {
                long jM27268d = m27268d() + fatFileMsg.getSize();
                JL_Log.m27887w(f37757u, "createFatFile", "freeSize = " + jM27268d + ", file data size = " + fileData.length);
                if (jM27268d >= fileData.length) {
                    this.f37775q = null;
                    replaceFatFile(str, onFatFileProgressListener);
                    return;
                }
            }
            m27262b(20);
            return;
        }
        m27260b();
        if (fatFileMsg != null) {
            iCreateNewFile = deleteFile(fatFilePath);
            JL_Log.m27887w(f37757u, "createFatFile", "deleteFile ---> " + iCreateNewFile + ", fatFilePath = " + fatFilePath);
        } else {
            iCreateNewFile = 0;
        }
        if (iCreateNewFile == 0 || iCreateNewFile == 4 || iCreateNewFile == 5) {
            iCreateNewFile = createNewFile(fatFilePath, fileData);
        }
        JL_Log.m27887w(f37757u, "createFatFile", "createNewFile ---> " + iCreateNewFile);
        m27262b(iCreateNewFile);
        if (iCreateNewFile == 0) {
            listFatDir("/", null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27269d(int i) {
        long jM27268d = m27268d();
        JL_Log.m27877d(f37757u, "hasEnoughSpace", "fatFsFreeSize = " + jM27268d + ", dataLen = " + i);
        return jM27268d - ((long) i) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m27271e(int i) {
        OnFatFsInitListener onFatFsInitListener = this.f37774p;
        if (onFatFsInitListener != null) {
            onFatFsInitListener.onInitFailed(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m27250b(OnFatFsOpResultListener onFatFsOpResultListener, byte[] bArr) {
        if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(bArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m27265c(int i) {
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam == null || fatOpParam.getTotalSize() == 0) {
            return 0.0f;
        }
        int sumFileDataLen = this.f37775q.getSumFileDataLen() + i;
        this.f37775q.setSumFileDataLen(sumFileDataLen);
        float totalSize = (sumFileDataLen * 100.0f) / this.f37775q.getTotalSize();
        if (totalSize > 100.0f) {
            return 100.0f;
        }
        return totalSize;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m27273f(int i) {
        JL_Log.m27883i(f37757u, "callbackStop", "result : " + i + ", " + this.f37775q);
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam != null) {
            OnFatFileProgressListener progressListener = fatOpParam.getProgressListener();
            m27278j();
            this.f37775q = null;
            if (progressListener != null) {
                progressListener.onStop(WatchError.fatfsToWatchErr(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m27264b(String str, final OnFatFsOpResultListener onFatFsOpResultListener) {
        ArrayList<FatFile> arrayListListDir = listDir(str);
        if (arrayListListDir != null) {
            if (!this.f37765g.equalsIgnoreCase(str)) {
                if (this.f37765g.equalsIgnoreCase("/")) {
                    this.f37765g += str;
                } else {
                    this.f37765g += "/" + str;
                }
            }
            JL_Log.m27883i(f37757u, "listFatDir", "put list in cache. curBrowsePath = " + this.f37765g + ", fatFiles size = " + arrayListListDir.size());
            this.f37764f.put(this.f37765g, arrayListListDir);
        }
        final ArrayList<FatFile> arrayListM27251a = m27251a(arrayListListDir);
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iIO0IX01
            @Override // java.lang.Runnable
            public final void run() {
                FatFileSystem.m27248a(onFatFsOpResultListener, arrayListM27251a);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final Gson m27266c() {
        if (this.f37777s == null) {
            this.f37777s = new GsonBuilder().create();
        }
        return this.f37777s;
    }

    /* JADX INFO: renamed from: b */
    public final void m27260b() {
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam != null) {
            fatOpParam.setSumFileDataLen(0);
        }
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOOXiii0I
            @Override // java.lang.Runnable
            public final void run() {
                this.f4831IO.m27272f();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m27261b(float f) {
        FatOpParam fatOpParam = this.f37775q;
        if (fatOpParam == null || fatOpParam.getProgressListener() == null) {
            return;
        }
        this.f37775q.getProgressListener().onProgress(f);
    }

    /* JADX INFO: renamed from: b */
    public final void m27262b(final int i) {
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OXOIX0I
            @Override // java.lang.Runnable
            public final void run() {
                this.f3507IO.m27273f(i);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m27274g() {
        if (this.f37775q == null) {
            m27262b(4097);
            return;
        }
        if (this.f37762d.getConnectedDevice() == null) {
            m27262b(8192);
            return;
        }
        m27260b();
        int iDeleteFile = deleteFile(this.f37775q.getFilePath());
        JL_Log.m27887w(f37757u, "deleteFatFile", "deleteFile ---> " + iDeleteFile + ", FilePath : " + this.f37775q.getFilePath());
        m27262b(iDeleteFile);
        if (iDeleteFile == 0) {
            listFatDir("/", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27248a(OnFatFsOpResultListener onFatFsOpResultListener, ArrayList arrayList) {
        if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27255a(final OnFatFsOpResultListener onFatFsOpResultListener) {
        final long jM27268d = m27268d();
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1Ii0i0
            @Override // java.lang.Runnable
            public final void run() {
                FatFileSystem.m27247a(onFatFsOpResultListener, jM27268d);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27247a(OnFatFsOpResultListener onFatFsOpResultListener, long j) {
        if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27256a(String str, final OnFatFsOpResultListener onFatFsOpResultListener) {
        final byte[] fileHead = getFileHead(str);
        if (onFatFsOpResultListener != null) {
            this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XX01111iO
                @Override // java.lang.Runnable
                public final void run() {
                    onFatFsOpResultListener.onResult(fileHead);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27253a(final float f) {
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I1IO1XI00
            @Override // java.lang.Runnable
            public final void run() {
                this.f1388IO.m27261b(f);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27252a() {
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XXOX10
            @Override // java.lang.Runnable
            public final void run() {
                this.f5070IO.m27270e();
            }
        });
        JL_Log.m27877d(f37757u, "callbackInitOk", "" + this.f37775q);
        if (this.f37775q != null) {
            m27262b(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27254a(final int i) {
        JL_Log.m27880e(f37757u, "callbackInitFailed", RcspUtil.formatString("code : %d(0x%X), %s", Integer.valueOf(i), Integer.valueOf(i), this.f37775q));
        if (this.f37775q != null) {
            m27262b(i);
        }
        this.f37763e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1IiI1
            @Override // java.lang.Runnable
            public final void run() {
                this.f2726IO.m27271e(i);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27257a(boolean z) {
        this.f37759a = z;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<FatFile> m27251a(ArrayList<FatFile> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList<FatFile> arrayList2 = new ArrayList<>();
        for (FatFile fatFile : arrayList) {
            if (!isIgnoreFile(fatFile.getName())) {
                arrayList2.add(fatFile);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27259a(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }
}
