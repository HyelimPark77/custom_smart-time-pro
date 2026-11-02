package com.sma.smartv3.p608db.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleVitality;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Vitality {
    private int mAllVitality;
    private int mHighIntensityTime;
    private int mHighIntensityValue;

    @PrimaryKey(autoGenerate = true)
    private final int mId;
    private int mIsSync;

    @aa1
    private String mLocalTime;
    private int mLowIntensityTime;
    private int mLowIntensityValue;
    private int mMediumIntensityTime;
    private int mMediumIntensityValue;
    private long mTime;

    public Vitality() {
        this(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 2047, null);
    }

    public static /* synthetic */ Vitality copy$default(Vitality vitality, int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = vitality.mId;
        }
        if ((i10 & 2) != 0) {
            j = vitality.mTime;
        }
        if ((i10 & 4) != 0) {
            str = vitality.mLocalTime;
        }
        if ((i10 & 8) != 0) {
            i2 = vitality.mAllVitality;
        }
        if ((i10 & 16) != 0) {
            i3 = vitality.mLowIntensityTime;
        }
        if ((i10 & 32) != 0) {
            i4 = vitality.mLowIntensityValue;
        }
        if ((i10 & 64) != 0) {
            i5 = vitality.mMediumIntensityTime;
        }
        if ((i10 & 128) != 0) {
            i6 = vitality.mMediumIntensityValue;
        }
        if ((i10 & 256) != 0) {
            i7 = vitality.mHighIntensityTime;
        }
        if ((i10 & 512) != 0) {
            i8 = vitality.mHighIntensityValue;
        }
        if ((i10 & 1024) != 0) {
            i9 = vitality.mIsSync;
        }
        int i11 = i8;
        int i12 = i9;
        int i13 = i6;
        int i14 = i7;
        int i15 = i5;
        int i16 = i3;
        String str2 = str;
        return vitality.copy(i, j, str2, i2, i16, i4, i15, i13, i14, i11, i12);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mHighIntensityValue;
    }

    public final int component11() {
        return this.mIsSync;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mAllVitality;
    }

    public final int component5() {
        return this.mLowIntensityTime;
    }

    public final int component6() {
        return this.mLowIntensityValue;
    }

    public final int component7() {
        return this.mMediumIntensityTime;
    }

    public final int component8() {
        return this.mMediumIntensityValue;
    }

    public final int component9() {
        return this.mHighIntensityTime;
    }

    @aa1
    public final Vitality copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new Vitality(i, j, mLocalTime, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vitality)) {
            return false;
        }
        Vitality vitality = (Vitality) obj;
        return this.mId == vitality.mId && this.mTime == vitality.mTime && Intrinsics.XOO0ii0(this.mLocalTime, vitality.mLocalTime) && this.mAllVitality == vitality.mAllVitality && this.mLowIntensityTime == vitality.mLowIntensityTime && this.mLowIntensityValue == vitality.mLowIntensityValue && this.mMediumIntensityTime == vitality.mMediumIntensityTime && this.mMediumIntensityValue == vitality.mMediumIntensityValue && this.mHighIntensityTime == vitality.mHighIntensityTime && this.mHighIntensityValue == vitality.mHighIntensityValue && this.mIsSync == vitality.mIsSync;
    }

    public final int getMAllVitality() {
        return this.mAllVitality;
    }

    public final int getMHighIntensityTime() {
        return this.mHighIntensityTime;
    }

    public final int getMHighIntensityValue() {
        return this.mHighIntensityValue;
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

    public final int getMLowIntensityTime() {
        return this.mLowIntensityTime;
    }

    public final int getMLowIntensityValue() {
        return this.mLowIntensityValue;
    }

    public final int getMMediumIntensityTime() {
        return this.mMediumIntensityTime;
    }

    public final int getMMediumIntensityValue() {
        return this.mMediumIntensityValue;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mAllVitality)) * 31) + Integer.hashCode(this.mLowIntensityTime)) * 31) + Integer.hashCode(this.mLowIntensityValue)) * 31) + Integer.hashCode(this.mMediumIntensityTime)) * 31) + Integer.hashCode(this.mMediumIntensityValue)) * 31) + Integer.hashCode(this.mHighIntensityTime)) * 31) + Integer.hashCode(this.mHighIntensityValue)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAllVitality(int i) {
        this.mAllVitality = i;
    }

    public final void setMHighIntensityTime(int i) {
        this.mHighIntensityTime = i;
    }

    public final void setMHighIntensityValue(int i) {
        this.mHighIntensityValue = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMLowIntensityTime(int i) {
        this.mLowIntensityTime = i;
    }

    public final void setMLowIntensityValue(int i) {
        this.mLowIntensityValue = i;
    }

    public final void setMMediumIntensityTime(int i) {
        this.mMediumIntensityTime = i;
    }

    public final void setMMediumIntensityValue(int i) {
        this.mMediumIntensityValue = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "Vitality(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mAllVitality=" + this.mAllVitality + ", mLowIntensityTime=" + this.mLowIntensityTime + ", mLowIntensityValue=" + this.mLowIntensityValue + ", mMediumIntensityTime=" + this.mMediumIntensityTime + ", mMediumIntensityValue=" + this.mMediumIntensityValue + ", mHighIntensityTime=" + this.mHighIntensityTime + ", mHighIntensityValue=" + this.mHighIntensityValue + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public Vitality(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mAllVitality = i2;
        this.mLowIntensityTime = i3;
        this.mLowIntensityValue = i4;
        this.mMediumIntensityTime = i5;
        this.mMediumIntensityValue = i6;
        this.mHighIntensityTime = i7;
        this.mHighIntensityValue = i8;
        this.mIsSync = i9;
    }

    public /* synthetic */ Vitality(int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0L : j, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? 0 : i2, (i10 & 16) != 0 ? 0 : i3, (i10 & 32) != 0 ? 0 : i4, (i10 & 64) != 0 ? 0 : i5, (i10 & 128) != 0 ? 0 : i6, (i10 & 256) != 0 ? 0 : i7, (i10 & 512) != 0 ? 0 : i8, (i10 & 1024) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vitality(@aa1 BleVitality vitality, long j) {
        this(0, ((vitality.getMTime() + ((long) BleConstsKt.DATA_EPOCH)) * 1000) - j, null, vitality.getMAllVitality(), vitality.getMLowIntensityTime(), vitality.getMLowIntensityValue(), vitality.getMMediumIntensityTime(), vitality.getMMediumIntensityValue(), vitality.getMHighIntensityTime(), vitality.getMHighIntensityValue(), 0, 1029, null);
        Intrinsics.X0O(vitality, "vitality");
    }
}
