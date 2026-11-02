package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StopSpeechResponse extends CommonResponse {
    private boolean isPlayTTS;
    private boolean isSyncIatText;
    private boolean isSyncNlpText;

    public StopSpeechResponse() {
        this.isSyncIatText = false;
        this.isSyncNlpText = false;
        this.isPlayTTS = false;
    }

    public boolean isPlayTTS() {
        return this.isPlayTTS;
    }

    public boolean isSyncIatText() {
        return this.isSyncIatText;
    }

    public boolean isSyncNlpText() {
        return this.isSyncNlpText;
    }

    public StopSpeechResponse setPlayTTS(boolean r1) {
        this.isPlayTTS = r1;
        return this;
    }

    public StopSpeechResponse setSyncIatText(boolean r1) {
        this.isSyncIatText = r1;
        return this;
    }

    public StopSpeechResponse setSyncNlpText(boolean r1) {
        this.isSyncNlpText = r1;
        return this;
    }
}
