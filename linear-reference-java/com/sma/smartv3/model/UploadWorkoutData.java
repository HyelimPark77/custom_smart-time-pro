package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadWorkoutData {
    private int airPressure;
    private int altitude;
    private int calorie;
    private int distance;
    private int duration;
    private long end;
    private int is_delete;
    private int mAvgBpm;
    private int mAvgStress;

    @aa1
    private String mBleName;
    private int mFeel;

    @aa1
    private String mFirmwareFlag;
    private int mMaxAltitude;
    private int mMaxBpm;
    private int mMaxPace;
    private int mMaxSpm;
    private int mMaxStress;
    private int mMinAltitude;
    private int mMinBpm;
    private int mMinPace;
    private int mMinSpm;
    private int mMinStress;

    @aa1
    private String mPrototype;
    private int mSource;
    private int mode;
    private int pace;
    private int speed;
    private int spm;
    private long start;
    private int step;

    public UploadWorkoutData() {
        this.mPrototype = "";
        this.mFirmwareFlag = "";
        this.mBleName = "";
    }

    public final int getAirPressure() {
        return this.airPressure;
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    public final int getMFeel() {
        return this.mFeel;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    public final int getMMaxAltitude() {
        return this.mMaxAltitude;
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

    public final int getMMinAltitude() {
        return this.mMinAltitude;
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

    @aa1
    public final String getMPrototype() {
        return this.mPrototype;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getPace() {
        return this.pace;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final int getSpm() {
        return this.spm;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getStep() {
        return this.step;
    }

    public final int is_delete() {
        return this.is_delete;
    }

    public final void setAirPressure(int r1) {
        this.airPressure = r1;
    }

    public final void setAltitude(int r1) {
        this.altitude = r1;
    }

    public final void setCalorie(int r1) {
        this.calorie = r1;
    }

    public final void setDistance(int r1) {
        this.distance = r1;
    }

    public final void setDuration(int r1) {
        this.duration = r1;
    }

    public final void setEnd(long r1) {
        this.end = r1;
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMAvgStress(int r1) {
        this.mAvgStress = r1;
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    public final void setMFeel(int r1) {
        this.mFeel = r1;
    }

    public final void setMFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareFlag = r2;
    }

    public final void setMMaxAltitude(int r1) {
        this.mMaxAltitude = r1;
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

    public final void setMMinAltitude(int r1) {
        this.mMinAltitude = r1;
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

    public final void setMPrototype(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPrototype = r2;
    }

    public final void setMSource(int r1) {
        this.mSource = r1;
    }

    public final void setMode(int r1) {
        this.mode = r1;
    }

    public final void setPace(int r1) {
        this.pace = r1;
    }

    public final void setSpeed(int r1) {
        this.speed = r1;
    }

    public final void setSpm(int r1) {
        this.spm = r1;
    }

    public final void setStart(long r1) {
        this.start = r1;
    }

    public final void setStep(int r1) {
        this.step = r1;
    }

    public final void set_delete(int r1) {
        this.is_delete = r1;
    }
}
