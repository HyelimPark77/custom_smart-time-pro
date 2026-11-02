package com.jieli.jl_bt_ota.model.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBleSendDataCallback;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleSendTask {
    private int retryCount;

    @NonNull
    private final BleSendParam sendParam;
    private int status;

    public BleSendTask(@NonNull BluetoothDevice bluetoothDevice, @NonNull UUID uuid, @NonNull UUID uuid2, @NonNull byte[] bArr) {
        this(bluetoothDevice, uuid, uuid2, 0, bArr, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.sendParam.equals(((BleSendTask) obj).sendParam);
    }

    public OnBleSendDataCallback getCallback() {
        return this.sendParam.getCallback();
    }

    @NonNull
    public UUID getCharacteristicUUID() {
        return this.sendParam.getCharacteristicUUID();
    }

    @NonNull
    public byte[] getData() {
        return this.sendParam.getData();
    }

    @NonNull
    public BluetoothDevice getDevice() {
        return this.sendParam.getDevice();
    }

    @NonNull
    public BleSendParam getSendParam() {
        return this.sendParam;
    }

    @NonNull
    public UUID getServiceUUID() {
        return this.sendParam.getServiceUUID();
    }

    public int getStatus() {
        return this.status;
    }

    public int getWriteType() {
        return this.sendParam.getWriteType();
    }

    public int hashCode() {
        return Objects.hash(this.sendParam);
    }

    public boolean isSendFailedOverLimit() {
        int i = this.retryCount + 1;
        this.retryCount = i;
        if (i >= this.sendParam.getRetryLimit()) {
            return true;
        }
        this.status = -1;
        return false;
    }

    public BleSendTask setCallback(OnBleSendDataCallback onBleSendDataCallback) {
        this.sendParam.setCallback(onBleSendDataCallback);
        return this;
    }

    public BleSendTask setStatus(int i) {
        this.status = i;
        return this;
    }

    public String toString() {
        return "BleSendTask{sendParam=" + this.sendParam + ", retryCount=" + this.retryCount + ", status=" + this.status + i0XO1.f7442IO;
    }

    public BleSendTask(@NonNull BluetoothDevice bluetoothDevice, @NonNull UUID uuid, @NonNull UUID uuid2, int i, @NonNull byte[] bArr, OnBleSendDataCallback onBleSendDataCallback) {
        this(new BleSendParam(bluetoothDevice, uuid, uuid2, i, bArr, 3, onBleSendDataCallback));
    }

    public BleSendTask(@NonNull BleSendParam bleSendParam) {
        this.sendParam = bleSendParam;
        this.retryCount = 0;
        this.status = -1;
    }
}
