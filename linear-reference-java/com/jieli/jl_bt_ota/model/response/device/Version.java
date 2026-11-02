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

    public Version() {
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r5) {
        if (r5 != null) goto L4;
        return 0;
    L4:
        if (r5.length < 2) goto L10;
        ByteBuffer r6 = ByteBuffer.wrap(r5);
        short r0 = r6.getShort();
        this.versionCode = r0;
        int r1 = (r0 >> 12) & 15;
        int r2 = (r0 >> 8) & 15;
        int r3 = (r0 >> 4) & 15;
        this.versionName = CommonUtil.formatString("%d.%d.%d.%d", new Object[]{Integer.valueOf(r1), Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r0 & 15)});
        return r6.position();
    L10:
        return 0;
    }

    public Version setVersionCode(int r1) {
        this.versionCode = r1;
        return this;
    }

    public Version setVersionName(String r1) {
        this.versionName = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        return CHexConver.int2byte2(this.versionCode);
    }

    public String toString() {
        return "Version{versionName='" + this.versionName + "', versionCode=" + this.versionCode + i0XO1.IO;
    }
}
