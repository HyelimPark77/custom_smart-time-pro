package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class DataParam extends BaseParameter {
    private final byte[] data;

    public DataParam(byte[] r1) {
        this.data = r1;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return this.data;
    }
}
