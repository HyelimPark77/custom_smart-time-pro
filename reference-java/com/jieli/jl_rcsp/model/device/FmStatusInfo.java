package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class FmStatusInfo {
    private int channel;
    private float freq;
    private boolean isPlay;
    private int mode;

    public FmStatusInfo() {
    }

    public int getChannel() {
        return this.channel;
    }

    public float getFreq() {
        return this.freq;
    }

    public int getMode() {
        return this.mode;
    }

    public boolean isPlay() {
        return this.isPlay;
    }

    public void setChannel(int i) {
        this.channel = i;
    }

    public void setFreq(float f) {
        this.freq = f;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setPlay(boolean z) {
        this.isPlay = z;
    }

    public String toString() {
        return "FmStatusInfo{isPlay=" + this.isPlay + ", channel=" + this.channel + ", freq=" + this.freq + ", mode=" + this.mode + i0XO1.f7442IO;
    }

    public FmStatusInfo(boolean z, int i, float f, int i2) {
        setMode(i2);
        setChannel(i);
        setFreq(f);
        setPlay(z);
    }
}
