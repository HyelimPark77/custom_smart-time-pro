package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepDayFragment extends BaseDetailDaysFragment<Sleep> {
    private Oi01X10i infoBarChartRender;
    public XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.om4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepDayFragment.barChart_delegate$lambda$0(this.f10171IO);
        }
    });

    @aa1
    private final Lazy deepValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepDayFragment.deepValue_delegate$lambda$0(this.f10395IO);
        }
    });

    @aa1
    private final Lazy lightValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepDayFragment.lightValue_delegate$lambda$0(this.f10635IO);
        }
    });

    @aa1
    private final Lazy awakeValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepDayFragment.awakeValue_delegate$lambda$0(this.f10845IO);
        }
    });

    @aa1
    private final Lazy sleepStartTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepDayFragment.sleepStartTime_delegate$lambda$0(this.f11084IO);
        }
    });

    @aa1
    private final Lazy sleepEndTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepDayFragment.sleepEndTime_delegate$lambda$0(this.f11285IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();
    private final int block = 3;
    private final float blockHeight = 300.0f / 3;

    @aa1
    private final SleepDao mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold awakeValue_delegate$lambda$0(SleepDayFragment sleepDayFragment) {
        return (DINCondBold) sleepDayFragment.getMView().findViewById(R.id.awakeValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarChart barChart_delegate$lambda$0(SleepDayFragment sleepDayFragment) {
        return (BarChart) sleepDayFragment.getMView().findViewById(R.id.barChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold deepValue_delegate$lambda$0(SleepDayFragment sleepDayFragment) {
        return (DINCondBold) sleepDayFragment.getMView().findViewById(R.id.deepValue);
    }

    private final void filterData(List<Sleep> list) {
        int i;
        int i2;
        int i3;
        int total;
        int i4;
        this.values.clear();
        int i5 = 0;
        if (list.isEmpty()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            total = 0;
        } else {
            SleepDayData sleepDayDataFilterData = SleepDataParse.INSTANCE.filterData(list, this.blockHeight, this.values);
            LogUtils.m11128d(sleepDayDataFilterData.toString());
            i = sleepDayDataFilterData.getStatus().get(1);
            i2 = sleepDayDataFilterData.getStatus().get(2);
            i3 = sleepDayDataFilterData.getStatus().get(3);
            total = sleepDayDataFilterData.getTotal();
            if (total >= 60) {
                setXAxis(sleepDayDataFilterData.getStartTime(), total);
            }
        }
        if ((total == 0 || total >= 60) && !this.values.isEmpty()) {
            if (total == 0) {
                getSleepStartTime().setText("");
                getSleepEndTime().setText("");
                getBarChart().getXAxis().m603Oi(new C2829q4(CollectionsKt__CollectionsKt.m39402iI()));
            }
            i4 = i;
            i5 = i2;
        } else {
            this.values.clear();
            getSleepStartTime().setText("");
            getSleepEndTime().setText("");
            i3 = 0;
            total = 0;
            i4 = 0;
        }
        LogUtils.m11128d(i4 + " " + i5 + " " + i3 + " " + total);
        DINCondBold deepValue = getDeepValue();
        Intrinsics.O10IXXX0X(deepValue, "<get-deepValue>(...)");
        cp5.O1O(i4, deepValue, getMActivity(), 0, 0, 24, null);
        DINCondBold lightValue = getLightValue();
        Intrinsics.O10IXXX0X(lightValue, "<get-lightValue>(...)");
        cp5.O1O(i5, lightValue, getMActivity(), 0, 0, 24, null);
        DINCondBold awakeValue = getAwakeValue();
        Intrinsics.O10IXXX0X(awakeValue, "<get-awakeValue>(...)");
        cp5.O1O(i3, awakeValue, getMActivity(), 0, 0, 24, null);
        DINCondBold nowValue = getNowValue();
        Intrinsics.O10IXXX0X(nowValue, "<get-nowValue>(...)");
        int i6 = total;
        cp5.O1O(i6, nowValue, getMActivity(), 0, 0, 24, null);
        Oi01X10i oi01X10i = null;
        if (1 > i6 || i6 >= 121) {
            Oi01X10i oi01X10i2 = this.infoBarChartRender;
            if (oi01X10i2 == null) {
                Intrinsics.XXO("infoBarChartRender");
            } else {
                oi01X10i = oi01X10i2;
            }
            oi01X10i.i010I(2.0f);
        } else {
            Oi01X10i oi01X10i3 = this.infoBarChartRender;
            if (oi01X10i3 == null) {
                Intrinsics.XXO("infoBarChartRender");
            } else {
                oi01X10i = oi01X10i3;
            }
            oi01X10i.i010I(6.0f);
        }
        updateChartData(this.values);
    }

    private final DINCondBold getAwakeValue() {
        return (DINCondBold) this.awakeValue$delegate.getValue();
    }

    private final BarChart getBarChart() {
        return (BarChart) this.barChart$delegate.getValue();
    }

    private final DINCondBold getDeepValue() {
        return (DINCondBold) this.deepValue$delegate.getValue();
    }

    private final DINCondBold getLightValue() {
        return (DINCondBold) this.lightValue$delegate.getValue();
    }

    private final TextView getSleepEndTime() {
        return (TextView) this.sleepEndTime$delegate.getValue();
    }

    private final TextView getSleepStartTime() {
        return (TextView) this.sleepStartTime$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold lightValue_delegate$lambda$0(SleepDayFragment sleepDayFragment) {
        return (DINCondBold) sleepDayFragment.getMView().findViewById(R.id.lightValue);
    }

    private final void setXAxis(int i, int i2) {
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        int i3 = 0;
        SimpleDateFormat simpleDateFormatXO0X10iO = O0X11OiO.XO0X10iO(false, 1, null);
        ArrayList arrayList = new ArrayList();
        if (i2 >= 0) {
            while (true) {
                arrayList.add("");
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        getSleepStartTime().setText(TimeUtils.millis2String(((long) i) * 1000, simpleDateFormatXO0X10iO));
        getSleepEndTime().setText(TimeUtils.millis2String(((long) (i + (i2 * 60))) * 1000, simpleDateFormatXO0X10iO));
        xAxis.m603Oi(new C2829q4(arrayList));
        xAxis.O1O = 0.0f;
        xAxis.IXOIIIO(arrayList.size() / 4);
        xAxis.iOO1ii1 = arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepEndTime_delegate$lambda$0(SleepDayFragment sleepDayFragment) {
        return (TextView) sleepDayFragment.getMView().findViewById(R.id.sleepEndTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepStartTime_delegate$lambda$0(SleepDayFragment sleepDayFragment) {
        return (TextView) sleepDayFragment.getMView().findViewById(R.id.sleepStartTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> list) {
        if (getBarChart().getData() != 0 && ((IXIX1X1) getBarChart().getData()).XXI() > 0) {
            ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        }
        XXX1X11 xxx1x11 = new XXX1X11(list, "SleepData");
        xxx1x11.iIXX0i(0.0f);
        xxx1x11.iO11i(0.0f);
        IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
        ixix1x1.m1316iI(false);
        getBarChart().setData(ixix1x1);
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
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
        io1xi1x1i.I0iXXO(axisLeft, axisRight, 300.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        BarChart barChart2 = getBarChart();
        barChart2.setDrawValueAboveBar(false);
        barChart2.setTouchEnabled(false);
        barChart2.setScaleEnabled(false);
        barChart2.getAxisRight().XOXiX0(4, true);
        barChart2.getDescription().XOO0ii0(false);
        barChart2.getLegend().XOO0ii0(false);
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        this.infoBarChartRender = oi01X10i;
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        Oi01X10i oi01X10i2 = this.infoBarChartRender;
        Oi01X10i oi01X10i3 = null;
        if (oi01X10i2 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i2 = null;
        }
        oi01X10i2.X01IiOiIi(this.blockHeight);
        Oi01X10i oi01X10i4 = this.infoBarChartRender;
        if (oi01X10i4 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i4 = null;
        }
        oi01X10i4.m1017OX(this.block);
        Oi01X10i oi01X10i5 = this.infoBarChartRender;
        if (oi01X10i5 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i5 = null;
        }
        oi01X10i5.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.sleep_show_5), ContextCompat.getColor(getMActivity(), R.color.sleep_show_6), ContextCompat.getColor(getMActivity(), R.color.sleep_show_3), ContextCompat.getColor(getMActivity(), R.color.sleep_show_4), ContextCompat.getColor(getMActivity(), R.color.sleep_show_1), ContextCompat.getColor(getMActivity(), R.color.sleep_show_2)});
        Oi01X10i oi01X10i6 = this.infoBarChartRender;
        if (oi01X10i6 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i6 = null;
        }
        oi01X10i6.iIiiO(4);
        BarChart barChart3 = getBarChart();
        Oi01X10i oi01X10i7 = this.infoBarChartRender;
        if (oi01X10i7 == null) {
            Intrinsics.XXO("infoBarChartRender");
        } else {
            oi01X10i3 = oi01X10i7;
        }
        barChart3.setRenderer(oi01X10i3);
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_sleep_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Sleep> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Sleep> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        LogUtils.m11128d(getRange());
        SleepDao sleepDao = this.mSleepDao;
        long j = getRange()[0];
        long j2 = O0X11OiO.iXiX011;
        return sleepDao.getSleeps(j - j2, getRange()[1] - j2);
    }

    @aa1
    public final String setDataLabel() {
        return "sleep day Data";
    }

    public final void setSetValue(@aa1 XXX1X11 xxx1x11) {
        Intrinsics.X0O(xxx1x11, "<set-?>");
        this.setValue = xxx1x11;
    }
}
