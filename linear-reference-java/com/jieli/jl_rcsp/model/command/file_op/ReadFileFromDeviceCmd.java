package com.jieli.jl_rcsp.model.command.file_op;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileFromDeviceCmd extends CommandWithParamAndResponse<Param, Response> {

    public static class CancelParam extends Param {
        public byte reason;

        public CancelParam(byte r2) {
            super((byte) -127);
            this.reason = r2;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{this.op, this.reason};
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "CancelParam{op=" + this.op + ", reason=" + this.reason + i0XO1.IO;
        }
    }

    public static class Param extends BaseParameter {
        public static final byte OP_CANCEL = -127;
        public static final byte OP_START_WITH_CLUSTER = 1;
        public static final byte OP_START_WITH_DEV_AND_NAME = 2;
        public static final byte OP_START_WITH_NAME = 0;
        public static final byte OP_STOP = -128;
        public static final byte OP_UNKNOWN = -1;
        public byte op;

        public Param(byte r1) {
            this.op = r1;
        }

        public static byte[] getNameData(String r3, boolean r4) {
            if (r4 == false) goto L4;
            byte[] r5 = "\\U".getBytes();
            byte[] r6 = r3.getBytes(StandardCharsets.UTF_16LE);
            byte[] r0 = new byte[(r6.length + r5.length) + 2];
            System.arraycopy(r5, 0, r0, 0, r5.length);
            System.arraycopy(r6, 0, r0, r5.length, r6.length);
            return r0;
        L4:
            return r3.getBytes(Charset.forName("gbk"));
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{this.op};
        }
    }

    public static class Response extends CommonResponse {
        public Response() {
        }
    }

    public static class StartResponse extends Response {
        public int size;

        public StartResponse(int r1) {
            this.size = r1;
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "StartResponse{size=" + this.size + i0XO1.IO;
        }
    }

    public static class StartWithClusterParam extends Param {
        public int cluster;
        public int devHandler;
        public int offset;

        public StartWithClusterParam(int r2, int r3, int r4) {
            super((byte) 1);
            this.offset = r3;
            this.cluster = r4;
            this.devHandler = r2;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            ByteBuffer r0 = ByteBuffer.allocate(13);
            r0.put(this.op).putInt(this.devHandler).putInt(this.offset).putInt(this.cluster);
            return r0.array();
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "StartWithClusterParam{op=" + this.op + ", offset=" + this.offset + ", cluster=" + this.cluster + i0XO1.IO;
        }
    }

    public static class StartWithDevAndNameParam extends Param {
        public int devHandler;
        public String name;
        public int offset;
        public boolean unicode;

        public StartWithDevAndNameParam(int r2, int r3, String r4, boolean r5) {
            super((byte) 2);
            this.offset = r3;
            this.devHandler = r2;
            this.name = r4;
            this.unicode = r5;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            byte[] r0 = Param.getNameData(this.name, this.unicode);
            ByteBuffer r1 = ByteBuffer.allocate(r0.length + 10);
            r1.put(this.op).putInt(this.devHandler).putInt(this.offset).put((byte) r0.length).put(r0);
            return r1.array();
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "StartWithNameParam{offset=" + this.offset + ", name='" + this.name + "', unicode='" + this.unicode + '\'' + i0XO1.IO;
        }
    }

    @Deprecated
    public static class StartWithNameParam extends Param {
        public String name;
        public int offset;
        public boolean unicode;

        public StartWithNameParam(int r2, String r3, boolean r4) {
            super((byte) 0);
            this.offset = r2;
            this.name = r3;
            this.unicode = r4;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            byte[] r0 = Param.getNameData(this.name, this.unicode);
            ByteBuffer r1 = ByteBuffer.allocate(r0.length + 5);
            r1.put(this.op).putInt(this.offset).put(r0);
            return r1.array();
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "StartWithNameParam{offset=" + this.offset + ", name='" + this.name + "', unicode='" + this.unicode + '\'' + i0XO1.IO;
        }
    }

    public static class StopParam extends Param {
        public byte ret;

        public StopParam(byte r2) {
            super((byte) -128);
            this.ret = r2;
        }

        @Override // com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{this.op, this.ret};
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "StopParam{op=" + this.op + ", ret=" + this.ret + i0XO1.IO;
        }
    }

    public ReadFileFromDeviceCmd(Param r3) {
        super(36, ReadFileFromDeviceCmd.class.getCanonicalName(), r3);
    }
}
