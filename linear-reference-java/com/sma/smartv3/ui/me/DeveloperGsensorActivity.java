package com.sma.smartv3.ui.me;

import android.bluetooth.BluetoothDevice;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I1O1IIi;
import com.android.mltcode.paycertificationapi.I1XI010;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.i10XX0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iI0OiO;
import com.android.mltcode.paycertificationapi.iXX0X;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperGsensorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperGsensorActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGsensorActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n19#2:176\n15#2:177\n1563#3:178\n1634#3,3:179\n1563#3:182\n1634#3,3:183\n*S KotlinDebug\n*F\n+ 1 DeveloperGsensorActivity.kt\ncom/sma/smartv3/ui/me/DeveloperGsensorActivity\n*L\n43#1:176\n43#1:177\n81#1:178\n81#1:179,3\n82#1:182\n82#1:183,3\n*E\n"})
public final class DeveloperGsensorActivity extends BaseActivity implements BleHandleCallback {

    @aa1
    private final Lazy btn$delegate;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final LinkedList<List<BleGSensorRaw>> mData;

    @tb1
    private File mGsensorFile;

    @tb1
    private File mHrFile;

    @aa1
    private final LinkedList<List<BleGSensorMotion>> mMotionData;
    private boolean mState;

    public DeveloperGsensorActivity() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new I1O1IIi(this));
        this.btn$delegate = LazyKt__LazyJVMKt.iO(new I1XI010(this));
        this.mData = new LinkedList();
        this.mMotionData = new LinkedList();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ CharSequence I0iXXO(SimpleDateFormat r0, BleGSensorRaw r1) {
        return onReceiveGSensorRaw$lambda$2(r0, r1);
    }

    public static /* synthetic */ LineChart OIX0iXi(DeveloperGsensorActivity r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button X1ii(DeveloperGsensorActivity r0) {
        return btn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CharSequence XXI(SimpleDateFormat r0, BleHRRaw r1) {
        return onReceiveHRRaw$lambda$0(r0, r1);
    }

    private static final Button btn_delegate$lambda$0(DeveloperGsensorActivity r1) {
        return (Button) r1.findViewById(R.id.btn_start);
    }

    private final Button getBtn() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (Button) r0;
    }

    private final LineChart getLineChart() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (LineChart) r0;
    }

    private static final LineChart lineChart_delegate$lambda$0(DeveloperGsensorActivity r1) {
        return (LineChart) r1.findViewById(R.id.line_chart);
    }

    private static final CharSequence onReceiveGSensorRaw$lambda$2(SimpleDateFormat r3, BleGSensorRaw r4) {
        Intrinsics.X0O(r4, "it");
        return r3.format(new Date()) + I000IiI1O.iO.XO0O10 + r4.getMX() + I000IiI1O.iO.XO0O10 + r4.getMY() + I000IiI1O.iO.XO0O10 + r4.getMZ() + "\n";
    }

    private static final CharSequence onReceiveHRRaw$lambda$0(SimpleDateFormat r1, BleHRRaw r2) {
        Intrinsics.X0O(r2, "it");
        return r1.format(new Date()) + I000IiI1O.iO.XO0O10 + r2.getMPpg() + "\n";
    }

    private final void updateGsensor() {
        ArrayList r1 = new ArrayList();
        ArrayList r2 = new ArrayList();
        ArrayList r3 = new ArrayList();
        Iterator<List<BleGSensorRaw>> r4 = this.mData.iterator();
        Intrinsics.O10IXXX0X(r4, "iterator(...)");
    L4:
        if (r4.hasNext() == false) goto L9;
        List<BleGSensorRaw> r5 = r4.next();
        Intrinsics.O10IXXX0X(r5, "next(...)");
        Iterator<BleGSensorRaw> r6 = r5.iterator();
    L7:
        if (r6.hasNext() == false) goto L4;
        BleGSensorRaw r7 = r6.next();
        r1.add(new Entry(r1.size(), r7.getMX()));
        r2.add(new Entry(r2.size(), r7.getMY()));
        r3.add(new Entry(r3.size(), r7.getMZ()));
        goto L7
    L9:
        LineDataSet r8 = new LineDataSet(r1, "X");
        r8.OXOO0X0i(false);
        r8.II1(Color.parseColor("#ff0000"));
        LineDataSet.Mode r9 = LineDataSet.Mode.HORIZONTAL_BEZIER;
        r8.OXXO0O1X(r9);
        LineDataSet r10 = new LineDataSet(r2, Api.Y);
        r10.OXOO0X0i(false);
        r10.II1(Color.parseColor("#00ff00"));
        r10.OXXO0O1X(r9);
        LineDataSet r11 = new LineDataSet(r3, "Z");
        r11.OXOO0X0i(false);
        r11.II1(Color.parseColor("#0000ff"));
        r11.OXXO0O1X(r9);
        getLineChart().setData(new co(new IiXO1XOi[]{r8, r10, r11}));
        getLineChart().invalidate();
    }

    private final void updateMotion() {
        ArrayList r2 = new ArrayList();
        Iterator<List<BleGSensorMotion>> r3 = this.mMotionData.iterator();
        Intrinsics.O10IXXX0X(r3, "iterator(...)");
    L4:
        if (r3.hasNext() == false) goto L9;
        List<BleGSensorMotion> r4 = r3.next();
        Intrinsics.O10IXXX0X(r4, "next(...)");
        Iterator<BleGSensorMotion> r5 = r4.iterator();
    L7:
        if (r5.hasNext() == false) goto L4;
        r2.add(new Entry(r2.size(), r5.next().getMMotion()));
        goto L7
    L9:
        LineDataSet r6 = new LineDataSet(r2, "motion");
        r6.II1(Color.parseColor("#ff0000"));
        r6.OXO1(true);
        r6.OXXO0O1X(LineDataSet.Mode.HORIZONTAL_BEZIER);
        r6.OXOO0X0i(false);
        getLineChart().setData(new co(new IiXO1XOi[]{r6}));
        getLineChart().invalidate();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        setRequestedOrientation(0);
        BleConnector.INSTANCE.addHandleCallback(this);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        MyMarkerView r0 = new MyMarkerView(this, R.layout.marker_view_developer_gsensor);
        r0.setChartView(getLineChart());
        getLineChart().setMarker(r0);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_gsensor;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICoachGeneratePlanUpdate(int r1) {
        super.onAICoachGeneratePlanUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAICommandUpdate(@aa1 BleAICommand r1) {
        super.onAICommandUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onActivityRecognitionUpdate(int r1) {
        super.onActivityRecognitionUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmAdd(@aa1 BleAlarm r1) {
        super.onAlarmAdd(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmDelete(int r1) {
        super.onAlarmDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAlarmUpdate(@aa1 BleAlarm r1) {
        super.onAlarmUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppOpUpdate(@aa1 BleAppOp r1) {
        super.onAppOpUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onAppSportDataResponse(boolean r1) {
        super.onAppSportDataResponse(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBWNaviInfoUpdate(@aa1 BleBWNaviInfo r1) {
        super.onBWNaviInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBacklightUpdate(int r1) {
        super.onBacklightUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBandKeyUpdate(@aa1 BleBandKey r1) {
        super.onBandKeyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleGolfScore(@aa1 BleGolfScore r1) {
        super.onBleGolfScore(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleThirdPartyDataUpdate(@aa1 BleThirdPartyData r1) {
        super.onBleThirdPartyDataUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onBleVideoCallInfo(@aa1 BleVideoCallInfo r1) {
        super.onBleVideoCallInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPChatUpdate(@aa1 BleCPChat r1) {
        super.onCPChatUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPGiftsInfoUpdate(@aa1 BleCPGiftsInfo r1) {
        super.onCPGiftsInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPListenerUpdate(@aa1 BleCPListener r1) {
        super.onCPListenerUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPMissYouUpdate(@aa1 BleCPMissYou r1) {
        super.onCPMissYouUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCPTodoUpdate(@aa1 BleCPTodo r1) {
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
    public /* bridge */ void onChatAppUpdate(@aa1 BleChatApp r1) {
        super.onChatAppUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatMessageUpdate(@aa1 BleChatMessage r1) {
        super.onChatMessageUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onChatVoiceUpdate(@aa1 BleChatVoice r1) {
        super.onChatVoiceUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCheckInEveryDayUpdate(@aa1 BleCheckInEveryDay r1) {
        super.onCheckInEveryDayUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onClassicBluetoothStateChange(int r1) {
        super.onClassicBluetoothStateChange(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCommandReply(@aa1 BleKey r1, @aa1 BleKeyFlag r2, boolean r3) {
        super.onCommandReply(r1, r2, r3);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onCommandSendTimeout(@aa1 BleKey r1, @aa1 BleKeyFlag r2) {
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

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.removeHandleCallback(this);
        if (this.mState == false) goto L5;
        BaseBleConnector.sendBoolean$default(r0, BleKey.GSENSOR_OUTPUT, BleKeyFlag.UPDATE, false, false, false, 24, null);
    L5:
        super.onDestroy();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceConnected(@aa1 BluetoothDevice r1) {
        super.onDeviceConnected(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceConnecting(boolean r1) {
        super.onDeviceConnecting(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceFileUpdate(@aa1 BleDeviceFile r1) {
        super.onDeviceFileUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceOpUpdate(int r1) {
        super.onDeviceOpUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceRequestAGpsFile(@aa1 String r1) {
        super.onDeviceRequestAGpsFile(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceSMSQuickReply(@aa1 BleSMSQuickReply r1) {
        super.onDeviceSMSQuickReply(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDeviceSportDataUpdate(@aa1 BleDeviceSportData r1) {
        super.onDeviceSportDataUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDistanceGoalUpdate(int r1) {
        super.onDistanceGoalUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDoubleScreenSettingsUpdate(@aa1 BleDoubleScreenSettings r1) {
        super.onDoubleScreenSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onDrinkWaterUpdate(@aa1 BleDrinkWaterSettings r1) {
        super.onDrinkWaterUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneAncSettingsUpdate(@aa1 BleEarphoneAncSettings r1) {
        super.onEarphoneAncSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneCallUpdate(int r1) {
        super.onEarphoneCallUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneKeyUpdate(@aa1 BleEarphoneKey r1) {
        super.onEarphoneKeyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(@aa1 BleEarphoneSoundEffectsSettings r1) {
        super.onEarphoneSoundEffectsSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onEarphoneStateUpdate(@aa1 BleEarphoneState r1) {
        super.onEarphoneStateUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFactoryTestUpdate(@aa1 BleFactoryTest r1) {
        super.onFactoryTestUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFallSetUpdate(int r1) {
        super.onFallSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onFindEarphoneUpdate(@aa1 BleFindEarphone r1) {
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
    public /* bridge */ void onGameControlUpdate(@aa1 BleGameControl r1) {
        super.onGameControlUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWake2Update(@aa1 BleGestureWake2 r1) {
        super.onGestureWake2Update(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGestureWakeUpdate(@aa1 BleGestureWake r1) {
        super.onGestureWakeUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onGoogleNaviInfoUpdate(@aa1 BleGoogleNaviInfo r1) {
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
    public /* bridge */ void onHRWarningSet(@aa1 BleHrWarningSettings r1) {
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
    public /* bridge */ void onHydrationUpdate(@aa1 BleHydrationSettings r1) {
        super.onHydrationUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCExceptionUpdate(@aa1 BleIPCException r1) {
        super.onIPCExceptionUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCOTAStateUpdate(@aa1 BleIPCOTAState r1) {
        super.onIPCOTAStateUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStateUpdate(@aa1 BleIPCState r1) {
        super.onIPCStateUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCStoresInfoUpdate(@aa1 BleIPCStoresInfo r1) {
        super.onIPCStoresInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIPCWifiInfoUpdate(@aa1 BleIPCWifiInfo r1) {
        super.onIPCWifiInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onIdentityCreate(boolean r1, @tb1 BleDeviceInfo r2) {
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
    public /* bridge */ void onLoveTapUpdate(@aa1 BleLoveTap r1) {
        super.onLoveTapUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserDelete(int r1) {
        super.onLoveTapUserDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onLoveTapUserUpdate(@aa1 BleLoveTapUser r1) {
        super.onLoveTapUserUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeasurementUpdate(@aa1 BleMeasurement r1) {
        super.onMeasurementUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmAdd(@aa1 BleMedicationAlarm r1) {
        super.onMedicationAlarmAdd(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmDelete(int r1) {
        super.onMedicationAlarmDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationAlarmUpdate(@aa1 BleMedicationAlarm r1) {
        super.onMedicationAlarmUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderDelete(int r1) {
        super.onMedicationReminderDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMedicationReminderUpdate(@aa1 BleMedicationReminder r1) {
        super.onMedicationReminderUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderAdd(@aa1 BleMeetingReminder r1) {
        super.onMeetingReminderAdd(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderDelete(int r1) {
        super.onMeetingReminderDelete(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onMeetingReminderUpdate(@aa1 BleMeetingReminder r1) {
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
    public /* bridge */ void onNaviInfoUpdate(@aa1 BleNaviInfo r1) {
        super.onNaviInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNoDisturbUpdate(@aa1 BleNoDisturbSettings r1) {
        super.onNoDisturbUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationLightScreenSetUpdate(int r1) {
        super.onNotificationLightScreenSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onNotificationSettings2Update(@aa1 BleNotificationSettings2 r1) {
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
    public /* bridge */ void onReadAICoachGenerateBeforeInfo(@aa1 BleAICoachBeforePlan r1) {
        super.onReadAICoachGenerateBeforeInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 r1) {
        super.onReadAICoachGenerateBeforeInfoV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlan(@aa1 BleAICoachGeneratePlan r1) {
        super.onReadAICoachPlan(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAICoachPlanV2(@aa1 BleAICoachGeneratePlanV2 r1) {
        super.onReadAICoachPlanV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadActivity(@aa1 List<BleActivity> r1) {
        super.onReadActivity(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadActivityDetail(@aa1 BleActivityDetail r1) {
        super.onReadActivityDetail(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAddressBook(@aa1 BleAddressBook r1) {
        super.onReadAddressBook(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlarm(@aa1 List<BleAlarm> r1) {
        super.onReadAlarm(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlipayBindInfo(@aa1 List<BleAlipayBindInfo> r1) {
        super.onReadAlipayBindInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAlipaySettings(@aa1 BleAlipaySettings r1) {
        super.onReadAlipaySettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppApiVersion(@aa1 String r1) {
        super.onReadAppApiVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppInfoList(@aa1 BleAppInfoList r1) {
        super.onReadAppInfoList(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAppSportState(@aa1 BleAppSportState r1) {
        super.onReadAppSportState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadAvgHeartRate(@aa1 List<BleAvgHeartRate> r1) {
        super.onReadAvgHeartRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBAC(@aa1 List<BleBAC> r1) {
        super.onReadBAC(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacCalibration(@aa1 BleBacCalibration r1, @aa1 BleKeyFlag r2) {
        super.onReadBacCalibration(r1, r2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBacklight(int r1) {
        super.onReadBacklight(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBatteryUsage(@aa1 BleBatteryUsage r1) {
        super.onReadBatteryUsage(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleAddress(@aa1 String r1) {
        super.onReadBleAddress(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfMapCacheInfo(@aa1 BleGolfMapCacheInfo r1) {
        super.onReadBleGolfMapCacheInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfSportSwitch(@aa1 BleGolfSportSwitch r1) {
        super.onReadBleGolfSportSwitch(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchMapInfo(@aa1 BleGolfWatchMapInfo r1) {
        super.onReadBleGolfWatchMapInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleGolfWatchVersionInfo(@aa1 BleGolfWatchVersionInfo r1) {
        super.onReadBleGolfWatchVersionInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleHrv(@aa1 List<BleHrv> r1) {
        super.onReadBleHrv(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBleLogText(@aa1 List<BleLogText> r1) {
        super.onReadBleLogText(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodGlucose(@aa1 List<BleBloodGlucose> r1) {
        super.onReadBloodGlucose(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodOxyGenSettings(@aa1 BleBloodOxyGenSettings r1) {
        super.onReadBloodOxyGenSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodOxygen(@aa1 List<BleBloodOxygen> r1) {
        super.onReadBloodOxygen(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodPressure(@aa1 List<BleBloodPressure> r1) {
        super.onReadBloodPressure(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBloodPressureCalibration(@aa1 BleBloodPressureCalibration r1) {
        super.onReadBloodPressureCalibration(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadBodyStatus(@aa1 List<BleBodyStatus> r1) {
        super.onReadBodyStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCPUserInfo(@aa1 BleCPUserInfo r1) {
        super.onReadCPUserInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalibrationData(@aa1 BleCalibrationData r1) {
        super.onReadCalibrationData(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCalorieIntake(@aa1 List<BleCalorieIntake> r1) {
        super.onReadCalorieIntake(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCaloriesGoal(int r1) {
        super.onReadCaloriesGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadChatApp(@aa1 BleChatApp r1) {
        super.onReadChatApp(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCheckInEveryDay(@aa1 BleCheckInEveryDay r1) {
        super.onReadCheckInEveryDay(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadClassicBluetoothState(int r1) {
        super.onReadClassicBluetoothState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCoachingIds(@aa1 BleCoachingIds r1) {
        super.onReadCoachingIds(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadCyWeeAlgorithm(@aa1 BleCyWeeAlgorithm r1) {
        super.onReadCyWeeAlgorithm(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDailyPower(@aa1 List<BlePhysicalPower> r1) {
        super.onReadDailyPower(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDateFormat(int r1) {
        super.onReadDateFormat(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFile(@aa1 BleDeviceFile r1) {
        super.onReadDeviceFile(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceFileV2(@aa1 BleDeviceFile2 r1) {
        super.onReadDeviceFileV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo(@aa1 BleDeviceInfo r1) {
        super.onReadDeviceInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceInfo2(@aa1 BleDeviceInfo2 r1) {
        super.onReadDeviceInfo2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages(@aa1 BleDeviceLanguages r1) {
        super.onReadDeviceLanguages(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceLanguages2(@aa1 BleDeviceLanguages2 r1) {
        super.onReadDeviceLanguages2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDeviceUniqueDataSettings(@aa1 BleDeviceUniqueDataSettings r1) {
        super.onReadDeviceUniqueDataSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDistanceGoal(int r1) {
        super.onReadDistanceGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDoubleScreenSettings(@aa1 BleDoubleScreenSettings r1) {
        super.onReadDoubleScreenSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadDrinkWater(@aa1 BleDrinkWaterSettings r1) {
        super.onReadDrinkWater(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadECGRealtime(@aa1 BleECGRealtime r1) {
        super.onReadECGRealtime(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneAncSettings(@aa1 BleEarphoneAncSettings r1) {
        super.onReadEarphoneAncSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneCall(int r1) {
        super.onReadEarphoneCall(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneInfo(@aa1 BleEarphoneInfo r1) {
        super.onReadEarphoneInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneKey(@aa1 BleEarphoneKey r1) {
        super.onReadEarphoneKey(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphonePower(@aa1 BleEarphonePower r1) {
        super.onReadEarphonePower(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneSoundEffectsSettings(@aa1 BleEarphoneSoundEffectsSettings r1) {
        super.onReadEarphoneSoundEffectsSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEarphoneState(@aa1 BleEarphoneState r1) {
        super.onReadEarphoneState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEcg(@aa1 List<BleEcg> r1) {
        super.onReadEcg(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEcgSettings(@aa1 BleEcgSettings r1) {
        super.onReadEcgSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadEnergyRating(@aa1 List<BleEnergyRating> r1) {
        super.onReadEnergyRating(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFallSet(int r1) {
        super.onReadFallSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFilePath(@aa1 BleAppAudioBookList r1) {
        super.onReadFilePath(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFirmwareVersion(@aa1 String r1) {
        super.onReadFirmwareVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadFoodBalance(@aa1 List<BleFoodBalance> r1) {
        super.onReadFoodBalance(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake(@aa1 BleGestureWake r1) {
        super.onReadGestureWake(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGestureWake2(@aa1 BleGestureWake2 r1) {
        super.onReadGestureWake2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareMonthly(@aa1 BleGirlCareMonthly r1) {
        super.onReadGirlCareMonthly(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGirlCareSettings(@aa1 BleGirlCareSettings r1) {
        super.onReadGirlCareSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGoMoreSettings(@aa1 BleGoMoreSettings r1) {
        super.onReadGoMoreSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGolfWatchScore(@aa1 BleGolfWatchScore r1) {
        super.onReadGolfWatchScore(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadGpsFirmwareVersion(@aa1 String r1) {
        super.onReadGpsFirmwareVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHanBaoSettings(@aa1 BleHanBaoSettings r1) {
        super.onReadHanBaoSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHanBaoVibration(@aa1 List<BleHanBaoVibration> r1) {
        super.onReadHanBaoVibration(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHeartRate(@aa1 List<BleHeartRate> r1) {
        super.onReadHeartRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHeartRateZones(@aa1 BleHeartRateZones r1) {
        super.onReadHeartRateZones(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHourSystem(int r1) {
        super.onReadHourSystem(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettings(@aa1 BleHrMonitoringSettings r1) {
        super.onReadHrMonitoringSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrMonitoringSettingsV2(int r1) {
        super.onReadHrMonitoringSettingsV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvBaseLine(@aa1 BleHrvBaseLine r1) {
        super.onReadHrvBaseLine(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHrvMonitoringSettings(@aa1 BleHrvMonitoringSettings r1) {
        super.onReadHrvMonitoringSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadHydrationSettings(@aa1 BleHydrationSettings r1) {
        super.onReadHydrationSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCInfo(@aa1 BleIPCInfo r1) {
        super.onReadIPCInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCState(@aa1 BleIPCState r1) {
        super.onReadIPCState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCStoresInfo(@aa1 BleIPCStoresInfo r1) {
        super.onReadIPCStoresInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIPCVersion(@aa1 String r1) {
        super.onReadIPCVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadIncomingCallRing(int r1) {
        super.onReadIncomingCallRing(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLactateThreshold(@aa1 List<BleLactateThreshold> r1) {
        super.onReadLactateThreshold(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguage(int r1) {
        super.onReadLanguage(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLanguagePackVersion(@aa1 BleLanguagePackVersion r1) {
        super.onReadLanguagePackVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLocation(@aa1 List<BleLocation> r1) {
        super.onReadLocation(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadLoveTapUser(@aa1 List<BleLoveTapUser> r1) {
        super.onReadLoveTapUser(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMatchRecord(@aa1 List<BleMatchRecord> r1) {
        super.onReadMatchRecord(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMatchRecord2(@aa1 List<BleMatchRecord2> r1) {
        super.onReadMatchRecord2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMatchRecord3(@aa1 List<BleMatchRecord3> r1) {
        super.onReadMatchRecord3(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationAlarm(@aa1 List<BleMedicationAlarm> r1) {
        super.onReadMedicationAlarm(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMedicationReminder(@aa1 List<BleMedicationReminder> r1) {
        super.onReadMedicationReminder(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMeetingReminder(@aa1 List<BleMeetingReminder> r1) {
        super.onReadMeetingReminder(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMindStatus(@aa1 List<BleMindStatus> r1) {
        super.onReadMindStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMtkOtaMeta() {
        super.onReadMtkOtaMeta();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadMultiFileTransfer(@aa1 BleMapFileList r1) {
        super.onReadMultiFileTransfer(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNetworkFirmwareVersion(@aa1 String r1) {
        super.onReadNetworkFirmwareVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNoDisturb(@aa1 BleNoDisturbSettings r1) {
        super.onReadNoDisturb(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationLightScreenSet(int r1) {
        super.onReadNotificationLightScreenSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadNotificationSettings2(@aa1 BleNotificationSettings2 r1) {
        super.onReadNotificationSettings2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOfflineAsrSettings(@aa1 BleOfflineAsrSettings r1) {
        super.onReadOfflineAsrSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOngoingDialogue(int r1) {
        super.onReadOngoingDialogue(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadOptionalMapAuthInfo(@aa1 BleOptionalMapAuthInfo r1) {
        super.onReadOptionalMapAuthInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPackageStatus(@aa1 BlePackageStatus r1) {
        super.onReadPackageStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower(int r1) {
        super.onReadPower(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPower2(@aa1 BlePower2 r1) {
        super.onReadPower2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPressure(@aa1 List<BlePressure> r1) {
        super.onReadPressure(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadPressureTimingMeasurement(@aa1 BlePressureTimingMeasurement r1) {
        super.onReadPressureTimingMeasurement(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadQiblaSettings(@aa1 BleQiblaSettings r1) {
        super.onReadQiblaSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRecordControl(@aa1 BleRecordControl r1) {
        super.onReadRecordControl(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRelaxReminder(@aa1 BleRelaxReminder r1) {
        super.onReadRelaxReminder(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRespiratoryRate(@aa1 List<BleRespiratoryRate> r1) {
        super.onReadRespiratoryRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRestingHeartRate(int r1) {
        super.onReadRestingHeartRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRingVibrationSet(@aa1 BleRingVibrationSettings r1) {
        super.onReadRingVibrationSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadRri(@aa1 List<BleRri> r1) {
        super.onReadRri(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSDCardInfo(@aa1 BleSDCardInfo r1) {
        super.onReadSDCardInfo(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGCameraSet(@aa1 BleSGCameraSet r1) {
        super.onReadSGCameraSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeySet(@aa1 BleSGKeySet r1) {
        super.onReadSGKeySet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGKeywordAwake(@aa1 BleSGKeywordAwake r1) {
        super.onReadSGKeywordAwake(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSet(@aa1 BleSGSet r1) {
        super.onReadSGSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSGSleepSet(int r1) {
        super.onReadSGSleepSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSOSSettings(@aa1 BleSOSSettings r1) {
        super.onReadSOSSettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadScreenBrightnessSet(int r1) {
        super.onReadScreenBrightnessSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSedentariness(@aa1 BleSedentarinessSettings r1) {
        super.onReadSedentariness(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSleep(@aa1 List<BleSleep> r1) {
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
    public /* bridge */ void onReadSleepQuality(@aa1 BleSleepQuality r1) {
        super.onReadSleepQuality(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSleepQualityScore(int r1) {
        super.onReadSleepQualityScore(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSleepRaw(@aa1 byte[] r1) {
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
    public /* bridge */ void onReadSosCallLog(@aa1 List<BleSosCallLog> r1) {
        super.onReadSosCallLog(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSosContact(@aa1 BleSosContact r1) {
        super.onReadSosContact(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadSportDurationGoal(int r1) {
        super.onReadSportDurationGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStandbyWatchFaceSet(@aa1 BleStandbyWatchFaceSet r1) {
        super.onReadStandbyWatchFaceSet(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStepGoal(int r1) {
        super.onReadStepGoal(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStock(@aa1 List<BleStock> r1) {
        super.onReadStock(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTemperature(@aa1 List<BleTemperature> r1) {
        super.onReadTemperature(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTemperatureUnit(int r1) {
        super.onReadTemperatureUnit(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTrainingStatus(@aa1 List<BleTrainingStatus> r1) {
        super.onReadTrainingStatus(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadTuyaKey(@aa1 BleTuyaKey r1) {
        super.onReadTuyaKey(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUiPackVersion(@aa1 String r1) {
        super.onReadUiPackVersion(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUnit(int r1) {
        super.onReadUnit(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadUserProfile(@aa1 BleUserProfile r1) {
        super.onReadUserProfile(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadVitalityValue(@aa1 List<BleVitality> r1) {
        super.onReadVitalityValue(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadVoiceControl(int r1) {
        super.onReadVoiceControl(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceId(@aa1 BleWatchFaceId r1) {
        super.onReadWatchFaceId(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceIndex(@aa1 BleWatchFaceIndex r1) {
        super.onReadWatchFaceIndex(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceMaxSize(@aa1 BleWatchFaceMaxSize r1) {
        super.onReadWatchFaceMaxSize(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchFaceSwitch(int r1) {
        super.onReadWatchFaceSwitch(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWatchPassword(@aa1 BleSettingWatchPassword r1) {
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
    public /* bridge */ void onReadWechatPaySettings(@aa1 BleWechatPaySettings r1) {
        super.onReadWechatPaySettings(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout(@aa1 List<BleWorkout> r1) {
        super.onReadWorkout(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout2(@aa1 List<BleWorkout2> r1) {
        super.onReadWorkout2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout3(@aa1 List<BleWorkout3> r1) {
        super.onReadWorkout3(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout4(@aa1 List<BleWorkout4> r1) {
        super.onReadWorkout4(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorkout4Segmentation(@aa1 BleWorkout4Segmentation r1) {
        super.onReadWorkout4Segmentation(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadWorldClock(@aa1 List<BleWorldClock> r1) {
        super.onReadWorldClock(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRealTimeMeasurement(@aa1 BleRealTimeMeasurement r1) {
        super.onRealTimeMeasurement(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveCmTrace(@aa1 byte[] r1, boolean r2) {
        super.onReceiveCmTrace(r1, r2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveFilePacket(@aa1 BleReceiveFilePacket r1) {
        super.onReceiveFilePacket(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorMotion(@aa1 List<BleGSensorMotion> r2) {
        Intrinsics.X0O(r2, "gSensorMotions");
        if (this.mState == false) goto L9;
        this.mMotionData.add(r2);
        if (this.mMotionData.size() <= 60) goto L7;
        this.mMotionData.removeFirst();
    L7:
        updateMotion();
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveGSensorRaw(@aa1 List<BleGSensorRaw> r19) {
        Intrinsics.X0O(r19, "gSensorRaws");
        if (this.mState == false) goto L22;
        List<BleGSensorRaw> r3 = r19;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator<T> r5 = r3.iterator();
    L6:
        if (r5.hasNext() == false) goto L8;
        r2.add(Short.valueOf(((BleGSensorRaw) r5.next()).getMX()));
        goto L6
    L8:
        double r6 = CollectionsKt___CollectionsKt.O0i(r2);
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator<T> r7 = r3.iterator();
    L10:
        if (r7.hasNext() == false) goto L12;
        r4.add(Short.valueOf(((BleGSensorRaw) r7.next()).getMY()));
        goto L10
    L12:
        double r8 = CollectionsKt___CollectionsKt.O0i(r4);
        double r9 = Math.sqrt((r6 * r6) + (r8 * r8));
        i1O0OXO1O.OXO1.XOO0ii0("onReceiveGSensorRaw -> xAvg=" + r6 + ", yAvg=" + r8 + ", p=" + r9 + ", a=" + ((((double) 90) * r9) / ((double) 512)));
        final SimpleDateFormat r10 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        String r11 = oe5.IXO0OOi(CollectionsKt___CollectionsKt.XOiXXOO(r3, null, null, null, 0, null, new iXX0X(r10), 31, null), ", ", "", false, 4, null);
        File r12 = this.mGsensorFile;
        if (r12 == null) goto L15;
        iI0OiO.IO(r12, r11, null, 2, null);
    L15:
        this.mData.add(r19);
        if (this.mData.size() <= 60) goto L18;
        this.mData.removeFirst();
    L18:
        updateGsensor();
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveGSensorSHSY(@aa1 List<BleGSensorSHSY> r1) {
        super.onReceiveGSensorSHSY(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public void onReceiveHRRaw(@aa1 List<BleHRRaw> r21) {
        Intrinsics.X0O(r21, "hrRaws");
        if (this.mState == false) goto L8;
        final SimpleDateFormat r2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        String r1 = oe5.IXO0OOi(CollectionsKt___CollectionsKt.XOiXXOO(r21, null, null, null, 0, null, new i10XX0(r2), 31, null), ", ", "", false, 4, null);
        File r3 = this.mHrFile;
        if (r3 == null) goto L9;
        iI0OiO.IO(r3, r1, null, 2, null);
        return;
    L9:
        return;
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGga(@aa1 BleLocationGga r1) {
        super.onReceiveLocationGga(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveLocationGsv(@aa1 List<BleLocationGsv> r1) {
        super.onReceiveLocationGsv(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveMusicCommand(@aa1 MusicCommand r1) {
        super.onReceiveMusicCommand(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceivePpgSHSY(@aa1 List<BlePpgSHSY> r1) {
        super.onReceivePpgSHSY(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveRealtimeLog(@aa1 BleRealtimeLog r1) {
        super.onReceiveRealtimeLog(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReceiveRecordPacket(@aa1 BleRecordPacket r1) {
        super.onReceiveRecordPacket(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onRecordControlUpdate(@aa1 BleRecordControl r1) {
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
    public /* bridge */ void onRingVibrationSetUpdate(@aa1 BleRingVibrationSettings r1) {
        super.onRingVibrationSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSDCardInfoUpdate(@aa1 BleSDCardInfo r1) {
        super.onSDCardInfoUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTestUpdate(@aa1 BleSGTest r1) {
        super.onSGTestUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSGTtsUpdate(@aa1 BleSGTts r1) {
        super.onSGTtsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSOSSettingsUpdate(@aa1 BleSOSSettings r1) {
        super.onSOSSettingsUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onScreenBrightnessSetUpdate(int r1) {
        super.onScreenBrightnessSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSessionStateChange(boolean r1) {
        super.onSessionStateChange(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSleepNotifyUpdate(@aa1 BleSleepNotify r1) {
        super.onSleepNotifyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSosContactUpdate(@aa1 BleSosContact r1) {
        super.onSosContactUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSportEndNotifyUpdate(int r1) {
        super.onSportEndNotifyUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onStandbyWatchFaceSetUpdate(@aa1 BleStandbyWatchFaceSet r1) {
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
    public /* bridge */ void onStreamProgress(boolean r1, int r2, int r3, int r4, @aa1 BleKey r5) {
        super.onStreamProgress(r1, r2, r3, r4, r5);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onSyncData(int r1, @aa1 BleKey r2) {
        super.onSyncData(r1, r2);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onTimeUpdate() {
        super.onTimeUpdate();
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(@aa1 BleAICoachBeforePlanV2 r1) {
        super.onUpdateAICoachGenerateBeforeInfoV2(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAICoachLeaveDay(@aa1 BleLeaveDay r1) {
        super.onUpdateAICoachLeaveDay(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateAppSportState(@aa1 BleAppSportState r1) {
        super.onUpdateAppSportState(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateBAC(@aa1 BleBAC r1) {
        super.onUpdateBAC(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateBloodPressure(@aa1 BleBloodPressure r1) {
        super.onUpdateBloodPressure(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateHeartRate(@aa1 BleHeartRate r1) {
        super.onUpdateHeartRate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateTemperature(@aa1 BleTemperature r1) {
        super.onUpdateTemperature(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUpdateWatchFaceSwitch(boolean r1) {
        super.onUpdateWatchFaceSwitch(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onUserProfileUpdate(@aa1 BleUserProfile r1) {
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
    public /* bridge */ void onWatchFaceIndexUpdate(@aa1 BleWatchFaceIndex r1) {
        super.onWatchFaceIndexUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onWatchPasswordUpdate(@aa1 BleSettingWatchPassword r1) {
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
    public /* bridge */ void onXMLYBandSetUpdate(@aa1 BleXMLYBandSet r1) {
        super.onXMLYBandSetUpdate(r1);
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onXModem(byte r1) {
        super.onXModem(r1);
    }

    public final void toggle(@aa1 View r10) {
        Intrinsics.X0O(r10, "view");
        this.mState = !this.mState;
        Button r11 = getBtn();
        if (this.mState == false) goto L5;
        String r0 = "Pause";
    L6:
        r11.setText(r0);
        BaseBleConnector.sendBoolean$default(BleConnector.INSTANCE, BleKey.GSENSOR_OUTPUT, BleKeyFlag.UPDATE, this.mState, false, false, 24, null);
        if (this.mState == false) goto L10;
        BleInitializer r12 = BleInitializer.IO;
        r12.I0OX(0);
        r12.I00(0);
        SimpleDateFormat r13 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        sz0 r1 = sz0.OXO1;
        this.mGsensorFile = uz0.Ii0X0X(r1, this.mAppUser.getNickname() + "_GSensor_" + r13.format(new Date()) + ".csv");
        this.mHrFile = uz0.XXiIiX10(r1, this.mAppUser.getNickname() + "_HR_" + r13.format(new Date()) + ".csv");
        return;
    L10:
        return;
    L5:
        r0 = "Start";
        goto L6
    }

    @Override // com.szabh.smable3.component.BleHandleCallback
    public /* bridge */ void onReadStock(boolean r1) {
        super.onReadStock(r1);
    }
}
