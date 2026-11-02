package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IX0OXX0II;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iI11IiOOi;
import com.android.mltcode.paycertificationapi.iI1X0ii;
import com.android.mltcode.paycertificationapi.iIIIXOOiI;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iXOXOi;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.model.BloodOxyGenDataParse;
import com.sma.smartv3.model.BloodOxyGenDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailsWeekFragment;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodOxyGenWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxyGenWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenWeekFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1869#2,2:208\n*S KotlinDebug\n*F\n+ 1 BloodOxyGenWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenWeekFragment\n*L\n165#1:208,2\n*E\n"})
public final class BloodOxyGenWeekFragment extends BaseDetailsWeekFragment<BloodOxygen> {

    @aa1
    private final Lazy avgValue$delegate;

    @aa1
    private final List<BloodOxyGenDayData> bloodOxyGenDayDataList;
    private float highlight;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final BloodOxygenDao mBloodOxyGenDao;

    @aa1
    private final Lazy maxValue$delegate;

    @aa1
    private final Lazy minValue$delegate;

    @aa1
    private final Lazy monitorRetVal$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    @aa1
    private final LinkedHashMap<Long, ArrayList<BloodOxygen>> weekData;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ BloodOxyGenWeekFragment OXO1;

        public OXO1(BloodOxyGenWeekFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r3, X110O r4) {
            Intrinsics.X0O(r3, "e");
            Intrinsics.X0O(r4, "h");
            this.OXO1.updateItemData(r3);
            by6 r5 = this.OXO1.getWeekDay().get((int) r3.OIX0iXi());
            List<String> r6 = O0X11OiO.OO(r5.O00());
            this.OXO1.getNowTimeDetails().setText(r6.get(0) + "/" + r6.get(1) + " " + r5.IiI10X());
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public BloodOxyGenWeekFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new iXOXOi(this));
        this.minValue$delegate = LazyKt__LazyJVMKt.iO(new iI1X0ii(this));
        this.maxValue$delegate = LazyKt__LazyJVMKt.iO(new iI11IiOOi(this));
        this.avgValue$delegate = LazyKt__LazyJVMKt.iO(new IX0OXX0II(this));
        this.monitorRetVal$delegate = LazyKt__LazyJVMKt.iO(new iIIIXOOiI(this));
        this.values = new ArrayList();
        this.weekData = new LinkedHashMap();
        this.mBloodOxyGenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
        this.bloodOxyGenDayDataList = new ArrayList();
    }

    public static /* synthetic */ DINCondBold I1XOi1(BloodOxyGenWeekFragment r0) {
        return maxValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart O10IXXX0X(BloodOxyGenWeekFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(BloodOxyGenWeekFragment r0) {
        return avgValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(BloodOxyGenWeekFragment r0) {
        return monitorRetVal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(BloodOxyGenWeekFragment r0) {
        return minValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold avgValue_delegate$lambda$0(BloodOxyGenWeekFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.avValue);
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

    private static final LineChart lineChart_delegate$lambda$0(BloodOxyGenWeekFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxValue_delegate$lambda$0(BloodOxyGenWeekFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxValue);
    }

    private static final DINCondBold minValue_delegate$lambda$0(BloodOxyGenWeekFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minValue);
    }

    private static final DINCondBold monitorRetVal_delegate$lambda$0(BloodOxyGenWeekFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.monitoring_results_value);
    }

    public final void clearCache(long r7) {
        this.weekData.clear();
        int r0 = 1;
    L4:
        if (r0 >= 8) goto L6;
        this.weekData.put(Long.valueOf((((long) (86400 * r0)) * 1000) + r7), new ArrayList());
        r0 = r0 + 1;
        goto L4
    }

    public final void filterData(@aa1 List<BloodOxygen> r8) {
        Intrinsics.X0O(r8, "bloodOxyGens");
        this.values.clear();
        BloodOxyGenDataParse.INSTANCE.filterDayData(getMActivity(), r8, this.weekData, this.bloodOxyGenDayDataList, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(0));
        getMaxValue().setText(UtilsKt.iXiiiO(0));
        getAvgValue().setText(UtilsKt.iXiiiO(0));
        getNowValue().setText(UtilsKt.iXiiiO(0));
        DINCondBold r9 = getMonitorRetVal();
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r1 = String.format("%s", Arrays.copyOf(new Object[]{HelpFormatter.DEFAULT_LONG_OPT_PREFIX}, 1));
        Intrinsics.O10IXXX0X(r1, "format(...)");
        r9.setText(r1);
        updateChartData(this.values);
    }

    public final float getHighlight() {
        return this.highlight;
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
        r0.OIX0iXi(r2, r3, 100.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        setWeekDay(O0X11OiO.IXXOO(getMCalendar().getTimeInMillis()));
        XAxis r4 = getLineChart().getXAxis();
        Intrinsics.XXI(r4);
        Context r5 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        r0.OIi0(r4, false, r5);
        r4.IO0II0i(true);
        r4.IXOIIIO(1.0f);
        r4.i0X000X0O(-1.0f);
        r4.iOiXi11II(7.0f);
        ArrayList r6 = new ArrayList();
        Iterator<by6> r7 = getWeekDay().iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        r6.add(r7.next().IiI10X());
        goto L4
    L6:
        r4.Oi(new q4(r6));
        LineChart r8 = getLineChart();
        r8.getDescription().XOO0ii0(false);
        r8.getLegend().XOO0ii0(false);
        r8.setScaleEnabled(false);
        O11X1i1 r9 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r9.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r9);
        getLineChart().setOnChartValueSelectedListener(new OXO1(this));
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), 0, getMTimePeriod()));
        ((LinearLayout) getMView().findViewById(R.id.ll_max_value)).setVisibility(8);
        ((LinearLayout) getMView().findViewById(R.id.ll_min_value)).setVisibility(8);
        ((LinearLayout) getMView().findViewById(R.id.ll_monitoring_results_value)).setVisibility(0);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_blood_oxygen_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodOxygen> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodOxygen> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        setWeekDay(O0X11OiO.IXXOO(r8[0]));
        clearCache(r8[0]);
        return this.mBloodOxyGenDao.getBloodOxygen(r8[0], r8[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodOxyGen week Data";
    }

    public final void setHighlight(float r1) {
        this.highlight = r1;
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateChartData(@aa1 List<Entry> r6) {
        Intrinsics.X0O(r6, "values");
        if (getLineChart().getData() != 0) goto L5;
    L7:
        setSetValue(new LineDataSet(r6, setDataLabel()));
        getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.bog_color));
        getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.bog_color));
        getSetValue().I1XII0X(2.0f);
        getSetValue().iXOII(1.0f);
        getSetValue().IOI0i0I(false);
        getSetValue().XXI(false);
        getSetValue().O1iXiI(true);
        Drawable r1 = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hr);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        getSetValue().I0i1OXiI(r1);
        co r2 = new co(new IiXO1XOi[]{getSetValue()});
        r2.iI(false);
        getLineChart().setData(r2);
    L8:
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        Iterator<T> r7 = r6.iterator();
    L10:
        if (r7.hasNext() == false) goto L14;
        Entry r0 = (Entry) r7.next();
        if (r0.O00() <= 0.0f) goto L10;
        this.highlight = r0.OIX0iXi();
        goto L10
    L14:
        getLineChart().II1Xi0(this.highlight, 0);
        return;
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

    public final void updateItemData(@aa1 Entry r3) {
        Intrinsics.X0O(r3, "e");
        BloodOxyGenDayData r4 = this.bloodOxyGenDayDataList.get((int) r3.OIX0iXi());
        getMinValue().setText(UtilsKt.iXiiiO(r4.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(r4.getMax()));
        getAvgValue().setText(UtilsKt.iXiiiO(r4.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(r4.getAvg()));
        getMonitorRetVal().setText(r4.getStatus());
    }
}
