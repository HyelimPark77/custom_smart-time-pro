package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class SpeechInfo {
    private int audioFormat;
    private int channel;
    private int haveVad;
    private int sampleRate;

    public SpeechInfo() {
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getHaveVad() {
        return this.haveVad;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setAudioFormat(int r1) {
        this.audioFormat = r1;
    }

    public void setChannel(int r1) {
        this.channel = r1;
    }

    public void setHaveVad(int r1) {
        this.haveVad = r1;
    }

    public void setSampleRate(int r1) {
        this.sampleRate = r1;
    }

    public String toString() {
        return "SpeechInfo{haveVad=" + this.haveVad + ", channel=" + this.channel + ", sampleRate=" + this.sampleRate + ", audioFormat=" + this.audioFormat + i0XO1.IO;
    }
}
