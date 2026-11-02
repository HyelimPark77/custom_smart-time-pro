package com.jieli.eq;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class EQPlotCore {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int[] m_centerFreqs;
    private long m_eqPlotCore;
    private FloatBuffer m_freq2plot;
    private FloatBuffer m_gain2plot;
    private int m_nplot;
    private long m_paraHolder;
    private SOSPara[] m_sosPara;
    private float m_totalGain;

    static {
        System.loadLibrary("jl_eq");
    }

    public EQPlotCore(int r7, int r8, int[] r9) {
        int r0 = r7 * 4;
        this.m_freq2plot = ByteBuffer.allocateDirect(r0).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.m_gain2plot = ByteBuffer.allocateDirect(r0).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.m_centerFreqs = r9;
        this.m_sosPara = new SOSPara[r8];
        int r10 = 0;
    L3:
        SOSPara[] r11 = this.m_sosPara;
        if (r10 >= r11.length) goto L6;
        r11[r10] = new SOSPara(this.m_centerFreqs[r10]);
        this.m_sosPara[r10].reset();
        r10 = r10 + 1;
        goto L3
    L6:
        long r3 = allocateParaHolder(r11);
        this.m_paraHolder = r3;
        this.m_totalGain = 1.0f;
        this.m_nplot = r7;
        this.m_eqPlotCore = allocateEQPlotCore(this.m_freq2plot, r7, r3, 3);
    }

    private native long allocateEQPlotCore(FloatBuffer r1, int r2, long r3, int r5);

    private native long allocateParaHolder(SOSPara[] r1);

    private native void getEQPlotData(FloatBuffer r1, long r2, long r4, int r6, float r7);

    public static int getLibVersionCode() {
        return 10101;
    }

    public static String getLibVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    private native void nativeUpdateParaFreq(long r1, int r3, float r4);

    private native void nativeUpdateParaGain(long r1, int r3, float r4);

    private native void nativeUpdateParaQVal(long r1, int r3, float r4);

    private native void nativeUpdateParaType(long r1, int r3, int r4);

    private native void releaseNativeObject(long r1, long r3);

    private native void updateParaFreqGain(long r1, int r3, float r4, float r5);

    public float getEQPlotData(float[] r9, int r10) {
        getEQPlotData(this.m_gain2plot, this.m_eqPlotCore, this.m_paraHolder, r10, this.m_totalGain);
        float r11 = this.m_gain2plot.get(0);
        int r2 = 0;
    L4:
        if (r2 >= this.m_nplot) goto L13;
        r11 = Math.max(r11, this.m_gain2plot.get(r2));
        if (r2 != 0) goto L8;
        r9[0] = this.m_freq2plot.get(r2);
        r9[1] = this.m_gain2plot.get(r2);
    L12:
        r2 = r2 + 1;
        goto L4
    L8:
        int r3 = this.m_nplot;
        if (r2 != (r3 - 1)) goto L11;
        r9[(r3 * 4) - 6] = this.m_freq2plot.get(r2);
        r9[(this.m_nplot * 4) - 5] = this.m_gain2plot.get(r2);
        goto L12
    L11:
        int r4 = r2 * 4;
        r9[r4 - 2] = this.m_freq2plot.get(r2);
        r9[r4 - 1] = this.m_gain2plot.get(r2);
        r9[r4] = this.m_freq2plot.get(r2);
        r9[r4 + 1] = this.m_gain2plot.get(r2);
        goto L12
    L13:
        return r11;
    }

    public SOSPara getPara(int r2) {
        return this.m_sosPara[r2];
    }

    public SOSPara[] getSOSPara() {
        return this.m_sosPara;
    }

    public void releaseNativeObject() {
        releaseNativeObject(this.m_eqPlotCore, this.m_paraHolder);
    }

    public void setTotalGain(float r1) {
        this.m_totalGain = r1;
    }

    public void syncPara(int r4) {
        nativeUpdateParaFreq(this.m_paraHolder, r4, this.m_sosPara[r4].centerFrequency);
        nativeUpdateParaGain(this.m_paraHolder, r4, this.m_sosPara[r4].gain);
        nativeUpdateParaQVal(this.m_paraHolder, r4, this.m_sosPara[r4].qValue);
        nativeUpdateParaType(this.m_paraHolder, r4, this.m_sosPara[r4].type);
    }

    public void updatePara(int r8, float r9, float r10) {
        SOSPara r0 = this.m_sosPara[r8];
        r0.centerFrequency = r9;
        r0.gain = r10;
        updateParaFreqGain(this.m_paraHolder, r8, r9, r10);
    }

    public void updateParaFreq(int r3, float r4) {
        this.m_sosPara[r3].centerFrequency = r4;
        nativeUpdateParaFreq(this.m_paraHolder, r3, r4);
    }

    public void updateParaGain(int r3, float r4) {
        this.m_sosPara[r3].gain = r4;
        nativeUpdateParaGain(this.m_paraHolder, r3, r4);
    }

    public void updateParaQVal(int r3, float r4) {
        this.m_sosPara[r3].qValue = r4;
        nativeUpdateParaQVal(this.m_paraHolder, r3, r4);
    }

    public void updateParaType(int r3, int r4) {
        this.m_sosPara[r3].type = r4;
        nativeUpdateParaType(this.m_paraHolder, r3, r4);
    }
}
