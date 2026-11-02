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

    public void setChannel(int r1) {
        this.channel = r1;
    }

    public void setFreq(float r1) {
        this.freq = r1;
    }

    public void setMode(int r1) {
        this.mode = r1;
    }

    public void setPlay(boolean r1) {
        this.isPlay = r1;
    }

    public String toString() {
        return "FmStatusInfo{isPlay=" + this.isPlay + ", channel=" + this.channel + ", freq=" + this.freq + ", mode=" + this.mode + i0XO1.IO;
    }

    public FmStatusInfo(boolean r1, int r2, float r3, int r4) {
        setMode(r4);
        setChannel(r2);
        setFreq(r3);
        setPlay(r1);
    }
}
