package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.p1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
        int r1 = 0;
        int r2 = 0;
        long r3 = 0;
        List r5 = null;
        List r6 = null;
        int r7 = 0;
        int r8 = 0;
        float r9 = 0.0f;
        float r10 = 0.0f;
        float r11 = 0.0f;
        float r12 = 0.0f;
        float r13 = 0.0f;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        List r18 = null;
        List r19 = null;
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, p1.OXO1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachGeneratePlanV2 copy$default(BleAICoachGeneratePlanV2 r17, int r18, int r19, long r20, List r22, List r23, int r24, int r25, float r26, float r27, float r28, float r29, float r30, int r31, int r32, int r33, int r34, List r35, List r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        int r2 = r17.mAICoachType;
    L7:
        if ((r37 & 2) == 0) goto L9;
        int r3 = r17.mPlanWeekNum;
    L11:
        if ((r37 & 4) == 0) goto L13;
        long r4 = r17.mPlanStartTime;
    L15:
        if ((r37 & 8) == 0) goto L17;
        List r6 = r17.mPlanTime;
    L19:
        if ((r37 & 16) == 0) goto L21;
        List r7 = r17.mCompletionMark;
    L23:
        if ((r37 & 32) == 0) goto L25;
        int r8 = r17.mProgress;
    L27:
        if ((r37 & 64) == 0) goto L29;
        int r9 = r17.mCalorie;
    L31:
        if ((r37 & 128) == 0) goto L33;
        float r10 = r17.mDistance;
    L35:
        if ((r37 & 256) == 0) goto L37;
        float r11 = r17.mVo2MaxStartTime;
    L39:
        if ((r37 & 512) == 0) goto L41;
        float r12 = r17.mVo2MaxEndTime;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        float r13 = r17.mPhysicalFitnessStartTime;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        float r14 = r17.mPhysicalFitnessEndTime;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        int r15 = r17.mHalfHorseStartScore;
    L54:
        int r110 = r2;
        if ((r37 & 8192) == 0) goto L57;
        int r5 = r17.mHalfHorseEndScore;
    L58:
        int r111 = r5;
        if ((r37 & 16384) == 0) goto L61;
        int r16 = r17.mWholeHorseStartScore;
    L63:
        if ((r37 & 32768) == 0) goto L65;
        int r1 = r17.mWholeHorseEndScore;
    L66:
        int r21 = r1;
        if ((r37 & 65536) == 0) goto L69;
        List r39 = r17.mCourses;
    L71:
        if ((r37 & 131072) == 0) goto L74;
        List r210 = r39;
        List r310 = r210;
        List r311 = r17.mLeaveDayV2;
    L76:
        return r17.copy(r110, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r111, r16, r21, r310, r311);
    L74:
        r311 = r36;
        r310 = r39;
        goto L76
    L69:
        r39 = r35;
        goto L71
    L65:
        r1 = r34;
        goto L66
    L61:
        r16 = r33;
        goto L63
    L57:
        r5 = r32;
        goto L58
    L53:
        r15 = r31;
        goto L54
    L49:
        r14 = r30;
        goto L51
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
        goto L43
    L37:
        r11 = r27;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r9 = r25;
        goto L31
    L25:
        r8 = r24;
        goto L27
    L21:
        r7 = r23;
        goto L23
    L17:
        r6 = r22;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
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
    public final BleAICoachGeneratePlanV2 copy(int r22, int r23, long r24, @aa1 List<Integer> r26, @aa1 List<Integer> r27, int r28, int r29, float r30, float r31, float r32, float r33, float r34, int r35, int r36, int r37, int r38, @aa1 List<BleAICoachDayPlanCourseV2> r39, @aa1 List<Long> r40) {
        Intrinsics.X0O(r26, "mPlanTime");
        Intrinsics.X0O(r27, "mCompletionMark");
        Intrinsics.X0O(r39, "mCourses");
        Intrinsics.X0O(r40, "mLeaveDayV2");
        return new BleAICoachGeneratePlanV2(r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mPlanTime.clear();
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= 4) goto L6;
        BleReadable r3 = (BleReadable) BleWeekPlanTime.class.newInstance();
        r3.setMBytes(readBytes(4));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mPlanTime.addAll(ArraysKt___ArraysKt.XXiO0(((BleWeekPlanTime) r3).getMList(), 28));
        r1 = r1 + 1;
        goto L4
    L6:
        this.mCompletionMark.clear();
    L7:
        if (r0 >= 4) goto L9;
        BleReadable r2 = (BleReadable) BleWeekPlanTime.class.newInstance();
        r2.setMBytes(readBytes(4));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mCompletionMark.addAll(ArraysKt___ArraysKt.XXiO0(((BleWeekPlanTime) r2).getMList(), 28));
        r0 = r0 + 1;
        goto L7
    L9:
        ByteOrder r4 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mProgress = readInt16(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mCalorie = readInt16(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mDistance = readFloat(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mVo2MaxStartTime = readFloat(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mVo2MaxEndTime = readFloat(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mPhysicalFitnessStartTime = readFloat(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mPhysicalFitnessEndTime = readFloat(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mHalfHorseStartScore = readInt32(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mHalfHorseEndScore = readInt32(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mWholeHorseStartScore = readInt32(r4);
        Intrinsics.O10IXXX0X(r4, "LITTLE_ENDIAN");
        this.mWholeHorseEndScore = readInt32(r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mAICoachType);
        writeInt8(this.mPlanWeekNum);
        writeObject(BleTime.Companion.ofLocal(this.mPlanStartTime));
        List r0 = CollectionsKt___CollectionsKt.X10i(this.mPlanTime, 28);
        int r3 = 0;
    L4:
        if (r3 >= 4) goto L10;
        if (r0.size() <= r3) goto L8;
        writeObject(BleWeekPlanTimeV2.Companion.ofPlanTime(CollectionsKt___CollectionsKt.OO0Oi10((Collection) r0.get(r3))));
    L9:
        r3 = r3 + 1;
        goto L4
    L8:
        BleWritable.writeInt32$default(this, 0, null, 2, null);
        goto L9
    L10:
        List r1 = CollectionsKt___CollectionsKt.X10i(this.mCompletionMark, 28);
        int r2 = 0;
    L11:
        if (r2 >= 4) goto L17;
        if (r1.size() <= r2) goto L15;
        writeObject(BleWeekPlanTimeV2.Companion.ofPlanTime(CollectionsKt___CollectionsKt.OO0Oi10((Collection) r1.get(r2))));
    L16:
        r2 = r2 + 1;
        goto L11
    L15:
        BleWritable.writeInt32$default(this, 0, null, 2, null);
        goto L16
    L17:
        int r4 = this.mProgress;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt16(r4, r5);
        int r6 = this.mCalorie;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt16(r6, r5);
        float r7 = this.mDistance;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeFloat(r7, r5);
        float r8 = this.mVo2MaxStartTime;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeFloat(r8, r5);
        float r9 = this.mVo2MaxEndTime;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeFloat(r9, r5);
        float r10 = this.mPhysicalFitnessStartTime;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeFloat(r10, r5);
        float r11 = this.mPhysicalFitnessEndTime;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeFloat(r11, r5);
        int r12 = this.mHalfHorseStartScore;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt32(r12, r5);
        int r13 = this.mHalfHorseEndScore;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt32(r13, r5);
        int r14 = this.mWholeHorseStartScore;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt32(r14, r5);
        int r15 = this.mWholeHorseEndScore;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt32(r15, r5);
        int r16 = 0;
    L18:
        if (r16 >= 4) goto L24;
        if (this.mLeaveDayV2.size() <= r16) goto L22;
        writeObject(BleTime.Companion.ofLocal(this.mLeaveDayV2.get(r16).longValue()));
    L23:
        r16 = r16 + 1;
        goto L18
    L22:
        ByteOrder r17 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r17, "LITTLE_ENDIAN");
        writeInt16(0, r17);
        Intrinsics.O10IXXX0X(r17, "LITTLE_ENDIAN");
        writeInt32(0, r17);
        goto L23
    L24:
        List<BleAICoachDayPlanCourseV2> r18 = this.mCourses;
        ArrayList r19 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r18, 10));
        Iterator<T> r20 = r18.iterator();
    L26:
        if (r20.hasNext() == false) goto L31;
        BleAICoachDayPlanCourseV2 r21 = (BleAICoachDayPlanCourseV2) r20.next();
        writeInt8(r21.getMCourseCode());
        writeInt8(r21.getMCourseContentNumber());
        int r22 = r21.getMCourseTime();
        ByteOrder r23 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r23, "LITTLE_ENDIAN");
        writeInt16(r22, r23);
        int r24 = r21.getMCourseCalorie();
        Intrinsics.O10IXXX0X(r23, "LITTLE_ENDIAN");
        writeInt16(r24, r23);
        writeInt8(r21.getMRepeatNumber());
        writeInt8(0);
        writeList(r21.getMCoursesContent());
        int r25 = 10 - r21.getMCourseContentNumber();
        int r26 = 0;
    L28:
        if (r26 >= r25) goto L30;
        BleWritable.writeInt32$default(this, 0, null, 2, null);
        BleWritable.writeInt32$default(this, 0, null, 2, null);
        r26 = r26 + 1;
        goto L28
    L30:
        r19.add(Unit.OXO1);
        goto L26
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleAICoachGeneratePlanV2) == true) goto L8;
        return false;
    L8:
        BleAICoachGeneratePlanV2 r9 = (BleAICoachGeneratePlanV2) r8;
        if (this.mAICoachType == r9.mAICoachType) goto L12;
        return false;
    L12:
        if (this.mPlanWeekNum == r9.mPlanWeekNum) goto L15;
        return false;
    L15:
        if (this.mPlanStartTime == r9.mPlanStartTime) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mPlanTime, r9.mPlanTime) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mCompletionMark, r9.mCompletionMark) == true) goto L24;
        return false;
    L24:
        if (this.mProgress == r9.mProgress) goto L27;
        return false;
    L27:
        if (this.mCalorie == r9.mCalorie) goto L30;
        return false;
    L30:
        if (Float.compare(this.mDistance, r9.mDistance) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.mVo2MaxStartTime, r9.mVo2MaxStartTime) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.mVo2MaxEndTime, r9.mVo2MaxEndTime) == 0) goto L39;
        return false;
    L39:
        if (Float.compare(this.mPhysicalFitnessStartTime, r9.mPhysicalFitnessStartTime) == 0) goto L42;
        return false;
    L42:
        if (Float.compare(this.mPhysicalFitnessEndTime, r9.mPhysicalFitnessEndTime) == 0) goto L45;
        return false;
    L45:
        if (this.mHalfHorseStartScore == r9.mHalfHorseStartScore) goto L48;
        return false;
    L48:
        if (this.mHalfHorseEndScore == r9.mHalfHorseEndScore) goto L51;
        return false;
    L51:
        if (this.mWholeHorseStartScore == r9.mWholeHorseStartScore) goto L54;
        return false;
    L54:
        if (this.mWholeHorseEndScore == r9.mWholeHorseEndScore) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.mCourses, r9.mCourses) == true) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mLeaveDayV2, r9.mLeaveDayV2) == true) goto L62;
        return false;
    L62:
        return true;
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

    public final void setMAICoachType(int r1) {
        this.mAICoachType = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMCompletionMark(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCompletionMark = r2;
    }

    public final void setMCourses(@aa1 List<BleAICoachDayPlanCourseV2> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCourses = r2;
    }

    public final void setMDistance(float r1) {
        this.mDistance = r1;
    }

    public final void setMHalfHorseEndScore(int r1) {
        this.mHalfHorseEndScore = r1;
    }

    public final void setMHalfHorseStartScore(int r1) {
        this.mHalfHorseStartScore = r1;
    }

    public final void setMLeaveDayV2(@aa1 List<Long> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLeaveDayV2 = r2;
    }

    public final void setMPhysicalFitnessEndTime(float r1) {
        this.mPhysicalFitnessEndTime = r1;
    }

    public final void setMPhysicalFitnessStartTime(float r1) {
        this.mPhysicalFitnessStartTime = r1;
    }

    public final void setMPlanStartTime(long r1) {
        this.mPlanStartTime = r1;
    }

    public final void setMPlanTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlanTime = r2;
    }

    public final void setMPlanWeekNum(int r1) {
        this.mPlanWeekNum = r1;
    }

    public final void setMProgress(int r1) {
        this.mProgress = r1;
    }

    public final void setMVo2MaxEndTime(float r1) {
        this.mVo2MaxEndTime = r1;
    }

    public final void setMVo2MaxStartTime(float r1) {
        this.mVo2MaxStartTime = r1;
    }

    public final void setMWholeHorseEndScore(int r1) {
        this.mWholeHorseEndScore = r1;
    }

    public final void setMWholeHorseStartScore(int r1) {
        this.mWholeHorseStartScore = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachGeneratePlanV2(mPlanTime=" + this.mPlanTime + ", mCompletionMark=" + this.mCompletionMark + ", mPlanWeekNum = " + this.mPlanWeekNum + ",mPlanStartTime=" + this.mPlanStartTime + ",mProgress = " + this.mProgress + ", mDistance = " + this.mDistance + " , mCalorie = " + this.mCalorie + " ,mVo2MaxStartTime = " + this.mVo2MaxStartTime + " , mVo2MaxEndTime = " + this.mVo2MaxEndTime + " , mPhysicalFitnessStartTime = " + this.mPhysicalFitnessStartTime + "mPhysicalFitnessEndTime = " + this.mPhysicalFitnessEndTime + " , mHalfHorseStartScore = " + this.mHalfHorseStartScore + ",mHalfHorseEndScore = " + this.mHalfHorseEndScore + " , mWholeHorseStartScore = " + this.mWholeHorseStartScore + ", mWholeHorseEndScore = " + this.mWholeHorseEndScore + " , mCourses=" + this.mCourses + ", mLeaveDayV2 = " + this.mLeaveDayV2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachGeneratePlanV2(int r4, int r5, long r6, @aa1 List<Integer> r8, @aa1 List<Integer> r9, int r10, int r11, float r12, float r13, float r14, float r15, float r16, int r17, int r18, int r19, int r20, @aa1 List<BleAICoachDayPlanCourseV2> r21, @aa1 List<Long> r22) {
        Intrinsics.X0O(r8, "mPlanTime");
        Intrinsics.X0O(r9, "mCompletionMark");
        Intrinsics.X0O(r21, "mCourses");
        Intrinsics.X0O(r22, "mLeaveDayV2");
        this.mAICoachType = r4;
        this.mPlanWeekNum = r5;
        this.mPlanStartTime = r6;
        this.mPlanTime = r8;
        this.mCompletionMark = r9;
        this.mProgress = r10;
        this.mCalorie = r11;
        this.mDistance = r12;
        this.mVo2MaxStartTime = r13;
        this.mVo2MaxEndTime = r14;
        this.mPhysicalFitnessStartTime = r15;
        this.mPhysicalFitnessEndTime = r16;
        this.mHalfHorseStartScore = r17;
        this.mHalfHorseEndScore = r18;
        this.mWholeHorseStartScore = r19;
        this.mWholeHorseEndScore = r20;
        this.mCourses = r21;
        this.mLeaveDayV2 = r22;
    }

    public /* synthetic */ BleAICoachGeneratePlanV2(int r20, int r21, long r22, List r24, List r25, int r26, int r27, float r28, float r29, float r30, float r31, float r32, int r33, int r34, int r35, int r36, List r37, List r38, int r39, DefaultConstructorMarker r40) {
        if ((r39 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r39 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r39 & 4) == 0) goto L13;
        long r4 = 0;
    L15:
        if ((r39 & 8) == 0) goto L17;
        List r6 = new ArrayList();
    L19:
        if ((r39 & 16) == 0) goto L21;
        List r7 = new ArrayList();
    L23:
        if ((r39 & 32) == 0) goto L25;
        int r8 = 0;
    L27:
        if ((r39 & 64) == 0) goto L29;
        int r9 = 0;
    L30:
        float r11 = 0.0f;
        if ((r39 & 128) == 0) goto L33;
        float r10 = 0.0f;
    L35:
        if ((r39 & 256) == 0) goto L37;
        float r12 = 0.0f;
    L39:
        if ((r39 & 512) == 0) goto L41;
        float r13 = 0.0f;
    L43:
        if ((r39 & 1024) == 0) goto L45;
        float r14 = 0.0f;
    L47:
        if ((r39 & 2048) != 0) goto L51;
        r11 = r32;
    L51:
        if ((r39 & 4096) == 0) goto L53;
        int r15 = 0;
    L55:
        if ((r39 & 8192) == 0) goto L57;
        int r2 = 0;
    L58:
        int r23 = r1;
        if ((r39 & 16384) == 0) goto L61;
        int r5 = 0;
    L63:
        if ((r39 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r39 & 65536) == 0) goto L69;
        List r17 = new ArrayList();
    L71:
        if ((r39 & 131072) == 0) goto L74;
        List r310 = new ArrayList();
    L75:
        this(r23, r3, r4, r6, r7, r8, r9, r10, r12, r13, r14, r11, r15, r2, r5, r16, r17, r310);
        return;
    L74:
        r310 = r38;
        goto L75
    L69:
        r17 = r37;
        goto L71
    L65:
        r16 = r36;
        goto L67
    L61:
        r5 = r35;
        goto L63
    L57:
        r2 = r34;
        goto L58
    L53:
        r15 = r33;
        goto L55
    L45:
        r14 = r31;
        goto L47
    L41:
        r13 = r30;
        goto L43
    L37:
        r12 = r29;
        goto L39
    L33:
        r10 = r28;
        goto L35
    L29:
        r9 = r27;
        goto L30
    L25:
        r8 = r26;
        goto L27
    L21:
        r7 = r25;
        goto L23
    L17:
        r6 = r24;
        goto L19
    L13:
        r4 = r22;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }
}
