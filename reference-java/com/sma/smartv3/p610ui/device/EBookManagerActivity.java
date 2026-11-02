package com.sma.smartv3.p610ui.device;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
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
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iw0;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
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
import com.sma.smartv3.p610ui.device.EBookManagerActivity;
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
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nEBookManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EBookManagerActivity.kt\ncom/sma/smartv3/ui/device/EBookManagerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,687:1\n1#2:688\n*E\n"})
public final class EBookManagerActivity extends BaseDSLRecyclerActivity {

    @tb1
    private File cacheFile;

    @tb1
    private go0 mErrorPopup;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private SDCardBean mSDCardBean;
    private int onFileReceiverSize;
    private int retryFrequency;

    @aa1
    private final Lazy tvTotalProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXXI1011X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvTotalProgress_delegate$lambda$0(this.f2098IO);
        }
    });

    @aa1
    private final Lazy tvName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XIiO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvName_delegate$lambda$0(this.f7437IO);
        }
    });

    @aa1
    private final Lazy tvProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1iIiI1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvProgress_delegate$lambda$0(this.f2842IO);
        }
    });

    @aa1
    private final Lazy tvProgressTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii11X0iiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvProgressTip_delegate$lambda$0(this.f8547IO);
        }
    });

    @aa1
    private final Lazy pbProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOI0IIO1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.pbProgress_delegate$lambda$0(this.f4748IO);
        }
    });

    @aa1
    private final Lazy taskPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOIO001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.taskPanel_delegate$lambda$0(this.f1801IO);
        }
    });

    @aa1
    private final Lazy tvCancel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Iii0X1I1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvCancel_delegate$lambda$0(this.f2317IO);
        }
    });

    @aa1
    private final Lazy tvRetry$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXIi0O01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvRetry_delegate$lambda$0(this.f2029IO);
        }
    });

    @aa1
    private final Lazy tvFreeSpace$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10X11Ii1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.tvFreeSpace_delegate$lambda$0(this.f4159IO);
        }
    });

    @aa1
    private final String TAG = "EBookManagerActivity";

    @aa1
    private final List<FileStruct> mFiles = new ArrayList();
    private final int loadTimeOut = 255;

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.O0110X
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return EBookManagerActivity.mHandler$lambda$0(this.f2399IO, message);
        }
    });

    @aa1
    private final Lazy mDeviceFileCallback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O111Oi10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EBookManagerActivity.mDeviceFileCallback_delegate$lambda$0(this.f2667IO);
        }
    });

    @aa1
    private final O00 mFileObserver = new O00();

    @aa1
    private C18697iO mBleHandleCallback = new C18697iO();

    @SourceDebugExtension({"SMAP\nEBookManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EBookManagerActivity.kt\ncom/sma/smartv3/ui/device/EBookManagerActivity$mFileObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,687:1\n774#2:688\n865#2,2:689\n1#3:691\n*S KotlinDebug\n*F\n+ 1 EBookManagerActivity.kt\ncom/sma/smartv3/ui/device/EBookManagerActivity$mFileObserver$1\n*L\n185#1:688\n185#1:689,2\n*E\n"})
    public static final class O00 implements FileObserver {
        public O00() {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean z) {
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> OnFlayCallback " + z);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int i) {
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onFileReadFailed " + i);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onFileReadStart");
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean z) {
            Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(EBookManagerActivity.this.getMSDCardBean());
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onFileReadStop " + z + " " + currentReadFile.getName());
            if (!z) {
                EBookManagerActivity eBookManagerActivity = EBookManagerActivity.this;
                eBookManagerActivity.loadMore(eBookManagerActivity.getMSDCardBean());
            } else if (oe5.OX0X1O10X(currentReadFile.getName(), "music", true)) {
                EBookManagerActivity.this.showList();
            }
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> fileStructs) {
            Intrinsics.X0O(fileStructs, "fileStructs");
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onFileReceiver size:" + fileStructs.size() + ", " + fileStructs);
            EBookManagerActivity.this.setOnFileReceiverSize(fileStructs.size());
            List<FileStruct> mFiles = EBookManagerActivity.this.getMFiles();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fileStructs) {
                FileStruct fileStruct = (FileStruct) obj;
                String name = fileStruct.getName();
                Intrinsics.O10IXXX0X(name, "getName(...)");
                if (!StringsKt__StringsKt.iOiXX(name, ".tmp", true)) {
                    String name2 = fileStruct.getName();
                    Intrinsics.O10IXXX0X(name2, "getName(...)");
                    if (!StringsKt__StringsKt.iOiXX(name2, ".mp3", true)) {
                        arrayList.add(obj);
                    }
                }
            }
            mFiles.addAll(arrayList);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> list) {
            Intrinsics.X0O(list, "list");
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onSdCardStatusChange " + list);
            EBookManagerActivity eBookManagerActivity = EBookManagerActivity.this;
            for (Object obj : list) {
                if (((SDCardBean) obj).isOnline()) {
                    eBookManagerActivity.setMSDCardBean((SDCardBean) obj);
                    EBookManagerActivity.this.getMFiles().clear();
                    EBookManagerActivity eBookManagerActivity2 = EBookManagerActivity.this;
                    eBookManagerActivity2.getCurrentInfo(eBookManagerActivity2.getMSDCardBean());
                }
            }
            obj = null;
            eBookManagerActivity.setMSDCardBean((SDCardBean) obj);
            EBookManagerActivity.this.getMFiles().clear();
            EBookManagerActivity eBookManagerActivity3 = EBookManagerActivity.this;
            eBookManagerActivity3.getCurrentInfo(eBookManagerActivity3.getMSDCardBean());
        }
    }

    public static final class OXO1 extends SimpleFileObserver {
        public final /* synthetic */ SDCardBean XIi00iiXO;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ String f54460iO;

        public OXO1(SDCardBean sDCardBean, String str) {
            this.XIi00iiXO = sDCardBean;
            this.f54460iO = str;
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
            EBookManagerActivity.this.browToDir(this.XIi00iiXO, this.f54460iO);
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
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onDeviceFileDeleteError " + i + ", " + file);
            EBookManagerActivity.this.dismissLoadPopup();
            ToastUtils.showLong(i + HelpFormatter.DEFAULT_OPT_PREFIX + file.getName() + EBookManagerActivity.this.getString(R.string.failed_to_delete), new Object[0]);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onFinish() {
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onDeviceFileDeleteFinish");
            EBookManagerActivity.this.getMFiles().remove(this.XIi00iiXO);
            EBookManagerActivity.this.showList();
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onSuccess(FileStruct p0) {
            Intrinsics.X0O(p0, "p0");
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " -> onDeviceFileDelete " + p0);
        }
    }

    public static final class XO0O10 implements com.sma.smartv3.ui.device.XIi00iiXO.OXO1 {
        public XO0O10() {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0IIOi(int i, int i2) {
            EBookManagerActivity.this.refreshTaskPanel(i, i2);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0iXXO(int i) {
            EBookManagerActivity.this.getTaskPanel().setVisibility(8);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void IiI10X(int i) {
            EBookManagerActivity.this.refreshTaskPanel(i, 0);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void OIi0(int i, boolean z) {
            if (z) {
                EBookManagerActivity.this.getTaskPanel().setVisibility(8);
                EBookManagerActivity.this.getSDCardInfo();
            }
            i1O0OXO1O.OXO1.OXO1(EBookManagerActivity.this.TAG + " onFileTransferFinish");
            if (EBookManagerActivity.this.getMFiles().size() == 0) {
                FileBrowseManager.getInstance().removeFileObserver(EBookManagerActivity.this.mFileObserver);
                com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
                xIi00iiXO.XiOIO();
                Application application = EBookManagerActivity.this.getApplication();
                Intrinsics.O10IXXX0X(application, "getApplication(...)");
                xIi00iiXO.m38420OX(application);
                FileBrowseManager.getInstance().addFileObserver(EBookManagerActivity.this.mFileObserver);
                EBookManagerActivity.this.showLoadPopup(false);
                xIi00iiXO.X0O();
            } else if (EBookManagerActivity.this.getOnFileReceiverSize() > 30) {
                EBookManagerActivity eBookManagerActivity = EBookManagerActivity.this;
                eBookManagerActivity.loadMore(eBookManagerActivity.getMSDCardBean());
            } else {
                EBookManagerActivity eBookManagerActivity2 = EBookManagerActivity.this;
                eBookManagerActivity2.browToDir(eBookManagerActivity2.getMSDCardBean(), "music");
            }
            if (EBookManagerActivity.this.getCacheFile() != null) {
                File cacheFile = EBookManagerActivity.this.getCacheFile();
                if (cacheFile != null) {
                    cacheFile.delete();
                }
                EBookManagerActivity.this.setCacheFile(null);
            }
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XIi00iiXO(int i) {
            super.XIi00iiXO(i);
            if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
                EBookManagerActivity.this.dismissLoadPopup();
            }
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XO0O10(int i, int i2, String msg) {
            Intrinsics.X0O(msg, "msg");
            EBookManagerActivity.this.getTvCancel().setVisibility(8);
            EBookManagerActivity.this.getTvRetry().setVisibility(0);
            EBookManagerActivity.this.getTvProgressTip().setText(R.string.ebook_transfer_task_failed_tip);
            EBookManagerActivity.this.getPbProgress().setProgress(0);
            ToastUtils.showLong(com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.OII().get(i).IiI10X() + "\n" + i2 + CertificateUtil.DELIMITER + msg, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.EBookManagerActivity$iO */
    public static final class C18697iO implements BleHandleCallback {
        public C18697iO() {
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
            EBookManagerActivity.this.showFreeSpace();
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
            EBookManagerActivity.this.showFreeSpace();
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

    private final void add() {
        if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
            doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1I1iiOii
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return EBookManagerActivity.add$lambda$0(this.f7575IO);
                }
            });
        } else {
            showErrorPop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit add$lambda$0(EBookManagerActivity eBookManagerActivity) {
        eBookManagerActivity.pickFile();
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

    private final Uri copyCacheFile(Uri uri) throws IOException {
        String absolutePath = uz0.IiI10X(sz0.OXO1).getAbsolutePath();
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(absolutePath + "/utf_8.txt");
        file2.createNewFile();
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenInputStream, getFileCharsetSimple(uri));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2), "UTF-8");
        this.cacheFile = file2;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            bufferedWriter.write(((Object) line) + "\n");
        }
        bufferedWriter.flush();
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        bufferedWriter.close();
        bufferedReader.close();
        Uri uriFile2Uri = UriUtils.file2Uri(file2);
        Intrinsics.O10IXXX0X(uriFile2Uri, "file2Uri(...)");
        return uriFile2Uri;
    }

    private final void deleteFile(int i) {
        FileBrowseManager fileBrowseManager = FileBrowseManager.getInstance();
        SDCardBean sDCardBean = this.mSDCardBean;
        List<FileStruct> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(this.mFiles.get(i));
        SDCardBean sDCardBean2 = this.mSDCardBean;
        Integer numValueOf = sDCardBean2 != null ? Integer.valueOf(sDCardBean2.getType()) : null;
        Intrinsics.XXI(numValueOf);
        fileBrowseManager.deleteFile(sDCardBean, listIi1iii0, numValueOf.intValue() > 1, new XIi00iiXO(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissLoadPopup() {
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    private final boolean doTransfer(Function0<Unit> function0) {
        if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.X01IiOiIi()) {
            ToastUtils.showLong(getString(R.string.transfering), new Object[0]);
            return false;
        }
        function0.invoke2();
        return true;
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

    private final XO0O10 getMDeviceFileCallback() {
        return (XO0O10) this.mDeviceFileCallback$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressBar getPbProgress() {
        return (ProgressBar) this.pbProgress$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSDCardInfo() {
        if (q62.OXO1.XI1O1111i()) {
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.SDCARD_INFO, BleKeyFlag.READ, null, false, false, 28, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getTaskPanel() {
        return (View) this.taskPanel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getTvCancel() {
        return (View) this.tvCancel$delegate.getValue();
    }

    private final TextView getTvFreeSpace() {
        return (TextView) this.tvFreeSpace$delegate.getValue();
    }

    private final TextView getTvName() {
        return (TextView) this.tvName$delegate.getValue();
    }

    private final TextView getTvProgress() {
        return (TextView) this.tvProgress$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvProgressTip() {
        return (TextView) this.tvProgressTip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getTvRetry() {
        return (View) this.tvRetry$delegate.getValue();
    }

    private final TextView getTvTotalProgress() {
        return (TextView) this.tvTotalProgress$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMore(SDCardBean sDCardBean) {
        int iLoadMore = FileBrowseManager.getInstance().loadMore(sDCardBean);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> loadMoreFile " + iLoadMore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XO0O10 mDeviceFileCallback_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return eBookManagerActivity.new XO0O10();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mHandler$lambda$0(EBookManagerActivity eBookManagerActivity, Message it) {
        Intrinsics.X0O(it, "it");
        if (it.what != eBookManagerActivity.loadTimeOut) {
            return false;
        }
        eBookManagerActivity.dismissLoadPopup();
        if (!com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
            eBookManagerActivity.showErrorPop();
        }
        i1O0OXO1O.OXO1.OXO1(eBookManagerActivity.TAG + " loadTimeOut retryFrequency=" + eBookManagerActivity.retryFrequency);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$0$1(EBookManagerActivity eBookManagerActivity) {
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.O001I();
        eBookManagerActivity.getTaskPanel().setVisibility(8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTitleLeftClick$lambda$0(EBookManagerActivity eBookManagerActivity) {
        eBookManagerActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressBar pbProgress_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return (ProgressBar) eBookManagerActivity.findViewById(R.id.pb_progress);
    }

    private final void pickFile() {
        Intent intent = new Intent();
        intent.setType("text/plain");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, iw0.O00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshTaskPanel(int i, int i2) {
        getTvProgressTip().setText(R.string.ebook_transfer_task_tip);
        getTvCancel().setVisibility(0);
        getTvRetry().setVisibility(8);
        getTaskPanel().setVisibility(0);
        TextView tvName = getTvName();
        com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
        tvName.setText(xIi00iiXO.OII().get(i).IiI10X());
        getTvTotalProgress().setText((i + 1) + "/" + xIi00iiXO.OII().size());
        getPbProgress().setProgress(i2);
        getTvProgress().setText(i2 + "%");
    }

    private final void showErrorPop() {
        go0 go0Var;
        if (this.mErrorPopup == null) {
            go0 go0Var2 = new go0(getMContext(), 0, 2, null);
            go0Var2.O1O(R.string.bt3_connect_error);
            go0Var2.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0XIiO10
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(EBookManagerActivity.showErrorPop$lambda$0$0());
                }
            });
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.IXO1I0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(EBookManagerActivity.showErrorPop$lambda$0$1(this.f2043IO));
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
    public static final boolean showErrorPop$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showErrorPop$lambda$0$1(EBookManagerActivity eBookManagerActivity) {
        showLoadPopup$default(eBookManagerActivity, false, 1, null);
        int i = eBookManagerActivity.retryFrequency + 1;
        eBookManagerActivity.retryFrequency = i;
        if (i > 2) {
            eBookManagerActivity.retryFrequency = 0;
            FileBrowseManager.getInstance().removeFileObserver(eBookManagerActivity.mFileObserver);
            com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
            xIi00iiXO.XiOIO();
            Application application = eBookManagerActivity.getApplication();
            Intrinsics.O10IXXX0X(application, "getApplication(...)");
            xIi00iiXO.m38420OX(application);
            FileBrowseManager.getInstance().addFileObserver(eBookManagerActivity.mFileObserver);
        }
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.X0O();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFreeSpace() {
        getTvFreeSpace().setVisibility(q62.OXO1.XI1O1111i() ? 0 : 8);
        getTvFreeSpace().setText(getString(R.string.watch_free_space, cp5.iiIOiX((BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null), false, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showList() {
        i1O0OXO1O.OXO1.OXO1("showList -> size:" + this.mFiles.size() + ", " + this.mFiles);
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
            renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1iX00
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EBookManagerActivity.showList$lambda$0(this.f8053IO, (DslAdapter) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final EBookManagerActivity eBookManagerActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        eBookManagerActivity.findViewById(R.id.empty).setVisibility(8);
        eBookManagerActivity.getRecyclerView().setVisibility(0);
        for (final FileStruct fileStruct : eBookManagerActivity.mFiles) {
            DslAdapterExKt.O10IXXX0X(eBookManagerActivity.getDslAdapter(), R.layout.item_music, new Function1() { // from class: com.android.mltcode.paycertificationapi.XX11i0III
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EBookManagerActivity.showList$lambda$0$0(fileStruct, eBookManagerActivity, (DslAdapterItem) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final FileStruct fileStruct, final EBookManagerActivity eBookManagerActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.OIiXI1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EBookManagerActivity.showList$lambda$0$0$0(fileStruct, eBookManagerActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(FileStruct fileStruct, final EBookManagerActivity eBookManagerActivity, DslViewHolder itemHolder, final int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(fileStruct.getName());
        }
        ImageView imageViewImg = itemHolder.img(R.id.btn_delete);
        if (imageViewImg != null) {
            imageViewImg.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1O10i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EBookManagerActivity.showList$lambda$0$0$0$0(this.f4287IO, i, view);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$0(final EBookManagerActivity eBookManagerActivity, final int i, View view) {
        eBookManagerActivity.doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI101i0i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return EBookManagerActivity.showList$lambda$0$0$0$0$0(this.f2901IO, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0$0$0(final EBookManagerActivity eBookManagerActivity, final int i) {
        go0 go0Var = new go0(eBookManagerActivity.getMContext(), 0, 2, null);
        go0Var.O1O(R.string.weather_del_file);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.IXX110XI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(EBookManagerActivity.showList$lambda$0$0$0$0$0$0$0());
            }
        });
        go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOO1I1I
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(EBookManagerActivity.showList$lambda$0$0$0$0$0$0$1(this.f8104IO, i));
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
    public static final boolean showList$lambda$0$0$0$0$0$0$1(EBookManagerActivity eBookManagerActivity, int i) {
        eBookManagerActivity.showLoadPopup(false);
        eBookManagerActivity.deleteFile(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public static /* synthetic */ void showLoadPopup$default(EBookManagerActivity eBookManagerActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        eBookManagerActivity.showLoadPopup(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View taskPanel_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return eBookManagerActivity.findViewById(R.id.task_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvCancel_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return eBookManagerActivity.findViewById(R.id.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvFreeSpace_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return (TextView) eBookManagerActivity.findViewById(R.id.tv_free_space);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvName_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return (TextView) eBookManagerActivity.findViewById(R.id.tv_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvProgressTip_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return (TextView) eBookManagerActivity.findViewById(R.id.tv_progress_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvProgress_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return (TextView) eBookManagerActivity.findViewById(R.id.tv_progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvRetry_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return eBookManagerActivity.findViewById(R.id.tv_retry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTotalProgress_delegate$lambda$0(EBookManagerActivity eBookManagerActivity) {
        return (TextView) eBookManagerActivity.findViewById(R.id.tv_total_progress);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @tb1
    public final File getCacheFile() {
        return this.cacheFile;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[Catch: IOException -> 0x004c, TRY_LEAVE, TryCatch #8 {IOException -> 0x004c, blocks: (B:27:0x0048, B:31:0x0050), top: B:60:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0065 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0075 A[Catch: IOException -> 0x0071, TRY_LEAVE, TryCatch #3 {IOException -> 0x0071, blocks: (B:44:0x006d, B:48:0x0075), top: B:54:0x006d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    @aa1
    public final String getFileCharsetSimple(@aa1 Uri sourcePath) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IOException e;
        int i;
        Intrinsics.X0O(sourcePath, "sourcePath");
        try {
            try {
                sourcePath = getContentResolver().openInputStream(sourcePath);
                try {
                    bufferedInputStream = new BufferedInputStream(sourcePath);
                    try {
                        i = (bufferedInputStream.read() << 8) + bufferedInputStream.read();
                        try {
                            bufferedInputStream.close();
                            if (sourcePath != 0) {
                                sourcePath.close();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                if (sourcePath != 0) {
                                    sourcePath.close();
                                }
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                i = 0;
                                sourcePath = 65279;
                                if (i != 65279) {
                                    return "UTF-16BE";
                                }
                                if (i != 65534) {
                                    return "GBK";
                                }
                                return "Unicode";
                            }
                        } else if (sourcePath != 0) {
                            sourcePath.close();
                        }
                        i = 0;
                    }
                } catch (IOException e5) {
                    bufferedInputStream = null;
                    e = e5;
                } catch (Throwable th2) {
                    bufferedInputStream = null;
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                            if (sourcePath != 0) {
                                sourcePath.close();
                            }
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    } else if (sourcePath != 0) {
                        sourcePath.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e7) {
            bufferedInputStream = null;
            e = e7;
            sourcePath = 0;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            sourcePath = 0;
        }
        sourcePath = 65279;
        if (i != 65279) {
            return "UTF-16BE";
        }
        if (i != 65534) {
            return "GBK";
        }
        return "Unicode";
    }

    @aa1
    public final List<FileStruct> getMFiles() {
        return this.mFiles;
    }

    @tb1
    public final SDCardBean getMSDCardBean() {
        return this.mSDCardBean;
    }

    public final int getOnFileReceiverSize() {
        return this.onFileReceiverSize;
    }

    public final int getRetryFrequency() {
        return this.retryFrequency;
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
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I1OiXXXi
            @Override // java.lang.Runnable
            public final void run() {
                EBookManagerActivity.showLoadPopup$default(this.f1433IO, false, 1, null);
            }
        }, 600L);
        xIi00iiXO.X0O();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.ebook_manager);
        getSDCardInfo();
        showFreeSpace();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ebook_manager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v21, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 990) {
            Uri data = intent != null ? intent.getData() : null;
            ContentResolver contentResolver = getContentResolver();
            Intrinsics.XXI(data);
            Cursor cursorQuery = contentResolver.query(data, null, null, null, null);
            if (cursorQuery != null) {
                cursorQuery.moveToFirst();
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = cursorQuery != null ? cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")) : 0;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            T t = objectRef.element;
            Intrinsics.XXI(t);
            if (((String) t).length() < 4) {
                objectRef.element = "watch_" + objectRef.element;
            }
            if (((String) objectRef.element).length() > 50) {
                String strSubstring = ((String) objectRef.element).substring(0, 50);
                Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                objectRef.element = strSubstring + ".txt";
            }
            if (FileUtils.isUtf8(UriUtils.uri2File(data))) {
                com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
                String string = data.toString();
                String string2 = data.toString();
                Object obj = objectRef.element;
                Intrinsics.XXI(obj);
                xIi00iiXO.X1IX(new bz5(string, string2, "ebook" + obj));
                xIi00iiXO.iIXi1iiXI(this.mSDCardBean);
                return;
            }
            Uri uriCopyCacheFile = copyCacheFile(data);
            com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO2 = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
            String string3 = uriCopyCacheFile.toString();
            String string4 = uriCopyCacheFile.toString();
            Object obj2 = objectRef.element;
            Intrinsics.XXI(obj2);
            xIi00iiXO2.X1IX(new bz5(string3, string4, "ebook" + obj2));
            xIi00iiXO2.iIXi1iiXI(this.mSDCardBean);
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        add();
    }

    public final void onCancel(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        go0 go0Var = new go0(getMContext(), 0, 2, null);
        go0Var.O1O(R.string.cancel_ebook_task_tip);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.XXO1i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(EBookManagerActivity.onCancel$lambda$0$0());
            }
        });
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.X1OiO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(EBookManagerActivity.onCancel$lambda$0$1(this.f4322IO));
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
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0XiXI1i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Unit.OXO1;
            }
        })) {
            super.onHandleBackPressed();
        }
    }

    public final void onRetry(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.O1O();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiIX00X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return EBookManagerActivity.onTitleLeftClick$lambda$0(this.f3718IO);
            }
        });
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setCacheFile(@tb1 File file) {
        this.cacheFile = file;
    }

    public final void setMSDCardBean(@tb1 SDCardBean sDCardBean) {
        this.mSDCardBean = sDCardBean;
    }

    public final void setOnFileReceiverSize(int i) {
        this.onFileReceiverSize = i;
    }

    public final void setRetryFrequency(int i) {
        this.retryFrequency = i;
    }
}
