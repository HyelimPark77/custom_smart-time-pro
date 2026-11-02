package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.X11X1IO00;
import com.android.mltcode.paycertificationapi.XIIiI0I1O;
import com.android.mltcode.paycertificationapi.XiOXi0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i11IXI1;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.model.HRVDataParse;
import com.sma.smartv3.model.HRVDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailsWeekFragment;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HrvWeekFragment extends BaseDetailsWeekFragment<Hrv> {

    @aa1
    private final List<HRVDayData> hrvDayDataList;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final HrvDao mHrvDao;

    @aa1
    private final Lazy maxValue$delegate;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final Lazy minValue$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    @aa1
    private final LinkedHashMap<Long, ArrayList<Hrv>> weekData;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ HrvWeekFragment OXO1;

        public OXO1(HrvWeekFragment r1) {
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

    public HrvWeekFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new XIIiI0I1O(this));
        this.minValue$delegate = LazyKt__LazyJVMKt.iO(new X11X1IO00(this));
        this.maxValue$delegate = LazyKt__LazyJVMKt.iO(new XiOXi0(this));
        this.values = new ArrayList();
        this.weekData = new LinkedHashMap();
        this.mHrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();
        this.hrvDayDataList = new ArrayList();
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new i11IXI1(this));
    }

    public static /* synthetic */ LineChart O10IXXX0X(HrvWeekFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(HrvWeekFragment r0) {
        return minValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(HrvWeekFragment r0) {
        return maxValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(HrvWeekFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    private final LineChart getLineChart() {
        return (LineChart) getValue();
    }

    private final DINCondBold getMaxValue() {
        return (DINCondBold) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) getValue();
    }

    private static final LineChart lineChart_delegate$lambda$0(HrvWeekFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxValue_delegate$lambda$0(HrvWeekFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxValue);
    }

    private static final View measurePanel_delegate$lambda$0(HrvWeekFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final DINCondBold minValue_delegate$lambda$0(HrvWeekFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minValue);
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

    public final void filterData(@aa1 List<Hrv> r8) {
        Intrinsics.X0O(r8, "hrvs");
        this.values.clear();
        HRVDataParse.INSTANCE.filterDayData(getMActivity(), r8, this.weekData, this.hrvDayDataList, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(0));
        getMaxValue().setText(UtilsKt.iXiiiO(0));
        getNowValue().setText(UtilsKt.iXiiiO(0));
        updateChartData(this.values);
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
        getMeasurePanel().setVisibility(8);
        iO1Xi1X1i r2 = iO1Xi1X1i.OXO1;
        LineChart r0 = getLineChart();
        Intrinsics.O10IXXX0X(r0, "<get-lineChart>(...)");
        r2.XIi00iiXO(r0);
        YAxis r3 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r3, "getAxisLeft(...)");
        YAxis r4 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r4, "getAxisRight(...)");
        r2.OIX0iXi(r3, r4, 200.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        setWeekDay(O0X11OiO.IXXOO(getMCalendar().getTimeInMillis()));
        XAxis r1 = getLineChart().getXAxis();
        Intrinsics.XXI(r1);
        Context r5 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        r2.OIi0(r1, false, r5);
        r1.IO0II0i(true);
        r1.IXOIIIO(1.0f);
        r1.i0X000X0O(-1.0f);
        r1.iOiXi11II(7.0f);
        ArrayList r6 = new ArrayList();
        Iterator<by6> r7 = getWeekDay().iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        r6.add(r7.next().IiI10X());
        goto L4
    L6:
        r1.Oi(new q4(r6));
        LineChart r8 = getLineChart();
        r8.getDescription().XOO0ii0(false);
        r8.getLegend().XOO0ii0(false);
        r8.setScaleEnabled(false);
        O11X1i1 r9 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r9.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r9);
        getLineChart().setOnChartValueSelectedListener(new OXO1(this));
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), 0, getMTimePeriod()));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_hrv_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Hrv> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Hrv> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        setWeekDay(O0X11OiO.IXXOO(r8[0]));
        clearCache(r8[0]);
        return this.mHrvDao.getHrv(r8[0], r8[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "HRV week Data";
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

    public final void updateItemData(@aa1 Entry r3) {
        Intrinsics.X0O(r3, "e");
        HRVDayData r4 = this.hrvDayDataList.get((int) r3.OIX0iXi());
        getMinValue().setText(UtilsKt.iXiiiO(r4.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(r4.getMax()));
        getNowValue().setText(UtilsKt.iXiiiO(r4.getAvg()));
    }
}
