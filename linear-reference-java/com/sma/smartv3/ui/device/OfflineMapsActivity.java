package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IXXOi1X0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ee1;
import com.android.mltcode.paycertificationapi.fe1;
import com.android.mltcode.paycertificationapi.ge1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.he1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ie1;
import com.android.mltcode.paycertificationapi.je1;
import com.android.mltcode.paycertificationapi.ke1;
import com.android.mltcode.paycertificationapi.le1;
import com.android.mltcode.paycertificationapi.me1;
import com.android.mltcode.paycertificationapi.ne1;
import com.android.mltcode.paycertificationapi.oe1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.pe1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.ironsource.C2985d4;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.MapFileItem;
import com.sma.smartv3.pop.MessageListV2Popup;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DeviceItemDecoration;
import com.sma.smartv3.util.OffLineMapManagerKt;
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
import com.szabh.smable3.entity.DeleteFileTransfer;
import com.szabh.smable3.entity.FileTransfer;
import com.szabh.smable3.entity.MultipleFileTransfer;
import com.szabh.smable3.entity.MusicCommand;
import com.szabh.smable3.entity.SearchFileTransfer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOfflineMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineMapsActivity.kt\ncom/sma/smartv3/ui/device/OfflineMapsActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,555:1\n3919#2:556\n4434#2,2:557\n1869#3:559\n1870#3:561\n1#4:560\n1#4:565\n69#5,3:562\n72#5,5:566\n*S KotlinDebug\n*F\n+ 1 OfflineMapsActivity.kt\ncom/sma/smartv3/ui/device/OfflineMapsActivity\n*L\n239#1:556\n239#1:557,2\n240#1:559\n240#1:561\n319#1:565\n319#1:562,3\n319#1:566,5\n*E\n"})
public class OfflineMapsActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private String deletePath;

    @aa1
    private final OXO1 mBleHandleCallback;

    @tb1
    private FileTransfer mCurFile;

    @tb1
    private go0 mDeletePopup;

    @aa1
    private final List<String> mDeviceMapList;

    @aa1
    private final Lazy mDeviceStorage$delegate;

    @aa1
    private final List<FileTransfer> mFileTransferList;
    private int mFilesTotalSize;

    @aa1
    private final List<MapFileItem> mList;

    @tb1
    private CommonAdapter<MapFileItem> mListAdapter;

    @tb1
    private MessageListV2Popup mListPopup;

    @aa1
    private final File mMapDir;

    @aa1
    private final Lazy mNullView$delegate;

    @aa1
    private final Lazy mOfflineTitle$delegate;
    private float mPopupCompleted;

    @tb1
    private c72 mProgressPopup;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mStorageProgressBar$delegate;

    public static final class OXO1 implements BleHandleCallback {
        public final /* synthetic */ OfflineMapsActivity IO;

        public OXO1(OfflineMapsActivity r1) {
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
            ToastUtils.showLong(R.string.sync_failed);
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
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
        public void onDeleteFileResponse(int r5) {
            if (r5 != 0) goto L12;
            OfflineMapsActivity.access$readMapList(this.IO);
            if (this.IO.getDeletePath().length() <= 0) goto L14;
            boolean r6 = FileUtils.delete(this.IO.getDeletePath());
            String r1 = this.IO.getDeletePath().substring(0, this.IO.getDeletePath().length() - 4);
            Intrinsics.O10IXXX0X(r1, "substring(...)");
            FileUtils.delete(r1);
            if (r6 == false) goto L9;
            ToastUtils.showLong(this.IO.getString(R.string.delete_success), new Object[0]);
        L10:
            this.IO.showData();
            return;
        L9:
            ToastUtils.showLong(this.IO.getString(R.string.failed_to_delete), new Object[0]);
            goto L10
        L14:
            return;
        L12:
            ToastUtils.showLong(R.string.failed_to_delete);
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
        public void onMultiFileTransferResponse(int r5) {
            super.onMultiFileTransferResponse(r5);
            i1O0OXO1O.OXO1.OXO1(this.IO.getTAG() + " onMultiFileTransferResponse state = " + r5 + " , mFileList.size = " + this.IO.getMFileTransferList().size());
            if (r5 == 0) goto L11;
            if (r5 == 20) goto L8;
            ToastUtils.showLong(R.string.sync_failed);
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
            return;
        L8:
            OfflineMapsActivity.access$readMapList(this.IO);
            ToastUtils.showLong(R.string.synced);
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
            return;
        L11:
            if (this.IO.getMFileTransferList().isEmpty() == true) goto L14;
            OfflineMapsActivity.access$nextTransfer(this.IO);
            return;
        L14:
            ToastUtils.showLong(R.string.sync_failed);
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
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
        public void onReadMultiFileTransfer(BleMapFileList r4) {
            Intrinsics.X0O(r4, "info");
            super.onReadMultiFileTransfer(r4);
            this.IO.getMDeviceMapList().clear();
            if (r4.getMList().isEmpty() == true) goto L5;
            this.IO.getMDeviceMapList().addAll(r4.getMList());
        L5:
            i1O0OXO1O.OXO1.OXO1(this.IO.getTAG() + "  mDeviceMapList = " + this.IO.getMDeviceMapList());
            if (this.IO.getMListAdapter() == null) goto L9;
            this.IO.showData();
            return;
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
        public void onReadSDCardInfo(BleSDCardInfo r2) {
            Intrinsics.X0O(r2, "sdCardInfo");
            this.IO.watchFreeSpaceToText(r2);
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
        public void onSDCardInfoUpdate(BleSDCardInfo r2) {
            Intrinsics.X0O(r2, "sdCardInfo");
            this.IO.watchFreeSpaceToText(r2);
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
        public void onSessionStateChange(boolean r1) {
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
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
            if (r2 == false) goto L14;
            float r7 = r5;
            float r8 = 100;
            int r9 = (int) ((r7 / r4) * r8);
            int r10 = (int) (((this.IO.getMPopupCompleted() + r7) / this.IO.getMFilesTotalSize()) * r8);
            c72 r11 = OfflineMapsActivity.access$getMProgressPopup$p(this.IO);
            if (r11 == null) goto L7;
            r11.I1(R.string.syncing);
            r11.OX(r10);
        L7:
            if (r9 != 100) goto L16;
            OfflineMapsActivity r12 = this.IO;
            r12.setMPopupCompleted(r12.getMPopupCompleted() + r7);
            List<FileTransfer> r13 = this.IO.getMFileTransferList();
            TypeIntrinsics.OXO1(r13).remove(this.IO.getMCurFile());
            this.IO.setMCurFile(null);
            if (this.IO.getMFileTransferList().isEmpty() == true) goto L12;
            OfflineMapsActivity.access$nextTransfer(this.IO);
            return;
        L12:
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
            ToastUtils.showLong(R.string.offline_synced);
            OfflineMapsActivity.access$readMapList(this.IO);
            return;
        L16:
            return;
        L14:
            OfflineMapsActivity.access$dismissSyncPoP(this.IO);
            ToastUtils.showLong(R.string.sync_failed);
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

    public static final class XIi00iiXO implements MessageListV2Popup.OXO1 {
        public final /* synthetic */ OfflineMapsActivity OXO1;
        public final /* synthetic */ MapFileItem XIi00iiXO;

        public XIi00iiXO(OfflineMapsActivity r1, MapFileItem r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.sma.smartv3.pop.MessageListV2Popup.OXO1
        public void OXO1(int r8, String r9) {
            Intrinsics.X0O(r9, "str");
            if (Intrinsics.XOO0ii0(r9, this.OXO1.getString(R.string.offline_device_app_delete)) == false) goto L7;
            OfflineMapsActivity.access$delete(this.OXO1, this.XIi00iiXO.getImgPath(), this.XIi00iiXO.getName(), 2, R.string.offline_all_delete_tip);
            return;
        L7:
            if (Intrinsics.XOO0ii0(r9, this.OXO1.getString(R.string.offline_app_delete)) == false) goto L11;
            OfflineMapsActivity.delete$default(this.OXO1, this.XIi00iiXO.getImgPath(), null, 0, R.string.offline_app_delete_tip, 2, null);
            return;
        L11:
            if (Intrinsics.XOO0ii0(r9, this.OXO1.getString(R.string.offline_device_delete)) == false) goto L15;
            OfflineMapsActivity.delete$default(this.OXO1, null, this.XIi00iiXO.getName(), 1, R.string.offline_device_delete_tip, 1, null);
            return;
        L15:
            if (Intrinsics.XOO0ii0(r9, this.OXO1.getString(R.string.offline_syne_device)) == true) goto L17;
            return;
        L17:
            if (BleConnector.INSTANCE.isAvailable() == false) goto L20;
            OfflineMapsActivity.access$syneMap(this.OXO1, this.XIi00iiXO.getImgPath());
            return;
        L20:
            ToastUtils.showLong(R.string.offline_not_connected);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.OfflineMapsActivity$initView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends CommonAdapter<MapFileItem> {
        final /* synthetic */ OfflineMapsActivity this$0;

        public AnonymousClass1(OfflineMapsActivity r2, List<MapFileItem> r3) {
            this.this$0 = r2;
            super(r2, R.layout.item_off_line_map, r3);
        }

        public static /* synthetic */ void OXO1(OfflineMapsActivity r0, MapFileItem r1, View r2) {
            convert$lambda$0(r0, r1, r2);
        }

        private static final void convert$lambda$0(OfflineMapsActivity r0, MapFileItem r1, View r2) {
            OfflineMapsActivity.access$showListPopup(r0, r1);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, MapFileItem r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, final MapFileItem r4, int r5) {
            Intrinsics.X0O(r3, "holder");
            Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
            r3.setText(R.id.off_line_map_title, r4.getName());
            r3.setText(R.id.off_line_map_size, r4.getFileAllSize());
            View r6 = r3.getView(R.id.off_line_map_type);
            if (r4.isSync() == false) goto L5;
            int r0 = 0;
        L6:
            r6.setVisibility(r0);
            ImageView r7 = (ImageView) r3.getView(R.id.off_line_map_icon);
            Glide.with(this.mContext).load(r4.getImgPath()).into(r7);
            View r8 = r3.itemView;
            final OfflineMapsActivity r9 = this.this$0;
            r8.setOnClickListener(new pe1(r9, r4));
            return;
        L5:
            r0 = 8;
            goto L6
        }
    }

    public OfflineMapsActivity() {
        this.TAG = "OfflineMapsActivity";
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new ee1(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ge1(this));
        this.mMapDir = uz0.iXiX011(sz0.OXO1);
        this.deletePath = "";
        this.mList = new ArrayList();
        this.mDeviceMapList = new ArrayList();
        this.mFileTransferList = new ArrayList();
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new he1(this));
        this.mOfflineTitle$delegate = LazyKt__LazyJVMKt.iO(new ie1(this));
        this.mDeviceStorage$delegate = LazyKt__LazyJVMKt.iO(new je1(this));
        this.mStorageProgressBar$delegate = LazyKt__LazyJVMKt.iO(new ke1(this));
        this.mNullView$delegate = LazyKt__LazyJVMKt.iO(new le1(this));
        this.mBleHandleCallback = new OXO1(this);
    }

    public static /* synthetic */ ProgressBar I0iXXO(OfflineMapsActivity r0) {
        return mStorageProgressBar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(OfflineMapsActivity r0, String r1, String r2, BleConnector r3) {
        return showDeletePopup$lambda$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextView IIX1OXO(OfflineMapsActivity r0) {
        return mDeviceStorage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(OfflineMapsActivity r0, boolean r1) {
        return addOffLineMap$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean OIX0iXi(int r0, OfflineMapsActivity r1, String r2, String r3) {
        return showDeletePopup$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ ImageView X0O(OfflineMapsActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(OfflineMapsActivity r0) {
        return mNullView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(OfflineMapsActivity r0, String r1, BleConnector r2) {
        return showDeletePopup$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView XXI(OfflineMapsActivity r0) {
        return mOfflineTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XiOIO(OfflineMapsActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(OfflineMapsActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(OfflineMapsActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$delete(OfflineMapsActivity r0, String r1, String r2, int r3, int r4) {
        r0.delete(r1, r2, r3, r4);
    }

    public static final /* synthetic */ void access$dismissSyncPoP(OfflineMapsActivity r0) {
        r0.dismissSyncPoP();
    }

    public static final /* synthetic */ c72 access$getMProgressPopup$p(OfflineMapsActivity r0) {
        return r0.mProgressPopup;
    }

    public static final /* synthetic */ void access$nextTransfer(OfflineMapsActivity r0) {
        r0.nextTransfer();
    }

    public static final /* synthetic */ void access$readMapList(OfflineMapsActivity r0) {
        r0.readMapList();
    }

    public static final /* synthetic */ void access$showListPopup(OfflineMapsActivity r0, MapFileItem r1) {
        r0.showListPopup(r1);
    }

    public static final /* synthetic */ void access$syneMap(OfflineMapsActivity r0, String r1) {
        r0.syneMap(r1);
    }

    private static final Unit addOffLineMap$lambda$0(OfflineMapsActivity r1, boolean r2) {
        if (r2 == false) goto L4;
        r1.startActivity(new Intent(r1, DownLoadMapsActivity.class));
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.fail);
        goto L6
    }

    private final void delete(String r1, String r2, int r3, int r4) {
        showDeletePopup(r1, r2, r3, r4);
    }

    public static /* synthetic */ void delete$default(OfflineMapsActivity r1, String r2, String r3, int r4, int r5, int r6, Object r7) {
        if (r7 != null) goto L12;
        if ((r6 & 1) == 0) goto L7;
        r2 = "";
    L7:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        r1.delete(r2, r3, r4, r5);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
    }

    private final void deleteDevice(String r9) {
        BleConnector r0 = BleConnector.INSTANCE;
        BleKey r1 = BleKey.MULTIPLE_FILES_CONTROLLER;
        BleKeyFlag r2 = BleKeyFlag.DELETE;
        DeleteFileTransfer r3 = new DeleteFileTransfer(0, null, 3, null);
        r3.setMFileName("/map/" + r9);
        Unit r10 = Unit.OXO1;
        BaseBleConnector.sendData$default(r0, r1, r2, r3.toByteArray(), false, false, 24, null);
        showData();
    }

    private final void dismissSyncPoP() {
        BleInitializer.IO.I1Ii(false);
        c72 r0 = this.mProgressPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    private final TextView getMDeviceStorage() {
        return (TextView) getValue();
    }

    private final View getMNullView() {
        return (View) getValue();
    }

    private final TextView getMOfflineTitle() {
        return (TextView) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final ProgressBar getMStorageProgressBar() {
        return (ProgressBar) getValue();
    }

    public static /* synthetic */ TextView iIiiO(OfflineMapsActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final TextView mDeviceStorage_delegate$lambda$0(OfflineMapsActivity r1) {
        return (TextView) r1.findViewById(R.id.storage_device);
    }

    private static final View mNullView_delegate$lambda$0(OfflineMapsActivity r1) {
        return r1.findViewById(R.id.null_view);
    }

    private static final TextView mOfflineTitle_delegate$lambda$0(OfflineMapsActivity r1) {
        return (TextView) r1.findViewById(R.id.offline_maps_title);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(OfflineMapsActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private static final ProgressBar mStorageProgressBar_delegate$lambda$0(OfflineMapsActivity r1) {
        return (ProgressBar) r1.findViewById(R.id.step_v2_goal_pb_progress);
    }

    private final void nextTransfer() {
        FileTransfer r0 = this.mCurFile;
        if (r0 != null) goto L8;
        FileTransfer r1 = (FileTransfer) CollectionsKt___CollectionsKt.IIII0iI(this.mFileTransferList);
        this.mCurFile = r1;
        i1O0OXO1O.OXO1.OXO1("offLineMap create  mCurFile = " + r1);
        FileTransfer r2 = this.mCurFile;
        if (r2 == null) goto L11;
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.MULTIPLE_FILES_CONTROLLER, BleKeyFlag.UPDATE, r2.toByteArray(), false, false, 24, null);
        return;
    L11:
        return;
    L8:
        if (r0 == null) goto L12;
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  file  mCurFile = " + r0);
        BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.FILE_TRANSFER, r0.getMFileByteArray(), 0, 4, null);
        toShowSyncPoP();
        return;
    }

    private final void readMapList() {
        BleConnector r0 = BleConnector.INSTANCE;
        BleKey r1 = BleKey.MULTIPLE_FILES_CONTROLLER;
        BleKeyFlag r2 = BleKeyFlag.RESET;
        SearchFileTransfer r3 = new SearchFileTransfer(0, 0, null, null, 15, null);
        r3.setMSearchType("DIR");
        r3.setMFilePath("/map");
        Unit r4 = Unit.OXO1;
        BaseBleConnector.sendData$default(r0, r1, r2, r3.toByteArray(), false, false, 24, null);
    }

    private final void setOffLineView() {
        CommonAdapter<MapFileItem> r0 = this.mListAdapter;
        if (r0 != null) goto L5;
    L8:
        getMOfflineTitle().setVisibility(0);
        getMDeviceStorage().setVisibility(0);
        getMStorageProgressBar().setVisibility(0);
        getMNullView().setVisibility(8);
        return;
    L5:
        if (r0.getItemCount() != 0) goto L8;
        getMOfflineTitle().setVisibility(8);
        getMDeviceStorage().setVisibility(8);
        getMStorageProgressBar().setVisibility(8);
        getMNullView().setVisibility(0);
    }

    private final void setTitleRightResource(int r3) {
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(r3);
        getAbhTitleRight().setImageTintList(ContextCompat.getColorStateList(getMContext(), R.color.abh_text_color));
    }

    private final void showDeletePopup(final String r5, final String r6, final int r7, int r8) {
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.delete);
        r0.iX(Integer.valueOf(r8));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new me1(r7, this, r5, r6));
        this.mDeletePopup = r0;
        r0.IIX1OXO();
    }

    public static /* synthetic */ void showDeletePopup$default(OfflineMapsActivity r0, String r1, String r2, int r3, int r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 2) == 0) goto L6;
        r2 = "";
    L6:
        r0.showDeletePopup(r1, r2, r3, r4);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDeletePopup");
    }

    private static final boolean showDeletePopup$lambda$0$0(int r4, final OfflineMapsActivity r5, final String r6, final String r7) {
        if (r4 != 0) goto L5;
        r5.deletePath = "";
        boolean r8 = FileUtils.delete(r6);
        String r9 = r6.substring(0, r6.length() - 4);
        Intrinsics.O10IXXX0X(r9, "substring(...)");
        FileUtils.delete(r9);
        if (r8 == false) goto L14;
        ToastUtils.showLong(r5.getString(R.string.delete_success), new Object[0]);
    L15:
        r5.showData();
    L16:
        return true;
    L14:
        ToastUtils.showLong(r5.getString(R.string.failed_to_delete), new Object[0]);
        goto L15
    L5:
        if (r4 != 1) goto L7;
        X0IOiX1O.XIi00iiXO(false, new oe1(r5, r7), 1, null);
        goto L16
    L7:
        if (r4 != 2) goto L16;
        X0IOiX1O.XIi00iiXO(false, new fe1(r5, r7, r6), 1, null);
        goto L16
    }

    private static final Unit showDeletePopup$lambda$0$0$0(OfflineMapsActivity r1, String r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r1.deletePath = "";
        r1.deleteDevice(r2);
        return Unit.OXO1;
    }

    private static final Unit showDeletePopup$lambda$0$0$1(OfflineMapsActivity r1, String r2, String r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        r1.deleteDevice(r2);
        r1.deletePath = r3;
        return Unit.OXO1;
    }

    private final void showListPopup(MapFileItem r8) {
        if (r8.isSync() == false) goto L6;
        List r0 = CollectionsKt__CollectionsKt.Ii1iii0(new String[]{getString(R.string.offline_device_app_delete), getString(R.string.offline_app_delete), getString(R.string.offline_device_delete)});
    L7:
        MessageListV2Popup r1 = new MessageListV2Popup(this, 0, r0, 2, null);
        r1.OX(new XIi00iiXO(this, r8));
        this.mListPopup = r1;
        if (r1.isShowing() != true) goto L12;
        MessageListV2Popup r9 = this.mListPopup;
        if (r9 == null) goto L12;
        r9.dismiss();
    L12:
        MessageListV2Popup r10 = this.mListPopup;
        if (r10 == null) goto L16;
        r10.IIX1OXO();
        return;
    L16:
        return;
    L6:
        r0 = CollectionsKt__CollectionsKt.Ii1iii0(new String[]{getString(R.string.offline_syne_device), getString(R.string.offline_app_delete)});
        goto L7
    }

    private final void syneMap(String r14) {
        int r2 = 0;
        String r1 = r14.substring(0, r14.length() - 4);
        Intrinsics.O10IXXX0X(r1, "substring(...)");
        File r0 = new File(r1);
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  -->  path = " + r14 + "  ,   folder.name = " + r0.getName());
        File[] r15 = r0.listFiles();
        if (r15 != null) goto L5;
    L13:
        ToastUtils.showLong(getString(R.string.offline_error_tip), new Object[0]);
        return;
    L5:
        if (r15.length == 0) goto L13;
        this.mFileTransferList.clear();
        this.mFilesTotalSize = 0;
        this.mPopupCompleted = 0.0f;
        dismissSyncPoP();
        this.mProgressPopup = null;
        int r3 = r15.length;
    L9:
        if (r2 >= r3) goto L11;
        File r4 = r15[r2];
        byte[] r9 = FileIOUtils.readFile2BytesByStream(r4);
        this.mFilesTotalSize += r9.length;
        List<FileTransfer> r12 = this.mFileTransferList;
        String r8 = "/map/" + r0.getName() + "/" + r4.getName();
        Intrinsics.XXI(r9);
        r12.add(new FileTransfer(0, calculate(r9), r8, r9, 1, null));
        r2 = r2 + 1;
        goto L9
    L11:
        MultipleFileTransfer r16 = new MultipleFileTransfer(0, this.mFilesTotalSize, "/map/" + r0.getName(), 1, null);
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  offLineMap = " + r16);
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.MULTIPLE_FILES_CONTROLLER, BleKeyFlag.CREATE, r16.toByteArray(), false, false, 24, null);
    }

    private final void toShowSyncPoP() {
        if (this.mProgressPopup != null) goto L8;
        int r3 = 0;
        this.mProgressPopup = new c72(this, r3, 2, null);
        BleInitializer.IO.I1Ii(true);
        c72 r0 = this.mProgressPopup;
        if (r0 == null) goto L9;
        r0.I0iXXO(false);
        r0.I1(R.string.syncing);
        r0.OX(0);
        r0.IIX1OXO();
        return;
    L9:
        return;
    }

    public void addOffLineMap() {
        OffLineMapManagerKt.IO(null, null, new ne1(this), 3, null);
    }

    public final int calculate(@aa1 byte[] r11) {
        Intrinsics.X0O(r11, "bytes");
        int r0 = r11.length;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r0) goto L21;
        byte r5 = r11[r2];
        int r6 = 0;
    L6:
        if (r6 >= 8) goto L19;
        boolean r8 = true;
        if (((r5 >> (7 - r6)) & 1) != 1) goto L10;
        boolean r7 = true;
    L12:
        if (((r3 >> 15) & 1) == 1) goto L15;
        r8 = false;
    L15:
        r3 = r3 << 1;
        if ((r7 ^ r8) == false) goto L18;
        r3 = r3 ^ 4129;
    L18:
        r6 = r6 + 1;
        goto L6
    L10:
        r7 = false;
        goto L12
    L19:
        r2 = r2 + 1;
        goto L4
    L21:
        return (((65535 & r3) >> 8) & 255) | ((r3 & 255) << 8);
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final String getDeletePath() {
        return this.deletePath;
    }

    @tb1
    public final FileTransfer getMCurFile() {
        return this.mCurFile;
    }

    @aa1
    public final List<String> getMDeviceMapList() {
        return this.mDeviceMapList;
    }

    @aa1
    public final List<FileTransfer> getMFileTransferList() {
        return this.mFileTransferList;
    }

    public final int getMFilesTotalSize() {
        return this.mFilesTotalSize;
    }

    @aa1
    public final List<MapFileItem> getMList() {
        return this.mList;
    }

    @tb1
    public final CommonAdapter<MapFileItem> getMListAdapter() {
        return this.mListAdapter;
    }

    public final float getMPopupCompleted() {
        return this.mPopupCompleted;
    }

    public final void getSDCardInfo() {
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.SDCARD_INFO, BleKeyFlag.READ, null, false, false, 28, null);
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        getSDCardInfo();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(setTitle());
        BleSDCardInfo r0 = (BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null);
        if (r0 == null) goto L5;
        watchFreeSpaceToText(r0);
    L5:
        readMapList();
        setTitleRightResource(R.drawable.ic_coaching_add);
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        getMRecyclerView().addItemDecoration(new DeviceItemDecoration(SizeUtils.dp2px(16.0f), false, false, 0, false, 30, null));
        AnonymousClass1 r1 = new AnonymousClass1(this, this.mList);
        getMRecyclerView().setAdapter(r1);
        this.mListAdapter = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_offline_maps;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        addOffLineMap();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        showData();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        addOffLineMap();
    }

    public final void setDeletePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.deletePath = r2;
    }

    public final void setDeviceStorage(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, C2985d4.i.l);
        Intrinsics.X0O(r4, "surplus");
        TextView r0 = getMDeviceStorage();
        if (r0 == null) goto L6;
        r0.setText(getString(R.string.app_store_title_tip_2, new Object[]{r3, r4}));
        return;
    }

    public final void setMCurFile(@tb1 FileTransfer r1) {
        this.mCurFile = r1;
    }

    public final void setMFilesTotalSize(int r1) {
        this.mFilesTotalSize = r1;
    }

    public final void setMListAdapter(@tb1 CommonAdapter<MapFileItem> r1) {
        this.mListAdapter = r1;
    }

    public final void setMPopupCompleted(float r1) {
        this.mPopupCompleted = r1;
    }

    @aa1
    public final String setTitle() {
        String r0 = getString(R.string.offline_maps);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }

    public final void showData() {
        this.mList.clear();
        File[] r1 = this.mMapDir.listFiles();
        if (r1 == null) goto L10;
        ArrayList r5 = new ArrayList();
        int r6 = r1.length;
        int r7 = 0;
    L5:
        if (r7 >= r6) goto L11;
        File r8 = r1[r7];
        String r9 = r8.getName();
        Intrinsics.O10IXXX0X(r9, "getName(...)");
        if (oe5.O0Ii(r9, ".jpg", false, 2, null) == false) goto L9;
        r5.add(r8);
    L9:
        r7 = r7 + 1;
    L11:
        if (r5 == null) goto L43;
        Iterator r10 = r5.iterator();
    L14:
        if (r10.hasNext() == false) goto L43;
        File r11 = (File) r10.next();
        if (r11.exists() == false) goto L14;
        if (r11.getName().length() <= 4) goto L14;
        String r12 = r11.getName();
        Intrinsics.O10IXXX0X(r12, "getName(...)");
        String r13 = r12.substring(0, r11.getName().length() - 4);
        Intrinsics.O10IXXX0X(r13, "substring(...)");
        int r14 = r1.length;
        int r15 = 0;
    L20:
        if (r15 >= r14) goto L25;
        File r16 = r1[r15];
        if (Intrinsics.XOO0ii0(r16.getName(), r13) == true) goto L26;
        r15 = r15 + 1;
    L26:
        if (r16 == null) goto L14;
        if (r16.isDirectory() == false) goto L14;
        float r17 = 1024;
        float r18 = (FileUtils.getLength(r16) / r17) / r17;
        if (r18 <= 0.0f) goto L14;
        List<MapFileItem> r19 = this.mList;
        String r110 = r11.getAbsolutePath();
        Intrinsics.O10IXXX0X(r110, "getAbsolutePath(...)");
        String r20 = r16.getName();
        Intrinsics.O10IXXX0X(r20, "getName(...)");
        int r21 = r16.listFiles().length;
        Iterator<T> r111 = this.mDeviceMapList.iterator();
    L33:
        if (r111.hasNext() == false) goto L37;
        Object r112 = r111.next();
        if (Intrinsics.XOO0ii0(r16.getName(), (String) r112) == false) goto L33;
    L39:
        if (r112 == null) goto L41;
        boolean r22 = true;
    L42:
        r19.add(new MapFileItem(0, r110, null, null, null, r20, cp5.XXX11i(r18, true) + "MB", r21, r22, 0.0d, 0, null, false, 7709, null));
        goto L14
    L41:
        r22 = false;
        goto L42
    L37:
        r112 = null;
        goto L39
    L25:
        r16 = null;
    L43:
        getMOfflineTitle().setText(getString(R.string.map_total) + " : " + this.mList.size() + "  " + getString(R.string.device_map) + " : " + this.mDeviceMapList.size());
        CommonAdapter<MapFileItem> r2 = this.mListAdapter;
        if (r2 == null) goto L46;
        r2.notifyDataSetChanged();
    L46:
        setOffLineView();
        return;
    L10:
        r5 = null;
        goto L11
    }

    public final void watchFreeSpaceToText(@tb1 BleSDCardInfo r13) {
        if (r13 == null) goto L5;
        long r2 = r13.getMFreeSize();
    L6:
        long r3 = r2 * 1024;
        if (r13 == null) goto L9;
        long r6 = r13.getMTotalSize();
    L10:
        long r7 = r6 * 1024;
        if (r7 != 0) goto L14;
        return;
    L14:
        if (r3 >= 0) goto L17;
        return;
    L17:
        if (r7 > IXXOi1X0.i010I) goto L20;
        double r0 = 0.5d;
    L27:
        String r1 = ConvertUtils.byte2FitMemorySize((long) (r0 * ((double) 1073741824)), 1);
        Intrinsics.XXI(r1);
        String r4 = ConvertUtils.byte2FitMemorySize(r3, 1);
        Intrinsics.O10IXXX0X(r4, "byte2FitMemorySize(...)");
        setDeviceStorage(r1, r4);
        if (r7 == 0) goto L31;
        long r5 = 1024;
        long r8 = r7 / r5;
        getMStorageProgressBar().setMax((int) r8);
        getMStorageProgressBar().setProgress((int) (r8 - (r3 / r5)));
        return;
    L31:
        return;
    L20:
        if (r7 > 1073741824) goto L22;
        r0 = 1.0d;
        goto L27
    L22:
        long r9 = 1073741824;
        if ((r7 % r9) != 0) goto L26;
        long r10 = r7 / r9;
    L25:
        r0 = r10;
        goto L27
    L26:
        r10 = (r7 / r9) + 1;
        goto L25
    L9:
        r6 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }
}
