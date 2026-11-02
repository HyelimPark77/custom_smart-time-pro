package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OXXO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X0111O;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iiiIXX1X0;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodGlucose2Dao;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.model.BloodGlucose2DataParse;
import com.sma.smartv3.model.BloodGlucose2DayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailsMonthFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.segmentedbar.VerticalSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucose2MonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1869#2,2:205\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n*L\n192#1:205,2\n*E\n"})
public final class BloodGlucose2MonthFragment extends BaseDetailsMonthFragment<BloodGlucose2> {
    private float axisMinimum;

    @aa1
    private final Lazy barChart$delegate;

    @aa1
    private final List<BloodGlucose2DayData> bloodGlucoseDayDataList;
    private float highlight;

    @tb1
    private Oi01X10i infoBarChartRender;

    @aa1
    private final BloodGlucose2Dao mBloodGlucose2Dao;
    private float maxHeight;

    @aa1
    private final LinkedHashMap<Long, ArrayList<BloodGlucose2>> monthData;
    private List<String> monthDays;

    @aa1
    private final Lazy segmentedbar$delegate;
    private XXX1X11 setValue;

    @aa1
    private final List<BarEntry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ BloodGlucose2MonthFragment OXO1;

        public OXO1(BloodGlucose2MonthFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r2, X110O r3) {
            Intrinsics.X0O(r2, "e");
            Intrinsics.X0O(r3, "h");
            this.OXO1.updateItemData(r2);
            DINCondBold r4 = this.OXO1.getNowTimeDetails();
            List r0 = BloodGlucose2MonthFragment.access$getMonthDays$p(this.OXO1);
            if (r0 != null) goto L5;
            Intrinsics.XXO("monthDays");
            r0 = null;
        L5:
            r4.setText((CharSequence) r0.get((int) r2.OIX0iXi()));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public BloodGlucose2MonthFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new X0111O(this));
        this.segmentedbar$delegate = LazyKt__LazyJVMKt.iO(new OXXO(this));
        this.values = new ArrayList();
        this.monthData = new LinkedHashMap();
        this.mBloodGlucose2Dao = MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();
        this.bloodGlucoseDayDataList = new ArrayList();
    }

    public static /* synthetic */ CustomBarChartView O10IXXX0X(BloodGlucose2MonthFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ VerticalSegmentedBarView X1ii(BloodGlucose2MonthFragment r0) {
        return segmentedbar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(BloodGlucose2MonthFragment r0) {
        initView$lambda$2(r0);
    }

    public static final /* synthetic */ List access$getMonthDays$p(BloodGlucose2MonthFragment r0) {
        return r0.monthDays;
    }

    private static final CustomBarChartView barChart_delegate$lambda$0(BloodGlucose2MonthFragment r1) {
        return (CustomBarChartView) r1.getMView().findViewById(R.id.barChart);
    }

    private final CustomBarChartView getBarChart() {
        return (CustomBarChartView) getValue();
    }

    private final VerticalSegmentedBarView getSegmentedbar() {
        return (VerticalSegmentedBarView) getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void initView$lambda$2(BloodGlucose2MonthFragment r5) {
        YAxis r0 = r5.getBarChart().getAxisRight();
        float r1 = r0.O1O;
        float r2 = r0.iOO1ii1;
        Oi01X10i r3 = r5.infoBarChartRender;
        float r4 = 0.0f;
        if (r3 == null) goto L5;
        float r6 = r3.OiIIX101O(r2);
    L6:
        Oi01X10i r7 = r5.infoBarChartRender;
        if (r7 == null) goto L9;
        r4 = r7.OiIIX101O(r1);
    L9:
        float r8 = (r5.getBarChart().getViewPortHandler().OIX0iXi() / r5.getBarChart().getXAxis().iOO1ii1) * ((IXIX1X1) r5.getBarChart().getData()).iXiX011();
        ViewGroup.LayoutParams r9 = r5.getSegmentedbar().getLayoutParams();
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams r10 = (LinearLayout.LayoutParams) r9;
        r10.height = (int) (r4 - r6);
        r10.topMargin = (int) r6;
        r10.width = (int) r8;
        r5.getSegmentedbar().setLayoutParams(r10);
        return;
    L5:
        r6 = 0.0f;
        goto L6
    }

    private static final VerticalSegmentedBarView segmentedbar_delegate$lambda$0(BloodGlucose2MonthFragment r1) {
        return (VerticalSegmentedBarView) r1.getMView().findViewById(R.id.segmentedbar);
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

    public final void filterData(@aa1 List<BloodGlucose2> r8) {
        Intrinsics.X0O(r8, "data");
        this.values.clear();
        BloodGlucose2DataParse.INSTANCE.filterDayData(getMActivity(), r8, this.monthData, this.bloodGlucoseDayDataList, this.values);
        updateChartData(this.values);
    }

    @tb1
    public final Oi01X10i getInfoBarChartRender() {
        return this.infoBarChartRender;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        this.maxHeight = 90.0f;
        this.axisMinimum = 30.0f;
        List<String> r3 = null;
        this.monthDays = O0X11OiO.XiOIO(getMCalendar().getTimeInMillis(), null, 2, null);
        getTvCurrent().setText(O0X11OiO.iiiO().format(new Date()));
        iO1Xi1X1i r4 = iO1Xi1X1i.OXO1;
        CustomBarChartView r0 = getBarChart();
        Intrinsics.O10IXXX0X(r0, "<get-barChart>(...)");
        r4.OXO1(r0);
        YAxis r5 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r5, "getAxisLeft(...)");
        YAxis r6 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r6, "getAxisRight(...)");
        r4.OIX0iXi(r5, r6, this.maxHeight, this.axisMinimum, ContextCompat.getColor(getMActivity(), R.color.line_color));
        int r1 = 0;
        getBarChart().getAxisRight().X00Xi1X(false);
        CustomBarChartView r2 = getBarChart();
        r2.setDrawValueAboveBar(false);
        r2.setScaleEnabled(false);
        r2.getDescription().XOO0ii0(false);
        r2.getLegend().XOO0ii0(false);
        XAxis r7 = getBarChart().getXAxis();
        Intrinsics.XXI(r7);
        Context r8 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r8, "getContext(...)");
        r4.OIi0(r7, false, r8);
        r7.IXOIIIO(1.0f);
        ArrayList r9 = new ArrayList();
        List<String> r10 = this.monthDays;
        if (r10 != null) goto L5;
        Intrinsics.XXO("monthDays");
    L6:
        Iterator<T> r11 = r3.iterator();
    L8:
        if (r11.hasNext() == false) goto L10;
        r1 = r1 + 1;
        r11.next();
        r9.add(String.valueOf(r1));
        goto L8
    L10:
        r7.Oi(new q4(r9));
        setChartRenderer();
        getBarChart().setOnChartValueSelectedListener(new OXO1(this));
        getSegmentedbar().setSegments(BloodGlucose2DataKt.getBloodGlucoseSegments());
        getBarChart().getViewTreeObserver().addOnGlobalLayoutListener(new iiiIXX1X0(this));
        super.initView();
        return;
    L5:
        r3 = r10;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_blood_glucose2_month;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodGlucose2> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodGlucose2> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        this.monthDays = O0X11OiO.XiOIO(r8[0], null, 2, null);
        clearCache(r8[0]);
        return this.mBloodGlucose2Dao.getListForDay(r8[0], r8[1]);
    }

    public final void setChartRenderer() {
        Oi01X10i r0 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        this.infoBarChartRender = r0;
        r0.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        Oi01X10i r1 = this.infoBarChartRender;
        if (r1 == null) goto L5;
        r1.iIiiO(7);
    L5:
        getBarChart().setRenderer(this.infoBarChartRender);
    }

    public final void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))}));
    }

    @aa1
    public final String setDataLabel() {
        return "BloodGlucose month Data";
    }

    public final void setInfoBarChartRender(@tb1 Oi01X10i r1) {
        this.infoBarChartRender = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateChartData(@aa1 List<BarEntry> r6) {
        Intrinsics.X0O(r6, "values");
        XXX1X11 r1 = null;
        if (getBarChart().getData() != 0) goto L5;
    L14:
        XXX1X11 r0 = new XXX1X11(r6, setDataLabel());
        this.setValue = r0;
        setColor(r0);
        XXX1X11 r4 = this.setValue;
        if (r4 != null) goto L17;
        Intrinsics.XXO("setValue");
    L18:
        IXIX1X1 r2 = new IXIX1X1(new XIXi1iX00[]{r1});
        r2.iI(false);
        getBarChart().setData(r2);
    L19:
        getBarChart().invalidate();
        this.highlight = r6.size() / 2;
        Iterator<T> r7 = r6.iterator();
    L21:
        if (r7.hasNext() == false) goto L25;
        BarEntry r3 = (BarEntry) r7.next();
        if (r3.O00() <= 0.0f) goto L21;
        this.highlight = r3.OIX0iXi();
        goto L21
    L25:
        getBarChart().II1Xi0(this.highlight, 0);
        return;
    L17:
        r1 = r4;
        goto L18
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L14;
        T r5 = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
        XXX1X11 r8 = (XXX1X11) r5;
        this.setValue = r8;
        if (r8 != null) goto L9;
        Intrinsics.XXO("setValue");
        r8 = null;
    L9:
        r8.IOX1(r6);
        XXX1X11 r9 = this.setValue;
        if (r9 != null) goto L12;
        Intrinsics.XXO("setValue");
    L13:
        r1.i0X1iIO();
        ((IXIX1X1) getBarChart().getData()).iX();
        getBarChart().X0i1O();
        goto L19
    L12:
        r1 = r9;
        goto L13
    }

    public final void updateItemData(@aa1 Entry r4) {
        Intrinsics.X0O(r4, "e");
        BloodGlucose2DayData r5 = this.bloodGlucoseDayDataList.get((int) r4.OIX0iXi());
        getNowValue().setText(UtilsKt.II1Xi0(r5.getMin() / 10.0f, r5.getMax() / 10.0f));
    }
}
