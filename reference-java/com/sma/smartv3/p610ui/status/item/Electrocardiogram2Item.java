package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.HRMinuteData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ElectrocardiogramDao;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Electrocardiogram2Item extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private LineChart lineChart;
    private Context mContext;
    private final int maxNum;
    private final int totalTime;
    private TextView tvChartBottomText;
    private TextView tvTime;
    private TextView tvValue;

    @aa1
    private long[] range = {0, 0};

    @aa1
    private final ElectrocardiogramDao mElectrocardiogramDao = MyDb.INSTANCE.getMDatabase().electrocardiogramDao();

    @aa1
    private final LinkedHashMap<Long, HRMinuteData> filterData = new LinkedHashMap<>();
    private final int maxHour = 4;
    private final int intervalTime = 300000;
    private final boolean initEvent = true;

    public Electrocardiogram2Item() {
        int i = 4 * 60 * 60000;
        this.totalTime = i;
        this.maxNum = i / 300000;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        this.range = O0X11OiO.OiIIX101O(this.maxHour);
        View viewM3483v = itemHolder.m3483v(R.id.hrLineChart);
        Intrinsics.XXI(viewM3483v);
        this.lineChart = (LineChart) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.hrLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.tvTime = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.hrLastValue);
        Intrinsics.XXI(viewM3483v3);
        this.tvValue = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.tv_chart_bottom_text);
        Intrinsics.XXI(viewM3483v4);
        this.tvChartBottomText = (TextView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.empty_panel);
        Intrinsics.XXI(viewM3483v5);
        this.emptyPanel = viewM3483v5;
        LineChart lineChart = null;
        if (viewM3483v5 == null) {
            Intrinsics.XXO("emptyPanel");
            viewM3483v5 = null;
        }
        UtilsKt.IX1XiI(viewM3483v5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View viewM3483v6 = itemHolder.m3483v(R.id.data_panel);
        Intrinsics.XXI(viewM3483v6);
        this.dataPanel = viewM3483v6;
        LineChart lineChart2 = this.lineChart;
        if (lineChart2 == null) {
            Intrinsics.XXO("lineChart");
            lineChart2 = null;
        }
        Context context = lineChart2.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.mContext = context;
        TextView textView = this.tvChartBottomText;
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
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
            lineChart3 = null;
        }
        lineChart3.i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        LineChart lineChart4 = this.lineChart;
        if (lineChart4 == null) {
            Intrinsics.XXO("lineChart");
            lineChart4 = null;
        }
        lineChart4.setTouchEnabled(false);
        lineChart4.getDescription().XOO0ii0(false);
        lineChart4.getLegend().XOO0ii0(false);
        YAxis axisLeft = lineChart4.getAxisLeft();
        axisLeft.Ii0X0X(false);
        axisLeft.iOiXi11II(200.0f);
        axisLeft.X00Xi1X(false);
        axisLeft.XO0X10iO(false);
        axisLeft.Ii0X0X(false);
        axisLeft.i0X000X0O(30.0f);
        axisLeft.iIi0(0.0f);
        YAxis axisRight = lineChart4.getAxisRight();
        axisRight.XOO0ii0(false);
        axisRight.i0X000X0O(30.0f);
        axisRight.iIi0(0.0f);
        axisRight.X00Xi1X(false);
        axisRight.Ii0X0X(false);
        XAxis xAxis = lineChart4.getXAxis();
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(xAxis);
        LineChart lineChart5 = this.lineChart;
        if (lineChart5 == null) {
            Intrinsics.XXO("lineChart");
            lineChart5 = null;
        }
        Context context3 = lineChart5.getContext();
        Intrinsics.O10IXXX0X(context3, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context3);
        xAxis.i0X000X0O(0.0f);
        xAxis.IXOIIIO(1.0f);
        xAxis.iOiXi11II(this.maxNum);
        xAxis.X00Xi1X(false);
        xAxis.Ii0X0X(false);
        LineDataSet lineDataSet = new LineDataSet(null, "");
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        lineDataSet.II1(ContextCompat.getColor(context4, R.color.hr_color));
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
            context5 = null;
        }
        lineDataSet.I00(ContextCompat.getColor(context5, R.color.hr_color));
        lineDataSet.I1XII0X(2.0f);
        lineDataSet.iXOII(1.0f);
        Context context6 = this.mContext;
        if (context6 == null) {
            Intrinsics.XXO("mContext");
            context6 = null;
        }
        lineDataSet.I0i1OXiI(ContextCompat.getDrawable(context6, R.drawable.shape_hr));
        lineDataSet.IOI0i0I(false);
        lineDataSet.XXI(false);
        lineDataSet.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.O1iXiI(true);
        C2305co c2305co = new C2305co(lineDataSet);
        c2305co.m1316iI(false);
        LineChart lineChart6 = this.lineChart;
        if (lineChart6 == null) {
            Intrinsics.XXO("lineChart");
        } else {
            lineChart = lineChart6;
        }
        lineChart.setData(c2305co);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        long[] jArrOiIIX101O = O0X11OiO.OiIIX101O(this.maxHour);
        this.range = jArrOiIIX101O;
        List<Electrocardiogram> electrocardiograms = this.mElectrocardiogramDao.getElectrocardiograms(jArrOiIIX101O[0], jArrOiIIX101O[1]);
        TextView textView = null;
        View view = null;
        if (electrocardiograms.isEmpty()) {
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
            TextView textView2 = this.tvTime;
            if (textView2 == null) {
                Intrinsics.XXO("tvTime");
                textView2 = null;
            }
            textView2.setText(O0X11OiO.XXX11i().format(new Date(((Electrocardiogram) CollectionsKt___CollectionsKt.Xi1XO00(electrocardiograms)).getMTime())));
            TextView textView3 = this.tvValue;
            if (textView3 == null) {
                Intrinsics.XXO("tvValue");
            } else {
                textView = textView3;
            }
            textView.setText(String.valueOf(((Electrocardiogram) CollectionsKt___CollectionsKt.Xi1XO00(electrocardiograms)).getMValue()));
        }
        showChartData(electrocardiograms);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_electrocardiogram;
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onHeartRateChanged");
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showChartData(@aa1 List<Electrocardiogram> list) {
        Intrinsics.X0O(list, "list");
        this.filterData.clear();
        long[] jArr = this.range;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = this.intervalTime;
        if (j3 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + j3 + FileUtils.FILE_EXTENSION_SEPARATOR);
        }
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, j2, j3);
        if (j <= jXO0O10) {
            while (true) {
                this.filterData.put(Long.valueOf(j), new HRMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += j3;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Electrocardiogram electrocardiogram : list) {
            for (Map.Entry<Long, HRMinuteData> entry : this.filterData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                HRMinuteData value = entry.getValue();
                if (electrocardiogram.getMTime() < jLongValue) {
                    value.setTotal(value.getTotal() + electrocardiogram.getMValue());
                    value.setNum(value.getNum() + 1);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, HRMinuteData>> it = this.filterData.entrySet().iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            HRMinuteData value2 = it.next().getValue();
            if (value2.getNum() != 0 && value2.getTotal() != 0) {
                arrayList.add(new Entry(f, value2.getTotal() / value2.getNum()));
            }
            f += 1.0f;
        }
        LineChart lineChart = this.lineChart;
        LineChart lineChart2 = null;
        if (lineChart == null) {
            Intrinsics.XXO("lineChart");
            lineChart = null;
        }
        Object obj = ((C2305co) lineChart.getData()).I1XOi1().get(0);
        Intrinsics.X1ii(obj, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List<T> listI0O = ((LineDataSet) obj).i0O();
        listI0O.clear();
        listI0O.addAll(arrayList);
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
        } else {
            lineChart2 = lineChart3;
        }
        lineChart2.invalidate();
    }
}
