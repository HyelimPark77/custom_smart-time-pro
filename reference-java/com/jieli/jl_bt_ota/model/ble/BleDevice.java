package com.jieli.jl_bt_ota.model.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.util.BluetoothUtil;

/* JADX INFO: loaded from: classes17.dex */
public class BleDevice {
    private static final int RETRY_LIMIT = 2;
    private int bleMtu;
    private BluetoothGatt bluetoothGatt;

    @NonNull
    private final BleConnectParam connectParam;
    private int connection;

    @NonNull
    private final BluetoothDevice device;
    private boolean isUsing;
    private int retryCount;
    private final int retryLimit;

    public BleDevice(@NonNull BluetoothDevice bluetoothDevice, @NonNull BleConnectParam bleConnectParam) {
        this(bluetoothDevice, bleConnectParam, 2);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof BleDevice) {
            return this.device.equals(((BleDevice) obj).device);
        }
        return false;
    }

    public int getBleMtu() {
        return this.bleMtu;
    }

    public BluetoothGatt getBluetoothGatt() {
        return this.bluetoothGatt;
    }

    @NonNull
    public BleConnectParam getConnectParam() {
        return this.connectParam;
    }

    public int getConnection() {
        return this.connection;
    }

    @NonNull
    public BluetoothDevice getDevice() {
        return this.device;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public int getRetryLimit() {
        return this.retryLimit;
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    public boolean isConnectATT() {
        return this.connectParam.getTransport() == 1;
    }

    public boolean isConnected() {
        return this.connection == 2 && this.bluetoothGatt != null;
    }

    public boolean isOverRetryLimit() {
        int i = this.retryCount + 1;
        this.retryCount = i;
        return i >= this.retryLimit;
    }

    public boolean isUsing() {
        return this.isUsing;
    }

    @SuppressLint({"Range"})
    public BleDevice setBleMtu(@IntRange(from = 20, m3to = 509) int i) {
        if (i >= 128) {
            i -= 6;
        }
        this.bleMtu = i;
        return this;
    }

    public BleDevice setBluetoothGatt(BluetoothGatt bluetoothGatt) {
        this.bluetoothGatt = bluetoothGatt;
        return this;
    }

    public BleDevice setConnection(int i) {
        this.connection = i;
        if (i != 2) {
            setUsing(false);
            return this;
        }
        this.retryCount = 0;
        this.connectParam.resetRetryCount();
        return this;
    }

    public BleDevice setUsing(boolean z) {
        this.isUsing = z;
        return this;
    }

    public String toString() {
        return "BleDevice{device=" + this.device + ", \nconnectParam=" + this.connectParam + ", \nbluetoothGatt=" + this.bluetoothGatt + ", bleMtu=" + this.bleMtu + ", connection=" + BluetoothUtil.printBtConnectionState(this.connection) + ", isUsing=" + this.isUsing + i0XO1.f7442IO;
    }

    public BleDevice(@NonNull BluetoothDevice bluetoothDevice, @NonNull BleConnectParam bleConnectParam, int i) {
        this.bleMtu = 20;
        this.connection = 0;
        this.device = bluetoothDevice;
        this.connectParam = bleConnectParam;
        this.retryLimit = i;
        bleConnectParam.resetRetryCount();
    }
}
