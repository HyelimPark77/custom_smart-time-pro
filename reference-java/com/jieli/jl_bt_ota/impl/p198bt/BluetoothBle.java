package com.jieli.jl_bt_ota.impl.p198bt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import com.facebook.login.widget.ToolTipPopup;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.constant.GattError;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBleSendDataCallback;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtBleListener;
import com.jieli.jl_bt_ota.model.base.ThreadState;
import com.jieli.jl_bt_ota.model.ble.BleCharacteristic;
import com.jieli.jl_bt_ota.model.ble.BleConnectParam;
import com.jieli.jl_bt_ota.model.ble.BleDevice;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import com.jieli.jl_bt_ota.model.ble.BleSendTask;
import com.jieli.jl_bt_ota.tool.ble.BtBleCallbackManager;
import com.jieli.jl_bt_ota.tool.ble.SendBleDataThread;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import com.jieli.jl_bt_ota.util.UuidUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
class BluetoothBle extends BluetoothBreProfiles {

    /* JADX INFO: renamed from: A */
    private static final int f37567A = 12289;

    /* JADX INFO: renamed from: B */
    private static final int f37568B = 12290;

    /* JADX INFO: renamed from: C */
    private static final int f37569C = 12291;

    /* JADX INFO: renamed from: D */
    private static final int f37570D = 12292;

    /* JADX INFO: renamed from: E */
    private static final int f37571E = 12293;

    /* JADX INFO: renamed from: F */
    private static final int f37572F = 2000;

    /* JADX INFO: renamed from: G */
    private static final long f37573G = 25000;

    /* JADX INFO: renamed from: s */
    private final Map<String, BleDevice> f37574s;

    /* JADX INFO: renamed from: t */
    private final BtBleCallbackManager f37575t;

    /* JADX INFO: renamed from: u */
    private final Queue<BleCharacteristic> f37576u;

    /* JADX INFO: renamed from: v */
    private BluetoothBleReceiver f37577v;

    /* JADX INFO: renamed from: w */
    private SendBleDataThread f37578w;

    /* JADX INFO: renamed from: x */
    private long f37579x;

    /* JADX INFO: renamed from: y */
    private volatile BluetoothDevice f37580y;

    /* JADX INFO: renamed from: z */
    private final BluetoothGattCallback f37581z;

