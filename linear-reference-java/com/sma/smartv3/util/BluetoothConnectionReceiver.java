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

        public A2DPInfo(@aa1 String r2, boolean r3) {
            Intrinsics.X0O(r2, "address");
            this.address = r2;
            this.online = r3;
        }

        public static /* synthetic */ A2DPInfo copy$default(A2DPInfo r0, String r1, boolean r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.address;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.online;
        L9:
            return r0.copy(r1, r2);
        }

        @aa1
        public final String component1() {
            return this.address;
        }

        public final boolean component2() {
            return this.online;
        }

        @aa1
        public final A2DPInfo copy(@aa1 String r2, boolean r3) {
            Intrinsics.X0O(r2, "address");
            return new A2DPInfo(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof A2DPInfo) == true) goto L8;
            return false;
        L8:
            A2DPInfo r6 = (A2DPInfo) r5;
            if (Intrinsics.XOO0ii0(this.address, r6.address) == true) goto L12;
            return false;
        L12:
            if (this.online == r6.online) goto L14;
            return false;
        L14:
            return true;
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
            return "A2DPInfo(address=" + this.address + ", online=" + this.online + I000IiI1O.iO.iO;
        }
    }

    public BluetoothConnectionReceiver() {
    }

    public final void OXO1(BluetoothDevice r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        i1O0OXO1O.OXO1.OXO1("checkCurrentDeviceOnLine " + r6.getName() + " " + r6.getAddress());
        String r7 = r6.getAddress();
        Intrinsics.O10IXXX0X(r7, "getAddress(...)");
        I01XX0.OXO1(I01XX0.I011X, new A2DPInfo(r7, true));
    }

    public final void XIi00iiXO(BluetoothDevice r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        i1O0OXO1O.OXO1.OXO1("checkCurrentDeviceOffline " + r6.getName() + " " + r6.getAddress());
        String r7 = r6.getAddress();
        Intrinsics.O10IXXX0X(r7, "getAddress(...)");
        I01XX0.OXO1(I01XX0.I011X, new A2DPInfo(r7, false));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@tb1 Context r7, @tb1 Intent r8) {
        if (r8 == null) goto L88;
        String r9 = r8.getAction();
        if (r9 == null) goto L89;
        BluetoothDevice r0 = (BluetoothDevice) r8.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        String r5 = null;
        switch(r9.hashCode()) {
            case -855499628: goto L71;
            case -301431627: goto L60;
            case 1244161670: goto L42;
            case 1821585647: goto L31;
            case 2116862345: goto L10;
            default: goto L90;
        };
    L90:
        return;
    L10:
        if (r9.equals("android.bluetooth.device.action.BOND_STATE_CHANGED") == true) goto L13;
        return;
    L13:
        switch(r8.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE)) {
            case 10: goto L25;
            case 11: goto L20;
            case 12: goto L15;
            default: goto L92;
        };
    L15:
        OXO1(r0);
        i1O0OXO1O r10 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L18;
        r5 = r0.getName();
    L18:
        r10.OXO1("Pair Success: " + r5);
        return;
    L20:
        i1O0OXO1O r11 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L23;
        r5 = r0.getName();
    L23:
        r11.OXO1("Paring: " + r5);
        return;
    L25:
        XIi00iiXO(r0);
        i1O0OXO1O r12 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L28;
        r5 = r0.getName();
    L28:
        r12.OXO1("Pair Canceled: " + r5);
        return;
    L92:
        return;
    L31:
        if (r9.equals("android.bluetooth.device.action.ACL_DISCONNECTED") == false) goto L93;
        XIi00iiXO(r0);
        i1O0OXO1O r13 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L36;
        String r14 = r0.getName();
    L37:
        if (r0 == null) goto L39;
        r5 = r0.getAddress();
    L39:
        r13.OXO1("BleDevice DisConnected: " + r14 + " " + r5);
        return;
    L36:
        r14 = null;
        goto L37
    L93:
        return;
    L42:
        if (r9.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED") == false) goto L94;
        int r15 = r8.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (r15 != 0) goto L47;
        i1O0OXO1O r16 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L57;
        r5 = r0.getName();
    L57:
        r16.OXO1("A2DP Disconnect: " + r5);
        return;
    L47:
        if (r15 != 2) goto L95;
        i1O0OXO1O r17 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L52;
        r5 = r0.getName();
    L52:
        r17.OXO1("A2DP Connect: " + r5);
        return;
    L95:
        return;
    L94:
        return;
    L60:
        if (r9.equals("android.bluetooth.device.action.ACL_CONNECTED") == false) goto L96;
        OXO1(r0);
        i1O0OXO1O r18 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L65;
        String r19 = r0.getName();
    L66:
        if (r0 == null) goto L68;
        r5 = r0.getAddress();
    L68:
        r18.OXO1("BleDevice Connected: " + r19 + " " + r5);
        return;
    L65:
        r19 = null;
        goto L66
    L96:
        return;
    L71:
        if (r9.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED") == false) goto L97;
        int r20 = r8.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (r20 != 10) goto L76;
        i1O0OXO1O r21 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L86;
        r5 = r0.getName();
    L86:
        r21.OXO1("A2dp Playing : " + r5);
        return;
    L76:
        if (r20 != 11) goto L98;
        i1O0OXO1O r22 = i1O0OXO1O.OXO1;
        if (r0 == null) goto L81;
        r5 = r0.getName();
    L81:
        r22.OXO1("A2dp Not Playing: " + r5);
        return;
    L98:
        return;
    L97:
        return;
    L89:
        return;
    }
}
