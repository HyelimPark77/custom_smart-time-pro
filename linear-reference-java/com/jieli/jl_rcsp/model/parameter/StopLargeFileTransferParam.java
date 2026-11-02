package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class StopLargeFileTransferParam extends BaseParameter {
    private String name;
    private int reason;

    public StopLargeFileTransferParam() {
    }

    public String getName() {
        return this.name;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return this.name.getBytes("GBK");
    L4:
        e = move-exception;
        e.printStackTrace();
        return getName().getBytes();
    }

    public int getReason() {
        return this.reason;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setReason(int r1) {
        this.reason = r1;
    }
}
