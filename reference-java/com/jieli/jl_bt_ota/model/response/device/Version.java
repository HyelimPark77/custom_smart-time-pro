package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class Version implements IDataOp {
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
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        short s = byteBufferWrap.getShort();
        this.versionCode = s;
        this.versionName = CommonUtil.formatString("%d.%d.%d.%d", Integer.valueOf((s >> 12) & 15), Integer.valueOf((s >> 8) & 15), Integer.valueOf((s >> 4) & 15), Integer.valueOf(s & 15));
        return byteBufferWrap.position();
    }

    public Version setVersionCode(int i) {
        this.versionCode = i;
        return this;
    }

    public Version setVersionName(String str) {
        this.versionName = str;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        return CHexConver.int2byte2(this.versionCode);
    }

    public String toString() {
        return "Version{versionName='" + this.versionName + "', versionCode=" + this.versionCode + i0XO1.f7442IO;
    }
}
