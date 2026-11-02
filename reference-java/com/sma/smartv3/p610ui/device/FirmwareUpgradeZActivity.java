package com.sma.smartv3.p610ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bluetrum.abota.bluetooth.BleManager;
import com.bluetrum.abota.bluetooth.BluetoothEventListener;
import com.bluetrum.abota.data.MyDataReader;
import com.bluetrum.fota.abota.ABOta;
import com.google.gson.Gson;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeZActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareUpgradeZActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,354:1\n15#2:355\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity\n*L\n110#1:355\n*E\n"})
public final class FirmwareUpgradeZActivity extends BaseFirmwareUpgradeActivity {

    @tb1
    private ABOta mAbOta;

    @tb1
    private BleManager mBluetoothManager;
    private int mDownloaded;
    private int mStepsIndex;

    @aa1
    private final String TAG = "UpgradeZ";

    @aa1
    private final XIi00iiXO mBluetoothEventListener = new XIi00iiXO();

    @aa1
    private final C18751iO mOTAEventListener = new C18751iO();

    @tb1
    private final FirmwareVersion mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);

    @aa1
    private final String mCurrentFirmware = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);

    @aa1
    private final List<FileType> mSteps = new ArrayList();

    public enum FileType {
        FIRMWARE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<FileType> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[FileType.values().length];
            try {
                iArr[FileType.FIRMWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements BluetoothEventListener {

        @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$mBluetoothEventListener$1\n*L\n1#1,148:1\n53#2,4:149\n*E\n"})
        public static final class OXO1 extends TimerTask {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ FirmwareUpgradeZActivity f54481IO;

            public OXO1(FirmwareUpgradeZActivity firmwareUpgradeZActivity) {
                this.f54481IO = firmwareUpgradeZActivity;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                BleManager bleManager = this.f54481IO.mBluetoothManager;
                if (bleManager == null || !bleManager.isReady()) {
                    return;
                }
                ABOta aBOta = this.f54481IO.mAbOta;
                if (aBOta == null || !aBOta.isUpdating()) {
                    FirmwareUpgradeZActivity firmwareUpgradeZActivity = this.f54481IO;
                    String strXXI = uz0.XXI(sz0.OXO1);
                    FirmwareVersion firmwareVersion = this.f54481IO.mLatestFirmware;
                    Intrinsics.XXI(firmwareVersion);
                    firmwareUpgradeZActivity.startOTA(strXXI + "/" + firmwareVersion.getFileName());
                }
            }
        }

        public XIi00iiXO() {
        }

        public static final void XIi00iiXO(FirmwareUpgradeZActivity firmwareUpgradeZActivity) {
            firmwareUpgradeZActivity.updateUpgradeStatus(true, "disconnected");
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onBluetoothReady() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.this.TAG + " onBluetoothReady");
            ABOta aBOta = FirmwareUpgradeZActivity.this.mAbOta;
            if (aBOta != null) {
                aBOta.prepareToUpdate();
            }
            new Timer().schedule(new OXO1(FirmwareUpgradeZActivity.this), 2000L);
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 0) {
                i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.this.TAG + " onConnectionStateChange -> disconnected");
                final FirmwareUpgradeZActivity firmwareUpgradeZActivity = FirmwareUpgradeZActivity.this;
                firmwareUpgradeZActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i01iIX1XX
                    @Override // java.lang.Runnable
                    public final void run() {
                        FirmwareUpgradeZActivity.XIi00iiXO.XIi00iiXO(firmwareUpgradeZActivity);
                    }
                });
            }
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onReceive(byte[] bArr) {
            ABOta aBOta = FirmwareUpgradeZActivity.this.mAbOta;
            if (aBOta != null) {
                aBOta.handleData(bArr);
            }
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onSend(byte[] bArr) {
            ABOta aBOta = FirmwareUpgradeZActivity.this.mAbOta;
            if (aBOta != null) {
                aBOta.nextRun();
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.FirmwareUpgradeZActivity$iO */
    public static final class C18751iO implements ABOta.EventListener {
        public C18751iO() {
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onReceiveChannel(boolean z) {
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onReceiveTwsInfo(boolean z, boolean z2) {
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onReceiveVersion(int i) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format(Locale.getDefault(), "V%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf((i >> 12) & 15), Integer.valueOf((i >> 8) & 15), Integer.valueOf((i >> 4) & 15), Integer.valueOf(i & 15)}, 4));
            Intrinsics.O10IXXX0X(str, "format(...)");
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.this.TAG + " onReceiveVersion -> " + str);
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onStatusChanged(int i, int i2) throws IllegalAccessException, InstantiationException {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.this.TAG + " onStatusChanged -> " + i + ", " + i2);
            switch (i) {
                case 0:
                    FirmwareUpgradeZActivity.this.otaReady();
                    break;
                case 1:
                    FirmwareUpgradeZActivity.this.otaStart();
                    break;
                case 2:
                    FirmwareUpgradeZActivity.this.otaUpdating(i2);
                    break;
                case 3:
                    FirmwareUpgradeZActivity.this.otaPause();
                    break;
                case 4:
                    FirmwareUpgradeZActivity.this.otaContinue();
                    break;
                case 5:
                    FirmwareUpgradeZActivity.this.otaFinish();
                    break;
                case 6:
                    FirmwareUpgradeZActivity.this.otaWaitFinish();
                    break;
                case 7:
                    FirmwareUpgradeZActivity.this.otaStatusFail(i2);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDownload() {
        if (this.mDownloaded == this.mSteps.size()) {
            ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
            LogUtils.m11128d("checkDownload done start upgrade");
            upgrade();
        }
    }

    private final void destroyOTA() {
        BleManager bleManager = this.mBluetoothManager;
        if (bleManager != null) {
            bleManager.close();
        }
        this.mAbOta = null;
        this.mBluetoothManager = null;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " destroyOTA");
    }

    private final void initOTA() {
        BleManager bleManager = new BleManager(this, BluetoothAdapter.getDefaultAdapter().getRemoteDevice(BleCache.INSTANCE.getMBleAddress()));
        this.mBluetoothManager = bleManager;
        ABOta aBOta = new ABOta();
        this.mAbOta = aBOta;
        aBOta.setEventListener(this.mOTAEventListener);
        ABOta aBOta2 = this.mAbOta;
        if (aBOta2 != null) {
            aBOta2.setSendCallback(bleManager);
        }
        BleManager bleManager2 = this.mBluetoothManager;
        if (bleManager2 != null) {
            bleManager2.setEventListener(this.mBluetoothEventListener);
        }
        BleManager bleManager3 = this.mBluetoothManager;
        if (bleManager3 != null) {
            bleManager3.open();
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " initOTA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaContinue() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaContinue -> Upgrading firmware...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaFinish() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaFinish -> The upgrade is complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaPause() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaPause -> The upgrade has been paused");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaReady() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaReady -> Ready");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaStart() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaStart -> Upgrading firmware...");
        updateUpgradeStatus$default(this, false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaStatusFail(int i) {
        String str;
        if (i == 1) {
            str = "The firmware is the same";
        } else if (i == 2) {
            str = "The key does not correspond";
        } else if (i == 11) {
            str = "CRC error";
        } else if (i != 4097) {
            switch (i) {
                case 4099:
                    str = "Receive timeout";
                    break;
                case 4100:
                    str = "TWS is disconnected and the upgrade is stopped";
                    break;
                case 4101:
                    str = "DataReader error";
                    break;
                default:
                    str = "Unknown error";
                    break;
            }
        } else {
            str = "The device refuses to be upgraded";
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaStatusFail -> " + str);
        updateUpgradeStatus(true, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaUpdating(final int i) {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IXOXiO
            @Override // java.lang.Runnable
            public final void run() {
                FirmwareUpgradeZActivity.otaUpdating$lambda$0(this.f2078IO, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void otaUpdating$lambda$0(FirmwareUpgradeZActivity firmwareUpgradeZActivity, int i) {
        firmwareUpgradeZActivity.getProgressButton().setProgress(i / 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void otaWaitFinish() throws IllegalAccessException, InstantiationException {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaWaitFinish -> The data transfer is complete, please wait for the upgrade to complete, and the device will restart automatically");
        upgradeDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUpgradeStatus(boolean z, String str) {
        if (!z) {
            setMStarted(true);
            return;
        }
        setMStarted(false);
        ProgressButton.IiI10X(getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
        ToastUtils.showLong(str, new Object[0]);
    }

    public static /* synthetic */ void updateUpgradeStatus$default(FirmwareUpgradeZActivity firmwareUpgradeZActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        firmwareUpgradeZActivity.updateUpgradeStatus(z, str);
    }

    private final void upgrade() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.TAG + " upgrade " + this.mSteps.get(this.mStepsIndex));
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())));
        if (OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        i1o0oxo1o.OXO1(this.TAG + " firmware");
        destroyOTA();
        initOTA();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String version;
        super.initView();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.TAG + " Server -> " + UtilsKt.X0i1O());
        i1o0oxo1o.OXO1(this.TAG + " Firmware -> " + this.mLatestFirmware);
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion == null) {
            getTvLatest().setText(getString(R.string.v_s, String.valueOf(this.mCurrentFirmware)));
            ViewParent parent = getTvCurrent().getParent();
            Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(8);
            getProgressButton().setVisibility(8);
            return;
        }
        if (firmwareVersion == null || (version = firmwareVersion.getVersion()) == null) {
            version = this.mCurrentFirmware;
        }
        getTvLatest().setText(getString(R.string.v_s, String.valueOf(version)));
        i1o0oxo1o.OXO1(this.TAG + " latest -> " + ((Object) getTvLatest().getText()));
        getTvCurrent().setText(getString(R.string.v_s, String.valueOf(this.mCurrentFirmware)));
        i1o0oxo1o.OXO1(this.TAG + " current -> " + ((Object) getTvCurrent().getText()));
        this.mSteps.add(FileType.FIRMWARE);
        getTvStep().setVisibility(0);
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            ToastUtils.showLong("Bluetooth is off!", new Object[0]);
            return;
        }
        if (!q62.OXO1.iiOOI()) {
            BleConnector.INSTANCE.closeConnection(true);
        }
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex != 0) {
            upgrade();
            return;
        }
        if (this.mLatestFirmware != null) {
            File file = new File(uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName());
            if (FileUtils.isFileExists(file)) {
                this.mDownloaded++;
                checkDownload();
                return;
            }
            i1O0OXO1O.OXO1.OXO1(this.TAG + " download firmware");
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            String fileUrl = this.mLatestFirmware.getFileUrl();
            String parent = file.getParent();
            Intrinsics.O10IXXX0X(parent, "getParent(...)");
            String name = file.getName();
            Intrinsics.O10IXXX0X(name, "getName(...)");
            netWorkUtils.download(fileUrl, parent, name, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.FirmwareUpgradeZActivity.onBottomClick.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    FirmwareUpgradeZActivity.this.mDownloaded++;
                    FirmwareUpgradeZActivity.this.checkDownload();
                    FirmwareUpgradeZActivity firmwareUpgradeZActivity = FirmwareUpgradeZActivity.this;
                    BaseFirmwareUpgradeActivity.uploadDownloadInfo$default(firmwareUpgradeZActivity, firmwareUpgradeZActivity.mLatestFirmware.getFileUrl(), FirmwareUpgradeZActivity.this.mLatestFirmware.getFileName(), 0, 4, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.this.TAG + " download firmware error -> " + error);
                    FirmwareUpgradeZActivity.this.mDownloaded = 0;
                    FirmwareUpgradeZActivity.this.setMStarted(false);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.mSteps.isEmpty() && this.mStepsIndex == CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) {
            BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.UI_FILE, null, 2, null);
            BleConnector.INSTANCE.closeConnection(true);
        }
        destroyOTA();
        super.onDestroy();
    }

    @Override // com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted()) {
            return;
        }
        super.onHandleBackPressed();
    }

    public final void startOTA(@aa1 String filePath) {
        Intrinsics.X0O(filePath, "filePath");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA -> " + filePath);
        MyDataReader myDataReader = new MyDataReader(filePath);
        ABOta aBOta = this.mAbOta;
        if (aBOta != null) {
            aBOta.setDataReader(myDataReader);
        }
        ABOta aBOta2 = this.mAbOta;
        if (aBOta2 != null) {
            aBOta2.startOTA();
        }
    }

    public final void upgradeDone() throws IllegalAccessException, InstantiationException {
        ToastUtils.showLong(R.string.support_dual_backup_upgrade_successful);
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (firmwareVersion != null) {
            updateDeviceInfo(firmwareVersion.getVersion());
        }
        finish();
        FirmwareVersion firmwareVersion2 = this.mLatestFirmware;
        if (firmwareVersion2 != null && firmwareVersion2.getFlag() == 2) {
            I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
            I01XX0.XIi00iiXO(I01XX0.O0O, null, 2, null);
        }
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, "done");
    }
}
