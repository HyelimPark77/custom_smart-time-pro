package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.om4;
import com.android.mltcode.paycertificationapi.pm4;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.qm4;
import com.android.mltcode.paycertificationapi.rm4;
import com.android.mltcode.paycertificationapi.sm4;
import com.android.mltcode.paycertificationapi.tm4;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepDayFragment extends BaseDetailDaysFragment<Sleep> {

    @aa1
    private final Lazy awakeValue$delegate;

    @aa1
    private final Lazy barChart$delegate;
    private final int block;
    private final float blockHeight;

    @aa1
    private final Lazy deepValue$delegate;
    private Oi01X10i infoBarChartRender;

    @aa1
    private final Lazy lightValue$delegate;

    @aa1
    private final SleepDao mSleepDao;
    public XXX1X11 setValue;

    @aa1
    private final Lazy sleepEndTime$delegate;

    @aa1
    private final Lazy sleepStartTime$delegate;

    @aa1
    private final List<BarEntry> values;

    public SleepDayFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new om4(this));
        this.deepValue$delegate = LazyKt__LazyJVMKt.iO(new pm4(this));
        this.lightValue$delegate = LazyKt__LazyJVMKt.iO(new qm4(this));
        this.awakeValue$delegate = LazyKt__LazyJVMKt.iO(new rm4(this));
        this.sleepStartTime$delegate = LazyKt__LazyJVMKt.iO(new sm4(this));
        this.sleepEndTime$delegate = LazyKt__LazyJVMKt.iO(new tm4(this));
        this.values = new ArrayList();
        this.block = 3;
        this.blockHeight = 300.0f / 3;
        this.mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
    }

    public static /* synthetic */ TextView I1XOi1(SleepDayFragment r0) {
        return sleepStartTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold IIX1OXO(SleepDayFragment r0) {
        return awakeValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(SleepDayFragment r0) {
        return sleepEndTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ BarChart X0O(SleepDayFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(SleepDayFragment r0) {
        return deepValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(SleepDayFragment r0) {
        return lightValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold awakeValue_delegate$lambda$0(SleepDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.awakeValue);
    }

    private static final BarChart barChart_delegate$lambda$0(SleepDayFragment r1) {
        return (BarChart) r1.getMView().findViewById(R.id.barChart);
    }

    private static final DINCondBold deepValue_delegate$lambda$0(SleepDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.deepValue);
    }

    private final void filterData(List<Sleep> r18) {
        this.values.clear();
        int r5 = 0;
        if (r18.isEmpty() == true) goto L7;
        SleepDayData r1 = SleepDataParse.INSTANCE.filterData(r18, this.blockHeight, this.values);
        LogUtils.d(new Object[]{r1.toString()});
        int r2 = r1.getStatus().get(1);
        int r6 = r1.getStatus().get(2);
        int r7 = r1.getStatus().get(3);
        int r8 = r1.getTotal();
        if (r8 < 60) goto L9;
        setXAxis(r1.getStartTime(), r8);
    L9:
        if (r8 == 0) goto L12;
        if (r8 >= 60) goto L12;
    L13:
        this.values.clear();
        getSleepStartTime().setText("");
        getSleepEndTime().setText("");
        r7 = 0;
        r8 = 0;
        int r9 = 0;
    L17:
        LogUtils.d(new Object[]{r9 + " " + r5 + " " + r7 + " " + r8});
        DINCondBold r10 = getDeepValue();
        Intrinsics.O10IXXX0X(r10, "<get-deepValue>(...)");
        cp5.O1O(r9, r10, getMActivity(), 0, 0, 24, null);
        DINCondBold r11 = getLightValue();
        Intrinsics.O10IXXX0X(r11, "<get-lightValue>(...)");
        cp5.O1O(r5, r11, getMActivity(), 0, 0, 24, null);
        DINCondBold r12 = getAwakeValue();
        Intrinsics.O10IXXX0X(r12, "<get-awakeValue>(...)");
        cp5.O1O(r7, r12, getMActivity(), 0, 0, 24, null);
        DINCondBold r13 = getNowValue();
        Intrinsics.O10IXXX0X(r13, "<get-nowValue>(...)");
        int r14 = r8;
        cp5.O1O(r14, r13, getMActivity(), 0, 0, 24, null);
        Oi01X10i r3 = null;
        if (1 <= r14) goto L20;
    L26:
        Oi01X10i r4 = this.infoBarChartRender;
        if (r4 != null) goto L29;
        Intrinsics.XXO("infoBarChartRender");
    L30:
        r3.i010I(2.0f);
    L31:
        updateChartData(this.values);
        return;
    L29:
        r3 = r4;
        goto L30
    L20:
        if (r14 >= 121) goto L26;
        Oi01X10i r15 = this.infoBarChartRender;
        if (r15 != null) goto L24;
        Intrinsics.XXO("infoBarChartRender");
    L25:
        r3.i010I(6.0f);
        goto L31
    L24:
        r3 = r15;
    L12:
        if (this.values.isEmpty() == true) goto L13;
        if (r8 != 0) goto L16;
        getSleepStartTime().setText("");
        getSleepEndTime().setText("");
        getBarChart().getXAxis().Oi(new q4(CollectionsKt__CollectionsKt.iI()));
    L16:
        r9 = r2;
        r5 = r6;
        goto L17
    L7:
        r2 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        goto L9
    }

    private final DINCondBold getAwakeValue() {
        return (DINCondBold) getValue();
    }

    private final BarChart getBarChart() {
        return (BarChart) getValue();
    }

    private final DINCondBold getDeepValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getLightValue() {
        return (DINCondBold) getValue();
    }

    private final TextView getSleepEndTime() {
        return (TextView) getValue();
    }

    private final TextView getSleepStartTime() {
        return (TextView) getValue();
    }

    private static final DINCondBold lightValue_delegate$lambda$0(SleepDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.lightValue);
    }

    private final void setXAxis(int r9, int r10) {
        XAxis r0 = getBarChart().getXAxis();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        int r3 = 0;
        SimpleDateFormat r1 = O0X11OiO.XO0X10iO(false, 1, null);
        ArrayList r2 = new ArrayList();
        if (r10 < 0) goto L7;
    L4:
        r2.add("");
        if (r3 == r10) goto L7;
        r3 = r3 + 1;
    L7:
        getSleepStartTime().setText(TimeUtils.millis2String(((long) r9) * 1000, r1));
        getSleepEndTime().setText(TimeUtils.millis2String(((long) (r9 + (r10 * 60))) * 1000, r1));
        r0.Oi(new q4(r2));
        r0.O1O = 0.0f;
        r0.IXOIIIO(r2.size() / 4);
        r0.iOO1ii1 = r2.size();
    }

    private static final TextView sleepEndTime_delegate$lambda$0(SleepDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepEndTime);
    }

    private static final TextView sleepStartTime_delegate$lambda$0(SleepDayFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sleepStartTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> r4) {
        if (getBarChart().getData() != 0) goto L5;
    L7:
        XXX1X11 r0 = new XXX1X11(r4, "SleepData");
        r0.iIXX0i(0.0f);
        r0.iO11i(0.0f);
        IXIX1X1 r5 = new IXIX1X1(new XIXi1iX00[]{r0});
        r5.iI(false);
        getBarChart().setData(r5);
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        return;
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L7;
        ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        goto L7
    }

    @aa1
    public final XXX1X11 getSetValue() {
        XXX1X11 r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        BarChart r1 = getBarChart();
        Intrinsics.O10IXXX0X(r1, "<get-barChart>(...)");
        r0.OXO1(r1);
        YAxis r2 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r2, "getAxisLeft(...)");
        YAxis r3 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r3, "getAxisRight(...)");
        r0.I0iXXO(r2, r3, 300.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        BarChart r4 = getBarChart();
        r4.setDrawValueAboveBar(false);
        r4.setTouchEnabled(false);
        r4.setScaleEnabled(false);
        r4.getAxisRight().XOXiX0(4, true);
        r4.getDescription().XOO0ii0(false);
        r4.getLegend().XOO0ii0(false);
        XAxis r5 = getBarChart().getXAxis();
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        Context r6 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        r0.OIi0(r5, false, r6);
        Oi01X10i r7 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        this.infoBarChartRender = r7;
        r7.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        Oi01X10i r8 = this.infoBarChartRender;
        Oi01X10i r9 = null;
        if (r8 != null) goto L5;
        Intrinsics.XXO("infoBarChartRender");
        r8 = null;
    L5:
        r8.X01IiOiIi(this.blockHeight);
        Oi01X10i r10 = this.infoBarChartRender;
        if (r10 != null) goto L8;
        Intrinsics.XXO("infoBarChartRender");
        r10 = null;
    L8:
        r10.OX(this.block);
        Oi01X10i r11 = this.infoBarChartRender;
        if (r11 != null) goto L11;
        Intrinsics.XXO("infoBarChartRender");
        r11 = null;
    L11:
        r11.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.sleep_show_5), ContextCompat.getColor(getMActivity(), R.color.sleep_show_6), ContextCompat.getColor(getMActivity(), R.color.sleep_show_3), ContextCompat.getColor(getMActivity(), R.color.sleep_show_4), ContextCompat.getColor(getMActivity(), R.color.sleep_show_1), ContextCompat.getColor(getMActivity(), R.color.sleep_show_2)});
        Oi01X10i r12 = this.infoBarChartRender;
        if (r12 != null) goto L14;
        Intrinsics.XXO("infoBarChartRender");
        r12 = null;
    L14:
        r12.iIiiO(4);
        BarChart r13 = getBarChart();
        Oi01X10i r14 = this.infoBarChartRender;
        if (r14 != null) goto L17;
        Intrinsics.XXO("infoBarChartRender");
    L18:
        r13.setRenderer(r9);
        super.initView();
        return;
    L17:
        r9 = r14;
        goto L18
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_sleep_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Sleep> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Sleep> onTimePeriodChange(@aa1 Calendar r6, int r7, @aa1 TimePeriod r8) {
        Intrinsics.X0O(r6, "calendar");
        Intrinsics.X0O(r8, "timePeriod");
        setRange(O0X11OiO.I1(r6, r8, r7));
        LogUtils.d(new Object[]{getRange()});
        SleepDao r9 = this.mSleepDao;
        long r0 = getRange()[0];
        long r10 = O0X11OiO.iXiX011;
        return r9.getSleeps(r0 - r10, getRange()[1] - r10);
    }

    @aa1
    public final String setDataLabel() {
        return "sleep day Data";
    }

    public final void setSetValue(@aa1 XXX1X11 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }
}
