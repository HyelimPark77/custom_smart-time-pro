package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.I01X1i1;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.I10XI1OOO;
import com.android.mltcode.paycertificationapi.I10i1IO10;
import com.android.mltcode.paycertificationapi.I11iO0X;
import com.android.mltcode.paycertificationapi.IIOiXXi;
import com.android.mltcode.paycertificationapi.IO0IXXXI;
import com.android.mltcode.paycertificationapi.IOXi0X;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.Ii1OIOX00;
import com.android.mltcode.paycertificationapi.O11;
import com.android.mltcode.paycertificationapi.O1I0iIX0;
import com.android.mltcode.paycertificationapi.O1iii11i;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X0OIIXX;
import com.android.mltcode.paycertificationapi.X0OO100;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.XIOO0OI0;
import com.android.mltcode.paycertificationapi.XO1X00;
import com.android.mltcode.paycertificationapi.XiO;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0X010I;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ii01;
import com.android.mltcode.paycertificationapi.iiXI0;
import com.android.mltcode.paycertificationapi.iiXiX1i;
import com.android.mltcode.paycertificationapi.ml1;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.ta2;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tn0;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.ut3;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.gson.Gson;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.db.entity.BleDeviceCache;
import com.sma.smartv3.db.entity.RecordDeviceInfo;
import com.sma.smartv3.initializer.AGPSInitializer;
import com.sma.smartv3.model.DeviceLaseRecord;
import com.sma.smartv3.model.DeviceOnlineInfo;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.model.AddDeviceViewModel;
import com.sma.smartv3.util.ActivityUtilKt;
import com.sma.smartv3.util.BluetoothConnectionReceiver;
import com.sma.smartv3.util.ClassicBluetoothUtil;
import com.sma.smartv3.util.NetUtil;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.PagerIndicator;
import com.sma.smartv3.view.PillTabView;
import com.sma.smartv3.view.text.PFMedium;
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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,730:1\n85#2,3:731\n97#2,3:734\n97#2,3:737\n85#2,3:740\n1#3:743\n1#3:751\n87#4,7:744\n94#4,3:752\n70#4,7:755\n97#4:762\n*S KotlinDebug\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n218#1:731,3\n245#1:734,3\n246#1:737,3\n338#1:740,3\n606#1:751\n606#1:744,7\n606#1:752,3\n606#1:755,7\n606#1:762\n*E\n"})
public final class AddDeviceWithThirdPartyActivity extends BaseListFunctionActivity<BleDevice> {

    @tb1
    private ml1 connectPop;

    @aa1
    private String connectingDeviceAddress;

    @aa1
    private String connectingDeviceName;

    @aa1
    private final Lazy empty$delegate;

    @aa1
    private final Lazy ivScanBg$delegate;

    @aa1
    private final O00 mBleHandleCallback;

    @aa1
    private final List<BleDevice> mCacheSortByList;

    @tb1
    private ml1 mConfirmPopup;

    @aa1
    private List<DeviceOnlineInfo> mOnlineDeviceList;

    @aa1
    private final Lazy mScanner$delegate;

    @aa1
    private final Lazy pagerIndicator$delegate;

    @aa1
    private final Lazy pillTabView$delegate;

    @aa1
    private SearchType searchType;

    @aa1
    private final ClassicBluetoothUtil thirdPartyUtil;

    @aa1
    private final Lazy tv1$delegate;

    @aa1
    private final Lazy tv2$delegate;

    @aa1
    private final Lazy tvBottom2$delegate;

    @aa1
    private final AddDeviceViewModel viewModel;

    @SourceDebugExtension({"SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,730:1\n1#2:731\n*E\n"})
    public static final class IiI10X implements OOXIOIiOO {
        public final /* synthetic */ AddDeviceWithThirdPartyActivity OXO1;

        public IiI10X(AddDeviceWithThirdPartyActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice r6) {
            Intrinsics.X0O(r6, "device");
            if (TextUtils.isEmpty(r6.getMName()) == false) goto L5;
        L24:
            return false;
        L5:
            if (r6.getMRssi() <= (-100)) goto L24;
            i72 r0 = i72.OXO1;
            if (r0.IXOIIIO() == true) goto L22;
            q62 r2 = q62.OXO1;
            if (r2.i0iIXiI().contains(r6.getMName()) == false) goto L11;
            return true;
        L11:
            if (TextUtils.isEmpty(r2.iIXX0i(r6.getMName())) == true) goto L13;
            return true;
        L13:
            if (r0.XIi00iiXO(r6.getMName()) == true) goto L30;
            Iterator r1 = AddDeviceWithThirdPartyActivity.access$getMOnlineDeviceList$p(this.OXO1).iterator();
        L16:
            if (r1.hasNext() == false) goto L20;
            Object r3 = r1.next();
            if (Intrinsics.XOO0ii0(((DeviceOnlineInfo) r3).getBleName(), r6.getMName()) == false) goto L16;
        L21:
            if (r3 == null) goto L24;
            return true;
        L20:
            r3 = null;
            goto L21
        L30:
            return true;
        L22:
            return true;
        }
    }

    public static final class O00 implements BleHandleCallback {
        public final /* synthetic */ AddDeviceWithThirdPartyActivity IO;

