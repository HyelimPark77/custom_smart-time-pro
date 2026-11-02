package com.jieli.jl_bt_ota.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public class BtAssistantCallbackManager extends BaseCallbackHelper<OnBtAssistantCallback> {
    public void onA2dpStatus(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.IOX11iI0
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtAssistantCallback) obj).onA2dpStatus(bluetoothDevice, i);
            }
        });
    }

    public void onAdapterStatus(final boolean z, final boolean z2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.O001XIiX
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtAssistantCallback) obj).onAdapterStatus(z, z2);
            }
        });
    }

    public void onBtDeviceConnection(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XOiO10
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtAssistantCallback) obj).onBtDeviceConnection(bluetoothDevice, i);
            }
        });
    }

    public void onDiscovery(final BluetoothDevice bluetoothDevice, final BleScanMessage bleScanMessage) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XX0Ii0O
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtAssistantCallback) obj).onDiscovery(bluetoothDevice, bleScanMessage);
            }
        });
    }

    public void onDiscoveryStatus(final boolean z, final boolean z2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.IOi1I0Xi
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtAssistantCallback) obj).onDiscoveryStatus(z, z2);
            }
        });
    }

    public void onHfpStatus(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.iiIi1XIXI
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtAssistantCallback) obj).onHfpStatus(bluetoothDevice, i);
            }
        });
    }
}
