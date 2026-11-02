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
        this(0, 0, 0, 0, 0, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachDayPlanCourseV2 copy$default(BleAICoachDayPlanCourseV2 bleAICoachDayPlanCourseV2, int i, int i2, int i3, int i4, int i5, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleAICoachDayPlanCourseV2.mCourseCode;
        }
        if ((i6 & 2) != 0) {
            i2 = bleAICoachDayPlanCourseV2.mCourseContentNumber;
        }
        if ((i6 & 4) != 0) {
            i3 = bleAICoachDayPlanCourseV2.mCourseTime;
        }
        if ((i6 & 8) != 0) {
            i4 = bleAICoachDayPlanCourseV2.mCourseCalorie;
        }
        if ((i6 & 16) != 0) {
            i5 = bleAICoachDayPlanCourseV2.mRepeatNumber;
        }
        if ((i6 & 32) != 0) {
            list = bleAICoachDayPlanCourseV2.mCoursesContent;
        }
        int i7 = i5;
        List list2 = list;
        return bleAICoachDayPlanCourseV2.copy(i, i2, i3, i4, i7, list2);
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
    public final BleAICoachDayPlanCourseV2 copy(int i, int i2, int i3, int i4, int i5, @aa1 List<BleAICoachCourseV2> mCoursesContent) {
        Intrinsics.X0O(mCoursesContent, "mCoursesContent");
        return new BleAICoachDayPlanCourseV2(i, i2, i3, i4, i5, mCoursesContent);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachDayPlanCourseV2)) {
            return false;
        }
        BleAICoachDayPlanCourseV2 bleAICoachDayPlanCourseV2 = (BleAICoachDayPlanCourseV2) obj;
        return this.mCourseCode == bleAICoachDayPlanCourseV2.mCourseCode && this.mCourseContentNumber == bleAICoachDayPlanCourseV2.mCourseContentNumber && this.mCourseTime == bleAICoachDayPlanCourseV2.mCourseTime && this.mCourseCalorie == bleAICoachDayPlanCourseV2.mCourseCalorie && this.mRepeatNumber == bleAICoachDayPlanCourseV2.mRepeatNumber && Intrinsics.XOO0ii0(this.mCoursesContent, bleAICoachDayPlanCourseV2.mCoursesContent);
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

    public final void setMCourseCalorie(int i) {
        this.mCourseCalorie = i;
    }

    public final void setMCourseCode(int i) {
        this.mCourseCode = i;
    }

    public final void setMCourseContentNumber(int i) {
        this.mCourseContentNumber = i;
    }

    public final void setMCourseTime(int i) {
        this.mCourseTime = i;
    }

    public final void setMCoursesContent(@aa1 List<BleAICoachCourseV2> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCoursesContent = list;
    }

    public final void setMRepeatNumber(int i) {
        this.mRepeatNumber = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachDayPlanCourseV2(mCourseCode=" + this.mCourseCode + ", mCourseContentNumber=" + this.mCourseContentNumber + ", mCourseTime=" + this.mCourseTime + ", mCourseCalorie=" + this.mCourseCalorie + ", mRepeatNumber=" + this.mRepeatNumber + ", mCoursesContent=" + this.mCoursesContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachDayPlanCourseV2(int i, int i2, int i3, int i4, int i5, @aa1 List<BleAICoachCourseV2> mCoursesContent) {
        Intrinsics.X0O(mCoursesContent, "mCoursesContent");
        this.mCourseCode = i;
        this.mCourseContentNumber = i2;
        this.mCourseTime = i3;
        this.mCourseCalorie = i4;
        this.mRepeatNumber = i5;
        this.mCoursesContent = mCoursesContent;
    }

    public /* synthetic */ BleAICoachDayPlanCourseV2(int i, int i2, int i3, int i4, int i5, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? new ArrayList() : list);
    }
}
