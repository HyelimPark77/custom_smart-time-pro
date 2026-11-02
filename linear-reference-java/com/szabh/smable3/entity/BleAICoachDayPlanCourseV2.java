package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICoachDayPlanCourseV2 extends BleWritable {
    private int mCourseCalorie;
    private int mCourseCode;
    private int mCourseContentNumber;
    private int mCourseTime;

    @aa1
    private List<BleAICoachCourseV2> mCoursesContent;
    private int mRepeatNumber;

    public BleAICoachDayPlanCourseV2() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        List r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachDayPlanCourseV2 copy$default(BleAICoachDayPlanCourseV2 r0, int r1, int r2, int r3, int r4, int r5, List r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mCourseCode;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mCourseContentNumber;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mCourseTime;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mCourseCalorie;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mRepeatNumber;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mCoursesContent;
    L20:
        int r9 = r5;
        List r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mCourseCode;
    }

    public final int component2() {
        return this.mCourseContentNumber;
    }

    public final int component3() {
        return this.mCourseTime;
    }

    public final int component4() {
        return this.mCourseCalorie;
    }

    public final int component5() {
        return this.mRepeatNumber;
    }

    @aa1
    public final List<BleAICoachCourseV2> component6() {
        return this.mCoursesContent;
    }

    @aa1
    public final BleAICoachDayPlanCourseV2 copy(int r9, int r10, int r11, int r12, int r13, @aa1 List<BleAICoachCourseV2> r14) {
        Intrinsics.X0O(r14, "mCoursesContent");
        return new BleAICoachDayPlanCourseV2(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICoachDayPlanCourseV2) == true) goto L8;
        return false;
    L8:
        BleAICoachDayPlanCourseV2 r6 = (BleAICoachDayPlanCourseV2) r5;
        if (this.mCourseCode == r6.mCourseCode) goto L12;
        return false;
    L12:
        if (this.mCourseContentNumber == r6.mCourseContentNumber) goto L15;
        return false;
    L15:
        if (this.mCourseTime == r6.mCourseTime) goto L18;
        return false;
    L18:
        if (this.mCourseCalorie == r6.mCourseCalorie) goto L21;
        return false;
    L21:
        if (this.mRepeatNumber == r6.mRepeatNumber) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mCoursesContent, r6.mCoursesContent) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMCourseCalorie() {
        return this.mCourseCalorie;
    }

    public final int getMCourseCode() {
        return this.mCourseCode;
    }

    public final int getMCourseContentNumber() {
        return this.mCourseContentNumber;
    }

    public final int getMCourseTime() {
        return this.mCourseTime;
    }

    @aa1
    public final List<BleAICoachCourseV2> getMCoursesContent() {
        return this.mCoursesContent;
    }

    public final int getMRepeatNumber() {
        return this.mRepeatNumber;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mCourseCode) * 31) + Integer.hashCode(this.mCourseContentNumber)) * 31) + Integer.hashCode(this.mCourseTime)) * 31) + Integer.hashCode(this.mCourseCalorie)) * 31) + Integer.hashCode(this.mRepeatNumber)) * 31) + this.mCoursesContent.hashCode();
    }

    public final void setMCourseCalorie(int r1) {
        this.mCourseCalorie = r1;
    }

    public final void setMCourseCode(int r1) {
        this.mCourseCode = r1;
    }

    public final void setMCourseContentNumber(int r1) {
        this.mCourseContentNumber = r1;
    }

    public final void setMCourseTime(int r1) {
        this.mCourseTime = r1;
    }

    public final void setMCoursesContent(@aa1 List<BleAICoachCourseV2> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCoursesContent = r2;
    }

    public final void setMRepeatNumber(int r1) {
        this.mRepeatNumber = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachDayPlanCourseV2(mCourseCode=" + this.mCourseCode + ", mCourseContentNumber=" + this.mCourseContentNumber + ", mCourseTime=" + this.mCourseTime + ", mCourseCalorie=" + this.mCourseCalorie + ", mRepeatNumber=" + this.mRepeatNumber + ", mCoursesContent=" + this.mCoursesContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachDayPlanCourseV2(int r2, int r3, int r4, int r5, int r6, @aa1 List<BleAICoachCourseV2> r7) {
        Intrinsics.X0O(r7, "mCoursesContent");
        this.mCourseCode = r2;
        this.mCourseContentNumber = r3;
        this.mCourseTime = r4;
        this.mCourseCalorie = r5;
        this.mRepeatNumber = r6;
        this.mCoursesContent = r7;
    }

    public /* synthetic */ BleAICoachDayPlanCourseV2(int r2, int r3, int r4, int r5, int r6, List r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = -1;
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
        if ((r8 & 32) == 0) goto L20;
        r7 = new ArrayList();
    L20:
        int r10 = r6;
        List r11 = r7;
        this(r2, r3, r4, r5, r10, r11);
    }
}
