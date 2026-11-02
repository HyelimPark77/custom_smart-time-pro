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
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        List r4 = null;
        List r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigatorMoonItem copy$default(NavigatorMoonItem r0, int r1, int r2, int r3, List r4, List r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mLeadingNum;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mFlatNum;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mBackWard;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mTarget;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mActual;
    L17:
        List r8 = r4;
        List r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
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
    public final NavigatorMoonItem copy(int r8, int r9, int r10, @aa1 List<? extends Entry> r11, @aa1 List<? extends Entry> r12) {
        Intrinsics.X0O(r11, "mTarget");
        Intrinsics.X0O(r12, "mActual");
        return new NavigatorMoonItem(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NavigatorMoonItem) == true) goto L8;
        return false;
    L8:
        NavigatorMoonItem r6 = (NavigatorMoonItem) r5;
        if (this.mLeadingNum == r6.mLeadingNum) goto L12;
        return false;
    L12:
        if (this.mFlatNum == r6.mFlatNum) goto L15;
        return false;
    L15:
        if (this.mBackWard == r6.mBackWard) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTarget, r6.mTarget) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mActual, r6.mActual) == true) goto L23;
        return false;
    L23:
        return true;
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
        return "NavigatorMoonItem(mLeadingNum=" + this.mLeadingNum + ", mFlatNum=" + this.mFlatNum + ", mBackWard=" + this.mBackWard + ", mTarget=" + this.mTarget + ", mActual=" + this.mActual + I000IiI1O.iO.iO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigatorMoonItem(int r2, int r3, int r4, @aa1 List<? extends Entry> r5, @aa1 List<? extends Entry> r6) {
        Intrinsics.X0O(r5, "mTarget");
        Intrinsics.X0O(r6, "mActual");
        this.mLeadingNum = r2;
        this.mFlatNum = r3;
        this.mBackWard = r4;
        this.mTarget = r5;
        this.mActual = r6;
    }

    public /* synthetic */ NavigatorMoonItem(int r2, int r3, int r4, List r5, List r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = new ArrayList();
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = new ArrayList();
    L17:
        List r9 = r6;
        List r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
    }
}
