package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SearchDevParam extends BaseParameter {
    private int op;
    private int player;
    private int timeoutSec;
    private int type;
    private int way;

    public static class SearchDevResultParam extends SearchDevParam {
        private final int result;

        public SearchDevResultParam(int r1) {
            this.result = r1;
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
        this.player = 0;
    }

    public int getOp() {
        return this.op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r1 = CHexConver.int2byte2(this.timeoutSec);
        byte[] r0 = {CHexConver.intToByte(this.type), CHexConver.intToByte(this.op), 0, 0, CHexConver.intToByte(this.way), CHexConver.intToByte(this.player)};
        System.arraycopy(r1, 0, r0, 2, r1.length);
        return r0;
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

    public SearchDevParam setOp(int r1) {
        this.op = r1;
        return this;
    }

    public SearchDevParam setPlayer(int r1) {
        this.player = r1;
        return this;
    }

    public SearchDevParam setTimeoutSec(int r1) {
        this.timeoutSec = r1;
        return this;
    }

    public SearchDevParam setType(int r1) {
        this.type = r1;
        return this;
    }

    public SearchDevParam setWay(int r1) {
        this.way = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "SearchDevParam{type=" + this.type + ", op=" + this.op + ", timeoutSec=" + this.timeoutSec + "} " + super.toString();
    }

    public SearchDevParam(int r2, int r3, int r4) {
        this.player = 0;
        setType(r2).setOp(r3).setTimeoutSec(r4);
    }
}
