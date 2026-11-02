package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
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
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPressureItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureItem.kt\ncom/sma/smartv3/ui/status/item/PressureItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
public class PressureItem extends BaseDslItem {
    public BarChart barChart;
    public Context mContext;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold tvTime;
    private DINCondBold tvValue;

    @aa1
    private final PressureDao mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();

    @aa1
    private final LinkedHashMap<Long, ArrayList<Pressure>> filterData = new LinkedHashMap<>();

    @aa1
    private final List<BarEntry> values = new ArrayList();
    private final boolean initEvent = true;

    private final List<PressureDayData> initChart(List<Pressure> list) {
        char c = 0;
        this.filterData.clear();
        for (int i = 1; i < 25; i++) {
            LinkedHashMap<Long, ArrayList<Pressure>> linkedHashMap = this.filterData;
            long[] jArr = this.range;
            if (jArr == null) {
                Intrinsics.XXO("range");
                jArr = null;
            }
            linkedHashMap.put(Long.valueOf(jArr[0] + (((long) (i * 3600)) * 1000)), new ArrayList<>());
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
                pressureDayData.setAvg(mValue / value2.size());
                if (pressureDayData.getAvg() < 25) {
                    pressureDayData.setStatus(UtilsKt.XXO(R.string.pressure_level_relax));
                } else if (pressureDayData.getAvg() < 50) {
                    pressureDayData.setStatus(UtilsKt.XXO(R.string.pressure_level_normal));
                } else if (pressureDayData.getAvg() < 75) {
                    pressureDayData.setStatus(UtilsKt.XXO(R.string.pressure_level_moderate_stress));
                } else {
                    pressureDayData.setStatus(UtilsKt.XXO(R.string.pressure_level_overstress));
                }
            }
            arrayList.add(pressureDayData);
        }
        int i2 = 0;
        int avg = 0;
        float f = 0.0f;
        for (PressureDayData pressureDayData2 : arrayList) {
            float min = pressureDayData2.getMin();
            float max = pressureDayData2.getMax();
            float avg2 = pressureDayData2.getAvg();
            List<BarEntry> list2 = this.values;
            float[] fArr = new float[2];
            fArr[c] = 0.0f;
            fArr[1] = avg2;
            list2.add(new BarEntry(f, fArr, PressureDataKt.getBarColors(getMContext(), pressureDayData2.getAvg())));
            if (i2 < max) {
                i2 = (int) max;
            }
            if (avg == 0) {
                avg = pressureDayData2.getAvg();
            }
            if (min != 0.0f && avg > min) {
                avg = (int) min;
            }
            pressureDayData2.getAvg();
            f += 1.0f;
            c = 0;
        }
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, 100.0f, 0.0f);
        updateData(this.values);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> list) {
        if (getBarChart().getData() != 0 && ((IXIX1X1) getBarChart().getData()).XXI() > 0) {
            ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        }
        XXX1X11 xxx1x11 = new XXX1X11(list, "");
        xxx1x11.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMContext(), R.color.colorAccent))));
        IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
        ixix1x1.m1316iI(false);
        getBarChart().setData(ixix1x1);
        getBarChart().invalidate();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.pressureBarChart);
        Intrinsics.XXI(viewM3483v);
        setBarChart((BarChart) viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.pressureLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.tvTime = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.pressureLastValue);
        Intrinsics.XXI(viewM3483v3);
        this.tvValue = (DINCondBold) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.noData);
        Intrinsics.XXI(viewM3483v4);
        this.noData = (DINCondBold) viewM3483v4;
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        io1xi1x1i.OXO1(getBarChart());
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, 100.0f, 0.0f);
        BarChart barChart = getBarChart();
        barChart.setTouchEnabled(false);
        barChart.getDescription().XOO0ii0(false);
        barChart.getLegend().XOO0ii0(false);
        barChart.getAxisLeft().XXI(io1xi1x1i.m2103iO(getMContext()));
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context2 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context2);
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        xAxis.O1O = 0.0f;
        xAxis.iOO1ii1 = 24.0f;
        SimpleDateFormat simpleDateFormatXXiIiX10 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 25; i++) {
            long[] jArr = this.range;
            if (jArr == null) {
                Intrinsics.XXO("range");
                jArr = null;
            }
            String strMillis2String = TimeUtils.millis2String(jArr[0] + (((long) (i * 3600)) * 1000), simpleDateFormatXXiIiX10);
            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMContext(), R.color.line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMContext(), R.color.p_show_1), ContextCompat.getColor(getMContext(), R.color.p_show_2)});
        oi01X10i.iIiiO(5);
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PressureDayData pressureDayDataPrevious;
        setItemHidden(!BleConnector.INSTANCE.isBound());
        this.values.clear();
        DINCondBold dINCondBold = null;
        long[] jArr = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = jArrIOOX010X;
        PressureDao pressureDao = this.mPressureDao;
        if (jArrIOOX010X == null) {
            Intrinsics.XXO("range");
            jArrIOOX010X = null;
        }
        long j = jArrIOOX010X[0];
        long[] jArr2 = this.range;
        if (jArr2 == null) {
            Intrinsics.XXO("range");
            jArr2 = null;
        }
        List<Pressure> pressures = pressureDao.getPressures(j, jArr2[1]);
        if (pressures.isEmpty()) {
            DINCondBold dINCondBold2 = this.tvTime;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("tvTime");
                dINCondBold2 = null;
            }
            dINCondBold2.setText(R.string.data_none);
            DINCondBold dINCondBold3 = this.tvValue;
            if (dINCondBold3 == null) {
                Intrinsics.XXO("tvValue");
                dINCondBold3 = null;
            }
            dINCondBold3.setText(R.string.data_none);
            getBarChart().setVisibility(8);
            DINCondBold dINCondBold4 = this.noData;
            if (dINCondBold4 == null) {
                Intrinsics.XXO("noData");
                dINCondBold4 = null;
            }
            dINCondBold4.setVisibility(0);
            if (i72.OXO1.XIIO11I()) {
                getBarChart().getXAxis().X00Xi1X(false);
                getBarChart().setVisibility(0);
                DINCondBold dINCondBold5 = this.noData;
                if (dINCondBold5 == null) {
                    Intrinsics.XXO("noData");
                    dINCondBold5 = null;
                }
                dINCondBold5.setVisibility(8);
                PressureDao pressureDao2 = this.mPressureDao;
                long[] jArr3 = this.range;
                if (jArr3 == null) {
                    Intrinsics.XXO("range");
                    jArr3 = null;
                }
                long j2 = jArr3[0];
                long[] jArr4 = this.range;
                if (jArr4 == null) {
                    Intrinsics.XXO("range");
                } else {
                    jArr = jArr4;
                }
                initChart(pressureDao2.getTestPressures(j2, jArr[1]));
                return;
            }
            return;
        }
        getBarChart().getXAxis().X00Xi1X(true);
        getBarChart().setVisibility(0);
        DINCondBold dINCondBold6 = this.noData;
        if (dINCondBold6 == null) {
            Intrinsics.XXO("noData");
            dINCondBold6 = null;
        }
        dINCondBold6.setVisibility(8);
        DINCondBold dINCondBold7 = this.tvTime;
        if (dINCondBold7 == null) {
            Intrinsics.XXO("tvTime");
            dINCondBold7 = null;
        }
        dINCondBold7.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(pressures)).getMTime())));
        DINCondBold dINCondBold8 = this.tvValue;
        if (dINCondBold8 == null) {
            Intrinsics.XXO("tvValue");
            dINCondBold8 = null;
        }
        dINCondBold8.setText(String.valueOf(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(pressures)).getMValue()));
        List<PressureDayData> listInitChart = initChart(pressures);
        if (i72.OXO1.i000X()) {
            ListIterator<PressureDayData> listIterator = listInitChart.listIterator(listInitChart.size());
            do {
                if (!listIterator.hasPrevious()) {
                    pressureDayDataPrevious = null;
                    break;
                }
                pressureDayDataPrevious = listIterator.previous();
            } while (pressureDayDataPrevious.getAvg() <= 0);
            PressureDayData pressureDayData = pressureDayDataPrevious;
            if (pressureDayData != null) {
                String str = pressureDayData.getAvg() + " " + pressureDayData.getStatus();
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new RelativeSizeSpan(0.5f), String.valueOf(pressureDayData.getAvg()).length(), str.length(), 33);
                DINCondBold dINCondBold9 = this.tvValue;
                if (dINCondBold9 == null) {
                    Intrinsics.XXO("tvValue");
                } else {
                    dINCondBold = dINCondBold9;
                }
                dINCondBold.setText(spannableString);
            }
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_pressure;
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onPressureChanged");
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
