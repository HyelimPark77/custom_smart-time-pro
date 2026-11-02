package com.sma.smartv3.ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.layout.LayoutKt;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XI1XiOI;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at4;
import com.android.mltcode.paycertificationapi.au4;
import com.android.mltcode.paycertificationapi.bt4;
import com.android.mltcode.paycertificationapi.bu4;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ct4;
import com.android.mltcode.paycertificationapi.cu4;
import com.android.mltcode.paycertificationapi.dt4;
import com.android.mltcode.paycertificationapi.du4;
import com.android.mltcode.paycertificationapi.et4;
import com.android.mltcode.paycertificationapi.eu4;
import com.android.mltcode.paycertificationapi.ft4;
import com.android.mltcode.paycertificationapi.fu4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gt4;
import com.android.mltcode.paycertificationapi.gu4;
import com.android.mltcode.paycertificationapi.ht4;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.it4;
import com.android.mltcode.paycertificationapi.jt4;
import com.android.mltcode.paycertificationapi.kt4;
import com.android.mltcode.paycertificationapi.lt4;
import com.android.mltcode.paycertificationapi.mt4;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.nt4;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.ot4;
import com.android.mltcode.paycertificationapi.pt4;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qt4;
import com.android.mltcode.paycertificationapi.rc2;
import com.android.mltcode.paycertificationapi.rt4;
import com.android.mltcode.paycertificationapi.ss4;
import com.android.mltcode.paycertificationapi.st4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ts4;
import com.android.mltcode.paycertificationapi.tt4;
import com.android.mltcode.paycertificationapi.tv1;
import com.android.mltcode.paycertificationapi.us4;
import com.android.mltcode.paycertificationapi.ut4;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vs4;
import com.android.mltcode.paycertificationapi.vt4;
import com.android.mltcode.paycertificationapi.ws4;
import com.android.mltcode.paycertificationapi.wt4;
import com.android.mltcode.paycertificationapi.xs4;
import com.android.mltcode.paycertificationapi.xt4;
import com.android.mltcode.paycertificationapi.ys4;
import com.android.mltcode.paycertificationapi.yt4;
import com.android.mltcode.paycertificationapi.zs4;
import com.android.mltcode.paycertificationapi.zt4;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.dao.SportDataDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailChartFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1215:1\n19#2:1216\n15#2:1217\n19#2:1226\n15#2:1227\n1869#3:1218\n1869#3,2:1219\n1870#3:1221\n1869#3,2:1222\n1878#3,2:1224\n1880#3:1228\n1869#3,2:1229\n1869#3,2:1231\n1869#3,2:1233\n1869#3,2:1235\n1878#3,3:1237\n1563#3:1240\n1634#3,3:1241\n13920#4,3:1244\n*S KotlinDebug\n*F\n+ 1 SportDetailChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailChartFragment\n*L\n70#1:1216\n70#1:1217\n434#1:1226\n434#1:1227\n300#1:1218\n321#1:1219,2\n300#1:1221\n359#1:1222,2\n422#1:1224,2\n422#1:1228\n696#1:1229,2\n774#1:1231,2\n839#1:1233,2\n931#1:1235,2\n1059#1:1237,3\n1075#1:1240\n1075#1:1241,3\n1079#1:1244,3\n*E\n"})
public class SportDetailChartFragment extends BaseFragment {

    @aa1
    private final String TAG;

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
    private final Lazy rootView$delegate;

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

    public static final class OXO1 extends q4 {
        public final /* synthetic */ SportDetailChartFragment iO;

        public OXO1(SportDetailChartFragment r1) {
            this.iO = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            return cp5.Ii1iii0((int) r2, this.iO.getUserProfile().getUnit());
        }
    }

    public SportDetailChartFragment() {
        this.TAG = "SportDetailChartFragment";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new ss4(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.hrLineChart$delegate = LazyKt__LazyJVMKt.iO(new us4(this));
        this.tvAvgBmpValue$delegate = LazyKt__LazyJVMKt.iO(new gt4(this));
        this.tvMaxBmpValue$delegate = LazyKt__LazyJVMKt.iO(new st4(this));
        this.tvSportStrenuous$delegate = LazyKt__LazyJVMKt.iO(new ut4(this));
        this.tvSportAnaerobic$delegate = LazyKt__LazyJVMKt.iO(new vt4(this));
        this.tvSportAerobic$delegate = LazyKt__LazyJVMKt.iO(new wt4(this));
        this.tvSportFatBurning$delegate = LazyKt__LazyJVMKt.iO(new xt4(this));
        this.tvSportWarmUp$delegate = LazyKt__LazyJVMKt.iO(new yt4(this));
        this.hrPieChart$delegate = LazyKt__LazyJVMKt.iO(new au4(this));
        this.hrPanel$delegate = LazyKt__LazyJVMKt.iO(new dt4(this));
        this.tvHeartRateRange$delegate = LazyKt__LazyJVMKt.iO(new ot4(this));
        this.llHeartRateRange$delegate = LazyKt__LazyJVMKt.iO(new zt4(this));
        this.paceLineChart$delegate = LazyKt__LazyJVMKt.iO(new bu4(this));
        this.tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.iO(new cu4(this));
        this.tvMinPaceValue$delegate = LazyKt__LazyJVMKt.iO(new du4(this));
        this.pacePanel$delegate = LazyKt__LazyJVMKt.iO(new eu4(this));
        this.spmLineChart$delegate = LazyKt__LazyJVMKt.iO(new fu4(this));
        this.tvAvgSpmValue$delegate = LazyKt__LazyJVMKt.iO(new gu4(this));
        this.tvMaxSpmValue$delegate = LazyKt__LazyJVMKt.iO(new ts4(this));
        this.spmPanel$delegate = LazyKt__LazyJVMKt.iO(new vs4(this));
        this.speedLineChart$delegate = LazyKt__LazyJVMKt.iO(new ws4(this));
        this.tvAvgSpeedValue$delegate = LazyKt__LazyJVMKt.iO(new xs4(this));
        this.tvFastSpeedValue$delegate = LazyKt__LazyJVMKt.iO(new ys4(this));
        this.speedPanel$delegate = LazyKt__LazyJVMKt.iO(new zs4(this));
        this.tvAvgSpeedValueTitle$delegate = LazyKt__LazyJVMKt.iO(new at4(this));
        this.altitudeLineChart$delegate = LazyKt__LazyJVMKt.iO(new bt4(this));
        this.tvMinAltitudeValue$delegate = LazyKt__LazyJVMKt.iO(new ct4(this));
        this.tvMaxAltitudeValue$delegate = LazyKt__LazyJVMKt.iO(new et4(this));
        this.altitudePanel$delegate = LazyKt__LazyJVMKt.iO(new ft4(this));
        this.tvAltitudeUnit$delegate = LazyKt__LazyJVMKt.iO(new ht4(this));
        this.pressureLineChart$delegate = LazyKt__LazyJVMKt.iO(new it4(this));
        this.tvAvgPressureValue$delegate = LazyKt__LazyJVMKt.iO(new jt4(this));
        this.tvMaxPressureValue$delegate = LazyKt__LazyJVMKt.iO(new kt4(this));
        this.pressurePanel$delegate = LazyKt__LazyJVMKt.iO(new lt4(this));
        this.mSportDataDao$delegate = LazyKt__LazyJVMKt.iO(new mt4());
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new nt4());
        this.mHeartRateDao$delegate = LazyKt__LazyJVMKt.iO(new pt4());
        this.mActivityDao$delegate = LazyKt__LazyJVMKt.iO(new qt4());
        this.mPressureDao$delegate = LazyKt__LazyJVMKt.iO(new rt4());
        this.isLocationEmpty = true;
        this.mChartXStartIndex$delegate = LazyKt__LazyJVMKt.iO(new tt4(this));
    }

