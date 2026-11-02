package com.jieli.jl_rcsp.task;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.cz5;
import com.android.mltcode.paycertificationapi.dz5;
import com.android.mltcode.paycertificationapi.ez5;
import com.android.mltcode.paycertificationapi.fz5;
import com.android.mltcode.paycertificationapi.gz5;
import com.android.mltcode.paycertificationapi.hz5;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.ironsource.C2985d4;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.command.NotifyPrepareEnvCmd;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.file_op.CancelLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd;
import com.jieli.jl_rcsp.model.command.file_op.LargeFileTransferGetNameCmd;
import com.jieli.jl_rcsp.model.command.file_op.LargeFileTransferOpCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.model.parameter.LargeFileTransferOpParam;
import com.jieli.jl_rcsp.model.parameter.StartLargeFileTransferParam;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class TransferTask extends TaskBase {
    public String b;
    public final CacheVar c;
    public final Param d;
    public final Handler e;
    protected ExecutorService executor;
    public final OnRcspCallback f;
    public int maxRenameCount;

    public static class CacheVar {
        public static final int l = 50;
        public RandomAccessFile a;
        public short b;
        public int c;
        public long d;
        public int e;
        public int f;
        public final LinkedBlockingQueue<SendData> g;
        public boolean h;
        public long i;
        public long j;
        public long k;

        public CacheVar() {
            this.f = 0;
            this.g = new LinkedBlockingQueue();
            this.j = -1;
            this.k = 50;
        }

        public void a() {
            RandomAccessFile r0 = this.a;
            if (r0 != null) goto L16;
            return;
        L16:
            r0.close();     // Catch: Throwable -> L8 IOException -> L10
            this.a = null;
            return;
        L8:
            th = move-exception;
            this.a = null;
            throw th;
        L10:
            e = move-exception;
            throw new RuntimeException(e);     // Catch: Throwable -> L8
        }

        public void b() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.h = false;
            this.i = 0;
            this.j = -1;
            this.k = 50;
            this.g.clear();
            a();
        }

        public /* synthetic */ CacheVar(AnonymousClass1 r1) {
            this();
        }
    }

    public static class Param {
        public boolean a;
        public boolean appHasCrc16;
        public int devHandler;
        public String encodeType;
        public boolean isOtherEncode;
        public String outputDirPath;
        public boolean useFlash;

        public Param() {
            this.appHasCrc16 = true;
            this.useFlash = false;
            this.isOtherEncode = false;
            this.encodeType = StandardCharsets.UTF_16LE.name();
            this.a = false;
        }

        public static /* synthetic */ boolean a(Param r0) {
            return r0.a;
        }

        public String toString() {
            return "Param{devHandler=" + this.devHandler + ", appHasCrc16=" + this.appHasCrc16 + ", useFlash=" + this.useFlash + ", firmwareHasCrc16=" + this.a + ", isOtherEncode=" + this.isOtherEncode + ", encodeType=" + this.encodeType + ", outputDirPath=" + this.outputDirPath + i0XO1.IO;
        }

        public static /* synthetic */ boolean a(Param r0, boolean r1) {
            r0.a = r1;
            return r1;
        }
    }

    public static class SendData {
        public int a;
        public byte[] b;

        public SendData(int r1, byte[] r2) {
            this.a = r1;
            this.b = r2;
        }
    }

    public TransferTask(RcspOpImpl r3, String r4, Param r5) throws RuntimeException {
        super(r3);
        this.maxRenameCount = 9;
        this.executor = Executors.newSingleThreadExecutor();
        this.e = new Handler(Looper.getMainLooper(), new fz5(this));
        this.f = new AnonymousClass8(this);
        if (r5 == null) goto L7;
        this.d = r5;
        JL_Log.d(this.tag, C2985d4.a.f, r5 + ", class = " + this);
        this.c = new CacheVar(null);
        setPath(r4);
        return;
    L7:
        throw new RuntimeException("TransferTask.Param can not be null.");
    }

    public static /* synthetic */ boolean OXO1(TransferTask r0, Message r1) {
        return r0.a(r1);
    }

    public static /* synthetic */ void a(TransferTask r0) {
        r0.f();
    }

    public static /* synthetic */ void b(TransferTask r0) {
        r0.h();
    }

    public static /* synthetic */ void c(TransferTask r0) {
        r0.i();
    }

    public static /* synthetic */ void d(TransferTask r0) {
        r0.k();
    }

    public static /* synthetic */ Param e(TransferTask r0) {
        return r0.d;
    }

    public static /* synthetic */ CacheVar f(TransferTask r0) {
        return r0.c;
    }

    public static /* synthetic */ Handler g(TransferTask r0) {
        return r0.e;
    }

    public static /* synthetic */ void h(TransferTask r0) {
        r0.e();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r6) {
        if (isRun() == true) goto L5;
        return;
    L5:
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new CancelLargeFileTransferCmd(), new BooleanRcspActionCallback("cancel", new AnonymousClass1(this)));
    }

    public String getPath() {
        return this.b;
    }

    public final void i() {
        if (isRun() == true) goto L5;
        return;
    L5:
        Param r1 = this.d;
        DeviceExtendParamCmd.FileTransferParam r0 = new DeviceExtendParamCmd.FileTransferParam(r1.devHandler, r1.appHasCrc16);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new DeviceExtendParamCmd(r0), new CustomRcspActionCallback("readExternParam", new AnonymousClass4(this), new AnonymousClass5(this)));
    }

    public final void j() {
        if (isRun() == true) goto L5;
        return;
    L5:
        JL_Log.d(this.tag, "startFileTransferFlow", "" + this.d);
        if (this.d.useFlash == false) goto L9;
        File r0 = new File(this.b);
        a("/" + r0.getName(), (int) r0.length());
        return;
    L9:
        h();
    }

    public final void k() {
        if (isRun() == true) goto L5;
        return;
    L5:
        JL_Log.d(this.tag, "startTransferActual", "path = " + this.b);
        File r0 = new File(this.b);
        if (r0.exists() == true) goto L8;
    L32:
        onError(4097, RcspUtil.formatString("Path is invalid. path = " + this.b, new Object[0]));
        return;
    L8:
        if (r0.isDirectory() == true) goto L32;
        if (r0.length() == 0) goto L32;
        StringBuilder r1 = new StringBuilder();
        r1.append(RcspUtil.formatString("%08x", new Object[]{Integer.valueOf((r0.getName() + r0.lastModified()).hashCode())}));
        r1.append(".tmp\u0000");
        String r2 = r1.toString();
        String r3 = this.d.outputDirPath;
        if (r3 == null) goto L18;
        String r4 = File.separator;
        if (r3.startsWith(r4) == false) goto L18;
        int r5 = this.d.outputDirPath.indexOf(r4);
    L19:
        if (r5 != (-1)) goto L21;
        String r6 = this.d.outputDirPath;
    L22:
        if (r6 != null) goto L24;
    L30:
        JL_Log.d(this.tag, "startTransferActual", "tempPath --->" + r2);
        byte[] r7 = r2.getBytes();
        CacheVar r8 = this.c;
        a(r7, r8.f, r8.b);
        return;
    L24:
        if (r6.isEmpty() == true) goto L30;
        String r9 = File.separator;
        if (r6.endsWith(r9) == false) goto L29;
        r2 = r6 + r2;
        goto L30
    L29:
        r2 = r6 + r9 + r2;
        goto L30
    L21:
        r6 = this.d.outputDirPath.substring(r5);
    L18:
        r5 = -1;
        goto L19
    }

    public void onError(int r2) {
        onError(r2, null);
    }

    public void release() {
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), false);
        this.c.b();
        this.mRcspOp.unregisterOnRcspCallback(this.f);
        this.e.removeCallbacksAndMessages(null);
        if (this.executor.isShutdown() == true) goto L6;
        this.executor.shutdownNow();
        return;
    }

    public void setPath(String r3) {
        this.b = r3;
        int r0 = r3.lastIndexOf(File.separator);
        if (r0 != (-1)) goto L5;
        return;
    L5:
        if ((r3.length() - (r0 + 1)) <= 9) goto L8;
        this.maxRenameCount = 32;
        return;
    L8:
        this.maxRenameCount = 9;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L7;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L7:
        if (isFileTransfer() == false) goto L11;
        JL_Log.w(this.tag, "start", "SDK in file transfer.");
        onError(4352);
        return;
    L11:
        if (isDeviceInCalling() == false) goto L15;
        JL_Log.w(this.tag, "start", "Device in calling.");
        onError(12545);
        return;
    L15:
        if (this.executor.isShutdown() == false) goto L17;
        this.executor = Executors.newSingleThreadExecutor();
    L17:
        g();
        a();
    }

    public static /* synthetic */ void a(TransferTask r0, int r1) {
        r0.a(r1);
    }

    private void g() {
        this.c.b();
        this.mRcspOp.registerOnRcspCallback(this.f);
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), true);
        callbackBegin();
    }

    public final long b() {
        return System.currentTimeMillis();
    }

    public final SDCardBean c() {
        List<SDCardBean> r0 = FileBrowseManager.getInstance().getOnlineDev();
        if (r0 != null) goto L5;
    L13:
        return null;
    L5:
        if (r0.isEmpty() == true) goto L13;
        Iterator<SDCardBean> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L13;
        SDCardBean r2 = r1.next();
        if (r2.getDevHandler() != this.d.devHandler) goto L9;
        return r2;
    }

    public final /* synthetic */ void d() {
        File r0 = new File(this.b);
        if (r0.exists() == true) goto L5;
    L43:
        onError(4097, RcspUtil.formatString("Path is invalid. path = " + this.b, new Object[0]));
        return;
    L5:
        if (r0.isDirectory() == true) goto L43;
        long r6 = 0;
        if (r0.length() == 0) goto L43;
        long r4 = b();
        FileInputStream r2 = null;
        this.c.a = new RandomAccessFile(r0, "r");     // Catch: Throwable -> L27 Exception -> L29
        this.c.f = (int) r0.length();     // Catch: Throwable -> L27 Exception -> L29
        FileInputStream r8 = new FileInputStream(r0);     // Catch: Throwable -> L27 Exception -> L29
        long r9 = r8.available();     // Catch: Throwable -> L23 Exception -> L25
        byte[] r1 = new byte[2048];     // Catch: Throwable -> L23 Exception -> L25
        short r3 = 0;
    L12:
        int r11 = r8.read(r1);     // Catch: Throwable -> L23 Exception -> L25
        if (r11 == (-1)) goto L15;
        byte[] r12 = new byte[r11];     // Catch: Throwable -> L23 Exception -> L25
        System.arraycopy(r1, 0, r12, 0, r11);     // Catch: Throwable -> L23 Exception -> L25
        r3 = CryptoUtil.CRC16(r12, r3);     // Catch: Throwable -> L23 Exception -> L25
        r6 = r6 + ((long) r11);     // Catch: Throwable -> L23 Exception -> L25
        goto L12
    L15:
        long r5 = a(r4);     // Catch: Throwable -> L23 Exception -> L25
        this.c.b = r3;     // Catch: Throwable -> L23 Exception -> L25
        JL_Log.d(this.tag, "countFileCrc", RcspUtil.formatString("Take data time = %d, file len = %d, file size = %d, data size = %d, crc = %d(0x%X)", new Object[]{Long.valueOf(r5), Integer.valueOf(this.c.f), Long.valueOf(r9), Long.valueOf(r6), Short.valueOf(r3), Short.valueOf(r3)}));     // Catch: Throwable -> L23 Exception -> L25
        CacheVar r7 = this.c;     // Catch: Throwable -> L23 Exception -> L25
        if (r7.f == r6) goto L18;
        r7.f = (int) r6;     // Catch: Throwable -> L23 Exception -> L25
    L18:
        j();     // Catch: Throwable -> L23 Exception -> L25
        r8.close();     // Catch: IOException -> L21
        return;
    L25:
        e = e;
        r2 = r8;
    L30:
        e.printStackTrace();     // Catch: Throwable -> L27
        this.e.post(new cz5(this, e));     // Catch: Throwable -> L27
        if (r2 == null) goto L54;
        r2.close();     // Catch: IOException -> L21
        return;
    L54:
        return;
    L23:
        th = th;
    L24:
        Throwable r10 = th;
        if (r8 == null) goto L56;
        r8.close();     // Catch: IOException -> L40
        throw r10;
    L40:
        e = move-exception;
        e.printStackTrace();
        throw r10;
    L56:
        throw r10;
    L29:
        e = e;
    L27:
        th = th;
        r8 = r2;
    L21:
        e = move-exception;
        e.printStackTrace();
    }

    public final void e() {
        if (this.c.g.isEmpty() == false) goto L8;
        this.c.h = false;
        if (isRun() == false) goto L10;
        this.e.removeMessages(4386);
        this.e.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
        return;
    L10:
        return;
    L8:
        SendData r0 = this.c.g.poll();
        if (r0 == null) goto L13;
        a(r0.a, r0.b, new AnonymousClass7(this));
        return;
    }

    public final void f() {
        release();
        callbackCancel(0);
    }

    public final void h() {
        if (isRun() == true) goto L5;
        return;
    L5:
        NotifyPrepareEnvCmd r0 = new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.NotifyPrepareTransferLargeFileParam());
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r0, new BooleanRcspActionCallback("prepareBigFileTransferEnv", new AnonymousClass3(this)));
    }

    public void onError(int r1, String r2) {
        release();
        if (r2 != null) goto L6;
        callbackError(r1);
        return;
    L6:
        callbackError(r1, r2);
    }

    public static /* synthetic */ void a(TransferTask r0, LargeFileTransferOpCmd r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void a(TransferTask r0, LargeFileTransferGetNameCmd r1) {
        r0.a(r1);
    }

    private /* synthetic */ boolean a(Message r2) {
        if (r2.what != 4386) goto L7;
        onError(12290);
        return true;
    L7:
        return true;
    }

    public final long a(long r3) {
        return b() - r3;
    }

    public final void a(LargeFileTransferGetNameCmd r5) {
        if (isRun() == false) goto L18;
        this.e.removeMessages(4386);
        this.e.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
        String r0 = new File(this.b).getName();
        JL_Log.d(this.tag, "onGetName", "File name = " + r0 + ", retryName = " + this.c.e);
        r5.setParam(new LargeFileTransferGetNameCmd.Param(r0, this.c.e).setOtherEncode(this.d.isOtherEncode).setEncodeType(this.d.encodeType));
        if (this.c.e < this.maxRenameCount) goto L8;
        int r1 = 1;
    L9:
        r5.setStatus(r1);
        r5.setOpCodeSn(r5.getOpCodeSn());
        this.mRcspOp.sendCommandResponse(getConnectedDevice(), r5, null);
        if (this.d.useFlash == true) goto L17;
        CacheVar r6 = this.c;
        int r2 = r6.e;
        if (r2 < this.maxRenameCount) goto L15;
        onError(16898);
        return;
    L15:
        r6.e = r2 + 1;
        return;
    L17:
        return;
    L8:
        r1 = 0;
        goto L9
    }

    public final void a(int r6) {
        long r0 = a(this.c.d);
        JL_Log.i(this.tag, "onStop", "Transfer file take time -->" + r0 + ", reason = " + r6);
        if (r6 != 0) goto L5;
        JL_Log.i(this.tag, "onStop", "Transfer of large file is complete.");
        SDCardBean r7 = c();
        if (r7 == null) goto L24;
        Folder r8 = FileBrowseManager.getInstance().getCurrentReadFile(r7);
        if (r8 == null) goto L24;
        r8.setLoadFinished(false);
    L24:
        release();
        callbackProgress(100);
        callbackFinish();
        return;
    L5:
        if (r6 != 1) goto L7;
        int r9 = WatchError.ERR_FAT_WRITE;
    L17:
        onError(r9, WatchError.getErrorDesc(r9));
        return;
    L7:
        if (r6 != 2) goto L9;
        r9 = WatchError.ERR_DATA_OVER_LIMIT;
        goto L17
    L9:
        if (r6 != 3) goto L11;
        r9 = 12544;
        goto L17
    L11:
        if (r6 == 4) goto L13;
        r9 = 12293;
        goto L17
    L13:
        r9 = 16897;
        goto L17
    }

    public final void a() {
        this.executor.execute(new gz5(this));     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
        onError(16389, "Exception : " + e.getMessage());
    }

    public final /* synthetic */ void a(Exception r3) {
        onError(16389, "IO Exception : " + r3.getMessage());
    }

    public final void a(String r5, int r6) {
        if (isRun() == true) goto L5;
        return;
    L5:
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashInsertNewFileStartCmd(r5, r6), new BooleanRcspActionCallback("startCreateFlashFile", new AnonymousClass2(this)));
    }

    public final void a(byte[] r5, int r6, short r7) {
        JL_Log.d(this.tag, "startBigFileTransfer", RcspUtil.formatString("size = %d, crc16 = %d(0x%X)", new Object[]{Integer.valueOf(r6), Short.valueOf(r7), Short.valueOf(r7)}));
        long r0 = b();
        CacheVar r2 = this.c;
        r2.d = r0;
        r2.i = r0;
        StartLargeFileTransferCmd r1 = new StartLargeFileTransferCmd(new StartLargeFileTransferParam(r5, r6, r7));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r1, new AnonymousClass6(this));
    }

    public final void a(int r4, byte[] r5, OnOperationCallback<Boolean> r6) {
        DataParam r0 = new DataParam(r5);
        r0.setXmOpCode(r4);
        DataCmd r7 = new DataCmd(r0);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r7, new BooleanRcspActionCallback("sendData", r6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final LargeFileTransferOpCmd r11) {
        final int r5 = this.c.c;
        if (isRun() == false) goto L39;
        if (r5 <= 0) goto L39;
        if (this.c.a == null) goto L39;
        LargeFileTransferOpParam r0 = (LargeFileTransferOpParam) r11.getParam();
        final int r3 = r0.getOffset();
        final short r4 = r0.getBuffer();
        long r1 = a(this.c.i);
        CacheVar r2 = this.c;
        if (r2.j == r3) goto L11;
    L14:
        this.e.removeMessages(4386);
        if (r3 <= 512) goto L35;
        int r6 = this.c.f;
        float r7 = 100.0f;
        if (r6 != 0) goto L19;
        float r8 = 0.0f;
    L21:
        if (r8 > 100.0f) goto L24;
        r7 = r8;
    L24:
        callbackProgress((int) r7);
        goto L35
    L19:
        r8 = (r3 * 100.0f) / r6;
    L35:
        this.executor.execute(new hz5(this, r3, r4, r5, r11));     // Catch: Exception -> L29
        return;
    L29:
        e = e;
    L30:
        Exception r12 = e;
        r12.printStackTrace();
        onError(16389, "Exception = " + r12.getMessage());
        return;
    L31:
        e = e;
        goto L30
    L11:
        if (r1 >= r2.k) goto L14;
        JL_Log.w(this.tag, "pullData", RcspUtil.formatString("Received same packet.Skip! offset = %d, take time = %d, limit = %d", new Object[]{Integer.valueOf(r3), Long.valueOf(r1), Long.valueOf(this.c.k)}));
        return;
    }

    public final /* synthetic */ void a(final int r10, final int r11, int r12, LargeFileTransferOpCmd r13) {
        CacheVar r0 = this.c;     // Catch: IOException -> L5
        long r1 = r10;
        r0.j = r1;     // Catch: IOException -> L5
        r0.i = b();     // Catch: IOException -> L5
        this.c.a.seek(r1);     // Catch: IOException -> L5
        byte[] r2 = new byte[0];     // Catch: IOException -> L5
        final int r3 = Math.min(r11, this.c.f - r10);     // Catch: IOException -> L5
        if (r3 < 0) goto L7;
        r2 = new byte[r3];     // Catch: IOException -> L5
        int r4 = this.c.a.read(r2);     // Catch: IOException -> L5
    L8:
        if (r4 != (-1)) goto L11;
        this.e.post(new dz5(this, r10, r3, r11));     // Catch: IOException -> L5
        return;
    L11:
        byte[] r14 = Arrays.copyOfRange(r2, 0, r4);     // Catch: IOException -> L5
        this.c.k = (long) Math.max((((double) r4) * 10.0d) / ((double) r12), 10.0d);     // Catch: IOException -> L5
        int r15 = 0;
        int r5 = 0;
    L12:
        if (r15 >= r4) goto L21;
        int r6 = Math.min(r12, r4 - r15);     // Catch: IOException -> L5
        int r7 = r15 + r6;     // Catch: IOException -> L5
        byte[] r16 = Arrays.copyOfRange(r14, r15, r7);     // Catch: IOException -> L5
        Param r8 = this.d;     // Catch: IOException -> L5
        if (r8.appHasCrc16 == true) goto L16;
    L18:
        byte[] r9 = new byte[r6 + 1];     // Catch: IOException -> L5
        System.arraycopy(r16, 0, r9, 1, r6);     // Catch: IOException -> L5
    L19:
        r9[0] = CHexConver.intToByte(r5);     // Catch: IOException -> L5
        this.c.g.add(new SendData(r13.getId(), r9));     // Catch: IOException -> L5
        r5 = r5 + 1;     // Catch: IOException -> L5
        r15 = r7;
        goto L12
    L16:
        if (Param.a(r8) == false) goto L18;
        r9 = new byte[r6 + 3];     // Catch: IOException -> L5
        short r17 = CryptoUtil.CRC16(r16, 0);     // Catch: IOException -> L5
        r9[1] = (byte) ((r17 >> 8) & 255);     // Catch: IOException -> L5
        r9[2] = (byte) (r17 & 255);     // Catch: IOException -> L5
        System.arraycopy(r16, 0, r9, 3, r6);     // Catch: IOException -> L5
        goto L19
    L21:
        if (this.c.h == true) goto L30;
        e();     // Catch: IOException -> L5
        return;
    L30:
        return;
    L7:
        r4 = -1;
    L5:
        e = move-exception;
        e.printStackTrace();
        this.e.post(new ez5(this, e));
    }

    public final /* synthetic */ void a(int r3, int r4, int r5) {
        onError(16389, "Failed to read data. offset = " + r3 + ", packetSize = " + r4 + ", buffer : " + r5);
    }

    public final /* synthetic */ void a(IOException r3) {
        onError(16389, "IO Exception = " + r3.getMessage());
    }
}
