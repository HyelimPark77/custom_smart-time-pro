package com.jieli.jl_bt_ota.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.O00OOOXXi;
import com.android.mltcode.paycertificationapi.O1iOiO;
import com.android.mltcode.paycertificationapi.OIX0OI0i;
import com.android.mltcode.paycertificationapi.XIiX100i;
import com.android.mltcode.paycertificationapi.i1iXO;
import com.android.mltcode.paycertificationapi.iIiXOii;
import com.android.mltcode.paycertificationapi.iXXiiiiI;
import com.ironsource.C2985d4;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.constant.JL_Constant;
import com.jieli.jl_bt_ota.constant.StateCode;
import com.jieli.jl_bt_ota.impl.bt.BluetoothAssistant;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeManager;
import com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtBleListener;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtListener;
import com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.ReConnectDevMsg;
import com.jieli.jl_bt_ota.model.ReconnectParam;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.ble.BleCharacteristic;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import com.jieli.jl_bt_ota.model.command.EnterUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.ExitUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.FirmwareUpdateBlockCmd;
import com.jieli.jl_bt_ota.model.command.NotifyUpdateContentSizeCmd;
import com.jieli.jl_bt_ota.model.command.SettingsMtuCmd;
import com.jieli.jl_bt_ota.model.parameter.FirmwareUpdateBlockParam;
import com.jieli.jl_bt_ota.model.parameter.NotifyUpdateContentSizeParam;
import com.jieli.jl_bt_ota.model.parameter.SettingsMtuParam;
import com.jieli.jl_bt_ota.model.response.EnterUpdateModeResponse;
import com.jieli.jl_bt_ota.model.response.SettingsMtuResponse;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.thread.OtaDataCache;
import com.jieli.jl_bt_ota.tool.DeviceReConnectManager;
import com.jieli.jl_bt_ota.tool.RcspOTA;
import com.jieli.jl_bt_ota.tool.callback.BtEventCallbackHelper;
import com.jieli.jl_bt_ota.tool.configure.OtaConfigureHelper;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import com.jieli.jl_bt_ota.util.UuidUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BluetoothOTAManager implements IBluetoothManager, IUpgradeManager {
    public static long FILE_CACHE_DATA_LIMIT = 2097152;
    public static boolean IS_SUPPORT_NEW_RECONNECT_WAY = true;
    private static final long a = 6000;
    private static final long b = 1000;
    private static final long c = 5000;
    private static final int d = 4660;
    private static final int e = 4661;
    private static final int f = 4662;
    private static final int g = 4663;
    private static final int h = 4664;
    private static final int i = 4665;
    private static final int j = 4672;
    private static final int k = 4673;
    private static final int l = 4674;
    private static final int m = 1;
    private static final int n = 2;
    private long A;
    private int B;
    private int C;
    private final OtaConfigureHelper D;
    private ReconnectParam E;
    private final Handler F;
    private final OnBtBleListener G;
    private final OnBtAssistantCallback H;
    private final OnRcspCallback I;
    protected final String TAG;
    protected final Context context;
    private final RcspOpImpl o;
    private final RcspOTA p;
    private final BluetoothAssistant q;
    private final DeviceReConnectManager r;
    private final BtEventCallbackHelper s;
    private final Map<String, Integer> t;
    private final OtaDataCache u;
    private OnBtListener v;
    private IUpgradeCallback w;
    private volatile boolean x;
    private long y;
    private long z;

    static {
    }

    public BluetoothOTAManager(Context r9) {
        String r0 = getClass().getSimpleName();
        this.TAG = r0;
        this.t = new HashMap();
        this.x = false;
        this.y = 20000;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.F = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        OnBtBleListener r1 = new AnonymousClass15(this);
        this.G = r1;
        OnBtAssistantCallback r2 = new AnonymousClass16(this);
        this.H = r2;
        OnRcspCallback r3 = new AnonymousClass17(this);
        this.I = r3;
        this.context = (Context) CommonUtil.checkNotNull(r9, "Context can not be null.");
        this.D = new OtaConfigureHelper(r9);
        if (BluetoothAssistant.isInit() == true) goto L5;
        BluetoothAssistant.init(r9);
    L5:
        BluetoothAssistant r4 = BluetoothAssistant.getInstance();
        this.q = r4;
        RcspOpImpl r5 = new RcspOpImpl(r9, new AnonymousClass2(this));
        this.o = r5;
        JL_Log.i(r0, C2985d4.a.f, CommonUtil.formatString("Lib version name = %s(%d)", new Object[]{JL_Constant.getLibVersionName(), Integer.valueOf(JL_Constant.getLibVersionCode())}));
        this.p = new RcspOTA(r5);
        this.s = new BtEventCallbackHelper();
        this.u = new OtaDataCache();
        this.r = new DeviceReConnectManager(r9, this);
        r4.addOnBtAssistantCallback(r2);
        r4.addOnBtBleListener(r1);
        r5.registerOnRcspCallback(r3);
    }

    public static /* synthetic */ void OXO1(IUpgradeCallback r0, BaseError r1) {
        a(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(IUpgradeCallback r0, String r1, boolean r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ void XO0O10(BluetoothOTAManager r0, BluetoothDevice r1, UUID r2, UUID r3, boolean r4, byte[] r5) {
        r0.a(r1, r2, r3, r4, r5);
    }

    private int a(int r3) {
        if (r3 != 1) goto L5;
        return 3;
    L5:
        if (r3 == 2) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static /* synthetic */ void b(BluetoothOTAManager r0, BluetoothDevice r1) {
        r0.j(r1);
    }

    public static /* synthetic */ void c(BluetoothOTAManager r0, BluetoothDevice r1) {
        r0.k(r1);
    }

    public static /* synthetic */ void d(BluetoothOTAManager r0, BluetoothDevice r1) {
        r0.b(r1);
    }

    public static /* synthetic */ boolean e(BluetoothOTAManager r0, BluetoothDevice r1) {
        return r0.f(r1);
    }

    public static /* synthetic */ void f(BluetoothOTAManager r0) {
        r0.i();
    }

    public static /* synthetic */ void g(BluetoothOTAManager r0) {
        r0.m();
    }

    public static /* synthetic */ void h(BluetoothOTAManager r0) {
        r0.a();
    }

    public static /* synthetic */ DeviceReConnectManager i(BluetoothOTAManager r0) {
        return r0.r;
    }

    public static /* synthetic */ void iO(IUpgradeCallback r0, int r1, float r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ BtEventCallbackHelper j(BluetoothOTAManager r0) {
        return r0.s;
    }

    public static /* synthetic */ ReconnectParam k(BluetoothOTAManager r0) {
        return r0.E;
    }

    public static /* synthetic */ Handler l(BluetoothOTAManager r0) {
        return r0.F;
    }

    private void m() {
        if (a("upgradeStep03") == false) goto L5;
        return;
    L5:
        this.p.enterUpdateMode(new AnonymousClass11(this));
    }

    private void n() {
        if (a("upgradeStep05") == false) goto L5;
        return;
    L5:
        this.p.queryUpdateResult(new AnonymousClass13(this));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void addOnRcspCallback(OnRcspCallback r2) {
        this.o.registerOnRcspCallback(r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void cancelOTA() {
        a(false);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void configure(BluetoothOTAConfigure r4) {
        JL_Log.d(this.TAG, "configure", "" + r4);
        this.q.configure(r4);
        this.o.configure(r4);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public BluetoothOTAConfigure getBluetoothOption() {
        return this.o.getBluetoothOption();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public TargetInfoResponse getDeviceInfo() {
        return getDeviceInfo(getTargetDevice());
    }

    public BluetoothDevice getTargetDevice() {
        return this.o.getTargetDevice();
    }

    public long getTimeout_ms() {
        return this.y;
    }

    public long getTotalTime() {
        return this.A;
    }

    public int getUpdateContentSize() {
        return this.B;
    }

    public boolean isOTA() {
        return this.x;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void onBtDeviceConnection(BluetoothDevice r6, int r7) {
        if (r6 != null) goto L6;
        JL_Log.i(this.TAG, "onBtDeviceConnection", "BluetoothDevice is null.");
        return;
    L6:
        Integer r1 = this.t.get(r6.getAddress());
        if (r1 != null) goto L9;
    L12:
        if (r7 != 0) goto L14;
        this.t.remove(r6.getAddress());
    L15:
        this.s.onBtDeviceConnection(r6, r7);
        JL_Log.i(this.TAG, "onBtDeviceConnection", "device : " + printBtDeviceInfo(r6) + ", " + StateCode.printConnectionState(r7));
        if (r7 == 3) goto L19;
        this.F.removeMessages(k);
    L19:
        if (r7 != 1) goto L24;
        boolean r2 = e(r6);
        JL_Log.d(this.TAG, "onBtDeviceConnection", "isConnectedBLE : " + r2);
        if (r2 == false) goto L24;
        h(r6);
        return;
    L24:
        OnBtListener r0 = this.v;
        if (r0 == null) goto L28;
        r0.onConnection(r6, r7);
        return;
    L28:
        return;
    L14:
        this.t.put(r6.getAddress(), Integer.valueOf(r7));
        goto L15
    L9:
        if (r1.intValue() != r7) goto L12;
        JL_Log.i(this.TAG, "onBtDeviceConnection", "Same status : " + StateCode.printConnectionState(r7));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void onError(BaseError r2) {
        this.s.onError(r2);
        a("errorEventCallback", r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void onMtuChanged(BluetoothGatt r4, int r5, int r6) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r6 != 0) goto L6;
        int r7 = r5 - 3;
    L7:
        JL_Log.i(this.TAG, "onMtuChanged", "bleMtu : " + r7);
        b(r4.getDevice(), r7, r6);
        return;
    L6:
        r7 = 20;
        goto L7
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void onReceiveDeviceData(BluetoothDevice r4, byte[] r5) {
        if (r4 == null) goto L9;
        if (r5 == null) goto L11;
        JL_Log.d(this.TAG, "onReceiveDeviceData", "device : " + r4 + ", recv data : " + CHexConver.byte2HexStr(r5));
        OnBtListener r0 = this.v;
        if (r0 == null) goto L10;
        r0.onReceivedData(r4, r5);
        return;
    L10:
        return;
    L11:
        return;
    }

    public String printBtDeviceInfo(BluetoothDevice r2) {
        return BluetoothUtil.printBtDeviceInfo(this.context, r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void queryMandatoryUpdate(final IActionCallback<TargetInfoResponse> r7) {
        BluetoothDevice r0 = getTargetDevice();
        if (r0 != null) goto L6;
        CommonUtil.callbackError(this.TAG, "queryMandatoryUpdate", r7, OTAError.buildError(4114));
        return;
    L6:
        TargetInfoResponse r2 = getDeviceInfo(r0);
        JL_Log.i(this.TAG, "queryMandatoryUpdate", "cache deviceInfo : " + r2);
        if (r2 != null) goto L9;
        this.o.syncDeviceInfo(new AnonymousClass3(this, r7));
        return;
    L9:
        if (r2.isMandatoryUpgrade() == false) goto L11;
    L15:
        if (r7 == null) goto L17;
        r7.onSuccess(r2);
    L17:
        this.s.onMandatoryUpgrade(r0);
        return;
    L11:
        if (r2.getRequestOtaFlag() == 1) goto L15;
        CommonUtil.callbackError(this.TAG, "queryMandatoryUpdate", r7, OTAError.buildError(0, "Device is connected."));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void registerBluetoothCallback(BtEventCallback r2) {
        this.s.addCallback(r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void release() {
        JL_Log.i(this.TAG, "release", "clazz : " + this);
        a(true);
        h();
        this.t.clear();
        this.r.release();
        this.s.release();
        this.F.removeCallbacksAndMessages(null);
        this.o.unregisterOnRcspCallback(this.I);
        this.o.release();
        this.q.removeOnBtBleListener(this.G);
        this.q.removeOnBtAssistantCallback(this.H);
        this.q.release();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void removeRcspCallback(OnRcspCallback r2) {
        this.o.unregisterOnRcspCallback(r2);
    }

    public void resetTotalTime() {
        this.A = 0;
    }

    public void runOnMainThread(Runnable r5) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) goto L8;
        r5.run();
        return;
    L8:
        this.F.post(r5);
    }

    public void setReconnectAddress(String r2) {
        if (this.r.isWaitingForUpdate() == true) goto L5;
        return;
    L5:
        if (CHexConver.checkBluetoothAddress(r2) == false) goto L9;
        this.r.setReconnectAddress(r2);
        return;
    }

    public void setTimeout_ms(long r1) {
        this.y = r1;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void startOTA(IUpgradeCallback r6) {
        final BluetoothDevice r0 = getTargetDevice();
        if (r0 != null) goto L9;
        JL_Log.w(this.TAG, "startOTA", "Bluetooth device is disconnected.");
        if (r6 == null) goto L16;
        r6.onError(OTAError.buildError(4114));
        return;
    L16:
        return;
    L9:
        if (isOTA() == false) goto L14;
        JL_Log.w(this.TAG, "startOTA", "OTA in progress.");
        if (r6 == null) goto L17;
        r6.onError(OTAError.buildError(ErrorCode.SUB_ERR_OTA_IN_HANDLE));
        return;
    L17:
        return;
    L14:
        b(true);
        this.w = r6;
        BluetoothOTAConfigure r7 = getBluetoothOption();
        JL_Log.d(this.TAG, "startOTA", "device : " + printBtDeviceInfo(r0) + ", " + r7);
        b();
        this.u.init(getBluetoothOption(), new AnonymousClass4(this, r0));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void unregisterBluetoothCallback(BtEventCallback r2) {
        this.s.removeCallback(r2);
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, String r1, BaseError r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void b(BluetoothOTAManager r0, BluetoothDevice r1, byte[] r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ RcspOTA c(BluetoothOTAManager r0) {
        return r0.p;
    }

    public static /* synthetic */ OtaConfigureHelper d(BluetoothOTAManager r0) {
        return r0.D;
    }

    public static /* synthetic */ void e(BluetoothOTAManager r0) {
        r0.g();
    }

    public static /* synthetic */ void f(BluetoothOTAManager r0, BluetoothDevice r1) {
        r0.i(r1);
    }

    public static /* synthetic */ void g(BluetoothOTAManager r0, BluetoothDevice r1) {
        r0.d(r1);
    }

    private void h(BluetoothDevice r7) {
        if (r7 != null) goto L5;
        return;
    L5:
        if (this.F.hasMessages(e) == false) goto L8;
        JL_Log.w(this.TAG, "startChangeMtu", "Adjusting the MTU for BLE");
        return;
    L8:
        BluetoothOTAConfigure r0 = getBluetoothOption();
        if (r0.isNeedChangeMtu() == true) goto L11;
    L13:
        boolean r1 = false;
    L14:
        JL_Log.d(this.TAG, "startChangeMtu", "requestBleMtu : " + r1);
        if (r1 == false) goto L18;
        this.F.removeMessages(e);
        Handler r2 = this.F;
        r2.sendMessageDelayed(r2.obtainMessage(e, r7), 5000);
        return;
    L18:
        g(r7);
        return;
    L11:
        if (r0.getMtu() <= 20) goto L13;
        r1 = d(r7, r0.getMtu());
        goto L14
    }

    private void i(BluetoothDevice r5) {
        this.F.removeMessages(l);
        Handler r0 = this.F;
        r0.sendMessageDelayed(r0.obtainMessage(l, r5), 6000);
        disconnectBluetoothDevice(r5);
    }

    private void j() {
        if (a("startReceiveCmdTimeout") == true) goto L10;
        long r0 = getTimeout_ms();
        if (r0 > 0) goto L8;
        return;
    L8:
        this.F.removeMessages(d);
        this.F.sendEmptyMessageDelayed(d, r0);
        return;
    }

    private void k() {
        this.F.removeMessages(d);
    }

    private void l() {
        if (this.r.isWaitingForUpdate() == false) goto L6;
        this.r.stopReconnectTask();
        return;
    }

    public TargetInfoResponse getDeviceInfo(BluetoothDevice r2) {
        return this.o.getDeviceInfo(r2);
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, BluetoothDevice r1) {
        r0.g(r1);
    }

    public static /* synthetic */ void b(BluetoothOTAManager r0) {
        r0.j();
    }

    private int c(BluetoothDevice r5) {
        TargetInfoResponse r6 = getDeviceInfo(r5);
        if (r6 == null) goto L22;
        if (r6.isSupportDoubleBackup() == true) goto L22;
        if (r6.isMandatoryUpgrade() == false) goto L10;
        return 0;
    L10:
        int r0 = r6.getSingleBackupOtaWay();
        if (r0 != 1) goto L14;
        return 0;
    L14:
        if (r0 != 2) goto L17;
        return 1;
    L17:
        if (r6.getSdkType() < 2) goto L20;
        return 0;
    L20:
        return getBluetoothOption().getPriority();
    L22:
        return getBluetoothOption().getPriority();
    }

    @SuppressLint({"MissingPermission"})
    private boolean d(BluetoothDevice r7, int r8) {
        if (CommonUtil.checkHasConnectPermission(this.context) == true) goto L6;
        JL_Log.i(this.TAG, "requestBleMtu", "Missing connect permission");
        return false;
    L6:
        BluetoothGatt r0 = getConnectedBluetoothGatt();
        if (r0 != null) goto L11;
        JL_Log.i(this.TAG, "requestBleMtu", "getConnectedBluetoothGatt is null.");
        return false;
    L11:
        if (BluetoothUtil.deviceEquals(r0.getDevice(), r7) == true) goto L14;
        JL_Log.i(this.TAG, "requestBleMtu", "Device is not match.");
        return false;
    L14:
        JL_Log.d(this.TAG, "requestBleMtu", "requestMtu is started. mtu : " + r8);
        if (r0.requestMtu(r8 + 3) == true) goto L18;
        JL_Log.i(this.TAG, "requestBleMtu", "Failed to request BLE MTU. callback old mtu.");
        b(r7, 20, 4115);
        return false;
    L18:
        return true;
    }

    private boolean e() {
        return f(getTargetDevice());
    }

    private boolean f(BluetoothDevice r3) {
        if (r3 != null) goto L5;
        return false;
    L5:
        Integer r4 = this.t.get(r3.getAddress());
        if (r4 != null) goto L8;
    L10:
        return false;
    L8:
        if (r4.intValue() != 1) goto L10;
        return true;
    }

    private void g(BluetoothDevice r3) {
        OnBtListener r0 = this.v;
        if (r0 == null) goto L6;
        r0.onConnection(r3, 1);
        return;
    }

    private void k(final BluetoothDevice r3) {
        if (a("upgradeStep01") == false) goto L5;
        return;
    L5:
        this.p.readUpgradeFileFlag(new AnonymousClass6(this, r3));
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0) {
        r0.c();
    }

    public static /* synthetic */ void b(BluetoothOTAManager r0, BluetoothDevice r1, int r2) {
        r0.b(r1, r2);
    }

    private boolean e(BluetoothDevice r4) {
        if (f(r4) == true) goto L5;
        return false;
    L5:
        BluetoothGatt r0 = getConnectedBluetoothGatt();
        if (r0 == null) goto L11;
        if (BluetoothUtil.deviceEquals(r0.getDevice(), r4) == false) goto L11;
        return true;
    L11:
        if (getBluetoothOption().getPriority() != 0) goto L13;
        return true;
    L13:
        return false;
    }

    public static /* synthetic */ OnBtListener a(BluetoothOTAManager r0, OnBtListener r1) {
        r0.v = r1;
        return r1;
    }

    public static /* synthetic */ void b(BluetoothOTAManager r0, BluetoothDevice r1, int r2, int r3) {
        r0.a(r1, r2, r3);
    }

    private boolean f() {
        TargetInfoResponse r0 = getDeviceInfo();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isSupportDoubleBackup() == false) goto L10;
        return true;
    L10:
        return false;
    }

    private void g() {
        if (this.F.hasMessages(j) == false) goto L6;
        this.F.removeMessages(j);
        this.F.sendEmptyMessage(j);
        return;
    }

    private void i() {
        this.C = 0;
        this.B = 0;
    }

    public static /* synthetic */ boolean a(BluetoothOTAManager r0, BluetoothDevice r1, byte[] r2) {
        return r0.b(r1, r2);
    }

    public static /* synthetic */ void b(BluetoothOTAManager r0, BluetoothDevice r1, CommandBase r2) {
        r0.a(r1, r2);
    }

    private void j(final BluetoothDevice r9) {
        if (a("upgradePrepare") == false) goto L5;
        return;
    L5:
        TargetInfoResponse r0 = getDeviceInfo(r9);
        if (r0 != null) goto L10;
        this.o.syncDeviceInfo(new AnonymousClass5(this, r9));
        return;
    L10:
        if (r0.isMandatoryUpgrade() == false) goto L12;
        this.D.saveAddress(r0.getUid(), r0.getPid(), 1, 0, r9.getAddress());
    L23:
        k(r9);
        return;
    L12:
        String r1 = r0.getBleAddr();
        if (CHexConver.checkBluetoothAddress(r1) == false) goto L15;
    L17:
        OtaConfigureHelper r2 = this.D;
        int r3 = r0.getUid();
        int r4 = r0.getPid();
        r2.saveAddress(r3, r4, 0, 0, r1);
        String r5 = r0.getEdrAddr();
        if (CHexConver.checkBluetoothAddress(r5) == false) goto L20;
    L22:
        OtaConfigureHelper r6 = this.D;
        int r7 = r0.getUid();
        int r8 = r0.getPid();
        r6.saveAddress(r7, r8, 0, 1, r5);
        goto L23
    L20:
        if (e(r9) == true) goto L22;
        r5 = r9.getAddress();
        goto L22
    L15:
        if (e(r9) == false) goto L17;
        r1 = r9.getAddress();
        goto L17
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, BluetoothDevice r1, float r2) {
        r0.a(r1, r2);
    }

    private void b(boolean r1) {
        this.x = r1;
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, BluetoothDevice r1, int r2, int r3) {
        r0.c(r1, r2, r3);
    }

    private void b(BluetoothDevice r3, int r4, int r5) {
        this.s.onBleDataBlockChanged(r3, r4, r5);
        JL_Log.i(this.TAG, "onBleDataBlockChanged", CommonUtil.formatString("device : %s, block : %d, status : %d", new Object[]{printBtDeviceInfo(r3), Integer.valueOf(r4), Integer.valueOf(r5)}));
        if (this.F.hasMessages(e) == false) goto L6;
        this.F.removeMessages(e);
        g(r3);
        return;
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, boolean r1) {
        r0.b(r1);
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, BluetoothDevice r1, int r2) {
        r0.c(r1, r2);
    }

    private void c(boolean r7) {
        if (this.z <= 0) goto L8;
        this.A = CommonUtil.getCurrentTime() - this.z;
        if (r7 == false) goto L9;
        this.z = 0;
        return;
    L9:
        return;
    }

    public static /* synthetic */ String a(BluetoothOTAManager r0, BluetoothDevice r1, boolean r2) {
        return r0.a(r1, r2);
    }

    private void h() {
        b(false);
        this.w = null;
        k();
        i();
        c(true);
        a(null);
        this.u.release();
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, String r1, BaseError r2, boolean r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ int a(BluetoothOTAManager r0, int r1) {
        return r0.a(r1);
    }

    private void c() {
        final IUpgradeCallback r0 = this.w;
        JL_Log.i(this.TAG, "callbackStopOTA", "callback : " + r0);
        h();
        if (r0 == null) goto L6;
        runOnMainThread(new O1iOiO(r0));
        return;
    }

    private void d(BluetoothDevice r5) {
        this.F.removeMessages(h);
        boolean r0 = this.r.isWaitingForUpdate();
        JL_Log.i(this.TAG, "handleBrEdrDisconnect", "isWaitingForUpdate : " + r0);
        if (r0 == true) goto L6;
        return;
    L6:
        if (f(r5) == false) goto L9;
        i(r5);
        return;
    L9:
        d();
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, BluetoothDevice r1, CommandBase r2) {
        r0.b(r1, r2);
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, String r1, boolean r2) {
        r0.a(r1, r2);
    }

    private float b(int r3) {
        int r0 = this.B;
        if (r0 <= 0) goto L8;
        float r4 = (r3 * 100.0f) / r0;
        if (r4 < 100.0f) goto L10;
        return 99.9f;
    L10:
        return r4;
    L8:
        return 0.0f;
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, ReconnectParam r1) {
        r0.a(r1);
    }

    private void b() {
        JL_Log.i(this.TAG, "callbackStartOTA", "");
        resetTotalTime();
        final IUpgradeCallback r0 = this.w;
        if (r0 == null) goto L6;
        runOnMainThread(new O00OOOXXi(r0));
        return;
    }

    public static /* synthetic */ void a(BluetoothOTAManager r0, BluetoothDevice r1, ReconnectParam r2) {
        r0.a(r1, r2);
    }

    private void c(final BluetoothDevice r3, int r4, int r5) {
        if (a("upgradeStep02") == false) goto L5;
        return;
    L5:
        if (r5 < 0) goto L13;
        if (r4 < 0) goto L13;
        if (r4 != 0) goto L11;
        if (r5 != 0) goto L11;
        a(r3, new byte[]{CHexConver.intToByte(getBluetoothOption().getPriority())});
        return;
    L11:
        this.u.readOtaData(r4, r5, new AnonymousClass7(this, r3));
        return;
    L13:
        a("upgradeStep02", OTAError.buildError(4097, CommonUtil.formatString("upgradeStep02: offset = %d, len = %d", new Object[]{Integer.valueOf(r4), Integer.valueOf(r5)})));
    }

    private void a(ReconnectParam r1) {
        this.E = r1;
    }

    private String a(BluetoothDevice r3, int r4) {
        String r0 = r3.getAddress();
        TargetInfoResponse r5 = getDeviceInfo(r3);
        if (r5 != null) goto L5;
    L17:
        return r0;
    L5:
        if (r5.isSupportDoubleBackup() == true) goto L17;
        if (r5.isMandatoryUpgrade() == true) goto L11;
        if (r4 == 0) goto L11;
        String r6 = r5.getEdrAddr();
    L13:
        if (CHexConver.checkBluetoothAddress(r6) == false) goto L17;
        if (r6.equals(r0) == true) goto L17;
        return r6;
    L11:
        r6 = r5.getBleAddr();
        goto L13
    }

    private void d() {
        this.F.removeMessages(f);
        this.F.sendEmptyMessageDelayed(f, 1000);
    }

    private void b(BluetoothDevice r6) {
        if (a("checkUpgradeEnvironment") == false) goto L5;
        return;
    L5:
        TargetInfoResponse r1 = getDeviceInfo(r6);
        JL_Log.d(this.TAG, "checkUpgradeEnvironment", CommonUtil.formatString("device : %s, %s", new Object[]{printBtDeviceInfo(r6), r1}));
        if (r1 != null) goto L9;
        a("checkUpgradeEnvironment", OTAError.buildError(4114));
        return;
    L9:
        l();
        if (r1.isSupportDoubleBackup() == false) goto L14;
        m();
        return;
    L14:
        if (r1.isNeedBootLoader() == false) goto L18;
        a(r6);
        j();
        return;
    L18:
        if (r1.isMandatoryUpgrade() == false) goto L21;
        m();
        return;
    L21:
        c(r6, 1);
    }

    private void c(final BluetoothDevice r12, int r13) {
        if (a("readyToReconnectDevice") == true) goto L35;
        TargetInfoResponse r1 = getDeviceInfo();
        if (r1 == null) goto L36;
        int r2 = c(r12);
        if (IS_SUPPORT_NEW_RECONNECT_WAY == false) goto L12;
        if (r13 != 1) goto L12;
        int r3 = 1;
    L13:
        String r6 = a(r12, r2);
        String r7 = a(r12, r1.isMandatoryUpgrade());
        if (r13 == 2) goto L16;
    L18:
        a(new ReconnectParam(r12.getAddress(), r2, r6).setFlag(r3));
        if (r3 != 1) goto L21;
        boolean r9 = true;
    L22:
        ReConnectDevMsg r8 = new ReConnectDevMsg(r2, r6, r9);
        this.r.setReConnectDevMsg(r8);
        JL_Log.d(this.TAG, "readyToReconnectDevice", "flag = " + r3 + ", way = " + r13 + ", " + r8);
        this.F.removeMessages(i);
        this.F.sendEmptyMessageDelayed(i, 6000);
        if (r13 != 1) goto L26;
        this.p.changeCommunicationWay(r2, r3, new AnonymousClass9(this, r12));
        return;
    L26:
        if (r13 == 2) goto L28;
        return;
    L28:
        if (r1.isMandatoryUpgrade() == true) goto L30;
    L32:
        this.p.rebootDevice(new AnonymousClass10(this, r12));
        return;
    L30:
        if (getBluetoothOption().getPriority() == 0) goto L32;
        getBluetoothOption().setPriority(0);
        goto L32
    L21:
        r9 = false;
        goto L22
    L16:
        if (CHexConver.checkBluetoothAddress(r7) == false) goto L18;
        r6 = r7;
    L12:
        r3 = 0;
        goto L13
    L36:
        return;
    }

    private void a(BluetoothDevice r6, ReconnectParam r7) {
        JL_Log.d(this.TAG, "startReConnectTask", CommonUtil.formatString("device : %s, ReconnectParam = %s", new Object[]{printBtDeviceInfo(r6), r7}));
        if (r6 == null) goto L28;
        if (r7 == null) goto L31;
        boolean r8 = f(r6);
        JL_Log.i(this.TAG, "startReConnectTask", "isConnectedDevice = " + r8);
        if (r8 == true) goto L10;
        d();
        return;
    L10:
        boolean r9 = e(r6);
        JL_Log.i(this.TAG, "startReConnectTask", "isBLEConnected = " + r9);
        if (r9 == false) goto L15;
        JL_Log.d(this.TAG, "startReConnectTask", "Waiting for ble disconnect... ");
        d();
        return;
    L15:
        if (this.q.isConnectedByProfile(r6) != 2) goto L17;
        boolean r10 = true;
    L18:
        JL_Log.d(this.TAG, "startReConnectTask", "isEDRConnected : " + r10);
        if (r10 == true) goto L22;
        JL_Log.d(this.TAG, "startReConnectTask", "handleBrEdrDisconnect >>> ");
        d(r6);
        return;
    L22:
        this.F.removeMessages(h);
        Handler r11 = this.F;
        r11.sendMessageDelayed(r11.obtainMessage(h, r6), 6000);
        boolean r12 = this.q.disconnectByProfiles(r6);
        JL_Log.i(this.TAG, "startReConnectTask", "disconnectEdrRet : " + r12);
        if (r12 == true) goto L29;
        JL_Log.i(this.TAG, "startReConnectTask", "Failed to disconnect Classic device.");
        boolean r13 = BluetoothUtil.removeBond(this.context, r6);
        JL_Log.i(this.TAG, "startReConnectTask", "removeBond >>> " + r13);
        if (r13 == true) goto L30;
        d(r6);
        return;
    L30:
        return;
    L29:
        return;
    L17:
        r10 = false;
        goto L18
    L31:
        return;
    }

    private void b(BluetoothDevice r11, int r12) {
        boolean r0 = isOTA();
        boolean r1 = this.r.isWaitingForUpdate();
        JL_Log.i(this.TAG, "notifyConnectionStatus", CommonUtil.formatString("device : %s, state: %s\n isOTA : %s, isWaitingForUpdate : %s.", new Object[]{printBtDeviceInfo(r11), StateCode.printConnectionState(r12), Boolean.valueOf(r0), Boolean.valueOf(r1)}));
        if (r12 == 0) goto L33;
        boolean r2 = true;
        if (r12 != 1) goto L7;
    L11:
        TargetInfoResponse r3 = getDeviceInfo(r11);
        JL_Log.i(this.TAG, "notifyConnectionStatus", "handle connected event. " + r3);
        boolean r5 = r3.isMandatoryUpgrade();
        boolean r6 = r3.isSupportReuseSpaceOTA();
        int r4 = r3.getExpandMode();
        if (r5 == true) goto L18;
        if (r6 == true) goto L15;
    L17:
        r2 = false;
        goto L18
    L15:
        if (r4 != 3) goto L17;
    L18:
        l();
        JL_Log.i(this.TAG, "notifyConnectionStatus", "isForceOTA : " + r2 + ", isMandatoryUpgrade : " + r5 + ", isSupportReuseSpaceOTA : " + r6 + ", expandMode : " + r4);
        if (r2 == false) goto L31;
        a(r11);
        if (r0 == false) goto L41;
        if (r1 == false) goto L41;
        a(r11, 0.0f);
        JL_Log.d(this.TAG, "notifyConnectionStatus", "Reconnect device successfully, continue ...");
        if (getBluetoothOption().isAutoConnectBle() == false) goto L26;
        JL_Log.d(this.TAG, "notifyConnectionStatus", "onConnection : " + StateCode.printConnectionState(r12));
        this.s.onConnection(r11, r12);
    L26:
        if (r5 == false) goto L29;
        m();
        return;
    L29:
        k(r11);
        return;
    L41:
        JL_Log.i(this.TAG, "notifyConnectionStatus", CommonUtil.formatString("onConnection :: device : %s, state: %s", new Object[]{printBtDeviceInfo(r11), StateCode.printConnectionState(r12)}));
        this.s.onConnection(r11, r12);
        return;
    L31:
        if (r0 == false) goto L41;
        JL_Log.d(this.TAG, "notifyConnectionStatus", "The device is functioning properly. However, the cache status is currently being upgraded, so the upgrade call is complete.");
        c();
        goto L41
    L7:
        if (r12 == 2) goto L33;
        if (r12 == 4) goto L11;
    L33:
        JL_Log.w(this.TAG, "notifyConnectionStatus", "handle disconnect event.");
        this.F.removeMessages(g);
        this.F.removeMessages(l);
        k();
        g();
        if (r0 == false) goto L41;
        if (r1 == false) goto L40;
        ReconnectParam r7 = this.E;
        JL_Log.i(this.TAG, "notifyConnectionStatus", " " + r7);
        this.F.removeMessages(h);
        this.F.removeMessages(i);
        if (r7 == null) goto L41;
        JL_Log.i(this.TAG, "notifyConnectionStatus", "device communication channel is disconnect. ready reconnect task. ");
        d();
        return;
    L40:
        a("notifyConnectionStatus", OTAError.buildError(4114));
        goto L41
    }

    private String a(BluetoothDevice r7, boolean r8) {
        if (r7 != null) goto L5;
        return null;
    L5:
        TargetInfoResponse r0 = getDeviceInfo(r7);
        if (r0 == null) goto L13;
        String r2 = this.D.getAddress(r0.getUid(), r0.getPid(), 0, 0);
        if (CHexConver.checkBluetoothAddress(r2) == false) goto L10;
        return r2;
    L10:
        String r1 = this.D.getAddress(r0.getUid(), r0.getPid(), 0, 1);
        if (CHexConver.checkBluetoothAddress(r1) == false) goto L13;
        return r1;
    L13:
        String r9 = r7.getAddress();
        if (r8 == false) goto L22;
        byte[] r10 = BluetoothUtil.addressCovertToByteArray(r9);
        if (r10 == null) goto L23;
        int r11 = CHexConver.byteToInt(r10[r10.length - 1]) - 1;
        if (r11 >= 0) goto L20;
        r11 = 255;
    L20:
        r10[r10.length - 1] = CHexConver.intToByte(r11);
        return BluetoothUtil.hexDataCovetToAddress(r10);
    L23:
        return r9;
    L22:
        return r9;
    }

    private void a(final String r5, final boolean r6) {
        if (a("callbackReconnectEvent") == true) goto L10;
        JL_Log.i(this.TAG, "callbackReconnectEvent", "address : " + r5 + ", " + r6);
        final IUpgradeCallback r0 = this.w;
        if (r0 == null) goto L9;
        runOnMainThread(new i1iXO(r0, r5, r6));
        return;
    L9:
        return;
    }

    private static /* synthetic */ void a(IUpgradeCallback r0, String r1, boolean r2) {
        r0.onNeedReconnect(r1, r2);
    }

    private void a(BluetoothDevice r4, float r5) {
        if (a("callbackProgress") == true) goto L16;
        TargetInfoResponse r6 = getDeviceInfo(r4);
        if (r6 != null) goto L8;
        return;
    L8:
        int r1 = 1;
        boolean r0 = !r6.isNeedBootLoader();
        if (r6.isSupportReuseSpaceOTA() == true) goto L11;
    L13:
        r1 = r0;
    L14:
        a(r1, r5);
        return;
    L11:
        if (r6.getExpandMode() != 3) goto L13;
    }

    private void a(final int r5, final float r6) {
        if (a("callbackProgress") == true) goto L10;
        JL_Log.d(this.TAG, "callbackProgress", "type = " + r5 + ", progress = " + r6);
        c(false);
        final IUpgradeCallback r0 = this.w;
        if (r0 == null) goto L9;
        runOnMainThread(new iXXiiiiI(r0, r5, r6));
        return;
    L9:
        return;
    }

    private static /* synthetic */ void a(IUpgradeCallback r0, int r1, float r2) {
        r0.onProgress(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(BluetoothDevice r3, CommandBase r4) {
        if (r3 == null) goto L27;
        if (r4 != null) goto L6;
        return;
    L6:
        if (r4.getStatus() != 0) goto L32;
        int r0 = r4.getId();
        if (r0 != 209) goto L11;
        SettingsMtuResponse r5 = (SettingsMtuResponse) ((SettingsMtuCmd) r4).getResponse();
        if (r5 == null) goto L30;
        this.o.getDeviceStatusCache().updateDeviceMaxReceiveMtu(r3, r5.getRealMtu());
        return;
    L30:
        return;
    L11:
        if (r0 != 227) goto L13;
        EnterUpdateModeResponse r6 = (EnterUpdateModeResponse) ((EnterUpdateModeCmd) r4).getResponse();
        if (r6 != null) goto L20;
        return;
    L20:
        if (r6.getCanUpdateFlag() != 0) goto L29;
        a(r3);
        return;
    L29:
        return;
    L13:
        if (r0 != 231) goto L33;
        JL_Log.i(this.TAG, "handleResponseCommand", "reboot >>> ");
        disconnectBluetoothDevice(r3);
        return;
    L33:
        return;
    L32:
        return;
    }

    private void a() {
        final IUpgradeCallback r0 = this.w;
        JL_Log.w(this.TAG, "callbackCancelOTA", "callback : " + r0);
        h();
        if (r0 == null) goto L6;
        runOnMainThread(new OIX0OI0i(r0));
        return;
    }

    private void a(String r2, BaseError r3) {
        a(r2, r3, false);
    }

    private void a(String r4, final BaseError r5, boolean r6) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (r6 == false) goto L7;
    L9:
        final IUpgradeCallback r7 = this.w;
        JL_Log.e(this.TAG, "callbackError", CommonUtil.formatString("(%s) ---> %s", new Object[]{r4, r5}));
        h();
        if (r7 == null) goto L13;
        runOnMainThread(new XIiX100i(r7, r5));
        return;
    L13:
        return;
    L7:
        if (a("callbackError") == false) goto L9;
    }

    private static /* synthetic */ void a(IUpgradeCallback r0, BaseError r1) {
        r0.onError(r1);
    }

    private boolean b(BluetoothDevice r9, byte[] r10) {
        if (getBluetoothOption().isAutoConnectBle() == false) goto L9;
        if (this.q.isConnectedBLEDevice(r9) == false) goto L9;
        BleCharacteristic r0 = getBluetoothOption().getBleConnectParam().getBleWriteCharacteristicList().get(0);
        this.q.sendBleData(new BleSendParam(r9, r0.getServiceUUID(), r0.getCharacteristicUUID(), r10, new iIiXOii(this)));
        return true;
    L9:
        return sendDataToDevice(r9, r10);
    }

    private void a(BluetoothDevice r4, int r5, int r6) {
        if (r4 == null) goto L21;
        if (r6 != 0) goto L24;
        boolean r7 = true;
        if (r5 != 1) goto L11;
        if (this.q.isConnectedByA2dp(r4) == 0) goto L16;
    L15:
        r7 = false;
    L16:
        boolean r8 = this.F.hasMessages(h);
        JL_Log.d(this.TAG, "handleBrEdrProfileStatus", "isBrEdrDisconnect : " + r7 + ", isWaitingEdrDisconnectTask : " + r8);
        if (r7 == false) goto L22;
        if (r8 == false) goto L23;
        d(r4);
        return;
    L23:
        return;
    L22:
        return;
    L11:
        if (r5 != 2) goto L16;
        if (this.q.isConnectedByHfp(r4) != 0) goto L15;
    L24:
        return;
    }

    private void a(BluetoothDevice r3) {
        if (this.o.getDeviceStatusCache().getMaxReceiveMtu(r3) >= 530) goto L6;
        this.o.getDeviceStatusCache().updateDeviceMaxReceiveMtu(r3, 530);
        return;
    }

    private void a(final BluetoothDevice r3, byte[] r4) {
        this.p.inquiryDeviceCanOTA(r4, new AnonymousClass8(this, r3));
    }

    private void a(final FirmwareUpdateBlockCmd r3, final int r4, int r5) {
        if (a("upgradeStep04") == false) goto L5;
        return;
    L5:
        k();
        if (r4 != 0) goto L10;
        if (r5 != 0) goto L10;
        JL_Log.i(this.TAG, "upgradeStep04", "Read data completed.");
        r3.setParam(null);
        r3.setStatus(0);
        this.p.sendCommandResponse(r3);
        n();
        return;
    L10:
        this.u.readOtaData(r4, r5, new AnonymousClass12(this, r4, r3));
    }

    private void a(boolean r6) {
        if (a("exitUpdateMode") == true) goto L13;
        boolean r1 = f();
        JL_Log.d(this.TAG, "exitUpdateMode", "isRelease : " + r6 + ", isSupportDoubleBackup : " + r1);
        if (r1 == false) goto L8;
        b(false);
        this.p.exitUpdateMode(new AnonymousClass14(this));
    L9:
        if (r6 == false) goto L12;
        a("exitUpdateMode", OTAError.buildError(ErrorCode.SUB_ERR_SDK_RELEASE));
        return;
    L12:
        return;
    L8:
        JL_Log.i(this.TAG, "exitUpdateMode", CommonUtil.formatString("device[%s] is single flash ota, so ota progress cannot be interrupted.", new Object[]{getTargetDevice()}));
        goto L9
    }

    private boolean a(String r3) {
        if (isOTA() == true) goto L6;
        JL_Log.w(this.TAG, r3, "OTA process has exited.");
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(BluetoothDevice r9, CommandBase r10) {
        if (r9 == null) goto L75;
        if (r10 == null) goto L81;
        int r2 = 0;
        if (r10.getType() != 2) goto L8;
    L11:
        boolean r0 = true;
    L12:
        int r1 = r10.getId();
        if (r1 != 194) goto L15;
        boolean r11 = isOTA();
        boolean r12 = this.F.hasMessages(g);
        JL_Log.d(this.TAG, "Receive C2 Command", "0xC2 : isOTA = " + r11 + ", hasStopAdvNotify = " + r12);
        if (r11 == false) goto L79;
        if (r12 == true) goto L80;
        this.F.sendEmptyMessageDelayed(g, 5000);
        this.p.stopADVInfo(null);
        return;
    L80:
        return;
    L79:
        return;
    L15:
        if (r1 != 209) goto L17;
        SettingsMtuCmd r13 = (SettingsMtuCmd) r10;
        SettingsMtuParam r3 = (SettingsMtuParam) r13.getParam();
        if (r3 != null) goto L63;
        JL_Log.d(this.TAG, "Receive D1 command", "0xD1 : command is error.");
        if (r0 == false) goto L77;
        r13.setStatus(1);
        this.p.sendCommandResponse(r13);
        return;
    L77:
        return;
    L63:
        int r4 = r3.getMtu();
        int r5 = this.o.getDeviceStatusCache().getMaxReceiveMtu(r9);
        if (r4 < 530) goto L66;
        this.o.getDeviceStatusCache().updateDeviceMaxReceiveMtu(r9, r4);
    L67:
        if (r0 == false) goto L78;
        r3.setMtu(r4);
        r13.setStatus(0);
        this.p.sendCommandResponse(r13);
        return;
    L78:
        return;
    L66:
        r4 = r5;
        goto L67
    L17:
        if (r1 != 232) goto L19;
        NotifyUpdateContentSizeCmd r14 = (NotifyUpdateContentSizeCmd) r10;
        if (a("Receive E8 command ") == false) goto L45;
        r2 = 1;
    L44:
        BaseError r15 = null;
    L53:
        r14.setStatus(r2);
        r14.setParam(null);
        this.p.sendCommandResponse(r14);
        if (r15 == null) goto L76;
        a("Receive E8 command", r15);
        return;
    L76:
        return;
    L45:
        NotifyUpdateContentSizeParam r6 = (NotifyUpdateContentSizeParam) r14.getParam();
        if (r6 != null) goto L49;
        JL_Log.w(this.TAG, "Receive E8 Command", "0xE8 : command is error.");
        r15 = OTAError.buildError(12293, "E8 command");
    L48:
        r2 = 1;
        goto L53
    L49:
        JL_Log.w(this.TAG, "Receive E8 Command", "0xE8 : " + r6);
        int r7 = r6.getContentSize();
        if (r7 >= 0) goto L52;
        JL_Log.w(this.TAG, "Receive E8 Command", "0xE8 : length = " + r7);
        r15 = OTAError.buildError(4097, "Update content size : " + r7);
        goto L48
    L52:
        this.z = CommonUtil.getCurrentTime();
        int r8 = r6.getCurrentProgress();
        this.C = r8;
        this.B = r7;
        a(r9, b(r8));
        goto L44
    L19:
        if (r1 != 228) goto L21;
        ExitUpdateModeCmd r16 = (ExitUpdateModeCmd) r10;
        if (isOTA() == false) goto L39;
        a();
    L39:
        r16.setParam(null);
        r16.setStatus(0);
        this.p.sendCommandResponse(r16);
        return;
    L21:
        if (r1 != 229) goto L82;
        k();
        FirmwareUpdateBlockCmd r17 = (FirmwareUpdateBlockCmd) r10;
        if (a("Receive E5 command") == false) goto L27;
        r17.setParam(null);
        r17.setStatus(1);
        this.p.sendCommandResponse(r17);
        return;
    L27:
        FirmwareUpdateBlockParam r18 = (FirmwareUpdateBlockParam) r17.getParam();
        if (r18 != null) goto L31;
        JL_Log.d(this.TAG, "Receive E5 Command", "0xE5 : command is error.");
        r17.setStatus(1);
        this.p.sendCommandResponse(r17);
        a("Receive E5 command", OTAError.buildError(12293, "E5 command"));
        return;
    L31:
        int r19 = r18.getNextUpdateBlockOffsetAddr();
        int r20 = r18.getNextUpdateBlockLen();
        if (this.B <= 0) goto L34;
        int r21 = this.C + r20;
        this.C = r21;
        a(r9, b(r21));
    L34:
        a(r17, r19, r20);
        return;
    L82:
        return;
    L8:
        if (r10.getType() == 3) goto L11;
        r0 = false;
        goto L12
    L81:
        return;
    }

    private /* synthetic */ void a(BluetoothDevice r2, UUID r3, UUID r4, boolean r5, byte[] r6) {
        JL_Log.d(this.TAG, "writeBleData", CommonUtil.formatString("(%s) | UUID(%s : %s) | (%s) ---> \n %s", new Object[]{r2, UuidUtil.read16BitUUID(r3), UuidUtil.read16BitUUID(r4), Boolean.valueOf(r5), CHexConver.byte2HexStr(r6)}));
    }
}
