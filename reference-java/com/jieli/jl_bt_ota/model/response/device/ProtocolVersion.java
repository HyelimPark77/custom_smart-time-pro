package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class ProtocolVersion implements IDataOp {
    private int versionCode;
    private String versionName;

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return 0;
        }
        byte b = bArr[0];
        this.versionCode = CHexConver.byteToInt(b);
        this.versionName = CommonUtil.formatString("%d.%d", Integer.valueOf((b >> 4) & 15), Integer.valueOf(b & 15));
        return 1;
    }

    public ProtocolVersion setVersionCode(int i) {
        this.versionCode = i;
        return this;
    }

    public ProtocolVersion setVersionName(String str) {
        this.versionName = str;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        return new byte[]{CHexConver.intToByte(this.versionCode)};
    }

    public String toString() {
        return "ProtocolVersion{versionCode=" + this.versionCode + ", versionName='" + this.versionName + '\'' + i0XO1.f7442IO;
    }
}
