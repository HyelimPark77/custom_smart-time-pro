package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMRangeAnalysis extends JsonFieldContainer {

    @aa1
    private String end;
    private boolean fasting;
    private int nBit;

    @aa1
    private BGEMPpg[] ppgData;

    @aa1
    private String start;
    private boolean within2HrsMeal;

    public BGEMRangeAnalysis() {
        boolean r1 = false;
        boolean r2 = false;
        String r3 = null;
        String r4 = null;
        int r5 = 0;
        BGEMPpg[] r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BGEMRangeAnalysis copy$default(BGEMRangeAnalysis r0, boolean r1, boolean r2, String r3, String r4, int r5, BGEMPpg[] r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.fasting;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.within2HrsMeal;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.start;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.end;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.nBit;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.ppgData;
    L20:
        int r9 = r5;
        BGEMPpg[] r10 = r6;
        String r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final boolean component1() {
        return this.fasting;
    }

    public final boolean component2() {
        return this.within2HrsMeal;
    }

    @aa1
    public final String component3() {
        return this.start;
    }

    @aa1
    public final String component4() {
        return this.end;
    }

    public final int component5() {
        return this.nBit;
    }

    @aa1
    public final BGEMPpg[] component6() {
        return this.ppgData;
    }

    @aa1
    public final BGEMRangeAnalysis copy(boolean r9, boolean r10, @aa1 String r11, @aa1 String r12, int r13, @aa1 BGEMPpg[] r14) {
        Intrinsics.X0O(r11, "start");
        Intrinsics.X0O(r12, "end");
        Intrinsics.X0O(r14, "ppgData");
        return new BGEMRangeAnalysis(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BGEMRangeAnalysis) == true) goto L8;
        return false;
    L8:
        BGEMRangeAnalysis r6 = (BGEMRangeAnalysis) r5;
        if (this.fasting == r6.fasting) goto L12;
        return false;
    L12:
        if (this.within2HrsMeal == r6.within2HrsMeal) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.start, r6.start) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.end, r6.end) == true) goto L21;
        return false;
    L21:
        if (this.nBit == r6.nBit) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.ppgData, r6.ppgData) == true) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final String getEnd() {
        return this.end;
    }

    public final boolean getFasting() {
        return this.fasting;
    }

    public final int getNBit() {
        return this.nBit;
    }

    @aa1
    public final BGEMPpg[] getPpgData() {
        return this.ppgData;
    }

    @aa1
    public final String getStart() {
        return this.start;
    }

    public final boolean getWithin2HrsMeal() {
        return this.within2HrsMeal;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.fasting) * 31) + Boolean.hashCode(this.within2HrsMeal)) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.nBit)) * 31) + Arrays.hashCode(this.ppgData);
    }

    public final void setEnd(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.end = r2;
    }

    public final void setFasting(boolean r1) {
        this.fasting = r1;
    }

    public final void setNBit(int r1) {
        this.nBit = r1;
    }

    public final void setPpgData(@aa1 BGEMPpg[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ppgData = r2;
    }

    public final void setStart(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.start = r2;
    }

    public final void setWithin2HrsMeal(boolean r1) {
        this.within2HrsMeal = r1;
    }

    @aa1
    public String toString() {
        return "BGEMRangeAnalysis(fasting=" + this.fasting + ", within2HrsMeal=" + this.within2HrsMeal + ", start=" + this.start + ", end=" + this.end + ", nBit=" + this.nBit + ", ppgData=" + Arrays.toString(this.ppgData) + I000IiI1O.iO.iO;
    }

    public BGEMRangeAnalysis(boolean r2, boolean r3, @aa1 String r4, @aa1 String r5, int r6, @aa1 BGEMPpg[] r7) {
        Intrinsics.X0O(r4, "start");
        Intrinsics.X0O(r5, "end");
        Intrinsics.X0O(r7, "ppgData");
        this.fasting = r2;
        this.within2HrsMeal = r3;
        this.start = r4;
        this.end = r5;
        this.nBit = r6;
        this.ppgData = r7;
    }

    public /* synthetic */ BGEMRangeAnalysis(boolean r3, boolean r4, String r5, String r6, int r7, BGEMPpg[] r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r9 & 32) == 0) goto L20;
        r8 = new BGEMPpg[0];
    L20:
        BGEMPpg[] r11 = r8;
        int r12 = r7;
        String r13 = r6;
        String r14 = r5;
        this(r3, r4, r14, r13, r12, r11);
    }
}
