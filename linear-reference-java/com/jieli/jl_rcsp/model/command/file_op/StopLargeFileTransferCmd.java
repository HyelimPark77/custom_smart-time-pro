package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StopLargeFileTransferCmd extends CommandWithParamAndResponse<Param, CommonResponse> {

    public static class Param extends BaseParameter {
        private final int reason;

        public Param(int r1) {
            this.reason = r1;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{(byte) this.reason};
        }

        public int getReason() {
            return this.reason;
        }
    }

    public StopLargeFileTransferCmd(Param r3) {
        super(28, StopLargeFileTransferCmd.class.getSimpleName(), r3);
    }
}
