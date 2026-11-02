package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BlePressure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Pressure {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private int mValue;

    public Pressure() {
        this(0, 0L, null, 0, 0, 31, null);
    }

    public static /* synthetic */ Pressure copy$default(Pressure pressure, int i, long j, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pressure.mId;
        }
        if ((i4 & 2) != 0) {
            j = pressure.mTime;
        }
        if ((i4 & 4) != 0) {
            str = pressure.mLocalTime;
        }
        if ((i4 & 8) != 0) {
            i2 = pressure.mValue;
        }
        if ((i4 & 16) != 0) {
            i3 = pressure.mIsSync;
        }
        int i5 = i3;
        String str2 = str;
        return pressure.copy(i, j, str2, i2, i5);
    }

    public final int component1() {
        return this.mId;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mValue;
    }

    public final int component5() {
        return this.mIsSync;
    }

    @aa1
    public final Pressure copy(int i, long j, @aa1 String mLocalTime, int i2, int i3) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new Pressure(i, j, mLocalTime, i2, i3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pressure)) {
            return false;
        }
        Pressure pressure = (Pressure) obj;
        return this.mId == pressure.mId && this.mTime == pressure.mTime && Intrinsics.XOO0ii0(this.mLocalTime, pressure.mLocalTime) && this.mValue == pressure.mValue && this.mIsSync == pressure.mIsSync;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mValue)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMValue(int i) {
        this.mValue = i;
    }

    @aa1
    public String toString() {
        return "Pressure(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mValue=" + this.mValue + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public Pressure(int i, long j, @aa1 String mLocalTime, int i2, int i3) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mValue = i2;
        this.mIsSync = i3;
    }

    public /* synthetic */ Pressure(int i, long j, String str, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pressure(@aa1 BlePressure blePressure, long j) {
        this(0, (((long) (blePressure.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, blePressure.getMValue(), 0, 21, null);
        Intrinsics.X0O(blePressure, "blePressure");
    }
}
