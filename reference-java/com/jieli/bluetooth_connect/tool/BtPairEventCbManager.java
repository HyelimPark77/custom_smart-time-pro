package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;

/* JADX INFO: loaded from: classes17.dex */
public class BtPairEventCbManager extends BaseCbManager<OnBtDevicePairListener> implements OnBtDevicePairListener {
    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean addListener(OnBtDevicePairListener listener) {
        return super.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void callbackEvent(BaseCbManager.CallbackImpl<OnBtDevicePairListener> impl) {
        super.callbackEvent(impl);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
    public void onAdapterStatus(final boolean bEnabled, final boolean bHasBle) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XI10IO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtDevicePairListener) obj).onAdapterStatus(bEnabled, bHasBle);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
    public void onBtDeviceBond(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XOi10
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtDevicePairListener) obj).onBtDeviceBond(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
    public void onPairError(final BluetoothDevice device, final ErrorInfo error) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OI10iiO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtDevicePairListener) obj).onPairError(device, error);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtDevicePairListener listener) {
        return super.removeListener(listener);
    }
}
