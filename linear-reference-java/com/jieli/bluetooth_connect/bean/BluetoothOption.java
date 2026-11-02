package com.jieli.bluetooth_connect.bean;

import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothOption {
    private int bleScanMode;
    private int bleScanStrategy;
    private final Map<String, UUID> bleUUIDMap;
    private boolean enterLowPowerMode;
    private boolean isAutoConnectBle;
    private boolean isNeedChangeBleMtu;
    private boolean isNotAssociatedEDR;
    private boolean isOnlyConnect;
    private boolean isSkipNoneNameDevice;
    private boolean isSupportA2DP;
    private boolean isSupportCTKD;
    private boolean isUseBleBondWay;

    @Deprecated
    private boolean isUseDeviceAuth;
    private boolean isUseMultiDevice;
    private int mtu;
    private String otaScanFilterData;

    @Deprecated
    private int priority;
    private boolean reconnect;
    private String scanFilterData;
    private UUID sppUUID;

    @Deprecated
    private int timeoutMs;

    public BluetoothOption() {
        this.priority = 0;
        this.timeoutMs = 2000;
        this.enterLowPowerMode = false;
        this.isUseMultiDevice = false;
        this.isUseDeviceAuth = true;
        this.isNotAssociatedEDR = false;
        this.isSkipNoneNameDevice = true;
        this.isSupportCTKD = true;
        this.otaScanFilterData = BluetoothConstant.OTA_FILTER_FLAG;
        this.bleScanStrategy = 1;
        this.bleScanMode = 1;
        this.mtu = 20;
        this.bleUUIDMap = new HashMap();
        this.isUseBleBondWay = false;
        this.isAutoConnectBle = false;
        this.isNeedChangeBleMtu = false;
        this.isOnlyConnect = false;
        this.sppUUID = BluetoothConstant.UUID_SPP;
        this.isSupportA2DP = true;
        setBleUUID(BluetoothConstant.UUID_SERVICE, BluetoothConstant.UUID_WRITE, BluetoothConstant.UUID_NOTIFICATION);
    }

    public static BluetoothOption createDefaultOption() {
        return new BluetoothOption().setReconnect(true).setTimeoutMs(2000).setMtu(20).setScanFilterData("JLAISDK");
    }

    public UUID getBleNotificationUUID() {
        UUID r0 = this.bleUUIDMap.get(BluetoothConstant.KEY_BLE_NOTIFICATION_CHARACTERISTIC_UUID);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return BluetoothConstant.UUID_NOTIFICATION;
    }

    public int getBleScanMode() {
        return this.bleScanMode;
    }

    public int getBleScanStrategy() {
        return this.bleScanStrategy;
    }

    public UUID getBleServiceUUID() {
        UUID r0 = this.bleUUIDMap.get(BluetoothConstant.KEY_BLE_SERVICE_UUID);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return BluetoothConstant.UUID_SERVICE;
    }

    public UUID getBleWriteUUID() {
        UUID r0 = this.bleUUIDMap.get(BluetoothConstant.KEY_BLE_WRITE_CHARACTERISTIC_UUID);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return BluetoothConstant.UUID_WRITE;
    }

    public int getMtu() {
        return this.mtu;
    }

    public String getOtaScanFilterData() {
        return this.otaScanFilterData;
    }

    @Deprecated
    public int getPriority() {
        return this.priority;
    }

    public String getScanFilterData() {
        return this.scanFilterData;
    }

    public UUID getSppUUID() {
        return this.sppUUID;
    }

    @Deprecated
    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    public boolean isAutoConnectBle() {
        return this.isAutoConnectBle;
    }

    public boolean isEnterLowPowerMode() {
        return this.enterLowPowerMode;
    }

    public boolean isNeedChangeBleMtu() {
        return this.isNeedChangeBleMtu;
    }

    public boolean isNotAssociatedEDR() {
        return this.isNotAssociatedEDR;
    }

    public boolean isOnlyConnect() {
        return this.isOnlyConnect;
    }

    public boolean isReconnect() {
        return this.reconnect;
    }

    public boolean isSkipNoneNameDevice() {
        return this.isSkipNoneNameDevice;
    }

    public boolean isSupportA2DP() {
        return this.isSupportA2DP;
    }

    public boolean isSupportCTKD() {
        return this.isSupportCTKD;
    }

    public boolean isUseBleBondWay() {
        return this.isUseBleBondWay;
    }

    @Deprecated
    public boolean isUseDeviceAuth() {
        return this.isUseDeviceAuth;
    }

    public boolean isUseMultiDevice() {
        return this.isUseMultiDevice;
    }

    public BluetoothOption setAutoConnectBle(boolean autoConnectBle) {
        this.isAutoConnectBle = autoConnectBle;
        return this;
    }

    public BluetoothOption setBleScanMode(int bleScanMode) {
        this.bleScanMode = bleScanMode;
        return this;
    }

    public BluetoothOption setBleScanStrategy(int bleScanStrategy) {
        this.bleScanStrategy = bleScanStrategy;
        return this;
    }

    public BluetoothOption setBleUUID(UUID serviceUUID, UUID writeCharacteristicUUID, UUID notificationCharacteristicUUID) {
        this.bleUUIDMap.put(BluetoothConstant.KEY_BLE_SERVICE_UUID, serviceUUID);
        this.bleUUIDMap.put(BluetoothConstant.KEY_BLE_WRITE_CHARACTERISTIC_UUID, writeCharacteristicUUID);
        this.bleUUIDMap.put(BluetoothConstant.KEY_BLE_NOTIFICATION_CHARACTERISTIC_UUID, notificationCharacteristicUUID);
        return this;
    }

    public BluetoothOption setEnterLowPowerMode(boolean enterLowPowerMode) {
        this.enterLowPowerMode = enterLowPowerMode;
        return this;
    }

    public BluetoothOption setMtu(int mtu) {
        this.mtu = BluetoothUtil.formatBleMtu(mtu);
        return this;
    }

    public BluetoothOption setNeedChangeBleMtu(boolean needChangeBleMtu) {
        this.isNeedChangeBleMtu = needChangeBleMtu;
        return this;
    }

    public BluetoothOption setNotAssociatedEDR(boolean notAssociatedEDR) {
        this.isNotAssociatedEDR = notAssociatedEDR;
        return this;
    }

    public BluetoothOption setOnlyConnect(boolean onlyConnect) {
        this.isOnlyConnect = onlyConnect;
        return this;
    }

    public BluetoothOption setOtaScanFilterData(String otaScanFilterData) {
        this.otaScanFilterData = otaScanFilterData;
        return this;
    }

    @Deprecated
    public BluetoothOption setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public BluetoothOption setReconnect(boolean reconnect) {
        this.reconnect = reconnect;
        return this;
    }

    public BluetoothOption setScanFilterData(String scanFilterData) {
        this.scanFilterData = scanFilterData;
        return this;
    }

    public BluetoothOption setSkipNoneNameDevice(boolean skipNoneNameDevice) {
        this.isSkipNoneNameDevice = skipNoneNameDevice;
        return this;
    }

    public BluetoothOption setSppUUID(UUID sppUUID) {
        this.sppUUID = sppUUID;
        return this;
    }

    public BluetoothOption setSupportA2DP(boolean supportA2DP) {
        this.isSupportA2DP = supportA2DP;
        return this;
    }

    public BluetoothOption setSupportCTKD(boolean supportCTKD) {
        this.isSupportCTKD = supportCTKD;
        return this;
    }

    @Deprecated
    public BluetoothOption setTimeoutMs(int timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }

    public BluetoothOption setUseBleBondWay(boolean useBleBondWay) {
        this.isUseBleBondWay = useBleBondWay;
        return this;
    }

    @Deprecated
    public BluetoothOption setUseDeviceAuth(boolean useDeviceAuth) {
        this.isUseDeviceAuth = useDeviceAuth;
        return this;
    }

    public BluetoothOption setUseMultiDevice(boolean useMultiDevice) {
        this.isUseMultiDevice = useMultiDevice;
        return this;
    }

    @NonNull
    public String toString() {
        return "BluetoothOption{priority=" + this.priority + ", reconnect=" + this.reconnect + ", timeoutMs=" + this.timeoutMs + ", scanFilterData='" + this.scanFilterData + "', mtu=" + this.mtu + ", enterLowPowerMode=" + this.enterLowPowerMode + ", bleScanStrategy=" + this.bleScanStrategy + ", bleScanMode=" + this.bleScanMode + ", bleUUIDMap=" + this.bleUUIDMap + ", sppUUID=" + this.sppUUID + ", isUseBleBondWay=" + this.isUseBleBondWay + ", isAutoConnectBle=" + this.isAutoConnectBle + ", isUseDeviceAuth=" + this.isUseDeviceAuth + ", isNotAssociatedEDR=" + this.isNotAssociatedEDR + ", isOnlyConnect=" + this.isOnlyConnect + ", isSkipNoneNameDevice=" + this.isSkipNoneNameDevice + ", isSupportA2DP=" + this.isSupportA2DP + ", isSupportCTKD=" + this.isSupportCTKD + i0XO1.IO;
    }
}
