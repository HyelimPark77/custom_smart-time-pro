package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a42;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b42;
import com.android.mltcode.paycertificationapi.c42;
import com.android.mltcode.paycertificationapi.d42;
import com.android.mltcode.paycertificationapi.e42;
import com.android.mltcode.paycertificationapi.f42;
import com.android.mltcode.paycertificationapi.g42;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.h42;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i42;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.j42;
import com.android.mltcode.paycertificationapi.k42;
import com.android.mltcode.paycertificationapi.l42;
import com.android.mltcode.paycertificationapi.m42;
import com.android.mltcode.paycertificationapi.n42;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.model.PressureDataKt;
import com.sma.smartv3.model.PressureDataParse;
import com.sma.smartv3.model.PressureDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1869#2,2:277\n99#3,7:279\n106#3,3:287\n79#3,7:290\n109#3:297\n1#4:286\n*S KotlinDebug\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n*L\n229#1:277,2\n158#1:279,7\n158#1:287,3\n158#1:290,7\n158#1:297\n158#1:286\n*E\n"})
public final class PressureDayFragment extends BaseDetailDaysFragment<Pressure> {

    @aa1
    private final Lazy aveValue$delegate;

    @aa1
    private final Lazy barChart$delegate;

    @aa1
    private final Lazy btnMeasure$delegate;

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
    private float highlight;

    @aa1
    private final LinkedHashMap<Long, ArrayList<Pressure>> hourData;

    @aa1
    private final PressureDao mPressureDao;

    @aa1
    private final Lazy mSbv$delegate;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final List<PressureDayData> pressureHourDataList;
    public XXX1X11 setValue;

    @aa1
    private final Lazy twoTV$delegate;

    @aa1
    private final Lazy twoValue$delegate;

