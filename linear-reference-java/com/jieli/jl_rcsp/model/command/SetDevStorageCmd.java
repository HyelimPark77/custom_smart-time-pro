package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class SetDevStorageCmd extends CommandWithParamAndResponse<SetDevStorageParam, CommonResponse> {

    public static class SetDevStorageParam extends BaseParameter {
        private final int devHandler;

        public SetDevStorageParam(int r1) {
            this.devHandler = r1;
        }

        public int getDevHandler() {
            return this.devHandler;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(this.devHandler));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }
    }

    public SetDevStorageCmd(int r3) {
        super(216, SetDevStorageCmd.class.getSimpleName(), new SetDevStorageParam(r3));
    }
}
