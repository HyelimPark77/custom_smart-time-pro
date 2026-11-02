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
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.I00I0X0;
import com.android.mltcode.paycertificationapi.I00IIiI0;
import com.android.mltcode.paycertificationapi.I00O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100I1Iii;
import com.android.mltcode.paycertificationapi.I111I;
import com.android.mltcode.paycertificationapi.I1I10;
import com.android.mltcode.paycertificationapi.I1IXii0;
import com.android.mltcode.paycertificationapi.I1XiiX0;
import com.android.mltcode.paycertificationapi.I1i101i;
import com.android.mltcode.paycertificationapi.IO0I1XI;
import com.android.mltcode.paycertificationapi.IOO0Xi0O;
import com.android.mltcode.paycertificationapi.IOiIO;
import com.android.mltcode.paycertificationapi.IX00Ii;
import com.android.mltcode.paycertificationapi.IX1X1iIiX;
import com.android.mltcode.paycertificationapi.IXI0OO1;
import com.android.mltcode.paycertificationapi.IXO000;
import com.android.mltcode.paycertificationapi.IXX1O1;
import com.android.mltcode.paycertificationapi.Ii0Oi0OiO;
import com.android.mltcode.paycertificationapi.Ii1iO0XO;
import com.android.mltcode.paycertificationapi.O00X1;
import com.android.mltcode.paycertificationapi.O01001;
import com.android.mltcode.paycertificationapi.O0IX1;
import com.android.mltcode.paycertificationapi.O0OXOO1I;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.O0i0i0;
import com.android.mltcode.paycertificationapi.O10XI1;
import com.android.mltcode.paycertificationapi.O110iXOi;
import com.android.mltcode.paycertificationapi.O1OX;
import com.android.mltcode.paycertificationapi.O1X10i;
import com.android.mltcode.paycertificationapi.O1Xii1;
import com.android.mltcode.paycertificationapi.OII01XO0;
import com.android.mltcode.paycertificationapi.OIiIO;
import com.android.mltcode.paycertificationapi.OO1XOI0iO;
import com.android.mltcode.paycertificationapi.Oi1OX0I;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.OiiXi0OX0;
import com.android.mltcode.paycertificationapi.X000O;
import com.android.mltcode.paycertificationapi.X0011;
import com.android.mltcode.paycertificationapi.X0101OX;
import com.android.mltcode.paycertificationapi.X0I1I111;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0X1;
import com.android.mltcode.paycertificationapi.X10100;
import com.android.mltcode.paycertificationapi.XO01OIXIi;
import com.android.mltcode.paycertificationapi.XO10iX;
import com.android.mltcode.paycertificationapi.XX01O1X1i;
import com.android.mltcode.paycertificationapi.XXIX0O1X;
import com.android.mltcode.paycertificationapi.XXOiX;
import com.android.mltcode.paycertificationapi.XXX0O1X;
import com.android.mltcode.paycertificationapi.XXXXOIi;
import com.android.mltcode.paycertificationapi.XiII0i11X;
import com.android.mltcode.paycertificationapi.XiIX11O;
import com.android.mltcode.paycertificationapi.Xiii10;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i0100X0;
import com.android.mltcode.paycertificationapi.i0X0Ii;
import com.android.mltcode.paycertificationapi.i10OXi1;
import com.android.mltcode.paycertificationapi.i1110XXI;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1O0OXii;
import com.android.mltcode.paycertificationapi.i1O1XOI;
import com.android.mltcode.paycertificationapi.i1OO11I;
import com.android.mltcode.paycertificationapi.i1XIXI;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI1II1;
import com.android.mltcode.paycertificationapi.iIOOiIIX;
import com.android.mltcode.paycertificationapi.iIOiO;
import com.android.mltcode.paycertificationapi.iO0X0111;
import com.android.mltcode.paycertificationapi.iO0iI;
import com.android.mltcode.paycertificationapi.iO1i0Oii;
import com.android.mltcode.paycertificationapi.iOIOI;
import com.android.mltcode.paycertificationapi.iOX0XX;
import com.android.mltcode.paycertificationapi.iX0i1;
import com.android.mltcode.paycertificationapi.iXIOX10O;
import com.android.mltcode.paycertificationapi.iXX011Oi;
import com.android.mltcode.paycertificationapi.iXX101;
import com.android.mltcode.paycertificationapi.iXXI0;
import com.android.mltcode.paycertificationapi.iXiO1O0;
import com.android.mltcode.paycertificationapi.iiO011O1;
import com.android.mltcode.paycertificationapi.iiOi10;
import com.android.mltcode.paycertificationapi.iiXX0O0O;
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
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.share.internal.ShareConstants;
import com.github.appintro.indicator.DotIndicatorController;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.EBookManagerActivity;
import com.sma.smartv3.ui.device.EarphoneKeySettingsActivity;
import com.sma.smartv3.ui.device.FirmwareRepairSearchActivity;
import com.sma.smartv3.ui.device.FirmwareUpgradeJSmaActivity;
import com.sma.smartv3.ui.device.MemoryManagerActivity;
import com.sma.smartv3.ui.device.MultiDeviceManagerActivity;
import com.sma.smartv3.ui.device.MusicManagerV2Activity;
import com.sma.smartv3.ui.device.NotificationSettingsActivity;
import com.sma.smartv3.ui.device.VoiceActivity;
import com.sma.smartv3.ui.device.VoiceSetActivity;
import com.sma.smartv3.ui.main.MainActivity;
import com.sma.smartv3.ui.me.PermissionSettingsActivity;
import com.sma.smartv3.ui.me.SettingsActivity;
import com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity;
import com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity;
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
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nChargeMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1136:1\n27#2:1137\n27#2:1138\n69#3,3:1139\n72#3,5:1143\n69#3,3:1148\n72#3,5:1152\n69#3,3:1157\n72#3,5:1161\n69#3,3:1166\n72#3,5:1170\n69#3,3:1175\n72#3,5:1179\n69#3,3:1184\n72#3,5:1188\n69#3,3:1193\n72#3,5:1197\n69#3,3:1204\n72#3,5:1208\n140#3,5:1213\n145#3,5:1219\n69#3,3:1224\n72#3,5:1228\n69#3,3:1233\n72#3,5:1237\n69#3,3:1242\n72#3,5:1246\n69#3,3:1251\n72#3,5:1255\n69#3,3:1260\n72#3,5:1264\n69#3,3:1269\n72#3,5:1273\n69#3,3:1278\n72#3,5:1282\n69#3,3:1287\n72#3,5:1291\n87#3,7:1296\n94#3,3:1304\n70#3,7:1307\n97#3:1314\n87#3,7:1315\n94#3,3:1323\n70#3,7:1326\n97#3:1333\n1#4:1142\n1#4:1151\n1#4:1160\n1#4:1169\n1#4:1178\n1#4:1187\n1#4:1196\n1#4:1207\n1#4:1218\n1#4:1227\n1#4:1236\n1#4:1245\n1#4:1254\n1#4:1263\n1#4:1272\n1#4:1281\n1#4:1290\n1#4:1303\n1#4:1322\n11#5,2:1202\n*S KotlinDebug\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity\n*L\n487#1:1137\n500#1:1138\n877#1:1139,3\n877#1:1143,5\n922#1:1148,3\n922#1:1152,5\n962#1:1157,3\n962#1:1161,5\n1007#1:1166,3\n1007#1:1170,5\n1011#1:1175,3\n1011#1:1179,5\n1110#1:1184,3\n1110#1:1188,5\n1114#1:1193,3\n1114#1:1197,5\n1133#1:1204,3\n1133#1:1208,5\n381#1:1213,5\n381#1:1219,5\n967#1:1224,3\n967#1:1228,5\n973#1:1233,3\n973#1:1237,5\n997#1:1242,3\n997#1:1246,5\n1000#1:1251,3\n1000#1:1255,5\n991#1:1260,3\n991#1:1264,5\n993#1:1269,3\n993#1:1273,5\n1021#1:1278,3\n1021#1:1282,5\n1027#1:1287,3\n1027#1:1291,5\n1033#1:1296,7\n1033#1:1304,3\n1033#1:1307,7\n1033#1:1314\n1039#1:1315,7\n1039#1:1323,3\n1039#1:1326,7\n1039#1:1333\n877#1:1142\n922#1:1151\n962#1:1160\n1007#1:1169\n1011#1:1178\n1110#1:1187\n1114#1:1196\n1133#1:1207\n381#1:1218\n967#1:1227\n973#1:1236\n997#1:1245\n1000#1:1254\n991#1:1263\n993#1:1272\n1021#1:1281\n1027#1:1290\n1033#1:1303\n1039#1:1322\n1132#1:1202,2\n*E\n"})
public final class ChargeMainActivity extends BaseChargeActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy addScreensaver$delegate;

    @tb1
    private TimerTask autoDataSync;

    @aa1
    private final Lazy chargePanel$delegate;

    @aa1
    private final Lazy checkCall$delegate;

    @aa1
    private final Lazy checkFindEarphoneLeft$delegate;

    @aa1
    private final Lazy checkFindEarphoneRight$delegate;

    @aa1
    private final Lazy earphonePanel$delegate;

    @aa1
    private final Handler handler;

    @aa1
    private final Lazy indicatorContainer$delegate;

    @aa1
    private final Lazy indicatorController$delegate;
    private boolean isShow;

    @aa1
    private final Lazy itemChargeBind$delegate;

    @aa1
    private final Lazy itemDialogueTranslationLayout$delegate;

    @aa1
    private final Lazy itemEBookManager$delegate;

    @aa1
    private final Lazy itemEarphoneBind$delegate;

    @aa1
    private final Lazy itemMusicManager$delegate;

    @aa1
    private final Lazy itemSimultaneousTranslationLayout$delegate;

    @aa1
    private final Lazy itemTranslationLayout$delegate;

    @aa1
    private final Lazy itemVoiceAssistant$delegate;

    @aa1
    private final Lazy ivDenoise$delegate;

    @aa1
    private final Lazy ivNoiseClose$delegate;

    @aa1
    private final Lazy ivNoiseTrans$delegate;

    @aa1
    private final Lazy ivScreensaver$delegate;
    private long lastClickTime;

    @aa1
    private final Lazy llNoiseSettings$delegate;

    @aa1
    private final Lazy llScreensaver$delegate;

    @aa1
    private final XO0O10 mBleHandleCallback;

    @aa1
    private final Lazy mCrop$delegate;

    @aa1
    private DeviceType mCurDeviceType;

    @aa1
    private BleEarphoneAncSettings mEarphoneAncSettings;

    @tb1
    private go0 mNotificationPopup;

    @tb1
    private c72 mProgressPop;

    @tb1
    private IXO000 mScreensaver;

    @aa1
    private final Lazy mScreensaverPics$delegate;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final Lazy pbLeftPower$delegate;

    @aa1
    private final Lazy pbPower$delegate;

    @aa1
    private final Lazy pbRightPower$delegate;

    @aa1
    private final Lazy refreshLayout$delegate;

    @aa1
    private final Lazy rvScreensaver$delegate;

    @aa1
    private final Lazy seekbarLightness$delegate;

    @aa1
    private final Lazy seekbarScreensaver$delegate;

    @aa1
    private final Lazy switchStatusRunnable$delegate;

    @tb1
    private Timer timer;

    @aa1
    private final Lazy tvDenoise$delegate;

    @aa1
    private final Lazy tvHigh$delegate;

    @aa1
    private final Lazy tvLeftPower$delegate;

    @aa1
    private final Lazy tvLow$delegate;

    @aa1
    private final Lazy tvMiddle$delegate;

    @aa1
    private final Lazy tvNoiseClose$delegate;

    @aa1
    private final Lazy tvNoiseTrans$delegate;

    @aa1
    private final Lazy tvPower$delegate;

    @aa1
    private final Lazy tvRightPower$delegate;

    @aa1
    private final Lazy tvScreensaverValue$delegate;

    @aa1
    private final Lazy tvState$delegate;

    @aa1
    private final Lazy viewPager$delegate;

    @aa1
    private final Lazy viewPagerEarPhone$delegate;

    @aa1
    private final Lazy viewPagerMain$delegate;

    public static final enum DeviceType extends Enum<DeviceType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ DeviceType[] $VALUES = null;
        public static final DeviceType CHARGE = null;
        public static final DeviceType EARPHONE = null;

        private static final /* synthetic */ DeviceType[] $values() {
            return new DeviceType[]{CHARGE, EARPHONE};
        }

        static {
            CHARGE = new DeviceType("CHARGE", 0);
            EARPHONE = new DeviceType("EARPHONE", 1);
            DeviceType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private DeviceType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<DeviceType> getEntries() {
            return $ENTRIES;
        }

        public static DeviceType valueOf(String r1) {
            return (DeviceType) Enum.valueOf(DeviceType.class, r1);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }
    }

    @SourceDebugExtension({"SMAP\nChargeMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1136:1\n69#2,3:1137\n72#2,5:1141\n1#3:1140\n*S KotlinDebug\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n*L\n946#1:1137,3\n946#1:1141,5\n946#1:1140\n*E\n"})
    public static final class IiI10X implements O0Oiii<FirmwareVersion> {
        public final /* synthetic */ ChargeMainActivity OXO1;

        public IiI10X(ChargeMainActivity r1) {
            this.OXO1 = r1;
        }

        public void OXO1(FirmwareVersion r3) {
            if (q62.OXO1.I0i0() == false) goto L6;
            DeviceInfoChecker.OXO1.IiI10X(this.OXO1);
            return;
        L6:
            ChargeMainActivity r4 = this.OXO1;
            r4.startActivity(new Intent(r4, FirmwareUpgradeJSmaActivity.class));
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r2) {
            Intrinsics.X0O(r2, "error");
            ToastUtils.showLong(R.string.already_the_latest_version);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(FirmwareVersion r1) {
            OXO1(r1);
        }
    }

    public static final class O00 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;
        public final /* synthetic */ ChargeMainActivity iO;

        public O00(ChargeMainActivity r2) {
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
        public void XIi00iiXO(Uri r3) {
            Intrinsics.X0O(r3, ShareConstants.MEDIA_URI);
            LogUtils.d(new Object[]{"onCropped => " + r3});
            xz3 r4 = ChargeMainActivity.access$getMSelectAvatarPopup$p(this.iO);
            if (r4 == null) goto L5;
            r4.dismiss();
        L5:
            sz0 r5 = sz0.OXO1;
            if (uz0.XiOIii1(r5).exists() == false) goto L12;
            Bitmap r6 = ImageUtils.getBitmap(uz0.XiOIii1(r5));
            IXO000 r0 = ChargeMainActivity.access$getMScreensaver$p(this.iO);
            if (r0 == null) goto L10;
            Intrinsics.XXI(r6);
            r0.I0iXXO(r6);
        L10:
            ChargeMainActivity.access$syncScreensaver(this.iO);
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    public static final class OXO1 extends TimerTask {
        public final /* synthetic */ ChargeMainActivity IO;

        public OXO1(ChargeMainActivity r1) {
            this.IO = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (ChargeMainActivity.access$getRefreshLayout(this.IO).isRefreshing() == false) goto L5;
            return;
        L5:
            if (BleConnector.INSTANCE.isAvailable() == false) goto L9;
            ChargeMainActivity.access$syncInfo(this.IO);
            return;
        }
    }

    public static final class XIi00iiXO implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ ChargeMainActivity OXO1;

        public XIi00iiXO(ChargeMainActivity r1) {
            this.OXO1 = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar r9, int r10, boolean r11) {
            ChargeMainActivity.access$getTvLow(this.OXO1).setEnabled(false);
            ChargeMainActivity.access$getTvMiddle(this.OXO1).setEnabled(false);
            ChargeMainActivity.access$getTvHigh(this.OXO1).setEnabled(false);
            if (r10 == 0) goto L16;
            if (r10 != 1) goto L6;
            ChargeMainActivity.access$getTvLow(this.OXO1).setEnabled(true);
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 0, false, false, 24, null);
            return;
        L6:
            if (r10 != 2) goto L8;
            ChargeMainActivity.access$getTvMiddle(this.OXO1).setEnabled(true);
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 2, false, false, 24, null);
            return;
        L8:
            if (r10 == 3) goto L10;
            return;
        L10:
            ChargeMainActivity.access$getTvHigh(this.OXO1).setEnabled(true);
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 4, false, false, 24, null);
            return;
        L16:
            ChargeMainActivity.access$getSeekbarLightness(this.OXO1).setProgress(1);
            ChargeMainActivity.access$getTvLow(this.OXO1).setEnabled(true);
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar r1) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar r1) {
        }
    }

    public static final class XO0O10 implements BleHandleCallback {
        public final /* synthetic */ ChargeMainActivity IO;

        public XO0O10(ChargeMainActivity r1) {
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
        public void onCommandSendTimeout(BleKey r2, BleKeyFlag r3) {
            Intrinsics.X0O(r2, "bleKey");
            Intrinsics.X0O(r3, "bleKeyFlag");
            if (r2 != BleKey.WATCH_FACE) goto L7;
            ChargeMainActivity.access$syncFailed(this.IO);
            return;
        L7:
            if (r2 != BleKey.POWER) goto L10;
            ChargeMainActivity.access$syncDone(this.IO);
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
        public void onDeviceConnecting(boolean r2) {
            if (r2 == true) goto L4;
            return;
        L4:
            if (ChargeMainActivity.access$getMCurDeviceType$p(this.IO) != DeviceType.CHARGE) goto L8;
            ChargeMainActivity.access$getTvState(this.IO).setText(R.string.device_connecting);
            return;
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
        public void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings r2) {
            Intrinsics.X0O(r2, "earphoneAncSettings");
            ChargeMainActivity.access$setMEarphoneAncSettings$p(this.IO, r2);
            ChargeMainActivity r3 = this.IO;
            ChargeMainActivity.access$showNoiseSetTab(r3, ChargeMainActivity.access$getMEarphoneAncSettings$p(r3).getMMode());
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onEarphoneCallUpdate(int r1) {
            ChargeMainActivity.access$initCall(this.IO);
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
        public void onEarphoneStateUpdate(BleEarphoneState r2) {
            Intrinsics.X0O(r2, "earphoneState");
            ChargeMainActivity.access$syncDone(this.IO);
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
        public void onFindEarphoneUpdate(BleFindEarphone r2) {
            Intrinsics.X0O(r2, "findEarphone");
            ChargeMainActivity.access$initFindEarphone(this.IO);
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
        public void onReadEarphoneAncSettings(BleEarphoneAncSettings r2) {
            Intrinsics.X0O(r2, "earphoneAncSettings");
            ChargeMainActivity.access$setMEarphoneAncSettings$p(this.IO, r2);
            ChargeMainActivity r3 = this.IO;
            ChargeMainActivity.access$showNoiseSetTab(r3, ChargeMainActivity.access$getMEarphoneAncSettings$p(r3).getMMode());
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphoneCall(int r1) {
            ChargeMainActivity.access$initCall(this.IO);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo r1) {
            super.onReadEarphoneInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphoneKey(BleEarphoneKey r2) {
            Intrinsics.X0O(r2, "earphoneKey");
            ChargeMainActivity.access$initNoiseSet(this.IO);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphonePower(BleEarphonePower r2) {
            Intrinsics.X0O(r2, "earphonePower");
            ChargeMainActivity.access$syncDone(this.IO);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings r1) {
            super.onReadEarphoneSoundEffectsSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadEarphoneState(BleEarphoneState r2) {
            Intrinsics.X0O(r2, "earphoneState");
            ChargeMainActivity.access$syncDone(this.IO);
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
        public void onReadPower(int r1) {
            ChargeMainActivity.access$syncDone(this.IO);
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
        public void onReadSDCardInfo(BleSDCardInfo r2) {
            Intrinsics.X0O(r2, "sdCardInfo");
            ChargeMainActivity.access$syncDone(this.IO);
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
        public void onReadScreenBrightnessSet(int r1) {
            ChargeMainActivity.access$initLightness(this.IO);
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
        public void onScreenBrightnessSetUpdate(int r1) {
            ChargeMainActivity.access$initLightness(this.IO);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean r11) {
            LogUtils.d(new Object[]{"onSessionStateChange " + r11});
            c72 r0 = ChargeMainActivity.access$getMProgressPop$p(this.IO);
            if (r0 == null) goto L5;
            r0.dismiss();
        L5:
            ChargeMainActivity.access$setMProgressPop$p(this.IO, null);
            if (r11 == false) goto L14;
            ChargeMainActivity.access$getHandler$p(this.IO).removeCallbacks(ChargeMainActivity.access$getSwitchStatusRunnable(this.IO));
            ChargeMainActivity.access$getTvState(this.IO).setText(R.string.device_connectied);
            if (ChargeMainActivity.access$getRefreshLayout(this.IO).isRefreshing() == false) goto L10;
        L12:
            BleConnector r2 = BleConnector.INSTANCE;
            BleKey r3 = BleKey.EARPHONE_ANC_SET;
            BleKeyFlag r4 = BleKeyFlag.READ;
            BaseBleConnector.sendData$default(r2, r3, r4, null, false, false, 28, null);
            BaseBleConnector.sendData$default(r2, BleKey.SCREEN_BRIGHTNESS_SET, r4, null, false, false, 28, null);
            return;
        L10:
            if (BleInitializer.IO.OI() == true) goto L12;
            ChargeMainActivity.access$autoSyncData(this.IO, 2000);
            goto L12
        L14:
            ChargeMainActivity.access$getHandler$p(this.IO).postDelayed(ChargeMainActivity.access$getSwitchStatusRunnable(this.IO), 10000);
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
            if (r1 == false) goto L13;
            c72 r6 = ChargeMainActivity.access$getMProgressPop$p(this.IO);
            if (r6 == null) goto L7;
            r6.OX((int) ((r4 / r3) * 100));
        L7:
            if (r3 != r4) goto L15;
            c72 r7 = ChargeMainActivity.access$getMProgressPop$p(this.IO);
            if (r7 == null) goto L11;
            r7.dismiss();
        L11:
            ChargeMainActivity.access$setMProgressPop$p(this.IO, null);
            ToastUtils.showLong(R.string.synced);
            return;
        L15:
            return;
        L13:
            ChargeMainActivity.access$syncFailed(this.IO);
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

    public static final class iO implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ ChargeMainActivity OXO1;

        public iO(ChargeMainActivity r1) {
            this.OXO1 = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar r2, int r3, boolean r4) {
            ChargeMainActivity.access$getTvScreensaverValue(this.OXO1).setText(this.OXO1.getString(R.string.d_s, new Object[]{Integer.valueOf(r3 + 3)}));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar r1) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar r9) {
            int r3 = ChargeMainActivity.access$getSeekbarScreensaver(this.OXO1).getProgress() + 3;
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.BACK_LIGHT, BleKeyFlag.UPDATE, r3, false, false, 24, null);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.ChargeMainActivity$initScreensaver$3, reason: invalid class name */
    public static final class AnonymousClass3 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ ChargeMainActivity this$0;

        public AnonymousClass3(ChargeMainActivity r2, List<ResourcesIdInfo> r3) {
            this.this$0 = r2;
            super(r2, R.layout.item_charge_screensaver_select, r3);
        }

        public static /* synthetic */ void OXO1(AnonymousClass3 r0, ResourcesIdInfo r1, ChargeMainActivity r2, int r3, View r4) {
            convert$lambda$0(r0, r1, r2, r3, r4);
        }

        private static final void convert$lambda$0(AnonymousClass3 r2, ResourcesIdInfo r3, ChargeMainActivity r4, int r5, View r6) {
            Iterator r7 = r2.mDatas.iterator();
        L4:
            if (r7.hasNext() == false) goto L6;
            ((ResourcesIdInfo) r7.next()).setSelect(false);
            goto L4
        L6:
            r3.setSelect(true);
            ChargeMainActivity.access$getIvScreensaver(r4).setImageResource(((ResourcesIdInfo) ChargeMainActivity.access$getMScreensaverPics(r4).get(r5)).getResId());
            ChargeMainActivity.access$syncScreensaver(r4);
            r2.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, ResourcesIdInfo r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r4, final ResourcesIdInfo r5, final int r6) {
            Intrinsics.X0O(r4, "holder");
            Intrinsics.X0O(r5, "resourcesIdInfo");
            ImageView r0 = (ImageView) r4.getView(R.id.selectStatus);
            if (r5.isSelect() == false) goto L5;
            int r1 = 0;
        L6:
            r0.setVisibility(r1);
            ((ImageView) r4.getView(R.id.iv)).setImageResource(r5.getResId());
            ImageView r7 = (ImageView) r4.getView(R.id.iv);
            final ChargeMainActivity r2 = this.this$0;
            r7.setOnClickListener(new O01001(this, r5, r2, r6));
            return;
        L5:
            r1 = 8;
            goto L6
        }
    }

    public ChargeMainActivity() {
        this.TAG = "ChargeMain";
        this.refreshLayout$delegate = LazyKt__LazyJVMKt.iO(new i10OXi1(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XO01OIXIi(this));
        this.viewPager$delegate = LazyKt__LazyJVMKt.iO(new iIOOiIIX(this));
        this.viewPagerMain$delegate = LazyKt__LazyJVMKt.iO(new i1O0OXii(this));
        this.viewPagerEarPhone$delegate = LazyKt__LazyJVMKt.iO(new iO0iI(this));
        this.mCurDeviceType = DeviceType.CHARGE;
        this.chargePanel$delegate = LazyKt__LazyJVMKt.iO(new I1IXii0(this));
        this.earphonePanel$delegate = LazyKt__LazyJVMKt.iO(new O1Xii1(this));
        this.itemChargeBind$delegate = LazyKt__LazyJVMKt.iO(new I100I1Iii(this));
        this.itemEarphoneBind$delegate = LazyKt__LazyJVMKt.iO(new XXXXOIi(this));
        this.indicatorContainer$delegate = LazyKt__LazyJVMKt.iO(new I00O(this));
        this.indicatorController$delegate = LazyKt__LazyJVMKt.iO(new OIiIO(this));
        this.pbPower$delegate = LazyKt__LazyJVMKt.iO(new X0101OX(this));
        this.tvPower$delegate = LazyKt__LazyJVMKt.iO(new X000O(this));
        this.tvState$delegate = LazyKt__LazyJVMKt.iO(new i1OO11I(this));
        this.handler = new Handler();
        this.switchStatusRunnable$delegate = LazyKt__LazyJVMKt.iO(new iI1II1(this));
        this.pbRightPower$delegate = LazyKt__LazyJVMKt.iO(new IOiIO(this));
        this.tvRightPower$delegate = LazyKt__LazyJVMKt.iO(new iXIOX10O(this));
        this.pbLeftPower$delegate = LazyKt__LazyJVMKt.iO(new iXX011Oi(this));
        this.tvLeftPower$delegate = LazyKt__LazyJVMKt.iO(new OII01XO0(this));
        this.seekbarLightness$delegate = LazyKt__LazyJVMKt.iO(new OO1XOI0iO(this));
        this.tvLow$delegate = LazyKt__LazyJVMKt.iO(new I00IIiI0(this));
        this.tvMiddle$delegate = LazyKt__LazyJVMKt.iO(new O0IX1(this));
        this.tvHigh$delegate = LazyKt__LazyJVMKt.iO(new O110iXOi(this));
        this.llScreensaver$delegate = LazyKt__LazyJVMKt.iO(new iiO011O1(this));
        this.mScreensaverPics$delegate = LazyKt__LazyJVMKt.iO(new IXI0OO1());
        this.tvScreensaverValue$delegate = LazyKt__LazyJVMKt.iO(new Ii1iO0XO(this));
        this.seekbarScreensaver$delegate = LazyKt__LazyJVMKt.iO(new Xiii10(this));
        this.ivScreensaver$delegate = LazyKt__LazyJVMKt.iO(new I111I(this));
        this.addScreensaver$delegate = LazyKt__LazyJVMKt.iO(new iiXX0O0O(this));
        this.rvScreensaver$delegate = LazyKt__LazyJVMKt.iO(new IO0I1XI(this));
        this.itemMusicManager$delegate = LazyKt__LazyJVMKt.iO(new IOO0Xi0O(this));
        this.itemEBookManager$delegate = LazyKt__LazyJVMKt.iO(new O1X10i(this));
        this.itemVoiceAssistant$delegate = LazyKt__LazyJVMKt.iO(new iXXI0(this));
        this.itemTranslationLayout$delegate = LazyKt__LazyJVMKt.iO(new iO0X0111(this));
        this.itemDialogueTranslationLayout$delegate = LazyKt__LazyJVMKt.iO(new XiIX11O(this));
        this.itemSimultaneousTranslationLayout$delegate = LazyKt__LazyJVMKt.iO(new O00X1(this));
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new X0011(this));
        this.mBleHandleCallback = new XO0O10(this);
        this.checkCall$delegate = LazyKt__LazyJVMKt.iO(new Oi1OX0I(this));
        this.llNoiseSettings$delegate = LazyKt__LazyJVMKt.iO(new XXIX0O1X(this));
        this.ivDenoise$delegate = LazyKt__LazyJVMKt.iO(new iX0i1(this));
        this.ivNoiseClose$delegate = LazyKt__LazyJVMKt.iO(new iXiO1O0(this));
        this.ivNoiseTrans$delegate = LazyKt__LazyJVMKt.iO(new XX01O1X1i(this));
        this.tvDenoise$delegate = LazyKt__LazyJVMKt.iO(new iO1i0Oii(this));
        this.tvNoiseClose$delegate = LazyKt__LazyJVMKt.iO(new IXX1O1(this));
        this.tvNoiseTrans$delegate = LazyKt__LazyJVMKt.iO(new i1110XXI(this));
        this.checkFindEarphoneLeft$delegate = LazyKt__LazyJVMKt.iO(new XiII0i11X(this));
        this.checkFindEarphoneRight$delegate = LazyKt__LazyJVMKt.iO(new I1XiiX0(this));
        this.mEarphoneAncSettings = (BleEarphoneAncSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_ANC_SET, BleEarphoneAncSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ View I0iXXO(ChargeMainActivity r0) {
        return viewPagerMain_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1() {
        return showUnbindPopup$lambda$0$0();
    }

    public static /* synthetic */ RecyclerView I1XOi1(ChargeMainActivity r0) {
        return rvScreensaver_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void II1Xi0(CompoundButton r0, boolean r1) {
        initCall$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(ChargeMainActivity r0, BleConnector r1) {
        return onOnlineScreensavers$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView IO0II0i(ChargeMainActivity r0) {
        return tvNoiseTrans_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox IO0iXO0O(ChargeMainActivity r0) {
        return checkFindEarphoneRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SwipeRefreshLayout IX0IXOi(ChargeMainActivity r0) {
        return refreshLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IX1XiI(ChargeMainActivity r0) {
        return llNoiseSettings_delegate$lambda$0(r0);
    }

    public static /* synthetic */ i1Ii1i11X IXI(ChargeMainActivity r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ArcProgressBar IXOIIIO(ChargeMainActivity r0) {
        return pbLeftPower_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IXXOO(ChargeMainActivity r0) {
        return tvScreensaverValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit Ii0X0X(ChargeMainActivity r0) {
        return selectImagePopup$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit Ii0i(ChargeMainActivity r0, BleConnector r1) {
        return onEarphoneLeftKey$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView Ii1iii0(ChargeMainActivity r0) {
        return ivNoiseClose_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IiiXiI0I(ChargeMainActivity r0) {
        return tvHigh_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O001I(ChargeMainActivity r0) {
        return tvMiddle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DotIndicatorController O0O(ChargeMainActivity r0) {
        return indicatorController_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox O0O0X0iOi(ChargeMainActivity r0) {
        return checkFindEarphoneLeft_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(ChargeMainActivity r0) {
        return selectImagePopup$lambda$0$0(r0);
    }

    public static /* synthetic */ ArcProgressBar O1O(ChargeMainActivity r0) {
        return pbRightPower_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(ChargeMainActivity r0, BleConnector r1) {
        return onVoiceAssistant$lambda$0(r0, r1);
    }

    public static /* synthetic */ View OIX0iXi(ChargeMainActivity r0) {
        return viewPagerEarPhone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OO(ChargeMainActivity r0, BleConnector r1) {
        return syncScreensaver$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OX(ChargeMainActivity r0) {
        return tvPower_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX110i(ChargeMainActivity r0, boolean r1) {
        return onVoiceAssistant$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View Oi(ChargeMainActivity r0) {
        return addScreensaver_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SeekBar OiIIX101O(ChargeMainActivity r0) {
        return seekbarScreensaver_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X00XIX1(ChargeMainActivity r0) {
        return itemVoiceAssistant_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X00Xi1X(ChargeMainActivity r0, boolean r1) {
        return selectImagePopup$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView X01IiOiIi(ChargeMainActivity r0) {
        return ivDenoise_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(ChargeMainActivity r0) {
        return itemSimultaneousTranslationLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0i1O(ChargeMainActivity r0) {
        return chargePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewPager X1(ChargeMainActivity r0) {
        return viewPager_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ScaleSeekBar X100O(ChargeMainActivity r0) {
        return seekbarLightness_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X11I(ChargeMainActivity r0, BleConnector r1) {
        return onSoundEffects$lambda$0(r0, r1);
    }

    public static /* synthetic */ void X11iII1O1(ChargeMainActivity r0) {
        onRefresh$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1IX(ChargeMainActivity r0) {
        return tvState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(ChargeMainActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XO0X10iO() {
        return showShutdownPopup$lambda$0$0();
    }

    public static /* synthetic */ Unit XOIX(View r0, ChargeMainActivity r1, BleConnector r2) {
        return onNoiseSetTab$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XOO0XOOii(ChargeMainActivity r0, BleConnector r1) {
        return onEBookManager$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XOX0O0(ChargeMainActivity r0, BleConnector r1) {
        return onCustomANC$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XOXiX0(ChargeMainActivity r0) {
        return tvNoiseClose_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound XX0(ChargeMainActivity r0) {
        return ivScreensaver_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XX00i10X(ChargeMainActivity r0) {
        return earphonePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ List XX1Oi() {
        return mScreensaverPics_delegate$lambda$0();
    }

    public static /* synthetic */ TextView XXI(ChargeMainActivity r0) {
        return tvLow_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXIIO1i11(ChargeMainActivity r0) {
        return ivNoiseTrans_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXO(ChargeMainActivity r0) {
        return itemEBookManager_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXX11i(ChargeMainActivity r0) {
        return tvDenoise_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXiIiX10(ChargeMainActivity r0) {
        return tvLeftPower_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXiO0i(ChargeMainActivity r0) {
        switchStatusRunnable_delegate$lambda$0$0(r0);
    }

    public static /* synthetic */ ViewGroup Xi1i0XOX0(ChargeMainActivity r0) {
        return itemChargeBind_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(ChargeMainActivity r0, View r1) {
        initFindEarphone$lambda$0(r0, r1);
    }

    public static /* synthetic */ ViewGroup XiOIii1(ChargeMainActivity r0) {
        return indicatorContainer_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(ChargeMainActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$autoSyncData(ChargeMainActivity r0, long r1) {
        r0.autoSyncData(r1);
    }

    public static final /* synthetic */ Handler access$getHandler$p(ChargeMainActivity r0) {
        return r0.handler;
    }

    public static final /* synthetic */ ImageViewRound access$getIvScreensaver(ChargeMainActivity r0) {
        return r0.getIvScreensaver();
    }

    public static final /* synthetic */ DeviceType access$getMCurDeviceType$p(ChargeMainActivity r0) {
        return r0.mCurDeviceType;
    }

    public static final /* synthetic */ BleEarphoneAncSettings access$getMEarphoneAncSettings$p(ChargeMainActivity r0) {
        return r0.mEarphoneAncSettings;
    }

    public static final /* synthetic */ c72 access$getMProgressPop$p(ChargeMainActivity r0) {
        return r0.mProgressPop;
    }

    public static final /* synthetic */ IXO000 access$getMScreensaver$p(ChargeMainActivity r0) {
        return r0.mScreensaver;
    }

    public static final /* synthetic */ List access$getMScreensaverPics(ChargeMainActivity r0) {
        return r0.getMScreensaverPics();
    }

    public static final /* synthetic */ xz3 access$getMSelectAvatarPopup$p(ChargeMainActivity r0) {
        return r0.mSelectAvatarPopup;
    }

    public static final /* synthetic */ SwipeRefreshLayout access$getRefreshLayout(ChargeMainActivity r0) {
        return r0.getRefreshLayout();
    }

    public static final /* synthetic */ ScaleSeekBar access$getSeekbarLightness(ChargeMainActivity r0) {
        return r0.getSeekbarLightness();
    }

    public static final /* synthetic */ SeekBar access$getSeekbarScreensaver(ChargeMainActivity r0) {
        return r0.getSeekbarScreensaver();
    }

    public static final /* synthetic */ Runnable access$getSwitchStatusRunnable(ChargeMainActivity r0) {
        return r0.getSwitchStatusRunnable();
    }

    public static final /* synthetic */ TextView access$getTvHigh(ChargeMainActivity r0) {
        return r0.getTvHigh();
    }

    public static final /* synthetic */ TextView access$getTvLow(ChargeMainActivity r0) {
        return r0.getTvLow();
    }

    public static final /* synthetic */ TextView access$getTvMiddle(ChargeMainActivity r0) {
        return r0.getTvMiddle();
    }

    public static final /* synthetic */ TextView access$getTvScreensaverValue(ChargeMainActivity r0) {
        return r0.getTvScreensaverValue();
    }

    public static final /* synthetic */ TextView access$getTvState(ChargeMainActivity r0) {
        return r0.getTvState();
    }

    public static final /* synthetic */ View access$getViewPagerEarPhone(ChargeMainActivity r0) {
        return r0.getViewPagerEarPhone();
    }

    public static final /* synthetic */ View access$getViewPagerMain(ChargeMainActivity r0) {
        return r0.getViewPagerMain();
    }

    public static final /* synthetic */ void access$initCall(ChargeMainActivity r0) {
        r0.initCall();
    }

    public static final /* synthetic */ void access$initFindEarphone(ChargeMainActivity r0) {
        r0.initFindEarphone();
    }

    public static final /* synthetic */ void access$initLightness(ChargeMainActivity r0) {
        r0.initLightness();
    }

    public static final /* synthetic */ void access$initNoiseSet(ChargeMainActivity r0) {
        r0.initNoiseSet();
    }

    public static final /* synthetic */ void access$setMCurDeviceType$p(ChargeMainActivity r0, DeviceType r1) {
        r0.mCurDeviceType = r1;
    }

    public static final /* synthetic */ void access$setMEarphoneAncSettings$p(ChargeMainActivity r0, BleEarphoneAncSettings r1) {
        r0.mEarphoneAncSettings = r1;
    }

    public static final /* synthetic */ void access$setMProgressPop$p(ChargeMainActivity r0, c72 r1) {
        r0.mProgressPop = r1;
    }

    public static final /* synthetic */ void access$showCurDeviceView(ChargeMainActivity r0, DeviceType r1) {
        r0.showCurDeviceView(r1);
    }

    public static final /* synthetic */ void access$showNoiseSetTab(ChargeMainActivity r0, int r1) {
        r0.showNoiseSetTab(r1);
    }

    public static final /* synthetic */ void access$syncDone(ChargeMainActivity r0) {
        r0.syncDone();
    }

    public static final /* synthetic */ void access$syncFailed(ChargeMainActivity r0) {
        r0.syncFailed();
    }

    public static final /* synthetic */ void access$syncInfo(ChargeMainActivity r0) {
        r0.syncInfo();
    }

    public static final /* synthetic */ void access$syncScreensaver(ChargeMainActivity r0) {
        r0.syncScreensaver();
    }

    private static final View addScreensaver_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.add_screensaver);
    }

    private final void autoSyncData(long r3) {
        initInfo();
        timerCancel();
        this.timer = new Timer(true);
        OXO1 r0 = new OXO1(this);
        this.autoDataSync = r0;
        Timer r1 = this.timer;
        if (r1 == null) goto L6;
        r1.schedule(r0, r3);
        return;
    }

    public static /* synthetic */ void autoSyncData$default(ChargeMainActivity r0, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = 20000;
    L5:
        r0.autoSyncData(r1);
    }

    private static final View chargePanel_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.charge_panel);
    }

    private static final CheckBox checkCall_delegate$lambda$0(ChargeMainActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_call);
    }

    private static final CheckBox checkFindEarphoneLeft_delegate$lambda$0(ChargeMainActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_find_earphone_left);
    }

    private static final CheckBox checkFindEarphoneRight_delegate$lambda$0(ChargeMainActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_find_earphone_right);
    }

    private final boolean checkNotificationPermission() {
        boolean r0 = MyNotificationListenerService.O001I.O00(this);
        if (r0 == false) goto L5;
    L10:
        return r0;
    L5:
        if (this.mNotificationPopup != null) goto L7;
        final go0 r1 = new go0(this, 0, 2, null);
        String r2 = getString(R.string.allow_notification_access, new Object[]{getString(R.string.app_name)});
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r1.iI(r2);
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new IX1X1iIiX(r1));
        this.mNotificationPopup = r1;
    L7:
        go0 r3 = this.mNotificationPopup;
        if (r3 == null) goto L10;
        r3.IIX1OXO();
        goto L10
    }

    private static final boolean checkNotificationPermission$lambda$0$0$0(go0 r1) {
        MyNotificationListenerService.O001I.I0IIOi(r1.XO0O10());
        return true;
    }

    private static final View earphonePanel_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.earphone_panel);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final View getAddScreensaver() {
        return (View) getValue();
    }

    private final View getChargePanel() {
        return (View) getValue();
    }

    private final CheckBox getCheckCall() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckFindEarphoneLeft() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckFindEarphoneRight() {
        return (CheckBox) getValue();
    }

    private final View getEarphonePanel() {
        return (View) getValue();
    }

    private final ViewGroup getIndicatorContainer() {
        return (ViewGroup) getValue();
    }

    private final DotIndicatorController getIndicatorController() {
        return (DotIndicatorController) getValue();
    }

    private final ViewGroup getItemChargeBind() {
        return (ViewGroup) getValue();
    }

    private final View getItemDialogueTranslationLayout() {
        return (View) getValue();
    }

    private final View getItemEBookManager() {
        return (View) getValue();
    }

    private final ViewGroup getItemEarphoneBind() {
        return (ViewGroup) getValue();
    }

    private final View getItemMusicManager() {
        return (View) getValue();
    }

    private final View getItemSimultaneousTranslationLayout() {
        return (View) getValue();
    }

    private final View getItemTranslationLayout() {
        return (View) getValue();
    }

    private final View getItemVoiceAssistant() {
        return (View) getValue();
    }

    private final ImageView getIvDenoise() {
        return (ImageView) getValue();
    }

    private final ImageView getIvNoiseClose() {
        return (ImageView) getValue();
    }

    private final ImageView getIvNoiseTrans() {
        return (ImageView) getValue();
    }

    private final ImageViewRound getIvScreensaver() {
        return (ImageViewRound) getValue();
    }

    private final View getLlNoiseSettings() {
        return (View) getValue();
    }

    private final View getLlScreensaver() {
        return (View) getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private final List<ResourcesIdInfo> getMScreensaverPics() {
        return (List) getValue();
    }

    private final ArcProgressBar getPbLeftPower() {
        return (ArcProgressBar) getValue();
    }

    private final ArcProgressBar getPbPower() {
        return (ArcProgressBar) getValue();
    }

    private final ArcProgressBar getPbRightPower() {
        return (ArcProgressBar) getValue();
    }

    private final SwipeRefreshLayout getRefreshLayout() {
        return (SwipeRefreshLayout) getValue();
    }

    private final RecyclerView getRvScreensaver() {
        return (RecyclerView) getValue();
    }

    private final ScaleSeekBar getSeekbarLightness() {
        return (ScaleSeekBar) getValue();
    }

    private final SeekBar getSeekbarScreensaver() {
        return (SeekBar) getValue();
    }

    private final Runnable getSwitchStatusRunnable() {
        return (Runnable) getValue();
    }

    private final TextView getTvDenoise() {
        return (TextView) getValue();
    }

    private final TextView getTvHigh() {
        return (TextView) getValue();
    }

    private final TextView getTvLeftPower() {
        return (TextView) getValue();
    }

    private final TextView getTvLow() {
        return (TextView) getValue();
    }

    private final TextView getTvMiddle() {
        return (TextView) getValue();
    }

    private final TextView getTvNoiseClose() {
        return (TextView) getValue();
    }

    private final TextView getTvNoiseTrans() {
        return (TextView) getValue();
    }

    private final TextView getTvPower() {
        return (TextView) getValue();
    }

    private final TextView getTvRightPower() {
        return (TextView) getValue();
    }

    private final TextView getTvScreensaverValue() {
        return (TextView) getValue();
    }

    private final TextView getTvState() {
        return (TextView) getValue();
    }

    private final ViewPager getViewPager() {
        return (ViewPager) getValue();
    }

    private final View getViewPagerEarPhone() {
        return (View) getValue();
    }

    private final View getViewPagerMain() {
        return (View) getValue();
    }

    public static /* synthetic */ void i010I(ChargeMainActivity r0, View r1) {
        initScreensaver$lambda$0(r0, r1);
    }

    public static /* synthetic */ void i0X000X0O(ChargeMainActivity r0) {
        initView$lambda$1(r0);
    }

    public static /* synthetic */ ArcProgressBar i11I(ChargeMainActivity r0) {
        return pbPower_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox iI(ChargeMainActivity r0) {
        return checkCall_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIXi1iiXI(ChargeMainActivity r0, BleConnector r1) {
        return onEarphoneRightKey$lambda$0(r0, r1);
    }

    public static /* synthetic */ void iIiiO(ChargeMainActivity r0, View r1) {
        initFindEarphone$lambda$1(r0, r1);
    }

    public static /* synthetic */ TextView iOI(ChargeMainActivity r0) {
        return tvRightPower_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iOO1ii1(ChargeMainActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOOX010X(ChargeMainActivity r0) {
        return itemDialogueTranslationLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOiXi11II(ChargeMainActivity r0) {
        return llScreensaver_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX(ChargeMainActivity r0) {
        return itemTranslationLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup iX1O1(ChargeMainActivity r0) {
        return itemEarphoneBind_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iXi(go0 r0) {
        return checkNotificationPermission$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Runnable iXiX011(ChargeMainActivity r0) {
        return switchStatusRunnable_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iXiiiO(ChargeMainActivity r0) {
        return itemMusicManager_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iiIOiX(ChargeMainActivity r0, BleConnector r1) {
        return onMusicManager$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iiiO(ChargeMainActivity r0, BleConnector r1) {
        return onFirmwareUpgrade$lambda$0(r0, r1);
    }

    private static final ViewGroup indicatorContainer_delegate$lambda$0(ChargeMainActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.indicator_container);
    }

    private static final DotIndicatorController indicatorController_delegate$lambda$0(ChargeMainActivity r1) {
        return new DotIndicatorController(r1);
    }

    private final void initCall() {
        getCheckCall().setChecked(OiOX0i.XIi00iiXO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.EARPHONE_CALL, 0, null, 6, null)));
        getCheckCall().setOnCheckedChangeListener(new iOX0XX());
    }

    private static final void initCall$lambda$0(CompoundButton r9, boolean r10) {
        Intrinsics.X0O(r9, "buttonView");
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.EARPHONE_CALL, BleKeyFlag.UPDATE, OiOX0i.iO(r10), false, false, 24, null);
    }

    private final void initFindEarphone() {
        BleFindEarphone r0 = (BleFindEarphone) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.FIND_EARPHONE, BleFindEarphone.class, null, null, 12, null);
        CheckBox r1 = getCheckFindEarphoneLeft();
        boolean r3 = false;
        if (r0.getMLeft() != 1) goto L5;
        boolean r2 = true;
    L6:
        r1.setChecked(r2);
        ViewParent r4 = getCheckFindEarphoneLeft().getParent();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r4).setOnClickListener(new O10XI1(this));
        CheckBox r5 = getCheckFindEarphoneRight();
        if (r0.getMRight() != 1) goto L9;
        r3 = true;
    L9:
        r5.setChecked(r3);
        ViewParent r6 = getCheckFindEarphoneRight().getParent();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r6).setOnClickListener(new I00I0X0(this));
        return;
    L5:
        r2 = false;
        goto L6
    }

    private static final void initFindEarphone$lambda$0(ChargeMainActivity r9, View r10) {
        BleEarphoneState r11 = (BleEarphoneState) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_STATE, BleEarphoneState.class, null, 4, null);
        if (r11 != null) goto L5;
    L10:
        ToastUtils.showShort(R.string.not_connected);
        return;
    L5:
        if (r11.getMLeftState() != 1) goto L10;
        r9.getCheckFindEarphoneLeft().setChecked(true ^ r9.getCheckFindEarphoneLeft().isChecked());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FIND_EARPHONE, BleKeyFlag.UPDATE, new BleFindEarphone(OiOX0i.iO(r9.getCheckFindEarphoneLeft().isChecked()), OiOX0i.iO(r9.getCheckFindEarphoneRight().isChecked())), false, false, 24, null);
        if (r9.getCheckFindEarphoneLeft().isChecked() == false) goto L12;
        ToastUtils.showLong(r9.getString(R.string.find_earphone_on), new Object[0]);
        return;
    }

    private static final void initFindEarphone$lambda$1(ChargeMainActivity r9, View r10) {
        BleEarphoneState r11 = (BleEarphoneState) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_STATE, BleEarphoneState.class, null, 4, null);
        if (r11 != null) goto L5;
    L10:
        ToastUtils.showShort(R.string.not_connected);
        return;
    L5:
        if (r11.getMRightState() != 1) goto L10;
        r9.getCheckFindEarphoneRight().setChecked(true ^ r9.getCheckFindEarphoneRight().isChecked());
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.FIND_EARPHONE, BleKeyFlag.UPDATE, new BleFindEarphone(OiOX0i.iO(r9.getCheckFindEarphoneLeft().isChecked()), OiOX0i.iO(r9.getCheckFindEarphoneRight().isChecked())), false, false, 24, null);
        if (r9.getCheckFindEarphoneRight().isChecked() == false) goto L12;
        ToastUtils.showLong(r9.getString(R.string.find_earphone_on), new Object[0]);
        return;
    }

    private final void initIndicator() {
        getIndicatorContainer().addView(getIndicatorController().newInstance(this));
        getIndicatorController().initialize(2);
        getIndicatorController().setUnselectedIndicatorColor(ContextCompat.getColor(this, R.color.charge_info_pb_bg_color));
        getIndicatorController().setSelectedIndicatorColor(ContextCompat.getColor(this, R.color.charge_info_pb_end_color));
    }

    private final void initInfo() {
        BleCache r0 = BleCache.INSTANCE;
        int r1 = BaseBleCache.getInt$default(r0, BleKey.POWER, 0, null, 4, null);
        getTvPower().setText(getString(R.string.d_percent, new Object[]{Integer.valueOf(r1)}));
        getPbPower().iO(r1, 100);
        getPbLeftPower().setProgress(1.0f);
        getPbRightPower().setProgress(1.0f);
        BleEarphonePower r2 = (BleEarphonePower) BaseBleCache.getObject$default(r0, BleKey.EARPHONE_POWER, BleEarphonePower.class, null, 4, null);
        if (r2 == null) goto L5;
        getTvLeftPower().setText(getString(R.string.d_percent, new Object[]{Integer.valueOf(r2.getMLeftPower())}));
        getPbLeftPower().iO(r2.getMLeftPower(), 100);
        getTvRightPower().setText(getString(R.string.d_percent, new Object[]{Integer.valueOf(r2.getMRightPower())}));
        getPbRightPower().iO(r2.getMRightPower(), 100);
    L5:
        showCurDeviceState();
    }

    private final void initLightness() {
        getSeekbarLightness().setOnSeekBarChangeListener(new XIi00iiXO(this));
        int r0 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.SCREEN_BRIGHTNESS_SET, 0, null, 4, null);
        getSeekbarLightness().setProgress(valueToProgress(r0));
    }

    private final void initNoiseSet() {
        BleEarphoneKey r0 = (BleEarphoneKey) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_KEY, BleEarphoneKey.class, null, null, 12, null);
        View r1 = getLlNoiseSettings();
        if (r0.getMType() != 1) goto L5;
        int r2 = 8;
    L6:
        r1.setVisibility(r2);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    private final void initScreensaver() {
        View r0 = getLlScreensaver();
        q62 r1 = q62.OXO1;
        if (r1.XX() == false) goto L5;
        int r2 = 0;
    L6:
        r0.setVisibility(r2);
        getAddScreensaver().setOnClickListener(new O0OXOO1I(this));
        ImageViewRound r3 = getIvScreensaver();
        Intrinsics.O10IXXX0X(r3, "<get-ivScreensaver>(...)");
        IXO000 r4 = new IXO000(this, r3);
        this.mScreensaver = r4;
        Intrinsics.XXI(r4);
        float r5 = r4.IiI10X();
        IXO000 r6 = this.mScreensaver;
        Intrinsics.XXI(r6);
        float r7 = (r5 / r6.XOO0ii0()) * 110.0f;
        ImageViewRound r8 = getIvScreensaver();
        Intrinsics.O10IXXX0X(r8, "<get-ivScreensaver>(...)");
        LibExKt.i100IXOX(r8, SizeUtils.dp2px(110.0f), SizeUtils.dp2px(r7));
        ImageViewRound r9 = getIvScreensaver();
        IXO000 r10 = this.mScreensaver;
        Intrinsics.XXI(r10);
        r9.setRadius(SizeUtils.dp2px(r10.I0IIOi()));
        RecyclerView r11 = getRvScreensaver();
        LinearLayoutManager r12 = new LinearLayoutManager(this);
        r12.setOrientation(0);
        r11.setLayoutManager(r12);
        getRvScreensaver().setAdapter(new AnonymousClass3(this, getMScreensaverPics()));
        int r13 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.BACK_LIGHT, r1.XXX11i(), null, 4, null);
        getSeekbarScreensaver().setProgress(r13 - 3);
        getTvScreensaverValue().setText(getString(R.string.d_s, new Object[]{Integer.valueOf(r13)}));
        getSeekbarScreensaver().setOnSeekBarChangeListener(new iO(this));
        DeviceInfoChecker.OXO1.I1();
        return;
    L5:
        r2 = 8;
        goto L6
    }

    private static final void initScreensaver$lambda$0(ChargeMainActivity r0, View r1) {
        r0.selectImagePopup();
    }

    private static final void initView$lambda$0(ChargeMainActivity r1, View r2) {
        r1.startActivityForResult(new Intent(r1, MultiDeviceManagerActivity.class), 7);
    }

    private static final void initView$lambda$1(ChargeMainActivity r0) {
        r0.onRefresh();
    }

    private final void initViewPager() {
        getViewPager().setAdapter(new AnonymousClass1(this));
        getViewPager().addOnPageChangeListener(new AnonymousClass2(this));
    }

    private static final ViewGroup itemChargeBind_delegate$lambda$0(ChargeMainActivity r1) {
        return (ViewGroup) r1.getViewPagerMain().findViewById(R.id.item_charge_bind);
    }

    private static final View itemDialogueTranslationLayout_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.ear_dialogue_translation_layout);
    }

    private static final View itemEBookManager_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.item_ebook_manager);
    }

    private static final ViewGroup itemEarphoneBind_delegate$lambda$0(ChargeMainActivity r1) {
        return (ViewGroup) r1.getViewPagerEarPhone().findViewById(R.id.item_earphone_bind);
    }

    private static final View itemMusicManager_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.item_music_manager);
    }

    private static final View itemSimultaneousTranslationLayout_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.ear_simultaneous_translation_layout);
    }

    private static final View itemTranslationLayout_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.ear_translation_layout);
    }

    private static final View itemVoiceAssistant_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.item_voice_assistant);
    }

    private static final ImageView ivDenoise_delegate$lambda$0(ChargeMainActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_denoise);
    }

    private static final ImageView ivNoiseClose_delegate$lambda$0(ChargeMainActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_noise_close);
    }

    private static final ImageView ivNoiseTrans_delegate$lambda$0(ChargeMainActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_transparent);
    }

    private static final ImageViewRound ivScreensaver_delegate$lambda$0(ChargeMainActivity r1) {
        return (ImageViewRound) r1.getViewPagerMain().findViewById(R.id.iv_screensaver);
    }

    private static final View llNoiseSettings_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.ll_noise_settings);
    }

    private static final View llScreensaver_delegate$lambda$0(ChargeMainActivity r1) {
        return r1.findViewById(R.id.ll_screensaver);
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(ChargeMainActivity r3) {
        return new i1Ii1i11X(r3.getMContext(), new O00(r3));
    }

    private static final List mScreensaverPics_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.pic_screensaver_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.pic_screensaver_5, 0, false, 6, null)});
    }

    public static /* synthetic */ void onBindStateChange$default(ChargeMainActivity r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.onBindStateChange(r1);
    }

    private static final Unit onCustomANC$lambda$0(ChargeMainActivity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        r1.startActivity(new Intent(r1, CustomAncActivity.class));
        return Unit.OXO1;
    }

    private static final Unit onEBookManager$lambda$0(ChargeMainActivity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        r1.startActivity(new Intent(r1, EBookManagerActivity.class));
        return Unit.OXO1;
    }

    private static final Unit onEarphoneLeftKey$lambda$0(ChargeMainActivity r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 0);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3, EarphoneKeySettingsActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final Unit onEarphoneRightKey$lambda$0(ChargeMainActivity r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3, EarphoneKeySettingsActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final Unit onFirmwareUpgrade$lambda$0(ChargeMainActivity r4, BleConnector r5) {
        Intrinsics.X0O(r5, "it");
        if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) >= 50) goto L5;
        ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
    L9:
        return Unit.OXO1;
    L5:
        if ((System.currentTimeMillis() - r4.lastClickTime) < 3000) goto L9;
        r4.lastClickTime = System.currentTimeMillis();
        DeviceInfoChecker.I0IIOi(DeviceInfoChecker.OXO1, new IiI10X(r4), null, 2, null);
        goto L9
    }

    private static final Unit onMusicManager$lambda$0(ChargeMainActivity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        r1.startActivity(new Intent(r1, MusicManagerV2Activity.class));
        return Unit.OXO1;
    }

    private static final Unit onNoiseSetTab$lambda$0(View r8, ChargeMainActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        int r11 = r8.getId();
        if (r11 != R.id.iv_denoise) goto L5;
        int r12 = 1;
    L9:
        r9.mEarphoneAncSettings.setMMode(r12);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.EARPHONE_ANC_SET, BleKeyFlag.UPDATE, r9.mEarphoneAncSettings, false, false, 24, null);
        r9.showNoiseSetTab(r12);
        return Unit.OXO1;
    L5:
        if (r11 == R.id.iv_transparent) goto L7;
        r12 = 0;
        goto L9
    L7:
        r12 = 2;
        goto L9
    }

    private static final Unit onOnlineScreensavers$lambda$0(ChargeMainActivity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        i72.OXO1.OOIX(r1);
        return Unit.OXO1;
    }

    private final void onRefresh() {
        if (BleConnector.INSTANCE.isAvailable() == true) goto L5;
        ToastUtils.showShort(R.string.not_connected);
        new Handler().postDelayed(new X0X1(this), 2000);
        return;
    L5:
        if (a01.OXO1.OXO1().getBoolean(b01.OX) == true) goto L10;
        syncInfo();
        return;
    }

    private static final void onRefresh$lambda$0(ChargeMainActivity r2) {
        r2.getRefreshLayout().setRefreshing(false);
        a01.OXO1.OXO1().put(b01.OX, r2.getRefreshLayout().isRefreshing());
    }

    private static final Unit onSoundEffects$lambda$0(ChargeMainActivity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        r1.startActivity(new Intent(r1, SoundEffectsSampleActivity.class));
        return Unit.OXO1;
    }

    private static final Unit onVoiceAssistant$lambda$0(final ChargeMainActivity r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        q62 r4 = q62.OXO1;
        if (r4.IiX1ii() == true) goto L12;
        if (r4.OIXOOi() == true) goto L12;
        if (TextUtils.isEmpty(r4.iIiiO()) == false) goto L12;
        if (r4.XOX() == true) goto L12;
        UtilsKt.XXiO0i(r2);
    L19:
        return Unit.OXO1;
    L12:
        if (r4.IOI0i0I() == false) goto L17;
        VoiceManager r5 = VoiceManager.INSTANCE;
        if (r5.isExpired() == false) goto L16;
        r5.checkBaiduAuth(r2, r2.getRefreshLayout(), new XXX0O1X(r2));
        goto L19
    L16:
        r2.startActivity(new Intent(r2, VoiceActivity.class));
        goto L19
    L17:
        r2.startActivity(new Intent(r2, VoiceActivity.class));
        goto L19
    }

    private static final Unit onVoiceAssistant$lambda$0$0(ChargeMainActivity r1, boolean r2) {
        if (r2 == false) goto L4;
        r1.startActivity(new Intent(r1, VoiceActivity.class));
    L6:
        return Unit.OXO1;
    L4:
        r1.startActivity(new Intent(r1, VoiceSetActivity.class));
        goto L6
    }

    private static final ArcProgressBar pbLeftPower_delegate$lambda$0(ChargeMainActivity r1) {
        return (ArcProgressBar) r1.findViewById(R.id.pb_earphone_l);
    }

    private static final ArcProgressBar pbPower_delegate$lambda$0(ChargeMainActivity r1) {
        return (ArcProgressBar) r1.findViewById(R.id.pb_power);
    }

    private static final ArcProgressBar pbRightPower_delegate$lambda$0(ChargeMainActivity r1) {
        return (ArcProgressBar) r1.findViewById(R.id.pb_earphone_r);
    }

    private static final SwipeRefreshLayout refreshLayout_delegate$lambda$0(ChargeMainActivity r1) {
        return (SwipeRefreshLayout) r1.findViewById(R.id.srf);
    }

    private static final RecyclerView rvScreensaver_delegate$lambda$0(ChargeMainActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv_screensaver);
    }

    private static final ScaleSeekBar seekbarLightness_delegate$lambda$0(ChargeMainActivity r1) {
        return (ScaleSeekBar) r1.findViewById(R.id.seekbar_lightness);
    }

    private static final SeekBar seekbarScreensaver_delegate$lambda$0(ChargeMainActivity r1) {
        return (SeekBar) r1.findViewById(R.id.seekbar_screensaver);
    }

    private final void selectImagePopup() {
        if (this.mSelectAvatarPopup != null) goto L5;
        xz3 r0 = new xz3(this);
        r0.iX(new O1OX(this));
        r0.i010I(new XXOiX(this));
        this.mSelectAvatarPopup = r0;
    L5:
        xz3 r1 = this.mSelectAvatarPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final Unit selectImagePopup$lambda$0$0(final ChargeMainActivity r3) {
        hr1.OXO1.iOOX010X(r3.getMContext(), new O0i0i0(r3));
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$0$0(ChargeMainActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().iO();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$1(ChargeMainActivity r0) {
        r0.getMCrop().OIX0iXi();
        return Unit.OXO1;
    }

    private final void showCurDeviceState() {
        if (this.mCurDeviceType == DeviceType.CHARGE) goto L5;
        BleEarphoneState r0 = (BleEarphoneState) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_STATE, BleEarphoneState.class, null, 4, null);
        if (BleConnector.INSTANCE.isAvailable() == true) goto L13;
    L22:
        getTvState().setText(R.string.device_disconnected);
        return;
    L13:
        if (r0 != null) goto L15;
    L17:
        if (r0 == null) goto L22;
        if (r0.getMRightState() != 1) goto L22;
    L20:
        getTvState().setText(R.string.device_connectied);
        return;
    L15:
        if (r0.getMLeftState() != 1) goto L17;
    L5:
        if (BleConnector.INSTANCE.isAvailable() == false) goto L8;
        getTvState().setText(R.string.device_connectied);
        return;
    L8:
        getTvState().setText(R.string.device_disconnected);
    }

    private final void showCurDeviceView(DeviceType r11) {
        getViewPager().setCurrentItem(r11.ordinal());
        getIndicatorController().selectPosition(r11.ordinal());
        if (r11 != DeviceType.CHARGE) goto L5;
        getChargePanel().setVisibility(0);
        getEarphonePanel().setVisibility(8);
        ((TextView) findViewById(R.id.abh_title_center)).setText(q62.OXO1.O1O());
    L16:
        showCurDeviceState();
        return;
    L5:
        getChargePanel().setVisibility(8);
        getEarphonePanel().setVisibility(0);
        BleEarphoneInfo r12 = (BleEarphoneInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.EARPHONE_INFO, BleEarphoneInfo.class, null, 4, null);
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        String r1 = null;
        if (r12 == null) goto L8;
        String r2 = r12.getMBleName();
    L10:
        if (TextUtils.isEmpty(r2) == false) goto L12;
        String r13 = "TW03";
    L15:
        r0.setText(r13);
        goto L16
    L12:
        if (r12 == null) goto L14;
        r1 = r12.getMBleName();
    L14:
        r13 = r1;
        goto L15
    L8:
        r2 = null;
        goto L10
    }

    private final void showNoiseSetTab(int r5) {
        getIvDenoise().setBackgroundResource(R.color.transparent);
        getIvDenoise().setImageResource(R.drawable.ic_denoise_gray);
        getTvDenoise().setEnabled(false);
        getIvNoiseClose().setBackgroundResource(R.color.transparent);
        getIvNoiseClose().setImageResource(R.drawable.ic_noise_close_gray);
        getTvNoiseClose().setEnabled(false);
        getIvNoiseTrans().setBackgroundResource(R.color.transparent);
        getIvNoiseTrans().setImageResource(R.drawable.ic_transparent_gray);
        getTvNoiseTrans().setEnabled(false);
        if (r5 != 1) goto L5;
        getIvDenoise().setBackgroundResource(R.drawable.shape_charge_panel_set_fg);
        getIvDenoise().setImageResource(R.drawable.ic_denoise_true);
        getTvDenoise().setEnabled(true);
        return;
    L5:
        if (r5 == 2) goto L8;
        getIvNoiseClose().setBackgroundResource(R.drawable.shape_charge_panel_set_fg);
        getIvNoiseClose().setImageResource(R.drawable.ic_noise_close_true);
        getTvNoiseClose().setEnabled(true);
        return;
    L8:
        getIvNoiseTrans().setBackgroundResource(R.drawable.shape_charge_panel_set_fg);
        getIvNoiseTrans().setImageResource(R.drawable.ic_transparent_true);
        getTvNoiseTrans().setEnabled(true);
    }

    private final void showShutdownPopup() {
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.shutdown_tip);
        r0.iX(Integer.valueOf(R.string.charge_shutdown_tip));
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.shutdown, new i1O1XOI());
        r0.IIX1OXO();
    }

    private static final boolean showShutdownPopup$lambda$0$0() {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        return true;
    }

    private final void showUnbindPopup() {
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.unbind_tip);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new iOIOI());
        r0.IIX1OXO();
    }

    private static final boolean showUnbindPopup$lambda$0$0() {
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        return true;
    }

    private static final Runnable switchStatusRunnable_delegate$lambda$0(final ChargeMainActivity r1) {
        return new OiiXi0OX0(r1);
    }

    private static final void switchStatusRunnable_delegate$lambda$0$0(ChargeMainActivity r0) {
        r0.showCurDeviceState();
    }

    private final void syncDone() {
        getRefreshLayout().setRefreshing(false);
        a01.OXO1.OXO1().put(b01.OX, getRefreshLayout().isRefreshing());
        if (this.isShow == false) goto L6;
        autoSyncData$default(this, 0, 1, null);
        return;
    }

    private final void syncFailed() {
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.mProgressPop = null;
        ToastUtils.showLong(R.string.sync_failed);
    }

    private final void syncInfo() {
        a01.OXO1.OXO1().put(b01.OX, true);
        BleConnector r3 = BleConnector.INSTANCE;
        BleKey r4 = BleKey.POWER;
        BleKeyFlag r5 = BleKeyFlag.READ;
        BaseBleConnector.sendData$default(r3, r4, r5, null, false, false, 28, null);
        BaseBleConnector.sendData$default(r3, BleKey.EARPHONE_POWER, r5, null, false, false, 28, null);
        BaseBleConnector.sendData$default(r3, BleKey.EARPHONE_STATE, r5, null, false, false, 28, null);
    }

    private final void syncScreensaver() {
        X0IOiX1O.XIi00iiXO(false, new XO10iX(this), 1, null);
    }

    private static final Unit syncScreensaver$lambda$0(ChargeMainActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        IXO000 r12 = r10.mScreensaver;
        if (r12 == null) goto L10;
        if (r10.mProgressPop != null) goto L8;
        int r3 = 0;
        c72 r0 = new c72(r10, r3, 2, null);
        r0.I1(R.string.syncing);
        r0.OX(0);
        r10.mProgressPop = r0;
        r0.IIX1OXO();
        BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.WATCH_FACE, r12.OXO1(), 0, 4, null);
        goto L10
    L8:
        return Unit.OXO1;
    L10:
        return Unit.OXO1;
    }

    private final void timerCancel() {
        Timer r0 = this.timer;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        TimerTask r1 = this.autoDataSync;
        if (r1 == null) goto L9;
        r1.cancel();
        return;
    }

    private static final TextView tvDenoise_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_noise_mode_denoise);
    }

    private static final TextView tvHigh_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.item_lightness_tv_high);
    }

    private static final TextView tvLeftPower_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_earphone_l);
    }

    private static final TextView tvLow_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.item_lightness_tv_low);
    }

    private static final TextView tvMiddle_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.item_lightness_tv_middle);
    }

    private static final TextView tvNoiseClose_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_noise_mode_close);
    }

    private static final TextView tvNoiseTrans_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_noise_mode_transparent);
    }

    private static final TextView tvPower_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_power);
    }

    private static final TextView tvRightPower_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_earphone_r);
    }

    private static final TextView tvScreensaverValue_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_screensaver_value);
    }

    private static final TextView tvState_delegate$lambda$0(ChargeMainActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_state);
    }

    private final int valueToProgress(int r2) {
        if (r2 >= 2) goto L6;
        return 1;
    L6:
        if (r2 <= 2) goto L9;
        return 3;
    L9:
        return 2;
    }

    private static final View viewPagerEarPhone_delegate$lambda$0(ChargeMainActivity r2) {
        return LayoutInflater.from(r2).inflate(R.layout.layout_charge_viewpager_earphone, null);
    }

    private static final View viewPagerMain_delegate$lambda$0(ChargeMainActivity r2) {
        return LayoutInflater.from(r2).inflate(R.layout.layout_charge_viewpager_main, null);
    }

    private static final ViewPager viewPager_delegate$lambda$0(ChargeMainActivity r1) {
        return (ViewPager) r1.findViewById(R.id.device_viewpager);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseChargeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        i1Ii1i11X.O10IXXX0X(getMCrop(), this, null, 2, null);
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.title_bar));
        setNavBarColor(this, gk4.iO(this, R.color.charge_bg_end_color));
        int r1 = 0;
        if (i72.OXO1.XIIIO() == false) goto L5;
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_multi_device);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.light));
        getAbhTitleRight().setOnClickListener(new i0X0Ii(this));
    L5:
        getRefreshLayout().setOnRefreshListener(new iIOiO(this));
        initViewPager();
        initIndicator();
        initLightness();
        initScreensaver();
        initCall();
        View r0 = getItemMusicManager();
        q62 r2 = q62.OXO1;
        if (r2.iXI() == false) goto L8;
        int r3 = 0;
    L9:
        r0.setVisibility(r3);
        View r4 = getItemEBookManager();
        if (r2.I00I01I() == false) goto L12;
        int r5 = 0;
    L13:
        r4.setVisibility(r5);
        View r6 = getItemVoiceAssistant();
        if (r2.IiO0() == false) goto L16;
        VoiceService.I1.iO();
        int r7 = 0;
    L17:
        r6.setVisibility(r7);
        View r8 = getItemTranslationLayout();
        if (r2.Oi1I() == false) goto L20;
    L23:
        VoiceService.I1.iO();
        int r9 = 0;
    L24:
        r8.setVisibility(r9);
        View r10 = getItemDialogueTranslationLayout();
        if (r2.Oi1I() == false) goto L27;
        int r11 = 0;
    L28:
        r10.setVisibility(r11);
        View r12 = getItemSimultaneousTranslationLayout();
        if (r2.IiII0() == true) goto L32;
        r1 = 8;
    L32:
        r12.setVisibility(r1);
        initNoiseSet();
        showNoiseSetTab(this.mEarphoneAncSettings.getMMode());
        showCurDeviceView(this.mCurDeviceType);
        initFindEarphone();
        return;
    L27:
        r11 = 8;
        goto L28
    L20:
        if (r2.IiII0() == true) goto L23;
        r9 = 8;
        goto L24
    L16:
        r7 = 8;
        goto L17
    L12:
        r5 = 8;
        goto L13
    L8:
        r3 = 8;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_charge_main;
    }

    public final void onAbout(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i72.OXO1.O0X(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r12, int r13, @tb1 Intent r14) {
        super.onActivityResult(r12, r13, r14);
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = this.TAG;
        if (r14 == null) goto L5;
        Uri r3 = r14.getData();
    L6:
        r0.OXO1(r1 + " device -> onActivityResult: " + r13 + ", " + r12 + ", " + r3);
        if (r12 != 7) goto L12;
        q62 r15 = q62.OXO1;
        if (q62.OiO0IOX(r15, null, 1, null) == true) goto L14;
        r15.iI1XiXiII(this);
        return;
    L14:
        return;
    L12:
        int r9 = getIvScreensaver().getMeasuredWidth();
        int r10 = getIvScreensaver().getMeasuredHeight();
        LogUtils.d(new Object[]{"onActivityResult outputX:" + r9 + " outputY:" + r10});
        getMCrop().XOO0ii0(r12, r13, r14, 1.0d, ((double) r9) / ((double) r10), r9, r10);
        return;
    L5:
        r3 = null;
        goto L6
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(boolean r3) {
        LogUtils.d(new Object[]{"onBindStateChange " + r3});
        if (BleConnector.INSTANCE.isBound() == true) goto L6;
        startActivity(new Intent(this, MainActivity.class));
        finish();
        return;
    }

    public final void onCustomANC(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        X0IOiX1O.iO(new X10100(this));
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    }

    public final void onDialogueTranslation(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, SparkChainMultiDeviceActivity.class));
    }

    public final void onEBookManager(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new IX00Ii(this), 1, null);
    }

    public final void onEarphoneLeftKey(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new Ii0Oi0OiO(this), 1, null);
    }

    public final void onEarphoneRightKey(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new i1XIXI(this), 1, null);
    }

    @sf5(tag = I01XX0.iOiXi11II)
    public final void onFirmwareRepair(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        LogUtils.d(new Object[]{"onFirmwareRepair"});
        BleCache r5 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r5.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L6;
        SPUtils r0 = a01.OXO1.XO0O10();
        BleDeviceInfo r6 = r5.getMDeviceInfo();
        r0.put(BleDeviceInfo.class.getName(), new Gson().toJson(r6));
        startActivity(new Intent(this, FirmwareRepairSearchActivity.class));
        return;
    }

    public final void onFirmwareUpgrade(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new iiOi10(this), 1, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        ActivityUtils.startHomeActivity();
    }

    public final void onMemoryManager(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, MemoryManagerActivity.class));
    }

    public final void onMusicManager(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new I1I10(this), 1, null);
    }

    public final void onNoiseSetTab(@aa1 final View r2) {
        Intrinsics.X0O(r2, "view");
        X0IOiX1O.iO(new iXX101(r2, this));
    }

    public final void onNotification(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (checkNotificationPermission() == false) goto L6;
        startActivity(new Intent(this, NotificationSettingsActivity.class));
        return;
    }

    public final void onOnlineScreensavers(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new i0100X0(this), 1, null);
    }

    @sf5(tag = I01XX0.X1IX)
    public final void onPairImageAttachmentChange(@aa1 Object r168) {
        Intrinsics.X0O(r168, "data");
        sz0 r0 = sz0.OXO1;
        BleCache r2 = BleCache.INSTANCE;
        File r1 = uz0.IO0II0i(r0, new BleDeviceInfo(0, null, r2.getMBleName(), null, null, null, null, r2.getMFirmwareFlag(), 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133, -1, -1, -1, at.IO, null));
        i1O0OXO1O.OXO1.OXO1("onPairImageAttachmentChange " + FileUtils.isFileExists(r1) + " " + r1);
        if (FileUtils.isFileExists(r1) == false) goto L6;
        ViewGroup r3 = getItemEarphoneBind();
        Bitmap r4 = ImageUtils.getBitmap(r1);
        Intrinsics.O10IXXX0X(r4, "getBitmap(...)");
        Resources r5 = getResources();
        Intrinsics.O10IXXX0X(r5, "getResources(...)");
        r3.setBackgroundDrawable(new BitmapDrawable(r5, r4));
        return;
    L6:
        getItemEarphoneBind().setBackgroundResource(((Number) q62.XOOXII(q62.OXO1, null, 1, null).getSecond()).intValue());
    }

    @sf5(tag = I01XX0.XXX11i)
    public final void onPairImageChange(@aa1 Object r168) {
        Intrinsics.X0O(r168, "data");
        sz0 r0 = sz0.OXO1;
        BleCache r2 = BleCache.INSTANCE;
        File r1 = uz0.X00Xi1X(r0, new BleDeviceInfo(0, null, r2.getMBleName(), null, null, null, null, r2.getMFirmwareFlag(), 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133, -1, -1, -1, at.IO, null));
        i1O0OXO1O.OXO1.OXO1("onPairImageChange " + FileUtils.isFileExists(r1) + " " + r1);
        if (FileUtils.isFileExists(r1) == false) goto L6;
        ViewGroup r3 = getItemChargeBind();
        Bitmap r4 = ImageUtils.getBitmap(r1);
        Intrinsics.O10IXXX0X(r4, "getBitmap(...)");
        Resources r5 = getResources();
        Intrinsics.O10IXXX0X(r5, "getResources(...)");
        r3.setBackgroundDrawable(new BitmapDrawable(r5, r4));
        return;
    L6:
        getItemChargeBind().setBackgroundResource(((Number) q62.XOOXII(q62.OXO1, null, 1, null).getFirst()).intValue());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isShow = false;
        timerCancel();
    }

    public final void onPermission(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, PermissionSettingsActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        onPairImageChange(new Object());
        onPairImageAttachmentChange(new Object());
        this.isShow = true;
        if (getRefreshLayout().isRefreshing() == true) goto L6;
        autoSyncData(1000);
        return;
    }

    public final void onSettings(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public final void onSimultaneousInterpretation(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, SparkChainSimultaneousActivity.class));
    }

    public final void onSoundEffects(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        X0IOiX1O.iO(new X0I1I111(this));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showShutdownPopup();
    }

    public final void onUnbind(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showUnbindPopup();
    }

    public final void onVoiceAssistant(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new I1i101i(this), 1, null);
    }
}
