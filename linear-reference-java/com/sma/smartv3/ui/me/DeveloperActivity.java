package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.mltcode.paycertificationapi.I010iXOXi;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0IXi0iO;
import com.android.mltcode.paycertificationapi.I0XOIXi1;
import com.android.mltcode.paycertificationapi.I1IXiX;
import com.android.mltcode.paycertificationapi.IIIO0IX;
import com.android.mltcode.paycertificationapi.IX0O1;
import com.android.mltcode.paycertificationapi.IX1iI1X;
import com.android.mltcode.paycertificationapi.IXOiI10i0;
import com.android.mltcode.paycertificationapi.IXXO1OiIX;
import com.android.mltcode.paycertificationapi.Ii0X0IXi;
import com.android.mltcode.paycertificationapi.IiOOXi0XO;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0Ii11iII;
import com.android.mltcode.paycertificationapi.O0XXiII01;
import com.android.mltcode.paycertificationapi.O0iI0OI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIX0XX;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OO0O;
import com.android.mltcode.paycertificationapi.OOIOO1XI;
import com.android.mltcode.paycertificationapi.OX0X;
import com.android.mltcode.paycertificationapi.OX0iO1OI;
import com.android.mltcode.paycertificationapi.X01i1;
import com.android.mltcode.paycertificationapi.X0I0OO10;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0IiOI;
import com.android.mltcode.paycertificationapi.X0XI0i1;
import com.android.mltcode.paycertificationapi.X0XOX1O;
import com.android.mltcode.paycertificationapi.X1I01XO1;
import com.android.mltcode.paycertificationapi.XX0IiXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OXOX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIX00I;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.iXI01ii;
import com.android.mltcode.paycertificationapi.iXOiX;
import com.android.mltcode.paycertificationapi.iXiOX1101;
import com.android.mltcode.paycertificationapi.ii0iIOi;
import com.android.mltcode.paycertificationapi.ii1110I;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.io.Location;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.jieli.bluetooth_connect.util.JL_Log;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.FirmwareVersionList;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.model.WatchFaceCategory;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleFirmwareVersionList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.BodyFatScaleActivity;
import com.sma.smartv3.util.UtilsKt;
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
import com.szabh.smable3.entity.BleAddressSettings;
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
import com.szabh.smable3.entity.BleTimeRange;
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
import com.szabh.smable3.entity.FactoryTestType;
import com.szabh.smable3.entity.MusicCommand;
import java.io.File;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.LongRange;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperActivity.kt\ncom/sma/smartv3/ui/me/DeveloperActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 7 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,739:1\n19#2:740\n15#2:741\n90#2:1007\n90#2:1010\n50#2,3:1011\n53#2:1017\n55#2,2:1019\n35#2,2:1025\n257#3,2:742\n69#4,3:744\n72#4,5:748\n69#4,3:753\n72#4,5:757\n69#4,3:762\n72#4,5:766\n69#4,3:771\n72#4,5:775\n69#4,3:780\n72#4,5:784\n69#4,3:789\n72#4,5:793\n69#4,3:798\n72#4,5:802\n69#4,3:807\n72#4,5:811\n69#4,3:816\n72#4,5:820\n69#4,3:825\n72#4,5:829\n69#4,3:834\n72#4,5:838\n69#4,3:843\n72#4,5:847\n69#4,3:852\n72#4,5:856\n69#4,3:861\n72#4,5:865\n69#4,3:870\n72#4,5:874\n69#4,3:879\n72#4,5:883\n69#4,3:888\n72#4,5:892\n69#4,3:897\n72#4,5:901\n69#4,3:906\n72#4,5:910\n69#4,3:915\n72#4,5:919\n69#4,3:924\n72#4,5:928\n69#4,3:933\n72#4,5:937\n69#4,3:942\n72#4,5:946\n69#4,3:951\n72#4,5:955\n69#4,3:960\n72#4,5:964\n69#4,3:969\n72#4,5:973\n69#4,3:978\n72#4,5:982\n69#4,3:1027\n72#4,5:1031\n69#4,3:1036\n72#4,5:1040\n69#4,3:1045\n72#4,5:1049\n1#5:747\n1#5:756\n1#5:765\n1#5:774\n1#5:783\n1#5:792\n1#5:801\n1#5:810\n1#5:819\n1#5:828\n1#5:837\n1#5:846\n1#5:855\n1#5:864\n1#5:873\n1#5:882\n1#5:891\n1#5:900\n1#5:909\n1#5:918\n1#5:927\n1#5:936\n1#5:945\n1#5:954\n1#5:963\n1#5:972\n1#5:981\n1#5:1030\n1#5:1039\n1#5:1048\n176#6,11:987\n196#6:1006\n252#7,7:998\n270#7:1005\n13805#8,2:1008\n13805#8,2:1022\n1563#9:1014\n1634#9,2:1015\n1636#9:1018\n1869#9:1021\n1870#9:1024\n*S KotlinDebug\n*F\n+ 1 DeveloperActivity.kt\ncom/sma/smartv3/ui/me/DeveloperActivity\n*L\n88#1:740\n88#1:741\n634#1:1007\n640#1:1010\n646#1:1011,3\n646#1:1017\n646#1:1019,2\n653#1:1025,2\n174#1:742,2\n385#1:744,3\n385#1:748,5\n389#1:753,3\n389#1:757,5\n393#1:762,3\n393#1:766,5\n430#1:771,3\n430#1:775,5\n444#1:780,3\n444#1:784,5\n448#1:789,3\n448#1:793,5\n452#1:798,3\n452#1:802,5\n456#1:807,3\n456#1:811,5\n460#1:816,3\n460#1:820,5\n464#1:825,3\n464#1:829,5\n468#1:834,3\n468#1:838,5\n497#1:843,3\n497#1:847,5\n516#1:852,3\n516#1:856,5\n520#1:861,3\n520#1:865,5\n524#1:870,3\n524#1:874,5\n528#1:879,3\n528#1:883,5\n534#1:888,3\n534#1:892,5\n538#1:897,3\n538#1:901,5\n598#1:906,3\n598#1:910,5\n604#1:915,3\n604#1:919,5\n659#1:924,3\n659#1:928,5\n663#1:933,3\n663#1:937,5\n694#1:942,3\n694#1:946,5\n419#1:951,3\n419#1:955,5\n438#1:960,3\n438#1:964,5\n489#1:969,3\n489#1:973,5\n590#1:978,3\n590#1:982,5\n654#1:1027,3\n654#1:1031,5\n685#1:1036,3\n685#1:1040,5\n716#1:1045,3\n716#1:1049,5\n385#1:747\n389#1:756\n393#1:765\n430#1:774\n444#1:783\n448#1:792\n452#1:801\n456#1:810\n460#1:819\n464#1:828\n468#1:837\n497#1:846\n516#1:855\n520#1:864\n524#1:873\n528#1:882\n534#1:891\n538#1:900\n598#1:909\n604#1:918\n659#1:927\n663#1:936\n694#1:945\n419#1:954\n438#1:963\n489#1:972\n590#1:981\n654#1:1030\n685#1:1039\n716#1:1048\n614#1:987,11\n614#1:1006\n614#1:998,7\n614#1:1005\n636#1:1008,2\n648#1:1022,2\n646#1:1014\n646#1:1015,2\n646#1:1018\n647#1:1021\n647#1:1024\n*E\n"})
public final class DeveloperActivity extends BaseActivity {
    private final long MAX_TIME;

