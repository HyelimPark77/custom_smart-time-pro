package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class SportsInfo {
    private int endTime;
    private int[] exerciseIntensityState;
    private int heartRateMode;
    private int id;
    private boolean isNeedAppGPS;
    private int mode;
    private int readRealTimeDataInterval;
    private short recordFileId;
    private int recordFileSize;
    private int recoveryTime;
    private int state;

    public SportsInfo() {
        this.state = -1;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int[] getExerciseIntensityState() {
        return this.exerciseIntensityState;
    }

    public int getHeartRateMode() {
        return this.heartRateMode;
    }

    public int getId() {
        return this.id;
    }

    public int getMode() {
        return this.mode;
    }

    public int getReadRealTimeDataInterval() {
        return this.readRealTimeDataInterval;
    }

    public short getRecordFileId() {
        return this.recordFileId;
    }

    public int getRecordFileSize() {
        return this.recordFileSize;
    }

    public int getRecoveryTime() {
        return this.recoveryTime;
    }

    public int getState() {
        return this.state;
    }

    public boolean isNeedAppGPS() {
        return this.isNeedAppGPS;
    }

    public SportsInfo setEndTime(int r1) {
        this.endTime = r1;
        return this;
    }

    public SportsInfo setExerciseIntensityState(int[] r1) {
        this.exerciseIntensityState = r1;
        return this;
    }

    public SportsInfo setHeartRateMode(int r1) {
        this.heartRateMode = r1;
        return this;
    }

    public SportsInfo setId(int r1) {
        this.id = r1;
        return this;
    }

    public SportsInfo setMode(int r1) {
        this.mode = r1;
        return this;
    }

    public SportsInfo setNeedAppGPS(boolean r1) {
        this.isNeedAppGPS = r1;
        return this;
    }

    public SportsInfo setReadRealTimeDataInterval(int r1) {
        this.readRealTimeDataInterval = r1;
        return this;
    }

    public SportsInfo setRecordFileId(short r1) {
        this.recordFileId = r1;
        return this;
    }

    public SportsInfo setRecordFileSize(int r1) {
        this.recordFileSize = r1;
        return this;
    }

    public SportsInfo setRecoveryTime(int r1) {
        this.recoveryTime = r1;
        return this;
    }

    public SportsInfo setState(int r1) {
        this.state = r1;
        return this;
    }

    public String toString() {
        return "SportsInfo{id=" + this.id + ", mode=" + this.mode + ", state=" + this.state + ", isNeedAppGPS=" + this.isNeedAppGPS + ", heartRateMode=" + this.heartRateMode + ", readRealTimeDataInterval=" + this.readRealTimeDataInterval + ", endTime=" + this.endTime + ", recoveryTime=" + this.recoveryTime + ", recordFileId=" + this.recordFileId + ", recordFileSize=" + this.recordFileSize + ", exerciseIntensityState=" + Arrays.toString(this.exerciseIntensityState) + i0XO1.IO;
    }

    public SportsInfo(int r2, int r3, int r4, boolean r5, int r6, int r7) {
        this.state = -1;
        setId(r2);
        setMode(r3);
        setState(r4);
        setNeedAppGPS(r5);
        setHeartRateMode(r6);
        setReadRealTimeDataInterval(r7);
    }
}
