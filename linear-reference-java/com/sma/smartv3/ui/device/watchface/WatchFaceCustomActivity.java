package com.sma.smartv3.ui.device.watchface;

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
import com.android.mltcode.paycertificationapi.an6;
import com.android.mltcode.paycertificationapi.az1;
import com.android.mltcode.paycertificationapi.bn6;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.cn6;
import com.android.mltcode.paycertificationapi.dn6;
import com.android.mltcode.paycertificationapi.en6;
import com.android.mltcode.paycertificationapi.fn6;
import com.android.mltcode.paycertificationapi.gn6;
import com.android.mltcode.paycertificationapi.hn6;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.in6;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.jn6;
import com.android.mltcode.paycertificationapi.kn6;
import com.android.mltcode.paycertificationapi.ln6;
import com.android.mltcode.paycertificationapi.mn6;
import com.android.mltcode.paycertificationapi.nn6;
import com.android.mltcode.paycertificationapi.on6;
import com.android.mltcode.paycertificationapi.pn6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qn6;
import com.android.mltcode.paycertificationapi.rn6;
import com.android.mltcode.paycertificationapi.sn6;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tn6;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vm6;
import com.android.mltcode.paycertificationapi.wm6;
import com.android.mltcode.paycertificationapi.xm6;
import com.android.mltcode.paycertificationapi.xz3;
import com.android.mltcode.paycertificationapi.ym6;
import com.android.mltcode.paycertificationapi.zm6;
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
import com.facebook.share.internal.ShareConstants;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.C2985d4;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.model.ResourcesIdInfoKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.watchface.fragment.ControlElementFragment;
import com.sma.smartv3.ui.device.watchface.fragment.PointerElementFragment;
import com.sma.smartv3.ui.device.watchface.fragment.TimeElementFragment;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWatchFaceCustomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,664:1\n255#2:665\n*S KotlinDebug\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity\n*L\n478#1:665\n*E\n"})
public final class WatchFaceCustomActivity extends BaseActivity {
    private final float WATCHFACEVIEW_HEIGHT;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy addBg$delegate;
    private ControlElementFragment controlElementFragment;

    @aa1
    private final Lazy controlViewCa$delegate;

    @aa1
    private final Lazy controlViewDis$delegate;

    @aa1
    private final Lazy controlViewHr$delegate;

    @aa1
    private final Lazy controlViewStep$delegate;

    @aa1
    private final Lazy customizeDialBg$delegate;

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
    private final Lazy mViewPager$delegate;

    @aa1
    private final String paramName;
    private PointerElementFragment pointerElementFragment;

    @aa1
    private final Lazy rvBg$delegate;
    private CommonAdapter<String> rvBgAdapter;
    private int selectedIndex;

    @aa1
    private final Lazy table$delegate;

    @aa1
    private final Lazy timeDigitalView$delegate;
    private TimeElementFragment timeElementFragment;

    @aa1
    private final Lazy timePointView$delegate;

    @aa1
    private final Lazy timeScaleView$delegate;

    @aa1
    private final Lazy tvBgTitle$delegate;

    @aa1
    private final Lazy watchfaceView$delegate;

    @SourceDebugExtension({"SMAP\nWatchFaceCustomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n1869#2,2:665\n*S KotlinDebug\n*F\n+ 1 WatchFaceCustomActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$mBleHandleCallback$1\n*L\n231#1:665,2\n*E\n"})
    public static final class IiI10X implements BleHandleCallback {
        public final /* synthetic */ WatchFaceCustomActivity IO;

