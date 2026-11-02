package com.sma.smartv3.p610ui.status.item;

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
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.entity.Sleep;
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
    private View dataPanel;
    private View emptyPanel;
    private SimpleDateFormat format;
    private Context mContext;
    private TextView sleepEndTime;
    private TextView sleepHour;
    private TextView sleepMinute;
    private TextView sleepStartTime;
    private TextView sleepTime;

    @aa1
    private List<BarEntry> values = new ArrayList();
    private final int block = 3;
    private final float blockHeight = 300.0f / 3;

    @aa1
    private final SleepDao mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
    private final boolean initEvent = true;

    private final void noData() {
        TextView textView = this.sleepTime;
        View view = null;
        if (textView == null) {
            Intrinsics.XXO("sleepTime");
            textView = null;
        }
        textView.setText("");
        TextView textView2 = this.sleepHour;
        if (textView2 == null) {
            Intrinsics.XXO("sleepHour");
            textView2 = null;
        }
        textView2.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        TextView textView3 = this.sleepMinute;
        if (textView3 == null) {
            Intrinsics.XXO("sleepMinute");
            textView3 = null;
        }
        textView3.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        View view2 = this.emptyPanel;
        if (view2 == null) {
            Intrinsics.XXO("emptyPanel");
            view2 = null;
        }
        view2.setVisibility(0);
        View view3 = this.dataPanel;
        if (view3 == null) {
            Intrinsics.XXO("dataPanel");
        } else {
            view = view3;
        }
        view.setVisibility(8);
    }

    private final void setXAxis(int i, int i2) {
        SimpleDateFormat simpleDateFormat = null;
        TextView textView = null;
        if (i2 == 0) {
            TextView textView2 = this.sleepStartTime;
            if (textView2 == null) {
                Intrinsics.XXO("sleepStartTime");
                textView2 = null;
            }
            textView2.setText("00:00");
            TextView textView3 = this.sleepEndTime;
            if (textView3 == null) {
                Intrinsics.XXO("sleepEndTime");
            } else {
                textView = textView3;
            }
            textView.setText("24:00");
            return;
        }
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
            setXAxis(0, 0);
        } else {
            this.values.clear();
            SleepDayData sleepDayDataFilterData = SleepDataParse.INSTANCE.filterData(sleeps, this.blockHeight, this.values);
            if ((sleepDayDataFilterData.getTotal() == 0 || sleepDayDataFilterData.getTotal() >= 60) && !this.values.isEmpty()) {
                View view = this.emptyPanel;
                if (view == null) {
                    Intrinsics.XXO("emptyPanel");
                    view = null;
                }
                view.setVisibility(8);
                View view2 = this.dataPanel;
                if (view2 == null) {
                    Intrinsics.XXO("dataPanel");
                    view2 = null;
                }
                view2.setVisibility(0);
                int total = sleepDayDataFilterData.getTotal() / 60;
                TextView textView2 = this.sleepHour;
                if (textView2 == null) {
                    Intrinsics.XXO("sleepHour");
                    textView2 = null;
                }
                textView2.setText(String.valueOf(total));
                TextView textView3 = this.sleepMinute;
                if (textView3 == null) {
                    Intrinsics.XXO("sleepMinute");
                    textView3 = null;
                }
                textView3.setText(String.valueOf(sleepDayDataFilterData.getTotal() - (total * 60)));
                TextView textView4 = this.sleepTime;
                if (textView4 == null) {
                    Intrinsics.XXO("sleepTime");
                } else {
                    textView = textView4;
                }
                textView.setText(O0X11OiO.XXX11i().format(new Date(((long) sleepDayDataFilterData.getStartTime()) * 1000)));
                if (q62.OXO1.IiXIIX1O1()) {
                    SparseIntArray status = sleepDayDataFilterData.getStatus();
                    bleSleepQuality.setMLight(status.get(2));
                    bleSleepQuality.setMDeep(status.get(1));
                    bleSleepQuality.setMTotal(sleepDayDataFilterData.getTotal());
                }
            } else {
                noData();
            }
            setXAxis(sleepDayDataFilterData.getStartTime(), sleepDayDataFilterData.getTotal());
        }
        updateData(this.values);
        if (q62.OXO1.IiXIIX1O1()) {
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.SLEEP_QUALITY, BleKeyFlag.UPDATE, bleSleepQuality, false, false, 24, null);
        }
    }

    private final void showSleepAllDay() {
        SimpleDateFormat simpleDateFormat = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        List<Sleep> sleeps = this.mSleepDao.getSleeps(jArrIOOX010X[0] - ((long) O0X11OiO.iXiX011), jArrIOOX010X[1]);
        if (sleeps.isEmpty()) {
            noData();
            setXAxis(0, 0);
        } else {
            this.values.clear();
            SleepAllDayData sleepAllDayDataFilterData = SleepAllDayDataParse.INSTANCE.filterData(sleeps, 300.0f, this.values, jArrIOOX010X[0]);
            if (sleepAllDayDataFilterData.getTotal() > 0) {
                View view = this.emptyPanel;
                if (view == null) {
                    Intrinsics.XXO("emptyPanel");
                    view = null;
                }
                view.setVisibility(8);
                View view2 = this.dataPanel;
                if (view2 == null) {
                    Intrinsics.XXO("dataPanel");
                    view2 = null;
                }
                view2.setVisibility(0);
                int total = sleepAllDayDataFilterData.getTotal() / 60;
                TextView textView = this.sleepHour;
                if (textView == null) {
                    Intrinsics.XXO("sleepHour");
                    textView = null;
                }
                textView.setText(String.valueOf(total));
                TextView textView2 = this.sleepMinute;
                if (textView2 == null) {
                    Intrinsics.XXO("sleepMinute");
                    textView2 = null;
                }
                textView2.setText(String.valueOf(sleepAllDayDataFilterData.getTotal() - (total * 60)));
                TextView textView3 = this.sleepTime;
                if (textView3 == null) {
                    Intrinsics.XXO("sleepTime");
                    textView3 = null;
                }
                textView3.setText(O0X11OiO.XXX11i().format(new Date(((long) sleepAllDayDataFilterData.getStartTime()) * 1000)));
            } else {
                noData();
            }
            TextView textView4 = this.sleepStartTime;
            if (textView4 == null) {
                Intrinsics.XXO("sleepStartTime");
                textView4 = null;
            }
            long startTime = ((long) sleepAllDayDataFilterData.getStartTime()) * 1000;
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
            long endTime = ((long) sleepAllDayDataFilterData.getEndTime()) * 1000;
            SimpleDateFormat simpleDateFormat3 = this.format;
            if (simpleDateFormat3 == null) {
                Intrinsics.XXO("format");
            } else {
                simpleDateFormat = simpleDateFormat3;
            }
            textView5.setText(TimeUtils.millis2String(endTime, simpleDateFormat));
        }
        updateData(this.values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> list) {
        BarChart barChart = this.barChart;
        BarChart barChart2 = null;
        if (barChart == null) {
            Intrinsics.XXO("barChart");
            barChart = null;
        }
        if (barChart.getData() != 0) {
            BarChart barChart3 = this.barChart;
            if (barChart3 == null) {
                Intrinsics.XXO("barChart");
                barChart3 = null;
            }
            if (((IXIX1X1) barChart3.getData()).XXI() > 0) {
                BarChart barChart4 = this.barChart;
                if (barChart4 == null) {
                    Intrinsics.XXO("barChart");
                    barChart4 = null;
                }
                ((IXIX1X1) barChart4.getData()).IXXOO(0);
            }
        }
        XXX1X11 xxx1x11 = new XXX1X11(list, "SleepData");
        xxx1x11.iIXX0i(0.0f);
        xxx1x11.iO11i(0.0f);
        IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
        ixix1x1.m1316iI(false);
        xxx1x11.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(Utils.getApp(), R.color.colorAccent))));
        BarChart barChart5 = this.barChart;
        if (barChart5 == null) {
            Intrinsics.XXO("barChart");
            barChart5 = null;
        }
        barChart5.setData(ixix1x1);
        BarChart barChart6 = this.barChart;
        if (barChart6 == null) {
            Intrinsics.XXO("barChart");
        } else {
            barChart2 = barChart6;
        }
        barChart2.invalidate();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.sleepBarChart);
        Intrinsics.XXI(viewM3483v);
        this.barChart = (BarChart) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.sleepTime);
        Intrinsics.XXI(viewM3483v2);
        this.sleepTime = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.sleepHour);
        Intrinsics.XXI(viewM3483v3);
        this.sleepHour = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.sleepMinute);
        Intrinsics.XXI(viewM3483v4);
        this.sleepMinute = (TextView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.sleepStartTime);
        Intrinsics.XXI(viewM3483v5);
        this.sleepStartTime = (TextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.sleepEndTime);
        Intrinsics.XXI(viewM3483v6);
        this.sleepEndTime = (TextView) viewM3483v6;
        View viewM3483v7 = itemHolder.m3483v(R.id.empty_panel);
        Intrinsics.XXI(viewM3483v7);
        this.emptyPanel = viewM3483v7;
        BarChart barChart = null;
        if (viewM3483v7 == null) {
            Intrinsics.XXO("emptyPanel");
            viewM3483v7 = null;
        }
        UtilsKt.IX1XiI(viewM3483v7, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View viewM3483v8 = itemHolder.m3483v(R.id.data_panel);
        Intrinsics.XXI(viewM3483v8);
        this.dataPanel = viewM3483v8;
        BarChart barChart2 = this.barChart;
        if (barChart2 == null) {
            Intrinsics.XXO("barChart");
            barChart2 = null;
        }
        Context context = barChart2.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.mContext = context;
        this.format = O0X11OiO.IXI(false, 1, null);
        BarChart barChart3 = this.barChart;
        if (barChart3 == null) {
            Intrinsics.XXO("barChart");
            barChart3 = null;
        }
        barChart3.i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        BarChart barChart4 = this.barChart;
        if (barChart4 == null) {
            Intrinsics.XXO("barChart");
            barChart4 = null;
        }
        barChart4.setTouchEnabled(false);
        barChart4.getDescription().XOO0ii0(false);
        barChart4.getLegend().XOO0ii0(false);
        YAxis axisLeft = barChart4.getAxisLeft();
        axisLeft.Ii0X0X(false);
        axisLeft.iOiXi11II(300.0f);
        axisLeft.X00Xi1X(false);
        axisLeft.XO0X10iO(false);
        axisLeft.Ii0X0X(false);
        axisLeft.i0X000X0O(0.0f);
        axisLeft.iIi0(0.0f);
        YAxis axisRight = barChart4.getAxisRight();
        axisRight.XOO0ii0(false);
        axisRight.i0X000X0O(0.0f);
        axisRight.iIi0(0.0f);
        axisRight.X00Xi1X(false);
        axisRight.Ii0X0X(false);
        XAxis xAxis = barChart4.getXAxis();
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(xAxis);
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        io1xi1x1i.OIi0(xAxis, true, context2);
        xAxis.X00Xi1X(false);
        xAxis.Ii0X0X(false);
        BarChart barChart5 = this.barChart;
        if (barChart5 == null) {
            Intrinsics.XXO("barChart");
            barChart5 = null;
        }
        BarChart barChart6 = this.barChart;
        if (barChart6 == null) {
            Intrinsics.XXO("barChart");
            barChart6 = null;
        }
        X1i1iOX animator = barChart6.getAnimator();
        BarChart barChart7 = this.barChart;
        if (barChart7 == null) {
            Intrinsics.XXO("barChart");
            barChart7 = null;
        }
        Oi01X10i oi01X10i = new Oi01X10i(barChart5, animator, barChart7.getViewPortHandler());
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        oi01X10i.iOOX010X(gk4.m1859iO(context3, R.color.line_color));
        oi01X10i.X01IiOiIi(this.blockHeight);
        oi01X10i.m1017OX(this.block);
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        int color = ContextCompat.getColor(context4, R.color.sleep_show_5);
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
            context5 = null;
        }
        int color2 = ContextCompat.getColor(context5, R.color.sleep_show_6);
        Context context6 = this.mContext;
        if (context6 == null) {
            Intrinsics.XXO("mContext");
            context6 = null;
        }
        int color3 = ContextCompat.getColor(context6, R.color.sleep_show_3);
        Context context7 = this.mContext;
        if (context7 == null) {
            Intrinsics.XXO("mContext");
            context7 = null;
        }
        int color4 = ContextCompat.getColor(context7, R.color.sleep_show_4);
        Context context8 = this.mContext;
        if (context8 == null) {
            Intrinsics.XXO("mContext");
            context8 = null;
        }
        int color5 = ContextCompat.getColor(context8, R.color.sleep_show_1);
        Context context9 = this.mContext;
        if (context9 == null) {
            Intrinsics.XXO("mContext");
            context9 = null;
        }
        oi01X10i.m1016I1(new int[]{color, color2, color3, color4, color5, ContextCompat.getColor(context9, R.color.sleep_show_2)});
        oi01X10i.iIiiO(4);
        BarChart barChart8 = this.barChart;
        if (barChart8 == null) {
            Intrinsics.XXO("barChart");
        } else {
            barChart = barChart8;
        }
        barChart.setRenderer(oi01X10i);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        BarChart barChart = null;
        if (q62.OXO1.IXi01O()) {
            BarChart barChart2 = this.barChart;
            if (barChart2 == null) {
                Intrinsics.XXO("barChart");
            } else {
                barChart = barChart2;
            }
            i0OX00 renderer = barChart.getRenderer();
            Intrinsics.X1ii(renderer, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender");
            Oi01X10i oi01X10i = (Oi01X10i) renderer;
            oi01X10i.X01IiOiIi(300.0f);
            oi01X10i.m1017OX(1);
            oi01X10i.iIiiO(6);
            oi01X10i.i010I(2.0f);
            showSleepAllDay();
            return;
        }
        BarChart barChart3 = this.barChart;
        if (barChart3 == null) {
            Intrinsics.XXO("barChart");
        } else {
            barChart = barChart3;
        }
        i0OX00 renderer2 = barChart.getRenderer();
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
        return R.layout.v2_status_item_sleep;
    }

    @sf5(tag = I01XX0.XO0O10)
    public final void onSleepChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onSleepChanged");
        initView();
    }
}
