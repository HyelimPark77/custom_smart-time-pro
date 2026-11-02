package com.sma.smartv3.ui.status.fragment;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.am4;
import com.android.mltcode.paycertificationapi.bm4;
import com.android.mltcode.paycertificationapi.cm4;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dm4;
import com.android.mltcode.paycertificationapi.em4;
import com.android.mltcode.paycertificationapi.fm4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gm4;
import com.android.mltcode.paycertificationapi.hm4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.ll4;
import com.android.mltcode.paycertificationapi.ml4;
import com.android.mltcode.paycertificationapi.nl4;
import com.android.mltcode.paycertificationapi.ol4;
import com.android.mltcode.paycertificationapi.pl4;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.ql4;
import com.android.mltcode.paycertificationapi.rl4;
import com.android.mltcode.paycertificationapi.sl4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tl4;
import com.android.mltcode.paycertificationapi.ul4;
import com.android.mltcode.paycertificationapi.vl4;
import com.android.mltcode.paycertificationapi.wl4;
import com.android.mltcode.paycertificationapi.xl4;
import com.android.mltcode.paycertificationapi.yl4;
import com.android.mltcode.paycertificationapi.zl4;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.facebook.internal.security.CertificateUtil;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleSleep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSleepAllDayDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllDayDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/SleepAllDayDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n1869#2,2:373\n*S KotlinDebug\n*F\n+ 1 SleepAllDayDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/SleepAllDayDayFragment\n*L\n325#1:373,2\n*E\n"})
public final class SleepAllDayDayFragment extends BaseDetailDaysFragment<Sleep> {

    @aa1
    private final Lazy awakeValue$delegate;

    @aa1
    private final Lazy barChart$delegate;
    private final int block;
    private final float blockHeight;

    @tb1
    private SleepAllDayData curSleepAllDayData;

    @aa1
    private final Lazy deepValue$delegate;

    @aa1
    private final Lazy healthBtn$delegate;

    @aa1
    private final Lazy healthLayout$delegate;

    @aa1
    private final Lazy healthQuestions$delegate;

    @aa1
    private final Lazy healthTipLayout$delegate;

    @aa1
    private final Lazy healthTv$delegate;
    private Oi01X10i infoBarChartRender;

    @aa1
    private final Lazy lightValue$delegate;

    @aa1
    private final Lazy llInfoPiecemeal$delegate;

    @aa1
    private final Lazy llInfoRem$delegate;

    @aa1
    private final Lazy llPiecemeal$delegate;

    @aa1
    private final SleepDao mSleepDao;

    @aa1
    private final Lazy piecemealValue$delegate;

    @aa1
    private final Lazy piemealAvg$delegate;

    @aa1
    private final Lazy piemealCount$delegate;

    @aa1
    private final Lazy remValue$delegate;

    @aa1
    private final Lazy rvPiecemeal$delegate;
    public XXX1X11 setValue;

    @aa1
    private final Lazy sleepEndTime$delegate;

    @aa1
    private final Lazy sleepStartTime$delegate;

    @aa1
    private final Lazy sleepStartTime1$delegate;

    @aa1
    private final Lazy sleepStartTime2$delegate;

    @aa1
    private final Lazy sleepStartTime3$delegate;

    @aa1
    private final Lazy totalPiecemealTime$delegate;

    @aa1
    private final List<BarEntry> values;

