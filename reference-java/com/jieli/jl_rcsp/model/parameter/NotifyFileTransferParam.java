package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyFileTransferParam extends BaseParameter {

    /* JADX INFO: renamed from: op */
    private int f38034op;

    public NotifyFileTransferParam() {
    }

    public int getOp() {
        return this.f38034op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{CHexConver.intToByte(this.f38034op)};
    }

    public NotifyFileTransferParam setOp(int i) {
        this.f38034op = i;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "NotifyFileTransferParam{op=" + this.f38034op + "} " + super.toString();
    }

    public NotifyFileTransferParam(int i) {
        setOp(i);
    }
}