    @aa1
    private final Lazy btnOta$delegate;

    @aa1
    private final Lazy etAlipayAddress$delegate;

    @aa1
    private final Lazy etDrinkWater$delegate;

    @aa1
    private final Lazy etHrMonitoring$delegate;

    @aa1
    private final Lazy etMtu$delegate;

    @aa1
    private final Lazy etSedentariness$delegate;

    @aa1
    private final Lazy etStepGoal$delegate;

    @aa1
    private final Lazy etTemperatureValue$delegate;

    @aa1
    private final Lazy etWeatherForecast$delegate;

    @aa1
    private final Lazy etWeatherRealtime$delegate;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final OXO1 mBleHandleCallback;

    @aa1
    private final BleDrinkWaterSettings mDrinkWater;

    @aa1
    private final Handler mHandler;
    private boolean mIsOpenRunTimeLog;
    private long mLastReceiveTime;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final XIi00iiXO mLogDetectRunnable;

    @aa1
    private final BleSedentarinessSettings mSedentarinessSettings;

    @tb1
    private dj4 mServerPopup;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvLocationInfo$delegate;

    @aa1
    private final Lazy tvOpenRuntimeLog$delegate;

    public static final class OXO1 implements BleHandleCallback {
        public final /* synthetic */ DeveloperActivity IO;

