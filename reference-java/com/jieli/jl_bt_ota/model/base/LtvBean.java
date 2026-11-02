package com.jieli.jl_bt_ota.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class LtvBean implements IDataOp {
    public static final int VERSION_0 = 0;
    public static final int VERSION_1 = 1;
    private byte[] data;
    private int len;
    private int type;
    private final int version;

    public LtvBean() {
        this(0, 0, new byte[0]);
    }

    public static List<LtvBean> parseLTVData(byte[] bArr) {
        return parseLTVData(0, bArr);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLen() {
        return this.len;
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length >= 1) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                int iByteToInt = CHexConver.byteToInt(byteBufferWrap.get());
                int i = this.version != 0 ? 2 : 1;
                if (iByteToInt >= i && iByteToInt <= byteBufferWrap.remaining()) {
                    setLen(iByteToInt);
                    if (this.version == 0) {
                        setType(CHexConver.byteToInt(byteBufferWrap.get()));
                    } else {
                        setType(byteBufferWrap.getShort());
                    }
                    byte[] bArr2 = new byte[iByteToInt - i];
                    byteBufferWrap.get(bArr2);
                    setData(bArr2);
                    return byteBufferWrap.position();
                }
            }
        }
        return 0;
    }

    public LtvBean setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public LtvBean setLen(int i) {
        this.len = i;
        return this;
    }

    public LtvBean setType(int i) {
        this.type = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.len);
            if (this.version == 0) {
                byteArrayOutputStream.write(this.type);
            } else {
                byteArrayOutputStream.write(CHexConver.int2byte2(this.type));
            }
            byte[] bArr = this.data;
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "LtvBean{len=" + this.len + ", type=" + this.type + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.f7442IO;
    }

    public LtvBean(int i) {
        this(i, 0, 0, new byte[0]);
    }

    public static List<LtvBean> parseLTVData(int i, byte[] bArr) {
        LtvBean ltvBean;
        int i2;
        if (bArr == null || bArr.length <= 1) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < bArr.length && (i2 = (ltvBean = new LtvBean(i)).parse(Arrays.copyOfRange(bArr, i3, bArr.length))) > 0) {
            i3 += i2;
            arrayList.add(ltvBean);
        }
        return arrayList;
    }

    public LtvBean(int i, byte[] bArr) {
        this((bArr == null ? 0 : bArr.length) + 1, i, bArr);
    }

    public LtvBean(int i, int i2, byte[] bArr) {
        this(0, i, i2, bArr);
    }

    public LtvBean(int i, int i2, int i3, byte[] bArr) {
        this.version = i;
        this.len = i2;
        this.type = i3;
        this.data = bArr;
    }
}
