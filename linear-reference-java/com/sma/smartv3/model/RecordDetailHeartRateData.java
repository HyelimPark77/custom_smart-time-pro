package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.HeartRate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDetailHeartRateData {
    private long mAerobic;
    private long mAnaerobic;
    private int mAvgHR;
    private long mFatBurning;

    @aa1
    private ArrayList<HeartRate> mHeartRateList;
    private int mMaxHR;
    private int mMinHR;
    private long mStrenuous;
    private long mWarmUp;

    public RecordDetailHeartRateData() {
        this.mHeartRateList = new ArrayList();
    }

    public final long getMAerobic() {
        return this.mAerobic;
    }

    public final long getMAnaerobic() {
        return this.mAnaerobic;
    }

    public final int getMAvgHR() {
        return this.mAvgHR;
    }

    public final long getMFatBurning() {
        return this.mFatBurning;
    }

    @aa1
    public final ArrayList<HeartRate> getMHeartRateList() {
        return this.mHeartRateList;
    }

    public final int getMMaxHR() {
        return this.mMaxHR;
    }

    public final int getMMinHR() {
        return this.mMinHR;
    }

    public final long getMStrenuous() {
        return this.mStrenuous;
    }

    public final long getMWarmUp() {
        return this.mWarmUp;
    }

    public final void setMAerobic(long r1) {
        this.mAerobic = r1;
    }

    public final void setMAnaerobic(long r1) {
        this.mAnaerobic = r1;
    }

    public final void setMAvgHR(int r1) {
        this.mAvgHR = r1;
    }

    public final void setMFatBurning(long r1) {
        this.mFatBurning = r1;
    }

    public final void setMHeartRateList(@aa1 ArrayList<HeartRate> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHeartRateList = r2;
    }

    public final void setMMaxHR(int r1) {
        this.mMaxHR = r1;
    }

    public final void setMMinHR(int r1) {
        this.mMinHR = r1;
    }

    public final void setMStrenuous(long r1) {
        this.mStrenuous = r1;
    }

    public final void setMWarmUp(long r1) {
        this.mWarmUp = r1;
    }
}
