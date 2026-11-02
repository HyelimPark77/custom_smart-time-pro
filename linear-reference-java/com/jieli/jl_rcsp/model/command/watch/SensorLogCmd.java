package com.jieli.jl_rcsp.model.command.watch;

import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParam;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SensorLogCmd extends CommandWithParam<Param> {

    public static class Param extends BaseParameter implements IDataOp {
        public byte[] data;
        private int mask;
        public int type;

        public Param(byte[] r4) throws ParseDataException {
            if (parse(r4) < 0) goto L6;
            return;
        L6:
            throw new ParseDataException(1, "Failed to parse data.", r4);
        }

        public int getMask() {
            return this.mask;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return toData();
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r5) {
            this.data = new byte[0];
            if (r5 != null) goto L5;
        L16:
            return 0;
        L5:
            if (r5.length == 0) goto L16;
            if (r5.length >= 4) goto L11;
            return -1;
        L11:
            this.type = CHexConver.bytesToInt(r5, 0, 4);
            if (r5.length <= 4) goto L15;
            int r1 = r5.length - 4;
            byte[] r3 = new byte[r1];
            this.data = r3;
            System.arraycopy(r5, 4, r3, 0, r1);
        L15:
            return r5.length;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            return CHexConver.intToBigBytes(this.mask);
        }

        public Param(int r1) {
            this.mask = r1;
        }
    }

    public SensorLogCmd(Param r3) {
        super(163, SensorLogCmd.class.getSimpleName(), r3);
    }
}
