package com.jieli.jl_bt_ota.tool.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.I0XXIO;
import com.android.mltcode.paycertificationapi.I1O0I1O;
import com.android.mltcode.paycertificationapi.IIXi1;
import com.android.mltcode.paycertificationapi.IXIOiO1I0;
import com.android.mltcode.paycertificationapi.O0I1O0;
import com.android.mltcode.paycertificationapi.O1I1i;
import com.android.mltcode.paycertificationapi.O1X0O1O;
import com.android.mltcode.paycertificationapi.OIOXi1I;
import com.android.mltcode.paycertificationapi.OIX0i;
import com.android.mltcode.paycertificationapi.OOXXi0i;
import com.android.mltcode.paycertificationapi.OiiXI;
import com.android.mltcode.paycertificationapi.X1I0XI;
import com.android.mltcode.paycertificationapi.XI011i;
import com.android.mltcode.paycertificationapi.XX1XIiIXX;
import com.android.mltcode.paycertificationapi.i01OIi1;
import com.android.mltcode.paycertificationapi.i1iO0;
import com.android.mltcode.paycertificationapi.iIiiXO;
import com.android.mltcode.paycertificationapi.iX0iXOiI;
import com.android.mltcode.paycertificationapi.iiIiOI0X;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtBleListener;
import com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper;

/* JADX INFO: loaded from: classes17.dex */
public class BtBleCallbackManager extends BaseCallbackHelper<OnBtBleListener> {
    public BtBleCallbackManager() {
    }

    public static /* synthetic */ void I0IIOi(BluetoothGatt r0, BluetoothGattCharacteristic r1, byte[] r2, OnBtBleListener r3) {
        a(r0, r1, r2, r3);
    }

