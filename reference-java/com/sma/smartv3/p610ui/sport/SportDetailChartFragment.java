package com.sma.smartv3.p610ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.p554ui.layout.LayoutKt;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XI1XiOI;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.rc2;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tv1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.dao.SportDataDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.p608db.entity.SportData;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.SportDetailChartFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailChartFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1215:1\n19#2:1216\n15#2:1217\n19#2:1226\n15#2:1227\n1869#3:1218\n1869#3,2:1219\n1870#3:1221\n1869#3,2:1222\n1878#3,2:1224\n1880#3:1228\n1869#3,2:1229\n1869#3,2:1231\n1869#3,2:1233\n1869#3,2:1235\n1878#3,3:1237\n1563#3:1240\n1634#3,3:1241\n13920#4,3:1244\n*S KotlinDebug\n*F\n+ 1 SportDetailChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailChartFragment\n*L\n70#1:1216\n70#1:1217\n434#1:1226\n434#1:1227\n300#1:1218\n321#1:1219,2\n300#1:1221\n359#1:1222,2\n422#1:1224,2\n422#1:1228\n696#1:1229,2\n774#1:1231,2\n839#1:1233,2\n931#1:1235,2\n1059#1:1237,3\n1075#1:1240\n1075#1:1241,3\n1079#1:1244,3\n*E\n"})
public class SportDetailChartFragment extends BaseFragment {

    @aa1
    private final Lazy altitudeLineChart$delegate;

    @aa1
    private final Lazy altitudePanel$delegate;

    @aa1
    private final Lazy hrLineChart$delegate;

    @aa1
    private final Lazy hrPanel$delegate;

    @aa1
    private final Lazy hrPieChart$delegate;
    private boolean isLocationEmpty;
    private boolean leftAxisGridDashedLine;

    @aa1
    private final Lazy llHeartRateRange$delegate;

    @aa1
    private final Lazy mActivityDao$delegate;

    @aa1
    private final Lazy mChartXStartIndex$delegate;
    private long mEndTime;

    @aa1
    private final Lazy mHeartRateDao$delegate;

    @aa1
    private final Lazy mLocationDao$delegate;

    @aa1
    private final Lazy mPressureDao$delegate;

    @aa1
    private final Lazy mSportDataDao$delegate;
    private long mStartTime;
    public Workout mWorkout;

    @aa1
    private final Lazy paceLineChart$delegate;

    @aa1
    private final Lazy pacePanel$delegate;

    @aa1
    private final Lazy pressureLineChart$delegate;

    @aa1
    private final Lazy pressurePanel$delegate;

    @aa1
    private final Lazy speedLineChart$delegate;

    @aa1
    private final Lazy speedPanel$delegate;

    @aa1
    private final Lazy spmLineChart$delegate;

    @aa1
    private final Lazy spmPanel$delegate;

    @aa1
    private final Lazy tvAltitudeUnit$delegate;

    @aa1
    private final Lazy tvAvgBmpValue$delegate;

    @aa1
    private final Lazy tvAvgPaceValue$delegate;

    @aa1
    private final Lazy tvAvgPressureValue$delegate;

    @aa1
    private final Lazy tvAvgSpeedValue$delegate;

    @aa1
    private final Lazy tvAvgSpeedValueTitle$delegate;

    @aa1
    private final Lazy tvAvgSpmValue$delegate;

    @aa1
    private final Lazy tvFastSpeedValue$delegate;

    @aa1
    private final Lazy tvHeartRateRange$delegate;

    @aa1
    private final Lazy tvMaxAltitudeValue$delegate;

    @aa1
    private final Lazy tvMaxBmpValue$delegate;

    @aa1
    private final Lazy tvMaxPressureValue$delegate;

    @aa1
    private final Lazy tvMaxSpmValue$delegate;

    @aa1
    private final Lazy tvMinAltitudeValue$delegate;

    @aa1
    private final Lazy tvMinPaceValue$delegate;

    @aa1
    private final Lazy tvSportAerobic$delegate;

    @aa1
    private final Lazy tvSportAnaerobic$delegate;

    @aa1
    private final Lazy tvSportFatBurning$delegate;

    @aa1
    private final Lazy tvSportStrenuous$delegate;

