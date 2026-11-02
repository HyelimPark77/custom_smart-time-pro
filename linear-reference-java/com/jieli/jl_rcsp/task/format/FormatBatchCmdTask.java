package com.jieli.jl_rcsp.task.format;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.BatchCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;

/* JADX INFO: loaded from: classes17.dex */
class FormatBatchCmdTask extends TaskBase {
    public final byte b;

    public FormatBatchCmdTask(RcspOpImpl r1, byte r2) throws RuntimeException {
        super(r1);
        this.b = r2;
    }

    public static /* synthetic */ void a(FormatBatchCmdTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r1) {
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        callbackBegin();
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new BatchCmd(new BatchCmd.Param(this.b, new byte[]{1})), new CustomRcspActionCallback("FormatBatchCmd", new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    public static /* synthetic */ void a(FormatBatchCmdTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }
}
