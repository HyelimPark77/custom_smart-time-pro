package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlan\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,337:1\n1563#2:338\n1634#2,3:339\n222#3,4:342\n222#3,4:346\n222#3,4:350\n232#3,3:354\n222#3,15:357\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlan\n*L\n157#1:338\n157#1:339,3\n177#1:342,4\n180#1:346,4\n183#1:350,4\n201#1:354,3\n201#1:357,15\n*E\n"})
public final class BleAICoachGeneratePlan extends BleWritable {
    private int mAllCalorie;
    private int mAllExerciseTime;
    private float mAll_METS;

    @aa1
    private List<Integer> mCompletionMark;

    @aa1
    private List<BleAICoachDayPlanCourse> mCourses;
    private int mPlanLevel;
    private long mPlanStartTime;
    private float mPlanTarget;

    @aa1
    private List<Integer> mPlanTime;
    private int mProgress;

    public BleAICoachGeneratePlan() {
        this(null, null, 0L, 0.0f, 0, null, 0, 0, 0.0f, 0, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachGeneratePlan copy$default(BleAICoachGeneratePlan bleAICoachGeneratePlan, List list, List list2, long j, float f, int i, List list3, int i2, int i3, float f2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = bleAICoachGeneratePlan.mPlanTime;
        }
        if ((i5 & 2) != 0) {
            list2 = bleAICoachGeneratePlan.mCompletionMark;
        }
        if ((i5 & 4) != 0) {
            j = bleAICoachGeneratePlan.mPlanStartTime;
        }
        if ((i5 & 8) != 0) {
            f = bleAICoachGeneratePlan.mPlanTarget;
        }
        if ((i5 & 16) != 0) {
            i = bleAICoachGeneratePlan.mPlanLevel;
        }
        if ((i5 & 32) != 0) {
            list3 = bleAICoachGeneratePlan.mCourses;
        }
        if ((i5 & 64) != 0) {
            i2 = bleAICoachGeneratePlan.mProgress;
        }
        if ((i5 & 128) != 0) {
            i3 = bleAICoachGeneratePlan.mAllExerciseTime;
        }
        if ((i5 & 256) != 0) {
            f2 = bleAICoachGeneratePlan.mAll_METS;
        }
        if ((i5 & 512) != 0) {
            i4 = bleAICoachGeneratePlan.mAllCalorie;
        }
        float f3 = f2;
        int i6 = i4;
        int i7 = i3;
        List list4 = list3;
        float f4 = f;
        long j2 = j;
        return bleAICoachGeneratePlan.copy(list, list2, j2, f4, i, list4, i2, i7, f3, i6);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mPlanTime;
    }

    public final int component10() {
        return this.mAllCalorie;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mCompletionMark;
    }

    public final long component3() {
        return this.mPlanStartTime;
    }

    public final float component4() {
        return this.mPlanTarget;
    }

    public final int component5() {
        return this.mPlanLevel;
    }

    @aa1
    public final List<BleAICoachDayPlanCourse> component6() {
        return this.mCourses;
    }

    public final int component7() {
        return this.mProgress;
    }

    public final int component8() {
        return this.mAllExerciseTime;
    }

    public final float component9() {
        return this.mAll_METS;
    }

    @aa1
    public final BleAICoachGeneratePlan copy(@aa1 List<Integer> mPlanTime, @aa1 List<Integer> mCompletionMark, long j, float f, int i, @aa1 List<BleAICoachDayPlanCourse> mCourses, int i2, int i3, float f2, int i4) {
        Intrinsics.X0O(mPlanTime, "mPlanTime");
        Intrinsics.X0O(mCompletionMark, "mCompletionMark");
        Intrinsics.X0O(mCourses, "mCourses");
        return new BleAICoachGeneratePlan(mPlanTime, mCompletionMark, j, f, i, mCourses, i2, i3, f2, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable bleReadable = (BleReadable) BleWeekPlanTime.class.newInstance();
        bleReadable.setMBytes(readBytes(4));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mPlanTime = ArraysKt___ArraysKt.OXI0X0(((BleWeekPlanTime) bleReadable).getMList());
        BleReadable bleReadable2 = (BleReadable) BleWeekPlanTime.class.newInstance();
        bleReadable2.setMBytes(readBytes(4));
        bleReadable2.decode();
        Intrinsics.XXI(bleReadable2);
        this.mCompletionMark = ArraysKt___ArraysKt.OXI0X0(((BleWeekPlanTime) bleReadable2).getMList());
        BleReadable bleReadable3 = (BleReadable) BleAICoachTime.class.newInstance();
        bleReadable3.setMBytes(readBytes(8));
        bleReadable3.decode();
        Intrinsics.XXI(bleReadable3);
        BleAICoachTime bleAICoachTime = (BleAICoachTime) bleReadable3;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        calendar.set(1, bleAICoachTime.getMYear());
        calendar.set(2, bleAICoachTime.getMMonth() - 1);
        calendar.set(5, bleAICoachTime.getMDay());
        calendar.set(11, bleAICoachTime.getMHour());
        calendar.set(12, bleAICoachTime.getMMinute());
        calendar.set(13, bleAICoachTime.getMSecond());
        calendar.set(14, 0);
        this.mPlanStartTime = calendar.getTimeInMillis();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPlanTarget = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPlanLevel = readInt32(LITTLE_ENDIAN);
        this.mCourses = new ArrayList();
        for (int i = 0; i < 7; i++) {
            BleAICoachDayPlanCourse bleAICoachDayPlanCourse = new BleAICoachDayPlanCourse(0, null, 0, 0.0f, 15, null);
            ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
            bleAICoachDayPlanCourse.setMCourseNumber(readInt32(LITTLE_ENDIAN2));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 6; i2++) {
                BleReadable bleReadable4 = (BleReadable) BleAICoachCourse.class.newInstance();
                bleReadable4.setMBytes(readBytes(16));
                bleReadable4.decode();
                Intrinsics.XXI(bleReadable4);
                arrayList.add(bleReadable4);
            }
            bleAICoachDayPlanCourse.setMCoursesItem(arrayList);
            ByteOrder LITTLE_ENDIAN3 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
            bleAICoachDayPlanCourse.setMCourseIndex(readInt32(LITTLE_ENDIAN3));
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
            bleAICoachDayPlanCourse.setMCourseGoal(readFloat(LITTLE_ENDIAN3));
            this.mCourses.add(bleAICoachDayPlanCourse);
        }
        ByteOrder LITTLE_ENDIAN4 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mProgress = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mAllExerciseTime = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mAll_METS = readFloat(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mAllCalorie = readInt32(LITTLE_ENDIAN4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        Object bytes;
        super.encode();
        BleWeekPlanTime.Companion companion = BleWeekPlanTime.Companion;
        writeObject(companion.ofPlanTime(this.mPlanTime));
        writeObject(companion.ofPlanTime(this.mCompletionMark));
        writeObject(BleAICoachTime.Companion.ofLocal(this.mPlanStartTime));
        float f = this.mPlanTarget;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        int i = this.mPlanLevel;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
        List<BleAICoachDayPlanCourse> list = this.mCourses;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (BleAICoachDayPlanCourse bleAICoachDayPlanCourse : list) {
            if (bleAICoachDayPlanCourse.getMCourseNumber() == 6) {
                int mCourseNumber = bleAICoachDayPlanCourse.getMCourseNumber();
                ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                writeInt32(mCourseNumber, LITTLE_ENDIAN2);
                writeList(bleAICoachDayPlanCourse.getMCoursesItem());
                int mCourseIndex = bleAICoachDayPlanCourse.getMCourseIndex();
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                writeInt32(mCourseIndex, LITTLE_ENDIAN2);
                float mCourseGoal = bleAICoachDayPlanCourse.getMCourseGoal();
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                writeFloat(mCourseGoal, LITTLE_ENDIAN2);
                bytes = Unit.OXO1;
            } else {
                bytes = readBytes(108);
            }
            arrayList.add(bytes);
        }
        int i2 = this.mProgress;
        ByteOrder LITTLE_ENDIAN3 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
        writeInt32(i2, LITTLE_ENDIAN3);
        int i3 = this.mAllExerciseTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
        writeInt32(i3, LITTLE_ENDIAN3);
        float f2 = this.mAll_METS;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
        writeFloat(f2, LITTLE_ENDIAN3);
        int i4 = this.mAllCalorie;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
        writeInt32(i4, LITTLE_ENDIAN3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachGeneratePlan)) {
            return false;
        }
        BleAICoachGeneratePlan bleAICoachGeneratePlan = (BleAICoachGeneratePlan) obj;
        return Intrinsics.XOO0ii0(this.mPlanTime, bleAICoachGeneratePlan.mPlanTime) && Intrinsics.XOO0ii0(this.mCompletionMark, bleAICoachGeneratePlan.mCompletionMark) && this.mPlanStartTime == bleAICoachGeneratePlan.mPlanStartTime && Float.compare(this.mPlanTarget, bleAICoachGeneratePlan.mPlanTarget) == 0 && this.mPlanLevel == bleAICoachGeneratePlan.mPlanLevel && Intrinsics.XOO0ii0(this.mCourses, bleAICoachGeneratePlan.mCourses) && this.mProgress == bleAICoachGeneratePlan.mProgress && this.mAllExerciseTime == bleAICoachGeneratePlan.mAllExerciseTime && Float.compare(this.mAll_METS, bleAICoachGeneratePlan.mAll_METS) == 0 && this.mAllCalorie == bleAICoachGeneratePlan.mAllCalorie;
    }

    public final int getMAllCalorie() {
        return this.mAllCalorie;
    }

    public final int getMAllExerciseTime() {
        return this.mAllExerciseTime;
    }

    public final float getMAll_METS() {
        return this.mAll_METS;
    }

    @aa1
    public final List<Integer> getMCompletionMark() {
        return this.mCompletionMark;
    }

    @aa1
    public final List<BleAICoachDayPlanCourse> getMCourses() {
        return this.mCourses;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 796;
    }

    public final int getMPlanLevel() {
        return this.mPlanLevel;
    }

    public final long getMPlanStartTime() {
        return this.mPlanStartTime;
    }

    public final float getMPlanTarget() {
        return this.mPlanTarget;
    }

    @aa1
    public final List<Integer> getMPlanTime() {
        return this.mPlanTime;
    }

    public final int getMProgress() {
        return this.mProgress;
    }

    public int hashCode() {
        return (((((((((((((((((this.mPlanTime.hashCode() * 31) + this.mCompletionMark.hashCode()) * 31) + Long.hashCode(this.mPlanStartTime)) * 31) + Float.hashCode(this.mPlanTarget)) * 31) + Integer.hashCode(this.mPlanLevel)) * 31) + this.mCourses.hashCode()) * 31) + Integer.hashCode(this.mProgress)) * 31) + Integer.hashCode(this.mAllExerciseTime)) * 31) + Float.hashCode(this.mAll_METS)) * 31) + Integer.hashCode(this.mAllCalorie);
    }

    public final void setMAllCalorie(int i) {
        this.mAllCalorie = i;
    }

    public final void setMAllExerciseTime(int i) {
        this.mAllExerciseTime = i;
    }

    public final void setMAll_METS(float f) {
        this.mAll_METS = f;
    }

    public final void setMCompletionMark(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCompletionMark = list;
    }

    public final void setMCourses(@aa1 List<BleAICoachDayPlanCourse> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCourses = list;
    }

    public final void setMPlanLevel(int i) {
        this.mPlanLevel = i;
    }

    public final void setMPlanStartTime(long j) {
        this.mPlanStartTime = j;
    }

    public final void setMPlanTarget(float f) {
        this.mPlanTarget = f;
    }

    public final void setMPlanTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPlanTime = list;
    }

    public final void setMProgress(int i) {
        this.mProgress = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachGeneratePlan(mPlanTime=" + this.mPlanTime + ", mCompletionMark=" + this.mCompletionMark + ", mPlanStartTime=" + this.mPlanStartTime + ",mPlanTarget=" + this.mPlanTarget + ",mPlanLevel=" + this.mPlanLevel + ",mProgress=" + this.mProgress + ",mAllExerciseTime=" + this.mAllExerciseTime + ",mAll_METS=" + this.mAll_METS + ",mAllCalorie=" + this.mAllCalorie + ",mCourses=" + this.mCourses + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachGeneratePlan(@aa1 List<Integer> mPlanTime, @aa1 List<Integer> mCompletionMark, long j, float f, int i, @aa1 List<BleAICoachDayPlanCourse> mCourses, int i2, int i3, float f2, int i4) {
        Intrinsics.X0O(mPlanTime, "mPlanTime");
        Intrinsics.X0O(mCompletionMark, "mCompletionMark");
        Intrinsics.X0O(mCourses, "mCourses");
        this.mPlanTime = mPlanTime;
        this.mCompletionMark = mCompletionMark;
        this.mPlanStartTime = j;
        this.mPlanTarget = f;
        this.mPlanLevel = i;
        this.mCourses = mCourses;
        this.mProgress = i2;
        this.mAllExerciseTime = i3;
        this.mAll_METS = f2;
        this.mAllCalorie = i4;
    }

    public /* synthetic */ BleAICoachGeneratePlan(List list, List list2, long j, float f, int i, List list3, int i2, int i3, float f2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new ArrayList() : list, (i5 & 2) != 0 ? new ArrayList() : list2, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? 0.0f : f, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? new ArrayList() : list3, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0.0f : f2, (i5 & 512) != 0 ? 0 : i4);
    }
}
