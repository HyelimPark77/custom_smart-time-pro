package com.jieli.jl_rcsp.interfaces.nfc;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd;
import com.jieli.jl_rcsp.task.TaskListener;

/* JADX INFO: loaded from: classes17.dex */
public interface INfcOp {
    void addNfcFile(BluetoothDevice r1, String r2, int r3, TaskListener r4);

    void addOnNfcEventCallback(OnNfcEventCallback r1);

    void getDefaultNfc(BluetoothDevice r1, int r2, OnOperationCallback<Short> r3);

    void modifyNfcMsg(BluetoothDevice r1, NFCOperationCmd.ModifyMsgParam r2, OnOperationCallback<Boolean> r3);

    void removeNfcMsg(BluetoothDevice r1, int r2, short r3, OnOperationCallback<Boolean> r4);

    void removeOnNfcEventCallback(OnNfcEventCallback r1);

    void setDefaultNfc(BluetoothDevice r1, int r2, short r3, OnOperationCallback<Boolean> r4);

    void syncNfcMsg(BluetoothDevice r1, int r2, OnSyncNfcMsgListener r3);
}
