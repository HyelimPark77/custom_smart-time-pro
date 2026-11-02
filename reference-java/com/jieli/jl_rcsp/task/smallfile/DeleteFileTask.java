package com.jieli.jl_rcsp.task.smallfile;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class DeleteFileTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final Param f38160b;

    public static class Param {

        /* JADX INFO: renamed from: a */
        public final byte f38163a;

        /* JADX INFO: renamed from: b */
        public final short f38164b;

        public Param(byte b, short s) {
            this.f38164b = s;
            this.f38163a = b;
        }

        public short getId() {
            return this.f38164b;
        }

        public byte getType() {
            return this.f38163a;
        }
    }

    public DeleteFileTask(RcspOpImpl rcspOpImpl, Param param) throws RuntimeException {
        super(rcspOpImpl);
        if (param == null) {
            throw new RuntimeException("DeleteFileTask.Param can not be null.");
        }
        this.f38160b = param;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
            return;
        }
        callbackBegin();
        SmallFileTransferCmd.DeleteFileParam deleteFileParam = new SmallFileTransferCmd.DeleteFileParam(this.f38160b.f38163a, this.f38160b.f38164b);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(deleteFileParam), 5000, new CustomRcspActionCallback(this.tag + "#SmallFileTransfer", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.smallfile.DeleteFileTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                DeleteFileTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                DeleteFileTask.this.callbackFinish();
            }
        }, new IHandleResult<Boolean, SmallFileTransferCmd>() { // from class: com.jieli.jl_rcsp.task.smallfile.DeleteFileTask.2
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public Boolean handleResult(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                return Boolean.TRUE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                if (smallFileTransferCmd == null) {
                    return -1;
                }
                SmallFileTransferCmd.Response response = (SmallFileTransferCmd.Response) smallFileTransferCmd.getResponse();
                if (response instanceof SmallFileTransferCmd.ResultResponse) {
                    return ((SmallFileTransferCmd.ResultResponse) response).ret;
                }
                return -1;
            }
        }));
    }
}
