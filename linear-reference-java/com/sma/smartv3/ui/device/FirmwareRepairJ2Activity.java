package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I001OO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sc;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.ironsource.Y5;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.UpgradeFailedDeviceData;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairJ2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJ2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJ2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,297:1\n18#2,2:298\n15#2:300\n15#2:301\n27#2,2:302\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJ2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJ2Activity\n*L\n45#1:298,2\n45#1:300\n49#1:301\n129#1:302,2\n*E\n"})
public final class FirmwareRepairJ2Activity extends BaseFirmwareRepairActivity {
    private boolean isUseDfuAddress;
    private final BluetoothHelper mBluetoothHelper;

    @aa1
    private final XIi00iiXO mBtEventListener;

    @aa1
    private final BleDeviceInfo mDeviceInfo;

    @aa1
    private String mDfuAddress;
    private int mDownloaded;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @aa1
    private final BtEventCallback mOTAEventCallback;

    @tb1
    private OTAManager mOTAManager;

    @aa1
    private OTAStatus mOTAStatus;
    private int mStepsIndex;

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
        public final /* synthetic */ FirmwareRepairJ2Activity OXO1;

        public XIi00iiXO(FirmwareRepairJ2Activity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onAdapterStatus(boolean r3) {
            LogUtils.d(new Object[]{"bt onAdapterStatus " + r3});
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice r5, int r6) {
            Intrinsics.X0O(r5, "device");
            OTAStatus r0 = FirmwareRepairJ2Activity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r1 = FirmwareRepairJ2Activity.access$getMOTAManager$p(this.OXO1);
            if (r1 == null) goto L5;
            Boolean r2 = Boolean.valueOf(r1.isOTA());
        L6:
            LogUtils.d(new Object[]{"bt onConnection -> mOTAStatus = " + r0 + ", " + r5 + " ,status = " + r6 + " ,isOTA = " + r2});
            if (r6 != 0) goto L16;
            LogUtils.d(new Object[]{"bt onConnection -> device disconnected"});
            if (FirmwareRepairJ2Activity.access$getMOTAStatus$p(this.OXO1) == OTAStatus.UPGRADE_PREPARE) goto L11;
            return;
        L11:
            if (FirmwareRepairJ2Activity.access$getMStepsIndex$p(this.OXO1) != 0) goto L14;
            LogUtils.d(new Object[]{"bt onConnection -> try ble Address"});
            FirmwareRepairJ2Activity r7 = this.OXO1;
            r7.connectDevice(FirmwareRepairJ2Activity.access$getMDeviceInfo$p(r7).getMBleAddress());
            return;
        L14:
            FirmwareRepairJ2Activity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED);
            return;
        L16:
            return;
        L5:
            r2 = null;
            goto L6
        }
    }

    public static final class XO0O10 implements IUpgradeCallback {
        public final /* synthetic */ FirmwareRepairJ2Activity OXO1;

        public XO0O10(FirmwareRepairJ2Activity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(FirmwareRepairJ2Activity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(FirmwareRepairJ2Activity r0) {
            r0.upgrade();
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            LogUtils.d(new Object[]{"onCancelOTA"});
            FirmwareRepairJ2Activity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError r3) {
            LogUtils.d(new Object[]{"onError -> " + r3});
            FirmwareRepairJ2Activity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_FAILED);
            if (r3 == null) goto L5;
            String r4 = r3.getMessage();
        L6:
            ToastUtils.showLong(r4, new Object[0]);
            return;
        L5:
            r4 = null;
            goto L6
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String r3, boolean r4) {
            LogUtils.d(new Object[]{"onNeedReconnect : " + r3 + ", " + r4});
            FirmwareRepairJ2Activity.access$setUseDfuAddress$p(this.OXO1, true);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int r3, float r4) {
            if (r3 != 0) goto L4;
            FirmwareRepairJ2Activity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADE_CHECKING);
            this.OXO1.getTvTip().setText(this.OXO1.getString(R.string.check_file));
        L5:
            this.OXO1.getDfuProgress().setProgress(Math.round(r4) / 100.0f);
            return;
        L4:
            FirmwareRepairJ2Activity.access$setMOTAStatus$p(this.OXO1, OTAStatus.UPGRADEING);
            this.OXO1.getTvTip().setText(this.OXO1.getString(R.string.starting));
            goto L5
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            LogUtils.d(new Object[]{"onStartOTA"});
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
            FirmwareRepairJ2Activity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_START);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            FirmwareRepairJ2Activity.access$setUseDfuAddress$p(this.OXO1, false);
            LogUtils.d(new Object[]{"onStopOTA() upgrade ok " + FirmwareRepairJ2Activity.access$getMStepsIndex$p(this.OXO1)});
            FirmwareRepairJ2Activity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_STOP);
            if (FirmwareRepairJ2Activity.access$getMStepsIndex$p(this.OXO1) != 0) goto L6;
            this.OXO1.getDfuProgress().setProgress(0.0f);
            FirmwareRepairJ2Activity.access$setMStepsIndex$p(this.OXO1, FirmwareRepairJ2Activity.access$getMStepsIndex$p(this.OXO1) + 1);
            TextView r0 = this.OXO1.getTvTip();
            final FirmwareRepairJ2Activity r1 = this.OXO1;
            r0.postDelayed(new I001OO(r1), 5000);
            return;
        L6:
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
            ToastUtils.showLong(R.string.repair_successful);
            UpgradeFailedDeviceData.INSTANCE.delete(FirmwareRepairJ2Activity.access$getMDeviceInfo$p(this.OXO1));
            this.OXO1.finish();
        }
    }

    public static final class iO extends BtEventCallback {
        public final /* synthetic */ FirmwareRepairJ2Activity OXO1;

        public iO(FirmwareRepairJ2Activity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
        public void onConnection(BluetoothDevice r5, int r6) {
            Intrinsics.X0O(r5, "device");
            OTAStatus r0 = FirmwareRepairJ2Activity.access$getMOTAStatus$p(this.OXO1);
            OTAManager r1 = FirmwareRepairJ2Activity.access$getMOTAManager$p(this.OXO1);
            if (r1 == null) goto L5;
            Boolean r2 = Boolean.valueOf(r1.isOTA());
        L6:
            LogUtils.d(new Object[]{"ota onConnection -> mOTAStatus = " + r0 + ", " + r5 + " ,status = " + r6 + " ,isOTA = " + r2});
            OTAManager r7 = FirmwareRepairJ2Activity.access$getMOTAManager$p(this.OXO1);
            Intrinsics.XXI(r7);
            if (r7.isOTA() == true) goto L24;
            if (r6 != 0) goto L10;
            LogUtils.d(new Object[]{"ota onConnection -> device disconnected"});
            if (FirmwareRepairJ2Activity.access$getMOTAStatus$p(this.OXO1) != OTAStatus.UPGRADE_PREPARE) goto L26;
            FirmwareRepairJ2Activity.access$updateUpgradeStatus(this.OXO1, OTAStatus.UPGRADE_PREPARE_FAILED);
            return;
        L26:
            return;
        L10:
            if (r6 != 1) goto L27;
            FirmwareRepairJ2Activity r8 = this.OXO1;
            if (FirmwareRepairJ2Activity.access$canOTA(r8, FirmwareRepairJ2Activity.access$getMOTAStatus$p(r8)) == true) goto L15;
            return;
        L15:
            if (FirmwareRepairJ2Activity.access$getMStepsIndex$p(this.OXO1) != 0) goto L18;
            FirmwareRepairJ2Activity r9 = this.OXO1;
            File r3 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r4 = FirmwareRepairJ2Activity.access$getMLatestFirmware$p(this.OXO1);
            Intrinsics.XXI(r4);
            String r10 = new File(r3, r4.getFileName()).getAbsolutePath();
            Intrinsics.O10IXXX0X(r10, "getAbsolutePath(...)");
            r9.startOTA(r10);
            return;
        L18:
            FirmwareRepairJ2Activity r11 = this.OXO1;
            File r12 = uz0.I0iXXO(sz0.OXO1);
            FirmwareVersion r13 = FirmwareRepairJ2Activity.access$getMLatestFirmware$p(this.OXO1);
            Intrinsics.XXI(r13);
            String r14 = new File(r12, r13.getFileName2()).getAbsolutePath();
            Intrinsics.O10IXXX0X(r14, "getAbsolutePath(...)");
            r11.startOTA(r14);
            return;
        L27:
            return;
        L24:
            return;
        L5:
            r2 = null;
            goto L6
        }
    }

    public FirmwareRepairJ2Activity() {
        this.mOTAStatus = OTAStatus.NONE;
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.XO0O10();
        Object r2 = new Gson().fromJson(r1.getString(BleDeviceInfo.class.getName()), BleDeviceInfo.class);
        if (r2 != null) goto L5;
        r2 = BleDeviceInfo.class.newInstance();
    L5:
        BleDeviceInfo r3 = (BleDeviceInfo) r2;
        this.mDeviceInfo = r3;
        this.mDfuAddress = UtilsKt.I1(r3.getMBleAddress());
        SPUtils r4 = r0.XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r4.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mBluetoothHelper = BluetoothHelper.getInstance(Utils.getApp());
        this.mBtEventListener = new XIi00iiXO(this);
        this.mOTAEventCallback = new iO(this);
    }

    public static final /* synthetic */ boolean access$canOTA(FirmwareRepairJ2Activity r0, OTAStatus r1) {
        return r0.canOTA(r1);
    }

    public static final /* synthetic */ void access$checkDownload(FirmwareRepairJ2Activity r0) {
        r0.checkDownload();
    }

    public static final /* synthetic */ BleDeviceInfo access$getMDeviceInfo$p(FirmwareRepairJ2Activity r0) {
        return r0.mDeviceInfo;
    }

    public static final /* synthetic */ int access$getMDownloaded$p(FirmwareRepairJ2Activity r0) {
        return r0.mDownloaded;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFirmware$p(FirmwareRepairJ2Activity r0) {
        return r0.mLatestFirmware;
    }

    public static final /* synthetic */ OTAManager access$getMOTAManager$p(FirmwareRepairJ2Activity r0) {
        return r0.mOTAManager;
    }

    public static final /* synthetic */ OTAStatus access$getMOTAStatus$p(FirmwareRepairJ2Activity r0) {
        return r0.mOTAStatus;
    }

    public static final /* synthetic */ int access$getMStepsIndex$p(FirmwareRepairJ2Activity r0) {
        return r0.mStepsIndex;
    }

    public static final /* synthetic */ void access$setMDownloaded$p(FirmwareRepairJ2Activity r0, int r1) {
        r0.mDownloaded = r1;
    }

    public static final /* synthetic */ void access$setMOTAStatus$p(FirmwareRepairJ2Activity r0, OTAStatus r1) {
        r0.mOTAStatus = r1;
    }

    public static final /* synthetic */ void access$setMStepsIndex$p(FirmwareRepairJ2Activity r0, int r1) {
        r0.mStepsIndex = r1;
    }

    public static final /* synthetic */ void access$setUseDfuAddress$p(FirmwareRepairJ2Activity r0, boolean r1) {
        r0.isUseDfuAddress = r1;
    }

    public static final /* synthetic */ void access$updateUpgradeStatus(FirmwareRepairJ2Activity r0, OTAStatus r1) {
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

    private final void checkDownload() {
        if (this.mDownloaded != 2) goto L6;
        getTvTip().setText(R.string.preparing);
        upgrade();
        return;
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

    private final void updateUpgradeStatus(OTAStatus r3) {
        LogUtils.d(new Object[]{"updateUpgradeStatus status = " + r3});
        this.mOTAStatus = r3;
        if (isOTAError(r3) == false) goto L6;
        setMStarted(false);
        getTvTip().setText(getString(R.string.firmware_upgrading_failed));
        return;
    L6:
        setMStarted(true);
    }

    public final void checkFirmware() {
        LogUtils.d(new Object[]{"mDeviceInfo -> " + this.mDeviceInfo});
        getTvTip().setText(R.string.firmware_repair_download_tip);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        FirmwareVersion r1 = this.mLatestFirmware;
        Intrinsics.XXI(r1);
        String r2 = r1.getFileUrl2();
        sz0 r3 = sz0.OXO1;
        r0.download(r2, uz0.XXI(r3), this.mLatestFirmware.getFileName2(), new AnonymousClass1(this));
        r0.download(this.mLatestFirmware.getFileUrl(), uz0.XXI(r3), this.mLatestFirmware.getFileName(), new AnonymousClass2(this));
    }

    public final void connectDevice(@aa1 String r3) {
        Intrinsics.X0O(r3, "address");
        LogUtils.d(new Object[]{"connectDevice: " + r3});
        BluetoothHelper r0 = this.mBluetoothHelper;
        BluetoothAdapter r1 = BluetoothAdapter.getDefaultAdapter();
        if (r1 == null) goto L5;
        BluetoothDevice r4 = r1.getRemoteDevice(r3);
    L6:
        r0.connectDevice(r4);
        return;
    L5:
        r4 = null;
        goto L6
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
        this.mDfuAddress = r0;
    L5:
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

    public final void startOTA(@aa1 String r3) {
        Intrinsics.X0O(r3, Y5.c.c);
        LogUtils.d(new Object[]{"startOTA :: " + r3});
        OTAManager r0 = this.mOTAManager;
        if (r0 == null) goto L7;
        BluetoothOTAConfigure r1 = r0.getBluetoothOption();
        if (r1 == null) goto L7;
        r1.setFirmwareFilePath(r3);
    L7:
        OTAManager r4 = this.mOTAManager;
        if (r4 == null) goto L11;
        r4.startOTA(new XO0O10(this));
        return;
    }

    public final void upgrade() {
        destroyOTA();
        initOTA();
        updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE);
        if (this.mStepsIndex > 0) goto L5;
        connectDevice(this.mDfuAddress);
        return;
    L5:
        if (this.isUseDfuAddress == false) goto L8;
        LogUtils.d(new Object[]{"upgrade FIRMWARE2 -> use dfuAddress"});
        connectDevice(this.mDfuAddress);
        return;
    L8:
        LogUtils.d(new Object[]{"upgrade FIRMWARE2 -> use bleAddress"});
        connectDevice(this.mDeviceInfo.getMBleAddress());
    }
}
