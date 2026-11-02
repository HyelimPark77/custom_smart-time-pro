package com.sma.smartv3.p610ui.p612me;

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
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.ii0iIOi;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.p057io.Location;
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
import com.sma.smartv3.p610ui.p612me.DeveloperActivity;
import com.sma.smartv3.p610ui.status.BodyFatScaleActivity;
import com.sma.smartv3.pro.R;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.C20141iO;
import kotlin.ranges.LongRange;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperActivity.kt\ncom/sma/smartv3/ui/me/DeveloperActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 7 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,739:1\n19#2:740\n15#2:741\n90#2:1007\n90#2:1010\n50#2,3:1011\n53#2:1017\n55#2,2:1019\n35#2,2:1025\n257#3,2:742\n69#4,3:744\n72#4,5:748\n69#4,3:753\n72#4,5:757\n69#4,3:762\n72#4,5:766\n69#4,3:771\n72#4,5:775\n69#4,3:780\n72#4,5:784\n69#4,3:789\n72#4,5:793\n69#4,3:798\n72#4,5:802\n69#4,3:807\n72#4,5:811\n69#4,3:816\n72#4,5:820\n69#4,3:825\n72#4,5:829\n69#4,3:834\n72#4,5:838\n69#4,3:843\n72#4,5:847\n69#4,3:852\n72#4,5:856\n69#4,3:861\n72#4,5:865\n69#4,3:870\n72#4,5:874\n69#4,3:879\n72#4,5:883\n69#4,3:888\n72#4,5:892\n69#4,3:897\n72#4,5:901\n69#4,3:906\n72#4,5:910\n69#4,3:915\n72#4,5:919\n69#4,3:924\n72#4,5:928\n69#4,3:933\n72#4,5:937\n69#4,3:942\n72#4,5:946\n69#4,3:951\n72#4,5:955\n69#4,3:960\n72#4,5:964\n69#4,3:969\n72#4,5:973\n69#4,3:978\n72#4,5:982\n69#4,3:1027\n72#4,5:1031\n69#4,3:1036\n72#4,5:1040\n69#4,3:1045\n72#4,5:1049\n1#5:747\n1#5:756\n1#5:765\n1#5:774\n1#5:783\n1#5:792\n1#5:801\n1#5:810\n1#5:819\n1#5:828\n1#5:837\n1#5:846\n1#5:855\n1#5:864\n1#5:873\n1#5:882\n1#5:891\n1#5:900\n1#5:909\n1#5:918\n1#5:927\n1#5:936\n1#5:945\n1#5:954\n1#5:963\n1#5:972\n1#5:981\n1#5:1030\n1#5:1039\n1#5:1048\n176#6,11:987\n196#6:1006\n252#7,7:998\n270#7:1005\n13805#8,2:1008\n13805#8,2:1022\n1563#9:1014\n1634#9,2:1015\n1636#9:1018\n1869#9:1021\n1870#9:1024\n*S KotlinDebug\n*F\n+ 1 DeveloperActivity.kt\ncom/sma/smartv3/ui/me/DeveloperActivity\n*L\n88#1:740\n88#1:741\n634#1:1007\n640#1:1010\n646#1:1011,3\n646#1:1017\n646#1:1019,2\n653#1:1025,2\n174#1:742,2\n385#1:744,3\n385#1:748,5\n389#1:753,3\n389#1:757,5\n393#1:762,3\n393#1:766,5\n430#1:771,3\n430#1:775,5\n444#1:780,3\n444#1:784,5\n448#1:789,3\n448#1:793,5\n452#1:798,3\n452#1:802,5\n456#1:807,3\n456#1:811,5\n460#1:816,3\n460#1:820,5\n464#1:825,3\n464#1:829,5\n468#1:834,3\n468#1:838,5\n497#1:843,3\n497#1:847,5\n516#1:852,3\n516#1:856,5\n520#1:861,3\n520#1:865,5\n524#1:870,3\n524#1:874,5\n528#1:879,3\n528#1:883,5\n534#1:888,3\n534#1:892,5\n538#1:897,3\n538#1:901,5\n598#1:906,3\n598#1:910,5\n604#1:915,3\n604#1:919,5\n659#1:924,3\n659#1:928,5\n663#1:933,3\n663#1:937,5\n694#1:942,3\n694#1:946,5\n419#1:951,3\n419#1:955,5\n438#1:960,3\n438#1:964,5\n489#1:969,3\n489#1:973,5\n590#1:978,3\n590#1:982,5\n654#1:1027,3\n654#1:1031,5\n685#1:1036,3\n685#1:1040,5\n716#1:1045,3\n716#1:1049,5\n385#1:747\n389#1:756\n393#1:765\n430#1:774\n444#1:783\n448#1:792\n452#1:801\n456#1:810\n460#1:819\n464#1:828\n468#1:837\n497#1:846\n516#1:855\n520#1:864\n524#1:873\n528#1:882\n534#1:891\n538#1:900\n598#1:909\n604#1:918\n659#1:927\n663#1:936\n694#1:945\n419#1:954\n438#1:963\n489#1:972\n590#1:981\n654#1:1030\n685#1:1039\n716#1:1048\n614#1:987,11\n614#1:1006\n614#1:998,7\n614#1:1005\n636#1:1008,2\n648#1:1022,2\n646#1:1014\n646#1:1015,2\n646#1:1018\n647#1:1021\n647#1:1024\n*E\n"})
public final class DeveloperActivity extends BaseActivity {
    private final long MAX_TIME;

