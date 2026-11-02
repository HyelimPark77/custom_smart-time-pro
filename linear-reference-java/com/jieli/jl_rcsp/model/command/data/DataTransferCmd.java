package com.jieli.jl_rcsp.model.command.data;

import androidx.compose.ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IParamBase;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class DataTransferCmd extends CommandBase<Param, Response> {

    public static class CancelTransferParam extends Param {
        private int reason;

        public CancelTransferParam(byte[] r1) {
            super(r1);
            this.reason = -1;
            parsePayload(getPayload());
        }

        private void parsePayload(byte[] r2) {
            if (r2 != null) goto L4;
            return;
        L4:
            if (r2.length == 0) goto L9;
            this.reason = CHexConver.byteToInt(r2[0]);
            return;
        }

        public int getReason() {
            return this.reason;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "CancelTransferParam{reason=" + this.reason + i0XO1.IO;
        }

        public CancelTransferParam(int r4) {
            super(2, new byte[]{(byte) r4});
            this.reason = r4;
        }
    }

    public static class CustomReplyParam extends Param {
        private final byte[] customData;

        public CustomReplyParam(byte[] r2) {
            super(new byte[0]);
            this.customData = r2;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return this.customData;
        }
    }

    public static class DataTransferParam extends Param {
        private short crc;
        private byte[] data;
        private boolean isEnd;
        private int len;
        private int offset;
        private int seq;
        private int type;

        public DataTransferParam(byte[] r1) {
            super(r1);
            parsePayload(getPayload());
        }

        private static byte[] getPayload(int r1, boolean r2, int r3, short r4, int r5, byte[] r6) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);
            if (r2 == false) goto L5;
            int r7 = 32768 | r3;
        L19:
            r0.write(CHexConver.int2byte2(r7));     // Catch: Exception -> L15
            r0.write(CHexConver.shortToBigBytes(r4));     // Catch: Exception -> L15
            r0.write(CHexConver.intToBigBytes(r5));     // Catch: Exception -> L15
            if (r6 != null) goto L10;
            int r8 = 0;
        L11:
            r0.write(CHexConver.int2byte2(r8));     // Catch: Exception -> L15
            if (r8 <= 0) goto L18;
            r0.write(r6);     // Catch: Exception -> L15
        L18:
            return r0.toByteArray();
        L10:
            r8 = r6.length;     // Catch: Exception -> L15
        L15:
            e = move-exception;
            e.printStackTrace();
            goto L18
        L5:
            r7 = r3 & LayoutKt.LargeDimension;
            goto L19
        }

        private void parsePayload(byte[] r7) {
            if (r7 != null) goto L4;
            return;
        L4:
            if (r7.length < 11) goto L17;
            this.type = CHexConver.byteToInt(r7[0]);
            boolean r2 = true;
            int r4 = CHexConver.bytesToInt(r7, 1, 2);
            this.seq = r4 & 127;
            if ((r4 >> 15) == 1) goto L10;
            r2 = false;
        L10:
            this.isEnd = r2;
            this.crc = (short) CHexConver.bytesToInt(r7, 3, 2);
            this.offset = CHexConver.bytesToInt(r7, 5, 4);
            int r3 = CHexConver.bytesToInt(r7, 9, 2);
            this.len = r3;
            if (r7.length <= 11) goto L14;
            int r5 = Math.min(r3, r7.length - 11);
            this.len = r5;
            byte[] r6 = new byte[r5];
            this.data = r6;
            System.arraycopy(r7, 11, r6, 0, r5);
            return;
        L14:
            this.len = 0;
            this.data = new byte[0];
            return;
        }

        public short getCrc() {
            return this.crc;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getLen() {
            return this.len;
        }

        public int getOffset() {
            return this.offset;
        }

        public int getSeq() {
            return this.seq;
        }

        public int getType() {
            return this.type;
        }

        public boolean isEnd() {
            return this.isEnd;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "DataTransferParam{op=" + getOp() + ", type=" + this.type + ", isEnd=" + this.isEnd + ", seq=" + this.seq + ", crc=" + this.crc + ", offset=" + this.offset + ", len=" + this.len + ", data=" + CHexConver.byte2HexStr(this.data) + "} ";
        }

        public DataTransferParam(int r3, boolean r4, int r5, short r6, int r7, byte[] r8) {
            super(1, getPayload(r3, r4, r5, r6, r7, r8));
            this.type = r3;
            this.isEnd = r4;
            this.seq = r5;
            this.crc = r6;
            this.offset = r7;
            this.data = r8;
        }
    }

    public static class DataTransferResponse extends Response {
        private boolean isEnd;
        private byte[] message;
        private int result;
        private int seq;
        private int type;

        public DataTransferResponse(byte[] r1) {
            super(r1);
            parseResponseData(getResponse());
        }

        private static byte[] getResponseData(int r1, boolean r2, int r3, int r4, byte[] r5) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);
            if (r2 == false) goto L5;
            int r6 = 32768 | r3;
        L16:
            r0.write(CHexConver.int2byte2(r6));     // Catch: Exception -> L12
            r0.write(r4);     // Catch: Exception -> L12
            if (r5 == null) goto L15;
            if (r5.length <= 0) goto L15;
            r0.write(r5);     // Catch: Exception -> L12
        L15:
            return r0.toByteArray();
        L12:
            e = move-exception;
            e.printStackTrace();
            goto L15
        L5:
            r6 = r3 & LayoutKt.LargeDimension;
            goto L16
        }

        private void parseResponseData(byte[] r6) {
            if (r6 != null) goto L4;
            return;
        L4:
            if (r6.length < 4) goto L17;
            this.type = CHexConver.byteToInt(r6[0]);
            boolean r3 = true;
            int r2 = CHexConver.bytesToInt(r6, 1, 2);
            this.seq = r2 & 127;
            if ((r2 >> 15) == 1) goto L10;
            r3 = false;
        L10:
            this.isEnd = r3;
            this.result = CHexConver.byteToInt(r6[3]);
            if (r6.length <= 4) goto L14;
            int r4 = r6.length - 4;
            byte[] r5 = new byte[r4];
            this.message = r5;
            System.arraycopy(r6, 4, r5, 0, r4);
            return;
        L14:
            this.message = new byte[0];
            return;
        }

        public byte[] getMessage() {
            return this.message;
        }

        public int getResult() {
            return this.result;
        }

        public int getSeq() {
            return this.seq;
        }

        public int getType() {
            return this.type;
        }

        public boolean isEnd() {
            return this.isEnd;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.Response, com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "DataTransferResponse{type=" + this.type + ", isEnd=" + this.isEnd + ", seq=" + this.seq + ", result=" + this.result + ", message=" + CHexConver.byte2HexStr(this.message) + "} " + super.toString();
        }

        public DataTransferResponse(int r1, boolean r2, int r3, int r4, byte[] r5) {
            super(1, getResponseData(r1, r2, r3, r4, r5));
        }
    }

    public static class Param extends BaseParameter {
        private int op;
        private byte[] payload;

        public Param(byte[] r1) {
            parseData(r1);
        }

        public int getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.op);
            byte[] r1 = this.payload;
            if (r1 == null) goto L11;
            if (r1.length <= 0) goto L11;
            r0.write(r1);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            e.printStackTrace();
        L11:
            return r0.toByteArray();
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public byte[] getPayload() {
            return this.payload;
        }

        public void parseData(byte[] r5) {
            if (r5 != null) goto L4;
            return;
        L4:
            if (r5.length < 1) goto L13;
            this.op = CHexConver.byteToInt(r5[0]);
            if (r5.length <= 1) goto L10;
            int r2 = r5.length - 1;
            byte[] r3 = new byte[r2];
            this.payload = r3;
            System.arraycopy(r5, 1, r3, 0, r2);
            return;
        L10:
            this.payload = new byte[0];
            return;
        }

        public Param(int r1, byte[] r2) {
            this.op = r1;
            this.payload = r2;
        }
    }

    public static class ReadDataParam extends TransferParam {
        private int receiveDataLimit;
        private int sendDataLimit;

        public ReadDataParam(byte[] r1) {
            super(r1);
            parseParams(getParam());
        }

        public static byte[] getParams(int r1, int r2) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.int2byte2(r1));     // Catch: Exception -> L5
            r0.write(CHexConver.int2byte2(r2));     // Catch: Exception -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        private void parseParams(byte[] r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            if (r3.length < 4) goto L9;
            this.sendDataLimit = CHexConver.bytesToInt(r3, 0, 2);
            this.receiveDataLimit = CHexConver.bytesToInt(r3, 2, 2);
            return;
        }

        public int getReceiveDataLimit() {
            return this.receiveDataLimit;
        }

        public int getSendDataLimit() {
            return this.sendDataLimit;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.TransferParam, com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "ReadDataParam{sendDataLimit=" + this.sendDataLimit + ", receiveDataLimit=" + this.receiveDataLimit + "} " + super.toString();
        }

        public ReadDataParam(int r3, int r4, int r5, int r6) {
            super(0, r3, r4, getParams(r5, r6));
            this.sendDataLimit = r5;
            this.receiveDataLimit = r6;
        }
    }

    public static class ReadDataResponse extends TransferParamResponse {
        private short crc;
        private int dataLen;
        private int receiveDataLimit;
        private int result;
        private int sendDataLimit;

        public ReadDataResponse(byte[] r1) {
            super(r1);
            parseResponseData(getData());
        }

        private static byte[] getResponseData(int r1, int r2, short r3, int r4, int r5) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);
            r0.write(CHexConver.intToBigBytes(r2));     // Catch: Exception -> L5
            r0.write(CHexConver.shortToBigBytes(r3));     // Catch: Exception -> L5
            r0.write(CHexConver.int2byte2(r4));     // Catch: Exception -> L5
            r0.write(CHexConver.int2byte2(r5));     // Catch: Exception -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        private void parseResponseData(byte[] r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            if (r3.length < 11) goto L9;
            this.result = CHexConver.byteToInt(r3[0]);
            this.dataLen = CHexConver.bytesToInt(r3, 1, 4);
            this.crc = (short) CHexConver.bytesToInt(r3, 5, 2);
            this.sendDataLimit = CHexConver.bytesToInt(r3, 7, 2);
            this.receiveDataLimit = CHexConver.bytesToInt(r3, 9, 2);
            return;
        }

        public short getCrc() {
            return this.crc;
        }

        public int getDataLen() {
            return this.dataLen;
        }

        public int getReceiveDataLimit() {
            return this.receiveDataLimit;
        }

        public int getResult() {
            return this.result;
        }

        public int getSendDataLimit() {
            return this.sendDataLimit;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.TransferParamResponse, com.jieli.jl_rcsp.model.command.data.DataTransferCmd.Response, com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "ReadDataResponse{result=" + this.result + ", dataLen=" + this.dataLen + ", crc=" + this.crc + ", sendDataLimit=" + this.sendDataLimit + ", receiveDataLimit=" + this.receiveDataLimit + "} " + super.toString();
        }

        public ReadDataResponse(int r3, int r4, int r5, int r6, short r7, int r8, int r9) {
            super(0, r3, r4, getResponseData(r5, r6, r7, r8, r9));
            this.result = r5;
            this.dataLen = r6;
            this.crc = r7;
            this.sendDataLimit = r8;
            this.receiveDataLimit = r9;
        }
    }

    public static class Response extends CommonResponse implements IParamBase {
        private int op;
        private byte[] response;

        public Response(byte[] r1) {
            parseData(r1);
        }

        private void parseData(byte[] r5) {
            if (r5 != null) goto L4;
            return;
        L4:
            if (r5.length < 1) goto L13;
            this.op = CHexConver.byteToInt(r5[0]);
            if (r5.length <= 1) goto L10;
            int r2 = r5.length - 1;
            byte[] r3 = new byte[r2];
            this.response = r3;
            System.arraycopy(r5, 1, r3, 0, r2);
            return;
        L10:
            this.response = new byte[0];
            return;
        }

        public int getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.op);
            byte[] r1 = this.response;
            if (r1 == null) goto L11;
            if (r1.length <= 0) goto L11;
            r0.write(r1);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            e.printStackTrace();
        L11:
            return r0.toByteArray();
        }

        public byte[] getResponse() {
            return this.response;
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "Response{op=" + this.op + ", response=" + CHexConver.byte2HexStr(this.response) + "} ";
        }

        public Response(int r1, byte[] r2) {
            this.op = r1;
            this.response = r2;
        }
    }

    public static class SendDataParam extends TransferParam {
        private short crc;
        private int dataLen;
        private int receiveDataLimit;
        private int sendDataLimit;

        public SendDataParam(byte[] r1) {
            super(r1);
            parseParams(getParam());
        }

        private static byte[] getParams(int r1, short r2, int r3, int r4) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(r1));     // Catch: IOException -> L5
            r0.write(CHexConver.shortToBigBytes(r2));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2(r3));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2(r4));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        private void parseParams(byte[] r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            if (r3.length < 10) goto L9;
            this.dataLen = CHexConver.bytesToInt(r3, 0, 4);
            this.crc = (short) CHexConver.bytesToInt(r3, 4, 2);
            this.sendDataLimit = CHexConver.bytesToInt(r3, 6, 2);
            this.receiveDataLimit = CHexConver.bytesToInt(r3, 8, 2);
            return;
        }

        public short getCrc() {
            return this.crc;
        }

        public int getDataLen() {
            return this.dataLen;
        }

        public int getReceiveDataLimit() {
            return this.receiveDataLimit;
        }

        public int getSendDataLimit() {
            return this.sendDataLimit;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.TransferParam, com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "SendDataParam{dataLen=" + this.dataLen + ", crc=" + this.crc + ", sendDataLimit=" + this.sendDataLimit + ", receiveDataLimit=" + this.receiveDataLimit + "} " + super.toString();
        }

        public SendDataParam(int r3, int r4, int r5, short r6, int r7, int r8) {
            super(1, r3, r4, getParams(r5, r6, r7, r8));
            this.dataLen = r5;
            this.crc = r6;
            this.sendDataLimit = r7;
            this.receiveDataLimit = r8;
        }
    }

    public static class SendDataResponse extends TransferParamResponse {
        private int receiveDataLimit;
        private int result;
        private int sendDataLimit;

        public SendDataResponse(byte[] r1) {
            super(r1);
            parseResponseData(getData());
        }

        private static byte[] getResponseData(int r1, int r2, int r3) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);
            r0.write(CHexConver.int2byte2(r2));     // Catch: Exception -> L5
            r0.write(CHexConver.int2byte2(r3));     // Catch: Exception -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        private void parseResponseData(byte[] r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            if (r3.length < 5) goto L9;
            this.result = CHexConver.byteToInt(r3[0]);
            this.sendDataLimit = CHexConver.bytesToInt(r3, 1, 2);
            this.receiveDataLimit = CHexConver.bytesToInt(r3, 3, 2);
            return;
        }

        public int getReceiveDataLimit() {
            return this.receiveDataLimit;
        }

        public int getResult() {
            return this.result;
        }

        public int getSendDataLimit() {
            return this.sendDataLimit;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.TransferParamResponse, com.jieli.jl_rcsp.model.command.data.DataTransferCmd.Response, com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "SendDataResponse{result=" + this.result + ", sendDataLimit=" + this.sendDataLimit + ", receiveDataLimit=" + this.receiveDataLimit + "} " + super.toString();
        }

        public SendDataResponse(int r2, int r3, int r4, int r5, int r6, int r7) {
            super(r2, r3, r4, getResponseData(r5, r6, r7));
            this.result = r5;
            this.sendDataLimit = r6;
            this.receiveDataLimit = r7;
        }
    }

    public static class TransferParam extends Param {
        private byte[] param;
        private int type;
        private int version;
        private int way;

        public TransferParam(byte[] r1) {
            super(r1);
            parsePayload(getPayload());
        }

        private static byte[] getPayload(int r1, int r2, int r3, byte[] r4) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);
            r0.write(r2);
            r0.write(r3);
            if (r4 == null) goto L11;
            if (r4.length <= 0) goto L11;
            r0.write(r4);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            e.printStackTrace();
        L11:
            return r0.toByteArray();
        }

        private void parsePayload(byte[] r5) {
            if (r5 != null) goto L4;
            return;
        L4:
            if (r5.length < 3) goto L13;
            this.way = CHexConver.byteToInt(r5[0]);
            this.type = CHexConver.byteToInt(r5[1]);
            this.version = CHexConver.byteToInt(r5[2]);
            if (r5.length <= 3) goto L10;
            int r2 = r5.length - 3;
            byte[] r3 = new byte[r2];
            this.param = r3;
            System.arraycopy(r5, 3, r3, 0, r2);
            return;
        L10:
            this.param = new byte[0];
            return;
        }

        public byte[] getParam() {
            return this.param;
        }

        public int getType() {
            return this.type;
        }

        public int getVersion() {
            return this.version;
        }

        public int getWay() {
            return this.way;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "TransferParam{op=" + getOp() + ", way=" + this.way + ", type=" + this.type + ", version=" + this.version + ", param=" + CHexConver.byte2HexStr(this.param) + "} ";
        }

        public TransferParam(int r3, int r4, int r5, byte[] r6) {
            super(0, getPayload(r3, r4, r5, r6));
            this.way = r3;
            this.type = r4;
            this.version = r5;
            this.param = r6;
        }
    }

    public static class TransferParamResponse extends Response {
        private byte[] data;
        private int type;
        private int version;
        private int way;

        public TransferParamResponse(byte[] r1) {
            super(r1);
            parseResponseData(getResponse());
        }

        private static byte[] getResponseData(int r1, int r2, int r3, byte[] r4) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);
            r0.write(r2);
            r0.write(r3);
            if (r4 == null) goto L11;
            if (r4.length <= 0) goto L11;
            r0.write(r4);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            e.printStackTrace();
        L11:
            return r0.toByteArray();
        }

        private void parseResponseData(byte[] r5) {
            if (r5 != null) goto L4;
            return;
        L4:
            if (r5.length < 3) goto L13;
            this.way = CHexConver.byteToInt(r5[0]);
            this.type = CHexConver.byteToInt(r5[1]);
            this.version = CHexConver.byteToInt(r5[2]);
            if (r5.length <= 3) goto L10;
            int r2 = r5.length - 3;
            byte[] r3 = new byte[r2];
            this.data = r3;
            System.arraycopy(r5, 3, r3, 0, r2);
            return;
        L10:
            this.data = new byte[0];
            return;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getType() {
            return this.type;
        }

        public int getVersion() {
            return this.version;
        }

        public int getWay() {
            return this.way;
        }

        @Override // com.jieli.jl_rcsp.model.command.data.DataTransferCmd.Response, com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "TransferParamResponse{op=" + getOp() + ", way=" + this.way + ", type=" + this.type + ", version=" + this.version + ", data=" + CHexConver.byte2HexStr(this.data) + "} ";
        }

        public TransferParamResponse(int r3, int r4, int r5, byte[] r6) {
            super(0, getResponseData(r3, r4, r5, r6));
            this.way = r3;
            this.type = r4;
            this.version = r5;
            this.data = r6;
        }
    }

    public DataTransferCmd(Param r2) {
        this(2, r2);
    }

    public DataTransferCmd(int r3, Param r4) {
        super(48, DataTransferCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
