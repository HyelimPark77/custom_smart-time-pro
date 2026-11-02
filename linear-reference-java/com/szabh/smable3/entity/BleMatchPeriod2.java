package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchPeriod2 extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 14;
    private int mAvgBpm;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mMaxBpm;
    private int mMaxSpeed;
    private int mSpeed;
    private int mStep;

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

    public BleMatchPeriod2() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleMatchPeriod2 copy$default(BleMatchPeriod2 r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mDuration;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mDistance;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mStep;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mCalorie;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mSpeed;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mAvgBpm;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mMaxBpm;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mMaxSpeed;
    L26:
        int r11 = r7;
        int r12 = r8;
        int r13 = r5;
        int r14 = r6;
        int r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.mDuration;
    }

    public final int component2() {
        return this.mDistance;
    }

    public final int component3() {
        return this.mStep;
    }

    public final int component4() {
        return this.mCalorie;
    }

    public final int component5() {
        return this.mSpeed;
    }

    public final int component6() {
        return this.mAvgBpm;
    }

    public final int component7() {
        return this.mMaxBpm;
    }

    public final int component8() {
        return this.mMaxSpeed;
    }

    @aa1
    public final BleMatchPeriod2 copy(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        return new BleMatchPeriod2(r10, r11, r12, r13, r14, r15, r16, r17);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDuration = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDistance = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStep = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCalorie = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSpeed = readUInt16(r0);
        this.mAvgBpm = readUInt8();
        this.mMaxBpm = readUInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMaxSpeed = readUInt16(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchPeriod2) == true) goto L8;
        return false;
    L8:
        BleMatchPeriod2 r6 = (BleMatchPeriod2) r5;
        if (this.mDuration == r6.mDuration) goto L12;
        return false;
    L12:
        if (this.mDistance == r6.mDistance) goto L15;
        return false;
    L15:
        if (this.mStep == r6.mStep) goto L18;
        return false;
    L18:
        if (this.mCalorie == r6.mCalorie) goto L21;
        return false;
    L21:
        if (this.mSpeed == r6.mSpeed) goto L24;
        return false;
    L24:
        if (this.mAvgBpm == r6.mAvgBpm) goto L27;
        return false;
    L27:
        if (this.mMaxBpm == r6.mMaxBpm) goto L30;
        return false;
    L30:
        if (this.mMaxSpeed == r6.mMaxSpeed) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxSpeed() {
        return this.mMaxSpeed;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mDuration) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMaxSpeed);
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMaxSpeed(int r1) {
        this.mMaxSpeed = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchPeriod2(mDuration=" + this.mDuration + ", mDistance=" + this.mDistance + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMaxSpeed=" + this.mMaxSpeed + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPeriod2(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        this.mDuration = r1;
        this.mDistance = r2;
        this.mStep = r3;
        this.mCalorie = r4;
        this.mSpeed = r5;
        this.mAvgBpm = r6;
        this.mMaxBpm = r7;
        this.mMaxSpeed = r8;
    }

    public /* synthetic */ BleMatchPeriod2(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L27;
        int r12 = 0;
    L26:
        int r13 = r8;
        int r14 = r7;
        int r15 = r6;
        int r16 = r5;
        int r17 = r4;
        this(r2, r3, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
