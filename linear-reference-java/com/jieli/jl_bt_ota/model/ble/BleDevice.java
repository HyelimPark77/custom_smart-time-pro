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

    public BleDevice(@NonNull BluetoothDevice r2, @NonNull BleConnectParam r3) {
        this(r2, r3, 2);
    }

    public boolean equals(@Nullable Object r2) {
        if ((r2 instanceof BleDevice) == true) goto L7;
        return false;
    L7:
        return this.device.equals(((BleDevice) r2).device);
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
        if (this.connectParam.getTransport() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isConnected() {
        if (this.connection == 2) goto L5;
        return false;
    L5:
        if (this.bluetoothGatt == null) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isOverRetryLimit() {
        int r0 = this.retryCount + 1;
        this.retryCount = r0;
        if (r0 < this.retryLimit) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isUsing() {
        return this.isUsing;
    }

    @SuppressLint({"Range"})
    public BleDevice setBleMtu(@IntRange(from = 20, to = 509) int r2) {
        if (r2 < 128) goto L5;
        r2 = r2 - 6;
    L5:
        this.bleMtu = r2;
        return this;
    }

    public BleDevice setBluetoothGatt(BluetoothGatt r1) {
        this.bluetoothGatt = r1;
        return this;
    }

    public BleDevice setConnection(int r3) {
        this.connection = r3;
        if (r3 != 2) goto L6;
        this.retryCount = 0;
        this.connectParam.resetRetryCount();
        return this;
    L6:
        setUsing(false);
        return this;
    }

    public BleDevice setUsing(boolean r1) {
        this.isUsing = r1;
        return this;
    }

    public String toString() {
        return "BleDevice{device=" + this.device + ", \nconnectParam=" + this.connectParam + ", \nbluetoothGatt=" + this.bluetoothGatt + ", bleMtu=" + this.bleMtu + ", connection=" + BluetoothUtil.printBtConnectionState(this.connection) + ", isUsing=" + this.isUsing + i0XO1.IO;
    }

    public BleDevice(@NonNull BluetoothDevice r2, @NonNull BleConnectParam r3, int r4) {
        this.bleMtu = 20;
        this.connection = 0;
        this.device = r2;
        this.connectParam = r3;
        this.retryLimit = r4;
        r3.resetRetryCount();
    }
}
