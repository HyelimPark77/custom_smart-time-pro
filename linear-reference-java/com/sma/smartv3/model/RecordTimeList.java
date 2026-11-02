package com.sma.smartv3.model;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordTimeList {
    private final int mState;
    private final long mTime;

    public RecordTimeList(long r1, int r3) {
        this.mTime = r1;
        this.mState = r3;
    }

    public final int getMState() {
        return this.mState;
    }

    public final long getMTime() {
        return this.mTime;
    }
}
