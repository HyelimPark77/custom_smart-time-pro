package com.jieli.bluetooth_connect.tool;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import android.os.ParcelUuid;
import com.android.mltcode.paycertificationapi.I0iOOO;
import com.android.mltcode.paycertificationapi.IOO1OIO;
import com.android.mltcode.paycertificationapi.IX0I0;
import com.android.mltcode.paycertificationapi.IXi1i0I;
import com.android.mltcode.paycertificationapi.O0O0XiIiO;
import com.android.mltcode.paycertificationapi.OI1X11;
import com.android.mltcode.paycertificationapi.OOI1i1;
import com.android.mltcode.paycertificationapi.Oi0OO;
import com.android.mltcode.paycertificationapi.OiOiii00;
import com.android.mltcode.paycertificationapi.X01iI;
import com.android.mltcode.paycertificationapi.XI11;
import com.android.mltcode.paycertificationapi.XI1IX0OIO;
import com.android.mltcode.paycertificationapi.XX0XOi;
import com.android.mltcode.paycertificationapi.XXOI1I;
import com.android.mltcode.paycertificationapi.XiiO0I0iI;
import com.android.mltcode.paycertificationapi.i001OIXX;
import com.android.mltcode.paycertificationapi.i11II1i10;
import com.android.mltcode.paycertificationapi.i11IOi0O;
import com.android.mltcode.paycertificationapi.i1iiO1O1;
import com.android.mltcode.paycertificationapi.iOOX0XII;
import com.android.mltcode.paycertificationapi.iX1O1i0Xi;
import com.android.mltcode.paycertificationapi.iXIi1XII;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothEventCbManager extends BaseCbManager<IBluetoothEventCallback> implements IBluetoothEventCallback {
    public BluetoothEventCbManager() {
    }

    public static /* synthetic */ void I0IIOi(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onHfpStatus(r0, r1);
    }

    public static /* synthetic */ void I0iXXO(BluetoothDevice r0, UUID r1, UUID r2, boolean r3, IBluetoothEventCallback r4) {
        r4.onBleNotificationStatus(r0, r1, r2, r3);
    }

    public static /* synthetic */ void I1XOi1(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onConnection(r0, r1);
    }

    public static /* synthetic */ void IIX1OXO(ErrorInfo r0, IBluetoothEventCallback r1) {
        r1.onError(r0);
    }

    public static /* synthetic */ void IO(BluetoothDevice r0, UUID r1, UUID r2, byte[] r3, IBluetoothEventCallback r4) {
        r4.onBleDataNotification(r0, r1, r2, r3);
    }

    public static /* synthetic */ void IiI10X(BluetoothGatt r1, int r2, int r3, int r4, int r5, IBluetoothEventCallback r6) {
        r6.onConnectionUpdated(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void O00(BluetoothDevice r0, int r1, int r2, IBluetoothEventCallback r3) {
        r3.onBleDataBlockChanged(r0, r1, r2);
    }

    public static /* synthetic */ void O10IXXX0X(BluetoothDevice r0, IBluetoothEventCallback r1) {
        r1.onSwitchConnectedDevice(r0);
    }

    public static /* synthetic */ void OIX0iXi(BluetoothDevice r0, BleScanMessage r1, IBluetoothEventCallback r2) {
        r2.onShowDialog(r0, r1);
    }

    public static /* synthetic */ void OIi0(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onA2dpStatus(r0, r1);
    }

    public static /* synthetic */ void OXO1(boolean r0, boolean r1, IBluetoothEventCallback r2) {
        r2.onDiscoveryStatus(r0, r1);
    }

    public static /* synthetic */ void OiIIX101O(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onSppStatus(r0, r1);
    }

    public static /* synthetic */ void X0O(boolean r0, boolean r1, IBluetoothEventCallback r2) {
        r2.onAdapterStatus(r0, r1);
    }

    public static /* synthetic */ void X1ii(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onBleConnection(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, UUID r1, byte[] r2, IBluetoothEventCallback r3) {
        r3.onSppDataNotification(r0, r1, r2);
    }

    public static /* synthetic */ void XO0O10(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onBondStatus(r0, r1);
    }

    public static /* synthetic */ void XOO0ii0(BluetoothDevice r0, BleScanMessage r1, IBluetoothEventCallback r2) {
        r2.onDiscovery(r0, r1);
    }

    public static /* synthetic */ void XX0(BluetoothDevice r0, int r1, IBluetoothEventCallback r2) {
        r2.onBtDeviceConnectStatus(r0, r1);
    }

    public static /* synthetic */ void XXI(BluetoothDevice r1, UUID r2, UUID r3, byte[] r4, int r5, IBluetoothEventCallback r6) {
        r6.onBleWriteStatus(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void XiOIO(BluetoothDevice r0, int r1, List r2, IBluetoothEventCallback r3) {
        r3.onBleServiceDiscovery(r0, r1, r2);
    }

    public static /* synthetic */ void iIiiO(int r0, HistoryRecord r1, IBluetoothEventCallback r2) {
        r2.onHistoryRecordChange(r0, r1);
    }

    public static /* synthetic */ void iO(BluetoothDevice r0, ParcelUuid[] r1, IBluetoothEventCallback r2) {
        r2.onDeviceUuidsDiscovery(r0, r1);
    }

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
        callbackEvent(new i1iiO1O1(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onAdapterStatus(final boolean bEnabled, final boolean bHasBle) {
        callbackEvent(new OOI1i1(bEnabled, bHasBle));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new IOO1OIO(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleDataBlockChanged(final BluetoothDevice device, final int block, final int status) {
        callbackEvent(new OiOiii00(device, block, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleDataNotification(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data) {
        callbackEvent(new XI1IX0OIO(device, serviceUuid, characteristicsUuid, data));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, final boolean bEnabled) {
        callbackEvent(new i11IOi0O(device, serviceUuid, characteristicUuid, bEnabled));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleServiceDiscovery(final BluetoothDevice device, final int status, final List<BluetoothGattService> services) {
        callbackEvent(new I0iOOO(device, status, services));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBleWriteStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data, final int status) {
        callbackEvent(new X01iI(device, serviceUuid, characteristicsUuid, data, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBondStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new iOOX0XII(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onBtDeviceConnectStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new IXi1i0I(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onConnection(final BluetoothDevice device, final int status) {
        callbackEvent(new XI11(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onConnectionUpdated(final BluetoothGatt gatt, final int interval, final int latency, final int timeout, final int status) {
        callbackEvent(new Oi0OO(gatt, interval, latency, timeout, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onDeviceUuidsDiscovery(final BluetoothDevice device, final ParcelUuid[] uuids) {
        callbackEvent(new XXOI1I(device, uuids));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onDiscovery(final BluetoothDevice device, final BleScanMessage bleScanMessage) {
        callbackEvent(new iXIi1XII(device, bleScanMessage));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onDiscoveryStatus(final boolean bBle, final boolean bStart) {
        callbackEvent(new O0O0XiIiO(bBle, bStart));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onError(final ErrorInfo error) {
        callbackEvent(new XX0XOi(error));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onHfpStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new i11II1i10(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onHistoryRecordChange(final int op, final HistoryRecord record) {
        callbackEvent(new i001OIXX(op, record));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onShowDialog(final BluetoothDevice device, final BleScanMessage bleScanMessage) {
        callbackEvent(new OI1X11(device, bleScanMessage));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onSppDataNotification(final BluetoothDevice device, final UUID sppUUID, final byte[] data) {
        callbackEvent(new iX1O1i0Xi(device, sppUUID, data));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onSppStatus(final BluetoothDevice device, final int status) {
        callbackEvent(new XiiO0I0iI(device, status));
    }

    @Override // com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
    public void onSwitchConnectedDevice(final BluetoothDevice device) {
        callbackEvent(new IX0I0(device));
    }

    @Override // com.jieli.bluetooth_connect.tool.BaseCbManager
    public /* bridge */ /* synthetic */ boolean removeListener(IBluetoothEventCallback listener) {
        return super.removeListener(listener);
    }
}
