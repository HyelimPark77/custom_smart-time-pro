package com.szabh.smable3.ota;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hs3;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0X;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zc1;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.ironsource.Y5;
import com.sifli.siflidfu.DFUImagePath;
import com.sifli.siflidfu.ISifliDFUService;
import com.sifli.siflidfu.SifliDFUService;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SOTAManager extends iX0X {

    @aa1
    public final Lazy I0IIOi;

    @aa1
    public final ServiceConnection IO;

    @tb1
    public SifliDFUService.SifliDFUBinder IiI10X;

    @aa1
    public final String O00;

    @tb1
    public String OIX0iXi;
    public boolean OIi0;

    @tb1
    public ISifliDFUService XOO0ii0;

    public static final class OXO1 implements ServiceConnection {
        public final /* synthetic */ SOTAManager IO;

        public OXO1(SOTAManager r1) {
            this.IO = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName r2, IBinder r3) {
            Intrinsics.X0O(r2, "name");
            Intrinsics.X0O(r3, NotificationCompat.CATEGORY_SERVICE);
            SOTAManager.I1XOi1(this.IO, (SifliDFUService.SifliDFUBinder) r3);
            SOTAManager r4 = this.IO;
            SifliDFUService.SifliDFUBinder r5 = SOTAManager.X1ii(r4);
            if (r5 == null) goto L5;
            ISifliDFUService r6 = r5.getDfuService();
        L6:
            SOTAManager.IIX1OXO(r4, r6);
            SOTAManager.X0O(this.IO, true);
            i1O0OXO1O.OXO1.OXO1(SOTAManager.O10IXXX0X(this.IO) + " onServiceConnected");
            SOTAManager.XiOIO(this.IO);
            return;
        L5:
            r6 = null;
            goto L6
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r3) {
            Intrinsics.X0O(r3, "name");
            i1O0OXO1O.OXO1.OXO1(SOTAManager.O10IXXX0X(this.IO) + " onServiceDisconnected");
            SOTAManager.X0O(this.IO, false);
        }
    }

    public SOTAManager(@aa1 Context r2, @aa1 zc1 r3) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "callback");
        super(r2, r3);
        this.O00 = "SOTAManager";
        this.I0IIOi = LazyKt__LazyJVMKt.iO(new hs3(this));
        this.IO = new OXO1(this);
        XiOIii1();
    }

    public static final /* synthetic */ void I1XOi1(SOTAManager r0, SifliDFUService.SifliDFUBinder r1) {
        r0.IiI10X = r1;
    }

    public static final /* synthetic */ void IIX1OXO(SOTAManager r0, ISifliDFUService r1) {
        r0.XOO0ii0 = r1;
    }

    public static final /* synthetic */ String O10IXXX0X(SOTAManager r0) {
        return r0.O00;
    }

    private final void OII() {
        i1O0OXO1O.OXO1.OXO1(this.O00 + " start ota process");
        List<File> r0 = ZipUtils.unzipFile(this.OIX0iXi, PathUtils.getExternalAppCachePath());
        Intrinsics.XXI(r0);
        ArrayList<DFUImagePath> r4 = iIiiO(r0);
        ISifliDFUService r1 = this.XOO0ii0;
        if (r1 == null) goto L6;
        r1.startActionDFUNorExt(iO(), XIi00iiXO(), r4, 1, 0);
        return;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.szabh.smable3.ota.SOTAManager$localBroadcastReceiver$2$1] */
    public static final SOTAManager$localBroadcastReceiver$2$1 OiIIX101O(final SOTAManager r1) {
        return new SOTAManager$localBroadcastReceiver$2$1(r1);
    }

    public static final /* synthetic */ void X0O(SOTAManager r0, boolean r1) {
        r0.OIi0 = r1;
    }

    public static final /* synthetic */ SifliDFUService.SifliDFUBinder X1ii(SOTAManager r0) {
        return r0.IiI10X;
    }

    public static /* synthetic */ SOTAManager$localBroadcastReceiver$2$1 XXI(SOTAManager r0) {
        return OiIIX101O(r0);
    }

    public static final /* synthetic */ void XiOIO(SOTAManager r0) {
        r0.OII();
    }

    @Override // com.android.mltcode.paycertificationapi.iX0X
    public void O00() {
        i1O0OXO1O.OXO1.OXO1(this.O00 + " release ota");
        LocalBroadcastManager.getInstance(iO()).unregisterReceiver(XX0());
        if (this.OIi0 == false) goto L6;
        iO().unbindService(this.IO);
        this.OIi0 = false;
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.iX0X
    public void OIi0(@aa1 String r8, @tb1 String r9, boolean r10) {
        Intrinsics.X0O(r8, Y5.c.c);
        i1O0OXO1O.OXO1.OXO1(this.O00 + " startOTA -> " + r8 + ", " + r9 + ", " + this.OIi0);
        this.OIX0iXi = r8;
        if (TextUtils.isEmpty(r9) == false) goto L5;
        r9 = BleCache.INSTANCE.getMBleAddress();
    L5:
        IiI10X(r9);
        iX0X.I0iXXO(this, 1, null, 0.0d, 6, null);
        iO().bindService(new Intent(iO(), SifliDFUService.class), this.IO, 1);
    }

    public final BroadcastReceiver XX0() {
        return (BroadcastReceiver) getValue();
    }

    public final void XiOIii1() {
        i1O0OXO1O.OXO1.OXO1(this.O00 + " registerDfuLocalBroadcast");
        IntentFilter r0 = new IntentFilter();
        r0.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        r0.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        r0.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(iO()).registerReceiver(XX0(), r0);
    }

    public final ArrayList<DFUImagePath> iIiiO(List<? extends File> r7) {
        ArrayList<DFUImagePath> r0 = new ArrayList();
        Iterator<? extends File> r8 = r7.iterator();
    L4:
        if (r8.hasNext() == false) goto L33;
        File r1 = r8.next();
        Uri r2 = Uri.fromFile(r1);
        i1O0OXO1O.OXO1.OXO1("getDFUImagePath  path=" + r2.getPath() + ",scheme=" + r2.getScheme());
        String r3 = r1.getName();
        if (r3 != null) goto L8;
        int r4 = -333;
    L31:
        if (r4 == (-333)) goto L4;
        r0.add(new DFUImagePath(null, r2, r4));
        goto L4
    L8:
        switch(r3.hashCode()) {
            case -2014123484: goto L27;
            case -1426007810: goto L23;
            case -676093707: goto L19;
            case 464502781: goto L15;
            case 1683716375: goto L11;
            default: goto L39;
        };
    L39:
        r4 = -333;
        goto L31
    L11:
        if (r3.equals("otaroot.bin") == false) goto L40;
        r4 = 5;
        goto L31
    L40:
        r4 = -333;
        goto L31
    L15:
        if (r3.equals("otaRes.bin") == false) goto L41;
        r4 = 3;
        goto L31
    L41:
        r4 = -333;
        goto L31
    L19:
        if (r3.equals("ctrl_packet.bin") == false) goto L42;
        r4 = -1;
        goto L31
    L42:
        r4 = -333;
        goto L31
    L23:
        if (r3.equals("otaApp.bin") == false) goto L43;
        r4 = 0;
        goto L31
    L43:
        r4 = -333;
        goto L31
    L27:
        if (r3.equals("otaFont.bin") == false) goto L44;
        r4 = 4;
        goto L31
    L44:
        r4 = -333;
        goto L31
    L33:
        return r0;
    }
}
