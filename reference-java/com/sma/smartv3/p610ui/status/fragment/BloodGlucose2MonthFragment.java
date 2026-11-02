package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.model.BloodGlucose2DataParse;
import com.sma.smartv3.model.BloodGlucose2DayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import com.sma.smartv3.p610ui.status.base.BaseDetailsMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucose2MonthFragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucose2MonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1869#2,2:205\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n*L\n192#1:205,2\n*E\n"})
public final class BloodGlucose2MonthFragment extends BaseDetailsMonthFragment<BloodGlucose2> {
    private float axisMinimum;
    private float highlight;

    @tb1
    private Oi01X10i infoBarChartRender;
    private float maxHeight;
    private List<String> monthDays;
    private XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0111O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2MonthFragment.barChart_delegate$lambda$0(this.f3913IO);
        }
    });

    @aa1
    private final Lazy segmentedbar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2MonthFragment.segmentedbar_delegate$lambda$0(this.f3543IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();

    @aa1
    private final LinkedHashMap<Long, ArrayList<BloodGlucose2>> monthData = new LinkedHashMap<>();

    @aa1
    private final BloodGlucose2Dao mBloodGlucose2Dao = MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();

    @aa1
    private final List<BloodGlucose2DayData> bloodGlucoseDayDataList = new ArrayList();

    public static final class OXO1 implements uf1 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            BloodGlucose2MonthFragment.this.updateItemData(e);
            DINCondBold nowTimeDetails = BloodGlucose2MonthFragment.this.getNowTimeDetails();
            List list = BloodGlucose2MonthFragment.this.monthDays;
            if (list == null) {
                Intrinsics.XXO("monthDays");
                list = null;
            }
            nowTimeDetails.setText((CharSequence) list.get((int) e.OIX0iXi()));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomBarChartView barChart_delegate$lambda$0(BloodGlucose2MonthFragment bloodGlucose2MonthFragment) {
        return (CustomBarChartView) bloodGlucose2MonthFragment.getMView().findViewById(R.id.barChart);
    }

    private final CustomBarChartView getBarChart() {
        return (CustomBarChartView) this.barChart$delegate.getValue();
    }

    private final VerticalSegmentedBarView getSegmentedbar() {
        return (VerticalSegmentedBarView) this.segmentedbar$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2(BloodGlucose2MonthFragment bloodGlucose2MonthFragment) {
        YAxis axisRight = bloodGlucose2MonthFragment.getBarChart().getAxisRight();
        float f = axisRight.O1O;
        float f2 = axisRight.iOO1ii1;
        Oi01X10i oi01X10i = bloodGlucose2MonthFragment.infoBarChartRender;
        float fOiIIX101O = oi01X10i != null ? oi01X10i.OiIIX101O(f2) : 0.0f;
        Oi01X10i oi01X10i2 = bloodGlucose2MonthFragment.infoBarChartRender;
        float fOiIIX101O2 = oi01X10i2 != null ? oi01X10i2.OiIIX101O(f) : 0.0f;
        float fOIX0iXi = (bloodGlucose2MonthFragment.getBarChart().getViewPortHandler().OIX0iXi() / bloodGlucose2MonthFragment.getBarChart().getXAxis().iOO1ii1) * ((IXIX1X1) bloodGlucose2MonthFragment.getBarChart().getData()).iXiX011();
        ViewGroup.LayoutParams layoutParams = bloodGlucose2MonthFragment.getSegmentedbar().getLayoutParams();
        Intrinsics.X1ii(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = (int) (fOiIIX101O2 - fOiIIX101O);
        layoutParams2.topMargin = (int) fOiIIX101O;
        layoutParams2.width = (int) fOIX0iXi;
        bloodGlucose2MonthFragment.getSegmentedbar().setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerticalSegmentedBarView segmentedbar_delegate$lambda$0(BloodGlucose2MonthFragment bloodGlucose2MonthFragment) {
        return (VerticalSegmentedBarView) bloodGlucose2MonthFragment.getMView().findViewById(R.id.segmentedbar);
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

    public final void filterData(@aa1 List<BloodGlucose2> data) {
        Intrinsics.X0O(data, "data");
        this.values.clear();
        BloodGlucose2DataParse.INSTANCE.filterDayData(getMActivity(), data, this.monthData, this.bloodGlucoseDayDataList, this.values);
        updateChartData(this.values);
    }

    @tb1
    public final Oi01X10i getInfoBarChartRender() {
        return this.infoBarChartRender;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        this.maxHeight = 90.0f;
        this.axisMinimum = 30.0f;
        List<String> list = null;
        this.monthDays = O0X11OiO.XiOIO(getMCalendar().getTimeInMillis(), null, 2, null);
        getTvCurrent().setText(O0X11OiO.iiiO().format(new Date()));
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        CustomBarChartView barChart = getBarChart();
        Intrinsics.O10IXXX0X(barChart, "<get-barChart>(...)");
        io1xi1x1i.OXO1(barChart);
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, this.maxHeight, this.axisMinimum, ContextCompat.getColor(getMActivity(), R.color.line_color));
        int i = 0;
        getBarChart().getAxisRight().X00Xi1X(false);
        CustomBarChartView barChart2 = getBarChart();
        barChart2.setDrawValueAboveBar(false);
        barChart2.setScaleEnabled(false);
        barChart2.getDescription().XOO0ii0(false);
        barChart2.getLegend().XOO0ii0(false);
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.IXOIIIO(1.0f);
        ArrayList arrayList = new ArrayList();
        List<String> list2 = this.monthDays;
        if (list2 == null) {
            Intrinsics.XXO("monthDays");
        } else {
            list = list2;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            i++;
            it.next();
            arrayList.add(String.valueOf(i));
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        setChartRenderer();
        getBarChart().setOnChartValueSelectedListener(new OXO1());
        getSegmentedbar().setSegments(BloodGlucose2DataKt.getBloodGlucoseSegments());
        getBarChart().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.mltcode.paycertificationapi.iiiIXX1X0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BloodGlucose2MonthFragment.initView$lambda$2(this.f8672IO);
            }
        });
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_blood_glucose2_month;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodGlucose2> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodGlucose2> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        this.monthDays = O0X11OiO.XiOIO(jArrM787I1[0], null, 2, null);
        clearCache(jArrM787I1[0]);
        return this.mBloodGlucose2Dao.getListForDay(jArrM787I1[0], jArrM787I1[1]);
    }

    public final void setChartRenderer() {
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        this.infoBarChartRender = oi01X10i;
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        Oi01X10i oi01X10i2 = this.infoBarChartRender;
        if (oi01X10i2 != null) {
            oi01X10i2.iIiiO(7);
        }
        getBarChart().setRenderer(this.infoBarChartRender);
    }

    public final void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))));
    }

    @aa1
    public final String setDataLabel() {
        return "BloodGlucose month Data";
    }

    public final void setInfoBarChartRender(@tb1 Oi01X10i oi01X10i) {
        this.infoBarChartRender = oi01X10i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateChartData(@aa1 List<BarEntry> values) {
        Intrinsics.X0O(values, "values");
        XXX1X11 xxx1x11 = null;
        if (getBarChart().getData() == 0 || ((IXIX1X1) getBarChart().getData()).XXI() <= 0) {
            XXX1X11 xxx1x12 = new XXX1X11(values, setDataLabel());
            this.setValue = xxx1x12;
            setColor(xxx1x12);
            XXX1X11 xxx1x13 = this.setValue;
            if (xxx1x13 == null) {
                Intrinsics.XXO("setValue");
            } else {
                xxx1x11 = xxx1x13;
            }
            IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
            ixix1x1.m1316iI(false);
            getBarChart().setData(ixix1x1);
        } else {
            T tOIX0iXi = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            XXX1X11 xxx1x14 = (XXX1X11) tOIX0iXi;
            this.setValue = xxx1x14;
            if (xxx1x14 == null) {
                Intrinsics.XXO("setValue");
                xxx1x14 = null;
            }
            xxx1x14.IOX1(values);
            XXX1X11 xxx1x15 = this.setValue;
            if (xxx1x15 == null) {
                Intrinsics.XXO("setValue");
            } else {
                xxx1x11 = xxx1x15;
            }
            xxx1x11.i0X1iIO();
            ((IXIX1X1) getBarChart().getData()).mo1167iX();
            getBarChart().X0i1O();
        }
        getBarChart().invalidate();
        this.highlight = values.size() / 2;
        for (BarEntry barEntry : values) {
            if (barEntry.O00() > 0.0f) {
                this.highlight = barEntry.OIX0iXi();
            }
        }
        getBarChart().II1Xi0(this.highlight, 0);
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        BloodGlucose2DayData bloodGlucose2DayData = this.bloodGlucoseDayDataList.get((int) e.OIX0iXi());
        getNowValue().setText(UtilsKt.II1Xi0(bloodGlucose2DayData.getMin() / 10.0f, bloodGlucose2DayData.getMax() / 10.0f));
    }
}
