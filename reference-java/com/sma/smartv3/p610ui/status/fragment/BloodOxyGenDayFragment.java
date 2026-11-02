package com.sma.smartv3.p610ui.status.fragment;

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
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.BloodOxyGenDataParse;
import com.sma.smartv3.model.BloodOxyGenDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p610ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodOxyGenDayFragment;
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
@SourceDebugExtension({"SMAP\nBloodOxyGenDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1869#2,2:260\n99#3,7:262\n106#3,3:270\n79#3,7:273\n109#3:280\n1#4:269\n*S KotlinDebug\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n*L\n235#1:260,2\n94#1:262,7\n94#1:270,3\n94#1:273,7\n94#1:280\n94#1:269\n*E\n"})
public final class BloodOxyGenDayFragment extends BaseDetailDaysFragment<BloodOxygen> {
    private float highlight;
    public LineDataSet setValue;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i10X1000
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.lineChart_delegate$lambda$0(this.f7517IO);
        }
    });

    @aa1
    private final Lazy minValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIIIO0I0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.minValue_delegate$lambda$0(this.f2964IO);
        }
    });

    @aa1
    private final Lazy maxValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.maxValue_delegate$lambda$0(this.f3656IO);
        }
    });

    @aa1
    private final Lazy avValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXO0XiIii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.avValue_delegate$lambda$0(this.f5047IO);
        }
    });

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1Oi0O1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.measurePanel_delegate$lambda$0(this.f8039IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0OXiOIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.btnMeasure_delegate$lambda$0(this.f4008IO);
        }
    });

    @aa1
    private final Lazy healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiIi0XOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.healthLayout_delegate$lambda$0(this.f8591IO);
        }
    });

    @aa1
    private final Lazy healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOXiiX0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.healthBtn_delegate$lambda$0(this.f4885IO);
        }
    });

    @aa1
    private final Lazy healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii011IO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.healthTv_delegate$lambda$0(this.f8517IO);
        }
    });

    @aa1
    private final Lazy healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1iX0Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.healthTipLayout_delegate$lambda$0(this.f4491IO);
        }
    });

    @aa1
    private final Lazy healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0OOOIOiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenDayFragment.healthQuestions_delegate$lambda$0(this.f1167IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();
    private final int dayMinute = O0X11OiO.XIi00iiXO();

    @aa1
    private final BloodOxygenDao mBloodOxyGenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            BloodOxyGenDayFragment.this.updateItemData(e);
            int iOIX0iXi = (int) e.OIX0iXi();
            int i = iOIX0iXi / 60;
            BloodOxyGenDayFragment.this.getMCalendar().set(11, i);
            BloodOxyGenDayFragment.this.getMCalendar().set(12, iOIX0iXi - (i * 60));
            BloodOxyGenDayFragment.this.getNowTimeDetails().setText(TimeUtils.millis2String(BloodOxyGenDayFragment.this.getMCalendar().getTimeInMillis(), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold avValue_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (DINCondBold) bloodOxyGenDayFragment.getMView().findViewById(R.id.avValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return bloodOxyGenDayFragment.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<BloodOxygen> list) {
        this.values.clear();
        BloodOxyGenDayData bloodOxyGenDayDataFilterMinuteData = BloodOxyGenDataParse.INSTANCE.filterMinuteData(getRange(), list, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(bloodOxyGenDayDataFilterMinuteData.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(bloodOxyGenDayDataFilterMinuteData.getMax()));
        getAvValue().setText(UtilsKt.iXiiiO(bloodOxyGenDayDataFilterMinuteData.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(bloodOxyGenDayDataFilterMinuteData.getAvg()));
        updateChartData(this.values);
        if (list.isEmpty()) {
            return;
        }
        BloodOxygen bloodOxygen = (BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(list);
        if (bloodOxygen.getMValue() == 0) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        long mTime = bloodOxygen.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1(q62.IiOIO1OX, mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i0 = i72Var.OIIOI() ? false : i72Var.I0i0();
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), q62.IiOIO1OX, bloodOxygen.getMValue() + "%", bloodOxygen.getMTime(), "", zI0i0);
    }

    private final DINCondBold getAvValue() {
        return (DINCondBold) this.avValue$delegate.getValue();
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

    private final DINCondBold getMaxValue() {
        return (DINCondBold) this.maxValue$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) this.minValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (Button) bloodOxyGenDayFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (LinearLayout) bloodOxyGenDayFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (PFMedium) bloodOxyGenDayFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (LinearLayout) bloodOxyGenDayFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (PFMedium) bloodOxyGenDayFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final BloodOxyGenDayFragment bloodOxyGenDayFragment, View view) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi1OXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodOxyGenDayFragment.initView$lambda$0$0(this.f5230IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(BloodOxyGenDayFragment bloodOxyGenDayFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(bloodOxyGenDayFragment.getActivity(), (Class<?>) RealTimeMeasurementActivity.class);
        intent.putExtras(bundle);
        bloodOxyGenDayFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (LineChart) bloodOxyGenDayFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxValue_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (DINCondBold) bloodOxyGenDayFragment.getMView().findViewById(R.id.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return bloodOxyGenDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minValue_delegate$lambda$0(BloodOxyGenDayFragment bloodOxyGenDayFragment) {
        return (DINCondBold) bloodOxyGenDayFragment.getMView().findViewById(R.id.minValue);
    }

    private final void showError() {
        ToastUtils.showLong(R.string.measurement_failed_again);
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
        for (Entry entry : list) {
            if (entry.O00() > 0.0f) {
                this.highlight = entry.OIX0iXi();
            }
        }
        getLineChart().II1Xi0(this.highlight, 0);
    }

    public final float getHighlight() {
        return this.highlight;
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
                btnMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XOIXO1I
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BloodOxyGenDayFragment.initView$lambda$0(this.f4774IO, view);
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
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 100.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
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
        return R.layout.fragment_status_blood_oxygen_day;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodoxygenChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.IiI10X("onBloodOxygenChanged! refresh");
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
    public void onDataChange(@aa1 List<BloodOxygen> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodOxygen> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return this.mBloodOxyGenDao.getBloodOxygen(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodOxyGen day Data";
    }

    public final void setHighlight(float f) {
        this.highlight = f;
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(String.valueOf((int) e.O00()));
    }
}
