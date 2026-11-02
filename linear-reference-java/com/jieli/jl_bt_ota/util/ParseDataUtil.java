package com.jieli.jl_bt_ota.util;

import com.facebook.internal.security.CertificateUtil;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class ParseDataUtil {
    private static final String a = "ParseDataUtil";
    private static final char[] b = null;

    static {
        b = "0123456789ABCDEF".toCharArray();
        System.loadLibrary(BluetoothConstant.JL_AUTH);
    }

    public ParseDataUtil() {
    }

    private static byte[] a(byte[] r4) {
        if (r4 != null) goto L4;
    L11:
        return r4;
    L4:
        if (r4.length <= 1) goto L11;
        byte[] r0 = new byte[r4.length];
        int r2 = 0;
    L8:
        if (r2 >= r4.length) goto L10;
        r0[r2] = r4[(r4.length - r2) - 1];
        r2 = r2 + 1;
        goto L8
    L10:
        return r0;
    }

    public static int filterFile(byte[] r1, int r2, int r3) {
        return nativeFilterFile(r1, r2, r3, 0);
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

    private static native int nativeFilterFile(byte[] r0, int r1, int r2, int r3);

    public static BleScanMessage parseOTAFlagFilterWithBroad(byte[] r8, String r9) {
        BleScanMessage r0 = null;
        if (r8 != null) goto L5;
    L23:
        return r0;
    L5:
        if (r8.length <= 2) goto L23;
        int r2 = 0;
    L8:
        int r3 = r2 + 2;
        if (r3 > r8.length) goto L23;
        int r4 = CHexConver.byteToInt(r8[r2]);
        if (r4 == 0) goto L12;
        if (r4 < 1) goto L23;
        int r5 = r2 + 1;
        if ((r5 + r4) >= r8.length) goto L23;
        if (CHexConver.byteToInt(r8[r5]) != 255) goto L22;
        int r1 = r4 - 1;
        byte[] r6 = new byte[r1];
        System.arraycopy(r8, r3, r6, 0, r1);
        r0 = parseWithOTAFlagFilter(r6, r9);
        if (r0 == null) goto L22;
        return r0;
    L22:
        r2 = r2 + (r4 + 1);
        goto L8
    L12:
        r2 = r2 + 1;
        goto L8
    }

    public static BleScanMessage parseWithOTAFlagFilter(byte[] r10, String r11) {
        if (r10 == null) goto L20;
        if (r11 == null) goto L20;
        if (r11.length() == 0) goto L20;
        if (r10.length <= (r11.getBytes().length + 2)) goto L20;
        ByteBuffer r12 = ByteBuffer.wrap(r10);
        r12.order(ByteOrder.LITTLE_ENDIAN);
        short r1 = r12.getShort();
        byte[] r2 = new byte[r11.getBytes().length];
        ByteBuffer r13 = r12.get(r2);
        byte[] r3 = a(r2);
        if (Arrays.equals(r3, r11.getBytes()) == true) goto L14;
        JL_Log.i(a, "parseWithOTAFlagFilter", CommonUtil.formatString("flag not match. adv flag : %s, flag : %s", new Object[]{CHexConver.byte2HexStr(r3), CHexConver.byte2HexStr(r11.getBytes())}));
        return null;
    L14:
        int r0 = CHexConver.byteToInt(r13.get());
        if (r0 == 1) goto L18;
        byte[] r4 = new byte[6];
        ByteBuffer r14 = r13.get(r4);
        String r5 = hexDataCovetToAddress(a(r4));
        r14.get(new byte[r14.remaining()]);
        return new BleScanMessage().setVid(r1).setOTA(true).setIdentify(r11).setVersion(r0).setOldBleAddress(r5);
    L18:
        byte[] r6 = new byte[6];
        ByteBuffer r15 = r13.get(r6);
        String r7 = hexDataCovetToAddress(a(r6));
        short r8 = r15.getShort();
        short r9 = r15.getShort();
        byte r16 = r15.get();
        int r17 = (r16 >> 4) & 255;
        int r18 = CHexConver.byteToInt(r15.get());
        r15.get(new byte[r15.remaining()]);
        BleScanMessage r19 = new BleScanMessage().setOTA(true).setIdentify(r11).setVersion(r0).setOldBleAddress(r7).setVid(r1).setUid(r8).setPid(r9).setDeviceType(r17);
        return r19.setDeviceVersion(r16 & 15).setBattery(r18);
    L20:
        return null;
    }
}
