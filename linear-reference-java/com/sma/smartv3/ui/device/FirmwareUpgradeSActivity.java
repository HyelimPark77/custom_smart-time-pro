package com.sma.smartv3.ui.device;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OO001;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;
import com.sifli.siflidfu.DFUImagePath;
import com.sifli.siflidfu.ISifliDFUService;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareUpgradeSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,302:1\n15#2:303\n15#2:304\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSActivity\n*L\n209#1:303\n210#1:304\n*E\n"})
public final class FirmwareUpgradeSActivity extends BaseFirmwareUpgradeActivity {

    @aa1
    private final String TAG;
    private boolean isBound;
    private int lastProgress;

    @aa1
    private final Lazy localBroadcastReceiver$delegate;

    @tb1
    private SifliDFUService.SifliDFUBinder mBinder;

    @aa1
    private final String mCurrent;

    @tb1
    private String mFilePath;

    @tb1
    private final FirmwareVersion mLatest;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @aa1
    private final ServiceConnection serviceConnection;

    @tb1
    private ISifliDFUService sifliDFUService;

    public static final class OXO1 implements ServiceConnection {
        public final /* synthetic */ FirmwareUpgradeSActivity IO;

        public OXO1(FirmwareUpgradeSActivity r1) {
            this.IO = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName r2, IBinder r3) {
            Intrinsics.X0O(r2, "name");
            Intrinsics.X0O(r3, NotificationCompat.CATEGORY_SERVICE);
            FirmwareUpgradeSActivity.access$setMBinder$p(this.IO, (SifliDFUService.SifliDFUBinder) r3);
            FirmwareUpgradeSActivity r4 = this.IO;
            SifliDFUService.SifliDFUBinder r5 = FirmwareUpgradeSActivity.access$getMBinder$p(r4);
            Intrinsics.XXI(r5);
            FirmwareUpgradeSActivity.access$setSifliDFUService$p(r4, r5.getDfuService());
            FirmwareUpgradeSActivity.access$setBound$p(this.IO, true);
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.access$getTAG$p(this.IO) + " onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r3) {
            Intrinsics.X0O(r3, "name");
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.access$getTAG$p(this.IO) + " onServiceDisconnected");
            FirmwareUpgradeSActivity.access$setBound$p(this.IO, false);
        }
    }

    public FirmwareUpgradeSActivity() {
        this.TAG = "UpgradeS";
        this.localBroadcastReceiver$delegate = LazyKt__LazyJVMKt.iO(new OO001(this));
        this.serviceConnection = new OXO1(this);
        this.mCurrent = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.XIi00iiXO();
        this.mLatest = (FirmwareVersion) new Gson().fromJson(r1.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        SPUtils r2 = r0.XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r2.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
    }

    public static /* synthetic */ FirmwareUpgradeSActivity$localBroadcastReceiver$2$1 XX0(FirmwareUpgradeSActivity r0) {
        return localBroadcastReceiver_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ int access$getLastProgress$p(FirmwareUpgradeSActivity r0) {
        return r0.lastProgress;
    }

    public static final /* synthetic */ SifliDFUService.SifliDFUBinder access$getMBinder$p(FirmwareUpgradeSActivity r0) {
        return r0.mBinder;
    }

    public static final /* synthetic */ String access$getTAG$p(FirmwareUpgradeSActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setBound$p(FirmwareUpgradeSActivity r0, boolean r1) {
        r0.isBound = r1;
    }

    public static final /* synthetic */ void access$setLastProgress$p(FirmwareUpgradeSActivity r0, int r1) {
        r0.lastProgress = r1;
    }

    public static final /* synthetic */ void access$setMBinder$p(FirmwareUpgradeSActivity r0, SifliDFUService.SifliDFUBinder r1) {
        r0.mBinder = r1;
    }

    public static final /* synthetic */ void access$setSifliDFUService$p(FirmwareUpgradeSActivity r0, ISifliDFUService r1) {
        r0.sifliDFUService = r1;
    }

    private final BroadcastReceiver getLocalBroadcastReceiver() {
        return (BroadcastReceiver) getValue();
    }

    private static final FirmwareUpgradeSActivity$localBroadcastReceiver$2$1 localBroadcastReceiver_delegate$lambda$0(FirmwareUpgradeSActivity r1) {
        return new FirmwareUpgradeSActivity$localBroadcastReceiver$2$1(r1);
    }

    private final void registerDfuLocalBroadcast() {
        IntentFilter r0 = new IntentFilter();
        r0.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        r0.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        r0.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(getLocalBroadcastReceiver(), r0);
    }

    public final void checkFirmware() {
        if (isAutoUpdate() == false) goto L10;
        FirmwareVersion r0 = this.mLatestFirmware;
        if (r0 != null) goto L8;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " isAutoUpdate = " + isAutoUpdate() + "  checkFirmware  mLatestFirmware = null ");
        finish();
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, "mLatestFirmware = null");
        return;
    L8:
        getTvTip().setText(getString(R.string.preparing));
        ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
        download(r0);
        return;
    L10:
        FirmwareVersion r1 = this.mLatest;
        if (r1 == null) goto L14;
        getTvTip().setText(getString(R.string.preparing));
        ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
        download(r1);
        return;
    }

    public final void download(@aa1 FirmwareVersion r5) {
        Intrinsics.X0O(r5, "firmwareVersion");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download " + r5);
        sz0 r0 = sz0.OXO1;
        this.mFilePath = uz0.XXI(r0) + "/" + r5.getFileName();
        NetWorkUtils.INSTANCE.download(r5.getFileUrl(), uz0.XXI(r0), r5.getFileName(), new AnonymousClass1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        registerDfuLocalBroadcast();
        bindService(new Intent(this, SifliDFUService.class), this.serviceConnection, 1);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (this.mLatest != null) goto L5;
        getTvLatest().setText(getString(R.string.v_s, new Object[]{this.mCurrent}));
        ViewParent r0 = getTvCurrent().getParent();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r0).setVisibility(8);
        getProgressButton().setVisibility(8);
    L7:
        if (isAutoUpdate() == false) goto L10;
        checkFirmware();
        return;
    L10:
        return;
    L5:
        setMCurrentVersion(this.mCurrent);
        setMTargetVersion(this.mLatest.getVersion());
        getTvLatest().setText(getString(R.string.v_s, new Object[]{getMTargetVersion()}));
        getTvCurrent().setText(getString(R.string.v_s, new Object[]{getMCurrentVersion()}));
        goto L7
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        checkFirmware();
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.launch();
        LocalBroadcastManager.getInstance(getBaseContext()).unregisterReceiver(getLocalBroadcastReceiver());
        if (this.isBound == false) goto L6;
        unbindService(this.serviceConnection);
        this.isBound = false;
    L6:
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false) == false) goto L8;
        I01XX0.XIi00iiXO(b01.IiI10X, null, 2, null);
    L8:
        super.onDestroy();
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted() == false) goto L5;
        return;
    L5:
        super.onHandleBackPressed();
    }

    public final void startOTA(@aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r7, "zipFilePath");
        Intrinsics.X0O(r8, "destDirPath");
        List<File> r9 = ZipUtils.unzipFile(r7, r8);
        Intrinsics.XXI(r9);
        ArrayList<DFUImagePath> r3 = UtilsKt.OII(r9);
        String r10 = BleCache.INSTANCE.getMBleAddress();
        if (r10 != null) goto L5;
    L9:
        r10 = a01.OXO1.XIi00iiXO().getString(b01.XXX11i);
        Intrinsics.O10IXXX0X(r10, "getString(...)");
    L8:
        String r2 = r10;
        ISifliDFUService r0 = this.sifliDFUService;
        Intrinsics.XXI(r0);
        r0.startActionDFUNorExt(this, r2, r3, 1, 0);
        setMStarted(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " mStarted = " + getMStarted());
        return;
    L5:
        if (r10.length() == 0) goto L9;
        a01.OXO1.XIi00iiXO().put(b01.XXX11i, r10);
        goto L8
    }

    public final void upgrade() {
        String r0 = this.mFilePath;
        Intrinsics.XXI(r0);
        if (oe5.O0Ii(r0, "zip", false, 2, null) == true) goto L11;
        ToastUtils.showLong("文件格式选择错误 请选择zip格式", new Object[0]);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " upgrade result  mFilePath = " + this.mFilePath);
        return;
    L11:
        String r1 = this.mFilePath;     // Catch: Exception -> L8
        Intrinsics.XXI(r1);     // Catch: Exception -> L8
        startOTA(r1, uz0.XXI(sz0.OXO1));     // Catch: Exception -> L8
        return;
    L8:
        e = move-exception;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " upgrade result  error = " + e.getMessage());
    }
}
