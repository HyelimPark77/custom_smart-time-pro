package com.jieli.jl_bt_ota.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ThreadState {
    public static final int STATE_END = 0;
    public static final int STATE_START = 1;
    private final long id;
    private final String name;
    private int state;

    public ThreadState(long r1, String r3) {
        this.id = r1;
        this.name = r3;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getState() {
        return this.state;
    }

    public ThreadState setState(int r1) {
        this.state = r1;
        return this;
    }

    public String toString() {
        return "ThreadState{id=" + this.id + ", name='" + this.name + "', state=" + this.state + i0XO1.IO;
    }
}
