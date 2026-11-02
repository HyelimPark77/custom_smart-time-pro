package com.sma.smartv3.util;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BluetoothConnectionReceiver extends BroadcastReceiver {

    @Keep
    public static final class A2DPInfo {

        @aa1
        private final String address;
        private final boolean online;

        public A2DPInfo(@aa1 String address, boolean z) {
            Intrinsics.X0O(address, "address");
            this.address = address;
            this.online = z;
        }

        public static /* synthetic */ A2DPInfo copy$default(A2DPInfo a2DPInfo, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = a2DPInfo.address;
            }
            if ((i & 2) != 0) {
                z = a2DPInfo.online;
            }
            return a2DPInfo.copy(str, z);
        }

        @aa1
        public final String component1() {
            return this.address;
        }

        public final boolean component2() {
            return this.online;
        }

        @aa1
        public final A2DPInfo copy(@aa1 String address, boolean z) {
            Intrinsics.X0O(address, "address");
            return new A2DPInfo(address, z);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof A2DPInfo)) {
                return false;
            }
            A2DPInfo a2DPInfo = (A2DPInfo) obj;
            return Intrinsics.XOO0ii0(this.address, a2DPInfo.address) && this.online == a2DPInfo.online;
        }

        @aa1
        public final String getAddress() {
            return this.address;
        }

        public final boolean getOnline() {
            return this.online;
        }

        public int hashCode() {
            return (this.address.hashCode() * 31) + Boolean.hashCode(this.online);
        }

        @aa1
        public String toString() {
            return "A2DPInfo(address=" + this.address + ", online=" + this.online + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public final void OXO1(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("checkCurrentDeviceOnLine " + bluetoothDevice.getName() + " " + bluetoothDevice.getAddress());
        String address = bluetoothDevice.getAddress();
        Intrinsics.O10IXXX0X(address, "getAddress(...)");
        I01XX0.OXO1(I01XX0.I011X, new A2DPInfo(address, true));
    }

    public final void XIi00iiXO(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("checkCurrentDeviceOffline " + bluetoothDevice.getName() + " " + bluetoothDevice.getAddress());
        String address = bluetoothDevice.getAddress();
        Intrinsics.O10IXXX0X(address, "getAddress(...)");
        I01XX0.OXO1(I01XX0.I011X, new A2DPInfo(address, false));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@tb1 Context context, @tb1 Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        switch (action.hashCode()) {
            case -855499628:
                if (action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (intExtra == 10) {
                        i1O0OXO1O.OXO1.OXO1("A2dp Playing : " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                        break;
                    } else if (intExtra == 11) {
                        i1O0OXO1O.OXO1.OXO1("A2dp Not Playing: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                        break;
                    }
                }
                break;
            case -301431627:
                if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                    OXO1(bluetoothDevice);
                    i1O0OXO1O.OXO1.OXO1("BleDevice Connected: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null) + " " + (bluetoothDevice != null ? bluetoothDevice.getAddress() : null));
                    break;
                }
                break;
            case 1244161670:
                if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (intExtra2 == 0) {
                        i1O0OXO1O.OXO1.OXO1("A2DP Disconnect: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                        break;
                    } else if (intExtra2 == 2) {
                        i1O0OXO1O.OXO1.OXO1("A2DP Connect: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                        break;
                    }
                }
                break;
            case 1821585647:
                if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                    XIi00iiXO(bluetoothDevice);
                    i1O0OXO1O.OXO1.OXO1("BleDevice DisConnected: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null) + " " + (bluetoothDevice != null ? bluetoothDevice.getAddress() : null));
                    break;
                }
                break;
            case 2116862345:
                if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    switch (intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE)) {
                        case 10:
                            XIi00iiXO(bluetoothDevice);
                            i1O0OXO1O.OXO1.OXO1("Pair Canceled: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                            break;
                        case 11:
                            i1O0OXO1O.OXO1.OXO1("Paring: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                            break;
                        case 12:
                            OXO1(bluetoothDevice);
                            i1O0OXO1O.OXO1.OXO1("Pair Success: " + (bluetoothDevice != null ? bluetoothDevice.getName() : null));
                            break;
                    }
                }
                break;
        }
    }
}
