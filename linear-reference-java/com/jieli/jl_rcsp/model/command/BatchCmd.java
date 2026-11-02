package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class BatchCmd extends CommandBase<Param, Response> {
    public static final byte OP_CANCEL = -127;
    public static final byte OP_START = 0;
    public static final byte OP_STOP = -128;

    public static class Param extends BaseParameter {
        private final byte op;
        private final byte[] param;

        public Param(byte r1, byte[] r2) {
            this.op = r1;
            this.param = r2;
        }

        public byte getOp() {
            return this.op;
        }

        public byte[] getParam() {
            return this.param;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            byte[] r0 = this.param;
            byte[] r1 = new byte[r0.length + 2];
            r1[0] = this.op;
            r1[1] = (byte) r0.length;
            System.arraycopy(r0, 0, r1, 2, r0.length);
            return r1;
        }
    }

    public static class Response extends CommonResponse {
        private final byte op;
        private final byte ret;

        public Response(byte r1, byte r2) {
            this.op = r1;
            this.ret = r2;
        }

        public byte getOp() {
            return this.op;
        }

        public byte getRet() {
            return this.ret;
        }
    }

    public BatchCmd(Param r2) {
        this(2, r2);
    }

    public BatchCmd(int r3, Param r4) {
        super(38, BatchCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
