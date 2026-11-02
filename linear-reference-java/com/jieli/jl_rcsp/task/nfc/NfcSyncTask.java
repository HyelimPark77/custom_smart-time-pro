package com.jieli.jl_rcsp.task.nfc;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.b81;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.BooleanNfcActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class NfcSyncTask extends TaskBase {
    public final BluetoothDevice b;
    public final int c;
    public final ByteArrayOutputStream d;
    public List<NfcMsg> e;
    public final Handler f;
    public final OnRcspCallback g;

    public NfcSyncTask(RcspOpImpl r3, BluetoothDevice r4, int r5) throws RuntimeException {
        super(r3);
        this.d = new ByteArrayOutputStream();
        this.e = new ArrayList();
        this.f = new Handler(Looper.getMainLooper(), new b81(this));
        this.g = new AnonymousClass2(this);
        this.b = r4;
        this.c = r5;
    }

    public static /* synthetic */ boolean OXO1(NfcSyncTask r0, Message r1) {
        return r0.a(r1);
    }

    public static /* synthetic */ Handler a(NfcSyncTask r0) {
        return r0.f;
    }

    public static /* synthetic */ void b(NfcSyncTask r0) {
        r0.b();
    }

    private void c() {
        this.mRcspOp.registerOnRcspCallback(this.g);
        this.d.reset();
        callbackBegin();
    }

    private void onError(int r4, String r5) {
        JL_Log.e(this.tag, "onError", "code : " + r4 + ", " + r5);
        release();
        if (r5 != null) goto L6;
        callbackError(r4);
        return;
    L6:
        callbackError(r4, r5);
    }

    private void release() {
        this.d.reset();
        this.mRcspOp.unregisterOnRcspCallback(this.g);
        this.f.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r1) {
        isRun();
    }

    public List<NfcMsg> getNfcMsgs() {
        return this.e;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == true) goto L6;
        JL_Log.e(this.tag, "start", "Task is in progress.");
        return;
    L6:
        JL_Log.d(this.tag, "start", "");
        c();
        this.mRcspOp.sendRcspCommand(this.b, CommandBuilder.buildStartNFCInfoSyncCmd(this.c), new BooleanNfcActionCallback("StartNFCInfoSync", new AnonymousClass1(this)));
    }

    public static /* synthetic */ int a() {
        return TaskBase.TIMEOUT;
    }

    private void b() {
        byte[] r0 = this.d.toByteArray();
        this.e = b(r0);
        JL_Log.e(this.tag, "onFinish", "data len : " + r0.length);
        release();
        callbackFinish();
    }

    public static /* synthetic */ void a(NfcSyncTask r0, int r1, String r2) {
        r0.onError(r1, r2);
    }

    public static /* synthetic */ void a(NfcSyncTask r0, byte[] r1) {
        r0.a(r1);
    }

    private /* synthetic */ boolean a(Message r3) {
        if (r3.what != 4386) goto L7;
        JL_Log.e(this.tag, "MSG_WAITING_FOR_DATA_TIMEOUT", "");
        callbackError(12290);
        return true;
    L7:
        return true;
    }

    public final List<NfcMsg> b(byte[] r11) {
        ArrayList r0 = new ArrayList();
        JL_Log.d(this.tag, "parseNfcMsgList", "data = " + CHexConver.byte2HexStr(r11));
        if (r11.length <= 44) goto L14;
        int r2 = 0;
    L6:
        if (r2 >= r11.length) goto L14;
        int r4 = r2 + 42;
        int r6 = r2 + 44;
        if (r11.length <= r6) goto L14;
        int r5 = CHexConver.bytesToInt(r11, r4, 2);
        JL_Log.d(this.tag, "parseNfcMsgList", "nfcHeadLen = " + r5 + ", start = " + r4);
        if (r11.length < (r6 + r5)) goto L14;
        int r7 = r5 + 44;
        byte[] r8 = new byte[r7];
        System.arraycopy(r11, r2, r8, 0, r7);
        r2 = r2 + r7;
        NfcMsg r9 = NfcMsg.parseNfcMsg(r8);
        JL_Log.d(this.tag, "parseNfcMsgList", "nfcMsg = " + r9);
        if (r9 == null) goto L6;
        r0.add(r9);
    L14:
        return r0;
    }

    private void a(byte[] r6) {
        if (isRun() == false) goto L16;
        if (r6 != null) goto L6;
        return;
    L6:
        if (r6.length == 0) goto L18;
        this.f.removeMessages(4386);
        JL_Log.d(this.tag, "onData", "outputStream size =  " + this.d.size() + ", data = " + CHexConver.byte2HexStr(r6));     // Catch: IOException -> L11
        this.d.write(r6);     // Catch: IOException -> L11
        this.f.sendEmptyMessageDelayed(4386, (long) TaskBase.TIMEOUT);     // Catch: IOException -> L11
        return;
    L11:
        e = move-exception;
        e.printStackTrace();
        callbackError(16389, "IO Exception = " + e.getMessage());
        return;
    L18:
        return;
    }
}
