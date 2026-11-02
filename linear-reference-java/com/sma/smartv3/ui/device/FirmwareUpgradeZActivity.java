package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXOXiO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i01iIX1XX;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bluetrum.abota.bluetooth.BleManager;
import com.bluetrum.abota.bluetooth.BluetoothEventListener;
import com.bluetrum.abota.data.MyDataReader;
import com.bluetrum.fota.abota.ABOta;
import com.google.gson.Gson;
import com.ironsource.Y5;
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

    @aa1
    private final String TAG;

    @tb1
    private ABOta mAbOta;

    @aa1
    private final XIi00iiXO mBluetoothEventListener;

    @tb1
    private BleManager mBluetoothManager;

    @aa1
    private final String mCurrentFirmware;
    private int mDownloaded;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @aa1
    private final iO mOTAEventListener;

    @aa1
    private final List<FileType> mSteps;
    private int mStepsIndex;

    public static final enum FileType extends Enum<FileType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ FileType[] $VALUES = null;
        public static final FileType FIRMWARE = null;

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{FIRMWARE};
        }

        static {
            FIRMWARE = new FileType("FIRMWARE", 0);
            FileType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private FileType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<FileType> getEntries() {
            return $ENTRIES;
        }

        public static FileType valueOf(String r1) {
            return (FileType) Enum.valueOf(FileType.class, r1);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[FileType.values().length];
            r0[FileType.FIRMWARE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
        L4:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO implements BluetoothEventListener {
        public final /* synthetic */ FirmwareUpgradeZActivity OXO1;

        @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$mBluetoothEventListener$1\n*L\n1#1,148:1\n53#2,4:149\n*E\n"})
        public static final class OXO1 extends TimerTask {
            public final /* synthetic */ FirmwareUpgradeZActivity IO;

            public OXO1(FirmwareUpgradeZActivity r1) {
                this.IO = r1;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                BleManager r0 = FirmwareUpgradeZActivity.access$getMBluetoothManager$p(this.IO);
                if (r0 != null) goto L5;
                return;
            L5:
                if (r0.isReady() != true) goto L14;
                ABOta r1 = FirmwareUpgradeZActivity.access$getMAbOta$p(this.IO);
                if (r1 != null) goto L9;
            L11:
                FirmwareUpgradeZActivity r2 = this.IO;
                String r3 = uz0.XXI(sz0.OXO1);
                FirmwareVersion r4 = FirmwareUpgradeZActivity.access$getMLatestFirmware$p(this.IO);
                Intrinsics.XXI(r4);
                r2.startOTA(r3 + "/" + r4.getFileName());
                return;
            L9:
                if (r1.isUpdating() != true) goto L11;
                return;
            }
        }

        public XIi00iiXO(FirmwareUpgradeZActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(FirmwareUpgradeZActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(FirmwareUpgradeZActivity r2) {
            FirmwareUpgradeZActivity.access$updateUpgradeStatus(r2, true, "disconnected");
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onBluetoothReady() {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.access$getTAG$p(this.OXO1) + " onBluetoothReady");
            ABOta r0 = FirmwareUpgradeZActivity.access$getMAbOta$p(this.OXO1);
            if (r0 == null) goto L5;
            r0.prepareToUpdate();
        L5:
            new Timer().schedule(new OXO1(this.OXO1), 2000);
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onConnectionStateChange(BluetoothGatt r1, int r2, int r3) {
            if (r3 != 0) goto L5;
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.access$getTAG$p(this.OXO1) + " onConnectionStateChange -> disconnected");
            final FirmwareUpgradeZActivity r4 = this.OXO1;
            r4.runOnUiThread(new i01iIX1XX(r4));
            return;
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onReceive(byte[] r2) {
            ABOta r0 = FirmwareUpgradeZActivity.access$getMAbOta$p(this.OXO1);
            if (r0 == null) goto L6;
            r0.handleData(r2);
            return;
        }

        @Override // com.bluetrum.abota.bluetooth.BluetoothEventListener
        public void onSend(byte[] r1) {
            ABOta r2 = FirmwareUpgradeZActivity.access$getMAbOta$p(this.OXO1);
            if (r2 == null) goto L6;
            r2.nextRun();
            return;
        }
    }

    public static final class iO implements ABOta.EventListener {
        public final /* synthetic */ FirmwareUpgradeZActivity OXO1;

        public iO(FirmwareUpgradeZActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onReceiveChannel(boolean r1) {
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onReceiveTwsInfo(boolean r1, boolean r2) {
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onReceiveVersion(int r5) {
            StringCompanionObject r3 = StringCompanionObject.OXO1;
            String r6 = String.format(Locale.getDefault(), "V%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf((r5 >> 12) & 15), Integer.valueOf((r5 >> 8) & 15), Integer.valueOf((r5 >> 4) & 15), Integer.valueOf(r5 & 15)}, 4));
            Intrinsics.O10IXXX0X(r6, "format(...)");
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.access$getTAG$p(this.OXO1) + " onReceiveVersion -> " + r6);
        }

        @Override // com.bluetrum.fota.abota.ABOta.EventListener
        public void onStatusChanged(int r4, int r5) {
            i1O0OXO1O.OXO1.OXO1(FirmwareUpgradeZActivity.access$getTAG$p(this.OXO1) + " onStatusChanged -> " + r4 + ", " + r5);
            switch(r4) {
                case 0: goto L19;
                case 1: goto L17;
                case 2: goto L15;
                case 3: goto L13;
                case 4: goto L11;
                case 5: goto L9;
                case 6: goto L7;
                case 7: goto L5;
                default: goto L4;
            };
        L4:
            return;
        L5:
            FirmwareUpgradeZActivity.access$otaStatusFail(this.OXO1, r5);
            return;
        L7:
            FirmwareUpgradeZActivity.access$otaWaitFinish(this.OXO1);
            return;
        L9:
            FirmwareUpgradeZActivity.access$otaFinish(this.OXO1);
            return;
        L11:
            FirmwareUpgradeZActivity.access$otaContinue(this.OXO1);
            return;
        L13:
            FirmwareUpgradeZActivity.access$otaPause(this.OXO1);
            return;
        L15:
            FirmwareUpgradeZActivity.access$otaUpdating(this.OXO1, r5);
            return;
        L17:
            FirmwareUpgradeZActivity.access$otaStart(this.OXO1);
            return;
        L19:
            FirmwareUpgradeZActivity.access$otaReady(this.OXO1);
        }
    }

    public FirmwareUpgradeZActivity() {
        this.TAG = "UpgradeZ";
        this.mBluetoothEventListener = new XIi00iiXO(this);
        this.mOTAEventListener = new iO(this);
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r0.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mCurrentFirmware = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        this.mSteps = new ArrayList();
    }

    public static /* synthetic */ void XX0(FirmwareUpgradeZActivity r0, int r1) {
        otaUpdating$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$checkDownload(FirmwareUpgradeZActivity r0) {
        r0.checkDownload();
    }

    public static final /* synthetic */ ABOta access$getMAbOta$p(FirmwareUpgradeZActivity r0) {
        return r0.mAbOta;
    }

    public static final /* synthetic */ BleManager access$getMBluetoothManager$p(FirmwareUpgradeZActivity r0) {
        return r0.mBluetoothManager;
    }

    public static final /* synthetic */ int access$getMDownloaded$p(FirmwareUpgradeZActivity r0) {
        return r0.mDownloaded;
    }

    public static final /* synthetic */ FirmwareVersion access$getMLatestFirmware$p(FirmwareUpgradeZActivity r0) {
        return r0.mLatestFirmware;
    }

    public static final /* synthetic */ String access$getTAG$p(FirmwareUpgradeZActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$otaContinue(FirmwareUpgradeZActivity r0) {
        r0.otaContinue();
    }

    public static final /* synthetic */ void access$otaFinish(FirmwareUpgradeZActivity r0) {
        r0.otaFinish();
    }

    public static final /* synthetic */ void access$otaPause(FirmwareUpgradeZActivity r0) {
        r0.otaPause();
    }

    public static final /* synthetic */ void access$otaReady(FirmwareUpgradeZActivity r0) {
        r0.otaReady();
    }

    public static final /* synthetic */ void access$otaStart(FirmwareUpgradeZActivity r0) {
        r0.otaStart();
    }

    public static final /* synthetic */ void access$otaStatusFail(FirmwareUpgradeZActivity r0, int r1) {
        r0.otaStatusFail(r1);
    }

    public static final /* synthetic */ void access$otaUpdating(FirmwareUpgradeZActivity r0, int r1) {
        r0.otaUpdating(r1);
    }

    public static final /* synthetic */ void access$otaWaitFinish(FirmwareUpgradeZActivity r0) {
        r0.otaWaitFinish();
    }

    public static final /* synthetic */ void access$setMDownloaded$p(FirmwareUpgradeZActivity r0, int r1) {
        r0.mDownloaded = r1;
    }

    public static final /* synthetic */ void access$updateUpgradeStatus(FirmwareUpgradeZActivity r0, boolean r1, String r2) {
        r0.updateUpgradeStatus(r1, r2);
    }

    private final void checkDownload() {
        if (this.mDownloaded != this.mSteps.size()) goto L6;
        ProgressButton.O00(getProgressButton(), R.string.preparing, false, 2, null);
        LogUtils.d(new Object[]{"checkDownload done start upgrade"});
        upgrade();
        return;
    }

    private final void destroyOTA() {
        BleManager r0 = this.mBluetoothManager;
        if (r0 == null) goto L5;
        r0.close();
    L5:
        this.mAbOta = null;
        this.mBluetoothManager = null;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " destroyOTA");
    }

    private final void initOTA() {
        BleManager r1 = new BleManager(this, BluetoothAdapter.getDefaultAdapter().getRemoteDevice(BleCache.INSTANCE.getMBleAddress()));
        this.mBluetoothManager = r1;
        ABOta r0 = new ABOta();
        this.mAbOta = r0;
        r0.setEventListener(this.mOTAEventListener);
        ABOta r2 = this.mAbOta;
        if (r2 == null) goto L5;
        r2.setSendCallback(r1);
    L5:
        BleManager r3 = this.mBluetoothManager;
        if (r3 == null) goto L8;
        r3.setEventListener(this.mBluetoothEventListener);
    L8:
        BleManager r4 = this.mBluetoothManager;
        if (r4 == null) goto L11;
        r4.open();
    L11:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " initOTA");
    }

    private final void otaContinue() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaContinue -> Upgrading firmware...");
    }

    private final void otaFinish() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaFinish -> The upgrade is complete");
    }

    private final void otaPause() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaPause -> The upgrade has been paused");
    }

    private final void otaReady() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaReady -> Ready");
    }

    private final void otaStart() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaStart -> Upgrading firmware...");
        updateUpgradeStatus$default(this, false, null, 2, null);
    }

    private final void otaStatusFail(int r5) {
        if (r5 != 1) goto L5;
        String r6 = "The firmware is the same";
    L19:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaStatusFail -> " + r6);
        updateUpgradeStatus(true, r6);
        return;
    L5:
        if (r5 != 2) goto L7;
        r6 = "The key does not correspond";
        goto L19
    L7:
        if (r5 != 11) goto L9;
        r6 = "CRC error";
        goto L19
    L9:
        if (r5 == 4097) goto L15;
        switch(r5) {
            case 4099: goto L14;
            case 4100: goto L13;
            case 4101: goto L12;
            default: goto L11;
        };
    L11:
        r6 = "Unknown error";
        goto L19
    L12:
        r6 = "DataReader error";
        goto L19
    L13:
        r6 = "TWS is disconnected and the upgrade is stopped";
        goto L19
    L14:
        r6 = "Receive timeout";
        goto L19
    L15:
        r6 = "The device refuses to be upgraded";
        goto L19
    }

    private final void otaUpdating(final int r2) {
        runOnUiThread(new IXOXiO(this, r2));
    }

    private static final void otaUpdating$lambda$0(FirmwareUpgradeZActivity r1, int r2) {
        r1.getProgressButton().setProgress(r2 / 100.0f);
    }

    private final void otaWaitFinish() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " otaWaitFinish -> The data transfer is complete, please wait for the upgrade to complete, and the device will restart automatically");
        upgradeDone();
    }

    private final void updateUpgradeStatus(boolean r5, String r6) {
        if (r5 == false) goto L5;
        setMStarted(false);
        ProgressButton.IiI10X(getProgressButton(), OOX00.OXO1.O00(), false, 2, null);
        ToastUtils.showLong(r6, new Object[0]);
        return;
    L5:
        setMStarted(true);
    }

    public static /* synthetic */ void updateUpgradeStatus$default(FirmwareUpgradeZActivity r0, boolean r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = "";
    L5:
        r0.updateUpgradeStatus(r1, r2);
    }

    private final void upgrade() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " upgrade " + this.mSteps.get(this.mStepsIndex));
        getTvStep().setVisibility(0);
        ProgressButton.O00(getProgressButton(), R.string.starting, false, 2, null);
        getTvStep().setText(getString(R.string.upgrade_steps_d_d, new Object[]{Integer.valueOf(this.mStepsIndex + 1), Integer.valueOf(this.mSteps.size())}));
        if (OXO1.OXO1[this.mSteps.get(this.mStepsIndex).ordinal()] != 1) goto L7;
        r0.OXO1(this.TAG + " firmware");
        destroyOTA();
        initOTA();
        return;
    L7:
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " Server -> " + UtilsKt.X0i1O());
        r0.OXO1(this.TAG + " Firmware -> " + this.mLatestFirmware);
        FirmwareVersion r1 = this.mLatestFirmware;
        if (r1 != null) goto L6;
        getTvLatest().setText(getString(R.string.v_s, new Object[]{String.valueOf(this.mCurrentFirmware)}));
        ViewParent r2 = getTvCurrent().getParent();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r2).setVisibility(8);
        getProgressButton().setVisibility(8);
        return;
    L6:
        if (r1 == null) goto L9;
        String r3 = r1.getVersion();
        if (r3 == null) goto L9;
    L10:
        getTvLatest().setText(getString(R.string.v_s, new Object[]{String.valueOf(r3)}));
        r0.OXO1(this.TAG + " latest -> " + getTvLatest().getText());
        getTvCurrent().setText(getString(R.string.v_s, new Object[]{String.valueOf(this.mCurrentFirmware)}));
        r0.OXO1(this.TAG + " current -> " + getTvCurrent().getText());
        this.mSteps.add(FileType.FIRMWARE);
        getTvStep().setVisibility(0);
        return;
    L9:
        r3 = this.mCurrentFirmware;
        goto L10
    }

    public final void onBottomClick(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L7;
        ToastUtils.showLong("Bluetooth is off!", new Object[0]);
        return;
    L7:
        if (q62.OXO1.iiOOI() == true) goto L9;
        BleConnector.INSTANCE.closeConnection(true);
    L9:
        this.mDownloaded = 0;
        setMStarted(true);
        ProgressButton.O00(getProgressButton(), R.string.downloading, false, 2, null);
        if (this.mStepsIndex == 0) goto L12;
        upgrade();
        return;
    L12:
        if (this.mLatestFirmware == null) goto L21;
        File r7 = new File(uz0.XXI(sz0.OXO1), this.mLatestFirmware.getFileName());
        if (FileUtils.isFileExists(r7) == false) goto L17;
        this.mDownloaded++;
        checkDownload();
        return;
    L17:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " download firmware");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = this.mLatestFirmware.getFileUrl();
        String r2 = r7.getParent();
        Intrinsics.O10IXXX0X(r2, "getParent(...)");
        String r8 = r7.getName();
        Intrinsics.O10IXXX0X(r8, "getName(...)");
        r0.download(r1, r2, r8, new AnonymousClass1(this));
        return;
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.mSteps.isEmpty() == false) goto L5;
    L7:
        destroyOTA();
        super.onDestroy();
        return;
    L5:
        if (this.mStepsIndex != CollectionsKt__CollectionsKt.X11iII1O1(this.mSteps)) goto L7;
        BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.UI_FILE, null, 2, null);
        BleConnector.INSTANCE.closeConnection(true);
        goto L7
    }

    @Override // com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity, com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMStarted() == false) goto L5;
        return;
    L5:
        super.onHandleBackPressed();
    }

    public final void startOTA(@aa1 String r4) {
        Intrinsics.X0O(r4, Y5.c.c);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " startOTA -> " + r4);
        MyDataReader r0 = new MyDataReader(r4);
        ABOta r5 = this.mAbOta;
        if (r5 == null) goto L5;
        r5.setDataReader(r0);
    L5:
        ABOta r6 = this.mAbOta;
        if (r6 == null) goto L9;
        r6.startOTA();
        return;
    }

    public final void upgradeDone() {
        ToastUtils.showLong(R.string.support_dual_backup_upgrade_successful);
        FirmwareVersion r0 = this.mLatestFirmware;
        if (r0 == null) goto L5;
        updateDeviceInfo(r0.getVersion());
    L5:
        finish();
        FirmwareVersion r1 = this.mLatestFirmware;
        if (r1 != null) goto L8;
    L10:
        I01XX0.OXO1(I01XX0.Xi1i0XOX0, "done");
        return;
    L8:
        if (r1.getFlag() != 2) goto L10;
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        I01XX0.XIi00iiXO(I01XX0.O0O, null, 2, null);
        goto L10
    }
}
