package com.sma.smartv3.ui.device.dial;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0I0OX1;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.I1iO0IO;
import com.android.mltcode.paycertificationapi.II01IOiX;
import com.android.mltcode.paycertificationapi.IIIOXOI0;
import com.android.mltcode.paycertificationapi.IIOi010I;
import com.android.mltcode.paycertificationapi.IO0I100XX;
import com.android.mltcode.paycertificationapi.IOIiO1;
import com.android.mltcode.paycertificationapi.IOO0IIOX1;
import com.android.mltcode.paycertificationapi.IX01Oi;
import com.android.mltcode.paycertificationapi.IX0OOi1XO;
import com.android.mltcode.paycertificationapi.IXO101O11;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0O0OOi;
import com.android.mltcode.paycertificationapi.O0OO0IX;
import com.android.mltcode.paycertificationapi.O10OOOXX;
import com.android.mltcode.paycertificationapi.O1XIOiX0;
import com.android.mltcode.paycertificationapi.OI11;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OO00;
import com.android.mltcode.paycertificationapi.OOOiO1X11;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OXO0XXO0;
import com.android.mltcode.paycertificationapi.X001XXXX;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X11iXOOOi;
import com.android.mltcode.paycertificationapi.X1X01I;
import com.android.mltcode.paycertificationapi.X1XX1O;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.XI1I0O;
import com.android.mltcode.paycertificationapi.XIOi0O0i0;
import com.android.mltcode.paycertificationapi.XX0Ii010;
import com.android.mltcode.paycertificationapi.XXIiXXI;
import com.android.mltcode.paycertificationapi.XXXi;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i0IO;
import com.android.mltcode.paycertificationapi.i0IOXOX;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iI01XIO;
import com.android.mltcode.paycertificationapi.iI0OO1O;
import com.android.mltcode.paycertificationapi.iI1OI;
import com.android.mltcode.paycertificationapi.iOOOIi;
import com.android.mltcode.paycertificationapi.iX10O;
import com.android.mltcode.paycertificationapi.iXiIII0;
import com.android.mltcode.paycertificationapi.iXiIO0i;
import com.android.mltcode.paycertificationapi.ii1O1OIi;
import com.android.mltcode.paycertificationapi.iiXOX1;
import com.android.mltcode.paycertificationapi.iiiXIi;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.jieli.bmp_convert.BmpConvert;
import com.jieli.bmp_convert.ConvertResult;
import com.realsil.sdk.dfu.image.constants.SubBinId;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pop.dial.DialPointerPopup;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.bubbleview.ArrowDirection;
import com.sma.smartv3.view.bubbleview.BubbleLayout;
import com.sma.smartv3.view.dial.DialElementView;
import com.sma.smartv3.view.text.PFMedium;
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
import com.szabh.smable3.watchface.Element;
import com.szabh.smable3.watchface.WatchFaceBuilder;
import com.szabh.smable3.watchface.WatchFaceElement;
import com.szabh.smable3.watchface.WatchFaceEnumUtil;
import com.szabh.smable3.watchface.WatchFaceHeader;
import com.szabh.smable3.watchface.WatchFaceResourceDescriptor;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nBaseDialCustomizeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialCustomizeActivity.kt\ncom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2570:1\n50#2,3:2571\n53#2:2577\n55#2,2:2579\n1563#3:2574\n1634#3,2:2575\n1636#3:2578\n1374#3:2608\n1460#3,5:2609\n1374#3:2614\n1460#3,5:2615\n255#4:2581\n255#4:2582\n255#4:2583\n255#4:2584\n255#4:2585\n255#4:2588\n255#4:2589\n255#4:2590\n255#4:2591\n255#4:2592\n255#4:2593\n255#4:2594\n255#4:2595\n255#4:2596\n255#4:2597\n255#4:2598\n255#4:2599\n255#4:2600\n255#4:2601\n255#4:2602\n255#4:2603\n255#4:2604\n255#4:2605\n255#4:2606\n255#4:2646\n255#4:2647\n255#4:2648\n255#4:2649\n255#4:2652\n255#4:2653\n255#4:2654\n255#4:2655\n255#4:2658\n255#4:2659\n255#4:2660\n255#4:2661\n37#5,2:2586\n37#5,2:2620\n37#5,2:2622\n37#5,2:2624\n37#5,2:2626\n37#5,2:2628\n37#5,2:2630\n37#5,2:2632\n37#5,2:2634\n37#5,2:2636\n37#5,2:2638\n37#5,2:2640\n37#5,2:2642\n37#5,2:2644\n37#5,2:2650\n37#5,2:2656\n1#6:2607\n*S KotlinDebug\n*F\n+ 1 BaseDialCustomizeActivity.kt\ncom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity\n*L\n516#1:2571,3\n516#1:2577\n516#1:2579,2\n516#1:2574\n516#1:2575,2\n516#1:2578\n1486#1:2608\n1486#1:2609,5\n1487#1:2614\n1487#1:2615,5\n642#1:2581\n742#1:2582\n745#1:2583\n785#1:2584\n788#1:2585\n836#1:2588\n837#1:2589\n840#1:2590\n841#1:2591\n843#1:2592\n844#1:2593\n846#1:2594\n847#1:2595\n849#1:2596\n850#1:2597\n852#1:2598\n853#1:2599\n863#1:2600\n870#1:2601\n874#1:2602\n984#1:2603\n1016#1:2604\n1046#1:2605\n1076#1:2606\n1973#1:2646\n1987#1:2647\n2001#1:2648\n2015#1:2649\n2037#1:2652\n2052#1:2653\n2067#1:2654\n2082#1:2655\n2302#1:2658\n2308#1:2659\n2312#1:2660\n2502#1:2661\n800#1:2586,2\n1576#1:2620,2\n1620#1:2622,2\n1656#1:2624,2\n1684#1:2626,2\n1692#1:2628,2\n1729#1:2630,2\n1766#1:2632,2\n1798#1:2634,2\n1862#1:2636,2\n1871#1:2638,2\n1911#1:2640,2\n1951#1:2642,2\n1971#1:2644,2\n2035#1:2650,2\n2122#1:2656,2\n*E\n"})
public abstract class BaseDialCustomizeActivity extends BaseActivity {

    @aa1
    private final String CALORIES_DIR;

    @aa1
    private final String CONTROL_DIR;

    @aa1
    private final Object DIAL_CUSTOMIZE_DIR;

    @aa1
    private final String DIGITAL_AM_DIR;

    @aa1
    private final String DIGITAL_DATE_DIR;

    @aa1
    private final String DIGITAL_DIR;

    @aa1
    private final String DIGITAL_HOUR_MINUTE_DIR;

    @aa1
    private final String DIGITAL_WEEK_DIR;

    @aa1
    private final String DISTANCE_DIR;

    @aa1
    private final String HEART_RATE_DIR;

    @aa1
    private final String POINTER_DIR;

    @aa1
    private final String POINTER_HOUR;

    @aa1
    private final String POINTER_MINUTE;

    @aa1
    private final String POINTER_SECOND;

    @aa1
    private final String STEP_DIR;

    @aa1
    private final String TIME_DIR;

    @aa1
    private final String VALUE_DIR;
    private int X_CENTER;
    private int Y_CENTER;

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private float amLeftX;
    private float amTopY;

    @tb1
    private String bgFile;
    private int borderSize;
    private float caloriesValueCenterX;
    private float caloriesValueCenterY;

    @aa1
    private final Lazy colors$delegate;
    private int controlValueInterval;
    private int controlValueRange;

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

    @tb1
    private DialPickerPopup dialPickerPopup;
    private float digitalDateDayLeftX;
    private float digitalDateDayTopY;
    private float digitalDateMonthLeftX;
    private float digitalDateMonthTopY;
    private float digitalDateSymbolLeftX;
    private float digitalDateSymbolTopY;
    private float digitalTimeHourLeftX;
    private float digitalTimeHourTopY;
    private float digitalTimeMinuteLeftX;
    private float digitalTimeMinuteRightX;
    private float digitalTimeMinuteTopY;
    private float digitalTimeSymbolLeftX;
    private float digitalTimeSymbolTopY;

    @aa1
    private final Lazy digitalTimes$delegate;
    private int digitalValueColor;
    private float digitalWeekLeftX;
    private float digitalWeekTopY;
    private float distanceValueCenterX;
    private float distanceValueCenterY;

    @aa1
    private String fileFormat;
    private float heartRateValueCenterX;
    private float heartRateValueCenterY;
    private int ignoreBlack;
    private int imageFormat;

    @aa1
    private final String is2DAcceleration;
    private final boolean isJL707N;
    private boolean isRound;
    private boolean isSupportConvertPng;

    @tb1
    private String mAiBgFile;

    @tb1
    private DialBgFilePickerPopup mBgFilePickerPopup;

    @tb1
    private I0OOX mBgPopup;

    @aa1
    private final XO0O10 mBleHandleCallback;

    @tb1
    private iOOOIi mControlPopup;

    @aa1
    private final Lazy mCrop$delegate;

    @tb1
    private byte[] mCurSendBytes;
    private int mCurSyncDevicePosition;
    private int mCurSyncDialId;

    @aa1
    private final List<Integer> mDialIds;

    @tb1
    private X001XXXX mDigitalPopup;

    @tb1
    private PopupWindow mDragPopup;
    private int mElementsNumber;

    @tb1
    private DialPointerPopup mPointerPopup;

    @tb1
    private c72 mProgressPop;
    private int mResourceDescNumber;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final Lazy nestedScrollView$delegate;

    @aa1
    private final String paramName;
    private int pointerSelectNumber;

    @aa1
    private final Lazy pointers$delegate;

    @aa1
    private final Lazy rootView$delegate;
    private float roundCornerRadius;

    @aa1
    private final Lazy saveDial$delegate;
    private int scaleSelectNumber;

    @aa1
    private final List<ResourcesIdInfo> scales;
    private int screenHeight;
    private int screenPreviewHeight;
    private int screenPreviewWidth;
    private int screenReservedBoundary;
    private int screenWidth;
    private float stepValueCenterX;
    private float stepValueCenterY;

    @aa1
    private final Lazy timeDigitalView$delegate;

    @aa1
    private final Lazy timePointView$delegate;

    @aa1
    private final Lazy timeScaleView$delegate;
    private int valueColor;

    public static final class IiI10X implements II01IOiX<Integer> {
        public final /* synthetic */ BaseDialCustomizeActivity OXO1;

        public IiI10X(BaseDialCustomizeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.II01IOiX
        public /* bridge */ /* synthetic */ void OXO1(Integer r1) {
            XIi00iiXO(r1.intValue());
        }

        public void XIi00iiXO(int r3) {
            this.OXO1.getTimeDigitalView().setVisibility(0);
            this.OXO1.getTimePointView().setVisibility(8);
            this.OXO1.getTimeScaleView().setVisibility(8);
            this.OXO1.getTimeDigitalView().setImageRes(this.OXO1.getDigitalTimes().get(r3).getResId());
            X001XXXX r0 = BaseDialCustomizeActivity.access$getMDigitalPopup$p(this.OXO1);
            if (r0 == null) goto L5;
            r0.i010I(this.OXO1.getColors().get(r3).getSecondaryId());
        L5:
            this.OXO1.setDigitalValueColor(r3);
        }
    }

    public static final class O00 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;
        public final /* synthetic */ BaseDialCustomizeActivity iO;

