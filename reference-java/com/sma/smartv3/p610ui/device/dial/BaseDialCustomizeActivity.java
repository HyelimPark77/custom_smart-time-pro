package com.sma.smartv3.p610ui.device.dial;

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
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0OOX;
import com.android.mltcode.paycertificationapi.II01IOiX;
import com.android.mltcode.paycertificationapi.IO0I100XX;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.X001XXXX;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X11iXOOOi;
import com.android.mltcode.paycertificationapi.X1XX1O;
import com.android.mltcode.paycertificationapi.X1iIIO;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOOOIi;
import com.android.mltcode.paycertificationapi.iXiIO0i;
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
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.jieli.bmp_convert.BmpConvert;
import com.jieli.bmp_convert.ConvertResult;
import com.realsil.sdk.dfu.image.constants.SubBinId;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.dial.BaseDialCustomizeActivity;
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
import java.io.IOException;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p617io.ByteStreamsKt;
import kotlin.p617io.CloseableKt;
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
        public IiI10X() {
        }

        @Override // com.android.mltcode.paycertificationapi.II01IOiX
        public /* bridge */ /* synthetic */ void OXO1(Integer num) {
            XIi00iiXO(num.intValue());
        }

        public void XIi00iiXO(int i) {
            BaseDialCustomizeActivity.this.getTimeDigitalView().setVisibility(0);
            BaseDialCustomizeActivity.this.getTimePointView().setVisibility(8);
            BaseDialCustomizeActivity.this.getTimeScaleView().setVisibility(8);
            BaseDialCustomizeActivity.this.getTimeDigitalView().setImageRes(BaseDialCustomizeActivity.this.getDigitalTimes().get(i).getResId());
            X001XXXX x001xxxx = BaseDialCustomizeActivity.this.mDigitalPopup;
            if (x001xxxx != null) {
                x001xxxx.i010I(BaseDialCustomizeActivity.this.getColors().get(i).getSecondaryId());
            }
            BaseDialCustomizeActivity.this.setDigitalValueColor(i);
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
            xz3 xz3Var = BaseDialCustomizeActivity.this.mSelectAvatarPopup;
            if (xz3Var != null) {
                xz3Var.dismiss();
            }
            sz0 sz0Var = sz0.OXO1;
            if (uz0.XiOIii1(sz0Var).exists()) {
                Bitmap bitmap = ImageUtils.getBitmap(uz0.XiOIii1(sz0Var));
                BaseDialCustomizeActivity.this.getCustomizeDialBg().setImageBitmap(BaseDialCustomizeActivity.this.isRound() ? ImageUtils.toRound(bitmap) : ImageUtils.toRoundCorner(bitmap, BaseDialCustomizeActivity.this.getRoundCornerRadius()));
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    public static final class OXO1 implements X11iXOOOi {
        public final /* synthetic */ List<String> XIi00iiXO;

        public OXO1(List<String> list) {
            this.XIi00iiXO = list;
        }

        @Override // com.android.mltcode.paycertificationapi.X11iXOOOi
        public void OXO1(int i) throws IOException {
            BaseDialCustomizeActivity baseDialCustomizeActivity = BaseDialCustomizeActivity.this;
            Uri uriFromFile = Uri.fromFile(new File(this.XIi00iiXO.get(i)));
            Intrinsics.O10IXXX0X(uriFromFile, "fromFile(...)");
            baseDialCustomizeActivity.toCropPic(uriFromFile);
        }
    }

    public static final class XIi00iiXO implements II01IOiX<Integer> {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.II01IOiX
        public /* bridge */ /* synthetic */ void OXO1(Integer num) {
            XIi00iiXO(num.intValue());
        }

        public void XIi00iiXO(int i) {
            BaseDialCustomizeActivity.this.getControlViewStep().setTextColor(BaseDialCustomizeActivity.this.getColors().get(i).getSecondaryId());
            BaseDialCustomizeActivity.this.getControlViewHr().setTextColor(BaseDialCustomizeActivity.this.getColors().get(i).getSecondaryId());
            BaseDialCustomizeActivity.this.getControlViewCa().setTextColor(BaseDialCustomizeActivity.this.getColors().get(i).getSecondaryId());
            BaseDialCustomizeActivity.this.getControlViewDis().setTextColor(BaseDialCustomizeActivity.this.getColors().get(i).getSecondaryId());
            BaseDialCustomizeActivity.this.setValueColor(i);
        }
    }

    @SourceDebugExtension({"SMAP\nBaseDialCustomizeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialCustomizeActivity.kt\ncom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2570:1\n1869#2,2:2571\n*S KotlinDebug\n*F\n+ 1 BaseDialCustomizeActivity.kt\ncom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$mBleHandleCallback$1\n*L\n339#1:2571,2\n*E\n"})
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
                BaseDialCustomizeActivity.syncFailed$default(BaseDialCustomizeActivity.this, 0, 1, null);
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
            BaseDialCustomizeActivity.this.mDialIds.clear();
            List<Integer> mIdList = watchFaceId.getMIdList();
            BaseDialCustomizeActivity baseDialCustomizeActivity = BaseDialCustomizeActivity.this;
            Iterator<T> it = mIdList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue <= 0) {
                    baseDialCustomizeActivity.mDialIds.add(0);
                } else {
                    baseDialCustomizeActivity.mDialIds.add(Integer.valueOf(iIntValue));
                }
            }
            LogUtils.m11128d("mDialIds -> " + BaseDialCustomizeActivity.this.mDialIds);
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
            BaseDialCustomizeActivity.syncFailed$default(BaseDialCustomizeActivity.this, 0, 1, null);
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
                BaseDialCustomizeActivity.this.syncFailed(i);
                return;
            }
            c72 c72Var = BaseDialCustomizeActivity.this.mProgressPop;
            if (c72Var != null) {
                c72Var.m1592OX((int) ((i3 / i2) * 100));
            }
            if (i2 == i3) {
                c72 c72Var2 = BaseDialCustomizeActivity.this.mProgressPop;
                if (c72Var2 != null) {
                    c72Var2.dismiss();
                }
                BaseDialCustomizeActivity.this.mProgressPop = null;
                ToastUtils.showLong(R.string.dial_sync_done);
                BaseDialCustomizeActivity.this.mDialIds.set(BaseDialCustomizeActivity.this.mCurSyncDevicePosition, Integer.valueOf(BaseDialCustomizeActivity.this.mCurSyncDialId));
                a01.OXO1.XIi00iiXO().put("syncId", 0);
                BaseDialCustomizeActivity.this.saveRecord();
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
        public void onWatchFaceIdUpdate(boolean z) throws IOException {
            BaseDialCustomizeActivity.this.syncDial();
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

    public static final class XOO0ii0 implements IO0I100XX<Integer> {
        public XOO0ii0() {
        }

        @Override // com.android.mltcode.paycertificationapi.IO0I100XX
        public /* bridge */ /* synthetic */ void OXO1(Integer num) {
            m38438iO(num.intValue());
        }

        @Override // com.android.mltcode.paycertificationapi.IO0I100XX
        public /* bridge */ /* synthetic */ void XIi00iiXO(Integer num) {
            XO0O10(num.intValue());
        }

        public void XO0O10(int i) {
            BaseDialCustomizeActivity.this.getTimeDigitalView().setVisibility(8);
            BaseDialCustomizeActivity.this.getTimeScaleView().setVisibility(0);
            BaseDialCustomizeActivity.this.getTimeScaleView().setImageResource(BaseDialCustomizeActivity.this.getScales().get(i).getResId());
            BaseDialCustomizeActivity.this.setScaleSelectNumber(i);
        }

        /* JADX INFO: renamed from: iO */
        public void m38438iO(int i) {
            BaseDialCustomizeActivity.this.getTimeDigitalView().setVisibility(8);
            BaseDialCustomizeActivity.this.getTimePointView().setVisibility(0);
            BaseDialCustomizeActivity.this.getTimePointView().setImageResource(BaseDialCustomizeActivity.this.getPointers().get(i).getResId());
            BaseDialCustomizeActivity.this.setPointerSelectNumber(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.BaseDialCustomizeActivity$iO */
    public static final class C18797iO implements iXiIO0i {
        public C18797iO() {
        }

        @Override // com.android.mltcode.paycertificationapi.iXiIO0i
        public void OXO1(int i) {
            BaseDialCustomizeActivity.this.mCurSyncDevicePosition = i;
            BaseDialCustomizeActivity baseDialCustomizeActivity = BaseDialCustomizeActivity.this;
            baseDialCustomizeActivity.mCurSyncDialId = baseDialCustomizeActivity.mCurSyncDevicePosition + 10000000;
            BaseBleConnector.sendInt32$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.UPDATE, BaseDialCustomizeActivity.this.mCurSyncDialId, null, false, false, 56, null);
        }
    }

    public BaseDialCustomizeActivity() {
        BleCache bleCache = BleCache.INSTANCE;
        this.isJL707N = Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707);
        this.rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0O0OOi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.rootView_delegate$lambda$0(this.f2479IO);
            }
        });
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXiIII0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.abhTitleCenter_delegate$lambda$0(this.f8432IO);
            }
        });
        this.saveDial$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOO0IIOX1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.saveDial_delegate$lambda$0(this.f1819IO);
            }
        });
        this.nestedScrollView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI11
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.nestedScrollView_delegate$lambda$0(this.f2906IO);
            }
        });
        this.customizeDialBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXIiXXI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.customizeDialBg_delegate$lambda$0(this.f5041IO);
            }
        });
        this.controlViewStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OO0IX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.controlViewStep_delegate$lambda$0(this.f2505IO);
            }
        });
        this.controlViewHr$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.controlViewHr_delegate$lambda$0(this.f5141IO);
            }
        });
        this.controlViewCa$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii1O1OIi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.controlViewCa_delegate$lambda$0(this.f8554IO);
            }
        });
        this.controlViewDis$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiXOX1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.controlViewDis_delegate$lambda$0(this.f8644IO);
            }
        });
        this.timeDigitalView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1OI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.timeDigitalView_delegate$lambda$0(this.f7826IO);
            }
        });
        this.timePointView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX0OOi1XO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.timePointView_delegate$lambda$0(this.f1945IO);
            }
        });
        this.timeScaleView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiiXIi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.timeScaleView_delegate$lambda$0(this.f8689IO);
            }
        });
        this.isRound = true;
        this.controlValueRange = 9;
        this.fileFormat = "png";
        this.imageFormat = 1;
        this.X_CENTER = 4;
        this.Y_CENTER = 32;
        Object objCustomizeDir = customizeDir();
        this.DIAL_CUSTOMIZE_DIR = objCustomizeDir;
        String str = objCustomizeDir + "/control";
        this.CONTROL_DIR = str;
        this.STEP_DIR = str + "/step";
        this.CALORIES_DIR = str + "/calories";
        this.DISTANCE_DIR = str + "/distance";
        this.HEART_RATE_DIR = str + "/heart_rate";
        this.VALUE_DIR = objCustomizeDir + "/value";
        String str2 = objCustomizeDir + "/time";
        this.TIME_DIR = str2;
        this.DIGITAL_DIR = str2 + "/digital";
        this.POINTER_DIR = str2 + "/pointer";
        this.DIGITAL_AM_DIR = "am_pm";
        this.DIGITAL_DATE_DIR = "date";
        this.DIGITAL_HOUR_MINUTE_DIR = "hour_minute";
        this.DIGITAL_WEEK_DIR = "week";
        this.POINTER_HOUR = "pointer/hour";
        this.POINTER_MINUTE = "pointer/minute";
        this.POINTER_SECOND = "pointer/second";
        this.is2DAcceleration = q62.OXO1.iIi011O() ? "/2d/" : "/default/";
        this.paramName = bleCache.getMPrototype() + "/";
        this.colors$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0IO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.colors_delegate$lambda$0(this.f7352IO);
            }
        });
        this.digitalTimes$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIOi010I
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.digitalTimes_delegate$lambda$0();
            }
        });
        this.pointers$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO00
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.pointers_delegate$lambda$0();
            }
        });
        this.scales = scalesList();
        this.mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXO0XXO0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseDialCustomizeActivity.mCrop_delegate$lambda$0(this.f3484IO);
            }
        });
        this.mBleHandleCallback = new XO0O10();
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (PFMedium) baseDialCustomizeActivity.findViewById(R.id.abh_title_center);
    }

    private final byte[] addAmPmNumber(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) throws IOException {
        String str = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat;
        String str2 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/pm." + this.fileFormat;
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        InputStream inputStreamOpen = getResources().getAssets().open(str);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            InputStream inputStreamOpen2 = getResources().getAssets().open(str2);
            try {
                Intrinsics.XXI(inputStreamOpen2);
                byte[] bArrX0O2 = ByteStreamsKt.X0O(inputStreamOpen2);
                CloseableKt.OXO1(inputStreamOpen2, null);
                File file = new File(PathUtils.getExternalAppDataPath(), str);
                FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
                File file2 = new File(PathUtils.getExternalAppDataPath(), str2);
                FileIOUtils.writeFileFromBytesByStream(file2, bArrX0O2);
                Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
                Triple<Integer, Integer, byte[]> tripleConvertPng708 = convertPng707(file2);
                arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.AMPM.getValue(), 2, arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) this.amLeftX, (int) this.amTopY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
                int length = tripleConvertPng707.getThird().length;
                int length2 = (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArr.length;
                WatchFaceEnumUtil watchFaceEnumUtil = WatchFaceEnumUtil.INSTANCE;
                arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, length, length2, new WatchFaceResourceDescriptor.ImageDesc(watchFaceEnumUtil.getColorFormat(tripleConvertPng707.getFirst().intValue()), tripleConvertPng707.getFirst().intValue(), tripleConvertPng707.getSecond().intValue(), 0, width, height, null, 72, null), 1, null));
                byte[] bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArr, tripleConvertPng707.getThird());
                arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, tripleConvertPng708.getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(watchFaceEnumUtil.getColorFormat(tripleConvertPng708.getFirst().intValue()), tripleConvertPng708.getFirst().intValue(), tripleConvertPng708.getSecond().intValue(), 0, width, height, null, 72, null), 1, null));
                return ArraysKt___ArraysJvmKt.i1i(bArrI1i, tripleConvertPng708.getThird());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.OXO1(inputStreamOpen2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.OXO1(inputStreamOpen, th3);
                throw th4;
            }
        }
    }

    private final Pair<Float, Float> addControlBitmap(String str, DialElementView dialElementView, String str2, String str3, Canvas canvas, float f, float f2, boolean z) {
        if (dialElementView.getVisibility() != 0) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        LogUtils.m11128d("test addControlBitmap " + str + " , " + dialElementView.getX() + " " + dialElementView.getY() + " " + f + " " + f2);
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str));
        float x = dialElementView.getX() * f;
        float y = dialElementView.getY() * f2;
        canvas.drawBitmap(bitmap, x, y, (Paint) null);
        float width = ((float) (bitmap.getWidth() / 2)) + x;
        float height = y + ((float) bitmap.getHeight()) + ((float) this.controlValueInterval);
        Bitmap bitmap2 = ImageUtils.getBitmap(getResources().getAssets().open(str2 + str3.charAt(0) + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat));
        float width2 = width - ((float) ((((bitmap2.getWidth() * str3.length()) + str3.length()) + (-1)) / 2));
        if (z) {
            int length = str3.length();
            for (int i = 0; i < length; i++) {
                Bitmap bitmap3 = ImageUtils.getBitmap(getResources().getAssets().open(str2 + str3.charAt(i) + ".png"));
                canvas.drawBitmap(bitmap3, ((float) i) + width2 + ((float) (bitmap3.getWidth() * i)), height, (Paint) null);
            }
        }
        float height2 = height + (bitmap2.getHeight() / 2);
        return q62.OXO1.IiX() ? new Pair<>(Float.valueOf(width - (this.screenWidth / 2)), Float.valueOf(height2 - (this.screenHeight / 2))) : new Pair<>(Float.valueOf(width), Float.valueOf(height2));
    }

    private final byte[] addDateDigit(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) throws IOException {
        String str = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR + "/";
        Triple numberBuffers707$default = getNumberBuffers707$default(this, str, 0, 2, null);
        int iIntValue = ((Number) numberBuffers707$default.getFirst()).intValue();
        int iIntValue2 = ((Number) numberBuffers707$default.getSecond()).intValue();
        arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.DATE_DIGIT.getValue(), ((ArrayList) numberBuffers707$default.getThird()).size() + 1, arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) (this.digitalDateDayLeftX - (iIntValue * 3)), (int) this.digitalDateDayTopY, 0, null, null, null, new WatchFaceElement.DateDigitData((byte) (WatchFaceEnumUtil.DateDigitFlag.DATE_DIGIT_FLAG_MONTH.getValue() | WatchFaceEnumUtil.DateDigitFlag.DATE_DIGIT_FLAG_DAY.getValue())), null, null, null, null, null, 128904, null));
        ArrayList arrayList3 = (ArrayList) numberBuffers707$default.getThird();
        int size = arrayList3.size();
        int i = 0;
        byte[] bArrI1i = bArr;
        while (i < size) {
            int i2 = i;
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, ((byte[]) ((Triple) arrayList3.get(i)).getThird()).length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(((Number) ((Triple) arrayList3.get(i)).getFirst()).intValue()), ((Number) ((Triple) arrayList3.get(i)).getFirst()).intValue(), ((Number) ((Triple) arrayList3.get(i)).getSecond()).intValue(), 0, iIntValue, iIntValue2, null, 72, null), 1, null));
            bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, (byte[]) ((Triple) arrayList3.get(i2)).getThird());
            i = i2 + 1;
        }
        String str2 = str + "symbol." + this.fileFormat;
        InputStream inputStreamOpen = getResources().getAssets().open(str2);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str2));
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            File file = new File(PathUtils.getExternalAppDataPath(), str2);
            FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
            Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, tripleConvertPng707.getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(tripleConvertPng707.getFirst().intValue()), tripleConvertPng707.getFirst().intValue(), tripleConvertPng707.getSecond().intValue(), 0, width, height, null, 72, null), 1, null));
            return ArraysKt___ArraysJvmKt.i1i(bArrI1i, tripleConvertPng707.getThird());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final void addDigitalTime(String str, float f, float f2, Canvas canvas, boolean z) {
        float x = getTimeDigitalView().getX() * f;
        float y = getTimeDigitalView().getY() * f2;
        LogUtils.m11128d("test timeLeft=" + x + ",  timeTop=" + y + ", timeDigitalView.width=" + getTimeDigitalView().getWidth() + " ,scaleWidth =" + f);
        AssetManager assets = getResources().getAssets();
        String str2 = this.DIGITAL_AM_DIR;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("/pm.png");
        Bitmap bitmap = ImageUtils.getBitmap(assets.open(sb.toString()));
        Pair<Bitmap, Float> pairAddDigitalTimeParam = addDigitalTimeParam(str, this.DIGITAL_HOUR_MINUTE_DIR, "08:30", y, bitmap.getHeight(), canvas, x, z);
        float fFloatValue = addDigitalTimeParam(str, this.DIGITAL_DATE_DIR, "07/08", pairAddDigitalTimeParam.component2().floatValue(), pairAddDigitalTimeParam.component1().getHeight(), canvas, x, z).component2().floatValue();
        if (z) {
            canvas.drawBitmap(bitmap, this.digitalTimeMinuteRightX - bitmap.getWidth(), y, (Paint) null);
        }
        this.amLeftX = this.digitalTimeMinuteRightX - bitmap.getWidth();
        this.amTopY = y;
        Bitmap bitmap2 = ImageUtils.getBitmap(getResources().getAssets().open(str + this.DIGITAL_WEEK_DIR + "/4.png"));
        if (z) {
            canvas.drawBitmap(bitmap2, this.digitalTimeMinuteRightX - bitmap2.getWidth(), fFloatValue, (Paint) null);
        }
        this.digitalWeekLeftX = this.digitalTimeMinuteRightX - bitmap2.getWidth();
        this.digitalWeekTopY = fFloatValue;
    }

    private final Pair<Bitmap, Float> addDigitalTimeParam(String str, String str2, String str3, float f, int i, Canvas canvas, float f2, boolean z) {
        int width;
        BaseDialCustomizeActivity baseDialCustomizeActivity = this;
        float f3 = f2;
        Bitmap bitmap = ImageUtils.getBitmap(baseDialCustomizeActivity.getResources().getAssets().open(str + str2 + "/symbol.png"));
        Bitmap bitmap2 = ImageUtils.getBitmap(baseDialCustomizeActivity.getResources().getAssets().open(str + str2 + "/" + str3.charAt(0) + ".png"));
        float f4 = (float) 6;
        float f5 = f + ((float) i) + f4;
        int i2 = 2;
        float height = ((float) ((bitmap2.getHeight() - bitmap.getHeight()) / 2)) + f5;
        Paint paint = null;
        if (StringsKt__StringsKt.iIi011O(str2, baseDialCustomizeActivity.DIGITAL_HOUR_MINUTE_DIR, false, 2, null)) {
            baseDialCustomizeActivity.digitalTimeHourLeftX = f3;
            baseDialCustomizeActivity.digitalTimeHourTopY = f5;
            baseDialCustomizeActivity.digitalTimeSymbolLeftX = (bitmap2.getWidth() * 2) + f3;
            baseDialCustomizeActivity.digitalTimeSymbolTopY = height;
            float width2 = (bitmap2.getWidth() * 2) + f3 + bitmap.getWidth();
            baseDialCustomizeActivity.digitalTimeMinuteLeftX = width2;
            baseDialCustomizeActivity.digitalTimeMinuteTopY = f5;
            baseDialCustomizeActivity.digitalTimeMinuteRightX = (width2 + (bitmap2.getWidth() * 2)) - f4;
        } else if (StringsKt__StringsKt.iIi011O(str2, baseDialCustomizeActivity.DIGITAL_DATE_DIR, false, 2, null)) {
            baseDialCustomizeActivity.digitalDateMonthLeftX = f3;
            baseDialCustomizeActivity.digitalDateMonthTopY = f5;
            baseDialCustomizeActivity.digitalDateSymbolLeftX = (bitmap2.getWidth() * 2) + f3;
            baseDialCustomizeActivity.digitalDateSymbolTopY = height;
            baseDialCustomizeActivity.digitalDateDayLeftX = (bitmap2.getWidth() * 2) + f3 + bitmap.getWidth();
            baseDialCustomizeActivity.digitalDateDayTopY = f5;
        }
        if (baseDialCustomizeActivity.screenReservedBoundary == 0) {
            int length = str3.length();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                if (i3 == i2) {
                    if (!q62.OXO1.IiX() || z) {
                        canvas.drawBitmap(bitmap, (bitmap2.getWidth() * i4) + f3, height, paint);
                    }
                    width = bitmap.getWidth();
                    length = length;
                } else {
                    if (z) {
                        Bitmap bitmap3 = ImageUtils.getBitmap(baseDialCustomizeActivity.getResources().getAssets().open(str + str2 + "/" + str3.charAt(i3) + ".png"));
                        width = i5;
                        canvas.drawBitmap(bitmap3, f2 + ((float) (bitmap2.getWidth() * i4)) + ((float) width), f5, (Paint) null);
                    } else {
                        width = i5;
                    }
                    i4++;
                }
                i3++;
                f3 = f2;
                length = length;
                paint = null;
                i5 = width;
                i2 = 2;
            }
        } else if (z) {
            int length2 = str3.length();
            int i6 = 0;
            int width3 = 0;
            int i7 = 0;
            while (i6 < length2) {
                if (i6 == 2) {
                    canvas.drawBitmap(bitmap, f2 + (bitmap2.getWidth() * i7), height, (Paint) null);
                    width3 = bitmap.getWidth();
                } else {
                    canvas.drawBitmap(ImageUtils.getBitmap(baseDialCustomizeActivity.getResources().getAssets().open(str + str2 + "/" + str3.charAt(i6) + FileUtils.FILE_EXTENSION_SEPARATOR + baseDialCustomizeActivity.fileFormat)), f2 + (bitmap2.getWidth() * i7) + width3, f5, (Paint) null);
                    i7++;
                }
                i6++;
                baseDialCustomizeActivity = this;
            }
        }
        return new Pair<>(bitmap2, Float.valueOf(f5));
    }

    private final byte[] addTimeNumber(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) throws IOException {
        String str = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR + "/";
        Triple numberBuffers707$default = getNumberBuffers707$default(this, str, 0, 2, null);
        int iIntValue = ((Number) numberBuffers707$default.getFirst()).intValue();
        int iIntValue2 = ((Number) numberBuffers707$default.getSecond()).intValue();
        ArrayList arrayList3 = (ArrayList) numberBuffers707$default.getThird();
        arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.TIME_DIGIT.getValue(), ((ArrayList) numberBuffers707$default.getThird()).size() + 1, arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) this.digitalTimeHourLeftX, (int) this.digitalTimeHourTopY, 0, null, null, new WatchFaceElement.TimeDigitData((byte) (WatchFaceEnumUtil.DigitFlag.TIME_DIGIT_FLAG_HOUR.getValue() | WatchFaceEnumUtil.DigitFlag.TIME_DIGIT_FLAG_MIN.getValue())), null, null, null, null, null, null, 129928, null));
        int size = arrayList3.size();
        int i = 0;
        byte[] bArrI1i = bArr;
        while (i < size) {
            int i2 = i;
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, ((byte[]) ((Triple) arrayList3.get(i)).getThird()).length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(((Number) ((Triple) arrayList3.get(i)).getFirst()).intValue()), ((Number) ((Triple) arrayList3.get(i)).getFirst()).intValue(), ((Number) ((Triple) arrayList3.get(i)).getSecond()).intValue(), 0, iIntValue, iIntValue2, null, 72, null), 1, null));
            bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, (byte[]) ((Triple) arrayList3.get(i2)).getThird());
            i = i2 + 1;
        }
        String str2 = str + "symbol." + this.fileFormat;
        InputStream inputStreamOpen = getResources().getAssets().open(str2);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str2));
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            File file = new File(PathUtils.getExternalAppDataPath(), str2);
            FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
            Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, tripleConvertPng707.getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(tripleConvertPng707.getFirst().intValue()), tripleConvertPng707.getFirst().intValue(), tripleConvertPng707.getSecond().intValue(), 0, width, height, null, 72, null), 1, null));
            return ArraysKt___ArraysJvmKt.i1i(bArrI1i, tripleConvertPng707.getThird());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final byte[] addWeekNumber(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) throws IOException {
        Triple<Integer, Integer, ArrayList<Triple<Integer, Integer, byte[]>>> numberBuffers707 = getNumberBuffers707(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_WEEK_DIR + "/", 6);
        int iIntValue = numberBuffers707.getFirst().intValue();
        int iIntValue2 = numberBuffers707.getSecond().intValue();
        arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.WEEKDAY_TEXT.getValue(), numberBuffers707.getThird().size(), arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_LT.getValue(), (int) this.digitalWeekLeftX, (int) this.digitalWeekTopY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        ArrayList<Triple<Integer, Integer, byte[]>> third = numberBuffers707.getThird();
        int size = third.size();
        byte[] bArrI1i = bArr;
        int i = 0;
        while (i < size) {
            int i2 = i == third.size() + (-1) ? 0 : i + 1;
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, third.get(i2).getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(third.get(i2).getFirst().intValue()), third.get(i2).getFirst().intValue(), third.get(i2).getSecond().intValue(), 0, iIntValue, iIntValue2, null, 72, null), 1, null));
            bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, third.get(i2).getThird());
            i++;
        }
        return bArrI1i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bgOnClick$lambda$0$0(I0OOX i0oox, BaseDialCustomizeActivity baseDialCustomizeActivity, View view) {
        i0oox.dismiss();
        baseDialCustomizeActivity.selectImagePopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bgOnClick$lambda$1$0(DialBgFilePickerPopup dialBgFilePickerPopup, BaseDialCustomizeActivity baseDialCustomizeActivity, View view) {
        dialBgFilePickerPopup.dismiss();
        baseDialCustomizeActivity.selectImagePopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List colors_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.shape_circle_0, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_0), true), new ResourcesIdInfo(R.drawable.shape_circle_1, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_1), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_2, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_2), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_3, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_3), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_4, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_4), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_5, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_5), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_6, baseDialCustomizeActivity.getResources().getColor(R.color.dial_customize_control_6), false, 4, null));
    }

    private final void controlChangeStatus(DialElementView dialElementView, ImageView imageView) {
        if (dialElementView.getVisibility() == 0) {
            dialElementView.setVisibility(8);
            imageView.setImageResource(R.drawable.dial_control_add);
        } else {
            dialElementView.setVisibility(0);
            imageView.setImageResource(R.drawable.dial_control_already_add);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void controlOnClick$lambda$0$1(BaseDialCustomizeActivity baseDialCustomizeActivity, iOOOIi ioooii, View view) {
        DialElementView controlViewStep = baseDialCustomizeActivity.getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
        baseDialCustomizeActivity.controlChangeStatus(controlViewStep, ioooii.II1Xi0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void controlOnClick$lambda$0$2(BaseDialCustomizeActivity baseDialCustomizeActivity, iOOOIi ioooii, View view) {
        DialElementView controlViewHr = baseDialCustomizeActivity.getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
        baseDialCustomizeActivity.controlChangeStatus(controlViewHr, ioooii.i010I());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void controlOnClick$lambda$0$3(BaseDialCustomizeActivity baseDialCustomizeActivity, iOOOIi ioooii, View view) {
        DialElementView controlViewCa = baseDialCustomizeActivity.getControlViewCa();
        Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
        baseDialCustomizeActivity.controlChangeStatus(controlViewCa, ioooii.m2124iX());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void controlOnClick$lambda$0$4(BaseDialCustomizeActivity baseDialCustomizeActivity, iOOOIi ioooii, View view) {
        DialElementView controlViewDis = baseDialCustomizeActivity.getControlViewDis();
        Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
        baseDialCustomizeActivity.controlChangeStatus(controlViewDis, ioooii.IXXOO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewCa_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (DialElementView) baseDialCustomizeActivity.findViewById(R.id.controlViewCa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewDis_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (DialElementView) baseDialCustomizeActivity.findViewById(R.id.controlViewDis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewHr_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (DialElementView) baseDialCustomizeActivity.findViewById(R.id.controlViewHr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView controlViewStep_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (DialElementView) baseDialCustomizeActivity.findViewById(R.id.controlViewStep);
    }

    private final byte[] convertPng(File file, boolean z, boolean z2) {
        return X1XX1O.XXiO0i.m1185iO(file, z, z2);
    }

    public static /* synthetic */ byte[] convertPng$default(BaseDialCustomizeActivity baseDialCustomizeActivity, File file, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertPng");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return baseDialCustomizeActivity.convertPng(file, z, z2);
    }

    private final Triple<Integer, Integer, byte[]> convertPng707(File file) {
        String str = file.getPath() + ".bin";
        ConvertResult convertResultBitmapConvertAndCompressBlock = new BmpConvert().bitmapConvertAndCompressBlock(this.isJL707N ? 8 : 4, file.getPath(), str);
        if (convertResultBitmapConvertAndCompressBlock.getResult() <= 0) {
            i1O0OXO1O.OXO1.OXO1("convertPng error = " + convertResultBitmapConvertAndCompressBlock);
            return new Triple<>(0, 0, new byte[0]);
        }
        byte[] file2BytesByChannel = FileIOUtils.readFile2BytesByChannel(str);
        int length = file2BytesByChannel.length;
        X1XX1O.OXO1 oxo1 = X1XX1O.XXiO0i;
        byte[] bArr = new byte[(((length + oxo1.OIX0iXi()) - 1) / oxo1.OIX0iXi()) * oxo1.OIX0iXi()];
        System.arraycopy(file2BytesByChannel, 0, bArr, 0, file2BytesByChannel.length);
        return new Triple<>(Integer.valueOf(convertResultBitmapConvertAndCompressBlock.getPixelFormat()), Integer.valueOf(convertResultBitmapConvertAndCompressBlock.getCompressMode()), bArr);
    }

    private final void crcCountAndSend(WatchFaceHeader watchFaceHeader, ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) {
        byte[] byteArray = watchFaceHeader.toByteArray();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            OIXO1IIOO.XOO0XOOii(arrayList3, ArraysKt___ArraysKt.O1XIOXO1i(((WatchFaceElement) it.next()).toByteArray()));
        }
        byte[] bArrXX0X0 = CollectionsKt___CollectionsKt.XX0X0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            OIXO1IIOO.XOO0XOOii(arrayList4, ArraysKt___ArraysKt.O1XIOXO1i(((WatchFaceResourceDescriptor) it2.next()).toByteArray()));
        }
        byte[] bArrI1i = ArraysKt___ArraysJvmKt.i1i(ArraysKt___ArraysJvmKt.i1i(ArraysKt___ArraysJvmKt.i1i(byteArray, bArrXX0X0), CollectionsKt___CollectionsKt.XX0X0(arrayList4)), bArr);
        int length = bArrI1i.length;
        int iCalculate = calculate(ArraysKt___ArraysJvmKt.I0IIOI(bArrI1i, 14, bArrI1i.length));
        watchFaceHeader.setSize(length);
        watchFaceHeader.setCrc(iCalculate);
        byte[] byteArray2 = watchFaceHeader.toByteArray();
        System.arraycopy(byteArray2, 0, bArrI1i, 0, byteArray2.length);
        this.mCurSendBytes = bArrI1i;
        File file = new File(PathUtils.getExternalAppDataPath(), "dial.bin");
        FileIOUtils.writeFileFromBytesByStream(file, bArrI1i);
        LogUtils.m11128d(" customize dial bytes mFile = " + file.getAbsolutePath());
        BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.WATCH_FACE, bArrI1i, 0, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound customizeDialBg_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (ImageViewRound) baseDialCustomizeActivity.findViewById(R.id.customizeDialBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List digitalTimes_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.digital_time_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_5, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_6, 0, false, 6, null));
    }

    private final byte[] getBg() {
        byte[] bArrConvertPng$default;
        Bitmap bgBitmap$default = getBgBitmap$default(this, false, 0, 2, null);
        sz0 sz0Var = sz0.OXO1;
        ImageUtils.save(bgBitmap$default, uz0.XiOIii1(sz0Var), Bitmap.CompressFormat.PNG);
        if (this.isSupportConvertPng && (bArrConvertPng$default = convertPng$default(this, uz0.XiOIii1(sz0Var), false, false, 4, null)) != null) {
            return bArrConvertPng$default;
        }
        return bitmap2Bytes(bgBitmap$default);
    }

    private final byte[] getBg707(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) {
        Bitmap bgBitmap$default = getBgBitmap$default(this, false, 0, 2, null);
        File file = new File(PathUtils.getExternalAppDataPath(), uz0.i010I);
        ImageUtils.save(bgBitmap$default, file, Bitmap.CompressFormat.PNG);
        Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
        arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.IMAGE.getValue(), 1, arrayList2.size(), (byte) 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
        arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, tripleConvertPng707.getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArr.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(tripleConvertPng707.getFirst().intValue()), tripleConvertPng707.getFirst().intValue(), tripleConvertPng707.getSecond().intValue(), 0, this.screenWidth, this.screenHeight, null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(bArr, tripleConvertPng707.getThird());
    }

    private final Bitmap getBgBitmap(boolean z, int i) {
        Bitmap bitmap$default;
        if (this.isRound) {
            bitmap$default = ImageUtils.view2Bitmap(getCustomizeDialBg());
        } else {
            Drawable drawable = getCustomizeDialBg().getDrawable();
            Intrinsics.O10IXXX0X(drawable, "getDrawable(...)");
            bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
        }
        float width = this.screenWidth / bitmap$default.getWidth();
        float height = (this.screenHeight - this.screenReservedBoundary) / bitmap$default.getHeight();
        LogUtils.m11128d("test getBgBitmap = " + bitmap$default.getWidth() + "- " + bitmap$default.getHeight() + " ; " + width + " - " + height + " ");
        Bitmap bitmapScale = ImageUtils.scale(bitmap$default, width, height);
        Bitmap round = this.isRound ? ImageUtils.toRound(bitmapScale, this.borderSize, getResources().getColor(i)) : ImageUtils.toRoundCorner(bitmapScale, this.roundCornerRadius, 0.0f, getResources().getColor(i));
        if (!this.isRound) {
            width = this.screenWidth / getCustomizeDialBg().getWidth();
            height = (this.screenHeight - this.screenReservedBoundary) / getCustomizeDialBg().getHeight();
        }
        float f = width;
        float f2 = height;
        Canvas canvas = new Canvas(round);
        String str = this.STEP_DIR + "/step_0.png";
        DialElementView controlViewStep = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
        Pair<Float, Float> pairAddControlBitmap = addControlBitmap(str, controlViewStep, this.VALUE_DIR + "/" + this.valueColor + "/", "18564", canvas, f, f2, z);
        float fFloatValue = pairAddControlBitmap.component1().floatValue();
        float fFloatValue2 = pairAddControlBitmap.component2().floatValue();
        this.stepValueCenterX = fFloatValue;
        this.stepValueCenterY = fFloatValue2;
        String str2 = this.CALORIES_DIR + "/calories_0.png";
        DialElementView controlViewCa = getControlViewCa();
        Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
        Pair<Float, Float> pairAddControlBitmap2 = addControlBitmap(str2, controlViewCa, this.VALUE_DIR + "/" + this.valueColor + "/", "50", canvas, f, f2, z);
        float fFloatValue3 = pairAddControlBitmap2.component1().floatValue();
        float fFloatValue4 = pairAddControlBitmap2.component2().floatValue();
        this.caloriesValueCenterX = fFloatValue3;
        this.caloriesValueCenterY = fFloatValue4;
        String str3 = this.DISTANCE_DIR + "/distance_0.png";
        DialElementView controlViewDis = getControlViewDis();
        Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
        Pair<Float, Float> pairAddControlBitmap3 = addControlBitmap(str3, controlViewDis, this.VALUE_DIR + "/" + this.valueColor + "/", "6", canvas, f, f2, z);
        float fFloatValue5 = pairAddControlBitmap3.component1().floatValue();
        float fFloatValue6 = pairAddControlBitmap3.component2().floatValue();
        this.distanceValueCenterX = fFloatValue5;
        this.distanceValueCenterY = fFloatValue6;
        String str4 = this.HEART_RATE_DIR + "/heart_rate_0.png";
        DialElementView controlViewHr = getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
        Pair<Float, Float> pairAddControlBitmap4 = addControlBitmap(str4, controlViewHr, this.VALUE_DIR + "/" + this.valueColor + "/", "90", canvas, f, f2, z);
        float fFloatValue7 = pairAddControlBitmap4.component1().floatValue();
        float fFloatValue8 = pairAddControlBitmap4.component2().floatValue();
        this.heartRateValueCenterX = fFloatValue7;
        this.heartRateValueCenterY = fFloatValue8;
        DialElementView timeDigitalView = getTimeDigitalView();
        Intrinsics.O10IXXX0X(timeDigitalView, "<get-timeDigitalView>(...)");
        if (timeDigitalView.getVisibility() == 0) {
            addDigitalTime(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/", f, f2, canvas, z);
            canvas = canvas;
        }
        ImageView timeScaleView = getTimeScaleView();
        Intrinsics.O10IXXX0X(timeScaleView, "<get-timeScaleView>(...)");
        if (timeScaleView.getVisibility() == 0) {
            ImageView timeScaleView2 = getTimeScaleView();
            Intrinsics.O10IXXX0X(timeScaleView2, "<get-timeScaleView>(...)");
            getPointerBg(timeScaleView2, true, canvas);
        }
        ImageView timePointView = getTimePointView();
        Intrinsics.O10IXXX0X(timePointView, "<get-timePointView>(...)");
        if (timePointView.getVisibility() == 0) {
            ImageView timePointView2 = getTimePointView();
            Intrinsics.O10IXXX0X(timePointView2, "<get-timePointView>(...)");
            getPointerBg(timePointView2, z, canvas);
        }
        if (i == R.color.dark) {
            Intrinsics.XXI(round);
            return getFinalBgBitmap(round);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(round.getWidth(), round.getHeight() + 1, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(round, 0.0f, 0.0f, new Paint());
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap getBgBitmap$default(BaseDialCustomizeActivity baseDialCustomizeActivity, boolean z, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBgBitmap");
        }
        if ((i2 & 2) != 0) {
            i = R.color.dark;
        }
        return baseDialCustomizeActivity.getBgBitmap(z, i);
    }

    private final void getControl(ArrayList<Element> arrayList) throws IOException {
        Triple<Integer, Integer, ArrayList<byte[]>> numberBuffers = getNumberBuffers(this.VALUE_DIR + "/" + this.valueColor + "/", this.controlValueRange);
        int iIntValue = numberBuffers.getFirst().intValue();
        int iIntValue2 = numberBuffers.getSecond().intValue();
        byte[][] bArr = (byte[][]) numberBuffers.getThird().toArray(new byte[0][]);
        DialElementView controlViewStep = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
        if (controlViewStep.getVisibility() == 0) {
            arrayList.add(new Element(14, 0, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.stepValueCenterX, (int) this.stepValueCenterY, 0, 0, 0, bArr, 1794, null));
        }
        DialElementView controlViewHr = getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
        if (controlViewHr.getVisibility() == 0) {
            arrayList.add(new Element(15, 0, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.heartRateValueCenterX, (int) this.heartRateValueCenterY, 0, 0, 0, bArr, 1794, null));
        }
        DialElementView controlViewCa = getControlViewCa();
        Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
        if (controlViewCa.getVisibility() == 0) {
            arrayList.add(new Element(16, 0, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.caloriesValueCenterX, (int) this.caloriesValueCenterY, 0, 0, 0, bArr, 1794, null));
        }
        DialElementView controlViewDis = getControlViewDis();
        Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
        if (controlViewDis.getVisibility() == 0) {
            Element element = new Element(17, 0, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.distanceValueCenterX, (int) this.distanceValueCenterY, 0, 0, 0, bArr, 1794, null);
            LogUtils.m11128d("test distanceValueCenterX=" + this.distanceValueCenterX + "  distanceValueCenterY=" + this.distanceValueCenterY);
            arrayList.add(element);
        }
    }

    private final void getControl2(ArrayList<Element> arrayList) throws IOException {
        Triple<Integer, Integer, ArrayList<byte[]>> numberBuffers2 = getNumberBuffers2(this.VALUE_DIR + "/" + this.valueColor + "/", this.controlValueRange);
        int iIntValue = numberBuffers2.getFirst().intValue();
        int iIntValue2 = numberBuffers2.getSecond().intValue();
        byte[][] bArr = (byte[][]) numberBuffers2.getThird().toArray(new byte[0][]);
        DialElementView controlViewStep = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
        if (controlViewStep.getVisibility() == 0) {
            arrayList.add(new Element(14, 1, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.stepValueCenterX, (int) this.stepValueCenterY, 0, 0, 0, bArr, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        }
        DialElementView controlViewHr = getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
        if (controlViewHr.getVisibility() == 0) {
            arrayList.add(new Element(15, 1, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.heartRateValueCenterX, (int) this.heartRateValueCenterY, 0, 0, 0, bArr, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        }
        DialElementView controlViewCa = getControlViewCa();
        Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
        if (controlViewCa.getVisibility() == 0) {
            arrayList.add(new Element(16, 1, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.caloriesValueCenterX, (int) this.caloriesValueCenterY, 0, 0, 0, bArr, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        }
        DialElementView controlViewDis = getControlViewDis();
        Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
        if (controlViewDis.getVisibility() == 0) {
            Element element = new Element(17, 1, iIntValue, iIntValue2, this.X_CENTER | this.Y_CENTER, this.ignoreBlack, (int) this.distanceValueCenterX, (int) this.distanceValueCenterY, 0, 0, 0, bArr, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null);
            LogUtils.m11128d("test distanceValueCenterX=" + this.distanceValueCenterX + "  distanceValueCenterY=" + this.distanceValueCenterY);
            arrayList.add(element);
        }
    }

    private final byte[] getControl707(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) throws IOException {
        byte[] bArrI1i;
        Triple<Integer, Integer, ArrayList<Triple<Integer, Integer, byte[]>>> numberBuffers707 = getNumberBuffers707(this.VALUE_DIR + "/" + this.valueColor + "/", this.controlValueRange);
        ArrayList<Triple<Integer, Integer, byte[]>> third = numberBuffers707.getThird();
        DialElementView controlViewDis = getControlViewDis();
        Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
        if (controlViewDis.getVisibility() == 0) {
            arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.DISTANCE_DIGIT.getValue(), numberBuffers707.getThird().size(), arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.distanceValueCenterX, (int) this.distanceValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
            int size = third.size();
            bArrI1i = bArr;
            for (int i = 0; i < size; i++) {
                arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, third.get(i).getThird().length, bArrI1i.length + (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(third.get(i).getFirst().intValue()), third.get(i).getFirst().intValue(), third.get(i).getSecond().intValue(), 0, numberBuffers707.getFirst().intValue(), numberBuffers707.getSecond().intValue(), null, 72, null), 1, null));
                bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, third.get(i).getThird());
            }
        } else {
            bArrI1i = bArr;
        }
        DialElementView controlViewStep = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
        if (controlViewStep.getVisibility() == 0) {
            arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.STEP_DIGIT.getValue(), numberBuffers707.getThird().size() - 1, arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.stepValueCenterX, (int) this.stepValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
            int size2 = third.size() - 1;
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, third.get(i2).getThird().length, bArrI1i.length + (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(third.get(i2).getFirst().intValue()), third.get(i2).getFirst().intValue(), third.get(i2).getSecond().intValue(), 0, numberBuffers707.getFirst().intValue(), numberBuffers707.getSecond().intValue(), null, 72, null), 1, null));
                bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, third.get(i2).getThird());
            }
        }
        DialElementView controlViewCa = getControlViewCa();
        Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
        if (controlViewCa.getVisibility() == 0) {
            arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.CALORIE_DIGIT.getValue(), numberBuffers707.getThird().size() - 1, arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.caloriesValueCenterX, (int) this.caloriesValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
            int size3 = third.size() - 1;
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, third.get(i3).getThird().length, bArrI1i.length + (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(third.get(i3).getFirst().intValue()), third.get(i3).getFirst().intValue(), third.get(i3).getSecond().intValue(), 0, numberBuffers707.getFirst().intValue(), numberBuffers707.getSecond().intValue(), null, 72, null), 1, null));
                bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, third.get(i3).getThird());
            }
        }
        DialElementView controlViewHr = getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
        if (controlViewHr.getVisibility() != 0) {
            return bArrI1i;
        }
        arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.HR_DIGITAL.getValue(), numberBuffers707.getThird().size(), arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), (int) this.heartRateValueCenterX, (int) this.heartRateValueCenterY, 0, null, null, null, null, null, null, null, null, null, 130952, null));
        int size4 = third.size() - 1;
        for (int i4 = 0; i4 < size4; i4++) {
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, third.get(i4).getThird().length, bArrI1i.length + (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(third.get(i4).getFirst().intValue()), third.get(i4).getFirst().intValue(), third.get(i4).getSecond().intValue(), 0, numberBuffers707.getFirst().intValue(), numberBuffers707.getSecond().intValue(), null, 72, null), 1, null));
            bArrI1i = ArraysKt___ArraysJvmKt.i1i(bArrI1i, third.get(i4).getThird());
        }
        arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, third.get(0).getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArrI1i.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(third.get(0).getFirst().intValue()), third.get(0).getFirst().intValue(), third.get(0).getSecond().intValue(), 0, numberBuffers707.getFirst().intValue(), numberBuffers707.getSecond().intValue(), null, 72, null), 1, null));
        return ArraysKt___ArraysJvmKt.i1i(bArrI1i, third.get(0).getThird());
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    private final Triple<Integer, Integer, ArrayList<byte[]>> getNumberBuffers(String str, int i) throws IOException {
        int height;
        int width;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            height = 0;
            while (true) {
                if (i2 == 0) {
                    Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str + i3 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat));
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    width = i2;
                }
                InputStream inputStreamOpen = getResources().getAssets().open(str + i3 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat);
                try {
                    Intrinsics.XXI(inputStreamOpen);
                    byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
                    CloseableKt.OXO1(inputStreamOpen, null);
                    arrayList.add(X1iIIO.XIi00iiXO(this.fileFormat, bArrX0O, width, 0, 0, false, 56, null));
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                    i2 = width;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(inputStreamOpen, th);
                        throw th2;
                    }
                }
            }
            i2 = width;
        } else {
            height = 0;
        }
        return new Triple<>(Integer.valueOf(i2), Integer.valueOf(height), arrayList);
    }

    public static /* synthetic */ Triple getNumberBuffers$default(BaseDialCustomizeActivity baseDialCustomizeActivity, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumberBuffers");
        }
        if ((i2 & 2) != 0) {
            i = 9;
        }
        return baseDialCustomizeActivity.getNumberBuffers(str, i);
    }

    private final Triple<Integer, Integer, ArrayList<byte[]>> getNumberBuffers2(String str, int i) throws IOException {
        int height;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            height = 0;
            while (true) {
                String str2 = str + i2 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
                if (i3 == 0) {
                    Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str2));
                    int width = bitmap.getWidth();
                    height = bitmap.getHeight();
                    i3 = width;
                }
                InputStream inputStreamOpen = getResources().getAssets().open(str2);
                try {
                    Intrinsics.XXI(inputStreamOpen);
                    byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
                    CloseableKt.OXO1(inputStreamOpen, null);
                    File file = new File(uz0.X11iII1O1(sz0.OXO1), str2);
                    FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
                    byte[] bArrConvertPng$default = convertPng$default(this, file, false, false, 6, null);
                    if (bArrConvertPng$default != null) {
                        arrayList.add(bArrConvertPng$default);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(inputStreamOpen, th);
                        throw th2;
                    }
                }
            }
            i2 = i3;
        } else {
            height = 0;
        }
        return new Triple<>(Integer.valueOf(i2), Integer.valueOf(height), arrayList);
    }

    public static /* synthetic */ Triple getNumberBuffers2$default(BaseDialCustomizeActivity baseDialCustomizeActivity, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumberBuffers2");
        }
        if ((i2 & 2) != 0) {
            i = 9;
        }
        return baseDialCustomizeActivity.getNumberBuffers2(str, i);
    }

    private final Triple<Integer, Integer, ArrayList<Triple<Integer, Integer, byte[]>>> getNumberBuffers707(String str, int i) throws IOException {
        int height;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            height = 0;
            while (true) {
                String str2 = str + i2 + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
                if (i3 == 0) {
                    Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str2));
                    int width = bitmap.getWidth();
                    height = bitmap.getHeight();
                    i3 = width;
                }
                InputStream inputStreamOpen = getResources().getAssets().open(str2);
                try {
                    Intrinsics.XXI(inputStreamOpen);
                    byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
                    CloseableKt.OXO1(inputStreamOpen, null);
                    File file = new File(PathUtils.getExternalAppDataPath(), str2);
                    FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
                    Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
                    if (tripleConvertPng707 != null) {
                        arrayList.add(tripleConvertPng707);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(inputStreamOpen, th);
                        throw th2;
                    }
                }
            }
            i2 = i3;
        } else {
            height = 0;
        }
        return new Triple<>(Integer.valueOf(i2), Integer.valueOf(height), arrayList);
    }

    public static /* synthetic */ Triple getNumberBuffers707$default(BaseDialCustomizeActivity baseDialCustomizeActivity, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumberBuffers707");
        }
        if ((i2 & 2) != 0) {
            i = 9;
        }
        return baseDialCustomizeActivity.getNumberBuffers707(str, i);
    }

    private final void getPointer(int i, String str, ArrayList<Element> arrayList) throws IOException {
        ArrayList arrayList2 = new ArrayList();
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(this.POINTER_DIR + "/" + str + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        InputStream inputStreamOpen = getResources().getAssets().open(this.POINTER_DIR + "/" + str + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            arrayList2.add(X1iIIO.XIi00iiXO(this.fileFormat, bArrX0O, width, 0, 0, false, 56, null));
            arrayList.add(new Element(i, 0, width, height, 9, this.ignoreBlack, (this.screenWidth / 2) - 1, (this.screenHeight / 2) - 1, 0, Intrinsics.XOO0ii0(this.fileFormat, "png") ? 0 : height / 2, Intrinsics.XOO0ii0(this.fileFormat, "png") ? 0 : width / 2, (byte[][]) arrayList2.toArray(new byte[0][]), 258, null));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final void getPointer2(int i, String str, ArrayList<Element> arrayList) {
        String str2 = this.POINTER_DIR + "/" + str + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        ArrayList arrayList2 = new ArrayList();
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str2));
        int width = bitmap.getWidth();
        int height = (int) (bitmap.getHeight() * 0.6f);
        int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        X1XX1O.OXO1 oxo1 = X1XX1O.XXiO0i;
        int iOIX0iXi = ((((width * 3) + oxo1.OIX0iXi()) - 1) / oxo1.OIX0iXi()) * oxo1.OIX0iXi();
        int i2 = iOIX0iXi * height;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < height; i3++) {
            byte[] bArr2 = new byte[iOIX0iXi];
            for (int i4 = 0; i4 < width; i4++) {
                int iOXO1 = X1XX1O.XXiO0i.OXO1(iArr[(i3 * width) + i4]);
                int i5 = i4 * 3;
                bArr2[i5 + 2] = (byte) (iOXO1 & 255);
                bArr2[i5 + 1] = (byte) ((iOXO1 >> 8) & 255);
                bArr2[i5] = (byte) ((iOXO1 >> 16) & 255);
            }
            System.arraycopy(bArr2, 0, bArr, i3 * iOIX0iXi, iOIX0iXi);
        }
        LogUtils.m11128d("getPointer2 -> w=" + width + ", h=" + height + ", rowSize=" + iOIX0iXi + ", data=" + i2);
        arrayList2.add(bArr);
        arrayList.add(new Element(i, 1, width, height, 9, 1, this.screenWidth / 2, this.screenHeight / 2, 0, height - (bitmap.getHeight() / 2), width / 2, (byte[][]) arrayList2.toArray(new byte[0][]), 256, null));
    }

    private final void getPointer3(int i, String str, ArrayList<Element> arrayList) throws IOException {
        String str2 = this.POINTER_DIR + "/" + str + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        InputStream inputStreamOpen = getResources().getAssets().open(str2);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            File file = new File(uz0.X11iII1O1(sz0.OXO1), str2);
            FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
            ArrayList arrayList2 = new ArrayList();
            Bitmap bitmap = ImageUtils.getBitmap(bArrX0O, 0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            byte[] bArrConvertPng$default = convertPng$default(this, file, false, true, 2, null);
            if (bArrConvertPng$default != null) {
                arrayList2.add(bArrConvertPng$default);
            }
            arrayList.add(new Element(i, 1, width, height, 9, this.ignoreBlack, this.screenWidth / 2, this.screenHeight / 2, 0, height - (bitmap.getHeight() / 2), width / 2, (byte[][]) arrayList2.toArray(new byte[0][]), 256, null));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final byte[] getPointer707(byte b, String str, ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) throws IOException {
        String str2 = this.POINTER_DIR + "/" + str + "/" + this.pointerSelectNumber + FileUtils.FILE_EXTENSION_SEPARATOR + this.fileFormat;
        InputStream inputStreamOpen = getResources().getAssets().open(str2);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            File file = new File(PathUtils.getExternalAppDataPath(), str2);
            FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
            Bitmap bitmap = ImageUtils.getBitmap(bArrX0O, 0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
            arrayList.add(new WatchFaceElement(b, 1, arrayList2.size(), (byte) 0, WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue(), 0, 0, 0, null, new WatchFaceElement.PointerData(width / 2, height / 2), null, null, null, null, null, null, null, 130536, null));
            arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, tripleConvertPng707.getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32) + bArr.length, new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(tripleConvertPng707.getFirst().intValue()), tripleConvertPng707.getFirst().intValue(), tripleConvertPng707.getSecond().intValue(), 0, width, height, null, 72, null), 1, null));
            return ArraysKt___ArraysJvmKt.i1i(bArr, tripleConvertPng707.getThird());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final void getPointerBg(ImageView imageView, boolean z, Canvas canvas) {
        Bitmap bitmap$default;
        if (this.isRound) {
            bitmap$default = ImageUtils.view2Bitmap(imageView);
        } else {
            Drawable drawable = imageView.getDrawable();
            Intrinsics.O10IXXX0X(drawable, "getDrawable(...)");
            bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
        }
        int left = imageView.getLeft();
        int top = imageView.getTop();
        float width = this.screenWidth / (bitmap$default.getWidth() + (left * 2));
        float height = (this.screenHeight - this.screenReservedBoundary) / (bitmap$default.getHeight() + (top * 2));
        Bitmap bitmapScale = ImageUtils.scale(bitmap$default, width, height);
        Bitmap round = this.isRound ? ImageUtils.toRound(bitmapScale, 0, 0) : ImageUtils.toRoundCorner(bitmapScale, this.roundCornerRadius);
        if (z) {
            canvas.drawBitmap(round, left * width, top * height, (Paint) null);
        }
    }

    private final byte[] getPreview(int i) {
        byte[] bArrConvertPng$default;
        Bitmap bgBitmap$default = getBgBitmap$default(this, true, 0, 2, null);
        float width = this.screenPreviewWidth / bgBitmap$default.getWidth();
        Bitmap bitmapScale = ImageUtils.scale(bgBitmap$default, width, this.screenPreviewHeight / bgBitmap$default.getHeight());
        Bitmap round = this.isRound ? ImageUtils.toRound(bitmapScale, this.borderSize, getResources().getColor(i)) : ImageUtils.toRoundCorner(bitmapScale, this.roundCornerRadius * width, this.borderSize, getResources().getColor(i));
        sz0 sz0Var = sz0.OXO1;
        ImageUtils.save(round, uz0.i010I(sz0Var), Bitmap.CompressFormat.PNG);
        if (this.isSupportConvertPng && (bArrConvertPng$default = convertPng$default(this, uz0.i010I(sz0Var), false, false, 4, null)) != null) {
            return bArrConvertPng$default;
        }
        Intrinsics.XXI(round);
        return bitmap2Bytes(round);
    }

    public static /* synthetic */ byte[] getPreview$default(BaseDialCustomizeActivity baseDialCustomizeActivity, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreview");
        }
        if ((i2 & 1) != 0) {
            i = R.color.dark;
        }
        return baseDialCustomizeActivity.getPreview(i);
    }

    private final byte[] getPreview707(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2) {
        Bitmap bgBitmap$default = getBgBitmap$default(this, true, 0, 2, null);
        float width = this.screenPreviewWidth / bgBitmap$default.getWidth();
        Bitmap bitmapScale = ImageUtils.scale(bgBitmap$default, width, this.screenPreviewHeight / bgBitmap$default.getHeight());
        Bitmap round = this.isRound ? ImageUtils.toRound(bitmapScale, this.borderSize, getResources().getColor(R.color.dark)) : ImageUtils.toRoundCorner(bitmapScale, this.roundCornerRadius * width, this.borderSize, getResources().getColor(R.color.dark));
        File file = new File(PathUtils.getExternalAppDataPath(), uz0.IXXOO);
        ImageUtils.save(round, file, Bitmap.CompressFormat.PNG);
        Triple<Integer, Integer, byte[]> tripleConvertPng707 = convertPng707(file);
        arrayList.add(new WatchFaceElement(WatchFaceEnumUtil.ElementType.PREVIEW.getValue(), 1, arrayList2.size(), (byte) 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
        arrayList2.add(new WatchFaceResourceDescriptor((byte) 0, tripleConvertPng707.getThird().length, (this.mElementsNumber * 64) + 64 + (this.mResourceDescNumber * 32), new WatchFaceResourceDescriptor.ImageDesc(WatchFaceEnumUtil.INSTANCE.getColorFormat(tripleConvertPng707.getFirst().intValue()), tripleConvertPng707.getFirst().intValue(), tripleConvertPng707.getSecond().intValue(), 0, this.screenPreviewWidth, this.screenPreviewHeight, null, 72, null), 1, null));
        return tripleConvertPng707.getThird();
    }

    private final void getSymbol(String str, int i, int i2, int i3, ArrayList<Element> arrayList) throws IOException {
        ArrayList arrayList2 = new ArrayList();
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str + "/symbol." + this.fileFormat));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str2 = this.fileFormat;
        InputStream inputStreamOpen = getResources().getAssets().open(str + "/symbol." + this.fileFormat);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            arrayList2.add(X1iIIO.XIi00iiXO(str2, bArrX0O, width, 0, 0, false, 56, null));
            arrayList.add(new Element(i, 0, width, height, 9, this.ignoreBlack, i2, i3, 0, 0, 0, (byte[][]) arrayList2.toArray(new byte[0][]), 1794, null));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final void getSymbol2(String str, int i, int i2, int i3, ArrayList<Element> arrayList) throws IOException {
        String str2 = str + "/symbol." + this.fileFormat;
        ArrayList arrayList2 = new ArrayList();
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str2));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        InputStream inputStreamOpen = getResources().getAssets().open(str2);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            File file = new File(uz0.X11iII1O1(sz0.OXO1), str2);
            FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
            byte[] bArrConvertPng$default = convertPng$default(this, file, false, false, 6, null);
            if (bArrConvertPng$default != null) {
                arrayList2.add(bArrConvertPng$default);
            }
            arrayList.add(new Element(i, 1, width, height, 9, this.ignoreBlack, i2, i3, 0, 0, 0, (byte[][]) arrayList2.toArray(new byte[0][]), SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    private final void getTimeDigital(ArrayList<Element> arrayList) throws IOException {
        ArrayList arrayList2 = new ArrayList();
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        InputStream inputStreamOpen = getResources().getAssets().open(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            InputStream inputStreamOpen2 = getResources().getAssets().open(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/pm." + this.fileFormat);
            try {
                Intrinsics.XXI(inputStreamOpen2);
                byte[] bArrX0O2 = ByteStreamsKt.X0O(inputStreamOpen2);
                CloseableKt.OXO1(inputStreamOpen2, null);
                arrayList2.add(X1iIIO.XIi00iiXO(this.fileFormat, bArrX0O, width, 0, 0, false, 56, null));
                arrayList2.add(X1iIIO.XIi00iiXO(this.fileFormat, bArrX0O2, width, 0, 0, false, 56, null));
                arrayList.add(new Element(12, 0, width, height, 9, this.ignoreBlack, (int) this.amLeftX, (int) this.amTopY, 0, 0, 0, (byte[][]) arrayList2.toArray(new byte[0][]), 1794, null));
                Triple numberBuffers$default = getNumberBuffers$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR + "/", 0, 2, null);
                int iIntValue = ((Number) numberBuffers$default.getFirst()).intValue();
                int iIntValue2 = ((Number) numberBuffers$default.getSecond()).intValue();
                byte[][] bArr = (byte[][]) ((Collection) numberBuffers$default.getThird()).toArray(new byte[0][]);
                arrayList.add(new Element(9, 0, iIntValue, iIntValue2, 9, this.ignoreBlack, (int) this.digitalTimeHourLeftX, (int) this.digitalTimeHourTopY, 0, 0, 0, bArr, 1794, null));
                arrayList.add(new Element(10, 0, iIntValue, iIntValue2, 9, this.ignoreBlack, (int) this.digitalTimeMinuteLeftX, (int) this.digitalTimeMinuteTopY, 0, 0, 0, bArr, 1794, null));
                if (this.screenReservedBoundary != 0) {
                    getSymbol(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR, 20, (int) this.digitalTimeSymbolLeftX, (int) this.digitalTimeSymbolTopY, arrayList);
                }
                Triple numberBuffers$default2 = getNumberBuffers$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR + "/", 0, 2, null);
                int iIntValue3 = ((Number) numberBuffers$default2.getFirst()).intValue();
                int iIntValue4 = ((Number) numberBuffers$default2.getSecond()).intValue();
                byte[][] bArr2 = (byte[][]) ((Collection) numberBuffers$default2.getThird()).toArray(new byte[0][]);
                arrayList.add(new Element(7, 0, iIntValue3, iIntValue4, 9, this.ignoreBlack, (int) this.digitalDateMonthLeftX, (int) this.digitalDateMonthTopY, 0, 0, 0, bArr2, 1794, null));
                arrayList.add(new Element(8, 0, iIntValue3, iIntValue4, 9, this.ignoreBlack, (int) this.digitalDateDayLeftX, (int) this.digitalDateDayTopY, 0, 0, 0, bArr2, 1794, null));
                if (this.screenReservedBoundary != 0) {
                    getSymbol(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR, 21, (int) this.digitalDateSymbolLeftX, (int) this.digitalDateSymbolTopY, arrayList);
                }
                Triple<Integer, Integer, ArrayList<byte[]>> numberBuffers = getNumberBuffers(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_WEEK_DIR + "/", 6);
                arrayList.add(new Element(13, 0, numberBuffers.getFirst().intValue(), numberBuffers.getSecond().intValue(), 9, this.ignoreBlack, (int) this.digitalWeekLeftX, (int) this.digitalWeekTopY, 0, 0, 0, (byte[][]) numberBuffers.getThird().toArray(new byte[0][]), 1794, null));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.OXO1(inputStreamOpen2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.OXO1(inputStreamOpen, th3);
                throw th4;
            }
        }
    }

    private final void getTimeDigital2(ArrayList<Element> arrayList) throws IOException {
        ArrayList<Element> arrayList2;
        int i;
        String str = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/am." + this.fileFormat;
        String str2 = this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_AM_DIR + "/pm." + this.fileFormat;
        ArrayList arrayList3 = new ArrayList();
        Bitmap bitmap = ImageUtils.getBitmap(getResources().getAssets().open(str));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        InputStream inputStreamOpen = getResources().getAssets().open(str);
        try {
            Intrinsics.XXI(inputStreamOpen);
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamOpen);
            CloseableKt.OXO1(inputStreamOpen, null);
            InputStream inputStreamOpen2 = getResources().getAssets().open(str2);
            try {
                Intrinsics.XXI(inputStreamOpen2);
                byte[] bArrX0O2 = ByteStreamsKt.X0O(inputStreamOpen2);
                CloseableKt.OXO1(inputStreamOpen2, null);
                sz0 sz0Var = sz0.OXO1;
                File file = new File(uz0.X11iII1O1(sz0Var), str);
                FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
                File file2 = new File(uz0.X11iII1O1(sz0Var), str2);
                FileIOUtils.writeFileFromBytesByStream(file2, bArrX0O2);
                byte[] bArrConvertPng$default = convertPng$default(this, file, false, false, 6, null);
                if (bArrConvertPng$default != null) {
                    arrayList3.add(bArrConvertPng$default);
                }
                byte[] bArrConvertPng$default2 = convertPng$default(this, file2, false, false, 6, null);
                if (bArrConvertPng$default2 != null) {
                    arrayList3.add(bArrConvertPng$default2);
                }
                arrayList.add(new Element(12, 1, width, height, 9, this.ignoreBlack, (int) this.amLeftX, (int) this.amTopY, 0, 0, 0, (byte[][]) arrayList3.toArray(new byte[0][]), SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
                Triple numberBuffers2$default = getNumberBuffers2$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR + "/", 0, 2, null);
                int iIntValue = ((Number) numberBuffers2$default.getFirst()).intValue();
                int iIntValue2 = ((Number) numberBuffers2$default.getSecond()).intValue();
                byte[][] bArr = (byte[][]) ((Collection) numberBuffers2$default.getThird()).toArray(new byte[0][]);
                arrayList.add(new Element(9, 1, iIntValue, iIntValue2, 9, this.ignoreBlack, (int) this.digitalTimeHourLeftX, (int) this.digitalTimeHourTopY, 0, 0, 0, bArr, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
                arrayList.add(new Element(10, 1, iIntValue, iIntValue2, 9, this.ignoreBlack, (int) this.digitalTimeMinuteLeftX, (int) this.digitalTimeMinuteTopY, 0, 0, 0, bArr, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
                if (this.screenReservedBoundary != 0) {
                    arrayList2 = arrayList;
                    i = 0;
                    getSymbol2(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_HOUR_MINUTE_DIR, 20, (int) this.digitalTimeSymbolLeftX, (int) this.digitalTimeSymbolTopY, arrayList2);
                } else {
                    arrayList2 = arrayList;
                    i = 0;
                }
                Triple numberBuffers2$default2 = getNumberBuffers2$default(this, this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR + "/", i, 2, null);
                int iIntValue3 = ((Number) numberBuffers2$default2.getFirst()).intValue();
                int iIntValue4 = ((Number) numberBuffers2$default2.getSecond()).intValue();
                byte[][] bArr2 = (byte[][]) ((Collection) numberBuffers2$default2.getThird()).toArray(new byte[i][]);
                arrayList2.add(new Element(7, 1, iIntValue3, iIntValue4, 9, this.ignoreBlack, (int) this.digitalDateMonthLeftX, (int) this.digitalDateMonthTopY, 0, 0, 0, bArr2, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
                arrayList2.add(new Element(8, 1, iIntValue3, iIntValue4, 9, this.ignoreBlack, (int) this.digitalDateDayLeftX, (int) this.digitalDateDayTopY, 0, 0, 0, bArr2, SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
                if (this.screenReservedBoundary != 0) {
                    getSymbol2(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_DATE_DIR, 21, (int) this.digitalDateSymbolLeftX, (int) this.digitalDateSymbolTopY, arrayList2);
                }
                Triple<Integer, Integer, ArrayList<byte[]>> numberBuffers2 = getNumberBuffers2(this.DIGITAL_DIR + "/" + this.digitalValueColor + "/" + this.DIGITAL_WEEK_DIR + "/", 6);
                arrayList2.add(new Element(13, 1, numberBuffers2.getFirst().intValue(), numberBuffers2.getSecond().intValue(), 9, this.ignoreBlack, (int) this.digitalWeekLeftX, (int) this.digitalWeekTopY, 0, 0, 0, (byte[][]) numberBuffers2.getThird().toArray(new byte[i][]), SubBinId.Bbpro.SECURE_BOOT_LOADER_IMAGE, null));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.OXO1(inputStreamOpen2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.OXO1(inputStreamOpen, th3);
                throw th4;
            }
        }
    }

    private final byte[] getTimeDigital707(ArrayList<WatchFaceElement> arrayList, ArrayList<WatchFaceResourceDescriptor> arrayList2, byte[] bArr) {
        return addDateDigit(arrayList, arrayList2, addTimeNumber(arrayList, arrayList2, addAmPmNumber(arrayList, arrayList2, addWeekNumber(arrayList, arrayList2, bArr))));
    }

    private final byte[] getTransparentBitmapByteArray() {
        Bitmap bgBitmap = getBgBitmap(true, R.color.transparent);
        Bitmap bitmapScale = ImageUtils.scale(bgBitmap, this.screenPreviewWidth / bgBitmap.getWidth(), this.screenPreviewHeight / bgBitmap.getHeight());
        Bitmap round = this.isRound ? ImageUtils.toRound(bitmapScale, this.borderSize, getResources().getColor(R.color.transparent)) : ImageUtils.toRoundCorner(bitmapScale, 30.0f, this.borderSize, getResources().getColor(R.color.transparent));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        round.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.O10IXXX0X(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity, Uri it) throws IOException {
        Intrinsics.X0O(it, "it");
        baseDialCustomizeActivity.toCropPic(it);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(final BaseDialCustomizeActivity baseDialCustomizeActivity, View view) {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1XIOiX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseDialCustomizeActivity.initView$lambda$1$0(this.f2789IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$0(BaseDialCustomizeActivity baseDialCustomizeActivity, BleConnector it) throws IOException {
        Intrinsics.X0O(it, "it");
        baseDialCustomizeActivity.disableOrientation();
        if (q62.OXO1.i01()) {
            DialPickerPopup dialPickerPopup = baseDialCustomizeActivity.dialPickerPopup;
            if (dialPickerPopup != null && dialPickerPopup.isShowing()) {
                return Unit.OXO1;
            }
            DialPickerPopup dialPickerPopup2 = new DialPickerPopup(baseDialCustomizeActivity, baseDialCustomizeActivity.mDialIds, 0, baseDialCustomizeActivity.new C18797iO());
            baseDialCustomizeActivity.dialPickerPopup = dialPickerPopup2;
            View rootView = baseDialCustomizeActivity.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dialPickerPopup2.I1XOi1(rootView);
        } else {
            baseDialCustomizeActivity.mCurSyncDevicePosition = 0;
            baseDialCustomizeActivity.mCurSyncDialId = 10000000;
            baseDialCustomizeActivity.syncDial();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return new i1Ii1i11X(baseDialCustomizeActivity.getMContext(), baseDialCustomizeActivity.new O00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView nestedScrollView_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (NestedScrollView) baseDialCustomizeActivity.findViewById(R.id.nestedScrollView);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    private final void newSendStream() throws IOException {
        ArrayList<WatchFaceElement> arrayList = new ArrayList<>();
        ArrayList<WatchFaceResourceDescriptor> arrayList2 = new ArrayList<>();
        ImageView timePointView = getTimePointView();
        Intrinsics.O10IXXX0X(timePointView, "<get-timePointView>(...)");
        int i = timePointView.getVisibility() == 0 ? 3 : 0;
        ImageView timePointView2 = getTimePointView();
        Intrinsics.O10IXXX0X(timePointView2, "<get-timePointView>(...)");
        int i2 = timePointView2.getVisibility() != 0 ? 0 : 3;
        DialElementView timeDigitalView = getTimeDigitalView();
        Intrinsics.O10IXXX0X(timeDigitalView, "<get-timeDigitalView>(...)");
        int i3 = timeDigitalView.getVisibility() == 0 ? 4 : 0;
        DialElementView timeDigitalView2 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(timeDigitalView2, "<get-timeDigitalView>(...)");
        int i4 = timeDigitalView2.getVisibility() == 0 ? 31 : 0;
        DialElementView controlViewStep = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep, "<get-controlViewStep>(...)");
        int i5 = controlViewStep.getVisibility() == 0 ? 1 : 0;
        DialElementView controlViewStep2 = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep2, "<get-controlViewStep>(...)");
        int i6 = controlViewStep2.getVisibility() == 0 ? 10 : 0;
        DialElementView controlViewHr = getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr, "<get-controlViewHr>(...)");
        int i7 = controlViewHr.getVisibility() == 0 ? 1 : 0;
        DialElementView controlViewHr2 = getControlViewHr();
        Intrinsics.O10IXXX0X(controlViewHr2, "<get-controlViewHr>(...)");
        int i8 = controlViewHr2.getVisibility() == 0 ? 11 : 0;
        DialElementView controlViewCa = getControlViewCa();
        int i9 = i3;
        Intrinsics.O10IXXX0X(controlViewCa, "<get-controlViewCa>(...)");
        int i10 = controlViewCa.getVisibility() == 0 ? 1 : 0;
        int i11 = i;
        DialElementView controlViewCa2 = getControlViewCa();
        Intrinsics.O10IXXX0X(controlViewCa2, "<get-controlViewCa>(...)");
        int i12 = controlViewCa2.getVisibility() == 0 ? 10 : 0;
        DialElementView controlViewDis = getControlViewDis();
        int i13 = i4;
        Intrinsics.O10IXXX0X(controlViewDis, "<get-controlViewDis>(...)");
        int i14 = controlViewDis.getVisibility() == 0 ? 1 : 0;
        DialElementView controlViewDis2 = getControlViewDis();
        Intrinsics.O10IXXX0X(controlViewDis2, "<get-controlViewDis>(...)");
        int i15 = controlViewDis2.getVisibility() == 0 ? 11 : 0;
        this.mElementsNumber = i11 + 2 + i9 + i5 + i7 + i10 + i14;
        this.mResourceDescNumber = i2 + 2 + i13 + i6 + i8 + i12 + i15;
        byte[] bg707 = getBg707(arrayList, arrayList2, getPreview707(arrayList, arrayList2));
        ImageView timePointView3 = getTimePointView();
        Intrinsics.O10IXXX0X(timePointView3, "<get-timePointView>(...)");
        if (timePointView3.getVisibility() == 0) {
            bg707 = getPointer707(WatchFaceEnumUtil.ElementType.POINTER_S.getValue(), this.POINTER_SECOND, arrayList, arrayList2, getPointer707(WatchFaceEnumUtil.ElementType.POINTER_M.getValue(), this.POINTER_MINUTE, arrayList, arrayList2, getPointer707(WatchFaceEnumUtil.ElementType.POINTER_H.getValue(), this.POINTER_HOUR, arrayList, arrayList2, bg707)));
        }
        DialElementView timeDigitalView3 = getTimeDigitalView();
        Intrinsics.O10IXXX0X(timeDigitalView3, "<get-timeDigitalView>(...)");
        if (timeDigitalView3.getVisibility() == 0) {
            bg707 = getTimeDigital707(arrayList, arrayList2, bg707);
        }
        DialElementView controlViewStep3 = getControlViewStep();
        Intrinsics.O10IXXX0X(controlViewStep3, "<get-controlViewStep>(...)");
        if (controlViewStep3.getVisibility() == 0) {
            bg707 = getControl707(arrayList, arrayList2, bg707);
        } else {
            DialElementView controlViewHr3 = getControlViewHr();
            Intrinsics.O10IXXX0X(controlViewHr3, "<get-controlViewHr>(...)");
            if (controlViewHr3.getVisibility() == 0) {
                bg707 = getControl707(arrayList, arrayList2, bg707);
            } else {
                DialElementView controlViewCa3 = getControlViewCa();
                Intrinsics.O10IXXX0X(controlViewCa3, "<get-controlViewCa>(...)");
                if (controlViewCa3.getVisibility() == 0) {
                    bg707 = getControl707(arrayList, arrayList2, bg707);
                } else {
                    DialElementView controlViewDis3 = getControlViewDis();
                    Intrinsics.O10IXXX0X(controlViewDis3, "<get-controlViewDis>(...)");
                    if (controlViewDis3.getVisibility() == 0) {
                        bg707 = getControl707(arrayList, arrayList2, bg707);
                    }
                }
            }
        }
        crcCountAndSend(new WatchFaceHeader(null, this.mCurSyncDialId, 0, 0, (this.isJL707N ? WatchFaceEnumUtil.McuPlatform.JL707N : WatchFaceEnumUtil.McuPlatform.JL701N).getValue(), this.mElementsNumber, this.mResourceDescNumber, 0, 0, 0, null, 1933, null), arrayList, arrayList2, bg707);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void numberOnClick$lambda$0$1(BaseDialCustomizeActivity baseDialCustomizeActivity, View view) {
        baseDialCustomizeActivity.getTimeDigitalView().setVisibility(0);
        baseDialCustomizeActivity.getTimePointView().setVisibility(8);
        baseDialCustomizeActivity.getTimeScaleView().setVisibility(8);
    }

    private final void oldSendStream() throws IOException {
        ArrayList<Element> arrayList = new ArrayList<>();
        if (this.isSupportConvertPng) {
            arrayList.add(new Element(1, 0, this.screenPreviewWidth, this.screenPreviewHeight, 0, this.ignoreBlack, 0, 0, 0, 0, 0, new byte[][]{getPreview$default(this, 0, 1, null)}, 1794, null));
            arrayList.add(new Element(2, 0, this.screenWidth, this.screenHeight + 1, 9, this.ignoreBlack, 0, 0, 0, 0, 0, new byte[][]{getBg()}, 1794, null));
            getControl2(arrayList);
            DialElementView timeDigitalView = getTimeDigitalView();
            Intrinsics.O10IXXX0X(timeDigitalView, "<get-timeDigitalView>(...)");
            if (timeDigitalView.getVisibility() == 0) {
                getTimeDigital2(arrayList);
            }
            ImageView timePointView = getTimePointView();
            Intrinsics.O10IXXX0X(timePointView, "<get-timePointView>(...)");
            if (timePointView.getVisibility() == 0) {
                if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_JL)) {
                    getPointer2(3, this.POINTER_HOUR, arrayList);
                    getPointer2(4, this.POINTER_MINUTE, arrayList);
                    getPointer2(5, this.POINTER_SECOND, arrayList);
                } else {
                    getPointer3(3, this.POINTER_HOUR, arrayList);
                    getPointer3(4, this.POINTER_MINUTE, arrayList);
                    getPointer3(5, this.POINTER_SECOND, arrayList);
                }
            }
        } else {
            arrayList.add(new Element(1, 0, this.screenPreviewWidth, this.screenPreviewHeight, this.X_CENTER | this.Y_CENTER, 0, this.screenWidth / 2, (this.screenHeight / 2) + 2, 0, 0, 0, new byte[][]{getPreview$default(this, 0, 1, null)}, 1826, null));
            byte[] bg = getBg();
            int i = this.screenWidth;
            int i2 = this.screenHeight;
            arrayList.add(new Element(2, 0, i, i2, this.X_CENTER | this.Y_CENTER, 0, i / 2, i2 / 2, 0, 0, 0, new byte[][]{bg}, 1826, null));
            getControl(arrayList);
            DialElementView timeDigitalView2 = getTimeDigitalView();
            Intrinsics.O10IXXX0X(timeDigitalView2, "<get-timeDigitalView>(...)");
            if (timeDigitalView2.getVisibility() == 0) {
                getTimeDigital(arrayList);
            }
            ImageView timePointView2 = getTimePointView();
            Intrinsics.O10IXXX0X(timePointView2, "<get-timePointView>(...)");
            if (timePointView2.getVisibility() == 0) {
                getPointer(3, this.POINTER_HOUR, arrayList);
                getPointer(4, this.POINTER_MINUTE, arrayList);
                getPointer(5, this.POINTER_SECOND, arrayList);
            }
        }
        c72 c72Var = this.mProgressPop;
        if (c72Var != null) {
            c72Var.m1591I1(R.string.dial_generated_sync);
        }
        Iterator<Element> it = arrayList.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            Element next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            LogUtils.m11128d("customize dial length: " + (((double) ((((byte[]) ArraysKt___ArraysKt.IO0(next.getImageBuffers())).length * 10) / 1024)) / 10.0d) + " KB");
        }
        byte[] bArrBuild = WatchFaceBuilder.INSTANCE.build((Element[]) arrayList.toArray(new Element[0]), this.imageFormat);
        this.mCurSendBytes = bArrBuild;
        sz0 sz0Var = sz0.OXO1;
        File fileI010I = uz0.i010I(sz0Var);
        File fileX11iII1O1 = uz0.X11iII1O1(sz0Var);
        BleCache bleCache = BleCache.INSTANCE;
        com.blankj.utilcode.util.FileUtils.copy(fileI010I, new File(fileX11iII1O1, bleCache.getMPrototype() + IiXI1X1OO.O00 + bleCache.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + ".png"));
        int i3 = this.mCurSyncDevicePosition;
        int length = bArrBuild.length;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append(" customize dial bytes size  ");
        sb.append(length);
        LogUtils.m11128d(sb.toString());
        BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, bArrBuild, this.mCurSyncDevicePosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List pointers_delegate$lambda$0() {
        return Util.immutableListOf(new ResourcesIdInfo(R.drawable.dial_customize_point_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_5, 0, false, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return baseDialCustomizeActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button saveDial_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (Button) baseDialCustomizeActivity.findViewById(R.id.saveDial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveRecord() {
        String str;
        if (this.mCurSendBytes == null) {
            return;
        }
        String str2 = BleCache.INSTANCE.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + IiXI1X1OO.O00 + System.currentTimeMillis();
        if (TextUtils.isEmpty(this.mAiBgFile)) {
            str = this.paramName + this.is2DAcceleration + str2;
        } else {
            str = this.paramName + "/AI/" + str2;
        }
        sz0 sz0Var = sz0.OXO1;
        FileIOUtils.writeFileFromBytesByStream(new File(uz0.XXX11i(sz0Var), str + ".png"), getTransparentBitmapByteArray());
        FileIOUtils.writeFileFromBytesByStream(new File(uz0.XXX11i(sz0Var), str), this.mCurSendBytes);
        I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
    }

    private final void selectImagePopup() {
        if (this.mSelectAvatarPopup == null) {
            xz3 xz3Var = new xz3(this);
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI0OO1O
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return BaseDialCustomizeActivity.selectImagePopup$lambda$0$0(this.f7801IO);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXO101O11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return BaseDialCustomizeActivity.selectImagePopup$lambda$0$1(this.f2039IO);
                }
            });
            this.mSelectAvatarPopup = xz3Var;
        }
        xz3 xz3Var2 = this.mSelectAvatarPopup;
        if (xz3Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            xz3Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$0(final BaseDialCustomizeActivity baseDialCustomizeActivity) {
        hr1.OXO1.iOOX010X(baseDialCustomizeActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.I0I0OX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseDialCustomizeActivity.selectImagePopup$lambda$0$0$0(this.f1106IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$0$0(BaseDialCustomizeActivity baseDialCustomizeActivity, boolean z) {
        if (z) {
            baseDialCustomizeActivity.getMCrop().m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectImagePopup$lambda$0$1(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        baseDialCustomizeActivity.getMCrop().OIX0iXi();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDragTip() {
        PopupWindow popupWindow = this.mDragPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_bubble, (ViewGroup) null);
            Intrinsics.X1ii(viewInflate, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout");
            BubbleLayout bubbleLayout = (BubbleLayout) viewInflate;
            bubbleLayout.measure(0, 0);
            ((TextView) bubbleLayout.findViewById(R.id.f51423tv)).setText(R.string.custom_dial_drag_tip);
            bubbleLayout.requestLayout();
            this.mDragPopup = XXiOOOX.OXO1(getMContext(), bubbleLayout);
            bubbleLayout.O00(ArrowDirection.BOTTOM);
            PopupWindow popupWindow2 = this.mDragPopup;
            Intrinsics.XXI(popupWindow2);
            popupWindow2.setOutsideTouchable(true);
            PopupWindow popupWindow3 = this.mDragPopup;
            Intrinsics.XXI(popupWindow3);
            popupWindow3.setWidth(getCustomizeDialBg().getMeasuredWidth() - SizeUtils.dp2px(20.0f));
            int iDp2px = SizeUtils.dp2px(10.0f);
            int measuredHeight = ((-getCustomizeDialBg().getMeasuredHeight()) / 2) - bubbleLayout.getMeasuredHeight();
            PopupWindow popupWindow4 = this.mDragPopup;
            Intrinsics.XXI(popupWindow4);
            bubbleLayout.XOO0ii0((popupWindow4.getWidth() - bubbleLayout.getArrowWidth()) / 2.0f);
            PopupWindow popupWindow5 = this.mDragPopup;
            Intrinsics.XXI(popupWindow5);
            popupWindow5.showAsDropDown(getCustomizeDialBg(), iDp2px, measuredHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncDial() throws IOException {
        if (this.mProgressPop == null) {
            c72 c72Var = new c72(this, 0, 2, null);
            c72Var.m1591I1(R.string.dial_generated_start);
            c72Var.m1592OX(0);
            this.mProgressPop = c72Var;
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            c72Var.I1XOi1(rootView);
            if (q62.OXO1.IiX()) {
                newSendStream();
            } else {
                oldSendStream();
            }
        }
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

    public static /* synthetic */ void syncFailed$default(BaseDialCustomizeActivity baseDialCustomizeActivity, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncFailed");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        baseDialCustomizeActivity.syncFailed(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialElementView timeDigitalView_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (DialElementView) baseDialCustomizeActivity.findViewById(R.id.timeDigitalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView timePointView_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (ImageView) baseDialCustomizeActivity.findViewById(R.id.timePointView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView timeScaleView_delegate$lambda$0(BaseDialCustomizeActivity baseDialCustomizeActivity) {
        return (ImageView) baseDialCustomizeActivity.findViewById(R.id.timeScaleView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCropPic(Uri uri) throws IOException {
        int i = this.screenWidth;
        int i2 = this.screenHeight;
        if (i < 320) {
            i *= 2;
            i2 *= 2;
        }
        int i3 = i;
        int i4 = i2;
        i1O0OXO1O.OXO1.OXO1("toCropPic outputX:" + i3 + " outputY:" + i4 + " " + uri);
        getMCrop().O00(uri, 1.0d, ((double) i3) / ((double) i4), i3, i4);
    }

    public final void bgOnClick(@aa1 View view) {
        List listM39402iI;
        Intrinsics.X0O(view, "view");
        if (TextUtils.isEmpty(this.mAiBgFile)) {
            if (this.mBgPopup == null) {
                final I0OOX i0oox = new I0OOX(this);
                i0oox.X01IiOiIi().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I1iO0IO
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        BaseDialCustomizeActivity.bgOnClick$lambda$0$0(i0oox, this, view2);
                    }
                });
                customizeDialBgItemClick(i0oox);
                this.mBgPopup = i0oox;
            }
            I0OOX i0oox2 = this.mBgPopup;
            if (i0oox2 != null) {
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                i0oox2.I1XOi1(rootView);
                return;
            }
            return;
        }
        SPUtils sPUtilsXO0O10 = a01.OXO1.XO0O10();
        String path = uz0.XOO0ii0(sz0.OXO1).getPath();
        Intrinsics.O10IXXX0X(path, "getPath(...)");
        try {
            JsonArray asJsonArray = JsonParser.parseString(sPUtilsXO0O10.getString(path)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            listM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                listM39402iI.add(new Gson().fromJson(it.next(), String.class));
            }
        } catch (Exception unused) {
            listM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        if (this.mBgFilePickerPopup == null) {
            final DialBgFilePickerPopup dialBgFilePickerPopup = new DialBgFilePickerPopup(this, listM39402iI, new OXO1(listM39402iI));
            dialBgFilePickerPopup.OiIIX101O().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1X01I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDialCustomizeActivity.bgOnClick$lambda$1$0(dialBgFilePickerPopup, this, view2);
                }
            });
            this.mBgFilePickerPopup = dialBgFilePickerPopup;
        }
        DialBgFilePickerPopup dialBgFilePickerPopup2 = this.mBgFilePickerPopup;
        if (dialBgFilePickerPopup2 != null) {
            View rootView2 = getRootView();
            Intrinsics.O10IXXX0X(rootView2, "<get-rootView>(...)");
            dialBgFilePickerPopup2.I1XOi1(rootView2);
        }
    }

    @aa1
    public byte[] bitmap2Bytes(@aa1 Bitmap finalBgBitMap) {
        Intrinsics.X0O(finalBgBitMap, "finalBgBitMap");
        byte[] bArrBitmap2Bytes = ImageUtils.bitmap2Bytes(finalBgBitMap);
        Intrinsics.O10IXXX0X(bArrBitmap2Bytes, "bitmap2Bytes(...)");
        return bArrBitmap2Bytes;
    }

    public final int calculate(@aa1 byte[] bytes) {
        Intrinsics.X0O(bytes, "bytes");
        int i = 0;
        for (byte b : bytes) {
            for (int i2 = 0; i2 < 8; i2++) {
                boolean z = ((b >> (7 - i2)) & 1) == 1;
                boolean z2 = ((i >> 15) & 1) == 1;
                i <<= 1;
                if (z ^ z2) {
                    i ^= 4129;
                }
            }
        }
        return 65535 & i;
    }

    public final void controlOnClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mControlPopup == null) {
            final iOOOIi ioooii = new iOOOIi(this, getColors(), new XIi00iiXO());
            ioooii.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i0IOXOX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ioooii.dismiss();
                }
            });
            ioooii.m2123OX().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OOOiO1X11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDialCustomizeActivity.controlOnClick$lambda$0$1(this.f3292IO, ioooii, view2);
                }
            });
            ioooii.m2122I1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iI01XIO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDialCustomizeActivity.controlOnClick$lambda$0$2(this.f7793IO, ioooii, view2);
                }
            });
            ioooii.iOOX010X().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XX0Ii010
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDialCustomizeActivity.controlOnClick$lambda$0$3(this.f4944IO, ioooii, view2);
                }
            });
            ioooii.X01IiOiIi().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XI1I0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDialCustomizeActivity.controlOnClick$lambda$0$4(this.f4463IO, ioooii, view2);
                }
            });
            this.mControlPopup = ioooii;
        }
        iOOOIi ioooii2 = this.mControlPopup;
        if (ioooii2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            ioooii2.I1XOi1(rootView);
        }
    }

    public abstract void customizeDialBgItemClick(@aa1 I0OOX i0oox);

    @aa1
    public abstract Object customizeDir();

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
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
        return (List) this.colors$delegate.getValue();
    }

    public final int getControlValueInterval() {
        return this.controlValueInterval;
    }

    public final int getControlValueRange() {
        return this.controlValueRange;
    }

    public final DialElementView getControlViewCa() {
        return (DialElementView) this.controlViewCa$delegate.getValue();
    }

    public final DialElementView getControlViewDis() {
        return (DialElementView) this.controlViewDis$delegate.getValue();
    }

    public final DialElementView getControlViewHr() {
        return (DialElementView) this.controlViewHr$delegate.getValue();
    }

    public final DialElementView getControlViewStep() {
        return (DialElementView) this.controlViewStep$delegate.getValue();
    }

    public final ImageViewRound getCustomizeDialBg() {
        return (ImageViewRound) this.customizeDialBg$delegate.getValue();
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
        return (List) this.digitalTimes$delegate.getValue();
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
    public abstract Bitmap getFinalBgBitmap(@aa1 Bitmap bitmap);

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
        return (NestedScrollView) this.nestedScrollView$delegate.getValue();
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
        return (List) this.pointers$delegate.getValue();
    }

    public final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    public final float getRoundCornerRadius() {
        return this.roundCornerRadius;
    }

    public final Button getSaveDial() {
        return (Button) this.saveDial$delegate.getValue();
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
        return (DialElementView) this.timeDigitalView$delegate.getValue();
    }

    public final ImageView getTimePointView() {
        return (ImageView) this.timePointView$delegate.getValue();
    }

    public final ImageView getTimeScaleView() {
        return (ImageView) this.timeScaleView$delegate.getValue();
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        bleConnector.addHandleCallback(this.mBleHandleCallback);
        LogUtils.m11128d("BaseDialCustomizeActivity -> init -> " + LibExKt.X0O(this));
        if (q62.OXO1.i01()) {
            BaseBleConnector.sendData$default(bleConnector, BleKey.WATCHFACE_ID, BleKeyFlag.READ, null, false, false, 28, null);
        }
    }

    public void initView() {
        getAbhTitleCenter().setText(R.string.dial_customize);
        getMCrop().XXI(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.IIIOXOI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseDialCustomizeActivity.initView$lambda$0(this.f1587IO, (Uri) obj);
            }
        });
        DialElementView controlViewStep = getControlViewStep();
        NestedScrollView nestedScrollView = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView, "<get-nestedScrollView>(...)");
        controlViewStep.setScrollView(nestedScrollView);
        DialElementView controlViewHr = getControlViewHr();
        NestedScrollView nestedScrollView2 = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView2, "<get-nestedScrollView>(...)");
        controlViewHr.setScrollView(nestedScrollView2);
        DialElementView controlViewCa = getControlViewCa();
        NestedScrollView nestedScrollView3 = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView3, "<get-nestedScrollView>(...)");
        controlViewCa.setScrollView(nestedScrollView3);
        DialElementView controlViewDis = getControlViewDis();
        NestedScrollView nestedScrollView4 = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView4, "<get-nestedScrollView>(...)");
        controlViewDis.setScrollView(nestedScrollView4);
        DialElementView timeDigitalView = getTimeDigitalView();
        NestedScrollView nestedScrollView5 = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView5, "<get-nestedScrollView>(...)");
        timeDigitalView.setScrollView(nestedScrollView5);
        getControlViewStep().setIsRangeCircle(this.isRound);
        getControlViewHr().setIsRangeCircle(this.isRound);
        getControlViewCa().setIsRangeCircle(this.isRound);
        getControlViewDis().setIsRangeCircle(this.isRound);
        getTimeDigitalView().setIsRangeCircle(this.isRound);
        getSaveDial().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O10OOOXX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseDialCustomizeActivity.initView$lambda$1(this.f2632IO, view);
            }
        });
        String stringExtra = getIntent().getStringExtra("bgFile");
        this.mAiBgFile = stringExtra;
        if (stringExtra != null) {
            Uri uriFromFile = Uri.fromFile(new File(this.mAiBgFile));
            Intrinsics.O10IXXX0X(uriFromFile, "fromFile(...)");
            toCropPic(uriFromFile);
        }
        if (q62.OXO1.O0X()) {
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XIOi0O0i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4568IO.showDragTip();
                }
            }, 500L);
        }
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

    public final void numberOnClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDigitalPopup == null) {
            final X001XXXX x001xxxx = new X001XXXX(this, getColors(), new IiI10X());
            x001xxxx.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IX01Oi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x001xxxx.dismiss();
                }
            });
            x001xxxx.m1061OX().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iX10O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDialCustomizeActivity.numberOnClick$lambda$0$1(this.f8267IO, view2);
                }
            });
            this.mDigitalPopup = x001xxxx;
        }
        X001XXXX x001xxxx2 = this.mDigitalPopup;
        if (x001xxxx2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            x001xxxx2.I1XOi1(rootView);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        LogUtils.m11128d("onActivityResult " + i + " " + i2 + " " + (intent != null ? intent.getData() : null));
        int i3 = this.screenWidth;
        int i4 = this.screenHeight;
        if (i3 < 320) {
            i3 *= 2;
            i4 *= 2;
        }
        int i5 = i3;
        int i6 = i4;
        LogUtils.m11128d("onActivityResult outputX:" + i5 + " outputY:" + i6);
        getMCrop().XOO0ii0(i, i2, intent, 1.0d, ((double) i5) / ((double) i6), i5, i6);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.mProgressPop != null) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            super.onHandleBackPressed();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mProgressPop != null) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            finish();
        }
    }

    public void pointerOnClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mPointerPopup == null) {
            final DialPointerPopup dialPointerPopup = new DialPointerPopup(this, getPointers(), this.scales, new XOO0ii0());
            dialPointerPopup.OiIIX101O().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IOIiO1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dialPointerPopup.dismiss();
                }
            });
            this.mPointerPopup = dialPointerPopup;
        }
        DialPointerPopup dialPointerPopup2 = this.mPointerPopup;
        if (dialPointerPopup2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dialPointerPopup2.I1XOi1(rootView);
        }
    }

    @aa1
    public abstract List<ResourcesIdInfo> scalesList();

    public final void setAmLeftX(float f) {
        this.amLeftX = f;
    }

    public final void setAmTopY(float f) {
        this.amTopY = f;
    }

    public final void setBgFile(@tb1 String str) {
        this.bgFile = str;
    }

    public final void setBorderSize(int i) {
        this.borderSize = i;
    }

    public final void setCaloriesValueCenterX(float f) {
        this.caloriesValueCenterX = f;
    }

    public final void setCaloriesValueCenterY(float f) {
        this.caloriesValueCenterY = f;
    }

    public final void setControlValueInterval(int i) {
        this.controlValueInterval = i;
    }

    public final void setControlValueRange(int i) {
        this.controlValueRange = i;
    }

    public final void setDigitalDateDayLeftX(float f) {
        this.digitalDateDayLeftX = f;
    }

    public final void setDigitalDateDayTopY(float f) {
        this.digitalDateDayTopY = f;
    }

    public final void setDigitalDateMonthLeftX(float f) {
        this.digitalDateMonthLeftX = f;
    }

    public final void setDigitalDateMonthTopY(float f) {
        this.digitalDateMonthTopY = f;
    }

    public final void setDigitalDateSymbolLeftX(float f) {
        this.digitalDateSymbolLeftX = f;
    }

    public final void setDigitalDateSymbolTopY(float f) {
        this.digitalDateSymbolTopY = f;
    }

    public final void setDigitalTimeHourLeftX(float f) {
        this.digitalTimeHourLeftX = f;
    }

    public final void setDigitalTimeHourTopY(float f) {
        this.digitalTimeHourTopY = f;
    }

    public final void setDigitalTimeMinuteLeftX(float f) {
        this.digitalTimeMinuteLeftX = f;
    }

    public final void setDigitalTimeMinuteRightX(float f) {
        this.digitalTimeMinuteRightX = f;
    }

    public final void setDigitalTimeMinuteTopY(float f) {
        this.digitalTimeMinuteTopY = f;
    }

    public final void setDigitalTimeSymbolLeftX(float f) {
        this.digitalTimeSymbolLeftX = f;
    }

    public final void setDigitalTimeSymbolTopY(float f) {
        this.digitalTimeSymbolTopY = f;
    }

    public final void setDigitalValueColor(int i) {
        this.digitalValueColor = i;
    }

    public final void setDigitalWeekLeftX(float f) {
        this.digitalWeekLeftX = f;
    }

    public final void setDigitalWeekTopY(float f) {
        this.digitalWeekTopY = f;
    }

    public final void setDistanceValueCenterX(float f) {
        this.distanceValueCenterX = f;
    }

    public final void setDistanceValueCenterY(float f) {
        this.distanceValueCenterY = f;
    }

    public final void setFileFormat(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileFormat = str;
    }

    public final void setHeartRateValueCenterX(float f) {
        this.heartRateValueCenterX = f;
    }

    public final void setHeartRateValueCenterY(float f) {
        this.heartRateValueCenterY = f;
    }

    public final void setIgnoreBlack(int i) {
        this.ignoreBlack = i;
    }

    public final void setImageFormat(int i) {
        this.imageFormat = i;
    }

    public final void setMCurSendBytes(@tb1 byte[] bArr) {
        this.mCurSendBytes = bArr;
    }

    public final void setMElementsNumber(int i) {
        this.mElementsNumber = i;
    }

    public final void setMResourceDescNumber(int i) {
        this.mResourceDescNumber = i;
    }

    public final void setPointerSelectNumber(int i) {
        this.pointerSelectNumber = i;
    }

    public final void setRound(boolean z) {
        this.isRound = z;
    }

    public final void setRoundCornerRadius(float f) {
        this.roundCornerRadius = f;
    }

    public final void setScaleSelectNumber(int i) {
        this.scaleSelectNumber = i;
    }

    public final void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public final void setScreenPreviewHeight(int i) {
        this.screenPreviewHeight = i;
    }

    public final void setScreenPreviewWidth(int i) {
        this.screenPreviewWidth = i;
    }

    public final void setScreenReservedBoundary(int i) {
        this.screenReservedBoundary = i;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    public final void setStepValueCenterX(float f) {
        this.stepValueCenterX = f;
    }

    public final void setStepValueCenterY(float f) {
        this.stepValueCenterY = f;
    }

    public final void setSupportConvertPng(boolean z) {
        this.isSupportConvertPng = z;
    }

    public final void setValueColor(int i) {
        this.valueColor = i;
    }

    public final void setX_CENTER(int i) {
        this.X_CENTER = i;
    }

    public final void setY_CENTER(int i) {
        this.Y_CENTER = i;
    }
}
