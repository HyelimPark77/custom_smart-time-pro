package com.sma.smartv3.ui.me;

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
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1IIXO;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a64;
import com.android.mltcode.paycertificationapi.a74;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b64;
import com.android.mltcode.paycertificationapi.b74;
import com.android.mltcode.paycertificationapi.c64;
import com.android.mltcode.paycertificationapi.c74;
import com.android.mltcode.paycertificationapi.d64;
import com.android.mltcode.paycertificationapi.d74;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.e64;
import com.android.mltcode.paycertificationapi.e74;
import com.android.mltcode.paycertificationapi.f64;
import com.android.mltcode.paycertificationapi.f74;
import com.android.mltcode.paycertificationapi.g64;
import com.android.mltcode.paycertificationapi.g74;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.h64;
import com.android.mltcode.paycertificationapi.h74;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i64;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.i74;
import com.android.mltcode.paycertificationapi.j64;
import com.android.mltcode.paycertificationapi.j74;
import com.android.mltcode.paycertificationapi.k64;
import com.android.mltcode.paycertificationapi.k74;
import com.android.mltcode.paycertificationapi.l64;
import com.android.mltcode.paycertificationapi.l74;
import com.android.mltcode.paycertificationapi.m64;
import com.android.mltcode.paycertificationapi.m74;
import com.android.mltcode.paycertificationapi.n64;
import com.android.mltcode.paycertificationapi.n74;
import com.android.mltcode.paycertificationapi.o64;
import com.android.mltcode.paycertificationapi.o74;
import com.android.mltcode.paycertificationapi.p54;
import com.android.mltcode.paycertificationapi.p64;
import com.android.mltcode.paycertificationapi.p74;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.q54;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.q64;
import com.android.mltcode.paycertificationapi.q74;
import com.android.mltcode.paycertificationapi.r54;
import com.android.mltcode.paycertificationapi.r64;
import com.android.mltcode.paycertificationapi.r74;
import com.android.mltcode.paycertificationapi.s54;
import com.android.mltcode.paycertificationapi.s64;
import com.android.mltcode.paycertificationapi.s74;
import com.android.mltcode.paycertificationapi.sc;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.t54;
import com.android.mltcode.paycertificationapi.t64;
import com.android.mltcode.paycertificationapi.t74;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u54;
import com.android.mltcode.paycertificationapi.u64;
import com.android.mltcode.paycertificationapi.u74;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.v54;
import com.android.mltcode.paycertificationapi.v64;
import com.android.mltcode.paycertificationapi.v74;
import com.android.mltcode.paycertificationapi.w54;
import com.android.mltcode.paycertificationapi.w64;
import com.android.mltcode.paycertificationapi.w74;
import com.android.mltcode.paycertificationapi.x54;
import com.android.mltcode.paycertificationapi.x64;
import com.android.mltcode.paycertificationapi.x74;
import com.android.mltcode.paycertificationapi.y54;
import com.android.mltcode.paycertificationapi.y64;
import com.android.mltcode.paycertificationapi.y74;
import com.android.mltcode.paycertificationapi.z54;
import com.android.mltcode.paycertificationapi.z64;
import com.android.mltcode.paycertificationapi.z74;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.io.Location;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.CleanUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jieli.bluetooth_connect.util.JL_Log;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.ad.ADPAdManager;
import com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager;
import com.sma.smartv3.biz.fitness_site.strava.StravaManager;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.AppVersion;
import com.sma.smartv3.model.UpgradeFailedDeviceData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.FirmwareRepairSearchActivity;
import com.sma.smartv3.ui.fitness_site.FitbitAuthActivity;
import com.sma.smartv3.ui.fitness_site.StravaAuthActivity;
import com.sma.smartv3.ui.launcher.LauncherActivity;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsActivity.kt\ncom/sma/smartv3/ui/me/SettingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 7 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,801:1\n19#2:802\n15#2:803\n19#2:804\n15#2:805\n19#2:806\n15#2:807\n19#2:835\n15#2:836\n11#2,2:837\n19#2:874\n15#2:875\n11#2,2:876\n11#2,2:891\n69#3,3:808\n72#3,5:812\n69#3,3:817\n72#3,5:821\n69#3,3:826\n72#3,5:830\n69#3,3:839\n72#3,5:843\n140#3,5:852\n145#3,5:858\n140#3,5:863\n145#3,5:869\n69#3,3:893\n72#3,5:897\n1#4:811\n1#4:820\n1#4:829\n1#4:842\n1#4:857\n1#4:868\n1#4:896\n1563#5:848\n1634#5,3:849\n183#6,4:878\n196#6:890\n252#7,7:882\n270#7:889\n*S KotlinDebug\n*F\n+ 1 SettingsActivity.kt\ncom/sma/smartv3/ui/me/SettingsActivity\n*L\n104#1:802\n104#1:803\n138#1:804\n138#1:805\n141#1:806\n141#1:807\n649#1:835\n649#1:836\n650#1:837,2\n400#1:874\n400#1:875\n405#1:876,2\n711#1:891,2\n371#1:808,3\n371#1:812,5\n383#1:817,3\n383#1:821,5\n494#1:826,3\n494#1:830,5\n688#1:839,3\n688#1:843,5\n183#1:852,5\n183#1:858,5\n203#1:863,5\n203#1:869,5\n712#1:893,3\n712#1:897,5\n371#1:811\n383#1:820\n494#1:829\n688#1:842\n183#1:857\n203#1:868\n712#1:896\n698#1:848\n698#1:849,3\n472#1:878,4\n472#1:890\n472#1:882,7\n472#1:889\n*E\n"})
public class SettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int REQUEST_ENABLE_FITBIT_SYNC = 515;
    public static final int REQUEST_ENABLE_STRAVA_SYNC = 514;
    public static final int REQUEST_PERMISSION_SERVER = 3;

    @aa1
    private AppUser appUser;

    @aa1
    private final Lazy btSettingButton$delegate;

    @aa1
    private final Lazy cacheSize$delegate;

    @aa1
    private final Lazy checkDataAutoSync$delegate;

    @aa1
    private final Lazy checkFitbit$delegate;

    @aa1
    private final Lazy checkGoogleFit$delegate;

    @aa1
    private final Lazy checkNotificationBar$delegate;

    @aa1
    private final Lazy checkStrava$delegate;

    @aa1
    private final Lazy checkZewaFit$delegate;

    @aa1
    private String downloadUrl;

    @aa1
    private final Lazy fitbitLl$delegate;
    private boolean isGoogleFitSyncBoolean;

    @aa1
    private final Lazy ivRemind$delegate;

    @aa1
    private final Lazy llAdmobPrivacyOptions$delegate;

    @aa1
    private final Lazy llAiKeySet$delegate;

    @aa1
    private final Lazy llDataSavePlace$delegate;

    @aa1
    private final Lazy llDeleteAccount$delegate;

    @aa1
    private final Lazy llFirmwareRepair$delegate;

    @aa1
    private final Lazy llFontRepair$delegate;

    @aa1
    private final Lazy llGPSFirmwareRepair$delegate;

    @aa1
    private final Lazy llGoogleFit$delegate;

    @aa1
    private final Lazy llGoogleFitAuth$delegate;

    @aa1
    private final Lazy llHealthConnect$delegate;

    @aa1
    private final Lazy llModifyPassword$delegate;

    @aa1
    private final Lazy llUiRepair$delegate;

    @aa1
    private final Lazy llZewaFit$delegate;

    @tb1
    private go0 mCacheCleanPopup;
    private boolean mCleaning;

    @tb1
    private go0 mDataAutoSyncPopup;

    @tb1
    private go0 mDeleteUserPopup;

    @tb1
    private uq mLoadingPopup;

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
    private final Lazy notificationBarLl$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy stravaLl$delegate;

    @aa1
    private final Lazy tvDataStorage$delegate;

    @aa1
    private final Lazy tvMap$delegate;

    @aa1
    private final Lazy tvUnit$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[PermissionStatus.values().length];
            r0[PermissionStatus.GRANTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[PermissionStatus.DENIED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new e64(this));
        this.tvUnit$delegate = LazyKt__LazyJVMKt.iO(new q64(this));
        this.tvMap$delegate = LazyKt__LazyJVMKt.iO(new b74(this));
        this.tvDataStorage$delegate = LazyKt__LazyJVMKt.iO(new c74(this));
        this.ivRemind$delegate = LazyKt__LazyJVMKt.iO(new d74(this));
        this.checkGoogleFit$delegate = LazyKt__LazyJVMKt.iO(new e74(this));
        this.checkStrava$delegate = LazyKt__LazyJVMKt.iO(new f74(this));
        this.checkDataAutoSync$delegate = LazyKt__LazyJVMKt.iO(new g74(this));
        this.stravaLl$delegate = LazyKt__LazyJVMKt.iO(new i74(this));
        this.cacheSize$delegate = LazyKt__LazyJVMKt.iO(new j74(this));
        this.llDeleteAccount$delegate = LazyKt__LazyJVMKt.iO(new f64(this));
        this.llModifyPassword$delegate = LazyKt__LazyJVMKt.iO(new g64(this));
        this.llAiKeySet$delegate = LazyKt__LazyJVMKt.iO(new h64(this));
        this.llUiRepair$delegate = LazyKt__LazyJVMKt.iO(new i64(this));
        this.llFontRepair$delegate = LazyKt__LazyJVMKt.iO(new j64(this));
        this.llFirmwareRepair$delegate = LazyKt__LazyJVMKt.iO(new k64(this));
        this.llGPSFirmwareRepair$delegate = LazyKt__LazyJVMKt.iO(new m64(this));
        this.llAdmobPrivacyOptions$delegate = LazyKt__LazyJVMKt.iO(new n64(this));
        this.llDataSavePlace$delegate = LazyKt__LazyJVMKt.iO(new o64(this));
        this.btSettingButton$delegate = LazyKt__LazyJVMKt.iO(new p64(this));
        this.llGoogleFit$delegate = LazyKt__LazyJVMKt.iO(new r64(this));
        this.llGoogleFitAuth$delegate = LazyKt__LazyJVMKt.iO(new s64(this));
        this.checkNotificationBar$delegate = LazyKt__LazyJVMKt.iO(new t64(this));
        this.notificationBarLl$delegate = LazyKt__LazyJVMKt.iO(new u64(this));
        this.llHealthConnect$delegate = LazyKt__LazyJVMKt.iO(new v64(this));
        this.llZewaFit$delegate = LazyKt__LazyJVMKt.iO(new x64(this));
        this.checkZewaFit$delegate = LazyKt__LazyJVMKt.iO(new y64(this));
        this.checkFitbit$delegate = LazyKt__LazyJVMKt.iO(new z64(this));
        this.fitbitLl$delegate = LazyKt__LazyJVMKt.iO(new a74(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.appUser = (AppUser) r2;
        this.downloadUrl = "";
    }

    public static /* synthetic */ LinearLayout I0iXXO(SettingsActivity r0) {
        return llAiKeySet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I1(SettingsActivity r0) {
        cacheClean$lambda$0$1$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(SettingsActivity r0, boolean r1) {
        return initView$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout II1Xi0(SettingsActivity r0) {
        return llModifyPassword_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout IIX1OXO(SettingsActivity r0) {
        return llZewaFit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IO0II0i(go0 r0) {
        return firmwareRepair$lambda$0$0(r0);
    }

    public static /* synthetic */ void IXI(SettingsActivity r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ boolean IXOIIIO(SettingsActivity r0, go0 r1) {
        return onBottomClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean IXXOO(SettingsActivity r0) {
        return cacheClean$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean Ii0X0X(SettingsActivity r0) {
        return cacheClean$lambda$0$1(r0);
    }

    public static /* synthetic */ LinearLayout Ii0i(SettingsActivity r0) {
        return fitbitLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView Ii1iii0(SettingsActivity r0) {
        return tvDataStorage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IiiXiI0I(SettingsActivity r0) {
        return fontRepair$lambda$0$0$0(r0);
    }

    public static /* synthetic */ LinearLayout O001I(SettingsActivity r0) {
        return llAdmobPrivacyOptions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(SettingsActivity r0) {
        return stravaLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O1O(SettingsActivity r0, int r1) {
        return selectUnit$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout OII(SettingsActivity r0) {
        return llHealthConnect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OIX0iXi(SettingsActivity r0) {
        return llGoogleFitAuth_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OO(SettingsActivity r0) {
        return tvMap_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OX(SettingsActivity r0, CompoundButton r1, boolean r2) {
        initView$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OX110i(SettingsActivity r0, BleConnector r1) {
        return selectUnit$lambda$0$0$1(r0, r1);
    }

    public static /* synthetic */ LinearLayout Oi(SettingsActivity r0) {
        return llDataSavePlace_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(SettingsActivity r0, CompoundButton r1, boolean r2) {
        initView$lambda$4(r0, r1, r2);
    }

    public static /* synthetic */ LinearLayout X00XIX1(SettingsActivity r0) {
        return notificationBarLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X00Xi1X(SettingsActivity r0, int r1) {
        return selectMap$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(SettingsActivity r0) {
        return gpsFirmwareRepair$lambda$0$0$0$0(r0);
    }

    public static /* synthetic */ boolean X0O() {
        return permissionRemind$lambda$0$0();
    }

    public static /* synthetic */ LinearLayout X0i1O(SettingsActivity r0) {
        return llUiRepair_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1(SettingsActivity r0) {
        return llGPSFirmwareRepair_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox X100O(SettingsActivity r0) {
        return checkDataAutoSync_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X11I(CompoundButton r0, boolean r1) {
        initView$lambda$5(r0, r1);
    }

    public static /* synthetic */ boolean X11iII1O1(go0 r0, SettingsActivity r1) {
        return fontRepair$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View X1IX(SettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(SettingsActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit XO0X10iO(SettingsActivity r0, BleConnector r1) {
        return gpsFirmwareRepair$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XOIX(SettingsActivity r0, CompoundButton r1, boolean r2) {
        initView$lambda$3(r0, r1, r2);
    }

    public static /* synthetic */ Unit XOO0XOOii() {
        return firmwareRepair$lambda$0$0$0();
    }

    public static /* synthetic */ boolean XOX0O0(SettingsActivity r0) {
        return permissionBackgroundLocationRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ ImageView XOXiX0(SettingsActivity r0) {
        return ivRemind_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XX0(SettingsActivity r0) {
        return initView$lambda$3$0$0(r0);
    }

    public static /* synthetic */ CheckBox XX1Oi(SettingsActivity r0) {
        return checkFitbit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXI(SettingsActivity r0) {
        return llDeleteAccount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXIIO1i11(SettingsActivity r0) {
        return llFontRepair_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXO(SettingsActivity r0) {
        return tvUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXX11i(SettingsActivity r0, boolean r1) {
        return onNewIntent$lambda$0(r0, r1);
    }

    public static /* synthetic */ CheckBox XXiIiX10(SettingsActivity r0) {
        return checkStrava_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIO(go0 r0, SettingsActivity r1) {
        return gpsFirmwareRepair$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIii1(go0 r0, SettingsActivity r1) {
        return uiRepair$lambda$0$0(r0, r1);
    }

    public static final /* synthetic */ void access$exit(SettingsActivity r0) {
        r0.exit();
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(SettingsActivity r0) {
        return r0.mLoadingPopup;
    }

    private static final Button btSettingButton_delegate$lambda$0(SettingsActivity r1) {
        return (Button) r1.findViewById(R.id.bt_setting_button);
    }

    private static final boolean cacheClean$lambda$0$0(SettingsActivity r1) {
        r1.mCleaning = false;
        return true;
    }

    private static final boolean cacheClean$lambda$0$1(final SettingsActivity r4) {
        sz0 r0 = sz0.OXO1;
        FileUtils.delete(uz0.X0i1O(r0));
        FileUtils.delete(uz0.I0iXXO(r0));
        FileUtils.delete(r4.getMContext().getCacheDir());
        sc.OXO1(r4);
        FileUtils.delete(JL_Log.getSaveLogPath(r4.getMContext()));
        FileUtils.delete(uz0.X1IX(r0));
        a01.OXO1.O00().clear();
        r4.getCacheSize().setText(R.string.cache_cleaning);
        new Handler().postDelayed(new d64(r4), 10000);
        return true;
    }

    private static final void cacheClean$lambda$0$1$0(SettingsActivity r2) {
        if (r2.isFinishing() == true) goto L6;
        r2.getCacheSize().setText("0KB");
        r2.mCleaning = false;
        return;
    }

    private static final TextView cacheSize_delegate$lambda$0(SettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_cache_size);
    }

    private static final CheckBox checkDataAutoSync_delegate$lambda$0(SettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_data_auto_sync);
    }

    private static final CheckBox checkFitbit_delegate$lambda$0(SettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_fitbit);
    }

    private static final CheckBox checkGoogleFit_delegate$lambda$0(SettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_google_fit);
    }

    private static final CheckBox checkNotificationBar_delegate$lambda$0(SettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_notification_bar);
    }

    private static final CheckBox checkStrava_delegate$lambda$0(SettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_strava);
    }

    private final void checkUpgradeFailedDevice() {
        final List<BleDeviceInfo> r0 = UpgradeFailedDeviceData.INSTANCE.getList();
        LogUtils.d(new Object[]{"checkUpgradeFailedDevice -> List : " + r0});
        if (r0.isEmpty() == true) goto L11;
        List<BleDeviceInfo> r1 = r0;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
        Iterator<T> r2 = r1.iterator();
    L6:
        if (r2.hasNext() == false) goto L8;
        r4.add(((BleDeviceInfo) r2.next()).getMBleName());
        goto L6
    L8:
        dj4 r3 = new dj4(this, r4, 0, 4, null);
        r3.iX(R.string.check_firmware_upgrade_failed_tip);
        r3.i010I(new n74(r0, this));
        View r5 = getRootView();
        Intrinsics.O10IXXX0X(r5, "<get-rootView>(...)");
        r3.I1XOi1(r5);
        return;
    }

    private static final boolean checkUpgradeFailedDevice$lambda$1$0(List r2, SettingsActivity r3, int r4) {
        if (r4 != (-1)) goto L7;
        return false;
    L7:
        if (Intrinsics.XOO0ii0(((BleDeviceInfo) r2.get(r4)).getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L9;
    L14:
        SPUtils r0 = a01.OXO1.XO0O10();
        Object r5 = r2.get(r4);
        r0.put(BleDeviceInfo.class.getName(), new Gson().toJson(r5));
        r3.startActivity(new Intent(r3, FirmwareRepairSearchActivity.class));
        return true;
    L9:
        if (Intrinsics.XOO0ii0(((BleDeviceInfo) r2.get(r4)).getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L14;
        if (Intrinsics.XOO0ii0(((BleDeviceInfo) r2.get(r4)).getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L14;
        ToastUtils.showLong(R.string.stay_tuned);
        return true;
    }

    private static final CheckBox checkZewaFit_delegate$lambda$0(SettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_zewa_fit);
    }

    private static final boolean deleteAccount$lambda$0$0(final SettingsActivity r7) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getUserIdentityBody(r7.appUser);
        final O1XIiIO<String> r2 = new SettingsActivity$deleteAccount$1$1$1(r7);
        final Activity r3 = r7.getMContext();
        final uq r8 = r0.loadPopup(r3, r7.getRootView());
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/appuser/delete");
        r0.printParam(r4 + "/appuser/delete", r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + "/appuser/delete";
        final O1XIiIO<Response<String>> r9 = new SettingsActivity$deleteAccount$lambda$0$0$$inlined$post$1(r3, r2, r8);
        AndroidNetworking.post(r6).addBodyParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new SettingsActivity$deleteAccount$lambda$0$0$$inlined$post$2(r9));
        return true;
    }

    private final void exit() {
        CleanUtils.cleanCustomDir(sz0.XIi00iiXO(sz0.OXO1, Location.EXTERNAL, hn1.XIi00iiXO.O00(), null, 4, null).getPath());
        CleanUtils.cleanExternalCache();
        a01 r0 = a01.OXO1;
        r0.IiI10X().clear();
        i72 r1 = i72.OXO1;
        if (r1.XXiIiX10() == false) goto L6;
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        MyDb.INSTANCE.getMDatabase().clearAllTables();
        r0.iO().clear();
        r0.XIi00iiXO().clear();
        BleCache.INSTANCE.clear();
        LogUtils.getConfig().setLogSwitch(false);
    L6:
        if (r1.O1i0() == false) goto L9;
        Intent r2 = new Intent();
        r2.setComponent(new ComponentName(getMContext().getPackageName(), "com.sma.smartv3.ui.launcher.KumiLauncherActivity"));
        getMContext().startActivity(r2);
        return;
    L9:
        Intent r3 = new Intent(this, LauncherActivity.class);
        r3.setFlags(268468224);
        startActivity(r3);
    }

    private static final boolean firmwareRepair$lambda$0$0(go0 r1) {
        UtilsKt.iXi(r1.XO0O10(), new r74());
        return true;
    }

    private static final Unit firmwareRepair$lambda$0$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return Unit.OXO1;
    }

    private static final LinearLayout fitbitLl_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.fitbitLl);
    }

    private static final boolean fontRepair$lambda$0$0(go0 r1, final SettingsActivity r2) {
        UtilsKt.iXi(r1.XO0O10(), new a64(r2));
        return true;
    }

    private static final Unit fontRepair$lambda$0$0$0(SettingsActivity r3) {
        DeviceInfoChecker.iOO1ii1(DeviceInfoChecker.OXO1, r3, null, 2, null);
        return Unit.OXO1;
    }

    private final Button getBtSettingButton() {
        return (Button) getValue();
    }

    private final TextView getCacheSize() {
        return (TextView) getValue();
    }

    private final CheckBox getCheckDataAutoSync() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckFitbit() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckGoogleFit() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckNotificationBar() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckStrava() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckZewaFit() {
        return (CheckBox) getValue();
    }

    private final LinearLayout getFitbitLl() {
        return (LinearLayout) getValue();
    }

    private final ImageView getIvRemind() {
        return (ImageView) getValue();
    }

    private final LinearLayout getLlAdmobPrivacyOptions() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlAiKeySet() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlDataSavePlace() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlDeleteAccount() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlFirmwareRepair() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlFontRepair() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlGPSFirmwareRepair() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlGoogleFit() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlGoogleFitAuth() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlHealthConnect() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlModifyPassword() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlUiRepair() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlZewaFit() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getNotificationBarLl() {
        return (LinearLayout) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final LinearLayout getStravaLl() {
        return (LinearLayout) getValue();
    }

    private final TextView getTvDataStorage() {
        return (TextView) getValue();
    }

    private final TextView getTvMap() {
        return (TextView) getValue();
    }

    private final TextView getTvUnit() {
        return (TextView) getValue();
    }

    private static final Unit gpsFirmwareRepair$lambda$0(final SettingsActivity r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        final go0 r5 = new go0(r3, 0, 2, null);
        r5.O1O(R.string.gps_firmware_repair);
        r5.iX(Integer.valueOf(R.string.firmware_repair_remind));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new q54(r5, r3));
        r3.mRepairPopup = r5;
        View r6 = r3.getRootView();
        Intrinsics.O10IXXX0X(r6, "<get-rootView>(...)");
        r5.I1XOi1(r6);
        return Unit.OXO1;
    }

    private static final boolean gpsFirmwareRepair$lambda$0$0$0(go0 r1, final SettingsActivity r2) {
        UtilsKt.iXi(r1.XO0O10(), new x74(r2));
        return true;
    }

    private static final Unit gpsFirmwareRepair$lambda$0$0$0$0(SettingsActivity r3) {
        DeviceInfoChecker.XXIIO1i11(DeviceInfoChecker.OXO1, r3, null, 2, null);
        return Unit.OXO1;
    }

    public static /* synthetic */ Button i010I(SettingsActivity r0) {
        return btSettingButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean i0X000X0O(List r0, SettingsActivity r1, int r2) {
        return checkUpgradeFailedDevice$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ void i11I(SettingsActivity r0) {
        initView$lambda$6(r0);
    }

    public static /* synthetic */ LinearLayout iI(SettingsActivity r0) {
        return llGoogleFit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iIXi1iiXI(SettingsActivity r0) {
        return deleteAccount$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit iIiiO(SettingsActivity r0, boolean r1) {
        return initView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit iOO1ii1(SettingsActivity r0) {
        return uiRepair$lambda$0$0$0(r0);
    }

    public static /* synthetic */ CheckBox iOOX010X(SettingsActivity r0) {
        return checkGoogleFit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iOiXi11II() {
        return initView$lambda$3$0$1();
    }

    public static /* synthetic */ CheckBox iX(SettingsActivity r0) {
        return checkZewaFit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox iX1O1(SettingsActivity r0) {
        return checkNotificationBar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iXiX011(SettingsActivity r0) {
        return llFirmwareRepair_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iXiiiO(SettingsActivity r0) {
        return cacheSize_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iiIOiX(SettingsActivity r0, boolean r1) {
        return initView$lambda$7(r0, r1);
    }

    public static /* synthetic */ Unit iiiO(SettingsActivity r0, PermissionStatus r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(SettingsActivity r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "<unused var>");
        LogUtils.d(new Object[]{"checkGoogleFit setOnCheckedChangeListener " + r3});
        if (r1.isGoogleFitSyncBoolean == false) goto L6;
        r1.isGoogleFitSyncBoolean = false;
        return;
    L6:
        if (r3 == false) goto L8;
        X1IIXO.OXO1.XXI(r1);
    L9:
        a01.OXO1.IiI10X().put(b01.X1ii, r3);
        return;
    L8:
        X1IIXO.OXO1.OX(r1);
        goto L9
    }

    private static final void initView$lambda$1(final SettingsActivity r1, View r2) {
        if (r1.getCheckStrava().isChecked() == false) goto L13;
        if (r1.mLoadingPopup != null) goto L7;
        r1.mLoadingPopup = new uq(r1.getMContext());
    L7:
        uq r3 = r1.mLoadingPopup;
        if (r3 == null) goto L10;
        r3.IIX1OXO();
    L10:
        StravaManager.INSTANCE.deauthorizeStrava(new q74(r1));
        return;
    L13:
        if (i72.OXO1.Xi0I() == false) goto L16;
        StravaManager.INSTANCE.toStravaAppAuthorize(r1);
        return;
    L16:
        r1.startActivityForResult(new Intent(r1, StravaAuthActivity.class), 514);
    }

    private static final Unit initView$lambda$1$0(SettingsActivity r1, boolean r2) {
        uq r0 = r1.mLoadingPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        if (r2 == false) goto L8;
        r1.getCheckStrava().setChecked(false);
    L8:
        return Unit.OXO1;
    }

    private static final void initView$lambda$2(final SettingsActivity r1, View r2) {
        if (r1.getCheckFitbit().isChecked() == true) goto L5;
        r1.startActivityForResult(new Intent(r1, FitbitAuthActivity.class), 515);
        return;
    L5:
        if (r1.mLoadingPopup != null) goto L7;
        r1.mLoadingPopup = new uq(r1.getMContext());
    L7:
        uq r3 = r1.mLoadingPopup;
        if (r3 == null) goto L10;
        r3.IIX1OXO();
    L10:
        FitbitManager.INSTANCE.deauthorizeFit(new p74(r1));
    }

    private static final Unit initView$lambda$2$0(SettingsActivity r1, boolean r2) {
        uq r0 = r1.mLoadingPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        if (r2 == false) goto L8;
        r1.getCheckFitbit().setChecked(false);
    L8:
        return Unit.OXO1;
    }

    private static final void initView$lambda$3(final SettingsActivity r2, CompoundButton r3, boolean r4) {
        Intrinsics.X0O(r3, "<unused var>");
        LogUtils.d(new Object[]{"setOnCheckedChangeListener " + r4});
        a01.OXO1.IiI10X().put(b01.OII, r4);
        if (r4 == true) goto L5;
        return;
    L5:
        if (r2.mDataAutoSyncPopup != null) goto L7;
        go0 r5 = new go0(r2, 0, 2, null);
        r5.O1O(R.string.use_reminder);
        r5.iX(Integer.valueOf(R.string.data_sync_reminder));
        r5.iX1O1(Integer.valueOf(R.string.cancel), new t74(r2));
        r5.X1IX(R.string.confirm, new u74());
        r2.mDataAutoSyncPopup = r5;
    L7:
        go0 r6 = r2.mDataAutoSyncPopup;
        if (r6 == null) goto L12;
        View r7 = r2.getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r6.I1XOi1(r7);
        return;
    }

    private static final boolean initView$lambda$3$0$0(SettingsActivity r1) {
        r1.getCheckDataAutoSync().setChecked(false);
        return true;
    }

    private static final boolean initView$lambda$3$0$1() {
        return true;
    }

    private static final void initView$lambda$4(SettingsActivity r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "<unused var>");
        LogUtils.d(new Object[]{"setOnCheckedChangeListener " + r3});
        a01.OXO1.IiI10X().put(b01.IXI, r3);
        if (r3 == true) goto L5;
        com.sma.smartv3.biz.OXO1.XOO0ii0.OXO1().XXI();
        return;
    L5:
        if (ContextCompat.checkSelfPermission(r1, "android.permission.ACCESS_FINE_LOCATION") != 0) goto L8;
        r1.startSmaNotification();
        return;
    L8:
        r1.requestLocationPermission();
    }

    private static final void initView$lambda$5(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "<unused var>");
        LogUtils.d(new Object[]{"checkZewaFit setOnCheckedChangeListener " + r2});
        a01.OXO1.IiI10X().put(b01.XOXiX0, r2);
    }

    private static final void initView$lambda$6(SettingsActivity r0) {
        r0.checkUpgradeFailedDevice();
    }

    private static final Unit initView$lambda$7(SettingsActivity r0, boolean r1) {
        r0.getCheckStrava().setChecked(r1);
        return Unit.OXO1;
    }

    private static final ImageView ivRemind_delegate$lambda$0(SettingsActivity r1) {
        return (ImageView) r1.findViewById(R.id.ivRemind);
    }

    private static final LinearLayout llAdmobPrivacyOptions_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_admob_privacy_options);
    }

    private static final LinearLayout llAiKeySet_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_aikey_set);
    }

    private static final LinearLayout llDataSavePlace_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_data_save_place);
    }

    private static final LinearLayout llDeleteAccount_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_delete_account);
    }

    private static final LinearLayout llFirmwareRepair_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_firmware_repair);
    }

    private static final LinearLayout llFontRepair_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_font_repair);
    }

    private static final LinearLayout llGPSFirmwareRepair_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_gps_firmware_repair);
    }

    private static final LinearLayout llGoogleFitAuth_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_google_fit_auth);
    }

    private static final LinearLayout llGoogleFit_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_google_fit);
    }

    private static final LinearLayout llHealthConnect_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_health_connect);
    }

    private static final LinearLayout llModifyPassword_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_modify_password);
    }

    private static final LinearLayout llUiRepair_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_ui_repair);
    }

    private static final LinearLayout llZewaFit_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_zewa_fit);
    }

    private static final LinearLayout notificationBarLl_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.notificationBarLl);
    }

    private static final boolean onBottomClick$lambda$0$0(final SettingsActivity r2, go0 r3) {
        if (BleConnector.INSTANCE.isBound() == false) goto L10;
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new SettingsActivity$onBottomClick$1$1$1(r2));
        if (r2.mLoadingPopup != null) goto L7;
        r2.mLoadingPopup = new uq(r3.XO0O10());
    L7:
        uq r4 = r2.mLoadingPopup;
        if (r4 == null) goto L13;
        View r5 = r2.getRootView();
        Intrinsics.O10IXXX0X(r5, "<get-rootView>(...)");
        r4.I1XOi1(r5);
        return true;
    L13:
        return true;
    L10:
        r2.exit();
        return true;
    }

    private static final Unit onNewIntent$lambda$0(SettingsActivity r0, boolean r1) {
        r0.getCheckStrava().setChecked(r1);
        return Unit.OXO1;
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (this.mPermissionBackgroundPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.background_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new s54(this));
        this.mPermissionBackgroundPopup = r0;
    L5:
        go0 r1 = this.mPermissionBackgroundPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean permissionBackgroundLocationRemind$lambda$0$0(SettingsActivity r2) {
        r2.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    private static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        permissionBackgroundLocationRemind();
        return;
    L6:
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new w64(this), 3, null);
    }

    private static final Unit requestLocationPermission$lambda$0(SettingsActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        int r3 = XIi00iiXO.OXO1[r2.ordinal()];
        if (r3 != 1) goto L5;
        r1.startSmaNotification();
    L9:
        return Unit.OXO1;
    L5:
        if (r3 == 2) goto L9;
        r1.permissionRemind();
        goto L9
    }

    private static final View rootView_delegate$lambda$0(SettingsActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final boolean selectMap$lambda$0$0(SettingsActivity r3, int r4) {
        SPUtils r0 = a01.OXO1.OXO1();
        if (r4 != 1) goto L5;
        boolean r5 = true;
    L6:
        r0.put(b01.XiOIO, r5);
        I01XX0.XIi00iiXO(b01.XiOIO, null, 2, null);
        r3.setupMap();
        return true;
    L5:
        r5 = false;
        goto L6
    }

    private static final boolean selectUnit$lambda$0$0(final SettingsActivity r33, int r34) {
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        AppUser r5 = (AppUser) r3;
        if (r34 != 0) goto L9;
        int r6 = 0;
    L10:
        r5.setUnit(r6);
        r33.setupUnit(r5);
        r33.appUser = r5;
        r1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(r5));
        I01XX0.XIi00iiXO(I01XX0.IiiXiI0I, null, 2, null);
        X0IOiX1O.XIi00iiXO(false, new l74(r33), 1, null);
        ToastUtils.showLong(R.string.reboot_app_show_new_view);
        return true;
    L9:
        r6 = 1;
        goto L10
    }

    private static final Unit selectUnit$lambda$0$0$1(SettingsActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.USER_PROFILE, BleKeyFlag.UPDATE, r9.appUser.getBleUserProfile(), false, false, 24, null);
        return Unit.OXO1;
    }

    private final void setDataStorage() {
        getTvDataStorage().setText(a01.OXO1.IiI10X().getString(b01.II1Xi0));
        CharSequence r0 = getTvDataStorage().getText();
        Intrinsics.O10IXXX0X(r0, "getText(...)");
        if (r0.length() != 0) goto L25;
        TextView r1 = getTvDataStorage();
        String r2 = Api.INSTANCE.getBASE_URL();
        int r3 = r2.hashCode();
        if (r3 == (-1644804843)) goto L20;
        if (r3 == (-167076722)) goto L16;
        if (r3 == 1582655416) goto L12;
    L21:
        String r4 = "Test Server";
    L23:
        r1.setText(r4);
        return;
    L12:
        if (r2.equals(e44.iO) == false) goto L21;
        r4 = getString(R.string.china_mainland);
        goto L23
    L16:
        if (r2.equals(e44.OXO1) == false) goto L21;
        r4 = getString(R.string.asia_pacific);
        goto L23
    L20:
        if (r2.equals(e44.XIi00iiXO) == false) goto L21;
        r4 = getString(R.string.europe_and_america);
        goto L23
    }

    private final void setupMap() {
        TextView r0 = getTvMap();
        if (a01.OXO1.OXO1().getBoolean(b01.XiOIO) == false) goto L5;
        int r1 = R.string.baidu_map;
    L6:
        r0.setText(r1);
        return;
    L5:
        r1 = R.string.google_map;
        goto L6
    }

    private final void setupUnit(AppUser r2) {
        TextView r0 = getTvUnit();
        if (r2.getUnit() != 0) goto L5;
        int r3 = R.string.metric;
    L6:
        r0.setText(r3);
        return;
    L5:
        r3 = R.string.imperial;
        goto L6
    }

    private static final LinearLayout stravaLl_delegate$lambda$0(SettingsActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.stravaLl);
    }

    private static final TextView tvDataStorage_delegate$lambda$0(SettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_data_storage);
    }

    private static final TextView tvMap_delegate$lambda$0(SettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_map);
    }

    private static final TextView tvUnit_delegate$lambda$0(SettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_unit);
    }

    private static final boolean uiRepair$lambda$0$0(go0 r1, final SettingsActivity r2) {
        UtilsKt.iXi(r1.XO0O10(), new m74(r2));
        return true;
    }

    private static final Unit uiRepair$lambda$0$0$0(SettingsActivity r3) {
        DeviceInfoChecker.iX1O1(DeviceInfoChecker.OXO1, r3, null, 2, null);
        return Unit.OXO1;
    }

    public final void accessToThirdParties(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ToastUtils.showLong("accessToThirdParties", new Object[0]);
    }

    public final void admobPrivacyOptions(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (i72.OXO1.IOi1O0() == false) goto L6;
        ADPAdManager.INSTANCE.showPrivacyOptionsForm(this);
        return;
    }

    public final void aiKeySet(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, AiKeySetActivity.class));
    }

    public final void cacheClean(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mCleaning == false) goto L6;
        return;
    L6:
        if (this.mCacheCleanPopup != null) goto L8;
        int r2 = 0;
        go0 r5 = new go0(this, r2, 2, null);
        r5.O1O(R.string.cache_clean_confirm);
        r5.I0iXXO(false);
        r5.iX1O1(Integer.valueOf(R.string.cancel), new y74(this));
        r5.X1IX(R.string.confirm, new z74(this));
        this.mCacheCleanPopup = r5;
    L8:
        this.mCleaning = true;
        go0 r6 = this.mCacheCleanPopup;
        if (r6 == null) goto L12;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void checkUpdate(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.downloadUrl.length() <= 0) goto L6;
        X1OOO.i010I(this, this.downloadUrl);
        return;
    L6:
        ToastUtils.showLong(R.string.already_the_latest_version);
    }

    public final void deleteAccount(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDeleteUserPopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.delete_user_confirm);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.delete, new l64(this));
        this.mDeleteUserPopup = r5;
    L5:
        go0 r6 = this.mDeleteUserPopup;
        if (r6 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void firmwareRepair(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        final go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.firmware_repair);
        r5.iX(Integer.valueOf(R.string.firmware_repair_remind));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new w74(r5));
        this.mRepairPopup = r5;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
    }

    public final void fontRepair(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        final go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.pair_confirm_title);
        r5.iX(Integer.valueOf(R.string.firmware_repair_tip));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new c64(r5, this));
        this.mRepairPopup = r5;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
    }

    public final void googleFitAuth(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, GoogleFitAuthActivity.class));
    }

    public final void googleFitClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void googleHealthConnect(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, HealthConnectActivity.class));
    }

    public final void gpsFirmwareRepair(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new v74(this), 1, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.settings);
        LinearLayout r1 = getStravaLl();
        i72 r2 = i72.OXO1;
        int r4 = 0;
        if (r2.I1Ii() == false) goto L5;
        int r3 = 0;
    L6:
        r1.setVisibility(r3);
        LinearLayout r5 = getFitbitLl();
        if (r2.OI1i1i() == false) goto L9;
        int r6 = 0;
    L10:
        r5.setVisibility(r6);
        LinearLayout r7 = getLlHealthConnect();
        if (r2.XOO0Xi() == false) goto L13;
        int r8 = 0;
    L14:
        r7.setVisibility(r8);
        View r9 = findViewById(R.id.tv_map_right_img);
        if (r9 != null) goto L17;
    L21:
        setDataStorage();
        a01 r10 = a01.OXO1;
        SPUtils r11 = r10.IiI10X();
        Object r12 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r13 = new Gson().fromJson(r11.getString(AppUser.class.getName()), AppUser.class);
        if (r13 == null) goto L25;
        r12 = r13;
    L25:
        setupUnit((AppUser) r12);
        setupMap();
        SPUtils r14 = r10.OXO1();
        Object r15 = new AppVersion(0, null, null, null, null, null, 0, 127, null);
        Object r16 = new Gson().fromJson(r14.getString(AppVersion.class.getName()), AppVersion.class);
        if (r16 == null) goto L29;
        r15 = r16;
    L29:
        AppVersion r17 = (AppVersion) r15;
        if (r17.getFileUrl().length() <= 0) goto L32;
        getIvRemind().setVisibility(0);
        this.downloadUrl = r17.getFileUrl();
    L33:
        getCheckGoogleFit().setChecked(r10.IiI10X().getBoolean(b01.X1ii));
        getCheckGoogleFit().setOnCheckedChangeListener(new t54(this));
        CheckBox r18 = getCheckStrava();
        StravaManager r19 = StravaManager.INSTANCE;
        r18.setChecked(r19.isEnabled());
        ViewParent r20 = getCheckStrava().getParent();
        Intrinsics.X1ii(r20, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r20).setOnClickListener(new u54(this));
        getCheckFitbit().setChecked(FitbitManager.INSTANCE.isEnabled());
        ViewParent r21 = getCheckFitbit().getParent();
        Intrinsics.X1ii(r21, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) r21).setOnClickListener(new v54(this));
        getCheckDataAutoSync().setChecked(r10.IiI10X().getBoolean(b01.OII));
        getCheckDataAutoSync().setOnCheckedChangeListener(new w54(this));
        getCacheSize().setText(FileUtils.getSize(uz0.X0i1O(sz0.OXO1)));
        boolean r22 = true;
        if (r10.IiI10X().getBoolean(b01.O001I, true) == true) goto L36;
    L46:
        getLlDeleteAccount().setVisibility(8);
        getLlModifyPassword().setVisibility(8);
        getLlDataSavePlace().setVisibility(8);
        getLlGoogleFit().setVisibility(8);
        LinearLayout r23 = getLlGoogleFitAuth();
        if (r23 == null) goto L49;
        r23.setVisibility(8);
    L49:
        getStravaLl().setVisibility(8);
        getBtSettingButton().setText(R.string.login);
        getLlZewaFit().setVisibility(8);
    L50:
        Button r24 = getBtSettingButton();
        if (r2.ii0111XI() == false) goto L53;
        int r25 = 0;
    L54:
        r24.setVisibility(r25);
        LinearLayout r26 = getNotificationBarLl();
        q62 r27 = q62.OXO1;
        if (r27.O00OXOXO() == false) goto L57;
        int r28 = 0;
    L58:
        r26.setVisibility(r28);
        if (Build.VERSION.SDK_INT < 34) goto L67;
        CheckBox r29 = getCheckNotificationBar();
        if (r10.IiI10X().getBoolean(b01.IXI, true) == true) goto L63;
    L65:
        r22 = false;
    L66:
        r29.setChecked(r22);
    L68:
        getCheckNotificationBar().setOnCheckedChangeListener(new x54(this));
        LinearLayout r30 = getLlAiKeySet();
        if (r27.OOX1I() == false) goto L71;
        int r31 = 0;
    L72:
        r30.setVisibility(r31);
        if (r2.X00Xi1X() == true) goto L75;
    L91:
        getLlFontRepair().setVisibility(8);
        getLlUiRepair().setVisibility(8);
        getLlFirmwareRepair().setVisibility(8);
    L92:
        LinearLayout r32 = getLlGPSFirmwareRepair();
        if (r27.i1() == false) goto L95;
        int r33 = 0;
    L96:
        r32.setVisibility(r33);
        LinearLayout r34 = getLlAdmobPrivacyOptions();
        if (r10.OXO1().getBoolean(b01.XIIO11I, false) == true) goto L100;
        r4 = 8;
    L100:
        r34.setVisibility(r4);
        getCheckZewaFit().setChecked(r10.IiI10X().getBoolean(b01.XOXiX0));
        getCheckZewaFit().setOnCheckedChangeListener(new y54());
        new Handler().postDelayed(new z54(this), 500);
        Intent r35 = getIntent();
        Intrinsics.O10IXXX0X(r35, "getIntent(...)");
        r19.handleStravaAppIntent(this, r35, new b64(this));
        return;
    L95:
        r33 = 8;
        goto L96
    L75:
        if (r2.I0OX() == true) goto L91;
        LinearLayout r36 = getLlFontRepair();
        if (r27.XIIO11I() == false) goto L79;
        int r37 = 0;
    L80:
        r36.setVisibility(r37);
        LinearLayout r38 = getLlUiRepair();
        if (r27.I0i0() == true) goto L83;
    L85:
        int r39 = 8;
    L86:
        r38.setVisibility(r39);
        LinearLayout r40 = getLlFirmwareRepair();
        if (r27.iii0() == false) goto L89;
        int r41 = 0;
    L90:
        r40.setVisibility(r41);
        goto L92
    L89:
        r41 = 8;
        goto L90
    L83:
        if (r27.X1i() == false) goto L85;
        r39 = 0;
        goto L86
    L79:
        r37 = 8;
        goto L80
    L71:
        r31 = 8;
        goto L72
    L63:
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) goto L65;
    L67:
        getCheckNotificationBar().setChecked(r10.IiI10X().getBoolean(b01.IXI, true));
        goto L68
    L57:
        r28 = 8;
        goto L58
    L53:
        r25 = 8;
        goto L54
    L36:
        if (this.appUser.getIdentity().length() <= 0) goto L46;
        getLlDeleteAccount().setVisibility(0);
        getLlModifyPassword().setVisibility(0);
        LinearLayout r42 = getLlDataSavePlace();
        if (r2.I11X11OX() == false) goto L40;
        int r43 = 0;
    L41:
        r42.setVisibility(r43);
        getLlGoogleFit().setVisibility(8);
        getBtSettingButton().setText(R.string.logout);
        LinearLayout r44 = getLlZewaFit();
        if (r2.iOXiO1O1I() == false) goto L44;
        int r45 = 0;
    L45:
        r44.setVisibility(r45);
        goto L50
    L44:
        r45 = 8;
        goto L45
    L40:
        r43 = 8;
        goto L41
    L32:
        getIvRemind().setVisibility(8);
        goto L33
    L17:
        if (r2.i1iII1i1() == false) goto L19;
        int r46 = 0;
    L20:
        r9.setVisibility(r46);
        goto L21
    L19:
        r46 = 8;
        goto L20
    L13:
        r8 = 8;
        goto L14
    L9:
        r6 = 8;
        goto L10
    L5:
        r3 = 8;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_settings;
    }

    public final void modifyPassword(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i72.OXO1.OXOI0XII(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r3, int r4, @tb1 Intent r5) {
        super.onActivityResult(r3, r4, r5);
        LogUtils.d(new Object[]{r3 + " " + r4 + " " + r5});
        if (r3 != 514) goto L5;
        if (r4 != (-1)) goto L15;
        getCheckStrava().setChecked(true);
        return;
    L15:
        return;
    L5:
        if (r3 == 515) goto L8;
        this.isGoogleFitSyncBoolean = true;
        getCheckGoogleFit().setChecked(X1IIXO.OXO1.O10IXXX0X(this, r3, r4));
        a01.OXO1.IiI10X().put(b01.X1ii, getCheckGoogleFit().isChecked());
        return;
    L8:
        if (r4 != (-1)) goto L14;
        getCheckFitbit().setChecked(true);
        return;
    }

    public final void onBottomClick(@aa1 View r34) {
        Intrinsics.X0O(r34, "view");
        a01 r1 = a01.OXO1;
        if (r1.IiI10X().getBoolean(b01.O001I, true) == true) goto L5;
    L18:
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L22;
        r3 = r4;
    L22:
        SPUtils r5 = r1.XO0O10();
        String r6 = AppUser.class.getName();
        Gson r7 = new Gson();
        r5.put(r6, r7.toJson((AppUser) r3));
        i72.OXO1.Oi1I(this);
        return;
    L5:
        if (this.appUser.getIdentity().length() <= 0) goto L18;
        if (q62.OXO1.iii0() == false) goto L12;
        if (r1.XIi00iiXO().getBoolean(b01.IiI10X) == false) goto L12;
        return;
    L12:
        if (this.mLogoutPopup != null) goto L14;
        final go0 r8 = new go0(this, 0, 2, null);
        r8.O1O(R.string.logout_confirm);
        go0.X11iII1O1(r8, Integer.valueOf(R.string.cancel), null, 2, null);
        r8.X1IX(R.string.confirm, new h74(this, r8));
        this.mLogoutPopup = r8;
    L14:
        go0 r9 = this.mLogoutPopup;
        if (r9 == null) goto L24;
        View r10 = getRootView();
        Intrinsics.O10IXXX0X(r10, "<get-rootView>(...)");
        r9.I1XOi1(r10);
        return;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@aa1 Intent r3) {
        Intrinsics.X0O(r3, SDKConstants.PARAM_INTENT);
        super.onNewIntent(r3);
        setIntent(r3);
        StravaManager.INSTANCE.handleStravaAppIntent(this, r3, new s74(this));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.permission_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new o74());
        this.mPermissionPopup = r0;
    L5:
        go0 r1 = this.mPermissionPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
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
    public final void selectMap(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (i72.OXO1.i1iII1i1() == true) goto L5;
        return;
    L5:
        if (this.mMapPopup != null) goto L7;
        pv1 r4 = new pv1(getMContext(), R.array.maps);
        r4.IXXOO(true);
        r4.iX(R.string.map_select);
        r4.i010I(new p54(this));
        this.mMapPopup = r4;
    L7:
        pv1 r5 = this.mMapPopup;
        if (r5 == null) goto L12;
        r5.iOO1ii1(a01.OXO1.OXO1().getBoolean(b01.XiOIO) ? 1 : 0);
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }

    public final void selectUnit(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        int r0 = 1;
        if (this.mUnitPopup != null) goto L5;
        pv1 r5 = new pv1(getMContext(), R.array.units);
        r5.IXXOO(true);
        r5.iX(R.string.unit);
        r5.i010I(new k74(this));
        this.mUnitPopup = r5;
    L5:
        pv1 r6 = this.mUnitPopup;
        if (r6 != null) goto L8;
        return;
    L8:
        if (this.appUser.getUnit() != 0) goto L10;
        r0 = 0;
    L10:
        r6.iOO1ii1(r0);
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r6.I1XOi1(r1);
    }

    public final void startSmaNotification() {
        com.sma.smartv3.biz.OXO1.C0553OXO1 r0 = com.sma.smartv3.biz.OXO1.XOO0ii0;
        r0.OXO1().I0iXXO();
        com.sma.smartv3.biz.OXO1.I1XOi1(r0.OXO1(), 0, 0, null, 4, null);
        I01XX0.XIi00iiXO(I01XX0.OXO1, null, 2, null);
    }

    public final void stravaClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void uiRepair(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        final go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.ui_repair);
        r5.iX(Integer.valueOf(R.string.ui_repair_remind));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new r54(r5, this));
        this.mRepairPopup = r5;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
    }

    public final void zewaFitClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }
}
