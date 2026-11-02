package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.p65;
import com.android.mltcode.paycertificationapi.q65;
import com.android.mltcode.paycertificationapi.r65;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class SppEventCbManager extends BaseCbManager<OnBtSppListener> implements OnBtSppListener {
    public SppEventCbManager() {
    }

    public static /* synthetic */ void OXO1(BluetoothDevice r0, UUID r1, byte[] r2, OnBtSppListener r3) {
        r3.onSppDataNotify(r0, r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, OnBtSppListener r1) {
        r1.onSwitchSppDevice(r0);
    }

    public static /* synthetic */ void iO(BluetoothDevice r0, UUID r1, int r2, OnBtSppListener r3) {
        r3.onSppConnection(r0, r1, r2);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean addListener(OnBtSppListener listener) {
        return super.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void callbackEvent(BaseCbManager.CallbackImpl<OnBtSppListener> impl) {
        super.callbackEvent(impl);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener
    public void onSppConnection(final BluetoothDevice device, final UUID sppUUID, final int status) {
        callbackEvent(new q65(device, sppUUID, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener
    public void onSppDataNotify(final BluetoothDevice device, final UUID sppUUID, final byte[] data) {
        if (data != null) goto L4;
        return;
    L4:
        callbackEvent(new p65(device, sppUUID, data));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener
    public void onSwitchSppDevice(final BluetoothDevice device) {
        callbackEvent(new r65(device));
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtSppListener listener) {
        return super.removeListener(listener);
    }
}
