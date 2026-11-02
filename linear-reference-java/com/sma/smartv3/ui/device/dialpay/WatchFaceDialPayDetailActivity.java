package com.sma.smartv3.ui.device.dialpay;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OOX1XIiOI;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ao6;
import com.android.mltcode.paycertificationapi.bo6;
import com.android.mltcode.paycertificationapi.co6;
import com.android.mltcode.paycertificationapi.do6;
import com.android.mltcode.paycertificationapi.eo6;
import com.android.mltcode.paycertificationapi.fo6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.go6;
import com.android.mltcode.paycertificationapi.ho6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXiIO0i;
import com.android.mltcode.paycertificationapi.io6;
import com.android.mltcode.paycertificationapi.jo6;
import com.android.mltcode.paycertificationapi.ko6;
import com.android.mltcode.paycertificationapi.lo6;
import com.android.mltcode.paycertificationapi.mo6;
import com.android.mltcode.paycertificationapi.no6;
import com.android.mltcode.paycertificationapi.oo6;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.po6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qo6;
import com.android.mltcode.paycertificationapi.ro6;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.so6;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.to6;
import com.android.mltcode.paycertificationapi.uo6;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vo6;
import com.android.mltcode.paycertificationapi.wo6;
import com.android.mltcode.paycertificationapi.yn6;
import com.android.mltcode.paycertificationapi.zn6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AccountCreateOrder;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.model.SyncStatus;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceDetail;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.DialPickerPopup;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n19#2:866\n15#2:867\n11#2,2:868\n19#2:889\n15#2:890\n11#2,2:891\n19#2:913\n15#2:914\n11#2,2:915\n87#3,7:870\n94#3,3:878\n70#3,7:881\n97#3:888\n87#3,7:893\n94#3,3:901\n70#3,7:904\n97#3:911\n1#4:877\n1#4:900\n1#4:912\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity\n*L\n323#1:866\n323#1:867\n324#1:868,2\n469#1:889\n469#1:890\n470#1:891,2\n604#1:913\n604#1:914\n605#1:915,2\n341#1:870,7\n341#1:878,3\n341#1:881,7\n341#1:888\n475#1:893,7\n475#1:901,3\n475#1:904,7\n475#1:911\n341#1:877\n475#1:900\n*E\n"})
public final class WatchFaceDialPayDetailActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private String binUrl;

    @aa1
    private final Lazy btnView$delegate;

    @aa1
    private final Lazy dialIv$delegate;

    @aa1
    private final Lazy dialNew$delegate;

    @tb1
    private DialPickerPopup dialPickerPopup;
    private boolean isNeedPayDialog;
    private boolean isPaySuccess;
    private float mAmount;
    private float mAmountMember;
    private float mAmountOriginal;

    @aa1
    private String mBinFileName;

    @aa1
    private final iO mBleHandleCallback;

    @tb1
    private go0 mConfirmPopup;
    private int mCurSyncCompleted;
    private int mCurSyncDevicePosition;
    private int mCurSyncDialId;
    private int mCurSyncPosition;

    @aa1
    private SyncStatus mCurSyncStatus;
    private int mCurSyncTotal;
    private boolean mDialDiscount;

    @aa1
    private final List<Integer> mDialIds;
    private boolean mDialIsLimitFreeFlag;
    private boolean mDialIsVipFreeFlag;

    @aa1
    private String mDialMemberAttr;
    private int mDialType;

    @tb1
    private I0iiIOX mEvaluationPopup;
    private int mItemPosition;

    @tb1
    private go0 mLoginHintPopup;

    @aa1
    private final Lazy mNestedScrollView$delegate;

    @aa1
    private final Lazy mOpenMembership$delegate;

    @aa1
    private final Lazy mOpenMembershipLayout$delegate;

    @aa1
    private String mPayStatus;

    @tb1
    private go0 mPayconfirmPopup;

    @aa1
    private final Lazy mPrecautionsTitle$delegate;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private String orderNum;

    @aa1
    private String previewUrl;

    @aa1
    private final Lazy progressButton$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvAlsoLike$delegate;

    @aa1
    private final Lazy tvAmount$delegate;

    @aa1
    private final Lazy tvLimitedFree$delegate;

    @aa1
    private final Lazy tvMemory$delegate;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[SyncStatus.values().length];
            r0[SyncStatus.FAILED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r0[SyncStatus.NO_SYNC.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r0[SyncStatus.SYNCING.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r0[SyncStatus.SYNCED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO implements iXiIO0i {
        public final /* synthetic */ WatchFaceDialPayDetailActivity OXO1;

        public XIi00iiXO(WatchFaceDialPayDetailActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXiIO0i
        public void OXO1(int r9) {
            WatchFaceDialPayDetailActivity r0 = this.OXO1;
            int r1 = r0.getMArg1();
            int r2 = this.OXO1.getMItemPosition();
            ProgressButtonV2 r4 = WatchFaceDialPayDetailActivity.access$getProgressButton(this.OXO1);
            Intrinsics.O10IXXX0X(r4, "access$getProgressButton(...)");
            WatchFaceDialPayDetailActivity.access$syncDial(r0, r1, r2, r9, r4, this.OXO1.getBinUrl(), this.OXO1.getPreviewUrl(), this.OXO1.getMDialType());
        }
    }

    @SourceDebugExtension({"SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,865:1\n1869#2,2:866\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$mBleHandleCallback$1\n*L\n157#1:866,2\n*E\n"})
    public static final class iO implements BleHandleCallback {
        public final /* synthetic */ WatchFaceDialPayDetailActivity IO;

        public iO(WatchFaceDialPayDetailActivity r1) {
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
            if (r2 != BleKey.WATCH_FACE) goto L6;
            WatchFaceDialPayDetailActivity.access$setMCurSyncStatus$p(this.IO, SyncStatus.FAILED);
            ToastUtils.showLong(OOX00.OXO1.OXO1(0), new Object[0]);
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
            WatchFaceDialPayDetailActivity.access$getMDialIds$p(this.IO).clear();
            List<Integer> r5 = r4.getMIdList();
            WatchFaceDialPayDetailActivity r0 = this.IO;
            Iterator<T> r6 = r5.iterator();
        L4:
            if (r6.hasNext() == false) goto L9;
            int r1 = ((Number) r6.next()).intValue();
            if (r1 <= 0) goto L7;
            WatchFaceDialPayDetailActivity.access$getMDialIds$p(r0).add(Integer.valueOf(r1));
            goto L4
        L7:
            WatchFaceDialPayDetailActivity.access$getMDialIds$p(r0).add(0);
            goto L4
        L9:
            LogUtils.d(new Object[]{"mDialIds -> " + WatchFaceDialPayDetailActivity.access$getMDialIds$p(this.IO)});
            this.IO.initSynced();
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
            if (WatchFaceDialPayDetailActivity.access$getMCurSyncDialId$p(this.IO) != 0) goto L5;
            return;
        L5:
            if (WatchFaceDialPayDetailActivity.access$getMCurSyncStatus$p(this.IO) != SyncStatus.SYNCING) goto L9;
            WatchFaceDialPayDetailActivity.access$setMCurSyncStatus$p(this.IO, SyncStatus.FAILED);
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
        public void onStreamProgress(boolean r4, int r5, int r6, int r7, BleKey r8) {
            Intrinsics.X0O(r8, "bleKey");
            if (r8 == BleKey.WATCH_FACE) goto L6;
            return;
        L6:
            if (r4 == false) goto L13;
            WatchFaceDialPayDetailActivity.access$setMCurSyncStatus$p(this.IO, SyncStatus.SYNCING);
            BleInitializer r9 = BleInitializer.IO;
            r9.I1Ii(true);
            if (r6 != r7) goto L16;
            WatchFaceDialPayDetailActivity.access$setMCurSyncStatus$p(this.IO, SyncStatus.SYNCED);
            WatchFaceDialPayDetailActivity.access$getMDialIds$p(this.IO).set(WatchFaceDialPayDetailActivity.access$getMCurSyncDevicePosition$p(this.IO), Integer.valueOf(WatchFaceDialPayDetailActivity.access$getMCurSyncDialId$p(this.IO)));
            if (q62.OXO1.i01() == true) goto L12;
            a01.OXO1.XIi00iiXO().put("syncId", WatchFaceDialPayDetailActivity.access$getMCurSyncDialId$p(this.IO));
        L12:
            I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
            this.IO.onShowEvaluationStatus();
            r9.I1Ii(false);
        L16:
            WatchFaceDialPayDetailActivity.access$setMCurSyncTotal$p(this.IO, r6);
            WatchFaceDialPayDetailActivity.access$setMCurSyncCompleted$p(this.IO, r7);
            WatchFaceDialPayDetailActivity r10 = this.IO;
            ProgressButtonV2 r11 = WatchFaceDialPayDetailActivity.access$getProgressButton(r10);
            Intrinsics.O10IXXX0X(r11, "access$getProgressButton(...)");
            WatchFaceDialPayDetailActivity.access$syncStatusChange(r10, r11, WatchFaceDialPayDetailActivity.access$getMCurSyncStatus$p(this.IO));
            return;
        L13:
            WatchFaceDialPayDetailActivity.access$setMCurSyncStatus$p(this.IO, SyncStatus.FAILED);
            WatchFaceDialPayDetailActivity.access$handleErrorCode(this.IO, r5);
            BleInitializer.IO.I1Ii(false);
            WatchFaceDialPayDetailActivity.access$getMDialIds$p(this.IO).set(WatchFaceDialPayDetailActivity.access$getMCurSyncDevicePosition$p(this.IO), 0);
            if (q62.OXO1.i01() == true) goto L16;
            a01.OXO1.XIi00iiXO().put("syncId", 0);
            goto L16
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity$onBottomClick$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity$onBottomClick$1", f = "WatchFaceDialPayDetailActivity.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$onBottomClick$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n87#2,7:866\n94#2,3:874\n70#2,7:877\n97#2:884\n1#3:873\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$onBottomClick$1\n*L\n292#1:866,7\n292#1:874,3\n292#1:877,7\n292#1:884\n292#1:873\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WatchFaceDialPayDetailActivity this$0;

        public AnonymousClass1(WatchFaceDialPayDetailActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r5);
        L12:
            if (((Boolean) r5).booleanValue() == true) goto L20;
            if (q62.OXO1.IX0() == false) goto L16;
            new OOX1XIiOI(this.this$0).IIX1OXO();
        L18:
            return Unit.OXO1;
        L16:
            ToastUtils.showLong(R.string.dial_error_failure_2_2);
            goto L18
        L20:
            if (this.this$0.getMAmount() != 0.0f) goto L23;
        L45:
            this.this$0.detailSyncDial();
        L47:
            return Unit.OXO1;
        L23:
            if (XXiO.XO0O10(this.this$0.getMPayStatus()) == true) goto L45;
            i72 r6 = i72.OXO1;
            if (r6.iOIi00Ii() == true) goto L27;
            WatchFaceDialPayDetailActivity.access$showLoginHint(this.this$0);
            goto L47
        L27:
            if (WatchFaceDialPayDetailActivity.access$getMDialIsLimitFreeFlag$p(this.this$0) == false) goto L30;
            this.this$0.detailSyncDial();
            goto L47
        L30:
            if (WatchFaceDialPayDetailActivity.access$getMDialIsVipFreeFlag$p(this.this$0) == false) goto L36;
            if (r6.Ii() == false) goto L34;
            this.this$0.detailSyncDial();
            goto L47
        L34:
            WatchFaceDialPayDetailActivity.access$goCreateOrder(this.this$0);
            goto L47
        L36:
            if (Intrinsics.XOO0ii0(WatchFaceDialPayDetailActivity.access$getMDialMemberAttr$p(this.this$0), "1") == false) goto L41;
            if (r6.Ii() == true) goto L41;
            WatchFaceDialPayDetailActivity r7 = this.this$0;
            OrderManager r2 = OrderManager.OXO1;
            String r3 = OrderManager.X11iII1O1(r2, null, r2.iOO1ii1(), 1, null);
            Bundle r4 = new Bundle();
            r4.putString("mArg0", r3);
            r4.putInt("mArg1", 2);
            r4.putParcelable("mArg2", null);
            r4.putSerializable("mArg3", null);
            Intent r8 = new Intent(r7, GoogleWebViewActivity.class);
            r8.putExtras(r4);
            r7.startActivity(r8);
        L41:
            if (WatchFaceDialPayDetailActivity.access$isPaySuccess$p(this.this$0) == false) goto L43;
            this.this$0.detailSyncDial();
            goto L47
        L43:
            WatchFaceDialPayDetailActivity.access$goCreateOrder(this.this$0);
            goto L47
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r5);
            this.label = 1;
            r5 = WatchFaceDialPayDetailActivityKt.OXO1(this);
            if (r5 != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public WatchFaceDialPayDetailActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new po6(this));
        this.dialIv$delegate = LazyKt__LazyJVMKt.iO(new vo6(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new wo6(this));
        this.btnView$delegate = LazyKt__LazyJVMKt.iO(new zn6(this));
        this.progressButton$delegate = LazyKt__LazyJVMKt.iO(new ao6(this));
        this.dialNew$delegate = LazyKt__LazyJVMKt.iO(new bo6(this));
        this.tvAmount$delegate = LazyKt__LazyJVMKt.iO(new co6(this));
        this.tvMemory$delegate = LazyKt__LazyJVMKt.iO(new do6(this));
        this.tvLimitedFree$delegate = LazyKt__LazyJVMKt.iO(new eo6(this));
        this.tvAlsoLike$delegate = LazyKt__LazyJVMKt.iO(new fo6(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new qo6(this));
        this.mNestedScrollView$delegate = LazyKt__LazyJVMKt.iO(new ro6(this));
        this.mPrecautionsTitle$delegate = LazyKt__LazyJVMKt.iO(new so6(this));
        this.mOpenMembership$delegate = LazyKt__LazyJVMKt.iO(new to6(this));
        this.mOpenMembershipLayout$delegate = LazyKt__LazyJVMKt.iO(new uo6(this));
        this.mDialMemberAttr = "";
        this.TAG = "WatchFaceDialPayDetailActivity";
        this.mPayStatus = "";
        this.previewUrl = "";
        this.binUrl = "";
        this.mItemPosition = -1;
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0});
        this.mBinFileName = "";
        this.orderNum = "";
        this.mCurSyncStatus = SyncStatus.NO_SYNC;
        this.mBleHandleCallback = new iO(this);
    }

    public static /* synthetic */ boolean I0iXXO(WatchFaceDialPayDetailActivity r0) {
        return showPayConfirm$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit I1(WatchFaceDialPayDetailActivity r0, WatchFaceCategoryV2[] r1) {
        return initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ RecyclerView I1XOi1(WatchFaceDialPayDetailActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View II1Xi0(WatchFaceDialPayDetailActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(WatchFaceDialPayDetailActivity r0) {
        return showPayConfirm$lambda$0$0(r0);
    }

    public static /* synthetic */ void IXXOO(WatchFaceDialPayDetailActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(WatchFaceDialPayDetailActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O1O(WatchFaceDialPayDetailActivity r0) {
        return mOpenMembershipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OII(WatchFaceDialPayDetailActivity r0) {
        return btnView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(WatchFaceDialPayDetailActivity r0) {
        return dialIv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX(WatchFaceDialPayDetailActivity r0, AccountCreateOrder r1) {
        return goCreateOrder$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OiIIX101O(WatchFaceDialPayDetailActivity r0) {
        return tvMemory_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X01IiOiIi(WatchFaceDialPayDetailActivity r0) {
        return dialNew_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(WatchFaceDialPayDetailActivity r0) {
        return showLoginHint$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView X1ii(WatchFaceDialPayDetailActivity r0) {
        return tvAlsoLike_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView XX0(WatchFaceDialPayDetailActivity r0) {
        return mNestedScrollView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(WatchFaceDialPayDetailActivity r0, boolean r1) {
        return getOrderStatus$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XXIIO1i11(WatchFaceDialPayDetailActivity r0, WatchFaceDetail r1) {
        return getWatchFaceDetail$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XiOIO(WatchFaceDialPayDetailActivity r0) {
        return mPrecautionsTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIii1(WatchFaceDialPayDetailActivity r0, BleConnector r1) {
        return detailSyncDial$lambda$0(r0, r1);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ int access$getMCurSyncDevicePosition$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mCurSyncDevicePosition;
    }

    public static final /* synthetic */ int access$getMCurSyncDialId$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mCurSyncDialId;
    }

    public static final /* synthetic */ SyncStatus access$getMCurSyncStatus$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mCurSyncStatus;
    }

    public static final /* synthetic */ List access$getMDialIds$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mDialIds;
    }

    public static final /* synthetic */ boolean access$getMDialIsLimitFreeFlag$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mDialIsLimitFreeFlag;
    }

    public static final /* synthetic */ boolean access$getMDialIsVipFreeFlag$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mDialIsVipFreeFlag;
    }

    public static final /* synthetic */ String access$getMDialMemberAttr$p(WatchFaceDialPayDetailActivity r0) {
        return r0.mDialMemberAttr;
    }

    public static final /* synthetic */ ProgressButtonV2 access$getProgressButton(WatchFaceDialPayDetailActivity r0) {
        return r0.getProgressButton();
    }

    public static final /* synthetic */ void access$goCreateOrder(WatchFaceDialPayDetailActivity r0) {
        r0.goCreateOrder();
    }

    public static final /* synthetic */ void access$handleErrorCode(WatchFaceDialPayDetailActivity r0, int r1) {
        r0.handleErrorCode(r1);
    }

    public static final /* synthetic */ void access$initData(WatchFaceDialPayDetailActivity r0) {
        r0.initData();
    }

    public static final /* synthetic */ boolean access$isPaySuccess$p(WatchFaceDialPayDetailActivity r0) {
        return r0.isPaySuccess;
    }

    public static final /* synthetic */ void access$sendDial(WatchFaceDialPayDetailActivity r0, File r1) {
        r0.sendDial(r1);
    }

    public static final /* synthetic */ void access$setMCurSyncCompleted$p(WatchFaceDialPayDetailActivity r0, int r1) {
        r0.mCurSyncCompleted = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncStatus$p(WatchFaceDialPayDetailActivity r0, SyncStatus r1) {
        r0.mCurSyncStatus = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncTotal$p(WatchFaceDialPayDetailActivity r0, int r1) {
        r0.mCurSyncTotal = r1;
    }

    public static final /* synthetic */ void access$showLoginHint(WatchFaceDialPayDetailActivity r0) {
        r0.showLoginHint();
    }

    public static final /* synthetic */ void access$syncDial(WatchFaceDialPayDetailActivity r0, int r1, int r2, int r3, ProgressButtonV2 r4, String r5, String r6, int r7) {
        r0.syncDial(r1, r2, r3, r4, r5, r6, r7);
    }

    public static final /* synthetic */ void access$syncStatusChange(WatchFaceDialPayDetailActivity r0, ProgressButtonV2 r1, SyncStatus r2) {
        r0.syncStatusChange(r1, r2);
    }

    private static final View btnView_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return r1.findViewById(R.id.dial_pay_detail_btn);
    }

    private static final Unit detailSyncDial$lambda$0(WatchFaceDialPayDetailActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity");
        r9.disableOrientation();
        if (q62.OXO1.i01() == false) goto L11;
        DialPickerPopup r11 = r9.dialPickerPopup;
        if (r11 != null) goto L7;
    L10:
        DialPickerPopup r12 = new DialPickerPopup(r9, r9.mDialIds, r9.mDialType, new XIi00iiXO(r9));
        r9.dialPickerPopup = r12;
        View r13 = r9.getRootView();
        Intrinsics.O10IXXX0X(r13, "<get-rootView>(...)");
        r12.I1XOi1(r13);
    L13:
        return Unit.OXO1;
    L7:
        if (r11.isShowing() != true) goto L10;
        return Unit.OXO1;
    L11:
        int r2 = r9.getMArg1();
        ProgressButtonV2 r5 = r9.getProgressButton();
        Intrinsics.O10IXXX0X(r5, "<get-progressButton>(...)");
        r9.syncDial(r2, -1, 0, r5, r9.binUrl, r9.previewUrl, r9.mDialType);
        goto L13
    }

    private static final ImageView dialIv_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv);
    }

    private static final View dialNew_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return r1.findViewById(R.id.item_dial_pay_detail_new);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final View getBtnView() {
        return (View) getValue();
    }

    private final ImageView getDialIv() {
        return (ImageView) getValue();
    }

    private final View getDialNew() {
        return (View) getValue();
    }

    private final NestedScrollView getMNestedScrollView() {
        return (NestedScrollView) getValue();
    }

    private final ProgressButtonV2 getMOpenMembership() {
        return (ProgressButtonV2) getValue();
    }

    private final View getMOpenMembershipLayout() {
        return (View) getValue();
    }

    private final TextView getMPrecautionsTitle() {
        return (TextView) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private static final Unit getOrderStatus$lambda$0(WatchFaceDialPayDetailActivity r0, boolean r1) {
        if (r1 == false) goto L4;
        r0.isPaySuccess = true;
        ToastUtils.showLong(R.string.pay_success_dial_itp);
        r0.detailSyncDial();
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.pay_confirm_error);
        goto L6
    }

    private final ProgressButtonV2 getProgressButton() {
        return (ProgressButtonV2) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final TextView getTvAlsoLike() {
        return (TextView) getValue();
    }

    private final TextView getTvAmount() {
        return (TextView) getValue();
    }

    private final TextView getTvLimitedFree() {
        return (TextView) getValue();
    }

    private final TextView getTvMemory() {
        return (TextView) getValue();
    }

    private static final Unit getWatchFaceDetail$lambda$0(WatchFaceDialPayDetailActivity r4, WatchFaceDetail r5) {
        if (r5 == null) goto L31;
        TextView r0 = r4.getTvMemory();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("%.2fMB", Arrays.copyOf(new Object[]{r5.getFileSize()}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.setText(r2);
        i72 r3 = i72.OXO1;
        if (r3.OX() == false) goto L6;
        float r6 = r5.getDollar();
    L7:
        r4.mAmountOriginal = r6;
        if (r3.OX() == false) goto L10;
        float r7 = r5.getDollarDis();
    L11:
        r4.mAmountMember = r7;
        if (Intrinsics.XOO0ii0(r5.getMemberAttr(), "2") == true) goto L14;
    L16:
        float r8 = r4.mAmountOriginal;
    L17:
        r4.mAmount = r8;
        String r9 = r5.getPayStatus();
        if (r9 != null) goto L20;
        r9 = "";
    L20:
        r4.mPayStatus = r9;
        r4.previewUrl = r5.getPreviewUrl();
        r4.binUrl = r5.getBinUrl();
        r4.mDialType = r5.getDialType();
        int r10 = 0;
        r4.getBtnView().setVisibility(0);
        if (Intrinsics.XOO0ii0(r5.getPreviewUrl(), r4.getMArg0()) == true) goto L23;
        Glide.with(r4).load(r5.getPreviewUrl()).into(r4.getDialIv());
    L23:
        View r11 = r4.getDialNew();
        if (r5.getNewFlag() == true) goto L26;
    L28:
        r10 = 8;
    L29:
        r11.setVisibility(r10);
        r4.setViewText(r5.getLimitFreeFlag(), r5.getMemberAttr());
        goto L31
    L26:
        if (r3.X1i() == false) goto L28;
    L14:
        if (r3.Ii() == false) goto L16;
        r8 = r4.mAmountMember;
        goto L17
    L10:
        r7 = r5.getAmountDis();
        goto L11
    L6:
        r6 = r5.getAmount();
    L31:
        return Unit.OXO1;
    }

    private final void goCreateOrder() {
        OrderManager.OXO1.OXO1("WatchFace", String.valueOf(getMArg1()), this, new ho6(this));
    }

    private static final Unit goCreateOrder$lambda$0(WatchFaceDialPayDetailActivity r6, AccountCreateOrder r7) {
        if (r7 == null) goto L4;
        String r1 = r7.getOrderNum();
        r6.orderNum = r1;
        r6.isNeedPayDialog = true;
        String r8 = OrderManager.iIiiO(OrderManager.OXO1, r1, "WatchFace", null, 4, null);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r8);
        r0.putInt("mArg1", 2);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r9 = new Intent(r6, GoogleWebViewActivity.class);
        r9.putExtras(r0);
        r6.startActivity(r9);
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(r6.getString(R.string.fail_order), new Object[0]);
        goto L6
    }

    private final void handleErrorCode(int r3) {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) == true) goto L5;
        return;
    L5:
        if (r3 == 2) goto L7;
    L10:
        ToastUtils.showLong(OOX00.OXO1.iO(r3), new Object[0]);
        return;
    L7:
        if (q62.OXO1.IX0() == false) goto L10;
        new OOX1XIiOI(this).IIX1OXO();
    }

    public static /* synthetic */ ProgressButtonV2 i010I(WatchFaceDialPayDetailActivity r0) {
        return mOpenMembership_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ProgressButtonV2 iIiiO(WatchFaceDialPayDetailActivity r0) {
        return progressButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOO1ii1(WatchFaceDialPayDetailActivity r0) {
        return tvAmount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iOOX010X(WatchFaceDialPayDetailActivity r0) {
        return showConfirm$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView iX(WatchFaceDialPayDetailActivity r0) {
        return tvLimitedFree_delegate$lambda$0(r0);
    }

    private final void initData() {
        this.isPaySuccess = false;
        String r1 = getMArg0();
        if (r1 == null) goto L8;
        if (r1.length() <= 0) goto L8;
        Glide.with(this).load(getMArg0()).into(getDialIv());
    L8:
        if (getMArg3() == null) goto L31;
        Serializable r2 = getMArg3();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type com.sma.smartv3.model.WatchFaceCategoryV2");
        WatchFaceCategoryV2 r3 = (WatchFaceCategoryV2) r2;
        String r4 = r3.getPayStatus();
        if (r4 != null) goto L12;
        r4 = "";
    L12:
        this.mPayStatus = r4;
        i72 r5 = i72.OXO1;
        if (r5.OX() == false) goto L15;
        float r6 = r3.getDollar();
    L16:
        this.mAmountOriginal = r6;
        if (r5.OX() == false) goto L19;
        float r7 = r3.getDollarDis();
    L20:
        this.mAmountMember = r7;
        if (Intrinsics.XOO0ii0(r3.getMemberAttr(), "2") == true) goto L23;
    L25:
        float r8 = this.mAmountOriginal;
    L26:
        this.mAmount = r8;
        this.previewUrl = r3.getPreviewUrl();
        this.binUrl = r3.getBinUrl();
        String r9 = r3.getDialType();
        if (r9 == null) goto L29;
        int r10 = Integer.parseInt(r9);
    L30:
        this.mDialType = r10;
        getBtnView().setVisibility(0);
        getTvMemory().setText("");
        setViewText(r3.getLimitFreeFlag(), r3.getMemberAttr());
    L32:
        getWatchFaceDetail();
        return;
    L29:
        r10 = 0;
        goto L30
    L23:
        if (r5.Ii() == false) goto L25;
        r8 = this.mAmountMember;
        goto L26
    L19:
        r7 = r3.getAmountDis();
        goto L20
    L15:
        r6 = r3.getAmount();
        goto L16
    L31:
        getBtnView().setVisibility(4);
        goto L32
    }

    private static final void initView$lambda$0(WatchFaceDialPayDetailActivity r33, View r34) {
        OrderManager r1 = OrderManager.OXO1;
        String r2 = OrderManager.X11iII1O1(r1, null, r1.iOO1ii1(), 1, null);
        if (r2.length() != 0) goto L10;
        a01 r3 = a01.OXO1;
        SPUtils r4 = r3.IiI10X();
        Object r5 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r6 = new Gson().fromJson(r4.getString(AppUser.class.getName()), AppUser.class);
        if (r6 == null) goto L8;
        r5 = r6;
    L8:
        SPUtils r7 = r3.XO0O10();
        String r8 = AppUser.class.getName();
        Gson r9 = new Gson();
        r7.put(r8, r9.toJson((AppUser) r5));
        i72.OXO1.Oi1I(r33);
        return;
    L10:
        Bundle r10 = new Bundle();
        r10.putString("mArg0", r2);
        r10.putInt("mArg1", 2);
        r10.putParcelable("mArg2", null);
        r10.putSerializable("mArg3", null);
        Intent r11 = new Intent(r33, GoogleWebViewActivity.class);
        r11.putExtras(r10);
        r33.startActivity(r11);
    }

    private static final Unit initView$lambda$1(WatchFaceDialPayDetailActivity r4, WatchFaceCategoryV2[] r5) {
        if (r5 == null) goto L4;
        TextView r0 = r4.getTvAlsoLike();
        int r2 = 0;
        if (r5.length != 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L12;
        r2 = 8;
    L12:
        r0.setVisibility(r2);
        r4.getMRecyclerView().setLayoutManager(new GridLayoutManager(r4.getMContext(), 3));
        r4.getMRecyclerView().setAdapter(new WatchFaceDialPayDetailActivity$initView$2$mAdapter$1(r4, r4.getMContext(), ArraysKt___ArraysKt.OXI0X0(r5)));
        return Unit.OXO1;
    L8:
        r1 = false;
        goto L9
    L4:
        return Unit.OXO1;
    }

    private static final NestedScrollView mNestedScrollView_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (NestedScrollView) r1.findViewById(R.id.dial_watchface_detail_scrollview);
    }

    private static final View mOpenMembershipLayout_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return r1.findViewById(R.id.open_membership_layout);
    }

    private static final ProgressButtonV2 mOpenMembership_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (ProgressButtonV2) r1.findViewById(R.id.open_membership);
    }

    private static final TextView mPrecautionsTitle_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.dial_qrcode_sycn_title3_tv);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.recycler_view);
    }

    private static final ProgressButtonV2 progressButton_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (ProgressButtonV2) r1.findViewById(R.id.btn_bottom);
    }

    private static final View rootView_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return r1.findViewById(R.id.rootView);
    }

    private final void sendDial(File r12) {
        this.mCurSyncStatus = SyncStatus.SYNCING;
        q62 r0 = q62.OXO1;
        if (r0.i01() == false) goto L6;
        BaseBleConnector.sendInt32$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.UPDATE, this.mCurSyncDialId, null, false, false, 56, null);
        return;
    L6:
        BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, r12, this.mCurSyncDevicePosition);
        r0.XO10X();
    }

    public static /* synthetic */ void sendDial$default(WatchFaceDialPayDetailActivity r0, File r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = uz0.O00(sz0.OXO1, r0.mBinFileName);
    L5:
        r0.sendDial(r1);
    }

    public static /* synthetic */ void setViewText$default(WatchFaceDialPayDetailActivity r0, boolean r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        r0.setViewText(r1, r2);
    }

    private final void showConfirm() {
        if (this.mConfirmPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.login_required_tip);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.successful_confirm, new oo6(this));
        this.mConfirmPopup = r0;
    L5:
        go0 r1 = this.mConfirmPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean showConfirm$lambda$0$0(WatchFaceDialPayDetailActivity r32) {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        SPUtils r4 = r0.XO0O10();
        String r5 = AppUser.class.getName();
        Gson r6 = new Gson();
        r4.put(r5, r6.toJson((AppUser) r2));
        i72.OXO1.Oi1I(r32);
        return true;
    }

    private final void showLoginHint() {
        if (this.mLoginHintPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.login_reminder);
        r0.IXXOO(1);
        r0.iX(Integer.valueOf(R.string.login_reminder_tip));
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new mo6(this));
        this.mLoginHintPopup = r0;
    L5:
        go0 r1 = this.mLoginHintPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean showLoginHint$lambda$0$0(WatchFaceDialPayDetailActivity r32) {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        SPUtils r4 = r0.XO0O10();
        String r5 = AppUser.class.getName();
        Gson r6 = new Gson();
        r4.put(r5, r6.toJson((AppUser) r2));
        i72.OXO1.OiXXXi10(r32.getMContext());
        return true;
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.payment_completed_tip);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new yn6(this));
        r0.X1IX(R.string.yes_payment, new jo6(this));
        this.mPayconfirmPopup = r0;
    L5:
        go0 r1 = this.mPayconfirmPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean showPayConfirm$lambda$0$0(WatchFaceDialPayDetailActivity r0) {
        r0.getWatchFaceDetail();
        return true;
    }

    private static final boolean showPayConfirm$lambda$0$1(WatchFaceDialPayDetailActivity r0) {
        r0.getOrderStatus();
        return true;
    }

    private final void syncDial(final int r28, int r29, int r30, final ProgressButtonV2 r31, final String r32, final String r33, final int r34) {
        WatchFaceManager.OXO1.OXO1(String.valueOf(r28));
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        r2.OXO1("syncDial -> position:" + r29 + ", mCurSyncPosition:" + r30 + ", mCurSyncDialId:" + r28 + "  category = " + r34);
        this.mCurSyncDialId = r28;
        this.mCurSyncPosition = r29;
        this.mCurSyncStatus = SyncStatus.DOWNLOAD;
        this.mCurSyncDevicePosition = r30;
        float r0 = this.mAmount;
        BleCache r1 = BleCache.INSTANCE;
        this.mBinFileName = r0 + IiXI1X1OO.O00 + r1.getMPrototype() + IiXI1X1OO.O00 + r1.getMBleName() + IiXI1X1OO.O00 + r28 + ".bin";
        if (this.mAmount != 0.0f) goto L6;
        sz0 r3 = sz0.OXO1;
        String r6 = uz0.X01IiOiIi(r3).getAbsolutePath();
        Intrinsics.O10IXXX0X(r6, "getAbsolutePath(...)");
        File r7 = new File(uz0.X01IiOiIi(r3), this.mBinFileName);
        File r9 = new File(uz0.X01IiOiIi(r3), this.mAmount + IiXI1X1OO.O00 + r1.getMPrototype() + IiXI1X1OO.O00 + r1.getMBleName() + IiXI1X1OO.O00 + r28);
    L5:
        final File r5 = r9;
        String r10 = r6;
        if (r7.exists() == false) goto L11;
        r2.OXO1("syncDial -> dial try get from dialFile file = " + this.mBinFileName + " size:" + FileUtils.getSize(r7));
        ProgressButtonV2.IiI10X(r31, R.string.syncing, false, 0, false, 0, null, 62, null);
        sendDial(r7);
        return;
    L11:
        ProgressButtonV2.IiI10X(r31, R.string.downloading, false, 0, false, 0, null, 62, null);
        final File r4 = r7;
        NetWorkUtils.INSTANCE.download(r32, r10, this.mBinFileName, new C34621(r32, r4, r34, r28, r5, r33, r31, this));
        return;
    L6:
        sz0 r8 = sz0.OXO1;
        r6 = uz0.XXX11i(r8) + "/" + r1.getMPrototype() + "/PAY";
        r7 = new File(uz0.XXX11i(r8), r1.getMPrototype() + "/PAY/" + this.mBinFileName);
        r9 = new File(uz0.XXX11i(r8), r1.getMPrototype() + "/PAY/" + this.mAmount + IiXI1X1OO.O00 + r1.getMPrototype() + IiXI1X1OO.O00 + r1.getMBleName() + IiXI1X1OO.O00 + r28);
        goto L5
    }

    public static /* synthetic */ void syncDial$default(WatchFaceDialPayDetailActivity r9, int r10, int r11, int r12, ProgressButtonV2 r13, String r14, String r15, int r16, int r17, Object r18) {
        if ((r17 & 64) == 0) goto L6;
        int r8 = 0;
    L7:
        r9.syncDial(r10, r11, r12, r13, r14, r15, r8);
        return;
    L6:
        r8 = r16;
        goto L7
    }

    private final void syncStatusChange(ProgressButtonV2 r22, SyncStatus r23) {
        int r1 = OXO1.OXO1[r23.ordinal()];
        if (r1 != 1) goto L5;
        ProgressButtonV2.IiI10X(r22, R.string.sync_failed, false, 0, false, 0, null, 62, null);
        return;
    L5:
        if (r1 != 2) goto L7;
        ProgressButtonV2.IiI10X(r22, R.string.sync, false, 0, false, 0, null, 62, null);
        return;
    L7:
        if (r1 != 3) goto L9;
        r22.setProgressDecimalPlaces(this.mCurSyncCompleted / this.mCurSyncTotal);
        return;
    L9:
        if (r1 == 4) goto L11;
        return;
    L11:
        ProgressButtonV2.IiI10X(r22, R.string.synced, true, 0, false, 0, null, 60, null);
    }

    private static final TextView tvAlsoLike_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.item_dial_pay_detail_also_like);
    }

    private static final TextView tvAmount_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.item_dial_pay_detail_title_amount);
    }

    private static final TextView tvLimitedFree_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.item_dial_pay_detail_limited_time_free);
    }

    private static final TextView tvMemory_delegate$lambda$0(WatchFaceDialPayDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.item_dial_pay_detail_memory);
    }

    public final void detailSyncDial() {
        X0IOiX1O.XIi00iiXO(false, new no6(this), 1, null);
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
        OrderManager.OXO1.XX0(this.orderNum, "WatchFace", new io6(this));
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
        WatchFaceManager.OXO1.IO(String.valueOf(getMArg1()), new go6(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public final void initSynced() {
        if (this.mDialIds.contains(Integer.valueOf(getMArg1())) == false) goto L6;
        ProgressButtonV2 r1 = getProgressButton();
        Intrinsics.O10IXXX0X(r1, "<get-progressButton>(...)");
        ProgressButtonV2.IiI10X(r1, R.string.synced, true, 0, false, 0, null, 60, null);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        BleInitializer.IO.i1iII1i1(true);
        getAbhTitleCenter().setText(getString(R.string.dail_detail_title));
        getMNestedScrollView().setBackground(gk4.XOO0ii0(this, R.drawable.dial_watchface_detail_re_bg));
        CharSequence r0 = getMPrecautionsTitle().getText();
        if (r0.length() <= 2) goto L5;
        TextView r2 = getMPrecautionsTitle();
        Intrinsics.XXI(r0);
        r2.setText(r0.subSequence(0, r0.length() - 1).toString());
    L5:
        ProgressButtonV2 r3 = getMOpenMembership();
        Intrinsics.O10IXXX0X(r3, "<get-mOpenMembership>(...)");
        String r4 = getString(R.string.dial_member_buy);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        ProgressButtonV2.XOO0ii0(r3, r4, true, 0, false, 0, null, 60, null);
        getMOpenMembership().setOnClickListener(new ko6(this));
        initData();
        watchFaceClick();
        WatchFaceManager.OXO1.XXI(String.valueOf(getMArg1()), new lo6(this));
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    public final boolean isSync() {
        SyncStatus r0 = this.mCurSyncStatus;
        if (r0 != SyncStatus.SYNCING) goto L5;
        return true;
    L5:
        if (r0 == SyncStatus.DOWNLOAD) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_dial_pay_watchface_detail;
    }

    public final void onBottomClick(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        this.mItemPosition = -1;
        i72 r8 = i72.OXO1;
        if (r8.iOIi00Ii() == true) goto L14;
        if (this.mAmount == 0.0f) goto L14;
        if (XXiO.XO0O10(this.mPayStatus) == true) goto L14;
        if (r8.XI1OX0IO() == false) goto L14;
        showConfirm();
        return;
    L14:
        if (isSync() == false) goto L18;
        ToastUtils.showLong(R.string.syncing_remind);
        return;
    L18:
        if (this.mDialIds.contains(Integer.valueOf(getMArg1())) == false) goto L21;
        ToastUtils.showLong(R.string.dial_sync_done);
        return;
    L21:
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        BleInitializer r0 = BleInitializer.IO;
        r0.i1iII1i1(false);
        r0.I1Ii(false);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (isSync() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        this.isNeedPayDialog = false;
        go0 r4 = this.mPayconfirmPopup;
        if (r4 == null) goto L6;
        if (r4 == null) goto L6;
        r4.dismiss();
    L6:
        getOrderStatus();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isNeedPayDialog == false) goto L6;
        this.isNeedPayDialog = false;
        showPayConfirm();
    L6:
        if (q62.OXO1.i01() == false) goto L9;
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.READ, null, false, false, 28, null);
        return;
    L9:
        this.mDialIds.set(0, Integer.valueOf(a01.OXO1.XIi00iiXO().getInt("syncId", 0)));
        LogUtils.d(new Object[]{"mDialIds -> " + this.mDialIds});
        initSynced();
    }

    public final void onShowEvaluationStatus() {
        if (EvaluationKt.isShowEvaluationDialog() == true) goto L5;
        return;
    L5:
        if (this.mEvaluationPopup != null) goto L7;
        int r3 = 0;
        this.mEvaluationPopup = new I0iiIOX(this, r3, 2, null);
    L7:
        I0iiIOX r0 = this.mEvaluationPopup;
        if (r0 != null) goto L10;
    L12:
        I0iiIOX r1 = this.mEvaluationPopup;
        if (r1 == null) goto L17;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.XiOIO(r2);
        return;
    L17:
        return;
    L10:
        if (r0.isShowing() != true) goto L12;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (isSync() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }

    public final void setBinUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.binUrl = r2;
    }

    public final void setMAmount(float r1) {
        this.mAmount = r1;
    }

    public final void setMAmountMember(float r1) {
        this.mAmountMember = r1;
    }

    public final void setMAmountOriginal(float r1) {
        this.mAmountOriginal = r1;
    }

    public final void setMDialType(int r1) {
        this.mDialType = r1;
    }

    public final void setMItemPosition(int r1) {
        this.mItemPosition = r1;
    }

    public final void setMPayStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPayStatus = r2;
    }

    public final void setNeedPayDialog(boolean r1) {
        this.isNeedPayDialog = r1;
    }

    public final void setOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderNum = r2;
    }

    public final void setPreviewUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.previewUrl = r2;
    }

    public final void setViewText(boolean r25, @aa1 String r26) {
        Intrinsics.X0O(r26, "memberAttr");
        LogUtils.d(new Object[]{this.TAG + " setViewText  mAmount = " + this.mAmount + "  mPayStatus = " + this.mPayStatus + " "});
        if (this.mAmount != 0.0f) goto L5;
        getTvAmount().setText(String.valueOf(getString(R.string.free_order_amount)));
    L6:
        this.mDialMemberAttr = r26;
        this.mDialIsVipFreeFlag = Intrinsics.XOO0ii0(r26, "1");
        this.mDialDiscount = Intrinsics.XOO0ii0(r26, "2");
        this.mDialIsLimitFreeFlag = r25;
        getMOpenMembershipLayout().setVisibility(8);
        if (this.mDialIsLimitFreeFlag == false) goto L10;
        getTvLimitedFree().setVisibility(8);
        getTvAmount().setText(getString(R.string.limited_time_free));
    L23:
        if (r25 == false) goto L26;
        ProgressButtonV2 r6 = getProgressButton();
        Intrinsics.O10IXXX0X(r6, "<get-progressButton>(...)");
        ProgressButtonV2.IiI10X(r6, R.string.sync, true, 0, false, 0, null, 60, null);
    L35:
        initSynced();
        return;
    L26:
        if (Intrinsics.XOO0ii0(r26, "1") == false) goto L29;
        ProgressButtonV2 r7 = getProgressButton();
        Intrinsics.O10IXXX0X(r7, "<get-progressButton>(...)");
        ProgressButtonV2.IiI10X(r7, R.string.pay_dail_detail_btn_no_pay, true, 0, false, 0, null, 60, null);
        goto L35
    L29:
        if (XXiO.XO0O10(this.mPayStatus) == false) goto L31;
    L34:
        ProgressButtonV2 r15 = getProgressButton();
        Intrinsics.O10IXXX0X(r15, "<get-progressButton>(...)");
        ProgressButtonV2.IiI10X(r15, R.string.sync, true, 0, false, 0, null, 60, null);
        goto L35
    L31:
        if (this.mAmount == 0.0f) goto L34;
        ProgressButtonV2 r8 = getProgressButton();
        Intrinsics.O10IXXX0X(r8, "<get-progressButton>(...)");
        ProgressButtonV2.IiI10X(r8, R.string.pay_dail_detail_btn_no_pay, true, 0, false, 0, null, 60, null);
        goto L35
    L10:
        if (this.mDialIsVipFreeFlag == false) goto L16;
        if (i72.OXO1.Ii() == false) goto L14;
        getTvLimitedFree().getPaint().setFlags(16);
        getTvLimitedFree().setVisibility(0);
        getTvLimitedFree().setText(getString(R.string.order_pay_amount_name2) + ": " + XXiO.iO(this.mAmountOriginal, null, 2, null));
        getTvLimitedFree().setTextColor(getResources().getColor(R.color.line_color));
        getTvAmount().setTextColor(gk4.O00(this, R.color.order_text_orange));
        getTvAmount().setText(getString(R.string.member_exclusive2));
        goto L23
    L14:
        getTvLimitedFree().setVisibility(0);
        getTvLimitedFree().setText(getString(R.string.member_exclusive2));
        getTvLimitedFree().setTextColor(getResources().getColor(R.color.order_text_orange));
        getTvAmount().setTextColor(gk4.O00(this, R.color.text_color));
        getTvAmount().setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.iO(this.mAmount, null, 2, null));
        getMOpenMembershipLayout().setVisibility(0);
        goto L23
    L16:
        if (this.mDialDiscount == true) goto L18;
        getTvAmount().getPaint().setFlags(0);
        getTvLimitedFree().setVisibility(8);
        getTvAmount().setTextColor(getResources().getColor(R.color.order_text_orange));
        goto L23
    L18:
        if (i72.OXO1.Ii() == false) goto L20;
        getTvAmount().setText(getString(R.string.dial_member_price) + ": " + XXiO.iO(this.mAmount, null, 2, null));
        getTvLimitedFree().setVisibility(0);
        getTvLimitedFree().getPaint().setFlags(16);
        getTvLimitedFree().setText(getString(R.string.order_pay_amount_name2) + ": " + XXiO.iO(this.mAmountOriginal, null, 2, null));
        getTvLimitedFree().setTextColor(getResources().getColor(R.color.line_color));
        goto L23
    L20:
        getTvAmount().setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.iO(this.mAmount, null, 2, null));
        getMOpenMembershipLayout().setVisibility(0);
        getTvAmount().setTextColor(getResources().getColor(R.color.line_color));
        getTvLimitedFree().setTextColor(getResources().getColor(R.color.order_text_orange));
        getTvLimitedFree().setVisibility(0);
        getTvLimitedFree().setText(getString(R.string.dial_member_price) + ": " + XXiO.iO(this.mAmountMember, null, 2, null));
        goto L23
    L5:
        getTvAmount().setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.iO(this.mAmount, null, 2, null));
        goto L6
    }

    public final void watchFaceClick() {
        WatchFaceManager.OXO1.I0iXXO(String.valueOf(getMArg1()));
    }
}
