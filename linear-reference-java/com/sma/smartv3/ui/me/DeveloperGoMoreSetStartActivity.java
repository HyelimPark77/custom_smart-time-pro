package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.I0OIII1X;
import com.android.mltcode.paycertificationapi.IiX0I1000;
import com.android.mltcode.paycertificationapi.Iiii1I;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.OiIXOO;
import com.android.mltcode.paycertificationapi.X00011;
import com.android.mltcode.paycertificationapi.X0IIXiOi;
import com.android.mltcode.paycertificationapi.X0OIXiI;
import com.android.mltcode.paycertificationapi.X0i0OXiIi;
import com.android.mltcode.paycertificationapi.X1I00;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XI1Xii00X;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.XOiiiiXI;
import com.android.mltcode.paycertificationapi.XX11XIXI;
import com.android.mltcode.paycertificationapi.XXO1iO01O;
import com.android.mltcode.paycertificationapi.XXX1iiI0i;
import com.android.mltcode.paycertificationapi.Xi1iO1XOI;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.Xii11Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.iIi0ii11;
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
import com.blankj.utilcode.util.ToastUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetGomoreAuthKey;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.BaseListFunctionActivity;
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
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
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
@SourceDebugExtension({"SMAP\nDeveloperGoMoreSetStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n176#2,11:437\n196#2:456\n252#3,7:448\n270#3:455\n19#4:457\n15#4:458\n27#4,2:459\n1#5:461\n*S KotlinDebug\n*F\n+ 1 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity\n*L\n249#1:437,11\n249#1:456\n249#1:448,7\n249#1:455\n302#1:457\n302#1:458\n359#1:459,2\n*E\n"})
public final class DeveloperGoMoreSetStartActivity extends BaseListFunctionActivity<BleDevice> {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btStartSet$delegate;

    @aa1
    private final Lazy btStopSet$delegate;

    @aa1
    private final Lazy cbShutdown$delegate;

    @aa1
    private String deviceAddress;

    @aa1
    private String deviceName;

    @aa1
    private final Lazy etOldBleName$delegate;

    @aa1
    private final Lazy etSignal$delegate;

    @aa1
    private String filterName;
    private boolean isAutoSet;
    private boolean isReadAgain;

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
    private int rssi;

    @aa1
    private final Lazy tvSearchNumber$delegate;

    @aa1
    private final Lazy tvValue$delegate;

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

    @SourceDebugExtension({"SMAP\nDeveloperGoMoreSetStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$mBleHandleCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,436:1\n1#2:437\n19#3:438\n15#3:439\n11#3,2:440\n*S KotlinDebug\n*F\n+ 1 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$mBleHandleCallback$1\n*L\n196#1:438\n196#1:439\n199#1:440,2\n*E\n"})
    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ DeveloperGoMoreSetStartActivity IO;

        public XIi00iiXO(DeveloperGoMoreSetStartActivity r1) {
            this.IO = r1;
        }

        public static /* synthetic */ void OXO1(DeveloperGoMoreSetStartActivity r0) {
            iO(r0);
        }

        public static /* synthetic */ void XIi00iiXO(DeveloperGoMoreSetStartActivity r0) {
            XO0O10(r0);
        }

