package com.jieli.jl_rcsp.task.logcat;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.sf2;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.command.ReadErrorMsgCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadLogcatTask extends TaskBase {
    public static int WAIT_CMD_TIMEOUT = 12000;
    public static final int g = 4118;
    public BluetoothDevice b;
    public final ByteArrayOutputStream c;
    public ReadErrorMsgCmd.ReadErrorMsgResponse d;
    public final Handler e;
    public final OnRcspCallback f;

    static {
    }

    public ReadLogcatTask(RcspOpImpl r3) throws RuntimeException {
        super(r3);
        this.c = new ByteArrayOutputStream();
        this.e = new Handler(Looper.getMainLooper(), new sf2(this));
        this.f = new AnonymousClass4(this);
    }

    public static /* synthetic */ boolean OXO1(ReadLogcatTask r0, Message r1) {
        return r0.a(r1);
    }

    public static /* synthetic */ void a(ReadLogcatTask r0, ReadErrorMsgCmd.ReadErrorMsgResponse r1) {
        r0.a(r1);
    }

    public static /* synthetic */ String b(ReadLogcatTask r0) {
        return r0.tag;
    }

    public static /* synthetic */ void c(ReadLogcatTask r0) {
        r0.a();
    }

    public static /* synthetic */ Handler d(ReadLogcatTask r0) {
        return r0.e;
    }

    private void release() {
        this.b = null;
        this.mRcspOp.unregisterOnRcspCallback(this.f);
        this.e.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r1) {
    }

    public byte[] getResult() {
        return this.c.toByteArray();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L7;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L7:
        if (this.mRcspOp.isRcspInit() == true) goto L11;
        a(8192);
        return;
    L11:
        if (this.mRcspOp.getDeviceInfo().isSupportReadErrorMSg() == true) goto L14;
        a(4353);
        return;
    L14:
        JL_Log.d(this.tag, "start", "device support reading error message.");
        c();
    }

    public static /* synthetic */ ReadErrorMsgCmd.ReadErrorMsgResponse a(ReadLogcatTask r0) {
        return r0.d;
    }

    public final void b() {
        this.b = getConnectedDevice();
        this.c.reset();
        this.mRcspOp.registerOnRcspCallback(this.f);
        callbackBegin();
    }

    public final void c() {
        b();
        this.mRcspOp.sendRcspCommand(this.b, CommandBuilder.buildStartReadErrorMsgCmd(), new CustomRcspActionCallback("startReadLogcat", new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    public static /* synthetic */ void a(ReadLogcatTask r0, int r1, String r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ boolean a(ReadLogcatTask r0, BluetoothDevice r1) {
        return r0.a(r1);
    }

    public static /* synthetic */ void a(ReadLogcatTask r0, byte[] r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void a(ReadLogcatTask r0, ReadErrorMsgCmd r1) {
        r0.a(r1);
    }

    private /* synthetic */ boolean a(Message r3) {
        if (r3.what != 4118) goto L9;
        JL_Log.w(this.tag, "MSG_WAIT_COMMAND_TIMEOUT", "");
        if (isRun() == false) goto L10;
        a(12290, "Waiting for data timeout.");
        return true;
    L10:
        return true;
    L9:
        return true;
    }

    public final void a(ReadErrorMsgCmd.ReadErrorMsgResponse r1) {
        this.d = r1;
    }

    public final void a(byte[] r3) {
        if (r3 != null) goto L4;
    L36:
        JL_Log.w(this.tag, "handleLogcat", "invalid param.");
        return;
    L4:
        if (r3.length == 0) goto L36;
        if (isRun() == false) goto L36;
    L13:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L11
        callbackError(16389, "IO Exception = " + e.getMessage());     // Catch: Throwable -> L11
        this.c.close();     // Catch: IOException -> L28
        return;
    L28:
        e = move-exception;
        e.printStackTrace();
        return;
    L11:
        th = move-exception;
        this.c.close();     // Catch: IOException -> L33
    L35:
        throw th;
    L33:
        e = move-exception;
        e.printStackTrace();
        goto L35
    L9:
        if (this.e.hasMessages(4118) == false) goto L15;
        this.e.removeMessages(4118);     // Catch: Throwable -> L11 IOException -> L13
    L15:
        this.c.write(r3);     // Catch: Throwable -> L11 IOException -> L13
        int r4 = this.c.size();     // Catch: Throwable -> L11 IOException -> L13
        if (this.d.getSize() <= 0) goto L45;
        int r5 = (r4 * 100) / this.d.getSize();     // Catch: Throwable -> L11 IOException -> L13
        if (r5 < 100) goto L20;
        r5 = 99;
    L20:
        callbackProgress(r5);     // Catch: Throwable -> L11 IOException -> L13
    L45:
        this.c.close();     // Catch: IOException -> L23
        return;
    L23:
        e = move-exception;
        e.printStackTrace();
    }

    public final void a(ReadErrorMsgCmd r12) {
        if (r12 != null) goto L5;
    L13:
        JL_Log.w(this.tag, "handleStopRead", "Reading logcat did not start.");
        return;
    L5:
        if (isRun() == false) goto L13;
        byte[] r1 = this.c.toByteArray();
        final int r2 = 0;
        final short r3 = CryptoUtil.CRC16(r1, 0);
        final short r4 = this.d.getCrc();
        if (r4 == r3) goto L11;
        r2 = 6;
    L11:
        JL_Log.d(this.tag, "handleStopRead", RcspUtil.formatString("sdk read logcat crc = %d(0x%X), firmware crc = %d(0x%X), status = %d", new Object[]{Short.valueOf(r3), Short.valueOf(r3), Short.valueOf(r4), Short.valueOf(r4), Integer.valueOf(r2)}));
        r12.setStatus(r2);
        ReadErrorMsgCmd.ResponseReadResult r0 = new ReadErrorMsgCmd.ResponseReadResult();
        r0.setSize(r1.length);
        r0.setCrc(r3);
        r12.setParam(r0);
        this.mRcspOp.sendCommandResponse(this.b, r12, new AnonymousClass3(this, r2, r4, r3));
    }

    public final boolean a(BluetoothDevice r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (this.b != null) goto L6;
        return false;
    L6:
        if (r2.getAddress().equals(this.b.getAddress()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final void a(int r2) {
        a(r2, null);
    }

    public final void a(int r4, String r5) {
        JL_Log.w(this.tag, "postError", "code : " + r4 + ", " + r5);
        if (r5 != null) goto L5;
        callbackError(r4);
    L6:
        release();
        return;
    L5:
        callbackError(r4, r5);
        goto L6
    }

    public final void a() {
        callbackProgress(100);
        callbackFinish();
        release();
    }
}