        public OXO1(DeveloperActivity r1) {
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
        public void onReadDeviceFile(BleDeviceFile r4) {
            Intrinsics.X0O(r4, "deviceFile");
            DeveloperActivity.access$setMLastReceiveTime$p(this.IO, System.currentTimeMillis());
            boolean r0 = ActivityUtils.getTopActivity() instanceof DeveloperActivity;
            LogUtils.d(new Object[]{"onReadDeviceFile -> isTop:" + r0});
            if (r0 == true) goto L5;
            return;
        L5:
            UtilsKt.iiIOiX(r4);
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

    public static final class XIi00iiXO implements Runnable {
        public final /* synthetic */ DeveloperActivity IO;

        public XIi00iiXO(DeveloperActivity r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((System.currentTimeMillis() - DeveloperActivity.access$getMLastReceiveTime$p(this.IO)) <= DeveloperActivity.access$getMAX_TIME$p(this.IO)) goto L6;
            DeveloperActivity.access$zipLog(this.IO);
            return;
        L6:
            DeveloperActivity.access$getMHandler$p(this.IO).postDelayed(this, DeveloperActivity.access$getMAX_TIME$p(this.IO));
        }
    }

    public static final class iO extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ File I1;
        public final /* synthetic */ DeveloperActivity IO;

        public iO(DeveloperActivity r1, File r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            sz0 r0 = sz0.OXO1;     // Catch: Exception -> L4
            ZipUtils.zipFiles(CollectionsKt__CollectionsKt.Ii1iii0(new File[]{sz0.XIi00iiXO(r0, Location.INTERNAL, hn1.XIi00iiXO.XIi00iiXO(), null, 4, null), uz0.X0i1O(r0), uz0.X1IX(r0)}), this.I1);     // Catch: Exception -> L4
            return null;
        L4:
            e = move-exception;
            e.printStackTrace();
            return null;
        }

        public void onSuccess(Void r5) {
            uq r0 = DeveloperActivity.access$getMLoadingPopup$p(this.IO);     // Catch: Exception -> L6
            if (r0 == null) goto L8;
            r0.dismiss();     // Catch: Exception -> L6
        L8:
            Uri r1 = sz0.OXO1.XO0O10(this.I1);     // Catch: Exception -> L6
            i1O0OXO1O.OXO1.OXO1("zipLog -> success, " + r1);     // Catch: Exception -> L6
            Intent r2 = new Intent("android.intent.action.SEND");     // Catch: Exception -> L6
            r2.putExtra("android.intent.extra.TEXT", "Share DB And Log");     // Catch: Exception -> L6
            r2.putExtra("android.intent.extra.STREAM", r1);     // Catch: Exception -> L6
            r2.setType("*/*");     // Catch: Exception -> L6
            r2.addFlags(268435456);     // Catch: Exception -> L6
            this.IO.startActivity(Intent.createChooser(r2, "Share DB And Log"));     // Catch: Exception -> L6
            return;
        L6:
            e = move-exception;
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("shareLog -> error, " + e.getMessage());
        }
    }

    public DeveloperActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new O0iI0OI(this));
        this.tvOpenRuntimeLog$delegate = LazyKt__LazyJVMKt.iO(new X01i1(this));
        this.tvLocationInfo$delegate = LazyKt__LazyJVMKt.iO(new I010iXOXi(this));
        this.etWeatherRealtime$delegate = LazyKt__LazyJVMKt.iO(new OOIOO1XI(this));
        this.etWeatherForecast$delegate = LazyKt__LazyJVMKt.iO(new iXiOX1101(this));
        this.etSedentariness$delegate = LazyKt__LazyJVMKt.iO(new I0IXi0iO(this));
        this.etMtu$delegate = LazyKt__LazyJVMKt.iO(new O0Ii11iII(this));
        this.etDrinkWater$delegate = LazyKt__LazyJVMKt.iO(new iIX00I(this));
        this.etStepGoal$delegate = LazyKt__LazyJVMKt.iO(new O0XXiII01(this));
        this.etTemperatureValue$delegate = LazyKt__LazyJVMKt.iO(new X0XI0i1(this));
        this.etHrMonitoring$delegate = LazyKt__LazyJVMKt.iO(new X1I01XO1(this));
        this.etAlipayAddress$delegate = LazyKt__LazyJVMKt.iO(new X0XOX1O(this));
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        this.mAppUser = (AppUser) r3;
        this.btnOta$delegate = LazyKt__LazyJVMKt.iO(new IX0O1(this));
        this.mIsOpenRunTimeLog = r1.IiI10X().getBoolean(b01.iOO1ii1, false);
        BleCache r5 = BleCache.INSTANCE;
        this.mSedentarinessSettings = (BleSedentarinessSettings) BaseBleCache.getObjectNotNull$default(r5, BleKey.SEDENTARINESS, BleSedentarinessSettings.class, null, null, 12, null);
        this.mDrinkWater = (BleDrinkWaterSettings) BaseBleCache.getObjectNotNull$default(r5, BleKey.DRINK_WATER, BleDrinkWaterSettings.class, null, null, 12, null);
        this.MAX_TIME = 4000;
        this.mHandler = new Handler();
        this.mLogDetectRunnable = new XIi00iiXO(this);
        this.mBleHandleCallback = new OXO1(this);
    }

