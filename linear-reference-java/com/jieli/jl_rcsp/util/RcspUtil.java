package com.jieli.jl_rcsp.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.jieli.jl_rcsp.model.LtvBean;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class RcspUtil {
    public RcspUtil() {
    }

    public static byte[] addressCovertToByteArray(String r7) {
        if (TextUtils.isEmpty(r7) == false) goto L5;
    L19:
        return null;
    L5:
        if (r7.contains(CertificateUtil.DELIMITER) == false) goto L19;
        String r8 = r7.replace(CertificateUtil.DELIMITER, "");
        int r0 = r8.length() / 2;
        byte[] r2 = new byte[r0];
        if (r0 != 6) goto L19;
        int r3 = 0;
    L9:
        if (r3 >= r0) goto L18;
        int r4 = r3 * 2;
        int r5 = r4 + 2;
        if (r5 > r8.length()) goto L17;
        r2[r3] = (byte) Integer.valueOf(r8.substring(r4, r5), 16).intValue();     // Catch: Exception -> L14
    L14:
        e = move-exception;
        e.printStackTrace();
        return null;
    L17:
        r3 = r3 + 1;
        goto L9
    L18:
        return r2;
    }

    public static byte[] attrs2Bytes(List<AttrBean> r4) {
        ByteBuffer r0 = ByteBuffer.allocate(r4.size() * 128);
        Iterator<AttrBean> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        AttrBean r1 = r5.next();
        r0.put((byte) (r1.getAttrData().length + 1)).put(r1.getType()).put(r1.getAttrData());
        goto L4
    L6:
        byte[] r6 = new byte[r0.position()];
        r0.flip();
        r0.get(r6);
        return r6;
    }

    public static int changeConnectStatus(int r2) {
        if (r2 != 1) goto L5;
        return 3;
    L5:
        if (r2 == 2) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static boolean checkMaskHasBit(int r6, byte r7) {
        if (r7 <= 32) goto L5;
        return false;
    L5:
        byte r8 = CHexConver.intToByte((int) Math.pow(2.0d, CHexConver.byteToInt(r7)));
        if ((r6 & r8) != r8) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean deviceEquals(BluetoothDevice r0, BluetoothDevice r1) {
        if (r0 == null) goto L8;
        if (r1 != null) goto L5;
        return false;
    L5:
        if (r0.getAddress().equals(r1.getAddress()) == false) goto L11;
        return true;
    L11:
        return false;
    L8:
        return false;
    }

    public static int formatBleMtu(int r1) {
        if (r1 >= 20) goto L6;
        r1 = 20;
    L6:
        if (r1 <= 509) goto L8;
        return 509;
    L8:
        return r1;
    }

    public static String formatString(String r1, Object... r2) {
        return String.format(Locale.ENGLISH, r1, r2);
    }

    public static byte[] getData(String r0, int r1) {
        if (r0 == null) goto L7;
        if (r1 > 0) goto L6;
        return null;
    L6:
        return getData(r0.getBytes(), r1);
    L7:
        return null;
    }

    public static BluetoothDevice getRemoteDevice(String r2) {
        if (BluetoothAdapter.checkBluetoothAddress(r2) == true) goto L5;
        return null;
    L5:
        BluetoothAdapter r0 = BluetoothAdapter.getDefaultAdapter();
        if (r0 != null) goto L13;
        return null;
    L13:
        return r0.getRemoteDevice(r2);
    L10:
        e = move-exception;
        e.printStackTrace();
        return null;
    }

    public static long intToTime(int r7) {
        int r0 = ((r7 >> 26) & 63) + 2010;
        int r1 = (r7 >> 22) & 15;
        int r2 = (r7 >> 17) & 31;
        int r3 = (r7 >> 12) & 31;
        int r4 = (r7 >> 6) & 63;
        Calendar r5 = Calendar.getInstance();
        r5.set(1, r0);
        r5.set(2, r1 - 1);
        r5.set(5, r2);
        r5.set(11, r3);
        r5.set(12, r4);
        r5.set(13, r7 & 63);
        r5.set(14, 0);
        return r5.getTimeInMillis();
    }

    public static byte[] packLTVPacket(int r4, byte[] r5) {
        if (r5 == null) goto L5;
        int r0 = r5.length;
        int r1 = r0 + 1;
        byte[] r2 = new byte[r0 + 2];
        r2[0] = CHexConver.intToByte(r1);
        r2[1] = CHexConver.intToByte(r4);
        System.arraycopy(r5, 0, r2, 2, r5.length);
        return r2;
    L5:
        return null;
    }

    public static byte[] packLTVPacket2(int r5, byte[] r6) {
        if (r6 == null) goto L5;
        int r0 = r6.length;
        int r1 = r0 + 1;
        byte[] r2 = new byte[r0 + 3];
        byte[] r3 = CHexConver.int2byte2(r1);
        System.arraycopy(r3, 0, r2, 0, r3.length);
        r2[2] = CHexConver.intToByte(r5);
        System.arraycopy(r6, 0, r2, 3, r6.length);
        return r2;
    L5:
        return null;
    }

    public static List<LtvBean> parseLTVData(byte[] r7) {
        if (r7 == null) goto L14;
        if (r7.length <= 1) goto L14;
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L8:
        if (r2 >= r7.length) goto L12;
        int r3 = r7[r2];
        int r4 = r2 + 1;
        if ((r4 + r3) > r7.length) goto L12;
        int r5 = CHexConver.byteToInt(r7[r4]);
        int r6 = r2 + 2;
        int r8 = r3 - 1;
        byte[] r9 = new byte[r8];
        System.arraycopy(r7, r6, r9, 0, r8);
        r2 = r6 + r8;
        r0.add(new LtvBean(r3, r5, r9));
    L12:
        return r0;
    L14:
        return new ArrayList();
    }

    @SuppressLint({"MissingPermission"})
    public static String printBtDeviceInfo(BluetoothDevice r2) {
        if (r2 != null) goto L4;
        return "null";
    L4:
        if (Build.VERSION.SDK_INT <= 30) goto L8;
        return r2.toString();
    L8:
        return formatString("device:{ name : %s,type : %d, address : %s }", new Object[]{r2.getName(), Integer.valueOf(r2.getType()), r2.getAddress()});
    }

    public static int time2Int(long r6) {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(r6);
        int r7 = r0.get(1) - 2010;
        int r1 = r0.get(2) + 1;
        int r8 = r0.get(5);
        int r9 = r8 << 17;
        return (((r9 | ((r7 << 26) | (r1 << 22))) | (r0.get(11) << 12)) | (r0.get(12) << 6)) | r0.get(13);
    }

    public static byte[] getData(byte[] r2, int r3) {
        if (r2 == null) goto L10;
        if (r3 > 0) goto L6;
        return null;
    L6:
        if (r2.length > r3) goto L8;
        return r2;
    L8:
        byte[] r0 = new byte[r3];
        System.arraycopy(r2, 0, r0, 0, r3);
        return r0;
    L10:
        return null;
    }
}
