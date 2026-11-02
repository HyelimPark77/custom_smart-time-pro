package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DelDevFileParam extends BaseParameter {
    private final int cluster;
    private final int devHandle;
    private final boolean last;
    private final byte type;

    public DelDevFileParam(int r1, byte r2, int r3, boolean r4) {
        this.devHandle = r1;
        this.type = r2;
        this.cluster = r3;
        this.last = r4;
    }

    public int getCluster() {
        return this.cluster;
    }

    public int getDevHandle() {
        return this.devHandle;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[10];
        r0[0] = this.last ? 1 : 0;
        System.arraycopy(CHexConver.intToBigBytes(this.devHandle), 0, r0, 1, 4);
        r0[5] = this.type;
        System.arraycopy(CHexConver.intToBigBytes(this.cluster), 0, r0, 6, 4);
        return r0;
    }

    public byte getType() {
        return this.type;
    }

    public boolean isLast() {
        return this.last;
    }
}
