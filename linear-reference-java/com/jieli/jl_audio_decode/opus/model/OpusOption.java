package com.jieli.jl_audio_decode.opus.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class OpusOption {
    private int channel;
    private boolean hasHead;
    private int packetSize;
    private int sampleRate;

    public OpusOption() {
        this.channel = 1;
        this.sampleRate = 16000;
        this.packetSize = 40;
    }

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

    public OpusOption setChannel(int r2) {
        if (r2 != 1) goto L5;
    L8:
        this.channel = r2;
        return this;
    L5:
        if (r2 == 2) goto L8;
        return this;
    }

    public OpusOption setHasHead(boolean r1) {
        this.hasHead = r1;
        return this;
    }

    public OpusOption setPacketSize(int r1) {
        if (r1 < 0) goto L4;
        this.packetSize = r1;
    L4:
        return this;
    }

    public OpusOption setSampleRate(int r2) {
        if (r2 != 8000) goto L5;
    L14:
        this.sampleRate = r2;
        return this;
    L5:
        if (r2 == 12000) goto L14;
        if (r2 == 16000) goto L14;
        if (r2 == 24000) goto L14;
        if (r2 == 48000) goto L14;
        return this;
    }

    public String toString() {
        return "OpusOption{hasHead=" + this.hasHead + ", channel=" + this.channel + ", sampleRate=" + this.sampleRate + ", packetSize=" + this.packetSize + i0XO1.IO;
    }
}
