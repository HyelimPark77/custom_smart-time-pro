package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.I0IiII0;
import com.android.mltcode.paycertificationapi.I0OXiX1iX;
import com.android.mltcode.paycertificationapi.I0XIII0;
import com.android.mltcode.paycertificationapi.I1iOX;
import com.android.mltcode.paycertificationapi.IXIIiOXOi;
import com.android.mltcode.paycertificationapi.Ii0OO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.O1i1i0;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OOi001IXO;
import com.android.mltcode.paycertificationapi.OOi0X1;
import com.android.mltcode.paycertificationapi.OOiii;
import com.android.mltcode.paycertificationapi.OX11Oi0;
import com.android.mltcode.paycertificationapi.OX1XXOi0;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.OiOOIX;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.XIX0XIII;
import com.android.mltcode.paycertificationapi.XIiOi1i1;
import com.android.mltcode.paycertificationapi.XXXIiXX0;
import com.android.mltcode.paycertificationapi.XXiOXI;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0iiOX1Ii;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OI0i11O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.iOiXIOiiO;
import com.android.mltcode.paycertificationapi.iiI00Xi;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.ut3;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.baseble.connector.AbsBleConnector;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.BleOpRecord;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.SearchOpRecord;
import com.sma.smartv3.network.UploadOpRecord;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.BaseListFunctionActivity;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.component.BleHandleCallback;
import com.szabh.smable3.entity.BleAICoachBeforePlan;
import com.szabh.smable3.entity.BleAICoachBeforePlanV2;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import com.szabh.smable3.entity.BleAICoachGeneratePlanV2;
import com.szabh.smable3.entity.BleAICommand;
import com.szabh.smable3.entity.BleActivity;
import com.szabh.smable3.entity.BleActivityDetail;
import com.szabh.smable3.entity.BleAddressBook;
import com.szabh.smable3.entity.BleAirPressureCalibration;
import com.szabh.smable3.entity.BleAlarm;
import com.szabh.smable3.entity.BleAlipayBindInfo;
import com.szabh.smable3.entity.BleAlipaySettings;
import com.szabh.smable3.entity.BleAppAudioBookList;
import com.szabh.smable3.entity.BleAppInfoList;
import com.szabh.smable3.entity.BleAppOp;
import com.szabh.smable3.entity.BleAppSportState;
import com.szabh.smable3.entity.BleAvgHeartRate;
import com.szabh.smable3.entity.BleBAC;
import com.szabh.smable3.entity.BleBWNaviInfo;
import com.szabh.smable3.entity.BleBacCalibration;
import com.szabh.smable3.entity.BleBandKey;
import com.szabh.smable3.entity.BleBatteryUsage;
import com.szabh.smable3.entity.BleBloodGlucose;
import com.szabh.smable3.entity.BleBloodOxyGenSettings;
import com.szabh.smable3.entity.BleBloodOxygen;
import com.szabh.smable3.entity.BleBloodPressure;
import com.szabh.smable3.entity.BleBloodPressureCalibration;
import com.szabh.smable3.entity.BleBodyStatus;
import com.szabh.smable3.entity.BleCPChat;
import com.szabh.smable3.entity.BleCPGiftsInfo;
import com.szabh.smable3.entity.BleCPListener;
import com.szabh.smable3.entity.BleCPMissYou;
import com.szabh.smable3.entity.BleCPTodo;
import com.szabh.smable3.entity.BleCPUserInfo;
import com.szabh.smable3.entity.BleCalibrationData;
import com.szabh.smable3.entity.BleCalorieIntake;
import com.szabh.smable3.entity.BleChatApp;
import com.szabh.smable3.entity.BleChatMessage;
import com.szabh.smable3.entity.BleChatVoice;
import com.szabh.smable3.entity.BleCheckInEveryDay;
import com.szabh.smable3.entity.BleCoachingIds;
import com.szabh.smable3.entity.BleCyWeeAlgorithm;
import com.szabh.smable3.entity.BleDeviceFile;
import com.szabh.smable3.entity.BleDeviceFile2;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleDeviceInfo2;
import com.szabh.smable3.entity.BleDeviceLanguages;
import com.szabh.smable3.entity.BleDeviceLanguages2;
import com.szabh.smable3.entity.BleDeviceSportData;
import com.szabh.smable3.entity.BleDeviceUniqueDataSettings;
import com.szabh.smable3.entity.BleDoubleScreenSettings;
import com.szabh.smable3.entity.BleDrinkWaterSettings;
import com.szabh.smable3.entity.BleECGRealtime;
import com.szabh.smable3.entity.BleEarphoneAncSettings;
import com.szabh.smable3.entity.BleEarphoneInfo;
import com.szabh.smable3.entity.BleEarphoneKey;
import com.szabh.smable3.entity.BleEarphonePower;
import com.szabh.smable3.entity.BleEarphoneSoundEffectsSettings;
import com.szabh.smable3.entity.BleEarphoneState;
import com.szabh.smable3.entity.BleEcg;
import com.szabh.smable3.entity.BleEcgSettings;
import com.szabh.smable3.entity.BleEnergyRating;
import com.szabh.smable3.entity.BleFactoryTest;
import com.szabh.smable3.entity.BleFindEarphone;
import com.szabh.smable3.entity.BleFoodBalance;
import com.szabh.smable3.entity.BleGSensorMotion;
import com.szabh.smable3.entity.BleGSensorRaw;
import com.szabh.smable3.entity.BleGSensorSHSY;
import com.szabh.smable3.entity.BleGameControl;
import com.szabh.smable3.entity.BleGestureWake;
import com.szabh.smable3.entity.BleGestureWake2;
import com.szabh.smable3.entity.BleGirlCareMonthly;
import com.szabh.smable3.entity.BleGirlCareSettings;
import com.szabh.smable3.entity.BleGoMoreSettings;
import com.szabh.smable3.entity.BleGolfMapCacheInfo;
import com.szabh.smable3.entity.BleGolfScore;
import com.szabh.smable3.entity.BleGolfSportSwitch;
import com.szabh.smable3.entity.BleGolfWatchMapInfo;
import com.szabh.smable3.entity.BleGolfWatchScore;
import com.szabh.smable3.entity.BleGolfWatchVersionInfo;
import com.szabh.smable3.entity.BleGoogleNaviInfo;
import com.szabh.smable3.entity.BleHRRaw;
import com.szabh.smable3.entity.BleHanBaoSettings;
import com.szabh.smable3.entity.BleHanBaoVibration;
import com.szabh.smable3.entity.BleHeartRate;
import com.szabh.smable3.entity.BleHeartRateZones;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleHrWarningSettings;
import com.szabh.smable3.entity.BleHrv;
import com.szabh.smable3.entity.BleHrvBaseLine;
import com.szabh.smable3.entity.BleHrvMonitoringSettings;
import com.szabh.smable3.entity.BleHydrationSettings;
import com.szabh.smable3.entity.BleIPCException;
import com.szabh.smable3.entity.BleIPCInfo;
import com.szabh.smable3.entity.BleIPCOTAState;
import com.szabh.smable3.entity.BleIPCState;
import com.szabh.smable3.entity.BleIPCStoresInfo;
import com.szabh.smable3.entity.BleIPCWifiInfo;
import com.szabh.smable3.entity.BleLactateThreshold;
import com.szabh.smable3.entity.BleLanguagePackVersion;
import com.szabh.smable3.entity.BleLeaveDay;
import com.szabh.smable3.entity.BleLocation;
import com.szabh.smable3.entity.BleLocationGga;
import com.szabh.smable3.entity.BleLocationGsv;
import com.szabh.smable3.entity.BleLogText;
import com.szabh.smable3.entity.BleLoveTap;
import com.szabh.smable3.entity.BleLoveTapUser;
import com.szabh.smable3.entity.BleMapFileList;
import com.szabh.smable3.entity.BleMatchRecord;
import com.szabh.smable3.entity.BleMatchRecord2;
import com.szabh.smable3.entity.BleMatchRecord3;
import com.szabh.smable3.entity.BleMeasurement;
import com.szabh.smable3.entity.BleMedicationAlarm;
import com.szabh.smable3.entity.BleMedicationReminder;
import com.szabh.smable3.entity.BleMeetingReminder;
import com.szabh.smable3.entity.BleMindStatus;
import com.szabh.smable3.entity.BleNaviInfo;
import com.szabh.smable3.entity.BleNoDisturbSettings;
import com.szabh.smable3.entity.BleNotificationSettings2;
import com.szabh.smable3.entity.BleOfflineAsrSettings;
import com.szabh.smable3.entity.BleOptionalMapAuthInfo;
import com.szabh.smable3.entity.BlePackageStatus;
import com.szabh.smable3.entity.BlePhysicalPower;
import com.szabh.smable3.entity.BlePower2;
import com.szabh.smable3.entity.BlePpgSHSY;
import com.szabh.smable3.entity.BlePressure;
import com.szabh.smable3.entity.BlePressureTimingMeasurement;
import com.szabh.smable3.entity.BleQiblaSettings;
import com.szabh.smable3.entity.BleRealTimeMeasurement;
import com.szabh.smable3.entity.BleRealtimeLog;
import com.szabh.smable3.entity.BleReceiveFilePacket;
import com.szabh.smable3.entity.BleRecordControl;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.BleRelaxReminder;
import com.szabh.smable3.entity.BleRespiratoryRate;
import com.szabh.smable3.entity.BleRingVibrationSettings;
import com.szabh.smable3.entity.BleRri;
import com.szabh.smable3.entity.BleSDCardInfo;
import com.szabh.smable3.entity.BleSGCameraSet;
import com.szabh.smable3.entity.BleSGKeySet;
import com.szabh.smable3.entity.BleSGKeywordAwake;
import com.szabh.smable3.entity.BleSGSet;
import com.szabh.smable3.entity.BleSGTest;
import com.szabh.smable3.entity.BleSGTts;
import com.szabh.smable3.entity.BleSMSQuickReply;
import com.szabh.smable3.entity.BleSOSSettings;
import com.szabh.smable3.entity.BleSedentarinessSettings;
import com.szabh.smable3.entity.BleSettingWatchPassword;
import com.szabh.smable3.entity.BleSleep;
import com.szabh.smable3.entity.BleSleepNotify;
import com.szabh.smable3.entity.BleSleepQuality;
import com.szabh.smable3.entity.BleSosCallLog;
import com.szabh.smable3.entity.BleSosContact;
import com.szabh.smable3.entity.BleStandbyWatchFaceSet;
import com.szabh.smable3.entity.BleStock;
import com.szabh.smable3.entity.BleTemperature;
import com.szabh.smable3.entity.BleThirdPartyData;
import com.szabh.smable3.entity.BleTrainingStatus;
import com.szabh.smable3.entity.BleTuyaKey;
import com.szabh.smable3.entity.BleUserProfile;
import com.szabh.smable3.entity.BleVideoCallInfo;
import com.szabh.smable3.entity.BleVitality;
import com.szabh.smable3.entity.BleWatchFaceId;
import com.szabh.smable3.entity.BleWatchFaceIndex;
import com.szabh.smable3.entity.BleWatchFaceMaxSize;
import com.szabh.smable3.entity.BleWechatPaySettings;
import com.szabh.smable3.entity.BleWorkout;
import com.szabh.smable3.entity.BleWorkout2;
import com.szabh.smable3.entity.BleWorkout3;
import com.szabh.smable3.entity.BleWorkout4;
import com.szabh.smable3.entity.BleWorkout4Segmentation;
import com.szabh.smable3.entity.BleWorldClock;
import com.szabh.smable3.entity.BleXMLYBandSet;
import com.szabh.smable3.entity.MusicCommand;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperAirPressureValueStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,482:1\n19#2:483\n15#2:484\n27#2,2:525\n176#3,11:485\n196#3:504\n176#3,11:505\n196#3:524\n252#4,7:496\n270#4:503\n252#4,7:516\n270#4:523\n1#5:527\n*S KotlinDebug\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity\n*L\n250#1:483\n250#1:484\n403#1:525,2\n339#1:485,11\n339#1:504\n377#1:505,11\n377#1:524\n339#1:496,7\n339#1:503\n377#1:516,7\n377#1:523\n*E\n"})
public final class DeveloperAirPressureValueStartActivity extends BaseListFunctionActivity<BleDevice> {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btStartAirPressureValue$delegate;

