package com.sma.smartv3.otherdevice.charge;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.C2229at;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXO000;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.appintro.indicator.DotIndicatorController;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.otherdevice.charge.ChargeMainActivity;
import com.sma.smartv3.p610ui.device.EBookManagerActivity;
import com.sma.smartv3.p610ui.device.EarphoneKeySettingsActivity;
import com.sma.smartv3.p610ui.device.FirmwareRepairSearchActivity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeJSmaActivity;
import com.sma.smartv3.p610ui.device.MemoryManagerActivity;
import com.sma.smartv3.p610ui.device.MultiDeviceManagerActivity;
import com.sma.smartv3.p610ui.device.MusicManagerV2Activity;
import com.sma.smartv3.p610ui.device.NotificationSettingsActivity;
import com.sma.smartv3.p610ui.device.VoiceActivity;
import com.sma.smartv3.p610ui.device.VoiceSetActivity;
import com.sma.smartv3.p610ui.main.MainActivity;
import com.sma.smartv3.p610ui.p612me.PermissionSettingsActivity;
import com.sma.smartv3.p610ui.p612me.SettingsActivity;
import com.sma.smartv3.p610ui.translate.SparkChainMultiDeviceActivity;
import com.sma.smartv3.p610ui.translate.SparkChainSimultaneousActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ArcProgressBar;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.ScaleSeekBar;
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
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nChargeMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1136:1\n27#2:1137\n27#2:1138\n69#3,3:1139\n72#3,5:1143\n69#3,3:1148\n72#3,5:1152\n69#3,3:1157\n72#3,5:1161\n69#3,3:1166\n72#3,5:1170\n69#3,3:1175\n72#3,5:1179\n69#3,3:1184\n72#3,5:1188\n69#3,3:1193\n72#3,5:1197\n69#3,3:1204\n72#3,5:1208\n140#3,5:1213\n145#3,5:1219\n69#3,3:1224\n72#3,5:1228\n69#3,3:1233\n72#3,5:1237\n69#3,3:1242\n72#3,5:1246\n69#3,3:1251\n72#3,5:1255\n69#3,3:1260\n72#3,5:1264\n69#3,3:1269\n72#3,5:1273\n69#3,3:1278\n72#3,5:1282\n69#3,3:1287\n72#3,5:1291\n87#3,7:1296\n94#3,3:1304\n70#3,7:1307\n97#3:1314\n87#3,7:1315\n94#3,3:1323\n70#3,7:1326\n97#3:1333\n1#4:1142\n1#4:1151\n1#4:1160\n1#4:1169\n1#4:1178\n1#4:1187\n1#4:1196\n1#4:1207\n1#4:1218\n1#4:1227\n1#4:1236\n1#4:1245\n1#4:1254\n1#4:1263\n1#4:1272\n1#4:1281\n1#4:1290\n1#4:1303\n1#4:1322\n11#5,2:1202\n*S KotlinDebug\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity\n*L\n487#1:1137\n500#1:1138\n877#1:1139,3\n877#1:1143,5\n922#1:1148,3\n922#1:1152,5\n962#1:1157,3\n962#1:1161,5\n1007#1:1166,3\n1007#1:1170,5\n1011#1:1175,3\n1011#1:1179,5\n1110#1:1184,3\n1110#1:1188,5\n1114#1:1193,3\n1114#1:1197,5\n1133#1:1204,3\n1133#1:1208,5\n381#1:1213,5\n381#1:1219,5\n967#1:1224,3\n967#1:1228,5\n973#1:1233,3\n973#1:1237,5\n997#1:1242,3\n997#1:1246,5\n1000#1:1251,3\n1000#1:1255,5\n991#1:1260,3\n991#1:1264,5\n993#1:1269,3\n993#1:1273,5\n1021#1:1278,3\n1021#1:1282,5\n1027#1:1287,3\n1027#1:1291,5\n1033#1:1296,7\n1033#1:1304,3\n1033#1:1307,7\n1033#1:1314\n1039#1:1315,7\n1039#1:1323,3\n1039#1:1326,7\n1039#1:1333\n877#1:1142\n922#1:1151\n962#1:1160\n1007#1:1169\n1011#1:1178\n1110#1:1187\n1114#1:1196\n1133#1:1207\n381#1:1218\n967#1:1227\n973#1:1236\n997#1:1245\n1000#1:1254\n991#1:1263\n993#1:1272\n1021#1:1281\n1027#1:1290\n1033#1:1303\n1039#1:1322\n1132#1:1202,2\n*E\n"})
public final class ChargeMainActivity extends BaseChargeActivity {

    @tb1
    private TimerTask autoDataSync;
    private boolean isShow;
    private long lastClickTime;

    @tb1
    private go0 mNotificationPopup;

    @tb1
    private c72 mProgressPop;

    @tb1
    private IXO000 mScreensaver;

    @tb1
    private xz3 mSelectAvatarPopup;

    @tb1
    private Timer timer;

    @aa1
    private final String TAG = "ChargeMain";

