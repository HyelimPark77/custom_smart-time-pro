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

    public FileTransfer(int i, int i2, @aa1 String mFileName, @aa1 byte[] mFileByteArray) {
        Intrinsics.X0O(mFileName, "mFileName");
        Intrinsics.X0O(mFileByteArray, "mFileByteArray");
        this.mRetain = i;
        this.mCRC16 = i2;
        this.mFileName = mFileName;
        this.mFileByteArray = mFileByteArray;
    }

    public static /* synthetic */ FileTransfer copy$default(FileTransfer fileTransfer, int i, int i2, String str, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fileTransfer.mRetain;
        }
        if ((i3 & 2) != 0) {
            i2 = fileTransfer.mCRC16;
        }
        if ((i3 & 4) != 0) {
            str = fileTransfer.mFileName;
        }
        if ((i3 & 8) != 0) {
            bArr = fileTransfer.mFileByteArray;
        }
        return fileTransfer.copy(i, i2, str, bArr);
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
    public final FileTransfer copy(int i, int i2, @aa1 String mFileName, @aa1 byte[] mFileByteArray) {
        Intrinsics.X0O(mFileName, "mFileName");
        Intrinsics.X0O(mFileByteArray, "mFileByteArray");
        return new FileTransfer(i, i2, mFileName, mFileByteArray);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileTransfer)) {
            return false;
        }
        FileTransfer fileTransfer = (FileTransfer) obj;
        return this.mRetain == fileTransfer.mRetain && this.mCRC16 == fileTransfer.mCRC16 && Intrinsics.XOO0ii0(this.mFileName, fileTransfer.mFileName) && Intrinsics.XOO0ii0(this.mFileByteArray, fileTransfer.mFileByteArray);
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

    public final void setMCRC16(int i) {
        this.mCRC16 = i;
    }

    public final void setMFileByteArray(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mFileByteArray = bArr;
    }

    public final void setMFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFileName = str;
    }

    public final void setMRetain(int i) {
        this.mRetain = i;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] bytes = this.mFileName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 7);
        for (int i = 0; i < 4; i++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.putShort((short) this.mCRC16);
        byteBufferAllocate.put((byte) bytes.length);
        byteBufferAllocate.put(bytes);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.O10IXXX0X(bArrArray, "array(...)");
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "FileTransfer( mFileName = " + this.mFileName + ", mCRC16 = " + this.mCRC16 + " , mFileByteArray.size = " + this.mFileByteArray.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ FileTransfer(int i, int i2, String str, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, bArr);
    }
}
