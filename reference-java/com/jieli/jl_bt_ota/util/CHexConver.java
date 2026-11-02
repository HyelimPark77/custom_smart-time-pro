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

    /* JADX INFO: renamed from: a */
    private static final String f37733a = "0123456789ABCDEF";

    /* JADX INFO: renamed from: b */
    private static final char[] f37734b = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final int f37735c = 17;

    /* JADX INFO: renamed from: a */
    private static String m27212a(char c) {
        if (c == '0') {
            return "0000";
        }
        if (c == '1') {
            return "0001";
        }
        if (c == '2') {
            return "0010";
        }
        if (c == '3') {
            return "0011";
        }
        if (c == '4') {
            return "0100";
        }
        if (c == '5') {
            return "0101";
        }
        if (c == '6') {
            return "0110";
        }
        if (c == '7') {
            return "0111";
        }
        if (c == '8') {
            return X10i1i.OXO1;
        }
        if (c == '9') {
            return "1001";
        }
        if (c == 'A' || c == 'a') {
            return "1010";
        }
        if (c == 'B' || c == 'b') {
            return "1011";
        }
        if (c == 'C' || c == 'c') {
            return "1100";
        }
        if (c == 'D' || c == 'd') {
            return "1101";
        }
        if (c == 'E' || c == 'e') {
            return "1110";
        }
        return (c == 'F' || c == 'f') ? "1111" : "";
    }

    public static byte[] addressCovertToByteArray(String str) {
        if (!checkBluetoothAddress(str)) {
            return new byte[0];
        }
        String strReplace = str.replace(CertificateUtil.DELIMITER, "");
        int length = strReplace.length() / 2;
        byte[] bArr = new byte[length];
        if (length != 6) {
            return new byte[0];
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 2;
            if (i3 <= strReplace.length()) {
                try {
                    bArr[i] = (byte) Integer.valueOf(strReplace.substring(i2, i3), 16).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    return new byte[0];
                }
            }
        }
        return bArr;
    }

    public static String byte2HexStr(byte[] bArr, int i) {
        if (bArr == null) {
            return "";
        }
        int iMin = Math.min(bArr.length, i);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < iMin; i2++) {
            char[] cArr = f37734b;
            sb.append(cArr[(bArr[i2] & 255) >> 4]);
            sb.append(cArr[bArr[i2] & 15]);
            if (i2 != iMin - 1) {
                sb.append(" ");
            }
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static String byteToBit(byte b) {
        return "" + ((int) ((byte) ((b >> 7) & 1))) + ((int) ((byte) ((b >> 6) & 1))) + ((int) ((byte) ((b >> 5) & 1))) + ((int) ((byte) ((b >> 4) & 1))) + ((int) ((byte) ((b >> 3) & 1))) + ((int) ((byte) ((b >> 2) & 1))) + ((int) ((byte) ((b >> 1) & 1))) + ((int) ((byte) (b & 1)));
    }

    public static String byteToHexString(byte b) {
        return intToHexString(b & 255);
    }

    public static int byteToInt(byte b) {
        return b & 255;
    }

    public static int bytesLittleToInt(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        return (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static int bytesToInt(byte b, byte b2) {
        return ((b & 255) << 8) + (b2 & 255);
    }

    public static long bytesToLong(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length < 8) {
            return -1L;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(z ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        return byteBufferWrap.getLong();
    }

    public static short bytesToShort(byte b, byte b2) {
        return (short) bytesToInt(b, b2);
    }

    public static String bytesToStr(byte[] bArr) {
        return bArr == null ? "" : hexStr2ASCII(byte2HexStr(bArr));
    }

    public static boolean checkBitValue(byte b, int i) {
        return ((b >> i) & 1) == 1;
    }

    public static boolean checkBluetoothAddress(String str) {
        if (str == null || str.length() != 17) {
            return false;
        }
        for (int i = 0; i < 17; i++) {
            char cCharAt = str.charAt(i);
            int i2 = i % 3;
            if (i2 == 0 || i2 == 1) {
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'A' || cCharAt > 'F')) {
                    return false;
                }
            } else if (i2 == 2 && cCharAt != ':') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkHexStr(String str) {
        String upperCase;
        int length;
        if (str == null || str.isEmpty() || (length = (upperCase = str.trim().replaceAll("\\s*|\\r|\\n|\\t", "").toUpperCase(Locale.US)).length()) <= 1 || length % 2 != 0) {
            return false;
        }
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!"0123456789ABCDEF".contains(upperCase.substring(i, i2))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public static byte decodeBinaryString(String str) {
        if (str == null) {
            return (byte) 0;
        }
        int length = str.length();
        if (length != 4 && length != 8) {
            return (byte) 0;
        }
        int i = (length != 8 || str.charAt(0) == '0') ? Integer.parseInt(str, 2) : Integer.parseInt(str, 2) - 256;
        return (byte) i;
    }

    public static byte decodeHexChar(char c, char c2) {
        String strM27212a = m27212a(c);
        String strM27212a2 = m27212a(c2);
        if (TextUtils.isEmpty(strM27212a)) {
            strM27212a = "";
        }
        if (!TextUtils.isEmpty(strM27212a2)) {
            strM27212a = strM27212a + strM27212a2;
        }
        if (TextUtils.isEmpty(strM27212a)) {
            return (byte) 0;
        }
        return decodeBinaryString(strM27212a);
    }

    public static int getBitByPosition(int i, int i2) {
        if (i2 < 0 || i2 >= 32) {
            return 0;
        }
        return (i >> i2) & 1;
    }

    public static byte[] getBooleanArray(byte b) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return bArr;
    }

    public static byte[] getBooleanArrayBig(byte b) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return bArr;
    }

    public static String hexDataCovetToAddress(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length == 6) {
            for (int i = 0; i < bArr.length; i++) {
                char[] cArr = f37734b;
                sb.append(cArr[(bArr[i] & 255) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
                if (i != bArr.length - 1) {
                    sb.append(CertificateUtil.DELIMITER);
                }
            }
        }
        return sb.toString();
    }

    public static String hexStr2ASCII(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.trim().replaceAll("\\s*|\\r|\\n|\\t", "").toUpperCase(Locale.US);
        char[] charArray = upperCase.toCharArray();
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (("0123456789ABCDEF".indexOf(charArray[i2 + 1]) | ("0123456789ABCDEF".indexOf(charArray[i2]) << 4)) & 255);
        }
        try {
            return new String(bArr, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] hexStr2Bytes(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.trim().replaceAll("\\s*|\\r|\\n|\\t", "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) (Integer.decode(HexStringBuilder.DEFAULT_PREFIX + upperCase.substring(i2, i3) + upperCase.substring(i3, i2 + 2)).intValue() & 255);
        }
        return bArr;
    }

    public static String int2HexStr(int i, int i2) {
        return i2 == 2 ? String.format(Locale.ENGLISH, "%02x", Integer.valueOf(i)) : byte2HexStr(intToBigBytes(i));
    }

    public static byte[] int2byte2(int i) {
        return new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] intToBigBytes(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte intToByte(int i) {
        return (byte) i;
    }

    public static String intToHexString(int i) {
        return String.format(Locale.ENGLISH, "%02x", Integer.valueOf(i));
    }

    public static byte[] intToLittleBytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] intToLittleBytes2(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
    }

    public static byte setBitValue(byte b, int i, boolean z) {
        int i2 = 1 << i;
        return (byte) (z ? b | i2 : b & (~i2));
    }

    public static byte[] shortToBigBytes(short s) {
        return int2byte2(s);
    }

    public static byte[] shortToBytes(short s) {
        return intToLittleBytes2(s);
    }

    public static String str2HexStr(String str) {
        byte[] bytes = null;
        if (str == null) {
            return null;
        }
        try {
            bytes = str.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return (bytes == null || bytes.length == 0) ? "" : byte2HexStr(bytes);
    }

    public static String strToUnicode(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            String hexString = Integer.toHexString(cCharAt);
            if (cCharAt > 128) {
                sb.append("\\u");
            } else {
                sb.append("\\u00");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String unicodeToString(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() / 6;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            int i2 = i * 6;
            i++;
            String strSubstring = str.substring(i2, i * 6);
            sb.append(new String(Character.toChars(Integer.valueOf(strSubstring.substring(4), 16).intValue() | (Integer.valueOf(strSubstring.substring(2, 4), 16).intValue() << 8))));
        }
        return sb.toString();
    }

    public static int bytesToInt(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static short bytesToShort(byte[] bArr, int i) {
        return (short) bytesToInt(bArr, i, 2);
    }

    public static int bytesLittleToInt(byte[] bArr, int i, int i2) {
        if (bArr == null || i + i2 > bArr.length) {
            return -1;
        }
        if (i2 == 1) {
            return byteToInt(bArr[i]);
        }
        if (i2 != 2) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bytesLittleToInt(bArr2);
        }
        return bytesToInt(bArr[i + 1], bArr[i]);
    }

    public static int bytesToInt(byte[] bArr, int i, int i2) {
        if (bArr == null || i + i2 > bArr.length) {
            return -1;
        }
        if (i2 == 1) {
            return byteToInt(bArr[i]);
        }
        if (i2 != 2) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bytesToInt(bArr2);
        }
        return bytesToInt(bArr[i], bArr[i + 1]);
    }

    public static long bytesToLong(byte[] bArr) {
        return bytesToLong(bArr, false);
    }

    public static long bytesToLong(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 < 8 || i2 + i > bArr.length) {
            return -1L;
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, i, bArr2, 0, 8);
        return bytesToLong(bArr2);
    }

    public static String byte2HexStr(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return byte2HexStr(bArr, bArr.length);
        }
        return "";
    }
}
