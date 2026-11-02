package com.jieli.jl_rcsp.task.smallfile;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class DeleteFileTask extends TaskBase {
    public final Param b;

    public static class Param {
        public final byte a;
        public final short b;

        public Param(byte r1, short r2) {
            this.b = r2;
            this.a = r1;
        }

        public static /* synthetic */ byte a(Param r0) {
            return r0.a;
        }

        public static /* synthetic */ short b(Param r0) {
            return r0.b;
        }

        public short getId() {
            return this.b;
        }

        public byte getType() {
            return this.a;
        }
    }

    public DeleteFileTask(RcspOpImpl r1, Param r2) throws RuntimeException {
        super(r1);
        if (r2 == null) goto L7;
        this.b = r2;
        return;
    L7:
        throw new RuntimeException("DeleteFileTask.Param can not be null.");
    }

    public static /* synthetic */ void a(DeleteFileTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r1) {
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        callbackBegin();
        SmallFileTransferCmd.DeleteFileParam r0 = new SmallFileTransferCmd.DeleteFileParam(Param.a(this.b), Param.b(this.b));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(r0), 5000, new CustomRcspActionCallback(this.tag + "#SmallFileTransfer", new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    public static /* synthetic */ void a(DeleteFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }
}
