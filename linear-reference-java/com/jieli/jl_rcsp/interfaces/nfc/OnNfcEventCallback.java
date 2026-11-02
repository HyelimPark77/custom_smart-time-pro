package com.jieli.jl_rcsp.interfaces.nfc;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface OnNfcEventCallback {
    void onDefaultNfc(BluetoothDevice r1, short r2);

    void onModifyNfcMsg(BluetoothDevice r1, NfcMsg r2);

    void onNfcMsgChange(BluetoothDevice r1, List<NfcMsg> r2);

    void onRequestSynNfcMsg(BluetoothDevice r1);
}
