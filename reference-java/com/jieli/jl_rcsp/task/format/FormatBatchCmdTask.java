package com.jieli.jl_rcsp.task.format;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.BatchCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
class FormatBatchCmdTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final byte f38115b;

    public FormatBatchCmdTask(RcspOpImpl rcspOpImpl, byte b) throws RuntimeException {
        super(rcspOpImpl);
        this.f38115b = b;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        callbackBegin();
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new BatchCmd(new BatchCmd.Param(this.f38115b, new byte[]{1})), new CustomRcspActionCallback("FormatBatchCmd", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.format.FormatBatchCmdTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                FormatBatchCmdTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                FormatBatchCmdTask.this.callbackFinish();
            }
        }, new IHandleResult<Boolean, BatchCmd>() { // from class: com.jieli.jl_rcsp.task.format.FormatBatchCmdTask.2
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public Boolean handleResult(BluetoothDevice bluetoothDevice, BatchCmd batchCmd) {
                return Boolean.TRUE;
            }

            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice, BatchCmd batchCmd) {
                BatchCmd.Response response;
                if (batchCmd == null || (response = batchCmd.getResponse()) == null) {
                    return -1;
                }
                return CHexConver.byteToInt(response.getRet());
            }
        }));
    }
}
