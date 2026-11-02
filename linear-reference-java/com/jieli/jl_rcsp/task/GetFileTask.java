package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.Oi10I0;
import com.android.mltcode.paycertificationapi.OiX1iIIi;
import com.android.mltcode.paycertificationapi.X00010;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class GetFileTask extends TaskBase {
    public static final String BYTE_ARRAY_STREAM = "byte_array_stream";
    public static final int REASON_CANCEL_TASK = 0;
    public static final int REASON_CRC_ERROR = 2;
    public static final int REASON_LOST_DATA = 1;
    public static final int l = 8705;
    public static final int m = 8706;
    public final String b;
    public OutputStream c;
    public byte[] d;
    public final Param e;
    public boolean f;
    public HandlerThread g;
    public Handler h;
    public final Handler i;
    public final Handler.Callback j;
    public final OnRcspCallback k;
    protected boolean useCrc;

    public static class Param {
        public short lastCrc;
        public int lastOffset;
        public int lastProgress;
        public int totalSize;

        public Param() {
            this.lastOffset = 0;
            this.lastCrc = 0;
            this.lastProgress = -1;
        }

        public void reset() {
            this.totalSize = 0;
            this.lastOffset = 0;
            this.lastCrc = 0;
            this.lastProgress = -1;
        }

        public /* synthetic */ Param(AnonymousClass1 r1) {
            this();
        }
    }

    public GetFileTask(RcspOpImpl r4, String r5) {
        super(r4);
        this.c = null;
        this.d = new byte[0];
        this.useCrc = true;
        this.f = false;
        this.i = new Handler(Looper.getMainLooper(), new X00010(this));
        this.j = new OiX1iIIi(this);
        this.k = new AnonymousClass4(this);
        this.b = r5;
        this.e = new Param(null);
    }

    public static /* synthetic */ Param a(GetFileTask r0) {
        return r0.e;
    }

    public static /* synthetic */ Handler b(GetFileTask r0) {
        return r0.i;
    }

    public static /* synthetic */ Handler c(GetFileTask r0) {
        return r0.h;
    }

    private void onError(int r2) {
        onError(r2, null);
    }

    private void release() {
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), false);
        this.e.reset();
        this.f = false;
        this.mRcspOp.unregisterOnRcspCallback(this.k);
        this.i.removeCallbacksAndMessages(null);
        Handler r0 = this.h;
        if (r0 == null) goto L5;
        r0.removeCallbacksAndMessages(null);
        this.h = null;
    L5:
        HandlerThread r1 = this.g;
        if (r1 != null) goto L8;
    L10:
        this.g = null;
        OutputStream r2 = this.c;
        if (r2 != null) goto L23;
        return;
    L23:
        r2.flush();     // Catch: Throwable -> L15 IOException -> L17
        this.c.close();     // Catch: Throwable -> L15 IOException -> L17
        this.c = null;
        return;
    L17:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L15
        this.c = null;
        return;
    L15:
        th = move-exception;
        this.c = null;
        throw th;
    L8:
        if (r1.isInterrupted() == true) goto L10;
        this.g.quit();
        goto L10
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        a(r2, null);
    }

    public abstract ReadFileFromDeviceCmd.Param createParam(BluetoothDevice r1);

    public byte[] getCacheData() {
        return this.d;
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
        if (isDeviceInCalling() == false) goto L14;
        onError(12545);
        return;
    L14:
        b();
        HandlerThread r0 = new HandlerThread("ReadFileThread");
        this.g = r0;
        r0.start();
        this.h = new Handler(this.g.getLooper(), this.j);
        if (BYTE_ARRAY_STREAM.equals(this.b) == false) goto L23;
        this.c = new ByteArrayOutputStream();
    L18:
        c();
        return;
    L23:
        this.c = new FileOutputStream(this.b);     // Catch: FileNotFoundException -> L20
    L20:
        e = move-exception;
        e.printStackTrace();
        onError(4097, RcspUtil.formatString("%s File not found.", new Object[]{WatchError.getErrorDesc(4097)}));
    }

    public static /* synthetic */ void a(GetFileTask r0, int r1, String r2) {
        r0.onError(r1, r2);
    }

    public static /* synthetic */ void b(GetFileTask r0, int r1) {
        r0.onError(r1);
    }

    private void onError(int r4, String r5) {
        JL_Log.e(this.tag, "onError ", "code = " + r4 + ", " + r5);
        release();
        if (r5 != null) goto L6;
        callbackError(r4);
        return;
    L6:
        callbackError(r4, r5);
    }

    public final void c() {
        ReadFileFromDeviceCmd r0 = new ReadFileFromDeviceCmd(createParam(getConnectedDevice()));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r0, new CustomRcspActionCallback("ReadFileFromDevice", new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    public static /* synthetic */ void a(GetFileTask r0, int r1) {
        r0.b(r1);
    }

    public final /* synthetic */ boolean b(Message r3) {
        if (r3 != null) goto L5;
        return false;
    L5:
        int r0 = r3.what;
        if (r0 != 8705) goto L8;
        Object r4 = r3.obj;
        if ((r4 instanceof byte[]) == false) goto L17;
        a((byte[]) r4);
        return true;
    L17:
        return true;
    L8:
        if (r0 != 8706) goto L18;
        a();
        return true;
    L18:
        return true;
    }

    public final /* synthetic */ boolean a(Message r3) {
        if (r3.what != 4386) goto L7;
        JL_Log.w(this.tag, "MSG_WAITING_FOR_DATA_TIMEOUT", "");
        onError(12290, "Waiting for data timeout.");
        return true;
    L7:
        return true;
    }

    public final void a(final int r7, final String r8) {
        if (isRun() == true) goto L5;
        return;
    L5:
        if (this.f == false) goto L10;
        JL_Log.w(this.tag, "cancelBigFileTransfer", "reason : " + r7 + ", " + r8);
        this.f = true;
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new ReadFileFromDeviceCmd(new ReadFileFromDeviceCmd.CancelParam(CHexConver.intToByte(r7))), new BooleanRcspActionCallback("cancelBigFileTransfer", new AnonymousClass3(this, r7, r8)));
        return;
    }

    public final void b() {
        this.e.reset();
        this.d = new byte[0];
        this.f = false;
        this.mRcspOp.registerOnRcspCallback(this.k);
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), true);
        callbackBegin();
    }

    public final void a(byte[] r13) {
        if (isRun() == false) goto L33;
        if (r13 != null) goto L6;
        return;
    L6:
        if (r13.length < 4) goto L35;
        this.i.removeMessages(4386);
        ByteBuffer r0 = ByteBuffer.wrap(r13);
        int r2 = r0.getInt();
        JL_Log.d(this.tag, "onData", "offset = " + r2 + ", lastOffset = " + this.e.lastOffset + ", data size = " + r13.length);
        Param r14 = this.e;
        if (r14.lastOffset != 0) goto L11;
        r14.lastOffset = r2;
    L11:
        int r3 = r14.lastOffset;
        if (r3 == r2) goto L15;
        a(1, RcspUtil.formatString("Offset does not match. sdk count offset = %d, firmware return offset = %d.", new Object[]{Integer.valueOf(r3), Integer.valueOf(r2)}));
        return;
    L15:
        final int r4 = (int) (((r3 * 1.0f) / r14.totalSize) * 100.0f);
        if (r14.lastProgress == r4) goto L19;
        r14.lastProgress = r4;
        this.i.post(new Oi10I0(this, r4));
    L19:
        if (this.useCrc == false) goto L24;
        short r15 = r0.getShort();
        byte[] r5 = new byte[r0.remaining()];
        ByteBuffer r1 = r0.get(r5);
        Param r7 = this.e;
        r7.lastCrc = CryptoUtil.CRC16(r5, r7.lastCrc);
        JL_Log.d(this.tag, "onData", RcspUtil.formatString("crc = %d(0x%X), lastCrc = %d(0x%X)", new Object[]{Short.valueOf(r15), Short.valueOf(r15), Short.valueOf(this.e.lastCrc), Short.valueOf(this.e.lastCrc)}));
        short r8 = this.e.lastCrc;
        if (r15 == r8) goto L31;
        a(2, RcspUtil.formatString("CRC error. data crc = 0x%X, firmware return crc = 0x%X", new Object[]{Short.valueOf(r8), Short.valueOf(r15)}));
        return;
    L31:
        this.c.write(r5);     // Catch: IOException -> L28
        this.e.lastOffset = r2 + r5.length;     // Catch: IOException -> L28
        JL_Log.d(this.tag, "onData", "buf size = " + r5.length + ", lastOffset = " + this.e.lastOffset);     // Catch: IOException -> L28
        this.i.sendEmptyMessageDelayed(4386, (long) TaskBase.TIMEOUT);     // Catch: IOException -> L28
        r1.rewind();
        return;
    L28:
        e = move-exception;
        e.printStackTrace();
        a(1, "IO exception : " + e.getMessage());
        return;
    L24:
        r5 = new byte[r0.remaining()];
        r1 = r0.get(r5);
        goto L31
    L35:
        return;
    }

    public final void b(int r1) {
        release();
        callbackCancel(r1);
    }

    public final /* synthetic */ void a(int r1) {
        callbackProgress(r1);
    }

    public final void a() {
        if (isRun() == true) goto L5;
        return;
    L5:
        OutputStream r0 = this.c;
        if ((r0 instanceof ByteArrayOutputStream) == false) goto L9;
        byte[] r1 = ((ByteArrayOutputStream) r0).toByteArray();
        this.d = r1;
        long r2 = r1.length;
    L13:
        if (r2 == this.e.totalSize) goto L16;
        onError(16387, "Data loss. Firmware return data size = " + this.e.totalSize + ", Actual received data size = " + r2);
        return;
    L16:
        JL_Log.i(this.tag, "onFinish", "Reading file completed. " + this.b);
        release();
        callbackProgress(100);
        callbackFinish();
        return;
    L9:
        if ((r0 instanceof FileOutputStream) == false) goto L11;
        r2 = new File(this.b).length();
        goto L13
    L11:
        r2 = 0;
        goto L13
    }
}
