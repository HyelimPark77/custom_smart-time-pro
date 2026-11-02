package com.jieli.jl_bt_ota.model;

import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.rcsp.ICmdSnGenerator;
import com.jieli.jl_bt_ota.model.ble.BleConnectParam;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothOTAConfigure {
    public static final int PREFER_BLE = 0;
    public static final int PREFER_SPP = 1;
    private BleConnectParam bleConnectParam;

    @Deprecated
    private int bleIntervalMs;
    private int bleScanMode;
    private byte[] firmwareFileData;
    private String firmwareFilePath;
    private boolean isNeedChangeMtu;
    private boolean isPriorityCallbackOtaFinish;
    private boolean isUseAuthDevice;

    @Deprecated
    private boolean isUseJLServer;
    private boolean isUseReconnect;
    private int mtu;
    private int priority;

    @Deprecated
    private String scanFilterData;
    private ICmdSnGenerator snGenerator;
    private int timeoutMs;

    public BluetoothOTAConfigure() {
        this.isUseReconnect = false;
        this.isUseAuthDevice = true;
        this.bleIntervalMs = 500;
        this.timeoutMs = 3000;
        this.isUseJLServer = false;
        this.isPriorityCallbackOtaFinish = false;
        this.isNeedChangeMtu = false;
        this.mtu = 20;
        this.bleScanMode = 1;
    }

    public static BluetoothOTAConfigure createDefault() {
        return new BluetoothOTAConfigure();
    }

    public BleConnectParam getBleConnectParam() {
        return this.bleConnectParam;
    }

    @Deprecated
    public int getBleIntervalMs() {
        return this.bleIntervalMs;
    }

    public int getBleScanMode() {
        return this.bleScanMode;
    }

    public byte[] getFirmwareFileData() {
        return this.firmwareFileData;
    }

    public String getFirmwareFilePath() {
        return this.firmwareFilePath;
    }

    public int getMtu() {
        return this.mtu;
    }

    public int getPriority() {
        return this.priority;
    }

    @Deprecated
    public String getScanFilterData() {
        return this.scanFilterData;
    }

    public ICmdSnGenerator getSnGenerator() {
        return this.snGenerator;
    }

    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    public boolean isAutoConnectBle() {
        if (this.isUseReconnect == true) goto L10;
        BleConnectParam r0 = this.bleConnectParam;
        if (r0 != null) goto L7;
        return false;
    L7:
        if (r0.isValid() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public boolean isNeedChangeMtu() {
        return this.isNeedChangeMtu;
    }

    public boolean isPriorityCallbackOtaFinish() {
        return this.isPriorityCallbackOtaFinish;
    }

    public boolean isUseAuthDevice() {
        return this.isUseAuthDevice;
    }

    @Deprecated
    public boolean isUseJLServer() {
        return this.isUseJLServer;
    }

    public boolean isUseReconnect() {
        return this.isUseReconnect;
    }

    public BluetoothOTAConfigure setBleConnectParam(BleConnectParam r1) {
        this.bleConnectParam = r1;
        return this;
    }

    @Deprecated
    public BluetoothOTAConfigure setBleIntervalMs(int r1) {
        this.bleIntervalMs = r1;
        return this;
    }

    public BluetoothOTAConfigure setBleScanMode(int r1) {
        this.bleScanMode = r1;
        return this;
    }

    public BluetoothOTAConfigure setFirmwareFileData(byte[] r1) {
        this.firmwareFileData = r1;
        return this;
    }

    public BluetoothOTAConfigure setFirmwareFilePath(String r1) {
        this.firmwareFilePath = r1;
        return this;
    }

    public BluetoothOTAConfigure setMtu(int r1) {
        this.mtu = r1;
        return this;
    }

    public BluetoothOTAConfigure setNeedChangeMtu(boolean r1) {
        this.isNeedChangeMtu = r1;
        return this;
    }

    public BluetoothOTAConfigure setPriority(int r1) {
        this.priority = r1;
        return this;
    }

    public BluetoothOTAConfigure setPriorityCallbackOtaFinish(boolean r1) {
        this.isPriorityCallbackOtaFinish = r1;
        return this;
    }

    @Deprecated
    public BluetoothOTAConfigure setScanFilterData(String r1) {
        this.scanFilterData = r1;
        return this;
    }

    public BluetoothOTAConfigure setSnGenerator(ICmdSnGenerator r1) {
        this.snGenerator = r1;
        return this;
    }

    public BluetoothOTAConfigure setTimeoutMs(int r2) {
        if (r2 >= 500) goto L5;
        r2 = 500;
    L5:
        this.timeoutMs = r2;
        return this;
    }

    public BluetoothOTAConfigure setUseAuthDevice(boolean r1) {
        this.isUseAuthDevice = r1;
        return this;
    }

    @Deprecated
    public BluetoothOTAConfigure setUseJLServer(boolean r1) {
        this.isUseJLServer = r1;
        return this;
    }

    public BluetoothOTAConfigure setUseReconnect(boolean r1) {
        this.isUseReconnect = r1;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BluetoothOTAConfigure{priority=");
        r0.append(this.priority);
        r0.append(", isUseReconnect=");
        r0.append(this.isUseReconnect);
        r0.append(", isUseAuthDevice=");
        r0.append(this.isUseAuthDevice);
        r0.append(", timeoutMs=");
        r0.append(this.timeoutMs);
        r0.append(",\n firmwareFilePath='");
        r0.append(this.firmwareFilePath);
        r0.append('\'');
        r0.append(",\n firmwareFileData= ");
        byte[] r1 = this.firmwareFileData;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        r0.append(r2);
        r0.append(", isNeedChangeMtu=");
        r0.append(this.isNeedChangeMtu);
        r0.append(", mtu=");
        r0.append(this.mtu);
        r0.append(", bleScanMode=");
        r0.append(this.bleScanMode);
        r0.append(", isPriorityCallbackOtaFinish=");
        r0.append(this.isPriorityCallbackOtaFinish);
        r0.append(",\n snGenerator=");
        r0.append(this.snGenerator);
        r0.append(",\n bleConnectParam=");
        r0.append(this.bleConnectParam);
        r0.append(i0XO1.IO);
        return r0.toString();
    L5:
        r2 = r1.length;
        goto L6
    }
}
