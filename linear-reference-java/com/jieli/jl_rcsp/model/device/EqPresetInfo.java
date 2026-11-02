package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class EqPresetInfo {
    private List<EqInfo> eqInfos;
    private int[] freqs;
    private int number;

    public EqPresetInfo() {
    }

    public List<EqInfo> getEqInfos() {
        return this.eqInfos;
    }

    public int[] getFreqs() {
        return this.freqs;
    }

    public int getNumber() {
        return this.number;
    }

    public void setEqInfos(List<EqInfo> r1) {
        this.eqInfos = r1;
    }

    public void setFreqs(int[] r1) {
        this.freqs = r1;
    }

    public void setNumber(int r1) {
        this.number = r1;
    }

    public String toString() {
        return "EqPresetInfo{number=" + this.number + ", eqInfos=" + this.eqInfos + ", freqs=" + Arrays.toString(this.freqs) + i0XO1.IO;
    }
}
