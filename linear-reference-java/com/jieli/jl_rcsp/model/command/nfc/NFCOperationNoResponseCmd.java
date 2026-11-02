package com.jieli.jl_rcsp.model.command.nfc;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParam;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class NFCOperationNoResponseCmd extends CommandWithParam<Param> {

    public static class NotifyDefaultNfcParam extends Param {
        private final int flag;
        private final short id;

        public NotifyDefaultNfcParam(int r2, short r3) {
            super(r2, 5);
            this.flag = 2;
            this.id = r3;
        }

        public int getFlag() {
            return this.flag;
        }

        public short getId() {
            return this.id;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationNoResponseCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: IOException -> L5
            r0.write((byte) this.flag);     // Catch: IOException -> L5
            r0.write(CHexConver.shortToBigBytes(this.id));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }
    }

    public static class Param extends BaseParameter {
        private final int devHandler;
        private final int op;

        public Param(int r1, int r2) {
            this.devHandler = r1;
            this.op = r2;
        }

        public int getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(this.devHandler));     // Catch: IOException -> L5
            r0.write((byte) this.op);     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }
    }

    public static class StopSyncParam extends Param {
        private final int reason;

        public StopSyncParam(int r2, int r3) {
            super(r2, 1);
            this.reason = r3;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationNoResponseCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: Exception -> L5
            r0.write((byte) this.reason);     // Catch: Exception -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        public int getReason() {
            return this.reason;
        }
    }

    public NFCOperationNoResponseCmd(Param r3) {
        super(164, NFCOperationNoResponseCmd.class.getSimpleName(), r3);
    }
}