    @aa1
    private final Lazy refreshLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i10OXi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.refreshLayout_delegate$lambda$0(this.f7512IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO01OIXIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.abhTitleRight_delegate$lambda$0(this.f4653IO);
        }
    });

    @aa1
    private final Lazy viewPager$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIOOiIIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.viewPager_delegate$lambda$0(this.f7879IO);
        }
    });

    @aa1
    private final Lazy viewPagerMain$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1O0OXii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.viewPagerMain_delegate$lambda$0(this.f7607IO);
        }
    });

    @aa1
    private final Lazy viewPagerEarPhone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0iI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.viewPagerEarPhone_delegate$lambda$0(this.f8013IO);
        }
    });

    @aa1
    private DeviceType mCurDeviceType = DeviceType.CHARGE;

    @aa1
    private final Lazy chargePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1IXii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.chargePanel_delegate$lambda$0(this.f1397IO);
        }
    });

    @aa1
    private final Lazy earphonePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1Xii1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.earphonePanel_delegate$lambda$0(this.f2823IO);
        }
    });

    @aa1
    private final Lazy itemChargeBind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I100I1Iii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemChargeBind_delegate$lambda$0(this.f1291IO);
        }
    });

    @aa1
    private final Lazy itemEarphoneBind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXXOIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemEarphoneBind_delegate$lambda$0(this.f5137IO);
        }
    });

    @aa1
    private final Lazy indicatorContainer$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.indicatorContainer_delegate$lambda$0(this.f1019IO);
        }
    });

    @aa1
    private final Lazy indicatorController$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIiIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.indicatorController_delegate$lambda$0(this.f3085IO);
        }
    });

    @aa1
    private final Lazy pbPower$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0101OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.pbPower_delegate$lambda$0(this.f3900IO);
        }
    });

    @aa1
    private final Lazy tvPower$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X000O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvPower_delegate$lambda$0(this.f3852IO);
        }
    });

    @aa1
    private final Lazy tvState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OO11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvState_delegate$lambda$0(this.f7626IO);
        }
    });

    @aa1
    private final Handler handler = new Handler();

    @aa1
    private final Lazy switchStatusRunnable$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1II1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.switchStatusRunnable_delegate$lambda$0(this.f7821IO);
        }
    });

    @aa1
    private final Lazy pbRightPower$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.pbRightPower_delegate$lambda$0(this.f1902IO);
        }
    });

    @aa1
    private final Lazy tvRightPower$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXIOX10O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvRightPower_delegate$lambda$0(this.f8325IO);
        }
    });

    @aa1
    private final Lazy pbLeftPower$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXX011Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.pbLeftPower_delegate$lambda$0(this.f8381IO);
        }
    });

    @aa1
    private final Lazy tvLeftPower$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OII01XO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvLeftPower_delegate$lambda$0(this.f2943IO);
        }
    });

    @aa1
    private final Lazy seekbarLightness$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO1XOI0iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.seekbarLightness_delegate$lambda$0(this.f3196IO);
        }
    });

    @aa1
    private final Lazy tvLow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00IIiI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvLow_delegate$lambda$0(this.f1017IO);
        }
    });

    @aa1
    private final Lazy tvMiddle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0IX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvMiddle_delegate$lambda$0(this.f2458IO);
        }
    });

    @aa1
    private final Lazy tvHigh$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O110iXOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvHigh_delegate$lambda$0(this.f2657IO);
        }
    });

    @aa1
    private final Lazy llScreensaver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiO011O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.llScreensaver_delegate$lambda$0(this.f8596IO);
        }
    });

    @aa1
    private final Lazy mScreensaverPics$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXI0OO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.mScreensaverPics_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy tvScreensaverValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii1iO0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvScreensaverValue_delegate$lambda$0(this.f2219IO);
        }
    });

    @aa1
    private final Lazy seekbarScreensaver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xiii10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.seekbarScreensaver_delegate$lambda$0(this.f5380IO);
        }
    });

    @aa1
    private final Lazy ivScreensaver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I111I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.ivScreensaver_delegate$lambda$0(this.f1343IO);
        }
    });

    @aa1
    private final Lazy addScreensaver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiXX0O0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.addScreensaver_delegate$lambda$0(this.f8647IO);
        }
    });

    @aa1
    private final Lazy rvScreensaver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO0I1XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.rvScreensaver_delegate$lambda$0(this.f1720IO);
        }
    });

    @aa1
    private final Lazy itemMusicManager$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOO0Xi0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemMusicManager_delegate$lambda$0(this.f1823IO);
        }
    });

    @aa1
    private final Lazy itemEBookManager$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1X10i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemEBookManager_delegate$lambda$0(this.f2779IO);
        }
    });

    @aa1
    private final Lazy itemVoiceAssistant$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXXI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemVoiceAssistant_delegate$lambda$0(this.f8394IO);
        }
    });

    @aa1
    private final Lazy itemTranslationLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0X0111
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemTranslationLayout_delegate$lambda$0(this.f7998IO);
        }
    });

    @aa1
    private final Lazy itemDialogueTranslationLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiIX11O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemDialogueTranslationLayout_delegate$lambda$0(this.f5269IO);
        }
    });

    @aa1
    private final Lazy itemSimultaneousTranslationLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.itemSimultaneousTranslationLayout_delegate$lambda$0(this.f2382IO);
        }
    });

    @aa1
    private final Lazy mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0011
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.mCrop_delegate$lambda$0(this.f3859IO);
        }
    });

    @aa1
    private final XO0O10 mBleHandleCallback = new XO0O10();

    @aa1
    private final Lazy checkCall$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1OX0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.checkCall_delegate$lambda$0(this.f3680IO);
        }
    });

    @aa1
    private final Lazy llNoiseSettings$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXIX0O1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.llNoiseSettings_delegate$lambda$0(this.f5034IO);
        }
    });

    @aa1
    private final Lazy ivDenoise$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX0i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.ivDenoise_delegate$lambda$0(this.f8250IO);
        }
    });

    @aa1
    private final Lazy ivNoiseClose$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXiO1O0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.ivNoiseClose_delegate$lambda$0(this.f8441IO);
        }
    });

    @aa1
    private final Lazy ivNoiseTrans$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX01O1X1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.ivNoiseTrans_delegate$lambda$0(this.f4932IO);
        }
    });

    @aa1
    private final Lazy tvDenoise$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1i0Oii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvDenoise_delegate$lambda$0(this.f8048IO);
        }
    });

    @aa1
    private final Lazy tvNoiseClose$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXX1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvNoiseClose_delegate$lambda$0(this.f2093IO);
        }
    });

    @aa1
    private final Lazy tvNoiseTrans$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1110XXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.tvNoiseTrans_delegate$lambda$0(this.f7533IO);
        }
    });

    @aa1
    private final Lazy checkFindEarphoneLeft$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiII0i11X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.checkFindEarphoneLeft_delegate$lambda$0(this.f5255IO);
        }
    });

    @aa1
    private final Lazy checkFindEarphoneRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XiiX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChargeMainActivity.checkFindEarphoneRight_delegate$lambda$0(this.f1470IO);
        }
    });

    @aa1
    private BleEarphoneAncSettings mEarphoneAncSettings = (BleEarphoneAncSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_ANC_SET, BleEarphoneAncSettings.class, null, null, 12, null);

    public enum DeviceType {
        CHARGE,
        EARPHONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<DeviceType> getEntries() {
            return $ENTRIES;
        }
    }

    @SourceDebugExtension({"SMAP\nChargeMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1136:1\n69#2,3:1137\n72#2,5:1141\n1#3:1140\n*S KotlinDebug\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n*L\n946#1:1137,3\n946#1:1141,5\n946#1:1140\n*E\n"})
    public static final class IiI10X implements O0Oiii<FirmwareVersion> {
        public IiI10X() {
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onSuccess(FirmwareVersion firmwareVersion) {
            if (q62.OXO1.I0i0()) {
                DeviceInfoChecker.OXO1.IiI10X(ChargeMainActivity.this);
            } else {
                ChargeMainActivity chargeMainActivity = ChargeMainActivity.this;
                chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) FirmwareUpgradeJSmaActivity.class));
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            ToastUtils.showLong(R.string.already_the_latest_version);
        }
    }

    public static final class O00 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;

        public O00() {
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
            xz3 xz3Var = ChargeMainActivity.this.mSelectAvatarPopup;
            if (xz3Var != null) {
                xz3Var.dismiss();
            }
            sz0 sz0Var = sz0.OXO1;
            if (uz0.XiOIii1(sz0Var).exists()) {
                Bitmap bitmap = ImageUtils.getBitmap(uz0.XiOIii1(sz0Var));
                IXO000 ixo000 = ChargeMainActivity.this.mScreensaver;
                if (ixo000 != null) {
                    Intrinsics.XXI(bitmap);
                    ixo000.I0iXXO(bitmap);
                }
                ChargeMainActivity.this.syncScreensaver();
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    public static final class OXO1 extends TimerTask {
        public OXO1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (ChargeMainActivity.this.getRefreshLayout().isRefreshing() || !BleConnector.INSTANCE.isAvailable()) {
                return;
            }
            ChargeMainActivity.this.syncInfo();
        }
    }

    public static final class XIi00iiXO implements SeekBar.OnSeekBarChangeListener {
        public XIi00iiXO() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ChargeMainActivity.this.getTvLow().setEnabled(false);
            ChargeMainActivity.this.getTvMiddle().setEnabled(false);
            ChargeMainActivity.this.getTvHigh().setEnabled(false);
            if (i == 0) {
                ChargeMainActivity.this.getSeekbarLightness().setProgress(1);
                ChargeMainActivity.this.getTvLow().setEnabled(true);
                BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            } else if (i == 1) {
                ChargeMainActivity.this.getTvLow().setEnabled(true);
                BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            } else if (i == 2) {
                ChargeMainActivity.this.getTvMiddle().setEnabled(true);
                BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 2, false, false, 24, null);
            } else {
                if (i != 3) {
                    return;
                }
                ChargeMainActivity.this.getTvHigh().setEnabled(true);
                BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 4, false, false, 24, null);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class XO0O10 implements BleHandleCallback {
        public XO0O10() {
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
                ChargeMainActivity.this.syncFailed();
            } else if (bleKey == BleKey.POWER) {
                ChargeMainActivity.this.syncDone();
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
        public void onDeviceConnecting(boolean z) {
            if (z && ChargeMainActivity.this.mCurDeviceType == DeviceType.CHARGE) {
                ChargeMainActivity.this.getTvState().setText(R.string.device_connecting);
            }
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
        public void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings earphoneAncSettings) {
            Intrinsics.X0O(earphoneAncSettings, "earphoneAncSettings");
            ChargeMainActivity.this.mEarphoneAncSettings = earphoneAncSettings;
            ChargeMainActivity chargeMainActivity = ChargeMainActivity.this;
            chargeMainActivity.showNoiseSetTab(chargeMainActivity.mEarphoneAncSettings.getMMode());
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onEarphoneCallUpdate(int i) {
            ChargeMainActivity.this.initCall();
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
        public void onEarphoneStateUpdate(BleEarphoneState earphoneState) {
            Intrinsics.X0O(earphoneState, "earphoneState");
            ChargeMainActivity.this.syncDone();
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
        public void onFindEarphoneUpdate(BleFindEarphone findEarphone) {
            Intrinsics.X0O(findEarphone, "findEarphone");
            ChargeMainActivity.this.initFindEarphone();
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
        public void onReadEarphoneAncSettings(BleEarphoneAncSettings earphoneAncSettings) {
            Intrinsics.X0O(earphoneAncSettings, "earphoneAncSettings");
            ChargeMainActivity.this.mEarphoneAncSettings = earphoneAncSettings;
            ChargeMainActivity chargeMainActivity = ChargeMainActivity.this;
            chargeMainActivity.showNoiseSetTab(chargeMainActivity.mEarphoneAncSettings.getMMode());
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphoneCall(int i) {
            ChargeMainActivity.this.initCall();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo bleEarphoneInfo) {
            super.onReadEarphoneInfo(bleEarphoneInfo);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphoneKey(BleEarphoneKey earphoneKey) {
            Intrinsics.X0O(earphoneKey, "earphoneKey");
            ChargeMainActivity.this.initNoiseSet();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphonePower(BleEarphonePower earphonePower) {
            Intrinsics.X0O(earphonePower, "earphonePower");
            ChargeMainActivity.this.syncDone();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings) {
            super.onReadEarphoneSoundEffectsSettings(bleEarphoneSoundEffectsSettings);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphoneState(BleEarphoneState earphoneState) {
            Intrinsics.X0O(earphoneState, "earphoneState");
            ChargeMainActivity.this.syncDone();
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
        public void onReadPower(int i) {
            ChargeMainActivity.this.syncDone();
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
        public void onReadSDCardInfo(BleSDCardInfo sdCardInfo) {
            Intrinsics.X0O(sdCardInfo, "sdCardInfo");
            ChargeMainActivity.this.syncDone();
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
        public void onReadScreenBrightnessSet(int i) {
            ChargeMainActivity.this.initLightness();
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
        public void onScreenBrightnessSetUpdate(int i) {
            ChargeMainActivity.this.initLightness();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean z) {
            LogUtils.m11128d("onSessionStateChange " + z);
            c72 c72Var = ChargeMainActivity.this.mProgressPop;
            if (c72Var != null) {
                c72Var.dismiss();
            }
            ChargeMainActivity.this.mProgressPop = null;
            if (!z) {
                ChargeMainActivity.this.handler.postDelayed(ChargeMainActivity.this.getSwitchStatusRunnable(), 10000L);
                return;
            }
            ChargeMainActivity.this.handler.removeCallbacks(ChargeMainActivity.this.getSwitchStatusRunnable());
            ChargeMainActivity.this.getTvState().setText(R.string.device_connectied);
            if (!ChargeMainActivity.this.getRefreshLayout().isRefreshing() && !BleInitializer.f51208IO.m38232OI()) {
                ChargeMainActivity.this.autoSyncData(2000L);
            }
            BleConnector bleConnector = BleConnector.INSTANCE;
            BleKey bleKey = BleKey.EARPHONE_ANC_SET;
            BleKeyFlag bleKeyFlag = BleKeyFlag.READ;
            BaseBleConnector.sendData$default(bleConnector, bleKey, bleKeyFlag, null, false, false, 28, null);
            BaseBleConnector.sendData$default(bleConnector, BleKey.SCREEN_BRIGHTNESS_SET, bleKeyFlag, null, false, false, 28, null);
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
                ChargeMainActivity.this.syncFailed();
                return;
            }
            c72 c72Var = ChargeMainActivity.this.mProgressPop;
            if (c72Var != null) {
                c72Var.m1592OX((int) ((i3 / i2) * 100));
            }
            if (i2 == i3) {
                c72 c72Var2 = ChargeMainActivity.this.mProgressPop;
                if (c72Var2 != null) {
                    c72Var2.dismiss();
                }
                ChargeMainActivity.this.mProgressPop = null;
                ToastUtils.showLong(R.string.synced);
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

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.ChargeMainActivity$iO */
    public static final class C18629iO implements SeekBar.OnSeekBarChangeListener {
        public C18629iO() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ChargeMainActivity.this.getTvScreensaverValue().setText(ChargeMainActivity.this.getString(R.string.d_s, Integer.valueOf(i + 3)));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.BACK_LIGHT, BleKeyFlag.UPDATE, ChargeMainActivity.this.getSeekbarScreensaver().getProgress() + 3, false, false, 24, null);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.ChargeMainActivity$initScreensaver$3 */
    public static final class C186303 extends CommonAdapter<ResourcesIdInfo> {
        public C186303(List<ResourcesIdInfo> list) {
            super(ChargeMainActivity.this, R.layout.item_charge_screensaver_select, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C186303 c186303, ResourcesIdInfo resourcesIdInfo, ChargeMainActivity chargeMainActivity, int i, View view) {
            Iterator it = ((CommonAdapter) c186303).mDatas.iterator();
            while (it.hasNext()) {
                ((ResourcesIdInfo) it.next()).setSelect(false);
            }
            resourcesIdInfo.setSelect(true);
            chargeMainActivity.getIvScreensaver().setImageResource(((ResourcesIdInfo) chargeMainActivity.getMScreensaverPics().get(i)).getResId());
            chargeMainActivity.syncScreensaver();
            c186303.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            ((ImageView) holder.getView(R.id.f51417iv)).setImageResource(resourcesIdInfo.getResId());
            ImageView imageView = (ImageView) holder.getView(R.id.f51417iv);
            final ChargeMainActivity chargeMainActivity = ChargeMainActivity.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O01001
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChargeMainActivity.C186303.convert$lambda$0(this.f2393IO, resourcesIdInfo, chargeMainActivity, i, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ImageView) chargeMainActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View addScreensaver_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.add_screensaver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoSyncData(long j) {
        initInfo();
        timerCancel();
        this.timer = new Timer(true);
        OXO1 oxo1 = new OXO1();
        this.autoDataSync = oxo1;
        Timer timer = this.timer;
        if (timer != null) {
            timer.schedule(oxo1, j);
        }
    }

    public static /* synthetic */ void autoSyncData$default(ChargeMainActivity chargeMainActivity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 20000;
        }
        chargeMainActivity.autoSyncData(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View chargePanel_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.charge_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkCall_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (CheckBox) chargeMainActivity.findViewById(R.id.check_call);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkFindEarphoneLeft_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (CheckBox) chargeMainActivity.findViewById(R.id.check_find_earphone_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkFindEarphoneRight_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (CheckBox) chargeMainActivity.findViewById(R.id.check_find_earphone_right);
    }

    private final boolean checkNotificationPermission() {
        boolean zO00 = MyNotificationListenerService.O001I.O00(this);
        if (!zO00) {
            if (this.mNotificationPopup == null) {
                final go0 go0Var = new go0(this, 0, 2, null);
                String string = getString(R.string.allow_notification_access, getString(R.string.app_name));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                go0Var.m1864iI(string);
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.IX1X1iIiX
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(ChargeMainActivity.checkNotificationPermission$lambda$0$0$0(go0Var));
                    }
                });
                this.mNotificationPopup = go0Var;
            }
            go0 go0Var2 = this.mNotificationPopup;
            if (go0Var2 != null) {
                go0Var2.IIX1OXO();
            }
        }
        return zO00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkNotificationPermission$lambda$0$0$0(go0 go0Var) {
        MyNotificationListenerService.O001I.I0IIOi(go0Var.XO0O10());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View earphonePanel_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.earphone_panel);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final View getAddScreensaver() {
        return (View) this.addScreensaver$delegate.getValue();
    }

    private final View getChargePanel() {
        return (View) this.chargePanel$delegate.getValue();
    }

    private final CheckBox getCheckCall() {
        return (CheckBox) this.checkCall$delegate.getValue();
    }

    private final CheckBox getCheckFindEarphoneLeft() {
        return (CheckBox) this.checkFindEarphoneLeft$delegate.getValue();
    }

    private final CheckBox getCheckFindEarphoneRight() {
        return (CheckBox) this.checkFindEarphoneRight$delegate.getValue();
    }

    private final View getEarphonePanel() {
        return (View) this.earphonePanel$delegate.getValue();
    }

    private final ViewGroup getIndicatorContainer() {
        return (ViewGroup) this.indicatorContainer$delegate.getValue();
    }

    private final DotIndicatorController getIndicatorController() {
        return (DotIndicatorController) this.indicatorController$delegate.getValue();
    }

    private final ViewGroup getItemChargeBind() {
        return (ViewGroup) this.itemChargeBind$delegate.getValue();
    }

    private final View getItemDialogueTranslationLayout() {
        return (View) this.itemDialogueTranslationLayout$delegate.getValue();
    }

    private final View getItemEBookManager() {
        return (View) this.itemEBookManager$delegate.getValue();
    }

    private final ViewGroup getItemEarphoneBind() {
        return (ViewGroup) this.itemEarphoneBind$delegate.getValue();
    }

    private final View getItemMusicManager() {
        return (View) this.itemMusicManager$delegate.getValue();
    }

    private final View getItemSimultaneousTranslationLayout() {
        return (View) this.itemSimultaneousTranslationLayout$delegate.getValue();
    }

    private final View getItemTranslationLayout() {
        return (View) this.itemTranslationLayout$delegate.getValue();
    }

    private final View getItemVoiceAssistant() {
        return (View) this.itemVoiceAssistant$delegate.getValue();
    }

    private final ImageView getIvDenoise() {
        return (ImageView) this.ivDenoise$delegate.getValue();
    }

    private final ImageView getIvNoiseClose() {
        return (ImageView) this.ivNoiseClose$delegate.getValue();
    }

    private final ImageView getIvNoiseTrans() {
        return (ImageView) this.ivNoiseTrans$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageViewRound getIvScreensaver() {
        return (ImageViewRound) this.ivScreensaver$delegate.getValue();
    }

    private final View getLlNoiseSettings() {
        return (View) this.llNoiseSettings$delegate.getValue();
    }

    private final View getLlScreensaver() {
        return (View) this.llScreensaver$delegate.getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ResourcesIdInfo> getMScreensaverPics() {
        return (List) this.mScreensaverPics$delegate.getValue();
    }

    private final ArcProgressBar getPbLeftPower() {
        return (ArcProgressBar) this.pbLeftPower$delegate.getValue();
    }

    private final ArcProgressBar getPbPower() {
        return (ArcProgressBar) this.pbPower$delegate.getValue();
    }

    private final ArcProgressBar getPbRightPower() {
        return (ArcProgressBar) this.pbRightPower$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwipeRefreshLayout getRefreshLayout() {
        return (SwipeRefreshLayout) this.refreshLayout$delegate.getValue();
    }

    private final RecyclerView getRvScreensaver() {
        return (RecyclerView) this.rvScreensaver$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScaleSeekBar getSeekbarLightness() {
        return (ScaleSeekBar) this.seekbarLightness$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SeekBar getSeekbarScreensaver() {
        return (SeekBar) this.seekbarScreensaver$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable getSwitchStatusRunnable() {
        return (Runnable) this.switchStatusRunnable$delegate.getValue();
    }

    private final TextView getTvDenoise() {
        return (TextView) this.tvDenoise$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvHigh() {
        return (TextView) this.tvHigh$delegate.getValue();
    }

    private final TextView getTvLeftPower() {
        return (TextView) this.tvLeftPower$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvLow() {
        return (TextView) this.tvLow$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvMiddle() {
        return (TextView) this.tvMiddle$delegate.getValue();
    }

    private final TextView getTvNoiseClose() {
        return (TextView) this.tvNoiseClose$delegate.getValue();
    }

    private final TextView getTvNoiseTrans() {
        return (TextView) this.tvNoiseTrans$delegate.getValue();
    }

    private final TextView getTvPower() {
        return (TextView) this.tvPower$delegate.getValue();
    }

    private final TextView getTvRightPower() {
        return (TextView) this.tvRightPower$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvScreensaverValue() {
        return (TextView) this.tvScreensaverValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvState() {
        return (TextView) this.tvState$delegate.getValue();
    }

    private final ViewPager getViewPager() {
        return (ViewPager) this.viewPager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewPagerEarPhone() {
        return (View) this.viewPagerEarPhone$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewPagerMain() {
        return (View) this.viewPagerMain$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup indicatorContainer_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ViewGroup) chargeMainActivity.findViewById(R.id.indicator_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DotIndicatorController indicatorController_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return new DotIndicatorController(chargeMainActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCall() {
        getCheckCall().setChecked(OiOX0i.XIi00iiXO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.EARPHONE_CALL, 0, null, 6, null)));
        getCheckCall().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.iOX0XX
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChargeMainActivity.initCall$lambda$0(compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCall$lambda$0(CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.EARPHONE_CALL, BleKeyFlag.UPDATE, OiOX0i.m1037iO(z), false, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initFindEarphone() {
        BleFindEarphone bleFindEarphone = (BleFindEarphone) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.FIND_EARPHONE, BleFindEarphone.class, null, null, 12, null);
        getCheckFindEarphoneLeft().setChecked(bleFindEarphone.getMLeft() == 1);
        ViewParent parent = getCheckFindEarphoneLeft().getParent();
        Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O10XI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChargeMainActivity.initFindEarphone$lambda$0(this.f2636IO, view);
            }
        });
        getCheckFindEarphoneRight().setChecked(bleFindEarphone.getMRight() == 1);
        ViewParent parent2 = getCheckFindEarphoneRight().getParent();
        Intrinsics.X1ii(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent2).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I00I0X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChargeMainActivity.initFindEarphone$lambda$1(this.f1014IO, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFindEarphone$lambda$0(ChargeMainActivity chargeMainActivity, View view) {
        BleEarphoneState bleEarphoneState = (BleEarphoneState) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_STATE, BleEarphoneState.class, null, 4, null);
        if (bleEarphoneState == null || bleEarphoneState.getMLeftState() != 1) {
            ToastUtils.showShort(R.string.not_connected);
            return;
        }
        chargeMainActivity.getCheckFindEarphoneLeft().setChecked(true ^ chargeMainActivity.getCheckFindEarphoneLeft().isChecked());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FIND_EARPHONE, BleKeyFlag.UPDATE, new BleFindEarphone(OiOX0i.m1037iO(chargeMainActivity.getCheckFindEarphoneLeft().isChecked()), OiOX0i.m1037iO(chargeMainActivity.getCheckFindEarphoneRight().isChecked())), false, false, 24, null);
        if (chargeMainActivity.getCheckFindEarphoneLeft().isChecked()) {
            ToastUtils.showLong(chargeMainActivity.getString(R.string.find_earphone_on), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFindEarphone$lambda$1(ChargeMainActivity chargeMainActivity, View view) {
        BleEarphoneState bleEarphoneState = (BleEarphoneState) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_STATE, BleEarphoneState.class, null, 4, null);
        if (bleEarphoneState == null || bleEarphoneState.getMRightState() != 1) {
            ToastUtils.showShort(R.string.not_connected);
            return;
        }
        chargeMainActivity.getCheckFindEarphoneRight().setChecked(true ^ chargeMainActivity.getCheckFindEarphoneRight().isChecked());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FIND_EARPHONE, BleKeyFlag.UPDATE, new BleFindEarphone(OiOX0i.m1037iO(chargeMainActivity.getCheckFindEarphoneLeft().isChecked()), OiOX0i.m1037iO(chargeMainActivity.getCheckFindEarphoneRight().isChecked())), false, false, 24, null);
        if (chargeMainActivity.getCheckFindEarphoneRight().isChecked()) {
            ToastUtils.showLong(chargeMainActivity.getString(R.string.find_earphone_on), new Object[0]);
        }
    }

    private final void initIndicator() {
        getIndicatorContainer().addView(getIndicatorController().newInstance(this));
        getIndicatorController().initialize(2);
        getIndicatorController().setUnselectedIndicatorColor(ContextCompat.getColor(this, R.color.charge_info_pb_bg_color));
        getIndicatorController().setSelectedIndicatorColor(ContextCompat.getColor(this, R.color.charge_info_pb_end_color));
    }

    private final void initInfo() {
        BleCache bleCache = BleCache.INSTANCE;
        int int$default = BaseBleCache.getInt$default(bleCache, BleKey.POWER, 0, null, 4, null);
        getTvPower().setText(getString(R.string.d_percent, Integer.valueOf(int$default)));
        getPbPower().m38873iO(int$default, 100);
        getPbLeftPower().setProgress(1.0f);
        getPbRightPower().setProgress(1.0f);
        BleEarphonePower bleEarphonePower = (BleEarphonePower) BaseBleCache.getObject$default(bleCache, BleKey.EARPHONE_POWER, BleEarphonePower.class, null, 4, null);
        if (bleEarphonePower != null) {
            getTvLeftPower().setText(getString(R.string.d_percent, Integer.valueOf(bleEarphonePower.getMLeftPower())));
            getPbLeftPower().m38873iO(bleEarphonePower.getMLeftPower(), 100);
            getTvRightPower().setText(getString(R.string.d_percent, Integer.valueOf(bleEarphonePower.getMRightPower())));
            getPbRightPower().m38873iO(bleEarphonePower.getMRightPower(), 100);
        }
        showCurDeviceState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLightness() {
        getSeekbarLightness().setOnSeekBarChangeListener(new XIi00iiXO());
        getSeekbarLightness().setProgress(valueToProgress(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, 0, null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNoiseSet() {
        getLlNoiseSettings().setVisibility(((BleEarphoneKey) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_KEY, BleEarphoneKey.class, null, null, 12, null)).getMType() == 1 ? 8 : 0);
    }

    private final void initScreensaver() {
        View llScreensaver = getLlScreensaver();
        q62 q62Var = q62.OXO1;
        llScreensaver.setVisibility(q62Var.m2888XX() ? 0 : 8);
        getAddScreensaver().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O0OXOO1I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2514IO.selectImagePopup();
            }
        });
        ImageViewRound ivScreensaver = getIvScreensaver();
        Intrinsics.O10IXXX0X(ivScreensaver, "<get-ivScreensaver>(...)");
        IXO000 ixo000 = new IXO000(this, ivScreensaver);
        this.mScreensaver = ixo000;
        Intrinsics.XXI(ixo000);
        float fIiI10X = ixo000.IiI10X();
        IXO000 ixo001 = this.mScreensaver;
        Intrinsics.XXI(ixo001);
        float fXOO0ii0 = (fIiI10X / ixo001.XOO0ii0()) * 110.0f;
        ImageViewRound ivScreensaver2 = getIvScreensaver();
        Intrinsics.O10IXXX0X(ivScreensaver2, "<get-ivScreensaver>(...)");
        LibExKt.i100IXOX(ivScreensaver2, SizeUtils.dp2px(110.0f), SizeUtils.dp2px(fXOO0ii0));
        ImageViewRound ivScreensaver3 = getIvScreensaver();
        IXO000 ixo002 = this.mScreensaver;
        Intrinsics.XXI(ixo002);
        ivScreensaver3.setRadius(SizeUtils.dp2px(ixo002.I0IIOi()));
        RecyclerView rvScreensaver = getRvScreensaver();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        rvScreensaver.setLayoutManager(linearLayoutManager);
        getRvScreensaver().setAdapter(new C186303(getMScreensaverPics()));
        int int$default = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.BACK_LIGHT, q62Var.XXX11i(), null, 4, null);
        getSeekbarScreensaver().setProgress(int$default - 3);
        getTvScreensaverValue().setText(getString(R.string.d_s, Integer.valueOf(int$default)));
        getSeekbarScreensaver().setOnSeekBarChangeListener(new C18629iO());
        DeviceInfoChecker.OXO1.m38093I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(ChargeMainActivity chargeMainActivity, View view) {
        chargeMainActivity.startActivityForResult(new Intent(chargeMainActivity, (Class<?>) MultiDeviceManagerActivity.class), 7);
    }

    private final void initViewPager() {
        getViewPager().setAdapter(new PagerAdapter() { // from class: com.sma.smartv3.otherdevice.charge.ChargeMainActivity.initViewPager.1
            @Override // androidx.viewpager.widget.PagerAdapter
            public void destroyItem(ViewGroup container, int i, Object object) {
                Intrinsics.X0O(container, "container");
                Intrinsics.X0O(object, "object");
                container.removeView((View) object);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return 2;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public Object instantiateItem(ViewGroup container, int i) {
                View viewPagerEarPhone;
                Intrinsics.X0O(container, "container");
                if (i == 0) {
                    container.addView(ChargeMainActivity.this.getViewPagerMain(), 0);
                    viewPagerEarPhone = ChargeMainActivity.this.getViewPagerMain();
                } else {
                    container.addView(ChargeMainActivity.this.getViewPagerEarPhone(), 0);
                    viewPagerEarPhone = ChargeMainActivity.this.getViewPagerEarPhone();
                }
                Intrinsics.XXI(viewPagerEarPhone);
                return viewPagerEarPhone;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(View view, Object object) {
                Intrinsics.X0O(view, "view");
                Intrinsics.X0O(object, "object");
                return Intrinsics.XOO0ii0(view, object);
            }
        });
        getViewPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sma.smartv3.otherdevice.charge.ChargeMainActivity.initViewPager.2
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ChargeMainActivity.this.mCurDeviceType = i == 0 ? DeviceType.CHARGE : DeviceType.EARPHONE;
                ChargeMainActivity chargeMainActivity = ChargeMainActivity.this;
                chargeMainActivity.showCurDeviceView(chargeMainActivity.mCurDeviceType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup itemChargeBind_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ViewGroup) chargeMainActivity.getViewPagerMain().findViewById(R.id.item_charge_bind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemDialogueTranslationLayout_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.ear_dialogue_translation_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemEBookManager_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.item_ebook_manager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup itemEarphoneBind_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ViewGroup) chargeMainActivity.getViewPagerEarPhone().findViewById(R.id.item_earphone_bind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemMusicManager_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.item_music_manager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemSimultaneousTranslationLayout_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.ear_simultaneous_translation_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemTranslationLayout_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.ear_translation_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View itemVoiceAssistant_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.item_voice_assistant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivDenoise_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ImageView) chargeMainActivity.findViewById(R.id.iv_denoise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivNoiseClose_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ImageView) chargeMainActivity.findViewById(R.id.iv_noise_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivNoiseTrans_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ImageView) chargeMainActivity.findViewById(R.id.iv_transparent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivScreensaver_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ImageViewRound) chargeMainActivity.getViewPagerMain().findViewById(R.id.iv_screensaver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llNoiseSettings_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.ll_noise_settings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llScreensaver_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return chargeMainActivity.findViewById(R.id.ll_screensaver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return new i1Ii1i11X(chargeMainActivity.getMContext(), chargeMainActivity.new O00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mScreensaverPics_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.pic_screensaver_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_5, 0, false, 6, null));
    }

    public static /* synthetic */ void onBindStateChange$default(ChargeMainActivity chargeMainActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        chargeMainActivity.onBindStateChange(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCustomANC$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) CustomAncActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEBookManager$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) EBookManagerActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEarphoneLeftKey$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 0);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(chargeMainActivity, (Class<?>) EarphoneKeySettingsActivity.class);
        intent.putExtras(bundle);
        chargeMainActivity.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEarphoneRightKey$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(chargeMainActivity, (Class<?>) EarphoneKeySettingsActivity.class);
        intent.putExtras(bundle);
        chargeMainActivity.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFirmwareUpgrade$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) < 50) {
            ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
        } else if (System.currentTimeMillis() - chargeMainActivity.lastClickTime >= 3000) {
            chargeMainActivity.lastClickTime = System.currentTimeMillis();
            DeviceInfoChecker.I0IIOi(DeviceInfoChecker.OXO1, chargeMainActivity.new IiI10X(), null, 2, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMusicManager$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) MusicManagerV2Activity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNoiseSetTab$lambda$0(View view, ChargeMainActivity chargeMainActivity, BleConnector it) {
        int i;
        Intrinsics.X0O(it, "it");
        int id = view.getId();
        if (id != R.id.iv_denoise) {
            i = id != R.id.iv_transparent ? 0 : 2;
        } else {
            i = 1;
        }
        chargeMainActivity.mEarphoneAncSettings.setMMode(i);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.EARPHONE_ANC_SET, BleKeyFlag.UPDATE, chargeMainActivity.mEarphoneAncSettings, false, false, 24, null);
        chargeMainActivity.showNoiseSetTab(i);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOnlineScreensavers$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        i72.OXO1.OOIX(chargeMainActivity);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefresh() {
        if (!BleConnector.INSTANCE.isAvailable()) {
            ToastUtils.showShort(R.string.not_connected);
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X0X1
                @Override // java.lang.Runnable
                public final void run() {
                    ChargeMainActivity.onRefresh$lambda$0(this.f4025IO);
                }
            }, 2000L);
        } else {
            if (a01.OXO1.OXO1().getBoolean(b01.f5631OX)) {
                return;
            }
            syncInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRefresh$lambda$0(ChargeMainActivity chargeMainActivity) {
        chargeMainActivity.getRefreshLayout().setRefreshing(false);
        a01.OXO1.OXO1().put(b01.f5631OX, chargeMainActivity.getRefreshLayout().isRefreshing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSoundEffects$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) SoundEffectsSampleActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVoiceAssistant$lambda$0(final ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        q62 q62Var = q62.OXO1;
        if (!q62Var.IiX1ii() && !q62Var.OIXOOi() && TextUtils.isEmpty(q62Var.iIiiO()) && !q62Var.XOX()) {
            UtilsKt.XXiO0i(chargeMainActivity);
        } else if (q62Var.IOI0i0I()) {
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            if (voiceManager.isExpired()) {
                voiceManager.checkBaiduAuth(chargeMainActivity, chargeMainActivity.getRefreshLayout(), new Function1() { // from class: com.android.mltcode.paycertificationapi.XXX0O1X
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ChargeMainActivity.onVoiceAssistant$lambda$0$0(this.f5087IO, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) VoiceActivity.class));
            }
        } else {
            chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) VoiceActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVoiceAssistant$lambda$0$0(ChargeMainActivity chargeMainActivity, boolean z) {
        if (z) {
            chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) VoiceActivity.class));
        } else {
            chargeMainActivity.startActivity(new Intent(chargeMainActivity, (Class<?>) VoiceSetActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArcProgressBar pbLeftPower_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ArcProgressBar) chargeMainActivity.findViewById(R.id.pb_earphone_l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArcProgressBar pbPower_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ArcProgressBar) chargeMainActivity.findViewById(R.id.pb_power);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArcProgressBar pbRightPower_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ArcProgressBar) chargeMainActivity.findViewById(R.id.pb_earphone_r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeRefreshLayout refreshLayout_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (SwipeRefreshLayout) chargeMainActivity.findViewById(R.id.srf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvScreensaver_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (RecyclerView) chargeMainActivity.findViewById(R.id.rv_screensaver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScaleSeekBar seekbarLightness_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ScaleSeekBar) chargeMainActivity.findViewById(R.id.seekbar_lightness);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SeekBar seekbarScreensaver_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (SeekBar) chargeMainActivity.findViewById(R.id.seekbar_screensaver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectImagePopup() {
        if (this.mSelectAvatarPopup == null) {
            xz3 xz3Var = new xz3(this);
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return ChargeMainActivity.selectImagePopup$lambda$0$0(this.f2754IO);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOiX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return ChargeMainActivity.selectImagePopup$lambda$0$1(this.f5080IO);
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
    public static final Unit selectImagePopup$lambda$0$0(final ChargeMainActivity chargeMainActivity) {
        hr1.OXO1.iOOX010X(chargeMainActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.O0i0i0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.selectImagePopup$lambda$0$0$0(this.f2581IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$0$0(ChargeMainActivity chargeMainActivity, boolean z) {
        if (z) {
            chargeMainActivity.getMCrop().m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$1(ChargeMainActivity chargeMainActivity) {
        chargeMainActivity.getMCrop().OIX0iXi();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCurDeviceState() {
        if (this.mCurDeviceType == DeviceType.CHARGE) {
            if (BleConnector.INSTANCE.isAvailable()) {
                getTvState().setText(R.string.device_connectied);
                return;
            } else {
                getTvState().setText(R.string.device_disconnected);
                return;
            }
        }
        BleEarphoneState bleEarphoneState = (BleEarphoneState) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_STATE, BleEarphoneState.class, null, 4, null);
        if (!BleConnector.INSTANCE.isAvailable() || ((bleEarphoneState == null || bleEarphoneState.getMLeftState() != 1) && (bleEarphoneState == null || bleEarphoneState.getMRightState() != 1))) {
            getTvState().setText(R.string.device_disconnected);
        } else {
            getTvState().setText(R.string.device_connectied);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCurDeviceView(DeviceType deviceType) {
        String mBleName;
        getViewPager().setCurrentItem(deviceType.ordinal());
        getIndicatorController().selectPosition(deviceType.ordinal());
        if (deviceType == DeviceType.CHARGE) {
            getChargePanel().setVisibility(0);
            getEarphonePanel().setVisibility(8);
            ((TextView) findViewById(R.id.abh_title_center)).setText(q62.OXO1.O1O());
        } else {
            getChargePanel().setVisibility(8);
            getEarphonePanel().setVisibility(0);
            BleEarphoneInfo bleEarphoneInfo = (BleEarphoneInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_INFO, BleEarphoneInfo.class, null, 4, null);
            TextView textView = (TextView) findViewById(R.id.abh_title_center);
            if (TextUtils.isEmpty(bleEarphoneInfo != null ? bleEarphoneInfo.getMBleName() : null)) {
                mBleName = "TW03";
            } else {
                mBleName = bleEarphoneInfo != null ? bleEarphoneInfo.getMBleName() : null;
            }
            textView.setText(mBleName);
        }
        showCurDeviceState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNoiseSetTab(int i) {
        getIvDenoise().setBackgroundResource(R.color.transparent);
        getIvDenoise().setImageResource(R.drawable.ic_denoise_gray);
        getTvDenoise().setEnabled(false);
        getIvNoiseClose().setBackgroundResource(R.color.transparent);
        getIvNoiseClose().setImageResource(R.drawable.ic_noise_close_gray);
        getTvNoiseClose().setEnabled(false);
        getIvNoiseTrans().setBackgroundResource(R.color.transparent);
        getIvNoiseTrans().setImageResource(R.drawable.ic_transparent_gray);
        getTvNoiseTrans().setEnabled(false);
        if (i == 1) {
            getIvDenoise().setBackgroundResource(R.drawable.shape_charge_panel_set_fg);
            getIvDenoise().setImageResource(R.drawable.ic_denoise_true);
            getTvDenoise().setEnabled(true);
        } else if (i != 2) {
            getIvNoiseClose().setBackgroundResource(R.drawable.shape_charge_panel_set_fg);
            getIvNoiseClose().setImageResource(R.drawable.ic_noise_close_true);
            getTvNoiseClose().setEnabled(true);
        } else {
            getIvNoiseTrans().setBackgroundResource(R.drawable.shape_charge_panel_set_fg);
            getIvNoiseTrans().setImageResource(R.drawable.ic_transparent_true);
            getTvNoiseTrans().setEnabled(true);
        }
    }

    private final void showShutdownPopup() {
        go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(R.string.shutdown_tip);
        go0Var.m1865iX(Integer.valueOf(R.string.charge_shutdown_tip));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.shutdown, new Function0() { // from class: com.android.mltcode.paycertificationapi.i1O1XOI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(ChargeMainActivity.showShutdownPopup$lambda$0$0());
            }
        });
        go0Var.IIX1OXO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showShutdownPopup$lambda$0$0() {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        return true;
    }

    private final void showUnbindPopup() {
        go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(R.string.unbind_tip);
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOIOI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(ChargeMainActivity.showUnbindPopup$lambda$0$0());
            }
        });
        go0Var.IIX1OXO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showUnbindPopup$lambda$0$0() {
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable switchStatusRunnable_delegate$lambda$0(final ChargeMainActivity chargeMainActivity) {
        return new Runnable() { // from class: com.android.mltcode.paycertificationapi.OiiXi0OX0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3834IO.showCurDeviceState();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncDone() {
        getRefreshLayout().setRefreshing(false);
        a01.OXO1.OXO1().put(b01.f5631OX, getRefreshLayout().isRefreshing());
        if (this.isShow) {
            autoSyncData$default(this, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncFailed() {
        c72 c72Var = this.mProgressPop;
        if (c72Var != null) {
            c72Var.dismiss();
        }
        this.mProgressPop = null;
        ToastUtils.showLong(R.string.sync_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncInfo() {
        a01.OXO1.OXO1().put(b01.f5631OX, true);
        BleConnector bleConnector = BleConnector.INSTANCE;
        BleKey bleKey = BleKey.POWER;
        BleKeyFlag bleKeyFlag = BleKeyFlag.READ;
        BaseBleConnector.sendData$default(bleConnector, bleKey, bleKeyFlag, null, false, false, 28, null);
        BaseBleConnector.sendData$default(bleConnector, BleKey.EARPHONE_POWER, bleKeyFlag, null, false, false, 28, null);
        BaseBleConnector.sendData$default(bleConnector, BleKey.EARPHONE_STATE, bleKeyFlag, null, false, false, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncScreensaver() {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XO10iX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.syncScreensaver$lambda$0(this.f4704IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncScreensaver$lambda$0(ChargeMainActivity chargeMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        IXO000 ixo000 = chargeMainActivity.mScreensaver;
        if (ixo000 != null) {
            if (chargeMainActivity.mProgressPop != null) {
                return Unit.OXO1;
            }
            c72 c72Var = new c72(chargeMainActivity, 0, 2, null);
            c72Var.m1591I1(R.string.syncing);
            c72Var.m1592OX(0);
            chargeMainActivity.mProgressPop = c72Var;
            c72Var.IIX1OXO();
            BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.WATCH_FACE, ixo000.OXO1(), 0, 4, (Object) null);
        }
        return Unit.OXO1;
    }

    private final void timerCancel() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = this.autoDataSync;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDenoise_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_noise_mode_denoise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHigh_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.item_lightness_tv_high);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLeftPower_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_earphone_l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLow_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.item_lightness_tv_low);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMiddle_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.item_lightness_tv_middle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNoiseClose_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_noise_mode_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNoiseTrans_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_noise_mode_transparent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPower_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_power);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvRightPower_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_earphone_r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvScreensaverValue_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_screensaver_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvState_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (TextView) chargeMainActivity.findViewById(R.id.tv_state);
    }

    private final int valueToProgress(int i) {
        if (i < 2) {
            return 1;
        }
        return i > 2 ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewPagerEarPhone_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return LayoutInflater.from(chargeMainActivity).inflate(R.layout.layout_charge_viewpager_earphone, (ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewPagerMain_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return LayoutInflater.from(chargeMainActivity).inflate(R.layout.layout_charge_viewpager_main, (ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager viewPager_delegate$lambda$0(ChargeMainActivity chargeMainActivity) {
        return (ViewPager) chargeMainActivity.findViewById(R.id.device_viewpager);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseChargeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int i;
        int i2;
        i1Ii1i11X.O10IXXX0X(getMCrop(), this, null, 2, null);
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.title_bar));
        setNavBarColor(this, gk4.m1859iO(this, R.color.charge_bg_end_color));
        if (i72.OXO1.XIIIO()) {
            getAbhTitleRight().setVisibility(0);
            getAbhTitleRight().setImageResource(R.drawable.icon_multi_device);
            getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.light));
            getAbhTitleRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i0X0Ii
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChargeMainActivity.initView$lambda$0(this.f7418IO, view);
                }
            });
        }
        getRefreshLayout().setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.android.mltcode.paycertificationapi.iIOiO
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                this.OXO1.onRefresh();
            }
        });
        initViewPager();
        initIndicator();
        initLightness();
        initScreensaver();
        initCall();
        View itemMusicManager = getItemMusicManager();
        q62 q62Var = q62.OXO1;
        itemMusicManager.setVisibility(q62Var.iXI() ? 0 : 8);
        getItemEBookManager().setVisibility(q62Var.I00I01I() ? 0 : 8);
        View itemVoiceAssistant = getItemVoiceAssistant();
        if (q62Var.IiO0()) {
            VoiceService.f50915I1.m38117iO();
            i = 0;
        } else {
            i = 8;
        }
        itemVoiceAssistant.setVisibility(i);
        View itemTranslationLayout = getItemTranslationLayout();
        if (q62Var.Oi1I() || q62Var.IiII0()) {
            VoiceService.f50915I1.m38117iO();
            i2 = 0;
        } else {
            i2 = 8;
        }
        itemTranslationLayout.setVisibility(i2);
        getItemDialogueTranslationLayout().setVisibility(q62Var.Oi1I() ? 0 : 8);
        getItemSimultaneousTranslationLayout().setVisibility(q62Var.IiII0() ? 0 : 8);
        initNoiseSet();
        showNoiseSetTab(this.mEarphoneAncSettings.getMMode());
        showCurDeviceView(this.mCurDeviceType);
        initFindEarphone();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_charge_main;
    }

    public final void onAbout(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i72.OXO1.O0X(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " device -> onActivityResult: " + i2 + ", " + i + ", " + (intent != null ? intent.getData() : null));
        if (i == 7) {
            q62 q62Var = q62.OXO1;
            if (q62.OiO0IOX(q62Var, null, 1, null)) {
                return;
            }
            q62Var.iI1XiXiII(this);
            return;
        }
        int measuredWidth = getIvScreensaver().getMeasuredWidth();
        int measuredHeight = getIvScreensaver().getMeasuredHeight();
        LogUtils.m11128d("onActivityResult outputX:" + measuredWidth + " outputY:" + measuredHeight);
        getMCrop().XOO0ii0(i, i2, intent, 1.0d, ((double) measuredWidth) / ((double) measuredHeight), measuredWidth, measuredHeight);
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(boolean z) {
        LogUtils.m11128d("onBindStateChange " + z);
        if (BleConnector.INSTANCE.isBound()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    public final void onCustomANC(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.m1079iO(new Function1() { // from class: com.android.mltcode.paycertificationapi.X10100
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onCustomANC$lambda$0(this.f4127IO, (BleConnector) obj);
            }
        });
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    }

    public final void onDialogueTranslation(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) SparkChainMultiDeviceActivity.class));
    }

    public final void onEBookManager(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IX00Ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onEBookManager$lambda$0(this.f1930IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void onEarphoneLeftKey(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Ii0Oi0OiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onEarphoneLeftKey$lambda$0(this.f2179IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void onEarphoneRightKey(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1XIXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onEarphoneRightKey$lambda$0(this.f7667IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @sf5(tag = I01XX0.iOiXi11II)
    public final void onFirmwareRepair(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onFirmwareRepair");
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL)) {
            a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(bleCache.getMDeviceInfo()));
            startActivity(new Intent(this, (Class<?>) FirmwareRepairSearchActivity.class));
        }
    }

    public final void onFirmwareUpgrade(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iiOi10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onFirmwareUpgrade$lambda$0(this.f8621IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        ActivityUtils.startHomeActivity();
    }

    public final void onMemoryManager(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) MemoryManagerActivity.class));
    }

    public final void onMusicManager(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1I10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onMusicManager$lambda$0(this.f1375IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void onNoiseSetTab(@aa1 final View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.m1079iO(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXX101
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onNoiseSetTab$lambda$0(view, this, (BleConnector) obj);
            }
        });
    }

    public final void onNotification(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (checkNotificationPermission()) {
            startActivity(new Intent(this, (Class<?>) NotificationSettingsActivity.class));
        }
    }

    public final void onOnlineScreensavers(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0100X0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onOnlineScreensavers$lambda$0(this.f7290IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @sf5(tag = I01XX0.X1IX)
    public final void onPairImageAttachmentChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        sz0 sz0Var = sz0.OXO1;
        BleCache bleCache = BleCache.INSTANCE;
        File fileIO0II0i = uz0.IO0II0i(sz0Var, new BleDeviceInfo(0, null, bleCache.getMBleName(), null, null, null, null, bleCache.getMFirmwareFlag(), 0, 0L, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133, -1, -1, -1, C2229at.f5560IO, null));
        i1O0OXO1O.OXO1.OXO1("onPairImageAttachmentChange " + FileUtils.isFileExists(fileIO0II0i) + " " + fileIO0II0i);
        if (!FileUtils.isFileExists(fileIO0II0i)) {
            getItemEarphoneBind().setBackgroundResource(((Number) q62.XOOXII(q62.OXO1, null, 1, null).getSecond()).intValue());
            return;
        }
        ViewGroup itemEarphoneBind = getItemEarphoneBind();
        Bitmap bitmap = ImageUtils.getBitmap(fileIO0II0i);
        Intrinsics.O10IXXX0X(bitmap, "getBitmap(...)");
        Resources resources = getResources();
        Intrinsics.O10IXXX0X(resources, "getResources(...)");
        itemEarphoneBind.setBackgroundDrawable(new BitmapDrawable(resources, bitmap));
    }

    @sf5(tag = I01XX0.XXX11i)
    public final void onPairImageChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        sz0 sz0Var = sz0.OXO1;
        BleCache bleCache = BleCache.INSTANCE;
        File fileX00Xi1X = uz0.X00Xi1X(sz0Var, new BleDeviceInfo(0, null, bleCache.getMBleName(), null, null, null, null, bleCache.getMFirmwareFlag(), 0, 0L, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133, -1, -1, -1, C2229at.f5560IO, null));
        i1O0OXO1O.OXO1.OXO1("onPairImageChange " + FileUtils.isFileExists(fileX00Xi1X) + " " + fileX00Xi1X);
        if (!FileUtils.isFileExists(fileX00Xi1X)) {
            getItemChargeBind().setBackgroundResource(((Number) q62.XOOXII(q62.OXO1, null, 1, null).getFirst()).intValue());
            return;
        }
        ViewGroup itemChargeBind = getItemChargeBind();
        Bitmap bitmap = ImageUtils.getBitmap(fileX00Xi1X);
        Intrinsics.O10IXXX0X(bitmap, "getBitmap(...)");
        Resources resources = getResources();
        Intrinsics.O10IXXX0X(resources, "getResources(...)");
        itemChargeBind.setBackgroundDrawable(new BitmapDrawable(resources, bitmap));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isShow = false;
        timerCancel();
    }

    public final void onPermission(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) PermissionSettingsActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        onPairImageChange(new Object());
        onPairImageAttachmentChange(new Object());
        this.isShow = true;
        if (getRefreshLayout().isRefreshing()) {
            return;
        }
        autoSyncData(1000L);
    }

    public final void onSettings(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
    }

    public final void onSimultaneousInterpretation(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) SparkChainSimultaneousActivity.class));
    }

    public final void onSoundEffects(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.m1079iO(new Function1() { // from class: com.android.mltcode.paycertificationapi.X0I1I111
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onSoundEffects$lambda$0(this.f3948IO, (BleConnector) obj);
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showShutdownPopup();
    }

    public final void onUnbind(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showUnbindPopup();
    }

    public final void onVoiceAssistant(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1i101i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChargeMainActivity.onVoiceAssistant$lambda$0(this.f1480IO, (BleConnector) obj);
            }
        }, 1, null);
    }
}
