package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGsensorData extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 7;
    private int mType;

    /* JADX INFO: renamed from: mX */
    private int f55335mX;

    /* JADX INFO: renamed from: mY */
    private int f55336mY;

    /* JADX INFO: renamed from: mZ */
    private int f55337mZ;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGsensorData() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleGsensorData copy$default(BleGsensorData bleGsensorData, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleGsensorData.mType;
        }
        if ((i5 & 2) != 0) {
            i2 = bleGsensorData.f55335mX;
        }
        if ((i5 & 4) != 0) {
            i3 = bleGsensorData.f55336mY;
        }
        if ((i5 & 8) != 0) {
            i4 = bleGsensorData.f55337mZ;
        }
        return bleGsensorData.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.f55335mX;
    }

    public final int component3() {
        return this.f55336mY;
    }

    public final int component4() {
        return this.f55337mZ;
    }

    @aa1
    public final BleGsensorData copy(int i, int i2, int i3, int i4) {
        return new BleGsensorData(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55335mX = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55336mY = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55337mZ = readInt16(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGsensorData)) {
            return false;
        }
        BleGsensorData bleGsensorData = (BleGsensorData) obj;
        return this.mType == bleGsensorData.mType && this.f55335mX == bleGsensorData.f55335mX && this.f55336mY == bleGsensorData.f55336mY && this.f55337mZ == bleGsensorData.f55337mZ;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMX() {
        return this.f55335mX;
    }

    public final int getMY() {
        return this.f55336mY;
    }

    public final int getMZ() {
        return this.f55337mZ;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.f55335mX)) * 31) + Integer.hashCode(this.f55336mY)) * 31) + Integer.hashCode(this.f55337mZ);
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMX(int i) {
        this.f55335mX = i;
    }

    public final void setMY(int i) {
        this.f55336mY = i;
    }

    public final void setMZ(int i) {
        this.f55337mZ = i;
    }

    @aa1
    public String toString() {
        return "BleGsensorData(mType=" + this.mType + ", mX=" + this.f55335mX + ", mY=" + this.f55336mY + ", mZ=" + this.f55337mZ + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGsensorData(int i, int i2, int i3, int i4) {
        this.mType = i;
        this.f55335mX = i2;
        this.f55336mY = i3;
        this.f55337mZ = i4;
    }

    public /* synthetic */ BleGsensorData(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
