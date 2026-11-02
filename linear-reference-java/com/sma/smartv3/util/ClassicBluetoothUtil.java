package com.sma.smartv3.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RequiresPermission;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.scanner.BleDevice;
import com.blankj.utilcode.util.ActivityUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,291:1\n1869#2,2:292\n1761#2,3:305\n310#3,11:294\n310#3,11:308\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil\n*L\n55#1:292,2\n250#1:305,3\n209#1:294,11\n254#1:308,11\n*E\n"})
public final class ClassicBluetoothUtil {
    public static final UUID I0IIOi = null;

    @aa1
    public static final ClassicBluetoothUtil$myReceiver$1 IiI10X = null;

    @aa1
    public static final l94<BleDevice> O00 = null;
    public static final UUID OIi0 = null;

    @aa1
    public static final ClassicBluetoothUtil OXO1 = null;

    @aa1
    public static final String XIi00iiXO = null;

    @aa1
    public static final ry0<BleDevice> XO0O10 = null;

    @tb1
    public static BluetoothSocket XOO0ii0;
    public static final BluetoothAdapter iO = null;

    public static final class OXO1 implements Function1<Throwable, Unit> {
        public final /* synthetic */ ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1 I1;
        public final /* synthetic */ Context IO;

        public OXO1(Context r1, ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1 r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        public final void OXO1(Throwable r2) {
            this.IO.unregisterReceiver(this.I1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable r1) {
            OXO1(r1);
            return Unit.OXO1;
        }
    }

    @SourceDebugExtension({"SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n1869#2,2:292\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n*L\n261#1:292,2\n*E\n"})
    public static final class XIi00iiXO implements BluetoothProfile.ServiceListener {
        public final /* synthetic */ IO0i<Boolean> OXO1;
        public final /* synthetic */ String XIi00iiXO;

        /* JADX WARN: Multi-variable type inference failed */
        public XIi00iiXO(IO0i<? super Boolean> r1, String r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int r3, BluetoothProfile r4) {
            Intrinsics.X0O(r4, "proxy");
            if (r3 != 2) goto L17;
            List<BluetoothDevice> r5 = r4.getConnectedDevices();
            Intrinsics.O10IXXX0X(r5, "getConnectedDevices(...)");
            r5.isEmpty();
            List<BluetoothDevice> r6 = r4.getConnectedDevices();
            Intrinsics.O10IXXX0X(r6, "getConnectedDevices(...)");
            String r7 = this.XIi00iiXO;
            Iterator<T> r8 = r6.iterator();
            boolean r0 = false;
        L6:
            if (r8.hasNext() == false) goto L10;
            if (Intrinsics.XOO0ii0(((BluetoothDevice) r8.next()).getAddress(), r7) == false) goto L6;
            r0 = true;
            goto L6
        L10:
            IO0i<Boolean> r9 = this.OXO1;
            Result.Companion r10 = Result.Companion;
            r9.resumeWith(Result.m6974constructorimpl(Boolean.valueOf(r0)));
            return;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int r1) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.sma.smartv3.util.ClassicBluetoothUtil$myReceiver$1] */
    static {
        OXO1 = new ClassicBluetoothUtil();
        XIi00iiXO = "ClassicScanner";
        iO = BluetoothAdapter.getDefaultAdapter();
        ry0<BleDevice> r0 = m94.XIi00iiXO(0, 60, null, 5, null);
        XO0O10 = r0;
        O00 = iX0XiO.I0iXXO(r0);
        IiI10X = new ClassicBluetoothUtil$myReceiver$1();
        I0IIOi = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
        OIi0 = UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb");
    }

    public ClassicBluetoothUtil() {
    }

    public static final /* synthetic */ String OXO1() {
        return XIi00iiXO;
    }

    public static final /* synthetic */ ry0 XIi00iiXO() {
        return XO0O10;
    }

    @aa1
    public final l94<BleDevice> I0IIOi() {
        return O00;
    }

    public final boolean I0iXXO(@tb1 String r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        BluetoothAdapter r1 = iO;
        if (r1 == null) goto L25;
        Set<BluetoothDevice> r2 = r1.getBondedDevices();
        if (r2 == null) goto L25;
        Set<BluetoothDevice> r3 = r2;
        if ((r3 instanceof Collection) == true) goto L12;
    L14:
        Iterator<T> r5 = r3.iterator();
    L16:
        if (r5.hasNext() == false) goto L25;
        BluetoothDevice r6 = (BluetoothDevice) r5.next();
        if (r6 == null) goto L20;
        String r7 = r6.getAddress();
    L22:
        if (Intrinsics.XOO0ii0(r7, r4) == false) goto L16;
        return true;
    L20:
        r7 = null;
        goto L22
    L12:
        if (r3.isEmpty() == false) goto L14;
        return false;
    L25:
        return false;
    }

    public final void I1XOi1(@tb1 BleDevice r1) {
        IiI10X();
    }

    public final void IIX1OXO(Context r2) {
        r2.unregisterReceiver(IiI10X);
    }

    @tb1
    public final Object IO(@aa1 Context r4, @aa1 String r5, @aa1 Continuation<? super Boolean> r6) {
        kotlinx.coroutines.XIi00iiXO r0 = new kotlinx.coroutines.XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(r6), 1);
        r0.XXX11i();
        BluetoothAdapter.getDefaultAdapter().getProfileProxy(r4, new XIi00iiXO(r0, r5), 2);
        Object r7 = r0.OII();
        if (r7 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r6);
    L5:
        return r7;
    }

