package com.jieli.jl_audio_decode.opus.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class OggConfigure {
    private int pageFrameCount = 30;
    private int frameLen = 40;

    public int getFrameLen() {
        return this.frameLen;
    }

    public int getPageFrameCount() {
        return this.pageFrameCount;
    }

    public OggConfigure setFrameLen(int i) {
        if (i > 0) {
            this.frameLen = i;
        }
        return this;
    }

    public OggConfigure setPageFrameCount(int i) {
        if (i > 0) {
            this.pageFrameCount = i;
        }
        return this;
    }

    public String toString() {
        return "OggConfigure{pageFrameCount=" + this.pageFrameCount + ", frameLen=" + this.frameLen + i0XO1.f7442IO;
    }
}
