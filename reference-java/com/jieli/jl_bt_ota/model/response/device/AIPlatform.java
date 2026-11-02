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

    public String getLicense() {
        return this.license;
    }

    public int getPlatform() {
        return this.platform;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.platform = CHexConver.byteToInt(byteBufferWrap.get());
        if (byteBufferWrap.hasRemaining()) {
            byte[] bArr2 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr2);
            try {
                this.license = new String(bArr2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bArr.length;
    }

    public AIPlatform setLicense(String str) {
        this.license = str;
        return this;
    }

    public AIPlatform setPlatform(int i) {
        this.platform = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.platform);
            String str = this.license;
            if (str != null) {
                byteArrayOutputStream.write(str.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "AIPlatform{platform=" + this.platform + ", license='" + this.license + '\'' + i0XO1.f7442IO;
    }
}
