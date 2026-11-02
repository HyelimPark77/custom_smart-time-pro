package com.jieli.jl_rcsp.interfaces.nfc;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface OnNfcEventCallback {
    void onDefaultNfc(BluetoothDevice bluetoothDevice, short s);

    void onModifyNfcMsg(BluetoothDevice bluetoothDevice, NfcMsg nfcMsg);

    void onNfcMsgChange(BluetoothDevice bluetoothDevice, List<NfcMsg> list);

    void onRequestSynNfcMsg(BluetoothDevice bluetoothDevice);
}
