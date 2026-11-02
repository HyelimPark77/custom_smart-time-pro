package com.sma.smartv3.p610ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C2916sc;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.UpgradeFailedDeviceData;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.FirmwareRepairJ2Activity;
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
    private OTAStatus mOTAStatus = OTAStatus.NONE;
    private int mStepsIndex;

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
            LogUtils.m11128d("bt onAdapterStatus " + z);
        }

        @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
        public void onConnection(BluetoothDevice device, int i) {
            Intrinsics.X0O(device, "device");
            OTAStatus oTAStatus = FirmwareRepairJ2Activity.this.mOTAStatus;
            OTAManager oTAManager = FirmwareRepairJ2Activity.this.mOTAManager;
            LogUtils.m11128d("bt onConnection -> mOTAStatus = " + oTAStatus + ", " + device + " ,status = " + i + " ,isOTA = " + (oTAManager != null ? Boolean.valueOf(oTAManager.isOTA()) : null));
            if (i == 0) {
                LogUtils.m11128d("bt onConnection -> device disconnected");
                if (FirmwareRepairJ2Activity.this.mOTAStatus == OTAStatus.UPGRADE_PREPARE) {
                    if (FirmwareRepairJ2Activity.this.mStepsIndex != 0) {
                        FirmwareRepairJ2Activity.this.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE_FAILED);
                        return;
                    }
                    LogUtils.m11128d("bt onConnection -> try ble Address");
                    FirmwareRepairJ2Activity firmwareRepairJ2Activity = FirmwareRepairJ2Activity.this;
                    firmwareRepairJ2Activity.connectDevice(firmwareRepairJ2Activity.mDeviceInfo.getMBleAddress());
                }
            }
        }
    }

    public static final class XO0O10 implements IUpgradeCallback {
        public XO0O10() {
        }

        public static final void XIi00iiXO(FirmwareRepairJ2Activity firmwareRepairJ2Activity) {
            firmwareRepairJ2Activity.upgrade();
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            LogUtils.m11128d("onCancelOTA");
            FirmwareRepairJ2Activity.this.updateUpgradeStatus(OTAStatus.UPGRADE_FAILED);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError baseError) {
            LogUtils.m11128d("onError -> " + baseError);
            FirmwareRepairJ2Activity.this.updateUpgradeStatus(OTAStatus.UPGRADE_FAILED);
            ToastUtils.showLong(baseError != null ? baseError.getMessage() : null, new Object[0]);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String str, boolean z) {
            LogUtils.m11128d("onNeedReconnect : " + str + ", " + z);
            FirmwareRepairJ2Activity.this.isUseDfuAddress = true;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int i, float f) {
            if (i == 0) {
                FirmwareRepairJ2Activity.this.mOTAStatus = OTAStatus.UPGRADE_CHECKING;
                FirmwareRepairJ2Activity.this.getTvTip().setText(FirmwareRepairJ2Activity.this.getString(R.string.check_file));
            } else {
                FirmwareRepairJ2Activity.this.mOTAStatus = OTAStatus.UPGRADEING;
                FirmwareRepairJ2Activity.this.getTvTip().setText(FirmwareRepairJ2Activity.this.getString(R.string.starting));
            }
            FirmwareRepairJ2Activity.this.getDfuProgress().setProgress(Math.round(f) / 100.0f);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            LogUtils.m11128d("onStartOTA");
            a01.OXO1.XIi00iiXO().put(b01.IiI10X, true);
            FirmwareRepairJ2Activity.this.updateUpgradeStatus(OTAStatus.UPGRADE_START);
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            FirmwareRepairJ2Activity.this.isUseDfuAddress = false;
            LogUtils.m11128d("onStopOTA() upgrade ok " + FirmwareRepairJ2Activity.this.mStepsIndex);
            FirmwareRepairJ2Activity.this.updateUpgradeStatus(OTAStatus.UPGRADE_STOP);
            if (FirmwareRepairJ2Activity.this.mStepsIndex != 0) {
                a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
                ToastUtils.showLong(R.string.repair_successful);
                UpgradeFailedDeviceData.INSTANCE.delete(FirmwareRepairJ2Activity.this.mDeviceInfo);
                FirmwareRepairJ2Activity.this.finish();
                return;
            }
            FirmwareRepairJ2Activity.this.getDfuProgress().setProgress(0.0f);
            FirmwareRepairJ2Activity.this.mStepsIndex++;
            TextView tvTip = FirmwareRepairJ2Activity.this.getTvTip();
            final FirmwareRepairJ2Activity firmwareRepairJ2Activity = FirmwareRepairJ2Activity.this;
            tvTip.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I001OO
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareRepairJ2Activity.XO0O10.XIi00iiXO(firmwareRepairJ2Activity);
                }
            }, 5000L);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.FirmwareRepairJ2Activity$iO */
    public static final class C18701iO extends BtEventCallback {
        public C18701iO() {
        }

        @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
        public void onConnection(BluetoothDevice device, int i) {
            Intrinsics.X0O(device, "device");
            OTAStatus oTAStatus = FirmwareRepairJ2Activity.this.mOTAStatus;
            OTAManager oTAManager = FirmwareRepairJ2Activity.this.mOTAManager;
            LogUtils.m11128d("ota onConnection -> mOTAStatus = " + oTAStatus + ", " + device + " ,status = " + i + " ,isOTA = " + (oTAManager != null ? Boolean.valueOf(oTAManager.isOTA()) : null));
            OTAManager oTAManager2 = FirmwareRepairJ2Activity.this.mOTAManager;
            Intrinsics.XXI(oTAManager2);
            if (oTAManager2.isOTA()) {
                return;
            }
            if (i == 0) {
                LogUtils.m11128d("ota onConnection -> device disconnected");
                if (FirmwareRepairJ2Activity.this.mOTAStatus == OTAStatus.UPGRADE_PREPARE) {
                    FirmwareRepairJ2Activity.this.updateUpgradeStatus(OTAStatus.UPGRADE_PREPARE_FAILED);
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            FirmwareRepairJ2Activity firmwareRepairJ2Activity = FirmwareRepairJ2Activity.this;
            if (firmwareRepairJ2Activity.canOTA(firmwareRepairJ2Activity.mOTAStatus)) {
                if (FirmwareRepairJ2Activity.this.mStepsIndex == 0) {
                    FirmwareRepairJ2Activity firmwareRepairJ2Activity2 = FirmwareRepairJ2Activity.this;
                    File fileI0iXXO = uz0.I0iXXO(sz0.OXO1);
                    FirmwareVersion firmwareVersion = FirmwareRepairJ2Activity.this.mLatestFirmware;
                    Intrinsics.XXI(firmwareVersion);
                    String absolutePath = new File(fileI0iXXO, firmwareVersion.getFileName()).getAbsolutePath();
                    Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
                    firmwareRepairJ2Activity2.startOTA(absolutePath);
                    return;
                }
                FirmwareRepairJ2Activity firmwareRepairJ2Activity3 = FirmwareRepairJ2Activity.this;
                File fileI0iXXO2 = uz0.I0iXXO(sz0.OXO1);
                FirmwareVersion firmwareVersion2 = FirmwareRepairJ2Activity.this.mLatestFirmware;
                Intrinsics.XXI(firmwareVersion2);
                String absolutePath2 = new File(fileI0iXXO2, firmwareVersion2.getFileName2()).getAbsolutePath();
                Intrinsics.O10IXXX0X(absolutePath2, "getAbsolutePath(...)");
                firmwareRepairJ2Activity3.startOTA(absolutePath2);
            }
        }
    }

    public FirmwareRepairJ2Activity() {
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.XO0O10().getString(BleDeviceInfo.class.getName()), (Class<Object>) BleDeviceInfo.class);
        BleDeviceInfo bleDeviceInfo = (BleDeviceInfo) (objFromJson == null ? BleDeviceInfo.class.newInstance() : objFromJson);
        this.mDeviceInfo = bleDeviceInfo;
        this.mDfuAddress = UtilsKt.m38841I1(bleDeviceInfo.getMBleAddress());
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mBluetoothHelper = BluetoothHelper.getInstance(Utils.getApp());
        this.mBtEventListener = new XIi00iiXO();
        this.mOTAEventCallback = new C18701iO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canOTA(OTAStatus oTAStatus) {
        return (isOTAError(oTAStatus) || oTAStatus == OTAStatus.UPGRADE_STOP) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDownload() {
        if (this.mDownloaded == 2) {
            getTvTip().setText(R.string.preparing);
            upgrade();
        }
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
        LogUtils.m11128d("updateUpgradeStatus status = " + oTAStatus);
        this.mOTAStatus = oTAStatus;
        if (!isOTAError(oTAStatus)) {
            setMStarted(true);
        } else {
            setMStarted(false);
            getTvTip().setText(getString(R.string.firmware_upgrading_failed));
        }
    }

    public final void checkFirmware() {
        LogUtils.m11128d("mDeviceInfo -> " + this.mDeviceInfo);
        getTvTip().setText(R.string.firmware_repair_download_tip);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        Intrinsics.XXI(firmwareVersion);
        String fileUrl2 = firmwareVersion.getFileUrl2();
        sz0 sz0Var = sz0.OXO1;
        netWorkUtils.download(fileUrl2, uz0.XXI(sz0Var), this.mLatestFirmware.getFileName2(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairJ2Activity.checkFirmware.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                FirmwareRepairJ2Activity.this.mDownloaded++;
                FirmwareRepairJ2Activity.this.checkDownload();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                FirmwareRepairJ2Activity.this.mDownloaded = 0;
                FirmwareRepairJ2Activity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
        netWorkUtils.download(this.mLatestFirmware.getFileUrl(), uz0.XXI(sz0Var), this.mLatestFirmware.getFileName(), new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareRepairJ2Activity.checkFirmware.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                FirmwareRepairJ2Activity.this.mDownloaded++;
                FirmwareRepairJ2Activity.this.checkDownload();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                FirmwareRepairJ2Activity.this.mDownloaded = 0;
                FirmwareRepairJ2Activity.this.setMStarted(false);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }

    public final void connectDevice(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        LogUtils.m11128d("connectDevice: " + address);
        BluetoothHelper bluetoothHelper = this.mBluetoothHelper;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        bluetoothHelper.connectDevice(defaultAdapter != null ? defaultAdapter.getRemoteDevice(address) : null);
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
            this.mDfuAddress = mArg0;
        }
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
        LogUtils.m11128d("startOTA :: " + filePath);
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
        if (this.mStepsIndex <= 0) {
            connectDevice(this.mDfuAddress);
        } else if (this.isUseDfuAddress) {
            LogUtils.m11128d("upgrade FIRMWARE2 -> use dfuAddress");
            connectDevice(this.mDfuAddress);
        } else {
            LogUtils.m11128d("upgrade FIRMWARE2 -> use bleAddress");
            connectDevice(this.mDeviceInfo.getMBleAddress());
        }
    }
}
