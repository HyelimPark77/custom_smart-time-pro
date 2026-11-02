package com.sma.smartv3.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RequiresPermission;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
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
    public static final UUID I0IIOi;

    @aa1
    public static final ClassicBluetoothUtil$myReceiver$1 IiI10X;

    @aa1
    public static final l94<BleDevice> O00;
    public static final UUID OIi0;

    @aa1
    public static final ry0<BleDevice> XO0O10;

    @tb1
    public static BluetoothSocket XOO0ii0;

    @aa1
    public static final ClassicBluetoothUtil OXO1 = new ClassicBluetoothUtil();

    @aa1
    public static final String XIi00iiXO = "ClassicScanner";

    /* JADX INFO: renamed from: iO */
    public static final BluetoothAdapter f54901iO = BluetoothAdapter.getDefaultAdapter();

    public static final class OXO1 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1 f54902I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Context f54903IO;

        public OXO1(Context context, ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1 classicBluetoothUtil$awaitA2dpConnected$2$receiver$1) {
            this.f54903IO = context;
            this.f54902I1 = classicBluetoothUtil$awaitA2dpConnected$2$receiver$1;
        }

        public final void OXO1(Throwable th) {
            this.f54903IO.unregisterReceiver(this.f54902I1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
            OXO1(th);
            return Unit.OXO1;
        }
    }

    @SourceDebugExtension({"SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n1869#2,2:292\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n*L\n261#1:292,2\n*E\n"})
    public static final class XIi00iiXO implements BluetoothProfile.ServiceListener {
        public final /* synthetic */ IO0i<Boolean> OXO1;
        public final /* synthetic */ String XIi00iiXO;

        /* JADX WARN: Multi-variable type inference failed */
        public XIi00iiXO(IO0i<? super Boolean> iO0i, String str) {
            this.OXO1 = iO0i;
            this.XIi00iiXO = str;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile proxy) {
            Intrinsics.X0O(proxy, "proxy");
            if (i == 2) {
                List<BluetoothDevice> connectedDevices = proxy.getConnectedDevices();
                Intrinsics.O10IXXX0X(connectedDevices, "getConnectedDevices(...)");
                connectedDevices.isEmpty();
                List<BluetoothDevice> connectedDevices2 = proxy.getConnectedDevices();
                Intrinsics.O10IXXX0X(connectedDevices2, "getConnectedDevices(...)");
                String str = this.XIi00iiXO;
                Iterator<T> it = connectedDevices2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (Intrinsics.XOO0ii0(((BluetoothDevice) it.next()).getAddress(), str)) {
                        z = true;
                    }
                }
                IO0i<Boolean> iO0i = this.OXO1;
                Result.Companion companion = Result.Companion;
                iO0i.resumeWith(Result.m48333constructorimpl(Boolean.valueOf(z)));
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.sma.smartv3.util.ClassicBluetoothUtil$myReceiver$1] */
    static {
        ry0<BleDevice> ry0VarXIi00iiXO = m94.XIi00iiXO(0, 60, null, 5, null);
        XO0O10 = ry0VarXIi00iiXO;
        O00 = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        IiI10X = new BroadcastReceiver() { // from class: com.sma.smartv3.util.ClassicBluetoothUtil$myReceiver$1
            @Override // android.content.BroadcastReceiver
            @RequiresPermission("android.permission.BLUETOOTH_CONNECT")
            public void onReceive(Context context, Intent intent) {
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -1780914469) {
                        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                            i1O0OXO1O.OXO1.OXO1(ClassicBluetoothUtil.XIi00iiXO + " Discovery Finished");
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 1167529923 && action.equals("android.bluetooth.device.action.FOUND")) {
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        String name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
                        int type = bluetoothDevice != null ? bluetoothDevice.getType() : 0;
                        if (name == null || name.length() == 0 || address == null || address.length() == 0 || type == 2) {
                            return;
                        }
                        ClassicBluetoothUtil.XO0O10.mo3016iO(new BleDevice(bluetoothDevice, 0, null, name, type, address));
                    }
                }
            }
        };
        I0IIOi = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
        OIi0 = UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb");
    }

    @aa1
    public final l94<BleDevice> I0IIOi() {
        return O00;
    }

    public final boolean I0iXXO(@tb1 String str) {
        BluetoothAdapter bluetoothAdapter;
        Set<BluetoothDevice> bondedDevices;
        if (str != null && (bluetoothAdapter = f54901iO) != null && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
            Set<BluetoothDevice> set = bondedDevices;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            for (BluetoothDevice bluetoothDevice : set) {
                if (Intrinsics.XOO0ii0(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void I1XOi1(@tb1 BleDevice bleDevice) {
        IiI10X();
    }

    public final void IIX1OXO(Context context) {
        context.unregisterReceiver(IiI10X);
    }

    @tb1
    /* JADX INFO: renamed from: IO */
    public final Object m38805IO(@aa1 Context context, @aa1 String str, @aa1 Continuation<? super Boolean> continuation) {
        kotlinx.coroutines.XIi00iiXO xIi00iiXO = new kotlinx.coroutines.XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation), 1);
        xIi00iiXO.XXX11i();
        BluetoothAdapter.getDefaultAdapter().getProfileProxy(context, new XIi00iiXO(xIi00iiXO, str), 2);
        Object objOII = xIi00iiXO.OII();
        if (objOII == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objOII;
    }

    public final void IiI10X() {
        try {
            BluetoothSocket bluetoothSocket = XOO0ii0;
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
            i1O0OXO1O.OXO1.OXO1("关闭连接，重新请求");
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " DisConnect Failed " + e.getMessage());
        }
    }

    public final void O00() {
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        intent.setFlags(268435456);
        ActivityUtils.startActivity(intent);
    }

    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"})
    public final void O10IXXX0X() {
        X0O();
        XOO0ii0();
        f54901iO.startDiscovery();
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " StartScan");
    }

    public final boolean OIX0iXi() {
        try {
            BluetoothSocket bluetoothSocket = XOO0ii0;
            return (bluetoothSocket == null || !bluetoothSocket.isConnected() || bluetoothSocket.getOutputStream() == null || bluetoothSocket.getInputStream() == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void OIi0(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        X1ii(context);
    }

    @RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public final void X0O() {
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " StopScan");
        BluetoothAdapter bluetoothAdapter = f54901iO;
        if (bluetoothAdapter == null || !bluetoothAdapter.isDiscovering()) {
            return;
        }
        bluetoothAdapter.cancelDiscovery();
    }

    public final void X1ii(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        context.registerReceiver(IiI10X, intentFilter);
    }

    public final void XO0O10(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        IIX1OXO(context);
    }

    @RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public final void XOO0ii0() {
        Set<BluetoothDevice> bondedDevices = f54901iO.getBondedDevices();
        if (bondedDevices != null) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                String name = bluetoothDevice.getName();
                Intrinsics.O10IXXX0X(name, "getName(...)");
                String address = bluetoothDevice.getAddress();
                Intrinsics.O10IXXX0X(address, "getAddress(...)");
                int type = bluetoothDevice.getType();
                Intrinsics.XXI(bluetoothDevice);
                XO0O10.mo3016iO(new BleDevice(bluetoothDevice, 0, null, name, type, address));
            }
        }
    }

    @RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public final boolean XXI(@tb1 BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            return bluetoothDevice.createBond();
        } catch (Exception e) {
            i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " pair Exception:" + e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.BroadcastReceiver, com.sma.smartv3.util.ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1] */
    @tb1
    /* JADX INFO: renamed from: iO */
    public final Object m38806iO(@aa1 final Context context, @aa1 Continuation<? super BluetoothDevice> continuation) {
        final kotlinx.coroutines.XIi00iiXO xIi00iiXO = new kotlinx.coroutines.XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation), 1);
        xIi00iiXO.XXX11i();
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        ?? r2 = new BroadcastReceiver() { // from class: com.sma.smartv3.util.ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null || intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) != 2) {
                    return;
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                context.unregisterReceiver(this);
                IO0i<BluetoothDevice> iO0i = xIi00iiXO;
                Result.Companion companion = Result.Companion;
                iO0i.resumeWith(Result.m48333constructorimpl(bluetoothDevice));
            }
        };
        context.registerReceiver(r2, intentFilter);
        xIi00iiXO.mo634iX(new OXO1(context, r2));
        Object objOII = xIi00iiXO.OII();
        if (objOII == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objOII;
    }
}
