package com.jieli.jl_rcsp.model.command.watch;

import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParam;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReceiveHealthDataCmd extends CommandWithParam<Param> {

    public static class Param extends BaseParameter implements IDataOp {
        public byte[] data;
        public byte packageCount;
        public byte packageId;
        public byte version;

        public Param(byte[] r5) throws ParseDataException {
            int r0 = parse(r5);
            if (r0 < 0) goto L6;
            return;
        L6:
            throw new ParseDataException(1, "Failed to parse data. size = " + r0, r5);
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r5) {
            this.data = new byte[0];
            if (r5 != null) goto L5;
        L16:
            return 0;
        L5:
            if (r5.length == 0) goto L16;
            if (r5.length >= 3) goto L11;
            return -1;
        L11:
            this.version = r5[0];
            this.packageCount = r5[1];
            this.packageId = r5[2];
            if (r5.length <= 3) goto L15;
            int r1 = r5.length - 3;
            byte[] r3 = new byte[r1];
            this.data = r3;
            System.arraycopy(r5, 3, r3, 0, r1);
        L15:
            return r5.length;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.version);
            r0.write(this.packageCount);
            r0.write(this.packageId);
            byte[] r1 = this.data;
            if (r1 == null) goto L11;
            if (r1.length <= 0) goto L11;
            r0.write(r1);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            e.printStackTrace();
        L11:
            return r0.toByteArray();
        }
    }

    public ReceiveHealthDataCmd(Param r3) {
        super(162, ReceiveHealthDataCmd.class.getSimpleName(), r3);
    }
}
