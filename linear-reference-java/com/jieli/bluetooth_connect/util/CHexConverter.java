package com.jieli.bluetooth_connect.util;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class CHexConverter {
    private static final char[] mChars = null;
    private static final String mHexStr = "0123456789ABCDEF";

    static {
        mChars = "0123456789ABCDEF".toCharArray();
    }

    public CHexConverter() {
    }

    public static String byte2HexStr(byte[] b) {
        if (b != null) goto L6;
        return "";
    L6:
        return byte2HexStr(b, b.length);
    }

    public static String byte2String(byte[] b, int len) {
        if (b != null) goto L5;
        return "";
    L5:
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L6:
        if (r1 >= len) goto L9;
        r0.append(String.valueOf(b[r1]));
        r1 = r1 + 1;
        goto L6
    L9:
        return r0.toString();
    }

    public static String byteToBit(byte b) {
        return "" + ((byte) ((b >> 7) & 1)) + ((byte) ((b >> 6) & 1)) + ((byte) ((b >> 5) & 1)) + ((byte) ((b >> 4) & 1)) + ((byte) ((b >> 3) & 1)) + ((byte) ((b >> 2) & 1)) + ((byte) ((b >> 1) & 1)) + ((byte) (b & 1));
    }

    public static String byteToHexString(byte b) {
        return intToHexString(b & 255);
    }

    public static int byteToInt(byte b) {
        return b & 255;
    }

    public static int bytesToInt(byte h, byte l) {
        return ((h & 255) << 8) + (l & 255);
    }

    public static long bytesToLong(byte[] data, int start, int len) {
        long r0 = 0;
        int r2 = 0;
        int r3 = start;
    L4:
        if (r3 >= (start + len)) goto L6;
        r0 = r0 | ((((long) data[r3]) & 255) << (((len - 1) - r2) * 8));
        r3 = r3 + 1;
        r2 = r2 + 1;
        goto L4
    L6:
        return r0;
    }

    public static short bytesToShort(byte h, byte l) {
        return (short) bytesToInt(h, l);
    }

    public static String bytesToStr(byte[] data) {
        if (data != null) goto L6;
        return "";
    L6:
        return hexStr2Str(byte2HexStr(data, data.length));
    }

    public static boolean checkBitValue(byte value, int bit) {
        if (bit >= 0) goto L5;
    L10:
        return false;
    L5:
        if (bit > 7) goto L10;
        if (((value >> bit) & 1) != 1) goto L10;
        return true;
    }

    public static boolean checkHexStr(String sHex) {
        if (sHex != null) goto L5;
        return false;
    L5:
        String r6 = sHex.trim().replace(" ", "").toUpperCase(Locale.US);
        int r1 = r6.length();
        if (r1 > 1) goto L8;
    L16:
        return false;
    L8:
        if ((r1 % 2) != 0) goto L16;
        int r3 = 0;
    L10:
        if (r3 >= r1) goto L15;
        int r4 = r3 + 1;
        if ("0123456789ABCDEF".contains(r6.substring(r3, r4)) == false) goto L13;
        r3 = r4;
        goto L10
    L13:
        return false;
    L15:
        return true;
    }

    public static byte decodeBinaryString(String byteStr) {
        if (byteStr != null) goto L5;
        return 0;
    L5:
        int r1 = byteStr.length();
        if (r1 == 4) goto L10;
        if (r1 == 8) goto L10;
        return 0;
    L10:
        if (r1 == 8) goto L12;
        int r4 = Integer.parseInt(byteStr, 2);
    L17:
        return (byte) r4;
    L12:
        if (byteStr.charAt(0) != '0') goto L14;
        r4 = Integer.parseInt(byteStr, 2);
        goto L17
    L14:
        r4 = Integer.parseInt(byteStr, 2) - 256;
        goto L17
    }

    public static byte decodeHexChar(char hChar, char lChar) {
        String r1 = hexChar2BinaryString(hChar);
        String r2 = hexChar2BinaryString(lChar);
        if (TextUtils.isEmpty(r1) == false) goto L7;
        r1 = "";
    L7:
        if (TextUtils.isEmpty(r2) == true) goto L10;
        r1 = r1 + r2;
    L10:
        if (TextUtils.isEmpty(r1) == false) goto L14;
        return 0;
    L14:
        return decodeBinaryString(r1);
    }

    public static int getBitByPosition(int src, int pos) {
        if (pos >= 0) goto L4;
        return 0;
    L4:
        if (pos < 32) goto L6;
        return 0;
    L6:
        return (src >> pos) & 1;
    }

    public static byte[] getBooleanArray(byte b) {
        byte[] r0 = new byte[8];
        int r1 = 7;
    L3:
        if (r1 < 0) goto L5;
        r0[r1] = (byte) (b & 1);
        b = (byte) (b >> 1);
        r1 = r1 - 1;
        goto L3
    L5:
        return r0;
    }

    public static byte[] getBooleanArrayBig(byte b) {
        byte[] r1 = new byte[8];
        int r2 = 0;
    L3:
        if (r2 >= 8) goto L5;
        r1[r2] = (byte) (b & 1);
        b = (byte) (b >> 1);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    private static String hexChar2BinaryString(char src) {
        if (src != '0') goto L7;
        return "0000";
    L7:
        if (src != '1') goto L11;
        return "0001";
    L11:
        if (src != '2') goto L15;
        return "0010";
    L15:
        if (src != '3') goto L19;
        return "0011";
    L19:
        if (src != '4') goto L23;
        return "0100";
    L23:
        if (src != '5') goto L27;
        return "0101";
    L27:
        if (src != '6') goto L31;
        return "0110";
    L31:
        if (src != '7') goto L35;
        return "0111";
    L35:
        if (src != '8') goto L39;
        return X10i1i.OXO1;
    L39:
        if (src != '9') goto L43;
        return "1001";
    L43:
        if (src != 'A') goto L45;
        return "1010";
    L45:
        if (src != 'a') goto L48;
        return "1010";
    L48:
        if (src != 'B') goto L50;
        return "1011";
    L50:
        if (src != 'b') goto L53;
        return "1011";
    L53:
        if (src != 'C') goto L55;
        return "1100";
    L55:
        if (src != 'c') goto L58;
        return "1100";
    L58:
        if (src != 'D') goto L60;
        return "1101";
    L60:
        if (src != 'd') goto L63;
        return "1101";
    L63:
        if (src != 'E') goto L65;
        return "1110";
    L65:
        if (src != 'e') goto L68;
        return "1110";
    L68:
        if (src != 'F') goto L70;
        return "1111";
    L70:
        if (src == 'f') goto L86;
        return "";
    L86:
        return "1111";
    }

    public static byte[] hexStr2Bytes(String src) {
        if (src != null) goto L5;
        return null;
    L5:
        String r8 = src.trim().replace(" ", "").toUpperCase(Locale.US);
        int r0 = r8.length() / 2;
        byte[] r1 = new byte[r0];
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L8;
        int r3 = r2 * 2;
        int r4 = r3 + 1;
        r1[r2] = (byte) (Integer.decode(HexStringBuilder.DEFAULT_PREFIX + r8.substring(r3, r4) + r8.substring(r4, r3 + 2)).intValue() & 255);
        r2 = r2 + 1;
        goto L6
    L8:
        return r1;
    }

    public static String hexStr2Str(String hexStr) {
        if (hexStr != null) goto L5;
        return null;
    L5:
        String r7 = hexStr.trim().replace(" ", "").toUpperCase(Locale.US);
        char[] r0 = r7.toCharArray();
        int r8 = r7.length() / 2;
        byte[] r2 = new byte[r8];
        int r3 = 0;
    L6:
        if (r3 >= r8) goto L13;
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

    public static String int2HexStr(int[] b, int iLen) {
        if (b != null) goto L5;
        return "";
    L5:
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L6:
        if (r1 >= iLen) goto L9;
        char[] r2 = mChars;
        r0.append(r2[(((byte) b[r1]) & 255) >> 4]);
        r0.append(r2[((byte) b[r1]) & 15]);
        r1 = r1 + 1;
        goto L6
    L9:
        return r0.toString().trim().toUpperCase(Locale.US);
    }

    public static byte[] int2byte2(int res) {
        return new byte[]{(byte) ((res >> 8) & 255), (byte) (res & 255)};
    }

    public static byte[] intToBigBytes(int n) {
        return new byte[]{(byte) ((n >> 24) & 255), (byte) ((n >> 16) & 255), (byte) ((n >> 8) & 255), (byte) (n & 255)};
    }

    public static byte intToByte(int num) {
        return (byte) num;
    }

    public static byte[] intToBytes(int n) {
        return new byte[]{(byte) (n & 255), (byte) ((n >> 8) & 255), (byte) ((n >> 16) & 255), (byte) ((n >> 24) & 255)};
    }

    public static String intToHexString(int num) {
        return String.format(Locale.ENGLISH, "%02x", new Object[]{Integer.valueOf(num)});
    }

    public static byte setBitValue(byte value, int bit, boolean result) {
        if (bit >= 0) goto L4;
    L12:
        return value;
    L4:
        if (bit > 7) goto L12;
        if (result == false) goto L11;
        int r1 = value | (1 << bit);
    L10:
        return (byte) r1;
    L11:
        r1 = value & (~(1 << bit));
        goto L10
    }

    public static byte[] shortToBigBytes(short n) {
        return new byte[]{(byte) ((n >> 8) & 255), (byte) (n & 255)};
    }

    public static byte[] shortToBytes(short n) {
        return new byte[]{(byte) (n & 255), (byte) ((n >> 8) & 255)};
    }

    public static String str2HexStr(String str) {
        byte[] r0 = null;
        if (str != null) goto L5;
        return null;
    L5:
        StringBuilder r1 = new StringBuilder();
        r0 = str.getBytes("GBK");     // Catch: UnsupportedEncodingException -> L8
    L10:
        if (r0 != null) goto L13;
        return "";
    L13:
        int r6 = r0.length;
        int r2 = 0;
    L14:
        if (r2 >= r6) goto L17;
        byte r3 = r0[r2];
        char[] r4 = mChars;
        r1.append(r4[(r3 & 255) >> 4]);
        r1.append(r4[r3 & 15]);
        r2 = r2 + 1;
        goto L14
    L17:
        return r1.toString().trim();
    L8:
        e = move-exception;
        e.printStackTrace();
        goto L10
    }

    public static String strToUnicode(String strText) {
        if (strText != null) goto L5;
        return null;
    L5:
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L7:
        if (r1 >= strText.length()) goto L14;
        char r2 = strText.charAt(r1);
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

    public static String unicodeToString(String hex) {
        if (hex != null) goto L5;
        return null;
    L5:
        int r0 = hex.length() / 6;
        StringBuilder r1 = new StringBuilder();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L9;
        int r3 = r2 * 6;
        r2 = r2 + 1;
        String r4 = hex.substring(r3, r2 * 6);
        int r5 = Integer.valueOf(r4.substring(2, 4), 16).intValue() << 8;
        r1.append(new String(Character.toChars(Integer.valueOf(r4.substring(4), 16).intValue() | r5)));
        goto L6
    L9:
        return r1.toString();
    }

    public static int writeBitValue(int value, int bit, boolean result) {
        if (bit >= 0) goto L4;
        return value;
    L4:
        if (bit <= 31) goto L7;
        return value;
    L7:
        if (result == false) goto L11;
        return value | (1 << bit);
    L11:
        return value & (~(1 << bit));
    }

    public static int bytesToInt(byte[] data, int start, int len) {
        if (len != 4) goto L7;
        byte[] r1 = new byte[4];
        System.arraycopy(data, start, r1, 0, len);
        return bytesToInt(r1);
    L7:
        if (len == 2) goto L9;
        return 0;
    L9:
        return bytesToInt(data[start], data[start + 1]);
    }

    public static boolean checkBitValue(int value, int bit) {
        if (bit >= 0) goto L5;
    L10:
        return false;
    L5:
        if (bit > 31) goto L10;
        if (((value >> bit) & 1) != 1) goto L10;
        return true;
    }

    public static String byte2HexStr(byte[] b, int iLen) {
        if (b != null) goto L5;
        return "";
    L5:
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L6:
        if (r1 >= iLen) goto L9;
        char[] r2 = mChars;
        r0.append(r2[(b[r1] & 255) >> 4]);
        r0.append(r2[b[r1] & 15]);
        r1 = r1 + 1;
        goto L6
    L9:
        return r0.toString().trim().toUpperCase(Locale.US);
    }

    public static int bytesToInt(byte[] value) {
        if (value != null) goto L5;
    L9:
        return 0;
    L5:
        if (value.length < 4) goto L9;
        int r0 = (((value[0] & 255) << 24) | ((value[1] & 255) << 16)) | ((value[2] & 255) << 8);
        return (value[3] & 255) | r0;
    }
}
