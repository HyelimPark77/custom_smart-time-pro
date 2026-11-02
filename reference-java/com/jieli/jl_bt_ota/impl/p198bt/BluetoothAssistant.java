package com.jieli.jl_bt_ota.impl.p198bt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtBleListener;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.ble.BleCharacteristic;
import com.jieli.jl_bt_ota.model.ble.BleConnectParam;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothAssistant extends BluetoothBle {

    /* JADX INFO: renamed from: H */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile BluetoothAssistant f37563H;

    private BluetoothAssistant(Context context) {
        super(context);
    }

    public static BluetoothAssistant getInstance() {
        return f37563H;
    }

    public static void init(Context context) {
        if (f37563H == null) {
            synchronized (BluetoothAssistant.class) {
                try {
                    if (f37563H == null) {
                        f37563H = new BluetoothAssistant(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean isInit() {
        return f37563H != null;
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public /* bridge */ /* synthetic */ void addOnBtAssistantCallback(OnBtAssistantCallback onBtAssistantCallback) {
        super.addOnBtAssistantCallback(onBtAssistantCallback);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ void addOnBtBleListener(OnBtBleListener onBtBleListener) {
        super.addOnBtBleListener(onBtBleListener);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public /* bridge */ /* synthetic */ void configure(BluetoothOTAConfigure bluetoothOTAConfigure) {
        super.configure(bluetoothOTAConfigure);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean connectBLEDevice(BluetoothDevice bluetoothDevice, BleConnectParam bleConnectParam) {
        return super.connectBLEDevice(bluetoothDevice, bleConnectParam);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean deviceHasA2dp(BluetoothDevice bluetoothDevice) {
        return super.deviceHasA2dp(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean deviceHasHfp(BluetoothDevice bluetoothDevice) {
        return super.deviceHasHfp(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean disconnectBLEDevice(BluetoothDevice bluetoothDevice) {
        return super.disconnectBLEDevice(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ boolean disconnectByProfiles(BluetoothDevice bluetoothDevice) {
        return super.disconnectByProfiles(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromA2dp(BluetoothDevice bluetoothDevice) {
        return super.disconnectFromA2dp(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromHfp(BluetoothDevice bluetoothDevice) {
        return super.disconnectFromHfp(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ int getBleMtu(BluetoothDevice bluetoothDevice) {
        return super.getBleMtu(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ BluetoothHeadset getBluetoothHfp() {
        return super.getBluetoothHfp();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public /* bridge */ /* synthetic */ BluetoothOTAConfigure getBluetoothOption() {
        return super.getBluetoothOption();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ List getConnectedBleDevices() {
        return super.getConnectedBleDevices();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ BluetoothDevice getConnectingBleDevice() {
        return super.getConnectingBleDevice();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ BluetoothGatt getDeviceGatt(BluetoothDevice bluetoothDevice) {
        return super.getDeviceGatt(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ List getDevicesConnectedByProfile() {
        return super.getDevicesConnectedByProfile();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    public /* bridge */ /* synthetic */ ArrayList getDiscoveredBluetoothDevices() {
        return super.getDiscoveredBluetoothDevices();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    public /* bridge */ /* synthetic */ int getScanType() {
        return super.getScanType();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ BluetoothDevice getUsingBleDevice() {
        return super.getUsingBleDevice();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ BluetoothA2dp getmBluetoothA2dp() {
        return super.getmBluetoothA2dp();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean isBleConnecting() {
        return super.isBleConnecting();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public /* bridge */ /* synthetic */ boolean isBluetoothEnable() {
        return super.isBluetoothEnable();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean isConnectedBLEDevice(BluetoothDevice bluetoothDevice) {
        return super.isConnectedBLEDevice(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int isConnectedByA2dp(BluetoothDevice bluetoothDevice) {
        return super.isConnectedByA2dp(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int isConnectedByHfp(BluetoothDevice bluetoothDevice) {
        return super.isConnectedByHfp(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int isConnectedByProfile(BluetoothDevice bluetoothDevice) {
        return super.isConnectedByProfile(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    public /* bridge */ /* synthetic */ boolean isScanning() {
        return super.isScanning();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle, com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles, com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public void release() {
        super.release();
        f37563H = null;
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public /* bridge */ /* synthetic */ void removeOnBtAssistantCallback(OnBtAssistantCallback onBtAssistantCallback) {
        super.removeOnBtAssistantCallback(onBtAssistantCallback);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ void removeOnBtBleListener(OnBtBleListener onBtBleListener) {
        super.removeOnBtBleListener(onBtBleListener);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean requestBleMtu(BluetoothDevice bluetoothDevice, int i) {
        return super.requestBleMtu(bluetoothDevice, i);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ void sendBleData(BleSendParam bleSendParam) {
        super.sendBleData(bleSendParam);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int startBLEScan(long j) {
        return super.startBLEScan(j);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int startDeviceScan(long j, int i) {
        return super.startDeviceScan(j, i);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int stopBLEScan() {
        return super.stopBLEScan();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int stopDeviceScan() {
        return super.stopDeviceScan();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean switchBleCharacteristic(BluetoothGatt bluetoothGatt, BleCharacteristic bleCharacteristic) {
        return super.switchBleCharacteristic(bluetoothGatt, bleCharacteristic);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    public /* bridge */ /* synthetic */ void switchConnectedBleDevice(BluetoothDevice bluetoothDevice) {
        super.switchConnectedBleDevice(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBle
    @SuppressLint({"MissingPermission", "WrongConstant"})
    public /* bridge */ /* synthetic */ boolean writeBleData(BleSendParam bleSendParam) {
        return super.writeBleData(bleSendParam);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromA2dp(String str) {
        return super.disconnectFromA2dp(str);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromHfp(String str) {
        return super.disconnectFromHfp(str);
    }
}
