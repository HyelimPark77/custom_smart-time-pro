package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2916sc;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1IIXO;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.p057io.Location;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.CleanUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jieli.bluetooth_connect.util.JL_Log;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager;
import com.sma.smartv3.biz.fitness_site.strava.StravaManager;
import com.sma.smartv3.biz.p242ad.ADPAdManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.AppVersion;
import com.sma.smartv3.model.UpgradeFailedDeviceData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p610ui.device.FirmwareRepairSearchActivity;
import com.sma.smartv3.p610ui.fitness_site.FitbitAuthActivity;
import com.sma.smartv3.p610ui.fitness_site.StravaAuthActivity;
import com.sma.smartv3.p610ui.launcher.LauncherActivity;
import com.sma.smartv3.p610ui.p612me.SettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsActivity.kt\ncom/sma/smartv3/ui/me/SettingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 7 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,801:1\n19#2:802\n15#2:803\n19#2:804\n15#2:805\n19#2:806\n15#2:807\n19#2:835\n15#2:836\n11#2,2:837\n19#2:874\n15#2:875\n11#2,2:876\n11#2,2:891\n69#3,3:808\n72#3,5:812\n69#3,3:817\n72#3,5:821\n69#3,3:826\n72#3,5:830\n69#3,3:839\n72#3,5:843\n140#3,5:852\n145#3,5:858\n140#3,5:863\n145#3,5:869\n69#3,3:893\n72#3,5:897\n1#4:811\n1#4:820\n1#4:829\n1#4:842\n1#4:857\n1#4:868\n1#4:896\n1563#5:848\n1634#5,3:849\n183#6,4:878\n196#6:890\n252#7,7:882\n270#7:889\n*S KotlinDebug\n*F\n+ 1 SettingsActivity.kt\ncom/sma/smartv3/ui/me/SettingsActivity\n*L\n104#1:802\n104#1:803\n138#1:804\n138#1:805\n141#1:806\n141#1:807\n649#1:835\n649#1:836\n650#1:837,2\n400#1:874\n400#1:875\n405#1:876,2\n711#1:891,2\n371#1:808,3\n371#1:812,5\n383#1:817,3\n383#1:821,5\n494#1:826,3\n494#1:830,5\n688#1:839,3\n688#1:843,5\n183#1:852,5\n183#1:858,5\n203#1:863,5\n203#1:869,5\n712#1:893,3\n712#1:897,5\n371#1:811\n383#1:820\n494#1:829\n688#1:842\n183#1:857\n203#1:868\n712#1:896\n698#1:848\n698#1:849,3\n472#1:878,4\n472#1:890\n472#1:882,7\n472#1:889\n*E\n"})
public class SettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int REQUEST_ENABLE_FITBIT_SYNC = 515;
    public static final int REQUEST_ENABLE_STRAVA_SYNC = 514;
    public static final int REQUEST_PERMISSION_SERVER = 3;

    @aa1
    private AppUser appUser;

    @aa1
    private String downloadUrl;
    private boolean isGoogleFitSyncBoolean;

    @tb1
    private go0 mCacheCleanPopup;
    private boolean mCleaning;

    @tb1
    private go0 mDataAutoSyncPopup;

    @tb1
    private go0 mDeleteUserPopup;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private go0 mLogoutPopup;

    @tb1
    private pv1 mMapPopup;

    @tb1
    private go0 mPermissionBackgroundPopup;

    @tb1
    private go0 mPermissionPopup;

    @tb1
    private go0 mRepairPopup;

    @tb1
    private pv1 mUnitPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.rootView_delegate$lambda$0(this.f6344IO);
        }
    });

    @aa1
    private final Lazy tvUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.tvUnit_delegate$lambda$0(this.f10545IO);
        }
    });

    @aa1
    private final Lazy tvMap$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.tvMap_delegate$lambda$0(this.f5682IO);
        }
    });

    @aa1
    private final Lazy tvDataStorage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.tvDataStorage_delegate$lambda$0(this.f5923IO);
        }
    });

    @aa1
    private final Lazy ivRemind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.ivRemind_delegate$lambda$0(this.f6141IO);
        }
    });

    @aa1
    private final Lazy checkGoogleFit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.checkGoogleFit_delegate$lambda$0(this.f6349IO);
        }
    });

    @aa1
    private final Lazy checkStrava$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.checkStrava_delegate$lambda$0(this.f6593IO);
        }
    });

    @aa1
    private final Lazy checkDataAutoSync$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.checkDataAutoSync_delegate$lambda$0(this.f6825IO);
        }
    });

    @aa1
    private final Lazy stravaLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.stravaLl_delegate$lambda$0(this.f7767IO);
        }
    });

    @aa1
    private final Lazy cacheSize$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.cacheSize_delegate$lambda$0(this.f8906IO);
        }
    });

    @aa1
    private final Lazy llDeleteAccount$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llDeleteAccount_delegate$lambda$0(this.f6587IO);
        }
    });

    @aa1
    private final Lazy llModifyPassword$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llModifyPassword_delegate$lambda$0(this.f6820IO);
        }
    });

    @aa1
    private final Lazy llAiKeySet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llAiKeySet_delegate$lambda$0(this.f7049IO);
        }
    });

    @aa1
    private final Lazy llUiRepair$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llUiRepair_delegate$lambda$0(this.f7762IO);
        }
    });

    @aa1
    private final Lazy llFontRepair$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llFontRepair_delegate$lambda$0(this.f8893IO);
        }
    });

    @aa1
    private final Lazy llFirmwareRepair$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.k64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llFirmwareRepair_delegate$lambda$0(this.f9116IO);
        }
    });

    @aa1
    private final Lazy llGPSFirmwareRepair$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llGPSFirmwareRepair_delegate$lambda$0(this.f9634IO);
        }
    });

    @aa1
    private final Lazy llAdmobPrivacyOptions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llAdmobPrivacyOptions_delegate$lambda$0(this.f9856IO);
        }
    });

    @aa1
    private final Lazy llDataSavePlace$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llDataSavePlace_delegate$lambda$0(this.f10081IO);
        }
    });

    @aa1
    private final Lazy btSettingButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.btSettingButton_delegate$lambda$0(this.f10301IO);
        }
    });

    @aa1
    private final Lazy llGoogleFit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llGoogleFit_delegate$lambda$0(this.f10759IO);
        }
    });

    @aa1
    private final Lazy llGoogleFitAuth$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llGoogleFitAuth_delegate$lambda$0(this.f10976IO);
        }
    });

    @aa1
    private final Lazy checkNotificationBar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.checkNotificationBar_delegate$lambda$0(this.f11199IO);
        }
    });

    @aa1
    private final Lazy notificationBarLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.notificationBarLl_delegate$lambda$0(this.f11432IO);
        }
    });

    @aa1
    private final Lazy llHealthConnect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llHealthConnect_delegate$lambda$0(this.f11655IO);
        }
    });

    @aa1
    private final Lazy llZewaFit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.llZewaFit_delegate$lambda$0(this.f12117IO);
        }
    });

    @aa1
    private final Lazy checkZewaFit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.checkZewaFit_delegate$lambda$0(this.f12321IO);
        }
    });

    @aa1
    private final Lazy checkFitbit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z64
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.checkFitbit_delegate$lambda$0(this.f12548IO);
        }
    });

    @aa1
    private final Lazy fitbitLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a74
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SettingsActivity.fitbitLl_delegate$lambda$0(this.f5434IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    public SettingsActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.appUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.downloadUrl = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btSettingButton_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (Button) settingsActivity.findViewById(R.id.bt_setting_button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cacheClean$lambda$0$0(SettingsActivity settingsActivity) {
        settingsActivity.mCleaning = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cacheClean$lambda$0$1(final SettingsActivity settingsActivity) {
        sz0 sz0Var = sz0.OXO1;
        FileUtils.delete(uz0.X0i1O(sz0Var));
        FileUtils.delete(uz0.I0iXXO(sz0Var));
        FileUtils.delete(settingsActivity.getMContext().getCacheDir());
        C2916sc.OXO1(settingsActivity);
        FileUtils.delete(JL_Log.getSaveLogPath(settingsActivity.getMContext()));
        FileUtils.delete(uz0.X1IX(sz0Var));
        a01.OXO1.O00().clear();
        settingsActivity.getCacheSize().setText(R.string.cache_cleaning);
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.d64
            @Override // java.lang.Runnable
            public final void run() {
                SettingsActivity.cacheClean$lambda$0$1$0(this.f6137IO);
            }
        }, 10000L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cacheClean$lambda$0$1$0(SettingsActivity settingsActivity) {
        if (settingsActivity.isFinishing()) {
            return;
        }
        settingsActivity.getCacheSize().setText("0KB");
        settingsActivity.mCleaning = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cacheSize_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (TextView) settingsActivity.findViewById(R.id.tv_cache_size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkDataAutoSync_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (CheckBox) settingsActivity.findViewById(R.id.check_data_auto_sync);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkFitbit_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (CheckBox) settingsActivity.findViewById(R.id.check_fitbit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkGoogleFit_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (CheckBox) settingsActivity.findViewById(R.id.check_google_fit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkNotificationBar_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (CheckBox) settingsActivity.findViewById(R.id.check_notification_bar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkStrava_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (CheckBox) settingsActivity.findViewById(R.id.check_strava);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUpgradeFailedDevice() {
        final List<BleDeviceInfo> list = UpgradeFailedDeviceData.INSTANCE.getList();
        LogUtils.m11128d("checkUpgradeFailedDevice -> List : " + list);
        if (list.isEmpty()) {
            return;
        }
        List<BleDeviceInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BleDeviceInfo) it.next()).getMBleName());
        }
        dj4 dj4Var = new dj4(this, arrayList, 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.check_firmware_upgrade_failed_tip);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.n74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SettingsActivity.checkUpgradeFailedDevice$lambda$1$0(list, this, ((Integer) obj).intValue()));
            }
        });
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        dj4Var.I1XOi1(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkUpgradeFailedDevice$lambda$1$0(List list, SettingsActivity settingsActivity, int i) {
        if (i == -1) {
            return false;
        }
        if (!Intrinsics.XOO0ii0(((BleDeviceInfo) list.get(i)).getMPlatform(), BleDeviceInfo.PLATFORM_JL) && !Intrinsics.XOO0ii0(((BleDeviceInfo) list.get(i)).getMPlatform(), BleDeviceInfo.PLATFORM_JL707) && !Intrinsics.XOO0ii0(((BleDeviceInfo) list.get(i)).getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            ToastUtils.showLong(R.string.stay_tuned);
            return true;
        }
        a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(list.get(i)));
        settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) FirmwareRepairSearchActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkZewaFit_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (CheckBox) settingsActivity.findViewById(R.id.check_zewa_fit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteAccount$lambda$0$0(final SettingsActivity settingsActivity) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userIdentityBody = RequestBodyKt.getUserIdentityBody(settingsActivity.appUser);
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.SettingsActivity$deleteAccount$1$1$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                this.OXO1.exit();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final Activity mContext = settingsActivity.getMContext();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(mContext, settingsActivity.getRootView());
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/appuser/delete");
        netWorkUtils.printParam(strConvertBaseUrl + "/appuser/delete", userIdentityBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + "/appuser/delete";
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.me.SettingsActivity$deleteAccount$lambda$0$0$$inlined$post$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = mContext;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) userIdentityBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.me.SettingsActivity$deleteAccount$lambda$0$0$$inlined$post$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exit() {
        CleanUtils.cleanCustomDir(sz0.XIi00iiXO(sz0.OXO1, Location.EXTERNAL, hn1.XIi00iiXO.O00(), null, 4, null).getPath());
        CleanUtils.cleanExternalCache();
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().clear();
        i72 i72Var = i72.OXO1;
        if (i72Var.XXiIiX10()) {
            I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
            MyDb.INSTANCE.getMDatabase().clearAllTables();
            a01Var.m1440iO().clear();
            a01Var.XIi00iiXO().clear();
            BleCache.INSTANCE.clear();
            LogUtils.getConfig().setLogSwitch(false);
        }
        if (i72Var.O1i0()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(getMContext().getPackageName(), "com.sma.smartv3.ui.launcher.KumiLauncherActivity"));
            getMContext().startActivity(intent);
        } else {
            Intent intent2 = new Intent(this, (Class<?>) LauncherActivity.class);
            intent2.setFlags(268468224);
            startActivity(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean firmwareRepair$lambda$0$0(go0 go0Var) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.r74
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SettingsActivity.firmwareRepair$lambda$0$0$0();
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firmwareRepair$lambda$0$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout fitbitLl_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.fitbitLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fontRepair$lambda$0$0(go0 go0Var, final SettingsActivity settingsActivity) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.a64
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SettingsActivity.fontRepair$lambda$0$0$0(this.f5428IO);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fontRepair$lambda$0$0$0(SettingsActivity settingsActivity) {
        DeviceInfoChecker.iOO1ii1(DeviceInfoChecker.OXO1, settingsActivity, null, 2, null);
        return Unit.OXO1;
    }

    private final Button getBtSettingButton() {
        return (Button) this.btSettingButton$delegate.getValue();
    }

    private final TextView getCacheSize() {
        return (TextView) this.cacheSize$delegate.getValue();
    }

    private final CheckBox getCheckDataAutoSync() {
        return (CheckBox) this.checkDataAutoSync$delegate.getValue();
    }

    private final CheckBox getCheckFitbit() {
        return (CheckBox) this.checkFitbit$delegate.getValue();
    }

    private final CheckBox getCheckGoogleFit() {
        return (CheckBox) this.checkGoogleFit$delegate.getValue();
    }

    private final CheckBox getCheckNotificationBar() {
        return (CheckBox) this.checkNotificationBar$delegate.getValue();
    }

    private final CheckBox getCheckStrava() {
        return (CheckBox) this.checkStrava$delegate.getValue();
    }

    private final CheckBox getCheckZewaFit() {
        return (CheckBox) this.checkZewaFit$delegate.getValue();
    }

    private final LinearLayout getFitbitLl() {
        return (LinearLayout) this.fitbitLl$delegate.getValue();
    }

    private final ImageView getIvRemind() {
        return (ImageView) this.ivRemind$delegate.getValue();
    }

    private final LinearLayout getLlAdmobPrivacyOptions() {
        return (LinearLayout) this.llAdmobPrivacyOptions$delegate.getValue();
    }

    private final LinearLayout getLlAiKeySet() {
        return (LinearLayout) this.llAiKeySet$delegate.getValue();
    }

    private final LinearLayout getLlDataSavePlace() {
        return (LinearLayout) this.llDataSavePlace$delegate.getValue();
    }

    private final LinearLayout getLlDeleteAccount() {
        return (LinearLayout) this.llDeleteAccount$delegate.getValue();
    }

    private final LinearLayout getLlFirmwareRepair() {
        return (LinearLayout) this.llFirmwareRepair$delegate.getValue();
    }

    private final LinearLayout getLlFontRepair() {
        return (LinearLayout) this.llFontRepair$delegate.getValue();
    }

    private final LinearLayout getLlGPSFirmwareRepair() {
        return (LinearLayout) this.llGPSFirmwareRepair$delegate.getValue();
    }

    private final LinearLayout getLlGoogleFit() {
        return (LinearLayout) this.llGoogleFit$delegate.getValue();
    }

    private final LinearLayout getLlGoogleFitAuth() {
        return (LinearLayout) this.llGoogleFitAuth$delegate.getValue();
    }

    private final LinearLayout getLlHealthConnect() {
        return (LinearLayout) this.llHealthConnect$delegate.getValue();
    }

    private final LinearLayout getLlModifyPassword() {
        return (LinearLayout) this.llModifyPassword$delegate.getValue();
    }

    private final LinearLayout getLlUiRepair() {
        return (LinearLayout) this.llUiRepair$delegate.getValue();
    }

    private final LinearLayout getLlZewaFit() {
        return (LinearLayout) this.llZewaFit$delegate.getValue();
    }

    private final LinearLayout getNotificationBarLl() {
        return (LinearLayout) this.notificationBarLl$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final LinearLayout getStravaLl() {
        return (LinearLayout) this.stravaLl$delegate.getValue();
    }

    private final TextView getTvDataStorage() {
        return (TextView) this.tvDataStorage$delegate.getValue();
    }

    private final TextView getTvMap() {
        return (TextView) this.tvMap$delegate.getValue();
    }

    private final TextView getTvUnit() {
        return (TextView) this.tvUnit$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gpsFirmwareRepair$lambda$0(final SettingsActivity settingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        final go0 go0Var = new go0(settingsActivity, 0, 2, null);
        go0Var.O1O(R.string.gps_firmware_repair);
        go0Var.m1865iX(Integer.valueOf(R.string.firmware_repair_remind));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.q54
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(SettingsActivity.gpsFirmwareRepair$lambda$0$0$0(go0Var, settingsActivity));
            }
        });
        settingsActivity.mRepairPopup = go0Var;
        View rootView = settingsActivity.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gpsFirmwareRepair$lambda$0$0$0(go0 go0Var, final SettingsActivity settingsActivity) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.x74
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SettingsActivity.gpsFirmwareRepair$lambda$0$0$0$0(this.f12122IO);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gpsFirmwareRepair$lambda$0$0$0$0(SettingsActivity settingsActivity) {
        DeviceInfoChecker.XXIIO1i11(DeviceInfoChecker.OXO1, settingsActivity, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SettingsActivity settingsActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        LogUtils.m11128d("checkGoogleFit setOnCheckedChangeListener " + z);
        if (settingsActivity.isGoogleFitSyncBoolean) {
            settingsActivity.isGoogleFitSyncBoolean = false;
            return;
        }
        if (z) {
            X1IIXO.OXO1.XXI(settingsActivity);
        } else {
            X1IIXO.OXO1.m1144OX(settingsActivity);
        }
        a01.OXO1.IiI10X().put(b01.X1ii, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(final SettingsActivity settingsActivity, View view) {
        if (!settingsActivity.getCheckStrava().isChecked()) {
            if (i72.OXO1.Xi0I()) {
                StravaManager.INSTANCE.toStravaAppAuthorize(settingsActivity);
                return;
            } else {
                settingsActivity.startActivityForResult(new Intent(settingsActivity, (Class<?>) StravaAuthActivity.class), 514);
                return;
            }
        }
        if (settingsActivity.mLoadingPopup == null) {
            settingsActivity.mLoadingPopup = new C3006uq(settingsActivity.getMContext());
        }
        C3006uq c3006uq = settingsActivity.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.IIX1OXO();
        }
        StravaManager.INSTANCE.deauthorizeStrava(new Function1() { // from class: com.android.mltcode.paycertificationapi.q74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.initView$lambda$1$0(this.f10548IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$0(SettingsActivity settingsActivity, boolean z) {
        C3006uq c3006uq = settingsActivity.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
        if (z) {
            settingsActivity.getCheckStrava().setChecked(false);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(final SettingsActivity settingsActivity, View view) {
        if (!settingsActivity.getCheckFitbit().isChecked()) {
            settingsActivity.startActivityForResult(new Intent(settingsActivity, (Class<?>) FitbitAuthActivity.class), 515);
            return;
        }
        if (settingsActivity.mLoadingPopup == null) {
            settingsActivity.mLoadingPopup = new C3006uq(settingsActivity.getMContext());
        }
        C3006uq c3006uq = settingsActivity.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.IIX1OXO();
        }
        FitbitManager.INSTANCE.deauthorizeFit(new Function1() { // from class: com.android.mltcode.paycertificationapi.p74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.initView$lambda$2$0(this.f10304IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$0(SettingsActivity settingsActivity, boolean z) {
        C3006uq c3006uq = settingsActivity.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
        if (z) {
            settingsActivity.getCheckFitbit().setChecked(false);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(final SettingsActivity settingsActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        LogUtils.m11128d("setOnCheckedChangeListener " + z);
        a01.OXO1.IiI10X().put(b01.OII, z);
        if (z) {
            if (settingsActivity.mDataAutoSyncPopup == null) {
                go0 go0Var = new go0(settingsActivity, 0, 2, null);
                go0Var.O1O(R.string.use_reminder);
                go0Var.m1865iX(Integer.valueOf(R.string.data_sync_reminder));
                go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.t74
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(SettingsActivity.initView$lambda$3$0$0(this.f11203IO));
                    }
                });
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.u74
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(SettingsActivity.initView$lambda$3$0$1());
                    }
                });
                settingsActivity.mDataAutoSyncPopup = go0Var;
            }
            go0 go0Var2 = settingsActivity.mDataAutoSyncPopup;
            if (go0Var2 != null) {
                View rootView = settingsActivity.getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var2.I1XOi1(rootView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3$0$0(SettingsActivity settingsActivity) {
        settingsActivity.getCheckDataAutoSync().setChecked(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3$0$1() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(SettingsActivity settingsActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        LogUtils.m11128d("setOnCheckedChangeListener " + z);
        a01.OXO1.IiI10X().put(b01.IXI, z);
        if (!z) {
            com.sma.smartv3.biz.OXO1.XOO0ii0.OXO1().XXI();
        } else if (ContextCompat.checkSelfPermission(settingsActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            settingsActivity.startSmaNotification();
        } else {
            settingsActivity.requestLocationPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        LogUtils.m11128d("checkZewaFit setOnCheckedChangeListener " + z);
        a01.OXO1.IiI10X().put(b01.XOXiX0, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$7(SettingsActivity settingsActivity, boolean z) {
        settingsActivity.getCheckStrava().setChecked(z);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivRemind_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (ImageView) settingsActivity.findViewById(R.id.ivRemind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llAdmobPrivacyOptions_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_admob_privacy_options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llAiKeySet_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_aikey_set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llDataSavePlace_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_data_save_place);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llDeleteAccount_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_delete_account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llFirmwareRepair_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_firmware_repair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llFontRepair_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_font_repair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llGPSFirmwareRepair_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_gps_firmware_repair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llGoogleFitAuth_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_google_fit_auth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llGoogleFit_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_google_fit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llHealthConnect_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_health_connect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llModifyPassword_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_modify_password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llUiRepair_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_ui_repair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llZewaFit_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.ll_zewa_fit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout notificationBarLl_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.notificationBarLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBottomClick$lambda$0$0(final SettingsActivity settingsActivity, go0 go0Var) throws IllegalAccessException, InstantiationException {
        if (!BleConnector.INSTANCE.isBound()) {
            settingsActivity.exit();
            return true;
        }
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.SettingsActivity$onBottomClick$1$1$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                C3006uq c3006uq = this.OXO1.mLoadingPopup;
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
                this.OXO1.exit();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                C3006uq c3006uq = this.OXO1.mLoadingPopup;
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
                this.OXO1.exit();
            }
        });
        if (settingsActivity.mLoadingPopup == null) {
            settingsActivity.mLoadingPopup = new C3006uq(go0Var.XO0O10());
        }
        C3006uq c3006uq = settingsActivity.mLoadingPopup;
        if (c3006uq == null) {
            return true;
        }
        View rootView = settingsActivity.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        c3006uq.I1XOi1(rootView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$0(SettingsActivity settingsActivity, boolean z) {
        settingsActivity.getCheckStrava().setChecked(z);
        return Unit.OXO1;
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (this.mPermissionBackgroundPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.background_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.s54
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SettingsActivity.permissionBackgroundLocationRemind$lambda$0$0(this.f10969IO));
                }
            });
            this.mPermissionBackgroundPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionBackgroundPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionBackgroundLocationRemind$lambda$0$0(SettingsActivity settingsActivity) {
        settingsActivity.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= 29) {
            permissionBackgroundLocationRemind();
            return;
        }
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.w64
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.requestLocationPermission$lambda$0(this.f11894IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationPermission$lambda$0(SettingsActivity settingsActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        int i = XIi00iiXO.OXO1[it.ordinal()];
        if (i == 1) {
            settingsActivity.startSmaNotification();
        } else if (i != 2) {
            settingsActivity.permissionRemind();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(SettingsActivity settingsActivity) {
        return settingsActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectMap$lambda$0$0(SettingsActivity settingsActivity, int i) {
        a01.OXO1.OXO1().put(b01.XiOIO, i == 1);
        I01XX0.XIi00iiXO(b01.XiOIO, null, 2, null);
        settingsActivity.setupMap();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectUnit$lambda$0$0(final SettingsActivity settingsActivity, int i) {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        appUser2.setUnit(i == 0 ? 0 : 1);
        settingsActivity.setupUnit(appUser2);
        settingsActivity.appUser = appUser2;
        a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser2));
        I01XX0.XIi00iiXO(I01XX0.IiiXiI0I, null, 2, null);
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.l74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.selectUnit$lambda$0$0$1(this.f9371IO, (BleConnector) obj);
            }
        }, 1, null);
        ToastUtils.showLong(R.string.reboot_app_show_new_view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectUnit$lambda$0$0$1(SettingsActivity settingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.USER_PROFILE, BleKeyFlag.UPDATE, settingsActivity.appUser.getBleUserProfile(), false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    private final void setDataStorage() {
        String string;
        getTvDataStorage().setText(a01.OXO1.IiI10X().getString(b01.II1Xi0));
        CharSequence text = getTvDataStorage().getText();
        Intrinsics.O10IXXX0X(text, "getText(...)");
        if (text.length() == 0) {
            TextView tvDataStorage = getTvDataStorage();
            String base_url = Api.INSTANCE.getBASE_URL();
            int iHashCode = base_url.hashCode();
            if (iHashCode != -1644804843) {
                if (iHashCode != -167076722) {
                    if (iHashCode == 1582655416 && base_url.equals(e44.f6332iO)) {
                        string = getString(R.string.china_mainland);
                    } else {
                        string = "Test Server";
                    }
                } else if (base_url.equals(e44.OXO1)) {
                    string = getString(R.string.asia_pacific);
                } else {
                    string = "Test Server";
                }
            } else if (base_url.equals(e44.XIi00iiXO)) {
                string = getString(R.string.europe_and_america);
            } else {
                string = "Test Server";
            }
            tvDataStorage.setText(string);
        }
    }

    private final void setupMap() {
        getTvMap().setText(a01.OXO1.OXO1().getBoolean(b01.XiOIO) ? R.string.baidu_map : R.string.google_map);
    }

    private final void setupUnit(AppUser appUser) {
        getTvUnit().setText(appUser.getUnit() == 0 ? R.string.metric : R.string.imperial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout stravaLl_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (LinearLayout) settingsActivity.findViewById(R.id.stravaLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDataStorage_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (TextView) settingsActivity.findViewById(R.id.tv_data_storage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMap_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (TextView) settingsActivity.findViewById(R.id.tv_map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvUnit_delegate$lambda$0(SettingsActivity settingsActivity) {
        return (TextView) settingsActivity.findViewById(R.id.tv_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean uiRepair$lambda$0$0(go0 go0Var, final SettingsActivity settingsActivity) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.m74
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SettingsActivity.uiRepair$lambda$0$0$0(this.f9642IO);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uiRepair$lambda$0$0$0(SettingsActivity settingsActivity) {
        DeviceInfoChecker.iX1O1(DeviceInfoChecker.OXO1, settingsActivity, null, 2, null);
        return Unit.OXO1;
    }

    public final void accessToThirdParties(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ToastUtils.showLong("accessToThirdParties", new Object[0]);
    }

    public final void admobPrivacyOptions(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (i72.OXO1.IOi1O0()) {
            ADPAdManager.INSTANCE.showPrivacyOptionsForm(this);
        }
    }

    public final void aiKeySet(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) AiKeySetActivity.class));
    }

    public final void cacheClean(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mCleaning) {
            return;
        }
        if (this.mCacheCleanPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.cache_clean_confirm);
            go0Var.I0iXXO(false);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.y74
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SettingsActivity.cacheClean$lambda$0$0(this.f12326IO));
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.z74
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SettingsActivity.cacheClean$lambda$0$1(this.f12550IO));
                }
            });
            this.mCacheCleanPopup = go0Var;
        }
        this.mCleaning = true;
        go0 go0Var2 = this.mCacheCleanPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void checkUpdate(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.downloadUrl.length() > 0) {
            X1OOO.i010I(this, this.downloadUrl);
        } else {
            ToastUtils.showLong(R.string.already_the_latest_version);
        }
    }

    public final void deleteAccount(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeleteUserPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_user_confirm);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.l64
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SettingsActivity.deleteAccount$lambda$0$0(this.f9364IO));
                }
            });
            this.mDeleteUserPopup = go0Var;
        }
        go0 go0Var2 = this.mDeleteUserPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void firmwareRepair(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        final go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(R.string.firmware_repair);
        go0Var.m1865iX(Integer.valueOf(R.string.firmware_repair_remind));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.w74
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(SettingsActivity.firmwareRepair$lambda$0$0(go0Var));
            }
        });
        this.mRepairPopup = go0Var;
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    public final void fontRepair(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        final go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(R.string.pair_confirm_title);
        go0Var.m1865iX(Integer.valueOf(R.string.firmware_repair_tip));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.c64
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(SettingsActivity.fontRepair$lambda$0$0(go0Var, this));
            }
        });
        this.mRepairPopup = go0Var;
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    public final void googleFitAuth(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) GoogleFitAuthActivity.class));
    }

    public final void googleFitClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void googleHealthConnect(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) HealthConnectActivity.class));
    }

    public final void gpsFirmwareRepair(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.v74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.gpsFirmwareRepair$lambda$0(this.f11668IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.settings);
        LinearLayout stravaLl = getStravaLl();
        i72 i72Var = i72.OXO1;
        stravaLl.setVisibility(i72Var.I1Ii() ? 0 : 8);
        getFitbitLl().setVisibility(i72Var.OI1i1i() ? 0 : 8);
        getLlHealthConnect().setVisibility(i72Var.XOO0Xi() ? 0 : 8);
        View viewFindViewById = findViewById(R.id.tv_map_right_img);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i72Var.i1iII1i1() ? 0 : 8);
        }
        setDataStorage();
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        setupUnit((AppUser) appUser);
        setupMap();
        SPUtils sPUtilsOXO1 = a01Var.OXO1();
        Object appVersion = new AppVersion(0, null, null, null, null, null, 0, 127, null);
        Object objFromJson2 = new Gson().fromJson(sPUtilsOXO1.getString(AppVersion.class.getName()), (Class<Object>) AppVersion.class);
        if (objFromJson2 != null) {
            appVersion = objFromJson2;
        }
        AppVersion appVersion2 = (AppVersion) appVersion;
        if (appVersion2.getFileUrl().length() > 0) {
            getIvRemind().setVisibility(0);
            this.downloadUrl = appVersion2.getFileUrl();
        } else {
            getIvRemind().setVisibility(8);
        }
        getCheckGoogleFit().setChecked(a01Var.IiI10X().getBoolean(b01.X1ii));
        getCheckGoogleFit().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.t54
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingsActivity.initView$lambda$0(this.f11192IO, compoundButton, z);
            }
        });
        CheckBox checkStrava = getCheckStrava();
        StravaManager stravaManager = StravaManager.INSTANCE;
        checkStrava.setChecked(stravaManager.isEnabled());
        ViewParent parent = getCheckStrava().getParent();
        Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.u54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity.initView$lambda$1(this.f11425IO, view);
            }
        });
        getCheckFitbit().setChecked(FitbitManager.INSTANCE.isEnabled());
        ViewParent parent2 = getCheckFitbit().getParent();
        Intrinsics.X1ii(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent2).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.v54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity.initView$lambda$2(this.f11649IO, view);
            }
        });
        getCheckDataAutoSync().setChecked(a01Var.IiI10X().getBoolean(b01.OII));
        getCheckDataAutoSync().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.w54
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingsActivity.initView$lambda$3(this.f11888IO, compoundButton, z);
            }
        });
        getCacheSize().setText(FileUtils.getSize(uz0.X0i1O(sz0.OXO1)));
        if (!a01Var.IiI10X().getBoolean(b01.O001I, true) || this.appUser.getIdentity().length() <= 0) {
            getLlDeleteAccount().setVisibility(8);
            getLlModifyPassword().setVisibility(8);
            getLlDataSavePlace().setVisibility(8);
            getLlGoogleFit().setVisibility(8);
            LinearLayout llGoogleFitAuth = getLlGoogleFitAuth();
            if (llGoogleFitAuth != null) {
                llGoogleFitAuth.setVisibility(8);
            }
            getStravaLl().setVisibility(8);
            getBtSettingButton().setText(R.string.login);
            getLlZewaFit().setVisibility(8);
        } else {
            getLlDeleteAccount().setVisibility(0);
            getLlModifyPassword().setVisibility(0);
            getLlDataSavePlace().setVisibility(i72Var.I11X11OX() ? 0 : 8);
            getLlGoogleFit().setVisibility(8);
            getBtSettingButton().setText(R.string.logout);
            getLlZewaFit().setVisibility(i72Var.iOXiO1O1I() ? 0 : 8);
        }
        getBtSettingButton().setVisibility(i72Var.ii0111XI() ? 0 : 8);
        LinearLayout notificationBarLl = getNotificationBarLl();
        q62 q62Var = q62.OXO1;
        notificationBarLl.setVisibility(q62Var.O00OXOXO() ? 0 : 8);
        if (Build.VERSION.SDK_INT >= 34) {
            getCheckNotificationBar().setChecked(a01Var.IiI10X().getBoolean(b01.IXI, true) && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0);
        } else {
            getCheckNotificationBar().setChecked(a01Var.IiI10X().getBoolean(b01.IXI, true));
        }
        getCheckNotificationBar().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.x54
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingsActivity.initView$lambda$4(this.f12108IO, compoundButton, z);
            }
        });
        getLlAiKeySet().setVisibility(q62Var.OOX1I() ? 0 : 8);
        if (!i72Var.X00Xi1X() || i72Var.I0OX()) {
            getLlFontRepair().setVisibility(8);
            getLlUiRepair().setVisibility(8);
            getLlFirmwareRepair().setVisibility(8);
        } else {
            getLlFontRepair().setVisibility(q62Var.XIIO11I() ? 0 : 8);
            getLlUiRepair().setVisibility((q62Var.I0i0() && q62Var.X1i()) ? 0 : 8);
            getLlFirmwareRepair().setVisibility(q62Var.iii0() ? 0 : 8);
        }
        getLlGPSFirmwareRepair().setVisibility(q62Var.m2891i1() ? 0 : 8);
        getLlAdmobPrivacyOptions().setVisibility(a01Var.OXO1().getBoolean(b01.XIIO11I, false) ? 0 : 8);
        getCheckZewaFit().setChecked(a01Var.IiI10X().getBoolean(b01.XOXiX0));
        getCheckZewaFit().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.y54
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingsActivity.initView$lambda$5(compoundButton, z);
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.z54
            @Override // java.lang.Runnable
            public final void run() {
                this.f12543IO.checkUpgradeFailedDevice();
            }
        }, 500L);
        Intent intent = getIntent();
        Intrinsics.O10IXXX0X(intent, "getIntent(...)");
        stravaManager.handleStravaAppIntent(this, intent, new Function1() { // from class: com.android.mltcode.paycertificationapi.b64
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.initView$lambda$7(this.f5676IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_settings;
    }

    public final void modifyPassword(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i72.OXO1.OXOI0XII(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtils.m11128d(i + " " + i2 + " " + intent);
        if (i == 514) {
            if (i2 == -1) {
                getCheckStrava().setChecked(true);
            }
        } else if (i != 515) {
            this.isGoogleFitSyncBoolean = true;
            getCheckGoogleFit().setChecked(X1IIXO.OXO1.O10IXXX0X(this, i, i2));
            a01.OXO1.IiI10X().put(b01.X1ii, getCheckGoogleFit().isChecked());
        } else if (i2 == -1) {
            getCheckFitbit().setChecked(true);
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        if (!a01Var.IiI10X().getBoolean(b01.O001I, true) || this.appUser.getIdentity().length() <= 0) {
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
            i72.OXO1.Oi1I(this);
            return;
        }
        if (q62.OXO1.iii0() && a01Var.XIi00iiXO().getBoolean(b01.IiI10X)) {
            return;
        }
        if (this.mLogoutPopup == null) {
            final go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.logout_confirm);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.h74
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SettingsActivity.onBottomClick$lambda$0$0(this.f7055IO, go0Var));
                }
            });
            this.mLogoutPopup = go0Var;
        }
        go0 go0Var2 = this.mLogoutPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@aa1 Intent intent) {
        Intrinsics.X0O(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        StravaManager.INSTANCE.handleStravaAppIntent(this, intent, new Function1() { // from class: com.android.mltcode.paycertificationapi.s74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SettingsActivity.onNewIntent$lambda$0(this.f10979IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.permission_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.o74
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SettingsActivity.permissionRemind$lambda$0$0());
                }
            });
            this.mPermissionPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void selectMap(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (i72.OXO1.i1iII1i1()) {
            if (this.mMapPopup == null) {
                pv1 pv1Var = new pv1(getMContext(), R.array.maps);
                pv1Var.IXXOO(true);
                pv1Var.m2858iX(R.string.map_select);
                pv1Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.p54
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(SettingsActivity.selectMap$lambda$0$0(this.f10296IO, ((Integer) obj).intValue()));
                    }
                });
                this.mMapPopup = pv1Var;
            }
            pv1 pv1Var2 = this.mMapPopup;
            if (pv1Var2 != null) {
                pv1Var2.iOO1ii1(a01.OXO1.OXO1().getBoolean(b01.XiOIO) ? 1 : 0);
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                pv1Var2.I1XOi1(rootView);
            }
        }
    }

    public final void selectUnit(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mUnitPopup == null) {
            pv1 pv1Var = new pv1(getMContext(), R.array.units);
            pv1Var.IXXOO(true);
            pv1Var.m2858iX(R.string.unit);
            pv1Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.k74
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(SettingsActivity.selectUnit$lambda$0$0(this.f9120IO, ((Integer) obj).intValue()));
                }
            });
            this.mUnitPopup = pv1Var;
        }
        pv1 pv1Var2 = this.mUnitPopup;
        if (pv1Var2 != null) {
            pv1Var2.iOO1ii1(this.appUser.getUnit() == 0 ? 0 : 1);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            pv1Var2.I1XOi1(rootView);
        }
    }

    public final void startSmaNotification() {
        com.sma.smartv3.biz.OXO1.C22035OXO1 c22035oxo1 = com.sma.smartv3.biz.OXO1.XOO0ii0;
        c22035oxo1.OXO1().I0iXXO();
        com.sma.smartv3.biz.OXO1.I1XOi1(c22035oxo1.OXO1(), 0, 0, null, 4, null);
        I01XX0.XIi00iiXO(I01XX0.OXO1, null, 2, null);
    }

    public final void stravaClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void uiRepair(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        final go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(R.string.ui_repair);
        go0Var.m1865iX(Integer.valueOf(R.string.ui_repair_remind));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.r54
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(SettingsActivity.uiRepair$lambda$0$0(go0Var, this));
            }
        });
        this.mRepairPopup = go0Var;
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
    }

    public final void zewaFitClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }
}
