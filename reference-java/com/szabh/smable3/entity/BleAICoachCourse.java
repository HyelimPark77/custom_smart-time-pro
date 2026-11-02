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
        this(0, 0.0f, 0, 0, 0, 0, 0, 0, 255, null);
    }

    public static /* synthetic */ BleAICoachCourse copy$default(BleAICoachCourse bleAICoachCourse, int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleAICoachCourse.mCourseType;
        }
        if ((i8 & 2) != 0) {
            f = bleAICoachCourse.mCourseGoal;
        }
        if ((i8 & 4) != 0) {
            i2 = bleAICoachCourse.mCourseUpperBoundHR;
        }
        if ((i8 & 8) != 0) {
            i3 = bleAICoachCourse.mCourseLowerBoundHR;
        }
        if ((i8 & 16) != 0) {
            i4 = bleAICoachCourse.mCourseTime;
        }
        if ((i8 & 32) != 0) {
            i5 = bleAICoachCourse.mRestMinutes;
        }
        if ((i8 & 64) != 0) {
            i6 = bleAICoachCourse.mCourseRestHR;
        }
        if ((i8 & 128) != 0) {
            i7 = bleAICoachCourse.mRepeatTimes;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i4;
        int i12 = i5;
        return bleAICoachCourse.copy(i, f, i2, i3, i11, i12, i9, i10);
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
    public final BleAICoachCourse copy(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleAICoachCourse(i, f, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCourseType = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCourseGoal = readFloat(LITTLE_ENDIAN);
        this.mCourseUpperBoundHR = readInt8();
        this.mCourseLowerBoundHR = readInt8();
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCourseTime = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mRestMinutes = readInt16(LITTLE_ENDIAN);
        this.mCourseRestHR = readInt8();
        this.mRepeatTimes = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.mCourseType;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
        float f = this.mCourseGoal;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        writeInt8(this.mCourseUpperBoundHR);
        writeInt8(this.mCourseLowerBoundHR);
        int i2 = this.mCourseTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        int i3 = this.mRestMinutes;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i3, LITTLE_ENDIAN);
        writeInt8(this.mCourseRestHR);
        writeInt8(this.mRepeatTimes);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachCourse)) {
            return false;
        }
        BleAICoachCourse bleAICoachCourse = (BleAICoachCourse) obj;
        return this.mCourseType == bleAICoachCourse.mCourseType && Float.compare(this.mCourseGoal, bleAICoachCourse.mCourseGoal) == 0 && this.mCourseUpperBoundHR == bleAICoachCourse.mCourseUpperBoundHR && this.mCourseLowerBoundHR == bleAICoachCourse.mCourseLowerBoundHR && this.mCourseTime == bleAICoachCourse.mCourseTime && this.mRestMinutes == bleAICoachCourse.mRestMinutes && this.mCourseRestHR == bleAICoachCourse.mCourseRestHR && this.mRepeatTimes == bleAICoachCourse.mRepeatTimes;
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

    public final void setMCourseGoal(float f) {
        this.mCourseGoal = f;
    }

    public final void setMCourseLowerBoundHR(int i) {
        this.mCourseLowerBoundHR = i;
    }

    public final void setMCourseRestHR(int i) {
        this.mCourseRestHR = i;
    }

    public final void setMCourseTime(int i) {
        this.mCourseTime = i;
    }

    public final void setMCourseType(int i) {
        this.mCourseType = i;
    }

    public final void setMCourseUpperBoundHR(int i) {
        this.mCourseUpperBoundHR = i;
    }

    public final void setMRepeatTimes(int i) {
        this.mRepeatTimes = i;
    }

    public final void setMRestMinutes(int i) {
        this.mRestMinutes = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachCourse(mCourseType=" + this.mCourseType + ", mCourseGoal=" + this.mCourseGoal + ", mCourseUpperBoundHR=" + this.mCourseUpperBoundHR + ",mCourseLowerBoundHR=" + this.mCourseLowerBoundHR + ",mCourseTime=" + this.mCourseTime + ",mRestMinutes=" + this.mRestMinutes + ",mCourseRestHR=" + this.mCourseRestHR + ",mRepeatTimes=" + this.mRepeatTimes + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachCourse(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mCourseType = i;
        this.mCourseGoal = f;
        this.mCourseUpperBoundHR = i2;
        this.mCourseLowerBoundHR = i3;
        this.mCourseTime = i4;
        this.mRestMinutes = i5;
        this.mCourseRestHR = i6;
        this.mRepeatTimes = i7;
    }

    public /* synthetic */ BleAICoachCourse(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0.0f : f, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? 0 : i7);
    }
}