    public static /* synthetic */ DINCondBold I0IIOi(SportDetailChartFragment r0) {
        return tvSportAnaerobic_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View I0iXXO(SportDetailChartFragment r0) {
        return speedPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(SportDetailChartFragment r0) {
        return tvMaxPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View I1XOi1(SportDetailChartFragment r0) {
        return hrPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(SportDetailChartFragment r0) {
        return tvAltitudeUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart IIX1OXO(SportDetailChartFragment r0) {
        return altitudeLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart IO(SportDetailChartFragment r0) {
        return paceLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart IXXOO(SportDetailChartFragment r0) {
        return hrLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IiI10X(SportDetailChartFragment r0) {
        return tvFastSpeedValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LocationDao O00() {
        return mLocationDao_delegate$lambda$0();
    }

    public static /* synthetic */ HeartRateDao O10IXXX0X() {
        return mHeartRateDao_delegate$lambda$0();
    }

    public static /* synthetic */ View O1O(SportDetailChartFragment r0) {
        return pacePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart OII(SportDetailChartFragment r0) {
        return speedLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView OIX0iXi(SportDetailChartFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIi0(SportDetailChartFragment r0) {
        return tvAvgPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OX(SportDetailChartFragment r0) {
        return spmPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold OiIIX101O(SportDetailChartFragment r0) {
        return tvSportWarmUp_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(SportDetailChartFragment r0) {
        return tvAvgSpmValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(SportDetailChartFragment r0) {
        return tvAvgSpeedValueTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PieChart X0i1O(SportDetailChartFragment r0) {
        return hrPieChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X11iII1O1(SportDetailChartFragment r0) {
        return tvMinAltitudeValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1IX(SportDetailChartFragment r0) {
        return tvHeartRateRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart X1ii(SportDetailChartFragment r0) {
        return spmLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PressureDao XIi00iiXO() {
        return mPressureDao_delegate$lambda$0();
    }

    public static /* synthetic */ TextView XO0O10(SportDetailChartFragment r0) {
        return tvMinPaceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XOO0ii0(SportDetailChartFragment r0) {
        return pressurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XX0(SportDetailChartFragment r0) {
        return llHeartRateRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(SportDetailChartFragment r0) {
        return tvAvgPaceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart XXIIO1i11(SportDetailChartFragment r0) {
        return pressureLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXX11i(SportDetailChartFragment r0) {
        return tvAvgBmpValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(SportDetailChartFragment r0) {
        return tvMaxBmpValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XiOIii1(SportDetailChartFragment r0) {
        return tvSportAerobic_delegate$lambda$0(r0);
    }

    private final void addColors(List<Integer> r2, int r3, float r4) {
        if (r4 <= 0.0f) goto L6;
        r2.add(Integer.valueOf(getResources().getColor(r3)));
        return;
    }

    private final void addPieEntry(List<PieEntry> r3, float r4) {
        LogUtils.i(new Object[]{"addPieEntry " + r4});
        if (r4 > 0.0f) goto L6;
        r4 = 1.0f;
    L6:
        r3.add(new PieEntry(r4));
    }

    private static final LineChart altitudeLineChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.altitudeLineChart);
    }

    private static final View altitudePanel_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.altitude_panel);
    }

    private final void configChart(LineChart r18, int r19, int r20, int r21) {
        long r4 = 1000;
        long r6 = 60;
        long r2 = ((this.mEndTime - this.mStartTime) / r4) / r6;
        iO1Xi1X1i r8 = iO1Xi1X1i.OXO1;
        r8.XIi00iiXO(r18);
        r18.setTouchEnabled(false);
        r18.getDescription().XOO0ii0(false);
        r18.getLegend().XOO0ii0(false);
        r18.getAxisLeft().XO0X10iO(false);
        r18.getAxisLeft().iOiXi11II(r20);
        r18.getAxisLeft().i0X000X0O(r19);
        r18.getAxisLeft().XX1Oi(gk4.iO(getMActivity(), R.color.line_color));
        r18.getAxisLeft().I0IIOi(gk4.iO(getMActivity(), R.color.line_color));
        r18.getAxisLeft().iI0I(true);
        r18.getAxisRight().X00Xi1X(false);
        r18.getAxisRight().XO0X10iO(false);
        r18.getAxisRight().Ii0X0X(false);
        XAxis r10 = r18.getXAxis();
        Intrinsics.XXI(r10);
        Context r1 = r18.getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        r8.OIi0(r10, false, r1);
        r10.i0X000X0O(0.0f);
        r10.IXOIIIO(1.0f);
        r10.iOiXi11II(r2);
        SimpleDateFormat r3 = O0X11OiO.IXI(false, 1, null);
        ArrayList r9 = new ArrayList();
        long r11 = 0;
        if (0 <= r2) goto L5;
    L11:
        r10.Oi(new q4(r9));
        return;
    L5:
        if (this.leftAxisGridDashedLine == false) goto L7;
        r9.add(String.valueOf(r11));
    L9:
        if (r11 == r2) goto L11;
        r11 = r11 + 1;
        goto L5
    L7:
        String r12 = TimeUtils.millis2String(this.mStartTime + ((r11 * r6) * r4), r3);
        Intrinsics.O10IXXX0X(r12, "millis2String(...)");
        r9.add(r12);
        goto L9
    }

    public static /* synthetic */ void configChart$default(SportDetailChartFragment r0, LineChart r1, int r2, int r3, int r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 8) == 0) goto L6;
        r4 = 0;
    L6:
        r0.configChart(r1, r2, r3, r4);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configChart");
    }

    private final int getAge(String r2) {
        int r3 = O0X11OiO.OXO1(r2);
        if (r3 >= 16) goto L6;
        return 16;
    L6:
        if (r3 <= 60) goto L8;
        return 60;
    L8:
        return r3;
    }

    private final float getAvg(float r5, float r6, float r7) {
        if (r5 <= 0.0f) goto L5;
        float r1 = r5;
    L7:
        if (rc2.I0IIOi(1.0f, r5).contains(Float.valueOf(r7)) == false) goto L10;
        return r7;
    L10:
        if (r6 > 0.0f) goto L12;
    L14:
        return r1;
    L12:
        if (r5 >= r6) goto L14;
        return r6;
    L5:
        r1 = 0.0f;
        goto L7
    }

    private final ActivityDao getMActivityDao() {
        return (ActivityDao) getValue();
    }

    private final HeartRateDao getMHeartRateDao() {
        return (HeartRateDao) getValue();
    }

    private final PressureDao getMPressureDao() {
        return (PressureDao) getValue();
    }

    private final SportDataDao getMSportDataDao() {
        return (SportDataDao) getValue();
    }

    private final List<SportData> getNewSportDataList(List<Location> r29, List<Activity> r30) {
        int r1 = 0;
        if (r29.isEmpty() == false) goto L5;
    L9:
        boolean r0 = true;
    L10:
        this.isLocationEmpty = r0;
        LogUtils.i(new Object[]{"getSportDataList isLocationEmpty " + r0});
        ArrayList r2 = new ArrayList();
        if (r30.isEmpty() == true) goto L13;
        Object r3 = CollectionsKt___CollectionsKt.IIII0iI(r30);
    L14:
        Iterator<T> r4 = r30.iterator();
    L16:
        if (r4.hasNext() == false) goto L26;
        Activity r5 = (Activity) r4.next();
        if (r1 == 0) goto L25;
        int r6 = r5.getMStep();
        Intrinsics.XXI(r3);
        Activity r7 = (Activity) r3;
        int r8 = r6 - r7.getMStep();
        int r9 = ((int) (r5.getMTime() - r7.getMTime())) / 1000;
        int r10 = (r5.getMDistance() - r7.getMDistance()) / 10000;
        SportData r11 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
        r11.setMStep(r8);
        r11.setMDistance(r10);
        String r12 = TimeUtils.millis2String(r5.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r12, "millis2String(...)");
        r11.setMLocalTime(r12);
        r11.setMDuration(r9);
        o65 r13 = o65.OXO1;
        r11.setMSpm(r13.IO(r11.getMStep(), r11.getMDuration()));
        r11.setMPace(r13.XIi00iiXO(r11.getMDuration(), r11.getMDistance()));
        r11.setMSpeed(r13.iO(r11.getMDistance(), r11.getMDuration()));
        if (r11.getMDuration() > 0) goto L22;
    L24:
        i1O0OXO1O.OXO1.XO0O10("getSportDataList sportData " + r11);
        goto L25
    L22:
        if (r11.getMDistance() <= 0) goto L24;
        r2.add(r11);
    L25:
        r1 = r1 + 1;
        r3 = r5;
        goto L16
    L26:
        i1O0OXO1O.OXO1.XO0O10("getSportDataList sportDataList2 " + r2);
        return r2;
    L13:
        r3 = null;
        goto L14
    L5:
        if (r29.size() < 2) goto L9;
        r0 = false;
        goto L10
    }

    private final float getRandom(float r5, float r6) {
        if (r6 != 0.0f) goto L6;
    L16:
        return 0.0f;
    L6:
        if (r5 == 0.0f) goto L16;
        if (r6 >= 10000.0f) goto L16;
        float r1 = (r6 + r5) / 2;
        float r7 = (r6 - r5) / 3;
        float r3 = 1;
        return Random.Default.nextInt((int) ((r1 - r7) - r3), (int) ((r1 + r7) + r3));
    L14:
        e = move-exception;
        e.printStackTrace();
        goto L16
    }

    private final List<SportData> getSportDataList(List<Location> r43, List<Activity> r44) {
        int r2 = 0;
        if (r43.isEmpty() == false) goto L5;
    L9:
        boolean r1 = true;
    L10:
        this.isLocationEmpty = r1;
        LogUtils.i(new Object[]{"getSportDataList isLocationEmpty " + r1});
        ArrayList r3 = new ArrayList();
        if (r44.isEmpty() == true) goto L13;
        Object r4 = CollectionsKt___CollectionsKt.IIII0iI(r44);
    L14:
        i1O0OXO1O.OXO1.XO0O10("getSportDataList Activity " + r44);
        long r6 = getMWorkout().getMStart();
        long r12 = (long) 60000;
        long r8 = ProgressionUtilKt.XO0O10(r6, getMWorkout().getMEnd() + r12, 60000);
        if (r6 > r8) goto L40;
    L16:
        Iterator r5 = r44.iterator();
    L18:
        if (r5.hasNext() == false) goto L37;
        Activity r10 = (Activity) r5.next();
        long r14 = 1 + r6;
        long r16 = r6 + r12;
        long r18 = r10.getMTime();
        if (r14 <= r18) goto L22;
    L35:
        r5 = r5;
        r6 = r6;
        r2 = r2;
    L36:
        r5 = r5;
        r6 = r6;
        goto L18
    L22:
        if (r18 > r16) goto L35;
        if (r2 == 0) goto L34;
        int r11 = r10.getMStep();
        Intrinsics.XXI(r4);
        Activity r7 = (Activity) r4;
        int r13 = r11 - r7.getMStep();
        int r9 = ((int) (r10.getMTime() - r7.getMTime())) / 1000;
        int r15 = (r10.getMDistance() - r7.getMDistance()) / 10000;
        SportData r23 = new SportData(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
        r23.setMStep(r13);
        r23.setMTime(r6);
        r23.setMDistance(r15);
        String r17 = TimeUtils.millis2String(r10.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r17, "millis2String(...)");
        r23.setMLocalTime(r17);
        r23.setMDuration(r9);
        o65 r19 = o65.OXO1;
        r23.setMSpm(r19.IO(r23.getMStep(), r23.getMDuration()));
        r23.setMPace(r19.XIi00iiXO(r23.getMDuration(), r23.getMDistance()));
        r23.setMSpeed(r19.iO(r23.getMDistance(), r23.getMDuration()));
        r3.add(r23);
        Iterator<T> r20 = r43.iterator();
    L26:
        if (r20.hasNext() == false) goto L32;
        Location r21 = (Location) r20.next();
        long r22 = r21.getMTime();
        if (r14 > r22) goto L26;
        if (r22 > r16) goto L26;
        r23.setMAltitude(r21.getMAltitude());
        goto L26
    L32:
        i1O0OXO1O.OXO1.XO0O10("getSportDataList sportData " + r23);
    L34:
        r2 = r2 + 1;
        r4 = r10;
        goto L36
    L37:
        int r24 = r2;
        long r110 = r6;
        if (r110 == r8) goto L40;
        r6 = r110 + 60000;
        r2 = r24;
    L40:
        i1O0OXO1O.OXO1.XO0O10("getSportDataList sportDataList " + r3);
        return r3;
    L13:
        r4 = null;
        goto L14
    L5:
        if (r43.size() < 2) goto L9;
        r1 = false;
        goto L10
    }

    private static final LineChart hrLineChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.hrLineChart);
    }

    private static final View hrPanel_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.hr_panel);
    }

    private static final PieChart hrPieChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (PieChart) r1.getMView().findViewById(R.id.hrPieChart);
    }

    public static /* synthetic */ DINCondBold i010I(SportDetailChartFragment r0) {
        return tvSportFatBurning_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ActivityDao iI() {
        return mActivityDao_delegate$lambda$0();
    }

    public static /* synthetic */ SportDataDao iIXi1iiXI() {
        return mSportDataDao_delegate$lambda$0();
    }

    public static /* synthetic */ TextView iIiiO(SportDetailChartFragment r0) {
        return tvMaxSpmValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iO(SportDetailChartFragment r0) {
        return tvAvgSpeedValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ float iOO1ii1(SportDetailChartFragment r0) {
        return mChartXStartIndex_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOOX010X(SportDetailChartFragment r0) {
        return tvSportStrenuous_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX(SportDetailChartFragment r0) {
        return altitudePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX1O1(SportDetailChartFragment r0) {
        return tvMaxAltitudeValue_delegate$lambda$0(r0);
    }

    private final boolean isSupportStep() {
        hu4 r0 = hu4.OXO1;
        if (r0.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L11;
        if (r0.IiI10X(getMWorkout().getMMode()) == true) goto L7;
    L9:
        return false;
    L7:
        if (r0.X1ii(getMWorkout().getMMode()) == false) goto L9;
        return true;
    L11:
        if (q62.OXO1.O1XXXX(getMWorkout().getMMode()) == true) goto L13;
    L15:
        return false;
    L13:
        if (r0.X1ii(getMWorkout().getMMode()) == false) goto L15;
        return true;
    }

    private static final View llHeartRateRange_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.ll_heart_rate_range);
    }

    private static final ActivityDao mActivityDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().activityDao();
    }

    private static final float mChartXStartIndex_delegate$lambda$0(SportDetailChartFragment r0) {
        boolean r1 = r0.leftAxisGridDashedLine;
        return 0.0f;
    }

    private static final HeartRateDao mHeartRateDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private static final PressureDao mPressureDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().pressureDao();
    }

    private static final SportDataDao mSportDataDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().sportDataDao();
    }

    private final void oldDrawChart() {
        List<HeartRate> r0 = getMHeartRateDao().getHeartRates(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<Location> r1 = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<Activity> r2 = getMActivityDao().getListASC(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<SportData> r3 = getMSportDataDao().getSportDataASC(getMWorkout().getMStart(), getMWorkout().getMEnd());
        List<Pressure> r4 = getMPressureDao().getPressures(getMWorkout().getMStart(), getMWorkout().getMEnd());
        LogUtils.i(new Object[]{"sportDataList" + r3});
        if (r3.isEmpty() == false) goto L6;
        r3 = getSportDataList(r1, r2);
        LogUtils.i(new Object[]{"sportDataList" + r3.size()});
    L6:
        if (o65.OXO1.O00(getMWorkout()) == false) goto L8;
    L11:
        showHr(new ArrayList());
        View r5 = getHrPanel();
        if (r5 == null) goto L15;
        r5.setVisibility(8);
    L15:
        if (isSupportStep() == false) goto L17;
        showSpm(r3);
    L19:
        if (r1.isEmpty() == false) goto L21;
    L23:
        LogUtils.i(new Object[]{"sportDataList2" + r3.size()});
        hu4 r6 = hu4.OXO1;
        if (r6.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L32;
        if (r6.XIi00iiXO(getMWorkout().getMMode()) == true) goto L28;
    L30:
        getPacePanel().setVisibility(8);
    L38:
        if (r6.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L44;
        if (q62.OXO1.IXO0OOi(getMWorkout().getMMode()) == false) goto L42;
        showSpeed(r3);
    L47:
        LogUtils.i(new Object[]{"isSupportAltitude " + getMWorkout().getMMode() + " " + (!this.isLocationEmpty) + " " + r1.size()});
        if (r6.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L54;
        if (q62.OXO1.iX00X1X(getMWorkout().getMMode()) == false) goto L52;
        showAltitude(r1);
    L57:
        LogUtils.i(new Object[]{"isSupportPressure pressureList" + r4.size()});
        if (q62.OXO1.OOX(getMWorkout().getMMode()) == false) goto L61;
        showPressure(r4);
        return;
    L61:
        getPressurePanel().setVisibility(8);
        return;
    L52:
        getAltitudePanel().setVisibility(8);
        goto L57
    L54:
        if (q62.OXO1.I1XXi1Oi(getMWorkout().getMMode(), !this.isLocationEmpty) == false) goto L56;
        showAltitude(r1);
        goto L57
    L56:
        getAltitudePanel().setVisibility(8);
        goto L57
    L42:
        getSpeedPanel().setVisibility(8);
        goto L47
    L44:
        if (q62.OXO1.Oi000O010(getMWorkout().getMMode(), !this.isLocationEmpty) == false) goto L46;
        showSpeed(r3);
        goto L47
    L46:
        getSpeedPanel().setVisibility(8);
        goto L47
    L28:
        if (i72.OXO1.IIO11() == false) goto L30;
        showPace(r3);
        goto L38
    L32:
        if (q62.OXO1.Oi000O010(getMWorkout().getMMode(), !this.isLocationEmpty) == true) goto L34;
    L36:
        getPacePanel().setVisibility(8);
        goto L38
    L34:
        if (i72.OXO1.IIO11() == false) goto L36;
        showPace(r3);
        goto L38
    L21:
        if (getMWorkout().getMMode() != 10) goto L23;
        r3 = cp5.OII(r1, 0, 2, null);
        goto L23
    L17:
        getSpmPanel().setVisibility(8);
        goto L19
    L8:
        if (q62.OXO1.OiXI1OiX0() == true) goto L11;
        showHr(r0);
        goto L15
    }

    private final Pair<List<Entry>, Integer> optimizationInterfaceData(List<Entry> r5, int r6, int r7, int r8) {
        ArrayList r0 = new ArrayList();
        if (1 > r6) goto L18;
        if (r6 >= r8) goto L18;
        int r9 = r8 - r6;
        Iterator<T> r10 = r5.iterator();
    L7:
        if (r10.hasNext() == false) goto L12;
        Entry r11 = (Entry) r10.next();
        float r1 = r11.O00() - r9;
        if (r1 > 0.0f) goto L10;
        r0.add(new Entry(r11.OIX0iXi(), 0.0f));
        goto L7
    L10:
        r0.add(new Entry(r11.OIX0iXi(), r1));
        goto L7
    L12:
        if (r7 >= r9) goto L16;
        return new Pair(r0, 0);
    L16:
        return new Pair(r0, Integer.valueOf(r7 - r9));
    L18:
        return new Pair(r0, Integer.valueOf(r7));
    }

    private static final LineChart paceLineChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.paceLineChart);
    }

    private static final View pacePanel_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.pace_panel);
    }

    private static final LineChart pressureLineChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.pressureLineChart);
    }

    private static final View pressurePanel_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.pressure_panel);
    }

    private static final NestedScrollView rootView_delegate$lambda$0(SportDetailChartFragment r1) {
        return (NestedScrollView) r1.getMView().findViewById(R.id.root_view);
    }

    public static /* synthetic */ void setSportText$default(SportDetailChartFragment r2, long r3, long r5, long r7, long r9, long r11, int r13, Object r14) {
        if (r14 != null) goto L21;
        if ((r13 & 1) == 0) goto L7;
        r3 = 0;
    L7:
        if ((r13 & 2) == 0) goto L10;
        r5 = 0;
    L10:
        if ((r13 & 4) == 0) goto L13;
        r7 = 0;
    L13:
        if ((r13 & 8) == 0) goto L16;
        r9 = 0;
    L16:
        if ((r13 & 16) == 0) goto L18;
        r11 = 0;
    L18:
        r2.setSportText(r3, r5, r7, r9, r11);
        return;
    L21:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSportText");
    }

    private final void showAltitude(List<Location> r13) {
        LinkedHashMap r0 = new LinkedHashMap();
        long r1 = this.mStartTime;
        long r3 = ProgressionUtilKt.XO0O10(r1, this.mEndTime, 60000);
        if (r1 > r3) goto L7;
    L4:
        r0.put(Long.valueOf(r1), new nr0(0, 0, null, 4, null));
        if (r1 == r3) goto L7;
        r1 = r1 + 60000;
    L7:
        Iterator<Location> r14 = r13.iterator();
    L9:
        if (r14.hasNext() == false) goto L16;
        Location r2 = r14.next();
        Iterator r4 = r0.entrySet().iterator();
    L12:
        if (r4.hasNext() == false) goto L9;
        Map.Entry r5 = (Map.Entry) r4.next();
        long r6 = ((Number) r5.getKey()).longValue();
        nr0 r7 = (nr0) r5.getValue();
        if (o65.OXO1.OIX0iXi(r2.getMTime()) > r6) goto L12;
        r7.OIX0iXi(r7.I0IIOi() + r2.getMAltitude());
        r7.OIi0(r7.IiI10X() + 1);
        goto L9
    L16:
        ArrayList r15 = new ArrayList();
        float r8 = getMChartXStartIndex();
        Iterator r9 = r0.entrySet().iterator();
        int r10 = 0;
        int r11 = 0;
        float r12 = -1.0f;
        float r16 = -1.0f;
    L18:
        if (r9.hasNext() == false) goto L30;
        nr0 r17 = (nr0) ((Map.Entry) r9.next()).getValue();
        if (r17.IiI10X() == 0) goto L29;
        if (r17.I0IIOi() == 0) goto L29;
        int r18 = r17.I0IIOi() / r17.IiI10X();
        r15.add(new Entry(r8, r18));
        if (r10 >= r18) goto L26;
        r12 = r12 + 1.0f;
        r10 = r18;
    L26:
        if (r11 == 0) goto L28;
        if (r11 <= r18) goto L29;
    L28:
        r16 = r16 + 1.0f;
        r11 = r18;
    L29:
        r8 = r8 + 1.0f;
        goto L18
    L30:
        i1O0OXO1O.OXO1.XO0O10("showAltitude" + r15);
    L36:
        e = move-exception;
        e.printStackTrace();
    L45:
        LineChart r19 = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(r19, "<get-altitudeLineChart>(...)");
        configChart$default(this, r19, Math.min(r11, getMWorkout().getMMinAltitude()), Math.max(r10, getMWorkout().getMMaxAltitude()) + 5, 0, 8, null);
        LineChart r20 = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(r20, "<get-altitudeLineChart>(...)");
        updateChartData(r20, r15, R.color.altitude_color, R.drawable.shape_altitude);
        LogUtils.i(new Object[]{"showAltitude2" + getMWorkout().getMMaxAltitude() + " //" + getMWorkout().getMMinAltitude() + " "});
        LogUtils.i(new Object[]{"showAltitude3 " + r10 + " //" + r11 + " "});
        TextView r110 = getTvAltitudeUnit();
        if (this.userProfile.getUnit() != 0) goto L48;
        String r21 = getString(R.string.altitude_unit);
    L49:
        r110.setText(r21);
        if (getMWorkout().getMMaxAltitude() != 0) goto L54;
        if (getMWorkout().getMMinAltitude() != 0) goto L54;
    L59:
        getTvMaxAltitudeValue().setText(cp5.iXiX011(r10, this.userProfile.getUnit()));
        getTvMinAltitudeValue().setText(cp5.iXiX011(r11, this.userProfile.getUnit()));
        return;
    L54:
        if (getMWorkout().getMMaxAltitude() > 10000) goto L59;
        if (getMWorkout().getMMaxAltitude() < (-10000)) goto L59;
        getTvMaxAltitudeValue().setText(cp5.iXiX011(getMWorkout().getMMaxAltitude(), this.userProfile.getUnit()));
        getTvMinAltitudeValue().setText(cp5.iXiX011(getMWorkout().getMMinAltitude(), this.userProfile.getUnit()));
        return;
    L48:
        r21 = getString(R.string.yd);
        goto L49
    L32:
        if (getMWorkout().getMMaxAltitude() <= r10) goto L39;
        if (r12 <= (-1.0f)) goto L39;
        r15.get((int) r12).I0IIOi(getMWorkout().getMMaxAltitude());     // Catch: Exception -> L36
    L39:
        if (getMWorkout().getMMinAltitude() >= r11) goto L45;
        if (r16 <= (-1.0f)) goto L45;
        r15.get((int) r16).I0IIOi(getMWorkout().getMMinAltitude());     // Catch: Exception -> L36
        goto L45
    }

    private final void showHr(List<HeartRate> r57) {
        LinkedHashMap r2 = new LinkedHashMap();
        long r3 = this.mStartTime;
        long r5 = ProgressionUtilKt.XO0O10(r3, this.mEndTime, 60000);
        if (r3 > r5) goto L7;
    L4:
        r2.put(Long.valueOf(r3), new nr0(0, 0, null, 4, null));
        if (r3 == r5) goto L7;
        r3 = r3 + 60000;
    L7:
        Iterator r4 = r57.iterator();
        long r7 = 0;
        long r9 = 0;
        long r11 = 0;
        long r13 = 0;
        long r15 = 0;
        int r6 = 0;
    L9:
        if (r4.hasNext() == false) goto L69;
        Object r8 = r4.next();
        int r10 = r6 + 1;
        if (r6 >= 0) goto L13;
        CollectionsKt__CollectionsKt.XOX0O0();
    L13:
        HeartRate r12 = (HeartRate) r8;
        Iterator r19 = r2.entrySet().iterator();
    L15:
        if (r19.hasNext() == false) goto L20;
        Map.Entry r20 = (Map.Entry) r19.next();
        long r21 = ((Number) r20.getKey()).longValue();
        LinkedHashMap r23 = r2;
        nr0 r14 = (nr0) r20.getValue();
        Iterator r22 = r4;
        long r24 = r7;
        HeartRate r16 = r12;
        if (o65.OXO1.OIX0iXi(r16.getMTime()) <= r21) goto L18;
        r12 = r16;
        r4 = r22;
        r2 = r23;
        r7 = r24;
        goto L15
    L18:
        r14.OIX0iXi(r14.I0IIOi() + r16.getMBpm());
        r14.OIi0(r14.IiI10X() + 1);
    L22:
        if (r6 < (r57.size() - 1)) goto L24;
    L34:
        r7 = r24;
    L68:
        r6 = r10;
        r4 = r22;
        r2 = r23;
        goto L9
    L24:
        if (i72.OXO1.X0100I() == false) goto L55;
        long r17 = r57.get(r10).getMTime() - r16.getMTime();
        SPUtils r18 = a01.OXO1.IiI10X();
        Object r26 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r25 = new Gson().fromJson(r18.getString(AppUser.class.getName()), AppUser.class);
        if (r25 == null) goto L29;
        r26 = r25;
    L29:
        int r27 = getAge(((AppUser) r26).getBirthday());
        float r28 = r16.getMBpm() / (220 - r27);
        LogUtils.i(new Object[]{"isSupportZoneAlgorithm" + r16.getMBpm() + " bpm " + r28 + " ", "age==" + r27});
        double r29 = (double) r28;
        if (0.5d > r29) goto L36;
        if (r29 > 0.6d) goto L36;
    L33:
        r15 = r15 + r17;
    L36:
        if (0.6d > r29) goto L41;
        if (r29 > 0.7d) goto L41;
        r13 = r13 + r17;
    L41:
        if (0.7d > r29) goto L46;
        if (r29 > 0.8d) goto L46;
        r11 = r11 + r17;
    L46:
        if (0.8d > r29) goto L51;
        if (r29 > 0.9d) goto L51;
        r9 = r9 + r17;
    L51:
        if (0.9d > r29) goto L33;
        if (r29 > 1.0d) goto L33;
        r7 = r24 + r17;
        goto L68
    L55:
        long r30 = r57.get(r10).getMTime() - r16.getMTime();
        if (r16.getMBpm() < 130) goto L59;
        r7 = r24 + r30;
        goto L68
    L59:
        if (r16.getMBpm() < 114) goto L62;
        r9 = r9 + r30;
        goto L34
    L62:
        if (r16.getMBpm() < 90) goto L65;
        r11 = r11 + r30;
        goto L34
    L65:
        if (r16.getMBpm() < 80) goto L67;
        r13 = r13 + r30;
        goto L34
    L67:
        r15 = r15 + r30;
        goto L34
    L20:
        r23 = r2;
        r22 = r4;
        r24 = r7;
        r16 = r12;
        goto L22
    L69:
        long r210 = r7;
        int r110 = 1;
        ArrayList r31 = new ArrayList();
        float r1 = getMChartXStartIndex();
        Iterator r32 = r2.entrySet().iterator();
        int r33 = 100;
        int r34 = 0;
        float r35 = -1.0f;
        int r36 = 0;
    L70:
        r32 = r32;
        if (r32.hasNext() == false) goto L85;
        nr0 r111 = (nr0) ((Map.Entry) r32.next()).getValue();
        if (r111.IiI10X() == 0) goto L84;
        if (r111.I0IIOi() == 0) goto L84;
        int r112 = r34;
        long r211 = r9;
        int r37 = (int) getAvg(r111.I0IIOi() / r111.IiI10X(), getMWorkout().getMMinBpm(), getMWorkout().getMMaxBpm());
        LogUtils.i(new Object[]{"showHr avg " + r37});
        r31.add(new Entry(r1, (float) r37));
        if (r36 >= r37) goto L79;
        r35 = r35 + 1.0f;
        r36 = r37;
    L79:
        int r38 = r110;
        if (r38 > r37) goto L83;
        if (r37 >= r33) goto L83;
        r33 = r37;
    L83:
        r1 = r1 + 1.0f;
        r110 = r38;
        r9 = r211;
        r34 = r112 + r37;
    L84:
        r1 = r1 + 1.0f;
        r110 = r110;
        r34 = r34;
        r9 = r9;
        goto L70
    L85:
        int r113 = r34;
        long r212 = r9;
        if (r31.size() == 0) goto L88;
        int r39 = r113 / r31.size();
    L88:
        i1O0OXO1O.OXO1.XO0O10("showHr values " + r31);
        if (getMWorkout().getMMaxBpm() > 0) goto L91;
    L95:
        LineChart r40 = getHrLineChart();
        Intrinsics.O10IXXX0X(r40, "<get-hrLineChart>(...)");
        int r41 = r33;
        configChart$default(this, r40, 40, Math.max(r36, getMWorkout().getMMaxBpm()) + 10, 0, 8, null);
        LineChart r42 = getHrLineChart();
        Intrinsics.O10IXXX0X(r42, "<get-hrLineChart>(...)");
        updateChartData(r42, r31, R.color.hr_color, R.drawable.shape_hr);
        TextView r43 = getTvAvgBmpValue();
        if (getMWorkout().getMMinBpm() <= 0) goto L98;
        int r44 = getMWorkout().getMMinBpm();
    L99:
        r43.setText(String.valueOf(r44));
        TextView r45 = getTvMaxBmpValue();
        if (getMWorkout().getMMaxBpm() <= 0) goto L102;
        r36 = getMWorkout().getMMaxBpm();
    L102:
        r45.setText(String.valueOf(r36));
        LogUtils.i(new Object[]{"showHr avg " + getMWorkout().getMMinBpm() + "// " + getMWorkout().getMMaxBpm()});
        if (i72.OXO1.X11() == true) goto L105;
        setSportText(r210, r212, r11, r13, r15);
        return;
    L105:
        if (getMWorkout().getMMode() != 7) goto L109;
        setSportText(r210, r212, r11, r13, r15);
        return;
    L109:
        if (getTvHeartRateRange() == null) goto L128;
        getTvHeartRateRange().setVisibility(8);
        getLlHeartRateRange().setVisibility(8);
        return;
    L128:
        return;
    L98:
        r44 = r41;
        goto L99
    L91:
        if (getMWorkout().getMMaxBpm() <= r36) goto L95;
        if (r35 <= (-1.0f)) goto L95;
        r31.get((int) r35).I0IIOi(getMWorkout().getMMaxBpm());
        goto L95
    }

    private final void showPace(List<SportData> r18) {
        LinkedHashMap r1 = new LinkedHashMap();
        long r2 = this.mStartTime;
        long r4 = ProgressionUtilKt.XO0O10(r2, this.mEndTime, 60000);
        if (r2 > r4) goto L7;
    L4:
        r1.put(Long.valueOf(r2), new nr0(0, 0, null, 4, null));
        if (r2 == r4) goto L7;
        r2 = r2 + 60000;
    L7:
        float r3 = getMWorkout().getMMaxPace();
        float r5 = getMWorkout().getMMinPace();
        ArrayList r7 = new ArrayList();
        float r6 = getMChartXStartIndex();
        float r8 = 0.0f;
        int r9 = 0;
        if (r3 != 0.0f) goto L10;
        boolean r10 = true;
    L12:
        if (r5 != 0.0f) goto L14;
        boolean r11 = true;
    L15:
        Iterator r12 = r1.entrySet().iterator();
        float r13 = 0.0f;
    L17:
        if (r12.hasNext() == false) goto L34;
        Map.Entry r14 = (Map.Entry) r12.next();
        if (r9 >= (r18.size() - 1)) goto L21;
        float r15 = r18.get(r9).getMPace();
    L22:
        float r16 = r8;
        i1O0OXO1O.OXO1.XO0O10("showPace  " + r15);
        float r17 = getAvg(r15, r5, r3);
        if (r17 != r13) goto L26;
    L30:
        r13 = getRandom(r5, r3);
        if (r13 != r16) goto L33;
    L32:
        r13 = r17;
    L33:
        r7.add(new Entry(r6, r13));
        r6 = r6 + 1.0f;
        r9 = r9 + 1;
        r8 = r16;
        goto L17
    L26:
        if (r17 == r5) goto L30;
        if (r17 != r3) goto L32;
    L21:
        r15 = r8;
        goto L22
    L34:
        float r19 = r8;
        if (r11 == false) goto L37;
        r5 = 100.0f;
    L37:
        Iterator r20 = r7.iterator();
    L39:
        if (r20.hasNext() == false) goto L51;
        Entry r21 = (Entry) r20.next();
        if (r10 == true) goto L43;
    L45:
        if (r11 == false) goto L39;
        if (r21.O00() >= r5) goto L39;
        if (r21.O00() <= r19) goto L39;
        r5 = r21.O00();
        goto L39
    L43:
        if (r21.O00() <= r3) goto L45;
        r3 = r21.O00();
        goto L45
    L51:
        i1O0OXO1O r22 = i1O0OXO1O.OXO1;
        r22.XO0O10("showPace  " + r7);
        LineChart r23 = getPaceLineChart();
        Intrinsics.O10IXXX0X(r23, "<get-paceLineChart>(...)");
        int r110 = (int) r5;
        int r111 = (int) r3;
        configChart$default(this, r23, r110 - 10, r111 + 10, 0, 8, null);
        getPaceLineChart().getAxisLeft().Oi(new OXO1(this));
        getTvAvgPaceValue().setText(cp5.Ii1iii0(r111, this.userProfile.getUnit()));
        getTvMinPaceValue().setText(cp5.Ii1iii0(r110, this.userProfile.getUnit()));
        r22.XO0O10("showPace max== " + getMWorkout().getMMaxPace() + " " + getMWorkout().getMMinPace());
        LineChart r24 = getPaceLineChart();
        Intrinsics.O10IXXX0X(r24, "<get-paceLineChart>(...)");
        updateChartData(r24, r7, R.color.pace_color, R.drawable.shape_pace);
        return;
    L14:
        r11 = false;
        goto L15
    L10:
        r10 = false;
        goto L12
    }

    private final void showPieChart(PieChart r5, List<? extends PieEntry> r6, List<Integer> r7) {
        r5.setUsePercentValues(true);
        r5.getDescription().XOO0ii0(false);
        r5.Ii1iii0(5.0f, 5.0f, 5.0f, 5.0f);
        r5.setDragDecelerationFrictionCoef(0.95f);
        r5.setDrawHoleEnabled(false);
        r5.setRotationAngle(0.0f);
        r5.getLegend().XOO0ii0(false);
        r5.setRotationEnabled(true);
        r5.X1ii(1400, XI1XiOI.O00);
        PieDataSet r0 = new PieDataSet(r6, "");
        r0.XXI(false);
        r0.I1(false);
        r0.X10i(0.0f);
        r0.I011X(r7);
        r5.setData(new tv1(r0));
        r5.iOO1ii1(null);
        r5.invalidate();
    }

    private final void showPressure(List<Pressure> r15) {
        LinkedHashMap r0 = new LinkedHashMap();
        long r1 = this.mStartTime;
        long r3 = ProgressionUtilKt.XO0O10(r1, this.mEndTime, 60000);
        if (r1 > r3) goto L7;
    L4:
        r0.put(Long.valueOf(r1), new nr0(0, 0, null, 4, null));
        if (r1 == r3) goto L7;
        r1 = r1 + 60000;
    L7:
        LogUtils.i(new Object[]{"filterDataMap " + r0.size()});
        List<Pressure> r2 = r15;
        Iterator<T> r4 = r2.iterator();
        int r5 = 0;
        int r6 = 0;
    L9:
        if (r4.hasNext() == false) goto L20;
        Object r7 = r4.next();
        int r8 = r6 + 1;
        if (r6 >= 0) goto L13;
        CollectionsKt__CollectionsKt.XOX0O0();
    L13:
        Pressure r9 = (Pressure) r7;
        Iterator r10 = r0.entrySet().iterator();
    L15:
        if (r10.hasNext() == false) goto L19;
        Map.Entry r11 = (Map.Entry) r10.next();
        long r12 = ((Number) r11.getKey()).longValue();
        nr0 r13 = (nr0) r11.getValue();
        if (o65.OXO1.OIX0iXi(r9.getMTime()) > r12) goto L15;
        r13.OIX0iXi(r13.I0IIOi() + r9.getMValue());
        r13.OIi0(r13.IiI10X() + 1);
    L19:
        r6 = r8;
        goto L9
    L20:
        ArrayList r14 = new ArrayList();
        float r16 = getMChartXStartIndex();
        if (hu4.OXO1.OiIIX101O(getMWorkout().getMPlatform()) == false) goto L30;
        o65 r17 = o65.OXO1;
        ArrayList r18 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
        Iterator<T> r19 = r2.iterator();
    L24:
        if (r19.hasNext() == false) goto L26;
        r18.add(Float.valueOf(((Pressure) r19.next()).getMValue()));
        goto L24
    L26:
        float[] r110 = r17.XOO0ii0(CollectionsKt___CollectionsKt.O1XXXX(r18), r0.size());
        int r20 = r110.length;
        int r21 = 0;
    L27:
        if (r21 >= r20) goto L29;
        r14.add(new Entry(r16, r110[r21]));
        r16 = r16 + 1.0f;
        r21 = r21 + 1;
        goto L27
    L29:
        int r22 = 0;
        float r23 = -1.0f;
    L50:
        if (r14.size() == 0) goto L53;
        r5 = r5 / r14.size();
    L53:
        if (getMWorkout().getMMaxStress() > 0) goto L55;
    L59:
        LineChart r24 = getPressureLineChart();
        Intrinsics.O10IXXX0X(r24, "<get-pressureLineChart>(...)");
        configChart$default(this, r24, 0, Math.max(r22, getMWorkout().getMMaxStress()) + 5, 0, 8, null);
        LineChart r25 = getPressureLineChart();
        Intrinsics.O10IXXX0X(r25, "<get-pressureLineChart>(...)");
        updateChartData(r25, r14, R.color.hr_color, R.drawable.shape_hr);
        TextView r111 = getTvAvgPressureValue();
        if (getMWorkout().getMAvgStress() <= 0) goto L62;
        r5 = getMWorkout().getMAvgStress();
    L62:
        r111.setText(String.valueOf(r5));
        TextView r112 = getTvMaxPressureValue();
        if (getMWorkout().getMMaxStress() <= 0) goto L65;
        r22 = getMWorkout().getMMaxStress();
    L65:
        r112.setText(String.valueOf(r22));
        return;
    L55:
        if (getMWorkout().getMMaxStress() <= r22) goto L59;
        if (r23 <= (-1.0f)) goto L59;
        r14.get((int) r23).I0IIOi(getMWorkout().getMMaxStress());
        goto L59
    L30:
        Iterator r26 = r0.entrySet().iterator();
        r22 = 0;
        int r27 = 0;
        r23 = -1.0f;
    L32:
        if (r26.hasNext() == false) goto L48;
        nr0 r113 = (nr0) ((Map.Entry) r26.next()).getValue();
        if (r113.IiI10X() == 0) goto L47;
        if (r113.I0IIOi() == 0) goto L47;
        int r114 = r15.size();
        if (1 <= r114) goto L40;
    L42:
        int r115 = r113.I0IIOi() / r113.IiI10X();
    L43:
        r14.add(new Entry(r16, r115 + (r115 / 5)));
        if (r22 >= r115) goto L46;
        r23 = r23 + 1.0f;
        r22 = r115;
    L46:
        r27 = r27 + r115;
        goto L47
    L40:
        if (r114 >= 3) goto L42;
        r115 = r15.get(0).getMValue();
    L47:
        r16 = r16 + 1.0f;
        goto L32
    L48:
        r5 = r27;
        goto L50
    }

    private final void showSpeed(List<SportData> r18) {
        LogUtils.i(new Object[]{"showSpeed====" + r18});
        LinkedHashMap r2 = new LinkedHashMap();
        long r3 = this.mStartTime;
        long r5 = ProgressionUtilKt.XO0O10(r3, this.mEndTime, 60000);
        if (r3 > r5) goto L7;
    L4:
        r2.put(Long.valueOf(r3), new nr0(0, 0, null, 4, null));
        if (r3 == r5) goto L7;
        r3 = r3 + 60000;
    L7:
        float r4 = getMWorkout().getMMaxSpeed() / 1000.0f;
        float r6 = getMWorkout().getMMinSpeed() / 1000.0f;
        float r7 = 0.0f;
        int r8 = 0;
        if (r4 != 0.0f) goto L10;
        boolean r9 = true;
    L12:
        if (r6 != 0.0f) goto L14;
        boolean r10 = true;
    L15:
        ArrayList r11 = new ArrayList();
        float r12 = getMChartXStartIndex();
        Iterator r13 = r2.entrySet().iterator();
        float r14 = 0.0f;
    L17:
        if (r13.hasNext() == false) goto L34;
        Map.Entry r15 = (Map.Entry) r13.next();
        if (r8 >= (r18.size() - 1)) goto L21;
        float r16 = r18.get(r8).getMSpeed();
    L22:
        i1O0OXO1O r17 = i1O0OXO1O.OXO1;
        StringBuilder r19 = new StringBuilder();
        float r110 = r7;
        r19.append("showSpeed");
        r19.append(r14);
        r17.XO0O10(r19.toString());
        float r20 = getAvg(r16, r6, r4);
        if (r20 != r14) goto L26;
    L30:
        r14 = getRandom(r6, r4);
        if (r14 != r110) goto L33;
    L32:
        r14 = r20;
    L33:
        r11.add(new Entry(r12, r14));
        r12 = r12 + 1.0f;
        r8 = r8 + 1;
        r7 = r110;
        goto L17
    L26:
        if (r20 == r6) goto L30;
        if (r20 != r4) goto L32;
    L21:
        r16 = r7;
        goto L22
    L34:
        float r111 = r7;
        if (r10 == true) goto L38;
    L40:
        Iterator r21 = r11.iterator();
        float r22 = r4;
        float r112 = r6;
    L42:
        if (r21.hasNext() == false) goto L57;
        Entry r23 = (Entry) r21.next();
        if (r9 == true) goto L46;
    L50:
        if (r10 == false) goto L42;
        if (r23.O00() >= r112) goto L42;
        if (r23.O00() <= r111) goto L42;
        r112 = r23.O00();
        goto L42
    L46:
        if (r23.O00() <= r22) goto L50;
        if (r23.O00() <= r111) goto L50;
        r22 = r23.O00();
        goto L50
    L57:
        if (r18.isEmpty() == true) goto L59;
        r18.size();
    L59:
        i1O0OXO1O.OXO1.XO0O10("showSpeed  " + r11);
        LineChart r1 = getSpeedLineChart();
        Intrinsics.O10IXXX0X(r1, "<get-speedLineChart>(...)");
        configChart$default(this, r1, ((int) r112) - 1, ((int) r22) + 5, 0, 8, null);
        getTvAvgSpeedValueTitle().setText(getString(R.string.min_speed));
        getTvAvgSpeedValue().setText(cp5.XXiIiX10(r112, this.userProfile.getUnit()));
        getTvFastSpeedValue().setText(cp5.XXiIiX10(r22, this.userProfile.getUnit()));
        LineChart r24 = getSpeedLineChart();
        Intrinsics.O10IXXX0X(r24, "<get-speedLineChart>(...)");
        updateChartData(r24, r11, R.color.speed_color, R.drawable.shape_speed);
        LogUtils.i(new Object[]{" minSpeed" + r112 + "  maxSpeed" + r22 + " "});
        return;
    L38:
        if (r11.isEmpty() == true) goto L40;
        r6 = ((Entry) CollectionsKt___CollectionsKt.IIII0iI(r11)).O00();
        goto L40
    L14:
        r10 = false;
        goto L15
    L10:
        r9 = false;
        goto L12
    }

    @SuppressLint({"SetTextI18n"})
    private final void showSpm(List<SportData> r15) {
        LogUtils.i(new Object[]{"showSpm" + r15});
        LinkedHashMap r0 = new LinkedHashMap();
        long r2 = this.mStartTime;
        long r4 = ProgressionUtilKt.XO0O10(r2, this.mEndTime, 60000);
        if (r2 > r4) goto L7;
    L4:
        r0.put(Long.valueOf(r2), new nr0(0, 0, null, 4, null));
        if (r2 == r4) goto L7;
        r2 = r2 + 60000;
    L7:
        float r3 = getMWorkout().getMMaxSpm();
        float r5 = getMWorkout().getMMinSpm();
        ArrayList r6 = new ArrayList();
        float r7 = getMChartXStartIndex();
        int r8 = 0;
        if (r3 != 0.0f) goto L10;
        boolean r9 = true;
    L12:
        if (r5 != 0.0f) goto L14;
        boolean r10 = true;
    L15:
        Iterator r1 = r0.entrySet().iterator();
        float r11 = 0.0f;
    L17:
        if (r1.hasNext() == false) goto L34;
        Map.Entry r12 = (Map.Entry) r1.next();
        if (r8 >= (r15.size() - 1)) goto L21;
        float r13 = r15.get(r8).getMStep();
    L22:
        float r14 = getAvg(r13, r5, r3);
        if (r14 != r11) goto L26;
    L30:
        r11 = getRandom(r5, r3);
        if (r11 != 0.0f) goto L33;
    L32:
        r11 = r14;
    L33:
        i1O0OXO1O.OXO1.XO0O10("showSpm" + r11);
        r6.add(new Entry(r7, r11));
        r7 = r7 + 1.0f;
        r8 = r8 + 1;
        goto L17
    L26:
        if (r14 == r5) goto L30;
        if (r14 != r3) goto L32;
    L21:
        r13 = 0.0f;
        goto L22
    L34:
        if (r10 == false) goto L36;
        r5 = 100.0f;
    L36:
        Iterator r16 = r6.iterator();
    L38:
        if (r16.hasNext() == false) goto L50;
        Entry r17 = (Entry) r16.next();
        r17.O00();
        if (r9 == true) goto L42;
    L44:
        if (r10 == false) goto L38;
        if (r17.O00() >= r5) goto L38;
        if (r17.O00() <= 0.0f) goto L38;
        r5 = r17.O00();
        goto L38
    L42:
        if (r17.O00() <= r3) goto L44;
        r3 = r17.O00();
        goto L44
    L50:
        i1O0OXO1O.OXO1.XO0O10("showSpm  " + r6);
        LineChart r18 = getSpmLineChart();
        Intrinsics.O10IXXX0X(r18, "<get-spmLineChart>(...)");
        int r19 = (int) r3;
        configChart$default(this, r18, ((int) r5) + (-5), r19 + 5, 0, 8, null);
        getTvAvgSpmValue().setText(String.valueOf(getMWorkout().getMSpm()));
        getTvMaxSpmValue().setText(String.valueOf(r19));
        LineChart r20 = getSpmLineChart();
        Intrinsics.O10IXXX0X(r20, "<get-spmLineChart>(...)");
        updateChartData(r20, r6, R.color.spm_color, R.drawable.shape_spm);
        return;
    L14:
        r10 = false;
        goto L15
    L10:
        r9 = false;
        goto L12
    }

    private static final LineChart speedLineChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.speedLineChart);
    }

    private static final View speedPanel_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.speed_panel);
    }

    private static final LineChart spmLineChart_delegate$lambda$0(SportDetailChartFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.spmLineChart);
    }

    private static final View spmPanel_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.spm_panel);
    }

    private static final TextView tvAltitudeUnit_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.altitude_unit_tv);
    }

    private static final TextView tvAvgBmpValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_bpm_value);
    }

    private static final TextView tvAvgPaceValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_pace_value);
    }

    private static final TextView tvAvgPressureValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_pressure_value);
    }

    private static final TextView tvAvgSpeedValueTitle_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_speed_title);
    }

