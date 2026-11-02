package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class FileTransfer {
    private int mCRC16;

    @aa1
    private byte[] mFileByteArray;

    @aa1
    private String mFileName;
    private int mRetain;

    public FileTransfer(int r2, int r3, @aa1 String r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r4, "mFileName");
        Intrinsics.X0O(r5, "mFileByteArray");
        this.mRetain = r2;
        this.mCRC16 = r3;
        this.mFileName = r4;
        this.mFileByteArray = r5;
    }

    public static /* synthetic */ FileTransfer copy$default(FileTransfer r0, int r1, int r2, String r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mRetain;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mCRC16;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mFileName;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mFileByteArray;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mRetain;
    }

    public final int component2() {
        return this.mCRC16;
    }

    @aa1
    public final String component3() {
        return this.mFileName;
    }

    @aa1
    public final byte[] component4() {
        return this.mFileByteArray;
    }

    @aa1
    public final FileTransfer copy(int r2, int r3, @aa1 String r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r4, "mFileName");
        Intrinsics.X0O(r5, "mFileByteArray");
        return new FileTransfer(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FileTransfer) == true) goto L8;
        return false;
    L8:
        FileTransfer r6 = (FileTransfer) r5;
        if (this.mRetain == r6.mRetain) goto L12;
        return false;
    L12:
        if (this.mCRC16 == r6.mCRC16) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mFileName, r6.mFileName) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFileByteArray, r6.mFileByteArray) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMCRC16() {
        return this.mCRC16;
    }

    @aa1
    public final byte[] getMFileByteArray() {
        return this.mFileByteArray;
    }

    @aa1
    public final String getMFileName() {
        return this.mFileName;
    }

    public final int getMRetain() {
        return this.mRetain;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mRetain) * 31) + Integer.hashCode(this.mCRC16)) * 31) + this.mFileName.hashCode()) * 31) + Arrays.hashCode(this.mFileByteArray);
    }

    public final void setMCRC16(int r1) {
        this.mCRC16 = r1;
    }

    public final void setMFileByteArray(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileByteArray = r2;
    }

    public final void setMFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileName = r2;
    }

    public final void setMRetain(int r1) {
        this.mRetain = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] r0 = this.mFileName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        ByteBuffer r1 = ByteBuffer.allocate(r0.length + 7);
        int r3 = 0;
    L4:
        if (r3 >= 4) goto L6;
        r1.put((byte) 0);
        r3 = r3 + 1;
        goto L4
    L6:
        r1.putShort((short) this.mCRC16);
        r1.put((byte) r0.length);
        r1.put(r0);
        byte[] r2 = r1.array();
        Intrinsics.O10IXXX0X(r2, "array(...)");
        return r2;
    }

    @aa1
    public String toString() {
        return "FileTransfer( mFileName = " + this.mFileName + ", mCRC16 = " + this.mCRC16 + " , mFileByteArray.size = " + this.mFileByteArray.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ FileTransfer(int r2, int r3, String r4, byte[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4, r5);
    }
}
