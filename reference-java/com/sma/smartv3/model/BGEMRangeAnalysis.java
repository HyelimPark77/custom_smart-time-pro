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
        this(false, false, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ BGEMRangeAnalysis copy$default(BGEMRangeAnalysis bGEMRangeAnalysis, boolean z, boolean z2, String str, String str2, int i, BGEMPpg[] bGEMPpgArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bGEMRangeAnalysis.fasting;
        }
        if ((i2 & 2) != 0) {
            z2 = bGEMRangeAnalysis.within2HrsMeal;
        }
        if ((i2 & 4) != 0) {
            str = bGEMRangeAnalysis.start;
        }
        if ((i2 & 8) != 0) {
            str2 = bGEMRangeAnalysis.end;
        }
        if ((i2 & 16) != 0) {
            i = bGEMRangeAnalysis.nBit;
        }
        if ((i2 & 32) != 0) {
            bGEMPpgArr = bGEMRangeAnalysis.ppgData;
        }
        int i3 = i;
        BGEMPpg[] bGEMPpgArr2 = bGEMPpgArr;
        return bGEMRangeAnalysis.copy(z, z2, str, str2, i3, bGEMPpgArr2);
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
    public final BGEMRangeAnalysis copy(boolean z, boolean z2, @aa1 String start, @aa1 String end, int i, @aa1 BGEMPpg[] ppgData) {
        Intrinsics.X0O(start, "start");
        Intrinsics.X0O(end, "end");
        Intrinsics.X0O(ppgData, "ppgData");
        return new BGEMRangeAnalysis(z, z2, start, end, i, ppgData);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMRangeAnalysis)) {
            return false;
        }
        BGEMRangeAnalysis bGEMRangeAnalysis = (BGEMRangeAnalysis) obj;
        return this.fasting == bGEMRangeAnalysis.fasting && this.within2HrsMeal == bGEMRangeAnalysis.within2HrsMeal && Intrinsics.XOO0ii0(this.start, bGEMRangeAnalysis.start) && Intrinsics.XOO0ii0(this.end, bGEMRangeAnalysis.end) && this.nBit == bGEMRangeAnalysis.nBit && Intrinsics.XOO0ii0(this.ppgData, bGEMRangeAnalysis.ppgData);
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

    public final void setEnd(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.end = str;
    }

    public final void setFasting(boolean z) {
        this.fasting = z;
    }

    public final void setNBit(int i) {
        this.nBit = i;
    }

    public final void setPpgData(@aa1 BGEMPpg[] bGEMPpgArr) {
        Intrinsics.X0O(bGEMPpgArr, "<set-?>");
        this.ppgData = bGEMPpgArr;
    }

    public final void setStart(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.start = str;
    }

    public final void setWithin2HrsMeal(boolean z) {
        this.within2HrsMeal = z;
    }

    @aa1
    public String toString() {
        return "BGEMRangeAnalysis(fasting=" + this.fasting + ", within2HrsMeal=" + this.within2HrsMeal + ", start=" + this.start + ", end=" + this.end + ", nBit=" + this.nBit + ", ppgData=" + Arrays.toString(this.ppgData) + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMRangeAnalysis(boolean z, boolean z2, @aa1 String start, @aa1 String end, int i, @aa1 BGEMPpg[] ppgData) {
        Intrinsics.X0O(start, "start");
        Intrinsics.X0O(end, "end");
        Intrinsics.X0O(ppgData, "ppgData");
        this.fasting = z;
        this.within2HrsMeal = z2;
        this.start = start;
        this.end = end;
        this.nBit = i;
        this.ppgData = ppgData;
    }

    public /* synthetic */ BGEMRangeAnalysis(boolean z, boolean z2, String str, String str2, int i, BGEMPpg[] bGEMPpgArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new BGEMPpg[0] : bGEMPpgArr);
    }
}
