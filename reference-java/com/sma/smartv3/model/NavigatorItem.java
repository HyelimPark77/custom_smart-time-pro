package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.Workout;
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

    public NavigatorItem(int i, int i2, int i3, int i4, @aa1 Workout mLastWorkout, @aa1 List<NavigatorMoonItem> mNavigatorMoonItem) {
        Intrinsics.X0O(mLastWorkout, "mLastWorkout");
        Intrinsics.X0O(mNavigatorMoonItem, "mNavigatorMoonItem");
        this.mMode = i;
        this.mLeadingNum = i2;
        this.mFlatNum = i3;
        this.mBackWard = i4;
        this.mLastWorkout = mLastWorkout;
        this.mNavigatorMoonItem = mNavigatorMoonItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigatorItem copy$default(NavigatorItem navigatorItem, int i, int i2, int i3, int i4, Workout workout, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = navigatorItem.mMode;
        }
        if ((i5 & 2) != 0) {
            i2 = navigatorItem.mLeadingNum;
        }
        if ((i5 & 4) != 0) {
            i3 = navigatorItem.mFlatNum;
        }
        if ((i5 & 8) != 0) {
            i4 = navigatorItem.mBackWard;
        }
        if ((i5 & 16) != 0) {
            workout = navigatorItem.mLastWorkout;
        }
        if ((i5 & 32) != 0) {
            list = navigatorItem.mNavigatorMoonItem;
        }
        Workout workout2 = workout;
        List list2 = list;
        return navigatorItem.copy(i, i2, i3, i4, workout2, list2);
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
    public final NavigatorItem copy(int i, int i2, int i3, int i4, @aa1 Workout mLastWorkout, @aa1 List<NavigatorMoonItem> mNavigatorMoonItem) {
        Intrinsics.X0O(mLastWorkout, "mLastWorkout");
        Intrinsics.X0O(mNavigatorMoonItem, "mNavigatorMoonItem");
        return new NavigatorItem(i, i2, i3, i4, mLastWorkout, mNavigatorMoonItem);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorItem)) {
            return false;
        }
        NavigatorItem navigatorItem = (NavigatorItem) obj;
        return this.mMode == navigatorItem.mMode && this.mLeadingNum == navigatorItem.mLeadingNum && this.mFlatNum == navigatorItem.mFlatNum && this.mBackWard == navigatorItem.mBackWard && Intrinsics.XOO0ii0(this.mLastWorkout, navigatorItem.mLastWorkout) && Intrinsics.XOO0ii0(this.mNavigatorMoonItem, navigatorItem.mNavigatorMoonItem);
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
        return "NavigatorItem(mMode=" + this.mMode + ", mLeadingNum=" + this.mLeadingNum + ", mFlatNum=" + this.mFlatNum + ", mBackWard=" + this.mBackWard + ", mLastWorkout=" + this.mLastWorkout + ", mNavigatorMoonItem=" + this.mNavigatorMoonItem + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ NavigatorItem(int i, int i2, int i3, int i4, Workout workout, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, workout, list);
    }
}
