package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.cf3;
import com.jieli.jl_rcsp.interfaces.record.OnRecordStateCallback;
import com.jieli.jl_rcsp.model.RecordState;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;

/* JADX INFO: loaded from: classes17.dex */
public class RecordStateCallbackHelper extends BaseCallbackManager<OnRecordStateCallback> implements OnRecordStateCallback {
    public RecordStateCallbackHelper() {
    }

    public static /* synthetic */ void a(BluetoothDevice r0, RecordState r1, OnRecordStateCallback r2) {
        r2.onStateChange(r0, r1);
    }

    public void addOnRecordStateCallback(OnRecordStateCallback r1) {
        registerCallback(r1);
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.OnRecordStateCallback
    public void onStateChange(final BluetoothDevice r2, final RecordState r3) {
        callbackEvent(new cf3(r2, r3));
    }

    public void removeOnRecordStateCallback(OnRecordStateCallback r1) {
        unregisterCallback(r1);
    }
}
