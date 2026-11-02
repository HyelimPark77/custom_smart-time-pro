package com.jieli.jl_bt_ota.model.ble;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.util.UuidUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleCharacteristic {
    private static final int RETRY_LIMIT = 2;

    @NonNull
    private final UUID characteristicUUID;
    private boolean enable;
    private final int requiredProperty;
    private int retryCount;
    private final int retryLimit;

    @NonNull
    private final UUID serviceUUID;

    public BleCharacteristic(@NonNull UUID uuid, @NonNull UUID uuid2, int i) {
        this(uuid, uuid2, i, 2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BleCharacteristic)) {
            return false;
        }
        BleCharacteristic bleCharacteristic = (BleCharacteristic) obj;
        return this.serviceUUID.equals(bleCharacteristic.getServiceUUID()) && this.characteristicUUID.equals(bleCharacteristic.getCharacteristicUUID());
    }

    @NonNull
    public UUID getCharacteristicUUID() {
        return this.characteristicUUID;
    }

    public int getRequiredProperty() {
        return this.requiredProperty;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public int getRetryLimit() {
        return this.retryLimit;
    }

    @NonNull
    public UUID getServiceUUID() {
        return this.serviceUUID;
    }

    public boolean hasProperty(int i) {
        return (this.requiredProperty & i) == i;
    }

    public int hashCode() {
        return this.serviceUUID.hashCode() + this.characteristicUUID.hashCode();
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isOverLimit() {
        int i = this.retryCount + 1;
        this.retryCount = i;
        return i > this.retryLimit;
    }

    public BleCharacteristic setEnable(boolean z) {
        this.enable = z;
        return this;
    }

    public BleCharacteristic setRetryCount(int i) {
        this.retryCount = i;
        return this;
    }

    public String toString() {
        return "BleCharacteristic{serviceUUID=" + UuidUtil.read16BitUUID(this.serviceUUID) + ", characteristicUUID=" + UuidUtil.read16BitUUID(this.characteristicUUID) + ", requiredProperty=" + this.requiredProperty + ", retryLimit=" + this.retryLimit + ", retryCount=" + this.retryCount + ", enable=" + this.enable + i0XO1.f7442IO;
    }

    public BleCharacteristic(@NonNull UUID uuid, @NonNull UUID uuid2, int i, int i2) {
        this.enable = true;
        this.serviceUUID = uuid;
        this.characteristicUUID = uuid2;
        this.requiredProperty = i;
        this.retryLimit = i2;
    }
}
