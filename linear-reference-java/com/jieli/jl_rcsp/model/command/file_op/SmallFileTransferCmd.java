package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SmallFileTransferCmd extends CommandWithParamAndResponse<Param, Response> {
    public static final byte FLAG_FIRST_PACKET = 1;
    public static final byte OP_ADD_FILE = 2;
    public static final byte OP_DELETE_FILE = 4;
    public static final byte OP_QUERY_BY_TYPE = 0;
    public static final byte OP_READ_FILE = 1;
    public static final byte OP_UPDATE_FILE = 3;
    public static final byte TYPE_BLOOD_OXYGEN = 4;
    public static final byte TYPE_CALL_LOG = 8;
    public static final byte TYPE_CONTACTS = 1;
    public static final byte TYPE_HEART_RATE = 3;
    public static final byte TYPE_MESSAGE_SYNC = 6;
    public static final byte TYPE_SLEEP = 5;
    public static final byte TYPE_SPORTS_RECORD = 2;
    public static final byte TYPE_STEP = 9;
    public static final byte TYPE_WEATHER = 7;

    public static class AddFileParam extends Param {
        public AddFileParam(byte r2, short r3, short r4, byte[] r5, short r6) {
            super((byte) 2, ByteBuffer.allocate(r5.length + 7).put(r2).putShort(r3).putShort(r4).put(CHexConver.shortToBigBytes(r6)).put(r5).array());
        }
    }

    public static class AddFileResponse extends ResultResponse {
        public short id;

        public AddFileResponse(byte[] r3) {
            super(r3[0]);
            if (r3.length < 3) goto L6;
            this.id = CHexConver.bytesToShort(r3[1], r3[2]);
            return;
        }
    }

    public static class DeleteFileParam extends Param {
        public DeleteFileParam(byte r2, short r3) {
            super((byte) 4, ByteBuffer.allocate(3).put(r2).putShort(r3).array());
        }
    }

    public static class Param extends BaseParameter {
        public byte[] data;
        public byte op;

        public Param(byte r1, byte[] r2) {
            this.op = r1;
            this.data = r2;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return ByteBuffer.allocate(this.data.length + 1).put(this.op).put(this.data).array();
        }
    }

    public static class QueryParam extends Param {
        public QueryParam(byte r3) {
            super((byte) 0, new byte[]{r3});
        }
    }

    public static class QueryResponse extends Response {
        private final List<File> files;
        private final byte version;

        public static class File {
            public short id;
            public int size;
            public byte type;

            public File(byte r1, short r2, int r3) {
                this.type = r1;
                this.id = r2;
                this.size = r3;
            }
        }

        public QueryResponse(byte r5, byte[] r6) {
            this.version = r6[0];
            this.files = new ArrayList();
            int r0 = 1;
        L4:
            if (r0 >= r6.length) goto L8;
            if (this.version != 0) goto L4;
            File r3 = new File(r5, CHexConver.bytesToShort(r6[r0], r6[r0 + 1]), CHexConver.bytesToInt(r6[r0 + 2], r6[r0 + 3]));
            this.files.add(r3);
            r0 = r0 + 4;
            goto L4
        }

        public List<File> getFiles() {
            return this.files;
        }
    }

    public static class ReadFileParam extends Param {
        public ReadFileParam(byte r2, short r3, short r4, short r5, byte r6) {
            super((byte) 1, ByteBuffer.allocate(8).put(r2).putShort(r3).putShort(r4).putShort(r5).put(r6).array());
        }
    }

    public static class ReadFileResponse extends Response {
        public short crc;
        public byte[] fileData;
        public byte ret;

        public ReadFileResponse(byte[] r5) {
            byte r1 = r5[0];
            this.ret = r1;
            if (r1 != 0) goto L6;
            this.fileData = new byte[r5.length - 3];
            this.crc = CHexConver.bytesToShort(r5[1], r5[2]);
            byte[] r2 = this.fileData;
            System.arraycopy(r5, 3, r2, 0, r2.length);
            return;
        }
    }

    public static class Response extends CommonResponse {
        public Response() {
        }
    }

    public static class ResultResponse extends Response {
        public byte ret;

        public ResultResponse(byte r1) {
            this.ret = r1;
        }
    }

    public static class UpdateFileParam extends Param {
        public UpdateFileParam(byte r2, short r3, short r4, short r5, byte[] r6, short r7) {
            super((byte) 3, ByteBuffer.allocate(r6.length + 9).put(r2).putShort(r3).putShort(r4).putShort(r5).putShort(r7).put(r6).array());
        }
    }

    public SmallFileTransferCmd(Param r3) {
        super(40, SmallFileTransferCmd.class.getSimpleName(), r3);
    }
}