        public IiI10X(WatchFaceCustomActivity r1) {
            this.IO = r1;
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
        public /* bridge */ void onCommandReply(BleKey r1, BleKeyFlag r2, boolean r3) {
            super.onCommandReply(r1, r2, r3);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onCommandSendTimeout(BleKey r3, BleKeyFlag r4) {
            Intrinsics.X0O(r3, "bleKey");
            Intrinsics.X0O(r4, "bleKeyFlag");
            if (r3 != BleKey.WATCH_FACE) goto L6;
            WatchFaceCustomActivity.syncFailed$default(this.IO, 0, 1, null);
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
        public /* bridge */ void onDeviceConnected(BluetoothDevice r1) {
            super.onDeviceConnected(r1);
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
        public void onReadWatchFaceId(BleWatchFaceId r4) {
            Intrinsics.X0O(r4, "watchFaceId");
            WatchFaceCustomActivity.access$getMDialIds$p(this.IO).clear();
            List<Integer> r5 = r4.getMIdList();
            WatchFaceCustomActivity r0 = this.IO;
            Iterator<T> r6 = r5.iterator();
        L4:
            if (r6.hasNext() == false) goto L9;
            int r1 = ((Number) r6.next()).intValue();
            if (r1 <= 0) goto L7;
            WatchFaceCustomActivity.access$getMDialIds$p(r0).add(Integer.valueOf(r1));
            goto L4
        L7:
            WatchFaceCustomActivity.access$getMDialIds$p(r0).add(0);
            goto L4
        L9:
            LogUtils.d(new Object[]{"mDialIds -> " + WatchFaceCustomActivity.access$getMDialIds$p(this.IO)});
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
            if (r4 == false) goto L4;
            return;
        L4:
            if (WatchFaceCustomActivity.access$getMProgressPop$p(this.IO) == null) goto L8;
            WatchFaceCustomActivity.syncFailed$default(this.IO, 0, 1, null);
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
        public void onStreamProgress(boolean r2, int r3, int r4, int r5, BleKey r6) {
            Intrinsics.X0O(r6, "bleKey");
            if (r2 == false) goto L13;
            c72 r7 = WatchFaceCustomActivity.access$getMProgressPop$p(this.IO);
            if (r7 == null) goto L7;
            r7.OX((int) ((r5 / r4) * 100));
        L7:
            if (r4 != r5) goto L15;
            c72 r8 = WatchFaceCustomActivity.access$getMProgressPop$p(this.IO);
            if (r8 == null) goto L11;
            r8.dismiss();
        L11:
            WatchFaceCustomActivity.access$setMProgressPop$p(this.IO, null);
            ToastUtils.showLong(R.string.dial_sync_done);
            WatchFaceCustomActivity.access$getMDialIds$p(this.IO).set(WatchFaceCustomActivity.access$getMCurSyncDevicePosition$p(this.IO), Integer.valueOf(WatchFaceCustomActivity.access$getMCurSyncDialId$p(this.IO)));
            a01.OXO1.XIi00iiXO().put("syncId", 0);
            WatchFaceCustomActivity.access$saveRecord(this.IO);
            return;
        L15:
            return;
        L13:
            WatchFaceCustomActivity.access$syncFailed(this.IO, r3);
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
        public void onWatchFaceIdUpdate(boolean r1) {
            WatchFaceCustomActivity.access$syncWatchFace(this.IO);
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

    public static final class O00 extends X1XX1O {
        public final /* synthetic */ WatchFaceCustomActivity iXi;

        public O00(WatchFaceCustomActivity r1, Application r2) {
            this.iXi = r1;
            Intrinsics.XXI(r2);
            super(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.X1XX1O
        public void IOi1O0() {
            View r0 = this.iXi.findViewById(R.id.root_view);
            Intrinsics.O10IXXX0X(r0, "findViewById(...)");
            XOOXII(r0);
            View r1 = Ii0i().findViewById(R.id.customizeDialBg);
            Intrinsics.O10IXXX0X(r1, "findViewById(...)");
            i1O11001((ImageView) r1);
            View r2 = Ii0i().findViewById(R.id.controlViewStep);
            Intrinsics.O10IXXX0X(r2, "findViewById(...)");
            iIIIiIO0((ViewGroup) r2);
            View r3 = Ii0i().findViewById(R.id.controlViewHr);
            Intrinsics.O10IXXX0X(r3, "findViewById(...)");
            IiXIIX1O1((ViewGroup) r3);
            View r4 = Ii0i().findViewById(R.id.controlViewCa);
            Intrinsics.O10IXXX0X(r4, "findViewById(...)");
            I0iOXO((ViewGroup) r4);
            View r5 = Ii0i().findViewById(R.id.controlViewDis);
            Intrinsics.O10IXXX0X(r5, "findViewById(...)");
            XOXOIX0Oi((ViewGroup) r5);
            View r6 = Ii0i().findViewById(R.id.timeDigitalView);
            Intrinsics.O10IXXX0X(r6, "findViewById(...)");
            IOI((ViewGroup) r6);
            View r7 = Ii0i().findViewById(R.id.timePointView);
            Intrinsics.O10IXXX0X(r7, "findViewById(...)");
            OiO0IOX((ImageView) r7);
            View r8 = Ii0i().findViewById(R.id.timeScaleView);
            Intrinsics.O10IXXX0X(r8, "findViewById(...)");
            i0101i((ImageView) r8);
        }
    }

    public static final class OXO1 implements az1<Integer> {
        public final /* synthetic */ WatchFaceCustomActivity OXO1;
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;
        public final /* synthetic */ List<ResourcesIdInfo> iO;

        public OXO1(WatchFaceCustomActivity r1, List<ResourcesIdInfo> r2, List<ResourcesIdInfo> r3) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.az1
        public /* bridge */ /* synthetic */ void OXO1(Integer r1, boolean r2) {
            iO(r1.intValue(), r2);
        }

        @Override // com.android.mltcode.paycertificationapi.az1
        public /* bridge */ /* synthetic */ void XIi00iiXO(Integer r1, boolean r2) {
            XO0O10(r1.intValue(), r2);
        }

        public void XO0O10(int r4, boolean r5) {
            int r1 = 8;
            WatchFaceCustomActivity.access$getTimeDigitalView(this.OXO1).setVisibility(8);
            WatchFaceCustomActivity.access$getTimeScaleView(this.OXO1).setImageResource(this.iO.get(r4).getResId());
            X1XX1O r0 = WatchFaceCustomActivity.access$getMCustomWatchFace$p(this.OXO1);
            TimeElementFragment r2 = null;
            if (r0 != null) goto L5;
            Intrinsics.XXO("mCustomWatchFace");
            r0 = null;
        L5:
            r0.iIXX0i(r4);
            ImageView r6 = WatchFaceCustomActivity.access$getTimeScaleView(this.OXO1);
            if (r5 == false) goto L8;
            r1 = 0;
        L8:
            r6.setVisibility(r1);
            TimeElementFragment r7 = WatchFaceCustomActivity.access$getTimeElementFragment$p(this.OXO1);
            if (r7 != null) goto L11;
            Intrinsics.XXO("timeElementFragment");
        L12:
            r2.reset();
            return;
        L11:
            r2 = r7;
            goto L12
        }

        public void iO(int r4, boolean r5) {
            int r1 = 8;
            WatchFaceCustomActivity.access$getTimeDigitalView(this.OXO1).setVisibility(8);
            WatchFaceCustomActivity.access$getTimePointView(this.OXO1).setImageResource(this.XIi00iiXO.get(r4).getResId());
            X1XX1O r0 = WatchFaceCustomActivity.access$getMCustomWatchFace$p(this.OXO1);
            TimeElementFragment r2 = null;
            if (r0 != null) goto L5;
            Intrinsics.XXO("mCustomWatchFace");
            r0 = null;
        L5:
            r0.OIIOI(r4);
            ImageView r6 = WatchFaceCustomActivity.access$getTimePointView(this.OXO1);
            if (r5 == false) goto L8;
            r1 = 0;
        L8:
            r6.setVisibility(r1);
            TimeElementFragment r7 = WatchFaceCustomActivity.access$getTimeElementFragment$p(this.OXO1);
            if (r7 != null) goto L11;
            Intrinsics.XXO("timeElementFragment");
        L12:
            r2.reset();
            return;
        L11:
            r2 = r7;
            goto L12
        }
    }

    public static final class XIi00iiXO implements IXI011X11<Integer> {
        public final /* synthetic */ WatchFaceCustomActivity OXO1;
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        public XIi00iiXO(WatchFaceCustomActivity r1, List<ResourcesIdInfo> r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.IXI011X11
        public /* bridge */ /* synthetic */ void OXO1(Integer r1, boolean r2) {
            XIi00iiXO(r1.intValue(), r2);
        }

        public void XIi00iiXO(int r3, boolean r4) {
            DialElementView r0 = WatchFaceCustomActivity.access$getTimeDigitalView(this.OXO1);
            if (r4 == false) goto L5;
            int r5 = 0;
        L6:
            r0.setVisibility(r5);
            WatchFaceCustomActivity.access$getTimePointView(this.OXO1).setVisibility(8);
            WatchFaceCustomActivity.access$getTimeScaleView(this.OXO1).setVisibility(8);
            WatchFaceCustomActivity.access$getTimeDigitalView(this.OXO1).setImageRes(this.XIi00iiXO.get(r3).getResId());
            X1XX1O r6 = WatchFaceCustomActivity.access$getMCustomWatchFace$p(this.OXO1);
            if (r6 != null) goto L9;
            Intrinsics.XXO("mCustomWatchFace");
            r6 = null;
        L9:
            r6.OI1IiOO1i(r3);
            return;
        L5:
            r5 = 8;
            goto L6
        }
    }

    public static final class XO0O10 implements jl1 {
        public final /* synthetic */ WatchFaceCustomActivity IO;

        public XO0O10(WatchFaceCustomActivity r1) {
            this.IO = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.jl1
        public List<Fragment> initFragments() {
            PointerElementFragment r0 = WatchFaceCustomActivity.access$getPointerElementFragment$p(this.IO);
            ControlElementFragment r1 = null;
            if (r0 != null) goto L5;
            Intrinsics.XXO("pointerElementFragment");
            r0 = null;
        L5:
            TimeElementFragment r2 = WatchFaceCustomActivity.access$getTimeElementFragment$p(this.IO);
            if (r2 != null) goto L8;
            Intrinsics.XXO("timeElementFragment");
            r2 = null;
        L8:
            ControlElementFragment r3 = WatchFaceCustomActivity.access$getControlElementFragment$p(this.IO);
            if (r3 != null) goto L11;
            Intrinsics.XXO("controlElementFragment");
        L13:
            return CollectionsKt__CollectionsKt.iXiX011(new Fragment[]{r0, r2, r1});
        L11:
            r1 = r3;
            goto L13
        }

        @Override // com.android.mltcode.paycertificationapi.jl1
        public FragmentManager provideFragmentManager() {
            FragmentManager r0 = this.IO.getSupportFragmentManager();
            Intrinsics.O10IXXX0X(r0, "getSupportFragmentManager(...)");
            return r0;
        }
    }

    public static final class XOO0ii0 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;
        public final /* synthetic */ WatchFaceCustomActivity iO;

        public XOO0ii0(WatchFaceCustomActivity r2) {
            this.iO = r2;
            sz0 r3 = sz0.OXO1;
            this.OXO1 = r3.XO0O10(uz0.II1Xi0(r3));
            Uri r4 = Uri.fromFile(uz0.XiOIii1(r3));
            Intrinsics.O10IXXX0X(r4, "fromFile(...)");
            this.XIi00iiXO = r4;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri OXO1() {
            return this.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public void XIi00iiXO(Uri r5) {
            Intrinsics.X0O(r5, ShareConstants.MEDIA_URI);
            LogUtils.d(new Object[]{"onCropped => " + r5});
            xz3 r6 = WatchFaceCustomActivity.access$getMSelectAvatarPopup$p(this.iO);
            if (r6 == null) goto L5;
            r6.dismiss();
        L5:
            sz0 r7 = sz0.OXO1;
            if (uz0.XiOIii1(r7).exists() == false) goto L9;
            File r0 = new File(uz0.i11I(r7), O0X11OiO.X11I().format(new Date()) + ".png");
            Bitmap r8 = ImageUtils.getBitmap(uz0.XiOIii1(r7));
            WatchFaceCustomActivity r1 = this.iO;
            Intrinsics.XXI(r8);
            ImageUtils.save(WatchFaceCustomActivity.access$toRound(r1, r8), r0, Bitmap.CompressFormat.PNG);
            List r9 = WatchFaceCustomActivity.access$getMBgFiles$p(this.iO);
            String r2 = r0.getPath();
            Intrinsics.O10IXXX0X(r2, "getPath(...)");
            r9.add(r2);
            WatchFaceCustomActivity.showRvBg$default(this.iO, 0, 1, null);
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    public static final class iO implements IXI011X11<Integer> {
        public final /* synthetic */ WatchFaceCustomActivity OXO1;
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        public iO(WatchFaceCustomActivity r1, List<ResourcesIdInfo> r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.IXI011X11
        public /* bridge */ /* synthetic */ void OXO1(Integer r1, boolean r2) {
            XIi00iiXO(r1.intValue(), r2);
        }

        public void XIi00iiXO(int r2, boolean r3) {
            WatchFaceCustomActivity.access$getControlViewStep(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            WatchFaceCustomActivity.access$getControlViewHr(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            WatchFaceCustomActivity.access$getControlViewCa(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            WatchFaceCustomActivity.access$getControlViewDis(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            X1XX1O r4 = WatchFaceCustomActivity.access$getMCustomWatchFace$p(this.OXO1);
            if (r4 != null) goto L5;
            Intrinsics.XXO("mCustomWatchFace");
            r4 = null;
        L5:
            r4.I0OX(r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.WatchFaceCustomActivity$initBgView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends CommonAdapter<String> {
        final /* synthetic */ WatchFaceCustomActivity this$0;

        public AnonymousClass2(WatchFaceCustomActivity r1, int r2, List<String> r3) {
            this.this$0 = r1;
            super(r1, r2, r3);
        }

        public static /* synthetic */ void OXO1(WatchFaceCustomActivity r0, int r1, View r2) {
            convert$lambda$1(r0, r1, r2);
        }

        public static /* synthetic */ void XIi00iiXO(WatchFaceCustomActivity r0, int r1, View r2) {
            convert$lambda$0$0(r0, r1, r2);
        }

        private static final void convert$lambda$0$0(WatchFaceCustomActivity r0, int r1, View r2) {
            WatchFaceCustomActivity.access$showRvBg(r0, r1);
        }

        private static final void convert$lambda$1(WatchFaceCustomActivity r1, int r2, View r3) {
            WatchFaceCustomActivity.access$getMBgFiles$p(r1).remove(r2);
            WatchFaceCustomActivity.showRvBg$default(r1, 0, 1, null);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, String r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r4, String r5, final int r6) {
            Intrinsics.X0O(r4, "holder");
            Intrinsics.X0O(r5, "path");
            ImageViewRound r0 = (ImageViewRound) r4.getView(R.id.iv);
            if (r0 == null) goto L12;
            final WatchFaceCustomActivity r1 = this.this$0;
            if (FileUtils.isFileExists(r5) == false) goto L7;
            r0.setImageURI(Uri.fromFile(new File(r5)));
        L7:
            r0.setOnClickListener(new sn6(r1, r6));
            if (WatchFaceCustomActivity.access$getSelectedIndex$p(r1) != r6) goto L10;
            boolean r7 = true;
        L11:
            r0.showSelected(r7);
            goto L12
        L10:
            r7 = false;
        L12:
            ImageView r8 = (ImageView) r4.getView(R.id.iv_status);
            final WatchFaceCustomActivity r9 = this.this$0;
            r8.setOnClickListener(new tn6(r9, r6));
        }
    }

    public WatchFaceCustomActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new on6(this));
        this.WATCHFACEVIEW_HEIGHT = 260.0f;
        this.watchfaceView$delegate = LazyKt__LazyJVMKt.iO(new zm6(this));
        this.customizeDialBg$delegate = LazyKt__LazyJVMKt.iO(new an6(this));
        this.controlViewStep$delegate = LazyKt__LazyJVMKt.iO(new bn6(this));
        this.controlViewHr$delegate = LazyKt__LazyJVMKt.iO(new cn6(this));
        this.controlViewCa$delegate = LazyKt__LazyJVMKt.iO(new dn6(this));
        this.controlViewDis$delegate = LazyKt__LazyJVMKt.iO(new en6(this));
        this.timeDigitalView$delegate = LazyKt__LazyJVMKt.iO(new fn6(this));
        this.timePointView$delegate = LazyKt__LazyJVMKt.iO(new hn6(this));
        this.timeScaleView$delegate = LazyKt__LazyJVMKt.iO(new in6(this));
        this.tvBgTitle$delegate = LazyKt__LazyJVMKt.iO(new pn6(this));
        this.addBg$delegate = LazyKt__LazyJVMKt.iO(new qn6(this));
        this.rvBg$delegate = LazyKt__LazyJVMKt.iO(new rn6(this));
        this.table$delegate = LazyKt__LazyJVMKt.iO(new wm6(this));
        this.mViewPager$delegate = LazyKt__LazyJVMKt.iO(new xm6(this));
        if (q62.OXO1.iIi011O() == false) goto L5;
        String r0 = "/2d/";
    L6:
        this.is2DAcceleration = r0;
        this.paramName = BleCache.INSTANCE.getMPrototype() + "/";
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0});
        this.mBgFiles = new ArrayList();
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new ym6(this));
        this.mBleHandleCallback = new IiI10X(this);
        return;
    L5:
        r0 = "/default/";
        goto L6
    }

    public static /* synthetic */ Unit I0iXXO(WatchFaceCustomActivity r0, boolean r1) {
        return selectImagePopup$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ i1Ii1i11X I1(WatchFaceCustomActivity r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NoScollViewPager I1XOi1(WatchFaceCustomActivity r0) {
        return mViewPager_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView II1Xi0(WatchFaceCustomActivity r0) {
        return controlViewDis_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(WatchFaceCustomActivity r0, ControlElementFragment r1, View r2) {
        initElementView$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ TabLayout IXXOO(WatchFaceCustomActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView O10IXXX0X(WatchFaceCustomActivity r0) {
        return controlViewHr_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OII(WatchFaceCustomActivity r0) {
        return timePointView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(WatchFaceCustomActivity r0) {
        return timeScaleView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView OX(WatchFaceCustomActivity r0) {
        return timeDigitalView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup OiIIX101O(WatchFaceCustomActivity r0) {
        return addBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView X01IiOiIi(WatchFaceCustomActivity r0) {
        return controlViewCa_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound X0O(WatchFaceCustomActivity r0) {
        return customizeDialBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView X1ii(WatchFaceCustomActivity r0) {
        return controlViewStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(xz3 r0, WatchFaceCustomActivity r1) {
        return selectImagePopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI(WatchFaceCustomActivity r0) {
        return selectImagePopup$lambda$0$1(r0);
    }

    public static /* synthetic */ CardView XiOIO(WatchFaceCustomActivity r0) {
        return watchfaceView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(WatchFaceCustomActivity r0) {
        syncWatchFace$lambda$1(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ ControlElementFragment access$getControlElementFragment$p(WatchFaceCustomActivity r0) {
        return r0.controlElementFragment;
    }

    public static final /* synthetic */ DialElementView access$getControlViewCa(WatchFaceCustomActivity r0) {
        return r0.getControlViewCa();
    }

    public static final /* synthetic */ DialElementView access$getControlViewDis(WatchFaceCustomActivity r0) {
        return r0.getControlViewDis();
    }

    public static final /* synthetic */ DialElementView access$getControlViewHr(WatchFaceCustomActivity r0) {
        return r0.getControlViewHr();
    }

    public static final /* synthetic */ DialElementView access$getControlViewStep(WatchFaceCustomActivity r0) {
        return r0.getControlViewStep();
    }

    public static final /* synthetic */ List access$getMBgFiles$p(WatchFaceCustomActivity r0) {
        return r0.mBgFiles;
    }

    public static final /* synthetic */ int access$getMCurSyncDevicePosition$p(WatchFaceCustomActivity r0) {
        return r0.mCurSyncDevicePosition;
    }

    public static final /* synthetic */ int access$getMCurSyncDialId$p(WatchFaceCustomActivity r0) {
        return r0.mCurSyncDialId;
    }

    public static final /* synthetic */ X1XX1O access$getMCustomWatchFace$p(WatchFaceCustomActivity r0) {
        return r0.mCustomWatchFace;
    }

    public static final /* synthetic */ List access$getMDialIds$p(WatchFaceCustomActivity r0) {
        return r0.mDialIds;
    }

    public static final /* synthetic */ c72 access$getMProgressPop$p(WatchFaceCustomActivity r0) {
        return r0.mProgressPop;
    }

    public static final /* synthetic */ xz3 access$getMSelectAvatarPopup$p(WatchFaceCustomActivity r0) {
        return r0.mSelectAvatarPopup;
    }

    public static final /* synthetic */ PointerElementFragment access$getPointerElementFragment$p(WatchFaceCustomActivity r0) {
        return r0.pointerElementFragment;
    }

    public static final /* synthetic */ int access$getSelectedIndex$p(WatchFaceCustomActivity r0) {
        return r0.selectedIndex;
    }

    public static final /* synthetic */ DialElementView access$getTimeDigitalView(WatchFaceCustomActivity r0) {
        return r0.getTimeDigitalView();
    }

    public static final /* synthetic */ TimeElementFragment access$getTimeElementFragment$p(WatchFaceCustomActivity r0) {
        return r0.timeElementFragment;
    }

    public static final /* synthetic */ ImageView access$getTimePointView(WatchFaceCustomActivity r0) {
        return r0.getTimePointView();
    }

    public static final /* synthetic */ ImageView access$getTimeScaleView(WatchFaceCustomActivity r0) {
        return r0.getTimeScaleView();
    }

    public static final /* synthetic */ void access$saveRecord(WatchFaceCustomActivity r0) {
        r0.saveRecord();
    }

    public static final /* synthetic */ void access$setMProgressPop$p(WatchFaceCustomActivity r0, c72 r1) {
        r0.mProgressPop = r1;
    }

    public static final /* synthetic */ void access$showRvBg(WatchFaceCustomActivity r0, int r1) {
        r0.showRvBg(r1);
    }

    public static final /* synthetic */ void access$syncFailed(WatchFaceCustomActivity r0, int r1) {
        r0.syncFailed(r1);
    }

    public static final /* synthetic */ void access$syncWatchFace(WatchFaceCustomActivity r0) {
        r0.syncWatchFace();
    }

    public static final /* synthetic */ Bitmap access$toRound(WatchFaceCustomActivity r0, Bitmap r1) {
        return r0.toRound(r1);
    }

    private static final ViewGroup addBg_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.add_bg);
    }

    private final void adjustWatchfaceViewWidth() {
        X1XX1O r0 = this.mCustomWatchFace;
        X1XX1O r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L5:
        float r2 = r0.X00O0();
        X1XX1O r3 = this.mCustomWatchFace;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
        r3 = null;
    L8:
        float r4 = this.WATCHFACEVIEW_HEIGHT * (r2 / r3.Xi1i0XOX0());
        CardView r5 = getWatchfaceView();
        Intrinsics.O10IXXX0X(r5, "<get-watchfaceView>(...)");
        LibExKt.i100IXOX(r5, SizeUtils.dp2px(r4), SizeUtils.dp2px(this.WATCHFACEVIEW_HEIGHT));
        ImageViewRound r6 = getCustomizeDialBg();
        X1XX1O r7 = this.mCustomWatchFace;
        if (r7 != null) goto L11;
        Intrinsics.XXO("mCustomWatchFace");
        r7 = null;
    L11:
        r6.setRadius(SizeUtils.dp2px(r7.XXI0XOIX()));
        ImageViewRound r8 = getCustomizeDialBg();
        X1XX1O r9 = this.mCustomWatchFace;
        if (r9 != null) goto L14;
        Intrinsics.XXO("mCustomWatchFace");
        r9 = null;
    L14:
        r8.setType(!r9.O1() ? 1 : 0);
        CardView r10 = getWatchfaceView();
        X1XX1O r11 = this.mCustomWatchFace;
        if (r11 != null) goto L18;
        Intrinsics.XXO("mCustomWatchFace");
        r11 = null;
    L18:
        if (r11.O1() == false) goto L20;
        float r12 = 200.0f;
    L25:
        r10.setRadius(SizeUtils.dp2px(r12));
        return;
    L20:
        X1XX1O r13 = this.mCustomWatchFace;
        if (r13 != null) goto L23;
        Intrinsics.XXO("mCustomWatchFace");
    L24:
        r12 = r1.XXI0XOIX();
        goto L25
    L23:
        r1 = r13;
        goto L24
    }

    private final void controlChangeStatus(View r2, ImageView r3) {
        if (r2.getVisibility() != 0) goto L6;
        r2.setVisibility(8);
        r3.setImageResource(R.drawable.ic_watchface_element_add);
        return;
    L6:
        r2.setVisibility(0);
        r3.setImageResource(R.drawable.ic_watchface_element_del);
    }

    private static final DialElementView controlViewCa_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewCa);
    }

    private static final DialElementView controlViewDis_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewDis);
    }

    private static final DialElementView controlViewHr_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewHr);
    }

    private static final DialElementView controlViewStep_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewStep);
    }

    private static final ImageViewRound customizeDialBg_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.customizeDialBg);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final ViewGroup getAddBg() {
        return (ViewGroup) getValue();
    }

    private final DialElementView getControlViewCa() {
        return (DialElementView) getValue();
    }

    private final DialElementView getControlViewDis() {
        return (DialElementView) getValue();
    }

    private final DialElementView getControlViewHr() {
        return (DialElementView) getValue();
    }

    private final DialElementView getControlViewStep() {
        return (DialElementView) getValue();
    }

    private final ImageViewRound getCustomizeDialBg() {
        return (ImageViewRound) getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private final NoScollViewPager getMViewPager() {
        return (NoScollViewPager) getValue();
    }

    private final RecyclerView getRvBg() {
        return (RecyclerView) getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private final DialElementView getTimeDigitalView() {
        return (DialElementView) getValue();
    }

    private final ImageView getTimePointView() {
        return (ImageView) getValue();
    }

    private final ImageView getTimeScaleView() {
        return (ImageView) getValue();
    }

    private final TextView getTvBgTitle() {
        return (TextView) getValue();
    }

    private final CardView getWatchfaceView() {
        return (CardView) getValue();
    }

    public static /* synthetic */ RecyclerView i010I(WatchFaceCustomActivity r0) {
        return rvBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iIiiO(WatchFaceCustomActivity r0) {
        return tvBgTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(TimeElementFragment r0, WatchFaceCustomActivity r1, View r2) {
        initElementView$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ PFMedium iOOX010X(WatchFaceCustomActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iX(WatchFaceCustomActivity r0, Uri r1) {
        return initView$lambda$0(r0, r1);
    }

    private final void initBgView() {
        RecyclerView r0 = getRvBg();
        LinearLayoutManager r1 = new LinearLayoutManager(this);
        r1.setOrientation(0);
        r0.setLayoutManager(r1);
        X1XX1O r2 = this.mCustomWatchFace;
        CommonAdapter<String> r3 = null;
        if (r2 != null) goto L6;
        Intrinsics.XXO("mCustomWatchFace");
        r2 = null;
    L6:
        if (r2.O1() == false) goto L8;
        int r4 = R.layout.item_watchface_bg;
    L9:
        this.rvBgAdapter = new AnonymousClass2(this, r4, this.mBgFiles);
        RecyclerView r5 = getRvBg();
        CommonAdapter<String> r6 = this.rvBgAdapter;
        if (r6 != null) goto L12;
        Intrinsics.XXO("rvBgAdapter");
    L13:
        r5.setAdapter(r3);
        return;
    L12:
        r3 = r6;
        goto L13
    L8:
        r4 = R.layout.item_watchface_bg_r;
        goto L9
    }

    private final void initElementView() {
        BleCache r0 = BleCache.INSTANCE;
        BleDeviceInfo r1 = r0.getMDeviceInfo();
        Intrinsics.XXI(r1);
        List<ResourcesIdInfo> r2 = ResourcesIdInfoKt.getWatchFaceElementPointers(r1);
        BleDeviceInfo r3 = r0.getMDeviceInfo();
        Intrinsics.XXI(r3);
        X1XX1O r4 = this.mCustomWatchFace;
        X1XX1O r5 = null;
        if (r4 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r4 = null;
    L5:
        List<ResourcesIdInfo> r6 = ResourcesIdInfoKt.getWatchFaceElementScales(r3, r4.O1());
        List<ResourcesIdInfo> r7 = ResourcesIdInfoKt.getWatchFaceElementColors(this);
        List<ResourcesIdInfo> r8 = ResourcesIdInfoKt.getWatchFaceElementDigitalTimes();
        X1XX1O r9 = this.mCustomWatchFace;
        if (r9 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
        r9 = null;
    L8:
        this.pointerElementFragment = new PointerElementFragment(r2, r6, r9.O1(), new OXO1(this, r2, r6));
        X1XX1O r10 = this.mCustomWatchFace;
        if (r10 != null) goto L11;
        Intrinsics.XXO("mCustomWatchFace");
        r10 = null;
    L11:
        final TimeElementFragment r11 = new TimeElementFragment(r7, r10.O1(), new XIi00iiXO(this, r8));
        r11.setOnViewClickListener(new gn6(r11, this));
        this.timeElementFragment = r11;
        X1XX1O r12 = this.mCustomWatchFace;
        if (r12 != null) goto L14;
        Intrinsics.XXO("mCustomWatchFace");
    L15:
        final ControlElementFragment r13 = new ControlElementFragment(r7, r5.O1(), new iO(this, r7));
        r13.setOnViewClickListener(new kn6(this, r13));
        this.controlElementFragment = r13;
        BaseFragmentPagerAdapter r14 = new BaseFragmentPagerAdapter(new XO0O10(this));
        String r15 = getString(R.string.pointer) + C2985d4.j.c + getString(R.string.scale);
        String r16 = getString(R.string.time);
        Intrinsics.O10IXXX0X(r16, "getString(...)");
        String r17 = getString(R.string.control);
        Intrinsics.O10IXXX0X(r17, "getString(...)");
        r14.setTitles(new String[]{r15, r16, r17});
        getMViewPager().setAdapter(r14);
        getMViewPager().setOffscreenPageLimit(r14.getCount());
        this.mFragmentPagerAdapter = r14;
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().setCanScoll(false);
        return;
    L14:
        r5 = r12;
        goto L15
    }

    private static final void initElementView$lambda$0$0(TimeElementFragment r2, WatchFaceCustomActivity r3, View r4) {
        if (r4.getId() != R.id.dialSelect0) goto L13;
        ImageView r5 = r2.getDialSelectStatus0();
        if (r5.getVisibility() != 8) goto L7;
        int r0 = 0;
    L8:
        r5.setVisibility(r0);
        r3.getTimeDigitalView().setVisibility(r2.getDialSelectStatus0().getVisibility());
        r3.getTimePointView().setVisibility(8);
        r3.getTimeScaleView().setVisibility(8);
        PointerElementFragment r6 = r3.pointerElementFragment;
        if (r6 != null) goto L11;
        Intrinsics.XXO("pointerElementFragment");
        r6 = null;
    L11:
        r6.reset();
        return;
    L7:
        r0 = 8;
        goto L8
    }

    private static final void initElementView$lambda$1$0(WatchFaceCustomActivity r1, ControlElementFragment r2, View r3) {
        switch(r3.getId()) {
            case 2131362552: goto L11;
            case 2131362553: goto L9;
            case 2131362554: goto L7;
            case 2131362555: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        DialElementView r4 = r1.getControlViewDis();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewDis>(...)");
        ImageView r5 = r2.getDialSelectStatus3();
        Intrinsics.O10IXXX0X(r5, "<get-dialSelectStatus3>(...)");
        r1.controlChangeStatus(r4, r5);
        return;
    L7:
        DialElementView r6 = r1.getControlViewCa();
        Intrinsics.O10IXXX0X(r6, "<get-controlViewCa>(...)");
        ImageView r7 = r2.getDialSelectStatus2();
        Intrinsics.O10IXXX0X(r7, "<get-dialSelectStatus2>(...)");
        r1.controlChangeStatus(r6, r7);
        return;
    L9:
        DialElementView r8 = r1.getControlViewHr();
        Intrinsics.O10IXXX0X(r8, "<get-controlViewHr>(...)");
        ImageView r9 = r2.getDialSelectStatus1();
        Intrinsics.O10IXXX0X(r9, "<get-dialSelectStatus1>(...)");
        r1.controlChangeStatus(r8, r9);
        return;
    L11:
        DialElementView r10 = r1.getControlViewStep();
        Intrinsics.O10IXXX0X(r10, "<get-controlViewStep>(...)");
        ImageView r11 = r2.getDialSelectStatus0();
        Intrinsics.O10IXXX0X(r11, "<get-dialSelectStatus0>(...)");
        r1.controlChangeStatus(r10, r11);
    }

    private static final Unit initView$lambda$0(WatchFaceCustomActivity r1, Uri r2) {
        Intrinsics.X0O(r2, "it");
        r1.toCropPic(r2);
        return Unit.OXO1;
    }

    private final void initWatchfaceView() {
        this.mCustomWatchFace = new O00(this, Utils.getApp());
        DialElementView r0 = getControlViewStep();
        X1XX1O r1 = this.mCustomWatchFace;
        X1XX1O r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r1 = null;
    L5:
        r0.setIsRangeCircle(r1.O1());
        DialElementView r3 = getControlViewHr();
        X1XX1O r4 = this.mCustomWatchFace;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
        r4 = null;
    L8:
        r3.setIsRangeCircle(r4.O1());
        DialElementView r5 = getControlViewCa();
        X1XX1O r6 = this.mCustomWatchFace;
        if (r6 != null) goto L11;
        Intrinsics.XXO("mCustomWatchFace");
        r6 = null;
    L11:
        r5.setIsRangeCircle(r6.O1());
        DialElementView r7 = getControlViewDis();
        X1XX1O r8 = this.mCustomWatchFace;
        if (r8 != null) goto L14;
        Intrinsics.XXO("mCustomWatchFace");
        r8 = null;
    L14:
        r7.setIsRangeCircle(r8.O1());
        DialElementView r9 = getTimeDigitalView();
        X1XX1O r10 = this.mCustomWatchFace;
        if (r10 != null) goto L17;
        Intrinsics.XXO("mCustomWatchFace");
    L18:
        r9.setIsRangeCircle(r2.O1());
        adjustWatchfaceViewWidth();
        return;
    L17:
        r2 = r10;
        goto L18
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(WatchFaceCustomActivity r3) {
        return new i1Ii1i11X(r3.getMContext(), new XOO0ii0(r3));
    }

    private static final NoScollViewPager mViewPager_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (NoScollViewPager) r1.findViewById(R.id.view_pager);
    }

    private static final RecyclerView rvBg_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv_bg);
    }

    private final void saveRecord() {
        String r0 = BleCache.INSTANCE.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + IiXI1X1OO.O00 + System.currentTimeMillis();
        if (TextUtils.isEmpty(this.mAiBgFile) == false) goto L5;
        String r1 = this.paramName + this.is2DAcceleration + r0;
    L6:
        sz0 r2 = sz0.OXO1;
        File r3 = new File(uz0.XXX11i(r2), r1 + ".png");
        X1XX1O r4 = this.mCustomWatchFace;
        if (r4 != null) goto L9;
        Intrinsics.XXO("mCustomWatchFace");
        r4 = null;
    L9:
        FileIOUtils.writeFileFromBytesByStream(r3, r4.IXiOXO());
        File r5 = new File(uz0.XXX11i(r2), r1);
        byte[] r6 = this.mCurSendBytes;
        if (r6 != null) goto L12;
        Intrinsics.XXO("mCurSendBytes");
        r6 = null;
    L12:
        FileIOUtils.writeFileFromBytesByStream(r5, r6);
        I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
        return;
    L5:
        r1 = this.paramName + "/AI/" + r0;
        goto L6
    }

    private final void selectImagePopup() {
        if (this.mSelectAvatarPopup != null) goto L5;
        final xz3 r0 = new xz3(this);
        r0.iX(new mn6(r0, this));
        r0.i010I(new nn6(this));
        this.mSelectAvatarPopup = r0;
    L5:
        xz3 r1 = this.mSelectAvatarPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final Unit selectImagePopup$lambda$0$0(xz3 r2, final WatchFaceCustomActivity r3) {
        hr1.OXO1.iOOX010X(r2.XO0O10(), new vm6(r3));
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$0$0(WatchFaceCustomActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().iO();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$1(WatchFaceCustomActivity r0) {
        r0.getMCrop().OIX0iXi();
        return Unit.OXO1;
    }

    private final void showRvBg(int r8) {
        this.selectedIndex = r8;
        X1XX1O r0 = this.mCustomWatchFace;
        CommonAdapter<String> r2 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L6:
        if (this.mBgFiles.isEmpty() == false) goto L8;
    L10:
        Bitmap r9 = ImageUtils.getBitmap(R.drawable.pic_custom_bg_def);
    L11:
        Intrinsics.XXI(r9);
        r0.I00(r9);
        TextView r10 = getTvBgTitle();
        String r1 = getString(R.string.image);
        int r3 = this.mBgFiles.size();
        q62 r4 = q62.OXO1;
        r10.setText(r1 + I000IiI1O.iO.XIi00iiXO + r3 + "/" + r4.XOIX() + I000IiI1O.iO.iO);
        ViewGroup r11 = getAddBg();
        if (this.mBgFiles.size() >= r4.XOIX()) goto L14;
        boolean r5 = true;
    L15:
        r11.setEnabled(r5);
        ViewGroup r12 = getAddBg();
        X1XX1O r6 = this.mCustomWatchFace;
        if (r6 != null) goto L19;
        Intrinsics.XXO("mCustomWatchFace");
        r6 = null;
    L19:
        if (r6.O1() == false) goto L21;
        int r7 = R.drawable.shape_custom_dial_add_bg;
    L22:
        r12.setBackgroundResource(r7);
        CommonAdapter<String> r13 = this.rvBgAdapter;
        if (r13 != null) goto L25;
        Intrinsics.XXO("rvBgAdapter");
    L26:
        r2.notifyDataSetChanged();
        return;
    L25:
        r2 = r13;
        goto L26
    L21:
        r7 = R.drawable.shape_custom_dial_add_bg_r;
        goto L22
    L14:
        r5 = false;
        goto L15
    L8:
        if (r8 >= this.mBgFiles.size()) goto L10;
        r9 = ImageUtils.getBitmap(this.mBgFiles.get(r8));
        goto L11
    }

    public static /* synthetic */ void showRvBg$default(WatchFaceCustomActivity r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        r0.showRvBg(r1);
    }

    private final void syncFailed(int r2) {
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.mProgressPop = null;
        ToastUtils.showLong(OOX00.OXO1.iO(r2), new Object[0]);
    }

    public static /* synthetic */ void syncFailed$default(WatchFaceCustomActivity r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        r0.syncFailed(r1);
    }

    private final void syncWatchFace() {
        if (this.mProgressPop != null) goto L9;
        int r3 = 0;
        c72 r0 = new c72(this, r3, 2, null);
        r0.I1(R.string.dial_generated_start);
        r0.OX(0);
        this.mProgressPop = r0;
        r0.IIX1OXO();
        c72 r1 = this.mProgressPop;
        if (r1 == null) goto L7;
        r1.I1(R.string.dial_generated_sync);
    L7:
        new Thread(new jn6(this)).start();
        return;
    }

    private static final void syncWatchFace$lambda$1(WatchFaceCustomActivity r8) {
        X1XX1O r0 = r8.mCustomWatchFace;
        X1XX1O r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L6:
        if (r8.mBgFiles.size() <= 1) goto L8;
        List<String> r3 = r8.mBgFiles;
    L9:
        r0.Oiii(r3);
        X1XX1O r2 = r8.mCustomWatchFace;
        if (r2 != null) goto L12;
        Intrinsics.XXO("mCustomWatchFace");
    L13:
        byte[] r4 = r1.IO();
        r8.mCurSendBytes = r4;
        sz0 r5 = sz0.OXO1;
        File r6 = uz0.i010I(r5);
        File r7 = uz0.X11iII1O1(r5);
        BleCache r9 = BleCache.INSTANCE;
        FileUtils.copy(r6, new File(r7, r9.getMPrototype() + IiXI1X1OO.O00 + r9.getMBleName() + IiXI1X1OO.O00 + r8.mCurSyncDialId + ".png"));
        int r10 = r8.mCurSyncDevicePosition;
        int r11 = r4.length;
        StringBuilder r12 = new StringBuilder();
        r12.append(r10);
        r12.append(" Custom WatchFace bytes size  ");
        r12.append(r11);
        LogUtils.d(new Object[]{r12.toString()});
        BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, r4, r8.mCurSyncDevicePosition);
        return;
    L12:
        r1 = r2;
        goto L13
    L8:
        r3 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    private static final TabLayout table_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    private static final DialElementView timeDigitalView_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (DialElementView) r1.findViewById(R.id.timeDigitalView);
    }

    private static final ImageView timePointView_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (ImageView) r1.findViewById(R.id.timePointView);
    }

    private static final ImageView timeScaleView_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (ImageView) r1.findViewById(R.id.timeScaleView);
    }

    private final void toCropPic(Uri r11) {
        X1XX1O r0 = this.mCustomWatchFace;
        X1XX1O r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L5:
        int r2 = r0.X00O0();
        X1XX1O r3 = this.mCustomWatchFace;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
    L9:
        int r4 = r1.Xi1i0XOX0();
        if (r2 >= 320) goto L12;
        r2 = r2 * 2;
        r4 = r4 * 2;
    L12:
        int r8 = r2;
        int r9 = r4;
        i1O0OXO1O.OXO1.OXO1("toCropPic outputX:" + r8 + " outputY:" + r9 + " " + r11);
        getMCrop().O00(r11, 1.0d, ((double) r8) / ((double) r9), r8, r9);
        return;
    L8:
        r1 = r3;
        goto L9
    }

    private final Bitmap toRound(Bitmap r4) {
        X1XX1O r0 = this.mCustomWatchFace;
        X1XX1O r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L6:
        if (r0.O1() == false) goto L9;
        Bitmap r5 = ImageUtils.toRound(r4);
        Intrinsics.XXI(r5);
        return r5;
    L9:
        X1XX1O r2 = this.mCustomWatchFace;
        if (r2 != null) goto L12;
        Intrinsics.XXO("mCustomWatchFace");
    L13:
        Bitmap r6 = ImageUtils.toRoundCorner(r4, r1.iXi());
        Intrinsics.XXI(r6);
        return r6;
    L12:
        r1 = r2;
        goto L13
    }

    private static final TextView tvBgTitle_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_bg_title);
    }

    private static final CardView watchfaceView_delegate$lambda$0(WatchFaceCustomActivity r1) {
        return (CardView) r1.findViewById(R.id.watchface_view);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(R.string.dial_customize);
        getMCrop().XXI(this, new ln6(this));
        initWatchfaceView();
        initBgView();
        showRvBg$default(this, 0, 1, null);
        initElementView();
        String r0 = getIntent().getStringExtra("bgFile");
        this.mAiBgFile = r0;
        if (r0 == null) goto L6;
        Uri r1 = Uri.fromFile(new File(this.mAiBgFile));
        Intrinsics.O10IXXX0X(r1, "fromFile(...)");
        toCropPic(r1);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_watchface_custom;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r13, int r14, @tb1 Intent r15) {
        super.onActivityResult(r13, r14, r15);
        X1XX1O r0 = null;
        if (r15 == null) goto L5;
        Uri r1 = r15.getData();
    L6:
        LogUtils.d(new Object[]{"onActivityResult " + r13 + " " + r14 + " " + r1});
        X1XX1O r2 = this.mCustomWatchFace;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mCustomWatchFace");
        r2 = null;
    L9:
        int r3 = r2.X00O0();
        X1XX1O r4 = this.mCustomWatchFace;
        if (r4 != null) goto L12;
        Intrinsics.XXO("mCustomWatchFace");
    L13:
        int r5 = r0.Xi1i0XOX0();
        if (r3 >= 320) goto L16;
        r3 = r3 * 2;
        r5 = r5 * 2;
    L16:
        int r11 = r5;
        int r10 = r3;
        LogUtils.d(new Object[]{"onActivityResult outputX:" + r10 + " outputY:" + r11});
        getMCrop().XOO0ii0(r13, r14, r15, 1.0d, ((double) r10) / ((double) r11), r10, r11);
        return;
    L12:
        r0 = r4;
        goto L13
    L5:
        r1 = null;
        goto L6
    }

    public final void onAddBg(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
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
        if (this.mProgressPop == null) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    public final void onReset(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        getControlViewStep().setVisibility(8);
        getControlViewHr().setVisibility(8);
        getControlViewCa().setVisibility(8);
        getControlViewDis().setVisibility(8);
        getTimeDigitalView().setVisibility(8);
        getTimePointView().setVisibility(8);
        getTimeScaleView().setVisibility(8);
        ControlElementFragment r5 = this.controlElementFragment;
        ControlElementFragment r1 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("controlElementFragment");
        r5 = null;
    L5:
        r5.getDialSelectStatus0().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment r6 = this.controlElementFragment;
        if (r6 != null) goto L8;
        Intrinsics.XXO("controlElementFragment");
        r6 = null;
    L8:
        r6.getDialSelectStatus1().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment r7 = this.controlElementFragment;
        if (r7 != null) goto L11;
        Intrinsics.XXO("controlElementFragment");
        r7 = null;
    L11:
        r7.getDialSelectStatus2().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment r8 = this.controlElementFragment;
        if (r8 != null) goto L14;
        Intrinsics.XXO("controlElementFragment");
        r8 = null;
    L14:
        r8.getDialSelectStatus3().setImageResource(R.drawable.ic_watchface_element_add);
        this.mBgFiles.clear();
        showRvBg$default(this, 0, 1, null);
        PointerElementFragment r9 = this.pointerElementFragment;
        if (r9 != null) goto L17;
        Intrinsics.XXO("pointerElementFragment");
        r9 = null;
    L17:
        r9.reset();
        TimeElementFragment r10 = this.timeElementFragment;
        if (r10 != null) goto L20;
        Intrinsics.XXO("timeElementFragment");
        r10 = null;
    L20:
        r10.reset();
        ControlElementFragment r11 = this.controlElementFragment;
        if (r11 != null) goto L23;
        Intrinsics.XXO("controlElementFragment");
    L24:
        r1.reset();
        return;
    L23:
        r1 = r11;
        goto L24
    }

    public final void onSycn(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        this.mCurSyncDevicePosition = 0;
        this.mCurSyncDialId = 10000000;
        syncWatchFace();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mProgressPop == null) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }
}
