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
        this(0L, null, 0, null, 15, null);
    }

    public static /* synthetic */ HeathItemReports copy$default(HeathItemReports heathItemReports, long j, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = heathItemReports.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = heathItemReports.dataType;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = heathItemReports.number;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = heathItemReports.aiExtraInfo;
        }
        return heathItemReports.copy(j2, str3, i3, str2);
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
    public final HeathItemReports copy(long j, @aa1 String dataType, int i, @aa1 String aiExtraInfo) {
        Intrinsics.X0O(dataType, "dataType");
        Intrinsics.X0O(aiExtraInfo, "aiExtraInfo");
        return new HeathItemReports(j, dataType, i, aiExtraInfo);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeathItemReports)) {
            return false;
        }
        HeathItemReports heathItemReports = (HeathItemReports) obj;
        return this.time == heathItemReports.time && Intrinsics.XOO0ii0(this.dataType, heathItemReports.dataType) && this.number == heathItemReports.number && Intrinsics.XOO0ii0(this.aiExtraInfo, heathItemReports.aiExtraInfo);
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

    public final void setAiExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.aiExtraInfo = str;
    }

    public final void setNumber(int i) {
        this.number = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @aa1
    public String toString() {
        return "HeathItemReports(time=" + this.time + ", dataType=" + this.dataType + ", number=" + this.number + ", aiExtraInfo=" + this.aiExtraInfo + I000IiI1O.C2156iO.f1007iO;
    }

    public HeathItemReports(long j, @aa1 String dataType, int i, @aa1 String aiExtraInfo) {
        Intrinsics.X0O(dataType, "dataType");
        Intrinsics.X0O(aiExtraInfo, "aiExtraInfo");
        this.time = j;
        this.dataType = dataType;
        this.number = i;
        this.aiExtraInfo = aiExtraInfo;
    }

    public /* synthetic */ HeathItemReports(long j, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2);
    }
}
