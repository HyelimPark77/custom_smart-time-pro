package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.interfaces.record.IRecordOp;
import com.jieli.jl_rcsp.interfaces.record.OnRecordStateCallback;
import com.jieli.jl_rcsp.model.RecordParam;
import com.jieli.jl_rcsp.model.RecordState;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.speech.StartSpeechCmd;
import com.jieli.jl_rcsp.model.command.speech.StopSpeechCmd;
import com.jieli.jl_rcsp.model.parameter.StartSpeechParam;
import com.jieli.jl_rcsp.model.parameter.StopSpeechParam;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.RecordStateCallbackHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class RecordOpImpl implements IRecordOp {
    public final String a;
    public final RcspOpImpl b;
    public final RecordState c;
    public final RecordStateCallbackHelper d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final RcspCommandCallback<CommandBase> h;
    public final OnRcspCallback i;

    public RecordOpImpl(RcspOpImpl r3) {
        this.a = RecordOpImpl.class.getSimpleName();
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = new AnonymousClass3(this);
        OnRcspCallback r0 = new AnonymousClass4(this);
        this.i = r0;
        if (r3 == null) goto L7;
        this.b = r3;
        this.c = new RecordState();
        this.d = new RecordStateCallbackHelper();
        r3.registerOnRcspCallback(r0);
        return;
    L7:
        throw new NullPointerException("RcspOpImpl can not be null.");
    }

    public static /* synthetic */ void a(RecordOpImpl r0, BluetoothDevice r1, int r2, String r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ boolean b(RecordOpImpl r0) {
        return r0.e;
    }

    public static /* synthetic */ boolean c(RecordOpImpl r0) {
        return r0.f;
    }

    public static /* synthetic */ boolean d(RecordOpImpl r0) {
        return r0.a();
    }

    public static /* synthetic */ RcspCommandCallback e(RecordOpImpl r0) {
        return r0.h;
    }

    public static /* synthetic */ RcspOpImpl f(RecordOpImpl r0) {
        return r0.b;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void addOnRecordStateCallback(OnRecordStateCallback r2) {
        this.d.addOnRecordStateCallback(r2);
    }

    public BluetoothDevice getConnectedDevice() {
        return this.b.getConnectedDevice();
    }

    public RcspOpImpl getRcspOp() {
        return this.b;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public RecordState getRecordState() {
        return this.c;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void release() {
        stopRecord(this.b.getConnectedDevice(), 1, false, false, false, null);
        this.b.unregisterOnRcspCallback(this.i);
        this.d.release();
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void removeOnRecordStateCallback(OnRecordStateCallback r2) {
        this.d.removeOnRecordStateCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void setSupportPlayTTS(boolean r1) {
        this.g = r1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void setSupportSyncIatText(boolean r1) {
        this.e = r1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void setSupportSyncNlpText(boolean r1) {
        this.f = r1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void startRecord(final BluetoothDevice r6, RecordParam r7, final OnOperationCallback<Boolean> r8) {
        if (r7 != null) goto L7;
        if (r8 == null) goto L13;
        r8.onFailed(new BaseError(4097, "startRecord : RecordParam is null."));
        return;
    L13:
        return;
    L7:
        if (a() == false) goto L11;
        if (r8 == null) goto L14;
        r8.onFailed(new BaseError(12291, "startRecord : Recording"));
        return;
    L14:
        return;
    L11:
        a(r6, r7);
        this.b.sendRcspCommand(r6, new StartSpeechCmd(new StartSpeechParam(CHexConver.intToByte(r7.getVoiceType()), CHexConver.intToByte(r7.getSampleRate()), CHexConver.intToByte(r7.getVadWay()))), new BooleanRcspActionCallback("startRecord", new AnonymousClass1(this, r8, r6)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void stopRecord(BluetoothDevice r3, final int r4, boolean r5, boolean r6, boolean r7, final OnOperationCallback<Boolean> r8) {
        if (a() == true) goto L7;
        if (r8 == null) goto L9;
        r8.onFailed(new BaseError(4097, "Recording is not started."));
        return;
    L9:
        return;
    L7:
        this.e = r5;
        this.f = r6;
        this.g = r7;
        StopSpeechParam r0 = new StopSpeechParam();
        r0.setReason(CHexConver.intToByte(r4));
        r0.setSyncIatText(r5);
        r0.setSyncNlpText(r6);
        r0.setPlayTTS(r7);
        this.b.sendRcspCommand(r3, new StopSpeechCmd(r0), new AnonymousClass2(this, r4, r8));
    }

    public static /* synthetic */ boolean a(RecordOpImpl r0) {
        return r0.g;
    }

    public static /* synthetic */ void a(RecordOpImpl r0, BluetoothDevice r1, int r2, boolean r3, boolean r4, boolean r5) {
        r0.a(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void a(RecordOpImpl r0, BluetoothDevice r1, RecordParam r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void a(RecordOpImpl r0, BluetoothDevice r1, byte[] r2) {
        r0.a(r1, r2);
    }

    public final boolean a() {
        if (this.c.getState() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void a(BluetoothDevice r3, RecordParam r4) {
        if (r4 != null) goto L4;
    L8:
        JL_Log.w(this.a, "cbRecordStart", "RecordParam is null or state error. " + this.c.getState());
        return;
    L4:
        if (a() == true) goto L8;
        this.c.setState(1).setRecordParam(r4).setVoiceData(new byte[0]);
        this.d.onStateChange(r3, this.c);
    }

    public final void a(BluetoothDevice r4, byte[] r5) {
        if (r5 != null) goto L4;
    L21:
        JL_Log.w(this.a, "cbRecordWorking", "data is null or state error. " + this.c.getState());
        return;
    L4:
        if (r5.length == 0) goto L21;
        if (a() == false) goto L21;
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
    L14:
        e = move-exception;
        e.printStackTrace();
    L19:
        this.c.setState(2).setVoiceDataBlock(r5).setVoiceData(r0.toByteArray());
        this.d.onStateChange(r4, this.c);
        return;
    L10:
        if (this.c.getVoiceData() != null) goto L12;
    L16:
        r0.write(r5);     // Catch: IOException -> L14
        goto L19
    L12:
        if (this.c.getVoiceData().length <= 0) goto L16;
        r0.write(this.c.getVoiceData());     // Catch: IOException -> L14
        goto L16
    }

    public final void a(BluetoothDevice r3, int r4, boolean r5, boolean r6, boolean r7) {
        if (a() == true) goto L6;
        JL_Log.w(this.a, "cbRecordStop", "state error. " + this.c.getState() + ", reason = " + r4);
        return;
    L6:
        this.c.setState(0).setVoiceDataBlock(new byte[0]).setSyncIatText(r5).setSyncNlpText(r6).setPlayTTS(r7).setReason(r4);
        this.d.onStateChange(r3, this.c);
    }

    public final void a(BluetoothDevice r4, int r5, String r6) {
        if (a() == true) goto L6;
        JL_Log.w(this.a, "cbRecordError", "state error. " + this.c.getState() + ", code = " + r5 + ", explain = " + r6);
        return;
    L6:
        this.c.setState(0).setVoiceDataBlock(new byte[0]).setVoiceData(new byte[0]).setReason(r5).setMessage(r6);
        this.d.onStateChange(r4, this.c);
    }
}
