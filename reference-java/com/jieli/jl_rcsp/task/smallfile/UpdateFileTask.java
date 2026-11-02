package com.jieli.jl_rcsp.task.smallfile;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateFileTask extends AddFileTask {

    /* JADX INFO: renamed from: d */
    public final Param f38180d;

    public static class Param extends AddFileTask.Param {

        /* JADX INFO: renamed from: d */
        public final short f38181d;

        public Param(byte b, short s, byte[] bArr) {
            super(b, bArr);
            this.f38181d = s;
        }

        public short getId() {
            return this.f38181d;
        }
    }

    public UpdateFileTask(RcspOpImpl rcspOpImpl, Param param) throws RuntimeException {
        super(rcspOpImpl, param);
        this.f38180d = param;
        this.f38152c = new QueryFileTask.File(param.type, param.f38181d, param.size);
    }

    @Override // com.jieli.jl_rcsp.task.smallfile.AddFileTask
    /* JADX INFO: renamed from: a */
    public SmallFileTransferCmd.Param mo27588a(short s, short s2, byte[] bArr, short s3) {
        Param param = this.f38180d;
        return new SmallFileTransferCmd.UpdateFileParam(param.type, param.f38181d, s, s2, bArr, s3);
    }
}
