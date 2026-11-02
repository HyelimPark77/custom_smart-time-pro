package com.jieli.jl_rcsp.model.command.file_op;

import com.jieli.jl_rcsp.constant.Command;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParam;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyFileStructureChangeCmd extends CommandWithParam<Param> {
    public static final int OP_CREATE = 2;
    public static final int OP_DELETE = 1;
    public static final int OP_MODIFY = 0;

    public static class Param extends BaseParameter implements IDataOp {
        private int cluster;
        private int devHandle;
        private String filePath;
        private int op;

        public Param(int r1, int r2, int r3, String r4) {
            this.devHandle = r1;
            this.op = r2;
            this.cluster = r3;
            this.filePath = r4;
        }

        public int getCluster() {
            return this.cluster;
        }

        public int getDevHandle() {
            return this.devHandle;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public int getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return toData();
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            this.filePath = "";
            if (r4 != null) goto L5;
            return 0;
        L5:
            if (r4.length != 0) goto L8;
            return 0;
        L8:
            if (r4.length >= 11) goto L10;
            return 0;
        L10:
            ByteBuffer r5 = ByteBuffer.wrap(r4);
            r5.order(ByteOrder.BIG_ENDIAN);
            this.devHandle = r5.getInt();
            this.op = CHexConver.byteToInt(r5.get());
            this.cluster = r5.getInt();
            int r0 = Math.min(r5.getShort(), r5.remaining());
            if (r0 > 0) goto L18;
        L16:
            int r1 = r5.position();
            r5.reset();
            return r1;
        L18:
            byte[] r2 = new byte[r0];     // Catch: Exception -> L14
            r5.get(r2);     // Catch: Exception -> L14
            this.filePath = new String(r2);     // Catch: Exception -> L14
        L14:
            e = move-exception;
            e.printStackTrace();
            goto L16
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(this.devHandle));     // Catch: IOException -> L11
            r0.write(this.op);     // Catch: IOException -> L11
            r0.write(CHexConver.intToBigBytes(this.cluster));     // Catch: IOException -> L11
            String r1 = this.filePath;     // Catch: IOException -> L11
            if (r1 != null) goto L6;
            int r2 = 0;
        L7:
            r0.write(CHexConver.int2byte2(r2));     // Catch: IOException -> L11
            if (r2 <= 0) goto L14;
            r0.write(this.filePath.getBytes());     // Catch: IOException -> L11
        L14:
            return r0.toByteArray();
        L6:
            r2 = r1.length();     // Catch: IOException -> L11
        L11:
            e = move-exception;
            e.printStackTrace();
            goto L14
        }

        public Param(byte[] r1) {
            parse(r1);
        }
    }

    public NotifyFileStructureChangeCmd(Param r3) {
        super(Command.CMD_NOTIFY_FILE_STRUCTURE_CHANGE, NotifyFileStructureChangeCmd.class.getSimpleName(), r3);
    }
}
