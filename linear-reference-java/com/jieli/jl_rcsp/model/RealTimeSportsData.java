package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class RealTimeSportsData {
    private int calorie;
    private float distance;
    private int duration;
    private int exerciseStatus;
    private int heartRate;
    private float pace;
    private float speed;
    private int step;
    private int stepFreq;
    private int stride;
    private byte version;

    public RealTimeSportsData() {
    }

    public int getCalorie() {
        return this.calorie;
    }

    public float getDistance() {
        return this.distance;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getExerciseStatus() {
        return this.exerciseStatus;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public float getPace() {
        return this.pace;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getStep() {
        return this.step;
    }

    public int getStepFreq() {
        return this.stepFreq;
    }

    public int getStride() {
        return this.stride;
    }

    public byte getVersion() {
        return this.version;
    }

    public RealTimeSportsData setCalorie(int r1) {
        this.calorie = r1;
        return this;
    }

    public RealTimeSportsData setDistance(float r1) {
        this.distance = r1;
        return this;
    }

    public RealTimeSportsData setDuration(int r1) {
        this.duration = r1;
        return this;
    }

    public RealTimeSportsData setExerciseStatus(int r1) {
        this.exerciseStatus = r1;
        return this;
    }

    public RealTimeSportsData setHeartRate(int r1) {
        this.heartRate = r1;
        return this;
    }

    public RealTimeSportsData setPace(float r1) {
        this.pace = r1;
        return this;
    }

    public RealTimeSportsData setSpeed(float r1) {
        this.speed = r1;
        return this;
    }

    public RealTimeSportsData setStep(int r1) {
        this.step = r1;
        return this;
    }

    public RealTimeSportsData setStepFreq(int r1) {
        this.stepFreq = r1;
        return this;
    }

    public RealTimeSportsData setStride(int r1) {
        this.stride = r1;
        return this;
    }

    public RealTimeSportsData setVersion(byte r1) {
        this.version = r1;
        return this;
    }

    public String toString() {
        return "RealTimeSportsData{version=" + this.version + ", step=" + this.step + ", distance=" + this.distance + ", duration=" + this.duration + ", speed=" + this.speed + ", pace=" + this.pace + ", calorie=" + this.calorie + ", stepFreq=" + this.stepFreq + ", stride=" + this.stride + ", exerciseStatus=" + this.exerciseStatus + ", heartRate=" + this.heartRate + i0XO1.IO;
    }
}
