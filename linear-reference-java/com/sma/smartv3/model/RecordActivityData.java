package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordActivityData {
    private int mAirPressure;
    private int mAltitude;
    private int mAvgBpm;
    private float mAvgSpeed;
    private int mAvgStress;
    private int mCalorieTotal;
    private float mDistanceTotal;
    private int mMaxBpm;
    private int mMaxPace;
    private int mMaxSpm;
    private int mMaxStress;
    private int mMinBpm;
    private int mMinPace;
    private int mMinSpm;
    private int mMinStress;
    private int mPace;

    @aa1
    private String mPauseTimeTotal;

    @aa1
    private String mPlatform;
    private float mSpeed;
    private int mSpm;

    @aa1
    private String mSportTimeStr;
    private int mStepTotal;

    @aa1
    private ArrayList<RecordTimeList> mTimeList;

    public RecordActivityData() {
        this.mSportTimeStr = "00:00:00";
        this.mPauseTimeTotal = "00:00:00";
        this.mTimeList = new ArrayList();
        this.mPlatform = "";
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final float getMAvgSpeed() {
        return this.mAvgSpeed;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
    }

    public final int getMCalorieTotal() {
        return this.mCalorieTotal;
    }

    public final float getMDistanceTotal() {
        return this.mDistanceTotal;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxPace() {
        return this.mMaxPace;
    }

    public final int getMMaxSpm() {
        return this.mMaxSpm;
    }

    public final int getMMaxStress() {
        return this.mMaxStress;
    }

    public final int getMMinBpm() {
        return this.mMinBpm;
    }

    public final int getMMinPace() {
        return this.mMinPace;
    }

    public final int getMMinSpm() {
        return this.mMinSpm;
    }

    public final int getMMinStress() {
        return this.mMinStress;
    }

    public final int getMPace() {
        return this.mPace;
    }

    @aa1
    public final String getMPauseTimeTotal() {
        return this.mPauseTimeTotal;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    public final float getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    @aa1
    public final String getMSportTimeStr() {
        return this.mSportTimeStr;
    }

    public final int getMStepTotal() {
        return this.mStepTotal;
    }

    @aa1
    public final ArrayList<RecordTimeList> getMTimeList() {
        return this.mTimeList;
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMAvgSpeed(float r1) {
        this.mAvgSpeed = r1;
    }

    public final void setMAvgStress(int r1) {
        this.mAvgStress = r1;
    }

    public final void setMCalorieTotal(int r1) {
        this.mCalorieTotal = r1;
    }

    public final void setMDistanceTotal(float r1) {
        this.mDistanceTotal = r1;
    }

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMaxPace(int r1) {
        this.mMaxPace = r1;
    }

    public final void setMMaxSpm(int r1) {
        this.mMaxSpm = r1;
    }

    public final void setMMaxStress(int r1) {
        this.mMaxStress = r1;
    }

    public final void setMMinBpm(int r1) {
        this.mMinBpm = r1;
    }

    public final void setMMinPace(int r1) {
        this.mMinPace = r1;
    }

    public final void setMMinSpm(int r1) {
        this.mMinSpm = r1;
    }

    public final void setMMinStress(int r1) {
        this.mMinStress = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMPauseTimeTotal(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPauseTimeTotal = r2;
    }

    public final void setMPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlatform = r2;
    }

    public final void setMSpeed(float r1) {
        this.mSpeed = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMSportTimeStr(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSportTimeStr = r2;
    }

    public final void setMStepTotal(int r1) {
        this.mStepTotal = r1;
    }

    public final void setMTimeList(@aa1 ArrayList<RecordTimeList> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTimeList = r2;
    }
}
