package com.jieli.jl_rcsp.model.command.nfc;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class NFCOperationCmd extends CommandWithParamAndResponse<Param, Response> {

    public static class DefaultNfcParam extends Param {
        private final int flag;
        private final byte[] value;

        public DefaultNfcParam(int r2, int r3, byte[] r4) {
            super(r2, 5);
            this.flag = r3;
            this.value = r4;
        }

        public int getFlag() {
            return this.flag;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: IOException -> L9
            r0.write((byte) this.flag);     // Catch: IOException -> L9
            byte[] r1 = this.value;     // Catch: IOException -> L9
            if (r1 == null) goto L12;
            if (r1.length <= 0) goto L12;
            r0.write(r1);     // Catch: IOException -> L9
        L12:
            return r0.toByteArray();
        L9:
            e = move-exception;
            e.printStackTrace();
            goto L12
        }

        public byte[] getValue() {
            return this.value;
        }
    }

    public static class DeleteMsgParam extends Param {
        private final short id;

        public DeleteMsgParam(int r2, short r3) {
            super(r2, 3);
            this.id = r3;
        }

        public short getId() {
            return this.id;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: IOException -> L5
            r0.write(CHexConver.shortToBigBytes(this.id));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }
    }

    public static class GetDefaultNfcParam extends DefaultNfcParam {
        public GetDefaultNfcParam(int r3) {
            super(r3, 0, null);
        }
    }

    public static class GetDefaultNfcResponse extends Response {
        private final short id;

        public GetDefaultNfcResponse(int r1, short r2) {
            super(r1);
            this.id = r2;
        }

        public short getId() {
            return this.id;
        }
    }

    public static class InsertFileEndParam extends Param {
        private final String fileName;

        public InsertFileEndParam(int r2, String r3) {
            super(r2, 7);
            this.fileName = r3;
        }

        public String getFileName() {
            return this.fileName;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: IOException -> L7
            String r1 = this.fileName;     // Catch: IOException -> L7
            if (r1 == null) goto L10;
            r0.write(r1.getBytes());     // Catch: IOException -> L7
        L10:
            return r0.toByteArray();
        L7:
            e = move-exception;
            e.printStackTrace();
            goto L10
        }
    }

    public static class InsertFileParam extends Param {
        private final String fileName;
        private final int fileSize;

        public InsertFileParam(int r2, int r3, String r4) {
            super(r2, 6);
            this.fileSize = r3;
            this.fileName = r4;
        }

        public String getFileName() {
            return this.fileName;
        }

        public int getFileSize() {
            return this.fileSize;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: IOException -> L7
            r0.write(CHexConver.intToBigBytes(this.fileSize));     // Catch: IOException -> L7
            String r1 = this.fileName;     // Catch: IOException -> L7
            if (r1 == null) goto L10;
            r0.write(r1.getBytes());     // Catch: IOException -> L7
        L10:
            return r0.toByteArray();
        L7:
            e = move-exception;
            e.printStackTrace();
            goto L10
        }
    }

    public static class ModifyMsgParam extends Param {
        private final short id;
        private final int mask;
        private final byte[] value;

        public ModifyMsgParam(int r2, short r3, int r4, byte[] r5) {
            super(r2, 2);
            this.id = r3;
            this.mask = r4;
            this.value = r5;
        }

        public short getId() {
            return this.id;
        }

        public int getMask() {
            return this.mask;
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(super.getParamData());     // Catch: IOException -> L9
            r0.write(CHexConver.shortToBigBytes(this.id));     // Catch: IOException -> L9
            r0.write(CHexConver.intToBigBytes(this.mask));     // Catch: IOException -> L9
            byte[] r1 = this.value;     // Catch: IOException -> L9
            if (r1 == null) goto L12;
            if (r1.length <= 0) goto L12;
            r0.write(r1);     // Catch: IOException -> L9
        L12:
            return r0.toByteArray();
        L9:
            e = move-exception;
            e.printStackTrace();
            goto L12
        }

        public byte[] getValue() {
            return this.value;
        }
    }

    public static class NotifyNfcParam extends Param {
        public NotifyNfcParam(int r2) {
            super(r2, 4);
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return super.getParamData();
        }
    }

    public static class Param extends BaseParameter {
        private final int devHandler;
        private final int op;

        public Param(int r1, int r2) {
            this.devHandler = r1;
            this.op = r2;
        }

        public int getDevHandler() {
            return this.devHandler;
        }

        public int getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(this.devHandler));     // Catch: IOException -> L5
            r0.write((byte) getOp());     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }
    }

    public static class Response extends CommonResponse {
        private final int result;

        public Response(int r1) {
            this.result = r1;
        }

        public int getResult() {
            return this.result;
        }
    }

    public static class SetDefaultNfcParam extends DefaultNfcParam {
        private final short id;

        public SetDefaultNfcParam(int r3, short r4) {
            super(r3, 1, CHexConver.shortToBigBytes(r4));
            this.id = r4;
        }

        public short getId() {
            return this.id;
        }
    }

    public static class StartSyncParam extends Param {
        public StartSyncParam(int r2) {
            super(r2, 0);
        }

        @Override // com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return super.getParamData();
        }
    }

    public NFCOperationCmd(Param r3) {
        super(164, NFCOperationCmd.class.getSimpleName(), r3);
    }
}
