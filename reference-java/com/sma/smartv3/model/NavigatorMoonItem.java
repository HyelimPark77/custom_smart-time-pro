package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NavigatorMoonItem {

    @aa1
    private final List<Entry> mActual;
    private final int mBackWard;
    private final int mFlatNum;
    private final int mLeadingNum;

    @aa1
    private final List<Entry> mTarget;

    public NavigatorMoonItem() {
        this(0, 0, 0, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigatorMoonItem copy$default(NavigatorMoonItem navigatorMoonItem, int i, int i2, int i3, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = navigatorMoonItem.mLeadingNum;
        }
        if ((i4 & 2) != 0) {
            i2 = navigatorMoonItem.mFlatNum;
        }
        if ((i4 & 4) != 0) {
            i3 = navigatorMoonItem.mBackWard;
        }
        if ((i4 & 8) != 0) {
            list = navigatorMoonItem.mTarget;
        }
        if ((i4 & 16) != 0) {
            list2 = navigatorMoonItem.mActual;
        }
        List list3 = list2;
        int i5 = i3;
        return navigatorMoonItem.copy(i, i2, i5, list, list3);
    }

    public final int component1() {
        return this.mLeadingNum;
    }

    public final int component2() {
        return this.mFlatNum;
    }

    public final int component3() {
        return this.mBackWard;
    }

    @aa1
    public final List<Entry> component4() {
        return this.mTarget;
    }

    @aa1
    public final List<Entry> component5() {
        return this.mActual;
    }

    @aa1
    public final NavigatorMoonItem copy(int i, int i2, int i3, @aa1 List<? extends Entry> mTarget, @aa1 List<? extends Entry> mActual) {
        Intrinsics.X0O(mTarget, "mTarget");
        Intrinsics.X0O(mActual, "mActual");
        return new NavigatorMoonItem(i, i2, i3, mTarget, mActual);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorMoonItem)) {
            return false;
        }
        NavigatorMoonItem navigatorMoonItem = (NavigatorMoonItem) obj;
        return this.mLeadingNum == navigatorMoonItem.mLeadingNum && this.mFlatNum == navigatorMoonItem.mFlatNum && this.mBackWard == navigatorMoonItem.mBackWard && Intrinsics.XOO0ii0(this.mTarget, navigatorMoonItem.mTarget) && Intrinsics.XOO0ii0(this.mActual, navigatorMoonItem.mActual);
    }

    @aa1
    public final List<Entry> getMActual() {
        return this.mActual;
    }

    public final int getMBackWard() {
        return this.mBackWard;
    }

    public final int getMFlatNum() {
        return this.mFlatNum;
    }

    public final int getMLeadingNum() {
        return this.mLeadingNum;
    }

    @aa1
    public final List<Entry> getMTarget() {
        return this.mTarget;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mLeadingNum) * 31) + Integer.hashCode(this.mFlatNum)) * 31) + Integer.hashCode(this.mBackWard)) * 31) + this.mTarget.hashCode()) * 31) + this.mActual.hashCode();
    }

    @aa1
    public String toString() {
        return "NavigatorMoonItem(mLeadingNum=" + this.mLeadingNum + ", mFlatNum=" + this.mFlatNum + ", mBackWard=" + this.mBackWard + ", mTarget=" + this.mTarget + ", mActual=" + this.mActual + I000IiI1O.C2156iO.f1007iO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigatorMoonItem(int i, int i2, int i3, @aa1 List<? extends Entry> mTarget, @aa1 List<? extends Entry> mActual) {
        Intrinsics.X0O(mTarget, "mTarget");
        Intrinsics.X0O(mActual, "mActual");
        this.mLeadingNum = i;
        this.mFlatNum = i2;
        this.mBackWard = i3;
        this.mTarget = mTarget;
        this.mActual = mActual;
    }

    public /* synthetic */ NavigatorMoonItem(int i, int i2, int i3, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list, (i4 & 16) != 0 ? new ArrayList() : list2);
    }
}
