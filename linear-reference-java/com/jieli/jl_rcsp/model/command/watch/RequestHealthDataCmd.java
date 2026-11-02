package com.jieli.jl_rcsp.model.command.watch;

import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class RequestHealthDataCmd extends CommandBase<Param, Response> {

    public static class Param extends BaseParameter implements IDataOp {
        public int mask;
        public byte[] subMask;
        public byte version;

        public Param(byte[] r5) throws ParseDataException {
            int r0 = parse(r5);
            if (r0 < 0) goto L6;
            return;
        L6:
            throw new ParseDataException(1, "Failure to parse data. size = " + r0, r5);
        }

        private void checkMaskAndSubMaskRelation(int r5, byte[] r6) {
            int r0 = 0;
            int r1 = 0;
        L4:
            if (r0 >= 32) goto L9;
            if (CHexConver.getBitByPosition(r5, r0) != 1) goto L8;
            r1 = r1 + 1;
        L8:
            r0 = r0 + 1;
            goto L4
        L9:
            if (r1 == 0) goto L16;
            if (r6.length != r1) goto L14;
            return;
        L14:
            throw new IllegalArgumentException("mask set count not equal to subMask length");
        L16:
            throw new IllegalArgumentException("mask must not be 0x00");
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return toData();
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r5) {
            this.subMask = new byte[0];
            if (r5 != null) goto L5;
        L16:
            return 0;
        L5:
            if (r5.length == 0) goto L16;
            if (r5.length >= 5) goto L11;
            return -1;
        L11:
            this.mask = CHexConver.bytesToInt(r5, 0, 4);
            this.version = r5[4];
            if (5 >= r5.length) goto L15;
            int r1 = r5.length - 5;
            byte[] r3 = new byte[r1];
            this.subMask = r3;
            System.arraycopy(r5, 5, r3, 0, r1);
            return this.subMask.length + 5;
        L15:
            return 5;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            byte[] r0 = new byte[this.subMask.length + 5];
            byte[] r2 = CHexConver.intToBigBytes(this.mask);
            System.arraycopy(r2, 0, r0, 0, r2.length);
            r0[4] = this.version;
            byte[] r3 = this.subMask;
            System.arraycopy(r3, 0, r0, 5, r3.length);
            return r0;
        }

        public Param(int r1, byte r2, byte... r3) {
            checkMaskAndSubMaskRelation(r1, r3);
            this.mask = r1;
            this.version = r2;
            this.subMask = r3;
        }
    }

    public static class Response extends CommonResponse implements IDataOp {
        public byte[] data;
        public byte flag;
        public byte ret;

        public Response(byte[] r4) throws ParseDataException {
            int r0 = parse(r4);
            if (r0 < 0) goto L7;
            setRawData(r4);
            return;
        L7:
            throw new ParseDataException(1, "Failed to parse data. size = " + r0, this.data);
        }

        public byte[] getData() {
            return this.data;
        }

        public byte getFlag() {
            return this.flag;
        }

        public byte getRet() {
            return this.ret;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r5) {
            this.data = new byte[0];
            if (r5 != null) goto L5;
        L16:
            return 0;
        L5:
            if (r5.length == 0) goto L16;
            if (r5.length >= 2) goto L11;
            return -1;
        L11:
            this.ret = r5[0];
            this.flag = r5[1];
            if (2 >= r5.length) goto L15;
            int r1 = r5.length - 2;
            byte[] r3 = new byte[r1];
            this.data = r3;
            System.arraycopy(r5, 2, r3, 0, r1);
            return this.data.length + 2;
        L15:
            return 2;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.ret);
            r0.write(this.flag);
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

        public Response(byte r1, byte r2, byte[] r3) {
            this.ret = r1;
            this.flag = r2;
            this.data = r3;
        }
    }

    public RequestHealthDataCmd(Param r2) {
        this(2, r2);
    }

    public RequestHealthDataCmd(int r3, Param r4) {
        super(160, RequestHealthDataCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
