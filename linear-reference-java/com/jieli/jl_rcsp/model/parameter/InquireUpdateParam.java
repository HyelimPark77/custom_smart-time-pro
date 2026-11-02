package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class InquireUpdateParam extends BaseParameter {
    private byte[] updateFileFlagData;

    public InquireUpdateParam() {
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return this.updateFileFlagData;
    }

    public byte[] getUpdateFileFlagData() {
        return this.updateFileFlagData;
    }

    public void setUpdateFileFlagData(byte[] r1) {
        this.updateFileFlagData = r1;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "InquireUpdateParam{updateFileFlagData=" + CHexConver.byte2HexStr(this.updateFileFlagData) + i0XO1.IO;
    }

    public InquireUpdateParam(byte[] r1) {
        setUpdateFileFlagData(r1);
    }
}
