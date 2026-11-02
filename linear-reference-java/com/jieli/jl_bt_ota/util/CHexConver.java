package com.jieli.jl_bt_ota.util;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.facebook.internal.security.CertificateUtil;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class CHexConver {
    private static final String a = "0123456789ABCDEF";
    private static final char[] b = null;
    private static final int c = 17;

    static {
        b = "0123456789ABCDEF".toCharArray();
    }

    public CHexConver() {
    }

    private static String a(char r1) {
        if (r1 != '0') goto L7;
        return "0000";
    L7:
        if (r1 != '1') goto L11;
        return "0001";
    L11:
        if (r1 != '2') goto L15;
        return "0010";
    L15:
        if (r1 != '3') goto L19;
        return "0011";
    L19:
        if (r1 != '4') goto L23;
        return "0100";
    L23:
        if (r1 != '5') goto L27;
        return "0101";
    L27:
        if (r1 != '6') goto L31;
        return "0110";
    L31:
        if (r1 != '7') goto L35;
        return "0111";
    L35:
        if (r1 != '8') goto L39;
        return X10i1i.OXO1;
    L39:
        if (r1 != '9') goto L43;
        return "1001";
    L43:
        if (r1 != 'A') goto L45;
        return "1010";
    L45:
        if (r1 != 'a') goto L48;
        return "1010";
    L48:
        if (r1 != 'B') goto L50;
        return "1011";
    L50:
        if (r1 != 'b') goto L53;
        return "1011";
    L53:
        if (r1 != 'C') goto L55;
        return "1100";
    L55:
        if (r1 != 'c') goto L58;
        return "1100";
    L58:
        if (r1 != 'D') goto L60;
        return "1101";
    L60:
        if (r1 != 'd') goto L63;
        return "1101";
    L63:
        if (r1 != 'E') goto L65;
        return "1110";
    L65:
        if (r1 != 'e') goto L68;
        return "1110";
    L68:
        if (r1 != 'F') goto L70;
        return "1111";
    L70:
        if (r1 == 'f') goto L86;
        return "";
    L86:
        return "1111";
    }

    public static byte[] addressCovertToByteArray(String r7) {
        if (checkBluetoothAddress(r7) == false) goto L5;
        String r8 = r7.replace(CertificateUtil.DELIMITER, "");
        int r0 = r8.length() / 2;
        byte[] r2 = new byte[r0];
        if (r0 != 6) goto L9;
        int r3 = 0;
    L11:
        if (r3 >= r0) goto L20;
        int r4 = r3 * 2;
        int r5 = r4 + 2;
        if (r5 > r8.length()) goto L19;
        r2[r3] = (byte) Integer.valueOf(r8.substring(r4, r5), 16).intValue();     // Catch: Exception -> L16
    L16:
        e = move-exception;
        e.printStackTrace();
        return new byte[0];
    L19:
        r3 = r3 + 1;
        goto L11
    L20:
        return r2;
    L9:
        return new byte[0];
    L5:
        return new byte[0];
    }

    public static String byte2HexStr(byte[] r4, int r5) {
        if (r4 != null) goto L5;
        return "";
    L5:
        int r6 = Math.min(r4.length, r5);
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L6:
        if (r1 >= r6) goto L13;
        char[] r2 = b;
        r0.append(r2[(r4[r1] & 255) >> 4]);
        r0.append(r2[r4[r1] & 15]);
        if (r1 == (r6 - 1)) goto L11;
        r0.append(" ");
    L11:
        r1 = r1 + 1;
        goto L6
    L13:
        return r0.toString().trim().toUpperCase(Locale.US);
    }

    public static String byteToBit(byte r2) {
        return "" + ((byte) ((r2 >> 7) & 1)) + ((byte) ((r2 >> 6) & 1)) + ((byte) ((r2 >> 5) & 1)) + ((byte) ((r2 >> 4) & 1)) + ((byte) ((r2 >> 3) & 1)) + ((byte) ((r2 >> 2) & 1)) + ((byte) ((r2 >> 1) & 1)) + ((byte) (r2 & 1));
    }

    public static String byteToHexString(byte r0) {
        return intToHexString(r0 & 255);
    }

    public static int byteToInt(byte r0) {
        return r0 & 255;
    }

    public static int bytesLittleToInt(byte[] r3) {
        if (r3 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r3.length < 4) goto L9;
        int r1 = (((r3[3] & 255) << 24) | ((r3[2] & 255) << 16)) | ((r3[1] & 255) << 8);
        return (r3[0] & 255) | r1;
    }

    public static int bytesToInt(byte r0, byte r1) {
        return ((r0 & 255) << 8) + (r1 & 255);
    }

    public static long bytesToLong(byte[] r2, boolean r3) {
        if (r2 != null) goto L4;
        return -1;
    L4:
        if (r2.length < 8) goto L14;
        ByteBuffer r4 = ByteBuffer.wrap(r2);
        if (r3 == false) goto L9;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
    L10:
        r4.order(r5);
        return r4.getLong();
    L9:
        r5 = ByteOrder.BIG_ENDIAN;
        goto L10
    L14:
        return -1;
    }

    public static short bytesToShort(byte r0, byte r1) {
        return (short) bytesToInt(r0, r1);
    }

    public static String bytesToStr(byte[] r0) {
        if (r0 != null) goto L6;
        return "";
    L6:
        return hexStr2ASCII(byte2HexStr(r0));
    }

    public static boolean checkBitValue(byte r0, int r1) {
        if (((r0 >> r1) & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean checkBluetoothAddress(String r6) {
        if (r6 != null) goto L5;
    L31:
        return false;
    L5:
        if (r6.length() != 17) goto L31;
        int r1 = 0;
    L9:
        if (r1 >= 17) goto L30;
        char r4 = r6.charAt(r1);
        int r5 = r1 % 3;
        if (r5 == 0) goto L21;
        if (r5 == 1) goto L21;
        if (r5 != 2) goto L28;
        if (r4 == ':') goto L28;
        return false;
    L28:
        r1 = r1 + 1;
    L21:
        if (r4 < '0') goto L25;
        if (r4 <= '9') goto L28;
    L25:
        if (r4 < 'A') goto L29;
        if (r4 <= 'F') goto L28;
    L29:
        return false;
    L30:
        return true;
    }

    public static boolean checkHexStr(String r6) {
        if (r6 != null) goto L5;
    L18:
        return false;
    L5:
        if (r6.isEmpty() == true) goto L18;
        String r7 = r6.trim().replaceAll("\\s*|\\r|\\n|\\t", "").toUpperCase(Locale.US);
        int r1 = r7.length();
        if (r1 <= 1) goto L18;
        if ((r1 % 2) != 0) goto L18;
        int r3 = 0;
    L12:
        if (r3 >= r1) goto L17;
        int r4 = r3 + 1;
        if ("0123456789ABCDEF".contains(r7.substring(r3, r4)) == false) goto L15;
        r3 = r4;
        goto L12
    L15:
        return false;
    L17:
        return true;
    }

    public static byte decodeBinaryString(String r4) {
        if (r4 != null) goto L5;
        return 0;
    L5:
        int r1 = r4.length();
        if (r1 == 4) goto L10;
        if (r1 == 8) goto L10;
        return 0;
    L10:
        if (r1 == 8) goto L12;
        int r5 = Integer.parseInt(r4, 2);
    L17:
        return (byte) r5;
    L12:
        if (r4.charAt(0) != '0') goto L14;
        r5 = Integer.parseInt(r4, 2);
        goto L17
    L14:
        r5 = Integer.parseInt(r4, 2) - 256;
        goto L17
    }

    public static byte decodeHexChar(char r1, char r2) {
        String r3 = a(r1);
        String r4 = a(r2);
        if (TextUtils.isEmpty(r3) == false) goto L7;
        r3 = "";
    L7:
        if (TextUtils.isEmpty(r4) == true) goto L10;
        r3 = r3 + r4;
    L10:
        if (TextUtils.isEmpty(r3) == false) goto L14;
        return 0;
    L14:
        return decodeBinaryString(r3);
    }

    public static int getBitByPosition(int r1, int r2) {
        if (r2 >= 0) goto L4;
        return 0;
    L4:
        if (r2 < 32) goto L6;
        return 0;
    L6:
        return (r1 >> r2) & 1;
    }

    public static byte[] getBooleanArray(byte r3) {
        byte[] r0 = new byte[8];
        int r1 = 7;
    L3:
        if (r1 < 0) goto L5;
        r0[r1] = (byte) (r3 & 1);
        r3 = (byte) (r3 >> 1);
        r1 = r1 - 1;
        goto L3
    L5:
        return r0;
    }

    public static byte[] getBooleanArrayBig(byte r4) {
        byte[] r1 = new byte[8];
        int r2 = 0;
    L3:
        if (r2 >= 8) goto L5;
        r1[r2] = (byte) (r4 & 1);
        r4 = (byte) (r4 >> 1);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
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

    public static String hexStr2ASCII(String r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        String r8 = r7.trim().replaceAll("\\s*|\\r|\\n|\\t", "").toUpperCase(Locale.US);
        char[] r0 = r8.toCharArray();
        int r9 = r8.length() / 2;
        byte[] r2 = new byte[r9];
        int r3 = 0;
    L6:
        if (r3 >= r9) goto L13;
        int r4 = r3 * 2;
        int r5 = "0123456789ABCDEF".indexOf(r0[r4]) << 4;
        r2[r3] = (byte) (("0123456789ABCDEF".indexOf(r0[r4 + 1]) | r5) & 255);
        r3 = r3 + 1;
        goto L6
    L13:
        return new String(r2, "GBK");
    L10:
        e = move-exception;
        e.printStackTrace();
        return "";
    }

    public static byte[] hexStr2Bytes(String r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        String r9 = r8.trim().replaceAll("\\s*|\\r|\\n|\\t", "").toUpperCase(Locale.US);
        int r0 = r9.length() / 2;
        byte[] r1 = new byte[r0];
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L8;
        int r3 = r2 * 2;
        int r4 = r3 + 1;
        r1[r2] = (byte) (Integer.decode(HexStringBuilder.DEFAULT_PREFIX + r9.substring(r3, r4) + r9.substring(r4, r3 + 2)).intValue() & 255);
        r2 = r2 + 1;
        goto L6
    L8:
        return r1;
    }

    public static String int2HexStr(int r1, int r2) {
        if (r2 != 2) goto L7;
        return String.format(Locale.ENGLISH, "%02x", new Object[]{Integer.valueOf(r1)});
    L7:
        return byte2HexStr(intToBigBytes(r1));
    }

    public static byte[] int2byte2(int r3) {
        return new byte[]{(byte) ((r3 >> 8) & 255), (byte) (r3 & 255)};
    }

    public static byte[] intToBigBytes(int r3) {
        return new byte[]{(byte) ((r3 >> 24) & 255), (byte) ((r3 >> 16) & 255), (byte) ((r3 >> 8) & 255), (byte) (r3 & 255)};
    }

    public static byte intToByte(int r0) {
        return (byte) r0;
    }

    public static String intToHexString(int r2) {
        return String.format(Locale.ENGLISH, "%02x", new Object[]{Integer.valueOf(r2)});
    }

    public static byte[] intToLittleBytes(int r5) {
        return new byte[]{(byte) (r5 & 255), (byte) ((r5 >> 8) & 255), (byte) ((r5 >> 16) & 255), (byte) ((r5 >> 24) & 255)};
    }

    public static byte[] intToLittleBytes2(int r3) {
        return new byte[]{(byte) (r3 & 255), (byte) ((r3 >> 8) & 255)};
    }

    public static byte setBitValue(byte r1, int r2, boolean r3) {
        int r4 = 1 << r2;
        if (r3 == false) goto L7;
        int r5 = r1 | r4;
    L6:
        return (byte) r5;
    L7:
        r5 = r1 & (~r4);
        goto L6
    }

    public static byte[] shortToBigBytes(short r0) {
        return int2byte2(r0);
    }

    public static byte[] shortToBytes(short r0) {
        return intToLittleBytes2(r0);
    }

    public static String str2HexStr(String r2) {
        byte[] r0 = null;
        if (r2 != null) goto L17;
        return null;
    L17:
        r0 = r2.getBytes("GBK");     // Catch: UnsupportedEncodingException -> L7
    L9:
        if (r0 != null) goto L11;
        return "";
    L11:
        if (r0.length != 0) goto L14;
        return "";
    L14:
        return byte2HexStr(r0);
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L9
    }

    public static String strToUnicode(String r5) {
        if (r5 != null) goto L5;
        return null;
    L5:
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L7:
        if (r1 >= r5.length()) goto L14;
        char r2 = r5.charAt(r1);
        String r3 = Integer.toHexString(r2);
        if (r2 <= 128) goto L11;
        r0.append("\\u");
    L12:
        r0.append(r3);
        r1 = r1 + 1;
        goto L7
    L11:
        r0.append("\\u00");
        goto L12
    L14:
        return r0.toString();
    }

    public static String unicodeToString(String r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        int r0 = r7.length() / 6;
        StringBuilder r1 = new StringBuilder();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L9;
        int r3 = r2 * 6;
        r2 = r2 + 1;
        String r4 = r7.substring(r3, r2 * 6);
        int r5 = Integer.valueOf(r4.substring(2, 4), 16).intValue() << 8;
        r1.append(new String(Character.toChars(Integer.valueOf(r4.substring(4), 16).intValue() | r5)));
        goto L6
    L9:
        return r1.toString();
    }

    public static int bytesToInt(byte[] r3) {
        if (r3 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r3.length < 4) goto L9;
        int r0 = (((r3[0] & 255) << 24) | ((r3[1] & 255) << 16)) | ((r3[2] & 255) << 8);
        return (r3[3] & 255) | r0;
    }

    public static short bytesToShort(byte[] r1, int r2) {
        return (short) bytesToInt(r1, r2, 2);
    }

    public static int bytesLittleToInt(byte[] r2, int r3, int r4) {
        if (r2 != null) goto L4;
        return -1;
    L4:
        if ((r3 + r4) <= r2.length) goto L7;
        return -1;
    L7:
        if (r4 == 1) goto L15;
        if (r4 == 2) goto L13;
        byte[] r0 = new byte[4];
        System.arraycopy(r2, r3, r0, 0, r4);
        return bytesLittleToInt(r0);
    L13:
        return bytesToInt(r2[r3 + 1], r2[r3]);
    L15:
        return byteToInt(r2[r3]);
    }

    public static int bytesToInt(byte[] r2, int r3, int r4) {
        if (r2 != null) goto L4;
        return -1;
    L4:
        if ((r3 + r4) <= r2.length) goto L7;
        return -1;
    L7:
        if (r4 == 1) goto L15;
        if (r4 == 2) goto L13;
        byte[] r0 = new byte[4];
        System.arraycopy(r2, r3, r0, 0, r4);
        return bytesToInt(r0);
    L13:
        return bytesToInt(r2[r3], r2[r3 + 1]);
    L15:
        return byteToInt(r2[r3]);
    }

    public static long bytesToLong(byte[] r2) {
        return bytesToLong(r2, false);
    }

    public static long bytesToLong(byte[] r2, int r3, int r4) {
        if (r2 != null) goto L4;
        return -1;
    L4:
        if (r4 >= 8) goto L6;
        return -1;
    L6:
        if ((r4 + r3) > r2.length) goto L13;
        byte[] r5 = new byte[8];
        System.arraycopy(r2, r3, r5, 0, 8);
        return bytesToLong(r5);
    L13:
        return -1;
    }

    public static String byte2HexStr(byte[] r1) {
        if (r1 != null) goto L4;
        return "";
    L4:
        if (r1.length != 0) goto L7;
        return "";
    L7:
        return byte2HexStr(r1, r1.length);
    }
}
