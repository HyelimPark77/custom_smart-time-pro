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

    public BleCharacteristic(@NonNull UUID r2, @NonNull UUID r3, int r4) {
        this(r2, r3, r4, 2);
    }

    public boolean equals(@Nullable Object r4) {
        if ((r4 instanceof BleCharacteristic) == true) goto L5;
        return false;
    L5:
        BleCharacteristic r5 = (BleCharacteristic) r4;
        if (this.serviceUUID.equals(r5.getServiceUUID()) == true) goto L8;
    L11:
        return false;
    L8:
        if (this.characteristicUUID.equals(r5.getCharacteristicUUID()) == false) goto L11;
        return true;
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

    public boolean hasProperty(int r2) {
        if ((this.requiredProperty & r2) != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public int hashCode() {
        return this.serviceUUID.hashCode() + this.characteristicUUID.hashCode();
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isOverLimit() {
        int r0 = this.retryCount + 1;
        this.retryCount = r0;
        if (r0 <= this.retryLimit) goto L5;
        return true;
    L5:
        return false;
    }

    public BleCharacteristic setEnable(boolean r1) {
        this.enable = r1;
        return this;
    }

    public BleCharacteristic setRetryCount(int r1) {
        this.retryCount = r1;
        return this;
    }

    public String toString() {
        return "BleCharacteristic{serviceUUID=" + UuidUtil.read16BitUUID(this.serviceUUID) + ", characteristicUUID=" + UuidUtil.read16BitUUID(this.characteristicUUID) + ", requiredProperty=" + this.requiredProperty + ", retryLimit=" + this.retryLimit + ", retryCount=" + this.retryCount + ", enable=" + this.enable + i0XO1.IO;
    }

    public BleCharacteristic(@NonNull UUID r2, @NonNull UUID r3, int r4, int r5) {
        this.enable = true;
        this.serviceUUID = r2;
        this.characteristicUUID = r3;
        this.requiredProperty = r4;
        this.retryLimit = r5;
    }
}
