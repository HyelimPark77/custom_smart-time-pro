package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X1i1iOX;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0OX00;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
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
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleSleepQuality;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Sleep2Item extends BaseDslItem {
    private BarChart barChart;
    private final int block;
    private final float blockHeight;
    private View dataPanel;
    private View emptyPanel;
    private SimpleDateFormat format;
    private final boolean initEvent;
    private Context mContext;

    @aa1
    private final SleepDao mSleepDao;
    private TextView sleepEndTime;
    private TextView sleepHour;
    private TextView sleepMinute;
    private TextView sleepStartTime;
    private TextView sleepTime;

    @aa1
    private List<BarEntry> values;

    public Sleep2Item() {
        this.values = new ArrayList();
        this.block = 3;
        this.blockHeight = 300.0f / 3;
        this.mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
        this.initEvent = true;
    }

    private final void noData() {
        TextView r0 = this.sleepTime;
        View r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sleepTime");
        r0 = null;
    L5:
        r0.setText("");
        TextView r2 = this.sleepHour;
        if (r2 != null) goto L8;
        Intrinsics.XXO("sleepHour");
        r2 = null;
    L8:
        r2.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        TextView r3 = this.sleepMinute;
        if (r3 != null) goto L11;
        Intrinsics.XXO("sleepMinute");
        r3 = null;
    L11:
        r3.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        View r4 = this.emptyPanel;
        if (r4 != null) goto L14;
        Intrinsics.XXO("emptyPanel");
        r4 = null;
    L14:
        r4.setVisibility(0);
        View r5 = this.dataPanel;
        if (r5 != null) goto L17;
        Intrinsics.XXO("dataPanel");
    L18:
        r1.setVisibility(8);
        return;
    L17:
        r1 = r5;
        goto L18
    }

    private final void setXAxis(int r10, int r11) {
        SimpleDateFormat r2 = null;
        TextView r3 = null;
        if (r11 != 0) goto L13;
        TextView r12 = this.sleepStartTime;
        if (r12 != null) goto L7;
        Intrinsics.XXO("sleepStartTime");
        r12 = null;
    L7:
        r12.setText("00:00");
        TextView r13 = this.sleepEndTime;
        if (r13 != null) goto L10;
        Intrinsics.XXO("sleepEndTime");
    L11:
        r3.setText("24:00");
        return;
    L10:
        r3 = r13;
        goto L11
    L13:
        TextView r4 = this.sleepStartTime;
        if (r4 != null) goto L16;
        Intrinsics.XXO("sleepStartTime");
        r4 = null;
    L16:
        long r5 = ((long) r10) * 1000;
        SimpleDateFormat r1 = this.format;
        if (r1 != null) goto L19;
        Intrinsics.XXO("format");
        r1 = null;
    L19:
        r4.setText(TimeUtils.millis2String(r5, r1));
        TextView r6 = this.sleepEndTime;
        if (r6 != null) goto L22;
        Intrinsics.XXO("sleepEndTime");
        r6 = null;
    L22:
        long r14 = ((long) (r10 + (r11 * 60))) * 1000;
        SimpleDateFormat r0 = this.format;
        if (r0 != null) goto L25;
        Intrinsics.XXO("format");
    L26:
        r6.setText(TimeUtils.millis2String(r14, r2));
        return;
    L25:
        r2 = r0;
        goto L26
    }

    private final void showSleep() {
        TextView r3 = null;
        long[] r1 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SleepDao r2 = this.mSleepDao;
        long r5 = r1[0];
        long r7 = O0X11OiO.iXiX011;
        List<Sleep> r4 = r2.getSleeps(r5 - r7, r1[1] - r7);
        BleSleepQuality r10 = new BleSleepQuality(0, 0, 0, 7, null);
        if (r4.isEmpty() == false) goto L5;
        noData();
        setXAxis(0, 0);
    L32:
        updateData(this.values);
        if (q62.OXO1.IiXIIX1O1() == false) goto L36;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.SLEEP_QUALITY, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    L36:
        return;
    L5:
        this.values.clear();
        SleepDayData r6 = SleepDataParse.INSTANCE.filterData(r4, this.blockHeight, this.values);
        if (r6.getTotal() == 0) goto L10;
        if (r6.getTotal() >= 60) goto L10;
    L11:
        noData();
    L31:
        setXAxis(r6.getStartTime(), r6.getTotal());
    L10:
        if (this.values.isEmpty() == true) goto L11;
        View r8 = this.emptyPanel;
        if (r8 != null) goto L15;
        Intrinsics.XXO("emptyPanel");
        r8 = null;
    L15:
        r8.setVisibility(8);
        View r9 = this.dataPanel;
        if (r9 != null) goto L18;
        Intrinsics.XXO("dataPanel");
        r9 = null;
    L18:
        r9.setVisibility(0);
        int r11 = r6.getTotal() / 60;
        TextView r12 = this.sleepHour;
        if (r12 != null) goto L21;
        Intrinsics.XXO("sleepHour");
        r12 = null;
    L21:
        r12.setText(String.valueOf(r11));
        TextView r13 = this.sleepMinute;
        if (r13 != null) goto L24;
        Intrinsics.XXO("sleepMinute");
        r13 = null;
    L24:
        r13.setText(String.valueOf(r6.getTotal() - (r11 * 60)));
        TextView r14 = this.sleepTime;
        if (r14 != null) goto L27;
        Intrinsics.XXO("sleepTime");
    L28:
        r3.setText(O0X11OiO.XXX11i().format(new Date(((long) r6.getStartTime()) * 1000)));
        if (q62.OXO1.IiXIIX1O1() == false) goto L31;
        SparseIntArray r15 = r6.getStatus();
        r10.setMLight(r15.get(2));
        r10.setMDeep(r15.get(1));
        r10.setMTotal(r6.getTotal());
        goto L31
    L27:
        r3 = r14;
        goto L28
    }

    private final void showSleepAllDay() {
        SimpleDateFormat r2 = null;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        List<Sleep> r9 = this.mSleepDao.getSleeps(r0[0] - ((long) O0X11OiO.iXiX011), r0[1]);
        if (r9.isEmpty() == false) goto L5;
        noData();
        setXAxis(0, 0);
    L38:
        updateData(this.values);
        return;
    L5:
        this.values.clear();
        SleepAllDayData r1 = SleepAllDayDataParse.INSTANCE.filterData(r9, 300.0f, this.values, r0[0]);
        if (r1.getTotal() <= 0) goto L23;
        View r3 = this.emptyPanel;
        if (r3 != null) goto L10;
        Intrinsics.XXO("emptyPanel");
        r3 = null;
    L10:
        r3.setVisibility(8);
        View r4 = this.dataPanel;
        if (r4 != null) goto L13;
        Intrinsics.XXO("dataPanel");
        r4 = null;
    L13:
        r4.setVisibility(0);
        int r5 = r1.getTotal() / 60;
        TextView r6 = this.sleepHour;
        if (r6 != null) goto L16;
        Intrinsics.XXO("sleepHour");
        r6 = null;
    L16:
        r6.setText(String.valueOf(r5));
        TextView r7 = this.sleepMinute;
        if (r7 != null) goto L19;
        Intrinsics.XXO("sleepMinute");
        r7 = null;
    L19:
        r7.setText(String.valueOf(r1.getTotal() - (r5 * 60)));
        TextView r8 = this.sleepTime;
        if (r8 != null) goto L22;
        Intrinsics.XXO("sleepTime");
        r8 = null;
    L22:
        r8.setText(O0X11OiO.XXX11i().format(new Date(((long) r1.getStartTime()) * 1000)));
    L24:
        TextView r10 = this.sleepStartTime;
        if (r10 != null) goto L27;
        Intrinsics.XXO("sleepStartTime");
        r10 = null;
    L27:
        long r11 = ((long) r1.getStartTime()) * 1000;
        SimpleDateFormat r12 = this.format;
        if (r12 != null) goto L30;
        Intrinsics.XXO("format");
        r12 = null;
    L30:
        r10.setText(TimeUtils.millis2String(r11, r12));
        TextView r13 = this.sleepEndTime;
        if (r13 != null) goto L33;
        Intrinsics.XXO("sleepEndTime");
        r13 = null;
    L33:
        long r14 = ((long) r1.getEndTime()) * 1000;
        SimpleDateFormat r15 = this.format;
        if (r15 != null) goto L36;
        Intrinsics.XXO("format");
    L37:
        r13.setText(TimeUtils.millis2String(r14, r2));
        goto L38
    L36:
        r2 = r15;
        goto L37
    L23:
        noData();
        goto L24
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> r7) {
        BarChart r1 = this.barChart;
        BarChart r2 = null;
        if (r1 != null) goto L6;
        Intrinsics.XXO("barChart");
        r1 = null;
    L6:
        if (r1.getData() == 0) goto L16;
        BarChart r3 = this.barChart;
        if (r3 != null) goto L11;
        Intrinsics.XXO("barChart");
        r3 = null;
    L11:
        if (((IXIX1X1) r3.getData()).XXI() <= 0) goto L16;
        BarChart r4 = this.barChart;
        if (r4 != null) goto L15;
        Intrinsics.XXO("barChart");
        r4 = null;
    L15:
        ((IXIX1X1) r4.getData()).IXXOO(0);
    L16:
        XXX1X11 r5 = new XXX1X11(r7, "SleepData");
        r5.iIXX0i(0.0f);
        r5.iO11i(0.0f);
        IXIX1X1 r8 = new IXIX1X1(new XIXi1iX00[]{r5});
        r8.iI(false);
        r5.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(Utils.getApp(), R.color.colorAccent))}));
        BarChart r0 = this.barChart;
        if (r0 != null) goto L19;
        Intrinsics.XXO("barChart");
        r0 = null;
    L19:
        r0.setData(r8);
        BarChart r9 = this.barChart;
        if (r9 != null) goto L22;
        Intrinsics.XXO("barChart");
    L23:
        r2.invalidate();
        return;
    L22:
        r2 = r9;
        goto L23
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r14) {
        Intrinsics.X0O(r14, "itemHolder");
        View r0 = r14.v(R.id.sleepBarChart);
        Intrinsics.XXI(r0);
        this.barChart = (BarChart) r0;
        View r1 = r14.v(R.id.sleepTime);
        Intrinsics.XXI(r1);
        this.sleepTime = (TextView) r1;
        View r2 = r14.v(R.id.sleepHour);
        Intrinsics.XXI(r2);
        this.sleepHour = (TextView) r2;
        View r3 = r14.v(R.id.sleepMinute);
        Intrinsics.XXI(r3);
        this.sleepMinute = (TextView) r3;
        View r4 = r14.v(R.id.sleepStartTime);
        Intrinsics.XXI(r4);
        this.sleepStartTime = (TextView) r4;
        View r5 = r14.v(R.id.sleepEndTime);
        Intrinsics.XXI(r5);
        this.sleepEndTime = (TextView) r5;
        View r6 = r14.v(R.id.empty_panel);
        Intrinsics.XXI(r6);
        this.emptyPanel = r6;
        BarChart r7 = null;
        if (r6 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r6 = null;
    L5:
        UtilsKt.IX1XiI(r6, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r15 = r14.v(R.id.data_panel);
        Intrinsics.XXI(r15);
        this.dataPanel = r15;
        BarChart r16 = this.barChart;
        if (r16 != null) goto L8;
        Intrinsics.XXO("barChart");
        r16 = null;
    L8:
        Context r17 = r16.getContext();
        Intrinsics.O10IXXX0X(r17, "getContext(...)");
        this.mContext = r17;
        this.format = O0X11OiO.IXI(false, 1, null);
        BarChart r8 = this.barChart;
        if (r8 != null) goto L11;
        Intrinsics.XXO("barChart");
        r8 = null;
    L11:
        r8.i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        BarChart r9 = this.barChart;
        if (r9 != null) goto L14;
        Intrinsics.XXO("barChart");
        r9 = null;
    L14:
        r9.setTouchEnabled(false);
        r9.getDescription().XOO0ii0(false);
        r9.getLegend().XOO0ii0(false);
        YAxis r10 = r9.getAxisLeft();
        r10.Ii0X0X(false);
        r10.iOiXi11II(300.0f);
        r10.X00Xi1X(false);
        r10.XO0X10iO(false);
        r10.Ii0X0X(false);
        r10.i0X000X0O(0.0f);
        r10.iIi0(0.0f);
        YAxis r11 = r9.getAxisRight();
        r11.XOO0ii0(false);
        r11.i0X000X0O(0.0f);
        r11.iIi0(0.0f);
        r11.X00Xi1X(false);
        r11.Ii0X0X(false);
        XAxis r12 = r9.getXAxis();
        iO1Xi1X1i r13 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r12);
        Context r18 = this.mContext;
        if (r18 != null) goto L17;
        Intrinsics.XXO("mContext");
        r18 = null;
    L17:
        r13.OIi0(r12, true, r18);
        r12.X00Xi1X(false);
        r12.Ii0X0X(false);
        BarChart r19 = this.barChart;
        if (r19 != null) goto L20;
        Intrinsics.XXO("barChart");
        r19 = null;
    L20:
        BarChart r20 = this.barChart;
        if (r20 != null) goto L23;
        Intrinsics.XXO("barChart");
        r20 = null;
    L23:
        X1i1iOX r21 = r20.getAnimator();
        BarChart r22 = this.barChart;
        if (r22 != null) goto L26;
        Intrinsics.XXO("barChart");
        r22 = null;
    L26:
        Oi01X10i r110 = new Oi01X10i(r19, r21, r22.getViewPortHandler());
        Context r23 = this.mContext;
        if (r23 != null) goto L29;
        Intrinsics.XXO("mContext");
        r23 = null;
    L29:
        r110.iOOX010X(gk4.iO(r23, R.color.line_color));
        r110.X01IiOiIi(this.blockHeight);
        r110.OX(this.block);
        Context r24 = this.mContext;
        if (r24 != null) goto L32;
        Intrinsics.XXO("mContext");
        r24 = null;
    L32:
        int r25 = ContextCompat.getColor(r24, R.color.sleep_show_5);
        Context r26 = this.mContext;
        if (r26 != null) goto L35;
        Intrinsics.XXO("mContext");
        r26 = null;
    L35:
        int r27 = ContextCompat.getColor(r26, R.color.sleep_show_6);
        Context r28 = this.mContext;
        if (r28 != null) goto L38;
        Intrinsics.XXO("mContext");
        r28 = null;
    L38:
        int r29 = ContextCompat.getColor(r28, R.color.sleep_show_3);
        Context r30 = this.mContext;
        if (r30 != null) goto L41;
        Intrinsics.XXO("mContext");
        r30 = null;
    L41:
        int r111 = ContextCompat.getColor(r30, R.color.sleep_show_4);
        Context r31 = this.mContext;
        if (r31 != null) goto L44;
        Intrinsics.XXO("mContext");
        r31 = null;
    L44:
        int r112 = ContextCompat.getColor(r31, R.color.sleep_show_1);
        Context r32 = this.mContext;
        if (r32 != null) goto L47;
        Intrinsics.XXO("mContext");
        r32 = null;
    L47:
        r110.I1(new int[]{r25, r27, r29, r111, r112, ContextCompat.getColor(r32, R.color.sleep_show_2)});
        r110.iIiiO(4);
        BarChart r33 = this.barChart;
        if (r33 != null) goto L50;
        Intrinsics.XXO("barChart");
    L51:
        r7.setRenderer(r110);
        return;
    L50:
        r7 = r33;
        goto L51
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        BarChart r2 = null;
        if (q62.OXO1.IXi01O() == false) goto L10;
        BarChart r0 = this.barChart;
        if (r0 != null) goto L7;
        Intrinsics.XXO("barChart");
    L8:
        i0OX00 r1 = r2.getRenderer();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
        Oi01X10i r3 = (Oi01X10i) r1;
        r3.X01IiOiIi(300.0f);
        r3.OX(1);
        r3.iIiiO(6);
        r3.i010I(2.0f);
        showSleepAllDay();
        return;
    L7:
        r2 = r0;
        goto L8
    L10:
        BarChart r4 = this.barChart;
        if (r4 != null) goto L13;
        Intrinsics.XXO("barChart");
    L14:
        i0OX00 r5 = r2.getRenderer();
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
        Oi01X10i r6 = (Oi01X10i) r5;
        r6.X01IiOiIi(this.blockHeight);
        r6.OX(this.block);
        r6.iIiiO(4);
        r6.i010I(1.0f);
        showSleep();
        return;
    L13:
        r2 = r4;
        goto L14
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_sleep;
    }

    @sf5(tag = I01XX0.XO0O10)
    public final void onSleepChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onSleepChanged"});
        initView();
    }
}
