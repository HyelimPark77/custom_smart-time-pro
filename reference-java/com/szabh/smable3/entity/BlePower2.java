package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BlePower2 extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int STATUS_CHARGE_END = 103;
    public static final int STATUS_CHARGING = 101;
    public static final int STATUS_LOW_POWER = 102;
    public static final int STATUS_NORMAL = 0;
    private int mPower;
    private int mStatus;
    private int mVoltage;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BlePower2() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BlePower2 copy$default(BlePower2 blePower2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = blePower2.mVoltage;
        }
        if ((i4 & 2) != 0) {
            i2 = blePower2.mPower;
        }
        if ((i4 & 4) != 0) {
            i3 = blePower2.mStatus;
        }
        return blePower2.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mVoltage;
    }

    public final int component2() {
        return this.mPower;
    }

    public final int component3() {
        return this.mStatus;
    }

    @aa1
    public final BlePower2 copy(int i, int i2, int i3) {
        return new BlePower2(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(BIG_ENDIAN, "BIG_ENDIAN");
        this.mVoltage = readInt32(BIG_ENDIAN);
        this.mPower = readUInt8();
        this.mStatus = readUInt8();
        BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlePower2)) {
            return false;
        }
        BlePower2 blePower2 = (BlePower2) obj;
        return this.mVoltage == blePower2.mVoltage && this.mPower == blePower2.mPower && this.mStatus == blePower2.mStatus;
    }

    public final int getMPower() {
        return this.mPower;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final int getMVoltage() {
        return this.mVoltage;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mVoltage) * 31) + Integer.hashCode(this.mPower)) * 31) + Integer.hashCode(this.mStatus);
    }

    public final void setMPower(int i) {
        this.mPower = i;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    public final void setMVoltage(int i) {
        this.mVoltage = i;
    }

    @aa1
    public String toString() {
        return "BlePower2(mVoltage=" + this.mVoltage + ", mPower=" + this.mPower + ", mStatus=" + this.mStatus + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePower2(int i, int i2, int i3) {
        this.mVoltage = i;
        this.mPower = i2;
        this.mStatus = i3;
    }

    public /* synthetic */ BlePower2(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
