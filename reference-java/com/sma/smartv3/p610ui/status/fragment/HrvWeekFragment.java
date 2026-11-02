package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.uf1;
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
import com.sma.smartv3.p610ui.status.base.BaseDetailsWeekFragment;
import com.sma.smartv3.p610ui.status.fragment.HrvWeekFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HrvWeekFragment extends BaseDetailsWeekFragment<Hrv> {
    public LineDataSet setValue;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIIiI0I1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvWeekFragment.lineChart_delegate$lambda$0(this.f4525IO);
        }
    });

    @aa1
    private final Lazy minValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X11X1IO00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvWeekFragment.minValue_delegate$lambda$0(this.f4228IO);
        }
    });

    @aa1
    private final Lazy maxValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiOXi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvWeekFragment.maxValue_delegate$lambda$0(this.f5315IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();

    @aa1
    private final LinkedHashMap<Long, ArrayList<Hrv>> weekData = new LinkedHashMap<>();

    @aa1
    private final HrvDao mHrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();

    @aa1
    private final List<HRVDayData> hrvDayDataList = new ArrayList();

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i11IXI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvWeekFragment.measurePanel_delegate$lambda$0(this.f7541IO);
        }
    });

    public static final class OXO1 implements uf1 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            HrvWeekFragment.this.updateItemData(e);
            by6 by6Var = HrvWeekFragment.this.getWeekDay().get((int) e.OIX0iXi());
            List<String> listM789OO = O0X11OiO.m789OO(by6Var.O00());
            String str = listM789OO.get(0);
            String str2 = listM789OO.get(1);
            HrvWeekFragment.this.getNowTimeDetails().setText(((Object) str) + "/" + ((Object) str2) + " " + by6Var.IiI10X());
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
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
    public static final LineChart lineChart_delegate$lambda$0(HrvWeekFragment hrvWeekFragment) {
        return (LineChart) hrvWeekFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxValue_delegate$lambda$0(HrvWeekFragment hrvWeekFragment) {
        return (DINCondBold) hrvWeekFragment.getMView().findViewById(R.id.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(HrvWeekFragment hrvWeekFragment) {
        return hrvWeekFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minValue_delegate$lambda$0(HrvWeekFragment hrvWeekFragment) {
        return (DINCondBold) hrvWeekFragment.getMView().findViewById(R.id.minValue);
    }

    public final void clearCache(long j) {
        this.weekData.clear();
        for (int i = 1; i < 8; i++) {
            this.weekData.put(Long.valueOf((((long) (86400 * i)) * 1000) + j), new ArrayList<>());
        }
    }

    public final void filterData(@aa1 List<Hrv> hrvs) {
        Intrinsics.X0O(hrvs, "hrvs");
        this.values.clear();
        HRVDataParse.INSTANCE.filterDayData(getMActivity(), hrvs, this.weekData, this.hrvDayDataList, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(0));
        getMaxValue().setText(UtilsKt.iXiiiO(0));
        getNowValue().setText(UtilsKt.iXiiiO(0));
        updateChartData(this.values);
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

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMeasurePanel().setVisibility(8);
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 200.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        setWeekDay(O0X11OiO.IXXOO(getMCalendar().getTimeInMillis()));
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.IO0II0i(true);
        xAxis.IXOIIIO(1.0f);
        xAxis.i0X000X0O(-1.0f);
        xAxis.iOiXi11II(7.0f);
        ArrayList arrayList = new ArrayList();
        Iterator<by6> it = getWeekDay().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().IiI10X());
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        LineChart lineChart2 = getLineChart();
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
        getLineChart().setOnChartValueSelectedListener(new OXO1());
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), 0, getMTimePeriod()));
        super.initView();
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

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Hrv> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setWeekDay(O0X11OiO.IXXOO(jArrM787I1[0]));
        clearCache(jArrM787I1[0]);
        return this.mHrvDao.getHrv(jArrM787I1[0], jArrM787I1[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "HRV week Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateChartData(@aa1 List<Entry> values) {
        Intrinsics.X0O(values, "values");
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(values, setDataLabel()));
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
            getSetValue().IOX1(values);
            getSetValue().i0X1iIO();
            ((C2305co) getLineChart().getData()).mo1167iX();
            getLineChart().X0i1O();
        }
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        getLineChart().II1Xi0(values.size() == 0 ? 0.0f : values.get(values.size() - 1).OIX0iXi(), 0);
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        HRVDayData hRVDayData = this.hrvDayDataList.get((int) e.OIX0iXi());
        getMinValue().setText(UtilsKt.iXiiiO(hRVDayData.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(hRVDayData.getMax()));
        getNowValue().setText(UtilsKt.iXiiiO(hRVDayData.getAvg()));
    }
}
