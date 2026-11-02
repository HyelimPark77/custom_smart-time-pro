package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class MusicNameInfo {
    private int cluster;
    private String name;

    public MusicNameInfo() {
    }

    public int getCluster() {
        return this.cluster;
    }

    public String getName() {
        return this.name;
    }

    public void setCluster(int r1) {
        this.cluster = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public String toString() {
        return "MusicNameInfo{cluster=" + this.cluster + ", name='" + this.name + '\'' + i0XO1.IO;
    }

    public MusicNameInfo(int r1, String r2) {
        setCluster(r1);
        setName(r2);
    }
}
