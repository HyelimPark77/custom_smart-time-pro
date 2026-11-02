package com.jieli.jl_bt_ota.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ThreadState {
    public static final int STATE_END = 0;
    public static final int STATE_START = 1;

    /* JADX INFO: renamed from: id */
    private final long f37612id;
    private final String name;
    private int state;

    public ThreadState(long j, String str) {
        this.f37612id = j;
        this.name = str;
    }

    public long getId() {
        return this.f37612id;
    }

    public String getName() {
        return this.name;
    }

    public int getState() {
        return this.state;
    }

    public ThreadState setState(int i) {
        this.state = i;
        return this;
    }

    public String toString() {
        return "ThreadState{id=" + this.f37612id + ", name='" + this.name + "', state=" + this.state + i0XO1.f7442IO;
    }
}
