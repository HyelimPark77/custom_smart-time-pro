package com.sma.smartv3.p610ui.device;

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
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;
import com.sifli.siflidfu.DFUImagePath;
import com.sifli.siflidfu.ISifliDFUService;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeSActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareUpgradeSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,302:1\n15#2:303\n15#2:304\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSActivity\n*L\n209#1:303\n210#1:304\n*E\n"})
public final class FirmwareUpgradeSActivity extends BaseFirmwareUpgradeActivity {
    private boolean isBound;
    private int lastProgress;

    @tb1
    private SifliDFUService.SifliDFUBinder mBinder;

    @tb1
    private String mFilePath;

    @tb1
    private final FirmwareVersion mLatest;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @tb1
    private ISifliDFUService sifliDFUService;

    @aa1
    private final String TAG = "UpgradeS";

    @aa1
    private final Lazy localBroadcastReceiver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareUpgradeSActivity.localBroadcastReceiver_delegate$lambda$0(this.f3110IO);
        }
    });

    @aa1
    private final ServiceConnection serviceConnection = new OXO1();

    @aa1
    private final String mCurrent = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);

    public static final class OXO1 implements ServiceConnection {
        public OXO1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.X0O(name, "name");
            Intrinsics.X0O(service, "service");
            FirmwareUpgradeSActivity.this.mBinder = (SifliDFUService.SifliDFUBinder) service;
            FirmwareUpgradeSActivity firmwareUpgradeSActivity = FirmwareUpgradeSActivity.this;
            SifliDFUService.SifliDFUBinder sifliDFUBinder = firmwareUpgradeSActivity.mBinder;
            Intrinsics.XXI(sifliDFUBinder);
            firmwareUpgradeSActivity.sifliDFUService = sifliDFUBinder.getDfuService();
            FirmwareUpgradeSActivity.this.isBound = true;
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.this.TAG + " onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.X0O(name, "name");
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.this.TAG + " onServiceDisconnected");
            FirmwareUpgradeSActivity.this.isBound = false;
        }
    }

    public FirmwareUpgradeSActivity() {
        a01 a01Var = a01.OXO1;
        this.mLatest = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
    }

    private final BroadcastReceiver getLocalBroadcastReceiver() {
        return (BroadcastReceiver) this.localBroadcastReceiver$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirmwareUpgradeSActivity$localBroadcastReceiver$2$1 localBroadcastReceiver_delegate$lambda$0(FirmwareUpgradeSActivity firmwareUpgradeSActivity) {
        return new FirmwareUpgradeSActivity$localBroadcastReceiver$2$1(firmwareUpgradeSActivity);
    }

    private final void registerDfuLocalBroadcast() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(getLocalBroadcastReceiver(), intentFilter);
    }

    public final void checkFirmware() {
        if (!isAutoUpdate()) {
            FirmwareVersion firmwareVersion = this.mLatest;
            if (firmwareVersion != null) {
                getTvTip().setText(getString(R.string.preparing));
                ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
                download(firmwareVersion);
                return;
            }
            return;
        }
        FirmwareVersion firmwareVersion2 = this.mLatestFirmware;
        if (firmwareVersion2 != null) {
            getTvTip().setText(getString(R.string.preparing));
            ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
            download(firmwareVersion2);
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " isAutoUpdate = " + isAutoUpdate() + "  checkFirmware  mLatestFirmware = null ");
        finish();
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, "mLatestFirmware = null");
    }

    public final void download(@aa1 FirmwareVersion firmwareVersion) {
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download " + firmwareVersion);
        sz0 sz0Var = sz0.OXO1;
        this.mFilePath = uz0.XXI(sz0Var) + "/" + firmwareVersion.getFileName();
        NetWorkUtils.INSTANCE.download(firmwareVersion.getFileUrl(), uz0.XXI(sz0Var), firmwareVersion.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareUpgradeSActivity.download.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                FirmwareUpgradeSActivity.this.upgrade();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeSActivity.this.TAG + " download firmware error -> " + error);
                FirmwareUpgradeSActivity.this.getTvTip().setText(String.valueOf(FirmwareUpgradeSActivity.this.getString(R.string.request_error)));
                FirmwareUpgradeSActivity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        registerDfuLocalBroadcast();
        bindService(new Intent(this, (Class<?>) SifliDFUService.class), this.serviceConnection, 1);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (this.mLatest == null) {
            getTvLatest().setText(getString(R.string.v_s, this.mCurrent));
            ViewParent parent = getTvCurrent().getParent();
            Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(8);
            getProgressButton().setVisibility(8);
        } else {
            setMCurrentVersion(this.mCurrent);
            setMTargetVersion(this.mLatest.getVersion());
            getTvLatest().setText(getString(R.string.v_s, getMTargetVersion()));
            getTvCurrent().setText(getString(R.string.v_s, getMCurrentVersion()));
        }
        if (isAutoUpdate()) {
            checkFirmware();
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        checkFirmware();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.launch();
        LocalBroadcastManager.getInstance(getBaseContext()).unregisterReceiver(getLocalBroadcastReceiver());
        if (this.isBound) {
            unbindService(this.serviceConnection);
            this.isBound = false;
        }
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false)) {
            I01XX0.XIi00iiXO(b01.IiI10X, null, 2, null);
        }
        super.onDestroy();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted()) {
            return;
        }
        super.onHandleBackPressed();
    }

    public final void startOTA(@aa1 String zipFilePath, @aa1 String destDirPath) throws IOException {
        Intrinsics.X0O(zipFilePath, "zipFilePath");
        Intrinsics.X0O(destDirPath, "destDirPath");
        List<File> listUnzipFile = ZipUtils.unzipFile(zipFilePath, destDirPath);
        Intrinsics.XXI(listUnzipFile);
        ArrayList<DFUImagePath> arrayListOII = UtilsKt.OII(listUnzipFile);
        String mBleAddress = BleCache.INSTANCE.getMBleAddress();
        if (mBleAddress == null || mBleAddress.length() == 0) {
            mBleAddress = a01.OXO1.XIi00iiXO().getString(b01.XXX11i);
            Intrinsics.O10IXXX0X(mBleAddress, "getString(...)");
        } else {
            a01.OXO1.XIi00iiXO().put(b01.XXX11i, mBleAddress);
        }
        String str = mBleAddress;
        ISifliDFUService iSifliDFUService = this.sifliDFUService;
        Intrinsics.XXI(iSifliDFUService);
        iSifliDFUService.startActionDFUNorExt(this, str, arrayListOII, 1, 0);
        setMStarted(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " mStarted = " + getMStarted());
    }

    public final void upgrade() {
        String str = this.mFilePath;
        Intrinsics.XXI(str);
        if (!oe5.O0Ii(str, "zip", false, 2, null)) {
            ToastUtils.showLong("文件格式选择错误 请选择zip格式", new Object[0]);
            i1O0OXO1O.OXO1.OXO1(this.TAG + " upgrade result  mFilePath = " + this.mFilePath);
            return;
        }
        try {
            String str2 = this.mFilePath;
            Intrinsics.XXI(str2);
            startOTA(str2, uz0.XXI(sz0.OXO1));
        } catch (Exception e) {
            i1O0OXO1O.OXO1.OXO1(this.TAG + " upgrade result  error = " + e.getMessage());
        }
    }
}
