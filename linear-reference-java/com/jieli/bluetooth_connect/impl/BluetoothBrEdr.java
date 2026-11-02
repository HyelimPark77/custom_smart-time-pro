package com.jieli.bluetooth_connect.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.OOOX0;
import com.ironsource.Z3;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr;
import com.jieli.bluetooth_connect.interfaces.listener.OnBrEdrListener;
import com.jieli.bluetooth_connect.interfaces.listener.OnBtDevicePairListener;
import com.jieli.bluetooth_connect.tool.BrEdrEventCbManager;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class BluetoothBrEdr implements IBluetoothBrEdr {
    private static final int MSG_CONNECT_EDR_TIMEOUT = 26145;
    private static final String TAG = "BluetoothBrEdr";
    private volatile boolean isInitA2dp;
    private volatile boolean isInitHfp;
    private final BluetoothProfile.ServiceListener mBTServiceListener;
    private BluetoothA2dp mBluetoothA2dp;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothHandFreeReceiver mBluetoothHandFreeReceiver;
    private BluetoothHeadset mBluetoothHfp;
    private BluetoothOption mBluetoothOption;
    private final BluetoothPair mBluetoothPair;
    private final BrEdrEventCbManager mBrEdrEventCbManager;
    private volatile BluetoothDevice mConnectingEdr;
    private final Context mContext;
    private final Handler mHandler;
    private final OnBtDevicePairListener mOnBtDevicePairListener;

    public class BluetoothHandFreeReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothBrEdr this$0;

        private BluetoothHandFreeReceiver(final BluetoothBrEdr this$0) {
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int r0 = 0;
            if (intent == null) goto L74;
            String r2 = intent.getAction();
            if (r2 != null) goto L8;
            return;
        L8:
            if (r2.isEmpty() == true) goto L75;
            BluetoothDevice r3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r3 != null) goto L14;
            return;
        L14:
            switch(r2.hashCode()) {
                case -855499628: goto L29;
                case -377527494: goto L25;
                case 545516589: goto L21;
                case 1244161670: goto L17;
                default: goto L15;
            };
        L15:
            byte r4 = -1;
        L32:
            switch(r4) {
                case 0: goto L58;
                case 1: goto L48;
                case 2: goto L60;
                case 3: goto L62;
                default: goto L77;
            };
        L48:
            Parcelable[] r10 = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
            if (r10 != null) goto L52;
            BluetoothBrEdr.access$1400(this.this$0, r3, null);
            JL_Log.i(BluetoothBrEdr.access$100(), "ACTION_UUID", "no uuids");
            return;
        L52:
            ParcelUuid[] r5 = new ParcelUuid[r10.length];
        L54:
            if (r0 >= r10.length) goto L56;
            ParcelUuid r6 = ParcelUuid.fromString(r10[r0].toString());
            r5[r0] = r6;
            JL_Log.i(BluetoothBrEdr.access$100(), "ACTION_UUID", r6.toString());
            r0 = r0 + 1;
            goto L54
        L56:
            BluetoothBrEdr.access$1400(this.this$0, r3, r5);
            return;
        L58:
            int r9 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 11);
            JL_Log.i(BluetoothBrEdr.access$100(), "A2DP#ACTION_PLAYING_STATE_CHANGED", "state : " + r9);
            return;
        L60:
            int r11 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);     // Catch: Exception -> L46
            JL_Log.i(BluetoothBrEdr.access$100(), "HFP#ACTION_CONNECTION_STATE_CHANGED", "device : " + BluetoothBrEdr.access$800(this.this$0, r3) + ", state : " + r11);     // Catch: Exception -> L46
            if (r11 == (-1)) goto L72;
            BluetoothBrEdr.access$1200(this.this$0, r3, r11);     // Catch: Exception -> L46
            return;
        L72:
            return;
        L46:
            e = move-exception;
            e.printStackTrace();
            return;
        L62:
            int r12 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);     // Catch: Exception -> L39
            JL_Log.i(BluetoothBrEdr.access$100(), "A2DP#ACTION_CONNECTION_STATE_CHANGED", "device : " + BluetoothBrEdr.access$800(this.this$0, r3) + ", state : " + r12);     // Catch: Exception -> L39
            if (r12 == (-1)) goto L70;
            BluetoothBrEdr.access$1300(this.this$0, r3, r12);     // Catch: Exception -> L39
            return;
        L70:
            return;
        L39:
            e = move-exception;
            e.printStackTrace();
            return;
        L77:
            return;
        L17:
            if (r2.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED") == false) goto L65;
            r4 = 3;
            goto L32
        L65:
            r4 = -1;
            goto L32
        L21:
            if (r2.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") == false) goto L66;
            r4 = 2;
            goto L32
        L66:
            r4 = -1;
            goto L32
        L25:
            if (r2.equals("android.bluetooth.device.action.UUID") == false) goto L67;
            r4 = 1;
            goto L32
        L67:
            r4 = -1;
            goto L32
        L29:
            if (r2.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED") == false) goto L68;
            r4 = 0;
            goto L32
        L68:
            r4 = -1;
            goto L32
        L75:
            return;
        }

        public /* synthetic */ BluetoothHandFreeReceiver(BluetoothBrEdr r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    static {
    }

    public BluetoothBrEdr(Context context, BluetoothPair bluetoothPair, OnBrEdrListener listener) {
        this.mHandler = new Handler(Looper.getMainLooper(), new OOOX0(this));
        this.mBTServiceListener = new AnonymousClass1(this);
        OnBtDevicePairListener r0 = new AnonymousClass2(this);
        this.mOnBtDevicePairListener = r0;
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        BluetoothPair r5 = (BluetoothPair) ConnectUtil.checkNotNull(bluetoothPair);
        this.mBluetoothPair = r5;
        r5.addListener2(r0);
        this.mBrEdrEventCbManager = new BrEdrEventCbManager();
        addListener2(listener);
        initBrEdrService(context);
        registerReceiver();
    }

    public static /* synthetic */ boolean OXO1(BluetoothBrEdr r4, Message r5) {
        r4.getClass();
        if (r5.what != MSG_CONNECT_EDR_TIMEOUT) goto L12;
        Object r6 = r5.obj;
        if ((r6 instanceof BluetoothDevice) == true) goto L7;
        return false;
    L7:
        BluetoothDevice r7 = (BluetoothDevice) r6;
        JL_Log.i(TAG, "MSG_CONNECT_EDR_TIMEOUT", "connectingDev : " + r4.printDeviceInfo(r7));
        if (r4.isConnectedByProfile(r7) == 2) goto L13;
        r4.onBrEdrConnection(r7, 0);
        return true;
    L13:
        return true;
    L12:
        return true;
    }

    public static /* synthetic */ String access$100() {
        return TAG;
    }

    public static /* synthetic */ Context access$1000(BluetoothBrEdr r0) {
        return r0.mContext;
    }

    public static /* synthetic */ boolean access$1100(BluetoothBrEdr r0, BluetoothDevice r1) {
        return r0.tryToConnectBrEdr(r1);
    }

    public static /* synthetic */ void access$1200(BluetoothBrEdr r0, BluetoothDevice r1, int r2) {
        r0.onHfpStatus(r1, r2);
    }

    public static /* synthetic */ void access$1300(BluetoothBrEdr r0, BluetoothDevice r1, int r2) {
        r0.onA2dpStatus(r1, r2);
    }

    public static /* synthetic */ void access$1400(BluetoothBrEdr r0, BluetoothDevice r1, ParcelUuid[] r2) {
        r0.onDeviceUuids(r1, r2);
    }

    public static /* synthetic */ BluetoothA2dp access$202(BluetoothBrEdr r0, BluetoothA2dp r1) {
        r0.mBluetoothA2dp = r1;
        return r1;
    }

    public static /* synthetic */ boolean access$302(BluetoothBrEdr r0, boolean r1) {
        r0.isInitA2dp = r1;
        return r1;
    }

    public static /* synthetic */ BluetoothHeadset access$402(BluetoothBrEdr r0, BluetoothHeadset r1) {
        r0.mBluetoothHfp = r1;
        return r1;
    }

    public static /* synthetic */ boolean access$502(BluetoothBrEdr r0, boolean r1) {
        r0.isInitHfp = r1;
        return r1;
    }

    public static /* synthetic */ BrEdrEventCbManager access$600(BluetoothBrEdr r0) {
        return r0.mBrEdrEventCbManager;
    }

    public static /* synthetic */ void access$700(BluetoothBrEdr r0, BluetoothDevice r1, long r2) {
        r0.startConnectionTimeout(r1, r2);
    }

    public static /* synthetic */ String access$800(BluetoothBrEdr r0, BluetoothDevice r1) {
        return r0.printDeviceInfo(r1);
    }

    public static /* synthetic */ void access$900(BluetoothBrEdr r0, BluetoothDevice r1, int r2) {
        r0.onBrEdrConnection(r1, r2);
    }

    private boolean checkA2dpBadEnv(String method, BluetoothDevice device) {
        if (device != null) goto L5;
    L13:
        JL_Log.w(TAG, method, "device is null");
        return true;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L13;
        if (this.mBluetoothA2dp != null) goto L11;
        JL_Log.w(TAG, method, "BluetoothA2dp is null");
        return true;
    L11:
        return false;
    }

    private boolean checkHfpBadEnv(String method, BluetoothDevice device) {
        if (device != null) goto L5;
    L13:
        JL_Log.w(TAG, method, "device is null");
        return true;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L13;
        if (this.mBluetoothHfp != null) goto L11;
        JL_Log.w(TAG, method, "BluetoothHfp is null");
        return true;
    L11:
        return false;
    }

    private void initBrEdrService(Context context) {
        if (context == null) goto L42;
        android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) context.getSystemService(Z3.d);
        if (r0 == null) goto L8;
        this.mBluetoothAdapter = r0.getAdapter();
    L8:
        if (this.mBluetoothAdapter != null) goto L11;
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    L11:
        if (this.mBluetoothAdapter != null) goto L15;
        JL_Log.w(TAG, "initBrEdrService", "The device does not support Bluetooth.");
        return;
    L15:
        if (this.mBluetoothA2dp != null) goto L25;
        if (this.isInitA2dp == true) goto L25;
        this.isInitA2dp = this.mBluetoothAdapter.getProfileProxy(context, this.mBTServiceListener, 2);     // Catch: Exception -> L22
        if (this.isInitA2dp == true) goto L25;
        JL_Log.w(TAG, "initBrEdrService", "getProfileProxy: a2dp error.");     // Catch: Exception -> L22
    L22:
        e = move-exception;
        e.printStackTrace();
    L25:
        if (this.mBluetoothHfp == null) goto L27;
        return;
    L27:
        if (this.isInitHfp == true) goto L40;
        this.isInitHfp = this.mBluetoothAdapter.getProfileProxy(context, this.mBTServiceListener, 1);     // Catch: Exception -> L32
        if (this.isInitHfp == true) goto L41;
        JL_Log.w(TAG, "initBrEdrService", "getProfileProxy: hfp error");     // Catch: Exception -> L32
        return;
    L41:
        return;
    L32:
        e = move-exception;
        e.printStackTrace();
        return;
    L40:
        return;
    }

    private void onA2dpStatus(BluetoothDevice device, int status) {
        String r0 = TAG;
        JL_Log.d(r0, "onA2dpStatus", ConnectUtil.formatString("device : [%s], status : %s", new Object[]{printDeviceInfo(device), BluetoothUtil.connectionString(status)}));
        this.mBrEdrEventCbManager.onA2dpStatus(device, status);
        if (status != 0) goto L7;
        onBrEdrConnection(device, 0);
        return;
    L7:
        if (status != 2) goto L12;
        onBrEdrConnection(device, 2);
        int r7 = isConnectedByHfp(device);
        JL_Log.i(r0, "onA2dpStatus", "a2dp is connected, hfp status = " + BluetoothUtil.connectionString(r7));
        if (r7 == 2) goto L13;
        connectByProfiles(device);
        return;
    L13:
        return;
    }

    private void onBrEdrConnection(BluetoothDevice device, int status) {
        JL_Log.d(TAG, "onBrEdrConnection", ConnectUtil.formatString("device : [%s], status : %s", new Object[]{printDeviceInfo(device), BluetoothUtil.connectionString(status)}));
        if (status != 1) goto L5;
    L7:
        this.mBrEdrEventCbManager.onBrEdrConnection(device, status);
        return;
    L5:
        if (BluetoothUtil.deviceEquals(device, getConnectingBrEdrDevice()) == false) goto L7;
        setConnectingEdr(null);
        this.mHandler.removeMessages(MSG_CONNECT_EDR_TIMEOUT);
        goto L7
    }

    private void onDeviceUuids(BluetoothDevice device, ParcelUuid[] uuids) {
        this.mBrEdrEventCbManager.onDeviceUuids(device, uuids);
        if (BluetoothUtil.deviceEquals(device, getConnectingBrEdrDevice()) == true) goto L5;
        return;
    L5:
        if (connectByProfiles(device) == true) goto L9;
        onBrEdrConnection(device, 0);
        return;
    }

    private void onHfpStatus(BluetoothDevice device, int status) {
        String r0 = TAG;
        JL_Log.d(r0, "onHfpStatus", ConnectUtil.formatString("device : [%s], status : %s", new Object[]{printDeviceInfo(device), BluetoothUtil.connectionString(status)}));
        this.mBrEdrEventCbManager.onHfpStatus(device, status);
        if (status != 0) goto L7;
        onBrEdrConnection(device, 0);
        return;
    L7:
        if (status != 2) goto L12;
        int r7 = isConnectedByA2dp(device);
        JL_Log.i(r0, "onHfpStatus", "hfp is connected, a2dp status = " + BluetoothUtil.connectionString(r7));
        if (r7 == 2) goto L13;
        connectByProfiles(device);
        return;
    L13:
        return;
    }

    private String printDeviceInfo(BluetoothDevice device) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device);
    }

    private void registerReceiver() {
        if (this.mBluetoothHandFreeReceiver != null) goto L6;
        this.mBluetoothHandFreeReceiver = new BluetoothHandFreeReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.UUID");
        r0.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        r0.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        r0.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        this.mContext.registerReceiver(this.mBluetoothHandFreeReceiver, r0);
        return;
    }

    private void setConnectingEdr(BluetoothDevice device) {
        this.mConnectingEdr = device;
    }

    private void startConnectionTimeout(BluetoothDevice device, long delay) {
        this.mHandler.removeMessages(MSG_CONNECT_EDR_TIMEOUT);
        Handler r0 = this.mHandler;
        r0.sendMessageDelayed(r0.obtainMessage(MSG_CONNECT_EDR_TIMEOUT, device), delay);
    }

    @SuppressLint({"MissingPermission"})
    private boolean tryToConnectBrEdr(BluetoothDevice device) {
        if (device != null) goto L6;
        return false;
    L6:
        if (device.getUuids() != null) goto L8;
    L15:
        boolean r1 = device.fetchUuidsWithSdp();
        String r2 = "fetchUuidsWithSdp";
    L17:
        if (r1 == true) goto L20;
        onBrEdrConnection(device, 0);
        JL_Log.w(TAG, "tryToConnectBrEdr", r2 + " failed.");
        return r1;
    L20:
        JL_Log.i(TAG, "tryToConnectBrEdr", r2 + " success.");
        return r1;
    L8:
        if (device.getUuids().length == 0) goto L15;
        if (BluetoothUtil.deviceHasA2dp(this.mContext, device) == false) goto L12;
    L14:
        r1 = connectByProfiles(device);
        r2 = "connectByProfiles";
        goto L17
    L12:
        if (BluetoothUtil.deviceHasHfp(this.mContext, device) == true) goto L14;
        goto L14
    }

    private void unregisterReceiver() {
        BluetoothHandFreeReceiver r0 = this.mBluetoothHandFreeReceiver;
        if (r0 == null) goto L6;
        this.mContext.unregisterReceiver(r0);
        this.mBluetoothHandFreeReceiver = null;
        return;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void addListener(OnBrEdrListener listener) {
        addListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public boolean connectBrEdrDevice(BluetoothDevice device) {
        if (device != null) goto L5;
    L22:
        JL_Log.w(TAG, "connectBrEdrDevice", "device is null.");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L22;
        BluetoothDevice r2 = getConnectingBrEdrDevice();
        if (r2 == null) goto L11;
        JL_Log.w(TAG, "connectBrEdrDevice", "Classic device is connecting. connecting device : " + printDeviceInfo(r2));
        return false;
    L11:
        setConnectingEdr(device);
        boolean r3 = this.mBluetoothPair.isPaired(device);
        String r4 = TAG;
        JL_Log.d(r4, "connectBrEdrDevice", "isPaired : " + r3);
        if (r3 == true) goto L18;
        boolean r5 = this.mBluetoothPair.tryToPair(device);
        JL_Log.d(r4, "connectBrEdrDevice", "tryToPair : " + r5);
        if (r5 == true) goto L20;
        onBrEdrConnection(device, 0);
        return false;
    L20:
        onBrEdrConnection(device, 1);
        startConnectionTimeout(device, 40000);
        JL_Log.d(r4, "connectBrEdrDevice", "Start connecting classic Bluetooth.");
        return true;
    L18:
        if (tryToConnectBrEdr(device) == true) goto L20;
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public boolean connectByA2dp(BluetoothDevice device) {
        if (checkA2dpBadEnv("connectByA2dp", device) == false) goto L6;
        return false;
    L6:
        int r1 = isConnectedByA2dp(device);
        String r2 = TAG;
        JL_Log.i(r2, "connectByA2dp", "deviceA2dpStatus : " + BluetoothUtil.connectionString(r1));
        if (r1 != 1) goto L9;
        JL_Log.d(r2, "connectByA2dp", "A2DP is connecting.");
        return true;
    L9:
        if (r1 == 2) goto L12;
        boolean r6 = BluetoothUtil.connectDeviceA2dp(this.mContext, this.mBluetoothA2dp, device);
        JL_Log.i(r2, "connectByA2dp", "ret : " + r6);
        return r6;
    L12:
        onA2dpStatus(device, r1);
        return true;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public boolean connectByHfp(BluetoothDevice device) {
        if (checkHfpBadEnv("connectByHfp", device) == false) goto L6;
        return false;
    L6:
        if (BluetoothUtil.deviceHasHfp(this.mContext, device) == true) goto L9;
        JL_Log.w(TAG, "connectByHfp", "no found hfp service");
        return false;
    L9:
        int r1 = isConnectedByHfp(device);
        String r2 = TAG;
        JL_Log.d(r2, "connectByHfp", "deviceHfpStatus : " + BluetoothUtil.connectionString(r1));
        if (r1 != 1) goto L12;
    L16:
        return true;
    L12:
        if (r1 == 2) goto L15;
        boolean r6 = BluetoothUtil.connectDeviceHfp(this.mContext, this.mBluetoothHfp, device);
        JL_Log.d(r2, "connectByHfp", "ret : " + r6);
        return r6;
    L15:
        onHfpStatus(device, r1);
        goto L16
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public boolean connectByProfiles(BluetoothDevice device) {
        if (device != null) goto L5;
    L47:
        JL_Log.w(TAG, "connectByProfiles", "device is null.");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L47;
        String r2 = TAG;
        JL_Log.d(r2, "connectByProfiles", "device : " + printDeviceInfo(device));
        BluetoothOption r3 = this.mBluetoothOption;
        if (r3 != null) goto L10;
    L13:
        boolean r4 = true;
    L14:
        if (r4 == true) goto L16;
    L18:
        boolean r5 = false;
    L19:
        JL_Log.d(r2, "connectByProfiles", "supportA2dp : " + r4 + ", devHasA2dp : " + r5);
        if (r5 == false) goto L31;
        int r6 = isConnectedByA2dp(device);
        JL_Log.d(r2, "connectByProfiles", "deviceA2dpStatus : " + BluetoothUtil.connectionString(r6));
        if (r6 == 0) goto L28;
        if (r6 != 1) goto L25;
        return true;
    L25:
        if (r6 == 3) goto L28;
    L32:
        boolean r7 = BluetoothUtil.deviceHasHfp(this.mContext, device);
        JL_Log.d(r2, "connectByProfiles", "devHasHfp : " + r7);
        if (r7 == false) goto L42;
        int r8 = isConnectedByHfp(device);
        JL_Log.d(r2, "connectByProfiles", "deviceHfpStatus : " + BluetoothUtil.connectionString(r8));
        if (r8 == 1) goto L41;
        if (r8 == 2) goto L40;
        boolean r9 = connectByHfp(device);
        JL_Log.d(r2, "connectByProfiles", "connectByHfp : " + r9);
        if (r9 == false) goto L46;
        return true;
    L46:
        return false;
    L40:
        onBrEdrConnection(device, 2);
    L41:
        return true;
    L42:
        JL_Log.i(r2, "connectByProfiles", "no hfp.");
        if (r6 != 2) goto L46;
        onBrEdrConnection(device, 2);
        return true;
    L28:
        boolean r10 = connectByA2dp(device);
        JL_Log.d(r2, "connectByProfiles", "connectByA2dp : " + r10);
        if (r10 == false) goto L32;
        return true;
    L31:
        JL_Log.i(r2, "connectByProfiles", "no a2dp.");
        r6 = 0;
        goto L32
    L16:
        if (BluetoothUtil.deviceHasA2dp(this.mContext, device) == false) goto L18;
        r5 = true;
        goto L19
    L10:
        if (r3.isSupportA2DP() == true) goto L13;
        r4 = false;
        goto L14
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void destroy() {
        setConnectingEdr(null);
        this.mHandler.removeCallbacksAndMessages(null);
        this.mBluetoothPair.removeListener2(this.mOnBtDevicePairListener);
        this.mBrEdrEventCbManager.destroy();
        unregisterReceiver();
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public boolean disconnectByProfiles(BluetoothDevice device) {
        if (device != null) goto L5;
    L19:
        JL_Log.w(TAG, "disconnectByProfiles", "device is null");
        return false;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L19;
        String r2 = TAG;
        JL_Log.d(r2, "disconnectByProfiles", "device : " + printDeviceInfo(device));
        int r3 = isConnectedByA2dp(device);
        if (r3 != 2) goto L10;
        boolean r5 = disconnectFromA2dp(device);
    L11:
        int r6 = isConnectedByHfp(device);
        if (r6 != 2) goto L14;
        r5 = disconnectFromHfp(device);
    L14:
        if (r3 != 0) goto L17;
        if (r6 != 0) goto L17;
        onBrEdrConnection(device, 0);
        r5 = true;
    L17:
        JL_Log.d(r2, "disconnectByProfiles", "ret :  " + r5);
        return r5;
    L10:
        r5 = false;
        goto L11
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public boolean disconnectFromA2dp(BluetoothDevice device) {
        if (checkA2dpBadEnv("disconnectFromA2dp", device) == false) goto L5;
        return false;
    L5:
        int r1 = isConnectedByA2dp(device);
        String r3 = TAG;
        JL_Log.d(r3, "disconnectFromA2dp", "deviceA2dpStatus : " + BluetoothUtil.connectionString(r1));
        if (r1 != 1) goto L8;
        JL_Log.d(r3, "disconnectFromA2dp", "A2DP is connecting.");
        return false;
    L8:
        if (r1 == 2) goto L11;
        onA2dpStatus(device, 0);
        return true;
    L11:
        boolean r7 = BluetoothUtil.disconnectDeviceA2dp(this.mContext, this.mBluetoothA2dp, device);
        JL_Log.d(r3, "disconnectFromA2dp", "ret : " + r7);
        return r7;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public boolean disconnectFromHfp(BluetoothDevice device) {
        if (checkHfpBadEnv("disconnectFromHfp", device) == false) goto L5;
        return false;
    L5:
        int r1 = isConnectedByHfp(device);
        String r3 = TAG;
        JL_Log.d(r3, "disconnectFromHfp", "deviceHfpStatus : " + BluetoothUtil.connectionString(r1));
        if (r1 != 1) goto L8;
        JL_Log.d(r3, "disconnectFromHfp", "HFP is connecting.");
        return false;
    L8:
        if (r1 == 2) goto L11;
        onHfpStatus(device, 0);
        return true;
    L11:
        boolean r7 = BluetoothUtil.disconnectDeviceHfp(this.mContext, this.mBluetoothHfp, device);
        JL_Log.d(r3, "disconnectFromHfp", "ret : " + r7);
        return r7;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public BluetoothDevice getActivityBluetoothDevice() {
        return BluetoothUtil.getActivityDevice(this.mContext, this.mBluetoothA2dp);
    }

    public BluetoothA2dp getBluetoothA2dp() {
        return this.mBluetoothA2dp;
    }

    public BluetoothHeadset getBluetoothHfp() {
        return this.mBluetoothHfp;
    }

    public BluetoothPair getBluetoothPair() {
        return this.mBluetoothPair;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public BluetoothDevice getConnectingBrEdrDevice() {
        return this.mConnectingEdr;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    public boolean isBrEdrConnecting() {
        if (getConnectingBrEdrDevice() == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public int isConnectedByA2dp(BluetoothDevice device) {
        if (checkA2dpBadEnv("isConnectedByA2dp", device) == false) goto L6;
        return 0;
    L6:
        List<BluetoothDevice> r0 = this.mBluetoothA2dp.getConnectedDevices();
        if (r0 == null) goto L16;
        Iterator<BluetoothDevice> r1 = r0.iterator();
    L10:
        if (r1.hasNext() == false) goto L16;
        if (r1.next().getAddress().equals(device.getAddress()) == false) goto L10;
        return 2;
    L16:
        return this.mBluetoothA2dp.getConnectionState(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public int isConnectedByHfp(BluetoothDevice device) {
        if (checkHfpBadEnv("isConnectedByHfp", device) == false) goto L6;
        return 0;
    L6:
        List<BluetoothDevice> r0 = this.mBluetoothHfp.getConnectedDevices();
        if (r0 == null) goto L16;
        Iterator<BluetoothDevice> r1 = r0.iterator();
    L10:
        if (r1.hasNext() == false) goto L16;
        if (r1.next().getAddress().equals(device.getAddress()) == false) goto L10;
        return 2;
    L16:
        return this.mBluetoothHfp.getConnectionState(device);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public int isConnectedByProfile(BluetoothDevice device) {
        BluetoothOption r0 = this.mBluetoothOption;
        if (r0 == null) goto L7;
        if (r0.isSupportA2DP() == true) goto L7;
    L9:
        int r1 = 0;
    L11:
        if (r1 != 2) goto L14;
        return r1;
    L14:
        if (BluetoothUtil.deviceHasHfp(this.mContext, device) == false) goto L16;
        int r4 = isConnectedByHfp(device);
    L17:
        if (r4 != 2) goto L19;
        return r4;
    L19:
        return 0;
    L16:
        r4 = 0;
    L7:
        if (BluetoothUtil.deviceHasA2dp(this.mContext, device) == false) goto L9;
        r1 = isConnectedByA2dp(device);
        goto L11
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public /* bridge */ /* synthetic */ void removeListener(OnBrEdrListener listener) {
        removeListener2(listener);
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBrEdr
    @SuppressLint({"MissingPermission"})
    public boolean setActivityBluetoothDevice(BluetoothDevice device) {
        if (device == null) goto L6;
        if (this.mBluetoothA2dp == null) goto L6;
    L7:
        List<BluetoothDevice> r0 = this.mBluetoothA2dp.getConnectedDevices();
        if (r0 != null) goto L10;
        return false;
    L10:
        if (r0.contains(device) == true) goto L12;
        return false;
    L12:
        return BluetoothUtil.setActivityDevice(this.mContext, this.mBluetoothA2dp, device);
    L6:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L7;
        return false;
    }

    @Override // com.jieli.bluetooth_connect.interfaces.IBluetoothBase
    public void setBluetoothOption(BluetoothOption option) {
        this.mBluetoothOption = option;
    }

    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    public void addListener2(OnBrEdrListener listener) {
        this.mBrEdrEventCbManager.addListener(listener);
    }

    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    public void removeListener2(OnBrEdrListener listener) {
        this.mBrEdrEventCbManager.removeListener(listener);
    }

    public boolean connectByA2dp(String address) {
        return connectByA2dp(BluetoothUtil.getRemoteDevice(this.mContext, address));
    }

    public boolean disconnectFromA2dp(String address) {
        return disconnectFromA2dp(BluetoothUtil.getRemoteDevice(this.mContext, address));
    }

    public boolean disconnectFromHfp(String address) {
        return disconnectFromHfp(BluetoothUtil.getRemoteDevice(this.mContext, address));
    }

    public boolean connectByHfp(String address) {
        return connectByHfp(BluetoothUtil.getRemoteDevice(this.mContext, address));
    }
}
