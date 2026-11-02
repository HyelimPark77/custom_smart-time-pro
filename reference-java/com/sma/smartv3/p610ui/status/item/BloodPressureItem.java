package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X1i1iOX;
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
import com.sma.smartv3.model.BPHourData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.time.DateUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodPressureItem extends BaseDslItem {
    private BarChart barChart;
    private DINCondBold bpLastTime;
    private DINCondBold dbp;
    private Context mContext;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold sbp;

    @aa1
    private final BloodPressureDao mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();

    @aa1
    private final LinkedHashMap<Long, BPHourData> dataMap = new LinkedHashMap<>();

    @aa1
    private final List<BarEntry> values = new ArrayList();
    private final boolean initEvent = true;

    private final void initChart(List<BloodPressure> list) {
        this.dataMap.clear();
        long[] jArr = this.range;
        long[] jArr2 = null;
        if (jArr == null) {
            Intrinsics.XXO("range");
            jArr = null;
        }
        long j = jArr[0];
        long[] jArr3 = this.range;
        if (jArr3 == null) {
            Intrinsics.XXO("range");
        } else {
            jArr2 = jArr3;
        }
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, jArr2[1], DateUtils.f56805iO);
        if (j <= jXO0O10) {
            while (true) {
                this.dataMap.put(Long.valueOf(j), new BPHourData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += DateUtils.f56805iO;
                }
            }
        }
        for (BloodPressure bloodPressure : list) {
            for (Map.Entry<Long, BPHourData> entry : this.dataMap.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                BPHourData value = entry.getValue();
                if (bloodPressure.getMTime() < jLongValue) {
                    if (value.getDbpMax() < bloodPressure.getMDiastolic()) {
                        value.setDbpMax(bloodPressure.getMDiastolic());
                    }
                    if (value.getDbpMin() > bloodPressure.getMDiastolic() || value.getDbpMin() == 0) {
                        value.setDbpMin(bloodPressure.getMDiastolic());
                    }
                    if (value.getSbpMax() < bloodPressure.getMSystolic()) {
                        value.setSbpMax(bloodPressure.getMSystolic());
                    }
                    if (value.getSbpMin() > bloodPressure.getMSystolic() || value.getSbpMin() == 0) {
                        value.setSbpMin(bloodPressure.getMSystolic());
                    }
                    value.setDbpTotal(value.getDbpTotal() + bloodPressure.getMDiastolic());
                    value.setDbpNum(value.getDbpNum() + 1);
                    value.setSbpTotal(value.getSbpTotal() + bloodPressure.getMSystolic());
                    value.setSbpNum(value.getSbpNum() + 1);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, BPHourData>> it = this.dataMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            BPHourData value2 = it.next().getValue();
            this.values.add(new BarEntry(i, new float[]{value2.getDbpMin(), value2.getSbpMax() - value2.getDbpMin()}));
            i++;
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
        XXX1X11 xxx1x11 = new XXX1X11(list, "BP Data");
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
        View viewM3483v = itemHolder.m3483v(R.id.bpChart);
        Intrinsics.XXI(viewM3483v);
        this.barChart = (BarChart) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.bpLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.bpLastTime = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.sbp);
        Intrinsics.XXI(viewM3483v3);
        this.sbp = (DINCondBold) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.dbp);
        Intrinsics.XXI(viewM3483v4);
        this.dbp = (DINCondBold) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.noData);
        Intrinsics.XXI(viewM3483v5);
        this.noData = (DINCondBold) viewM3483v5;
        BarChart barChart = this.barChart;
        BarChart barChart2 = null;
        if (barChart == null) {
            Intrinsics.XXO("barChart");
            barChart = null;
        }
        Context context = barChart.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.mContext = context;
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        BarChart barChart3 = this.barChart;
        if (barChart3 == null) {
            Intrinsics.XXO("barChart");
            barChart3 = null;
        }
        io1xi1x1i.OXO1(barChart3);
        BarChart barChart4 = this.barChart;
        if (barChart4 == null) {
            Intrinsics.XXO("barChart");
            barChart4 = null;
        }
        YAxis axisLeft = barChart4.getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        BarChart barChart5 = this.barChart;
        if (barChart5 == null) {
            Intrinsics.XXO("barChart");
            barChart5 = null;
        }
        YAxis axisRight = barChart5.getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, 200.0f, 30.0f);
        BarChart barChart6 = this.barChart;
        if (barChart6 == null) {
            Intrinsics.XXO("barChart");
            barChart6 = null;
        }
        barChart6.getLegend().XOO0ii0(false);
        barChart6.getDescription().XOO0ii0(false);
        barChart6.setTouchEnabled(false);
        barChart6.setDrawValueAboveBar(false);
        YAxis axisLeft2 = barChart6.getAxisLeft();
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        axisLeft2.XXI(io1xi1x1i.m2103iO(context2));
        BarChart barChart7 = this.barChart;
        if (barChart7 == null) {
            Intrinsics.XXO("barChart");
            barChart7 = null;
        }
        XAxis xAxis = barChart7.getXAxis();
        Intrinsics.XXI(xAxis);
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        io1xi1x1i.OIi0(xAxis, true, context3);
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        xAxis.IXOIIIO(1.0f);
        xAxis.XOIX(7);
        xAxis.iOiXi11II(24.0f);
        SimpleDateFormat simpleDateFormatIXI = O0X11OiO.IXI(false, 1, null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 25; i++) {
            long[] jArr = this.range;
            if (jArr == null) {
                Intrinsics.XXO("range");
                jArr = null;
            }
            String strMillis2String = TimeUtils.millis2String(jArr[0] + (((long) (i * 3600)) * 1000), simpleDateFormatIXI);
            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        BarChart barChart8 = this.barChart;
        if (barChart8 == null) {
            Intrinsics.XXO("barChart");
            barChart8 = null;
        }
        BarChart barChart9 = this.barChart;
        if (barChart9 == null) {
            Intrinsics.XXO("barChart");
            barChart9 = null;
        }
        X1i1iOX animator = barChart9.getAnimator();
        BarChart barChart10 = this.barChart;
        if (barChart10 == null) {
            Intrinsics.XXO("barChart");
            barChart10 = null;
        }
        Oi01X10i oi01X10i = new Oi01X10i(barChart8, animator, barChart10.getViewPortHandler());
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        oi01X10i.iOOX010X(gk4.m1859iO(context4, R.color.line_color));
        oi01X10i.II1Xi0(8);
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
            context5 = null;
        }
        oi01X10i.OII(gk4.m1859iO(context5, R.color.bp_line_color));
        Context context6 = this.mContext;
        if (context6 == null) {
            Intrinsics.XXO("mContext");
            context6 = null;
        }
        int color = ContextCompat.getColor(context6, R.color.bp_secondary_color);
        Context context7 = this.mContext;
        if (context7 == null) {
            Intrinsics.XXO("mContext");
            context7 = null;
        }
        oi01X10i.m1016I1(new int[]{color, ContextCompat.getColor(context7, R.color.bp_color)});
        oi01X10i.iIiiO(3);
        BarChart barChart11 = this.barChart;
        if (barChart11 == null) {
            Intrinsics.XXO("barChart");
        } else {
            barChart2 = barChart11;
        }
        barChart2.setRenderer(oi01X10i);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
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
        this.values.clear();
        DINCondBold dINCondBold = null;
        long[] jArr = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = jArrIOOX010X;
        BloodPressureDao bloodPressureDao = this.mBloodPressureDao;
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
        List<BloodPressure> bloodPressures = bloodPressureDao.getBloodPressures(j, jArr2[1]);
        if (!bloodPressures.isEmpty()) {
            BarChart barChart = this.barChart;
            if (barChart == null) {
                Intrinsics.XXO("barChart");
                barChart = null;
            }
            barChart.getXAxis().X00Xi1X(true);
            BarChart barChart2 = this.barChart;
            if (barChart2 == null) {
                Intrinsics.XXO("barChart");
                barChart2 = null;
            }
            barChart2.setVisibility(0);
            DINCondBold dINCondBold2 = this.noData;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("noData");
                dINCondBold2 = null;
            }
            dINCondBold2.setVisibility(8);
            BloodPressure bloodPressure = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(bloodPressures);
            DINCondBold dINCondBold3 = this.bpLastTime;
            if (dINCondBold3 == null) {
                Intrinsics.XXO("bpLastTime");
                dINCondBold3 = null;
            }
            dINCondBold3.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(bloodPressure.getMTime())));
            DINCondBold dINCondBold4 = this.sbp;
            if (dINCondBold4 == null) {
                Intrinsics.XXO("sbp");
                dINCondBold4 = null;
            }
            dINCondBold4.setText(String.valueOf(bloodPressure.getMSystolic()));
            DINCondBold dINCondBold5 = this.dbp;
            if (dINCondBold5 == null) {
                Intrinsics.XXO("dbp");
            } else {
                dINCondBold = dINCondBold5;
            }
            dINCondBold.setText(String.valueOf(bloodPressure.getMDiastolic()));
            initChart(bloodPressures);
            return;
        }
        DINCondBold dINCondBold6 = this.bpLastTime;
        if (dINCondBold6 == null) {
            Intrinsics.XXO("bpLastTime");
            dINCondBold6 = null;
        }
        dINCondBold6.setText(R.string.data_none);
        DINCondBold dINCondBold7 = this.sbp;
        if (dINCondBold7 == null) {
            Intrinsics.XXO("sbp");
            dINCondBold7 = null;
        }
        dINCondBold7.setText(R.string.data_none);
        DINCondBold dINCondBold8 = this.dbp;
        if (dINCondBold8 == null) {
            Intrinsics.XXO("dbp");
            dINCondBold8 = null;
        }
        dINCondBold8.setText(R.string.data_none);
        BarChart barChart3 = this.barChart;
        if (barChart3 == null) {
            Intrinsics.XXO("barChart");
            barChart3 = null;
        }
        barChart3.setVisibility(8);
        DINCondBold dINCondBold9 = this.noData;
        if (dINCondBold9 == null) {
            Intrinsics.XXO("noData");
            dINCondBold9 = null;
        }
        dINCondBold9.setVisibility(0);
        if (i72.OXO1.XIIO11I()) {
            BarChart barChart4 = this.barChart;
            if (barChart4 == null) {
                Intrinsics.XXO("barChart");
                barChart4 = null;
            }
            barChart4.getXAxis().X00Xi1X(false);
            BarChart barChart5 = this.barChart;
            if (barChart5 == null) {
                Intrinsics.XXO("barChart");
                barChart5 = null;
            }
            barChart5.setVisibility(0);
            DINCondBold dINCondBold10 = this.noData;
            if (dINCondBold10 == null) {
                Intrinsics.XXO("noData");
                dINCondBold10 = null;
            }
            dINCondBold10.setVisibility(8);
            BloodPressureDao bloodPressureDao2 = this.mBloodPressureDao;
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
            initChart(bloodPressureDao2.getTestBloodPressures(j2, jArr[1]));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_blood_pressure;
    }

    @sf5(tag = I01XX0.f1094iO)
    public final void onBloodPressureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onBloodPressureChanged");
        initView();
    }
}
