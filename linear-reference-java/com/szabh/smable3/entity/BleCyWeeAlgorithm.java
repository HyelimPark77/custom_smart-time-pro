package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCyWeeAlgorithm extends BleReadable {
    private int mType;

    @aa1
    private String mUUID;
    private int mUuidLength;

    public BleCyWeeAlgorithm() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleCyWeeAlgorithm copy$default(BleCyWeeAlgorithm r0, int r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mUuidLength;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mUUID;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mType;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mUuidLength;
    }

    @aa1
    public final String component2() {
        return this.mUUID;
    }

    public final int component3() {
        return this.mType;
    }

    @aa1
    public final BleCyWeeAlgorithm copy(int r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "mUUID");
        return new BleCyWeeAlgorithm(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
        this.mUuidLength = r0;
        this.mUUID = readString(r0, Charsets.XIi00iiXO);
        this.mType = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCyWeeAlgorithm) == true) goto L8;
        return false;
    L8:
        BleCyWeeAlgorithm r6 = (BleCyWeeAlgorithm) r5;
        if (this.mUuidLength == r6.mUuidLength) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mUUID, r6.mUUID) == true) goto L15;
        return false;
    L15:
        if (this.mType == r6.mType) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final String getMUUID() {
        return this.mUUID;
    }

    public final int getMUuidLength() {
        return this.mUuidLength;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mUuidLength) * 31) + this.mUUID.hashCode()) * 31) + Integer.hashCode(this.mType);
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUUID(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUUID = r2;
    }

    public final void setMUuidLength(int r1) {
        this.mUuidLength = r1;
    }

    @aa1
    public String toString() {
        return "BleCyWeeAlgorithm(mUuidLength=" + this.mUuidLength + ", mUUID=" + this.mUUID + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCyWeeAlgorithm(int r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "mUUID");
        this.mUuidLength = r2;
        this.mUUID = r3;
        this.mType = r4;
    }

    public /* synthetic */ BleCyWeeAlgorithm(int r2, String r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
