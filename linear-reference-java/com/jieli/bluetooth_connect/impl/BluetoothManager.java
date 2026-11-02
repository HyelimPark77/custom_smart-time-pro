package com.jieli.bluetooth_connect.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.XI11iXi;
import com.android.mltcode.paycertificationapi.iIi111IO1;
import com.facebook.login.widget.ToolTipPopup;
import com.ironsource.C2985d4;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.jieli.bluetooth_connect.data.HistoryRecordDbHelper;
import com.jieli.bluetooth_connect.interfaces.IBluetoothOperation;
import com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback;
import com.jieli.bluetooth_connect.interfaces.callback.OnHistoryRecordCallback;
import com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtBleListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDiscoveryListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener;
import com.jieli.bluetooth_connect.tool.BluetoothEventCbManager;
import com.jieli.bluetooth_connect.tool.ReConnectHelper;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.CHexConverter;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothManager implements IBluetoothOperation {
    private static final int ADJUST_BLE_MTU_TIMEOUT = 6000;
    private static final int MSG_ADJUST_BLE_MTU_TIMEOUT = 4113;
    private static final int MSG_CONNECT_DEVICE_TIMEOUT = 4112;
    private static final int MSG_RECONNECT_DEVICE = 4114;
    private static final int REMOVE_HISTORY_RECORD_TIMEOUT = 10000;
    private static final String TAG = "BluetoothManager";
    private final BluetoothBle mBluetoothBle;
    private final BluetoothBrEdr mBluetoothBrEdr;
    private final BluetoothDiscovery mBluetoothDiscovery;
    private BluetoothOption mBluetoothOption;
    private final BluetoothPair mBluetoothPair;
    private final BluetoothSpp mBluetoothSpp;
    private final List<BluetoothDevice> mConnectedBtDevices;
    private volatile BluetoothDevice mConnectedDevice;
    private volatile BluetoothDevice mConnectingDevice;
    private final Context mContext;
    private final BluetoothEventCbManager mEventCbManager;
    private final Handler mHandler;
    private final HistoryRecordDbHelper mHistoryRecordDbHelper;
    private final OnBrEdrListener mOnBrEdrListener;
    private final OnBtBleListener mOnBtBleListener;
    private final OnBtDevicePairListener mOnBtDevicePairListener;
    private final OnBtDiscoveryListener mOnBtDiscoveryListener;
    private final OnBtSppListener mOnBtSppListener;
    private final ReConnectHelper mReConnectHelper;
    private RemoveHistoryRecordTask mRemoveHistoryRecordTask;
    private final Set<String> mSkipRecordSet;

    public class RemoveHistoryRecordTask implements Runnable {
        public static final int STATE_END = 2;
        public static final int STATE_REMOVE_DEVICE = 0;
        public static final int STATE_REMOVE_MAPPED = 1;
        public static final int WAY_DISCONNECT = 1;
        public static final int WAY_REMOVE = 0;
        public String disconnectAddress;
        private final HistoryRecord mHistoryRecord;
        private final OnHistoryRecordCallback mOnHistoryRecordCallback;
        public String removeAddress;
        public int state;
        private final String tag;
        final /* synthetic */ BluetoothManager this$0;

        public RemoveHistoryRecordTask(@NonNull final BluetoothManager this$0, HistoryRecord record, final OnHistoryRecordCallback callback) {
            this.this$0 = this$0;
            this.tag = RemoveHistoryRecordTask.class.getSimpleName();
            this.state = 0;
            this.mHistoryRecord = record;
            this.mOnHistoryRecordCallback = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            int r0 = this.state;
            if (r0 != 0) goto L5;
            BluetoothDevice r1 = BluetoothUtil.getRemoteDevice(BluetoothManager.access$500(this.this$0), this.mHistoryRecord.getAddress());
        L11:
            JL_Log.d(BluetoothManager.access$200(), this.tag, "start ---> state = " + this.state + ", device = " + BluetoothManager.access$800(this.this$0, r1));
            if (r1 == null) goto L29;
            this.removeAddress = r1.getAddress();
            if (this.this$0.isConnectedDevice(r1) == false) goto L18;
            this.disconnectAddress = r1.getAddress();
            BluetoothManager.access$700(this.this$0).postDelayed(this, 10000);
            this.this$0.disconnectBtDevice(r1);
            JL_Log.i(BluetoothManager.access$200(), this.tag, "disconnectBtDevice >>> ");
            return;
        L18:
            if (this.this$0.isConnectedByProfile(r1) != 2) goto L23;
            this.disconnectAddress = r1.getAddress();
            BluetoothManager.access$700(this.this$0).postDelayed(this, 10000);
            if (this.this$0.disconnectByProfiles(r1) == false) goto L23;
            JL_Log.i(BluetoothManager.access$200(), this.tag, "disconnectByProfiles >>> ");
            return;
        L23:
            this.disconnectAddress = null;
            if (this.this$0.isPaired(r1) == false) goto L29;
            boolean r2 = this.this$0.tryToUnPair(r1);
            JL_Log.i(BluetoothManager.access$200(), this.tag, "tryToUnPair ---> " + r2);
            if (r2 == false) goto L29;
            this.state++;
            BluetoothManager.access$700(this.this$0).postDelayed(this, 32000);
            return;
        L29:
            JL_Log.i(BluetoothManager.access$200(), this.tag, "end :: state = " + this.state);
            int r3 = this.state;
            if (r3 > 1) goto L33;
            this.state = r3 + 1;
            this.removeAddress = null;
            BluetoothManager.access$700(this.this$0).post(this);
            return;
        L33:
            BluetoothManager.access$600(this.this$0).deleteHistoryRecord(this.mHistoryRecord);
            OnHistoryRecordCallback r4 = this.mOnHistoryRecordCallback;
            if (r4 == null) goto L36;
            r4.onSuccess(this.mHistoryRecord);
        L36:
            BluetoothManager.access$1002(this.this$0, null);
            return;
        L5:
            if (r0 == 1) goto L7;
        L10:
            r1 = null;
            goto L11
        L7:
            if (this.mHistoryRecord.getAddress().equals(this.mHistoryRecord.getMappedAddress()) == true) goto L9;
            r1 = BluetoothUtil.getRemoteDevice(BluetoothManager.access$500(this.this$0), this.mHistoryRecord.getMappedAddress());
            goto L11
        L9:
            JL_Log.d(BluetoothManager.access$200(), this.tag, "same address, skip");
            this.state++;
            goto L10
        }
    }

    static {
    }

    public BluetoothManager(Context context, BluetoothOption option) {
        this.mEventCbManager = new BluetoothEventCbManager();
        this.mConnectedBtDevices = Collections.synchronizedList(new ArrayList());
        this.mSkipRecordSet = new HashSet();
        this.mHandler = new Handler(Looper.getMainLooper(), new iIi111IO1(this));
        OnBtDiscoveryListener r0 = new AnonymousClass2(this);
        this.mOnBtDiscoveryListener = r0;
        OnBtDevicePairListener r1 = new AnonymousClass3(this);
        this.mOnBtDevicePairListener = r1;
        OnBrEdrListener r2 = new AnonymousClass4(this);
        this.mOnBrEdrListener = r2;
        OnBtSppListener r3 = new AnonymousClass5(this);
        this.mOnBtSppListener = r3;
        OnBtBleListener r4 = new AnonymousClass6(this);
        this.mOnBtBleListener = r4;
        Context r5 = (Context) ConnectUtil.checkNotNull(context);
        this.mContext = r5;
        ConnectUtil.setContext(r5);
        if (option != null) goto L5;
        option = BluetoothOption.createDefaultOption();
    L5:
        this.mBluetoothOption = option;
        JL_Log.i(TAG, C2985d4.a.f, "Lib name = " + BluetoothConstant.getLibVersionName() + ", option = " + option + ",\n clazz : " + this);
        this.mBluetoothDiscovery = new BluetoothDiscovery(context, option, r0);
        BluetoothPair r6 = new BluetoothPair(context, r1);
        this.mBluetoothPair = r6;
        r6.setBluetoothOption(option);
        BluetoothBrEdr r7 = new BluetoothBrEdr(context, r6, r2);
        this.mBluetoothBrEdr = r7;
        r7.setBluetoothOption(option);
        this.mBluetoothSpp = new BluetoothSpp(context, r7, option, r3);
        this.mBluetoothBle = new BluetoothBle(context, r6, option, r4);
        this.mReConnectHelper = new ReConnectHelper(context, this);
        this.mHistoryRecordDbHelper = new HistoryRecordDbHelper(context, this.mBluetoothOption, new AnonymousClass1(this));
    }

    public static /* synthetic */ boolean OXO1(BluetoothManager r4, Message r5) {
        r4.getClass();
        switch(r5.what) {
            case 4112: goto L14;
            case 4113: goto L9;
            case 4114: goto L5;
            default: goto L29;
        };
    L5:
        Object r0 = r5.obj;
        if ((r0 instanceof BluetoothDevice) == true) goto L8;
        return false;
    L8:
        BluetoothDevice r1 = (BluetoothDevice) r0;
        JL_Log.d(TAG, "MSG_RECONNECT_DEVICE", "device : " + r1);
        r4.connectBtDevice(r1, r5.arg1);
        return true;
    L9:
        BluetoothDevice r6 = (BluetoothDevice) r5.obj;
        if (r6 != null) goto L12;
        return true;
    L12:
        if (r4.isConnectedDevice(r6) == false) goto L26;
        r4.mEventCbManager.onConnection(r6, 2);
        return true;
    L26:
        return true;
    L14:
        BluetoothDevice r7 = (BluetoothDevice) r5.obj;
        if (r7 != null) goto L17;
        return true;
    L17:
        if (r4.isConnectedDevice(r7) == true) goto L21;
        JL_Log.i(TAG, "MSG_CONNECT_DEVICE_TIMEOUT", "connect timeout, device : " + r4.printDeviceInfo(r7));
        r4.notifyConnectionStatus(r7, 0);
        if (r4.isConnecting() == false) goto L21;
        r4.disconnectBtDevice(r7);
    L21:
        r4.setConnectingDevice(null);
        return true;
    L29:
        return true;
    }

    public static /* synthetic */ void XIi00iiXO(BluetoothDevice r1, UUID r2, UUID r3, boolean r4, byte[] r5) {
        JL_Log.d(TAG, "writeDataToBLEDevice", ConnectUtil.formatString("---> device : %s, serviceUUID:[%s], characteristicUUID:[%s], data:%s, result:%s", new Object[]{r1, r2, r3, CHexConverter.byte2HexStr(r5), Boolean.valueOf(r4)}));
    }

    public static /* synthetic */ BluetoothEventCbManager access$000(BluetoothManager r0) {
        return r0.mEventCbManager;
    }

    public static /* synthetic */ void access$100(BluetoothManager r0, boolean r1) {
        r0.syncSystemBtDeviceList(r1);
    }

    public static /* synthetic */ RemoveHistoryRecordTask access$1002(BluetoothManager r0, RemoveHistoryRecordTask r1) {
        r0.mRemoveHistoryRecordTask = r1;
        return r1;
    }

    public static /* synthetic */ String access$200() {
        return TAG;
    }

    public static /* synthetic */ boolean access$300(BluetoothManager r0, BluetoothDevice r1, int r2) {
        return r0.notifyRemoveHistoryRecordTask(r1, r2);
    }

    public static /* synthetic */ BluetoothOption access$400(BluetoothManager r0) {
        return r0.mBluetoothOption;
    }

    public static /* synthetic */ Context access$500(BluetoothManager r0) {
        return r0.mContext;
    }

    public static /* synthetic */ HistoryRecordDbHelper access$600(BluetoothManager r0) {
        return r0.mHistoryRecordDbHelper;
    }

    public static /* synthetic */ Handler access$700(BluetoothManager r0) {
        return r0.mHandler;
    }

    public static /* synthetic */ String access$800(BluetoothManager r0, BluetoothDevice r1) {
        return r0.printDeviceInfo(r1);
    }

    public static /* synthetic */ void access$900(BluetoothManager r0, BluetoothDevice r1, int r2) {
        r0.notifyConnectionStatus(r1, r2);
    }

    private void changeConnectedDevice(BluetoothDevice device) {
        if (BluetoothUtil.deviceEquals(this.mConnectedDevice, device) == true) goto L17;
        BluetoothDevice r0 = this.mConnectedDevice;
        this.mConnectedDevice = device;
        if (r0 != null) goto L7;
    L15:
        JL_Log.d(TAG, "changeConnectedDevice", "device : " + printDeviceInfo(device));
        return;
    L7:
        if (isConnectedDevice(device) == false) goto L15;
        if (this.mBluetoothBle.isConnectedBleDevice(device) == false) goto L12;
        this.mBluetoothBle.setConnectedBleDevice(device);
    L14:
        HistoryRecord r1 = getHistoryRecord(device.getAddress());
        r1.setOnlineTime(System.currentTimeMillis());
        this.mHistoryRecordDbHelper.updateHistoryRecord(r1);
        this.mEventCbManager.onSwitchConnectedDevice(device);
        goto L15
    L12:
        if (this.mBluetoothSpp.isConnectedSppDevice(device) == false) goto L14;
        this.mBluetoothSpp.setConnectedSppDevice(device);
        goto L14
    }

    private boolean checkIsValidDevice(BluetoothDevice device) {
        if (device != null) goto L6;
        return false;
    L6:
        if (BluetoothUtil.deviceEquals(device, getConnectingDevice()) == false) goto L8;
        return true;
    L8:
        if (BluetoothUtil.deviceEquals(device, getConnectingBrEdrDevice()) == false) goto L10;
        return true;
    L10:
        if (isConnectedDevice(device) == false) goto L12;
        return true;
    L12:
        if (getHistoryRecord(device.getAddress()) == null) goto L14;
        return true;
    L14:
        if (this.mConnectedBtDevices.contains(device) == true) goto L22;
        return false;
    L22:
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void notifyConnectionStatus(BluetoothDevice r10, int r11) {
        boolean r0 = checkIsValidDevice(r10);
        String r1 = TAG;
        JL_Log.e(r1, "notifyConnectionStatus", "device : " + printDeviceInfo(r10) + ", checkIsValidDevice : " + r0 + ", status : " + BluetoothConstant.printBtConnection(r11));
        if (r0 == true) goto L5;
        return;
    L5:
        if (r11 != 1) goto L7;
    L40:
        JL_Log.d(r1, "notifyConnectionStatus", "onConnection ---> device : " + printDeviceInfo(r10) + ", status : " + BluetoothConstant.printBtConnection(r11));
        this.mEventCbManager.onConnection(r10, r11);
        return;
    L7:
        if (BluetoothUtil.deviceEquals(r10, getConnectingDevice()) == false) goto L9;
        setConnectingDevice(null);
        this.mHandler.removeMessages(4112);
    L9:
        if (r11 != 0) goto L11;
        removeDevice(r10);
        notifyRemoveHistoryRecordTask(r10, 1);
        goto L40
    L11:
        if (r11 != 2) goto L40;
        if (this.mConnectedBtDevices.contains(r10) == true) goto L17;
        this.mConnectedBtDevices.add(r10);
    L17:
        if (this.mConnectedDevice != null) goto L19;
        changeConnectedDevice(r10);
    L19:
        boolean r2 = isConnectedSppDevice(r10);
        if (this.mSkipRecordSet.contains(r10.getAddress()) == true) goto L28;
        this.mHistoryRecordDbHelper.saveHistoryRecord(r10, r2 ? 1 : 0);
        if (this.mConnectedDevice != null) goto L24;
    L29:
        JL_Log.i(r1, "notifyConnectionStatus", "CONNECTION_OK, connected List : " + getConnectedDeviceList().size() + ", connectWay : " + (r2 ? 1 : 0));
        if (r2 == true) goto L40;
        if (getBluetoothOption().isNeedChangeBleMtu() == false) goto L40;
        if (getBluetoothOption().getMtu() <= 20) goto L40;
        if (this.mBluetoothBle.requestBleMtu(r10, getBluetoothOption().getMtu()) == false) goto L40;
        this.mHandler.removeMessages(4113);
        Handler r12 = this.mHandler;
        r12.sendMessageDelayed(r12.obtainMessage(4113, r10), ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        return;
    L24:
        if (BluetoothUtil.deviceEquals(this.mConnectedDevice, r10) == true) goto L29;
        HistoryRecord r3 = getHistoryRecord(this.mConnectedDevice.getAddress());
        if (r3 == null) goto L29;
        r3.setOnlineTime(System.currentTimeMillis() + 200);
        this.mHistoryRecordDbHelper.updateHistoryRecord(r3);
        goto L29
    L28:
        this.mSkipRecordSet.remove(r10.getAddress());
        goto L29
    }

    private boolean notifyRemoveHistoryRecordTask(BluetoothDevice device, int way) {
        boolean r1 = false;
        if (this.mRemoveHistoryRecordTask == null) goto L15;
        if (device == null) goto L15;
        if (way == 1) goto L8;
    L9:
        if (way != 1) goto L11;
    L13:
        if (r1 == false) goto L15;
        JL_Log.i(TAG, "notifyRemoveHistoryRecordTask", "device = " + device + ", way = " + way);
        this.mHandler.removeCallbacks(this.mRemoveHistoryRecordTask);
        this.mHandler.post(this.mRemoveHistoryRecordTask);
        goto L15
    L11:
        if (device.getAddress().equals(this.mRemoveHistoryRecordTask.removeAddress) == false) goto L13;
    L12:
        r1 = true;
        goto L13
    L8:
        if (device.getAddress().equals(this.mRemoveHistoryRecordTask.disconnectAddress) == true) goto L12;
    L15:
        return r1;
    }

    private String printDeviceInfo(BluetoothDevice device) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device);
    }

    private void removeDevice(BluetoothDevice device) {
        if (device == null) goto L11;
        this.mConnectedBtDevices.remove(device);
        if (getConnectedDeviceList().isEmpty() == false) goto L8;
        changeConnectedDevice(null);
        return;
    L8:
        if (BluetoothUtil.deviceEquals(this.mConnectedDevice, device) == false) goto L12;
        List<BluetoothDevice> r2 = this.mConnectedBtDevices;
        changeConnectedDevice(r2.get(r2.size() - 1));
        return;
    L12:
        return;
    }

    private void setConnectingDevice(BluetoothDevice device) {
        this.mConnectingDevice = device;
    }

    private void startRemoveHistoryRecordTask(HistoryRecord historyRecord, OnHistoryRecordCallback callback) {
        if (this.mRemoveHistoryRecordTask == null) goto L7;
        if (callback == null) goto L9;
        callback.onFailed(7, ErrorInfo.getErrDesc(7));
        return;
    L9:
        return;
    L7:
        RemoveHistoryRecordTask r0 = new RemoveHistoryRecordTask(this, historyRecord, callback);
        this.mRemoveHistoryRecordTask = r0;
        this.mHandler.post(r0);
    }

    private void stopRemoveHistoryRecordTask() {
        RemoveHistoryRecordTask r0 = this.mRemoveHistoryRecordTask;
        if (r0 == null) goto L6;
        this.mHandler.removeCallbacks(r0);
        this.mRemoveHistoryRecordTask = null;
        return;
    }

    @SuppressLint({"MissingPermission"})
    private void syncSystemBtDeviceList(boolean isBleWay) {
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L27;
        List<BluetoothDevice> r0 = BluetoothUtil.getSystemConnectedBtDeviceList(this.mContext);
        if (r0 == null) goto L43;
        String r1 = this.mBluetoothOption.getScanFilterData();
        Iterator<BluetoothDevice> r2 = r0.iterator();
    L10:
        if (r2.hasNext() == false) goto L44;
        BluetoothDevice r3 = r2.next();
        if (isConnectedDevice(r3) == true) goto L10;
        if (getDiscoveredBluetoothDevices().contains(r3) == true) goto L10;
        int r4 = r3.getType();
        if (isBleWay == false) goto L22;
        if (r4 == 2) goto L26;
        if (r4 != 3) goto L22;
    L26:
        BleScanMessage r5 = new BleScanMessage();
        r5.setEnableConnect(true);
        this.mEventCbManager.onDiscovery(r3, r5);
    L22:
        if (r3.getName() == null) goto L10;
        if (r1 == null) goto L10;
        if (r3.getName().startsWith(r1) == false) goto L10;
    L44:
        return;
    L43:
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void addListener(OnBtDevicePairListener listener) {
        addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void clearHistoryRecords() {
        this.mHistoryRecordDbHelper.clearAllHistoryRecord();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean connectBLEDevice(BluetoothDevice device) {
        return this.mBluetoothBle.connectBLEDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    @SuppressLint({"MissingPermission"})
    public boolean connectBtDevice(BluetoothDevice device, int connectWay) {
        String r0 = TAG;
        JL_Log.i(r0, "connectBtDevice", "device : " + printDeviceInfo(device) + ", connectWay = " + connectWay);
        if (device != null) goto L5;
    L42:
        JL_Log.i(r0, "connectBtDevice", "device is null");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L42;
        if (BluetoothUtil.isBluetoothEnable() == true) goto L12;
        JL_Log.i(r0, "connectBtDevice", "isBluetoothEnabled : false.");
        return false;
    L12:
        if (isConnecting() == false) goto L16;
        JL_Log.i(r0, "connectBtDevice", "device is connecting. device : " + printDeviceInfo(getConnectingDevice()));
        return false;
    L16:
        if (isConnectedDevice(device) == false) goto L19;
        JL_Log.i(r0, "connectBtDevice", "Device is connected.");
        notifyConnectionStatus(device, 2);
        return true;
    L19:
        JL_Log.d(r0, "connectBtDevice", "isUseMultiDevice : " + this.mBluetoothOption.isUseMultiDevice());
        if (this.mBluetoothOption.isUseMultiDevice() == true) goto L26;
        BluetoothDevice r1 = getConnectedDevice();
        JL_Log.d(r0, "connectBtDevice", "connectedDevice : " + printDeviceInfo(r1));
        if (r1 == null) goto L26;
        if (BluetoothUtil.deviceEquals(r1, device) == true) goto L26;
        disconnectBtDevice(r1);
        SystemClock.sleep(300);
    L26:
        setConnectingDevice(device);
        notifyConnectionStatus(device, 1);
        this.mHandler.removeMessages(4112);
        Handler r2 = this.mHandler;
        r2.sendMessageDelayed(r2.obtainMessage(4112, device), 40000);
        int r3 = device.getType();
        if (r3 == 0) goto L37;
        if (r3 == 1) goto L35;
        if (r3 != 2) goto L31;
        JL_Log.w(r0, "connectBtDevice", "connectBLEDevice by device type");
        return connectBLEDevice(device);
    L31:
        if (r3 == 3) goto L37;
        return true;
    L35:
        JL_Log.w(r0, "connectBtDevice", "connectSPPDevice by device type");
        return connectSPPDevice(device);
    L37:
        if (connectWay != 0) goto L40;
        JL_Log.w(r0, "connectBtDevice", "connectBLEDevice by connectWay");
        return connectBLEDevice(device);
    L40:
        JL_Log.w(r0, "connectBtDevice", "connectSPPDevice by connectWay");
        return connectSPPDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean connectBtDeviceWithoutRecord(BluetoothDevice device, int connectWay) {
        if (device == null) goto L5;
        this.mSkipRecordSet.add(device.getAddress());
    L5:
        return connectBtDevice(device, connectWay);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean connectByProfiles(BluetoothDevice device) {
        return this.mBluetoothBrEdr.connectByProfiles(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void connectHistoryRecord(HistoryRecord record, OnHistoryRecordCallback callback) {
        if (record != null) goto L4;
        return;
    L4:
        int r3 = 0;
        if (record.getDevType() != 5) goto L7;
    L12:
        boolean r0 = true;
    L14:
        if (record.getConnectType() != 1) goto L17;
        if (r0 == false) goto L17;
        String r1 = record.getMappedAddress();
    L18:
        if (r0 == false) goto L20;
        int r2 = 0;
    L22:
        if (BluetoothAdapter.checkBluetoothAddress(record.getUpdateAddress()) == true) goto L24;
    L26:
        r3 = r2;
    L27:
        this.mReConnectHelper.reconnectDevice(r1, r3, callback);
        return;
    L24:
        if (record.getUpdateAddress().equals(r1) == true) goto L26;
        r1 = record.getUpdateAddress();
        goto L27
    L20:
        r2 = record.getConnectType();
    L17:
        r1 = record.getAddress();
        goto L18
    L7:
        if (record.getSdkFlag() == 8) goto L12;
        if (record.getSdkFlag() == 9) goto L12;
        r0 = false;
        goto L14
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean connectSPPDevice(BluetoothDevice device) {
        return this.mBluetoothSpp.connectSPPDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation, com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        JL_Log.w(TAG, "destroy", "");
        stopRemoveHistoryRecordTask();
        this.mBluetoothBle.removeListener2(this.mOnBtBleListener);
        this.mBluetoothBle.destroy();
        this.mBluetoothSpp.removeListener2(this.mOnBtSppListener);
        this.mBluetoothSpp.destroy();
        this.mBluetoothBrEdr.removeListener2(this.mOnBrEdrListener);
        this.mBluetoothBrEdr.destroy();
        this.mBluetoothPair.removeListener2(this.mOnBtDevicePairListener);
        this.mBluetoothPair.destroy();
        this.mBluetoothDiscovery.removeListener2(this.mOnBtDiscoveryListener);
        this.mBluetoothDiscovery.destroy();
        this.mEventCbManager.destroy();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mConnectedBtDevices.clear();
        this.mSkipRecordSet.clear();
        this.mReConnectHelper.destroy();
        this.mHistoryRecordDbHelper.destroy();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean disconnectBLEDevice(BluetoothDevice device) {
        return this.mBluetoothBle.disconnectBLEDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void disconnectBtDevice(BluetoothDevice device) {
        String r0 = TAG;
        JL_Log.d(r0, "disconnectBtDevice", "device : " + printDeviceInfo(device));
        if (device != null) goto L7;
        JL_Log.i(r0, "disconnectBtDevice", "device is null.");
        return;
    L7:
        if (isConnectedBLEDevice(device) == false) goto L11;
        disconnectBLEDevice(device);
        return;
    L11:
        if (isConnectedSppDevice(device) == false) goto L14;
        disconnectSPPDevice(device);
        return;
    L14:
        notifyConnectionStatus(device, 0);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean disconnectByProfiles(BluetoothDevice device) {
        return this.mBluetoothBrEdr.disconnectByProfiles(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean disconnectSPPDevice(BluetoothDevice device) {
        return this.mBluetoothSpp.disconnectSPPDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void fastConnect() {
        List<HistoryRecord> r0 = getHistoryRecordList();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L13;
        Iterator<HistoryRecord> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L14;
        HistoryRecord r2 = r1.next();
        this.mReConnectHelper.reconnectHistory(r2);
        goto L9
    L14:
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothDevice getActivityBluetoothDevice() {
        return this.mBluetoothBrEdr.getActivityBluetoothDevice();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public int getBleMtu(BluetoothDevice device) {
        return this.mBluetoothBle.getBleMtu(device);
    }

    public BluetoothBle getBluetoothBle() {
        return this.mBluetoothBle;
    }

    public BluetoothBrEdr getBluetoothBrEdr() {
        return this.mBluetoothBrEdr;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothOption getBluetoothOption() {
        return this.mBluetoothOption;
    }

    public BluetoothPair getBluetoothPair() {
        return this.mBluetoothPair;
    }

    public BluetoothSpp getBluetoothSpp() {
        return this.mBluetoothSpp;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothGatt getConnectedBluetoothGatt() {
        return this.mBluetoothBle.getConnectedBluetoothGatt();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothDevice getConnectedDevice() {
        if (this.mConnectedDevice != null) goto L8;
        if (this.mConnectedBtDevices.isEmpty() == true) goto L8;
        this.mConnectedDevice = this.mConnectedBtDevices.get(0);
    L8:
        if (this.mConnectedDevice != null) goto L11;
        this.mConnectedDevice = this.mBluetoothBle.getConnectedBleDevice();
    L11:
        if (this.mConnectedDevice != null) goto L14;
        this.mConnectedDevice = this.mBluetoothSpp.getConnectedSPPDevice();
    L14:
        return this.mConnectedDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public List<BluetoothDevice> getConnectedDeviceList() {
        return new ArrayList(this.mConnectedBtDevices);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public List<BluetoothDevice> getConnectedSppList() {
        return this.mBluetoothSpp.getConnectedSppDevices();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothDevice getConnectingBrEdrDevice() {
        return this.mBluetoothBrEdr.getConnectingBrEdrDevice();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothDevice getConnectingDevice() {
        if (this.mConnectingDevice != null) goto L6;
        this.mConnectingDevice = this.mBluetoothBle.getConnectingBleDevice();
    L6:
        if (this.mConnectingDevice != null) goto L9;
        this.mConnectingDevice = this.mBluetoothSpp.getSppConnectingDevice();
    L9:
        return this.mConnectingDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public BluetoothGatt getDeviceGatt(BluetoothDevice device) {
        return this.mBluetoothBle.getDeviceGatt(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public ArrayList<BluetoothDevice> getDiscoveredBluetoothDevices() {
        return this.mBluetoothDiscovery.getDiscoveredBluetoothDevices();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public HistoryRecord getHistoryRecord(String devAddress) {
        return this.mHistoryRecordDbHelper.getHistoryRecordByMac(devAddress);
    }

    public HistoryRecordDbHelper getHistoryRecordHelper() {
        return this.mHistoryRecordDbHelper;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public List<HistoryRecord> getHistoryRecordList() {
        return this.mHistoryRecordDbHelper.getHistoryRecordList();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public String getMappedDeviceAddress(String deviceAddress) {
        return this.mHistoryRecordDbHelper.getMappedAddress(deviceAddress);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public List<BluetoothDevice> getPairedDevices() {
        return this.mBluetoothPair.getPairedDevices();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public int getScanType() {
        return this.mBluetoothDiscovery.getScanType();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isBrEdrConnecting() {
        return this.mBluetoothBrEdr.isBrEdrConnecting();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isConnectedBLEDevice(BluetoothDevice device) {
        return this.mBluetoothBle.isConnectedBleDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public int isConnectedByA2dp(BluetoothDevice device) {
        return this.mBluetoothBrEdr.isConnectedByA2dp(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public int isConnectedByHfp(BluetoothDevice device) {
        return this.mBluetoothBrEdr.isConnectedByHfp(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public int isConnectedByProfile(BluetoothDevice device) {
        return this.mBluetoothBrEdr.isConnectedByProfile(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isConnectedDevice(BluetoothDevice device) {
        boolean r0 = this.mBluetoothBle.isConnectedBleDevice(device);
        boolean r1 = this.mBluetoothSpp.isConnectedSppDevice(device);
        JL_Log.d(TAG, "isConnectedDevice", "device : " + device + ", isBleConnected = " + r0 + ", isSppConnected = " + r1);
        if (r0 == true) goto L8;
        if (r1 == true) goto L10;
        return false;
    L10:
        return true;
    L8:
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isConnectedSppDevice(BluetoothDevice device) {
        return this.mBluetoothSpp.isConnectedSppDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isConnecting() {
        if (this.mConnectingDevice == null) goto L5;
        return true;
    L5:
        if (this.mBluetoothBle.isBleConnecting() == false) goto L7;
        return true;
    L7:
        if (this.mBluetoothSpp.isSppConnecting() == true) goto L14;
        return false;
    L14:
        return true;
    }

    public boolean isMatchDevice(BluetoothDevice device1, BluetoothDevice device2) {
        if (device1 == null) goto L10;
        if (device2 == null) goto L12;
        boolean r0 = BluetoothUtil.deviceEquals(device1, device2);
        if (r0 == true) goto L9;
        String r2 = getMappedDeviceAddress(device1.getAddress());
        return device2.getAddress().equals(r2);
    L9:
        return r0;
    L12:
        return false;
    L10:
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean isPaired(BluetoothDevice device) {
        return this.mBluetoothPair.isPaired(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean isPairing(BluetoothDevice device) {
        return this.mBluetoothPair.isPairing(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isReconnectDevice() {
        return this.mReConnectHelper.isReconnecting();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean isScanning() {
        return this.mBluetoothDiscovery.isScanning();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean pair(BluetoothDevice device) {
        return this.mBluetoothPair.pair(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean registerBluetoothCallback(BluetoothEventCallback bluetoothCallback) {
        return this.mEventCbManager.addListener(bluetoothCallback);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void removeHistoryRecord(String address, OnHistoryRecordCallback callback) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L7;
        if (callback == null) goto L14;
        callback.onFailed(1, "address is error.");
        return;
    L14:
        return;
    L7:
        HistoryRecord r2 = getHistoryRecord(address);
        if (r2 != null) goto L12;
        if (callback == null) goto L15;
        callback.onSuccess(null);
        return;
    L15:
        return;
    L12:
        startRemoveHistoryRecordTask(r2, callback);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void removeListener(OnBtDevicePairListener listener) {
        removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean requestBleMtu(BluetoothDevice device, int mtu) {
        return this.mBluetoothBle.requestBleMtu(device, mtu);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean sendDataToDevice(BluetoothDevice device, byte[] data) {
        if (device == null) goto L16;
        if (data == null) goto L16;
        if (isConnectedDevice(device) == false) goto L16;
        if (isConnectedBLEDevice(device) == false) goto L13;
        return writeDataToBLEDevice(device, getBluetoothOption().getBleServiceUUID(), getBluetoothOption().getBleWriteUUID(), data);
    L13:
        if (isConnectedSppDevice(device) == false) goto L16;
        return writeDataToSppDevice(device, data);
    L16:
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean setActivityBluetoothDevice(BluetoothDevice device) {
        return this.mBluetoothBrEdr.setActivityBluetoothDevice(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation, com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption bluetoothOption) {
        if (bluetoothOption != null) goto L4;
        bluetoothOption = BluetoothOption.createDefaultOption();
    L4:
        this.mBluetoothOption = bluetoothOption;
        JL_Log.d(TAG, "setBluetoothOption", "" + bluetoothOption);
        this.mBluetoothBle.setBluetoothOption(bluetoothOption);
        this.mBluetoothSpp.setBluetoothOption(bluetoothOption);
        this.mBluetoothBrEdr.setBluetoothOption(bluetoothOption);
        this.mBluetoothPair.setBluetoothOption(bluetoothOption);
        this.mBluetoothDiscovery.setBluetoothOption(bluetoothOption);
        this.mHistoryRecordDbHelper.syncSystemDeviceList(bluetoothOption);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void setConnectedDevice(BluetoothDevice device) {
        if (isConnectedDevice(device) == true) goto L5;
        return;
    L5:
        if (BluetoothUtil.deviceEquals(this.mConnectedDevice, device) == true) goto L9;
        changeConnectedDevice(device);
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean startBLEScan(long timeout) {
        return this.mBluetoothDiscovery.startBLEScan(timeout);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean startConnectByBreProfiles(BluetoothDevice breDevice) {
        return this.mBluetoothBrEdr.connectBrEdrDevice(breDevice);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean startDeviceScan(long timeout) {
        return this.mBluetoothDiscovery.startDeviceScan(timeout);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean stopBLEScan() {
        return this.mBluetoothDiscovery.stopBLEScan();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean stopDeviceScan() {
        return this.mBluetoothDiscovery.stopDeviceScan();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public void stopReconnect() {
        this.mReConnectHelper.stopReconnect();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToPair(BluetoothDevice device) {
        return this.mBluetoothPair.tryToPair(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToUnPair(BluetoothDevice device) {
        return this.mBluetoothPair.tryToUnPair(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean unPair(BluetoothDevice device) {
        return this.mBluetoothPair.unPair(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean unregisterBluetoothCallback(BluetoothEventCallback bluetoothCallback) {
        return this.mEventCbManager.removeListener(bluetoothCallback);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean writeDataToBLEDevice(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] writeData) {
        boolean r0 = isConnectedBLEDevice(device);
        if (r0 == false) goto L6;
        this.mBluetoothBle.writeDataByBleAsync(device, serviceUUID, characteristicUUID, writeData, new XI11iXi());
        return r0;
    L6:
        JL_Log.d(TAG, "writeDataToBLEDevice", "device(" + device + ") is disconnected.");
        return r0;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean writeDataToSppDevice(BluetoothDevice device, byte[] data) {
        return this.mBluetoothSpp.writeDataToSppDevice(device, data);
    }

    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    public void addListener2(OnBtDevicePairListener listener) {
        this.mBluetoothPair.addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean pair(BluetoothDevice device, int pairWay) {
        return this.mBluetoothPair.pair(device, pairWay);
    }

    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    public void removeListener2(OnBtDevicePairListener listener) {
        this.mBluetoothPair.removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothOperation
    public boolean startDeviceScan(int type, long timeout) {
        return this.mBluetoothDiscovery.startDeviceScan(type, timeout);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothPair
    public boolean tryToPair(BluetoothDevice device, int pairWay) {
        return this.mBluetoothPair.tryToPair(device, pairWay);
    }
}
