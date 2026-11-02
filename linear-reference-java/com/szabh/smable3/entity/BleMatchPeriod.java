package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchPeriod extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mAvgBpm;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mMaxBpm;
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

    public BleMatchPeriod() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleMatchPeriod copy$default(BleMatchPeriod r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mDuration;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mDistance;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mStep;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mCalorie;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mSpeed;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mAvgBpm;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mMaxBpm;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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

    @aa1
    public final BleMatchPeriod copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleMatchPeriod(r9, r10, r11, r12, r13, r14, r15);
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
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchPeriod) == true) goto L8;
        return false;
    L8:
        BleMatchPeriod r6 = (BleMatchPeriod) r5;
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
        if (this.mMaxBpm == r6.mMaxBpm) goto L29;
        return false;
    L29:
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

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mDuration) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm);
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

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchPeriod(mDuration=" + this.mDuration + ", mDistance=" + this.mDistance + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPeriod(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mDuration = r1;
        this.mDistance = r2;
        this.mStep = r3;
        this.mCalorie = r4;
        this.mSpeed = r5;
        this.mAvgBpm = r6;
        this.mMaxBpm = r7;
    }

    public /* synthetic */ BleMatchPeriod(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r11 = 0;
    L23:
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
