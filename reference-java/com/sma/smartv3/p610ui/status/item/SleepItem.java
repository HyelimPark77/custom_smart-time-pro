package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0OX00;
import com.android.mltcode.paycertificationapi.i72;
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
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.entity.Sleep;
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
    private SimpleDateFormat format;
    public Context mContext;
    private DINCondBold noData;
    private RelativeLayout sleepBarChartRl;
    private TextView sleepEndTime;
    private DINCondBold sleepHour;
    private DINCondBold sleepMinute;
    private TextView sleepStartTime;
    private DINCondBold sleepTime;

    @aa1
    private List<BarEntry> values = new ArrayList();
    private final int block = 3;
    private final float blockHeight = 300.0f / 3;

    @aa1
    private final SleepDao mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
    private final boolean initEvent = true;

    private final void noData() {
        DINCondBold dINCondBold = this.sleepTime;
        DINCondBold dINCondBold2 = null;
        if (dINCondBold == null) {
            Intrinsics.XXO("sleepTime");
            dINCondBold = null;
        }
        dINCondBold.setText(R.string.data_none);
        DINCondBold dINCondBold3 = this.sleepHour;
        if (dINCondBold3 == null) {
            Intrinsics.XXO("sleepHour");
            dINCondBold3 = null;
        }
        dINCondBold3.setText(R.string.data_none);
        DINCondBold dINCondBold4 = this.sleepMinute;
        if (dINCondBold4 == null) {
            Intrinsics.XXO("sleepMinute");
            dINCondBold4 = null;
        }
        dINCondBold4.setText(R.string.data_none);
        RelativeLayout relativeLayout = this.sleepBarChartRl;
        if (relativeLayout == null) {
            Intrinsics.XXO("sleepBarChartRl");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        DINCondBold dINCondBold5 = this.noData;
        if (dINCondBold5 == null) {
            Intrinsics.XXO("noData");
        } else {
            dINCondBold2 = dINCondBold5;
        }
        dINCondBold2.setVisibility(0);
    }

    private final void setXAxis(int i, int i2) {
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        ArrayList arrayList = new ArrayList();
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                arrayList.add("");
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        SimpleDateFormat simpleDateFormat = null;
        TextView textView = null;
        if (i2 == 0) {
            TextView textView2 = this.sleepStartTime;
            if (textView2 == null) {
                Intrinsics.XXO("sleepStartTime");
                textView2 = null;
            }
            textView2.setText("");
            TextView textView3 = this.sleepEndTime;
            if (textView3 == null) {
                Intrinsics.XXO("sleepEndTime");
            } else {
                textView = textView3;
            }
            textView.setText("");
        } else {
            TextView textView4 = this.sleepStartTime;
            if (textView4 == null) {
                Intrinsics.XXO("sleepStartTime");
                textView4 = null;
            }
            long j = ((long) i) * 1000;
            SimpleDateFormat simpleDateFormat2 = this.format;
            if (simpleDateFormat2 == null) {
                Intrinsics.XXO("format");
                simpleDateFormat2 = null;
            }
            textView4.setText(TimeUtils.millis2String(j, simpleDateFormat2));
            TextView textView5 = this.sleepEndTime;
            if (textView5 == null) {
                Intrinsics.XXO("sleepEndTime");
                textView5 = null;
            }
            long j2 = ((long) (i + (i2 * 60))) * 1000;
            SimpleDateFormat simpleDateFormat3 = this.format;
            if (simpleDateFormat3 == null) {
                Intrinsics.XXO("format");
            } else {
                simpleDateFormat = simpleDateFormat3;
            }
            textView5.setText(TimeUtils.millis2String(j2, simpleDateFormat));
        }
        xAxis.m603Oi(new C2829q4(arrayList));
    }

    private final void showSleep() {
        TextView textView = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SleepDao sleepDao = this.mSleepDao;
        long j = jArrIOOX010X[0];
        long j2 = O0X11OiO.iXiX011;
        List<Sleep> sleeps = sleepDao.getSleeps(j - j2, jArrIOOX010X[1] - j2);
        BleSleepQuality bleSleepQuality = new BleSleepQuality(0, 0, 0, 7, null);
        if (sleeps.isEmpty()) {
            noData();
            if (i72.OXO1.XIIO11I()) {
                RelativeLayout relativeLayout = this.sleepBarChartRl;
                if (relativeLayout == null) {
                    Intrinsics.XXO("sleepBarChartRl");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(0);
                DINCondBold dINCondBold = this.noData;
                if (dINCondBold == null) {
                    Intrinsics.XXO("noData");
                    dINCondBold = null;
                }
                dINCondBold.setVisibility(8);
                List<Sleep> testSleeps = this.mSleepDao.getTestSleeps(jArrIOOX010X[0] - j2, jArrIOOX010X[1] - j2);
                this.values.clear();
                SleepDayData sleepDayDataFilterData = SleepDataParse.INSTANCE.filterData(testSleeps, this.blockHeight, this.values);
                setXAxis(sleepDayDataFilterData.getStartTime(), sleepDayDataFilterData.getTotal());
                updateData(this.values);
                TextView textView2 = this.sleepStartTime;
                if (textView2 == null) {
                    Intrinsics.XXO("sleepStartTime");
                    textView2 = null;
                }
                textView2.setText("");
                TextView textView3 = this.sleepEndTime;
                if (textView3 == null) {
                    Intrinsics.XXO("sleepEndTime");
                } else {
                    textView = textView3;
                }
                textView.setText("");
            }
        } else {
            RelativeLayout relativeLayout2 = this.sleepBarChartRl;
            if (relativeLayout2 == null) {
                Intrinsics.XXO("sleepBarChartRl");
                relativeLayout2 = null;
            }
            relativeLayout2.setVisibility(0);
            DINCondBold dINCondBold2 = this.noData;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("noData");
                dINCondBold2 = null;
            }
            dINCondBold2.setVisibility(8);
            this.values.clear();
            SleepDayData sleepDayDataFilterData2 = SleepDataParse.INSTANCE.filterData(sleeps, this.blockHeight, this.values);
            if ((sleepDayDataFilterData2.getTotal() == 0 || sleepDayDataFilterData2.getTotal() >= 60) && !this.values.isEmpty()) {
                setXAxis(sleepDayDataFilterData2.getStartTime(), sleepDayDataFilterData2.getTotal());
                updateData(this.values);
                int total = sleepDayDataFilterData2.getTotal() / 60;
                DINCondBold dINCondBold3 = this.sleepHour;
                if (dINCondBold3 == null) {
                    Intrinsics.XXO("sleepHour");
                    dINCondBold3 = null;
                }
                dINCondBold3.setText(String.valueOf(total));
                DINCondBold dINCondBold4 = this.sleepMinute;
                if (dINCondBold4 == null) {
                    Intrinsics.XXO("sleepMinute");
                    dINCondBold4 = null;
                }
                dINCondBold4.setText(String.valueOf(sleepDayDataFilterData2.getTotal() - (total * 60)));
                DINCondBold dINCondBold5 = this.sleepTime;
                if (dINCondBold5 == null) {
                    Intrinsics.XXO("sleepTime");
                    dINCondBold5 = null;
                }
                dINCondBold5.setText(TimeUtils.millis2String(((long) sleepDayDataFilterData2.getStartTime()) * 1000, O0X11OiO.X0i1O(null, 1, null)));
                if (q62.OXO1.IiXIIX1O1()) {
                    SparseIntArray status = sleepDayDataFilterData2.getStatus();
                    bleSleepQuality.setMLight(status.get(2));
                    bleSleepQuality.setMDeep(status.get(1));
                    bleSleepQuality.setMTotal(sleepDayDataFilterData2.getTotal());
                }
            } else {
                noData();
            }
        }
        if (q62.OXO1.IiXIIX1O1()) {
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.SLEEP_QUALITY, BleKeyFlag.UPDATE, bleSleepQuality, false, false, 24, null);
        }
    }

    private final void showSleepAllDay() {
        SimpleDateFormat simpleDateFormat = null;
        TextView textView = null;
        int i = 0;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        SleepDao sleepDao = this.mSleepDao;
        long j = jArrIOOX010X[0];
        long j2 = O0X11OiO.iXiX011;
        List<Sleep> sleeps = sleepDao.getSleeps(j - j2, jArrIOOX010X[1]);
        if (sleeps.isEmpty()) {
            noData();
            if (i72.OXO1.XIIO11I()) {
                RelativeLayout relativeLayout = this.sleepBarChartRl;
                if (relativeLayout == null) {
                    Intrinsics.XXO("sleepBarChartRl");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(0);
                DINCondBold dINCondBold = this.noData;
                if (dINCondBold == null) {
                    Intrinsics.XXO("noData");
                    dINCondBold = null;
                }
                dINCondBold.setVisibility(8);
                List<Sleep> testSleeps = this.mSleepDao.getTestSleeps(jArrIOOX010X[0] - j2, jArrIOOX010X[1]);
                this.values.clear();
                SleepAllDayData sleepAllDayDataFilterData = SleepAllDayDataParse.INSTANCE.filterData(testSleeps, 300.0f, this.values, jArrIOOX010X[0]);
                setXAxis(sleepAllDayDataFilterData.getStartTime(), sleepAllDayDataFilterData.getTotal());
                updateData(this.values);
                TextView textView2 = this.sleepStartTime;
                if (textView2 == null) {
                    Intrinsics.XXO("sleepStartTime");
                    textView2 = null;
                }
                textView2.setText("");
                TextView textView3 = this.sleepEndTime;
                if (textView3 == null) {
                    Intrinsics.XXO("sleepEndTime");
                } else {
                    textView = textView3;
                }
                textView.setText("");
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.sleepBarChartRl;
        if (relativeLayout2 == null) {
            Intrinsics.XXO("sleepBarChartRl");
            relativeLayout2 = null;
        }
        relativeLayout2.setVisibility(0);
        DINCondBold dINCondBold2 = this.noData;
        if (dINCondBold2 == null) {
            Intrinsics.XXO("noData");
            dINCondBold2 = null;
        }
        dINCondBold2.setVisibility(8);
        this.values.clear();
        SleepAllDayData sleepAllDayDataFilterData2 = SleepAllDayDataParse.INSTANCE.filterData(sleeps, 300.0f, this.values, jArrIOOX010X[0]);
        if (sleepAllDayDataFilterData2.getTotal() == 0 && this.values.isEmpty()) {
            noData();
            return;
        }
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        ArrayList arrayList = new ArrayList();
        int total = sleepAllDayDataFilterData2.getTotal();
        if (total >= 0) {
            while (true) {
                arrayList.add("");
                if (i == total) {
                    break;
                } else {
                    i++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        updateData(this.values);
        int total2 = sleepAllDayDataFilterData2.getTotal() / 60;
        DINCondBold dINCondBold3 = this.sleepHour;
        if (dINCondBold3 == null) {
            Intrinsics.XXO("sleepHour");
            dINCondBold3 = null;
        }
        dINCondBold3.setText(String.valueOf(total2));
        DINCondBold dINCondBold4 = this.sleepMinute;
        if (dINCondBold4 == null) {
            Intrinsics.XXO("sleepMinute");
            dINCondBold4 = null;
        }
        dINCondBold4.setText(String.valueOf(sleepAllDayDataFilterData2.getTotal() - (total2 * 60)));
        DINCondBold dINCondBold5 = this.sleepTime;
        if (dINCondBold5 == null) {
            Intrinsics.XXO("sleepTime");
            dINCondBold5 = null;
        }
        dINCondBold5.setText(TimeUtils.millis2String(((long) sleepAllDayDataFilterData2.getStartTime()) * 1000, O0X11OiO.X0i1O(null, 1, null)));
        TextView textView4 = this.sleepStartTime;
        if (textView4 == null) {
            Intrinsics.XXO("sleepStartTime");
            textView4 = null;
        }
        long startTime = ((long) sleepAllDayDataFilterData2.getStartTime()) * 1000;
        SimpleDateFormat simpleDateFormat2 = this.format;
        if (simpleDateFormat2 == null) {
            Intrinsics.XXO("format");
            simpleDateFormat2 = null;
        }
        textView4.setText(TimeUtils.millis2String(startTime, simpleDateFormat2));
        TextView textView5 = this.sleepEndTime;
        if (textView5 == null) {
            Intrinsics.XXO("sleepEndTime");
            textView5 = null;
        }
        long endTime = ((long) sleepAllDayDataFilterData2.getEndTime()) * 1000;
        SimpleDateFormat simpleDateFormat3 = this.format;
        if (simpleDateFormat3 == null) {
            Intrinsics.XXO("format");
        } else {
            simpleDateFormat = simpleDateFormat3;
        }
        textView5.setText(TimeUtils.millis2String(endTime, simpleDateFormat));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> list) {
        if (getBarChart().getData() != 0 && ((IXIX1X1) getBarChart().getData()).XXI() > 0) {
            ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        }
        XXX1X11 xxx1x11 = new XXX1X11(list, "SleepData");
        xxx1x11.iIXX0i(0.0f);
        xxx1x11.iO11i(0.0f);
        IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
        ixix1x1.m1316iI(false);
        xxx1x11.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(Utils.getApp(), R.color.colorAccent))));
        getBarChart().setData(ixix1x1);
        getBarChart().invalidate();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.sleepBarChart);
        Intrinsics.XXI(viewM3483v);
        setBarChart((BarChart) viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.sleepTime);
        Intrinsics.XXI(viewM3483v2);
        this.sleepTime = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.sleepHour);
        Intrinsics.XXI(viewM3483v3);
        this.sleepHour = (DINCondBold) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.sleepMinute);
        Intrinsics.XXI(viewM3483v4);
        this.sleepMinute = (DINCondBold) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.noData);
        Intrinsics.XXI(viewM3483v5);
        this.noData = (DINCondBold) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.sleepBarChartRl);
        Intrinsics.XXI(viewM3483v6);
        this.sleepBarChartRl = (RelativeLayout) viewM3483v6;
        View viewM3483v7 = itemHolder.m3483v(R.id.sleepStartTime);
        Intrinsics.XXI(viewM3483v7);
        this.sleepStartTime = (TextView) viewM3483v7;
        View viewM3483v8 = itemHolder.m3483v(R.id.sleepEndTime);
        Intrinsics.XXI(viewM3483v8);
        this.sleepEndTime = (TextView) viewM3483v8;
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        this.format = O0X11OiO.IXI(false, 1, null);
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        io1xi1x1i.OXO1(getBarChart());
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, 300.0f, 0.0f);
        BarChart barChart = getBarChart();
        barChart.getDescription().XOO0ii0(false);
        barChart.getLegend().XOO0ii0(false);
        barChart.setTouchEnabled(false);
        barChart.setDrawValueAboveBar(false);
        barChart.getAxisLeft().XXI(io1xi1x1i.m2103iO(getMContext()));
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        io1xi1x1i.OIi0(xAxis, true, getMContext());
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMContext(), R.color.line_color));
        oi01X10i.X01IiOiIi(this.blockHeight);
        oi01X10i.m1017OX(this.block);
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMContext(), R.color.sleep_show_5), ContextCompat.getColor(getMContext(), R.color.sleep_show_6), ContextCompat.getColor(getMContext(), R.color.sleep_show_3), ContextCompat.getColor(getMContext(), R.color.sleep_show_4), ContextCompat.getColor(getMContext(), R.color.sleep_show_1), ContextCompat.getColor(getMContext(), R.color.sleep_show_2)});
        oi01X10i.iIiiO(4);
        getBarChart().setRenderer(oi01X10i);
    }

    @aa1
    public final BarChart getBarChart() {
        BarChart barChart = this.barChart;
        if (barChart != null) {
            return barChart;
        }
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
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (q62.OXO1.IXi01O()) {
            i0OX00 renderer = getBarChart().getRenderer();
            Intrinsics.X1ii(renderer, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
            Oi01X10i oi01X10i = (Oi01X10i) renderer;
            oi01X10i.X01IiOiIi(300.0f);
            oi01X10i.m1017OX(1);
            oi01X10i.iIiiO(6);
            oi01X10i.i010I(2.0f);
            showSleepAllDay();
            return;
        }
        i0OX00 renderer2 = getBarChart().getRenderer();
        Intrinsics.X1ii(renderer2, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
        Oi01X10i oi01X10i2 = (Oi01X10i) renderer2;
        oi01X10i2.X01IiOiIi(this.blockHeight);
        oi01X10i2.m1017OX(this.block);
        oi01X10i2.iIiiO(4);
        oi01X10i2.i010I(1.0f);
        showSleep();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_sleep;
    }

    @sf5(tag = I01XX0.XO0O10)
    public final void onSleepChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onSleepChanged");
        initView();
    }

    public final void setBarChart(@aa1 BarChart barChart) {
        Intrinsics.X0O(barChart, "<set-?>");
        this.barChart = barChart;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}
