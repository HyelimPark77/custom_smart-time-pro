package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class MusicStatusInfo {
    private int currentDev;
    private int currentTime;
    private boolean isPlay;
    private int totalTime;

    public MusicStatusInfo() {
    }

    public int getCurrentDev() {
        return this.currentDev;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public boolean isPlay() {
        return this.isPlay;
    }

    public void setCurrentDev(int r1) {
        this.currentDev = r1;
    }

    public void setCurrentTime(int r1) {
        this.currentTime = r1;
    }

    public void setPlay(boolean r1) {
        this.isPlay = r1;
    }

    public void setTotalTime(int r1) {
        this.totalTime = r1;
    }

    public String toString() {
        return "MusicStatusInfo{isPlay=" + this.isPlay + ", currentTime=" + this.currentTime + ", totalTime=" + this.totalTime + ", currentDev=" + this.currentDev + i0XO1.IO;
    }

    public MusicStatusInfo(boolean r1, int r2, int r3, int r4) {
        setPlay(r1);
        setCurrentTime(r2);
        setTotalTime(r3);
        setCurrentDev(r4);
    }
}
