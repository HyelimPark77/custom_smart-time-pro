package com.sma.smartv3.ui.status;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a25;
import com.android.mltcode.paycertificationapi.a35;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b15;
import com.android.mltcode.paycertificationapi.b25;
import com.android.mltcode.paycertificationapi.b35;
import com.android.mltcode.paycertificationapi.c15;
import com.android.mltcode.paycertificationapi.c25;
import com.android.mltcode.paycertificationapi.c35;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.d15;
import com.android.mltcode.paycertificationapi.d25;
import com.android.mltcode.paycertificationapi.d35;
import com.android.mltcode.paycertificationapi.e15;
import com.android.mltcode.paycertificationapi.e25;
import com.android.mltcode.paycertificationapi.e35;
import com.android.mltcode.paycertificationapi.f15;
import com.android.mltcode.paycertificationapi.f25;
import com.android.mltcode.paycertificationapi.f35;
import com.android.mltcode.paycertificationapi.g15;
import com.android.mltcode.paycertificationapi.g25;
import com.android.mltcode.paycertificationapi.g35;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.h15;
import com.android.mltcode.paycertificationapi.h25;
import com.android.mltcode.paycertificationapi.h35;
import com.android.mltcode.paycertificationapi.i15;
import com.android.mltcode.paycertificationapi.i25;
import com.android.mltcode.paycertificationapi.i35;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.j15;
import com.android.mltcode.paycertificationapi.j25;
import com.android.mltcode.paycertificationapi.j35;
import com.android.mltcode.paycertificationapi.k15;
import com.android.mltcode.paycertificationapi.k25;
import com.android.mltcode.paycertificationapi.l15;
import com.android.mltcode.paycertificationapi.l25;
import com.android.mltcode.paycertificationapi.m15;
import com.android.mltcode.paycertificationapi.m25;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.n15;
import com.android.mltcode.paycertificationapi.n25;
import com.android.mltcode.paycertificationapi.o15;
import com.android.mltcode.paycertificationapi.o25;
import com.android.mltcode.paycertificationapi.p15;
import com.android.mltcode.paycertificationapi.p25;
import com.android.mltcode.paycertificationapi.q15;
import com.android.mltcode.paycertificationapi.q25;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r15;
import com.android.mltcode.paycertificationapi.r25;
import com.android.mltcode.paycertificationapi.s15;
import com.android.mltcode.paycertificationapi.s25;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.t15;
import com.android.mltcode.paycertificationapi.t25;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u15;
import com.android.mltcode.paycertificationapi.u25;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.v15;
import com.android.mltcode.paycertificationapi.v25;
import com.android.mltcode.paycertificationapi.w15;
import com.android.mltcode.paycertificationapi.w25;
import com.android.mltcode.paycertificationapi.x15;
import com.android.mltcode.paycertificationapi.x25;
import com.android.mltcode.paycertificationapi.y15;
import com.android.mltcode.paycertificationapi.y25;
import com.android.mltcode.paycertificationapi.z15;
import com.android.mltcode.paycertificationapi.z25;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;
import com.baidu.mapapi.utils.DistanceUtil;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.gms.maps.GoogleMap;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.HRMinuteData;
import com.sma.smartv3.model.RecordActivityData;
import com.sma.smartv3.model.RecordDetailHeartRateData;
import com.sma.smartv3.model.RecordDetailSpeedData;
import com.sma.smartv3.model.RecordTimeList;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1093:1\n19#2:1094\n15#2:1095\n255#3:1096\n255#3:1097\n255#3:1098\n255#3:1099\n104#4,9:1100\n113#4,3:1110\n99#4,3:1113\n104#4,9:1116\n113#4,3:1126\n99#4,3:1129\n1#5:1109\n1#5:1125\n*S KotlinDebug\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n*L\n171#1:1094\n171#1:1095\n368#1:1096\n372#1:1097\n376#1:1098\n385#1:1099\n556#1:1100,9\n556#1:1110,3\n556#1:1113,3\n563#1:1116,9\n563#1:1126,3\n563#1:1129,3\n556#1:1109\n563#1:1125\n*E\n"})
public final class SportRecordsDetailActivity extends BaseActivity {

    @aa1
    private RecordActivityData activityData;

    @aa1
    private final Lazy activityDataLl$delegate;

    @aa1
    private final Lazy bottomView$delegate;

    @aa1
    private final Lazy downloadGpxIb$delegate;
    private boolean isInChinaMainland;

    @aa1
    private final Lazy ivAvatar$delegate;
    private LineChart lineChart;

    @aa1
    private ArrayList<CustomLatLng> locationSmoothAlgorithm;

    @tb1
    private BaiDuMapSportRecordFragment mBaiDuMapFragment;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private GoogleMapSportRecordFragment mGoogleMapFragment;

    @aa1
    private final HeartRateDao mHeartRateDao;

    @aa1
    private final LocationDao mLocationDao;

    @aa1
    private final Lazy mapPbRl$delegate;

    @aa1
    private final Lazy mapViewFrameLayout$delegate;

    @aa1
    private final Lazy nestedScrollView$delegate;

    @aa1
    private final Lazy nickName$delegate;

    @aa1
    private final Lazy otherDataLl$delegate;

    @aa1
    private final Lazy pacePF$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy rootViewAltitude$delegate;

    @aa1
    private final Lazy rootViewHeartRate$delegate;

    @aa1
    private final Lazy rootViewSpeed$delegate;

    @aa1
    private final Lazy rv$delegate;
    private LineDataSet setValue;

    @aa1
    private final Lazy speedPf$delegate;

    @aa1
    private final Lazy sportName$delegate;

    @aa1
    private final Lazy sportRecordAerobic$delegate;

    @aa1
    private final Lazy sportRecordAltitude$delegate;

    @aa1
    private final Lazy sportRecordAltitudeUnit$delegate;

    @aa1
    private final Lazy sportRecordAnaerobic$delegate;

    @aa1
    private final Lazy sportRecordAvgHR$delegate;

    @aa1
    private final Lazy sportRecordAvgPace$delegate;

    @aa1
    private final Lazy sportRecordAvgPaceRl$delegate;

    @aa1
    private final Lazy sportRecordAvgPaceUnit$delegate;

    @aa1
    private final Lazy sportRecordAvgSpeed$delegate;

    @aa1
    private final Lazy sportRecordAvgSpeedRl$delegate;

    @aa1
    private final Lazy sportRecordAvgSpeedUnit$delegate;

    @aa1
    private final Lazy sportRecordCD$delegate;

    @aa1
    private final Lazy sportRecordCDUnit$delegate;

    @aa1
    private final Lazy sportRecordCR$delegate;

    @aa1
    private final Lazy sportRecordCRUnit$delegate;

    @aa1
    private final Lazy sportRecordCadence$delegate;

    @aa1
    private final Lazy sportRecordCadenceLl$delegate;

    @aa1
    private final Lazy sportRecordCalories$delegate;

    @aa1
    private final Lazy sportRecordCaloriesLl$delegate;
    private SportRecordData sportRecordData;

    @aa1
    private final Lazy sportRecordDistance$delegate;

    @aa1
    private final Lazy sportRecordDistanceLl$delegate;

    @aa1
    private final Lazy sportRecordDistanceUnit$delegate;

    @aa1
    private final Lazy sportRecordFastestPace$delegate;

    @aa1
    private final Lazy sportRecordFastestPaceRl$delegate;

    @aa1
    private final Lazy sportRecordFastestPaceUnit$delegate;

    @aa1
    private final Lazy sportRecordFastestSpeed$delegate;

    @aa1
    private final Lazy sportRecordFastestSpeedRl$delegate;

    @aa1
    private final Lazy sportRecordFastestSpeedUnit$delegate;

    @aa1
    private final Lazy sportRecordFatBurning$delegate;

    @aa1
    private final Lazy sportRecordMaxHR$delegate;

    @aa1
    private final Lazy sportRecordPaceChartRl$delegate;

    @aa1
    private final Lazy sportRecordPauseTime$delegate;

    @aa1
    private final Lazy sportRecordPauseTimeLl$delegate;

    @aa1
    private final Lazy sportRecordStep$delegate;

    @aa1
    private final Lazy sportRecordStepLl$delegate;

    @aa1
    private final Lazy sportRecordStrenuous$delegate;

    @aa1
    private final Lazy sportRecordWarmUp$delegate;

    @aa1
    private final Lazy sportStartTime$delegate;

    @aa1
    private final Lazy sportTime$delegate;
    private int threshold;
    private int thresholdMax;

    @aa1
    private final AppUser userProfile;

