package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TodayData {

    @aa1
    private final String dataType;

    @aa1
    private String mExtraInfo;
    private final int onClickID;

    @aa1
    private final String state;
    private final int stateColor;
    private final long time;

    @aa1
    private final String title;

    @aa1
    private final String value;
    private final float value1;
    private final float value2;

    public TodayData() {
        this(0L, null, null, null, 0, null, 0, null, 0.0f, 0.0f, 1023, null);
    }

    public static /* synthetic */ TodayData copy$default(TodayData todayData, long j, String str, String str2, String str3, int i, String str4, int i2, String str5, float f, float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = todayData.time;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = todayData.title;
        }
        return todayData.copy(j2, str, (i3 & 4) != 0 ? todayData.value : str2, (i3 & 8) != 0 ? todayData.state : str3, (i3 & 16) != 0 ? todayData.stateColor : i, (i3 & 32) != 0 ? todayData.dataType : str4, (i3 & 64) != 0 ? todayData.onClickID : i2, (i3 & 128) != 0 ? todayData.mExtraInfo : str5, (i3 & 256) != 0 ? todayData.value1 : f, (i3 & 512) != 0 ? todayData.value2 : f2);
    }

    public final long component1() {
        return this.time;
    }

    public final float component10() {
        return this.value2;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    @aa1
    public final String component3() {
        return this.value;
    }

    @aa1
    public final String component4() {
        return this.state;
    }

    public final int component5() {
        return this.stateColor;
    }

    @aa1
    public final String component6() {
        return this.dataType;
    }

    public final int component7() {
        return this.onClickID;
    }

    @aa1
    public final String component8() {
        return this.mExtraInfo;
    }

    public final float component9() {
        return this.value1;
    }

    @aa1
    public final TodayData copy(long j, @aa1 String title, @aa1 String value, @aa1 String state, int i, @aa1 String dataType, int i2, @aa1 String mExtraInfo, float f, float f2) {
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(value, "value");
        Intrinsics.X0O(state, "state");
        Intrinsics.X0O(dataType, "dataType");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        return new TodayData(j, title, value, state, i, dataType, i2, mExtraInfo, f, f2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodayData)) {
            return false;
        }
        TodayData todayData = (TodayData) obj;
        return this.time == todayData.time && Intrinsics.XOO0ii0(this.title, todayData.title) && Intrinsics.XOO0ii0(this.value, todayData.value) && Intrinsics.XOO0ii0(this.state, todayData.state) && this.stateColor == todayData.stateColor && Intrinsics.XOO0ii0(this.dataType, todayData.dataType) && this.onClickID == todayData.onClickID && Intrinsics.XOO0ii0(this.mExtraInfo, todayData.mExtraInfo) && Float.compare(this.value1, todayData.value1) == 0 && Float.compare(this.value2, todayData.value2) == 0;
    }

    @aa1
    public final String getDataType() {
        return this.dataType;
    }

    @aa1
    public final String getMExtraInfo() {
        return this.mExtraInfo;
    }

    public final int getOnClickID() {
        return this.onClickID;
    }

    @aa1
    public final String getState() {
        return this.state;
    }

    public final int getStateColor() {
        return this.stateColor;
    }

    public final long getTime() {
        return this.time;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    @aa1
    public final String getValue() {
        return this.value;
    }

    public final float getValue1() {
        return this.value1;
    }

    public final float getValue2() {
        return this.value2;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.time) * 31) + this.title.hashCode()) * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Integer.hashCode(this.stateColor)) * 31) + this.dataType.hashCode()) * 31) + Integer.hashCode(this.onClickID)) * 31) + this.mExtraInfo.hashCode()) * 31) + Float.hashCode(this.value1)) * 31) + Float.hashCode(this.value2);
    }

    public final void setMExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mExtraInfo = str;
    }

    @aa1
    public String toString() {
        return "TodayData(time=" + this.time + ", title=" + this.title + ", value=" + this.value + ", state=" + this.state + ", stateColor=" + this.stateColor + ", dataType=" + this.dataType + ", onClickID=" + this.onClickID + ", mExtraInfo=" + this.mExtraInfo + ", value1=" + this.value1 + ", value2=" + this.value2 + I000IiI1O.C2156iO.f1007iO;
    }

    public TodayData(long j, @aa1 String title, @aa1 String value, @aa1 String state, int i, @aa1 String dataType, int i2, @aa1 String mExtraInfo, float f, float f2) {
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(value, "value");
        Intrinsics.X0O(state, "state");
        Intrinsics.X0O(dataType, "dataType");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        this.time = j;
        this.title = title;
        this.value = value;
        this.state = state;
        this.stateColor = i;
        this.dataType = dataType;
        this.onClickID = i2;
        this.mExtraInfo = mExtraInfo;
        this.value1 = f;
        this.value2 = f2;
    }

    public /* synthetic */ TodayData(long j, String str, String str2, String str3, int i, String str4, int i2, String str5, float f, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? 0.0f : f, (i3 & 512) != 0 ? 0.0f : f2);
    }
}
