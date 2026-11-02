package com.jieli.jl_rcsp.model.command.watch;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class SportsInfoStatusSyncCmd extends CommandBase<Param, Response> {
    public static final byte OP_APP_STOP_SPORTS = 2;
    public static final byte OP_FIRMWARE_STOP_SPORTS = 3;
    public static final byte OP_PAUSE_SPORTS = 4;
    public static final byte OP_READ_REAL_DATA = 6;
    public static final byte OP_READ_SPORTS_INFO = 0;
    public static final byte OP_RESUME_SPORTS = 5;
    public static final byte OP_SET_REAL_DATA_READ_INTERVAL = 7;
    public static final byte OP_START_SPORTS = 1;
    public static final byte SPORTS_STATUS_RUNNING = 1;
    public static final byte SPORTS_STATUS_STOP = 0;
    public static final byte SPORTS_TYPE_INDOOR = 2;
    public static final byte SPORTS_TYPE_OUTDOOR = 1;

    public static class AppStopSportsParam extends Param {
        public AppStopSportsParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 2;
        }

        public AppStopSportsParam() {
            super((byte) 2, new byte[0]);
        }
    }

    public static class AppStopSportsResponse extends Response {
        public short fileId;
        public int fileSize;
        public int restoreTime;
        public int stopTime;
        public byte[] strengthIntervalTimer;

        public AppStopSportsResponse(byte[] r1) throws ParseDataException {
            super(r1);
        }

        private static byte[] convertResponseData(int r1, int r2, short r3, int r4, byte[] r5) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(r1));     // Catch: IOException -> L9
            r0.write(CHexConver.intToBigBytes(r2));     // Catch: IOException -> L9
            r0.write(CHexConver.shortToBigBytes(r3));     // Catch: IOException -> L9
            r0.write(CHexConver.int2byte2(r4));     // Catch: IOException -> L9
            if (r5 == null) goto L12;
            if (r5.length <= 0) goto L12;
            r0.write(r5);     // Catch: IOException -> L9
        L12:
            return r0.toByteArray();
        L9:
            e = move-exception;
            e.printStackTrace();
            goto L12
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Response
        public int getResponseType() {
            return 2;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Response, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r6) {
            this.strengthIntervalTimer = new byte[0];
            int r7 = super.parse(r6);
            if (r7 > 0) goto L5;
            return 0;
        L5:
            byte[] r1 = getResponseData();
            if (r1 != null) goto L8;
        L17:
            return r7;
        L8:
            if (r1.length == 0) goto L17;
            if (r1.length >= 12) goto L14;
            return -1;
        L14:
            this.stopTime = CHexConver.bytesToInt(r1, 0, 4);
            this.restoreTime = CHexConver.bytesToInt(r1, 4, 4);
            this.fileId = CHexConver.bytesToShort(r1, 8);
            this.fileSize = CHexConver.bytesToInt(r1, 10, 2);
            if (12 >= r1.length) goto L17;
            int r2 = r1.length - 12;
            byte[] r4 = new byte[r2];
            this.strengthIntervalTimer = r4;
            System.arraycopy(r1, 12, r4, 0, r2);
            goto L17
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "AppStopExerciseResponse{stopTime=" + this.stopTime + ", restoreTime=" + this.restoreTime + ", strengthIntervalTimer=" + Arrays.toString(this.strengthIntervalTimer) + i0XO1.IO;
        }

        public AppStopSportsResponse(int r3, int r4, short r5, int r6, byte[] r7) {
            super(2, convertResponseData(r3, r4, r5, r6, r7));
            this.stopTime = r3;
            this.restoreTime = r4;
            this.fileId = r5;
            this.fileSize = r6;
            this.strengthIntervalTimer = r7;
        }
    }

    public static class FirmwareStopSportsParam extends Param {
        public short fileId;
        public int fileSize;
        public int restoreTime;
        public int stopTime;
        public byte[] strengthIntervalTimer;

        public FirmwareStopSportsParam(int r3, int r4, short r5, int r6, byte[] r7) {
            super((byte) 3, convertData(r3, r4, r5, r6, r7));
            this.stopTime = r3;
            this.restoreTime = r4;
            this.fileId = r5;
            this.fileSize = r6;
            this.strengthIntervalTimer = r7;
        }

        private static byte[] convertData(int r1, int r2, short r3, int r4, byte[] r5) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(CHexConver.intToBigBytes(r1));     // Catch: IOException -> L9
            r0.write(CHexConver.intToBigBytes(r2));     // Catch: IOException -> L9
            r0.write(CHexConver.shortToBigBytes(r3));     // Catch: IOException -> L9
            r0.write(CHexConver.int2byte2(r4));     // Catch: IOException -> L9
            if (r5 == null) goto L12;
            if (r5.length <= 0) goto L12;
            r0.write(r5);     // Catch: IOException -> L9
        L12:
            return r0.toByteArray();
        L9:
            e = move-exception;
            e.printStackTrace();
            goto L12
        }

        public short getFileId() {
            return this.fileId;
        }

        public int getFileSize() {
            return this.fileSize;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 3;
        }

        public int getRestoreTime() {
            return this.restoreTime;
        }

        public int getStopTime() {
            return this.stopTime;
        }

        public byte[] getStrengthIntervalTimer() {
            return this.strengthIntervalTimer;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r6) {
            this.strengthIntervalTimer = new byte[0];
            int r7 = super.parse(r6);
            if (r7 <= 0) goto L17;
            byte[] r1 = getData();
            if (r1 == null) goto L17;
            if (r1.length == 0) goto L17;
            if (r1.length >= 12) goto L14;
            return -1;
        L14:
            this.stopTime = CHexConver.bytesToInt(r1, 0, 4);
            this.restoreTime = CHexConver.bytesToInt(r1, 4, 4);
            this.fileId = CHexConver.bytesToShort(r1, 8);
            this.fileSize = CHexConver.bytesToInt(r1, 10, 2);
            if (12 >= r1.length) goto L17;
            int r2 = r1.length - 12;
            byte[] r4 = new byte[r2];
            this.strengthIntervalTimer = r4;
            System.arraycopy(r1, 12, r4, 0, r2);
        L17:
            return r7;
        }

        public FirmwareStopSportsParam(byte[] r1) throws ParseDataException {
            super(r1);
        }
    }

    public static class Param extends BaseParameter implements IDataOp {
        private byte[] data;
        private byte op;

        public Param(byte[] r4) throws ParseDataException {
            int r5 = parse(r4);
            if (r5 < 0) goto L14;
            if (r5 <= 0) goto L12;
            int r6 = getParamType();
            if (r6 != (-1)) goto L8;
            return;
        L8:
            if (getOp() != r6) goto L11;
            return;
        L11:
            throw new ParseDataException(2, String.format(Locale.ENGLISH, "Operation[%d] does not match the target operation[%d].", new Object[]{Byte.valueOf(getOp()), Integer.valueOf(r6)}));
        L12:
            return;
        L14:
            throw new ParseDataException(1, "Failure to parse data. size = " + r5, this.data);
        }

        public byte[] getData() {
            return this.data;
        }

        public byte getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return toData();
        }

        public int getParamType() {
            return -1;
        }

        public int parse(byte[] r5) {
            this.data = new byte[0];
            if (r5 != null) goto L5;
        L12:
            return 0;
        L5:
            if (r5.length == 0) goto L12;
            this.op = r5[0];
            if (r5.length <= 1) goto L11;
            int r1 = r5.length - 1;
            byte[] r3 = new byte[r1];
            this.data = r3;
            System.arraycopy(r5, 1, r3, 0, r1);
        L11:
            return r5.length;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.op);
            byte[] r1 = this.data;
            if (r1 == null) goto L12;
            if (r1.length <= 0) goto L12;
            r0.write(r1);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            throw new RuntimeException(e);
        L12:
            return r0.toByteArray();
        }

        public Param(byte r1, byte[] r2) {
            this.op = r1;
            if (r2 != null) goto L5;
            r2 = new byte[0];
        L5:
            this.data = r2;
        }
    }

    public static class PauseSportsParam extends Param {
        public PauseSportsParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 4;
        }

        public PauseSportsParam() {
            super((byte) 4, new byte[0]);
        }
    }

    public static class ReadRealDataParam extends Param {
        public ReadRealDataParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 6;
        }

        public ReadRealDataParam() {
            super((byte) 6, new byte[0]);
        }
    }

    public static class ReadRealDataResponse extends Response {
        public float distance;
        public int duration;
        public int exerciseStatus;
        public int heartRate;
        public int kcal;
        public float pace;
        public float speed;
        public int step;
        public int stepFreq;
        public int stride;
        public byte version;

        public ReadRealDataResponse(byte[] r1) throws ParseDataException {
            super(r1);
        }

        private static byte[] convertResponseData(byte r1, int r2, float r3, int r4, float r5, int r6, int r7, int r8, int r9, int r10) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);     // Catch: IOException -> L5
            r0.write(CHexConver.intToBigBytes(r2));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2((int) r3));     // Catch: IOException -> L5
            r0.write(CHexConver.intToBigBytes(r4));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2((int) r5));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2(r6));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2(r7));     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2(r8));     // Catch: IOException -> L5
            r0.write(r9);     // Catch: IOException -> L5
            r0.write(r10);     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Response
        public int getResponseType() {
            return 6;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Response, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r5) {
            int r6 = super.parse(r5);
            if (r6 > 0) goto L6;
            return 0;
        L6:
            byte[] r0 = getResponseData();
            if (r0 != null) goto L9;
        L20:
            return r6;
        L9:
            if (r0.length == 0) goto L20;
            if (r0.length >= 21) goto L15;
            return -1;
        L15:
            ByteBuffer r1 = ByteBuffer.wrap(r0);
            this.version = r1.get();
            this.step = r1.getInt();
            this.distance = SportsInfoStatusSyncCmd.access$000(r1.getShort() * 0.01f);
            this.duration = r1.getInt();
            float r2 = SportsInfoStatusSyncCmd.access$000(r1.getShort() * 0.01f);
            this.speed = r2;
            float r3 = 0.0f;
            if (r2 == 0.0f) goto L19;
            r3 = SportsInfoStatusSyncCmd.access$000((1.0f / r2) * 3600.0f);
        L19:
            this.pace = r3;
            this.kcal = r1.getShort();
            this.stepFreq = r1.getShort();
            this.stride = r1.getShort();
            this.exerciseStatus = CHexConver.byteToInt(r1.get());
            this.heartRate = CHexConver.byteToInt(r1.get());
            goto L20
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "UpdateRealDataParam{version=" + this.version + ", step=" + this.step + ", distance=" + this.distance + ", duration=" + this.duration + ", speed=" + this.speed + ", pace=" + this.pace + ", kcal=" + this.kcal + ", stepFreq=" + this.stepFreq + ", stride=" + this.stride + ", exerciseStatus=" + this.exerciseStatus + ", heartRate=" + this.heartRate + i0XO1.IO;
        }

        public ReadRealDataResponse(byte r3, int r4, float r5, int r6, float r7, int r8, int r9, int r10, int r11, int r12) {
            super(6, convertResponseData(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12));
            this.version = r3;
            this.step = r4;
            this.distance = r5;
            this.duration = r6;
            this.speed = r7;
            float r13 = 0.0f;
            if (r7 == 0.0f) goto L6;
            r13 = SportsInfoStatusSyncCmd.access$000((1.0f / r7) * 3600.0f);
        L6:
            this.pace = r13;
            this.kcal = r8;
            this.stepFreq = r9;
            this.stride = r10;
            this.exerciseStatus = r11;
            this.heartRate = r12;
        }
    }

    public static class ReadSportsInfoParam extends Param {
        public ReadSportsInfoParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 0;
        }

        public ReadSportsInfoParam() {
            super((byte) 0, new byte[0]);
        }
    }

    public static class ReadSportsInfoResponse extends Response {
        public boolean hasGps;
        public byte heartRateMode;
        public int id;
        public int readReadDataInterval;
        public byte status;
        public byte type;

        public ReadSportsInfoResponse(byte r3, byte r4, int r5, boolean r6, byte r7, int r8) {
            super(0, convertResponseData(r3, r4, r5, r6, r7, r8));
            this.type = r3;
            this.status = r4;
            this.id = r5;
            this.hasGps = r6;
            this.heartRateMode = r7;
            this.readReadDataInterval = r8;
        }

        private static byte[] convertResponseData(byte r1, byte r2, int r3, boolean r4, byte r5, int r6) {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(r1);     // Catch: IOException -> L5
            r0.write(r2);     // Catch: IOException -> L5
            r0.write(CHexConver.intToBigBytes(r3));     // Catch: IOException -> L5
            r0.write(r4 ? 1 : 0);     // Catch: IOException -> L5
            r0.write(r5);     // Catch: IOException -> L5
            r0.write(CHexConver.int2byte2(r6));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Response
        public int getResponseType() {
            return 0;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Response, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            int r5 = super.parse(r4);
            if (r5 <= 0) goto L19;
            byte[] r0 = getResponseData();
            if (r0 == null) goto L19;
            if (r0.length == 0) goto L19;
            if (r0.length >= 10) goto L14;
            return -1;
        L14:
            ByteBuffer r1 = ByteBuffer.wrap(r0);
            this.type = r1.get();
            this.status = r1.get();
            this.id = r1.getInt();
            boolean r2 = true;
            if (r1.get() == 1) goto L18;
            r2 = false;
        L18:
            this.hasGps = r2;
            this.heartRateMode = r1.get();
            this.readReadDataInterval = r1.getShort();
        L19:
            return r5;
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "ReadExerciseInfoResponse{mode=" + this.type + ", status=" + this.status + ", id=" + this.id + ", hasGps=" + this.hasGps + ", heartRateMode=" + this.heartRateMode + i0XO1.IO;
        }

        public ReadSportsInfoResponse(byte[] r1) throws ParseDataException {
            super(r1);
        }
    }

    public static class Response extends CommonResponse implements IDataOp {
        public int op;
        public byte[] responseData;

        public Response(byte[] r5) throws ParseDataException {
            int r0 = parse(r5);
            if (r0 < 0) goto L15;
            if (r0 <= 0) goto L12;
            int r1 = getResponseType();
            if (r1 == (-1)) goto L12;
            if (r1 == getOp()) goto L12;
            throw new ParseDataException(2, String.format(Locale.ENGLISH, "Operation[%d] does not match the target operation[%d].", new Object[]{Integer.valueOf(getOp()), Integer.valueOf(r1)}));
        L12:
            setRawData(r5);
            return;
        L15:
            throw new ParseDataException(1, "Failure to parse data. size = " + r0, r5);
        }

        public int getOp() {
            return this.op;
        }

        public byte[] getResponseData() {
            return this.responseData;
        }

        public int getResponseType() {
            return -1;
        }

        public int parse(byte[] r5) {
            this.responseData = new byte[0];
            if (r5 != null) goto L5;
        L12:
            return 0;
        L5:
            if (r5.length == 0) goto L12;
            this.op = CHexConver.byteToInt(r5[0]);
            if (r5.length <= 1) goto L11;
            int r1 = r5.length - 1;
            byte[] r3 = new byte[r1];
            this.responseData = r3;
            System.arraycopy(r5, 1, r3, 0, r1);
        L11:
            return r5.length;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.op);
            byte[] r1 = this.responseData;
            if (r1 == null) goto L11;
            if (r1.length <= 0) goto L11;
            r0.write(r1);     // Catch: IOException -> L8
        L8:
            e = move-exception;
            e.printStackTrace();
        L11:
            return r0.toByteArray();
        }

        public Response(int r1, byte[] r2) {
            this.op = r1;
            this.responseData = r2;
        }
    }

    public static class ResumeSportsParam extends Param {
        public ResumeSportsParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 5;
        }

        public ResumeSportsParam() {
            super((byte) 5, new byte[0]);
        }
    }

    public static class SetReadRealDataIntervalParam extends Param {
        public short interval;

        public SetReadRealDataIntervalParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        public short getInterval() {
            return this.interval;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 7;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            int r5 = super.parse(r4);
            if (r5 <= 0) goto L15;
            byte[] r0 = getData();
            if (r0 == null) goto L15;
            if (r0.length == 0) goto L15;
            if (r0.length >= 2) goto L14;
            return -1;
        L14:
            this.interval = CHexConver.bytesToShort(r0, 0);
        L15:
            return r5;
        }

        public SetReadRealDataIntervalParam(short r3) {
            super((byte) 7, CHexConver.shortToBigBytes(r3));
            this.interval = r3;
        }
    }

    public static class StartSportsParam extends Param {
        public byte type;

        public StartSportsParam(byte[] r1) throws ParseDataException {
            super(r1);
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param
        public int getParamType() {
            return 1;
        }

        public byte getType() {
            return this.type;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r3) {
            int r4 = super.parse(r3);
            if (r4 <= 0) goto L11;
            byte[] r0 = getData();
            if (r0 == null) goto L11;
            if (r0.length == 0) goto L11;
            this.type = r0[0];
        L11:
            return r4;
        }

        public StartSportsParam(byte r4) {
            super((byte) 1, new byte[]{r4});
            this.type = r4;
        }
    }

    public SportsInfoStatusSyncCmd(Param r2) {
        this(2, r2);
    }

    public static /* synthetic */ float access$000(float r0) {
        return getFormatValue(r0);
    }

    private static float getFormatValue(float r2) {
        return Float.parseFloat(RcspUtil.formatString("%.2f", new Object[]{Float.valueOf(r2)}));
    L4:
        e = move-exception;
        e.printStackTrace();
        return r2;
    }

    public SportsInfoStatusSyncCmd(int r3, Param r4) {
        super(166, SportsInfoStatusSyncCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
