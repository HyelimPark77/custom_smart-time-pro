package com.sma.smartv3.p610ui.device;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bz5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iw0;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.ironsource.C12181V2;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_filebrowse.interfaces.SimpleFileObserver;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.MusicManagerActivity;
import com.sma.smartv3.p610ui.musicpicker.MusicPicker;
import com.sma.smartv3.p610ui.musicpicker.MusicResult;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
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
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1563#2:671\n1634#2,3:672\n87#3,7:675\n94#3,3:683\n70#3,7:686\n97#3:693\n1#4:682\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n*L\n397#1:671\n397#1:672,3\n667#1:675,7\n667#1:683,3\n667#1:686,7\n667#1:693\n667#1:682\n*E\n"})
public class MusicManagerActivity extends BaseDSLRecyclerActivity {
    private int mDownSuccessSize;

    @tb1
    private go0 mErrorPopup;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private SDCardBean mSDCardBean;
    private int retryFrequency;

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kx0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.abhTitleRight_delegate$lambda$0(this.f9302IO);
        }
    });

    @aa1
    private final Lazy tvTotalProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nx0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvTotalProgress_delegate$lambda$0(this.f10028IO);
        }
    });

    @aa1
    private final Lazy tvName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.px0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvName_delegate$lambda$0(this.f10454IO);
        }
    });

    @aa1
    private final Lazy tvProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvProgress_delegate$lambda$0(this.f9533IO);
        }
    });

    @aa1
    private final Lazy tvProgressTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvProgressTip_delegate$lambda$0(this.f9797IO);
        }
    });

    @aa1
    private final Lazy pbProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.pbProgress_delegate$lambda$0(this.f10022IO);
        }
    });

    @aa1
    private final Lazy taskPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ow0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.taskPanel_delegate$lambda$0(this.f10236IO);
        }
    });

    @aa1
    private final Lazy tvCancel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvCancel_delegate$lambda$0(this.f10448IO);
        }
    });

    @aa1
    private final Lazy tvRetry$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvRetry_delegate$lambda$0(this.f10691IO);
        }
    });

    @aa1
    private final Lazy tvFreeSpace$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.tvFreeSpace_delegate$lambda$0(this.f10913IO);
        }
    });
    private int mMusicItemLayout = R.layout.item_music;

    @aa1
    private final String TAG = "MusicManagerActivity";
    private int isTransferTip = R.string.transfering;
    private final int loadTimeOut = 255;

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.lx0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return MusicManagerActivity.mHandler$lambda$0(this.f9543IO, message);
        }
    });

    @aa1
    private final List<FileStruct> mFiles = new ArrayList();

    @aa1
    private final Lazy mDeviceFileCallback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mx0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerActivity.mDeviceFileCallback_delegate$lambda$0(this.f9804IO);
        }
    });

    @aa1
    private final O00 mFileObserver = new O00();

    @aa1
    private C18765iO mBleHandleCallback = new C18765iO();

    @SourceDebugExtension({"SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n774#2:671\n865#2,2:672\n1#3:674\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n*L\n207#1:671\n207#1:672,2\n*E\n"})
    public static final class O00 implements FileObserver {
        public O00() {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean z) {
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> OnFlayCallback " + z);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int i) {
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onFileReadFailed " + i);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onFileReadStart");
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean z) {
            Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(MusicManagerActivity.this.getMSDCardBean());
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onFileReadStop " + z + " " + currentReadFile.getName());
            if (!z) {
                MusicManagerActivity musicManagerActivity = MusicManagerActivity.this;
                musicManagerActivity.loadMore(musicManagerActivity.getMSDCardBean());
            } else if (oe5.OX0X1O10X(currentReadFile.getName(), "music", true)) {
                try {
                    MusicManagerActivity.this.showList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> fileStructs) {
            Intrinsics.X0O(fileStructs, "fileStructs");
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onFileReceiver size:" + fileStructs.size() + ", " + fileStructs);
            List<FileStruct> mFiles = MusicManagerActivity.this.getMFiles();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fileStructs) {
                FileStruct fileStruct = (FileStruct) obj;
                String name = fileStruct.getName();
                Intrinsics.O10IXXX0X(name, "getName(...)");
                if (!StringsKt__StringsKt.iOiXX(name, ".tmp", true)) {
                    String name2 = fileStruct.getName();
                    Intrinsics.O10IXXX0X(name2, "getName(...)");
                    if (!StringsKt__StringsKt.iOiXX(name2, ".txt", true)) {
                        arrayList.add(obj);
                    }
                }
            }
            mFiles.addAll(arrayList);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> list) {
            Intrinsics.X0O(list, "list");
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onSdCardStatusChange " + list);
            MusicManagerActivity musicManagerActivity = MusicManagerActivity.this;
            for (Object obj : list) {
                if (((SDCardBean) obj).isOnline()) {
                    musicManagerActivity.setMSDCardBean((SDCardBean) obj);
                    MusicManagerActivity.this.getMFiles().clear();
                    MusicManagerActivity musicManagerActivity2 = MusicManagerActivity.this;
                    musicManagerActivity2.getCurrentInfo(musicManagerActivity2.getMSDCardBean());
                }
            }
            obj = null;
            musicManagerActivity.setMSDCardBean((SDCardBean) obj);
            MusicManagerActivity.this.getMFiles().clear();
            MusicManagerActivity musicManagerActivity3 = MusicManagerActivity.this;
            musicManagerActivity3.getCurrentInfo(musicManagerActivity3.getMSDCardBean());
        }
    }

    public static final class OXO1 extends SimpleFileObserver {
        public final /* synthetic */ SDCardBean XIi00iiXO;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ String f54493iO;

        public OXO1(SDCardBean sDCardBean, String str) {
            this.XIi00iiXO = sDCardBean;
            this.f54493iO = str;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int i) {
            super.onFileReadFailed(i);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean z) {
            super.onFileReadStop(z);
            FileBrowseManager.getInstance().removeFileObserver(this);
            MusicManagerActivity.this.browToDir(this.XIi00iiXO, this.f54493iO);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<? extends SDCardBean> onLineCards) {
            Intrinsics.X0O(onLineCards, "onLineCards");
            super.onSdCardStatusChange(onLineCards);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }
    }

    public static final class XIi00iiXO implements DeleteCallback {
        public final /* synthetic */ int XIi00iiXO;

        public XIi00iiXO(int i) {
            this.XIi00iiXO = i;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onError(int i, FileStruct file) {
            Intrinsics.X0O(file, "file");
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onDeviceFileDeleteError " + i + ", " + file);
            MusicManagerActivity.this.dismissLoadPopup();
            ToastUtils.showLong(i + HelpFormatter.DEFAULT_OPT_PREFIX + file.getName() + MusicManagerActivity.this.getString(R.string.failed_to_delete), new Object[0]);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onFinish() {
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onDeviceFileDeleteFinish");
            MusicManagerActivity.this.getMFiles().remove(this.XIi00iiXO);
            MusicManagerActivity.this.showList();
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onSuccess(FileStruct p0) {
            Intrinsics.X0O(p0, "p0");
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " -> onDeviceFileDelete " + p0);
        }
    }

    public static final class XO0O10 implements com.sma.smartv3.ui.device.XIi00iiXO.OXO1 {
        public XO0O10() {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0IIOi(int i, int i2) {
            MusicManagerActivity.this.refreshTaskPanel(i, i2);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0iXXO(int i) {
            MusicManagerActivity.this.getTaskPanel().setVisibility(8);
            MusicManagerActivity.this.onMusicFileTransferStop();
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void IiI10X(int i) {
            MusicManagerActivity.this.refreshTaskPanel(i, 0);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void OIi0(int i, boolean z) {
            if (z) {
                MusicManagerActivity.this.getTaskPanel().setVisibility(8);
                MusicManagerActivity.this.onMusicFileTransferStop();
                MusicManagerActivity.this.getSDCardInfo();
            }
            i1O0OXO1O.OXO1.OXO1(MusicManagerActivity.this.getTAG() + " onFileTransferFinish");
            MusicManagerActivity.this.getDeviceFileList();
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XIi00iiXO(int i) {
            super.XIi00iiXO(i);
            if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
                MusicManagerActivity.this.dismissLoadPopup();
            }
            MusicManagerActivity.this.getSDCardInfo();
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XO0O10(int i, int i2, String msg) {
            Intrinsics.X0O(msg, "msg");
            MusicManagerActivity.this.getTvCancel().setVisibility(8);
            MusicManagerActivity.this.getTvRetry().setVisibility(0);
            MusicManagerActivity.this.getTvProgressTip().setText(R.string.music_transfer_task_failed_tip);
            MusicManagerActivity.this.getPbProgress().setProgress(0);
            ToastUtils.showLong(com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.OII().get(i).IiI10X() + "\n" + i2 + CertificateUtil.DELIMITER + msg, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.MusicManagerActivity$iO */
    public static final class C18765iO implements BleHandleCallback {
        public C18765iO() {
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
        public void onReadSDCardInfo(BleSDCardInfo sdCardInfo) {
            Intrinsics.X0O(sdCardInfo, "sdCardInfo");
            MusicManagerActivity.this.showFreeSpace();
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
        public void onSDCardInfoUpdate(BleSDCardInfo sdCardInfo) {
            Intrinsics.X0O(sdCardInfo, "sdCardInfo");
            MusicManagerActivity.this.showFreeSpace();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (ImageView) musicManagerActivity.findViewById(R.id.abh_title_right);
    }

    private final void add() {
        if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
            doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.dx0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return MusicManagerActivity.add$lambda$0(this.f6286IO);
                }
            });
        } else {
            showErrorPop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit add$lambda$0(MusicManagerActivity musicManagerActivity) {
        musicManagerActivity.pickFile();
        return Unit.OXO1;
    }

    private final void append(SDCardBean sDCardBean, FileStruct fileStruct) {
        int iAppenBrowse = FileBrowseManager.getInstance().appenBrowse(fileStruct, sDCardBean);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> appendToDir " + iAppenBrowse);
        if (iAppenBrowse != 0) {
            return;
        }
        this.mFiles.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void browToDir(SDCardBean sDCardBean, String str) {
        Object next;
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
        if (currentReadFile == null) {
            return;
        }
        while (currentReadFile.getParent() != null) {
            FileBrowseManager.getInstance().backBrowse(sDCardBean, false);
            currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
            Intrinsics.O10IXXX0X(currentReadFile, "getCurrentReadFile(...)");
        }
        List<FileStruct> childFileStructs = currentReadFile.getChildFileStructs();
        Intrinsics.O10IXXX0X(childFileStructs, "getChildFileStructs(...)");
        Iterator<T> it = childFileStructs.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FileStruct fileStruct = (FileStruct) next;
            if (!fileStruct.isFile() && oe5.OX0X1O10X(fileStruct.getName(), str, true)) {
                break;
            }
        }
        FileStruct fileStruct2 = (FileStruct) next;
        if (fileStruct2 != null) {
            append(sDCardBean, fileStruct2);
            return;
        }
        if (currentReadFile.isLoadFinished(false)) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> browseToDir add simpleFileObserver");
        OXO1 oxo1 = new OXO1(sDCardBean, str);
        FileBrowseManager.getInstance().addFileObserver(oxo1);
        FileBrowseManager.getInstance().setPageSize(30);
        if (FileBrowseManager.getInstance().loadMore(sDCardBean) != 0) {
            FileBrowseManager.getInstance().removeFileObserver(oxo1);
        }
    }

    private final boolean canLoadMore(SDCardBean sDCardBean) {
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
        return (currentReadFile == null || currentReadFile.isLoadFinished(false)) ? false : true;
    }

    private final void deleteFile(int i) {
        if (this.mFiles.size() == 0) {
            showList();
            dismissLoadPopup();
            ToastUtils.showLong(getString(R.string.failed_to_delete), new Object[0]);
            return;
        }
        FileBrowseManager fileBrowseManager = FileBrowseManager.getInstance();
        SDCardBean sDCardBean = this.mSDCardBean;
        List<FileStruct> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(this.mFiles.get(i));
        SDCardBean sDCardBean2 = this.mSDCardBean;
        Integer numValueOf = sDCardBean2 != null ? Integer.valueOf(sDCardBean2.getType()) : null;
        Intrinsics.XXI(numValueOf);
        fileBrowseManager.deleteFile(sDCardBean, listIi1iii0, numValueOf.intValue() > 1, new XIi00iiXO(i));
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCurrentInfo(SDCardBean sDCardBean) {
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
        if (currentReadFile == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> getCurrentInfo folder " + currentReadFile.getName());
        if (!oe5.OX0X1O10X(currentReadFile.getName(), "music", true) || currentReadFile.getLevel() != 1) {
            browToDir(sDCardBean, "music");
        } else if (currentReadFile.isLoadFinished(false) || currentReadFile.getChildFileStructs().size() >= 1) {
            currentReadFile.isLoadFinished(false);
        } else {
            loadMore(sDCardBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceFileList$lambda$0(MusicManagerActivity musicManagerActivity) {
        if (musicManagerActivity.mFiles.size() == 0) {
            musicManagerActivity.browToDirDeviceFile();
        } else {
            musicManagerActivity.loadMore(musicManagerActivity.mSDCardBean);
        }
    }

    private final XO0O10 getMDeviceFileCallback() {
        return (XO0O10) this.mDeviceFileCallback$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSDCardInfo() {
        if (q62.OXO1.XI1O1111i()) {
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.SDCARD_INFO, BleKeyFlag.READ, null, false, false, 28, null);
        }
    }

    private final TextView getTvName() {
        return (TextView) this.tvName$delegate.getValue();
    }

    private final TextView getTvProgress() {
        return (TextView) this.tvProgress$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMore(SDCardBean sDCardBean) {
        int iLoadMore = FileBrowseManager.getInstance().loadMore(sDCardBean);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> loadMoreFile " + iLoadMore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XO0O10 mDeviceFileCallback_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return musicManagerActivity.new XO0O10();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mHandler$lambda$0(MusicManagerActivity musicManagerActivity, Message it) {
        Intrinsics.X0O(it, "it");
        if (it.what != musicManagerActivity.loadTimeOut) {
            return false;
        }
        musicManagerActivity.dismissLoadPopup();
        if (!com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
            musicManagerActivity.showErrorPop();
        }
        i1O0OXO1O.OXO1.OXO1(musicManagerActivity.TAG + " loadTimeOut retryFrequency=" + musicManagerActivity.retryFrequency);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomClick$lambda$0(MusicManagerActivity musicManagerActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            musicManagerActivity.add();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomClick$lambda$1(MusicManagerActivity musicManagerActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            musicManagerActivity.add();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$0$1(MusicManagerActivity musicManagerActivity) {
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.O001I();
        musicManagerActivity.getTaskPanel().setVisibility(8);
        musicManagerActivity.onMusicFileTransferStop();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTitleLeftClick$lambda$0(MusicManagerActivity musicManagerActivity) {
        musicManagerActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressBar pbProgress_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (ProgressBar) musicManagerActivity.findViewById(R.id.pb_progress);
    }

    private final void pickFile() {
        new MusicPicker.Builder(this).hideScrollbar(false).setMaxSelectCount(0).showTrack(true).searchIconColor(-1).setChoiceMode(0).bubbleTextColor(-1).setTitleText(getString(R.string.picker_music_title)).setLoadingType(1).showPickerForResult(iw0.O00);
    }

    public static /* synthetic */ void preventUse$default(MusicManagerActivity musicManagerActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preventUse");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        musicManagerActivity.preventUse(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshTaskPanel(int i, int i2) {
        getTvProgressTip().setText(R.string.music_transfer_task_tip);
        getTvCancel().setVisibility(0);
        getTvRetry().setVisibility(8);
        com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
        if (xIi00iiXO.X01IiOiIi()) {
            getTaskPanel().setVisibility(0);
        }
        getTvName().setText(xIi00iiXO.OII().get(i).IiI10X());
        getTvTotalProgress().setText((i + 1) + "/" + xIi00iiXO.OII().size());
        getPbProgress().setProgress(i2);
        getTvProgress().setText(i2 + "%");
    }

    private final void showErrorPop() {
        go0 go0Var;
        if (this.mErrorPopup == null) {
            go0 go0Var2 = new go0(getMContext(), 0, 2, null);
            go0Var2.O1O(R.string.bt3_connect_error);
            go0Var2.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.zw0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MusicManagerActivity.showErrorPop$lambda$0$0(this.f12704IO));
                }
            });
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.ax0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MusicManagerActivity.showErrorPop$lambda$0$1(this.f5601IO));
                }
            });
            this.mErrorPopup = go0Var2;
        }
        go0 go0Var3 = this.mErrorPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mErrorPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showErrorPop$lambda$0$0(MusicManagerActivity musicManagerActivity) {
        musicManagerActivity.preventUse(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showErrorPop$lambda$0$1(MusicManagerActivity musicManagerActivity) {
        showLoadPopup$default(musicManagerActivity, false, 1, null);
        int i = musicManagerActivity.retryFrequency + 1;
        musicManagerActivity.retryFrequency = i;
        if (i > 2) {
            musicManagerActivity.retryFrequency = 0;
            FileBrowseManager.getInstance().removeFileObserver(musicManagerActivity.mFileObserver);
            com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
            xIi00iiXO.XiOIO();
            Application application = musicManagerActivity.getApplication();
            Intrinsics.O10IXXX0X(application, "getApplication(...)");
            xIi00iiXO.m38420OX(application);
            FileBrowseManager.getInstance().addFileObserver(musicManagerActivity.mFileObserver);
        }
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.X0O();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showList() {
        i1O0OXO1O.OXO1.OXO1("showList -> size:" + this.mFiles.size() + ", " + this.mFiles);
        preventUse(false);
        this.mHandler.removeMessages(this.loadTimeOut);
        dismissLoadPopup();
        go0 go0Var = this.mErrorPopup;
        if (go0Var != null) {
            go0Var.dismiss();
        }
        if (this.mFiles.isEmpty()) {
            getRecyclerView().setVisibility(4);
            findViewById(R.id.empty).setVisibility(0);
        } else {
            getDslAdapter().resetItem(new ArrayList());
            renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.bx0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerActivity.showList$lambda$0(this.f5839IO, (DslAdapter) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final MusicManagerActivity musicManagerActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        musicManagerActivity.findViewById(R.id.empty).setVisibility(8);
        musicManagerActivity.getRecyclerView().setVisibility(0);
        for (final FileStruct fileStruct : musicManagerActivity.mFiles) {
            DslAdapterExKt.O10IXXX0X(musicManagerActivity.getDslAdapter(), musicManagerActivity.mMusicItemLayout, new Function1() { // from class: com.android.mltcode.paycertificationapi.tw0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerActivity.showList$lambda$0$0(fileStruct, musicManagerActivity, (DslAdapterItem) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final FileStruct fileStruct, final MusicManagerActivity musicManagerActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.sw0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MusicManagerActivity.showList$lambda$0$0$0(fileStruct, musicManagerActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(FileStruct fileStruct, final MusicManagerActivity musicManagerActivity, DslViewHolder itemHolder, final int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(fileStruct.getName());
        }
        ImageView imageViewImg = itemHolder.img(R.id.btn_delete);
        if (imageViewImg != null) {
            imageViewImg.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.uw0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicManagerActivity.showList$lambda$0$0$0$0(this.f11583IO, i, view);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$0(final MusicManagerActivity musicManagerActivity, final int i, View view) {
        musicManagerActivity.doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.cx0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MusicManagerActivity.showList$lambda$0$0$0$0$0(this.f6071IO, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0$0$0(final MusicManagerActivity musicManagerActivity, final int i) {
        go0 go0Var = new go0(musicManagerActivity.getMContext(), 0, 2, null);
        go0Var.O1O(R.string.delete_song);
        go0Var.m1865iX(Integer.valueOf(R.string.delete_song_tip));
        go0Var.IXXOO(1);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.vw0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(MusicManagerActivity.showList$lambda$0$0$0$0$0$0$0());
            }
        });
        go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.gx0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(MusicManagerActivity.showList$lambda$0$0$0$0$0$0$1(this.f6984IO, i));
            }
        });
        go0Var.IIX1OXO();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showList$lambda$0$0$0$0$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showList$lambda$0$0$0$0$0$0$1(MusicManagerActivity musicManagerActivity, int i) {
        musicManagerActivity.showLoadPopup(false);
        musicManagerActivity.deleteFile(i);
        return true;
    }

    public static /* synthetic */ void showLoadPopup$default(MusicManagerActivity musicManagerActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadPopup");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        musicManagerActivity.showLoadPopup(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View taskPanel_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return musicManagerActivity.findViewById(R.id.task_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvCancel_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return musicManagerActivity.findViewById(R.id.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvFreeSpace_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (TextView) musicManagerActivity.findViewById(R.id.tv_free_space);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvName_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (TextView) musicManagerActivity.findViewById(R.id.tv_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvProgressTip_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (TextView) musicManagerActivity.findViewById(R.id.tv_progress_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvProgress_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (TextView) musicManagerActivity.findViewById(R.id.tv_progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvRetry_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return musicManagerActivity.findViewById(R.id.tv_retry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTotalProgress_delegate$lambda$0(MusicManagerActivity musicManagerActivity) {
        return (TextView) musicManagerActivity.findViewById(R.id.tv_total_progress);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final void browToDirDeviceFile() {
        if (this.mFiles.size() >= 30) {
            loadMore(this.mSDCardBean);
        } else {
            browToDir(this.mSDCardBean, "music");
        }
    }

    public final void dismissLoadPopup() {
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    public boolean doTransfer(@aa1 Function0<Unit> action) {
        Intrinsics.X0O(action, "action");
        if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.X01IiOiIi()) {
            ToastUtils.showLong(getString(this.isTransferTip), new Object[0]);
            return false;
        }
        action.invoke2();
        return true;
    }

    public void getDeviceFileList() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.yw0
            @Override // java.lang.Runnable
            public final void run() {
                MusicManagerActivity.getDeviceFileList$lambda$0(this.f12465IO);
            }
        }, 300L);
    }

    public final int getMDownSuccessSize() {
        return this.mDownSuccessSize;
    }

    @aa1
    public final List<FileStruct> getMFiles() {
        return this.mFiles;
    }

    public final int getMMusicItemLayout() {
        return this.mMusicItemLayout;
    }

    @tb1
    public final SDCardBean getMSDCardBean() {
        return this.mSDCardBean;
    }

    public final ProgressBar getPbProgress() {
        return (ProgressBar) this.pbProgress$delegate.getValue();
    }

    public final int getRetryFrequency() {
        return this.retryFrequency;
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final View getTaskPanel() {
        return (View) this.taskPanel$delegate.getValue();
    }

    public final View getTvCancel() {
        return (View) this.tvCancel$delegate.getValue();
    }

    public final TextView getTvFreeSpace() {
        return (TextView) this.tvFreeSpace$delegate.getValue();
    }

    public final TextView getTvProgressTip() {
        return (TextView) this.tvProgressTip$delegate.getValue();
    }

    public final View getTvRetry() {
        return (View) this.tvRetry$delegate.getValue();
    }

    public final TextView getTvTotalProgress() {
        return (TextView) this.tvTotalProgress$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
        Application application = getApplication();
        Intrinsics.O10IXXX0X(application, "getApplication(...)");
        xIi00iiXO.m38420OX(application);
        FileBrowseManager.getInstance().addFileObserver(this.mFileObserver);
        xIi00iiXO.O10IXXX0X(getMDeviceFileCallback());
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.hx0
            @Override // java.lang.Runnable
            public final void run() {
                MusicManagerActivity.showLoadPopup$default(this.f7230IO, false, 1, null);
            }
        }, 600L);
        xIi00iiXO.X0O();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BleInitializer.f51208IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.music_manager);
        showRightIcon();
        showFreeSpace();
    }

    public final int isTransferTip() {
        return this.isTransferTip;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_music_manager;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        String strXXI;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 990) {
            com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
            ArrayList<MusicResult> arrayListXIi00iiXO = MusicPicker.XIi00iiXO(intent);
            Intrinsics.O10IXXX0X(arrayListXIi00iiXO, "obtainResult(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayListXIi00iiXO, 10));
            for (MusicResult musicResult : arrayListXIi00iiXO) {
                if (musicResult.XXI().length() > 50) {
                    String strXXI2 = musicResult.XXI();
                    Intrinsics.O10IXXX0X(strXXI2, "getTitle(...)");
                    String strSubstring = strXXI2.substring(0, 50);
                    Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                    strXXI = strSubstring + ".mp3";
                } else {
                    strXXI = musicResult.XXI();
                }
                String strO10IXXX0X = musicResult.O10IXXX0X();
                String strX1ii = musicResult.X1ii();
                Intrinsics.XXI(strXXI);
                arrayList.add(new bz5(strO10IXXX0X, strX1ii, strXXI));
            }
            xIi00iiXO.X0i1O(arrayList);
            com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.iXiX011(this.mSDCardBean);
            onMusicFileTransferStart();
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (Build.VERSION.SDK_INT >= 33) {
            PermissionUtils permissionUtilsPermission = PermissionUtils.permission("android.permission.READ_MEDIA_AUDIO");
            Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
            ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ww0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerActivity.onBottomClick$lambda$0(this.f12048IO, (PermissionStatus) obj);
                }
            }, 3, null);
        } else {
            PermissionUtils permissionUtilsPermission2 = PermissionUtils.permission(PermissionConstants.STORAGE);
            Intrinsics.O10IXXX0X(permissionUtilsPermission2, "permission(...)");
            ds1.m1690iO(permissionUtilsPermission2, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.xw0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerActivity.onBottomClick$lambda$1(this.f12247IO, (PermissionStatus) obj);
                }
            }, 3, null);
        }
    }

    public void onCancel(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        go0 go0Var = new go0(getMContext(), 0, 2, null);
        go0Var.O1O(R.string.cancel_transfer);
        go0Var.m1865iX(Integer.valueOf(R.string.cancel_transfer_music_tip));
        go0Var.IXXOO(1);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.ex0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(MusicManagerActivity.onCancel$lambda$0$0());
            }
        });
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.fx0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(MusicManagerActivity.onCancel$lambda$0$1(this.f6753IO));
            }
        });
        go0Var.IIX1OXO();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        FileBrowseManager.getInstance().removeFileObserver(this.mFileObserver);
        com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
        xIi00iiXO.iOO1ii1(getMDeviceFileCallback());
        xIi00iiXO.XiOIO();
        BleInitializer.f51208IO.i1iII1i1(false);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.jx0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Unit.OXO1;
            }
        })) {
            super.onHandleBackPressed();
        }
    }

    public void onMusicFileTransferStart() {
    }

    public void onMusicFileTransferStop() {
    }

    public final void onRetry(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.O1O();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.kw0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MusicManagerActivity.onTitleLeftClick$lambda$0(this.f9294IO);
            }
        });
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/web/help/help_music.html");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void preventUse(boolean z) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMDownSuccessSize(int i) {
        this.mDownSuccessSize = i;
    }

    public final void setMMusicItemLayout(int i) {
        this.mMusicItemLayout = i;
    }

    public final void setMSDCardBean(@tb1 SDCardBean sDCardBean) {
        this.mSDCardBean = sDCardBean;
    }

    public final void setRetryFrequency(int i) {
        this.retryFrequency = i;
    }

    public final void setTransferTip(int i) {
        this.isTransferTip = i;
    }

    public void showFreeSpace() {
        getTvFreeSpace().setVisibility(q62.OXO1.XI1O1111i() ? 0 : 8);
        getTvFreeSpace().setText(getString(R.string.watch_free_space, cp5.iiIOiX((BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null), false, 2, null)));
    }

    public final void showLoadPopup(boolean z) {
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(this);
        }
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            if (z) {
                c3006uq.X01IiOiIi(R.string.music_transfer_load_title);
                c3006uq.m3183I1(Integer.valueOf(R.string.music_transfer_load_tip));
                this.mHandler.sendEmptyMessageDelayed(this.loadTimeOut, C12181V2.f30291h);
            } else {
                c3006uq.X01IiOiIi(0);
                c3006uq.m3183I1(null);
            }
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
    }

    public final void showRightIcon() {
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.understand_situation_icon2);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    }
}
