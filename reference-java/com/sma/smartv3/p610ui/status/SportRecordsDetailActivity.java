package com.sma.smartv3.p610ui.status;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b15;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.HRMinuteData;
import com.sma.smartv3.model.RecordActivityData;
import com.sma.smartv3.model.RecordDetailHeartRateData;
import com.sma.smartv3.model.RecordDetailSpeedData;
import com.sma.smartv3.model.RecordTimeList;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p610ui.status.SportRecordsDetailActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1093:1\n19#2:1094\n15#2:1095\n255#3:1096\n255#3:1097\n255#3:1098\n255#3:1099\n104#4,9:1100\n113#4,3:1110\n99#4,3:1113\n104#4,9:1116\n113#4,3:1126\n99#4,3:1129\n1#5:1109\n1#5:1125\n*S KotlinDebug\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n*L\n171#1:1094\n171#1:1095\n368#1:1096\n372#1:1097\n376#1:1098\n385#1:1099\n556#1:1100,9\n556#1:1110,3\n556#1:1113,3\n563#1:1116,9\n563#1:1126,3\n563#1:1129,3\n556#1:1109\n563#1:1125\n*E\n"})
public final class SportRecordsDetailActivity extends BaseActivity {

    @aa1
    private RecordActivityData activityData;
    private boolean isInChinaMainland;
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
    private LineDataSet setValue;
    private SportRecordData sportRecordData;
    private int threshold;
    private int thresholdMax;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.rootView_delegate$lambda$0(this.f9832IO);
        }
    });

    @aa1
    private final Lazy mapViewFrameLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.mapViewFrameLayout_delegate$lambda$0(this.f6556IO);
        }
    });

    @aa1
    private final Lazy mapPbRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.mapPbRl_delegate$lambda$0(this.f10731IO);
        }
    });

    @aa1
    private final Lazy nestedScrollView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.nestedScrollView_delegate$lambda$0(this.f6115IO);
        }
    });

    @aa1
    private final Lazy otherDataLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.otherDataLl_delegate$lambda$0(this.f10282IO);
        }
    });

    @aa1
    private final Lazy bottomView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.bottomView_delegate$lambda$0(this.f12091IO);
        }
    });

    @aa1
    private final Lazy downloadGpxIb$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.downloadGpxIb_delegate$lambda$0(this.f12292IO);
        }
    });

    @aa1
    private final Lazy sportTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportTime_delegate$lambda$0(this.f12506IO);
        }
    });

    @aa1
    private final Lazy sportName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportName_delegate$lambda$0(this.f5408IO);
        }
    });

    @aa1
    private final Lazy sportStartTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportStartTime_delegate$lambda$0(this.f5658IO);
        }
    });

    @aa1
    private final Lazy activityDataLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.activityDataLl_delegate$lambda$0(this.f12286IO);
        }
    });

    @aa1
    private final Lazy sportRecordPauseTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordPauseTime_delegate$lambda$0(this.f8866IO);
        }
    });

    @aa1
    private final Lazy sportRecordPauseTimeLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordPauseTimeLl_delegate$lambda$0(this.f11412IO);
        }
    });

    @aa1
    private final Lazy sportRecordStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordStep_delegate$lambda$0(this.f6565IO);
        }
    });

    @aa1
    private final Lazy sportRecordStepLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordStepLl_delegate$lambda$0(this.f6807IO);
        }
    });

    @aa1
    private final Lazy sportRecordCadence$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCadence_delegate$lambda$0(this.f7039IO);
        }
    });

    @aa1
    private final Lazy sportRecordCadenceLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCadenceLl_delegate$lambda$0(this.f7736IO);
        }
    });

    @aa1
    private final Lazy sportRecordDistance$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j35
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordDistance_delegate$lambda$0(this.f8871IO);
        }
    });

    @aa1
    private final Lazy sportRecordDistanceLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordDistanceLl_delegate$lambda$0(this.f6107IO);
        }
    });

    @aa1
    private final Lazy sportRecordCalories$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCalories_delegate$lambda$0(this.f6317IO);
        }
    });

    @aa1
    private final Lazy sportRecordCaloriesLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCaloriesLl_delegate$lambda$0(this.f6791IO);
        }
    });

    @aa1
    private final Lazy sportRecordDistanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordDistanceUnit_delegate$lambda$0(this.f7027IO);
        }
    });

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.ivAvatar_delegate$lambda$0(this.f7562IO);
        }
    });

    @aa1
    private final Lazy nickName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.nickName_delegate$lambda$0(this.f8860IO);
        }
    });

    @aa1
    private final Lazy rootViewHeartRate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.k15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.rootViewHeartRate_delegate$lambda$0(this.f9089IO);
        }
    });

    @aa1
    private final Lazy sportRecordMaxHR$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordMaxHR_delegate$lambda$0(this.f9331IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgHR$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgHR_delegate$lambda$0(this.f9597IO);
        }
    });

    @aa1
    private final Lazy sportRecordStrenuous$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordStrenuous_delegate$lambda$0(this.f10055IO);
        }
    });

    @aa1
    private final Lazy sportRecordAnaerobic$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAnaerobic_delegate$lambda$0(this.f10272IO);
        }
    });

    @aa1
    private final Lazy sportRecordAerobic$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAerobic_delegate$lambda$0(this.f10491IO);
        }
    });

    @aa1
    private final Lazy sportRecordFatBurning$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFatBurning_delegate$lambda$0(this.f10954IO);
        }
    });

    @aa1
    private final Lazy sportRecordWarmUp$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordWarmUp_delegate$lambda$0(this.f11178IO);
        }
    });

    @aa1
    private final Lazy rootViewSpeed$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.rootViewSpeed_delegate$lambda$0(this.f11408IO);
        }
    });

    @aa1
    private final Lazy speedPf$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.speedPf_delegate$lambda$0(this.f11632IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgSpeed$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgSpeed_delegate$lambda$0(this.f11862IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgSpeedRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgSpeedRl_delegate$lambda$0(this.f12088IO);
        }
    });

    @aa1
    private final Lazy sportRecordFastestSpeedRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z15
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFastestSpeedRl_delegate$lambda$0(this.f12500IO);
        }
    });

    @aa1
    private final Lazy sportRecordFastestSpeed$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFastestSpeed_delegate$lambda$0(this.f5402IO);
        }
    });

    @aa1
    private final Lazy pacePF$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.pacePF_delegate$lambda$0(this.f5652IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgPaceRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgPaceRl_delegate$lambda$0(this.f5890IO);
        }
    });

    @aa1
    private final Lazy sportRecordFastestPaceRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFastestPaceRl_delegate$lambda$0(this.f6323IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgPace$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgPace_delegate$lambda$0(this.f6561IO);
        }
    });

    @aa1
    private final Lazy sportRecordFastestPace$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFastestPace_delegate$lambda$0(this.f6796IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgSpeedUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgSpeedUnit_delegate$lambda$0(this.f7035IO);
        }
    });

    @aa1
    private final Lazy sportRecordFastestSpeedUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFastestSpeedUnit_delegate$lambda$0(this.f7732IO);
        }
    });

    @aa1
    private final Lazy sportRecordAvgPaceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.k25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAvgPaceUnit_delegate$lambda$0(this.f9095IO);
        }
    });

    @aa1
    private final Lazy sportRecordFastestPaceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordFastestPaceUnit_delegate$lambda$0(this.f9339IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.rv_delegate$lambda$0(this.f9601IO);
        }
    });

    @aa1
    private final Lazy sportRecordPaceChartRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordPaceChartRl_delegate$lambda$0(this.f9835IO);
        }
    });

    @aa1
    private final Lazy rootViewAltitude$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.rootViewAltitude_delegate$lambda$0(this.f10059IO);
        }
    });

    @aa1
    private final Lazy sportRecordAltitude$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAltitude_delegate$lambda$0(this.f10498IO);
        }
    });

    @aa1
    private final Lazy sportRecordCR$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCR_delegate$lambda$0(this.f10736IO);
        }
    });

    @aa1
    private final Lazy sportRecordCD$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCD_delegate$lambda$0(this.f10957IO);
        }
    });

    @aa1
    private final Lazy sportRecordAltitudeUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordAltitudeUnit_delegate$lambda$0(this.f11181IO);
        }
    });

    @aa1
    private final Lazy sportRecordCRUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCRUnit_delegate$lambda$0(this.f11637IO);
        }
    });

    @aa1
    private final Lazy sportRecordCDUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w25
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsDetailActivity.sportRecordCDUnit_delegate$lambda$0(this.f11866IO);
        }
    });

    public SportRecordsDetailActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.activityData = new RecordActivityData();
        MyDb myDb = MyDb.INSTANCE;
        this.mLocationDao = myDb.getMDatabase().locationDao();
        this.mHeartRateDao = myDb.getMDatabase().heartRateDao();
        this.threshold = 5;
        this.thresholdMax = 11;
        this.locationSmoothAlgorithm = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout activityDataLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (LinearLayout) sportRecordsDetailActivity.findViewById(R.id.activityDataLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bottomView_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return sportRecordsDetailActivity.findViewById(R.id.bottomView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean delete$lambda$0$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        SportRecordData sportRecordData = sportRecordsDetailActivity.sportRecordData;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        SportRecordDataKt.deleteSportRecord(sportRecordData);
        sportRecordsDetailActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View downloadGpxIb_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return sportRecordsDetailActivity.findViewById(R.id.downloadGpxIb);
    }

    private final LinearLayout getActivityDataLl() {
        return (LinearLayout) this.activityDataLl$delegate.getValue();
    }

    private final View getBottomView() {
        return (View) this.bottomView$delegate.getValue();
    }

    private final View getDownloadGpxIb() {
        return (View) this.downloadGpxIb$delegate.getValue();
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) this.ivAvatar$delegate.getValue();
    }

    private final RelativeLayout getMapPbRl() {
        return (RelativeLayout) this.mapPbRl$delegate.getValue();
    }

    private final FrameLayout getMapViewFrameLayout() {
        return (FrameLayout) this.mapViewFrameLayout$delegate.getValue();
    }

    private final NestedScrollView getNestedScrollView() {
        return (NestedScrollView) this.nestedScrollView$delegate.getValue();
    }

    private final PFMedium getNickName() {
        return (PFMedium) this.nickName$delegate.getValue();
    }

    private final LinearLayout getOtherDataLl() {
        return (LinearLayout) this.otherDataLl$delegate.getValue();
    }

    private final PFRegular getPacePF() {
        return (PFRegular) this.pacePF$delegate.getValue();
    }

    private final int getPaceUnit() {
        return this.userProfile.getUnit() == 0 ? R.string.pace_km : R.string.pace_mi;
    }

    private final RelativeLayout getRootView() {
        return (RelativeLayout) this.rootView$delegate.getValue();
    }

    private final LinearLayout getRootViewAltitude() {
        return (LinearLayout) this.rootViewAltitude$delegate.getValue();
    }

    private final LinearLayout getRootViewHeartRate() {
        return (LinearLayout) this.rootViewHeartRate$delegate.getValue();
    }

    private final LinearLayout getRootViewSpeed() {
        return (LinearLayout) this.rootViewSpeed$delegate.getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    private final PFRegular getSpeedPf() {
        return (PFRegular) this.speedPf$delegate.getValue();
    }

    private final int getSpeedUnit() {
        return this.userProfile.getUnit() == 0 ? R.string.km_h : R.string.mi_h;
    }

    private final PFMedium getSportName() {
        return (PFMedium) this.sportName$delegate.getValue();
    }

    private final DINCondBold getSportRecordAerobic() {
        return (DINCondBold) this.sportRecordAerobic$delegate.getValue();
    }

    private final DINCondBold getSportRecordAltitude() {
        return (DINCondBold) this.sportRecordAltitude$delegate.getValue();
    }

    private final PFMedium getSportRecordAltitudeUnit() {
        return (PFMedium) this.sportRecordAltitudeUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordAnaerobic() {
        return (DINCondBold) this.sportRecordAnaerobic$delegate.getValue();
    }

    private final DINCondBold getSportRecordAvgHR() {
        return (DINCondBold) this.sportRecordAvgHR$delegate.getValue();
    }

    private final DINCondBold getSportRecordAvgPace() {
        return (DINCondBold) this.sportRecordAvgPace$delegate.getValue();
    }

    private final RelativeLayout getSportRecordAvgPaceRl() {
        return (RelativeLayout) this.sportRecordAvgPaceRl$delegate.getValue();
    }

    private final PFMedium getSportRecordAvgPaceUnit() {
        return (PFMedium) this.sportRecordAvgPaceUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordAvgSpeed() {
        return (DINCondBold) this.sportRecordAvgSpeed$delegate.getValue();
    }

    private final RelativeLayout getSportRecordAvgSpeedRl() {
        return (RelativeLayout) this.sportRecordAvgSpeedRl$delegate.getValue();
    }

    private final PFMedium getSportRecordAvgSpeedUnit() {
        return (PFMedium) this.sportRecordAvgSpeedUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordCD() {
        return (DINCondBold) this.sportRecordCD$delegate.getValue();
    }

    private final PFMedium getSportRecordCDUnit() {
        return (PFMedium) this.sportRecordCDUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordCR() {
        return (DINCondBold) this.sportRecordCR$delegate.getValue();
    }

    private final PFMedium getSportRecordCRUnit() {
        return (PFMedium) this.sportRecordCRUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordCadence() {
        return (DINCondBold) this.sportRecordCadence$delegate.getValue();
    }

    private final RelativeLayout getSportRecordCadenceLl() {
        return (RelativeLayout) this.sportRecordCadenceLl$delegate.getValue();
    }

    private final DINCondBold getSportRecordCalories() {
        return (DINCondBold) this.sportRecordCalories$delegate.getValue();
    }

    private final RelativeLayout getSportRecordCaloriesLl() {
        return (RelativeLayout) this.sportRecordCaloriesLl$delegate.getValue();
    }

    private final DINCondBold getSportRecordDistance() {
        return (DINCondBold) this.sportRecordDistance$delegate.getValue();
    }

    private final RelativeLayout getSportRecordDistanceLl() {
        return (RelativeLayout) this.sportRecordDistanceLl$delegate.getValue();
    }

    private final PFMedium getSportRecordDistanceUnit() {
        return (PFMedium) this.sportRecordDistanceUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordFastestPace() {
        return (DINCondBold) this.sportRecordFastestPace$delegate.getValue();
    }

    private final RelativeLayout getSportRecordFastestPaceRl() {
        return (RelativeLayout) this.sportRecordFastestPaceRl$delegate.getValue();
    }

    private final PFMedium getSportRecordFastestPaceUnit() {
        return (PFMedium) this.sportRecordFastestPaceUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordFastestSpeed() {
        return (DINCondBold) this.sportRecordFastestSpeed$delegate.getValue();
    }

    private final RelativeLayout getSportRecordFastestSpeedRl() {
        return (RelativeLayout) this.sportRecordFastestSpeedRl$delegate.getValue();
    }

    private final PFMedium getSportRecordFastestSpeedUnit() {
        return (PFMedium) this.sportRecordFastestSpeedUnit$delegate.getValue();
    }

    private final DINCondBold getSportRecordFatBurning() {
        return (DINCondBold) this.sportRecordFatBurning$delegate.getValue();
    }

    private final DINCondBold getSportRecordMaxHR() {
        return (DINCondBold) this.sportRecordMaxHR$delegate.getValue();
    }

    private final LinearLayout getSportRecordPaceChartRl() {
        return (LinearLayout) this.sportRecordPaceChartRl$delegate.getValue();
    }

    private final DINCondBold getSportRecordPauseTime() {
        return (DINCondBold) this.sportRecordPauseTime$delegate.getValue();
    }

    private final RelativeLayout getSportRecordPauseTimeLl() {
        return (RelativeLayout) this.sportRecordPauseTimeLl$delegate.getValue();
    }

    private final DINCondBold getSportRecordStep() {
        return (DINCondBold) this.sportRecordStep$delegate.getValue();
    }

    private final RelativeLayout getSportRecordStepLl() {
        return (RelativeLayout) this.sportRecordStepLl$delegate.getValue();
    }

    private final DINCondBold getSportRecordStrenuous() {
        return (DINCondBold) this.sportRecordStrenuous$delegate.getValue();
    }

    private final DINCondBold getSportRecordWarmUp() {
        return (DINCondBold) this.sportRecordWarmUp$delegate.getValue();
    }

    private final DINCondBold getSportStartTime() {
        return (DINCondBold) this.sportStartTime$delegate.getValue();
    }

    private final DINCondBold getSportTime() {
        return (DINCondBold) this.sportTime$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatar_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (ImageViewRound) sportRecordsDetailActivity.findViewById(R.id.ivAvatar);
    }

    private final void localFindLocation(ArrayList<CustomLatLng> arrayList) {
        boolean z;
        LocationDao locationDao = this.mLocationDao;
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        long mStartTime = sportRecordData.getMStartTime();
        SportRecordData sportRecordData3 = this.sportRecordData;
        if (sportRecordData3 == null) {
            Intrinsics.XXO("sportRecordData");
        } else {
            sportRecordData2 = sportRecordData3;
        }
        List<Location> location = locationDao.getLocation(mStartTime, sportRecordData2.getMEndTime());
        if (!location.isEmpty() && location.size() >= 2) {
            Iterator<Location> it = location.iterator();
            while (true) {
                z = true;
                if (it.hasNext()) {
                    if (it.next().getMSource() == 1) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.isInChinaMainland && z) {
                CoordinateConverter coordinateConverterFrom = new CoordinateConverter().from(CoordinateConverter.CoordType.GPS);
                for (Location location2 : location) {
                    LatLng latLngConvert = coordinateConverterFrom.coord(new LatLng(location2.getMLatitude(), location2.getMLongitude())).convert();
                    arrayList.add(new CustomLatLng(latLngConvert.latitude, latLngConvert.longitude, location2.getMTime(), location2.getMAltitude(), 0, 16, null));
                }
            } else {
                for (Location location3 : location) {
                    arrayList.add(new CustomLatLng(location3.getMLatitude(), location3.getMLongitude(), location3.getMTime(), location3.getMAltitude(), 0, 16, null));
                }
            }
        }
        this.locationSmoothAlgorithm.addAll(locationSmoothAlgorithm(arrayList));
        showMapContent(this.locationSmoothAlgorithm);
    }

    private final ArrayList<CustomLatLng> locationSmoothAlgorithm(ArrayList<CustomLatLng> arrayList) {
        int i;
        int i2;
        boolean z;
        ArrayList<CustomLatLng> arrayList2 = arrayList;
        ArrayList<CustomLatLng> arrayList3 = new ArrayList<>();
        boolean z2 = false;
        CustomLatLng customLatLng = new CustomLatLng(arrayList2.get(0).getLatitude(), arrayList2.get(0).getLongitude(), arrayList2.get(0).getTime(), arrayList2.get(0).getAltitude(), 0, 16, null);
        CustomLatLng customLatLng2 = new CustomLatLng(0.0d, 0.0d, 0L, 0, 0, 16, null);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            CustomLatLng customLatLng3 = arrayList2.get(i3);
            Intrinsics.O10IXXX0X(customLatLng3, "get(...)");
            CustomLatLng customLatLng4 = customLatLng3;
            if (customLatLng4.getLatitude() == customLatLng2.getLatitude() && customLatLng4.getLongitude() == customLatLng2.getLongitude()) {
                customLatLng4.setLongitude(customLatLng.getLongitude());
                customLatLng4.setLatitude(customLatLng.getLatitude());
                i2 = size;
                i = i3;
                z = z2;
            } else {
                float fIIi1 = mc0.iIi1(DistanceUtil.getDistance(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()), new LatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude())) * ((double) 100)) / 100.0f;
                float fAbs = fIIi1 / (Math.abs(customLatLng4.getTime() - customLatLng.getTime()) / ((long) 1000));
                int i4 = this.threshold;
                int i5 = this.thresholdMax;
                double latitude = customLatLng4.getLatitude();
                CustomLatLng customLatLng5 = customLatLng2;
                double longitude = customLatLng4.getLongitude();
                double latitude2 = customLatLng.getLatitude();
                int i6 = size;
                i = i3;
                double longitude2 = customLatLng.getLongitude();
                StringBuilder sb = new StringBuilder();
                i2 = i6;
                sb.append("secondSpeed = ");
                sb.append(fAbs);
                sb.append(" ");
                sb.append(i4);
                sb.append("，");
                sb.append(i5);
                sb.append("，");
                sb.append(fIIi1);
                sb.append(" ---> ");
                sb.append(latitude);
                sb.append(I000IiI1O.C2156iO.XO0O10);
                sb.append(longitude);
                sb.append(" --- ");
                sb.append(latitude2);
                sb.append(I000IiI1O.C2156iO.XO0O10);
                sb.append(longitude2);
                LogUtils.m11128d(sb.toString());
                if (fAbs >= this.threshold) {
                    LogUtils.m11128d("secondSpeed process");
                    int i7 = this.thresholdMax;
                    if (fAbs >= i7) {
                        LogUtils.m11128d("give up " + fAbs + " " + i7 + " longitude=" + customLatLng4.getLongitude() + ",latitude=" + customLatLng4.getLatitude() + ",time=" + customLatLng4.getTime());
                        customLatLng4.setLongitude(customLatLng.getLongitude());
                        customLatLng4.setLatitude(customLatLng.getLatitude());
                        customLatLng2 = customLatLng5;
                    } else {
                        customLatLng2 = customLatLng5;
                        customLatLng2.setLatitude(customLatLng4.getLatitude());
                        customLatLng2.setLongitude(customLatLng4.getLongitude());
                        customLatLng2.setTime(customLatLng4.getTime());
                        customLatLng2.setAltitude(customLatLng4.getAltitude());
                        double d = 2;
                        customLatLng4.setLongitude((customLatLng.getLongitude() + customLatLng4.getLongitude()) / d);
                        customLatLng4.setLatitude((customLatLng.getLatitude() + customLatLng4.getLatitude()) / d);
                    }
                    z = false;
                } else {
                    customLatLng2 = customLatLng5;
                    LogUtils.m11128d("secondSpeed No process");
                    customLatLng2.setLatitude(0.0d);
                    customLatLng2.setLongitude(0.0d);
                    customLatLng2.setTime(0L);
                    z = false;
                    customLatLng2.setAltitude(0);
                }
            }
            customLatLng.setLatitude(customLatLng4.getLatitude());
            customLatLng.setLongitude(customLatLng4.getLongitude());
            customLatLng.setTime(customLatLng4.getTime());
            customLatLng.setAltitude(customLatLng4.getAltitude());
            arrayList3.add(new CustomLatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude(), customLatLng4.getTime(), customLatLng4.getAltitude(), 0, 16, null));
            i3 = i + 1;
            arrayList2 = arrayList;
            z2 = z;
            size = i2;
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mapPbRl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.mapPbRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout mapViewFrameLayout_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (FrameLayout) sportRecordsDetailActivity.findViewById(R.id.mapViewFrameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView nestedScrollView_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (NestedScrollView) sportRecordsDetailActivity.findViewById(R.id.nestedScrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium nickName_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.nickName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout otherDataLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (LinearLayout) sportRecordsDetailActivity.findViewById(R.id.otherDataLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFRegular pacePF_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFRegular) sportRecordsDetailActivity.findViewById(R.id.pacePF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootViewAltitude_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (LinearLayout) sportRecordsDetailActivity.findViewById(R.id.rootViewAltitude);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootViewHeartRate_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (LinearLayout) sportRecordsDetailActivity.findViewById(R.id.rootViewHeartRate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootViewSpeed_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (LinearLayout) sportRecordsDetailActivity.findViewById(R.id.rootViewSpeed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout rootView_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RecyclerView) sportRecordsDetailActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void share$lambda$0(Ref.IntRef intRef, SportRecordsDetailActivity sportRecordsDetailActivity, int i, Bitmap bitmap, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Bitmap bitmap2, Ref.ObjectRef objectRef3, Bitmap bitmap3) {
        int height = intRef.element + bitmap3.getHeight();
        intRef.element = height;
        sportRecordsDetailActivity.spliceBitmapAndShare(i, height, bitmap, (Bitmap) objectRef.element, (Bitmap) objectRef2.element, bitmap2, (Bitmap) objectRef3.element, bitmap3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void share$lambda$1(Ref.IntRef intRef, SportRecordsDetailActivity sportRecordsDetailActivity, int i, Bitmap bitmap, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Bitmap bitmap2, Ref.ObjectRef objectRef3, Bitmap bitmap3) {
        int height = intRef.element + (bitmap3 != null ? bitmap3.getHeight() : 0);
        intRef.element = height;
        sportRecordsDetailActivity.spliceBitmapAndShare(i, height, bitmap, (Bitmap) objectRef.element, (Bitmap) objectRef2.element, bitmap2, (Bitmap) objectRef3.element, bitmap3);
    }

    private final void showActivityData() {
        RecordActivityData recordActivityDataSportRecordWorkout;
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        if (sportRecordData.getMSource() == 0) {
            SportRecordData sportRecordData3 = this.sportRecordData;
            if (sportRecordData3 == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData3 = null;
            }
            long mStartTime = sportRecordData3.getMStartTime();
            SportRecordData sportRecordData4 = this.sportRecordData;
            if (sportRecordData4 == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData4 = null;
            }
            recordActivityDataSportRecordWorkout = SportRecordDataKt.sportRecordActivity(mStartTime, sportRecordData4.getMEndTime(), this.userProfile.getUnit());
        } else {
            SportRecordData sportRecordData5 = this.sportRecordData;
            if (sportRecordData5 == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData5 = null;
            }
            long mStartTime2 = sportRecordData5.getMStartTime();
            SportRecordData sportRecordData6 = this.sportRecordData;
            if (sportRecordData6 == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData6 = null;
            }
            recordActivityDataSportRecordWorkout = SportRecordDataKt.sportRecordWorkout(mStartTime2, sportRecordData6.getMEndTime(), this.userProfile.getUnit());
        }
        this.activityData = recordActivityDataSportRecordWorkout;
        getSportTime().setText(this.activityData.getMSportTimeStr());
        PFMedium sportName = getSportName();
        Activity mContext = getMContext();
        SportRecordData sportRecordData7 = this.sportRecordData;
        if (sportRecordData7 == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData7 = null;
        }
        sportName.setText(SportRecordDataKt.getWorkoutName(mContext, sportRecordData7));
        DINCondBold sportStartTime = getSportStartTime();
        SportRecordData sportRecordData8 = this.sportRecordData;
        if (sportRecordData8 == null) {
            Intrinsics.XXO("sportRecordData");
        } else {
            sportRecordData2 = sportRecordData8;
        }
        sportStartTime.setText(SportRecordDataKt.getSportStartTime(sportRecordData2));
        if (Intrinsics.XOO0ii0(this.activityData.getMPauseTimeTotal(), "00:00:00")) {
            getSportRecordPauseTimeLl().setVisibility(8);
        } else {
            getSportRecordPauseTime().setText(this.activityData.getMPauseTimeTotal());
        }
        if (this.activityData.getMStepTotal() <= 0) {
            getSportRecordStep().setText("0");
        } else {
            getSportRecordStep().setText(String.valueOf(this.activityData.getMStepTotal()));
        }
        if (this.activityData.getMDistanceTotal() <= 0.0d) {
            getSportRecordDistance().setText("0.0");
        } else {
            getSportRecordDistance().setText(String.valueOf(this.activityData.getMDistanceTotal()));
        }
        getSportRecordDistanceUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        if (this.activityData.getMCalorieTotal() <= 0) {
            getSportRecordCalories().setText("0");
        } else {
            getSportRecordCalories().setText(String.valueOf(this.activityData.getMCalorieTotal()));
        }
        if (this.activityData.getMSpm() <= 0) {
            getSportRecordCadence().setText("0");
        } else {
            getSportRecordCadence().setText(String.valueOf(this.activityData.getMSpm()));
        }
        getNickName().setText(this.userProfile.getNickname());
        File fileOIi0 = uz0.OIi0(sz0.OXO1);
        if (fileOIi0.exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(fileOIi0));
        } else {
            getIvAvatar().setVisibility(4);
        }
    }

    private final void showAltitudeData() {
        LocationDao locationDao = this.mLocationDao;
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        long mStartTime = sportRecordData.getMStartTime();
        SportRecordData sportRecordData3 = this.sportRecordData;
        if (sportRecordData3 == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData3 = null;
        }
        List<Location> location = locationDao.getLocation(mStartTime, sportRecordData3.getMEndTime());
        if (location.isEmpty() || location.size() < 2) {
            getRootViewAltitude().setVisibility(8);
        } else {
            LinearLayout rootViewAltitude = getRootViewAltitude();
            SportRecordData sportRecordData4 = this.sportRecordData;
            if (sportRecordData4 == null) {
                Intrinsics.XXO("sportRecordData");
            } else {
                sportRecordData2 = sportRecordData4;
            }
            int mMode = sportRecordData2.getMMode();
            rootViewAltitude.setVisibility((mMode == 10 || mMode == 13 || mMode == 19) ? 0 : 8);
        }
        int size = location.size();
        int mAltitude = 0;
        int mAltitude2 = 0;
        int mAltitude3 = 0;
        int mAltitude4 = 0;
        for (int i = 0; i < size; i++) {
            Location location2 = location.get(i);
            if (i == 0) {
                mAltitude = location2.getMAltitude();
            } else {
                if (mAltitude < location2.getMAltitude()) {
                    mAltitude = location2.getMAltitude();
                }
                if (mAltitude4 < location2.getMAltitude()) {
                    mAltitude2 += location2.getMAltitude() - mAltitude4;
                } else if (mAltitude4 > location2.getMAltitude()) {
                    mAltitude3 += mAltitude4 - location2.getMAltitude();
                }
            }
            mAltitude4 = location2.getMAltitude();
        }
        DINCondBold sportRecordAltitude = getSportRecordAltitude();
        if (this.activityData.getMAltitude() > 0) {
            mAltitude = this.activityData.getMAltitude();
        }
        sportRecordAltitude.setText(cp5.iIXi1iiXI(mAltitude, this.userProfile.getUnit()));
        getSportRecordCR().setText(cp5.iIXi1iiXI(mAltitude2, this.userProfile.getUnit()));
        getSportRecordCD().setText(cp5.iIXi1iiXI(mAltitude3, this.userProfile.getUnit()));
        int i2 = this.userProfile.getUnit() == 0 ? R.string.f54360m : R.string.f54374yd;
        getSportRecordAltitudeUnit().setText(i2);
        getSportRecordCRUnit().setText(i2);
        getSportRecordCDUnit().setText(i2);
    }

    private final void showBaiDuMap(ArrayList<CustomLatLng> arrayList) {
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", arrayList);
        BaseFragment baseFragment = (BaseFragment) BaiDuMapSportRecordFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.BaiDuMapSportRecordFragment");
        }
        BaiDuMapSportRecordFragment baiDuMapSportRecordFragment = (BaiDuMapSportRecordFragment) baseFragment;
        this.mBaiDuMapFragment = baiDuMapSportRecordFragment;
        Intrinsics.XXI(baiDuMapSportRecordFragment);
        NestedScrollView nestedScrollView = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView, "<get-nestedScrollView>(...)");
        baiDuMapSportRecordFragment.setOnMapTouchListener(nestedScrollView);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        BaiDuMapSportRecordFragment baiDuMapSportRecordFragment2 = this.mBaiDuMapFragment;
        Intrinsics.XXI(baiDuMapSportRecordFragment2);
        fragmentTransactionBeginTransaction.add(R.id.mapViewFrameLayout, baiDuMapSportRecordFragment2).commit();
    }

    private final void showGoogleMap(ArrayList<CustomLatLng> arrayList) {
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", arrayList);
        BaseFragment baseFragment = (BaseFragment) GoogleMapSportRecordFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.GoogleMapSportRecordFragment");
        }
        GoogleMapSportRecordFragment googleMapSportRecordFragment = (GoogleMapSportRecordFragment) baseFragment;
        this.mGoogleMapFragment = googleMapSportRecordFragment;
        Intrinsics.XXI(googleMapSportRecordFragment);
        NestedScrollView nestedScrollView = getNestedScrollView();
        Intrinsics.O10IXXX0X(nestedScrollView, "<get-nestedScrollView>(...)");
        googleMapSportRecordFragment.setOnMapTouchListener(nestedScrollView);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        GoogleMapSportRecordFragment googleMapSportRecordFragment2 = this.mGoogleMapFragment;
        Intrinsics.XXI(googleMapSportRecordFragment2);
        fragmentTransactionBeginTransaction.add(R.id.mapViewFrameLayout, googleMapSportRecordFragment2).commit();
    }

    private final void showHeartRateData() {
        RecordDetailHeartRateData recordDetailHeartRateDataSportRecordHeartRateDetail = SportRecordDataKt.sportRecordHeartRateDetail(this.mHeartRateDao, this.activityData.getMTimeList());
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        long mEndTime = sportRecordData.getMEndTime();
        SportRecordData sportRecordData3 = this.sportRecordData;
        if (sportRecordData3 == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData3 = null;
        }
        long j = 1000;
        long j2 = 60;
        long mStartTime = (((mEndTime - sportRecordData3.getMStartTime()) / j) / j2) + 1;
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = this.lineChart;
        if (lineChart == null) {
            Intrinsics.XXO("lineChart");
            lineChart = null;
        }
        io1xi1x1i.XIi00iiXO(lineChart);
        LineChart lineChart2 = this.lineChart;
        if (lineChart2 == null) {
            Intrinsics.XXO("lineChart");
            lineChart2 = null;
        }
        YAxis axisLeft = lineChart2.getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
            lineChart3 = null;
        }
        YAxis axisRight = lineChart3.getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, recordDetailHeartRateDataSportRecordHeartRateDetail.getMMaxHR() + 5.0f, recordDetailHeartRateDataSportRecordHeartRateDetail.getMMinHR() - 5.0f);
        LineChart lineChart4 = this.lineChart;
        if (lineChart4 == null) {
            Intrinsics.XXO("lineChart");
            lineChart4 = null;
        }
        lineChart4.setTouchEnabled(false);
        lineChart4.getDescription().XOO0ii0(false);
        lineChart4.getLegend().XOO0ii0(false);
        LineChart lineChart5 = this.lineChart;
        if (lineChart5 == null) {
            Intrinsics.XXO("lineChart");
            lineChart5 = null;
        }
        XAxis xAxis = lineChart5.getXAxis();
        Intrinsics.XXI(xAxis);
        LineChart lineChart6 = this.lineChart;
        if (lineChart6 == null) {
            Intrinsics.XXO("lineChart");
            lineChart6 = null;
        }
        Context context = lineChart6.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.i0X000X0O(0.0f);
        xAxis.IXOIIIO(1.0f);
        xAxis.iOiXi11II(mStartTime);
        SimpleDateFormat simpleDateFormatIXI = O0X11OiO.IXI(false, 1, null);
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        if (0 <= mStartTime) {
            while (true) {
                SportRecordData sportRecordData4 = this.sportRecordData;
                if (sportRecordData4 == null) {
                    Intrinsics.XXO("sportRecordData");
                    sportRecordData4 = sportRecordData2;
                }
                long j4 = mStartTime;
                String strMillis2String = TimeUtils.millis2String(sportRecordData4.getMStartTime() + (j3 * j2 * j), simpleDateFormatIXI);
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                arrayList.add(strMillis2String);
                if (j3 == j4) {
                    break;
                }
                j3++;
                mStartTime = j4;
                sportRecordData2 = null;
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        getSportRecordAvgHR().setText(String.valueOf(this.activityData.getMAvgBpm() > 0 ? this.activityData.getMAvgBpm() : recordDetailHeartRateDataSportRecordHeartRateDetail.getMAvgHR()));
        getSportRecordMaxHR().setText(String.valueOf(this.activityData.getMMaxBpm() > 0 ? this.activityData.getMMaxBpm() : recordDetailHeartRateDataSportRecordHeartRateDetail.getMMaxHR()));
        showHeartRateFilterData(recordDetailHeartRateDataSportRecordHeartRateDetail.getMHeartRateList());
        getSportRecordStrenuous().setText(String.valueOf(recordDetailHeartRateDataSportRecordHeartRateDetail.getMStrenuous()));
        getSportRecordAnaerobic().setText(String.valueOf(recordDetailHeartRateDataSportRecordHeartRateDetail.getMAnaerobic()));
        getSportRecordAerobic().setText(String.valueOf(recordDetailHeartRateDataSportRecordHeartRateDetail.getMAerobic()));
        getSportRecordFatBurning().setText(String.valueOf(recordDetailHeartRateDataSportRecordHeartRateDetail.getMFatBurning()));
        getSportRecordWarmUp().setText(String.valueOf(recordDetailHeartRateDataSportRecordHeartRateDetail.getMWarmUp()));
    }

    private final void showHeartRateFilterData(List<HeartRate> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        long mStartTime = sportRecordData.getMStartTime();
        SportRecordData sportRecordData3 = this.sportRecordData;
        if (sportRecordData3 == null) {
            Intrinsics.XXO("sportRecordData");
        } else {
            sportRecordData2 = sportRecordData3;
        }
        long jXO0O10 = ProgressionUtilKt.XO0O10(mStartTime, sportRecordData2.getMEndTime(), 60000L);
        int i = 0;
        if (mStartTime <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(mStartTime), new HRMinuteData(0, 0));
                if (mStartTime == jXO0O10) {
                    break;
                } else {
                    mStartTime += 60000;
                }
            }
        }
        for (HeartRate heartRate : list) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                HRMinuteData hRMinuteData = (HRMinuteData) entry.getValue();
                if (heartRate.getMTime() <= jLongValue) {
                    hRMinuteData.setTotal(hRMinuteData.getTotal() + heartRate.getMBpm());
                    hRMinuteData.setNum(hRMinuteData.getNum() + 1);
                    break;
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        float f = 0.0f;
        int i2 = 0;
        while (it.hasNext()) {
            HRMinuteData hRMinuteData2 = (HRMinuteData) ((Map.Entry) it.next()).getValue();
            if (hRMinuteData2.getNum() != 0 && hRMinuteData2.getTotal() != 0) {
                int total = hRMinuteData2.getTotal() / hRMinuteData2.getNum();
                arrayList.add(new Entry(f, total));
                if (i < total) {
                    i = total;
                }
                if (i2 == 0) {
                    i2 = total;
                }
                if (1 <= total && total < i2) {
                    i2 = total;
                }
            }
            f += 1.0f;
        }
        showHeartRateUpdateChartData(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void showHeartRateUpdateChartData(List<Entry> list) {
        LineDataSet lineDataSet;
        LineDataSet lineDataSet2;
        LineDataSet lineDataSet3;
        LineDataSet lineDataSet4;
        LineDataSet lineDataSet5;
        LineDataSet lineDataSet6;
        LineDataSet lineDataSet7;
        LineDataSet lineDataSet8;
        LineChart lineChart;
        LineChart lineChart2 = this.lineChart;
        LineChart lineChart3 = null;
        if (lineChart2 == null) {
            Intrinsics.XXO("lineChart");
            lineChart2 = null;
        }
        if (lineChart2.getData() == 0) {
            LineDataSet lineDataSet9 = new LineDataSet(list, "");
            this.setValue = lineDataSet9;
            lineDataSet9.II1(ContextCompat.getColor(getMContext(), R.color.hr_color));
            lineDataSet = this.setValue;
            if (lineDataSet == null) {
                Intrinsics.XXO("setValue");
                lineDataSet = null;
            }
            lineDataSet.I00(ContextCompat.getColor(getMContext(), R.color.hr_color));
            lineDataSet2 = this.setValue;
            if (lineDataSet2 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet2 = null;
            }
            lineDataSet2.I1XII0X(2.0f);
            lineDataSet3 = this.setValue;
            if (lineDataSet3 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet3 = null;
            }
            lineDataSet3.iXOII(1.0f);
            lineDataSet4 = this.setValue;
            if (lineDataSet4 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet4 = null;
            }
            lineDataSet4.IOI0i0I(false);
            lineDataSet5 = this.setValue;
            if (lineDataSet5 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet5 = null;
            }
            lineDataSet5.XXI(false);
            lineDataSet6 = this.setValue;
            if (lineDataSet6 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet6 = null;
            }
            lineDataSet6.O1iXiI(true);
            Drawable drawable = ContextCompat.getDrawable(getMContext(), R.drawable.shape_hr);
            Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            lineDataSet7 = this.setValue;
            if (lineDataSet7 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet7 = null;
            }
            lineDataSet7.I0i1OXiI(drawable);
            lineDataSet8 = this.setValue;
            if (lineDataSet8 == null) {
                Intrinsics.XXO("setValue");
                lineDataSet8 = null;
            }
            C2305co c2305co = new C2305co(lineDataSet8);
            c2305co.m1316iI(false);
            lineChart = this.lineChart;
            if (lineChart == null) {
                Intrinsics.XXO("lineChart");
                lineChart = null;
            }
            lineChart.setData(c2305co);
        } else {
            LineChart lineChart4 = this.lineChart;
            if (lineChart4 == null) {
                Intrinsics.XXO("lineChart");
                lineChart4 = null;
            }
            if (((C2305co) lineChart4.getData()).XXI() > 0) {
                LineChart lineChart5 = this.lineChart;
                if (lineChart5 == null) {
                    Intrinsics.XXO("lineChart");
                    lineChart5 = null;
                }
                T tOIX0iXi = ((C2305co) lineChart5.getData()).OIX0iXi(0);
                Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
                LineDataSet lineDataSet10 = (LineDataSet) tOIX0iXi;
                this.setValue = lineDataSet10;
                if (lineDataSet10 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet10 = null;
                }
                lineDataSet10.IOX1(list);
                LineDataSet lineDataSet11 = this.setValue;
                if (lineDataSet11 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet11 = null;
                }
                lineDataSet11.i0X1iIO();
                LineChart lineChart6 = this.lineChart;
                if (lineChart6 == null) {
                    Intrinsics.XXO("lineChart");
                    lineChart6 = null;
                }
                ((C2305co) lineChart6.getData()).mo1167iX();
                LineChart lineChart7 = this.lineChart;
                if (lineChart7 == null) {
                    Intrinsics.XXO("lineChart");
                    lineChart7 = null;
                }
                lineChart7.X0i1O();
            } else {
                LineDataSet lineDataSet12 = new LineDataSet(list, "");
                this.setValue = lineDataSet12;
                lineDataSet12.II1(ContextCompat.getColor(getMContext(), R.color.hr_color));
                lineDataSet = this.setValue;
                if (lineDataSet == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet = null;
                }
                lineDataSet.I00(ContextCompat.getColor(getMContext(), R.color.hr_color));
                lineDataSet2 = this.setValue;
                if (lineDataSet2 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet2 = null;
                }
                lineDataSet2.I1XII0X(2.0f);
                lineDataSet3 = this.setValue;
                if (lineDataSet3 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet3 = null;
                }
                lineDataSet3.iXOII(1.0f);
                lineDataSet4 = this.setValue;
                if (lineDataSet4 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet4 = null;
                }
                lineDataSet4.IOI0i0I(false);
                lineDataSet5 = this.setValue;
                if (lineDataSet5 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet5 = null;
                }
                lineDataSet5.XXI(false);
                lineDataSet6 = this.setValue;
                if (lineDataSet6 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet6 = null;
                }
                lineDataSet6.O1iXiI(true);
                Drawable drawable2 = ContextCompat.getDrawable(getMContext(), R.drawable.shape_hr);
                Intrinsics.X1ii(drawable2, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                lineDataSet7 = this.setValue;
                if (lineDataSet7 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet7 = null;
                }
                lineDataSet7.I0i1OXiI(drawable2);
                lineDataSet8 = this.setValue;
                if (lineDataSet8 == null) {
                    Intrinsics.XXO("setValue");
                    lineDataSet8 = null;
                }
                C2305co c2305co2 = new C2305co(lineDataSet8);
                c2305co2.m1316iI(false);
                lineChart = this.lineChart;
                if (lineChart == null) {
                    Intrinsics.XXO("lineChart");
                    lineChart = null;
                }
                lineChart.setData(c2305co2);
            }
        }
        LineChart lineChart8 = this.lineChart;
        if (lineChart8 == null) {
            Intrinsics.XXO("lineChart");
            lineChart8 = null;
        }
        lineChart8.I0IIOi(1000);
        LineChart lineChart9 = this.lineChart;
        if (lineChart9 == null) {
            Intrinsics.XXO("lineChart");
        } else {
            lineChart3 = lineChart9;
        }
        lineChart3.invalidate();
    }

    private final void showLocation() {
        localFindLocation(new ArrayList<>());
    }

    private final void showMapContent(ArrayList<CustomLatLng> arrayList) {
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            getMapPbRl().setVisibility(8);
            return;
        }
        if (this.isInChinaMainland) {
            showBaiDuMap(arrayList);
        } else {
            showGoogleMap(arrayList);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.c35
            @Override // java.lang.Runnable
            public final void run() {
                SportRecordsDetailActivity.showMapContent$lambda$0(this.f5894IO);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMapContent$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        sportRecordsDetailActivity.getMapViewFrameLayout().setVisibility(0);
        sportRecordsDetailActivity.getMapPbRl().setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207 A[LOOP:1: B:79:0x01f8->B:81:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0222  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0247  */
    /* JADX WARN: Code duplicated, block: B:95:0x0217 A[EDGE_INSN: B:95:0x0217->B:83:0x0217 BREAK  A[LOOP:1: B:79:0x01f8->B:81:0x0207], SYNTHETIC] */
    private final void showSpeedData() {
        RecordDetailSpeedData recordDetailSpeedDataSportRecordWorkoutDetailSpeed;
        ArrayList arrayList;
        int size;
        int iIntValue;
        String strIXiiiO;
        int mDistanceTotal;
        int i;
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        if (sportRecordData.getMSource() == 0) {
            ArrayList<RecordTimeList> mTimeList = this.activityData.getMTimeList();
            SportRecordData sportRecordData3 = this.sportRecordData;
            if (sportRecordData3 == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData3 = null;
            }
            recordDetailSpeedDataSportRecordWorkoutDetailSpeed = SportRecordDataKt.sportRecordActivityDetailSpeed(mTimeList, sportRecordData3.getMMode(), this.userProfile.getUnit());
        } else {
            ArrayList<RecordTimeList> mTimeList2 = this.activityData.getMTimeList();
            SportRecordData sportRecordData4 = this.sportRecordData;
            if (sportRecordData4 == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData4 = null;
            }
            recordDetailSpeedDataSportRecordWorkoutDetailSpeed = SportRecordDataKt.sportRecordWorkoutDetailSpeed(mTimeList2, sportRecordData4.getMMode(), this.userProfile.getUnit(), this.locationSmoothAlgorithm);
        }
        if (this.activityData.getMSpeed() <= 0.0d) {
            getSportRecordAvgSpeed().setText("0.0");
        } else {
            getSportRecordAvgSpeed().setText(String.valueOf(this.activityData.getMSpeed()));
        }
        if (recordDetailSpeedDataSportRecordWorkoutDetailSpeed.getMFastestSpeed() < this.activityData.getMSpeed()) {
            recordDetailSpeedDataSportRecordWorkoutDetailSpeed.setMFastestSpeed(this.activityData.getMSpeed());
        }
        if (recordDetailSpeedDataSportRecordWorkoutDetailSpeed.getMFastestSpeed() <= 0.0d) {
            getSportRecordFastestSpeed().setText("0.0");
        } else {
            getSportRecordFastestSpeed().setText(String.valueOf(recordDetailSpeedDataSportRecordWorkoutDetailSpeed.getMFastestSpeed()));
        }
        int speedUnit = getSpeedUnit();
        getSportRecordAvgSpeedUnit().setText(speedUnit);
        getSportRecordFastestSpeedUnit().setText(speedUnit);
        ArrayList<Integer> mPaceList = recordDetailSpeedDataSportRecordWorkoutDetailSpeed.getMPaceList();
        int paceUnit = getPaceUnit();
        getSportRecordAvgPaceUnit().setText(paceUnit);
        getSportRecordFastestPaceUnit().setText(paceUnit);
        int size2 = mPaceList.size();
        int i2 = 0;
        int i3 = 0;
        int mPace = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            Integer num = mPaceList.get(i5);
            Intrinsics.O10IXXX0X(num, "get(...)");
            int iIntValue2 = num.intValue();
            if (iIntValue2 > 30000) {
                mPaceList.set(i5, Integer.valueOf(this.activityData.getMPace()));
                iIntValue2 = this.activityData.getMPace();
            }
            if (i5 == 0) {
                i3 = iIntValue2;
                mPace = i3;
            }
            if (i3 > iIntValue2) {
                i3 = iIntValue2;
            }
            if (mPace < iIntValue2) {
                mPace = iIntValue2;
            }
            i4 += iIntValue2;
        }
        SportRecordData sportRecordData5 = this.sportRecordData;
        if (sportRecordData5 == null) {
            Intrinsics.XXO("sportRecordData");
        } else {
            sportRecordData2 = sportRecordData5;
        }
        boolean z = true;
        if (sportRecordData2.getMSource() == 1 && this.activityData.getMPace() > 0) {
            getSportRecordAvgPace().setText(cp5.Ii1iii0(this.activityData.getMPace(), this.userProfile.getUnit()));
            if (i3 == 0 && mPaceList.size() == 0) {
                getSportRecordFastestPace().setText(String.valueOf(cp5.Ii1iii0(this.activityData.getMMinPace() > 0 ? this.activityData.getMMinPace() : this.activityData.getMPace(), this.userProfile.getUnit())));
            } else {
                getSportRecordFastestPace().setText(String.valueOf(this.activityData.getMMinPace() > 0 ? cp5.Ii1iii0(this.activityData.getMMinPace(), this.userProfile.getUnit()) : cp5.iXiiiO(i3)));
            }
            if (mPaceList.size() == 0) {
                if (this.activityData.getMDistanceTotal() > 0.0f) {
                    mPace = this.activityData.getMPace() * 2;
                    mDistanceTotal = (int) this.activityData.getMDistanceTotal();
                    if (mDistanceTotal >= 0) {
                        i = 0;
                        while (true) {
                            mPaceList.add(Integer.valueOf(this.activityData.getMPace()));
                            if (i != mDistanceTotal) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    mPaceList.add(Integer.valueOf(this.activityData.getMPace()));
                }
            }
            arrayList = new ArrayList();
            size = mPaceList.size();
            while (i2 < size) {
                Integer num2 = mPaceList.get(i2);
                Intrinsics.O10IXXX0X(num2, "get(...)");
                iIntValue = num2.intValue();
                i2++;
                String strValueOf = String.valueOf(i2);
                float f = iIntValue / mPace;
                if (z) {
                    strIXiiiO = cp5.Ii1iii0(iIntValue, this.userProfile.getUnit());
                } else {
                    strIXiiiO = cp5.iXiiiO(iIntValue);
                }
                arrayList.add(new b15(strValueOf, f, strIXiiiO));
            }
            RecyclerView rv = getRv();
            rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));
            Context context = rv.getContext();
            Intrinsics.O10IXXX0X(context, "getContext(...)");
            rv.setAdapter(new SportRecordDetailSpeedAdapter(arrayList, context));
        }
        getSportRecordFastestPace().setText(cp5.iXiiiO(i3));
        getSportRecordAvgPace().setText(this.activityData.getMPace() > 0 ? cp5.iXiiiO(this.activityData.getMPace()) : cp5.iXiiiO(mPaceList.size() == 0 ? 0 : i4 / mPaceList.size()));
        z = false;
        if (mPaceList.size() == 0) {
            if (this.activityData.getMDistanceTotal() > 0.0f) {
                mPace = this.activityData.getMPace() * 2;
                mDistanceTotal = (int) this.activityData.getMDistanceTotal();
                if (mDistanceTotal >= 0) {
                    i = 0;
                    while (true) {
                        mPaceList.add(Integer.valueOf(this.activityData.getMPace()));
                        if (i != mDistanceTotal) {
                            break;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                mPaceList.add(Integer.valueOf(this.activityData.getMPace()));
            }
        }
        arrayList = new ArrayList();
        size = mPaceList.size();
        while (i2 < size) {
            Integer num3 = mPaceList.get(i2);
            Intrinsics.O10IXXX0X(num3, "get(...)");
            iIntValue = num3.intValue();
            i2++;
            String strValueOf2 = String.valueOf(i2);
            float f2 = iIntValue / mPace;
            if (z) {
                strIXiiiO = cp5.Ii1iii0(iIntValue, this.userProfile.getUnit());
            } else {
                strIXiiiO = cp5.iXiiiO(iIntValue);
            }
            arrayList.add(new b15(strValueOf2, f2, strIXiiiO));
        }
        RecyclerView rv2 = getRv();
        rv2.setLayoutManager(new LinearLayoutManager(rv2.getContext()));
        Context context2 = rv2.getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        rv2.setAdapter(new SportRecordDetailSpeedAdapter(arrayList, context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFRegular speedPf_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFRegular) sportRecordsDetailActivity.findViewById(R.id.speedPf);
    }

    private final void spliceBitmapAndShare(int i, int i2, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6) {
        float height;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), i2, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (bitmap6 != null) {
            canvas.drawBitmap(bitmap6, 0.0f, 0.0f, (Paint) null);
            height = (bitmap6.getHeight() - SizeUtils.dp2px(30.0f)) + 0.0f;
            canvas.drawBitmap(bitmap, 0.0f, height, (Paint) null);
        } else {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            height = 0.0f;
        }
        float height2 = height + bitmap.getHeight() + i;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, height2, (Paint) null);
            height2 += bitmap2.getHeight() + i;
        }
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, 0.0f, height2, (Paint) null);
            height2 += bitmap3.getHeight() + i;
        }
        if (bitmap5 != null) {
            canvas.drawBitmap(bitmap5, 0.0f, height2, (Paint) null);
            height2 += bitmap5.getHeight() + i;
        }
        canvas.drawBitmap(bitmap4, 0.0f, height2, (Paint) null);
        XIi1i01O.OXO1.XO0O10(getMContext(), bitmapCreateBitmap);
    }

    public static /* synthetic */ void spliceBitmapAndShare$default(SportRecordsDetailActivity sportRecordsDetailActivity, int i, int i2, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, int i3, Object obj) {
        sportRecordsDetailActivity.spliceBitmapAndShare(i, i2, bitmap, bitmap2, bitmap3, bitmap4, bitmap5, (i3 & 128) != 0 ? null : bitmap6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportName_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordAerobic_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordAerobic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordAltitudeUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordAltitudeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordAltitude_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordAltitude);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordAnaerobic_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordAnaerobic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordAvgHR_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgHR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordAvgPaceRl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgPaceRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordAvgPaceUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgPaceUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordAvgPace_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgPace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordAvgSpeedRl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgSpeedRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordAvgSpeedUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgSpeedUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordAvgSpeed_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordAvgSpeed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordCDUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordCDUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordCD_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordCD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordCRUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordCRUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordCR_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordCR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordCadenceLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordCadenceLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordCadence_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordCadence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordCaloriesLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordCaloriesLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordCalories_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordCalories);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordDistanceLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordDistanceLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordDistanceUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordDistanceUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordDistance_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordDistance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordFastestPaceRl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordFastestPaceRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordFastestPaceUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordFastestPaceUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordFastestPace_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordFastestPace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordFastestSpeedRl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordFastestSpeedRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecordFastestSpeedUnit_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (PFMedium) sportRecordsDetailActivity.findViewById(R.id.sportRecordFastestSpeedUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordFastestSpeed_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordFastestSpeed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordFatBurning_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordFatBurning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordMaxHR_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordMaxHR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout sportRecordPaceChartRl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (LinearLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordPaceChartRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordPauseTimeLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordPauseTimeLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordPauseTime_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordPauseTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportRecordStepLl_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (RelativeLayout) sportRecordsDetailActivity.findViewById(R.id.sportRecordStepLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordStep_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordStrenuous_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordStrenuous);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportRecordWarmUp_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportRecordWarmUp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportStartTime_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportStartTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sportTime_delegate$lambda$0(SportRecordsDetailActivity sportRecordsDetailActivity) {
        return (DINCondBold) sportRecordsDetailActivity.findViewById(R.id.sportTime);
    }

    public final void delete(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            String string = getString(R.string.delete_record_remind);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            go0Var.m1864iI(string);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.c15
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SportRecordsDetailActivity.delete$lambda$0$0(this.f5876IO));
                }
            });
            this.mDeletePopup = go0Var;
        }
        go0 go0Var2 = this.mDeletePopup;
        if (go0Var2 != null) {
            RelativeLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void downloadGpx(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.locationSmoothAlgorithm.size() > 0) {
            SimpleDateFormat simpleDateFormatOIX0iXi = O0X11OiO.OIX0iXi();
            int rawOffset = TimeZone.getDefault().getRawOffset();
            StringBuilder sb = new StringBuilder();
            sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><gpx creator='");
            sb.append(this.userProfile.getNickname());
            sb.append("' version=\"1.1\" xmlns='http://www.topografix.com/GPX/1/1'><metadata><time>");
            SportRecordData sportRecordData = this.sportRecordData;
            if (sportRecordData == null) {
                Intrinsics.XXO("sportRecordData");
                sportRecordData = null;
            }
            long j = rawOffset;
            sb.append(simpleDateFormatOIX0iXi.format(Long.valueOf(sportRecordData.getMStartTime() - j)));
            sb.append("</time></metadata>");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<trk><name>");
            sb2.append(getSportName().getText());
            sb2.append("</name><desc>");
            sb2.append(getString(R.string.app_name));
            sb2.append("</desc><trkseg>");
            int size = this.locationSmoothAlgorithm.size();
            int i = 0;
            while (i < size) {
                CustomLatLng customLatLng = this.locationSmoothAlgorithm.get(i);
                Intrinsics.O10IXXX0X(customLatLng, "get(...)");
                CustomLatLng customLatLng2 = customLatLng;
                sb.append("<wpt lat='");
                sb.append(customLatLng2.getLatitude());
                sb.append("' lon='");
                sb.append(customLatLng2.getLongitude());
                sb.append("'><name>\"");
                i++;
                sb.append(i);
                sb.append("\"</name><ele>");
                sb.append(customLatLng2.getAltitude());
                sb.append("</ele><time>");
                sb.append(simpleDateFormatOIX0iXi.format(Long.valueOf(customLatLng2.getTime() - j)));
                sb.append("</time></wpt>");
                sb2.append("<trkpt lat='");
                sb2.append(customLatLng2.getLatitude());
                sb2.append("' lon='");
                sb2.append(customLatLng2.getLongitude());
                sb2.append("'><ele>");
                sb2.append(customLatLng2.getAltitude());
                sb2.append("</ele><time>");
                sb2.append(simpleDateFormatOIX0iXi.format(Long.valueOf(customLatLng2.getTime() - j)));
                sb2.append("</time></trkpt>");
            }
            sb2.append("</trkseg></trk>");
            sb.append(sb2.toString());
            sb.append("</gpx>");
            sz0 sz0Var = sz0.OXO1;
            FileIOUtils.writeFileFromString(uz0.O1O(sz0Var), sb.toString());
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", getString(R.string.share_gpx_file));
            intent.putExtra("android.intent.extra.STREAM", sz0Var.XO0O10(uz0.O1O(sz0Var)));
            intent.setType("application/gpx");
            startActivity(Intent.createChooser(intent, getString(R.string.share_gpx_file)));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        Parcelable mArg2 = getMArg2();
        Intrinsics.X1ii(mArg2, "null cannot be cast to non-null type com.sma.smartv3.model.SportRecordData");
        this.sportRecordData = (SportRecordData) mArg2;
        View viewFindViewById = findViewById(R.id.sportRecordLineChartHR);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.lineChart = (LineChart) viewFindViewById;
        SportRecordData sportRecordData = this.sportRecordData;
        SportRecordData sportRecordData2 = null;
        if (sportRecordData == null) {
            Intrinsics.XXO("sportRecordData");
            sportRecordData = null;
        }
        switch (sportRecordData.getMMode()) {
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 19:
                this.threshold = 5;
                this.thresholdMax = 100;
                break;
            case 10:
                this.threshold = 10;
                this.thresholdMax = 100;
                getSportRecordStepLl().setVisibility(8);
                getSportRecordCadenceLl().setVisibility(8);
                if (BleCache.INSTANCE.getMAGpsType() == 0 && !q62.OXO1.XOXOIX0Oi()) {
                    getSportRecordDistanceLl().setVisibility(8);
                    getRootViewSpeed().setVisibility(8);
                    getRootViewAltitude().setVisibility(8);
                }
                break;
            case 11:
            case 14:
            case 15:
            case 21:
                getSportRecordStepLl().setVisibility(8);
                getSportRecordDistanceLl().setVisibility(8);
                getSportRecordCadenceLl().setVisibility(8);
                getRootViewSpeed().setVisibility(8);
                getRootViewAltitude().setVisibility(8);
                break;
            case 16:
            case 17:
            case 18:
            case 25:
            case 26:
            case 27:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                getSportRecordDistanceLl().setVisibility(8);
                getSportRecordCadenceLl().setVisibility(8);
                getRootViewSpeed().setVisibility(8);
                getRootViewAltitude().setVisibility(8);
                break;
        }
        ViewGroup.LayoutParams layoutParams = getActivityDataLl().getLayoutParams();
        Intrinsics.X1ii(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        SportRecordData sportRecordData3 = this.sportRecordData;
        if (sportRecordData3 == null) {
            Intrinsics.XXO("sportRecordData");
        } else {
            sportRecordData2 = sportRecordData3;
        }
        if (sportRecordData2.getMIsLocationEmpty()) {
            getMapPbRl().setVisibility(8);
            getDownloadGpxIb().setVisibility(8);
            layoutParams2.topMargin = SizeUtils.dp2px(70.0f);
            getNestedScrollView().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_main_bg));
        } else {
            getMapPbRl().setVisibility(0);
            getDownloadGpxIb().setVisibility(0);
            this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
            layoutParams2.topMargin = SizeUtils.dp2px(370.0f);
            getNestedScrollView().setBackgroundResource(R.color.text_color);
            showLocation();
        }
        showActivityData();
        showHeartRateData();
        showSpeedData();
        showAltitudeData();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_records_detail;
    }

    public final void onBack(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v17, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, android.graphics.Bitmap] */
    public final void share(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        LinearLayout activityDataLl = getActivityDataLl();
        Intrinsics.O10IXXX0X(activityDataLl, "<get-activityDataLl>(...)");
        final Bitmap bitmapXIi00iiXO = xIi1i01O.XIi00iiXO(activityDataLl);
        intRef.element += bitmapXIi00iiXO.getHeight();
        LinearLayout rootViewHeartRate = getRootViewHeartRate();
        Intrinsics.O10IXXX0X(rootViewHeartRate, "<get-rootViewHeartRate>(...)");
        if (rootViewHeartRate.getVisibility() == 0) {
            LinearLayout rootViewHeartRate2 = getRootViewHeartRate();
            Intrinsics.O10IXXX0X(rootViewHeartRate2, "<get-rootViewHeartRate>(...)");
            ?? XIi00iiXO = xIi1i01O.XIi00iiXO(rootViewHeartRate2);
            objectRef2.element = XIi00iiXO;
            intRef.element += XIi00iiXO.getHeight();
        }
        LinearLayout rootViewSpeed = getRootViewSpeed();
        Intrinsics.O10IXXX0X(rootViewSpeed, "<get-rootViewSpeed>(...)");
        if (rootViewSpeed.getVisibility() == 0) {
            LinearLayout rootViewSpeed2 = getRootViewSpeed();
            Intrinsics.O10IXXX0X(rootViewSpeed2, "<get-rootViewSpeed>(...)");
            ?? XIi00iiXO2 = xIi1i01O.XIi00iiXO(rootViewSpeed2);
            objectRef3.element = XIi00iiXO2;
            intRef.element += XIi00iiXO2.getHeight();
        }
        LinearLayout rootViewAltitude = getRootViewAltitude();
        Intrinsics.O10IXXX0X(rootViewAltitude, "<get-rootViewAltitude>(...)");
        if (rootViewAltitude.getVisibility() == 0) {
            LinearLayout rootViewAltitude2 = getRootViewAltitude();
            Intrinsics.O10IXXX0X(rootViewAltitude2, "<get-rootViewAltitude>(...)");
            ?? XIi00iiXO3 = xIi1i01O.XIi00iiXO(rootViewAltitude2);
            objectRef.element = XIi00iiXO3;
            intRef.element += XIi00iiXO3.getHeight();
        }
        View bottomView = getBottomView();
        Intrinsics.O10IXXX0X(bottomView, "<get-bottomView>(...)");
        final Bitmap bitmapXIi00iiXO2 = xIi1i01O.XIi00iiXO(bottomView);
        intRef.element += bitmapXIi00iiXO2.getHeight();
        final int iDp2px = SizeUtils.dp2px(8.0f);
        FrameLayout mapViewFrameLayout = getMapViewFrameLayout();
        Intrinsics.O10IXXX0X(mapViewFrameLayout, "<get-mapViewFrameLayout>(...)");
        if (mapViewFrameLayout.getVisibility() != 0) {
            spliceBitmapAndShare$default(this, iDp2px, intRef.element, bitmapXIi00iiXO, (Bitmap) objectRef2.element, (Bitmap) objectRef3.element, bitmapXIi00iiXO2, (Bitmap) objectRef.element, null, 128, null);
            return;
        }
        if (this.mBaiDuMapFragment != null) {
            BaiduMap.SnapshotReadyCallback snapshotReadyCallback = new BaiduMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.d35
                @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    SportRecordsDetailActivity.share$lambda$0(intRef, this, iDp2px, bitmapXIi00iiXO, objectRef2, objectRef3, bitmapXIi00iiXO2, objectRef, bitmap);
                }
            };
            BaiDuMapSportRecordFragment baiDuMapSportRecordFragment = this.mBaiDuMapFragment;
            Intrinsics.XXI(baiDuMapSportRecordFragment);
            baiDuMapSportRecordFragment.getBaiDuMap().snapshot(snapshotReadyCallback);
            return;
        }
        if (this.mGoogleMapFragment != null) {
            GoogleMap.SnapshotReadyCallback snapshotReadyCallback2 = new GoogleMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.e35
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    SportRecordsDetailActivity.share$lambda$1(intRef, this, iDp2px, bitmapXIi00iiXO, objectRef2, objectRef3, bitmapXIi00iiXO2, objectRef, bitmap);
                }
            };
            GoogleMapSportRecordFragment googleMapSportRecordFragment = this.mGoogleMapFragment;
            Intrinsics.XXI(googleMapSportRecordFragment);
            googleMapSportRecordFragment.getGoogleMap().snapshot(snapshotReadyCallback2);
        }
    }
}
