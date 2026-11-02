package com.sma.smartv3.p610ui.device.dialpay;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OOX1XIiOI;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXiIO0i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AccountCreateOrder;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.model.SyncStatus;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceDetail;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.dial.DialPickerPopup;
import com.sma.smartv3.p610ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
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
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n19#2:866\n15#2:867\n11#2,2:868\n19#2:889\n15#2:890\n11#2,2:891\n19#2:913\n15#2:914\n11#2,2:915\n87#3,7:870\n94#3,3:878\n70#3,7:881\n97#3:888\n87#3,7:893\n94#3,3:901\n70#3,7:904\n97#3:911\n1#4:877\n1#4:900\n1#4:912\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n*L\n323#1:866\n323#1:867\n324#1:868,2\n469#1:889\n469#1:890\n470#1:891,2\n604#1:913\n604#1:914\n605#1:915,2\n341#1:870,7\n341#1:878,3\n341#1:881,7\n341#1:888\n475#1:893,7\n475#1:901,3\n475#1:904,7\n475#1:911\n341#1:877\n475#1:900\n*E\n"})
public final class WatchFaceDialPayDetailActivity extends BaseActivity {

    @tb1
    private DialPickerPopup dialPickerPopup;
    private boolean isNeedPayDialog;
    private boolean isPaySuccess;
    private float mAmount;
    private float mAmountMember;
    private float mAmountOriginal;

    @tb1
    private go0 mConfirmPopup;
    private int mCurSyncCompleted;
    private int mCurSyncDevicePosition;
    private int mCurSyncDialId;
    private int mCurSyncPosition;
    private int mCurSyncTotal;
    private boolean mDialDiscount;
    private boolean mDialIsLimitFreeFlag;
    private boolean mDialIsVipFreeFlag;
    private int mDialType;

    @tb1
    private I0iiIOX mEvaluationPopup;

    @tb1
    private go0 mLoginHintPopup;

