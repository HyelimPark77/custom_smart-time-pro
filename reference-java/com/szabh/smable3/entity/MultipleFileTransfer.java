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
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ MultipleFileTransfer copy$default(MultipleFileTransfer multipleFileTransfer, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = multipleFileTransfer.mRetain;
        }
        if ((i3 & 2) != 0) {
            i2 = multipleFileTransfer.mFilesTotalSize;
        }
        if ((i3 & 4) != 0) {
            str = multipleFileTransfer.mFileName;
        }
        return multipleFileTransfer.copy(i, i2, str);
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
    public final MultipleFileTransfer copy(int i, int i2, @aa1 String mFileName) {
        Intrinsics.X0O(mFileName, "mFileName");
        return new MultipleFileTransfer(i, i2, mFileName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleFileTransfer)) {
            return false;
        }
        MultipleFileTransfer multipleFileTransfer = (MultipleFileTransfer) obj;
        return this.mRetain == multipleFileTransfer.mRetain && this.mFilesTotalSize == multipleFileTransfer.mFilesTotalSize && Intrinsics.XOO0ii0(this.mFileName, multipleFileTransfer.mFileName);
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

    public final void setMFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFileName = str;
    }

    public final void setMFilesTotalSize(int i) {
        this.mFilesTotalSize = i;
    }

    public final void setMRetain(int i) {
        this.mRetain = i;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] bytes = this.mFileName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 9);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < 4; i++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.putInt(this.mFilesTotalSize);
        byteBufferAllocate.put((byte) bytes.length);
        byteBufferAllocate.put(bytes);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.O10IXXX0X(bArrArray, "array(...)");
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "MultipleFileTransfer(mRetain = " + this.mRetain + ", mFilesTotalSize = " + this.mFilesTotalSize + ", mFileName = " + this.mFileName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public MultipleFileTransfer(int i, int i2, @aa1 String mFileName) {
        Intrinsics.X0O(mFileName, "mFileName");
        this.mRetain = i;
        this.mFilesTotalSize = i2;
        this.mFileName = mFileName;
    }

    public /* synthetic */ MultipleFileTransfer(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
