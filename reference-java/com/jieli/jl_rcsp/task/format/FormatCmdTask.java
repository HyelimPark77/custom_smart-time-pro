package com.jieli.jl_rcsp.task.format;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.NotifyPrepareEnvCmd;
import com.jieli.jl_rcsp.model.command.file_op.DeviceFormatCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;

/* JADX INFO: loaded from: classes17.dex */
class FormatCmdTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final byte f38118b;

    /* JADX INFO: renamed from: c */
    public final int f38119c;

    public FormatCmdTask(RcspOpImpl rcspOpImpl, byte b, int i) {
        super(rcspOpImpl);
        this.f38118b = b;
        this.f38119c = i;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        callbackBegin();
        m27542b();
    }

    /* JADX INFO: renamed from: a */
    public final void m27541a() {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new DeviceFormatCmd(new DeviceFormatCmd.Param(this.f38119c)), 30000, new BooleanRcspActionCallback("formatDevice", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.format.FormatCmdTask.2
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                FormatCmdTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                FormatCmdTask.this.callbackFinish();
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public final void m27542b() {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.Param((byte) 2)), new BooleanRcspActionCallback("prepareDelEnv", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.format.FormatCmdTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                FormatCmdTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                FormatCmdTask.this.m27541a();
            }
        }));
    }
}
