package com.sma.smartv3.p610ui.p612me;

import android.bluetooth.BluetoothDevice;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iI0OiO;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.p610ui.p612me.DeveloperGsensorActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.chart.MyMarkerView;
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
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperGsensorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperGsensorActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGsensorActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n19#2:176\n15#2:177\n1563#3:178\n1634#3,3:179\n1563#3:182\n1634#3,3:183\n*S KotlinDebug\n*F\n+ 1 DeveloperGsensorActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGsensorActivity\n*L\n43#1:176\n43#1:177\n81#1:178\n81#1:179,3\n82#1:182\n82#1:183,3\n*E\n"})
public final class DeveloperGsensorActivity extends BaseActivity implements BleHandleCallback {

    @aa1
    private final AppUser mAppUser;

    @tb1
    private File mGsensorFile;

    @tb1
    private File mHrFile;
    private boolean mState;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1O1IIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperGsensorActivity.lineChart_delegate$lambda$0(this.f1417IO);
        }
    });

    @aa1
    private final Lazy btn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XI010
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperGsensorActivity.btn_delegate$lambda$0(this.f1446IO);
        }
    });

    @aa1
    private final LinkedList<List<BleGSensorRaw>> mData = new LinkedList<>();

    @aa1
    private final LinkedList<List<BleGSensorMotion>> mMotionData = new LinkedList<>();

    public DeveloperGsensorActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btn_delegate$lambda$0(DeveloperGsensorActivity developerGsensorActivity) {
        return (Button) developerGsensorActivity.findViewById(R.id.btn_start);
    }

    private final Button getBtn() {
        Object value = this.btn$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (Button) value;
    }

    private final LineChart getLineChart() {
        Object value = this.lineChart$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (LineChart) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(DeveloperGsensorActivity developerGsensorActivity) {
        return (LineChart) developerGsensorActivity.findViewById(R.id.line_chart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onReceiveGSensorRaw$lambda$2(SimpleDateFormat simpleDateFormat, BleGSensorRaw it) {
        Intrinsics.X0O(it, "it");
        return simpleDateFormat.format(new Date()) + I000IiI1O.C2156iO.XO0O10 + ((int) it.getMX()) + I000IiI1O.C2156iO.XO0O10 + ((int) it.getMY()) + I000IiI1O.C2156iO.XO0O10 + ((int) it.getMZ()) + "\n";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onReceiveHRRaw$lambda$0(SimpleDateFormat simpleDateFormat, BleHRRaw it) {
        Intrinsics.X0O(it, "it");
        return simpleDateFormat.format(new Date()) + I000IiI1O.C2156iO.XO0O10 + it.getMPpg() + "\n";
    }

    private final void updateGsensor() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<List<BleGSensorRaw>> it = this.mData.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            List<BleGSensorRaw> next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            for (BleGSensorRaw bleGSensorRaw : next) {
                arrayList.add(new Entry(arrayList.size(), bleGSensorRaw.getMX()));
                arrayList2.add(new Entry(arrayList2.size(), bleGSensorRaw.getMY()));
                arrayList3.add(new Entry(arrayList3.size(), bleGSensorRaw.getMZ()));
            }
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "X");
        lineDataSet.OXOO0X0i(false);
        lineDataSet.II1(Color.parseColor("#ff0000"));
        LineDataSet.Mode mode = LineDataSet.Mode.HORIZONTAL_BEZIER;
        lineDataSet.OXXO0O1X(mode);
        LineDataSet lineDataSet2 = new LineDataSet(arrayList2, Api.f51338Y);
        lineDataSet2.OXOO0X0i(false);
        lineDataSet2.II1(Color.parseColor("#00ff00"));
        lineDataSet2.OXXO0O1X(mode);
        LineDataSet lineDataSet3 = new LineDataSet(arrayList3, "Z");
        lineDataSet3.OXOO0X0i(false);
        lineDataSet3.II1(Color.parseColor("#0000ff"));
        lineDataSet3.OXXO0O1X(mode);
        getLineChart().setData(new C2305co(lineDataSet, lineDataSet2, lineDataSet3));
        getLineChart().invalidate();
    }

    private final void updateMotion() {
        ArrayList arrayList = new ArrayList();
        Iterator<List<BleGSensorMotion>> it = this.mMotionData.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            List<BleGSensorMotion> next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            Iterator<BleGSensorMotion> it2 = next.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Entry(arrayList.size(), it2.next().getMMotion()));
            }
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "motion");
        lineDataSet.II1(Color.parseColor("#ff0000"));
        lineDataSet.OXO1(true);
        lineDataSet.OXXO0O1X(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.OXOO0X0i(false);
        getLineChart().setData(new C2305co(lineDataSet));
        getLineChart().invalidate();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setRequestedOrientation(0);
        BleConnector.INSTANCE.addHandleCallback(this);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        MyMarkerView myMarkerView = new MyMarkerView(this, R.layout.marker_view_developer_gsensor);
        myMarkerView.setChartView(getLineChart());
        getLineChart().setMarker(myMarkerView);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_gsensor;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICoachGeneratePlanUpdate(int i) {
        super.onAICoachGeneratePlanUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICommandUpdate(@aa1 BleAICommand bleAICommand) {
        super.onAICommandUpdate(bleAICommand);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onActivityRecognitionUpdate(int i) {
        super.onActivityRecognitionUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmAdd(@aa1 BleAlarm bleAlarm) {
        super.onAlarmAdd(bleAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmDelete(int i) {
        super.onAlarmDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmUpdate(@aa1 BleAlarm bleAlarm) {
        super.onAlarmUpdate(bleAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppOpUpdate(@aa1 BleAppOp bleAppOp) {
        super.onAppOpUpdate(bleAppOp);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppSportDataResponse(boolean z) {
        super.onAppSportDataResponse(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBWNaviInfoUpdate(@aa1 BleBWNaviInfo bleBWNaviInfo) {
        super.onBWNaviInfoUpdate(bleBWNaviInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBacklightUpdate(int i) {
        super.onBacklightUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBandKeyUpdate(@aa1 BleBandKey bleBandKey) {
        super.onBandKeyUpdate(bleBandKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleGolfScore(@aa1 BleGolfScore bleGolfScore) {
        super.onBleGolfScore(bleGolfScore);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleThirdPartyDataUpdate(@aa1 BleThirdPartyData bleThirdPartyData) {
        super.onBleThirdPartyDataUpdate(bleThirdPartyData);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleVideoCallInfo(@aa1 BleVideoCallInfo bleVideoCallInfo) {
        super.onBleVideoCallInfo(bleVideoCallInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPChatUpdate(@aa1 BleCPChat bleCPChat) {
        super.onCPChatUpdate(bleCPChat);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPGiftsInfoUpdate(@aa1 BleCPGiftsInfo bleCPGiftsInfo) {
        super.onCPGiftsInfoUpdate(bleCPGiftsInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPListenerUpdate(@aa1 BleCPListener bleCPListener) {
        super.onCPListenerUpdate(bleCPListener);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPMissYouUpdate(@aa1 BleCPMissYou bleCPMissYou) {
        super.onCPMissYouUpdate(bleCPMissYou);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPTodoUpdate(@aa1 BleCPTodo bleCPTodo) {
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
    public /* bridge */ void onChatAppUpdate(@aa1 BleChatApp bleChatApp) {
        super.onChatAppUpdate(bleChatApp);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatMessageUpdate(@aa1 BleChatMessage bleChatMessage) {
        super.onChatMessageUpdate(bleChatMessage);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatVoiceUpdate(@aa1 BleChatVoice bleChatVoice) {
        super.onChatVoiceUpdate(bleChatVoice);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCheckInEveryDayUpdate(@aa1 BleCheckInEveryDay bleCheckInEveryDay) {
        super.onCheckInEveryDayUpdate(bleCheckInEveryDay);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onClassicBluetoothStateChange(int i) {
        super.onClassicBluetoothStateChange(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCommandReply(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, boolean z) {
        super.onCommandReply(bleKey, bleKeyFlag, z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCommandSendTimeout(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag) {
        super.onCommandSendTimeout(bleKey, bleKeyFlag);
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

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.removeHandleCallback(this);
        if (this.mState) {
            BaseBleConnector.sendBoolean$default(bleConnector, BleKey.GSENSOR_OUTPUT, BleKeyFlag.UPDATE, false, false, false, 24, null);
        }
        super.onDestroy();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceConnected(@aa1 BluetoothDevice bluetoothDevice) {
        super.onDeviceConnected(bluetoothDevice);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceConnecting(boolean z) {
        super.onDeviceConnecting(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceFileUpdate(@aa1 BleDeviceFile bleDeviceFile) {
        super.onDeviceFileUpdate(bleDeviceFile);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceOpUpdate(int i) {
        super.onDeviceOpUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceRequestAGpsFile(@aa1 String str) {
        super.onDeviceRequestAGpsFile(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceSMSQuickReply(@aa1 BleSMSQuickReply bleSMSQuickReply) {
        super.onDeviceSMSQuickReply(bleSMSQuickReply);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceSportDataUpdate(@aa1 BleDeviceSportData bleDeviceSportData) {
        super.onDeviceSportDataUpdate(bleDeviceSportData);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDistanceGoalUpdate(int i) {
        super.onDistanceGoalUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDoubleScreenSettingsUpdate(@aa1 BleDoubleScreenSettings bleDoubleScreenSettings) {
        super.onDoubleScreenSettingsUpdate(bleDoubleScreenSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDrinkWaterUpdate(@aa1 BleDrinkWaterSettings bleDrinkWaterSettings) {
        super.onDrinkWaterUpdate(bleDrinkWaterSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneAncSettingsUpdate(@aa1 BleEarphoneAncSettings bleEarphoneAncSettings) {
        super.onEarphoneAncSettingsUpdate(bleEarphoneAncSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneCallUpdate(int i) {
        super.onEarphoneCallUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneKeyUpdate(@aa1 BleEarphoneKey bleEarphoneKey) {
        super.onEarphoneKeyUpdate(bleEarphoneKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
        super.onEarphoneSoundEffectsSettingsUpdate(bleEarphoneSoundEffectsSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneStateUpdate(@aa1 BleEarphoneState bleEarphoneState) {
        super.onEarphoneStateUpdate(bleEarphoneState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFactoryTestUpdate(@aa1 BleFactoryTest bleFactoryTest) {
        super.onFactoryTestUpdate(bleFactoryTest);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFallSetUpdate(int i) {
        super.onFallSetUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFindEarphoneUpdate(@aa1 BleFindEarphone bleFindEarphone) {
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
    public /* bridge */ void onGameControlUpdate(@aa1 BleGameControl bleGameControl) {
        super.onGameControlUpdate(bleGameControl);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWake2Update(@aa1 BleGestureWake2 bleGestureWake2) {
        super.onGestureWake2Update(bleGestureWake2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWakeUpdate(@aa1 BleGestureWake bleGestureWake) {
        super.onGestureWakeUpdate(bleGestureWake);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGoogleNaviInfoUpdate(@aa1 BleGoogleNaviInfo bleGoogleNaviInfo) {
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
    public /* bridge */ void onHRWarningSet(@aa1 BleHrWarningSettings bleHrWarningSettings) {
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
    public /* bridge */ void onHydrationUpdate(@aa1 BleHydrationSettings bleHydrationSettings) {
        super.onHydrationUpdate(bleHydrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCExceptionUpdate(@aa1 BleIPCException bleIPCException) {
        super.onIPCExceptionUpdate(bleIPCException);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCOTAStateUpdate(@aa1 BleIPCOTAState bleIPCOTAState) {
        super.onIPCOTAStateUpdate(bleIPCOTAState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStateUpdate(@aa1 BleIPCState bleIPCState) {
        super.onIPCStateUpdate(bleIPCState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStoresInfoUpdate(@aa1 BleIPCStoresInfo bleIPCStoresInfo) {
        super.onIPCStoresInfoUpdate(bleIPCStoresInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCWifiInfoUpdate(@aa1 BleIPCWifiInfo bleIPCWifiInfo) {
        super.onIPCWifiInfoUpdate(bleIPCWifiInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIdentityCreate(boolean z, @tb1 BleDeviceInfo bleDeviceInfo) {
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
    public /* bridge */ void onLoveTapUpdate(@aa1 BleLoveTap bleLoveTap) {
        super.onLoveTapUpdate(bleLoveTap);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserDelete(int i) {
        super.onLoveTapUserDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserUpdate(@aa1 BleLoveTapUser bleLoveTapUser) {
        super.onLoveTapUserUpdate(bleLoveTapUser);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeasurementUpdate(@aa1 BleMeasurement bleMeasurement) {
        super.onMeasurementUpdate(bleMeasurement);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmAdd(@aa1 BleMedicationAlarm bleMedicationAlarm) {
        super.onMedicationAlarmAdd(bleMedicationAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmDelete(int i) {
        super.onMedicationAlarmDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmUpdate(@aa1 BleMedicationAlarm bleMedicationAlarm) {
        super.onMedicationAlarmUpdate(bleMedicationAlarm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderDelete(int i) {
        super.onMedicationReminderDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderUpdate(@aa1 BleMedicationReminder bleMedicationReminder) {
        super.onMedicationReminderUpdate(bleMedicationReminder);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderAdd(@aa1 BleMeetingReminder bleMeetingReminder) {
        super.onMeetingReminderAdd(bleMeetingReminder);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderDelete(int i) {
        super.onMeetingReminderDelete(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderUpdate(@aa1 BleMeetingReminder bleMeetingReminder) {
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
    public /* bridge */ void onNaviInfoUpdate(@aa1 BleNaviInfo bleNaviInfo) {
        super.onNaviInfoUpdate(bleNaviInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNoDisturbUpdate(@aa1 BleNoDisturbSettings bleNoDisturbSettings) {
        super.onNoDisturbUpdate(bleNoDisturbSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationLightScreenSetUpdate(int i) {
        super.onNotificationLightScreenSetUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationSettings2Update(@aa1 BleNotificationSettings2 bleNotificationSettings2) {
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
    public /* bridge */ void onReadAICoachGenerateBeforeInfo(@aa1 BleAICoachBeforePlan bleAICoachBeforePlan) {
        super.onReadAICoachGenerateBeforeInfo(bleAICoachBeforePlan);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
        super.onReadAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlan(@aa1 BleAICoachGeneratePlan bleAICoachGeneratePlan) {
        super.onReadAICoachPlan(bleAICoachGeneratePlan);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlanV2(@aa1 BleAICoachGeneratePlanV2 bleAICoachGeneratePlanV2) {
        super.onReadAICoachPlanV2(bleAICoachGeneratePlanV2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadActivity(@aa1 List<BleActivity> list) {
        super.onReadActivity(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadActivityDetail(@aa1 BleActivityDetail bleActivityDetail) {
        super.onReadActivityDetail(bleActivityDetail);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAddressBook(@aa1 BleAddressBook bleAddressBook) {
        super.onReadAddressBook(bleAddressBook);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlarm(@aa1 List<BleAlarm> list) {
        super.onReadAlarm(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlipayBindInfo(@aa1 List<BleAlipayBindInfo> list) {
        super.onReadAlipayBindInfo(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlipaySettings(@aa1 BleAlipaySettings bleAlipaySettings) {
        super.onReadAlipaySettings(bleAlipaySettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppApiVersion(@aa1 String str) {
        super.onReadAppApiVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppInfoList(@aa1 BleAppInfoList bleAppInfoList) {
        super.onReadAppInfoList(bleAppInfoList);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppSportState(@aa1 BleAppSportState bleAppSportState) {
        super.onReadAppSportState(bleAppSportState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAvgHeartRate(@aa1 List<BleAvgHeartRate> list) {
        super.onReadAvgHeartRate(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBAC(@aa1 List<BleBAC> list) {
        super.onReadBAC(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacCalibration(@aa1 BleBacCalibration bleBacCalibration, @aa1 BleKeyFlag bleKeyFlag) {
        super.onReadBacCalibration(bleBacCalibration, bleKeyFlag);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacklight(int i) {
        super.onReadBacklight(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBatteryUsage(@aa1 BleBatteryUsage bleBatteryUsage) {
        super.onReadBatteryUsage(bleBatteryUsage);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleAddress(@aa1 String str) {
        super.onReadBleAddress(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfMapCacheInfo(@aa1 BleGolfMapCacheInfo bleGolfMapCacheInfo) {
        super.onReadBleGolfMapCacheInfo(bleGolfMapCacheInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfSportSwitch(@aa1 BleGolfSportSwitch bleGolfSportSwitch) {
        super.onReadBleGolfSportSwitch(bleGolfSportSwitch);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchMapInfo(@aa1 BleGolfWatchMapInfo bleGolfWatchMapInfo) {
        super.onReadBleGolfWatchMapInfo(bleGolfWatchMapInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchVersionInfo(@aa1 BleGolfWatchVersionInfo bleGolfWatchVersionInfo) {
        super.onReadBleGolfWatchVersionInfo(bleGolfWatchVersionInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleHrv(@aa1 List<BleHrv> list) {
        super.onReadBleHrv(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleLogText(@aa1 List<BleLogText> list) {
        super.onReadBleLogText(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodGlucose(@aa1 List<BleBloodGlucose> list) {
        super.onReadBloodGlucose(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodOxyGenSettings(@aa1 BleBloodOxyGenSettings bleBloodOxyGenSettings) {
        super.onReadBloodOxyGenSettings(bleBloodOxyGenSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodOxygen(@aa1 List<BleBloodOxygen> list) {
        super.onReadBloodOxygen(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodPressure(@aa1 List<BleBloodPressure> list) {
        super.onReadBloodPressure(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodPressureCalibration(@aa1 BleBloodPressureCalibration bleBloodPressureCalibration) {
        super.onReadBloodPressureCalibration(bleBloodPressureCalibration);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBodyStatus(@aa1 List<BleBodyStatus> list) {
        super.onReadBodyStatus(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCPUserInfo(@aa1 BleCPUserInfo bleCPUserInfo) {
        super.onReadCPUserInfo(bleCPUserInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalibrationData(@aa1 BleCalibrationData bleCalibrationData) {
        super.onReadCalibrationData(bleCalibrationData);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalorieIntake(@aa1 List<BleCalorieIntake> list) {
        super.onReadCalorieIntake(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCaloriesGoal(int i) {
        super.onReadCaloriesGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadChatApp(@aa1 BleChatApp bleChatApp) {
        super.onReadChatApp(bleChatApp);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCheckInEveryDay(@aa1 BleCheckInEveryDay bleCheckInEveryDay) {
        super.onReadCheckInEveryDay(bleCheckInEveryDay);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadClassicBluetoothState(int i) {
        super.onReadClassicBluetoothState(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCoachingIds(@aa1 BleCoachingIds bleCoachingIds) {
        super.onReadCoachingIds(bleCoachingIds);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCyWeeAlgorithm(@aa1 BleCyWeeAlgorithm bleCyWeeAlgorithm) {
        super.onReadCyWeeAlgorithm(bleCyWeeAlgorithm);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDailyPower(@aa1 List<BlePhysicalPower> list) {
        super.onReadDailyPower(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDateFormat(int i) {
        super.onReadDateFormat(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFile(@aa1 BleDeviceFile bleDeviceFile) {
        super.onReadDeviceFile(bleDeviceFile);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFileV2(@aa1 BleDeviceFile2 bleDeviceFile2) {
        super.onReadDeviceFileV2(bleDeviceFile2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo(@aa1 BleDeviceInfo bleDeviceInfo) {
        super.onReadDeviceInfo(bleDeviceInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo2(@aa1 BleDeviceInfo2 bleDeviceInfo2) {
        super.onReadDeviceInfo2(bleDeviceInfo2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages(@aa1 BleDeviceLanguages bleDeviceLanguages) {
        super.onReadDeviceLanguages(bleDeviceLanguages);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages2(@aa1 BleDeviceLanguages2 bleDeviceLanguages2) {
        super.onReadDeviceLanguages2(bleDeviceLanguages2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceUniqueDataSettings(@aa1 BleDeviceUniqueDataSettings bleDeviceUniqueDataSettings) {
        super.onReadDeviceUniqueDataSettings(bleDeviceUniqueDataSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDistanceGoal(int i) {
        super.onReadDistanceGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDoubleScreenSettings(@aa1 BleDoubleScreenSettings bleDoubleScreenSettings) {
        super.onReadDoubleScreenSettings(bleDoubleScreenSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDrinkWater(@aa1 BleDrinkWaterSettings bleDrinkWaterSettings) {
        super.onReadDrinkWater(bleDrinkWaterSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadECGRealtime(@aa1 BleECGRealtime bleECGRealtime) {
        super.onReadECGRealtime(bleECGRealtime);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneAncSettings(@aa1 BleEarphoneAncSettings bleEarphoneAncSettings) {
        super.onReadEarphoneAncSettings(bleEarphoneAncSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneCall(int i) {
        super.onReadEarphoneCall(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneInfo(@aa1 BleEarphoneInfo bleEarphoneInfo) {
        super.onReadEarphoneInfo(bleEarphoneInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneKey(@aa1 BleEarphoneKey bleEarphoneKey) {
        super.onReadEarphoneKey(bleEarphoneKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphonePower(@aa1 BleEarphonePower bleEarphonePower) {
        super.onReadEarphonePower(bleEarphonePower);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneSoundEffectsSettings(@aa1 BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
        super.onReadEarphoneSoundEffectsSettings(bleEarphoneSoundEffectsSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneState(@aa1 BleEarphoneState bleEarphoneState) {
        super.onReadEarphoneState(bleEarphoneState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEcg(@aa1 List<BleEcg> list) {
        super.onReadEcg(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEcgSettings(@aa1 BleEcgSettings bleEcgSettings) {
        super.onReadEcgSettings(bleEcgSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEnergyRating(@aa1 List<BleEnergyRating> list) {
        super.onReadEnergyRating(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFallSet(int i) {
        super.onReadFallSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFilePath(@aa1 BleAppAudioBookList bleAppAudioBookList) {
        super.onReadFilePath(bleAppAudioBookList);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFirmwareVersion(@aa1 String str) {
        super.onReadFirmwareVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFoodBalance(@aa1 List<BleFoodBalance> list) {
        super.onReadFoodBalance(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake(@aa1 BleGestureWake bleGestureWake) {
        super.onReadGestureWake(bleGestureWake);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake2(@aa1 BleGestureWake2 bleGestureWake2) {
        super.onReadGestureWake2(bleGestureWake2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareMonthly(@aa1 BleGirlCareMonthly bleGirlCareMonthly) {
        super.onReadGirlCareMonthly(bleGirlCareMonthly);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareSettings(@aa1 BleGirlCareSettings bleGirlCareSettings) {
        super.onReadGirlCareSettings(bleGirlCareSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGoMoreSettings(@aa1 BleGoMoreSettings bleGoMoreSettings) {
        super.onReadGoMoreSettings(bleGoMoreSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGolfWatchScore(@aa1 BleGolfWatchScore bleGolfWatchScore) {
        super.onReadGolfWatchScore(bleGolfWatchScore);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGpsFirmwareVersion(@aa1 String str) {
        super.onReadGpsFirmwareVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHanBaoSettings(@aa1 BleHanBaoSettings bleHanBaoSettings) {
        super.onReadHanBaoSettings(bleHanBaoSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHanBaoVibration(@aa1 List<BleHanBaoVibration> list) {
        super.onReadHanBaoVibration(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHeartRate(@aa1 List<BleHeartRate> list) {
        super.onReadHeartRate(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHeartRateZones(@aa1 BleHeartRateZones bleHeartRateZones) {
        super.onReadHeartRateZones(bleHeartRateZones);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHourSystem(int i) {
        super.onReadHourSystem(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettings(@aa1 BleHrMonitoringSettings bleHrMonitoringSettings) {
        super.onReadHrMonitoringSettings(bleHrMonitoringSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettingsV2(int i) {
        super.onReadHrMonitoringSettingsV2(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvBaseLine(@aa1 BleHrvBaseLine bleHrvBaseLine) {
        super.onReadHrvBaseLine(bleHrvBaseLine);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvMonitoringSettings(@aa1 BleHrvMonitoringSettings bleHrvMonitoringSettings) {
        super.onReadHrvMonitoringSettings(bleHrvMonitoringSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHydrationSettings(@aa1 BleHydrationSettings bleHydrationSettings) {
        super.onReadHydrationSettings(bleHydrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCInfo(@aa1 BleIPCInfo bleIPCInfo) {
        super.onReadIPCInfo(bleIPCInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCState(@aa1 BleIPCState bleIPCState) {
        super.onReadIPCState(bleIPCState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCStoresInfo(@aa1 BleIPCStoresInfo bleIPCStoresInfo) {
        super.onReadIPCStoresInfo(bleIPCStoresInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCVersion(@aa1 String str) {
        super.onReadIPCVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIncomingCallRing(int i) {
        super.onReadIncomingCallRing(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLactateThreshold(@aa1 List<BleLactateThreshold> list) {
        super.onReadLactateThreshold(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguage(int i) {
        super.onReadLanguage(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguagePackVersion(@aa1 BleLanguagePackVersion bleLanguagePackVersion) {
        super.onReadLanguagePackVersion(bleLanguagePackVersion);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLocation(@aa1 List<BleLocation> list) {
        super.onReadLocation(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLoveTapUser(@aa1 List<BleLoveTapUser> list) {
        super.onReadLoveTapUser(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMatchRecord(@aa1 List<BleMatchRecord> list) {
        super.onReadMatchRecord(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMatchRecord2(@aa1 List<BleMatchRecord2> list) {
        super.onReadMatchRecord2(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMatchRecord3(@aa1 List<BleMatchRecord3> list) {
        super.onReadMatchRecord3(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationAlarm(@aa1 List<BleMedicationAlarm> list) {
        super.onReadMedicationAlarm(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationReminder(@aa1 List<BleMedicationReminder> list) {
        super.onReadMedicationReminder(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMeetingReminder(@aa1 List<BleMeetingReminder> list) {
        super.onReadMeetingReminder(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMindStatus(@aa1 List<BleMindStatus> list) {
        super.onReadMindStatus(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMtkOtaMeta() {
        super.onReadMtkOtaMeta();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMultiFileTransfer(@aa1 BleMapFileList bleMapFileList) {
        super.onReadMultiFileTransfer(bleMapFileList);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNetworkFirmwareVersion(@aa1 String str) {
        super.onReadNetworkFirmwareVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNoDisturb(@aa1 BleNoDisturbSettings bleNoDisturbSettings) {
        super.onReadNoDisturb(bleNoDisturbSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationLightScreenSet(int i) {
        super.onReadNotificationLightScreenSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationSettings2(@aa1 BleNotificationSettings2 bleNotificationSettings2) {
        super.onReadNotificationSettings2(bleNotificationSettings2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOfflineAsrSettings(@aa1 BleOfflineAsrSettings bleOfflineAsrSettings) {
        super.onReadOfflineAsrSettings(bleOfflineAsrSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOngoingDialogue(int i) {
        super.onReadOngoingDialogue(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOptionalMapAuthInfo(@aa1 BleOptionalMapAuthInfo bleOptionalMapAuthInfo) {
        super.onReadOptionalMapAuthInfo(bleOptionalMapAuthInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPackageStatus(@aa1 BlePackageStatus blePackageStatus) {
        super.onReadPackageStatus(blePackageStatus);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower(int i) {
        super.onReadPower(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower2(@aa1 BlePower2 blePower2) {
        super.onReadPower2(blePower2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPressure(@aa1 List<BlePressure> list) {
        super.onReadPressure(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPressureTimingMeasurement(@aa1 BlePressureTimingMeasurement blePressureTimingMeasurement) {
        super.onReadPressureTimingMeasurement(blePressureTimingMeasurement);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadQiblaSettings(@aa1 BleQiblaSettings bleQiblaSettings) {
        super.onReadQiblaSettings(bleQiblaSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRecordControl(@aa1 BleRecordControl bleRecordControl) {
        super.onReadRecordControl(bleRecordControl);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRelaxReminder(@aa1 BleRelaxReminder bleRelaxReminder) {
        super.onReadRelaxReminder(bleRelaxReminder);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRespiratoryRate(@aa1 List<BleRespiratoryRate> list) {
        super.onReadRespiratoryRate(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRestingHeartRate(int i) {
        super.onReadRestingHeartRate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRingVibrationSet(@aa1 BleRingVibrationSettings bleRingVibrationSettings) {
        super.onReadRingVibrationSet(bleRingVibrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRri(@aa1 List<BleRri> list) {
        super.onReadRri(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSDCardInfo(@aa1 BleSDCardInfo bleSDCardInfo) {
        super.onReadSDCardInfo(bleSDCardInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGCameraSet(@aa1 BleSGCameraSet bleSGCameraSet) {
        super.onReadSGCameraSet(bleSGCameraSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeySet(@aa1 BleSGKeySet bleSGKeySet) {
        super.onReadSGKeySet(bleSGKeySet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeywordAwake(@aa1 BleSGKeywordAwake bleSGKeywordAwake) {
        super.onReadSGKeywordAwake(bleSGKeywordAwake);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSet(@aa1 BleSGSet bleSGSet) {
        super.onReadSGSet(bleSGSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSleepSet(int i) {
        super.onReadSGSleepSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSOSSettings(@aa1 BleSOSSettings bleSOSSettings) {
        super.onReadSOSSettings(bleSOSSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadScreenBrightnessSet(int i) {
        super.onReadScreenBrightnessSet(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSedentariness(@aa1 BleSedentarinessSettings bleSedentarinessSettings) {
        super.onReadSedentariness(bleSedentarinessSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSleep(@aa1 List<BleSleep> list) {
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
    public /* bridge */ void onReadSleepQuality(@aa1 BleSleepQuality bleSleepQuality) {
        super.onReadSleepQuality(bleSleepQuality);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSleepQualityScore(int i) {
        super.onReadSleepQualityScore(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSleepRaw(@aa1 byte[] bArr) {
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
    public /* bridge */ void onReadSosCallLog(@aa1 List<BleSosCallLog> list) {
        super.onReadSosCallLog(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSosContact(@aa1 BleSosContact bleSosContact) {
        super.onReadSosContact(bleSosContact);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSportDurationGoal(int i) {
        super.onReadSportDurationGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStandbyWatchFaceSet(@aa1 BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
        super.onReadStandbyWatchFaceSet(bleStandbyWatchFaceSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStepGoal(int i) {
        super.onReadStepGoal(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStock(@aa1 List<BleStock> list) {
        super.onReadStock(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTemperature(@aa1 List<BleTemperature> list) {
        super.onReadTemperature(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTemperatureUnit(int i) {
        super.onReadTemperatureUnit(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTrainingStatus(@aa1 List<BleTrainingStatus> list) {
        super.onReadTrainingStatus(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTuyaKey(@aa1 BleTuyaKey bleTuyaKey) {
        super.onReadTuyaKey(bleTuyaKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUiPackVersion(@aa1 String str) {
        super.onReadUiPackVersion(str);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUnit(int i) {
        super.onReadUnit(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUserProfile(@aa1 BleUserProfile bleUserProfile) {
        super.onReadUserProfile(bleUserProfile);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadVitalityValue(@aa1 List<BleVitality> list) {
        super.onReadVitalityValue(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadVoiceControl(int i) {
        super.onReadVoiceControl(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceId(@aa1 BleWatchFaceId bleWatchFaceId) {
        super.onReadWatchFaceId(bleWatchFaceId);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceIndex(@aa1 BleWatchFaceIndex bleWatchFaceIndex) {
        super.onReadWatchFaceIndex(bleWatchFaceIndex);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceMaxSize(@aa1 BleWatchFaceMaxSize bleWatchFaceMaxSize) {
        super.onReadWatchFaceMaxSize(bleWatchFaceMaxSize);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceSwitch(int i) {
        super.onReadWatchFaceSwitch(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchPassword(@aa1 BleSettingWatchPassword bleSettingWatchPassword) {
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
    public /* bridge */ void onReadWechatPaySettings(@aa1 BleWechatPaySettings bleWechatPaySettings) {
        super.onReadWechatPaySettings(bleWechatPaySettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout(@aa1 List<BleWorkout> list) {
        super.onReadWorkout(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout2(@aa1 List<BleWorkout2> list) {
        super.onReadWorkout2(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout3(@aa1 List<BleWorkout3> list) {
        super.onReadWorkout3(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout4(@aa1 List<BleWorkout4> list) {
        super.onReadWorkout4(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout4Segmentation(@aa1 BleWorkout4Segmentation bleWorkout4Segmentation) {
        super.onReadWorkout4Segmentation(bleWorkout4Segmentation);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorldClock(@aa1 List<BleWorldClock> list) {
        super.onReadWorldClock(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRealTimeMeasurement(@aa1 BleRealTimeMeasurement bleRealTimeMeasurement) {
        super.onRealTimeMeasurement(bleRealTimeMeasurement);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveCmTrace(@aa1 byte[] bArr, boolean z) {
        super.onReceiveCmTrace(bArr, z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveFilePacket(@aa1 BleReceiveFilePacket bleReceiveFilePacket) {
        super.onReceiveFilePacket(bleReceiveFilePacket);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorMotion(@aa1 List<BleGSensorMotion> gSensorMotions) {
        Intrinsics.X0O(gSensorMotions, "gSensorMotions");
        if (this.mState) {
            this.mMotionData.add(gSensorMotions);
            if (this.mMotionData.size() > 60) {
                this.mMotionData.removeFirst();
            }
            updateMotion();
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorRaw(@aa1 List<BleGSensorRaw> gSensorRaws) {
        Intrinsics.X0O(gSensorRaws, "gSensorRaws");
        if (this.mState) {
            List<BleGSensorRaw> list = gSensorRaws;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf(((BleGSensorRaw) it.next()).getMX()));
            }
            double dO0i = CollectionsKt___CollectionsKt.O0i(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Short.valueOf(((BleGSensorRaw) it2.next()).getMY()));
            }
            double dO0i2 = CollectionsKt___CollectionsKt.O0i(arrayList2);
            double dSqrt = Math.sqrt((dO0i * dO0i) + (dO0i2 * dO0i2));
            i1O0OXO1O.OXO1.XOO0ii0("onReceiveGSensorRaw -> xAvg=" + dO0i + ", yAvg=" + dO0i2 + ", p=" + dSqrt + ", a=" + ((((double) 90) * dSqrt) / ((double) 512)));
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            String strIXO0OOi = oe5.IXO0OOi(CollectionsKt___CollectionsKt.XOiXXOO(list, null, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iXX0X
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeveloperGsensorActivity.onReceiveGSensorRaw$lambda$2(simpleDateFormat, (BleGSensorRaw) obj);
                }
            }, 31, null), ", ", "", false, 4, null);
            File file = this.mGsensorFile;
            if (file != null) {
                iI0OiO.m2062IO(file, strIXO0OOi, null, 2, null);
            }
            this.mData.add(gSensorRaws);
            if (this.mData.size() > 60) {
                this.mData.removeFirst();
            }
            updateGsensor();
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveGSensorSHSY(@aa1 List<BleGSensorSHSY> list) {
        super.onReceiveGSensorSHSY(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveHRRaw(@aa1 List<BleHRRaw> hrRaws) {
        Intrinsics.X0O(hrRaws, "hrRaws");
        if (this.mState) {
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            String strIXO0OOi = oe5.IXO0OOi(CollectionsKt___CollectionsKt.XOiXXOO(hrRaws, null, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.i10XX0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeveloperGsensorActivity.onReceiveHRRaw$lambda$0(simpleDateFormat, (BleHRRaw) obj);
                }
            }, 31, null), ", ", "", false, 4, null);
            File file = this.mHrFile;
            if (file != null) {
                iI0OiO.m2062IO(file, strIXO0OOi, null, 2, null);
            }
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGga(@aa1 BleLocationGga bleLocationGga) {
        super.onReceiveLocationGga(bleLocationGga);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGsv(@aa1 List<BleLocationGsv> list) {
        super.onReceiveLocationGsv(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveMusicCommand(@aa1 MusicCommand musicCommand) {
        super.onReceiveMusicCommand(musicCommand);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceivePpgSHSY(@aa1 List<BlePpgSHSY> list) {
        super.onReceivePpgSHSY(list);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveRealtimeLog(@aa1 BleRealtimeLog bleRealtimeLog) {
        super.onReceiveRealtimeLog(bleRealtimeLog);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveRecordPacket(@aa1 BleRecordPacket bleRecordPacket) {
        super.onReceiveRecordPacket(bleRecordPacket);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRecordControlUpdate(@aa1 BleRecordControl bleRecordControl) {
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
    public /* bridge */ void onRingVibrationSetUpdate(@aa1 BleRingVibrationSettings bleRingVibrationSettings) {
        super.onRingVibrationSetUpdate(bleRingVibrationSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSDCardInfoUpdate(@aa1 BleSDCardInfo bleSDCardInfo) {
        super.onSDCardInfoUpdate(bleSDCardInfo);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTestUpdate(@aa1 BleSGTest bleSGTest) {
        super.onSGTestUpdate(bleSGTest);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTtsUpdate(@aa1 BleSGTts bleSGTts) {
        super.onSGTtsUpdate(bleSGTts);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSOSSettingsUpdate(@aa1 BleSOSSettings bleSOSSettings) {
        super.onSOSSettingsUpdate(bleSOSSettings);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onScreenBrightnessSetUpdate(int i) {
        super.onScreenBrightnessSetUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSessionStateChange(boolean z) {
        super.onSessionStateChange(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSleepNotifyUpdate(@aa1 BleSleepNotify bleSleepNotify) {
        super.onSleepNotifyUpdate(bleSleepNotify);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSosContactUpdate(@aa1 BleSosContact bleSosContact) {
        super.onSosContactUpdate(bleSosContact);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSportEndNotifyUpdate(int i) {
        super.onSportEndNotifyUpdate(i);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onStandbyWatchFaceSetUpdate(@aa1 BleStandbyWatchFaceSet bleStandbyWatchFaceSet) {
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
    public /* bridge */ void onStreamProgress(boolean z, int i, int i2, int i3, @aa1 BleKey bleKey) {
        super.onStreamProgress(z, i, i2, i3, bleKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSyncData(int i, @aa1 BleKey bleKey) {
        super.onSyncData(i, bleKey);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onTimeUpdate() {
        super.onTimeUpdate();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 bleAICoachBeforePlanV2) {
        super.onUpdateAICoachGenerateBeforeInfoV2(bleAICoachBeforePlanV2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachLeaveDay(@aa1 BleLeaveDay bleLeaveDay) {
        super.onUpdateAICoachLeaveDay(bleLeaveDay);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAppSportState(@aa1 BleAppSportState bleAppSportState) {
        super.onUpdateAppSportState(bleAppSportState);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateBAC(@aa1 BleBAC bleBAC) {
        super.onUpdateBAC(bleBAC);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateBloodPressure(@aa1 BleBloodPressure bleBloodPressure) {
        super.onUpdateBloodPressure(bleBloodPressure);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateHeartRate(@aa1 BleHeartRate bleHeartRate) {
        super.onUpdateHeartRate(bleHeartRate);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateTemperature(@aa1 BleTemperature bleTemperature) {
        super.onUpdateTemperature(bleTemperature);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateWatchFaceSwitch(boolean z) {
        super.onUpdateWatchFaceSwitch(z);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUserProfileUpdate(@aa1 BleUserProfile bleUserProfile) {
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
    public /* bridge */ void onWatchFaceIndexUpdate(@aa1 BleWatchFaceIndex bleWatchFaceIndex) {
        super.onWatchFaceIndexUpdate(bleWatchFaceIndex);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onWatchPasswordUpdate(@aa1 BleSettingWatchPassword bleSettingWatchPassword) {
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
    public /* bridge */ void onXMLYBandSetUpdate(@aa1 BleXMLYBandSet bleXMLYBandSet) {
        super.onXMLYBandSetUpdate(bleXMLYBandSet);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onXModem(byte b) {
        super.onXModem(b);
    }

    public final void toggle(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mState = !this.mState;
        getBtn().setText(this.mState ? "Pause" : "Start");
        BaseBleConnector.sendBoolean$default(BleConnector.INSTANCE, BleKey.GSENSOR_OUTPUT, BleKeyFlag.UPDATE, this.mState, false, false, 24, null);
        if (this.mState) {
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            bleInitializer.I0OX(0L);
            bleInitializer.I00(0L);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            sz0 sz0Var = sz0.OXO1;
            this.mGsensorFile = uz0.Ii0X0X(sz0Var, this.mAppUser.getNickname() + "_GSensor_" + simpleDateFormat.format(new Date()) + ".csv");
            this.mHrFile = uz0.XXiIiX10(sz0Var, this.mAppUser.getNickname() + "_HR_" + simpleDateFormat.format(new Date()) + ".csv");
        }
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStock(boolean z) {
        super.onReadStock(z);
    }
}
