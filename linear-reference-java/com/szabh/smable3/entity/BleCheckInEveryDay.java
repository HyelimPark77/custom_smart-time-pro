package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCheckInEveryDay extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mCheckTime;
    private int mEarnPoints;
    private int mEndHour;
    private int mEndMinute;
    private int mStartHour;
    private int mStartMinute;
    private int mStatus;
    private int mStepRanking;

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

    public BleCheckInEveryDay() {
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

    public static /* synthetic */ BleCheckInEveryDay copy$default(BleCheckInEveryDay r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mStartHour;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mStartMinute;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mEndHour;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mEndMinute;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mStepRanking;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mEarnPoints;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mCheckTime;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mStatus;
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
        return this.mStartHour;
    }

    public final int component2() {
        return this.mStartMinute;
    }

    public final int component3() {
        return this.mEndHour;
    }

    public final int component4() {
        return this.mEndMinute;
    }

    public final int component5() {
        return this.mStepRanking;
    }

    public final int component6() {
        return this.mEarnPoints;
    }

    public final int component7() {
        return this.mCheckTime;
    }

    public final int component8() {
        return this.mStatus;
    }

    @aa1
    public final BleCheckInEveryDay copy(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        return new BleCheckInEveryDay(r10, r11, r12, r13, r14, r15, r16, r17);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStartHour = readInt8();
        this.mStartMinute = readInt8();
        this.mEndHour = readInt8();
        this.mEndMinute = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStepRanking = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mEarnPoints = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCheckTime = readInt32(r0);
        this.mStatus = readInt8();
        BleReadable.readInt24$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mStartHour);
        writeInt8(this.mStartMinute);
        writeInt8(this.mEndHour);
        writeInt8(this.mEndMinute);
        int r0 = this.mStepRanking;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mEarnPoints;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        int r3 = this.mCheckTime;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r3, r1);
        writeInt8(this.mStatus);
        BleWritable.writeInt24$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCheckInEveryDay) == true) goto L8;
        return false;
    L8:
        BleCheckInEveryDay r6 = (BleCheckInEveryDay) r5;
        if (this.mStartHour == r6.mStartHour) goto L12;
        return false;
    L12:
        if (this.mStartMinute == r6.mStartMinute) goto L15;
        return false;
    L15:
        if (this.mEndHour == r6.mEndHour) goto L18;
        return false;
    L18:
        if (this.mEndMinute == r6.mEndMinute) goto L21;
        return false;
    L21:
        if (this.mStepRanking == r6.mStepRanking) goto L24;
        return false;
    L24:
        if (this.mEarnPoints == r6.mEarnPoints) goto L27;
        return false;
    L27:
        if (this.mCheckTime == r6.mCheckTime) goto L30;
        return false;
    L30:
        if (this.mStatus == r6.mStatus) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMCheckTime() {
        return this.mCheckTime;
    }

    public final int getMEarnPoints() {
        return this.mEarnPoints;
    }

    public final int getMEndHour() {
        return this.mEndHour;
    }

    public final int getMEndMinute() {
        return this.mEndMinute;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMStartHour() {
        return this.mStartHour;
    }

    public final int getMStartMinute() {
        return this.mStartMinute;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final int getMStepRanking() {
        return this.mStepRanking;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mStartHour) * 31) + Integer.hashCode(this.mStartMinute)) * 31) + Integer.hashCode(this.mEndHour)) * 31) + Integer.hashCode(this.mEndMinute)) * 31) + Integer.hashCode(this.mStepRanking)) * 31) + Integer.hashCode(this.mEarnPoints)) * 31) + Integer.hashCode(this.mCheckTime)) * 31) + Integer.hashCode(this.mStatus);
    }

    public final void setMCheckTime(int r1) {
        this.mCheckTime = r1;
    }

    public final void setMEarnPoints(int r1) {
        this.mEarnPoints = r1;
    }

    public final void setMEndHour(int r1) {
        this.mEndHour = r1;
    }

    public final void setMEndMinute(int r1) {
        this.mEndMinute = r1;
    }

    public final void setMStartHour(int r1) {
        this.mStartHour = r1;
    }

    public final void setMStartMinute(int r1) {
        this.mStartMinute = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMStepRanking(int r1) {
        this.mStepRanking = r1;
    }

    @aa1
    public String toString() {
        return "BleCheckInEveryDay(mStartHour=" + this.mStartHour + ", mStartMinute=" + this.mStartMinute + ", mEndHour=" + this.mEndHour + ", mEndMinute=" + this.mEndMinute + ", mStepRanking=" + this.mStepRanking + ", mEarnPoints=" + this.mEarnPoints + ", mCheckTime=" + this.mCheckTime + ", mStatus=" + this.mStatus + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCheckInEveryDay(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        this.mStartHour = r1;
        this.mStartMinute = r2;
        this.mEndHour = r3;
        this.mEndMinute = r4;
        this.mStepRanking = r5;
        this.mEarnPoints = r6;
        this.mCheckTime = r7;
        this.mStatus = r8;
    }

    public /* synthetic */ BleCheckInEveryDay(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
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