    @aa1
    private final Lazy btStopAirPressureValue$delegate;

    @aa1
    private final Lazy cbShutdown$delegate;

    @aa1
    private final Lazy cbSkipServer$delegate;

    @aa1
    private String deviceAddress;

    @aa1
    private final Lazy etAirPressureValue$delegate;

    @aa1
    private final Lazy etAltitude$delegate;

    @aa1
    private final Lazy etOldBleName$delegate;

    @aa1
    private final Lazy etSignal$delegate;

    @aa1
    private List<String> failedList;
    private boolean isAutoAirPressureValue;

    @aa1
    private final XIi00iiXO mBleHandleCallback;

    @aa1
    private final HashMap<String, Integer> mConnectedFailMap;

    @aa1
    private final Runnable mConnectedFailRunnable;

    @aa1
    private final Handler mHandler;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final Lazy mScanner$delegate;

    @aa1
    private final Lazy tvAlreadyAirPressureValue$delegate;

    @aa1
    private final Lazy tvSearchNumber$delegate;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[PermissionStatus.values().length];
            r0[PermissionStatus.GRANTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[PermissionStatus.DENIED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    @SourceDebugExtension({"SMAP\nDeveloperAirPressureValueStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$mBleHandleCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,482:1\n1#2:483\n19#3:484\n15#3:485\n19#3:486\n15#3:487\n11#3,2:488\n19#3:490\n15#3:491\n*S KotlinDebug\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$mBleHandleCallback$1\n*L\n183#1:484\n183#1:485\n217#1:486\n217#1:487\n220#1:488,2\n223#1:490\n223#1:491\n*E\n"})
    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ DeveloperAirPressureValueStartActivity IO;

        public XIi00iiXO(DeveloperAirPressureValueStartActivity r1) {
            this.IO = r1;
        }

        public static final void I0IIOi(DeveloperAirPressureValueStartActivity r2) {
            ToastUtils.showLong(R.string.auto_next_airpressure_value);
            EditText r0 = DeveloperAirPressureValueStartActivity.access$getEtOldBleName(r2);
            Intrinsics.O10IXXX0X(r0, "access$getEtOldBleName(...)");
            r2.startSearch(r0);
        }

        public static final void IiI10X(final DeveloperAirPressureValueStartActivity r10) {
            BleConnector r0 = BleConnector.INSTANCE;
            if (r0.isBound() == true) goto L5;
            BleKey r1 = BleKey.SESSION;
            BleKeyFlag r2 = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(r0, r1, r2, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt32$default(r0, r1, BleKeyFlag.UPDATE, r9.nextInt(), null, false, false, 56, null);
        L5:
            String r3 = DeveloperAirPressureValueStartActivity.access$getEtAirPressureValue(r10).getText().toString();
            String r4 = DeveloperAirPressureValueStartActivity.access$getEtAltitude(r10).getText().toString();
            BaseBleConnector.sendObject$default(r0, BleKey.AIR_PRESSURE_CALIBRATION, BleKeyFlag.UPDATE, new BleAirPressureCalibration(Integer.parseInt(r3), Integer.parseInt(r4)), false, false, 24, null);
            new Handler().postDelayed(new OOiii(r10), 2000);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void O00(DeveloperAirPressureValueStartActivity r8) {
            int r1 = 1;
            BleConnector.INSTANCE.closeConnection(true);
            Object[] r4 = 0;
            Object[] r5 = 0;
            BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.AIR_PRESSURE_CALIBRATION, null, 2, null);
            a01 r0 = a01.OXO1;
            SPUtils r2 = r0.IiI10X();
            Object r3 = new OOi001IXO(null, r1, 0 == true ? 1 : 0);
            Object r6 = new Gson().fromJson(r2.getString(OOi001IXO.class.getName()), OOi001IXO.class);
            if (r6 == null) goto L6;
            r3 = r6;
        L6:
            OOi001IXO r7 = (OOi001IXO) r3;
            r7.XO0O10().add(DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(r8));
            r0.IiI10X().put(OOi001IXO.class.getName(), new Gson().toJson(r7));
            TextView r9 = DeveloperAirPressureValueStartActivity.access$getTvAlreadyAirPressureValue(r8);
            SPUtils r10 = r0.IiI10X();
            Object r11 = new OOi001IXO(r5 == true ? 1 : 0, r1, r4 == true ? 1 : 0);
            Object r12 = new Gson().fromJson(r10.getString(OOi001IXO.class.getName()), OOi001IXO.class);
            if (r12 == null) goto L10;
            r11 = r12;
        L10:
            r9.setText(String.valueOf(((OOi001IXO) r11).XO0O10().size()));
            ToastUtils.showLong(R.string.auto_next_airpressure_value);
            uq r13 = DeveloperAirPressureValueStartActivity.access$getMLoadingPopup$p(r8);
            if (r13 == null) goto L13;
            r13.dismiss();
        L13:
            EditText r14 = DeveloperAirPressureValueStartActivity.access$getEtOldBleName(r8);
            Intrinsics.O10IXXX0X(r14, "access$getEtOldBleName(...)");
            r8.startSearch(r14);
            DeveloperAirPressureValueStartActivity.access$uploadOpRecord(r8, DeveloperAirPressureValueStartActivity.access$getEtOldBleName(r8).getText().toString(), DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(r8));
        }

        public static /* synthetic */ void OXO1(DeveloperAirPressureValueStartActivity r0) {
            XOO0ii0(r0);
        }

        public static /* synthetic */ void XIi00iiXO(DeveloperAirPressureValueStartActivity r0) {
            I0IIOi(r0);
        }

        public static /* synthetic */ void XO0O10(DeveloperAirPressureValueStartActivity r0) {
            O00(r0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void XOO0ii0(final DeveloperAirPressureValueStartActivity r7) {
            SPUtils r0 = a01.OXO1.IiI10X();
            Object r1 = new OOi001IXO(null, 1, 0 == true ? 1 : 0);
            Object r2 = new Gson().fromJson(r0.getString(OOi001IXO.class.getName()), OOi001IXO.class);
            if (r2 == null) goto L7;
            r1 = r2;
        L7:
            if (((OOi001IXO) r1).XO0O10().contains(DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(r7)) == false) goto L9;
            return;
        L9:
            uq r3 = DeveloperAirPressureValueStartActivity.access$getMLoadingPopup$p(r7);
            if (r3 == null) goto L12;
            r3.dismiss();
        L12:
            i1O0OXO1O.OXO1.OXO1(DeveloperAirPressureValueStartActivity.access$getTAG$p(r7) + " force closeConnection " + DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(r7));
            BleConnector.INSTANCE.closeConnection(true);
            BaseBleCache.remove$default(BleCache.INSTANCE, BleKey.AIR_PRESSURE_CALIBRATION, null, 2, null);
            DeveloperAirPressureValueStartActivity.access$getFailedList$p(r7).add(DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(r7));
            ThreadUtils.runOnUiThread(new I0OXiX1iX(r7));
        }

        public static /* synthetic */ void iO(DeveloperAirPressureValueStartActivity r0) {
            IiI10X(r0);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICoachGeneratePlanUpdate(int r1) {
            super.onAICoachGeneratePlanUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICommandUpdate(BleAICommand r1) {
            super.onAICommandUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onActivityRecognitionUpdate(int r1) {
            super.onActivityRecognitionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmAdd(BleAlarm r1) {
            super.onAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmDelete(int r1) {
            super.onAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmUpdate(BleAlarm r1) {
            super.onAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppOpUpdate(BleAppOp r1) {
            super.onAppOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppSportDataResponse(boolean r1) {
            super.onAppSportDataResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBWNaviInfoUpdate(BleBWNaviInfo r1) {
            super.onBWNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBacklightUpdate(int r1) {
            super.onBacklightUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBandKeyUpdate(BleBandKey r1) {
            super.onBandKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleGolfScore(BleGolfScore r1) {
            super.onBleGolfScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleThirdPartyDataUpdate(BleThirdPartyData r1) {
            super.onBleThirdPartyDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleVideoCallInfo(BleVideoCallInfo r1) {
            super.onBleVideoCallInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPChatUpdate(BleCPChat r1) {
            super.onCPChatUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPGiftsInfoUpdate(BleCPGiftsInfo r1) {
            super.onCPGiftsInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPListenerUpdate(BleCPListener r1) {
            super.onCPListenerUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPMissYouUpdate(BleCPMissYou r1) {
            super.onCPMissYouUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPTodoUpdate(BleCPTodo r1) {
            super.onCPTodoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCaloriesGoalUpdate(int r1) {
            super.onCaloriesGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraResponse(boolean r1, int r2) {
            super.onCameraResponse(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraStateChange(int r1) {
            super.onCameraStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatAppUpdate(BleChatApp r1) {
            super.onChatAppUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatMessageUpdate(BleChatMessage r1) {
            super.onChatMessageUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatVoiceUpdate(BleChatVoice r1) {
            super.onChatVoiceUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCheckInEveryDayUpdate(BleCheckInEveryDay r1) {
            super.onCheckInEveryDayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onClassicBluetoothStateChange(int r1) {
            super.onClassicBluetoothStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandReply(BleKey r9, BleKeyFlag r10, boolean r11) {
            Intrinsics.X0O(r9, "bleKey");
            Intrinsics.X0O(r10, "bleKeyFlag");
            if (r9 != BleKey.AIR_PRESSURE_CALIBRATION) goto L13;
            uq r12 = DeveloperAirPressureValueStartActivity.access$getMLoadingPopup$p(this.IO);
            if (r12 == null) goto L7;
            r12.dismiss();
        L7:
            i1O0OXO1O r13 = i1O0OXO1O.OXO1;
            r13.OXO1(DeveloperAirPressureValueStartActivity.access$getTAG$p(this.IO) + " AirPressure Value success " + DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(this.IO));
            if (DeveloperAirPressureValueStartActivity.access$getCbShutdown(this.IO).isChecked() == false) goto L10;
            r13.OXO1(DeveloperAirPressureValueStartActivity.access$getTAG$p(this.IO) + " need shutdown");
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            long r14 = 1000;
        L11:
            Handler r15 = new Handler();
            final DeveloperAirPressureValueStartActivity r0 = this.IO;
            r15.postDelayed(new i0iiOX1Ii(r0), r14);
            return;
        L10:
            r14 = 100;
            goto L11
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCommandSendTimeout(BleKey r1, BleKeyFlag r2) {
            super.onCommandSendTimeout(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onContactUsStateChange(int r1) {
            super.onContactUsStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteAICoachPlan() {
            super.onDeleteAICoachPlan();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteFileResponse(int r1) {
            super.onDeleteFileResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onDeviceConnected(BluetoothDevice r5) {
            Intrinsics.X0O(r5, "device");
            DeveloperAirPressureValueStartActivity.access$getBtStopAirPressureValue(this.IO).setVisibility(0);
            i1O0OXO1O.OXO1.OXO1(DeveloperAirPressureValueStartActivity.access$getTAG$p(this.IO) + " onDeviceConnected -> " + r5);
            Handler r6 = new Handler();
            final DeveloperAirPressureValueStartActivity r0 = this.IO;
            r6.postDelayed(new OiOOIX(r0), 3000);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnecting(boolean r1) {
            super.onDeviceConnecting(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceFileUpdate(BleDeviceFile r1) {
            super.onDeviceFileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceOpUpdate(int r1) {
            super.onDeviceOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceRequestAGpsFile(String r1) {
            super.onDeviceRequestAGpsFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSMSQuickReply(BleSMSQuickReply r1) {
            super.onDeviceSMSQuickReply(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSportDataUpdate(BleDeviceSportData r1) {
            super.onDeviceSportDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDistanceGoalUpdate(int r1) {
            super.onDistanceGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDoubleScreenSettingsUpdate(BleDoubleScreenSettings r1) {
            super.onDoubleScreenSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDrinkWaterUpdate(BleDrinkWaterSettings r1) {
            super.onDrinkWaterUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings r1) {
            super.onEarphoneAncSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneCallUpdate(int r1) {
            super.onEarphoneCallUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey r1) {
            super.onEarphoneKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(BleEarphoneSoundEffectsSettings r1) {
            super.onEarphoneSoundEffectsSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneStateUpdate(BleEarphoneState r1) {
            super.onEarphoneStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFactoryTestUpdate(BleFactoryTest r1) {
            super.onFactoryTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFallSetUpdate(int r1) {
            super.onFallSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindEarphoneUpdate(BleFindEarphone r1) {
            super.onFindEarphoneUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindPhone(boolean r1) {
            super.onFindPhone(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindWatchUpdate(int r1) {
            super.onFindWatchUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemDateFormat() {
            super.onFollowSystemDateFormat();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemHour() {
            super.onFollowSystemHour();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemLanguage(boolean r1) {
            super.onFollowSystemLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGameControlUpdate(BleGameControl r1) {
            super.onGameControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWake2Update(BleGestureWake2 r1) {
            super.onGestureWake2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWakeUpdate(BleGestureWake r1) {
            super.onGestureWakeUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGoogleNaviInfoUpdate(BleGoogleNaviInfo r1) {
            super.onGoogleNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDState(int r1) {
            super.onHIDState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDValueChange(int r1) {
            super.onHIDValueChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHRWarningSet(BleHrWarningSettings r1) {
            super.onHRWarningSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHanBaoVibrationStateChange(int r1) {
            super.onHanBaoVibrationStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHighAntiAssistChange(int r1) {
            super.onHighAntiAssistChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHourSystemUpdate(int r1) {
            super.onHourSystemUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHydrationUpdate(BleHydrationSettings r1) {
            super.onHydrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCExceptionUpdate(BleIPCException r1) {
            super.onIPCExceptionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCOTAStateUpdate(BleIPCOTAState r1) {
            super.onIPCOTAStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStateUpdate(BleIPCState r1) {
            super.onIPCStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStoresInfoUpdate(BleIPCStoresInfo r1) {
            super.onIPCStoresInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCWifiInfoUpdate(BleIPCWifiInfo r1) {
            super.onIPCWifiInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityCreate(boolean r1, BleDeviceInfo r2) {
            super.onIdentityCreate(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDelete(boolean r1) {
            super.onIdentityDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDeleteByDevice(boolean r1) {
            super.onIdentityDeleteByDevice(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallRingUpdate(int r1) {
            super.onIncomingCallRingUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallStatus(int r1) {
            super.onIncomingCallStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUpdate(BleLoveTap r1) {
            super.onLoveTapUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserDelete(int r1) {
            super.onLoveTapUserDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserUpdate(BleLoveTapUser r1) {
            super.onLoveTapUserUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeasurementUpdate(BleMeasurement r1) {
            super.onMeasurementUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmAdd(BleMedicationAlarm r1) {
            super.onMedicationAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmDelete(int r1) {
            super.onMedicationAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmUpdate(BleMedicationAlarm r1) {
            super.onMedicationAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderDelete(int r1) {
            super.onMedicationReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderUpdate(BleMedicationReminder r1) {
            super.onMedicationReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderAdd(BleMeetingReminder r1) {
            super.onMeetingReminderAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderDelete(int r1) {
            super.onMeetingReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderUpdate(BleMeetingReminder r1) {
            super.onMeetingReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferReadFile(int r1) {
            super.onMultiFileTransferReadFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferResponse(int r1) {
            super.onMultiFileTransferResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNaviInfoUpdate(BleNaviInfo r1) {
            super.onNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNoDisturbUpdate(BleNoDisturbSettings r1) {
            super.onNoDisturbUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationLightScreenSetUpdate(int r1) {
            super.onNotificationLightScreenSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationSettings2Update(BleNotificationSettings2 r1) {
            super.onNotificationSettings2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onOTA(boolean r1) {
            super.onOTA(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeState(int r1) {
            super.onPowerSaveModeState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeStateChange(int r1) {
            super.onPowerSaveModeStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onQiblaSettingsUpdate() {
            super.onQiblaSettingsUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfo(BleAICoachBeforePlan r1) {
            super.onReadAICoachGenerateBeforeInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onReadAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlan(BleAICoachGeneratePlan r1) {
            super.onReadAICoachPlan(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlanV2(BleAICoachGeneratePlanV2 r1) {
            super.onReadAICoachPlanV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivity(List<BleActivity> r1) {
            super.onReadActivity(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivityDetail(BleActivityDetail r1) {
            super.onReadActivityDetail(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAddressBook(BleAddressBook r1) {
            super.onReadAddressBook(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlarm(List<BleAlarm> r1) {
            super.onReadAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipayBindInfo(List<BleAlipayBindInfo> r1) {
            super.onReadAlipayBindInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipaySettings(BleAlipaySettings r1) {
            super.onReadAlipaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppApiVersion(String r1) {
            super.onReadAppApiVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppInfoList(BleAppInfoList r1) {
            super.onReadAppInfoList(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppSportState(BleAppSportState r1) {
            super.onReadAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAvgHeartRate(List<BleAvgHeartRate> r1) {
            super.onReadAvgHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBAC(List<BleBAC> r1) {
            super.onReadBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacCalibration(BleBacCalibration r1, BleKeyFlag r2) {
            super.onReadBacCalibration(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacklight(int r1) {
            super.onReadBacklight(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBatteryUsage(BleBatteryUsage r1) {
            super.onReadBatteryUsage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleAddress(String r1) {
            super.onReadBleAddress(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfMapCacheInfo(BleGolfMapCacheInfo r1) {
            super.onReadBleGolfMapCacheInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfSportSwitch(BleGolfSportSwitch r1) {
            super.onReadBleGolfSportSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchMapInfo(BleGolfWatchMapInfo r1) {
            super.onReadBleGolfWatchMapInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchVersionInfo(BleGolfWatchVersionInfo r1) {
            super.onReadBleGolfWatchVersionInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleHrv(List<BleHrv> r1) {
            super.onReadBleHrv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleLogText(List<BleLogText> r1) {
            super.onReadBleLogText(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodGlucose(List<BleBloodGlucose> r1) {
            super.onReadBloodGlucose(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxyGenSettings(BleBloodOxyGenSettings r1) {
            super.onReadBloodOxyGenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxygen(List<BleBloodOxygen> r1) {
            super.onReadBloodOxygen(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressure(List<BleBloodPressure> r1) {
            super.onReadBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressureCalibration(BleBloodPressureCalibration r1) {
            super.onReadBloodPressureCalibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBodyStatus(List<BleBodyStatus> r1) {
            super.onReadBodyStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCPUserInfo(BleCPUserInfo r1) {
            super.onReadCPUserInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalibrationData(BleCalibrationData r1) {
            super.onReadCalibrationData(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalorieIntake(List<BleCalorieIntake> r1) {
            super.onReadCalorieIntake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCaloriesGoal(int r1) {
            super.onReadCaloriesGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadChatApp(BleChatApp r1) {
            super.onReadChatApp(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCheckInEveryDay(BleCheckInEveryDay r1) {
            super.onReadCheckInEveryDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadClassicBluetoothState(int r1) {
            super.onReadClassicBluetoothState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCoachingIds(BleCoachingIds r1) {
            super.onReadCoachingIds(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCyWeeAlgorithm(BleCyWeeAlgorithm r1) {
            super.onReadCyWeeAlgorithm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDailyPower(List<BlePhysicalPower> r1) {
            super.onReadDailyPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDateFormat(int r1) {
            super.onReadDateFormat(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFile(BleDeviceFile r1) {
            super.onReadDeviceFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFileV2(BleDeviceFile2 r1) {
            super.onReadDeviceFileV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo(BleDeviceInfo r1) {
            super.onReadDeviceInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo2(BleDeviceInfo2 r1) {
            super.onReadDeviceInfo2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages(BleDeviceLanguages r1) {
            super.onReadDeviceLanguages(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages2(BleDeviceLanguages2 r1) {
            super.onReadDeviceLanguages2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings r1) {
            super.onReadDeviceUniqueDataSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDistanceGoal(int r1) {
            super.onReadDistanceGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDoubleScreenSettings(BleDoubleScreenSettings r1) {
            super.onReadDoubleScreenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDrinkWater(BleDrinkWaterSettings r1) {
            super.onReadDrinkWater(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadECGRealtime(BleECGRealtime r1) {
            super.onReadECGRealtime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneAncSettings(BleEarphoneAncSettings r1) {
            super.onReadEarphoneAncSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneCall(int r1) {
            super.onReadEarphoneCall(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo r1) {
            super.onReadEarphoneInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey r1) {
            super.onReadEarphoneKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphonePower(BleEarphonePower r1) {
            super.onReadEarphonePower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings r1) {
            super.onReadEarphoneSoundEffectsSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneState(BleEarphoneState r1) {
            super.onReadEarphoneState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcg(List<BleEcg> r1) {
            super.onReadEcg(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcgSettings(BleEcgSettings r1) {
            super.onReadEcgSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEnergyRating(List<BleEnergyRating> r1) {
            super.onReadEnergyRating(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFallSet(int r1) {
            super.onReadFallSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFilePath(BleAppAudioBookList r1) {
            super.onReadFilePath(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFirmwareVersion(String r1) {
            super.onReadFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFoodBalance(List<BleFoodBalance> r1) {
            super.onReadFoodBalance(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake(BleGestureWake r1) {
            super.onReadGestureWake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake2(BleGestureWake2 r1) {
            super.onReadGestureWake2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareMonthly(BleGirlCareMonthly r1) {
            super.onReadGirlCareMonthly(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareSettings(BleGirlCareSettings r1) {
            super.onReadGirlCareSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGoMoreSettings(BleGoMoreSettings r1) {
            super.onReadGoMoreSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGolfWatchScore(BleGolfWatchScore r1) {
            super.onReadGolfWatchScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGpsFirmwareVersion(String r1) {
            super.onReadGpsFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoSettings(BleHanBaoSettings r1) {
            super.onReadHanBaoSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoVibration(List<BleHanBaoVibration> r1) {
            super.onReadHanBaoVibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRate(List<BleHeartRate> r1) {
            super.onReadHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRateZones(BleHeartRateZones r1) {
            super.onReadHeartRateZones(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHourSystem(int r1) {
            super.onReadHourSystem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettings(BleHrMonitoringSettings r1) {
            super.onReadHrMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettingsV2(int r1) {
            super.onReadHrMonitoringSettingsV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvBaseLine(BleHrvBaseLine r1) {
            super.onReadHrvBaseLine(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvMonitoringSettings(BleHrvMonitoringSettings r1) {
            super.onReadHrvMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHydrationSettings(BleHydrationSettings r1) {
            super.onReadHydrationSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCInfo(BleIPCInfo r1) {
            super.onReadIPCInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCState(BleIPCState r1) {
            super.onReadIPCState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCStoresInfo(BleIPCStoresInfo r1) {
            super.onReadIPCStoresInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCVersion(String r1) {
            super.onReadIPCVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIncomingCallRing(int r1) {
            super.onReadIncomingCallRing(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLactateThreshold(List<BleLactateThreshold> r1) {
            super.onReadLactateThreshold(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguage(int r1) {
            super.onReadLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguagePackVersion(BleLanguagePackVersion r1) {
            super.onReadLanguagePackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLocation(List<BleLocation> r1) {
            super.onReadLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLoveTapUser(List<BleLoveTapUser> r1) {
            super.onReadLoveTapUser(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord(List<BleMatchRecord> r1) {
            super.onReadMatchRecord(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord2(List<BleMatchRecord2> r1) {
            super.onReadMatchRecord2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord3(List<BleMatchRecord3> r1) {
            super.onReadMatchRecord3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationAlarm(List<BleMedicationAlarm> r1) {
            super.onReadMedicationAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationReminder(List<BleMedicationReminder> r1) {
            super.onReadMedicationReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMeetingReminder(List<BleMeetingReminder> r1) {
            super.onReadMeetingReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMindStatus(List<BleMindStatus> r1) {
            super.onReadMindStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMtkOtaMeta() {
            super.onReadMtkOtaMeta();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMultiFileTransfer(BleMapFileList r1) {
            super.onReadMultiFileTransfer(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNetworkFirmwareVersion(String r1) {
            super.onReadNetworkFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNoDisturb(BleNoDisturbSettings r1) {
            super.onReadNoDisturb(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationLightScreenSet(int r1) {
            super.onReadNotificationLightScreenSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationSettings2(BleNotificationSettings2 r1) {
            super.onReadNotificationSettings2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOfflineAsrSettings(BleOfflineAsrSettings r1) {
            super.onReadOfflineAsrSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOngoingDialogue(int r1) {
            super.onReadOngoingDialogue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOptionalMapAuthInfo(BleOptionalMapAuthInfo r1) {
            super.onReadOptionalMapAuthInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPackageStatus(BlePackageStatus r1) {
            super.onReadPackageStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower(int r1) {
            super.onReadPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower2(BlePower2 r1) {
            super.onReadPower2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressure(List<BlePressure> r1) {
            super.onReadPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressureTimingMeasurement(BlePressureTimingMeasurement r1) {
            super.onReadPressureTimingMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadQiblaSettings(BleQiblaSettings r1) {
            super.onReadQiblaSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRecordControl(BleRecordControl r1) {
            super.onReadRecordControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRelaxReminder(BleRelaxReminder r1) {
            super.onReadRelaxReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRespiratoryRate(List<BleRespiratoryRate> r1) {
            super.onReadRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRestingHeartRate(int r1) {
            super.onReadRestingHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRingVibrationSet(BleRingVibrationSettings r1) {
            super.onReadRingVibrationSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRri(List<BleRri> r1) {
            super.onReadRri(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSDCardInfo(BleSDCardInfo r1) {
            super.onReadSDCardInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGCameraSet(BleSGCameraSet r1) {
            super.onReadSGCameraSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeySet(BleSGKeySet r1) {
            super.onReadSGKeySet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeywordAwake(BleSGKeywordAwake r1) {
            super.onReadSGKeywordAwake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSet(BleSGSet r1) {
            super.onReadSGSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSleepSet(int r1) {
            super.onReadSGSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSOSSettings(BleSOSSettings r1) {
            super.onReadSOSSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadScreenBrightnessSet(int r1) {
            super.onReadScreenBrightnessSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSedentariness(BleSedentarinessSettings r1) {
            super.onReadSedentariness(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleep(List<BleSleep> r1) {
            super.onReadSleep(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepGoal(int r1) {
            super.onReadSleepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepMonitoringMode(int r1) {
            super.onReadSleepMonitoringMode(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQuality(BleSleepQuality r1) {
            super.onReadSleepQuality(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQualityScore(int r1) {
            super.onReadSleepQualityScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRaw(byte[] r1) {
            super.onReadSleepRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRespiratoryRate(int r1) {
            super.onReadSleepRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRiskLevel(int r1) {
            super.onReadSleepRiskLevel(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepSet(int r1) {
            super.onReadSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosCallLog(List<BleSosCallLog> r1) {
            super.onReadSosCallLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosContact(BleSosContact r1) {
            super.onReadSosContact(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSportDurationGoal(int r1) {
            super.onReadSportDurationGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStandbyWatchFaceSet(BleStandbyWatchFaceSet r1) {
            super.onReadStandbyWatchFaceSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStepGoal(int r1) {
            super.onReadStepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(List<BleStock> r1) {
            super.onReadStock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperature(List<BleTemperature> r1) {
            super.onReadTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperatureUnit(int r1) {
            super.onReadTemperatureUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTrainingStatus(List<BleTrainingStatus> r1) {
            super.onReadTrainingStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTuyaKey(BleTuyaKey r1) {
            super.onReadTuyaKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUiPackVersion(String r1) {
            super.onReadUiPackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUnit(int r1) {
            super.onReadUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUserProfile(BleUserProfile r1) {
            super.onReadUserProfile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVitalityValue(List<BleVitality> r1) {
            super.onReadVitalityValue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVoiceControl(int r1) {
            super.onReadVoiceControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceId(BleWatchFaceId r1) {
            super.onReadWatchFaceId(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex r1) {
            super.onReadWatchFaceIndex(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceMaxSize(BleWatchFaceMaxSize r1) {
            super.onReadWatchFaceMaxSize(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceSwitch(int r1) {
            super.onReadWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchPassword(BleSettingWatchPassword r1) {
            super.onReadWatchPassword(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWearWayState(int r1) {
            super.onReadWearWayState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWeatherRealTime(boolean r1) {
            super.onReadWeatherRealTime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWechatPaySettings(BleWechatPaySettings r1) {
            super.onReadWechatPaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout(List<BleWorkout> r1) {
            super.onReadWorkout(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout2(List<BleWorkout2> r1) {
            super.onReadWorkout2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout3(List<BleWorkout3> r1) {
            super.onReadWorkout3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4(List<BleWorkout4> r1) {
            super.onReadWorkout4(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4Segmentation(BleWorkout4Segmentation r1) {
            super.onReadWorkout4Segmentation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorldClock(List<BleWorldClock> r1) {
            super.onReadWorldClock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRealTimeMeasurement(BleRealTimeMeasurement r1) {
            super.onRealTimeMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveCmTrace(byte[] r1, boolean r2) {
            super.onReceiveCmTrace(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveFilePacket(BleReceiveFilePacket r1) {
            super.onReceiveFilePacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorMotion(List<BleGSensorMotion> r1) {
            super.onReceiveGSensorMotion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorRaw(List<BleGSensorRaw> r1) {
            super.onReceiveGSensorRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorSHSY(List<BleGSensorSHSY> r1) {
            super.onReceiveGSensorSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveHRRaw(List<BleHRRaw> r1) {
            super.onReceiveHRRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGga(BleLocationGga r1) {
            super.onReceiveLocationGga(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGsv(List<BleLocationGsv> r1) {
            super.onReceiveLocationGsv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveMusicCommand(MusicCommand r1) {
            super.onReceiveMusicCommand(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceivePpgSHSY(List<BlePpgSHSY> r1) {
            super.onReceivePpgSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRealtimeLog(BleRealtimeLog r1) {
            super.onReceiveRealtimeLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRecordPacket(BleRecordPacket r1) {
            super.onReceiveRecordPacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRecordControlUpdate(BleRecordControl r1) {
            super.onRecordControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestAgpsPrerequisite() {
            super.onRequestAgpsPrerequisite();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestLocation(int r1) {
            super.onRequestLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRingVibrationSetUpdate(BleRingVibrationSettings r1) {
            super.onRingVibrationSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSDCardInfoUpdate(BleSDCardInfo r1) {
            super.onSDCardInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTestUpdate(BleSGTest r1) {
            super.onSGTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTtsUpdate(BleSGTts r1) {
            super.onSGTtsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSOSSettingsUpdate(BleSOSSettings r1) {
            super.onSOSSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onScreenBrightnessSetUpdate(int r1) {
            super.onScreenBrightnessSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean r5) {
            if (r5 == true) goto L14;
            i1O0OXO1O.OXO1.OXO1(DeveloperAirPressureValueStartActivity.access$getTAG$p(this.IO) + " ConnectedFailTime " + DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(this.IO) + i1iXIO.XO0O10 + DeveloperAirPressureValueStartActivity.access$getMConnectedFailMap$p(this.IO).get(DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(this.IO)));     // Catch: Exception -> L6
            HashMap r6 = DeveloperAirPressureValueStartActivity.access$getMConnectedFailMap$p(this.IO);     // Catch: Exception -> L6
            String r0 = DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(this.IO);     // Catch: Exception -> L6
            Object r1 = DeveloperAirPressureValueStartActivity.access$getMConnectedFailMap$p(this.IO).get(DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(this.IO));     // Catch: Exception -> L6
            if (r1 != null) goto L8;
            r1 = 0;     // Catch: Exception -> L6
        L8:
            r6.put(r0, Integer.valueOf(((Number) r1).intValue() + 1));     // Catch: Exception -> L6
            return;
        L6:
            e = move-exception;
            e.printStackTrace();
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSleepNotifyUpdate(BleSleepNotify r1) {
            super.onSleepNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSosContactUpdate(BleSosContact r1) {
            super.onSosContactUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSportEndNotifyUpdate(int r1) {
            super.onSportEndNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStandbyWatchFaceSetUpdate(BleStandbyWatchFaceSet r1) {
            super.onStandbyWatchFaceSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStepGoalUpdate(int r1) {
            super.onStepGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStockDelete(int r1) {
            super.onStockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            super.onStreamProgress(r1, r2, r3, r4, r5);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSyncData(int r1, BleKey r2) {
            super.onSyncData(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onTimeUpdate() {
            super.onTimeUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onUpdateAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachLeaveDay(BleLeaveDay r1) {
            super.onUpdateAICoachLeaveDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAppSportState(BleAppSportState r1) {
            super.onUpdateAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBAC(BleBAC r1) {
            super.onUpdateBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBloodPressure(BleBloodPressure r1) {
            super.onUpdateBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateHeartRate(BleHeartRate r1) {
            super.onUpdateHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateTemperature(BleTemperature r1) {
            super.onUpdateTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateWatchFaceSwitch(boolean r1) {
            super.onUpdateWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUserProfileUpdate(BleUserProfile r1) {
            super.onUserProfileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdate(int r1) {
            super.onVibrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdateV2(int r1) {
            super.onVibrationUpdateV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIdUpdate(boolean r1) {
            super.onWatchFaceIdUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexCreate(boolean r1) {
            super.onWatchFaceIndexCreate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexUpdate(BleWatchFaceIndex r1) {
            super.onWatchFaceIndexUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchPasswordUpdate(BleSettingWatchPassword r1) {
            super.onWatchPasswordUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWearWayUpdate(int r1) {
            super.onWearWayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWorldClockDelete(int r1) {
            super.onWorldClockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXMLYBandSetUpdate(BleXMLYBandSet r1) {
            super.onXMLYBandSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXModem(byte r1) {
            super.onXModem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(boolean r1) {
            super.onReadStock(r1);
        }
    }

    @SourceDebugExtension({"SMAP\nDeveloperAirPressureValueStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$mScanner$2$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,482:1\n19#2:483\n15#2:484\n1011#3,2:485\n*S KotlinDebug\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$mScanner$2$2\n*L\n114#1:483\n114#1:484\n120#1:485,2\n*E\n"})
    public static final class XO0O10 implements i1OIOOIiX {
        public final /* synthetic */ DeveloperAirPressureValueStartActivity OXO1;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$mScanner$2$2\n*L\n1#1,328:1\n120#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            public OXO1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T r1, T r2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) r1).getMRssi()), Integer.valueOf(-((BleDevice) r2).getMRssi()));
            }
        }

        public XO0O10(DeveloperAirPressureValueStartActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r3) {
            if (r3 == false) goto L7;
            DeveloperAirPressureValueStartActivity.access$getBtStartAirPressureValue(this.OXO1).setVisibility(8);
            return;
        L7:
            if (DeveloperAirPressureValueStartActivity.access$isAutoAirPressureValue$p(this.OXO1) == false) goto L14;
            DeveloperAirPressureValueStartActivity.access$getBtStartAirPressureValue(this.OXO1).setVisibility(8);
            if (DeveloperAirPressureValueStartActivity.access$getMList(this.OXO1).isEmpty() == false) goto L12;
            DeveloperAirPressureValueStartActivity.access$autoStart(this.OXO1);
            return;
        L12:
            DeveloperAirPressureValueStartActivity r4 = this.OXO1;
            EditText r0 = DeveloperAirPressureValueStartActivity.access$getEtOldBleName(r4);
            Intrinsics.O10IXXX0X(r0, "access$getEtOldBleName(...)");
            r4.startAirPressureValue(r0);
            return;
        L14:
            DeveloperAirPressureValueStartActivity.access$getBtStartAirPressureValue(this.OXO1).setVisibility(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r7) {
            Intrinsics.X0O(r7, "device");
            if (DeveloperAirPressureValueStartActivity.access$getMList(this.OXO1).contains(r7) == true) goto L17;
            SPUtils r0 = a01.OXO1.IiI10X();
            Object r1 = new OOi001IXO(null, 1, 0 == true ? 1 : 0);
            Object r2 = new Gson().fromJson(r0.getString(OOi001IXO.class.getName()), OOi001IXO.class);
            if (r2 == null) goto L10;
            r1 = r2;
        L10:
            if (((OOi001IXO) r1).XO0O10().contains(r7.getMBluetoothDevice().getAddress()) == false) goto L12;
            return;
        L12:
            DeveloperAirPressureValueStartActivity.access$getMList(this.OXO1).add(r7);
            List r8 = DeveloperAirPressureValueStartActivity.access$getMList(this.OXO1);
            if (r8.size() <= 1) goto L15;
            XiX0OOXI0.XOXiX0(r8, new OXO1());
        L15:
            TextView r9 = DeveloperAirPressureValueStartActivity.access$getTvSearchNumber(this.OXO1);
            DeveloperAirPressureValueStartActivity r3 = this.OXO1;
            r9.setText(r3.getString(R.string.device_found, new Object[]{Integer.valueOf(DeveloperAirPressureValueStartActivity.access$getMList(r3).size())}));
            DeveloperAirPressureValueStartActivity.access$getMListAdapter(this.OXO1).notifyDataSetChanged();
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    @SourceDebugExtension({"SMAP\nDeveloperAirPressureValueStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$mScanner$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,482:1\n1#2:483\n*E\n"})
    public static final class iO implements OOXIOIiOO {
        public final /* synthetic */ DeveloperAirPressureValueStartActivity OXO1;

        public iO(DeveloperAirPressureValueStartActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice r10) {
            Intrinsics.X0O(r10, "device");
            a01 r0 = a01.OXO1;
            String r1 = r0.IiI10X().getString(b01.X00Xi1X, "");
            Intrinsics.O10IXXX0X(r1, "getString(...)");
            if (r1.length() != 0) goto L9;
            if (r10.getMRssi() <= r0.IiI10X().getInt(b01.XXiIiX10, -100)) goto L7;
            return true;
        L7:
            return false;
        L9:
            if (r10.getMRssi() > r0.IiI10X().getInt(b01.XXiIiX10, -100)) goto L11;
        L18:
            return false;
        L11:
            if (Intrinsics.XOO0ii0(q62.OXO1.iOO1ii1(r10.getMName()), r0.IiI10X().getString(b01.X00Xi1X, "")) == false) goto L18;
            Object r11 = DeveloperAirPressureValueStartActivity.access$getMConnectedFailMap$p(this.OXO1).get(DeveloperAirPressureValueStartActivity.access$getDeviceAddress$p(this.OXO1));
            if (r11 != null) goto L16;
            r11 = 0;
        L16:
            if (((Number) r11).intValue() >= 8) goto L18;
            return true;
        }
    }

    public DeveloperAirPressureValueStartActivity() {
        this.TAG = "AirPressureValue";
        this.etOldBleName$delegate = LazyKt__LazyJVMKt.iO(new iOiXIOiiO(this));
        this.btStartAirPressureValue$delegate = LazyKt__LazyJVMKt.iO(new I0IiII0(this));
        this.btStopAirPressureValue$delegate = LazyKt__LazyJVMKt.iO(new iiI00Xi(this));
        this.etSignal$delegate = LazyKt__LazyJVMKt.iO(new OX1XXOi0(this));
        this.tvSearchNumber$delegate = LazyKt__LazyJVMKt.iO(new i1OI0i11O(this));
        this.tvAlreadyAirPressureValue$delegate = LazyKt__LazyJVMKt.iO(new XXXIiXX0(this));
        this.cbShutdown$delegate = LazyKt__LazyJVMKt.iO(new XIX0XIII(this));
        this.cbSkipServer$delegate = LazyKt__LazyJVMKt.iO(new Ii0OO(this));
        this.etAirPressureValue$delegate = LazyKt__LazyJVMKt.iO(new XXiOXI(this));
        this.etAltitude$delegate = LazyKt__LazyJVMKt.iO(new XIiOi1i1(this));
        this.failedList = new ArrayList();
        this.deviceAddress = "";
        this.mScanner$delegate = LazyKt__LazyJVMKt.iO(new I1iOX(this));
        this.mConnectedFailMap = new HashMap();
        this.mHandler = new Handler();
        this.mConnectedFailRunnable = new OOi0X1(this);
        this.mBleHandleCallback = new XIi00iiXO(this);
    }

    public static /* synthetic */ OXOI0XII I1(DeveloperAirPressureValueStartActivity r0) {
        return mScanner_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox I1XOi1(DeveloperAirPressureValueStartActivity r0) {
        return cbSkipServer_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(DeveloperAirPressureValueStartActivity r0) {
        return tvSearchNumber_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(DeveloperAirPressureValueStartActivity r0, PermissionStatus r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView O10IXXX0X(DeveloperAirPressureValueStartActivity r0) {
        return tvAlreadyAirPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText OII(DeveloperAirPressureValueStartActivity r0) {
        return etSignal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OX(DeveloperAirPressureValueStartActivity r0) {
        return permissionBackgroundLocationRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ AppCompatButton OiIIX101O(DeveloperAirPressureValueStartActivity r0) {
        return btStartAirPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X01IiOiIi(DeveloperAirPressureValueStartActivity r0) {
        return etOldBleName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatButton X0O(DeveloperAirPressureValueStartActivity r0) {
        return btStopAirPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(DeveloperAirPressureValueStartActivity r0) {
        return etAirPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox XX0(DeveloperAirPressureValueStartActivity r0) {
        return cbShutdown_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText XiOIO(DeveloperAirPressureValueStartActivity r0) {
        return etAltitude_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(DeveloperAirPressureValueStartActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$0(r0, r1, r2, r3, r4);
    }

    public static final /* synthetic */ void access$autoStart(DeveloperAirPressureValueStartActivity r0) {
        r0.autoStart();
    }

    public static final /* synthetic */ AppCompatButton access$getBtStartAirPressureValue(DeveloperAirPressureValueStartActivity r0) {
        return r0.getBtStartAirPressureValue();
    }

    public static final /* synthetic */ AppCompatButton access$getBtStopAirPressureValue(DeveloperAirPressureValueStartActivity r0) {
        return r0.getBtStopAirPressureValue();
    }

    public static final /* synthetic */ CheckBox access$getCbShutdown(DeveloperAirPressureValueStartActivity r0) {
        return r0.getCbShutdown();
    }

    public static final /* synthetic */ String access$getDeviceAddress$p(DeveloperAirPressureValueStartActivity r0) {
        return r0.deviceAddress;
    }

    public static final /* synthetic */ EditText access$getEtAirPressureValue(DeveloperAirPressureValueStartActivity r0) {
        return r0.getEtAirPressureValue();
    }

    public static final /* synthetic */ EditText access$getEtAltitude(DeveloperAirPressureValueStartActivity r0) {
        return r0.getEtAltitude();
    }

    public static final /* synthetic */ EditText access$getEtOldBleName(DeveloperAirPressureValueStartActivity r0) {
        return r0.getEtOldBleName();
    }

    public static final /* synthetic */ List access$getFailedList$p(DeveloperAirPressureValueStartActivity r0) {
        return r0.failedList;
    }

    public static final /* synthetic */ HashMap access$getMConnectedFailMap$p(DeveloperAirPressureValueStartActivity r0) {
        return r0.mConnectedFailMap;
    }

    public static final /* synthetic */ List access$getMList(DeveloperAirPressureValueStartActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(DeveloperAirPressureValueStartActivity r0) {
        return r0.getMListAdapter();
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(DeveloperAirPressureValueStartActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ String access$getTAG$p(DeveloperAirPressureValueStartActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ TextView access$getTvAlreadyAirPressureValue(DeveloperAirPressureValueStartActivity r0) {
        return r0.getTvAlreadyAirPressureValue();
    }

    public static final /* synthetic */ TextView access$getTvSearchNumber(DeveloperAirPressureValueStartActivity r0) {
        return r0.getTvSearchNumber();
    }

    public static final /* synthetic */ boolean access$isAutoAirPressureValue$p(DeveloperAirPressureValueStartActivity r0) {
        return r0.isAutoAirPressureValue;
    }

    public static final /* synthetic */ void access$uploadOpRecord(DeveloperAirPressureValueStartActivity r0, String r1, String r2) {
        r0.uploadOpRecord(r1, r2);
    }

    private final void autoStart() {
        new Handler().postDelayed(new O1i1i0(this), 3000);
    }

    private static final void autoStart$lambda$0(DeveloperAirPressureValueStartActivity r3) {
        i1O0OXO1O.OXO1.OXO1(r3.TAG + " list is empty! ConnectedFailMap clear");
        r3.mConnectedFailMap.clear();
        EditText r0 = r3.getEtOldBleName();
        Intrinsics.O10IXXX0X(r0, "<get-etOldBleName>(...)");
        r3.startSearch(r0);
    }

    private static final AppCompatButton btStartAirPressureValue_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (AppCompatButton) r1.findViewById(R.id.bt_start_airpressure_value);
    }

    private static final AppCompatButton btStopAirPressureValue_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (AppCompatButton) r1.findViewById(R.id.bt_stop_airpressure_value);
    }

    private static final CheckBox cbShutdown_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (CheckBox) r1.findViewById(R.id.cb_shutdown);
    }

    private static final CheckBox cbSkipServer_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (CheckBox) r1.findViewById(R.id.cb_skip_server);
    }

    private static final EditText etAirPressureValue_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_airpressure_value);
    }

    private static final EditText etAltitude_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_altitude_value);
    }

    private static final EditText etOldBleName_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_old_ble_name);
    }

    private static final EditText etSignal_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_signal);
    }

    private final AppCompatButton getBtStartAirPressureValue() {
        return (AppCompatButton) getValue();
    }

    private final AppCompatButton getBtStopAirPressureValue() {
        return (AppCompatButton) getValue();
    }

    private final CheckBox getCbShutdown() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCbSkipServer() {
        return (CheckBox) getValue();
    }

    private final EditText getEtAirPressureValue() {
        return (EditText) getValue();
    }

    private final EditText getEtAltitude() {
        return (EditText) getValue();
    }

    private final EditText getEtOldBleName() {
        return (EditText) getValue();
    }

    private final EditText getEtSignal() {
        return (EditText) getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) getValue();
    }

    private final TextView getTvAlreadyAirPressureValue() {
        return (TextView) getValue();
    }

    private final TextView getTvSearchNumber() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void iIiiO(DeveloperAirPressureValueStartActivity r0) {
        autoStart$lambda$0(r0);
    }

    public static /* synthetic */ void iOOX010X(DeveloperAirPressureValueStartActivity r0) {
        mConnectedFailRunnable$lambda$0(r0);
    }

    private static final void initView$lambda$0(DeveloperAirPressureValueStartActivity r0, AdapterView r1, View r2, int r3, long r4) {
        r0.getEtOldBleName().setText(q62.OXO1.iOO1ii1(r0.getMList().get(r3).getMName()));
        EditText r5 = r0.getEtOldBleName();
        Intrinsics.O10IXXX0X(r5, "<get-etOldBleName>(...)");
        r0.startSearch(r5);
    }

    private static final void mConnectedFailRunnable$lambda$0(DeveloperAirPressureValueStartActivity r6) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(r6.TAG + " mConnectedFailRunnable " + r6.deviceAddress);
        uq r1 = r6.mLoadingPopup;
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.isShowing() != true) goto L15;
        HashMap<String, Integer> r2 = r6.mConnectedFailMap;
        String r3 = r6.deviceAddress;
        Integer r4 = r2.get(r3);
        if (r4 != null) goto L9;
        r4 = 0;
    L9:
        r2.put(r3, Integer.valueOf(r4.intValue() + 8));
        uq r5 = r6.mLoadingPopup;
        if (r5 == null) goto L12;
        r5.dismiss();
    L12:
        String r7 = r6.TAG;
        String r8 = r6.deviceAddress;
        r0.OXO1(r7 + " ConnectedFailTime " + r8 + " " + r6.mConnectedFailMap.get(r8) + " -> skip");
        BleConnector.INSTANCE.closeConnection(true);
        EditText r9 = r6.getEtOldBleName();
        Intrinsics.O10IXXX0X(r9, "<get-etOldBleName>(...)");
        r6.startSearch(r9);
        return;
    }

    private static final OXOI0XII mScanner_delegate$lambda$0(DeveloperAirPressureValueStartActivity r4) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(4).XiOIO(new iO(r4)).X1ii(new XO0O10(r4));
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (getMPermissionBackgroundPopup() != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.background_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new IXIIiOXOi(this));
        setMPermissionBackgroundPopup(r0);
    L5:
        go0 r1 = getMPermissionBackgroundPopup();
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean permissionBackgroundLocationRemind$lambda$0$0(DeveloperAirPressureValueStartActivity r2) {
        r2.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        permissionBackgroundLocationRemind();
        return;
    L6:
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new OX11Oi0(this), 3, null);
    }

    private static final Unit requestLocationPermission$lambda$0(DeveloperAirPressureValueStartActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        int r3 = OXO1.OXO1[r2.ordinal()];
        if (r3 != 1) goto L5;
        TextView r4 = r1.getTvAlreadyAirPressureValue();
        Intrinsics.O10IXXX0X(r4, "<get-tvAlreadyAirPressureValue>(...)");
        r1.startSearch(r4);
    L10:
        return Unit.OXO1;
    L5:
        if (r3 == 2) goto L7;
        r1.permissionRemind();
        goto L10
    L7:
        r1.requestLocationPermission();
        goto L10
    }

    private final void searchOpRecord(final BleDevice r8) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " searchOpRecord " + r8);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap r1 = new HashMap();
        r1.put("bleName", r8.getMName());
        r1.put("mac", r8.getMBluetoothDevice().getAddress());
        r1.put("type", "1");
        final O1XIiIO<BleOpRecord[]> r2 = new AnonymousClass2(r8, this);
        final Activity r9 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), SearchOpRecord.URL);
        r0.printParam(r4 + SearchOpRecord.URL, r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + SearchOpRecord.URL;
        final O1XIiIO<Response<BleOpRecord[]>> r7 = new DeveloperAirPressureValueStartActivity$searchOpRecord$$inlined$post$default$1(r9, r2, r3);
        AndroidNetworking.post(r6).addBodyParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BleOpRecord[].class}), new DeveloperAirPressureValueStartActivity$searchOpRecord$$inlined$post$default$2(r7));
    }

    private static final TextView tvAlreadyAirPressureValue_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_already_airpressure_value);
    }

    private static final TextView tvSearchNumber_delegate$lambda$0(DeveloperAirPressureValueStartActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_search_number);
    }

    private final void uploadOpRecord(String r7, String r8) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " uploadOpRecord " + r7 + " " + r8);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap r1 = new HashMap();
        r1.put("bleName", r7);
        r1.put("mac", r8);
        r1.put("type", "1");
        final O1XIiIO<Object> r9 = new C34762();
        final Activity r10 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UploadOpRecord.URL);
        r0.printParam(r3 + UploadOpRecord.URL, r1);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + UploadOpRecord.URL;
        final O1XIiIO<Response<Object>> r6 = new DeveloperAirPressureValueStartActivity$uploadOpRecord$$inlined$post$default$1(r10, r9, r2);
        AndroidNetworking.post(r5).addBodyParameter(r1).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Object.class}), new DeveloperAirPressureValueStartActivity$uploadOpRecord$$inlined$post$default$2(r6));
    }

    public final void clearAirPressureValueHistory(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        a01.OXO1.IiI10X().remove(OOi001IXO.class.getName());
        getTvAlreadyAirPressureValue().setText("0");
        EditText r3 = getEtOldBleName();
        Intrinsics.O10IXXX0X(r3, "<get-etOldBleName>(...)");
        startSearch(r3);
        this.failedList.clear();
        this.mConnectedFailMap.clear();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleDevice) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getBtStartAirPressureValue().setVisibility(8);
        getBtStopAirPressureValue().setVisibility(8);
        getMListView().setOnItemClickListener(new I0XIII0(this));
        TextView r0 = getTvAlreadyAirPressureValue();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new OOi001IXO(null, 1, 0 == true ? 1 : 0);
        Object r3 = new Gson().fromJson(r1.getString(OOi001IXO.class.getName()), OOi001IXO.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        r0.setText(String.valueOf(((OOi001IXO) r2).XO0O10().size()));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_airpressure_value_start;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        EditText r0 = getEtOldBleName();
        Intrinsics.O10IXXX0X(r0, "<get-etOldBleName>(...)");
        startSearch(r0);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.setNeedBind(true);
        r0.setOtaMode(false);
        r0.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
        getMScanner().XIi00iiXO();
    }

    public final void startAirPressureValue(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        i1O0OXO1O r9 = i1O0OXO1O.OXO1;
        r9.OXO1(this.TAG + " startAirPressureValue failedList=" + this.failedList);
        r9.OXO1(this.TAG + " startAirPressureValue mConnectedFailMap=" + this.mConnectedFailMap);
        if (getEtAirPressureValue().getText().toString().length() != 0) goto L6;
        return;
    L6:
        if (getMList().isEmpty() == false) goto L9;
        ToastUtils.showLong(R.string.no_device_not_airpressure_value);
        return;
    L9:
        this.isAutoAirPressureValue = true;
        Iterator<BleDevice> r0 = getMList().iterator();
    L11:
        if (r0.hasNext() == false) goto L15;
        BleDevice r1 = r0.next();
        if (this.failedList.contains(r1.getMBluetoothDevice().getAddress()) == true) goto L11;
    L16:
        if (r1 != null) goto L20;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " no device");
        ToastUtils.showLong(R.string.no_device_to_airpressure_value);
        this.failedList.clear();
        autoStart();
        return;
    L20:
        if (this.mLoadingPopup != null) goto L22;
        this.mLoadingPopup = new uq(getMContext());
    L22:
        uq r2 = this.mLoadingPopup;
        if (r2 == null) goto L25;
        r2.IIX1OXO();
    L25:
        this.mHandler.postDelayed(this.mConnectedFailRunnable, TimeUnit.SECONDS.toMillis(30));
        getBtStopAirPressureValue().setVisibility(0);
        String r3 = r1.getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(r3, "getAddress(...)");
        this.deviceAddress = r3;
        BleConnector r4 = BleConnector.INSTANCE;
        r4.setNeedBind(false);
        r4.setMConnectDirectly(true);
        if (getCbSkipServer().isChecked() == false) goto L29;
        AbsBleConnector.setBleDevice$default(r4, r1, 0, 2, null).connect(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " " + this.isAutoAirPressureValue + " connect new device -> " + r1);
        return;
    L29:
        searchOpRecord(r1);
        return;
    L15:
        r1 = null;
        goto L16
    }

    public final void startSearch(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        this.mHandler.removeCallbacks(this.mConnectedFailRunnable);
        if (PermissionUtils.isGranted(new String[]{"android.permission.ACCESS_FINE_LOCATION"}) == true) goto L7;
        requestLocationPermission();
        return;
    L7:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L11;
        requestEnableBluetooth();
        return;
    L11:
        if (UtilsKt.X1() == true) goto L14;
        locationServerRemind();
        return;
    L14:
        ToastUtils.showLong(R.string.search_device_remind);
        if (getEtSignal().getText().toString().length() != 0) goto L17;
        getEtSignal().setText(StatisticData.ERROR_CODE_NOT_FOUND);
    L17:
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.XXiIiX10, -Integer.parseInt(getEtSignal().getText().toString()));
        r5.IiI10X().put(b01.X00Xi1X, getEtOldBleName().getText().toString());
        getMList().clear();
        getMListAdapter().notifyDataSetChanged();
        getTvSearchNumber().setText(getString(R.string.device_found, new Object[]{Integer.valueOf(getMList().size())}));
        getMScanner().XXI(true);
    }

    public final void stopAirPressureValue(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ToastUtils.showLong(R.string.close_auto_airpressure_value_tip);
        this.isAutoAirPressureValue = false;
        getBtStopAirPressureValue().setVisibility(8);
    }

    public void initItem(@aa1 ug6 r2, @aa1 BleDevice r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.tv_name, r3.getMName());
        r2.OII(R.id.tv_address, r3.getMBluetoothDevice().getAddress());
        ((ImageView) r2.O00(R.id.iv_rssi)).setImageLevel(-r3.getMRssi());
    }
}
