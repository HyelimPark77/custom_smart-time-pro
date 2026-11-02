package com.sma.smartv3.p610ui.device.watchface;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXI011X11;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.X1XX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.az1;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.C12616d4;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.model.ResourcesIdInfoKt;
import com.sma.smartv3.p610ui.device.watchface.WatchFaceCustomActivity;
import com.sma.smartv3.p610ui.device.watchface.fragment.ControlElementFragment;
import com.sma.smartv3.p610ui.device.watchface.fragment.PointerElementFragment;
import com.sma.smartv3.p610ui.device.watchface.fragment.TimeElementFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.NoScollViewPager;
import com.sma.smartv3.view.dial.DialElementView;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWatchFaceCustomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,664:1\n255#2:665\n*S KotlinDebug\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity\n*L\n478#1:665\n*E\n"})
public final class WatchFaceCustomActivity extends BaseActivity {
    private ControlElementFragment controlElementFragment;

    @aa1
    private final String is2DAcceleration;

    @tb1
    private String mAiBgFile;

    @aa1
    private final List<String> mBgFiles;

    @aa1
    private final IiI10X mBleHandleCallback;

    @aa1
    private final Lazy mCrop$delegate;
    private byte[] mCurSendBytes;
    private int mCurSyncDevicePosition;
    private int mCurSyncDialId;
    private X1XX1O mCustomWatchFace;

    @aa1
    private final List<Integer> mDialIds;
    private BaseFragmentPagerAdapter mFragmentPagerAdapter;

