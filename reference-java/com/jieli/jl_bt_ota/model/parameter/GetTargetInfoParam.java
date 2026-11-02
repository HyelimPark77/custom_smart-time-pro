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

    public GetTargetInfoParam(int i) {
        this.mask = i;
        setPlatform((byte) 0);
    }

    public int getMask() {
        return this.mask;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(CHexConver.intToBigBytes(this.mask));
            byteArrayOutputStream.write(this.platform);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte getPlatform() {
        return this.platform;
    }

    public GetTargetInfoParam setMask(int i) {
        this.mask = i;
        return this;
    }

    public GetTargetInfoParam setPlatform(byte b) {
        this.platform = b;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "GetTargetInfoParam{mask=" + this.mask + ", platform=" + ((int) this.platform) + i0XO1.f7442IO;
    }
}
