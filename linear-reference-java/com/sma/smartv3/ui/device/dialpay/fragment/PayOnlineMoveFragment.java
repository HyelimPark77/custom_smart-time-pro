package com.sma.smartv3.ui.device.dialpay.fragment;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OOX1XIiOI;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gp1;
import com.android.mltcode.paycertificationapi.hp1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ip1;
import com.android.mltcode.paycertificationapi.jp1;
import com.android.mltcode.paycertificationapi.kp1;
import com.android.mltcode.paycertificationapi.lp1;
import com.android.mltcode.paycertificationapi.mp1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.recycler.BaseRecyclerFragment;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.SyncStatus;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.DialPickerPopup;
import com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.view.ProgressButtonV2;
import com.sma.smartv3.view.SquareImageView;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,603:1\n1#2:604\n1#2:613\n90#3:605\n99#4,7:606\n106#4,3:614\n79#4,7:617\n109#4:624\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment\n*L\n308#1:613\n289#1:605\n308#1:606,7\n308#1:614,3\n308#1:617,7\n308#1:624\n*E\n"})
public class PayOnlineMoveFragment extends BaseRecyclerFragment<WatchFaceCategoryV2> {

    @tb1
    private DialPickerPopup dialPickerPopup;

    @aa1
    private MoveType isMoreActivity;
    private boolean isNeedPayDialog;
    private String mBinFileName;

    @aa1
    private final XIi00iiXO mBleHandleCallback;

    @tb1
    private WatchFaceCategoryV2 mCurItem;

    @tb1
    private ProgressButtonV2 mCurProgressButton;
    private int mCurSyncCompleted;
    private int mCurSyncDevicePosition;
    private int mCurSyncDialId;
    private int mCurSyncPosition;

    @aa1
    private SyncStatus mCurSyncStatus;
    private int mCurSyncTotal;

    @aa1
    private final List<Integer> mDialIds;

    @tb1
    private go0 mPayconfirmPopup;

    @aa1
    private String orderNum;

    @aa1
    private final Lazy recyclerView$delegate;

    @aa1
    private final Lazy tvTipView$delegate;

    @aa1
    private final Lazy tvView$delegate;

    public static final enum MoveType extends Enum<MoveType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ MoveType[] $VALUES = null;
        public static final MoveType BUY_HISTORY = null;
        public static final MoveType DEFAULT = null;
        public static final MoveType VIP_FREE = null;
        private final int type;

        private static final /* synthetic */ MoveType[] $values() {
            return new MoveType[]{DEFAULT, BUY_HISTORY, VIP_FREE};
        }

