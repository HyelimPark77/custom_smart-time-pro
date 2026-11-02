package com.jieli.bluetooth_connect.util;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bt.decryption.HashDecryption;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class ParseDataUtil {
    private static final String TAG = "ParseDataUtil";
    private static final char[] mChars = null;

    static {
        mChars = "0123456789ABCDEF".toCharArray();
    }

    public ParseDataUtil() {
    }

    public static String hexDataCovetToAddress(byte[] data) {
        StringBuilder r0 = new StringBuilder();
        if (data == null) goto L14;
        if (data.length != 6) goto L14;
        int r1 = 0;
    L8:
        if (r1 >= data.length) goto L14;
        char[] r2 = mChars;
        r0.append(r2[(data[r1] & 255) >> 4]);
        r0.append(r2[data[r1] & 15]);
        if (r1 == (data.length - 1)) goto L12;
        r0.append(CertificateUtil.DELIMITER);
    L12:
        r1 = r1 + 1;
    L14:
        return r0.toString();
    }

    public static BleScanMessage isFilterBleDevice(BluetoothOption option, byte[] scanData) {
        if (option == null) goto L49;
        if (scanData == null) goto L49;
        if (scanData.length <= 0) goto L49;
        int r1 = scanData.length;
        int r3 = 0;
    L8:
        int r4 = r3 + 2;
        if (r4 > r1) goto L49;
        int r5 = CHexConverter.byteToInt(scanData[r3]);
        if (r5 == 0) goto L12;
        if (r5 < 1) goto L49;
        if (r5 >= (r1 - r3)) goto L49;
        int r7 = r3 + 1;
        if (CHexConverter.byteToInt(scanData[r7]) == 255) goto L20;
        r3 = r3 + (r5 + 1);
        goto L8
    L20:
        if ((r7 + r5) <= r1) goto L23;
        JL_Log.e(TAG, "isFilterBleDevice", "totalLen is error.");
        return null;
    L23:
        int r2 = r5 - 1;
        byte[] r6 = new byte[r2];
        System.arraycopy(scanData, r4, r6, 0, r2);
        if (r2 <= 2) goto L49;
        byte[] r8 = new byte[2];
        System.arraycopy(r6, 0, r8, 0, 2);
        int r9 = CHexConverter.bytesToInt(r8[1], r8[0]);
        int r10 = r5 - 3;
        byte[] r11 = new byte[r10];
        System.arraycopy(r6, 2, r11, 0, r10);
        BleScanMessage r12 = parseWithOTAFlagFilter(r6, option.getOtaScanFilterData());
        if (r12 == null) goto L28;
        return r12;
    L28:
        int r13 = option.getBleScanStrategy();
        if (r13 == 1) goto L36;
        if (r13 == 2) goto L35;
        if (r13 == 3) goto L33;
    L32:
        char r14 = 2;
    L39:
        if (r12 == null) goto L49;
        if (r14 == 2) goto L43;
        if (r14 != 3) goto L49;
    L47:
        return r12;
    L43:
        r12.setVid(r9);
        String r15 = r12.getFlagContent();
        if (TextUtils.isEmpty(r15) == true) goto L49;
        if (r15.equals(option.getScanFilterData()) == false) goto L49;
    L33:
        r12 = parseBleScanMsg(3, r11, r6);
    L34:
        r14 = 3;
        goto L39
    L35:
        r12 = parseBleScanMsg(2, r11, r6);
        goto L32
    L36:
        r12 = parseBleScanMsg(3, r11, r6);
        if (r12 != null) goto L34;
        r12 = parseBleScanMsg(2, r11, r6);
        goto L32
    L12:
        r3 = r3 + 1;
    L49:
        return null;
    }

    private static BleScanMessage parseBleScanMsg(int filterWay, byte[] data, byte[] manufacturerData) {
        if (filterWay == 2) goto L11;
        if (filterWay == 3) goto L9;
        return null;
    L9:
        return parseWithHashFilter(manufacturerData);
    L11:
        return parseWithFlagFilter(data);
    }

    public static BleScanMessage parseOTAFlagFilterWithBroad(byte[] advData, String filterFlag) {
        BleScanMessage r0 = null;
        if (advData != null) goto L5;
    L23:
        return r0;
    L5:
        if (advData.length <= 2) goto L23;
        int r2 = 0;
    L8:
        int r3 = r2 + 2;
        if (r3 > advData.length) goto L23;
        int r4 = CHexConverter.byteToInt(advData[r2]);
        if (r4 == 0) goto L12;
        if (r4 < 1) goto L23;
        int r5 = r2 + 1;
        if ((r5 + r4) >= advData.length) goto L23;
        if (CHexConverter.byteToInt(advData[r5]) != 255) goto L22;
        int r1 = r4 - 1;
        byte[] r6 = new byte[r1];
        System.arraycopy(advData, r3, r6, 0, r1);
        r0 = parseWithOTAFlagFilter(r6, filterFlag);
        if (r0 == null) goto L22;
        return r0;
    L22:
        r2 = r2 + (r4 + 1);
        goto L8
    L12:
        r2 = r2 + 1;
        goto L8
    }

    private static BleScanMessage parseTwsADV(byte[] data, BleScanMessage message) {
        if (data == null) goto L27;
        if (message == null) goto L27;
        int r1 = message.getDeviceType();
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L26;
        if (r1 == 3) goto L22;
        if (r1 == 4) goto L26;
        if (r1 == 5) goto L20;
        return null;
    L20:
        return parseWithWatch(data, message);
    L22:
        return parseWithTwsVer2(data, message);
    L24:
        return parseWithChargingBin(data, message);
    L26:
        return parseWithTwsVer1(data, message);
    L27:
        return null;
    }

    private static BleScanMessage parseWithChargingBin(byte[] data, BleScanMessage message) {
        if (message == null) goto L50;
        if (message.getVersion() > 1) goto L50;
        if (message.getVersion() != 0) goto L12;
        if (data.length != 29) goto L50;
    L12:
        if (data.length >= 16) goto L14;
        return null;
    L14:
        ByteBuffer r9 = ByteBuffer.wrap(data);
        r9.get(new byte[7]);
        byte[] r11 = new byte[6];
        ByteBuffer r10 = r9.get(r11);
        String r12 = hexDataCovetToAddress(r11);
        byte r13 = r10.get();
        int r14 = (r13 >> 7) & 1;
        int r5 = (r13 >> 6) & 1;
        int r15 = r13 & 15;
        byte r16 = r10.get();
        int r7 = (r16 >> 7) & 1;
        int r8 = r16 & 127;
        byte r18 = r10.get();
        int r6 = (r18 >> 7) & 1;
        int r2 = r18 & 127;
        byte r21 = r10.get();
        int r4 = (r21 >> 7) & 1;
        int r17 = r21 & 127;
        int r3 = CHexConverter.byteToInt(r10.get());
        if (message.getVersion() != 0) goto L36;
        int r19 = (r10.get() >> 7) & 1;
        byte[] r110 = new byte[8];
        r10.get(new byte[2]).get(r110).rewind();
        byte[] r111 = new byte[16];
        System.arraycopy(data, 0, r111, 0, 16);
        byte[] r20 = new byte[16];
        HashDecryption.decrypt(r111, 16, new byte[]{r13, r16, r18, r21}, 4, r20);
        byte[] r22 = new byte[8];
        int r112 = 0;
    L17:
        if (r112 >= 8) goto L20;
        int r113 = r112 + 1;
        r22[r112] = r20[r112 + r113];
        r112 = r113;
        goto L17
    L20:
        if (Arrays.equals(r110, r22) == false) goto L35;
        BleScanMessage r0 = message.setEdrAddr(r12).setSeq(r3).setTwsFlag(r14).setChargingBinStatus(r5).setAction(r15).setEdrStatus(r15);
        if (r7 != 1) goto L24;
        boolean r23 = true;
    L25:
        BleScanMessage r1 = r0.setLeftCharging(r23).setLeftDeviceQuantity(r8);
        if (r6 != 1) goto L28;
        boolean r24 = true;
    L29:
        BleScanMessage r25 = r1.setRightCharging(r24).setRightDeviceQuantity(r2);
        if (r4 != 1) goto L32;
        boolean r26 = true;
    L33:
        r25.setDeviceCharging(r26).setChargingBinQuantity(r17).setChargingBinMode(r19).setHash(r110);
        return message;
    L32:
        r26 = false;
        goto L33
    L28:
        r24 = false;
        goto L29
    L24:
        r23 = false;
        goto L25
    L35:
        return null;
    L36:
        r10.rewind();
        BleScanMessage r27 = message.setEdrAddr(r12).setSeq(r3).setTwsFlag(r14).setChargingBinStatus(r5).setAction(r15).setEdrStatus(r15);
        if (r7 != 1) goto L39;
        boolean r28 = true;
    L40:
        BleScanMessage r29 = r27.setLeftCharging(r28).setLeftDeviceQuantity(r8);
        if (r6 != 1) goto L43;
        boolean r30 = true;
    L44:
        BleScanMessage r31 = r29.setRightCharging(r30).setRightDeviceQuantity(r2);
        if (r4 != 1) goto L47;
        boolean r32 = true;
    L48:
        r31.setDeviceCharging(r32).setChargingBinQuantity(r17);
        return message;
    L47:
        r32 = false;
        goto L48
    L43:
        r30 = false;
        goto L44
    L39:
        r28 = false;
    L50:
        return null;
    }

    private static BleScanMessage parseWithFlagFilter(byte[] data) {
        if (data != null) goto L5;
    L50:
        return null;
    L5:
        if (data.length <= 0) goto L50;
        int r1 = data.length;
        BleScanMessage r4 = null;
        int r3 = 0;
    L7:
        int r5 = r3 + 2;
        if (r5 > r1) goto L49;
        int r6 = CHexConverter.byteToInt(data[r3]);
        if (r6 <= 0) goto L49;
        int r7 = CHexConverter.byteToInt(data[r3 + 1]);
        int r8 = r6 - 1;
        byte[] r9 = new byte[r8];
        if (r8 <= 0) goto L48;
        if (((r8 + r3) + 2) > r1) goto L48;
        System.arraycopy(data, r5, r9, 0, r8);
        r3 = r3 + (r6 + 1);
        if (r4 != null) goto L18;
        r4 = new BleScanMessage();
    L18:
        if (r7 != 0) goto L19;
        r4.setFlagContent(new String(r9));
        goto L7
    L19:
        boolean r10 = true;
        if (r7 != 1) goto L21;
        if (r8 != 1) goto L7;
        r4.setPairedFlag(CHexConverter.byteToInt(r9[0]));
        goto L7
    L21:
        if (r7 != 2) goto L23;
        r4.setPhoneVirtualAddress(r9);
        goto L7
    L23:
        if (r7 != 3) goto L25;
        if (r8 < 3) goto L7;
        r4.setPid(CHexConverter.bytesToInt(r9[1], r9[0]));
        if (CHexConverter.byteToInt(r9[2]) == 1) goto L43;
        r10 = false;
    L43:
        r4.setShowDialog(r10);
        goto L7
    L25:
        if (r7 != 4) goto L7;
        if (r8 < 6) goto L7;
        byte[] r11 = new byte[6];
        System.arraycopy(r9, 0, r11, 0, 6);
        r4.setEdrAddr(hexDataCovetToAddress(r11));
        if (r8 < 7) goto L7;
        r4.setEdrStatus(CHexConverter.byteToInt(r9[6]));
        if (r8 < 8) goto L7;
        byte r12 = r9[7];
        int r13 = (r12 >> 7) & 1;
        int r14 = r12 & 127;
        if (r13 == 1) goto L37;
        r10 = false;
    L37:
        r4.setLeftCharging(r10);
        r4.setLeftDeviceQuantity(r14);
    L48:
        return null;
    L49:
        return r4;
    }

    private static BleScanMessage parseWithHashFilter(byte[] data) {
        if (data != null) goto L4;
        return null;
    L4:
        if (data.length < 7) goto L11;
        byte[] r2 = new byte[2];
        ByteBuffer r0 = ByteBuffer.wrap(data).get(r2);
        int r4 = CHexConverter.bytesToInt(r2[1], r2[0]);
        ByteBuffer r1 = r0.get(r2);
        int r6 = CHexConverter.bytesToInt(r2[1], r2[0]);
        ByteBuffer r3 = r1.get(r2);
        int r5 = CHexConverter.bytesToInt(r2[1], r2[0]);
        byte r7 = r3.get();
        int r8 = (r7 >> 4) & 255;
        BleScanMessage r9 = new BleScanMessage().setVid(r4).setUid(r6).setPid(r5).setDeviceType(r8);
        BleScanMessage r10 = r9.setVersion(r7 & 15).setShowDialog(true);
        if (data.length > 7) goto L8;
        return null;
    L8:
        return parseTwsADV(data, r10);
    L11:
        return null;
    }

    public static BleScanMessage parseWithOTAFlagFilter(byte[] manufacturerData, String filterFlag) {
        if (manufacturerData == null) goto L22;
        if (filterFlag == null) goto L22;
        if (filterFlag.length() == 0) goto L22;
        if (manufacturerData.length <= (filterFlag.getBytes().length + 2)) goto L22;
        ByteBuffer r9 = ByteBuffer.wrap(manufacturerData);
        r9.order(ByteOrder.LITTLE_ENDIAN);
        short r1 = r9.getShort();
        byte[] r2 = new byte[filterFlag.getBytes().length];
        ByteBuffer r10 = r9.get(r2);
        if (Arrays.equals(reverseBuf(r2), filterFlag.getBytes()) == true) goto L13;
        return null;
    L13:
        int r11 = CHexConverter.byteToInt(r10.get());
        JL_Log.d(TAG, "parseWithOTAFlagFilter", "version :" + r11);
        if (r11 == 0) goto L20;
        if (r11 == 1) goto L18;
        JL_Log.i(TAG, "parseWithOTAFlagFilter", "Not support version : " + r11);
        return null;
    L18:
        byte[] r0 = new byte[6];
        ByteBuffer r12 = r10.get(r0);
        String r3 = hexDataCovetToAddress(reverseBuf(r0));
        short r4 = r12.getShort();
        short r5 = r12.getShort();
        byte r6 = r12.get();
        int r7 = CHexConverter.byteToInt(r12.get());
        byte[] r8 = new byte[r12.remaining()];
        r12.get(r8);
        return new BleScanMessage().setOTA(true).setOtaADVVersion(r11).setOtaBleAddress(r3).setVid(r1).setUid(r4).setPid(r5).setDeviceType((r6 >> 4) & 255).setVersion(r6 & 15).setLeftDeviceQuantity(r7).setOtaADVReserve(r8);
    L20:
        byte[] r13 = new byte[6];
        ByteBuffer r14 = r10.get(r13);
        String r15 = hexDataCovetToAddress(reverseBuf(r13));
        byte[] r16 = new byte[r14.remaining()];
        r14.get(r16);
        return new BleScanMessage().setOTA(true).setVid(r1).setOtaADVVersion(r11).setOtaBleAddress(r15).setOtaADVReserve(r16);
    L22:
        return null;
    }

    private static BleScanMessage parseWithTwsVer1(byte[] r25, BleScanMessage r26) {
        if (r25.length == 29) goto L5;
        return null;
    L5:
        ByteBuffer r8 = ByteBuffer.wrap(r25);
        r8.get(new byte[7]);
        byte[] r9 = new byte[6];
        ByteBuffer r10 = r8.get(r9);
        String r11 = hexDataCovetToAddress(r9);
        byte r12 = r10.get();
        int r13 = CHexConverter.byteToInt(r12);
        byte r14 = r10.get();
        int r15 = (r14 >> 7) & 1;
        int r16 = r14 & 127;
        byte r17 = r10.get();
        int r7 = (r17 >> 7) & 1;
        int r18 = r17 & 127;
        byte r19 = r10.get();
        int r2 = (r19 >> 7) & 1;
        int r4 = r19 & 127;
        int r3 = CHexConverter.byteToInt(r10.get());
        if (r26.getVersion() == 1) goto L12;
        if (r26.getVersion() == 2) goto L12;
        byte r5 = 0;
    L14:
        if (r26.getVersion() != 1) goto L16;
        int r6 = 2;
    L21:
        byte[] r110 = new byte[8];
        r10.get(new byte[r6]).get(r110).rewind();
        byte[] r20 = new byte[16];
        System.arraycopy(r25, 0, r20, 0, 16);
        byte[] r111 = {r12, r14, r17, r19};
        byte[] r0 = new byte[16];
        byte r112 = r5;
        HashDecryption.decrypt(r20, 16, r111, 4, r0);
        byte[] r21 = new byte[8];
        int r113 = 0;
    L22:
        if (r113 >= 8) goto L25;
        int r22 = r113 + 1;
        r21[r113] = r0[r113 + r22];
        r113 = r22;
        goto L22
    L25:
        if (Arrays.equals(r110, r21) == false) goto L46;
        BleScanMessage r1 = r26.setEdrAddr(r11).setSeq(r3).setAction(r13).setEdrStatus(r13);
        if (r15 != 1) goto L29;
        boolean r23 = true;
    L30:
        BleScanMessage r24 = r1.setLeftCharging(r23).setLeftDeviceQuantity(r16);
        if (r7 != 1) goto L33;
        boolean r27 = true;
    L34:
        BleScanMessage r28 = r24.setRightCharging(r27).setRightDeviceQuantity(r18);
        if (r2 != 1) goto L37;
        boolean r29 = true;
    L38:
        r28.setDeviceCharging(r29).setChargingBinQuantity(r4).setHash(r110);
        if (r26.getVersion() != 1) goto L43;
        r26.setEnableConnect(CHexConverter.checkBitValue(r112, 0)).setSupportChargingCase(CHexConverter.checkBitValue(r112, 1));
        return r26;
    L43:
        if (r26.getVersion() != 2) goto L45;
        r26.setConnectWay(CHexConverter.checkBitValue(r112, 0) ? 1 : 0).setSupportChargingCase(CHexConverter.checkBitValue(r112, 1));
    L45:
        return r26;
    L37:
        r29 = false;
        goto L38
    L33:
        r27 = false;
        goto L34
    L29:
        r23 = false;
        goto L30
    L46:
        return null;
    L16:
        if (r26.getVersion() != 2) goto L18;
        r6 = 2;
        goto L21
    L18:
        r6 = 3;
    L12:
        r5 = r10.get();
        goto L14
    }

    private static BleScanMessage parseWithTwsVer2(byte[] data, BleScanMessage message) {
        if (data.length >= 10) goto L6;
        return null;
    L6:
        ByteBuffer r8 = ByteBuffer.wrap(data);
        r8.get(new byte[7]);
        byte r0 = r8.get();
        boolean r2 = true;
        int r1 = (r0 >> 7) & 1;
        int r3 = r0 & 127;
        byte r4 = r8.get();
        int r5 = (r4 >> 7) & 1;
        int r6 = r4 & 127;
        byte r9 = r8.get();
        int r7 = (r9 >> 7) & 1;
        int r10 = (r9 >> 6) & 1;
        int r11 = (r9 >> 5) & 1;
        int r12 = r9 & 15;
        BleScanMessage r13 = message.setTwsFlag(r7).setMainDevFlag(r10);
        if (r11 != 1) goto L9;
        boolean r14 = true;
    L10:
        BleScanMessage r15 = r13.setEnableConnect(r14).setAction(r12);
        if (r1 != 1) goto L13;
        boolean r16 = true;
    L14:
        BleScanMessage r17 = r15.setLeftCharging(r16).setLeftDeviceQuantity(r3);
        if (r5 == 1) goto L18;
        r2 = false;
    L18:
        r17.setRightCharging(r2).setRightDeviceQuantity(r6);
        return message;
    L13:
        r16 = false;
        goto L14
    L9:
        r14 = false;
        goto L10
    }

    private static BleScanMessage parseWithWatch(byte[] data, BleScanMessage message) {
        if (data.length >= 14) goto L6;
        return null;
    L6:
        byte[] r1 = new byte[6];
        System.arraycopy(data, 7, r1, 0, 6);
        message.setEdrAddr(hexDataCovetToAddress(r1));
        int r4 = data[13];
        message.setConnectWay((r4 >> 7) & 1);
        message.setAction(r4 & 15);
        return message;
    }

    private static byte[] reverseBuf(byte[] data) {
        if (data != null) goto L4;
    L11:
        return data;
    L4:
        if (data.length <= 1) goto L11;
        byte[] r0 = new byte[data.length];
        int r2 = 0;
    L8:
        if (r2 >= data.length) goto L10;
        r0[r2] = data[(data.length - r2) - 1];
        r2 = r2 + 1;
        goto L8
    L10:
        return r0;
    }
}