    @aa1
    private final Lazy tvSportWarmUp$delegate;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final String TAG = "SportDetailChartFragment";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ss4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailChartFragment.rootView_delegate$lambda$0(this.f11117IO);
        }
    });

    public static final class OXO1 extends C2829q4 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.C2829q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            return cp5.Ii1iii0((int) f, SportDetailChartFragment.this.getUserProfile().getUnit());
        }
    }

    public SportDetailChartFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.hrLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.us4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.hrLineChart_delegate$lambda$0(this.f11561IO);
            }
        });
        this.tvAvgBmpValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAvgBmpValue_delegate$lambda$0(this.f6955IO);
            }
        });
        this.tvMaxBmpValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.st4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvMaxBmpValue_delegate$lambda$0(this.f11124IO);
            }
        });
        this.tvSportStrenuous$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ut4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvSportStrenuous_delegate$lambda$0(this.f11568IO);
            }
        });
        this.tvSportAnaerobic$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvSportAnaerobic_delegate$lambda$0(this.f11809IO);
            }
        });
        this.tvSportAerobic$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvSportAerobic_delegate$lambda$0(this.f12032IO);
            }
        });
        this.tvSportFatBurning$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvSportFatBurning_delegate$lambda$0(this.f12231IO);
            }
        });
        this.tvSportWarmUp$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvSportWarmUp_delegate$lambda$0(this.f12449IO);
            }
        });
        this.hrPieChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.au4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.hrPieChart_delegate$lambda$0(this.f5576IO);
            }
        });
        this.hrPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.hrPanel_delegate$lambda$0(this.f6262IO);
            }
        });
        this.tvHeartRateRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ot4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvHeartRateRange_delegate$lambda$0(this.f10219IO);
            }
        });
        this.llHeartRateRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.llHeartRateRange_delegate$lambda$0(this.f12690IO);
            }
        });
        this.paceLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bu4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.paceLineChart_delegate$lambda$0(this.f5823IO);
            }
        });
        this.tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cu4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAvgPaceValue_delegate$lambda$0(this.f6054IO);
            }
        });
        this.tvMinPaceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.du4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvMinPaceValue_delegate$lambda$0(this.f6271IO);
            }
        });
        this.pacePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eu4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.pacePanel_delegate$lambda$0(this.f6489IO);
            }
        });
        this.spmLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fu4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.spmLineChart_delegate$lambda$0(this.f6736IO);
            }
        });
        this.tvAvgSpmValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gu4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAvgSpmValue_delegate$lambda$0(this.f6963IO);
            }
        });
        this.tvMaxSpmValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ts4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvMaxSpmValue_delegate$lambda$0(this.f11347IO);
            }
        });
        this.spmPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vs4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.spmPanel_delegate$lambda$0(this.f11803IO);
            }
        });
        this.speedLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ws4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.speedLineChart_delegate$lambda$0(this.f12025IO);
            }
        });
        this.tvAvgSpeedValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xs4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAvgSpeedValue_delegate$lambda$0(this.f12227IO);
            }
        });
        this.tvFastSpeedValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ys4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvFastSpeedValue_delegate$lambda$0(this.f12442IO);
            }
        });
        this.speedPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zs4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.speedPanel_delegate$lambda$0(this.f12686IO);
            }
        });
        this.tvAvgSpeedValueTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.at4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAvgSpeedValueTitle_delegate$lambda$0(this.f5563IO);
            }
        });
        this.altitudeLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.altitudeLineChart_delegate$lambda$0(this.f5812IO);
            }
        });
        this.tvMinAltitudeValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ct4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvMinAltitudeValue_delegate$lambda$0(this.f6048IO);
            }
        });
        this.tvMaxAltitudeValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.et4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvMaxAltitudeValue_delegate$lambda$0(this.f6483IO);
            }
        });
        this.altitudePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ft4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.altitudePanel_delegate$lambda$0(this.f6728IO);
            }
        });
        this.tvAltitudeUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ht4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAltitudeUnit_delegate$lambda$0(this.f7198IO);
            }
        });
        this.pressureLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.it4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.pressureLineChart_delegate$lambda$0(this.f8753IO);
            }
        });
        this.tvAvgPressureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvAvgPressureValue_delegate$lambda$0(this.f9038IO);
            }
        });
        this.tvMaxPressureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.tvMaxPressureValue_delegate$lambda$0(this.f9277IO);
            }
        });
        this.pressurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.pressurePanel_delegate$lambda$0(this.f9515IO);
            }
        });
        this.mSportDataDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.mSportDataDao_delegate$lambda$0();
            }
        });
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.mLocationDao_delegate$lambda$0();
            }
        });
        this.mHeartRateDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.mHeartRateDao_delegate$lambda$0();
            }
        });
        this.mActivityDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.mActivityDao_delegate$lambda$0();
            }
        });
        this.mPressureDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailChartFragment.mPressureDao_delegate$lambda$0();
            }
        });
        this.isLocationEmpty = true;
        this.mChartXStartIndex$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tt4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Float.valueOf(SportDetailChartFragment.mChartXStartIndex_delegate$lambda$0(this.f11353IO));
            }
        });
    }

    private final void addColors(List<Integer> list, int i, float f) {
        if (f > 0.0f) {
            list.add(Integer.valueOf(getResources().getColor(i)));
        }
    }

    private final void addPieEntry(List<PieEntry> list, float f) {
        LogUtils.m11130i("addPieEntry " + f);
        if (f <= 0.0f) {
            f = 1.0f;
        }
        list.add(new PieEntry(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart altitudeLineChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (LineChart) sportDetailChartFragment.getMView().findViewById(R.id.altitudeLineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View altitudePanel_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.altitude_panel);
    }

    private final void configChart(LineChart lineChart, int i, int i2, int i3) {
        long j = 1000;
        long j2 = 60;
        long j3 = ((this.mEndTime - this.mStartTime) / j) / j2;
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        io1xi1x1i.XIi00iiXO(lineChart);
        lineChart.setTouchEnabled(false);
        lineChart.getDescription().XOO0ii0(false);
        lineChart.getLegend().XOO0ii0(false);
        lineChart.getAxisLeft().XO0X10iO(false);
        lineChart.getAxisLeft().iOiXi11II(i2);
        lineChart.getAxisLeft().i0X000X0O(i);
        lineChart.getAxisLeft().XX1Oi(gk4.m1859iO(getMActivity(), R.color.line_color));
        lineChart.getAxisLeft().I0IIOi(gk4.m1859iO(getMActivity(), R.color.line_color));
        lineChart.getAxisLeft().iI0I(true);
        lineChart.getAxisRight().X00Xi1X(false);
        lineChart.getAxisRight().XO0X10iO(false);
        lineChart.getAxisRight().Ii0X0X(false);
        XAxis xAxis = lineChart.getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = lineChart.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.i0X000X0O(0.0f);
        xAxis.IXOIIIO(1.0f);
        xAxis.iOiXi11II(j3);
        SimpleDateFormat simpleDateFormatIXI = O0X11OiO.IXI(false, 1, null);
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        if (0 <= j3) {
            while (true) {
                if (this.leftAxisGridDashedLine) {
                    arrayList.add(String.valueOf(j4));
                } else {
                    String strMillis2String = TimeUtils.millis2String(this.mStartTime + (j4 * j2 * j), simpleDateFormatIXI);
                    Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                    arrayList.add(strMillis2String);
                }
                if (j4 == j3) {
                    break;
                } else {
                    j4++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
    }

    public static /* synthetic */ void configChart$default(SportDetailChartFragment sportDetailChartFragment, LineChart lineChart, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configChart");
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        sportDetailChartFragment.configChart(lineChart, i, i2, i3);
    }

    private final int getAge(String str) {
        int iOXO1 = O0X11OiO.OXO1(str);
        if (iOXO1 < 16) {
            return 16;
        }
        if (iOXO1 > 60) {
            return 60;
        }
        return iOXO1;
    }

    private final float getAvg(float f, float f2, float f3) {
        float f4 = f > 0.0f ? f : 0.0f;
        if (rc2.I0IIOi(1.0f, f).contains(Float.valueOf(f3))) {
            return f3;
        }
        return (f2 <= 0.0f || f >= f2) ? f4 : f2;
    }

    private final ActivityDao getMActivityDao() {
        return (ActivityDao) this.mActivityDao$delegate.getValue();
    }

    private final HeartRateDao getMHeartRateDao() {
        return (HeartRateDao) this.mHeartRateDao$delegate.getValue();
    }

    private final PressureDao getMPressureDao() {
        return (PressureDao) this.mPressureDao$delegate.getValue();
    }

    private final SportDataDao getMSportDataDao() {
        return (SportDataDao) this.mSportDataDao$delegate.getValue();
    }

    private final List<SportData> getNewSportDataList(List<Location> list, List<Activity> list2) {
        int i = 0;
        boolean z = list.isEmpty() || list.size() < 2;
        this.isLocationEmpty = z;
        LogUtils.m11130i("getSportDataList isLocationEmpty " + z);
        ArrayList arrayList = new ArrayList();
        Object objIIII0iI = !list2.isEmpty() ? CollectionsKt___CollectionsKt.IIII0iI(list2) : null;
        for (Activity activity : list2) {
            if (i != 0) {
                int mStep = activity.getMStep();
                Intrinsics.XXI(objIIII0iI);
                Activity activity2 = (Activity) objIIII0iI;
                int mStep2 = mStep - activity2.getMStep();
                int mTime = ((int) (activity.getMTime() - activity2.getMTime())) / 1000;
                int mDistance = (activity.getMDistance() - activity2.getMDistance()) / 10000;
                SportData sportData = new SportData(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
                sportData.setMStep(mStep2);
                sportData.setMDistance(mDistance);
                String strMillis2String = TimeUtils.millis2String(activity.getMTime(), O0X11OiO.XO0O10());
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                sportData.setMLocalTime(strMillis2String);
                sportData.setMDuration(mTime);
                o65 o65Var = o65.OXO1;
                sportData.setMSpm(o65Var.m2748IO(sportData.getMStep(), sportData.getMDuration()));
                sportData.setMPace(o65Var.XIi00iiXO(sportData.getMDuration(), sportData.getMDistance()));
                sportData.setMSpeed(o65Var.m2749iO(sportData.getMDistance(), sportData.getMDuration()));
                if (sportData.getMDuration() > 0 && sportData.getMDistance() > 0) {
                    arrayList.add(sportData);
                }
                i1O0OXO1O.OXO1.XO0O10("getSportDataList sportData " + sportData);
            }
            i++;
            objIIII0iI = activity;
        }
        i1O0OXO1O.OXO1.XO0O10("getSportDataList sportDataList2 " + arrayList);
        return arrayList;
    }

    private final float getRandom(float f, float f2) {
        if (f2 != 0.0f && f != 0.0f && f2 < 10000.0f) {
            float f3 = (f2 + f) / 2;
            float f4 = (f2 - f) / 3;
            try {
                float f5 = 1;
                return Random.Default.nextInt((int) ((f3 - f4) - f5), (int) (f3 + f4 + f5));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0.0f;
    }

    private final List<SportData> getSportDataList(List<Location> list, List<Activity> list2) {
        int i = 0;
        boolean z = list.isEmpty() || list.size() < 2;
        this.isLocationEmpty = z;
        LogUtils.m11130i("getSportDataList isLocationEmpty " + z);
        ArrayList arrayList = new ArrayList();
        Object objIIII0iI = !list2.isEmpty() ? CollectionsKt___CollectionsKt.IIII0iI(list2) : null;
        i1O0OXO1O.OXO1.XO0O10("getSportDataList Activity " + list2);
        long mStart = getMWorkout().getMStart();
        long j = (long) 60000;
        long jXO0O10 = ProgressionUtilKt.XO0O10(mStart, getMWorkout().getMEnd() + j, 60000L);
        if (mStart <= jXO0O10) {
            while (true) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Activity activity = (Activity) it.next();
                    long j2 = 1 + mStart;
                    long j3 = mStart + j;
                    long mTime = activity.getMTime();
                    if (j2 > mTime || mTime > j3) {
                        it = it;
                        mStart = mStart;
                        i = i;
                    } else {
                        if (i != 0) {
                            int mStep = activity.getMStep();
                            Intrinsics.XXI(objIIII0iI);
                            Activity activity2 = (Activity) objIIII0iI;
                            int mStep2 = mStep - activity2.getMStep();
                            int mTime2 = ((int) (activity.getMTime() - activity2.getMTime())) / 1000;
                            int mDistance = (activity.getMDistance() - activity2.getMDistance()) / 10000;
                            SportData sportData = new SportData(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
                            sportData.setMStep(mStep2);
                            sportData.setMTime(mStart);
                            sportData.setMDistance(mDistance);
                            String strMillis2String = TimeUtils.millis2String(activity.getMTime(), O0X11OiO.XO0O10());
                            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                            sportData.setMLocalTime(strMillis2String);
                            sportData.setMDuration(mTime2);
                            o65 o65Var = o65.OXO1;
                            sportData.setMSpm(o65Var.m2748IO(sportData.getMStep(), sportData.getMDuration()));
                            sportData.setMPace(o65Var.XIi00iiXO(sportData.getMDuration(), sportData.getMDistance()));
                            sportData.setMSpeed(o65Var.m2749iO(sportData.getMDistance(), sportData.getMDuration()));
                            arrayList.add(sportData);
                            for (Location location : list) {
                                long mTime3 = location.getMTime();
                                if (j2 <= mTime3 && mTime3 <= j3) {
                                    sportData.setMAltitude(location.getMAltitude());
                                }
                            }
                            i1O0OXO1O.OXO1.XO0O10("getSportDataList sportData " + sportData);
                        }
                        i++;
                        objIIII0iI = activity;
                    }
                    it = it;
                    mStart = mStart;
                }
                int i2 = i;
                long j4 = mStart;
                if (j4 == jXO0O10) {
                    break;
                }
                mStart = j4 + 60000;
                i = i2;
            }
        }
        i1O0OXO1O.OXO1.XO0O10("getSportDataList sportDataList " + arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart hrLineChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (LineChart) sportDetailChartFragment.getMView().findViewById(R.id.hrLineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View hrPanel_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.hr_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PieChart hrPieChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (PieChart) sportDetailChartFragment.getMView().findViewById(R.id.hrPieChart);
    }

    private final boolean isSupportStep() {
        hu4 hu4Var = hu4.OXO1;
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            return hu4Var.IiI10X(getMWorkout().getMMode()) && hu4Var.X1ii(getMWorkout().getMMode());
        }
        return q62.OXO1.O1XXXX(getMWorkout().getMMode()) && hu4Var.X1ii(getMWorkout().getMMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llHeartRateRange_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.ll_heart_rate_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityDao mActivityDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().activityDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float mChartXStartIndex_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        boolean z = sportDetailChartFragment.leftAxisGridDashedLine;
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartRateDao mHeartRateDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PressureDao mPressureDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().pressureDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportDataDao mSportDataDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().sportDataDao();
    }

    private final void oldDrawChart() {
        List<HeartRate> heartRates = getMHeartRateDao().getHeartRates(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<Location> location = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<Activity> listASC = getMActivityDao().getListASC(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<SportData> sportDataASC = getMSportDataDao().getSportDataASC(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<Pressure> pressures = getMPressureDao().getPressures(getMWorkout().getMStart(), getMWorkout().getMEnd());
        LogUtils.m11130i("sportDataList" + sportDataASC);
        if (sportDataASC.isEmpty()) {
            sportDataASC = getSportDataList(location, listASC);
            LogUtils.m11130i("sportDataList" + sportDataASC.size());
        }
        if (o65.OXO1.O00(getMWorkout()) || q62.OXO1.OiXI1OiX0()) {
            showHr(new ArrayList());
            View hrPanel = getHrPanel();
            if (hrPanel != null) {
                hrPanel.setVisibility(8);
            }
        } else {
            showHr(heartRates);
        }
        if (isSupportStep()) {
            showSpm(sportDataASC);
        } else {
            getSpmPanel().setVisibility(8);
        }
        if (!location.isEmpty() && getMWorkout().getMMode() == 10) {
            sportDataASC = cp5.OII(location, 0, 2, null);
        }
        LogUtils.m11130i("sportDataList2" + sportDataASC.size());
        hu4 hu4Var = hu4.OXO1;
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            if (hu4Var.XIi00iiXO(getMWorkout().getMMode()) && i72.OXO1.IIO11()) {
                showPace(sportDataASC);
            } else {
                getPacePanel().setVisibility(8);
            }
        } else if (q62.OXO1.Oi000O010(getMWorkout().getMMode(), !this.isLocationEmpty) && i72.OXO1.IIO11()) {
            showPace(sportDataASC);
        } else {
            getPacePanel().setVisibility(8);
        }
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            if (q62.OXO1.IXO0OOi(getMWorkout().getMMode())) {
                showSpeed(sportDataASC);
            } else {
                getSpeedPanel().setVisibility(8);
            }
        } else if (q62.OXO1.Oi000O010(getMWorkout().getMMode(), !this.isLocationEmpty)) {
            showSpeed(sportDataASC);
        } else {
            getSpeedPanel().setVisibility(8);
        }
        LogUtils.m11130i("isSupportAltitude " + getMWorkout().getMMode() + " " + (!this.isLocationEmpty) + " " + location.size());
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            if (q62.OXO1.iX00X1X(getMWorkout().getMMode())) {
                showAltitude(location);
            } else {
                getAltitudePanel().setVisibility(8);
            }
        } else if (q62.OXO1.I1XXi1Oi(getMWorkout().getMMode(), !this.isLocationEmpty)) {
            showAltitude(location);
        } else {
            getAltitudePanel().setVisibility(8);
        }
        LogUtils.m11130i("isSupportPressure pressureList" + pressures.size());
        if (q62.OXO1.OOX(getMWorkout().getMMode())) {
            showPressure(pressures);
        } else {
            getPressurePanel().setVisibility(8);
        }
    }

    private final Pair<List<Entry>, Integer> optimizationInterfaceData(List<Entry> list, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        if (1 > i || i >= i3) {
            return new Pair<>(arrayList, Integer.valueOf(i2));
        }
        int i4 = i3 - i;
        for (Entry entry : list) {
            float fO00 = entry.O00() - i4;
            if (fO00 > 0.0f) {
                arrayList.add(new Entry(entry.OIX0iXi(), fO00));
            } else {
                arrayList.add(new Entry(entry.OIX0iXi(), 0.0f));
            }
        }
        return i2 < i4 ? new Pair<>(arrayList, 0) : new Pair<>(arrayList, Integer.valueOf(i2 - i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart paceLineChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (LineChart) sportDetailChartFragment.getMView().findViewById(R.id.paceLineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View pacePanel_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.pace_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart pressureLineChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (LineChart) sportDetailChartFragment.getMView().findViewById(R.id.pressureLineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View pressurePanel_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.pressure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView rootView_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (NestedScrollView) sportDetailChartFragment.getMView().findViewById(R.id.root_view);
    }

    public static /* synthetic */ void setSportText$default(SportDetailChartFragment sportDetailChartFragment, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSportText");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = 0;
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            j5 = 0;
        }
        sportDetailChartFragment.setSportText(j, j2, j3, j4, j5);
    }

    private final void showAltitude(List<Location> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, this.mEndTime, 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new nr0(0, 0, null, 4, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        for (Location location : list) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                nr0 nr0Var = (nr0) entry.getValue();
                if (o65.OXO1.OIX0iXi(location.getMTime()) <= jLongValue) {
                    nr0Var.OIX0iXi(nr0Var.I0IIOi() + location.getMAltitude());
                    nr0Var.OIi0(nr0Var.IiI10X() + 1);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        Iterator it = linkedHashMap.entrySet().iterator();
        int i = 0;
        int i2 = 0;
        float f = -1.0f;
        float f2 = -1.0f;
        while (it.hasNext()) {
            nr0 nr0Var2 = (nr0) ((Map.Entry) it.next()).getValue();
            if (nr0Var2.IiI10X() != 0 && nr0Var2.I0IIOi() != 0) {
                int iI0IIOi = nr0Var2.I0IIOi() / nr0Var2.IiI10X();
                arrayList.add(new Entry(mChartXStartIndex, iI0IIOi));
                if (i < iI0IIOi) {
                    f += 1.0f;
                    i = iI0IIOi;
                }
                if (i2 == 0 || i2 > iI0IIOi) {
                    f2 += 1.0f;
                    i2 = iI0IIOi;
                }
            }
            mChartXStartIndex += 1.0f;
        }
        i1O0OXO1O.OXO1.XO0O10("showAltitude" + arrayList);
        try {
            if (getMWorkout().getMMaxAltitude() > i && f > -1.0f) {
                arrayList.get((int) f).I0IIOi(getMWorkout().getMMaxAltitude());
            }
            if (getMWorkout().getMMinAltitude() < i2 && f2 > -1.0f) {
                arrayList.get((int) f2).I0IIOi(getMWorkout().getMMinAltitude());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LineChart altitudeLineChart = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(altitudeLineChart, "<get-altitudeLineChart>(...)");
        configChart$default(this, altitudeLineChart, Math.min(i2, getMWorkout().getMMinAltitude()), Math.max(i, getMWorkout().getMMaxAltitude()) + 5, 0, 8, null);
        LineChart altitudeLineChart2 = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(altitudeLineChart2, "<get-altitudeLineChart>(...)");
        updateChartData(altitudeLineChart2, arrayList, R.color.altitude_color, R.drawable.shape_altitude);
        LogUtils.m11130i("showAltitude2" + getMWorkout().getMMaxAltitude() + " //" + getMWorkout().getMMinAltitude() + " ");
        LogUtils.m11130i("showAltitude3 " + i + " //" + i2 + " ");
        getTvAltitudeUnit().setText(this.userProfile.getUnit() == 0 ? getString(R.string.altitude_unit) : getString(R.string.f54374yd));
        if (!(getMWorkout().getMMaxAltitude() == 0 && getMWorkout().getMMinAltitude() == 0) && getMWorkout().getMMaxAltitude() <= 10000 && getMWorkout().getMMaxAltitude() >= -10000) {
            getTvMaxAltitudeValue().setText(cp5.iXiX011(getMWorkout().getMMaxAltitude(), this.userProfile.getUnit()));
            getTvMinAltitudeValue().setText(cp5.iXiX011(getMWorkout().getMMinAltitude(), this.userProfile.getUnit()));
        } else {
            getTvMaxAltitudeValue().setText(cp5.iXiX011(i, this.userProfile.getUnit()));
            getTvMinAltitudeValue().setText(cp5.iXiX011(i2, this.userProfile.getUnit()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0192  */
    private final void showHr(List<HeartRate> list) {
        LinkedHashMap linkedHashMap;
        Iterator it;
        long j;
        HeartRate heartRate;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        long j2 = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j2, this.mEndTime, 60000L);
        if (j2 <= jXO0O10) {
            while (true) {
                linkedHashMap2.put(Long.valueOf(j2), new nr0(0, 0, null, 4, null));
                if (j2 == jXO0O10) {
                    break;
                } else {
                    j2 += 60000;
                }
            }
        }
        Iterator it2 = list.iterator();
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            HeartRate heartRate2 = (HeartRate) next;
            Iterator it3 = linkedHashMap2.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    linkedHashMap = linkedHashMap2;
                    it = it2;
                    j = j3;
                    heartRate = heartRate2;
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                long jLongValue = ((Number) entry.getKey()).longValue();
                linkedHashMap = linkedHashMap2;
                nr0 nr0Var = (nr0) entry.getValue();
                it = it2;
                j = j3;
                heartRate = heartRate2;
                if (o65.OXO1.OIX0iXi(heartRate.getMTime()) <= jLongValue) {
                    nr0Var.OIX0iXi(nr0Var.I0IIOi() + heartRate.getMBpm());
                    nr0Var.OIi0(nr0Var.IiI10X() + 1);
                    break;
                } else {
                    heartRate2 = heartRate;
                    it2 = it;
                    linkedHashMap2 = linkedHashMap;
                    j3 = j;
                }
            }
            if (i >= list.size() - 1) {
                j3 = j;
            } else if (i72.OXO1.X0100I()) {
                long mTime = list.get(i2).getMTime() - heartRate.getMTime();
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
                Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
                if (objFromJson != null) {
                    appUser = objFromJson;
                }
                int age = getAge(((AppUser) appUser).getBirthday());
                float mBpm = heartRate.getMBpm() / (220 - age);
                LogUtils.m11130i("isSupportZoneAlgorithm" + heartRate.getMBpm() + " bpm " + mBpm + " ", "age==" + age);
                double d = (double) mBpm;
                if (0.5d > d || d > 0.6d) {
                    if (0.6d <= d && d <= 0.7d) {
                        j6 += mTime;
                    } else if (0.7d <= d && d <= 0.8d) {
                        j5 += mTime;
                    } else if (0.8d <= d && d <= 0.9d) {
                        j4 += mTime;
                    } else if (0.9d > d || d > 1.0d) {
                        j7 += mTime;
                    } else {
                        j3 = j + mTime;
                    }
                    j3 = j;
                } else {
                    j7 += mTime;
                    j3 = j;
                }
            } else {
                long mTime2 = list.get(i2).getMTime() - heartRate.getMTime();
                if (heartRate.getMBpm() >= 130) {
                    j3 = j + mTime2;
                } else {
                    if (heartRate.getMBpm() >= 114) {
                        j4 += mTime2;
                    } else if (heartRate.getMBpm() >= 90) {
                        j5 += mTime2;
                    } else if (heartRate.getMBpm() >= 80) {
                        j6 += mTime2;
                    } else {
                        j7 += mTime2;
                    }
                    j3 = j;
                }
            }
            i = i2;
            it2 = it;
            linkedHashMap2 = linkedHashMap;
        }
        long j8 = j3;
        int i3 = 1;
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        int i4 = 100;
        int i5 = 0;
        float f = -1.0f;
        int mMaxBpm = 0;
        while (true) {
            it4 = it4;
            if (!it4.hasNext()) {
                break;
            }
            nr0 nr0Var2 = (nr0) ((Map.Entry) it4.next()).getValue();
            if (nr0Var2.IiI10X() == 0 || nr0Var2.I0IIOi() == 0) {
                mChartXStartIndex += 1.0f;
                i3 = i3;
                i5 = i5;
                j4 = j4;
            } else {
                int i6 = i5;
                long j9 = j4;
                int avg = (int) getAvg(nr0Var2.I0IIOi() / nr0Var2.IiI10X(), getMWorkout().getMMinBpm(), getMWorkout().getMMaxBpm());
                LogUtils.m11130i("showHr avg " + avg);
                arrayList.add(new Entry(mChartXStartIndex, (float) avg));
                if (mMaxBpm < avg) {
                    f += 1.0f;
                    mMaxBpm = avg;
                }
                int i7 = i3;
                if (i7 <= avg && avg < i4) {
                    i4 = avg;
                }
                mChartXStartIndex += 1.0f;
                i3 = i7;
                j4 = j9;
                i5 = i6 + avg;
            }
        }
        int i8 = i5;
        long j10 = j4;
        if (arrayList.size() != 0) {
            int size = i8 / arrayList.size();
        }
        i1O0OXO1O.OXO1.XO0O10("showHr values " + arrayList);
        if (getMWorkout().getMMaxBpm() > 0 && getMWorkout().getMMaxBpm() > mMaxBpm && f > -1.0f) {
            arrayList.get((int) f).I0IIOi(getMWorkout().getMMaxBpm());
        }
        LineChart hrLineChart = getHrLineChart();
        Intrinsics.O10IXXX0X(hrLineChart, "<get-hrLineChart>(...)");
        int i9 = i4;
        configChart$default(this, hrLineChart, 40, Math.max(mMaxBpm, getMWorkout().getMMaxBpm()) + 10, 0, 8, null);
        LineChart hrLineChart2 = getHrLineChart();
        Intrinsics.O10IXXX0X(hrLineChart2, "<get-hrLineChart>(...)");
        updateChartData(hrLineChart2, arrayList, R.color.hr_color, R.drawable.shape_hr);
        getTvAvgBmpValue().setText(String.valueOf(getMWorkout().getMMinBpm() > 0 ? getMWorkout().getMMinBpm() : i9));
        TextView tvMaxBmpValue = getTvMaxBmpValue();
        if (getMWorkout().getMMaxBpm() > 0) {
            mMaxBpm = getMWorkout().getMMaxBpm();
        }
        tvMaxBmpValue.setText(String.valueOf(mMaxBpm));
        LogUtils.m11130i("showHr avg " + getMWorkout().getMMinBpm() + "// " + getMWorkout().getMMaxBpm());
        if (!i72.OXO1.X11()) {
            setSportText(j8, j10, j5, j6, j7);
            return;
        }
        if (getMWorkout().getMMode() == 7) {
            setSportText(j8, j10, j5, j6, j7);
        } else if (getTvHeartRateRange() != null) {
            getTvHeartRateRange().setVisibility(8);
            getLlHeartRateRange().setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    private final void showPace(List<SportData> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, this.mEndTime, 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new nr0(0, 0, null, 4, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        float mMaxPace = getMWorkout().getMMaxPace();
        float mMinPace = getMWorkout().getMMinPace();
        ArrayList<Entry> arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        float f = 0.0f;
        int i = 0;
        boolean z = mMaxPace == 0.0f;
        boolean z2 = mMinPace == 0.0f;
        float random = 0.0f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            float mPace = i < list.size() - 1 ? list.get(i).getMPace() : f;
            float f2 = f;
            i1O0OXO1O.OXO1.XO0O10("showPace  " + mPace);
            float avg = getAvg(mPace, mMinPace, mMaxPace);
            if (avg == random || avg == mMinPace || avg == mMaxPace) {
                random = getRandom(mMinPace, mMaxPace);
                if (random == f2) {
                    random = avg;
                }
            } else {
                random = avg;
            }
            arrayList.add(new Entry(mChartXStartIndex, random));
            mChartXStartIndex += 1.0f;
            i++;
            f = f2;
        }
        float f3 = f;
        if (z2) {
            mMinPace = 100.0f;
        }
        for (Entry entry2 : arrayList) {
            if (z && entry2.O00() > mMaxPace) {
                mMaxPace = entry2.O00();
            }
            if (z2 && entry2.O00() < mMinPace && entry2.O00() > f3) {
                mMinPace = entry2.O00();
            }
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.XO0O10("showPace  " + arrayList);
        LineChart paceLineChart = getPaceLineChart();
        Intrinsics.O10IXXX0X(paceLineChart, "<get-paceLineChart>(...)");
        int i2 = (int) mMinPace;
        int i3 = (int) mMaxPace;
        configChart$default(this, paceLineChart, i2 - 10, i3 + 10, 0, 8, null);
        getPaceLineChart().getAxisLeft().m603Oi(new OXO1());
        getTvAvgPaceValue().setText(cp5.Ii1iii0(i3, this.userProfile.getUnit()));
        getTvMinPaceValue().setText(cp5.Ii1iii0(i2, this.userProfile.getUnit()));
        i1o0oxo1o.XO0O10("showPace max== " + getMWorkout().getMMaxPace() + " " + getMWorkout().getMMinPace());
        LineChart paceLineChart2 = getPaceLineChart();
        Intrinsics.O10IXXX0X(paceLineChart2, "<get-paceLineChart>(...)");
        updateChartData(paceLineChart2, arrayList, R.color.pace_color, R.drawable.shape_pace);
    }

    private final void showPieChart(PieChart pieChart, List<? extends PieEntry> list, List<Integer> list2) {
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().XOO0ii0(false);
        pieChart.Ii1iii0(5.0f, 5.0f, 5.0f, 5.0f);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(false);
        pieChart.setRotationAngle(0.0f);
        pieChart.getLegend().XOO0ii0(false);
        pieChart.setRotationEnabled(true);
        pieChart.X1ii(1400, XI1XiOI.O00);
        PieDataSet pieDataSet = new PieDataSet(list, "");
        pieDataSet.XXI(false);
        pieDataSet.mo693I1(false);
        pieDataSet.X10i(0.0f);
        pieDataSet.I011X(list2);
        pieChart.setData(new tv1(pieDataSet));
        pieChart.iOO1ii1(null);
        pieChart.invalidate();
    }

    private final void showPressure(List<Pressure> list) {
        int mMaxStress;
        float f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, this.mEndTime, 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new nr0(0, 0, null, 4, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        LogUtils.m11130i("filterDataMap " + linkedHashMap.size());
        List<Pressure> list2 = list;
        int mAvgStress = 0;
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            Pressure pressure = (Pressure) obj;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                nr0 nr0Var = (nr0) entry.getValue();
                if (o65.OXO1.OIX0iXi(pressure.getMTime()) <= jLongValue) {
                    nr0Var.OIX0iXi(nr0Var.I0IIOi() + pressure.getMValue());
                    nr0Var.OIi0(nr0Var.IiI10X() + 1);
                    break;
                }
            }
            i = i2;
        }
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        if (hu4.OXO1.OiIIX101O(getMWorkout().getMPlatform())) {
            o65 o65Var = o65.OXO1;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Float.valueOf(((Pressure) it.next()).getMValue()));
            }
            for (float f2 : o65Var.XOO0ii0(CollectionsKt___CollectionsKt.O1XXXX(arrayList2), linkedHashMap.size())) {
                arrayList.add(new Entry(mChartXStartIndex, f2));
                mChartXStartIndex += 1.0f;
            }
            mMaxStress = 0;
            f = -1.0f;
        } else {
            Iterator it2 = linkedHashMap.entrySet().iterator();
            mMaxStress = 0;
            int i3 = 0;
            f = -1.0f;
            while (it2.hasNext()) {
                nr0 nr0Var2 = (nr0) ((Map.Entry) it2.next()).getValue();
                if (nr0Var2.IiI10X() != 0 && nr0Var2.I0IIOi() != 0) {
                    int size = list.size();
                    int iI0IIOi = (1 > size || size >= 3) ? nr0Var2.I0IIOi() / nr0Var2.IiI10X() : list.get(0).getMValue();
                    arrayList.add(new Entry(mChartXStartIndex, iI0IIOi + (iI0IIOi / 5)));
                    if (mMaxStress < iI0IIOi) {
                        f += 1.0f;
                        mMaxStress = iI0IIOi;
                    }
                    i3 += iI0IIOi;
                }
                mChartXStartIndex += 1.0f;
            }
            mAvgStress = i3;
        }
        if (arrayList.size() != 0) {
            mAvgStress /= arrayList.size();
        }
        if (getMWorkout().getMMaxStress() > 0 && getMWorkout().getMMaxStress() > mMaxStress && f > -1.0f) {
            arrayList.get((int) f).I0IIOi(getMWorkout().getMMaxStress());
        }
        LineChart pressureLineChart = getPressureLineChart();
        Intrinsics.O10IXXX0X(pressureLineChart, "<get-pressureLineChart>(...)");
        configChart$default(this, pressureLineChart, 0, Math.max(mMaxStress, getMWorkout().getMMaxStress()) + 5, 0, 8, null);
        LineChart pressureLineChart2 = getPressureLineChart();
        Intrinsics.O10IXXX0X(pressureLineChart2, "<get-pressureLineChart>(...)");
        updateChartData(pressureLineChart2, arrayList, R.color.hr_color, R.drawable.shape_hr);
        TextView tvAvgPressureValue = getTvAvgPressureValue();
        if (getMWorkout().getMAvgStress() > 0) {
            mAvgStress = getMWorkout().getMAvgStress();
        }
        tvAvgPressureValue.setText(String.valueOf(mAvgStress));
        TextView tvMaxPressureValue = getTvMaxPressureValue();
        if (getMWorkout().getMMaxStress() > 0) {
            mMaxStress = getMWorkout().getMMaxStress();
        }
        tvMaxPressureValue.setText(String.valueOf(mMaxStress));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    private final void showSpeed(List<SportData> list) {
        LogUtils.m11130i("showSpeed====" + list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, this.mEndTime, 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new nr0(0, 0, null, 4, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        float mMaxSpeed = getMWorkout().getMMaxSpeed() / 1000.0f;
        float mMinSpeed = getMWorkout().getMMinSpeed() / 1000.0f;
        float f = 0.0f;
        int i = 0;
        boolean z = mMaxSpeed == 0.0f;
        boolean z2 = mMinSpeed == 0.0f;
        ArrayList<Entry> arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        float random = 0.0f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            float mSpeed = i < list.size() - 1 ? list.get(i).getMSpeed() : f;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            StringBuilder sb = new StringBuilder();
            float f2 = f;
            sb.append("showSpeed");
            sb.append(random);
            i1o0oxo1o.XO0O10(sb.toString());
            float avg = getAvg(mSpeed, mMinSpeed, mMaxSpeed);
            if (avg == random || avg == mMinSpeed || avg == mMaxSpeed) {
                random = getRandom(mMinSpeed, mMaxSpeed);
                if (random == f2) {
                    random = avg;
                }
            } else {
                random = avg;
            }
            arrayList.add(new Entry(mChartXStartIndex, random));
            mChartXStartIndex += 1.0f;
            i++;
            f = f2;
        }
        float f3 = f;
        if (z2 && !arrayList.isEmpty()) {
            mMinSpeed = ((Entry) CollectionsKt___CollectionsKt.IIII0iI(arrayList)).O00();
        }
        float fO00 = mMaxSpeed;
        float fO01 = mMinSpeed;
        for (Entry entry2 : arrayList) {
            if (z && entry2.O00() > fO00 && entry2.O00() > f3) {
                fO00 = entry2.O00();
            }
            if (z2 && entry2.O00() < fO01 && entry2.O00() > f3) {
                fO01 = entry2.O00();
            }
        }
        if (!list.isEmpty()) {
            list.size();
        }
        i1O0OXO1O.OXO1.XO0O10("showSpeed  " + arrayList);
        LineChart speedLineChart = getSpeedLineChart();
        Intrinsics.O10IXXX0X(speedLineChart, "<get-speedLineChart>(...)");
        configChart$default(this, speedLineChart, ((int) fO01) - 1, ((int) fO00) + 5, 0, 8, null);
        getTvAvgSpeedValueTitle().setText(getString(R.string.min_speed));
        getTvAvgSpeedValue().setText(cp5.XXiIiX10(fO01, this.userProfile.getUnit()));
        getTvFastSpeedValue().setText(cp5.XXiIiX10(fO00, this.userProfile.getUnit()));
        LineChart speedLineChart2 = getSpeedLineChart();
        Intrinsics.O10IXXX0X(speedLineChart2, "<get-speedLineChart>(...)");
        updateChartData(speedLineChart2, arrayList, R.color.speed_color, R.drawable.shape_speed);
        LogUtils.m11130i(" minSpeed" + fO01 + "  maxSpeed" + fO00 + " ");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    @SuppressLint({"SetTextI18n"})
    private final void showSpm(List<SportData> list) {
        LogUtils.m11130i("showSpm" + list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, this.mEndTime, 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new nr0(0, 0, null, 4, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        float mMaxSpm = getMWorkout().getMMaxSpm();
        float mMinSpm = getMWorkout().getMMinSpm();
        ArrayList<Entry> arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        int i = 0;
        boolean z = mMaxSpm == 0.0f;
        boolean z2 = mMinSpm == 0.0f;
        float random = 0.0f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            float avg = getAvg(i < list.size() - 1 ? list.get(i).getMStep() : 0.0f, mMinSpm, mMaxSpm);
            if (avg == random || avg == mMinSpm || avg == mMaxSpm) {
                random = getRandom(mMinSpm, mMaxSpm);
                if (random == 0.0f) {
                    random = avg;
                }
            } else {
                random = avg;
            }
            i1O0OXO1O.OXO1.XO0O10("showSpm" + random);
            arrayList.add(new Entry(mChartXStartIndex, random));
            mChartXStartIndex += 1.0f;
            i++;
        }
        if (z2) {
            mMinSpm = 100.0f;
        }
        for (Entry entry2 : arrayList) {
            entry2.O00();
            if (z && entry2.O00() > mMaxSpm) {
                mMaxSpm = entry2.O00();
            }
            if (z2 && entry2.O00() < mMinSpm && entry2.O00() > 0.0f) {
                mMinSpm = entry2.O00();
            }
        }
        i1O0OXO1O.OXO1.XO0O10("showSpm  " + arrayList);
        LineChart spmLineChart = getSpmLineChart();
        Intrinsics.O10IXXX0X(spmLineChart, "<get-spmLineChart>(...)");
        int i2 = (int) mMaxSpm;
        configChart$default(this, spmLineChart, ((int) mMinSpm) - 5, i2 + 5, 0, 8, null);
        getTvAvgSpmValue().setText(String.valueOf(getMWorkout().getMSpm()));
        getTvMaxSpmValue().setText(String.valueOf(i2));
        LineChart spmLineChart2 = getSpmLineChart();
        Intrinsics.O10IXXX0X(spmLineChart2, "<get-spmLineChart>(...)");
        updateChartData(spmLineChart2, arrayList, R.color.spm_color, R.drawable.shape_spm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart speedLineChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (LineChart) sportDetailChartFragment.getMView().findViewById(R.id.speedLineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View speedPanel_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.speed_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart spmLineChart_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (LineChart) sportDetailChartFragment.getMView().findViewById(R.id.spmLineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View spmPanel_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.spm_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAltitudeUnit_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.altitude_unit_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgBmpValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_avg_bpm_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgPaceValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_avg_pace_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgPressureValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_avg_pressure_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgSpeedValueTitle_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_avg_speed_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgSpeedValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_avg_speed_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgSpmValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_avg_spm_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvFastSpeedValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_fast_speed_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvHeartRateRange_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return sportDetailChartFragment.getMView().findViewById(R.id.tv_heart_rate_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMaxAltitudeValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_max_altitude_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMaxBmpValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_max_bpm_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMaxPressureValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_max_pressure_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMaxSpmValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_max_spm_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMinAltitudeValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_min_altitude_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMinPaceValue_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (TextView) sportDetailChartFragment.getMView().findViewById(R.id.tv_min_pace_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvSportAerobic_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (DINCondBold) sportDetailChartFragment.getMView().findViewById(R.id.sportRecordAerobic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvSportAnaerobic_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (DINCondBold) sportDetailChartFragment.getMView().findViewById(R.id.sportRecordAnaerobic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvSportFatBurning_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (DINCondBold) sportDetailChartFragment.getMView().findViewById(R.id.sportRecordFatBurning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvSportStrenuous_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (DINCondBold) sportDetailChartFragment.getMView().findViewById(R.id.sportRecordStrenuous);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvSportWarmUp_delegate$lambda$0(SportDetailChartFragment sportDetailChartFragment) {
        return (DINCondBold) sportDetailChartFragment.getMView().findViewById(R.id.sportRecordWarmUp);
    }

    public final LineChart getAltitudeLineChart() {
        return (LineChart) this.altitudeLineChart$delegate.getValue();
    }

    public final View getAltitudePanel() {
        return (View) this.altitudePanel$delegate.getValue();
    }

    public final LineChart getHrLineChart() {
        return (LineChart) this.hrLineChart$delegate.getValue();
    }

    public final View getHrPanel() {
        return (View) this.hrPanel$delegate.getValue();
    }

    public final PieChart getHrPieChart() {
        return (PieChart) this.hrPieChart$delegate.getValue();
    }

    public final boolean getLeftAxisGridDashedLine() {
        return this.leftAxisGridDashedLine;
    }

    public final View getLlHeartRateRange() {
        return (View) this.llHeartRateRange$delegate.getValue();
    }

    public final float getMChartXStartIndex() {
        return ((Number) this.mChartXStartIndex$delegate.getValue()).floatValue();
    }

    public final long getMEndTime() {
        return this.mEndTime;
    }

    @aa1
    public final LocationDao getMLocationDao() {
        return (LocationDao) this.mLocationDao$delegate.getValue();
    }

    public final long getMStartTime() {
        return this.mStartTime;
    }

    @aa1
    public final Workout getMWorkout() {
        Workout workout = this.mWorkout;
        if (workout != null) {
            return workout;
        }
        Intrinsics.XXO("mWorkout");
        return null;
    }

    public final LineChart getPaceLineChart() {
        return (LineChart) this.paceLineChart$delegate.getValue();
    }

    public final View getPacePanel() {
        return (View) this.pacePanel$delegate.getValue();
    }

    public final LineChart getPressureLineChart() {
        return (LineChart) this.pressureLineChart$delegate.getValue();
    }

    public final View getPressurePanel() {
        return (View) this.pressurePanel$delegate.getValue();
    }

    public final NestedScrollView getRootView() {
        return (NestedScrollView) this.rootView$delegate.getValue();
    }

    public final LineChart getSpeedLineChart() {
        return (LineChart) this.speedLineChart$delegate.getValue();
    }

    public final View getSpeedPanel() {
        return (View) this.speedPanel$delegate.getValue();
    }

    public final LineChart getSpmLineChart() {
        return (LineChart) this.spmLineChart$delegate.getValue();
    }

    public final View getSpmPanel() {
        return (View) this.spmPanel$delegate.getValue();
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final TextView getTvAltitudeUnit() {
        return (TextView) this.tvAltitudeUnit$delegate.getValue();
    }

    public final TextView getTvAvgBmpValue() {
        return (TextView) this.tvAvgBmpValue$delegate.getValue();
    }

    public final TextView getTvAvgPaceValue() {
        return (TextView) this.tvAvgPaceValue$delegate.getValue();
    }

    public final TextView getTvAvgPressureValue() {
        return (TextView) this.tvAvgPressureValue$delegate.getValue();
    }

    public final TextView getTvAvgSpeedValue() {
        return (TextView) this.tvAvgSpeedValue$delegate.getValue();
    }

    public final TextView getTvAvgSpeedValueTitle() {
        return (TextView) this.tvAvgSpeedValueTitle$delegate.getValue();
    }

    public final TextView getTvAvgSpmValue() {
        return (TextView) this.tvAvgSpmValue$delegate.getValue();
    }

    public final TextView getTvFastSpeedValue() {
        return (TextView) this.tvFastSpeedValue$delegate.getValue();
    }

    public final View getTvHeartRateRange() {
        return (View) this.tvHeartRateRange$delegate.getValue();
    }

    public final TextView getTvMaxAltitudeValue() {
        return (TextView) this.tvMaxAltitudeValue$delegate.getValue();
    }

    public final TextView getTvMaxBmpValue() {
        return (TextView) this.tvMaxBmpValue$delegate.getValue();
    }

    public final TextView getTvMaxPressureValue() {
        return (TextView) this.tvMaxPressureValue$delegate.getValue();
    }

    public final TextView getTvMaxSpmValue() {
        return (TextView) this.tvMaxSpmValue$delegate.getValue();
    }

    public final TextView getTvMinAltitudeValue() {
        return (TextView) this.tvMinAltitudeValue$delegate.getValue();
    }

    public final TextView getTvMinPaceValue() {
        return (TextView) this.tvMinPaceValue$delegate.getValue();
    }

    public final DINCondBold getTvSportAerobic() {
        return (DINCondBold) this.tvSportAerobic$delegate.getValue();
    }

    public final DINCondBold getTvSportAnaerobic() {
        return (DINCondBold) this.tvSportAnaerobic$delegate.getValue();
    }

    public final DINCondBold getTvSportFatBurning() {
        return (DINCondBold) this.tvSportFatBurning$delegate.getValue();
    }

    public final DINCondBold getTvSportStrenuous() {
        return (DINCondBold) this.tvSportStrenuous$delegate.getValue();
    }

    public final DINCondBold getTvSportWarmUp() {
        return (DINCondBold) this.tvSportWarmUp$delegate.getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        LogUtils.m11130i(this.TAG + " initView");
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        setMWorkout((Workout) mArg3);
        LogUtils.m11130i("mWorkout" + getMWorkout());
        o65 o65Var = o65.OXO1;
        this.mStartTime = o65Var.OIX0iXi(getMWorkout().getMStart());
        this.mEndTime = o65Var.OIX0iXi(getMWorkout().getMEnd()) + ((long) 60000);
        if (getMWorkout().getMType() == 1) {
            newDrawChart();
        } else {
            oldDrawChart();
        }
    }

    public final boolean isLocationEmpty() {
        return this.isLocationEmpty;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_chart;
    }

    public void newDrawChart() {
    }

    public final void setLeftAxisGridDashedLine(boolean z) {
        this.leftAxisGridDashedLine = z;
    }

    public final void setLocationEmpty(boolean z) {
        this.isLocationEmpty = z;
    }

    public final void setMEndTime(long j) {
        this.mEndTime = j;
    }

    public final void setMStartTime(long j) {
        this.mStartTime = j;
    }

    public final void setMWorkout(@aa1 Workout workout) {
        Intrinsics.X0O(workout, "<set-?>");
        this.mWorkout = workout;
    }

    public void setSportText(long j, long j2, long j3, long j4, long j5) {
        long j6 = 1000;
        long j7 = 60;
        long j8 = (j / j6) / j7;
        long j9 = (j2 / j6) / j7;
        long j10 = (j3 / j6) / j7;
        long j11 = (j4 / j6) / j7;
        long j12 = (j5 / j6) / j7;
        getTvSportStrenuous().setText(String.valueOf(j8));
        getTvSportAnaerobic().setText(String.valueOf(j9));
        getTvSportAerobic().setText(String.valueOf(j10));
        getTvSportFatBurning().setText(String.valueOf(j11));
        getTvSportWarmUp().setText(String.valueOf(j12));
        ArrayList arrayList = new ArrayList();
        if (j8 == 0 && j9 == 0 && j10 == 0 && j11 == 0 && j12 == 0) {
            arrayList.add(new PieEntry(1.0f));
            arrayList.add(new PieEntry(1.0f));
            arrayList.add(new PieEntry(1.0f));
            arrayList.add(new PieEntry(1.0f));
            arrayList.add(new PieEntry(1.0f));
        } else {
            addPieEntry(arrayList, j8);
            addPieEntry(arrayList, j9);
            addPieEntry(arrayList, j10);
            addPieEntry(arrayList, j11);
            addPieEntry(arrayList, j12);
        }
        ArrayList arrayList2 = new ArrayList();
        addColors(arrayList2, R.color.hr_scope_color_5, j8);
        addColors(arrayList2, R.color.hr_scope_color_4, j9);
        addColors(arrayList2, R.color.hr_scope_color_3, j10);
        addColors(arrayList2, R.color.hr_scope_color_2, j11);
        addColors(arrayList2, R.color.hr_scope_color_1, j12);
        PieChart hrPieChart = getHrPieChart();
        Intrinsics.O10IXXX0X(hrPieChart, "<get-hrPieChart>(...)");
        showPieChart(hrPieChart, arrayList, arrayList2);
    }

    public final void share() {
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        NestedScrollView rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        ImageUtils.save(xIi1i01O.m1250iO(rootView), uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.PNG);
    }

    public final void updateChartData(@aa1 LineChart lineChart, @aa1 List<Entry> values, int i, int i2) {
        Intrinsics.X0O(lineChart, "lineChart");
        Intrinsics.X0O(values, "values");
        LineDataSet lineDataSet = new LineDataSet(values, "");
        lineDataSet.II1(ContextCompat.getColor(getMActivity(), i));
        lineDataSet.I00(ContextCompat.getColor(getMActivity(), i));
        lineDataSet.I1XII0X(2.0f);
        lineDataSet.iXOII(1.0f);
        lineDataSet.IOI0i0I(false);
        lineDataSet.XXI(false);
        lineDataSet.O1iXiI(true);
        lineDataSet.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        Drawable drawable = ContextCompat.getDrawable(getMActivity(), i2);
        Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        lineDataSet.I0i1OXiI(drawable);
        C2305co c2305co = new C2305co(lineDataSet);
        c2305co.m1316iI(false);
        lineChart.setData(c2305co);
        if (this.leftAxisGridDashedLine) {
            YAxis axisLeft = lineChart.getAxisLeft();
            axisLeft.IIX1OXO(10.0f, 10.0f, 0.0f);
            axisLeft.iIX0i(false);
        }
        lineChart.I0IIOi(1000);
        lineChart.invalidate();
    }
}
