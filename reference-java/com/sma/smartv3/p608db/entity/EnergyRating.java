package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleEnergyRating;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class EnergyRating {

    @ColumnInfo
    private int mGear;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mScore;

    @ColumnInfo
    private long mTime;

    public EnergyRating() {
        this(0, 0L, null, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ EnergyRating copy$default(EnergyRating energyRating, int i, long j, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = energyRating.mId;
        }
        if ((i5 & 2) != 0) {
            j = energyRating.mTime;
        }
        if ((i5 & 4) != 0) {
            str = energyRating.mLocalTime;
        }
        if ((i5 & 8) != 0) {
            i2 = energyRating.mScore;
        }
        if ((i5 & 16) != 0) {
            i3 = energyRating.mGear;
        }
        if ((i5 & 32) != 0) {
            i4 = energyRating.mIsSync;
        }
        return energyRating.copy(i, j, str, i2, i3, i4);
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
        return this.mScore;
    }

    public final int component5() {
        return this.mGear;
    }

    public final int component6() {
        return this.mIsSync;
    }

    @aa1
    public final EnergyRating copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new EnergyRating(i, j, mLocalTime, i2, i3, i4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyRating)) {
            return false;
        }
        EnergyRating energyRating = (EnergyRating) obj;
        return this.mId == energyRating.mId && this.mTime == energyRating.mTime && Intrinsics.XOO0ii0(this.mLocalTime, energyRating.mLocalTime) && this.mScore == energyRating.mScore && this.mGear == energyRating.mGear && this.mIsSync == energyRating.mIsSync;
    }

    public final int getMGear() {
        return this.mGear;
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

    public final int getMScore() {
        return this.mScore;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mScore)) * 31) + Integer.hashCode(this.mGear)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMGear(int i) {
        this.mGear = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMScore(int i) {
        this.mScore = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "EnergyRating(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mScore=" + this.mScore + ", mGear=" + this.mGear + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public EnergyRating(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mScore = i2;
        this.mGear = i3;
        this.mIsSync = i4;
    }

    public /* synthetic */ EnergyRating(int i, long j, String str, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnergyRating(@aa1 BleEnergyRating bleHrv, long j) {
        this(0, (((long) (bleHrv.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleHrv.getMScore(), 0, 0, 53, null);
        Intrinsics.X0O(bleHrv, "bleHrv");
    }
}
