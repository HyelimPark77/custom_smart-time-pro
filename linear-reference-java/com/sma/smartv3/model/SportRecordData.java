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
    public static final CREATOR CREATOR = null;
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
        public /* synthetic */ CREATOR(DefaultConstructorMarker r1) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SportRecordData createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SportRecordData[] newArray(int r1) {
            return newArray(r1);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public SportRecordData createFromParcel(@aa1 Parcel r2) {
            Intrinsics.X0O(r2, "parcel");
            return new SportRecordData(r2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public SportRecordData[] newArray(int r1) {
            return new SportRecordData[r1];
        }
    }

    static {
        CREATOR = new CREATOR(null);
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

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMEndTime(long r1) {
        this.mEndTime = r1;
    }

    public final void setMIsLocationEmpty(boolean r1) {
        this.mIsLocationEmpty = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlatform = r2;
    }

    public final void setMSource(int r1) {
        this.mSource = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMStartTime(long r1) {
        this.mStartTime = r1;
    }

    public final void setMWorkoutId(int r1) {
        this.mWorkoutId = r1;
    }

    @aa1
    public String toString() {
        return "SportRecordData(mStartTime=" + this.mStartTime + ", mEndTime=" + this.mEndTime + ", mMode=" + this.mMode + ", mSource=" + this.mSource + ", mIsLocationEmpty=" + this.mIsLocationEmpty + ", mWorkoutId=" + this.mWorkoutId + ", mDistance=" + this.mDistance + ", mPace=" + this.mPace + " ,mCalorie=" + this.mCalorie + " ,mDuration=" + this.mDuration + I000IiI1O.iO.iO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@aa1 Parcel r3, int r4) {
        Intrinsics.X0O(r3, "parcel");
        r3.writeLong(this.mStartTime);
        r3.writeLong(this.mEndTime);
        r3.writeInt(this.mMode);
        r3.writeInt(this.mSource);
        r3.writeByte(this.mIsLocationEmpty ? 1 : 0);
        r3.writeInt(this.mWorkoutId);
        r3.writeInt(this.mDistance);
        r3.writeInt(this.mPace);
        r3.writeInt(this.mCalorie);
        r3.writeInt(this.mDuration);
        r3.writeString(this.mPlatform);
        r3.writeInt(this.mSpeed);
    }

    public SportRecordData(@aa1 Parcel r3) {
        Intrinsics.X0O(r3, "parcel");
        this();
        this.mStartTime = r3.readLong();
        this.mEndTime = r3.readLong();
        this.mMode = r3.readInt();
        this.mSource = r3.readInt();
        if (r3.readByte() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.mIsLocationEmpty = r0;
        this.mWorkoutId = r3.readInt();
        this.mDistance = r3.readInt();
        this.mPace = r3.readInt();
        this.mCalorie = r3.readInt();
        this.mDuration = r3.readInt();
        this.mPlatform = String.valueOf(r3.readString());
        this.mSpeed = r3.readInt();
        return;
    L5:
        r0 = false;
        goto L6
    }
}