    public static /* synthetic */ Unit I0iXXO(DeveloperActivity r0, boolean r1) {
        return requestPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I1(DeveloperActivity r0, boolean r1) {
        return requestPermission$lambda$1(r0, r1);
    }

    public static /* synthetic */ boolean I1XOi1(DeveloperActivity r0, int r1) {
        return toGoMoreSet$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit II1Xi0(DeveloperActivity r0, BleConnector r1) {
        return setHrMonitoringInterval$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean IIX1OXO(DeveloperActivity r0, int r1) {
        return toBleAddressSet$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ TextView IXXOO(DeveloperActivity r0) {
        return btnOta_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(DeveloperActivity r0, BleConnector r1) {
        return setDrinkWater$lambda$0(r0, r1);
    }

    public static /* synthetic */ EditText O1O(DeveloperActivity r0) {
        return etStepGoal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(DeveloperActivity r0, BleConnector r1) {
        return toWatchFaceStressTest$lambda$0(r0, r1);
    }

    public static /* synthetic */ EditText OIX0iXi(DeveloperActivity r0) {
        return etWeatherRealtime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText OX(DeveloperActivity r0) {
        return etHrMonitoring_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(DeveloperActivity r0, BleConnector r1) {
        return setTemperatureValue$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(DeveloperActivity r0, PermissionStatus r1) {
        return testBodyFatScale$lambda$0(r0, r1);
    }

    public static /* synthetic */ void X0O(CompoundButton r0, boolean r1) {
        initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0i1O(int r0, DeveloperActivity r1, BleConnector r2) {
        return toOTAStressTest$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ EditText X11iII1O1(DeveloperActivity r0) {
        return etMtu_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1IX(DeveloperActivity r0) {
        return etTemperatureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(DeveloperActivity r0) {
        return etWeatherForecast_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XX0(DeveloperActivity r0, int r1) {
        return testOta$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ EditText XXI(DeveloperActivity r0) {
        return etDrinkWater_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XXIIO1i11(DeveloperActivity r0, int r1) {
        return toBatchIMEI$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XXX11i(DeveloperActivity r0, BleConnector r1) {
        return onAlipayWriteAddress$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIO(DeveloperActivity r0, int r1) {
        return toTuya$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ EditText XiOIii1(DeveloperActivity r0) {
        return etSedentariness_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ long access$getMAX_TIME$p(DeveloperActivity r2) {
        return r2.MAX_TIME;
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(DeveloperActivity r0) {
        return r0.mAppUser;
    }

    public static final /* synthetic */ Handler access$getMHandler$p(DeveloperActivity r0) {
        return r0.mHandler;
    }

    public static final /* synthetic */ long access$getMLastReceiveTime$p(DeveloperActivity r2) {
        return r2.mLastReceiveTime;
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(DeveloperActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ File access$getShareFile(DeveloperActivity r0, String r1) {
        return r0.getShareFile(r1);
    }

    public static final /* synthetic */ void access$setMLastReceiveTime$p(DeveloperActivity r0, long r1) {
        r0.mLastReceiveTime = r1;
    }

    public static final /* synthetic */ void access$zipLog(DeveloperActivity r0) {
        r0.zipLog();
    }

    private static final TextView btnOta_delegate$lambda$0(DeveloperActivity r1) {
        return (TextView) r1.findViewById(R.id.btn_ota);
    }

    private static final EditText etAlipayAddress_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_alipay_address);
    }

    private static final EditText etDrinkWater_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_drinkWater);
    }

    private static final EditText etHrMonitoring_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_hr_monitoring);
    }

    private static final EditText etMtu_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_mtu);
    }

    private static final EditText etSedentariness_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_sedentariness);
    }

    private static final EditText etStepGoal_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_step_goal);
    }

    private static final EditText etTemperatureValue_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_temperature_value);
    }

    private static final EditText etWeatherForecast_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_weather_forecast);
    }

    private static final EditText etWeatherRealtime_delegate$lambda$0(DeveloperActivity r1) {
        return (EditText) r1.findViewById(R.id.et_weather_realtime);
    }

    private final TextView getBtnOta() {
        return (TextView) getValue();
    }

    private final EditText getEtAlipayAddress() {
        return (EditText) getValue();
    }

    private final EditText getEtDrinkWater() {
        return (EditText) getValue();
    }

    private final EditText getEtHrMonitoring() {
        return (EditText) getValue();
    }

    private final EditText getEtMtu() {
        return (EditText) getValue();
    }

    private final EditText getEtSedentariness() {
        return (EditText) getValue();
    }

    private final EditText getEtStepGoal() {
        return (EditText) getValue();
    }

    private final EditText getEtTemperatureValue() {
        return (EditText) getValue();
    }

    private final EditText getEtWeatherForecast() {
        return (EditText) getValue();
    }

    private final EditText getEtWeatherRealtime() {
        return (EditText) getValue();
    }

    private final String getMNow() {
        return new SimpleDateFormat("yyyyMMdd_HHmm", Locale.getDefault()).format(new Date());
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) getValue();
    }

    private final File getShareFile(String r5) {
        return sz0.OXO1.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), r5);
    }

    private final TextView getTvLocationInfo() {
        return (TextView) getValue();
    }

    private final TextView getTvOpenRuntimeLog() {
        return (TextView) getValue();
    }

    public static /* synthetic */ LinearLayout i010I(DeveloperActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iI(DeveloperActivity r0, boolean r1) {
        return testOta$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit iIXi1iiXI(DeveloperActivity r0, BleConnector r1) {
        return setSedentariness$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView iIiiO(DeveloperActivity r0) {
        return tvLocationInfo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOO1ii1(DeveloperActivity r0, BleConnector r1) {
        return setStepGoal$lambda$0(r0, r1);
    }

    public static /* synthetic */ EditText iOOX010X(DeveloperActivity r0) {
        return etAlipayAddress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX(DeveloperActivity r0) {
        return tvOpenRuntimeLog_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iX1O1(BleConnector r0) {
        return toFactoryTestReset$lambda$0(r0);
    }

    private static final void initView$lambda$0$0(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "<unused var>");
        ii0iIOi.IO.O00();
        a01.OXO1.XIi00iiXO().put(b01.i1O11001, r2);
        I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
    }

    private static final Unit onAlipayWriteAddress$lambda$0(DeveloperActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        Editable r0 = r10.getEtAlipayAddress().getText();
        if (r0 == null) goto L6;
        String r1 = r0.toString();
        if (r1 == null) goto L6;
    L8:
        if (TextUtils.isEmpty(r1) == false) goto L10;
    L18:
        ToastUtils.showLong("Please enter address", new Object[0]);
        return Unit.OXO1;
    L10:
        if (r1.length() != 12) goto L18;
        if (q62.OXO1.XIiIOXOOI() == false) goto L15;
        BleKey r2 = BleKey.ALIPAY_SET;
        BleKeyFlag r4 = BleKeyFlag.UPDATE;
        byte[] r3 = ConvertUtils.hexString2Bytes(r1);
        Intrinsics.O10IXXX0X(r3, "hexString2Bytes(...)");
        BaseBleConnector.sendObject$default(r11, r2, r4, new BleAlipaySettings(0, 0, r3), false, false, 24, null);
    L16:
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    L15:
        BleKey r5 = BleKey.BLE_ADDRESS_SET;
        BleKeyFlag r6 = BleKeyFlag.UPDATE;
        byte[] r7 = ConvertUtils.hexString2Bytes(r1);
        Intrinsics.O10IXXX0X(r7, "hexString2Bytes(...)");
        BaseBleConnector.sendObject$default(r11, r5, r6, new BleAddressSettings(r7), false, false, 24, null);
    L6:
        r1 = "";
        goto L8
    }

    private final void requestPermission() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L7;
        hr1.XXIIO1i11(hr1.OXO1, this, false, new I0XOIXi1(this), 2, null);
        return;
    L7:
        if (Build.VERSION.SDK_INT < 31) goto L12;
        hr1 r0 = hr1.OXO1;
        if (r0.i11I(this) == true) goto L13;
        r0.OX(this, new i1OXOX(this));
        return;
    L13:
        return;
    }

    private static final Unit requestPermission$lambda$0(DeveloperActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.requestPermission();
    L5:
        return Unit.OXO1;
    }

    private static final Unit requestPermission$lambda$1(DeveloperActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.requestPermission();
    L5:
        return Unit.OXO1;
    }

    private static final LinearLayout rootView_delegate$lambda$0(DeveloperActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.root_view);
    }

    private static final Unit setDrinkWater$lambda$0(DeveloperActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r10.mDrinkWater.setMInterval(Integer.parseInt(r10.getEtDrinkWater().getText().toString()));
        BaseBleConnector.sendObject$default(r11, BleKey.DRINK_WATER, BleKeyFlag.UPDATE, r10.mDrinkWater, false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private static final Unit setHrMonitoringInterval$lambda$0(DeveloperActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        String r12 = r10.getEtHrMonitoring().getText().toString();
        BaseBleConnector.sendObject$default(r11, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, new BleHrMonitoringSettings(new BleTimeRange(255, 0, 0, 0, 0), Integer.parseInt(r12)), false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private static final Unit setSedentariness$lambda$0(DeveloperActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r10.mSedentarinessSettings.setMInterval(Integer.parseInt(r10.getEtSedentariness().getText().toString()));
        BaseBleConnector.sendObject$default(r11, BleKey.SEDENTARINESS, BleKeyFlag.UPDATE, r10.mSedentarinessSettings, false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private static final Unit setStepGoal$lambda$0(DeveloperActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt32$default(r11, BleKey.STEP_GOAL, BleKeyFlag.UPDATE, Integer.parseInt(r10.getEtStepGoal().getText().toString()), null, false, false, 56, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private static final Unit setTemperatureValue$lambda$0(DeveloperActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BaseBleConnector.sendInt16$default(r10, BleKey.TEMPERATURE_VALUE, BleKeyFlag.UPDATE, (int) (Float.parseFloat(r9.getEtTemperatureValue().getText().toString()) * 10), null, false, false, 56, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private static final Unit testBodyFatScale$lambda$0(DeveloperActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.startActivity(new Intent(r1, BodyFatScaleActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final boolean testOta$lambda$0$0(final DeveloperActivity r5, int r6) {
        if (r6 != 1) goto L5;
        a01 r7 = a01.OXO1;
        r7.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
        r7.IiI10X().put(b01.II1Xi0, "Dev Server");
    L6:
        DeviceInfoChecker.OXO1.I1XOi1(new iXI01ii(r5));
        return true;
    L5:
        a01 r8 = a01.OXO1;
        r8.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r8.IiI10X().put(b01.II1Xi0, "Test Server");
        goto L6
    }

    private static final Unit testOta$lambda$0$0$0(DeveloperActivity r1, boolean r2) {
        if (r2 == true) goto L4;
        ToastUtils.showLong("Network error!!", new Object[0]);
    L4:
        r1.startActivity(new Intent(r1, DeveloperOtaSelectPlatformActivity.class));
        return Unit.OXO1;
    }

    private static final boolean toBatchIMEI$lambda$0$0(DeveloperActivity r5, int r6) {
        if (r6 != 1) goto L5;
        a01 r7 = a01.OXO1;
        r7.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r7.IiI10X().put(b01.II1Xi0, "Test Server");
    L6:
        r5.startActivity(new Intent(r5, DeveloperIMEISetStartActivity.class));
        return true;
    L5:
        a01 r8 = a01.OXO1;
        r8.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r8.IiI10X().put(b01.II1Xi0, "ASIA PACIFIC");
        goto L6
    }

    private static final boolean toBleAddressSet$lambda$0$0(DeveloperActivity r5, int r6) {
        if (r6 != 1) goto L5;
        a01 r7 = a01.OXO1;
        r7.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
        r7.IiI10X().put(b01.II1Xi0, "Dev Server");
    L6:
        r5.startActivity(new Intent(r5, DeveloperBleAddressSetStartActivity.class));
        return true;
    L5:
        a01 r8 = a01.OXO1;
        r8.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r8.IiI10X().put(b01.II1Xi0, "Test Server");
        goto L6
    }

    private static final Unit toFactoryTestReset$lambda$0(BleConnector r9) {
        Intrinsics.X0O(r9, "it");
        BaseBleConnector.sendInt8$default(r9, BleKey.FACTORY_TEST, BleKeyFlag.UPDATE, FactoryTestType.TEST_RESET.getType(), false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private static final boolean toGoMoreSet$lambda$0$0(DeveloperActivity r5, int r6) {
        if (r6 != 1) goto L5;
        a01 r7 = a01.OXO1;
        r7.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r7.IiI10X().put(b01.II1Xi0, "Test Server");
    L6:
        r5.startActivity(new Intent(r5, DeveloperGoMoreSetStartActivity.class));
        return true;
    L5:
        a01 r8 = a01.OXO1;
        r8.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r8.IiI10X().put(b01.II1Xi0, "ASIA PACIFIC");
        goto L6
    }

    private static final Unit toOTAStressTest$lambda$0(int r5, final DeveloperActivity r6, BleConnector r7) {
        Intrinsics.X0O(r7, "it");
        NetWorkUtils r8 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getBleFirmwareVersionListBody(String.valueOf(r5));
        final O1XIiIO<FirmwareVersionList> r0 = new DeveloperActivity$toOTAStressTest$1$1(r6);
        final Activity r10 = null;
        final uq r1 = r8.loadPopup(null, null);
        String r2 = r8.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareVersionList.URL);
        r8.printParam(r2 + BleFirmwareVersionList.URL, r9);
        NetWork r11 = NetWork.OXO1;
        String r12 = r2 + BleFirmwareVersionList.URL;
        final O1XIiIO<Response<FirmwareVersionList>> r3 = new DeveloperActivity$toOTAStressTest$lambda$0$$inlined$post$default$1(r10, r0, r1);
        AndroidNetworking.post(r12).addBodyParameter(r9).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{FirmwareVersionList.class}), new DeveloperActivity$toOTAStressTest$lambda$0$$inlined$post$default$2(r3));
        return Unit.OXO1;
    }

    private static final boolean toTuya$lambda$0$0(DeveloperActivity r5, int r6) {
        if (r6 != 1) goto L5;
        a01 r7 = a01.OXO1;
        r7.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
        r7.IiI10X().put(b01.II1Xi0, "Dev Server");
    L6:
        r5.startActivity(new Intent(r5, DeveloperTuyaStartActivity.class));
        return true;
    L5:
        a01 r8 = a01.OXO1;
        r8.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r8.IiI10X().put(b01.II1Xi0, "Test Server");
        goto L6
    }

    private static final Unit toWatchFaceStressTest$lambda$0(DeveloperActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        ArrayList r12 = new ArrayList();
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.iO();
        WatchFaceCategory[] r2 = (WatchFaceCategory[]) new Gson().fromJson(r1.getString(b01.iOiXi11II + '_' + WatchFaceCategory[].class.getName()), WatchFaceCategory[].class);
        if (r2 == null) goto L7;
        int r3 = r2.length;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L11;
        OIXO1IIOO.Oi(r12, r2[r4].getList());
        r4 = r4 + 1;
    L11:
        if (r12.isEmpty() == true) goto L29;
    L27:
        a01.OXO1.XO0O10().put(b01.X00XIX1, new Gson().toJson(r12));
        r10.startActivity(new Intent(r10, DeveloperWatchFaceStressTestActivity.class));
        return Unit.OXO1;
    L29:
        JsonArray r5 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.Xii11I)).getAsJsonArray();     // Catch: Exception -> L18
        Intrinsics.XXI(r5);     // Catch: Exception -> L18
        Collection r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));     // Catch: Exception -> L18
        Iterator<JsonElement> r7 = r5.iterator();     // Catch: Exception -> L18
    L15:
        if (r7.hasNext() == false) goto L19;
        r6.add(new Gson().fromJson(r7.next(), OnlineWatchFaceV2.class));     // Catch: Exception -> L18
    L19:
        Iterator r8 = CollectionsKt___CollectionsKt.OO0Oi10(r6).iterator();
    L21:
        if (r8.hasNext() == false) goto L27;
        WatchFaceCategoryV2[] r9 = ((OnlineWatchFaceV2) r8.next()).getWatchFaceList();
        if (r9 == null) goto L21;
        int r13 = r9.length;
        int r14 = 0;
    L25:
        if (r14 >= r13) goto L21;
        WatchFaceCategoryV2 r15 = r9[r14];
        r12.add(new WatchFaceInfo(r15.getId(), r15.getPreviewUrl(), r15.getBinUrl()));
        r14 = r14 + 1;
    L18:
        r6 = CollectionsKt__CollectionsKt.iI();
        goto L19
    L7:
        SPUtils r16 = r0.iO();
        WatchFaceInfo[] r17 = (WatchFaceInfo[]) new Gson().fromJson(r16.getString(b01.X00XIX1 + '_' + WatchFaceInfo[].class.getName()), WatchFaceInfo[].class);
        if (r17 == null) goto L11;
        r12.addAll(ArraysKt___ArraysKt.iO0XiOIi(r17));
        goto L11
    }

    private static final TextView tvLocationInfo_delegate$lambda$0(DeveloperActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_location_info);
    }

    private static final TextView tvOpenRuntimeLog_delegate$lambda$0(DeveloperActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_open_runtime_log);
    }

    private final void zipLog() {
        i1O0OXO1O.OXO1.OXO1("zipLog -> start");
        File r0 = getShareFile(this.mAppUser.getNickname() + "-db&log-" + getMNow() + OTAManager.OTA_ZIP_SUFFIX);
        FileUtils.createOrExistsFile(r0);
        ThreadUtils.executeByIo(new iO(this, r0));
    }

    public final void checkUpdateForApp(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        I01XX0.OXO1(I01XX0.XOXiX0, Boolean.TRUE);
    }

    public final void clearLogs(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        sz0 r3 = sz0.OXO1;
        FileUtils.delete(uz0.X0i1O(r3));
        FileUtils.delete(uz0.I0iXXO(r3));
        FileUtils.delete(getMContext().getCacheDir());
        FileUtils.delete(JL_Log.getSaveLogPath(getMContext()));
        FileUtils.delete(uz0.X1IX(r3));
        ToastUtils.showLong("The log has been emptied", new Object[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        a01 r4 = a01.OXO1;
        r4.XIi00iiXO().remove(b01.Ii0X0X);
        r4.XIi00iiXO().remove(b01.XXiIiX10);
        r4.XIi00iiXO().remove(b01.X00Xi1X);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.tvVersion)).setText("v" + AppUtils.getAppVersionName() + IiXI1X1OO.O00 + AppUtils.getAppVersionCode() + "_release_false");
        getTvOpenRuntimeLog().setText(String.valueOf(this.mIsOpenRunTimeLog));
        EditText r0 = getEtWeatherRealtime();
        a01 r1 = a01.OXO1;
        r0.setText(String.valueOf(r1.IiI10X().getInt(b01.O1O, 1)));
        getEtWeatherForecast().setText(String.valueOf(r1.IiI10X().getInt(b01.XXIIO1i11, 12)));
        getEtSedentariness().setText(String.valueOf(this.mSedentarinessSettings.getMInterval()));
        EditText r2 = getEtMtu();
        BleConnector r3 = BleConnector.INSTANCE;
        r2.setText(String.valueOf(r3.getMMtu()));
        getEtDrinkWater().setText(String.valueOf(this.mDrinkWater.getMInterval()));
        getEtStepGoal().setText(String.valueOf(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, 6000, null, 4, null)));
        onLocationChange(new Object());
        r3.addHandleCallback(this.mBleHandleCallback);
        requestPermission();
        AppCompatCheckBox r4 = (AppCompatCheckBox) findViewById(R.id.check_show_ad);
        if (r4 == null) goto L5;
        i72.OXO1.XIO11I();
        r4.setVisibility(8);
        r4.setChecked(q62.OXO1.Ii());
        r4.setOnCheckedChangeListener(new Ii0X0IXi());
    L5:
        TextView r5 = getBtnOta();
        Intrinsics.O10IXXX0X(r5, "<get-btnOta>(...)");
        r5.setVisibility(8);
    }

    public final void lastOta(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperOtaStartActivity.class));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer;
    }

    public final void onAlipayRandomAddress(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        StringCompanionObject r6 = StringCompanionObject.OXO1;
        String r7 = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(kotlin.ranges.iO.XOIO11O(new LongRange(0, Long.parseLong("FFFFFFFFFFFF", kotlin.text.OXO1.OXO1(16))), Random.Default))}, 1));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        getEtAlipayAddress().setText(r7);
    }

    public final void onAlipayWriteAddress(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new OX0iO1OI(this), 1, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    }

    @sf5(tag = b01.XX1Oi)
    public final void onLocationChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        LogUtils.d(new Object[]{"onLocationChange"});
        getTvLocationInfo().setText(a01.OXO1.IiI10X().getString(b01.XX1Oi, ""));
    }

    public final void onRefreshLocation(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        BleInitializer.IO.onRequestAgpsPrerequisite();
    }

    public final void onSetMtu(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        Editable r4 = getEtMtu().getText();
        if (r4 == null) goto L5;
        String r5 = r4.toString();
    L7:
        if (r5 == null) goto L9;
        int r6 = Integer.parseInt(r5);
    L10:
        BleConnector r1 = BleConnector.INSTANCE;
        r1.setMMtu(r6);
        r1.launch();
        ToastUtils.showLong("done", new Object[0]);
        return;
    L9:
        r6 = 0;
        goto L10
    L5:
        r5 = null;
        goto L7
    }

    public final void openRunTimeOpen(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        this.mIsOpenRunTimeLog = !this.mIsOpenRunTimeLog;
        a01.OXO1.IiI10X().put(b01.iOO1ii1, this.mIsOpenRunTimeLog);
        LogUtils.getConfig().setLogSwitch(this.mIsOpenRunTimeLog);
        getTvOpenRuntimeLog().setText(String.valueOf(this.mIsOpenRunTimeLog));
    }

    public final void otaFromConfig(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperOtaFromConfigActivity.class));
    }

    public final void setDrinkWater(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new iXOiX(this), 1, null);
    }

    public final void setForecastInterval(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        a01.OXO1.IiI10X().put(b01.XXIIO1i11, Integer.parseInt(getEtWeatherForecast().getText().toString()));
        ToastUtils.showLong("done", new Object[0]);
    }

    public final void setHrMonitoringInterval(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new OO0O(this), 1, null);
    }

    public final void setRealtimeInterval(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        a01.OXO1.IiI10X().put(b01.O1O, Integer.parseInt(getEtWeatherRealtime().getText().toString()));
        ToastUtils.showLong("done", new Object[0]);
    }

    public final void setSedentariness(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new IiOOXi0XO(this), 1, null);
    }

    public final void setStepGoal(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new ii1110I(this), 1, null);
    }