        public O00(BaseDialCustomizeActivity r2) {
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
            xz3 r4 = BaseDialCustomizeActivity.access$getMSelectAvatarPopup$p(this.iO);
            if (r4 == null) goto L5;
            r4.dismiss();
        L5:
            sz0 r5 = sz0.OXO1;
            if (uz0.XiOIii1(r5).exists() == false) goto L13;
            Bitmap r6 = ImageUtils.getBitmap(uz0.XiOIii1(r5));
            if (this.iO.isRound() == false) goto L10;
            Bitmap r7 = ImageUtils.toRound(r6);
        L11:
            this.iO.getCustomizeDialBg().setImageBitmap(r7);
            return;
        L10:
            r7 = ImageUtils.toRoundCorner(r6, this.iO.getRoundCornerRadius());
            goto L11
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    public static final class OXO1 implements X11iXOOOi {
        public final /* synthetic */ BaseDialCustomizeActivity OXO1;
        public final /* synthetic */ List<String> XIi00iiXO;

        public OXO1(BaseDialCustomizeActivity r1, List<String> r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.X11iXOOOi
        public void OXO1(int r4) {
            BaseDialCustomizeActivity r0 = this.OXO1;
            Uri r5 = Uri.fromFile(new File(this.XIi00iiXO.get(r4)));
            Intrinsics.O10IXXX0X(r5, "fromFile(...)");
            BaseDialCustomizeActivity.access$toCropPic(r0, r5);
        }
    }

    public static final class XIi00iiXO implements II01IOiX<Integer> {
        public final /* synthetic */ BaseDialCustomizeActivity OXO1;

        public XIi00iiXO(BaseDialCustomizeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.II01IOiX
        public /* bridge */ /* synthetic */ void OXO1(Integer r1) {
            XIi00iiXO(r1.intValue());
        }

        public void XIi00iiXO(int r3) {
            this.OXO1.getControlViewStep().setTextColor(this.OXO1.getColors().get(r3).getSecondaryId());
            this.OXO1.getControlViewHr().setTextColor(this.OXO1.getColors().get(r3).getSecondaryId());
            this.OXO1.getControlViewCa().setTextColor(this.OXO1.getColors().get(r3).getSecondaryId());
            this.OXO1.getControlViewDis().setTextColor(this.OXO1.getColors().get(r3).getSecondaryId());
            this.OXO1.setValueColor(r3);
        }
    }

    @SourceDebugExtension({"SMAP\nBaseDialCustomizeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialCustomizeActivity.kt\ncom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2570:1\n1869#2,2:2571\n*S KotlinDebug\n*F\n+ 1 BaseDialCustomizeActivity.kt\ncom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$mBleHandleCallback$1\n*L\n339#1:2571,2\n*E\n"})
    public static final class XO0O10 implements BleHandleCallback {
        public final /* synthetic */ BaseDialCustomizeActivity IO;

        public XO0O10(BaseDialCustomizeActivity r1) {
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
            BaseDialCustomizeActivity.syncFailed$default(this.IO, 0, 1, null);
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
            BaseDialCustomizeActivity.access$getMDialIds$p(this.IO).clear();
            List<Integer> r5 = r4.getMIdList();
            BaseDialCustomizeActivity r0 = this.IO;
            Iterator<T> r6 = r5.iterator();
        L4:
            if (r6.hasNext() == false) goto L9;
            int r1 = ((Number) r6.next()).intValue();
            if (r1 <= 0) goto L7;
            BaseDialCustomizeActivity.access$getMDialIds$p(r0).add(Integer.valueOf(r1));
            goto L4
        L7:
            BaseDialCustomizeActivity.access$getMDialIds$p(r0).add(0);
            goto L4
        L9:
            LogUtils.d(new Object[]{"mDialIds -> " + BaseDialCustomizeActivity.access$getMDialIds$p(this.IO)});
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
            BaseDialCustomizeActivity.syncFailed$default(this.IO, 0, 1, null);
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
            c72 r7 = BaseDialCustomizeActivity.access$getMProgressPop$p(this.IO);
            if (r7 == null) goto L7;
            r7.OX((int) ((r5 / r4) * 100));
        L7:
            if (r4 != r5) goto L15;
            c72 r8 = BaseDialCustomizeActivity.access$getMProgressPop$p(this.IO);
            if (r8 == null) goto L11;
            r8.dismiss();
        L11:
            BaseDialCustomizeActivity.access$setMProgressPop$p(this.IO, null);
            ToastUtils.showLong(R.string.dial_sync_done);
            BaseDialCustomizeActivity.access$getMDialIds$p(this.IO).set(BaseDialCustomizeActivity.access$getMCurSyncDevicePosition$p(this.IO), Integer.valueOf(BaseDialCustomizeActivity.access$getMCurSyncDialId$p(this.IO)));
            a01.OXO1.XIi00iiXO().put("syncId", 0);
            BaseDialCustomizeActivity.access$saveRecord(this.IO);
            return;
        L15:
            return;
        L13:
            BaseDialCustomizeActivity.access$syncFailed(this.IO, r3);
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
            BaseDialCustomizeActivity.access$syncDial(this.IO);
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

    public static final class XOO0ii0 implements IO0I100XX<Integer> {
        public final /* synthetic */ BaseDialCustomizeActivity OXO1;

        public XOO0ii0(BaseDialCustomizeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.IO0I100XX
        public /* bridge */ /* synthetic */ void OXO1(Integer r1) {
            iO(r1.intValue());
        }

        @Override // com.android.mltcode.paycertificationapi.IO0I100XX
        public /* bridge */ /* synthetic */ void XIi00iiXO(Integer r1) {
            XO0O10(r1.intValue());
        }

        public void XO0O10(int r3) {
            this.OXO1.getTimeDigitalView().setVisibility(8);
            this.OXO1.getTimeScaleView().setVisibility(0);
            this.OXO1.getTimeScaleView().setImageResource(this.OXO1.getScales().get(r3).getResId());
            this.OXO1.setScaleSelectNumber(r3);
        }

        public void iO(int r3) {
            this.OXO1.getTimeDigitalView().setVisibility(8);
            this.OXO1.getTimePointView().setVisibility(0);
            this.OXO1.getTimePointView().setImageResource(this.OXO1.getPointers().get(r3).getResId());
            this.OXO1.setPointerSelectNumber(r3);
        }
    }

    public static final class iO implements iXiIO0i {
        public final /* synthetic */ BaseDialCustomizeActivity OXO1;

        public iO(BaseDialCustomizeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXiIO0i
        public void OXO1(int r12) {
            BaseDialCustomizeActivity.access$setMCurSyncDevicePosition$p(this.OXO1, r12);
            BaseDialCustomizeActivity r13 = this.OXO1;
            BaseDialCustomizeActivity.access$setMCurSyncDialId$p(r13, BaseDialCustomizeActivity.access$getMCurSyncDevicePosition$p(r13) + 10000000);
            BaseBleConnector.sendInt32$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.UPDATE, BaseDialCustomizeActivity.access$getMCurSyncDialId$p(this.OXO1), null, false, false, 56, null);
        }
    }

    public BaseDialCustomizeActivity() {
        BleCache r0 = BleCache.INSTANCE;
        this.isJL707N = Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707);
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new O0O0OOi(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new iXiIII0(this));
        this.saveDial$delegate = LazyKt__LazyJVMKt.iO(new IOO0IIOX1(this));
        this.nestedScrollView$delegate = LazyKt__LazyJVMKt.iO(new OI11(this));
        this.customizeDialBg$delegate = LazyKt__LazyJVMKt.iO(new XXIiXXI(this));
        this.controlViewStep$delegate = LazyKt__LazyJVMKt.iO(new O0OO0IX(this));
        this.controlViewHr$delegate = LazyKt__LazyJVMKt.iO(new XXXi(this));
        this.controlViewCa$delegate = LazyKt__LazyJVMKt.iO(new ii1O1OIi(this));
        this.controlViewDis$delegate = LazyKt__LazyJVMKt.iO(new iiXOX1(this));
        this.timeDigitalView$delegate = LazyKt__LazyJVMKt.iO(new iI1OI(this));
        this.timePointView$delegate = LazyKt__LazyJVMKt.iO(new IX0OOi1XO(this));
        this.timeScaleView$delegate = LazyKt__LazyJVMKt.iO(new iiiXIi(this));
        this.isRound = true;
        this.controlValueRange = 9;
        this.fileFormat = "png";
        this.imageFormat = 1;
        this.X_CENTER = 4;
        this.Y_CENTER = 32;
        Object r1 = customizeDir();
        this.DIAL_CUSTOMIZE_DIR = r1;
        String r2 = r1 + "/control";
        this.CONTROL_DIR = r2;
        this.STEP_DIR = r2 + "/step";
        this.CALORIES_DIR = r2 + "/calories";
        this.DISTANCE_DIR = r2 + "/distance";
        this.HEART_RATE_DIR = r2 + "/heart_rate";
        this.VALUE_DIR = r1 + "/value";
        String r3 = r1 + "/time";
        this.TIME_DIR = r3;
        this.DIGITAL_DIR = r3 + "/digital";
        this.POINTER_DIR = r3 + "/pointer";
        this.DIGITAL_AM_DIR = "am_pm";
        this.DIGITAL_DATE_DIR = "date";
        this.DIGITAL_HOUR_MINUTE_DIR = "hour_minute";
        this.DIGITAL_WEEK_DIR = "week";
        this.POINTER_HOUR = "pointer/hour";
        this.POINTER_MINUTE = "pointer/minute";
        this.POINTER_SECOND = "pointer/second";
        if (q62.OXO1.iIi011O() == false) goto L5;
        String r4 = "/2d/";
    L6:
        this.is2DAcceleration = r4;
        this.paramName = r0.getMPrototype() + "/";
        this.colors$delegate = LazyKt__LazyJVMKt.iO(new i0IO(this));
        this.digitalTimes$delegate = LazyKt__LazyJVMKt.iO(new IIOi010I());
        this.pointers$delegate = LazyKt__LazyJVMKt.iO(new OO00());
        this.scales = scalesList();
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new OXO0XXO0(this));
        this.mBleHandleCallback = new XO0O10(this);
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0});
        return;
    L5:
        r4 = "/default/";
        goto L6
    }

    public static /* synthetic */ void I0iXXO(X001XXXX r0, View r1) {
        numberOnClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ NestedScrollView I1(BaseDialCustomizeActivity r0) {
        return nestedScrollView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(BaseDialCustomizeActivity r0, Uri r1) {
        return initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageViewRound II1Xi0(BaseDialCustomizeActivity r0) {
        return customizeDialBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(BaseDialCustomizeActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView IXXOO(BaseDialCustomizeActivity r0) {
        return timeDigitalView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView O10IXXX0X(BaseDialCustomizeActivity r0) {
        return controlViewStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button O1O(BaseDialCustomizeActivity r0) {
        return saveDial_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView OII(BaseDialCustomizeActivity r0) {
        return controlViewDis_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(I0OOX r0, BaseDialCustomizeActivity r1, View r2) {
        bgOnClick$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void OX(BaseDialCustomizeActivity r0) {
        initView$lambda$2(r0);
    }

    public static /* synthetic */ void OiIIX101O(BaseDialCustomizeActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void X01IiOiIi(BaseDialCustomizeActivity r0, iOOOIi r1, View r2) {
        controlOnClick$lambda$0$3(r0, r1, r2);
    }

    public static /* synthetic */ View X0O(BaseDialCustomizeActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0i1O(DialBgFilePickerPopup r0, BaseDialCustomizeActivity r1, View r2) {
        bgOnClick$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ List X11iII1O1() {
        return digitalTimes_delegate$lambda$0();
    }

    public static /* synthetic */ Unit X1IX(BaseDialCustomizeActivity r0, boolean r1) {
        return selectImagePopup$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(BaseDialCustomizeActivity r0, BleConnector r1) {
        return initView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(BaseDialCustomizeActivity r0) {
        return selectImagePopup$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit XXI(BaseDialCustomizeActivity r0) {
        return selectImagePopup$lambda$0$0(r0);
    }

    public static /* synthetic */ void XXIIO1i11(BaseDialCustomizeActivity r0, iOOOIi r1, View r2) {
        controlOnClick$lambda$0$4(r0, r1, r2);
    }

    public static /* synthetic */ DialElementView XXX11i(BaseDialCustomizeActivity r0) {
        return controlViewHr_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView XiOIO(BaseDialCustomizeActivity r0) {
        return controlViewCa_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(iOOOIi r0, View r1) {
        controlOnClick$lambda$0$0(r0, r1);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ int access$getMCurSyncDevicePosition$p(BaseDialCustomizeActivity r0) {
        return r0.mCurSyncDevicePosition;
    }

    public static final /* synthetic */ int access$getMCurSyncDialId$p(BaseDialCustomizeActivity r0) {
        return r0.mCurSyncDialId;
    }

    public static final /* synthetic */ List access$getMDialIds$p(BaseDialCustomizeActivity r0) {
        return r0.mDialIds;
    }

    public static final /* synthetic */ X001XXXX access$getMDigitalPopup$p(BaseDialCustomizeActivity r0) {
        return r0.mDigitalPopup;
    }

    public static final /* synthetic */ c72 access$getMProgressPop$p(BaseDialCustomizeActivity r0) {
        return r0.mProgressPop;
    }

    public static final /* synthetic */ xz3 access$getMSelectAvatarPopup$p(BaseDialCustomizeActivity r0) {
        return r0.mSelectAvatarPopup;
    }

    public static final /* synthetic */ void access$saveRecord(BaseDialCustomizeActivity r0) {
        r0.saveRecord();
    }

    public static final /* synthetic */ void access$setMCurSyncDevicePosition$p(BaseDialCustomizeActivity r0, int r1) {
        r0.mCurSyncDevicePosition = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncDialId$p(BaseDialCustomizeActivity r0, int r1) {
        r0.mCurSyncDialId = r1;
    }

    public static final /* synthetic */ void access$setMProgressPop$p(BaseDialCustomizeActivity r0, c72 r1) {
        r0.mProgressPop = r1;
    }

    public static final /* synthetic */ void access$syncDial(BaseDialCustomizeActivity r0) {
        r0.syncDial();
    }

    public static final /* synthetic */ void access$syncFailed(BaseDialCustomizeActivity r0, int r1) {
        r0.syncFailed(r1);
    }

    public static final /* synthetic */ void access$toCropPic(BaseDialCustomizeActivity r0, Uri r1) {
        r0.toCropPic(r1);
    }

    private final byte[] addAmPmNumber(ArrayList<WatchFaceElement> r34, ArrayList<WatchFaceResourceDescriptor> r35, byte[] r36) {
        String r4 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat;
        String r3 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/pm." + this.fileFormat;
        Bitmap r5 = ImageUtils.getBitmap(getResources().getAssets().open(r4));
        int r11 = r5.getWidth();
        int r12 = r5.getHeight();
        InputStream r6 = getResources().getAssets().open(r4);
        Intrinsics.XXI(r6);     // Catch: Throwable -> L14
        byte[] r7 = ByteStreamsKt.X0O(r6);     // Catch: Throwable -> L14
        CloseableKt.OXO1(r6, null);
        InputStream r8 = getResources().getAssets().open(r3);
        Intrinsics.XXI(r8);     // Catch: Throwable -> L8
        byte[] r9 = ByteStreamsKt.X0O(r8);     // Catch: Throwable -> L8
        CloseableKt.OXO1(r8, null);
        File r10 = new File(PathUtils.getExternalAppDataPath(), r4);
        FileIOUtils.writeFileFromBytesByStream(r10, r7);
        File r13 = new File(PathUtils.getExternalAppDataPath(), r3);
        FileIOUtils.writeFileFromBytesByStream(r13, r9);
        Triple<Integer, Integer, byte[]> r14 = convertPng707(r10);
        Triple<Integer, Integer, byte[]> r15 = convertPng707(r13);
        r34.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.AMPM.getValue(), 2, r35.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) this.amLeftX, (int) this.amTopY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        int r16 = r14.getThird().length;
        int r17 = (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r36.length;
        WatchFaceEnumUtil r18 = WatchFaceEnumUtil.INSTANCE;
        r35.add(new WatchFaceResourceDescriptor((byte) 0, r16, r17, new WatchFaceResourceDescriptor.ImageDesc(r18.getColorFormat(r14.getFirst().intValue()), r14.getFirst().intValue(), r14.getSecond().intValue(), 0, r11, r12, null, 72, null), 1, null));
        byte[] r2 = ArraysKt___ArraysJvmKt.i1i(r36, r14.getThird());
        r35.add(new WatchFaceResourceDescriptor((byte) 0, r15.getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r2.length, new WatchFaceResourceDescriptor.ImageDesc(r18.getColorFormat(r15.getFirst().intValue()), r15.getFirst().intValue(), r15.getSecond().intValue(), 0, r11, r12, null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(r2, r15.getThird());
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        CloseableKt.OXO1(r8, th);
        throw th;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        CloseableKt.OXO1(r6, th);
        throw th;
    }

    private final Pair<Float, Float> addControlBitmap(String r6, DialElementView r7, String r8, String r9, Canvas r10, float r11, float r12, boolean r13) {
        if (r7.getVisibility() != 0) goto L16;
        LogUtils.d(new Object[]{"test addControlBitmap " + r6 + " , " + r7.getX() + " " + r7.getY() + " " + r11 + " " + r12});
        Bitmap r14 = ImageUtils.getBitmap(getResources().getAssets().open(r6));
        float r0 = r7.getX() * r11;
        float r15 = r7.getY() * r12;
        r10.drawBitmap(r14, r0, r15, null);
        float r16 = ((float) (r14.getWidth() / 2)) + r0;
        float r17 = (r15 + ((float) r14.getHeight())) + ((float) this.controlValueInterval);
        int r1 = 0;
        Bitmap r18 = ImageUtils.getBitmap(getResources().getAssets().open(r8 + r9.charAt(0) + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat));
        float r2 = r16 - ((float) ((((r18.getWidth() * r9.length()) + r9.length()) + (-1)) / 2));
        if (r13 == false) goto L9;
        int r19 = r9.length();
    L7:
        if (r1 >= r19) goto L9;
        Bitmap r3 = ImageUtils.getBitmap(getResources().getAssets().open(r8 + r9.charAt(r1) + ".png"));
        r10.drawBitmap(r3, (((float) r1) + r2) + ((float) (r3.getWidth() * r1)), r17, null);
        r1 = r1 + 1;
    L9:
        float r20 = r17 + (r18.getHeight() / 2);
        if (q62.OXO1.IiX() == false) goto L14;
        return new Pair(Float.valueOf(r16 - (this.screenWidth / 2)), Float.valueOf(r20 - (this.screenHeight / 2)));
    L14:
        return new Pair(Float.valueOf(r16), Float.valueOf(r20));
    L16:
        return new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    private final byte[] addDateDigit(ArrayList<WatchFaceElement> r35, ArrayList<WatchFaceResourceDescriptor> r36, byte[] r37) {
        String r2 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR + "/";
        Triple r4 = getNumberBuffers707$default(this, r2, 0, 2, null);
        int r12 = ((Number) r4.getFirst()).intValue();
        int r13 = ((Number) r4.getSecond()).intValue();
        r35.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.DATE_DIGIT.getValue(), ((ArrayList) r4.getThird()).size() + 1, r36.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) (this.digitalDateDayLeftX - (r12 * 3)), (int) this.digitalDateDayTopY, 0, null, null, null, new WatchFaceElement.DateDigitData((byte) (WatchFaceEnumUtil.DateDigitFlag.DATE_DIGIT_FLAG_MONTH.getValue() | WatchFaceEnumUtil.DateDigitFlag.DATE_DIGIT_FLAG_DAY.getValue())), null, null, null, null, null, 128904, null));
        ArrayList r5 = (ArrayList) r4.getThird();
        int r6 = r5.size();
        int r7 = 0;
        byte[] r3 = r37;
    L3:
        if (r7 >= r6) goto L5;
        int r19 = r7;
        r36.add(new WatchFaceResourceDescriptor((byte) 0, ((byte[]) ((Triple) r5.get(r7)).getThird()).length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r3.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(((Number) ((Triple) r5.get(r7)).getFirst()).intValue()), ((Number) ((Triple) r5.get(r7)).getFirst()).intValue(), ((Number) ((Triple) r5.get(r7)).getSecond()).intValue(), 0, r12, r13, null, 72, null), 1, null));
        r3 = ArraysKt___ArraysJvmKt.i1i(r3, (byte[]) ((Triple) r5.get(r19)).getThird());
        r7 = r19 + 1;
        goto L3
    L5:
        String r8 = r2 + "symbol." + this.fileFormat;
        InputStream r9 = getResources().getAssets().open(r8);
        Intrinsics.XXI(r9);     // Catch: Throwable -> L9
        byte[] r10 = ByteStreamsKt.X0O(r9);     // Catch: Throwable -> L9
        CloseableKt.OXO1(r9, null);
        Bitmap r11 = ImageUtils.getBitmap(getResources().getAssets().open(r8));
        int r14 = r11.getWidth();
        int r15 = r11.getHeight();
        File r16 = new File(PathUtils.getExternalAppDataPath(), r8);
        FileIOUtils.writeFileFromBytesByStream(r16, r10);
        Triple<Integer, Integer, byte[]> r17 = convertPng707(r16);
        r36.add(new WatchFaceResourceDescriptor((byte) 0, r17.getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r3.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r17.getFirst().intValue()), r17.getFirst().intValue(), r17.getSecond().intValue(), 0, r14, r15, null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(r3, r17.getThird());
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        CloseableKt.OXO1(r9, th);
        throw th;
    }

    private final void addDigitalTime(String r11, float r12, float r13, Canvas r14, boolean r15) {
        float r8 = getTimeDigitalView().getX() * r12;
        float r5 = getTimeDigitalView().getY() * r13;
        LogUtils.d(new Object[]{"test timeLeft=" + r8 + ",  timeTop=" + r5 + ", timeDigitalView.width=" + getTimeDigitalView().getWidth() + " ,scaleWidth =" + r12});
        AssetManager r16 = getResources().getAssets();
        String r17 = this.DIGITAL_AM_DIR;
        StringBuilder r0 = new StringBuilder();
        r0.append(r11);
        r0.append(r17);
        r0.append("/pm.png");
        Bitmap r18 = ImageUtils.getBitmap(r16.open(r0.toString()));
        Pair<Bitmap, Float> r19 = addDigitalTimeParam(r11, this.DIGITAL_HOUR_MINUTE_DIR, "08:30", r5, r18.getHeight(), r14, r8, r15);
        Bitmap r110 = r19.component1();
        float r111 = addDigitalTimeParam(r11, this.DIGITAL_DATE_DIR, "07/08", r19.component2().floatValue(), r110.getHeight(), r14, r8, r15).component2().floatValue();
        if (r15 == false) goto L5;
        r14.drawBitmap(r18, this.digitalTimeMinuteRightX - r18.getWidth(), r5, null);
    L5:
        this.amLeftX = this.digitalTimeMinuteRightX - r18.getWidth();
        this.amTopY = r5;
        Bitmap r112 = ImageUtils.getBitmap(getResources().getAssets().open(r11 + this.DIGITAL_WEEK_DIR + "/4.png"));
        if (r15 == false) goto L8;
        r14.drawBitmap(r112, this.digitalTimeMinuteRightX - r112.getWidth(), r111, null);
    L8:
        this.digitalWeekLeftX = this.digitalTimeMinuteRightX - r112.getWidth();
        this.digitalWeekTopY = r111;
    }

    private final Pair<Bitmap, Float> addDigitalTimeParam(String r19, String r20, String r21, float r22, int r23, Canvas r24, float r25, boolean r26) {
        BaseDialCustomizeActivity r0 = this;
        float r5 = r25;
        Bitmap r6 = ImageUtils.getBitmap(r0.getResources().getAssets().open(r19 + r20 + "/symbol.png"));
        Bitmap r7 = ImageUtils.getBitmap(r0.getResources().getAssets().open(r19 + r20 + "/" + r21.charAt(0) + ".png"));
        float r12 = (float) 6;
        float r10 = (r22 + ((float) r23)) + r12;
        int r14 = 2;
        float r13 = ((float) ((r7.getHeight() - r6.getHeight()) / 2)) + r10;
        Paint r15 = null;
        if (StringsKt__StringsKt.iIi011O(r20, r0.DIGITAL_HOUR_MINUTE_DIR, false, 2, null) == false) goto L6;
        r0.digitalTimeHourLeftX = r5;
        r0.digitalTimeHourTopY = r10;
        r0.digitalTimeSymbolLeftX = (r7.getWidth() * 2) + r5;
        r0.digitalTimeSymbolTopY = r13;
        float r16 = ((r7.getWidth() * 2) + r5) + r6.getWidth();
        r0.digitalTimeMinuteLeftX = r16;
        r0.digitalTimeMinuteTopY = r10;
        r0.digitalTimeMinuteRightX = (r16 + (r7.getWidth() * 2)) - r12;
    L9:
        if (r0.screenReservedBoundary != 0) goto L24;
        int r8 = r21.length();
        int r17 = 0;
        int r18 = 0;
        int r110 = 0;
    L11:
        if (r17 >= r8) goto L33;
        if (r17 == r14) goto L14;
        if (r26 == false) goto L21;
        Bitmap r9 = ImageUtils.getBitmap(r0.getResources().getAssets().open(r19 + r20 + "/" + r21.charAt(r17) + ".png"));
        int r111 = r110;
        r24.drawBitmap(r9, (r25 + ((float) (r7.getWidth() * r18))) + ((float) r111), r10, null);
    L22:
        r18 = r18 + 1;
    L23:
        r17 = r17 + 1;
        r5 = r25;
        r8 = r8;
        r15 = null;
        r110 = r111;
        r14 = 2;
        goto L11
    L21:
        r111 = r110;
        goto L22
    L14:
        if (q62.OXO1.IiX() == false) goto L17;
        if (r26 == false) goto L18;
        r24.drawBitmap(r6, (r7.getWidth() * r18) + r5, r13, r15);
    L18:
        r111 = r6.getWidth();
        r8 = r8;
        goto L23
    L17:
        r24.drawBitmap(r6, (r7.getWidth() * r18) + r5, r13, r15);
    L33:
        return new Pair(r7, Float.valueOf(r10));
    L24:
        if (r26 == false) goto L33;
        int r11 = r21.length();
        int r27 = 0;
        int r28 = 0;
        int r112 = 0;
    L26:
        if (r27 >= r11) goto L33;
        if (r27 != 2) goto L30;
        r24.drawBitmap(r6, r25 + (r7.getWidth() * r112), r13, null);
        r28 = r6.getWidth();
    L31:
        r27 = r27 + 1;
        r0 = this;
        goto L26
    L30:
        r24.drawBitmap(ImageUtils.getBitmap(r0.getResources().getAssets().open(r19 + r20 + "/" + r21.charAt(r27) + FileUtils.FILE_EXTENSION_SEPARATOR + r0.fileFormat)), (r25 + (r7.getWidth() * r112)) + r28, r10, null);
        r112 = r112 + 1;
        goto L31
    L6:
        if (StringsKt__StringsKt.iIi011O(r20, r0.DIGITAL_DATE_DIR, false, 2, null) == false) goto L9;
        r0.digitalDateMonthLeftX = r5;
        r0.digitalDateMonthTopY = r10;
        r0.digitalDateSymbolLeftX = (r7.getWidth() * 2) + r5;
        r0.digitalDateSymbolTopY = r13;
        r0.digitalDateDayLeftX = ((r7.getWidth() * 2) + r5) + r6.getWidth();
        r0.digitalDateDayTopY = r10;
        goto L9
    }

    private final byte[] addTimeNumber(ArrayList<WatchFaceElement> r35, ArrayList<WatchFaceResourceDescriptor> r36, byte[] r37) {
        String r2 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR + "/";
        Triple r4 = getNumberBuffers707$default(this, r2, 0, 2, null);
        int r12 = ((Number) r4.getFirst()).intValue();
        int r13 = ((Number) r4.getSecond()).intValue();
        ArrayList r6 = (ArrayList) r4.getThird();
        r35.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.TIME_DIGIT.getValue(), ((ArrayList) r4.getThird()).size() + 1, r36.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) this.digitalTimeHourLeftX, (int) this.digitalTimeHourTopY, 0, null, null, new WatchFaceElement.TimeDigitData((byte) (WatchFaceEnumUtil.DigitFlag.TIME_DIGIT_FLAG_HOUR.getValue() | WatchFaceEnumUtil.DigitFlag.TIME_DIGIT_FLAG_MIN.getValue())), null, null, null, null, null, null, 129928, null));
        int r5 = r6.size();
        int r7 = 0;
        byte[] r3 = r37;
    L3:
        if (r7 >= r5) goto L5;
        int r19 = r7;
        r36.add(new WatchFaceResourceDescriptor((byte) 0, ((byte[]) ((Triple) r6.get(r7)).getThird()).length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r3.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(((Number) ((Triple) r6.get(r7)).getFirst()).intValue()), ((Number) ((Triple) r6.get(r7)).getFirst()).intValue(), ((Number) ((Triple) r6.get(r7)).getSecond()).intValue(), 0, r12, r13, null, 72, null), 1, null));
        r3 = ArraysKt___ArraysJvmKt.i1i(r3, (byte[]) ((Triple) r6.get(r19)).getThird());
        r7 = r19 + 1;
        goto L3
    L5:
        String r8 = r2 + "symbol." + this.fileFormat;
        InputStream r9 = getResources().getAssets().open(r8);
        Intrinsics.XXI(r9);     // Catch: Throwable -> L9
        byte[] r10 = ByteStreamsKt.X0O(r9);     // Catch: Throwable -> L9
        CloseableKt.OXO1(r9, null);
        Bitmap r11 = ImageUtils.getBitmap(getResources().getAssets().open(r8));
        int r14 = r11.getWidth();
        int r15 = r11.getHeight();
        File r16 = new File(PathUtils.getExternalAppDataPath(), r8);
        FileIOUtils.writeFileFromBytesByStream(r16, r10);
        Triple<Integer, Integer, byte[]> r17 = convertPng707(r16);
        r36.add(new WatchFaceResourceDescriptor((byte) 0, r17.getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r3.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r17.getFirst().intValue()), r17.getFirst().intValue(), r17.getSecond().intValue(), 0, r14, r15, null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(r3, r17.getThird());
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        CloseableKt.OXO1(r9, th);
        throw th;
    }

    private final byte[] addWeekNumber(ArrayList<WatchFaceElement> r31, ArrayList<WatchFaceResourceDescriptor> r32, byte[] r33) {
        Triple<Integer, Integer, ArrayList<Triple<Integer, Integer, byte[]>>> r1 = getNumberBuffers707(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_WEEK_DIR + "/", 6);
        int r8 = r1.getFirst().intValue();
        int r9 = r1.getSecond().intValue();
        r31.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.WEEKDAY_TEXT.getValue(), r1.getThird().size(), r32.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) this.digitalWeekLeftX, (int) this.digitalWeekTopY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        ArrayList<Triple<Integer, Integer, byte[]>> r2 = r1.getThird();
        int r3 = r2.size();
        byte[] r14 = r33;
        int r15 = 0;
    L3:
        if (r15 >= r3) goto L9;
        if (r15 != (r2.size() - 1)) goto L7;
        int r4 = 0;
    L8:
        r32.add(new WatchFaceResourceDescriptor((byte) 0, r2.get(r4).getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r14.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r2.get(r4).getFirst().intValue()), r2.get(r4).getFirst().intValue(), r2.get(r4).getSecond().intValue(), 0, r8, r9, null, 72, null), 1, null));
        r14 = ArraysKt___ArraysJvmKt.i1i(r14, r2.get(r4).getThird());
        r15 = r15 + 1;
        goto L3
    L7:
        r4 = r15 + 1;
        goto L8
    L9:
        return r14;
    }

    private static final void bgOnClick$lambda$0$0(I0OOX r0, BaseDialCustomizeActivity r1, View r2) {
        r0.dismiss();
        r1.selectImagePopup();
    }

    private static final void bgOnClick$lambda$1$0(DialBgFilePickerPopup r0, BaseDialCustomizeActivity r1, View r2) {
        r0.dismiss();
        r1.selectImagePopup();
    }

    private static final List colors_delegate$lambda$0(BaseDialCustomizeActivity r12) {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.shape_circle_0, r12.getResources().getColor(R.color.dial_customize_control_0), true), new ResourcesIdInfo(R.drawable.shape_circle_1, r12.getResources().getColor(R.color.dial_customize_control_1), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_2, r12.getResources().getColor(R.color.dial_customize_control_2), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_3, r12.getResources().getColor(R.color.dial_customize_control_3), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_4, r12.getResources().getColor(R.color.dial_customize_control_4), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_5, r12.getResources().getColor(R.color.dial_customize_control_5), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_6, r12.getResources().getColor(R.color.dial_customize_control_6), false, 4, null)});
    }

    private final void controlChangeStatus(DialElementView r2, ImageView r3) {
        if (r2.getVisibility() != 0) goto L6;
        r2.setVisibility(8);
        r3.setImageResource(R.drawable.dial_control_add);
        return;
    L6:
        r2.setVisibility(0);
        r3.setImageResource(R.drawable.dial_control_already_add);
    }

    private static final void controlOnClick$lambda$0$0(iOOOIi r0, View r1) {
        r0.dismiss();
    }

    private static final void controlOnClick$lambda$0$1(BaseDialCustomizeActivity r1, iOOOIi r2, View r3) {
        DialElementView r4 = r1.getControlViewStep();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewStep>(...)");
        r1.controlChangeStatus(r4, r2.II1Xi0());
    }

    private static final void controlOnClick$lambda$0$2(BaseDialCustomizeActivity r1, iOOOIi r2, View r3) {
        DialElementView r4 = r1.getControlViewHr();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewHr>(...)");
        r1.controlChangeStatus(r4, r2.i010I());
    }

    private static final void controlOnClick$lambda$0$3(BaseDialCustomizeActivity r1, iOOOIi r2, View r3) {
        DialElementView r4 = r1.getControlViewCa();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewCa>(...)");
        r1.controlChangeStatus(r4, r2.iX());
    }

    private static final void controlOnClick$lambda$0$4(BaseDialCustomizeActivity r1, iOOOIi r2, View r3) {
        DialElementView r4 = r1.getControlViewDis();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewDis>(...)");
        r1.controlChangeStatus(r4, r2.IXXOO());
    }

    private static final DialElementView controlViewCa_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewCa);
    }

    private static final DialElementView controlViewDis_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewDis);
    }

    private static final DialElementView controlViewHr_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewHr);
    }

    private static final DialElementView controlViewStep_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewStep);
    }

    private final byte[] convertPng(File r2, boolean r3, boolean r4) {
        return X1XX1O.XXiO0i.iO(r2, r3, r4);
    }

    public static /* synthetic */ byte[] convertPng$default(BaseDialCustomizeActivity r0, File r1, boolean r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = true;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = false;
    L10:
        return r0.convertPng(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertPng");
    }

    private final Triple<Integer, Integer, byte[]> convertPng707(File r6) {
        String r0 = r6.getPath() + ".bin";
        if (this.isJL707N == false) goto L5;
        int r1 = 8;
    L6:
        ConvertResult r7 = new BmpConvert().bitmapConvertAndCompressBlock(r1, r6.getPath(), r0);
        if (r7.getResult() > 0) goto L10;
        i1O0OXO1O.OXO1.OXO1("convertPng error = " + r7);
        return new Triple(0, 0, new byte[0]);
    L10:
        byte[] r2 = FileIOUtils.readFile2BytesByChannel(r0);
        int r3 = r2.length;
        X1XX1O.OXO1 r4 = X1XX1O.XXiO0i;
        byte[] r5 = new byte[(((r3 + r4.OIX0iXi()) - 1) / r4.OIX0iXi()) * r4.OIX0iXi()];
        System.arraycopy(r2, 0, r5, 0, r2.length);
        return new Triple(Integer.valueOf(r7.getPixelFormat()), Integer.valueOf(r7.getCompressMode()), r5);
    L5:
        r1 = 4;
        goto L6
    }

    private final void crcCountAndSend(WatchFaceHeader r7, ArrayList<WatchFaceElement> r8, ArrayList<WatchFaceResourceDescriptor> r9, byte[] r10) {
        byte[] r0 = r7.toByteArray();
        ArrayList r1 = new ArrayList();
        Iterator<T> r11 = r8.iterator();
    L4:
        if (r11.hasNext() == false) goto L6;
        OIXO1IIOO.XOO0XOOii(r1, ArraysKt___ArraysKt.O1XIOXO1i(((WatchFaceElement) r11.next()).toByteArray()));
        goto L4
    L6:
        byte[] r12 = CollectionsKt___CollectionsKt.XX0X0(r1);
        ArrayList r2 = new ArrayList();
        Iterator<T> r13 = r9.iterator();
    L8:
        if (r13.hasNext() == false) goto L10;
        OIXO1IIOO.XOO0XOOii(r2, ArraysKt___ArraysKt.O1XIOXO1i(((WatchFaceResourceDescriptor) r13.next()).toByteArray()));
        goto L8
    L10:
        byte[] r3 = ArraysKt___ArraysJvmKt.i1i(ArraysKt___ArraysJvmKt.i1i(ArraysKt___ArraysJvmKt.i1i(r0, r12), CollectionsKt___CollectionsKt.XX0X0(r2)), r10);
        int r14 = r3.length;
        int r15 = calculate(ArraysKt___ArraysJvmKt.I0IIOI(r3, 14, r3.length));
        r7.setSize(r14);
        r7.setCrc(r15);
        byte[] r16 = r7.toByteArray();
        System.arraycopy(r16, 0, r3, 0, r16.length);
        this.mCurSendBytes = r3;
        File r17 = new File(PathUtils.getExternalAppDataPath(), "dial.bin");
        FileIOUtils.writeFileFromBytesByStream(r17, r3);
        LogUtils.d(new Object[]{" customize dial bytes mFile = " + r17.getAbsolutePath()});
        BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.WATCH_FACE, r3, 0, 4, null);
    }

    private static final ImageViewRound customizeDialBg_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.customizeDialBg);
    }

    private static final List digitalTimes_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.digital_time_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_5, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_6, 0, false, 6, null)});
    }

