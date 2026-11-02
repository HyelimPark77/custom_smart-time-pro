package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ChannelInfo {
    private float freq;
    private int index;

    public ChannelInfo() {
    }

    public float getFreq() {
        return this.freq;
    }

    public int getIndex() {
        return this.index;
    }

    public void setFreq(float r1) {
        this.freq = r1;
    }

    public void setIndex(int r1) {
        this.index = r1;
    }

    public String toString() {
        return "ChannelInfo{index=" + this.index + ", freq=" + this.freq + i0XO1.IO;
    }

    public ChannelInfo(int r1, float r2) {
        setIndex(r1);
        setFreq(r2);
    }
}