    public SleepAllDayDayFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new ll4(this));
        this.deepValue$delegate = LazyKt__LazyJVMKt.iO(new nl4(this));
        this.lightValue$delegate = LazyKt__LazyJVMKt.iO(new rl4(this));
        this.awakeValue$delegate = LazyKt__LazyJVMKt.iO(new sl4(this));
        this.remValue$delegate = LazyKt__LazyJVMKt.iO(new tl4(this));
        this.piecemealValue$delegate = LazyKt__LazyJVMKt.iO(new ul4(this));
        this.sleepStartTime$delegate = LazyKt__LazyJVMKt.iO(new vl4(this));
        this.sleepStartTime1$delegate = LazyKt__LazyJVMKt.iO(new xl4(this));
        this.sleepStartTime2$delegate = LazyKt__LazyJVMKt.iO(new yl4(this));
        this.sleepStartTime3$delegate = LazyKt__LazyJVMKt.iO(new zl4(this));
        this.sleepEndTime$delegate = LazyKt__LazyJVMKt.iO(new wl4(this));
        this.llInfoRem$delegate = LazyKt__LazyJVMKt.iO(new am4(this));
        this.llInfoPiecemeal$delegate = LazyKt__LazyJVMKt.iO(new bm4(this));
        this.llPiecemeal$delegate = LazyKt__LazyJVMKt.iO(new cm4(this));
        this.totalPiecemealTime$delegate = LazyKt__LazyJVMKt.iO(new dm4(this));
        this.piemealCount$delegate = LazyKt__LazyJVMKt.iO(new em4(this));
        this.piemealAvg$delegate = LazyKt__LazyJVMKt.iO(new fm4(this));
        this.rvPiecemeal$delegate = LazyKt__LazyJVMKt.iO(new gm4(this));
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new hm4(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new ml4(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new ol4(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new pl4(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new ql4(this));
        this.values = new ArrayList();
        this.block = 1;
        this.blockHeight = 400.0f / 1;
        this.mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
    }

    public static /* synthetic */ TextView I1(SleepAllDayDayFragment r0) {
        return sleepStartTime1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold I1XOi1(SleepAllDayDayFragment r0) {
        return remValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(SleepAllDayDayFragment r0) {
        return totalPiecemealTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup IIX1OXO(SleepAllDayDayFragment r0) {
        return llPiecemeal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IXXOO(SleepAllDayDayFragment r0) {
        return sleepStartTime2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(SleepAllDayDayFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O1O(SleepAllDayDayFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup OII(SleepAllDayDayFragment r0) {
        return llInfoPiecemeal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ BarChart OX(SleepAllDayDayFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView OiIIX101O(SleepAllDayDayFragment r0) {
        return rvPiecemeal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(SleepAllDayDayFragment r0) {
        return sleepStartTime3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(SleepAllDayDayFragment r0) {
        return piecemealValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1ii(SleepAllDayDayFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XX0(SleepAllDayDayFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(SleepAllDayDayFragment r0) {
        return piemealCount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXIIO1i11(SleepAllDayDayFragment r0) {
        return piemealAvg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(SleepAllDayDayFragment r0) {
        return sleepStartTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup XiOIii1(SleepAllDayDayFragment r0) {
        return llInfoRem_delegate$lambda$0(r0);
    }

    private static final DINCondBold awakeValue_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.awakeValue);
    }

    private static final BarChart barChart_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (BarChart) r1.getMView().findViewById(R.id.barChart);
    }

    private static final DINCondBold deepValue_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.deepValue);
    }

    private final void filterData(List<Sleep> r21) {
        this.values.clear();
        this.curSleepAllDayData = null;
        List<Sleep> r2 = r21;
        if (r2.isEmpty() == true) goto L7;
        SleepAllDayData r3 = SleepAllDayDataParse.INSTANCE.filterData(r21, this.blockHeight, this.values, getRange()[0]);
        this.curSleepAllDayData = r3;
        LogUtils.d(new Object[]{r3.toString()});
        int r7 = r3.getStatus().get(1);
        int r8 = r3.getStatus().get(2);
        int r9 = r3.getStatus().get(3);
        int r10 = r3.getStatus().get(9);
        int r11 = r3.getStatus().get(8);
        int r12 = r3.getTotal();
        if (r12 <= 0) goto L8;
        setXAxis(r3, r12);
    L8:
        String r4 = "";
        if (r12 != 0) goto L11;
        getSleepStartTime().setText("");
        getSleepStartTime1().setText("");
        getSleepStartTime2().setText("");
        getSleepStartTime3().setText("");
        getSleepEndTime().setText("");
        getBarChart().getXAxis().Oi(new q4(CollectionsKt__CollectionsKt.iI()));
    L11:
        DINCondBold r13 = getDeepValue();
        Intrinsics.O10IXXX0X(r13, "<get-deepValue>(...)");
        cp5.iOO1ii1(r7, r13, getMActivity(), 30, R.color.light);
        DINCondBold r14 = getLightValue();
        Intrinsics.O10IXXX0X(r14, "<get-lightValue>(...)");
        cp5.iOO1ii1(r8, r14, getMActivity(), 30, R.color.light);
        DINCondBold r15 = getAwakeValue();
        Intrinsics.O10IXXX0X(r15, "<get-awakeValue>(...)");
        cp5.iOO1ii1(r9, r15, getMActivity(), 30, R.color.light);
        DINCondBold r16 = getRemValue();
        Intrinsics.O10IXXX0X(r16, "<get-remValue>(...)");
        cp5.iOO1ii1(r10, r16, getMActivity(), 30, R.color.light);
        DINCondBold r17 = getPiecemealValue();
        Intrinsics.O10IXXX0X(r17, "<get-piecemealValue>(...)");
        cp5.iOO1ii1(r11, r17, getMActivity(), 30, R.color.light);
        DINCondBold r18 = getNowValue();
        Intrinsics.O10IXXX0X(r18, "<get-nowValue>(...)");
        cp5.O1O(r12, r18, getMActivity(), 0, 0, 24, null);
        if (1 <= r12) goto L14;
    L20:
        Oi01X10i r5 = this.infoBarChartRender;
        if (r5 != null) goto L23;
        Intrinsics.XXO("infoBarChartRender");
        Oi01X10i r1 = null;
    L24:
        r1.i010I(2.0f);
    L25:
        updateChartData(this.values);
        showSleepPiecemeal();
        if (r10 <= 0) goto L28;
        getLlInfoRem().setVisibility(0);
    L30:
        if (r2.isEmpty() == true) goto L47;
        Sleep r6 = (Sleep) CollectionsKt___CollectionsKt.Xi1XO00(r21);
        if (r6.getMAlgorithmType() != 0) goto L37;
        Button r19 = getHealthBtn();
        if (r19 == null) goto L48;
        r19.setEnabled(false);
        return;
    L48:
        return;
    L37:
        int r20 = r12 / 60;
        int r110 = r12 % 60;
        if (r11 == 0) goto L41;
        String r22 = getString(R.string.night_sleep) + CertificateUtil.DELIMITER + r20 + getString(R.string.h) + r110 + getString(R.string.h_m) + "\n" + getString(R.string.piecemeal) + CertificateUtil.DELIMITER + (r11 / 60) + getString(R.string.h) + (r11 % 60) + getString(R.string.h_m);
    L40:
        String r111 = r22;
        HeathReportsUtils r23 = HeathReportsUtils.OXO1;
        long r112 = r6.getMTime();
        Button r113 = getHealthBtn();
        Intrinsics.O10IXXX0X(r113, "<get-healthBtn>(...)");
        PFMedium r24 = getHealthTv();
        Intrinsics.O10IXXX0X(r24, "<get-healthTv>(...)");
        LinearLayout r25 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r25, "<get-healthTipLayout>(...)");
        PFMedium r26 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r26, "<get-healthQuestions>(...)");
        r23.X1("sleep", r112, r113, r24, r25, r26, getMActivity());
        i72 r27 = i72.OXO1;
        boolean r28 = r27.I0i0();
        if (r27.OIIOI() == false) goto L45;
        r4 = getString(R.string.sleep_ai_health_analysis_v2);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        r28 = r27.I0i0();
    L45:
        String r114 = r4;
        boolean r115 = r28;
        LinearLayout r29 = getHealthLayout();
        Intrinsics.O10IXXX0X(r29, "<get-healthLayout>(...)");
        Button r30 = getHealthBtn();
        Intrinsics.O10IXXX0X(r30, "<get-healthBtn>(...)");
        PFMedium r31 = getHealthTv();
        Intrinsics.O10IXXX0X(r31, "<get-healthTv>(...)");
        r23.iOiXi11II(r29, r30, r31, getMActivity(), "sleep", r111, r6.getMTime(), r114, r115);
        return;
    L41:
        r22 = getString(R.string.night_sleep) + CertificateUtil.DELIMITER + r20 + getString(R.string.h) + r110 + getString(R.string.h_m);
        goto L40
    L47:
        return;
    L28:
        getLlInfoRem().setVisibility(8);
        goto L30
    L23:
        r1 = r5;
        goto L24
    L14:
        if (r12 >= 121) goto L20;
        Oi01X10i r32 = this.infoBarChartRender;
        if (r32 != null) goto L18;
        Intrinsics.XXO("infoBarChartRender");
        Oi01X10i r33 = null;
    L19:
        r33.i010I(6.0f);
        goto L25
    L18:
        r33 = r32;
        goto L19
    L7:
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        goto L8
    }

    private final DINCondBold getAwakeValue() {
        return (DINCondBold) getValue();
    }

    private final BarChart getBarChart() {
        return (BarChart) getValue();
    }

    private final DINCondBold getDeepValue() {
        return (DINCondBold) getValue();
    }

    private final Button getHealthBtn() {
        return (Button) getValue();
    }

    private final LinearLayout getHealthLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getHealthQuestions() {
        return (PFMedium) getValue();
    }

    private final LinearLayout getHealthTipLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getHealthTv() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getLightValue() {
        return (DINCondBold) getValue();
    }

    private final ViewGroup getLlInfoPiecemeal() {
        return (ViewGroup) getValue();
    }

    private final ViewGroup getLlInfoRem() {
        return (ViewGroup) getValue();
    }

    private final ViewGroup getLlPiecemeal() {
        return (ViewGroup) getValue();
    }

    private final DINCondBold getPiecemealValue() {
        return (DINCondBold) getValue();
    }

    private final TextView getPiemealAvg() {
        return (TextView) getValue();
    }

    private final TextView getPiemealCount() {
        return (TextView) getValue();
    }

    private final DINCondBold getRemValue() {
        return (DINCondBold) getValue();
    }

    private final RecyclerView getRvPiecemeal() {
        return (RecyclerView) getValue();
    }

    private final TextView getSleepEndTime() {
        return (TextView) getValue();
    }

    private final TextView getSleepStartTime() {
        return (TextView) getValue();
    }

    private final TextView getSleepStartTime1() {
        return (TextView) getValue();
    }

    private final TextView getSleepStartTime2() {
        return (TextView) getValue();
    }

    private final TextView getSleepStartTime3() {
        return (TextView) getValue();
    }

    private final TextView getTotalPiecemealTime() {
        return (TextView) getValue();
    }

    private static final Button healthBtn_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ DINCondBold i010I(SleepAllDayDayFragment r0) {
        return deepValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iIiiO(SleepAllDayDayFragment r0) {
        return awakeValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOO1ii1(SleepAllDayDayFragment r0) {
        return lightValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iOOX010X(SleepAllDayDayFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX(SleepAllDayDayFragment r0) {
        return sleepEndTime_delegate$lambda$0(r0);
    }

    private static final DINCondBold lightValue_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.lightValue);
    }

    private static final ViewGroup llInfoPiecemeal_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (ViewGroup) r1.getMView().findViewById(R.id.ll_info_piecemeal);
    }

    private static final ViewGroup llInfoRem_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (ViewGroup) r1.getMView().findViewById(R.id.ll_info_rem);
    }

    private static final ViewGroup llPiecemeal_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (ViewGroup) r1.getMView().findViewById(R.id.ll_piecemeal);
    }

    private static final DINCondBold piecemealValue_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.piecemealValue);
    }

    private static final TextView piemealAvg_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_piecemeal_avg);
    }

    private static final TextView piemealCount_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_piecemeal_count);
    }

    private static final DINCondBold remValue_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.remValue);
    }

    private static final RecyclerView rvPiecemeal_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.rv_piecemeal);
    }

    private final void setXAxis(SleepAllDayData r10, int r11) {
        XAxis r0 = getBarChart().getXAxis();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        int r3 = 0;
        SimpleDateFormat r1 = O0X11OiO.XO0X10iO(false, 1, null);
        ArrayList r2 = new ArrayList();
        if (r11 < 0) goto L7;
    L4:
        r2.add("");
        if (r3 == r11) goto L7;
        r3 = r3 + 1;
    L7:
        int r12 = (r10.getEndTime() - r10.getStartTime()) / 4;
        getSleepStartTime().setText(TimeUtils.millis2String(((long) r10.getStartTime()) * 1000, r1));
        getSleepStartTime1().setText(TimeUtils.millis2String(((long) (r10.getStartTime() + r12)) * 1000, r1));
        getSleepStartTime2().setText(TimeUtils.millis2String(((long) (r10.getStartTime() + (r12 * 2))) * 1000, r1));
        getSleepStartTime3().setText(TimeUtils.millis2String(((long) (r10.getStartTime() + (r12 * 3))) * 1000, r1));
        getSleepEndTime().setText(TimeUtils.millis2String(((long) r10.getEndTime()) * 1000, r1));
        r0.Oi(new q4(r2));
        r0.O1O = 0.0f;
        r0.IXOIIIO(r2.size() / 4);
        r0.iOO1ii1 = r2.size();
    }

    private final void showSleepPiecemeal() {
        getLlPiecemeal().setVisibility(8);
        SleepAllDayData r0 = this.curSleepAllDayData;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getAnalyseSleep().isEmpty() == true) goto L25;
        ArrayList r2 = new ArrayList();
        Iterator<T> r1 = BleSleep.Companion.getSleepAllDaySegments(r0.getAnalyseSleep()).iterator();
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r1.hasNext() == false) goto L15;
        List<BleSleep> r6 = (List) r1.next();
        Integer r8 = BleSleep.Companion.getSleepAllDaySegmentStatus(r6).get(8);
        if (r8 == null) goto L12;
        int r9 = r8.intValue();
    L13:
        if (r9 <= 0) goto L8;
        r4 = r4 + 1;
        r5 = r5 + r9;
        r2.add(new Triple(getString(R.string.sleep_nap) + r4, cp5.XXIIO1i11(r9), O0X11OiO.XO0X10iO(false, 1, null).format(Long.valueOf(((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r6)).getMLocalTime())) + HelpFormatter.DEFAULT_OPT_PREFIX + O0X11OiO.XO0X10iO(false, 1, null).format(Long.valueOf(((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMLocalTime()))));
        goto L8
    L12:
        r9 = 0;
        goto L13
    L15:
        if (r4 == 0) goto L26;
        getLlPiecemeal().setVisibility(0);
        getTotalPiecemealTime().setText(cp5.XXIIO1i11(r5));
        getPiemealCount().setText(getString(R.string.d_times, new Object[]{Integer.valueOf(r4)}));
        getPiemealAvg().setText(cp5.XXIIO1i11(r5 / r4));
        getRvPiecemeal().setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        RecyclerView r3 = getRvPiecemeal();
        final Activity r7 = getMActivity();
        final List r10 = CollectionsKt___CollectionsKt.IOOIXiI1(r2);
        r3.setAdapter(new SleepAllDayDayFragment$showSleepPiecemeal$1$2(r7, r10));
        return;
    L26:
        return;
    }

    private static final TextView sleepEndTime_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepEndTime);
    }

    private static final TextView sleepStartTime1_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepStartTime1);
    }

    private static final TextView sleepStartTime2_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepStartTime2);
    }

    private static final TextView sleepStartTime3_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepStartTime3);
    }

    private static final TextView sleepStartTime_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepStartTime);
    }

    private static final TextView totalPiecemealTime_delegate$lambda$0(SleepAllDayDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_total_piecemeal_time);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> r4) {
        if (getBarChart().getData() != 0) goto L5;
    L7:
        XXX1X11 r0 = new XXX1X11(r4, "SleepAllDayData");
        r0.iIXX0i(0.0f);
        r0.iO11i(0.0f);
        IXIX1X1 r5 = new IXIX1X1(new XIXi1iX00[]{r0});
        r5.iI(false);
        setColor(r0);
        getBarChart().setData(r5);
        getBarChart().invalidate();
        return;
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L7;
        ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        goto L7
    }

    @aa1
    public final XXX1X11 getSetValue() {
        XXX1X11 r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getBarChart().i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        BarChart r0 = getBarChart();
        r0.setTouchEnabled(false);
        r0.getDescription().XOO0ii0(false);
        r0.getLegend().XOO0ii0(false);
        YAxis r3 = r0.getAxisLeft();
        r3.Ii0X0X(false);
        r3.iOiXi11II(this.blockHeight);
        r3.X00Xi1X(false);
        r3.XO0X10iO(false);
        r3.Ii0X0X(false);
        r3.i0X000X0O(0.0f);
        r3.iIi0(0.0f);
        YAxis r4 = r0.getAxisRight();
        r4.XOO0ii0(false);
        r4.i0X000X0O(0.0f);
        r4.iIi0(0.0f);
        r4.X00Xi1X(false);
        r4.Ii0X0X(false);
        XAxis r1 = r0.getXAxis();
        iO1Xi1X1i r2 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r1);
        r2.OIi0(r1, true, getMActivity());
        r1.X00Xi1X(false);
        r1.Ii0X0X(false);
        Oi01X10i r5 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        this.infoBarChartRender = r5;
        r5.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        Oi01X10i r6 = this.infoBarChartRender;
        Oi01X10i r7 = null;
        if (r6 != null) goto L5;
        Intrinsics.XXO("infoBarChartRender");
        r6 = null;
    L5:
        r6.X01IiOiIi(this.blockHeight);
        Oi01X10i r8 = this.infoBarChartRender;
        if (r8 != null) goto L8;
        Intrinsics.XXO("infoBarChartRender");
        r8 = null;
    L8:
        r8.OX(this.block);
        Oi01X10i r9 = this.infoBarChartRender;
        if (r9 != null) goto L11;
        Intrinsics.XXO("infoBarChartRender");
        r9 = null;
    L11:
        r9.iIiiO(6);
        BarChart r10 = getBarChart();
        Oi01X10i r11 = this.infoBarChartRender;
        if (r11 != null) goto L14;
        Intrinsics.XXO("infoBarChartRender");
    L15:
        r10.setRenderer(r7);
        super.initView();
        DINCondBold r12 = getNowTimeDetails();
        r12.setVisibility(0);
        r12.setText(getString(R.string.all_sleep_time));
        return;
    L14:
        r7 = r11;
        goto L15
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_sleep_all_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Sleep> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Sleep> onTimePeriodChange(@aa1 Calendar r10, int r11, @aa1 TimePeriod r12) {
        Intrinsics.X0O(r10, "calendar");
        Intrinsics.X0O(r12, "timePeriod");
        setRange(O0X11OiO.I1(r10, r12, r11));
        LogUtils.d(new Object[]{"day => " + getRange()[0] + HelpFormatter.DEFAULT_OPT_PREFIX + getRange()[1]});
        SimpleDateFormat r13 = O0X11OiO.IO0iXO0O();
        long r2 = getRange()[0];
        long r5 = (long) O0X11OiO.iXiX011;
        LogUtils.d(new Object[]{"day => " + r13.format(Long.valueOf(r2 - r5)) + HelpFormatter.DEFAULT_OPT_PREFIX + O0X11OiO.IO0iXO0O().format(Long.valueOf(getRange()[1]))});
        return this.mSleepDao.getSleeps(getRange()[0] - r5, getRange()[1]);
    }

    public final void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))}));
    }

    @aa1
    public final String setDataLabel() {
        return "sleep day Data";
    }

    public final void setSetValue(@aa1 XXX1X11 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }
}
