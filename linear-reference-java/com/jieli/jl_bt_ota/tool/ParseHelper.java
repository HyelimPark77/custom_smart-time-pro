package com.jieli.jl_bt_ota.tool;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.security.CertificateUtil;
import com.jieli.jl_bt_ota.constant.Command;
import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.cmdHandler.RcspCmdHandler;
import com.jieli.jl_bt_ota.model.parameter.tws.NotifyAdvInfoParam;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class ParseHelper {
    private static final String a = "ParseHelper";
    private static final byte b = -2;
    private static final byte c = -36;
    private static final byte d = -70;
    private static final byte e = -17;
    private static final byte[] f = null;
    private static byte[] g;
    private static int h;
    private static final char[] i = null;

    static {
        f = new byte[]{-2, -36, -70};
        h = 0;
        i = "0123456789ABCDEF".toCharArray();
    }

    public ParseHelper() {
    }

    private static int a(byte[] r10, int r11, int r12) {
        int r0 = r10.length;
    L4:
        if (r11 >= r0) goto L34;
        if (r10[r11] != (-2)) goto L33;
        int r2 = r0 - r11;
        byte[] r3 = f;
        if (r2 < r3.length) goto L9;
        int r5 = r3.length;
        byte[] r6 = new byte[r5];
        System.arraycopy(r10, r11, r6, 0, r5);
        if (Arrays.equals(r6, r3) == false) goto L33;
        if (r2 <= (r3.length + 4)) goto L15;
        int r7 = r3.length + r11;
        byte[] r8 = new byte[2];
        System.arraycopy(r10, r7 + 2, r8, 0, 2);
        int r9 = CHexConver.bytesToInt(r8[0], r8[1]);
        if (r9 <= (r12 - 8)) goto L22;
        JL_Log.e(a, "findPacketData", CommonUtil.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", new Object[]{Integer.valueOf(r9), Integer.valueOf(r12)}));
    L20:
        r11 = r7 - 1;
        goto L33
    L22:
        if (r2 <= ((r3.length + 4) + r9)) goto L23;
        if (r10[(r7 + 4) + r9] != (-17)) goto L20;
        return r7;
    L23:
        int r1 = r0 - r7;
        byte[] r4 = new byte[r1];
        System.arraycopy(r10, r7, r4, 0, r1);
        int r13 = a(r4, 0, r12);
        String r14 = a;
        JL_Log.i(r14, "findPacketData", "check left data, index = " + r13);
        if (r13 >= r3.length) goto L27;
        b(r10, r11, r2);
        return -1;
    L27:
        int r15 = r7 + r13;
        JL_Log.w(r14, "findPacketData", "found headIndex = " + r15);
        return r15;
    L15:
        b(r10, r11, r2);
        return -1;
    L9:
        b(r10, r11, r2);
        return -1;
    L33:
        r11 = r11 + 1;
        goto L4
    L34:
        return -1;
    }

    private static byte[] b(byte[] r5) {
        int r0 = r5.length;
        int r1 = h;
        if (r1 <= 0) goto L7;
        byte[] r2 = new byte[r1 + r0];
        System.arraycopy(g, 0, r2, 0, r1);
        System.arraycopy(r5, 0, r2, h, r0);
        h = 0;
        return r2;
    L7:
        return (byte[]) r5.clone();
    }

    private static BasePacket c(byte[] r10) {
        if (r10 == null) goto L14;
        int r1 = 4;
        if (r10.length < 4) goto L16;
        byte[] r2 = CHexConver.getBooleanArrayBig(r10[0]);
        int r4 = CHexConver.byteToInt(r10[1]);
        int r6 = CHexConver.bytesToInt(r10, 2, 2);
        BasePacket r7 = new BasePacket();
        int r8 = CHexConver.byteToInt(r2[7]);
        int r3 = CHexConver.byteToInt(r2[6]);
        r7.setType(r8);
        r7.setHasResponse(r3);
        r7.setOpCode(r4);
        r7.setParamLen(r6);
        if (r6 <= 0) goto L13;
        if (r8 != 0) goto L9;
        r7.setStatus(CHexConver.byteToInt(r10[4]));
        r1 = 5;
    L9:
        r7.setOpCodeSn(CHexConver.byteToInt(r10[r1]));
        int r5 = r1 + 1;
        if (r4 != 1) goto L12;
        r7.setXmOpCode(CHexConver.byteToInt(r10[r5]));
        r5 = r1 + 2;
    L12:
        int r9 = r6 - (r5 - 4);
        byte[] r11 = new byte[r9];
        System.arraycopy(r10, r5, r11, 0, r9);
        r7.setParamData(r11);
        JL_Log.d(a, "parsePacketData", CommonUtil.formatString("packet type : %d, opCode : %d, sn :%d", new Object[]{Integer.valueOf(r7.getType()), Integer.valueOf(r7.getOpCode()), Integer.valueOf(r7.getOpCodeSn())}));
    L13:
        return r7;
    L16:
        return null;
    L14:
        return null;
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

    public static CommandBase convert2Command(BasePacket r1, CommandBase r2) {
        if (r1 == null) goto L8;
        CommandBase r0 = a(r1, r2);
        if (r0 == null) goto L7;
        return r0;
    L7:
        return new RcspCmdHandler().parseDataToCmd(r1, r2);
    L8:
        return null;
    }

    public static int convertVersionByString(String r8) {
        if (TextUtils.isEmpty(r8) == true) goto L15;
        JL_Log.i(a, "convertVersionByString", "version = " + r8);
        String[] r9 = r8.replace(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "").replace("v", "").split("\\.");
        int r0 = r9.length;
        int[] r2 = new int[r0];
        int r4 = 0;
    L6:
        if (r4 >= r9.length) goto L12;
        String r5 = r9[r4];
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
        byte[] r10 = CHexConver.getBooleanArray((byte) r2[2]);
        byte[] r11 = CHexConver.getBooleanArray((byte) r2[3]);
        byte[] r12 = new byte[8];
        System.arraycopy(r10, 4, r12, 0, 4);
        System.arraycopy(r11, 4, r12, 4, 4);
        byte r13 = (byte) a(r12);
        JL_Log.i(a, "convertVersionByString", "versionCode : 0, heightValue : " + CHexConver.byte2HexStr(r7) + ", lowValue : " + CHexConver.byte2HexStr(r12));
        return CHexConver.bytesToInt(r3, r13);
    L15:
        return 0;
    }

    public static ArrayList<BasePacket> findPacketData(BluetoothDevice r0, int r1, byte[] r2) {
        return findPacketData(r1, r2);
    }

    public static String hexDataCovetToAddress(byte[] r4) {
        StringBuilder r0 = new StringBuilder();
        if (r4 == null) goto L14;
        if (r4.length != 6) goto L14;
        int r1 = 0;
    L8:
        if (r1 >= r4.length) goto L14;
        char[] r2 = i;
        r0.append(r2[(r4[r1] & 255) >> 4]);
        r0.append(r2[r4[r1] & 15]);
        if (r1 == (r4.length - 1)) goto L12;
        r0.append(CertificateUtil.DELIMITER);
    L12:
        r1 = r1 + 1;
    L14:
        return r0.toString();
    }

    public static byte[] packSendBasePacket(BasePacket r16) {
        if (r16 == null) goto L34;
        int r5 = r16.getParamLen();
        int r6 = r5 + 4;
        byte[] r7 = new byte[r5 + 8];
        byte[] r8 = new byte[r6];
        byte[] r10 = new byte[2];
        if (r16.getType() != 1) goto L8;
        r10[0] = (byte) (r10[0] | 128);
    L8:
        if (r16.getHasResponse() != 1) goto L10;
        r10[0] = (byte) (r10[0] | 64);
    L10:
        r10[1] = (byte) r16.getOpCode();
        byte[] r11 = CHexConver.int2byte2(r5);
        byte[] r12 = new byte[r5];
        byte[] r14 = {(byte) r16.getStatus()};
        byte[] r15 = {(byte) r16.getOpCodeSn()};
        if (r16.getType() != 1) goto L22;
        System.arraycopy(r15, 0, r12, 0, 1);
        if (r16.getOpCode() != 1) goto L15;
        System.arraycopy(new byte[]{(byte) r16.getXmOpCode()}, 0, r12, 1, 1);
        int r13 = 2;
    L17:
        if (r16.getParamData() == null) goto L29;
        int r17 = r5 - r13;
        if (r16.getParamData().length < r17) goto L29;
        System.arraycopy(r16.getParamData(), 0, r12, r13, r17);
    L21:
        r13 = r13 + r17;
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
        if (r16.getOpCode() != 1) goto L25;
        System.arraycopy(new byte[]{(byte) r16.getXmOpCode()}, 0, r12, 2, 1);
        r13 = 3;
    L27:
        if (r16.getParamData() == null) goto L29;
        r17 = r5 - r13;
        System.arraycopy(r16.getParamData(), 0, r12, r13, r17);
        goto L21
    L25:
        r13 = 2;
        goto L27
    L34:
        return null;
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

    public static void parseTargetInfo(TargetInfoResponse r1, BasePacket r2) {
        byte[] r3 = r2.getParamData();
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.length == 0) goto L10;
        r1.parse(r3);
        return;
    }

    public static ArrayList<BasePacket> findPacketData(int r8, byte[] r9) {
        if (r8 == 0) goto L18;
        if (r9 != null) goto L5;
        return null;
    L5:
        if (r9.length == 0) goto L25;
        ArrayList<BasePacket> r0 = new ArrayList();
        byte[] r10 = b(r9);
        int r1 = r10.length;
        JL_Log.d(a, "findPacketData", "data : " + CHexConver.byte2HexStr(r10));
        int r3 = 0;
    L8:
        if (r3 >= r1) goto L17;
        int r4 = a(r10, r3, r8);
        if (r4 < f.length) goto L11;
        JL_Log.i(a, "findPacketData", "prefixIndex = " + r4);
        int r5 = CHexConver.bytesToInt(r10, r4 + 2, 2);
        int r6 = r5 + 4;
        byte[] r7 = new byte[r6];
        System.arraycopy(r10, r4, r7, 0, r6);
        BasePacket r11 = c(r7);
        if (r11 == null) goto L16;
        r0.add(r11);
    L16:
        r3 = ((r4 + 4) + r5) + 1;
        goto L8
    L11:
        JL_Log.w(a, "findPacketData", "not find head data : ");
        return r0;
    L17:
        return r0;
    L25:
        return null;
    L18:
        return null;
    }

    private static void b(byte[] r2, int r3, int r4) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.length <= 0) goto L12;
        if (r3 < 0) goto L13;
        if (r4 > 0) goto L8;
        return;
    L8:
        if ((r3 + r4) > r2.length) goto L15;
        byte[] r0 = new byte[r4];
        g = r0;
        System.arraycopy(r2, r3, r0, 0, r4);
        h = r4;
        return;
    L15:
        return;
    L13:
        return;
    }

    private static CommandBase a(BasePacket r2, CommandBase r3) {
        if (r2 == null) goto L9;
        Map<Integer, ICmdHandler> r0 = Command.getValidCommandList();
        if (r0 == null) goto L11;
        ICmdHandler r1 = r0.get(Integer.valueOf(r2.getOpCode()));
        if (r1 != null) goto L8;
        return null;
    L8:
        return r1.parseDataToCmd(r2, r3);
    L11:
        return null;
    L9:
        return null;
    }

    private static int a(byte[] r5) {
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
