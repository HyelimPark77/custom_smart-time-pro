package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.IiXI010i;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.O1iXOiO;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.iI00I1XI;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.ut3;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.baseble.connector.AbsBleConnector;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bykv.p563vk.openvk.preload.falconx.statistic.StatisticData;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.BaseListFunctionActivity;
import com.sma.smartv3.p610ui.p612me.DeveloperIMEISetStartActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,510:1\n176#2,11:511\n196#2:530\n252#3,7:522\n270#3:529\n1#4:531\n19#5:532\n15#5:533\n27#5,2:534\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity\n*L\n286#1:511,11\n286#1:530\n286#1:522,7\n286#1:529\n410#1:532\n410#1:533\n434#1:534,2\n*E\n"})
public final class DeveloperIMEISetStartActivity extends BaseListFunctionActivity<BleDevice> {
    private boolean isAutoSet;
    private boolean isReadAgain;
    private boolean isWriteAgain;

    @tb1
    private IiXI010i mCurIMEICheckAvailableData;

    @tb1
    private C3006uq mLoadingPopup;
    private int mWriteType;

    @aa1
    private final String TAG = "IMEISet";

    @aa1
    private final Lazy etId$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0111
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.etId_delegate$lambda$0(this.f7296IO);
        }
    });

    @aa1
    private final Lazy spinnerWriteType$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOOX0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.spinnerWriteType_delegate$lambda$0(this.f5064IO);
        }
    });

    @aa1
    private String toId = "";

    @aa1
    private final Lazy etOldBleName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX100iI11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.etOldBleName_delegate$lambda$0(this.f8260IO);
        }
    });

    @aa1
    private final Lazy btStartSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOIi0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.btStartSet_delegate$lambda$0(this.f1811IO);
        }
    });

    @aa1
    private final Lazy btStopSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.btStopSet_delegate$lambda$0(this.f2884IO);
        }
    });

    @aa1
    private final Lazy etSignal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO11X00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.etSignal_delegate$lambda$0(this.f1757IO);
        }
    });

    @aa1
    private final Lazy tvSearchNumber$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.tvSearchNumber_delegate$lambda$0(this.f3540IO);
        }
    });

    @aa1
    private final Lazy tvValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1I1OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.tvValue_delegate$lambda$0(this.f1382IO);
        }
    });

    @aa1
    private String deviceAddress = "";

    @aa1
    private String deviceName = "";
    private int rssi = 100;

    @aa1
    private String filterName = "";

    @aa1
    private final Lazy mScanner$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0XXXXXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperIMEISetStartActivity.mScanner_delegate$lambda$0(this.f4049IO);
        }
    });

    @aa1
    private final HashMap<String, Integer> mConnectedFailMap = new HashMap<>();

    @aa1
    private final Handler mHandler = new Handler();

    @aa1
    private final Runnable mConnectedFailRunnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.XX1XiXO
        @Override // java.lang.Runnable
        public final void run() {
            DeveloperIMEISetStartActivity.mConnectedFailRunnable$lambda$0(this.f5006IO);
        }
    };

    @aa1
    private final C18891iO mBleHandleCallback = new C18891iO();

    @SourceDebugExtension({"SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,510:1\n1#2:511\n19#3:512\n15#3:513\n1011#4,2:514\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n*L\n135#1:512\n135#1:513\n141#1:514,2\n*E\n"})
    public static final class O00 implements i1OIOOIiX {

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n*L\n1#1,328:1\n141#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) t).getMRssi()), Integer.valueOf(-((BleDevice) t2).getMRssi()));
            }
        }

        public O00() {
        }

        public static final void O00(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
            EditText etOldBleName = developerIMEISetStartActivity.getEtOldBleName();
            Intrinsics.O10IXXX0X(etOldBleName, "access$getEtOldBleName(...)");
            developerIMEISetStartActivity.startSearch(etOldBleName);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean z) {
            if (z) {
                DeveloperIMEISetStartActivity.this.getBtStartSet().setVisibility(8);
                return;
            }
            if (!DeveloperIMEISetStartActivity.this.isAutoSet) {
                DeveloperIMEISetStartActivity.this.getBtStartSet().setVisibility(0);
                return;
            }
            DeveloperIMEISetStartActivity.this.getBtStartSet().setVisibility(8);
            if (!DeveloperIMEISetStartActivity.this.getMList().isEmpty()) {
                DeveloperIMEISetStartActivity developerIMEISetStartActivity = DeveloperIMEISetStartActivity.this;
                EditText etOldBleName = developerIMEISetStartActivity.getEtOldBleName();
                Intrinsics.O10IXXX0X(etOldBleName, "access$getEtOldBleName(...)");
                developerIMEISetStartActivity.startSet(etOldBleName);
                return;
            }
            i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " The search is empty, try again later");
            Handler handler = new Handler();
            final DeveloperIMEISetStartActivity developerIMEISetStartActivity2 = DeveloperIMEISetStartActivity.this;
            handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X1X10X1i
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperIMEISetStartActivity.O00.O00(developerIMEISetStartActivity2);
                }
            }, 2000L);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice device) {
            Intrinsics.X0O(device, "device");
            if (DeveloperIMEISetStartActivity.this.getMList().contains(device)) {
                return;
            }
            if (TextUtils.isEmpty(DeveloperIMEISetStartActivity.this.filterName) || Intrinsics.XOO0ii0(q62.OXO1.iOO1ii1(device.getMName()), DeveloperIMEISetStartActivity.this.filterName)) {
                Object obj = DeveloperIMEISetStartActivity.this.mConnectedFailMap.get(device.getMBluetoothDevice().getAddress());
                if (obj == null) {
                    obj = 0;
                }
                if (((Number) obj).intValue() >= 8) {
                    i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " " + device.getMBluetoothDevice().getAddress() + " When the connection times out, skip first");
                    return;
                }
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                Object ii00i1xi = new iI00I1XI(null, 1, null);
                Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(iI00I1XI.class.getName()), (Class<Object>) iI00I1XI.class);
                if (objFromJson != null) {
                    ii00i1xi = objFromJson;
                }
                if (!((iI00I1XI) ii00i1xi).XO0O10().contains(device.getMBluetoothDevice().getAddress())) {
                    DeveloperIMEISetStartActivity.this.getMList().add(device);
                    List mList = DeveloperIMEISetStartActivity.this.getMList();
                    if (mList.size() > 1) {
                        XiX0OOXI0.XOXiX0(mList, new OXO1());
                    }
                    TextView tvSearchNumber = DeveloperIMEISetStartActivity.this.getTvSearchNumber();
                    DeveloperIMEISetStartActivity developerIMEISetStartActivity = DeveloperIMEISetStartActivity.this;
                    tvSearchNumber.setText(developerIMEISetStartActivity.getString(R.string.device_found, Integer.valueOf(developerIMEISetStartActivity.getMList().size())));
                    DeveloperIMEISetStartActivity.this.getMListAdapter().notifyDataSetChanged();
                    return;
                }
                i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " " + device.getMBluetoothDevice().getAddress() + " The operation was successful");
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        /* JADX INFO: renamed from: iO */
        public void mo2019iO() {
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements AdapterView.OnItemSelectedListener {
        public XIi00iiXO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DeveloperIMEISetStartActivity.this.mWriteType = i;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static final class XO0O10 implements OOXIOIiOO {
        public XO0O10() {
        }

        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice device) {
            Intrinsics.X0O(device, "device");
            return device.getMRssi() > (-DeveloperIMEISetStartActivity.this.rssi);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperIMEISetStartActivity$getIMEIInfo$2 */
    public static final class C188902 implements O1XIiIO<IiXI010i> {
        public final /* synthetic */ String XIi00iiXO;

        public C188902(String str) {
            this.XIi00iiXO = str;
        }

        /* JADX INFO: renamed from: iO */
        public static final void m38528iO(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
            i1O0OXO1O.OXO1.OXO1(developerIMEISetStartActivity.TAG + " Shutdown success! Force closeConnection!");
            developerIMEISetStartActivity.reStart();
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void handleResponse(IiXI010i iiXI010i) {
            DeveloperIMEISetStartActivity.this.mCurIMEICheckAvailableData = iiXI010i;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(DeveloperIMEISetStartActivity.this.TAG + " getIMEIInfo handleResponse -> " + iiXI010i);
            if (iiXI010i == null || TextUtils.isEmpty(iiXI010i.m754iO())) {
                ToastUtils.showLong("没有可用的IMEI!...", new Object[0]);
                i1o0oxo1o.OXO1(DeveloperIMEISetStartActivity.this.TAG + " getIMEIInfo handleResponse -> no IMEI");
                DeveloperIMEISetStartActivity.this.reStart();
                return;
            }
            if (!Intrinsics.XOO0ii0(iiXI010i.m754iO(), this.XIi00iiXO)) {
                DeveloperIMEISetStartActivity.this.sendIMEI(iiXI010i.m754iO());
                return;
            }
            i1o0oxo1o.OXO1(DeveloperIMEISetStartActivity.this.TAG + " getIMEIInfo handleResponse -> Shutdown directly");
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            Handler handler = new Handler();
            final DeveloperIMEISetStartActivity developerIMEISetStartActivity = DeveloperIMEISetStartActivity.this;
            handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi1O0X1O
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperIMEISetStartActivity.C188902.m38528iO(developerIMEISetStartActivity);
                }
            }, 2000L);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            DeveloperIMEISetStartActivity.this.mCurIMEICheckAvailableData = null;
            i1O0OXO1O.OXO1.OXO1("getIMEIInfo -> error! " + error);
            DeveloperIMEISetStartActivity.this.reStart();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperIMEISetStartActivity$iO */
    @SourceDebugExtension({"SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mBleHandleCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,510:1\n1#2:511\n19#3:512\n15#3:513\n11#3,2:514\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mBleHandleCallback$1\n*L\n195#1:512\n195#1:513\n198#1:514,2\n*E\n"})
    public static final class C18891iO implements BleHandleCallback {
        public C18891iO() {
        }

        public static final void I0IIOi(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
            i1O0OXO1O.OXO1.OXO1(developerIMEISetStartActivity.TAG + " onReadDeviceUniqueDataSettings Shutdown success! Force closeConnection!");
            developerIMEISetStartActivity.reStart();
        }

        public static final void IiI10X(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
            if (developerIMEISetStartActivity.isWriteAgain || developerIMEISetStartActivity.mCurIMEICheckAvailableData == null) {
                return;
            }
            IiXI010i iiXI010i = developerIMEISetStartActivity.mCurIMEICheckAvailableData;
            Intrinsics.XXI(iiXI010i);
            developerIMEISetStartActivity.sendIMEI(iiXI010i.m754iO());
            developerIMEISetStartActivity.isWriteAgain = true;
        }

        public static final void O00(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.DEVICE_UNIQUE_DATA_SET, BleKeyFlag.READ, null, false, false, 28, null);
            developerIMEISetStartActivity.isReadAgain = true;
        }

        public static final void XOO0ii0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isBound()) {
                return;
            }
            BleKey bleKey = BleKey.SESSION;
            BleKeyFlag bleKeyFlag = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt32$default(bleConnector, bleKey, BleKeyFlag.UPDATE, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt8$default(bleConnector, BleKey.DEVICE_UNIQUE_DATA_SET, BleKeyFlag.READ, developerIMEISetStartActivity.mWriteType, false, false, 24, null);
            i1O0OXO1O.OXO1.OXO1(developerIMEISetStartActivity.TAG + " onDeviceConnected -> read DEVICE_UNIQUE_DATA_SET");
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICoachGeneratePlanUpdate(int i) {
            super.onAICoachGeneratePlanUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICommandUpdate(BleAICommand bleAICommand) {
            super.onAICommandUpdate(bleAICommand);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onActivityRecognitionUpdate(int i) {
            super.onActivityRecognitionUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmAdd(BleAlarm bleAlarm) {
            super.onAlarmAdd(bleAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmDelete(int i) {
            super.onAlarmDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmUpdate(BleAlarm bleAlarm) {
            super.onAlarmUpdate(bleAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppOpUpdate(BleAppOp bleAppOp) {
            super.onAppOpUpdate(bleAppOp);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppSportDataResponse(boolean z) {
            super.onAppSportDataResponse(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBWNaviInfoUpdate(BleBWNaviInfo bleBWNaviInfo) {
            super.onBWNaviInfoUpdate(bleBWNaviInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBacklightUpdate(int i) {
            super.onBacklightUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBandKeyUpdate(BleBandKey bleBandKey) {
            super.onBandKeyUpdate(bleBandKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleGolfScore(BleGolfScore bleGolfScore) {
            super.onBleGolfScore(bleGolfScore);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleThirdPartyDataUpdate(BleThirdPartyData bleThirdPartyData) {
            super.onBleThirdPartyDataUpdate(bleThirdPartyData);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleVideoCallInfo(BleVideoCallInfo bleVideoCallInfo) {
            super.onBleVideoCallInfo(bleVideoCallInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPChatUpdate(BleCPChat bleCPChat) {
            super.onCPChatUpdate(bleCPChat);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPGiftsInfoUpdate(BleCPGiftsInfo bleCPGiftsInfo) {
            super.onCPGiftsInfoUpdate(bleCPGiftsInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPListenerUpdate(BleCPListener bleCPListener) {
            super.onCPListenerUpdate(bleCPListener);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPMissYouUpdate(BleCPMissYou bleCPMissYou) {
            super.onCPMissYouUpdate(bleCPMissYou);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPTodoUpdate(BleCPTodo bleCPTodo) {
            super.onCPTodoUpdate(bleCPTodo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCaloriesGoalUpdate(int i) {
            super.onCaloriesGoalUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraResponse(boolean z, int i) {
            super.onCameraResponse(z, i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraStateChange(int i) {
            super.onCameraStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatAppUpdate(BleChatApp bleChatApp) {
            super.onChatAppUpdate(bleChatApp);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatMessageUpdate(BleChatMessage bleChatMessage) {
            super.onChatMessageUpdate(bleChatMessage);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatVoiceUpdate(BleChatVoice bleChatVoice) {
            super.onChatVoiceUpdate(bleChatVoice);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCheckInEveryDayUpdate(BleCheckInEveryDay bleCheckInEveryDay) {
            super.onCheckInEveryDayUpdate(bleCheckInEveryDay);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onClassicBluetoothStateChange(int i) {
            super.onClassicBluetoothStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandReply(BleKey bleKey, BleKeyFlag bleKeyFlag, boolean z) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            if (bleKey == BleKey.DEVICE_UNIQUE_DATA_SET) {
                if (z) {
                    i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " onCommandReply -> The code has been written, and the status needs to be read again!");
                    Handler handler = new Handler();
                    final DeveloperIMEISetStartActivity developerIMEISetStartActivity = DeveloperIMEISetStartActivity.this;
                    handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iiIO1iIXI
                        @Override // java.lang.Runnable
                        public final void run() {
                            DeveloperIMEISetStartActivity.C18891iO.O00(developerIMEISetStartActivity);
                        }
                    }, 2000L);
                    return;
                }
                i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " onCommandReply -> needs to be write again!");
                Handler handler2 = new Handler();
                final DeveloperIMEISetStartActivity developerIMEISetStartActivity2 = DeveloperIMEISetStartActivity.this;
                handler2.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIXiXI
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperIMEISetStartActivity.C18891iO.IiI10X(developerIMEISetStartActivity2);
                    }
                }, 2000L);
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            if (bleKey == BleKey.DEVICE_UNIQUE_DATA_SET) {
                DeveloperIMEISetStartActivity.this.reStart();
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onContactUsStateChange(int i) {
            super.onContactUsStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteAICoachPlan() {
            super.onDeleteAICoachPlan();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteFileResponse(int i) {
            super.onDeleteFileResponse(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onDeviceConnected(BluetoothDevice device) {
            Intrinsics.X0O(device, "device");
            DeveloperIMEISetStartActivity.this.getBtStopSet().setVisibility(0);
            Handler handler = new Handler();
            final DeveloperIMEISetStartActivity developerIMEISetStartActivity = DeveloperIMEISetStartActivity.this;
            handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IOXOXX
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperIMEISetStartActivity.C18891iO.XOO0ii0(developerIMEISetStartActivity);
                }
            }, 5000L);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnecting(boolean z) {
            super.onDeviceConnecting(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceFileUpdate(BleDeviceFile bleDeviceFile) {
            super.onDeviceFileUpdate(bleDeviceFile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceOpUpdate(int i) {
            super.onDeviceOpUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceRequestAGpsFile(String str) {
            super.onDeviceRequestAGpsFile(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSMSQuickReply(BleSMSQuickReply bleSMSQuickReply) {
            super.onDeviceSMSQuickReply(bleSMSQuickReply);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSportDataUpdate(BleDeviceSportData bleDeviceSportData) {
            super.onDeviceSportDataUpdate(bleDeviceSportData);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDistanceGoalUpdate(int i) {
            super.onDistanceGoalUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDoubleScreenSettingsUpdate(BleDoubleScreenSettings bleDoubleScreenSettings) {
            super.onDoubleScreenSettingsUpdate(bleDoubleScreenSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDrinkWaterUpdate(BleDrinkWaterSettings bleDrinkWaterSettings) {
            super.onDrinkWaterUpdate(bleDrinkWaterSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings bleEarphoneAncSettings) {
            super.onEarphoneAncSettingsUpdate(bleEarphoneAncSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneCallUpdate(int i) {
            super.onEarphoneCallUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey bleEarphoneKey) {
            super.onEarphoneKeyUpdate(bleEarphoneKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
            super.onEarphoneSoundEffectsSettingsUpdate(bleEarphoneSoundEffectsSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneStateUpdate(BleEarphoneState bleEarphoneState) {
            super.onEarphoneStateUpdate(bleEarphoneState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFactoryTestUpdate(BleFactoryTest bleFactoryTest) {
            super.onFactoryTestUpdate(bleFactoryTest);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFallSetUpdate(int i) {
            super.onFallSetUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindEarphoneUpdate(BleFindEarphone bleFindEarphone) {
            super.onFindEarphoneUpdate(bleFindEarphone);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindPhone(boolean z) {
            super.onFindPhone(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindWatchUpdate(int i) {
            super.onFindWatchUpdate(i);
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
        public /* bridge */ void onFollowSystemLanguage(boolean z) {
            super.onFollowSystemLanguage(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGameControlUpdate(BleGameControl bleGameControl) {
            super.onGameControlUpdate(bleGameControl);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWake2Update(BleGestureWake2 bleGestureWake2) {
            super.onGestureWake2Update(bleGestureWake2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWakeUpdate(BleGestureWake bleGestureWake) {
            super.onGestureWakeUpdate(bleGestureWake);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGoogleNaviInfoUpdate(BleGoogleNaviInfo bleGoogleNaviInfo) {
            super.onGoogleNaviInfoUpdate(bleGoogleNaviInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDState(int i) {
            super.onHIDState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDValueChange(int i) {
            super.onHIDValueChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHRWarningSet(BleHrWarningSettings bleHrWarningSettings) {
            super.onHRWarningSet(bleHrWarningSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHanBaoVibrationStateChange(int i) {
            super.onHanBaoVibrationStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHighAntiAssistChange(int i) {
            super.onHighAntiAssistChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHourSystemUpdate(int i) {
            super.onHourSystemUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHydrationUpdate(BleHydrationSettings bleHydrationSettings) {
            super.onHydrationUpdate(bleHydrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCExceptionUpdate(BleIPCException bleIPCException) {
            super.onIPCExceptionUpdate(bleIPCException);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCOTAStateUpdate(BleIPCOTAState bleIPCOTAState) {
            super.onIPCOTAStateUpdate(bleIPCOTAState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStateUpdate(BleIPCState bleIPCState) {
            super.onIPCStateUpdate(bleIPCState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStoresInfoUpdate(BleIPCStoresInfo bleIPCStoresInfo) {
            super.onIPCStoresInfoUpdate(bleIPCStoresInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCWifiInfoUpdate(BleIPCWifiInfo bleIPCWifiInfo) {
            super.onIPCWifiInfoUpdate(bleIPCWifiInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityCreate(boolean z, BleDeviceInfo bleDeviceInfo) {
            super.onIdentityCreate(z, bleDeviceInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDelete(boolean z) {
            super.onIdentityDelete(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDeleteByDevice(boolean z) {
            super.onIdentityDeleteByDevice(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallRingUpdate(int i) {
            super.onIncomingCallRingUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallStatus(int i) {
            super.onIncomingCallStatus(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUpdate(BleLoveTap bleLoveTap) {
            super.onLoveTapUpdate(bleLoveTap);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserDelete(int i) {
            super.onLoveTapUserDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserUpdate(BleLoveTapUser bleLoveTapUser) {
            super.onLoveTapUserUpdate(bleLoveTapUser);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeasurementUpdate(BleMeasurement bleMeasurement) {
            super.onMeasurementUpdate(bleMeasurement);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmAdd(BleMedicationAlarm bleMedicationAlarm) {
            super.onMedicationAlarmAdd(bleMedicationAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmDelete(int i) {
            super.onMedicationAlarmDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmUpdate(BleMedicationAlarm bleMedicationAlarm) {
            super.onMedicationAlarmUpdate(bleMedicationAlarm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderDelete(int i) {
            super.onMedicationReminderDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderUpdate(BleMedicationReminder bleMedicationReminder) {
            super.onMedicationReminderUpdate(bleMedicationReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderAdd(BleMeetingReminder bleMeetingReminder) {
            super.onMeetingReminderAdd(bleMeetingReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderDelete(int i) {
            super.onMeetingReminderDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderUpdate(BleMeetingReminder bleMeetingReminder) {
            super.onMeetingReminderUpdate(bleMeetingReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferReadFile(int i) {
            super.onMultiFileTransferReadFile(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferResponse(int i) {
            super.onMultiFileTransferResponse(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNaviInfoUpdate(BleNaviInfo bleNaviInfo) {
            super.onNaviInfoUpdate(bleNaviInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNoDisturbUpdate(BleNoDisturbSettings bleNoDisturbSettings) {
            super.onNoDisturbUpdate(bleNoDisturbSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationLightScreenSetUpdate(int i) {
            super.onNotificationLightScreenSetUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationSettings2Update(BleNotificationSettings2 bleNotificationSettings2) {
            super.onNotificationSettings2Update(bleNotificationSettings2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onOTA(boolean z) {
            super.onOTA(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeState(int i) {
            super.onPowerSaveModeState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeStateChange(int i) {
            super.onPowerSaveModeStateChange(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onQiblaSettingsUpdate() {
            super.onQiblaSettingsUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfo(BleAICoachBeforePlan bleAICoachBeforePlan) {
            super.onReadAICoachGenerateBeforeInfo(bleAICoachBeforePlan);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
            super.onReadAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlan(BleAICoachGeneratePlan bleAICoachGeneratePlan) {
            super.onReadAICoachPlan(bleAICoachGeneratePlan);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlanV2(BleAICoachGeneratePlanV2 bleAICoachGeneratePlanV2) {
            super.onReadAICoachPlanV2(bleAICoachGeneratePlanV2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivity(List<BleActivity> list) {
            super.onReadActivity(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivityDetail(BleActivityDetail bleActivityDetail) {
            super.onReadActivityDetail(bleActivityDetail);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAddressBook(BleAddressBook bleAddressBook) {
            super.onReadAddressBook(bleAddressBook);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlarm(List<BleAlarm> list) {
            super.onReadAlarm(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipayBindInfo(List<BleAlipayBindInfo> list) {
            super.onReadAlipayBindInfo(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipaySettings(BleAlipaySettings bleAlipaySettings) {
            super.onReadAlipaySettings(bleAlipaySettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppApiVersion(String str) {
            super.onReadAppApiVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppInfoList(BleAppInfoList bleAppInfoList) {
            super.onReadAppInfoList(bleAppInfoList);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppSportState(BleAppSportState bleAppSportState) {
            super.onReadAppSportState(bleAppSportState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAvgHeartRate(List<BleAvgHeartRate> list) {
            super.onReadAvgHeartRate(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBAC(List<BleBAC> list) {
            super.onReadBAC(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacCalibration(BleBacCalibration bleBacCalibration, BleKeyFlag bleKeyFlag) {
            super.onReadBacCalibration(bleBacCalibration, bleKeyFlag);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacklight(int i) {
            super.onReadBacklight(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBatteryUsage(BleBatteryUsage bleBatteryUsage) {
            super.onReadBatteryUsage(bleBatteryUsage);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleAddress(String str) {
            super.onReadBleAddress(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfMapCacheInfo(BleGolfMapCacheInfo bleGolfMapCacheInfo) {
            super.onReadBleGolfMapCacheInfo(bleGolfMapCacheInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfSportSwitch(BleGolfSportSwitch bleGolfSportSwitch) {
            super.onReadBleGolfSportSwitch(bleGolfSportSwitch);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchMapInfo(BleGolfWatchMapInfo bleGolfWatchMapInfo) {
            super.onReadBleGolfWatchMapInfo(bleGolfWatchMapInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchVersionInfo(BleGolfWatchVersionInfo bleGolfWatchVersionInfo) {
            super.onReadBleGolfWatchVersionInfo(bleGolfWatchVersionInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleHrv(List<BleHrv> list) {
            super.onReadBleHrv(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleLogText(List<BleLogText> list) {
            super.onReadBleLogText(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodGlucose(List<BleBloodGlucose> list) {
            super.onReadBloodGlucose(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxyGenSettings(BleBloodOxyGenSettings bleBloodOxyGenSettings) {
            super.onReadBloodOxyGenSettings(bleBloodOxyGenSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxygen(List<BleBloodOxygen> list) {
            super.onReadBloodOxygen(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressure(List<BleBloodPressure> list) {
            super.onReadBloodPressure(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressureCalibration(BleBloodPressureCalibration bleBloodPressureCalibration) {
            super.onReadBloodPressureCalibration(bleBloodPressureCalibration);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBodyStatus(List<BleBodyStatus> list) {
            super.onReadBodyStatus(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCPUserInfo(BleCPUserInfo bleCPUserInfo) {
            super.onReadCPUserInfo(bleCPUserInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalibrationData(BleCalibrationData bleCalibrationData) {
            super.onReadCalibrationData(bleCalibrationData);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalorieIntake(List<BleCalorieIntake> list) {
            super.onReadCalorieIntake(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCaloriesGoal(int i) {
            super.onReadCaloriesGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadChatApp(BleChatApp bleChatApp) {
            super.onReadChatApp(bleChatApp);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCheckInEveryDay(BleCheckInEveryDay bleCheckInEveryDay) {
            super.onReadCheckInEveryDay(bleCheckInEveryDay);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadClassicBluetoothState(int i) {
            super.onReadClassicBluetoothState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCoachingIds(BleCoachingIds bleCoachingIds) {
            super.onReadCoachingIds(bleCoachingIds);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCyWeeAlgorithm(BleCyWeeAlgorithm bleCyWeeAlgorithm) {
            super.onReadCyWeeAlgorithm(bleCyWeeAlgorithm);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDailyPower(List<BlePhysicalPower> list) {
            super.onReadDailyPower(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDateFormat(int i) {
            super.onReadDateFormat(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFile(BleDeviceFile bleDeviceFile) {
            super.onReadDeviceFile(bleDeviceFile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFileV2(BleDeviceFile2 bleDeviceFile2) {
            super.onReadDeviceFileV2(bleDeviceFile2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo(BleDeviceInfo bleDeviceInfo) {
            super.onReadDeviceInfo(bleDeviceInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo2(BleDeviceInfo2 bleDeviceInfo2) {
            super.onReadDeviceInfo2(bleDeviceInfo2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages(BleDeviceLanguages bleDeviceLanguages) {
            super.onReadDeviceLanguages(bleDeviceLanguages);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages2(BleDeviceLanguages2 bleDeviceLanguages2) {
            super.onReadDeviceLanguages2(bleDeviceLanguages2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings deviceUniqueDataSettings) {
            Intrinsics.X0O(deviceUniqueDataSettings, "deviceUniqueDataSettings");
            String str = new String(deviceUniqueDataSettings.getMData(), Charsets.IiI10X);
            IiXI010i iiXI010i = DeveloperIMEISetStartActivity.this.mCurIMEICheckAvailableData;
            if (Intrinsics.XOO0ii0(str, iiXI010i != null ? iiXI010i.m754iO() : null) || (!TextUtils.isEmpty(DeveloperIMEISetStartActivity.this.toId) && Intrinsics.XOO0ii0(str, DeveloperIMEISetStartActivity.this.toId))) {
                i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " onReadDeviceUniqueDataSettings -> done! " + DeveloperIMEISetStartActivity.this.deviceAddress + i1iXIO.XO0O10 + str);
                a01 a01Var = a01.OXO1;
                SPUtils sPUtilsIiI10X = a01Var.IiI10X();
                Object ii00i1xi = new iI00I1XI(null, 1, null);
                Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(iI00I1XI.class.getName()), (Class<Object>) iI00I1XI.class);
                if (objFromJson != null) {
                    ii00i1xi = objFromJson;
                }
                iI00I1XI ii00i1xi2 = (iI00I1XI) ii00i1xi;
                ii00i1xi2.XO0O10().add(DeveloperIMEISetStartActivity.this.deviceAddress);
                a01Var.IiI10X().put(iI00I1XI.class.getName(), new Gson().toJson(ii00i1xi2));
                DeveloperIMEISetStartActivity.this.getTvValue().setText(String.valueOf(ii00i1xi2.XO0O10().size()));
                BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
                Handler handler = new Handler();
                final DeveloperIMEISetStartActivity developerIMEISetStartActivity = DeveloperIMEISetStartActivity.this;
                handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1O11i
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeveloperIMEISetStartActivity.C18891iO.I0IIOi(developerIMEISetStartActivity);
                    }
                }, 2000L);
                return;
            }
            if (DeveloperIMEISetStartActivity.this.isReadAgain) {
                i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " onReadDeviceUniqueDataSettings -> imei failed!");
                DeveloperIMEISetStartActivity.this.mConnectedFailMap.put(DeveloperIMEISetStartActivity.this.deviceAddress, 10);
                DeveloperIMEISetStartActivity.this.reStart();
                return;
            }
            if (TextUtils.isEmpty(DeveloperIMEISetStartActivity.this.toId)) {
                i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " onReadDeviceUniqueDataSettings -> getIMEIInfo");
                DeveloperIMEISetStartActivity developerIMEISetStartActivity2 = DeveloperIMEISetStartActivity.this;
                developerIMEISetStartActivity2.getIMEIInfo(developerIMEISetStartActivity2.deviceName, DeveloperIMEISetStartActivity.this.deviceAddress, str);
                return;
            }
            i1O0OXO1O.OXO1.OXO1(DeveloperIMEISetStartActivity.this.TAG + " onReadDeviceUniqueDataSettings -> 直接写入");
            DeveloperIMEISetStartActivity developerIMEISetStartActivity3 = DeveloperIMEISetStartActivity.this;
            developerIMEISetStartActivity3.sendIMEI(developerIMEISetStartActivity3.toId);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDistanceGoal(int i) {
            super.onReadDistanceGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDoubleScreenSettings(BleDoubleScreenSettings bleDoubleScreenSettings) {
            super.onReadDoubleScreenSettings(bleDoubleScreenSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDrinkWater(BleDrinkWaterSettings bleDrinkWaterSettings) {
            super.onReadDrinkWater(bleDrinkWaterSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadECGRealtime(BleECGRealtime bleECGRealtime) {
            super.onReadECGRealtime(bleECGRealtime);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneAncSettings(BleEarphoneAncSettings bleEarphoneAncSettings) {
            super.onReadEarphoneAncSettings(bleEarphoneAncSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneCall(int i) {
            super.onReadEarphoneCall(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo bleEarphoneInfo) {
            super.onReadEarphoneInfo(bleEarphoneInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey bleEarphoneKey) {
            super.onReadEarphoneKey(bleEarphoneKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphonePower(BleEarphonePower bleEarphonePower) {
            super.onReadEarphonePower(bleEarphonePower);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
            super.onReadEarphoneSoundEffectsSettings(bleEarphoneSoundEffectsSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneState(BleEarphoneState bleEarphoneState) {
            super.onReadEarphoneState(bleEarphoneState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcg(List<BleEcg> list) {
            super.onReadEcg(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcgSettings(BleEcgSettings bleEcgSettings) {
            super.onReadEcgSettings(bleEcgSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEnergyRating(List<BleEnergyRating> list) {
            super.onReadEnergyRating(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFallSet(int i) {
            super.onReadFallSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFilePath(BleAppAudioBookList bleAppAudioBookList) {
            super.onReadFilePath(bleAppAudioBookList);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFirmwareVersion(String str) {
            super.onReadFirmwareVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFoodBalance(List<BleFoodBalance> list) {
            super.onReadFoodBalance(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake(BleGestureWake bleGestureWake) {
            super.onReadGestureWake(bleGestureWake);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake2(BleGestureWake2 bleGestureWake2) {
            super.onReadGestureWake2(bleGestureWake2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareMonthly(BleGirlCareMonthly bleGirlCareMonthly) {
            super.onReadGirlCareMonthly(bleGirlCareMonthly);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareSettings(BleGirlCareSettings bleGirlCareSettings) {
            super.onReadGirlCareSettings(bleGirlCareSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGoMoreSettings(BleGoMoreSettings bleGoMoreSettings) {
            super.onReadGoMoreSettings(bleGoMoreSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGolfWatchScore(BleGolfWatchScore bleGolfWatchScore) {
            super.onReadGolfWatchScore(bleGolfWatchScore);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGpsFirmwareVersion(String str) {
            super.onReadGpsFirmwareVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoSettings(BleHanBaoSettings bleHanBaoSettings) {
            super.onReadHanBaoSettings(bleHanBaoSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoVibration(List<BleHanBaoVibration> list) {
            super.onReadHanBaoVibration(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRate(List<BleHeartRate> list) {
            super.onReadHeartRate(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRateZones(BleHeartRateZones bleHeartRateZones) {
            super.onReadHeartRateZones(bleHeartRateZones);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHourSystem(int i) {
            super.onReadHourSystem(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettings(BleHrMonitoringSettings bleHrMonitoringSettings) {
            super.onReadHrMonitoringSettings(bleHrMonitoringSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettingsV2(int i) {
            super.onReadHrMonitoringSettingsV2(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvBaseLine(BleHrvBaseLine bleHrvBaseLine) {
            super.onReadHrvBaseLine(bleHrvBaseLine);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvMonitoringSettings(BleHrvMonitoringSettings bleHrvMonitoringSettings) {
            super.onReadHrvMonitoringSettings(bleHrvMonitoringSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHydrationSettings(BleHydrationSettings bleHydrationSettings) {
            super.onReadHydrationSettings(bleHydrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCInfo(BleIPCInfo bleIPCInfo) {
            super.onReadIPCInfo(bleIPCInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCState(BleIPCState bleIPCState) {
            super.onReadIPCState(bleIPCState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCStoresInfo(BleIPCStoresInfo bleIPCStoresInfo) {
            super.onReadIPCStoresInfo(bleIPCStoresInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCVersion(String str) {
            super.onReadIPCVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIncomingCallRing(int i) {
            super.onReadIncomingCallRing(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLactateThreshold(List<BleLactateThreshold> list) {
            super.onReadLactateThreshold(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguage(int i) {
            super.onReadLanguage(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguagePackVersion(BleLanguagePackVersion bleLanguagePackVersion) {
            super.onReadLanguagePackVersion(bleLanguagePackVersion);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLocation(List<BleLocation> list) {
            super.onReadLocation(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLoveTapUser(List<BleLoveTapUser> list) {
            super.onReadLoveTapUser(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord(List<BleMatchRecord> list) {
            super.onReadMatchRecord(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord2(List<BleMatchRecord2> list) {
            super.onReadMatchRecord2(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord3(List<BleMatchRecord3> list) {
            super.onReadMatchRecord3(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationAlarm(List<BleMedicationAlarm> list) {
            super.onReadMedicationAlarm(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationReminder(List<BleMedicationReminder> list) {
            super.onReadMedicationReminder(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMeetingReminder(List<BleMeetingReminder> list) {
            super.onReadMeetingReminder(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMindStatus(List<BleMindStatus> list) {
            super.onReadMindStatus(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMtkOtaMeta() {
            super.onReadMtkOtaMeta();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMultiFileTransfer(BleMapFileList bleMapFileList) {
            super.onReadMultiFileTransfer(bleMapFileList);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNetworkFirmwareVersion(String str) {
            super.onReadNetworkFirmwareVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNoDisturb(BleNoDisturbSettings bleNoDisturbSettings) {
            super.onReadNoDisturb(bleNoDisturbSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationLightScreenSet(int i) {
            super.onReadNotificationLightScreenSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationSettings2(BleNotificationSettings2 bleNotificationSettings2) {
            super.onReadNotificationSettings2(bleNotificationSettings2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOfflineAsrSettings(BleOfflineAsrSettings bleOfflineAsrSettings) {
            super.onReadOfflineAsrSettings(bleOfflineAsrSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOngoingDialogue(int i) {
            super.onReadOngoingDialogue(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOptionalMapAuthInfo(BleOptionalMapAuthInfo bleOptionalMapAuthInfo) {
            super.onReadOptionalMapAuthInfo(bleOptionalMapAuthInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPackageStatus(BlePackageStatus blePackageStatus) {
            super.onReadPackageStatus(blePackageStatus);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower(int i) {
            super.onReadPower(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower2(BlePower2 blePower2) {
            super.onReadPower2(blePower2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressure(List<BlePressure> list) {
            super.onReadPressure(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressureTimingMeasurement(BlePressureTimingMeasurement blePressureTimingMeasurement) {
            super.onReadPressureTimingMeasurement(blePressureTimingMeasurement);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadQiblaSettings(BleQiblaSettings bleQiblaSettings) {
            super.onReadQiblaSettings(bleQiblaSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRecordControl(BleRecordControl bleRecordControl) {
            super.onReadRecordControl(bleRecordControl);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRelaxReminder(BleRelaxReminder bleRelaxReminder) {
            super.onReadRelaxReminder(bleRelaxReminder);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRespiratoryRate(List<BleRespiratoryRate> list) {
            super.onReadRespiratoryRate(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRestingHeartRate(int i) {
            super.onReadRestingHeartRate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRingVibrationSet(BleRingVibrationSettings bleRingVibrationSettings) {
            super.onReadRingVibrationSet(bleRingVibrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRri(List<BleRri> list) {
            super.onReadRri(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSDCardInfo(BleSDCardInfo bleSDCardInfo) {
            super.onReadSDCardInfo(bleSDCardInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGCameraSet(BleSGCameraSet bleSGCameraSet) {
            super.onReadSGCameraSet(bleSGCameraSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeySet(BleSGKeySet bleSGKeySet) {
            super.onReadSGKeySet(bleSGKeySet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeywordAwake(BleSGKeywordAwake bleSGKeywordAwake) {
            super.onReadSGKeywordAwake(bleSGKeywordAwake);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSet(BleSGSet bleSGSet) {
            super.onReadSGSet(bleSGSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSleepSet(int i) {
            super.onReadSGSleepSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSOSSettings(BleSOSSettings bleSOSSettings) {
            super.onReadSOSSettings(bleSOSSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadScreenBrightnessSet(int i) {
            super.onReadScreenBrightnessSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSedentariness(BleSedentarinessSettings bleSedentarinessSettings) {
            super.onReadSedentariness(bleSedentarinessSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleep(List<BleSleep> list) {
            super.onReadSleep(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepGoal(int i) {
            super.onReadSleepGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepMonitoringMode(int i) {
            super.onReadSleepMonitoringMode(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQuality(BleSleepQuality bleSleepQuality) {
            super.onReadSleepQuality(bleSleepQuality);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQualityScore(int i) {
            super.onReadSleepQualityScore(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRaw(byte[] bArr) {
            super.onReadSleepRaw(bArr);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRespiratoryRate(int i) {
            super.onReadSleepRespiratoryRate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRiskLevel(int i) {
            super.onReadSleepRiskLevel(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepSet(int i) {
            super.onReadSleepSet(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosCallLog(List<BleSosCallLog> list) {
            super.onReadSosCallLog(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosContact(BleSosContact bleSosContact) {
            super.onReadSosContact(bleSosContact);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSportDurationGoal(int i) {
            super.onReadSportDurationGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStandbyWatchFaceSet(BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
            super.onReadStandbyWatchFaceSet(bleStandbyWatchFaceSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStepGoal(int i) {
            super.onReadStepGoal(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(List<BleStock> list) {
            super.onReadStock(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperature(List<BleTemperature> list) {
            super.onReadTemperature(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperatureUnit(int i) {
            super.onReadTemperatureUnit(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTrainingStatus(List<BleTrainingStatus> list) {
            super.onReadTrainingStatus(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTuyaKey(BleTuyaKey bleTuyaKey) {
            super.onReadTuyaKey(bleTuyaKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUiPackVersion(String str) {
            super.onReadUiPackVersion(str);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUnit(int i) {
            super.onReadUnit(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUserProfile(BleUserProfile bleUserProfile) {
            super.onReadUserProfile(bleUserProfile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVitalityValue(List<BleVitality> list) {
            super.onReadVitalityValue(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVoiceControl(int i) {
            super.onReadVoiceControl(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceId(BleWatchFaceId bleWatchFaceId) {
            super.onReadWatchFaceId(bleWatchFaceId);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex bleWatchFaceIndex) {
            super.onReadWatchFaceIndex(bleWatchFaceIndex);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceMaxSize(BleWatchFaceMaxSize bleWatchFaceMaxSize) {
            super.onReadWatchFaceMaxSize(bleWatchFaceMaxSize);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceSwitch(int i) {
            super.onReadWatchFaceSwitch(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchPassword(BleSettingWatchPassword bleSettingWatchPassword) {
            super.onReadWatchPassword(bleSettingWatchPassword);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWearWayState(int i) {
            super.onReadWearWayState(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWeatherRealTime(boolean z) {
            super.onReadWeatherRealTime(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWechatPaySettings(BleWechatPaySettings bleWechatPaySettings) {
            super.onReadWechatPaySettings(bleWechatPaySettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout(List<BleWorkout> list) {
            super.onReadWorkout(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout2(List<BleWorkout2> list) {
            super.onReadWorkout2(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout3(List<BleWorkout3> list) {
            super.onReadWorkout3(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4(List<BleWorkout4> list) {
            super.onReadWorkout4(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4Segmentation(BleWorkout4Segmentation bleWorkout4Segmentation) {
            super.onReadWorkout4Segmentation(bleWorkout4Segmentation);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorldClock(List<BleWorldClock> list) {
            super.onReadWorldClock(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRealTimeMeasurement(BleRealTimeMeasurement bleRealTimeMeasurement) {
            super.onRealTimeMeasurement(bleRealTimeMeasurement);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveCmTrace(byte[] bArr, boolean z) {
            super.onReceiveCmTrace(bArr, z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveFilePacket(BleReceiveFilePacket bleReceiveFilePacket) {
            super.onReceiveFilePacket(bleReceiveFilePacket);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorMotion(List<BleGSensorMotion> list) {
            super.onReceiveGSensorMotion(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorRaw(List<BleGSensorRaw> list) {
            super.onReceiveGSensorRaw(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorSHSY(List<BleGSensorSHSY> list) {
            super.onReceiveGSensorSHSY(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveHRRaw(List<BleHRRaw> list) {
            super.onReceiveHRRaw(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGga(BleLocationGga bleLocationGga) {
            super.onReceiveLocationGga(bleLocationGga);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGsv(List<BleLocationGsv> list) {
            super.onReceiveLocationGsv(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveMusicCommand(MusicCommand musicCommand) {
            super.onReceiveMusicCommand(musicCommand);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceivePpgSHSY(List<BlePpgSHSY> list) {
            super.onReceivePpgSHSY(list);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRealtimeLog(BleRealtimeLog bleRealtimeLog) {
            super.onReceiveRealtimeLog(bleRealtimeLog);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRecordPacket(BleRecordPacket bleRecordPacket) {
            super.onReceiveRecordPacket(bleRecordPacket);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRecordControlUpdate(BleRecordControl bleRecordControl) {
            super.onRecordControlUpdate(bleRecordControl);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestAgpsPrerequisite() {
            super.onRequestAgpsPrerequisite();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestLocation(int i) {
            super.onRequestLocation(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRingVibrationSetUpdate(BleRingVibrationSettings bleRingVibrationSettings) {
            super.onRingVibrationSetUpdate(bleRingVibrationSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSDCardInfoUpdate(BleSDCardInfo bleSDCardInfo) {
            super.onSDCardInfoUpdate(bleSDCardInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTestUpdate(BleSGTest bleSGTest) {
            super.onSGTestUpdate(bleSGTest);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTtsUpdate(BleSGTts bleSGTts) {
            super.onSGTtsUpdate(bleSGTts);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSOSSettingsUpdate(BleSOSSettings bleSOSSettings) {
            super.onSOSSettingsUpdate(bleSOSSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onScreenBrightnessSetUpdate(int i) {
            super.onScreenBrightnessSetUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean z) {
            if (z) {
                return;
            }
            try {
                HashMap map = DeveloperIMEISetStartActivity.this.mConnectedFailMap;
                String str = DeveloperIMEISetStartActivity.this.deviceAddress;
                Object obj = DeveloperIMEISetStartActivity.this.mConnectedFailMap.get(DeveloperIMEISetStartActivity.this.deviceAddress);
                if (obj == null) {
                    obj = 0;
                }
                map.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSleepNotifyUpdate(BleSleepNotify bleSleepNotify) {
            super.onSleepNotifyUpdate(bleSleepNotify);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSosContactUpdate(BleSosContact bleSosContact) {
            super.onSosContactUpdate(bleSosContact);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSportEndNotifyUpdate(int i) {
            super.onSportEndNotifyUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStandbyWatchFaceSetUpdate(BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
            super.onStandbyWatchFaceSetUpdate(bleStandbyWatchFaceSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStepGoalUpdate(int i) {
            super.onStepGoalUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStockDelete(int i) {
            super.onStockDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStreamProgress(boolean z, int i, int i2, int i3, BleKey bleKey) {
            super.onStreamProgress(z, i, i2, i3, bleKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSyncData(int i, BleKey bleKey) {
            super.onSyncData(i, bleKey);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onTimeUpdate() {
            super.onTimeUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
            super.onUpdateAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachLeaveDay(BleLeaveDay bleLeaveDay) {
            super.onUpdateAICoachLeaveDay(bleLeaveDay);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAppSportState(BleAppSportState bleAppSportState) {
            super.onUpdateAppSportState(bleAppSportState);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBAC(BleBAC bleBAC) {
            super.onUpdateBAC(bleBAC);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBloodPressure(BleBloodPressure bleBloodPressure) {
            super.onUpdateBloodPressure(bleBloodPressure);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateHeartRate(BleHeartRate bleHeartRate) {
            super.onUpdateHeartRate(bleHeartRate);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateTemperature(BleTemperature bleTemperature) {
            super.onUpdateTemperature(bleTemperature);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateWatchFaceSwitch(boolean z) {
            super.onUpdateWatchFaceSwitch(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUserProfileUpdate(BleUserProfile bleUserProfile) {
            super.onUserProfileUpdate(bleUserProfile);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdate(int i) {
            super.onVibrationUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdateV2(int i) {
            super.onVibrationUpdateV2(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIdUpdate(boolean z) {
            super.onWatchFaceIdUpdate(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexCreate(boolean z) {
            super.onWatchFaceIndexCreate(z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexUpdate(BleWatchFaceIndex bleWatchFaceIndex) {
            super.onWatchFaceIndexUpdate(bleWatchFaceIndex);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchPasswordUpdate(BleSettingWatchPassword bleSettingWatchPassword) {
            super.onWatchPasswordUpdate(bleSettingWatchPassword);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWearWayUpdate(int i) {
            super.onWearWayUpdate(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWorldClockDelete(int i) {
            super.onWorldClockDelete(i);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXMLYBandSetUpdate(BleXMLYBandSet bleXMLYBandSet) {
            super.onXMLYBandSetUpdate(bleXMLYBandSet);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXModem(byte b) {
            super.onXModem(b);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(boolean z) {
            super.onReadStock(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatButton btStartSet_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (AppCompatButton) developerIMEISetStartActivity.findViewById(R.id.bt_start_set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatButton btStopSet_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (AppCompatButton) developerIMEISetStartActivity.findViewById(R.id.bt_stop_set);
    }

    private final void dismissLoadPopup() {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIOIiOOO
            @Override // java.lang.Runnable
            public final void run() {
                DeveloperIMEISetStartActivity.dismissLoadPopup$lambda$0(this.f1618IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissLoadPopup$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        C3006uq c3006uq = developerIMEISetStartActivity.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etId_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (EditText) developerIMEISetStartActivity.findViewById(R.id.et_id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etOldBleName_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (EditText) developerIMEISetStartActivity.findViewById(R.id.et_old_ble_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etSignal_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (EditText) developerIMEISetStartActivity.findViewById(R.id.et_signal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatButton getBtStartSet() {
        return (AppCompatButton) this.btStartSet$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatButton getBtStopSet() {
        return (AppCompatButton) this.btStopSet$delegate.getValue();
    }

    private final EditText getEtId() {
        return (EditText) this.etId$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText getEtOldBleName() {
        return (EditText) this.etOldBleName$delegate.getValue();
    }

    private final EditText getEtSignal() {
        return (EditText) this.etSignal$delegate.getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) this.mScanner$delegate.getValue();
    }

    private final Spinner getSpinnerWriteType() {
        return (Spinner) this.spinnerWriteType$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvSearchNumber() {
        return (TextView) this.tvSearchNumber$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvValue() {
        return (TextView) this.tvValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(DeveloperIMEISetStartActivity developerIMEISetStartActivity, AdapterView adapterView, View view, int i, long j) {
        developerIMEISetStartActivity.getEtOldBleName().setText(q62.OXO1.iOO1ii1(developerIMEISetStartActivity.getMList().get(i).getMName()));
        EditText etOldBleName = developerIMEISetStartActivity.getEtOldBleName();
        Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
        developerIMEISetStartActivity.startSearch(etOldBleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mConnectedFailRunnable$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(developerIMEISetStartActivity.TAG + " mConnectedFailRunnable " + developerIMEISetStartActivity.deviceAddress);
        C3006uq c3006uq = developerIMEISetStartActivity.mLoadingPopup;
        if (c3006uq == null || !c3006uq.isShowing()) {
            return;
        }
        HashMap<String, Integer> map = developerIMEISetStartActivity.mConnectedFailMap;
        String str = developerIMEISetStartActivity.deviceAddress;
        Integer num = map.get(str);
        if (num == null) {
            num = 0;
        }
        map.put(str, Integer.valueOf(num.intValue() + 8));
        C3006uq c3006uq2 = developerIMEISetStartActivity.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.dismiss();
        }
        String str2 = developerIMEISetStartActivity.TAG;
        String str3 = developerIMEISetStartActivity.deviceAddress;
        i1o0oxo1o.OXO1(str2 + " ConnectedFailTime " + str3 + " " + developerIMEISetStartActivity.mConnectedFailMap.get(str3) + " -> skip");
        BleConnector.INSTANCE.closeConnection(true);
        EditText etOldBleName = developerIMEISetStartActivity.getEtOldBleName();
        Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
        developerIMEISetStartActivity.startSearch(etOldBleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OXOI0XII mScanner_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(developerIMEISetStartActivity.new XO0O10()).X1ii(developerIMEISetStartActivity.new O00());
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (getMPermissionBackgroundPopup() == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.background_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.i00XO0X0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeveloperIMEISetStartActivity.permissionBackgroundLocationRemind$lambda$0$0(this.f7283IO));
                }
            });
            setMPermissionBackgroundPopup(go0Var);
        }
        go0 mPermissionBackgroundPopup = getMPermissionBackgroundPopup();
        if (mPermissionBackgroundPopup != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            mPermissionBackgroundPopup.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionBackgroundLocationRemind$lambda$0$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        developerIMEISetStartActivity.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reStart() {
        this.mCurIMEICheckAvailableData = null;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " reStart");
        dismissLoadPopup();
        BleConnector.INSTANCE.unbind();
        EditText etOldBleName = getEtOldBleName();
        Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
        startSearch(etOldBleName);
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= 29) {
            permissionBackgroundLocationRemind();
            return;
        }
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.OIIXX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperIMEISetStartActivity.requestLocationPermission$lambda$0(this.f2979IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationPermission$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        int i = OXO1.OXO1[it.ordinal()];
        if (i == 1) {
            EditText etOldBleName = developerIMEISetStartActivity.getEtOldBleName();
            Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
            developerIMEISetStartActivity.startSearch(etOldBleName);
        } else if (i != 2) {
            developerIMEISetStartActivity.permissionRemind();
        } else {
            developerIMEISetStartActivity.requestLocationPermission();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendIMEI(String str) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " sendIMEI -> " + str);
        int i = this.mWriteType;
        byte[] bytes = str.getBytes(Charsets.IiI10X);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.DEVICE_UNIQUE_DATA_SET, BleKeyFlag.UPDATE, new BleDeviceUniqueDataSettings(i, bytes), false, false, 24, null);
    }

    private final void showLoadPopup() {
        C3006uq c3006uq;
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMContext());
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if ((c3006uq2 == null || !c3006uq2.isShowing()) && (c3006uq = this.mLoadingPopup) != null) {
            c3006uq.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spinner spinnerWriteType_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (Spinner) developerIMEISetStartActivity.findViewById(R.id.spinner_write_type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSearchNumber_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (TextView) developerIMEISetStartActivity.findViewById(R.id.tv_search_number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvValue_delegate$lambda$0(DeveloperIMEISetStartActivity developerIMEISetStartActivity) {
        return (TextView) developerIMEISetStartActivity.findViewById(R.id.tv_value);
    }

    public final void clearHistory(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " clearHistory");
        a01.OXO1.IiI10X().remove(iI00I1XI.class.getName());
        getTvValue().setText("0");
        EditText etOldBleName = getEtOldBleName();
        Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
        startSearch(etOldBleName);
        this.mConnectedFailMap.clear();
    }

    public final void getIMEIInfo(@aa1 String name, @aa1 String mac, @aa1 String imei) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(imei, "imei");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        map.put("bleName", name);
        map.put("mac", oe5.IXO0OOi(mac, CertificateUtil.DELIMITER, "", false, 4, null));
        map.put(O1iXOiO.O00, imei);
        map.put("type", String.valueOf(this.mWriteType));
        final C188902 c188902 = new C188902(imei);
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), O1iXOiO.XIi00iiXO);
        netWorkUtils.printParam(strConvertBaseUrl + O1iXOiO.XIi00iiXO, map);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + O1iXOiO.XIi00iiXO;
        final O1XIiIO<Response<IiXI010i>> o1XIiIO = new O1XIiIO<Response<IiXI010i>>() { // from class: com.sma.smartv3.ui.me.DeveloperIMEISetStartActivity$getIMEIInfo$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<IiXI010i> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO2 = c188902;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO2);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, c188902, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) map).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, IiXI010i.class), new ParsedRequestListener<Response<IiXI010i>>() { // from class: com.sma.smartv3.ui.me.DeveloperIMEISetStartActivity$getIMEIInfo$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<IiXI010i> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO.handleResponse(response);
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
                o1XIiIO.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getBtStartSet().setVisibility(8);
        getBtStopSet().setVisibility(8);
        Spinner spinnerWriteType = getSpinnerWriteType();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, CollectionsKt__CollectionsKt.iXiX011("请选择写入类型", O1iXOiO.O00, "sn"));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWriteType.setAdapter((SpinnerAdapter) arrayAdapter);
        getSpinnerWriteType().setOnItemSelectedListener(new XIi00iiXO());
        getMListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.android.mltcode.paycertificationapi.iiX11XIi
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                DeveloperIMEISetStartActivity.initView$lambda$1(this.f8631IO, adapterView, view, i, j);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_test_imei_set_start;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        EditText etOldBleName = getEtOldBleName();
        Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
        startSearch(etOldBleName);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.setNeedBind(true);
        bleConnector.setOtaMode(false);
        bleConnector.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
        getMScanner().XIi00iiXO();
    }

    public final void startSearch(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mHandler.removeCallbacks(this.mConnectedFailRunnable);
        if (!PermissionUtils.isGranted("android.permission.ACCESS_FINE_LOCATION")) {
            requestLocationPermission();
            return;
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            requestEnableBluetooth();
            return;
        }
        if (!UtilsKt.m38846X1()) {
            locationServerRemind();
            return;
        }
        ToastUtils.showLong(R.string.search_device_remind);
        if (getEtSignal().getText().toString().length() == 0) {
            getEtSignal().setText(StatisticData.ERROR_CODE_NOT_FOUND);
        }
        this.rssi = Integer.parseInt(getEtSignal().getText().toString());
        this.filterName = getEtOldBleName().getText().toString();
        getMList().clear();
        getMListAdapter().notifyDataSetChanged();
        getTvSearchNumber().setText(getString(R.string.device_found, Integer.valueOf(getMList().size())));
        getMScanner().XXI(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " start scan s: " + this.filterName + ", " + this.rssi + ", " + this.isReadAgain);
        this.isReadAgain = false;
        this.isWriteAgain = false;
        TextView tvValue = getTvValue();
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object ii00i1xi = new iI00I1XI(null, 1, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(iI00I1XI.class.getName()), (Class<Object>) iI00I1XI.class);
        if (objFromJson != null) {
            ii00i1xi = objFromJson;
        }
        tvValue.setText(String.valueOf(((iI00I1XI) ii00i1xi).XO0O10().size()));
    }

    public final void startSet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.toId = getEtId().getText().toString();
        if (this.mWriteType == 0) {
            ToastUtils.showLong("请选择写入类型", new Object[0]);
            return;
        }
        if (getMList().isEmpty()) {
            ToastUtils.showLong("No device!", new Object[0]);
            return;
        }
        showLoadPopup();
        this.mHandler.postDelayed(this.mConnectedFailRunnable, TimeUnit.SECONDS.toMillis(30L));
        this.isAutoSet = true;
        BleDevice bleDevice = getMList().get(0);
        getBtStopSet().setVisibility(0);
        String address = bleDevice.getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(address, "getAddress(...)");
        this.deviceAddress = address;
        this.deviceName = bleDevice.getMName();
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.setNeedBind(false);
        bleConnector.setMConnectDirectly(true);
        AbsBleConnector.setBleDevice$default(bleConnector, bleDevice, 0, 2, null).connect(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " " + this.isAutoSet + " connect new device -> " + bleDevice.getMName() + " " + bleDevice);
    }

    public final void stopSet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.isAutoSet = false;
        getBtStopSet().setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 BleDevice item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(R.id.tv_name, item.getMName());
        holder.OII(R.id.tv_address, item.getMBluetoothDevice().getAddress());
        ((ImageView) holder.O00(R.id.iv_rssi)).setImageLevel(-item.getMRssi());
    }
}
