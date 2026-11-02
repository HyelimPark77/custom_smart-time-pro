package com.jieli.jl_rcsp.model.command;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class AlarmExpandCmd extends CommandWithParamAndResponse<Param, Response> {

    public static class BellArg {
        public final byte[] data;

        public BellArg(byte[] r1) {
            this.data = r1;
        }

        private static byte enable(boolean r0, byte r1) {
            if (r0 == false) goto L4;
            int r2 = r1 | 128;
        L6:
            return (byte) r2;
        L4:
            r2 = r1 & 127;
            goto L6
        }

        public byte getAlarmBellTime() {
            return (byte) (this.data[4] & 31);
        }

        public byte getCount() {
            return (byte) (this.data[2] & 15);
        }

        public byte[] getData() {
            return this.data;
        }

        public byte getIndex() {
            return this.data[1];
        }

        public byte getInterval() {
            return (byte) (this.data[3] & 31);
        }

        public boolean isCanSetAlarmBellTime() {
            if ((this.data[4] & 128) != 128) goto L6;
            return true;
        L6:
            return false;
        }

        public boolean isCanSetCount() {
            if ((this.data[2] & 128) != 128) goto L6;
            return true;
        L6:
            return false;
        }

        public boolean isCanSetInterval() {
            if ((this.data[3] & 128) != 128) goto L6;
            return true;
        L6:
            return false;
        }

        public BellArg setAlarmBellTime(byte r4) {
            byte[] r0 = this.data;
            r0[4] = (byte) (r4 | (r0[4] & 224));
            return this;
        }

        public BellArg setCanSetAlarmTime(boolean r4) {
            byte[] r0 = this.data;
            r0[4] = enable(r4, r0[4]);
            return this;
        }

        public BellArg setCanSetCount(boolean r4) {
            byte[] r0 = this.data;
            r0[2] = enable(r4, r0[2]);
            return this;
        }

        public BellArg setCanSetInterval(boolean r4) {
            byte[] r0 = this.data;
            r0[3] = enable(r4, r0[3]);
            return this;
        }

        public BellArg setCount(byte r4) {
            byte[] r0 = this.data;
            r0[2] = (byte) (r4 | (r0[2] & 3824));
            return this;
        }

        public BellArg setInterval(byte r4) {
            byte[] r0 = this.data;
            r0[3] = (byte) (r4 | (r0[3] & 224));
            return this;
        }

        public String toString() {
            return "BellArgs{data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
        }
    }

    public static class Param extends BaseParameter {
        private final byte[] data;
        private final byte op;

        public Param(byte r1, byte[] r2) {
            this.op = r1;
            this.data = r2;
        }

        public byte[] getData() {
            return this.data;
        }

        public byte getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            byte[] r0 = this.data;
            if (r0 != null) goto L5;
            int r2 = 0;
        L6:
            byte[] r3 = new byte[r2 + 1];
            r3[0] = this.op;
            if (r0 == null) goto L9;
            System.arraycopy(r0, 0, r3, 1, r2);
        L9:
            return r3;
        L5:
            r2 = r0.length;
            goto L6
        }
    }

    public static class ReadRtcBellArgsParams extends Param {
        private final byte mask;

        public ReadRtcBellArgsParams(byte r3) {
            super((byte) 0, new byte[]{r3});
            this.mask = r3;
        }

        public byte getMask() {
            return this.mask;
        }
    }

    public static class ReadRtcBellArgsResponse extends Response {
        private final List<BellArg> bellArgs;

        public ReadRtcBellArgsResponse(byte r1, byte[] r2) {
            super(r1);
            this.bellArgs = fromBytes(r2);
        }

        public static List<BellArg> fromBytes(byte[] r7) {
            ArrayList r0 = new ArrayList();
            if (r7 != null) goto L5;
        L15:
            return r0;
        L5:
            if (r7.length < 1) goto L15;
            int r3 = 0;
        L9:
            if (r3 >= r7.length) goto L15;
            int r4 = r7[r3] + 1;
            int r5 = r4 + r3;
            if (r5 > r7.length) goto L15;
            if (r4 <= 1) goto L15;
            byte[] r6 = new byte[r4];
            System.arraycopy(r7, r3, r6, 0, r4);
            r0.add(new BellArg(r6));
            r3 = r5;
            goto L9
        }

        public List<BellArg> getBellArg() {
            return this.bellArgs;
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            List<BellArg> r1 = this.bellArgs;
            if (r1 == null) goto L9;
            Iterator<BellArg> r2 = r1.iterator();
        L6:
            if (r2.hasNext() == false) goto L9;
            r0.append(r2.next().toString());
            r0.append("\t");
        L9:
            return "ReadRtcBellArgsResponse{bellArgs=" + r0 + i0XO1.IO;
        }
    }

    public static class Response extends CommonResponse {
        private final byte op;

        public Response(byte r1) {
            this.op = r1;
        }

        public byte getOp() {
            return this.op;
        }
    }

    public static class SetRtcBellArgsParams extends Param {
        private final BellArg bellArg;

        public SetRtcBellArgsParams(BellArg r3) {
            super((byte) 1, r3.data);
            this.bellArg = r3;
        }

        public BellArg getBellArg() {
            return this.bellArg;
        }
    }

    public AlarmExpandCmd(Param r3) {
        super(37, AlarmExpandCmd.class.getSimpleName(), r3);
    }
}
