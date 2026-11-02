package com.jieli.jl_bt_ota.impl.bt;

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
import com.facebook.login.widget.ToolTipPopup;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.constant.GattError;
import com.jieli.jl_bt_ota.interfaces.bt.OnBleSendDataCallback;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtBleListener;
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
    private static final int A = 12289;
    private static final int B = 12290;
    private static final int C = 12291;
    private static final int D = 12292;
    private static final int E = 12293;
    private static final int F = 2000;
    private static final long G = 25000;
    private final Map<String, BleDevice> s;
    private final BtBleCallbackManager t;
    private final Queue<BleCharacteristic> u;
    private BluetoothBleReceiver v;
    private SendBleDataThread w;
    private long x;
    private volatile BluetoothDevice y;
    private final BluetoothGattCallback z;

    public class BluetoothBleReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothBle a;

        private BluetoothBleReceiver(BluetoothBle r1) {
            this.a = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context r4, Intent r5) {
            if (r5 == null) goto L25;
            String r6 = r5.getAction();
            if (TextUtils.isEmpty(r6) == true) goto L26;
            r6.getClass();
            if (r6.equals("android.bluetooth.device.action.ACL_CONNECTED") == false) goto L10;
            BluetoothDevice r7 = (BluetoothDevice) r5.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r7 == null) goto L24;
            JL_Log.d(this.a.TAG, "ACTION_ACL_CONNECTED", "device : " + this.a.printBtDeviceInfo(r7));
            return;
        L24:
            return;
        L10:
            if (r6.equals("android.bluetooth.device.action.ACL_DISCONNECTED") == false) goto L27;
            BluetoothDevice r8 = (BluetoothDevice) r5.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r8 == null) goto L28;
            JL_Log.d(this.a.TAG, "ACTION_ACL_DISCONNECTED", "device : " + this.a.printBtDeviceInfo(r8));
            if (BluetoothBle.a(this.a, r8) == false) goto L21;
            JL_Log.d(this.a.TAG, "ACTION_ACL_DISCONNECTED", CommonUtil.formatString("Ready to disconnect device[%s].", new Object[]{r8}));
            this.a.disconnectBLEDevice(r8);
            return;
        L21:
            return;
        L28:
            return;
        L27:
            return;
        L26:
            return;
        }

        public /* synthetic */ BluetoothBleReceiver(BluetoothBle r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public BluetoothBle(Context r1) {
        super(r1);
        this.z = new AnonymousClass2(this);
        this.s = Collections.synchronizedMap(new HashMap());
        this.u = new LinkedList();
        this.t = new BtBleCallbackManager();
        a();
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothBle r0, BluetoothDevice r1, BluetoothGatt r2, int r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void XO0O10(BluetoothBle r0, ThreadState r1) {
        r0.a(r1);
    }

    public static /* synthetic */ BtBleCallbackManager a(BluetoothBle r0) {
        return r0.t;
    }

    @SuppressLint({"MissingPermission"})
    private BluetoothGatt b(@NonNull BluetoothDevice r9, @NonNull BleConnectParam r10) {
        Context r1 = this.mContext;
        int r4 = r10.getTransport();
        int r5 = r10.getPreferredPhy();
        JL_Log.d(this.TAG, "connectBluetoothGatt", "transport : " + BluetoothUtil.printTransport(r4) + ", preferredPhy : " + r5);
        int r0 = Build.VERSION.SDK_INT;     // Catch: Exception -> L6
        if (r0 <= 26) goto L8;
        BluetoothGatt r11 = r9.connectGatt(r1, false, this.z, r4, r5, this.mUIHandler);     // Catch: Exception -> L6
    L17:
    L13:
        if (r11 != null) goto L16;
        JL_Log.i(this.TAG, "connectBluetoothGatt", "Failed to connect ble.");
        return null;
    L16:
        return r11;
    L8:
        if (r0 != 26) goto L10;
        r11 = r9.connectGatt(r1, false, this.z, r4, r5);     // Catch: Exception -> L6
        goto L17
    L10:
        r11 = r9.connectGatt(r1, false, this.z, r4);     // Catch: Exception -> L6
    L6:
        e = move-exception;
        e.printStackTrace();
        r11 = null;
        goto L13
    }

    private void c(BluetoothDevice r3) {
        BleDevice r0 = e(r3);
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.getConnectParam().isNeedChangeBleMtu() == true) goto L8;
    L10:
        boolean r1 = false;
    L11:
        a(r3, r1);
        return;
    L8:
        if (r0.getConnectParam().getRequestMtu() <= 20) goto L10;
        r1 = true;
        goto L11
    }

    @SuppressLint({"MissingPermission"})
    private void d() {
        Iterator<BluetoothDevice> r0 = getConnectedBleDevices().iterator();
    L4:
        if (r0.hasNext() == false) goto L12;
        BluetoothDevice r1 = r0.next();
        BluetoothGatt r2 = getDeviceGatt(r1);
        if (r2 == null) goto L4;
        if (BluetoothUtil.isBluetoothEnable() == false) goto L11;
        r2.disconnect();
        a(r2);
    L11:
        this.t.onBleConnection(r1, 0);
        goto L4
    L12:
        this.s.clear();
        g();
    }

    private long e() {
        return Calendar.getInstance().getTimeInMillis();
    }

    private boolean f(BluetoothDevice r3) {
        Iterator<BluetoothDevice> r0 = getConnectedBleDevices().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (BluetoothUtil.deviceEquals(r0.next(), r3) == false) goto L4;
        return true;
    L9:
        return false;
    }

    private void g(BluetoothDevice r4) {
        JL_Log.d(this.TAG, "reconnectBleDevice", CommonUtil.formatString("Prepare to reconnect the device[%s].", new Object[]{printBtDeviceInfo(r4)}));
        this.y = r4;
        executeTimeoutTask(12293, r4, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        i(r4);
    }

    private void h(BluetoothDevice r3) {
        if (r3 == null) goto L12;
        BleDevice r4 = this.s.remove(r3.getAddress());
        if (r4 == null) goto L11;
        BluetoothGatt r0 = r4.getBluetoothGatt();
        if (r0 == null) goto L9;
        a(r0);
    L9:
        r4.setBluetoothGatt(null).setUsing(false).setBleMtu(20).setConnection(0);
        return;
    L11:
        return;
    }

    private void i(BluetoothDevice r2) {
        if (disconnectBLEDevice(r2) == true) goto L6;
        a(r2, 0);
        return;
    }

    public static /* synthetic */ void iO(BluetoothBle r0, BluetoothDevice r1, BleCharacteristic r2) {
        r0.a(r1, r2);
    }

    public void addOnBtBleListener(OnBtBleListener r2) {
        this.t.addCallback(r2);
    }

    public boolean connectBLEDevice(BluetoothDevice r12, BleConnectParam r13) {
        if (isInvalidEnv("connectBLEDevice", r12) == true) goto L31;
        if (r13 == null) goto L31;
        JL_Log.d(this.TAG, "connectBLEDevice", CommonUtil.formatString("device: %s, %s.", new Object[]{printBtDeviceInfo(r12), r13}));
        if (isConnectedBLEDevice(r12) == false) goto L10;
        JL_Log.i(this.TAG, "connectBLEDevice", "Device is connected.");
        this.t.onBleConnection(r12, 2);
        return true;
    L10:
        BluetoothDevice r1 = getConnectingBleDevice();
        if (r1 == null) goto L18;
        JL_Log.i(this.TAG, "connectBLEDevice", CommonUtil.formatString("Connecting BLE[%s].", new Object[]{printBtDeviceInfo(r1)}));
        if (BluetoothUtil.deviceEquals(r1, r12) == false) goto L15;
        return true;
    L15:
        JL_Log.i(this.TAG, "connectBLEDevice", CommonUtil.formatString("Disconnect the currently connected device(%s) and connect the new device(%s).", new Object[]{r1, r12}));
        this.y = r12;
        executeTimeoutTask(12293, r12, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        if (disconnectBLEDevice(r1) == false) goto L18;
        return true;
    L18:
        this.x = e();
        BleDevice r2 = a(r12, r13);
        BluetoothDevice r7 = getUsingBleDevice();
        if (r7 != null) goto L21;
    L25:
        executeTimeoutTask(12289, r12, r13.getTimeout());
        a(r12, 1);
        BluetoothGatt r14 = b(r12, r13);
        if (r14 != null) goto L29;
        a(r12, 0);
        return false;
    L29:
        JL_Log.d(this.TAG, "connectBLEDevice", "start connect ble. startTime : " + this.x);
        r2.setBluetoothGatt(r14);
        return true;
    L21:
        if (BluetoothUtil.deviceEquals(r7, r12) == true) goto L25;
        JL_Log.i(this.TAG, "connectBLEDevice", CommonUtil.formatString("The device is different from the currently connected device, so disconnect the currently connected device[%s].", new Object[]{printBtDeviceInfo(r7)}));
        this.y = r12;
        executeTimeoutTask(12293, r12, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        if (disconnectBLEDevice(r7) == false) goto L25;
        return true;
    L31:
        return false;
    }

    public boolean disconnectBLEDevice(BluetoothDevice r8) {
        if (isInvalidEnv("disconnectBLEDevice", r8) == false) goto L5;
        return false;
    L5:
        JL_Log.d(this.TAG, "disconnectBLEDevice", "device : " + printBtDeviceInfo(r8));
        BluetoothGatt r1 = getDeviceGatt(r8);     // Catch: Exception -> L11
        if (BluetoothUtil.deviceEquals(getConnectingBleDevice(), r8) == false) goto L15;
        JL_Log.i(this.TAG, "disconnectBLEDevice", "Stop connecting deice. gatt = " + r1);     // Catch: Exception -> L11
        if (r1 == null) goto L13;
        r1.disconnect();     // Catch: Exception -> L11
        a(r1);     // Catch: Exception -> L11
    L13:
        a(r8, 0);     // Catch: Exception -> L11
        return true;
    L15:
        if (r1 != null) goto L17;
        return false;
    L17:
        executeTimeoutTask(12292, r8, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);     // Catch: Exception -> L11
        r1.disconnect();     // Catch: Exception -> L11
        return true;
    L11:
        e = move-exception;
        JL_Log.w(this.TAG, "disconnectBLEDevice", "IO Exception : " + e);
        return false;
    }

    public int getBleMtu(BluetoothDevice r2) {
        BleDevice r3 = e(r2);
        if (r3 != null) goto L5;
        return 0;
    L5:
        if (r3.isConnected() == true) goto L8;
        return 0;
    L8:
        return r3.getBleMtu();
    }

    public List<BluetoothDevice> getConnectedBleDevices() {
        ArrayList r0 = new ArrayList();
        Iterator<BleDevice> r1 = this.s.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        BleDevice r2 = r1.next();
        if (r2.isConnected() == false) goto L4;
        r0.add(r2.getDevice());
        goto L4
    L8:
        return r0;
    }

    public BluetoothDevice getConnectingBleDevice() {
        Iterator<BleDevice> r0 = this.s.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        BleDevice r1 = r0.next();
        if (r1.getConnection() != 1) goto L4;
        return r1.getDevice();
    L9:
        return null;
    }

    public BluetoothGatt getDeviceGatt(BluetoothDevice r1) {
        BleDevice r2 = e(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getBluetoothGatt();
    }

    public BluetoothDevice getUsingBleDevice() {
        Iterator<BleDevice> r0 = this.s.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        BleDevice r1 = r0.next();
        if (r1.isConnected() == false) goto L4;
        if (r1.isUsing() == false) goto L4;
        return r1.getDevice();
    L11:
        return null;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public boolean handleMessageEvent(@NonNull Message r8) {
        switch(r8.what) {
            case 12289: goto L43;
            case 12290: goto L25;
            case 12291: goto L21;
            case 12292: goto L14;
            case 12293: goto L5;
            default: goto L48;
        };
    L5:
        Object r0 = r8.obj;
        if ((r0 instanceof BluetoothDevice) == true) goto L8;
        return false;
    L8:
        BluetoothDevice r1 = (BluetoothDevice) r0;
        BleDevice r2 = e(r1);
        if (r2 != null) goto L11;
        return false;
    L11:
        BleConnectParam r3 = r2.getConnectParam();
        JL_Log.d(this.TAG, "MSG_RECONNECT_BLE", "device: " + printBtDeviceInfo(r1));
        if (connectBLEDevice(r1, r3) == true) goto L48;
        a(r1, 0);
        goto L48
    L14:
        Object r4 = r8.obj;
        if ((r4 instanceof BluetoothDevice) == true) goto L17;
        return false;
    L17:
        BluetoothDevice r5 = (BluetoothDevice) r4;
        BluetoothGatt r6 = getDeviceGatt(r5);
        if (r6 != null) goto L20;
        return false;
    L20:
        JL_Log.d(this.TAG, "MSG_DISCONNECT_BLE_TIMEOUT", "device: " + printBtDeviceInfo(r5));
        a(r6);
        a(r5, 0);
        goto L48
    L21:
        Object r7 = r8.obj;
        if ((r7 instanceof BluetoothDevice) == true) goto L24;
        return false;
    L24:
        BluetoothDevice r9 = (BluetoothDevice) r7;
        JL_Log.d(this.TAG, "MSG_ADJUST_BLE_MTU_TIMEOUT", "device: " + printBtDeviceInfo(r9));
        b(r9);
        goto L48
    L25:
        Object r10 = r8.obj;
        if ((r10 instanceof BluetoothDevice) == true) goto L28;
        return false;
    L28:
        BluetoothDevice r11 = (BluetoothDevice) r10;
        BleDevice r12 = e(r11);
        if (r12 != null) goto L31;
        return false;
    L31:
        BluetoothGatt r13 = r12.getBluetoothGatt();
        if (r13 != null) goto L34;
        return false;
    L34:
        JL_Log.d(this.TAG, "MSG_DISCOVERY_SERVICE_TIMEOUT", "device : " + printBtDeviceInfo(r11));
        List<BluetoothGattService> r14 = r13.getServices();
        if (r14 == null) goto L40;
        if (r14.isEmpty() == true) goto L40;
        a(r13, 0);
    L40:
        if (r12.isOverRetryLimit() == false) goto L42;
        i(r11);
        goto L48
    L42:
        g(r11);
        goto L48
    L43:
        Object r15 = r8.obj;
        if ((r15 instanceof BluetoothDevice) == true) goto L46;
        return false;
    L46:
        BluetoothDevice r16 = (BluetoothDevice) r15;
        JL_Log.d(this.TAG, "MSG_CONNECT_BLE_TIMEOUT", "device : " + printBtDeviceInfo(r16));
        i(r16);
    L48:
        return super.handleMessageEvent(r8);
    }

    public boolean isBleConnecting() {
        if (getConnectingBleDevice() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isConnectedBLEDevice(BluetoothDevice r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return f(r1);
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public void onAdapterStatus(boolean r3) {
        super.onAdapterStatus(r3);
        if (r3 == true) goto L6;
        JL_Log.i(this.TAG, "ACTION_STATE_CHANGED", "Bluetooth is off.");
        d();
        return;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles, com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public void release() {
        disconnectBLEDevice(getConnectingBleDevice());
        d();
        b();
        this.u.clear();
        this.t.release();
        super.release();
    }

    public void removeOnBtBleListener(OnBtBleListener r2) {
        this.t.removeCallback(r2);
    }

    public boolean requestBleMtu(final BluetoothDevice r6, final int r7) {
        if (isInvalidEnv("requestBleMtu", r6) == false) goto L5;
        return false;
    L5:
        final BluetoothGatt r1 = getDeviceGatt(r6);
        if (r1 != null) goto L9;
        JL_Log.w(this.TAG, "requestBleMtu", "BluetoothGatt is null.");
        return false;
    L9:
        JL_Log.d(this.TAG, "requestBleMtu", CommonUtil.formatString("Start requesting MTU[%d].", new Object[]{Integer.valueOf(r7 + 3)}));
        runOnMainThread(new XIi00iiXO(this, r6, r1, r7));
        return true;
    }

    public void sendBleData(BleSendParam r2) {
        a(new BleSendTask(r2));
    }

    public boolean switchBleCharacteristic(BluetoothGatt r12, BleCharacteristic r13) {
        boolean r1 = false;
        if (r13 != null) goto L6;
        JL_Log.w(this.TAG, "switchBleCharacteristic", "Invalid parameter.");
        return false;
    L6:
        if (r12 != null) goto L10;
        JL_Log.w(this.TAG, "switchBleCharacteristic", "BluetoothGatt is null.");
        return false;
    L10:
        if (isInvalidEnv("switchBleCharacteristic", r12.getDevice()) == false) goto L12;
        return false;
    L12:
        JL_Log.d(this.TAG, "switchBleCharacteristic", "" + r13);
        BluetoothGattService r0 = r12.getService(r13.getServiceUUID());
        if (r0 != null) goto L16;
        JL_Log.w(this.TAG, "switchBleCharacteristic", "GattService is null.");
        return false;
    L16:
        BluetoothGattCharacteristic r2 = r0.getCharacteristic(r13.getCharacteristicUUID());
        if (r2 != null) goto L20;
        JL_Log.w(this.TAG, "switchBleCharacteristic", "GattCharacteristic is null.");
        return false;
    L20:
        BluetoothGattDescriptor r6 = a(r2, r13.getRequiredProperty());
        if (r6 != null) goto L41;
        JL_Log.w(this.TAG, "switchBleCharacteristic", "GattDescriptor is null.");
        return false;
    L41:
        r1 = r12.setCharacteristicNotification(r2, r13.isEnable());     // Catch: RuntimeException -> L26
    L28:
        if (r1 == true) goto L30;
        BluetoothBle r4 = this;
        JL_Log.d(r4.TAG, "switchBleCharacteristic", "BluetoothGatt#setCharacteristicNotification is failed.");
    L39:
        JL_Log.d(r4.TAG, "switchBleCharacteristic", "result : " + r1);
        return r1;
    L30:
        if (r13.isEnable() == true) goto L32;
        byte[] r3 = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
    L37:
        r4 = this;
        r1 = r4.a(r12, r6, r3, 0, r13.getRetryLimit(), false);
        goto L39
    L32:
        if (r13.getRequiredProperty() != 32) goto L35;
        r3 = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        goto L37
    L35:
        r3 = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
    L26:
        e = move-exception;
        JL_Log.w(this.TAG, "switchBleCharacteristic", "Exception : " + e.getMessage());
        goto L28
    }

    public void switchConnectedBleDevice(BluetoothDevice r3) {
        BluetoothDevice r0 = getUsingBleDevice();
        if (BluetoothUtil.deviceEquals(r0, r3) == true) goto L12;
        if (r3 == null) goto L13;
        BleDevice r1 = e(r0);
        if (r1 == null) goto L8;
        r1.setUsing(false);
    L8:
        BleDevice r2 = e(r3);
        if (r2 == null) goto L14;
        r2.setUsing(true);
        this.t.onSwitchBleDevice(r3);
        return;
    L14:
        return;
    L13:
        return;
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    public synchronized boolean writeBleData(BleSendParam r6) {
        monitor-enter(this);
        boolean r0 = false;
        if (r6 != null) goto L10;
        JL_Log.w(this.TAG, "writeBleData", "BleSendParam is null.");     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L10:
        BluetoothGatt r1 = getDeviceGatt(r6.getDevice());     // Catch: Throwable -> L8
        if (r1 != null) goto L15;
        JL_Log.w(this.TAG, "writeBleData", "Bluetooth gatt is close.");     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L15:
        BluetoothGattService r2 = r1.getService(r6.getServiceUUID());     // Catch: Throwable -> L8
        if (r2 != null) goto L20;
        JL_Log.w(this.TAG, "writeBleData", "Unable to find service");     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L20:
        BluetoothGattCharacteristic r3 = r2.getCharacteristic(r6.getCharacteristicUUID());     // Catch: Throwable -> L8
        if (r3 != null) goto L26;
        JL_Log.w(this.TAG, "writeBleData", "Characteristic value not found.");     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L26:
        if ((r3.getProperties() & 76) != 0) goto L30;
        JL_Log.w(this.TAG, "writeBleData", "No available feature values.");     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L30:
        byte[] r4 = r6.getData();     // Catch: Throwable -> L8
        if (r4.length != 0) goto L50;
        JL_Log.w(this.TAG, "writeBleData", "Data is null.");     // Catch: Throwable -> L8
        monitor-exit(this);
        return false;
    L50:
        r3.setValue(r4);     // Catch: Throwable -> L8 Exception -> L40
        int r7 = r6.getWriteType();     // Catch: Throwable -> L8 Exception -> L40
        if (r7 != 0) goto L38;
    L42:
        r0 = r1.writeCharacteristic(r3);     // Catch: Throwable -> L8 Exception -> L40
    L45:
        JL_Log.d(this.TAG, "writeBleData", "Send data : " + r0);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r0;
    L38:
        if (r7 == r3.getWriteType()) goto L42;
        r3.setWriteType(r7);     // Catch: Throwable -> L8 Exception -> L40
    L40:
        e = move-exception;
        JL_Log.w(this.TAG, "writeBleData", "IO Exception : " + e);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothGatt r1, BluetoothGattCharacteristic r2, byte[] r3) {
        r0.a(r1, r2, r3);
    }

    private BleDevice e(BluetoothDevice r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return this.s.get(r2.getAddress());
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothGatt r1, BluetoothGattCharacteristic r2, byte[] r3, int r4) {
        r0.a(r1, r2, r3, r4);
    }

    private void f() {
        if (this.w != null) goto L6;
        SendBleDataThread r0 = new SendBleDataThread(new AnonymousClass1(this), new XO0O10(this));
        this.w = r0;
        r0.start();
        return;
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothDevice r1, UUID r2, UUID r3, int r4, byte[] r5) {
        r0.a(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothGatt r1, int r2, int r3) {
        r0.a(r1, r2, r3);
    }

    private void g() {
        SendBleDataThread r0 = this.w;
        if (r0 == null) goto L6;
        r0.stopThread();
        return;
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothDevice r1, UUID r2, UUID r3, boolean r4) {
        r0.a(r1, r2, r3, r4);
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothDevice r1, int r2, int r3, boolean r4) {
        r0.a(r1, r2, r3, r4);
    }

    public static /* synthetic */ void a(BluetoothBle r0, BluetoothGatt r1, int r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ boolean a(BluetoothBle r0, BluetoothDevice r1) {
        return r0.f(r1);
    }

    private void d(final BluetoothDevice r6) {
        if (this.u.isEmpty() == false) goto L6;
        JL_Log.d(this.TAG, "enableBleCharacteristic", "characteristicsTaskQueue is empty.");
        c(r6);
        return;
    L6:
        final BleCharacteristic r0 = this.u.peek();
        JL_Log.d(this.TAG, "enableBleCharacteristic", "next task. " + r0);
        runOnMainThread(new iO(this, r6, r0));
    }

    private /* synthetic */ void a(BluetoothDevice r4, BluetoothGatt r5, int r6) {
        executeTimeoutTask(12291, r4, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        boolean r7 = r5.requestMtu(r6 + 3);
        JL_Log.d(this.TAG, "requestBleMtu", CommonUtil.formatString("Request MTU operation result: %s", new Object[]{Boolean.valueOf(r7)}));
        if (r7 == true) goto L6;
        b(r4);
        return;
    }

    private void b(BluetoothDevice r4) {
        a(r4, 20, 0, true);
    }

    private void b() {
        BluetoothBleReceiver r0 = this.v;
        if (r0 == null) goto L8;
        Context r1 = this.mContext;
        if (r1 == null) goto L9;
        r1.unregisterReceiver(r0);
        this.v = null;
        return;
    L9:
        return;
    }

    private BleDevice a(BluetoothDevice r2, BleConnectParam r3) {
        BleDevice r0 = e(r2);
        if (r0 != null) goto L6;
        BleDevice r1 = new BleDevice(r2, r3);
        this.s.put(r2.getAddress(), r1);
        return r1;
    L6:
        return r0;
    }

    private void a(BluetoothGatt r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (CommonUtil.checkHasConnectPermission(this.mContext) == false) goto L9;
        BluetoothUtil.refreshBleDeviceCache(this.mContext, r2);
        r2.close();
        return;
    }

    private void a(BluetoothDevice r4, int r5, int r6, boolean r7) {
        removeTimeoutTask(12291);
        BleDevice r0 = e(r4);
        if (r0 == null) goto L6;
        if (r6 != 0) goto L6;
        r0.setBleMtu(r5);
    L6:
        this.t.onMtuChanged(getDeviceGatt(r4), r5, r6);
        if (r0 != null) goto L9;
        return;
    L9:
        if (r0.getConnection() != 1) goto L14;
        if (r7 == false) goto L15;
        a(r4, false);
        return;
    L15:
        return;
    }

    private void a(BluetoothDevice r4, boolean r5) {
        JL_Log.d(this.TAG, "dealWithBleConnected", "device : " + r4 + ", isNeedChangeMtu = " + r5);
        BleDevice r0 = e(r4);
        if (r0 == null) goto L15;
        if (r5 == false) goto L13;
        int r6 = r0.getConnectParam().getRequestMtu();
        if (r0.isConnectATT() == false) goto L11;
        r0.setBleMtu(r6);
        this.t.onMtuChanged(r0.getBluetoothGatt(), r6, 0);
        a(r4, false);
        return;
    L11:
        if (requestBleMtu(r4, r6) == false) goto L13;
        return;
    L13:
        a(r4, 2);
        return;
    }

    private BluetoothGattDescriptor a(@Nullable BluetoothGattCharacteristic r3, int r4) {
        if (r3 != null) goto L6;
        return null;
    L6:
        if ((r4 & r3.getProperties()) != 0) goto L9;
        return null;
    L9:
        return r3.getDescriptor(BluetoothConstant.UUID_CLIENT_CHARACTERISTIC_CONFIG);
    }

    @SuppressLint({"MissingPermission"})
    private boolean a(BluetoothGatt r4, BluetoothGattDescriptor r5) {
        if (r4 == null) goto L7;
        if (r5 == null) goto L9;
        BluetoothGattCharacteristic r0 = r5.getCharacteristic();
        int r1 = r0.getWriteType();
        r0.setWriteType(2);
        boolean r6 = r4.writeDescriptor(r5);
        r0.setWriteType(r1);
        return r6;
    L9:
        return false;
    L7:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    private boolean a(BluetoothGatt r9, BluetoothGattDescriptor r10, byte[] r11, int r12, int r13, boolean r14) {
        if (r14 == true) goto L4;
        boolean r1 = r10.setValue(r11);
    L5:
        if (r1 == false) goto L14;
        boolean r7 = a(r9, r10);
        JL_Log.d(this.TAG, "tryToWriteDescriptor", "writeDescriptorWorkaround : " + r7);
        if (r7 == true) goto L13;
        int r4 = r12 + 1;
        if (r4 <= r13) goto L12;
        JL_Log.d(this.TAG, "tryToWriteDescriptor", CommonUtil.formatString("The number of failures exceeded the limit(%d).", new Object[]{Integer.valueOf(r13)}));
        return false;
    L12:
        JL_Log.d(this.TAG, "tryToWriteDescriptor", "retryCount : " + r4);
        SystemClock.sleep(100);
        a(r9, r10, r11, r4, r13, true);
    L13:
        return r7;
    L14:
        return r1;
    L4:
        r1 = r14;
        goto L5
    }

    private /* synthetic */ void a(ThreadState r5) {
        if (r5.getState() != 0) goto L10;
        SendBleDataThread r0 = this.w;
        if (r0 != null) goto L7;
        return;
    L7:
        if (r0.getId() != r5.getId()) goto L12;
        this.w = null;
        return;
    L12:
        return;
    }

    private void a(@NonNull BleSendTask r8) {
        if (this.w != null) goto L5;
    L7:
        boolean r0 = false;
    L8:
        if (r0 == true) goto L13;
        OnBleSendDataCallback r1 = r8.getCallback();
        if (r1 == null) goto L14;
        r1.onResult(r8.getDevice(), r8.getServiceUUID(), r8.getCharacteristicUUID(), false, r8.getData());
        return;
    L14:
        return;
    L13:
        return;
    L5:
        if (f(r8.getDevice()) == false) goto L7;
        r0 = this.w.addSendTask(r8);
        goto L8
    }

    private void a(BluetoothDevice r3, UUID r4, UUID r5, int r6, byte[] r7) {
        SendBleDataThread r0 = this.w;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isRunning() == false) goto L9;
        this.w.wakeupSendThread(new BleSendTask(r3, r4, r5, r7).setStatus(r6));
        return;
    }

    private /* synthetic */ void a(BluetoothDevice r3, BleCharacteristic r4) {
        if (switchBleCharacteristic(getDeviceGatt(r3), r4) == true) goto L6;
        JL_Log.d(this.TAG, "enableBleCharacteristic", "Failed to enable characteristic.");
        i(r3);
        return;
    }

    private void a(BluetoothGatt r9, int r10) {
        this.t.onServicesDiscovered(r9, r10);
        if (r9 != null) goto L5;
        return;
    L5:
        if (r9.getServices() != null) goto L7;
        return;
    L7:
        if (r9.getDevice() == null) goto L51;
        BluetoothDevice r11 = r9.getDevice();
        BleDevice r0 = e(r11);
        if (r0 == null) goto L52;
        this.u.clear();
        List<BleCharacteristic> r1 = r0.getConnectParam().getBleCharacteristicList();
        if (r1.isEmpty() == false) goto L16;
        JL_Log.d(this.TAG, "onBleServiceDiscovery", "none character list. Callback connection successful.");
        c(r11);
        return;
    L16:
        Iterator<BluetoothGattService> r12 = r9.getServices().iterator();
        boolean r2 = false;
    L18:
        if (r12.hasNext() == false) goto L33;
        BluetoothGattService r3 = r12.next();
        Iterator<BleCharacteristic> r4 = r1.iterator();
    L21:
        if (r4.hasNext() == false) goto L18;
        BleCharacteristic r5 = r4.next();
        if (UuidUtil.equalUUID(r3.getUuid(), r5.getServiceUUID()) == false) goto L21;
        BluetoothGattCharacteristic r6 = r3.getCharacteristic(r5.getCharacteristicUUID());
        if (r6 == null) goto L21;
        if ((r6.getProperties() & r5.getRequiredProperty()) == 0) goto L21;
        boolean r7 = r5.hasProperty(16);
        boolean r8 = r5.hasProperty(32);
        if (r7 == true) goto L31;
        if (r8 == true) goto L31;
    L32:
        r2 = true;
    L31:
        this.u.add(r5);
        goto L32
    L33:
        JL_Log.d(this.TAG, "onBleServiceDiscovery", "isServiceFound : " + r2);
        if (r2 == true) goto L37;
        i(r11);
        return;
    L37:
        d(r11);
        return;
    L52:
        return;
    }

    private void a(BluetoothDevice r6, int r7) {
        BleDevice r0 = e(r6);
        if (r0 == null) goto L33;
        int r1 = r0.getConnection();
        JL_Log.d(this.TAG, "notifyBleConnectStatus", "previousState = " + BluetoothUtil.printBtConnectionState(r1) + ", state = " + BluetoothUtil.printBtConnectionState(r7) + ",\n " + r0);
        if (r1 != r7) goto L9;
        return;
    L9:
        if (r7 != 1) goto L11;
    L17:
        r0.setConnection(r7);
        BluetoothDevice r2 = getUsingBleDevice();
        if (r7 != 0) goto L20;
        h(r6);
        List<BluetoothDevice> r3 = getConnectedBleDevices();
        if (r3.isEmpty() == false) goto L29;
        g();
    L31:
        this.t.onBleConnection(r6, r7);
        return;
    L29:
        if (BluetoothUtil.deviceEquals(r2, r6) == false) goto L31;
        switchConnectedBleDevice(r3.get(r3.size() - 1));
        goto L31
    L20:
        if (r7 != 2) goto L31;
        if (r2 != null) goto L24;
        switchConnectedBleDevice(r6);
    L24:
        f();
        goto L31
    L11:
        if (BluetoothUtil.deviceEquals(r6, getConnectingBleDevice()) == false) goto L14;
        removeTimeoutTask(12289);
    L14:
        if (BluetoothUtil.deviceEquals(r6, this.y) == false) goto L16;
        removeTimeoutTask(12293);
        this.y = null;
    L16:
        this.x = 0;
        this.u.clear();
        goto L17
    }

    @SuppressLint({"MissingPermission"})
    private void a(@NonNull BluetoothGatt r13, int r14, int r15) {
        this.t.onConnectionStateChange(r13, r14, r15);
        BluetoothDevice r0 = r13.getDevice();
        if (isInvalidEnv("handleBleConnection", r0) == true) goto L65;
        BleDevice r2 = e(r0);
        if (r2 == null) goto L66;
        if (r14 == 0) goto L10;
    L15:
        boolean r3 = true;
        if (r15 != 1) goto L19;
        a(r0, 1);
        return;
    L19:
        if (r15 != 0) goto L64;
        removeTimeoutTask(12292);
        boolean r4 = isHasTimeoutTask(12293);
        if (r4 == false) goto L23;
        removeTimeoutTask(12293);
    L23:
        a(r13);
        r2.setBluetoothGatt(null).setBleMtu(20);
        long r5 = e();
        long r7 = this.x;
        if (r7 <= 0) goto L26;
        boolean r16 = true;
    L27:
        if (r16 == true) goto L29;
    L31:
        boolean r6 = false;
    L32:
        if (r14 == 0) goto L35;
        JL_Log.i(this.TAG, "handleBleConnection", "Error :(0x" + Integer.toHexString(r14) + "): " + GattError.parseConnectionError(r14));
    L35:
        if (r2.isConnected() == true) goto L61;
        if (r4 == false) goto L38;
    L47:
        JL_Log.d(this.TAG, "handleBleConnection", "mac : " + r0 + ", needReconnect : " + r4 + ", canTimeout : " + r16 + ", timeout : " + r6 + ", isAllowReconnect = " + r3);
        if (r3 == false) goto L61;
        JL_Log.d(this.TAG, "handleBleConnection", "retry connect ble.");
        this.u.clear();
        if (this.y != null) goto L52;
    L54:
        r2.setConnection(0);
    L55:
        BluetoothDevice r17 = this.y;
        if (r17 == null) goto L59;
        r0 = r17;
    L59:
        executeTimeoutTask(12293, r0, 2000);
        return;
    L52:
        if (BluetoothUtil.deviceEquals(this.y, r0) == true) goto L54;
        JL_Log.d(this.TAG, "handleBleConnection", "Successfully disconnected the previous device.");
        a(r0, 0);
        goto L55
    L38:
        if (r14 == 133) goto L40;
    L46:
        r3 = false;
        goto L47
    L40:
        if (r2.getConnectParam().isReconnect() == false) goto L46;
        if (r2.getConnectParam().canRetry() == false) goto L46;
        if (r16 == false) goto L46;
        if (r6 == true) goto L46;
    L61:
        JL_Log.d(this.TAG, "handleBleConnection", "callback device is disconnected.");
        a(r0, 0);
        return;
    L29:
        if (r5 <= (r7 + 25000)) goto L31;
        r6 = true;
        goto L32
    L26:
        r16 = false;
        goto L27
    L64:
        return;
    L10:
        if (r15 != 2) goto L15;
        r2.setBluetoothGatt(r13);
        executeTimeoutTask(12290, r0, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        boolean r18 = r13.discoverServices();
        JL_Log.d(this.TAG, "handleBleConnection", "discoverServices : " + r18);
        if (r18 == true) goto L63;
        removeTimeoutTask(12290);
        i(r0);
        return;
    L63:
        return;
    L66:
        return;
    }

    private void a(BluetoothDevice r3, UUID r4, UUID r5, boolean r6) {
        if (this.u.isEmpty() == true) goto L22;
        BleCharacteristic r0 = this.u.peek();
        if (r0 != null) goto L9;
        return;
    L9:
        if (r0.getServiceUUID().equals(r4) == true) goto L11;
        return;
    L11:
        if (r0.getCharacteristicUUID().equals(r5) == false) goto L21;
        if (r6 == false) goto L14;
        this.u.poll();
    L18:
        d(r3);
        return;
    L14:
        if (r0.isOverLimit() == false) goto L18;
        JL_Log.i(this.TAG, "onBleNotificationStatus", "Failed to enable characteristic.");
        i(r3);
        return;
    L21:
        return;
    }

    private void a(BluetoothGatt r6, BluetoothGattCharacteristic r7, byte[] r8) {
        BluetoothDevice r0 = r6.getDevice();
        UUID r1 = r7.getService().getUuid();
        UUID r2 = r7.getUuid();
        JL_Log.i(this.TAG, "onCharacteristicChanged", CommonUtil.formatString("<<< device = %s, service = %s, characteristic = %s,\n data = [%s].", new Object[]{printBtDeviceInfo(r0, false), UuidUtil.read16BitUUID(r1), UuidUtil.read16BitUUID(r2), CHexConver.byte2HexStr(r8)}));
        this.t.onCharacteristicChanged(r6, r7);
    }

    private void a(BluetoothGatt r6, BluetoothGattCharacteristic r7, byte[] r8, int r9) {
        BluetoothDevice r0 = r6.getDevice();
        UUID r1 = r7.getService().getUuid();
        UUID r2 = r7.getUuid();
        JL_Log.i(this.TAG, "onCharacteristicRead", CommonUtil.formatString("<<< device = %s, service = %s, characteristic = %s,\n data = [%s].", new Object[]{printBtDeviceInfo(r0, false), UuidUtil.read16BitUUID(r1), UuidUtil.read16BitUUID(r2), CHexConver.byte2HexStr(r8)}));
        this.t.onCharacteristicRead(r6, r7, r9);
    }

    private void a() {
        if (this.v == null) goto L5;
        return;
    L5:
        if (this.mContext == null) goto L9;
        this.v = new BluetoothBleReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        r0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        this.mContext.registerReceiver(this.v, r0);
        return;
    }
}
