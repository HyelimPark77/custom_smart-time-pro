package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.O1Ii1OI01;
import com.android.mltcode.paycertificationapi.O1OI1;
import com.android.mltcode.paycertificationapi.X00Ii1;
import com.android.mltcode.paycertificationapi.X0X0Ii0;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iI1I0O11O;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.model.BloodGlucoseDataParse;
import com.sma.smartv3.model.BloodGlucoseDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailsMonthFragment;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseMonthFragment extends BaseDetailsMonthFragment<BloodGlucose> {

    @aa1
    private final Lazy avgValue$delegate;

    @aa1
    private final List<BloodGlucoseDayData> bloodGlucoseDayDataList;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao;

    @aa1
    private final Lazy maxValue$delegate;

    @aa1
    private final Lazy minValue$delegate;

    @aa1
    private final Lazy monitorRetVal$delegate;

    @aa1
    private final LinkedHashMap<Long, ArrayList<BloodGlucose>> monthData;
    private List<String> monthDays;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ BloodGlucoseMonthFragment OXO1;

        public OXO1(BloodGlucoseMonthFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r2, X110O r3) {
            Intrinsics.X0O(r2, "e");
            Intrinsics.X0O(r3, "h");
            this.OXO1.updateItemData(r2);
            List r4 = BloodGlucoseMonthFragment.access$getMonthDays$p(this.OXO1);
            if (r4 != null) goto L5;
            Intrinsics.XXO("monthDays");
            r4 = null;
        L5:
            List<String> r5 = O0X11OiO.OO((String) r4.get((int) r2.OIX0iXi()));
            this.OXO1.getNowTimeDetails().setText(r5.get(0) + "/" + r5.get(1));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public static final class XIi00iiXO extends q4 {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            StringCompanionObject r0 = StringCompanionObject.OXO1;
            String r3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r2 / 10.0f)}, 1));
            Intrinsics.O10IXXX0X(r3, "format(...)");
            return r3;
        }
    }

    public BloodGlucoseMonthFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new O1Ii1OI01(this));
        this.minValue$delegate = LazyKt__LazyJVMKt.iO(new X00Ii1(this));
        this.maxValue$delegate = LazyKt__LazyJVMKt.iO(new O1OI1(this));
        this.avgValue$delegate = LazyKt__LazyJVMKt.iO(new X0X0Ii0(this));
        this.monitorRetVal$delegate = LazyKt__LazyJVMKt.iO(new iI1I0O11O(this));
        this.values = new ArrayList();
        this.monthData = new LinkedHashMap();
        this.mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
        this.bloodGlucoseDayDataList = new ArrayList();
    }

    public static /* synthetic */ LineChart I1XOi1(BloodGlucoseMonthFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O10IXXX0X(BloodGlucoseMonthFragment r0) {
        return maxValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(BloodGlucoseMonthFragment r0) {
        return minValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(BloodGlucoseMonthFragment r0) {
        return avgValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(BloodGlucoseMonthFragment r0) {
        return monitorRetVal_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ List access$getMonthDays$p(BloodGlucoseMonthFragment r0) {
        return r0.monthDays;
    }

    private static final DINCondBold avgValue_delegate$lambda$0(BloodGlucoseMonthFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.avValue);
    }

    private final void filterData(List<BloodGlucose> r8) {
        this.values.clear();
        BloodGlucoseDataParse.INSTANCE.filterDayData(getMActivity(), r8, this.monthData, this.bloodGlucoseDayDataList, this.values);
        getMinValue().setText(UtilsKt.i010I(0));
        getMaxValue().setText(UtilsKt.i010I(0));
        getAvgValue().setText(UtilsKt.i010I(0));
        getNowValue().setText(UtilsKt.i010I(0));
        DINCondBold r9 = getMonitorRetVal();
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r1 = String.format("%s", Arrays.copyOf(new Object[]{HelpFormatter.DEFAULT_LONG_OPT_PREFIX}, 1));
        Intrinsics.O10IXXX0X(r1, "format(...)");
        r9.setText(r1);
        updateChartData(this.values);
    }

    private final DINCondBold getAvgValue() {
        return (DINCondBold) getValue();
    }

    private final LineChart getLineChart() {
        return (LineChart) getValue();
    }

    private final DINCondBold getMaxValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getMonitorRetVal() {
        return (DINCondBold) getValue();
    }

    private static final LineChart lineChart_delegate$lambda$0(BloodGlucoseMonthFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxValue_delegate$lambda$0(BloodGlucoseMonthFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxValue);
    }

    private static final DINCondBold minValue_delegate$lambda$0(BloodGlucoseMonthFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minValue);
    }

    private static final DINCondBold monitorRetVal_delegate$lambda$0(BloodGlucoseMonthFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.monitoring_results_value);
    }

    private final void setChartxAxis() {
        XAxis r0 = getLineChart().getXAxis();
        iO1Xi1X1i r1 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r0);
        Context r2 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r2, "getContext(...)");
        int r3 = 0;
        r1.OIi0(r0, false, r2);
        r0.IXOIIIO(5.0f);
        r0.i0X000X0O(0.0f);
        List<String> r4 = this.monthDays;
        List<String> r5 = null;
        if (r4 != null) goto L5;
        Intrinsics.XXO("monthDays");
        r4 = null;
    L5:
        r0.iOiXi11II(r4.size());
        ArrayList r6 = new ArrayList();
        List<String> r7 = this.monthDays;
        if (r7 != null) goto L8;
        Intrinsics.XXO("monthDays");
    L9:
        Iterator<T> r8 = r5.iterator();
    L11:
        if (r8.hasNext() == false) goto L13;
        r3 = r3 + 1;
        r8.next();
        r6.add(String.valueOf(r3));
        goto L11
    L13:
        r0.Oi(new q4(r6));
        return;
    L8:
        r5 = r7;
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> r6) {
        setChartxAxis();
        if (getLineChart().getData() != 0) goto L5;
    L7:
        setSetValue(new LineDataSet(r6, setDataLabel()));
        getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
        getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
        getSetValue().I1XII0X(2.0f);
        getSetValue().iXOII(1.0f);
        getSetValue().IOI0i0I(false);
        getSetValue().XXI(false);
        getSetValue().O1iXiI(true);
        Drawable r0 = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hr);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        getSetValue().I0i1OXiI(r0);
        co r1 = new co(new IiXO1XOi[]{getSetValue()});
        r1.iI(false);
        getLineChart().setData(r1);
    L8:
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        LineChart r2 = getLineChart();
        if (r6.size() != 0) goto L11;
        float r7 = 0.0f;
    L12:
        r2.II1Xi0(r7, 0);
        return;
    L11:
        r7 = r6.get(r6.size() - 1).OIX0iXi();
        goto L12
    L5:
        if (((co) getLineChart().getData()).XXI() <= 0) goto L7;
        T r3 = ((co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        setSetValue((LineDataSet) r3);
        getSetValue().IOX1(r6);
        getSetValue().i0X1iIO();
        ((co) getLineChart().getData()).iX();
        getLineChart().X0i1O();
        goto L8
    }

    public final void clearCache(long r8) {
        this.monthData.clear();
        List<String> r0 = this.monthDays;
        if (r0 != null) goto L5;
        Intrinsics.XXO("monthDays");
        r0 = null;
    L5:
        int r1 = r0.size();
        int r2 = 1;
        if (1 > r1) goto L10;
    L7:
        this.monthData.put(Long.valueOf((((long) (86400 * r2)) * 1000) + r8), new ArrayList());
        if (r2 == r1) goto L12;
        r2 = r2 + 1;
        goto L7
    L12:
        return;
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        LineChart r1 = getLineChart();
        Intrinsics.O10IXXX0X(r1, "<get-lineChart>(...)");
        r0.XIi00iiXO(r1);
        YAxis r2 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r2, "getAxisLeft(...)");
        YAxis r3 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r3, "getAxisRight(...)");
        r0.OIX0iXi(r2, r3, 80.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        this.monthDays = O0X11OiO.XiOIO(getMCalendar().getTimeInMillis(), null, 2, null);
        setChartxAxis();
        LineChart r4 = getLineChart();
        r4.getDescription().XOO0ii0(false);
        r4.getLegend().XOO0ii0(false);
        r4.setScaleEnabled(false);
        O11X1i1 r5 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r5.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r5);
        getLineChart().setOnChartValueSelectedListener(new OXO1(this));
        getLineChart().getAxisRight().Oi(new XIi00iiXO());
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), 0, getMTimePeriod()));
        ((LinearLayout) getMView().findViewById(R.id.ll_max_value)).setVisibility(8);
        ((LinearLayout) getMView().findViewById(R.id.ll_min_value)).setVisibility(8);
        ((LinearLayout) getMView().findViewById(R.id.ll_monitoring_results_value)).setVisibility(0);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_blood_glucose_month;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodGlucose> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodGlucose> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        this.monthDays = O0X11OiO.XiOIO(r8[0], null, 2, null);
        clearCache(r8[0]);
        return this.mBloodGlucoseDao.getListDesc(r8[0], r8[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodGlucose month Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void updateItemData(@aa1 Entry r3) {
        Intrinsics.X0O(r3, "e");
        BloodGlucoseDayData r4 = this.bloodGlucoseDayDataList.get((int) r3.OIX0iXi());
        getMinValue().setText(UtilsKt.i010I(r4.getMin()));
        getMaxValue().setText(UtilsKt.i010I(r4.getMax()));
        getAvgValue().setText(UtilsKt.i010I(r4.getAvg()));
        getNowValue().setText(UtilsKt.i010I(r4.getAvg()));
        getMonitorRetVal().setText(r4.getStatus());
    }
}
