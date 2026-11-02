package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleBloodPressure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class BloodPressure {

    @ColumnInfo
    private int mDiastolic;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mSystolic;

    @ColumnInfo
    private long mTime;

    public BloodPressure() {
        this(0, 0L, null, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ BloodPressure copy$default(BloodPressure bloodPressure, int i, long j, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bloodPressure.mId;
        }
        if ((i5 & 2) != 0) {
            j = bloodPressure.mTime;
        }
        if ((i5 & 4) != 0) {
            str = bloodPressure.mLocalTime;
        }
        if ((i5 & 8) != 0) {
            i2 = bloodPressure.mSystolic;
        }
        if ((i5 & 16) != 0) {
            i3 = bloodPressure.mDiastolic;
        }
        if ((i5 & 32) != 0) {
            i4 = bloodPressure.mIsSync;
        }
        return bloodPressure.copy(i, j, str, i2, i3, i4);
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
        return this.mSystolic;
    }

    public final int component5() {
        return this.mDiastolic;
    }

    public final int component6() {
        return this.mIsSync;
    }

    @aa1
    public final BloodPressure copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new BloodPressure(i, j, mLocalTime, i2, i3, i4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodPressure)) {
            return false;
        }
        BloodPressure bloodPressure = (BloodPressure) obj;
        return this.mId == bloodPressure.mId && this.mTime == bloodPressure.mTime && Intrinsics.XOO0ii0(this.mLocalTime, bloodPressure.mLocalTime) && this.mSystolic == bloodPressure.mSystolic && this.mDiastolic == bloodPressure.mDiastolic && this.mIsSync == bloodPressure.mIsSync;
    }

    public final int getMDiastolic() {
        return this.mDiastolic;
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

    public final int getMSystolic() {
        return this.mSystolic;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mSystolic)) * 31) + Integer.hashCode(this.mDiastolic)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMDiastolic(int i) {
        this.mDiastolic = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMSystolic(int i) {
        this.mSystolic = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BloodPressure(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mSystolic=" + this.mSystolic + ", mDiastolic=" + this.mDiastolic + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public BloodPressure(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mSystolic = i2;
        this.mDiastolic = i3;
        this.mIsSync = i4;
    }

    public /* synthetic */ BloodPressure(int i, long j, String str, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BloodPressure(@aa1 BleBloodPressure bleBloodPressure, long j) {
        this(0, (((long) (bleBloodPressure.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleBloodPressure.getMSystolic(), bleBloodPressure.getMDiastolic(), 0, 37, null);
        Intrinsics.X0O(bleBloodPressure, "bleBloodPressure");
    }
}
