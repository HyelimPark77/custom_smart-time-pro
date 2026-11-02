package com.sma.smartv3.ui.main;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0I0O0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.I11OI0I;
import com.android.mltcode.paycertificationapi.I1XII0;
import com.android.mltcode.paycertificationapi.I1XIX;
import com.android.mltcode.paycertificationapi.II0iI1;
import com.android.mltcode.paycertificationapi.IIO0OIi;
import com.android.mltcode.paycertificationapi.IIX0O;
import com.android.mltcode.paycertificationapi.IIiOi10iO;
import com.android.mltcode.paycertificationapi.IO01i0X0X;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.IO1iO10;
import com.android.mltcode.paycertificationapi.IOOXIOO;
import com.android.mltcode.paycertificationapi.IOXO00i;
import com.android.mltcode.paycertificationapi.IX1O;
import com.android.mltcode.paycertificationapi.Ii1iOO;
import com.android.mltcode.paycertificationapi.Iii010I1X;
import com.android.mltcode.paycertificationapi.O00XXX;
import com.android.mltcode.paycertificationapi.O011OI;
import com.android.mltcode.paycertificationapi.O100O;
import com.android.mltcode.paycertificationapi.O1OXXIIO1;
import com.android.mltcode.paycertificationapi.O1XIOXO1i;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIX11X;
import com.android.mltcode.paycertificationapi.OO0iO1Oi0;
import com.android.mltcode.paycertificationapi.OOX0iOi00;
import com.android.mltcode.paycertificationapi.OOiO;
import com.android.mltcode.paycertificationapi.OXI0X0;
import com.android.mltcode.paycertificationapi.OXOIOO0I;
import com.android.mltcode.paycertificationapi.Oi00I;
import com.android.mltcode.paycertificationapi.Oi0Xi1;
import com.android.mltcode.paycertificationapi.Oi1XIi00i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0X0i0OOI;
import com.android.mltcode.paycertificationapi.X0Xi;
import com.android.mltcode.paycertificationapi.X0i1iX1;
import com.android.mltcode.paycertificationapi.X11O;
import com.android.mltcode.paycertificationapi.X1I01;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.X1iiI1Xi;
import com.android.mltcode.paycertificationapi.XI1O1X1OI;
import com.android.mltcode.paycertificationapi.XIIOXXI0X;
import com.android.mltcode.paycertificationapi.XXIiI1i;
import com.android.mltcode.paycertificationapi.XXXXX1I;
import com.android.mltcode.paycertificationapi.XiOOO10O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0i1O;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1i100XI;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI1O0i1O;
import com.android.mltcode.paycertificationapi.iO0XiOIi;
import com.android.mltcode.paycertificationapi.iO11;
import com.android.mltcode.paycertificationapi.iiIX1;
import com.android.mltcode.paycertificationapi.iiOX1O0;
import com.android.mltcode.paycertificationapi.lq6;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.biz.ad.ADPAdManager;
import com.sma.smartv3.biz.fitness_site.google.GoogleHealth;
import com.sma.smartv3.biz.fitness_site.hyky.HykyManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.AGPSInitializer;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.AppVersion;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserInfo;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.fragment.AIFragment;
import com.sma.smartv3.ui.device.CameraActivity;
import com.sma.smartv3.ui.device.DeviceFragment;
import com.sma.smartv3.ui.device.FirmwareRepairGQActivity;
import com.sma.smartv3.ui.device.FirmwareRepairModeActivity;
import com.sma.smartv3.ui.device.FirmwareRepairNActivity;
import com.sma.smartv3.ui.device.FirmwareRepairSActivity;
import com.sma.smartv3.ui.device.FirmwareRepairSearchActivity;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.ui.me.MainMeFragment;
import com.sma.smartv3.ui.me.PermissionSettingsActivity;
import com.sma.smartv3.ui.sport.SportDetailActivity;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.ui.sport.SportFragment;
import com.sma.smartv3.ui.sport.SportOnGoingGpsActivity;
import com.sma.smartv3.ui.sport.XO0O10;
import com.sma.smartv3.ui.status.MainStatusFragment;
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
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBaseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,1546:1\n87#2,7:1547\n94#2,3:1555\n70#2,7:1558\n97#2:1565\n69#2,3:1628\n72#2,5:1632\n69#2,3:1637\n72#2,5:1641\n69#2,3:1648\n72#2,5:1652\n69#2,3:1659\n72#2,5:1663\n69#2,3:1670\n72#2,5:1674\n69#2,3:1681\n72#2,5:1685\n69#2,3:1690\n72#2,5:1694\n87#2,7:1704\n94#2,3:1712\n70#2,7:1715\n97#2:1722\n69#2,3:1729\n72#2,5:1733\n1#3:1554\n1#3:1631\n1#3:1640\n1#3:1651\n1#3:1662\n1#3:1673\n1#3:1684\n1#3:1693\n1#3:1711\n1#3:1732\n93#4,2:1566\n90#4:1568\n11#4,2:1569\n11#4,2:1646\n11#4,2:1657\n11#4,2:1668\n11#4,2:1679\n19#4:1699\n15#4:1700\n90#4:1701\n19#4:1702\n15#4:1703\n11#4,2:1727\n108#5,7:1571\n123#5:1601\n176#5,11:1602\n196#5:1621\n116#6,23:1578\n252#6,7:1613\n270#6:1620\n1869#7,2:1622\n64#8,4:1624\n64#8,4:1723\n*S KotlinDebug\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity\n*L\n209#1:1547,7\n209#1:1555,3\n209#1:1558,7\n209#1:1565\n1197#1:1628,3\n1197#1:1632,5\n1199#1:1637,3\n1199#1:1641,5\n1202#1:1648,3\n1202#1:1652,5\n1205#1:1659,3\n1205#1:1663,5\n1208#1:1670,3\n1208#1:1674,5\n1211#1:1681,3\n1211#1:1685,5\n1214#1:1690,3\n1214#1:1694,5\n497#1:1704,7\n497#1:1712,3\n497#1:1715,7\n497#1:1722\n915#1:1729,3\n915#1:1733,5\n209#1:1554\n1197#1:1631\n1199#1:1640\n1202#1:1651\n1205#1:1662\n1208#1:1673\n1211#1:1684\n1214#1:1693\n497#1:1711\n915#1:1732\n484#1:1566,2\n484#1:1568\n520#1:1569,2\n1201#1:1646,2\n1204#1:1657,2\n1207#1:1668,2\n1210#1:1679,2\n1277#1:1699\n1277#1:1700\n1497#1:1701\n324#1:1702\n324#1:1703\n523#1:1727,2\n622#1:1571,7\n622#1:1601\n661#1:1602,11\n661#1:1621\n622#1:1578,23\n661#1:1613,7\n661#1:1620\n1163#1:1622,2\n1176#1:1624,4\n509#1:1723,4\n*E\n"})
public class BaseMainActivity extends BaseFragmentPagerActivity {

    @aa1
    private final OXO1 bleHandleCallback;

    @aa1
    private final Lazy bottomNav$delegate;
    private final int delayTimeTask;
    private boolean isFocusChanged;
    private boolean isRefreshingBottomNav;
    private boolean isToPersonalInfo;
    private ImageView ivRemind;

    @tb1
    private go0 locationPopup;

    @tb1
    private c72 mAGpsPopup;

    @tb1
    private go0 mAGpsPopupReminder;

    @aa1
    private final XIi00iiXO mBleHandleCallback;

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

    @aa1
    private Handler mHandler;

    @tb1
    private ms mLocationClient;

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

    @aa1
    private final Lazy mainHandler$delegate;

    @aa1
    private final Runnable refreshRunnable;

    @aa1
    private final Lazy rootView$delegate;
    public MainStatusFragment statusFragment;

    public static final class OXO1 implements BleHandleCallback {
        public final /* synthetic */ BaseMainActivity IO;

