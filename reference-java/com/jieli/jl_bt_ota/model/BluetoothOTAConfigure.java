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
    private byte[] firmwareFileData;
    private String firmwareFilePath;
    private int priority;

    @Deprecated
    private String scanFilterData;
    private ICmdSnGenerator snGenerator;
    private boolean isUseReconnect = false;
    private boolean isUseAuthDevice = true;

    @Deprecated
    private int bleIntervalMs = 500;
    private int timeoutMs = 3000;

    @Deprecated
    private boolean isUseJLServer = false;
    private boolean isPriorityCallbackOtaFinish = false;
    private boolean isNeedChangeMtu = false;
    private int mtu = 20;
    private int bleScanMode = 1;

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
        BleConnectParam bleConnectParam;
        return (this.isUseReconnect || (bleConnectParam = this.bleConnectParam) == null || !bleConnectParam.isValid()) ? false : true;
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

    public BluetoothOTAConfigure setBleConnectParam(BleConnectParam bleConnectParam) {
        this.bleConnectParam = bleConnectParam;
        return this;
    }

    @Deprecated
    public BluetoothOTAConfigure setBleIntervalMs(int i) {
        this.bleIntervalMs = i;
        return this;
    }

    public BluetoothOTAConfigure setBleScanMode(int i) {
        this.bleScanMode = i;
        return this;
    }

    public BluetoothOTAConfigure setFirmwareFileData(byte[] bArr) {
        this.firmwareFileData = bArr;
        return this;
    }

    public BluetoothOTAConfigure setFirmwareFilePath(String str) {
        this.firmwareFilePath = str;
        return this;
    }

    public BluetoothOTAConfigure setMtu(int i) {
        this.mtu = i;
        return this;
    }

    public BluetoothOTAConfigure setNeedChangeMtu(boolean z) {
        this.isNeedChangeMtu = z;
        return this;
    }

    public BluetoothOTAConfigure setPriority(int i) {
        this.priority = i;
        return this;
    }

    public BluetoothOTAConfigure setPriorityCallbackOtaFinish(boolean z) {
        this.isPriorityCallbackOtaFinish = z;
        return this;
    }

    @Deprecated
    public BluetoothOTAConfigure setScanFilterData(String str) {
        this.scanFilterData = str;
        return this;
    }

    public BluetoothOTAConfigure setSnGenerator(ICmdSnGenerator iCmdSnGenerator) {
        this.snGenerator = iCmdSnGenerator;
        return this;
    }

    public BluetoothOTAConfigure setTimeoutMs(int i) {
        if (i < 500) {
            i = 500;
        }
        this.timeoutMs = i;
        return this;
    }

    public BluetoothOTAConfigure setUseAuthDevice(boolean z) {
        this.isUseAuthDevice = z;
        return this;
    }

    @Deprecated
    public BluetoothOTAConfigure setUseJLServer(boolean z) {
        this.isUseJLServer = z;
        return this;
    }

    public BluetoothOTAConfigure setUseReconnect(boolean z) {
        this.isUseReconnect = z;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothOTAConfigure{priority=");
        sb.append(this.priority);
        sb.append(", isUseReconnect=");
        sb.append(this.isUseReconnect);
        sb.append(", isUseAuthDevice=");
        sb.append(this.isUseAuthDevice);
        sb.append(", timeoutMs=");
        sb.append(this.timeoutMs);
        sb.append(",\n firmwareFilePath='");
        sb.append(this.firmwareFilePath);
        sb.append('\'');
        sb.append(",\n firmwareFileData= ");
        byte[] bArr = this.firmwareFileData;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(", isNeedChangeMtu=");
        sb.append(this.isNeedChangeMtu);
        sb.append(", mtu=");
        sb.append(this.mtu);
        sb.append(", bleScanMode=");
        sb.append(this.bleScanMode);
        sb.append(", isPriorityCallbackOtaFinish=");
        sb.append(this.isPriorityCallbackOtaFinish);
        sb.append(",\n snGenerator=");
        sb.append(this.snGenerator);
        sb.append(",\n bleConnectParam=");
        sb.append(this.bleConnectParam);
        sb.append(i0XO1.f7442IO);
        return sb.toString();
    }
}
