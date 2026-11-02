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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int STATUS_CHARGE_END = 103;
    public static final int STATUS_CHARGING = 101;
    public static final int STATUS_LOW_POWER = 102;
    public static final int STATUS_NORMAL = 0;
    private int mPower;
    private int mStatus;
    private int mVoltage;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BlePower2() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BlePower2 copy$default(BlePower2 r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mVoltage;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mPower;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mStatus;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BlePower2 copy(int r2, int r3, int r4) {
        return new BlePower2(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "BIG_ENDIAN");
        this.mVoltage = readInt32(r0);
        this.mPower = readUInt8();
        this.mStatus = readUInt8();
        BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BlePower2) == true) goto L8;
        return false;
    L8:
        BlePower2 r6 = (BlePower2) r5;
        if (this.mVoltage == r6.mVoltage) goto L12;
        return false;
    L12:
        if (this.mPower == r6.mPower) goto L15;
        return false;
    L15:
        if (this.mStatus == r6.mStatus) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMPower(int r1) {
        this.mPower = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMVoltage(int r1) {
        this.mVoltage = r1;
    }

    @aa1
    public String toString() {
        return "BlePower2(mVoltage=" + this.mVoltage + ", mPower=" + this.mPower + ", mStatus=" + this.mStatus + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePower2(int r1, int r2, int r3) {
        this.mVoltage = r1;
        this.mPower = r2;
        this.mStatus = r3;
    }

    public /* synthetic */ BlePower2(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
