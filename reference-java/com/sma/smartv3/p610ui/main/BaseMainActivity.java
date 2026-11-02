package com.sma.smartv3.p610ui.main;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI1O0i1O;
import com.android.mltcode.paycertificationapi.lq6;
import com.android.mltcode.paycertificationapi.nx1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.biz.fitness_site.google.GoogleHealth;
import com.sma.smartv3.biz.fitness_site.hyky.HykyManager;
import com.sma.smartv3.biz.p242ad.ADPAdManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.AGPSInitializer;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.AppVersion;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.model.ThirdPlatform;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserInfo;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.device.CameraActivity;
import com.sma.smartv3.p610ui.device.DeviceFragment;
import com.sma.smartv3.p610ui.device.FirmwareRepairGQActivity;
import com.sma.smartv3.p610ui.device.FirmwareRepairModeActivity;
import com.sma.smartv3.p610ui.device.FirmwareRepairNActivity;
import com.sma.smartv3.p610ui.device.FirmwareRepairSActivity;
import com.sma.smartv3.p610ui.device.FirmwareRepairSearchActivity;
import com.sma.smartv3.p610ui.main.BaseMainActivity;
import com.sma.smartv3.p610ui.p611ai.fragment.AIFragment;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.p610ui.p612me.MainMeFragment;
import com.sma.smartv3.p610ui.p612me.PermissionSettingsActivity;
import com.sma.smartv3.p610ui.sport.SportDetailActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.sport.SportFragment;
import com.sma.smartv3.p610ui.sport.SportOnGoingGpsActivity;
import com.sma.smartv3.p610ui.sport.XO0O10;
import com.sma.smartv3.p610ui.status.MainStatusFragment;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBaseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,1546:1\n87#2,7:1547\n94#2,3:1555\n70#2,7:1558\n97#2:1565\n69#2,3:1628\n72#2,5:1632\n69#2,3:1637\n72#2,5:1641\n69#2,3:1648\n72#2,5:1652\n69#2,3:1659\n72#2,5:1663\n69#2,3:1670\n72#2,5:1674\n69#2,3:1681\n72#2,5:1685\n69#2,3:1690\n72#2,5:1694\n87#2,7:1704\n94#2,3:1712\n70#2,7:1715\n97#2:1722\n69#2,3:1729\n72#2,5:1733\n1#3:1554\n1#3:1631\n1#3:1640\n1#3:1651\n1#3:1662\n1#3:1673\n1#3:1684\n1#3:1693\n1#3:1711\n1#3:1732\n93#4,2:1566\n90#4:1568\n11#4,2:1569\n11#4,2:1646\n11#4,2:1657\n11#4,2:1668\n11#4,2:1679\n19#4:1699\n15#4:1700\n90#4:1701\n19#4:1702\n15#4:1703\n11#4,2:1727\n108#5,7:1571\n123#5:1601\n176#5,11:1602\n196#5:1621\n116#6,23:1578\n252#6,7:1613\n270#6:1620\n1869#7,2:1622\n64#8,4:1624\n64#8,4:1723\n*S KotlinDebug\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity\n*L\n209#1:1547,7\n209#1:1555,3\n209#1:1558,7\n209#1:1565\n1197#1:1628,3\n1197#1:1632,5\n1199#1:1637,3\n1199#1:1641,5\n1202#1:1648,3\n1202#1:1652,5\n1205#1:1659,3\n1205#1:1663,5\n1208#1:1670,3\n1208#1:1674,5\n1211#1:1681,3\n1211#1:1685,5\n1214#1:1690,3\n1214#1:1694,5\n497#1:1704,7\n497#1:1712,3\n497#1:1715,7\n497#1:1722\n915#1:1729,3\n915#1:1733,5\n209#1:1554\n1197#1:1631\n1199#1:1640\n1202#1:1651\n1205#1:1662\n1208#1:1673\n1211#1:1684\n1214#1:1693\n497#1:1711\n915#1:1732\n484#1:1566,2\n484#1:1568\n520#1:1569,2\n1201#1:1646,2\n1204#1:1657,2\n1207#1:1668,2\n1210#1:1679,2\n1277#1:1699\n1277#1:1700\n1497#1:1701\n324#1:1702\n324#1:1703\n523#1:1727,2\n622#1:1571,7\n622#1:1601\n661#1:1602,11\n661#1:1621\n622#1:1578,23\n661#1:1613,7\n661#1:1620\n1163#1:1622,2\n1176#1:1624,4\n509#1:1723,4\n*E\n"})
public class BaseMainActivity extends BaseFragmentPagerActivity {
    private boolean isRefreshingBottomNav;
    private boolean isToPersonalInfo;
    private ImageView ivRemind;

    @tb1
    private go0 locationPopup;

    @tb1
    private c72 mAGpsPopup;

    @tb1
    private go0 mAGpsPopupReminder;

    @tb1
    private go0 mClassicConnectPopup;

    @tb1
    private go0 mClassicNotePopup;

    @tb1
    private I0iiIOX mEvaluationPopup;

    @tb1
    private go0 mFindPhonePopup;

    @tb1
    private go0 mFontPackageStatusPopup;

    @tb1
    private go0 mGPSRepairPopup;

    @tb1
    private GoogleHealth mGoogleHealth;

    @tb1
    private C2702ms mLocationClient;

    @tb1
    private go0 mNotificationPopup;

    @tb1
    private go0 mPermissionCheckPopup;

    @tb1
    private go0 mRepairPopup;

    @tb1
    private go0 mStatusBarNotificationPopup;

    @tb1
    private go0 mUIPackageStatusPopup;

