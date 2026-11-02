package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceFormatCmd extends CommandWithParamAndResponse<Param, Response> {

    public static class Param extends BaseParameter {
        private int devHandle;

        public Param(int r1) {
            this.devHandle = r1;
        }

        public int getDevHandle() {
            return this.devHandle;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return CHexConver.intToBigBytes(this.devHandle);
        }

        public void setDevHandle(int r1) {
            this.devHandle = r1;
        }
    }

    public static class Response extends CommonResponse {
        private int reason;

        public Response(int r1) {
            this.reason = r1;
        }

        public int getReason() {
            return this.reason;
        }

        public void setReason(int r1) {
            this.reason = r1;
        }
    }

    public DeviceFormatCmd(Param r3) {
        super(34, DelDevFileCmd.class.getSimpleName(), r3);
    }
}
