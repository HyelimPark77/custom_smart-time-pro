package com.jieli.jl_rcsp.task;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.DeleteFileByNameCmd;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class CallTransferTask extends TransferTask {
    public CallTransferTask(RcspOpImpl r1, String r2, TransferTask.Param r3) {
        super(r1, r2, r3);
    }

    public static /* synthetic */ void a(CallTransferTask r0) {
        super.start();
    }

    @Override // com.jieli.jl_rcsp.task.TransferTask, com.jieli.jl_rcsp.task.ITask
    public void start() {
        DeleteFileByNameCmd r1 = new DeleteFileByNameCmd(new DeleteFileByNameCmd.Param(new File(getPath()).getName()));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r1, new BooleanRcspActionCallback("DeleteFileByName", new AnonymousClass1(this)));
    }
}