    public class BluetoothBleReceiver extends BroadcastReceiver {
        private BluetoothBleReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            action.getClass();
            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice2 == null) {
                    return;
                }
                JL_Log.m27232d(BluetoothBle.this.TAG, "ACTION_ACL_CONNECTED", "device : " + BluetoothBle.this.printBtDeviceInfo(bluetoothDevice2));
                return;
            }
            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED") && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                JL_Log.m27232d(BluetoothBle.this.TAG, "ACTION_ACL_DISCONNECTED", "device : " + BluetoothBle.this.printBtDeviceInfo(bluetoothDevice));
                if (BluetoothBle.this.m27023f(bluetoothDevice)) {
                    JL_Log.m27232d(BluetoothBle.this.TAG, "ACTION_ACL_DISCONNECTED", CommonUtil.formatString("Ready to disconnect device[%s].", bluetoothDevice));
                    BluetoothBle.this.disconnectBLEDevice(bluetoothDevice);
                }
            }
        }
    }

    public BluetoothBle(Context context) {
        super(context);
        this.f37581z = new BluetoothGattCallback() { // from class: com.jieli.jl_bt_ota.impl.bt.BluetoothBle.2
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null || bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
                    return;
                }
                BluetoothBle.this.m27000a(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 33)
            public void onCharacteristicRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr, int i) {
                BluetoothBle.this.f37575t.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
                BluetoothBle.this.m27001a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null || bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                UUID uuid = bluetoothGattCharacteristic.getService().getUuid();
                UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                byte[] value = bluetoothGattCharacteristic.getValue();
                BluetoothBle bluetoothBle = BluetoothBle.this;
                JL_Log.m27236i(bluetoothBle.TAG, "onCharacteristicWrite", CommonUtil.formatString(">>> device = %s, service = %s, characteristic = %s, status = %d,\n data : [%s].", bluetoothBle.printBtDeviceInfo(bluetoothGatt.getDevice(), false), UuidUtil.read16BitUUID(uuid), UuidUtil.read16BitUUID(uuid2), Integer.valueOf(i), CHexConver.byte2HexStr(value)));
                BluetoothBle.this.m26994a(device, uuid, uuid2, i, value);
                BluetoothBle.this.f37575t.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                BluetoothBle bluetoothBle = BluetoothBle.this;
                JL_Log.m27236i(bluetoothBle.TAG, "onConnectionStateChange", CommonUtil.formatString("device: %s, status = %d, newState = %d.", bluetoothBle.printBtDeviceInfo(device), Integer.valueOf(i), Integer.valueOf(i2)));
                BluetoothBle.this.m26999a(bluetoothGatt, i, i2);
            }

            @RequiresApi(api = 26)
            public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                BluetoothBle bluetoothBle = BluetoothBle.this;
                JL_Log.m27240w(bluetoothBle.TAG, "onConnectionUpdated", CommonUtil.formatString("device: %s, interval = %d, latency = %d, timeout = %d, status = %d.", bluetoothBle.printBtDeviceInfo(device), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                BluetoothBle.this.f37575t.onConnectionUpdated(bluetoothGatt, i, i2, i3, i4);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                BluetoothBle.this.f37575t.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                UUID uuid;
                UUID uuid2;
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null || bluetoothGattDescriptor == null || bluetoothGattDescriptor.getCharacteristic() == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                BluetoothBle.this.f37575t.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
                BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
                if (characteristic != null) {
                    uuid = characteristic.getUuid();
                    uuid2 = characteristic.getService().getUuid();
                } else {
                    uuid = null;
                    uuid2 = null;
                }
                JL_Log.m27232d(BluetoothBle.this.TAG, "onDescriptorWrite", CommonUtil.formatString("device: %s, serviceUUID: %s, characteristicUuid: %s, status = %d.", device, UuidUtil.read16BitUUID(uuid2), UuidUtil.read16BitUUID(uuid), Integer.valueOf(i)));
                BluetoothBle.this.m26995a(device, uuid2, uuid, i == 0);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                int i3 = i - 3;
                JL_Log.m27236i(BluetoothBle.this.TAG, "onMtuChanged", "device : " + BluetoothBle.this.printBtDeviceInfo(device) + ", real mtu = " + i3 + ", status = " + i2);
                BluetoothBle.this.f37575t.onMtuChanged(bluetoothGatt, i, i2);
                BluetoothBle bluetoothBle = BluetoothBle.this;
                bluetoothBle.m26991a(device, i3, i2, bluetoothBle.mUIHandler.hasMessages(12291));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 26)
            public void onPhyRead(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
                JL_Log.m27232d(BluetoothBle.this.TAG, "onPhyRead", CommonUtil.formatString("txPhy = %d, rxPhy = %d, status = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                BluetoothBle.this.f37575t.onPhyRead(bluetoothGatt, i, i2, i3);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 26)
            public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
                JL_Log.m27232d(BluetoothBle.this.TAG, "onPhyUpdate", CommonUtil.formatString("txPhy = %d, rxPhy = %d, status = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                BluetoothBle.this.f37575t.onPhyUpdate(bluetoothGatt, i, i2, i3);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                BluetoothBle.this.removeTimeoutTask(12290);
                BluetoothUtil.printBleGattServices(BluetoothBle.this.mContext, device, bluetoothGatt, i);
                BluetoothBle.this.m26998a(bluetoothGatt, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 33)
            public void onDescriptorRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i, @NonNull byte[] bArr) {
                BluetoothBle.this.f37575t.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i, bArr);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 33)
            public void onCharacteristicChanged(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
                BluetoothBle.this.f37575t.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                BluetoothBle.this.m27000a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null || bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
                    return;
                }
                BluetoothBle.this.m27001a(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i);
            }
        };
        this.f37574s = Collections.synchronizedMap(new HashMap());
        this.f37576u = new LinkedList();
        this.f37575t = new BtBleCallbackManager();
        m26989a();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    private BluetoothGatt m27014b(@NonNull BluetoothDevice bluetoothDevice, @NonNull BleConnectParam bleConnectParam) {
        BluetoothGatt bluetoothGattConnectGatt;
        Context context = this.mContext;
        int transport = bleConnectParam.getTransport();
        int preferredPhy = bleConnectParam.getPreferredPhy();
        JL_Log.m27232d(this.TAG, "connectBluetoothGatt", "transport : " + BluetoothUtil.printTransport(transport) + ", preferredPhy : " + preferredPhy);
        try {
            int i = Build.VERSION.SDK_INT;
            if (i > 26) {
                bluetoothGattConnectGatt = bluetoothDevice.connectGatt(context, false, this.f37581z, transport, preferredPhy, this.mUIHandler);
            } else {
                bluetoothGattConnectGatt = i == 26 ? bluetoothDevice.connectGatt(context, false, this.f37581z, transport, preferredPhy) : bluetoothDevice.connectGatt(context, false, this.f37581z, transport);
            }
        } catch (Exception e) {
            e.printStackTrace();
            bluetoothGattConnectGatt = null;
        }
        if (bluetoothGattConnectGatt != null) {
            return bluetoothGattConnectGatt;
        }
        JL_Log.m27236i(this.TAG, "connectBluetoothGatt", "Failed to connect ble.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m27017c(BluetoothDevice bluetoothDevice) {
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e == null) {
            return;
        }
        m26996a(bluetoothDevice, bleDeviceM27021e.getConnectParam().isNeedChangeBleMtu() && bleDeviceM27021e.getConnectParam().getRequestMtu() > 20);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    private void m27018d() {
        for (BluetoothDevice bluetoothDevice : getConnectedBleDevices()) {
            BluetoothGatt deviceGatt = getDeviceGatt(bluetoothDevice);
            if (deviceGatt != null) {
                if (BluetoothUtil.isBluetoothEnable()) {
                    deviceGatt.disconnect();
                    m26997a(deviceGatt);
                }
                this.f37575t.onBleConnection(bluetoothDevice, 0);
            }
        }
        this.f37574s.clear();
        m27024g();
    }

    /* JADX INFO: renamed from: e */
    private long m27020e() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public boolean m27023f(BluetoothDevice bluetoothDevice) {
        Iterator<BluetoothDevice> it = getConnectedBleDevices().iterator();
        while (it.hasNext()) {
            if (BluetoothUtil.deviceEquals(it.next(), bluetoothDevice)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private void m27025g(BluetoothDevice bluetoothDevice) {
        JL_Log.m27232d(this.TAG, "reconnectBleDevice", CommonUtil.formatString("Prepare to reconnect the device[%s].", printBtDeviceInfo(bluetoothDevice)));
        this.f37580y = bluetoothDevice;
        executeTimeoutTask(12293, bluetoothDevice, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        m27027i(bluetoothDevice);
    }

    /* JADX INFO: renamed from: h */
    private void m27026h(BluetoothDevice bluetoothDevice) {
        BleDevice bleDeviceRemove;
        if (bluetoothDevice == null || (bleDeviceRemove = this.f37574s.remove(bluetoothDevice.getAddress())) == null) {
            return;
        }
        BluetoothGatt bluetoothGatt = bleDeviceRemove.getBluetoothGatt();
        if (bluetoothGatt != null) {
            m26997a(bluetoothGatt);
        }
        bleDeviceRemove.setBluetoothGatt(null).setUsing(false).setBleMtu(20).setConnection(0);
    }

    /* JADX INFO: renamed from: i */
    private void m27027i(BluetoothDevice bluetoothDevice) {
        if (disconnectBLEDevice(bluetoothDevice)) {
            return;
        }
        m26990a(bluetoothDevice, 0);
    }

    public void addOnBtBleListener(OnBtBleListener onBtBleListener) {
        this.f37575t.addCallback(onBtBleListener);
    }

    public boolean connectBLEDevice(BluetoothDevice bluetoothDevice, BleConnectParam bleConnectParam) {
        if (isInvalidEnv("connectBLEDevice", bluetoothDevice) || bleConnectParam == null) {
            return false;
        }
        JL_Log.m27232d(this.TAG, "connectBLEDevice", CommonUtil.formatString("device: %s, %s.", printBtDeviceInfo(bluetoothDevice), bleConnectParam));
        if (isConnectedBLEDevice(bluetoothDevice)) {
            JL_Log.m27236i(this.TAG, "connectBLEDevice", "Device is connected.");
            this.f37575t.onBleConnection(bluetoothDevice, 2);
            return true;
        }
        BluetoothDevice connectingBleDevice = getConnectingBleDevice();
        if (connectingBleDevice != null) {
            JL_Log.m27236i(this.TAG, "connectBLEDevice", CommonUtil.formatString("Connecting BLE[%s].", printBtDeviceInfo(connectingBleDevice)));
            if (BluetoothUtil.deviceEquals(connectingBleDevice, bluetoothDevice)) {
                return true;
            }
            JL_Log.m27236i(this.TAG, "connectBLEDevice", CommonUtil.formatString("Disconnect the currently connected device(%s) and connect the new device(%s).", connectingBleDevice, bluetoothDevice));
            this.f37580y = bluetoothDevice;
            executeTimeoutTask(12293, bluetoothDevice, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            if (disconnectBLEDevice(connectingBleDevice)) {
                return true;
            }
        }
        this.f37579x = m27020e();
        BleDevice bleDeviceM26987a = m26987a(bluetoothDevice, bleConnectParam);
        BluetoothDevice usingBleDevice = getUsingBleDevice();
        if (usingBleDevice != null && !BluetoothUtil.deviceEquals(usingBleDevice, bluetoothDevice)) {
            JL_Log.m27236i(this.TAG, "connectBLEDevice", CommonUtil.formatString("The device is different from the currently connected device, so disconnect the currently connected device[%s].", printBtDeviceInfo(usingBleDevice)));
            this.f37580y = bluetoothDevice;
            executeTimeoutTask(12293, bluetoothDevice, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            if (disconnectBLEDevice(usingBleDevice)) {
                return true;
            }
        }
        executeTimeoutTask(12289, bluetoothDevice, bleConnectParam.getTimeout());
        m26990a(bluetoothDevice, 1);
        BluetoothGatt bluetoothGattM27014b = m27014b(bluetoothDevice, bleConnectParam);
        if (bluetoothGattM27014b == null) {
            m26990a(bluetoothDevice, 0);
            return false;
        }
        JL_Log.m27232d(this.TAG, "connectBLEDevice", "start connect ble. startTime : " + this.f37579x);
        bleDeviceM26987a.setBluetoothGatt(bluetoothGattM27014b);
        return true;
    }

    public boolean disconnectBLEDevice(BluetoothDevice bluetoothDevice) {
        if (isInvalidEnv("disconnectBLEDevice", bluetoothDevice)) {
            return false;
        }
        JL_Log.m27232d(this.TAG, "disconnectBLEDevice", "device : " + printBtDeviceInfo(bluetoothDevice));
        try {
            BluetoothGatt deviceGatt = getDeviceGatt(bluetoothDevice);
            if (!BluetoothUtil.deviceEquals(getConnectingBleDevice(), bluetoothDevice)) {
                if (deviceGatt == null) {
                    return false;
                }
                executeTimeoutTask(12292, bluetoothDevice, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
                deviceGatt.disconnect();
                return true;
            }
            JL_Log.m27236i(this.TAG, "disconnectBLEDevice", "Stop connecting deice. gatt = " + deviceGatt);
            if (deviceGatt != null) {
                deviceGatt.disconnect();
                m26997a(deviceGatt);
            }
            m26990a(bluetoothDevice, 0);
            return true;
        } catch (Exception e) {
            JL_Log.m27240w(this.TAG, "disconnectBLEDevice", "IO Exception : " + e);
            return false;
        }
    }

    public int getBleMtu(BluetoothDevice bluetoothDevice) {
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e == null || !bleDeviceM27021e.isConnected()) {
            return 0;
        }
        return bleDeviceM27021e.getBleMtu();
    }

    public List<BluetoothDevice> getConnectedBleDevices() {
        ArrayList arrayList = new ArrayList();
        for (BleDevice bleDevice : this.f37574s.values()) {
            if (bleDevice.isConnected()) {
                arrayList.add(bleDevice.getDevice());
            }
        }
        return arrayList;
    }

    public BluetoothDevice getConnectingBleDevice() {
        for (BleDevice bleDevice : this.f37574s.values()) {
            if (bleDevice.getConnection() == 1) {
                return bleDevice.getDevice();
            }
        }
        return null;
    }

    public BluetoothGatt getDeviceGatt(BluetoothDevice bluetoothDevice) {
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e == null) {
            return null;
        }
        return bleDeviceM27021e.getBluetoothGatt();
    }

    public BluetoothDevice getUsingBleDevice() {
        for (BleDevice bleDevice : this.f37574s.values()) {
            if (bleDevice.isConnected() && bleDevice.isUsing()) {
                return bleDevice.getDevice();
            }
        }
        return null;
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public boolean handleMessageEvent(@NonNull Message message) {
        BluetoothDevice bluetoothDevice;
        BleDevice bleDeviceM27021e;
        BluetoothGatt bluetoothGatt;
        BluetoothDevice bluetoothDevice2;
        BluetoothGatt deviceGatt;
        BluetoothDevice bluetoothDevice3;
        BleDevice bleDeviceM27021e2;
        switch (message.what) {
            case 12289:
                Object obj = message.obj;
                if (!(obj instanceof BluetoothDevice)) {
                    return false;
                }
                BluetoothDevice bluetoothDevice4 = (BluetoothDevice) obj;
                JL_Log.m27232d(this.TAG, "MSG_CONNECT_BLE_TIMEOUT", "device : " + printBtDeviceInfo(bluetoothDevice4));
                m27027i(bluetoothDevice4);
                break;
                break;
            case 12290:
                Object obj2 = message.obj;
                if (!(obj2 instanceof BluetoothDevice) || (bleDeviceM27021e = m27021e((bluetoothDevice = (BluetoothDevice) obj2))) == null || (bluetoothGatt = bleDeviceM27021e.getBluetoothGatt()) == null) {
                    return false;
                }
                JL_Log.m27232d(this.TAG, "MSG_DISCOVERY_SERVICE_TIMEOUT", "device : " + printBtDeviceInfo(bluetoothDevice));
                List<BluetoothGattService> services = bluetoothGatt.getServices();
                if (services != null && !services.isEmpty()) {
                    m26998a(bluetoothGatt, 0);
                } else if (!bleDeviceM27021e.isOverRetryLimit()) {
                    m27025g(bluetoothDevice);
                } else {
                    m27027i(bluetoothDevice);
                }
                break;
            case 12291:
                Object obj3 = message.obj;
                if (!(obj3 instanceof BluetoothDevice)) {
                    return false;
                }
                BluetoothDevice bluetoothDevice5 = (BluetoothDevice) obj3;
                JL_Log.m27232d(this.TAG, "MSG_ADJUST_BLE_MTU_TIMEOUT", "device: " + printBtDeviceInfo(bluetoothDevice5));
                m27016b(bluetoothDevice5);
                break;
                break;
            case 12292:
                Object obj4 = message.obj;
                if (!(obj4 instanceof BluetoothDevice) || (deviceGatt = getDeviceGatt((bluetoothDevice2 = (BluetoothDevice) obj4))) == null) {
                    return false;
                }
                JL_Log.m27232d(this.TAG, "MSG_DISCONNECT_BLE_TIMEOUT", "device: " + printBtDeviceInfo(bluetoothDevice2));
                m26997a(deviceGatt);
                m26990a(bluetoothDevice2, 0);
                break;
                break;
            case 12293:
                Object obj5 = message.obj;
                if (!(obj5 instanceof BluetoothDevice) || (bleDeviceM27021e2 = m27021e((bluetoothDevice3 = (BluetoothDevice) obj5))) == null) {
                    return false;
                }
                BleConnectParam connectParam = bleDeviceM27021e2.getConnectParam();
                JL_Log.m27232d(this.TAG, "MSG_RECONNECT_BLE", "device: " + printBtDeviceInfo(bluetoothDevice3));
                if (!connectBLEDevice(bluetoothDevice3, connectParam)) {
                    m26990a(bluetoothDevice3, 0);
                }
                break;
                break;
        }
        return super.handleMessageEvent(message);
    }

    public boolean isBleConnecting() {
        return getConnectingBleDevice() != null;
    }

    public boolean isConnectedBLEDevice(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        return m27023f(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public void onAdapterStatus(boolean z) {
        super.onAdapterStatus(z);
        if (z) {
            return;
        }
        JL_Log.m27236i(this.TAG, "ACTION_STATE_CHANGED", "Bluetooth is off.");
        m27018d();
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBreProfiles, com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public void release() {
        disconnectBLEDevice(getConnectingBleDevice());
        m27018d();
        m27015b();
        this.f37576u.clear();
        this.f37575t.release();
        super.release();
    }

    public void removeOnBtBleListener(OnBtBleListener onBtBleListener) {
        this.f37575t.removeCallback(onBtBleListener);
    }

    public boolean requestBleMtu(final BluetoothDevice bluetoothDevice, final int i) {
        if (isInvalidEnv("requestBleMtu", bluetoothDevice)) {
            return false;
        }
        final BluetoothGatt deviceGatt = getDeviceGatt(bluetoothDevice);
        if (deviceGatt == null) {
            JL_Log.m27240w(this.TAG, "requestBleMtu", "BluetoothGatt is null.");
            return false;
        }
        JL_Log.m27232d(this.TAG, "requestBleMtu", CommonUtil.formatString("Start requesting MTU[%d].", Integer.valueOf(i + 3)));
        runOnMainThread(new Runnable() { // from class: com.jieli.jl_bt_ota.impl.bt.XIi00iiXO
            @Override // java.lang.Runnable
            public final void run() {
                this.f37608IO.m26992a(bluetoothDevice, deviceGatt, i);
            }
        });
        return true;
    }

    public void sendBleData(BleSendParam bleSendParam) {
        m27010a(new BleSendTask(bleSendParam));
    }

    public boolean switchBleCharacteristic(BluetoothGatt bluetoothGatt, BleCharacteristic bleCharacteristic) {
        BluetoothBle bluetoothBle;
        byte[] bArr;
        boolean zM27012a = false;
        if (bleCharacteristic == null) {
            JL_Log.m27240w(this.TAG, "switchBleCharacteristic", "Invalid parameter.");
            return false;
        }
        if (bluetoothGatt == null) {
            JL_Log.m27240w(this.TAG, "switchBleCharacteristic", "BluetoothGatt is null.");
            return false;
        }
        if (isInvalidEnv("switchBleCharacteristic", bluetoothGatt.getDevice())) {
            return false;
        }
        JL_Log.m27232d(this.TAG, "switchBleCharacteristic", "" + bleCharacteristic);
        BluetoothGattService service = bluetoothGatt.getService(bleCharacteristic.getServiceUUID());
        if (service == null) {
            JL_Log.m27240w(this.TAG, "switchBleCharacteristic", "GattService is null.");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(bleCharacteristic.getCharacteristicUUID());
        if (characteristic == null) {
            JL_Log.m27240w(this.TAG, "switchBleCharacteristic", "GattCharacteristic is null.");
            return false;
        }
        BluetoothGattDescriptor bluetoothGattDescriptorM26986a = m26986a(characteristic, bleCharacteristic.getRequiredProperty());
        if (bluetoothGattDescriptorM26986a == null) {
            JL_Log.m27240w(this.TAG, "switchBleCharacteristic", "GattDescriptor is null.");
            return false;
        }
        try {
            zM27012a = bluetoothGatt.setCharacteristicNotification(characteristic, bleCharacteristic.isEnable());
        } catch (RuntimeException e) {
            JL_Log.m27240w(this.TAG, "switchBleCharacteristic", "Exception : " + e.getMessage());
        }
        if (zM27012a) {
            if (bleCharacteristic.isEnable()) {
                bArr = bleCharacteristic.getRequiredProperty() == 32 ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            } else {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            bluetoothBle = this;
            zM27012a = bluetoothBle.m27012a(bluetoothGatt, bluetoothGattDescriptorM26986a, bArr, 0, bleCharacteristic.getRetryLimit(), false);
        } else {
            bluetoothBle = this;
            JL_Log.m27232d(bluetoothBle.TAG, "switchBleCharacteristic", "BluetoothGatt#setCharacteristicNotification is failed.");
        }
        JL_Log.m27232d(bluetoothBle.TAG, "switchBleCharacteristic", "result : " + zM27012a);
        return zM27012a;
    }

    public void switchConnectedBleDevice(BluetoothDevice bluetoothDevice) {
        BluetoothDevice usingBleDevice = getUsingBleDevice();
        if (BluetoothUtil.deviceEquals(usingBleDevice, bluetoothDevice) || bluetoothDevice == null) {
            return;
        }
        BleDevice bleDeviceM27021e = m27021e(usingBleDevice);
        if (bleDeviceM27021e != null) {
            bleDeviceM27021e.setUsing(false);
        }
        BleDevice bleDeviceM27021e2 = m27021e(bluetoothDevice);
        if (bleDeviceM27021e2 != null) {
            bleDeviceM27021e2.setUsing(true);
            this.f37575t.onSwitchBleDevice(bluetoothDevice);
        }
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    public synchronized boolean writeBleData(BleSendParam bleSendParam) {
        boolean zWriteCharacteristic = false;
        if (bleSendParam == null) {
            JL_Log.m27240w(this.TAG, "writeBleData", "BleSendParam is null.");
            return false;
        }
        BluetoothGatt deviceGatt = getDeviceGatt(bleSendParam.getDevice());
        if (deviceGatt == null) {
            JL_Log.m27240w(this.TAG, "writeBleData", "Bluetooth gatt is close.");
            return false;
        }
        BluetoothGattService service = deviceGatt.getService(bleSendParam.getServiceUUID());
        if (service == null) {
            JL_Log.m27240w(this.TAG, "writeBleData", "Unable to find service");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(bleSendParam.getCharacteristicUUID());
        if (characteristic == null) {
            JL_Log.m27240w(this.TAG, "writeBleData", "Characteristic value not found.");
            return false;
        }
        if ((characteristic.getProperties() & 76) == 0) {
            JL_Log.m27240w(this.TAG, "writeBleData", "No available feature values.");
            return false;
        }
        byte[] data = bleSendParam.getData();
        if (data.length == 0) {
            JL_Log.m27240w(this.TAG, "writeBleData", "Data is null.");
            return false;
        }
        try {
            characteristic.setValue(data);
            int writeType = bleSendParam.getWriteType();
            if (writeType != 0 && writeType != characteristic.getWriteType()) {
                characteristic.setWriteType(writeType);
            }
            zWriteCharacteristic = deviceGatt.writeCharacteristic(characteristic);
        } catch (Exception e) {
            JL_Log.m27240w(this.TAG, "writeBleData", "IO Exception : " + e);
        }
        JL_Log.m27232d(this.TAG, "writeBleData", "Send data : " + zWriteCharacteristic);
        return zWriteCharacteristic;
    }

    /* JADX INFO: renamed from: e */
    private BleDevice m27021e(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return this.f37574s.get(bluetoothDevice.getAddress());
    }

    /* JADX INFO: renamed from: f */
    private void m27022f() {
        if (this.f37578w == null) {
            SendBleDataThread sendBleDataThread = new SendBleDataThread(new SendBleDataThread.IBleOperation() { // from class: com.jieli.jl_bt_ota.impl.bt.BluetoothBle.1
                @Override // com.jieli.jl_bt_ota.tool.ble.SendBleDataThread.IBleOperation
                public int getBleMtu(BluetoothDevice bluetoothDevice) {
                    return BluetoothBle.this.getBleMtu(bluetoothDevice);
                }

                @Override // com.jieli.jl_bt_ota.tool.ble.SendBleDataThread.IBleOperation
                public boolean writeBleData(BleSendParam bleSendParam) {
                    return BluetoothBle.this.writeBleData(bleSendParam);
                }
            }, new Consumer() { // from class: com.jieli.jl_bt_ota.impl.bt.XO0O10
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f37609IO.m27009a((ThreadState) obj);
                }
            });
            this.f37578w = sendBleDataThread;
            sendBleDataThread.start();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m27024g() {
        SendBleDataThread sendBleDataThread = this.f37578w;
        if (sendBleDataThread != null) {
            sendBleDataThread.stopThread();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m27019d(final BluetoothDevice bluetoothDevice) {
        if (this.f37576u.isEmpty()) {
            JL_Log.m27232d(this.TAG, "enableBleCharacteristic", "characteristicsTaskQueue is empty.");
            m27017c(bluetoothDevice);
            return;
        }
        final BleCharacteristic bleCharacteristicPeek = this.f37576u.peek();
        JL_Log.m27232d(this.TAG, "enableBleCharacteristic", "next task. " + bleCharacteristicPeek);
        runOnMainThread(new Runnable() { // from class: com.jieli.jl_bt_ota.impl.bt.iO
            @Override // java.lang.Runnable
            public final void run() {
                this.f37611IO.m26993a(bluetoothDevice, bleCharacteristicPeek);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m26992a(BluetoothDevice bluetoothDevice, BluetoothGatt bluetoothGatt, int i) {
        executeTimeoutTask(12291, bluetoothDevice, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        boolean zRequestMtu = bluetoothGatt.requestMtu(i + 3);
        JL_Log.m27232d(this.TAG, "requestBleMtu", CommonUtil.formatString("Request MTU operation result: %s", Boolean.valueOf(zRequestMtu)));
        if (zRequestMtu) {
            return;
        }
        m27016b(bluetoothDevice);
    }

    /* JADX INFO: renamed from: b */
    private void m27016b(BluetoothDevice bluetoothDevice) {
        m26991a(bluetoothDevice, 20, 0, true);
    }

    /* JADX INFO: renamed from: b */
    private void m27015b() {
        Context context;
        BluetoothBleReceiver bluetoothBleReceiver = this.f37577v;
        if (bluetoothBleReceiver == null || (context = this.mContext) == null) {
            return;
        }
        context.unregisterReceiver(bluetoothBleReceiver);
        this.f37577v = null;
    }

    /* JADX INFO: renamed from: a */
    private BleDevice m26987a(BluetoothDevice bluetoothDevice, BleConnectParam bleConnectParam) {
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e != null) {
            return bleDeviceM27021e;
        }
        BleDevice bleDevice = new BleDevice(bluetoothDevice, bleConnectParam);
        this.f37574s.put(bluetoothDevice.getAddress(), bleDevice);
        return bleDevice;
    }

    /* JADX INFO: renamed from: a */
    private void m26997a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || !CommonUtil.checkHasConnectPermission(this.mContext)) {
            return;
        }
        BluetoothUtil.refreshBleDeviceCache(this.mContext, bluetoothGatt);
        bluetoothGatt.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26991a(BluetoothDevice bluetoothDevice, int i, int i2, boolean z) {
        removeTimeoutTask(12291);
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e != null && i2 == 0) {
            bleDeviceM27021e.setBleMtu(i);
        }
        this.f37575t.onMtuChanged(getDeviceGatt(bluetoothDevice), i, i2);
        if (bleDeviceM27021e != null && bleDeviceM27021e.getConnection() == 1 && z) {
            m26996a(bluetoothDevice, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m26996a(BluetoothDevice bluetoothDevice, boolean z) {
        JL_Log.m27232d(this.TAG, "dealWithBleConnected", "device : " + bluetoothDevice + ", isNeedChangeMtu = " + z);
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e == null) {
            return;
        }
        if (z) {
            int requestMtu = bleDeviceM27021e.getConnectParam().getRequestMtu();
            if (bleDeviceM27021e.isConnectATT()) {
                bleDeviceM27021e.setBleMtu(requestMtu);
                this.f37575t.onMtuChanged(bleDeviceM27021e.getBluetoothGatt(), requestMtu, 0);
                m26996a(bluetoothDevice, false);
                return;
            } else if (requestBleMtu(bluetoothDevice, requestMtu)) {
                return;
            }
        }
        m26990a(bluetoothDevice, 2);
    }

    /* JADX INFO: renamed from: a */
    private BluetoothGattDescriptor m26986a(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null || (i & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(BluetoothConstant.UUID_CLIENT_CHARACTERISTIC_CONFIG);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    private boolean m27011a(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGatt == null || bluetoothGattDescriptor == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(2);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    private boolean m27012a(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr, int i, int i2, boolean z) {
        boolean value = !z ? bluetoothGattDescriptor.setValue(bArr) : z;
        if (!value) {
            return value;
        }
        boolean zM27011a = m27011a(bluetoothGatt, bluetoothGattDescriptor);
        JL_Log.m27232d(this.TAG, "tryToWriteDescriptor", "writeDescriptorWorkaround : " + zM27011a);
        if (!zM27011a) {
            int i3 = i + 1;
            if (i3 > i2) {
                JL_Log.m27232d(this.TAG, "tryToWriteDescriptor", CommonUtil.formatString("The number of failures exceeded the limit(%d).", Integer.valueOf(i2)));
                return false;
            }
            JL_Log.m27232d(this.TAG, "tryToWriteDescriptor", "retryCount : " + i3);
            SystemClock.sleep(100L);
            m27012a(bluetoothGatt, bluetoothGattDescriptor, bArr, i3, i2, true);
        }
        return zM27011a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27009a(ThreadState threadState) {
        SendBleDataThread sendBleDataThread;
        if (threadState.getState() == 0 && (sendBleDataThread = this.f37578w) != null && sendBleDataThread.getId() == threadState.getId()) {
            this.f37578w = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27010a(@NonNull BleSendTask bleSendTask) {
        OnBleSendDataCallback callback;
        if (((this.f37578w == null || !m27023f(bleSendTask.getDevice())) ? false : this.f37578w.addSendTask(bleSendTask)) || (callback = bleSendTask.getCallback()) == null) {
            return;
        }
        callback.onResult(bleSendTask.getDevice(), bleSendTask.getServiceUUID(), bleSendTask.getCharacteristicUUID(), false, bleSendTask.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26994a(BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2, int i, byte[] bArr) {
        SendBleDataThread sendBleDataThread = this.f37578w;
        if (sendBleDataThread == null || !sendBleDataThread.isRunning()) {
            return;
        }
        this.f37578w.wakeupSendThread(new BleSendTask(bluetoothDevice, uuid, uuid2, bArr).setStatus(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m26993a(BluetoothDevice bluetoothDevice, BleCharacteristic bleCharacteristic) {
        if (switchBleCharacteristic(getDeviceGatt(bluetoothDevice), bleCharacteristic)) {
            return;
        }
        JL_Log.m27232d(this.TAG, "enableBleCharacteristic", "Failed to enable characteristic.");
        m27027i(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26998a(BluetoothGatt bluetoothGatt, int i) {
        BluetoothDevice device;
        BleDevice bleDeviceM27021e;
        BluetoothGattCharacteristic characteristic;
        this.f37575t.onServicesDiscovered(bluetoothGatt, i);
        if (bluetoothGatt == null || bluetoothGatt.getServices() == null || bluetoothGatt.getDevice() == null || (bleDeviceM27021e = m27021e((device = bluetoothGatt.getDevice()))) == null) {
            return;
        }
        this.f37576u.clear();
        List<BleCharacteristic> bleCharacteristicList = bleDeviceM27021e.getConnectParam().getBleCharacteristicList();
        if (bleCharacteristicList.isEmpty()) {
            JL_Log.m27232d(this.TAG, "onBleServiceDiscovery", "none character list. Callback connection successful.");
            m27017c(device);
            return;
        }
        boolean z = false;
        for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            for (BleCharacteristic bleCharacteristic : bleCharacteristicList) {
                if (UuidUtil.equalUUID(bluetoothGattService.getUuid(), bleCharacteristic.getServiceUUID()) && (characteristic = bluetoothGattService.getCharacteristic(bleCharacteristic.getCharacteristicUUID())) != null && (characteristic.getProperties() & bleCharacteristic.getRequiredProperty()) != 0) {
                    boolean zHasProperty = bleCharacteristic.hasProperty(16);
                    boolean zHasProperty2 = bleCharacteristic.hasProperty(32);
                    if (zHasProperty || zHasProperty2) {
                        this.f37576u.add(bleCharacteristic);
                    }
                    z = true;
                }
            }
        }
        JL_Log.m27232d(this.TAG, "onBleServiceDiscovery", "isServiceFound : " + z);
        if (!z) {
            m27027i(device);
        } else {
            m27019d(device);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m26990a(BluetoothDevice bluetoothDevice, int i) {
        BleDevice bleDeviceM27021e = m27021e(bluetoothDevice);
        if (bleDeviceM27021e == null) {
            return;
        }
        int connection = bleDeviceM27021e.getConnection();
        JL_Log.m27232d(this.TAG, "notifyBleConnectStatus", "previousState = " + BluetoothUtil.printBtConnectionState(connection) + ", state = " + BluetoothUtil.printBtConnectionState(i) + ",\n " + bleDeviceM27021e);
        if (connection == i) {
            return;
        }
        if (i != 1) {
            if (BluetoothUtil.deviceEquals(bluetoothDevice, getConnectingBleDevice())) {
                removeTimeoutTask(12289);
            }
            if (BluetoothUtil.deviceEquals(bluetoothDevice, this.f37580y)) {
                removeTimeoutTask(12293);
                this.f37580y = null;
            }
            this.f37579x = 0L;
            this.f37576u.clear();
        }
        bleDeviceM27021e.setConnection(i);
        BluetoothDevice usingBleDevice = getUsingBleDevice();
        if (i == 0) {
            m27026h(bluetoothDevice);
            List<BluetoothDevice> connectedBleDevices = getConnectedBleDevices();
            if (connectedBleDevices.isEmpty()) {
                m27024g();
            } else if (BluetoothUtil.deviceEquals(usingBleDevice, bluetoothDevice)) {
                switchConnectedBleDevice(connectedBleDevices.get(connectedBleDevices.size() - 1));
            }
        } else if (i == 2) {
            if (usingBleDevice == null) {
                switchConnectedBleDevice(bluetoothDevice);
            }
            m27022f();
        }
        this.f37575t.onBleConnection(bluetoothDevice, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public void m26999a(@NonNull BluetoothGatt bluetoothGatt, int i, int i2) {
        BleDevice bleDeviceM27021e;
        this.f37575t.onConnectionStateChange(bluetoothGatt, i, i2);
        BluetoothDevice device = bluetoothGatt.getDevice();
        if (isInvalidEnv("handleBleConnection", device) || (bleDeviceM27021e = m27021e(device)) == null) {
            return;
        }
        if (i == 0 && i2 == 2) {
            bleDeviceM27021e.setBluetoothGatt(bluetoothGatt);
            executeTimeoutTask(12290, device, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            boolean zDiscoverServices = bluetoothGatt.discoverServices();
            JL_Log.m27232d(this.TAG, "handleBleConnection", "discoverServices : " + zDiscoverServices);
            if (zDiscoverServices) {
                return;
            }
            removeTimeoutTask(12290);
            m27027i(device);
            return;
        }
        boolean z = true;
        if (i2 == 1) {
            m26990a(device, 1);
            return;
        }
        if (i2 == 0) {
            removeTimeoutTask(12292);
            boolean zIsHasTimeoutTask = isHasTimeoutTask(12293);
            if (zIsHasTimeoutTask) {
                removeTimeoutTask(12293);
            }
            m26997a(bluetoothGatt);
            bleDeviceM27021e.setBluetoothGatt(null).setBleMtu(20);
            long jM27020e = m27020e();
            long j = this.f37579x;
            boolean z2 = j > 0;
            boolean z3 = z2 && jM27020e > j + 25000;
            if (i != 0) {
                JL_Log.m27236i(this.TAG, "handleBleConnection", "Error :(0x" + Integer.toHexString(i) + "): " + GattError.parseConnectionError(i));
            }
            if (!bleDeviceM27021e.isConnected()) {
                if (!zIsHasTimeoutTask && (i != 133 || !bleDeviceM27021e.getConnectParam().isReconnect() || !bleDeviceM27021e.getConnectParam().canRetry() || !z2 || z3)) {
                    z = false;
                }
                JL_Log.m27232d(this.TAG, "handleBleConnection", "mac : " + device + ", needReconnect : " + zIsHasTimeoutTask + ", canTimeout : " + z2 + ", timeout : " + z3 + ", isAllowReconnect = " + z);
                if (z) {
                    JL_Log.m27232d(this.TAG, "handleBleConnection", "retry connect ble.");
                    this.f37576u.clear();
                    if (this.f37580y != null && !BluetoothUtil.deviceEquals(this.f37580y, device)) {
                        JL_Log.m27232d(this.TAG, "handleBleConnection", "Successfully disconnected the previous device.");
                        m26990a(device, 0);
                    } else {
                        bleDeviceM27021e.setConnection(0);
                    }
                    BluetoothDevice bluetoothDevice = this.f37580y;
                    if (bluetoothDevice != null) {
                        device = bluetoothDevice;
                    }
                    executeTimeoutTask(12293, device, 2000L);
                    return;
                }
            }
            JL_Log.m27232d(this.TAG, "handleBleConnection", "callback device is disconnected.");
            m26990a(device, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26995a(BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2, boolean z) {
        BleCharacteristic bleCharacteristicPeek;
        if (!this.f37576u.isEmpty() && (bleCharacteristicPeek = this.f37576u.peek()) != null && bleCharacteristicPeek.getServiceUUID().equals(uuid) && bleCharacteristicPeek.getCharacteristicUUID().equals(uuid2)) {
            if (!z) {
                if (bleCharacteristicPeek.isOverLimit()) {
                    JL_Log.m27236i(this.TAG, "onBleNotificationStatus", "Failed to enable characteristic.");
                    m27027i(bluetoothDevice);
                    return;
                }
            } else {
                this.f37576u.poll();
            }
            m27019d(bluetoothDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27000a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        JL_Log.m27236i(this.TAG, "onCharacteristicChanged", CommonUtil.formatString("<<< device = %s, service = %s, characteristic = %s,\n data = [%s].", printBtDeviceInfo(bluetoothGatt.getDevice(), false), UuidUtil.read16BitUUID(bluetoothGattCharacteristic.getService().getUuid()), UuidUtil.read16BitUUID(bluetoothGattCharacteristic.getUuid()), CHexConver.byte2HexStr(bArr)));
        this.f37575t.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27001a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        JL_Log.m27236i(this.TAG, "onCharacteristicRead", CommonUtil.formatString("<<< device = %s, service = %s, characteristic = %s,\n data = [%s].", printBtDeviceInfo(bluetoothGatt.getDevice(), false), UuidUtil.read16BitUUID(bluetoothGattCharacteristic.getService().getUuid()), UuidUtil.read16BitUUID(bluetoothGattCharacteristic.getUuid()), CHexConver.byte2HexStr(bArr)));
        this.f37575t.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    /* JADX INFO: renamed from: a */
    private void m26989a() {
        if (this.f37577v != null || this.mContext == null) {
            return;
        }
        this.f37577v = new BluetoothBleReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        this.mContext.registerReceiver(this.f37577v, intentFilter);
    }
}
