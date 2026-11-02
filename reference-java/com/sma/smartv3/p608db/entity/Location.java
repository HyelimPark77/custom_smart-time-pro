package com.sma.smartv3.p608db.entity;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleLocation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Location {

    @ColumnInfo
    private int mActivityMode;

    @ColumnInfo
    private int mAltitude;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsBaiDuSync;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private float mLatitude;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private float mLongitude;

    @ColumnInfo
    private int mSource;

    @ColumnInfo
    private long mTime;

    public Location() {
        this(0, 0L, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 1023, null);
    }

    public static /* synthetic */ Location copy$default(Location location, int i, long j, String str, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = location.mId;
        }
        if ((i7 & 2) != 0) {
            j = location.mTime;
        }
        if ((i7 & 4) != 0) {
            str = location.mLocalTime;
        }
        if ((i7 & 8) != 0) {
            i2 = location.mActivityMode;
        }
        if ((i7 & 16) != 0) {
            i3 = location.mAltitude;
        }
        if ((i7 & 32) != 0) {
            f = location.mLongitude;
        }
        if ((i7 & 64) != 0) {
            f2 = location.mLatitude;
        }
        if ((i7 & 128) != 0) {
            i4 = location.mSource;
        }
        if ((i7 & 256) != 0) {
            i5 = location.mIsSync;
        }
        if ((i7 & 512) != 0) {
            i6 = location.mIsBaiDuSync;
        }
        int i8 = i5;
        int i9 = i6;
        float f3 = f2;
        int i10 = i4;
        return location.copy(i, j, str, i2, i3, f, f3, i10, i8, i9);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mIsBaiDuSync;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mActivityMode;
    }

    public final int component5() {
        return this.mAltitude;
    }

    public final float component6() {
        return this.mLongitude;
    }

    public final float component7() {
        return this.mLatitude;
    }

    public final int component8() {
        return this.mSource;
    }

    public final int component9() {
        return this.mIsSync;
    }

    @aa1
    public final Location copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, float f, float f2, int i4, int i5, int i6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new Location(i, j, mLocalTime, i2, i3, f, f2, i4, i5, i6);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return this.mId == location.mId && this.mTime == location.mTime && Intrinsics.XOO0ii0(this.mLocalTime, location.mLocalTime) && this.mActivityMode == location.mActivityMode && this.mAltitude == location.mAltitude && Float.compare(this.mLongitude, location.mLongitude) == 0 && Float.compare(this.mLatitude, location.mLatitude) == 0 && this.mSource == location.mSource && this.mIsSync == location.mIsSync && this.mIsBaiDuSync == location.mIsBaiDuSync;
    }

    public final int getMActivityMode() {
        return this.mActivityMode;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsBaiDuSync() {
        return this.mIsBaiDuSync;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final float getMLatitude() {
        return this.mLatitude;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final float getMLongitude() {
        return this.mLongitude;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mActivityMode)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Float.hashCode(this.mLongitude)) * 31) + Float.hashCode(this.mLatitude)) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsBaiDuSync);
    }

    public final void setMActivityMode(int i) {
        this.mActivityMode = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMIsBaiDuSync(int i) {
        this.mIsBaiDuSync = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLatitude(float f) {
        this.mLatitude = f;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMLongitude(float f) {
        this.mLongitude = f;
    }

    public final void setMSource(int i) {
        this.mSource = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "Location(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mActivityMode=" + this.mActivityMode + ", mAltitude=" + this.mAltitude + ", mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + ", mSource=" + this.mSource + ", mIsSync=" + this.mIsSync + ", mIsBaiDuSync=" + this.mIsBaiDuSync + I000IiI1O.C2156iO.f1007iO;
    }

    public Location(int i, long j, @aa1 String mLocalTime, int i2, int i3, float f, float f2, int i4, int i5, int i6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mActivityMode = i2;
        this.mAltitude = i3;
        this.mLongitude = f;
        this.mLatitude = f2;
        this.mSource = i4;
        this.mIsSync = i5;
        this.mIsBaiDuSync = i6;
    }

    public /* synthetic */ Location(int i, long j, String str, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0.0f : f, (i7 & 64) != 0 ? 0.0f : f2, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Location(@aa1 BleLocation bleLocation, long j) {
        this(0, (((long) (bleLocation.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleLocation.getMActivityMode(), bleLocation.getMAltitude(), bleLocation.getMLongitude(), bleLocation.getMLatitude(), 0, 0, 0, TypedValues.Custom.TYPE_FLOAT, null);
        Intrinsics.X0O(bleLocation, "bleLocation");
    }
}
