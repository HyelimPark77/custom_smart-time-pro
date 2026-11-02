package com.jieli.eq;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class SOSPara {
    public float centerFrequency;
    public boolean enable;
    public float gain;
    private float m_defaultFreq;
    public float qValue;
    public int type;

    public SOSPara(float r2) {
        this.enable = true;
        this.m_defaultFreq = r2;
        this.centerFrequency = r2;
    }

    public void copy(SOSPara r2) {
        this.type = r2.type;
        this.centerFrequency = r2.centerFrequency;
        this.gain = r2.gain;
        this.qValue = r2.qValue;
        this.enable = r2.enable;
    }

    public void reset() {
        this.type = 2;
        this.centerFrequency = this.m_defaultFreq;
        this.gain = 0.0f;
        this.qValue = 1.5f;
        this.enable = true;
    }

    public SOSPara() {
        this.enable = true;
        this.m_defaultFreq = 0.0f;
    }
}
