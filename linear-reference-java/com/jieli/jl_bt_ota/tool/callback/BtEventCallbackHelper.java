package com.jieli.jl_bt_ota.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.I01O1iOOO;
import com.android.mltcode.paycertificationapi.IOiXXiI;
import com.android.mltcode.paycertificationapi.OiX10IX10;
import com.android.mltcode.paycertificationapi.X0XOXXi;
import com.android.mltcode.paycertificationapi.XIOi1O;
import com.android.mltcode.paycertificationapi.XIX01IX;
import com.android.mltcode.paycertificationapi.XOI0OX10;
import com.android.mltcode.paycertificationapi.XXIIIOX;
import com.android.mltcode.paycertificationapi.XiOiI;
import com.android.mltcode.paycertificationapi.iIiOiiXII;
import com.android.mltcode.paycertificationapi.iXXXXIO;
import com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public class BtEventCallbackHelper extends BaseCallbackHelper<IBluetoothCallback> implements IBluetoothCallback {
    public BtEventCallbackHelper() {
    }

    public static /* synthetic */ void I0IIOi(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void IO(BluetoothDevice r0, BleScanMessage r1, IBluetoothCallback r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void IiI10X(BluetoothDevice r0, IBluetoothCallback r1) {
        a(r0, r1);
    }

    public static /* synthetic */ void O00(BluetoothDevice r0, CommandBase r1, IBluetoothCallback r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void OIX0iXi(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        b(r0, r1, r2);
    }

    public static /* synthetic */ void OIi0(BaseError r0, IBluetoothCallback r1) {
        a(r0, r1);
    }

    public static /* synthetic */ void OXO1(BluetoothDevice r0, int r1, int r2, IBluetoothCallback r3) {
        a(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        d(r0, r1, r2);
    }

    public static /* synthetic */ void XO0O10(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        c(r0, r1, r2);
    }

    public static /* synthetic */ void XOO0ii0(boolean r0, boolean r1, IBluetoothCallback r2) {
        b(r0, r1, r2);
    }

    private static /* synthetic */ void a(boolean r0, boolean r1, IBluetoothCallback r2) {
        r2.onAdapterStatus(r0, r1);
    }

    private static /* synthetic */ void b(boolean r0, boolean r1, IBluetoothCallback r2) {
        r2.onDiscoveryStatus(r0, r1);
    }

    private static /* synthetic */ void c(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        r2.onConnection(r0, r1);
    }

    private static /* synthetic */ void d(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        r2.onHfpStatus(r0, r1);
    }

    public static /* synthetic */ void iO(boolean r0, boolean r1, IBluetoothCallback r2) {
        a(r0, r1, r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onA2dpStatus(final BluetoothDevice r2, final int r3) {
        callbackEvent(new XIOi1O(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onAdapterStatus(final boolean r2, final boolean r3) {
        callbackEvent(new I01O1iOOO(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onBleDataBlockChanged(final BluetoothDevice r2, final int r3, final int r4) {
        callbackEvent(new iXXXXIO(r2, r3, r4));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onBtDeviceConnection(final BluetoothDevice r2, final int r3) {
        callbackEvent(new XXIIIOX(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onConnection(final BluetoothDevice r2, final int r3) {
        callbackEvent(new XOI0OX10(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onDiscovery(final BluetoothDevice r2, final BleScanMessage r3) {
        callbackEvent(new IOiXXiI(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onDiscoveryStatus(final boolean r2, final boolean r3) {
        callbackEvent(new OiX10IX10(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onError(final BaseError r2) {
        callbackEvent(new XIX01IX(r2));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onHfpStatus(final BluetoothDevice r2, final int r3) {
        callbackEvent(new iIiOiiXII(r2, r3));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onMandatoryUpgrade(final BluetoothDevice r2) {
        callbackEvent(new XiOiI(r2));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onReceiveCommand(final BluetoothDevice r2, final CommandBase r3) {
        callbackEvent(new X0XOXXi(r2, r3));
    }

    private static /* synthetic */ void a(BluetoothDevice r0, BleScanMessage r1, IBluetoothCallback r2) {
        r2.onDiscovery(r0, r1);
    }

    private static /* synthetic */ void b(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        r2.onBtDeviceConnection(r0, r1);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, int r1, int r2, IBluetoothCallback r3) {
        r3.onBleDataBlockChanged(r0, r1, r2);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, CommandBase r1, IBluetoothCallback r2) {
        r2.onReceiveCommand(r0, r1);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, int r1, IBluetoothCallback r2) {
        r2.onA2dpStatus(r0, r1);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, IBluetoothCallback r1) {
        r1.onMandatoryUpgrade(r0);
    }

    private static /* synthetic */ void a(BaseError r0, IBluetoothCallback r1) {
        r1.onError(r0);
    }
}
