package com.sma.smartv3.p608db.entity;

import androidx.compose.p554ui.layout.LayoutKt;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity
public final class SportData implements Serializable {

    @ColumnInfo
    private int mAirPressure;

    @ColumnInfo
    private int mAltitude;

    @ColumnInfo
    private int mCalorie;

    @ColumnInfo
    private int mDistance;

    @ColumnInfo
    private int mDuration;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mPace;

    @ColumnInfo
    private int mSpeed;

    @ColumnInfo
    private int mSpm;

    @ColumnInfo
    private int mStep;

    @ColumnInfo
    private long mTime;

    public SportData() {
        this(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mAirPressure;
    }

    public final int component11() {
        return this.mPace;
    }

    public final int component12() {
        return this.mSpeed;
    }

    public final int component13() {
        return this.mMode;
    }

    public final int component14() {
        return this.mIsSync;
    }

    public final int component15() {
        return this.mIsDelete;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mStep;
    }

    public final int component5() {
        return this.mDistance;
    }

    public final int component6() {
        return this.mCalorie;
    }

    public final int component7() {
        return this.mDuration;
    }

    public final int component8() {
        return this.mSpm;
    }

    public final int component9() {
        return this.mAltitude;
    }

    @aa1
    public final SportData copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        return new SportData(i, j, mLocalTime, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportData)) {
            return false;
        }
        SportData sportData = (SportData) obj;
        return this.mId == sportData.mId && this.mTime == sportData.mTime && Intrinsics.XOO0ii0(this.mLocalTime, sportData.mLocalTime) && this.mStep == sportData.mStep && this.mDistance == sportData.mDistance && this.mCalorie == sportData.mCalorie && this.mDuration == sportData.mDuration && this.mSpm == sportData.mSpm && this.mAltitude == sportData.mAltitude && this.mAirPressure == sportData.mAirPressure && this.mPace == sportData.mPace && this.mSpeed == sportData.mSpeed && this.mMode == sportData.mMode && this.mIsSync == sportData.mIsSync && this.mIsDelete == sportData.mIsDelete;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMId(int i) {
        this.mId = i;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMSpm(int i) {
        this.mSpm = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "SportData(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mDuration=" + this.mDuration + ", mSpm=" + this.mSpm + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mPace=" + this.mPace + ", mSpeed=" + this.mSpeed + ", mMode=" + this.mMode + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.C2156iO.f1007iO;
    }

    public SportData(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mStep = i2;
        this.mDistance = i3;
        this.mCalorie = i4;
        this.mDuration = i5;
        this.mSpm = i6;
        this.mAltitude = i7;
        this.mAirPressure = i8;
        this.mPace = i9;
        this.mSpeed = i10;
        this.mMode = i11;
        this.mIsSync = i12;
        this.mIsDelete = i13;
    }

    public /* synthetic */ SportData(int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i, (i14 & 2) != 0 ? 0L : j, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? 0 : i2, (i14 & 16) != 0 ? 0 : i3, (i14 & 32) != 0 ? 0 : i4, (i14 & 64) != 0 ? 0 : i5, (i14 & 128) != 0 ? 0 : i6, (i14 & 256) != 0 ? 0 : i7, (i14 & 512) != 0 ? 0 : i8, (i14 & 1024) != 0 ? 0 : i9, (i14 & 2048) != 0 ? 0 : i10, (i14 & 4096) != 0 ? 0 : i11, (i14 & 8192) != 0 ? 0 : i12, (i14 & 16384) != 0 ? 0 : i13);
    }
}