        static {
            DEFAULT = new MoveType("DEFAULT", 0, 257);
            BUY_HISTORY = new MoveType("BUY_HISTORY", 1, 258);
            VIP_FREE = new MoveType("VIP_FREE", 2, 259);
            MoveType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private MoveType(String r1, int r2, int r3) {
            super(r1, r2);
            this.type = r3;
        }

        @aa1
        public static EnumEntries<MoveType> getEntries() {
            return $ENTRIES;
        }

        public static MoveType valueOf(String r1) {
            return (MoveType) Enum.valueOf(MoveType.class, r1);
        }

        public static MoveType[] values() {
            return (MoveType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

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

    @SourceDebugExtension({"SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,603:1\n1869#2,2:604\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$mBleHandleCallback$1\n*L\n196#1:604,2\n*E\n"})
    public static final class XIi00iiXO implements BleHandleCallback {
        public final /* synthetic */ PayOnlineMoveFragment IO;

        public XIi00iiXO(PayOnlineMoveFragment r1) {
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
            PayOnlineMoveFragment.access$setMCurSyncStatus$p(this.IO, SyncStatus.FAILED);
            ToastUtils.showLong(OOX00.OXO1.OXO1(0), new Object[0]);
            PayOnlineMoveFragment.access$getMRecyclerAdapter(this.IO).notifyDataSetChanged();
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
            PayOnlineMoveFragment.access$getMDialIds$p(this.IO).clear();
            List<Integer> r5 = r4.getMIdList();
            PayOnlineMoveFragment r0 = this.IO;
            Iterator<T> r6 = r5.iterator();
        L4:
            if (r6.hasNext() == false) goto L9;
            int r1 = ((Number) r6.next()).intValue();
            if (r1 <= 0) goto L7;
            PayOnlineMoveFragment.access$getMDialIds$p(r0).add(Integer.valueOf(r1));
            goto L4
        L7:
            PayOnlineMoveFragment.access$getMDialIds$p(r0).add(0);
            goto L4
        L9:
            LogUtils.d(new Object[]{"mDialIds -> " + PayOnlineMoveFragment.access$getMDialIds$p(this.IO)});
            PayOnlineMoveFragment.access$getMRecyclerAdapter(this.IO).notifyDataSetChanged();
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
        public void onSessionStateChange(boolean r3) {
            LogUtils.d(new Object[]{"prog error onSessionStateChange " + r3});
            if (PayOnlineMoveFragment.access$getMCurSyncDialId$p(this.IO) != 0) goto L5;
        L7:
            PayOnlineMoveFragment.access$getMRecyclerAdapter(this.IO).notifyDataSetChanged();
            return;
        L5:
            if (PayOnlineMoveFragment.access$getMCurSyncStatus$p(this.IO) != SyncStatus.SYNCING) goto L7;
            PayOnlineMoveFragment.access$setMCurSyncStatus$p(this.IO, SyncStatus.FAILED);
            goto L7
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
        public void onStreamProgress(boolean r5, int r6, int r7, int r8, BleKey r9) {
            Intrinsics.X0O(r9, "bleKey");
            if (r5 == false) goto L10;
            PayOnlineMoveFragment.access$setMCurSyncStatus$p(this.IO, SyncStatus.SYNCING);
            BleInitializer r10 = BleInitializer.IO;
            r10.I1Ii(true);
            if (r7 != r8) goto L20;
            PayOnlineMoveFragment.access$setMCurSyncStatus$p(this.IO, SyncStatus.SYNCED);
            PayOnlineMoveFragment.access$getMDialIds$p(this.IO).set(PayOnlineMoveFragment.access$getMCurSyncDevicePosition$p(this.IO), Integer.valueOf(PayOnlineMoveFragment.access$getMCurSyncDialId$p(this.IO)));
            if (q62.OXO1.i01() == true) goto L9;
            a01.OXO1.XIi00iiXO().put("syncId", PayOnlineMoveFragment.access$getMCurSyncDialId$p(this.IO));
        L9:
            I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
            PayOnlineMoveFragment.access$getMRecyclerAdapter(this.IO).notifyDataSetChanged();
            r10.I1Ii(false);
        L20:
            PayOnlineMoveFragment.access$setMCurSyncTotal$p(this.IO, r7);
            PayOnlineMoveFragment.access$setMCurSyncCompleted$p(this.IO, r8);
            PayOnlineMoveFragment.access$getMRecyclerAdapter(this.IO).notifyItemChanged(PayOnlineMoveFragment.access$getMCurSyncPosition$p(this.IO), Integer.valueOf(PayOnlineMoveFragment.access$getMCurSyncDialId$p(this.IO)));
            return;
        L10:
            PayOnlineMoveFragment.access$setMCurSyncStatus$p(this.IO, SyncStatus.FAILED);
            if (this.IO.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) == false) goto L17;
            if (r6 == 2) goto L14;
        L16:
            ToastUtils.showLong(OOX00.OXO1.iO(r6), new Object[0]);
            goto L17
        L14:
            if (q62.OXO1.IX0() == false) goto L16;
            new OOX1XIiOI(PayOnlineMoveFragment.access$getMActivity(this.IO)).IIX1OXO();
        L17:
            BleInitializer.IO.I1Ii(false);
            PayOnlineMoveFragment.access$getMDialIds$p(this.IO).set(PayOnlineMoveFragment.access$getMCurSyncDevicePosition$p(this.IO), 0);
            if (q62.OXO1.i01() == true) goto L20;
            a01.OXO1.XIi00iiXO().put("syncId", 0);
            goto L20
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
        public void onWatchFaceIdUpdate(boolean r4) {
            if (this.IO.isResumed() == false) goto L9;
            BleConnector r5 = BleConnector.INSTANCE;
            BleKey r0 = BleKey.WATCH_FACE;
            sz0 r1 = sz0.OXO1;
            String r2 = PayOnlineMoveFragment.access$getMBinFileName$p(this.IO);
            if (r2 != null) goto L7;
            Intrinsics.XXO("mBinFileName");
            r2 = null;
        L7:
            r5.sendStream(r0, uz0.O00(r1, r2), PayOnlineMoveFragment.access$getMCurSyncDevicePosition$p(this.IO));
            q62.OXO1.XO10X();
            return;
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

    public PayOnlineMoveFragment() {
        this.recyclerView$delegate = LazyKt__LazyJVMKt.iO(new hp1(this));
        this.tvView$delegate = LazyKt__LazyJVMKt.iO(new ip1(this));
        this.tvTipView$delegate = LazyKt__LazyJVMKt.iO(new jp1(this));
        this.isMoreActivity = MoveType.DEFAULT;
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0});
        this.mCurSyncStatus = SyncStatus.NO_SYNC;
        this.orderNum = "";
        this.mBleHandleCallback = new XIi00iiXO(this);
    }

    public static /* synthetic */ void I0IIOi(PayOnlineMoveFragment r0, WatchFaceCategoryV2 r1, View r2) {
        initItem$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean IiI10X(PayOnlineMoveFragment r0) {
        return showPayConfirm$lambda$0$0(r0);
    }

    public static /* synthetic */ void O00(PayOnlineMoveFragment r0, int r1, WatchFaceCategoryV2 r2, int r3, ProgressButtonV2 r4, View r5) {
        initItem$lambda$1(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ TextView XIi00iiXO(PayOnlineMoveFragment r0) {
        return tvTipView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XO0O10(PayOnlineMoveFragment r0) {
        return tvView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XOO0ii0(PayOnlineMoveFragment r0) {
        return recyclerView_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ int access$getCount(PayOnlineMoveFragment r0) {
        return r0.getCount();
    }

    public static final /* synthetic */ DialPickerPopup access$getDialPickerPopup$p(PayOnlineMoveFragment r0) {
        return r0.dialPickerPopup;
    }

    public static final /* synthetic */ Activity access$getMActivity(PayOnlineMoveFragment r0) {
        return r0.getMActivity();
    }

    public static final /* synthetic */ String access$getMBinFileName$p(PayOnlineMoveFragment r0) {
        return r0.mBinFileName;
    }

    public static final /* synthetic */ int access$getMCurSyncDevicePosition$p(PayOnlineMoveFragment r0) {
        return r0.mCurSyncDevicePosition;
    }

    public static final /* synthetic */ int access$getMCurSyncDialId$p(PayOnlineMoveFragment r0) {
        return r0.mCurSyncDialId;
    }

    public static final /* synthetic */ int access$getMCurSyncPosition$p(PayOnlineMoveFragment r0) {
        return r0.mCurSyncPosition;
    }

    public static final /* synthetic */ SyncStatus access$getMCurSyncStatus$p(PayOnlineMoveFragment r0) {
        return r0.mCurSyncStatus;
    }

    public static final /* synthetic */ List access$getMDialIds$p(PayOnlineMoveFragment r0) {
        return r0.mDialIds;
    }

    public static final /* synthetic */ CommonAdapter access$getMRecyclerAdapter(PayOnlineMoveFragment r0) {
        return r0.getMRecyclerAdapter();
    }

    public static final /* synthetic */ void access$sendDial(PayOnlineMoveFragment r0) {
        r0.sendDial();
    }

    public static final /* synthetic */ void access$setDialPickerPopup$p(PayOnlineMoveFragment r0, DialPickerPopup r1) {
        r0.dialPickerPopup = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncCompleted$p(PayOnlineMoveFragment r0, int r1) {
        r0.mCurSyncCompleted = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncDevicePosition$p(PayOnlineMoveFragment r0, int r1) {
        r0.mCurSyncDevicePosition = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncDialId$p(PayOnlineMoveFragment r0, int r1) {
        r0.mCurSyncDialId = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncPosition$p(PayOnlineMoveFragment r0, int r1) {
        r0.mCurSyncPosition = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncStatus$p(PayOnlineMoveFragment r0, SyncStatus r1) {
        r0.mCurSyncStatus = r1;
    }

    public static final /* synthetic */ void access$setMCurSyncTotal$p(PayOnlineMoveFragment r0, int r1) {
        r0.mCurSyncTotal = r1;
    }

    public static final /* synthetic */ void access$syncDial(PayOnlineMoveFragment r0, int r1, int r2, int r3, ProgressButtonV2 r4, WatchFaceCategoryV2 r5) {
        r0.syncDial(r1, r2, r3, r4, r5);
    }

    public static final /* synthetic */ void access$syncStatusChange(PayOnlineMoveFragment r0, ProgressButtonV2 r1, SyncStatus r2) {
        r0.syncStatusChange(r1, r2);
    }

    private static final Unit getOrderStatus$lambda$0(PayOnlineMoveFragment r6, boolean r7) {
        if (r7 == true) goto L4;
    L11:
        ToastUtils.showLong(R.string.pay_confirm_error);
    L13:
        return Unit.OXO1;
    L4:
        if (r6.mCurProgressButton == null) goto L11;
        if (r6.mCurItem == null) goto L11;
        ToastUtils.showLong(R.string.pay_success_dial_itp);
        go0 r8 = r6.mPayconfirmPopup;
        if (r8 == null) goto L10;
        r8.dismiss();
    L10:
        int r1 = r6.mCurSyncDialId;
        int r2 = r6.mCurSyncPosition;
        int r3 = r6.mCurSyncDevicePosition;
        ProgressButtonV2 r4 = r6.mCurProgressButton;
        Intrinsics.XXI(r4);
        WatchFaceCategoryV2 r5 = r6.mCurItem;
        Intrinsics.XXI(r5);
        r6.syncDial(r1, r2, r3, r4, r5);
        goto L13
    }

    private final TextView getTvTipView() {
        return (TextView) getValue();
    }

    public static /* synthetic */ Unit iO(PayOnlineMoveFragment r0, boolean r1) {
        return getOrderStatus$lambda$0(r0, r1);
    }

    private static final void initItem$lambda$0(PayOnlineMoveFragment r3, WatchFaceCategoryV2 r4, View r5) {
        String r6 = r4.getPreviewUrl();
        int r0 = r4.getId();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r6);
        r1.putInt("mArg1", r0);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r4);
        Intent r7 = new Intent(r3.getActivity(), WatchFaceDialPayDetailActivity.class);
        r7.putExtras(r1);
        r3.startActivity(r7);
    }

    private static final void initItem$lambda$1(PayOnlineMoveFragment r8, int r9, WatchFaceCategoryV2 r10, int r11, ProgressButtonV2 r12, View r13) {
        if (r8.isSync() == false) goto L7;
        ToastUtils.showLong(R.string.syncing_remind);
        return;
    L7:
        if (r8.mDialIds.contains(Integer.valueOf(r9)) == false) goto L10;
        ToastUtils.showLong(R.string.dial_sync_done);
        return;
    L10:
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r8), null, null, new PayOnlineMoveFragment$initItem$2$1(r8, r10, r9, r11, r12, null), 3, null);
    }

    private static final RecyclerView recyclerView_delegate$lambda$0(PayOnlineMoveFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.recycler_view);
    }

    private final void sendDial() {
        this.mCurSyncStatus = SyncStatus.SYNCING;
        q62 r0 = q62.OXO1;
        if (r0.i01() == false) goto L6;
        BaseBleConnector.sendInt32$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.UPDATE, this.mCurSyncDialId, null, false, false, 56, null);
        return;
    L6:
        BleConnector r1 = BleConnector.INSTANCE;
        BleKey r2 = BleKey.WATCH_FACE;
        sz0 r3 = sz0.OXO1;
        String r4 = this.mBinFileName;
        if (r4 != null) goto L9;
        Intrinsics.XXO("mBinFileName");
        r4 = null;
    L9:
        r1.sendStream(r2, uz0.O00(r3, r4), this.mCurSyncDevicePosition);
        r0.XO10X();
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup != null) goto L5;
        go0 r0 = new go0(getMActivity(), 0, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.payment_completed_tip);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.yes_payment, new mp1(this));
        this.mPayconfirmPopup = r0;
    L5:
        go0 r1 = this.mPayconfirmPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean showPayConfirm$lambda$0$0(PayOnlineMoveFragment r0) {
        r0.getOrderStatus();
        return true;
    }

    private final void syncDial(int r22, int r23, int r24, final ProgressButtonV2 r25, final WatchFaceCategoryV2 r26) {
        WatchFaceManager.OXO1.OXO1(String.valueOf(r22));
        LogUtils.d(new Object[]{"syncDial -> mCurSyncPosition:" + r24 + " mCurSyncDialId:" + r22});
        this.mCurSyncStatus = SyncStatus.DOWNLOAD;
        BleCache r1 = BleCache.INSTANCE;
        this.mBinFileName = r1.getMPrototype() + IiXI1X1OO.O00 + r1.getMBleName() + IiXI1X1OO.O00 + r26.getId() + ".bin";
        sz0 r4 = sz0.OXO1;
        File r5 = uz0.X01IiOiIi(r4);
        String r6 = this.mBinFileName;
        String r7 = null;
        if (r6 != null) goto L5;
        Intrinsics.XXO("mBinFileName");
        r6 = null;
    L5:
        final File r3 = new File(r5, r6);
        File r8 = new File(uz0.X01IiOiIi(r4), r1.getMPrototype() + IiXI1X1OO.O00 + r1.getMBleName() + IiXI1X1OO.O00 + r26.getId());
        if (FileUtils.isFileExists(r8) == true) goto L9;
        FileUtils.createOrExistsFile(r8);
        FileIOUtils.writeFileFromString(r8, r26.getPreviewUrl(), false);
    L9:
        if (r3.exists() == false) goto L16;
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        String r9 = this.mBinFileName;
        if (r9 != null) goto L13;
        Intrinsics.XXO("mBinFileName");
    L14:
        r2.OXO1("syncDial -> dial try get from dialFile file = " + r7 + " size:" + FileUtils.getSize(r3));
        ProgressButtonV2.IiI10X(r25, R.string.syncing, false, 0, false, 0, null, 62, null);
        sendDial();
        return;
    L13:
        r7 = r9;
        goto L14
    L16:
        ProgressButtonV2.IiI10X(r25, R.string.downloading, false, 0, false, 0, null, 62, null);
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        String r11 = r26.getBinUrl();
        String r12 = uz0.X01IiOiIi(r4).getAbsolutePath();
        Intrinsics.O10IXXX0X(r12, "getAbsolutePath(...)");
        String r13 = this.mBinFileName;
        if (r13 != null) goto L19;
        Intrinsics.XXO("mBinFileName");
    L20:
        r10.download(r11, r12, r7, new C34631(r26, r3, r25, this));
        return;
    L19:
        r7 = r13;
        goto L20
    }

    private final void syncStatusChange(ProgressButtonV2 r22, SyncStatus r23) {
        int r1 = OXO1.OXO1[r23.ordinal()];
        if (r1 != 1) goto L5;
        ProgressButtonV2.IiI10X(r22, R.string.sync_failed, false, 0, false, 0, null, 62, null);
        return;
    L5:
        if (r1 != 2) goto L7;
        ProgressButtonV2.IiI10X(r22, R.string.sync, false, 1, false, 0, null, 58, null);
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

    private static final TextView tvTipView_delegate$lambda$0(PayOnlineMoveFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_tip_view);
    }

    private static final TextView tvView_delegate$lambda$0(PayOnlineMoveFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_view);
    }

    @tb1
    public final WatchFaceCategoryV2 getMCurItem() {
        return this.mCurItem;
    }

    @tb1
    public final ProgressButtonV2 getMCurProgressButton() {
        return this.mCurProgressButton;
    }

    @aa1
    public final String getOrderNum() {
        return this.orderNum;
    }

    public final void getOrderStatus() {
        OrderManager.OXO1.XX0(this.orderNum, "WatchFace", new gp1(this));
    }

    public final RecyclerView getRecyclerView() {
        return (RecyclerView) getValue();
    }

    public final TextView getTvView() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    public void initAdapterList() {
        SPUtils r0 = a01.OXO1.iO();
        WatchFaceCategoryV2[] r1 = (WatchFaceCategoryV2[]) new Gson().fromJson(r0.getString(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName()), WatchFaceCategoryV2[].class);
        if (r1 == null) goto L5;
        Integer r2 = Integer.valueOf(r1.length);
    L6:
        LogUtils.d(new Object[]{"list -> " + r2});
        if (r1 != null) goto L9;
    L13:
        getRecyclerView().setVisibility(8);
        getTvView().setVisibility(0);
        DeviceInfoChecker.OXO1.I1();
        return;
    L9:
        if (r1.length == 0) goto L13;
        getRecyclerView().setVisibility(0);
        getTvView().setVisibility(8);
        getMList().addAll(ArraysKt___ArraysKt.XOO0XX(r1));
        getMRecyclerAdapter().notifyDataSetChanged();
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.ag3
    public /* bridge */ /* synthetic */ void initItem(ViewHolder r1, Object r2, int r3) {
        initItem(r1, (WatchFaceCategoryV2) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<WatchFaceCategoryV2> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        String r0 = getMArg0();
        if (Intrinsics.XOO0ii0(r0, getString(R.string.pay_synchronous_title)) == false) goto L6;
        this.isMoreActivity = MoveType.BUY_HISTORY;
    L9:
        super.initView();
        TextView r1 = getTvTipView();
        if (this.isMoreActivity == MoveType.DEFAULT) goto L16;
        TextView r2 = getTvTipView();
        if (this.isMoreActivity != MoveType.BUY_HISTORY) goto L14;
        String r3 = getString(R.string.purchased_dials_tip);
    L15:
        r2.setText(r3);
        int r4 = 0;
    L17:
        r1.setVisibility(r4);
        final Activity r5 = getMActivity();
        final int r6 = itemLayoutId();
        final List<WatchFaceCategoryV2> r7 = getMList();
        CommonAdapter<WatchFaceCategoryV2> r8 = new AnonymousClass1(this, r5, r6, r7);
        getMRecyclerView().setAdapter(r8);
        setMRecyclerAdapter(r8);
        getRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), 3));
        initAdapterList();
        return;
    L14:
        r3 = getString(R.string.vip_free_dials_tip);
        goto L15
    L16:
        r4 = 8;
        goto L17
    L6:
        if (Intrinsics.XOO0ii0(r0, getString(R.string.free_limited_time_history_title)) == false) goto L8;
        this.isMoreActivity = MoveType.VIP_FREE;
        goto L9
    L8:
        this.isMoreActivity = MoveType.DEFAULT;
        goto L9
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

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        MoveType r0 = this.isMoreActivity;
        if (r0 != MoveType.BUY_HISTORY) goto L7;
        return R.layout.item_dial_f3_v4;
    L7:
        if (r0 != MoveType.VIP_FREE) goto L10;
        return R.layout.item_dial_f3_v5;
    L10:
        return R.layout.item_dial_f3_v2;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_dial_online;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        this.isNeedPayDialog = false;
        go0 r4 = this.mPayconfirmPopup;
        if (r4 == null) goto L7;
        if (r4 == null) goto L7;
        r4.dismiss();
    L7:
        if (getMList().size() <= this.mCurSyncPosition) goto L9;
        getMList().get(this.mCurSyncPosition).setPayStatus("Payed");
        getMRecyclerAdapter().notifyItemChanged(this.mCurSyncPosition);
        I01XX0.XIi00iiXO(I01XX0.XIIO11I, null, 2, null);
    L9:
        getOrderStatus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (q62.OXO1.i01() == false) goto L5;
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.WATCHFACE_ID, BleKeyFlag.READ, null, false, false, 28, null);
    L7:
        if (this.isNeedPayDialog == false) goto L10;
        this.isNeedPayDialog = false;
        showPayConfirm();
        return;
    L10:
        return;
    L5:
        this.mDialIds.set(0, Integer.valueOf(a01.OXO1.XIi00iiXO().getInt("syncId", 0)));
        LogUtils.d(new Object[]{"mDialIds -> " + this.mDialIds});
        getMRecyclerAdapter().notifyDataSetChanged();
        goto L7
    }

    public final void setMCurItem(@tb1 WatchFaceCategoryV2 r1) {
        this.mCurItem = r1;
    }

    public final void setMCurProgressButton(@tb1 ProgressButtonV2 r1) {
        this.mCurProgressButton = r1;
    }

    public final void setNeedPayDialog(boolean r1) {
        this.isNeedPayDialog = r1;
    }

    public final void setOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderNum = r2;
    }

    public void initItem(@aa1 ViewHolder r18, @aa1 final WatchFaceCategoryV2 r19, final int r20) {
        Intrinsics.X0O(r18, "holder");
        Intrinsics.X0O(r19, MapController.ITEM_LAYER_TAG);
        final int r2 = r19.getId();
        SquareImageView r0 = (SquareImageView) r18.getView(R.id.iv);
        Glide.with(requireContext()).load(r19.getPreviewUrl()).into(r0);
        r0.setOnClickListener(new kp1(this, r19));
        final ProgressButtonV2 r8 = (ProgressButtonV2) r18.getView(R.id.pb);
        if (this.isMoreActivity != MoveType.BUY_HISTORY) goto L9;
        PFMedium r1 = (PFMedium) r18.getView(R.id.pb_amount);
        if (i72.OXO1.OX() == false) goto L7;
        float r4 = r19.getDollar();
    L8:
        r1.setText(XXiO.iO(r4, null, 2, null));
        goto L9
    L7:
        r4 = r19.getAmount();
    L9:
        View r3 = r18.getView(R.id.item_dial_new_ll);
        if (r3 != null) goto L12;
    L18:
        Intrinsics.XXI(r8);
        XXiO.IiI10X(r8, r19.getDollar(), r19.getAmount(), r19.getDollarDis(), r19.getAmountDis(), r19.getLimitFreeFlag(), r19.getMemberAttr(), r19.getPayStatus());
        if (this.isMoreActivity != MoveType.VIP_FREE) goto L28;
        ImageView r5 = (ImageView) r18.getView(R.id.iv_icon);
        PFMedium r6 = (PFMedium) r18.getView(R.id.pb_amount);
        if (r19.getLimitFreeFlag() == false) goto L24;
        Glide.with(requireContext()).load(Integer.valueOf(R.drawable.limited_time_icon)).into(r5);
        r6.setText(getString(R.string.free_order_amount));
    L26:
        ProgressButtonV2.IiI10X(r8, R.string.sync, false, 1, false, 0, null, 58, null);
        goto L28
    L24:
        if (Intrinsics.XOO0ii0(r19.getMemberAttr(), "1") == false) goto L26;
        Glide.with(requireContext()).load(Integer.valueOf(R.drawable.memberattr_vip_icon)).into(r5);
        r6.setText(getString(R.string.dial_vip_exclusive));
    L28:
        if (this.mCurSyncDialId != r2) goto L31;
        syncStatusChange(r8, this.mCurSyncStatus);
    L33:
        r18.setOnClickListener(R.id.pb, new lp1(this, r2, r19, r20, r8));
        return;
    L31:
        if (this.mDialIds.contains(Integer.valueOf(r2)) == false) goto L33;
        ProgressButtonV2.IiI10X(r8, R.string.synced, true, 0, false, 0, null, 60, null);
        goto L33
    L12:
        if (r19.getNewFlag() == true) goto L14;
    L16:
        int r7 = 8;
    L17:
        r3.setVisibility(r7);
        goto L18
    L14:
        if (i72.OXO1.X1i() == false) goto L16;
        r7 = 0;
        goto L17
    }
}
