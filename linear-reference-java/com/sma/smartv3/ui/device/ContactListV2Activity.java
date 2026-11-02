package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0iXOX1IO;
import com.android.mltcode.paycertificationapi.I100;
import com.android.mltcode.paycertificationapi.I1I11i0X;
import com.android.mltcode.paycertificationapi.I1OiIXiIO;
import com.android.mltcode.paycertificationapi.IIXXXX1O;
import com.android.mltcode.paycertificationapi.IOIi11;
import com.android.mltcode.paycertificationapi.Ii1OiXiI1;
import com.android.mltcode.paycertificationapi.O01i0;
import com.android.mltcode.paycertificationapi.OX0i1iX;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1IOX;
import com.android.mltcode.paycertificationapi.XI0OI0I;
import com.android.mltcode.paycertificationapi.XiI0O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i01I0O00;
import com.android.mltcode.paycertificationapi.i0iI0X0iO;
import com.android.mltcode.paycertificationapi.i0iOX1010;
import com.android.mltcode.paycertificationapi.i10I1i1Ii;
import com.android.mltcode.paycertificationapi.i1I0IOiO;
import com.android.mltcode.paycertificationapi.iOO0iO0;
import com.android.mltcode.paycertificationapi.iXIX0X1;
import com.android.mltcode.paycertificationapi.iXi0OI00X;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xv1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.model.Contact;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.contactpicker.ContactHelper;
import com.sma.smartv3.ui.contactpicker.ContactPicker;
import com.sma.smartv3.ui.contactpicker.ContactResult;
import com.sma.smartv3.ui.contactpicker.LimitColumn;
import com.sma.smartv3.ui.contactpicker.PhoneNumber;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ContactSideBar;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
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
import com.szabh.smable3.entity.BleContactSort;
import com.szabh.smable3.entity.BleContactSortItem;
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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nContactListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,442:1\n73#2,5:443\n78#2:451\n80#2,2:453\n73#2,5:458\n78#2:466\n80#2,2:468\n1563#3:448\n1634#3,2:449\n1636#3:452\n774#3:455\n865#3,2:456\n1563#3:463\n1634#3,2:464\n1636#3:467\n1869#3,2:470\n1869#3,2:487\n1869#3,2:489\n1869#3,2:491\n1869#3,2:493\n55#4,12:472\n84#4,3:484\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n*L\n125#1:443,5\n125#1:451\n125#1:453,2\n131#1:458,5\n131#1:466\n131#1:468,2\n125#1:448\n125#1:449,2\n125#1:452\n125#1:455\n125#1:456,2\n131#1:463\n131#1:464,2\n131#1:467\n237#1:470,2\n349#1:487,2\n392#1:489,2\n422#1:491,2\n152#1:493,2\n284#1:472,12\n284#1:484,3\n*E\n"})
public final class ContactListV2Activity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final OXO1 bleHandleCallback;
    private boolean deleting;

    @aa1
    private final List<ContactResult> lastData;

    @aa1
    private final Lazy mContactBar$delegate;

    @aa1
    private final Lazy mEditText$delegate;

    @aa1
    private final Lazy mEmptyLayout$delegate;

    @aa1
    private final Lazy mLinearLayout$delegate;

    @aa1
    private List<ContactResult> mList;

    @tb1
    private xv1 pinyinComparator;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final ArrayList<String> tipBars;

    @aa1
    private final ArrayList<ContactResult> tmps;

    @SourceDebugExtension({"SMAP\nContactListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$bleHandleCallback$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,442:1\n63#2,6:443\n63#2,6:449\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$bleHandleCallback$1\n*L\n100#1:443,6\n112#1:449,6\n*E\n"})
    public static final class OXO1 implements BleHandleCallback {
        public final /* synthetic */ ContactListV2Activity IO;

        public OXO1(ContactListV2Activity r1) {
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
        public void onCommandReply(BleKey r2, BleKeyFlag r3, boolean r4) {
            Intrinsics.X0O(r2, "bleKey");
            Intrinsics.X0O(r3, "bleKeyFlag");
            if (r2 == BleKey.CONTACT) goto L5;
            return;
        L5:
            if (r3 != BleKeyFlag.DELETE) goto L9;
            LogUtils.d(new Object[]{" onCommandReply"});
            ContactListV2Activity.access$getMList$p(this.IO).clear();
            ContactListV2Activity r5 = this.IO;
            r5.showData(r5.filledData(ContactListV2Activity.access$getMList$p(r5)));
            SPUtils r6 = a01.OXO1.IiI10X();
            List r7 = ContactListV2Activity.access$getMList$p(this.IO);
            String r8 = ContactResult.class.getName() + is3.OXO1;
            String r9 = new Gson().toJson(r7);
            Intrinsics.O10IXXX0X(r9, "toJson(...)");
            byte[] r10 = r9.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(r10, "getBytes(...)");
            r6.put(r8, EncodeUtils.base64Encode2String(r10));
            return;
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
        public void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            Intrinsics.X0O(r5, "bleKey");
            if (r5 != BleKey.CONTACT) goto L7;
            ContactListV2Activity r6 = this.IO;
            ContactListV2Activity.access$sendContactSortStream(r6, ContactListV2Activity.access$getLastData$p(r6));
            return;
        L7:
            if (r5 != BleKey.CONTACT_SORT) goto L12;
            if (r1 == false) goto L10;
            if (r3 == r4) goto L10;
            return;
        L10:
            LogUtils.d(new Object[]{" onStreamProgress " + ContactListV2Activity.access$getTmps$p(this.IO).size()});
            ContactListV2Activity.access$getMList$p(this.IO).clear();
            ContactListV2Activity.access$getMList$p(this.IO).addAll(ContactListV2Activity.access$getTmps$p(this.IO));
            ContactListV2Activity r7 = this.IO;
            r7.showData(r7.filledData(ContactListV2Activity.access$getMList$p(r7)));
            SPUtils r8 = a01.OXO1.IiI10X();
            List r9 = ContactListV2Activity.access$getMList$p(this.IO);
            String r10 = ContactResult.class.getName() + is3.OXO1;
            String r11 = new Gson().toJson(r9);
            Intrinsics.O10IXXX0X(r11, "toJson(...)");
            byte[] r12 = r11.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(r12, "getBytes(...)");
            r8.put(r10, EncodeUtils.base64Encode2String(r12));
            return;
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

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n286#2:83\n287#2,5:87\n774#3:84\n865#3,2:85\n59#4:92\n62#5:93\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n*L\n286#1:84\n286#1:85,2\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ ContactListV2Activity IO;

        public XIi00iiXO(ContactListV2Activity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r9) {
            List r0 = ContactListV2Activity.access$getMList$p(this.IO);
            ArrayList r1 = new ArrayList();
            Iterator r2 = r0.iterator();
        L4:
            if (r2.hasNext() == false) goto L9;
            Object r3 = r2.next();
            String r4 = ((ContactResult) r3).getDisplayName();
            Intrinsics.O10IXXX0X(r4, "getDisplayName(...)");
            if (StringsKt__StringsKt.iIi011O(r4, String.valueOf(r9), false, 2, null) == false) goto L4;
            r1.add(r3);
            goto L4
        L9:
            if (r1.isEmpty() == true) goto L17;
            this.IO.showData(CollectionsKt___CollectionsKt.OO0Oi10(r1));
            return;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    @SourceDebugExtension({"SMAP\nContactListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$initView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1878#2,3:443\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$initView$1\n*L\n273#1:443,3\n*E\n"})
    public static final class iO implements ContactSideBar.XIi00iiXO {
        public final /* synthetic */ ContactListV2Activity OXO1;

        public iO(ContactListV2Activity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.ContactSideBar.XIi00iiXO
        public void OXO1(String r7) {
            if (r7 != null) goto L4;
            return;
        L4:
            if (r7.length() > 0) goto L6;
            return;
        L6:
            if (ContactListV2Activity.access$getTipBars$p(this.OXO1).contains(r7) == false) goto L26;
            List r0 = ContactListV2Activity.access$getMList$p(this.OXO1);
            ContactListV2Activity r1 = this.OXO1;
            Iterator r2 = r0.iterator();
            int r3 = 0;
        L9:
            if (r2.hasNext() == false) goto L27;
            Object r4 = r2.next();
            int r5 = r3 + 1;
            if (r3 >= 0) goto L14;
            CollectionsKt__CollectionsKt.XOX0O0();
        L14:
            if (Intrinsics.XOO0ii0(((ContactResult) r4).getItemGroups(), r7) == false) goto L19;
            if (ContactListV2Activity.access$getTipBars$p(r1).indexOf(r7) <= (-1)) goto L19;
            r1.getRecyclerView().scrollToPosition(r3 + ContactListV2Activity.access$getTipBars$p(r1).indexOf(r7));
            return;
        L19:
            r3 = r5;
            goto L9
        L27:
            return;
        }
    }

    public ContactListV2Activity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new i1I0IOiO(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new i01I0O00(this));
        this.mList = new ArrayList();
        this.mEditText$delegate = LazyKt__LazyJVMKt.iO(new I1I11i0X(this));
        this.mContactBar$delegate = LazyKt__LazyJVMKt.iO(new i10I1i1Ii(this));
        this.mLinearLayout$delegate = LazyKt__LazyJVMKt.iO(new I0iXOX1IO(this));
        this.mEmptyLayout$delegate = LazyKt__LazyJVMKt.iO(new iXi0OI00X(this));
        this.tmps = new ArrayList();
        this.tipBars = new ArrayList();
        this.lastData = new ArrayList();
        this.bleHandleCallback = new OXO1(this);
    }

    public static /* synthetic */ ContactSideBar I0iXXO(ContactListV2Activity r0) {
        return mContactBar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1(ContactListV2Activity r0, BleConnector r1) {
        return initView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(ContactListV2Activity r0, List r1, DslAdapter r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit II1Xi0(ContactResult r0, DslAdapter r1, ContactListV2Activity r2, DslAdapterItem r3) {
        return showData$lambda$0$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit IIX1OXO(DslAdapter r0) {
        return showData$lambda$0$0$1(r0);
    }

    public static /* synthetic */ EditText O10IXXX0X(ContactListV2Activity r0) {
        return mEditText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(List r0, DslAdapter r1, ContactListV2Activity r2) {
        return showData$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void OX(ContactListV2Activity r0) {
        initView$lambda$1(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(ContactResult r0, DslAdapterItem r1, DslAdapter r2, ContactListV2Activity r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        return showData$lambda$0$0$0$1$0(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ Unit X01IiOiIi(ContactResult r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return showData$lambda$0$0$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ ImageView X0O(ContactListV2Activity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(DslAdapterItem r0, DslAdapter r1, ContactListV2Activity r2, int r3, ContactResult r4, DslViewHolder r5, View r6) {
        showData$lambda$0$0$0$1$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ Unit XX0(ContactListV2Activity r0, Intent r1, BleConnector r2) {
        return onActivityResult$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ View XXI(ContactListV2Activity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(ContactListV2Activity r0, int r1, ContactResult r2, DslAdapterItem r3, DslViewHolder r4, BleConnector r5) {
        return showData$lambda$0$0$0$1$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit XiOIii1(ContactResult r0, DslAdapterItem r1) {
        return showData$lambda$0$0$0$0(r0, r1);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(ContactListV2Activity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ List access$getLastData$p(ContactListV2Activity r0) {
        return r0.lastData;
    }

    public static final /* synthetic */ List access$getMList$p(ContactListV2Activity r0) {
        return r0.mList;
    }

    public static final /* synthetic */ ArrayList access$getTipBars$p(ContactListV2Activity r0) {
        return r0.tipBars;
    }

    public static final /* synthetic */ ArrayList access$getTmps$p(ContactListV2Activity r0) {
        return r0.tmps;
    }

    public static final /* synthetic */ void access$sendContactSortStream(ContactListV2Activity r0, List r1) {
        r0.sendContactSortStream(r1);
    }

    private final void filterData(List<ContactResult> r6) {
        Iterator<T> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L17;
        ContactResult r0 = (ContactResult) r7.next();
        List<PhoneNumber> r1 = r0.getPhoneNumbers();
        Intrinsics.O10IXXX0X(r1, "getPhoneNumbers(...)");
        if (r1.isEmpty() == true) goto L4;
        String r2 = r0.getPhoneNumbers().get(0).getNumber();
        String r3 = r0.getDisplayName();
        if (r2 != null) goto L10;
    L12:
        if (r3 != null) goto L14;
    L16:
        r0.setDisplayName(r3);
        r0.getPhoneNumbers().get(0).setNumber(r2);
        goto L4
    L14:
        if (r3.length() <= 0) goto L16;
        r3 = cp5.XX1Oi(r3);
        goto L16
    L10:
        if (r2.length() <= 0) goto L12;
        r2 = cp5.OX110i(r2);
        goto L12
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final ContactSideBar getMContactBar() {
        return (ContactSideBar) getValue();
    }

    private final EditText getMEditText() {
        return (EditText) getValue();
    }

    private final LinearLayout getMEmptyLayout() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMLinearLayout() {
        return (LinearLayout) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    public static /* synthetic */ LinearLayout i010I(ContactListV2Activity r0) {
        return mEmptyLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iIiiO(DslViewHolder r0, View r1, MotionEvent r2) {
        return showData$lambda$0$0$0$1$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ LinearLayout iOOX010X(ContactListV2Activity r0) {
        return mLinearLayout_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$1(final ContactListV2Activity r3) {
        X0IOiX1O.XIi00iiXO(false, new XI0OI0I(r3), 1, null);
    }

    private static final Unit initView$lambda$1$0(ContactListV2Activity r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        r1.tmps.addAll(r1.mList);
        r1.syncContact(r1.tmps);
        return Unit.OXO1;
    }

    private static final ContactSideBar mContactBar_delegate$lambda$0(ContactListV2Activity r1) {
        return (ContactSideBar) r1.findViewById(R.id.contact_list_contact_sidebar);
    }

    private static final EditText mEditText_delegate$lambda$0(ContactListV2Activity r1) {
        return (EditText) r1.findViewById(R.id.contact_list_et);
    }

    private static final LinearLayout mEmptyLayout_delegate$lambda$0(ContactListV2Activity r1) {
        return (LinearLayout) r1.findViewById(R.id.empty);
    }

    private static final LinearLayout mLinearLayout_delegate$lambda$0(ContactListV2Activity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_data);
    }

    private static final Unit onActivityResult$lambda$0(ContactListV2Activity r1, Intent r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r1.tmps.clear();
        r1.tmps.addAll(ContactPicker.obtainResult(r2));
        r1.filterData(r1.tmps);
        if (r1.mList.size() != 0) goto L5;
        r1.mList.addAll(r1.tmps);
    L5:
        r1.syncContact(r1.filledData(r1.tmps));
        return Unit.OXO1;
    }

    private final void pickContact() {
        new ContactPicker.Builder(this).hideScrollbar(false).setMaxSelectCount(q62.OXO1.IXI()).showTrack(true).searchIconColor(-1).setChoiceMode(0).bubbleTextColor(-1).setTitleText(getString(R.string.picker_title)).setLoadingType(1).setSelectedContacts(new ArrayList(this.mList)).limitToColumn(LimitColumn.PHONE).showPickerForResult(ContactHelper.CONTACT_PICKER_REQUEST);
    }

    private static final View rootView_delegate$lambda$0(ContactListV2Activity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void sendContactSortStream(List<? extends ContactResult> r10) {
        ArrayList r0 = new ArrayList();
        Iterator<T> r11 = r10.iterator();
        String r1 = "";
    L3:
        int r3 = 1;
    L5:
        if (r11.hasNext() == false) goto L14;
        ContactResult r4 = (ContactResult) r11.next();
        if (Intrinsics.XOO0ii0(r1, r4.getItemGroups()) == false) goto L10;
        r3 = r3 + 1;
        goto L5
    L10:
        if (r1.length() <= 0) goto L12;
        r0.add(new BleContactSortItem(r1, r3));
    L12:
        r1 = r4.getItemGroups();
        Intrinsics.O10IXXX0X(r1, "getItemGroups(...)");
        goto L3
    L14:
        if (r1.length() <= 0) goto L16;
        r0.add(new BleContactSortItem(r1, r3));
    L16:
        BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.CONTACT_SORT, new BleContactSort(1, r0).toByteArray(), 0, 4, null);
    }

    private static final Unit showData$lambda$0(final ContactListV2Activity r2, final List r3, final DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r4.clearAllItems();
        DslAdapter.setAdapterStatus$default(r4, 2, null, 2, null);
        r2.getDslViewHolder().post(new iXIX0X1(r3, r4, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(List r9, final DslAdapter r10, final ContactListV2Activity r11) {
        Iterator r12 = r9.iterator();
    L4:
        if (r12.hasNext() == false) goto L9;
        final ContactResult r0 = (ContactResult) r12.next();
        if (r11.tipBars.contains(r0.getItemGroups()) == true) goto L8;
        r11.tipBars.add(r0.getItemGroups());
        DslAdapterExKt.O10IXXX0X(r11.getDslAdapter(), R.layout.item_contact_v2_groups, new iOO0iO0(r0));
    L8:
        DslAdapterExKt.O10IXXX0X(r11.getDslAdapter(), R.layout.item_contact_v2, new IOIi11(r0, r10, r11));
        goto L4
    L9:
        DslAdapter.render$default(r10, false, null, new X1IOX(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0(final ContactResult r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getItemGroups()}));
        r2.setItemIsHover(true);
        r2.setItemBindOverride(new Ii1OiXiI1(r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0$0(ContactResult r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "viewHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = (TextView) r1.v(R.id.tv_name);
        if (r5 == null) goto L6;
        r5.setText(r0.getItemGroups());
    L6:
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$1(final ContactResult r1, final DslAdapter r2, final ContactListV2Activity r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getItemGroups()}));
        r4.setItemBindOverride(new XiI0O(r1, r4, r2, r3));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$1$0(final ContactResult r7, final DslAdapterItem r8, final DslAdapter r9, final ContactListV2Activity r10, final DslViewHolder r11, final int r12, DslAdapterItem r13, List r14) {
        Intrinsics.X0O(r11, "viewHolder");
        Intrinsics.X0O(r13, "<unused var>");
        Intrinsics.X0O(r14, "<unused var>");
        TextView r15 = (TextView) r11.v(R.id.tv_name);
        if (r15 == null) goto L5;
        r15.setText(r7.getDisplayName());
    L5:
        List<PhoneNumber> r16 = r7.getPhoneNumbers();
        Intrinsics.O10IXXX0X(r16, "getPhoneNumbers(...)");
        if (r16.isEmpty() == true) goto L10;
        TextView r17 = (TextView) r11.v(R.id.tv_number);
        if (r17 == null) goto L10;
        r17.setText(r7.getPhoneNumbers().get(0).getNumber());
    L10:
        r11.click(R.id.bt_delete_sport_record, new O01i0(r8, r9, r10, r12, r7, r11));
        View r18 = r11.view(R.id.ll_item_panel);
        if (r18 == null) goto L14;
        r18.setOnTouchListener(new I100(r11));
    L14:
        return Unit.OXO1;
    }

    private static final void showData$lambda$0$0$0$1$0$0(final DslAdapterItem r6, DslAdapter r7, final ContactListV2Activity r8, final int r9, final ContactResult r10, final DslViewHolder r11, View r12) {
        X0IOiX1O.XIi00iiXO(false, new IIXXXX1O(r8, r9, r10, r6, r11), 1, null);
        DslAdapter r13 = r6.getItemDslAdapter();
        if (r13 == null) goto L10;
        List<DslAdapterItem> r14 = r13.getDataItems();
        if (r14 != null) goto L7;
        return;
    L7:
        if (r14.size() != 0) goto L12;
        DslAdapter.setAdapterStatus$default(r7, 1, null, 2, null);
        return;
    L12:
        return;
    }

    private static final Unit showData$lambda$0$0$0$1$0$0$0(ContactListV2Activity r3, int r4, ContactResult r5, DslAdapterItem r6, DslViewHolder r7, BleConnector r8) {
        Intrinsics.X0O(r8, "connector");
        if (r3.deleting == false) goto L5;
        ToastUtils.showLong(R.string.too_often);
    L18:
        return Unit.OXO1;
    L5:
        r3.deleting = true;
        r3.tmps.clear();
        r3.tmps.addAll(r3.mList);
        if ((r4 - (r3.tipBars.indexOf(r5.getItemGroups()) + 1)) >= r3.mList.size()) goto L16;
        r3.tmps.remove(r4 - (r3.tipBars.indexOf(r5.getItemGroups()) + 1));
        r3.syncContact(r3.tmps);
        SwipeMenuHelper r9 = r6.get_itemSwipeMenuHelper();
        if (r9 == null) goto L10;
        r9.closeSwipeMenu(r7);
    L10:
        DslAdapter r10 = r6.getItemDslAdapter();
        if (r10 == null) goto L13;
        DslAdapter.removeItem$default(r10, r6, false, 2, null);
    L13:
        DslAdapter r11 = r6.getItemDslAdapter();
        if (r11 == null) goto L18;
        DslAdapter.updateItemDepend$default(r11, null, 1, null);
        goto L18
    L16:
        ToastUtils.showLong(R.string.too_often);
        r3.getDslAdapter().notifyDataChanged();
        goto L18
    }

    private static final boolean showData$lambda$0$0$0$1$0$1$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final Unit showData$lambda$0$0$1(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    private final void syncContact(List<? extends ContactResult> r12) {
    L11:
        e = move-exception;
        e.printStackTrace();
        return;
    L4:
        if (r12.isEmpty() == true) goto L30;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L11
        this.lastData.clear();     // Catch: Exception -> L11
        this.lastData.addAll(r12);     // Catch: Exception -> L11
        Iterator<T> r13 = r12.iterator();     // Catch: Exception -> L11
    L7:
        if (r13.hasNext() == false) goto L13;
        ContactResult r2 = (ContactResult) r13.next();     // Catch: Exception -> L11
        List<PhoneNumber> r4 = r2.getPhoneNumbers();     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r4, "getPhoneNumbers(...)");     // Catch: Exception -> L11
        if (r4.isEmpty() == true) goto L7;
        String r5 = r2.getDisplayName();     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r5, "getDisplayName(...)");     // Catch: Exception -> L11
        String r3 = r2.getPhoneNumbers().get(0).getNumber();     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r3, "getNumber(...)");     // Catch: Exception -> L11
        r1.add(new Contact(r5, r3));     // Catch: Exception -> L11
        goto L7
    L13:
        LogUtils.d(new Object[]{" contact " + r1.size() + " " + r1});     // Catch: Exception -> L11
        byte[] r6 = new byte[r1.size() * 40];     // Catch: Exception -> L11
        int r14 = r1.size();     // Catch: Exception -> L11
        int r7 = 0;
    L14:
        if (r7 >= r14) goto L28;
        byte[] r8 = ((Contact) r1.get(r7)).getName().getBytes(Charsets.XIi00iiXO);     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r8, "getBytes(...)");     // Catch: Exception -> L11
        int r9 = r8.length;     // Catch: Exception -> L11
        int r10 = 0;
    L17:
        if (r10 >= r9) goto L21;
        if (r10 >= 24) goto L20;
        r6[(r7 * 40) + r10] = r8[r10];     // Catch: Exception -> L11
    L20:
        r10 = r10 + 1;     // Catch: Exception -> L11
        goto L17
    L21:
        byte[] r11 = ((Contact) r1.get(r7)).getPhone().getBytes(Charsets.XIi00iiXO);     // Catch: Exception -> L11
        Intrinsics.O10IXXX0X(r11, "getBytes(...)");     // Catch: Exception -> L11
        int r15 = r11.length;     // Catch: Exception -> L11
        int r16 = 0;
    L22:
        if (r16 >= r15) goto L27;
        if (r16 >= 16) goto L26;
        r6[((r7 * 40) + 24) + r16] = r11[r16];     // Catch: Exception -> L11
    L26:
        r16 = r16 + 1;     // Catch: Exception -> L11
        goto L22
    L27:
        r7 = r7 + 1;     // Catch: Exception -> L11
        goto L14
    L28:
        LogUtils.d(new Object[]{ByteArrayExtKt.getMHexString(r6)});     // Catch: Exception -> L11
        BaseBleConnector.sendStream$default(BleConnector.INSTANCE, BleKey.CONTACT, r6, 0, 4, null);     // Catch: Exception -> L11
        return;
    L30:
        BleConnector r0 = BleConnector.INSTANCE;     // Catch: Exception -> L11
        BleKey r17 = BleKey.CONTACT_SORT;     // Catch: Exception -> L11
        BleKeyFlag r18 = BleKeyFlag.DELETE;     // Catch: Exception -> L11
        BaseBleConnector.sendData$default(r0, r17, r18, null, false, false, 28, null);     // Catch: Exception -> L11
        BaseBleConnector.sendData$default(r0, BleKey.CONTACT, r18, null, false, false, 28, null);     // Catch: Exception -> L11
    }

    @aa1
    public final List<ContactResult> filledData(@aa1 List<ContactResult> r9) {
        Intrinsics.X0O(r9, "list");
        Iterator<T> r0 = r9.iterator();
    L4:
        if (r0.hasNext() == false) goto L12;
        ContactResult r1 = (ContactResult) r0.next();
        i0iI0X0iO.OXO1 r2 = i0iI0X0iO.iO;
        String r3 = r1.getDisplayName();
        Intrinsics.O10IXXX0X(r3, "getDisplayName(...)");
        String r4 = r2.XIi00iiXO(r3);
        if (r4.length() > 0) goto L7;
        r1.setItemGroups(qu0.XO0O10);
        goto L4
    L7:
        String r5 = r4.substring(0, 1);
        Intrinsics.O10IXXX0X(r5, "substring(...)");
        Locale r6 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r6, "getDefault(...)");
        String r7 = r5.toUpperCase(r6);
        Intrinsics.O10IXXX0X(r7, "toUpperCase(...)");
        if (new Regex("[A-Z]").matches(r7) == true) goto L9;
        r1.setItemGroups(qu0.XO0O10);
        goto L4
    L9:
        Locale r8 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r8, "getDefault(...)");
        String r10 = r7.toUpperCase(r8);
        Intrinsics.O10IXXX0X(r10, "toUpperCase(...)");
        r1.setItemGroups(r10);
        goto L4
    L12:
        Collections.sort(r9, this.pinyinComparator);
        return r9;
    }

    public final boolean getDeleting() {
        return this.deleting;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.bleHandleCallback);
        this.pinyinComparator = new xv1();
    }

    @aa1
    public final List<ContactResult> initList() {
        byte[] r4 = EncodeUtils.base64Decode(a01.OXO1.IiI10X().getString(ContactResult.class.getName() + is3.OXO1));     // Catch: Exception -> L9
        Intrinsics.O10IXXX0X(r4, "base64Decode(...)");     // Catch: Exception -> L9
        JsonArray r5 = JsonParser.parseString(new String(r4, Charsets.XIi00iiXO)).getAsJsonArray();     // Catch: Exception -> L9
        Intrinsics.XXI(r5);     // Catch: Exception -> L9
        Collection r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));     // Catch: Exception -> L9
        Iterator<JsonElement> r7 = r5.iterator();     // Catch: Exception -> L9
    L6:
        if (r7.hasNext() == false) goto L10;
        r6.add(new Gson().fromJson(r7.next(), ContactResult.class));     // Catch: Exception -> L9
    L10:
        ArrayList r8 = new ArrayList();     // Catch: Exception -> L18
        Iterator r9 = r6.iterator();     // Catch: Exception -> L18
    L12:
        if (r9.hasNext() == false) goto L16;
        Object r10 = r9.next();     // Catch: Exception -> L18
        List<PhoneNumber> r11 = ((ContactResult) r10).getPhoneNumbers();     // Catch: Exception -> L18
        Intrinsics.O10IXXX0X(r11, "getPhoneNumbers(...)");     // Catch: Exception -> L18
        if (r11.isEmpty() == true) goto L12;
        r8.add(r10);     // Catch: Exception -> L18
        goto L12
    L16:
        return CollectionsKt___CollectionsKt.OO0Oi10(r8);
    L9:
        r6 = CollectionsKt__CollectionsKt.iI();     // Catch: Exception -> L18
    L29:
        byte[] r1 = EncodeUtils.base64Decode(a01.OXO1.IiI10X().getString(ContactResult.class.getName() + is3.OXO1));     // Catch: Exception -> L24
        Intrinsics.O10IXXX0X(r1, "base64Decode(...)");     // Catch: Exception -> L24
        JsonArray r0 = JsonParser.parseString(new String(r1, Charsets.XIi00iiXO)).getAsJsonArray();     // Catch: Exception -> L24
        Intrinsics.XXI(r0);     // Catch: Exception -> L24
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));     // Catch: Exception -> L24
        Iterator<JsonElement> r3 = r0.iterator();     // Catch: Exception -> L24
    L21:
        if (r3.hasNext() == false) goto L26;
        r2.add(new Gson().fromJson(r3.next(), ContactResult.class));     // Catch: Exception -> L24
    L26:
        return CollectionsKt___CollectionsKt.OO0Oi10(r2);
    L24:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L26
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.sync_contact);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_coaching_add);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        View r0 = findViewById(R.id.contact_search_layout);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        UtilsKt.IX1XiI(r0, 20.0f);
        List<ContactResult> r1 = initList();
        this.mList = r1;
        showData(filledData(r1));
        getMContactBar().setOnTouchingLetterChangedListener(new iO(this));
        EditText r2 = getMEditText();
        Intrinsics.O10IXXX0X(r2, "<get-mEditText>(...)");
        r2.addTextChangedListener(new XIi00iiXO(this));
        if (this.mList.isEmpty() == true) goto L6;
        getRootView().postDelayed(new I1OiIXiIO(this), 500);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_contact_list_v2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r2, int r3, @tb1 final Intent r4) {
        super.onActivityResult(r2, r3, r4);
        if (r3 == (-1)) goto L5;
        return;
    L5:
        if (r2 != 991) goto L9;
        X0IOiX1O.XIi00iiXO(false, new OX0i1iX(this, r4), 1, null);
        return;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        pickContact();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.bleHandleCallback);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        pickContact();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setDeleting(boolean r1) {
        this.deleting = r1;
    }

    public final void showData(@aa1 final List<ContactResult> r3) {
        Intrinsics.X0O(r3, "list");
        this.tipBars.clear();
        renderAdapter(new i0iOX1010(this, r3));
        if (r3.isEmpty() == false) goto L5;
        getMContactBar().setVisibility(8);
        getMLinearLayout().setVisibility(8);
        getMEmptyLayout().setVisibility(0);
    L6:
        this.deleting = false;
        return;
    L5:
        getMContactBar().setVisibility(0);
        getMLinearLayout().setVisibility(0);
        getMEmptyLayout().setVisibility(8);
        goto L6
    }
}
