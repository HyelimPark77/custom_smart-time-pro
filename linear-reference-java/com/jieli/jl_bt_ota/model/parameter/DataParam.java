package com.jieli.jl_bt_ota.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DataParam extends BaseParameter {
    private final byte[] data;

    public DataParam(byte[] r1) {
        this.data = r1;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        byte[] r0 = this.data;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new byte[0];
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "DataParam{data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }
}
