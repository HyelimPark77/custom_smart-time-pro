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
import com.ironsource.C12250Z3;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothUtil {
    private static final String TAG = "BluetoothUtil";
    private static final char[] mChars = "0123456789ABCDEF".toCharArray();

    public static byte[] addressCovertToByteArray(String address) {
        if (!TextUtils.isEmpty(address) && address.contains(CertificateUtil.DELIMITER)) {
            String strReplace = address.replace(CertificateUtil.DELIMITER, "");
            int length = strReplace.length() / 2;
            byte[] bArr = new byte[length];
            if (length == 6) {
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    int i3 = i2 + 2;
                    if (i3 <= strReplace.length()) {
                        try {
                            bArr[i] = (byte) Integer.valueOf(strReplace.substring(i2, i3), 16).intValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }
                return bArr;
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean connectDeviceA2dp(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Object objInvoke = bluetoothA2dp.getClass().getMethod("connect", BluetoothDevice.class).invoke(bluetoothA2dp, device);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean connectDeviceHfp(Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice device) {
        if (bluetoothHeadset != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method method = bluetoothHeadset.getClass().getMethod("connect", BluetoothDevice.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(bluetoothHeadset, device);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static String connectionString(int connection) {
        if (connection != 1) {
            return connection != 2 ? "STATE_DISCONNECTED(0)" : "STATE_CONNECTED(2)";
        }
        return "STATE_CONNECTING(1)";
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    public static boolean createBond(Context context, BluetoothDevice device, int transport) {
        if (device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method declaredMethod = device.getClass().getDeclaredMethod("createBond", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(device, Integer.valueOf(transport));
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean deviceEquals(BluetoothDevice device1, BluetoothDevice device2) {
        return (device1 == null || device2 == null || !device1.getAddress().equals(device2.getAddress())) ? false : true;
    }

    public static boolean deviceHasA2dp(Context context, BluetoothDevice device) {
        return deviceHasProfile(context, device, BluetoothConstant.UUID_A2DP);
    }

    public static boolean deviceHasHfp(Context context, BluetoothDevice device) {
        return deviceHasProfile(context, device, BluetoothConstant.UUID_HFP);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean deviceHasProfile(Context context, BluetoothDevice device, UUID profileUuid) {
        ParcelUuid[] uuids;
        if (!isBluetoothEnable() || device == null || profileUuid == null || TextUtils.isEmpty(profileUuid.toString()) || !ConnectUtil.isHasConnectPermission(context) || (uuids = device.getUuids()) == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : uuids) {
            if (parcelUuid != null && profileUuid.toString().equalsIgnoreCase(parcelUuid.toString())) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disableBluetooth(Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !ConnectUtil.isHasConnectPermission(context)) {
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            return defaultAdapter.disable();
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disconnectDeviceA2dp(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method method = bluetoothA2dp.getClass().getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(bluetoothA2dp, device);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                JL_Log.m26849e(TAG, "disconnectDeviceA2dp", "have an exception : " + e);
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean disconnectDeviceHfp(Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice device) {
        if (bluetoothHeadset != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method method = bluetoothHeadset.getClass().getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(bluetoothHeadset, device);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                JL_Log.m26849e(TAG, "disconnectDeviceHfp", "have an exception : " + e);
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean enableBluetooth(Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !ConnectUtil.isHasConnectPermission(context)) {
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            return true;
        }
        return defaultAdapter.enable();
    }

    public static int formatBleMtu(int mtu) {
        if (mtu < 20) {
            mtu = 20;
        }
        if (mtu > 509) {
            return 509;
        }
        return mtu;
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static BluetoothDevice getActivityDevice(Context context, BluetoothA2dp bluetoothA2dp) {
        if (bluetoothA2dp != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method declaredMethod = bluetoothA2dp.getClass().getDeclaredMethod("getActiveDevice", new Class[0]);
                declaredMethod.setAccessible(true);
                return (BluetoothDevice) declaredMethod.invoke(bluetoothA2dp, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static int getBtAdapterConnectionState(Context context, BluetoothAdapter bluetoothAdapter) {
        if (ConnectUtil.isHasConnectPermission(context) && bluetoothAdapter != null) {
            try {
                Method declaredMethod = bluetoothAdapter.getClass().getDeclaredMethod("getConnectionState", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(bluetoothAdapter, new Object[0]);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getConnectedBleDeviceList(Context context) {
        BluetoothManager bluetoothManager;
        if (ConnectUtil.isHasConnectPermission(context) && (bluetoothManager = (BluetoothManager) context.getSystemService(C12250Z3.f30472d)) != null) {
            try {
                return bluetoothManager.getConnectedDevices(7);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Method getDeclaredMethod() throws Exception {
        return Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getPairedBLEDevices(Context context) {
        List<BluetoothDevice> pairedDevices;
        if (!ConnectUtil.isHasConnectPermission(context) || (pairedDevices = getPairedDevices(context)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : pairedDevices) {
            int type = bluetoothDevice.getType();
            if (type == 2 || type == 3) {
                arrayList.add(bluetoothDevice);
            }
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getPairedDevices(Context context) {
        BluetoothAdapter defaultAdapter;
        if (!ConnectUtil.isHasConnectPermission(context) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (defaultAdapter.getBondedDevices() != null) {
            arrayList.addAll(defaultAdapter.getBondedDevices());
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    public static int getPriority(Context context, BluetoothProfile profile, BluetoothDevice device) {
        if (profile != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method method = (Method) getDeclaredMethod().invoke(profile.getClass(), "getPriority", new Class[]{BluetoothDevice.class});
                if (method == null) {
                    return 0;
                }
                Object objInvoke = method.invoke(profile, device);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Deprecated
    public static BluetoothDevice getRemoteDevice(String address) {
        return getRemoteDevice(ConnectUtil.getContext(), address);
    }

    @SuppressLint({"MissingPermission"})
    public static List<BluetoothDevice> getSystemConnectedBtDeviceList(Context context) {
        if (!ConnectUtil.isHasConnectPermission(context)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            int btAdapterConnectionState = getBtAdapterConnectionState(context, defaultAdapter);
            if (btAdapterConnectionState == 2 || btAdapterConnectionState == 0) {
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (isBTConnected(context, bluetoothDevice)) {
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public static boolean hasBle(Context context) {
        return context != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static String hexDataCovetToAddress(byte[] data) {
        StringBuilder sb = new StringBuilder();
        if (data != null && data.length == 6) {
            for (int i = 0; i < data.length; i++) {
                char[] cArr = mChars;
                sb.append(cArr[(data[i] & 255) >> 4]);
                sb.append(cArr[data[i] & 15]);
                if (i != data.length - 1) {
                    sb.append(CertificateUtil.DELIMITER);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] hexStringCovertToByteArray(String hexString) {
        if (TextUtils.isEmpty(hexString)) {
            return null;
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 2;
            if (i3 <= hexString.length()) {
                try {
                    bArr[i] = (byte) Integer.valueOf(hexString.substring(i2, i3), 16).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return bArr;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isBTConnected(Context context, BluetoothDevice device) {
        if (ConnectUtil.isHasConnectPermission(context) && device != null) {
            try {
                Object objInvoke = device.getClass().getDeclaredMethod("isConnected", new Class[0]).invoke(device, new Object[0]);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isBleConnected(Context context, BluetoothDevice device) {
        List<BluetoothDevice> connectedBleDeviceList;
        if (context != null && device != null && ConnectUtil.isHasConnectPermission(context) && (connectedBleDeviceList = getConnectedBleDeviceList(context)) != null) {
            for (BluetoothDevice bluetoothDevice : connectedBleDeviceList) {
                if (bluetoothDevice != null && device.getAddress().equals(bluetoothDevice.getAddress())) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    @SuppressLint({"MissingPermission"})
    public static void printBleGattServices(Context context, BluetoothDevice device, BluetoothGatt gatt, int status) {
        if (device == null || gatt == null || !ConnectUtil.isHasConnectPermission(context) || !JL_Log.isLog()) {
            return;
        }
        String str = TAG;
        JL_Log.m26846d(str, ConnectUtil.formatString("[[============================Bluetooth[%s], Discovery Services status[%d]=================================]]\n", printBtDeviceInfo(context, device), Integer.valueOf(status)));
        List<BluetoothGattService> services = gatt.getServices();
        if (services != null) {
            JL_Log.m26846d(str, "[[======Service Size:" + services.size() + "======================\n");
            for (BluetoothGattService bluetoothGattService : services) {
                if (bluetoothGattService != null) {
                    String str2 = TAG;
                    JL_Log.m26846d(str2, "[[======Service:" + bluetoothGattService.getUuid() + "======================\n");
                    List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
                    if (characteristics != null) {
                        JL_Log.m26846d(str2, "[[[[=============characteristics Size:" + characteristics.size() + "======================\n");
                        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                            if (bluetoothGattCharacteristic != null) {
                                String str3 = TAG;
                                JL_Log.m26846d(str3, "[[[[=============characteristic:" + bluetoothGattCharacteristic.getUuid() + ",write type : " + bluetoothGattCharacteristic.getWriteType() + "======================\n");
                                List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
                                if (descriptors != null) {
                                    JL_Log.m26846d(str3, "[[[[[[=============descriptors Size:" + descriptors.size() + "======================\n");
                                    for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                                        if (bluetoothGattDescriptor != null) {
                                            JL_Log.m26846d(TAG, "[[[[[[=============descriptor:" + bluetoothGattDescriptor.getUuid() + ",permission:" + bluetoothGattDescriptor.getPermissions() + "\nvalue : " + CHexConverter.byte2HexStr(bluetoothGattDescriptor.getValue()) + "======================\n");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        JL_Log.m26846d(TAG, "[[============================Bluetooth[" + printBtDeviceInfo(context, device) + "] Services show End=================================]]\n");
    }

    @Deprecated
    public static String printBtDeviceInfo(BluetoothDevice device) {
        return printBtDeviceInfo(ConnectUtil.getContext(), device, true);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean refreshBleDeviceCache(Context context, BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Object objInvoke = bluetoothGatt.getClass().getMethod(ToolBar.REFRESH, new Class[0]).invoke(bluetoothGatt, new Object[0]);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean removeBond(Context context, BluetoothDevice device) {
        if (device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Object objInvoke = device.getClass().getMethod("removeBond", new Class[0]).invoke(device, new Object[0]);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                JL_Log.m26849e(TAG, "removeBond", "Invoke removeBond : " + e.getMessage());
            }
        }
        return false;
    }

    public static String reverseAddressString(String srcAddr) {
        if (!BluetoothAdapter.checkBluetoothAddress(srcAddr)) {
            return srcAddr;
        }
        if (srcAddr.contains(CertificateUtil.DELIMITER)) {
            srcAddr = srcAddr.replaceAll(CertificateUtil.DELIMITER, "");
        }
        byte[] bArrHexStringCovertToByteArray = hexStringCovertToByteArray(srcAddr);
        if (bArrHexStringCovertToByteArray == null) {
            return srcAddr;
        }
        byte[] bArr = new byte[6];
        int length = bArrHexStringCovertToByteArray.length - 1;
        int i = 0;
        while (true) {
            if (!(i < bArrHexStringCovertToByteArray.length) || !(length >= 0)) {
                return hexDataCovetToAddress(bArr);
            }
            bArr[i] = bArrHexStringCovertToByteArray[length];
            i++;
            length--;
        }
    }

    @SuppressLint({"DiscouragedPrivateApi", "MissingPermission"})
    public static boolean setActivityDevice(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method declaredMethod = bluetoothA2dp.getClass().getDeclaredMethod("setActiveDevice", device.getClass());
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(bluetoothA2dp, device);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean setPriority(Context context, BluetoothProfile profile, BluetoothDevice device, int priority) {
        if (profile != null && device != null && ConnectUtil.isHasConnectPermission(context)) {
            try {
                Method method = (Method) getDeclaredMethod().invoke(profile.getClass(), "setPriority", new Class[]{BluetoothDevice.class, Integer.TYPE});
                if (method == null) {
                    return false;
                }
                Object objInvoke = method.invoke(profile, device, Integer.valueOf(priority));
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static BluetoothDevice getRemoteDevice(Context context, String address) {
        BluetoothAdapter defaultAdapter;
        if (!BluetoothAdapter.checkBluetoothAddress(address) || !ConnectUtil.isHasConnectPermission(context) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(address);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String printBtDeviceInfo(Context context, BluetoothDevice device) {
        return printBtDeviceInfo(context, device, true);
    }

    @SuppressLint({"MissingPermission"})
    public static String printBtDeviceInfo(Context context, BluetoothDevice device, boolean isDetail) {
        if (device == null || !ConnectUtil.isHasConnectPermission(context)) {
            return "null";
        }
        if (isDetail) {
            return "name : " + device.getName() + ", type : " + device.getType() + ", address : " + device.getAddress();
        }
        return device.getAddress();
    }

    @SuppressLint({"MissingPermission"})
    public static boolean createBond(Context context, BluetoothDevice device) {
        if (device == null || !ConnectUtil.isHasConnectPermission(context)) {
            return false;
        }
        return device.createBond();
    }
}
