package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.I0iI1;
import com.android.mltcode.paycertificationapi.I1110;
import com.android.mltcode.paycertificationapi.I1iO0i;
import com.android.mltcode.paycertificationapi.IOiI1OI;
import com.android.mltcode.paycertificationapi.O0IIOIIi1;
import com.android.mltcode.paycertificationapi.O0OIIX;
import com.android.mltcode.paycertificationapi.O1iii0;
import com.android.mltcode.paycertificationapi.OOI1;
import com.android.mltcode.paycertificationapi.OOIOO0X;
import com.android.mltcode.paycertificationapi.OXIO1Oi01;
import com.android.mltcode.paycertificationapi.X00;
import com.android.mltcode.paycertificationapi.X0OX;
import com.android.mltcode.paycertificationapi.X1O0i1iI;
import com.android.mltcode.paycertificationapi.X1O10XOOX;
import com.android.mltcode.paycertificationapi.XIIIOX;
import com.android.mltcode.paycertificationapi.XIiIX;
import com.android.mltcode.paycertificationapi.XOi1OIiO;
import com.android.mltcode.paycertificationapi.XX1OO;
import com.android.mltcode.paycertificationapi.Xi1iii1I0;
import com.android.mltcode.paycertificationapi.i01X0;
import com.android.mltcode.paycertificationapi.i0XXiIIX;
import com.android.mltcode.paycertificationapi.i1I1IXX;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtBleListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BleEventCbManager extends BaseCbManager<OnBtBleListener> {
    public BleEventCbManager() {
    }

    public static /* synthetic */ void I0IIOi(BluetoothGatt r0, int r1, int r2, int r3, OnBtBleListener r4) {
        r4.onPhyRead(r0, r1, r2, r3);
    }

    public static /* synthetic */ void I0iXXO(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, OnBtBleListener r3) {
        r3.onDescriptorWrite(r0, r1, r2);
    }

    public static /* synthetic */ void I1XOi1(BluetoothDevice r0, UUID r1, UUID r2, byte[] r3, OnBtBleListener r4) {
        r4.onBleDataNotify(r0, r1, r2, r3);
    }

    public static /* synthetic */ void IIX1OXO(BluetoothDevice r0, OnBtBleListener r1) {
        r1.onSwitchBleDevice(r0);
    }

    public static /* synthetic */ void IO(BluetoothDevice r0, int r1, OnBtBleListener r2) {
        r2.onBleBond(r0, r1);
    }

    public static /* synthetic */ void IiI10X(BluetoothGatt r0, int r1, OnBtBleListener r2) {
        r2.onReliableWriteCompleted(r0, r1);
    }

    public static /* synthetic */ void O00(BluetoothDevice r0, int r1, int r2, OnBtBleListener r3) {
        r3.onBleMtuChanged(r0, r1, r2);
    }

    public static /* synthetic */ void O10IXXX0X(BluetoothGatt r0, int r1, OnBtBleListener r2) {
        r2.onServicesDiscovered(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(BluetoothGatt r1, int r2, int r3, int r4, int r5, OnBtBleListener r6) {
        r6.onConnectionUpdatedCallback(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void OIi0(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        r3.onReadRemoteRssi(r0, r1, r2);
    }

    public static /* synthetic */ void OXO1(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, OnBtBleListener r3) {
        r3.onDescriptorRead(r0, r1, r2);
    }

    public static /* synthetic */ void X0O(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        r3.onMtuChanged(r0, r1, r2);
    }

    public static /* synthetic */ void X1ii(BluetoothGatt r0, int r1, int r2, int r3, OnBtBleListener r4) {
        r4.onPhyUpdate(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothGatt r0, BluetoothGattCharacteristic r1, int r2, OnBtBleListener r3) {
        r3.onCharacteristicWrite(r0, r1, r2);
    }

    public static /* synthetic */ void XO0O10(BluetoothDevice r0, UUID r1, UUID r2, boolean r3, OnBtBleListener r4) {
        r4.onBleNotificationStatus(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XOO0ii0(BluetoothGatt r0, BluetoothGattCharacteristic r1, int r2, OnBtBleListener r3) {
        r3.onCharacteristicRead(r0, r1, r2);
    }

    public static /* synthetic */ void XX0(BluetoothGatt r0, OnBtBleListener r1) {
        O0OIIX.OXO1(r1, r0);
    }

    public static /* synthetic */ void XXI(BluetoothDevice r0, int r1, OnBtBleListener r2) {
        r2.onBleConnection(r0, r1);
    }

    public static /* synthetic */ void XiOIO(BluetoothDevice r1, UUID r2, UUID r3, byte[] r4, int r5, OnBtBleListener r6) {
        r6.onBleWriteStatus(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void iIiiO(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        r3.onConnectionStateChange(r0, r1, r2);
    }

    public static /* synthetic */ void iO(BluetoothGatt r0, BluetoothGattCharacteristic r1, OnBtBleListener r2) {
        r2.onCharacteristicChanged(r0, r1);
    }

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
        callbackEvent(new i0XXiIIX(device, bondStatus));
    }

    public void onBleConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new XIIIOX(device, status));
    }

    public void onBleDataNotify(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data) {
        callbackEvent(new XX1OO(device, serviceUuid, characteristicsUuid, data));
    }

    public void onBleMtuChanged(final BluetoothDevice device, final int block, final int status) {
        callbackEvent(new I1110(device, block, status));
    }

    public void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, final boolean bEnabled) {
        callbackEvent(new OXIO1Oi01(device, serviceUuid, characteristicUuid, bEnabled));
    }

    public void onBleWriteStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data, final int status) {
        callbackEvent(new I1iO0i(device, serviceUuid, characteristicsUuid, data, status));
    }

    public void onCharacteristicChanged(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic) {
        callbackEvent(new XIiIX(gatt, characteristic));
    }

    public void onCharacteristicRead(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, final int status) {
        callbackEvent(new O0IIOIIi1(gatt, characteristic, status));
    }

    public void onCharacteristicWrite(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, final int status) {
        callbackEvent(new O1iii0(gatt, characteristic, status));
    }

    public void onConnectionStateChange(final BluetoothGatt gatt, final int status, final int newState) {
        callbackEvent(new IOiI1OI(gatt, status, newState));
    }

    public void onConnectionUpdatedCallback(final BluetoothGatt gatt, final int interval, final int latency, final int timeout, final int status) {
        callbackEvent(new XOi1OIiO(gatt, interval, latency, timeout, status));
    }

    public void onDescriptorRead(final BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, final int status) {
        callbackEvent(new X1O0i1iI(gatt, descriptor, status));
    }

    public void onDescriptorWrite(final BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, final int status) {
        callbackEvent(new X00(gatt, descriptor, status));
    }

    public void onMtuChanged(final BluetoothGatt gatt, final int mtu, final int status) {
        callbackEvent(new OOIOO0X(gatt, mtu, status));
    }

    @RequiresApi(api = 26)
    public void onPhyRead(final BluetoothGatt gatt, final int txPhy, final int rxPhy, final int status) {
        callbackEvent(new OOI1(gatt, txPhy, rxPhy, status));
    }

    @RequiresApi(api = 26)
    public void onPhyUpdate(final BluetoothGatt gatt, final int txPhy, final int rxPhy, final int status) {
        callbackEvent(new i1I1IXX(gatt, txPhy, rxPhy, status));
    }

    public void onReadRemoteRssi(final BluetoothGatt gatt, final int rssi, final int status) {
        callbackEvent(new X0OX(gatt, rssi, status));
    }

    public void onReliableWriteCompleted(final BluetoothGatt gatt, final int status) {
        callbackEvent(new Xi1iii1I0(gatt, status));
    }

    @RequiresApi(api = 31)
    public void onServiceChanged(@NonNull final BluetoothGatt gatt) {
        callbackEvent(new I0iI1(gatt));
    }

    public void onServicesDiscovered(final BluetoothGatt gatt, final int status) {
        callbackEvent(new i01X0(gatt, status));
    }

    public void onSwitchBleDevice(final BluetoothDevice device) {
        callbackEvent(new X1O10XOOX(device));
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(OnBtBleListener listener) {
        return super.removeListener(listener);
    }
}
