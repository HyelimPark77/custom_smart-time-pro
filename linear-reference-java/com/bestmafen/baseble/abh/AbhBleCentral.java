package com.bestmafen.baseble.abh;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IIII0iI;
import com.android.mltcode.paycertificationapi.IIX;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.OiXI1OiX0;
import com.android.mltcode.paycertificationapi.X0100I;
import com.android.mltcode.paycertificationapi.XX00XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.iOIIiI1;
import com.android.mltcode.paycertificationapi.iXOII;
import com.android.mltcode.paycertificationapi.ii00OXXO;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ut3;
import com.bestmafen.baseble.scanner.BleDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1#2:303\n1869#3,2:304\n774#3:306\n865#3,2:307\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral\n*L\n246#1:304,2\n265#1:306\n265#1:307,2\n*E\n"})
public final class AbhBleCentral {
    public static int I0IIOi;

    @aa1
    public static final Lazy I0iXXO = null;
    public static int IO;
    public static int IiI10X;

    @aa1
    public static final Handler O00 = null;

    @aa1
    public static final Lazy O10IXXX0X = null;

    @aa1
    public static final OXO1 OIX0iXi = null;
    public static int OIi0;

    @aa1
    public static final AbhBleCentral OXO1 = null;

    @aa1
    public static final Lazy X1ii = null;
    public static final String XIi00iiXO = null;
    public static final BluetoothAdapter XO0O10 = null;
    public static int XOO0ii0;

    @aa1
    public static final Lazy XXI = null;
    public static Context iO;

