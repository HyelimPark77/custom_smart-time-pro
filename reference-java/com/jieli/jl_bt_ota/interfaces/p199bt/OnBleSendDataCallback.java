package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public interface OnBleSendDataCallback {
    void onResult(BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2, boolean z, byte[] bArr);
}
