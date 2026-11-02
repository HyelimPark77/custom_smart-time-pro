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

    public void setCluster(int i) {
        this.cluster = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "MusicNameInfo{cluster=" + this.cluster + ", name='" + this.name + '\'' + i0XO1.f7442IO;
    }

    public MusicNameInfo(int i, String str) {
        setCluster(i);
        setName(str);
    }
}
