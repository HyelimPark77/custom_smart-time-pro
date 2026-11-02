package com.jieli.bluetooth_connect.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.Z3;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothUtil {
    private static final String TAG = "BluetoothUtil";
    private static final char[] mChars = null;

    static {
        mChars = "0123456789ABCDEF".toCharArray();
    }

    public BluetoothUtil() {
    }

    public static byte[] addressCovertToByteArray(String address) {
        if (TextUtils.isEmpty(address) == false) goto L5;
    L19:
        return null;
    L5:
        if (address.contains(CertificateUtil.DELIMITER) == false) goto L19;
        String r7 = address.replace(CertificateUtil.DELIMITER, "");
        int r0 = r7.length() / 2;
        byte[] r2 = new byte[r0];
        if (r0 != 6) goto L19;
        int r3 = 0;
    L9:
        if (r3 >= r0) goto L18;
        int r4 = r3 * 2;
        int r5 = r4 + 2;
        if (r5 > r7.length()) goto L17;
        r2[r3] = (byte) Integer.valueOf(r7.substring(r4, r5), 16).intValue();     // Catch: Exception -> L14
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
    public static boolean connectDeviceA2dp(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp == null) goto L16;
        if (device == null) goto L16;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L16;
        Object r3 = bluetoothA2dp.getClass().getMethod("connect", new Class[]{BluetoothDevice.class}).invoke(bluetoothA2dp, new Object[]{device});     // Catch: Exception -> L14
        if ((r3 instanceof Boolean) == true) goto L12;
        return false;
    L12:
        return ((Boolean) r3).booleanValue();
    L14:
        e = move-exception;
        e.printStackTrace();
    L16:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean connectDeviceHfp(Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice device) {
        if (bluetoothHeadset == null) goto L16;
        if (device == null) goto L16;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L16;
        Method r3 = bluetoothHeadset.getClass().getMethod("connect", new Class[]{BluetoothDevice.class});     // Catch: Exception -> L14
        r3.setAccessible(true);     // Catch: Exception -> L14
        Object r4 = r3.invoke(bluetoothHeadset, new Object[]{device});     // Catch: Exception -> L14
        if ((r4 instanceof Boolean) == true) goto L12;
        return false;
    L12:
        return ((Boolean) r4).booleanValue();
    L14:
        e = move-exception;
        e.printStackTrace();
    L16:
        return false;
    }

    public static String connectionString(int connection) {
        if (connection != 1) goto L5;
        return "STATE_CONNECTING(1)";
    L5:
        if (connection == 2) goto L8;
        return "STATE_DISCONNECTED(0)";
    L8:
        return "STATE_CONNECTED(2)";
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    public static boolean createBond(Context context, BluetoothDevice device, int transport) {
        if (device != null) goto L5;
    L14:
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L14;
        Method r3 = device.getClass().getDeclaredMethod("createBond", new Class[]{Integer.TYPE});     // Catch: Exception -> L12
        r3.setAccessible(true);     // Catch: Exception -> L12
        Object r4 = r3.invoke(device, new Object[]{Integer.valueOf(transport)});     // Catch: Exception -> L12
        if ((r4 instanceof Boolean) == true) goto L10;
        return false;
    L10:
        return ((Boolean) r4).booleanValue();
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L14
    }

    public static boolean deviceEquals(BluetoothDevice device1, BluetoothDevice device2) {
        if (device1 == null) goto L8;
        if (device2 != null) goto L5;
        return false;
    L5:
        if (device1.getAddress().equals(device2.getAddress()) == false) goto L11;
        return true;
    L11:
        return false;
    L8:
        return false;
    }

    public static boolean deviceHasA2dp(Context context, BluetoothDevice device) {
        return deviceHasProfile(context, device, BluetoothConstant.UUID_A2DP);
    }

    public static boolean deviceHasHfp(Context context, BluetoothDevice device) {
        return deviceHasProfile(context, device, BluetoothConstant.UUID_HFP);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean deviceHasProfile(Context context, BluetoothDevice device, UUID profileUuid) {
        if (isBluetoothEnable() == false) goto L25;
        if (device == null) goto L25;
        if (profileUuid == null) goto L25;
        if (TextUtils.isEmpty(profileUuid.toString()) == true) goto L25;
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L12;
        return false;
    L12:
        ParcelUuid[] r4 = device.getUuids();
        if (r4 != null) goto L15;
        return false;
    L15:
        int r5 = r4.length;
        int r0 = 0;
    L16:
        if (r0 >= r5) goto L25;
        ParcelUuid r2 = r4[r0];
        if (r2 == null) goto L24;
        if (profileUuid.toString().equalsIgnoreCase(r2.toString()) == false) goto L24;
        return true;
    L24:
        r0 = r0 + 1;
    L25:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disableBluetooth(Context context) {
        BluetoothAdapter r0 = BluetoothAdapter.getDefaultAdapter();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L8;
        return false;
    L8:
        if (r0.isEnabled() == true) goto L10;
        return true;
    L10:
        return r0.disable();
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disconnectDeviceA2dp(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp == null) goto L15;
        if (device == null) goto L15;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L15;
        Method r3 = bluetoothA2dp.getClass().getMethod("disconnect", new Class[]{BluetoothDevice.class});     // Catch: Exception -> L13
        r3.setAccessible(true);     // Catch: Exception -> L13
        Object r4 = r3.invoke(bluetoothA2dp, new Object[]{device});     // Catch: Exception -> L13
        if ((r4 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r4).booleanValue();
    L13:
        e = move-exception;
        JL_Log.e(TAG, "disconnectDeviceA2dp", "have an exception : " + e);
        e.printStackTrace();
    L15:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disconnectDeviceHfp(Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice device) {
        if (bluetoothHeadset == null) goto L15;
        if (device == null) goto L15;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L15;
        Method r3 = bluetoothHeadset.getClass().getMethod("disconnect", new Class[]{BluetoothDevice.class});     // Catch: Exception -> L13
        r3.setAccessible(true);     // Catch: Exception -> L13
        Object r4 = r3.invoke(bluetoothHeadset, new Object[]{device});     // Catch: Exception -> L13
        if ((r4 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r4).booleanValue();
    L13:
        e = move-exception;
        JL_Log.e(TAG, "disconnectDeviceHfp", "have an exception : " + e);
        e.printStackTrace();
    L15:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean enableBluetooth(Context context) {
        BluetoothAdapter r0 = BluetoothAdapter.getDefaultAdapter();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L8;
        return false;
    L8:
        if (r0.isEnabled() == false) goto L12;
        return true;
    L12:
        return r0.enable();
    }

    public static int formatBleMtu(int mtu) {
        if (mtu >= 20) goto L6;
        mtu = 20;
    L6:
        if (mtu <= 509) goto L8;
        return 509;
    L8:
        return mtu;
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static BluetoothDevice getActivityDevice(Context context, BluetoothA2dp bluetoothA2dp) {
        if (bluetoothA2dp != null) goto L5;
    L11:
        return null;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L11;
        Method r4 = bluetoothA2dp.getClass().getDeclaredMethod("getActiveDevice", new Class[0]);     // Catch: Exception -> L9
        r4.setAccessible(true);     // Catch: Exception -> L9
        return (BluetoothDevice) r4.invoke(bluetoothA2dp, new Object[0]);
    L9:
        e = move-exception;
        e.printStackTrace();
        goto L11
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static int getBtAdapterConnectionState(Context context, BluetoothAdapter bluetoothAdapter) {
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L5;
        return 0;
    L5:
        if (bluetoothAdapter != null) goto L14;
    L13:
        return 0;
    L14:
        Method r3 = bluetoothAdapter.getClass().getDeclaredMethod("getConnectionState", new Class[0]);     // Catch: Exception -> L11
        r3.setAccessible(true);     // Catch: Exception -> L11
        Object r4 = r3.invoke(bluetoothAdapter, new Object[0]);     // Catch: Exception -> L11
        if ((r4 instanceof Integer) == false) goto L13;
        return ((Integer) r4).intValue();
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getConnectedBleDeviceList(Context context) {
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L5;
        return null;
    L5:
        BluetoothManager r2 = (BluetoothManager) context.getSystemService(Z3.d);
        if (r2 != null) goto L13;
    L12:
        return null;
    L13:
        return r2.getConnectedDevices(7);
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L12
    }

    public static Method getDeclaredMethod() throws Exception {
        return Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getPairedBLEDevices(Context context) {
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L5;
        return null;
    L5:
        List<BluetoothDevice> r4 = getPairedDevices(context);
        if (r4 != null) goto L8;
        return null;
    L8:
        ArrayList r0 = new ArrayList();
        Iterator<BluetoothDevice> r5 = r4.iterator();
    L10:
        if (r5.hasNext() == false) goto L16;
        BluetoothDevice r1 = r5.next();
        int r2 = r1.getType();
        if (r2 == 2) goto L15;
        if (r2 != 3) goto L10;
    L15:
        r0.add(r1);
        goto L10
    L16:
        return r0;
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getPairedDevices(Context context) {
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L5;
        return null;
    L5:
        BluetoothAdapter r2 = BluetoothAdapter.getDefaultAdapter();
        if (r2 != null) goto L9;
        return null;
    L9:
        if (r2.isEnabled() == true) goto L11;
        return null;
    L11:
        ArrayList r0 = new ArrayList();
        if (r2.getBondedDevices() == null) goto L14;
        r0.addAll(r2.getBondedDevices());
    L14:
        return r0;
    }

    @SuppressLint({"MissingPermission"})
    public static int getPriority(Context context, BluetoothProfile profile, BluetoothDevice device) {
        if (profile == null) goto L18;
        if (device == null) goto L18;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L18;
        Method r4 = (Method) getDeclaredMethod().invoke(profile.getClass(), new Object[]{"getPriority", new Class[]{BluetoothDevice.class}});     // Catch: Exception -> L16
        if (r4 != null) goto L11;
        return 0;
    L11:
        Object r5 = r4.invoke(profile, new Object[]{device});     // Catch: Exception -> L16
        if ((r5 instanceof Integer) == true) goto L14;
        return 0;
    L14:
        return ((Integer) r5).intValue();
    L16:
        e = move-exception;
        e.printStackTrace();
    L18:
        return 0;
    }

    @Deprecated
    public static BluetoothDevice getRemoteDevice(String address) {
        return getRemoteDevice(ConnectUtil.getContext(), address);
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getSystemConnectedBtDeviceList(Context context) {
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L5;
        return null;
    L5:
        ArrayList r0 = new ArrayList();
        BluetoothAdapter r2 = BluetoothAdapter.getDefaultAdapter();
        int r3 = getBtAdapterConnectionState(context, r2);     // Catch: Exception -> L16
        if (r3 == 2) goto L9;
        if (r3 == 0) goto L9;
    L19:
        if (r0.size() <= 0) goto L21;
        return r0;
    L21:
        return null;
    L9:
        Iterator<BluetoothDevice> r4 = r2.getBondedDevices().iterator();     // Catch: Exception -> L16
    L11:
        if (r4.hasNext() == false) goto L19;
        BluetoothDevice r5 = r4.next();     // Catch: Exception -> L16
        if (isBTConnected(context, r5) == false) goto L11;
        r0.add(r5);     // Catch: Exception -> L16
    L16:
        e = move-exception;
        e.printStackTrace();
        goto L19
    }

    public static boolean hasBle(Context context) {
        if (context != null) goto L4;
        return false;
    L4:
        if (context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") == false) goto L9;
        return true;
    L9:
        return false;
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

    public static byte[] hexStringCovertToByteArray(String hexString) {
        if (TextUtils.isEmpty(hexString) == true) goto L15;
        int r0 = hexString.length() / 2;
        byte[] r2 = new byte[r0];
        int r3 = 0;
    L5:
        if (r3 >= r0) goto L14;
        int r4 = r3 * 2;
        int r5 = r4 + 2;
        if (r5 > hexString.length()) goto L13;
        r2[r3] = (byte) Integer.valueOf(hexString.substring(r4, r5), 16).intValue();     // Catch: Exception -> L10
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
    public static boolean isBTConnected(Context context, BluetoothDevice device) {
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L5;
        return false;
    L5:
        if (device != null) goto L14;
    L13:
        return false;
    L14:
        Object r3 = device.getClass().getDeclaredMethod("isConnected", new Class[0]).invoke(device, new Object[0]);     // Catch: Exception -> L11
        if ((r3 instanceof Boolean) == true) goto L9;
        return false;
    L9:
        return ((Boolean) r3).booleanValue();
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isBleConnected(Context context, BluetoothDevice device) {
        if (context == null) goto L19;
        if (device == null) goto L19;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L19;
        List<BluetoothDevice> r3 = getConnectedBleDeviceList(context);
        if (r3 == null) goto L19;
        Iterator<BluetoothDevice> r4 = r3.iterator();
    L12:
        if (r4.hasNext() == false) goto L19;
        BluetoothDevice r1 = r4.next();
        if (r1 == null) goto L12;
        if (device.getAddress().equals(r1.getAddress()) == false) goto L12;
        return true;
    L19:
        return false;
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
    public static void printBleGattServices(Context context, BluetoothDevice device, BluetoothGatt gatt, int status) {
        if (device == null) goto L50;
        if (gatt != null) goto L5;
        return;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L8;
        return;
    L8:
        if (JL_Log.isLog() == false) goto L52;
        String r0 = TAG;
        JL_Log.d(r0, ConnectUtil.formatString("[[============================Bluetooth[%s], Discovery Services status[%d]=================================]]\n", new Object[]{printBtDeviceInfo(context, device), Integer.valueOf(status)}));
        List<BluetoothGattService> r8 = gatt.getServices();
        if (r8 == null) goto L31;
        JL_Log.d(r0, "[[======Service Size:" + r8.size() + "======================\n");
        Iterator<BluetoothGattService> r9 = r8.iterator();
    L13:
        if (r9.hasNext() == false) goto L31;
        BluetoothGattService r10 = r9.next();
        if (r10 == null) goto L13;
        String r1 = TAG;
        JL_Log.d(r1, "[[======Service:" + r10.getUuid() + "======================\n");
        List<BluetoothGattCharacteristic> r11 = r10.getCharacteristics();
        if (r11 == null) goto L13;
        JL_Log.d(r1, "[[[[=============characteristics Size:" + r11.size() + "======================\n");
        Iterator<BluetoothGattCharacteristic> r12 = r11.iterator();
    L20:
        if (r12.hasNext() == false) goto L13;
        BluetoothGattCharacteristic r2 = r12.next();
        if (r2 == null) goto L20;
        String r3 = TAG;
        JL_Log.d(r3, "[[[[=============characteristic:" + r2.getUuid() + ",write type : " + r2.getWriteType() + "======================\n");
        List<BluetoothGattDescriptor> r4 = r2.getDescriptors();
        if (r4 == null) goto L20;
        JL_Log.d(r3, "[[[[[[=============descriptors Size:" + r4.size() + "======================\n");
        Iterator<BluetoothGattDescriptor> r5 = r4.iterator();
    L27:
        if (r5.hasNext() == false) goto L20;
        BluetoothGattDescriptor r6 = r5.next();
        if (r6 == null) goto L27;
        JL_Log.d(TAG, "[[[[[[=============descriptor:" + r6.getUuid() + ",permission:" + r6.getPermissions() + "\nvalue : " + CHexConverter.byte2HexStr(r6.getValue()) + "======================\n");
    L31:
        JL_Log.d(TAG, "[[============================Bluetooth[" + printBtDeviceInfo(context, device) + "] Services show End=================================]]\n");
        return;
    L52:
        return;
    }

    @Deprecated
    public static String printBtDeviceInfo(BluetoothDevice device) {
        return printBtDeviceInfo(ConnectUtil.getContext(), device, true);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean refreshBleDeviceCache(Context context, BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null) goto L5;
    L14:
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L14;
        Object r3 = bluetoothGatt.getClass().getMethod(ToolBar.REFRESH, new Class[0]).invoke(bluetoothGatt, new Object[0]);     // Catch: Exception -> L12
        if ((r3 instanceof Boolean) == false) goto L14;
        return ((Boolean) r3).booleanValue();
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L14
    }

    @SuppressLint({"MissingPermission"})
    public static boolean removeBond(Context context, BluetoothDevice device) {
        if (device != null) goto L5;
    L15:
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L15;
        Object r4 = device.getClass().getMethod("removeBond", new Class[0]).invoke(device, new Object[0]);     // Catch: Exception -> L13
        if ((r4 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r4).booleanValue();
    L13:
        e = move-exception;
        e.printStackTrace();
        JL_Log.e(TAG, "removeBond", "Invoke removeBond : " + e.getMessage());
        goto L15
    }

    public static String reverseAddressString(String srcAddr) {
        if (BluetoothAdapter.checkBluetoothAddress(srcAddr) == true) goto L6;
        return srcAddr;
    L6:
        if (srcAddr.contains(CertificateUtil.DELIMITER) == false) goto L8;
        srcAddr = srcAddr.replaceAll(CertificateUtil.DELIMITER, "");
    L8:
        byte[] r0 = hexStringCovertToByteArray(srcAddr);
        if (r0 != null) goto L11;
        return srcAddr;
    L11:
        byte[] r7 = new byte[6];
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
        r7[r4] = r0[r1];
        r4 = r4 + 1;
        r1 = r1 - 1;
        goto L13
    L23:
        return hexDataCovetToAddress(r7);
    L18:
        r6 = false;
        goto L20
    L15:
        r5 = false;
        goto L16
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static boolean setActivityDevice(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp == null) goto L15;
        if (device == null) goto L15;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L15;
        Method r3 = bluetoothA2dp.getClass().getDeclaredMethod("setActiveDevice", new Class[]{device.getClass()});     // Catch: Exception -> L13
        r3.setAccessible(true);     // Catch: Exception -> L13
        Object r4 = r3.invoke(bluetoothA2dp, new Object[]{device});     // Catch: Exception -> L13
        if ((r4 instanceof Boolean) == true) goto L11;
        return false;
    L11:
        return ((Boolean) r4).booleanValue();
    L13:
        e = move-exception;
        e.printStackTrace();
    L15:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean setPriority(Context context, BluetoothProfile profile, BluetoothDevice device, int priority) {
        if (profile == null) goto L18;
        if (device == null) goto L18;
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L18;
        Method r5 = (Method) getDeclaredMethod().invoke(profile.getClass(), new Object[]{"setPriority", new Class[]{BluetoothDevice.class, Integer.TYPE}});     // Catch: Exception -> L16
        if (r5 != null) goto L11;
        return false;
    L11:
        Object r6 = r5.invoke(profile, new Object[]{device, Integer.valueOf(priority)});     // Catch: Exception -> L16
        if ((r6 instanceof Boolean) == true) goto L14;
        return false;
    L14:
        return ((Boolean) r6).booleanValue();
    L16:
        e = move-exception;
        e.printStackTrace();
    L18:
        return false;
    }

    public static BluetoothDevice getRemoteDevice(Context context, String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L5;
    L14:
        return null;
    L5:
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L14;
        BluetoothAdapter r2 = BluetoothAdapter.getDefaultAdapter();
        if (r2 != null) goto L15;
        return null;
    L15:
        return r2.getRemoteDevice(address);
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L14
    }

    public static String printBtDeviceInfo(Context context, BluetoothDevice device) {
        return printBtDeviceInfo(context, device, true);
    }

    @SuppressLint({"MissingPermission"})
    public static String printBtDeviceInfo(Context context, BluetoothDevice device, boolean isDetail) {
        if (device != null) goto L4;
        return "null";
    L4:
        if (ConnectUtil.isHasConnectPermission(context) == false) goto L13;
        if (isDetail == false) goto L10;
        return "name : " + device.getName() + ", type : " + device.getType() + ", address : " + device.getAddress();
    L10:
        return device.getAddress();
    L13:
        return "null";
    }

    @SuppressLint({"MissingPermission"})
    public static boolean createBond(Context context, BluetoothDevice device) {
        if (device != null) goto L4;
        return false;
    L4:
        if (ConnectUtil.isHasConnectPermission(context) == true) goto L7;
        return false;
    L7:
        return device.createBond();
    }
}