    private final byte[] getBg() {
        Bitmap r0 = getBgBitmap$default(this, false, 0, 2, null);
        sz0 r1 = sz0.OXO1;
        ImageUtils.save(r0, uz0.XiOIii1(r1), Bitmap.CompressFormat.PNG);
        if (this.isSupportConvertPng == false) goto L9;
        byte[] r2 = convertPng$default(this, uz0.XiOIii1(r1), false, false, 4, null);
        if (r2 == null) goto L9;
        return r2;
    L9:
        return bitmap2Bytes(r0);
    }

    private final byte[] getBg707(ArrayList<WatchFaceElement> r24, ArrayList<WatchFaceResourceDescriptor> r25, byte[] r26) {
        Bitmap r2 = getBgBitmap$default(this, false, 0, 2, null);
        File r3 = new File(PathUtils.getExternalAppDataPath(), uz0.i010I);
        ImageUtils.save(r2, r3, Bitmap.CompressFormat.PNG);
        Triple<Integer, Integer, byte[]> r4 = convertPng707(r3);
        r24.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.IMAGE.getValue(), 1, r25.size(), (byte) 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
        r25.add(new WatchFaceResourceDescriptor((byte) 0, r4.getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r26.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r4.getFirst().intValue()), r4.getFirst().intValue(), r4.getSecond().intValue(), 0, this.screenWidth, this.screenHeight, null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(r26, r4.getThird());
    }

    private final Bitmap getBgBitmap(boolean r13, int r14) {
        if (this.isRound == false) goto L5;
        Bitmap r1 = ImageUtils.view2Bitmap(getCustomizeDialBg());
    L6:
        float r2 = this.screenWidth / r1.getWidth();
        float r3 = (this.screenHeight - this.screenReservedBoundary) / r1.getHeight();
        LogUtils.d(new Object[]{"test getBgBitmap = " + r1.getWidth() + "- " + r1.getHeight() + " ; " + r2 + " - " + r3 + " "});
        Bitmap r4 = ImageUtils.scale(r1, r2, r3);
        if (this.isRound == false) goto L10;
        Bitmap r5 = ImageUtils.toRound(r4, this.borderSize, getResources().getColor(r14));
    L9:
        Bitmap r10 = r5;
        if (this.isRound == true) goto L14;
        r2 = this.screenWidth / getCustomizeDialBg().getWidth();
        r3 = (this.screenHeight - this.screenReservedBoundary) / getCustomizeDialBg().getHeight();
    L14:
        float r6 = r2;
        float r7 = r3;
        Canvas r8 = new Canvas(r10);
        String r9 = this.STEP_DIR + "/step_0.png";
        DialElementView r11 = getControlViewStep();
        Intrinsics.O10IXXX0X(r11, "<get-controlViewStep>(...)");
        Pair<Float, Float> r12 = addControlBitmap(r9, r11, this.VALUE_DIR + "/" + this.valueColor + "/", "18564", r8, r6, r7, r13);
        float r15 = r12.component1().floatValue();
        float r16 = r12.component2().floatValue();
        this.stepValueCenterX = r15;
        this.stepValueCenterY = r16;
        String r17 = this.CALORIES_DIR + "/calories_0.png";
        DialElementView r18 = getControlViewCa();
        Intrinsics.O10IXXX0X(r18, "<get-controlViewCa>(...)");
        Pair<Float, Float> r19 = addControlBitmap(r17, r18, this.VALUE_DIR + "/" + this.valueColor + "/", "50", r8, r6, r7, r13);
        float r20 = r19.component1().floatValue();
        float r21 = r19.component2().floatValue();
        this.caloriesValueCenterX = r20;
        this.caloriesValueCenterY = r21;
        String r22 = this.DISTANCE_DIR + "/distance_0.png";
        DialElementView r23 = getControlViewDis();
        Intrinsics.O10IXXX0X(r23, "<get-controlViewDis>(...)");
        Pair<Float, Float> r24 = addControlBitmap(r22, r23, this.VALUE_DIR + "/" + this.valueColor + "/", "6", r8, r6, r7, r13);
        float r25 = r24.component1().floatValue();
        float r26 = r24.component2().floatValue();
        this.distanceValueCenterX = r25;
        this.distanceValueCenterY = r26;
        String r27 = this.HEART_RATE_DIR + "/heart_rate_0.png";
        DialElementView r28 = getControlViewHr();
        Intrinsics.O10IXXX0X(r28, "<get-controlViewHr>(...)");
        Pair<Float, Float> r29 = addControlBitmap(r27, r28, this.VALUE_DIR + "/" + this.valueColor + "/", "90", r8, r6, r7, r13);
        float r30 = r29.component1().floatValue();
        float r31 = r29.component2().floatValue();
        this.heartRateValueCenterX = r30;
        this.heartRateValueCenterY = r31;
        DialElementView r32 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(r32, "<get-timeDigitalView>(...)");
        if (r32.getVisibility() != 0) goto L17;
        addDigitalTime(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/", r6, r7, r8, r13);
        r8 = r8;
    L17:
        ImageView r33 = getTimeScaleView();
        Intrinsics.O10IXXX0X(r33, "<get-timeScaleView>(...)");
        if (r33.getVisibility() != 0) goto L20;
        ImageView r34 = getTimeScaleView();
        Intrinsics.O10IXXX0X(r34, "<get-timeScaleView>(...)");
        getPointerBg(r34, true, r8);
    L20:
        ImageView r35 = getTimePointView();
        Intrinsics.O10IXXX0X(r35, "<get-timePointView>(...)");
        if (r35.getVisibility() != 0) goto L24;
        ImageView r36 = getTimePointView();
        Intrinsics.O10IXXX0X(r36, "<get-timePointView>(...)");
        getPointerBg(r36, r13, r8);
    L24:
        if (r14 != R.color.dark) goto L27;
        Intrinsics.XXI(r10);
        return getFinalBgBitmap(r10);
    L27:
        Bitmap r37 = Bitmap.createBitmap(r10.getWidth(), r10.getHeight() + 1, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r37, "createBitmap(...)");
        new Canvas(r37).drawBitmap(r10, 0.0f, 0.0f, new Paint());
        return r37;
    L10:
        r5 = ImageUtils.toRoundCorner(r4, this.roundCornerRadius, 0.0f, getResources().getColor(r14));
        goto L9
    L5:
        Drawable r38 = getCustomizeDialBg().getDrawable();
        Intrinsics.O10IXXX0X(r38, "getDrawable(...)");
        r1 = DrawableKt.toBitmap$default(r38, 0, 0, null, 7, null);
        goto L6
    }

    public static /* synthetic */ Bitmap getBgBitmap$default(BaseDialCustomizeActivity r0, boolean r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = R.color.dark;
    L7:
        return r0.getBgBitmap(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBgBitmap");
    }

    private final void getControl(ArrayList<Element> r20) {
        Triple<Integer, Integer, ArrayList<byte[]>> r2 = getNumberBuffers(this.VALUE_DIR + "/" + this.valueColor + "/", this.controlValueRange);
        int r7 = r2.getFirst().intValue();
        int r8 = r2.getSecond().intValue();
        byte[][] r16 = (byte[][]) r2.getThird().toArray(new byte[0][]);
        DialElementView r3 = getControlViewStep();
        Intrinsics.O10IXXX0X(r3, "<get-controlViewStep>(...)");
        if (r3.getVisibility() != 0) goto L5;
        r20.add(new Element(14, 0, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.stepValueCenterX, (int) this.stepValueCenterY, 0, 0, 0, r16, 1794, null));
    L5:
        DialElementView r4 = getControlViewHr();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewHr>(...)");
        if (r4.getVisibility() != 0) goto L8;
        r20.add(new Element(15, 0, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.heartRateValueCenterX, (int) this.heartRateValueCenterY, 0, 0, 0, r16, 1794, null));
    L8:
        DialElementView r5 = getControlViewCa();
        Intrinsics.O10IXXX0X(r5, "<get-controlViewCa>(...)");
        if (r5.getVisibility() != 0) goto L11;
        r20.add(new Element(16, 0, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.caloriesValueCenterX, (int) this.caloriesValueCenterY, 0, 0, 0, r16, 1794, null));
    L11:
        DialElementView r6 = getControlViewDis();
        Intrinsics.O10IXXX0X(r6, "<get-controlViewDis>(...)");
        if (r6.getVisibility() != 0) goto L15;
        Element r9 = new Element(17, 0, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.distanceValueCenterX, (int) this.distanceValueCenterY, 0, 0, 0, r16, 1794, null);
        LogUtils.d(new Object[]{"test distanceValueCenterX=" + this.distanceValueCenterX + "  distanceValueCenterY=" + this.distanceValueCenterY});
        r20.add(r9);
        return;
    }

    private final void getControl2(ArrayList<Element> r20) {
        Triple<Integer, Integer, ArrayList<byte[]>> r2 = getNumberBuffers2(this.VALUE_DIR + "/" + this.valueColor + "/", this.controlValueRange);
        int r7 = r2.getFirst().intValue();
        int r8 = r2.getSecond().intValue();
        byte[][] r16 = (byte[][]) r2.getThird().toArray(new byte[0][]);
        DialElementView r3 = getControlViewStep();
        Intrinsics.O10IXXX0X(r3, "<get-controlViewStep>(...)");
        if (r3.getVisibility() != 0) goto L5;
        r20.add(new Element(14, 1, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.stepValueCenterX, (int) this.stepValueCenterY, 0, 0, 0, r16, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
    L5:
        DialElementView r4 = getControlViewHr();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewHr>(...)");
        if (r4.getVisibility() != 0) goto L8;
        r20.add(new Element(15, 1, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.heartRateValueCenterX, (int) this.heartRateValueCenterY, 0, 0, 0, r16, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
    L8:
        DialElementView r5 = getControlViewCa();
        Intrinsics.O10IXXX0X(r5, "<get-controlViewCa>(...)");
        if (r5.getVisibility() != 0) goto L11;
        r20.add(new Element(16, 1, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.caloriesValueCenterX, (int) this.caloriesValueCenterY, 0, 0, 0, r16, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
    L11:
        DialElementView r6 = getControlViewDis();
        Intrinsics.O10IXXX0X(r6, "<get-controlViewDis>(...)");
        if (r6.getVisibility() != 0) goto L15;
        Element r9 = new Element(17, 1, r7, r8, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.distanceValueCenterX, (int) this.distanceValueCenterY, 0, 0, 0, r16, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null);
        LogUtils.d(new Object[]{"test distanceValueCenterX=" + this.distanceValueCenterX + "  distanceValueCenterY=" + this.distanceValueCenterY});
        r20.add(r9);
        return;
    }

    private final byte[] getControl707(ArrayList<WatchFaceElement> r29, ArrayList<WatchFaceResourceDescriptor> r30, byte[] r31) {
        Triple<Integer, Integer, ArrayList<Triple<Integer, Integer, byte[]>>> r3 = getNumberBuffers707(this.VALUE_DIR + "/" + this.valueColor + "/", this.controlValueRange);
        ArrayList<Triple<Integer, Integer, byte[]>> r4 = r3.getThird();
        DialElementView r5 = getControlViewDis();
        Intrinsics.O10IXXX0X(r5, "<get-controlViewDis>(...)");
        if (r5.getVisibility() != 0) goto L7;
        r29.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.DISTANCE_DIGIT.getValue(), r3.getThird().size(), r30.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.distanceValueCenterX, (int) this.distanceValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        int r6 = r4.size();
        byte[] r7 = r31;
        int r8 = 0;
    L5:
        if (r8 >= r6) goto L8;
        r30.add(new WatchFaceResourceDescriptor((byte) 0, r4.get(r8).getThird().length, r7.length + (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r4.get(r8).getFirst().intValue()), r4.get(r8).getFirst().intValue(), r4.get(r8).getSecond().intValue(), 0, r3.getFirst().intValue(), r3.getSecond().intValue(), null, 72, null), 1, null));
        r7 = ArraysKt___ArraysJvmKt.i1i(r7, r4.get(r8).getThird());
        r8 = r8 + 1;
    L8:
        DialElementView r9 = getControlViewStep();
        Intrinsics.O10IXXX0X(r9, "<get-controlViewStep>(...)");
        if (r9.getVisibility() != 0) goto L13;
        r29.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.STEP_DIGIT.getValue(), r3.getThird().size() - 1, r30.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.stepValueCenterX, (int) this.stepValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        int r10 = r4.size() - 1;
        int r11 = 0;
    L11:
        if (r11 >= r10) goto L13;
        r30.add(new WatchFaceResourceDescriptor((byte) 0, r4.get(r11).getThird().length, r7.length + (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r4.get(r11).getFirst().intValue()), r4.get(r11).getFirst().intValue(), r4.get(r11).getSecond().intValue(), 0, r3.getFirst().intValue(), r3.getSecond().intValue(), null, 72, null), 1, null));
        r7 = ArraysKt___ArraysJvmKt.i1i(r7, r4.get(r11).getThird());
        r11 = r11 + 1;
    L13:
        DialElementView r12 = getControlViewCa();
        Intrinsics.O10IXXX0X(r12, "<get-controlViewCa>(...)");
        if (r12.getVisibility() != 0) goto L18;
        r29.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.CALORIE_DIGIT.getValue(), r3.getThird().size() - 1, r30.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.caloriesValueCenterX, (int) this.caloriesValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        int r13 = r4.size() - 1;
        int r14 = 0;
    L16:
        if (r14 >= r13) goto L18;
        r30.add(new WatchFaceResourceDescriptor((byte) 0, r4.get(r14).getThird().length, r7.length + (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r4.get(r14).getFirst().intValue()), r4.get(r14).getFirst().intValue(), r4.get(r14).getSecond().intValue(), 0, r3.getFirst().intValue(), r3.getSecond().intValue(), null, 72, null), 1, null));
        r7 = ArraysKt___ArraysJvmKt.i1i(r7, r4.get(r14).getThird());
        r14 = r14 + 1;
    L18:
        DialElementView r15 = getControlViewHr();
        Intrinsics.O10IXXX0X(r15, "<get-controlViewHr>(...)");
        if (r15.getVisibility() != 0) goto L25;
        r29.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.HR_DIGITAL.getValue(), r3.getThird().size(), r30.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.heartRateValueCenterX, (int) this.heartRateValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        int r1 = r4.size() - 1;
        int r16 = 0;
    L21:
        if (r16 >= r1) goto L23;
        r30.add(new WatchFaceResourceDescriptor((byte) 0, r4.get(r16).getThird().length, r7.length + (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r4.get(r16).getFirst().intValue()), r4.get(r16).getFirst().intValue(), r4.get(r16).getSecond().intValue(), 0, r3.getFirst().intValue(), r3.getSecond().intValue(), null, 72, null), 1, null));
        r7 = ArraysKt___ArraysJvmKt.i1i(r7, r4.get(r16).getThird());
        r16 = r16 + 1;
        goto L21
    L23:
        r30.add(new WatchFaceResourceDescriptor((byte) 0, r4.get(0).getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r7.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r4.get(0).getFirst().intValue()), r4.get(0).getFirst().intValue(), r4.get(0).getSecond().intValue(), 0, r3.getFirst().intValue(), r3.getSecond().intValue(), null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(r7, r4.get(0).getThird());
    L25:
        return r7;
    L7:
        r7 = r31;
        goto L8
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private final Triple<Integer, Integer, ArrayList<byte[]>> getNumberBuffers(String r14, int r15) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
        if (r15 < 0) goto L21;
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r1 != 0) goto L8;
        Bitmap r4 = ImageUtils.getBitmap(getResources().getAssets().open(r14 + r2 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat));
        int r7 = r4.getWidth();
        r3 = r4.getHeight();
    L9:
        InputStream r5 = getResources().getAssets().open(r14 + r2 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat);
        Intrinsics.XXI(r5);     // Catch: Throwable -> L15
        byte[] r6 = ByteStreamsKt.X0O(r5);     // Catch: Throwable -> L15
        CloseableKt.OXO1(r5, null);
        r0.add(X1iIIO.XIi00iiXO(this.fileFormat, r6, r7, 0, 0, false, 56, null));
        if (r2 == r15) goto L14;
        r2 = r2 + 1;
        r1 = r7;
        goto L6
    L14:
        r1 = r7;
    L23:
        return new Triple(Integer.valueOf(r1), Integer.valueOf(r3), r0);
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        CloseableKt.OXO1(r5, th);
        throw th;
    L8:
        r7 = r1;
        goto L9
    L21:
        r3 = 0;
        goto L23
    }

    public static /* synthetic */ Triple getNumberBuffers$default(BaseDialCustomizeActivity r0, String r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 9;
    L7:
        return r0.getNumberBuffers(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumberBuffers");
    }

    private final Triple<Integer, Integer, ArrayList<byte[]>> getNumberBuffers2(String r13, int r14) {
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        if (r14 < 0) goto L22;
        int r3 = 0;
        int r4 = 0;
    L5:
        String r6 = r13 + r2 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        if (r3 != 0) goto L8;
        Bitmap r5 = ImageUtils.getBitmap(getResources().getAssets().open(r6));
        int r7 = r5.getWidth();
        r4 = r5.getHeight();
        r3 = r7;
    L8:
        InputStream r8 = getResources().getAssets().open(r6);
        Intrinsics.XXI(r8);     // Catch: Throwable -> L16
        byte[] r9 = ByteStreamsKt.X0O(r8);     // Catch: Throwable -> L16
        CloseableKt.OXO1(r8, null);
        File r10 = new File(uz0.X11iII1O1(sz0.OXO1), r6);
        FileIOUtils.writeFileFromBytesByStream(r10, r9);
        byte[] r11 = convertPng$default(this, r10, false, false, 6, null);
        if (r11 == null) goto L13;
        r1.add(r11);
    L13:
        if (r2 == r14) goto L15;
        r2 = r2 + 1;
        goto L5
    L15:
        r2 = r3;
    L24:
        return new Triple(Integer.valueOf(r2), Integer.valueOf(r4), r1);
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        CloseableKt.OXO1(r8, th);
        throw th;
    L22:
        r4 = 0;
        goto L24
    }

    public static /* synthetic */ Triple getNumberBuffers2$default(BaseDialCustomizeActivity r0, String r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 9;
    L7:
        return r0.getNumberBuffers2(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumberBuffers2");
    }

    private final Triple<Integer, Integer, ArrayList<Triple<Integer, Integer, byte[]>>> getNumberBuffers707(String r10, int r11) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
        if (r11 < 0) goto L21;
        int r2 = 0;
        int r3 = 0;
    L5:
        String r4 = r10 + r1 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        if (r2 != 0) goto L8;
        Bitmap r5 = ImageUtils.getBitmap(getResources().getAssets().open(r4));
        int r6 = r5.getWidth();
        r3 = r5.getHeight();
        r2 = r6;
    L8:
        InputStream r7 = getResources().getAssets().open(r4);
        Intrinsics.XXI(r7);     // Catch: Throwable -> L16
        byte[] r8 = ByteStreamsKt.X0O(r7);     // Catch: Throwable -> L16
        CloseableKt.OXO1(r7, null);
        File r9 = new File(PathUtils.getExternalAppDataPath(), r4);
        FileIOUtils.writeFileFromBytesByStream(r9, r8);
        Triple<Integer, Integer, byte[]> r12 = convertPng707(r9);
        if (r12 == null) goto L13;
        r0.add(r12);
    L13:
        if (r1 == r11) goto L15;
        r1 = r1 + 1;
        goto L5
    L15:
        r1 = r2;
    L23:
        return new Triple(Integer.valueOf(r1), Integer.valueOf(r3), r0);
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        CloseableKt.OXO1(r7, th);
        throw th;
    L21:
        r3 = 0;
        goto L23
    }

    public static /* synthetic */ Triple getNumberBuffers707$default(BaseDialCustomizeActivity r0, String r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 9;
    L7:
        return r0.getNumberBuffers707(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumberBuffers707");
    }

    private final void getPointer(int r22, String r23, ArrayList<Element> r24) {
        ArrayList r2 = new ArrayList();
        Bitmap r3 = ImageUtils.getBitmap(getResources().getAssets().open(this.POINTER_DIR + "/" + r23 + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat));
        int r8 = r3.getWidth();
        int r4 = r3.getHeight();
        InputStream r5 = getResources().getAssets().open(this.POINTER_DIR + "/" + r23 + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat);
        Intrinsics.XXI(r5);     // Catch: Throwable -> L14
        byte[] r7 = ByteStreamsKt.X0O(r5);     // Catch: Throwable -> L14
        CloseableKt.OXO1(r5, null);
        r2.add(X1iIIO.XIi00iiXO(this.fileFormat, r7, r8, 0, 0, false, 56, null));
        int r12 = this.ignoreBlack;
        int r13 = (this.screenWidth / 2) - 1;
        int r14 = (this.screenHeight / 2) - 1;
        if (Intrinsics.XOO0ii0(this.fileFormat, "png") == false) goto L7;
        int r16 = 0;
    L9:
        if (Intrinsics.XOO0ii0(this.fileFormat, "png") == false) goto L11;
        int r17 = 0;
    L12:
        r24.add(new Element(r22, 0, r8, r4, 9, r12, r13, r14, 0, r16, r17, (byte[][]) r2.toArray(new byte[0][]), 258, null));
        return;
    L11:
        r17 = r8 / 2;
        goto L12
    L7:
        r16 = r4 / 2;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        CloseableKt.OXO1(r5, th);
        throw th;
    }

    private final void getPointer2(int r20, String r21, ArrayList<Element> r22) {
        String r1 = this.POINTER_DIR + "/" + r21 + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        ArrayList r2 = new ArrayList();
        Bitmap r3 = ImageUtils.getBitmap(getResources().getAssets().open(r1));
        int r4 = r3.getWidth();
        int r11 = (int) (r3.getHeight() * 0.6f);
        int[] r5 = new int[r3.getHeight() * r3.getWidth()];
        r3.getPixels(r5, 0, r3.getWidth(), 0, 0, r3.getWidth(), r3.getHeight());
        X1XX1O.OXO1 r6 = X1XX1O.XXiO0i;
        int r7 = ((((r4 * 3) + r6.OIX0iXi()) - 1) / r6.OIX0iXi()) * r6.OIX0iXi();
        int r8 = r7 * r11;
        byte[] r9 = new byte[r8];
        int r10 = 0;
    L3:
        if (r10 >= r11) goto L8;
        byte[] r12 = new byte[r7];
        int r13 = 0;
    L5:
        if (r13 >= r4) goto L7;
        int r14 = X1XX1O.XXiO0i.OXO1(r5[(r10 * r4) + r13]);
        int r15 = r13 * 3;
        r12[r15 + 2] = (byte) (r14 & 255);
        r12[r15 + 1] = (byte) ((r14 >> 8) & 255);
        r12[r15] = (byte) ((r14 >> 16) & 255);
        r13 = r13 + 1;
        goto L5
    L7:
        System.arraycopy(r12, 0, r9, r10 * r7, r7);
        r10 = r10 + 1;
        goto L3
    L8:
        LogUtils.d(new Object[]{"getPointer2 -> w=" + r4 + ", h=" + r11 + ", rowSize=" + r7 + ", data=" + r8});
        r2.add(r9);
        r22.add(new Element(r20, 1, r4, r11, 9, 1, this.screenWidth / 2, this.screenHeight / 2, 0, r11 - (r3.getHeight() / 2), r4 / 2, (byte[][]) r2.toArray(new byte[0][]), 256, null));
    }

    private final void getPointer3(int r25, String r26, ArrayList<Element> r27) {
        String r0 = this.POINTER_DIR + "/" + r26 + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        InputStream r2 = getResources().getAssets().open(r0);
        Intrinsics.XXI(r2);     // Catch: Throwable -> L9
        byte[] r3 = ByteStreamsKt.X0O(r2);     // Catch: Throwable -> L9
        CloseableKt.OXO1(r2, null);
        File r4 = new File(uz0.X11iII1O1(sz0.OXO1), r0);
        FileIOUtils.writeFileFromBytesByStream(r4, r3);
        ArrayList r1 = new ArrayList();
        Bitmap r8 = ImageUtils.getBitmap(r3, 0);
        int r12 = r8.getWidth();
        int r13 = r8.getHeight();
        byte[] r5 = convertPng$default(this, r4, false, true, 2, null);
        if (r5 == null) goto L7;
        r1.add(r5);
    L7:
        r27.add(new Element(r25, 1, r12, r13, 9, this.ignoreBlack, this.screenWidth / 2, this.screenHeight / 2, 0, r13 - (r8.getHeight() / 2), r12 / 2, (byte[][]) r1.toArray(new byte[0][]), 256, null));
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        CloseableKt.OXO1(r2, th);
        throw th;
    }

    private final byte[] getPointer707(byte r32, String r33, ArrayList<WatchFaceElement> r34, ArrayList<WatchFaceResourceDescriptor> r35, byte[] r36) {
        String r2 = this.POINTER_DIR + "/" + r33 + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        InputStream r3 = getResources().getAssets().open(r2);
        Intrinsics.XXI(r3);     // Catch: Throwable -> L6
        byte[] r4 = ByteStreamsKt.X0O(r3);     // Catch: Throwable -> L6
        CloseableKt.OXO1(r3, null);
        File r5 = new File(PathUtils.getExternalAppDataPath(), r2);
        FileIOUtils.writeFileFromBytesByStream(r5, r4);
        Bitmap r6 = ImageUtils.getBitmap(r4, 0);
        int r9 = r6.getWidth();
        int r10 = r6.getHeight();
        Triple<Integer, Integer, byte[]> r7 = convertPng707(r5);
        r34.add(new WatchFaceElement(r32, 1, r35.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), 0, 0, 0, null, new WatchFaceElement.PointerData(r9 / 2, r10 / 2), null, null, null, null, null, null, null, 130536, null));
        r35.add(new WatchFaceResourceDescriptor((byte) 0, r7.getThird().length, (((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32)) + r36.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r7.getFirst().intValue()), r7.getFirst().intValue(), r7.getSecond().intValue(), 0, r9, r10, null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(r36, r7.getThird());
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        CloseableKt.OXO1(r3, th);
        throw th;
    }

    private final void getPointerBg(ImageView r8, boolean r9, Canvas r10) {
        if (this.isRound == false) goto L5;
        Bitmap r0 = ImageUtils.view2Bitmap(r8);
    L6:
        int r1 = r8.getLeft();
        int r11 = r8.getTop();
        float r2 = this.screenWidth / (r0.getWidth() + (r1 * 2));
        float r3 = (this.screenHeight - this.screenReservedBoundary) / (r0.getHeight() + (r11 * 2));
        Bitmap r4 = ImageUtils.scale(r0, r2, r3);
        if (this.isRound == false) goto L9;
        Bitmap r5 = ImageUtils.toRound(r4, 0, 0);
    L10:
        if (r9 == false) goto L13;
        r10.drawBitmap(r5, r1 * r2, r11 * r3, null);
        return;
    L13:
        return;
    L9:
        r5 = ImageUtils.toRoundCorner(r4, this.roundCornerRadius);
        goto L10
    L5:
        Drawable r6 = r8.getDrawable();
        Intrinsics.O10IXXX0X(r6, "getDrawable(...)");
        r0 = DrawableKt.toBitmap$default(r6, 0, 0, null, 7, null);
        goto L6
    }

    private final byte[] getPreview(int r9) {
        Bitmap r0 = getBgBitmap$default(this, true, 0, 2, null);
        float r1 = this.screenPreviewWidth / r0.getWidth();
        Bitmap r2 = ImageUtils.scale(r0, r1, this.screenPreviewHeight / r0.getHeight());
        if (this.isRound == false) goto L5;
        Bitmap r10 = ImageUtils.toRound(r2, this.borderSize, getResources().getColor(r9));
    L6:
        sz0 r3 = sz0.OXO1;
        ImageUtils.save(r10, uz0.i010I(r3), Bitmap.CompressFormat.PNG);
        if (this.isSupportConvertPng == false) goto L12;
        byte[] r4 = convertPng$default(this, uz0.i010I(r3), false, false, 4, null);
        if (r4 == null) goto L12;
        return r4;
    L12:
        Intrinsics.XXI(r10);
        return bitmap2Bytes(r10);
    L5:
        r10 = ImageUtils.toRoundCorner(r2, this.roundCornerRadius * r1, this.borderSize, getResources().getColor(r9));
        goto L6
    }

    public static /* synthetic */ byte[] getPreview$default(BaseDialCustomizeActivity r0, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = R.color.dark;
    L7:
        return r0.getPreview(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreview");
    }

    private final byte[] getPreview707(ArrayList<WatchFaceElement> r23, ArrayList<WatchFaceResourceDescriptor> r24) {
        Bitmap r1 = getBgBitmap$default(this, true, 0, 2, null);
        float r2 = this.screenPreviewWidth / r1.getWidth();
        Bitmap r3 = ImageUtils.scale(r1, r2, this.screenPreviewHeight / r1.getHeight());
        if (this.isRound == false) goto L5;
        Bitmap r4 = ImageUtils.toRound(r3, this.borderSize, getResources().getColor(R.color.dark));
    L6:
        File r5 = new File(PathUtils.getExternalAppDataPath(), uz0.IXXOO);
        ImageUtils.save(r4, r5, Bitmap.CompressFormat.PNG);
        Triple<Integer, Integer, byte[]> r6 = convertPng707(r5);
        r23.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.PREVIEW.getValue(), 1, r24.size(), (byte) 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
        r24.add(new WatchFaceResourceDescriptor((byte) 0, r6.getThird().length, ((this.mElementsNumber * 64) + 64) + (this.mResourceDescNumber * 32), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(r6.getFirst().intValue()), r6.getFirst().intValue(), r6.getSecond().intValue(), 0, this.screenPreviewWidth, this.screenPreviewHeight, null, 72, null), 1, null));
        return r6.getThird();
    L5:
        r4 = ImageUtils.toRoundCorner(r3, this.roundCornerRadius * r2, this.borderSize, getResources().getColor(R.color.dark));
        goto L6
    }

    private final void getSymbol(String r23, int r24, int r25, int r26, ArrayList<Element> r27) {
        ArrayList r2 = new ArrayList();
        Bitmap r3 = ImageUtils.getBitmap(getResources().getAssets().open(r23 + "/symbol." + this.fileFormat));
        int r10 = r3.getWidth();
        int r4 = r3.getHeight();
        String r7 = this.fileFormat;
        InputStream r5 = getResources().getAssets().open(r23 + "/symbol." + this.fileFormat);
        Intrinsics.XXI(r5);     // Catch: Throwable -> L6
        byte[] r8 = ByteStreamsKt.X0O(r5);     // Catch: Throwable -> L6
        CloseableKt.OXO1(r5, null);
        r2.add(X1iIIO.XIi00iiXO(r7, r8, r10, 0, 0, false, 56, null));
        r27.add(new Element(r24, 0, r10, r4, 9, this.ignoreBlack, r25, r26, 0, 0, 0, (byte[][]) r2.toArray(new byte[0][]), 1794, null));
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        CloseableKt.OXO1(r5, th);
        throw th;
    }

    private final void getSymbol2(String r24, int r25, int r26, int r27, ArrayList<Element> r28) {
        String r0 = r24 + "/symbol." + this.fileFormat;
        ArrayList r7 = new ArrayList();
        Bitmap r2 = ImageUtils.getBitmap(getResources().getAssets().open(r0));
        int r11 = r2.getWidth();
        int r12 = r2.getHeight();
        InputStream r3 = getResources().getAssets().open(r0);
        Intrinsics.XXI(r3);     // Catch: Throwable -> L9
        byte[] r4 = ByteStreamsKt.X0O(r3);     // Catch: Throwable -> L9
        CloseableKt.OXO1(r3, null);
        File r5 = new File(uz0.X11iII1O1(sz0.OXO1), r0);
        FileIOUtils.writeFileFromBytesByStream(r5, r4);
        byte[] r1 = convertPng$default(this, r5, false, false, 6, null);
        if (r1 == null) goto L7;
        r7.add(r1);
    L7:
        r28.add(new Element(r25, 1, r11, r12, 9, this.ignoreBlack, r26, r27, 0, 0, 0, (byte[][]) r7.toArray(new byte[0][]), SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        CloseableKt.OXO1(r3, th);
        throw th;
    }

    private final void getTimeDigital(ArrayList<Element> r27) {
        ArrayList r0 = new ArrayList();
        Bitmap r2 = ImageUtils.getBitmap(getResources().getAssets().open(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat));
        int r12 = r2.getWidth();
        int r3 = r2.getHeight();
        InputStream r4 = getResources().getAssets().open(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat);
        Intrinsics.XXI(r4);     // Catch: Throwable -> L20
        byte[] r11 = ByteStreamsKt.X0O(r4);     // Catch: Throwable -> L20
        CloseableKt.OXO1(r4, null);
        InputStream r5 = getResources().getAssets().open(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/pm." + this.fileFormat);
        Intrinsics.XXI(r5);     // Catch: Throwable -> L14
        byte[] r6 = ByteStreamsKt.X0O(r5);     // Catch: Throwable -> L14
        CloseableKt.OXO1(r5, null);
        r0.add(X1iIIO.XIi00iiXO(this.fileFormat, r11, r12, 0, 0, false, 56, null));
        r0.add(X1iIIO.XIi00iiXO(this.fileFormat, r6, r12, 0, 0, false, 56, null));
        r27.add(new Element(12, 0, r12, r3, 9, this.ignoreBlack, (int) this.amLeftX, (int) this.amTopY, 0, 0, 0, (byte[][]) r0.toArray(new byte[0][]), 1794, null));
        Triple r1 = getNumberBuffers$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR + "/", 0, 2, null);
        int r14 = ((Number) r1.getFirst()).intValue();
        int r15 = ((Number) r1.getSecond()).intValue();
        byte[][] r23 = (byte[][]) ((Collection) r1.getThird()).toArray(new byte[0][]);
        r27.add(new Element(9, 0, r14, r15, 9, this.ignoreBlack, (int) this.digitalTimeHourLeftX, (int) this.digitalTimeHourTopY, 0, 0, 0, r23, 1794, null));
        r27.add(new Element(10, 0, r14, r15, 9, this.ignoreBlack, (int) this.digitalTimeMinuteLeftX, (int) this.digitalTimeMinuteTopY, 0, 0, 0, r23, 1794, null));
        if (this.screenReservedBoundary == 0) goto L9;
        getSymbol(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR, 20, (int) this.digitalTimeSymbolLeftX, (int) this.digitalTimeSymbolTopY, r27);
    L9:
        Triple r7 = getNumberBuffers$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR + "/", 0, 2, null);
        int r13 = ((Number) r7.getFirst()).intValue();
        int r16 = ((Number) r7.getSecond()).intValue();
        byte[][] r22 = (byte[][]) ((Collection) r7.getThird()).toArray(new byte[0][]);
        r27.add(new Element(7, 0, r13, r16, 9, this.ignoreBlack, (int) this.digitalDateMonthLeftX, (int) this.digitalDateMonthTopY, 0, 0, 0, r22, 1794, null));
        r27.add(new Element(8, 0, r13, r16, 9, this.ignoreBlack, (int) this.digitalDateDayLeftX, (int) this.digitalDateDayTopY, 0, 0, 0, r22, 1794, null));
        if (this.screenReservedBoundary == 0) goto L12;
        getSymbol(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR, 21, (int) this.digitalDateSymbolLeftX, (int) this.digitalDateSymbolTopY, r27);
    L12:
        Triple<Integer, Integer, ArrayList<byte[]>> r8 = getNumberBuffers(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_WEEK_DIR + "/", 6);
        r27.add(new Element(13, 0, r8.getFirst().intValue(), r8.getSecond().intValue(), 9, this.ignoreBlack, (int) this.digitalWeekLeftX, (int) this.digitalWeekTopY, 0, 0, 0, (byte[][]) r8.getThird().toArray(new byte[0][]), 1794, null));
        return;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        CloseableKt.OXO1(r5, th);
        throw th;
    L20:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        CloseableKt.OXO1(r4, th);
        throw th;
    }

    private final void getTimeDigital2(ArrayList<Element> r27) {
        String r2 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat;
        String r3 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/pm." + this.fileFormat;
        ArrayList r8 = new ArrayList();
        Bitmap r4 = ImageUtils.getBitmap(getResources().getAssets().open(r2));
        int r12 = r4.getWidth();
        int r13 = r4.getHeight();
        InputStream r5 = getResources().getAssets().open(r2);
        Intrinsics.XXI(r5);     // Catch: Throwable -> L27
        byte[] r6 = ByteStreamsKt.X0O(r5);     // Catch: Throwable -> L27
        CloseableKt.OXO1(r5, null);
        InputStream r7 = getResources().getAssets().open(r3);
        Intrinsics.XXI(r7);     // Catch: Throwable -> L21
        byte[] r9 = ByteStreamsKt.X0O(r7);     // Catch: Throwable -> L21
        CloseableKt.OXO1(r7, null);
        sz0 r10 = sz0.OXO1;
        File r11 = new File(uz0.X11iII1O1(r10), r2);
        FileIOUtils.writeFileFromBytesByStream(r11, r6);
        File r14 = new File(uz0.X11iII1O1(r10), r3);
        FileIOUtils.writeFileFromBytesByStream(r14, r9);
        byte[] r15 = convertPng$default(this, r11, false, false, 6, null);
        if (r15 == null) goto L9;
        r8.add(r15);
    L9:
        byte[] r16 = convertPng$default(this, r14, false, false, 6, null);
        if (r16 == null) goto L12;
        r8.add(r16);
    L12:
        r27.add(new Element(12, 1, r12, r13, 9, this.ignoreBlack, (int) this.amLeftX, (int) this.amTopY, 0, 0, 0, (byte[][]) r8.toArray(new byte[0][]), SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        Triple r17 = getNumberBuffers2$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR + "/", 0, 2, null);
        int r18 = ((Number) r17.getFirst()).intValue();
        int r19 = ((Number) r17.getSecond()).intValue();
        byte[][] r22 = (byte[][]) ((Collection) r17.getThird()).toArray(new byte[0][]);
        r27.add(new Element(9, 1, r18, r19, 9, this.ignoreBlack, (int) this.digitalTimeHourLeftX, (int) this.digitalTimeHourTopY, 0, 0, 0, r22, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        r27.add(new Element(10, 1, r18, r19, 9, this.ignoreBlack, (int) this.digitalTimeMinuteLeftX, (int) this.digitalTimeMinuteTopY, 0, 0, 0, r22, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        if (this.screenReservedBoundary == 0) goto L15;
        ArrayList<Element> r20 = r27;
        int r0 = 0;
        getSymbol2(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR, 20, (int) this.digitalTimeSymbolLeftX, (int) this.digitalTimeSymbolTopY, r20);
    L16:
        Triple r21 = getNumberBuffers2$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR + "/", r0, 2, null);
        int r110 = ((Number) r21.getFirst()).intValue();
        int r111 = ((Number) r21.getSecond()).intValue();
        byte[][] r23 = (byte[][]) ((Collection) r21.getThird()).toArray(new byte[r0][]);
        r20.add(new Element(7, 1, r110, r111, 9, this.ignoreBlack, (int) this.digitalDateMonthLeftX, (int) this.digitalDateMonthTopY, 0, 0, 0, r23, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        r20.add(new Element(8, 1, r110, r111, 9, this.ignoreBlack, (int) this.digitalDateDayLeftX, (int) this.digitalDateDayTopY, 0, 0, 0, r23, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        if (this.screenReservedBoundary == 0) goto L19;
        getSymbol2(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR, 21, (int) this.digitalDateSymbolLeftX, (int) this.digitalDateSymbolTopY, r20);
    L19:
        Triple<Integer, Integer, ArrayList<byte[]>> r24 = getNumberBuffers2(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_WEEK_DIR + "/", 6);
        r20.add(new Element(13, 1, r24.getFirst().intValue(), r24.getSecond().intValue(), 9, this.ignoreBlack, (int) this.digitalWeekLeftX, (int) this.digitalWeekTopY, 0, 0, 0, (byte[][]) r24.getThird().toArray(new byte[r0][]), SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        return;
    L15:
        r20 = r27;
        r0 = 0;
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        CloseableKt.OXO1(r7, th);
        throw th;
    L27:
        th = move-exception;
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        CloseableKt.OXO1(r5, th);
        throw th;
    }

    private final byte[] getTimeDigital707(ArrayList<WatchFaceElement> r1, ArrayList<WatchFaceResourceDescriptor> r2, byte[] r3) {
        return addDateDigit(r1, r2, addTimeNumber(r1, r2, addAmPmNumber(r1, r2, addWeekNumber(r1, r2, r3))));
    }

    private final byte[] getTransparentBitmapByteArray() {
        Bitmap r0 = getBgBitmap(true, R.color.transparent);
        Bitmap r1 = ImageUtils.scale(r0, this.screenPreviewWidth / r0.getWidth(), this.screenPreviewHeight / r0.getHeight());
        if (this.isRound == false) goto L5;
        Bitmap r2 = ImageUtils.toRound(r1, this.borderSize, getResources().getColor(R.color.transparent));
    L6:
        ByteArrayOutputStream r3 = new ByteArrayOutputStream();
        r2.compress(Bitmap.CompressFormat.PNG, 100, r3);
        byte[] r4 = r3.toByteArray();
        Intrinsics.O10IXXX0X(r4, "toByteArray(...)");
        return r4;
    L5:
        r2 = ImageUtils.toRoundCorner(r1, 30.0f, this.borderSize, getResources().getColor(R.color.transparent));
        goto L6
    }

    public static /* synthetic */ i1Ii1i11X i010I(BaseDialCustomizeActivity r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    public static /* synthetic */ List iI(BaseDialCustomizeActivity r0) {
        return colors_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iIXi1iiXI(BaseDialCustomizeActivity r0) {
        return timePointView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iIiiO(BaseDialCustomizeActivity r0, iOOOIi r1, View r2) {
        controlOnClick$lambda$0$1(r0, r1, r2);
    }

    public static /* synthetic */ ImageView iOO1ii1(BaseDialCustomizeActivity r0) {
        return timeScaleView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOOX010X(BaseDialCustomizeActivity r0, View r1) {
        numberOnClick$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ List iX() {
        return pointers_delegate$lambda$0();
    }

    public static /* synthetic */ void iX1O1(BaseDialCustomizeActivity r0, iOOOIi r1, View r2) {
        controlOnClick$lambda$0$2(r0, r1, r2);
    }

    public static /* synthetic */ void iXiX011(DialPointerPopup r0, View r1) {
        pointerOnClick$lambda$0$0(r0, r1);
    }

    private static final Unit initView$lambda$0(BaseDialCustomizeActivity r1, Uri r2) {
        Intrinsics.X0O(r2, "it");
        r1.toCropPic(r2);
        return Unit.OXO1;
    }

    private static final void initView$lambda$1(final BaseDialCustomizeActivity r2, View r3) {
        X0IOiX1O.XIi00iiXO(false, new O1XIOiX0(r2), 1, null);
    }

    private static final Unit initView$lambda$1$0(BaseDialCustomizeActivity r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        r3.disableOrientation();
        if (q62.OXO1.i01() == false) goto L11;
        DialPickerPopup r5 = r3.dialPickerPopup;
        if (r5 != null) goto L7;
    L10:
        DialPickerPopup r6 = new DialPickerPopup(r3, r3.mDialIds, 0, new iO(r3));
        r3.dialPickerPopup = r6;
        View r7 = r3.getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r6.I1XOi1(r7);
    L13:
        return Unit.OXO1;
    L7:
        if (r5.isShowing() != true) goto L10;
        return Unit.OXO1;
    L11:
        r3.mCurSyncDevicePosition = 0;
        r3.mCurSyncDialId = 10000000;
        r3.syncDial();
        goto L13
    }

    private static final void initView$lambda$2(BaseDialCustomizeActivity r0) {
        r0.showDragTip();
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(BaseDialCustomizeActivity r3) {
        return new i1Ii1i11X(r3.getMContext(), new O00(r3));
    }

    private static final NestedScrollView nestedScrollView_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (NestedScrollView) r1.findViewById(R.id.nestedScrollView);
    }

    private final void newSendStream() {
        ArrayList<WatchFaceElement> r3 = new ArrayList();
        ArrayList<WatchFaceResourceDescriptor> r4 = new ArrayList();
        ImageView r1 = getTimePointView();
        Intrinsics.O10IXXX0X(r1, "<get-timePointView>(...)");
        int r5 = 3;
        if (r1.getVisibility() != 0) goto L5;
        int r2 = 3;
    L6:
        ImageView r7 = getTimePointView();
        Intrinsics.O10IXXX0X(r7, "<get-timePointView>(...)");
        if (r7.getVisibility() == 0) goto L10;
        r5 = 0;
    L10:
        DialElementView r8 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(r8, "<get-timeDigitalView>(...)");
        if (r8.getVisibility() != 0) goto L13;
        int r9 = 4;
    L14:
        DialElementView r10 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(r10, "<get-timeDigitalView>(...)");
        if (r10.getVisibility() != 0) goto L17;
        int r11 = 31;
    L18:
        DialElementView r12 = getControlViewStep();
        Intrinsics.O10IXXX0X(r12, "<get-controlViewStep>(...)");
        if (r12.getVisibility() != 0) goto L21;
        int r13 = 1;
    L22:
        DialElementView r14 = getControlViewStep();
        Intrinsics.O10IXXX0X(r14, "<get-controlViewStep>(...)");
        if (r14.getVisibility() != 0) goto L25;
        int r15 = 10;
    L26:
        DialElementView r16 = getControlViewHr();
        Intrinsics.O10IXXX0X(r16, "<get-controlViewHr>(...)");
        if (r16.getVisibility() != 0) goto L29;
        int r17 = 1;
    L30:
        DialElementView r18 = getControlViewHr();
        Intrinsics.O10IXXX0X(r18, "<get-controlViewHr>(...)");
        if (r18.getVisibility() != 0) goto L33;
        int r19 = 11;
    L34:
        DialElementView r110 = getControlViewCa();
        int r20 = r9;
        Intrinsics.O10IXXX0X(r110, "<get-controlViewCa>(...)");
        if (r110.getVisibility() != 0) goto L38;
        int r111 = 1;
    L37:
        int r21 = r2;
        DialElementView r6 = getControlViewCa();
        Intrinsics.O10IXXX0X(r6, "<get-controlViewCa>(...)");
        if (r6.getVisibility() != 0) goto L42;
        int r112 = 10;
    L43:
        DialElementView r22 = getControlViewDis();
        int r23 = r11;
        Intrinsics.O10IXXX0X(r22, "<get-controlViewDis>(...)");
        if (r22.getVisibility() != 0) goto L46;
        int r113 = 1;
    L47:
        DialElementView r24 = getControlViewDis();
        Intrinsics.O10IXXX0X(r24, "<get-controlViewDis>(...)");
        if (r24.getVisibility() != 0) goto L50;
        int r114 = 11;
    L51:
        this.mElementsNumber = (((((r21 + 2) + r20) + r13) + r17) + r111) + r113;
        this.mResourceDescNumber = (((((r5 + 2) + r23) + r15) + r19) + r112) + r114;
        byte[] r25 = getBg707(r3, r4, getPreview707(r3, r4));
        ImageView r26 = getTimePointView();
        Intrinsics.O10IXXX0X(r26, "<get-timePointView>(...)");
        if (r26.getVisibility() != 0) goto L54;
        r25 = getPointer707(WatchFaceEnumUtil.ElementType.POINTER_S.getValue(), this.POINTER_SECOND, r3, r4, getPointer707(WatchFaceEnumUtil.ElementType.POINTER_M.getValue(), this.POINTER_MINUTE, r3, r4, getPointer707(WatchFaceEnumUtil.ElementType.POINTER_H.getValue(), this.POINTER_HOUR, r3, r4, r25)));
    L54:
        DialElementView r27 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(r27, "<get-timeDigitalView>(...)");
        if (r27.getVisibility() != 0) goto L57;
        r25 = getTimeDigital707(r3, r4, r25);
    L57:
        DialElementView r28 = getControlViewStep();
        Intrinsics.O10IXXX0X(r28, "<get-controlViewStep>(...)");
        if (r28.getVisibility() == 0) goto L68;
        DialElementView r29 = getControlViewHr();
        Intrinsics.O10IXXX0X(r29, "<get-controlViewHr>(...)");
        if (r29.getVisibility() == 0) goto L68;
        DialElementView r30 = getControlViewCa();
        Intrinsics.O10IXXX0X(r30, "<get-controlViewCa>(...)");
        if (r30.getVisibility() == 0) goto L68;
        DialElementView r31 = getControlViewDis();
        Intrinsics.O10IXXX0X(r31, "<get-controlViewDis>(...)");
        if (r31.getVisibility() == 0) goto L68;
    L70:
        if (this.isJL707N == false) goto L73;
        WatchFaceEnumUtil.McuPlatform r32 = WatchFaceEnumUtil.McuPlatform.JL707N;
    L74:
        crcCountAndSend(new WatchFaceHeader(null, this.mCurSyncDialId, 0, 0, r32.getValue(), this.mElementsNumber, this.mResourceDescNumber, 0, 0, 0, null, 1933, null), r3, r4, r25);
        return;
    L73:
        r32 = WatchFaceEnumUtil.McuPlatform.JL701N;
    L68:
        r25 = getControl707(r3, r4, r25);
        goto L70
    L50:
        r114 = 0;
        goto L51
    L46:
        r113 = 0;
        goto L47
    L42:
        r112 = 0;
        goto L43
    L38:
        r111 = 0;
        goto L37
    L33:
        r19 = 0;
        goto L34
    L29:
        r17 = 0;
        goto L30
    L25:
        r15 = 0;
        goto L26
    L21:
        r13 = 0;
        goto L22
    L17:
        r11 = 0;
        goto L18
    L13:
        r9 = 0;
        goto L14
    L5:
        r2 = 0;
        goto L6
    }

    private static final void numberOnClick$lambda$0$0(X001XXXX r0, View r1) {
        r0.dismiss();
    }

    private static final void numberOnClick$lambda$0$1(BaseDialCustomizeActivity r1, View r2) {
        r1.getTimeDigitalView().setVisibility(0);
        r1.getTimePointView().setVisibility(8);
        r1.getTimeScaleView().setVisibility(8);
    }

    private final void oldSendStream() {
        ArrayList<Element> r1 = new ArrayList();
        if (this.isSupportConvertPng == false) goto L13;
        r1.add(new Element(1, 0, this.screenPreviewWidth, this.screenPreviewHeight, 0, this.ignoreBlack, 0, 0, 0, 0, 0, new byte[][]{getPreview$default(this, 0, 1, null)}, 1794, null));
        r1.add(new Element(2, 0, this.screenWidth, this.screenHeight + 1, 9, this.ignoreBlack, 0, 0, 0, 0, 0, new byte[][]{getBg()}, 1794, null));
        getControl2(r1);
        DialElementView r2 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(r2, "<get-timeDigitalView>(...)");
        if (r2.getVisibility() != 0) goto L7;
        getTimeDigital2(r1);
    L7:
        ImageView r3 = getTimePointView();
        Intrinsics.O10IXXX0X(r3, "<get-timePointView>(...)");
        if (r3.getVisibility() == 0) goto L10;
    L19:
        c72 r4 = this.mProgressPop;
        if (r4 == null) goto L22;
        r4.I1(R.string.dial_generated_sync);
    L22:
        Iterator<Element> r5 = r1.iterator();
        Intrinsics.O10IXXX0X(r5, "iterator(...)");
    L24:
        if (r5.hasNext() == false) goto L26;
        Element r6 = r5.next();
        Intrinsics.O10IXXX0X(r6, "next(...)");
        LogUtils.d(new Object[]{"customize dial length: " + (((double) ((((byte[]) ArraysKt___ArraysKt.IO0(r6.getImageBuffers())).length * 10) / 1024)) / 10.0d) + " KB"});
        goto L24
    L26:
        byte[] r7 = WatchFaceBuilder.INSTANCE.build((Element[]) r1.toArray(new Element[0]), this.imageFormat);
        this.mCurSendBytes = r7;
        sz0 r8 = sz0.OXO1;
        File r9 = uz0.i010I(r8);
        File r10 = uz0.X11iII1O1(r8);
        BleCache r11 = BleCache.INSTANCE;
        com.blankj.utilcode.util.FileUtils.copy(r9, new File(r10, r11.getMPrototype() + IiXI1X1OO.O00 + r11.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + ".png"));
        int r12 = this.mCurSyncDevicePosition;
        int r13 = r7.length;
        StringBuilder r14 = new StringBuilder();
        r14.append(r12);
        r14.append(" customize dial bytes size  ");
        r14.append(r13);
        LogUtils.d(new Object[]{r14.toString()});
        BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, r7, this.mCurSyncDevicePosition);
        return;
    L10:
        if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L12;
        getPointer2(3, this.POINTER_HOUR, r1);
        getPointer2(4, this.POINTER_MINUTE, r1);
        getPointer2(5, this.POINTER_SECOND, r1);
        goto L19
    L12:
        getPointer3(3, this.POINTER_HOUR, r1);
        getPointer3(4, this.POINTER_MINUTE, r1);
        getPointer3(5, this.POINTER_SECOND, r1);
        goto L19
    L13:
        r1.add(new Element(1, 0, this.screenPreviewWidth, this.screenPreviewHeight, this.X_CENTER | this.Y_CENTER, 0, this.screenWidth / 2, (this.screenHeight / 2) + 2, 0, 0, 0, new byte[][]{getPreview$default(this, 0, 1, null)}, 1826, null));
        byte[] r15 = getBg();
        int r16 = this.screenWidth;
        int r17 = this.screenHeight;
        r1.add(new Element(2, 0, r16, r17, this.X_CENTER | this.Y_CENTER, 0, r16 / 2, r17 / 2, 0, 0, 0, new byte[][]{r15}, 1826, null));
        getControl(r1);
        DialElementView r18 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(r18, "<get-timeDigitalView>(...)");
        if (r18.getVisibility() != 0) goto L16;
        getTimeDigital(r1);
    L16:
        ImageView r19 = getTimePointView();
        Intrinsics.O10IXXX0X(r19, "<get-timePointView>(...)");
        if (r19.getVisibility() != 0) goto L19;
        getPointer(3, this.POINTER_HOUR, r1);
        getPointer(4, this.POINTER_MINUTE, r1);
        getPointer(5, this.POINTER_SECOND, r1);
        goto L19
    }

    private static final void pointerOnClick$lambda$0$0(DialPointerPopup r0, View r1) {
        r0.dismiss();
    }

    private static final List pointers_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_point_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_5, 0, false, 6, null)});
    }

    private static final View rootView_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final Button saveDial_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (Button) r1.findViewById(R.id.saveDial);
    }

    private final void saveRecord() {
        if (this.mCurSendBytes != null) goto L5;
        return;
    L5:
        String r0 = BleCache.INSTANCE.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + IiXI1X1OO.O00 + System.currentTimeMillis();
        if (TextUtils.isEmpty(this.mAiBgFile) == false) goto L8;
        String r1 = this.paramName + this.is2DAcceleration + r0;
    L9:
        sz0 r2 = sz0.OXO1;
        FileIOUtils.writeFileFromBytesByStream(new File(uz0.XXX11i(r2), r1 + ".png"), getTransparentBitmapByteArray());
        FileIOUtils.writeFileFromBytesByStream(new File(uz0.XXX11i(r2), r1), this.mCurSendBytes);
        I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
        return;
    L8:
        r1 = this.paramName + "/AI/" + r0;
        goto L9
    }

    private final void selectImagePopup() {
        if (this.mSelectAvatarPopup != null) goto L5;
        xz3 r0 = new xz3(this);
        r0.iX(new iI0OO1O(this));
        r0.i010I(new IXO101O11(this));
        this.mSelectAvatarPopup = r0;
    L5:
        xz3 r1 = this.mSelectAvatarPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final Unit selectImagePopup$lambda$0$0(final BaseDialCustomizeActivity r3) {
        hr1.OXO1.iOOX010X(r3.getMContext(), new I0I0OX1(r3));
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$0$0(BaseDialCustomizeActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().iO();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$1(BaseDialCustomizeActivity r0) {
        r0.getMCrop().OIX0iXi();
        return Unit.OXO1;
    }

    private final void showDragTip() {
        PopupWindow r0 = this.mDragPopup;
        if (r0 != null) goto L5;
    L7:
        View r1 = LayoutInflater.from(this).inflate(R.layout.layout_bubble, null);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout");
        BubbleLayout r2 = (BubbleLayout) r1;
        r2.measure(0, 0);
        ((TextView) r2.findViewById(R.id.tv)).setText(R.string.custom_dial_drag_tip);
        r2.requestLayout();
        this.mDragPopup = XXiOOOX.OXO1(getMContext(), r2);
        r2.O00(ArrowDirection.BOTTOM);
        PopupWindow r3 = this.mDragPopup;
        Intrinsics.XXI(r3);
        r3.setOutsideTouchable(true);
        PopupWindow r4 = this.mDragPopup;
        Intrinsics.XXI(r4);
        r4.setWidth(getCustomizeDialBg().getMeasuredWidth() - SizeUtils.dp2px(20.0f));
        int r5 = SizeUtils.dp2px(10.0f);
        int r6 = ((-getCustomizeDialBg().getMeasuredHeight()) / 2) - r2.getMeasuredHeight();
        PopupWindow r7 = this.mDragPopup;
        Intrinsics.XXI(r7);
        r2.XOO0ii0((r7.getWidth() - r2.getArrowWidth()) / 2.0f);
        PopupWindow r8 = this.mDragPopup;
        Intrinsics.XXI(r8);
        r8.showAsDropDown(getCustomizeDialBg(), r5, r6);
        return;
    L5:
        if (r0.isShowing() != true) goto L7;
    }

    private final void syncDial() {
        if (this.mProgressPop != null) goto L10;
        int r3 = 0;
        c72 r0 = new c72(this, r3, 2, null);
        r0.I1(R.string.dial_generated_start);
        r0.OX(0);
        this.mProgressPop = r0;
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r0.I1XOi1(r1);
        if (q62.OXO1.IiX() == false) goto L8;
        newSendStream();
        return;
    L8:
        oldSendStream();
        return;
    }

    private final void syncFailed(int r2) {
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.mProgressPop = null;
        ToastUtils.showLong(OOX00.OXO1.iO(r2), new Object[0]);
    }

    public static /* synthetic */ void syncFailed$default(BaseDialCustomizeActivity r0, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        r0.syncFailed(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncFailed");
    }

    private static final DialElementView timeDigitalView_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (DialElementView) r1.findViewById(R.id.timeDigitalView);
    }

    private static final ImageView timePointView_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (ImageView) r1.findViewById(R.id.timePointView);
    }

    private static final ImageView timeScaleView_delegate$lambda$0(BaseDialCustomizeActivity r1) {
        return (ImageView) r1.findViewById(R.id.timeScaleView);
    }

    private final void toCropPic(Uri r11) {
        int r0 = this.screenWidth;
        int r1 = this.screenHeight;
        if (r0 >= 320) goto L5;
        r0 = r0 * 2;
        r1 = r1 * 2;
    L5:
        int r8 = r0;
        int r9 = r1;
        i1O0OXO1O.OXO1.OXO1("toCropPic outputX:" + r8 + " outputY:" + r9 + " " + r11);
        getMCrop().O00(r11, 1.0d, ((double) r8) / ((double) r9), r8, r9);
    }

    public final void bgOnClick(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        if (TextUtils.isEmpty(this.mAiBgFile) == true) goto L5;
        SPUtils r7 = a01.OXO1.XO0O10();
        String r1 = uz0.XOO0ii0(sz0.OXO1).getPath();
        Intrinsics.O10IXXX0X(r1, "getPath(...)");
        JsonArray r8 = JsonParser.parseString(r7.getString(r1)).getAsJsonArray();     // Catch: Exception -> L17
        Intrinsics.XXI(r8);     // Catch: Exception -> L17
        List r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));     // Catch: Exception -> L17
        Iterator<JsonElement> r9 = r8.iterator();     // Catch: Exception -> L17
    L14:
        if (r9.hasNext() == false) goto L19;
        JsonElement r3 = r9.next();     // Catch: Exception -> L17
        r2.add(new Gson().fromJson(r3, String.class));     // Catch: Exception -> L17
    L19:
        if (this.mBgFilePickerPopup != null) goto L21;
        final DialBgFilePickerPopup r10 = new DialBgFilePickerPopup(this, r2, new OXO1(this, r2));
        r10.OiIIX101O().setOnClickListener(new X1X01I(r10, this));
        this.mBgFilePickerPopup = r10;
    L21:
        DialBgFilePickerPopup r11 = this.mBgFilePickerPopup;
        if (r11 == null) goto L30;
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r11.I1XOi1(r4);
        return;
    L30:
        return;
    L17:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L19
    L5:
        if (this.mBgPopup != null) goto L7;
        final I0OOX r12 = new I0OOX(this);
        r12.X01IiOiIi().setOnClickListener(new I1iO0IO(r12, this));
        customizeDialBgItemClick(r12);
        this.mBgPopup = r12;
    L7:
        I0OOX r13 = this.mBgPopup;
        if (r13 == null) goto L29;
        View r5 = getRootView();
        Intrinsics.O10IXXX0X(r5, "<get-rootView>(...)");
        r13.I1XOi1(r5);
        return;
    }

    @aa1
    public byte[] bitmap2Bytes(@aa1 Bitmap r2) {
        Intrinsics.X0O(r2, "finalBgBitMap");
        byte[] r3 = ImageUtils.bitmap2Bytes(r2);
        Intrinsics.O10IXXX0X(r3, "bitmap2Bytes(...)");
        return r3;
    }

    public final int calculate(@aa1 byte[] r10) {
        Intrinsics.X0O(r10, "bytes");
        int r0 = r10.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L21;
        byte r4 = r10[r2];
        int r5 = 0;
    L6:
        if (r5 >= 8) goto L19;
        boolean r7 = true;
        if (((r4 >> (7 - r5)) & 1) != 1) goto L10;
        boolean r6 = true;
    L12:
        if (((r3 >> 15) & 1) == 1) goto L15;
        r7 = false;
    L15:
        r3 = r3 << 1;
        if ((r6 ^ r7) == false) goto L18;
        r3 = r3 ^ 4129;
    L18:
        r5 = r5 + 1;
        goto L6
    L10:
        r6 = false;
        goto L12
    L19:
        r2 = r2 + 1;
        goto L3
    L21:
        return 65535 & r3;
    }

    public final void controlOnClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mControlPopup != null) goto L5;
        final iOOOIi r4 = new iOOOIi(this, getColors(), new XIi00iiXO(this));
        r4.OII().setOnClickListener(new i0IOXOX(r4));
        r4.OX().setOnClickListener(new OOOiO1X11(this, r4));
        r4.I1().setOnClickListener(new iI01XIO(this, r4));
        r4.iOOX010X().setOnClickListener(new XX0Ii010(this, r4));
        r4.X01IiOiIi().setOnClickListener(new XI1I0O(this, r4));
        this.mControlPopup = r4;
    L5:
        iOOOIi r5 = this.mControlPopup;
        if (r5 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }

    public abstract void customizeDialBgItemClick(@aa1 I0OOX r1);

    @aa1
    public abstract Object customizeDir();

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final float getAmLeftX() {
        return this.amLeftX;
    }

    public final float getAmTopY() {
        return this.amTopY;
    }

    @tb1
    public final String getBgFile() {
        return this.bgFile;
    }

    public final int getBorderSize() {
        return this.borderSize;
    }

    public final float getCaloriesValueCenterX() {
        return this.caloriesValueCenterX;
    }

    public final float getCaloriesValueCenterY() {
        return this.caloriesValueCenterY;
    }

    @aa1
    public final List<ResourcesIdInfo> getColors() {
        return (List) getValue();
    }

    public final int getControlValueInterval() {
        return this.controlValueInterval;
    }

    public final int getControlValueRange() {
        return this.controlValueRange;
    }

    public final DialElementView getControlViewCa() {
        return (DialElementView) getValue();
    }

    public final DialElementView getControlViewDis() {
        return (DialElementView) getValue();
    }

    public final DialElementView getControlViewHr() {
        return (DialElementView) getValue();
    }

    public final DialElementView getControlViewStep() {
        return (DialElementView) getValue();
    }

    public final ImageViewRound getCustomizeDialBg() {
        return (ImageViewRound) getValue();
    }

    @aa1
    public final String getDIGITAL_AM_DIR() {
        return this.DIGITAL_AM_DIR;
    }

    @aa1
    public final String getDIGITAL_DATE_DIR() {
        return this.DIGITAL_DATE_DIR;
    }

    @aa1
    public final String getDIGITAL_HOUR_MINUTE_DIR() {
        return this.DIGITAL_HOUR_MINUTE_DIR;
    }

    @aa1
    public final String getDIGITAL_WEEK_DIR() {
        return this.DIGITAL_WEEK_DIR;
    }

    public final float getDigitalDateDayLeftX() {
        return this.digitalDateDayLeftX;
    }

    public final float getDigitalDateDayTopY() {
        return this.digitalDateDayTopY;
    }

    public final float getDigitalDateMonthLeftX() {
        return this.digitalDateMonthLeftX;
    }

    public final float getDigitalDateMonthTopY() {
        return this.digitalDateMonthTopY;
    }

    public final float getDigitalDateSymbolLeftX() {
        return this.digitalDateSymbolLeftX;
    }

    public final float getDigitalDateSymbolTopY() {
        return this.digitalDateSymbolTopY;
    }

    public final float getDigitalTimeHourLeftX() {
        return this.digitalTimeHourLeftX;
    }

    public final float getDigitalTimeHourTopY() {
        return this.digitalTimeHourTopY;
    }

    public final float getDigitalTimeMinuteLeftX() {
        return this.digitalTimeMinuteLeftX;
    }

    public final float getDigitalTimeMinuteRightX() {
        return this.digitalTimeMinuteRightX;
    }

    public final float getDigitalTimeMinuteTopY() {
        return this.digitalTimeMinuteTopY;
    }

    public final float getDigitalTimeSymbolLeftX() {
        return this.digitalTimeSymbolLeftX;
    }

    public final float getDigitalTimeSymbolTopY() {
        return this.digitalTimeSymbolTopY;
    }

    @aa1
    public final List<ResourcesIdInfo> getDigitalTimes() {
        return (List) getValue();
    }

    public final int getDigitalValueColor() {
        return this.digitalValueColor;
    }

    public final float getDigitalWeekLeftX() {
        return this.digitalWeekLeftX;
    }

    public final float getDigitalWeekTopY() {
        return this.digitalWeekTopY;
    }

    public final float getDistanceValueCenterX() {
        return this.distanceValueCenterX;
    }

    public final float getDistanceValueCenterY() {
        return this.distanceValueCenterY;
    }

    @aa1
    public final String getFileFormat() {
        return this.fileFormat;
    }

    @aa1
    public abstract Bitmap getFinalBgBitmap(@aa1 Bitmap r1);

    public final float getHeartRateValueCenterX() {
        return this.heartRateValueCenterX;
    }

    public final float getHeartRateValueCenterY() {
        return this.heartRateValueCenterY;
    }

    public final int getIgnoreBlack() {
        return this.ignoreBlack;
    }

    public final int getImageFormat() {
        return this.imageFormat;
    }

    @tb1
    public final byte[] getMCurSendBytes() {
        return this.mCurSendBytes;
    }

    public final int getMElementsNumber() {
        return this.mElementsNumber;
    }

    public final int getMResourceDescNumber() {
        return this.mResourceDescNumber;
    }

    public final NestedScrollView getNestedScrollView() {
        return (NestedScrollView) getValue();
    }

    @aa1
    public final String getPOINTER_HOUR() {
        return this.POINTER_HOUR;
    }

    @aa1
    public final String getPOINTER_MINUTE() {
        return this.POINTER_MINUTE;
    }

    @aa1
    public final String getPOINTER_SECOND() {
        return this.POINTER_SECOND;
    }

    @aa1
    public final String getParamName() {
        return this.paramName;
    }

    public final int getPointerSelectNumber() {
        return this.pointerSelectNumber;
    }

    @aa1
    public List<ResourcesIdInfo> getPointers() {
        return (List) getValue();
    }

    public final View getRootView() {
        return (View) getValue();
    }

    public final float getRoundCornerRadius() {
        return this.roundCornerRadius;
    }

    public final Button getSaveDial() {
        return (Button) getValue();
    }

    public final int getScaleSelectNumber() {
        return this.scaleSelectNumber;
    }

    @aa1
    public final List<ResourcesIdInfo> getScales() {
        return this.scales;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenPreviewHeight() {
        return this.screenPreviewHeight;
    }

    public final int getScreenPreviewWidth() {
        return this.screenPreviewWidth;
    }

    public final int getScreenReservedBoundary() {
        return this.screenReservedBoundary;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final float getStepValueCenterX() {
        return this.stepValueCenterX;
    }

    public final float getStepValueCenterY() {
        return this.stepValueCenterY;
    }

    public final DialElementView getTimeDigitalView() {
        return (DialElementView) getValue();
    }

    public final ImageView getTimePointView() {
        return (ImageView) getValue();
    }

    public final ImageView getTimeScaleView() {
        return (ImageView) getValue();
    }

    public final int getValueColor() {
        return this.valueColor;
    }

    public final int getX_CENTER() {
        return this.X_CENTER;
    }

    public final int getY_CENTER() {
        return this.Y_CENTER;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r9) {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.addHandleCallback(this.mBleHandleCallback);
        LogUtils.d(new Object[]{"BaseDialCustomizeActivity -> init -> " + LibExKt.X0O(this)});
        if (q62.OXO1.i01() == false) goto L6;
        BaseBleConnector.sendData$default(r0, BleKey.WATCHFACE_ID, BleKeyFlag.READ, null, false, false, 28, null);
        return;
    }

    public void initView() {
        getAbhTitleCenter().setText(R.string.dial_customize);
        getMCrop().XXI(this, new IIIOXOI0(this));
        DialElementView r0 = getControlViewStep();
        NestedScrollView r1 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r1, "<get-nestedScrollView>(...)");
        r0.setScrollView(r1);
        DialElementView r2 = getControlViewHr();
        NestedScrollView r3 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r3, "<get-nestedScrollView>(...)");
        r2.setScrollView(r3);
        DialElementView r4 = getControlViewCa();
        NestedScrollView r5 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r5, "<get-nestedScrollView>(...)");
        r4.setScrollView(r5);
        DialElementView r6 = getControlViewDis();
        NestedScrollView r7 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r7, "<get-nestedScrollView>(...)");
        r6.setScrollView(r7);
        DialElementView r8 = getTimeDigitalView();
        NestedScrollView r9 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r9, "<get-nestedScrollView>(...)");
        r8.setScrollView(r9);
        getControlViewStep().setIsRangeCircle(this.isRound);
        getControlViewHr().setIsRangeCircle(this.isRound);
        getControlViewCa().setIsRangeCircle(this.isRound);
        getControlViewDis().setIsRangeCircle(this.isRound);
        getTimeDigitalView().setIsRangeCircle(this.isRound);
        getSaveDial().setOnClickListener(new O10OOOXX(this));
        String r10 = getIntent().getStringExtra("bgFile");
        this.mAiBgFile = r10;
        if (r10 == null) goto L6;
        Uri r11 = Uri.fromFile(new File(this.mAiBgFile));
        Intrinsics.O10IXXX0X(r11, "fromFile(...)");
        toCropPic(r11);
    L6:
        if (q62.OXO1.O0X() == false) goto L9;
        new Handler().postDelayed(new XIOi0O0i0(this), 500);
        return;
    }

    @aa1
    public final String is2DAcceleration() {
        return this.is2DAcceleration;
    }

    public final boolean isJL707N() {
        return this.isJL707N;
    }

    public final boolean isRound() {
        return this.isRound;
    }

    public final boolean isSupportConvertPng() {
        return this.isSupportConvertPng;
    }

    public final void numberOnClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mDigitalPopup != null) goto L5;
        final X001XXXX r4 = new X001XXXX(this, getColors(), new IiI10X(this));
        r4.OII().setOnClickListener(new IX01Oi(r4));
        r4.OX().setOnClickListener(new iX10O(this));
        this.mDigitalPopup = r4;
    L5:
        X001XXXX r5 = this.mDigitalPopup;
        if (r5 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r13, int r14, @tb1 Intent r15) {
        super.onActivityResult(r13, r14, r15);
        if (r15 == null) goto L5;
        Uri r0 = r15.getData();
    L6:
        LogUtils.d(new Object[]{"onActivityResult " + r13 + " " + r14 + " " + r0});
        int r1 = this.screenWidth;
        int r2 = this.screenHeight;
        if (r1 >= 320) goto L9;
        r1 = r1 * 2;
        r2 = r2 * 2;
    L9:
        int r10 = r1;
        int r11 = r2;
        LogUtils.d(new Object[]{"onActivityResult outputX:" + r10 + " outputY:" + r11});
        getMCrop().XOO0ii0(r13, r14, r15, 1.0d, ((double) r10) / ((double) r11), r10, r11);
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.mProgressPop == null) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mProgressPop == null) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }

    public void pointerOnClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mPointerPopup != null) goto L5;
        final DialPointerPopup r5 = new DialPointerPopup(this, getPointers(), this.scales, new XOO0ii0(this));
        r5.OiIIX101O().setOnClickListener(new IOIiO1(r5));
        this.mPointerPopup = r5;
    L5:
        DialPointerPopup r6 = this.mPointerPopup;
        if (r6 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    @aa1
    public abstract List<ResourcesIdInfo> scalesList();

    public final void setAmLeftX(float r1) {
        this.amLeftX = r1;
    }

    public final void setAmTopY(float r1) {
        this.amTopY = r1;
    }

    public final void setBgFile(@tb1 String r1) {
        this.bgFile = r1;
    }

    public final void setBorderSize(int r1) {
        this.borderSize = r1;
    }

    public final void setCaloriesValueCenterX(float r1) {
        this.caloriesValueCenterX = r1;
    }

    public final void setCaloriesValueCenterY(float r1) {
        this.caloriesValueCenterY = r1;
    }

    public final void setControlValueInterval(int r1) {
        this.controlValueInterval = r1;
    }

    public final void setControlValueRange(int r1) {
        this.controlValueRange = r1;
    }

    public final void setDigitalDateDayLeftX(float r1) {
        this.digitalDateDayLeftX = r1;
    }

    public final void setDigitalDateDayTopY(float r1) {
        this.digitalDateDayTopY = r1;
    }

    public final void setDigitalDateMonthLeftX(float r1) {
        this.digitalDateMonthLeftX = r1;
    }

    public final void setDigitalDateMonthTopY(float r1) {
        this.digitalDateMonthTopY = r1;
    }

    public final void setDigitalDateSymbolLeftX(float r1) {
        this.digitalDateSymbolLeftX = r1;
    }

    public final void setDigitalDateSymbolTopY(float r1) {
        this.digitalDateSymbolTopY = r1;
    }

    public final void setDigitalTimeHourLeftX(float r1) {
        this.digitalTimeHourLeftX = r1;
    }

    public final void setDigitalTimeHourTopY(float r1) {
        this.digitalTimeHourTopY = r1;
    }

    public final void setDigitalTimeMinuteLeftX(float r1) {
        this.digitalTimeMinuteLeftX = r1;
    }

    public final void setDigitalTimeMinuteRightX(float r1) {
        this.digitalTimeMinuteRightX = r1;
    }

    public final void setDigitalTimeMinuteTopY(float r1) {
        this.digitalTimeMinuteTopY = r1;
    }

    public final void setDigitalTimeSymbolLeftX(float r1) {
        this.digitalTimeSymbolLeftX = r1;
    }

    public final void setDigitalTimeSymbolTopY(float r1) {
        this.digitalTimeSymbolTopY = r1;
    }

    public final void setDigitalValueColor(int r1) {
        this.digitalValueColor = r1;
    }

    public final void setDigitalWeekLeftX(float r1) {
        this.digitalWeekLeftX = r1;
    }

    public final void setDigitalWeekTopY(float r1) {
        this.digitalWeekTopY = r1;
    }

    public final void setDistanceValueCenterX(float r1) {
        this.distanceValueCenterX = r1;
    }

    public final void setDistanceValueCenterY(float r1) {
        this.distanceValueCenterY = r1;
    }

    public final void setFileFormat(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileFormat = r2;
    }

    public final void setHeartRateValueCenterX(float r1) {
        this.heartRateValueCenterX = r1;
    }

    public final void setHeartRateValueCenterY(float r1) {
        this.heartRateValueCenterY = r1;
    }

    public final void setIgnoreBlack(int r1) {
        this.ignoreBlack = r1;
    }

    public final void setImageFormat(int r1) {
        this.imageFormat = r1;
    }

    public final void setMCurSendBytes(@tb1 byte[] r1) {
        this.mCurSendBytes = r1;
    }

    public final void setMElementsNumber(int r1) {
        this.mElementsNumber = r1;
    }

    public final void setMResourceDescNumber(int r1) {
        this.mResourceDescNumber = r1;
    }

    public final void setPointerSelectNumber(int r1) {
        this.pointerSelectNumber = r1;
    }

    public final void setRound(boolean r1) {
        this.isRound = r1;
    }

    public final void setRoundCornerRadius(float r1) {
        this.roundCornerRadius = r1;
    }

    public final void setScaleSelectNumber(int r1) {
        this.scaleSelectNumber = r1;
    }

    public final void setScreenHeight(int r1) {
        this.screenHeight = r1;
    }

    public final void setScreenPreviewHeight(int r1) {
        this.screenPreviewHeight = r1;
    }

    public final void setScreenPreviewWidth(int r1) {
        this.screenPreviewWidth = r1;
    }

    public final void setScreenReservedBoundary(int r1) {
        this.screenReservedBoundary = r1;
    }

    public final void setScreenWidth(int r1) {
        this.screenWidth = r1;
    }

    public final void setStepValueCenterX(float r1) {
        this.stepValueCenterX = r1;
    }

    public final void setStepValueCenterY(float r1) {
        this.stepValueCenterY = r1;
    }

    public final void setSupportConvertPng(boolean r1) {
        this.isSupportConvertPng = r1;
    }

    public final void setValueColor(int r1) {
        this.valueColor = r1;
    }

    public final void setX_CENTER(int r1) {
        this.X_CENTER = r1;
    }

    public final void setY_CENTER(int r1) {
        this.Y_CENTER = r1;
    }
}