    @aa1
    private final List<BarEntry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ PressureDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(PressureDayFragment r1, SimpleDateFormat r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r6, X110O r7) {
            Intrinsics.X0O(r6, "e");
            Intrinsics.X0O(r7, "h");
            this.OXO1.updateItemData(r6);
            this.OXO1.getMCalendar().set(11, (int) r6.OIX0iXi());
            DINCondBold r8 = this.OXO1.getNowTimeDetails();
            PressureDayFragment r9 = this.OXO1;
            r8.setText(r9.getString(R.string.time_range, new Object[]{TimeUtils.millis2String(r9.getMCalendar().getTimeInMillis(), this.XIi00iiXO), TimeUtils.millis2String(this.OXO1.getMCalendar().getTimeInMillis() + ((long) TimeConstants.HOUR), this.XIi00iiXO)}));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public PressureDayFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new f42(this));
        this.aveValue$delegate = LazyKt__LazyJVMKt.iO(new i42(this));
        this.mSbv$delegate = LazyKt__LazyJVMKt.iO(new j42(this));
        this.twoValue$delegate = LazyKt__LazyJVMKt.iO(new k42(this));
        this.twoTV$delegate = LazyKt__LazyJVMKt.iO(new l42(this));
        this.values = new ArrayList();
        this.mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();
        this.hourData = new LinkedHashMap();
        this.pressureHourDataList = new ArrayList();
        this.highlight = 3.0f;
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new m42(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new n42(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new b42(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new c42(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new d42(this));
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new g42(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new h42(this));
    }

    public static /* synthetic */ LinearLayout I1(PressureDayFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button I1XOi1(PressureDayFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(PressureDayFragment r0) {
        return twoTV_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CustomBarChartView O10IXXX0X(PressureDayFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(PressureDayFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CircleThumbSegmentedBarView OX(PressureDayFragment r0) {
        return mSbv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(PressureDayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(PressureDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(PressureDayFragment r0) {
        return aveValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XX0(PressureDayFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(PressureDayFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(PressureDayFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ DINCondBold XiOIii1(PressureDayFragment r0) {
        return twoValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold aveValue_delegate$lambda$0(PressureDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.aveValue);
    }

    private static final CustomBarChartView barChart_delegate$lambda$0(PressureDayFragment r1) {
        return (CustomBarChartView) r1.getMView().findViewById(R.id.barChart);
    }

    private static final View btnMeasure_delegate$lambda$0(PressureDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<Pressure> r14) {
        this.values.clear();
        PressureDataParse.INSTANCE.filterHourData(getMActivity(), r14, this.hourData, this.pressureHourDataList, this.values);
        iO1Xi1X1i r4 = iO1Xi1X1i.OXO1;
        YAxis r5 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r5, "getAxisLeft(...)");
        YAxis r6 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r6, "getAxisRight(...)");
        r4.OIX0iXi(r5, r6, 100.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        updateChartData(this.values);
        if (r14.isEmpty() == true) goto L16;
        Pressure r15 = (Pressure) CollectionsKt___CollectionsKt.Xi1XO00(r14);
        if (r15.getMValue() != 0) goto L10;
        Button r16 = getHealthBtn();
        if (r16 == null) goto L17;
        r16.setEnabled(false);
        return;
    L17:
        return;
    L10:
        HeathReportsUtils r2 = HeathReportsUtils.OXO1;
        long r7 = r15.getMTime();
        Button r8 = getHealthBtn();
        Intrinsics.O10IXXX0X(r8, "<get-healthBtn>(...)");
        PFMedium r9 = getHealthTv();
        Intrinsics.O10IXXX0X(r9, "<get-healthTv>(...)");
        LinearLayout r10 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r10, "<get-healthTipLayout>(...)");
        PFMedium r11 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r11, "<get-healthQuestions>(...)");
        r2.X1(q62.IIII0II, r7, r8, r9, r10, r11, getMActivity());
        i72 r3 = i72.OXO1;
        boolean r12 = r3.I0i0();
        if (r3.OIIOI() == false) goto L13;
        boolean r13 = false;
    L14:
        LinearLayout r17 = getHealthLayout();
        Intrinsics.O10IXXX0X(r17, "<get-healthLayout>(...)");
        Button r18 = getHealthBtn();
        Intrinsics.O10IXXX0X(r18, "<get-healthBtn>(...)");
        PFMedium r19 = getHealthTv();
        Intrinsics.O10IXXX0X(r19, "<get-healthTv>(...)");
        r2.iOiXi11II(r17, r18, r19, getMActivity(), q62.IIII0II, String.valueOf(r15.getMValue()), r15.getMTime(), "", r13);
        return;
    L13:
        r13 = r12;
        goto L14
    }

    private final DINCondBold getAveValue() {
        return (DINCondBold) getValue();
    }

    private final CustomBarChartView getBarChart() {
        return (CustomBarChartView) getValue();
    }

    private final View getBtnMeasure() {
        return (View) getValue();
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

    private final CircleThumbSegmentedBarView getMSbv() {
        return (CircleThumbSegmentedBarView) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final PFMedium getTwoTV() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getTwoValue() {
        return (DINCondBold) getValue();
    }

    private static final Button healthBtn_delegate$lambda$0(PressureDayFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(PressureDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(PressureDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(PressureDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(PressureDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ Unit iIiiO(PressureDayFragment r0, BleConnector r1) {
        return initView$lambda$2$0(r0, r1);
    }

    private static final void initView$lambda$2(final PressureDayFragment r2, View r3) {
        i1O0OXO1O.OXO1.IiI10X("start measure pressure");
        X0IOiX1O.XIi00iiXO(false, new a42(r2), 1, null);
    }

    private static final Unit initView$lambda$2$0(PressureDayFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 3);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), RealTimeMeasurementActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final CircleThumbSegmentedBarView mSbv_delegate$lambda$0(PressureDayFragment r1) {
        return (CircleThumbSegmentedBarView) r1.getMView().findViewById(R.id.sbv);
    }

    private static final View measurePanel_delegate$lambda$0(PressureDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final PFMedium twoTV_delegate$lambda$0(PressureDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.twoTV);
    }

    private static final DINCondBold twoValue_delegate$lambda$0(PressureDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.twoValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> r6) {
        if (getBarChart().getData() != 0) goto L5;
    L7:
        setSetValue(new XXX1X11(r6, setDataLabel()));
        getSetValue().I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))}));
        IXIX1X1 r0 = new IXIX1X1(new XIXi1iX00[]{getSetValue()});
        r0.iI(false);
        getBarChart().setData(r0);
    L8:
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        Iterator<T> r7 = r6.iterator();
    L10:
        if (r7.hasNext() == false) goto L14;
        BarEntry r1 = (BarEntry) r7.next();
        if (r1.O00() <= 0.0f) goto L10;
        this.highlight = r1.OIX0iXi();
        goto L10
    L14:
        getBarChart().II1Xi0(this.highlight, 0);
        return;
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L7;
        T r2 = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
        setSetValue((XXX1X11) r2);
        getSetValue().IOX1(r6);
        getSetValue().i0X1iIO();
        ((IXIX1X1) getBarChart().getData()).iX();
        getBarChart().X0i1O();
        goto L8
    }

    public final void clearCache(long r7) {
        this.hourData.clear();
        int r0 = 1;
    L4:
        if (r0 >= 25) goto L6;
        this.hourData.put(Long.valueOf((((long) (r0 * 3600)) * 1000) + r7), new ArrayList());
        r0 = r0 + 1;
        goto L4
    }

    public final float getHighlight() {
        return this.highlight;
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

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAveValue().setText("");
        getTwoTV().setText(R.string.monitoring_results);
        getTwoValue().setText("");
        iO1Xi1X1i r3 = iO1Xi1X1i.OXO1;
        CustomBarChartView r1 = getBarChart();
        Intrinsics.O10IXXX0X(r1, "<get-barChart>(...)");
        r3.OXO1(r1);
        YAxis r4 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r4, "getAxisLeft(...)");
        YAxis r5 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r5, "getAxisRight(...)");
        r3.OIX0iXi(r4, r5, 0.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        XAxis r2 = getBarChart().getXAxis();
        Intrinsics.XXI(r2);
        Context r6 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        r3.OIi0(r2, false, r6);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        r2.IXOIIIO(4.0f);
        r2.i0X000X0O(-1.0f);
        r2.iOiXi11II(25.0f);
        SimpleDateFormat r7 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList r8 = new ArrayList();
        int r9 = 0;
    L4:
        if (r9 >= 25) goto L11;
        String r10 = TimeUtils.millis2String(getRange()[0] + (((long) (r9 * 3600)) * 1000), r7);
        if (r8.size() <= 12) goto L10;
        if (Intrinsics.XOO0ii0(r10, "0") == false) goto L10;
        r10 = X10i1i.XOOXII;
    L10:
        Intrinsics.XXI(r10);
        r8.add(r10);
        r9 = r9 + 1;
        goto L4
    L11:
        r2.Oi(new q4(r8));
        CustomBarChartView r11 = getBarChart();
        r11.getDescription().XOO0ii0(false);
        r11.getLegend().XOO0ii0(false);
        r11.setScaleEnabled(false);
        Oi01X10i r12 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r12.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        r12.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.p_show_1), ContextCompat.getColor(getMActivity(), R.color.p_show_2)});
        r12.iIiiO(5);
        getBarChart().setRenderer(r12);
        getBarChart().setOnChartValueSelectedListener(new OXO1(this, O0X11OiO.XO0X10iO(false, 1, null)));
        Context r13 = requireContext();
        Intrinsics.O10IXXX0X(r13, "requireContext(...)");
        CircleThumbSegmentedBarView r14 = getMSbv();
        Intrinsics.O10IXXX0X(r14, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbv(r13, r14);
        CircleThumbSegmentedBarView r15 = getMSbv();
        Intrinsics.O10IXXX0X(r15, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(r15, 0.0f);
        super.initView();
        q62 r16 = q62.OXO1;
        if (r16.iOi1010() == true) goto L14;
    L22:
        View r17 = getMeasurePanel();
        if (r17 == null) goto L31;
        r17.setVisibility(8);
        return;
    L31:
        return;
    L14:
        if (r16.XI1OX0IO() == false) goto L22;
        View r18 = getMeasurePanel();
        if (r18 == null) goto L18;
        r18.setVisibility(0);
    L18:
        View r19 = getBtnMeasure();
        if (r19 == null) goto L30;
        r19.setOnClickListener(new e42(this));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_pressure_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Pressure> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onPressureChanged"});
        changeTime();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Pressure> onTimePeriodChange(@aa1 Calendar r4, int r5, @aa1 TimePeriod r6) {
        Intrinsics.X0O(r4, "calendar");
        Intrinsics.X0O(r6, "timePeriod");
        setRange(O0X11OiO.I1(r4, r6, r5));
        clearCache(getRange()[0]);
        return this.mPressureDao.getPressures(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "Pressure day Data";
    }

    public final void setHighlight(float r1) {
        this.highlight = r1;
    }

    public final void setSetValue(@aa1 XXX1X11 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void updateItemData(@aa1 Entry r5) {
        Intrinsics.X0O(r5, "e");
        CircleThumbSegmentedBarView r0 = getMSbv();
        Intrinsics.O10IXXX0X(r0, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(r0, r5.O00());
        PressureDayData r6 = this.pressureHourDataList.get((int) r5.OIX0iXi());
        getNowValue().setText(UtilsKt.iX(r6.getMin(), r6.getMax()));
        getTwoValue().setText(UtilsKt.Ii1iii0(r6.getStatus()));
        getAveValue().setText(UtilsKt.iXiiiO(r6.getAvg()));
        CircleThumbSegmentedBarView r1 = getMSbv();
        Intrinsics.O10IXXX0X(r1, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(r1, r6.getAvg());
    }
}
