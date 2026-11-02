package com.jieli.jl_bt_ota.tool;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.constant.JL_Constant;
import com.jieli.jl_bt_ota.impl.BluetoothOTAManager;
import com.jieli.jl_bt_ota.impl.bt.BluetoothAssistant;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.ReConnectDevMsg;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import com.jieli.jl_bt_ota.util.ParseDataUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceReConnectManager {
    public static long RECONNECT_TIMEOUT = 65000;
    private static final String i = "DeviceReConnectManager";
    private static final int j = 3000;
    private static final int k = 20000;
    private static final int l = 2;
    private static final int m = 30000;
    private static final int n = 2000;
    private static final int o = 37973;
    private static final int p = 37974;
    private static final int q = 37975;
    private final Context a;
    private final BluetoothOTAManager b;
    private final BluetoothAssistant c;
    private volatile ReConnectDevMsg d;
    private long e;
    private final Map<String, BleScanMessage> f;
    private final Handler g;
    private final BtEventCallback h;

    static {
    }

    public DeviceReConnectManager(Context r4, BluetoothOTAManager r5) {
        this.e = 0;
        this.f = new HashMap();
        this.g = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        BtEventCallback r0 = new AnonymousClass2(this);
        this.h = r0;
        this.a = (Context) CommonUtil.checkNotNull(r4);
        BluetoothOTAManager r6 = (BluetoothOTAManager) CommonUtil.checkNotNull(r5);
        this.b = r6;
        this.c = BluetoothAssistant.getInstance();
        r6.registerBluetoothCallback(r0);
    }

    public static /* synthetic */ void a(DeviceReConnectManager r0) {
        r0.b();
    }

    public static /* synthetic */ void b(DeviceReConnectManager r0) {
        r0.g();
    }

    public static /* synthetic */ ReConnectDevMsg c(DeviceReConnectManager r0) {
        return r0.d;
    }

    public static /* synthetic */ boolean d(DeviceReConnectManager r0) {
        return r0.f();
    }

    public static /* synthetic */ Map e(DeviceReConnectManager r0) {
        return r0.f;
    }

    private boolean f() {
        if (e() != null) goto L5;
        return false;
    L5:
        if (e().getState() != 2) goto L10;
        return true;
    L10:
        return false;
    }

    private void g() {
        JL_Log.d(i, "stopScan", "---->");
        this.c.stopBLEScan();
        this.c.stopDeviceScan();
    }

    public String getReconnectAddress() {
        ReConnectDevMsg r0 = e();
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getAddress();
    }

    public boolean isDeviceReconnecting() {
        return a(p);
    }

    public boolean isWaitingForUpdate() {
        if (e() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public void release() {
        stopReconnectTask();
        this.b.unregisterBluetoothCallback(this.h);
        this.g.removeCallbacksAndMessages(null);
    }

    public void setReConnectDevMsg(ReConnectDevMsg r4) {
        if (this.d == r4) goto L6;
        this.d = r4;
        this.f.clear();
        JL_Log.d(i, "setReConnectDevMsg", "" + r4);
        return;
    }

    public void setReconnectAddress(String r3) {
        if (CHexConver.checkBluetoothAddress(r3) == true) goto L6;
        return;
    L6:
        if (this.d != null) goto L8;
        setReConnectDevMsg(new ReConnectDevMsg(this.c.getBluetoothOption().getPriority(), r3));
    L9:
        JL_Log.d(i, "setReconnectAddress", "" + this.d);
        return;
    L8:
        this.d.setAddress(r3);
        goto L9
    }

    public void setReconnectUseADV(boolean r2) {
        if (this.d == null) goto L6;
        this.d.setUseADV(r2);
        return;
    }

    public void startReconnectTask() {
        if (isDeviceReconnecting() == true) goto L6;
        JL_Log.i(i, "startReconnectTask", "start...., timeout : " + RECONNECT_TIMEOUT);
        a(c());
        a(p, RECONNECT_TIMEOUT);
        a(o, 0);
        return;
    }

    public void stopReconnectTask() {
        boolean r0 = isDeviceReconnecting();
        boolean r1 = isWaitingForUpdate();
        JL_Log.i(i, "stopReconnectTask", "isReconnecting : " + r0 + ", isWaitingForUpdate : " + r1);
        a(0);
        setReConnectDevMsg(null);
        g();
        this.g.removeCallbacksAndMessages(null);
    }

    public static /* synthetic */ String a() {
        return i;
    }

    public static /* synthetic */ void b(DeviceReConnectManager r0, int r1) {
        r0.b(r1);
    }

    private long c() {
        return Calendar.getInstance().getTimeInMillis();
    }

    private long d() {
        long r0 = RECONNECT_TIMEOUT - (c() - this.e);
        if (r0 >= 0) goto L5;
        return 0;
    L5:
        return r0;
    }

    private ReConnectDevMsg e() {
        if (this.d != null) goto L7;
        return null;
    L7:
        return this.d.cloneObject();
    }

    public static /* synthetic */ void a(DeviceReConnectManager r0, BluetoothDevice r1) {
        r0.a(r1);
    }

    public static /* synthetic */ String b(DeviceReConnectManager r0, BluetoothDevice r1) {
        return r0.b(r1);
    }

    public static /* synthetic */ boolean a(DeviceReConnectManager r0, int r1) {
        return r0.a(r1);
    }

    private void b() {
        ReConnectDevMsg r0 = e();
        if (r0 != null) goto L7;
        JL_Log.w(i, "doReconnectTask", "reConnectDevMsg is null.");
        stopReconnectTask();
        return;
    L7:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L10;
        JL_Log.w(i, "doReconnectTask", "Bluetooth is close.");
        b(o);
        return;
    L10:
        int r4 = 2;
        if (r0.getState() != 2) goto L16;
        JL_Log.w(i, "doReconnectTask", "Task is connecting. " + r0);
        if (a(q) == true) goto L72;
        a(q, 30000);
        return;
    L72:
        return;
    L16:
        BluetoothDevice r2 = this.b.getTargetDevice();
        if (r2 == null) goto L19;
        boolean r7 = true;
    L20:
        String r8 = i;
        JL_Log.i(r8, "doReconnectTask", r0 + ", isConnected : " + r7);
        if (r7 == false) goto L24;
        JL_Log.i(r8, "doReconnectTask", "device is connected. " + r0 + ", device = " + r2);
        return;
    L24:
        BluetoothDevice r3 = b(r0.getAddress());
        JL_Log.w(r8, "doReconnectTask", "connectedDevice : " + b(r3));
        if (r3 == null) goto L29;
        a(r3);
        return;
    L29:
        if (r0.isUseADV() == false) goto L34;
        if (r0.getWay() == 0) goto L34;
        r0.setWay(0);
    L34:
        if (this.c.isScanning() == false) goto L52;
        int r5 = this.c.getScanType();
        if (r5 != 2) goto L38;
        boolean r9 = true;
    L39:
        if (r9 == false) goto L41;
    L48:
        JL_Log.i(r8, "doReconnectTask", "isScanOk : " + r9 + ", scanType = " + r5);
        if (r9 == true) goto L74;
        g();
        SystemClock.sleep(100);
        goto L52
    L74:
        return;
    L41:
        if (r0.getWay() != 1) goto L44;
        if (r5 != 1) goto L44;
    L46:
        r9 = true;
    L44:
        if (r0.getWay() != 0) goto L47;
        if (r5 == 0) goto L46;
    L47:
        r9 = false;
        goto L48
    L38:
        r9 = false;
    L52:
        long r10 = d();
        JL_Log.d(r8, "doReconnectTask", "leftTime ： " + r10 + ", beginTaskTime : " + this.e);
        if (r10 < (RECONNECT_TIMEOUT - 40000)) goto L55;
    L65:
        long r6 = Math.min(r10, 20000);
        if (r0.getWay() != 1) goto L68;
        int r1 = this.c.startDeviceScan(r6, 1);
        JL_Log.i(r8, "doReconnectTask", "startDeviceScan : " + r1 + ", scanTime = " + r6);
    L69:
        if (r1 == 0) goto L73;
        a(o, 3000);
        return;
    L73:
        return;
    L68:
        r1 = this.c.startBLEScan(r6);
        JL_Log.i(r8, "doReconnectTask", "startBLEScan : " + r1 + ", scanTime = " + r6);
        goto L69
    L55:
        if (r0.isUseADV() == true) goto L65;
        if (r0.getWay() != 1) goto L60;
        r4 = 0;
    L60:
        long r11 = r10 - 3000;
        if (r11 <= 0) goto L64;
        r10 = r11;
    L64:
        r1 = this.c.startDeviceScan(r10, r4);
        JL_Log.i(r8, "doReconnectTask", "startDeviceScan : " + r1 + ", way = " + r4 + ", timeout = " + r10);
        goto L69
    L19:
        r7 = false;
        goto L20
    }

    public static /* synthetic */ void a(DeviceReConnectManager r0, BaseError r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void a(DeviceReConnectManager r0, String r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void a(DeviceReConnectManager r0, int r1, long r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ boolean a(DeviceReConnectManager r0, BluetoothDevice r1, byte[] r2) {
        return r0.a(r1, r2);
    }

    private boolean a(BluetoothDevice r7, byte[] r8) {
        if (r7 != null) goto L5;
        return false;
    L5:
        ReConnectDevMsg r1 = e();
        if (r1 != null) goto L8;
        return false;
    L8:
        String r2 = r1.getAddress();
        if (CHexConver.checkBluetoothAddress(r2) == true) goto L11;
        return false;
    L11:
        String r3 = i;
        JL_Log.d(r3, "checkIsReconnectDevice", "device : " + b(r7));
        if (r1.isUseADV() == false) goto L14;
        JL_Log.d(r3, "checkIsReconnectDevice", "advertiseRawData : " + CHexConver.byte2HexStr(r8));
        BleScanMessage r9 = ParseDataUtil.parseOTAFlagFilterWithBroad(r8, JL_Constant.OTA_IDENTIFY);
        if (r9 == null) goto L19;
        JL_Log.d(r3, "checkIsReconnectDevice", "" + r9);
        return r2.equalsIgnoreCase(r9.getOldBleAddress());
    L19:
        return false;
    L14:
        return r2.equals(r7.getAddress());
    }

    private void a(long r1) {
        this.e = r1;
    }

    private void a(BluetoothDevice r8) {
        String r0 = i;
        JL_Log.d(r0, "connectBtDevice", this.d + ", device : " + r8);
        if (this.d != null) goto L5;
        return;
    L5:
        if (this.d.getState() == 2) goto L16;
        this.d.setState(2);
        long r3 = d();
        JL_Log.i(r0, "connectBtDevice", "left time = " + r3);
        if (r3 > 2000) goto L9;
        a(p, 31000);
        JL_Log.i(r0, "connectBtDevice", "Extend the time of reconnecting to the device.");
    L9:
        a(q, 30000);
        BluetoothOTAConfigure r1 = this.b.getBluetoothOption();
        if (r1.isAutoConnectBle() == false) goto L13;
        JL_Log.i(r0, "connectBtDevice", "Start automatic BLE reconnection.");
        this.c.connectBLEDevice(r8, r1.getBleConnectParam());
        return;
    L13:
        this.b.connectBluetoothDevice(r8);
        return;
    }

    private void a(BaseError r4) {
        if (r4 != null) goto L5;
        return;
    L5:
        if (this.b.isOTA() == false) goto L7;
        JL_Log.w(i, "cbReconnectError", "error : " + r4);
        this.b.onError(r4);
    L7:
        stopReconnectTask();
    }

    private void a(String r8) {
        long r0 = d();
        String r2 = i;
        JL_Log.d(r2, "dealWithConnectFailed", "address : " + r8 + ", Left Time = " + r0);
        if (r0 > 2000) goto L6;
        JL_Log.i(r2, "dealWithConnectFailed", "time not enough.");
        a(OTAError.buildError(ErrorCode.SUB_ERR_RECONNECT_FAILED, r8));
        return;
    L6:
        JL_Log.i(r2, "dealWithConnectFailed", "resume reconnect task.");
        a(o, 0);
    }

    private BluetoothDevice b(String r5) {
        if (CHexConver.checkBluetoothAddress(r5) == true) goto L5;
        return null;
    L5:
        List<BluetoothDevice> r0 = BluetoothUtil.getSystemConnectedBtDeviceList(this.a);
        if (r0 != null) goto L8;
    L16:
        return null;
    L8:
        if (r0.isEmpty() == true) goto L16;
        Iterator<BluetoothDevice> r1 = r0.iterator();
    L12:
        if (r1.hasNext() == false) goto L16;
        BluetoothDevice r2 = r1.next();
        if (r5.equals(r2.getAddress()) == false) goto L12;
        return r2;
    }

    private boolean a(int r2) {
        return this.g.hasMessages(r2);
    }

    private void a(int r3, long r4) {
        b(r3);
        if (r4 <= 0) goto L6;
        this.g.sendEmptyMessageDelayed(r3, r4);
        return;
    L6:
        this.g.sendEmptyMessage(r3);
    }

    private String b(BluetoothDevice r2) {
        return BluetoothUtil.printBtDeviceInfo(this.a, r2);
    }

    private void b(int r2) {
        this.g.removeMessages(r2);
    }
}
