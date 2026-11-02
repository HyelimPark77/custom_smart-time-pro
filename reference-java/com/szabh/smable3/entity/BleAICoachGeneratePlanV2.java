package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.C2788p1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlanV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n1563#2:328\n1634#2,3:329\n222#3,4:332\n222#3,4:336\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlanV2\n*L\n142#1:328\n142#1:329,3\n164#1:332,4\n170#1:336,4\n*E\n"})
public final class BleAICoachGeneratePlanV2 extends BleWritable {
    private int mAICoachType;
    private int mCalorie;

    @aa1
    private List<Integer> mCompletionMark;

    @aa1
    private List<BleAICoachDayPlanCourseV2> mCourses;
    private float mDistance;
    private int mHalfHorseEndScore;
    private int mHalfHorseStartScore;

    @aa1
    private List<Long> mLeaveDayV2;
    private float mPhysicalFitnessEndTime;
    private float mPhysicalFitnessStartTime;
    private long mPlanStartTime;

    @aa1
    private List<Integer> mPlanTime;
    private int mPlanWeekNum;
    private int mProgress;
    private float mVo2MaxEndTime;
    private float mVo2MaxStartTime;
    private int mWholeHorseEndScore;
    private int mWholeHorseStartScore;

    public BleAICoachGeneratePlanV2() {
        this(0, 0, 0L, null, null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, null, C2788p1.OXO1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachGeneratePlanV2 copy$default(BleAICoachGeneratePlanV2 bleAICoachGeneratePlanV2, int i, int i2, long j, List list, List list2, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5, int i6, int i7, int i8, List list3, List list4, int i9, Object obj) {
        List list5;
        List list6;
        int i10 = (i9 & 1) != 0 ? bleAICoachGeneratePlanV2.mAICoachType : i;
        int i11 = (i9 & 2) != 0 ? bleAICoachGeneratePlanV2.mPlanWeekNum : i2;
        long j2 = (i9 & 4) != 0 ? bleAICoachGeneratePlanV2.mPlanStartTime : j;
        List list7 = (i9 & 8) != 0 ? bleAICoachGeneratePlanV2.mPlanTime : list;
        List list8 = (i9 & 16) != 0 ? bleAICoachGeneratePlanV2.mCompletionMark : list2;
        int i12 = (i9 & 32) != 0 ? bleAICoachGeneratePlanV2.mProgress : i3;
        int i13 = (i9 & 64) != 0 ? bleAICoachGeneratePlanV2.mCalorie : i4;
        float f6 = (i9 & 128) != 0 ? bleAICoachGeneratePlanV2.mDistance : f;
        float f7 = (i9 & 256) != 0 ? bleAICoachGeneratePlanV2.mVo2MaxStartTime : f2;
        float f8 = (i9 & 512) != 0 ? bleAICoachGeneratePlanV2.mVo2MaxEndTime : f3;
        float f9 = (i9 & 1024) != 0 ? bleAICoachGeneratePlanV2.mPhysicalFitnessStartTime : f4;
        float f10 = (i9 & 2048) != 0 ? bleAICoachGeneratePlanV2.mPhysicalFitnessEndTime : f5;
        int i14 = (i9 & 4096) != 0 ? bleAICoachGeneratePlanV2.mHalfHorseStartScore : i5;
        int i15 = i10;
        int i16 = (i9 & 8192) != 0 ? bleAICoachGeneratePlanV2.mHalfHorseEndScore : i6;
        int i17 = (i9 & 16384) != 0 ? bleAICoachGeneratePlanV2.mWholeHorseStartScore : i7;
        int i18 = (i9 & 32768) != 0 ? bleAICoachGeneratePlanV2.mWholeHorseEndScore : i8;
        List list9 = (i9 & 65536) != 0 ? bleAICoachGeneratePlanV2.mCourses : list3;
        if ((i9 & 131072) != 0) {
            list6 = list9;
            list5 = bleAICoachGeneratePlanV2.mLeaveDayV2;
        } else {
            list5 = list4;
            list6 = list9;
        }
        return bleAICoachGeneratePlanV2.copy(i15, i11, j2, list7, list8, i12, i13, f6, f7, f8, f9, f10, i14, i16, i17, i18, list6, list5);
    }

    public final int component1() {
        return this.mAICoachType;
    }

    public final float component10() {
        return this.mVo2MaxEndTime;
    }

    public final float component11() {
        return this.mPhysicalFitnessStartTime;
    }

    public final float component12() {
        return this.mPhysicalFitnessEndTime;
    }

    public final int component13() {
        return this.mHalfHorseStartScore;
    }

    public final int component14() {
        return this.mHalfHorseEndScore;
    }

    public final int component15() {
        return this.mWholeHorseStartScore;
    }

    public final int component16() {
        return this.mWholeHorseEndScore;
    }

    @aa1
    public final List<BleAICoachDayPlanCourseV2> component17() {
        return this.mCourses;
    }

    @aa1
    public final List<Long> component18() {
        return this.mLeaveDayV2;
    }

    public final int component2() {
        return this.mPlanWeekNum;
    }

    public final long component3() {
        return this.mPlanStartTime;
    }

    @aa1
    public final List<Integer> component4() {
        return this.mPlanTime;
    }

    @aa1
    public final List<Integer> component5() {
        return this.mCompletionMark;
    }

    public final int component6() {
        return this.mProgress;
    }

    public final int component7() {
        return this.mCalorie;
    }

    public final float component8() {
        return this.mDistance;
    }

    public final float component9() {
        return this.mVo2MaxStartTime;
    }

    @aa1
    public final BleAICoachGeneratePlanV2 copy(int i, int i2, long j, @aa1 List<Integer> mPlanTime, @aa1 List<Integer> mCompletionMark, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5, int i6, int i7, int i8, @aa1 List<BleAICoachDayPlanCourseV2> mCourses, @aa1 List<Long> mLeaveDayV2) {
        Intrinsics.X0O(mPlanTime, "mPlanTime");
        Intrinsics.X0O(mCompletionMark, "mCompletionMark");
        Intrinsics.X0O(mCourses, "mCourses");
        Intrinsics.X0O(mLeaveDayV2, "mLeaveDayV2");
        return new BleAICoachGeneratePlanV2(i, i2, j, mPlanTime, mCompletionMark, i3, i4, f, f2, f3, f4, f5, i5, i6, i7, i8, mCourses, mLeaveDayV2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mPlanTime.clear();
        for (int i = 0; i < 4; i++) {
            BleReadable bleReadable = (BleReadable) BleWeekPlanTime.class.newInstance();
            bleReadable.setMBytes(readBytes(4));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            this.mPlanTime.addAll(ArraysKt___ArraysKt.XXiO0(((BleWeekPlanTime) bleReadable).getMList(), 28));
        }
        this.mCompletionMark.clear();
        for (int i2 = 0; i2 < 4; i2++) {
            BleReadable bleReadable2 = (BleReadable) BleWeekPlanTime.class.newInstance();
            bleReadable2.setMBytes(readBytes(4));
            bleReadable2.decode();
            Intrinsics.XXI(bleReadable2);
            this.mCompletionMark.addAll(ArraysKt___ArraysKt.XXiO0(((BleWeekPlanTime) bleReadable2).getMList(), 28));
        }
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mProgress = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCalorie = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDistance = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mVo2MaxStartTime = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mVo2MaxEndTime = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPhysicalFitnessStartTime = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPhysicalFitnessEndTime = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mHalfHorseStartScore = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mHalfHorseEndScore = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mWholeHorseStartScore = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mWholeHorseEndScore = readInt32(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mAICoachType);
        writeInt8(this.mPlanWeekNum);
        writeObject(BleTime.Companion.ofLocal(this.mPlanStartTime));
        List listX10i = CollectionsKt___CollectionsKt.X10i(this.mPlanTime, 28);
        for (int i = 0; i < 4; i++) {
            if (listX10i.size() > i) {
                writeObject(BleWeekPlanTimeV2.Companion.ofPlanTime(CollectionsKt___CollectionsKt.OO0Oi10((Collection) listX10i.get(i))));
            } else {
                BleWritable.writeInt32$default(this, 0, null, 2, null);
            }
        }
        List listX10i2 = CollectionsKt___CollectionsKt.X10i(this.mCompletionMark, 28);
        for (int i2 = 0; i2 < 4; i2++) {
            if (listX10i2.size() > i2) {
                writeObject(BleWeekPlanTimeV2.Companion.ofPlanTime(CollectionsKt___CollectionsKt.OO0Oi10((Collection) listX10i2.get(i2))));
            } else {
                BleWritable.writeInt32$default(this, 0, null, 2, null);
            }
        }
        int i3 = this.mProgress;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i3, LITTLE_ENDIAN);
        int i4 = this.mCalorie;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i4, LITTLE_ENDIAN);
        float f = this.mDistance;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        float f2 = this.mVo2MaxStartTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f2, LITTLE_ENDIAN);
        float f3 = this.mVo2MaxEndTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f3, LITTLE_ENDIAN);
        float f4 = this.mPhysicalFitnessStartTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f4, LITTLE_ENDIAN);
        float f5 = this.mPhysicalFitnessEndTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f5, LITTLE_ENDIAN);
        int i5 = this.mHalfHorseStartScore;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i5, LITTLE_ENDIAN);
        int i6 = this.mHalfHorseEndScore;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i6, LITTLE_ENDIAN);
        int i7 = this.mWholeHorseStartScore;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i7, LITTLE_ENDIAN);
        int i8 = this.mWholeHorseEndScore;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i8, LITTLE_ENDIAN);
        for (int i9 = 0; i9 < 4; i9++) {
            if (this.mLeaveDayV2.size() > i9) {
                writeObject(BleTime.Companion.ofLocal(this.mLeaveDayV2.get(i9).longValue()));
            } else {
                ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                writeInt16(0, LITTLE_ENDIAN2);
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                writeInt32(0, LITTLE_ENDIAN2);
            }
        }
        List<BleAICoachDayPlanCourseV2> list = this.mCourses;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (BleAICoachDayPlanCourseV2 bleAICoachDayPlanCourseV2 : list) {
            writeInt8(bleAICoachDayPlanCourseV2.getMCourseCode());
            writeInt8(bleAICoachDayPlanCourseV2.getMCourseContentNumber());
            int mCourseTime = bleAICoachDayPlanCourseV2.getMCourseTime();
            ByteOrder LITTLE_ENDIAN3 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
            writeInt16(mCourseTime, LITTLE_ENDIAN3);
            int mCourseCalorie = bleAICoachDayPlanCourseV2.getMCourseCalorie();
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
            writeInt16(mCourseCalorie, LITTLE_ENDIAN3);
            writeInt8(bleAICoachDayPlanCourseV2.getMRepeatNumber());
            writeInt8(0);
            writeList(bleAICoachDayPlanCourseV2.getMCoursesContent());
            int mCourseContentNumber = 10 - bleAICoachDayPlanCourseV2.getMCourseContentNumber();
            for (int i10 = 0; i10 < mCourseContentNumber; i10++) {
                BleWritable.writeInt32$default(this, 0, null, 2, null);
                BleWritable.writeInt32$default(this, 0, null, 2, null);
            }
            arrayList.add(Unit.OXO1);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachGeneratePlanV2)) {
            return false;
        }
        BleAICoachGeneratePlanV2 bleAICoachGeneratePlanV2 = (BleAICoachGeneratePlanV2) obj;
        return this.mAICoachType == bleAICoachGeneratePlanV2.mAICoachType && this.mPlanWeekNum == bleAICoachGeneratePlanV2.mPlanWeekNum && this.mPlanStartTime == bleAICoachGeneratePlanV2.mPlanStartTime && Intrinsics.XOO0ii0(this.mPlanTime, bleAICoachGeneratePlanV2.mPlanTime) && Intrinsics.XOO0ii0(this.mCompletionMark, bleAICoachGeneratePlanV2.mCompletionMark) && this.mProgress == bleAICoachGeneratePlanV2.mProgress && this.mCalorie == bleAICoachGeneratePlanV2.mCalorie && Float.compare(this.mDistance, bleAICoachGeneratePlanV2.mDistance) == 0 && Float.compare(this.mVo2MaxStartTime, bleAICoachGeneratePlanV2.mVo2MaxStartTime) == 0 && Float.compare(this.mVo2MaxEndTime, bleAICoachGeneratePlanV2.mVo2MaxEndTime) == 0 && Float.compare(this.mPhysicalFitnessStartTime, bleAICoachGeneratePlanV2.mPhysicalFitnessStartTime) == 0 && Float.compare(this.mPhysicalFitnessEndTime, bleAICoachGeneratePlanV2.mPhysicalFitnessEndTime) == 0 && this.mHalfHorseStartScore == bleAICoachGeneratePlanV2.mHalfHorseStartScore && this.mHalfHorseEndScore == bleAICoachGeneratePlanV2.mHalfHorseEndScore && this.mWholeHorseStartScore == bleAICoachGeneratePlanV2.mWholeHorseStartScore && this.mWholeHorseEndScore == bleAICoachGeneratePlanV2.mWholeHorseEndScore && Intrinsics.XOO0ii0(this.mCourses, bleAICoachGeneratePlanV2.mCourses) && Intrinsics.XOO0ii0(this.mLeaveDayV2, bleAICoachGeneratePlanV2.mLeaveDayV2);
    }

    public final int getMAICoachType() {
        return this.mAICoachType;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    @aa1
    public final List<Integer> getMCompletionMark() {
        return this.mCompletionMark;
    }

    @aa1
    public final List<BleAICoachDayPlanCourseV2> getMCourses() {
        return this.mCourses;
    }

    public final float getMDistance() {
        return this.mDistance;
    }

    public final int getMHalfHorseEndScore() {
        return this.mHalfHorseEndScore;
    }

    public final int getMHalfHorseStartScore() {
        return this.mHalfHorseStartScore;
    }

    @aa1
    public final List<Long> getMLeaveDayV2() {
        return this.mLeaveDayV2;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 9960;
    }

    public final float getMPhysicalFitnessEndTime() {
        return this.mPhysicalFitnessEndTime;
    }

    public final float getMPhysicalFitnessStartTime() {
        return this.mPhysicalFitnessStartTime;
    }

    public final long getMPlanStartTime() {
        return this.mPlanStartTime;
    }

    @aa1
    public final List<Integer> getMPlanTime() {
        return this.mPlanTime;
    }

    public final int getMPlanWeekNum() {
        return this.mPlanWeekNum;
    }

    public final int getMProgress() {
        return this.mProgress;
    }

    public final float getMVo2MaxEndTime() {
        return this.mVo2MaxEndTime;
    }

    public final float getMVo2MaxStartTime() {
        return this.mVo2MaxStartTime;
    }

    public final int getMWholeHorseEndScore() {
        return this.mWholeHorseEndScore;
    }

    public final int getMWholeHorseStartScore() {
        return this.mWholeHorseStartScore;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.mAICoachType) * 31) + Integer.hashCode(this.mPlanWeekNum)) * 31) + Long.hashCode(this.mPlanStartTime)) * 31) + this.mPlanTime.hashCode()) * 31) + this.mCompletionMark.hashCode()) * 31) + Integer.hashCode(this.mProgress)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Float.hashCode(this.mDistance)) * 31) + Float.hashCode(this.mVo2MaxStartTime)) * 31) + Float.hashCode(this.mVo2MaxEndTime)) * 31) + Float.hashCode(this.mPhysicalFitnessStartTime)) * 31) + Float.hashCode(this.mPhysicalFitnessEndTime)) * 31) + Integer.hashCode(this.mHalfHorseStartScore)) * 31) + Integer.hashCode(this.mHalfHorseEndScore)) * 31) + Integer.hashCode(this.mWholeHorseStartScore)) * 31) + Integer.hashCode(this.mWholeHorseEndScore)) * 31) + this.mCourses.hashCode()) * 31) + this.mLeaveDayV2.hashCode();
    }

    public final void setMAICoachType(int i) {
        this.mAICoachType = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMCompletionMark(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCompletionMark = list;
    }

    public final void setMCourses(@aa1 List<BleAICoachDayPlanCourseV2> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCourses = list;
    }

    public final void setMDistance(float f) {
        this.mDistance = f;
    }

    public final void setMHalfHorseEndScore(int i) {
        this.mHalfHorseEndScore = i;
    }

    public final void setMHalfHorseStartScore(int i) {
        this.mHalfHorseStartScore = i;
    }

    public final void setMLeaveDayV2(@aa1 List<Long> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLeaveDayV2 = list;
    }

    public final void setMPhysicalFitnessEndTime(float f) {
        this.mPhysicalFitnessEndTime = f;
    }

    public final void setMPhysicalFitnessStartTime(float f) {
        this.mPhysicalFitnessStartTime = f;
    }

    public final void setMPlanStartTime(long j) {
        this.mPlanStartTime = j;
    }

    public final void setMPlanTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPlanTime = list;
    }

    public final void setMPlanWeekNum(int i) {
        this.mPlanWeekNum = i;
    }

    public final void setMProgress(int i) {
        this.mProgress = i;
    }

    public final void setMVo2MaxEndTime(float f) {
        this.mVo2MaxEndTime = f;
    }

    public final void setMVo2MaxStartTime(float f) {
        this.mVo2MaxStartTime = f;
    }

    public final void setMWholeHorseEndScore(int i) {
        this.mWholeHorseEndScore = i;
    }

    public final void setMWholeHorseStartScore(int i) {
        this.mWholeHorseStartScore = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachGeneratePlanV2(mPlanTime=" + this.mPlanTime + ", mCompletionMark=" + this.mCompletionMark + ", mPlanWeekNum = " + this.mPlanWeekNum + ",mPlanStartTime=" + this.mPlanStartTime + ",mProgress = " + this.mProgress + ", mDistance = " + this.mDistance + " , mCalorie = " + this.mCalorie + " ,mVo2MaxStartTime = " + this.mVo2MaxStartTime + " , mVo2MaxEndTime = " + this.mVo2MaxEndTime + " , mPhysicalFitnessStartTime = " + this.mPhysicalFitnessStartTime + "mPhysicalFitnessEndTime = " + this.mPhysicalFitnessEndTime + " , mHalfHorseStartScore = " + this.mHalfHorseStartScore + ",mHalfHorseEndScore = " + this.mHalfHorseEndScore + " , mWholeHorseStartScore = " + this.mWholeHorseStartScore + ", mWholeHorseEndScore = " + this.mWholeHorseEndScore + " , mCourses=" + this.mCourses + ", mLeaveDayV2 = " + this.mLeaveDayV2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachGeneratePlanV2(int i, int i2, long j, @aa1 List<Integer> mPlanTime, @aa1 List<Integer> mCompletionMark, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5, int i6, int i7, int i8, @aa1 List<BleAICoachDayPlanCourseV2> mCourses, @aa1 List<Long> mLeaveDayV2) {
        Intrinsics.X0O(mPlanTime, "mPlanTime");
        Intrinsics.X0O(mCompletionMark, "mCompletionMark");
        Intrinsics.X0O(mCourses, "mCourses");
        Intrinsics.X0O(mLeaveDayV2, "mLeaveDayV2");
        this.mAICoachType = i;
        this.mPlanWeekNum = i2;
        this.mPlanStartTime = j;
        this.mPlanTime = mPlanTime;
        this.mCompletionMark = mCompletionMark;
        this.mProgress = i3;
        this.mCalorie = i4;
        this.mDistance = f;
        this.mVo2MaxStartTime = f2;
        this.mVo2MaxEndTime = f3;
        this.mPhysicalFitnessStartTime = f4;
        this.mPhysicalFitnessEndTime = f5;
        this.mHalfHorseStartScore = i5;
        this.mHalfHorseEndScore = i6;
        this.mWholeHorseStartScore = i7;
        this.mWholeHorseEndScore = i8;
        this.mCourses = mCourses;
        this.mLeaveDayV2 = mLeaveDayV2;
    }

    public /* synthetic */ BleAICoachGeneratePlanV2(int i, int i2, long j, List list, List list2, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5, int i6, int i7, int i8, List list3, List list4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0L : j, (i9 & 8) != 0 ? new ArrayList() : list, (i9 & 16) != 0 ? new ArrayList() : list2, (i9 & 32) != 0 ? 0 : i3, (i9 & 64) != 0 ? 0 : i4, (i9 & 128) != 0 ? 0.0f : f, (i9 & 256) != 0 ? 0.0f : f2, (i9 & 512) != 0 ? 0.0f : f3, (i9 & 1024) != 0 ? 0.0f : f4, (i9 & 2048) == 0 ? f5 : 0.0f, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (i9 & 32768) != 0 ? 0 : i8, (i9 & 65536) != 0 ? new ArrayList() : list3, (i9 & 131072) != 0 ? new ArrayList() : list4);
    }
}
