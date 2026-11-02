package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtBleListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleEventCbManager extends BaseCbManager<OnBtBleListener> {
    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean addListener(OnBtBleListener listener) {
        return super.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void callbackEvent(BaseCbManager.CallbackImpl<OnBtBleListener> impl) {
        super.callbackEvent(impl);
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    public void onBleBond(final BluetoothDevice device, final int bondStatus) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i0XXiIIX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onBleBond(device, bondStatus);
            }
        });
    }

    public void onBleConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XIIIOX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onBleConnection(device, status);
            }
        });
    }

    public void onBleDataNotify(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XX1OO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onBleDataNotify(device, serviceUuid, characteristicsUuid, data);
            }
        });
    }

    public void onBleMtuChanged(final BluetoothDevice device, final int block, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.I1110
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onBleMtuChanged(device, block, status);
            }
        });
    }

    public void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, final boolean bEnabled) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OXIO1Oi01
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onBleNotificationStatus(device, serviceUuid, characteristicUuid, bEnabled);
            }
        });
    }

    public void onBleWriteStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.I1iO0i
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onBleWriteStatus(device, serviceUuid, characteristicsUuid, data, status);
            }
        });
    }

    public void onCharacteristicChanged(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XIiIX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onCharacteristicChanged(gatt, characteristic);
            }
        });
    }

    public void onCharacteristicRead(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.O0IIOIIi1
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onCharacteristicRead(gatt, characteristic, status);
            }
        });
    }

    public void onCharacteristicWrite(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.O1iii0
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onCharacteristicWrite(gatt, characteristic, status);
            }
        });
    }

    public void onConnectionStateChange(final BluetoothGatt gatt, final int status, final int newState) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.IOiI1OI
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onConnectionStateChange(gatt, status, newState);
            }
        });
    }

    public void onConnectionUpdatedCallback(final BluetoothGatt gatt, final int interval, final int latency, final int timeout, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.XOi1OIiO
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onConnectionUpdatedCallback(gatt, interval, latency, timeout, status);
            }
        });
    }

    public void onDescriptorRead(final BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.X1O0i1iI
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onDescriptorRead(gatt, descriptor, status);
            }
        });
    }

    public void onDescriptorWrite(final BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.X00
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onDescriptorWrite(gatt, descriptor, status);
            }
        });
    }

    public void onMtuChanged(final BluetoothGatt gatt, final int mtu, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OOIOO0X
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onMtuChanged(gatt, mtu, status);
            }
        });
    }

    @RequiresApi(api = 26)
    public void onPhyRead(final BluetoothGatt gatt, final int txPhy, final int rxPhy, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.OOI1
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onPhyRead(gatt, txPhy, rxPhy, status);
            }
        });
    }

    @RequiresApi(api = 26)
    public void onPhyUpdate(final BluetoothGatt gatt, final int txPhy, final int rxPhy, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i1I1IXX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onPhyUpdate(gatt, txPhy, rxPhy, status);
            }
        });
    }

    public void onReadRemoteRssi(final BluetoothGatt gatt, final int rssi, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.X0OX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onReadRemoteRssi(gatt, rssi, status);
            }
        });
    }

    public void onReliableWriteCompleted(final BluetoothGatt gatt, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.Xi1iii1I0
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onReliableWriteCompleted(gatt, status);
            }
        });
    }

    @RequiresApi(api = 31)
    public void onServiceChanged(@NonNull final BluetoothGatt gatt) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.I0iI1
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onServiceChanged(gatt);
            }
        });
    }

    public void onServicesDiscovered(final BluetoothGatt gatt, final int status) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.i01X0
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onServicesDiscovered(gatt, status);
            }
        });
    }

    public void onSwitchBleDevice(final BluetoothDevice device) {
        callbackEvent(new BaseCbManager.CallbackImpl() { // from class: com.android.mltcode.paycertificationapi.X1O10XOOX
            @Override // com.jieli.bluetooth_connect.tool.BaseCbManager.CallbackImpl
            public final void onCallback(Object obj) {
                ((OnBtBleListener) obj).onSwitchBleDevice(device);
            }
        });
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtBleListener listener) {
        return super.removeListener(listener);
    }
}
