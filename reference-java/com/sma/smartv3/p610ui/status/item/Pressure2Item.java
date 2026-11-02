package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
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
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.model.PressureDataKt;
import com.sma.smartv3.model.PressureDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Pressure2Item extends BaseDslItem {
    private BarChart barChart;
    private View dataPanel;
    private View emptyPanel;
    private Context mContext;
    private long[] range;
    private TextView tvChartBottomText;
    private TextView tvTime;
    private TextView tvValue;

    @aa1
    private final PressureDao mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();

    @aa1
    private final LinkedHashMap<Long, ArrayList<Pressure>> filterData = new LinkedHashMap<>();

    @aa1
    private final List<BarEntry> values = new ArrayList();
    private final int maxHour = 8;
    private final int intervalTime = TimeConstants.HOUR;
    private final boolean initEvent = true;

    private final void showChartData(List<Pressure> list) {
        this.filterData.clear();
        int i = this.maxHour;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                LinkedHashMap<Long, ArrayList<Pressure>> linkedHashMap = this.filterData;
                long[] jArr = this.range;
                if (jArr == null) {
                    Intrinsics.XXO("range");
                    jArr = null;
                }
                linkedHashMap.put(Long.valueOf(jArr[0] + ((long) (this.intervalTime * i2))), new ArrayList<>());
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        for (Pressure pressure : list) {
            for (Map.Entry<Long, ArrayList<Pressure>> entry : this.filterData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Pressure> value = entry.getValue();
                if (pressure.getMTime() <= jLongValue) {
                    value.add(pressure);
                    break;
                }
            }
        }
        ArrayList<PressureDayData> arrayList = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> it = this.filterData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Pressure> value2 = it.next().getValue();
            PressureDayData pressureDayData = new PressureDayData(0, 0, 0, null, 15, null);
            if (value2.size() != 0) {
                Iterator<Pressure> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int mValue = 0;
                while (it2.hasNext()) {
                    Pressure next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    Pressure pressure2 = next;
                    if (pressureDayData.getMin() == 0 || pressureDayData.getMin() > pressure2.getMValue()) {
                        pressureDayData.setMin(pressure2.getMValue());
                    }
                    if (pressureDayData.getMax() < pressure2.getMValue()) {
                        pressureDayData.setMax(pressure2.getMValue());
                    }
                    mValue += pressure2.getMValue();
                }
                pressureDayData.setAvg(mValue / value2.size());
            }
            arrayList.add(pressureDayData);
        }
        int i3 = 0;
        int avg = 0;
        float f = 0.0f;
        for (PressureDayData pressureDayData2 : arrayList) {
            float min = pressureDayData2.getMin();
            float max = pressureDayData2.getMax();
            float avg2 = pressureDayData2.getAvg();
            List<BarEntry> list2 = this.values;
            float[] fArr = {0.0f, avg2};
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.XXO("mContext");
                context = null;
            }
            list2.add(new BarEntry(f, fArr, PressureDataKt.getBarColors(context, pressureDayData2.getAvg())));
            if (i3 < max) {
                i3 = (int) max;
            }
            if (avg == 0) {
                avg = pressureDayData2.getAvg();
            }
            if (min != 0.0f && avg > min) {
                avg = (int) min;
            }
            pressureDayData2.getAvg();
            f += 1.0f;
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
        XXX1X11 xxx1x11 = new XXX1X11(list, "");
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.XXO("mContext");
            context = null;
        }
        xxx1x11.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(context, R.color.colorAccent))));
        IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
        ixix1x1.m1316iI(false);
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
        this.range = O0X11OiO.OiIIX101O(this.maxHour);
        View viewM3483v = itemHolder.m3483v(R.id.pressureBarChart);
        Intrinsics.XXI(viewM3483v);
        this.barChart = (BarChart) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.pressureLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.tvTime = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.pressureLastValue);
        Intrinsics.XXI(viewM3483v3);
        this.tvValue = (TextView) viewM3483v3;
        BarChart barChart = this.barChart;
        BarChart barChart2 = null;
        if (barChart == null) {
            Intrinsics.XXO("barChart");
            barChart = null;
        }
        Context context = barChart.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.mContext = context;
        View viewM3483v4 = itemHolder.m3483v(R.id.tv_chart_bottom_text);
        Intrinsics.XXI(viewM3483v4);
        TextView textView = (TextView) viewM3483v4;
        this.tvChartBottomText = textView;
        if (textView == null) {
            Intrinsics.XXO("tvChartBottomText");
            textView = null;
        }
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        textView.setText(context2.getString(R.string.last_few_hours, Integer.valueOf(this.maxHour)));
        View viewM3483v5 = itemHolder.m3483v(R.id.empty_panel);
        Intrinsics.XXI(viewM3483v5);
        this.emptyPanel = viewM3483v5;
        if (viewM3483v5 == null) {
            Intrinsics.XXO("emptyPanel");
            viewM3483v5 = null;
        }
        UtilsKt.IX1XiI(viewM3483v5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View viewM3483v6 = itemHolder.m3483v(R.id.data_panel);
        Intrinsics.XXI(viewM3483v6);
        this.dataPanel = viewM3483v6;
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
        axisLeft.iOiXi11II(100.0f);
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
        BarChart barChart5 = this.barChart;
        if (barChart5 == null) {
            Intrinsics.XXO("barChart");
            barChart5 = null;
        }
        Context context3 = barChart5.getContext();
        Intrinsics.O10IXXX0X(context3, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context3);
        xAxis.O1O = 0.0f;
        xAxis.iOO1ii1 = this.maxHour;
        xAxis.X00Xi1X(false);
        xAxis.Ii0X0X(false);
        BarChart barChart6 = this.barChart;
        if (barChart6 == null) {
            Intrinsics.XXO("barChart");
            barChart6 = null;
        }
        BarChart barChart7 = this.barChart;
        if (barChart7 == null) {
            Intrinsics.XXO("barChart");
            barChart7 = null;
        }
        X1i1iOX animator = barChart7.getAnimator();
        BarChart barChart8 = this.barChart;
        if (barChart8 == null) {
            Intrinsics.XXO("barChart");
            barChart8 = null;
        }
        Oi01X10i oi01X10i = new Oi01X10i(barChart6, animator, barChart8.getViewPortHandler());
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        oi01X10i.iOOX010X(gk4.m1859iO(context4, R.color.line_color));
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
            context5 = null;
        }
        int color = ContextCompat.getColor(context5, R.color.p_show_1);
        Context context6 = this.mContext;
        if (context6 == null) {
            Intrinsics.XXO("mContext");
            context6 = null;
        }
        oi01X10i.m1016I1(new int[]{color, ContextCompat.getColor(context6, R.color.p_show_2)});
        oi01X10i.iIiiO(5);
        BarChart barChart9 = this.barChart;
        if (barChart9 == null) {
            Intrinsics.XXO("barChart");
        } else {
            barChart2 = barChart9;
        }
        barChart2.setRenderer(oi01X10i);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        this.values.clear();
        long[] jArrOiIIX101O = O0X11OiO.OiIIX101O(this.maxHour);
        this.range = jArrOiIIX101O;
        PressureDao pressureDao = this.mPressureDao;
        TextView textView = null;
        View view = null;
        if (jArrOiIIX101O == null) {
            Intrinsics.XXO("range");
            jArrOiIIX101O = null;
        }
        long j = jArrOiIIX101O[0];
        long[] jArr = this.range;
        if (jArr == null) {
            Intrinsics.XXO("range");
            jArr = null;
        }
        List<Pressure> pressures = pressureDao.getPressures(j, jArr[1]);
        if (pressures.isEmpty()) {
            TextView textView2 = this.tvTime;
            if (textView2 == null) {
                Intrinsics.XXO("tvTime");
                textView2 = null;
            }
            textView2.setText("");
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
        } else {
            View view4 = this.emptyPanel;
            if (view4 == null) {
                Intrinsics.XXO("emptyPanel");
                view4 = null;
            }
            view4.setVisibility(8);
            View view5 = this.dataPanel;
            if (view5 == null) {
                Intrinsics.XXO("dataPanel");
                view5 = null;
            }
            view5.setVisibility(0);
            BarChart barChart = this.barChart;
            if (barChart == null) {
                Intrinsics.XXO("barChart");
                barChart = null;
            }
            barChart.getXAxis().X00Xi1X(true);
            TextView textView3 = this.tvTime;
            if (textView3 == null) {
                Intrinsics.XXO("tvTime");
                textView3 = null;
            }
            textView3.setText(O0X11OiO.XXX11i().format(new Date(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(pressures)).getMTime())));
            TextView textView4 = this.tvValue;
            if (textView4 == null) {
                Intrinsics.XXO("tvValue");
            } else {
                textView = textView4;
            }
            textView.setText(String.valueOf(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(pressures)).getMValue()));
        }
        showChartData(pressures);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_pressure;
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onPressureChanged");
        initView();
    }
}
