package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.a81;
import com.android.mltcode.paycertificationapi.x71;
import com.android.mltcode.paycertificationapi.y71;
import com.android.mltcode.paycertificationapi.z71;
import com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class NfcEventCbHelper extends BaseCallbackManager<OnNfcEventCallback> implements OnNfcEventCallback {
    public NfcEventCbHelper() {
    }

    public static /* synthetic */ void a(BluetoothDevice r0, List r1, OnNfcEventCallback r2) {
        r2.onNfcMsgChange(r0, r1);
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback
    public void onDefaultNfc(final BluetoothDevice r2, final short r3) {
        callbackEvent(new a81(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback
    public void onModifyNfcMsg(final BluetoothDevice r2, final NfcMsg r3) {
        callbackEvent(new x71(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback
    public void onNfcMsgChange(final BluetoothDevice r2, final List<NfcMsg> r3) {
        callbackEvent(new z71(r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback
    public void onRequestSynNfcMsg(final BluetoothDevice r2) {
        callbackEvent(new y71(r2));
    }

    public static /* synthetic */ void a(BluetoothDevice r0, NfcMsg r1, OnNfcEventCallback r2) {
        r2.onModifyNfcMsg(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, short r1, OnNfcEventCallback r2) {
        r2.onDefaultNfc(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, OnNfcEventCallback r1) {
        r1.onRequestSynNfcMsg(r0);
    }
}
