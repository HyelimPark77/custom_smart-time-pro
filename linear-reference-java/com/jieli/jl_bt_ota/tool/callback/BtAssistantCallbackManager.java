package com.jieli.jl_bt_ota.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.IOX11iI0;
import com.android.mltcode.paycertificationapi.IOi1I0Xi;
import com.android.mltcode.paycertificationapi.O001XIiX;
import com.android.mltcode.paycertificationapi.XOiO10;
import com.android.mltcode.paycertificationapi.XX0Ii0O;
import com.android.mltcode.paycertificationapi.iiIi1XIXI;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public class BtAssistantCallbackManager extends BaseCallbackHelper<OnBtAssistantCallback> {
    public BtAssistantCallbackManager() {
    }

    public static /* synthetic */ void IiI10X(BluetoothDevice r0, int r1, OnBtAssistantCallback r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void O00(BluetoothDevice r0, BleScanMessage r1, OnBtAssistantCallback r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void OXO1(BluetoothDevice r0, int r1, OnBtAssistantCallback r2) {
        b(r0, r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, int r1, OnBtAssistantCallback r2) {
        c(r0, r1, r2);
    }

    public static /* synthetic */ void XO0O10(boolean r0, boolean r1, OnBtAssistantCallback r2) {
        b(r0, r1, r2);
    }

    private static /* synthetic */ void a(boolean r0, boolean r1, OnBtAssistantCallback r2) {
        r2.onAdapterStatus(r0, r1);
    }

    private static /* synthetic */ void b(boolean r0, boolean r1, OnBtAssistantCallback r2) {
        r2.onDiscoveryStatus(r0, r1);
    }

    private static /* synthetic */ void c(BluetoothDevice r0, int r1, OnBtAssistantCallback r2) {
        r2.onHfpStatus(r0, r1);
    }

    public static /* synthetic */ void iO(boolean r0, boolean r1, OnBtAssistantCallback r2) {
        a(r0, r1, r2);
    }

    public void onA2dpStatus(final BluetoothDevice r2, final int r3) {
        callbackEvent(new IOX11iI0(r2, r3));
    }

    public void onAdapterStatus(final boolean r2, final boolean r3) {
        callbackEvent(new O001XIiX(r2, r3));
    }

    public void onBtDeviceConnection(final BluetoothDevice r2, final int r3) {
        callbackEvent(new XOiO10(r2, r3));
    }

    public void onDiscovery(final BluetoothDevice r2, final BleScanMessage r3) {
        callbackEvent(new XX0Ii0O(r2, r3));
    }

    public void onDiscoveryStatus(final boolean r2, final boolean r3) {
        callbackEvent(new IOi1I0Xi(r2, r3));
    }

    public void onHfpStatus(final BluetoothDevice r2, final int r3) {
        callbackEvent(new iiIi1XIXI(r2, r3));
    }

    private static /* synthetic */ void a(BluetoothDevice r0, BleScanMessage r1, OnBtAssistantCallback r2) {
        r2.onDiscovery(r0, r1);
    }

    private static /* synthetic */ void b(BluetoothDevice r0, int r1, OnBtAssistantCallback r2) {
        r2.onBtDeviceConnection(r0, r1);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, int r1, OnBtAssistantCallback r2) {
        r2.onA2dpStatus(r0, r1);
    }
}
