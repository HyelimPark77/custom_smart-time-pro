package com.jieli.jl_rcsp.task.format;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.NotifyPrepareEnvCmd;
import com.jieli.jl_rcsp.model.command.file_op.DeviceFormatCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;

/* JADX INFO: loaded from: classes17.dex */
class FormatCmdTask extends TaskBase {
    public final byte b;
    public final int c;

    public FormatCmdTask(RcspOpImpl r1, byte r2, int r3) {
        super(r1);
        this.b = r2;
        this.c = r3;
    }

    public static /* synthetic */ void a(FormatCmdTask r0) {
        r0.a();
    }

    public static /* synthetic */ void b(FormatCmdTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r1) {
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        callbackBegin();
        b();
    }

    public static /* synthetic */ void a(FormatCmdTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public static /* synthetic */ void b(FormatCmdTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public final void a() {
        DeviceFormatCmd r0 = new DeviceFormatCmd(new DeviceFormatCmd.Param(this.c));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r0, 30000, new BooleanRcspActionCallback("formatDevice", new AnonymousClass2(this)));
    }

    public final void b() {
        NotifyPrepareEnvCmd r0 = new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.Param((byte) 2));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r0, new BooleanRcspActionCallback("prepareDelEnv", new AnonymousClass1(this)));
    }
}
