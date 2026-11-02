package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class DeleteFileTransfer {

    @aa1
    private String mFileName;
    private int type;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteFileTransfer() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeleteFileTransfer copy$default(DeleteFileTransfer deleteFileTransfer, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deleteFileTransfer.type;
        }
        if ((i2 & 2) != 0) {
            str = deleteFileTransfer.mFileName;
        }
        return deleteFileTransfer.copy(i, str);
    }

    public final int component1() {
        return this.type;
    }

    @aa1
    public final String component2() {
        return this.mFileName;
    }

    @aa1
    public final DeleteFileTransfer copy(int i, @aa1 String mFileName) {
        Intrinsics.X0O(mFileName, "mFileName");
        return new DeleteFileTransfer(i, mFileName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteFileTransfer)) {
            return false;
        }
        DeleteFileTransfer deleteFileTransfer = (DeleteFileTransfer) obj;
        return this.type == deleteFileTransfer.type && Intrinsics.XOO0ii0(this.mFileName, deleteFileTransfer.mFileName);
    }

    @aa1
    public final String getMFileName() {
        return this.mFileName;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.mFileName.hashCode();
    }

    public final void setMFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFileName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] bytes = this.mFileName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 5);
        byteBufferAllocate.put((byte) this.type);
        for (int i = 0; i < 3; i++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.put((byte) bytes.length);
        byteBufferAllocate.put(bytes);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.O10IXXX0X(bArrArray, "array(...)");
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "DeleteFileTransfer(type=" + this.type + ", mFileName=" + this.mFileName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public DeleteFileTransfer(int i, @aa1 String mFileName) {
        Intrinsics.X0O(mFileName, "mFileName");
        this.type = i;
        this.mFileName = mFileName;
    }

    public /* synthetic */ DeleteFileTransfer(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
