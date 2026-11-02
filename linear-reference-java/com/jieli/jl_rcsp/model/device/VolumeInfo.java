package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class VolumeInfo {
    private int maxVol;
    private boolean supportVolumeSync;
    private int volume;

    public VolumeInfo() {
        this(0, 0);
    }

    public int getMaxVol() {
        return this.maxVol;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isSupportVolumeSync() {
        return this.supportVolumeSync;
    }

    public void setMaxVol(int r1) {
        this.maxVol = r1;
    }

    public void setSupportVolumeSync(boolean r1) {
        this.supportVolumeSync = r1;
    }

    public void setVolume(int r1) {
        this.volume = r1;
    }

    public String toString() {
        return "VolumeInfo{maxVol=" + this.maxVol + ", volume=" + this.volume + ", supportVolumeSync=" + this.supportVolumeSync + i0XO1.IO;
    }

    public VolumeInfo(int r2) {
        this(0, r2);
    }

    public VolumeInfo(int r2, int r3) {
        this.supportVolumeSync = false;
        setMaxVol(r2);
        setVolume(r3);
    }

    public VolumeInfo(int r2, int r3, boolean r4) {
        this.supportVolumeSync = false;
        setMaxVol(r2);
        setVolume(r3);
        setSupportVolumeSync(r4);
    }
}
