package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLactateThreshold extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mAvgPower;
    private int mMaxPower;
    private int mMode;
    private int mPace;
    private int mPower;
    private int mSpeed;

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

    public BleLactateThreshold() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleLactateThreshold copy$default(BleLactateThreshold r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mMode;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mPace;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mPower;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mAvgPower;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mMaxPower;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mSpeed;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mMode;
    }

    public final int component2() {
        return this.mPace;
    }

    public final int component3() {
        return this.mPower;
    }

    public final int component4() {
        return this.mAvgPower;
    }

    public final int component5() {
        return this.mMaxPower;
    }

    public final int component6() {
        return this.mSpeed;
    }

    @aa1
    public final BleLactateThreshold copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleLactateThreshold(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMode = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPace = readInt32(r0);
        this.mPower = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAvgPower = readInt32(r0);
        this.mMaxPower = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSpeed = readInt32(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLactateThreshold) == true) goto L8;
        return false;
    L8:
        BleLactateThreshold r6 = (BleLactateThreshold) r5;
        if (this.mMode == r6.mMode) goto L12;
        return false;
    L12:
        if (this.mPace == r6.mPace) goto L15;
        return false;
    L15:
        if (this.mPower == r6.mPower) goto L18;
        return false;
    L18:
        if (this.mAvgPower == r6.mAvgPower) goto L21;
        return false;
    L21:
        if (this.mMaxPower == r6.mMaxPower) goto L24;
        return false;
    L24:
        if (this.mSpeed == r6.mSpeed) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMAvgPower() {
        return this.mAvgPower;
    }

    public final int getMMaxPower() {
        return this.mMaxPower;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMPower() {
        return this.mPower;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mMode) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mPower)) * 31) + Integer.hashCode(this.mAvgPower)) * 31) + Integer.hashCode(this.mMaxPower)) * 31) + Integer.hashCode(this.mSpeed);
    }

    public final void setMAvgPower(int r1) {
        this.mAvgPower = r1;
    }

    public final void setMMaxPower(int r1) {
        this.mMaxPower = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMPower(int r1) {
        this.mPower = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    @aa1
    public String toString() {
        return "BleLactateThreshold(mMode=" + this.mMode + ", mPace=" + this.mPace + ", mPower=" + this.mPower + ", mAvgPower=" + this.mAvgPower + ", mMaxPower=" + this.mMaxPower + ", mSpeed=" + this.mSpeed + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLactateThreshold(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mMode = r1;
        this.mPace = r2;
        this.mPower = r3;
        this.mAvgPower = r4;
        this.mMaxPower = r5;
        this.mSpeed = r6;
    }

    public /* synthetic */ BleLactateThreshold(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r10 = 0;
    L20:
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
