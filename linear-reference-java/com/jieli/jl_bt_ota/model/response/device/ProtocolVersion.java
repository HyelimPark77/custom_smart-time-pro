package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class ProtocolVersion implements IDataOp {
    private int versionCode;
    private String versionName;

    public ProtocolVersion() {
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r4) {
        if (r4 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r4.length < 1) goto L9;
        byte r5 = r4[0];
        this.versionCode = CHexConver.byteToInt(r5);
        int r0 = (r5 >> 4) & 15;
        this.versionName = CommonUtil.formatString("%d.%d", new Object[]{Integer.valueOf(r0), Integer.valueOf(r5 & 15)});
        return 1;
    }

    public ProtocolVersion setVersionCode(int r1) {
        this.versionCode = r1;
        return this;
    }

    public ProtocolVersion setVersionName(String r1) {
        this.versionName = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        return new byte[]{CHexConver.intToByte(this.versionCode)};
    }

    public String toString() {
        return "ProtocolVersion{versionCode=" + this.versionCode + ", versionName='" + this.versionName + '\'' + i0XO1.IO;
    }
}
