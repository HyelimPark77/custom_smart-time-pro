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

    public void setMaxVol(int i) {
        this.maxVol = i;
    }

    public void setSupportVolumeSync(boolean z) {
        this.supportVolumeSync = z;
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public String toString() {
        return "VolumeInfo{maxVol=" + this.maxVol + ", volume=" + this.volume + ", supportVolumeSync=" + this.supportVolumeSync + i0XO1.f7442IO;
    }

    public VolumeInfo(int i) {
        this(0, i);
    }

    public VolumeInfo(int i, int i2) {
        this.supportVolumeSync = false;
        setMaxVol(i);
        setVolume(i2);
    }

    public VolumeInfo(int i, int i2, boolean z) {
        this.supportVolumeSync = false;
        setMaxVol(i);
        setVolume(i2);
        setSupportVolumeSync(z);
    }
}
