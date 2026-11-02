package com.jieli.jl_fatfs;

import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.I1IO1XI00;
import com.android.mltcode.paycertificationapi.IIXOXX11;
import com.android.mltcode.paycertificationapi.IIiX1O;
import com.android.mltcode.paycertificationapi.Ii0O0iIXX;
import com.android.mltcode.paycertificationapi.O010;
import com.android.mltcode.paycertificationapi.O10XO0;
import com.android.mltcode.paycertificationapi.O1Ii0i0;
import com.android.mltcode.paycertificationapi.O1IiI1;
import com.android.mltcode.paycertificationapi.O1IiO1I;
import com.android.mltcode.paycertificationapi.OXOIX0I;
import com.android.mltcode.paycertificationapi.XO1Ii1XI0;
import com.android.mltcode.paycertificationapi.XOOXiii0I;
import com.android.mltcode.paycertificationapi.XX01111iO;
import com.android.mltcode.paycertificationapi.XXOX10;
import com.android.mltcode.paycertificationapi.Xi0O11;
import com.android.mltcode.paycertificationapi.iIO0IX01;
import com.android.mltcode.paycertificationapi.iO00I11X;
import com.android.mltcode.paycertificationapi.iOIX1X;
import com.android.mltcode.paycertificationapi.iiIX0IOI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ironsource.C2985d4;
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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class FatFileSystem {
    public static final String u = "FatFileSystem";
    public static final String[] v = null;
    public volatile boolean a;
    public volatile long b;
    public final ExecutorService c;
    public final IBluetoothCtrl d;
    public final Handler e;
    public final Map<String, ArrayList<FatFile>> f;
    public String g;
    public byte[] h;
    public int i;
    public short j;
    public int k;
    public byte[] l;
    public int m;
    public byte[] n;
    public int o;
    public final OnFatFsInitListener p;
    public FatOpParam q;
    public PackResFormat r;
    public Gson s;
    public final String[] t;

    static {
        System.loadLibrary("jl_fatfs");     // Catch: Exception -> L4
    L6:
        v = new String[]{BleDeviceInfo.PLATFORM_JL, "FONT", "SIDEBAR"};
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
        goto L6
    }

    public FatFileSystem(int r5, int r6, final int r7, String[] r8, IBluetoothCtrl r9, OnFatFsInitListener r10, OnFatFileProgressListener r11) {
        ExecutorService r0 = Executors.newSingleThreadExecutor();
        this.c = r0;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashMap();
        this.g = "/";
        this.h = null;
        this.i = 0;
        this.j = 0;
        this.n = null;
        this.o = 0;
        this.t = r8;
        this.d = r9;
        this.p = r10;
        if (r9 == null) goto L17;
        if (r5 <= r6) goto L6;
        r5 = r6;
    L6:
        this.b = libInit(r5, r6);
        if (this.b == 0) goto L15;
        a(false);
        updateSysStatus(this.b, r7);
        if (r7 == 0) goto L12;
        if (r11 == null) goto L12;
        this.q = new FatOpParam().setOp(255).setFilePath("/").setTotalSize(8192).setProgressListener(r11);
    L12:
        r0.submit(new IIXOXX11(this, r7));
        return;
    L15:
        throw new RuntimeException("init lib failed.");
    L17:
        throw new RuntimeException("IBluetoothCtrl cannot be null.");
    }

    public static /* synthetic */ void a(OnFatFsOpResultListener r0, int r1) {
        if (r0 == null) goto L5;
        r0.onResult(Integer.valueOf(r1));
        return;
    }

    public static boolean isIgnoreFile(String r5) {
        if (r5 == null) goto L16;
        String[] r1 = v;
        if (r1 == null) goto L16;
        if (r1.length == 0) goto L16;
        int r2 = r1.length;
        int r3 = 0;
    L10:
        if (r3 >= r2) goto L16;
        if (r1[r3].equalsIgnoreCase(r5) == true) goto L13;
        r3 = r3 + 1;
        goto L10
    L13:
        return true;
    L16:
        return false;
    }

    public final /* synthetic */ void b(final OnFatFsOpResultListener r5) {
        final int r0 = mountDevice(this.b);
        if (r0 != 0) goto L5;
        JL_Log.w(u, "mount", "FatFs mount ok.");
    L5:
        this.e.post(new O010(r5, r0));
    }

    public final /* synthetic */ void c(String r4, final OnFatFsOpResultListener r5) {
        final byte[] r6 = openFile(r4);
        JL_Log.w(u, "openFatFile", "file data : " + CHexConver.byte2HexStr(r6));
        this.e.post(new iOIX1X(r5, r6));
    }

    public void callbackProgress(int r2) {
        if (this.q == null) goto L5;
        a(c(r2));
    L5:
        this.i += r2;
        this.k -= r2;
        this.m += r2;
    }

    public void createFatFile(final String r3, final boolean r4, final OnFatFileProgressListener r5) {
        if (this.a == true) goto L5;
    L15:
        if (r5 == null) goto L19;
        r5.onStop(22);
        return;
    L19:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L15;
        if (this.q == null) goto L13;
        JL_Log.w(u, "createFatFile", "An operation is in progress. " + this.q);
        if (r5 == null) goto L18;
        r5.onStop(4352);
        return;
    L18:
        return;
    L13:
        this.q = new FatOpParam().setOp(2).setFilePath(r3).setProgressListener(r5);
        this.c.submit(new IIiX1O(this, r4, r3, r5));
    }

    public native int createNewFile(String r1, byte[] r2);

    public void createReadBuffer(int r1) {
        this.n = new byte[r1];
        this.o = 0;
    }

    public final long d() {
        return ((long) getFreeSize()) * 4096;
    }

    public void deleteFatFile(String r3, OnFatFileProgressListener r4) {
        if (this.a == true) goto L5;
    L15:
        if (r4 == null) goto L19;
        r4.onStop(22);
        return;
    L19:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L15;
        if (this.q == null) goto L13;
        JL_Log.w(u, "deleteFatFile", "An operation is in progress. " + this.q);
        if (r4 == null) goto L18;
        r4.onStop(4352);
        return;
    L18:
        return;
    L13:
        this.q = new FatOpParam().setOp(3).setFilePath(r3).setProgressListener(r4).setTotalSize(16384);
        this.c.submit(new iiIX0IOI(this));
    }

    public native int deleteFile(String r1);

    public void destroy() {
        JL_Log.w(u, "destroy", "");
        j();
        i();
        if (this.c.isShutdown() == true) goto L5;
        this.c.shutdownNow();
    L5:
        this.f.clear();
        PackResFormat r0 = this.r;
        if (r0 == null) goto L8;
        r0.destroy();
        this.r = null;
    L8:
        this.d.release();
        libDestroy(this.b);
        this.b = 0;
        this.s = null;
        a(false);
    }

    public final /* synthetic */ void e() {
        OnFatFsInitListener r0 = this.p;
        if (r0 == null) goto L6;
        r0.onInitOk();
        return;
    }

    public final /* synthetic */ void f() {
        FatOpParam r0 = this.q;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getProgressListener() == null) goto L9;
        this.q.getProgressListener().onStart(this.q.getFilePath());
        return;
    }

    public final /* synthetic */ void g(int r5) {
        b();
        int r0 = initDiskOp();
        if (r0 != 0) goto L20;
        JL_Log.w(u, C2985d4.a.f, "FatFs init ok.");
        boolean r1 = false;
        if (r5 != 0) goto L22;
    L12:
        int r6 = mountDevice(this.b);
        if (r6 != 0) goto L15;
        r1 = true;
    L15:
        a(r1);
        if (this.a == false) goto L18;
        JL_Log.w(u, C2985d4.a.f, "FatFs mount ok.");
        a();
        listFatDir("/", null);
        this.r = new PackResFormat();
        this.s = new GsonBuilder().create();
        return;
    L18:
        JL_Log.e(u, C2985d4.a.f, "FatFs mount failed. res = " + r6);
        a(r6);
        return;
    L22:
        Thread.sleep(100);     // Catch: InterruptedException -> L9
    L11:
        updateSysStatus(0);
    L9:
        e = move-exception;
        e.printStackTrace();
        goto L11
    L20:
        JL_Log.e(u, C2985d4.a.f, "FatFs init error. ret = " + r0);
        a(r0);
    }

    public short getCrc16() {
        return this.j;
    }

    public String getCurBrowsePath() {
        return this.g;
    }

    public FatFile getFatFileMsg(String r8) {
        FatFile r0 = null;
        if (r8 != null) goto L5;
    L24:
        return r0;
    L5:
        if (this.f.isEmpty() == true) goto L24;
        String r1 = u;
        JL_Log.d(r1, "getFatFileMsg", "filePath = " + r8);
        int r4 = r8.lastIndexOf("/");
        if (r4 != (-1)) goto L10;
        return null;
    L10:
        if (r4 <= 0) goto L12;
        String r5 = r8.substring(0, r4);
    L13:
        JL_Log.d(r1, "getFatFileMsg", "key = " + r5);
        ArrayList<FatFile> r2 = this.f.get(r5);
        if (r2 != null) goto L16;
        r2 = this.f.get(r5 + "/");
    L16:
        if (r2 == null) goto L23;
        Iterator<FatFile> r3 = r2.iterator();
    L19:
        if (r3.hasNext() == false) goto L23;
        FatFile r6 = r3.next();
        JL_Log.d(u, "getFatFileMsg", "" + r6);
        if (r8.equalsIgnoreCase(r6.getPath()) == false) goto L19;
        r0 = r6;
    L23:
        JL_Log.d(u, "getFatFileMsg", "fatFile = " + r0);
        goto L24
    L12:
        r5 = "/";
        goto L13
    }

    public void getFatFsFreeSize(final OnFatFsOpResultListener<Long> r3) {
        if (this.a == true) goto L5;
    L9:
        if (r3 == null) goto L12;
        r3.onResult(0L);
        return;
    L12:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L9;
        this.c.submit(new O1IiO1I(this, r3));
    }

    public native byte[] getFileHead(String r1);

    public void getFileHeadData(final String r3, final OnFatFsOpResultListener<byte[]> r4) {
        if (this.a == true) goto L5;
    L9:
        if (r4 == null) goto L12;
        r4.onResult(null);
        return;
    L12:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L9;
        this.c.submit(new Ii0O0iIXX(this, r3, r4));
    }

    public int getFlagStatus() {
        return getFlagStatus(this.b);
    }

    public native int getFlagStatus(long r1);

    public native int getFreeSize();

    public int getLeftDevSize() {
        return this.k;
    }

    public byte[] getNeedSendLeftData() {
        byte[] r0 = this.l;
        if (r0 != null) goto L6;
        return null;
    L6:
        int r1 = r0.length;
        int r2 = this.m;
        int r3 = r1 - r2;
        byte[] r4 = new byte[r3];
        System.arraycopy(r0, r2, r4, 0, r3);
        return r4;
    }

    public byte[] getNeedWriteData() {
        byte[] r0 = this.l;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (byte[]) r0.clone();
    }

    public byte[] getReadBuffer() {
        byte[] r0 = this.n;
        if (r0 != null) goto L7;
        return null;
    L7:
        return (byte[]) r0.clone();
    }

    public int getReadLeftSize() {
        byte[] r0 = this.n;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.length - this.o;
    }

    public int getReadStatus() {
        return getReadStatus(this.b);
    }

    public native int getReadStatus(long r1);

    public byte[] getWriteLeftData() {
        byte[] r0 = this.h;
        int r1 = r0.length;
        int r2 = this.i;
        int r3 = r1 - r2;
        byte[] r4 = new byte[r3];
        System.arraycopy(r0, r2, r4, 0, r3);
        return r4;
    }

    public int getWriteStatus() {
        return getWriteStatus(this.b);
    }

    public native int getWriteStatus(long r1);

    public final /* synthetic */ void h() {
        FatOpParam r0 = this.q;
        if (r0 != null) goto L6;
        b(4097);
        return;
    L6:
        byte[] r1 = WatchFileUtil.readFileData(r0.getFilePath());
        if (r1 != null) goto L9;
    L25:
        b(4);
        return;
    L9:
        if (r1.length == 0) goto L25;
        if (this.d.getConnectedDevice() != null) goto L15;
        b(8192);
        return;
    L15:
        this.q.setTotalSize(r1.length + 32768);
        String r2 = FatUtil.getFatFilePath(this.g, this.q.getFilePath());
        if (d(r1.length) == false) goto L19;
        b();
        int r3 = replaceFatFile(r2, r1);
        JL_Log.w(u, "replaceFatFile", "replaceFatFile ---> " + r3);
        b(r3);
        return;
    L19:
        b();
        int r4 = deleteFile(r2);
        String r5 = u;
        JL_Log.d(r5, "replaceFatFile", "deleteFile ---> " + r4);
        if (r4 == 0) goto L23;
        b(r4);
        return;
    L23:
        int r6 = createNewFile(r2, r1);
        JL_Log.w(r5, "replaceFatFile", "createNewFile ---> " + r6);
        b(r6);
    }

    public final void i() {
        this.n = null;
        this.o = 0;
    }

    public native int initDiskOp();

    public boolean isMatchVersion(String r10, byte[] r11) {
        String r0 = WatchFileUtil.getJsonFileName(r10);
        if (this.r == null) goto L37;
        if (r0 == null) goto L37;
        if (r11 == null) goto L37;
        if (r11.length == 0) goto L37;
        String r1 = u;
        JL_Log.d(r1, "isMatchVersion", "filePath = " + r10 + ", jsonFileName = " + r0 + ", file size = " + r11.length);
        byte[] r12 = this.r.getFileData(r11, r0);
        StringBuilder r13 = new StringBuilder();
        r13.append("data = ");
        r13.append(CHexConver.byte2HexStr(r12));
        r13.append(", text = ");
        if (r12 != null) goto L12;
        String r2 = "";
    L13:
        r13.append(r2);
        JL_Log.d(r1, "isMatchVersion", r13.toString());
        if (r12 != null) goto L38;
        return false;
    L38:
        FileExtMsg r14 = (FileExtMsg) c().fromJson(new String(r12).trim(), FileExtMsg.class);     // Catch: Exception -> L22
        JL_Log.d(r1, "isMatchVersion", "fileExtMsg = " + r14);     // Catch: Exception -> L22
        if (r14 != null) goto L19;
        return false;
    L19:
        StringBuilder r15 = new StringBuilder();     // Catch: Exception -> L22
        r15.append("matchVersions = ");     // Catch: Exception -> L22
        String[] r3 = this.t;     // Catch: Exception -> L22
        if (r3 != null) goto L24;
        String r4 = "null";
    L25:
        r15.append(r4);     // Catch: Exception -> L22
        JL_Log.d(r1, "isMatchVersion", r15.toString());     // Catch: Exception -> L22
        String[] r16 = this.t;     // Catch: Exception -> L22
        if (r16 != null) goto L28;
    L35:
        return true;
    L28:
        if (r16.length <= 0) goto L35;
        int r5 = r16.length;     // Catch: Exception -> L22
        int r6 = 0;
    L30:
        if (r6 >= r5) goto L37;
        String r7 = r16[r6];     // Catch: Exception -> L22
        JL_Log.d(u, "isMatchVersion", "version = " + r7);     // Catch: Exception -> L22
        if (r7.equalsIgnoreCase(r14.getVersionID()) == true) goto L33;
        r6 = r6 + 1;
        goto L30
    L33:
        return true;
    L24:
        r4 = Arrays.toString(r3);     // Catch: Exception -> L22
    L22:
        e = move-exception;
        e.printStackTrace();
        goto L37
    L12:
        r2 = new String(r12);
    L37:
        return false;
    }

    public final void j() {
        this.h = null;
        this.j = 0;
        this.i = 0;
        this.k = 0;
        this.m = 0;
        this.l = null;
    }

    public boolean judgeWriteFinish(int r3) {
        byte[] r0 = this.h;
        if (r0 != null) goto L5;
        return false;
    L5:
        if ((this.i + r3) < r0.length) goto L10;
        return true;
    L10:
        return false;
    }

    public native void libDestroy(long r1);

    public native long libInit(int r1, int r2);

    public native ArrayList<FatFile> listDir(String r1);

    public void listFatDir(final String r3, final OnFatFsOpResultListener<ArrayList<FatFile>> r4) {
        if (this.a == true) goto L5;
    L9:
        if (r4 == null) goto L12;
        r4.onResult(null);
        return;
    L12:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L9;
        this.c.submit(new iO00I11X(this, r3, r4));
    }

    public void mount(final OnFatFsOpResultListener<Integer> r3) {
        if (this.c.isShutdown() == false) goto L7;
        if (r3 == null) goto L9;
        r3.onResult(8);
        return;
    L9:
        return;
    L7:
        this.c.submit(new O10XO0(this, r3));
    }

    public native int mountDevice(long r1);

    public void onReadDataNotify(int r3, int r4) {
        IBluetoothCtrl r0 = this.d;
        r0.readFatDataFromDevice(r0.getConnectedDevice(), r3, r4);
    }

    public void onWriteDataNotify(byte[] r3, int r4) {
        IBluetoothCtrl r0 = this.d;
        r0.writeFatDataToDevice(r0.getConnectedDevice(), r4, r3);
    }

    public void onWriteFailed(ArrayList<FatWriteOp> r1) {
    }

    public void onWriteFlagNotify(boolean r3) {
        IBluetoothCtrl r0 = this.d;
        r0.sendWriteFlag(r0.getConnectedDevice(), r3);
    }

    public void openFatFile(final String r3, final OnFatFsOpResultListener<byte[]> r4) {
        if (this.a == true) goto L5;
    L9:
        if (r4 == null) goto L12;
        r4.onResult(null);
        return;
    L12:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L9;
        this.c.submit(new Xi0O11(this, r3, r4));
    }

    public native byte[] openFile(String r1);

    public void putDataInReadBuff(byte[] r5) {
        if (r5 != null) goto L4;
    L12:
        JL_Log.e(u, "putDataInReadBuff", "readBuffer no enough space.");
        return;
    L4:
        if (r5.length == 0) goto L12;
        byte[] r0 = this.n;
        if (r0 == null) goto L12;
        int r1 = r5.length;
        int r2 = this.o;
        if ((r1 + r2) > r0.length) goto L12;
        System.arraycopy(r5, 0, r0, r2, r5.length);
        this.o += r5.length;
    }

    public boolean readBufferIsEmpty() {
        if (this.n != null) goto L6;
        return true;
    L6:
        return false;
    }

    public native int replaceFatFile(String r1, byte[] r2);

    public void replaceFatFile(String r3, OnFatFileProgressListener r4) {
        if (this.a == true) goto L5;
    L15:
        if (r4 == null) goto L19;
        r4.onStop(22);
        return;
    L19:
        return;
    L5:
        if (this.c.isShutdown() == true) goto L15;
        if (this.q == null) goto L13;
        JL_Log.w(u, "replaceFatFile", "An operation is in progress. " + this.q);
        if (r4 == null) goto L18;
        r4.onStop(4352);
        return;
    L18:
        return;
    L13:
        this.q = new FatOpParam().setOp(4).setFilePath(r3).setProgressListener(r4);
        this.c.submit(new XO1Ii1XI0(this));
    }

    public void setNeedWriteData(int r6) {
        byte[] r0 = this.h;
        if (r0 == null) goto L9;
        int r1 = r0.length;
        int r2 = this.i;
        if (r1 < (r2 + r6)) goto L7;
        this.l = new byte[r6];
    L8:
        byte[] r3 = this.l;
        System.arraycopy(r0, r2, r3, 0, r3.length);
        this.m = 0;
        goto L9
    L7:
        this.l = new byte[r1 - r2];
    L9:
        this.k = r6;
    }

    public void setWriteBuffer(byte[] r4) {
        if (r4 != null) goto L5;
    L9:
        this.h = null;
        this.i = 0;
        return;
    L5:
        if (r4.length == 0) goto L9;
        byte[] r5 = (byte[]) r4.clone();
        this.h = r5;
        short r6 = CryptoUtil.CRC16(r5, 0);
        this.j = r6;
        this.i = 0;
        this.m = 0;
        this.l = null;
        JL_Log.d(u, "setWriteBuffer", RcspUtil.formatString("crc16 : %d(0x%X)", new Object[]{Short.valueOf(r6), Short.valueOf(this.j)}));
    }

    public native void updateFlagStatus(long r1, int r3);

    public void updateFlagStatus(boolean r3) {
        updateFlagStatus(this.b, r3 ? 1 : 0);
    }

    public native void updateReadStatus(long r1, int r3, byte[] r4);

    public void updateReadStatus(boolean r3, byte[] r4) {
        updateReadStatus(this.b, r3 ? 1 : 0, r4);
    }

    public void updateSysStatus(int r3) {
        updateSysStatus(this.b, r3);
    }

    public native void updateSysStatus(long r1, int r3);

    public native void updateWriteStatus(long r1, int r3);

    public void updateWriteStatus(boolean r3) {
        if (r3 == true) goto L4;
        j();
    L4:
        updateWriteStatus(this.b, r3 ? 1 : 0);
    }

    public boolean writeBufferIsEmpty() {
        if (this.h != null) goto L6;
        return true;
    L6:
        return false;
    }

    public final /* synthetic */ void a(boolean r9, String r10, OnFatFileProgressListener r11) {
        FatOpParam r0 = this.q;
        if (r0 != null) goto L6;
        b(4097);
        return;
    L6:
        byte[] r1 = WatchFileUtil.readFileData(r0.getFilePath());
        if (r1 != null) goto L9;
    L44:
        b(4);
        return;
    L9:
        if (r1.length == 0) goto L44;
        if (this.d.getConnectedDevice() != null) goto L15;
        b(8192);
        return;
    L15:
        this.q.setTotalSize(r1.length + 16384);
        if (r9 == false) goto L18;
    L22:
        String r12 = FatUtil.getFatFilePath(this.g, this.q.getFilePath());
        FatFile r2 = getFatFileMsg(r12);
        if (d(r1.length) == false) goto L37;
        b();
        if (r2 == null) goto L27;
        int r13 = deleteFile(r12);
        JL_Log.w(u, "createFatFile", "deleteFile ---> " + r13 + ", fatFilePath = " + r12);
    L28:
        if (r13 == 0) goto L32;
        if (r13 == 4) goto L32;
        if (r13 == 5) goto L32;
    L33:
        JL_Log.w(u, "createFatFile", "createNewFile ---> " + r13);
        b(r13);
        if (r13 != 0) goto L46;
        listFatDir("/", null);
        return;
    L46:
        return;
    L32:
        r13 = createNewFile(r12, r1);
        goto L33
    L27:
        r13 = 0;
        goto L28
    L37:
        if (r2 == null) goto L42;
        long r6 = d() + r2.getSize();
        JL_Log.w(u, "createFatFile", "freeSize = " + r6 + ", file data size = " + r1.length);
        if (r6 < r1.length) goto L42;
        this.q = null;
        replaceFatFile(r10, r11);
        return;
    L42:
        b(20);
        return;
    L18:
        if (isMatchVersion(this.q.getFilePath(), r1) == true) goto L22;
        b(16896);
    }

    public final boolean d(int r6) {
        long r0 = d();
        JL_Log.d(u, "hasEnoughSpace", "fatFsFreeSize = " + r0 + ", dataLen = " + r6);
        if ((r0 - ((long) r6)) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final /* synthetic */ void e(int r2) {
        OnFatFsInitListener r0 = this.p;
        if (r0 == null) goto L6;
        r0.onInitFailed(r2);
        return;
    }

    public static /* synthetic */ void b(OnFatFsOpResultListener r0, byte[] r1) {
        if (r0 == null) goto L5;
        r0.onResult(r1);
        return;
    }

    public final float c(int r5) {
        FatOpParam r0 = this.q;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        if (r0.getTotalSize() == 0) goto L13;
        int r1 = this.q.getSumFileDataLen() + r5;
        this.q.setSumFileDataLen(r1);
        float r6 = (r1 * 100.0f) / this.q.getTotalSize();
        if (r6 <= 100.0f) goto L10;
        return 100.0f;
    L10:
        return r6;
    L13:
        return 0.0f;
    }

    public final /* synthetic */ void f(int r4) {
        JL_Log.i(u, "callbackStop", "result : " + r4 + ", " + this.q);
        FatOpParam r0 = this.q;
        if (r0 == null) goto L8;
        OnFatFileProgressListener r1 = r0.getProgressListener();
        j();
        this.q = null;
        if (r1 == null) goto L9;
        r1.onStop(WatchError.fatfsToWatchErr(r4));
        return;
    L9:
        return;
    }

    public final /* synthetic */ void b(String r5, final OnFatFsOpResultListener r6) {
        ArrayList<FatFile> r0 = listDir(r5);
        if (r0 != null) goto L5;
    L11:
        final ArrayList<FatFile> r7 = a(r0);
        this.e.post(new iIO0IX01(r6, r7));
        return;
    L5:
        if (this.g.equalsIgnoreCase(r5) == false) goto L7;
    L10:
        JL_Log.i(u, "listFatDir", "put list in cache. curBrowsePath = " + this.g + ", fatFiles size = " + r0.size());
        this.f.put(this.g, r0);
        goto L11
    L7:
        if (this.g.equalsIgnoreCase("/") == false) goto L9;
        this.g += r5;
        goto L10
    L9:
        this.g += "/" + r5;
        goto L10
    }

    public final Gson c() {
        if (this.s != null) goto L6;
        this.s = new GsonBuilder().create();
    L6:
        return this.s;
    }

    public final void b() {
        FatOpParam r0 = this.q;
        if (r0 == null) goto L5;
        r0.setSumFileDataLen(0);
    L5:
        this.e.post(new XOOXiii0I(this));
    }

    public final /* synthetic */ void b(float r2) {
        FatOpParam r0 = this.q;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getProgressListener() == null) goto L9;
        this.q.getProgressListener().onProgress(r2);
        return;
    }

    public final void b(final int r3) {
        this.e.post(new OXOIX0I(this, r3));
    }

    public final /* synthetic */ void g() {
        if (this.q != null) goto L7;
        b(4097);
        return;
    L7:
        if (this.d.getConnectedDevice() != null) goto L10;
        b(8192);
        return;
    L10:
        b();
        int r0 = deleteFile(this.q.getFilePath());
        JL_Log.w(u, "deleteFatFile", "deleteFile ---> " + r0 + ", FilePath : " + this.q.getFilePath());
        b(r0);
        if (r0 != 0) goto L14;
        listFatDir("/", null);
        return;
    }

    public static /* synthetic */ void a(OnFatFsOpResultListener r0, ArrayList r1) {
        if (r0 == null) goto L5;
        r0.onResult(r1);
        return;
    }

    public final /* synthetic */ void a(final OnFatFsOpResultListener r5) {
        final long r0 = d();
        this.e.post(new O1Ii0i0(r5, r0));
    }

    public static /* synthetic */ void a(OnFatFsOpResultListener r0, long r1) {
        if (r0 == null) goto L5;
        r0.onResult(Long.valueOf(r1));
        return;
    }

    public final /* synthetic */ void a(String r3, final OnFatFsOpResultListener r4) {
        final byte[] r5 = getFileHead(r3);
        if (r4 == null) goto L6;
        this.e.post(new XX01111iO(r4, r5));
        return;
    }

    public static /* synthetic */ void a(OnFatFsOpResultListener r0, byte[] r1) {
        r0.onResult(r1);
    }

    public final void a(final float r3) {
        this.e.post(new I1IO1XI00(this, r3));
    }

    public final void a() {
        this.e.post(new XXOX10(this));
        JL_Log.d(u, "callbackInitOk", "" + this.q);
        if (this.q == null) goto L6;
        b(0);
        return;
    }

    public final void a(final int r5) {
        JL_Log.e(u, "callbackInitFailed", RcspUtil.formatString("code : %d(0x%X), %s", new Object[]{Integer.valueOf(r5), Integer.valueOf(r5), this.q}));
        if (this.q == null) goto L5;
        b(r5);
    L5:
        this.e.post(new O1IiI1(this, r5));
    }

    public final void a(boolean r1) {
        this.a = r1;
    }

    public final ArrayList<FatFile> a(ArrayList<FatFile> r4) {
        if (r4 != null) goto L4;
    L13:
        return r4;
    L4:
        if (r4.isEmpty() == true) goto L13;
        ArrayList<FatFile> r0 = new ArrayList();
        Iterator<FatFile> r5 = r4.iterator();
    L8:
        if (r5.hasNext() == false) goto L12;
        FatFile r1 = r5.next();
        if (isIgnoreFile(r1.getName()) == true) goto L8;
        r0.add(r1);
        goto L8
    L12:
        return r0;
    }

    public final boolean a(String r3) {
        if (r3 != null) goto L5;
        return false;
    L5:
        File r1 = new File(r3);
        if (r1.exists() == true) goto L8;
    L11:
        return false;
    L8:
        if (r1.isFile() == false) goto L11;
        return true;
    }
}
