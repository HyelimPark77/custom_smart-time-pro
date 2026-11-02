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
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.IO1iO0iiI;
import com.android.mltcode.paycertificationapi.OiOOOi;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.jieli.bluetooth_connect.interfaces.IBluetoothBle;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtBleListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnWriteDataCallback;
import com.jieli.bluetooth_connect.tool.BleEventCbManager;
import com.jieli.bluetooth_connect.tool.SendBleDataThread;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
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
    private final Map<String, Integer> mBleMtuMap;
    private int mBleNotificationCount;
    private BluetoothBleReceiver mBluetoothBleReceiver;
    private final BluetoothGattCallback mBluetoothGattCallback;
    private final List<BluetoothGatt> mBluetoothGatts;
    private BluetoothOption mBluetoothOption;
    private final BluetoothPair mBluetoothPair;
    private volatile BluetoothDevice mBoundingBleDevice;
    private volatile BluetoothDevice mConnectedBleDevice;
    private final List<BluetoothDevice> mConnectedBleDevices;
    private volatile BluetoothDevice mConnectingBleDevice;
    private final Context mContext;
    private final Handler mHandler;
    private volatile BluetoothDevice mNeedReconnectBleDevice;
    private final OnBtDevicePairListener mOnBtDevicePairListener;
    private SendBleDataThread mSendBleDataThread;
    private int reconnectCount;
    private final Map<String, Long> startTimeMap;

    public class BluetoothBleReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothBle this$0;

        private BluetoothBleReceiver(final BluetoothBle this$0) {
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) goto L16;
            String r4 = intent.getAction();
            if (TextUtils.isEmpty(r4) == true) goto L17;
            r4.getClass();
            if (r4.equals("android.bluetooth.device.action.ACL_CONNECTED") == false) goto L10;
            BluetoothDevice r5 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            JL_Log.i(BluetoothBle.access$600(), "ACTION_ACL_CONNECTED", "device : " + BluetoothBle.access$1600(this.this$0, r5));
            return;
        L10:
            if (r4.equals("android.bluetooth.device.action.ACL_DISCONNECTED") == true) goto L12;
            return;
        L12:
            BluetoothDevice r6 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            JL_Log.i(BluetoothBle.access$600(), "ACTION_ACL_DISCONNECTED", "device : " + BluetoothBle.access$1600(this.this$0, r6));
            return;
        L17:
            return;
        }

        public /* synthetic */ BluetoothBleReceiver(BluetoothBle r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    static {
    }

    public BluetoothBle(Context context, BluetoothPair bluetoothPair, BluetoothOption option, OnBtBleListener listener) {
        this.mBluetoothGatts = Collections.synchronizedList(new ArrayList());
        this.mConnectedBleDevices = Collections.synchronizedList(new ArrayList());
        this.mBleMtuMap = Collections.synchronizedMap(new HashMap());
        this.startTimeMap = new HashMap();
        this.mHandler = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        OnBtDevicePairListener r0 = new AnonymousClass3(this);
        this.mOnBtDevicePairListener = r0;
        this.mBluetoothGattCallback = new AnonymousClass4(this);
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        BluetoothPair r4 = (BluetoothPair) ConnectUtil.checkNotNull(bluetoothPair);
        this.mBluetoothPair = r4;
        r4.addListener2(r0);
        this.mBleEventCbManager = new BleEventCbManager();
        if (option != null) goto L5;
        option = BluetoothOption.createDefaultOption();
    L5:
        this.mBluetoothOption = option;
        addListener2(listener);
        registerReceiver();
    }

    public static /* synthetic */ void OXO1(BluetoothBle r2, BluetoothDevice r3) {
        r2.mBleNotificationCount = 0;
        if (r2.enableBLEDeviceNotification(r3, r2.mBluetoothOption.getBleServiceUUID(), r2.mBluetoothOption.getBleNotificationUUID()) == true) goto L6;
        r2.disconnectBLEDevice(r3);
        return;
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothBle r2, BluetoothDevice r3, UUID r4, UUID r5) {
        int r0 = r2.mBleNotificationCount + 1;
        r2.mBleNotificationCount = r0;
        if (r0 < 5) goto L5;
        r2.mBleNotificationCount = 0;
        r2.disconnectBLEDevice(r3);
        return;
    L5:
        if (r2.enableBLEDeviceNotification(r3, r4, r5) == true) goto L10;
        r2.disconnectBLEDevice(r3);
        return;
    }

    public static /* synthetic */ BluetoothDevice access$000(BluetoothBle r0) {
        return r0.mConnectingBleDevice;
    }

    public static /* synthetic */ void access$100(BluetoothBle r0, BluetoothDevice r1, int r2) {
        r0.notifyBleConnectStatus(r1, r2);
    }

    public static /* synthetic */ void access$1000(BluetoothBle r0) {
        r0.clearDevices();
    }

    public static /* synthetic */ BluetoothDevice access$1100(BluetoothBle r0) {
        return r0.mBoundingBleDevice;
    }

    public static /* synthetic */ void access$1200(BluetoothBle r0, BluetoothDevice r1, int r2) {
        r0.onBleBond(r1, r2);
    }

    public static /* synthetic */ long access$1300(BluetoothBle r2) {
        return r2.boundStartTime;
    }

    public static /* synthetic */ int access$1400(BluetoothBle r0) {
        return r0.failedCount;
    }

    public static /* synthetic */ int access$1408(BluetoothBle r2) {
        int r0 = r2.failedCount;
        r2.failedCount = r0 + 1;
        return r0;
    }

    public static /* synthetic */ boolean access$1500(BluetoothBle r0, BluetoothDevice r1) {
        return r0.startBleBond(r1);
    }

    public static /* synthetic */ String access$1600(BluetoothBle r0, BluetoothDevice r1) {
        return r0.printDeviceInfo(r1);
    }

    public static /* synthetic */ BleEventCbManager access$1700(BluetoothBle r0) {
        return r0.mBleEventCbManager;
    }

    public static /* synthetic */ void access$1800(BluetoothBle r0, BluetoothGatt r1, BluetoothDevice r2, int r3, int r4) {
        r0.handleBleConnection(r1, r2, r3, r4);
    }

    public static /* synthetic */ Handler access$1900(BluetoothBle r0) {
        return r0.mHandler;
    }

    public static /* synthetic */ void access$200(BluetoothBle r0, BluetoothDevice r1) {
        r0.setConnectingBleDevice(r1);
    }

    public static /* synthetic */ String access$2000(BluetoothBle r0, BluetoothDevice r1, boolean r2) {
        return r0.printDeviceInfo(r1, r2);
    }

    public static /* synthetic */ void access$2100(BluetoothBle r0, BluetoothDevice r1, UUID r2, UUID r3, int r4, byte[] r5) {
        r0.wakeUpSendDataThread(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void access$2200(BluetoothBle r0, BluetoothDevice r1, UUID r2, UUID r3, boolean r4) {
        r0.onBleNotificationStatus(r1, r2, r3, r4);
    }

    public static /* synthetic */ void access$2300(BluetoothBle r0, BluetoothDevice r1, int r2) {
        r0.addBleMtu(r1, r2);
    }

    public static /* synthetic */ Context access$300(BluetoothBle r0) {
        return r0.mContext;
    }

    public static /* synthetic */ boolean access$400(BluetoothBle r0, BluetoothDevice r1, BluetoothGatt r2) {
        return r0.removeDeviceFromRecord(r1, r2);
    }

    public static /* synthetic */ void access$500(BluetoothBle r0, BluetoothGatt r1, int r2) {
        r0.onBleServiceDiscovery(r1, r2);
    }

    public static /* synthetic */ String access$600() {
        return TAG;
    }

    public static /* synthetic */ void access$700(BluetoothBle r0, BluetoothDevice r1) {
        r0.setNeedReconnectBleDevice(r1);
    }

    public static /* synthetic */ SendBleDataThread access$802(BluetoothBle r0, SendBleDataThread r1) {
        r0.mSendBleDataThread = r1;
        return r1;
    }

    private void addBleMtu(BluetoothDevice device, int mtu) {
        int r3 = BluetoothUtil.formatBleMtu(mtu);
        if (device != null) goto L5;
        return;
    L5:
        if (isConnectedBleDevice(device) == false) goto L9;
        this.mBleMtuMap.put(device.getAddress(), Integer.valueOf(r3));
        return;
    }

    private void addSendTask(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        SendBleDataThread r0 = this.mSendBleDataThread;
        if (r0 == null) goto L5;
        boolean r7 = r0.addSendTask(device, serviceUUID, characteristicUUID, data, callback);
        OnWriteDataCallback r1 = callback;
    L6:
        if (r7 == true) goto L10;
        if (r1 == null) goto L11;
        r1.onBleResult(device, serviceUUID, characteristicUUID, false, data);
        return;
    L11:
        return;
    L10:
        return;
    L5:
        r1 = callback;
        r7 = false;
        goto L6
    }

    @SuppressLint({"MissingPermission"})
    private void clearDevices() {
        Iterator r0 = new ArrayList(this.mConnectedBleDevices).iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        BluetoothDevice r1 = (BluetoothDevice) r0.next();
        BluetoothGatt r2 = getDeviceGatt(r1);
        if (r2 == null) goto L4;
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L10;
    L12:
        this.mBleEventCbManager.onBleConnection(r1, 0);
        goto L4
    L10:
        if (BluetoothUtil.isBluetoothEnable() == false) goto L12;
        r2.disconnect();
        r2.close();
        goto L12
    L13:
        this.mConnectedBleDevices.clear();
        this.mBluetoothGatts.clear();
        this.mBleMtuMap.clear();
        setConnectedBleDevice(null);
        setConnectingBleDevice(null);
        stopSendDataThread();
    }

    @SuppressLint({"MissingPermission"})
    private boolean connectBluetoothGatt(BluetoothDevice device) {
        String r0 = TAG;
        JL_Log.i(r0, "connectBluetoothGatt", "");
        if (device != null) goto L5;
    L26:
        JL_Log.w(r0, "connectBluetoothGatt", "device is null");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L26;
        BluetoothGatt r3 = device.connectGatt(this.mContext, this.mBluetoothOption.isAutoConnectBle(), this.mBluetoothGattCallback, 2);
        if (r3 != null) goto L12;
        JL_Log.i(r0, "connectBluetoothGatt", "bluetoothGatt is null.");
        notifyBleConnectStatus(device, 0);
        return false;
    L12:
        if (this.mBluetoothOption.isAutoConnectBle() == true) goto L14;
    L17:
        Long r1 = this.startTimeMap.get(device.getAddress());
        if (r1 != null) goto L20;
        long r4 = ConnectUtil.getCurrentTime();
        this.startTimeMap.put(device.getAddress(), Long.valueOf(r4));
    L22:
        if (this.mBluetoothGatts.contains(r3) == true) goto L24;
        this.mBluetoothGatts.add(r3);
    L24:
        JL_Log.i(r0, "connectBluetoothGatt", "start ble connect. startTime : " + r4);
        return true;
    L20:
        r4 = r1.longValue();
        goto L22
    L14:
        if (r3.connect() == true) goto L17;
        JL_Log.i(r0, "connectBluetoothGatt", "Failed to auto connect.");
        return false;
    }

    private void dealWithBleConnected(BluetoothDevice device) {
        if (this.mBluetoothOption.isUseBleBondWay() == false) goto L5;
        startBleBond(device);
    L5:
        notifyBleConnectStatus(device, 2);
    }

    @SuppressLint({"MissingPermission"})
    private boolean discoverBLEDeviceServices(BluetoothDevice device) {
        String r0 = TAG;
        JL_Log.i(r0, "discoverBLEDeviceServices", "device : " + device);
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L5;
        return false;
    L5:
        BluetoothGatt r5 = getDeviceGatt(device);
        if (r5 != null) goto L9;
        JL_Log.i(r0, "discoverBLEDeviceServices", "no bluetoothGatt");
        return false;
    L9:
        boolean r6 = r5.discoverServices();
        JL_Log.i(r0, "discoverBLEDeviceServices", "discoverServices ---> " + r6);
        return r6;
    }

    @SuppressLint({"MissingPermission"})
    private boolean enableBLEDeviceNotification(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID) {
        boolean r1 = false;
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L6;
        JL_Log.w(TAG, "enableBLEDeviceNotification", "no connect permission.");
        return false;
    L6:
        BluetoothGatt r4 = getDeviceGatt(device);
        if (r4 != null) goto L10;
        JL_Log.w(TAG, "enableBLEDeviceNotification", "No Gatt.");
        return false;
    L10:
        BluetoothGattService r5 = r4.getService(serviceUUID);
        if (r5 != null) goto L14;
        JL_Log.w(TAG, "enableBLEDeviceNotification", "No Gatt Service.");
        return false;
    L14:
        BluetoothGattCharacteristic r6 = r5.getCharacteristic(characteristicUUID);
        if (r6 != null) goto L32;
        JL_Log.w(TAG, "enableBLEDeviceNotification", "No Gatt Characteristic.");
        return false;
    L32:
        boolean r7 = r4.setCharacteristicNotification(r6, true);     // Catch: Exception -> L28
        if (r7 == false) goto L26;
        BluetoothGattDescriptor r8 = r6.getDescriptor(BluetoothConstant.UUID_CLIENT_CHARACTERISTIC_CONFIG);     // Catch: Exception -> L24
        if (r8 == null) goto L34;
        r7 = tryToWriteDescriptor(r4, r8, 0, false);     // Catch: Exception -> L24
    L34:
    L30:
        JL_Log.w(TAG, "enableBLEDeviceNotification", "" + r7);
        return r7;
    L26:
        JL_Log.w(TAG, "enableBLEDeviceNotification", "setCharacteristicNotification failed.");     // Catch: Exception -> L24
    L24:
        e = e;
        r1 = r7;
    L29:
        JL_Log.e(TAG, "enableBLEDeviceNotification", "exception : " + e.getMessage());
        e.printStackTrace();
        r7 = r1;
    L28:
        e = e;
        goto L29
    }

    private void handleACLConnection(BluetoothDevice device, int status) {
        if (BluetoothUtil.deviceEquals(this.mConnectingBleDevice, device) == true) goto L5;
        return;
    L5:
        if (status == 2) goto L7;
        return;
    L7:
        if (isConnectedBleDevice(device) == true) goto L12;
        connectBluetoothGatt(device);
        return;
    }

    @SuppressLint({"MissingPermission"})
    private void handleBleConnection(BluetoothGatt gatt, BluetoothDevice device, int status, int newState) {
        boolean r2 = true;
        if (status != 0) goto L22;
        if (newState == 0) goto L22;
        if (newState == 2) goto L8;
        if (newState != 1) goto L49;
        notifyBleConnectStatus(device, 1);
        return;
    L49:
        return;
    L8:
        if (this.mBluetoothGatts.contains(gatt) == true) goto L11;
        this.mBluetoothGatts.add(gatt);
    L11:
        if (this.mConnectedBleDevices.contains(device) == true) goto L14;
        this.mConnectedBleDevices.add(device);
        addBleMtu(device, 20);
    L14:
        if (discoverBLEDeviceServices(device) == true) goto L17;
        disconnectBLEDevice(device);
        return;
    L17:
        this.mHandler.removeMessages(MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
        Handler r10 = this.mHandler;
        r10.sendMessageDelayed(r10.obtainMessage(MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT, device), 3000);
        return;
    L22:
        this.mHandler.removeMessages(MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT);
        this.mHandler.removeMessages(MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
        removeDeviceFromRecord(device, gatt);
        BluetoothUtil.refreshBleDeviceCache(this.mContext, gatt);
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L25;
        gatt.close();
    L25:
        long r3 = ConnectUtil.getCurrentTime();
        Long r11 = this.startTimeMap.get(device.getAddress());
        if (r11 != null) goto L28;
        long r5 = 0;
    L29:
        long r4 = r3 - r5;
        long r7 = 30000 - r4;
        this.reconnectCount++;
        if (this.mBluetoothOption.isReconnect() == true) goto L32;
    L38:
        r2 = false;
    L39:
        String r12 = TAG;
        JL_Log.i(r12, "handleBleConnection", "usedTime : " + r4 + ", leftConnectTime : " + r7 + ", isAllowReconnect : " + r2 + ", reconnectCount = " + this.reconnectCount);
        if (r2 == true) goto L42;
    L47:
        JL_Log.w(r12, "handleBleConnection", "callback device is disconnected.");
        notifyBleConnectStatus(device, 0);
        return;
    L42:
        if (status != 133) goto L44;
    L45:
        JL_Log.i(r12, "handleBleConnection", "found connect device. retry...");
        reconnectBleDevice(device);
        return;
    L44:
        if (BluetoothUtil.deviceEquals(device, this.mNeedReconnectBleDevice) == false) goto L47;
    L32:
        if (r4 >= 30000) goto L38;
        if (r4 > r7) goto L38;
        if (this.reconnectCount >= 2) goto L38;
    L28:
        r5 = r11.longValue();
        goto L29
    }

    private void notifyBleConnectStatus(BluetoothDevice device, int status) {
        if (status != 1) goto L5;
    L30:
        JL_Log.i(TAG, "notifyBleConnectStatus", "status : " + status);
        this.mBleEventCbManager.onBleConnection(device, status);
        return;
    L5:
        if (BluetoothUtil.deviceEquals(device, this.mConnectingBleDevice) == false) goto L7;
        setConnectingBleDevice(null);
        this.mHandler.removeMessages(MSG_CONNECT_BLE_TIMEOUT);
    L7:
        if (device == null) goto L10;
        this.startTimeMap.remove(device.getAddress());
    L10:
        if (BluetoothUtil.deviceEquals(device, this.mNeedReconnectBleDevice) == false) goto L12;
        setNeedReconnectBleDevice(null);
        this.mHandler.removeMessages(MSG_RECONNECT_BLE);
    L12:
        this.mBleNotificationCount = 0;
        this.reconnectCount = 0;
        if (status == 2) goto L15;
        if (status != 0) goto L30;
        if (this.mConnectedBleDevices.remove(device) == false) goto L25;
        BluetoothGatt r1 = getDeviceGatt(device);
        if (r1 == null) goto L25;
        this.mBluetoothGatts.remove(r1);
    L25:
        if (this.mConnectedBleDevices.isEmpty() == false) goto L28;
        setConnectedBleDevice(null);
        stopSendDataThread();
        goto L30
    L28:
        if (BluetoothUtil.deviceEquals(this.mConnectedBleDevice, device) == false) goto L30;
        List<BluetoothDevice> r2 = this.mConnectedBleDevices;
        setConnectedBleDevice(r2.get(r2.size() - 1));
        goto L30
    L15:
        if (this.mConnectedBleDevice != null) goto L17;
        setConnectedBleDevice(device);
    L17:
        startSendDataThread();
        goto L30
    }

    private void onBleBond(final BluetoothDevice device, final int status) {
        if (status != 11) goto L5;
    L7:
        this.mBleEventCbManager.onBleBond(device, status);
        return;
    L5:
        if (BluetoothUtil.deviceEquals(device, this.mBoundingBleDevice) == false) goto L7;
        this.failedCount = 0;
        this.boundStartTime = 0;
        this.mBoundingBleDevice = null;
        goto L7
    }

    private void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, boolean bEnabled) {
        this.mBleEventCbManager.onBleNotificationStatus(device, serviceUuid, characteristicUuid, bEnabled);
        if (serviceUuid != null) goto L5;
        return;
    L5:
        if (serviceUuid.equals(this.mBluetoothOption.getBleServiceUUID()) == false) goto L15;
        if (characteristicUuid != null) goto L8;
        return;
    L8:
        if (characteristicUuid.equals(this.mBluetoothOption.getBleNotificationUUID()) == false) goto L17;
        if (bEnabled == true) goto L12;
        JL_Log.w(TAG, "onBleNotificationStatus", ConnectUtil.formatString("device : %s, serviceUuid : %s, characteristicUuid : %s, mBleNotificationCount : %d", new Object[]{device, serviceUuid, characteristicUuid, Integer.valueOf(this.mBleNotificationCount)}));
        this.mHandler.post(new OiOOOi(this, device, serviceUuid, characteristicUuid));
        return;
    L12:
        dealWithBleConnected(device);
        return;
    L17:
        return;
    }

    private void onBleServiceDiscovery(BluetoothGatt gatt, int status) {
        this.mBleEventCbManager.onServicesDiscovered(gatt, status);
        if (gatt != null) goto L5;
        return;
    L5:
        if (gatt.getServices() != null) goto L7;
        return;
    L7:
        if (gatt.getDevice() == null) goto L43;
        final BluetoothDevice r7 = gatt.getDevice();
        if (this.mBluetoothOption.isOnlyConnect() == false) goto L13;
        JL_Log.w(TAG, "onBleServiceDiscovery", "isOnlyConnect : true, notify ble connected ok.");
        dealWithBleConnected(r7);
        return;
    L13:
        List<BluetoothGattService> r6 = gatt.getServices();
        Iterator<BluetoothGattService> r0 = r6.iterator();
    L15:
        if (r0.hasNext() == false) goto L23;
        BluetoothGattService r2 = r0.next();
        if (r2.getUuid().equals(this.mBluetoothOption.getBleServiceUUID()) == false) goto L15;
        if (r2.getCharacteristic(this.mBluetoothOption.getBleWriteUUID()) == null) goto L15;
        if (r2.getCharacteristic(this.mBluetoothOption.getBleNotificationUUID()) == null) goto L15;
        boolean r1 = true;
    L24:
        JL_Log.w(TAG, "onBleServiceDiscovery", "bServiceFound : " + r1);
        if (r1 == false) goto L27;
        this.mHandler.post(new IO1iO0iiI(this, r7));
        return;
    L27:
        if (r6.isEmpty() == false) goto L29;
        setNeedReconnectBleDevice(r7);
    L29:
        disconnectBLEDevice(r7);
        return;
    L23:
        r1 = false;
        goto L24
    }

    private String printDeviceInfo(BluetoothDevice device, boolean isDetail) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device, isDetail);
    }

    private void reconnectBleDevice(BluetoothDevice device) {
        this.mHandler.removeMessages(MSG_RECONNECT_BLE);
        Handler r0 = this.mHandler;
        r0.sendMessageDelayed(r0.obtainMessage(MSG_RECONNECT_BLE, device), 2000);
        if (BluetoothUtil.deviceEquals(device, this.mNeedReconnectBleDevice) == false) goto L6;
        setNeedReconnectBleDevice(null);
        return;
    }

    private void registerReceiver() {
        if (this.mBluetoothBleReceiver != null) goto L6;
        this.mBluetoothBleReceiver = new BluetoothBleReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        r0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        this.mContext.registerReceiver(this.mBluetoothBleReceiver, r0);
        return;
    }

    private void removeBleMtu(BluetoothDevice device) {
        if (device == null) goto L5;
        this.mBleMtuMap.remove(device.getAddress());
        return;
    }

    private boolean removeDeviceFromRecord(BluetoothDevice device, BluetoothGatt gatt) {
        boolean r0 = false;
        if (device != null) goto L5;
        return false;
    L5:
        Iterator r1 = new ArrayList(this.mConnectedBleDevices).iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        BluetoothDevice r2 = (BluetoothDevice) r1.next();
        if (r2 == null) goto L7;
        if (r2.getAddress().equals(device.getAddress()) == false) goto L7;
        r0 = true;
    L14:
        if (r2 == null) goto L16;
        removeBleMtu(r2);
        this.mConnectedBleDevices.remove(r2);
    L16:
        if (gatt != null) goto L18;
    L20:
        return r0;
    L18:
        if (this.mBluetoothGatts.contains(gatt) == false) goto L20;
        JL_Log.e(TAG, "removeDeviceFromRecord", "remove gatt : " + gatt.getDevice());
        this.mBluetoothGatts.remove(gatt);
        goto L20
    L13:
        r2 = null;
        goto L14
    }

    private void setConnectingBleDevice(BluetoothDevice connectingBleDevice) {
        this.mConnectingBleDevice = connectingBleDevice;
    }

    private void setNeedReconnectBleDevice(BluetoothDevice device) {
        this.mNeedReconnectBleDevice = device;
    }

    private boolean startBleBond(BluetoothDevice device) {
        if (device != null) goto L5;
        return false;
    L5:
        boolean r1 = this.mBluetoothPair.isPaired(device);
        String r2 = TAG;
        JL_Log.i(r2, "startBleBond", "isPaired : " + r1);
        if (r1 == true) goto L13;
        boolean r3 = this.mBluetoothPair.tryToPair(device);
        JL_Log.i(r2, "startBleBond", "isStartBond : " + r3);
        if (r3 == false) goto L11;
        this.failedCount = 0;
        this.boundStartTime = ConnectUtil.getCurrentTime();
        this.mBoundingBleDevice = device;
        return true;
    L11:
        onBleBond(device, 10);
        return false;
    L13:
        onBleBond(device, 12);
        return true;
    }

    private void startSendDataThread() {
        if (this.mSendBleDataThread != null) goto L6;
        SendBleDataThread r0 = new SendBleDataThread(this, new AnonymousClass2(this));
        this.mSendBleDataThread = r0;
        r0.start();
        return;
    }

    private void stopSendDataThread() {
        SendBleDataThread r0 = this.mSendBleDataThread;
        if (r0 == null) goto L6;
        r0.stopThread();
        return;
    }

    @SuppressLint({"MissingPermission"})
    private boolean tryToWriteDescriptor(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor descriptor, int retryCount, boolean isSkipSetValue) {
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L6;
        return false;
    L6:
        if (isSkipSetValue == true) goto L14;
        isSkipSetValue = descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        String r5 = TAG;
        JL_Log.i(r5, "tryToWriteDescriptor", "setValue ---> " + isSkipSetValue);
        if (isSkipSetValue == true) goto L13;
        retryCount = retryCount + 1;
        if (retryCount < 3) goto L12;
        return false;
    L12:
        JL_Log.i(r5, "tryToWriteDescriptor", "setValue failed. retryCount : " + retryCount + ", isSkipSetValue :  false");
        SystemClock.sleep(50);
        tryToWriteDescriptor(bluetoothGatt, descriptor, retryCount, false);
        goto L14
    L13:
        retryCount = 0;
    L14:
        if (isSkipSetValue == false) goto L21;
        isSkipSetValue = bluetoothGatt.writeDescriptor(descriptor);
        String r6 = TAG;
        JL_Log.i(r6, "tryToWriteDescriptor", "writeDescriptor ---> " + isSkipSetValue);
        if (isSkipSetValue == true) goto L21;
        int r11 = retryCount + 1;
        if (r11 < 3) goto L20;
        return false;
    L20:
        JL_Log.i(r6, "tryToWriteDescriptor", "writeDescriptor failed. retryCount : " + r11 + ", isSkipSetValue :  true");
        SystemClock.sleep(50);
        tryToWriteDescriptor(bluetoothGatt, descriptor, r11, true);
    L21:
        return isSkipSetValue;
    }

    private void unregisterReceiver() {
        BluetoothBleReceiver r0 = this.mBluetoothBleReceiver;
        if (r0 == null) goto L6;
        this.mContext.unregisterReceiver(r0);
        this.mBluetoothBleReceiver = null;
        return;
    }

    private void wakeUpSendDataThread(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, int status, byte[] data) {
        if (this.mSendBleDataThread == null) goto L6;
        SendBleDataThread.BleSendTask r1 = new SendBleDataThread.BleSendTask(device, serviceUUID, characteristicUUID, data, null);
        r1.setStatus(status);
        this.mSendBleDataThread.wakeupSendThread(r1);
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void addListener(OnBtBleListener listener) {
        addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public boolean connectBLEDevice(BluetoothDevice device) {
        if (device != null) goto L5;
    L26:
        JL_Log.w(TAG, "connectBLEDevice", "connect to ble device is null");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L26;
        String r2 = TAG;
        JL_Log.d(r2, "connectBLEDevice", "device : " + printDeviceInfo(device));
        BluetoothDevice r3 = getConnectingBleDevice();
        if (r3 == null) goto L12;
        JL_Log.w(r2, "connectBLEDevice", "Device is connecting. connectingDev : " + printDeviceInfo(r3));
        return false;
    L12:
        if (isConnectedBleDevice(device) == false) goto L15;
        JL_Log.w(r2, "connectBLEDevice", "BLE is connected.");
        notifyBleConnectStatus(device, 2);
        return true;
    L15:
        JL_Log.d(r2, "connectBLEDevice", "isUseMultiDevice : " + this.mBluetoothOption.isUseMultiDevice());
        if (this.mBluetoothOption.isUseMultiDevice() == true) goto L22;
        BluetoothDevice r4 = getConnectedBleDevice();
        JL_Log.d(r2, "connectBLEDevice", "connectedDevice : " + printDeviceInfo(r4));
        if (r4 == null) goto L22;
        if (BluetoothUtil.deviceEquals(r4, device) == true) goto L22;
        disconnectBLEDevice(r4);
        SystemClock.sleep(300);
    L22:
        setConnectingBleDevice(device);
        this.mHandler.removeMessages(MSG_CONNECT_BLE_TIMEOUT);
        Handler r1 = this.mHandler;
        r1.sendMessageDelayed(r1.obtainMessage(MSG_CONNECT_BLE_TIMEOUT, device), 30000);
        boolean r5 = connectBluetoothGatt(device);
        if (r5 == true) goto L25;
        notifyBleConnectStatus(device, 0);
    L25:
        return r5;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        JL_Log.d(TAG, "destroy", "");
        clearDevices();
        this.mBleEventCbManager.destroy();
        this.startTimeMap.clear();
        unregisterReceiver();
        this.mBluetoothPair.removeListener2(this.mOnBtDevicePairListener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public boolean disconnectBLEDevice(BluetoothDevice device) {
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L5;
        return false;
    L5:
        String r0 = TAG;
        JL_Log.d(r0, "disconnectBLEDevice", "device : " + printDeviceInfo(device));
    L10:
        e = move-exception;
        e.printStackTrace();
        return true;
    L7:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L12;
        JL_Log.w(r0, "disconnectBLEDevice", "bluetooth is close.");     // Catch: Exception -> L10
        return false;
    L12:
        BluetoothGatt r2 = getDeviceGatt(device);     // Catch: Exception -> L10
        if (r2 != null) goto L16;
        JL_Log.w(r0, "disconnectBLEDevice", "no bluetoothGatt");     // Catch: Exception -> L10
        return false;
    L16:
        JL_Log.e(r0, "disconnectBLEDevice", "disconnect");     // Catch: Exception -> L10
        r2.disconnect();     // Catch: Exception -> L10
        this.mHandler.removeMessages(MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT);     // Catch: Exception -> L10
        Handler r1 = this.mHandler;     // Catch: Exception -> L10
        r1.sendMessageDelayed(r1.obtainMessage(MSG_DISCONNECT_BLE_CALLBACK_TIMEOUT, device), 3000);     // Catch: Exception -> L10
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public int getBleMtu(BluetoothDevice device) {
        if (device != null) goto L5;
        return 0;
    L5:
        Integer r3 = this.mBleMtuMap.get(device.getAddress());
        if (r3 != null) goto L9;
        return 0;
    L9:
        if (r3.intValue() < 128) goto L12;
        r3 = Integer.valueOf(r3.intValue() - 6);
    L12:
        return r3.intValue();
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
        if (device != null) goto L5;
        return null;
    L5:
        Iterator r1 = new ArrayList(this.mBluetoothGatts).iterator();
    L7:
        if (r1.hasNext() == false) goto L11;
        BluetoothGatt r2 = (BluetoothGatt) r1.next();
        if (device.getAddress().equals(r2.getDevice().getAddress()) == false) goto L7;
        return r2;
    L11:
        return null;
    }

    public boolean isBleConnected(BluetoothDevice device) {
        if (device != null) goto L5;
    L14:
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L14;
        Iterator<BluetoothDevice> r1 = this.mConnectedBleDevices.iterator();
    L9:
        if (r1.hasNext() == false) goto L14;
        if (BluetoothUtil.deviceEquals(r1.next(), device) == false) goto L9;
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public boolean isBleConnecting() {
        if (this.mConnectingBleDevice == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public boolean isConnectedBleDevice(BluetoothDevice device) {
        if (device != null) goto L6;
        return false;
    L6:
        if (getDeviceGatt(device) != null) goto L8;
    L11:
        return false;
    L8:
        if (isBleConnected(device) == false) goto L11;
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void removeListener(OnBtBleListener listener) {
        removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public boolean requestBleMtu(final BluetoothDevice device, final int mtu) {
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L5;
        return false;
    L5:
        BluetoothGatt r0 = getDeviceGatt(device);
        if (r0 != null) goto L9;
        JL_Log.e(TAG, "requestBleMtu", "Failed to get gatt.");
        return false;
    L9:
        String r3 = TAG;
        JL_Log.i(r3, "requestBleMtu", "requestMtu is started.");
        if (r0.requestMtu(mtu + 3) == true) goto L13;
        JL_Log.e(r3, "requestBleMtu", "requestMtu failed. callback old mtu.");
        addBleMtu(device, 20);
        this.mBleEventCbManager.onBleMtuChanged(device, 20, 257);
        return false;
    L13:
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption option) {
        if (option == null) goto L5;
        this.mBluetoothOption = option;
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public void setConnectedBleDevice(BluetoothDevice device) {
        if (BluetoothUtil.deviceEquals(this.mConnectedBleDevice, device) == true) goto L8;
        this.mConnectedBleDevice = device;
        if (device == null) goto L9;
        this.mBleEventCbManager.onSwitchBleDevice(device);
        return;
    L9:
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    public void writeDataByBleAsync(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        addSendTask(device, serviceUUID, characteristicUUID, data, callback);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBle
    @SuppressLint({"MissingPermission"})
    public synchronized boolean writeDataByBleSync(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data) {
        monitor-enter(this);
        boolean r0 = false;
        if (device != null) goto L46;
    L41:
        JL_Log.i(TAG, "writeDataByBleSync", "param is error.");     // Catch: Throwable -> L19
        monitor-exit(this);
        return false;
    L46:
    L19:
        th = move-exception;
        throw th;
    L6:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L41;
        if (serviceUUID == null) goto L41;
        if (characteristicUUID == null) goto L41;
        if (data != null) goto L12;
    L38:
        JL_Log.i(TAG, "writeDataByBleSync", "data is empty.");     // Catch: Throwable -> L19
        monitor-exit(this);
        return false;
    L12:
        if (data.length == 0) goto L38;
        BluetoothGatt r3 = getDeviceGatt(device);     // Catch: Throwable -> L19
        if (r3 != null) goto L21;
        JL_Log.i(TAG, "writeDataByBleSync", "No Gatt.");     // Catch: Throwable -> L19
        monitor-exit(this);
        return false;
    L21:
        BluetoothGattService r4 = r3.getService(serviceUUID);     // Catch: Throwable -> L19
        if (r4 != null) goto L26;
        JL_Log.i(TAG, "writeDataByBleSync", "No Gatt Service.");     // Catch: Throwable -> L19
        monitor-exit(this);
        return false;
    L26:
        BluetoothGattCharacteristic r5 = r4.getCharacteristic(characteristicUUID);     // Catch: Throwable -> L19
        if (r5 != null) goto L47;
        JL_Log.i(TAG, "writeDataByBleSync", "No Gatt Characteristic.");     // Catch: Throwable -> L19
        monitor-exit(this);
        return false;
    L47:
        r5.setValue(data);     // Catch: Throwable -> L19 Exception -> L33
        r0 = r3.writeCharacteristic(r5);     // Catch: Throwable -> L19 Exception -> L33
    L35:
        JL_Log.d(TAG, "writeDataByBleSync", "send data : " + r0);     // Catch: Throwable -> L19
        monitor-exit(this);
        return r0;
    L33:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L19
        JL_Log.e(TAG, "writeDataByBleSync", "exception : " + e);     // Catch: Throwable -> L19
        goto L35
    }

    private String printDeviceInfo(BluetoothDevice device) {
        return printDeviceInfo(device, true);
    }

    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    public void addListener2(OnBtBleListener listener) {
        this.mBleEventCbManager.addListener(listener);
    }

    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    public void removeListener2(OnBtBleListener listener) {
        this.mBleEventCbManager.removeListener(listener);
    }
}
