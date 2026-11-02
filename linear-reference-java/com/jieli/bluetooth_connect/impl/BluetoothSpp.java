package com.jieli.bluetooth_connect.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.jieli.bluetooth_connect.interfaces.IBluetoothSpp;
import com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtSppListener;
import com.jieli.bluetooth_connect.tool.ReceiveSppDataThread;
import com.jieli.bluetooth_connect.tool.SppEventCbManager;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.CHexConverter;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothSpp implements IBluetoothSpp {
    private static final int DELAY_TIME = 1000;
    private static final int MSG_CONNECT_SPP = 41014;
    private static final int MSG_CONNECT_SPP_TIMEOUT = 41013;
    private static final int MSG_WAIT_SYSTEM_CONNECT_EDR_TIMEOUT = 41015;
    private static final String TAG = "BluetoothSpp";
    private static final int WAIT_TIMEOUT = 3000;
    private final BluetoothBrEdr mBluetoothBrEdr;
    private BluetoothOption mBluetoothOption;
    private final BluetoothPair mBluetoothPair;
    private volatile BluetoothDevice mConnectedSppDevice;
    private final List<BluetoothDevice> mConnectedSppDevices;
    private volatile BluetoothDevice mConnectingSppDevice;
    private ConnectionSppThread mConnectionSppThread;
    private final Context mContext;
    private final Handler mHandler;
    private final OnBrEdrListener mOnBrEdrListener;
    private final OnBtDevicePairListener mOnBtDevicePairListener;
    private final ReceiveSppDataThread.OnRecvSppDataListener mOnRecvSppDataListener;
    private final SppEventCbManager mSppEventCbManager;
    private BluetoothSppReceiver mSppReceiver;
    private final Map<String, ReceiveSppDataThread> mSppRecvThreadMap;
    private final Map<String, BluetoothSocket> mSppSocketMap;
    private final ExecutorService mThreadPool;

    public class BluetoothSppReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothSpp this$0;

        private BluetoothSppReceiver(final BluetoothSpp this$0) {
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) goto L27;
            String r0 = intent.getAction();
            if (TextUtils.isEmpty(r0) == false) goto L7;
            return;
        L7:
            if ("android.bluetooth.device.action.UUID".equals(r0) == false) goto L25;
            BluetoothDevice r1 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r1 != null) goto L11;
            return;
        L11:
            if (ConnectUtil.isHasConnectPermission(context) == false) goto L28;
            Parcelable[] r7 = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
            if (r7 != null) goto L17;
            BluetoothSpp.access$1800(this.this$0, r1, null);
            JL_Log.i(BluetoothSpp.access$100(), "ACTION_UUID", "no uuids");
            return;
        L17:
            ParcelUuid[] r2 = new ParcelUuid[r7.length];
            int r3 = 0;
        L19:
            if (r3 >= r7.length) goto L21;
            r2[r3] = ParcelUuid.fromString(r7[r3].toString());
            JL_Log.i(BluetoothSpp.access$100(), "ACTION_UUID", "uuid : " + r2[r3].toString());
            r3 = r3 + 1;
            goto L19
        L21:
            BluetoothSpp.access$1800(this.this$0, r1, r2);
            return;
        L28:
            return;
        L25:
            return;
        }

        public /* synthetic */ BluetoothSppReceiver(BluetoothSpp r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public class ConnectionSppThread extends Thread {
        private static final String tag = "ConnectionThread";
        private final BluetoothDevice mDevice;
        final /* synthetic */ BluetoothSpp this$0;

        public /* synthetic */ ConnectionSppThread(BluetoothSpp r1, BluetoothDevice r2, AnonymousClass1 r3) {
            this(r1, r2);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public synchronized void run() {
            monitor-enter(this);
            JL_Log.i(BluetoothSpp.access$100(), tag, "spp connect start. Device : " + BluetoothSpp.access$200(this.this$0, this.mDevice) + ", uuid : " + BluetoothSpp.access$1100(this.this$0).getSppUUID());     // Catch: Throwable -> L11
            if (this.mDevice != null) goto L6;
        L33:
            BluetoothSpp.access$1302(this.this$0, null);     // Catch: Throwable -> L11
            JL_Log.i(BluetoothSpp.access$100(), tag, "exit");     // Catch: Throwable -> L11
            monitor-exit(this);
            return;
        L6:
            if (ConnectUtil.isHasConnectPermission(BluetoothSpp.access$900(this.this$0)) == false) goto L33;
            if (BluetoothUtil.deviceHasProfile(BluetoothSpp.access$900(this.this$0), this.mDevice, BluetoothSpp.access$1100(this.this$0).getSppUUID()) == true) goto L38;
            JL_Log.e(BluetoothSpp.access$100(), tag, "device no spp uuid. " + BluetoothSpp.access$1100(this.this$0).getSppUUID());     // Catch: Throwable -> L11
        L38:
            BluetoothSocket r2 = this.mDevice.createRfcommSocketToServiceRecord(BluetoothSpp.access$1100(this.this$0).getSppUUID());     // Catch: Throwable -> L11 Exception -> L19
            r2.connect();     // Catch: Throwable -> L11 Exception -> L17
            int r3 = 2;
        L22:
            if (2 == r3) goto L26;
            JL_Log.e(BluetoothSpp.access$100(), tag, "spp connect failed. " + BluetoothSpp.access$200(this.this$0, this.mDevice));     // Catch: Throwable -> L11
            BluetoothSpp.access$300(this.this$0, this.mDevice, r3);     // Catch: Throwable -> L11
            BluetoothSpp.access$1302(this.this$0, null);     // Catch: Throwable -> L11
            monitor-exit(this);
            return;
        L26:
            JL_Log.i(BluetoothSpp.access$100(), tag, "spp connect ok. " + BluetoothSpp.access$200(this.this$0, this.mDevice));     // Catch: Throwable -> L11
            if (BluetoothSpp.access$1400(this.this$0) != null) goto L30;
            this.this$0.setConnectedSppDevice(this.mDevice);     // Catch: Throwable -> L11
        L30:
            if (BluetoothSpp.access$1500(this.this$0).contains(this.mDevice) == true) goto L32;
            BluetoothSpp.access$1500(this.this$0).add(this.mDevice);     // Catch: Throwable -> L11
            BluetoothSpp.access$1600(this.this$0).put(this.mDevice.getAddress(), r2);     // Catch: Throwable -> L11
            BluetoothSpp.access$1700(this.this$0, this.mDevice, r2);     // Catch: Throwable -> L11
        L32:
            BluetoothSpp.access$300(this.this$0, this.mDevice, 2);     // Catch: Throwable -> L11
        L17:
            e = e;
        L21:
            e.printStackTrace();     // Catch: Throwable -> L11
            JL_Log.e(BluetoothSpp.access$100(), tag, "spp connect occurred exception : " + e.getMessage());     // Catch: Throwable -> L11
            r3 = 0;
        L19:
            e = e;
            r2 = null;
        L11:
            th = move-exception;
            throw th;
        }

        private ConnectionSppThread(final BluetoothSpp this$0, BluetoothDevice device) {
            this.this$0 = this$0;
            super(tag);
            this.mDevice = device;
        }
    }

    static {
    }

    public BluetoothSpp(Context context, BluetoothBrEdr bluetoothBrEdr, BluetoothOption option, OnBtSppListener listener) {
        this.mConnectedSppDevices = Collections.synchronizedList(new ArrayList());
        this.mSppSocketMap = Collections.synchronizedMap(new HashMap());
        this.mSppRecvThreadMap = Collections.synchronizedMap(new HashMap());
        this.mThreadPool = Executors.newFixedThreadPool(8);
        this.mHandler = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        OnBtDevicePairListener r0 = new AnonymousClass2(this);
        this.mOnBtDevicePairListener = r0;
        OnBrEdrListener r1 = new AnonymousClass3(this);
        this.mOnBrEdrListener = r1;
        this.mOnRecvSppDataListener = new AnonymousClass4(this);
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        BluetoothBrEdr r4 = (BluetoothBrEdr) ConnectUtil.checkNotNull(bluetoothBrEdr);
        this.mBluetoothBrEdr = r4;
        BluetoothPair r5 = bluetoothBrEdr.getBluetoothPair();
        this.mBluetoothPair = r5;
        r4.addListener2(r1);
        r5.addListener2(r0);
        this.mSppEventCbManager = new SppEventCbManager();
        if (option != null) goto L5;
        option = BluetoothOption.createDefaultOption();
    L5:
        this.mBluetoothOption = option;
        addListener2(listener);
        registerSppReceiver();
    }

    public static /* synthetic */ BluetoothDevice access$000(BluetoothSpp r0) {
        return r0.mConnectingSppDevice;
    }

    public static /* synthetic */ String access$100() {
        return TAG;
    }

    public static /* synthetic */ void access$1000(BluetoothSpp r0, BluetoothDevice r1, int r2) {
        r0.checkNeedConnect(r1, r2);
    }

    public static /* synthetic */ BluetoothOption access$1100(BluetoothSpp r0) {
        return r0.mBluetoothOption;
    }

    public static /* synthetic */ SppEventCbManager access$1200(BluetoothSpp r0) {
        return r0.mSppEventCbManager;
    }

    public static /* synthetic */ ConnectionSppThread access$1302(BluetoothSpp r0, ConnectionSppThread r1) {
        r0.mConnectionSppThread = r1;
        return r1;
    }

    public static /* synthetic */ BluetoothDevice access$1400(BluetoothSpp r0) {
        return r0.mConnectedSppDevice;
    }

    public static /* synthetic */ List access$1500(BluetoothSpp r0) {
        return r0.mConnectedSppDevices;
    }

    public static /* synthetic */ Map access$1600(BluetoothSpp r0) {
        return r0.mSppSocketMap;
    }

    public static /* synthetic */ void access$1700(BluetoothSpp r0, BluetoothDevice r1, BluetoothSocket r2) {
        r0.startReceiveDataThread(r1, r2);
    }

    public static /* synthetic */ void access$1800(BluetoothSpp r0, BluetoothDevice r1, ParcelUuid[] r2) {
        r0.handleDeviceUuids(r1, r2);
    }

    public static /* synthetic */ String access$200(BluetoothSpp r0, BluetoothDevice r1) {
        return r0.printfDeviceInfo(r1);
    }

    public static /* synthetic */ void access$300(BluetoothSpp r0, BluetoothDevice r1, int r2) {
        r0.notifySppState(r1, r2);
    }

    public static /* synthetic */ void access$400(BluetoothSpp r0, BluetoothDevice r1) {
        r0.startConnectSpp(r1);
    }

    public static /* synthetic */ Handler access$500(BluetoothSpp r0) {
        return r0.mHandler;
    }

    public static /* synthetic */ void access$800(BluetoothSpp r0) {
        r0.clearDevices();
    }

    public static /* synthetic */ Context access$900(BluetoothSpp r0) {
        return r0.mContext;
    }

    private void checkNeedConnect(BluetoothDevice device, int status) {
        if (BluetoothUtil.deviceEquals(device, this.mConnectingSppDevice) == true) goto L5;
        return;
    L5:
        if (status == 1) goto L8;
        JL_Log.d(TAG, "checkNeedConnect", "a2dp or hfp connect finish.");
        this.mHandler.removeMessages(MSG_CONNECT_SPP);
        this.mHandler.sendEmptyMessageDelayed(MSG_CONNECT_SPP, 1000);
        return;
    L8:
        this.mHandler.removeMessages(MSG_WAIT_SYSTEM_CONNECT_EDR_TIMEOUT);
    }

    private void clearDevices() {
        JL_Log.d(TAG, "clearDevices", "");
        Iterator r0 = new ArrayList(this.mConnectedSppDevices).iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        disconnectSpp((BluetoothDevice) r0.next());
        goto L4
    L7:
        if (this.mSppSocketMap.isEmpty() == true) goto L19;
        Iterator<String> r1 = this.mSppSocketMap.keySet().iterator();
    L10:
        if (r1.hasNext() == false) goto L19;
        String r2 = r1.next();
        BluetoothSocket r3 = this.mSppSocketMap.get(r2);
        if (r3 == null) goto L10;
        if (r3.isConnected() == false) goto L10;
        r3.close();     // Catch: IOException -> L17
    L17:
        e = move-exception;
        e.printStackTrace();
    L19:
        this.mSppSocketMap.clear();
        this.mSppRecvThreadMap.clear();
        this.mConnectedSppDevices.clear();
        setConnectingSppDevice(null);
        setConnectedSppDevice(null);
    }

    private boolean disconnectSpp(BluetoothDevice device) {
        String r0 = TAG;
        JL_Log.i(r0, "disconnectSpp", "device : " + printfDeviceInfo(device));
        if (device != null) goto L5;
    L24:
        JL_Log.w(r0, "disconnectSpp", "param is error.");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L24;
        if (this.mConnectedSppDevices.contains(device) == true) goto L11;
        JL_Log.i(r0, "disconnectSpp", "device is not connected device.");
        return true;
    L11:
        BluetoothSocket r1 = this.mSppSocketMap.remove(device.getAddress());
        if (r1 != null) goto L14;
    L19:
        ReceiveSppDataThread r2 = this.mSppRecvThreadMap.remove(device.getAddress());
        if (r2 == null) goto L22;
        r2.stopThread();
    L22:
        this.mConnectedSppDevices.remove(device);
        JL_Log.i(TAG, "disconnectSpp", "remove connected device ok.");
        return true;
    L14:
        if (r1.isConnected() == false) goto L19;
        r1.close();     // Catch: Exception -> L17
    L17:
        e = move-exception;
        e.printStackTrace();
        goto L19
    }

    private void handleDeviceUuids(BluetoothDevice device, ParcelUuid[] uuids) {
        if (BluetoothUtil.deviceEquals(device, this.mConnectingSppDevice) == false) goto L6;
        JL_Log.d(TAG, "handleDeviceUuids", "get uuid success.");
        this.mHandler.sendEmptyMessage(MSG_CONNECT_SPP);
        return;
    }

    private void notifySppState(BluetoothDevice device, int status) {
        notifySppState(device, this.mBluetoothOption.getSppUUID(), status);
    }

    private String printfDeviceInfo(BluetoothDevice device) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device);
    }

    private void registerSppReceiver() {
        if (this.mSppReceiver != null) goto L6;
        this.mSppReceiver = new BluetoothSppReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.UUID");
        this.mContext.registerReceiver(this.mSppReceiver, r0);
        return;
    }

    private void removeDevice(BluetoothDevice device) {
        if (this.mConnectedSppDevices.isEmpty() == false) goto L7;
        setConnectedSppDevice(null);
        return;
    L7:
        if (BluetoothUtil.deviceEquals(device, this.mConnectedSppDevice) == false) goto L10;
        List<BluetoothDevice> r2 = this.mConnectedSppDevices;
        setConnectedSppDevice(r2.get(r2.size() - 1));
        return;
    }

    private void startConnectSpp(BluetoothDevice device) {
        JL_Log.i(TAG, "startConnectSpp", "device : " + printfDeviceInfo(device) + ", Connect thread : " + this.mConnectionSppThread);
        if (device != null) goto L5;
        return;
    L5:
        if (this.mConnectionSppThread != null) goto L9;
        ConnectionSppThread r0 = new ConnectionSppThread(this, device, null);
        this.mConnectionSppThread = r0;
        r0.start();
        return;
    }

    private void startReceiveDataThread(BluetoothDevice device, BluetoothSocket socket) {
        JL_Log.e(TAG, "startReceiveDataThread", "socket : " + socket);
        ReceiveSppDataThread r0 = new ReceiveSppDataThread(device, socket, this.mOnRecvSppDataListener);
        if (this.mThreadPool.isShutdown() == true) goto L6;
        this.mThreadPool.submit(r0);
        this.mSppRecvThreadMap.put(device.getAddress(), r0);
        return;
    }

    private void stopConnectSpp() {
        ConnectionSppThread r0 = this.mConnectionSppThread;
        if (r0 == null) goto L14;
    L8:
        e = move-exception;
        e.printStackTrace();
    L10:
        this.mConnectionSppThread = null;
        return;
    L5:
        if (r0.isAlive() == false) goto L10;
        this.mConnectionSppThread.interrupt();     // Catch: Exception -> L8
        goto L10
    }

    private void unregisterSppReceiver() {
        BluetoothSppReceiver r0 = this.mSppReceiver;
        if (r0 == null) goto L6;
        this.mContext.unregisterReceiver(r0);
        this.mSppReceiver = null;
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void addListener(OnBtSppListener listener) {
        addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    @SuppressLint({"MissingPermission"})
    public boolean connectSPPDevice(BluetoothDevice device) {
        if (device != null) goto L5;
    L40:
        JL_Log.i(TAG, "connectSPPDevice", "device is bad object. ");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L40;
        String r2 = TAG;
        JL_Log.i(r2, "connectSPPDevice", "device : " + printfDeviceInfo(device));
        if (this.mConnectingSppDevice == null) goto L12;
        JL_Log.i(r2, "connectSPPDevice", "ConnectingSppDevice is connecting. ConnectingSppDevice : " + printfDeviceInfo(this.mConnectedSppDevice));
        return false;
    L12:
        if (isConnectedSppDevice(device) == false) goto L16;
        notifySppState(device, 2);
        return true;
    L16:
        if (this.mBluetoothOption.isUseMultiDevice() == false) goto L18;
    L22:
        setConnectingSppDevice(device);
        boolean r3 = this.mBluetoothPair.isPaired(device);
        JL_Log.i(r2, "connectSPPDevice", "isPaired : " + r3);
        if (r3 == true) goto L29;
        boolean r4 = this.mBluetoothPair.tryToPair(device);
        JL_Log.i(r2, "connectSPPDevice", "tryToPair : " + r4);
        if (r4 == true) goto L38;
        notifySppState(device, 0);
        JL_Log.w(r2, "connectSPPDevice", "tryToPair is failed.");
        return false;
    L38:
        notifySppState(device, 1);
        this.mHandler.removeMessages(MSG_CONNECT_SPP_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_CONNECT_SPP_TIMEOUT, 40000);
        return true;
    L29:
        if (device.getUuids() == null) goto L35;
        if (BluetoothUtil.deviceHasProfile(this.mContext, device, this.mBluetoothOption.getSppUUID()) == false) goto L35;
        JL_Log.i(r2, "connectSPPDevice", "start connect spp.");
        this.mHandler.sendEmptyMessage(MSG_CONNECT_SPP);
    L35:
        if (device.fetchUuidsWithSdp() == true) goto L38;
        notifySppState(device, 0);
        JL_Log.w(r2, "connectSPPDevice", "fetchUuidsWithSdp is failed.");
        return false;
    L18:
        if (this.mConnectedSppDevice == null) goto L22;
        if (BluetoothUtil.deviceEquals(this.mConnectedSppDevice, device) == true) goto L22;
        disconnectSPPDevice(this.mConnectedSppDevice);
        SystemClock.sleep(300);
        goto L22
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        JL_Log.d(TAG, "destroy", "");
        this.mSppEventCbManager.destroy();
        this.mBluetoothPair.removeListener2(this.mOnBtDevicePairListener);
        this.mBluetoothBrEdr.removeListener2(this.mOnBrEdrListener);
        stopConnectSpp();
        clearDevices();
        if (this.mThreadPool.isShutdown() == true) goto L5;
        this.mThreadPool.shutdownNow();
    L5:
        unregisterSppReceiver();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public boolean disconnectSPPDevice(BluetoothDevice device) {
        JL_Log.i(TAG, "disconnectSPPDevice", "device : " + printfDeviceInfo(device));
        boolean r0 = disconnectSpp(device);
        if (r0 == false) goto L5;
        notifySppState(device, 0);
    L5:
        return r0;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public BluetoothDevice getConnectedSPPDevice() {
        return this.mConnectedSppDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public List<BluetoothDevice> getConnectedSppDevices() {
        return new ArrayList(this.mConnectedSppDevices);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public BluetoothDevice getSppConnectingDevice() {
        return this.mConnectingSppDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public boolean isConnectedSppDevice(BluetoothDevice device) {
        if (device != null) goto L5;
        return false;
    L5:
        BluetoothSocket r3 = this.mSppSocketMap.get(device.getAddress());
        if (r3 != null) goto L9;
        return false;
    L9:
        return r3.isConnected();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public boolean isSppConnecting() {
        if (this.mConnectingSppDevice == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void removeListener(OnBtSppListener listener) {
        removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption option) {
        if (option == null) goto L5;
        this.mBluetoothOption = option;
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public void setConnectedSppDevice(BluetoothDevice device) {
        if (BluetoothUtil.deviceEquals(this.mConnectedSppDevice, device) == true) goto L8;
        this.mConnectedSppDevice = device;
        if (device == null) goto L9;
        this.mSppEventCbManager.onSwitchSppDevice(device);
        return;
    L9:
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public void setConnectingSppDevice(BluetoothDevice connectingSppDevice) {
        this.mConnectingSppDevice = connectingSppDevice;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothSpp
    public synchronized boolean writeDataToSppDevice(BluetoothDevice device, byte[] data) {
        monitor-enter(this);
        if (data == null) goto L30;
        if (device == null) goto L30;
        if (isConnectedSppDevice(device) == true) goto L14;
        JL_Log.w(TAG, "writeDataToSppDevice", "device is disconnected.");     // Catch: Throwable -> L12
        monitor-exit(this);
        return false;
    L14:
        BluetoothSocket r1 = this.mSppSocketMap.get(device.getAddress());     // Catch: Throwable -> L12
        if (r1 != null) goto L17;
    L27:
        JL_Log.w(TAG, "writeDataToSppDevice", "spp socket is close.");     // Catch: Throwable -> L12
        monitor-exit(this);
        return false;
    L17:
        if (r1.isConnected() == false) goto L27;
        r1.getOutputStream().write(data);     // Catch: Throwable -> L12 Exception -> L23
        JL_Log.i(TAG, ConnectUtil.formatString("[writeDataToSppDevice] >>> send data successful. device : %s, data [ %s ].", new Object[]{device, CHexConverter.byte2HexStr(data)}));     // Catch: Throwable -> L12 Exception -> L23
        monitor-exit(this);
        return true;
    L23:
        e = move-exception;
        JL_Log.w(TAG, "writeDataToSppDevice", "have an exception : " + e);     // Catch: Throwable -> L12
        e.printStackTrace();     // Catch: Throwable -> L12
        return false;
    L30:
        JL_Log.w(TAG, "writeDataToSppDevice", "param is error.");     // Catch: Throwable -> L12
        monitor-exit(this);
        return false;
    L12:
        th = move-exception;
        throw th;
    }

    private void notifySppState(BluetoothDevice device, UUID sppUUID, int status) {
        JL_Log.i(TAG, "notifySppState", "device : " + printfDeviceInfo(device) + ", status : " + BluetoothConstant.printBtConnection(status));
        if (status != 1) goto L5;
    L9:
        this.mSppEventCbManager.onSppConnection(device, sppUUID, status);
        return;
    L5:
        if (BluetoothUtil.deviceEquals(this.mConnectingSppDevice, device) == false) goto L7;
        setConnectingSppDevice(null);
        this.mHandler.removeMessages(MSG_CONNECT_SPP_TIMEOUT);
    L7:
        if (status != 0) goto L9;
        removeDevice(device);
        goto L9
    }

    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    public void addListener2(OnBtSppListener listener) {
        this.mSppEventCbManager.addListener(listener);
    }

    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    public void removeListener2(OnBtSppListener listener) {
        this.mSppEventCbManager.removeListener(listener);
    }
}
