package com.jieli.jl_bt_ota.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothUtil {
    private static final String a = "BluetoothUtil";
    private static final char[] b = null;

    static {
        b = "0123456789ABCDEF".toCharArray();
    }

    public BluetoothUtil() {
    }

    private static boolean a(int r0, int r1) {
        if ((r0 & r1) != r1) goto L6;
        return true;
    L6:
        return false;
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

    @SuppressLint({"MissingPermission"})
    public static boolean connectDeviceA2dp(Context r3, BluetoothA2dp r4, BluetoothDevice r5) {
        if (r4 == null) goto L16;
        if (r5 == null) goto L16;
        if (CommonUtil.checkHasConnectPermission(r3) == false) goto L16;
        Object r6 = r4.getClass().getMethod("connect", new Class[]{BluetoothDevice.class}).invoke(r4, new Object[]{r5});     // Catch: Exception -> L14
        if ((r6 instanceof Boolean) == true) goto L12;
        return false;
    L12:
        return ((Boolean) r6).booleanValue();
    L14:
        e = move-exception;
        e.printStackTrace();
    L16:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean connectDeviceHfp(Context r3, BluetoothHeadset r4, BluetoothDevice r5) {
        if (r4 == null) goto L16;
        if (r5 == null) goto L16;
        if (CommonUtil.checkHasConnectPermission(r3) == false) goto L16;
        Method r6 = r4.getClass().getMethod("connect", new Class[]{BluetoothDevice.class});     // Catch: Exception -> L14
        r6.setAccessible(true);     // Catch: Exception -> L14
        Object r7 = r6.invoke(r4, new Object[]{r5});     // Catch: Exception -> L14
        if ((r7 instanceof Boolean) == true) goto L12;
        return false;
    L12:
        return ((Boolean) r7).booleanValue();
    L14:
        e = move-exception;
        e.printStackTrace();
    L16:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean createBond(Context r3, BluetoothDevice r4, int r5) {
        if (CommonUtil.checkHasConnectPermission(r3) == true) goto L13;
        return false;
    L13:
        Method r6 = BluetoothDevice.class.getDeclaredMethod("createBond", new Class[]{Integer.TYPE});     // Catch: Exception -> L10
        r6.setAccessible(true);     // Catch: Exception -> L10
        Object r7 = r6.invoke(r4, new Object[]{Integer.valueOf(r5)});     // Catch: Exception -> L10
        if ((r7 instanceof Boolean) == true) goto L8;
        return false;
    L8:
        return ((Boolean) r7).booleanValue();
    L10:
        e = move-exception;
        e.printStackTrace();
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

    public static boolean deviceHasProfile(BluetoothDevice r1, UUID r2) {
        return deviceHasProfile(CommonUtil.getMainContext(), r1, r2);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disconnectDeviceA2dp(Context r3, BluetoothA2dp r4, BluetoothDevice r5) {
        if (r4 == null) goto L15;
        if (r5 == null) goto L15;
        if (CommonUtil.checkHasConnectPermission(r3) == false) goto L15;
        Method r6 = r4.getClass().getMethod("disconnect", new Class[]{BluetoothDevice.class});     // Catch: Exception -> L13
        r6.setAccessible(true);     // Catch: Exception -> L13
        Object r7 = r6.invoke(r4, new Object[]{r5});     // Catch: Exception -> L13
        if ((r7 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r7).booleanValue();
    L13:
        e = move-exception;
        JL_Log.e(a, "disconnectDeviceA2dp", "have an exception : " + e);
        e.printStackTrace();
    L15:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disconnectDeviceHfp(Context r3, BluetoothHeadset r4, BluetoothDevice r5) {
        if (r4 == null) goto L15;
        if (r5 == null) goto L15;
        if (CommonUtil.checkHasConnectPermission(r3) == false) goto L15;
        Method r6 = r4.getClass().getMethod("disconnect", new Class[]{BluetoothDevice.class});     // Catch: Exception -> L13
        r6.setAccessible(true);     // Catch: Exception -> L13
        Object r7 = r6.invoke(r4, new Object[]{r5});     // Catch: Exception -> L13
        if ((r7 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r7).booleanValue();
    L13:
        e = move-exception;
        JL_Log.e(a, "disconnectFromHfp", "have an exception : " + e);
        e.printStackTrace();
    L15:
        return false;
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static int getBtAdapterConnectionState(Context r3, BluetoothAdapter r4) {
        if (CommonUtil.checkHasConnectPermission(r3) == true) goto L5;
        return -1;
    L5:
        if (r4 != null) goto L14;
    L13:
        return -1;
    L14:
        Method r5 = r4.getClass().getDeclaredMethod("getConnectionState", null);     // Catch: Exception -> L11
        r5.setAccessible(true);     // Catch: Exception -> L11
        Object r6 = r5.invoke(r4, null);     // Catch: Exception -> L11
        if ((r6 instanceof Integer) == true) goto L9;
        return -1;
    L9:
        return ((Integer) r6).intValue();
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    public static Method getDeclaredMethod() throws Exception {
        return Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
    }

    @SuppressLint({"MissingPermission"})
    public static int getPriority(Context r4, BluetoothProfile r5, BluetoothDevice r6) {
        if (r5 == null) goto L18;
        if (r6 == null) goto L18;
        if (CommonUtil.checkHasConnectPermission(r4) == false) goto L18;
        Method r7 = (Method) getDeclaredMethod().invoke(r5.getClass(), new Object[]{"getPriority", new Class[]{BluetoothDevice.class}});     // Catch: Exception -> L16
        if (r7 != null) goto L11;
        return 0;
    L11:
        Object r8 = r7.invoke(r5, new Object[]{r6});     // Catch: Exception -> L16
        if ((r8 instanceof Integer) == true) goto L14;
        return 0;
    L14:
        return ((Integer) r8).intValue();
    L16:
        e = move-exception;
        e.printStackTrace();
    L18:
        return 0;
    }

    public static BluetoothDevice getRemoteDevice(String r2) {
        if (CHexConver.checkBluetoothAddress(r2) == true) goto L5;
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

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getSystemConnectedBtDeviceList(Context r5) {
        if (CommonUtil.checkHasConnectPermission(r5) == true) goto L5;
        return null;
    L5:
        ArrayList r0 = new ArrayList();
        BluetoothAdapter r2 = BluetoothAdapter.getDefaultAdapter();
        int r3 = getBtAdapterConnectionState(r5, r2);     // Catch: Exception -> L16
        if (r3 == 2) goto L9;
        if (r3 == 0) goto L9;
    L19:
        if (r0.isEmpty() == true) goto L21;
        return r0;
    L21:
        return null;
    L9:
        Iterator<BluetoothDevice> r4 = r2.getBondedDevices().iterator();     // Catch: Exception -> L16
    L11:
        if (r4.hasNext() == false) goto L19;
        BluetoothDevice r6 = r4.next();     // Catch: Exception -> L16
        if (isBTConnected(r5, r6) == false) goto L11;
        r0.add(r6);     // Catch: Exception -> L16
    L16:
        e = move-exception;
        e.printStackTrace();
        goto L19
    }

    public static boolean hasBle(Context r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r1.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") == false) goto L9;
        return true;
    L9:
        return false;
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

    public static byte[] hexStringCovertToByteArray(String r7) {
        if (TextUtils.isEmpty(r7) == true) goto L15;
        int r0 = r7.length() / 2;
        byte[] r2 = new byte[r0];
        int r3 = 0;
    L5:
        if (r3 >= r0) goto L14;
        int r4 = r3 * 2;
        int r5 = r4 + 2;
        if (r5 > r7.length()) goto L13;
        r2[r3] = (byte) Integer.valueOf(r7.substring(r4, r5), 16).intValue();     // Catch: Exception -> L10
    L10:
        e = move-exception;
        e.printStackTrace();
        return null;
    L13:
        r3 = r3 + 1;
        goto L5
    L14:
        return r2;
    L15:
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isBTConnected(Context r3, BluetoothDevice r4) {
        if (CommonUtil.checkHasConnectPermission(r3) == true) goto L5;
        return false;
    L5:
        if (r4 != null) goto L14;
    L13:
        return false;
    L14:
        Object r5 = r4.getClass().getDeclaredMethod("isConnected", null).invoke(r4, null);     // Catch: Exception -> L11
        if ((r5 instanceof Boolean) == true) goto L9;
        return false;
    L9:
        return ((Boolean) r5).booleanValue();
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isBluetoothEnable() {
        BluetoothAdapter r0 = BluetoothAdapter.getDefaultAdapter();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isEnabled() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static void printBleGattServices(Context r4, BluetoothDevice r5, BluetoothGatt r6, int r7) {
        if (r5 == null) goto L53;
        if (r6 != null) goto L5;
        return;
    L5:
        if (CommonUtil.checkHasConnectPermission(r4) == false) goto L55;
        StringBuilder r0 = new StringBuilder(CommonUtil.formatString("\n[[====\tBluetooth[%s], status[%d]\t====]]\n", new Object[]{printBtDeviceInfo(r4, r5), Integer.valueOf(r7)}));
        List<BluetoothGattService> r8 = r6.getServices();
        if (r8 == null) goto L34;
        r0.append(CommonUtil.formatString("[[====\tService Size: [%d]\t====]]\n", new Object[]{Integer.valueOf(r8.size())}));
        Iterator<BluetoothGattService> r9 = r8.iterator();
    L11:
        if (r9.hasNext() == false) goto L34;
        BluetoothGattService r10 = r9.next();
        if (r10 == null) goto L11;
        r0.append(CommonUtil.formatString("[[====\tService: [%s]\t====]]\n", new Object[]{UuidUtil.read16BitUUID(r10.getUuid())}));
        List<BluetoothGattCharacteristic> r11 = r10.getCharacteristics();
        if (r11 == null) goto L11;
        r0.append(CommonUtil.formatString("[[[[====\tCharacteristics Size: [%d]\t====]]]]\n", new Object[]{Integer.valueOf(r11.size())}));
        Iterator<BluetoothGattCharacteristic> r12 = r11.iterator();
    L20:
        if (r12.hasNext() == false) goto L11;
        BluetoothGattCharacteristic r1 = r12.next();
        if (r1 == null) goto L20;
        r0.append(CommonUtil.formatString("[[[[====\tCharacteristic: [%s], %s\t====]]]]\n", new Object[]{UuidUtil.read16BitUUID(r1.getUuid()), a(r1.getProperties())}));
        List<BluetoothGattDescriptor> r2 = r1.getDescriptors();
        if (r2 == null) goto L20;
        r0.append(CommonUtil.formatString("[[[[[[====\tDescriptors Size: [%d]\t====]]]]]]\n", new Object[]{Integer.valueOf(r2.size())}));
        Iterator<BluetoothGattDescriptor> r3 = r2.iterator();
    L29:
        if (r3.hasNext() == false) goto L20;
        BluetoothGattDescriptor r13 = r3.next();
        if (r13 == null) goto L29;
        r0.append(CommonUtil.formatString("[[[[[[====\tDescriptor: [%s], value : [%s]\t====]]]]]]\n", new Object[]{UuidUtil.read16BitUUID(r13.getUuid()), CHexConver.byte2HexStr(r13.getValue())}));
    L34:
        r0.append(CommonUtil.formatString("[[====\tBluetooth[%s] Services show End\t====]]", new Object[]{printBtDeviceInfo(r4, r5)}));
        JL_Log.d(a, "printBleGattServices", r0.toString());
        return;
    L55:
        return;
    }

    public static String printBoundState(int r2) {
        switch(r2) {
            case 10: goto L9;
            case 11: goto L7;
            case 12: goto L5;
            default: goto L4;
        };
    L5:
        return "BOND_BONDED(12)";
    L7:
        return "BOND_BONDING(11)";
    L9:
        return "BOND_NONE(10)";
    L4:
        return "UNKNOWN_BOUND_STATE(" + r2 + I000IiI1O.iO.iO;
    }

    public static String printBtConnectionState(int r2) {
        if (r2 != 0) goto L4;
        return "STATE_DISCONNECTED(0)";
    L4:
        if (r2 != 1) goto L6;
        return "STATE_CONNECTING(1)";
    L6:
        if (r2 != 2) goto L8;
        return "STATE_CONNECTED(2)";
    L8:
        if (r2 != 3) goto L10;
        return "STATE_DISCONNECTING(3)";
    L10:
        return "UNKNOWN_STATE(" + r2 + I000IiI1O.iO.iO;
    }

    @Deprecated
    public static String printBtDeviceInfo(BluetoothDevice r1) {
        return printBtDeviceInfo(CommonUtil.getMainContext(), r1);
    }

    public static String printTransport(int r2) {
        if (r2 != 0) goto L4;
        return "TRANSPORT_AUTO(0)";
    L4:
        if (r2 != 1) goto L6;
        return "TRANSPORT_BREDR(1)";
    L6:
        if (r2 != 2) goto L8;
        return "TRANSPORT_LE(2)";
    L8:
        return "UNKNOWN_TRANSPORT = " + r2;
    }

    public static boolean refreshBleDeviceCache(Context r3, BluetoothGatt r4) {
        if (r4 != null) goto L5;
    L14:
        return false;
    L5:
        if (CommonUtil.checkHasConnectPermission(r3) == false) goto L14;
        Method r5 = r4.getClass().getMethod(ToolBar.REFRESH, null);     // Catch: Exception -> L12
        r5.setAccessible(true);     // Catch: Exception -> L12
        Object r6 = r5.invoke(r4, null);     // Catch: Exception -> L12
        if ((r6 instanceof Boolean) == true) goto L10;
        return false;
    L10:
        return ((Boolean) r6).booleanValue();
    L12:
        e = move-exception;
        JL_Log.e(a, "refreshBleDeviceCache", "Exception : " + e);
        goto L14
    }

    @SuppressLint({"MissingPermission"})
    public static boolean removeBond(Context r4, BluetoothDevice r5) {
        if (r5 != null) goto L5;
    L15:
        return false;
    L5:
        if (CommonUtil.checkHasConnectPermission(r4) == false) goto L15;
        Object r6 = r5.getClass().getMethod("removeBond", null).invoke(r5, null);     // Catch: Exception -> L13
        if ((r6 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r6).booleanValue();
    L13:
        e = move-exception;
        e.printStackTrace();
        JL_Log.e(a, "removeBond", "Invoke removeBond : " + e.getMessage());
        goto L15
    }

    public static String reverseAddressString(String r7) {
        if (CHexConver.checkBluetoothAddress(r7) == true) goto L6;
        return r7;
    L6:
        if (r7.contains(CertificateUtil.DELIMITER) == false) goto L8;
        r7 = r7.replaceAll(CertificateUtil.DELIMITER, "");
    L8:
        byte[] r0 = hexStringCovertToByteArray(r7);
        if (r0 != null) goto L11;
        return r7;
    L11:
        byte[] r8 = new byte[6];
        int r1 = r0.length - 1;
        int r4 = 0;
    L13:
        if (r4 >= r0.length) goto L15;
        boolean r5 = true;
    L16:
        if (r1 < 0) goto L18;
        boolean r6 = true;
    L20:
        if ((r5 & r6) == false) goto L23;
        r8[r4] = r0[r1];
        r4 = r4 + 1;
        r1 = r1 - 1;
        goto L13
    L23:
        return hexDataCovetToAddress(r8);
    L18:
        r6 = false;
        goto L20
    L15:
        r5 = false;
        goto L16
    }

    @SuppressLint({"MissingPermission"})
    public static boolean setPriority(Context r4, BluetoothProfile r5, BluetoothDevice r6, int r7) {
        if (r5 == null) goto L18;
        if (r6 == null) goto L18;
        if (CommonUtil.checkHasConnectPermission(r4) == false) goto L18;
        Method r8 = (Method) getDeclaredMethod().invoke(r5.getClass(), new Object[]{"setPriority", new Class[]{BluetoothDevice.class, Integer.TYPE}});     // Catch: Exception -> L16
        if (r8 != null) goto L11;
        return false;
    L11:
        Object r9 = r8.invoke(r5, new Object[]{r6, Integer.valueOf(r7)});     // Catch: Exception -> L16
        if ((r9 instanceof Boolean) == true) goto L14;
        return false;
    L14:
        return ((Boolean) r9).booleanValue();
    L16:
        e = move-exception;
        e.printStackTrace();
    L18:
        return false;
    }

    private static String a(int r3) {
        StringBuilder r0 = new StringBuilder();
        if (a(r3, 1) == false) goto L6;
        r0.append("BROADCAST");
    L6:
        if (a(r3, 2) == false) goto L12;
        if (r0.length() <= 0) goto L10;
        r0.append(", ");
    L10:
        r0.append("READ");
    L12:
        if (a(r3, 4) == false) goto L18;
        if (r0.length() <= 0) goto L16;
        r0.append(", ");
    L16:
        r0.append("WRITE NO RESPONSE");
    L18:
        if (a(r3, 8) == false) goto L24;
        if (r0.length() <= 0) goto L22;
        r0.append(", ");
    L22:
        r0.append("WRITE");
    L24:
        if (a(r3, 16) == false) goto L30;
        if (r0.length() <= 0) goto L28;
        r0.append(", ");
    L28:
        r0.append("NOTIFY");
    L30:
        if (a(r3, 32) == false) goto L36;
        if (r0.length() <= 0) goto L34;
        r0.append(", ");
    L34:
        r0.append("INDICATE");
    L36:
        if (a(r3, 64) == false) goto L42;
        if (r0.length() <= 0) goto L40;
        r0.append(", ");
    L40:
        r0.append("SIGNED WRITE");
    L42:
        if (a(r3, 128) == false) goto L48;
        if (r0.length() <= 0) goto L46;
        r0.append(", ");
    L46:
        r0.append("EXTENDED PROPS");
    L48:
        return r0.toString();
    }

    @SuppressLint({"MissingPermission"})
    public static boolean deviceHasProfile(Context r4, BluetoothDevice r5, UUID r6) {
        if (isBluetoothEnable() == false) goto L25;
        if (r5 == null) goto L25;
        if (r6 == null) goto L25;
        if (TextUtils.isEmpty(r6.toString()) == true) goto L25;
        if (CommonUtil.checkHasConnectPermission(r4) == true) goto L12;
        return false;
    L12:
        ParcelUuid[] r7 = r5.getUuids();
        if (r7 != null) goto L15;
        return false;
    L15:
        int r8 = r7.length;
        int r0 = 0;
    L16:
        if (r0 >= r8) goto L25;
        ParcelUuid r2 = r7[r0];
        if (r2 == null) goto L24;
        if (r6.toString().equalsIgnoreCase(r2.toString()) == false) goto L24;
        return true;
    L24:
        r0 = r0 + 1;
    L25:
        return false;
    }

    public static String printBtDeviceInfo(Context r1, BluetoothDevice r2) {
        return printBtDeviceInfo(r1, r2, true);
    }

    @SuppressLint({"MissingPermission"})
    public static String printBtDeviceInfo(Context r0, BluetoothDevice r1, boolean r2) {
        if (r1 != null) goto L5;
        return "null";
    L5:
        if (r2 == false) goto L13;
        if (CommonUtil.checkHasConnectPermission(r0) == true) goto L11;
        return r1.getAddress();
    L11:
        return "name : " + r1.getName() + ", type : " + r1.getType() + ", address : " + r1.getAddress();
    L13:
        return r1.getAddress();
    }

    public static boolean createBond(BluetoothDevice r1) {
        return createBond(CommonUtil.getMainContext(), r1);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean createBond(Context r0, BluetoothDevice r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (CommonUtil.checkHasConnectPermission(r0) == true) goto L7;
        return false;
    L7:
        return r1.createBond();
    }
}
