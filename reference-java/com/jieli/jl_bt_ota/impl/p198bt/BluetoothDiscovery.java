package com.jieli.jl_bt_ota.impl.p198bt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class BluetoothDiscovery extends BluetoothBase {

    /* JADX INFO: renamed from: m */
    private static final int f37591m = 4660;

    /* JADX INFO: renamed from: n */
    private static final int f37592n = 4661;

    /* JADX INFO: renamed from: c */
    private final List<BluetoothDevice> f37593c;

    /* JADX INFO: renamed from: d */
    private final List<BluetoothDevice> f37594d;

    /* JADX INFO: renamed from: e */
    private BluetoothDiscoveryReceiver f37595e;

    /* JADX INFO: renamed from: f */
    private BluetoothLeScanner f37596f;

    /* JADX INFO: renamed from: g */
    private volatile int f37597g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f37598h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f37599i;

    /* JADX INFO: renamed from: j */
    private final OnBtAssistantCallback f37600j;

    /* JADX INFO: renamed from: k */
    private final BluetoothAdapter.LeScanCallback f37601k;

    /* JADX INFO: renamed from: l */
    @RequiresApi(21)
    private final ScanCallback f37602l;

    public class BluetoothDiscoveryReceiver extends BroadcastReceiver {
        private BluetoothDiscoveryReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            switch (action) {
                case "android.bluetooth.adapter.action.DISCOVERY_FINISHED":
                    JL_Log.m27232d(BluetoothDiscovery.this.TAG, "ACTION_DISCOVERY_FINISHED", "---->");
                    BluetoothDiscovery.this.m27044a(false);
                    break;
                case "android.bluetooth.adapter.action.DISCOVERY_STARTED":
                    JL_Log.m27232d(BluetoothDiscovery.this.TAG, "ACTION_DISCOVERY_STARTED", "---->");
                    if (!BluetoothDiscovery.this.isDeviceScanning()) {
                        BluetoothDiscovery.this.m27044a(true);
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.FOUND":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null && !BluetoothDiscovery.this.m27048a("ACTION_FOUND", true)) {
                        boolean z = (BluetoothDiscovery.this.f37597g == 1 && bluetoothDevice.getType() != 2) || (BluetoothDiscovery.this.f37597g == 0 && bluetoothDevice.getType() != 1) || BluetoothDiscovery.this.f37597g == 2;
                        short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
                        if (z && !BluetoothDiscovery.this.f37594d.contains(bluetoothDevice)) {
                            JL_Log.m27232d(BluetoothDiscovery.this.TAG, "ACTION_FOUND", "device : " + BluetoothDiscovery.this.printBtDeviceInfo(bluetoothDevice) + ", RSSI : " + ((int) shortExtra));
                            BluetoothDiscovery.this.f37594d.add(bluetoothDevice);
                            BluetoothDiscovery.this.mCallbackManager.onDiscovery(bluetoothDevice, new BleScanMessage().setRssi(shortExtra).setEnableConnect(true));
                            break;
                        }
                    }
                    break;
            }
        }
    }

    public BluetoothDiscovery(Context context) {
        super(context);
        this.f37593c = new ArrayList();
        this.f37594d = new ArrayList();
        this.f37598h = false;
        this.f37599i = false;
        OnBtAssistantCallback onBtAssistantCallback = new OnBtAssistantCallback() { // from class: com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery.1
            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onAdapterStatus(boolean z, boolean z2) {
                if (z) {
                    return;
                }
                if (BluetoothDiscovery.this.isScanning()) {
                    BluetoothDiscovery.this.m27044a(false);
                }
                BluetoothDiscovery.this.m27053c();
            }
        };
        this.f37600j = onBtAssistantCallback;
        this.f37601k = new BluetoothAdapter.LeScanCallback() { // from class: com.jieli.jl_bt_ota.impl.bt.O00
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                this.OXO1.m27039a(bluetoothDevice, i, bArr);
            }
        };
        this.f37602l = new ScanCallback() { // from class: com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery.2
            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> list) {
                super.onBatchScanResults(list);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                super.onScanFailed(i);
                JL_Log.m27240w(BluetoothDiscovery.this.TAG, "onScanFailed", "Failed to scan ble. errorCode = " + i);
                if (i != 1) {
                    BluetoothDiscovery.this.m27044a(false);
                } else {
                    JL_Log.m27236i(BluetoothDiscovery.this.TAG, "onScanFailed", "Repeatedly turn on Bluetooth scanning.");
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, ScanResult scanResult) {
                super.onScanResult(i, scanResult);
                if (scanResult == null || scanResult.getScanRecord() == null) {
                    return;
                }
                BluetoothDiscovery.this.m27040a(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), scanResult.isConnectable());
            }
        };
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter != null) {
            this.f37596f = bluetoothAdapter.getBluetoothLeScanner();
        }
        addOnBtAssistantCallback(onBtAssistantCallback);
    }

    public ArrayList<BluetoothDevice> getDiscoveredBluetoothDevices() {
        return this.f37597g == 0 ? new ArrayList<>(this.f37593c) : new ArrayList<>(this.f37594d);
    }

    public int getScanType() {
        return this.f37597g;
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public boolean handleMessageEvent(@NonNull Message message) {
        int i = message.what;
        if (i == f37591m) {
            JL_Log.m27236i(this.TAG, "MSG_STOP_EDR", "stopDeviceScan");
            stopDeviceScan();
        } else if (i == f37592n) {
            JL_Log.m27236i(this.TAG, "MSG_STOP_BLE", "stopBLEScan");
            stopBLEScan();
        }
        return super.handleMessageEvent(message);
    }

    public boolean isBleScanning() {
        return this.f37598h;
    }

    public boolean isDeviceScanning() {
        return this.f37599i;
    }

    public boolean isScanning() {
        return this.f37599i || this.f37598h;
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public void release() {
        removeOnBtAssistantCallback(this.f37600j);
        m27050b();
        stopDeviceScan();
        stopBLEScan();
        m27053c();
        super.release();
    }

    @SuppressLint({"MissingPermission"})
    public int startBLEScan(long j) {
        if (m27047a("startBLEScan")) {
            return 4113;
        }
        if (isDeviceScanning()) {
            JL_Log.m27232d(this.TAG, "startBLEScan", "stopDeviceScan");
            if (stopDeviceScan() == 0) {
                int i = 0;
                do {
                    SystemClock.sleep(50L);
                    i += 50;
                    if (i > 1000) {
                        break;
                    }
                } while (this.mBluetoothAdapter.isDiscovering());
            }
        }
        m27038a(0);
        if (j <= 0) {
            j = 8000;
        }
        if (isBleScanning()) {
            JL_Log.m27236i(this.TAG, "startBLEScan", "scanning ble ..... timeout = " + j);
            BluetoothLeScanner bluetoothLeScanner = this.f37596f;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.flushPendingScanResults(this.f37602l);
            }
            executeTimeoutTask(f37592n, null, j);
            m27044a(true);
            return 0;
        }
        if (this.f37596f != null) {
            this.f37596f.startScan(new ArrayList(), new ScanSettings.Builder().setScanMode(getBluetoothOption().getBleScanMode()).setMatchMode(1).setNumOfMatches(3).build(), this.f37602l);
            JL_Log.m27232d(this.TAG, "startBLEScan", "startScan : true");
        } else {
            boolean zStartLeScan = this.mBluetoothAdapter.startLeScan(this.f37601k);
            JL_Log.m27232d(this.TAG, "startBLEScan", "startLeScan : " + zStartLeScan);
            if (!zStartLeScan) {
                return 8194;
            }
        }
        JL_Log.m27236i(this.TAG, "startBLEScan", "Ready to scan, timeout : " + j);
        executeTimeoutTask(f37592n, null, j);
        m27044a(true);
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public int startDeviceScan(long j, int i) {
        if (i == 0) {
            return startBLEScan(j);
        }
        if (m27047a("startDeviceScan")) {
            return 4113;
        }
        if (isBleScanning()) {
            stopBLEScan();
            JL_Log.m27236i(this.TAG, "startDeviceScan", "stopBLEScan.");
            SystemClock.sleep(100L);
        }
        m27038a(i);
        long j2 = j <= 0 ? 8000L : j;
        if (isDeviceScanning()) {
            JL_Log.m27232d(this.TAG, "startDeviceScan", "scanning br/edr ..... timeout = " + j);
            executeTimeoutTask(f37591m, null, j2);
            m27044a(true);
            return 0;
        }
        m27037a();
        boolean zStartDiscovery = this.mBluetoothAdapter.startDiscovery();
        JL_Log.m27232d(this.TAG, "startDeviceScan", "startDiscovery : " + zStartDiscovery);
        if (!zStartDiscovery) {
            m27050b();
            return 8194;
        }
        executeTimeoutTask(f37591m, null, j2);
        m27044a(true);
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public int stopBLEScan() {
        if (m27048a("stopBLEScan", true)) {
            return 4113;
        }
        if (!isBleScanning()) {
            this.mCallbackManager.onDiscoveryStatus(true, false);
            return 0;
        }
        try {
            BluetoothLeScanner bluetoothLeScanner = this.f37596f;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.f37602l);
                JL_Log.m27232d(this.TAG, "stopBLEScan", "stopScan");
            } else {
                this.mBluetoothAdapter.stopLeScan(this.f37601k);
                JL_Log.m27232d(this.TAG, "stopBLEScan", "stopLeScan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        removeTimeoutTask(f37592n);
        m27044a(false);
        return 0;
    }

    @SuppressLint({"MissingPermission"})
    public int stopDeviceScan() {
        if (m27048a("stopDeviceScan", true)) {
            return 4113;
        }
        if (!isDeviceScanning()) {
            this.mCallbackManager.onDiscoveryStatus(false, false);
            return 0;
        }
        boolean zCancelDiscovery = this.mBluetoothAdapter.cancelDiscovery();
        JL_Log.m27240w(this.TAG, "stopDeviceScan", "cancelDiscovery = " + zCancelDiscovery);
        if (!zCancelDiscovery) {
            return 8194;
        }
        removeTimeoutTask(f37591m);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private void m27051b(boolean z) {
        List<BluetoothDevice> systemConnectedBtDeviceList = BluetoothUtil.getSystemConnectedBtDeviceList(this.mContext);
        if (systemConnectedBtDeviceList == null || systemConnectedBtDeviceList.isEmpty()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
            if (z && m27045a(bluetoothDevice)) {
                if (!this.f37593c.contains(bluetoothDevice)) {
                    this.f37593c.add(bluetoothDevice);
                    this.mCallbackManager.onDiscovery(bluetoothDevice, new BleScanMessage());
                }
            } else if (!z && !m27045a(bluetoothDevice) && !this.f37594d.contains(bluetoothDevice)) {
                this.f37594d.add(bluetoothDevice);
                this.mCallbackManager.onDiscovery(bluetoothDevice, new BleScanMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m27053c() {
        m27038a(0);
        this.f37598h = false;
        this.f37599i = false;
        this.f37593c.clear();
        this.f37594d.clear();
    }

    /* JADX INFO: renamed from: a */
    private boolean m27047a(String str) {
        return m27048a(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m27048a(String str, boolean z) {
        if (!CommonUtil.checkHasScanPermission(this.mContext)) {
            JL_Log.m27240w(this.TAG, str, "Missing bluetooth scan permissions.");
            return true;
        }
        if (!z && !CommonUtil.checkHasLocationPermission(this.mContext)) {
            JL_Log.m27240w(this.TAG, str, "Missing location permissions.");
            return true;
        }
        if (this.mBluetoothAdapter == null) {
            JL_Log.m27240w(this.TAG, str, "The device is not supported bluetooth.");
            return true;
        }
        if (BluetoothUtil.isBluetoothEnable()) {
            return false;
        }
        JL_Log.m27240w(this.TAG, str, "Bluetooth is off.");
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m27050b() {
        Context context;
        BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver = this.f37595e;
        if (bluetoothDiscoveryReceiver == null || (context = this.mContext) == null) {
            return;
        }
        context.unregisterReceiver(bluetoothDiscoveryReceiver);
        this.f37595e = null;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    private boolean m27045a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || !CommonUtil.checkHasConnectPermission(this.mContext)) {
            return false;
        }
        return bluetoothDevice.getType() == 2 || bluetoothDevice.getType() == 3;
    }

    /* JADX INFO: renamed from: a */
    private void m27038a(int i) {
        this.f37597g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public void m27040a(BluetoothDevice bluetoothDevice, int i, byte[] bArr, boolean z) {
        if (bluetoothDevice == null || m27048a("filterDevice", true) || this.f37593c.contains(bluetoothDevice)) {
            return;
        }
        this.f37593c.add(bluetoothDevice);
        this.mCallbackManager.onDiscovery(bluetoothDevice, new BleScanMessage().setRawData(bArr).setRssi(i).setEnableConnect(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27044a(boolean z) {
        boolean z2 = this.f37597g == 0;
        JL_Log.m27236i(this.TAG, "notifyDiscoveryStatus", "scanType : " + this.f37597g + ", bStart : " + z);
        if (z) {
            if (z2) {
                this.f37598h = true;
                this.f37593c.clear();
            } else {
                this.f37599i = true;
                this.f37594d.clear();
            }
        } else if (z2) {
            this.f37598h = false;
            removeTimeoutTask(f37592n);
        } else {
            this.f37599i = false;
            removeTimeoutTask(f37591m);
            m27050b();
        }
        this.mCallbackManager.onDiscoveryStatus(z2, z);
        if (!z) {
            m27038a(0);
        } else {
            m27051b(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27037a() {
        if (this.f37595e != null || this.mContext == null) {
            return;
        }
        this.f37595e = new BluetoothDiscoveryReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        this.mContext.registerReceiver(this.f37595e, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27039a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        m27040a(bluetoothDevice, i, bArr, true);
    }
}
