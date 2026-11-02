package com.jieli.jl_rcsp.task.smallfile;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateFileTask extends AddFileTask {
    public final Param d;

    public static class Param extends AddFileTask.Param {
        public final short d;

        public Param(byte r1, short r2, byte[] r3) {
            super(r1, r3);
            this.d = r2;
        }

        public static /* synthetic */ short a(Param r0) {
            return r0.d;
        }

        public short getId() {
            return this.d;
        }
    }

    public UpdateFileTask(RcspOpImpl r3, Param r4) throws RuntimeException {
        super(r3, r4);
        this.d = r4;
        this.c = new QueryFileTask.File(r4.type, Param.a(r4), r4.size);
    }

    @Override // com.jieli.jl_rcsp.task.smallfile.AddFileTask
    public SmallFileTransferCmd.Param a(short r8, short r9, byte[] r10, short r11) {
        Param r1 = this.d;
        return new SmallFileTransferCmd.UpdateFileParam(r1.type, Param.a(r1), r8, r9, r10, r11);
    }
}
