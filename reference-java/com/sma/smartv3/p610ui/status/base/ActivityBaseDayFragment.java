package com.sma.smartv3.p610ui.status.base;

import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nActivityBaseDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1869#2,2:191\n*S KotlinDebug\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n*L\n166#1:191,2\n*E\n"})
public class ActivityBaseDayFragment extends BaseDetailDaysFragment<Activity> {
    public XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X01I1OX1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.barChart_delegate$lambda$0(this.f3918IO);
        }
    });

    @aa1
    private final Lazy oneValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.oneValue_delegate$lambda$0(this.f8519IO);
        }
    });

    @aa1
    private final Lazy oneTV$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0i0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.oneTV_delegate$lambda$0(this.f4058IO);
        }
    });

    @aa1
    private final Lazy totalUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.totalUnit_delegate$lambda$0(this.f8594IO);
        }
    });

    @aa1
    private final Lazy twoValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.twoValue_delegate$lambda$0(this.f8428IO);
        }
    });

    @aa1
    private final Lazy twoTV$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.twoTV_delegate$lambda$0(this.f8379IO);
        }
    });

    @aa1
    private final Lazy twoUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIXXi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ActivityBaseDayFragment.twoUnit_delegate$lambda$0(this.f1666IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();

    @aa1
    private LinkedHashMap<Long, ArrayList<Activity>> filterData = new LinkedHashMap<>();

    @aa1
    private final ActivityDao mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
    private float highlight = 3.0f;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            ActivityBaseDayFragment.this.updateItemData(e);
            ActivityBaseDayFragment.this.getMCalendar().set(11, (int) e.OIX0iXi());
            DINCondBold nowTimeDetails = ActivityBaseDayFragment.this.getNowTimeDetails();
            ActivityBaseDayFragment activityBaseDayFragment = ActivityBaseDayFragment.this;
            nowTimeDetails.setText(activityBaseDayFragment.getString(R.string.time_range, TimeUtils.millis2String(activityBaseDayFragment.getMCalendar().getTimeInMillis(), this.XIi00iiXO), TimeUtils.millis2String(ActivityBaseDayFragment.this.getMCalendar().getTimeInMillis() + ((long) TimeConstants.HOUR), this.XIi00iiXO)));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarChart barChart_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (BarChart) activityBaseDayFragment.getMView().findViewById(R.id.barChart);
    }

    private final BarChart getBarChart() {
        return (BarChart) this.barChart$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium oneTV_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (PFMedium) activityBaseDayFragment.getMView().findViewById(R.id.oneTV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold oneValue_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (DINCondBold) activityBaseDayFragment.getMView().findViewById(R.id.oneValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium totalUnit_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (PFMedium) activityBaseDayFragment.getMView().findViewById(R.id.oneUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium twoTV_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (PFMedium) activityBaseDayFragment.getMView().findViewById(R.id.twoTV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium twoUnit_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (PFMedium) activityBaseDayFragment.getMView().findViewById(R.id.twoUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold twoValue_delegate$lambda$0(ActivityBaseDayFragment activityBaseDayFragment) {
        return (DINCondBold) activityBaseDayFragment.getMView().findViewById(R.id.twoValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData() {
        float fO00 = 0.0f;
        for (BarEntry barEntry : this.values) {
            if (fO00 < barEntry.O00()) {
                fO00 = barEntry.O00();
            }
        }
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.IiI10X(axisLeft, axisRight, fO00);
        if (getBarChart().getData() == 0 || ((IXIX1X1) getBarChart().getData()).XXI() <= 0) {
            setSetValue(new XXX1X11(this.values, setDataLabel()));
            setColor(getSetValue());
            IXIX1X1 ixix1x1 = new IXIX1X1(getSetValue());
            ixix1x1.m1316iI(false);
            getBarChart().setData(ixix1x1);
        } else {
            T tOIX0iXi = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            setSetValue((XXX1X11) tOIX0iXi);
            getSetValue().IOX1(this.values);
            getSetValue().i0X1iIO();
            ((IXIX1X1) getBarChart().getData()).mo1167iX();
            getBarChart().X0i1O();
        }
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        for (BarEntry barEntry2 : this.values) {
            if (barEntry2.O00() > 0.0f) {
                this.highlight = barEntry2.OIX0iXi();
            }
        }
        getBarChart().II1Xi0(this.highlight, 0);
    }

    @CallSuper
    public void filterData(@aa1 List<Activity> data) {
        Intrinsics.X0O(data, "data");
        this.values.clear();
    }

    @aa1
    public final LinkedHashMap<Long, ArrayList<Activity>> getFilterData() {
        return this.filterData;
    }

    public final float getHighlight() {
        return this.highlight;
    }

    public final PFMedium getOneTV() {
        return (PFMedium) this.oneTV$delegate.getValue();
    }

    public final DINCondBold getOneValue() {
        return (DINCondBold) this.oneValue$delegate.getValue();
    }

    @aa1
    public final XXX1X11 getSetValue() {
        XXX1X11 xxx1x11 = this.setValue;
        if (xxx1x11 != null) {
            return xxx1x11;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    public final PFMedium getTotalUnit() {
        return (PFMedium) this.totalUnit$delegate.getValue();
    }

    public final PFMedium getTwoTV() {
        return (PFMedium) this.twoTV$delegate.getValue();
    }

    public final PFMedium getTwoUnit() {
        return (PFMedium) this.twoUnit$delegate.getValue();
    }

    public final DINCondBold getTwoValue() {
        return (DINCondBold) this.twoValue$delegate.getValue();
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        BarChart barChart = getBarChart();
        Intrinsics.O10IXXX0X(barChart, "<get-barChart>(...)");
        io1xi1x1i.OXO1(barChart);
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 0.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        BarChart barChart2 = getBarChart();
        barChart2.setDrawValueAboveBar(false);
        barChart2.setScaleEnabled(false);
        barChart2.getDescription().XOO0ii0(false);
        barChart2.getLegend().XOO0ii0(false);
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        xAxis.IXOIIIO(4.0f);
        xAxis.i0X000X0O(-1.0f);
        xAxis.iOiXi11II(25.0f);
        SimpleDateFormat simpleDateFormatXXiIiX10 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 25; i++) {
            String strMillis2String = TimeUtils.millis2String(getRange()[0] + (((long) (i * 3600)) * 1000), simpleDateFormatXXiIiX10);
            if (arrayList.size() > 12 && Intrinsics.XOO0ii0(strMillis2String, "0")) {
                strMillis2String = X10i1i.XOOXII;
            }
            Intrinsics.XXI(strMillis2String);
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        getBarChart().setRenderer(oi01X10i);
        getBarChart().setOnChartValueSelectedListener(new OXO1(O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Activity> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
        updateChartData();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Activity> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        this.filterData.clear();
        for (int i2 = 1; i2 < 25; i2++) {
            this.filterData.put(Long.valueOf(getRange()[0] + ((long) (TimeConstants.HOUR * i2))), new ArrayList<>());
        }
        return this.mActivityDao.getListASC(getRange()[0] + ((long) 1000), getRange()[1]);
    }

    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
    }

    @aa1
    public String setDataLabel() {
        return "";
    }

    public final void setFilterData(@aa1 LinkedHashMap<Long, ArrayList<Activity>> linkedHashMap) {
        Intrinsics.X0O(linkedHashMap, "<set-?>");
        this.filterData = linkedHashMap;
    }

    public final void setHighlight(float f) {
        this.highlight = f;
    }

    public final void setSetValue(@aa1 XXX1X11 xxx1x11) {
        Intrinsics.X0O(xxx1x11, "<set-?>");
        this.setValue = xxx1x11;
    }

    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
    }
}
