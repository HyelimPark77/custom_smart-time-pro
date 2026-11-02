package com.sma.smartv3.p610ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.HRDataParse;
import com.sma.smartv3.model.HRDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p610ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.HeartRateDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeartRateDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HeartRateDayFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n99#2,7:315\n106#2,3:323\n79#2,7:326\n109#2:333\n1#3:322\n*S KotlinDebug\n*F\n+ 1 HeartRateDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HeartRateDayFragment\n*L\n94#1:315,7\n94#1:323,3\n94#1:326,7\n94#1:333\n94#1:322\n*E\n"})
public final class HeartRateDayFragment extends BaseDetailDaysFragment<HeartRate> {
    public LineDataSet setValue;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1110XIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.lineChart_delegate$lambda$0(this.f4209IO);
        }
    });

    @aa1
    private final Lazy minHrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO110
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.minHrValue_delegate$lambda$0(this.f4708IO);
        }
    });

    @aa1
    private final Lazy maxHrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oii100I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.maxHrValue_delegate$lambda$0(this.f3813IO);
        }
    });

    @aa1
    private final Lazy avHrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i00IIOiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.avHrValue_delegate$lambda$0(this.f7269IO);
        }
    });

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIX10O0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.measurePanel_delegate$lambda$0(this.f7899IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX1XI1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.btnMeasure_delegate$lambda$0(this.f1976IO);
        }
    });

    @aa1
    private final Lazy healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iO1X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.healthLayout_delegate$lambda$0(this.f7483IO);
        }
    });

    @aa1
    private final Lazy healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIX1XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.healthBtn_delegate$lambda$0(this.f3037IO);
        }
    });

    @aa1
    private final Lazy healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXIXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.healthTv_delegate$lambda$0(this.f5121IO);
        }
    });

    @aa1
    private final Lazy healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i01OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.healthTipLayout_delegate$lambda$0(this.f7305IO);
        }
    });

    @aa1
    private final Lazy healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateDayFragment.healthQuestions_delegate$lambda$0(this.f1030IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();
    private final int dayMinute = O0X11OiO.XIi00iiXO();

    @aa1
    private HeartRateDao mHeartRateDao = MyDb.INSTANCE.getMDatabase().heartRateDao();

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            HeartRateDayFragment.this.updateItemData(e);
            int iOIX0iXi = (int) e.OIX0iXi();
            int i = iOIX0iXi / 60;
            HeartRateDayFragment.this.getMCalendar().set(11, i);
            HeartRateDayFragment.this.getMCalendar().set(12, iOIX0iXi - (i * 60));
            HeartRateDayFragment.this.getNowTimeDetails().setText(TimeUtils.millis2String(HeartRateDayFragment.this.getMCalendar().getTimeInMillis() - ((long) 60000), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    private final void addLastData(List<HeartRate> list) {
        if (this.values.isEmpty() || list.isEmpty()) {
            return;
        }
        LogUtils.m11130i("filterData", "last:" + ((HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(list)).getMBpm());
        ((Entry) CollectionsKt___CollectionsKt.Xi1XO00(this.values)).I0IIOi((float) ((HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(list)).getMBpm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold avHrValue_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (DINCondBold) heartRateDayFragment.getMView().findViewById(R.id.avHrValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return heartRateDayFragment.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<HeartRate> list) {
        boolean zI0i0;
        String string;
        this.values.clear();
        HRDayData hRDayDataFilterMinuteData = HRDataParse.INSTANCE.filterMinuteData(getRange(), list, this.values);
        getMinHrValue().setText(UtilsKt.iXiiiO(hRDayDataFilterMinuteData.getMin()));
        getMaxHrValue().setText(UtilsKt.iXiiiO(hRDayDataFilterMinuteData.getMax()));
        getAvHrValue().setText(UtilsKt.iXiiiO(hRDayDataFilterMinuteData.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(hRDayDataFilterMinuteData.getAvg()));
        addLastData(list);
        updateChartData(this.values);
        if (list.isEmpty()) {
            return;
        }
        HeartRate heartRate = (HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(list);
        if (heartRate.getMBpm() == 0) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        long mTime = heartRate.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1("heart_rate", mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i1 = i72Var.I0i0();
        if (i72Var.OIIOI()) {
            string = getString(R.string.hr_ai_health_analysis_v2);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            zI0i0 = i72Var.I0i0();
        } else {
            zI0i0 = zI0i1;
            string = "";
        }
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        String str = string;
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), "heart_rate", heartRate.getMBpm() + getString(R.string.bpm), heartRate.getMTime(), str, zI0i0);
    }

    private final DINCondBold getAvHrValue() {
        return (DINCondBold) this.avHrValue$delegate.getValue();
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

    private final LineChart getLineChart() {
        return (LineChart) this.lineChart$delegate.getValue();
    }

    private final DINCondBold getMaxHrValue() {
        return (DINCondBold) this.maxHrValue$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    private final DINCondBold getMinHrValue() {
        return (DINCondBold) this.minHrValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (Button) heartRateDayFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (LinearLayout) heartRateDayFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (PFMedium) heartRateDayFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (LinearLayout) heartRateDayFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (PFMedium) heartRateDayFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final HeartRateDayFragment heartRateDayFragment, View view) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1O00IX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeartRateDayFragment.initView$lambda$0$0(this.f2732IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(HeartRateDayFragment heartRateDayFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 0);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(heartRateDayFragment.getActivity(), (Class<?>) RealTimeMeasurementActivity.class);
        intent.putExtras(bundle);
        heartRateDayFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (LineChart) heartRateDayFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxHrValue_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (DINCondBold) heartRateDayFragment.getMView().findViewById(R.id.maxHrValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return heartRateDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minHrValue_delegate$lambda$0(HeartRateDayFragment heartRateDayFragment) {
        return (DINCondBold) heartRateDayFragment.getMView().findViewById(R.id.minHrValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> list) {
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(list, setDataLabel()));
            getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hr_color));
            getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hr_color));
            getSetValue().I1XII0X(2.0f);
            getSetValue().iXOII(1.0f);
            getSetValue().IOI0i0I(false);
            getSetValue().XXI(false);
            getSetValue().O1iXiI(true);
            Drawable drawable = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hr);
            Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            getSetValue().I0i1OXiI(drawable);
            C2305co c2305co = new C2305co(getSetValue());
            c2305co.m1316iI(false);
            getLineChart().setData(c2305co);
        } else {
            LogUtils.m11130i("updateChartData", "values:" + list.size() + list);
            T tOIX0iXi = ((C2305co) getLineChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            setSetValue((LineDataSet) tOIX0iXi);
            getSetValue().IOX1(list);
            getSetValue().i0X1iIO();
            ((C2305co) getLineChart().getData()).mo1167iX();
            getLineChart().X0i1O();
        }
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        getLineChart().II1Xi0(list.size() == 0 ? 0.0f : list.get(list.size() - 1).OIX0iXi(), 0);
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet lineDataSet = this.setValue;
        if (lineDataSet != null) {
            return lineDataSet;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (q62.OXO1.iOi1010()) {
            View measurePanel = getMeasurePanel();
            if (measurePanel != null) {
                measurePanel.setVisibility(0);
            }
            View btnMeasure = getBtnMeasure();
            if (btnMeasure != null) {
                btnMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I01iX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HeartRateDayFragment.initView$lambda$0(this.f1102IO, view);
                    }
                });
            }
        } else {
            View measurePanel2 = getMeasurePanel();
            if (measurePanel2 != null) {
                measurePanel2.setVisibility(8);
            }
        }
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 210.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        xAxis.IXOIIIO(this.dayMinute / 6);
        xAxis.i0X000X0O(-10.0f);
        xAxis.iOiXi11II(this.dayMinute + 10.0f);
        SimpleDateFormat simpleDateFormatXXiIiX10 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList arrayList = new ArrayList();
        int i = this.dayMinute;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                String strMillis2String = TimeUtils.millis2String(getRange()[0] + ((long) (60000 * i2)), simpleDateFormatXXiIiX10);
                if (arrayList.size() > 12 && Intrinsics.XOO0ii0(strMillis2String, "0")) {
                    strMillis2String = X10i1i.XOOXII;
                }
                Intrinsics.XXI(strMillis2String);
                arrayList.add(strMillis2String);
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        LineChart lineChart2 = getLineChart();
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
        getLineChart().setOnChartValueSelectedListener(new OXO1(O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_hr_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<HeartRate> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.IiI10X("onHeartRateChanged! refresh");
        setMOffset(0);
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        String strOII = O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod());
        if (TimePeriod.DAY == getMTimePeriod()) {
            if (Intrinsics.XOO0ii0(O0X11OiO.X0i1O(null, 1, null).format(new Date()), strOII)) {
                getTvCurrent().setText(R.string.today);
            } else {
                getTvCurrent().setText(strOII);
            }
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<HeartRate> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return this.mHeartRateDao.getHeartRates(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "HR day Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(String.valueOf((int) e.O00()));
    }
}
