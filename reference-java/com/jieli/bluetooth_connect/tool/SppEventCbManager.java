package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class SppEventCbManager extends BaseCbManager<OnBtSppListener> implements OnBtSppListener {
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
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.q65
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtSppListener) obj).onSppConnection(device, sppUUID, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener
    public void onSppDataNotify(final BluetoothDevice device, final UUID sppUUID, final byte[] data) {
        if (data == null) {
            return;
        }
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.p65
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtSppListener) obj).onSppDataNotify(device, sppUUID, data);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener
    public void onSwitchSppDevice(final BluetoothDevice device) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.r65
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtSppListener) obj).onSwitchSppDevice(device);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtSppListener listener) {
        return super.removeListener(listener);
    }
}
