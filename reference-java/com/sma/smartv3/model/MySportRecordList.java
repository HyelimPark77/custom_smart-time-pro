package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MySportRecordList {
    private final int icon;
    private final int iconInt;
    private final long time;

    @aa1
    private final String title;
    private final int value;

    @aa1
    private final String valueStr;
    private final int workoutId;

    public MySportRecordList() {
        this(0, null, 0, 0, null, 0L, 0, 127, null);
    }

    public static /* synthetic */ MySportRecordList copy$default(MySportRecordList mySportRecordList, int i, String str, int i2, int i3, String str2, long j, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = mySportRecordList.icon;
        }
        if ((i5 & 2) != 0) {
            str = mySportRecordList.title;
        }
        if ((i5 & 4) != 0) {
            i2 = mySportRecordList.workoutId;
        }
        if ((i5 & 8) != 0) {
            i3 = mySportRecordList.value;
        }
        if ((i5 & 16) != 0) {
            str2 = mySportRecordList.valueStr;
        }
        if ((i5 & 32) != 0) {
            j = mySportRecordList.time;
        }
        if ((i5 & 64) != 0) {
            i4 = mySportRecordList.iconInt;
        }
        int i6 = i4;
        long j2 = j;
        String str3 = str2;
        int i7 = i2;
        return mySportRecordList.copy(i, str, i7, i3, str3, j2, i6);
    }

    public final int component1() {
        return this.icon;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.workoutId;
    }

    public final int component4() {
        return this.value;
    }

    @aa1
    public final String component5() {
        return this.valueStr;
    }

    public final long component6() {
        return this.time;
    }

    public final int component7() {
        return this.iconInt;
    }

    @aa1
    public final MySportRecordList copy(int i, @aa1 String title, int i2, int i3, @aa1 String valueStr, long j, int i4) {
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(valueStr, "valueStr");
        return new MySportRecordList(i, title, i2, i3, valueStr, j, i4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MySportRecordList)) {
            return false;
        }
        MySportRecordList mySportRecordList = (MySportRecordList) obj;
        return this.icon == mySportRecordList.icon && Intrinsics.XOO0ii0(this.title, mySportRecordList.title) && this.workoutId == mySportRecordList.workoutId && this.value == mySportRecordList.value && Intrinsics.XOO0ii0(this.valueStr, mySportRecordList.valueStr) && this.time == mySportRecordList.time && this.iconInt == mySportRecordList.iconInt;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconInt() {
        return this.iconInt;
    }

    public final long getTime() {
        return this.time;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    @aa1
    public final String getValueStr() {
        return this.valueStr;
    }

    public final int getWorkoutId() {
        return this.workoutId;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.workoutId)) * 31) + Integer.hashCode(this.value)) * 31) + this.valueStr.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.iconInt);
    }

    @aa1
    public String toString() {
        return "MySportRecordList(icon=" + this.icon + ", title=" + this.title + ", workoutId=" + this.workoutId + ", value=" + this.value + ", valueStr=" + this.valueStr + ", time=" + this.time + ", iconInt=" + this.iconInt + I000IiI1O.C2156iO.f1007iO;
    }

    public MySportRecordList(int i, @aa1 String title, int i2, int i3, @aa1 String valueStr, long j, int i4) {
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(valueStr, "valueStr");
        this.icon = i;
        this.title = title;
        this.workoutId = i2;
        this.value = i3;
        this.valueStr = valueStr;
        this.time = j;
        this.iconInt = i4;
    }

    public /* synthetic */ MySportRecordList(int i, String str, int i2, int i3, String str2, long j, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? -1 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? "" : str2, (i5 & 32) != 0 ? 0L : j, (i5 & 64) != 0 ? 0 : i4);
    }
}
