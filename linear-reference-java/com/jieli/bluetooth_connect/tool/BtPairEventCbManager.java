package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.OI10iiO;
import com.android.mltcode.paycertificationapi.XI10IO;
import com.android.mltcode.paycertificationapi.XOi10;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;

/* JADX INFO: loaded from: classes17.dex */
public class BtPairEventCbManager extends BaseCbManager<OnBtDevicePairListener> implements OnBtDevicePairListener {
    public BtPairEventCbManager() {
    }

    public static /* synthetic */ void OXO1(boolean r0, boolean r1, OnBtDevicePairListener r2) {
        r2.onAdapterStatus(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, int r1, OnBtDevicePairListener r2) {
        r2.onBtDeviceBond(r0, r1);
    }

    public static /* synthetic */ void iO(BluetoothDevice r0, ErrorInfo r1, OnBtDevicePairListener r2) {
        r2.onPairError(r0, r1);
    }

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
        callbackEvent(new XI10IO(bEnabled, bHasBle));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
    public void onBtDeviceBond(final BluetoothDevice device, final int status) {
        callbackEvent(new XOi10(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
    public void onPairError(final BluetoothDevice device, final ErrorInfo error) {
        callbackEvent(new OI10iiO(device, error));
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtDevicePairListener listener) {
        return super.removeListener(listener);
    }
}