        public OXO1(BaseMainActivity r1) {
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
        public /* bridge */ void onSessionStateChange(boolean r1) {
            super.onSessionStateChange(r1);
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
        public void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            Intrinsics.X0O(r5, "bleKey");
            if (r1 == false) goto L8;
            if (r3 <= 0) goto L8;
            c72 r6 = this.IO.getMAGpsPopup();
            if (r6 == null) goto L8;
            r6.OX((r4 * 100) / r3);
        L8:
            if (r1 == false) goto L10;
            if (r3 == r4) goto L10;
            return;
        L10:
            c72 r7 = this.IO.getMAGpsPopup();
            if (r7 != null) goto L13;
            return;
        L13:
            if (r7.isShowing() == false) goto L18;
            r7.dismiss();
            return;
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

    @SourceDebugExtension({"SMAP\nBaseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$mBleHandleCallback$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1546:1\n69#2,3:1547\n72#2,5:1551\n1#3:1550\n*S KotlinDebug\n*F\n+ 1 BaseMainActivity.kt\ncom/sma/smartv3/ui/main/BaseMainActivity$mBleHandleCallback$1\n*L\n191#1:1547,3\n191#1:1551,5\n191#1:1550\n*E\n"})
    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ BaseMainActivity IO;

        public XIi00iiXO(BaseMainActivity r1) {
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
        public void onCameraStateChange(int r7) {
            boolean r0 = AppUtils.isAppForeground();
            i1O0OXO1O r1 = i1O0OXO1O.OXO1;
            BleInitializer r2 = BleInitializer.IO;
            r1.OXO1("main onCameraStateChange -> " + r2.iX01() + ", " + r7 + ", " + r0);
            if (r0 == true) goto L6;
            return;
        L6:
            if (r7 == 1) goto L8;
            r2.i0101i(false);
            return;
        L8:
            if (r2.iX01() == true) goto L13;
            r2.i0101i(true);
            BaseMainActivity r8 = this.IO;
            r8.startActivity(new Intent(r8, CameraActivity.class));
            return;
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
        public void onDeviceSportDataUpdate(BleDeviceSportData r2) {
            Intrinsics.X0O(r2, "deviceSportData");
            this.IO.onOpenSportOnGoingActivity(r2);
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
        public void onSessionStateChange(boolean r2) {
            if (r2 == false) goto L5;
            this.IO.dismissRepairPopup();
            this.IO.checkGPSFirmwareUpgradeStatus(new Object());
            return;
        L5:
            go0 r3 = BaseMainActivity.access$getMAGpsPopupReminder$p(this.IO);
            if (r3 != null) goto L8;
            return;
        L8:
            if (r3.isShowing() != true) goto L14;
            go0 r4 = BaseMainActivity.access$getMAGpsPopupReminder$p(this.IO);
            if (r4 == null) goto L15;
            r4.dismiss();
            return;
        L15:
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

    public static final class iO implements IO0OI {
        public final /* synthetic */ BaseMainActivity OXO1;

        public iO(BaseMainActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation r6) {
            Intrinsics.X0O(r6, "location");
            BaseMainActivity.access$requestWeatherLocation(this.OXO1, r6.IiI10X(), r6.XO0O10());
            BaseMainActivity.access$stopLocationClient(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String r4) {
            Intrinsics.X0O(r4, "message");
            i1O0OXO1O.OXO1.OXO1("requestWeather -> CustomLocationCallback onError message=" + r4);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.BaseMainActivity$onCheckBindSuccess$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.main.BaseMainActivity$onCheckBindSuccess$1", f = "BaseMainActivity.kt", i = {}, l = {957}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34711 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseMainActivity this$0;

        public C34711(BaseMainActivity r1, Continuation<? super C34711> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34711(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34711) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L11:
            HykyManager.Companion.getInstance().checkAuthStatus(this.this$0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            this.label = 1;
            if (DelayKt.XIi00iiXO(2000, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public BaseMainActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new i1i100XI(this));
        this.bottomNav$delegate = LazyKt__LazyJVMKt.iO(new iO0XiOIi(this));
        this.isFocusChanged = true;
        this.delayTimeTask = 254;
        this.mHandler = new Handler(Looper.getMainLooper(), new I1XII0(this));
        this.mBleHandleCallback = new XIi00iiXO(this);
        this.bleHandleCallback = new OXO1(this);
        this.refreshRunnable = new Oi00I(this);
        this.mainHandler$delegate = LazyKt__LazyJVMKt.iO(new Ii1iOO(this));
    }

    public static /* synthetic */ void I0iXXO(BaseMainActivity r0, Ref.BooleanRef r1) {
        checkClassicConnect$lambda$0(r0, r1);
    }

    public static /* synthetic */ void I1(BaseMainActivity r0, AppVersion r1) {
        checkAppVersion$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean I1XOi1() {
        return onShowLocationPopup$lambda$0$0();
    }

    public static /* synthetic */ void II1Xi0(BaseMainActivity r0) {
        dataOperating$lambda$0$3(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(BaseMainActivity r0) {
        return checkStatusBarNotificationPermission$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Unit IXXOO(boolean r0, boolean r1) {
        return dataOperating$lambda$0$4$0(r0, r1);
    }

    public static /* synthetic */ void Ii1iii0(BaseMainActivity r0) {
        dataOperating$lambda$0$5(r0);
    }

    public static /* synthetic */ boolean O001I(BaseMainActivity r0) {
        return permissionCheckPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X() {
        return uploadToZewaFitPop$lambda$0$1();
    }

    public static /* synthetic */ boolean O1O() {
        return checkDeviceSecurity$lambda$0$0$0();
    }

    public static /* synthetic */ boolean OII(BaseMainActivity r0) {
        return onShowSyncAgpsPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean OIX0iXi() {
        return onShowSyncAgpsPopup$lambda$0$0();
    }

    public static /* synthetic */ boolean OO(BaseMainActivity r0) {
        return checkGPSFirmwareUpgradeStatus$lambda$0$0(r0);
    }

    public static /* synthetic */ void OX(BaseMainActivity r0) {
        dataOperating$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX110i(boolean r0) {
        return checkPostNotificationsPermission$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(BaseMainActivity r0) {
        refreshRunnable$lambda$0(r0);
    }

    public static /* synthetic */ Handler X00XIX1(BaseMainActivity r0) {
        return mainHandler_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X01IiOiIi() {
        return onFindPhone$lambda$0$0();
    }

    public static /* synthetic */ void X0O(BaseMainActivity r0) {
        showWeChatOutLoginPopup$lambda$0$0$0(r0);
    }

    public static /* synthetic */ void X0i1O(BaseMainActivity r0) {
        dataOperating$lambda$0$4(r0);
    }

    public static /* synthetic */ boolean X100O(BaseMainActivity r0) {
        return onPackageStatus$lambda$0$0(r0);
    }

    public static /* synthetic */ void X11I(BaseMainActivity r0) {
        checkClassicConnect$lambda$0$0$1$0(r0);
    }

    public static /* synthetic */ boolean X11iII1O1(BaseMainActivity r0, MenuItem r1) {
        return setBottomNavItem$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean X1IX(BaseMainActivity r0) {
        return checkNotificationPermission$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Unit X1ii(BaseMainActivity r0, BleConnector r1) {
        return checkGPSFirmwareUpgradeStatus$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XOX0O0() {
        return uploadToZewaFitPop$lambda$0$0();
    }

    public static /* synthetic */ boolean XX0(BaseMainActivity r0) {
        return checkClassicConnect$lambda$0$0$0(r0);
    }

    public static /* synthetic */ boolean XX1Oi(BaseMainActivity r0) {
        return showAILackingTip$lambda$0$0(r0);
    }

    public static /* synthetic */ void XXI(BaseMainActivity r0) {
        dataOperating$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean XXIIO1i11(BaseMainActivity r0) {
        return classicNotePopup$lambda$0$0(r0);
    }

    public static /* synthetic */ void XXO(BaseMainActivity r0) {
        dataOperating$lambda$0$2(r0);
    }

    public static /* synthetic */ void XXX11i(BaseMainActivity r0) {
        refreshMainBottomNav$lambda$3(r0);
    }

    public static /* synthetic */ Unit XiOIO(BaseMainActivity r0) {
        return setProgressBackCallBack$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit XiOIii1(BaseMainActivity r0, AppVersion r1) {
        return checkAppVersion$lambda$0(r0, r1);
    }

    public static final /* synthetic */ go0 access$getMAGpsPopupReminder$p(BaseMainActivity r0) {
        return r0.mAGpsPopupReminder;
    }

    public static final /* synthetic */ void access$parseData(BaseMainActivity r0, c72 r1) {
        r0.parseData(r1);
    }

    public static final /* synthetic */ void access$requestWeatherLocation(BaseMainActivity r0, double r1, double r3) {
        r0.requestWeatherLocation(r1, r3);
    }

    public static final /* synthetic */ void access$showWeChatOutLoginPopup(BaseMainActivity r0) {
        r0.showWeChatOutLoginPopup();
    }

    public static final /* synthetic */ void access$stopLocationClient(BaseMainActivity r0) {
        r0.stopLocationClient();
    }

    public static final /* synthetic */ void access$toPersonalInformationActivity(BaseMainActivity r0) {
        r0.toPersonalInformationActivity();
    }

    private final void appUserUpdate(AppUser r6) {
        r6.setThirdPlatform(null);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        File r1 = uz0.I0IIOi(sz0.OXO1);
        final O1XIiIO<AppUser> r2 = new AnonymousClass1();
        final uq r3 = r0.loadPopup(this, getRootView());
        NetWork r4 = NetWork.OXO1;
        String r5 = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> r7 = new BaseMainActivity$appUserUpdate$$inlined$upload$1(this, r2, r3);
        ANRequest.MultiPartBuilder r8 = AndroidNetworking.upload(r5);
        if (r1.exists() == false) goto L5;
        r8.addMultipartFile("avatar", r1);
    L5:
        r8.addMultipartParameter(r6).setTag(r5).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new BaseMainActivity$appUserUpdate$$inlined$upload$2(r7));
    }

    private static final BottomNavigationView bottomNav_delegate$lambda$0(BaseMainActivity r1) {
        return (BottomNavigationView) r1.findViewById(R.id.bottomNav);
    }

    private final void checkAppVersion() {
        SPUtils r0 = a01.OXO1.OXO1();
        AppVersion r1 = new AppVersion(0, null, null, null, null, null, 0, 127, null);
        r0.put(AppVersion.class.getName(), new Gson().toJson(r1));
        DeviceInfoChecker.OXO1.iO(new O011OI(this));
    }

    private static final Unit checkAppVersion$lambda$0(final BaseMainActivity r3, final AppVersion r4) {
        Intrinsics.X0O(r4, "appVersion");
        a01.OXO1.OXO1().put(AppVersion.class.getName(), new Gson().toJson(r4));
        ImageView r0 = r3.ivRemind;
        if (r0 != null) goto L5;
        Intrinsics.XXO("ivRemind");
        r0 = null;
    L5:
        r0.setVisibility(0);
        I01XX0.XIi00iiXO(I01XX0.iIXi1iiXI, null, 2, null);
        r3.mHandler.postDelayed(new OIX11X(r3, r4), 5000);
        return Unit.OXO1;
    }

    private static final void checkAppVersion$lambda$0$0(final BaseMainActivity r5, final AppVersion r6) {
        go0 r0 = new go0(r5, 0, 2, null);
        r0.O1O(R.string.new_app_version_remind);
        r0.I0iXXO(false);
        if (r6.getFlag() != 1) goto L5;
        go0.X11iII1O1(r0, null, null, 2, null);
    L6:
        r0.X1IX(R.string.confirm, new OO0iO1Oi0(r5, r6));
        RelativeLayout r7 = r5.getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r0.I1XOi1(r7);
        return;
    L5:
        r0.iX1O1(Integer.valueOf(R.string.upgrade_later), new iiOX1O0());
        goto L6
    }

    private static final boolean checkAppVersion$lambda$0$0$0$0() {
        return true;
    }

    private static final boolean checkAppVersion$lambda$0$0$0$1(BaseMainActivity r0, AppVersion r1) {
        X1OOO.i010I(r0, r1.getFileUrl());
        return true;
    }

    private static final Unit checkBluetoothPermission$lambda$0(boolean r0) {
        if (r0 == false) goto L5;
        BleConnector.INSTANCE.launch();
    L5:
        return Unit.OXO1;
    }

    public static /* synthetic */ void checkClassicConnect$default(BaseMainActivity r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r0.checkClassicConnect(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkClassicConnect");
    }

    private static final void checkClassicConnect$lambda$0(final BaseMainActivity r5, Ref.BooleanRef r6) {
        if (r5.isFocusChanged == false) goto L17;
        BleConnector r0 = BleConnector.INSTANCE;
        boolean r1 = r0.isBoundClassic();
        r6.element = r1;
        if (r1 == false) goto L7;
        r5.classicNotePopup();
        return;
    L7:
        if (r5.mClassicConnectPopup != null) goto L10;
        go0 r7 = new go0(r5, 0, 2, null);
        String r2 = r5.getString(R.string.classic_connect_pop);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r7.iI(r2);
        go0.X11iII1O1(r7, Integer.valueOf(R.string.cancel), null, 2, null);
        r7.X1IX(R.string.settings, new IOXO00i(r5));
        r7.XXI(new Oi1XIi00i(r5));
        r5.mClassicConnectPopup = r7;
    L10:
        if (r0.isBound() == false) goto L18;
        go0 r8 = r5.mClassicConnectPopup;
        if (r8 == null) goto L19;
        RelativeLayout r9 = r5.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
        return;
    L19:
        return;
    L18:
        return;
    }

    private static final boolean checkClassicConnect$lambda$0$0$0(BaseMainActivity r2) {
        r2.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));     // Catch: Exception -> L4
        return true;
    L4:
        r2.startActivity(new Intent("android.settings.SETTINGS"));
        return true;
    }

    private static final Unit checkClassicConnect$lambda$0$0$1(final BaseMainActivity r4) {
        r4.mHandler.postDelayed(new II0iI1(r4), 3000);
        return Unit.OXO1;
    }

    private static final void checkClassicConnect$lambda$0$0$1$0(BaseMainActivity r0) {
        r0.permissionCheckPopup();
    }

    private final void checkDeviceSecurity() {
    }

    private static final Unit checkDeviceSecurity$lambda$0(BaseMainActivity r3, boolean r4) {
        if (r4 == false) goto L5;
        go0 r5 = new go0(r3, 0, 2, null);
        r5.I0iXXO(false);
        r5.iI("安全提醒");
        r5.iOO1ii1("检测到您的手机存在安全风险, 请注意!");
        go0.X11iII1O1(r5, null, null, 2, null);
        r5.X1IX(R.string.confirm, new I11OI0I());
        r5.IIX1OXO();
    L5:
        return Unit.OXO1;
    }

    private static final boolean checkDeviceSecurity$lambda$0$0$0() {
        return true;
    }

    private static final boolean checkFirmwareUpgradeStatus$lambda$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return true;
    }

    private static final boolean checkGPSFirmwareUpgradeStatus$lambda$0$0(final BaseMainActivity r3) {
        return X0IOiX1O.XIi00iiXO(false, new X1iiI1Xi(r3), 1, null);
    }

    private static final Unit checkGPSFirmwareUpgradeStatus$lambda$0$0$0(BaseMainActivity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        DeviceInfoChecker.OXO1.O1O(r1, "A");
        return Unit.OXO1;
    }

    private static final boolean checkNotificationPermission$lambda$0$0$0(BaseMainActivity r2) {
        MyNotificationListenerService.O001I.I0IIOi(r2.getMContext());
        r2.checkStatusBarNotificationPermission();
        return true;
    }

    private static final Unit checkPostNotificationsPermission$lambda$0(boolean r2) {
        if (r2 == true) goto L5;
        a01.OXO1.IiI10X().put(b01.IXI, false);
    L5:
        return Unit.OXO1;
    }

    private static final boolean checkStatusBarNotificationPermission$lambda$0$0$0(BaseMainActivity r3) {
        Intent r0 = new Intent();
        r0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");     // Catch: Exception -> L5
        r0.putExtra("android.provider.extra.APP_PACKAGE", r3.getPackageName());     // Catch: Exception -> L5
        r0.putExtra("android.provider.extra.CHANNEL_ID", r3.getApplicationInfo().uid);     // Catch: Exception -> L5
        r0.putExtra("app_package", r3.getPackageName());     // Catch: Exception -> L5
        r0.putExtra("app_uid", r3.getApplicationInfo().uid);     // Catch: Exception -> L5
        r3.startActivity(r0);     // Catch: Exception -> L5
    L7:
        checkClassicConnect$default(r3, false, 1, null);
        return true;
    L5:
        e = move-exception;
        e.printStackTrace();
        r0.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        r0.putExtra("package", r3.getPackageName());
        r3.startActivity(r0);
        goto L7
    }

    private final void classicNotePopup() {
        if (i72.OXO1.XOO0XOOii() == false) goto L8;
        a01 r0 = a01.OXO1;
        if (r0.XIi00iiXO().getBoolean(b01.X11I, true) == false) goto L8;
        go0 r1 = new go0(this, 0, 2, null);
        r1.I0iXXO(false);
        r1.O1O(R.string.classic_note_title);
        r1.iX(Integer.valueOf(q62.OXO1.iIXi1iiXI()));
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new X0Xi(this));
        this.mClassicNotePopup = r1;
        RelativeLayout r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r1.I1XOi1(r4);
        r0.XIi00iiXO().put(b01.X11I, false);
        return;
    L8:
        permissionCheckPopup();
    }

    private static final boolean classicNotePopup$lambda$0$0(BaseMainActivity r0) {
        r0.permissionCheckPopup();
        return true;
    }

    private final void dataOperating() {
        new Handler().postDelayed(new X0i1iX1(this), 1000);
    }

    private static final void dataOperating$lambda$0(final BaseMainActivity r33) {
        if (r33.isFocusChanged == false) goto L34;
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L8;
        r3 = r4;
    L8:
        AppUser r5 = (AppUser) r3;
        if (r1.IiI10X().getBoolean(b01.O001I, true) == false) goto L18;
        r33.updateUserInfo(r5, true);
        if (r5.getIdentity().length() > 0) goto L13;
    L23:
        r33.checkPermission();
        r33.checkAppVersion();
        DeviceInfoChecker.OXO1.XXI();
        I01XX0.OXO1(I01XX0.XOXiX0, Boolean.FALSE);
        r33.checkFirmwareUpgradeStatus(new Object());
        r33.initializationRecordTime();
        i72 r6 = i72.OXO1;
        if (r6.iOXiO1O1I() == false) goto L26;
        r33.uploadToZewaFitPop();
    L26:
        r33.showClientAppUpgradePopup();
        if (r6.X00110X() == false) goto L29;
        new Handler().postDelayed(new O1XIOXO1i(r33), 3000);
    L29:
        new Handler().postDelayed(new IIiOi10iO(r33), 5000);
        new Handler().postDelayed(new XXIiI1i(r33), 2000);
        if (r6.XXOXi() == false) goto L32;
        r33.mHandler.postDelayed(new XiOOO10O(r33), 3000);
    L32:
        r33.mHandler.postDelayed(new i0i1O(r33), 3000);
        r33.mHandler.sendEmptyMessageDelayed(r33.delayTimeTask, 8000);
        return;
    L13:
        if (r1.IiI10X().getBoolean(b01.XXO, false) == true) goto L15;
        updateUserInfo$default(r33, r5, false, 2, null);
    L16:
        r33.downloadData(r5);
        new Handler().postDelayed(new iiIX1(r33), 2000);
        goto L23
    L15:
        r33.appUserUpdate(r5);
        goto L16
    L18:
        if (r5.getHeight() != 0.0f) goto L21;
    L22:
        r33.toPersonalInformationActivity();
        goto L23
    L21:
        if (r5.getWeight() != 0.0f) goto L23;
    }

    private static final void dataOperating$lambda$0$0(BaseMainActivity r0) {
        r0.userMigrate();
    }

    private static final void dataOperating$lambda$0$1(BaseMainActivity r0) {
        r0.uploadPhoneInfo();
    }

    private static final void dataOperating$lambda$0$2(BaseMainActivity r0) {
        r0.requestWeather();
    }

    private static final void dataOperating$lambda$0$3(BaseMainActivity r3) {
        checkClassicConnect$default(r3, false, 1, null);
    }

    private static final void dataOperating$lambda$0$4(BaseMainActivity r2) {
        ADPAdManager.INSTANCE.getAdMobConsent(r2, new IX1O());
    }

    private static final Unit dataOperating$lambda$0$4$0(boolean r1, boolean r2) {
        a01.OXO1.OXO1().put(b01.XIIO11I, r2);
        return Unit.OXO1;
    }

    private static final void dataOperating$lambda$0$5(BaseMainActivity r0) {
        r0.checkDeviceSecurity();
    }

    private final void downloadData(AppUser r5) {
        int r2 = 0;
        if (a01.OXO1.IiI10X().getBoolean(b01.IO, false) == false) goto L5;
        return;
    L5:
        if (r5.getDbUrl().length() <= 0) goto L13;
        i1O0OXO1O.OXO1.OXO1("downloadData");
        final c72 r0 = new c72(this, r2, 2, null);
        r0.I1(R.string.syncing);
        r0.OX(0);
        RelativeLayout r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r0.I1XOi1(r1);
        sz0 r3 = sz0.OXO1;
        if (uz0.I1XOi1(r3).exists() == false) goto L10;
        parseData(r0);
        return;
    L10:
        NetWorkUtils.INSTANCE.download(r5.getDbUrl(), uz0.XXI(r3), "data", new C34701(r0, this));
        return;
    }

    private final Handler getMainHandler() {
        return (Handler) getValue();
    }

    public static /* synthetic */ Unit i010I(BaseMainActivity r0) {
        return checkClassicConnect$lambda$0$0$1(r0);
    }

    public static /* synthetic */ Unit iI(boolean r0) {
        return checkBluetoothPermission$lambda$0(r0);
    }

    public static /* synthetic */ boolean iIXi1iiXI(BaseMainActivity r0, Message r1) {
        return mHandler$lambda$0(r0, r1);
    }

    public static /* synthetic */ RelativeLayout iIiiO(BaseMainActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iOO1ii1(BaseMainActivity r0) {
        return onPackageStatus$lambda$1$0(r0);
    }

    public static /* synthetic */ boolean iOOX010X() {
        return checkAppVersion$lambda$0$0$0$0();
    }

    public static /* synthetic */ BottomNavigationView iOiXi11II(BaseMainActivity r0) {
        return bottomNav_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iX(BaseMainActivity r0) {
        dataOperating$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean iX1O1() {
        return checkFirmwareUpgradeStatus$lambda$0$0();
    }

    public static /* synthetic */ boolean iXiX011(BaseMainActivity r0) {
        return showWeChatOutLoginPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit iXiiiO(BaseMainActivity r0) {
        return setProgressBackCallBack$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean iiiO(BaseMainActivity r0, AppVersion r1) {
        return checkAppVersion$lambda$0$0$0$1(r0, r1);
    }

    private final void initializationRecordTime() {
        EvaluationKt.specialProcessingTime(b01.X0I1);
        EvaluationKt.specialProcessingTime(b01.I0i0);
        EvaluationKt.specialProcessingTime(b01.iX01);
    }

    private static final boolean mHandler$lambda$0(BaseMainActivity r1, Message r2) {
        Intrinsics.X0O(r2, "it");
        if (r2.what != r1.delayTimeTask) goto L7;
        r1.onShowEvaluationStatus();
        return false;
    L7:
        return false;
    }

    private static final Handler mainHandler_delegate$lambda$0(BaseMainActivity r1) {
        return new Handler(r1.getMainLooper());
    }

    private static final boolean onFindPhone$lambda$0$0() {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FIND_PHONE, BleKeyFlag.UPDATE, 1, false, false, 24, null);
        BleInitializer.IO.onFindPhone(false);
        return true;
    }

    private static final boolean onPackageStatus$lambda$0$0(BaseMainActivity r2) {
        DeviceInfoChecker.OXO1.iI(r2, "A");
        return true;
    }

    private static final boolean onPackageStatus$lambda$1$0(BaseMainActivity r2) {
        DeviceInfoChecker.OXO1.IXXOO(r2, "A");
        return true;
    }

    private static final boolean onShowLocationPopup$lambda$0$0() {
        a01.OXO1.XIi00iiXO().put(b01.XO0X10iO, false);
        return true;
    }

    private static final boolean onShowSyncAgpsPopup$lambda$0$0() {
        return true;
    }

    private static final boolean onShowSyncAgpsPopup$lambda$0$1(BaseMainActivity r1) {
        r1.onSyncAgps(new Object());
        return true;
    }

    private final void parseData(c72 r2) {
        LogUtils.d(new Object[]{"parseData data"});
        r2.I1(R.string.Parsing);
        r2.OX(0);
        if (iI1O0i1O.OXO1.iO(r2) == true) goto L5;
    L9:
        r2.dismiss();
        return;
    L5:
        if (this.statusFragment == null) goto L9;
        if (getStatusFragment().isVisible() == false) goto L9;
        getStatusFragment().onRefresh();
        goto L9
    }

    private final void permissionCheckPopup() {
        i72 r0 = i72.OXO1;
        if (r0.I0iOXO() == false) goto L6;
        return;
    L6:
        if (r0.X0iO() == false) goto L17;
        a01 r1 = a01.OXO1;
        if (r1.XIi00iiXO().getBoolean(b01.X100O, true) == true) goto L11;
        return;
    L11:
        if (hr1.OXO1.iOiXi11II(this) == true) goto L15;
        go0 r2 = new go0(this, R.layout.pop_message2);
        r2.I0iXXO(false);
        r2.iX(Integer.valueOf(R.string.permission_check_text));
        go0.X11iII1O1(r2, Integer.valueOf(R.string.cancel), null, 2, null);
        r2.X1IX(R.string.settings, new OXI0X0(this));
        this.mPermissionCheckPopup = r2;
        RelativeLayout r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r2.I1XOi1(r4);
        r1.XIi00iiXO().put(b01.X100O, false);
        return;
    L15:
        return;
    }

    private static final boolean permissionCheckPopup$lambda$0$0(BaseMainActivity r2) {
        r2.startActivity(new Intent(r2, PermissionSettingsActivity.class));
        return true;
    }

    public static /* synthetic */ void refreshMainBottomNav$default(BaseMainActivity r0, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = R.menu.bottom_nav;
    L6:
        r0.refreshMainBottomNav(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshMainBottomNav");
    }

    private static final void refreshMainBottomNav$lambda$3(BaseMainActivity r1) {
        r1.isRefreshingBottomNav = false;
    }

    private static final void refreshRunnable$lambda$0(BaseMainActivity r3) {
        refreshMainBottomNav$default(r3, 0, 1, null);
    }

    private final void requestWeather() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L5;
        return;
    L5:
        if (WeatherInitializer.IO.OIi0() == true) goto L9;
        i1O0OXO1O.OXO1.OXO1("requestWeather -> the last Request not done");
        return;
    L9:
        if (q62.OXO1.OXii10I() == true) goto L13;
        i1O0OXO1O.OXO1.OXO1("requestWeather -> Device does not support weather");
        return;
    L13:
        if (BleConnector.INSTANCE.isAvailable() == true) goto L17;
        i1O0OXO1O.OXO1.OXO1("requestWeather -> BleConnector is not available");
        return;
    L17:
        if (this.mLocationClient != null) goto L19;
        this.mLocationClient = ns.XIi00iiXO(new iO(this), false, 2, null);
    L19:
        ms r0 = this.mLocationClient;
        if (r0 == null) goto L24;
        r0.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
        return;
    }

    private final void requestWeatherLocation(double r12, double r14) {
        SPUtils r0 = a01.OXO1.OXO1();
        WeatherRealtime r1 = (WeatherRealtime) new Gson().fromJson(r0.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r1 != null) goto L5;
        return;
    L5:
        if (calculateDistance(r14, r12, r1.getLat(), r1.getLon()) == false) goto L9;
        WeatherInitializer.IO.X1ii();
        return;
    }

    private static final RelativeLayout rootView_delegate$lambda$0(BaseMainActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.root_view);
    }

    private static final boolean setBottomNavItem$lambda$0(BaseMainActivity r6, MenuItem r7) {
        Intrinsics.X0O(r7, "it");
        r6.clearSubContent();
        Menu r0 = r6.getBottomNav().getMenu();
        Intrinsics.O10IXXX0X(r0, "getMenu(...)");
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r7.getItemId() != r0.getItem(r3).getItemId()) goto L7;
        r6.getMViewPager().setCurrentItem(r3);
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        return false;
    }

    private final c72 setProgressBackCallBack(c72 r4) {
        if (r4 != null) goto L5;
        int r2 = 0;
        c72 r5 = new c72(this, r2, 2, null);
        r5.X1ii(new IOOXIOO(this));
        r5.XXI(new OXOIOO0I(this));
        return r5;
    L5:
        return r4;
    }

    private static final Unit setProgressBackCallBack$lambda$0$0(BaseMainActivity r1) {
        BleConnector.INSTANCE.addHandleCallback(r1.bleHandleCallback);
        return Unit.OXO1;
    }

    private static final Unit setProgressBackCallBack$lambda$0$1(BaseMainActivity r1) {
        BleConnector.INSTANCE.removeHandleCallback(r1.bleHandleCallback);
        return Unit.OXO1;
    }

    private final void setupBottomNavigationBar() {
        transparentNavBar();
        setNavBarColor(this, gk4.iO(getMContext(), R.color.bottom_navigation_bg_color));
        getBottomNav().setItemIconTintList(null);
        setBottomNavItem();
        View r0 = LayoutInflater.from(this).inflate(R.layout.red_badge, getRootView(), false);
        Intrinsics.O10IXXX0X(r0, "inflate(...)");
        View r1 = r0.findViewById(R.id.ivRemind);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.ivRemind = (ImageView) r1;
        ((BottomNavigationItemView) getBottomNav().findViewById(R.id.item_bottom_me)).addView(r0);
        bottomRemoveItem();
        getMViewPager().addOnPageChangeListener(new C34721(this));
    }

    private static final boolean showAILackingTip$lambda$0$0(BaseMainActivity r4) {
        String r0 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r0);
        r1.putInt("mArg1", 2);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", null);
        Intent r2 = new Intent(r4, GoogleWebViewActivity.class);
        r2.putExtras(r1);
        r4.startActivity(r2);
        return true;
    }

    private final void showClientAppUpgradePopup() {
    }

    private static final boolean showClientAppUpgradePopup$lambda$0$0(BaseMainActivity r1) {
        X1OOO.i010I(r1, "https://play.google.com/store/apps/details?id=com.sector_morellato.smartwatches");
        return true;
    }

    private final void showWeChatOutLoginPopup() {
        go0 r0 = new go0(this, 0, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.login_timeout_title_tip);
        r0.iX(Integer.valueOf(R.string.login_timeout_tip));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, null, null, 3, null);
        r0.X1IX(R.string.login, new Iii010I1X(this));
        this.mWeChatOutLoginPopup = r0;
        RelativeLayout r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r0.I1XOi1(r1);
    }

    private static final boolean showWeChatOutLoginPopup$lambda$0$0(final BaseMainActivity r4) {
        i72.OXO1.XOiXXOO(r4);
        r4.mHandler.postDelayed(new X1I01(r4), 150);
        return true;
    }

    private static final void showWeChatOutLoginPopup$lambda$0$0$0(BaseMainActivity r1) {
        lq6.OXO1.OXO1(r1);
        r1.finish();
    }

    private final void stopLocationClient() {
        ms r0 = this.mLocationClient;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    private final void toPersonalInformationActivity() {
        this.isToPersonalInfo = true;
        i72.OXO1.XIi10(this);
    }

    private final void updateUserInfo(final AppUser r7, final boolean r8) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getUserIdentityBody(r7);
        final O1XIiIO<AppUser> r2 = new C34731(r8, this, r7);
        final Activity r9 = null;
        final uq r10 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppUserInfo.URL);
        r0.printParam(r3 + AppUserInfo.URL, r1);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + AppUserInfo.URL;
        final O1XIiIO<Response<AppUser>> r6 = new BaseMainActivity$updateUserInfo$$inlined$post$default$1(r9, r2, r10);
        AndroidNetworking.post(r5).addBodyParameter(r1).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new BaseMainActivity$updateUserInfo$$inlined$post$default$2(r6));
    }

    public static /* synthetic */ void updateUserInfo$default(BaseMainActivity r0, AppUser r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        r0.updateUserInfo(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserInfo");
    }

    private final void uploadPhoneInfo() {
        if (this.isToPersonalInfo == true) goto L15;
    L9:
        e = move-exception;
        e.printStackTrace();
        return;
    L6:
        if (BleConnector.INSTANCE.isBound() == false) goto L14;
        UploadInfoManager.OXO1.I0iXXO();     // Catch: Exception -> L9
        return;
    L14:
        return;
    }

    private final void uploadToZewaFitPop() {
        a01 r0 = a01.OXO1;
        if (r0.IiI10X().contains(b01.XOXiX0) == true) goto L15;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L9;
        r2 = r3;
    L9:
        if (((AppUser) r2).getIdentity().length() <= 0) goto L13;
        int r4 = 0;
        go0 r5 = new go0(this, r4, 2, null);
        r5.I0iXXO(false);
        r5.iI("Is it allowed to sync data to Zewa server?");
        r5.iX1O1(Integer.valueOf(R.string.cancel), new X11O());
        r5.X1IX(R.string.confirm, new OOiO());
        RelativeLayout r6 = getRootView();
        Intrinsics.O10IXXX0X(r6, "<get-rootView>(...)");
        r5.I1XOi1(r6);
        return;
    L13:
        return;
    }

    private static final boolean uploadToZewaFitPop$lambda$0$0() {
        a01.OXO1.IiI10X().put(b01.XOXiX0, false);
        return true;
    }

    private static final boolean uploadToZewaFitPop$lambda$0$1() {
        a01.OXO1.IiI10X().put(b01.XOXiX0, true);
        return true;
    }

    private final void userMigrate() {
    }

    public void bottomRemoveItem() {
        if (i72.OXO1.OXi001() == true) goto L6;
        getBottomNav().getMenu().removeItem(R.id.item_bottom_ai);
        return;
    }

    public final boolean calculateDistance(double r5, double r7, double r9, double r11) {
        double r0 = Math.toRadians(r9 - r5);
        double r8 = Math.toRadians(r11 - r7);
        double r12 = 2;
        double r1 = r0 / r12;
        double r10 = r8 / r12;
        double r2 = (Math.sin(r1) * Math.sin(r1)) + (((Math.cos(r5) * Math.cos(r9)) * Math.sin(r10)) * Math.sin(r10));
        boolean r13 = true;
        double r14 = 1000;
        double r6 = (((double) 6371) * (r12 * Math.atan2(Math.sqrt(r2), Math.sqrt(((double) 1) - r2)))) * r14;
        if (r6 > r14) goto L6;
        r13 = false;
    L6:
        LogUtils.d(new Object[]{"requestWeather  distance = " + r6 + " result = " + r13});
        return r13;
    }

    public final void checkBluetoothPermission() {
        if (Build.VERSION.SDK_INT < 31) goto L10;
        hr1 r0 = hr1.OXO1;
        if (r0.i11I(this) == false) goto L7;
        return;
    L7:
        if (BleConnector.INSTANCE.isBound() == false) goto L12;
        r0.OX(this, new IO01i0X0X());
        return;
    L12:
        return;
    }

    public final void checkClassicConnect(boolean r11) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
    L8:
        q62 r0 = q62.OXO1;
        if (r0.I1Ii() == false) goto L23;
        final Ref.BooleanRef r1 = new Ref.BooleanRef();
        BleConnector r2 = BleConnector.INSTANCE;
        boolean r3 = r2.isBoundClassic();
        r1.element = r3;
        if (r3 == true) goto L21;
        if (r11 == true) goto L14;
    L19:
        this.mHandler.postDelayed(new I0I0O0(this, r1), 15000);
        return;
    L14:
        if (r2.isAvailable() == true) goto L16;
    L18:
        r2.connectClassic();
        goto L19
    L16:
        if (r0.OIOIi1XO() == false) goto L18;
        BaseBleConnector.sendInt8$default(r2, BleKey.CLASSIC_BLUETOOTH_STATE, BleKeyFlag.UPDATE, 1, false, false, 24, null);
        goto L19
    L21:
        classicNotePopup();
        return;
    L23:
        if (r11 == true) goto L26;
        permissionCheckPopup();
        return;
    L26:
        return;
    L5:
        if (hr1.OXO1.i11I(this) == true) goto L8;
        LogUtils.d(new Object[]{"checkClassicConnect -> Need BLUETOOTH permission!!!!"});
    }

    @sf5(tag = b01.IiI10X)
    public final void checkFirmwareUpgradeStatus(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        LogUtils.d(new Object[]{"checkFirmwareUpgradeStatus"});
        if (q62.OXO1.iii0() == false) goto L13;
        int r1 = 0;
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false) == true) goto L7;
        return;
    L7:
        if (this.mRepairPopup != null) goto L9;
        go0 r5 = new go0(this, r1, 2, null);
        r5.I0iXXO(false);
        r5.O1O(R.string.check_firmware_upgrade_failed_tip);
        go0.X11iII1O1(r5, null, null, 2, null);
        r5.X1IX(R.string.firmware_repair, new X0X0i0OOI());
        this.mRepairPopup = r5;
    L9:
        go0 r6 = this.mRepairPopup;
        if (r6 == null) goto L15;
        RelativeLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    L15:
        return;
    }

    @sf5(tag = b01.O00)
    public final void checkGPSFirmwareUpgradeStatus(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        i1O0OXO1O.OXO1.OXO1("checkGPSFirmwareUpgradeStatus");
        if (q62.OXO1.i1() == false) goto L18;
        int r1 = 0;
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.O00, false) == true) goto L7;
        return;
    L7:
        if (this.mGPSRepairPopup != null) goto L9;
        go0 r6 = new go0(this, r1, 2, null);
        r6.I0iXXO(true);
        r6.O1O(R.string.check_gps_firmware_upgrade_failed_tip);
        go0.X11iII1O1(r6, null, null, 2, null);
        r6.X1IX(R.string.firmware_repair, new IO1iO10(this));
        this.mGPSRepairPopup = r6;
    L9:
        go0 r7 = this.mGPSRepairPopup;
        if (r7 != null) goto L12;
    L14:
        go0 r8 = this.mGPSRepairPopup;
        if (r8 == null) goto L20;
        RelativeLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r8.I1XOi1(r0);
        return;
    L20:
        return;
    L12:
        if (r7.isShowing() != true) goto L14;
        return;
    }

    public final boolean checkNotificationPermission() {
        boolean r0 = MyNotificationListenerService.O001I.O00(getMContext());
        if (r0 == true) goto L13;
        int r2 = 0;
        if (this.mNotificationPopup != null) goto L8;
        go0 r1 = new go0(this, r2, 2, null);
        String r5 = getString(R.string.allow_notification_access, new Object[]{getString(R.string.app_name)});
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r1.iI(r5);
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new IIX0O(this));
        this.mNotificationPopup = r1;
    L8:
        if (BleConnector.INSTANCE.isBound() == false) goto L13;
        go0 r3 = this.mNotificationPopup;
        if (r3 == null) goto L12;
        RelativeLayout r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r3.I1XOi1(r4);
    L12:
        a01.OXO1.IiI10X().put(b01.IiiXiI0I, false);
    L13:
        return r0;
    }

    public void checkPermission() {
        if (a01.OXO1.IiI10X().getBoolean(b01.IiiXiI0I, true) == true) goto L7;
        if (BleConnector.INSTANCE.isBound() == true) goto L7;
    L9:
        checkBluetoothPermission();
        checkPostNotificationsPermission();
        return;
    L7:
        if (checkNotificationPermission() == false) goto L9;
        checkStatusBarNotificationPermission();
        goto L9
    }

    public final void checkPostNotificationsPermission() {
        hr1 r0 = hr1.OXO1;
        if (r0.IXOIIIO(this) == false) goto L5;
        return;
    L5:
        if (a01.OXO1.IiI10X().getBoolean(b01.IXI, true) == false) goto L9;
        r0.Ii1iii0(this, new XXXXX1I());
        return;
    }

    public final boolean checkStatusBarNotificationPermission() {
        boolean r0 = NotificationManagerCompat.from(getMContext()).areNotificationsEnabled();
        if (r0 == false) goto L5;
    L10:
        return r0;
    L5:
        if (this.mStatusBarNotificationPopup != null) goto L7;
        go0 r1 = new go0(this, 0, 2, null);
        String r2 = getString(R.string.allow_status_bar_notification_access);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r1.iI(r2);
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new OOX0iOi00(this));
        this.mStatusBarNotificationPopup = r1;
    L7:
        go0 r3 = this.mStatusBarNotificationPopup;
        if (r3 == null) goto L10;
        RelativeLayout r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r3.I1XOi1(r4);
        goto L10
    }

    public final void clearSubContent() {
        int r0 = getSupportFragmentManager().getBackStackEntryCount();
        if (r0 < 0) goto L8;
        int r1 = 0;
    L5:
        getSupportFragmentManager().popBackStack();
        if (r1 == r0) goto L10;
        r1 = r1 + 1;
        goto L5
    L10:
        return;
    }

    public final void dismissRepairPopup() {
        go0 r0 = this.mRepairPopup;
        if (r0 != null) goto L5;
    L9:
        a01.OXO1.XIi00iiXO().put(b01.IiI10X, false);
        return;
    L5:
        if (r0.isShowing() != true) goto L9;
        go0 r1 = this.mRepairPopup;
        if (r1 == null) goto L9;
        r1.dismiss();
        goto L9
    }

    public final BottomNavigationView getBottomNav() {
        return (BottomNavigationView) getValue();
    }

    @tb1
    public final c72 getMAGpsPopup() {
        return this.mAGpsPopup;
    }

    public final RelativeLayout getRootView() {
        return (RelativeLayout) getValue();
    }

    @aa1
    public final MainStatusFragment getStatusFragment() {
        MainStatusFragment r0 = this.statusFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("statusFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r9) {
        i1O0OXO1O.OXO1.OXO1("locale -> " + getResources().getConfiguration().locale);
        if (i72.OXO1.XOO0Xi() == false) goto L5;
        GoogleHealth r10 = new GoogleHealth(this);
        r10.OIi0();
        this.mGoogleHealth = r10;
    L5:
        BleConnector r11 = BleConnector.INSTANCE;
        r11.addHandleCallback(this.mBleHandleCallback);
        if (q62.OXO1.O00OXOXO() == false) goto L11;
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) goto L11;
        com.sma.smartv3.biz.OXO1.C0553OXO1 r0 = com.sma.smartv3.biz.OXO1.XOO0ii0;
        r0.OXO1().I0iXXO();
        com.sma.smartv3.biz.OXO1.I1XOi1(r0.OXO1(), 0, 0, null, 4, null);
    L11:
        if (r11.isBound() == false) goto L14;
        DeviceInfoChecker.O10IXXX0X(DeviceInfoChecker.OXO1, null, null, 3, null);
        BleInitializer.IO.XOO0XOOii();
        onCheckBindSuccess(new Object());
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public List<Fragment> initFragments() {
        setStatusFragment(new MainStatusFragment());
        ArrayList r0 = new ArrayList();
        r0.add(getStatusFragment());
        i72 r1 = i72.OXO1;
        if (r1.IOI0i0I() == false) goto L7;
        r0.add(new SportFragment());
        MenuItem r2 = getBottomNav().getMenu().findItem(R.id.item_bottom_sport);
        if (r2 == null) goto L9;
        r2.setVisible(true);
    L9:
        if (r1.OXi001() == false) goto L13;
        r0.add(new AIFragment());
        MenuItem r3 = getBottomNav().getMenu().findItem(R.id.item_bottom_ai);
        if (r3 == null) goto L14;
        r3.setVisible(true);
    L14:
        r0.add(new DeviceFragment());
        r0.add(new MainMeFragment());
        return r0;
    L13:
        getBottomNav().getMenu().removeItem(R.id.item_bottom_ai);
        goto L14
    L7:
        getBottomNav().getMenu().removeItem(R.id.item_bottom_sport);
        goto L9
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (i72.OXO1.Ii0i() == false) goto L6;
        q62.OXO1.iI1XiXiII(this);
        return;
    L6:
        setupBottomNavigationBar();
        dataOperating();
        setupSubContentContainer();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_main;
    }

    @sf5(tag = I01XX0.i0X1iIO)
    public final void onCheckBindSuccess(@aa1 Object r8) {
        Intrinsics.X0O(r8, "data");
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34711(this, null), 3, null);
    }

    @sf5(tag = I01XX0.IXI)
    public final void onClassicConnect(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onClassicConnect"});
        checkClassicConnect(false);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
        GoogleHealth r0 = this.mGoogleHealth;
        if (r0 == null) goto L6;
        r0.I0iXXO();
        return;
    }

    @sf5(tag = I01XX0.i0X000X0O)
    public final void onFindPhone(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        if (this.mFindPhonePopup != null) goto L5;
        go0 r6 = new go0(this, 0, 2, null);
        r6.I0iXXO(false);
        r6.IXXOO(1);
        r6.iX(Integer.valueOf(R.string.find_watch_success));
        go0.X11iII1O1(r6, null, null, 2, null);
        r6.X1IX(R.string.confirm, new IIO0OIi());
        this.mFindPhonePopup = r6;
    L5:
        go0 r7 = this.mFindPhonePopup;
        if (r7 != null) goto L8;
    L10:
        go0 r8 = this.mFindPhonePopup;
        if (r8 == null) goto L14;
        RelativeLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r8.I1XOi1(r0);
        return;
    L14:
        return;
    L8:
        if (r7.isShowing() != true) goto L10;
    }

    @sf5(tag = I01XX0.iOiXi11II)
    public final void onFirmwareRepair(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        LogUtils.d(new Object[]{"onFirmwareRepair"});
        if (q62.OXO1.Oi().isEmpty() == false) goto L28;
        BleCache r6 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r6.getMPlatform(), BleDeviceInfo.PLATFORM_NORDIC) == false) goto L9;
        startActivity(new Intent(this, FirmwareRepairNActivity.class));
        return;
    L9:
        if (Intrinsics.XOO0ii0(r6.getMPrototype(), BleDeviceInfo.PROTOTYPE_R3Q) == false) goto L13;
        startActivity(new Intent(this, FirmwareRepairGQActivity.class));
        return;
    L13:
        if (Intrinsics.XOO0ii0(r6.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L17;
        SPUtils r0 = a01.OXO1.XO0O10();
        BleDeviceInfo r7 = r6.getMDeviceInfo();
        r0.put(BleDeviceInfo.class.getName(), new Gson().toJson(r7));
        startActivity(new Intent(this, FirmwareRepairSearchActivity.class));
        return;
    L17:
        if (Intrinsics.XOO0ii0(r6.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == false) goto L21;
        SPUtils r1 = a01.OXO1.XO0O10();
        BleDeviceInfo r8 = r6.getMDeviceInfo();
        r1.put(BleDeviceInfo.class.getName(), new Gson().toJson(r8));
        startActivity(new Intent(this, FirmwareRepairSActivity.class));
        return;
    L21:
        if (Intrinsics.XOO0ii0(r6.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == false) goto L25;
        SPUtils r2 = a01.OXO1.XO0O10();
        BleDeviceInfo r9 = r6.getMDeviceInfo();
        r2.put(BleDeviceInfo.class.getName(), new Gson().toJson(r9));
        startActivity(new Intent(this, FirmwareRepairSearchActivity.class));
        return;
    L25:
        if (Intrinsics.XOO0ii0(r6.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == false) goto L30;
        SPUtils r3 = a01.OXO1.XO0O10();
        BleDeviceInfo r10 = r6.getMDeviceInfo();
        r3.put(BleDeviceInfo.class.getName(), new Gson().toJson(r10));
        startActivity(new Intent(this, FirmwareRepairSearchActivity.class));
        return;
    L30:
        return;
    L28:
        startActivity(new Intent(this, FirmwareRepairModeActivity.class));
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() != 0) goto L6;
        ClickUtils.back2HomeFriendly(getString(R.string.back2home));
        return;
    L6:
        super.onHandleBackPressed();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        dataOperating();
        HykyManager.Companion.getInstance().checkAuthStatus(this);
    }

    public void onOpenSportOnGoingActivity(@aa1 BleDeviceSportData r5) {
        Intrinsics.X0O(r5, "deviceSportData");
        if (XO0O10.OXO1.OO() == false) goto L5;
        return;
    L5:
        if (q62.OXO1.XO11XXOi() == false) goto L9;
        int r0 = r5.getMMode();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putInt("mArg1", r0);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r5);
        Intent r6 = new Intent(this, SportOnGoingGpsActivity.class);
        r6.putExtras(r1);
        startActivity(r6);
        return;
    }

    @sf5(tag = I01XX0.X00XIX1)
    public final void onPackageStatus(@aa1 Object r10) {
        Intrinsics.X0O(r10, "data");
        i1O0OXO1O.OXO1.OXO1("onPackageStatus data = " + r10);
        BlePackageStatus r11 = (BlePackageStatus) r10;
        int r0 = r11.getMUIPackageStatus();
        Integer r3 = Integer.valueOf(R.string.cancel);
        int r5 = 2;
        int r6 = 0;
        DefaultConstructorMarker r7 = null;
        if (r0 != 1) goto L17;
        if (this.mUIPackageStatusPopup != null) goto L7;
        go0 r12 = new go0(this, r6, r5, r7);
        r12.I0iXXO(false);
        r12.O1O(R.string.check_device_repair_title);
        r12.iX(Integer.valueOf(R.string.check_device_repair_tip));
        go0.X11iII1O1(r12, r3, null, 2, null);
        r12.X1IX(R.string.confirm, new I1XIX(this));
        this.mUIPackageStatusPopup = r12;
    L7:
        go0 r13 = this.mUIPackageStatusPopup;
        if (r13 != null) goto L10;
    L12:
        go0 r14 = this.mUIPackageStatusPopup;
        if (r14 == null) goto L30;
        RelativeLayout r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r14.I1XOi1(r1);
        return;
    L30:
        return;
    L10:
        if (r13.isShowing() != true) goto L12;
        return;
    L17:
        if (r11.getMFontPackageStatus() == 1) goto L19;
        return;
    L19:
        if (this.mFontPackageStatusPopup != null) goto L21;
        go0 r15 = new go0(this, r6, r5, r7);
        r15.I0iXXO(false);
        r15.O1O(R.string.check_device_repair_title);
        r15.iX(Integer.valueOf(R.string.check_font_package_status_tip));
        go0.X11iII1O1(r15, r3, null, 2, null);
        r15.X1IX(R.string.confirm, new iO11(this));
        this.mFontPackageStatusPopup = r15;
    L21:
        go0 r16 = this.mFontPackageStatusPopup;
        if (r16 != null) goto L24;
    L26:
        go0 r17 = this.mFontPackageStatusPopup;
        if (r17 == null) goto L32;
        RelativeLayout r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r17.I1XOi1(r2);
        return;
    L32:
        return;
    L24:
        if (r16.isShowing() != true) goto L26;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mHandler.removeMessages(this.delayTimeTask);
    }

    @sf5(tag = I01XX0.O001I)
    public final void onPostHealthConnect(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.i(new Object[]{"onPostHealthConnect "});
        if (i72.OXO1.XOO0Xi() == false) goto L10;
        GoogleHealth r3 = this.mGoogleHealth;
        if (r3 == null) goto L9;
        r3.OIX0iXi();
        return;
    L9:
        return;
    }

    @sf5(tag = I01XX0.iXi)
    public void onRefreshMain(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1("onRefreshMain");
        refreshMainBottomNav$default(this, 0, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void onShowEvaluationStatus() {
        this.mHandler.removeMessages(this.delayTimeTask);
        if (i72.OXO1.O0O0X0iOi() == true) goto L5;
        return;
    L5:
        if (EvaluationKt.isShowEvaluationDialog() == true) goto L7;
        return;
    L7:
        if (this.mEvaluationPopup != null) goto L9;
        int r3 = 0;
        this.mEvaluationPopup = new I0iiIOX(this, r3, 2, null);
    L9:
        I0iiIOX r0 = this.mEvaluationPopup;
        if (r0 != null) goto L12;
    L14:
        I0iiIOX r1 = this.mEvaluationPopup;
        if (r1 == null) goto L20;
        RelativeLayout r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.XiOIO(r2);
        return;
    L20:
        return;
    L12:
        if (r0.isShowing() != true) goto L14;
    }

    @sf5(tag = I01XX0.XOO0XOOii)
    public final void onShowLocationPopup(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        LogUtils.d(new Object[]{"onShowLocationPopup"});
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.XO0X10iO, true) == true) goto L5;
        return;
    L5:
        if (hr1.OXO1.i0X000X0O(this) == false) goto L19;
        go0 r6 = this.locationPopup;
        if (r6 == null) goto L12;
        if (r6.isShowing() != true) goto L12;
        return;
    L12:
        if (this.locationPopup != null) goto L14;
        go0 r7 = new go0(this, 0, 2, null);
        String r0 = getString(R.string.background_location_permission_popup_tip, new Object[]{AppUtils.getAppName()});
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        r7.iI(r0);
        go0.X11iII1O1(r7, null, null, 2, null);
        r7.X1IX(R.string.confirm, new XI1O1X1OI());
        this.locationPopup = r7;
    L14:
        go0 r8 = this.locationPopup;
        if (r8 == null) goto L20;
        r8.X0O(R.id.root_view);
        return;
    L20:
        return;
    }

    @sf5(tag = I01XX0.Oi)
    public final void onShowSportDetail(@aa1 Object r6) {
        Intrinsics.X0O(r6, "data");
        LogUtils.d(new Object[]{"onShowSportDetail " + r6});
        if ((r6 instanceof Integer) == true) goto L5;
        return;
    L5:
        if (i72.OXO1.iIXX0i() == false) goto L8;
        getMContext().startActivity(new Intent(getMContext(), SportDetailV2Activity.class).putExtra("mArg1", ((Number) r6).intValue()));
        return;
    L8:
        getMContext().startActivity(new Intent(getMContext(), SportDetailActivity.class).putExtra("mArg1", ((Number) r6).intValue()));
    }

    @sf5(tag = I01XX0.IO0iXO0O)
    public final void onShowSyncAgpsPopup(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1("onShowSyncAgpsPopup");
        if (this.mAGpsPopupReminder != null) goto L5;
        go0 r4 = new go0(this, R.layout.pop_message);
        r4.O1O(R.string.agps_upgrade_title);
        r4.iX(Integer.valueOf(R.string.agps_upgrade_describe));
        r4.IXXOO(1);
        r4.I0iXXO(false);
        r4.iX1O1(null, new XIIOXXI0X());
        r4.X1IX(R.string.sync, new O1OXXIIO1(this));
        this.mAGpsPopupReminder = r4;
    L5:
        go0 r5 = this.mAGpsPopupReminder;
        Intrinsics.XXI(r5);
        if (r5.isShowing() == true) goto L9;
        go0 r6 = this.mAGpsPopupReminder;
        Intrinsics.XXI(r6);
        RelativeLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    @sf5(tag = I01XX0.O0O0X0iOi)
    public final void onSyncAgps(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onSyncAgps"});
        showSyncAGPS();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{I01XX0.XXiIiX10});
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
        super.onWindowFocusChanged(r1);
        this.isFocusChanged = r1;
    }

    public void parseUserInfo(@tb1 AppUser r4) {
        String r0 = null;
        if (r4 == null) goto L5;
        Float r1 = Float.valueOf(r4.getHeight());
    L7:
        if (Intrinsics.O00(r1, 0.0f) == true) goto L23;
        if (r4 == null) goto L10;
        Float r2 = Float.valueOf(r4.getWeight());
    L12:
        if (Intrinsics.O00(r2, 0.0f) == true) goto L23;
        if (r4 == null) goto L16;
        r0 = r4.getEmail();
    L16:
        if (r0 != null) goto L18;
    L21:
        i72.OXO1.OI1O(this);
        return;
    L18:
        if (r4.getEmail().length() == 0) goto L21;
        return;
    L10:
        r2 = null;
    L23:
        toPersonalInformationActivity();
        return;
    L5:
        r1 = null;
        goto L7
    }

    public void refreshMainBottomNav(int r8) {
        if (this.isRefreshingBottomNav == false) goto L5;
        return;
    L5:
        boolean r9 = true;
        this.isRefreshingBottomNav = true;
        int r1 = 0;
        if (getBottomNav().getMenu().findItem(R.id.item_bottom_sport) == null) goto L9;
        boolean r0 = true;
    L10:
        i72 r2 = i72.OXO1;     // Catch: Throwable -> L28
        boolean r3 = r2.IOI0i0I();     // Catch: Throwable -> L28
        if (getBottomNav().getMenu().findItem(R.id.item_bottom_ai) == null) goto L13;
        boolean r4 = true;
    L14:
        boolean r5 = r2.OXi001();     // Catch: Throwable -> L28
        if (a01.OXO1.iO().getBoolean(b01.OIi0) == q62.OXO1.X0OXOI()) goto L18;
        r9 = false;
    L18:
        if (r0 != r3) goto L24;
        if (r4 != r5) goto L24;
        if (r9 == false) goto L24;
        BottomNavigationView r10 = getBottomNav();
        Runnable r6 = new Oi0Xi1(this);
    L22:
        r10.post(r6);
        return;
    L24:
        int r11 = getBottomNav().getSelectedItemId();     // Catch: Throwable -> L28
        FragmentTransaction r7 = getSupportFragmentManager().beginTransaction();     // Catch: Throwable -> L28
        Intrinsics.O10IXXX0X(r7, "beginTransaction(...)");     // Catch: Throwable -> L28
        List<Fragment> r12 = getSupportFragmentManager().getFragments();     // Catch: Throwable -> L28
        Intrinsics.O10IXXX0X(r12, "getFragments(...)");     // Catch: Throwable -> L28
        Iterator<T> r13 = r12.iterator();     // Catch: Throwable -> L28
    L26:
        if (r13.hasNext() == false) goto L30;
        r7.remove((Fragment) r13.next());     // Catch: Throwable -> L28
        goto L26
    L30:
        r7.commitNowAllowingStateLoss();     // Catch: Throwable -> L28
        getMFragmentPagerAdapter().cleanFragment();     // Catch: Throwable -> L28
        getBottomNav().getMenu().clear();     // Catch: Throwable -> L28
        getBottomNav().inflateMenu(R.menu.bottom_nav);     // Catch: Throwable -> L28
        BaseFragmentPagerAdapter r14 = new BaseFragmentPagerAdapter(this);     // Catch: Throwable -> L28
        getMViewPager().setAdapter(r14);     // Catch: Throwable -> L28
        getMViewPager().setOffscreenPageLimit(r14.getCount());     // Catch: Throwable -> L28
        setMFragmentPagerAdapter(r14);     // Catch: Throwable -> L28
        Menu r15 = getBottomNav().getMenu();     // Catch: Throwable -> L28
        Intrinsics.O10IXXX0X(r15, "getMenu(...)");     // Catch: Throwable -> L28
        int r16 = r15.size();     // Catch: Throwable -> L28
    L31:
        if (r1 >= r16) goto L36;
        if (r11 != r15.getItem(r1).getItemId()) goto L35;
        getMViewPager().setCurrentItem(r1);     // Catch: Throwable -> L28
    L35:
        r1 = r1 + 1;
        goto L31
    L36:
        r10 = getBottomNav();
        r6 = new Oi0Xi1(this);
        goto L22
    L13:
        r4 = false;
        goto L14
    L9:
        r0 = false;
    L28:
        th = move-exception;
        getBottomNav().post(new Oi0Xi1(this));
        throw th;
    }

    public void setBottomNavItem() {
        getBottomNav().setOnNavigationItemSelectedListener(new O00XXX(this));
    }

    public final void setMAGpsPopup(@tb1 c72 r1) {
        this.mAGpsPopup = r1;
    }

    public final void setStatusFragment(@aa1 MainStatusFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.statusFragment = r2;
    }

    public final void setupSubContentContainer() {
        RelativeLayout.LayoutParams r0 = new RelativeLayout.LayoutParams(-1, -1);
        r0.addRule(2, R.id.bottomNav);
        FrameLayout r1 = new FrameLayout(this);
        r1.setId(R.id.sub_content);
        getRootView().addView(r1, r0);
    }

    public final void showAILackingTip(int r14) {
        i72 r0 = i72.OXO1;
        if (r0.IIII0iI() == true) goto L5;
        return;
    L5:
        if (r0.IOX1() == true) goto L7;
        return;
    L7:
        if (r0.IOI0i0I() == true) goto L9;
        return;
    L9:
        if (r0.OXi001() == false) goto L26;
        int r1 = 2;
        if (r14 != 2) goto L27;
        a01 r15 = a01.OXO1;
        long r5 = r15.IiI10X().getLong(b01.IOIi00, 0);
        SPUtils r2 = r15.IiI10X();
        Object r3 = new Gson().fromJson(r2.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r3 != null) goto L15;
        r3 = UserMember.class.newInstance();
    L15:
        UserMember r4 = (UserMember) r3;
        i1O0OXO1O.OXO1.OXO1("main showAILackingTip  mIsShowTime = " + r5 + " mUserMember = " + r4);
        if (r4.getLatestDateTime() <= 0) goto L28;
        OrderManager r7 = OrderManager.OXO1;
        if (OrderManager.O00(r7, r4.getLatestDateTime(), 0, 2, null) == true) goto L20;
        return;
    L20:
        if (r7.IiI10X(r5, 1) == false) goto L30;
        r15.IiI10X().put(b01.IOIi00, System.currentTimeMillis());
        go0 r16 = new go0(this, 0, r1, null);
        r16.O1O(R.string.tip);
        r16.iX(Integer.valueOf(R.string.ai_benefits_about_expire));
        r16.IXXOO(1);
        go0.X11iII1O1(r16, Integer.valueOf(R.string.cancel), null, 2, null);
        r16.X1IX(R.string.confirm, new O100O(this));
        r16.IIX1OXO();
        return;
    L30:
        return;
    L28:
        return;
    L27:
        return;
    }

    public void showSyncAGPS() {
        c72 r0 = setProgressBackCallBack(this.mAGpsPopup);
        this.mAGpsPopup = r0;
        if (r0 == null) goto L5;
        r0.I1(R.string.downloading);
        r0.OX(0);
        RelativeLayout r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r0.I1XOi1(r2);
    L5:
        AGPSInitializer.IO.OX(false, this.mAGpsPopup);
    }

    public void viewPagerSelected(int r1) {
        showAILackingTip(r1);
    }
}
