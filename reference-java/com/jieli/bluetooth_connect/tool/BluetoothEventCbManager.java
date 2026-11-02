package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import android.os.ParcelUuid;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothEventCbManager extends BaseCbManager<IBluetoothEventCallback> implements IBluetoothEventCallback {
    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean addListener(IBluetoothEventCallback listener) {
        return super.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void callbackEvent(BaseCbManager.CallbackImpl<IBluetoothEventCallback> impl) {
        super.callbackEvent(impl);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onA2dpStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i1iiO1O1
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onA2dpStatus(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onAdapterStatus(final boolean bEnabled, final boolean bHasBle) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OOI1i1
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onAdapterStatus(bEnabled, bHasBle);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.IOO1OIO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBleConnection(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleDataBlockChanged(final BluetoothDevice device, final int block, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OiOiii00
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBleDataBlockChanged(device, block, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleDataNotification(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XI1IX0OIO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBleDataNotification(device, serviceUuid, characteristicsUuid, data);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, final boolean bEnabled) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i11IOi0O
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBleNotificationStatus(device, serviceUuid, characteristicUuid, bEnabled);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleServiceDiscovery(final BluetoothDevice device, final int status, final List<BluetoothGattService> services) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.I0iOOO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBleServiceDiscovery(device, status, services);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleWriteStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.X01iI
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBleWriteStatus(device, serviceUuid, characteristicsUuid, data, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBondStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.iOOX0XII
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBondStatus(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBtDeviceConnectStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.IXi1i0I
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onBtDeviceConnectStatus(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XI11
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onConnection(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onConnectionUpdated(final BluetoothGatt gatt, final int interval, final int latency, final int timeout, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.Oi0OO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onConnectionUpdated(gatt, interval, latency, timeout, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onDeviceUuidsDiscovery(final BluetoothDevice device, final ParcelUuid[] uuids) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XXOI1I
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onDeviceUuidsDiscovery(device, uuids);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onDiscovery(final BluetoothDevice device, final BleScanMessage bleScanMessage) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.iXIi1XII
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onDiscovery(device, bleScanMessage);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onDiscoveryStatus(final boolean bBle, final boolean bStart) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.O0O0XiIiO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onDiscoveryStatus(bBle, bStart);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onError(final ErrorInfo error) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XX0XOi
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onError(error);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onHfpStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i11II1i10
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onHfpStatus(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onHistoryRecordChange(final int op, final HistoryRecord record) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i001OIXX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onHistoryRecordChange(op, record);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onShowDialog(final BluetoothDevice device, final BleScanMessage bleScanMessage) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OI1X11
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onShowDialog(device, bleScanMessage);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onSppDataNotification(final BluetoothDevice device, final UUID sppUUID, final byte[] data) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.iX1O1i0Xi
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onSppDataNotification(device, sppUUID, data);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onSppStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XiiO0I0iI
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onSppStatus(device, status);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onSwitchConnectedDevice(final BluetoothDevice device) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.IX0I0
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((IBluetoothEventCallback) obj).onSwitchConnectedDevice(device);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(IBluetoothEventCallback listener) {
        return super.removeListener(listener);
    }
}
