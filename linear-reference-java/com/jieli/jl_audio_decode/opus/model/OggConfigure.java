package com.jieli.jl_audio_decode.opus.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class OggConfigure {
    private int frameLen;
    private int pageFrameCount;

    public OggConfigure() {
        this.pageFrameCount = 30;
        this.frameLen = 40;
    }

    public int getFrameLen() {
        return this.frameLen;
    }

    public int getPageFrameCount() {
        return this.pageFrameCount;
    }

    public OggConfigure setFrameLen(int r1) {
        if (r1 <= 0) goto L4;
        this.frameLen = r1;
    L4:
        return this;
    }

    public OggConfigure setPageFrameCount(int r1) {
        if (r1 <= 0) goto L4;
        this.pageFrameCount = r1;
    L4:
        return this;
    }

    public String toString() {
        return "OggConfigure{pageFrameCount=" + this.pageFrameCount + ", frameLen=" + this.frameLen + i0XO1.IO;
    }
}
