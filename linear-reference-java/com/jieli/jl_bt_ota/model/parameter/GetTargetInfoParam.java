package com.jieli.jl_bt_ota.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetInfoParam extends BaseParameter {
    private int mask;
    private byte platform;

    public GetTargetInfoParam(int r1) {
        this.mask = r1;
        setPlatform((byte) 0);
    }

    public int getMask() {
        return this.mask;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.intToBigBytes(this.mask));     // Catch: IOException -> L5
        r0.write(this.platform);     // Catch: IOException -> L5
    L8:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public byte getPlatform() {
        return this.platform;
    }

    public GetTargetInfoParam setMask(int r1) {
        this.mask = r1;
        return this;
    }

    public GetTargetInfoParam setPlatform(byte r1) {
        this.platform = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "GetTargetInfoParam{mask=" + this.mask + ", platform=" + this.platform + i0XO1.IO;
    }
}
