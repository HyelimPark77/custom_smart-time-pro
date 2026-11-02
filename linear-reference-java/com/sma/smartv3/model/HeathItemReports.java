package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HeathItemReports {

    @aa1
    private String aiExtraInfo;

    @aa1
    private final String dataType;
    private int number;
    private long time;

    public HeathItemReports() {
        long r1 = 0;
        String r3 = null;
        int r4 = 0;
        String r5 = null;
        this(r1, r3, r4, r5, 15, null);
    }

    public static /* synthetic */ HeathItemReports copy$default(HeathItemReports r6, long r7, String r9, int r10, String r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = r6.time;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        r9 = r6.dataType;
    L8:
        String r3 = r9;
        if ((r12 & 4) == 0) goto L11;
        r10 = r6.number;
    L11:
        int r4 = r10;
        if ((r12 & 8) == 0) goto L15;
        r11 = r6.aiExtraInfo;
    L15:
        return r6.copy(r1, r3, r4, r11);
    }

    public final long component1() {
        return this.time;
    }

    @aa1
    public final String component2() {
        return this.dataType;
    }

    public final int component3() {
        return this.number;
    }

    @aa1
    public final String component4() {
        return this.aiExtraInfo;
    }

    @aa1
    public final HeathItemReports copy(long r8, @aa1 String r10, int r11, @aa1 String r12) {
        Intrinsics.X0O(r10, "dataType");
        Intrinsics.X0O(r12, "aiExtraInfo");
        return new HeathItemReports(r8, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof HeathItemReports) == true) goto L8;
        return false;
    L8:
        HeathItemReports r9 = (HeathItemReports) r8;
        if (this.time == r9.time) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.dataType, r9.dataType) == true) goto L15;
        return false;
    L15:
        if (this.number == r9.number) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.aiExtraInfo, r9.aiExtraInfo) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getAiExtraInfo() {
        return this.aiExtraInfo;
    }

    @aa1
    public final String getDataType() {
        return this.dataType;
    }

    public final int getNumber() {
        return this.number;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + this.dataType.hashCode()) * 31) + Integer.hashCode(this.number)) * 31) + this.aiExtraInfo.hashCode();
    }

    public final void setAiExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.aiExtraInfo = r2;
    }

    public final void setNumber(int r1) {
        this.number = r1;
    }

    public final void setTime(long r1) {
        this.time = r1;
    }

    @aa1
    public String toString() {
        return "HeathItemReports(time=" + this.time + ", dataType=" + this.dataType + ", number=" + this.number + ", aiExtraInfo=" + this.aiExtraInfo + I000IiI1O.iO.iO;
    }

    public HeathItemReports(long r2, @aa1 String r4, int r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "dataType");
        Intrinsics.X0O(r6, "aiExtraInfo");
        this.time = r2;
        this.dataType = r4;
        this.number = r5;
        this.aiExtraInfo = r6;
    }

    public /* synthetic */ HeathItemReports(long r7, String r9, int r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = 0;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r12 & 4) == 0) goto L12;
        r10 = 0;
    L12:
        int r4 = r10;
        if ((r12 & 8) == 0) goto L16;
        String r5 = "";
    L17:
        this(r1, r3, r4, r5);
        return;
    L16:
        r5 = r11;
        goto L17
    L8:
        r3 = r9;
        goto L10
    }
}