    @tb1
    private c72 mProgressPop;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final String paramName;
    private PointerElementFragment pointerElementFragment;
    private CommonAdapter<String> rvBgAdapter;
    private int selectedIndex;
    private TimeElementFragment timeElementFragment;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.on6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.abhTitleCenter_delegate$lambda$0(this.f10181IO);
        }
    });
    private final float WATCHFACEVIEW_HEIGHT = 260.0f;

    @aa1
    private final Lazy watchfaceView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.watchfaceView_delegate$lambda$0(this.f12644IO);
        }
    });

    @aa1
    private final Lazy customizeDialBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.an6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.customizeDialBg_delegate$lambda$0(this.f5525IO);
        }
    });

    @aa1
    private final Lazy controlViewStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.controlViewStep_delegate$lambda$0(this.f5767IO);
        }
    });

    @aa1
    private final Lazy controlViewHr$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.controlViewHr_delegate$lambda$0(this.f6012IO);
        }
    });

    @aa1
    private final Lazy controlViewCa$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.controlViewCa_delegate$lambda$0(this.f6227IO);
        }
    });

    @aa1
    private final Lazy controlViewDis$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.en6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.controlViewDis_delegate$lambda$0(this.f6452IO);
        }
    });

    @aa1
    private final Lazy timeDigitalView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.timeDigitalView_delegate$lambda$0(this.f6686IO);
        }
    });

    @aa1
    private final Lazy timePointView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.timePointView_delegate$lambda$0(this.f7163IO);
        }
    });

    @aa1
    private final Lazy timeScaleView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.in6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.timeScaleView_delegate$lambda$0(this.f8724IO);
        }
    });

    @aa1
    private final Lazy tvBgTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.tvBgTitle_delegate$lambda$0(this.f10405IO);
        }
    });

    @aa1
    private final Lazy addBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.addBg_delegate$lambda$0(this.f10642IO);
        }
    });

    @aa1
    private final Lazy rvBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.rvBg_delegate$lambda$0(this.f10852IO);
        }
    });

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.table_delegate$lambda$0(this.f11993IO);
        }
    });

    @aa1
    private final Lazy mViewPager$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceCustomActivity.mViewPager_delegate$lambda$0(this.f12200IO);
        }
    });

    @SourceDebugExtension({"SMAP\nWatchFaceCustomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n1869#2,2:665\n*S KotlinDebug\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$mBleHandleCallback$1\n*L\n231#1:665,2\n*E\n"})
    public static final class IiI10X implements BleHandleCallback {
        public IiI10X() {
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
        public /* bridge */ void onCommandReply(BleKey bleKey, BleKeyFlag bleKeyFlag, boolean z) {
            super.onCommandReply(bleKey, bleKeyFlag, z);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
            Intrinsics.X0O(bleKey, "bleKey");
            Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
            if (bleKey == BleKey.WATCH_FACE) {
                WatchFaceCustomActivity.syncFailed$default(WatchFaceCustomActivity.this, 0, 1, null);
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
        public /* bridge */ void onDeviceConnected(BluetoothDevice bluetoothDevice) {
            super.onDeviceConnected(bluetoothDevice);
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
        public /* bridge */ void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings bleDeviceUniqueDataSettings) {
            super.onReadDeviceUniqueDataSettings(bleDeviceUniqueDataSettings);
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
        public void onReadWatchFaceId(BleWatchFaceId watchFaceId) {
            Intrinsics.X0O(watchFaceId, "watchFaceId");
            WatchFaceCustomActivity.this.mDialIds.clear();
            List<Integer> mIdList = watchFaceId.getMIdList();
            WatchFaceCustomActivity watchFaceCustomActivity = WatchFaceCustomActivity.this;
            Iterator<T> it = mIdList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue <= 0) {
                    watchFaceCustomActivity.mDialIds.add(0);
                } else {
                    watchFaceCustomActivity.mDialIds.add(Integer.valueOf(iIntValue));
                }
            }
            LogUtils.m11128d("mDialIds -> " + WatchFaceCustomActivity.this.mDialIds);
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
            if (z || WatchFaceCustomActivity.this.mProgressPop == null) {
                return;
            }
            WatchFaceCustomActivity.syncFailed$default(WatchFaceCustomActivity.this, 0, 1, null);
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
        public void onStreamProgress(boolean z, int i, int i2, int i3, BleKey bleKey) {
            Intrinsics.X0O(bleKey, "bleKey");
            if (!z) {
                WatchFaceCustomActivity.this.syncFailed(i);
                return;
            }
            c72 c72Var = WatchFaceCustomActivity.this.mProgressPop;
            if (c72Var != null) {
                c72Var.m1592OX((int) ((i3 / i2) * 100));
            }
            if (i2 == i3) {
                c72 c72Var2 = WatchFaceCustomActivity.this.mProgressPop;
                if (c72Var2 != null) {
                    c72Var2.dismiss();
                }
                WatchFaceCustomActivity.this.mProgressPop = null;
                ToastUtils.showLong(R.string.dial_sync_done);
                WatchFaceCustomActivity.this.mDialIds.set(WatchFaceCustomActivity.this.mCurSyncDevicePosition, Integer.valueOf(WatchFaceCustomActivity.this.mCurSyncDialId));
                a01.OXO1.XIi00iiXO().put("syncId", 0);
                WatchFaceCustomActivity.this.saveRecord();
            }
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
        public void onWatchFaceIdUpdate(boolean z) {
            WatchFaceCustomActivity.this.syncWatchFace();
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

    public static final class O00 extends X1XX1O {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O00(Application application) {
            super(application);
            Intrinsics.XXI(application);
        }

        @Override // com.android.mltcode.paycertificationapi.X1XX1O
        public void IOi1O0() {
            View viewFindViewById = WatchFaceCustomActivity.this.findViewById(R.id.root_view);
            Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
            XOOXII(viewFindViewById);
            View viewFindViewById2 = Ii0i().findViewById(R.id.customizeDialBg);
            Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
            i1O11001((ImageView) viewFindViewById2);
            View viewFindViewById3 = Ii0i().findViewById(R.id.controlViewStep);
            Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
            iIIIiIO0((ViewGroup) viewFindViewById3);
            View viewFindViewById4 = Ii0i().findViewById(R.id.controlViewHr);
            Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
            IiXIIX1O1((ViewGroup) viewFindViewById4);
            View viewFindViewById5 = Ii0i().findViewById(R.id.controlViewCa);
            Intrinsics.O10IXXX0X(viewFindViewById5, "findViewById(...)");
            I0iOXO((ViewGroup) viewFindViewById5);
            View viewFindViewById6 = Ii0i().findViewById(R.id.controlViewDis);
            Intrinsics.O10IXXX0X(viewFindViewById6, "findViewById(...)");
            XOXOIX0Oi((ViewGroup) viewFindViewById6);
            View viewFindViewById7 = Ii0i().findViewById(R.id.timeDigitalView);
            Intrinsics.O10IXXX0X(viewFindViewById7, "findViewById(...)");
            IOI((ViewGroup) viewFindViewById7);
            View viewFindViewById8 = Ii0i().findViewById(R.id.timePointView);
            Intrinsics.O10IXXX0X(viewFindViewById8, "findViewById(...)");
            OiO0IOX((ImageView) viewFindViewById8);
            View viewFindViewById9 = Ii0i().findViewById(R.id.timeScaleView);
            Intrinsics.O10IXXX0X(viewFindViewById9, "findViewById(...)");
            i0101i((ImageView) viewFindViewById9);
        }
    }

    public static final class OXO1 implements az1<Integer> {
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ List<ResourcesIdInfo> f54606iO;

        public OXO1(List<ResourcesIdInfo> list, List<ResourcesIdInfo> list2) {
            this.XIi00iiXO = list;
            this.f54606iO = list2;
        }

        @Override // com.android.mltcode.paycertificationapi.az1
        public /* bridge */ /* synthetic */ void OXO1(Integer num, boolean z) {
            m38478iO(num.intValue(), z);
        }

        @Override // com.android.mltcode.paycertificationapi.az1
        public /* bridge */ /* synthetic */ void XIi00iiXO(Integer num, boolean z) {
            XO0O10(num.intValue(), z);
        }

        public void XO0O10(int i, boolean z) {
            WatchFaceCustomActivity.this.getTimeDigitalView().setVisibility(8);
            WatchFaceCustomActivity.this.getTimeScaleView().setImageResource(this.f54606iO.get(i).getResId());
            X1XX1O x1xx1o = WatchFaceCustomActivity.this.mCustomWatchFace;
            TimeElementFragment timeElementFragment = null;
            if (x1xx1o == null) {
                Intrinsics.XXO("mCustomWatchFace");
                x1xx1o = null;
            }
            x1xx1o.iIXX0i(i);
            WatchFaceCustomActivity.this.getTimeScaleView().setVisibility(z ? 0 : 8);
            TimeElementFragment timeElementFragment2 = WatchFaceCustomActivity.this.timeElementFragment;
            if (timeElementFragment2 == null) {
                Intrinsics.XXO("timeElementFragment");
            } else {
                timeElementFragment = timeElementFragment2;
            }
            timeElementFragment.reset();
        }

        /* JADX INFO: renamed from: iO */
        public void m38478iO(int i, boolean z) {
            WatchFaceCustomActivity.this.getTimeDigitalView().setVisibility(8);
            WatchFaceCustomActivity.this.getTimePointView().setImageResource(this.XIi00iiXO.get(i).getResId());
            X1XX1O x1xx1o = WatchFaceCustomActivity.this.mCustomWatchFace;
            TimeElementFragment timeElementFragment = null;
            if (x1xx1o == null) {
                Intrinsics.XXO("mCustomWatchFace");
                x1xx1o = null;
            }
            x1xx1o.OIIOI(i);
            WatchFaceCustomActivity.this.getTimePointView().setVisibility(z ? 0 : 8);
            TimeElementFragment timeElementFragment2 = WatchFaceCustomActivity.this.timeElementFragment;
            if (timeElementFragment2 == null) {
                Intrinsics.XXO("timeElementFragment");
            } else {
                timeElementFragment = timeElementFragment2;
            }
            timeElementFragment.reset();
        }
    }

    public static final class XIi00iiXO implements IXI011X11<Integer> {
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        public XIi00iiXO(List<ResourcesIdInfo> list) {
            this.XIi00iiXO = list;
        }

        @Override // com.android.mltcode.paycertificationapi.IXI011X11
        public /* bridge */ /* synthetic */ void OXO1(Integer num, boolean z) {
            XIi00iiXO(num.intValue(), z);
        }

        public void XIi00iiXO(int i, boolean z) {
            WatchFaceCustomActivity.this.getTimeDigitalView().setVisibility(z ? 0 : 8);
            WatchFaceCustomActivity.this.getTimePointView().setVisibility(8);
            WatchFaceCustomActivity.this.getTimeScaleView().setVisibility(8);
            WatchFaceCustomActivity.this.getTimeDigitalView().setImageRes(this.XIi00iiXO.get(i).getResId());
            X1XX1O x1xx1o = WatchFaceCustomActivity.this.mCustomWatchFace;
            if (x1xx1o == null) {
                Intrinsics.XXO("mCustomWatchFace");
                x1xx1o = null;
            }
            x1xx1o.OI1IiOO1i(i);
        }
    }

    public static final class XO0O10 implements jl1 {
        public XO0O10() {
        }

        @Override // com.android.mltcode.paycertificationapi.jl1
        public List<Fragment> initFragments() {
            PointerElementFragment pointerElementFragment = WatchFaceCustomActivity.this.pointerElementFragment;
            ControlElementFragment controlElementFragment = null;
            if (pointerElementFragment == null) {
                Intrinsics.XXO("pointerElementFragment");
                pointerElementFragment = null;
            }
            TimeElementFragment timeElementFragment = WatchFaceCustomActivity.this.timeElementFragment;
            if (timeElementFragment == null) {
                Intrinsics.XXO("timeElementFragment");
                timeElementFragment = null;
            }
            ControlElementFragment controlElementFragment2 = WatchFaceCustomActivity.this.controlElementFragment;
            if (controlElementFragment2 == null) {
                Intrinsics.XXO("controlElementFragment");
            } else {
                controlElementFragment = controlElementFragment2;
            }
            return CollectionsKt__CollectionsKt.iXiX011(pointerElementFragment, timeElementFragment, controlElementFragment);
        }

        @Override // com.android.mltcode.paycertificationapi.jl1
        public FragmentManager provideFragmentManager() {
            FragmentManager supportFragmentManager = WatchFaceCustomActivity.this.getSupportFragmentManager();
            Intrinsics.O10IXXX0X(supportFragmentManager, "getSupportFragmentManager(...)");
            return supportFragmentManager;
        }
    }

    public static final class XOO0ii0 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;

        public XOO0ii0() {
            sz0 sz0Var = sz0.OXO1;
            this.OXO1 = sz0Var.XO0O10(uz0.II1Xi0(sz0Var));
            Uri uriFromFile = Uri.fromFile(uz0.XiOIii1(sz0Var));
            Intrinsics.O10IXXX0X(uriFromFile, "fromFile(...)");
            this.XIi00iiXO = uriFromFile;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri OXO1() {
            return this.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public void XIi00iiXO(Uri uri) {
            Intrinsics.X0O(uri, "uri");
            LogUtils.m11128d("onCropped => " + uri);
            xz3 xz3Var = WatchFaceCustomActivity.this.mSelectAvatarPopup;
            if (xz3Var != null) {
                xz3Var.dismiss();
            }
            sz0 sz0Var = sz0.OXO1;
            if (uz0.XiOIii1(sz0Var).exists()) {
                File file = new File(uz0.i11I(sz0Var), O0X11OiO.X11I().format(new Date()) + ".png");
                Bitmap bitmap = ImageUtils.getBitmap(uz0.XiOIii1(sz0Var));
                WatchFaceCustomActivity watchFaceCustomActivity = WatchFaceCustomActivity.this;
                Intrinsics.XXI(bitmap);
                ImageUtils.save(watchFaceCustomActivity.toRound(bitmap), file, Bitmap.CompressFormat.PNG);
                List list = WatchFaceCustomActivity.this.mBgFiles;
                String path = file.getPath();
                Intrinsics.O10IXXX0X(path, "getPath(...)");
                list.add(path);
                WatchFaceCustomActivity.showRvBg$default(WatchFaceCustomActivity.this, 0, 1, null);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.WatchFaceCustomActivity$iO */
    public static final class C18827iO implements IXI011X11<Integer> {
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        public C18827iO(List<ResourcesIdInfo> list) {
            this.XIi00iiXO = list;
        }

        @Override // com.android.mltcode.paycertificationapi.IXI011X11
        public /* bridge */ /* synthetic */ void OXO1(Integer num, boolean z) {
            XIi00iiXO(num.intValue(), z);
        }

        public void XIi00iiXO(int i, boolean z) {
            WatchFaceCustomActivity.this.getControlViewStep().setTextColor(this.XIi00iiXO.get(i).getSecondaryId());
            WatchFaceCustomActivity.this.getControlViewHr().setTextColor(this.XIi00iiXO.get(i).getSecondaryId());
            WatchFaceCustomActivity.this.getControlViewCa().setTextColor(this.XIi00iiXO.get(i).getSecondaryId());
            WatchFaceCustomActivity.this.getControlViewDis().setTextColor(this.XIi00iiXO.get(i).getSecondaryId());
            X1XX1O x1xx1o = WatchFaceCustomActivity.this.mCustomWatchFace;
            if (x1xx1o == null) {
                Intrinsics.XXO("mCustomWatchFace");
                x1xx1o = null;
            }
            x1xx1o.I0OX(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.WatchFaceCustomActivity$initBgView$2 */
    public static final class C188282 extends CommonAdapter<String> {
        public C188282(int i, List<String> list) {
            super(WatchFaceCustomActivity.this, i, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$1(WatchFaceCustomActivity watchFaceCustomActivity, int i, View view) {
            watchFaceCustomActivity.mBgFiles.remove(i);
            WatchFaceCustomActivity.showRvBg$default(watchFaceCustomActivity, 0, 1, null);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, String path, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(path, "path");
            ImageViewRound imageViewRound = (ImageViewRound) holder.getView(R.id.f51417iv);
            if (imageViewRound != null) {
                final WatchFaceCustomActivity watchFaceCustomActivity = WatchFaceCustomActivity.this;
                if (FileUtils.isFileExists(path)) {
                    imageViewRound.setImageURI(Uri.fromFile(new File(path)));
                }
                imageViewRound.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.sn6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WatchFaceCustomActivity.access$showRvBg(watchFaceCustomActivity, i);
                    }
                });
                imageViewRound.showSelected(watchFaceCustomActivity.selectedIndex == i);
            }
            ImageView imageView = (ImageView) holder.getView(R.id.iv_status);
            final WatchFaceCustomActivity watchFaceCustomActivity2 = WatchFaceCustomActivity.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.tn6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WatchFaceCustomActivity.C188282.convert$lambda$1(watchFaceCustomActivity2, i, view);
                }
            });
        }
    }

    public WatchFaceCustomActivity() {
        this.is2DAcceleration = q62.OXO1.iIi011O() ? "/2d/" : "/default/";
        this.paramName = BleCache.INSTANCE.getMPrototype() + "/";
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(0);
        this.mBgFiles = new ArrayList();
        this.mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ym6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WatchFaceCustomActivity.mCrop_delegate$lambda$0(this.f12400IO);
            }
        });
        this.mBleHandleCallback = new IiI10X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (PFMedium) watchFaceCustomActivity.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ void access$showRvBg(WatchFaceCustomActivity watchFaceCustomActivity, int i) {
        watchFaceCustomActivity.showRvBg(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup addBg_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (ViewGroup) watchFaceCustomActivity.findViewById(R.id.add_bg);
    }

    private final void adjustWatchfaceViewWidth() {
        float fXXI0XOIX;
        X1XX1O x1xx1o = this.mCustomWatchFace;
        X1XX1O x1xx1o2 = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        float fX00O0 = x1xx1o.X00O0();
        X1XX1O x1xx1o3 = this.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o3 = null;
        }
        float fXi1i0XOX0 = this.WATCHFACEVIEW_HEIGHT * (fX00O0 / x1xx1o3.Xi1i0XOX0());
        CardView watchfaceView = getWatchfaceView();
        Intrinsics.O10IXXX0X(watchfaceView, "<get-watchfaceView>(...)");
        LibExKt.i100IXOX(watchfaceView, SizeUtils.dp2px(fXi1i0XOX0), SizeUtils.dp2px(this.WATCHFACEVIEW_HEIGHT));
        ImageViewRound customizeDialBg = getCustomizeDialBg();
        X1XX1O x1xx1o4 = this.mCustomWatchFace;
        if (x1xx1o4 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o4 = null;
        }
        customizeDialBg.setRadius(SizeUtils.dp2px(x1xx1o4.XXI0XOIX()));
        ImageViewRound customizeDialBg2 = getCustomizeDialBg();
        X1XX1O x1xx1o5 = this.mCustomWatchFace;
        if (x1xx1o5 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o5 = null;
        }
        customizeDialBg2.setType(!x1xx1o5.m1173O1() ? 1 : 0);
        CardView watchfaceView2 = getWatchfaceView();
        X1XX1O x1xx1o6 = this.mCustomWatchFace;
        if (x1xx1o6 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o6 = null;
        }
        if (x1xx1o6.m1173O1()) {
            fXXI0XOIX = 200.0f;
        } else {
            X1XX1O x1xx1o7 = this.mCustomWatchFace;
            if (x1xx1o7 == null) {
                Intrinsics.XXO("mCustomWatchFace");
            } else {
                x1xx1o2 = x1xx1o7;
            }
            fXXI0XOIX = x1xx1o2.XXI0XOIX();
        }
        watchfaceView2.setRadius(SizeUtils.dp2px(fXXI0XOIX));
    }

    private final void controlChangeStatus(View view, ImageView imageView) {
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            imageView.setImageResource(R.drawable.ic_watchface_element_add);
        } else {
            view.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_watchface_element_del);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewCa_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (DialElementView) watchFaceCustomActivity.findViewById(R.id.controlViewCa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewDis_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (DialElementView) watchFaceCustomActivity.findViewById(R.id.controlViewDis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewHr_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (DialElementView) watchFaceCustomActivity.findViewById(R.id.controlViewHr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewStep_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (DialElementView) watchFaceCustomActivity.findViewById(R.id.controlViewStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound customizeDialBg_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (ImageViewRound) watchFaceCustomActivity.findViewById(R.id.customizeDialBg);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final ViewGroup getAddBg() {
        return (ViewGroup) this.addBg$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialElementView getControlViewCa() {
        return (DialElementView) this.controlViewCa$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialElementView getControlViewDis() {
        return (DialElementView) this.controlViewDis$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialElementView getControlViewHr() {
        return (DialElementView) this.controlViewHr$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialElementView getControlViewStep() {
        return (DialElementView) this.controlViewStep$delegate.getValue();
    }

    private final ImageViewRound getCustomizeDialBg() {
        return (ImageViewRound) this.customizeDialBg$delegate.getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    private final NoScollViewPager getMViewPager() {
        return (NoScollViewPager) this.mViewPager$delegate.getValue();
    }

    private final RecyclerView getRvBg() {
        return (RecyclerView) this.rvBg$delegate.getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialElementView getTimeDigitalView() {
        return (DialElementView) this.timeDigitalView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getTimePointView() {
        return (ImageView) this.timePointView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getTimeScaleView() {
        return (ImageView) this.timeScaleView$delegate.getValue();
    }

    private final TextView getTvBgTitle() {
        return (TextView) this.tvBgTitle$delegate.getValue();
    }

    private final CardView getWatchfaceView() {
        return (CardView) this.watchfaceView$delegate.getValue();
    }

    private final void initBgView() {
        RecyclerView rvBg = getRvBg();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        rvBg.setLayoutManager(linearLayoutManager);
        X1XX1O x1xx1o = this.mCustomWatchFace;
        CommonAdapter<String> commonAdapter = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        this.rvBgAdapter = new C188282(x1xx1o.m1173O1() ? R.layout.item_watchface_bg : R.layout.item_watchface_bg_r, this.mBgFiles);
        RecyclerView rvBg2 = getRvBg();
        CommonAdapter<String> commonAdapter2 = this.rvBgAdapter;
        if (commonAdapter2 == null) {
            Intrinsics.XXO("rvBgAdapter");
        } else {
            commonAdapter = commonAdapter2;
        }
        rvBg2.setAdapter(commonAdapter);
    }

    private final void initElementView() {
        BleCache bleCache = BleCache.INSTANCE;
        BleDeviceInfo mDeviceInfo = bleCache.getMDeviceInfo();
        Intrinsics.XXI(mDeviceInfo);
        List<ResourcesIdInfo> watchFaceElementPointers = ResourcesIdInfoKt.getWatchFaceElementPointers(mDeviceInfo);
        BleDeviceInfo mDeviceInfo2 = bleCache.getMDeviceInfo();
        Intrinsics.XXI(mDeviceInfo2);
        X1XX1O x1xx1o = this.mCustomWatchFace;
        X1XX1O x1xx1o2 = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        List<ResourcesIdInfo> watchFaceElementScales = ResourcesIdInfoKt.getWatchFaceElementScales(mDeviceInfo2, x1xx1o.m1173O1());
        List<ResourcesIdInfo> watchFaceElementColors = ResourcesIdInfoKt.getWatchFaceElementColors(this);
        List<ResourcesIdInfo> watchFaceElementDigitalTimes = ResourcesIdInfoKt.getWatchFaceElementDigitalTimes();
        X1XX1O x1xx1o3 = this.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o3 = null;
        }
        this.pointerElementFragment = new PointerElementFragment(watchFaceElementPointers, watchFaceElementScales, x1xx1o3.m1173O1(), new OXO1(watchFaceElementPointers, watchFaceElementScales));
        X1XX1O x1xx1o4 = this.mCustomWatchFace;
        if (x1xx1o4 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o4 = null;
        }
        final TimeElementFragment timeElementFragment = new TimeElementFragment(watchFaceElementColors, x1xx1o4.m1173O1(), new XIi00iiXO(watchFaceElementDigitalTimes));
        timeElementFragment.setOnViewClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.gn6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceCustomActivity.initElementView$lambda$0$0(timeElementFragment, this, view);
            }
        });
        this.timeElementFragment = timeElementFragment;
        X1XX1O x1xx1o5 = this.mCustomWatchFace;
        if (x1xx1o5 == null) {
            Intrinsics.XXO("mCustomWatchFace");
        } else {
            x1xx1o2 = x1xx1o5;
        }
        final ControlElementFragment controlElementFragment = new ControlElementFragment(watchFaceElementColors, x1xx1o2.m1173O1(), new C18827iO(watchFaceElementColors));
        controlElementFragment.setOnViewClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.kn6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceCustomActivity.initElementView$lambda$1$0(this.f9240IO, controlElementFragment, view);
            }
        });
        this.controlElementFragment = controlElementFragment;
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = new BaseFragmentPagerAdapter(new XO0O10());
        String str = getString(R.string.pointer) + C12616d4.j.f34438c + getString(R.string.scale);
        String string = getString(R.string.time);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.control);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        baseFragmentPagerAdapter.setTitles(new String[]{str, string, string2});
        getMViewPager().setAdapter(baseFragmentPagerAdapter);
        getMViewPager().setOffscreenPageLimit(baseFragmentPagerAdapter.getCount());
        this.mFragmentPagerAdapter = baseFragmentPagerAdapter;
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().setCanScoll(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initElementView$lambda$0$0(TimeElementFragment timeElementFragment, WatchFaceCustomActivity watchFaceCustomActivity, View view) {
        if (view.getId() == R.id.dialSelect0) {
            ImageView dialSelectStatus0 = timeElementFragment.getDialSelectStatus0();
            dialSelectStatus0.setVisibility(dialSelectStatus0.getVisibility() == 8 ? 0 : 8);
            watchFaceCustomActivity.getTimeDigitalView().setVisibility(timeElementFragment.getDialSelectStatus0().getVisibility());
            watchFaceCustomActivity.getTimePointView().setVisibility(8);
            watchFaceCustomActivity.getTimeScaleView().setVisibility(8);
            PointerElementFragment pointerElementFragment = watchFaceCustomActivity.pointerElementFragment;
            if (pointerElementFragment == null) {
                Intrinsics.XXO("pointerElementFragment");
                pointerElementFragment = null;
            }
            pointerElementFragment.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initElementView$lambda$1$0(WatchFaceCustomActivity watchFaceCustomActivity, ControlElementFragment controlElementFragment, View view) {
        switch (view.getId()) {
            case R.id.dialSelect0 /* 2131362552 */:
                DialElementView controlViewStep = watchFaceCustomActivity.getControlViewStep();
                Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
                ImageView dialSelectStatus0 = controlElementFragment.getDialSelectStatus0();
                Intrinsics.O10IXXX0X(dialSelectStatus0, "<get-dialSelectStatus0>(...)");
                watchFaceCustomActivity.controlChangeStatus(controlViewStep, dialSelectStatus0);
                break;
            case R.id.dialSelect1 /* 2131362553 */:
                DialElementView controlViewHr = watchFaceCustomActivity.getControlViewHr();
                Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
                ImageView dialSelectStatus1 = controlElementFragment.getDialSelectStatus1();
                Intrinsics.O10IXXX0X(dialSelectStatus1, "<get-dialSelectStatus1>(...)");
                watchFaceCustomActivity.controlChangeStatus(controlViewHr, dialSelectStatus1);
                break;
            case R.id.dialSelect2 /* 2131362554 */:
                DialElementView controlViewCa = watchFaceCustomActivity.getControlViewCa();
                Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
                ImageView dialSelectStatus2 = controlElementFragment.getDialSelectStatus2();
                Intrinsics.O10IXXX0X(dialSelectStatus2, "<get-dialSelectStatus2>(...)");
                watchFaceCustomActivity.controlChangeStatus(controlViewCa, dialSelectStatus2);
                break;
            case R.id.dialSelect3 /* 2131362555 */:
                DialElementView controlViewDis = watchFaceCustomActivity.getControlViewDis();
                Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
                ImageView dialSelectStatus3 = controlElementFragment.getDialSelectStatus3();
                Intrinsics.O10IXXX0X(dialSelectStatus3, "<get-dialSelectStatus3>(...)");
                watchFaceCustomActivity.controlChangeStatus(controlViewDis, dialSelectStatus3);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity, Uri it) throws IOException {
        Intrinsics.X0O(it, "it");
        watchFaceCustomActivity.toCropPic(it);
        return Unit.OXO1;
    }

    private final void initWatchfaceView() {
        this.mCustomWatchFace = new O00(Utils.getApp());
        DialElementView controlViewStep = getControlViewStep();
        X1XX1O x1xx1o = this.mCustomWatchFace;
        X1XX1O x1xx1o2 = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        controlViewStep.setIsRangeCircle(x1xx1o.m1173O1());
        DialElementView controlViewHr = getControlViewHr();
        X1XX1O x1xx1o3 = this.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o3 = null;
        }
        controlViewHr.setIsRangeCircle(x1xx1o3.m1173O1());
        DialElementView controlViewCa = getControlViewCa();
        X1XX1O x1xx1o4 = this.mCustomWatchFace;
        if (x1xx1o4 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o4 = null;
        }
        controlViewCa.setIsRangeCircle(x1xx1o4.m1173O1());
        DialElementView controlViewDis = getControlViewDis();
        X1XX1O x1xx1o5 = this.mCustomWatchFace;
        if (x1xx1o5 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o5 = null;
        }
        controlViewDis.setIsRangeCircle(x1xx1o5.m1173O1());
        DialElementView timeDigitalView = getTimeDigitalView();
        X1XX1O x1xx1o6 = this.mCustomWatchFace;
        if (x1xx1o6 == null) {
            Intrinsics.XXO("mCustomWatchFace");
        } else {
            x1xx1o2 = x1xx1o6;
        }
        timeDigitalView.setIsRangeCircle(x1xx1o2.m1173O1());
        adjustWatchfaceViewWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return new i1Ii1i11X(watchFaceCustomActivity.getMContext(), watchFaceCustomActivity.new XOO0ii0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoScollViewPager mViewPager_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (NoScollViewPager) watchFaceCustomActivity.findViewById(R.id.view_pager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvBg_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (RecyclerView) watchFaceCustomActivity.findViewById(R.id.rv_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveRecord() {
        String str;
        String str2 = BleCache.INSTANCE.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + IiXI1X1OO.O00 + System.currentTimeMillis();
        if (TextUtils.isEmpty(this.mAiBgFile)) {
            str = this.paramName + this.is2DAcceleration + str2;
        } else {
            str = this.paramName + "/AI/" + str2;
        }
        sz0 sz0Var = sz0.OXO1;
        File file = new File(uz0.XXX11i(sz0Var), str + ".png");
        X1XX1O x1xx1o = this.mCustomWatchFace;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        FileIOUtils.writeFileFromBytesByStream(file, x1xx1o.IXiOXO());
        File file2 = new File(uz0.XXX11i(sz0Var), str);
        byte[] bArr = this.mCurSendBytes;
        if (bArr == null) {
            Intrinsics.XXO("mCurSendBytes");
            bArr = null;
        }
        FileIOUtils.writeFileFromBytesByStream(file2, bArr);
        I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
    }

    private final void selectImagePopup() {
        if (this.mSelectAvatarPopup == null) {
            final xz3 xz3Var = new xz3(this);
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.mn6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return WatchFaceCustomActivity.selectImagePopup$lambda$0$0(xz3Var, this);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.nn6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return WatchFaceCustomActivity.selectImagePopup$lambda$0$1(this.f9976IO);
                }
            });
            this.mSelectAvatarPopup = xz3Var;
        }
        xz3 xz3Var2 = this.mSelectAvatarPopup;
        if (xz3Var2 != null) {
            xz3Var2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$0(xz3 xz3Var, final WatchFaceCustomActivity watchFaceCustomActivity) {
        hr1.OXO1.iOOX010X(xz3Var.XO0O10(), new Function1() { // from class: com.android.mltcode.paycertificationapi.vm6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceCustomActivity.selectImagePopup$lambda$0$0$0(this.f11763IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$0$0(WatchFaceCustomActivity watchFaceCustomActivity, boolean z) {
        if (z) {
            watchFaceCustomActivity.getMCrop().m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$1(WatchFaceCustomActivity watchFaceCustomActivity) {
        watchFaceCustomActivity.getMCrop().OIX0iXi();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRvBg(int i) {
        this.selectedIndex = i;
        X1XX1O x1xx1o = this.mCustomWatchFace;
        CommonAdapter<String> commonAdapter = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        Bitmap bitmap = (this.mBgFiles.isEmpty() || i >= this.mBgFiles.size()) ? ImageUtils.getBitmap(R.drawable.pic_custom_bg_def) : ImageUtils.getBitmap(this.mBgFiles.get(i));
        Intrinsics.XXI(bitmap);
        x1xx1o.I00(bitmap);
        TextView tvBgTitle = getTvBgTitle();
        String string = getString(R.string.image);
        int size = this.mBgFiles.size();
        q62 q62Var = q62.OXO1;
        tvBgTitle.setText(string + I000IiI1O.C2156iO.XIi00iiXO + size + "/" + q62Var.XOIX() + I000IiI1O.C2156iO.f1007iO);
        getAddBg().setEnabled(this.mBgFiles.size() < q62Var.XOIX());
        ViewGroup addBg = getAddBg();
        X1XX1O x1xx1o2 = this.mCustomWatchFace;
        if (x1xx1o2 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o2 = null;
        }
        addBg.setBackgroundResource(x1xx1o2.m1173O1() ? R.drawable.shape_custom_dial_add_bg : R.drawable.shape_custom_dial_add_bg_r);
        CommonAdapter<String> commonAdapter2 = this.rvBgAdapter;
        if (commonAdapter2 == null) {
            Intrinsics.XXO("rvBgAdapter");
        } else {
            commonAdapter = commonAdapter2;
        }
        commonAdapter.notifyDataSetChanged();
    }

    public static /* synthetic */ void showRvBg$default(WatchFaceCustomActivity watchFaceCustomActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        watchFaceCustomActivity.showRvBg(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncFailed(int i) {
        c72 c72Var = this.mProgressPop;
        if (c72Var != null) {
            c72Var.dismiss();
        }
        this.mProgressPop = null;
        ToastUtils.showLong(OOX00.OXO1.m920iO(i), new Object[0]);
    }

    public static /* synthetic */ void syncFailed$default(WatchFaceCustomActivity watchFaceCustomActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        watchFaceCustomActivity.syncFailed(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWatchFace() {
        if (this.mProgressPop == null) {
            c72 c72Var = new c72(this, 0, 2, null);
            c72Var.m1591I1(R.string.dial_generated_start);
            c72Var.m1592OX(0);
            this.mProgressPop = c72Var;
            c72Var.IIX1OXO();
            c72 c72Var2 = this.mProgressPop;
            if (c72Var2 != null) {
                c72Var2.m1591I1(R.string.dial_generated_sync);
            }
            new Thread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.jn6
                @Override // java.lang.Runnable
                public final void run() {
                    WatchFaceCustomActivity.syncWatchFace$lambda$1(this.f9013IO);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncWatchFace$lambda$1(WatchFaceCustomActivity watchFaceCustomActivity) {
        X1XX1O x1xx1o = watchFaceCustomActivity.mCustomWatchFace;
        X1XX1O x1xx1o2 = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        x1xx1o.Oiii(watchFaceCustomActivity.mBgFiles.size() > 1 ? watchFaceCustomActivity.mBgFiles : CollectionsKt__CollectionsKt.m39402iI());
        X1XX1O x1xx1o3 = watchFaceCustomActivity.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
        } else {
            x1xx1o2 = x1xx1o3;
        }
        byte[] bArrM1171IO = x1xx1o2.m1171IO();
        watchFaceCustomActivity.mCurSendBytes = bArrM1171IO;
        sz0 sz0Var = sz0.OXO1;
        File fileI010I = uz0.i010I(sz0Var);
        File fileX11iII1O1 = uz0.X11iII1O1(sz0Var);
        BleCache bleCache = BleCache.INSTANCE;
        FileUtils.copy(fileI010I, new File(fileX11iII1O1, bleCache.getMPrototype() + IiXI1X1OO.O00 + bleCache.getMBleName() + IiXI1X1OO.O00 + watchFaceCustomActivity.mCurSyncDialId + ".png"));
        int i = watchFaceCustomActivity.mCurSyncDevicePosition;
        int length = bArrM1171IO.length;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" Custom WatchFace bytes size  ");
        sb.append(length);
        LogUtils.m11128d(sb.toString());
        BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, bArrM1171IO, watchFaceCustomActivity.mCurSyncDevicePosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (TabLayout) watchFaceCustomActivity.findViewById(R.id.table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView timeDigitalView_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (DialElementView) watchFaceCustomActivity.findViewById(R.id.timeDigitalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView timePointView_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (ImageView) watchFaceCustomActivity.findViewById(R.id.timePointView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView timeScaleView_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (ImageView) watchFaceCustomActivity.findViewById(R.id.timeScaleView);
    }

    private final void toCropPic(Uri uri) throws IOException {
        X1XX1O x1xx1o = this.mCustomWatchFace;
        X1XX1O x1xx1o2 = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        int iX00O0 = x1xx1o.X00O0();
        X1XX1O x1xx1o3 = this.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
        } else {
            x1xx1o2 = x1xx1o3;
        }
        int iXi1i0XOX0 = x1xx1o2.Xi1i0XOX0();
        if (iX00O0 < 320) {
            iX00O0 *= 2;
            iXi1i0XOX0 *= 2;
        }
        int i = iX00O0;
        int i2 = iXi1i0XOX0;
        i1O0OXO1O.OXO1.OXO1("toCropPic outputX:" + i + " outputY:" + i2 + " " + uri);
        getMCrop().O00(uri, 1.0d, ((double) i) / ((double) i2), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap toRound(Bitmap bitmap) {
        X1XX1O x1xx1o = this.mCustomWatchFace;
        X1XX1O x1xx1o2 = null;
        if (x1xx1o == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o = null;
        }
        if (x1xx1o.m1173O1()) {
            Bitmap round = ImageUtils.toRound(bitmap);
            Intrinsics.XXI(round);
            return round;
        }
        X1XX1O x1xx1o3 = this.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
        } else {
            x1xx1o2 = x1xx1o3;
        }
        Bitmap roundCorner = ImageUtils.toRoundCorner(bitmap, x1xx1o2.iXi());
        Intrinsics.XXI(roundCorner);
        return roundCorner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvBgTitle_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (TextView) watchFaceCustomActivity.findViewById(R.id.tv_bg_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardView watchfaceView_delegate$lambda$0(WatchFaceCustomActivity watchFaceCustomActivity) {
        return (CardView) watchFaceCustomActivity.findViewById(R.id.watchface_view);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IOException {
        getAbhTitleCenter().setText(R.string.dial_customize);
        getMCrop().XXI(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.ln6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceCustomActivity.initView$lambda$0(this.f9479IO, (Uri) obj);
            }
        });
        initWatchfaceView();
        initBgView();
        showRvBg$default(this, 0, 1, null);
        initElementView();
        String stringExtra = getIntent().getStringExtra("bgFile");
        this.mAiBgFile = stringExtra;
        if (stringExtra != null) {
            Uri uriFromFile = Uri.fromFile(new File(this.mAiBgFile));
            Intrinsics.O10IXXX0X(uriFromFile, "fromFile(...)");
            toCropPic(uriFromFile);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_watchface_custom;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        X1XX1O x1xx1o = null;
        LogUtils.m11128d("onActivityResult " + i + " " + i2 + " " + (intent != null ? intent.getData() : null));
        X1XX1O x1xx1o2 = this.mCustomWatchFace;
        if (x1xx1o2 == null) {
            Intrinsics.XXO("mCustomWatchFace");
            x1xx1o2 = null;
        }
        int iX00O0 = x1xx1o2.X00O0();
        X1XX1O x1xx1o3 = this.mCustomWatchFace;
        if (x1xx1o3 == null) {
            Intrinsics.XXO("mCustomWatchFace");
        } else {
            x1xx1o = x1xx1o3;
        }
        int iXi1i0XOX0 = x1xx1o.Xi1i0XOX0();
        if (iX00O0 < 320) {
            iX00O0 *= 2;
            iXi1i0XOX0 *= 2;
        }
        int i3 = iXi1i0XOX0;
        int i4 = iX00O0;
        LogUtils.m11128d("onActivityResult outputX:" + i4 + " outputY:" + i3);
        getMCrop().XOO0ii0(i, i2, intent, 1.0d, ((double) i4) / ((double) i3), i4, i3);
    }

    public final void onAddBg(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        selectImagePopup();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
        FileUtils.delete(uz0.i11I(sz0.OXO1));
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.mProgressPop != null) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            super.onHandleBackPressed();
        }
    }

    public final void onReset(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getControlViewStep().setVisibility(8);
        getControlViewHr().setVisibility(8);
        getControlViewCa().setVisibility(8);
        getControlViewDis().setVisibility(8);
        getTimeDigitalView().setVisibility(8);
        getTimePointView().setVisibility(8);
        getTimeScaleView().setVisibility(8);
        ControlElementFragment controlElementFragment = this.controlElementFragment;
        ControlElementFragment controlElementFragment2 = null;
        if (controlElementFragment == null) {
            Intrinsics.XXO("controlElementFragment");
            controlElementFragment = null;
        }
        controlElementFragment.getDialSelectStatus0().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment controlElementFragment3 = this.controlElementFragment;
        if (controlElementFragment3 == null) {
            Intrinsics.XXO("controlElementFragment");
            controlElementFragment3 = null;
        }
        controlElementFragment3.getDialSelectStatus1().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment controlElementFragment4 = this.controlElementFragment;
        if (controlElementFragment4 == null) {
            Intrinsics.XXO("controlElementFragment");
            controlElementFragment4 = null;
        }
        controlElementFragment4.getDialSelectStatus2().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment controlElementFragment5 = this.controlElementFragment;
        if (controlElementFragment5 == null) {
            Intrinsics.XXO("controlElementFragment");
            controlElementFragment5 = null;
        }
        controlElementFragment5.getDialSelectStatus3().setImageResource(R.drawable.ic_watchface_element_add);
        this.mBgFiles.clear();
        showRvBg$default(this, 0, 1, null);
        PointerElementFragment pointerElementFragment = this.pointerElementFragment;
        if (pointerElementFragment == null) {
            Intrinsics.XXO("pointerElementFragment");
            pointerElementFragment = null;
        }
        pointerElementFragment.reset();
        TimeElementFragment timeElementFragment = this.timeElementFragment;
        if (timeElementFragment == null) {
            Intrinsics.XXO("timeElementFragment");
            timeElementFragment = null;
        }
        timeElementFragment.reset();
        ControlElementFragment controlElementFragment6 = this.controlElementFragment;
        if (controlElementFragment6 == null) {
            Intrinsics.XXO("controlElementFragment");
        } else {
            controlElementFragment2 = controlElementFragment6;
        }
        controlElementFragment2.reset();
    }

    public final void onSycn(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mCurSyncDevicePosition = 0;
        this.mCurSyncDialId = 10000000;
        syncWatchFace();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mProgressPop != null) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            finish();
        }
    }
}
