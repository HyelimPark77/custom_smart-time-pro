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
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0X;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zc1;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.sifli.siflidfu.DFUImagePath;
import com.sifli.siflidfu.ISifliDFUService;
import com.sifli.siflidfu.SifliDFUService;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.ota.SOTAManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SOTAManager extends iX0X {

    @aa1
    public final Lazy I0IIOi;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final ServiceConnection f55352IO;

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
        public OXO1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) throws IOException {
            Intrinsics.X0O(name, "name");
            Intrinsics.X0O(service, "service");
            SOTAManager.this.IiI10X = (SifliDFUService.SifliDFUBinder) service;
            SOTAManager sOTAManager = SOTAManager.this;
            SifliDFUService.SifliDFUBinder sifliDFUBinder = sOTAManager.IiI10X;
            sOTAManager.XOO0ii0 = sifliDFUBinder != null ? sifliDFUBinder.getDfuService() : null;
            SOTAManager.this.OIi0 = true;
            i1O0OXO1O.OXO1.OXO1(SOTAManager.this.O00 + " onServiceConnected");
            SOTAManager.this.OII();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.X0O(name, "name");
            i1O0OXO1O.OXO1.OXO1(SOTAManager.this.O00 + " onServiceDisconnected");
            SOTAManager.this.OIi0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SOTAManager(@aa1 Context context, @aa1 zc1 callback) {
        super(context, callback);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(callback, "callback");
        this.O00 = "SOTAManager";
        this.I0IIOi = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hs3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SOTAManager.OiIIX101O(this.f7190IO);
            }
        });
        this.f55352IO = new OXO1();
        XiOIii1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OII() throws IOException {
        i1O0OXO1O.OXO1.OXO1(this.O00 + " start ota process");
        List<File> listUnzipFile = ZipUtils.unzipFile(this.OIX0iXi, PathUtils.getExternalAppCachePath());
        Intrinsics.XXI(listUnzipFile);
        ArrayList<DFUImagePath> arrayListIIiiO = iIiiO(listUnzipFile);
        ISifliDFUService iSifliDFUService = this.XOO0ii0;
        if (iSifliDFUService != null) {
            iSifliDFUService.startActionDFUNorExt(m2158iO(), XIi00iiXO(), arrayListIIiiO, 1, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.szabh.smable3.ota.SOTAManager$localBroadcastReceiver$2$1] */
    public static final SOTAManager$localBroadcastReceiver$2$1 OiIIX101O(final SOTAManager sOTAManager) {
        return new BroadcastReceiver() { // from class: com.szabh.smable3.ota.SOTAManager$localBroadcastReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.X0O(context, "context");
                Intrinsics.X0O(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -1936294892) {
                        if (action.equals(SifliDFUService.BROADCAST_DFU_PROGRESS)) {
                            int intExtra = intent.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS, 0);
                            intent.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS_TYPE, 0);
                            iX0X.I0iXXO(this.OXO1, 5, null, ((double) intExtra) / 100.0d, 2, null);
                            return;
                        }
                        return;
                    }
                    if (iHashCode != 888644493) {
                        if (iHashCode == 1761809728 && action.equals(SifliDFUService.BROADCAST_DFU_LOG)) {
                            String stringExtra = intent.getStringExtra(SifliDFUService.EXTRA_LOG_MESSAGE);
                            i1O0OXO1O.OXO1.OXO1(this.OXO1.O00 + " BROADCAST_DFU_LOG : " + stringExtra);
                            return;
                        }
                        return;
                    }
                    if (action.equals(SifliDFUService.BROADCAST_DFU_STATE)) {
                        int intExtra2 = intent.getIntExtra(SifliDFUService.EXTRA_DFU_STATE, 0);
                        int intExtra3 = intent.getIntExtra(SifliDFUService.EXTRA_DFU_STATE_RESULT, 0);
                        i1O0OXO1O.OXO1.OXO1(this.OXO1.O00 + " BROADCAST_DFU_STATE result : dfuState=" + intExtra2 + "  dfuStateResult = " + intExtra3);
                        if (intExtra2 != 100) {
                            return;
                        }
                        if (intExtra3 == 0) {
                            iX0X.I0iXXO(this.OXO1, 6, null, 0.0d, 6, null);
                            return;
                        }
                        iX0X.I0iXXO(this.OXO1, 7, "dfuState=" + intExtra2 + ", dfuStateResult=" + intExtra3, 0.0d, 4, null);
                    }
                }
            }
        };
    }

    @Override // com.android.mltcode.paycertificationapi.iX0X
    public void O00() {
        i1O0OXO1O.OXO1.OXO1(this.O00 + " release ota");
        LocalBroadcastManager.getInstance(m2158iO()).unregisterReceiver(XX0());
        if (this.OIi0) {
            m2158iO().unbindService(this.f55352IO);
            this.OIi0 = false;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.iX0X
    public void OIi0(@aa1 String filePath, @tb1 String str, boolean z) {
        Intrinsics.X0O(filePath, "filePath");
        i1O0OXO1O.OXO1.OXO1(this.O00 + " startOTA -> " + filePath + ", " + str + ", " + this.OIi0);
        this.OIX0iXi = filePath;
        if (TextUtils.isEmpty(str)) {
            str = BleCache.INSTANCE.getMBleAddress();
        }
        IiI10X(str);
        iX0X.I0iXXO(this, 1, null, 0.0d, 6, null);
        m2158iO().bindService(new Intent(m2158iO(), (Class<?>) SifliDFUService.class), this.f55352IO, 1);
    }

    public final BroadcastReceiver XX0() {
        return (BroadcastReceiver) this.I0IIOi.getValue();
    }

    public final void XiOIii1() {
        i1O0OXO1O.OXO1.OXO1(this.O00 + " registerDfuLocalBroadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(m2158iO()).registerReceiver(XX0(), intentFilter);
    }

    public final ArrayList<DFUImagePath> iIiiO(List<? extends File> list) {
        int i;
        ArrayList<DFUImagePath> arrayList = new ArrayList<>();
        for (File file : list) {
            Uri uriFromFile = Uri.fromFile(file);
            i1O0OXO1O.OXO1.OXO1("getDFUImagePath  path=" + uriFromFile.getPath() + ",scheme=" + uriFromFile.getScheme());
            String name = file.getName();
            if (name != null) {
                switch (name) {
                    case "otaFont.bin":
                        i = 4;
                        break;
                    case "otaApp.bin":
                        i = 0;
                        break;
                    case "ctrl_packet.bin":
                        i = -1;
                        break;
                    case "otaRes.bin":
                        i = 3;
                        break;
                    case "otaroot.bin":
                        i = 5;
                        break;
                    default:
                        i = -333;
                        break;
                }
            } else {
                i = -333;
            }
            if (i != -333) {
                arrayList.add(new DFUImagePath(null, uriFromFile, i));
            }
        }
        return arrayList;
    }
}
