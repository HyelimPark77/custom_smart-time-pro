package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.ECGDataParse;
import com.sma.smartv3.model.ECGDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ElectrocardiogramDao;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.EcgDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.MyLineChart;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EcgDayFragment extends BaseDetailDaysFragment<Electrocardiogram> {
    public LineDataSet setValue;
    private float xTargetNumber;

    @aa1
    private final String TAG = "EcgDayFragment";

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgDayFragment.lineChart_delegate$lambda$0(this.f4376IO);
        }
    });

    @aa1
    private final Lazy minEcgValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIiX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgDayFragment.minEcgValue_delegate$lambda$0(this.f4626IO);
        }
    });

    @aa1
    private final Lazy maxEcgValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi01I0iX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgDayFragment.maxEcgValue_delegate$lambda$0(this.f3618IO);
        }
    });

    @aa1
    private final Lazy avEcgValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXIXX1OiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgDayFragment.avEcgValue_delegate$lambda$0(this.f8329IO);
        }
    });

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIOOiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgDayFragment.measurePanel_delegate$lambda$0(this.f3229IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();
    private final int dayMinute = O0X11OiO.XIi00iiXO() * 60;

    @aa1
    private final ElectrocardiogramDao mElectrocardiogram = MyDb.INSTANCE.getMDatabase().electrocardiogramDao();
    private final float mAxisMaximum = 200.0f;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            EcgDayFragment.this.updateItemData(e);
            int iOIX0iXi = (int) e.OIX0iXi();
            Calendar calendar = Calendar.getInstance();
            int i = iOIX0iXi / 60;
            calendar.set(11, i / 60);
            calendar.set(12, i % 60);
            calendar.set(13, iOIX0iXi % 60);
            EcgDayFragment.this.getNowTimeDetails().setText(TimeUtils.millis2String(calendar.getTimeInMillis(), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold avEcgValue_delegate$lambda$0(EcgDayFragment ecgDayFragment) {
        return (DINCondBold) ecgDayFragment.getMView().findViewById(R.id.avHrValue);
    }

    private final void filterData(List<Electrocardiogram> list) {
        LogUtils.m11128d(this.TAG + " filterData heartRates.size = " + list.size());
        this.values.clear();
        ECGDayData eCGDayData = new ECGDayData(0, 0, 0, null, 15, null);
        if (!list.isEmpty()) {
            eCGDayData = ECGDataParse.INSTANCE.filterMinuteData(getRange(), list, this.values);
        }
        getMinEcgValue().setText(UtilsKt.iXiiiO(eCGDayData.getMin()));
        getMaxEcgValue().setText(UtilsKt.iXiiiO(eCGDayData.getMax()));
        getAvEcgValue().setText(UtilsKt.iXiiiO(eCGDayData.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(eCGDayData.getAvg()));
        MyLineChart lineChart = getLineChart();
        if (this.values.size() == 0) {
            lineChart.setDragEnabled(false);
            lineChart.setDisallowIntercept(false);
            lineChart.iiII(0.0f, 1.0f, 0.0f, 0.0f);
        } else {
            lineChart.setDisallowIntercept(true);
            lineChart.setDragEnabled(true);
            lineChart.iiII(150.0f, 1.0f, 0.0f, 0.0f);
        }
        updateChartData(this.values);
    }

    private final DINCondBold getAvEcgValue() {
        return (DINCondBold) this.avEcgValue$delegate.getValue();
    }

    private final MyLineChart getLineChart() {
        return (MyLineChart) this.lineChart$delegate.getValue();
    }

    private final DINCondBold getMaxEcgValue() {
        return (DINCondBold) this.maxEcgValue$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    private final DINCondBold getMinEcgValue() {
        return (DINCondBold) this.minEcgValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyLineChart lineChart_delegate$lambda$0(EcgDayFragment ecgDayFragment) {
        return (MyLineChart) ecgDayFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxEcgValue_delegate$lambda$0(EcgDayFragment ecgDayFragment) {
        return (DINCondBold) ecgDayFragment.getMView().findViewById(R.id.maxHrValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(EcgDayFragment ecgDayFragment) {
        return ecgDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minEcgValue_delegate$lambda$0(EcgDayFragment ecgDayFragment) {
        return (DINCondBold) ecgDayFragment.getMView().findViewById(R.id.minHrValue);
    }

    private final void setLineChartXAxis() {
        XAxis xAxis = getLineChart().getXAxis();
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(xAxis);
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context);
        int i = 0;
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        this.xTargetNumber = this.dayMinute;
        getLineChart().getXAxis().IXOIIIO(this.xTargetNumber / 6);
        xAxis.i0X000X0O(-1.0f);
        xAxis.iOiXi11II(this.dayMinute + 1.0f);
        ArrayList arrayList = new ArrayList();
        int i2 = this.dayMinute;
        if (i2 >= 0) {
            while (true) {
                arrayList.add(String.valueOf((i / 60) / 60));
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> list) {
        float fOIX0iXi;
        LogUtils.m11128d(this.TAG + " updateChartData values.size = " + list.size());
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(list, setDataLabel()));
            getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hr_color));
            getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hr_color));
            getSetValue().I1XII0X(1.0f);
            getSetValue().iXOII(1.0f);
            getSetValue().OXOO0X0i(false);
            getSetValue().IOI0i0I(false);
            getSetValue().XXI(false);
            getSetValue().O1iXiI(false);
            getSetValue().OXXO0O1X(LineDataSet.Mode.HORIZONTAL_BEZIER);
            C2305co c2305co = new C2305co(getSetValue());
            c2305co.m1316iI(false);
            getLineChart().setData(c2305co);
        } else {
            T tOIX0iXi = ((C2305co) getLineChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            setSetValue((LineDataSet) tOIX0iXi);
            getSetValue().IOX1(list);
            getSetValue().OXXO0O1X(LineDataSet.Mode.HORIZONTAL_BEZIER);
            getSetValue().i0X1iIO();
            ((C2305co) getLineChart().getData()).mo1167iX();
            getLineChart().X0i1O();
        }
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        MyLineChart lineChart = getLineChart();
        if (list.size() == 0) {
            fOIX0iXi = 0.0f;
        } else {
            if (list.size() > 60) {
                getLineChart().Xi1i0XOX0(list.get(list.size() - 50).OIX0iXi());
            } else {
                getLineChart().Xi1i0XOX0(list.get(0).OIX0iXi());
            }
            fOIX0iXi = list.get(list.size() - 1).OIX0iXi();
        }
        lineChart.II1Xi0(fOIX0iXi, 0);
    }

    public final float getMAxisMaximum() {
        return this.mAxisMaximum;
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

    public final float getXTargetNumber() {
        return this.xTargetNumber;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        LogUtils.m11128d(this.TAG + " initView");
        View measurePanel = getMeasurePanel();
        if (measurePanel != null) {
            measurePanel.setVisibility(8);
        }
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        MyLineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 0.0f, 30.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        setLineChartXAxis();
        MyLineChart lineChart2 = getLineChart();
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        lineChart2.getAxisLeft().iOiXi11II(this.mAxisMaximum);
        lineChart2.getAxisRight().iOiXi11II(this.mAxisMaximum);
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
        getLineChart().setOnChartValueSelectedListener(new OXO1(O0X11OiO.iX1O1()));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_ecg_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Electrocardiogram> data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d(this.TAG + " onDataChange");
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
    public List<Electrocardiogram> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return this.mElectrocardiogram.getElectrocardiograms(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "ecg day Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    public final void setXTargetNumber(float f) {
        this.xTargetNumber = f;
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(String.valueOf((int) e.O00()));
    }
}
