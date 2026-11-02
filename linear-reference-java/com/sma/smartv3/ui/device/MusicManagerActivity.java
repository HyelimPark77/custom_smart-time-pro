package com.sma.smartv3.ui.device;

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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ax0;
import com.android.mltcode.paycertificationapi.bx0;
import com.android.mltcode.paycertificationapi.bz5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cx0;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.dx0;
import com.android.mltcode.paycertificationapi.ex0;
import com.android.mltcode.paycertificationapi.fx0;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gx0;
import com.android.mltcode.paycertificationapi.hx0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iw0;
import com.android.mltcode.paycertificationapi.jx0;
import com.android.mltcode.paycertificationapi.kw0;
import com.android.mltcode.paycertificationapi.kx0;
import com.android.mltcode.paycertificationapi.lw0;
import com.android.mltcode.paycertificationapi.lx0;
import com.android.mltcode.paycertificationapi.mw0;
import com.android.mltcode.paycertificationapi.mx0;
import com.android.mltcode.paycertificationapi.nw0;
import com.android.mltcode.paycertificationapi.nx0;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.ow0;
import com.android.mltcode.paycertificationapi.pw0;
import com.android.mltcode.paycertificationapi.px0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qw0;
import com.android.mltcode.paycertificationapi.rw0;
import com.android.mltcode.paycertificationapi.sw0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tw0;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uw0;
import com.android.mltcode.paycertificationapi.vw0;
import com.android.mltcode.paycertificationapi.ww0;
import com.android.mltcode.paycertificationapi.xw0;
import com.android.mltcode.paycertificationapi.yw0;
import com.android.mltcode.paycertificationapi.zw0;
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
import com.ironsource.V2;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_filebrowse.interfaces.SimpleFileObserver;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.musicpicker.MusicPicker;
import com.sma.smartv3.ui.musicpicker.MusicResult;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1563#2:671\n1634#2,3:672\n87#3,7:675\n94#3,3:683\n70#3,7:686\n97#3:693\n1#4:682\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n*L\n397#1:671\n397#1:672,3\n667#1:675,7\n667#1:683,3\n667#1:686,7\n667#1:693\n667#1:682\n*E\n"})
public class MusicManagerActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private int isTransferTip;
    private final int loadTimeOut;

    @aa1
    private iO mBleHandleCallback;

    @aa1
    private final Lazy mDeviceFileCallback$delegate;
    private int mDownSuccessSize;

    @tb1
    private go0 mErrorPopup;

    @aa1
    private final O00 mFileObserver;

    @aa1
    private final List<FileStruct> mFiles;

    @aa1
    private Handler mHandler;

    @tb1
    private uq mLoadingPopup;
    private int mMusicItemLayout;

    @tb1
    private SDCardBean mSDCardBean;

    @aa1
    private final Lazy pbProgress$delegate;
    private int retryFrequency;

    @aa1
    private final Lazy taskPanel$delegate;

    @aa1
    private final Lazy tvCancel$delegate;

    @aa1
    private final Lazy tvFreeSpace$delegate;

    @aa1
    private final Lazy tvName$delegate;

    @aa1
    private final Lazy tvProgress$delegate;

    @aa1
    private final Lazy tvProgressTip$delegate;

    @aa1
    private final Lazy tvRetry$delegate;

    @aa1
    private final Lazy tvTotalProgress$delegate;

    @SourceDebugExtension({"SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n774#2:671\n865#2,2:672\n1#3:674\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n*L\n207#1:671\n207#1:672,2\n*E\n"})
    public static final class O00 implements FileObserver {
        public final /* synthetic */ MusicManagerActivity OXO1;

        public O00(MusicManagerActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean r4) {
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> OnFlayCallback " + r4);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int r4) {
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onFileReadFailed " + r4);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onFileReadStart");
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean r6) {
            Folder r0 = FileBrowseManager.getInstance().getCurrentReadFile(this.OXO1.getMSDCardBean());
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onFileReadStop " + r6 + " " + r0.getName());
            if (r6 == true) goto L7;
            MusicManagerActivity r7 = this.OXO1;
            MusicManagerActivity.access$loadMore(r7, r7.getMSDCardBean());
            return;
        L7:
            if (oe5.OX0X1O10X(r0.getName(), "music", true) == false) goto L15;
            MusicManagerActivity.access$showList(this.OXO1);     // Catch: Exception -> L10
            return;
        L10:
            e = move-exception;
            e.printStackTrace();
            return;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> r9) {
            Intrinsics.X0O(r9, "fileStructs");
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onFileReceiver size:" + r9.size() + ", " + r9);
            List<FileStruct> r0 = this.OXO1.getMFiles();
            ArrayList r1 = new ArrayList();
            Iterator<T> r10 = r9.iterator();
        L4:
            if (r10.hasNext() == false) goto L10;
            Object r2 = r10.next();
            FileStruct r3 = (FileStruct) r2;
            String r4 = r3.getName();
            Intrinsics.O10IXXX0X(r4, "getName(...)");
            if (StringsKt__StringsKt.iOiXX(r4, ".tmp", true) == true) goto L4;
            String r5 = r3.getName();
            Intrinsics.O10IXXX0X(r5, "getName(...)");
            if (StringsKt__StringsKt.iOiXX(r5, ".txt", true) == true) goto L4;
            r1.add(r2);
            goto L4
        L10:
            r0.addAll(r1);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> r4) {
            Intrinsics.X0O(r4, "list");
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onSdCardStatusChange " + r4);
            MusicManagerActivity r0 = this.OXO1;
            Iterator<T> r5 = r4.iterator();
        L4:
            if (r5.hasNext() == false) goto L8;
            Object r1 = r5.next();
            if (((SDCardBean) r1).isOnline() == false) goto L4;
        L9:
            r0.setMSDCardBean((SDCardBean) r1);
            this.OXO1.getMFiles().clear();
            MusicManagerActivity r6 = this.OXO1;
            MusicManagerActivity.access$getCurrentInfo(r6, r6.getMSDCardBean());
            return;
        L8:
            r1 = null;
            goto L9
        }
    }

    public static final class OXO1 extends SimpleFileObserver {
        public final /* synthetic */ MusicManagerActivity OXO1;
        public final /* synthetic */ SDCardBean XIi00iiXO;
        public final /* synthetic */ String iO;

        public OXO1(MusicManagerActivity r1, SDCardBean r2, String r3) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int r1) {
            super.onFileReadFailed(r1);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean r3) {
            super.onFileReadStop(r3);
            FileBrowseManager.getInstance().removeFileObserver(this);
            MusicManagerActivity.access$browToDir(this.OXO1, this.XIi00iiXO, this.iO);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<? extends SDCardBean> r2) {
            Intrinsics.X0O(r2, "onLineCards");
            super.onSdCardStatusChange(r2);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }
    }

    public static final class XIi00iiXO implements DeleteCallback {
        public final /* synthetic */ MusicManagerActivity OXO1;
        public final /* synthetic */ int XIi00iiXO;

        public XIi00iiXO(MusicManagerActivity r1, int r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onError(int r4, FileStruct r5) {
            Intrinsics.X0O(r5, "file");
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onDeviceFileDeleteError " + r4 + ", " + r5);
            this.OXO1.dismissLoadPopup();
            ToastUtils.showLong(r4 + HelpFormatter.DEFAULT_OPT_PREFIX + r5.getName() + this.OXO1.getString(R.string.failed_to_delete), new Object[0]);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onFinish() {
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onDeviceFileDeleteFinish");
            this.OXO1.getMFiles().remove(this.XIi00iiXO);
            MusicManagerActivity.access$showList(this.OXO1);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onSuccess(FileStruct r4) {
            Intrinsics.X0O(r4, "p0");
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " -> onDeviceFileDelete " + r4);
        }
    }

    public static final class XO0O10 implements com.sma.smartv3.ui.device.XIi00iiXO.OXO1 {
        public final /* synthetic */ MusicManagerActivity OXO1;

        public XO0O10(MusicManagerActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0IIOi(int r2, int r3) {
            MusicManagerActivity.access$refreshTaskPanel(this.OXO1, r2, r3);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0iXXO(int r2) {
            this.OXO1.getTaskPanel().setVisibility(8);
            this.OXO1.onMusicFileTransferStop();
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void IiI10X(int r3) {
            MusicManagerActivity.access$refreshTaskPanel(this.OXO1, r3, 0);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void OIi0(int r2, boolean r3) {
            if (r3 == false) goto L4;
            this.OXO1.getTaskPanel().setVisibility(8);
            this.OXO1.onMusicFileTransferStop();
            MusicManagerActivity.access$getSDCardInfo(this.OXO1);
        L4:
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getTAG() + " onFileTransferFinish");
            this.OXO1.getDeviceFileList();
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XIi00iiXO(int r1) {
            super.XIi00iiXO(r1);
            if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.I1() == false) goto L5;
            this.OXO1.dismissLoadPopup();
        L5:
            MusicManagerActivity.access$getSDCardInfo(this.OXO1);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XO0O10(int r4, int r5, String r6) {
            Intrinsics.X0O(r6, "msg");
            this.OXO1.getTvCancel().setVisibility(8);
            this.OXO1.getTvRetry().setVisibility(0);
            this.OXO1.getTvProgressTip().setText(R.string.music_transfer_task_failed_tip);
            this.OXO1.getPbProgress().setProgress(0);
            ToastUtils.showLong(com.sma.smartv3.ui.device.XIi00iiXO.OXO1.OII().get(r4).IiI10X() + "\n" + r5 + CertificateUtil.DELIMITER + r6, new Object[0]);
        }
    }

    public static final class iO implements BleHandleCallback {
        public final /* synthetic */ MusicManagerActivity IO;

        public iO(MusicManagerActivity r1) {
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
        public void onReadSDCardInfo(BleSDCardInfo r2) {
            Intrinsics.X0O(r2, "sdCardInfo");
            this.IO.showFreeSpace();
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
            this.IO.showFreeSpace();
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

    public MusicManagerActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new kx0(this));
        this.tvTotalProgress$delegate = LazyKt__LazyJVMKt.iO(new nx0(this));
        this.tvName$delegate = LazyKt__LazyJVMKt.iO(new px0(this));
        this.tvProgress$delegate = LazyKt__LazyJVMKt.iO(new lw0(this));
        this.tvProgressTip$delegate = LazyKt__LazyJVMKt.iO(new mw0(this));
        this.pbProgress$delegate = LazyKt__LazyJVMKt.iO(new nw0(this));
        this.taskPanel$delegate = LazyKt__LazyJVMKt.iO(new ow0(this));
        this.tvCancel$delegate = LazyKt__LazyJVMKt.iO(new pw0(this));
        this.tvRetry$delegate = LazyKt__LazyJVMKt.iO(new qw0(this));
        this.tvFreeSpace$delegate = LazyKt__LazyJVMKt.iO(new rw0(this));
        this.mMusicItemLayout = R.layout.item_music;
        this.TAG = "MusicManagerActivity";
        this.isTransferTip = R.string.transfering;
        this.loadTimeOut = 255;
        this.mHandler = new Handler(Looper.getMainLooper(), new lx0(this));
        this.mFiles = new ArrayList();
        this.mDeviceFileCallback$delegate = LazyKt__LazyJVMKt.iO(new mx0(this));
        this.mFileObserver = new O00(this);
        this.mBleHandleCallback = new iO(this);
    }

    public static /* synthetic */ void I0iXXO(MusicManagerActivity r0) {
        getDeviceFileList$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1(MusicManagerActivity r0, int r1) {
        return showList$lambda$0$0$0$0$0$0$1(r0, r1);
    }

    public static /* synthetic */ boolean I1XOi1() {
        return showList$lambda$0$0$0$0$0$0$0();
    }

    public static /* synthetic */ Unit II1Xi0(MusicManagerActivity r0, DslAdapter r1) {
        return showList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(MusicManagerActivity r0, int r1) {
        return showList$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean IXXOO(MusicManagerActivity r0, Message r1) {
        return mHandler$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean O10IXXX0X(MusicManagerActivity r0) {
        return showErrorPop$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit O1O(MusicManagerActivity r0) {
        return onTitleLeftClick$lambda$0(r0);
    }

    public static /* synthetic */ boolean OII(MusicManagerActivity r0) {
        return showErrorPop$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean OX(MusicManagerActivity r0) {
        return onCancel$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(MusicManagerActivity r0) {
        return add$lambda$0(r0);
    }

    public static /* synthetic */ View X01IiOiIi(MusicManagerActivity r0) {
        return taskPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0O(FileStruct r0, MusicManagerActivity r1, DslAdapterItem r2) {
        return showList$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean X0i1O() {
        return onCancel$lambda$0$0();
    }

    public static /* synthetic */ void X11iII1O1(MusicManagerActivity r0, int r1, View r2) {
        showList$lambda$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView X1IX(MusicManagerActivity r0) {
        return tvFreeSpace_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(MusicManagerActivity r0, PermissionStatus r1) {
        return onBottomClick$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageView XX0(MusicManagerActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(MusicManagerActivity r0) {
        return tvTotalProgress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ XO0O10 XXIIO1i11(MusicManagerActivity r0) {
        return mDeviceFileCallback_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXX11i(MusicManagerActivity r0) {
        init$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(MusicManagerActivity r0, PermissionStatus r1) {
        return onBottomClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ ProgressBar XiOIii1(MusicManagerActivity r0) {
        return pbProgress_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(MusicManagerActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$browToDir(MusicManagerActivity r0, SDCardBean r1, String r2) {
        r0.browToDir(r1, r2);
    }

    public static final /* synthetic */ void access$getCurrentInfo(MusicManagerActivity r0, SDCardBean r1) {
        r0.getCurrentInfo(r1);
    }

    public static final /* synthetic */ void access$getSDCardInfo(MusicManagerActivity r0) {
        r0.getSDCardInfo();
    }

    public static final /* synthetic */ void access$loadMore(MusicManagerActivity r0, SDCardBean r1) {
        r0.loadMore(r1);
    }

    public static final /* synthetic */ void access$refreshTaskPanel(MusicManagerActivity r0, int r1, int r2) {
        r0.refreshTaskPanel(r1, r2);
    }

    public static final /* synthetic */ void access$showList(MusicManagerActivity r0) {
        r0.showList();
    }

    private final void add() {
        if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.I1() == true) goto L6;
        showErrorPop();
        return;
    L6:
        doTransfer(new dx0(this));
    }

    private static final Unit add$lambda$0(MusicManagerActivity r0) {
        r0.pickFile();
        return Unit.OXO1;
    }

    private final void append(SDCardBean r3, FileStruct r4) {
        int r5 = FileBrowseManager.getInstance().appenBrowse(r4, r3);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> appendToDir " + r5);
        if (r5 == 0) goto L5;
        return;
    L5:
        this.mFiles.clear();
    }

    private final void browToDir(SDCardBean r7, String r8) {
        Folder r0 = FileBrowseManager.getInstance().getCurrentReadFile(r7);
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.getParent() == null) goto L8;
        FileBrowseManager.getInstance().backBrowse(r7, false);
        r0 = FileBrowseManager.getInstance().getCurrentReadFile(r7);
        Intrinsics.O10IXXX0X(r0, "getCurrentReadFile(...)");
        goto L6
    L8:
        List<FileStruct> r1 = r0.getChildFileStructs();
        Intrinsics.O10IXXX0X(r1, "getChildFileStructs(...)");
        Iterator<T> r2 = r1.iterator();
    L10:
        if (r2.hasNext() == false) goto L16;
        Object r3 = r2.next();
        FileStruct r4 = (FileStruct) r3;
        if (r4.isFile() == true) goto L10;
        if (oe5.OX0X1O10X(r4.getName(), r8, true) == false) goto L10;
    L17:
        FileStruct r5 = (FileStruct) r3;
        if (r5 == null) goto L22;
        append(r7, r5);
        return;
    L22:
        if (r0.isLoadFinished(false) == true) goto L34;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> browseToDir add simpleFileObserver");
        OXO1 r6 = new OXO1(this, r7, r8);
        FileBrowseManager.getInstance().addFileObserver(r6);
        FileBrowseManager.getInstance().setPageSize(30);
        if (FileBrowseManager.getInstance().loadMore(r7) == 0) goto L35;
        FileBrowseManager.getInstance().removeFileObserver(r6);
        return;
    L35:
        return;
    L34:
        return;
    L16:
        r3 = null;
        goto L17
    }

    private final boolean canLoadMore(SDCardBean r2) {
        Folder r3 = FileBrowseManager.getInstance().getCurrentReadFile(r2);
        if (r3 != null) goto L5;
    L8:
        return false;
    L5:
        if (r3.isLoadFinished(false) == true) goto L8;
        return true;
    }

    private final void deleteFile(int r7) {
        boolean r1 = false;
        if (this.mFiles.size() != 0) goto L6;
        showList();
        dismissLoadPopup();
        ToastUtils.showLong(getString(R.string.failed_to_delete), new Object[0]);
        return;
    L6:
        FileBrowseManager r0 = FileBrowseManager.getInstance();
        SDCardBean r2 = this.mSDCardBean;
        List<FileStruct> r4 = CollectionsKt__CollectionsKt.Ii1iii0(new FileStruct[]{this.mFiles.get(r7)});
        SDCardBean r5 = this.mSDCardBean;
        if (r5 == null) goto L9;
        Integer r6 = Integer.valueOf(r5.getType());
    L10:
        Intrinsics.XXI(r6);
        if (r6.intValue() <= 1) goto L13;
        r1 = true;
    L13:
        r0.deleteFile(r2, r4, r1, new XIi00iiXO(this, r7));
        return;
    L9:
        r6 = null;
        goto L10
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final void getCurrentInfo(SDCardBean r6) {
        Folder r0 = FileBrowseManager.getInstance().getCurrentReadFile(r6);
        if (r0 != null) goto L5;
        return;
    L5:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> getCurrentInfo folder " + r0.getName());
        if (oe5.OX0X1O10X(r0.getName(), "music", true) == true) goto L8;
    L17:
        browToDir(r6, "music");
        return;
    L8:
        if (r0.getLevel() != 1) goto L17;
        if (r0.isLoadFinished(false) == false) goto L12;
    L15:
        r0.isLoadFinished(false);
        return;
    L12:
        if (r0.getChildFileStructs().size() >= 1) goto L15;
        loadMore(r6);
    }

    private static final void getDeviceFileList$lambda$0(MusicManagerActivity r1) {
        if (r1.mFiles.size() != 0) goto L6;
        r1.browToDirDeviceFile();
        return;
    L6:
        r1.loadMore(r1.mSDCardBean);
    }

    private final XO0O10 getMDeviceFileCallback() {
        return (XO0O10) getValue();
    }

    private final void getSDCardInfo() {
        if (q62.OXO1.XI1O1111i() == false) goto L6;
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.SDCARD_INFO, BleKeyFlag.READ, null, false, false, 28, null);
        return;
    }

    private final TextView getTvName() {
        return (TextView) getValue();
    }

    private final TextView getTvProgress() {
        return (TextView) getValue();
    }

    public static /* synthetic */ View i010I(MusicManagerActivity r0) {
        return tvRetry_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iI(FileStruct r0, MusicManagerActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showList$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ TextView iIiiO(MusicManagerActivity r0) {
        return tvProgressTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOO1ii1(MusicManagerActivity r0) {
        return tvProgress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOOX010X(MusicManagerActivity r0) {
        return tvCancel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iX() {
        return onHandleBackPressed$lambda$0();
    }

    public static /* synthetic */ TextView iX1O1(MusicManagerActivity r0) {
        return tvName_delegate$lambda$0(r0);
    }

    private static final void init$lambda$0(MusicManagerActivity r3) {
        showLoadPopup$default(r3, false, 1, null);
    }

    private final void loadMore(SDCardBean r4) {
        int r5 = FileBrowseManager.getInstance().loadMore(r4);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> loadMoreFile " + r5);
    }

    private static final XO0O10 mDeviceFileCallback_delegate$lambda$0(MusicManagerActivity r1) {
        return new XO0O10(r1);
    }

    private static final boolean mHandler$lambda$0(MusicManagerActivity r2, Message r3) {
        Intrinsics.X0O(r3, "it");
        if (r3.what != r2.loadTimeOut) goto L10;
        r2.dismissLoadPopup();
        if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.I1() == true) goto L7;
        r2.showErrorPop();
    L7:
        i1O0OXO1O.OXO1.OXO1(r2.TAG + " loadTimeOut retryFrequency=" + r2.retryFrequency);
        return false;
    L10:
        return false;
    }

    private static final Unit onBottomClick$lambda$0(MusicManagerActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.add();
    L6:
        return Unit.OXO1;
    }

    private static final Unit onBottomClick$lambda$1(MusicManagerActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.add();
    L6:
        return Unit.OXO1;
    }

    private static final boolean onCancel$lambda$0$0() {
        return true;
    }

    private static final boolean onCancel$lambda$0$1(MusicManagerActivity r2) {
        com.sma.smartv3.ui.device.XIi00iiXO.OXO1.O001I();
        r2.getTaskPanel().setVisibility(8);
        r2.onMusicFileTransferStop();
        return true;
    }

    private static final Unit onHandleBackPressed$lambda$0() {
        return Unit.OXO1;
    }

    private static final Unit onTitleLeftClick$lambda$0(MusicManagerActivity r0) {
        r0.finish();
        return Unit.OXO1;
    }

    private static final ProgressBar pbProgress_delegate$lambda$0(MusicManagerActivity r1) {
        return (ProgressBar) r1.findViewById(R.id.pb_progress);
    }

    private final void pickFile() {
        new MusicPicker.Builder(this).hideScrollbar(false).setMaxSelectCount(0).showTrack(true).searchIconColor(-1).setChoiceMode(0).bubbleTextColor(-1).setTitleText(getString(R.string.picker_music_title)).setLoadingType(1).showPickerForResult(iw0.O00);
    }

    public static /* synthetic */ void preventUse$default(MusicManagerActivity r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        r0.preventUse(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preventUse");
    }

    private final void refreshTaskPanel(int r4, int r5) {
        getTvProgressTip().setText(R.string.music_transfer_task_tip);
        getTvCancel().setVisibility(0);
        getTvRetry().setVisibility(8);
        com.sma.smartv3.ui.device.XIi00iiXO r0 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        if (r0.X01IiOiIi() == false) goto L5;
        getTaskPanel().setVisibility(0);
    L5:
        getTvName().setText(r0.OII().get(r4).IiI10X());
        getTvTotalProgress().setText((r4 + 1) + "/" + r0.OII().size());
        getPbProgress().setProgress(r5);
        getTvProgress().setText(r5 + "%");
    }

    private final void showErrorPop() {
        if (this.mErrorPopup != null) goto L5;
        int r4 = 0;
        go0 r0 = new go0(getMContext(), r4, 2, null);
        r0.O1O(R.string.bt3_connect_error);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new zw0(this));
        r0.X1IX(R.string.confirm, new ax0(this));
        this.mErrorPopup = r0;
    L5:
        go0 r1 = this.mErrorPopup;
        if (r1 != null) goto L8;
    L10:
        go0 r2 = this.mErrorPopup;
        if (r2 == null) goto L14;
        r2.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r1.isShowing() != true) goto L10;
    }

    private static final boolean showErrorPop$lambda$0$0(MusicManagerActivity r1) {
        r1.preventUse(true);
        return true;
    }

    private static final boolean showErrorPop$lambda$0$1(MusicManagerActivity r4) {
        showLoadPopup$default(r4, false, 1, null);
        int r0 = r4.retryFrequency + 1;
        r4.retryFrequency = r0;
        if (r0 <= 2) goto L5;
        r4.retryFrequency = 0;
        FileBrowseManager.getInstance().removeFileObserver(r4.mFileObserver);
        com.sma.smartv3.ui.device.XIi00iiXO r1 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        r1.XiOIO();
        Application r2 = r4.getApplication();
        Intrinsics.O10IXXX0X(r2, "getApplication(...)");
        r1.OX(r2);
        FileBrowseManager.getInstance().addFileObserver(r4.mFileObserver);
    L5:
        com.sma.smartv3.ui.device.XIi00iiXO.OXO1.X0O();
        return true;
    }

    private final void showList() {
        i1O0OXO1O.OXO1.OXO1("showList -> size:" + this.mFiles.size() + ", " + this.mFiles);
        preventUse(false);
        this.mHandler.removeMessages(this.loadTimeOut);
        dismissLoadPopup();
        go0 r1 = this.mErrorPopup;
        if (r1 == null) goto L6;
        r1.dismiss();
    L6:
        if (this.mFiles.isEmpty() == false) goto L9;
        getRecyclerView().setVisibility(4);
        findViewById(R.id.empty).setVisibility(0);
        return;
    L9:
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new bx0(this));
    }

    private static final Unit showList$lambda$0(final MusicManagerActivity r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        r4.findViewById(R.id.empty).setVisibility(8);
        r4.getRecyclerView().setVisibility(0);
        Iterator<FileStruct> r6 = r4.mFiles.iterator();
    L4:
        if (r6.hasNext() == false) goto L7;
        final FileStruct r0 = r6.next();
        DslAdapterExKt.O10IXXX0X(r4.getDslAdapter(), r4.mMusicItemLayout, new tw0(r0, r4));
        goto L4
    L7:
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(final FileStruct r1, final MusicManagerActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new sw0(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(FileStruct r1, final MusicManagerActivity r2, DslViewHolder r3, final int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "adapterItem");
        Intrinsics.X0O(r6, "<unused var>");
        TextView r7 = r3.tv(R.id.tv);
        if (r7 == null) goto L5;
        r7.setText(r1.getName());
    L5:
        ImageView r8 = r3.img(R.id.btn_delete);
        if (r8 == null) goto L9;
        r8.setOnClickListener(new uw0(r2, r4));
    L9:
        return Unit.OXO1;
    }

    private static final void showList$lambda$0$0$0$0(final MusicManagerActivity r0, final int r1, View r2) {
        r0.doTransfer(new cx0(r0, r1));
    }

    private static final Unit showList$lambda$0$0$0$0$0(final MusicManagerActivity r5, final int r6) {
        int r4 = 0;
        go0 r0 = new go0(r5.getMContext(), r4, 2, null);
        r0.O1O(R.string.delete_song);
        r0.iX(Integer.valueOf(R.string.delete_song_tip));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new vw0());
        r0.X1IX(R.string.delete, new gx0(r5, r6));
        r0.IIX1OXO();
        return Unit.OXO1;
    }

    private static final boolean showList$lambda$0$0$0$0$0$0$0() {
        return true;
    }

    private static final boolean showList$lambda$0$0$0$0$0$0$1(MusicManagerActivity r1, int r2) {
        r1.showLoadPopup(false);
        r1.deleteFile(r2);
        return true;
    }

    public static /* synthetic */ void showLoadPopup$default(MusicManagerActivity r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r0.showLoadPopup(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadPopup");
    }

    private static final View taskPanel_delegate$lambda$0(MusicManagerActivity r1) {
        return r1.findViewById(R.id.task_panel);
    }

    private static final View tvCancel_delegate$lambda$0(MusicManagerActivity r1) {
        return r1.findViewById(R.id.tv_cancel);
    }

    private static final TextView tvFreeSpace_delegate$lambda$0(MusicManagerActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_free_space);
    }

    private static final TextView tvName_delegate$lambda$0(MusicManagerActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_name);
    }

    private static final TextView tvProgressTip_delegate$lambda$0(MusicManagerActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_progress_tip);
    }

    private static final TextView tvProgress_delegate$lambda$0(MusicManagerActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_progress);
    }

    private static final View tvRetry_delegate$lambda$0(MusicManagerActivity r1) {
        return r1.findViewById(R.id.tv_retry);
    }

    private static final TextView tvTotalProgress_delegate$lambda$0(MusicManagerActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_total_progress);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final void browToDirDeviceFile() {
        if (this.mFiles.size() < 30) goto L6;
        loadMore(this.mSDCardBean);
        return;
    L6:
        browToDir(this.mSDCardBean, "music");
    }

    public final void dismissLoadPopup() {
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    public boolean doTransfer(@aa1 Function0<Unit> r3) {
        Intrinsics.X0O(r3, "action");
        if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.X01IiOiIi() == false) goto L6;
        ToastUtils.showLong(getString(this.isTransferTip), new Object[0]);
        return false;
    L6:
        r3.invoke();
        return true;
    }

    public void getDeviceFileList() {
        this.mHandler.postDelayed(new yw0(this), 300);
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
        return (ProgressBar) getValue();
    }

    public final int getRetryFrequency() {
        return this.retryFrequency;
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final View getTaskPanel() {
        return (View) getValue();
    }

    public final View getTvCancel() {
        return (View) getValue();
    }

    public final TextView getTvFreeSpace() {
        return (TextView) getValue();
    }

    public final TextView getTvProgressTip() {
        return (TextView) getValue();
    }

    public final View getTvRetry() {
        return (View) getValue();
    }

    public final TextView getTvTotalProgress() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        com.sma.smartv3.ui.device.XIi00iiXO r6 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        Application r0 = getApplication();
        Intrinsics.O10IXXX0X(r0, "getApplication(...)");
        r6.OX(r0);
        FileBrowseManager.getInstance().addFileObserver(this.mFileObserver);
        r6.O10IXXX0X(getMDeviceFileCallback());
        this.mHandler.postDelayed(new hx0(this), 600);
        r6.X0O();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BleInitializer.IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.music_manager);
        showRightIcon();
        showFreeSpace();
    }

    public final int isTransferTip() {
        return this.isTransferTip;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_music_manager;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r5, int r6, @tb1 Intent r7) {
        super.onActivityResult(r5, r6, r7);
        if (r6 == (-1)) goto L5;
        return;
    L5:
        if (r5 != 990) goto L20;
        com.sma.smartv3.ui.device.XIi00iiXO r8 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        ArrayList<MusicResult> r9 = MusicPicker.XIi00iiXO(r7);
        Intrinsics.O10IXXX0X(r9, "obtainResult(...)");
        ArrayList r10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r9, 10));
        Iterator<T> r11 = r9.iterator();
    L8:
        if (r11.hasNext() == false) goto L14;
        MusicResult r0 = (MusicResult) r11.next();
        if (r0.XXI().length() <= 50) goto L12;
        String r1 = r0.XXI();
        Intrinsics.O10IXXX0X(r1, "getTitle(...)");
        String r2 = r1.substring(0, 50);
        Intrinsics.O10IXXX0X(r2, "substring(...)");
        String r3 = r2 + ".mp3";
    L13:
        String r4 = r0.O10IXXX0X();
        String r12 = r0.X1ii();
        Intrinsics.XXI(r3);
        r10.add(new bz5(r4, r12, r3));
        goto L8
    L12:
        r3 = r0.XXI();
        goto L13
    L14:
        r8.X0i1O(r10);
        com.sma.smartv3.ui.device.XIi00iiXO.OXO1.iXiX011(this.mSDCardBean);
        onMusicFileTransferStart();
        return;
    }

    public final void onBottomClick(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        if (Build.VERSION.SDK_INT < 33) goto L6;
        PermissionUtils r2 = PermissionUtils.permission(new String[]{"android.permission.READ_MEDIA_AUDIO"});
        Intrinsics.O10IXXX0X(r2, "permission(...)");
        ds1.iO(r2, null, null, new ww0(this), 3, null);
        return;
    L6:
        PermissionUtils r3 = PermissionUtils.permission(new String[]{PermissionConstants.STORAGE});
        Intrinsics.O10IXXX0X(r3, "permission(...)");
        ds1.iO(r3, null, null, new xw0(this), 3, null);
    }

    public void onCancel(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        int r3 = 0;
        go0 r6 = new go0(getMContext(), r3, 2, null);
        r6.O1O(R.string.cancel_transfer);
        r6.iX(Integer.valueOf(R.string.cancel_transfer_music_tip));
        r6.IXXOO(1);
        r6.iX1O1(Integer.valueOf(R.string.cancel), new ex0());
        r6.X1IX(R.string.confirm, new fx0(this));
        r6.IIX1OXO();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        FileBrowseManager.getInstance().removeFileObserver(this.mFileObserver);
        com.sma.smartv3.ui.device.XIi00iiXO r0 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        r0.iOO1ii1(getMDeviceFileCallback());
        r0.XiOIO();
        BleInitializer.IO.i1iII1i1(false);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (doTransfer(new jx0()) == false) goto L6;
        super.onHandleBackPressed();
        return;
    }

    public void onMusicFileTransferStart() {
    }

    public void onMusicFileTransferStop() {
    }

    public final void onRetry(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        com.sma.smartv3.ui.device.XIi00iiXO.OXO1.O1O();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        doTransfer(new kw0(this));
    }

    public final void onTitleRightClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        Bundle r4 = new Bundle();
        r4.putString("mArg0", "https://api.iot-solution.net/web/help/help_music.html");
        r4.putInt("mArg1", 2);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, WebViewActivity.class);
        r0.putExtras(r4);
        startActivity(r0);
    }

    public void preventUse(boolean r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMDownSuccessSize(int r1) {
        this.mDownSuccessSize = r1;
    }

    public final void setMMusicItemLayout(int r1) {
        this.mMusicItemLayout = r1;
    }

    public final void setMSDCardBean(@tb1 SDCardBean r1) {
        this.mSDCardBean = r1;
    }

    public final void setRetryFrequency(int r1) {
        this.retryFrequency = r1;
    }

    public final void setTransferTip(int r1) {
        this.isTransferTip = r1;
    }

    public void showFreeSpace() {
        TextView r0 = getTvFreeSpace();
        if (q62.OXO1.XI1O1111i() == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        getTvFreeSpace().setText(getString(R.string.watch_free_space, new Object[]{cp5.iiIOiX((BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null), false, 2, null)}));
        return;
    L5:
        r1 = 8;
        goto L6
    }

    public final void showLoadPopup(boolean r4) {
        if (this.mLoadingPopup != null) goto L5;
        this.mLoadingPopup = new uq(this);
    L5:
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L10;
        if (r4 == false) goto L9;
        r0.X01IiOiIi(R.string.music_transfer_load_title);
        r0.I1(Integer.valueOf(R.string.music_transfer_load_tip));
        this.mHandler.sendEmptyMessageDelayed(this.loadTimeOut, V2.h);
        goto L10
    L9:
        r0.X01IiOiIi(0);
        r0.I1(null);
    L10:
        uq r5 = this.mLoadingPopup;
        if (r5 == null) goto L14;
        r5.IIX1OXO();
        return;
    }

    public final void showRightIcon() {
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.understand_situation_icon2);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    }
}