        public static final void XO0O10(DeveloperGoMoreSetStartActivity r3) {
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(r3) + " onReadGoMoreSettings Shutdown success! Force closeConnection!");
            DeveloperGoMoreSetStartActivity.access$reStart(r3);
        }

        public static final void iO(DeveloperGoMoreSetStartActivity r10) {
            BleConnector r0 = BleConnector.INSTANCE;
            if (r0.isBound() == true) goto L6;
            BleKey r1 = BleKey.SESSION;
            BleKeyFlag r2 = BleKeyFlag.CREATE;
            Random.Default r9 = Random.Default;
            BaseBleConnector.sendInt32$default(r0, r1, r2, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendInt32$default(r0, r1, BleKeyFlag.UPDATE, r9.nextInt(), null, false, false, 56, null);
            BaseBleConnector.sendData$default(r0, BleKey.IDENTITY, BleKeyFlag.READ, null, false, false, 28, null);
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(r10) + " onDeviceConnected -> read deviceInfo");
            return;
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
            BleKey r1 = BleKey.GOMORE_SET;
            if (r9 != r1) goto L6;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.IO) + " onCommandReply -> The activation code has been written, and the status needs to be read again!");
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, r1, BleKeyFlag.READ, null, false, false, 28, null);
            DeveloperGoMoreSetStartActivity.access$setReadAgain$p(this.IO, true);
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey r2, BleKeyFlag r3) {
            Intrinsics.X0O(r2, "bleKey");
            Intrinsics.X0O(r3, "bleKeyFlag");
            if (r2 != BleKey.GOMORE_SET) goto L6;
            DeveloperGoMoreSetStartActivity.access$reStart(this.IO);
            return;
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
            DeveloperGoMoreSetStartActivity.access$getBtStopSet(this.IO).setVisibility(0);
            Handler r6 = new Handler();
            final DeveloperGoMoreSetStartActivity r0 = this.IO;
            r6.postDelayed(new X0IIXiOi(r0), 4000);
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
        public void onReadDeviceInfo(BleDeviceInfo r10) {
            Intrinsics.X0O(r10, "deviceInfo");
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.IO) + " onReadDeviceInfo -> " + r10);
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.GOMORE_SET, BleKeyFlag.READ, null, false, false, 28, null);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadGoMoreSettings(BleGoMoreSettings r9) {
            Intrinsics.X0O(r9, "goMoreSettings");
            if (TextUtils.isEmpty(r9.getMUuid()) == false) goto L7;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.IO) + " onReadGoMoreSettings -> uuid is empty!");
            DeveloperGoMoreSetStartActivity.access$getMConnectedFailMap$p(this.IO).put(DeveloperGoMoreSetStartActivity.access$getDeviceAddress$p(this.IO), 10);
            DeveloperGoMoreSetStartActivity.access$reStart(this.IO);
            return;
        L7:
            if (TextUtils.isEmpty(r9.getMKey()) == true) goto L9;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.IO) + " onReadGoMoreSettings -> " + r9.getMType() + " - GoMore activated!");
            a01 r10 = a01.OXO1;
            SPUtils r0 = r10.IiI10X();
            Object r1 = new Iiii1I(null, 1, null == true ? 1 : 0);
            Object r2 = new Gson().fromJson(r0.getString(Iiii1I.class.getName()), Iiii1I.class);
            if (r2 == null) goto L18;
            r1 = r2;
        L18:
            Iiii1I r3 = (Iiii1I) r1;
            r3.XO0O10().add(DeveloperGoMoreSetStartActivity.access$getDeviceAddress$p(this.IO));
            r10.IiI10X().put(Iiii1I.class.getName(), new Gson().toJson(r3));
            DeveloperGoMoreSetStartActivity.access$getTvValue(this.IO).setText(String.valueOf(r3.XO0O10().size()));
            if (DeveloperGoMoreSetStartActivity.access$getCbShutdown(this.IO).isChecked() == false) goto L22;
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            Handler r11 = new Handler();
            final DeveloperGoMoreSetStartActivity r4 = this.IO;
            r11.postDelayed(new XX11XIXI(r4), 2000);
            return;
        L22:
            DeveloperGoMoreSetStartActivity.access$reStart(this.IO);
            return;
        L9:
            if (DeveloperGoMoreSetStartActivity.access$isReadAgain$p(this.IO) == false) goto L12;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.IO) + " onReadGoMoreSettings -> GoMore activation failed!");
            DeveloperGoMoreSetStartActivity.access$getMConnectedFailMap$p(this.IO).put(DeveloperGoMoreSetStartActivity.access$getDeviceAddress$p(this.IO), 10);
            DeveloperGoMoreSetStartActivity.access$reStart(this.IO);
            return;
        L12:
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.IO) + " onReadGoMoreSettings -> getGoMoreAuthKey!");
            this.IO.getGoMoreAuthKey(r9.getMUuid(), r9.getMType(), r9.getMClientId());
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
        public void onSessionStateChange(boolean r4) {
            if (r4 == true) goto L14;
            HashMap r5 = DeveloperGoMoreSetStartActivity.access$getMConnectedFailMap$p(this.IO);     // Catch: Exception -> L6
            String r0 = DeveloperGoMoreSetStartActivity.access$getDeviceAddress$p(this.IO);     // Catch: Exception -> L6
            Object r1 = DeveloperGoMoreSetStartActivity.access$getMConnectedFailMap$p(this.IO).get(DeveloperGoMoreSetStartActivity.access$getDeviceAddress$p(this.IO));     // Catch: Exception -> L6
            if (r1 != null) goto L8;
            r1 = 0;     // Catch: Exception -> L6
        L8:
            r5.put(r0, Integer.valueOf(((Number) r1).intValue() + 1));     // Catch: Exception -> L6
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

    @SourceDebugExtension({"SMAP\nDeveloperGoMoreSetStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$mScanner$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,436:1\n1#2:437\n19#3:438\n15#3:439\n1011#4,2:440\n*S KotlinDebug\n*F\n+ 1 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$mScanner$2$2\n*L\n116#1:438\n116#1:439\n122#1:440,2\n*E\n"})
    public static final class XO0O10 implements i1OIOOIiX {
        public final /* synthetic */ DeveloperGoMoreSetStartActivity OXO1;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DeveloperGoMoreSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$mScanner$2$2\n*L\n1#1,328:1\n122#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            public OXO1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T r1, T r2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) r1).getMRssi()), Integer.valueOf(-((BleDevice) r2).getMRssi()));
            }
        }

        public XO0O10(DeveloperGoMoreSetStartActivity r1) {
            this.OXO1 = r1;
        }

        public static final void O00(DeveloperGoMoreSetStartActivity r2) {
            EditText r0 = DeveloperGoMoreSetStartActivity.access$getEtOldBleName(r2);
            Intrinsics.O10IXXX0X(r0, "access$getEtOldBleName(...)");
            r2.startSearch(r0);
        }

        public static /* synthetic */ void XO0O10(DeveloperGoMoreSetStartActivity r0) {
            O00(r0);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r5) {
            if (r5 == false) goto L7;
            DeveloperGoMoreSetStartActivity.access$getBtStartSet(this.OXO1).setVisibility(8);
            return;
        L7:
            if (DeveloperGoMoreSetStartActivity.access$isAutoSet$p(this.OXO1) == false) goto L14;
            DeveloperGoMoreSetStartActivity.access$getBtStartSet(this.OXO1).setVisibility(8);
            if (DeveloperGoMoreSetStartActivity.access$getMList(this.OXO1).isEmpty() == false) goto L12;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.OXO1) + " The search is empty, try again later");
            Handler r6 = new Handler();
            final DeveloperGoMoreSetStartActivity r0 = this.OXO1;
            r6.postDelayed(new Xi1iO1XOI(r0), 2000);
            return;
        L12:
            DeveloperGoMoreSetStartActivity r7 = this.OXO1;
            EditText r1 = DeveloperGoMoreSetStartActivity.access$getEtOldBleName(r7);
            Intrinsics.O10IXXX0X(r1, "access$getEtOldBleName(...)");
            r7.startSet(r1);
            return;
        L14:
            DeveloperGoMoreSetStartActivity.access$getBtStartSet(this.OXO1).setVisibility(0);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r8) {
            Intrinsics.X0O(r8, "device");
            if (DeveloperGoMoreSetStartActivity.access$getMList(this.OXO1).contains(r8) == false) goto L6;
            return;
        L6:
            if (TextUtils.isEmpty(DeveloperGoMoreSetStartActivity.access$getFilterName$p(this.OXO1)) == false) goto L8;
        L10:
            Object r0 = DeveloperGoMoreSetStartActivity.access$getMConnectedFailMap$p(this.OXO1).get(r8.getMBluetoothDevice().getAddress());
            Object r1 = r0;
            if (r0 != null) goto L14;
            r1 = 0;
        L14:
            if (((Number) r1).intValue() < 8) goto L17;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.OXO1) + " " + r8.getMBluetoothDevice().getAddress() + " When the connection times out, skip first");
            return;
        L17:
            SPUtils r2 = a01.OXO1.IiI10X();
            Object r3 = new Iiii1I(null, 1, false ? 1 : 0);
            Object r4 = new Gson().fromJson(r2.getString(Iiii1I.class.getName()), Iiii1I.class);
            if (r4 == null) goto L22;
            r3 = r4;
        L22:
            if (((Iiii1I) r3).XO0O10().contains(r8.getMBluetoothDevice().getAddress()) == false) goto L25;
            i1O0OXO1O.OXO1.OXO1(DeveloperGoMoreSetStartActivity.access$getTAG$p(this.OXO1) + " " + r8.getMBluetoothDevice().getAddress() + " The operation was successful");
            return;
        L25:
            DeveloperGoMoreSetStartActivity.access$getMList(this.OXO1).add(r8);
            List r9 = DeveloperGoMoreSetStartActivity.access$getMList(this.OXO1);
            if (r9.size() <= 1) goto L28;
            XiX0OOXI0.XOXiX0(r9, new OXO1());
        L28:
            TextView r10 = DeveloperGoMoreSetStartActivity.access$getTvSearchNumber(this.OXO1);
            DeveloperGoMoreSetStartActivity r5 = this.OXO1;
            r10.setText(r5.getString(R.string.device_found, new Object[]{Integer.valueOf(DeveloperGoMoreSetStartActivity.access$getMList(r5).size())}));
            DeveloperGoMoreSetStartActivity.access$getMListAdapter(this.OXO1).notifyDataSetChanged();
            return;
        L8:
            if (Intrinsics.XOO0ii0(q62.OXO1.iOO1ii1(r8.getMName()), DeveloperGoMoreSetStartActivity.access$getFilterName$p(this.OXO1)) == true) goto L10;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    public static final class iO implements OOXIOIiOO {
        public final /* synthetic */ DeveloperGoMoreSetStartActivity OXO1;

        public iO(DeveloperGoMoreSetStartActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice r2) {
            Intrinsics.X0O(r2, "device");
            if (r2.getMRssi() <= (-DeveloperGoMoreSetStartActivity.access$getRssi$p(this.OXO1))) goto L6;
            return true;
        L6:
            return false;
        }
    }

    public DeveloperGoMoreSetStartActivity() {
        this.TAG = "GoMore";
        this.etOldBleName$delegate = LazyKt__LazyJVMKt.iO(new XI1Xii00X(this));
        this.btStartSet$delegate = LazyKt__LazyJVMKt.iO(new X0OIXiI(this));
        this.btStopSet$delegate = LazyKt__LazyJVMKt.iO(new Xii11Oi(this));
        this.etSignal$delegate = LazyKt__LazyJVMKt.iO(new X1I00(this));
        this.tvSearchNumber$delegate = LazyKt__LazyJVMKt.iO(new OiIXOO(this));
        this.tvValue$delegate = LazyKt__LazyJVMKt.iO(new I0OIII1X(this));
        this.cbShutdown$delegate = LazyKt__LazyJVMKt.iO(new X0i0OXiIi(this));
        this.deviceAddress = "";
        this.deviceName = "";
        this.rssi = 100;
        this.filterName = "";
        this.mScanner$delegate = LazyKt__LazyJVMKt.iO(new XOiiiiXI(this));
        this.mConnectedFailMap = new HashMap();
        this.mHandler = new Handler();
        this.mConnectedFailRunnable = new iIi0ii11(this);
        this.mBleHandleCallback = new XIi00iiXO(this);
    }

    public static /* synthetic */ AppCompatButton I1(DeveloperGoMoreSetStartActivity r0) {
        return btStopSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText I1XOi1(DeveloperGoMoreSetStartActivity r0) {
        return etSignal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText IIX1OXO(DeveloperGoMoreSetStartActivity r0) {
        return etOldBleName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatButton O10IXXX0X(DeveloperGoMoreSetStartActivity r0) {
        return btStartSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OII(DeveloperGoMoreSetStartActivity r0) {
        return tvValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(DeveloperGoMoreSetStartActivity r0) {
        return tvSearchNumber_delegate$lambda$0(r0);
    }

    public static /* synthetic */ OXOI0XII OiIIX101O(DeveloperGoMoreSetStartActivity r0) {
        return mScanner_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox X0O(DeveloperGoMoreSetStartActivity r0) {
        return cbShutdown_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(DeveloperGoMoreSetStartActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XX0(DeveloperGoMoreSetStartActivity r0, PermissionStatus r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XiOIO(DeveloperGoMoreSetStartActivity r0) {
        mConnectedFailRunnable$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIii1(DeveloperGoMoreSetStartActivity r0) {
        return permissionBackgroundLocationRemind$lambda$0$0(r0);
    }

    public static final /* synthetic */ AppCompatButton access$getBtStartSet(DeveloperGoMoreSetStartActivity r0) {
        return r0.getBtStartSet();
    }

    public static final /* synthetic */ AppCompatButton access$getBtStopSet(DeveloperGoMoreSetStartActivity r0) {
        return r0.getBtStopSet();
    }

    public static final /* synthetic */ CheckBox access$getCbShutdown(DeveloperGoMoreSetStartActivity r0) {
        return r0.getCbShutdown();
    }

    public static final /* synthetic */ String access$getDeviceAddress$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.deviceAddress;
    }

    public static final /* synthetic */ EditText access$getEtOldBleName(DeveloperGoMoreSetStartActivity r0) {
        return r0.getEtOldBleName();
    }

    public static final /* synthetic */ String access$getFilterName$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.filterName;
    }

    public static final /* synthetic */ HashMap access$getMConnectedFailMap$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.mConnectedFailMap;
    }

    public static final /* synthetic */ List access$getMList(DeveloperGoMoreSetStartActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(DeveloperGoMoreSetStartActivity r0) {
        return r0.getMListAdapter();
    }

    public static final /* synthetic */ int access$getRssi$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.rssi;
    }

    public static final /* synthetic */ String access$getTAG$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ TextView access$getTvSearchNumber(DeveloperGoMoreSetStartActivity r0) {
        return r0.getTvSearchNumber();
    }

    public static final /* synthetic */ TextView access$getTvValue(DeveloperGoMoreSetStartActivity r0) {
        return r0.getTvValue();
    }

    public static final /* synthetic */ boolean access$isAutoSet$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.isAutoSet;
    }

    public static final /* synthetic */ boolean access$isReadAgain$p(DeveloperGoMoreSetStartActivity r0) {
        return r0.isReadAgain;
    }

    public static final /* synthetic */ void access$reStart(DeveloperGoMoreSetStartActivity r0) {
        r0.reStart();
    }

    public static final /* synthetic */ void access$setReadAgain$p(DeveloperGoMoreSetStartActivity r0, boolean r1) {
        r0.isReadAgain = r1;
    }

    private static final AppCompatButton btStartSet_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (AppCompatButton) r1.findViewById(R.id.bt_start_set);
    }

    private static final AppCompatButton btStopSet_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (AppCompatButton) r1.findViewById(R.id.bt_stop_set);
    }

    private static final CheckBox cbShutdown_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (CheckBox) r1.findViewById(R.id.cb_shutdown);
    }

    private final void dismissLoadPopup() {
        runOnUiThread(new IiX0I1000(this));
    }

    private static final void dismissLoadPopup$lambda$0(DeveloperGoMoreSetStartActivity r0) {
        uq r1 = r0.mLoadingPopup;
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private static final EditText etOldBleName_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_old_ble_name);
    }

    private static final EditText etSignal_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_signal);
    }

    private final AppCompatButton getBtStartSet() {
        return (AppCompatButton) getValue();
    }

    private final AppCompatButton getBtStopSet() {
        return (AppCompatButton) getValue();
    }

    private final CheckBox getCbShutdown() {
        return (CheckBox) getValue();
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

    private final TextView getTvSearchNumber() {
        return (TextView) getValue();
    }

    private final TextView getTvValue() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void iIiiO(DeveloperGoMoreSetStartActivity r0) {
        dismissLoadPopup$lambda$0(r0);
    }

    private static final void initView$lambda$0(DeveloperGoMoreSetStartActivity r0, AdapterView r1, View r2, int r3, long r4) {
        r0.getEtOldBleName().setText(q62.OXO1.iOO1ii1(r0.getMList().get(r3).getMName()));
        EditText r5 = r0.getEtOldBleName();
        Intrinsics.O10IXXX0X(r5, "<get-etOldBleName>(...)");
        r0.startSearch(r5);
    }

    private static final void mConnectedFailRunnable$lambda$0(DeveloperGoMoreSetStartActivity r6) {
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

    private static final OXOI0XII mScanner_delegate$lambda$0(DeveloperGoMoreSetStartActivity r4) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(new iO(r4)).X1ii(new XO0O10(r4));
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (getMPermissionBackgroundPopup() != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.background_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new XXO1iO01O(this));
        setMPermissionBackgroundPopup(r0);
    L5:
        go0 r1 = getMPermissionBackgroundPopup();
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean permissionBackgroundLocationRemind$lambda$0$0(DeveloperGoMoreSetStartActivity r2) {
        r2.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    private final void reStart() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " reStart");
        dismissLoadPopup();
        BleConnector.INSTANCE.unbind();
        EditText r0 = getEtOldBleName();
        Intrinsics.O10IXXX0X(r0, "<get-etOldBleName>(...)");
        startSearch(r0);
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
        ds1.iO(r1, null, null, new X00011(this), 3, null);
    }

    private static final Unit requestLocationPermission$lambda$0(DeveloperGoMoreSetStartActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        int r3 = OXO1.OXO1[r2.ordinal()];
        if (r3 != 1) goto L5;
        EditText r4 = r1.getEtOldBleName();
        Intrinsics.O10IXXX0X(r4, "<get-etOldBleName>(...)");
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

    private final void showLoadPopup() {
        if (this.mLoadingPopup != null) goto L5;
        this.mLoadingPopup = new uq(getMContext());
    L5:
        uq r0 = this.mLoadingPopup;
        if (r0 != null) goto L8;
    L10:
        uq r1 = this.mLoadingPopup;
        if (r1 == null) goto L14;
        r1.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r0.isShowing() != true) goto L10;
    }

    private static final TextView tvSearchNumber_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_search_number);
    }

    private static final TextView tvValue_delegate$lambda$0(DeveloperGoMoreSetStartActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_value);
    }

    public final void clearHistory(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " clearHistory");
        a01.OXO1.IiI10X().remove(Iiii1I.class.getName());
        getTvValue().setText("0");
        EditText r4 = getEtOldBleName();
        Intrinsics.O10IXXX0X(r4, "<get-etOldBleName>(...)");
        startSearch(r4);
        this.mConnectedFailMap.clear();
    }

    public final void getGoMoreAuthKey(@aa1 final String r6, final int r7, @aa1 final String r8) {
        Intrinsics.X0O(r6, "uuid");
        Intrinsics.X0O(r8, GetGomoreAuthKey.CLIENT_ID);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getGomoreAuthKeyBody(r6, r7, r8);
        final O1XIiIO<JsonObject> r2 = new AnonymousClass1(this, r6, r7, r8);
        final Activity r9 = null;
        final uq r10 = r0.loadPopup(null, null);
        String r11 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGomoreAuthKey.URL);
        r0.printParam(r11 + GetGomoreAuthKey.URL, r1);
        NetWork r3 = NetWork.OXO1;
        String r12 = r11 + GetGomoreAuthKey.URL;
        final O1XIiIO<Response<JsonObject>> r4 = new DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$$inlined$post$default$1(r9, r2, r10);
        AndroidNetworking.post(r12).addBodyParameter(r1).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{JsonObject.class}), new DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$$inlined$post$default$2(r4));
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
        getBtStartSet().setVisibility(8);
        getBtStopSet().setVisibility(8);
        getMListView().setOnItemClickListener(new XXX1iiI0i(this));
        TextView r0 = getTvValue();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new Iiii1I(null, 1, 0 == true ? 1 : 0);
        Object r3 = new Gson().fromJson(r1.getString(Iiii1I.class.getName()), Iiii1I.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        r0.setText(String.valueOf(((Iiii1I) r2).XO0O10().size()));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_gomore_set_start;
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

    public final void startSearch(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
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
        this.rssi = Integer.parseInt(getEtSignal().getText().toString());
        this.filterName = getEtOldBleName().getText().toString();
        getMList().clear();
        getMListAdapter().notifyDataSetChanged();
        getTvSearchNumber().setText(getString(R.string.device_found, new Object[]{Integer.valueOf(getMList().size())}));
        getMScanner().XXI(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " start scan s: " + this.filterName + ", " + this.rssi + ", " + this.isReadAgain);
        this.isReadAgain = false;
    }

    public final void startSet(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        if (getMList().isEmpty() == false) goto L6;
        ToastUtils.showLong("No device!", new Object[0]);
        return;
    L6:
        showLoadPopup();
        this.mHandler.postDelayed(this.mConnectedFailRunnable, TimeUnit.SECONDS.toMillis(30));
        this.isAutoSet = true;
        BleDevice r1 = getMList().get(0);
        getBtStopSet().setVisibility(0);
        String r2 = r1.getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(r2, "getAddress(...)");
        this.deviceAddress = r2;
        this.deviceName = r1.getMName();
        BleConnector r3 = BleConnector.INSTANCE;
        r3.setNeedBind(false);
        r3.setMConnectDirectly(true);
        AbsBleConnector.setBleDevice$default(r3, r1, 0, 2, null).connect(true);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " " + this.isAutoSet + " connect new device -> " + r1.getMName() + " " + r1);
    }

    public final void stopSet(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        this.isAutoSet = false;
        getBtStopSet().setVisibility(8);
    }

    public void initItem(@aa1 ug6 r2, @aa1 BleDevice r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.tv_name, r3.getMName());
        r2.OII(R.id.tv_address, r3.getMBluetoothDevice().getAddress());
        ((ImageView) r2.O00(R.id.iv_rssi)).setImageLevel(-r3.getMRssi());
    }
}
