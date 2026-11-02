package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleHrv;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Hrv {

    @ColumnInfo
    private int mAvgValue;

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

    public Hrv() {
        this(0, 0L, null, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ Hrv copy$default(Hrv hrv, int i, long j, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = hrv.mId;
        }
        if ((i5 & 2) != 0) {
            j = hrv.mTime;
        }
        if ((i5 & 4) != 0) {
            str = hrv.mLocalTime;
        }
        if ((i5 & 8) != 0) {
            i2 = hrv.mValue;
        }
        if ((i5 & 16) != 0) {
            i3 = hrv.mAvgValue;
        }
        if ((i5 & 32) != 0) {
            i4 = hrv.mIsSync;
        }
        return hrv.copy(i, j, str, i2, i3, i4);
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
        return this.mAvgValue;
    }

    public final int component6() {
        return this.mIsSync;
    }

    @aa1
    public final Hrv copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new Hrv(i, j, mLocalTime, i2, i3, i4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hrv)) {
            return false;
        }
        Hrv hrv = (Hrv) obj;
        return this.mId == hrv.mId && this.mTime == hrv.mTime && Intrinsics.XOO0ii0(this.mLocalTime, hrv.mLocalTime) && this.mValue == hrv.mValue && this.mAvgValue == hrv.mAvgValue && this.mIsSync == hrv.mIsSync;
    }

    public final int getMAvgValue() {
        return this.mAvgValue;
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
        return (((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mValue)) * 31) + Integer.hashCode(this.mAvgValue)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAvgValue(int i) {
        this.mAvgValue = i;
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
        return "Hrv(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mValue=" + this.mValue + ", mAvgValue=" + this.mAvgValue + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public Hrv(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mValue = i2;
        this.mAvgValue = i3;
        this.mIsSync = i4;
    }

    public /* synthetic */ Hrv(int i, long j, String str, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Hrv(@aa1 BleHrv bleHrv, long j) {
        this(0, (((long) (bleHrv.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleHrv.getMValue(), bleHrv.getMAvgValue(), 0, 37, null);
        Intrinsics.X0O(bleHrv, "bleHrv");
    }
}
