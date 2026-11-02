package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.os.ParcelUuid;
import com.android.mltcode.paycertificationapi.IXXX0OO;
import com.android.mltcode.paycertificationapi.OO0IIiX;
import com.android.mltcode.paycertificationapi.OO0OiXXI;
import com.android.mltcode.paycertificationapi.Oi0IX10i;
import com.android.mltcode.paycertificationapi.XiI0iiXO1;
import com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener;

/* JADX INFO: loaded from: classes17.dex */
public class BrEdrEventCbManager extends BaseCbManager<OnBrEdrListener> implements OnBrEdrListener {
    public BrEdrEventCbManager() {
    }

    public static /* synthetic */ void O00(BluetoothDevice r0, int r1, OnBrEdrListener r2) {
        r2.onA2dpStatus(r0, r1);
    }

    public static /* synthetic */ void OXO1(boolean r0, int r1, BluetoothProfile r2, OnBrEdrListener r3) {
        r3.onEdrService(r0, r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, int r1, OnBrEdrListener r2) {
        r2.onHfpStatus(r0, r1);
    }

    public static /* synthetic */ void XO0O10(BluetoothDevice r0, int r1, OnBrEdrListener r2) {
        r2.onBrEdrConnection(r0, r1);
    }

    public static /* synthetic */ void iO(BluetoothDevice r0, ParcelUuid[] r1, OnBrEdrListener r2) {
        r2.onDeviceUuids(r0, r1);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean addListener(OnBrEdrListener listener) {
        return super.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void callbackEvent(BaseCbManager.CallbackImpl<OnBrEdrListener> impl) {
        super.callbackEvent(impl);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener
    public void onA2dpStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new Oi0IX10i(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener
    public void onBrEdrConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new OO0IIiX(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener
    public void onDeviceUuids(final BluetoothDevice device, final ParcelUuid[] uuids) {
        callbackEvent(new XiI0iiXO1(device, uuids));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener
    public void onEdrService(final boolean isConnected, final int profile, final BluetoothProfile proxy) {
        callbackEvent(new OO0OiXXI(isConnected, profile, proxy));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener
    public void onHfpStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new IXXX0OO(device, status));
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBrEdrListener listener) {
        return super.removeListener(listener);
    }
}
