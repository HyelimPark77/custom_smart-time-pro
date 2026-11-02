package com.sma.smartv3.p610ui.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sifli.siflidfu.DFUImagePath;
import com.sifli.siflidfu.ISifliDFUService;
import com.sifli.siflidfu.SifliDFUService;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.FirmwareVersionLatest;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.device.FirmwareRepairSActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,243:1\n18#2,2:244\n15#2:246\n176#3,11:247\n196#3:266\n252#4,7:258\n270#4:265\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity\n*L\n51#1:244,2\n51#1:246\n162#1:247,11\n162#1:266\n162#1:258,7\n162#1:265\n*E\n"})
public final class FirmwareRepairSActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final String TAG = "RepairS";
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
        public OXO1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.X0O(name, "name");
            Intrinsics.X0O(service, "service");
            FirmwareRepairSActivity.this.mBinder = (SifliDFUService.SifliDFUBinder) service;
            FirmwareRepairSActivity firmwareRepairSActivity = FirmwareRepairSActivity.this;
            SifliDFUService.SifliDFUBinder sifliDFUBinder = firmwareRepairSActivity.mBinder;
            Intrinsics.XXI(sifliDFUBinder);
            firmwareRepairSActivity.sifliDFUService = sifliDFUBinder.getDfuService();
            FirmwareRepairSActivity.this.isBound = true;
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.this.TAG + " onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.X0O(name, "name");
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.this.TAG + " onServiceDisconnected");
            FirmwareRepairSActivity.this.isBound = false;
        }
    }

    public FirmwareRepairSActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(BleDeviceInfo.class.getName()), (Class<Object>) BleDeviceInfo.class);
        this.mDeviceInfo = (BleDeviceInfo) (objFromJson == null ? BleDeviceInfo.class.newInstance() : objFromJson);
        this.localBroadcastReceiver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOO101X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return FirmwareRepairSActivity.localBroadcastReceiver_delegate$lambda$0(this.f8097IO);
            }
        });
        this.serviceConnection = new OXO1();
    }

    private final BroadcastReceiver getLocalBroadcastReceiver() {
        return (BroadcastReceiver) this.localBroadcastReceiver$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirmwareRepairSActivity$localBroadcastReceiver$2$1 localBroadcastReceiver_delegate$lambda$0(FirmwareRepairSActivity firmwareRepairSActivity) {
        return new FirmwareRepairSActivity$localBroadcastReceiver$2$1(firmwareRepairSActivity);
    }

    private final void registerDfuLocalBroadcast() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(getLocalBroadcastReceiver(), intentFilter);
    }

    public final void checkFirmware() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.TAG + " Server -> " + UtilsKt.X0i1O());
        i1o0oxo1o.OXO1(this.TAG + " checkFirmware deviceInfo -> " + this.mDeviceInfo);
        getTvTip().setText(R.string.firmware_repair_download_tip);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> checkFirmwareVersionBody = RequestBodyKt.getCheckFirmwareVersionBody("0", "N", this.mDeviceInfo.getMBleName(), this.mDeviceInfo.getMFirmwareFlag());
        final O1XIiIO<FirmwareVersion> o1XIiIO = new O1XIiIO<FirmwareVersion>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairSActivity.checkFirmware.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(FirmwareVersion firmwareVersion) {
                if (firmwareVersion != null) {
                    FirmwareRepairSActivity firmwareRepairSActivity = FirmwareRepairSActivity.this;
                    firmwareRepairSActivity.getTvName().setText(firmwareVersion.getFileName());
                    firmwareRepairSActivity.getTvSize().setText(ConvertUtils.byte2FitMemorySize(firmwareVersion.getFileSize()));
                    firmwareRepairSActivity.download(firmwareVersion);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.this.TAG + " NetWorkUtils firmware error -> " + error);
                FirmwareRepairSActivity.this.getTvTip().setText(FirmwareRepairSActivity.this.getString(R.string.request_error));
                FirmwareRepairSActivity.this.setMStarted(false);
            }
        };
        final Activity mContext = getMContext();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(mContext, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + FirmwareVersionLatest.URL, checkFirmwareVersionBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> o1XIiIO2 = new O1XIiIO<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairSActivity$checkFirmware$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<FirmwareVersion> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = mContext;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkFirmwareVersionBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, FirmwareVersion.class), new ParsedRequestListener<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairSActivity$checkFirmware$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<FirmwareVersion> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void download(@aa1 FirmwareVersion firmwareVersion) {
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download " + firmwareVersion);
        sz0 sz0Var = sz0.OXO1;
        this.mFilePath = uz0.XXI(sz0Var) + "/" + firmwareVersion.getFileName();
        NetWorkUtils.INSTANCE.download(firmwareVersion.getFileUrl(), uz0.XXI(sz0Var), firmwareVersion.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairSActivity.download.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) throws IOException {
                FirmwareRepairSActivity.this.upgrade();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(FirmwareRepairSActivity.this.TAG + " download firmware error -> " + error);
                FirmwareRepairSActivity.this.getTvTip().setText(String.valueOf(FirmwareRepairSActivity.this.getString(R.string.request_error)));
                FirmwareRepairSActivity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        registerDfuLocalBroadcast();
        bindService(new Intent(this, (Class<?>) SifliDFUService.class), this.serviceConnection, 1);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        checkFirmware();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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

    @Override // com.bestmafen.androidbase.base.BaseActivity
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
        ISifliDFUService iSifliDFUService = this.sifliDFUService;
        Intrinsics.XXI(iSifliDFUService);
        iSifliDFUService.startActionDFUNorExt(this, BleCache.INSTANCE.getMBleAddress(), arrayListOII, 1, 0);
        setMStarted(true);
    }

    public final void upgrade() throws IOException {
        String str = this.mFilePath;
        Intrinsics.XXI(str);
        if (oe5.O0Ii(str, "zip", false, 2, null)) {
            String str2 = this.mFilePath;
            Intrinsics.XXI(str2);
            startOTA(str2, uz0.XXI(sz0.OXO1));
            return;
        }
        ToastUtils.showLong("文件格式选择错误 请选择zip格式", new Object[0]);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " upgrade result  mFilePath = " + this.mFilePath);
    }
}