    @SourceDebugExtension({"SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n774#2:303\n865#2,2:304\n1869#2,2:306\n1869#2,2:308\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n*L\n71#1:303\n71#1:304,2\n74#1:306,2\n106#1:308,2\n*E\n"})
    public static final class OXO1 implements Runnable {
        public OXO1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbhBleCentral r0 = AbhBleCentral.OXO1;
            monitor-enter(r0);
            Collection r1 = AbhBleCentral.OIX0iXi(r0).values();     // Catch: Throwable -> L12
            Intrinsics.O10IXXX0X(r1, "<get-values>(...)");     // Catch: Throwable -> L12
            ArrayList r2 = new ArrayList();     // Catch: Throwable -> L12
            Iterator r3 = r1.iterator();     // Catch: Throwable -> L12
        L6:
            if (r3.hasNext() == false) goto L14;
            Object r4 = r3.next();     // Catch: Throwable -> L12
            IIII0iI r5 = (IIII0iI) r4;     // Catch: Throwable -> L12
            if (r5.I1XOi1() == false) goto L6;
            if (r5.OII() == 4) goto L6;
            r2.add(r4);     // Catch: Throwable -> L12
            goto L6
        L14:
            Iterator r6 = r2.iterator();     // Catch: Throwable -> L12
        L16:
            if (r6.hasNext() == false) goto L18;
            ((IIII0iI) r6.next()).XXI();     // Catch: Throwable -> L12
            goto L16
        L18:
            AbhBleCentral r7 = AbhBleCentral.OXO1;     // Catch: Throwable -> L12
            if (AbhBleCentral.IiI10X(r7) == false) goto L41;
            AbhBleCentral.iIiiO(AbhBleCentral.X1ii() + 1);     // Catch: Throwable -> L12
            if (AbhBleCentral.X1ii() >= 1) goto L24;
            AbhBleCentral.iIiiO(1);     // Catch: Throwable -> L12
        L24:
            int r8 = AbhBleCentral.X1ii() * AbhBleCentral.I0iXXO();     // Catch: Throwable -> L12
            if (r8 <= AbhBleCentral.XXI()) goto L28;
            AbhBleCentral.iIiiO(1);     // Catch: Throwable -> L12
            r8 = AbhBleCentral.X1ii() * AbhBleCentral.I0iXXO();     // Catch: Throwable -> L12
        L28:
            if (AbhBleCentral.I0IIOi() != 2) goto L33;
            int r9 = (r8 * 3) / 4;     // Catch: Throwable -> L12
            if (r9 <= AbhBleCentral.O10IXXX0X()) goto L32;
            r9 = AbhBleCentral.O10IXXX0X();     // Catch: Throwable -> L12
        L32:
            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.I1XOi1() + " connect scan " + AbhBleCentral.O10IXXX0X() + ' ' + AbhBleCentral.XXI() + ' ' + AbhBleCentral.X1ii() + ' ' + r8 + ' ' + r9);     // Catch: Throwable -> L12
            OXOI0XII r10 = AbhBleCentral.X0O(r7);     // Catch: Throwable -> L12
            r10.IIX1OXO(r9);     // Catch: Throwable -> L12
            r10.XXI(true);     // Catch: Throwable -> L12
            AbhBleCentral.IO().postDelayed(this, (long) (r8 * 1000));     // Catch: Throwable -> L12
            AbhBleCentral.XiOIO(1);     // Catch: Throwable -> L12
            goto L41
        L33:
            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.I1XOi1() + " connect directly " + AbhBleCentral.X1ii() + ' ');     // Catch: Throwable -> L12
            Iterator r11 = r2.iterator();     // Catch: Throwable -> L12
        L35:
            if (r11.hasNext() == false) goto L40;
            IIII0iI r12 = (IIII0iI) r11.next();     // Catch: Throwable -> L12
            Context r13 = AbhBleCentral.OIi0();     // Catch: Throwable -> L12
            if (r13 != null) goto L39;
            Intrinsics.XXO("mContext");     // Catch: Throwable -> L12
            r13 = null;
        L39:
            BluetoothDevice r14 = AbhBleCentral.XOO0ii0().getRemoteDevice(r12.IIX1OXO());     // Catch: Throwable -> L12
            Intrinsics.O10IXXX0X(r14, "getRemoteDevice(...)");     // Catch: Throwable -> L12
            r12.X1ii(r13, r14);     // Catch: Throwable -> L12
            goto L35
        L40:
            AbhBleCentral.IO().postDelayed(this, 16000);     // Catch: Throwable -> L12
            AbhBleCentral r15 = AbhBleCentral.OXO1;     // Catch: Throwable -> L12
            AbhBleCentral.XiOIO(2);     // Catch: Throwable -> L12
        L41:
            Unit r16 = Unit.OXO1;     // Catch: Throwable -> L12
            monitor-exit(r0);
            return;
        L12:
            th = move-exception;
            throw th;
        }
    }

    @SourceDebugExtension({"SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1740#2,3:303\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n*L\n136#1:303,3\n*E\n"})
    public static final class XIi00iiXO implements i1OIOOIiX {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r4) {
            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.I1XOi1() + " onScan -> " + r4);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r4) {
            Intrinsics.X0O(r4, "device");
            i1O0OXO1O.OXO1.OXO1(AbhBleCentral.I1XOi1() + " onDeviceFound -> " + r4);
            AbhBleCentral r0 = AbhBleCentral.OXO1;
            IIII0iI r1 = (IIII0iI) AbhBleCentral.OIX0iXi(r0).get(r4.getMAddress());
            if (r1 == null) goto L8;
            Context r2 = AbhBleCentral.OIi0();
            if (r2 != null) goto L7;
            Intrinsics.XXO("mContext");
            r2 = null;
        L7:
            r1.X1ii(r2, r4.getMBluetoothDevice());
        L8:
            Collection r5 = AbhBleCentral.OIX0iXi(r0).values();
            Intrinsics.O10IXXX0X(r5, "<get-values>(...)");
            Collection r6 = r5;
            if (r6.isEmpty() == true) goto L20;
            Iterator r7 = r6.iterator();
        L13:
            if (r7.hasNext() == false) goto L20;
            IIII0iI r3 = (IIII0iI) r7.next();
            if (r3.I1XOi1() == false) goto L13;
            if (r3.XiOIO() != null) goto L13;
            return;
        L20:
            AbhBleCentral.X0O(AbhBleCentral.OXO1).XXI(false);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    static {
        AbhBleCentral r0 = new AbhBleCentral();
        OXO1 = r0;
        XIi00iiXO = r0.getClass().getSimpleName();
        XO0O10 = BluetoothAdapter.getDefaultAdapter();
        O00 = new Handler(Looper.getMainLooper());
        I0IIOi = 5;
        OIi0 = 30;
        IO = 12;
        OIX0iXi = new OXO1();
        I0iXXO = LazyKt__LazyJVMKt.iO(new OiXI1OiX0());
        XXI = LazyKt__LazyJVMKt.iO(new IIX());
        X1ii = LazyKt__LazyJVMKt.iO(new XX00XX());
        O10IXXX0X = LazyKt__LazyJVMKt.iO(new iXOII());
    }

    public AbhBleCentral() {
    }

    public static final /* synthetic */ int I0IIOi() {
        return IiI10X;
    }

    public static final /* synthetic */ int I0iXXO() {
        return I0IIOi;
    }

    public static /* synthetic */ void I1() {
    }

    public static final /* synthetic */ String I1XOi1() {
        return XIi00iiXO;
    }

    public static final /* synthetic */ void IIX1OXO(AbhBleCentral r0) {
        r0.iX();
    }

    public static final /* synthetic */ Handler IO() {
        return O00;
    }

    public static final /* synthetic */ boolean IiI10X(AbhBleCentral r0) {
        return r0.XX0();
    }

    public static /* synthetic */ X0100I O00() {
        return O1O();
    }

    public static final /* synthetic */ int O10IXXX0X() {
        return IO;
    }

    public static final X0100I O1O() {
        return new X0100I();
    }

    public static final /* synthetic */ ConcurrentHashMap OIX0iXi(AbhBleCentral r0) {
        return r0.X01IiOiIi();
    }

    public static final /* synthetic */ Context OIi0() {
        return iO;
    }

    public static /* synthetic */ void OXO1() {
        XXX11i();
    }

    public static final /* synthetic */ OXOI0XII X0O(AbhBleCentral r0) {
        return r0.i010I();
    }

    public static final /* synthetic */ int X1ii() {
        return XOO0ii0;
    }

    public static /* synthetic */ OXOI0XII XIi00iiXO() {
        return iX1O1();
    }

    public static /* synthetic */ ConcurrentHashMap XO0O10() {
        return XXIIO1i11();
    }

    public static final /* synthetic */ BluetoothAdapter XOO0ii0() {
        return XO0O10;
    }

    public static final /* synthetic */ int XXI() {
        return OIi0;
    }

    public static final ConcurrentHashMap XXIIO1i11() {
        return new ConcurrentHashMap();
    }

    public static final void XXX11i() {
        OXO1.iX();
    }

    public static final /* synthetic */ void XiOIO(int r0) {
        IiI10X = r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bestmafen.baseble.abh.AbhBleCentral$mReceiver$2$1] */
    public static final AbhBleCentral$mReceiver$2$1 iI() {
        return new AbhBleCentral$mReceiver$2$1();
    }

    public static final /* synthetic */ void iIiiO(int r0) {
        XOO0ii0 = r0;
    }

    public static /* synthetic */ AbhBleCentral$mReceiver$2$1 iO() {
        return iI();
    }

    public static final OXOI0XII iX1O1() {
        return ut3.XIi00iiXO(ut3.OXO1, null, null, 3, null).XiOIO(OXO1.OX()).iIiiO(false).X1ii(new XIi00iiXO());
    }

    public final AbhBleCentral$mReceiver$2$1 II1Xi0() {
        return (AbhBleCentral$mReceiver$2$1) X1ii.getValue();
    }

    @SuppressLint({"WrongConstant"})
    public final void IXXOO(@aa1 Context r4) {
        Intrinsics.X0O(r4, "context");
        Context r5 = r4.getApplicationContext();
        Intrinsics.O10IXXX0X(r5, "getApplicationContext(...)");
        iO = r5;
        if (r5 != null) goto L5;
        Intrinsics.XXO("mContext");
        r5 = null;
    L5:
        ContextCompat.registerReceiver(r5, II1Xi0(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
    }

    @tb1
    public final IIII0iI OII(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        return X01IiOiIi().get(r2);
    }

    public final X0100I OX() {
        return (X0100I) I0iXXO.getValue();
    }

    public final void OiIIX101O(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        IIII0iI r3 = X01IiOiIi().get(r2);
        if (r3 == null) goto L6;
        r3.X0O();
        return;
    }

    public final ConcurrentHashMap<String, IIII0iI> X01IiOiIi() {
        return (ConcurrentHashMap) O10IXXX0X.getValue();
    }

    public final synchronized void X0i1O(List<? extends IIII0iI> r3) {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (XX0() == true) goto L8;
        monitor-exit(this);
        return;
    L8:
        if (IiI10X == 0) goto L11;
        monitor-exit(this);
        return;
    L11:
        Iterator<T> r4 = r3.iterator();     // Catch: Throwable -> L15
    L13:
        if (r4.hasNext() == false) goto L17;
        ((IIII0iI) r4.next()).X0i1O(1);     // Catch: Throwable -> L15
        goto L13
    L17:
        IiI10X = 1;     // Catch: Throwable -> L15
        XOO0ii0 = 0;     // Catch: Throwable -> L15
        O00.post(OIX0iXi);     // Catch: Throwable -> L15
        monitor-exit(this);
    }

    public final void X11iII1O1(@aa1 IIII0iI r3) {
        Intrinsics.X0O(r3, "peripheral");
        if (r3.OII() != 4) goto L5;
    L8:
        O00.post(new ii00OXXO());
        return;
    L5:
        if (r3.OII() == 0) goto L8;
    }

    public final void X1IX(@aa1 String r2, @aa1 iOIIiI1 r3) {
        Intrinsics.X0O(r2, "address");
        Intrinsics.X0O(r3, "writeMessage");
        IIII0iI r4 = X01IiOiIi().get(r2);
        if (r4 == null) goto L6;
        r4.X11iII1O1(r3);
        return;
    }

    public final boolean XX0() {
        BluetoothAdapter r0 = XO0O10;
        boolean r1 = r0.isEnabled();
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " canConnect -> " + r1 + ", BluetoothAdapter isEnabled: " + r0.isEnabled());
        return r1;
    }

    public final void XiOIii1(@aa1 String r2, boolean r3) {
        Intrinsics.X0O(r2, "address");
        IIII0iI r4 = X01IiOiIi().get(r2);
        if (r4 == null) goto L6;
        r4.O10IXXX0X(r3);
        return;
    }

    public final OXOI0XII i010I() {
        return (OXOI0XII) XXI.getValue();
    }

    public final synchronized void iIXi1iiXI() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (IiI10X != 0) goto L8;
        monitor-exit(this);
        return;
    L8:
        IiI10X = 0;     // Catch: Throwable -> L11
        O00.removeCallbacks(OIX0iXi);     // Catch: Throwable -> L11
        i010I().XXI(false);     // Catch: Throwable -> L11
        monitor-exit(this);
    }

    public final void iOO1ii1(@aa1 IIII0iI r3) {
        Intrinsics.X0O(r3, "peripheral");
        iXiX011(r3.IIX1OXO());
        ConcurrentHashMap<String, IIII0iI> r0 = X01IiOiIi();
        String r1 = r3.IIX1OXO();
        r3.I0iXXO();
        r0.put(r1, r3);
        XOO0ii0 = 0;
        OX().XIi00iiXO(r3.IIX1OXO());
        iX();
    }

    @aa1
    public final Collection<IIII0iI> iOOX010X() {
        Collection<IIII0iI> r0 = X01IiOiIi().values();
        Intrinsics.O10IXXX0X(r0, "<get-values>(...)");
        return r0;
    }

    public final synchronized void iX() {
        monitor-enter(this);
        Collection<IIII0iI> r0 = X01IiOiIi().values();     // Catch: Throwable -> L11
        Intrinsics.O10IXXX0X(r0, "<get-values>(...)");     // Catch: Throwable -> L11
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        Iterator<T> r2 = r0.iterator();     // Catch: Throwable -> L11
    L5:
        if (r2.hasNext() == false) goto L14;
        Object r3 = r2.next();     // Catch: Throwable -> L11
        IIII0iI r4 = (IIII0iI) r3;     // Catch: Throwable -> L11
        if (r4.I1XOi1() == false) goto L5;
        if (r4.OII() == 4) goto L5;
        r1.add(r3);     // Catch: Throwable -> L11
        goto L5
    L14:
        if (r1.isEmpty() == false) goto L16;
        iIXi1iiXI();     // Catch: Throwable -> L11
    L17:
        monitor-exit(this);
        return;
    L16:
        X0i1O(r1);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final void iXiX011(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        IIII0iI r0 = X01IiOiIi().remove(r2);
        if (r0 == null) goto L5;
        r0.iX1O1();
    L5:
        OX().iO(r2);
        iX();
    }
}
