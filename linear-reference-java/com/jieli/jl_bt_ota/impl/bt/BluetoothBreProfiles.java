package com.jieli.jl_bt_ota.impl.bt;

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
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.ironsource.C2985d4;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class BluetoothBreProfiles extends BluetoothDiscovery {
    private BluetoothHeadset o;
    private BluetoothA2dp p;
    private BluetoothHandFreeReceiver q;
    private final BluetoothProfile.ServiceListener r;

    public class BluetoothHandFreeReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothBreProfiles a;

        private BluetoothHandFreeReceiver(BluetoothBreProfiles r1) {
            this.a = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context r10, Intent r11) {
            int r0 = 0;
            if (r11 == null) goto L53;
            String r3 = r11.getAction();
            if (r3 != null) goto L8;
            return;
        L8:
            if (r3.isEmpty() == true) goto L54;
            BluetoothDevice r4 = (BluetoothDevice) r11.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (r4 != null) goto L14;
            return;
        L14:
            switch(r3.hashCode()) {
                case -377527494: goto L25;
                case 545516589: goto L21;
                case 1244161670: goto L17;
                default: goto L15;
            };
        L15:
            byte r5 = -1;
        L28:
            switch(r5) {
                case 0: goto L40;
                case 1: goto L35;
                case 2: goto L30;
                default: goto L56;
            };
        L30:
            int r12 = r11.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            if ((-1) == r12) goto L57;
            JL_Log.i(this.a.TAG, "A2DP#ACTION_CONNECTION_STATE_CHANGED", "device : " + this.a.printBtDeviceInfo(r4) + ", state : " + BluetoothUtil.printBtConnectionState(r12));
            BluetoothBreProfiles.a(this.a, r4, 2, r12);
            return;
        L57:
            return;
        L35:
            int r13 = r11.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            if ((-1) == r13) goto L58;
            JL_Log.i(this.a.TAG, "HFP#ACTION_CONNECTION_STATE_CHANGED", "device : " + this.a.printBtDeviceInfo(r4) + ", state : " + BluetoothUtil.printBtConnectionState(r13));
            BluetoothBreProfiles.a(this.a, r4, 1, r13);
            return;
        L58:
            return;
        L40:
            Parcelable[] r14 = r11.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
            if (r14 != null) goto L44;
            JL_Log.i(this.a.TAG, "ACTION_UUID", "No uuids.");
            return;
        L44:
            ParcelUuid[] r1 = new ParcelUuid[r14.length];
        L46:
            if (r0 >= r14.length) goto L59;
            r1[r0] = ParcelUuid.fromString(r14[r0].toString());
            JL_Log.d(this.a.TAG, "ACTION_UUID", "uuid : " + r1[r0].toString());
            r0 = r0 + 1;
            goto L46
        L59:
            return;
        L56:
            return;
        L17:
            if (r3.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED") == false) goto L50;
            r5 = 2;
            goto L28
        L50:
            r5 = -1;
            goto L28
        L21:
            if (r3.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") == false) goto L51;
            r5 = 1;
            goto L28
        L51:
            r5 = -1;
            goto L28
        L25:
            if (r3.equals("android.bluetooth.device.action.UUID") == false) goto L52;
            r5 = 0;
            goto L28
        L52:
            r5 = -1;
            goto L28
        L54:
            return;
        }

        public /* synthetic */ BluetoothHandFreeReceiver(BluetoothBreProfiles r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public BluetoothBreProfiles(Context r2) {
        super(r2);
        this.r = new AnonymousClass1(this);
        init(r2);
        a();
    }

    public static /* synthetic */ BluetoothA2dp a(BluetoothBreProfiles r0, BluetoothA2dp r1) {
        r0.p = r1;
        return r1;
    }

    private boolean b(String r3, BluetoothDevice r4) {
        if (isInvalidEnv(r3, r4) == false) goto L6;
        return true;
    L6:
        if (this.o != null) goto L9;
        JL_Log.w(this.TAG, r3, "No hfp manager.");
        return true;
    L9:
        return false;
    }

    private void init(Context r7) {
        if (r7 == null) goto L27;
        BluetoothAdapter r0 = this.mBluetoothAdapter;
        if (r0 == null) goto L30;
        boolean r3 = false;
        if (this.p != null) goto L15;
        r3 = r0.getProfileProxy(r7, this.r, 2);     // Catch: Exception -> L10
    L12:
        if (r3 == true) goto L15;
        JL_Log.e(this.TAG, C2985d4.a.f, "Failed to obtain a2dp manager.");
    L10:
        e = move-exception;
        JL_Log.w(this.TAG, C2985d4.a.f, "init a2dp manager error. " + e);
    L15:
        if (this.o != null) goto L28;
        r3 = this.mBluetoothAdapter.getProfileProxy(r7, this.r, 1);     // Catch: Exception -> L18
    L20:
        if (r3 == true) goto L29;
        JL_Log.e(this.TAG, C2985d4.a.f, "Failed to obtain hfp manager.");
        return;
    L29:
        return;
    L18:
        e = move-exception;
        JL_Log.w(this.TAG, C2985d4.a.f, "init hfp manager error. " + e);
        goto L20
    L28:
        return;
    L30:
        return;
    }

    public boolean deviceHasA2dp(BluetoothDevice r3) {
        return BluetoothUtil.deviceHasProfile(this.mContext, r3, BluetoothConstant.UUID_A2DP);
    }

    public boolean deviceHasHfp(BluetoothDevice r3) {
        return BluetoothUtil.deviceHasProfile(this.mContext, r3, BluetoothConstant.UUID_HFP);
    }

    @SuppressLint({"MissingPermission"})
    public boolean disconnectByProfiles(BluetoothDevice r9) {
        if (isInvalidEnv("disconnectByProfiles", r9) == false) goto L5;
        return false;
    L5:
        JL_Log.d(this.TAG, "disconnectByProfiles", "device : " + printBtDeviceInfo(r9));
        if (r9.getType() == 2) goto L19;
        int r1 = isConnectedByA2dp(r9);
        if (r1 != 2) goto L10;
        boolean r4 = disconnectFromA2dp(r9);
        JL_Log.i(this.TAG, "disconnectByProfiles", "disconnectFromA2dp : " + r4);
    L11:
        int r5 = isConnectedByHfp(r9);
        if (r5 != 2) goto L14;
        r4 = disconnectFromHfp(r9);
        JL_Log.i(this.TAG, "disconnectByProfiles", "disconnectFromHfp : " + r4);
    L14:
        if (r1 != 0) goto L18;
        if (r5 != 0) goto L18;
        JL_Log.d(this.TAG, "disconnectByProfiles", "Classic Bluetooth is disconnected.");
        this.mCallbackManager.onA2dpStatus(r9, 0);
        this.mCallbackManager.onHfpStatus(r9, 0);
        this.mCallbackManager.onBtDeviceConnection(r9, 0);
        return true;
    L18:
        return r4;
    L10:
        r4 = false;
        goto L11
    L19:
        return false;
    }

    public boolean disconnectFromA2dp(BluetoothDevice r7) {
        boolean r2 = false;
        if (a("disconnectFromA2dp", r7) == false) goto L5;
        return false;
    L5:
        int r1 = isConnectedByA2dp(r7);
        JL_Log.d(this.TAG, "disconnectFromA2dp", "deviceA2dpStatus : " + BluetoothUtil.printBtConnectionState(r1));
        if (r1 != 0) goto L10;
        JL_Log.d(this.TAG, "disconnectFromA2dp", "A2dp is disconnected.");
        return true;
    L10:
        if (r1 != 2) goto L12;
        r2 = BluetoothUtil.disconnectDeviceA2dp(this.mContext, this.p, r7);
    L12:
        JL_Log.d(this.TAG, "disconnectFromA2dp", " -------------> " + r2);
        return r2;
    }

    public boolean disconnectFromHfp(BluetoothDevice r7) {
        boolean r2 = false;
        if (b("disconnectFromHfp", r7) == false) goto L5;
        return false;
    L5:
        int r1 = isConnectedByHfp(r7);
        JL_Log.d(this.TAG, "disconnectFromHfp", "deviceHfpStatus : " + BluetoothUtil.printBtConnectionState(r1));
        if (r1 != 0) goto L10;
        JL_Log.i(this.TAG, "disconnectFromHfp", "Hfp is disconnected");
        return true;
    L10:
        if (r1 != 2) goto L12;
        r2 = BluetoothUtil.disconnectDeviceHfp(this.mContext, this.o, r7);
    L12:
        JL_Log.i(this.TAG, "disconnectFromHfp", " ----> " + r2);
        return r2;
    }

    public BluetoothHeadset getBluetoothHfp() {
        return this.o;
    }

    public List<BluetoothDevice> getDevicesConnectedByProfile() {
        ArrayList r1 = null;
        if (CommonUtil.checkHasConnectPermission(this.mContext) == true) goto L5;
        return null;
    L5:
        BluetoothHeadset r0 = this.o;
        if (r0 == null) goto L8;
        List<BluetoothDevice> r2 = r0.getConnectedDevices();
    L9:
        if (r2 == null) goto L11;
        r1 = new ArrayList(r2);
    L11:
        BluetoothA2dp r3 = this.p;
        if (r3 == null) goto L14;
        r2 = r3.getConnectedDevices();
    L14:
        if (r2 == null) goto L18;
        if (r1 != null) goto L17;
        r1 = new ArrayList();
    L17:
        r1.addAll(r2);
    L18:
        return r1;
    L8:
        r2 = null;
        goto L9
    }

    public BluetoothA2dp getmBluetoothA2dp() {
        return this.p;
    }

    @SuppressLint({"MissingPermission"})
    public int isConnectedByA2dp(BluetoothDevice r5) {
        if (a("isConnectedByA2dp", r5) == false) goto L6;
        return 0;
    L6:
        List<BluetoothDevice> r1 = this.p.getConnectedDevices();
        if (r1 == null) goto L15;
        Iterator<BluetoothDevice> r2 = r1.iterator();
    L10:
        if (r2.hasNext() == false) goto L15;
        if (r2.next().getAddress().equals(r5.getAddress()) == false) goto L10;
        JL_Log.d(this.TAG, "isConnectedByA2dp", " ----> Connected");
        return 2;
    L15:
        int r6 = this.p.getConnectionState(r5);
        JL_Log.d(this.TAG, "isConnectedByA2dp", "state : " + BluetoothUtil.printBtConnectionState(r6));
        return r6;
    }

    @SuppressLint({"MissingPermission"})
    public int isConnectedByHfp(BluetoothDevice r5) {
        if (b("isConnectedByHfp", r5) == false) goto L6;
        return 0;
    L6:
        List<BluetoothDevice> r1 = this.o.getConnectedDevices();
        if (r1 == null) goto L15;
        Iterator<BluetoothDevice> r2 = r1.iterator();
    L10:
        if (r2.hasNext() == false) goto L15;
        if (r2.next().getAddress().equals(r5.getAddress()) == false) goto L10;
        JL_Log.d(this.TAG, "isConnectedByHfp", "Hfp service is connected.");
        return 2;
    L15:
        int r6 = this.o.getConnectionState(r5);
        JL_Log.d(this.TAG, "isConnectedByHfp", "state : " + BluetoothUtil.printBtConnectionState(r6));
        return r6;
    }

    @SuppressLint({"MissingPermission"})
    public int isConnectedByProfile(BluetoothDevice r7) {
        if (isInvalidEnv("isConnectedByProfile", r7) == false) goto L5;
        return 0;
    L5:
        BluetoothHeadset r1 = this.o;
        if (r1 != null) goto L8;
    L29:
        JL_Log.w(this.TAG, "isConnectedByProfile", "No hfp manager or a2dp manager.");
        return 0;
    L8:
        if (this.p == null) goto L29;
        List<BluetoothDevice> r2 = r1.getConnectedDevices();
        if (r2 == null) goto L19;
        Iterator<BluetoothDevice> r3 = r2.iterator();
    L14:
        if (r3.hasNext() == false) goto L19;
        if (r3.next().getAddress().equals(r7.getAddress()) == false) goto L14;
        JL_Log.d(this.TAG, "isConnectedByProfile", "Hfp service is connected.");
        return 2;
    L19:
        List<BluetoothDevice> r4 = this.p.getConnectedDevices();
        if (r4 == null) goto L28;
        Iterator<BluetoothDevice> r5 = r4.iterator();
    L23:
        if (r5.hasNext() == false) goto L28;
        if (r5.next().getAddress().equals(r7.getAddress()) == false) goto L23;
        JL_Log.d(this.TAG, "isConnectedByProfile", "A2dp service is connected.");
        return 2;
    L28:
        return 0;
    }

    @Override // com.jieli.jl_bt_ota.impl.bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.bt.BluetoothBase
    public void release() {
        b();
        BluetoothA2dp r0 = this.p;
        if (r0 == null) goto L7;
        BluetoothAdapter r2 = this.mBluetoothAdapter;
        if (r2 == null) goto L7;
        r2.closeProfileProxy(2, r0);
        this.p = null;
    L7:
        BluetoothHeadset r1 = this.o;
        if (r1 == null) goto L12;
        BluetoothAdapter r3 = this.mBluetoothAdapter;
        if (r3 == null) goto L12;
        r3.closeProfileProxy(1, r1);
        this.o = null;
    L12:
        super.release();
    }

    public static /* synthetic */ BluetoothHeadset a(BluetoothBreProfiles r0, BluetoothHeadset r1) {
        r0.o = r1;
        return r1;
    }

    public static /* synthetic */ void a(BluetoothBreProfiles r0, BluetoothDevice r1, int r2, int r3) {
        r0.a(r1, r2, r3);
    }

    private boolean a(String r3, BluetoothDevice r4) {
        if (isInvalidEnv(r3, r4) == false) goto L6;
        return true;
    L6:
        if (this.p != null) goto L9;
        JL_Log.w(this.TAG, r3, "No a2dp manager.");
        return true;
    L9:
        return false;
    }

    private void b() {
        BluetoothHandFreeReceiver r0 = this.q;
        if (r0 == null) goto L8;
        Context r1 = this.mContext;
        if (r1 == null) goto L9;
        r1.unregisterReceiver(r0);
        this.q = null;
        return;
    L9:
        return;
    }

    private void a(BluetoothDevice r5, int r6, int r7) {
        boolean r1 = false;
        if (r6 != 1) goto L15;
        this.mCallbackManager.onHfpStatus(r5, r7);
        if (r7 == 0) goto L13;
        if (r7 != 2) goto L27;
        int r8 = isConnectedByA2dp(r5);
        if (deviceHasA2dp(r5) == false) goto L26;
        if (r8 != 2) goto L27;
    L26:
        r1 = true;
    L27:
        JL_Log.d(this.TAG, "handleProfileStatus", "isCallBtStatus : " + r1);
        if (r1 == false) goto L31;
        this.mCallbackManager.onBtDeviceConnection(r5, r7);
        return;
    L31:
        return;
    L13:
        if (isConnectedByA2dp(r5) != 0) goto L27;
    L15:
        if (r6 != 2) goto L27;
        this.mCallbackManager.onA2dpStatus(r5, r7);
        if (r7 == 0) goto L25;
        if (r7 != 2) goto L27;
        int r9 = isConnectedByHfp(r5);
        if (deviceHasHfp(r5) == false) goto L26;
        if (r9 != 2) goto L27;
    L25:
        if (isConnectedByHfp(r5) != 0) goto L27;
        goto L26
    }

    public boolean disconnectFromA2dp(String r1) {
        return disconnectFromA2dp(BluetoothUtil.getRemoteDevice(r1));
    }

    public boolean disconnectFromHfp(String r1) {
        return disconnectFromHfp(BluetoothUtil.getRemoteDevice(r1));
    }

    private void a() {
        if (this.q == null) goto L5;
        return;
    L5:
        if (this.mContext == null) goto L9;
        this.q = new BluetoothHandFreeReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.UUID");
        r0.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        r0.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        r0.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        this.mContext.registerReceiver(this.q, r0);
        return;
    }
}
