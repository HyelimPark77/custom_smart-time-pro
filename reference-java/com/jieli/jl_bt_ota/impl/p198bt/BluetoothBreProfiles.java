package com.jieli.jl_bt_ota.impl.p198bt;

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
import com.ironsource.C12616d4;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class BluetoothBreProfiles extends BluetoothDiscovery {

    /* JADX INFO: renamed from: o */
    private BluetoothHeadset f37585o;

    /* JADX INFO: renamed from: p */
    private BluetoothA2dp f37586p;

    /* JADX INFO: renamed from: q */
    private BluetoothHandFreeReceiver f37587q;

    /* JADX INFO: renamed from: r */
    private final BluetoothProfile.ServiceListener f37588r;

    public class BluetoothHandFreeReceiver extends BroadcastReceiver {
        private BluetoothHandFreeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            BluetoothDevice bluetoothDevice;
            if (intent == null || (action = intent.getAction()) == null || action.isEmpty() || (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null) {
                return;
            }
            switch (action) {
                case "android.bluetooth.device.action.UUID":
                    Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
                    if (parcelableArrayExtra == null) {
                        JL_Log.m27236i(BluetoothBreProfiles.this.TAG, "ACTION_UUID", "No uuids.");
                        break;
                    } else {
                        ParcelUuid[] parcelUuidArr = new ParcelUuid[parcelableArrayExtra.length];
                        for (int i = 0; i < parcelableArrayExtra.length; i++) {
                            parcelUuidArr[i] = ParcelUuid.fromString(parcelableArrayExtra[i].toString());
                            JL_Log.m27232d(BluetoothBreProfiles.this.TAG, "ACTION_UUID", "uuid : " + parcelUuidArr[i].toString());
                        }
                        break;
                    }
                    break;
                case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (-1 != intExtra) {
                        JL_Log.m27236i(BluetoothBreProfiles.this.TAG, "HFP#ACTION_CONNECTION_STATE_CHANGED", "device : " + BluetoothBreProfiles.this.printBtDeviceInfo(bluetoothDevice) + ", state : " + BluetoothUtil.printBtConnectionState(intExtra));
                        BluetoothBreProfiles.this.m27032a(bluetoothDevice, 1, intExtra);
                        break;
                    }
                    break;
                case "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED":
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (-1 != intExtra2) {
                        JL_Log.m27236i(BluetoothBreProfiles.this.TAG, "A2DP#ACTION_CONNECTION_STATE_CHANGED", "device : " + BluetoothBreProfiles.this.printBtDeviceInfo(bluetoothDevice) + ", state : " + BluetoothUtil.printBtConnectionState(intExtra2));
                        BluetoothBreProfiles.this.m27032a(bluetoothDevice, 2, intExtra2);
                        break;
                    }
                    break;
            }
        }
    }

    public BluetoothBreProfiles(Context context) {
        super(context);
        this.f37588r = new BluetoothProfile.ServiceListener() { // from class: com.jieli.jl_bt_ota.impl.bt.BluetoothBreProfiles.1
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                JL_Log.m27236i(BluetoothBreProfiles.this.TAG, "onServiceConnected", "profile : " + i);
                if (2 == i) {
                    BluetoothBreProfiles.this.f37586p = (BluetoothA2dp) bluetoothProfile;
                } else if (1 == i) {
                    BluetoothBreProfiles.this.f37585o = (BluetoothHeadset) bluetoothProfile;
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int i) {
                JL_Log.m27236i(BluetoothBreProfiles.this.TAG, "onServiceDisconnected", "profile : " + i);
                if (2 == i) {
                    BluetoothBreProfiles.this.f37586p = null;
                } else if (1 == i) {
                    BluetoothBreProfiles.this.f37585o = null;
                }
            }
        };
        init(context);
        m27031a();
    }

    /* JADX INFO: renamed from: b */
    private boolean m27036b(String str, BluetoothDevice bluetoothDevice) {
        if (isInvalidEnv(str, bluetoothDevice)) {
            return true;
        }
        if (this.f37585o != null) {
            return false;
        }
        JL_Log.m27240w(this.TAG, str, "No hfp manager.");
        return true;
    }

    private void init(Context context) {
        BluetoothAdapter bluetoothAdapter;
        if (context == null || (bluetoothAdapter = this.mBluetoothAdapter) == null) {
            return;
        }
        boolean profileProxy = false;
        if (this.f37586p == null) {
            try {
                profileProxy = bluetoothAdapter.getProfileProxy(context, this.f37588r, 2);
            } catch (Exception e) {
                JL_Log.m27240w(this.TAG, C12616d4.a.f34169f, "init a2dp manager error. " + e);
            }
            if (!profileProxy) {
                JL_Log.m27234e(this.TAG, C12616d4.a.f34169f, "Failed to obtain a2dp manager.");
            }
        }
        if (this.f37585o == null) {
            try {
                profileProxy = this.mBluetoothAdapter.getProfileProxy(context, this.f37588r, 1);
            } catch (Exception e2) {
                JL_Log.m27240w(this.TAG, C12616d4.a.f34169f, "init hfp manager error. " + e2);
            }
            if (profileProxy) {
                return;
            }
            JL_Log.m27234e(this.TAG, C12616d4.a.f34169f, "Failed to obtain hfp manager.");
        }
    }

    public boolean deviceHasA2dp(BluetoothDevice bluetoothDevice) {
        return BluetoothUtil.deviceHasProfile(this.mContext, bluetoothDevice, BluetoothConstant.UUID_A2DP);
    }

    public boolean deviceHasHfp(BluetoothDevice bluetoothDevice) {
        return BluetoothUtil.deviceHasProfile(this.mContext, bluetoothDevice, BluetoothConstant.UUID_HFP);
    }

    @SuppressLint({"MissingPermission"})
    public boolean disconnectByProfiles(BluetoothDevice bluetoothDevice) {
        boolean zDisconnectFromHfp;
        if (isInvalidEnv("disconnectByProfiles", bluetoothDevice)) {
            return false;
        }
        JL_Log.m27232d(this.TAG, "disconnectByProfiles", "device : " + printBtDeviceInfo(bluetoothDevice));
        if (bluetoothDevice.getType() == 2) {
            return false;
        }
        int iIsConnectedByA2dp = isConnectedByA2dp(bluetoothDevice);
        if (iIsConnectedByA2dp == 2) {
            zDisconnectFromHfp = disconnectFromA2dp(bluetoothDevice);
            JL_Log.m27236i(this.TAG, "disconnectByProfiles", "disconnectFromA2dp : " + zDisconnectFromHfp);
        } else {
            zDisconnectFromHfp = false;
        }
        int iIsConnectedByHfp = isConnectedByHfp(bluetoothDevice);
        if (iIsConnectedByHfp == 2) {
            zDisconnectFromHfp = disconnectFromHfp(bluetoothDevice);
            JL_Log.m27236i(this.TAG, "disconnectByProfiles", "disconnectFromHfp : " + zDisconnectFromHfp);
        }
        if (iIsConnectedByA2dp != 0 || iIsConnectedByHfp != 0) {
            return zDisconnectFromHfp;
        }
        JL_Log.m27232d(this.TAG, "disconnectByProfiles", "Classic Bluetooth is disconnected.");
        this.mCallbackManager.onA2dpStatus(bluetoothDevice, 0);
        this.mCallbackManager.onHfpStatus(bluetoothDevice, 0);
        this.mCallbackManager.onBtDeviceConnection(bluetoothDevice, 0);
        return true;
    }

    public boolean disconnectFromA2dp(BluetoothDevice bluetoothDevice) {
        if (m27034a("disconnectFromA2dp", bluetoothDevice)) {
            return false;
        }
        int iIsConnectedByA2dp = isConnectedByA2dp(bluetoothDevice);
        JL_Log.m27232d(this.TAG, "disconnectFromA2dp", "deviceA2dpStatus : " + BluetoothUtil.printBtConnectionState(iIsConnectedByA2dp));
        if (iIsConnectedByA2dp == 0) {
            JL_Log.m27232d(this.TAG, "disconnectFromA2dp", "A2dp is disconnected.");
            return true;
        }
        boolean zDisconnectDeviceA2dp = iIsConnectedByA2dp == 2 ? BluetoothUtil.disconnectDeviceA2dp(this.mContext, this.f37586p, bluetoothDevice) : false;
        JL_Log.m27232d(this.TAG, "disconnectFromA2dp", " -------------> " + zDisconnectDeviceA2dp);
        return zDisconnectDeviceA2dp;
    }

    public boolean disconnectFromHfp(BluetoothDevice bluetoothDevice) {
        if (m27036b("disconnectFromHfp", bluetoothDevice)) {
            return false;
        }
        int iIsConnectedByHfp = isConnectedByHfp(bluetoothDevice);
        JL_Log.m27232d(this.TAG, "disconnectFromHfp", "deviceHfpStatus : " + BluetoothUtil.printBtConnectionState(iIsConnectedByHfp));
        if (iIsConnectedByHfp == 0) {
            JL_Log.m27236i(this.TAG, "disconnectFromHfp", "Hfp is disconnected");
            return true;
        }
        boolean zDisconnectDeviceHfp = iIsConnectedByHfp == 2 ? BluetoothUtil.disconnectDeviceHfp(this.mContext, this.f37585o, bluetoothDevice) : false;
        JL_Log.m27236i(this.TAG, "disconnectFromHfp", " ----> " + zDisconnectDeviceHfp);
        return zDisconnectDeviceHfp;
    }

    public BluetoothHeadset getBluetoothHfp() {
        return this.f37585o;
    }

    public List<BluetoothDevice> getDevicesConnectedByProfile() {
        if (!CommonUtil.checkHasConnectPermission(this.mContext)) {
            return null;
        }
        BluetoothHeadset bluetoothHeadset = this.f37585o;
        List<BluetoothDevice> connectedDevices = bluetoothHeadset != null ? bluetoothHeadset.getConnectedDevices() : null;
        ArrayList arrayList = connectedDevices != null ? new ArrayList(connectedDevices) : null;
        BluetoothA2dp bluetoothA2dp = this.f37586p;
        if (bluetoothA2dp != null) {
            connectedDevices = bluetoothA2dp.getConnectedDevices();
        }
        if (connectedDevices != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(connectedDevices);
        }
        return arrayList;
    }

    public BluetoothA2dp getmBluetoothA2dp() {
        return this.f37586p;
    }

    @SuppressLint({"MissingPermission"})
    public int isConnectedByA2dp(BluetoothDevice bluetoothDevice) {
        if (m27034a("isConnectedByA2dp", bluetoothDevice)) {
            return 0;
        }
        List<BluetoothDevice> connectedDevices = this.f37586p.getConnectedDevices();
        if (connectedDevices != null) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    JL_Log.m27232d(this.TAG, "isConnectedByA2dp", " ----> Connected");
                    return 2;
                }
            }
        }
        int connectionState = this.f37586p.getConnectionState(bluetoothDevice);
        JL_Log.m27232d(this.TAG, "isConnectedByA2dp", "state : " + BluetoothUtil.printBtConnectionState(connectionState));
        return connectionState;
    }

    @SuppressLint({"MissingPermission"})
    public int isConnectedByHfp(BluetoothDevice bluetoothDevice) {
        if (m27036b("isConnectedByHfp", bluetoothDevice)) {
            return 0;
        }
        List<BluetoothDevice> connectedDevices = this.f37585o.getConnectedDevices();
        if (connectedDevices != null) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    JL_Log.m27232d(this.TAG, "isConnectedByHfp", "Hfp service is connected.");
                    return 2;
                }
            }
        }
        int connectionState = this.f37585o.getConnectionState(bluetoothDevice);
        JL_Log.m27232d(this.TAG, "isConnectedByHfp", "state : " + BluetoothUtil.printBtConnectionState(connectionState));
        return connectionState;
    }

    @SuppressLint({"MissingPermission"})
    public int isConnectedByProfile(BluetoothDevice bluetoothDevice) {
        if (isInvalidEnv("isConnectedByProfile", bluetoothDevice)) {
            return 0;
        }
        BluetoothHeadset bluetoothHeadset = this.f37585o;
        if (bluetoothHeadset == null || this.f37586p == null) {
            JL_Log.m27240w(this.TAG, "isConnectedByProfile", "No hfp manager or a2dp manager.");
            return 0;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices != null) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    JL_Log.m27232d(this.TAG, "isConnectedByProfile", "Hfp service is connected.");
                    return 2;
                }
            }
        }
        List<BluetoothDevice> connectedDevices2 = this.f37586p.getConnectedDevices();
        if (connectedDevices2 != null) {
            Iterator<BluetoothDevice> it2 = connectedDevices2.iterator();
            while (it2.hasNext()) {
                if (it2.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    JL_Log.m27232d(this.TAG, "isConnectedByProfile", "A2dp service is connected.");
                    return 2;
                }
            }
        }
        return 0;
    }

    @Override // com.jieli.jl_bt_ota.impl.p198bt.BluetoothDiscovery, com.jieli.jl_bt_ota.impl.p198bt.BluetoothBase
    public void release() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        m27035b();
        BluetoothA2dp bluetoothA2dp = this.f37586p;
        if (bluetoothA2dp != null && (bluetoothAdapter2 = this.mBluetoothAdapter) != null) {
            bluetoothAdapter2.closeProfileProxy(2, bluetoothA2dp);
            this.f37586p = null;
        }
        BluetoothHeadset bluetoothHeadset = this.f37585o;
        if (bluetoothHeadset != null && (bluetoothAdapter = this.mBluetoothAdapter) != null) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
            this.f37585o = null;
        }
        super.release();
    }

    /* JADX INFO: renamed from: a */
    private boolean m27034a(String str, BluetoothDevice bluetoothDevice) {
        if (isInvalidEnv(str, bluetoothDevice)) {
            return true;
        }
        if (this.f37586p != null) {
            return false;
        }
        JL_Log.m27240w(this.TAG, str, "No a2dp manager.");
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m27035b() {
        Context context;
        BluetoothHandFreeReceiver bluetoothHandFreeReceiver = this.f37587q;
        if (bluetoothHandFreeReceiver == null || (context = this.mContext) == null) {
            return;
        }
        context.unregisterReceiver(bluetoothHandFreeReceiver);
        this.f37587q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX INFO: renamed from: a */
    public void m27032a(BluetoothDevice bluetoothDevice, int i, int i2) {
        boolean z = false;
        if (i == 1) {
            this.mCallbackManager.onHfpStatus(bluetoothDevice, i2);
            if (i2 != 0) {
                if (i2 == 2) {
                    int iIsConnectedByA2dp = isConnectedByA2dp(bluetoothDevice);
                    if (!deviceHasA2dp(bluetoothDevice) || iIsConnectedByA2dp == 2) {
                        z = true;
                    }
                }
            } else if (isConnectedByA2dp(bluetoothDevice) == 0) {
                z = true;
            }
        } else if (i == 2) {
            this.mCallbackManager.onA2dpStatus(bluetoothDevice, i2);
            if (i2 != 0) {
                if (i2 == 2) {
                    int iIsConnectedByHfp = isConnectedByHfp(bluetoothDevice);
                    if (!deviceHasHfp(bluetoothDevice) || iIsConnectedByHfp == 2) {
                        z = true;
                    }
                }
            } else if (isConnectedByHfp(bluetoothDevice) == 0) {
                z = true;
            }
        }
        JL_Log.m27232d(this.TAG, "handleProfileStatus", "isCallBtStatus : " + z);
        if (z) {
            this.mCallbackManager.onBtDeviceConnection(bluetoothDevice, i2);
        }
    }

    public boolean disconnectFromA2dp(String str) {
        return disconnectFromA2dp(BluetoothUtil.getRemoteDevice(str));
    }

    public boolean disconnectFromHfp(String str) {
        return disconnectFromHfp(BluetoothUtil.getRemoteDevice(str));
    }

    /* JADX INFO: renamed from: a */
    private void m27031a() {
        if (this.f37587q != null || this.mContext == null) {
            return;
        }
        this.f37587q = new BluetoothHandFreeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        this.mContext.registerReceiver(this.f37587q, intentFilter);
    }
}
