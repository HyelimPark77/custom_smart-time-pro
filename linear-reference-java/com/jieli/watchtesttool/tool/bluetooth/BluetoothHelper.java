package com.jieli.watchtesttool.tool.bluetooth;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.X10;
import com.android.mltcode.paycertificationapi.XI1II;
import com.android.mltcode.paycertificationapi.ro3;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.impl.BluetoothManager;
import com.jieli.bluetooth_connect.interfaces.IBluetoothOperation;
import com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback;
import com.jieli.bluetooth_connect.interfaces.callback.OnHistoryRecordCallback;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.CHexConverter;
import com.jieli.jl_rcsp.impl.RcspAuth;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.watchtesttool.tool.config.ConfigHelper;
import com.jieli.watchtesttool.util.AppUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothHelper {
    private static final long DELAY_WAITING_TIME = 5000;
    private static final boolean IS_CHANGE_BLE_MTU = true;
    private static final String TAG = "BluetoothHelper";
    private static volatile BluetoothHelper instance;
    private final ConfigHelper configHelper;
    private final Map<String, Boolean> mAuthDeviceMap;
    private final IBluetoothOperation mBluetoothOp;
    private final BluetoothEventCallback mBtEventCallback;
    private final BtEventCbManager mBtEventCbManager;
    private ChangeBleMtuTimeoutTask mChangeBleMtuTimeoutTask;
    private final Handler mHandler;
    private final RcspAuth mRcspAuth;
    private final RcspAuth.OnRcspAuthListener mRcspAuthListener;

    public class ChangeBleMtuTimeoutTask implements Runnable {
        private final BluetoothDevice mDevice;
        final /* synthetic */ BluetoothHelper this$0;

        public ChangeBleMtuTimeoutTask(BluetoothHelper r1, BluetoothDevice r2) {
            this.this$0 = r1;
            this.mDevice = r2;
        }

        public BluetoothDevice getDevice() {
            return this.mDevice;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BluetoothHelper.access$700(this.this$0).isConnectedDevice(this.mDevice) == false) goto L6;
            BluetoothHelper.access$600(this.this$0, this.mDevice);
            return;
        L6:
            BluetoothHelper.access$300(this.this$0, this.mDevice, 0);
        }
    }

    static {
    }

    private BluetoothHelper(Application r7) {
        this.mAuthDeviceMap = new HashMap();
        this.mHandler = new Handler(Looper.getMainLooper(), new X10());
        BluetoothEventCallback r0 = new AnonymousClass1(this);
        this.mBtEventCallback = r0;
        RcspAuth.OnRcspAuthListener r1 = new AnonymousClass2(this);
        this.mRcspAuthListener = r1;
        ConfigHelper r2 = ConfigHelper.getInstance(r7);
        this.configHelper = r2;
        BluetoothOption r3 = BluetoothOption.createDefaultOption();
        r3.setPriority(r2.isSPPConnectWay() ? 1 : 0);
        r3.setScanFilterData("");
        r3.setMtu(getDefaultMtu(r2));
        r3.setNeedChangeBleMtu(false);
        r3.setBleScanStrategy(r2.isFilterDevice() ? 1 : 0);
        r3.setUseMultiDevice(false);
        r3.setUseDeviceAuth(r2.isUseDeviceAuth());
        BluetoothManager r4 = new BluetoothManager(r7, r3);
        this.mBluetoothOp = r4;
        r4.registerBluetoothCallback(r0);
        this.mRcspAuth = new RcspAuth(new XI1II(this), r1);
        this.mBtEventCbManager = new BtEventCbManager();
    }

    public static /* synthetic */ boolean OXO1(Message r0) {
        return true;
    }

    public static /* synthetic */ BtEventCbManager access$000(BluetoothHelper r0) {
        return r0.mBtEventCbManager;
    }

    public static /* synthetic */ String access$100() {
        return TAG;
    }

    public static /* synthetic */ void access$200(BluetoothHelper r0, BluetoothDevice r1) {
        r0.handleDeviceConnectedEvent(r1);
    }

    public static /* synthetic */ void access$300(BluetoothHelper r0, BluetoothDevice r1, int r2) {
        r0.publishDeviceConnectionStatus(r1, r2);
    }

    public static /* synthetic */ ChangeBleMtuTimeoutTask access$400(BluetoothHelper r0) {
        return r0.mChangeBleMtuTimeoutTask;
    }

    public static /* synthetic */ void access$500(BluetoothHelper r0) {
        r0.stopChangeBleMtu();
    }

    public static /* synthetic */ void access$600(BluetoothHelper r0, BluetoothDevice r1) {
        r0.callbackDeviceConnected(r1);
    }

    public static /* synthetic */ IBluetoothOperation access$700(BluetoothHelper r0) {
        return r0.mBluetoothOp;
    }

    public static /* synthetic */ void access$800(BluetoothHelper r0, BluetoothDevice r1, byte[] r2) {
        r0.handleReceiveRawData(r1, r2);
    }

    public static /* synthetic */ void access$900(BluetoothHelper r0, BluetoothDevice r1, boolean r2) {
        r0.setDevAuth(r1, r2);
    }

    private void callbackDeviceConnected(BluetoothDevice r2) {
        publishDeviceConnectionStatus(r2, 2);
    }

    public static int getDefaultMtu(ConfigHelper r1) {
        if (ro3.OIX0iXi() == false) goto L5;
        return 247;
    L5:
        if (ro3.I0iXXO() == false) goto L8;
        return 247;
    L8:
        return r1.getBleMtu();
    }

    public static BluetoothHelper getInstance(Application r2) {
        if (instance != null) goto L16;
        monitor-enter(BluetoothHelper.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (instance != null) goto L11;
        instance = new BluetoothHelper(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(BluetoothHelper.class);     // Catch: Throwable -> L9
    L16:
        return instance;
    }

    private void handleDeviceConnectedEvent(BluetoothDevice r7) {
        boolean r0 = this.mBluetoothOp.isConnectedSppDevice(r7);
        String r1 = TAG;
        JL_Log.i(r1, "-handleDeviceConnectedEvent- device = " + AppUtil.printBtDeviceInfo(r7) + ", connectWay = " + (r0 ? 1 : 0));
        if (isAuthDevice(r7) == true) goto L8;
        this.mRcspAuth.stopAuth(r7, false);
        boolean r2 = this.mRcspAuth.startAuth(r7);
        JL_Log.w(r1, "-handleDeviceConnectedEvent- startAuth = " + r2);
        if (r2 == true) goto L14;
        disconnectDevice(r7);
        return;
    L14:
        return;
    L8:
        if (r0 == true) goto L15;
        int r3 = this.mBluetoothOp.getBleMtu(r7);
        int r4 = this.mBluetoothOp.getBluetoothOption().getMtu();
        if (r3 == r4) goto L15;
        boolean r5 = startChangeMtu(r7, r4);
        JL_Log.w(r1, "-handleDeviceConnectedEvent- startChangeMtu = " + r5 + ", mtu = " + r3 + ", change mtu = " + r4);
        if (r5 == false) goto L15;
        return;
    L15:
        callbackDeviceConnected(r7);
    }

    private void handleReceiveRawData(BluetoothDevice r4, byte[] r5) {
        JL_Log.w(TAG, "-handleReceiveRawData- device = " + AppUtil.printBtDeviceInfo(r4) + ", rawData = " + CHexConverter.byte2HexStr(r5));
        if (isAuthDevice(r4) == true) goto L6;
        this.mRcspAuth.handleAuthData(r4, r5);
        return;
    L6:
        this.mBtEventCbManager.onReceiveData(r4, r5);
    }

    private boolean isDevAuth(String r3) {
        if (this.mBluetoothOp.getBluetoothOption().isUseDeviceAuth() == true) goto L5;
        return true;
    L5:
        Boolean r4 = this.mAuthDeviceMap.get(r3);
        if (r4 != null) goto L8;
        return false;
    L8:
        if (r4.booleanValue() == false) goto L12;
        return true;
    L12:
        return false;
    }

    private void publishDeviceConnectionStatus(BluetoothDevice r2, int r3) {
        this.mBtEventCbManager.onConnection(r2, r3);
        if (2 == r3) goto L5;
        if (r3 == 0) goto L5;
        return;
    L5:
        ChangeBleMtuTimeoutTask r0 = this.mChangeBleMtuTimeoutTask;
        if (r0 != null) goto L8;
    L10:
        if (r3 != 0) goto L15;
        if (r2 == null) goto L16;
        removeDevAuth(r2.getAddress());
        return;
    L16:
        return;
    L15:
        return;
    L8:
        if (BluetoothUtil.deviceEquals(r2, r0.getDevice()) == false) goto L10;
        stopChangeBleMtu();
        goto L10
    }

    private void removeDevAuth(String r2) {
        this.mAuthDeviceMap.remove(r2);
    }

    private void setDevAuth(BluetoothDevice r2, boolean r3) {
        if (r2 != null) goto L4;
        return;
    L4:
        this.mAuthDeviceMap.put(r2.getAddress(), Boolean.valueOf(r3));
    }

    private boolean startChangeMtu(BluetoothDevice r5, int r6) {
        if (this.mChangeBleMtuTimeoutTask == null) goto L6;
        JL_Log.w(TAG, "-startChangeMtu- Adjusting the MTU for BLE");
        return true;
    L6:
        boolean r0 = this.mBluetoothOp.requestBleMtu(r5, r6);
        JL_Log.i(TAG, "-startChangeMtu- requestBleMtu = " + r0 + ", change mtu = " + r6);
        if (r0 == false) goto L9;
        ChangeBleMtuTimeoutTask r7 = new ChangeBleMtuTimeoutTask(this, r5);
        this.mChangeBleMtuTimeoutTask = r7;
        this.mHandler.postDelayed(r7, 5000);
    L9:
        return r0;
    }

    private void stopChangeBleMtu() {
        JL_Log.i(TAG, "-stopChangeBleMtu- >>>>");
        ChangeBleMtuTimeoutTask r0 = this.mChangeBleMtuTimeoutTask;
        if (r0 == null) goto L6;
        this.mHandler.removeCallbacks(r0);
        this.mChangeBleMtuTimeoutTask = null;
        return;
    }

    public void addBluetoothEventListener(BluetoothEventListener r2) {
        this.mBtEventCbManager.addBluetoothEventListener(r2);
    }

    @SuppressLint({"MissingPermission"})
    public void connectDevice(BluetoothDevice r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        int r0 = r6.getType();
        int r2 = 0;
        if (r0 == 0) goto L7;
        if (r0 == 3) goto L7;
    L21:
        this.mBluetoothOp.connectBtDevice(r6, r2);
        return;
    L7:
        int r1 = getCacheConnectWay(r6);
        if (this.configHelper.isSPPConnectWay() == false) goto L21;
        if (r1 != 1) goto L20;
        String r3 = this.mBluetoothOp.getMappedDeviceAddress(r6.getAddress());
        if (BluetoothAdapter.checkBluetoothAddress(r3) == false) goto L20;
        BluetoothDevice r4 = AppUtil.getRemoteDevice(r3);
        if (r4 == null) goto L20;
        if (r4.getType() == 2) goto L20;
        if (r4.getType() == 3) goto L20;
        r6 = r4;
    L20:
        r2 = r1;
        goto L21
    }

    public boolean connectDeviceWithoutRecord(BluetoothDevice r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        return this.mBluetoothOp.connectBtDeviceWithoutRecord(r3, 0);
    }

    public void connectHistoryRecord(HistoryRecord r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        this.mBluetoothOp.connectHistoryRecord(r3, null);
    }

    public void destroy() {
        this.mBluetoothOp.unregisterBluetoothCallback(this.mBtEventCallback);
        this.mBluetoothOp.destroy();
        this.mRcspAuth.removeListener(this.mRcspAuthListener);
        this.mRcspAuth.destroy();
        this.mAuthDeviceMap.clear();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mBtEventCbManager.destroy();
        instance = null;
    }

    public void disconnectDevice(BluetoothDevice r2) {
        if (r2 != null) goto L5;
        return;
    L5:
        if (isConnectedBtDevice(r2) == false) goto L8;
        this.mBluetoothOp.disconnectBtDevice(r2);
        return;
    L8:
        publishDeviceConnectionStatus(r2, 0);
    }

    public BluetoothManager getBluetoothOp() {
        return (BluetoothManager) this.mBluetoothOp;
    }

    public int getCacheConnectWay(BluetoothDevice r2) {
        if (r2 != null) goto L5;
        return 0;
    L5:
        if (this.mBluetoothOp.isConnectedDevice(r2) == true) goto L7;
        HistoryRecord r3 = this.mBluetoothOp.getHistoryRecord(r2.getAddress());
        if (r3 != null) goto L13;
        return 0;
    L13:
        return r3.getConnectType();
    L7:
        if (this.mBluetoothOp.isConnectedSppDevice(r2) == false) goto L14;
        return 1;
    L14:
        return 0;
    }

    public BluetoothGatt getConnectedBluetoothGatt(BluetoothDevice r2) {
        return this.mBluetoothOp.getDeviceGatt(r2);
    }

    public BluetoothDevice getConnectedBtDevice() {
        return this.mBluetoothOp.getConnectedDevice();
    }

    public int getConnectionStatus(BluetoothDevice r3) {
        if (r3 != null) goto L6;
        return 0;
    L6:
        if (isConnectedBtDevice(r3) == false) goto L10;
        return 1;
    L10:
        if (BluetoothUtil.deviceEquals(r3, getBluetoothOp().getConnectingDevice()) == false) goto L13;
        return 3;
    L13:
        return 0;
    }

    public boolean isAuthDevice(BluetoothDevice r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (isDevAuth(r1.getAddress()) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean isConnectedBtDevice(BluetoothDevice r2) {
        return this.mBluetoothOp.isConnectedDevice(r2);
    }

    public boolean isConnectedDevice() {
        if (getConnectedBtDevice() != null) goto L5;
        return false;
    L5:
        if (isDevAuth(getConnectedBtDevice().getAddress()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isConnectedSppDevice(BluetoothDevice r2) {
        return this.mBluetoothOp.isConnectedSppDevice(r2);
    }

    public boolean isHistoryRecord(BluetoothDevice r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (this.mBluetoothOp.getHistoryRecord(r2.getAddress()) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean isUsedBtDevice(BluetoothDevice r2) {
        if (this.mBluetoothOp.isConnectedDevice(r2) == true) goto L5;
        return false;
    L5:
        if (BluetoothUtil.deviceEquals(getConnectedBtDevice(), r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public void removeBluetoothEventListener(BluetoothEventListener r2) {
        this.mBtEventCbManager.removeBluetoothEventListener(r2);
    }

    public void removeHistoryRecord(String r2, OnHistoryRecordCallback r3) {
        if (BluetoothAdapter.checkBluetoothAddress(r2) == true) goto L5;
        return;
    L5:
        this.mBluetoothOp.removeHistoryRecord(r2, r3);
    }

    public boolean sendDataToDevice(BluetoothDevice r2, byte[] r3) {
        return this.mBluetoothOp.sendDataToDevice(r2, r3);
    }

    public void connectDevice(BluetoothDevice r2, int r3) {
        this.mBluetoothOp.connectBtDevice(r2, r3);
    }

    public void connectDevice(BluetoothDevice r3, BleScanMessage r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r4 != null) goto L6;
        connectDevice(r3);
        return;
    L6:
        if (this.configHelper.isSPPConnectWay() == false) goto L10;
        BluetoothDevice r5 = AppUtil.getRemoteDevice(r4.getEdrAddr());
        if (r5 == null) goto L10;
        int r6 = 1;
        r3 = r5;
    L11:
        this.mBluetoothOp.connectBtDevice(r3, r6);
        return;
    L10:
        r6 = 0;
        goto L11
    }
}
