package com.sma.smartv3.ui.device.watchface;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXI011X11;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OOX1XIiOI;
import com.android.mltcode.paycertificationapi.X1XX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ap6;
import com.android.mltcode.paycertificationapi.az1;
import com.android.mltcode.paycertificationapi.bp6;
import com.android.mltcode.paycertificationapi.c6;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.cp6;
import com.android.mltcode.paycertificationapi.dp6;
import com.android.mltcode.paycertificationapi.ep6;
import com.android.mltcode.paycertificationapi.fp6;
import com.android.mltcode.paycertificationapi.gp6;
import com.android.mltcode.paycertificationapi.hp6;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ip6;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.jp6;
import com.android.mltcode.paycertificationapi.kp6;
import com.android.mltcode.paycertificationapi.lp6;
import com.android.mltcode.paycertificationapi.mp6;
import com.android.mltcode.paycertificationapi.np6;
import com.android.mltcode.paycertificationapi.op6;
import com.android.mltcode.paycertificationapi.pp6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qp6;
import com.android.mltcode.paycertificationapi.rp6;
import com.android.mltcode.paycertificationapi.sp6;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tp6;
import com.android.mltcode.paycertificationapi.up6;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vp6;
import com.android.mltcode.paycertificationapi.wp6;
import com.android.mltcode.paycertificationapi.xp6;
import com.android.mltcode.paycertificationapi.xz3;
import com.android.mltcode.paycertificationapi.yo6;
import com.android.mltcode.paycertificationapi.yp6;
import com.android.mltcode.paycertificationapi.zo6;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.C2985d4;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.model.ResourcesIdInfoKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.watchface.fragment.ControlElementFragment;
import com.sma.smartv3.ui.device.watchface.fragment.PointerElementFragment;
import com.sma.smartv3.ui.device.watchface.fragment.TimeElementFragment;
import com.sma.smartv3.ui.trim.VideoTrimmerActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.NoScollViewPager;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWatchFaceVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,794:1\n255#2:795\n*S KotlinDebug\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity\n*L\n539#1:795\n*E\n"})
public final class WatchFaceVideoActivity extends BaseActivity {
    private final int REQUEST_RECORD_VIDEO;
    private final int REQUEST_SELECT_VIDEO;

    @aa1
    private final String TAG;
    private final float WATCHFACEVIEW_HEIGHT;

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private ControlElementFragment controlElementFragment;

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

    @aa1
    private final Lazy etFrameEdit$delegate;

    @aa1
    private final String is2DAcceleration;

    @aa1
    private final Lazy ivFrameAdd$delegate;

    @aa1
    private final Lazy ivFrameReduce$delegate;
    private int mBackgroundImageIndex;

    @aa1
    private final List<String> mBgFiles;

    @aa1
    private final XOO0ii0 mBleHandleCallback;
    private byte[] mCurSendBytes;
    private int mCurSyncDevicePosition;
    private int mCurSyncDialId;
    private X1XX1O mCustomWatchFace;
    private int mDefaultFrameCount;

    @aa1
    private final List<Integer> mDialIds;
    private BaseFragmentPagerAdapter mFragmentPagerAdapter;

    @aa1
    private final Handler mHandler;

    @aa1
    private final I0IIOi mImageSwitchRunnable;
    private int mMaxFrameCount;
    private int mPlayInterval;

    @tb1
    private c72 mProgressPop;

    @tb1
    private xz3 mSelectAvatarPopup;
    private int mTotalCount;

    @aa1
    private final Lazy mViewPager$delegate;

    @aa1
    private final String paramName;
    private PointerElementFragment pointerElementFragment;

    @aa1
    private final Lazy table$delegate;

    @aa1
    private final Lazy timeDigitalView$delegate;
    private TimeElementFragment timeElementFragment;

    @aa1
    private final Lazy timePointView$delegate;

    @aa1
    private final Lazy timeScaleView$delegate;

    @aa1
    private final Lazy tvMaxCount$delegate;

    @aa1
    private final Lazy watchfaceView$delegate;

    public static final class I0IIOi implements Runnable {
        public final /* synthetic */ WatchFaceVideoActivity IO;