    public final void setTemperatureValue(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new XX0IiXiO(this), 1, null);
    }

    public final void shareDatabaseAndLog(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        if (this.mLoadingPopup != null) goto L5;
        uq r10 = new uq(getMContext());
        r10.I0iXXO(false);
        this.mLoadingPopup = r10;
    L5:
        uq r11 = this.mLoadingPopup;
        if (r11 == null) goto L8;
        r11.IIX1OXO();
    L8:
        BleConnector r0 = BleConnector.INSTANCE;
        if (r0.isAvailable() == false) goto L21;
        BleKey r1 = BleKey.RAW_SLEEP;
        BleKeyFlag r2 = BleKeyFlag.READ;
        BaseBleConnector.sendObject$default(r0, r1, r2, null, false, false, 24, null);
        BleCache r12 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L13;
    L18:
        UtilsKt.iOI(1);
        BaseBleConnector.sendInt8$default(r0, BleKey.DEVICE_FILE, r2, UtilsKt.iI(), false, false, 24, null);
    L19:
        this.mHandler.postDelayed(this.mLogDetectRunnable, this.MAX_TIME);
        return;
    L13:
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L18;
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L18;
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == false) goto L19;
    L21:
        zipLog();
    }

    public final void showGsensor(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperGsensorActivity.class));
    }

    public final void showGsensor2(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperGsensor2Activity.class));
    }

    public final void showRealtimeLog(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperShowRealtimeLogActivity.class));
    }

    public final void showRealtimeMapAndLocation(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperShowRealtimeMapAndLocationActivity.class));
    }

    public final void testBodyFatScale(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        ds1.iO(r0, null, null, new OX0X(this), 3, null);
    }

    public final void testHR(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperTestHRActivity.class));
    }

    public final void testOta(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r4 = 0;
        dj4 r1 = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"Test Server", "Dev Server"}), r4, 4, null);
        r1.iX(R.string.force_switch_test_server);
        r1.i010I(new IX1iI1X(this));
        this.mServerPopup = r1;
        r1.II1Xi0(0);
        dj4 r9 = this.mServerPopup;
        if (r9 == null) goto L6;
        LinearLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r9.I1XOi1(r0);
        return;
    }

    public final void toAirPressureValue(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r5.IiI10X().put(b01.II1Xi0, "ASIA PACIFIC");
        startActivity(new Intent(this, DeveloperAirPressureValueStartActivity.class));
    }

    public final void toBacCalibration(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperBacCalibrationSearchActivity.class));
    }

    public final void toBatchIMEI(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r4 = 0;
        dj4 r1 = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"Asia Server", "Test Server"}), r4, 4, null);
        r1.i010I(new OIX0XX(this));
        this.mServerPopup = r1;
        r1.II1Xi0(0);
        dj4 r9 = this.mServerPopup;
        if (r9 == null) goto L6;
        r9.IIX1OXO();
        return;
    }

    public final void toBatchTuyaKey(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        a01 r5 = a01.OXO1;
        r5.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        r5.IiI10X().put(b01.II1Xi0, "Test Server");
        startActivity(new Intent(this, DeveloperTuyaKeySetStartActivity.class));
    }

    public final void toBleAddressSet(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r4 = 0;
        dj4 r1 = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"Test Server", "Dev Server"}), r4, 4, null);
        r1.iX(R.string.force_switch_test_server);
        r1.i010I(new IXOiI10i0(this));
        this.mServerPopup = r1;
        LinearLayout r9 = getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r1.I1XOi1(r9);
    }

    public final void toBtName(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperBtNameStartActivity.class));
    }

    public final void toBtNameSearch(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperBtNameSearchActivity.class));
    }

    public final void toFactoryTest(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperFactoryTestActivity.class));
    }

    public final void toFactoryTestReset(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new IIIO0IX(), 1, null);
    }

    public final void toFileSystem(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperFileSystemTestActivity.class));
    }

    public final void toFontRepair(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperFontRepairStartActivity.class));
    }

    public final void toGoMoreSet(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r4 = 0;
        dj4 r1 = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"Asia Server", "Test Server"}), r4, 4, null);
        r1.i010I(new X0I0OO10(this));
        this.mServerPopup = r1;
        r1.II1Xi0(0);
        dj4 r9 = this.mServerPopup;
        if (r9 == null) goto L6;
        r9.IIX1OXO();
        return;
    }

    public final void toOTAStressTest(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        DeviceConfigInfo r5 = q62.OXO1.O1i0();
        if (r5 == null) goto L5;
        final int r6 = r5.getFirmwareId();
    L6:
        if (r6 != 0) goto L9;
        ToastUtils.showLong("配置出错", new Object[0]);
        return;
    L9:
        X0IOiX1O.XIi00iiXO(false, new IXXO1OiIX(r6, this), 1, null);
        return;
    L5:
        r6 = 0;
        goto L6
    }

    public final void toReadLog(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperReadLogActivity.class));
    }

    public final void toShowInfo(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperInfoActivity.class));
    }

    public final void toShutdown(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperShutdownStartActivity.class));
    }

    public final void toSmsTest(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperSmsTestActivity.class));
    }

    public final void toTemperatureValue(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperTemperatureValueStartActivity.class));
    }

    public final void toTestBox(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperTestBoxActivity.class));
    }

    public final void toTuya(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r4 = 0;
        dj4 r1 = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"Test Server", "Dev Server"}), r4, 4, null);
        r1.iX(R.string.force_switch_test_server);
        r1.i010I(new X0IiOI(this));
        this.mServerPopup = r1;
        LinearLayout r9 = getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r1.I1XOi1(r9);
    }

    public final void toTuyaKey(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperTuyaKeyTestActivity.class));
    }

    public final void toWatchFaceStressTest(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new I1IXiX(this), 1, null);
    }

    public final void toWeaterTest(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, DeveloperWeatherTestActivity.class));
    }
}
