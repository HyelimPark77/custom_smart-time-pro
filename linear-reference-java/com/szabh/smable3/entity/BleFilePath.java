package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleFilePath extends BleReadable {
    private int mAttribute;

    @aa1
    private String mName;
    private int mSize;

    public BleFilePath() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleFilePath copy$default(BleFilePath r0, int r1, int r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mSize;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mAttribute;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mName;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mSize;
    }

    public final int component2() {
        return this.mAttribute;
    }

    @aa1
    public final String component3() {
        return this.mName;
    }

    @aa1
    public final BleFilePath copy(int r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "mName");
        return new BleFilePath(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() == null) goto L11;
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (r0.length != 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        this.mSize = readInt32(r2);
        this.mAttribute = readInt8();
        this.mName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        return;
    L12:
        return;
    L7:
        r1 = false;
        goto L8
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleFilePath) == true) goto L8;
        return false;
    L8:
        BleFilePath r6 = (BleFilePath) r5;
        if (this.mSize == r6.mSize) goto L12;
        return false;
    L12:
        if (this.mAttribute == r6.mAttribute) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMAttribute() {
        return this.mAttribute;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mSize) * 31) + Integer.hashCode(this.mAttribute)) * 31) + this.mName.hashCode();
    }

    public final void setMAttribute(int r1) {
        this.mAttribute = r1;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    @aa1
    public String toString() {
        return "BleFilePath(mSize='" + this.mSize + "', mAttribute='" + this.mAttribute + "', mName='" + this.mName + "')";
    }

    public BleFilePath(int r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "mName");
        this.mSize = r2;
        this.mAttribute = r3;
        this.mName = r4;
    }

    public /* synthetic */ BleFilePath(int r2, int r3, String r4, int r5, DefaultConstructorMarker r6) {
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
