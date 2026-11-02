package com.bestmafen.baseble.abh;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IIII0iI;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X0100I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.iOIIiI1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ut3;
import com.bestmafen.baseble.abh.AbhBleCentral;
import com.bestmafen.baseble.connector.AbsBleConnector;
import com.bestmafen.baseble.scanner.BleDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1#2:303\n1869#3,2:304\n774#3:306\n865#3,2:307\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n*L\n246#1:304,2\n265#1:306\n265#1:307,2\n*E\n"})
public final class AbhBleCentral {
    public static int I0IIOi;

    @aa1
    public static final Lazy I0iXXO;

    /* JADX INFO: renamed from: IO */
    public static int f20380IO;
    public static int IiI10X;

    @aa1
    public static final Handler O00;

    @aa1
    public static final Lazy O10IXXX0X;

    @aa1
    public static final OXO1 OIX0iXi;
    public static int OIi0;

    @aa1
    public static final AbhBleCentral OXO1;

    @aa1
    public static final Lazy X1ii;
    public static final String XIi00iiXO;
    public static final BluetoothAdapter XO0O10;
    public static int XOO0ii0;

    @aa1
    public static final Lazy XXI;

    /* JADX INFO: renamed from: iO */
    public static Context f20381iO;

    @SourceDebugExtension({"SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n774#2:303\n865#2,2:304\n1869#2,2:306\n1869#2,2:308\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n*L\n71#1:303\n71#1:304,2\n74#1:306,2\n106#1:308,2\n*E\n"})
    public static final class OXO1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            AbhBleCentral abhBleCentral = AbhBleCentral.OXO1;
            synchronized (abhBleCentral) {
                try {
                    Collection collectionValues = abhBleCentral.X01IiOiIi().values();
                    Intrinsics.O10IXXX0X(collectionValues, "<get-values>(...)");
                    ArrayList<IIII0iI> arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        IIII0iI iIII0iI = (IIII0iI) obj;
                        if (iIII0iI.I1XOi1() && iIII0iI.OII() != 4) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((IIII0iI) it.next()).XXI();
                    }
                    AbhBleCentral abhBleCentral2 = AbhBleCentral.OXO1;
                    if (abhBleCentral2.XX0()) {
                        AbhBleCentral.XOO0ii0++;
                        if (AbhBleCentral.XOO0ii0 < 1) {
                            AbhBleCentral.XOO0ii0 = 1;
                        }
                        int i = AbhBleCentral.XOO0ii0 * AbhBleCentral.I0IIOi;
                        if (i > AbhBleCentral.OIi0) {
                            AbhBleCentral.XOO0ii0 = 1;
                            i = AbhBleCentral.XOO0ii0 * AbhBleCentral.I0IIOi;
                        }
                        if (AbhBleCentral.IiI10X == 2) {
                            int i2 = (i * 3) / 4;
                            if (i2 > AbhBleCentral.f20380IO) {
                                i2 = AbhBleCentral.f20380IO;
                            }
                            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.XIi00iiXO + " connect scan " + AbhBleCentral.f20380IO + ' ' + AbhBleCentral.OIi0 + ' ' + AbhBleCentral.XOO0ii0 + ' ' + i + ' ' + i2);
                            OXOI0XII oxoi0xiiI010I = abhBleCentral2.i010I();
                            oxoi0xiiI010I.IIX1OXO(i2);
                            oxoi0xiiI010I.XXI(true);
                            AbhBleCentral.O00.postDelayed(this, (long) (i * 1000));
                            AbhBleCentral.IiI10X = 1;
                        } else {
                            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.XIi00iiXO + " connect directly " + AbhBleCentral.XOO0ii0 + ' ');
                            for (IIII0iI iIII0iI2 : arrayList) {
                                Context context = AbhBleCentral.f20381iO;
                                if (context == null) {
                                    Intrinsics.XXO("mContext");
                                    context = null;
                                }
                                BluetoothDevice remoteDevice = AbhBleCentral.XO0O10.getRemoteDevice(iIII0iI2.IIX1OXO());
                                Intrinsics.O10IXXX0X(remoteDevice, "getRemoteDevice(...)");
                                iIII0iI2.X1ii(context, remoteDevice);
                            }
                            AbhBleCentral.O00.postDelayed(this, 16000L);
                            AbhBleCentral abhBleCentral3 = AbhBleCentral.OXO1;
                            AbhBleCentral.IiI10X = 2;
                        }
                    }
                    Unit unit = Unit.OXO1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1740#2,3:303\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n*L\n136#1:303,3\n*E\n"})
    public static final class XIi00iiXO implements i1OIOOIiX {
        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean z) {
            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.XIi00iiXO + " onScan -> " + z);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice device) {
            Intrinsics.X0O(device, "device");
            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.XIi00iiXO + " onDeviceFound -> " + device);
            AbhBleCentral abhBleCentral = AbhBleCentral.OXO1;
            IIII0iI iIII0iI = (IIII0iI) abhBleCentral.X01IiOiIi().get(device.getMAddress());
            if (iIII0iI != null) {
                Context context = AbhBleCentral.f20381iO;
                if (context == null) {
                    Intrinsics.XXO("mContext");
                    context = null;
                }
                iIII0iI.X1ii(context, device.getMBluetoothDevice());
            }
            Collection collectionValues = abhBleCentral.X01IiOiIi().values();
            Intrinsics.O10IXXX0X(collectionValues, "<get-values>(...)");
            Collection<IIII0iI> collection = collectionValues;
            if (!collection.isEmpty()) {
                for (IIII0iI iIII0iI2 : collection) {
                    if (iIII0iI2.I1XOi1() && iIII0iI2.XiOIO() == null) {
                        return;
                    }
                }
            }
            AbhBleCentral.OXO1.i010I().XXI(false);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        /* JADX INFO: renamed from: iO */
        public void mo2019iO() {
        }
    }

    static {
        AbhBleCentral abhBleCentral = new AbhBleCentral();
        OXO1 = abhBleCentral;
        XIi00iiXO = abhBleCentral.getClass().getSimpleName();
        XO0O10 = BluetoothAdapter.getDefaultAdapter();
        O00 = new Handler(Looper.getMainLooper());
        I0IIOi = 5;
        OIi0 = 30;
        f20380IO = 12;
        OIX0iXi = new OXO1();
        I0iXXO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiXI1OiX0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AbhBleCentral.O1O();
            }
        });
        XXI = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AbhBleCentral.iX1O1();
            }
        });
        X1ii = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX00XX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AbhBleCentral.m11120iI();
            }
        });
        O10IXXX0X = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXOII
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AbhBleCentral.XXIIO1i11();
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m11118I1() {
    }

    public static final X0100I O1O() {
        return new X0100I();
    }

    public static final ConcurrentHashMap XXIIO1i11() {
        return new ConcurrentHashMap();
    }

    public static final void XXX11i() {
        OXO1.m11123iX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bestmafen.baseble.abh.AbhBleCentral$mReceiver$2$1] */
    /* JADX INFO: renamed from: iI */
    public static final AbhBleCentral$mReceiver$2$1 m11120iI() {
        return new BroadcastReceiver() { // from class: com.bestmafen.baseble.abh.AbhBleCentral$mReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.X0O(context, "context");
                Intrinsics.X0O(intent, "intent");
                if (TextUtils.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    i1O0OXO1O.OXO1.XO0O10(AbhBleCentral.XIi00iiXO + " BluetoothAdapter.ACTION_STATE_CHANGED -> " + AbsBleConnector.Companion.OXO1(intExtra));
                    if (intExtra != 10) {
                        if (intExtra != 12) {
                            return;
                        }
                        AbhBleCentral.OXO1.m11123iX();
                        return;
                    }
                    Collection collectionValues = AbhBleCentral.OXO1.X01IiOiIi().values();
                    Intrinsics.O10IXXX0X(collectionValues, "<get-values>(...)");
                    ArrayList<IIII0iI> arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (((IIII0iI) obj).I1XOi1()) {
                            arrayList.add(obj);
                        }
                    }
                    for (IIII0iI iIII0iI : arrayList) {
                        iIII0iI.XXI();
                        iIII0iI.X0i1O(0);
                    }
                    AbhBleCentral.OXO1.m11123iX();
                }
            }
        };
    }

    public static final OXOI0XII iX1O1() {
        return ut3.XIi00iiXO(ut3.OXO1, null, null, 3, null).XiOIO(OXO1.m11122OX()).iIiiO(false).X1ii(new XIi00iiXO());
    }

    public final AbhBleCentral$mReceiver$2$1 II1Xi0() {
        return (AbhBleCentral$mReceiver$2$1) X1ii.getValue();
    }

    @SuppressLint({"WrongConstant"})
    public final void IXXOO(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.O10IXXX0X(applicationContext, "getApplicationContext(...)");
        f20381iO = applicationContext;
        if (applicationContext == null) {
            Intrinsics.XXO("mContext");
            applicationContext = null;
        }
        ContextCompat.registerReceiver(applicationContext, II1Xi0(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
    }

    @tb1
    public final IIII0iI OII(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        return X01IiOiIi().get(address);
    }

    /* JADX INFO: renamed from: OX */
    public final X0100I m11122OX() {
        return (X0100I) I0iXXO.getValue();
    }

    public final void OiIIX101O(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        IIII0iI iIII0iI = X01IiOiIi().get(address);
        if (iIII0iI != null) {
            iIII0iI.X0O();
        }
    }

    public final ConcurrentHashMap<String, IIII0iI> X01IiOiIi() {
        return (ConcurrentHashMap) O10IXXX0X.getValue();
    }

    public final synchronized void X0i1O(List<? extends IIII0iI> list) {
        try {
            if (XX0()) {
                if (IiI10X != 0) {
                    return;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((IIII0iI) it.next()).X0i1O(1);
                }
                IiI10X = 1;
                XOO0ii0 = 0;
                O00.post(OIX0iXi);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void X11iII1O1(@aa1 IIII0iI peripheral) {
        Intrinsics.X0O(peripheral, "peripheral");
        if (peripheral.OII() == 4 || peripheral.OII() == 0) {
            O00.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ii00OXXO
                @Override // java.lang.Runnable
                public final void run() {
                    AbhBleCentral.XXX11i();
                }
            });
        }
    }

    public final void X1IX(@aa1 String address, @aa1 iOIIiI1 writeMessage) {
        Intrinsics.X0O(address, "address");
        Intrinsics.X0O(writeMessage, "writeMessage");
        IIII0iI iIII0iI = X01IiOiIi().get(address);
        if (iIII0iI != null) {
            iIII0iI.X11iII1O1(writeMessage);
        }
    }

    public final boolean XX0() {
        BluetoothAdapter bluetoothAdapter = XO0O10;
        boolean zIsEnabled = bluetoothAdapter.isEnabled();
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " canConnect -> " + zIsEnabled + ", BluetoothAdapter isEnabled: " + bluetoothAdapter.isEnabled());
        return zIsEnabled;
    }

    public final void XiOIii1(@aa1 String address, boolean z) {
        Intrinsics.X0O(address, "address");
        IIII0iI iIII0iI = X01IiOiIi().get(address);
        if (iIII0iI != null) {
            iIII0iI.O10IXXX0X(z);
        }
    }

    public final OXOI0XII i010I() {
        return (OXOI0XII) XXI.getValue();
    }

    public final synchronized void iIXi1iiXI() {
        if (IiI10X == 0) {
            return;
        }
        IiI10X = 0;
        O00.removeCallbacks(OIX0iXi);
        i010I().XXI(false);
    }

    public final void iOO1ii1(@aa1 IIII0iI peripheral) {
        Intrinsics.X0O(peripheral, "peripheral");
        iXiX011(peripheral.IIX1OXO());
        ConcurrentHashMap<String, IIII0iI> concurrentHashMapX01IiOiIi = X01IiOiIi();
        String strIIX1OXO = peripheral.IIX1OXO();
        peripheral.I0iXXO();
        concurrentHashMapX01IiOiIi.put(strIIX1OXO, peripheral);
        XOO0ii0 = 0;
        m11122OX().XIi00iiXO(peripheral.IIX1OXO());
        m11123iX();
    }

    @aa1
    public final Collection<IIII0iI> iOOX010X() {
        Collection<IIII0iI> collectionValues = X01IiOiIi().values();
        Intrinsics.O10IXXX0X(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    /* JADX INFO: renamed from: iX */
    public final synchronized void m11123iX() {
        try {
            Collection<IIII0iI> collectionValues = X01IiOiIi().values();
            Intrinsics.O10IXXX0X(collectionValues, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                IIII0iI iIII0iI = (IIII0iI) obj;
                if (iIII0iI.I1XOi1() && iIII0iI.OII() != 4) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                iIXi1iiXI();
            } else {
                X0i1O(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void iXiX011(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        IIII0iI iIII0iIRemove = X01IiOiIi().remove(address);
        if (iIII0iIRemove != null) {
            iIII0iIRemove.iX1O1();
        }
        m11122OX().m1063iO(address);
        m11123iX();
    }
}