    private static final TextView tvAvgSpeedValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_speed_value);
    }

    private static final TextView tvAvgSpmValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_spm_value);
    }

    private static final TextView tvFastSpeedValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_fast_speed_value);
    }

    private static final View tvHeartRateRange_delegate$lambda$0(SportDetailChartFragment r1) {
        return r1.getMView().findViewById(R.id.tv_heart_rate_range);
    }

    private static final TextView tvMaxAltitudeValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_max_altitude_value);
    }

    private static final TextView tvMaxBmpValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_max_bpm_value);
    }

    private static final TextView tvMaxPressureValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_max_pressure_value);
    }

    private static final TextView tvMaxSpmValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_max_spm_value);
    }

    private static final TextView tvMinAltitudeValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_min_altitude_value);
    }

    private static final TextView tvMinPaceValue_delegate$lambda$0(SportDetailChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_min_pace_value);
    }

    private static final DINCondBold tvSportAerobic_delegate$lambda$0(SportDetailChartFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sportRecordAerobic);
    }

    private static final DINCondBold tvSportAnaerobic_delegate$lambda$0(SportDetailChartFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sportRecordAnaerobic);
    }

    private static final DINCondBold tvSportFatBurning_delegate$lambda$0(SportDetailChartFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sportRecordFatBurning);
    }

    private static final DINCondBold tvSportStrenuous_delegate$lambda$0(SportDetailChartFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sportRecordStrenuous);
    }

    private static final DINCondBold tvSportWarmUp_delegate$lambda$0(SportDetailChartFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sportRecordWarmUp);
    }

    public final LineChart getAltitudeLineChart() {
        return (LineChart) getValue();
    }

    public final View getAltitudePanel() {
        return (View) getValue();
    }

    public final LineChart getHrLineChart() {
        return (LineChart) getValue();
    }

    public final View getHrPanel() {
        return (View) getValue();
    }

    public final PieChart getHrPieChart() {
        return (PieChart) getValue();
    }

    public final boolean getLeftAxisGridDashedLine() {
        return this.leftAxisGridDashedLine;
    }

    public final View getLlHeartRateRange() {
        return (View) getValue();
    }

    public final float getMChartXStartIndex() {
        return ((Number) getValue()).floatValue();
    }

    public final long getMEndTime() {
        return this.mEndTime;
    }

    @aa1
    public final LocationDao getMLocationDao() {
        return (LocationDao) getValue();
    }

    public final long getMStartTime() {
        return this.mStartTime;
    }

    @aa1
    public final Workout getMWorkout() {
        Workout r0 = this.mWorkout;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mWorkout");
        return null;
    }

    public final LineChart getPaceLineChart() {
        return (LineChart) getValue();
    }

    public final View getPacePanel() {
        return (View) getValue();
    }

    public final LineChart getPressureLineChart() {
        return (LineChart) getValue();
    }

    public final View getPressurePanel() {
        return (View) getValue();
    }

    public final NestedScrollView getRootView() {
        return (NestedScrollView) getValue();
    }

    public final LineChart getSpeedLineChart() {
        return (LineChart) getValue();
    }

    public final View getSpeedPanel() {
        return (View) getValue();
    }

    public final LineChart getSpmLineChart() {
        return (LineChart) getValue();
    }

    public final View getSpmPanel() {
        return (View) getValue();
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final TextView getTvAltitudeUnit() {
        return (TextView) getValue();
    }

    public final TextView getTvAvgBmpValue() {
        return (TextView) getValue();
    }

    public final TextView getTvAvgPaceValue() {
        return (TextView) getValue();
    }

    public final TextView getTvAvgPressureValue() {
        return (TextView) getValue();
    }

    public final TextView getTvAvgSpeedValue() {
        return (TextView) getValue();
    }

    public final TextView getTvAvgSpeedValueTitle() {
        return (TextView) getValue();
    }

    public final TextView getTvAvgSpmValue() {
        return (TextView) getValue();
    }

    public final TextView getTvFastSpeedValue() {
        return (TextView) getValue();
    }

    public final View getTvHeartRateRange() {
        return (View) getValue();
    }

    public final TextView getTvMaxAltitudeValue() {
        return (TextView) getValue();
    }

    public final TextView getTvMaxBmpValue() {
        return (TextView) getValue();
    }

    public final TextView getTvMaxPressureValue() {
        return (TextView) getValue();
    }

    public final TextView getTvMaxSpmValue() {
        return (TextView) getValue();
    }

    public final TextView getTvMinAltitudeValue() {
        return (TextView) getValue();
    }

    public final TextView getTvMinPaceValue() {
        return (TextView) getValue();
    }

    public final DINCondBold getTvSportAerobic() {
        return (DINCondBold) getValue();
    }

    public final DINCondBold getTvSportAnaerobic() {
        return (DINCondBold) getValue();
    }

    public final DINCondBold getTvSportFatBurning() {
        return (DINCondBold) getValue();
    }

    public final DINCondBold getTvSportStrenuous() {
        return (DINCondBold) getValue();
    }

    public final DINCondBold getTvSportWarmUp() {
        return (DINCondBold) getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        LogUtils.i(new Object[]{this.TAG + " initView"});
        Serializable r0 = getMArg3();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        setMWorkout((Workout) r0);
        LogUtils.i(new Object[]{"mWorkout" + getMWorkout()});
        o65 r1 = o65.OXO1;
        this.mStartTime = r1.OIX0iXi(getMWorkout().getMStart());
        this.mEndTime = r1.OIX0iXi(getMWorkout().getMEnd()) + ((long) 60000);
        if (getMWorkout().getMType() != 1) goto L6;
        newDrawChart();
        return;
    L6:
        oldDrawChart();
    }

    public final boolean isLocationEmpty() {
        return this.isLocationEmpty;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_chart;
    }

    public void newDrawChart() {
    }

    public final void setLeftAxisGridDashedLine(boolean r1) {
        this.leftAxisGridDashedLine = r1;
    }

    public final void setLocationEmpty(boolean r1) {
        this.isLocationEmpty = r1;
    }

    public final void setMEndTime(long r1) {
        this.mEndTime = r1;
    }

    public final void setMStartTime(long r1) {
        this.mStartTime = r1;
    }

    public final void setMWorkout(@aa1 Workout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWorkout = r2;
    }

    public void setSportText(long r5, long r7, long r9, long r11, long r13) {
        long r0 = 1000;
        long r2 = 60;
        long r6 = (r5 / r0) / r2;
        long r8 = (r7 / r0) / r2;
        long r10 = (r9 / r0) / r2;
        long r12 = (r11 / r0) / r2;
        long r14 = (r13 / r0) / r2;
        getTvSportStrenuous().setText(String.valueOf(r6));
        getTvSportAnaerobic().setText(String.valueOf(r8));
        getTvSportAerobic().setText(String.valueOf(r10));
        getTvSportFatBurning().setText(String.valueOf(r12));
        getTvSportWarmUp().setText(String.valueOf(r14));
        ArrayList r1 = new ArrayList();
        if (r6 == 0) goto L5;
    L13:
        addPieEntry(r1, r6);
        addPieEntry(r1, r8);
        addPieEntry(r1, r10);
        addPieEntry(r1, r12);
        addPieEntry(r1, r14);
    L14:
        ArrayList r3 = new ArrayList();
        addColors(r3, R.color.hr_scope_color_5, r6);
        addColors(r3, R.color.hr_scope_color_4, r8);
        addColors(r3, R.color.hr_scope_color_3, r10);
        addColors(r3, R.color.hr_scope_color_2, r12);
        addColors(r3, R.color.hr_scope_color_1, r14);
        PieChart r15 = getHrPieChart();
        Intrinsics.O10IXXX0X(r15, "<get-hrPieChart>(...)");
        showPieChart(r15, r1, r3);
        return;
    L5:
        if (r8 != 0) goto L13;
        if (r10 != 0) goto L13;
        if (r12 != 0) goto L13;
        if (r14 != 0) goto L13;
        r1.add(new PieEntry(1.0f));
        r1.add(new PieEntry(1.0f));
        r1.add(new PieEntry(1.0f));
        r1.add(new PieEntry(1.0f));
        r1.add(new PieEntry(1.0f));
        goto L14
    }

    public final void share() {
        XIi1i01O r0 = XIi1i01O.OXO1;
        NestedScrollView r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        ImageUtils.save(r0.iO(r1), uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.PNG);
    }

    public final void updateChartData(@aa1 LineChart r3, @aa1 List<Entry> r4, int r5, int r6) {
        Intrinsics.X0O(r3, "lineChart");
        Intrinsics.X0O(r4, "values");
        LineDataSet r0 = new LineDataSet(r4, "");
        r0.II1(ContextCompat.getColor(getMActivity(), r5));
        r0.I00(ContextCompat.getColor(getMActivity(), r5));
        r0.I1XII0X(2.0f);
        r0.iXOII(1.0f);
        r0.IOI0i0I(false);
        r0.XXI(false);
        r0.O1iXiI(true);
        r0.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        Drawable r7 = ContextCompat.getDrawable(getMActivity(), r6);
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        r0.I0i1OXiI(r7);
        co r8 = new co(new IiXO1XOi[]{r0});
        r8.iI(false);
        r3.setData(r8);
        if (this.leftAxisGridDashedLine == false) goto L5;
        YAxis r9 = r3.getAxisLeft();
        r9.IIX1OXO(10.0f, 10.0f, 0.0f);
        r9.iIX0i(false);
    L5:
        r3.I0IIOi(1000);
        r3.invalidate();
    }
}
