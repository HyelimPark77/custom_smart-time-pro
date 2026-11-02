package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.IIOXiiXiO;
import com.android.mltcode.paycertificationapi.OXOOIi;
import com.android.mltcode.paycertificationapi.XIOOI1Oi;
import com.android.mltcode.paycertificationapi.XXOX1OO11;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener;

/* JADX INFO: loaded from: classes17.dex */
public class BtDiscoveryCbManager extends BaseCbManager<OnBtDiscoveryListener> implements OnBtDiscoveryListener {
    public BtDiscoveryCbManager() {
    }

    public static /* synthetic */ void OXO1(ErrorInfo r0, OnBtDiscoveryListener r1) {
        r1.onDiscoveryError(r0);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, BleScanMessage r1, OnBtDiscoveryListener r2) {
        r2.onDiscoveryDevice(r0, r1);
    }

    public static /* synthetic */ void XO0O10(boolean r0, boolean r1, OnBtDiscoveryListener r2) {
        r2.onDiscoveryStatusChange(r0, r1);
    }

    public static /* synthetic */ void iO(BluetoothDevice r0, BleScanMessage r1, OnBtDiscoveryListener r2) {
        r2.onShowProductDialog(r0, r1);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean addListener(OnBtDiscoveryListener listener) {
        return super.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void callbackEvent(BaseCbManager.CallbackImpl<OnBtDiscoveryListener> impl) {
        super.callbackEvent(impl);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener
    public void onDiscoveryDevice(final BluetoothDevice device, final BleScanMessage bleScanMessage) {
        callbackEvent(new IIOXiiXiO(device, bleScanMessage));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener
    public void onDiscoveryError(final ErrorInfo error) {
        callbackEvent(new OXOOIi(error));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener
    public void onDiscoveryStatusChange(final boolean isBle, final boolean bStart) {
        callbackEvent(new XIOOI1Oi(isBle, bStart));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener
    public void onShowProductDialog(final BluetoothDevice device, final BleScanMessage bleScanMessage) {
        callbackEvent(new XXOX1OO11(device, bleScanMessage));
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtDiscoveryListener listener) {
        return super.removeListener(listener);
    }
}
