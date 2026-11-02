package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sc;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
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
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,275:1\n18#2,2:276\n15#2:278\n27#2,2:279\n176#3,11:281\n196#3:300\n252#4,7:292\n270#4:299\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n*L\n51#1:276,2\n51#1:278\n122#1:279,2\n193#1:281,11\n193#1:300\n193#1:292,7\n193#1:299\n*E\n"})
public final class FirmwareRepairJActivity extends BaseFirmwareRepairActivity {

    @aa1
    private final String TAG;

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
    private OTAStatus mOTAStatus;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[OTAStatus.values().length];
            r0[OTAStatus.UPGRADE_SCANNING_TIMEOUT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r0[OTAStatus.UPGRADE_FAILED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r0[OTAStatus.UPGRADE_PREPARE_FAILED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO extends BluetoothEventListener {
        public final /* synthetic */ FirmwareRepairJActivity OXO1;

        public XIi00iiXO(FirmwareRepairJActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onAdapterStatus(boolean r3) {
            LogUtils.d(new Object[]{FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " bt onAdapterStatus -> " + r3});
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice r6, int r7) {
            Intrinsics.X0O(r6, "device");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = FirmwareRepairJActivity.access$getTAG$p(this.OXO1);
            OTAStatus r2 = FirmwareRepairJActivity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r3 = FirmwareRepairJActivity.access$getMOTAManager$p(this.OXO1);
            if (r3 == null) goto L5;
            Boolean r4 = Boolean.valueOf(r3.isOTA());
        L6:
            r0.OXO1(r1 + " bt onConnection -> mOTAStatus = " + r2 + ", " + r6 + ", status = " + r7 + " ,isOTA = " + r4);
            if (r7 != 0) goto L12;
            r0.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " bt onConnection -> device disconnected");
            if (FirmwareRepairJActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L13;
            FirmwareRepairJActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED);
            return;
        L13:
            return;
        L12:
            return;
        L5:
            r4 = null;
            goto L6
        }
    }

    @SourceDebugExtension({"SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,275:1\n27#2,2:276\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n*L\n158#1:276,2\n*E\n"})
    public static final class XO0O10 implements IUpgradeCallback {
        public final /* synthetic */ FirmwareRepairJActivity OXO1;

        public XO0O10(FirmwareRepairJActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " ota cancel");
            FirmwareRepairJActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError r5) {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " onError -> status = " + FirmwareRepairJActivity.access$getMOTAStatus$p(this.OXO1) + ", error = " + r5);
            FirmwareRepairJActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED);
            if (r5 == null) goto L5;
            String r6 = r5.getMessage();
        L6:
            ToastUtils.showLong(r6, new Object[0]);
            return;
        L5:
            r6 = null;
            goto L6
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String r4, boolean r5) {
            Intrinsics.X0O(r4, "addr");
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " onNeedReconnect -> " + r4 + ", " + r5);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int r4, float r5) {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " ota p -> " + r4 + ", " + r5);
            if (r4 != 0) goto L5;
            FirmwareRepairJActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADE_CHECKING);
            this.OXO1.getTvTip().setText(this.OXO1.getString(R.string.check_file));
        L6:
            this.OXO1.getDfuProgress().setProgress(Math.round(r5) / 100.0f);
            return;
        L5:
            FirmwareRepairJActivity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADEING);
            this.OXO1.getTvTip().setText(this.OXO1.getString(R.string.starting));
            goto L6
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " ota start");
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
            FirmwareRepairJActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_START);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            i1O0OXO1O.OXO1.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " ota stop! upgrade is ok");
            FirmwareRepairJActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_STOP);
            a01 r0 = a01.OXO1;
            r0.XIi00iiXO().put(b01.IiI10X, false);
            ToastUtils.showLong(R.string.repair_successful);
            UpgradeFailedDeviceData.INSTANCE.delete(FirmwareRepairJActivity.access$getMDeviceInfo$p(this.OXO1));
            r0.XIi00iiXO().remove(FirmwareVersion.class.getName());
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            this.OXO1.finish();
        }
    }

    @SourceDebugExtension({"SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$mOTAEventCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"})
    public static final class iO extends BtEventCallback {
        public final /* synthetic */ FirmwareRepairJActivity OXO1;

        public iO(FirmwareRepairJActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
        public void onConnection(BluetoothDevice r6, int r7) {
            Intrinsics.X0O(r6, "device");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = FirmwareRepairJActivity.access$getTAG$p(this.OXO1);
            OTAStatus r2 = FirmwareRepairJActivity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r3 = FirmwareRepairJActivity.access$getMOTAManager$p(this.OXO1);
            if (r3 == null) goto L5;
            Boolean r4 = Boolean.valueOf(r3.isOTA());
        L6:
            r0.OXO1(r1 + " ota onConnection -> mOTAStatus = " + r2 + ", " + r6 + " ,status = " + r7 + " ,isOTA = " + r4);
            OTAManager r8 = FirmwareRepairJActivity.access$getMOTAManager$p(this.OXO1);
            Intrinsics.XXI(r8);
            if (r8.isOTA() == true) goto L22;
            if (r7 != 0) goto L10;
            r0.OXO1(FirmwareRepairJActivity.access$getTAG$p(this.OXO1) + " ota onConnection -> device disconnected");
            if (FirmwareRepairJActivity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L25;
            FirmwareRepairJActivity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED);
            return;
        L25:
            return;
        L10:
            if (r7 != 1) goto L26;
            FirmwareRepairJActivity r9 = this.OXO1;
            if (FirmwareRepairJActivity.access$canOTA(r9, FirmwareRepairJActivity.access$getMOTAStatus$p(r9)) == false) goto L23;
            String r10 = FirmwareRepairJActivity.access$getMFilePath$p(this.OXO1);
            if (r10 == null) goto L24;
            this.OXO1.startOTA(r10);
            return;
        L24:
            return;
        L23:
            return;
        L26:
            return;
        L22:
            return;
        L5:
            r4 = null;
            goto L6
        }
    }

    public FirmwareRepairJActivity() {
        this.TAG = "RepairJ";
        this.mOTAStatus = OTAStatus.NONE;
        SPUtils r0 = a01.OXO1.XO0O10();
        Object r1 = new Gson().fromJson(r0.getString(BleDeviceInfo.class.getName()), BleDeviceInfo.class);
        if (r1 != null) goto L5;
        r1 = BleDeviceInfo.class.newInstance();
    L5:
        BleDeviceInfo r2 = (BleDeviceInfo) r1;
        this.mDeviceInfo = r2;
        this.mAddress = UtilsKt.I1(r2.getMBleAddress());
        this.mBluetoothHelper = BluetoothHelper.getInstance(Utils.getApp());
        this.mBtEventListener = new XIi00iiXO(this);
        this.mOTAEventCallback = new iO(this);
    }

    public static final /* synthetic */ boolean access$canOTA(FirmwareRepairJActivity r0, OTAStatus r1) {
        return r0.canOTA(r1);
    }

    public static final /* synthetic */ BleDeviceInfo access$getMDeviceInfo$p(FirmwareRepairJActivity r0) {
        return r0.mDeviceInfo;
    }

    public static final /* synthetic */ String access$getMFilePath$p(FirmwareRepairJActivity r0) {
        return r0.mFilePath;
    }

    public static final /* synthetic */ OTAManager access$getMOTAManager$p(FirmwareRepairJActivity r0) {
        return r0.mOTAManager;
    }

    public static final /* synthetic */ OTAStatus access$getMOTAStatus$p(FirmwareRepairJActivity r0) {
        return r0.mOTAStatus;
    }

    public static final /* synthetic */ String access$getTAG$p(FirmwareRepairJActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setMOTAStatus$p(FirmwareRepairJActivity r0, OTAStatus r1) {
        r0.mOTAStatus = r1;
    }

    public static final /* synthetic */ void access$updateUpgradeStatus(FirmwareRepairJActivity r0, OTAStatus r1) {
        r0.updateUpgradeStatus(r1);
    }

    private final boolean canOTA(OTAStatus r2) {
        if (isOTAError(r2) == false) goto L5;
        return false;
    L5:
        if (r2 == OTAStatus.UPGRADE_STOP) goto L10;
        return true;
    L10:
        return false;
    }

    private final void destroyOTA() {
        OTAManager r0 = this.mOTAManager;
        if (r0 == null) goto L5;
        r0.unregisterBluetoothCallback(this.mOTAEventCallback);
    L5:
        OTAManager r1 = this.mOTAManager;
        if (r1 == null) goto L8;
        r1.release();
    L8:
        this.mOTAManager = null;
    }

    private final void initOTA() {
        OTAManager r0 = new OTAManager(this);
        this.mOTAManager = r0;
        r0.registerBluetoothCallback(this.mOTAEventCallback);
    }

    private final boolean isOTAError(OTAStatus r3) {
        int r4 = OXO1.OXO1[r3.ordinal()];
        if (r4 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r4 == 2) goto L10;
        if (r4 == 3) goto L10;
        return false;
    }

    private final void updateUpgradeStatus(OTAStatus r4) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " updateUpgradeStatus status -> " + r4);
        this.mOTAStatus = r4;
        if (isOTAError(r4) == false) goto L6;
        setMStarted(false);
        getTvTip().setText(getString(R.string.firmware_upgrading_failed));
        return;
    L6:
        setMStarted(true);
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
        final O1XIiIO<Response<FirmwareVersion>> r9 = new FirmwareRepairJActivity$checkFirmware$$inlined$post$default$1(r4, r3, r5);
        AndroidNetworking.post(r8).addBodyParameter(r2).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{FirmwareVersion.class}), new FirmwareRepairJActivity$checkFirmware$$inlined$post$default$2(r9));
    }

    public final void connectDevice(@aa1 String r4) {
        Intrinsics.X0O(r4, "address");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " connectDevice -> " + r4);
        BluetoothHelper r0 = this.mBluetoothHelper;
        BluetoothAdapter r1 = BluetoothAdapter.getDefaultAdapter();
        if (r1 == null) goto L5;
        BluetoothDevice r5 = r1.getRemoteDevice(r4);
    L6:
        r0.connectDevice(r5);
        return;
    L5:
        r5 = null;
        goto L6
    }

    public final void download(@aa1 FirmwareVersion r5) {
        Intrinsics.X0O(r5, "firmwareVersion");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download " + r5);
        sz0 r0 = sz0.OXO1;
        this.mFilePath = uz0.XXI(r0) + "/" + r5.getFileName();
        NetWorkUtils.INSTANCE.download(r5.getFileUrl(), uz0.XXI(r0), r5.getFileName(), new C34451(this));
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.closeConnection(true);
        sc.XIi00iiXO(this);
        this.mBluetoothHelper.addBluetoothEventListener(this.mBtEventListener);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (TextUtils.isEmpty(getMArg0()) == true) goto L5;
        String r0 = getMArg0();
        Intrinsics.XXI(r0);
        this.mAddress = r0;
    L5:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " mAddress -> " + this.mAddress);
        checkFirmware();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMStarted(true);
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareRepairActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
        if (getMStarted() == false) goto L5;
        return;
    L5:
        super.onHandleBackPressed();
    }

    public final void startOTA(@aa1 String r4) {
        Intrinsics.X0O(r4, Y5.c.c);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA -> " + r4);
        OTAManager r0 = this.mOTAManager;
        if (r0 == null) goto L7;
        BluetoothOTAConfigure r1 = r0.getBluetoothOption();
        if (r1 == null) goto L7;
        r1.setFirmwareFilePath(r4);
    L7:
        OTAManager r5 = this.mOTAManager;
        if (r5 == null) goto L11;
        r5.startOTA(new XO0O10(this));
        return;
    }

    public final void upgrade() {
        destroyOTA();
        initOTA();
        updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
        connectDevice(this.mAddress);
    }
}
