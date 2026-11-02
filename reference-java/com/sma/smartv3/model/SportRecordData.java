package com.sma.smartv3.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SportRecordData implements Parcelable {

    @aa1
    public static final CREATOR CREATOR = new CREATOR(null);
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private long mEndTime;
    private boolean mIsLocationEmpty;
    private int mMode;
    private int mPace;

    @aa1
    private String mPlatform;
    private int mSource;
    private int mSpeed;
    private long mStartTime;
    private int mWorkoutId;

    public static final class CREATOR implements Parcelable.Creator<SportRecordData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public SportRecordData createFromParcel(@aa1 Parcel parcel) {
            Intrinsics.X0O(parcel, "parcel");
            return new SportRecordData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public SportRecordData[] newArray(int i) {
            return new SportRecordData[i];
        }
    }

    public SportRecordData() {
        this.mIsLocationEmpty = true;
        this.mPlatform = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public final long getMEndTime() {
        return this.mEndTime;
    }

    public final boolean getMIsLocationEmpty() {
        return this.mIsLocationEmpty;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final long getMStartTime() {
        return this.mStartTime;
    }

    public final int getMWorkoutId() {
        return this.mWorkoutId;
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

    public final void setMEndTime(long j) {
        this.mEndTime = j;
    }

    public final void setMIsLocationEmpty(boolean z) {
        this.mIsLocationEmpty = z;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPlatform = str;
    }

    public final void setMSource(int i) {
        this.mSource = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMStartTime(long j) {
        this.mStartTime = j;
    }

    public final void setMWorkoutId(int i) {
        this.mWorkoutId = i;
    }

    @aa1
    public String toString() {
        return "SportRecordData(mStartTime=" + this.mStartTime + ", mEndTime=" + this.mEndTime + ", mMode=" + this.mMode + ", mSource=" + this.mSource + ", mIsLocationEmpty=" + this.mIsLocationEmpty + ", mWorkoutId=" + this.mWorkoutId + ", mDistance=" + this.mDistance + ", mPace=" + this.mPace + " ,mCalorie=" + this.mCalorie + " ,mDuration=" + this.mDuration + I000IiI1O.C2156iO.f1007iO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@aa1 Parcel parcel, int i) {
        Intrinsics.X0O(parcel, "parcel");
        parcel.writeLong(this.mStartTime);
        parcel.writeLong(this.mEndTime);
        parcel.writeInt(this.mMode);
        parcel.writeInt(this.mSource);
        parcel.writeByte(this.mIsLocationEmpty ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mWorkoutId);
        parcel.writeInt(this.mDistance);
        parcel.writeInt(this.mPace);
        parcel.writeInt(this.mCalorie);
        parcel.writeInt(this.mDuration);
        parcel.writeString(this.mPlatform);
        parcel.writeInt(this.mSpeed);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportRecordData(@aa1 Parcel parcel) {
        this();
        Intrinsics.X0O(parcel, "parcel");
        this.mStartTime = parcel.readLong();
        this.mEndTime = parcel.readLong();
        this.mMode = parcel.readInt();
        this.mSource = parcel.readInt();
        this.mIsLocationEmpty = parcel.readByte() != 0;
        this.mWorkoutId = parcel.readInt();
        this.mDistance = parcel.readInt();
        this.mPace = parcel.readInt();
        this.mCalorie = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mPlatform = String.valueOf(parcel.readString());
        this.mSpeed = parcel.readInt();
    }
}
