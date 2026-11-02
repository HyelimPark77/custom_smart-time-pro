package com.jieli.jl_rcsp.model.command.watch;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.exception.ParseDataException;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class PushInfoDataToDeviceCmd extends CommandWithParamAndResponse<Param, Response> {

    public static abstract class BaseInfo implements IDataOp {
        private byte[] messageData;
        private byte type;
        private byte version;

        public BaseInfo(byte[] r5) throws ParseDataException {
            int r0 = parse(r5);
            if (r0 < 0) goto L14;
            if (r0 <= 0) goto L12;
            int r6 = getMessageType();
            if (r6 != (-1)) goto L8;
            return;
        L8:
            if (this.type != r6) goto L11;
            return;
        L11:
            throw new ParseDataException(2, String.format(Locale.ENGLISH, "Data type[%d] does not match the target type[%d].", new Object[]{Byte.valueOf(this.type), Integer.valueOf(r6)}));
        L12:
            return;
        L14:
            throw new ParseDataException(1, "Failed to parse data. size = " + r0, r5);
        }

        private byte[] toParamData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.type);     // Catch: IOException -> L7
            r0.write(this.version);     // Catch: IOException -> L7
            byte[] r1 = this.messageData;     // Catch: IOException -> L7
            if (r1 == null) goto L10;
            r0.write(r1);     // Catch: IOException -> L7
        L10:
            return r0.toByteArray();
        L7:
            e = move-exception;
            e.printStackTrace();
            goto L10
        }

        public byte[] getMessageData() {
            return this.messageData;
        }

        public abstract int getMessageType();

        public byte getType() {
            return this.type;
        }

        public byte getVersion() {
            return this.version;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r5) {
            this.messageData = new byte[0];
            if (r5 != null) goto L5;
        L16:
            return 0;
        L5:
            if (r5.length == 0) goto L16;
            if (r5.length >= 2) goto L11;
            return -1;
        L11:
            this.type = r5[0];
            this.version = r5[1];
            if (r5.length <= 2) goto L15;
            int r1 = r5.length - 2;
            byte[] r3 = new byte[r1];
            this.messageData = r3;
            System.arraycopy(r5, 2, r3, 0, r1);
        L15:
            return r5.length;
        }

        public void setMessageData(byte[] r1) {
            this.messageData = r1;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            return toParamData();
        }

        public BaseInfo(byte r1, byte r2) {
            this.type = r1;
            this.version = r2;
        }
    }

    public static class MessageData extends BaseInfo {
        private byte[] data;
        private int seq;

        public MessageData(int r3, byte[] r4) {
            super((byte) 2, (byte) 0);
            this.seq = r3;
            this.data = r4;
            setMessageData(beanToData());
        }

        private byte[] beanToData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.seq);     // Catch: IOException -> L7
            byte[] r1 = this.data;     // Catch: IOException -> L7
            if (r1 == null) goto L10;
            r0.write(r1);     // Catch: IOException -> L7
        L10:
            return r0.toByteArray();
        L7:
            e = move-exception;
            e.printStackTrace();
            goto L10
        }

        public byte[] getData() {
            return this.data;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd.BaseInfo
        public int getMessageType() {
            return 2;
        }

        public int getSeq() {
            return this.seq;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd.BaseInfo, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r6) {
            this.seq = -1;
            this.data = new byte[0];
            int r7 = super.parse(r6);
            if (r7 <= 0) goto L13;
            byte[] r1 = getMessageData();
            if (r1 == null) goto L13;
            if (r1.length == 0) goto L13;
            this.seq = CHexConver.byteToInt(r1[0]);
            if (r1.length <= 1) goto L13;
            int r2 = r1.length - 1;
            byte[] r4 = new byte[r2];
            this.data = r4;
            System.arraycopy(r1, 1, r4, 0, r2);
        L13:
            return r7;
        }

        public String toString() {
            return "MessageData{seq=" + this.seq + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
        }
    }

    public static class Param<T extends BaseInfo> extends BaseParameter {
        private final T baseInfo;

        public Param(T r1) {
            this.baseInfo = r1;
        }

        public T getBaseInfo() {
            return this.baseInfo;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            T r0 = this.baseInfo;
            if (r0 != null) goto L7;
            return new byte[0];
        L7:
            return r0.toData();
        }
    }

    public static class RemoveMsg extends BaseInfo {
        private byte[] appPackageName;
        private byte[] timestamp;

        public RemoveMsg(String r3, long r4) {
            super((byte) 3, (byte) 0);
            this.appPackageName = RcspUtil.getData(r3, 31);
            this.timestamp = CHexConver.intToBigBytes(RcspUtil.time2Int(r4));
            setMessageData(beanToData());
        }

        private byte[] beanToData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(RcspUtil.packLTVPacket2(0, this.timestamp));     // Catch: IOException -> L5
            r0.write(RcspUtil.packLTVPacket2(1, this.appPackageName));     // Catch: IOException -> L5
        L8:
            return r0.toByteArray();
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L8
        }

        public byte[] getAppPackageName() {
            return this.appPackageName;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd.BaseInfo
        public int getMessageType() {
            return 3;
        }

        public byte[] getTimestamp() {
            return this.timestamp;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd.BaseInfo, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r6) {
            this.appPackageName = new byte[0];
            this.timestamp = new byte[0];
            int r7 = super.parse(r6);
            if (r7 <= 0) goto L17;
            byte[] r1 = getMessageData();
            if (r1 == null) goto L17;
            if (r1.length == 0) goto L17;
            if (r1.length >= 4) goto L14;
            return -1;
        L14:
            byte[] r2 = new byte[4];
            this.timestamp = r2;
            System.arraycopy(r1, 0, r2, 0, 4);
            if (r1.length <= 4) goto L17;
            int r3 = r1.length - 4;
            byte[] r4 = new byte[r3];
            this.appPackageName = r4;
            System.arraycopy(r1, 4, r4, 0, r3);
        L17:
            return r7;
        }
    }

    public static class Response extends CommonResponse implements IDataOp {
        public int reason;
        public byte type;

        public Response(byte[] r5) throws ParseDataException {
            int r0 = parse(r5);
            if (r0 < 0) goto L7;
            setRawData(r5);
            return;
        L7:
            throw new ParseDataException(1, "Failed to parse data. size = " + r0, r5);
        }

        public int getReason() {
            return this.reason;
        }

        public byte getType() {
            return this.type;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r4) {
            if (r4 != null) goto L5;
        L13:
            return 0;
        L5:
            if (r4.length == 0) goto L13;
            if (r4.length >= 2) goto L11;
            return -1;
        L11:
            this.type = r4[0];
            this.reason = CHexConver.byteToInt(r4[1]);
            return 2;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.type);
            r0.write(this.reason);
            return r0.toByteArray();
        }

        public Response(byte r1, int r2) {
            this.reason = r2;
            this.type = r1;
        }
    }

    public static class Weather extends BaseInfo {
        private String city;
        private byte humidity;
        private String province;
        private byte temperature;
        private long time;
        private byte weather;
        private byte windDirection;
        private byte windPower;

        public Weather(byte[] r1) throws ParseDataException {
            super(r1);
        }

        private byte[] beanToData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            String r1 = this.province;     // Catch: IOException -> L10
            int r2 = 0;
            if (r1 != null) goto L6;
            int r3 = 0;
        L7:
            r0.write(r3);     // Catch: IOException -> L10
            if (r3 <= 0) goto L12;
            r0.write(this.province.getBytes());     // Catch: IOException -> L10
        L12:
            String r4 = this.city;     // Catch: IOException -> L10
            if (r4 == null) goto L16;
            r2 = r4.getBytes().length;     // Catch: IOException -> L10
        L16:
            r0.write(r2);     // Catch: IOException -> L10
            if (r2 <= 0) goto L19;
            r0.write(this.city.getBytes());     // Catch: IOException -> L10
        L19:
            r0.write(this.weather);     // Catch: IOException -> L10
            r0.write(this.temperature);     // Catch: IOException -> L10
            r0.write(this.humidity);     // Catch: IOException -> L10
            r0.write(this.windDirection);     // Catch: IOException -> L10
            r0.write(this.windPower);     // Catch: IOException -> L10
            r0.write(CHexConver.intToBigBytes(RcspUtil.time2Int(this.time)));     // Catch: IOException -> L10
        L23:
            return r0.toByteArray();
        L6:
            r3 = r1.getBytes().length;     // Catch: IOException -> L10
        L10:
            e = move-exception;
            e.printStackTrace();
            goto L23
        }

        public String getCity() {
            return this.city;
        }

        public byte getHumidity() {
            return this.humidity;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd.BaseInfo
        public int getMessageType() {
            return 1;
        }

        public String getProvince() {
            return this.province;
        }

        public byte getTemperature() {
            return this.temperature;
        }

        public long getTime() {
            return this.time;
        }

        public byte getWeather() {
            return this.weather;
        }

        public byte getWindDirection() {
            return this.windDirection;
        }

        public byte getWindPower() {
            return this.windPower;
        }

        @Override // com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd.BaseInfo, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r6) {
            int r7 = super.parse(r6);
            if (r7 <= 0) goto L42;
            byte[] r0 = getMessageData();
            if (r0 == null) goto L42;
            if (r0.length == 0) goto L42;
            if (r0.length >= 11) goto L14;
            return -1;
        L14:
            int r1 = CHexConver.byteToInt(r0[0]);
            int r2 = r1 + 1;
            if (r2 > r0.length) goto L42;
            this.province = new String(r0, 1, r1);     // Catch: Exception -> L40
            int r3 = CHexConver.byteToInt(r0[r2]);     // Catch: Exception -> L40
            int r4 = r2 + r3;     // Catch: Exception -> L40
            if (r4 > r0.length) goto L42;
            this.city = new String(r0, r2, r3);     // Catch: Exception -> L40
            int r5 = r4 + 1;     // Catch: Exception -> L40
            if (r5 > r0.length) goto L42;
            this.weather = r0[r4];     // Catch: Exception -> L40
            int r8 = r4 + 2;     // Catch: Exception -> L40
            if (r8 > r0.length) goto L42;
            this.temperature = r0[r5];     // Catch: Exception -> L40
            int r9 = r4 + 3;     // Catch: Exception -> L40
            if (r9 > r0.length) goto L42;
            this.humidity = r0[r8];     // Catch: Exception -> L40
            int r10 = r4 + 4;     // Catch: Exception -> L40
            if (r10 > r0.length) goto L42;
            this.windDirection = r0[r9];     // Catch: Exception -> L40
            int r11 = r4 + 5;     // Catch: Exception -> L40
            if (r11 > r0.length) goto L42;
            this.windPower = r0[r10];     // Catch: Exception -> L40
            if ((r4 + 9) > r0.length) goto L42;
            this.time = RcspUtil.intToTime(CHexConver.bytesToInt(r0, r11, 4));     // Catch: Exception -> L40
            return r7;
        L40:
            e = move-exception;
            e.printStackTrace();
        L42:
            return r7;
        }

        public String toString() {
            return "Weather{province=" + this.province + ", city=" + this.city + ", weather=" + this.weather + ", temperature=" + this.temperature + ", humidity=" + this.humidity + ", windDirection=" + this.windDirection + ", windPower=" + this.windPower + ", time=" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH).format(new Date(this.time)) + i0XO1.IO;
        }

        public Weather(String r3, String r4, byte r5, byte r6, byte r7, byte r8, byte r9, long r10) {
            super((byte) 1, (byte) 0);
            this.province = r3;
            this.city = r4;
            this.weather = r5;
            this.temperature = r6;
            this.humidity = r7;
            this.windDirection = r8;
            this.windPower = r9;
            this.time = r10;
            setMessageData(beanToData());
        }
    }

    public PushInfoDataToDeviceCmd(Param r3) {
        super(161, PushInfoDataToDeviceCmd.class.getSimpleName(), r3);
    }
}
