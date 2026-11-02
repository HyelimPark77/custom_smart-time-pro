package com.jieli.jl_rcsp.model.device.health;

import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class HealthData {
    public byte[] data;
    public byte subMask;
    public int type;
    public int version;

    public HealthData(int r1, byte r2, byte[] r3, int r4) {
        this.type = r1;
        this.subMask = r2;
        this.data = r3;
        this.version = r4;
    }

    public String toString() {
        return "healthData : type=" + this.type + ", subMask=" + this.subMask + ",version=" + this.version + ", data=" + CHexConver.byte2HexStr(this.data);
    }
}
