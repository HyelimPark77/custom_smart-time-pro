package com.jieli.jl_bt_ota.impl.bt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class BluetoothDiscovery extends BluetoothBase {
    private static final int m = 4660;
    private static final int n = 4661;
    private final List<BluetoothDevice> c;
    private final List<BluetoothDevice> d;
    private BluetoothDiscoveryReceiver e;
    private BluetoothLeScanner f;
    private volatile int g;
    private volatile boolean h;
    private volatile boolean i;
    private final OnBtAssistantCallback j;
    private final BluetoothAdapter.LeScanCallback k;

    @RequiresApi(21)
    private final ScanCallback l;

    public class BluetoothDiscoveryReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothDiscovery a;

        private BluetoothDiscoveryReceiver(BluetoothDiscovery r1) {
            this.a = r1;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context r7, Intent r8) {
            String r2 = r8.getAction();
            if (r2 == null) goto L57;
            byte r4 = -1;
            switch(r2.hashCode()) {
                case -1780914469: goto L17;
                case 6759640: goto L13;
                case 1167529923: goto L9;
                default: goto L20;
            };
        L20:
            switch(r4) {
                case 0: goto L51;
                case 1: goto L47;
                case 2: goto L22;
                default: goto L58;
            };
        L22:
            BluetoothDevice r3 = (BluetoothDevice) r8.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r3 != null) goto L25;
            return;
        L25:
            if (BluetoothDiscovery.a(this.a, "ACTION_FOUND", true) == false) goto L28;
            return;
        L28:
            if (BluetoothDiscovery.b(this.a) != 1) goto L33;
            if (r3.getType() == 2) goto L33;
        L39:
            boolean r9 = true;
        L41:
            short r10 = r8.getShortExtra("android.bluetooth.device.extra.RSSI", 0);
            if (r9 == true) goto L44;
            return;
        L44:
            if (BluetoothDiscovery.c(this.a).contains(r3) == true) goto L55;
            JL_Log.d(this.a.TAG, "ACTION_FOUND", "device : " + this.a.printBtDeviceInfo(r3) + ", RSSI : " + r10);
            BluetoothDiscovery.c(this.a).add(r3);
            this.a.mCallbackManager.onDiscovery(r3, new BleScanMessage().setRssi(r10).setEnableConnect(true));
            return;
        L55:
            return;
        L33:
            if (BluetoothDiscovery.b(this.a) != 0) goto L38;
            if (r3.getType() != 1) goto L39;
        L38:
            if (BluetoothDiscovery.b(this.a) == 2) goto L39;
            r9 = false;
            goto L41
        L47:
            JL_Log.d(this.a.TAG, "ACTION_DISCOVERY_STARTED", "---->");
            if (this.a.isDeviceScanning() == true) goto L56;
            BluetoothDiscovery.a(this.a, true);
            return;
        L56:
            return;
        L51:
            JL_Log.d(this.a.TAG, "ACTION_DISCOVERY_FINISHED", "---->");
            BluetoothDiscovery.a(this.a, false);
            return;
        L58:
            return;
        L9:
            if (r2.equals("android.bluetooth.device.action.FOUND") == false) goto L20;
            r4 = 2;
            goto L20
        L13:
            if (r2.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED") == false) goto L20;
            r4 = 1;
            goto L20
        L17:
            if (r2.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED") == false) goto L20;
            r4 = 0;
            goto L20
        }

        public /* synthetic */ BluetoothDiscoveryReceiver(BluetoothDiscovery r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public BluetoothDiscovery(Context r2) {
        super(r2);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.h = false;
        this.i = false;
        OnBtAssistantCallback r3 = new AnonymousClass1(this);
        this.j = r3;
        this.k = new O00(this);
        this.l = new AnonymousClass2(this);
        BluetoothAdapter r0 = this.mBluetoothAdapter;
        if (r0 == null) goto L5;
        this.f = r0.getBluetoothLeScanner();
    L5:
        addOnBtAssistantCallback(r3);
    }

    public static /* synthetic */ void OXO1(BluetoothDiscovery r0, BluetoothDevice r1, int r2, byte[] r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void a(BluetoothDiscovery r0, boolean r1) {
        r0.a(r1);
    }

    public static /* synthetic */ int b(BluetoothDiscovery r0) {
        return r0.g;
    }

    public static /* synthetic */ List c(BluetoothDiscovery r0) {
        return r0.d;
    }

    public ArrayList<BluetoothDevice> getDiscoveredBluetoothDevices() {
        if (this.g != 0) goto L7;
        return new ArrayList(this.c);
    L7:
        return new ArrayList(this.d);
    }

    public int getScanType() {
        return this.g;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public boolean handleMessageEvent(@NonNull Message r4) {
        int r0 = r4.what;
        if (r0 != m) goto L5;
        JL_Log.i(this.TAG, "MSG_STOP_EDR", "stopDeviceScan");
        stopDeviceScan();
    L10:
        return super.handleMessageEvent(r4);
    L5:
        if (r0 != n) goto L10;
        JL_Log.i(this.TAG, "MSG_STOP_BLE", "stopBLEScan");
        stopBLEScan();
        goto L10
    }

    public boolean isBleScanning() {
        return this.h;
    }

    public boolean isDeviceScanning() {
        return this.i;
    }

    public boolean isScanning() {
        if (this.i == false) goto L5;
        return true;
    L5:
        if (this.h == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public void release() {
        removeOnBtAssistantCallback(this.j);
        b();
        stopDeviceScan();
        stopBLEScan();
        c();
        super.release();
    }

    @SuppressLint({"MissingPermission"})
    public int startBLEScan(long r10) {
        if (a("startBLEScan") == false) goto L7;
        return 4113;
    L7:
        if (isDeviceScanning() == false) goto L16;
        JL_Log.d(this.TAG, "startBLEScan", "stopDeviceScan");
        if (stopDeviceScan() != 0) goto L16;
        int r1 = 0;
    L11:
        SystemClock.sleep(50);
        r1 = r1 + 50;
        if (r1 > 1000) goto L16;
        if (this.mBluetoothAdapter.isDiscovering() == true) goto L11;
    L16:
        a(0);
        if (r10 > 0) goto L20;
        r10 = 8000;
    L20:
        if (isBleScanning() == false) goto L27;
        JL_Log.i(this.TAG, "startBLEScan", "scanning ble ..... timeout = " + r10);
        BluetoothLeScanner r0 = this.f;
        if (r0 == null) goto L24;
        r0.flushPendingScanResults(this.l);
    L24:
        executeTimeoutTask(n, null, r10);
        a(true);
        return 0;
    L27:
        if (this.f == null) goto L29;
        ScanSettings r2 = new ScanSettings.Builder().setScanMode(getBluetoothOption().getBleScanMode()).setMatchMode(1).setNumOfMatches(3).build();
        this.f.startScan(new ArrayList(), r2, this.l);
        JL_Log.d(this.TAG, "startBLEScan", "startScan : true");
    L33:
        JL_Log.i(this.TAG, "startBLEScan", "Ready to scan, timeout : " + r10);
        executeTimeoutTask(n, null, r10);
        a(true);
        return 0;
    L29:
        boolean r3 = this.mBluetoothAdapter.startLeScan(this.k);
        JL_Log.d(this.TAG, "startBLEScan", "startLeScan : " + r3);
        if (r3 == true) goto L33;
        return 8194;
    }

    @SuppressLint({"MissingPermission"})
    public int startDeviceScan(long r10, int r12) {
        if (r12 != 0) goto L6;
        return startBLEScan(r10);
    L6:
        if (a("startDeviceScan") == false) goto L10;
        return 4113;
    L10:
        if (isBleScanning() == false) goto L12;
        stopBLEScan();
        JL_Log.i(this.TAG, "startDeviceScan", "stopBLEScan.");
        SystemClock.sleep(100);
    L12:
        a(r12);
        if (r10 > 0) goto L15;
        long r1 = 8000;
    L17:
        if (isDeviceScanning() == false) goto L20;
        JL_Log.d(this.TAG, "startDeviceScan", "scanning br/edr ..... timeout = " + r10);
        executeTimeoutTask(m, null, r1);
        a(true);
        return 0;
    L20:
        a();
        boolean r11 = this.mBluetoothAdapter.startDiscovery();
        JL_Log.d(this.TAG, "startDeviceScan", "startDiscovery : " + r11);
        if (r11 == true) goto L24;
        b();
        return 8194;
    L24:
        executeTimeoutTask(m, null, r1);
        a(true);
        return 0;
    L15:
        r1 = r10;
        goto L17
    }

    @SuppressLint({"MissingPermission"})
    public int stopBLEScan() {
        if (a("stopBLEScan", true) == false) goto L7;
        return 4113;
    L7:
        if (isBleScanning() == true) goto L21;
        this.mCallbackManager.onDiscoveryStatus(true, false);
        return 0;
    L21:
        BluetoothLeScanner r1 = this.f;     // Catch: Exception -> L13
        if (r1 == null) goto L15;
        r1.stopScan(this.l);     // Catch: Exception -> L13
        JL_Log.d(this.TAG, "stopBLEScan", "stopScan");     // Catch: Exception -> L13
    L20:
    L18:
        removeTimeoutTask(n);
        a(false);
        return 0;
    L15:
        this.mBluetoothAdapter.stopLeScan(this.k);     // Catch: Exception -> L13
        JL_Log.d(this.TAG, "stopBLEScan", "stopLeScan");     // Catch: Exception -> L13
    L13:
        e = move-exception;
        e.printStackTrace();
        goto L18
    }

    @SuppressLint({"MissingPermission"})
    public int stopDeviceScan() {
        if (a("stopDeviceScan", true) == false) goto L7;
        return 4113;
    L7:
        if (isDeviceScanning() == true) goto L10;
        this.mCallbackManager.onDiscoveryStatus(false, false);
        return 0;
    L10:
        boolean r0 = this.mBluetoothAdapter.cancelDiscovery();
        JL_Log.w(this.TAG, "stopDeviceScan", "cancelDiscovery = " + r0);
        if (r0 == true) goto L14;
        return 8194;
    L14:
        removeTimeoutTask(m);
        return 0;
    }

    public static /* synthetic */ void a(BluetoothDiscovery r0) {
        r0.c();
    }

    private void b(boolean r5) {
        List<BluetoothDevice> r0 = BluetoothUtil.getSystemConnectedBtDeviceList(this.mContext);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L39;
        Iterator<BluetoothDevice> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L40;
        BluetoothDevice r2 = r1.next();
        if (r5 == false) goto L17;
        if (a(r2) == false) goto L17;
        if (this.c.contains(r2) == true) goto L9;
        this.c.add(r2);
        this.mCallbackManager.onDiscovery(r2, new BleScanMessage());
    L17:
        if (r5 == true) goto L9;
        if (a(r2) == true) goto L9;
        if (this.d.contains(r2) == true) goto L9;
        this.d.add(r2);
        this.mCallbackManager.onDiscovery(r2, new BleScanMessage());
        goto L9
    L40:
        return;
    }

    private void c() {
        a(0);
        this.h = false;
        this.i = false;
        this.c.clear();
        this.d.clear();
    }

    public static /* synthetic */ void a(BluetoothDiscovery r0, BluetoothDevice r1, int r2, byte[] r3, boolean r4) {
        r0.a(r1, r2, r3, r4);
    }

    public static /* synthetic */ boolean a(BluetoothDiscovery r0, String r1, boolean r2) {
        return r0.a(r1, r2);
    }

    private boolean a(String r2) {
        return a(r2, false);
    }

    private boolean a(String r3, boolean r4) {
        if (CommonUtil.checkHasScanPermission(this.mContext) == true) goto L6;
        JL_Log.w(this.TAG, r3, "Missing bluetooth scan permissions.");
        return true;
    L6:
        if (r4 == true) goto L12;
        if (CommonUtil.checkHasLocationPermission(this.mContext) == true) goto L12;
        JL_Log.w(this.TAG, r3, "Missing location permissions.");
        return true;
    L12:
        if (this.mBluetoothAdapter != null) goto L16;
        JL_Log.w(this.TAG, r3, "The device is not supported bluetooth.");
        return true;
    L16:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L19;
        JL_Log.w(this.TAG, r3, "Bluetooth is off.");
        return true;
    L19:
        return false;
    }

    private void b() {
        BluetoothDiscoveryReceiver r0 = this.e;
        if (r0 == null) goto L8;
        Context r1 = this.mContext;
        if (r1 == null) goto L9;
        r1.unregisterReceiver(r0);
        this.e = null;
        return;
    L9:
        return;
    }

    @SuppressLint({"MissingPermission"})
    private boolean a(BluetoothDevice r4) {
        if (r4 != null) goto L5;
    L15:
        return false;
    L5:
        if (CommonUtil.checkHasConnectPermission(this.mContext) == false) goto L15;
        if (r4.getType() != 2) goto L10;
        return true;
    L10:
        if (r4.getType() == 3) goto L16;
        return false;
    L16:
        return true;
    }

    private void a(int r1) {
        this.g = r1;
    }

    @SuppressLint({"MissingPermission"})
    private void a(BluetoothDevice r3, int r4, byte[] r5, boolean r6) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (a("filterDevice", true) == false) goto L7;
        return;
    L7:
        if (this.c.contains(r3) == true) goto L11;
        this.c.add(r3);
        this.mCallbackManager.onDiscovery(r3, new BleScanMessage().setRawData(r5).setRssi(r4).setEnableConnect(r6));
        return;
    }

    private void a(boolean r7) {
        if (this.g != 0) goto L5;
        boolean r0 = true;
    L6:
        JL_Log.i(this.TAG, "notifyDiscoveryStatus", "scanType : " + this.g + ", bStart : " + r7);
        if (r7 == false) goto L11;
        if (r0 == false) goto L10;
        this.h = true;
        this.c.clear();
    L14:
        this.mCallbackManager.onDiscoveryStatus(r0, r7);
        if (r7 == true) goto L18;
        a(0);
        return;
    L18:
        b(r0);
        return;
    L10:
        this.i = true;
        this.d.clear();
        goto L14
    L11:
        if (r0 == false) goto L13;
        this.h = false;
        removeTimeoutTask(n);
        goto L14
    L13:
        this.i = false;
        removeTimeoutTask(m);
        b();
        goto L14
    L5:
        r0 = false;
        goto L6
    }

    private void a() {
        if (this.e == null) goto L5;
        return;
    L5:
        if (this.mContext == null) goto L9;
        this.e = new BluetoothDiscoveryReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        r0.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        r0.addAction("android.bluetooth.device.action.FOUND");
        this.mContext.registerReceiver(this.e, r0);
        return;
    }

    private /* synthetic */ void a(BluetoothDevice r2, int r3, byte[] r4) {
        a(r2, r3, r4, true);
    }
}