    @aa1
    private final Lazy btnOta$delegate;

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
    private C3006uq mLoadingPopup;

    @aa1
    private final XIi00iiXO mLogDetectRunnable;

    @aa1
    private final BleSedentarinessSettings mSedentarinessSettings;

    @tb1
    private dj4 mServerPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iI0OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.rootView_delegate$lambda$0(this.f2586IO);
        }
    });

    @aa1
    private final Lazy tvOpenRuntimeLog$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X01i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.tvOpenRuntimeLog_delegate$lambda$0(this.f3936IO);
        }
    });

    @aa1
    private final Lazy tvLocationInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I010iXOXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.tvLocationInfo_delegate$lambda$0(this.f1040IO);
        }
    });

    @aa1
    private final Lazy etWeatherRealtime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIOO1XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etWeatherRealtime_delegate$lambda$0(this.f3228IO);
        }
    });

    @aa1
    private final Lazy etWeatherForecast$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXiOX1101
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etWeatherForecast_delegate$lambda$0(this.f8446IO);
        }
    });

    @aa1
    private final Lazy etSedentariness$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0IXi0iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etSedentariness_delegate$lambda$0(this.f1131IO);
        }
    });

    @aa1
    private final Lazy etMtu$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0Ii11iII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etMtu_delegate$lambda$0(this.f2470IO);
        }
    });

    @aa1
    private final Lazy etDrinkWater$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIX00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etDrinkWater_delegate$lambda$0(this.f7892IO);
        }
    });

    @aa1
    private final Lazy etStepGoal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XXiII01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etStepGoal_delegate$lambda$0(this.f2567IO);
        }
    });

    @aa1
    private final Lazy etTemperatureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0XI0i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etTemperatureValue_delegate$lambda$0(this.f4032IO);
        }
    });

    @aa1
    private final Lazy etHrMonitoring$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1I01XO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etHrMonitoring_delegate$lambda$0(this.f4247IO);
        }
    });

    @aa1
    private final Lazy etAlipayAddress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0XOX1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperActivity.etAlipayAddress_delegate$lambda$0(this.f4044IO);
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
        public void onReadDeviceFile(BleDeviceFile deviceFile) {
            Intrinsics.X0O(deviceFile, "deviceFile");
            DeveloperActivity.this.mLastReceiveTime = System.currentTimeMillis();
            boolean z = ActivityUtils.getTopActivity() instanceof DeveloperActivity;
            LogUtils.m11128d("onReadDeviceFile -> isTop:" + z);
            if (z) {
                UtilsKt.iiIOiX(deviceFile);
            }
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

    public static final class XIi00iiXO implements Runnable {
        public XIi00iiXO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (System.currentTimeMillis() - DeveloperActivity.this.mLastReceiveTime > DeveloperActivity.this.MAX_TIME) {
                DeveloperActivity.this.zipLog();
            } else {
                DeveloperActivity.this.mHandler.postDelayed(this, DeveloperActivity.this.MAX_TIME);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperActivity$iO */
    public static final class C18864iO extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ File f54661I1;

        public C18864iO(File file) {
            this.f54661I1 = file;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            try {
                sz0 sz0Var = sz0.OXO1;
                ZipUtils.zipFiles(CollectionsKt__CollectionsKt.Ii1iii0(sz0.XIi00iiXO(sz0Var, Location.INTERNAL, hn1.XIi00iiXO.XIi00iiXO(), null, 4, null), uz0.X0i1O(sz0Var), uz0.X1IX(sz0Var)), this.f54661I1);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r5) {
            try {
                C3006uq c3006uq = DeveloperActivity.this.mLoadingPopup;
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
                Uri uriXO0O10 = sz0.OXO1.XO0O10(this.f54661I1);
                i1O0OXO1O.OXO1.OXO1("zipLog -> success, " + uriXO0O10);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", "Share DB And Log");
                intent.putExtra("android.intent.extra.STREAM", uriXO0O10);
                intent.setType("*/*");
                intent.addFlags(268435456);
                DeveloperActivity.this.startActivity(Intent.createChooser(intent, "Share DB And Log"));
            } catch (Exception e) {
                e.printStackTrace();
                i1O0OXO1O.OXO1.OXO1("shareLog -> error, " + e.getMessage());
            }
        }
    }

    public DeveloperActivity() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.btnOta$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX0O1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeveloperActivity.btnOta_delegate$lambda$0(this.f1943IO);
            }
        });
        this.mIsOpenRunTimeLog = a01Var.IiI10X().getBoolean(b01.iOO1ii1, false);
        BleCache bleCache = BleCache.INSTANCE;
        this.mSedentarinessSettings = (BleSedentarinessSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.SEDENTARINESS, BleSedentarinessSettings.class, null, null, 12, null);
        this.mDrinkWater = (BleDrinkWaterSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.DRINK_WATER, BleDrinkWaterSettings.class, null, null, 12, null);
        this.MAX_TIME = 4000L;
        this.mHandler = new Handler();
        this.mLogDetectRunnable = new XIi00iiXO();
        this.mBleHandleCallback = new OXO1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView btnOta_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (TextView) developerActivity.findViewById(R.id.btn_ota);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etAlipayAddress_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_alipay_address);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etDrinkWater_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_drinkWater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etHrMonitoring_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_hr_monitoring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etMtu_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_mtu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etSedentariness_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_sedentariness);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etStepGoal_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_step_goal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etTemperatureValue_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_temperature_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etWeatherForecast_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_weather_forecast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etWeatherRealtime_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (EditText) developerActivity.findViewById(R.id.et_weather_realtime);
    }

    private final TextView getBtnOta() {
        return (TextView) this.btnOta$delegate.getValue();
    }

    private final EditText getEtAlipayAddress() {
        return (EditText) this.etAlipayAddress$delegate.getValue();
    }

    private final EditText getEtDrinkWater() {
        return (EditText) this.etDrinkWater$delegate.getValue();
    }

    private final EditText getEtHrMonitoring() {
        return (EditText) this.etHrMonitoring$delegate.getValue();
    }

    private final EditText getEtMtu() {
        return (EditText) this.etMtu$delegate.getValue();
    }

    private final EditText getEtSedentariness() {
        return (EditText) this.etSedentariness$delegate.getValue();
    }

    private final EditText getEtStepGoal() {
        return (EditText) this.etStepGoal$delegate.getValue();
    }

    private final EditText getEtTemperatureValue() {
        return (EditText) this.etTemperatureValue$delegate.getValue();
    }

    private final EditText getEtWeatherForecast() {
        return (EditText) this.etWeatherForecast$delegate.getValue();
    }

    private final EditText getEtWeatherRealtime() {
        return (EditText) this.etWeatherRealtime$delegate.getValue();
    }

    private final String getMNow() {
        return new SimpleDateFormat("yyyyMMdd_HHmm", Locale.getDefault()).format(new Date());
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getShareFile(String str) {
        return sz0.OXO1.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), str);
    }

    private final TextView getTvLocationInfo() {
        return (TextView) this.tvLocationInfo$delegate.getValue();
    }

    private final TextView getTvOpenRuntimeLog() {
        return (TextView) this.tvOpenRuntimeLog$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        ii0iIOi.f8533IO.O00();
        a01.OXO1.XIi00iiXO().put(b01.i1O11001, z);
        I01XX0.XIi00iiXO(I01XX0.I0XXi0X, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAlipayWriteAddress$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        String string;
        Intrinsics.X0O(it, "it");
        Editable text = developerActivity.getEtAlipayAddress().getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (TextUtils.isEmpty(string) || string.length() != 12) {
            ToastUtils.showLong("Please enter address", new Object[0]);
            return Unit.OXO1;
        }
        if (q62.OXO1.XIiIOXOOI()) {
            BleKey bleKey = BleKey.ALIPAY_SET;
            BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
            byte[] bArrHexString2Bytes = ConvertUtils.hexString2Bytes(string);
            Intrinsics.O10IXXX0X(bArrHexString2Bytes, "hexString2Bytes(...)");
            BaseBleConnector.sendObject$default(it, bleKey, bleKeyFlag, new BleAlipaySettings(0, 0, bArrHexString2Bytes), false, false, 24, null);
        } else {
            BleKey bleKey2 = BleKey.BLE_ADDRESS_SET;
            BleKeyFlag bleKeyFlag2 = BleKeyFlag.UPDATE;
            byte[] bArrHexString2Bytes2 = ConvertUtils.hexString2Bytes(string);
            Intrinsics.O10IXXX0X(bArrHexString2Bytes2, "hexString2Bytes(...)");
            BaseBleConnector.sendObject$default(it, bleKey2, bleKeyFlag2, new BleAddressSettings(bArrHexString2Bytes2), false, false, 24, null);
        }
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    private final void requestPermission() {
        if (!PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
            hr1.XXIIO1i11(hr1.OXO1, this, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0XOIXi1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeveloperActivity.requestPermission$lambda$0(this.f1221IO, ((Boolean) obj).booleanValue());
                }
            }, 2, null);
        } else if (Build.VERSION.SDK_INT >= 31) {
            hr1 hr1Var = hr1.OXO1;
            if (hr1Var.i11I(this)) {
                return;
            }
            hr1Var.m1930OX(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1OXOX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeveloperActivity.requestPermission$lambda$1(this.f7642IO, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$0(DeveloperActivity developerActivity, boolean z) {
        if (z) {
            developerActivity.requestPermission();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$1(DeveloperActivity developerActivity, boolean z) {
        if (z) {
            developerActivity.requestPermission();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootView_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (LinearLayout) developerActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrinkWater$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        developerActivity.mDrinkWater.setMInterval(Integer.parseInt(developerActivity.getEtDrinkWater().getText().toString()));
        BaseBleConnector.sendObject$default(it, BleKey.DRINK_WATER, BleKeyFlag.UPDATE, developerActivity.mDrinkWater, false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHrMonitoringInterval$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendObject$default(it, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, new BleHrMonitoringSettings(new BleTimeRange(255, 0, 0, 0, 0), Integer.parseInt(developerActivity.getEtHrMonitoring().getText().toString())), false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSedentariness$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        developerActivity.mSedentarinessSettings.setMInterval(Integer.parseInt(developerActivity.getEtSedentariness().getText().toString()));
        BaseBleConnector.sendObject$default(it, BleKey.SEDENTARINESS, BleKeyFlag.UPDATE, developerActivity.mSedentarinessSettings, false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setStepGoal$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt32$default(it, BleKey.STEP_GOAL, BleKeyFlag.UPDATE, Integer.parseInt(developerActivity.getEtStepGoal().getText().toString()), null, false, false, 56, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTemperatureValue$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt16$default(it, BleKey.TEMPERATURE_VALUE, BleKeyFlag.UPDATE, (int) (Float.parseFloat(developerActivity.getEtTemperatureValue().getText().toString()) * 10), null, false, false, 56, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit testBodyFatScale$lambda$0(DeveloperActivity developerActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            developerActivity.startActivity(new Intent(developerActivity, (Class<?>) BodyFatScaleActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean testOta$lambda$0$0(final DeveloperActivity developerActivity, int i) {
        if (i == 1) {
            a01 a01Var = a01.OXO1;
            a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
            a01Var.IiI10X().put(b01.II1Xi0, "Dev Server");
        } else {
            a01 a01Var2 = a01.OXO1;
            a01Var2.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
            a01Var2.IiI10X().put(b01.II1Xi0, "Test Server");
        }
        DeviceInfoChecker.OXO1.I1XOi1(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXI01ii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.testOta$lambda$0$0$0(this.f8310IO, ((Boolean) obj).booleanValue());
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit testOta$lambda$0$0$0(DeveloperActivity developerActivity, boolean z) {
        if (!z) {
            ToastUtils.showLong("Network error!!", new Object[0]);
        }
        developerActivity.startActivity(new Intent(developerActivity, (Class<?>) DeveloperOtaSelectPlatformActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toBatchIMEI$lambda$0$0(DeveloperActivity developerActivity, int i) {
        if (i == 1) {
            a01 a01Var = a01.OXO1;
            a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
            a01Var.IiI10X().put(b01.II1Xi0, "Test Server");
        } else {
            a01 a01Var2 = a01.OXO1;
            a01Var2.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
            a01Var2.IiI10X().put(b01.II1Xi0, "ASIA PACIFIC");
        }
        developerActivity.startActivity(new Intent(developerActivity, (Class<?>) DeveloperIMEISetStartActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toBleAddressSet$lambda$0$0(DeveloperActivity developerActivity, int i) {
        if (i == 1) {
            a01 a01Var = a01.OXO1;
            a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
            a01Var.IiI10X().put(b01.II1Xi0, "Dev Server");
        } else {
            a01 a01Var2 = a01.OXO1;
            a01Var2.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
            a01Var2.IiI10X().put(b01.II1Xi0, "Test Server");
        }
        developerActivity.startActivity(new Intent(developerActivity, (Class<?>) DeveloperBleAddressSetStartActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toFactoryTestReset$lambda$0(BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.FACTORY_TEST, BleKeyFlag.UPDATE, FactoryTestType.TEST_RESET.getType(), false, false, 24, null);
        ToastUtils.showLong("done", new Object[0]);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toGoMoreSet$lambda$0$0(DeveloperActivity developerActivity, int i) {
        if (i == 1) {
            a01 a01Var = a01.OXO1;
            a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
            a01Var.IiI10X().put(b01.II1Xi0, "Test Server");
        } else {
            a01 a01Var2 = a01.OXO1;
            a01Var2.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
            a01Var2.IiI10X().put(b01.II1Xi0, "ASIA PACIFIC");
        }
        developerActivity.startActivity(new Intent(developerActivity, (Class<?>) DeveloperGoMoreSetStartActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toOTAStressTest$lambda$0(int i, final DeveloperActivity developerActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> bleFirmwareVersionListBody = RequestBodyKt.getBleFirmwareVersionListBody(String.valueOf(i));
        final O1XIiIO<FirmwareVersionList> o1XIiIO = new O1XIiIO<FirmwareVersionList>() { // from class: com.sma.smartv3.ui.me.DeveloperActivity$toOTAStressTest$1$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(FirmwareVersionList firmwareVersionList) {
                a01.OXO1.XIi00iiXO().put(FirmwareVersionList.class.getName(), new Gson().toJson(firmwareVersionList));
                DeveloperActivity developerActivity2 = this.OXO1;
                developerActivity2.startActivity(new Intent(developerActivity2, (Class<?>) DeveloperOtaStressTestActivity.class));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong("没有固件信息", new Object[0]);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareVersionList.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleFirmwareVersionList.URL, bleFirmwareVersionListBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleFirmwareVersionList.URL;
        final O1XIiIO<Response<FirmwareVersionList>> o1XIiIO2 = new O1XIiIO<Response<FirmwareVersionList>>() { // from class: com.sma.smartv3.ui.me.DeveloperActivity$toOTAStressTest$lambda$0$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<FirmwareVersionList> response) {
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) bleFirmwareVersionListBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, FirmwareVersionList.class), new ParsedRequestListener<Response<FirmwareVersionList>>() { // from class: com.sma.smartv3.ui.me.DeveloperActivity$toOTAStressTest$lambda$0$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<FirmwareVersionList> response) {
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
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toTuya$lambda$0$0(DeveloperActivity developerActivity, int i) {
        if (i == 1) {
            a01 a01Var = a01.OXO1;
            a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.OXO1);
            a01Var.IiI10X().put(b01.II1Xi0, "Dev Server");
        } else {
            a01 a01Var2 = a01.OXO1;
            a01Var2.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
            a01Var2.IiI10X().put(b01.II1Xi0, "Test Server");
        }
        developerActivity.startActivity(new Intent(developerActivity, (Class<?>) DeveloperTuyaStartActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toWatchFaceStressTest$lambda$0(DeveloperActivity developerActivity, BleConnector it) {
        Collection collectionM39402iI;
        Intrinsics.X0O(it, "it");
        ArrayList arrayList = new ArrayList();
        a01 a01Var = a01.OXO1;
        WatchFaceCategory[] watchFaceCategoryArr = (WatchFaceCategory[]) new Gson().fromJson(a01Var.m1440iO().getString(b01.iOiXi11II + '_' + WatchFaceCategory[].class.getName()), WatchFaceCategory[].class);
        if (watchFaceCategoryArr != null) {
            for (WatchFaceCategory watchFaceCategory : watchFaceCategoryArr) {
                OIXO1IIOO.m878Oi(arrayList, watchFaceCategory.getList());
            }
        } else {
            WatchFaceInfo[] watchFaceInfoArr = (WatchFaceInfo[]) new Gson().fromJson(a01Var.m1440iO().getString(b01.X00XIX1 + '_' + WatchFaceInfo[].class.getName()), WatchFaceInfo[].class);
            if (watchFaceInfoArr != null) {
                arrayList.addAll(ArraysKt___ArraysKt.iO0XiOIi(watchFaceInfoArr));
            }
        }
        if (arrayList.isEmpty()) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.Xii11I)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it2 = asJsonArray.iterator();
                while (it2.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it2.next(), OnlineWatchFaceV2.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            Iterator it3 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI).iterator();
            while (it3.hasNext()) {
                WatchFaceCategoryV2[] watchFaceList = ((OnlineWatchFaceV2) it3.next()).getWatchFaceList();
                if (watchFaceList != null) {
                    for (WatchFaceCategoryV2 watchFaceCategoryV2 : watchFaceList) {
                        arrayList.add(new WatchFaceInfo(watchFaceCategoryV2.getId(), watchFaceCategoryV2.getPreviewUrl(), watchFaceCategoryV2.getBinUrl()));
                    }
                }
            }
        }
        a01.OXO1.XO0O10().put(b01.X00XIX1, new Gson().toJson(arrayList));
        developerActivity.startActivity(new Intent(developerActivity, (Class<?>) DeveloperWatchFaceStressTestActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLocationInfo_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (TextView) developerActivity.findViewById(R.id.tv_location_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvOpenRuntimeLog_delegate$lambda$0(DeveloperActivity developerActivity) {
        return (TextView) developerActivity.findViewById(R.id.tv_open_runtime_log);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zipLog() {
        i1O0OXO1O.OXO1.OXO1("zipLog -> start");
        File shareFile = getShareFile(this.mAppUser.getNickname() + "-db&log-" + getMNow() + OTAManager.OTA_ZIP_SUFFIX);
        FileUtils.createOrExistsFile(shareFile);
        ThreadUtils.executeByIo(new C18864iO(shareFile));
    }

    public final void checkUpdateForApp(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        I01XX0.OXO1(I01XX0.XOXiX0, Boolean.TRUE);
    }

    public final void clearLogs(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        sz0 sz0Var = sz0.OXO1;
        FileUtils.delete(uz0.X0i1O(sz0Var));
        FileUtils.delete(uz0.I0iXXO(sz0Var));
        FileUtils.delete(getMContext().getCacheDir());
        FileUtils.delete(JL_Log.getSaveLogPath(getMContext()));
        FileUtils.delete(uz0.X1IX(sz0Var));
        ToastUtils.showLong("The log has been emptied", new Object[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        a01 a01Var = a01.OXO1;
        a01Var.XIi00iiXO().remove(b01.Ii0X0X);
        a01Var.XIi00iiXO().remove(b01.XXiIiX10);
        a01Var.XIi00iiXO().remove(b01.X00Xi1X);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.tvVersion)).setText("v" + AppUtils.getAppVersionName() + IiXI1X1OO.O00 + AppUtils.getAppVersionCode() + "_release_false");
        getTvOpenRuntimeLog().setText(String.valueOf(this.mIsOpenRunTimeLog));
        EditText etWeatherRealtime = getEtWeatherRealtime();
        a01 a01Var = a01.OXO1;
        etWeatherRealtime.setText(String.valueOf(a01Var.IiI10X().getInt(b01.O1O, 1)));
        getEtWeatherForecast().setText(String.valueOf(a01Var.IiI10X().getInt(b01.XXIIO1i11, 12)));
        getEtSedentariness().setText(String.valueOf(this.mSedentarinessSettings.getMInterval()));
        EditText etMtu = getEtMtu();
        BleConnector bleConnector = BleConnector.INSTANCE;
        etMtu.setText(String.valueOf(bleConnector.getMMtu()));
        getEtDrinkWater().setText(String.valueOf(this.mDrinkWater.getMInterval()));
        getEtStepGoal().setText(String.valueOf(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, 6000, null, 4, null)));
        onLocationChange(new Object());
        bleConnector.addHandleCallback(this.mBleHandleCallback);
        requestPermission();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.check_show_ad);
        if (appCompatCheckBox != null) {
            i72.OXO1.XIO11I();
            appCompatCheckBox.setVisibility(8);
            appCompatCheckBox.setChecked(q62.OXO1.m2879Ii());
            appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.Ii0X0IXi
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DeveloperActivity.initView$lambda$0$0(compoundButton, z);
                }
            });
        }
        TextView btnOta = getBtnOta();
        Intrinsics.O10IXXX0X(btnOta, "<get-btnOta>(...)");
        btnOta.setVisibility(8);
    }

    public final void lastOta(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperOtaStartActivity.class));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer;
    }

    public final void onAlipayRandomAddress(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(C20141iO.XOIO11O(new LongRange(0L, Long.parseLong("FFFFFFFFFFFF", kotlin.text.OXO1.OXO1(16))), Random.Default))}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        getEtAlipayAddress().setText(str);
    }

    public final void onAlipayWriteAddress(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OX0iO1OI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.onAlipayWriteAddress$lambda$0(this.f3417IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    }

    @sf5(tag = b01.XX1Oi)
    public final void onLocationChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onLocationChange");
        getTvLocationInfo().setText(a01.OXO1.IiI10X().getString(b01.XX1Oi, ""));
    }

    public final void onRefreshLocation(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        BleInitializer.f51208IO.onRequestAgpsPrerequisite();
    }

    public final void onSetMtu(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Editable text = getEtMtu().getText();
        String string = text != null ? text.toString() : null;
        int i = string != null ? Integer.parseInt(string) : 0;
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.setMMtu(i);
        bleConnector.launch();
        ToastUtils.showLong("done", new Object[0]);
    }

    public final void openRunTimeOpen(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mIsOpenRunTimeLog = !this.mIsOpenRunTimeLog;
        a01.OXO1.IiI10X().put(b01.iOO1ii1, this.mIsOpenRunTimeLog);
        LogUtils.getConfig().setLogSwitch(this.mIsOpenRunTimeLog);
        getTvOpenRuntimeLog().setText(String.valueOf(this.mIsOpenRunTimeLog));
    }

    public final void otaFromConfig(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperOtaFromConfigActivity.class));
    }

    public final void setDrinkWater(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iXOiX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.setDrinkWater$lambda$0(this.f8376IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void setForecastInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.IiI10X().put(b01.XXIIO1i11, Integer.parseInt(getEtWeatherForecast().getText().toString()));
        ToastUtils.showLong("done", new Object[0]);
    }

    public final void setHrMonitoringInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OO0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.setHrMonitoringInterval$lambda$0(this.f3133IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void setRealtimeInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.IiI10X().put(b01.O1O, Integer.parseInt(getEtWeatherRealtime().getText().toString()));
        ToastUtils.showLong("done", new Object[0]);
    }

    public final void setSedentariness(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiOOXi0XO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.setSedentariness$lambda$0(this.f2270IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void setStepGoal(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ii1110I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.setStepGoal$lambda$0(this.f8545IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void setTemperatureValue(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XX0IiXiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.setTemperatureValue$lambda$0(this.f4945IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void shareDatabaseAndLog(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(getMContext());
            c3006uq.I0iXXO(false);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (!bleConnector.isAvailable()) {
            zipLog();
            return;
        }
        BleKey bleKey = BleKey.RAW_SLEEP;
        BleKeyFlag bleKeyFlag = BleKeyFlag.READ;
        BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, null, false, false, 24, null);
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI)) {
            UtilsKt.iOI(1);
            BaseBleConnector.sendInt8$default(bleConnector, BleKey.DEVICE_FILE, bleKeyFlag, UtilsKt.m38847iI(), false, false, 24, null);
        }
        this.mHandler.postDelayed(this.mLogDetectRunnable, this.MAX_TIME);
    }

    public final void showGsensor(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperGsensorActivity.class));
    }

    public final void showGsensor2(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperGsensor2Activity.class));
    }

    public final void showRealtimeLog(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperShowRealtimeLogActivity.class));
    }

    public final void showRealtimeMapAndLocation(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperShowRealtimeMapAndLocationActivity.class));
    }

    public final void testBodyFatScale(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.OX0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.testBodyFatScale$lambda$0(this.f3407IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    public final void testHR(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperTestHRActivity.class));
    }

    public final void testOta(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        dj4 dj4Var = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0("Test Server", "Dev Server"), 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.force_switch_test_server);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.IX1iI1X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperActivity.testOta$lambda$0$0(this.f1982IO, ((Integer) obj).intValue()));
            }
        });
        this.mServerPopup = dj4Var;
        dj4Var.II1Xi0(0);
        dj4 dj4Var2 = this.mServerPopup;
        if (dj4Var2 != null) {
            LinearLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void toAirPressureValue(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        a01Var.IiI10X().put(b01.II1Xi0, "ASIA PACIFIC");
        startActivity(new Intent(this, (Class<?>) DeveloperAirPressureValueStartActivity.class));
    }

    public final void toBacCalibration(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperBacCalibrationSearchActivity.class));
    }

    public final void toBatchIMEI(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        dj4 dj4Var = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0("Asia Server", "Test Server"), 0, 4, (DefaultConstructorMarker) null);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIX0XX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperActivity.toBatchIMEI$lambda$0$0(this.f3028IO, ((Integer) obj).intValue()));
            }
        });
        this.mServerPopup = dj4Var;
        dj4Var.II1Xi0(0);
        dj4 dj4Var2 = this.mServerPopup;
        if (dj4Var2 != null) {
            dj4Var2.IIX1OXO();
        }
    }

    public final void toBatchTuyaKey(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, iX1IIO10.XIi00iiXO);
        a01Var.IiI10X().put(b01.II1Xi0, "Test Server");
        startActivity(new Intent(this, (Class<?>) DeveloperTuyaKeySetStartActivity.class));
    }

    public final void toBleAddressSet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        dj4 dj4Var = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0("Test Server", "Dev Server"), 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.force_switch_test_server);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.IXOiI10i0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperActivity.toBleAddressSet$lambda$0$0(this.f2082IO, ((Integer) obj).intValue()));
            }
        });
        this.mServerPopup = dj4Var;
        LinearLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        dj4Var.I1XOi1(rootView);
    }

    public final void toBtName(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperBtNameStartActivity.class));
    }

    public final void toBtNameSearch(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperBtNameSearchActivity.class));
    }

    public final void toFactoryTest(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperFactoryTestActivity.class));
    }

    public final void toFactoryTestReset(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IIIO0IX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.toFactoryTestReset$lambda$0((BleConnector) obj);
            }
        }, 1, null);
    }

    public final void toFileSystem(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperFileSystemTestActivity.class));
    }

    public final void toFontRepair(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperFontRepairStartActivity.class));
    }

    public final void toGoMoreSet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        dj4 dj4Var = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0("Asia Server", "Test Server"), 0, 4, (DefaultConstructorMarker) null);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.X0I0OO10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperActivity.toGoMoreSet$lambda$0$0(this.f3947IO, ((Integer) obj).intValue()));
            }
        });
        this.mServerPopup = dj4Var;
        dj4Var.II1Xi0(0);
        dj4 dj4Var2 = this.mServerPopup;
        if (dj4Var2 != null) {
            dj4Var2.IIX1OXO();
        }
    }

    public final void toOTAStressTest(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        DeviceConfigInfo deviceConfigInfoO1i0 = q62.OXO1.O1i0();
        final int firmwareId = deviceConfigInfoO1i0 != null ? deviceConfigInfoO1i0.getFirmwareId() : 0;
        if (firmwareId == 0) {
            ToastUtils.showLong("配置出错", new Object[0]);
        } else {
            X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXXO1OiIX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeveloperActivity.toOTAStressTest$lambda$0(firmwareId, this, (BleConnector) obj);
                }
            }, 1, null);
        }
    }

    public final void toReadLog(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperReadLogActivity.class));
    }

    public final void toShowInfo(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperInfoActivity.class));
    }

    public final void toShutdown(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperShutdownStartActivity.class));
    }

    public final void toSmsTest(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperSmsTestActivity.class));
    }

    public final void toTemperatureValue(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperTemperatureValueStartActivity.class));
    }

    public final void toTestBox(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperTestBoxActivity.class));
    }

    public final void toTuya(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        dj4 dj4Var = new dj4(this, CollectionsKt__CollectionsKt.Ii1iii0("Test Server", "Dev Server"), 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.force_switch_test_server);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.X0IiOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeveloperActivity.toTuya$lambda$0$0(this.f3977IO, ((Integer) obj).intValue()));
            }
        });
        this.mServerPopup = dj4Var;
        LinearLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        dj4Var.I1XOi1(rootView);
    }

    public final void toTuyaKey(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperTuyaKeyTestActivity.class));
    }

    public final void toWatchFaceStressTest(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1IXiX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperActivity.toWatchFaceStressTest$lambda$0(this.f1396IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void toWeaterTest(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) DeveloperWeatherTestActivity.class));
    }
}
