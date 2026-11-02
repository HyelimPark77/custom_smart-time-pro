package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceExtendParamCmd extends CommandWithParamAndResponse<Param, Response> {
    public static final byte OP_DELETE_FILE = 1;
    public static final byte OP_FILE_TRANSFER = 0;
    public static final byte OP_READ_FILE = 2;

    public static class DeleteFileParam extends DevParam {
        public DeleteFileParam(byte[] r1) {
            super(r1);
        }

        public DeleteFileParam(int r2) {
            super((byte) 1, r2);
        }
    }

    public static class DevParam extends Param {
        private int dev;

        public DevParam(byte[] r1) {
            super(r1);
        }

        public int getDev() {
            return this.dev;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            int r0 = super.parse(r4);
            if (r0 == 0) goto L9;
            int r1 = r0 + 4;
            if (r1 > r4.length) goto L9;
            this.dev = CHexConver.bytesToInt(r4, r0, 4);
            return r1;
        L9:
            return r0;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.toData());     // Catch: IOException -> L5
            r0.write(CHexConver.intToBigBytes(this.dev));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "DevParam{op=" + getOp() + ", dev=" + this.dev + "} ";
        }

        public DevParam(byte r1, int r2) {
            super(r1);
            this.dev = r2;
        }
    }

    public static class FileTransferParam extends DevParam {
        private boolean hasCrc16;

        public FileTransferParam(byte[] r1) {
            super(r1);
        }

        public boolean isHasCrc16() {
            return this.hasCrc16;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.DevParam, com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            int r0 = super.parse(r4);
            if (r0 == 0) goto L13;
            int r1 = r0 + 1;
            if (r1 > r4.length) goto L13;
            int r5 = CHexConver.byteToInt(r4[r0]);
            boolean r2 = true;
            if (r5 == 1) goto L11;
            r2 = false;
        L11:
            this.hasCrc16 = r2;
            return r1;
        L13:
            return r0;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.DevParam, com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.toData());     // Catch: IOException -> L5
            r0.write(this.hasCrc16 ? 1 : 0);     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.DevParam, com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "FileTransferParam{hasCrc16=" + this.hasCrc16 + ", dev=" + getDev() + ", op=" + getOp() + "} ";
        }

        public FileTransferParam(int r2, boolean r3) {
            super((byte) 0, r2);
            this.hasCrc16 = r3;
        }
    }

    public static class FileTransferResponse extends Response {
        public boolean hasCrc16;

        public FileTransferResponse(byte[] r1) {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Response, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            int r0 = super.parse(r4);
            if (r0 == 0) goto L13;
            int r1 = r0 + 1;
            if (r1 > r4.length) goto L13;
            int r5 = CHexConver.byteToInt(r4[r0]);
            boolean r2 = true;
            if (r5 == 1) goto L11;
            r2 = false;
        L11:
            this.hasCrc16 = r2;
            return r1;
        L13:
            return r0;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd.Response, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.toData());     // Catch: IOException -> L5
            r0.write(this.hasCrc16 ? 1 : 0);     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "FileTransferResponse{hasCrc16=" + this.hasCrc16 + "} ";
        }

        public FileTransferResponse(boolean r2) {
            super((byte) 0);
            this.hasCrc16 = r2;
        }
    }

    public static class Param extends BaseParameter implements IDataOp {
        private byte op;

        public Param(byte[] r1) {
            parse(r1);
        }

        public byte getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return toData();
        }

        public int parse(byte[] r3) {
            if (r3 != null) goto L5;
        L9:
            return 0;
        L5:
            if (r3.length == 0) goto L9;
            this.op = r3[0];
            return 1;
        }

        public byte[] toData() {
            return new byte[]{this.op};
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "Param{op=" + this.op + "} ";
        }

        public Param(byte r1) {
            this.op = r1;
        }
    }

    public static class ReadFileParam extends DevParam {
        public ReadFileParam(byte[] r1) {
            super(r1);
        }

        public ReadFileParam(int r2) {
            super((byte) 2, r2);
        }
    }

    public static class Response extends CommonResponse implements IDataOp {
        private byte op;

        public Response(byte[] r1) {
            parse(r1);
        }

        public byte getOp() {
            return this.op;
        }

        public int parse(byte[] r3) {
            if (r3 != null) goto L5;
        L9:
            return 0;
        L5:
            if (r3.length == 0) goto L9;
            this.op = r3[0];
            return 1;
        }

        public byte[] toData() {
            return new byte[]{this.op};
        }

        public Response(byte r1) {
            this.op = r1;
        }
    }

    public DeviceExtendParamCmd(Param r3) {
        super(39, DeviceExtendParamCmd.class.getSimpleName(), r3);
    }
}
