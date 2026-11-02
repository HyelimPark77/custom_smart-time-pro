package com.sma.smartv3.p610ui.device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C2916sc;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.UpgradeFailedDeviceData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.FirmwareVersionLatest;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,275:1\n18#2,2:276\n15#2:278\n27#2,2:279\n176#3,11:281\n196#3:300\n252#4,7:292\n270#4:299\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n*L\n51#1:276,2\n51#1:278\n122#1:279,2\n193#1:281,11\n193#1:300\n193#1:292,7\n193#1:299\n*E\n"})
public final class FirmwareRepairJActivity extends BaseFirmwareRepairActivity {

    @aa1
    private String mAddress;
    private final BluetoothHelper mBluetoothHelper;

    @aa1
    private final XIi00iiXO mBtEventListener;

    @aa1
    private final BleDeviceInfo mDeviceInfo;

    @tb1
    private String mFilePath;

    @aa1
    private final BtEventCallback mOTAEventCallback;

    @tb1
    private OTAManager mOTAManager;

    @aa1
    private final String TAG = "RepairJ";

    @aa1
    private OTAStatus mOTAStatus = OTAStatus.NONE;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[OTAStatus.values().length];
            try {
                iArr[OTAStatus.UPGRADE_SCANNING_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OTAStatus.UPGRADE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OTAStatus.UPGRADE_PREPARE_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO extends BluetoothEventListener {
        public XIi00iiXO() {
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onAdapterStatus(boolean z) {
            LogUtils.m11128d(FirmwareRepairJActivity.this.TAG + " bt onAdapterStatus -> " + z);
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice device, int i) {
            Intrinsics.X0O(device, "device");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = FirmwareRepairJActivity.this.TAG;
            OTAStatus oTAStatus = FirmwareRepairJActivity.this.mOTAStatus;
            OTAManager oTAManager = FirmwareRepairJActivity.this.mOTAManager;
            i1o0oxo1o.OXO1(str + " bt onConnection -> mOTAStatus = " + oTAStatus + ", " + device + ", status = " + i + " ,isOTA = " + (oTAManager != null ? Boolean.valueOf(oTAManager.isOTA()) : null));
            if (i == 0) {
                i1o0oxo1o.OXO1(FirmwareRepairJActivity.this.TAG + " bt onConnection -> device disconnected");
                if (FirmwareRepairJActivity.this.mOTAStatus == OTAStatus.UPGRADE_PREPARE) {
                    FirmwareRepairJActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE_FAILED);
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,275:1\n27#2,2:276\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n*L\n158#1:276,2\n*E\n"})
    public static final class XO0O10 implements IUpgradeCallback {
        public XO0O10() {
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " ota cancel");
            FirmwareRepairJActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError baseError) {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " onError -> status = " + FirmwareRepairJActivity.this.mOTAStatus + ", error = " + baseError);
            FirmwareRepairJActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_FAILED);
            ToastUtils.showLong(baseError != null ? baseError.getMessage() : null, new Object[0]);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String addr, boolean z) {
            Intrinsics.X0O(addr, "addr");
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " onNeedReconnect -> " + addr + ", " + z);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int i, float f) {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " ota p -> " + i + ", " + f);
            if (i == 0) {
                FirmwareRepairJActivity.this.mOTAStatus = OTAStatus.UPGRADE_CHECKING;
                FirmwareRepairJActivity.this.getTvTip().setText(FirmwareRepairJActivity.this.getString(R.string.check_file));
            } else {
                FirmwareRepairJActivity.this.mOTAStatus = OTAStatus.UPGRADEING;
                FirmwareRepairJActivity.this.getTvTip().setText(FirmwareRepairJActivity.this.getString(R.string.starting));
            }
            FirmwareRepairJActivity.this.getDfuProgress().setProgress(Math.round(f) / 100.0f);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " ota start");
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
            FirmwareRepairJActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_START);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " ota stop! upgrade is ok");
            FirmwareRepairJActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_STOP);
            a01 a01Var = a01.OXO1;
            a01Var.XIi00iiXO().put(b01.IiI10X, false);
            ToastUtils.showLong(R.string.repair_successful);
            UpgradeFailedDeviceData.INSTANCE.delete(FirmwareRepairJActivity.this.mDeviceInfo);
            a01Var.XIi00iiXO().remove(FirmwareVersion.class.getName());
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            FirmwareRepairJActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.FirmwareRepairJActivity$iO */
    @SourceDebugExtension({"SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$mOTAEventCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"})
    public static final class C18704iO extends BtEventCallback {
        public C18704iO() {
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
        public void onConnection(BluetoothDevice device, int i) {
            String str;
            Intrinsics.X0O(device, "device");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str2 = FirmwareRepairJActivity.this.TAG;
            OTAStatus oTAStatus = FirmwareRepairJActivity.this.mOTAStatus;
            OTAManager oTAManager = FirmwareRepairJActivity.this.mOTAManager;
            i1o0oxo1o.OXO1(str2 + " ota onConnection -> mOTAStatus = " + oTAStatus + ", " + device + " ,status = " + i + " ,isOTA = " + (oTAManager != null ? Boolean.valueOf(oTAManager.isOTA()) : null));
            OTAManager oTAManager2 = FirmwareRepairJActivity.this.mOTAManager;
            Intrinsics.XXI(oTAManager2);
            if (oTAManager2.isOTA()) {
                return;
            }
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                FirmwareRepairJActivity firmwareRepairJActivity = FirmwareRepairJActivity.this;
                if (!firmwareRepairJActivity.canOTA(firmwareRepairJActivity.mOTAStatus) || (str = FirmwareRepairJActivity.this.mFilePath) == null) {
                    return;
                }
                FirmwareRepairJActivity.this.startOTA(str);
                return;
            }
            i1o0oxo1o.OXO1(FirmwareRepairJActivity.this.TAG + " ota onConnection -> device disconnected");
            if (FirmwareRepairJActivity.this.mOTAStatus == OTAStatus.UPGRADE_PREPARE) {
                FirmwareRepairJActivity.this.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE_FAILED);
            }
        }
    }

    public FirmwareRepairJActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(BleDeviceInfo.class.getName()), (Class<Object>) BleDeviceInfo.class);
        BleDeviceInfo bleDeviceInfo = (BleDeviceInfo) (objFromJson == null ? BleDeviceInfo.class.newInstance() : objFromJson);
        this.mDeviceInfo = bleDeviceInfo;
        this.mAddress = UtilsKt.m38841I1(bleDeviceInfo.getMBleAddress());
        this.mBluetoothHelper = BluetoothHelper.getInstance(Utils.getApp());
        this.mBtEventListener = new XIi00iiXO();
        this.mOTAEventCallback = new C18704iO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canOTA(OTAStatus oTAStatus) {
        return (isOTAError(oTAStatus) || oTAStatus == OTAStatus.UPGRADE_STOP) ? false : true;
    }

    private final void destroyOTA() {
        OTAManager oTAManager = this.mOTAManager;
        if (oTAManager != null) {
            oTAManager.unregisterBluetoothCallback(this.mOTAEventCallback);
        }
        OTAManager oTAManager2 = this.mOTAManager;
        if (oTAManager2 != null) {
            oTAManager2.release();
        }
        this.mOTAManager = null;
    }

    private final void initOTA() {
        OTAManager oTAManager = new OTAManager(this);
        this.mOTAManager = oTAManager;
        oTAManager.registerBluetoothCallback(this.mOTAEventCallback);
    }

    private final boolean isOTAError(OTAStatus oTAStatus) {
        int i = OXO1.OXO1[oTAStatus.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUpgradeStatus(OTAStatus oTAStatus) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " updateUpgradeStatus status -> " + oTAStatus);
        this.mOTAStatus = oTAStatus;
        if (!isOTAError(oTAStatus)) {
            setMStarted(true);
        } else {
            setMStarted(false);
            getTvTip().setText(getString(R.string.firmware_upgrading_failed));
        }
    }

    public final void checkFirmware() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.TAG + " Server -> " + UtilsKt.X0i1O());
        i1o0oxo1o.OXO1(this.TAG + " checkFirmware deviceInfo -> " + this.mDeviceInfo);
        getTvTip().setText(R.string.firmware_repair_download_tip);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> checkFirmwareVersionBody = RequestBodyKt.getCheckFirmwareVersionBody("0", "N", this.mDeviceInfo.getMBleName(), this.mDeviceInfo.getMFirmwareFlag());
        final O1XIiIO<FirmwareVersion> o1XIiIO = new O1XIiIO<FirmwareVersion>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairJActivity.checkFirmware.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(FirmwareVersion firmwareVersion) {
                if (firmwareVersion != null) {
                    FirmwareRepairJActivity firmwareRepairJActivity = FirmwareRepairJActivity.this;
                    firmwareRepairJActivity.getTvName().setText(firmwareVersion.getFileName());
                    firmwareRepairJActivity.getTvSize().setText(ConvertUtils.byte2FitMemorySize(firmwareVersion.getFileSize()));
                    firmwareRepairJActivity.download(firmwareVersion);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                FirmwareRepairJActivity.this.setMStarted(false);
            }
        };
        final Activity mContext = getMContext();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(mContext, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + FirmwareVersionLatest.URL, checkFirmwareVersionBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> o1XIiIO2 = new O1XIiIO<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairJActivity$checkFirmware$$inlined$post$default$1
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkFirmwareVersionBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, FirmwareVersion.class), new ParsedRequestListener<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairJActivity$checkFirmware$$inlined$post$default$2
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

    public final void connectDevice(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " connectDevice -> " + address);
        BluetoothHelper bluetoothHelper = this.mBluetoothHelper;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        bluetoothHelper.connectDevice(defaultAdapter != null ? defaultAdapter.getRemoteDevice(address) : null);
    }

    public final void download(@aa1 FirmwareVersion firmwareVersion) {
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download " + firmwareVersion);
        sz0 sz0Var = sz0.OXO1;
        this.mFilePath = uz0.XXI(sz0Var) + "/" + firmwareVersion.getFileName();
        NetWorkUtils.INSTANCE.download(firmwareVersion.getFileUrl(), uz0.XXI(sz0Var), firmwareVersion.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairJActivity.download.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                FirmwareRepairJActivity.this.upgrade();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.this.TAG + " download firmware error -> " + error);
                FirmwareRepairJActivity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.closeConnection(true);
        C2916sc.XIi00iiXO(this);
        this.mBluetoothHelper.addBluetoothEventListener(this.mBtEventListener);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (!TextUtils.isEmpty(getMArg0())) {
            String mArg0 = getMArg0();
            Intrinsics.XXI(mArg0);
            this.mAddress = mArg0;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " mAddress -> " + this.mAddress);
        checkFirmware();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        a01.OXO1.XO0O10().remove(BleDeviceInfo.class.getName());
        this.mBluetoothHelper.removeBluetoothEventListener(this.mBtEventListener);
        this.mBluetoothHelper.destroy();
        destroyOTA();
        BleConnector.INSTANCE.launch();
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted()) {
            return;
        }
        super.onHandleBackPressed();
    }

    public final void startOTA(@aa1 String filePath) {
        BluetoothOTAConfigure bluetoothOption;
        Intrinsics.X0O(filePath, "filePath");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA -> " + filePath);
        OTAManager oTAManager = this.mOTAManager;
        if (oTAManager != null && (bluetoothOption = oTAManager.getBluetoothOption()) != null) {
            bluetoothOption.setFirmwareFilePath(filePath);
        }
        OTAManager oTAManager2 = this.mOTAManager;
        if (oTAManager2 != null) {
            oTAManager2.startOTA(new XO0O10());
        }
    }

    public final void upgrade() {
        destroyOTA();
        initOTA();
        updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
        connectDevice(this.mAddress);
    }
}
