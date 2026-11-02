package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
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
        List r1 = null;
        List r2 = null;
        long r3 = 0;
        float r5 = 0.0f;
        int r6 = 0;
        List r7 = null;
        int r8 = 0;
        int r9 = 0;
        float r10 = 0.0f;
        int r11 = 0;
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachGeneratePlan copy$default(BleAICoachGeneratePlan r0, List r1, List r2, long r3, float r5, int r6, List r7, int r8, int r9, float r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mPlanTime;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mCompletionMark;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mPlanStartTime;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = r0.mPlanTarget;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = r0.mPlanLevel;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = r0.mCourses;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = r0.mProgress;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = r0.mAllExerciseTime;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = r0.mAll_METS;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = r0.mAllCalorie;
    L32:
        float r14 = r10;
        int r15 = r11;
        int r16 = r8;
        int r17 = r9;
        List r18 = r7;
        float r19 = r5;
        long r20 = r3;
        List r4 = r1;
        List r21 = r2;
        return r0.copy(r4, r21, r20, r19, r6, r18, r16, r17, r14, r15);
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
    public final BleAICoachGeneratePlan copy(@aa1 List<Integer> r14, @aa1 List<Integer> r15, long r16, float r18, int r19, @aa1 List<BleAICoachDayPlanCourse> r20, int r21, int r22, float r23, int r24) {
        Intrinsics.X0O(r14, "mPlanTime");
        Intrinsics.X0O(r15, "mCompletionMark");
        Intrinsics.X0O(r20, "mCourses");
        return new BleAICoachGeneratePlan(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable r1 = (BleReadable) BleWeekPlanTime.class.newInstance();
        r1.setMBytes(readBytes(4));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mPlanTime = ArraysKt___ArraysKt.OXI0X0(((BleWeekPlanTime) r1).getMList());
        BleReadable r0 = (BleReadable) BleWeekPlanTime.class.newInstance();
        r0.setMBytes(readBytes(4));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mCompletionMark = ArraysKt___ArraysKt.OXI0X0(((BleWeekPlanTime) r0).getMList());
        BleReadable r2 = (BleReadable) BleAICoachTime.class.newInstance();
        r2.setMBytes(readBytes(8));
        r2.decode();
        Intrinsics.XXI(r2);
        BleAICoachTime r3 = (BleAICoachTime) r2;
        Calendar r4 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r4, "getInstance(...)");
        r4.set(1, r3.getMYear());
        r4.set(2, r3.getMMonth() - 1);
        r4.set(5, r3.getMDay());
        r4.set(11, r3.getMHour());
        r4.set(12, r3.getMMinute());
        r4.set(13, r3.getMSecond());
        r4.set(14, 0);
        this.mPlanStartTime = r4.getTimeInMillis();
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        this.mPlanTarget = readFloat(r5);
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        this.mPlanLevel = readInt32(r5);
        this.mCourses = new ArrayList();
        int r6 = 0;
    L4:
        if (r6 >= 7) goto L10;
        BleAICoachDayPlanCourse r7 = new BleAICoachDayPlanCourse(0, null, 0, 0.0f, 15, null);
        ByteOrder r8 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r8, "LITTLE_ENDIAN");
        r7.setMCourseNumber(readInt32(r8));
        ArrayList r9 = new ArrayList();
        int r10 = 0;
    L7:
        if (r10 >= 6) goto L9;
        BleReadable r11 = (BleReadable) BleAICoachCourse.class.newInstance();
        r11.setMBytes(readBytes(16));
        r11.decode();
        Intrinsics.XXI(r11);
        r9.add(r11);
        r10 = r10 + 1;
        goto L7
    L9:
        r7.setMCoursesItem(r9);
        ByteOrder r12 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r12, "LITTLE_ENDIAN");
        r7.setMCourseIndex(readInt32(r12));
        Intrinsics.O10IXXX0X(r12, "LITTLE_ENDIAN");
        r7.setMCourseGoal(readFloat(r12));
        this.mCourses.add(r7);
        r6 = r6 + 1;
        goto L4
    L10:
        ByteOrder r13 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r13, "LITTLE_ENDIAN");
        this.mProgress = readInt32(r13);
        Intrinsics.O10IXXX0X(r13, "LITTLE_ENDIAN");
        this.mAllExerciseTime = readInt32(r13);
        Intrinsics.O10IXXX0X(r13, "LITTLE_ENDIAN");
        this.mAll_METS = readFloat(r13);
        Intrinsics.O10IXXX0X(r13, "LITTLE_ENDIAN");
        this.mAllCalorie = readInt32(r13);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWeekPlanTime.Companion r0 = BleWeekPlanTime.Companion;
        writeObject(r0.ofPlanTime(this.mPlanTime));
        writeObject(r0.ofPlanTime(this.mCompletionMark));
        writeObject(BleAICoachTime.Companion.ofLocal(this.mPlanStartTime));
        float r1 = this.mPlanTarget;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeFloat(r1, r2);
        int r3 = this.mPlanLevel;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r3, r2);
        List<BleAICoachDayPlanCourse> r4 = this.mCourses;
        ArrayList r5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r4, 10));
        Iterator<T> r6 = r4.iterator();
    L4:
        if (r6.hasNext() == false) goto L10;
        BleAICoachDayPlanCourse r7 = (BleAICoachDayPlanCourse) r6.next();
        if (r7.getMCourseNumber() != 6) goto L8;
        int r8 = r7.getMCourseNumber();
        ByteOrder r9 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        writeInt32(r8, r9);
        writeList(r7.getMCoursesItem());
        int r10 = r7.getMCourseIndex();
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        writeInt32(r10, r9);
        float r11 = r7.getMCourseGoal();
        Intrinsics.O10IXXX0X(r9, "LITTLE_ENDIAN");
        writeFloat(r11, r9);
        Object r12 = Unit.OXO1;
    L9:
        r5.add(r12);
        goto L4
    L8:
        r12 = readBytes(108);
        goto L9
    L10:
        int r13 = this.mProgress;
        ByteOrder r14 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        writeInt32(r13, r14);
        int r15 = this.mAllExerciseTime;
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        writeInt32(r15, r14);
        float r16 = this.mAll_METS;
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        writeFloat(r16, r14);
        int r17 = this.mAllCalorie;
        Intrinsics.O10IXXX0X(r14, "LITTLE_ENDIAN");
        writeInt32(r17, r14);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleAICoachGeneratePlan) == true) goto L8;
        return false;
    L8:
        BleAICoachGeneratePlan r9 = (BleAICoachGeneratePlan) r8;
        if (Intrinsics.XOO0ii0(this.mPlanTime, r9.mPlanTime) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mCompletionMark, r9.mCompletionMark) == true) goto L15;
        return false;
    L15:
        if (this.mPlanStartTime == r9.mPlanStartTime) goto L18;
        return false;
    L18:
        if (Float.compare(this.mPlanTarget, r9.mPlanTarget) == 0) goto L21;
        return false;
    L21:
        if (this.mPlanLevel == r9.mPlanLevel) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mCourses, r9.mCourses) == true) goto L27;
        return false;
    L27:
        if (this.mProgress == r9.mProgress) goto L30;
        return false;
    L30:
        if (this.mAllExerciseTime == r9.mAllExerciseTime) goto L33;
        return false;
    L33:
        if (Float.compare(this.mAll_METS, r9.mAll_METS) == 0) goto L36;
        return false;
    L36:
        if (this.mAllCalorie == r9.mAllCalorie) goto L38;
        return false;
    L38:
        return true;
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

    public final void setMAllCalorie(int r1) {
        this.mAllCalorie = r1;
    }

    public final void setMAllExerciseTime(int r1) {
        this.mAllExerciseTime = r1;
    }

    public final void setMAll_METS(float r1) {
        this.mAll_METS = r1;
    }

    public final void setMCompletionMark(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCompletionMark = r2;
    }

    public final void setMCourses(@aa1 List<BleAICoachDayPlanCourse> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCourses = r2;
    }

    public final void setMPlanLevel(int r1) {
        this.mPlanLevel = r1;
    }

    public final void setMPlanStartTime(long r1) {
        this.mPlanStartTime = r1;
    }

    public final void setMPlanTarget(float r1) {
        this.mPlanTarget = r1;
    }

    public final void setMPlanTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlanTime = r2;
    }

    public final void setMProgress(int r1) {
        this.mProgress = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachGeneratePlan(mPlanTime=" + this.mPlanTime + ", mCompletionMark=" + this.mCompletionMark + ", mPlanStartTime=" + this.mPlanStartTime + ",mPlanTarget=" + this.mPlanTarget + ",mPlanLevel=" + this.mPlanLevel + ",mProgress=" + this.mProgress + ",mAllExerciseTime=" + this.mAllExerciseTime + ",mAll_METS=" + this.mAll_METS + ",mAllCalorie=" + this.mAllCalorie + ",mCourses=" + this.mCourses + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachGeneratePlan(@aa1 List<Integer> r2, @aa1 List<Integer> r3, long r4, float r6, int r7, @aa1 List<BleAICoachDayPlanCourse> r8, int r9, int r10, float r11, int r12) {
        Intrinsics.X0O(r2, "mPlanTime");
        Intrinsics.X0O(r3, "mCompletionMark");
        Intrinsics.X0O(r8, "mCourses");
        this.mPlanTime = r2;
        this.mCompletionMark = r3;
        this.mPlanStartTime = r4;
        this.mPlanTarget = r6;
        this.mPlanLevel = r7;
        this.mCourses = r8;
        this.mProgress = r9;
        this.mAllExerciseTime = r10;
        this.mAll_METS = r11;
        this.mAllCalorie = r12;
    }

    public /* synthetic */ BleAICoachGeneratePlan(List r3, List r4, long r5, float r7, int r8, List r9, int r10, int r11, float r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = new ArrayList();
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = new ArrayList();
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r7 = 0.0f;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r8 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r9 = new ArrayList();
    L21:
        if ((r14 & 64) == 0) goto L24;
        r10 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r11 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r12 = 0.0f;
    L30:
        if ((r14 & 512) == 0) goto L33;
        int r16 = 0;
    L34:
        this(r3, r4, r5, r7, r8, r9, r10, r11, r12, r16);
        return;
    L33:
        r16 = r13;
        goto L34
    }
}
