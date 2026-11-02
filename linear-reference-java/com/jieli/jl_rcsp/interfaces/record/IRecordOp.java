package com.jieli.jl_rcsp.interfaces.record;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.RecordParam;
import com.jieli.jl_rcsp.model.RecordState;

/* JADX INFO: loaded from: classes17.dex */
public interface IRecordOp {
    void addOnRecordStateCallback(OnRecordStateCallback r1);

    RecordState getRecordState();

    void release();

    void removeOnRecordStateCallback(OnRecordStateCallback r1);

    void setSupportPlayTTS(boolean r1);

    void setSupportSyncIatText(boolean r1);

    void setSupportSyncNlpText(boolean r1);

    void startRecord(BluetoothDevice r1, RecordParam r2, OnOperationCallback<Boolean> r3);

    void stopRecord(BluetoothDevice r1, int r2, boolean r3, boolean r4, boolean r5, OnOperationCallback<Boolean> r6);
}
