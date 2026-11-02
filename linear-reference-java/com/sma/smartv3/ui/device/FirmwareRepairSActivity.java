package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOO101X;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sifli.siflidfu.DFUImagePath;
import com.sifli.siflidfu.ISifliDFUService;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.FirmwareVersionLatest;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,243:1\n18#2,2:244\n15#2:246\n176#3,11:247\n196#3:266\n252#4,7:258\n270#4:265\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity\n*L\n51#1:244,2\n51#1:246\n162#1:247,11\n162#1:266\n162#1:258,7\n162#1:265\n*E\n"})
public final class FirmwareRepairSActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final String TAG;
    private boolean isBound;

    @aa1
    private final Lazy localBroadcastReceiver$delegate;

    @tb1
    private SifliDFUService.SifliDFUBinder mBinder;

    @aa1
    private final BleDeviceInfo mDeviceInfo;

    @tb1
    private String mFilePath;

    @aa1
    private final ServiceConnection serviceConnection;

    @tb1
    private ISifliDFUService sifliDFUService;

    public static final class OXO1 implements ServiceConnection {
        public final /* synthetic */ FirmwareRepairSActivity IO;

        public OXO1(FirmwareRepairSActivity r1) {
            this.IO = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName r2, IBinder r3) {
            Intrinsics.X0O(r2, "name");
            Intrinsics.X0O(r3, NotificationCompat.CATEGORY_SERVICE);
            FirmwareRepairSActivity.access$setMBinder$p(this.IO, (SifliDFUService.SifliDFUBinder) r3);
            FirmwareRepairSActivity r4 = this.IO;
            SifliDFUService.SifliDFUBinder r5 = FirmwareRepairSActivity.access$getMBinder$p(r4);
            Intrinsics.XXI(r5);
            FirmwareRepairSActivity.access$setSifliDFUService$p(r4, r5.getDfuService());
            FirmwareRepairSActivity.access$setBound$p(this.IO, true);
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.access$getTAG$p(this.IO) + " onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r3) {
            Intrinsics.X0O(r3, "name");
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.access$getTAG$p(this.IO) + " onServiceDisconnected");
            FirmwareRepairSActivity.access$setBound$p(this.IO, false);
        }
    }

    public FirmwareRepairSActivity() {
        this.TAG = "RepairS";
        SPUtils r0 = a01.OXO1.XO0O10();
        Object r1 = new Gson().fromJson(r0.getString(BleDeviceInfo.class.getName()), BleDeviceInfo.class);
        if (r1 != null) goto L5;
        r1 = BleDeviceInfo.class.newInstance();
    L5:
        this.mDeviceInfo = (BleDeviceInfo) r1;
        this.localBroadcastReceiver$delegate = LazyKt__LazyJVMKt.iO(new iOO101X(this));
        this.serviceConnection = new OXO1(this);
    }

    public static /* synthetic */ FirmwareRepairSActivity$localBroadcastReceiver$2$1 O10IXXX0X(FirmwareRepairSActivity r0) {
        return localBroadcastReceiver_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ SifliDFUService.SifliDFUBinder access$getMBinder$p(FirmwareRepairSActivity r0) {
        return r0.mBinder;
    }

    public static final /* synthetic */ String access$getTAG$p(FirmwareRepairSActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setBound$p(FirmwareRepairSActivity r0, boolean r1) {
        r0.isBound = r1;
    }

    public static final /* synthetic */ void access$setMBinder$p(FirmwareRepairSActivity r0, SifliDFUService.SifliDFUBinder r1) {
        r0.mBinder = r1;
    }

    public static final /* synthetic */ void access$setSifliDFUService$p(FirmwareRepairSActivity r0, ISifliDFUService r1) {
        r0.sifliDFUService = r1;
    }

    private final BroadcastReceiver getLocalBroadcastReceiver() {
        return (BroadcastReceiver) getValue();
    }

    private static final FirmwareRepairSActivity$localBroadcastReceiver$2$1 localBroadcastReceiver_delegate$lambda$0(FirmwareRepairSActivity r1) {
        return new FirmwareRepairSActivity$localBroadcastReceiver$2$1(r1);
    }

    private final void registerDfuLocalBroadcast() {
        IntentFilter r0 = new IntentFilter();
        r0.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        r0.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        r0.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(getLocalBroadcastReceiver(), r0);
    }

    public final void checkFirmware() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " Server -> " + UtilsKt.X0i1O());
        r0.OXO1(this.TAG + " checkFirmware deviceInfo -> " + this.mDeviceInfo);
        getTvTip().setText(R.string.firmware_repair_download_tip);
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getCheckFirmwareVersionBody("0", "N", this.mDeviceInfo.getMBleName(), this.mDeviceInfo.getMFirmwareFlag());
        final O1XIiIO<FirmwareVersion> r3 = new AnonymousClass1(this);
        final Activity r4 = getMContext();
        final uq r5 = r1.loadPopup(r4, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        r1.printParam(r6 + FirmwareVersionLatest.URL, r2);
        NetWork r7 = NetWork.OXO1;
        String r8 = r6 + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> r9 = new FirmwareRepairSActivity$checkFirmware$$inlined$post$default$1(r4, r3, r5);
        AndroidNetworking.post(r8).addBodyParameter(r2).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{FirmwareVersion.class}), new FirmwareRepairSActivity$checkFirmware$$inlined$post$default$2(r9));
    }

    public final void download(@aa1 FirmwareVersion r5) {
        Intrinsics.X0O(r5, "firmwareVersion");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download " + r5);
        sz0 r0 = sz0.OXO1;
        this.mFilePath = uz0.XXI(r0) + "/" + r5.getFileName();
        NetWorkUtils.INSTANCE.download(r5.getFileUrl(), uz0.XXI(r0), r5.getFileName(), new C34471(this));
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        registerDfuLocalBroadcast();
        bindService(new Intent(this, SifliDFUService.class), this.serviceConnection, 1);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        checkFirmware();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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

    @Override // com.bestmafen.androidbase.base.BaseActivity
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
        ISifliDFUService r0 = this.sifliDFUService;
        Intrinsics.XXI(r0);
        r0.startActionDFUNorExt(this, BleCache.INSTANCE.getMBleAddress(), r3, 1, 0);
        setMStarted(true);
    }

    public final void upgrade() {
        String r0 = this.mFilePath;
        Intrinsics.XXI(r0);
        if (oe5.O0Ii(r0, "zip", false, 2, null) == true) goto L6;
        ToastUtils.showLong("文件格式选择错误 请选择zip格式", new Object[0]);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " upgrade result  mFilePath = " + this.mFilePath);
        return;
    L6:
        String r1 = this.mFilePath;
        Intrinsics.XXI(r1);
        startOTA(r1, uz0.XXI(sz0.OXO1));
    }
}