    public static /* synthetic */ void I0iXXO(BluetoothGatt r0, BluetoothGattCharacteristic r1, byte[] r2, int r3, OnBtBleListener r4) {
        a(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ void IO(BluetoothGatt r0, int r1, OnBtBleListener r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void IiI10X(BluetoothGatt r0, BluetoothGattCharacteristic r1, OnBtBleListener r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void O00(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        b(r0, r1, r2, r3);
    }

    public static /* synthetic */ void O10IXXX0X(BluetoothGatt r0, int r1, int r2, int r3, int r4, OnBtBleListener r5) {
        a(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void OIX0iXi(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, OnBtBleListener r3) {
        a(r0, r1, r2, r3);
    }

    public static /* synthetic */ void OIi0(BluetoothGatt r0, int r1, int r2, int r3, OnBtBleListener r4) {
        a(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ void OXO1(BluetoothDevice r0, int r1, OnBtBleListener r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void X0O(BluetoothDevice r0, OnBtBleListener r1) {
        a(r0, r1);
    }

    public static /* synthetic */ void X1ii(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, OnBtBleListener r3) {
        b(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, byte[] r3, OnBtBleListener r4) {
        a(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ void XO0O10(BluetoothGatt r0, BluetoothGattCharacteristic r1, int r2, OnBtBleListener r3) {
        a(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XOO0ii0(BluetoothGatt r0, BluetoothGattCharacteristic r1, int r2, OnBtBleListener r3) {
        b(r0, r1, r2, r3);
    }

    public static /* synthetic */ void XXI(BluetoothGatt r0, int r1, int r2, int r3, OnBtBleListener r4) {
        b(r0, r1, r2, r3, r4);
    }

    private static /* synthetic */ void a(BluetoothGatt r1, int r2, int r3, int r4, int r5, OnBtBleListener r6) {
        r6.onConnectionUpdatedCallback(r1, r2, r3, r4, r5);
    }

    private static /* synthetic */ void b(BluetoothGatt r0, BluetoothGattCharacteristic r1, int r2, OnBtBleListener r3) {
        r3.onCharacteristicWrite(r0, r1, r2);
    }

    public static /* synthetic */ void iO(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        a(r0, r1, r2, r3);
    }

    public void onBleConnection(final BluetoothDevice r2, final int r3) {
        callbackEvent(new iIiiXO(r2, r3));
    }

    public void onCharacteristicChanged(final BluetoothGatt r2, final BluetoothGattCharacteristic r3) {
        callbackEvent(new XI011i(r2, r3));
    }

    public void onCharacteristicRead(final BluetoothGatt r2, final BluetoothGattCharacteristic r3, final int r4) {
        callbackEvent(new IXIOiO1I0(r2, r3, r4));
    }

    public void onCharacteristicWrite(final BluetoothGatt r2, final BluetoothGattCharacteristic r3, final int r4) {
        callbackEvent(new OIOXi1I(r2, r3, r4));
    }

    public void onConnectionStateChange(final BluetoothGatt r2, final int r3, final int r4) {
        callbackEvent(new IIXi1(r2, r3, r4));
    }

    public void onConnectionUpdated(final BluetoothGatt r7, final int r8, final int r9, final int r10, final int r11) {
        callbackEvent(new OIX0i(r7, r8, r9, r10, r11));
    }

    public void onDescriptorRead(final BluetoothGatt r2, final BluetoothGattDescriptor r3, final int r4) {
        callbackEvent(new iiIiOI0X(r2, r3, r4));
    }

    public void onDescriptorWrite(final BluetoothGatt r2, final BluetoothGattDescriptor r3, final int r4) {
        callbackEvent(new OiiXI(r2, r3, r4));
    }

    public void onMtuChanged(final BluetoothGatt r2, final int r3, final int r4) {
        callbackEvent(new O1I1i(r2, r3, r4));
    }

    @RequiresApi(api = 26)
    public void onPhyRead(final BluetoothGatt r2, final int r3, final int r4, final int r5) {
        callbackEvent(new O0I1O0(r2, r3, r4, r5));
    }

    @RequiresApi(api = 26)
    public void onPhyUpdate(final BluetoothGatt r2, final int r3, final int r4, final int r5) {
        callbackEvent(new O1X0O1O(r2, r3, r4, r5));
    }

    public void onServicesDiscovered(final BluetoothGatt r2, final int r3) {
        callbackEvent(new XX1XIiIXX(r2, r3));
    }

    public void onSwitchBleDevice(final BluetoothDevice r2) {
        callbackEvent(new iX0iXOiI(r2));
    }

    private static /* synthetic */ void a(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        r3.onConnectionStateChange(r0, r1, r2);
    }

    private static /* synthetic */ void b(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, OnBtBleListener r3) {
        r3.onDescriptorWrite(r0, r1, r2);
    }

    @RequiresApi(api = 33)
    public void onCharacteristicChanged(final BluetoothGatt r2, final BluetoothGattCharacteristic r3, final byte[] r4) {
        callbackEvent(new i1iO0(r2, r3, r4));
    }

    @RequiresApi(api = 33)
    public void onCharacteristicRead(final BluetoothGatt r2, final BluetoothGattCharacteristic r3, final byte[] r4, final int r5) {
        callbackEvent(new OOXXi0i(r2, r3, r4, r5));
    }

    @RequiresApi(api = 33)
    public void onDescriptorRead(final BluetoothGatt r2, final BluetoothGattDescriptor r3, final int r4, final byte[] r5) {
        callbackEvent(new X1I0XI(r2, r3, r4, r5));
    }

    private static /* synthetic */ void a(BluetoothGatt r0, int r1, OnBtBleListener r2) {
        r2.onServicesDiscovered(r0, r1);
    }

    private static /* synthetic */ void b(BluetoothGatt r0, int r1, int r2, OnBtBleListener r3) {
        r3.onMtuChanged(r0, r1, r2);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, BluetoothGattCharacteristic r1, int r2, OnBtBleListener r3) {
        r3.onCharacteristicRead(r0, r1, r2);
    }

    private static /* synthetic */ void b(BluetoothGatt r0, int r1, int r2, int r3, OnBtBleListener r4) {
        r4.onPhyUpdate(r0, r1, r2, r3);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, BluetoothGattCharacteristic r1, byte[] r2, int r3, OnBtBleListener r4) {
        i01OIi1.OXO1(r4, r0, r1, r2, r3);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, BluetoothGattCharacteristic r1, OnBtBleListener r2) {
        r2.onCharacteristicChanged(r0, r1);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, BluetoothGattCharacteristic r1, byte[] r2, OnBtBleListener r3) {
        I0XXIO.OXO1(r3, r0, r1, r2);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, OnBtBleListener r3) {
        r3.onDescriptorRead(r0, r1, r2);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, BluetoothGattDescriptor r1, int r2, byte[] r3, OnBtBleListener r4) {
        I1O0I1O.OXO1(r4, r0, r1, r2, r3);
    }

    private static /* synthetic */ void a(BluetoothGatt r0, int r1, int r2, int r3, OnBtBleListener r4) {
        r4.onPhyRead(r0, r1, r2, r3);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, int r1, OnBtBleListener r2) {
        r2.onBleConnection(r0, r1);
    }

    private static /* synthetic */ void a(BluetoothDevice r0, OnBtBleListener r1) {
        r1.onSwitchBleDevice(r0);
    }
}
