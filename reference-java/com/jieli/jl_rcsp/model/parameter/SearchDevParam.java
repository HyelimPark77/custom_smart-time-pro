package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SearchDevParam extends BaseParameter {

    /* JADX INFO: renamed from: op */
    private int f38036op;
    private int player = 0;
    private int timeoutSec;
    private int type;
    private int way;

    public static class SearchDevResultParam extends SearchDevParam {
        private final int result;

        public SearchDevResultParam(int i) {
            this.result = i;
        }

        @Override // com.jieli.jl_rcsp.model.parameter.SearchDevParam, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{CHexConver.intToByte(this.result)};
        }

        public int getResult() {
            return this.result;
        }
    }

    public SearchDevParam() {
    }

    public int getOp() {
        return this.f38036op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] bArrInt2byte2 = CHexConver.int2byte2(this.timeoutSec);
        byte[] bArr = {CHexConver.intToByte(this.type), CHexConver.intToByte(this.f38036op), 0, 0, CHexConver.intToByte(this.way), CHexConver.intToByte(this.player)};
        System.arraycopy(bArrInt2byte2, 0, bArr, 2, bArrInt2byte2.length);
        return bArr;
    }

    public int getPlayer() {
        return this.player;
    }

    public int getTimeoutSec() {
        return this.timeoutSec;
    }

    public int getType() {
        return this.type;
    }

    public int getWay() {
        return this.way;
    }

    public SearchDevParam setOp(int i) {
        this.f38036op = i;
        return this;
    }

    public SearchDevParam setPlayer(int i) {
        this.player = i;
        return this;
    }

    public SearchDevParam setTimeoutSec(int i) {
        this.timeoutSec = i;
        return this;
    }

    public SearchDevParam setType(int i) {
        this.type = i;
        return this;
    }

    public SearchDevParam setWay(int i) {
        this.way = i;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "SearchDevParam{type=" + this.type + ", op=" + this.f38036op + ", timeoutSec=" + this.timeoutSec + "} " + super.toString();
    }

    public SearchDevParam(int i, int i2, int i3) {
        setType(i).setOp(i2).setTimeoutSec(i3);
    }
}
