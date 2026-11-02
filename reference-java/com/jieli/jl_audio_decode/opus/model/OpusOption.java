package com.jieli.jl_audio_decode.opus.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class OpusOption {
    private boolean hasHead;
    private int channel = 1;
    private int sampleRate = 16000;
    private int packetSize = 40;

    public int getChannel() {
        return this.channel;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public boolean isHasHead() {
        return this.hasHead;
    }

    public OpusOption setChannel(int i) {
        if (i != 1 && i != 2) {
            return this;
        }
        this.channel = i;
        return this;
    }

    public OpusOption setHasHead(boolean z) {
        this.hasHead = z;
        return this;
    }

    public OpusOption setPacketSize(int i) {
        if (i >= 0) {
            this.packetSize = i;
        }
        return this;
    }

    public OpusOption setSampleRate(int i) {
        if (i != 8000 && i != 12000 && i != 16000 && i != 24000 && i != 48000) {
            return this;
        }
        this.sampleRate = i;
        return this;
    }

    public String toString() {
        return "OpusOption{hasHead=" + this.hasHead + ", channel=" + this.channel + ", sampleRate=" + this.sampleRate + ", packetSize=" + this.packetSize + i0XO1.f7442IO;
    }
}
