package com.jieli.jl_rcsp.model.command;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadErrorMsgCmd extends CommandWithParamAndResponse<ReadErrorMsgParam, ReadErrorMsgResponse> {

    public static class ReadErrorMsgParam extends BaseParameter {
        public static final int READ_START = 0;
        public static final int READ_STOP = 1;
        private int op;

        public ReadErrorMsgParam() {
        }

        public int getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{CHexConver.intToByte(this.op)};
        }

        public void parseData(byte[] r2) {
            if (r2 != null) goto L4;
            return;
        L4:
            if (r2.length <= 0) goto L9;
            setOp(CHexConver.byteToInt(r2[0]));
            return;
        }

        public void setOp(int r1) {
            this.op = r1;
        }
    }

    public static class ReadErrorMsgResponse extends CommonResponse {
        private short crc;
        private int size;

        public ReadErrorMsgResponse() {
        }

        public short getCrc() {
            return this.crc;
        }

        public int getSize() {
            return this.size;
        }

        public void parseData(byte[] r4) {
            if (r4 != null) goto L4;
            return;
        L4:
            if (r4.length < 4) goto L12;
            setSize(CHexConver.bytesToInt(r4, 0, 4));
            if (6 > r4.length) goto L13;
            setCrc(CHexConver.bytesToShort(r4[4], r4[5]));
            return;
        L13:
            return;
        }

        public void setCrc(short r1) {
            this.crc = r1;
        }

        public void setSize(int r1) {
            this.size = r1;
        }
    }

    public static class ResponseReadResult extends ReadErrorMsgParam {
        private short crc;
        private int size;

        public ResponseReadResult() {
        }

        public short getCrc() {
            return this.crc;
        }

        @Override // com.jieli.jl_rcsp.model.command.ReadErrorMsgCmd.ReadErrorMsgParam, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(this.size));     // Catch: IOException -> L5
            r0.write(CHexConver.shortToBigBytes(this.crc));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        public int getSize() {
            return this.size;
        }

        public void setCrc(short r1) {
            this.crc = r1;
        }

        public void setSize(int r1) {
            this.size = r1;
        }
    }

    public ReadErrorMsgCmd(ReadErrorMsgParam r3) {
        super(41, ReadErrorMsgCmd.class.getSimpleName(), r3);
    }
}
