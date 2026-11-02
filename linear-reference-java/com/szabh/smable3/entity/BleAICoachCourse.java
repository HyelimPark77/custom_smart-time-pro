package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICoachCourse extends BleWritable {
    private float mCourseGoal;
    private int mCourseLowerBoundHR;
    private int mCourseRestHR;
    private int mCourseTime;
    private int mCourseType;
    private int mCourseUpperBoundHR;
    private int mRepeatTimes;
    private int mRestMinutes;

    public BleAICoachCourse() {
        int r1 = 0;
        float r2 = 0.0f;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleAICoachCourse copy$default(BleAICoachCourse r0, int r1, float r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mCourseType;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mCourseGoal;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mCourseUpperBoundHR;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mCourseLowerBoundHR;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mCourseTime;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mRestMinutes;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mCourseRestHR;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mRepeatTimes;
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
        return this.mCourseType;
    }

    public final float component2() {
        return this.mCourseGoal;
    }

    public final int component3() {
        return this.mCourseUpperBoundHR;
    }

    public final int component4() {
        return this.mCourseLowerBoundHR;
    }

    public final int component5() {
        return this.mCourseTime;
    }

    public final int component6() {
        return this.mRestMinutes;
    }

    public final int component7() {
        return this.mCourseRestHR;
    }

    public final int component8() {
        return this.mRepeatTimes;
    }

    @aa1
    public final BleAICoachCourse copy(int r10, float r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        return new BleAICoachCourse(r10, r11, r12, r13, r14, r15, r16, r17);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCourseType = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCourseGoal = readFloat(r0);
        this.mCourseUpperBoundHR = readInt8();
        this.mCourseLowerBoundHR = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCourseTime = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRestMinutes = readInt16(r0);
        this.mCourseRestHR = readInt8();
        this.mRepeatTimes = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mCourseType;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r0, r1);
        float r2 = this.mCourseGoal;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r2, r1);
        writeInt8(this.mCourseUpperBoundHR);
        writeInt8(this.mCourseLowerBoundHR);
        int r3 = this.mCourseTime;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
        int r4 = this.mRestMinutes;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r4, r1);
        writeInt8(this.mCourseRestHR);
        writeInt8(this.mRepeatTimes);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICoachCourse) == true) goto L8;
        return false;
    L8:
        BleAICoachCourse r6 = (BleAICoachCourse) r5;
        if (this.mCourseType == r6.mCourseType) goto L12;
        return false;
    L12:
        if (Float.compare(this.mCourseGoal, r6.mCourseGoal) == 0) goto L15;
        return false;
    L15:
        if (this.mCourseUpperBoundHR == r6.mCourseUpperBoundHR) goto L18;
        return false;
    L18:
        if (this.mCourseLowerBoundHR == r6.mCourseLowerBoundHR) goto L21;
        return false;
    L21:
        if (this.mCourseTime == r6.mCourseTime) goto L24;
        return false;
    L24:
        if (this.mRestMinutes == r6.mRestMinutes) goto L27;
        return false;
    L27:
        if (this.mCourseRestHR == r6.mCourseRestHR) goto L30;
        return false;
    L30:
        if (this.mRepeatTimes == r6.mRepeatTimes) goto L32;
        return false;
    L32:
        return true;
    }

    public final float getMCourseGoal() {
        return this.mCourseGoal;
    }

    public final int getMCourseLowerBoundHR() {
        return this.mCourseLowerBoundHR;
    }

    public final int getMCourseRestHR() {
        return this.mCourseRestHR;
    }

    public final int getMCourseTime() {
        return this.mCourseTime;
    }

    public final int getMCourseType() {
        return this.mCourseType;
    }

    public final int getMCourseUpperBoundHR() {
        return this.mCourseUpperBoundHR;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMRepeatTimes() {
        return this.mRepeatTimes;
    }

    public final int getMRestMinutes() {
        return this.mRestMinutes;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mCourseType) * 31) + Float.hashCode(this.mCourseGoal)) * 31) + Integer.hashCode(this.mCourseUpperBoundHR)) * 31) + Integer.hashCode(this.mCourseLowerBoundHR)) * 31) + Integer.hashCode(this.mCourseTime)) * 31) + Integer.hashCode(this.mRestMinutes)) * 31) + Integer.hashCode(this.mCourseRestHR)) * 31) + Integer.hashCode(this.mRepeatTimes);
    }

    public final void setMCourseGoal(float r1) {
        this.mCourseGoal = r1;
    }

    public final void setMCourseLowerBoundHR(int r1) {
        this.mCourseLowerBoundHR = r1;
    }

    public final void setMCourseRestHR(int r1) {
        this.mCourseRestHR = r1;
    }

    public final void setMCourseTime(int r1) {
        this.mCourseTime = r1;
    }

    public final void setMCourseType(int r1) {
        this.mCourseType = r1;
    }

    public final void setMCourseUpperBoundHR(int r1) {
        this.mCourseUpperBoundHR = r1;
    }

    public final void setMRepeatTimes(int r1) {
        this.mRepeatTimes = r1;
    }

    public final void setMRestMinutes(int r1) {
        this.mRestMinutes = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachCourse(mCourseType=" + this.mCourseType + ", mCourseGoal=" + this.mCourseGoal + ", mCourseUpperBoundHR=" + this.mCourseUpperBoundHR + ",mCourseLowerBoundHR=" + this.mCourseLowerBoundHR + ",mCourseTime=" + this.mCourseTime + ",mRestMinutes=" + this.mRestMinutes + ",mCourseRestHR=" + this.mCourseRestHR + ",mRepeatTimes=" + this.mRepeatTimes + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachCourse(int r1, float r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        this.mCourseType = r1;
        this.mCourseGoal = r2;
        this.mCourseUpperBoundHR = r3;
        this.mCourseLowerBoundHR = r4;
        this.mCourseTime = r5;
        this.mRestMinutes = r6;
        this.mCourseRestHR = r7;
        this.mRepeatTimes = r8;
    }

    public /* synthetic */ BleAICoachCourse(int r2, float r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0.0f;
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