    public SportRecordsDetailActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new n15(this));
        this.mapViewFrameLayout$delegate = LazyKt__LazyJVMKt.iO(new f15(this));
        this.mapPbRl$delegate = LazyKt__LazyJVMKt.iO(new r15(this));
        this.nestedScrollView$delegate = LazyKt__LazyJVMKt.iO(new d25(this));
        this.otherDataLl$delegate = LazyKt__LazyJVMKt.iO(new p25(this));
        this.bottomView$delegate = LazyKt__LazyJVMKt.iO(new x25(this));
        this.downloadGpxIb$delegate = LazyKt__LazyJVMKt.iO(new y25(this));
        this.sportTime$delegate = LazyKt__LazyJVMKt.iO(new z25(this));
        this.sportName$delegate = LazyKt__LazyJVMKt.iO(new a35(this));
        this.sportStartTime$delegate = LazyKt__LazyJVMKt.iO(new b35(this));
        this.activityDataLl$delegate = LazyKt__LazyJVMKt.iO(new y15(this));
        this.sportRecordPauseTime$delegate = LazyKt__LazyJVMKt.iO(new j25(this));
        this.sportRecordPauseTimeLl$delegate = LazyKt__LazyJVMKt.iO(new u25(this));
        this.sportRecordStep$delegate = LazyKt__LazyJVMKt.iO(new f35(this));
        this.sportRecordStepLl$delegate = LazyKt__LazyJVMKt.iO(new g35(this));
        this.sportRecordCadence$delegate = LazyKt__LazyJVMKt.iO(new h35(this));
        this.sportRecordCadenceLl$delegate = LazyKt__LazyJVMKt.iO(new i35(this));
        this.sportRecordDistance$delegate = LazyKt__LazyJVMKt.iO(new j35(this));
        this.sportRecordDistanceLl$delegate = LazyKt__LazyJVMKt.iO(new d15(this));
        this.sportRecordCalories$delegate = LazyKt__LazyJVMKt.iO(new e15(this));
        this.sportRecordCaloriesLl$delegate = LazyKt__LazyJVMKt.iO(new g15(this));
        this.sportRecordDistanceUnit$delegate = LazyKt__LazyJVMKt.iO(new h15(this));
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new i15(this));
        this.nickName$delegate = LazyKt__LazyJVMKt.iO(new j15(this));
        this.rootViewHeartRate$delegate = LazyKt__LazyJVMKt.iO(new k15(this));
        this.sportRecordMaxHR$delegate = LazyKt__LazyJVMKt.iO(new l15(this));
        this.sportRecordAvgHR$delegate = LazyKt__LazyJVMKt.iO(new m15(this));
        this.sportRecordStrenuous$delegate = LazyKt__LazyJVMKt.iO(new o15(this));
        this.sportRecordAnaerobic$delegate = LazyKt__LazyJVMKt.iO(new p15(this));
        this.sportRecordAerobic$delegate = LazyKt__LazyJVMKt.iO(new q15(this));
        this.sportRecordFatBurning$delegate = LazyKt__LazyJVMKt.iO(new s15(this));
        this.sportRecordWarmUp$delegate = LazyKt__LazyJVMKt.iO(new t15(this));
        this.rootViewSpeed$delegate = LazyKt__LazyJVMKt.iO(new u15(this));
        this.speedPf$delegate = LazyKt__LazyJVMKt.iO(new v15(this));
        this.sportRecordAvgSpeed$delegate = LazyKt__LazyJVMKt.iO(new w15(this));
        this.sportRecordAvgSpeedRl$delegate = LazyKt__LazyJVMKt.iO(new x15(this));
        this.sportRecordFastestSpeedRl$delegate = LazyKt__LazyJVMKt.iO(new z15(this));
        this.sportRecordFastestSpeed$delegate = LazyKt__LazyJVMKt.iO(new a25(this));
        this.pacePF$delegate = LazyKt__LazyJVMKt.iO(new b25(this));
        this.sportRecordAvgPaceRl$delegate = LazyKt__LazyJVMKt.iO(new c25(this));
        this.sportRecordFastestPaceRl$delegate = LazyKt__LazyJVMKt.iO(new e25(this));
        this.sportRecordAvgPace$delegate = LazyKt__LazyJVMKt.iO(new f25(this));
        this.sportRecordFastestPace$delegate = LazyKt__LazyJVMKt.iO(new g25(this));
        this.sportRecordAvgSpeedUnit$delegate = LazyKt__LazyJVMKt.iO(new h25(this));
        this.sportRecordFastestSpeedUnit$delegate = LazyKt__LazyJVMKt.iO(new i25(this));
        this.sportRecordAvgPaceUnit$delegate = LazyKt__LazyJVMKt.iO(new k25(this));
        this.sportRecordFastestPaceUnit$delegate = LazyKt__LazyJVMKt.iO(new l25(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new m25(this));
        this.sportRecordPaceChartRl$delegate = LazyKt__LazyJVMKt.iO(new n25(this));
        this.rootViewAltitude$delegate = LazyKt__LazyJVMKt.iO(new o25(this));
        this.sportRecordAltitude$delegate = LazyKt__LazyJVMKt.iO(new q25(this));
        this.sportRecordCR$delegate = LazyKt__LazyJVMKt.iO(new r25(this));
        this.sportRecordCD$delegate = LazyKt__LazyJVMKt.iO(new s25(this));
        this.sportRecordAltitudeUnit$delegate = LazyKt__LazyJVMKt.iO(new t25(this));
        this.sportRecordCRUnit$delegate = LazyKt__LazyJVMKt.iO(new v25(this));
        this.sportRecordCDUnit$delegate = LazyKt__LazyJVMKt.iO(new w25(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.activityData = new RecordActivityData();
        MyDb r4 = MyDb.INSTANCE;
        this.mLocationDao = r4.getMDatabase().locationDao();
        this.mHeartRateDao = r4.getMDatabase().heartRateDao();
        this.threshold = 5;
        this.thresholdMax = 11;
        this.locationSmoothAlgorithm = new ArrayList();
    }

    public static /* synthetic */ View I0iXXO(SportRecordsDetailActivity r0) {
        return bottomView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold I1(SportRecordsDetailActivity r0) {
        return sportRecordDistance_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold I1XOi1(SportRecordsDetailActivity r0) {
        return sportRecordCD_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout II1Xi0(SportRecordsDetailActivity r0) {
        return activityDataLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(Ref.IntRef r0, SportRecordsDetailActivity r1, int r2, Bitmap r3, Ref.ObjectRef r4, Ref.ObjectRef r5, Bitmap r6, Ref.ObjectRef r7, Bitmap r8) {
        share$lambda$1(r0, r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public static /* synthetic */ boolean IO0II0i(SportRecordsDetailActivity r0) {
        return delete$lambda$0$0(r0);
    }

    public static /* synthetic */ DINCondBold IXI(SportRecordsDetailActivity r0) {
        return sportRecordAvgHR_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold IXOIIIO(SportRecordsDetailActivity r0) {
        return sportRecordFastestPace_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FrameLayout IXXOO(SportRecordsDetailActivity r0) {
        return mapViewFrameLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium Ii0X0X(SportRecordsDetailActivity r0) {
        return sportRecordAltitudeUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView Ii0i(SportRecordsDetailActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium Ii1iii0(SportRecordsDetailActivity r0) {
        return sportName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout IiiXiI0I(SportRecordsDetailActivity r0) {
        return sportRecordAvgSpeedRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout O001I(SportRecordsDetailActivity r0) {
        return sportRecordAvgPaceRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(SportRecordsDetailActivity r0) {
        return sportRecordDistanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O1O(SportRecordsDetailActivity r0) {
        return sportRecordAerobic_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OII(SportRecordsDetailActivity r0) {
        return sportRecordPaceChartRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFRegular OIX0iXi(SportRecordsDetailActivity r0) {
        return pacePF_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFRegular OO(SportRecordsDetailActivity r0) {
        return speedPf_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OX(SportRecordsDetailActivity r0) {
        return downloadGpxIb_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout OX110i(SportRecordsDetailActivity r0) {
        return sportRecordPauseTimeLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OiIIX101O(SportRecordsDetailActivity r0) {
        return sportRecordFastestPaceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X00XIX1(SportRecordsDetailActivity r0) {
        return sportRecordWarmUp_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X00Xi1X(SportRecordsDetailActivity r0) {
        return nickName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X01IiOiIi(SportRecordsDetailActivity r0) {
        return sportTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout X0O(SportRecordsDetailActivity r0) {
        return sportRecordCaloriesLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0i1O(SportRecordsDetailActivity r0) {
        return sportRecordCadence_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1(SportRecordsDetailActivity r0) {
        return sportRecordFastestSpeedUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X100O(SportRecordsDetailActivity r0) {
        return sportRecordAvgPace_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X11I(SportRecordsDetailActivity r0) {
        return sportRecordAltitude_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X11iII1O1(SportRecordsDetailActivity r0) {
        return sportRecordStrenuous_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1IX(SportRecordsDetailActivity r0) {
        return sportRecordCR_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(SportRecordsDetailActivity r0) {
        showMapContent$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XO0X10iO(SportRecordsDetailActivity r0) {
        return sportRecordAvgSpeedUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XOIX(SportRecordsDetailActivity r0) {
        return sportRecordFatBurning_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XOX0O0(SportRecordsDetailActivity r0) {
        return sportRecordDistanceLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XOXiX0(Ref.IntRef r0, SportRecordsDetailActivity r1, int r2, Bitmap r3, Ref.ObjectRef r4, Ref.ObjectRef r5, Bitmap r6, Ref.ObjectRef r7, Bitmap r8) {
        share$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public static /* synthetic */ RelativeLayout XX0(SportRecordsDetailActivity r0) {
        return sportRecordStepLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XX1Oi(SportRecordsDetailActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXI(SportRecordsDetailActivity r0) {
        return rootViewAltitude_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXIIO1i11(SportRecordsDetailActivity r0) {
        return otherDataLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXO(SportRecordsDetailActivity r0) {
        return sportRecordMaxHR_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXX11i(SportRecordsDetailActivity r0) {
        return rootViewSpeed_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XXiIiX10(SportRecordsDetailActivity r0) {
        return sportRecordFastestSpeedRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XiOIO(SportRecordsDetailActivity r0) {
        return sportRecordCadenceLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XiOIii1(SportRecordsDetailActivity r0) {
        return sportRecordFastestSpeed_delegate$lambda$0(r0);
    }

    private static final LinearLayout activityDataLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.activityDataLl);
    }

    private static final View bottomView_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return r1.findViewById(R.id.bottomView);
    }

    private static final boolean delete$lambda$0$0(SportRecordsDetailActivity r1) {
        SportRecordData r0 = r1.sportRecordData;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportRecordData");
        r0 = null;
    L5:
        SportRecordDataKt.deleteSportRecord(r0);
        r1.finish();
        return true;
    }

    private static final View downloadGpxIb_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return r1.findViewById(R.id.downloadGpxIb);
    }

    private final LinearLayout getActivityDataLl() {
        return (LinearLayout) getValue();
    }

    private final View getBottomView() {
        return (View) getValue();
    }

    private final View getDownloadGpxIb() {
        return (View) getValue();
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) getValue();
    }

    private final RelativeLayout getMapPbRl() {
        return (RelativeLayout) getValue();
    }

    private final FrameLayout getMapViewFrameLayout() {
        return (FrameLayout) getValue();
    }

    private final NestedScrollView getNestedScrollView() {
        return (NestedScrollView) getValue();
    }

    private final PFMedium getNickName() {
        return (PFMedium) getValue();
    }

    private final LinearLayout getOtherDataLl() {
        return (LinearLayout) getValue();
    }

    private final PFRegular getPacePF() {
        return (PFRegular) getValue();
    }

    private final int getPaceUnit() {
        if (this.userProfile.getUnit() != 0) goto L6;
        return R.string.pace_km;
    L6:
        return R.string.pace_mi;
    }

    private final RelativeLayout getRootView() {
        return (RelativeLayout) getValue();
    }

    private final LinearLayout getRootViewAltitude() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getRootViewHeartRate() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getRootViewSpeed() {
        return (LinearLayout) getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    private final PFRegular getSpeedPf() {
        return (PFRegular) getValue();
    }

    private final int getSpeedUnit() {
        if (this.userProfile.getUnit() != 0) goto L6;
        return R.string.km_h;
    L6:
        return R.string.mi_h;
    }

    private final PFMedium getSportName() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordAerobic() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportRecordAltitude() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getSportRecordAltitudeUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordAnaerobic() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportRecordAvgHR() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportRecordAvgPace() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordAvgPaceRl() {
        return (RelativeLayout) getValue();
    }

    private final PFMedium getSportRecordAvgPaceUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordAvgSpeed() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordAvgSpeedRl() {
        return (RelativeLayout) getValue();
    }

    private final PFMedium getSportRecordAvgSpeedUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordCD() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getSportRecordCDUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordCR() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getSportRecordCRUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordCadence() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordCadenceLl() {
        return (RelativeLayout) getValue();
    }

    private final DINCondBold getSportRecordCalories() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordCaloriesLl() {
        return (RelativeLayout) getValue();
    }

    private final DINCondBold getSportRecordDistance() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordDistanceLl() {
        return (RelativeLayout) getValue();
    }

    private final PFMedium getSportRecordDistanceUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordFastestPace() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordFastestPaceRl() {
        return (RelativeLayout) getValue();
    }

    private final PFMedium getSportRecordFastestPaceUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordFastestSpeed() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordFastestSpeedRl() {
        return (RelativeLayout) getValue();
    }

    private final PFMedium getSportRecordFastestSpeedUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getSportRecordFatBurning() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportRecordMaxHR() {
        return (DINCondBold) getValue();
    }

    private final LinearLayout getSportRecordPaceChartRl() {
        return (LinearLayout) getValue();
    }

    private final DINCondBold getSportRecordPauseTime() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordPauseTimeLl() {
        return (RelativeLayout) getValue();
    }

    private final DINCondBold getSportRecordStep() {
        return (DINCondBold) getValue();
    }

    private final RelativeLayout getSportRecordStepLl() {
        return (RelativeLayout) getValue();
    }

    private final DINCondBold getSportRecordStrenuous() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportRecordWarmUp() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportStartTime() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSportTime() {
        return (DINCondBold) getValue();
    }

    public static /* synthetic */ LinearLayout i010I(SportRecordsDetailActivity r0) {
        return rootViewHeartRate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold i0X000X0O(SportRecordsDetailActivity r0) {
        return sportStartTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold i11I(SportRecordsDetailActivity r0) {
        return sportRecordStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iI(SportRecordsDetailActivity r0) {
        return sportRecordCRUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout iIXi1iiXI(SportRecordsDetailActivity r0) {
        return mapPbRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound iIiiO(SportRecordsDetailActivity r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOO1ii1(SportRecordsDetailActivity r0) {
        return sportRecordAvgSpeed_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOOX010X(SportRecordsDetailActivity r0) {
        return sportRecordPauseTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOiXi11II(SportRecordsDetailActivity r0) {
        return sportRecordCalories_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iX(SportRecordsDetailActivity r0) {
        return sportRecordCDUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iX1O1(SportRecordsDetailActivity r0) {
        return sportRecordAvgPaceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout iXiX011(SportRecordsDetailActivity r0) {
        return sportRecordFastestPaceRl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iXiiiO(SportRecordsDetailActivity r0) {
        return sportRecordAnaerobic_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView iiiO(SportRecordsDetailActivity r0) {
        return nestedScrollView_delegate$lambda$0(r0);
    }

    private static final ImageViewRound ivAvatar_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.ivAvatar);
    }

    private final void localFindLocation(ArrayList<CustomLatLng> r18) {
        LocationDao r2 = this.mLocationDao;
        SportRecordData r3 = this.sportRecordData;
        SportRecordData r4 = null;
        if (r3 != null) goto L5;
        Intrinsics.XXO("sportRecordData");
        r3 = null;
    L5:
        long r6 = r3.getMStartTime();
        SportRecordData r5 = this.sportRecordData;
        if (r5 != null) goto L8;
        Intrinsics.XXO("sportRecordData");
    L9:
        List<Location> r7 = r2.getLocation(r6, r4.getMEndTime());
        if (r7.isEmpty() == false) goto L12;
    L30:
        this.locationSmoothAlgorithm.addAll(locationSmoothAlgorithm(r18));
        showMapContent(this.locationSmoothAlgorithm);
        return;
    L12:
        if (r7.size() < 2) goto L30;
        Iterator<Location> r8 = r7.iterator();
    L14:
        boolean r9 = true;
        if (r8.hasNext() == false) goto L20;
        if (r8.next().getMSource() != 1) goto L14;
        r9 = false;
    L20:
        if (this.isInChinaMainland == false) goto L26;
        if (r9 == false) goto L26;
        CoordinateConverter r10 = new CoordinateConverter().from(CoordinateConverter.CoordType.GPS);
        Iterator<Location> r11 = r7.iterator();
    L24:
        if (r11.hasNext() == false) goto L30;
        Location r12 = r11.next();
        LatLng r13 = r10.coord(new LatLng(r12.getMLatitude(), r12.getMLongitude())).convert();
        r18.add(new CustomLatLng(r13.latitude, r13.longitude, r12.getMTime(), r12.getMAltitude(), 0, 16, null));
    L26:
        Iterator<Location> r14 = r7.iterator();
    L28:
        if (r14.hasNext() == false) goto L30;
        Location r15 = r14.next();
        r18.add(new CustomLatLng(r15.getMLatitude(), r15.getMLongitude(), r15.getMTime(), r15.getMAltitude(), 0, 16, null));
        goto L28
    L8:
        r4 = r5;
        goto L9
    }

    private final ArrayList<CustomLatLng> locationSmoothAlgorithm(ArrayList<CustomLatLng> r34) {
        ArrayList<CustomLatLng> r1 = r34;
        ArrayList<CustomLatLng> r2 = new ArrayList();
        boolean r14 = false;
        CustomLatLng r3 = new CustomLatLng(r1.get(0).getLatitude(), r1.get(0).getLongitude(), r1.get(0).getTime(), r1.get(0).getAltitude(), 0, 16, null);
        CustomLatLng r15 = new CustomLatLng(0.0d, 0.0d, 0, 0, 0, 16, null);
        int r4 = r1.size();
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L18;
        CustomLatLng r6 = r1.get(r5);
        Intrinsics.O10IXXX0X(r6, "get(...)");
        CustomLatLng r7 = r6;
        if (r7.getLatitude() == r15.getLatitude()) goto L7;
    L9:
        float r8 = mc0.iIi1(DistanceUtil.getDistance(new LatLng(r3.getLatitude(), r3.getLongitude()), new LatLng(r7.getLatitude(), r7.getLongitude())) * ((double) 100)) / 100.0f;
        float r9 = r8 / (Math.abs(r7.getTime() - r3.getTime()) / ((long) 1000));
        int r10 = this.threshold;
        int r11 = this.thresholdMax;
        double r12 = r7.getLatitude();
        CustomLatLng r16 = r15;
        double r17 = r7.getLongitude();
        double r13 = r3.getLatitude();
        int r18 = r4;
        int r20 = r5;
        double r19 = r3.getLongitude();
        StringBuilder r21 = new StringBuilder();
        int r22 = r18;
        r21.append("secondSpeed = ");
        r21.append(r9);
        r21.append(" ");
        r21.append(r10);
        r21.append("，");
        r21.append(r11);
        r21.append("，");
        r21.append(r8);
        r21.append(" ---> ");
        r21.append(r12);
        r21.append(I000IiI1O.iO.XO0O10);
        r21.append(r17);
        r21.append(" --- ");
        r21.append(r13);
        r21.append(I000IiI1O.iO.XO0O10);
        r21.append(r19);
        LogUtils.d(new Object[]{r21.toString()});
        if (r9 < this.threshold) goto L16;
        LogUtils.d(new Object[]{"secondSpeed process"});
        int r23 = this.thresholdMax;
        if (r9 < r23) goto L15;
        LogUtils.d(new Object[]{"give up " + r9 + " " + r23 + " longitude=" + r7.getLongitude() + ",latitude=" + r7.getLatitude() + ",time=" + r7.getTime()});
        r7.setLongitude(r3.getLongitude());
        r7.setLatitude(r3.getLatitude());
        r15 = r16;
    L14:
        boolean r110 = false;
    L17:
        r3.setLatitude(r7.getLatitude());
        r3.setLongitude(r7.getLongitude());
        r3.setTime(r7.getTime());
        r3.setAltitude(r7.getAltitude());
        r2.add(new CustomLatLng(r7.getLatitude(), r7.getLongitude(), r7.getTime(), r7.getAltitude(), 0, 16, null));
        r5 = r20 + 1;
        r1 = r34;
        r14 = r110;
        r4 = r22;
        goto L3
    L15:
        r15 = r16;
        r15.setLatitude(r7.getLatitude());
        r15.setLongitude(r7.getLongitude());
        r15.setTime(r7.getTime());
        r15.setAltitude(r7.getAltitude());
        double r24 = 2;
        r7.setLongitude((r3.getLongitude() + r7.getLongitude()) / r24);
        r7.setLatitude((r3.getLatitude() + r7.getLatitude()) / r24);
        goto L14
    L16:
        r15 = r16;
        LogUtils.d(new Object[]{"secondSpeed No process"});
        r15.setLatitude(0.0d);
        r15.setLongitude(0.0d);
        r15.setTime(0);
        r110 = false;
        r15.setAltitude(0);
        goto L17
    L7:
        if (r7.getLongitude() != r15.getLongitude()) goto L9;
        r7.setLongitude(r3.getLongitude());
        r7.setLatitude(r3.getLatitude());
        r22 = r4;
        r20 = r5;
        r110 = r14;
        goto L17
    L18:
        return r2;
    }

    private static final RelativeLayout mapPbRl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.mapPbRl);
    }

    private static final FrameLayout mapViewFrameLayout_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (FrameLayout) r1.findViewById(R.id.mapViewFrameLayout);
    }

    private static final NestedScrollView nestedScrollView_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (NestedScrollView) r1.findViewById(R.id.nestedScrollView);
    }

    private static final PFMedium nickName_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.nickName);
    }

    private static final LinearLayout otherDataLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.otherDataLl);
    }

    private static final PFRegular pacePF_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFRegular) r1.findViewById(R.id.pacePF);
    }

    private static final LinearLayout rootViewAltitude_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rootViewAltitude);
    }

    private static final LinearLayout rootViewHeartRate_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rootViewHeartRate);
    }

    private static final LinearLayout rootViewSpeed_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rootViewSpeed);
    }

    private static final RelativeLayout rootView_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.rootView);
    }

    private static final RecyclerView rv_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void share$lambda$0(Ref.IntRef r2, SportRecordsDetailActivity r3, int r4, Bitmap r5, Ref.ObjectRef r6, Ref.ObjectRef r7, Bitmap r8, Ref.ObjectRef r9, Bitmap r10) {
        int r0 = r2.element + r10.getHeight();
        r2.element = r0;
        r3.spliceBitmapAndShare(r4, r0, r5, (Bitmap) r6.element, (Bitmap) r7.element, r8, (Bitmap) r9.element, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void share$lambda$1(Ref.IntRef r2, SportRecordsDetailActivity r3, int r4, Bitmap r5, Ref.ObjectRef r6, Ref.ObjectRef r7, Bitmap r8, Ref.ObjectRef r9, Bitmap r10) {
        int r0 = r2.element;
        if (r10 == null) goto L5;
        int r1 = r10.getHeight();
    L6:
        int r11 = r0 + r1;
        r2.element = r11;
        r3.spliceBitmapAndShare(r4, r11, r5, (Bitmap) r6.element, (Bitmap) r7.element, r8, (Bitmap) r9.element, r10);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    private final void showActivityData() {
        SportRecordData r0 = this.sportRecordData;
        SportRecordData r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("sportRecordData");
        r0 = null;
    L6:
        if (r0.getMSource() != 0) goto L14;
        SportRecordData r2 = this.sportRecordData;
        if (r2 != null) goto L10;
        Intrinsics.XXO("sportRecordData");
        r2 = null;
    L10:
        long r3 = r2.getMStartTime();
        SportRecordData r4 = this.sportRecordData;
        if (r4 != null) goto L13;
        Intrinsics.XXO("sportRecordData");
        r4 = null;
    L13:
        RecordActivityData r5 = SportRecordDataKt.sportRecordActivity(r3, r4.getMEndTime(), this.userProfile.getUnit());
    L21:
        this.activityData = r5;
        getSportTime().setText(this.activityData.getMSportTimeStr());
        PFMedium r6 = getSportName();
        Activity r7 = getMContext();
        SportRecordData r8 = this.sportRecordData;
        if (r8 != null) goto L24;
        Intrinsics.XXO("sportRecordData");
        r8 = null;
    L24:
        r6.setText(SportRecordDataKt.getWorkoutName(r7, r8));
        DINCondBold r9 = getSportStartTime();
        SportRecordData r10 = this.sportRecordData;
        if (r10 != null) goto L27;
        Intrinsics.XXO("sportRecordData");
    L28:
        r9.setText(SportRecordDataKt.getSportStartTime(r1));
        if (Intrinsics.XOO0ii0(this.activityData.getMPauseTimeTotal(), "00:00:00") == false) goto L31;
        getSportRecordPauseTimeLl().setVisibility(8);
    L33:
        if (this.activityData.getMStepTotal() > 0) goto L35;
        getSportRecordStep().setText("0");
    L37:
        if (this.activityData.getMDistanceTotal() > 0.0d) goto L39;
        getSportRecordDistance().setText("0.0");
    L40:
        getSportRecordDistanceUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        if (this.activityData.getMCalorieTotal() > 0) goto L43;
        getSportRecordCalories().setText("0");
    L45:
        if (this.activityData.getMSpm() > 0) goto L47;
        getSportRecordCadence().setText("0");
    L48:
        getNickName().setText(this.userProfile.getNickname());
        File r11 = uz0.OIi0(sz0.OXO1);
        if (r11.exists() == false) goto L52;
        getIvAvatar().setImageURI(Uri.fromFile(r11));
        return;
    L52:
        getIvAvatar().setVisibility(4);
        return;
    L47:
        getSportRecordCadence().setText(String.valueOf(this.activityData.getMSpm()));
        goto L48
    L43:
        getSportRecordCalories().setText(String.valueOf(this.activityData.getMCalorieTotal()));
        goto L45
    L39:
        getSportRecordDistance().setText(String.valueOf(this.activityData.getMDistanceTotal()));
        goto L40
    L35:
        getSportRecordStep().setText(String.valueOf(this.activityData.getMStepTotal()));
        goto L37
    L31:
        getSportRecordPauseTime().setText(this.activityData.getMPauseTimeTotal());
        goto L33
    L27:
        r1 = r10;
        goto L28
    L14:
        SportRecordData r12 = this.sportRecordData;
        if (r12 != null) goto L17;
        Intrinsics.XXO("sportRecordData");
        r12 = null;
    L17:
        long r13 = r12.getMStartTime();
        SportRecordData r14 = this.sportRecordData;
        if (r14 != null) goto L20;
        Intrinsics.XXO("sportRecordData");
        r14 = null;
    L20:
        r5 = SportRecordDataKt.sportRecordWorkout(r13, r14.getMEndTime(), this.userProfile.getUnit());
        goto L21
    }

    private final void showAltitudeData() {
        LocationDao r0 = this.mLocationDao;
        SportRecordData r1 = this.sportRecordData;
        SportRecordData r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("sportRecordData");
        r1 = null;
    L5:
        long r4 = r1.getMStartTime();
        SportRecordData r3 = this.sportRecordData;
        if (r3 != null) goto L8;
        Intrinsics.XXO("sportRecordData");
        r3 = null;
    L8:
        List<Location> r5 = r0.getLocation(r4, r3.getMEndTime());
        int r6 = 8;
        int r7 = 0;
        if (r5.isEmpty() == false) goto L11;
    L26:
        getRootViewAltitude().setVisibility(8);
    L27:
        int r8 = r5.size();
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
    L28:
        if (r7 >= r8) goto L42;
        Location r13 = r5.get(r7);
        if (r7 != 0) goto L33;
        r9 = r13.getMAltitude();
    L41:
        r12 = r13.getMAltitude();
        r7 = r7 + 1;
        goto L28
    L33:
        if (r9 >= r13.getMAltitude()) goto L36;
        r9 = r13.getMAltitude();
    L36:
        if (r12 >= r13.getMAltitude()) goto L39;
        r10 = r10 + (r13.getMAltitude() - r12);
        goto L41
    L39:
        if (r12 <= r13.getMAltitude()) goto L41;
        r11 = r11 + (r12 - r13.getMAltitude());
        goto L41
    L42:
        DINCondBold r14 = getSportRecordAltitude();
        if (this.activityData.getMAltitude() <= 0) goto L45;
        r9 = this.activityData.getMAltitude();
    L45:
        r14.setText(cp5.iIXi1iiXI(r9, this.userProfile.getUnit()));
        getSportRecordCR().setText(cp5.iIXi1iiXI(r10, this.userProfile.getUnit()));
        getSportRecordCD().setText(cp5.iIXi1iiXI(r11, this.userProfile.getUnit()));
        if (this.userProfile.getUnit() != 0) goto L48;
        int r15 = R.string.m;
    L49:
        getSportRecordAltitudeUnit().setText(r15);
        getSportRecordCRUnit().setText(r15);
        getSportRecordCDUnit().setText(r15);
        return;
    L48:
        r15 = R.string.yd;
        goto L49
    L11:
        if (r5.size() < 2) goto L26;
        LinearLayout r16 = getRootViewAltitude();
        SportRecordData r17 = this.sportRecordData;
        if (r17 != null) goto L16;
        Intrinsics.XXO("sportRecordData");
    L17:
        int r18 = r2.getMMode();
        if (r18 != 10) goto L20;
    L24:
        r6 = 0;
    L25:
        r16.setVisibility(r6);
        goto L27
    L20:
        if (r18 == 13) goto L24;
        if (r18 == 19) goto L24;
    L16:
        r2 = r17;
        goto L17
    }

    private final void showBaiDuMap(ArrayList<CustomLatLng> r4) {
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r4);
        BaseFragment r5 = (BaseFragment) BaiDuMapSportRecordFragment.class.newInstance();
        r5.setArguments(r1);
        if (r5 == null) goto L7;
        BaiDuMapSportRecordFragment r6 = (BaiDuMapSportRecordFragment) r5;
        this.mBaiDuMapFragment = r6;
        Intrinsics.XXI(r6);
        NestedScrollView r2 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r2, "<get-nestedScrollView>(...)");
        r6.setOnMapTouchListener(r2);
        FragmentTransaction r7 = getSupportFragmentManager().beginTransaction();
        BaiDuMapSportRecordFragment r3 = this.mBaiDuMapFragment;
        Intrinsics.XXI(r3);
        r7.add(R.id.mapViewFrameLayout, r3).commit();
        return;
    L7:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.BaiDuMapSportRecordFragment");
    }

    private final void showGoogleMap(ArrayList<CustomLatLng> r4) {
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r4);
        BaseFragment r5 = (BaseFragment) GoogleMapSportRecordFragment.class.newInstance();
        r5.setArguments(r1);
        if (r5 == null) goto L7;
        GoogleMapSportRecordFragment r6 = (GoogleMapSportRecordFragment) r5;
        this.mGoogleMapFragment = r6;
        Intrinsics.XXI(r6);
        NestedScrollView r2 = getNestedScrollView();
        Intrinsics.O10IXXX0X(r2, "<get-nestedScrollView>(...)");
        r6.setOnMapTouchListener(r2);
        FragmentTransaction r7 = getSupportFragmentManager().beginTransaction();
        GoogleMapSportRecordFragment r3 = this.mGoogleMapFragment;
        Intrinsics.XXI(r3);
        r7.add(R.id.mapViewFrameLayout, r3).commit();
        return;
    L7:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.GoogleMapSportRecordFragment");
    }

    private final void showHeartRateData() {
        RecordDetailHeartRateData r1 = SportRecordDataKt.sportRecordHeartRateDetail(this.mHeartRateDao, this.activityData.getMTimeList());
        SportRecordData r2 = this.sportRecordData;
        SportRecordData r4 = null;
        if (r2 != null) goto L5;
        Intrinsics.XXO("sportRecordData");
        r2 = null;
    L5:
        long r5 = r2.getMEndTime();
        SportRecordData r3 = this.sportRecordData;
        if (r3 != null) goto L8;
        Intrinsics.XXO("sportRecordData");
        r3 = null;
    L8:
        long r7 = 1000;
        long r9 = 60;
        long r6 = (((r5 - r3.getMStartTime()) / r7) / r9) + 1;
        iO1Xi1X1i r8 = iO1Xi1X1i.OXO1;
        LineChart r13 = this.lineChart;
        if (r13 != null) goto L11;
        Intrinsics.XXO("lineChart");
        r13 = null;
    L11:
        r8.XIi00iiXO(r13);
        LineChart r14 = this.lineChart;
        if (r14 != null) goto L14;
        Intrinsics.XXO("lineChart");
        r14 = null;
    L14:
        YAxis r15 = r14.getAxisLeft();
        Intrinsics.O10IXXX0X(r15, "getAxisLeft(...)");
        LineChart r16 = this.lineChart;
        if (r16 != null) goto L17;
        Intrinsics.XXO("lineChart");
        r16 = null;
    L17:
        YAxis r17 = r16.getAxisRight();
        Intrinsics.O10IXXX0X(r17, "getAxisRight(...)");
        r8.IO(r15, r17, r1.getMMaxHR() + 5.0f, r1.getMMinHR() - 5.0f);
        LineChart r11 = this.lineChart;
        if (r11 != null) goto L20;
        Intrinsics.XXO("lineChart");
        r11 = null;
    L20:
        r11.setTouchEnabled(false);
        r11.getDescription().XOO0ii0(false);
        r11.getLegend().XOO0ii0(false);
        LineChart r12 = this.lineChart;
        if (r12 != null) goto L23;
        Intrinsics.XXO("lineChart");
        r12 = null;
    L23:
        XAxis r18 = r12.getXAxis();
        Intrinsics.XXI(r18);
        LineChart r19 = this.lineChart;
        if (r19 != null) goto L26;
        Intrinsics.XXO("lineChart");
        r19 = null;
    L26:
        Context r110 = r19.getContext();
        Intrinsics.O10IXXX0X(r110, "getContext(...)");
        r8.OIi0(r18, false, r110);
        r18.i0X000X0O(0.0f);
        r18.IXOIIIO(1.0f);
        r18.iOiXi11II(r6);
        SimpleDateFormat r10 = O0X11OiO.IXI(false, 1, null);
        ArrayList r111 = new ArrayList();
        long r112 = 0;
        if (0 > r6) goto L34;
    L28:
        SportRecordData r113 = this.sportRecordData;
        if (r113 != null) goto L31;
        Intrinsics.XXO("sportRecordData");
        r113 = r4;
    L31:
        long r22 = r6;
        String r20 = TimeUtils.millis2String(r113.getMStartTime() + ((r112 * r9) * r7), r10);
        Intrinsics.O10IXXX0X(r20, "millis2String(...)");
        r111.add(r20);
        if (r112 == r22) goto L34;
        r112 = r112 + 1;
        r6 = r22;
        r4 = null;
    L34:
        r18.Oi(new q4(r111));
        DINCondBold r21 = getSportRecordAvgHR();
        if (this.activityData.getMAvgBpm() <= 0) goto L37;
        int r23 = this.activityData.getMAvgBpm();
    L38:
        r21.setText(String.valueOf(r23));
        DINCondBold r24 = getSportRecordMaxHR();
        if (this.activityData.getMMaxBpm() <= 0) goto L41;
        int r25 = this.activityData.getMMaxBpm();
    L42:
        r24.setText(String.valueOf(r25));
        showHeartRateFilterData(r1.getMHeartRateList());
        getSportRecordStrenuous().setText(String.valueOf(r1.getMStrenuous()));
        getSportRecordAnaerobic().setText(String.valueOf(r1.getMAnaerobic()));
        getSportRecordAerobic().setText(String.valueOf(r1.getMAerobic()));
        getSportRecordFatBurning().setText(String.valueOf(r1.getMFatBurning()));
        getSportRecordWarmUp().setText(String.valueOf(r1.getMWarmUp()));
        return;
    L41:
        r25 = r1.getMMaxHR();
        goto L42
    L37:
        r23 = r1.getMAvgHR();
        goto L38
    }

    private final void showHeartRateFilterData(List<HeartRate> r13) {
        if (r13.isEmpty() == false) goto L5;
        return;
    L5:
        ArrayList r0 = new ArrayList();
        LinkedHashMap r1 = new LinkedHashMap();
        SportRecordData r2 = this.sportRecordData;
        SportRecordData r3 = null;
        if (r2 != null) goto L8;
        Intrinsics.XXO("sportRecordData");
        r2 = null;
    L8:
        long r5 = r2.getMStartTime();
        SportRecordData r4 = this.sportRecordData;
        if (r4 != null) goto L11;
        Intrinsics.XXO("sportRecordData");
    L12:
        long r6 = ProgressionUtilKt.XO0O10(r5, r3.getMEndTime(), 60000);
        int r7 = 0;
        if (r5 > r6) goto L17;
    L14:
        r1.put(Long.valueOf(r5), new HRMinuteData(0, 0));
        if (r5 == r6) goto L17;
        r5 = r5 + 60000;
    L17:
        Iterator<HeartRate> r14 = r13.iterator();
    L19:
        if (r14.hasNext() == false) goto L26;
        HeartRate r8 = r14.next();
        Iterator r9 = r1.entrySet().iterator();
    L22:
        if (r9.hasNext() == false) goto L19;
        Map.Entry r10 = (Map.Entry) r9.next();
        long r11 = ((Number) r10.getKey()).longValue();
        HRMinuteData r12 = (HRMinuteData) r10.getValue();
        if (r8.getMTime() > r11) goto L22;
        r12.setTotal(r12.getTotal() + r8.getMBpm());
        r12.setNum(r12.getNum() + 1);
        goto L19
    L26:
        Iterator r15 = r1.entrySet().iterator();
        float r16 = 0.0f;
        int r17 = 0;
    L28:
        if (r15.hasNext() == false) goto L42;
        HRMinuteData r18 = (HRMinuteData) ((Map.Entry) r15.next()).getValue();
        if (r18.getNum() == 0) goto L41;
        if (r18.getTotal() == 0) goto L41;
        int r19 = r18.getTotal() / r18.getNum();
        r0.add(new Entry(r16, r19));
        if (r7 >= r19) goto L36;
        r7 = r19;
    L36:
        if (r17 != 0) goto L38;
        r17 = r19;
    L38:
        if (1 > r19) goto L41;
        if (r19 >= r17) goto L41;
        r17 = r19;
    L41:
        r16 = r16 + 1.0f;
        goto L28
    L42:
        showHeartRateUpdateChartData(r0);
        return;
    L11:
        r3 = r4;
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showHeartRateUpdateChartData(List<Entry> r8) {
        LineChart r2 = this.lineChart;
        LineChart r4 = null;
        if (r2 != null) goto L6;
        Intrinsics.XXO("lineChart");
        r2 = null;
    L6:
        if (r2.getData() == 0) goto L28;
        LineChart r3 = this.lineChart;
        if (r3 != null) goto L11;
        Intrinsics.XXO("lineChart");
        r3 = null;
    L11:
        if (((co) r3.getData()).XXI() <= 0) goto L28;
        LineChart r0 = this.lineChart;
        if (r0 != null) goto L15;
        Intrinsics.XXO("lineChart");
        r0 = null;
    L15:
        T r1 = ((co) r0.getData()).OIX0iXi(0);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        LineDataSet r5 = (LineDataSet) r1;
        this.setValue = r5;
        if (r5 != null) goto L18;
        Intrinsics.XXO("setValue");
        r5 = null;
    L18:
        r5.IOX1(r8);
        LineDataSet r9 = this.setValue;
        if (r9 != null) goto L21;
        Intrinsics.XXO("setValue");
        r9 = null;
    L21:
        r9.i0X1iIO();
        LineChart r10 = this.lineChart;
        if (r10 != null) goto L24;
        Intrinsics.XXO("lineChart");
        r10 = null;
    L24:
        ((co) r10.getData()).iX();
        LineChart r11 = this.lineChart;
        if (r11 != null) goto L27;
        Intrinsics.XXO("lineChart");
        r11 = null;
    L27:
        r11.X0i1O();
    L56:
        LineChart r12 = this.lineChart;
        if (r12 != null) goto L59;
        Intrinsics.XXO("lineChart");
        r12 = null;
    L59:
        r12.I0IIOi(1000);
        LineChart r13 = this.lineChart;
        if (r13 != null) goto L62;
        Intrinsics.XXO("lineChart");
    L63:
        r4.invalidate();
        return;
    L62:
        r4 = r13;
    L28:
        LineDataSet r6 = new LineDataSet(r8, "");
        this.setValue = r6;
        r6.II1(ContextCompat.getColor(getMContext(), R.color.hr_color));
        LineDataSet r14 = this.setValue;
        if (r14 != null) goto L31;
        Intrinsics.XXO("setValue");
        r14 = null;
    L31:
        r14.I00(ContextCompat.getColor(getMContext(), R.color.hr_color));
        LineDataSet r15 = this.setValue;
        if (r15 != null) goto L34;
        Intrinsics.XXO("setValue");
        r15 = null;
    L34:
        r15.I1XII0X(2.0f);
        LineDataSet r16 = this.setValue;
        if (r16 != null) goto L37;
        Intrinsics.XXO("setValue");
        r16 = null;
    L37:
        r16.iXOII(1.0f);
        LineDataSet r17 = this.setValue;
        if (r17 != null) goto L40;
        Intrinsics.XXO("setValue");
        r17 = null;
    L40:
        r17.IOI0i0I(false);
        LineDataSet r18 = this.setValue;
        if (r18 != null) goto L43;
        Intrinsics.XXO("setValue");
        r18 = null;
    L43:
        r18.XXI(false);
        LineDataSet r19 = this.setValue;
        if (r19 != null) goto L46;
        Intrinsics.XXO("setValue");
        r19 = null;
    L46:
        r19.O1iXiI(true);
        Drawable r20 = ContextCompat.getDrawable(getMContext(), R.drawable.shape_hr);
        Intrinsics.X1ii(r20, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        LineDataSet r7 = this.setValue;
        if (r7 != null) goto L49;
        Intrinsics.XXO("setValue");
        r7 = null;
    L49:
        r7.I0i1OXiI(r20);
        LineDataSet r21 = this.setValue;
        if (r21 != null) goto L52;
        Intrinsics.XXO("setValue");
        r21 = null;
    L52:
        co r22 = new co(new IiXO1XOi[]{r21});
        r22.iI(false);
        LineChart r23 = this.lineChart;
        if (r23 != null) goto L55;
        Intrinsics.XXO("lineChart");
        r23 = null;
    L55:
        r23.setData(r22);
        goto L56
    }

    private final void showLocation() {
        localFindLocation(new ArrayList());
    }

    private final void showMapContent(ArrayList<CustomLatLng> r4) {
        if (r4 != null) goto L4;
    L13:
        getMapPbRl().setVisibility(8);
        return;
    L4:
        if (r4.isEmpty() == true) goto L13;
        if (r4.size() < 2) goto L13;
        if (this.isInChinaMainland == false) goto L10;
        showBaiDuMap(r4);
    L11:
        new Handler().postDelayed(new c35(this), 1000);
        return;
    L10:
        showGoogleMap(r4);
        goto L11
    }

    private static final void showMapContent$lambda$0(SportRecordsDetailActivity r2) {
        r2.getMapViewFrameLayout().setVisibility(0);
        r2.getMapPbRl().setVisibility(8);
    }

    private final void showSpeedData() {
        SportRecordData r0 = this.sportRecordData;
        SportRecordData r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("sportRecordData");
        r0 = null;
    L6:
        if (r0.getMSource() != 0) goto L11;
        ArrayList<RecordTimeList> r2 = this.activityData.getMTimeList();
        SportRecordData r3 = this.sportRecordData;
        if (r3 != null) goto L10;
        Intrinsics.XXO("sportRecordData");
        r3 = null;
    L10:
        RecordDetailSpeedData r4 = SportRecordDataKt.sportRecordActivityDetailSpeed(r2, r3.getMMode(), this.userProfile.getUnit());
    L16:
        if (this.activityData.getMSpeed() > 0.0d) goto L18;
        getSportRecordAvgSpeed().setText("0.0");
    L20:
        if (r4.getMFastestSpeed() >= this.activityData.getMSpeed()) goto L23;
        r4.setMFastestSpeed(this.activityData.getMSpeed());
    L23:
        if (r4.getMFastestSpeed() > 0.0d) goto L25;
        getSportRecordFastestSpeed().setText("0.0");
    L26:
        int r5 = getSpeedUnit();
        getSportRecordAvgSpeedUnit().setText(r5);
        getSportRecordFastestSpeedUnit().setText(r5);
        ArrayList<Integer> r6 = r4.getMPaceList();
        int r7 = getPaceUnit();
        getSportRecordAvgPaceUnit().setText(r7);
        getSportRecordFastestPaceUnit().setText(r7);
        int r8 = r6.size();
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
    L28:
        if (r10 >= r8) goto L39;
        Integer r14 = r6.get(r10);
        Intrinsics.O10IXXX0X(r14, "get(...)");
        int r15 = r14.intValue();
        if (r15 <= 30000) goto L32;
        r6.set(r10, Integer.valueOf(this.activityData.getMPace()));
        r15 = this.activityData.getMPace();
    L32:
        if (r10 != 0) goto L34;
        r11 = r15;
        r12 = r11;
    L34:
        if (r11 <= r15) goto L36;
        r11 = r15;
    L36:
        if (r12 >= r15) goto L38;
        r12 = r15;
    L38:
        r13 = r13 + r15;
        r10 = r10 + 1;
        goto L28
    L39:
        SportRecordData r16 = this.sportRecordData;
        if (r16 != null) goto L42;
        Intrinsics.XXO("sportRecordData");
    L43:
        boolean r17 = true;
        if (r1.getMSource() == 1) goto L46;
    L62:
        getSportRecordFastestPace().setText(cp5.iXiiiO(r11));
        DINCondBold r18 = getSportRecordAvgPace();
        if (this.activityData.getMPace() <= 0) goto L66;
        String r19 = cp5.iXiiiO(this.activityData.getMPace());
    L70:
        r18.setText(r19);
    L71:
        r17 = false;
    L73:
        if (r6.size() == 0) goto L75;
    L83:
        ArrayList r20 = new ArrayList();
        int r21 = r6.size();
    L84:
        if (r9 >= r21) goto L90;
        Integer r22 = r6.get(r9);
        Intrinsics.O10IXXX0X(r22, "get(...)");
        int r23 = r22.intValue();
        r9 = r9 + 1;
        String r24 = String.valueOf(r9);
        float r110 = r23 / r12;
        if (r17 == false) goto L88;
        String r25 = cp5.Ii1iii0(r23, this.userProfile.getUnit());
    L89:
        r20.add(new b15(r24, r110, r25));
        goto L84
    L88:
        r25 = cp5.iXiiiO(r23);
        goto L89
    L90:
        RecyclerView r26 = getRv();
        r26.setLayoutManager(new LinearLayoutManager(r26.getContext()));
        Context r27 = r26.getContext();
        Intrinsics.O10IXXX0X(r27, "getContext(...)");
        r26.setAdapter(new SportRecordDetailSpeedAdapter(r20, r27));
        return;
    L75:
        if (this.activityData.getMDistanceTotal() <= 0.0f) goto L82;
        r12 = this.activityData.getMPace() * 2;
        int r28 = (int) this.activityData.getMDistanceTotal();
        if (r28 < 0) goto L83;
        int r29 = 0;
    L79:
        r6.add(Integer.valueOf(this.activityData.getMPace()));
        if (r29 == r28) goto L83;
        r29 = r29 + 1;
        goto L79
    L82:
        r6.add(Integer.valueOf(this.activityData.getMPace()));
        goto L83
    L66:
        if (r6.size() != 0) goto L68;
        int r30 = 0;
    L69:
        r19 = cp5.iXiiiO(r30);
        goto L70
    L68:
        r30 = r13 / r6.size();
        goto L69
    L46:
        if (this.activityData.getMPace() <= 0) goto L62;
        getSportRecordAvgPace().setText(cp5.Ii1iii0(this.activityData.getMPace(), this.userProfile.getUnit()));
        if (r11 == 0) goto L50;
    L57:
        DINCondBold r31 = getSportRecordFastestPace();
        if (this.activityData.getMMinPace() <= 0) goto L60;
        String r32 = cp5.Ii1iii0(this.activityData.getMMinPace(), this.userProfile.getUnit());
    L61:
        r31.setText(String.valueOf(r32));
        goto L71
    L60:
        r32 = cp5.iXiiiO(r11);
        goto L61
    L50:
        if (r6.size() != 0) goto L57;
        DINCondBold r33 = getSportRecordFastestPace();
        if (this.activityData.getMMinPace() <= 0) goto L55;
        int r34 = this.activityData.getMMinPace();
    L56:
        r33.setText(String.valueOf(cp5.Ii1iii0(r34, this.userProfile.getUnit())));
        goto L73
    L55:
        r34 = this.activityData.getMPace();
        goto L56
    L42:
        r1 = r16;
        goto L43
    L25:
        getSportRecordFastestSpeed().setText(String.valueOf(r4.getMFastestSpeed()));
        goto L26
    L18:
        getSportRecordAvgSpeed().setText(String.valueOf(this.activityData.getMSpeed()));
        goto L20
    L11:
        ArrayList<RecordTimeList> r35 = this.activityData.getMTimeList();
        SportRecordData r36 = this.sportRecordData;
        if (r36 != null) goto L14;
        Intrinsics.XXO("sportRecordData");
        r36 = null;
    L14:
        r4 = SportRecordDataKt.sportRecordWorkoutDetailSpeed(r35, r36.getMMode(), this.userProfile.getUnit(), this.locationSmoothAlgorithm);
        goto L16
    }

    private static final PFRegular speedPf_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFRegular) r1.findViewById(R.id.speedPf);
    }

    private final void spliceBitmapAndShare(int r5, int r6, Bitmap r7, Bitmap r8, Bitmap r9, Bitmap r10, Bitmap r11, Bitmap r12) {
        Bitmap r13 = Bitmap.createBitmap(r7.getWidth(), r6, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r13, "createBitmap(...)");
        Canvas r0 = new Canvas(r13);
        if (r12 == null) goto L5;
        r0.drawBitmap(r12, 0.0f, 0.0f, null);
        float r14 = (r12.getHeight() - SizeUtils.dp2px(30.0f)) + 0.0f;
        r0.drawBitmap(r7, 0.0f, r14, null);
    L6:
        float r15 = r14 + (r7.getHeight() + r5);
        if (r8 == null) goto L9;
        r0.drawBitmap(r8, 0.0f, r15, null);
        r15 = r15 + (r8.getHeight() + r5);
    L9:
        if (r9 == null) goto L11;
        r0.drawBitmap(r9, 0.0f, r15, null);
        r15 = r15 + (r9.getHeight() + r5);
    L11:
        if (r11 == null) goto L13;
        r0.drawBitmap(r11, 0.0f, r15, null);
        r15 = r15 + (r11.getHeight() + r5);
    L13:
        r0.drawBitmap(r10, 0.0f, r15, null);
        XIi1i01O.OXO1.XO0O10(getMContext(), r13);
        return;
    L5:
        r0.drawBitmap(r7, 0.0f, 0.0f, null);
        r14 = 0.0f;
        goto L6
    }

    public static /* synthetic */ void spliceBitmapAndShare$default(SportRecordsDetailActivity r10, int r11, int r12, Bitmap r13, Bitmap r14, Bitmap r15, Bitmap r16, Bitmap r17, Bitmap r18, int r19, Object r20) {
        if ((r19 & 128) == 0) goto L6;
        Bitmap r9 = null;
    L7:
        r10.spliceBitmapAndShare(r11, r12, r13, r14, r15, r16, r17, r9);
        return;
    L6:
        r9 = r18;
        goto L7
    }

    private static final PFMedium sportName_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportName);
    }

    private static final DINCondBold sportRecordAerobic_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordAerobic);
    }

    private static final PFMedium sportRecordAltitudeUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordAltitudeUnit);
    }

    private static final DINCondBold sportRecordAltitude_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordAltitude);
    }

    private static final DINCondBold sportRecordAnaerobic_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordAnaerobic);
    }

    private static final DINCondBold sportRecordAvgHR_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordAvgHR);
    }

    private static final RelativeLayout sportRecordAvgPaceRl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordAvgPaceRl);
    }

    private static final PFMedium sportRecordAvgPaceUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordAvgPaceUnit);
    }

    private static final DINCondBold sportRecordAvgPace_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordAvgPace);
    }

    private static final RelativeLayout sportRecordAvgSpeedRl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordAvgSpeedRl);
    }

    private static final PFMedium sportRecordAvgSpeedUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordAvgSpeedUnit);
    }

    private static final DINCondBold sportRecordAvgSpeed_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordAvgSpeed);
    }

    private static final PFMedium sportRecordCDUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordCDUnit);
    }

    private static final DINCondBold sportRecordCD_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordCD);
    }

    private static final PFMedium sportRecordCRUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordCRUnit);
    }

    private static final DINCondBold sportRecordCR_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordCR);
    }

    private static final RelativeLayout sportRecordCadenceLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordCadenceLl);
    }

    private static final DINCondBold sportRecordCadence_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordCadence);
    }

    private static final RelativeLayout sportRecordCaloriesLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordCaloriesLl);
    }

    private static final DINCondBold sportRecordCalories_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordCalories);
    }

    private static final RelativeLayout sportRecordDistanceLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordDistanceLl);
    }

    private static final PFMedium sportRecordDistanceUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordDistanceUnit);
    }

    private static final DINCondBold sportRecordDistance_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordDistance);
    }

    private static final RelativeLayout sportRecordFastestPaceRl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordFastestPaceRl);
    }

    private static final PFMedium sportRecordFastestPaceUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordFastestPaceUnit);
    }

    private static final DINCondBold sportRecordFastestPace_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordFastestPace);
    }

    private static final RelativeLayout sportRecordFastestSpeedRl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordFastestSpeedRl);
    }

    private static final PFMedium sportRecordFastestSpeedUnit_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.sportRecordFastestSpeedUnit);
    }

    private static final DINCondBold sportRecordFastestSpeed_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordFastestSpeed);
    }

    private static final DINCondBold sportRecordFatBurning_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordFatBurning);
    }

    private static final DINCondBold sportRecordMaxHR_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordMaxHR);
    }

    private static final LinearLayout sportRecordPaceChartRl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.sportRecordPaceChartRl);
    }

    private static final RelativeLayout sportRecordPauseTimeLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordPauseTimeLl);
    }

    private static final DINCondBold sportRecordPauseTime_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordPauseTime);
    }

    private static final RelativeLayout sportRecordStepLl_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sportRecordStepLl);
    }

    private static final DINCondBold sportRecordStep_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordStep);
    }

    private static final DINCondBold sportRecordStrenuous_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordStrenuous);
    }

    private static final DINCondBold sportRecordWarmUp_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportRecordWarmUp);
    }

    private static final DINCondBold sportStartTime_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportStartTime);
    }

    private static final DINCondBold sportTime_delegate$lambda$0(SportRecordsDetailActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.sportTime);
    }

    public final void delete(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mDeletePopup != null) goto L5;
        go0 r6 = new go0(this, 0, 2, null);
        String r0 = getString(R.string.delete_record_remind);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        r6.iI(r0);
        go0.X11iII1O1(r6, Integer.valueOf(R.string.cancel), null, 2, null);
        r6.X1IX(R.string.confirm, new c15(this));
        this.mDeletePopup = r6;
    L5:
        go0 r7 = this.mDeletePopup;
        if (r7 == null) goto L9;
        RelativeLayout r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r7.I1XOi1(r1);
        return;
    }

    public final void downloadGpx(@aa1 View r12) {
        Intrinsics.X0O(r12, "view");
        if (this.locationSmoothAlgorithm.size() <= 0) goto L13;
        SimpleDateFormat r13 = O0X11OiO.OIX0iXi();
        int r0 = TimeZone.getDefault().getRawOffset();
        StringBuilder r1 = new StringBuilder();
        r1.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><gpx creator='");
        r1.append(this.userProfile.getNickname());
        r1.append("' version=\"1.1\" xmlns='http://www.topografix.com/GPX/1/1'><metadata><time>");
        SportRecordData r2 = this.sportRecordData;
        if (r2 != null) goto L7;
        Intrinsics.XXO("sportRecordData");
        r2 = null;
    L7:
        long r4 = r0;
        r1.append(r13.format(Long.valueOf(r2.getMStartTime() - r4)));
        r1.append("</time></metadata>");
        StringBuilder r3 = new StringBuilder();
        r3.append("<trk><name>");
        r3.append(getSportName().getText());
        r3.append("</name><desc>");
        r3.append(getString(R.string.app_name));
        r3.append("</desc><trkseg>");
        int r5 = this.locationSmoothAlgorithm.size();
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L10;
        CustomLatLng r7 = this.locationSmoothAlgorithm.get(r6);
        Intrinsics.O10IXXX0X(r7, "get(...)");
        CustomLatLng r8 = r7;
        r1.append("<wpt lat='");
        r1.append(r8.getLatitude());
        r1.append("' lon='");
        r1.append(r8.getLongitude());
        r1.append("'><name>\"");
        r6 = r6 + 1;
        r1.append(r6);
        r1.append("\"</name><ele>");
        r1.append(r8.getAltitude());
        r1.append("</ele><time>");
        r1.append(r13.format(Long.valueOf(r8.getTime() - r4)));
        r1.append("</time></wpt>");
        r3.append("<trkpt lat='");
        r3.append(r8.getLatitude());
        r3.append("' lon='");
        r3.append(r8.getLongitude());
        r3.append("'><ele>");
        r3.append(r8.getAltitude());
        r3.append("</ele><time>");
        r3.append(r13.format(Long.valueOf(r8.getTime() - r4)));
        r3.append("</time></trkpt>");
        goto L8
    L10:
        r3.append("</trkseg></trk>");
        r1.append(r3.toString());
        r1.append("</gpx>");
        sz0 r14 = sz0.OXO1;
        FileIOUtils.writeFileFromString(uz0.O1O(r14), r1.toString());
        Intent r9 = new Intent("android.intent.action.SEND");
        r9.putExtra("android.intent.extra.TEXT", getString(R.string.share_gpx_file));
        r9.putExtra("android.intent.extra.STREAM", r14.XO0O10(uz0.O1O(r14)));
        r9.setType("application/gpx");
        startActivity(Intent.createChooser(r9, getString(R.string.share_gpx_file)));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        Parcelable r0 = getMArg2();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.model.SportRecordData");
        this.sportRecordData = (SportRecordData) r0;
        View r1 = findViewById(R.id.sportRecordLineChartHR);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.lineChart = (LineChart) r1;
        SportRecordData r2 = this.sportRecordData;
        SportRecordData r3 = null;
        if (r2 != null) goto L6;
        Intrinsics.XXO("sportRecordData");
        r2 = null;
    L6:
        switch(r2.getMMode()) {
            case 7: goto L15;
            case 8: goto L15;
            case 9: goto L15;
            case 10: goto L10;
            case 11: goto L9;
            case 12: goto L15;
            case 13: goto L15;
            case 14: goto L9;
            case 15: goto L9;
            case 16: goto L8;
            case 17: goto L8;
            case 18: goto L8;
            case 19: goto L15;
            case 20: goto L16;
            case 21: goto L9;
            case 22: goto L16;
            case 23: goto L16;
            case 24: goto L16;
            case 25: goto L8;
            case 26: goto L8;
            case 27: goto L8;
            case 28: goto L16;
            case 29: goto L16;
            case 30: goto L16;
            case 31: goto L16;
            case 32: goto L16;
            case 33: goto L8;
            case 34: goto L8;
            case 35: goto L8;
            case 36: goto L16;
            case 37: goto L8;
            case 38: goto L8;
            case 39: goto L8;
            case 40: goto L8;
            case 41: goto L8;
            case 42: goto L8;
            case 43: goto L8;
            case 44: goto L8;
            case 45: goto L8;
            case 46: goto L8;
            default: goto L16;
        };
    L8:
        getSportRecordDistanceLl().setVisibility(8);
        getSportRecordCadenceLl().setVisibility(8);
        getRootViewSpeed().setVisibility(8);
        getRootViewAltitude().setVisibility(8);
        goto L16
    L9:
        getSportRecordStepLl().setVisibility(8);
        getSportRecordDistanceLl().setVisibility(8);
        getSportRecordCadenceLl().setVisibility(8);
        getRootViewSpeed().setVisibility(8);
        getRootViewAltitude().setVisibility(8);
        goto L16
    L10:
        this.threshold = 10;
        this.thresholdMax = 100;
        getSportRecordStepLl().setVisibility(8);
        getSportRecordCadenceLl().setVisibility(8);
        if (BleCache.INSTANCE.getMAGpsType() != 0) goto L16;
        if (q62.OXO1.XOXOIX0Oi() == true) goto L16;
        getSportRecordDistanceLl().setVisibility(8);
        getRootViewSpeed().setVisibility(8);
        getRootViewAltitude().setVisibility(8);
        goto L16
    L15:
        this.threshold = 5;
        this.thresholdMax = 100;
    L16:
        ViewGroup.LayoutParams r4 = getActivityDataLl().getLayoutParams();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams r5 = (RelativeLayout.LayoutParams) r4;
        SportRecordData r6 = this.sportRecordData;
        if (r6 != null) goto L19;
        Intrinsics.XXO("sportRecordData");
    L21:
        if (r3.getMIsLocationEmpty() == false) goto L23;
        getMapPbRl().setVisibility(8);
        getDownloadGpxIb().setVisibility(8);
        r5.topMargin = SizeUtils.dp2px(70.0f);
        getNestedScrollView().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_main_bg));
    L24:
        showActivityData();
        showHeartRateData();
        showSpeedData();
        showAltitudeData();
        return;
    L23:
        getMapPbRl().setVisibility(0);
        getDownloadGpxIb().setVisibility(0);
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        r5.topMargin = SizeUtils.dp2px(370.0f);
        getNestedScrollView().setBackgroundResource(R.color.text_color);
        showLocation();
        goto L24
    L19:
        r3 = r6;
        goto L21
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_records_detail;
    }

    public final void onBack(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v17, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, android.graphics.Bitmap] */
    public final void share(@aa1 View r12) {
        Intrinsics.X0O(r12, "view");
        final Ref.IntRef r1 = new Ref.IntRef();
        final Ref.ObjectRef r8 = new Ref.ObjectRef();
        final Ref.ObjectRef r5 = new Ref.ObjectRef();
        final Ref.ObjectRef r6 = new Ref.ObjectRef();
        XIi1i01O r0 = XIi1i01O.OXO1;
        LinearLayout r3 = getActivityDataLl();
        Intrinsics.O10IXXX0X(r3, "<get-activityDataLl>(...)");
        final Bitmap r4 = r0.XIi00iiXO(r3);
        r1.element += r4.getHeight();
        LinearLayout r7 = getRootViewHeartRate();
        Intrinsics.O10IXXX0X(r7, "<get-rootViewHeartRate>(...)");
        if (r7.getVisibility() != 0) goto L5;
        LinearLayout r9 = getRootViewHeartRate();
        Intrinsics.O10IXXX0X(r9, "<get-rootViewHeartRate>(...)");
        ?? r10 = r0.XIi00iiXO(r9);
        r5.element = r10;
        r1.element += r10.getHeight();
    L5:
        LinearLayout r11 = getRootViewSpeed();
        Intrinsics.O10IXXX0X(r11, "<get-rootViewSpeed>(...)");
        if (r11.getVisibility() != 0) goto L8;
        LinearLayout r13 = getRootViewSpeed();
        Intrinsics.O10IXXX0X(r13, "<get-rootViewSpeed>(...)");
        ?? r14 = r0.XIi00iiXO(r13);
        r6.element = r14;
        r1.element += r14.getHeight();
    L8:
        LinearLayout r15 = getRootViewAltitude();
        Intrinsics.O10IXXX0X(r15, "<get-rootViewAltitude>(...)");
        if (r15.getVisibility() != 0) goto L11;
        LinearLayout r16 = getRootViewAltitude();
        Intrinsics.O10IXXX0X(r16, "<get-rootViewAltitude>(...)");
        ?? r17 = r0.XIi00iiXO(r16);
        r8.element = r17;
        r1.element += r17.getHeight();
    L11:
        View r18 = getBottomView();
        Intrinsics.O10IXXX0X(r18, "<get-bottomView>(...)");
        final Bitmap r19 = r0.XIi00iiXO(r18);
        r1.element += r19.getHeight();
        final int r20 = SizeUtils.dp2px(8.0f);
        FrameLayout r2 = getMapViewFrameLayout();
        Intrinsics.O10IXXX0X(r2, "<get-mapViewFrameLayout>(...)");
        if (r2.getVisibility() == 0) goto L14;
        spliceBitmapAndShare$default(this, r20, r1.element, r4, (Bitmap) r5.element, (Bitmap) r6.element, r19, (Bitmap) r8.element, null, 128, null);
        return;
    L14:
        if (this.mBaiDuMapFragment == null) goto L18;
        BaiduMap.SnapshotReadyCallback r21 = new d35(r1, this, r20, r4, r5, r6, r19, r8);
        BaiDuMapSportRecordFragment r22 = this.mBaiDuMapFragment;
        Intrinsics.XXI(r22);
        r22.getBaiDuMap().snapshot(r21);
        return;
    L18:
        if (this.mGoogleMapFragment == null) goto L23;
        GoogleMap.SnapshotReadyCallback r23 = new e35(r1, this, r20, r4, r5, r6, r19, r8);
        GoogleMapSportRecordFragment r24 = this.mGoogleMapFragment;
        Intrinsics.XXI(r24);
        r24.getGoogleMap().snapshot(r23);
        return;
    }
}
