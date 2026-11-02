package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class Option {
    private int cmdTimeout;
    private boolean isMultiDevice;

    public Option() {
        this.cmdTimeout = 2000;
    }

    public static Option createOption() {
        return new Option().setMultiDevice(false);
    }

    public int getCmdTimeout() {
        return this.cmdTimeout;
    }

    public boolean isMultiDevice() {
        return this.isMultiDevice;
    }

    public Option setCmdTimeout(int r1) {
        this.cmdTimeout = r1;
        return this;
    }

    public Option setMultiDevice(boolean r1) {
        this.isMultiDevice = r1;
        return this;
    }

    public String toString() {
        return "Option{isMultiDevice=" + this.isMultiDevice + ", cmdTimeout=" + this.cmdTimeout + i0XO1.IO;
    }
}