        public I0IIOi(WatchFaceVideoActivity r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WatchFaceVideoActivity.access$getMBgFiles$p(this.IO).isEmpty() == true) goto L8;
            Bitmap r0 = ImageUtils.getBitmap((String) WatchFaceVideoActivity.access$getMBgFiles$p(this.IO).get(WatchFaceVideoActivity.access$getMBackgroundImageIndex$p(this.IO)));     // Catch: Exception -> L10
            X1XX1O r1 = WatchFaceVideoActivity.access$getMCustomWatchFace$p(this.IO);     // Catch: Exception -> L10
            if (r1 != null) goto L7;
            Intrinsics.XXO("mCustomWatchFace");     // Catch: Exception -> L10
            r1 = null;
        L7:
            Intrinsics.XXI(r0);     // Catch: Exception -> L10
            r1.I00(r0);     // Catch: Exception -> L10
            WatchFaceVideoActivity r2 = this.IO;     // Catch: Exception -> L10
            WatchFaceVideoActivity.access$setMBackgroundImageIndex$p(r2, (WatchFaceVideoActivity.access$getMBackgroundImageIndex$p(r2) + 1) % WatchFaceVideoActivity.access$getMBgFiles$p(this.IO).size());     // Catch: Exception -> L10
        L8:
            WatchFaceVideoActivity.access$getMHandler$p(this.IO).postDelayed(this, WatchFaceVideoActivity.access$getMPlayInterval$p(this.IO));
        }
    }

    public static final class IiI10X extends X1XX1O {
        public final /* synthetic */ WatchFaceVideoActivity iXi;

        public IiI10X(WatchFaceVideoActivity r1, Application r2) {
            this.iXi = r1;
            Intrinsics.XXI(r2);
            super(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.X1XX1O
        public void IOi1O0() {
            View r0 = this.iXi.findViewById(R.id.root_view);
            Intrinsics.O10IXXX0X(r0, "findViewById(...)");
            XOOXII(r0);
            View r1 = Ii0i().findViewById(R.id.customizeDialBg);
            Intrinsics.O10IXXX0X(r1, "findViewById(...)");
            i1O11001((ImageView) r1);
            View r2 = Ii0i().findViewById(R.id.controlViewStep);
            Intrinsics.O10IXXX0X(r2, "findViewById(...)");
            iIIIiIO0((ViewGroup) r2);
            View r3 = Ii0i().findViewById(R.id.controlViewHr);
            Intrinsics.O10IXXX0X(r3, "findViewById(...)");
            IiXIIX1O1((ViewGroup) r3);
            View r4 = Ii0i().findViewById(R.id.controlViewCa);
            Intrinsics.O10IXXX0X(r4, "findViewById(...)");
            I0iOXO((ViewGroup) r4);
            View r5 = Ii0i().findViewById(R.id.controlViewDis);
            Intrinsics.O10IXXX0X(r5, "findViewById(...)");
            XOXOIX0Oi((ViewGroup) r5);
            View r6 = Ii0i().findViewById(R.id.timeDigitalView);
            Intrinsics.O10IXXX0X(r6, "findViewById(...)");
            IOI((ViewGroup) r6);
            View r7 = Ii0i().findViewById(R.id.timePointView);
            Intrinsics.O10IXXX0X(r7, "findViewById(...)");
            OiO0IOX((ImageView) r7);
            View r8 = Ii0i().findViewById(R.id.timeScaleView);
            Intrinsics.O10IXXX0X(r8, "findViewById(...)");
            i0101i((ImageView) r8);
        }
    }

    public static final class O00 implements jl1 {
        public final /* synthetic */ WatchFaceVideoActivity IO;

        public O00(WatchFaceVideoActivity r1) {
            this.IO = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.jl1
        public List<Fragment> initFragments() {
            PointerElementFragment r0 = WatchFaceVideoActivity.access$getPointerElementFragment$p(this.IO);
            ControlElementFragment r1 = null;
            if (r0 != null) goto L5;
            Intrinsics.XXO("pointerElementFragment");
            r0 = null;
        L5:
            TimeElementFragment r2 = WatchFaceVideoActivity.access$getTimeElementFragment$p(this.IO);
            if (r2 != null) goto L8;
            Intrinsics.XXO("timeElementFragment");
            r2 = null;
        L8:
            ControlElementFragment r3 = WatchFaceVideoActivity.access$getControlElementFragment$p(this.IO);
            if (r3 != null) goto L11;
            Intrinsics.XXO("controlElementFragment");
        L13:
            return CollectionsKt__CollectionsKt.iXiX011(new Fragment[]{r0, r2, r1});
        L11:
            r1 = r3;
            goto L13
        }

        @Override // com.android.mltcode.paycertificationapi.jl1
        public FragmentManager provideFragmentManager() {
            FragmentManager r0 = this.IO.getSupportFragmentManager();
            Intrinsics.O10IXXX0X(r0, "getSupportFragmentManager(...)");
            return r0;
        }
    }

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ WatchFaceVideoActivity IO;

        public OXO1(WatchFaceVideoActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r3) {
            if (r3 == null) goto L11;
            WatchFaceVideoActivity r0 = this.IO;
            WatchFaceVideoActivity.access$setMTotalCount$p(r0, Integer.parseInt(r3.toString()));     // Catch: Exception -> L6
        L7:
            WatchFaceVideoActivity.access$releaseBackgroundImagePlayback(r0);
            return;
        L6:
            WatchFaceVideoActivity.access$setMTotalCount$p(r0, WatchFaceVideoActivity.access$getMDefaultFrameCount$p(r0));
            EditText r4 = WatchFaceVideoActivity.access$getEtFrameEdit(r0);
            r4.setText("1");
            r4.setSelection(r4.getText().length());
            goto L7
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO implements az1<Integer> {
        public final /* synthetic */ WatchFaceVideoActivity OXO1;
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;
        public final /* synthetic */ List<ResourcesIdInfo> iO;

        public XIi00iiXO(WatchFaceVideoActivity r1, List<ResourcesIdInfo> r2, List<ResourcesIdInfo> r3) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.az1
        public /* bridge */ /* synthetic */ void OXO1(Integer r1, boolean r2) {
            iO(r1.intValue(), r2);
        }

        @Override // com.android.mltcode.paycertificationapi.az1
        public /* bridge */ /* synthetic */ void XIi00iiXO(Integer r1, boolean r2) {
            XO0O10(r1.intValue(), r2);
        }

        public void XO0O10(int r4, boolean r5) {
            int r1 = 8;
            WatchFaceVideoActivity.access$getTimeDigitalView(this.OXO1).setVisibility(8);
            WatchFaceVideoActivity.access$getTimeScaleView(this.OXO1).setImageResource(this.iO.get(r4).getResId());
            X1XX1O r0 = WatchFaceVideoActivity.access$getMCustomWatchFace$p(this.OXO1);
            TimeElementFragment r2 = null;
            if (r0 != null) goto L5;
            Intrinsics.XXO("mCustomWatchFace");
            r0 = null;
        L5:
            r0.iIXX0i(r4);
            ImageView r6 = WatchFaceVideoActivity.access$getTimeScaleView(this.OXO1);
            if (r5 == false) goto L8;
            r1 = 0;
        L8:
            r6.setVisibility(r1);
            TimeElementFragment r7 = WatchFaceVideoActivity.access$getTimeElementFragment$p(this.OXO1);
            if (r7 != null) goto L11;
            Intrinsics.XXO("timeElementFragment");
        L12:
            r2.reset();
            return;
        L11:
            r2 = r7;
            goto L12
        }

        public void iO(int r4, boolean r5) {
            int r1 = 8;
            WatchFaceVideoActivity.access$getTimeDigitalView(this.OXO1).setVisibility(8);
            WatchFaceVideoActivity.access$getTimePointView(this.OXO1).setImageResource(this.XIi00iiXO.get(r4).getResId());
            X1XX1O r0 = WatchFaceVideoActivity.access$getMCustomWatchFace$p(this.OXO1);
            TimeElementFragment r2 = null;
            if (r0 != null) goto L5;
            Intrinsics.XXO("mCustomWatchFace");
            r0 = null;
        L5:
            r0.OIIOI(r4);
            ImageView r6 = WatchFaceVideoActivity.access$getTimePointView(this.OXO1);
            if (r5 == false) goto L8;
            r1 = 0;
        L8:
            r6.setVisibility(r1);
            TimeElementFragment r7 = WatchFaceVideoActivity.access$getTimeElementFragment$p(this.OXO1);
            if (r7 != null) goto L11;
            Intrinsics.XXO("timeElementFragment");
        L12:
            r2.reset();
            return;
        L11:
            r2 = r7;
            goto L12
        }
    }

    public static final class XO0O10 implements IXI011X11<Integer> {
        public final /* synthetic */ WatchFaceVideoActivity OXO1;
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        public XO0O10(WatchFaceVideoActivity r1, List<ResourcesIdInfo> r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.IXI011X11
        public /* bridge */ /* synthetic */ void OXO1(Integer r1, boolean r2) {
            XIi00iiXO(r1.intValue(), r2);
        }

        public void XIi00iiXO(int r2, boolean r3) {
            WatchFaceVideoActivity.access$getControlViewStep(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            WatchFaceVideoActivity.access$getControlViewHr(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            WatchFaceVideoActivity.access$getControlViewCa(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            WatchFaceVideoActivity.access$getControlViewDis(this.OXO1).setTextColor(this.XIi00iiXO.get(r2).getSecondaryId());
            X1XX1O r4 = WatchFaceVideoActivity.access$getMCustomWatchFace$p(this.OXO1);
            if (r4 != null) goto L5;
            Intrinsics.XXO("mCustomWatchFace");
            r4 = null;
        L5:
            r4.I0OX(r2);
        }
    }

    @SourceDebugExtension({"SMAP\nWatchFaceVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$mBleHandleCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,794:1\n1869#2,2:795\n*S KotlinDebug\n*F\n+ 1 WatchFaceVideoActivity.kt\ncom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$mBleHandleCallback$1\n*L\n198#1:795,2\n*E\n"})
    public static final class XOO0ii0 implements BleHandleCallback {
        public final /* synthetic */ WatchFaceVideoActivity IO;

        public XOO0ii0(WatchFaceVideoActivity r1) {
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
        public void onCommandSendTimeout(BleKey r3, BleKeyFlag r4) {
            Intrinsics.X0O(r3, "bleKey");
            Intrinsics.X0O(r4, "bleKeyFlag");
            if (r3 != BleKey.WATCH_FACE) goto L6;
            WatchFaceVideoActivity.syncFailed$default(this.IO, 0, 1, null);
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
            WatchFaceVideoActivity.access$getMDialIds$p(this.IO).clear();
            List<Integer> r5 = r4.getMIdList();
            WatchFaceVideoActivity r0 = this.IO;
            Iterator<T> r6 = r5.iterator();
        L4:
            if (r6.hasNext() == false) goto L9;
            int r1 = ((Number) r6.next()).intValue();
            if (r1 <= 0) goto L7;
            WatchFaceVideoActivity.access$getMDialIds$p(r0).add(Integer.valueOf(r1));
            goto L4
        L7:
            WatchFaceVideoActivity.access$getMDialIds$p(r0).add(0);
            goto L4
        L9:
            LogUtils.d(new Object[]{"mDialIds -> " + WatchFaceVideoActivity.access$getMDialIds$p(this.IO)});
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex r1) {
            super.onReadWatchFaceIndex(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadWatchFaceMaxSize(BleWatchFaceMaxSize r2) {
            Intrinsics.X0O(r2, "sizeInfo");
            WatchFaceVideoActivity.access$initVideoDialQuality(this.IO, r2);
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
        public void onSessionStateChange(boolean r4) {
            if (r4 == false) goto L4;
            return;
        L4:
            if (WatchFaceVideoActivity.access$getMProgressPop$p(this.IO) == null) goto L8;
            WatchFaceVideoActivity.syncFailed$default(this.IO, 0, 1, null);
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
        public void onStreamProgress(boolean r2, int r3, int r4, int r5, BleKey r6) {
            Intrinsics.X0O(r6, "bleKey");
            if (r2 == false) goto L13;
            c72 r7 = WatchFaceVideoActivity.access$getMProgressPop$p(this.IO);
            if (r7 == null) goto L7;
            r7.OX((int) ((r5 / r4) * 100));
        L7:
            if (r4 != r5) goto L15;
            c72 r8 = WatchFaceVideoActivity.access$getMProgressPop$p(this.IO);
            if (r8 == null) goto L11;
            r8.dismiss();
        L11:
            WatchFaceVideoActivity.access$setMProgressPop$p(this.IO, null);
            ToastUtils.showLong(R.string.dial_sync_done);
            WatchFaceVideoActivity.access$getMDialIds$p(this.IO).set(WatchFaceVideoActivity.access$getMCurSyncDevicePosition$p(this.IO), Integer.valueOf(WatchFaceVideoActivity.access$getMCurSyncDialId$p(this.IO)));
            a01.OXO1.XIi00iiXO().put("syncId", 0);
            WatchFaceVideoActivity.access$saveRecord(this.IO);
            return;
        L15:
            return;
        L13:
            WatchFaceVideoActivity.access$syncFailed(this.IO, r3);
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
        public void onWatchFaceIdUpdate(boolean r1) {
            WatchFaceVideoActivity.access$syncWatchFace(this.IO);
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

    public static final class iO implements IXI011X11<Integer> {
        public final /* synthetic */ WatchFaceVideoActivity OXO1;
        public final /* synthetic */ List<ResourcesIdInfo> XIi00iiXO;

        public iO(WatchFaceVideoActivity r1, List<ResourcesIdInfo> r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.IXI011X11
        public /* bridge */ /* synthetic */ void OXO1(Integer r1, boolean r2) {
            XIi00iiXO(r1.intValue(), r2);
        }

        public void XIi00iiXO(int r3, boolean r4) {
            DialElementView r0 = WatchFaceVideoActivity.access$getTimeDigitalView(this.OXO1);
            if (r4 == false) goto L5;
            int r5 = 0;
        L6:
            r0.setVisibility(r5);
            WatchFaceVideoActivity.access$getTimePointView(this.OXO1).setVisibility(8);
            WatchFaceVideoActivity.access$getTimeScaleView(this.OXO1).setVisibility(8);
            WatchFaceVideoActivity.access$getTimeDigitalView(this.OXO1).setImageRes(this.XIi00iiXO.get(r3).getResId());
            X1XX1O r6 = WatchFaceVideoActivity.access$getMCustomWatchFace$p(this.OXO1);
            if (r6 != null) goto L9;
            Intrinsics.XXO("mCustomWatchFace");
            r6 = null;
        L9:
            r6.OI1IiOO1i(r3);
            return;
        L5:
            r5 = 8;
            goto L6
        }
    }

    public WatchFaceVideoActivity() {
        this.TAG = "WatchFaceVideoActivity";
        this.REQUEST_SELECT_VIDEO = 1001;
        this.REQUEST_RECORD_VIDEO = 1002;
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new yo6(this));
        this.WATCHFACEVIEW_HEIGHT = 260.0f;
        this.watchfaceView$delegate = LazyKt__LazyJVMKt.iO(new wp6(this));
        this.customizeDialBg$delegate = LazyKt__LazyJVMKt.iO(new xp6(this));
        this.controlViewStep$delegate = LazyKt__LazyJVMKt.iO(new yp6(this));
        this.controlViewHr$delegate = LazyKt__LazyJVMKt.iO(new zo6(this));
        this.controlViewCa$delegate = LazyKt__LazyJVMKt.iO(new ap6(this));
        this.controlViewDis$delegate = LazyKt__LazyJVMKt.iO(new bp6(this));
        this.timeDigitalView$delegate = LazyKt__LazyJVMKt.iO(new cp6(this));
        this.timePointView$delegate = LazyKt__LazyJVMKt.iO(new dp6(this));
        this.timeScaleView$delegate = LazyKt__LazyJVMKt.iO(new ep6(this));
        this.tvMaxCount$delegate = LazyKt__LazyJVMKt.iO(new jp6(this));
        this.ivFrameReduce$delegate = LazyKt__LazyJVMKt.iO(new rp6(this));
        this.etFrameEdit$delegate = LazyKt__LazyJVMKt.iO(new sp6(this));
        this.ivFrameAdd$delegate = LazyKt__LazyJVMKt.iO(new tp6(this));
        this.table$delegate = LazyKt__LazyJVMKt.iO(new up6(this));
        this.mViewPager$delegate = LazyKt__LazyJVMKt.iO(new vp6(this));
        if (q62.OXO1.iIi011O() == false) goto L5;
        String r0 = "/2d/";
    L6:
        this.is2DAcceleration = r0;
        this.paramName = BleCache.INSTANCE.getMPrototype() + "/";
        this.mDialIds = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0});
        this.mDefaultFrameCount = 3;
        this.mTotalCount = 3;
        this.mMaxFrameCount = 8;
        this.mBgFiles = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mBleHandleCallback = new XOO0ii0(this);
        this.mImageSwitchRunnable = new I0IIOi(this);
        return;
    L5:
        r0 = "/default/";
        goto L6
    }

    public static /* synthetic */ void I0iXXO(WatchFaceVideoActivity r0) {
        syncWatchFace$lambda$1(r0);
    }

    public static /* synthetic */ TextView I1(WatchFaceVideoActivity r0) {
        return tvMaxCount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound I1XOi1(WatchFaceVideoActivity r0) {
        return customizeDialBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TabLayout II1Xi0(WatchFaceVideoActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView IIX1OXO(WatchFaceVideoActivity r0) {
        return timeDigitalView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView IXXOO(WatchFaceVideoActivity r0) {
        return controlViewHr_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(WatchFaceVideoActivity r0) {
        return timeScaleView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O1O(WatchFaceVideoActivity r0, boolean r1) {
        return selectImagePopup$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(EditText r0, WatchFaceVideoActivity r1) {
        return initVideoDialQuality$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(WatchFaceVideoActivity r0, View r1) {
        initEditFrameView$lambda$2(r0, r1);
    }

    public static /* synthetic */ ImageView OX(WatchFaceVideoActivity r0) {
        return ivFrameAdd_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(TimeElementFragment r0, WatchFaceVideoActivity r1, View r2) {
        initElementView$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ DialElementView X01IiOiIi(WatchFaceVideoActivity r0) {
        return controlViewCa_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialElementView X0O(WatchFaceVideoActivity r0) {
        return controlViewDis_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(WatchFaceVideoActivity r0, View r1) {
        initEditFrameView$lambda$1(r0, r1);
    }

    public static /* synthetic */ DialElementView XX0(WatchFaceVideoActivity r0) {
        return controlViewStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(WatchFaceVideoActivity r0) {
        return selectImagePopup$lambda$0$1(r0);
    }

    public static /* synthetic */ void XXIIO1i11(WatchFaceVideoActivity r0, ControlElementFragment r1, View r2) {
        initElementView$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ EditText XiOIO(WatchFaceVideoActivity r0) {
        return etFrameEdit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CardView XiOIii1(WatchFaceVideoActivity r0) {
        return watchfaceView_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ ControlElementFragment access$getControlElementFragment$p(WatchFaceVideoActivity r0) {
        return r0.controlElementFragment;
    }

    public static final /* synthetic */ DialElementView access$getControlViewCa(WatchFaceVideoActivity r0) {
        return r0.getControlViewCa();
    }

    public static final /* synthetic */ DialElementView access$getControlViewDis(WatchFaceVideoActivity r0) {
        return r0.getControlViewDis();
    }

    public static final /* synthetic */ DialElementView access$getControlViewHr(WatchFaceVideoActivity r0) {
        return r0.getControlViewHr();
    }

    public static final /* synthetic */ DialElementView access$getControlViewStep(WatchFaceVideoActivity r0) {
        return r0.getControlViewStep();
    }

    public static final /* synthetic */ EditText access$getEtFrameEdit(WatchFaceVideoActivity r0) {
        return r0.getEtFrameEdit();
    }

    public static final /* synthetic */ int access$getMBackgroundImageIndex$p(WatchFaceVideoActivity r0) {
        return r0.mBackgroundImageIndex;
    }

    public static final /* synthetic */ List access$getMBgFiles$p(WatchFaceVideoActivity r0) {
        return r0.mBgFiles;
    }

    public static final /* synthetic */ int access$getMCurSyncDevicePosition$p(WatchFaceVideoActivity r0) {
        return r0.mCurSyncDevicePosition;
    }

    public static final /* synthetic */ int access$getMCurSyncDialId$p(WatchFaceVideoActivity r0) {
        return r0.mCurSyncDialId;
    }

    public static final /* synthetic */ X1XX1O access$getMCustomWatchFace$p(WatchFaceVideoActivity r0) {
        return r0.mCustomWatchFace;
    }

    public static final /* synthetic */ int access$getMDefaultFrameCount$p(WatchFaceVideoActivity r0) {
        return r0.mDefaultFrameCount;
    }

    public static final /* synthetic */ List access$getMDialIds$p(WatchFaceVideoActivity r0) {
        return r0.mDialIds;
    }

    public static final /* synthetic */ Handler access$getMHandler$p(WatchFaceVideoActivity r0) {
        return r0.mHandler;
    }

    public static final /* synthetic */ int access$getMPlayInterval$p(WatchFaceVideoActivity r0) {
        return r0.mPlayInterval;
    }

    public static final /* synthetic */ c72 access$getMProgressPop$p(WatchFaceVideoActivity r0) {
        return r0.mProgressPop;
    }

    public static final /* synthetic */ PointerElementFragment access$getPointerElementFragment$p(WatchFaceVideoActivity r0) {
        return r0.pointerElementFragment;
    }

    public static final /* synthetic */ DialElementView access$getTimeDigitalView(WatchFaceVideoActivity r0) {
        return r0.getTimeDigitalView();
    }

    public static final /* synthetic */ TimeElementFragment access$getTimeElementFragment$p(WatchFaceVideoActivity r0) {
        return r0.timeElementFragment;
    }

    public static final /* synthetic */ ImageView access$getTimePointView(WatchFaceVideoActivity r0) {
        return r0.getTimePointView();
    }

    public static final /* synthetic */ ImageView access$getTimeScaleView(WatchFaceVideoActivity r0) {
        return r0.getTimeScaleView();
    }

    public static final /* synthetic */ void access$initVideoDialQuality(WatchFaceVideoActivity r0, BleWatchFaceMaxSize r1) {
        r0.initVideoDialQuality(r1);
    }

    public static final /* synthetic */ void access$releaseBackgroundImagePlayback(WatchFaceVideoActivity r0) {
        r0.releaseBackgroundImagePlayback();
    }

    public static final /* synthetic */ void access$saveRecord(WatchFaceVideoActivity r0) {
        r0.saveRecord();
    }

    public static final /* synthetic */ void access$setMBackgroundImageIndex$p(WatchFaceVideoActivity r0, int r1) {
        r0.mBackgroundImageIndex = r1;
    }

    public static final /* synthetic */ void access$setMProgressPop$p(WatchFaceVideoActivity r0, c72 r1) {
        r0.mProgressPop = r1;
    }

    public static final /* synthetic */ void access$setMTotalCount$p(WatchFaceVideoActivity r0, int r1) {
        r0.mTotalCount = r1;
    }

    public static final /* synthetic */ void access$syncFailed(WatchFaceVideoActivity r0, int r1) {
        r0.syncFailed(r1);
    }

    public static final /* synthetic */ void access$syncWatchFace(WatchFaceVideoActivity r0) {
        r0.syncWatchFace();
    }

    private final void adjustWatchfaceViewWidth() {
        X1XX1O r0 = this.mCustomWatchFace;
        X1XX1O r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L5:
        float r2 = r0.X00O0();
        X1XX1O r3 = this.mCustomWatchFace;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
        r3 = null;
    L8:
        float r4 = this.WATCHFACEVIEW_HEIGHT * (r2 / r3.Xi1i0XOX0());
        CardView r5 = getWatchfaceView();
        Intrinsics.O10IXXX0X(r5, "<get-watchfaceView>(...)");
        LibExKt.i100IXOX(r5, SizeUtils.dp2px(r4), SizeUtils.dp2px(this.WATCHFACEVIEW_HEIGHT));
        ImageViewRound r6 = getCustomizeDialBg();
        X1XX1O r7 = this.mCustomWatchFace;
        if (r7 != null) goto L11;
        Intrinsics.XXO("mCustomWatchFace");
        r7 = null;
    L11:
        r6.setRadius(SizeUtils.dp2px(r7.XXI0XOIX()));
        ImageViewRound r8 = getCustomizeDialBg();
        X1XX1O r9 = this.mCustomWatchFace;
        if (r9 != null) goto L14;
        Intrinsics.XXO("mCustomWatchFace");
        r9 = null;
    L14:
        r8.setType(!r9.O1() ? 1 : 0);
        CardView r10 = getWatchfaceView();
        X1XX1O r11 = this.mCustomWatchFace;
        if (r11 != null) goto L18;
        Intrinsics.XXO("mCustomWatchFace");
        r11 = null;
    L18:
        if (r11.O1() == false) goto L20;
        float r12 = 200.0f;
    L25:
        r10.setRadius(SizeUtils.dp2px(r12));
        return;
    L20:
        X1XX1O r13 = this.mCustomWatchFace;
        if (r13 != null) goto L23;
        Intrinsics.XXO("mCustomWatchFace");
    L24:
        r12 = r1.XXI0XOIX();
        goto L25
    L23:
        r1 = r13;
        goto L24
    }

    private final void controlChangeStatus(View r2, ImageView r3) {
        if (r2.getVisibility() != 0) goto L6;
        r2.setVisibility(8);
        r3.setImageResource(R.drawable.ic_watchface_element_add);
        return;
    L6:
        r2.setVisibility(0);
        r3.setImageResource(R.drawable.ic_watchface_element_del);
    }

    private static final DialElementView controlViewCa_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewCa);
    }

    private static final DialElementView controlViewDis_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewDis);
    }

    private static final DialElementView controlViewHr_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewHr);
    }

    private static final DialElementView controlViewStep_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (DialElementView) r1.findViewById(R.id.controlViewStep);
    }

    private static final ImageViewRound customizeDialBg_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.customizeDialBg);
    }

    private static final EditText etFrameEdit_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (EditText) r1.findViewById(R.id.et_frame_edit);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final DialElementView getControlViewCa() {
        return (DialElementView) getValue();
    }

    private final DialElementView getControlViewDis() {
        return (DialElementView) getValue();
    }

    private final DialElementView getControlViewHr() {
        return (DialElementView) getValue();
    }

    private final DialElementView getControlViewStep() {
        return (DialElementView) getValue();
    }

    private final ImageViewRound getCustomizeDialBg() {
        return (ImageViewRound) getValue();
    }

    private final EditText getEtFrameEdit() {
        return (EditText) getValue();
    }

    private final ImageView getIvFrameAdd() {
        return (ImageView) getValue();
    }

    private final ImageView getIvFrameReduce() {
        return (ImageView) getValue();
    }

    private final NoScollViewPager getMViewPager() {
        return (NoScollViewPager) getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private final DialElementView getTimeDigitalView() {
        return (DialElementView) getValue();
    }

    private final ImageView getTimePointView() {
        return (ImageView) getValue();
    }

    private final ImageView getTimeScaleView() {
        return (ImageView) getValue();
    }

    private final TextView getTvMaxCount() {
        return (TextView) getValue();
    }

    private final CardView getWatchfaceView() {
        return (CardView) getValue();
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

    public static /* synthetic */ Unit i010I(WatchFaceVideoActivity r0, boolean r1) {
        return selectImagePopup$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView iI(WatchFaceVideoActivity r0) {
        return ivFrameReduce_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iIiiO(WatchFaceVideoActivity r0) {
        return timePointView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOO1ii1(xz3 r0, WatchFaceVideoActivity r1) {
        return selectImagePopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(EditText r0, WatchFaceVideoActivity r1) {
        return initEditFrameView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ PFMedium iX(WatchFaceVideoActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NoScollViewPager iX1O1(WatchFaceVideoActivity r0) {
        return mViewPager_delegate$lambda$0(r0);
    }

    private final void initEditFrameView() {
        getTvMaxCount().setText(getString(R.string.watch_face_video__max_count_info, new Object[]{String.valueOf(this.mMaxFrameCount)}));
        final EditText r0 = getEtFrameEdit();
        r0.setText(String.valueOf(this.mDefaultFrameCount));
        r0.setInputType(2);
        r0.setFilters(new c6[]{new c6(1, this.mMaxFrameCount, new lp6(r0, this))});
        r0.addTextChangedListener(new OXO1(this));
        getIvFrameReduce().setOnClickListener(new mp6(this));
        getIvFrameAdd().setOnClickListener(new np6(this));
    }

    private static final Unit initEditFrameView$lambda$0$0(EditText r1, WatchFaceVideoActivity r2) {
        KeyboardUtils.hideSoftInput(r1);
        ToastUtils.showShort(r2.getString(R.string.watch_face_video__frame_count_scope, new Object[]{String.valueOf(r2.mMaxFrameCount)}), new Object[0]);
        return Unit.OXO1;
    }

    private static final void initEditFrameView$lambda$1(WatchFaceVideoActivity r1, View r2) {
        if (r1.isInRange(r1.mMaxFrameCount, r1.mTotalCount - 1) == false) goto L6;
        r1.mTotalCount--;
        EditText r3 = r1.getEtFrameEdit();
        r3.setText(String.valueOf(r1.mTotalCount));
        r3.setSelection(r3.getText().length());
        r1.releaseBackgroundImagePlayback();
        return;
    L6:
        ToastUtils.showShort(r1.getString(R.string.watch_face_video__frame_count_scope, new Object[]{String.valueOf(r1.mMaxFrameCount)}), new Object[0]);
    }

    private static final void initEditFrameView$lambda$2(WatchFaceVideoActivity r1, View r2) {
        if (r1.isInRange(r1.mMaxFrameCount, r1.mTotalCount + 1) == false) goto L6;
        r1.mTotalCount++;
        EditText r3 = r1.getEtFrameEdit();
        r3.setText(String.valueOf(r1.mTotalCount));
        r3.setSelection(r3.getText().length());
        r1.releaseBackgroundImagePlayback();
        return;
    L6:
        ToastUtils.showShort(r1.getString(R.string.watch_face_video__frame_count_scope, new Object[]{String.valueOf(r1.mMaxFrameCount)}), new Object[0]);
    }

    private final void initElementView() {
        BleCache r0 = BleCache.INSTANCE;
        BleDeviceInfo r1 = r0.getMDeviceInfo();
        Intrinsics.XXI(r1);
        List<ResourcesIdInfo> r2 = ResourcesIdInfoKt.getWatchFaceElementPointers(r1);
        BleDeviceInfo r3 = r0.getMDeviceInfo();
        Intrinsics.XXI(r3);
        X1XX1O r4 = this.mCustomWatchFace;
        X1XX1O r5 = null;
        if (r4 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r4 = null;
    L5:
        List<ResourcesIdInfo> r6 = ResourcesIdInfoKt.getWatchFaceElementScales(r3, r4.O1());
        List<ResourcesIdInfo> r7 = ResourcesIdInfoKt.getWatchFaceElementColors(this);
        List<ResourcesIdInfo> r8 = ResourcesIdInfoKt.getWatchFaceElementDigitalTimes();
        X1XX1O r9 = this.mCustomWatchFace;
        if (r9 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
        r9 = null;
    L8:
        this.pointerElementFragment = new PointerElementFragment(r2, r6, r9.O1(), new XIi00iiXO(this, r2, r6));
        X1XX1O r10 = this.mCustomWatchFace;
        if (r10 != null) goto L11;
        Intrinsics.XXO("mCustomWatchFace");
        r10 = null;
    L11:
        final TimeElementFragment r11 = new TimeElementFragment(r7, r10.O1(), new iO(this, r8));
        r11.setOnViewClickListener(new ip6(r11, this));
        this.timeElementFragment = r11;
        X1XX1O r12 = this.mCustomWatchFace;
        if (r12 != null) goto L14;
        Intrinsics.XXO("mCustomWatchFace");
    L15:
        final ControlElementFragment r13 = new ControlElementFragment(r7, r5.O1(), new XO0O10(this, r7));
        r13.setOnViewClickListener(new kp6(this, r13));
        this.controlElementFragment = r13;
        BaseFragmentPagerAdapter r14 = new BaseFragmentPagerAdapter(new O00(this));
        String r15 = getString(R.string.pointer) + C2985d4.j.c + getString(R.string.scale);
        String r16 = getString(R.string.time);
        Intrinsics.O10IXXX0X(r16, "getString(...)");
        String r17 = getString(R.string.control);
        Intrinsics.O10IXXX0X(r17, "getString(...)");
        r14.setTitles(new String[]{r15, r16, r17});
        getMViewPager().setAdapter(r14);
        getMViewPager().setOffscreenPageLimit(r14.getCount());
        this.mFragmentPagerAdapter = r14;
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().setCanScoll(false);
        return;
    L14:
        r5 = r12;
        goto L15
    }

    private static final void initElementView$lambda$0$0(TimeElementFragment r2, WatchFaceVideoActivity r3, View r4) {
        if (r4.getId() != R.id.dialSelect0) goto L13;
        ImageView r5 = r2.getDialSelectStatus0();
        if (r5.getVisibility() != 8) goto L7;
        int r0 = 0;
    L8:
        r5.setVisibility(r0);
        r3.getTimeDigitalView().setVisibility(r2.getDialSelectStatus0().getVisibility());
        r3.getTimePointView().setVisibility(8);
        r3.getTimeScaleView().setVisibility(8);
        PointerElementFragment r6 = r3.pointerElementFragment;
        if (r6 != null) goto L11;
        Intrinsics.XXO("pointerElementFragment");
        r6 = null;
    L11:
        r6.reset();
        return;
    L7:
        r0 = 8;
        goto L8
    }

    private static final void initElementView$lambda$1$0(WatchFaceVideoActivity r1, ControlElementFragment r2, View r3) {
        switch(r3.getId()) {
            case 2131362552: goto L11;
            case 2131362553: goto L9;
            case 2131362554: goto L7;
            case 2131362555: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        DialElementView r4 = r1.getControlViewDis();
        Intrinsics.O10IXXX0X(r4, "<get-controlViewDis>(...)");
        ImageView r5 = r2.getDialSelectStatus3();
        Intrinsics.O10IXXX0X(r5, "<get-dialSelectStatus3>(...)");
        r1.controlChangeStatus(r4, r5);
        return;
    L7:
        DialElementView r6 = r1.getControlViewCa();
        Intrinsics.O10IXXX0X(r6, "<get-controlViewCa>(...)");
        ImageView r7 = r2.getDialSelectStatus2();
        Intrinsics.O10IXXX0X(r7, "<get-dialSelectStatus2>(...)");
        r1.controlChangeStatus(r6, r7);
        return;
    L9:
        DialElementView r8 = r1.getControlViewHr();
        Intrinsics.O10IXXX0X(r8, "<get-controlViewHr>(...)");
        ImageView r9 = r2.getDialSelectStatus1();
        Intrinsics.O10IXXX0X(r9, "<get-dialSelectStatus1>(...)");
        r1.controlChangeStatus(r8, r9);
        return;
    L11:
        DialElementView r10 = r1.getControlViewStep();
        Intrinsics.O10IXXX0X(r10, "<get-controlViewStep>(...)");
        ImageView r11 = r2.getDialSelectStatus0();
        Intrinsics.O10IXXX0X(r11, "<get-dialSelectStatus0>(...)");
        r1.controlChangeStatus(r10, r11);
    }

    private final void initVideoDialQuality(BleWatchFaceMaxSize r5) {
        Log.d(this.TAG, "onReadWatchFaceMaxSize: sizeInfo = " + r5);
        if (r5.getMTotalSize() > 0) goto L5;
        return;
    L5:
        int r6 = (r5.getMTotalSize() / 1024) / 1024;
        if (r6 < 3) goto L8;
        this.mMaxFrameCount = 20;
        this.mDefaultFrameCount = 9;
    L14:
        this.mTotalCount = this.mDefaultFrameCount;
        getTvMaxCount().setText(getString(R.string.watch_face_video__max_count_info, new Object[]{String.valueOf(this.mMaxFrameCount)}));
        final EditText r7 = getEtFrameEdit();
        r7.setText(String.valueOf(this.mDefaultFrameCount));
        r7.setInputType(2);
        r7.setFilters(new c6[]{new c6(1, this.mMaxFrameCount, new fp6(r7, this))});
        return;
    L8:
        if (r6 < 2) goto L11;
        this.mMaxFrameCount = 15;
        this.mDefaultFrameCount = 6;
        goto L14
    L11:
        if (r6 < 1) goto L13;
        this.mMaxFrameCount = 8;
        this.mDefaultFrameCount = 3;
        goto L14
    L13:
        this.mMaxFrameCount = 8;
        this.mDefaultFrameCount = 3;
        goto L14
    }

    private static final Unit initVideoDialQuality$lambda$0$0(EditText r1, WatchFaceVideoActivity r2) {
        KeyboardUtils.hideSoftInput(r1);
        ToastUtils.showShort(r2.getString(R.string.watch_face_video__frame_count_scope, new Object[]{String.valueOf(r2.mMaxFrameCount)}), new Object[0]);
        return Unit.OXO1;
    }

    private final void initWatchfaceView() {
        this.mCustomWatchFace = new IiI10X(this, Utils.getApp());
        DialElementView r0 = getControlViewStep();
        X1XX1O r1 = this.mCustomWatchFace;
        X1XX1O r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r1 = null;
    L5:
        r0.setIsRangeCircle(r1.O1());
        DialElementView r3 = getControlViewHr();
        X1XX1O r4 = this.mCustomWatchFace;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mCustomWatchFace");
        r4 = null;
    L8:
        r3.setIsRangeCircle(r4.O1());
        DialElementView r5 = getControlViewCa();
        X1XX1O r6 = this.mCustomWatchFace;
        if (r6 != null) goto L11;
        Intrinsics.XXO("mCustomWatchFace");
        r6 = null;
    L11:
        r5.setIsRangeCircle(r6.O1());
        DialElementView r7 = getControlViewDis();
        X1XX1O r8 = this.mCustomWatchFace;
        if (r8 != null) goto L14;
        Intrinsics.XXO("mCustomWatchFace");
        r8 = null;
    L14:
        r7.setIsRangeCircle(r8.O1());
        DialElementView r9 = getTimeDigitalView();
        X1XX1O r10 = this.mCustomWatchFace;
        if (r10 != null) goto L17;
        Intrinsics.XXO("mCustomWatchFace");
    L18:
        r9.setIsRangeCircle(r2.O1());
        adjustWatchfaceViewWidth();
        return;
    L17:
        r2 = r10;
        goto L18
    }

    private final boolean isInRange(int r3, int r4) {
        if (r3 <= 1) goto L8;
        if (r4 < 1) goto L7;
        if (r4 > r3) goto L7;
        return true;
    L7:
        return false;
    L8:
        if (r4 < r3) goto L11;
        if (r4 > 1) goto L11;
        return true;
    L11:
        return false;
    }

    private static final ImageView ivFrameAdd_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_frame_add);
    }

    private static final ImageView ivFrameReduce_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_frame_reduce);
    }

    private static final NoScollViewPager mViewPager_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (NoScollViewPager) r1.findViewById(R.id.view_pager);
    }

    private final void recordVideo() {
        Intent r0 = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("android.intent.extra.videoQuality", 1);
        Intrinsics.O10IXXX0X(r0, "putExtra(...)");
        if (r0.resolveActivity(getPackageManager()) == null) goto L6;
        startActivityForResult(r0, this.REQUEST_RECORD_VIDEO);
        return;
    }

    private final void releaseBackgroundImagePlayback() {
        stopBackgroundImagePlayback();
        this.mBackgroundImageIndex = 0;
        this.mBgFiles.clear();
        X1XX1O r0 = this.mCustomWatchFace;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L5:
        r0.iX1O1().setImageResource(R.drawable.pic_custom_video_bg_def);
    }

    private final void saveRecord() {
        String r0 = BleCache.INSTANCE.getMBleName() + IiXI1X1OO.O00 + this.mCurSyncDialId + IiXI1X1OO.O00 + System.currentTimeMillis();
        String r1 = this.paramName + this.is2DAcceleration + r0;
        sz0 r2 = sz0.OXO1;
        File r3 = new File(uz0.XXX11i(r2), r1 + ".png");
        X1XX1O r4 = this.mCustomWatchFace;
        if (r4 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r4 = null;
    L5:
        FileIOUtils.writeFileFromBytesByStream(r3, r4.IXiOXO());
        File r5 = new File(uz0.XXX11i(r2), r1);
        byte[] r6 = this.mCurSendBytes;
        if (r6 != null) goto L8;
        Intrinsics.XXO("mCurSendBytes");
        r6 = null;
    L8:
        FileIOUtils.writeFileFromBytesByStream(r5, r6);
        I01XX0.XIi00iiXO(I01XX0.iOI, null, 2, null);
    }

    private final void selectImagePopup() {
        if (this.mSelectAvatarPopup != null) goto L5;
        final xz3 r0 = new xz3(this);
        r0.iX(new op6(r0, this));
        r0.i010I(new pp6(this));
        this.mSelectAvatarPopup = r0;
    L5:
        xz3 r1 = this.mSelectAvatarPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final Unit selectImagePopup$lambda$0$0(xz3 r2, final WatchFaceVideoActivity r3) {
        hr1.OXO1.iOOX010X(r2.XO0O10(), new hp6(r3));
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$0$0(WatchFaceVideoActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.recordVideo();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$1(final WatchFaceVideoActivity r3) {
        hr1.OXO1.XX1Oi(r3.getMContext(), new gp6(r3));
        return Unit.OXO1;
    }

    private static final Unit selectImagePopup$lambda$0$1$0(WatchFaceVideoActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.selectVideo();
    L5:
        return Unit.OXO1;
    }

    private final void selectVideo() {
        Intent r0 = new Intent("android.intent.action.PICK").setType("video/*");
        Intrinsics.O10IXXX0X(r0, "setType(...)");
        startActivityForResult(r0, this.REQUEST_SELECT_VIDEO);
    }

    private final void startBackgroundImagePlayback() {
        stopBackgroundImagePlayback();
        this.mBackgroundImageIndex = 0;
        this.mHandler.post(this.mImageSwitchRunnable);
    }

    private final void stopBackgroundImagePlayback() {
        this.mHandler.removeCallbacks(this.mImageSwitchRunnable);
    }

    private final void syncFailed(int r2) {
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.mProgressPop = null;
        handleErrorCode(r2);
    }

    public static /* synthetic */ void syncFailed$default(WatchFaceVideoActivity r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        r0.syncFailed(r1);
    }

    private final void syncWatchFace() {
        if (this.mProgressPop != null) goto L9;
        int r3 = 0;
        c72 r0 = new c72(this, r3, 2, null);
        r0.I1(R.string.dial_generated_start);
        r0.OX(0);
        this.mProgressPop = r0;
        r0.IIX1OXO();
        c72 r1 = this.mProgressPop;
        if (r1 == null) goto L7;
        r1.I1(R.string.dial_generated_sync);
    L7:
        new Thread(new qp6(this)).start();
        return;
    }

    private static final void syncWatchFace$lambda$1(WatchFaceVideoActivity r8) {
        X1XX1O r0 = r8.mCustomWatchFace;
        X1XX1O r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCustomWatchFace");
        r0 = null;
    L5:
        r0.O0i(200);
        X1XX1O r2 = r8.mCustomWatchFace;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mCustomWatchFace");
        r2 = null;
    L9:
        if (r8.mBgFiles.size() <= 1) goto L11;
        List<String> r3 = r8.mBgFiles;
    L12:
        r2.Oiii(r3);
        X1XX1O r4 = r8.mCustomWatchFace;
        if (r4 != null) goto L15;
        Intrinsics.XXO("mCustomWatchFace");
    L16:
        byte[] r5 = r1.IO();
        r8.mCurSendBytes = r5;
        sz0 r6 = sz0.OXO1;
        File r7 = uz0.i010I(r6);
        File r9 = uz0.X11iII1O1(r6);
        BleCache r10 = BleCache.INSTANCE;
        FileUtils.copy(r7, new File(r9, r10.getMPrototype() + IiXI1X1OO.O00 + r10.getMBleName() + IiXI1X1OO.O00 + r8.mCurSyncDialId + ".png"));
        i1O0OXO1O.OXO1.OXO1(r8.mCurSyncDevicePosition + " Custom WatchFace bytes size  " + r5.length);
        BleConnector.INSTANCE.sendStream(BleKey.WATCH_FACE, r5, r8.mCurSyncDevicePosition);
        return;
    L15:
        r1 = r4;
        goto L16
    L11:
        r3 = CollectionsKt__CollectionsKt.iI();
        goto L12
    }

    private static final TabLayout table_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    private static final DialElementView timeDigitalView_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (DialElementView) r1.findViewById(R.id.timeDigitalView);
    }

    private static final ImageView timePointView_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.timePointView);
    }

    private static final ImageView timeScaleView_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.timeScaleView);
    }

    private static final TextView tvMaxCount_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_max_count);
    }

    private static final CardView watchfaceView_delegate$lambda$0(WatchFaceVideoActivity r1) {
        return (CardView) r1.findViewById(R.id.watchface_view);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r9) {
        BleConnector r0 = BleConnector.INSTANCE;
        r0.addHandleCallback(this.mBleHandleCallback);
        BaseBleConnector.sendData$default(r0, BleKey.GET_WATCH_FACE_MAX_SIZE, BleKeyFlag.READ, null, false, false, 28, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(R.string.video_watchface);
        initWatchfaceView();
        initElementView();
        initEditFrameView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_watchface_video;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r5, int r6, @tb1 Intent r7) {
        super.onActivityResult(r5, r6, r7);
        X1XX1O r0 = null;
        if (r7 == null) goto L5;
        Uri r1 = r7.getData();
    L6:
        LogUtils.d(new Object[]{"onActivityResult " + r5 + " " + r6 + " " + r1});
        if (r5 != this.REQUEST_SELECT_VIDEO) goto L9;
    L25:
        xz3 r8 = this.mSelectAvatarPopup;
        if (r8 == null) goto L28;
        r8.dismiss();
    L28:
        if (r7 == null) goto L44;
        Uri r9 = r7.getData();
        if (r9 == null) goto L45;
        String r10 = UtilsKt.OX110i(this, r9);
        X1XX1O r11 = this.mCustomWatchFace;
        if (r11 != null) goto L34;
        Intrinsics.XXO("mCustomWatchFace");
        r11 = null;
    L34:
        int r12 = r11.X00O0();
        X1XX1O r2 = this.mCustomWatchFace;
        if (r2 != null) goto L37;
        Intrinsics.XXO("mCustomWatchFace");
    L38:
        VideoTrimmerActivity.call(this, r10, r12, r0.Xi1i0XOX0(), this.mTotalCount);
        return;
    L37:
        r0 = r2;
        goto L38
    L45:
        return;
    L44:
        return;
    L9:
        if (r5 == this.REQUEST_RECORD_VIDEO) goto L25;
        if (r5 != 1) goto L40;
        xz3 r13 = this.mSelectAvatarPopup;
        if (r13 == null) goto L16;
        r13.dismiss();
    L16:
        if (r7 == null) goto L18;
        this.mPlayInterval = r7.getIntExtra(VideoTrimmerActivity.INTERVAL_KEY, 0);
    L18:
        if (r7 == null) goto L41;
        ArrayList<String> r14 = r7.getStringArrayListExtra(VideoTrimmerActivity.URLS_KEY);
        if (r14 == null) goto L42;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onActivityResult: " + r14.size() + ", " + this.mPlayInterval);
        if (r14.isEmpty() == true) goto L43;
        this.mBgFiles.clear();
        this.mBgFiles.addAll(r14);
        startBackgroundImagePlayback();
        return;
    L43:
        return;
    L42:
        return;
    L41:
        return;
    L40:
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final void onAddBg(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        selectImagePopup();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        FileUtils.delete(uz0.i11I(sz0.OXO1));
        stopBackgroundImagePlayback();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.mProgressPop == null) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    public final void onReset(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        getControlViewStep().setVisibility(8);
        getControlViewHr().setVisibility(8);
        getControlViewCa().setVisibility(8);
        getControlViewDis().setVisibility(8);
        getTimeDigitalView().setVisibility(8);
        getTimePointView().setVisibility(8);
        getTimeScaleView().setVisibility(8);
        ControlElementFragment r5 = this.controlElementFragment;
        ControlElementFragment r1 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("controlElementFragment");
        r5 = null;
    L5:
        r5.getDialSelectStatus0().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment r6 = this.controlElementFragment;
        if (r6 != null) goto L8;
        Intrinsics.XXO("controlElementFragment");
        r6 = null;
    L8:
        r6.getDialSelectStatus1().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment r7 = this.controlElementFragment;
        if (r7 != null) goto L11;
        Intrinsics.XXO("controlElementFragment");
        r7 = null;
    L11:
        r7.getDialSelectStatus2().setImageResource(R.drawable.ic_watchface_element_add);
        ControlElementFragment r8 = this.controlElementFragment;
        if (r8 != null) goto L14;
        Intrinsics.XXO("controlElementFragment");
        r8 = null;
    L14:
        r8.getDialSelectStatus3().setImageResource(R.drawable.ic_watchface_element_add);
        releaseBackgroundImagePlayback();
        getEtFrameEdit().setText(String.valueOf(this.mDefaultFrameCount));
        PointerElementFragment r9 = this.pointerElementFragment;
        if (r9 != null) goto L17;
        Intrinsics.XXO("pointerElementFragment");
        r9 = null;
    L17:
        r9.reset();
        TimeElementFragment r10 = this.timeElementFragment;
        if (r10 != null) goto L20;
        Intrinsics.XXO("timeElementFragment");
        r10 = null;
    L20:
        r10.reset();
        ControlElementFragment r11 = this.controlElementFragment;
        if (r11 != null) goto L23;
        Intrinsics.XXO("controlElementFragment");
    L24:
        r1.reset();
        return;
    L23:
        r1 = r11;
        goto L24
    }

    public final void onSycn(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mBgFiles.isEmpty() == false) goto L6;
        ToastUtils.showLong(R.string.select_file_tip);
        return;
    L6:
        this.mCurSyncDevicePosition = 0;
        this.mCurSyncDialId = 10000000;
        syncWatchFace();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mProgressPop == null) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }
}
