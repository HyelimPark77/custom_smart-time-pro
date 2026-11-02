package com.jieli.jl_rcsp.tool.datahandles;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.security.CertificateUtil;
import com.jieli.jl_rcsp.constant.Command;
import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.cmdHandler.RcspCmdHandler;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.parameter.NotifyAdvInfoParam;
import com.jieli.jl_rcsp.model.response.ADVInfoResponse;
import com.jieli.jl_rcsp.model.response.SysInfoResponse;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class ParseHelper {
    public static final String a = "ParseHelper";
    public static final char[] b = null;

    static {
        b = "0123456789ABCDEF".toCharArray();
    }

    public ParseHelper() {
    }

    public static int a(BluetoothDevice r1) {
        return DeviceStatusManager.getInstance().getMaxCommunicationMtu(r1);
    }

    public static List<ADVInfoResponse.KeySettings> b(byte[] r7) {
        if (r7 != null) goto L4;
        return null;
    L4:
        if (r7.length < 3) goto L16;
        ArrayList r0 = new ArrayList();
        byte[] r2 = new byte[3];
        int r4 = 0;
    L7:
        if (r4 >= r7.length) goto L11;
        int r5 = r4 + 3;
        if (r5 > r7.length) goto L11;
        System.arraycopy(r7, r4, r2, 0, 3);
        ADVInfoResponse.KeySettings r6 = new ADVInfoResponse.KeySettings();
        r6.setKeyNum(CHexConver.byteToInt(r2[0]));
        r6.setAction(CHexConver.byteToInt(r2[1]));
        r6.setFunction(CHexConver.byteToInt(r2[2]));
        r0.add(r6);
        r4 = r5;
    L11:
        return r0;
    L16:
        return null;
    }

    public static List<ADVInfoResponse.LedSettings> c(byte[] r7) {
        ArrayList r0 = null;
        if (r7 != null) goto L5;
    L15:
        return r0;
    L5:
        if (r7.length < 2) goto L15;
        byte[] r1 = new byte[2];
        int r4 = 0;
    L8:
        if (r4 >= r7.length) goto L15;
        int r5 = r4 + 2;
        if (r5 > r7.length) goto L15;
        System.arraycopy(r7, r4, r1, 0, 2);
        ADVInfoResponse.LedSettings r6 = new ADVInfoResponse.LedSettings();
        r6.setScene(CHexConver.byteToInt(r1[0]));
        r6.setEffect(CHexConver.byteToInt(r1[1]));
        if (r0 != null) goto L14;
        r0 = new ArrayList();
    L14:
        r0.add(r6);
        r4 = r5;
        goto L8
    }

    public static BasePacket convert2BasePacket(CommandBase r6, int r7) {
        if (r6 != null) goto L5;
        return null;
    L5:
        int r0 = 0;
        if (r7 != 1) goto L8;
        boolean r2 = true;
    L9:
        int r3 = r6.getType();
        int r4 = 2;
        if (r2 == false) goto L16;
        if (r3 != 2) goto L14;
    L15:
        r0 = 1;
        goto L16
    L14:
        if (r3 == 3) goto L15;
    L16:
        BasePacket r8 = new BasePacket().setType(r7).setHasResponse(r0).setOpCode(r6.getId()).setOpCodeSn(r6.getOpCodeSn()).setStatus(r6.getStatus());
        if (r2 == false) goto L20;
        r4 = 1;
    L20:
        if (r6.getParam() != null) goto L22;
    L29:
        r8.setParamLen(r4);
        return r8;
    L22:
        if (r8.getOpCode() != 1) goto L24;
        r8.setXmOpCode(r6.getParam().getXmOpCode());
        r4 = r4 + 1;
    L24:
        byte[] r9 = r6.getParam().getParamData();
        if (r9 == null) goto L29;
        if (r9.length <= 0) goto L29;
        r8.setParamData(r9);
        r4 = r4 + r9.length;
        goto L29
    L8:
        r2 = false;
        goto L9
    }

    public static CommandBase convert2Command(BluetoothDevice r2, BasePacket r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        Map<Integer, ICmdHandler> r0 = Command.getValidCommandList();
        if (r0 == null) goto L12;
        ICmdHandler r1 = r0.get(Integer.valueOf(r3.getOpCode()));
        if (r1 == null) goto L12;
        return r1.parseDataToCmd(r2, r3);
    L12:
        return new RcspCmdHandler().parseDataToCmd(r2, r3);
    }

    public static int convertVersionByString(String r9) {
        if (TextUtils.isEmpty(r9) == true) goto L15;
        JL_Log.d(a, "convertVersionByString", "version = " + r9);
        String[] r10 = r9.replace(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "").replace("v", "").split("\\.");
        int r0 = r10.length;
        int[] r2 = new int[r0];
        int r4 = 0;
    L6:
        if (r4 >= r10.length) goto L12;
        String r5 = r10[r4];
        if (TextUtils.isDigitsOnly(r5) == false) goto L10;
        r2[r4] = Integer.parseInt(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L12:
        if (r0 != 4) goto L15;
        byte[] r1 = CHexConver.getBooleanArray((byte) r2[0]);
        byte[] r6 = CHexConver.getBooleanArray((byte) r2[1]);
        byte[] r7 = new byte[8];
        System.arraycopy(r1, 4, r7, 0, 4);
        System.arraycopy(r6, 4, r7, 4, 4);
        byte r3 = (byte) a(r7);
        byte[] r8 = CHexConver.getBooleanArray((byte) r2[2]);
        byte[] r11 = CHexConver.getBooleanArray((byte) r2[3]);
        byte[] r12 = new byte[8];
        System.arraycopy(r8, 4, r12, 0, 4);
        System.arraycopy(r11, 4, r12, 4, 4);
        byte r13 = (byte) a(r12);
        JL_Log.d(a, "convertVersionByString", "versionCode : 0, heightValue : " + CHexConver.byte2HexStr(r7, 8) + ", lowValue : " + CHexConver.byte2HexStr(r12, 8));
        return CHexConver.bytesToInt(r3, r13);
    L15:
        return 0;
    }

    public static List<AttrBean> coverParamDataToAttrBeans(byte[] r7) {
        if (r7 == null) goto L18;
        if (r7.length == 0) goto L18;
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L8:
        if (r2 >= r7.length) goto L16;
        int r3 = r2 + 1;
        int r4 = CHexConver.byteToInt(r7[r2]);
        if (r4 < 1) goto L16;
        AttrBean r5 = new AttrBean();
        int r6 = r2 + 2;
        r5.setType(r7[r3]);
        int r8 = r4 - 1;
        byte[] r9 = new byte[r8];
        if ((r7.length - r6) < r8) goto L16;
        System.arraycopy(r7, r6, r9, 0, r8);
        r5.setAttrData(r9);
        r2 = r6 + r8;
        r0.add(r5);
    L16:
        return r0;
    L18:
        return new ArrayList();
    }

    public static String hexDataCovetToAddress(byte[] r4) {
        StringBuilder r0 = new StringBuilder();
        if (r4 == null) goto L14;
        if (r4.length != 6) goto L14;
        int r1 = 0;
    L8:
        if (r1 >= r4.length) goto L14;
        char[] r2 = b;
        r0.append(r2[(r4[r1] & 255) >> 4]);
        r0.append(r2[r4[r1] & 15]);
        if (r1 == (r4.length - 1)) goto L12;
        r0.append(CertificateUtil.DELIMITER);
    L12:
        r1 = r1 + 1;
    L14:
        return r0.toString();
    }

    public static byte[] packSendBasePacket(BasePacket r17) {
        if (r17 == null) goto L34;
        int r5 = r17.getParamLen();
        int r6 = r5 + 4;
        byte[] r7 = new byte[r5 + 8];
        byte[] r8 = new byte[r6];
        byte[] r10 = new byte[2];
        r10[0] = 0;
        if (r17.getType() != 1) goto L8;
        r10[0] = (byte) (r10[0] | 128);
    L8:
        if (r17.getHasResponse() != 1) goto L10;
        r10[0] = (byte) (r10[0] | 64);
    L10:
        r10[1] = (byte) r17.getOpCode();
        byte[] r11 = CHexConver.int2byte2(r5);
        byte[] r12 = new byte[r5];
        byte[] r14 = {(byte) r17.getStatus()};
        byte[] r15 = {(byte) r17.getOpCodeSn()};
        if (r17.getType() != 1) goto L22;
        System.arraycopy(r15, 0, r12, 0, 1);
        if (r17.getOpCode() != 1) goto L15;
        System.arraycopy(new byte[]{(byte) r17.getXmOpCode()}, 0, r12, 1, 1);
        int r13 = 2;
    L17:
        if (r17.getParamData() == null) goto L29;
        JL_Log.d(a, "packSendBasePacket", "data len : " + r17.getParamData().length + " ,index : " + r13 + ", paramLen : " + r5);
        int r16 = r5 - r13;
        if (r17.getParamData().length < r16) goto L29;
        System.arraycopy(r17.getParamData(), 0, r12, r13, r16);
    L21:
        r13 = r13 + r16;
    L29:
        if (r13 == r5) goto L32;
        JL_Log.e(a, "packSendBasePacket", "param data is error. index : " + r13 + ", paramLen : " + r5);
        return null;
    L32:
        System.arraycopy(r10, 0, r8, 0, 2);
        System.arraycopy(r11, 0, r8, 2, 2);
        System.arraycopy(r12, 0, r8, 4, r5);
        System.arraycopy(new byte[]{-2, -36, -70}, 0, r7, 0, 3);
        System.arraycopy(r8, 0, r7, 3, r6);
        System.arraycopy(new byte[]{-17}, 0, r7, r5 + 7, 1);
        ByteBuffer r0 = ByteBuffer.wrap(r7);
        r0.order(ByteOrder.BIG_ENDIAN);
        return r0.array();
    L15:
        r13 = 1;
        goto L17
    L22:
        System.arraycopy(r14, 0, r12, 0, 1);
        System.arraycopy(r15, 0, r12, 1, 1);
        if (r17.getOpCode() != 1) goto L25;
        System.arraycopy(new byte[]{(byte) r17.getXmOpCode()}, 0, r12, 2, 1);
        r13 = 3;
    L27:
        if (r17.getParamData() == null) goto L29;
        r16 = r5 - r13;
        System.arraycopy(r17.getParamData(), 0, r12, r13, r16);
        goto L21
    L25:
        r13 = 2;
        goto L27
    L34:
        return null;
    }

    public static void parseADVInfo(BluetoothDevice r12, ADVInfoResponse r13, BasePacket r14) {
        byte[] r15 = r14.getParamData();
        if (r15 != null) goto L5;
        return;
    L5:
        if (r15.length <= 0) goto L132;
        int r0 = r15.length;
        int r2 = 0;
    L7:
        int r3 = r2 + 2;
        if (r3 > r0) goto L133;
        int r4 = CHexConver.byteToInt(r15[r2]);
        if (r4 <= 0) goto L78;
        if (r4 >= a(r12)) goto L78;
        int r6 = CHexConver.byteToInt(r15[r2 + 1]);
        int r7 = r4 - 1;
        byte[] r8 = new byte[r7];
        if (r7 <= 0) goto L74;
        if (((r7 + r2) + 2) > r0) goto L74;
        System.arraycopy(r15, r3, r8, 0, r7);
        r2 = r2 + (r4 + 1);
        String r5 = a;
        JL_Log.d(r5, "parseADVInfo", "data : " + CHexConver.byte2HexStr(r8));
        if (r13 != null) goto L20;
        r13 = new ADVInfoResponse();
    L20:
        boolean r11 = true;
        switch(r6) {
            case 0: goto L57;
            case 1: goto L82;
            case 2: goto L52;
            case 3: goto L51;
            case 4: goto L50;
            case 5: goto L49;
            case 6: goto L47;
            case 7: goto L22;
            case 8: goto L45;
            case 9: goto L80;
            case 10: goto L23;
            default: goto L22;
        };
    L80:
        r13.setLanguage(new String(r8));     // Catch: Exception -> L43
    L43:
        e = move-exception;
        e.printStackTrace();
        goto L7
    L82:
        r13.setDeviceName(new String(r8));     // Catch: Exception -> L55
    L55:
        e = move-exception;
        e.printStackTrace();
        goto L7
    L23:
        if (r7 < 4) goto L7;
        int r9 = CHexConver.bytesToInt(r8, 0, 4);
        ArrayList r10 = new ArrayList();
        int r16 = 0;
    L26:
        if (r16 >= 32) goto L32;
        if (((r9 >> r16) & 1) != 1) goto L30;
        r10.add(Integer.valueOf(r16));
    L30:
        r16 = r16 + 1;
        goto L26
    L32:
        if (r10.isEmpty() == true) goto L7;
        byte[] r17 = new byte[r10.size()];
        int r18 = 0;
    L35:
        if (r18 >= r10.size()) goto L40;
        Integer r19 = (Integer) r10.get(r18);
        if (r19 == null) goto L39;
        r17[r18] = r19.byteValue();
    L39:
        r18 = r18 + 1;
        goto L35
    L40:
        r13.setModes(r17);
        goto L7
    L45:
        r13.setInEarSettings(CHexConver.byteToInt(r15[0]));
        goto L7
    L47:
        if (r7 < 6) goto L7;
        int r20 = CHexConver.bytesToInt(r8[0], r8[1]);
        int r21 = CHexConver.bytesToInt(r8[2], r8[3]);
        int r22 = CHexConver.bytesToInt(r8[4], r8[5]);
        r13.setVid(r20);
        r13.setUid(r21);
        r13.setPid(r22);
        goto L7
    L49:
        r13.setWorkModel(CHexConver.byteToInt(r8[0]));
        goto L7
    L50:
        r13.setMicChannel(CHexConver.byteToInt(r8[0]));
        goto L7
    L51:
        r13.setLedSettingsList(c(r8));
        goto L7
    L52:
        r13.setKeySettingsList(b(r8));
        goto L7
    L57:
        byte r23 = r8[0];
        int r24 = (r23 >> 7) & 1;
        int r25 = r23 & 127;
        if (r24 != 1) goto L60;
        boolean r26 = true;
    L61:
        r13.setLeftCharging(r26);
        r13.setLeftDeviceQuantity(r25);
        if (r7 < 2) goto L7;
        byte r27 = r8[1];
        int r28 = (r27 >> 7) & 1;
        int r29 = r27 & 127;
        if (r28 != 1) goto L66;
        boolean r30 = true;
    L67:
        r13.setRightCharging(r30);
        r13.setRightDeviceQuantity(r29);
        if (r7 < 3) goto L7;
        byte r31 = r8[2];
        int r32 = (r31 >> 7) & 1;
        int r33 = r31 & 127;
        if (r32 == 1) goto L73;
        r11 = false;
    L73:
        r13.setDeviceCharging(r11);
        r13.setChargingBinQuantity(r33);
        goto L7
    L66:
        r30 = false;
        goto L67
    L60:
        r26 = false;
        goto L61
    L22:
        JL_Log.w(r5, "parseADVInfo", "unknown type : " + r6);
    L74:
        if (r7 != 0) goto L76;
        JL_Log.w(a, "parseADVInfo", "data is empty.");
        r2 = r3;
        goto L7
    L76:
        JL_Log.w(a, "parseADVInfo", "data over limit.");
        return;
    L78:
        JL_Log.e(a, "parseADVInfo", RcspUtil.formatString("data length[%d] over MAX_COMMUNICATION_MTU[%d], cast away", new Object[]{Integer.valueOf(r4), Integer.valueOf(a(r12))}));
        return;
    L133:
        return;
    }

    public static void parseNotifyADVInfo(NotifyAdvInfoParam r17, BasePacket r18) {
        if (r18 == null) goto L24;
        byte[] r0 = r18.getParamData();
        if (r0 != null) goto L7;
        return;
    L7:
        if (r0.length < 18) goto L23;
        byte[] r2 = new byte[2];
        System.arraycopy(r0, 0, r2, 0, 2);
        int r4 = CHexConver.bytesToInt(r2[0], r2[1]);
        System.arraycopy(r0, 2, r2, 0, 2);
        int r6 = CHexConver.bytesToInt(r2[0], r2[1]);
        System.arraycopy(r0, 4, r2, 0, 2);
        int r1 = CHexConver.bytesToInt(r2[0], r2[1]);
        byte r7 = r0[6];
        byte[] r10 = new byte[6];
        System.arraycopy(r0, 7, r10, 0, 6);
        String r3 = hexDataCovetToAddress(r10);
        int r11 = CHexConver.byteToInt(r0[13]);
        byte r12 = r0[14];
        int r13 = (r12 >> 7) & 1;
        int r14 = r12 & 127;
        byte r9 = r0[15];
        int r15 = (r9 >> 7) & 1;
        int r16 = r9 & 127;
        byte r19 = r0[16];
        int r110 = (r19 >> 7) & 1;
        int r111 = r19 & 127;
        byte r5 = r0[17];
        NotifyAdvInfoParam r8 = r17.setVid(r4).setUid(r6).setPid(r1).setDeviceType((r7 >> 4) & 255).setVersion(r7 & 15).setEdrAddr(r3).setAction(r11);
        if (r13 != 1) goto L11;
        boolean r20 = true;
    L12:
        NotifyAdvInfoParam r21 = r8.setLeftCharging(r20).setLeftDeviceQuantity(r14);
        if (r15 != 1) goto L15;
        boolean r22 = true;
    L16:
        NotifyAdvInfoParam r23 = r21.setRightCharging(r22).setRightDeviceQuantity(r16);
        if (r110 != 1) goto L19;
        boolean r24 = true;
    L20:
        r23.setDeviceCharging(r24).setChargingBinQuantity(r111).setSeq(CHexConver.byteToInt(r5));
        return;
    L19:
        r24 = false;
        goto L20
    L15:
        r22 = false;
        goto L16
    L11:
        r20 = false;
        goto L12
    L23:
        return;
    }

    public static void parseSysInfo(SysInfoResponse r5, BasePacket r6) {
        byte[] r7 = r6.getParamData();
        if (r7 == null) goto L12;
        if (r5 != null) goto L7;
        return;
    L7:
        if (r7.length <= 0) goto L13;
        byte r1 = r7[0];
        if (r7.length <= 1) goto L14;
        int r2 = r7.length - 1;
        byte[] r4 = new byte[r2];
        System.arraycopy(r7, 1, r4, 0, r2);
        List<AttrBean> r8 = coverParamDataToAttrBeans(r4);
        r5.setFunction(r1);
        r5.setAttrs(r8);
        return;
    L14:
        return;
    L13:
        return;
    }

    public static void parseTargetInfo(BluetoothDevice r20, TargetInfoResponse r21, BasePacket r22) {
        byte[] r3 = r22.getParamData();
        if (r3 != null) goto L5;
    L187:
        JL_Log.w(a, "parseTargetInfo", "end ....... = " + r21);
        return;
    L5:
        if (r3.length <= 0) goto L187;
        int r5 = r3.length;
        int r0 = 0;
    L7:
        int r7 = r0 + 2;
        if (r7 > r5) goto L187;
        int r8 = CHexConver.byteToInt(r3[r0]);
        if (r8 <= 0) goto L185;
        if (r8 >= a(r20)) goto L185;
        int r9 = CHexConver.byteToInt(r3[r0 + 1]);
        int r10 = r8 - 1;
        byte[] r11 = new byte[r10];
        if (r10 > 0) goto L16;
    L181:
        if (r10 != 0) goto L183;
        JL_Log.w(a, "parseTargetInfo", "dataBuf is empty.");
    L180:
        r0 = r7;
        goto L7
    L183:
        JL_Log.w(a, "parseTargetInfo", "over limit.");
        return;
    L16:
        if (((r10 + r0) + 2) > r5) goto L181;
        System.arraycopy(r3, r7, r11, 0, r10);
        r7 = (r8 + 1) + r0;
        boolean r14 = true;
        if (r9 != 21) goto L20;
        int r1 = CHexConver.bytesToInt(r11);
        if ((r1 & 1) != 1) goto L170;
        boolean r12 = true;
    L171:
        TargetInfoResponse r13 = r21.setSupportPackageCrc16(r12);
        if ((r1 & 2) != 2) goto L174;
        boolean r15 = true;
    L175:
        TargetInfoResponse r16 = r13.setGetFileByNameWithDev(r15);
        if ((r1 & 4) == 4) goto L179;
        r14 = false;
    L179:
        r16.setContactsTransferBySmallFile(r14);
        goto L180
    L174:
        r15 = false;
        goto L175
    L170:
        r12 = false;
        goto L171
    L20:
        if (r9 != 31) goto L22;
        String r17 = new String(r11);     // Catch: Exception -> L164
    L166:
        r21.setCustomVersionMsg(r17);
    L164:
        e = move-exception;
        e.printStackTrace();
        r17 = null;
        goto L166
    L22:
        switch(r9) {
            case 0: goto L161;
            case 1: goto L150;
            case 2: goto L146;
            case 3: goto L139;
            case 4: goto L114;
            case 5: goto L111;
            case 6: goto L101;
            case 7: goto L96;
            case 8: goto L83;
            case 9: goto L77;
            case 10: goto L73;
            case 11: goto L191;
            case 12: goto L193;
            case 13: goto L51;
            case 14: goto L49;
            default: goto L23;
        };
    L23:
        switch(r9) {
            case 16: goto L197;
            case 17: goto L32;
            case 18: goto L26;
            case 19: goto L25;
            default: goto L180;
        };
    L25:
        r21.setExpandFunc(r11);
        goto L180
    L26:
        byte r2 = r11[0];
        if ((r2 & 15) == 1) goto L30;
        r14 = false;
    L30:
        r21.setEmitterStatus((r2 >> 4) & 15).setEmitterSupport(r14);
        goto L180
    L197:
        r21.setName(new String(r11));     // Catch: Exception -> L47
    L47:
        e = move-exception;
        e.printStackTrace();
        goto L180
    L32:
        if (r11[0] != 1) goto L34;
        boolean r4 = true;
    L35:
        r21.setBleOnly(r4);
        if (r10 <= 6) goto L39;
        byte[] r6 = new byte[6];
        System.arraycopy(r11, 1, r6, 0, 6);
        r21.setBleAddr(hexDataCovetToAddress(r6));
    L39:
        if (r10 <= 7) goto L180;
        if ((r11[7] & 1) == 1) goto L44;
        r14 = false;
    L44:
        r21.setBLEToSppWay(r14);
        goto L180
    L34:
        r4 = false;
        goto L35
    L49:
        r21.setAllowConnectFlag(CHexConver.byteToInt(r11[0]));
        goto L180
    L77:
        r21.setMandatoryUpgradeFlag(CHexConver.byteToInt(r11[0]));
        if (r10 < 2) goto L180;
        r21.setRequestOtaFlag(CHexConver.byteToInt(r11[1]));
        if (r10 < 3) goto L180;
        r21.setExpandMode(CHexConver.byteToInt(r11[2]));
        goto L180
    L101:
        r21.setSdkType(CHexConver.byteToInt(r11[0]));
        if (r21.isSupportVolumeSync() == true) goto L180;
        if (r21.getSdkType() != 2) goto L106;
    L109:
        r21.setSupportVolumeSync(r14);
        goto L180
    L106:
        if (r21.getSdkType() == 4) goto L109;
        r14 = false;
        goto L109
    L146:
        if (r10 < 6) goto L180;
        byte[] r18 = new byte[6];
        System.arraycopy(r11, 0, r18, 0, 6);
        r21.setEdrAddr(hexDataCovetToAddress(r18));
        if (r10 < 8) goto L180;
        byte r19 = r11[6];
        r21.setEdrProfile(r19).setEdrStatus(r11[7]);
        goto L180
    L150:
        if (r10 < 3) goto L180;
        r21.setQuantity(CHexConver.byteToInt(r11[0]));
        r21.setVolume(r11[1]);
        r21.setMaxVol(r11[2]);
        if (r10 <= 3) goto L159;
        if ((r11[3] & 1) == 1) goto L157;
        r14 = false;
    L157:
        r21.setSupportVolumeSync(r14);
    L159:
        if (r10 <= 4) goto L180;
        r21.setLowPowerLimit(CHexConver.byteToInt(r11[4]));
        goto L180
    L161:
        byte r23 = r11[0];
        r21.setProtocolVersion("V_" + ((r23 >> 4) & 15) + FileUtils.FILE_EXTENSION_SEPARATOR + (r23 & 15));
        goto L180
    L191:
        String r110 = new String(r11);     // Catch: Exception -> L69
    L71:
        r21.setAuthKey(r110);
    L69:
        e = move-exception;
        e.printStackTrace();
        r110 = null;
        goto L71
    L193:
        String r111 = new String(r11);     // Catch: Exception -> L64
    L66:
        r21.setProjectCode(r111);
    L64:
        e = move-exception;
        e.printStackTrace();
        r111 = null;
        goto L66
    L51:
        if (r10 < 2) goto L180;
        int r24 = CHexConver.bytesToInt(r11[0], r11[1]);
        if (r24 <= 0) goto L56;
        DeviceStatusManager.getInstance().updateDeviceMaxCommunicationMtu(r20, r24);
        DeviceStatusManager.getInstance().updateDeviceMaxReceiveMtu(r20, r24);
    L56:
        if (r10 < 4) goto L180;
        int r25 = CHexConver.bytesToInt(r11[2], r11[3]);
        if (r24 <= 0) goto L60;
        DeviceStatusManager.getInstance().updateDeviceMaxReceiveMtu(r20, r24);
    L60:
        if (r25 <= 0) goto L180;
        DeviceStatusManager.getInstance().updateDeviceMaxCommunicationMtu(r20, r25);
        goto L180
    L73:
        if (r10 < 4) goto L180;
        r21.setVid(1494).setUid(CHexConver.bytesToInt(r11[0], r11[1])).setPid(CHexConver.bytesToInt(r11[2], r11[3]));
        if (r10 < 6) goto L180;
        r21.setVid(CHexConver.bytesToInt(r11[0], r11[1])).setPid(CHexConver.bytesToInt(r11[2], r11[3])).setUid(CHexConver.bytesToInt(r11[4], r11[5]));
        goto L180
    L83:
        if (CHexConver.byteToInt(r11[0]) != 1) goto L85;
        boolean r26 = true;
    L86:
        r21.setSupportDoubleBackup(r26);
        if (r10 < 2) goto L180;
        if (CHexConver.byteToInt(r11[1]) == 1) goto L92;
        r14 = false;
    L92:
        r21.setNeedBootLoader(r14);
        if (r10 < 3) goto L180;
        r21.setSingleBackupOtaWay(CHexConver.byteToInt(r11[2]));
        goto L180
    L85:
        r26 = false;
        goto L86
    L96:
        if (r10 != 2) goto L98;
        byte[] r27 = CHexConver.getBooleanArray(r11[0]);
        byte[] r28 = CHexConver.getBooleanArray(r11[1]);
        StringBuilder r29 = new StringBuilder();
        byte[] r112 = new byte[8];
        System.arraycopy(r27, 0, r112, 4, 4);
        r29.append(a(r112));
        r29.append(FileUtils.FILE_EXTENSION_SEPARATOR);
        System.arraycopy(r27, 4, r112, 4, 4);
        r29.append(a(r112));
        r29.append(FileUtils.FILE_EXTENSION_SEPARATOR);
        System.arraycopy(r28, 0, r112, 4, 4);
        r29.append(a(r112));
        r29.append(FileUtils.FILE_EXTENSION_SEPARATOR);
        System.arraycopy(r28, 4, r112, 4, 4);
        r29.append(a(r112));
        r21.setUbootVersionName(r29.toString());
        r21.setUbootVersionCode(CHexConver.bytesToInt(r11[0], r11[1]));
        goto L180
    L98:
        String r30 = new String(r11).replace(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "").replace("v", "");
        r21.setUbootVersionName(r30);
        char[] r31 = r30.replace(FileUtils.FILE_EXTENSION_SEPARATOR, "").toCharArray();
        if (r31.length < 4) goto L180;
        r21.setUbootVersionCode(CHexConver.bytesToInt(CHexConver.decodeHexChar(r31[0], r31[1]), CHexConver.decodeHexChar(r31[2], r31[3])));
        goto L180
    L111:
        if (r10 < 2) goto L180;
        int r32 = CHexConver.bytesToInt(r11[0], r11[1]);
        r21.setVersionCode(r32).setVersionName("V_" + ((r32 >> 12) & 15) + FileUtils.FILE_EXTENSION_SEPARATOR + ((r32 >> 8) & 15) + FileUtils.FILE_EXTENSION_SEPARATOR + ((r32 >> 4) & 15) + FileUtils.FILE_EXTENSION_SEPARATOR + (r32 & 15));
        goto L180
    L114:
        if (r10 < 5) goto L180;
        byte[] r33 = new byte[4];
        System.arraycopy(r11, 0, r33, 0, 4);
        r21.setFunctionMask(CHexConver.bytesToInt(r33)).setCurFunction(r11[4]);
        if (r10 <= 5) goto L180;
        byte r34 = r11[5];
        if ((r34 & 1) != 1) goto L120;
        boolean r35 = true;
    L122:
        if ((r34 & 2) != 2) goto L124;
        boolean r36 = true;
    L126:
        if ((r34 & 4) != 4) goto L128;
        boolean r113 = true;
    L130:
        if ((r34 & 8) != 8) goto L132;
        boolean r114 = true;
    L134:
        if ((r34 & 16) == 16) goto L137;
        r14 = false;
    L137:
        r21.setSupportOfflineShow(r35).setSupportUsb(r36).setSupportSd0(r113).setSupportSd1(r114).setHideNetRadio(r14);
        goto L180
    L132:
        r114 = false;
        goto L134
    L128:
        r113 = false;
        goto L130
    L124:
        r36 = false;
        goto L126
    L120:
        r35 = false;
        goto L122
    L139:
        if (r10 <= 8) goto L180;
        r21.setPlatform(r11[0]);
        String r115 = new String(r11, 1, r8 - 2);     // Catch: Exception -> L143
    L145:
        r21.setLicense(r115);
    L143:
        e = move-exception;
        e.printStackTrace();
        r115 = null;
    L185:
        JL_Log.e(a, "parseTargetInfo", RcspUtil.formatString("data length[%d] over MAX_COMMUNICATION_MTU[%d], cast away", new Object[]{Integer.valueOf(r8), Integer.valueOf(a(r20))}));
    }

    public static int setDeviceMaxReceiveMtu(BluetoothDevice r1) {
        return DeviceStatusManager.getInstance().getMaxReceiveMtu(r1);
    }

    public static int a(byte[] r5) {
        if (r5 != null) goto L5;
    L13:
        return 0;
    L5:
        if (r5.length != 8) goto L13;
        StringBuilder r1 = new StringBuilder();
        int r2 = r5.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L14;
        r1.append(r5[r3] & 255);
        r3 = r3 + 1;
        goto L7
    L14:
        return Integer.valueOf(r1.toString(), 2).intValue();
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }
}
