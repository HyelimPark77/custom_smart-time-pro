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

    public static List<LtvBean> parseLTVData(byte[] r1) {
        return parseLTVData(0, r1);
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
    public int parse(byte[] r5) {
        if (r5 == null) goto L21;
        int r2 = 1;
        if (r5.length < 1) goto L21;
        ByteBuffer r6 = ByteBuffer.wrap(r5);
        int r1 = CHexConver.byteToInt(r6.get());
        if (this.version == 0) goto L11;
        r2 = 2;
    L11:
        if (r1 < r2) goto L21;
        if (r1 > r6.remaining()) goto L21;
        setLen(r1);
        if (this.version != 0) goto L18;
        setType(CHexConver.byteToInt(r6.get()));
    L19:
        byte[] r0 = new byte[r1 - r2];
        r6.get(r0);
        setData(r0);
        return r6.position();
    L18:
        setType(r6.getShort());
    L21:
        return 0;
    }

    public LtvBean setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    public LtvBean setLen(int r1) {
        this.len = r1;
        return this;
    }

    public LtvBean setType(int r1) {
        this.type = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.len);     // Catch: IOException -> L6
        if (this.version != 0) goto L8;
        r0.write(this.type);     // Catch: IOException -> L6
    L9:
        byte[] r1 = this.data;     // Catch: IOException -> L6
        if (r1 == null) goto L15;
        r0.write(r1);     // Catch: IOException -> L6
    L15:
        return r0.toByteArray();
    L8:
        r0.write(CHexConver.int2byte2(this.type));     // Catch: IOException -> L6
    L6:
        e = move-exception;
        e.printStackTrace();
        goto L15
    }

    public String toString() {
        return "LtvBean{len=" + this.len + ", type=" + this.type + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }

    public LtvBean(int r3) {
        this(r3, 0, 0, new byte[0]);
    }

    public static List<LtvBean> parseLTVData(int r4, byte[] r5) {
        if (r5 == null) goto L15;
        if (r5.length <= 1) goto L15;
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L8:
        if (r1 >= r5.length) goto L13;
        LtvBean r2 = new LtvBean(r4);
        int r3 = r2.parse(Arrays.copyOfRange(r5, r1, r5.length));
        if (r3 <= 0) goto L13;
        r1 = r1 + r3;
        r0.add(r2);
    L13:
        return r0;
    L15:
        return new ArrayList();
    }

    public LtvBean(int r2, byte[] r3) {
        if (r3 != null) goto L4;
        int r0 = 0;
    L5:
        this(r0 + 1, r2, r3);
        return;
    L4:
        r0 = r3.length;
        goto L5
    }

    public LtvBean(int r2, int r3, byte[] r4) {
        this(0, r2, r3, r4);
    }

    public LtvBean(int r1, int r2, int r3, byte[] r4) {
        this.version = r1;
        this.len = r2;
        this.type = r3;
        this.data = r4;
    }
}
