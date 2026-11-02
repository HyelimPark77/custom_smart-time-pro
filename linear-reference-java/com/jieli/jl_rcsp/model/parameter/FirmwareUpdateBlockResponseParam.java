package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class FirmwareUpdateBlockResponseParam extends FirmwareUpdateBlockParam {
    private byte[] blockData;

    public FirmwareUpdateBlockResponseParam(byte[] r1) {
        this.blockData = r1;
    }

    public byte[] getBlockData() {
        return this.blockData;
    }

    @Override // com.jieli.jl_rcsp.model.parameter.FirmwareUpdateBlockParam, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return this.blockData;
    }

    public void setBlockData(byte[] r1) {
        this.blockData = r1;
    }

    @Override // com.jieli.jl_rcsp.model.parameter.FirmwareUpdateBlockParam, com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "FirmwareUpdateBlockResponseParam{blockData=" + CHexConver.byte2HexStr(this.blockData) + i0XO1.IO;
    }
}
