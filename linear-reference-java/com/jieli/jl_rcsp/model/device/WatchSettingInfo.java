package com.jieli.jl_rcsp.model.device;

/* JADX INFO: loaded from: classes17.dex */
public class WatchSettingInfo {
    private int mask;

    public WatchSettingInfo(int r1) {
        this.mask = r1;
    }

    public boolean isSupport(int r2) {
        if (((this.mask >> r2) & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public void setMask(int r1) {
        this.mask = r1;
    }
}
