package com.jieli.bluetooth_connect.impl;

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
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.jieli.bluetooth_connect.impl.BluetoothBle;
import com.jieli.bluetooth_connect.interfaces.IBluetoothBle;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtBleListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnThreadStateListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnWriteDataCallback;
import com.jieli.bluetooth_connect.tool.BleEventCbManager;
import com.jieli.bluetooth_connect.tool.SendBleDataThread;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.CHexConverter;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothBle implements IBluetoothBle {
    private static final int CALLBACK_TIMEOUT = 3000;
    private static final int FAILURE_LIMIT = 2;
    private static final int MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT = 13641;
    private static final int MSG_CONNECT_BLE_TIMEOUT = 13639;
    private static final int MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT = 13640;
    private static final int MSG_RECONNECT_BLE = 13642;
    private static final int RECONNECT_BLE_DELAY = 2000;
    private static final String TAG = "BluetoothBle";
    private long boundStartTime;
    private int failedCount;
    private final BleEventCbManager mBleEventCbManager;
    private int mBleNotificationCount;
    private BluetoothBleReceiver mBluetoothBleReceiver;
    private final BluetoothGattCallback mBluetoothGattCallback;
    private BluetoothOption mBluetoothOption;
    private final BluetoothPair mBluetoothPair;
    private volatile BluetoothDevice mBoundingBleDevice;
    private volatile BluetoothDevice mConnectedBleDevice;
    private volatile BluetoothDevice mConnectingBleDevice;
    private final Context mContext;
    private volatile BluetoothDevice mNeedReconnectBleDevice;
    private final OnBtDevicePairListener mOnBtDevicePairListener;
    private SendBleDataThread mSendBleDataThread;
    private int reconnectCount;
    private final List<BluetoothGatt> mBluetoothGatts = Collections.synchronizedList(new ArrayList());
    private final List<BluetoothDevice> mConnectedBleDevices = Collections.synchronizedList(new ArrayList());
    private final Map<String, Integer> mBleMtuMap = Collections.synchronizedMap(new HashMap());
    private final Map<String, Long> startTimeMap = new HashMap();
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.jieli.bluetooth_connect.impl.BluetoothBle.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        @SuppressLint({"MissingPermission"})
        public boolean handleMessage(@NonNull Message msg) {
            BluetoothDevice bluetoothDevice;
            BluetoothGatt deviceGatt;
            List<BluetoothGattService> services;
            switch (msg.what) {
                case BluetoothBle.MSG_CONNECT_BLE_TIMEOUT /* 13639 */:
                    BluetoothDevice bluetoothDevice2 = BluetoothBle.this.mConnectingBleDevice;
                    if (bluetoothDevice2 == null) {
                        Object obj = msg.obj;
                        if (obj instanceof BluetoothDevice) {
                            bluetoothDevice2 = (BluetoothDevice) obj;
                        }
                    }
                    if (bluetoothDevice2 != null) {
                        if (!BluetoothBle.this.isBleConnected(bluetoothDevice2)) {
                            BluetoothBle.this.notifyBleConnectStatus(bluetoothDevice2, 0);
                        }
                        BluetoothBle.this.setConnectingBleDevice(null);
                    }
                    return false;
                case BluetoothBle.MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT /* 13640 */:
                    Object obj2 = msg.obj;
                    if ((obj2 instanceof BluetoothDevice) && (deviceGatt = BluetoothBle.this.getDeviceGatt((bluetoothDevice = (BluetoothDevice) obj2))) != null && ConnectUtil.isHasConnectPermission(BluetoothBle.this.mContext)) {
                        BluetoothUtil.refreshBleDeviceCache(BluetoothBle.this.mContext, deviceGatt);
                        deviceGatt.close();
                        BluetoothBle.this.notifyBleConnectStatus(bluetoothDevice, 0);
                        BluetoothBle.this.removeDeviceFromRecord(bluetoothDevice, deviceGatt);
                    }
                    return false;
                case BluetoothBle.MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT /* 13641 */:
                    Object obj3 = msg.obj;
                    if (obj3 instanceof BluetoothDevice) {
                        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) obj3;
                        BluetoothGatt deviceGatt2 = BluetoothBle.this.getDeviceGatt(bluetoothDevice3);
                        if (deviceGatt2 == null || (services = deviceGatt2.getServices()) == null || services.isEmpty()) {
                            JL_Log.m26847d(BluetoothBle.TAG, "MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT", "discover services timeout.");
                            BluetoothBle.this.setNeedReconnectBleDevice(bluetoothDevice3);
                            if (!BluetoothBle.this.disconnectBLEDevice(bluetoothDevice3)) {
                                BluetoothBle.this.notifyBleConnectStatus(bluetoothDevice3, 0);
                            }
                        } else {
                            BluetoothBle.this.onBleServiceDiscovery(deviceGatt2, 0);
                        }
                    }
                    return false;
                case BluetoothBle.MSG_RECONNECT_BLE /* 13642 */:
                    Object obj4 = msg.obj;
                    if (obj4 instanceof BluetoothDevice) {
                        BluetoothDevice bluetoothDevice4 = (BluetoothDevice) obj4;
                        BluetoothBle.this.setConnectingBleDevice(null);
                        if (!BluetoothBle.this.connectBLEDevice(bluetoothDevice4)) {
                            BluetoothBle.this.notifyBleConnectStatus(bluetoothDevice4, 0);
                        }
                    }
                    return false;
                default:
                    return false;
            }
        }
    });

    public class BluetoothBleReceiver extends BroadcastReceiver {
        private BluetoothBleReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            action.getClass();
            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                JL_Log.m26851i(BluetoothBle.TAG, "ACTION_ACL_CONNECTED", "device : " + BluetoothBle.this.printDeviceInfo(bluetoothDevice));
                return;
            }
            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                JL_Log.m26851i(BluetoothBle.TAG, "ACTION_ACL_DISCONNECTED", "device : " + BluetoothBle.this.printDeviceInfo(bluetoothDevice2));
            }
        }
    }

    public BluetoothBle(Context context, BluetoothPair bluetoothPair, BluetoothOption option, OnBtBleListener listener) {
        OnBtDevicePairListener onBtDevicePairListener = new OnBtDevicePairListener() { // from class: com.jieli.bluetooth_connect.impl.BluetoothBle.3
            @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
            public void onAdapterStatus(boolean bEnabled, boolean bHasBle) {
                if (bEnabled) {
                    return;
                }
                BluetoothBle.this.clearDevices();
            }

            @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
            public void onBtDeviceBond(BluetoothDevice device, int status) {
                if (BluetoothUtil.deviceEquals(BluetoothBle.this.mBoundingBleDevice, device)) {
                    JL_Log.m26851i(BluetoothBle.TAG, "onBondStatus", "device : " + device + ", status : " + status);
                    if (status == 12) {
                        BluetoothBle.this.onBleBond(device, 12);
                        return;
                    }
                    if (status != 10) {
                        BluetoothBle.this.onBleBond(device, status);
                        return;
                    }
                    long jAbs = Math.abs(ConnectUtil.getCurrentTime() - BluetoothBle.this.boundStartTime);
                    BluetoothBle.access$1408(BluetoothBle.this);
                    if (jAbs < 5000 && BluetoothBle.this.failedCount <= 2) {
                        SystemClock.sleep(300L);
                        if (BluetoothBle.this.startBleBond(device)) {
                            JL_Log.m26851i(BluetoothBle.TAG, "onBondStatus", "restart bond ble device : " + device + ", failedCount ： " + BluetoothBle.this.failedCount);
                            return;
                        }
                    }
                    BluetoothBle.this.onBleBond(device, 10);
                }
            }

            @Override // com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener
            public void onPairError(BluetoothDevice device, ErrorInfo error) {
                if (BluetoothUtil.deviceEquals(BluetoothBle.this.mBoundingBleDevice, device)) {
                    BluetoothBle.this.onBleBond(device, 10);
                }
            }
        };
        this.mOnBtDevicePairListener = onBtDevicePairListener;
        this.mBluetoothGattCallback = new BluetoothGattCallback() { // from class: com.jieli.bluetooth_connect.impl.BluetoothBle.4
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
                super.onCharacteristicChanged(gatt, characteristic);
                BluetoothBle.this.mBleEventCbManager.onCharacteristicChanged(gatt, characteristic);
                if (gatt == null || characteristic == null || characteristic.getService() == null) {
                    return;
                }
                BluetoothDevice device = gatt.getDevice();
                UUID uuid = characteristic.getService().getUuid();
                UUID uuid2 = characteristic.getUuid();
                byte[] value = characteristic.getValue();
                JL_Log.m26846d(BluetoothBle.TAG, ConnectUtil.formatString("[onCharacteristicChanged] <<< device : %s, characteristic = %s, data = %s ", BluetoothBle.this.printDeviceInfo(device, false), characteristic, CHexConverter.byte2HexStr(value)));
                BluetoothBle.this.mBleEventCbManager.onBleDataNotify(device, uuid, uuid2, value);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
                super.onCharacteristicRead(gatt, characteristic, status);
                JL_Log.m26846d(BluetoothBle.TAG, ConnectUtil.formatString("[onCharacteristicRead] <<< device : %s, characteristic = %s, data = %s ", BluetoothBle.this.printDeviceInfo(gatt.getDevice(), false), characteristic, CHexConverter.byte2HexStr(characteristic.getValue())));
                BluetoothBle.this.mBleEventCbManager.onCharacteristicRead(gatt, characteristic, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
                BluetoothDevice device;
                super.onCharacteristicWrite(gatt, characteristic, status);
                if (gatt == null || (device = gatt.getDevice()) == null || characteristic == null || characteristic.getService() == null) {
                    return;
                }
                BluetoothBle.this.mBleEventCbManager.onCharacteristicWrite(gatt, characteristic, status);
                JL_Log.m26850i(BluetoothBle.TAG, ConnectUtil.formatString("[onCharacteristicWrite] >>> device : %s, characteristic = %s, status = %d ", BluetoothBle.this.printDeviceInfo(gatt.getDevice(), false), characteristic.getUuid(), Integer.valueOf(status)));
                UUID uuid = characteristic.getService().getUuid();
                UUID uuid2 = characteristic.getUuid();
                byte[] value = characteristic.getValue();
                BluetoothBle.this.wakeUpSendDataThread(device, uuid, uuid2, status, value);
                BluetoothBle.this.mBleEventCbManager.onBleWriteStatus(gatt.getDevice(), uuid, uuid2, value, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
                if (gatt == null) {
                    JL_Log.m26855w(BluetoothBle.TAG, "onConnectionStateChange", "No Gatt.");
                    return;
                }
                BluetoothDevice device = gatt.getDevice();
                if (device == null) {
                    JL_Log.m26855w(BluetoothBle.TAG, "onConnectionStateChange", "No Device.");
                    return;
                }
                BluetoothBle.this.mBleEventCbManager.onConnectionStateChange(gatt, status, newState);
                JL_Log.m26849e(BluetoothBle.TAG, "onConnectionStateChange", "ble ConnectionStateChange device : " + BluetoothBle.this.printDeviceInfo(device) + ", status : " + BluetoothConstant.printBtConnection(status) + " newState : " + newState);
                BluetoothBle.this.handleBleConnection(gatt, device, status, newState);
            }

            public void onConnectionUpdated(final BluetoothGatt gatt, int interval, int latency, int timeout, int status) {
                if (gatt == null) {
                    return;
                }
                BluetoothDevice device = gatt.getDevice();
                JL_Log.m26849e(BluetoothBle.TAG, "onConnectionUpdated", "device :" + BluetoothBle.this.printDeviceInfo(device) + " , interval : " + interval + ", latency : " + latency + ", timeout : " + timeout + ", status : " + BluetoothConstant.printBtConnection(status));
                BluetoothBle.this.mBleEventCbManager.onConnectionUpdatedCallback(gatt, interval, latency, timeout, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
                BluetoothBle.this.mBleEventCbManager.onDescriptorRead(gatt, descriptor, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
                UUID uuid;
                UUID uuid2;
                super.onDescriptorWrite(gatt, descriptor, status);
                BluetoothBle.this.mBleEventCbManager.onDescriptorWrite(gatt, descriptor, status);
                BluetoothGattCharacteristic characteristic = descriptor.getCharacteristic();
                if (characteristic != null) {
                    uuid = characteristic.getUuid();
                    uuid2 = characteristic.getService().getUuid();
                } else {
                    uuid = null;
                    uuid2 = null;
                }
                String str = BluetoothBle.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("UUID = ");
                sb.append(uuid != null ? uuid.toString() : "");
                sb.append(", status = ");
                sb.append(status);
                JL_Log.m26851i(str, "onDescriptorWrite", sb.toString());
                BluetoothBle.this.onBleNotificationStatus(gatt.getDevice(), uuid2, uuid, status == 0);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
                BluetoothDevice device;
                super.onMtuChanged(gatt, mtu, status);
                if (gatt == null || (device = gatt.getDevice()) == null) {
                    return;
                }
                BluetoothBle.this.mBleEventCbManager.onMtuChanged(gatt, mtu, status);
                if (status == 0) {
                    int i = mtu - 3;
                    BluetoothBle.this.addBleMtu(device, i);
                    JL_Log.m26849e(BluetoothBle.TAG, "onMtuChanged", "realMtu : " + i);
                }
                BluetoothBle.this.mBleEventCbManager.onBleMtuChanged(device, BluetoothBle.this.getBleMtu(device), status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 26)
            public void onPhyRead(BluetoothGatt gatt, int txPhy, int rxPhy, int status) {
                JL_Log.m26847d(BluetoothBle.TAG, "onPhyRead", ConnectUtil.formatString("txPhy = %d, rxPhy = %d, status = %d", Integer.valueOf(txPhy), Integer.valueOf(rxPhy), Integer.valueOf(status)));
                BluetoothBle.this.mBleEventCbManager.onPhyRead(gatt, txPhy, rxPhy, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 26)
            public void onPhyUpdate(BluetoothGatt gatt, int txPhy, int rxPhy, int status) {
                JL_Log.m26847d(BluetoothBle.TAG, "onPhyUpdate", ConnectUtil.formatString("txPhy = %d, rxPhy = %d, status = %d", Integer.valueOf(txPhy), Integer.valueOf(rxPhy), Integer.valueOf(status)));
                BluetoothBle.this.mBleEventCbManager.onPhyUpdate(gatt, txPhy, rxPhy, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status) {
                BluetoothBle.this.mBleEventCbManager.onReadRemoteRssi(gatt, rssi, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onReliableWriteCompleted(BluetoothGatt gatt, int status) {
                super.onReliableWriteCompleted(gatt, status);
                if (gatt == null) {
                    return;
                }
                JL_Log.m26851i(BluetoothBle.TAG, "onReliableWriteCompleted", "device : " + BluetoothBle.this.printDeviceInfo(gatt.getDevice(), false));
                BluetoothBle.this.mBleEventCbManager.onReliableWriteCompleted(gatt, status);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @RequiresApi(api = 31)
            public void onServiceChanged(@NonNull BluetoothGatt gatt) {
                BluetoothBle.this.mBleEventCbManager.onServiceChanged(gatt);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt gatt, int status) {
                super.onServicesDiscovered(gatt, status);
                BluetoothBle.this.mHandler.removeMessages(BluetoothBle.MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
                BluetoothUtil.printBleGattServices(BluetoothBle.this.mContext, gatt.getDevice(), gatt, status);
                BluetoothBle.this.onBleServiceDiscovery(gatt, status);
            }
        };
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        BluetoothPair bluetoothPair2 = (BluetoothPair) ConnectUtil.checkNotNull(bluetoothPair);
        this.mBluetoothPair = bluetoothPair2;
        bluetoothPair2.addListener(onBtDevicePairListener);
        this.mBleEventCbManager = new BleEventCbManager();
        this.mBluetoothOption = option == null ? BluetoothOption.createDefaultOption() : option;
        addListener(listener);
        registerReceiver();
    }

    public static /* synthetic */ void OXO1(BluetoothBle bluetoothBle, BluetoothDevice bluetoothDevice) {
        bluetoothBle.mBleNotificationCount = 0;
        if (bluetoothBle.enableBLEDeviceNotification(bluetoothDevice, bluetoothBle.mBluetoothOption.getBleServiceUUID(), bluetoothBle.mBluetoothOption.getBleNotificationUUID())) {
            return;
        }
        bluetoothBle.disconnectBLEDevice(bluetoothDevice);
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothBle bluetoothBle, BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2) {
        int i = bluetoothBle.mBleNotificationCount + 1;
        bluetoothBle.mBleNotificationCount = i;
        if (i >= 5) {
            bluetoothBle.mBleNotificationCount = 0;
            bluetoothBle.disconnectBLEDevice(bluetoothDevice);
        } else {
            if (bluetoothBle.enableBLEDeviceNotification(bluetoothDevice, uuid, uuid2)) {
                return;
            }
            bluetoothBle.disconnectBLEDevice(bluetoothDevice);
        }
    }

    public static /* synthetic */ int access$1408(BluetoothBle bluetoothBle) {
        int i = bluetoothBle.failedCount;
        bluetoothBle.failedCount = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBleMtu(BluetoothDevice device, int mtu) {
        int bleMtu = BluetoothUtil.formatBleMtu(mtu);
        if (device == null || !isConnectedBleDevice(device)) {
            return;
        }
        this.mBleMtuMap.put(device.getAddress(), Integer.valueOf(bleMtu));
    }

    private void addSendTask(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        OnWriteDataCallback onWriteDataCallback;
        boolean zAddSendTask;
        SendBleDataThread sendBleDataThread = this.mSendBleDataThread;
        if (sendBleDataThread != null) {
            zAddSendTask = sendBleDataThread.addSendTask(device, serviceUUID, characteristicUUID, data, callback);
            onWriteDataCallback = callback;
        } else {
            onWriteDataCallback = callback;
            zAddSendTask = false;
        }
        if (zAddSendTask || onWriteDataCallback == null) {
            return;
        }
        onWriteDataCallback.onBleResult(device, serviceUUID, characteristicUUID, false, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void clearDevices() {
        for (BluetoothDevice bluetoothDevice : new ArrayList(this.mConnectedBleDevices)) {
            BluetoothGatt deviceGatt = getDeviceGatt(bluetoothDevice);
            if (deviceGatt != null) {
                if (ConnectUtil.isHasConnectPermission(this.mContext) && BluetoothUtil.isBluetoothEnable()) {
                    deviceGatt.disconnect();
                    deviceGatt.close();
                }
                this.mBleEventCbManager.onBleConnection(bluetoothDevice, 0);
            }
        }
        this.mConnectedBleDevices.clear();
        this.mBluetoothGatts.clear();
        this.mBleMtuMap.clear();
        setConnectedBleDevice(null);
        setConnectingBleDevice(null);
        stopSendDataThread();
    }

    @SuppressLint({"MissingPermission"})
    private boolean connectBluetoothGatt(BluetoothDevice device) {
        long jLongValue;
        String str = TAG;
        JL_Log.m26851i(str, "connectBluetoothGatt", "");
        if (device == null || !ConnectUtil.isHasConnectPermission(this.mContext)) {
            JL_Log.m26855w(str, "connectBluetoothGatt", "device is null");
            return false;
        }
        BluetoothGatt bluetoothGattConnectGatt = device.connectGatt(this.mContext, this.mBluetoothOption.isAutoConnectBle(), this.mBluetoothGattCallback, 2);
        if (bluetoothGattConnectGatt == null) {
            JL_Log.m26851i(str, "connectBluetoothGatt", "bluetoothGatt is null.");
            notifyBleConnectStatus(device, 0);
            return false;
        }
        if (this.mBluetoothOption.isAutoConnectBle() && !bluetoothGattConnectGatt.connect()) {
            JL_Log.m26851i(str, "connectBluetoothGatt", "Failed to auto connect.");
            return false;
        }
        Long l = this.startTimeMap.get(device.getAddress());
        if (l == null) {
            jLongValue = ConnectUtil.getCurrentTime();
            this.startTimeMap.put(device.getAddress(), Long.valueOf(jLongValue));
        } else {
            jLongValue = l.longValue();
        }
        if (!this.mBluetoothGatts.contains(bluetoothGattConnectGatt)) {
            this.mBluetoothGatts.add(bluetoothGattConnectGatt);
        }
        JL_Log.m26851i(str, "connectBluetoothGatt", "start ble connect. startTime : " + jLongValue);
        return true;
    }

    private void dealWithBleConnected(BluetoothDevice device) {
        if (this.mBluetoothOption.isUseBleBondWay()) {
            startBleBond(device);
        }
        notifyBleConnectStatus(device, 2);
    }

    @SuppressLint({"MissingPermission"})
    private boolean discoverBLEDeviceServices(BluetoothDevice device) {
        String str = TAG;
        JL_Log.m26851i(str, "discoverBLEDeviceServices", "device : " + device);
        if (!ConnectUtil.isHasConnectPermission(this.mContext)) {
            return false;
        }
        BluetoothGatt deviceGatt = getDeviceGatt(device);
        if (deviceGatt == null) {
            JL_Log.m26851i(str, "discoverBLEDeviceServices", "no bluetoothGatt");
            return false;
        }
        boolean zDiscoverServices = deviceGatt.discoverServices();
        JL_Log.m26851i(str, "discoverBLEDeviceServices", "discoverServices ---> " + zDiscoverServices);
        return zDiscoverServices;
    }

    @SuppressLint({"MissingPermission"})
    private boolean enableBLEDeviceNotification(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID) {
        boolean characteristicNotification;
        boolean z = false;
        if (!ConnectUtil.isHasConnectPermission(this.mContext)) {
            JL_Log.m26855w(TAG, "enableBLEDeviceNotification", "no connect permission.");
            return false;
        }
        BluetoothGatt deviceGatt = getDeviceGatt(device);
        if (deviceGatt == null) {
            JL_Log.m26855w(TAG, "enableBLEDeviceNotification", "No Gatt.");
            return false;
        }
        BluetoothGattService service = deviceGatt.getService(serviceUUID);
        if (service == null) {
            JL_Log.m26855w(TAG, "enableBLEDeviceNotification", "No Gatt Service.");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicUUID);
        if (characteristic == null) {
            JL_Log.m26855w(TAG, "enableBLEDeviceNotification", "No Gatt Characteristic.");
            return false;
        }
        try {
            characteristicNotification = deviceGatt.setCharacteristicNotification(characteristic, true);
            try {
                if (characteristicNotification) {
                    BluetoothGattDescriptor descriptor = characteristic.getDescriptor(BluetoothConstant.UUID_CLIENT_CHARACTERISTIC_CONFIG);
                    if (descriptor != null) {
                        characteristicNotification = tryToWriteDescriptor(deviceGatt, descriptor, 0, false);
                    }
                } else {
                    JL_Log.m26855w(TAG, "enableBLEDeviceNotification", "setCharacteristicNotification failed.");
                }
            } catch (Exception e) {
                e = e;
                z = characteristicNotification;
                JL_Log.m26849e(TAG, "enableBLEDeviceNotification", "exception : " + e.getMessage());
                e.printStackTrace();
                characteristicNotification = z;
            }
        } catch (Exception e2) {
            e = e2;
        }
        JL_Log.m26855w(TAG, "enableBLEDeviceNotification", "" + characteristicNotification);
        return characteristicNotification;
    }

    private void handleACLConnection(BluetoothDevice device, int status) {
        if (BluetoothUtil.deviceEquals(this.mConnectingBleDevice, device) && status == 2 && !isConnectedBleDevice(device)) {
            connectBluetoothGatt(device);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void handleBleConnection(BluetoothGatt gatt, BluetoothDevice device, int status, int newState) {
        if (status == 0 && newState != 0) {
            if (newState != 2) {
                if (newState == 1) {
                    notifyBleConnectStatus(device, 1);
                    return;
                }
                return;
            }
            if (!this.mBluetoothGatts.contains(gatt)) {
                this.mBluetoothGatts.add(gatt);
            }
            if (!this.mConnectedBleDevices.contains(device)) {
                this.mConnectedBleDevices.add(device);
                addBleMtu(device, 20);
            }
            if (!discoverBLEDeviceServices(device)) {
                disconnectBLEDevice(device);
                return;
            }
            this.mHandler.removeMessages(MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT, device), 3000L);
            return;
        }
        this.mHandler.removeMessages(MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT);
        this.mHandler.removeMessages(MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
        removeDeviceFromRecord(device, gatt);
        BluetoothUtil.refreshBleDeviceCache(this.mContext, gatt);
        if (ConnectUtil.isHasConnectPermission(this.mContext)) {
            gatt.close();
        }
        long currentTime = ConnectUtil.getCurrentTime();
        Long l = this.startTimeMap.get(device.getAddress());
        long jLongValue = currentTime - (l == null ? 0L : l.longValue());
        long j = 30000 - jLongValue;
        this.reconnectCount++;
        boolean z = this.mBluetoothOption.isReconnect() && jLongValue < 30000 && jLongValue <= j && this.reconnectCount < 2;
        String str = TAG;
        JL_Log.m26851i(str, "handleBleConnection", "usedTime : " + jLongValue + ", leftConnectTime : " + j + ", isAllowReconnect : " + z + ", reconnectCount = " + this.reconnectCount);
        if (z && (status == 133 || BluetoothUtil.deviceEquals(device, this.mNeedReconnectBleDevice))) {
            JL_Log.m26851i(str, "handleBleConnection", "found connect device. retry...");
            reconnectBleDevice(device);
        } else {
            JL_Log.m26855w(str, "handleBleConnection", "callback device is disconnected.");
            notifyBleConnectStatus(device, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBleConnectStatus(BluetoothDevice device, int status) {
        BluetoothGatt deviceGatt;
        if (status != 1) {
            if (BluetoothUtil.deviceEquals(device, this.mConnectingBleDevice)) {
                setConnectingBleDevice(null);
                this.mHandler.removeMessages(MSG_CONNECT_BLE_TIMEOUT);
            }
            if (device != null) {
                this.startTimeMap.remove(device.getAddress());
            }
            if (BluetoothUtil.deviceEquals(device, this.mNeedReconnectBleDevice)) {
                setNeedReconnectBleDevice(null);
                this.mHandler.removeMessages(MSG_RECONNECT_BLE);
            }
            this.mBleNotificationCount = 0;
            this.reconnectCount = 0;
            if (status == 2) {
                if (this.mConnectedBleDevice == null) {
                    setConnectedBleDevice(device);
                }
                startSendDataThread();
            } else if (status == 0) {
                if (this.mConnectedBleDevices.remove(device) && (deviceGatt = getDeviceGatt(device)) != null) {
                    this.mBluetoothGatts.remove(deviceGatt);
                }
                if (this.mConnectedBleDevices.isEmpty()) {
                    setConnectedBleDevice(null);
                    stopSendDataThread();
                } else if (BluetoothUtil.deviceEquals(this.mConnectedBleDevice, device)) {
                    List<BluetoothDevice> list = this.mConnectedBleDevices;
                    setConnectedBleDevice(list.get(list.size() - 1));
                }
            }
        }
        JL_Log.m26851i(TAG, "notifyBleConnectStatus", "status : " + status);
        this.mBleEventCbManager.onBleConnection(device, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBleBond(final BluetoothDevice device, final int status) {
        if (status != 11 && BluetoothUtil.deviceEquals(device, this.mBoundingBleDevice)) {
            this.failedCount = 0;
            this.boundStartTime = 0L;
            this.mBoundingBleDevice = null;
        }
        this.mBleEventCbManager.onBleBond(device, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, boolean bEnabled) {
        this.mBleEventCbManager.onBleNotificationStatus(device, serviceUuid, characteristicUuid, bEnabled);
        if (serviceUuid == null || !serviceUuid.equals(this.mBluetoothOption.getBleServiceUUID()) || characteristicUuid == null || !characteristicUuid.equals(this.mBluetoothOption.getBleNotificationUUID())) {
            return;
        }
        if (bEnabled) {
            dealWithBleConnected(device);
        } else {
            JL_Log.m26855w(TAG, "onBleNotificationStatus", ConnectUtil.formatString("device : %s, serviceUuid : %s, characteristicUuid : %s, mBleNotificationCount : %d", device, serviceUuid, characteristicUuid, Integer.valueOf(this.mBleNotificationCount)));
            this.mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OiOOOi
                @Override // java.lang.Runnable
                public final void run() {
                    BluetoothBle.XIi00iiXO(this.f3749IO, device, serviceUuid, characteristicUuid);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBleServiceDiscovery(BluetoothGatt gatt, int status) {
        boolean z;
        this.mBleEventCbManager.onServicesDiscovered(gatt, status);
        if (gatt == null || gatt.getServices() == null || gatt.getDevice() == null) {
            return;
        }
        final BluetoothDevice device = gatt.getDevice();
        if (this.mBluetoothOption.isOnlyConnect()) {
            JL_Log.m26855w(TAG, "onBleServiceDiscovery", "isOnlyConnect : true, notify ble connected ok.");
            dealWithBleConnected(device);
            return;
        }
        List<BluetoothGattService> services = gatt.getServices();
        Iterator<BluetoothGattService> it = services.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            BluetoothGattService next = it.next();
            if (next.getUuid().equals(this.mBluetoothOption.getBleServiceUUID()) && next.getCharacteristic(this.mBluetoothOption.getBleWriteUUID()) != null && next.getCharacteristic(this.mBluetoothOption.getBleNotificationUUID()) != null) {
                z = true;
                break;
            }
        }
        JL_Log.m26855w(TAG, "onBleServiceDiscovery", "bServiceFound : " + z);
        if (z) {
            this.mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IO1iO0iiI
                @Override // java.lang.Runnable
                public final void run() {
                    BluetoothBle.OXO1(this.f1783IO, device);
                }
            });
            return;
        }
        if (services.isEmpty()) {
            setNeedReconnectBleDevice(device);
        }
        disconnectBLEDevice(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String printDeviceInfo(BluetoothDevice device, boolean isDetail) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device, isDetail);
    }

    private void reconnectBleDevice(BluetoothDevice device) {
        this.mHandler.removeMessages(MSG_RECONNECT_BLE);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(MSG_RECONNECT_BLE, device), 2000L);
        if (BluetoothUtil.deviceEquals(device, this.mNeedReconnectBleDevice)) {
            setNeedReconnectBleDevice(null);
        }
    }

    private void registerReceiver() {
        if (this.mBluetoothBleReceiver == null) {
            this.mBluetoothBleReceiver = new BluetoothBleReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            this.mContext.registerReceiver(this.mBluetoothBleReceiver, intentFilter);
        }
    }

    private void removeBleMtu(BluetoothDevice device) {
        if (device != null) {
            this.mBleMtuMap.remove(device.getAddress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeDeviceFromRecord(BluetoothDevice device, BluetoothGatt gatt) {
        BluetoothDevice bluetoothDevice;
        boolean z = false;
        if (device == null) {
            return false;
        }
        Iterator it = new ArrayList(this.mConnectedBleDevices).iterator();
        while (true) {
            if (!it.hasNext()) {
                bluetoothDevice = null;
                break;
            }
            bluetoothDevice = (BluetoothDevice) it.next();
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(device.getAddress())) {
                z = true;
                break;
            }
        }
        if (bluetoothDevice != null) {
            removeBleMtu(bluetoothDevice);
            this.mConnectedBleDevices.remove(bluetoothDevice);
        }
        if (gatt != null && this.mBluetoothGatts.contains(gatt)) {
            JL_Log.m26849e(TAG, "removeDeviceFromRecord", "remove gatt : " + gatt.getDevice());
            this.mBluetoothGatts.remove(gatt);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectingBleDevice(BluetoothDevice connectingBleDevice) {
        this.mConnectingBleDevice = connectingBleDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedReconnectBleDevice(BluetoothDevice device) {
        this.mNeedReconnectBleDevice = device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startBleBond(BluetoothDevice device) {
        if (device == null) {
            return false;
        }
        boolean zIsPaired = this.mBluetoothPair.isPaired(device);
        String str = TAG;
        JL_Log.m26851i(str, "startBleBond", "isPaired : " + zIsPaired);
        if (zIsPaired) {
            onBleBond(device, 12);
            return true;
        }
        boolean zTryToPair = this.mBluetoothPair.tryToPair(device);
        JL_Log.m26851i(str, "startBleBond", "isStartBond : " + zTryToPair);
        if (!zTryToPair) {
            onBleBond(device, 10);
            return false;
        }
        this.failedCount = 0;
        this.boundStartTime = ConnectUtil.getCurrentTime();
        this.mBoundingBleDevice = device;
        return true;
    }

    private void startSendDataThread() {
        if (this.mSendBleDataThread == null) {
            SendBleDataThread sendBleDataThread = new SendBleDataThread(this, new OnThreadStateListener() { // from class: com.jieli.bluetooth_connect.impl.BluetoothBle.2
                @Override // com.jieli.bluetooth_connect.interfaces.listener.OnThreadStateListener
                public void onEnd(long id, String name) {
                    BluetoothBle.this.mSendBleDataThread = null;
                }

                @Override // com.jieli.bluetooth_connect.interfaces.listener.OnThreadStateListener
                public void onStart(long id, String name) {
                }
            });
            this.mSendBleDataThread = sendBleDataThread;
            sendBleDataThread.start();
        }
    }

    private void stopSendDataThread() {
        SendBleDataThread sendBleDataThread = this.mSendBleDataThread;
        if (sendBleDataThread != null) {
            sendBleDataThread.stopThread();
        }
    }

    @SuppressLint({"MissingPermission"})
    private boolean tryToWriteDescriptor(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor descriptor, int retryCount, boolean isSkipSetValue) {
        if (!ConnectUtil.isHasConnectPermission(this.mContext)) {
            return false;
        }
        if (!isSkipSetValue) {
            isSkipSetValue = descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            String str = TAG;
            JL_Log.m26851i(str, "tryToWriteDescriptor", "setValue ---> " + isSkipSetValue);
            if (isSkipSetValue) {
                retryCount = 0;
            } else {
                retryCount++;
                if (retryCount >= 3) {
                    return false;
                }
                JL_Log.m26851i(str, "tryToWriteDescriptor", "setValue failed. retryCount : " + retryCount + ", isSkipSetValue :  false");
                SystemClock.sleep(50L);
                tryToWriteDescriptor(bluetoothGatt, descriptor, retryCount, false);
            }
        }
        if (isSkipSetValue) {
            isSkipSetValue = bluetoothGatt.writeDescriptor(descriptor);
            String str2 = TAG;
            JL_Log.m26851i(str2, "tryToWriteDescriptor", "writeDescriptor ---> " + isSkipSetValue);
            if (!isSkipSetValue) {
                int i = retryCount + 1;
                if (i >= 3) {
                    return false;
                }
                JL_Log.m26851i(str2, "tryToWriteDescriptor", "writeDescriptor failed. retryCount : " + i + ", isSkipSetValue :  true");
                SystemClock.sleep(50L);
                tryToWriteDescriptor(bluetoothGatt, descriptor, i, true);
            }
        }
        return isSkipSetValue;
    }

    private void unregisterReceiver() {
        BluetoothBleReceiver bluetoothBleReceiver = this.mBluetoothBleReceiver;
        if (bluetoothBleReceiver != null) {
            this.mContext.unregisterReceiver(bluetoothBleReceiver);
            this.mBluetoothBleReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wakeUpSendDataThread(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, int status, byte[] data) {
        if (this.mSendBleDataThread != null) {
            SendBleDataThread.BleSendTask bleSendTask = new SendBleDataThread.BleSendTask(device, serviceUUID, characteristicUUID, data, null);
            bleSendTask.setStatus(status);
            this.mSendBleDataThread.wakeupSendThread(bleSendTask);
        }
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public boolean connectBLEDevice(BluetoothDevice device) {
        if (device == null || !ConnectUtil.isHasConnectPermission(this.mContext)) {
            JL_Log.m26855w(TAG, "connectBLEDevice", "connect to ble device is null");
            return false;
        }
        String str = TAG;
        JL_Log.m26847d(str, "connectBLEDevice", "device : " + printDeviceInfo(device));
        BluetoothDevice connectingBleDevice = getConnectingBleDevice();
        if (connectingBleDevice != null) {
            JL_Log.m26855w(str, "connectBLEDevice", "Device is connecting. connectingDev : " + printDeviceInfo(connectingBleDevice));
            return false;
        }
        if (isConnectedBleDevice(device)) {
            JL_Log.m26855w(str, "connectBLEDevice", "BLE is connected.");
            notifyBleConnectStatus(device, 2);
            return true;
        }
        JL_Log.m26847d(str, "connectBLEDevice", "isUseMultiDevice : " + this.mBluetoothOption.isUseMultiDevice());
        if (!this.mBluetoothOption.isUseMultiDevice()) {
            BluetoothDevice connectedBleDevice = getConnectedBleDevice();
            JL_Log.m26847d(str, "connectBLEDevice", "connectedDevice : " + printDeviceInfo(connectedBleDevice));
            if (connectedBleDevice != null && !BluetoothUtil.deviceEquals(connectedBleDevice, device)) {
                disconnectBLEDevice(connectedBleDevice);
                SystemClock.sleep(300L);
            }
        }
        setConnectingBleDevice(device);
        this.mHandler.removeMessages(MSG_CONNECT_BLE_TIMEOUT);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(MSG_CONNECT_BLE_TIMEOUT, device), 30000L);
        boolean zConnectBluetoothGatt = connectBluetoothGatt(device);
        if (!zConnectBluetoothGatt) {
            notifyBleConnectStatus(device, 0);
        }
        return zConnectBluetoothGatt;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        JL_Log.m26847d(TAG, "destroy", "");
        clearDevices();
        this.mBleEventCbManager.destroy();
        this.startTimeMap.clear();
        unregisterReceiver();
        this.mBluetoothPair.removeListener(this.mOnBtDevicePairListener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public boolean disconnectBLEDevice(BluetoothDevice device) {
        if (!ConnectUtil.isHasConnectPermission(this.mContext)) {
            return false;
        }
        String str = TAG;
        JL_Log.m26847d(str, "disconnectBLEDevice", "device : " + printDeviceInfo(device));
        try {
            if (!BluetoothUtil.isBluetoothEnable()) {
                JL_Log.m26855w(str, "disconnectBLEDevice", "bluetooth is close.");
                return false;
            }
            BluetoothGatt deviceGatt = getDeviceGatt(device);
            if (deviceGatt == null) {
                JL_Log.m26855w(str, "disconnectBLEDevice", "no bluetoothGatt");
                return false;
            }
            JL_Log.m26849e(str, "disconnectBLEDevice", "disconnect");
            deviceGatt.disconnect();
            this.mHandler.removeMessages(MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT, device), 3000L);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public int getBleMtu(BluetoothDevice device) {
        Integer numValueOf;
        if (device == null || (numValueOf = this.mBleMtuMap.get(device.getAddress())) == null) {
            return 0;
        }
        if (numValueOf.intValue() >= 128) {
            numValueOf = Integer.valueOf(numValueOf.intValue() - 6);
        }
        return numValueOf.intValue();
    }

    public BluetoothPair getBluetoothPair() {
        return this.mBluetoothPair;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public BluetoothDevice getConnectedBleDevice() {
        return this.mConnectedBleDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public List<BluetoothDevice> getConnectedBleDevices() {
        return new ArrayList(this.mConnectedBleDevices);
    }

    public BluetoothGatt getConnectedBluetoothGatt() {
        return getDeviceGatt(getConnectedBleDevice());
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public BluetoothDevice getConnectingBleDevice() {
        return this.mConnectingBleDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public BluetoothGatt getDeviceGatt(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        for (BluetoothGatt bluetoothGatt : new ArrayList(this.mBluetoothGatts)) {
            if (device.getAddress().equals(bluetoothGatt.getDevice().getAddress())) {
                return bluetoothGatt;
            }
        }
        return null;
    }

    public boolean isBleConnected(BluetoothDevice device) {
        if (device != null && ConnectUtil.isHasConnectPermission(this.mContext)) {
            Iterator<BluetoothDevice> it = this.mConnectedBleDevices.iterator();
            while (it.hasNext()) {
                if (BluetoothUtil.deviceEquals(it.next(), device)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public boolean isBleConnecting() {
        return this.mConnectingBleDevice != null;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public boolean isConnectedBleDevice(BluetoothDevice device) {
        return (device == null || getDeviceGatt(device) == null || !isBleConnected(device)) ? false : true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public boolean requestBleMtu(final BluetoothDevice device, final int mtu) {
        if (!ConnectUtil.isHasConnectPermission(this.mContext)) {
            return false;
        }
        BluetoothGatt deviceGatt = getDeviceGatt(device);
        if (deviceGatt == null) {
            JL_Log.m26849e(TAG, "requestBleMtu", "Failed to get gatt.");
            return false;
        }
        String str = TAG;
        JL_Log.m26851i(str, "requestBleMtu", "requestMtu is started.");
        if (deviceGatt.requestMtu(mtu + 3)) {
            return true;
        }
        JL_Log.m26849e(str, "requestBleMtu", "requestMtu failed. callback old mtu.");
        addBleMtu(device, 20);
        this.mBleEventCbManager.onBleMtuChanged(device, 20, 257);
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption option) {
        if (option != null) {
            this.mBluetoothOption = option;
        }
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public void setConnectedBleDevice(BluetoothDevice device) {
        if (BluetoothUtil.deviceEquals(this.mConnectedBleDevice, device)) {
            return;
        }
        this.mConnectedBleDevice = device;
        if (device != null) {
            this.mBleEventCbManager.onSwitchBleDevice(device);
        }
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public void writeDataByBleAsync(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        addSendTask(device, serviceUUID, characteristicUUID, data, callback);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public synchronized boolean writeDataByBleSync(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data) {
        boolean zWriteCharacteristic = false;
        if (device != null) {
            if (ConnectUtil.isHasConnectPermission(this.mContext) && serviceUUID != null && characteristicUUID != null) {
                if (data != null && data.length != 0) {
                    BluetoothGatt deviceGatt = getDeviceGatt(device);
                    if (deviceGatt == null) {
                        JL_Log.m26851i(TAG, "writeDataByBleSync", "No Gatt.");
                        return false;
                    }
                    BluetoothGattService service = deviceGatt.getService(serviceUUID);
                    if (service == null) {
                        JL_Log.m26851i(TAG, "writeDataByBleSync", "No Gatt Service.");
                        return false;
                    }
                    BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicUUID);
                    if (characteristic == null) {
                        JL_Log.m26851i(TAG, "writeDataByBleSync", "No Gatt Characteristic.");
                        return false;
                    }
                    try {
                        characteristic.setValue(data);
                        zWriteCharacteristic = deviceGatt.writeCharacteristic(characteristic);
                    } catch (Exception e) {
                        e.printStackTrace();
                        JL_Log.m26849e(TAG, "writeDataByBleSync", "exception : " + e);
                    }
                    JL_Log.m26847d(TAG, "writeDataByBleSync", "send data : " + zWriteCharacteristic);
                    return zWriteCharacteristic;
                }
                JL_Log.m26851i(TAG, "writeDataByBleSync", "data is empty.");
                return false;
            }
        }
        JL_Log.m26851i(TAG, "writeDataByBleSync", "param is error.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String printDeviceInfo(BluetoothDevice device) {
        return printDeviceInfo(device, true);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void addListener(OnBtBleListener listener) {
        this.mBleEventCbManager.addListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void removeListener(OnBtBleListener listener) {
        this.mBleEventCbManager.removeListener(listener);
    }
}
