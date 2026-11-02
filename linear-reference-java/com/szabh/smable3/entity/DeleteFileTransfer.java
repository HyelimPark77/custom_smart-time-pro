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
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeleteFileTransfer copy$default(DeleteFileTransfer r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mFileName;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.type;
    }

    @aa1
    public final String component2() {
        return this.mFileName;
    }

    @aa1
    public final DeleteFileTransfer copy(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mFileName");
        return new DeleteFileTransfer(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeleteFileTransfer) == true) goto L8;
        return false;
    L8:
        DeleteFileTransfer r6 = (DeleteFileTransfer) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mFileName, r6.mFileName) == true) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileName = r2;
    }

    public final void setType(int r1) {
        this.type = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] r0 = this.mFileName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        ByteBuffer r1 = ByteBuffer.allocate(r0.length + 5);
        r1.put((byte) this.type);
        int r3 = 0;
    L4:
        if (r3 >= 3) goto L6;
        r1.put((byte) 0);
        r3 = r3 + 1;
        goto L4
    L6:
        r1.put((byte) r0.length);
        r1.put(r0);
        byte[] r2 = r1.array();
        Intrinsics.O10IXXX0X(r2, "array(...)");
        return r2;
    }

    @aa1
    public String toString() {
        return "DeleteFileTransfer(type=" + this.type + ", mFileName=" + this.mFileName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public DeleteFileTransfer(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mFileName");
        this.type = r2;
        this.mFileName = r3;
    }

    public /* synthetic */ DeleteFileTransfer(int r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
