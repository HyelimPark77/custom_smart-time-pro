package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
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
import com.sma.smartv3.model.PressureDataKt;
import com.sma.smartv3.model.PressureDataParse;
import com.sma.smartv3.model.PressureDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.p610ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.PressureDayFragment;
import com.sma.smartv3.pro.R;
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
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1869#2,2:277\n99#3,7:279\n106#3,3:287\n79#3,7:290\n109#3:297\n1#4:286\n*S KotlinDebug\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n*L\n229#1:277,2\n158#1:279,7\n158#1:287,3\n158#1:290,7\n158#1:297\n158#1:286\n*E\n"})
public final class PressureDayFragment extends BaseDetailDaysFragment<Pressure> {
    public XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.barChart_delegate$lambda$0(this.f6567IO);
        }
    });

    @aa1
    private final Lazy aveValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.aveValue_delegate$lambda$0(this.f7738IO);
        }
    });

    @aa1
    private final Lazy mSbv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.mSbv_delegate$lambda$0(this.f8875IO);
        }
    });

    @aa1
    private final Lazy twoValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.k42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.twoValue_delegate$lambda$0(this.f9102IO);
        }
    });

    @aa1
    private final Lazy twoTV$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.twoTV_delegate$lambda$0(this.f9354IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();

    @aa1
    private final PressureDao mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();

    @aa1
    private final LinkedHashMap<Long, ArrayList<Pressure>> hourData = new LinkedHashMap<>();

    @aa1
    private final List<PressureDayData> pressureHourDataList = new ArrayList();
    private float highlight = 3.0f;

    @aa1
    private final Lazy healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.healthLayout_delegate$lambda$0(this.f9621IO);
        }
    });

    @aa1
    private final Lazy healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.healthBtn_delegate$lambda$0(this.f9846IO);
        }
    });

    @aa1
    private final Lazy healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.healthTv_delegate$lambda$0(this.f5661IO);
        }
    });

    @aa1
    private final Lazy healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.healthTipLayout_delegate$lambda$0(this.f5899IO);
        }
    });

    @aa1
    private final Lazy healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.healthQuestions_delegate$lambda$0(this.f6125IO);
        }
    });

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.measurePanel_delegate$lambda$0(this.f6810IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureDayFragment.btnMeasure_delegate$lambda$0(this.f7041IO);
        }
    });

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            PressureDayFragment.this.updateItemData(e);
            PressureDayFragment.this.getMCalendar().set(11, (int) e.OIX0iXi());
            DINCondBold nowTimeDetails = PressureDayFragment.this.getNowTimeDetails();
            PressureDayFragment pressureDayFragment = PressureDayFragment.this;
            nowTimeDetails.setText(pressureDayFragment.getString(R.string.time_range, TimeUtils.millis2String(pressureDayFragment.getMCalendar().getTimeInMillis(), this.XIi00iiXO), TimeUtils.millis2String(PressureDayFragment.this.getMCalendar().getTimeInMillis() + ((long) TimeConstants.HOUR), this.XIi00iiXO)));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold aveValue_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (DINCondBold) pressureDayFragment.getMView().findViewById(R.id.aveValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomBarChartView barChart_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (CustomBarChartView) pressureDayFragment.getMView().findViewById(R.id.barChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return pressureDayFragment.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<Pressure> list) {
        this.values.clear();
        PressureDataParse.INSTANCE.filterHourData(getMActivity(), list, this.hourData, this.pressureHourDataList, this.values);
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 100.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        updateChartData(this.values);
        if (list.isEmpty()) {
            return;
        }
        Pressure pressure = (Pressure) CollectionsKt___CollectionsKt.Xi1XO00(list);
        if (pressure.getMValue() == 0) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        long mTime = pressure.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1(q62.IIII0II, mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i0 = i72Var.OIIOI() ? false : i72Var.I0i0();
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), q62.IIII0II, String.valueOf(pressure.getMValue()), pressure.getMTime(), "", zI0i0);
    }

    private final DINCondBold getAveValue() {
        return (DINCondBold) this.aveValue$delegate.getValue();
    }

    private final CustomBarChartView getBarChart() {
        return (CustomBarChartView) this.barChart$delegate.getValue();
    }

    private final View getBtnMeasure() {
        return (View) this.btnMeasure$delegate.getValue();
    }

    private final Button getHealthBtn() {
        return (Button) this.healthBtn$delegate.getValue();
    }

    private final LinearLayout getHealthLayout() {
        return (LinearLayout) this.healthLayout$delegate.getValue();
    }

    private final PFMedium getHealthQuestions() {
        return (PFMedium) this.healthQuestions$delegate.getValue();
    }

    private final LinearLayout getHealthTipLayout() {
        return (LinearLayout) this.healthTipLayout$delegate.getValue();
    }

    private final PFMedium getHealthTv() {
        return (PFMedium) this.healthTv$delegate.getValue();
    }

    private final CircleThumbSegmentedBarView getMSbv() {
        return (CircleThumbSegmentedBarView) this.mSbv$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    private final PFMedium getTwoTV() {
        return (PFMedium) this.twoTV$delegate.getValue();
    }

    private final DINCondBold getTwoValue() {
        return (DINCondBold) this.twoValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (Button) pressureDayFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (LinearLayout) pressureDayFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (PFMedium) pressureDayFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (LinearLayout) pressureDayFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (PFMedium) pressureDayFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(final PressureDayFragment pressureDayFragment, View view) {
        i1O0OXO1O.OXO1.IiI10X("start measure pressure");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.a42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PressureDayFragment.initView$lambda$2$0(this.f5418IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$0(PressureDayFragment pressureDayFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 3);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(pressureDayFragment.getActivity(), (Class<?>) RealTimeMeasurementActivity.class);
        intent.putExtras(bundle);
        pressureDayFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleThumbSegmentedBarView mSbv_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (CircleThumbSegmentedBarView) pressureDayFragment.getMView().findViewById(R.id.sbv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return pressureDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium twoTV_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (PFMedium) pressureDayFragment.getMView().findViewById(R.id.twoTV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold twoValue_delegate$lambda$0(PressureDayFragment pressureDayFragment) {
        return (DINCondBold) pressureDayFragment.getMView().findViewById(R.id.twoValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> list) {
        if (getBarChart().getData() == 0 || ((IXIX1X1) getBarChart().getData()).XXI() <= 0) {
            setSetValue(new XXX1X11(list, setDataLabel()));
            getSetValue().I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))));
            IXIX1X1 ixix1x1 = new IXIX1X1(getSetValue());
            ixix1x1.m1316iI(false);
            getBarChart().setData(ixix1x1);
        } else {
            T tOIX0iXi = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            setSetValue((XXX1X11) tOIX0iXi);
            getSetValue().IOX1(list);
            getSetValue().i0X1iIO();
            ((IXIX1X1) getBarChart().getData()).mo1167iX();
            getBarChart().X0i1O();
        }
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        for (BarEntry barEntry : list) {
            if (barEntry.O00() > 0.0f) {
                this.highlight = barEntry.OIX0iXi();
            }
        }
        getBarChart().II1Xi0(this.highlight, 0);
    }

    public final void clearCache(long j) {
        this.hourData.clear();
        for (int i = 1; i < 25; i++) {
            this.hourData.put(Long.valueOf((((long) (i * 3600)) * 1000) + j), new ArrayList<>());
        }
    }

    public final float getHighlight() {
        return this.highlight;
    }

    @aa1
    public final XXX1X11 getSetValue() {
        XXX1X11 xxx1x11 = this.setValue;
        if (xxx1x11 != null) {
            return xxx1x11;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAveValue().setText("");
        getTwoTV().setText(R.string.monitoring_results);
        getTwoValue().setText("");
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        CustomBarChartView barChart = getBarChart();
        Intrinsics.O10IXXX0X(barChart, "<get-barChart>(...)");
        io1xi1x1i.OXO1(barChart);
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 0.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        xAxis.IXOIIIO(4.0f);
        xAxis.i0X000X0O(-1.0f);
        xAxis.iOiXi11II(25.0f);
        SimpleDateFormat simpleDateFormatXXiIiX10 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 25; i++) {
            String strMillis2String = TimeUtils.millis2String(getRange()[0] + (((long) (i * 3600)) * 1000), simpleDateFormatXXiIiX10);
            if (arrayList.size() > 12 && Intrinsics.XOO0ii0(strMillis2String, "0")) {
                strMillis2String = X10i1i.XOOXII;
            }
            Intrinsics.XXI(strMillis2String);
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        CustomBarChartView barChart2 = getBarChart();
        barChart2.getDescription().XOO0ii0(false);
        barChart2.getLegend().XOO0ii0(false);
        barChart2.setScaleEnabled(false);
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.p_show_1), ContextCompat.getColor(getMActivity(), R.color.p_show_2)});
        oi01X10i.iIiiO(5);
        getBarChart().setRenderer(oi01X10i);
        getBarChart().setOnChartValueSelectedListener(new OXO1(O0X11OiO.XO0X10iO(false, 1, null)));
        Context contextRequireContext = requireContext();
        Intrinsics.O10IXXX0X(contextRequireContext, "requireContext(...)");
        CircleThumbSegmentedBarView mSbv = getMSbv();
        Intrinsics.O10IXXX0X(mSbv, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbv(contextRequireContext, mSbv);
        CircleThumbSegmentedBarView mSbv2 = getMSbv();
        Intrinsics.O10IXXX0X(mSbv2, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(mSbv2, 0.0f);
        super.initView();
        q62 q62Var = q62.OXO1;
        if (!q62Var.iOi1010() || !q62Var.XI1OX0IO()) {
            View measurePanel = getMeasurePanel();
            if (measurePanel != null) {
                measurePanel.setVisibility(8);
                return;
            }
            return;
        }
        View measurePanel2 = getMeasurePanel();
        if (measurePanel2 != null) {
            measurePanel2.setVisibility(0);
        }
        View btnMeasure = getBtnMeasure();
        if (btnMeasure != null) {
            btnMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.e42
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PressureDayFragment.initView$lambda$2(this.f6331IO, view);
                }
            });
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_pressure_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Pressure> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onPressureChanged");
        changeTime();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Pressure> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        clearCache(getRange()[0]);
        return this.mPressureDao.getPressures(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "Pressure day Data";
    }

    public final void setHighlight(float f) {
        this.highlight = f;
    }

    public final void setSetValue(@aa1 XXX1X11 xxx1x11) {
        Intrinsics.X0O(xxx1x11, "<set-?>");
        this.setValue = xxx1x11;
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        CircleThumbSegmentedBarView mSbv = getMSbv();
        Intrinsics.O10IXXX0X(mSbv, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(mSbv, e.O00());
        PressureDayData pressureDayData = this.pressureHourDataList.get((int) e.OIX0iXi());
        getNowValue().setText(UtilsKt.m38849iX(pressureDayData.getMin(), pressureDayData.getMax()));
        getTwoValue().setText(UtilsKt.Ii1iii0(pressureDayData.getStatus()));
        getAveValue().setText(UtilsKt.iXiiiO(pressureDayData.getAvg()));
        CircleThumbSegmentedBarView mSbv2 = getMSbv();
        Intrinsics.O10IXXX0X(mSbv2, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(mSbv2, pressureDayData.getAvg());
    }
}