        public O00(AddDeviceWithThirdPartyActivity r1) {
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
        public void onIdentityCreate(boolean r1, BleDeviceInfo r2) {
            if (r1 == false) goto L5;
            OOiOOO1OI.OXO1.O1O();
            return;
        L5:
            ml1 r3 = AddDeviceWithThirdPartyActivity.access$getMConfirmPopup$p(this.IO);
            if (r3 == null) goto L8;
            r3.dismiss();
        L8:
            BleConnector.INSTANCE.closeConnection(true);
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
        public void onReadFirmwareVersion(String r3) {
            Intrinsics.X0O(r3, "version");
            ml1 r4 = AddDeviceWithThirdPartyActivity.access$getMConfirmPopup$p(this.IO);
            if (r4 == null) goto L5;
            r4.dismiss();
        L5:
            a01.OXO1.IiI10X().put(b01.I1, false);
            if (q62.OXO1.I1Ii() == true) goto L8;
        L10:
            AddDeviceWithThirdPartyActivity.access$bindDone(this.IO);
            return;
        L8:
            if (i72.OXO1.I0iOXO() == true) goto L10;
            BleConnector.INSTANCE.connectClassic();
            goto L10
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
        public void onSessionStateChange(boolean r1) {
            if (r1 == true) goto L7;
            ml1 r2 = AddDeviceWithThirdPartyActivity.access$getMConfirmPopup$p(this.IO);
            if (r2 == null) goto L8;
            r2.dismiss();
            return;
        L8:
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

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n1#1,148:1\n230#2,2:149\n*E\n"})
    public static final class OXO1 extends TimerTask {
        public OXO1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
        }
    }

    public static final enum SearchType extends Enum<SearchType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ SearchType[] $VALUES = null;
        public static final SearchType SELF_STUDY = null;
        public static final SearchType THIRD_PARTY = null;

        private static final /* synthetic */ SearchType[] $values() {
            return new SearchType[]{SELF_STUDY, THIRD_PARTY};
        }

        static {
            SELF_STUDY = new SearchType("SELF_STUDY", 0);
            THIRD_PARTY = new SearchType("THIRD_PARTY", 1);
            SearchType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private SearchType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<SearchType> getEntries() {
            return $ENTRIES;
        }

        public static SearchType valueOf(String r1) {
            return (SearchType) Enum.valueOf(SearchType.class, r1);
        }

        public static SearchType[] values() {
            return (SearchType[]) $VALUES.clone();
        }
    }

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n1#1,148:1\n236#2,3:149\n*E\n"})
    public static final class XIi00iiXO extends TimerTask {
        public final /* synthetic */ AddDeviceWithThirdPartyActivity IO;

        public XIi00iiXO(AddDeviceWithThirdPartyActivity r1) {
            this.IO = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            I01XX0.XIi00iiXO(I01XX0.XXO, null, 2, null);
            this.IO.finish();
        }
    }

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n1#1,148:1\n617#2,2:149\n*E\n"})
    public static final class XO0O10 extends TimerTask {
        public XO0O10() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BleConnector.INSTANCE.closeConnection(true);
        }
    }

    @SourceDebugExtension({"SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,730:1\n1011#2,2:731\n*S KotlinDebug\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n*L\n163#1:731,2\n*E\n"})
    public static final class XOO0ii0 implements i1OIOOIiX {
        public final /* synthetic */ AddDeviceWithThirdPartyActivity OXO1;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n*L\n1#1,328:1\n163#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            public OXO1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T r1, T r2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) r1).getMRssi()), Integer.valueOf(-((BleDevice) r2).getMRssi()));
            }
        }

        public XOO0ii0(AddDeviceWithThirdPartyActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r1) {
            if (r1 == false) goto L5;
            AddDeviceWithThirdPartyActivity.access$onScanStarted(this.OXO1);
            return;
        L5:
            AddDeviceWithThirdPartyActivity.access$onScanStopped(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r3) {
            Intrinsics.X0O(r3, "device");
            if (AddDeviceWithThirdPartyActivity.access$getMList(this.OXO1).contains(r3) == false) goto L5;
            return;
        L5:
            if (AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.OXO1).contains(r3) == true) goto L13;
            AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.OXO1).add(r3);
            List r4 = AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.OXO1);
            if (r4.size() <= 1) goto L10;
            XiX0OOXI0.XOXiX0(r4, new OXO1());
        L10:
            AddDeviceWithThirdPartyActivity.access$getMList(this.OXO1).clear();
            AddDeviceWithThirdPartyActivity.access$getMList(this.OXO1).addAll(AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.OXO1));
            AddDeviceWithThirdPartyActivity.access$getMListAdapter(this.OXO1).notifyDataSetChanged();
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$bindThirdDevice$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$bindThirdDevice$1", f = "AddDeviceWithThirdPartyActivity.kt", i = {}, l = {704, 706}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AddDeviceWithThirdPartyActivity this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$bindThirdDevice$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$bindThirdDevice$1$1", f = "AddDeviceWithThirdPartyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05621 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AddDeviceWithThirdPartyActivity this$0;

