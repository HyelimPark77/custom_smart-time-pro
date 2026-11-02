package com.jieli.jl_bt_ota.tool.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.RequiresApi;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtBleListener;
import com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper;

/* JADX INFO: loaded from: classes17.dex */
public class BtBleCallbackManager extends BaseCallbackHelper<OnBtBleListener> {
    public void onBleConnection(final BluetoothDevice bluetoothDevice, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.iIiiXO
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onBleConnection(bluetoothDevice, i);
            }
        });
    }

    public void onCharacteristicChanged(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XI011i
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            }
        });
    }

    public void onCharacteristicRead(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.IXIOiO1I0
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        });
    }

    public void onCharacteristicWrite(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.OIOXi1I
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        });
    }

    public void onConnectionStateChange(final BluetoothGatt bluetoothGatt, final int i, final int i2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.IIXi1
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onConnectionStateChange(bluetoothGatt, i, i2);
            }
        });
    }

    public void onConnectionUpdated(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3, final int i4) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.OIX0i
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onConnectionUpdatedCallback(bluetoothGatt, i, i2, i3, i4);
            }
        });
    }

    public void onDescriptorRead(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.iiIiOI0X
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        });
    }

    public void onDescriptorWrite(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.OiiXI
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        });
    }

    public void onMtuChanged(final BluetoothGatt bluetoothGatt, final int i, final int i2) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.O1I1i
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onMtuChanged(bluetoothGatt, i, i2);
            }
        });
    }

    @RequiresApi(api = 26)
    public void onPhyRead(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.O0I1O0
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onPhyRead(bluetoothGatt, i, i2, i3);
            }
        });
    }

    @RequiresApi(api = 26)
    public void onPhyUpdate(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.O1X0O1O
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onPhyUpdate(bluetoothGatt, i, i2, i3);
            }
        });
    }

    public void onServicesDiscovered(final BluetoothGatt bluetoothGatt, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.XX1XIiIXX
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onServicesDiscovered(bluetoothGatt, i);
            }
        });
    }

    public void onSwitchBleDevice(final BluetoothDevice bluetoothDevice) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.iX0iXOiI
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                ((OnBtBleListener) obj).onSwitchBleDevice(bluetoothDevice);
            }
        });
    }

    @RequiresApi(api = 33)
    public void onCharacteristicChanged(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.i1iO0
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                I0XXIO.OXO1((OnBtBleListener) obj, bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
        });
    }

    @RequiresApi(api = 33)
    public void onCharacteristicRead(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final int i) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.OOXXi0i
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                i01OIi1.OXO1((OnBtBleListener) obj, bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
            }
        });
    }

    @RequiresApi(api = 33)
    public void onDescriptorRead(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i, final byte[] bArr) {
        callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.android.mltcode.paycertificationapi.X1I0XI
            @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
            public final void onHandle(Object obj) {
                I1O0I1O.OXO1((OnBtBleListener) obj, bluetoothGatt, bluetoothGattDescriptor, i, bArr);
            }
        });
    }
}
