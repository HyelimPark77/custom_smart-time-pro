package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class MultipleFileTransfer {

    @aa1
    private String mFileName;
    private int mFilesTotalSize;
    private int mRetain;

    public MultipleFileTransfer() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ MultipleFileTransfer copy$default(MultipleFileTransfer r0, int r1, int r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mRetain;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mFilesTotalSize;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mFileName;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mRetain;
    }

    public final int component2() {
        return this.mFilesTotalSize;
    }

    @aa1
    public final String component3() {
        return this.mFileName;
    }

    @aa1
    public final MultipleFileTransfer copy(int r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "mFileName");
        return new MultipleFileTransfer(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MultipleFileTransfer) == true) goto L8;
        return false;
    L8:
        MultipleFileTransfer r6 = (MultipleFileTransfer) r5;
        if (this.mRetain == r6.mRetain) goto L12;
        return false;
    L12:
        if (this.mFilesTotalSize == r6.mFilesTotalSize) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mFileName, r6.mFileName) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getMFileName() {
        return this.mFileName;
    }

    public final int getMFilesTotalSize() {
        return this.mFilesTotalSize;
    }

    public final int getMRetain() {
        return this.mRetain;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mRetain) * 31) + Integer.hashCode(this.mFilesTotalSize)) * 31) + this.mFileName.hashCode();
    }

    public final void setMFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileName = r2;
    }

    public final void setMFilesTotalSize(int r1) {
        this.mFilesTotalSize = r1;
    }

    public final void setMRetain(int r1) {
        this.mRetain = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] r0 = this.mFileName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        ByteBuffer r1 = ByteBuffer.allocate(r0.length + 9);
        r1.order(ByteOrder.LITTLE_ENDIAN);
        int r3 = 0;
    L4:
        if (r3 >= 4) goto L6;
        r1.put((byte) 0);
        r3 = r3 + 1;
        goto L4
    L6:
        r1.putInt(this.mFilesTotalSize);
        r1.put((byte) r0.length);
        r1.put(r0);
        byte[] r2 = r1.array();
        Intrinsics.O10IXXX0X(r2, "array(...)");
        return r2;
    }

    @aa1
    public String toString() {
        return "MultipleFileTransfer(mRetain = " + this.mRetain + ", mFilesTotalSize = " + this.mFilesTotalSize + ", mFileName = " + this.mFileName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public MultipleFileTransfer(int r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "mFileName");
        this.mRetain = r2;
        this.mFilesTotalSize = r3;
        this.mFileName = r4;
    }

    public /* synthetic */ MultipleFileTransfer(int r2, int r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