            public C05621(AddDeviceWithThirdPartyActivity r1, Continuation<? super C05621> r2) {
                this.this$0 = r1;
                super(2, r2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
                return new C05621(this.this$0, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05621) create(r1, r2)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r2) {
                pb.I0iXXO();
                if (this.label != 0) goto L10;
                ResultKt.X1ii(r2);
                ml1 r3 = AddDeviceWithThirdPartyActivity.access$getConnectPop$p(this.this$0);
                if (r3 == null) goto L7;
                r3.OII();
            L7:
                this.this$0.finish();
                return Unit.OXO1;
            L10:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
                return invoke2(r1, r2);
            }
        }

        public AnonymousClass1(AddDeviceWithThirdPartyActivity r1, Continuation<? super AnonymousClass1> r2) {
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
        public final Object invokeSuspend(Object r172) {
            Object r1 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L10;
            if (r2 == 1) goto L9;
            if (r2 != 2) goto L8;
            ResultKt.X1ii(r172);
        L17:
            return Unit.OXO1;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            ResultKt.X1ii(r172);
        L13:
            I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
            g10 r3 = IXOX0Xiii.O00();
            C05621 r5 = new C05621(this.this$0, null);
            this.label = 2;
            if (I100X1.I0IIOi(r3, r5, this) != r1) goto L17;
        L15:
            return r1;
        L10:
            ResultKt.X1ii(r172);
            new com.sma.smartv3.dto.OXO1(AddDeviceWithThirdPartyActivity.access$getConnectingDeviceName$p(this.this$0), AddDeviceWithThirdPartyActivity.access$getConnectingDeviceAddress$p(this.this$0), true, 0, null, null, 0, 0, 0, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null).iX(true);
            BleCache.INSTANCE.setMDeviceInfo(new BleDeviceInfo(0, null, AddDeviceWithThirdPartyActivity.access$getConnectingDeviceName$p(this.this$0), null, AddDeviceWithThirdPartyActivity.access$getConnectingDeviceAddress$p(this.this$0), null, null, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -21, -1, -1, -1, at.IO, null));
            a01.OXO1.iO().put(b01.OX0, AddDeviceWithThirdPartyActivity.access$getConnectingDeviceAddress$p(this.this$0));
            NetUtil r4 = NetUtil.OXO1;
            this.label = 1;
            if (r4.XO0O10(this) != r1) goto L13;
            goto L13
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$collectThirdPartyData$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$collectThirdPartyData$1", f = "AddDeviceWithThirdPartyActivity.kt", i = {0}, l = {BleQiblaSettings.ITEM_LENGTH}, m = "invokeSuspend", n = {"device"}, s = {"L$0"}, v = 1)
    public static final class C34371 extends SuspendLambda implements Function2<BleDevice, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AddDeviceWithThirdPartyActivity this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1", f = "AddDeviceWithThirdPartyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05631 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ BleDevice $device;
            int label;
            final /* synthetic */ AddDeviceWithThirdPartyActivity this$0;

            public C05631(AddDeviceWithThirdPartyActivity r1, BleDevice r2, Continuation<? super C05631> r3) {
                this.this$0 = r1;
                this.$device = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                return new C05631(this.this$0, this.$device, r4);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05631) create(r1, r2)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r8) {
                pb.I0iXXO();
                if (this.label != 0) goto L18;
                ResultKt.X1ii(r8);
                boolean r9 = AddDeviceWithThirdPartyActivity.access$getViewModel$p(this.this$0).isSupportedThirdPartyDevice(this.$device);
                boolean r0 = AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.this$0).contains(this.$device);
                boolean r1 = false;
                if (r9 == false) goto L11;
                if (r0 == true) goto L11;
                AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.this$0).add(this.$device);
                AddDeviceWithThirdPartyActivity.access$getMList(this.this$0).clear();
                AddDeviceWithThirdPartyActivity.access$getMList(this.this$0).addAll(AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.this$0));
                if (AddDeviceWithThirdPartyActivity.access$getMCacheSortByList$p(this.this$0).isEmpty() == true) goto L10;
                AddDeviceWithThirdPartyActivity.access$getEmpty(this.this$0).setVisibility(8);
                AddDeviceWithThirdPartyActivity.access$getMListView(this.this$0).setVisibility(0);
                AddDeviceWithThirdPartyActivity.access$getMListAdapter(this.this$0).notifyDataSetChanged();
                AddDeviceWithThirdPartyActivity.access$getMListView(this.this$0).invalidateViews();
            L10:
                i1O0OXO1O.OXO1.OXO1("ListView attachedToWindow: " + AddDeviceWithThirdPartyActivity.access$getMListView(this.this$0).isAttachedToWindow() + ", visible: " + AddDeviceWithThirdPartyActivity.access$getMListView(this.this$0).getVisibility());
            L11:
                i1O0OXO1O r2 = i1O0OXO1O.OXO1;
                if (r9 == false) goto L15;
                if (r0 == true) goto L15;
                r1 = true;
            L15:
                r2.OXO1("AddDeviceWithThirdParty collectThirdPartyData Supported:" + r1 + "  " + this.$device);
                return Unit.OXO1;
            L18:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
                return invoke2(r1, r2);
            }
        }

        public C34371(AddDeviceWithThirdPartyActivity r1, Continuation<? super C34371> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C34371 r0 = new C34371(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(BleDevice r1, Continuation<? super Unit> r2) {
            return ((C34371) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            BleDevice r0 = (BleDevice) this.L$0;
            Object r1 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L8;
            if (r2 != 1) goto L7;
            ResultKt.X1ii(r7);
        L12:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r7);
            g10 r8 = IXOX0Xiii.O00();
            C05631 r3 = new C05631(this.this$0, r0, null);
            this.L$0 = SpillingKt.OXO1(r0);
            this.label = 1;
            if (I100X1.I0IIOi(r8, r3, this) != r1) goto L12;
            return r1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(BleDevice r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$connectItem$3, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$connectItem$3", f = "AddDeviceWithThirdPartyActivity.kt", i = {}, l = {tn0.IOIi00}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ BleDevice $device;
        int label;
        final /* synthetic */ AddDeviceWithThirdPartyActivity this$0;

        public AnonymousClass3(AddDeviceWithThirdPartyActivity r1, BleDevice r2, Continuation<? super AnonymousClass3> r3) {
            this.this$0 = r1;
            this.$device = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass3(this.this$0, this.$device, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass3) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r5);
        L12:
            if (((Boolean) r5).booleanValue() == false) goto L14;
            AddDeviceWithThirdPartyActivity.access$bindThirdDevice(this.this$0, new BluetoothConnectionReceiver.A2DPInfo(this.$device.getMAddress(), true));
        L16:
            return Unit.OXO1;
        L14:
            AddDeviceWithThirdPartyActivity.access$getThirdPartyUtil$p(this.this$0).O00();
            goto L16
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r5);
            ClassicBluetoothUtil r6 = AddDeviceWithThirdPartyActivity.access$getThirdPartyUtil$p(this.this$0);
            AddDeviceWithThirdPartyActivity r2 = this.this$0;
            String r3 = this.$device.getMAddress();
            this.label = 1;
            r5 = r6.IO(r2, r3, this);
            if (r5 != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n1#1,148:1\n348#2:149\n*E\n"})
    public static final class iO extends TimerTask {
        public iO() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    public AddDeviceWithThirdPartyActivity() {
        this.pagerIndicator$delegate = LazyKt__LazyJVMKt.iO(new I01X1i1(this));
        this.tv1$delegate = LazyKt__LazyJVMKt.iO(new ii01(this));
        this.tv2$delegate = LazyKt__LazyJVMKt.iO(new XO1X00(this));
        this.tvBottom2$delegate = LazyKt__LazyJVMKt.iO(new XIOO0OI0(this));
        this.empty$delegate = LazyKt__LazyJVMKt.iO(new X0OO100(this));
        this.ivScanBg$delegate = LazyKt__LazyJVMKt.iO(new I10XI1OOO(this));
        this.pillTabView$delegate = LazyKt__LazyJVMKt.iO(new iiXiX1i(this));
        this.viewModel = (AddDeviceViewModel) new ViewModelProvider.NewInstanceFactory().create(AddDeviceViewModel.class);
        this.connectingDeviceName = "";
        this.connectingDeviceAddress = "";
        this.mOnlineDeviceList = q62.OXO1.OXI0Xi();
        this.mScanner$delegate = LazyKt__LazyJVMKt.iO(new O11(this));
        this.mCacheSortByList = new ArrayList();
        this.mBleHandleCallback = new O00(this);
        this.searchType = SearchType.SELF_STUDY;
        this.thirdPartyUtil = ClassicBluetoothUtil.OXO1;
    }

    public static /* synthetic */ PFMedium I1(AddDeviceWithThirdPartyActivity r0) {
        return empty_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(AddDeviceWithThirdPartyActivity r0) {
        return tvBottom2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PagerIndicator II1Xi0(AddDeviceWithThirdPartyActivity r0) {
        return pagerIndicator_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(ml1 r0) {
        return connectItem$lambda$1$0(r0);
    }

    public static /* synthetic */ ImageView IXXOO(AddDeviceWithThirdPartyActivity r0) {
        return ivScanBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PillTabView O10IXXX0X(AddDeviceWithThirdPartyActivity r0) {
        return pillTabView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(AddDeviceWithThirdPartyActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OX(AddDeviceWithThirdPartyActivity r0, PermissionStatus r1) {
        return onTitleRightClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        return scanDevices$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(ml1 r0) {
        return conntectDevice$lambda$1$0(r0);
    }

    public static /* synthetic */ Unit X0O(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        return initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ boolean XX0(AddDeviceWithThirdPartyActivity r0) {
        return conntectDevice$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        return init$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XiOIii1(AddDeviceWithThirdPartyActivity r0) {
        return tv2_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$bindDone(AddDeviceWithThirdPartyActivity r0) {
        r0.bindDone();
    }

    public static final /* synthetic */ void access$bindThirdDevice(AddDeviceWithThirdPartyActivity r0, BluetoothConnectionReceiver.A2DPInfo r1) {
        r0.bindThirdDevice(r1);
    }

    public static final /* synthetic */ ml1 access$getConnectPop$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.connectPop;
    }

    public static final /* synthetic */ String access$getConnectingDeviceAddress$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.connectingDeviceAddress;
    }

    public static final /* synthetic */ String access$getConnectingDeviceName$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.connectingDeviceName;
    }

    public static final /* synthetic */ PFMedium access$getEmpty(AddDeviceWithThirdPartyActivity r0) {
        return r0.getEmpty();
    }

    public static final /* synthetic */ List access$getMCacheSortByList$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.mCacheSortByList;
    }

    public static final /* synthetic */ ml1 access$getMConfirmPopup$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.mConfirmPopup;
    }

    public static final /* synthetic */ List access$getMList(AddDeviceWithThirdPartyActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(AddDeviceWithThirdPartyActivity r0) {
        return r0.getMListAdapter();
    }

    public static final /* synthetic */ ListView access$getMListView(AddDeviceWithThirdPartyActivity r0) {
        return r0.getMListView();
    }

    public static final /* synthetic */ List access$getMOnlineDeviceList$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.mOnlineDeviceList;
    }

    public static final /* synthetic */ ClassicBluetoothUtil access$getThirdPartyUtil$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.thirdPartyUtil;
    }

    public static final /* synthetic */ AddDeviceViewModel access$getViewModel$p(AddDeviceWithThirdPartyActivity r0) {
        return r0.viewModel;
    }

    public static final /* synthetic */ void access$onScanStarted(AddDeviceWithThirdPartyActivity r0) {
        r0.onScanStarted();
    }

    public static final /* synthetic */ void access$onScanStopped(AddDeviceWithThirdPartyActivity r0) {
        r0.onScanStopped();
    }

    private final void bindDone() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("AddDeviceActivity bindDone");
        BleDeviceCache r1 = BleDeviceCache.INSTANCE;
        RecordDeviceInfo r2 = r1.getActiveDeviceInfo();
        if (r2 == null) goto L5;
        r1.removeDeviceInfo(r2);
        r1.setMDeviceInfo(null);
    L5:
        com.sma.smartv3.dto.OXO1.I0iXXO.IO();
        q62 r3 = q62.OXO1;
        if (r3.i0I0O111I() == false) goto L8;
        AGPSInitializer.I1(AGPSInitializer.IO, false, null, 2, null);
    L8:
        a01 r4 = a01.OXO1;
        SPUtils r5 = r4.OXO1();
        DeviceLaseRecord r6 = new DeviceLaseRecord(null, null, null, null, 15, null);
        BleCache r7 = BleCache.INSTANCE;
        r6.setBleName(r7.getMBleName());
        r6.setFlag(r7.getMFirmwareFlag());
        r6.setBleVersion(BaseBleCache.getString$default(r7, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r6.setMac(r7.getMBleAddress());
        r5.put(b01.XXOXi + '_' + DeviceLaseRecord.class.getName(), new Gson().toJson(r6), false);
        if (r3.O0i0() == false) goto L11;
    L14:
        r0.OXO1("addDeviceActivity " + r3.O0i0() + " " + r3.IiO0() + " ");
        new Timer().schedule(new OXO1(), 1000);
        new Timer().schedule(new XIi00iiXO(this), 300);
    L15:
        r4.iO().remove(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), false);
        r4.iO().remove(b01.I011X + '_' + LanguageTranslationData.class.getName(), false);
        if (r3.O00OXOXO() == true) goto L18;
        return;
    L18:
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) goto L22;
        com.sma.smartv3.biz.OXO1.C0553OXO1 r8 = com.sma.smartv3.biz.OXO1.XOO0ii0;
        r8.OXO1().I0iXXO();
        com.sma.smartv3.biz.OXO1.I1XOi1(r8.OXO1(), 0, 0, null, 4, null);
        return;
    L22:
        return;
    L11:
        if (r3.IiO0() == true) goto L14;
        setResult(-1);
        finish();
        goto L15
    }

    private final void bindThirdDevice(BluetoothConnectionReceiver.A2DPInfo r7) {
        if (Intrinsics.XOO0ii0(r7.getAddress(), this.connectingDeviceAddress) == true) goto L5;
        return;
    L5:
        i1O0OXO1O.OXO1.OXO1("bindThirdDevice :" + this.connectingDeviceName + " " + this.connectingDeviceAddress);
        if (r7.getOnline() == false) goto L9;
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
        return;
    L9:
        ToastUtils.showLong("连接失败", new Object[0]);
    }

    private final void collectThirdPartyData() {
        ActivityUtilKt.XIi00iiXO(this, this.thirdPartyUtil.I0IIOi(), null, new C34371(this, null), 2, null);
    }

    private final void connectItem(int r10) {
        if (this.searchType != SearchType.SELF_STUDY) goto L6;
        getMScanner().XXI(false);
        SPUtils r0 = a01.OXO1.OXO1();
        DeviceLaseRecord r2 = new DeviceLaseRecord(null, null, null, null, 15, null);
        r2.setBleName(getMList().get(r10).getMName());
        String r3 = getMList().get(r10).getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(r3, "getAddress(...)");
        r2.setMac(r3);
        r0.put(b01.I0XXi0X + '_' + DeviceLaseRecord.class.getName(), new Gson().toJson(r2), false);
        String r1 = getMList().get(r10).getMName();
        String r11 = getMList().get(r10).getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(r11, "getAddress(...)");
        conntectDevice(r1, r11);
        return;
    L6:
        final ml1 r4 = new ml1(this);
        r4.X01IiOiIi(new X0OIIXX(r4));
        r4.OX().setImageResource(R.drawable.pair_loading);
        r4.OX().setImageTintList(gk4.O00(this, R.color.text_color));
        ImageView r5 = r4.OX();
        RotateAnimation r6 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r6.setRepeatCount(-1);
        r6.setDuration(1800);
        r6.setInterpolator(new LinearInterpolator());
        r5.startAnimation(r6);
        this.connectPop = r4;
        View r7 = getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r4.I1XOi1(r7);
        BleDevice r12 = getMList().get(r10);
        this.connectingDeviceName = r12.getMName();
        this.connectingDeviceAddress = r12.getMAddress();
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), IXOX0Xiii.iO(), null, new AnonymousClass3(this, r12, null), 2, null);
    }

    private static final Unit connectItem$lambda$1$0(ml1 r3) {
        r3.dismiss();
        new Timer().schedule(new iO(), 200);
        return Unit.OXO1;
    }

    private final void conntectDevice(String r8, String r9) {
        LogUtils.d(new Object[]{"connectDevice -> " + r8 + ", " + r9});
        i72 r0 = i72.OXO1;
        DefaultConstructorMarker r2 = null;
        if (r0.iXOII(r8) == false) goto L7;
        go0 r10 = new go0(this, 0, 2, r2);
        r10.I0iXXO(false);
        Intrinsics.XXI(r8);
        r10.iI(r8);
        r10.iX(Integer.valueOf(r0.iX()));
        go0.X11iII1O1(r10, Integer.valueOf(R.string.cancel), null, 2, null);
        r10.X1IX(R.string.confirm, new IOXi0X(this));
        r10.IIX1OXO();
        return;
    L7:
        if (r0.XIIIO() == false) goto L9;
        BleConnector.INSTANCE.setRefreshDeviceInfo(true);
    L9:
        q62 r1 = q62.OXO1;
        if (r1.XXOXI0(r8) == false) goto L13;
        Bundle r11 = new Bundle();
        r11.putString("mArg0", r9);
        r11.putParcelable("mArg2", null);
        r11.putSerializable("mArg3", null);
        Intent r12 = new Intent(this, AutoBindActivity.class);
        r12.putExtras(r11);
        startActivity(r12);
        return;
    L13:
        BleConnector.INSTANCE.setAddress(r9).connect(true);
        final ml1 r13 = new ml1(this);
        r13.II1Xi0(CollectionsKt___CollectionsKt.i01OOiI(r1.i010I(), r8));
        r13.X01IiOiIi(new Ii1OIOX00(r13));
        if (CollectionsKt___CollectionsKt.i01OOiI(r1.i0iIXiI(), r8) == true) goto L16;
    L22:
        r13.OX().setImageResource(R.drawable.pair_loading);
        r13.OX().setImageTintList(gk4.O00(this, R.color.text_color));
        ImageView r14 = r13.OX();
        RotateAnimation r3 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r3.setRepeatCount(-1);
        r3.setDuration(1800);
        r3.setInterpolator(new LinearInterpolator());
        r14.startAnimation(r3);
    L23:
        this.mConfirmPopup = r13;
        View r15 = getRootView();
        Intrinsics.O10IXXX0X(r15, "<get-rootView>(...)");
        r13.I1XOi1(r15);
        return;
    L16:
        if (q62.OiO0IOX(r1, null, 1, null) == true) goto L22;
        if (r1.X0100I() == true) goto L22;
        if (r1.I0i1OXiI() == true) goto L22;
        r13.OX().setImageResource(r1.XiOIii1(r8));
        goto L23
    }

    private static final boolean conntectDevice$lambda$0$0(AddDeviceWithThirdPartyActivity r1) {
        i72.OXO1.XXXiXXOI(r1);
        return true;
    }

    private static final Unit conntectDevice$lambda$1$0(ml1 r8) {
        r8.dismiss();
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.IDENTITY, BleKeyFlag.UPDATE, 16, false, false, 24, null);
        new Timer().schedule(new XO0O10(), 200);
        return Unit.OXO1;
    }

    private final void doScanResult(String r6) {
        Uri r7 = Uri.parse(r6);     // Catch: Exception -> L6
        String r2 = r7.getQueryParameter("name");     // Catch: Exception -> L6
        String r3 = r7.getQueryParameter("mac");     // Catch: Exception -> L6
        if (TextUtils.isEmpty(r3) == false) goto L8;
        r3 = r7.getQueryParameter("MAC");     // Catch: Exception -> L6
    L8:
        LogUtils.d(new Object[]{"doScanResult -> " + r2 + " , " + r3});     // Catch: Exception -> L6
        if (TextUtils.isEmpty(r2) == true) goto L11;
    L14:
        Intrinsics.XXI(r3);     // Catch: Exception -> L6
        conntectDevice(r2, r3);     // Catch: Exception -> L6
        return;
    L11:
        if (TextUtils.isEmpty(r3) == false) goto L14;
        Toast.makeText(this, R.string.qrcode_failed, 1).show();     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        Toast.makeText(this, R.string.qrcode_failed, 1).show();
    }

    private static final PFMedium empty_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (PFMedium) r1.findViewById(R.id.empty);
    }

    private final PFMedium getEmpty() {
        return (PFMedium) getValue();
    }

    private final ImageView getIvScanBg() {
        return (ImageView) getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) getValue();
    }

    private final PagerIndicator getPagerIndicator() {
        return (PagerIndicator) getValue();
    }

    private final PillTabView getPillTabView() {
        return (PillTabView) getValue();
    }

    private final TextView getTv1() {
        return (TextView) getValue();
    }

    private final TextView getTv2() {
        return (TextView) getValue();
    }

    private final TextView getTvBottom2() {
        return (TextView) getValue();
    }

    public static /* synthetic */ Unit i010I(AddDeviceWithThirdPartyActivity r0, String r1) {
        return onTitleRightClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ TextView iIiiO(AddDeviceWithThirdPartyActivity r0) {
        return tv1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOOX010X(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        return init$lambda$1(r0, r1);
    }

    public static /* synthetic */ OXOI0XII iX(AddDeviceWithThirdPartyActivity r0) {
        return mScanner_delegate$lambda$0(r0);
    }

    private static final Unit init$lambda$0(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.mOnlineDeviceList = q62.OXO1.OXI0Xi();
    L5:
        return Unit.OXO1;
    }

    private static final Unit init$lambda$1(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.mOnlineDeviceList = q62.OXO1.OXI0Xi();
    L5:
        return Unit.OXO1;
    }

    private static final void initView$lambda$1(AddDeviceWithThirdPartyActivity r0, AdapterView r1, View r2, int r3, long r4) {
        r0.connectItem(r3);
    }

    private static final Unit initView$lambda$2(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        if (r1 == false) goto L4;
        SearchType r2 = SearchType.SELF_STUDY;
    L5:
        r0.searchType = r2;
        r0.scanDevices();
        return Unit.OXO1;
    L4:
        r2 = SearchType.THIRD_PARTY;
        goto L5
    }

    private static final ImageView ivScanBg_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_scan_bg);
    }

    private static final OXOI0XII mScanner_delegate$lambda$0(AddDeviceWithThirdPartyActivity r4) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(new IiI10X(r4)).X1ii(new XOO0ii0(r4));
    }

    private final void onPermissionScan() {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
    L10:
        this.viewModel.getThirdPartyDevices();
        scanDevices();
        return;
    L5:
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L10;
        if (i72.OXO1.IOIi00() == false) goto L10;
        requestLocationPermission();
    }

    private final void onScanStarted() {
        getPagerIndicator().XO0O10(true);
        getTv1().setText(R.string.searching);
        getTv2().setText(R.string.close_device_to_your_phone);
        getTvBottom2().setVisibility(8);
        getEmpty().setVisibility(8);
        getMListView().setVisibility(0);
        Drawable r0 = getIvScanBg().getDrawable();
        if ((r0 instanceof GifDrawable) == false) goto L6;
        ((GifDrawable) r0).start();
        return;
    }

    private final void onScanStopped() {
        getPagerIndicator().XO0O10(false);
        getTv1().setText(R.string.search_complete);
        getTv2().setText("");
        getTvBottom2().setVisibility(0);
        if (getMList().isEmpty() == false) goto L5;
        getEmpty().setVisibility(0);
        getMListView().setVisibility(8);
    L5:
        Drawable r0 = getIvScanBg().getDrawable();
        if ((r0 instanceof GifDrawable) == false) goto L11;
        GifDrawable r1 = (GifDrawable) r0;
        if (r1.isRunning() == false) goto L12;
        r1.stop();
        return;
    L12:
        return;
    }

    private static final Unit onTitleRightClick$lambda$0(final AddDeviceWithThirdPartyActivity r2, PermissionStatus r3) {
        Intrinsics.X0O(r3, "it");
        if (r3 != PermissionStatus.GRANTED) goto L6;
        ta2.OXO1.IO(r2, false, new I10i1IO10(r2));
    L6:
        return Unit.OXO1;
    }

    private static final Unit onTitleRightClick$lambda$0$0(AddDeviceWithThirdPartyActivity r0, String r1) {
        if (r1 == null) goto L4;
        r0.doScanResult(r1);
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.qrcode_failed);
        goto L6
    }

    private static final PagerIndicator pagerIndicator_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (PagerIndicator) r1.findViewById(R.id.pager_indicator);
    }

    private static final PillTabView pillTabView_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (PillTabView) r1.findViewById(R.id.pillTabView);
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        ToastUtils.showLong("Please turn on bluetooth", new Object[0]);
        i1O0OXO1O.OXO1.XIi00iiXO("requestEnableBluetooth -> " + e.getMessage());
    }

    private final void requestLocationPermission() {
        hr1.XXIIO1i11(hr1.OXO1, this, false, new O1I0iIX0(this), 2, null);
    }

    private static final Unit requestLocationPermission$lambda$0(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.scanDevices();
    L5:
        return Unit.OXO1;
    }

    private final void scan() {
        Iterator<BluetoothDevice> r0 = BluetoothAdapter.getDefaultAdapter().getBondedDevices().iterator();
    L4:
        if (r0.hasNext() == false) goto L20;
        BluetoothDevice r3 = r0.next();
        if (r3 == null) goto L4;
        if (TextUtils.isEmpty(r3.getName()) == true) goto L4;
        String r6 = r3.getName();
        Intrinsics.O10IXXX0X(r6, "getName(...)");
        int r7 = r3.getType();
        String r8 = r3.getAddress();
        Intrinsics.O10IXXX0X(r8, "getAddress(...)");
        BleDevice r2 = new BleDevice(r3, 0, null, r6, r7, r8);
        i1O0OXO1O.OXO1.OXO1("onDeviceFound -> from system bonded " + r2);
        if (q62.OXO1.i0iIXiI().contains(r2.getMName()) == true) goto L19;
        Iterator<T> r1 = this.mOnlineDeviceList.iterator();
    L13:
        if (r1.hasNext() == false) goto L17;
        Object r4 = r1.next();
        if (Intrinsics.XOO0ii0(((DeviceOnlineInfo) r4).getBleName(), r2.getMName()) == false) goto L13;
    L18:
        if (r4 == null) goto L4;
    L17:
        r4 = null;
    L19:
        getMList().add(r2);
        goto L4
    L20:
        this.mCacheSortByList.clear();
        getMListAdapter().notifyDataSetChanged();
        getMScanner().XXI(true);
    }

    private final void scanDevices() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L7;
        requestLocationPermission();
        return;
    L7:
        if (Build.VERSION.SDK_INT < 31) goto L13;
        hr1 r0 = hr1.OXO1;
        if (r0.i11I(this) == true) goto L13;
        r0.OX(this, new I11iO0X(this));
        return;
    L13:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L17;
        requestEnableBluetooth();
        return;
    L17:
        if (UtilsKt.X1() == true) goto L20;
        locationServerRemind();
        return;
    L20:
        getMScanner().XXI(false);
        this.mCacheSortByList.clear();
        getMList().clear();
        getMListAdapter().notifyDataSetChanged();
        if (this.searchType != SearchType.SELF_STUDY) goto L24;
        scan();
        return;
    L24:
        this.thirdPartyUtil.O10IXXX0X();
    }

    private static final Unit scanDevices$lambda$0(AddDeviceWithThirdPartyActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.scan();
    L5:
        return Unit.OXO1;
    }

    private static final TextView tv1_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_minute);
    }

    private static final TextView tv2_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (TextView) r1.findViewById(R.id.tv2);
    }

    private static final TextView tvBottom2_delegate$lambda$0(AddDeviceWithThirdPartyActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_bottom2);
    }

    public final void helpBindClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i72.OXO1.iXX0OOiXX(getMContext());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        if (i72.OXO1.i0X1iIO() == false) goto L6;
        this.viewModel.getNewDeviceListObject(new O1iii11i(this));
        return;
    L6:
        DeviceInfoChecker.OXO1.I1XOi1(new IO0IXXXI(this));
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleDevice) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_device);
        ImageView r0 = (ImageView) findViewById(R.id.abh_title_right);
        r0.setImageResource(R.drawable.ic_scan);
        if (i72.OXO1.OiO0IOX() == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        r0.setImageTintList(gk4.O00(this, R.color.text_color));
        iiXI0.OXO1.XIi00iiXO(this);
        getMListView().setOnItemClickListener(new i0X010I(this));
        this.thirdPartyUtil.OIi0(this);
        getPillTabView().setOnTabSelected(new XiO(this));
        Glide.with(this).load(Integer.valueOf(R.drawable.bg_scan)).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(getIvScanBg());
        collectThirdPartyData();
        return;
    L5:
        r1 = 8;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_add_device_with_third_party;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r1, int r2, @tb1 Intent r3) {
        super.onActivityResult(r1, r2, r3);
        if (r1 == 1) goto L5;
        return;
    L5:
        if (r2 != (-1)) goto L9;
        scanDevices();
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onPermissionScan();
    }

    public final void onBottomLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        setResult(0);
        finish();
    }

    public final void onBottomRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        scanDevices();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ml1 r0 = this.mConfirmPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        getMScanner().XIi00iiXO();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        this.thirdPartyUtil.XO0O10(this);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        ml1 r0 = this.mConfirmPopup;
        if (r0 != null) goto L5;
    L10:
        super.onHandleBackPressed();
        return;
    L5:
        if (r0.isShowing() != true) goto L10;
        ml1 r1 = this.mConfirmPopup;
        if (r1 == null) goto L12;
        r1.OII();
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.viewModel.getThirdPartyDevices();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        setResult(0);
        finish();
    }

    public final void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        PermissionUtils r5 = PermissionUtils.permission(new String[]{PermissionConstants.CAMERA});
        Intrinsics.O10IXXX0X(r5, "permission(...)");
        String r0 = getString(R.string.camera_explain_title);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        String r2 = getString(R.string.camera_explain_content);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        ds1.XIi00iiXO(r5, r0, r2, new IIOiXXi(this));
    }

    @sf5(tag = I01XX0.I011X)
    public final void refreshDeviceState(@aa1 BluetoothConnectionReceiver.A2DPInfo r5) {
        Intrinsics.X0O(r5, "a2dp");
        com.sma.smartv3.dto.OXO1 r0 = com.sma.smartv3.dto.OXO1.I0iXXO.XIi00iiXO();
        i1O0OXO1O.OXO1.OXO1("AddDeviceWithThirdDeviceInfo:" + r0 + " " + r5);
        bindThirdDevice(r5);
    }

    public void initItem(@aa1 ug6 r2, @aa1 BleDevice r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.tv_name, r3.getMName());
        r2.OII(R.id.tv_address, r3.getMBluetoothDevice().getAddress());
        ((ImageView) r2.O00(R.id.iv_rssi)).setImageLevel(-r3.getMRssi());
    }
}
