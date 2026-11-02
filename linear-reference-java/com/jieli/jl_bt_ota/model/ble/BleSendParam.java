package com.jieli.jl_bt_ota.model.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.bt.OnBleSendDataCallback;
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

    public BleSendParam(@NonNull BluetoothDevice r8, @NonNull UUID r9, @NonNull UUID r10, @NonNull byte[] r11) {
        this(r8, r9, r10, r11, 3, null);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L17;
        BleSendParam r6 = (BleSendParam) r5;
        if (this.device.equals(r6.device) == false) goto L17;
        if (this.serviceUUID.equals(r6.serviceUUID) == false) goto L17;
        if (this.characteristicUUID.equals(r6.characteristicUUID) == false) goto L17;
        return true;
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
        return Objects.hash(new Object[]{this.device, this.serviceUUID, this.characteristicUUID});
    }

    public BleSendParam setCallback(OnBleSendDataCallback r1) {
        this.callback = r1;
        return this;
    }

    public String toString() {
        return "BleSendParam{device=" + this.device + ", serviceUUID=" + UuidUtil.read16BitUUID(this.serviceUUID) + ", characteristicUUID=" + UuidUtil.read16BitUUID(this.characteristicUUID) + ", writeType=" + this.writeType + ", data=" + CHexConver.byte2HexStr(this.data) + ", retryLimit=" + this.retryLimit + ", callback=" + this.callback + i0XO1.IO;
    }

    public BleSendParam(@NonNull BluetoothDevice r9, @NonNull UUID r10, @NonNull UUID r11, @NonNull byte[] r12, OnBleSendDataCallback r13) {
        this(r9, r10, r11, 0, r12, 3, r13);
    }

    public BleSendParam(@NonNull BluetoothDevice r9, @NonNull UUID r10, @NonNull UUID r11, @NonNull byte[] r12, int r13, OnBleSendDataCallback r14) {
        this(r9, r10, r11, 0, r12, r13, r14);
    }

    public BleSendParam(@NonNull BluetoothDevice r1, @NonNull UUID r2, @NonNull UUID r3, int r4, @NonNull byte[] r5, int r6, OnBleSendDataCallback r7) {
        this.device = r1;
        this.serviceUUID = r2;
        this.characteristicUUID = r3;
        this.writeType = r4;
        this.data = r5;
        this.retryLimit = r6;
        setCallback(r7);
    }
}
