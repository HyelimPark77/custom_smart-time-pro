package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class DeleteFileByNameCmd extends CommandWithParamAndResponse<Param, Response> {

    public static class Param extends BaseParameter {
        public String name;

        public Param(String r2) {
            this.name = "";
            if (r2 != null) goto L5;
            r2 = "";
        L5:
            this.name = r2;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            int r0 = this.name.length();
            byte[] r1 = new byte[r0 + 1];
            System.arraycopy(this.name.getBytes(), 0, r1, 1, r0);
            return r1;
        }

        public void setName(String r1) {
            this.name = r1;
        }
    }

    public static class Response extends CommonResponse {
        public Response() {
        }
    }

    public DeleteFileByNameCmd(Param r3) {
        super(35, DeleteFileByNameCmd.class.getCanonicalName(), r3);
    }
}
