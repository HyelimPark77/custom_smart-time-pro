package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0OX00;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleSleepQuality;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class SleepItem extends BaseDslItem {
    public BarChart barChart;
    private final int block;
    private final float blockHeight;
    private SimpleDateFormat format;
    private final boolean initEvent;
    public Context mContext;

    @aa1
    private final SleepDao mSleepDao;
    private DINCondBold noData;
    private RelativeLayout sleepBarChartRl;
    private TextView sleepEndTime;
    private DINCondBold sleepHour;
    private DINCondBold sleepMinute;
    private TextView sleepStartTime;
    private DINCondBold sleepTime;

    @aa1
    private List<BarEntry> values;

    public SleepItem() {
        this.values = new ArrayList();
        this.block = 3;
        this.blockHeight = 300.0f / 3;
        this.mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
        this.initEvent = true;
    }

    private final void noData() {
        DINCondBold r0 = this.sleepTime;
        DINCondBold r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sleepTime");
        r0 = null;
    L5:
        r0.setText(R.string.data_none);
        DINCondBold r2 = this.sleepHour;
        if (r2 != null) goto L8;
        Intrinsics.XXO("sleepHour");
        r2 = null;
    L8:
        r2.setText(R.string.data_none);
        DINCondBold r3 = this.sleepMinute;
        if (r3 != null) goto L11;
        Intrinsics.XXO("sleepMinute");
        r3 = null;
    L11:
        r3.setText(R.string.data_none);
        RelativeLayout r4 = this.sleepBarChartRl;
        if (r4 != null) goto L14;
        Intrinsics.XXO("sleepBarChartRl");
        r4 = null;
    L14:
        r4.setVisibility(8);
        DINCondBold r5 = this.noData;
        if (r5 != null) goto L17;
        Intrinsics.XXO("noData");
    L18:
        r1.setVisibility(0);
        return;
    L17:
        r1 = r5;
        goto L18
    }

    private final void setXAxis(int r12, int r13) {
        XAxis r0 = getBarChart().getXAxis();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        ArrayList r1 = new ArrayList();
        if (r13 < 0) goto L8;
        int r3 = 0;
    L5:
        r1.add("");
        if (r3 == r13) goto L8;
        r3 = r3 + 1;
    L8:
        SimpleDateFormat r5 = null;
        TextView r6 = null;
        if (r13 != 0) goto L18;
        TextView r14 = this.sleepStartTime;
        if (r14 != null) goto L13;
        Intrinsics.XXO("sleepStartTime");
        r14 = null;
    L13:
        r14.setText("");
        TextView r15 = this.sleepEndTime;
        if (r15 != null) goto L16;
        Intrinsics.XXO("sleepEndTime");
    L17:
        r6.setText("");
    L32:
        r0.Oi(new q4(r1));
        return;
    L16:
        r6 = r15;
        goto L17
    L18:
        TextView r2 = this.sleepStartTime;
        if (r2 != null) goto L21;
        Intrinsics.XXO("sleepStartTime");
        r2 = null;
    L21:
        long r7 = ((long) r12) * 1000;
        SimpleDateFormat r4 = this.format;
        if (r4 != null) goto L24;
        Intrinsics.XXO("format");
        r4 = null;
    L24:
        r2.setText(TimeUtils.millis2String(r7, r4));
        TextView r8 = this.sleepEndTime;
        if (r8 != null) goto L27;
        Intrinsics.XXO("sleepEndTime");
        r8 = null;
    L27:
        long r16 = ((long) (r12 + (r13 * 60))) * 1000;
        SimpleDateFormat r9 = this.format;
        if (r9 != null) goto L30;
        Intrinsics.XXO("format");
    L31:
        r8.setText(TimeUtils.millis2String(r16, r5));
        goto L32
    L30:
        r5 = r9;
        goto L31
    }

    private final void showSleep() {
        TextView r3 = null;
        long[] r1 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SleepDao r2 = this.mSleepDao;
        long r5 = r1[0];
        long r7 = O0X11OiO.iXiX011;
        List<Sleep> r4 = r2.getSleeps(r5 - r7, r1[1] - r7);
        BleSleepQuality r10 = new BleSleepQuality(0, 0, 0, 7, null);
        if (r4.isEmpty() == false) goto L20;
        noData();
        if (i72.OXO1.XIIO11I() == false) goto L46;
        RelativeLayout r6 = this.sleepBarChartRl;
        if (r6 != null) goto L9;
        Intrinsics.XXO("sleepBarChartRl");
        r6 = null;
    L9:
        r6.setVisibility(0);
        DINCondBold r8 = this.noData;
        if (r8 != null) goto L12;
        Intrinsics.XXO("noData");
        r8 = null;
    L12:
        r8.setVisibility(8);
        List<Sleep> r9 = this.mSleepDao.getTestSleeps(r1[0] - r7, r1[1] - r7);
        this.values.clear();
        SleepDayData r11 = SleepDataParse.INSTANCE.filterData(r9, this.blockHeight, this.values);
        setXAxis(r11.getStartTime(), r11.getTotal());
        updateData(this.values);
        TextView r12 = this.sleepStartTime;
        if (r12 != null) goto L15;
        Intrinsics.XXO("sleepStartTime");
        r12 = null;
    L15:
        r12.setText("");
        TextView r13 = this.sleepEndTime;
        if (r13 != null) goto L18;
        Intrinsics.XXO("sleepEndTime");
    L19:
        r3.setText("");
        goto L46
    L18:
        r3 = r13;
    L46:
        if (q62.OXO1.IiXIIX1O1() == false) goto L49;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.SLEEP_QUALITY, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    L49:
        return;
    L20:
        RelativeLayout r14 = this.sleepBarChartRl;
        if (r14 != null) goto L23;
        Intrinsics.XXO("sleepBarChartRl");
        r14 = null;
    L23:
        r14.setVisibility(0);
        DINCondBold r15 = this.noData;
        if (r15 != null) goto L26;
        Intrinsics.XXO("noData");
        r15 = null;
    L26:
        r15.setVisibility(8);
        this.values.clear();
        SleepDayData r16 = SleepDataParse.INSTANCE.filterData(r4, this.blockHeight, this.values);
        if (r16.getTotal() == 0) goto L31;
        if (r16.getTotal() >= 60) goto L31;
    L32:
        noData();
    L31:
        if (this.values.isEmpty() == true) goto L32;
        setXAxis(r16.getStartTime(), r16.getTotal());
        updateData(this.values);
        int r17 = r16.getTotal() / 60;
        DINCondBold r18 = this.sleepHour;
        if (r18 != null) goto L36;
        Intrinsics.XXO("sleepHour");
        r18 = null;
    L36:
        r18.setText(String.valueOf(r17));
        DINCondBold r19 = this.sleepMinute;
        if (r19 != null) goto L39;
        Intrinsics.XXO("sleepMinute");
        r19 = null;
    L39:
        r19.setText(String.valueOf(r16.getTotal() - (r17 * 60)));
        DINCondBold r20 = this.sleepTime;
        if (r20 != null) goto L42;
        Intrinsics.XXO("sleepTime");
        r20 = null;
    L42:
        r20.setText(TimeUtils.millis2String(((long) r16.getStartTime()) * 1000, O0X11OiO.X0i1O(null, 1, null)));
        if (q62.OXO1.IiXIIX1O1() == false) goto L46;
        SparseIntArray r21 = r16.getStatus();
        r10.setMLight(r21.get(2));
        r10.setMDeep(r21.get(1));
        r10.setMTotal(r16.getTotal());
        goto L46
    }

    private final void showSleepAllDay() {
        SimpleDateFormat r3 = null;
        TextView r4 = null;
        int r5 = 0;
        long[] r1 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SleepDao r2 = this.mSleepDao;
        long r6 = r1[0];
        long r7 = O0X11OiO.iXiX011;
        List<Sleep> r13 = r2.getSleeps(r6 - r7, r1[1]);
        if (r13.isEmpty() == false) goto L21;
        noData();
        if (i72.OXO1.XIIO11I() == false) goto L63;
        RelativeLayout r8 = this.sleepBarChartRl;
        if (r8 != null) goto L9;
        Intrinsics.XXO("sleepBarChartRl");
        r8 = null;
    L9:
        r8.setVisibility(0);
        DINCondBold r9 = this.noData;
        if (r9 != null) goto L12;
        Intrinsics.XXO("noData");
        r9 = null;
    L12:
        r9.setVisibility(8);
        List<Sleep> r16 = this.mSleepDao.getTestSleeps(r1[0] - r7, r1[1]);
        this.values.clear();
        SleepAllDayData r10 = SleepAllDayDataParse.INSTANCE.filterData(r16, 300.0f, this.values, r1[0]);
        setXAxis(r10.getStartTime(), r10.getTotal());
        updateData(this.values);
        TextView r11 = this.sleepStartTime;
        if (r11 != null) goto L15;
        Intrinsics.XXO("sleepStartTime");
        r11 = null;
    L15:
        r11.setText("");
        TextView r12 = this.sleepEndTime;
        if (r12 != null) goto L18;
        Intrinsics.XXO("sleepEndTime");
    L19:
        r4.setText("");
        return;
    L18:
        r4 = r12;
        goto L19
    L63:
        return;
    L21:
        RelativeLayout r14 = this.sleepBarChartRl;
        if (r14 != null) goto L24;
        Intrinsics.XXO("sleepBarChartRl");
        r14 = null;
    L24:
        r14.setVisibility(0);
        DINCondBold r15 = this.noData;
        if (r15 != null) goto L27;
        Intrinsics.XXO("noData");
        r15 = null;
    L27:
        r15.setVisibility(8);
        this.values.clear();
        SleepAllDayData r17 = SleepAllDayDataParse.INSTANCE.filterData(r13, 300.0f, this.values, r1[0]);
        if (r17.getTotal() == 0) goto L30;
    L33:
        XAxis r18 = getBarChart().getXAxis();
        Intrinsics.X1ii(r18, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        ArrayList r19 = new ArrayList();
        int r110 = r17.getTotal();
        if (r110 < 0) goto L38;
    L35:
        r19.add("");
        if (r5 == r110) goto L38;
        r5 = r5 + 1;
    L38:
        r18.Oi(new q4(r19));
        updateData(this.values);
        int r20 = r17.getTotal() / 60;
        DINCondBold r21 = this.sleepHour;
        if (r21 != null) goto L41;
        Intrinsics.XXO("sleepHour");
        r21 = null;
    L41:
        r21.setText(String.valueOf(r20));
        DINCondBold r22 = this.sleepMinute;
        if (r22 != null) goto L44;
        Intrinsics.XXO("sleepMinute");
        r22 = null;
    L44:
        r22.setText(String.valueOf(r17.getTotal() - (r20 * 60)));
        DINCondBold r23 = this.sleepTime;
        if (r23 != null) goto L47;
        Intrinsics.XXO("sleepTime");
        r23 = null;
    L47:
        r23.setText(TimeUtils.millis2String(((long) r17.getStartTime()) * 1000, O0X11OiO.X0i1O(null, 1, null)));
        TextView r24 = this.sleepStartTime;
        if (r24 != null) goto L50;
        Intrinsics.XXO("sleepStartTime");
        r24 = null;
    L50:
        long r25 = ((long) r17.getStartTime()) * 1000;
        SimpleDateFormat r26 = this.format;
        if (r26 != null) goto L53;
        Intrinsics.XXO("format");
        r26 = null;
    L53:
        r24.setText(TimeUtils.millis2String(r25, r26));
        TextView r27 = this.sleepEndTime;
        if (r27 != null) goto L56;
        Intrinsics.XXO("sleepEndTime");
        r27 = null;
    L56:
        long r28 = ((long) r17.getEndTime()) * 1000;
        SimpleDateFormat r29 = this.format;
        if (r29 != null) goto L59;
        Intrinsics.XXO("format");
    L60:
        r27.setText(TimeUtils.millis2String(r28, r3));
        return;
    L59:
        r3 = r29;
        goto L60
    L30:
        if (this.values.isEmpty() == false) goto L33;
        noData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> r5) {
        if (getBarChart().getData() != 0) goto L5;
    L7:
        XXX1X11 r0 = new XXX1X11(r5, "SleepData");
        r0.iIXX0i(0.0f);
        r0.iO11i(0.0f);
        IXIX1X1 r6 = new IXIX1X1(new XIXi1iX00[]{r0});
        r6.iI(false);
        r0.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(Utils.getApp(), R.color.colorAccent))}));
        getBarChart().setData(r6);
        getBarChart().invalidate();
        return;
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L7;
        ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        goto L7
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r9) {
        Intrinsics.X0O(r9, "itemHolder");
        View r0 = r9.v(R.id.sleepBarChart);
        Intrinsics.XXI(r0);
        setBarChart((BarChart) r0);
        View r1 = r9.v(R.id.sleepTime);
        Intrinsics.XXI(r1);
        this.sleepTime = (DINCondBold) r1;
        View r2 = r9.v(R.id.sleepHour);
        Intrinsics.XXI(r2);
        this.sleepHour = (DINCondBold) r2;
        View r3 = r9.v(R.id.sleepMinute);
        Intrinsics.XXI(r3);
        this.sleepMinute = (DINCondBold) r3;
        View r4 = r9.v(R.id.noData);
        Intrinsics.XXI(r4);
        this.noData = (DINCondBold) r4;
        View r5 = r9.v(R.id.sleepBarChartRl);
        Intrinsics.XXI(r5);
        this.sleepBarChartRl = (RelativeLayout) r5;
        View r6 = r9.v(R.id.sleepStartTime);
        Intrinsics.XXI(r6);
        this.sleepStartTime = (TextView) r6;
        View r10 = r9.v(R.id.sleepEndTime);
        Intrinsics.XXI(r10);
        this.sleepEndTime = (TextView) r10;
        Context r11 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r11, "getContext(...)");
        setMContext(r11);
        this.format = O0X11OiO.IXI(false, 1, null);
        iO1Xi1X1i r12 = iO1Xi1X1i.OXO1;
        r12.OXO1(getBarChart());
        YAxis r7 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r7, "getAxisLeft(...)");
        YAxis r8 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r8, "getAxisRight(...)");
        r12.IO(r7, r8, 300.0f, 0.0f);
        BarChart r13 = getBarChart();
        r13.getDescription().XOO0ii0(false);
        r13.getLegend().XOO0ii0(false);
        r13.setTouchEnabled(false);
        r13.setDrawValueAboveBar(false);
        r13.getAxisLeft().XXI(r12.iO(getMContext()));
        XAxis r14 = getBarChart().getXAxis();
        Intrinsics.X1ii(r14, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        r12.OIi0(r14, true, getMContext());
        Oi01X10i r15 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r15.iOOX010X(gk4.iO(getMContext(), R.color.line_color));
        r15.X01IiOiIi(this.blockHeight);
        r15.OX(this.block);
        r15.I1(new int[]{ContextCompat.getColor(getMContext(), R.color.sleep_show_5), ContextCompat.getColor(getMContext(), R.color.sleep_show_6), ContextCompat.getColor(getMContext(), R.color.sleep_show_3), ContextCompat.getColor(getMContext(), R.color.sleep_show_4), ContextCompat.getColor(getMContext(), R.color.sleep_show_1), ContextCompat.getColor(getMContext(), R.color.sleep_show_2)});
        r15.iIiiO(4);
        getBarChart().setRenderer(r15);
    }

    @aa1
    public final BarChart getBarChart() {
        BarChart r0 = this.barChart;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("barChart");
        return null;
    }

    public final int getBlock() {
        return this.block;
    }

    public final float getBlockHeight() {
        return this.blockHeight;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (q62.OXO1.IXi01O() == false) goto L6;
        i0OX00 r0 = getBarChart().getRenderer();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
        Oi01X10i r1 = (Oi01X10i) r0;
        r1.X01IiOiIi(300.0f);
        r1.OX(1);
        r1.iIiiO(6);
        r1.i010I(2.0f);
        showSleepAllDay();
        return;
    L6:
        i0OX00 r2 = getBarChart().getRenderer();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
        Oi01X10i r3 = (Oi01X10i) r2;
        r3.X01IiOiIi(this.blockHeight);
        r3.OX(this.block);
        r3.iIiiO(4);
        r3.i010I(1.0f);
        showSleep();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_sleep;
    }

    @sf5(tag = I01XX0.XO0O10)
    public final void onSleepChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onSleepChanged"});
        initView();
    }

    public final void setBarChart(@aa1 BarChart r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.barChart = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