    @tb1
    private go0 mWeChatOutLoginPopup;
    public MainStatusFragment statusFragment;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1i100XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseMainActivity.rootView_delegate$lambda$0(this.f7708IO);
        }
    });

    @aa1
    private final Lazy bottomNav$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0XiOIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseMainActivity.bottomNav_delegate$lambda$0(this.f8005IO);
        }
    });
    private boolean isFocusChanged = true;
    private final int delayTimeTask = 254;

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.I1XII0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return BaseMainActivity.mHandler$lambda$0(this.f1447IO, message);
        }
    });

    @aa1
    private final XIi00iiXO mBleHandleCallback = new XIi00iiXO();

    @aa1
    private final OXO1 bleHandleCallback = new OXO1();

    @aa1
    private final Runnable refreshRunnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi00I
        @Override // java.lang.Runnable
        public final void run() {
            BaseMainActivity.refreshMainBottomNav$default(this.f3612IO, 0, 1, null);
        }
    };

    @aa1
    private final Lazy mainHandler$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii1iOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseMainActivity.mainHandler_delegate$lambda$0(this.f2221IO);
        }
    });

    public static final class OXO1 implements BleHandleCallback {
        public OXO1() {
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
        public /* bridge */ void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
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
        public /* bridge */ void onSessionStateChange(boolean z) {
            super.onSessionStateChange(z);
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
            c72 mAGpsPopup;
            c72 mAGpsPopup2;
            Intrinsics.X0O(bleKey, "bleKey");
            if (z && i2 > 0 && (mAGpsPopup2 = BaseMainActivity.this.getMAGpsPopup()) != null) {
                mAGpsPopup2.m1592OX((i3 * 100) / i2);
            }
            if ((!z || i2 == i3) && (mAGpsPopup = BaseMainActivity.this.getMAGpsPopup()) != null && mAGpsPopup.isShowing()) {
                mAGpsPopup.dismiss();
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

    @SourceDebugExtension({"SMAP\nBaseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$mBleHandleCallback$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1546:1\n69#2,3:1547\n72#2,5:1551\n1#3:1550\n*S KotlinDebug\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$mBleHandleCallback$1\n*L\n191#1:1547,3\n191#1:1551,5\n191#1:1550\n*E\n"})
    public static final class XIi00iiXO implements BleHandleCallback {
        public XIi00iiXO() {
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
        public void onCameraStateChange(int i) {
            boolean zIsAppForeground = AppUtils.isAppForeground();
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            i1o0oxo1o.OXO1("main onCameraStateChange -> " + bleInitializer.iX01() + ", " + i + ", " + zIsAppForeground);
            if (zIsAppForeground) {
                if (i != 1) {
                    bleInitializer.i0101i(false);
                } else {
                    if (bleInitializer.iX01()) {
                        return;
                    }
                    bleInitializer.i0101i(true);
                    BaseMainActivity baseMainActivity = BaseMainActivity.this;
                    baseMainActivity.startActivity(new Intent(baseMainActivity, (Class<?>) CameraActivity.class));
                }
            }
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
        public /* bridge */ void onCommandSendTimeout(BleKey bleKey, BleKeyFlag bleKeyFlag) {
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
        public void onDeviceSportDataUpdate(BleDeviceSportData deviceSportData) {
            Intrinsics.X0O(deviceSportData, "deviceSportData");
            BaseMainActivity.this.onOpenSportOnGoingActivity(deviceSportData);
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
            go0 go0Var;
            if (z) {
                BaseMainActivity.this.dismissRepairPopup();
                BaseMainActivity.this.checkGPSFirmwareUpgradeStatus(new Object());
                return;
            }
            go0 go0Var2 = BaseMainActivity.this.mAGpsPopupReminder;
            if (go0Var2 == null || !go0Var2.isShowing() || (go0Var = BaseMainActivity.this.mAGpsPopupReminder) == null) {
                return;
            }
            go0Var.dismiss();
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.BaseMainActivity$iO */
    public static final class C18853iO implements IO0OI {
        public C18853iO() {
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation location) {
            Intrinsics.X0O(location, "location");
            BaseMainActivity.this.requestWeatherLocation(location.IiI10X(), location.XO0O10());
            BaseMainActivity.this.stopLocationClient();
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String message) {
            Intrinsics.X0O(message, "message");
            i1O0OXO1O.OXO1.OXO1("requestWeather -> CustomLocationCallback onError message=" + message);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.BaseMainActivity$onCheckBindSuccess$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.main.BaseMainActivity$onCheckBindSuccess$1", m39466f = "BaseMainActivity.kt", m39467i = {}, m39468l = {957}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290041 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290041(Continuation<? super C290041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseMainActivity.this.new C290041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290041) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(2000L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            HykyManager.Companion.getInstance().checkAuthStatus(BaseMainActivity.this);
            return Unit.OXO1;
        }
    }

    private final void appUserUpdate(AppUser appUser) {
        appUser.setThirdPlatform(null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        File fileI0IIOi = uz0.I0IIOi(sz0.OXO1);
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity.appUserUpdate.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
                i1O0OXO1O.OXO1.OXO1("appUserUpdate handleResponse----------------------------");
                a01 a01Var = a01.OXO1;
                a01Var.IiI10X().put(b01.XXO, false);
                a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser2));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("appUserUpdate handleError----------------------------");
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRootView());
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity$appUserUpdate$$inlined$upload$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = this;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(str);
        if (fileI0IIOi.exists()) {
            multiPartBuilderUpload.addMultipartFile("avatar", fileI0IIOi);
        }
        multiPartBuilderUpload.addMultipartParameter(appUser).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity$appUserUpdate$$inlined$upload$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppUser> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomNavigationView bottomNav_delegate$lambda$0(BaseMainActivity baseMainActivity) {
        return (BottomNavigationView) baseMainActivity.findViewById(R.id.bottomNav);
    }

    private final void checkAppVersion() {
        a01.OXO1.OXO1().put(AppVersion.class.getName(), new Gson().toJson(new AppVersion(0, null, null, null, null, null, 0, 127, null)));
        DeviceInfoChecker.OXO1.m38096iO(new Function1() { // from class: com.android.mltcode.paycertificationapi.O011OI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseMainActivity.checkAppVersion$lambda$0(this.f2400IO, (AppVersion) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAppVersion$lambda$0(final BaseMainActivity baseMainActivity, final AppVersion appVersion) {
        Intrinsics.X0O(appVersion, "appVersion");
        a01.OXO1.OXO1().put(AppVersion.class.getName(), new Gson().toJson(appVersion));
        ImageView imageView = baseMainActivity.ivRemind;
        if (imageView == null) {
            Intrinsics.XXO("ivRemind");
            imageView = null;
        }
        imageView.setVisibility(0);
        I01XX0.XIi00iiXO(I01XX0.iIXi1iiXI, null, 2, null);
        baseMainActivity.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OIX11X
            @Override // java.lang.Runnable
            public final void run() {
                BaseMainActivity.checkAppVersion$lambda$0$0(this.f3035IO, appVersion);
            }
        }, 5000L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAppVersion$lambda$0$0(final BaseMainActivity baseMainActivity, final AppVersion appVersion) {
        go0 go0Var = new go0(baseMainActivity, 0, 2, null);
        go0Var.O1O(R.string.new_app_version_remind);
        go0Var.I0iXXO(false);
        if (appVersion.getFlag() == 1) {
            go0.X11iII1O1(go0Var, null, null, 2, null);
        } else {
            go0Var.iX1O1(Integer.valueOf(R.string.upgrade_later), new Function0() { // from class: com.android.mltcode.paycertificationapi.iiOX1O0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.checkAppVersion$lambda$0$0$0$0());
                }
            });
        }
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0iO1Oi0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(BaseMainActivity.checkAppVersion$lambda$0$0$0$1(this.f3159IO, appVersion));
            }
        });
        RelativeLayout rootView = baseMainActivity.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAppVersion$lambda$0$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAppVersion$lambda$0$0$0$1(BaseMainActivity baseMainActivity, AppVersion appVersion) {
        X1OOO.i010I(baseMainActivity, appVersion.getFileUrl());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkBluetoothPermission$lambda$0(boolean z) {
        if (z) {
            BleConnector.INSTANCE.launch();
        }
        return Unit.OXO1;
    }

    public static /* synthetic */ void checkClassicConnect$default(BaseMainActivity baseMainActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkClassicConnect");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        baseMainActivity.checkClassicConnect(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkClassicConnect$lambda$0(final BaseMainActivity baseMainActivity, Ref.BooleanRef booleanRef) {
        go0 go0Var;
        if (baseMainActivity.isFocusChanged) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            boolean zIsBoundClassic = bleConnector.isBoundClassic();
            booleanRef.element = zIsBoundClassic;
            if (zIsBoundClassic) {
                baseMainActivity.classicNotePopup();
                return;
            }
            if (baseMainActivity.mClassicConnectPopup == null) {
                go0 go0Var2 = new go0(baseMainActivity, 0, 2, null);
                String string = baseMainActivity.getString(R.string.classic_connect_pop);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                go0Var2.m1864iI(string);
                go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
                go0Var2.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.IOXO00i
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.checkClassicConnect$lambda$0$0$0(this.f1873IO));
                    }
                });
                go0Var2.XXI(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1XIi00i
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return BaseMainActivity.checkClassicConnect$lambda$0$0$1(this.f3688IO);
                    }
                });
                baseMainActivity.mClassicConnectPopup = go0Var2;
            }
            if (!bleConnector.isBound() || (go0Var = baseMainActivity.mClassicConnectPopup) == null) {
                return;
            }
            RelativeLayout rootView = baseMainActivity.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkClassicConnect$lambda$0$0$0(BaseMainActivity baseMainActivity) {
        try {
            baseMainActivity.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
            return true;
        } catch (Exception unused) {
            baseMainActivity.startActivity(new Intent("android.settings.SETTINGS"));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkClassicConnect$lambda$0$0$1(final BaseMainActivity baseMainActivity) {
        baseMainActivity.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.II0iI1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1534IO.permissionCheckPopup();
            }
        }, 3000L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDeviceSecurity() {
    }

    private static final Unit checkDeviceSecurity$lambda$0(BaseMainActivity baseMainActivity, boolean z) {
        if (z) {
            go0 go0Var = new go0(baseMainActivity, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.m1864iI("安全提醒");
            go0Var.iOO1ii1("检测到您的手机存在安全风险, 请注意!");
            go0.X11iII1O1(go0Var, null, null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.I11OI0I
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.checkDeviceSecurity$lambda$0$0$0());
                }
            });
            go0Var.IIX1OXO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkDeviceSecurity$lambda$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkFirmwareUpgradeStatus$lambda$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkGPSFirmwareUpgradeStatus$lambda$0$0(final BaseMainActivity baseMainActivity) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1iiI1Xi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseMainActivity.checkGPSFirmwareUpgradeStatus$lambda$0$0$0(this.f4398IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkGPSFirmwareUpgradeStatus$lambda$0$0$0(BaseMainActivity baseMainActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        DeviceInfoChecker.OXO1.O1O(baseMainActivity, "A");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkNotificationPermission$lambda$0$0$0(BaseMainActivity baseMainActivity) {
        MyNotificationListenerService.O001I.I0IIOi(baseMainActivity.getMContext());
        baseMainActivity.checkStatusBarNotificationPermission();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPostNotificationsPermission$lambda$0(boolean z) {
        if (!z) {
            a01.OXO1.IiI10X().put(b01.IXI, false);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkStatusBarNotificationPermission$lambda$0$0$0(BaseMainActivity baseMainActivity) {
        Intent intent = new Intent();
        try {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", baseMainActivity.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", baseMainActivity.getApplicationInfo().uid);
            intent.putExtra("app_package", baseMainActivity.getPackageName());
            intent.putExtra("app_uid", baseMainActivity.getApplicationInfo().uid);
            baseMainActivity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.putExtra("package", baseMainActivity.getPackageName());
            baseMainActivity.startActivity(intent);
        }
        checkClassicConnect$default(baseMainActivity, false, 1, null);
        return true;
    }

    private final void classicNotePopup() {
        if (i72.OXO1.XOO0XOOii()) {
            a01 a01Var = a01.OXO1;
            if (a01Var.XIi00iiXO().getBoolean(b01.X11I, true)) {
                go0 go0Var = new go0(this, 0, 2, null);
                go0Var.I0iXXO(false);
                go0Var.O1O(R.string.classic_note_title);
                go0Var.m1865iX(Integer.valueOf(q62.OXO1.iIXi1iiXI()));
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.X0Xi
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.classicNotePopup$lambda$0$0(this.f4051IO));
                    }
                });
                this.mClassicNotePopup = go0Var;
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var.I1XOi1(rootView);
                a01Var.XIi00iiXO().put(b01.X11I, false);
                return;
            }
        }
        permissionCheckPopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean classicNotePopup$lambda$0$0(BaseMainActivity baseMainActivity) {
        baseMainActivity.permissionCheckPopup();
        return true;
    }

    private final void dataOperating() {
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X0i1iX1
            @Override // java.lang.Runnable
            public final void run() {
                BaseMainActivity.dataOperating$lambda$0(this.f4094IO);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dataOperating$lambda$0(final BaseMainActivity baseMainActivity) {
        if (baseMainActivity.isFocusChanged) {
            a01 a01Var = a01.OXO1;
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            AppUser appUser2 = (AppUser) appUser;
            if (a01Var.IiI10X().getBoolean(b01.O001I, true)) {
                baseMainActivity.updateUserInfo(appUser2, true);
                if (appUser2.getIdentity().length() > 0) {
                    if (a01Var.IiI10X().getBoolean(b01.XXO, false)) {
                        baseMainActivity.appUserUpdate(appUser2);
                    } else {
                        updateUserInfo$default(baseMainActivity, appUser2, false, 2, null);
                    }
                    baseMainActivity.downloadData(appUser2);
                    new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iiIX1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8590IO.userMigrate();
                        }
                    }, 2000L);
                }
            } else if (appUser2.getHeight() == 0.0f || appUser2.getWeight() == 0.0f) {
                baseMainActivity.toPersonalInformationActivity();
            }
            baseMainActivity.checkPermission();
            baseMainActivity.checkAppVersion();
            DeviceInfoChecker.OXO1.XXI();
            I01XX0.OXO1(I01XX0.XOXiX0, Boolean.FALSE);
            baseMainActivity.checkFirmwareUpgradeStatus(new Object());
            baseMainActivity.initializationRecordTime();
            i72 i72Var = i72.OXO1;
            if (i72Var.iOXiO1O1I()) {
                baseMainActivity.uploadToZewaFitPop();
            }
            baseMainActivity.showClientAppUpgradePopup();
            if (i72Var.X00110X()) {
                new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1XIOXO1i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2788IO.uploadPhoneInfo();
                    }
                }, 3000L);
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIiOi10iO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1694IO.requestWeather();
                }
            }, 5000L);
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XXIiI1i
                @Override // java.lang.Runnable
                public final void run() {
                    BaseMainActivity.checkClassicConnect$default(this.f5040IO, false, 1, null);
                }
            }, 2000L);
            if (i72Var.XXOXi()) {
                baseMainActivity.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XiOOO10O
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseMainActivity.dataOperating$lambda$0$4(this.f5305IO);
                    }
                }, 3000L);
            }
            baseMainActivity.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i0i1O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7472IO.checkDeviceSecurity();
                }
            }, 3000L);
            baseMainActivity.mHandler.sendEmptyMessageDelayed(baseMainActivity.delayTimeTask, 8000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dataOperating$lambda$0$4(BaseMainActivity baseMainActivity) {
        ADPAdManager.INSTANCE.getAdMobConsent(baseMainActivity, new Function2() { // from class: com.android.mltcode.paycertificationapi.IX1O
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return BaseMainActivity.dataOperating$lambda$0$4$0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dataOperating$lambda$0$4$0(boolean z, boolean z2) {
        a01.OXO1.OXO1().put(b01.XIIO11I, z2);
        return Unit.OXO1;
    }

    private final void downloadData(AppUser appUser) {
        if (a01.OXO1.IiI10X().getBoolean(b01.f5626IO, false) || appUser.getDbUrl().length() <= 0) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1("downloadData");
        final c72 c72Var = new c72(this, 0, 2, null);
        c72Var.m1591I1(R.string.syncing);
        c72Var.m1592OX(0);
        RelativeLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        c72Var.I1XOi1(rootView);
        sz0 sz0Var = sz0.OXO1;
        if (uz0.I1XOi1(sz0Var).exists()) {
            parseData(c72Var);
        } else {
            NetWorkUtils.INSTANCE.download(appUser.getDbUrl(), uz0.XXI(sz0Var), "data", new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity.downloadData.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    this.parseData(c72Var);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    c72Var.dismiss();
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                    c72Var.m1592OX(i);
                }
            });
        }
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler$delegate.getValue();
    }

    private final void initializationRecordTime() {
        EvaluationKt.specialProcessingTime(b01.X0I1);
        EvaluationKt.specialProcessingTime(b01.I0i0);
        EvaluationKt.specialProcessingTime(b01.iX01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mHandler$lambda$0(BaseMainActivity baseMainActivity, Message it) {
        Intrinsics.X0O(it, "it");
        if (it.what != baseMainActivity.delayTimeTask) {
            return false;
        }
        baseMainActivity.onShowEvaluationStatus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0(BaseMainActivity baseMainActivity) {
        return new Handler(baseMainActivity.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFindPhone$lambda$0$0() {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FIND_PHONE, BleKeyFlag.UPDATE, 1, false, false, 24, null);
        BleInitializer.f51208IO.onFindPhone(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPackageStatus$lambda$0$0(BaseMainActivity baseMainActivity) {
        DeviceInfoChecker.OXO1.m38095iI(baseMainActivity, "A");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPackageStatus$lambda$1$0(BaseMainActivity baseMainActivity) {
        DeviceInfoChecker.OXO1.IXXOO(baseMainActivity, "A");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onShowLocationPopup$lambda$0$0() {
        a01.OXO1.XIi00iiXO().put(b01.XO0X10iO, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onShowSyncAgpsPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onShowSyncAgpsPopup$lambda$0$1(BaseMainActivity baseMainActivity) {
        baseMainActivity.onSyncAgps(new Object());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseData(c72 c72Var) {
        LogUtils.m11128d("parseData data");
        c72Var.m1591I1(R.string.Parsing);
        c72Var.m1592OX(0);
        if (iI1O0i1O.OXO1.m2075iO(c72Var) && this.statusFragment != null && getStatusFragment().isVisible()) {
            getStatusFragment().onRefresh();
        }
        c72Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionCheckPopup() {
        i72 i72Var = i72.OXO1;
        if (!i72Var.I0iOXO() && i72Var.X0iO()) {
            a01 a01Var = a01.OXO1;
            if (!a01Var.XIi00iiXO().getBoolean(b01.X100O, true) || hr1.OXO1.iOiXi11II(this)) {
                return;
            }
            go0 go0Var = new go0(this, R.layout.pop_message2);
            go0Var.I0iXXO(false);
            go0Var.m1865iX(Integer.valueOf(R.string.permission_check_text));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.OXI0X0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.permissionCheckPopup$lambda$0$0(this.f3453IO));
                }
            });
            this.mPermissionCheckPopup = go0Var;
            RelativeLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var.I1XOi1(rootView);
            a01Var.XIi00iiXO().put(b01.X100O, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionCheckPopup$lambda$0$0(BaseMainActivity baseMainActivity) {
        baseMainActivity.startActivity(new Intent(baseMainActivity, (Class<?>) PermissionSettingsActivity.class));
        return true;
    }

    public static /* synthetic */ void refreshMainBottomNav$default(BaseMainActivity baseMainActivity, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshMainBottomNav");
        }
        if ((i2 & 1) != 0) {
            i = R.menu.bottom_nav;
        }
        baseMainActivity.refreshMainBottomNav(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestWeather() {
        if (PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
            if (!WeatherInitializer.f51281IO.OIi0()) {
                i1O0OXO1O.OXO1.OXO1("requestWeather -> the last Request not done");
                return;
            }
            if (!q62.OXO1.OXii10I()) {
                i1O0OXO1O.OXO1.OXO1("requestWeather -> Device does not support weather");
                return;
            }
            if (!BleConnector.INSTANCE.isAvailable()) {
                i1O0OXO1O.OXO1.OXO1("requestWeather -> BleConnector is not available");
                return;
            }
            if (this.mLocationClient == null) {
                this.mLocationClient = C2743ns.XIi00iiXO(new C18853iO(), false, 2, null);
            }
            C2702ms c2702ms = this.mLocationClient;
            if (c2702ms != null) {
                c2702ms.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestWeatherLocation(double d, double d2) {
        SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (weatherRealtime == null || !calculateDistance(d2, d, weatherRealtime.getLat(), weatherRealtime.getLon())) {
            return;
        }
        WeatherInitializer.f51281IO.X1ii();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout rootView_delegate$lambda$0(BaseMainActivity baseMainActivity) {
        return (RelativeLayout) baseMainActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setBottomNavItem$lambda$0(BaseMainActivity baseMainActivity, MenuItem it) {
        Intrinsics.X0O(it, "it");
        baseMainActivity.clearSubContent();
        Menu menu = baseMainActivity.getBottomNav().getMenu();
        Intrinsics.O10IXXX0X(menu, "getMenu(...)");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (it.getItemId() == menu.getItem(i).getItemId()) {
                baseMainActivity.getMViewPager().setCurrentItem(i);
            }
        }
        return false;
    }

    private final c72 setProgressBackCallBack(c72 c72Var) {
        if (c72Var != null) {
            return c72Var;
        }
        c72 c72Var2 = new c72(this, 0, 2, null);
        c72Var2.X1ii(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOOXIOO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseMainActivity.setProgressBackCallBack$lambda$0$0(this.f1847IO);
            }
        });
        c72Var2.XXI(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXOIOO0I
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseMainActivity.setProgressBackCallBack$lambda$0$1(this.f3505IO);
            }
        });
        return c72Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProgressBackCallBack$lambda$0$0(BaseMainActivity baseMainActivity) {
        BleConnector.INSTANCE.addHandleCallback(baseMainActivity.bleHandleCallback);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProgressBackCallBack$lambda$0$1(BaseMainActivity baseMainActivity) {
        BleConnector.INSTANCE.removeHandleCallback(baseMainActivity.bleHandleCallback);
        return Unit.OXO1;
    }

    private final void setupBottomNavigationBar() {
        transparentNavBar();
        setNavBarColor(this, gk4.m1859iO(getMContext(), R.color.bottom_navigation_bg_color));
        getBottomNav().setItemIconTintList(null);
        setBottomNavItem();
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.red_badge, (ViewGroup) getRootView(), false);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(R.id.ivRemind);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.ivRemind = (ImageView) viewFindViewById;
        ((BottomNavigationItemView) getBottomNav().findViewById(R.id.item_bottom_me)).addView(viewInflate);
        bottomRemoveItem();
        getMViewPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sma.smartv3.ui.main.BaseMainActivity.setupBottomNavigationBar.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                BaseMainActivity.this.getBottomNav().getMenu().getItem(i).setChecked(true);
                BaseMainActivity.this.clearSubContent();
                BaseMainActivity.this.viewPagerSelected(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAILackingTip$lambda$0$0(BaseMainActivity baseMainActivity) {
        String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strX11iII1O1);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseMainActivity, (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        baseMainActivity.startActivity(intent);
        return true;
    }

    private final void showClientAppUpgradePopup() {
    }

    private static final boolean showClientAppUpgradePopup$lambda$0$0(BaseMainActivity baseMainActivity) {
        X1OOO.i010I(baseMainActivity, "https://play.google.com/store/apps/details?id=com.sector_morellato.smartwatches");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWeChatOutLoginPopup() {
        go0 go0Var = new go0(this, 0, 2, null);
        go0Var.I0iXXO(false);
        go0Var.O1O(R.string.login_timeout_title_tip);
        go0Var.m1865iX(Integer.valueOf(R.string.login_timeout_tip));
        go0Var.IXXOO(1);
        go0.X11iII1O1(go0Var, null, null, 3, null);
        go0Var.X1IX(R.string.login, new Function0() { // from class: com.android.mltcode.paycertificationapi.Iii010I1X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(BaseMainActivity.showWeChatOutLoginPopup$lambda$0$0(this.f2313IO));
            }
        });
        this.mWeChatOutLoginPopup = go0Var;
        RelativeLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showWeChatOutLoginPopup$lambda$0$0(final BaseMainActivity baseMainActivity) {
        i72.OXO1.XOiXXOO(baseMainActivity);
        baseMainActivity.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X1I01
            @Override // java.lang.Runnable
            public final void run() {
                BaseMainActivity.showWeChatOutLoginPopup$lambda$0$0$0(this.f4246IO);
            }
        }, 150L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWeChatOutLoginPopup$lambda$0$0$0(BaseMainActivity baseMainActivity) {
        lq6.OXO1.OXO1(baseMainActivity);
        baseMainActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocationClient() {
        C2702ms c2702ms = this.mLocationClient;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toPersonalInformationActivity() {
        this.isToPersonalInfo = true;
        i72.OXO1.XIi10(this);
    }

    private final void updateUserInfo(final AppUser appUser, final boolean z) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userIdentityBody = RequestBodyKt.getUserIdentityBody(appUser);
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity.updateUserInfo.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
                String phone;
                ThirdPlatform thirdPlatform;
                String unionId;
                a01 a01Var = a01.OXO1;
                SPUtils sPUtilsXO0O10 = a01Var.XO0O10();
                Object appUser3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
                Object objFromJson = new Gson().fromJson(sPUtilsXO0O10.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
                if (objFromJson != null) {
                    appUser3 = objFromJson;
                }
                AppUser appUser4 = (AppUser) appUser3;
                if (z) {
                    if (appUser2 != null && (thirdPlatform = appUser2.getThirdPlatform()) != null && thirdPlatform.getProjectId() == 2) {
                        SPUtils sPUtilsOXO1 = a01Var.OXO1();
                        ThirdPlatform thirdPlatform2 = appUser2.getThirdPlatform();
                        sPUtilsOXO1.put(b01.OX0X1O10X, thirdPlatform2 != null ? thirdPlatform2.getOpenId() : null);
                        SPUtils sPUtilsOXO2 = a01Var.OXO1();
                        ThirdPlatform thirdPlatform3 = appUser2.getThirdPlatform();
                        sPUtilsOXO2.put(b01.I0i1OXiI, thirdPlatform3 != null ? thirdPlatform3.getReplaced() : 0);
                        ThirdPlatform thirdPlatform4 = appUser2.getThirdPlatform();
                        if (thirdPlatform4 != null && (unionId = thirdPlatform4.getUnionId()) != null && unionId.length() == 0) {
                            ThirdPlatform thirdPlatform5 = appUser2.getThirdPlatform();
                            if (oe5.I0i1OXiI(thirdPlatform5 != null ? thirdPlatform5.getPlatform() : null, nx1.XIi00iiXO, false, 2, null)) {
                                this.showWeChatOutLoginPopup();
                            }
                        }
                    }
                    if (appUser2 == null || (phone = appUser2.getPhone()) == null || phone.length() == 0) {
                        return;
                    }
                    AppUser appUser5 = (AppUser) new Gson().fromJson(a01Var.IiI10X().getString(AppUser.class.getName()), AppUser.class);
                    if (appUser5 != null) {
                        appUser5.setPhone(phone);
                        a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser5));
                        return;
                    }
                    return;
                }
                if (appUser4.getHeight() == 0.0f || appUser4.getWeight() == 0.0f) {
                    if (appUser2 != null) {
                        appUser2.setUnit(appUser.getUnit());
                    }
                    a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser2));
                    this.parseUserInfo(appUser2);
                    return;
                }
                ToastUtils.showLong(R.string.check_personal_data);
                if (appUser2 != null) {
                    if (appUser2.getNickname().length() == 0 && appUser4.getNickname().length() > 0) {
                        appUser2.setNickname(appUser4.getNickname());
                    }
                    if (appUser2.getBirthday().length() == 0 && appUser4.getBirthday().length() > 0) {
                        appUser2.setBirthday(appUser4.getBirthday());
                    }
                    if (appUser2.getHeight() == 0.0f && appUser4.getHeight() != 0.0f) {
                        appUser2.setHeight(appUser4.getHeight());
                    }
                    if (appUser2.getWeight() == 0.0f && appUser4.getWeight() != 0.0f) {
                        appUser2.setWeight(appUser4.getWeight());
                    }
                }
                if (appUser2 != null) {
                    appUser2.setUnit(appUser.getUnit());
                }
                a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser2));
                this.toPersonalInformationActivity();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppUserInfo.URL);
        netWorkUtils.printParam(strConvertBaseUrl + AppUserInfo.URL, userIdentityBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + AppUserInfo.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity$updateUserInfo$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) userIdentityBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.main.BaseMainActivity$updateUserInfo$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppUser> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
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
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public static /* synthetic */ void updateUserInfo$default(BaseMainActivity baseMainActivity, AppUser appUser, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserInfo");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseMainActivity.updateUserInfo(appUser, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadPhoneInfo() {
        if (this.isToPersonalInfo) {
            return;
        }
        try {
            if (BleConnector.INSTANCE.isBound()) {
                UploadInfoManager.OXO1.I0iXXO();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void uploadToZewaFitPop() {
        a01 a01Var = a01.OXO1;
        if (a01Var.IiI10X().contains(b01.XOXiX0)) {
            return;
        }
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        if (((AppUser) appUser).getIdentity().length() > 0) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.m1864iI("Is it allowed to sync data to Zewa server?");
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.X11O
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.uploadToZewaFitPop$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OOiO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.uploadToZewaFitPop$lambda$0$1());
                }
            });
            RelativeLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean uploadToZewaFitPop$lambda$0$0() {
        a01.OXO1.IiI10X().put(b01.XOXiX0, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean uploadToZewaFitPop$lambda$0$1() {
        a01.OXO1.IiI10X().put(b01.XOXiX0, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void userMigrate() {
    }

    public void bottomRemoveItem() {
        if (i72.OXO1.OXi001()) {
            return;
        }
        getBottomNav().getMenu().removeItem(R.id.item_bottom_ai);
    }

    public final boolean calculateDistance(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = 2;
        double d6 = radians / d5;
        double d7 = radians2 / d5;
        double dSin = (Math.sin(d6) * Math.sin(d6)) + (Math.cos(d) * Math.cos(d3) * Math.sin(d7) * Math.sin(d7));
        double d8 = 1000;
        double dAtan2 = ((double) 6371) * d5 * Math.atan2(Math.sqrt(dSin), Math.sqrt(((double) 1) - dSin)) * d8;
        boolean z = dAtan2 > d8;
        LogUtils.m11128d("requestWeather  distance = " + dAtan2 + " result = " + z);
        return z;
    }

    public final void checkBluetoothPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            hr1 hr1Var = hr1.OXO1;
            if (hr1Var.i11I(this) || !BleConnector.INSTANCE.isBound()) {
                return;
            }
            hr1Var.m1930OX(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.IO01i0X0X
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseMainActivity.checkBluetoothPermission$lambda$0(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final void checkClassicConnect(boolean z) {
        if (Build.VERSION.SDK_INT >= 31 && !hr1.OXO1.i11I(this)) {
            LogUtils.m11128d("checkClassicConnect -> Need BLUETOOTH permission!!!!");
            return;
        }
        q62 q62Var = q62.OXO1;
        if (!q62Var.I1Ii()) {
            if (z) {
                return;
            }
            permissionCheckPopup();
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        BleConnector bleConnector = BleConnector.INSTANCE;
        boolean zIsBoundClassic = bleConnector.isBoundClassic();
        booleanRef.element = zIsBoundClassic;
        if (zIsBoundClassic) {
            classicNotePopup();
            return;
        }
        if (z) {
            if (bleConnector.isAvailable() && q62Var.OIOIi1XO()) {
                BaseBleConnector.sendInt8$default(bleConnector, BleKey.CLASSIC_BLUETOOTH_STATE, BleKeyFlag.UPDATE, 1, false, false, 24, null);
            } else {
                bleConnector.connectClassic();
            }
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I0I0O0
            @Override // java.lang.Runnable
            public final void run() {
                BaseMainActivity.checkClassicConnect$lambda$0(this.f1104IO, booleanRef);
            }
        }, 15000L);
    }

    @sf5(tag = b01.IiI10X)
    public final void checkFirmwareUpgradeStatus(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("checkFirmwareUpgradeStatus");
        if (q62.OXO1.iii0() && a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false)) {
            if (this.mRepairPopup == null) {
                go0 go0Var = new go0(this, 0, 2, null);
                go0Var.I0iXXO(false);
                go0Var.O1O(R.string.check_firmware_upgrade_failed_tip);
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.firmware_repair, new Function0() { // from class: com.android.mltcode.paycertificationapi.X0X0i0OOI
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.checkFirmwareUpgradeStatus$lambda$0$0());
                    }
                });
                this.mRepairPopup = go0Var;
            }
            go0 go0Var2 = this.mRepairPopup;
            if (go0Var2 != null) {
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var2.I1XOi1(rootView);
            }
        }
    }

    @sf5(tag = b01.O00)
    public final void checkGPSFirmwareUpgradeStatus(@aa1 Object data) {
        go0 go0Var;
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("checkGPSFirmwareUpgradeStatus");
        if (q62.OXO1.m2891i1() && a01.OXO1.XIi00iiXO().getBoolean(b01.O00, false)) {
            if (this.mGPSRepairPopup == null) {
                go0 go0Var2 = new go0(this, 0, 2, null);
                go0Var2.I0iXXO(true);
                go0Var2.O1O(R.string.check_gps_firmware_upgrade_failed_tip);
                go0.X11iII1O1(go0Var2, null, null, 2, null);
                go0Var2.X1IX(R.string.firmware_repair, new Function0() { // from class: com.android.mltcode.paycertificationapi.IO1iO10
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.checkGPSFirmwareUpgradeStatus$lambda$0$0(this.f1784IO));
                    }
                });
                this.mGPSRepairPopup = go0Var2;
            }
            go0 go0Var3 = this.mGPSRepairPopup;
            if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mGPSRepairPopup) != null) {
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var.I1XOi1(rootView);
            }
        }
    }

    public final boolean checkNotificationPermission() {
        boolean zO00 = MyNotificationListenerService.O001I.O00(getMContext());
        if (!zO00) {
            if (this.mNotificationPopup == null) {
                go0 go0Var = new go0(this, 0, 2, null);
                String string = getString(R.string.allow_notification_access, getString(R.string.app_name));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                go0Var.m1864iI(string);
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.IIX0O
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.checkNotificationPermission$lambda$0$0$0(this.f1640IO));
                    }
                });
                this.mNotificationPopup = go0Var;
            }
            if (BleConnector.INSTANCE.isBound()) {
                go0 go0Var2 = this.mNotificationPopup;
                if (go0Var2 != null) {
                    RelativeLayout rootView = getRootView();
                    Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                    go0Var2.I1XOi1(rootView);
                }
                a01.OXO1.IiI10X().put(b01.IiiXiI0I, false);
            }
        }
        return zO00;
    }

    public void checkPermission() {
        if ((a01.OXO1.IiI10X().getBoolean(b01.IiiXiI0I, true) || BleConnector.INSTANCE.isBound()) && checkNotificationPermission()) {
            checkStatusBarNotificationPermission();
        }
        checkBluetoothPermission();
        checkPostNotificationsPermission();
    }

    public final void checkPostNotificationsPermission() {
        hr1 hr1Var = hr1.OXO1;
        if (hr1Var.IXOIIIO(this) || !a01.OXO1.IiI10X().getBoolean(b01.IXI, true)) {
            return;
        }
        hr1Var.Ii1iii0(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.XXXXX1I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseMainActivity.checkPostNotificationsPermission$lambda$0(((Boolean) obj).booleanValue());
            }
        });
    }

    public final boolean checkStatusBarNotificationPermission() {
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(getMContext()).areNotificationsEnabled();
        if (!zAreNotificationsEnabled) {
            if (this.mStatusBarNotificationPopup == null) {
                go0 go0Var = new go0(this, 0, 2, null);
                String string = getString(R.string.allow_status_bar_notification_access);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                go0Var.m1864iI(string);
                go0.X11iII1O1(go0Var, null, null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OOX0iOi00
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.checkStatusBarNotificationPermission$lambda$0$0$0(this.f3316IO));
                    }
                });
                this.mStatusBarNotificationPopup = go0Var;
            }
            go0 go0Var2 = this.mStatusBarNotificationPopup;
            if (go0Var2 != null) {
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var2.I1XOi1(rootView);
            }
        }
        return zAreNotificationsEnabled;
    }

    public final void clearSubContent() {
        int backStackEntryCount = getSupportFragmentManager().getBackStackEntryCount();
        if (backStackEntryCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            getSupportFragmentManager().popBackStack();
            if (i == backStackEntryCount) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void dismissRepairPopup() {
        go0 go0Var;
        go0 go0Var2 = this.mRepairPopup;
        if (go0Var2 != null && go0Var2.isShowing() && (go0Var = this.mRepairPopup) != null) {
            go0Var.dismiss();
        }
        a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
    }

    public final BottomNavigationView getBottomNav() {
        return (BottomNavigationView) this.bottomNav$delegate.getValue();
    }

    @tb1
    public final c72 getMAGpsPopup() {
        return this.mAGpsPopup;
    }

    public final RelativeLayout getRootView() {
        return (RelativeLayout) this.rootView$delegate.getValue();
    }

    @aa1
    public final MainStatusFragment getStatusFragment() {
        MainStatusFragment mainStatusFragment = this.statusFragment;
        if (mainStatusFragment != null) {
            return mainStatusFragment;
        }
        Intrinsics.XXO("statusFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        i1O0OXO1O.OXO1.OXO1("locale -> " + getResources().getConfiguration().locale);
        if (i72.OXO1.XOO0Xi()) {
            GoogleHealth googleHealth = new GoogleHealth(this);
            googleHealth.OIi0();
            this.mGoogleHealth = googleHealth;
        }
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.addHandleCallback(this.mBleHandleCallback);
        if (q62.OXO1.O00OXOXO() && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            com.sma.smartv3.biz.OXO1.C22035OXO1 c22035oxo1 = com.sma.smartv3.biz.OXO1.XOO0ii0;
            c22035oxo1.OXO1().I0iXXO();
            com.sma.smartv3.biz.OXO1.I1XOi1(c22035oxo1.OXO1(), 0, 0, null, 4, null);
        }
        if (bleConnector.isBound()) {
            DeviceInfoChecker.O10IXXX0X(DeviceInfoChecker.OXO1, null, null, 3, null);
            BleInitializer.f51208IO.XOO0XOOii();
            onCheckBindSuccess(new Object());
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public List<Fragment> initFragments() {
        setStatusFragment(new MainStatusFragment());
        ArrayList arrayList = new ArrayList();
        arrayList.add(getStatusFragment());
        i72 i72Var = i72.OXO1;
        if (i72Var.IOI0i0I()) {
            arrayList.add(new SportFragment());
            MenuItem menuItemFindItem = getBottomNav().getMenu().findItem(R.id.item_bottom_sport);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(true);
            }
        } else {
            getBottomNav().getMenu().removeItem(R.id.item_bottom_sport);
        }
        if (i72Var.OXi001()) {
            arrayList.add(new AIFragment());
            MenuItem menuItemFindItem2 = getBottomNav().getMenu().findItem(R.id.item_bottom_ai);
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setVisible(true);
            }
        } else {
            getBottomNav().getMenu().removeItem(R.id.item_bottom_ai);
        }
        arrayList.add(new DeviceFragment());
        arrayList.add(new MainMeFragment());
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (i72.OXO1.Ii0i()) {
            q62.OXO1.iI1XiXiII(this);
            return;
        }
        setupBottomNavigationBar();
        dataOperating();
        setupSubContentContainer();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_main;
    }

    @sf5(tag = I01XX0.i0X1iIO)
    public final void onCheckBindSuccess(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290041(null), 3, null);
    }

    @sf5(tag = I01XX0.IXI)
    public final void onClassicConnect(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onClassicConnect");
        checkClassicConnect(false);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
        GoogleHealth googleHealth = this.mGoogleHealth;
        if (googleHealth != null) {
            googleHealth.I0iXXO();
        }
    }

    @sf5(tag = I01XX0.i0X000X0O)
    public final void onFindPhone(@aa1 Object data) {
        go0 go0Var;
        Intrinsics.X0O(data, "data");
        if (this.mFindPhonePopup == null) {
            go0 go0Var2 = new go0(this, 0, 2, null);
            go0Var2.I0iXXO(false);
            go0Var2.IXXOO(1);
            go0Var2.m1865iX(Integer.valueOf(R.string.find_watch_success));
            go0.X11iII1O1(go0Var2, null, null, 2, null);
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.IIO0OIi
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.onFindPhone$lambda$0$0());
                }
            });
            this.mFindPhonePopup = go0Var2;
        }
        go0 go0Var3 = this.mFindPhonePopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mFindPhonePopup) != null) {
            RelativeLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var.I1XOi1(rootView);
        }
    }

    @sf5(tag = I01XX0.iOiXi11II)
    public final void onFirmwareRepair(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onFirmwareRepair");
        if (!q62.OXO1.m2885Oi().isEmpty()) {
            startActivity(new Intent(this, (Class<?>) FirmwareRepairModeActivity.class));
            return;
        }
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_NORDIC)) {
            startActivity(new Intent(this, (Class<?>) FirmwareRepairNActivity.class));
            return;
        }
        if (Intrinsics.XOO0ii0(bleCache.getMPrototype(), BleDeviceInfo.PROTOTYPE_R3Q)) {
            startActivity(new Intent(this, (Class<?>) FirmwareRepairGQActivity.class));
            return;
        }
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL)) {
            a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(bleCache.getMDeviceInfo()));
            startActivity(new Intent(this, (Class<?>) FirmwareRepairSearchActivity.class));
            return;
        }
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI)) {
            a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(bleCache.getMDeviceInfo()));
            startActivity(new Intent(this, (Class<?>) FirmwareRepairSActivity.class));
            return;
        }
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707)) {
            a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(bleCache.getMDeviceInfo()));
            startActivity(new Intent(this, (Class<?>) FirmwareRepairSearchActivity.class));
            return;
        }
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(bleCache.getMDeviceInfo()));
            startActivity(new Intent(this, (Class<?>) FirmwareRepairSearchActivity.class));
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            ClickUtils.back2HomeFriendly(getString(R.string.back2home));
        } else {
            super.onHandleBackPressed();
        }
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        dataOperating();
        HykyManager.Companion.getInstance().checkAuthStatus(this);
    }

    public void onOpenSportOnGoingActivity(@aa1 BleDeviceSportData deviceSportData) {
        Intrinsics.X0O(deviceSportData, "deviceSportData");
        if (XO0O10.OXO1.m38657OO() || !q62.OXO1.XO11XXOi()) {
            return;
        }
        int mMode = deviceSportData.getMMode();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mMode);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", deviceSportData);
        Intent intent = new Intent(this, (Class<?>) SportOnGoingGpsActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @sf5(tag = I01XX0.X00XIX1)
    public final void onPackageStatus(@aa1 Object data) {
        go0 go0Var;
        go0 go0Var2;
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onPackageStatus data = " + data);
        BlePackageStatus blePackageStatus = (BlePackageStatus) data;
        int mUIPackageStatus = blePackageStatus.getMUIPackageStatus();
        Integer numValueOf = Integer.valueOf(R.string.cancel);
        if (mUIPackageStatus == 1) {
            if (this.mUIPackageStatusPopup == null) {
                go0 go0Var3 = new go0(this, 0, 2, null);
                go0Var3.I0iXXO(false);
                go0Var3.O1O(R.string.check_device_repair_title);
                go0Var3.m1865iX(Integer.valueOf(R.string.check_device_repair_tip));
                go0.X11iII1O1(go0Var3, numValueOf, null, 2, null);
                go0Var3.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XIX
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.onPackageStatus$lambda$0$0(this.f1451IO));
                    }
                });
                this.mUIPackageStatusPopup = go0Var3;
            }
            go0 go0Var4 = this.mUIPackageStatusPopup;
            if ((go0Var4 == null || !go0Var4.isShowing()) && (go0Var2 = this.mUIPackageStatusPopup) != null) {
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var2.I1XOi1(rootView);
                return;
            }
            return;
        }
        if (blePackageStatus.getMFontPackageStatus() == 1) {
            if (this.mFontPackageStatusPopup == null) {
                go0 go0Var5 = new go0(this, 0, 2, null);
                go0Var5.I0iXXO(false);
                go0Var5.O1O(R.string.check_device_repair_title);
                go0Var5.m1865iX(Integer.valueOf(R.string.check_font_package_status_tip));
                go0.X11iII1O1(go0Var5, numValueOf, null, 2, null);
                go0Var5.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iO11
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(BaseMainActivity.onPackageStatus$lambda$1$0(this.f8022IO));
                    }
                });
                this.mFontPackageStatusPopup = go0Var5;
            }
            go0 go0Var6 = this.mFontPackageStatusPopup;
            if ((go0Var6 == null || !go0Var6.isShowing()) && (go0Var = this.mFontPackageStatusPopup) != null) {
                RelativeLayout rootView2 = getRootView();
                Intrinsics.O10IXXX0X(rootView2, "<get-rootView>(...)");
                go0Var.I1XOi1(rootView2);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mHandler.removeMessages(this.delayTimeTask);
    }

    @sf5(tag = I01XX0.O001I)
    public final void onPostHealthConnect(@aa1 Object data) {
        GoogleHealth googleHealth;
        Intrinsics.X0O(data, "data");
        LogUtils.m11130i("onPostHealthConnect ");
        if (i72.OXO1.XOO0Xi() && (googleHealth = this.mGoogleHealth) != null) {
            googleHealth.OIX0iXi();
        }
    }

    @sf5(tag = I01XX0.iXi)
    public void onRefreshMain(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onRefreshMain");
        refreshMainBottomNav$default(this, 0, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void onShowEvaluationStatus() {
        I0iiIOX i0iiIOX;
        this.mHandler.removeMessages(this.delayTimeTask);
        if (i72.OXO1.O0O0X0iOi() && EvaluationKt.isShowEvaluationDialog()) {
            if (this.mEvaluationPopup == null) {
                this.mEvaluationPopup = new I0iiIOX(this, 0, 2, null);
            }
            I0iiIOX i0iiIOX2 = this.mEvaluationPopup;
            if ((i0iiIOX2 == null || !i0iiIOX2.isShowing()) && (i0iiIOX = this.mEvaluationPopup) != null) {
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                i0iiIOX.XiOIO(rootView);
            }
        }
    }

    @sf5(tag = I01XX0.XOO0XOOii)
    public final void onShowLocationPopup(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onShowLocationPopup");
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.XO0X10iO, true) && hr1.OXO1.i0X000X0O(this)) {
            go0 go0Var = this.locationPopup;
            if (go0Var == null || !go0Var.isShowing()) {
                if (this.locationPopup == null) {
                    go0 go0Var2 = new go0(this, 0, 2, null);
                    String string = getString(R.string.background_location_permission_popup_tip, AppUtils.getAppName());
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    go0Var2.m1864iI(string);
                    go0.X11iII1O1(go0Var2, null, null, 2, null);
                    go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1O1X1OI
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2() {
                            return Boolean.valueOf(BaseMainActivity.onShowLocationPopup$lambda$0$0());
                        }
                    });
                    this.locationPopup = go0Var2;
                }
                go0 go0Var3 = this.locationPopup;
                if (go0Var3 != null) {
                    go0Var3.X0O(R.id.root_view);
                }
            }
        }
    }

    @sf5(tag = I01XX0.f1089Oi)
    public final void onShowSportDetail(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onShowSportDetail " + data);
        if (data instanceof Integer) {
            if (i72.OXO1.iIXX0i()) {
                getMContext().startActivity(new Intent(getMContext(), (Class<?>) SportDetailV2Activity.class).putExtra("mArg1", ((Number) data).intValue()));
            } else {
                getMContext().startActivity(new Intent(getMContext(), (Class<?>) SportDetailActivity.class).putExtra("mArg1", ((Number) data).intValue()));
            }
        }
    }

    @sf5(tag = I01XX0.IO0iXO0O)
    public final void onShowSyncAgpsPopup(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onShowSyncAgpsPopup");
        if (this.mAGpsPopupReminder == null) {
            go0 go0Var = new go0(this, R.layout.pop_message);
            go0Var.O1O(R.string.agps_upgrade_title);
            go0Var.m1865iX(Integer.valueOf(R.string.agps_upgrade_describe));
            go0Var.IXXOO(1);
            go0Var.I0iXXO(false);
            go0Var.iX1O1(null, new Function0() { // from class: com.android.mltcode.paycertificationapi.XIIOXXI0X
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.onShowSyncAgpsPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.sync, new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OXXIIO1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseMainActivity.onShowSyncAgpsPopup$lambda$0$1(this.f2762IO));
                }
            });
            this.mAGpsPopupReminder = go0Var;
        }
        go0 go0Var2 = this.mAGpsPopupReminder;
        Intrinsics.XXI(go0Var2);
        if (go0Var2.isShowing()) {
            return;
        }
        go0 go0Var3 = this.mAGpsPopupReminder;
        Intrinsics.XXI(go0Var3);
        RelativeLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var3.I1XOi1(rootView);
    }

    @sf5(tag = I01XX0.O0O0X0iOi)
    public final void onSyncAgps(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onSyncAgps");
        showSyncAGPS();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d(I01XX0.XXiIiX10);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.isFocusChanged = z;
    }

    public void parseUserInfo(@tb1 AppUser appUser) {
        if (!Intrinsics.O00(appUser != null ? Float.valueOf(appUser.getHeight()) : null, 0.0f)) {
            if (!Intrinsics.O00(appUser != null ? Float.valueOf(appUser.getWeight()) : null, 0.0f)) {
                if ((appUser != null ? appUser.getEmail() : null) == null || appUser.getEmail().length() == 0) {
                    i72.OXO1.OI1O(this);
                    return;
                }
                return;
            }
        }
        toPersonalInformationActivity();
    }

    public void refreshMainBottomNav(int i) {
        BottomNavigationView bottomNav;
        Runnable runnable;
        if (this.isRefreshingBottomNav) {
            return;
        }
        this.isRefreshingBottomNav = true;
        try {
            boolean z = getBottomNav().getMenu().findItem(R.id.item_bottom_sport) != null;
            i72 i72Var = i72.OXO1;
            boolean zIOI0i0I = i72Var.IOI0i0I();
            boolean z2 = getBottomNav().getMenu().findItem(R.id.item_bottom_ai) != null;
            boolean zOXi001 = i72Var.OXi001();
            boolean z3 = a01.OXO1.m1440iO().getBoolean(b01.OIi0) == q62.OXO1.X0OXOI();
            if (z == zIOI0i0I && z2 == zOXi001 && z3) {
                bottomNav = getBottomNav();
                runnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi0Xi1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3641IO.isRefreshingBottomNav = false;
                    }
                };
            } else {
                int selectedItemId = getBottomNav().getSelectedItemId();
                FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.O10IXXX0X(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                List<Fragment> fragments = getSupportFragmentManager().getFragments();
                Intrinsics.O10IXXX0X(fragments, "getFragments(...)");
                Iterator<T> it = fragments.iterator();
                while (it.hasNext()) {
                    fragmentTransactionBeginTransaction.remove((Fragment) it.next());
                }
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                getMFragmentPagerAdapter().cleanFragment();
                getBottomNav().getMenu().clear();
                getBottomNav().inflateMenu(R.menu.bottom_nav);
                BaseFragmentPagerAdapter baseFragmentPagerAdapter = new BaseFragmentPagerAdapter(this);
                getMViewPager().setAdapter(baseFragmentPagerAdapter);
                getMViewPager().setOffscreenPageLimit(baseFragmentPagerAdapter.getCount());
                setMFragmentPagerAdapter(baseFragmentPagerAdapter);
                Menu menu = getBottomNav().getMenu();
                Intrinsics.O10IXXX0X(menu, "getMenu(...)");
                int size = menu.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (selectedItemId == menu.getItem(i2).getItemId()) {
                        getMViewPager().setCurrentItem(i2);
                    }
                }
                bottomNav = getBottomNav();
                runnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi0Xi1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3641IO.isRefreshingBottomNav = false;
                    }
                };
            }
            bottomNav.post(runnable);
        } catch (Throwable th) {
            getBottomNav().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi0Xi1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3641IO.isRefreshingBottomNav = false;
                }
            });
            throw th;
        }
    }

    public void setBottomNavItem() {
        getBottomNav().setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.android.mltcode.paycertificationapi.O00XXX
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return BaseMainActivity.setBottomNavItem$lambda$0(this.OXO1, menuItem);
            }
        });
    }

    public final void setMAGpsPopup(@tb1 c72 c72Var) {
        this.mAGpsPopup = c72Var;
    }

    public final void setStatusFragment(@aa1 MainStatusFragment mainStatusFragment) {
        Intrinsics.X0O(mainStatusFragment, "<set-?>");
        this.statusFragment = mainStatusFragment;
    }

    public final void setupSubContentContainer() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, R.id.bottomNav);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.sub_content);
        getRootView().addView(frameLayout, layoutParams);
    }

    public final void showAILackingTip(int i) throws IllegalAccessException, InstantiationException {
        i72 i72Var = i72.OXO1;
        if (i72Var.IIII0iI() && i72Var.IOX1() && i72Var.IOI0i0I() && i72Var.OXi001() && i == 2) {
            a01 a01Var = a01.OXO1;
            long j = a01Var.IiI10X().getLong(b01.IOIi00, 0L);
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
            if (objFromJson == null) {
                objFromJson = UserMember.class.newInstance();
            }
            UserMember userMember = (UserMember) objFromJson;
            i1O0OXO1O.OXO1.OXO1("main showAILackingTip  mIsShowTime = " + j + " mUserMember = " + userMember);
            if (userMember.getLatestDateTime() > 0) {
                OrderManager orderManager = OrderManager.OXO1;
                if (OrderManager.O00(orderManager, userMember.getLatestDateTime(), 0, 2, null) && orderManager.IiI10X(j, 1)) {
                    a01Var.IiI10X().put(b01.IOIi00, System.currentTimeMillis());
                    go0 go0Var = new go0(this, 0, 2, null);
                    go0Var.O1O(R.string.tip);
                    go0Var.m1865iX(Integer.valueOf(R.string.ai_benefits_about_expire));
                    go0Var.IXXOO(1);
                    go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
                    go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.O100O
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2() {
                            return Boolean.valueOf(BaseMainActivity.showAILackingTip$lambda$0$0(this.f2614IO));
                        }
                    });
                    go0Var.IIX1OXO();
                }
            }
        }
    }

    public void showSyncAGPS() {
        c72 progressBackCallBack = setProgressBackCallBack(this.mAGpsPopup);
        this.mAGpsPopup = progressBackCallBack;
        if (progressBackCallBack != null) {
            progressBackCallBack.m1591I1(R.string.downloading);
            progressBackCallBack.m1592OX(0);
            RelativeLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            progressBackCallBack.I1XOi1(rootView);
        }
        AGPSInitializer.f51206IO.m38214OX(false, this.mAGpsPopup);
    }

    public void viewPagerSelected(int i) {
        showAILackingTip(i);
    }
}
