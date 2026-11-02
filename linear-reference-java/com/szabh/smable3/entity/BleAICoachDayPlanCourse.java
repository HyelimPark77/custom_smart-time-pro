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
public final class BleAICoachDayPlanCourse extends BleWritable {
    private float mCourseGoal;
    private int mCourseIndex;
    private int mCourseNumber;

    @aa1
    private List<BleAICoachCourse> mCoursesItem;

    public BleAICoachDayPlanCourse() {
        int r1 = 0;
        List r2 = null;
        int r3 = 0;
        float r4 = 0.0f;
        this(r1, r2, r3, r4, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachDayPlanCourse copy$default(BleAICoachDayPlanCourse r0, int r1, List r2, int r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mCourseNumber;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mCoursesItem;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mCourseIndex;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mCourseGoal;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mCourseNumber;
    }

    @aa1
    public final List<BleAICoachCourse> component2() {
        return this.mCoursesItem;
    }

    public final int component3() {
        return this.mCourseIndex;
    }

    public final float component4() {
        return this.mCourseGoal;
    }

    @aa1
    public final BleAICoachDayPlanCourse copy(int r2, @aa1 List<BleAICoachCourse> r3, int r4, float r5) {
        Intrinsics.X0O(r3, "mCoursesItem");
        return new BleAICoachDayPlanCourse(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICoachDayPlanCourse) == true) goto L8;
        return false;
    L8:
        BleAICoachDayPlanCourse r6 = (BleAICoachDayPlanCourse) r5;
        if (this.mCourseNumber == r6.mCourseNumber) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mCoursesItem, r6.mCoursesItem) == true) goto L15;
        return false;
    L15:
        if (this.mCourseIndex == r6.mCourseIndex) goto L18;
        return false;
    L18:
        if (Float.compare(this.mCourseGoal, r6.mCourseGoal) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public final float getMCourseGoal() {
        return this.mCourseGoal;
    }

    public final int getMCourseIndex() {
        return this.mCourseIndex;
    }

    public final int getMCourseNumber() {
        return this.mCourseNumber;
    }

    @aa1
    public final List<BleAICoachCourse> getMCoursesItem() {
        return this.mCoursesItem;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mCourseNumber) * 31) + this.mCoursesItem.hashCode()) * 31) + Integer.hashCode(this.mCourseIndex)) * 31) + Float.hashCode(this.mCourseGoal);
    }

    public final void setMCourseGoal(float r1) {
        this.mCourseGoal = r1;
    }

    public final void setMCourseIndex(int r1) {
        this.mCourseIndex = r1;
    }

    public final void setMCourseNumber(int r1) {
        this.mCourseNumber = r1;
    }

    public final void setMCoursesItem(@aa1 List<BleAICoachCourse> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCoursesItem = r2;
    }

    @aa1
    public String toString() {
        return "BleAICoachDayPlanCourse(mCourseNumber=" + this.mCourseNumber + ", mCoursesItem=" + this.mCoursesItem + ", mCourseIndex=" + this.mCourseIndex + ", mCourseGoal=" + this.mCourseGoal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachDayPlanCourse(int r2, @aa1 List<BleAICoachCourse> r3, int r4, float r5) {
        Intrinsics.X0O(r3, "mCoursesItem");
        this.mCourseNumber = r2;
        this.mCoursesItem = r3;
        this.mCourseIndex = r4;
        this.mCourseGoal = r5;
    }

    public /* synthetic */ BleAICoachDayPlanCourse(int r2, List r3, int r4, float r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = new ArrayList();
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0.0f;
    L14:
        this(r2, r3, r4, r5);
    }
}
