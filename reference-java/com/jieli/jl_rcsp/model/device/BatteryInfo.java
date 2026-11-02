package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class BatteryInfo {
    private int battery;

    public BatteryInfo() {
    }

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int i) {
        this.battery = i;
    }

    public String toString() {
        return "BatteryInfo{battery=" + this.battery + i0XO1.f7442IO;
    }

    public BatteryInfo(int i) {
        setBattery(i);
    }
}