    public final void IiI10X() {
        BluetoothSocket r0 = XOO0ii0;     // Catch: Exception -> L5
        if (r0 == null) goto L7;
        r0.close();     // Catch: Exception -> L5
    L7:
        i1O0OXO1O.OXO1.OXO1("关闭连接，重新请求");     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " DisConnect Failed " + e.getMessage());
    }

    public final void O00() {
        Intent r0 = new Intent("android.settings.BLUETOOTH_SETTINGS");
        r0.setFlags(268435456);
        ActivityUtils.startActivity(r0);
    }

    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"})
    public final void O10IXXX0X() {
        X0O();
        XOO0ii0();
        iO.startDiscovery();
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " StartScan");
    }

    public final boolean OIX0iXi() {
        BluetoothSocket r1 = XOO0ii0;     // Catch: Exception -> L13
        if (r1 != null) goto L6;
        return false;
    L6:
        if (r1.isConnected() == true) goto L8;
        return false;
    L8:
        if (r1.getOutputStream() == null) goto L18;
        if (r1.getInputStream() == null) goto L19;
        return true;
    L19:
        return false;
    L18:
        return false;
    L20:
        return false;
    }

    public final void OIi0(@aa1 Context r2) {
        Intrinsics.X0O(r2, "context");
        X1ii(r2);
    }

    @RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public final void X0O() {
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " StopScan");
        BluetoothAdapter r0 = iO;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isDiscovering() != true) goto L9;
        r0.cancelDiscovery();
        return;
    }

    public final void X1ii(Context r3) {
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.device.action.FOUND");
        r0.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        r3.registerReceiver(IiI10X, r0);
    }

    public final void XO0O10(@aa1 Context r2) {
        Intrinsics.X0O(r2, "context");
        IIX1OXO(r2);
    }

    @RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public final void XOO0ii0() {
        Set<BluetoothDevice> r0 = iO.getBondedDevices();
        if (r0 == null) goto L8;
        Iterator<T> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        BluetoothDevice r3 = (BluetoothDevice) r1.next();
        String r6 = r3.getName();
        Intrinsics.O10IXXX0X(r6, "getName(...)");
        String r8 = r3.getAddress();
        Intrinsics.O10IXXX0X(r8, "getAddress(...)");
        int r7 = r3.getType();
        Intrinsics.XXI(r3);
        BleDevice r2 = new BleDevice(r3, 0, null, r6, r7, r8);
        XO0O10.iO(r2);
        goto L6
    L10:
        return;
    }

    @RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public final boolean XXI(@tb1 BluetoothDevice r5) {
        if (r5 != null) goto L10;
        return false;
    L10:
        return r5.createBond();
    L7:
        e = move-exception;
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " pair Exception:" + e.getMessage());
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.BroadcastReceiver, com.sma.smartv3.util.ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1] */
    @tb1
    public final Object iO(@aa1 final Context r4, @aa1 Continuation<? super BluetoothDevice> r5) {
        final kotlinx.coroutines.XIi00iiXO r0 = new kotlinx.coroutines.XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(r5), 1);
        r0.XXX11i();
        IntentFilter r1 = new IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        ?? r2 = new ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1(r4, r0);
        r4.registerReceiver(r2, r1);
        r0.iX(new OXO1(r4, r2));
        Object r6 = r0.OII();
        if (r6 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r5);
    L5:
        return r6;
    }
}
