package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.model.BloodGlucoseDataParse;
import com.sma.smartv3.model.BloodGlucoseDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodGlucoseDao;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import com.sma.smartv3.p610ui.status.base.BaseDetailsMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucoseMonthFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseMonthFragment extends BaseDetailsMonthFragment<BloodGlucose> {
    private List<String> monthDays;
    public LineDataSet setValue;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1Ii1OI01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMonthFragment.lineChart_delegate$lambda$0(this.f2724IO);
        }
    });

    @aa1
    private final Lazy minValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X00Ii1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMonthFragment.minValue_delegate$lambda$0(this.f3873IO);
        }
    });

    @aa1
    private final Lazy maxValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMonthFragment.maxValue_delegate$lambda$0(this.f2744IO);
        }
    });

    @aa1
    private final Lazy avgValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0X0Ii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMonthFragment.avgValue_delegate$lambda$0(this.f4022IO);
        }
    });

    @aa1
    private final Lazy monitorRetVal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1I0O11O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMonthFragment.monitorRetVal_delegate$lambda$0(this.f7820IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();

    @aa1
    private final LinkedHashMap<Long, ArrayList<BloodGlucose>> monthData = new LinkedHashMap<>();

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();

    @aa1
    private final List<BloodGlucoseDayData> bloodGlucoseDayDataList = new ArrayList();

    public static final class OXO1 implements uf1 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            BloodGlucoseMonthFragment.this.updateItemData(e);
            List list = BloodGlucoseMonthFragment.this.monthDays;
            if (list == null) {
                Intrinsics.XXO("monthDays");
                list = null;
            }
            List<String> listM789OO = O0X11OiO.m789OO((String) list.get((int) e.OIX0iXi()));
            BloodGlucoseMonthFragment.this.getNowTimeDetails().setText(((Object) listM789OO.get(0)) + "/" + ((Object) listM789OO.get(1)));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public static final class XIi00iiXO extends C2829q4 {
        @Override // com.android.mltcode.paycertificationapi.C2829q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f / 10.0f)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold avgValue_delegate$lambda$0(BloodGlucoseMonthFragment bloodGlucoseMonthFragment) {
        return (DINCondBold) bloodGlucoseMonthFragment.getMView().findViewById(R.id.avValue);
    }

    private final void filterData(List<BloodGlucose> list) {
        this.values.clear();
        BloodGlucoseDataParse.INSTANCE.filterDayData(getMActivity(), list, this.monthData, this.bloodGlucoseDayDataList, this.values);
        getMinValue().setText(UtilsKt.i010I(0));
        getMaxValue().setText(UtilsKt.i010I(0));
        getAvgValue().setText(UtilsKt.i010I(0));
        getNowValue().setText(UtilsKt.i010I(0));
        DINCondBold monitorRetVal = getMonitorRetVal();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%s", Arrays.copyOf(new Object[]{HelpFormatter.DEFAULT_LONG_OPT_PREFIX}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        monitorRetVal.setText(str);
        updateChartData(this.values);
    }

    private final DINCondBold getAvgValue() {
        return (DINCondBold) this.avgValue$delegate.getValue();
    }

    private final LineChart getLineChart() {
        return (LineChart) this.lineChart$delegate.getValue();
    }

    private final DINCondBold getMaxValue() {
        return (DINCondBold) this.maxValue$delegate.getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) this.minValue$delegate.getValue();
    }

    private final DINCondBold getMonitorRetVal() {
        return (DINCondBold) this.monitorRetVal$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(BloodGlucoseMonthFragment bloodGlucoseMonthFragment) {
        return (LineChart) bloodGlucoseMonthFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxValue_delegate$lambda$0(BloodGlucoseMonthFragment bloodGlucoseMonthFragment) {
        return (DINCondBold) bloodGlucoseMonthFragment.getMView().findViewById(R.id.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minValue_delegate$lambda$0(BloodGlucoseMonthFragment bloodGlucoseMonthFragment) {
        return (DINCondBold) bloodGlucoseMonthFragment.getMView().findViewById(R.id.minValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold monitorRetVal_delegate$lambda$0(BloodGlucoseMonthFragment bloodGlucoseMonthFragment) {
        return (DINCondBold) bloodGlucoseMonthFragment.getMView().findViewById(R.id.monitoring_results_value);
    }

    private final void setChartxAxis() {
        XAxis xAxis = getLineChart().getXAxis();
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(xAxis);
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        int i = 0;
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.IXOIIIO(5.0f);
        xAxis.i0X000X0O(0.0f);
        List<String> list = this.monthDays;
        List<String> list2 = null;
        if (list == null) {
            Intrinsics.XXO("monthDays");
            list = null;
        }
        xAxis.iOiXi11II(list.size());
        ArrayList arrayList = new ArrayList();
        List<String> list3 = this.monthDays;
        if (list3 == null) {
            Intrinsics.XXO("monthDays");
        } else {
            list2 = list3;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            i++;
            it.next();
            arrayList.add(String.valueOf(i));
        }
        xAxis.m603Oi(new C2829q4(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> list) {
        setChartxAxis();
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(list, setDataLabel()));
            getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
            getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
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
        getLineChart().II1Xi0(list.size() == 0 ? 0.0f : list.get(list.size() - 1).OIX0iXi(), 0);
    }

    public final void clearCache(long j) {
        this.monthData.clear();
        List<String> list = this.monthDays;
        if (list == null) {
            Intrinsics.XXO("monthDays");
            list = null;
        }
        int size = list.size();
        int i = 1;
        if (1 > size) {
            return;
        }
        while (true) {
            this.monthData.put(Long.valueOf((((long) (86400 * i)) * 1000) + j), new ArrayList<>());
            if (i == size) {
                return;
            } else {
                i++;
            }
        }
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
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 80.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        this.monthDays = O0X11OiO.XiOIO(getMCalendar().getTimeInMillis(), null, 2, null);
        setChartxAxis();
        LineChart lineChart2 = getLineChart();
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
        getLineChart().setOnChartValueSelectedListener(new OXO1());
        getLineChart().getAxisRight().m603Oi(new XIi00iiXO());
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), 0, getMTimePeriod()));
        ((LinearLayout) getMView().findViewById(R.id.ll_max_value)).setVisibility(8);
        ((LinearLayout) getMView().findViewById(R.id.ll_min_value)).setVisibility(8);
        ((LinearLayout) getMView().findViewById(R.id.ll_monitoring_results_value)).setVisibility(0);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_blood_glucose_month;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodGlucose> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodGlucose> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        this.monthDays = O0X11OiO.XiOIO(jArrM787I1[0], null, 2, null);
        clearCache(jArrM787I1[0]);
        return this.mBloodGlucoseDao.getListDesc(jArrM787I1[0], jArrM787I1[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodGlucose month Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        BloodGlucoseDayData bloodGlucoseDayData = this.bloodGlucoseDayDataList.get((int) e.OIX0iXi());
        getMinValue().setText(UtilsKt.i010I(bloodGlucoseDayData.getMin()));
        getMaxValue().setText(UtilsKt.i010I(bloodGlucoseDayData.getMax()));
        getAvgValue().setText(UtilsKt.i010I(bloodGlucoseDayData.getAvg()));
        getNowValue().setText(UtilsKt.i010I(bloodGlucoseDayData.getAvg()));
        getMonitorRetVal().setText(bloodGlucoseDayData.getStatus());
    }
}
