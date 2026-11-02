package com.jieli.jl_bt_ota.model.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBleSendDataCallback;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.UuidUtil;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleSendParam {
    public static final int RE_SEND_LIMIT = 3;
    private OnBleSendDataCallback callback;

    @NonNull
    private final UUID characteristicUUID;

    @NonNull
    private final byte[] data;

    @NonNull
    private final BluetoothDevice device;
    private final int retryLimit;

    @NonNull
    private final UUID serviceUUID;
    private final int writeType;

    public BleSendParam(@NonNull BluetoothDevice bluetoothDevice, @NonNull UUID uuid, @NonNull UUID uuid2, @NonNull byte[] bArr) {
        this(bluetoothDevice, uuid, uuid2, bArr, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleSendParam bleSendParam = (BleSendParam) obj;
            if (this.device.equals(bleSendParam.device) && this.serviceUUID.equals(bleSendParam.serviceUUID) && this.characteristicUUID.equals(bleSendParam.characteristicUUID)) {
                return true;
            }
        }
        return false;
    }

    public OnBleSendDataCallback getCallback() {
        return this.callback;
    }

    @NonNull
    public UUID getCharacteristicUUID() {
        return this.characteristicUUID;
    }

    @NonNull
    public byte[] getData() {
        return this.data;
    }

    @NonNull
    public BluetoothDevice getDevice() {
        return this.device;
    }

    public int getRetryLimit() {
        return this.retryLimit;
    }

    @NonNull
    public UUID getServiceUUID() {
        return this.serviceUUID;
    }

    public int getWriteType() {
        return this.writeType;
    }

    public int hashCode() {
        return Objects.hash(this.device, this.serviceUUID, this.characteristicUUID);
    }

    public BleSendParam setCallback(OnBleSendDataCallback onBleSendDataCallback) {
        this.callback = onBleSendDataCallback;
        return this;
    }

    public String toString() {
        return "BleSendParam{device=" + this.device + ", serviceUUID=" + UuidUtil.read16BitUUID(this.serviceUUID) + ", characteristicUUID=" + UuidUtil.read16BitUUID(this.characteristicUUID) + ", writeType=" + this.writeType + ", data=" + CHexConver.byte2HexStr(this.data) + ", retryLimit=" + this.retryLimit + ", callback=" + this.callback + i0XO1.f7442IO;
    }

    public BleSendParam(@NonNull BluetoothDevice bluetoothDevice, @NonNull UUID uuid, @NonNull UUID uuid2, @NonNull byte[] bArr, OnBleSendDataCallback onBleSendDataCallback) {
        this(bluetoothDevice, uuid, uuid2, 0, bArr, 3, onBleSendDataCallback);
    }

    public BleSendParam(@NonNull BluetoothDevice bluetoothDevice, @NonNull UUID uuid, @NonNull UUID uuid2, @NonNull byte[] bArr, int i, OnBleSendDataCallback onBleSendDataCallback) {
        this(bluetoothDevice, uuid, uuid2, 0, bArr, i, onBleSendDataCallback);
    }

    public BleSendParam(@NonNull BluetoothDevice bluetoothDevice, @NonNull UUID uuid, @NonNull UUID uuid2, int i, @NonNull byte[] bArr, int i2, OnBleSendDataCallback onBleSendDataCallback) {
        this.device = bluetoothDevice;
        this.serviceUUID = uuid;
        this.characteristicUUID = uuid2;
        this.writeType = i;
        this.data = bArr;
        this.retryLimit = i2;
        setCallback(onBleSendDataCallback);
    }
}
