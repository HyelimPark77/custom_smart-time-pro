package com.jieli.jl_bt_ota.impl.bt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtBleListener;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.ble.BleCharacteristic;
import com.jieli.jl_bt_ota.model.ble.BleConnectParam;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothAssistant extends BluetoothBle {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile BluetoothAssistant H;

    private BluetoothAssistant(Context r1) {
        super(r1);
    }

    public static BluetoothAssistant getInstance() {
        return H;
    }

    public static void init(Context r2) {
        if (H == null) goto L5;
        return;
    L5:
        monitor-enter(BluetoothAssistant.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (H != null) goto L11;
        H = new BluetoothAssistant(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(BluetoothAssistant.class);     // Catch: Throwable -> L9
    }

    public static boolean isInit() {
        if (H == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public /* bridge */ /* synthetic */ void addOnBtAssistantCallback(OnBtAssistantCallback r1) {
        super.addOnBtAssistantCallback(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ void addOnBtBleListener(OnBtBleListener r1) {
        super.addOnBtBleListener(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public /* bridge */ /* synthetic */ void configure(BluetoothOTAConfigure r1) {
        super.configure(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean connectBLEDevice(BluetoothDevice r1, BleConnectParam r2) {
        return super.connectBLEDevice(r1, r2);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean deviceHasA2dp(BluetoothDevice r1) {
        return super.deviceHasA2dp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean deviceHasHfp(BluetoothDevice r1) {
        return super.deviceHasHfp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean disconnectBLEDevice(BluetoothDevice r1) {
        return super.disconnectBLEDevice(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ boolean disconnectByProfiles(BluetoothDevice r1) {
        return super.disconnectByProfiles(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromA2dp(BluetoothDevice r1) {
        return super.disconnectFromA2dp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromHfp(BluetoothDevice r1) {
        return super.disconnectFromHfp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ int getBleMtu(BluetoothDevice r1) {
        return super.getBleMtu(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ BluetoothHeadset getBluetoothHfp() {
        return super.getBluetoothHfp();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public /* bridge */ /* synthetic */ BluetoothOTAConfigure getBluetoothOption() {
        return super.getBluetoothOption();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ List getConnectedBleDevices() {
        return super.getConnectedBleDevices();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ BluetoothDevice getConnectingBleDevice() {
        return super.getConnectingBleDevice();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ BluetoothGatt getDeviceGatt(BluetoothDevice r1) {
        return super.getDeviceGatt(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ List getDevicesConnectedByProfile() {
        return super.getDevicesConnectedByProfile();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    public /* bridge */ /* synthetic */ ArrayList getDiscoveredBluetoothDevices() {
        return super.getDiscoveredBluetoothDevices();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    public /* bridge */ /* synthetic */ int getScanType() {
        return super.getScanType();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ BluetoothDevice getUsingBleDevice() {
        return super.getUsingBleDevice();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ BluetoothA2dp getmBluetoothA2dp() {
        return super.getmBluetoothA2dp();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean isBleConnecting() {
        return super.isBleConnecting();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public /* bridge */ /* synthetic */ boolean isBluetoothEnable() {
        return super.isBluetoothEnable();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean isConnectedBLEDevice(BluetoothDevice r1) {
        return super.isConnectedBLEDevice(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int isConnectedByA2dp(BluetoothDevice r1) {
        return super.isConnectedByA2dp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int isConnectedByHfp(BluetoothDevice r1) {
        return super.isConnectedByHfp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int isConnectedByProfile(BluetoothDevice r1) {
        return super.isConnectedByProfile(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    public /* bridge */ /* synthetic */ boolean isScanning() {
        return super.isScanning();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle, com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles, com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public void release() {
        super.release();
        H = null;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public /* bridge */ /* synthetic */ void removeOnBtAssistantCallback(OnBtAssistantCallback r1) {
        super.removeOnBtAssistantCallback(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ void removeOnBtBleListener(OnBtBleListener r1) {
        super.removeOnBtBleListener(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean requestBleMtu(BluetoothDevice r1, int r2) {
        return super.requestBleMtu(r1, r2);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ void sendBleData(BleSendParam r1) {
        super.sendBleData(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int startBLEScan(long r1) {
        return super.startBLEScan(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int startDeviceScan(long r1, int r3) {
        return super.startDeviceScan(r1, r3);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int stopBLEScan() {
        return super.stopBLEScan();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public /* bridge */ /* synthetic */ int stopDeviceScan() {
        return super.stopDeviceScan();
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ boolean switchBleCharacteristic(BluetoothGatt r1, BleCharacteristic r2) {
        return super.switchBleCharacteristic(r1, r2);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    public /* bridge */ /* synthetic */ void switchConnectedBleDevice(BluetoothDevice r1) {
        super.switchConnectedBleDevice(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBle
    @SuppressLint({"MissingPermission", "WrongConstant"})
    public /* bridge */ /* synthetic */ boolean writeBleData(BleSendParam r1) {
        return super.writeBleData(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromA2dp(String r1) {
        return super.disconnectFromA2dp(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles
    public /* bridge */ /* synthetic */ boolean disconnectFromHfp(String r1) {
        return super.disconnectFromHfp(r1);
    }
}
