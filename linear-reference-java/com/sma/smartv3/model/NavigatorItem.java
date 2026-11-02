package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.Workout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NavigatorItem {
    private final int mBackWard;
    private final int mFlatNum;

    @aa1
    private final Workout mLastWorkout;
    private final int mLeadingNum;
    private final int mMode;

    @aa1
    private final List<NavigatorMoonItem> mNavigatorMoonItem;

    public NavigatorItem(int r2, int r3, int r4, int r5, @aa1 Workout r6, @aa1 List<NavigatorMoonItem> r7) {
        Intrinsics.X0O(r6, "mLastWorkout");
        Intrinsics.X0O(r7, "mNavigatorMoonItem");
        this.mMode = r2;
        this.mLeadingNum = r3;
        this.mFlatNum = r4;
        this.mBackWard = r5;
        this.mLastWorkout = r6;
        this.mNavigatorMoonItem = r7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigatorItem copy$default(NavigatorItem r0, int r1, int r2, int r3, int r4, Workout r5, List r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mMode;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mLeadingNum;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mFlatNum;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mBackWard;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mLastWorkout;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mNavigatorMoonItem;
    L20:
        Workout r9 = r5;
        List r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mMode;
    }

    public final int component2() {
        return this.mLeadingNum;
    }

    public final int component3() {
        return this.mFlatNum;
    }

    public final int component4() {
        return this.mBackWard;
    }

    @aa1
    public final Workout component5() {
        return this.mLastWorkout;
    }

    @aa1
    public final List<NavigatorMoonItem> component6() {
        return this.mNavigatorMoonItem;
    }

    @aa1
    public final NavigatorItem copy(int r9, int r10, int r11, int r12, @aa1 Workout r13, @aa1 List<NavigatorMoonItem> r14) {
        Intrinsics.X0O(r13, "mLastWorkout");
        Intrinsics.X0O(r14, "mNavigatorMoonItem");
        return new NavigatorItem(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NavigatorItem) == true) goto L8;
        return false;
    L8:
        NavigatorItem r6 = (NavigatorItem) r5;
        if (this.mMode == r6.mMode) goto L12;
        return false;
    L12:
        if (this.mLeadingNum == r6.mLeadingNum) goto L15;
        return false;
    L15:
        if (this.mFlatNum == r6.mFlatNum) goto L18;
        return false;
    L18:
        if (this.mBackWard == r6.mBackWard) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mLastWorkout, r6.mLastWorkout) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mNavigatorMoonItem, r6.mNavigatorMoonItem) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMBackWard() {
        return this.mBackWard;
    }

    public final int getMFlatNum() {
        return this.mFlatNum;
    }

    @aa1
    public final Workout getMLastWorkout() {
        return this.mLastWorkout;
    }

    public final int getMLeadingNum() {
        return this.mLeadingNum;
    }

    public final int getMMode() {
        return this.mMode;
    }

    @aa1
    public final List<NavigatorMoonItem> getMNavigatorMoonItem() {
        return this.mNavigatorMoonItem;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mMode) * 31) + Integer.hashCode(this.mLeadingNum)) * 31) + Integer.hashCode(this.mFlatNum)) * 31) + Integer.hashCode(this.mBackWard)) * 31) + this.mLastWorkout.hashCode()) * 31) + this.mNavigatorMoonItem.hashCode();
    }

    @aa1
    public String toString() {
        return "NavigatorItem(mMode=" + this.mMode + ", mLeadingNum=" + this.mLeadingNum + ", mFlatNum=" + this.mFlatNum + ", mBackWard=" + this.mBackWard + ", mLastWorkout=" + this.mLastWorkout + ", mNavigatorMoonItem=" + this.mNavigatorMoonItem + I000IiI1O.iO.iO;
    }

    public /* synthetic */ NavigatorItem(int r2, int r3, int r4, int r5, Workout r6, List r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r8 & 8) == 0) goto L12;
        int r10 = 0;
    L13:
        this(r2, r3, r4, r10, r6, r7);
        return;
    L12:
        r10 = r5;
        goto L13
    }
}
