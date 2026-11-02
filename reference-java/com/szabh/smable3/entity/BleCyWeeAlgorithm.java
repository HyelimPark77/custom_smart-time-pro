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
        this(0, null, 0, 7, null);
    }

    public static /* synthetic */ BleCyWeeAlgorithm copy$default(BleCyWeeAlgorithm bleCyWeeAlgorithm, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleCyWeeAlgorithm.mUuidLength;
        }
        if ((i3 & 2) != 0) {
            str = bleCyWeeAlgorithm.mUUID;
        }
        if ((i3 & 4) != 0) {
            i2 = bleCyWeeAlgorithm.mType;
        }
        return bleCyWeeAlgorithm.copy(i, str, i2);
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
    public final BleCyWeeAlgorithm copy(int i, @aa1 String mUUID, int i2) {
        Intrinsics.X0O(mUUID, "mUUID");
        return new BleCyWeeAlgorithm(i, mUUID, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        this.mUuidLength = uInt8;
        this.mUUID = readString(uInt8, Charsets.XIi00iiXO);
        this.mType = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCyWeeAlgorithm)) {
            return false;
        }
        BleCyWeeAlgorithm bleCyWeeAlgorithm = (BleCyWeeAlgorithm) obj;
        return this.mUuidLength == bleCyWeeAlgorithm.mUuidLength && Intrinsics.XOO0ii0(this.mUUID, bleCyWeeAlgorithm.mUUID) && this.mType == bleCyWeeAlgorithm.mType;
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

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMUUID(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUUID = str;
    }

    public final void setMUuidLength(int i) {
        this.mUuidLength = i;
    }

    @aa1
    public String toString() {
        return "BleCyWeeAlgorithm(mUuidLength=" + this.mUuidLength + ", mUUID=" + this.mUUID + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCyWeeAlgorithm(int i, @aa1 String mUUID, int i2) {
        Intrinsics.X0O(mUUID, "mUUID");
        this.mUuidLength = i;
        this.mUUID = mUUID;
        this.mType = i2;
    }

    public /* synthetic */ BleCyWeeAlgorithm(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
