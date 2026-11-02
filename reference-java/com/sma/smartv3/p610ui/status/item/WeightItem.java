package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
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
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFRegular;
import java.text.SimpleDateFormat;
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
@SourceDebugExtension({"SMAP\nWeightItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightItem.kt\ncom/sma/smartv3/ui/status/item/WeightItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,193:1\n19#2:194\n15#2:195\n1491#3:196\n1516#3,3:197\n1519#3,3:207\n382#4,7:200\n216#5,2:210\n*S KotlinDebug\n*F\n+ 1 WeightItem.kt\ncom/sma/smartv3/ui/status/item/WeightItem\n*L\n112#1:194\n112#1:195\n126#1:196\n126#1:197,3\n126#1:207,3\n126#1:200,7\n126#1:210,2\n*E\n"})
public class WeightItem extends BaseDslItem {
    private PFRegular bmiValue;
    private boolean isImperial;
    public LineChart lineChart;
    public Context mContext;
    private DINCondBold noData;
    private DINCondBold weightLastTime;
    private DINCondBold weightLastValue;
    private PFRegular weightUnit;

    @aa1
    private final List<Entry> entries = new ArrayList();

    @aa1
    private final WeightDao mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
    private final boolean initEvent = true;

    /* JADX WARN: Multi-variable type inference failed */
    private final void initChart(List<Weight> list) {
        this.entries.clear();
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.entries.add(new Entry(i, ((Weight) it.next()).getMWeight()));
            i++;
        }
        setXAxis(list);
        T tOIX0iXi = ((C2305co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        ((LineDataSet) tOIX0iXi).IOX1(this.entries);
        ((C2305co) getLineChart().getData()).mo1167iX();
        getLineChart().invalidate();
    }

    private final void setXAxis(List<Weight> list) {
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        SimpleDateFormat simpleDateFormatXXX11i = O0X11OiO.XXX11i();
        ArrayList arrayList = new ArrayList();
        Iterator<Weight> it = list.iterator();
        while (it.hasNext()) {
            String strMillis2String = TimeUtils.millis2String(it.next().getMTime(), simpleDateFormatXXX11i);
            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        xAxis.i0X000X0O(0.0f);
        xAxis.IXOIIIO(1.0f);
        xAxis.iOiXi11II(list.size());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.weightChart);
        Intrinsics.XXI(viewM3483v);
        setLineChart((LineChart) viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.weightLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.weightLastTime = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.weightLastValue);
        Intrinsics.XXI(viewM3483v3);
        this.weightLastValue = (DINCondBold) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.weightUnit);
        Intrinsics.XXI(viewM3483v4);
        this.weightUnit = (PFRegular) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.bmi);
        Intrinsics.XXI(viewM3483v5);
        this.bmiValue = (PFRegular) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.noData);
        Intrinsics.XXI(viewM3483v6);
        this.noData = (DINCondBold) viewM3483v6;
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        io1xi1x1i.XIi00iiXO(getLineChart());
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, 200.0f, 30.0f);
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.O10IXXX0X(xAxis, "getXAxis(...)");
        Context context2 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context2);
        LineChart lineChart = getLineChart();
        lineChart.setTouchEnabled(false);
        lineChart.getDescription().XOO0ii0(false);
        lineChart.getLegend().XOO0ii0(false);
        lineChart.getAxisLeft().XXI(io1xi1x1i.m2103iO(getMContext()));
        LineDataSet lineDataSet = new LineDataSet(this.entries, "Weight item Data");
        lineDataSet.II1(ContextCompat.getColor(getMContext(), R.color.weight_show_1));
        lineDataSet.I00(ContextCompat.getColor(getMContext(), R.color.weight_show_1));
        lineDataSet.I1XII0X(1.5f);
        lineDataSet.iXOII(3.5f);
        lineDataSet.XX00XX(2.0f);
        lineDataSet.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.IIX(ContextCompat.getColor(getMContext(), R.color.weight_show_0));
        lineDataSet.IOI0i0I(true);
        lineDataSet.XXI(false);
        C2305co c2305co = new C2305co(lineDataSet);
        c2305co.m1316iI(false);
        getLineChart().setData(c2305co);
    }

    @aa1
    public final List<Entry> getEntries() {
        return this.entries;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final LineChart getLineChart() {
        LineChart lineChart = this.lineChart;
        if (lineChart != null) {
            return lineChart;
        }
        Intrinsics.XXO("lineChart");
        return null;
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
        PFRegular pFRegular = null;
        if (arrayList.isEmpty()) {
            DINCondBold dINCondBold = this.weightLastTime;
            if (dINCondBold == null) {
                Intrinsics.XXO("weightLastTime");
                dINCondBold = null;
            }
            dINCondBold.setText(R.string.data_none);
            DINCondBold dINCondBold2 = this.weightLastValue;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("weightLastValue");
                dINCondBold2 = null;
            }
            dINCondBold2.setText(R.string.data_none);
            PFRegular pFRegular2 = this.bmiValue;
            if (pFRegular2 == null) {
                Intrinsics.XXO("bmiValue");
                pFRegular2 = null;
            }
            pFRegular2.setText(R.string.data_none);
            getLineChart().setVisibility(8);
            DINCondBold dINCondBold3 = this.noData;
            if (dINCondBold3 == null) {
                Intrinsics.XXO("noData");
                dINCondBold3 = null;
            }
            dINCondBold3.setVisibility(0);
            if (i72.OXO1.XIIO11I()) {
                getLineChart().getXAxis().X00Xi1X(false);
                getLineChart().setVisibility(0);
                DINCondBold dINCondBold4 = this.noData;
                if (dINCondBold4 == null) {
                    Intrinsics.XXO("noData");
                    dINCondBold4 = null;
                }
                dINCondBold4.setVisibility(8);
                initChart(this.mWeightDao.getTestWeights(jArrM787I1[0], jArrM787I1[1]));
            }
        } else {
            getLineChart().getXAxis().X00Xi1X(true);
            getLineChart().setVisibility(0);
            DINCondBold dINCondBold5 = this.noData;
            if (dINCondBold5 == null) {
                Intrinsics.XXO("noData");
                dINCondBold5 = null;
            }
            dINCondBold5.setVisibility(8);
            Weight weight = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(arrayList);
            if (Intrinsics.XOO0ii0(TimeUtils.millis2String(weight.getMTime(), O0X11OiO.XO0O10()), weight.getMLocalTime())) {
                DINCondBold dINCondBold6 = this.weightLastTime;
                if (dINCondBold6 == null) {
                    Intrinsics.XXO("weightLastTime");
                    dINCondBold6 = null;
                }
                dINCondBold6.setText(TimeUtils.millis2String(weight.getMTime(), O0X11OiO.X0i1O(null, 1, null)));
            } else {
                DINCondBold dINCondBold7 = this.weightLastTime;
                if (dINCondBold7 == null) {
                    Intrinsics.XXO("weightLastTime");
                    dINCondBold7 = null;
                }
                dINCondBold7.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(TimeUtils.string2Millis(weight.getMLocalTime(), "yyyy/MM/dd HH:mm:ss"))));
            }
            DINCondBold dINCondBold8 = this.weightLastValue;
            if (dINCondBold8 == null) {
                Intrinsics.XXO("weightLastValue");
                dINCondBold8 = null;
            }
            dINCondBold8.setText(cp5.iX1O1(this.isImperial ? l76.m2527iO(weight.getMWeight()) : weight.getMWeight(), true));
            PFRegular pFRegular3 = this.bmiValue;
            if (pFRegular3 == null) {
                Intrinsics.XXO("bmiValue");
                pFRegular3 = null;
            }
            pFRegular3.setText(cp5.I0IIOi(weight.getMWeight(), appUser2.getHeight()));
            initChart(arrayList);
        }
        PFRegular pFRegular4 = this.weightUnit;
        if (pFRegular4 == null) {
            Intrinsics.XXO("weightUnit");
        } else {
            pFRegular = pFRegular4;
        }
        pFRegular.setText(cp5.m1626iX(appUser2.getUnit()));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_weight;
    }

    @sf5(tag = I01XX0.IiI10X)
    public final void onWeightChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onWeightChanged");
        initView();
    }

    public final void setLineChart(@aa1 LineChart lineChart) {
        Intrinsics.X0O(lineChart, "<set-?>");
        this.lineChart = lineChart;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}
