package com.jieli.jl_bt_ota.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public class BtEventCallbackHelper extends BaseCallbackHelper<IBluetoothCallback> implements IBluetoothCallback {
    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onA2dpStatus(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XIOi1O
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onA2dpStatus(bluetoothDevice, i);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onAdapterStatus(final boolean z, final boolean z2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.I01O1iOOO
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onAdapterStatus(z, z2);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
    public void onBleDataBlockChanged(final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.iXXXXIO
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onBleDataBlockChanged(bluetoothDevice, i, i2);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onBtDeviceConnection(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XXIIIOX
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onBtDeviceConnection(bluetoothDevice, i);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
    public void onConnection(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XOI0OX10
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onConnection(bluetoothDevice, i);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onDiscovery(final BluetoothDevice bluetoothDevice, final BleScanMessage bleScanMessage) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.IOiXXiI
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onDiscovery(bluetoothDevice, bleScanMessage);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onDiscoveryStatus(final boolean z, final boolean z2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.OiX10IX10
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onDiscoveryStatus(z, z2);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
    public void onError(final BaseError baseError) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XIX01IX
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onError(baseError);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onHfpStatus(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.iIiOiiXII
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onHfpStatus(bluetoothDevice, i);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
    public void onMandatoryUpgrade(final BluetoothDevice bluetoothDevice) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XiOiI
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onMandatoryUpgrade(bluetoothDevice);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
    public void onReceiveCommand(final BluetoothDevice bluetoothDevice, final CommandBase commandBase) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.X0XOXXi
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((IBluetoothCallback) obj).onReceiveCommand(bluetoothDevice, commandBase);
            }
        });
    }
}
