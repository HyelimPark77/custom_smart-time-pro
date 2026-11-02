package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class AIPlatform implements IDataOp {
    private String license;
    private int platform;

    public AIPlatform() {
    }

    public String getLicense() {
        return this.license;
    }

    public int getPlatform() {
        return this.platform;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r3) {
        if (r3 != null) goto L4;
        return 0;
    L4:
        if (r3.length < 1) goto L19;
        ByteBuffer r0 = ByteBuffer.wrap(r3);
        this.platform = CHexConver.byteToInt(r0.get());
        if (r0.hasRemaining() == false) goto L14;
        byte[] r1 = new byte[r0.remaining()];
        r0.get(r1);
        this.license = new String(r1);     // Catch: Exception -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
    L14:
        return r3.length;
    L19:
        return 0;
    }

    public AIPlatform setLicense(String r1) {
        this.license = r1;
        return this;
    }

    public AIPlatform setPlatform(int r1) {
        this.platform = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.platform);     // Catch: IOException -> L7
        String r1 = this.license;     // Catch: IOException -> L7
        if (r1 == null) goto L10;
        r0.write(r1.getBytes());     // Catch: IOException -> L7
    L10:
        return r0.toByteArray();
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L10
    }

    public String toString() {
        return "AIPlatform{platform=" + this.platform + ", license='" + this.license + '\'' + i0XO1.IO;
    }
}
