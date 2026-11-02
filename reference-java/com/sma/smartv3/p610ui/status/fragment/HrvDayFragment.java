package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.HRVDataParse;
import com.sma.smartv3.model.HRVDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.HrvDao;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.p610ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.HrvDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHrvDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrvDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HrvDayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n257#2,2:212\n99#3,7:214\n106#3,3:222\n79#3,7:225\n109#3:232\n1#4:221\n*S KotlinDebug\n*F\n+ 1 HrvDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HrvDayFragment\n*L\n128#1:212,2\n125#1:214,7\n125#1:222,3\n125#1:225,7\n125#1:232\n125#1:221\n*E\n"})
public final class HrvDayFragment extends BaseDetailDaysFragment<Hrv> {
    public LineDataSet setValue;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0i1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvDayFragment.lineChart_delegate$lambda$0(this.f3155IO);
        }
    });

    @aa1
    private final Lazy minValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOO0iI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvDayFragment.minValue_delegate$lambda$0(this.f3254IO);
        }
    });

    @aa1
    private final Lazy maxValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0I1001OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvDayFragment.maxValue_delegate$lambda$0(this.f1113IO);
        }
    });

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvDayFragment.measurePanel_delegate$lambda$0(this.f2391IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiiOO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvDayFragment.btnMeasure_delegate$lambda$0(this.f1924IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();
    private final int dayMinute = O0X11OiO.XIi00iiXO();

    @aa1
    private final HrvDao mHrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            HrvDayFragment.this.updateItemData(e);
            int iOIX0iXi = (int) e.OIX0iXi();
            int i = iOIX0iXi / 60;
            HrvDayFragment.this.getMCalendar().set(11, i);
            HrvDayFragment.this.getMCalendar().set(12, iOIX0iXi - (i * 60));
            HrvDayFragment.this.getNowTimeDetails().setText(TimeUtils.millis2String(HrvDayFragment.this.getMCalendar().getTimeInMillis(), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(HrvDayFragment hrvDayFragment) {
        return hrvDayFragment.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<Hrv> list) {
        this.values.clear();
        HRVDayData hRVDayDataFilterMinuteData = HRVDataParse.INSTANCE.filterMinuteData(getRange(), list, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(hRVDayDataFilterMinuteData.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(hRVDayDataFilterMinuteData.getMax()));
        getNowValue().setText(UtilsKt.iXiiiO(hRVDayDataFilterMinuteData.getAvg()));
        updateChartData(this.values);
    }

    private final View getBtnMeasure() {
        return (View) this.btnMeasure$delegate.getValue();
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
    public static final void initView$lambda$2(final HrvDayFragment hrvDayFragment, View view) {
        i1O0OXO1O.OXO1.IiI10X("start measure HRV");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0OiI10X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrvDayFragment.initView$lambda$2$0(this.f7406IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$0(HrvDayFragment hrvDayFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 5);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(hrvDayFragment.getActivity(), (Class<?>) RealTimeMeasurementActivity.class);
        intent.putExtras(bundle);
        hrvDayFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(HrvDayFragment hrvDayFragment) {
        return (LineChart) hrvDayFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxValue_delegate$lambda$0(HrvDayFragment hrvDayFragment) {
        return (DINCondBold) hrvDayFragment.getMView().findViewById(R.id.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(HrvDayFragment hrvDayFragment) {
        return hrvDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minValue_delegate$lambda$0(HrvDayFragment hrvDayFragment) {
        return (DINCondBold) hrvDayFragment.getMView().findViewById(R.id.minValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> list) {
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(list, setDataLabel()));
            getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
            getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
            getSetValue().I1XII0X(2.0f);
            getSetValue().iXOII(1.0f);
            getSetValue().IOI0i0I(false);
            getSetValue().XXI(false);
            getSetValue().O1iXiI(true);
            Drawable drawable = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hrv);
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
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 200.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
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
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
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
            btnMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XXOO1010
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HrvDayFragment.initView$lambda$2(this.f5063IO, view);
                }
            });
        }
        View viewFindViewById = getMView().findViewById(R.id.ll_hrv_info);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_hrv_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Hrv> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @sf5(tag = I01XX0.OIi0)
    public final void onHrvChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.IiI10X("onHrvChanged! refresh");
        changeTime();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Hrv> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return this.mHrvDao.getHrv(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "HRV day Data";
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
