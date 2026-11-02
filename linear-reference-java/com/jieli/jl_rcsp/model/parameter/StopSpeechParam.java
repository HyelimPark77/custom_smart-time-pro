package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class StopSpeechParam extends BaseParameter {
    private boolean isPlayTTS;
    private boolean isSyncIatText;
    private boolean isSyncNlpText;
    private byte reason;

    public StopSpeechParam() {
        this.isSyncIatText = false;
        this.isSyncNlpText = false;
        this.isPlayTTS = false;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        boolean r0 = this.isSyncIatText;
        return new byte[]{this.reason, (byte) (((r0 ? 1 : 0) + ((this.isSyncNlpText ? 1 : 0) << 1)) + ((this.isPlayTTS ? 1 : 0) << 2))};
    }

    public byte getReason() {
        return this.reason;
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

    public StopSpeechParam setPlayTTS(boolean r1) {
        this.isPlayTTS = r1;
        return this;
    }

    public StopSpeechParam setReason(byte r1) {
        this.reason = r1;
        return this;
    }

    public StopSpeechParam setSyncIatText(boolean r1) {
        this.isSyncIatText = r1;
        return this;
    }

    public StopSpeechParam setSyncNlpText(boolean r1) {
        this.isSyncNlpText = r1;
        return this;
    }
}
