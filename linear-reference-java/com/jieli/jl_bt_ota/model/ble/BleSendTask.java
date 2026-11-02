package com.jieli.jl_bt_ota.model.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.bt.OnBleSendDataCallback;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleSendTask {
    private int retryCount;

    @NonNull
    private final BleSendParam sendParam;
    private int status;

    public BleSendTask(@NonNull BluetoothDevice r8, @NonNull UUID r9, @NonNull UUID r10, @NonNull byte[] r11) {
        this(r8, r9, r10, 0, r11, null);
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (getClass() == r3.getClass()) goto L10;
        return false;
    L10:
        return this.sendParam.equals(((BleSendTask) r3).sendParam);
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
        return Objects.hash(new Object[]{this.sendParam});
    }

    public boolean isSendFailedOverLimit() {
        int r0 = this.retryCount + 1;
        this.retryCount = r0;
        if (r0 < this.sendParam.getRetryLimit()) goto L5;
        return true;
    L5:
        this.status = -1;
        return false;
    }

    public BleSendTask setCallback(OnBleSendDataCallback r2) {
        this.sendParam.setCallback(r2);
        return this;
    }

    public BleSendTask setStatus(int r1) {
        this.status = r1;
        return this;
    }

    public String toString() {
        return "BleSendTask{sendParam=" + this.sendParam + ", retryCount=" + this.retryCount + ", status=" + this.status + i0XO1.IO;
    }

    public BleSendTask(@NonNull BluetoothDevice r9, @NonNull UUID r10, @NonNull UUID r11, int r12, @NonNull byte[] r13, OnBleSendDataCallback r14) {
        this(new BleSendParam(r9, r10, r11, r12, r13, 3, r14));
    }

    public BleSendTask(@NonNull BleSendParam r1) {
        this.sendParam = r1;
        this.retryCount = 0;
        this.status = -1;
    }
}
