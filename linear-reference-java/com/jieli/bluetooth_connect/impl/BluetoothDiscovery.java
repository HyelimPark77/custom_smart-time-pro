package com.jieli.bluetooth_connect.impl;

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
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.I01X;
import com.android.mltcode.paycertificationapi.OIIOXiXXi;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener;
import com.jieli.bluetooth_connect.tool.BtDiscoveryCbManager;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import com.jieli.bluetooth_connect.util.ParseDataUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothDiscovery implements IBluetoothDiscovery {
    private static final int MSG_DISCOVERY_BLE_TIMEOUT = 1011;
    private static final int MSG_DISCOVERY_EDR_TIMEOUT = 1022;
    public static int SCAN_MIN_TIMEOUT = 2000;
    private static final String TAG = "BluetoothDiscovery";
    private boolean isBleScanning;
    private boolean isEdrScanning;
    private final BluetoothAdapter.LeScanCallback leScanCallback;
    private final BluetoothAdapter mBluetoothAdapter;
    private BluetoothDiscoveryReceiver mBluetoothDiscoveryReceiver;
    private BluetoothLeScanner mBluetoothLeScanner;
    private BluetoothOption mBluetoothOption;
    private BluetoothReceiver mBluetoothReceiver;
    private final BtDiscoveryCbManager mBtDiscoveryCbManager;
    private final Context mContext;
    private final List<BluetoothDevice> mDiscoveredDevices;
    private final List<BluetoothDevice> mDiscoveredEdrDevices;
    private final Handler mHandler;

    @RequiresApi(21)
    private final ScanCallback mScanCallback;
    private int mScanType;
    private long scanTotalTime;
    private long startBleScanTime;
    private long startEdrScanTime;

    public class BluetoothDiscoveryReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothDiscovery this$0;

        private BluetoothDiscoveryReceiver(final BluetoothDiscovery this$0) {
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) goto L59;
            if (context == null) goto L64;
            String r4 = intent.getAction();
            if (TextUtils.isEmpty(r4) == true) goto L65;
            Objects.requireNonNull(r4);
            switch(r4.hashCode()) {
                case -1780914469: goto L21;
                case 6759640: goto L17;
                case 1167529923: goto L13;
                default: goto L11;
            };
        L11:
            byte r5 = -1;
        L24:
            switch(r5) {
                case 0: goto L54;
                case 1: goto L52;
                case 2: goto L26;
                default: goto L66;
            };
        L26:
            BluetoothDevice r3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            short r9 = intent.getShortExtra("android.bluetooth.device.extra.RSSI", -1);
            if (r3 != null) goto L29;
            return;
        L29:
            if (BluetoothUtil.isBluetoothEnable() == true) goto L31;
            return;
        L31:
            if (ConnectUtil.isHasConnectPermission(context) == true) goto L33;
            return;
        L33:
            if (this.this$0.isDeviceScanning() == false) goto L67;
            int r8 = r3.getType();
            int r1 = BluetoothDiscovery.access$600(this.this$0);
            if (r1 == 0) goto L43;
            if (r1 == 1) goto L40;
            if (r1 == 2) goto L49;
            return;
        L49:
            if (BluetoothDiscovery.access$700(this.this$0).contains(r3) == true) goto L63;
            BluetoothDiscovery.access$700(this.this$0).add(r3);
            BluetoothDiscovery.access$400(this.this$0).onDiscoveryDevice(r3, new BleScanMessage().setEnableConnect(true).setRssi(r9));
            return;
        L63:
            return;
        L40:
            if (1 == r8) goto L49;
            return;
        L43:
            if (2 == r8) goto L49;
            if (3 == r8) goto L49;
            return;
        L67:
            return;
        L52:
            JL_Log.i(BluetoothDiscovery.access$300(), "ACTION_DISCOVERY_STARTED", "isDeviceScanning : " + this.this$0.isDeviceScanning());
            BluetoothDiscovery.access$500(this.this$0, false, true);
            return;
        L54:
            JL_Log.i(BluetoothDiscovery.access$300(), "ACTION_DISCOVERY_FINISHED", "isDeviceScanning : " + this.this$0.isDeviceScanning());
            BluetoothDiscovery.access$500(this.this$0, false, false);
            return;
        L66:
            return;
        L13:
            if (r4.equals("android.bluetooth.device.action.FOUND") == false) goto L56;
            r5 = 2;
            goto L24
        L56:
            r5 = -1;
            goto L24
        L17:
            if (r4.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED") == false) goto L57;
            r5 = 1;
            goto L24
        L57:
            r5 = -1;
            goto L24
        L21:
            if (r4.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED") == false) goto L58;
            r5 = 0;
            goto L24
        L58:
            r5 = -1;
            goto L24
        L65:
            return;
        L64:
            return;
        }

        public /* synthetic */ BluetoothDiscoveryReceiver(BluetoothDiscovery r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public class BluetoothReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothDiscovery this$0;

        private BluetoothReceiver(final BluetoothDiscovery this$0) {
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) goto L5;
            return;
        L5:
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) == true) goto L7;
            return;
        L7:
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) != 10) goto L17;
            BluetoothDiscovery.access$800(this.this$0).clear();
            BluetoothDiscovery.access$700(this.this$0).clear();
            if (this.this$0.isScanning() == false) goto L18;
            BluetoothDiscovery r2 = this.this$0;
            if (BluetoothDiscovery.access$600(r2) != 0) goto L13;
            boolean r3 = true;
        L14:
            BluetoothDiscovery.access$500(r2, r3, false);
            return;
        L13:
            r3 = false;
            goto L14
        L18:
            return;
        }

        public /* synthetic */ BluetoothReceiver(BluetoothDiscovery r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    static {
    }

    public BluetoothDiscovery(Context context, BluetoothOption option, OnBtDiscoveryListener listener) {
        this.mDiscoveredDevices = new ArrayList();
        this.mDiscoveredEdrDevices = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper(), new I01X(this));
        this.leScanCallback = new OIIOXiXXi(this);
        this.mScanCallback = new AnonymousClass1(this);
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        setBluetoothOption(option);
        this.mBtDiscoveryCbManager = new BtDiscoveryCbManager();
        addListener2(listener);
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        getBluetoothLeScanner();
        registerBtReceiver();
    }

    public static /* synthetic */ void OXO1(BluetoothDiscovery r1, BluetoothDevice r2, int r3, byte[] r4) {
        r1.filterDevice(r2, r3, r4, true);
    }

    public static /* synthetic */ boolean XIi00iiXO(BluetoothDiscovery r4, Message r5) {
        r4.getClass();
        int r6 = r5.what;
        if (r6 != 1011) goto L5;
        boolean r7 = r4.isBleScanning();
        JL_Log.w(TAG, "MSG_DISCOVERY_BLE_TIMEOUT", "bleScanning = " + r7);
        if (r7 == false) goto L14;
        r4.stopBleScan(true);
    L14:
        return true;
    L5:
        if (r6 != 1022) goto L14;
        boolean r8 = r4.isDeviceScanning();
        JL_Log.w(TAG, "MSG_DISCOVERY_EDR_TIMEOUT", "deviceScanning = " + r8);
        if (r8 == false) goto L14;
        r4.stopDeviceScan(true);
        r4.notifyDiscoveryStatus(false, false);
        return true;
    }

    public static /* synthetic */ void access$200(BluetoothDiscovery r0, BluetoothDevice r1, int r2, byte[] r3, boolean r4) {
        r0.filterDevice(r1, r2, r3, r4);
    }

    public static /* synthetic */ String access$300() {
        return TAG;
    }

    public static /* synthetic */ BtDiscoveryCbManager access$400(BluetoothDiscovery r0) {
        return r0.mBtDiscoveryCbManager;
    }

    public static /* synthetic */ void access$500(BluetoothDiscovery r0, boolean r1, boolean r2) {
        r0.notifyDiscoveryStatus(r1, r2);
    }

    public static /* synthetic */ int access$600(BluetoothDiscovery r0) {
        return r0.mScanType;
    }

    public static /* synthetic */ List access$700(BluetoothDiscovery r0) {
        return r0.mDiscoveredEdrDevices;
    }

    public static /* synthetic */ List access$800(BluetoothDiscovery r0) {
        return r0.mDiscoveredDevices;
    }

    @SuppressLint({"MissingPermission"})
    private void filterDevice(BluetoothDevice device, int rssi, byte[] scanRecord, boolean isBleEnableConnect) {
        if (device != null) goto L4;
        return;
    L4:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == true) goto L6;
        return;
    L6:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L8;
        return;
    L8:
        if (this.mBluetoothOption.isSkipNoneNameDevice() == true) goto L10;
    L13:
        boolean r0 = true;
    L15:
        if (this.mBluetoothOption.getBleScanStrategy() != 0) goto L24;
        if (r0 == true) goto L18;
        return;
    L18:
        if (this.mDiscoveredDevices.contains(device) == true) goto L43;
        BleScanMessage r1 = ParseDataUtil.parseOTAFlagFilterWithBroad(scanRecord, this.mBluetoothOption.getOtaScanFilterData());
        if (r1 != null) goto L22;
        r1 = new BleScanMessage();
    L22:
        this.mDiscoveredDevices.add(device);
        this.mBtDiscoveryCbManager.onDiscoveryDevice(device, r1.setRawData(scanRecord).setRssi(rssi).setEnableConnect(isBleEnableConnect));
        return;
    L43:
        return;
    L24:
        BleScanMessage r2 = ParseDataUtil.isFilterBleDevice(this.mBluetoothOption, scanRecord);
        if (r2 == null) goto L44;
        if (r0 == true) goto L29;
        return;
    L29:
        if (r2.isEnableConnect() == false) goto L32;
        if (isBleEnableConnect == true) goto L32;
        r2.setEnableConnect(false);
    L32:
        r2.setRawData(scanRecord).setRssi(rssi);
        if (r2.isShowDialog() == false) goto L36;
        this.mBtDiscoveryCbManager.onShowProductDialog(device, r2);
    L36:
        if (this.mDiscoveredDevices.contains(device) == true) goto L45;
        this.mDiscoveredDevices.add(device);
        this.mBtDiscoveryCbManager.onDiscoveryDevice(device, r2);
        return;
    L45:
        return;
    L44:
        return;
    L10:
        if (TextUtils.isEmpty(device.getName()) == false) goto L13;
        r0 = false;
        goto L15
    }

    private BluetoothLeScanner getBluetoothLeScanner() {
        BluetoothAdapter r0 = this.mBluetoothAdapter;
        if (r0 == null) goto L8;
        if (this.mBluetoothLeScanner != null) goto L8;
        this.mBluetoothLeScanner = r0.getBluetoothLeScanner();
    L8:
        return this.mBluetoothLeScanner;
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private void notifyDiscoveryStatus(boolean bBle, boolean bStart) {
        JL_Log.i(TAG, "notifyDiscoveryStatus", "bBle : " + bBle + ", bStart : " + bStart + ", mScanType : " + this.mScanType);
        int r0 = this.mScanType;
        if (bStart == true) goto L10;
        if (bBle == false) goto L7;
        this.startBleScanTime = 0;
        setBleScanning(false);
        this.mHandler.removeMessages(1011);
    L8:
        this.mScanType = 0;
        goto L10
    L7:
        this.startEdrScanTime = 0;
        setDeviceScanning(false);
        unregisterReceiver();
        this.mHandler.removeMessages(1022);
    L10:
        if (r0 != 0) goto L14;
        if (bBle == false) goto L14;
        this.mBtDiscoveryCbManager.onDiscoveryStatusChange(true, bStart);
        return;
    L14:
        if (r0 != 1) goto L18;
        if (bBle == true) goto L19;
        this.mBtDiscoveryCbManager.onDiscoveryStatusChange(false, bStart);
        return;
    L19:
        return;
    }

    private void registerBtReceiver() {
        if (this.mBluetoothReceiver != null) goto L6;
        this.mBluetoothReceiver = new BluetoothReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.mContext.registerReceiver(this.mBluetoothReceiver, r0);
        return;
    }

    private void registerReceiver() {
        if (this.mBluetoothDiscoveryReceiver != null) goto L6;
        this.mBluetoothDiscoveryReceiver = new BluetoothDiscoveryReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        r0.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        r0.addAction("android.bluetooth.device.action.FOUND");
        this.mContext.registerReceiver(this.mBluetoothDiscoveryReceiver, r0);
        return;
    }

    private void setBleScanning(boolean bleScanning) {
        this.isBleScanning = bleScanning;
    }

    private void setDeviceScanning(boolean edrScanning) {
        this.isEdrScanning = edrScanning;
    }

    @SuppressLint({"MissingPermission"})
    private boolean stopBleScan(boolean isMandatory) {
        if (this.mBluetoothAdapter != null) goto L5;
    L31:
        JL_Log.e(TAG, "stopBleScan", "this device is not supported bluetooth.");
        return false;
    L5:
        if (ConnectUtil.isHasScanPermission(this.mContext) == false) goto L31;
        if (BluetoothUtil.isBluetoothEnable() == true) goto L11;
        return false;
    L11:
        if (isBleScanning() == true) goto L13;
        return true;
    L13:
        long r4 = getCurrentTime() - this.startBleScanTime;
        if (isMandatory == true) goto L20;
        if (r4 >= SCAN_MIN_TIMEOUT) goto L20;
        JL_Log.i(TAG, "stopBleScan", "Turn on time is too short. usedTime = " + r4 + ", SCAN_MIN_TIMEOUT = " + SCAN_MIN_TIMEOUT);
        this.mHandler.removeMessages(1011);
        this.mHandler.sendEmptyMessageDelayed(1011, ((long) SCAN_MIN_TIMEOUT) - r4);
        return true;
    L20:
        if (getBluetoothLeScanner() != null) goto L35;
        JL_Log.d(TAG, "stopBleScan", "stopLeScan");     // Catch: Exception -> L27
        this.mBluetoothAdapter.stopLeScan(this.leScanCallback);     // Catch: Exception -> L27
    L29:
        notifyDiscoveryStatus(true, false);
        return true;
    L27:
        e = move-exception;
        e.printStackTrace();
        goto L29
    L35:
        JL_Log.d(TAG, "stopBleScan", "stopScan");     // Catch: Exception -> L23
        this.mBluetoothLeScanner.stopScan(this.mScanCallback);     // Catch: Exception -> L23
    L23:
        e = move-exception;
        e.printStackTrace();
        goto L29
    }

    private void unregisterBtReceiver() {
        BluetoothReceiver r0 = this.mBluetoothReceiver;
        if (r0 == null) goto L6;
        this.mContext.unregisterReceiver(r0);
        this.mBluetoothReceiver = null;
        return;
    }

    private void unregisterReceiver() {
        BluetoothDiscoveryReceiver r0 = this.mBluetoothDiscoveryReceiver;
        if (r0 == null) goto L6;
        this.mContext.unregisterReceiver(r0);
        this.mBluetoothDiscoveryReceiver = null;
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void addListener(OnBtDiscoveryListener listener) {
        addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        this.mBtDiscoveryCbManager.destroy();
        stopDeviceScan(true);
        stopBleScan(true);
        unregisterReceiver();
        unregisterBtReceiver();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public ArrayList<BluetoothDevice> getDiscoveredBluetoothDevices() {
        if (this.mScanType != 0) goto L7;
        return new ArrayList(this.mDiscoveredDevices);
    L7:
        return new ArrayList(this.mDiscoveredEdrDevices);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public int getScanType() {
        return this.mScanType;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public boolean isBleScanning() {
        return this.isBleScanning;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public boolean isDeviceScanning() {
        return this.isEdrScanning;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public boolean isScanning() {
        if (isDeviceScanning() == false) goto L5;
        return true;
    L5:
        if (isBleScanning() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void removeListener(OnBtDiscoveryListener listener) {
        removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption option) {
        if (option != null) goto L4;
        option = BluetoothOption.createDefaultOption();
    L4:
        this.mBluetoothOption = option;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public boolean startBLEScan(long timeout) {
        if (ConnectUtil.isHasScanPermission(this.mContext) == true) goto L7;
        JL_Log.e(TAG, "startBLEScan", "No Bluetooth scanning permission.");
        return false;
    L7:
        if (ConnectUtil.isHasLocationPermission(this.mContext) == true) goto L11;
        JL_Log.e(TAG, "startBLEScan", "No location permission.");
        return false;
    L11:
        if (this.mBluetoothAdapter != null) goto L15;
        JL_Log.e(TAG, "startBLEScan", "this device is not supported bluetooth.");
        return false;
    L15:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L19;
        JL_Log.w(TAG, "startBLEScan", "Bluetooth adapter is close.");
        return false;
    L19:
        if (isDeviceScanning() == false) goto L22;
        stopDeviceScan(true);
    L22:
        if (isBleScanning() == false) goto L26;
        long r8 = this.scanTotalTime - (getCurrentTime() - this.startBleScanTime);
        JL_Log.i(TAG, "startBLEScan", "scanning ble ..... left timeout : " + r8);
        return true;
    L26:
        if (getBluetoothLeScanner() == null) goto L28;
        ScanSettings r0 = new ScanSettings.Builder().setScanMode(this.mBluetoothOption.getBleScanMode()).setMatchMode(1).build();
        this.mBluetoothLeScanner.startScan(new ArrayList(), r0, this.mScanCallback);
        JL_Log.d(TAG, "startBLEScan", "startScan : true ");
        boolean r1 = true;
    L29:
        if (r1 == false) goto L34;
        this.mScanType = 0;
        this.mDiscoveredDevices.clear();
        setBleScanning(true);
        if (timeout >= SCAN_MIN_TIMEOUT) goto L33;
        timeout = 8000;
    L33:
        this.startBleScanTime = getCurrentTime();
        this.scanTotalTime = timeout;
        JL_Log.d(TAG, "startBLEScan", "scanTotalTime : " + this.scanTotalTime);
        this.mHandler.removeMessages(1011);
        this.mHandler.sendEmptyMessageDelayed(1011, timeout);
        notifyDiscoveryStatus(true, true);
    L34:
        return r1;
    L28:
        r1 = this.mBluetoothAdapter.startLeScan(this.leScanCallback);
        JL_Log.d(TAG, "startBLEScan", "startLeScan : " + r1);
        goto L29
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public boolean startDeviceScan(long timeout) {
        return startDeviceScan(1, timeout);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public boolean stopBLEScan() {
        return stopBleScan(false);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    public boolean stopDeviceScan() {
        return stopDeviceScan(false);
    }

    @SuppressLint({"MissingPermission"})
    private boolean stopDeviceScan(boolean isMandatory) {
        if (this.mBluetoothAdapter != null) goto L5;
    L21:
        JL_Log.e(TAG, "stopDeviceScan", " this device is not supported bluetooth.");
        return false;
    L5:
        if (ConnectUtil.isHasScanPermission(this.mContext) == false) goto L21;
        if (BluetoothUtil.isBluetoothEnable() == true) goto L11;
        return false;
    L11:
        if (isDeviceScanning() == true) goto L13;
        return true;
    L13:
        long r3 = getCurrentTime() - this.startEdrScanTime;
        if (isMandatory == false) goto L16;
    L19:
        boolean r8 = this.mBluetoothAdapter.cancelDiscovery();
        JL_Log.d(TAG, "stopDeviceScan", "cancelDiscovery : " + r8);
        return r8;
    L16:
        if (r3 >= SCAN_MIN_TIMEOUT) goto L19;
        JL_Log.i(TAG, "stopDeviceScan", "Turn on time is too short. usedTime = " + r3 + ", SCAN_MIN_TIMEOUT = " + SCAN_MIN_TIMEOUT);
        this.mHandler.removeMessages(1022);
        this.mHandler.sendEmptyMessageDelayed(1022, ((long) SCAN_MIN_TIMEOUT) - r3);
        return true;
    }

    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    public void addListener2(OnBtDiscoveryListener listener) {
        this.mBtDiscoveryCbManager.addListener(listener);
    }

    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    public void removeListener2(OnBtDiscoveryListener listener) {
        this.mBtDiscoveryCbManager.removeListener(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothDiscovery
    @SuppressLint({"MissingPermission"})
    public boolean startDeviceScan(int type, long timeout) {
        if (ConnectUtil.isHasScanPermission(this.mContext) == true) goto L7;
        JL_Log.e(TAG, "startDeviceScan", "No Bluetooth scanning permission.");
        return false;
    L7:
        if (ConnectUtil.isHasLocationPermission(this.mContext) == true) goto L11;
        JL_Log.e(TAG, "startDeviceScan", "No location permission.");
        return false;
    L11:
        if (this.mBluetoothAdapter != null) goto L15;
        JL_Log.e(TAG, "startDeviceScan", "this device is not supported bluetooth.");
        return false;
    L15:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L18;
        JL_Log.e(TAG, "startDeviceScan", "Bluetooth is not turned on.");
        return false;
    L18:
        if (type != 0) goto L22;
        return startBLEScan(timeout);
    L22:
        if (isBleScanning() == false) goto L25;
        JL_Log.w(TAG, "startDeviceScan", "stopBLEScan");
        stopBleScan(true);
    L25:
        if (isDeviceScanning() == false) goto L28;
        long r8 = this.scanTotalTime - (getCurrentTime() - this.startEdrScanTime);
        JL_Log.i(TAG, "startDeviceScan", "scanning edr ..... ScanType : " + this.mScanType + ", leftTime : " + r8);
        return true;
    L28:
        registerReceiver();
        boolean r0 = this.mBluetoothAdapter.startDiscovery();
        JL_Log.i(TAG, "startDeviceScan", "startDiscovery : " + r0);
        if (r0 == true) goto L32;
        unregisterReceiver();
        return r0;
    L32:
        this.mScanType = type;
        this.mDiscoveredEdrDevices.clear();
        setDeviceScanning(true);
        if (timeout >= SCAN_MIN_TIMEOUT) goto L35;
        timeout = 8000;
    L35:
        this.startEdrScanTime = getCurrentTime();
        this.scanTotalTime = timeout;
        this.mHandler.removeMessages(1022);
        this.mHandler.sendEmptyMessageDelayed(1022, timeout);
        return r0;
    }
}
