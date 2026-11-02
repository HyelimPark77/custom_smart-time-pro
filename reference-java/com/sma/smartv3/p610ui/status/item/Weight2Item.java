package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeight2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weight2Item.kt\ncom/sma/smartv3/ui/status/item/Weight2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,172:1\n19#2:173\n15#2:174\n1491#3:175\n1516#3,3:176\n1519#3,3:186\n382#4,7:179\n216#5,2:189\n*S KotlinDebug\n*F\n+ 1 Weight2Item.kt\ncom/sma/smartv3/ui/status/item/Weight2Item\n*L\n109#1:173\n109#1:174\n123#1:175\n123#1:176,3\n123#1:186,3\n123#1:179,7\n123#1:189,2\n*E\n"})
public final class Weight2Item extends BaseDslItem {
    private TextView bmiValue;
    private View dataPanel;
    private View emptyPanel;
    private boolean isImperial;
    private LineChart lineChart;
    private Context mContext;
    private TextView weightLastTime;
    private TextView weightLastValue;
    private TextView weightUnit;

    @aa1
    private final List<Entry> entries = new ArrayList();

    @aa1
    private final WeightDao mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
    private final boolean initEvent = true;

    /* JADX WARN: Multi-variable type inference failed */
    private final void showChartData(List<Weight> list) {
        this.entries.clear();
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.entries.add(new Entry(i, ((Weight) it.next()).getMWeight()));
            i++;
        }
        LineChart lineChart = this.lineChart;
        LineChart lineChart2 = null;
        if (lineChart == null) {
            Intrinsics.XXO("lineChart");
            lineChart = null;
        }
        T tOIX0iXi = ((C2305co) lineChart.getData()).OIX0iXi(0);
        Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        ((LineDataSet) tOIX0iXi).IOX1(this.entries);
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
            lineChart3 = null;
        }
        ((C2305co) lineChart3.getData()).mo1167iX();
        LineChart lineChart4 = this.lineChart;
        if (lineChart4 == null) {
            Intrinsics.XXO("lineChart");
        } else {
            lineChart2 = lineChart4;
        }
        lineChart2.invalidate();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.weightChart);
        Intrinsics.XXI(viewM3483v);
        this.lineChart = (LineChart) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.weightLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.weightLastTime = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.weightLastValue);
        Intrinsics.XXI(viewM3483v3);
        this.weightLastValue = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.weightUnit);
        Intrinsics.XXI(viewM3483v4);
        this.weightUnit = (TextView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.bmi);
        Intrinsics.XXI(viewM3483v5);
        this.bmiValue = (TextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.empty_panel);
        Intrinsics.XXI(viewM3483v6);
        this.emptyPanel = viewM3483v6;
        LineChart lineChart = null;
        if (viewM3483v6 == null) {
            Intrinsics.XXO("emptyPanel");
            viewM3483v6 = null;
        }
        UtilsKt.IX1XiI(viewM3483v6, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View viewM3483v7 = itemHolder.m3483v(R.id.data_panel);
        Intrinsics.XXI(viewM3483v7);
        this.dataPanel = viewM3483v7;
        LineChart lineChart2 = this.lineChart;
        if (lineChart2 == null) {
            Intrinsics.XXO("lineChart");
            lineChart2 = null;
        }
        Context context = lineChart2.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.mContext = context;
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
        Context context2 = lineChart5.getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context2);
        xAxis.i0X000X0O(-0.5f);
        xAxis.IXOIIIO(1.0f);
        xAxis.iOiXi11II(7.5f);
        xAxis.X00Xi1X(false);
        xAxis.Ii0X0X(false);
        LineDataSet lineDataSet = new LineDataSet(this.entries, "Weight item Data");
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        lineDataSet.II1(ContextCompat.getColor(context3, R.color.weight_show_1));
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        lineDataSet.I00(ContextCompat.getColor(context4, R.color.weight_show_1));
        lineDataSet.I1XII0X(1.5f);
        lineDataSet.iXOII(3.5f);
        lineDataSet.XX00XX(2.0f);
        lineDataSet.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
            context5 = null;
        }
        lineDataSet.IIX(ContextCompat.getColor(context5, R.color.weight_show_0));
        lineDataSet.IOI0i0I(true);
        lineDataSet.XXI(false);
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
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        this.isImperial = appUser2.getUnit() == 1;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.XX0(calendar, 0);
        OIi1iX.m890I1(calendar, 0);
        OIi1iX.OiIIX101O(calendar, 0);
        OIi1iX.iIiiO(calendar, 0);
        calendar.setMinimalDaysInFirstWeek(7);
        OIi1iX.XiOIO(calendar, calendar.getFirstDayOfWeek());
        Intrinsics.O10IXXX0X(calendar, "apply(...)");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, TimePeriod.WEEK, 0);
        List<Weight> weightsASC = this.mWeightDao.getWeightsASC(jArrM787I1[0], jArrM787I1[1]);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : weightsASC) {
            String str = O0X11OiO.iiIOiX().format(Long.valueOf(((Weight) obj).getMTime()));
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(CollectionsKt___CollectionsKt.IiII0((List) ((Map.Entry) it.next()).getValue(), 1));
        }
        TextView textView = null;
        if (arrayList.isEmpty()) {
            TextView textView2 = this.weightLastTime;
            if (textView2 == null) {
                Intrinsics.XXO("weightLastTime");
                textView2 = null;
            }
            textView2.setText("");
            View view = this.emptyPanel;
            if (view == null) {
                Intrinsics.XXO("emptyPanel");
                view = null;
            }
            view.setVisibility(0);
            View view2 = this.dataPanel;
            if (view2 == null) {
                Intrinsics.XXO("dataPanel");
                view2 = null;
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.emptyPanel;
            if (view3 == null) {
                Intrinsics.XXO("emptyPanel");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = this.dataPanel;
            if (view4 == null) {
                Intrinsics.XXO("dataPanel");
                view4 = null;
            }
            view4.setVisibility(0);
            LineChart lineChart = this.lineChart;
            if (lineChart == null) {
                Intrinsics.XXO("lineChart");
                lineChart = null;
            }
            lineChart.getXAxis().X00Xi1X(true);
            LineChart lineChart2 = this.lineChart;
            if (lineChart2 == null) {
                Intrinsics.XXO("lineChart");
                lineChart2 = null;
            }
            lineChart2.setVisibility(0);
            Weight weight = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(arrayList);
            TextView textView3 = this.weightLastTime;
            if (textView3 == null) {
                Intrinsics.XXO("weightLastTime");
                textView3 = null;
            }
            textView3.setText(O0X11OiO.XXX11i().format(new Date(weight.getMTime())));
            TextView textView4 = this.weightLastValue;
            if (textView4 == null) {
                Intrinsics.XXO("weightLastValue");
                textView4 = null;
            }
            textView4.setText(String.valueOf(cp5.OIX0iXi(this.isImperial ? l76.m2527iO(weight.getMWeight()) : weight.getMWeight())));
            TextView textView5 = this.bmiValue;
            if (textView5 == null) {
                Intrinsics.XXO("bmiValue");
                textView5 = null;
            }
            textView5.setText(cp5.I0IIOi(weight.getMWeight(), appUser2.getHeight()));
        }
        TextView textView6 = this.weightUnit;
        if (textView6 == null) {
            Intrinsics.XXO("weightUnit");
        } else {
            textView = textView6;
        }
        textView.setText(cp5.m1626iX(appUser2.getUnit()));
        showChartData(arrayList);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_weight;
    }

    @sf5(tag = I01XX0.IiI10X)
    public final void onWeightChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onWeightChanged");
        initView();
    }
}
