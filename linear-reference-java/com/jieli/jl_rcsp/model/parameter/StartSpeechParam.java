package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class StartSpeechParam extends BaseParameter {
    private byte freq;
    private byte type;
    private byte way;

    public StartSpeechParam() {
    }

    public byte getFreq() {
        return this.freq;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{this.type, this.freq, this.way};
    }

    public byte getType() {
        return this.type;
    }

    public byte getWay() {
        return this.way;
    }

    public StartSpeechParam setFreq(byte r1) {
        this.freq = r1;
        return this;
    }

    public StartSpeechParam setType(byte r1) {
        this.type = r1;
        return this;
    }

    public StartSpeechParam setWay(byte r1) {
        this.way = r1;
        return this;
    }

    public StartSpeechParam(byte r2, byte r3) {
        this(r2, r3, (byte) 1);
    }

    public StartSpeechParam(byte r1, byte r2, byte r3) {
        this.type = r1;
        this.freq = r2;
        this.way = r3;
    }
}