    @tb1
    private go0 mPayconfirmPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.po6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.rootView_delegate$lambda$0(this.f10412IO);
        }
    });

    @aa1
    private final Lazy dialIv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.dialIv_delegate$lambda$0(this.f11778IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.abhTitleCenter_delegate$lambda$0(this.f12007IO);
        }
    });

    @aa1
    private final Lazy btnView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.btnView_delegate$lambda$0(this.f12651IO);
        }
    });

    @aa1
    private final Lazy progressButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ao6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.progressButton_delegate$lambda$0(this.f5529IO);
        }
    });

    @aa1
    private final Lazy dialNew$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.dialNew_delegate$lambda$0(this.f5778IO);
        }
    });

    @aa1
    private final Lazy tvAmount$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.co6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.tvAmount_delegate$lambda$0(this.f6023IO);
        }
    });

    @aa1
    private final Lazy tvMemory$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.do6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.tvMemory_delegate$lambda$0(this.f6235IO);
        }
    });

    @aa1
    private final Lazy tvLimitedFree$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.tvLimitedFree_delegate$lambda$0(this.f6459IO);
        }
    });

    @aa1
    private final Lazy tvAlsoLike$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.tvAlsoLike_delegate$lambda$0(this.f6693IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.mRecyclerView_delegate$lambda$0(this.f10647IO);
        }
    });

    @aa1
    private final Lazy mNestedScrollView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ro6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.mNestedScrollView_delegate$lambda$0(this.f10862IO);
        }
    });

    @aa1
    private final Lazy mPrecautionsTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.so6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.mPrecautionsTitle_delegate$lambda$0(this.f11099IO);
        }
    });

    @aa1
    private final Lazy mOpenMembership$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.to6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.mOpenMembership_delegate$lambda$0(this.f11319IO);
        }
    });

    @aa1
    private final Lazy mOpenMembershipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uo6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayDetailActivity.mOpenMembershipLayout_delegate$lambda$0(this.f11540IO);
        }
    });

    @aa1
    private String mDialMemberAttr = "";

    @aa1
    private final String TAG = "WatchFaceDialPayDetailActivity";

    @aa1
    private String mPayStatus = "";

    @aa1
    private String previewUrl = "";

    @aa1
    private String binUrl = "";
    private int mItemPosition = -1;

    @aa1
    private final List<Integer> mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(0);

    @aa1
    private String mBinFileName = "";

    @aa1
    private String orderNum = "";

    @aa1
    private SyncStatus mCurSyncStatus = SyncStatus.NO_SYNC;

    @aa1
    private final C18808iO mBleHandleCallback = new C18808iO();

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[SyncStatus.values().length];
            try {
                iArr[SyncStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncStatus.NO_SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncStatus.SYNCING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SyncStatus.SYNCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements iXiIO0i {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.iXiIO0i
        public void OXO1(int i) {
            WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity = WatchFaceDialPayDetailActivity.this;
            int mArg1 = watchFaceDialPayDetailActivity.getMArg1();
            int mItemPosition = WatchFaceDialPayDetailActivity.this.getMItemPosition();
            ProgressButtonV2 progressButton = WatchFaceDialPayDetailActivity.this.getProgressButton();
            Intrinsics.O10IXXX0X(progressButton, "access$getProgressButton(...)");
            watchFaceDialPayDetailActivity.syncDial(mArg1, mItemPosition, i, progressButton, WatchFaceDialPayDetailActivity.this.getBinUrl(), WatchFaceDialPayDetailActivity.this.getPreviewUrl(), WatchFaceDialPayDetailActivity.this.getMDialType());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity$iO */
    @SourceDebugExtension({"SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,865:1\n1869#2,2:866\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$mBleHandleCallback$1\n*L\n157#1:866,2\n*E\n"})
    public static final class C18808iO implements BleHandleCallback {
        public C18808iO() {
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
                WatchFaceDialPayDetailActivity.this.mCurSyncStatus = SyncStatus.FAILED;
                ToastUtils.showLong(OOX00.OXO1.OXO1(0), new Object[0]);
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
            WatchFaceDialPayDetailActivity.this.mDialIds.clear();
            List<Integer> mIdList = watchFaceId.getMIdList();
            WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity = WatchFaceDialPayDetailActivity.this;
            Iterator<T> it = mIdList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue <= 0) {
                    watchFaceDialPayDetailActivity.mDialIds.add(0);
                } else {
                    watchFaceDialPayDetailActivity.mDialIds.add(Integer.valueOf(iIntValue));
                }
            }
            LogUtils.m11128d("mDialIds -> " + WatchFaceDialPayDetailActivity.this.mDialIds);
            WatchFaceDialPayDetailActivity.this.initSynced();
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
            if (WatchFaceDialPayDetailActivity.this.mCurSyncDialId == 0 || WatchFaceDialPayDetailActivity.this.mCurSyncStatus != SyncStatus.SYNCING) {
                return;
            }
            WatchFaceDialPayDetailActivity.this.mCurSyncStatus = SyncStatus.FAILED;
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
            if (bleKey != BleKey.WATCH_FACE) {
                return;
            }
            if (z) {
                WatchFaceDialPayDetailActivity.this.mCurSyncStatus = SyncStatus.SYNCING;
                BleInitializer bleInitializer = BleInitializer.f51208IO;
                bleInitializer.I1Ii(true);
                if (i2 == i3) {
                    WatchFaceDialPayDetailActivity.this.mCurSyncStatus = SyncStatus.SYNCED;
                    WatchFaceDialPayDetailActivity.this.mDialIds.set(WatchFaceDialPayDetailActivity.this.mCurSyncDevicePosition, Integer.valueOf(WatchFaceDialPayDetailActivity.this.mCurSyncDialId));
                    if (!q62.OXO1.i01()) {
                        a01.OXO1.XIi00iiXO().put("syncId", WatchFaceDialPayDetailActivity.this.mCurSyncDialId);
                    }
                    I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
                    WatchFaceDialPayDetailActivity.this.onShowEvaluationStatus();
                    bleInitializer.I1Ii(false);
                }
            } else {
                WatchFaceDialPayDetailActivity.this.mCurSyncStatus = SyncStatus.FAILED;
                WatchFaceDialPayDetailActivity.this.handleErrorCode(i);
                BleInitializer.f51208IO.I1Ii(false);
                WatchFaceDialPayDetailActivity.this.mDialIds.set(WatchFaceDialPayDetailActivity.this.mCurSyncDevicePosition, 0);
                if (!q62.OXO1.i01()) {
                    a01.OXO1.XIi00iiXO().put("syncId", 0);
                }
            }
            WatchFaceDialPayDetailActivity.this.mCurSyncTotal = i2;
            WatchFaceDialPayDetailActivity.this.mCurSyncCompleted = i3;
            WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity = WatchFaceDialPayDetailActivity.this;
            ProgressButtonV2 progressButton = watchFaceDialPayDetailActivity.getProgressButton();
            Intrinsics.O10IXXX0X(progressButton, "access$getProgressButton(...)");
            watchFaceDialPayDetailActivity.syncStatusChange(progressButton, WatchFaceDialPayDetailActivity.this.mCurSyncStatus);
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity$onBottomClick$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity$onBottomClick$1", m39466f = "WatchFaceDialPayDetailActivity.kt", m39467i = {}, m39468l = {267}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$onBottomClick$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n87#2,7:866\n94#2,3:874\n70#2,7:877\n97#2:884\n1#3:873\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$onBottomClick$1\n*L\n292#1:866,7\n292#1:874,3\n292#1:877,7\n292#1:884\n292#1:873\n*E\n"})
    public static final class C188101 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C188101(Continuation<? super C188101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchFaceDialPayDetailActivity.this.new C188101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C188101) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                obj = WatchFaceDialPayDetailActivityKt.OXO1(this);
                if (obj == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                if (q62.OXO1.IX0()) {
                    new OOX1XIiOI(WatchFaceDialPayDetailActivity.this).IIX1OXO();
                } else {
                    ToastUtils.showLong(R.string.dial_error_failure_2_2);
                }
                return Unit.OXO1;
            }
            if (WatchFaceDialPayDetailActivity.this.getMAmount() == 0.0f || XXiO.XO0O10(WatchFaceDialPayDetailActivity.this.getMPayStatus())) {
                WatchFaceDialPayDetailActivity.this.detailSyncDial();
            } else {
                i72 i72Var = i72.OXO1;
                if (!i72Var.iOIi00Ii()) {
                    WatchFaceDialPayDetailActivity.this.showLoginHint();
                } else if (WatchFaceDialPayDetailActivity.this.mDialIsLimitFreeFlag) {
                    WatchFaceDialPayDetailActivity.this.detailSyncDial();
                } else if (WatchFaceDialPayDetailActivity.this.mDialIsVipFreeFlag) {
                    if (i72Var.m2044Ii()) {
                        WatchFaceDialPayDetailActivity.this.detailSyncDial();
                    } else {
                        WatchFaceDialPayDetailActivity.this.goCreateOrder();
                    }
                } else if (Intrinsics.XOO0ii0(WatchFaceDialPayDetailActivity.this.mDialMemberAttr, "1") && !i72Var.m2044Ii()) {
                    WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity = WatchFaceDialPayDetailActivity.this;
                    OrderManager orderManager = OrderManager.OXO1;
                    String strX11iII1O1 = OrderManager.X11iII1O1(orderManager, null, orderManager.iOO1ii1(), 1, null);
                    Bundle bundle = new Bundle();
                    bundle.putString("mArg0", strX11iII1O1);
                    bundle.putInt("mArg1", 2);
                    bundle.putParcelable("mArg2", null);
                    bundle.putSerializable("mArg3", null);
                    Intent intent = new Intent(watchFaceDialPayDetailActivity, (Class<?>) GoogleWebViewActivity.class);
                    intent.putExtras(bundle);
                    watchFaceDialPayDetailActivity.startActivity(intent);
                } else if (WatchFaceDialPayDetailActivity.this.isPaySuccess) {
                    WatchFaceDialPayDetailActivity.this.detailSyncDial();
                } else {
                    WatchFaceDialPayDetailActivity.this.goCreateOrder();
                }
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (PFMedium) watchFaceDialPayDetailActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnView_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return watchFaceDialPayDetailActivity.findViewById(R.id.dial_pay_detail_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detailSyncDial$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Intrinsics.X1ii(watchFaceDialPayDetailActivity, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity");
        watchFaceDialPayDetailActivity.disableOrientation();
        if (q62.OXO1.i01()) {
            DialPickerPopup dialPickerPopup = watchFaceDialPayDetailActivity.dialPickerPopup;
            if (dialPickerPopup != null && dialPickerPopup.isShowing()) {
                return Unit.OXO1;
            }
            DialPickerPopup dialPickerPopup2 = new DialPickerPopup(watchFaceDialPayDetailActivity, watchFaceDialPayDetailActivity.mDialIds, watchFaceDialPayDetailActivity.mDialType, watchFaceDialPayDetailActivity.new XIi00iiXO());
            watchFaceDialPayDetailActivity.dialPickerPopup = dialPickerPopup2;
            View rootView = watchFaceDialPayDetailActivity.getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dialPickerPopup2.I1XOi1(rootView);
        } else {
            int mArg1 = watchFaceDialPayDetailActivity.getMArg1();
            ProgressButtonV2 progressButton = watchFaceDialPayDetailActivity.getProgressButton();
            Intrinsics.O10IXXX0X(progressButton, "<get-progressButton>(...)");
            watchFaceDialPayDetailActivity.syncDial(mArg1, -1, 0, progressButton, watchFaceDialPayDetailActivity.binUrl, watchFaceDialPayDetailActivity.previewUrl, watchFaceDialPayDetailActivity.mDialType);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dialIv_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (ImageView) watchFaceDialPayDetailActivity.findViewById(R.id.f51417iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View dialNew_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return watchFaceDialPayDetailActivity.findViewById(R.id.item_dial_pay_detail_new);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final View getBtnView() {
        return (View) this.btnView$delegate.getValue();
    }

    private final ImageView getDialIv() {
        return (ImageView) this.dialIv$delegate.getValue();
    }

    private final View getDialNew() {
        return (View) this.dialNew$delegate.getValue();
    }

    private final NestedScrollView getMNestedScrollView() {
        return (NestedScrollView) this.mNestedScrollView$delegate.getValue();
    }

    private final ProgressButtonV2 getMOpenMembership() {
        return (ProgressButtonV2) this.mOpenMembership$delegate.getValue();
    }

    private final View getMOpenMembershipLayout() {
        return (View) this.mOpenMembershipLayout$delegate.getValue();
    }

    private final TextView getMPrecautionsTitle() {
        return (TextView) this.mPrecautionsTitle$delegate.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderStatus$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, boolean z) {
        if (z) {
            watchFaceDialPayDetailActivity.isPaySuccess = true;
            ToastUtils.showLong(R.string.pay_success_dial_itp);
            watchFaceDialPayDetailActivity.detailSyncDial();
        } else {
            ToastUtils.showLong(R.string.pay_confirm_error);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressButtonV2 getProgressButton() {
        return (ProgressButtonV2) this.progressButton$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final TextView getTvAlsoLike() {
        return (TextView) this.tvAlsoLike$delegate.getValue();
    }

    private final TextView getTvAmount() {
        return (TextView) this.tvAmount$delegate.getValue();
    }

    private final TextView getTvLimitedFree() {
        return (TextView) this.tvLimitedFree$delegate.getValue();
    }

    private final TextView getTvMemory() {
        return (TextView) this.tvMemory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWatchFaceDetail$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, WatchFaceDetail watchFaceDetail) {
        if (watchFaceDetail != null) {
            TextView tvMemory = watchFaceDialPayDetailActivity.getTvMemory();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.2fMB", Arrays.copyOf(new Object[]{watchFaceDetail.getFileSize()}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            tvMemory.setText(str);
            i72 i72Var = i72.OXO1;
            watchFaceDialPayDetailActivity.mAmountOriginal = i72Var.m2049OX() ? watchFaceDetail.getDollar() : watchFaceDetail.getAmount();
            watchFaceDialPayDetailActivity.mAmountMember = i72Var.m2049OX() ? watchFaceDetail.getDollarDis() : watchFaceDetail.getAmountDis();
            watchFaceDialPayDetailActivity.mAmount = (Intrinsics.XOO0ii0(watchFaceDetail.getMemberAttr(), "2") && i72Var.m2044Ii()) ? watchFaceDialPayDetailActivity.mAmountMember : watchFaceDialPayDetailActivity.mAmountOriginal;
            String payStatus = watchFaceDetail.getPayStatus();
            if (payStatus == null) {
                payStatus = "";
            }
            watchFaceDialPayDetailActivity.mPayStatus = payStatus;
            watchFaceDialPayDetailActivity.previewUrl = watchFaceDetail.getPreviewUrl();
            watchFaceDialPayDetailActivity.binUrl = watchFaceDetail.getBinUrl();
            watchFaceDialPayDetailActivity.mDialType = watchFaceDetail.getDialType();
            watchFaceDialPayDetailActivity.getBtnView().setVisibility(0);
            if (!Intrinsics.XOO0ii0(watchFaceDetail.getPreviewUrl(), watchFaceDialPayDetailActivity.getMArg0())) {
                Glide.with((FragmentActivity) watchFaceDialPayDetailActivity).load(watchFaceDetail.getPreviewUrl()).into(watchFaceDialPayDetailActivity.getDialIv());
            }
            watchFaceDialPayDetailActivity.getDialNew().setVisibility((watchFaceDetail.getNewFlag() && i72Var.X1i()) ? 0 : 8);
            watchFaceDialPayDetailActivity.setViewText(watchFaceDetail.getLimitFreeFlag(), watchFaceDetail.getMemberAttr());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goCreateOrder() {
        OrderManager.OXO1.OXO1("WatchFace", String.valueOf(getMArg1()), this, new Function1() { // from class: com.android.mltcode.paycertificationapi.ho6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceDialPayDetailActivity.goCreateOrder$lambda$0(this.f7169IO, (AccountCreateOrder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goCreateOrder$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, AccountCreateOrder accountCreateOrder) {
        if (accountCreateOrder != null) {
            String orderNum = accountCreateOrder.getOrderNum();
            watchFaceDialPayDetailActivity.orderNum = orderNum;
            watchFaceDialPayDetailActivity.isNeedPayDialog = true;
            String strIIiiO = OrderManager.iIiiO(OrderManager.OXO1, orderNum, "WatchFace", null, 4, null);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strIIiiO);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(watchFaceDialPayDetailActivity, (Class<?>) GoogleWebViewActivity.class);
            intent.putExtras(bundle);
            watchFaceDialPayDetailActivity.startActivity(intent);
        } else {
            ToastUtils.showLong(watchFaceDialPayDetailActivity.getString(R.string.fail_order), new Object[0]);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorCode(int i) {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            if (i == 2 && q62.OXO1.IX0()) {
                new OOX1XIiOI(this).IIX1OXO();
            } else {
                ToastUtils.showLong(OOX00.OXO1.m920iO(i), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        this.isPaySuccess = false;
        String mArg0 = getMArg0();
        if (mArg0 != null && mArg0.length() > 0) {
            Glide.with((FragmentActivity) this).load(getMArg0()).into(getDialIv());
        }
        if (getMArg3() != null) {
            Serializable mArg3 = getMArg3();
            Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.WatchFaceCategoryV2");
            WatchFaceCategoryV2 watchFaceCategoryV2 = (WatchFaceCategoryV2) mArg3;
            String payStatus = watchFaceCategoryV2.getPayStatus();
            if (payStatus == null) {
                payStatus = "";
            }
            this.mPayStatus = payStatus;
            i72 i72Var = i72.OXO1;
            this.mAmountOriginal = i72Var.m2049OX() ? watchFaceCategoryV2.getDollar() : watchFaceCategoryV2.getAmount();
            this.mAmountMember = i72Var.m2049OX() ? watchFaceCategoryV2.getDollarDis() : watchFaceCategoryV2.getAmountDis();
            this.mAmount = (Intrinsics.XOO0ii0(watchFaceCategoryV2.getMemberAttr(), "2") && i72Var.m2044Ii()) ? this.mAmountMember : this.mAmountOriginal;
            this.previewUrl = watchFaceCategoryV2.getPreviewUrl();
            this.binUrl = watchFaceCategoryV2.getBinUrl();
            String dialType = watchFaceCategoryV2.getDialType();
            this.mDialType = dialType != null ? Integer.parseInt(dialType) : 0;
            getBtnView().setVisibility(0);
            getTvMemory().setText("");
            setViewText(watchFaceCategoryV2.getLimitFreeFlag(), watchFaceCategoryV2.getMemberAttr());
        } else {
            getBtnView().setVisibility(4);
        }
        getWatchFaceDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, View view) {
        OrderManager orderManager = OrderManager.OXO1;
        String strX11iII1O1 = OrderManager.X11iII1O1(orderManager, null, orderManager.iOO1ii1(), 1, null);
        if (strX11iII1O1.length() != 0) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strX11iII1O1);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(watchFaceDialPayDetailActivity, (Class<?>) GoogleWebViewActivity.class);
            intent.putExtras(bundle);
            watchFaceDialPayDetailActivity.startActivity(intent);
            return;
        }
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
        i72.OXO1.Oi1I(watchFaceDialPayDetailActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
        if (watchFaceCategoryV2Arr == null) {
            return Unit.OXO1;
        }
        watchFaceDialPayDetailActivity.getTvAlsoLike().setVisibility(watchFaceCategoryV2Arr.length == 0 ? 8 : 0);
        watchFaceDialPayDetailActivity.getMRecyclerView().setLayoutManager(new GridLayoutManager(watchFaceDialPayDetailActivity.getMContext(), 3));
        watchFaceDialPayDetailActivity.getMRecyclerView().setAdapter(new WatchFaceDialPayDetailActivity$initView$2$mAdapter$1(watchFaceDialPayDetailActivity, watchFaceDialPayDetailActivity.getMContext(), ArraysKt___ArraysKt.OXI0X0(watchFaceCategoryV2Arr)));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView mNestedScrollView_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (NestedScrollView) watchFaceDialPayDetailActivity.findViewById(R.id.dial_watchface_detail_scrollview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mOpenMembershipLayout_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return watchFaceDialPayDetailActivity.findViewById(R.id.open_membership_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressButtonV2 mOpenMembership_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (ProgressButtonV2) watchFaceDialPayDetailActivity.findViewById(R.id.open_membership);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mPrecautionsTitle_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (TextView) watchFaceDialPayDetailActivity.findViewById(R.id.dial_qrcode_sycn_title3_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (RecyclerView) watchFaceDialPayDetailActivity.findViewById(R.id.recycler_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressButtonV2 progressButton_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (ProgressButtonV2) watchFaceDialPayDetailActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return watchFaceDialPayDetailActivity.findViewById(R.id.rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDial(File file) {
        this.mCurSyncStatus = SyncStatus.SYNCING;
        q62 q62Var = q62.OXO1;
        if (q62Var.i01()) {
            BaseBleConnector.sendInt32$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.UPDATE, this.mCurSyncDialId, null, false, false, 56, null);
        } else {
            BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, file, this.mCurSyncDevicePosition);
            q62Var.XO10X();
        }
    }

    public static /* synthetic */ void sendDial$default(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            file = uz0.O00(sz0.OXO1, watchFaceDialPayDetailActivity.mBinFileName);
        }
        watchFaceDialPayDetailActivity.sendDial(file);
    }

    public static /* synthetic */ void setViewText$default(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        watchFaceDialPayDetailActivity.setViewText(z, str);
    }

    private final void showConfirm() {
        if (this.mConfirmPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.login_required_tip);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.successful_confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.oo6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(WatchFaceDialPayDetailActivity.showConfirm$lambda$0$0(this.f10187IO));
                }
            });
            this.mConfirmPopup = go0Var;
        }
        go0 go0Var2 = this.mConfirmPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showConfirm$lambda$0$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
        i72.OXO1.Oi1I(watchFaceDialPayDetailActivity);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoginHint() {
        if (this.mLoginHintPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.login_reminder);
            go0Var.IXXOO(1);
            go0Var.m1865iX(Integer.valueOf(R.string.login_reminder_tip));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.mo6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(WatchFaceDialPayDetailActivity.showLoginHint$lambda$0$0(this.f9756IO));
                }
            });
            this.mLoginHintPopup = go0Var;
        }
        go0 go0Var2 = this.mLoginHintPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoginHint$lambda$0$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
        i72.OXO1.OiXXXi10(watchFaceDialPayDetailActivity.getMContext());
        return true;
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.payment_completed_tip);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.yn6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(WatchFaceDialPayDetailActivity.showPayConfirm$lambda$0$0(this.f12410IO));
                }
            });
            go0Var.X1IX(R.string.yes_payment, new Function0() { // from class: com.android.mltcode.paycertificationapi.jo6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(WatchFaceDialPayDetailActivity.showPayConfirm$lambda$0$1(this.f9019IO));
                }
            });
            this.mPayconfirmPopup = go0Var;
        }
        go0 go0Var2 = this.mPayconfirmPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayConfirm$lambda$0$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        watchFaceDialPayDetailActivity.getWatchFaceDetail();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayConfirm$lambda$0$1(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        watchFaceDialPayDetailActivity.getOrderStatus();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncDial(final int i, int i2, int i3, final ProgressButtonV2 progressButtonV2, final String str, final String str2, final int i4) {
        String absolutePath;
        File file;
        File file2;
        WatchFaceManager.OXO1.OXO1(String.valueOf(i));
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("syncDial -> position:" + i2 + ", mCurSyncPosition:" + i3 + ", mCurSyncDialId:" + i + "  category = " + i4);
        this.mCurSyncDialId = i;
        this.mCurSyncPosition = i2;
        this.mCurSyncStatus = SyncStatus.DOWNLOAD;
        this.mCurSyncDevicePosition = i3;
        float f = this.mAmount;
        BleCache bleCache = BleCache.INSTANCE;
        this.mBinFileName = f + IiXI1X1OO.O00 + bleCache.getMPrototype() + IiXI1X1OO.O00 + bleCache.getMBleName() + IiXI1X1OO.O00 + i + ".bin";
        if (this.mAmount == 0.0f) {
            sz0 sz0Var = sz0.OXO1;
            absolutePath = uz0.X01IiOiIi(sz0Var).getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            file = new File(uz0.X01IiOiIi(sz0Var), this.mBinFileName);
            file2 = new File(uz0.X01IiOiIi(sz0Var), this.mAmount + IiXI1X1OO.O00 + bleCache.getMPrototype() + IiXI1X1OO.O00 + bleCache.getMBleName() + IiXI1X1OO.O00 + i);
        } else {
            sz0 sz0Var2 = sz0.OXO1;
            absolutePath = uz0.XXX11i(sz0Var2) + "/" + bleCache.getMPrototype() + "/PAY";
            file = new File(uz0.XXX11i(sz0Var2), bleCache.getMPrototype() + "/PAY/" + this.mBinFileName);
            file2 = new File(uz0.XXX11i(sz0Var2), bleCache.getMPrototype() + "/PAY/" + this.mAmount + IiXI1X1OO.O00 + bleCache.getMPrototype() + IiXI1X1OO.O00 + bleCache.getMBleName() + IiXI1X1OO.O00 + i);
        }
        final File file3 = file2;
        String str3 = absolutePath;
        if (!file.exists()) {
            ProgressButtonV2.IiI10X(progressButtonV2, R.string.downloading, false, 0, false, 0, null, 62, null);
            final File file4 = file;
            NetWorkUtils.INSTANCE.download(str, str3, this.mBinFileName, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity.syncDial.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str4) throws Throwable {
                    i1O0OXO1O.OXO1.OXO1("syncDial -> dial try get from net");
                    StatManager.OXO1.XO0O10(str, FileUtils.getLength(file4), i4, i);
                    if (!FileUtils.isFileExists(file3)) {
                        FileUtils.createOrExistsFile(file3);
                        FileIOUtils.writeFileFromString(file3, str2, false);
                    }
                    ProgressButtonV2.IiI10X(progressButtonV2, R.string.syncing, false, 0, false, 0, null, 62, null);
                    this.sendDial(file4);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    FileUtils.delete(file4);
                    FileUtils.delete(file3);
                    this.mCurSyncStatus = SyncStatus.FAILED;
                    ProgressButtonV2.IiI10X(progressButtonV2, R.string.sync_failed, false, 0, false, 0, null, 62, null);
                    ToastUtils.showLong(OOX00.OXO1.OXO1(1), new Object[0]);
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i5) {
                }
            });
            return;
        }
        i1o0oxo1o.OXO1("syncDial -> dial try get from dialFile file = " + this.mBinFileName + " size:" + FileUtils.getSize(file));
        ProgressButtonV2.IiI10X(progressButtonV2, R.string.syncing, false, 0, false, 0, null, 62, null);
        sendDial(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncStatusChange(ProgressButtonV2 progressButtonV2, SyncStatus syncStatus) {
        int i = OXO1.OXO1[syncStatus.ordinal()];
        if (i == 1) {
            ProgressButtonV2.IiI10X(progressButtonV2, R.string.sync_failed, false, 0, false, 0, null, 62, null);
            return;
        }
        if (i == 2) {
            ProgressButtonV2.IiI10X(progressButtonV2, R.string.sync, false, 0, false, 0, null, 62, null);
        } else if (i == 3) {
            progressButtonV2.setProgressDecimalPlaces(this.mCurSyncCompleted / this.mCurSyncTotal);
        } else {
            if (i != 4) {
                return;
            }
            ProgressButtonV2.IiI10X(progressButtonV2, R.string.synced, true, 0, false, 0, null, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAlsoLike_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (TextView) watchFaceDialPayDetailActivity.findViewById(R.id.item_dial_pay_detail_also_like);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAmount_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (TextView) watchFaceDialPayDetailActivity.findViewById(R.id.item_dial_pay_detail_title_amount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLimitedFree_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (TextView) watchFaceDialPayDetailActivity.findViewById(R.id.item_dial_pay_detail_limited_time_free);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMemory_delegate$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity) {
        return (TextView) watchFaceDialPayDetailActivity.findViewById(R.id.item_dial_pay_detail_memory);
    }

    public final void detailSyncDial() {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.no6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceDialPayDetailActivity.detailSyncDial$lambda$0(this.f9981IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @aa1
    public final String getBinUrl() {
        return this.binUrl;
    }

    public final float getMAmount() {
        return this.mAmount;
    }

    public final float getMAmountMember() {
        return this.mAmountMember;
    }

    public final float getMAmountOriginal() {
        return this.mAmountOriginal;
    }

    public final int getMDialType() {
        return this.mDialType;
    }

    public final int getMItemPosition() {
        return this.mItemPosition;
    }

    @aa1
    public final String getMPayStatus() {
        return this.mPayStatus;
    }

    @aa1
    public final String getOrderNum() {
        return this.orderNum;
    }

    public final void getOrderStatus() {
        OrderManager.OXO1.XX0(this.orderNum, "WatchFace", new Function1() { // from class: com.android.mltcode.paycertificationapi.io6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceDialPayDetailActivity.getOrderStatus$lambda$0(this.f8728IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    @aa1
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final void getWatchFaceDetail() {
        WatchFaceManager.OXO1.m38119IO(String.valueOf(getMArg1()), new Function1() { // from class: com.android.mltcode.paycertificationapi.go6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceDialPayDetailActivity.getWatchFaceDetail$lambda$0(this.f6931IO, (WatchFaceDetail) obj);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final void initSynced() {
        if (this.mDialIds.contains(Integer.valueOf(getMArg1()))) {
            ProgressButtonV2 progressButton = getProgressButton();
            Intrinsics.O10IXXX0X(progressButton, "<get-progressButton>(...)");
            ProgressButtonV2.IiI10X(progressButton, R.string.synced, true, 0, false, 0, null, 60, null);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        BleInitializer.f51208IO.i1iII1i1(true);
        getAbhTitleCenter().setText(getString(R.string.dail_detail_title));
        getMNestedScrollView().setBackground(gk4.XOO0ii0(this, R.drawable.dial_watchface_detail_re_bg));
        CharSequence text = getMPrecautionsTitle().getText();
        if (text.length() > 2) {
            TextView mPrecautionsTitle = getMPrecautionsTitle();
            Intrinsics.XXI(text);
            mPrecautionsTitle.setText(text.subSequence(0, text.length() - 1).toString());
        }
        ProgressButtonV2 mOpenMembership = getMOpenMembership();
        Intrinsics.O10IXXX0X(mOpenMembership, "<get-mOpenMembership>(...)");
        String string = getString(R.string.dial_member_buy);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        ProgressButtonV2.XOO0ii0(mOpenMembership, string, true, 0, false, 0, null, 60, null);
        getMOpenMembership().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ko6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceDialPayDetailActivity.initView$lambda$0(this.f9248IO, view);
            }
        });
        initData();
        watchFaceClick();
        WatchFaceManager.OXO1.XXI(String.valueOf(getMArg1()), new Function1() { // from class: com.android.mltcode.paycertificationapi.lo6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WatchFaceDialPayDetailActivity.initView$lambda$1(this.f9487IO, (WatchFaceCategoryV2[]) obj);
            }
        });
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    public final boolean isSync() {
        SyncStatus syncStatus = this.mCurSyncStatus;
        return syncStatus == SyncStatus.SYNCING || syncStatus == SyncStatus.DOWNLOAD;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_dial_pay_watchface_detail;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mItemPosition = -1;
        i72 i72Var = i72.OXO1;
        if (!i72Var.iOIi00Ii() && this.mAmount != 0.0f && !XXiO.XO0O10(this.mPayStatus) && i72Var.XI1OX0IO()) {
            showConfirm();
            return;
        }
        if (isSync()) {
            ToastUtils.showLong(R.string.syncing_remind);
        } else if (this.mDialIds.contains(Integer.valueOf(getMArg1()))) {
            ToastUtils.showLong(R.string.dial_sync_done);
        } else {
            XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C188101(null), 3, null);
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        BleInitializer bleInitializer = BleInitializer.f51208IO;
        bleInitializer.i1iII1i1(false);
        bleInitializer.I1Ii(false);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (isSync()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            super.onHandleBackPressed();
        }
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        this.isNeedPayDialog = false;
        go0 go0Var = this.mPayconfirmPopup;
        if (go0Var != null && go0Var != null) {
            go0Var.dismiss();
        }
        getOrderStatus();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isNeedPayDialog) {
            this.isNeedPayDialog = false;
            showPayConfirm();
        }
        if (q62.OXO1.i01()) {
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.READ, null, false, false, 28, null);
            return;
        }
        this.mDialIds.set(0, Integer.valueOf(a01.OXO1.XIi00iiXO().getInt("syncId", 0)));
        LogUtils.m11128d("mDialIds -> " + this.mDialIds);
        initSynced();
    }

    public final void onShowEvaluationStatus() {
        I0iiIOX i0iiIOX;
        if (EvaluationKt.isShowEvaluationDialog()) {
            if (this.mEvaluationPopup == null) {
                this.mEvaluationPopup = new I0iiIOX(this, 0, 2, null);
            }
            I0iiIOX i0iiIOX2 = this.mEvaluationPopup;
            if ((i0iiIOX2 == null || !i0iiIOX2.isShowing()) && (i0iiIOX = this.mEvaluationPopup) != null) {
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                i0iiIOX.XiOIO(rootView);
            }
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (isSync()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            finish();
        }
    }

    public final void setBinUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.binUrl = str;
    }

    public final void setMAmount(float f) {
        this.mAmount = f;
    }

    public final void setMAmountMember(float f) {
        this.mAmountMember = f;
    }

    public final void setMAmountOriginal(float f) {
        this.mAmountOriginal = f;
    }

    public final void setMDialType(int i) {
        this.mDialType = i;
    }

    public final void setMItemPosition(int i) {
        this.mItemPosition = i;
    }

    public final void setMPayStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPayStatus = str;
    }

    public final void setNeedPayDialog(boolean z) {
        this.isNeedPayDialog = z;
    }

    public final void setOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderNum = str;
    }

    public final void setPreviewUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.previewUrl = str;
    }

    public final void setViewText(boolean z, @aa1 String memberAttr) {
        Intrinsics.X0O(memberAttr, "memberAttr");
        LogUtils.m11128d(this.TAG + " setViewText  mAmount = " + this.mAmount + "  mPayStatus = " + this.mPayStatus + " ");
        if (this.mAmount == 0.0f) {
            getTvAmount().setText(String.valueOf(getString(R.string.free_order_amount)));
        } else {
            getTvAmount().setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.m1385iO(this.mAmount, null, 2, null));
        }
        this.mDialMemberAttr = memberAttr;
        this.mDialIsVipFreeFlag = Intrinsics.XOO0ii0(memberAttr, "1");
        this.mDialDiscount = Intrinsics.XOO0ii0(memberAttr, "2");
        this.mDialIsLimitFreeFlag = z;
        getMOpenMembershipLayout().setVisibility(8);
        if (this.mDialIsLimitFreeFlag) {
            getTvLimitedFree().setVisibility(8);
            getTvAmount().setText(getString(R.string.limited_time_free));
        } else if (this.mDialIsVipFreeFlag) {
            if (i72.OXO1.m2044Ii()) {
                getTvLimitedFree().getPaint().setFlags(16);
                getTvLimitedFree().setVisibility(0);
                getTvLimitedFree().setText(getString(R.string.order_pay_amount_name2) + ": " + XXiO.m1385iO(this.mAmountOriginal, null, 2, null));
                getTvLimitedFree().setTextColor(getResources().getColor(R.color.line_color));
                getTvAmount().setTextColor(gk4.O00(this, R.color.order_text_orange));
                getTvAmount().setText(getString(R.string.member_exclusive2));
            } else {
                getTvLimitedFree().setVisibility(0);
                getTvLimitedFree().setText(getString(R.string.member_exclusive2));
                getTvLimitedFree().setTextColor(getResources().getColor(R.color.order_text_orange));
                getTvAmount().setTextColor(gk4.O00(this, R.color.text_color));
                getTvAmount().setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.m1385iO(this.mAmount, null, 2, null));
                getMOpenMembershipLayout().setVisibility(0);
            }
        } else if (!this.mDialDiscount) {
            getTvAmount().getPaint().setFlags(0);
            getTvLimitedFree().setVisibility(8);
            getTvAmount().setTextColor(getResources().getColor(R.color.order_text_orange));
        } else if (i72.OXO1.m2044Ii()) {
            getTvAmount().setText(getString(R.string.dial_member_price) + ": " + XXiO.m1385iO(this.mAmount, null, 2, null));
            getTvLimitedFree().setVisibility(0);
            getTvLimitedFree().getPaint().setFlags(16);
            getTvLimitedFree().setText(getString(R.string.order_pay_amount_name2) + ": " + XXiO.m1385iO(this.mAmountOriginal, null, 2, null));
            getTvLimitedFree().setTextColor(getResources().getColor(R.color.line_color));
        } else {
            getTvAmount().setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.m1385iO(this.mAmount, null, 2, null));
            getMOpenMembershipLayout().setVisibility(0);
            getTvAmount().setTextColor(getResources().getColor(R.color.line_color));
            getTvLimitedFree().setTextColor(getResources().getColor(R.color.order_text_orange));
            getTvLimitedFree().setVisibility(0);
            getTvLimitedFree().setText(getString(R.string.dial_member_price) + ": " + XXiO.m1385iO(this.mAmountMember, null, 2, null));
        }
        if (z) {
            ProgressButtonV2 progressButton = getProgressButton();
            Intrinsics.O10IXXX0X(progressButton, "<get-progressButton>(...)");
            ProgressButtonV2.IiI10X(progressButton, R.string.sync, true, 0, false, 0, null, 60, null);
        } else if (Intrinsics.XOO0ii0(memberAttr, "1")) {
            ProgressButtonV2 progressButton2 = getProgressButton();
            Intrinsics.O10IXXX0X(progressButton2, "<get-progressButton>(...)");
            ProgressButtonV2.IiI10X(progressButton2, R.string.pay_dail_detail_btn_no_pay, true, 0, false, 0, null, 60, null);
        } else if (XXiO.XO0O10(this.mPayStatus) || this.mAmount == 0.0f) {
            ProgressButtonV2 progressButton3 = getProgressButton();
            Intrinsics.O10IXXX0X(progressButton3, "<get-progressButton>(...)");
            ProgressButtonV2.IiI10X(progressButton3, R.string.sync, true, 0, false, 0, null, 60, null);
        } else {
            ProgressButtonV2 progressButton4 = getProgressButton();
            Intrinsics.O10IXXX0X(progressButton4, "<get-progressButton>(...)");
            ProgressButtonV2.IiI10X(progressButton4, R.string.pay_dail_detail_btn_no_pay, true, 0, false, 0, null, 60, null);
        }
        initSynced();
    }

    public final void watchFaceClick() {
        WatchFaceManager.OXO1.I0iXXO(String.valueOf(getMArg1()));
    }
}
