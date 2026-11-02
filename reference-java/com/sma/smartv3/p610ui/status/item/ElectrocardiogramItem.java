package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.ECGMinuteData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ElectrocardiogramDao;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ElectrocardiogramItem extends BaseDslItem {
    private LineChart lineChart;
    private Context mContext;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold tvBpm;
    private DINCondBold tvTime;

    @aa1
    private final ElectrocardiogramDao mElectrocardiogramDao = MyDb.INSTANCE.getMDatabase().electrocardiogramDao();

    @aa1
    private final LinkedHashMap<Long, ECGMinuteData> filterData = new LinkedHashMap<>();
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.hrLineChart);
        Intrinsics.XXI(viewM3483v);
        this.lineChart = (LineChart) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.hrLastTime);
        Intrinsics.XXI(viewM3483v2);
        this.tvTime = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.hrLastValue);
        Intrinsics.XXI(viewM3483v3);
        this.tvBpm = (DINCondBold) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.noData);
        Intrinsics.XXI(viewM3483v4);
        this.noData = (DINCondBold) viewM3483v4;
        LineChart lineChart = this.lineChart;
        LineChart lineChart2 = null;
        if (lineChart == null) {
            Intrinsics.XXO("lineChart");
            lineChart = null;
        }
        Context context = lineChart.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.mContext = context;
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
            lineChart3 = null;
        }
        io1xi1x1i.XIi00iiXO(lineChart3);
        LineChart lineChart4 = this.lineChart;
        if (lineChart4 == null) {
            Intrinsics.XXO("lineChart");
            lineChart4 = null;
        }
        YAxis axisLeft = lineChart4.getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        LineChart lineChart5 = this.lineChart;
        if (lineChart5 == null) {
            Intrinsics.XXO("lineChart");
            lineChart5 = null;
        }
        YAxis axisRight = lineChart5.getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.m2102IO(axisLeft, axisRight, 200.0f, 30.0f);
        LineChart lineChart6 = this.lineChart;
        if (lineChart6 == null) {
            Intrinsics.XXO("lineChart");
            lineChart6 = null;
        }
        lineChart6.setTouchEnabled(false);
        lineChart6.getDescription().XOO0ii0(false);
        lineChart6.getLegend().XOO0ii0(false);
        YAxis axisLeft2 = lineChart6.getAxisLeft();
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        axisLeft2.XXI(io1xi1x1i.m2103iO(context2));
        LineChart lineChart7 = this.lineChart;
        if (lineChart7 == null) {
            Intrinsics.XXO("lineChart");
            lineChart7 = null;
        }
        XAxis xAxis = lineChart7.getXAxis();
        Intrinsics.XXI(xAxis);
        LineChart lineChart8 = this.lineChart;
        if (lineChart8 == null) {
            Intrinsics.XXO("lineChart");
            lineChart8 = null;
        }
        Context context3 = lineChart8.getContext();
        Intrinsics.O10IXXX0X(context3, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context3);
        int iXIi00iiXO = O0X11OiO.XIi00iiXO();
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        xAxis.i0X000X0O(0.0f);
        float f = iXIi00iiXO;
        xAxis.IXOIIIO(f / 6);
        xAxis.iOiXi11II(f);
        SimpleDateFormat simpleDateFormatIXI = O0X11OiO.IXI(false, 1, null);
        ArrayList arrayList = new ArrayList();
        if (iXIi00iiXO >= 0) {
            int i = 0;
            while (true) {
                long[] jArr = this.range;
                if (jArr == null) {
                    Intrinsics.XXO("range");
                    jArr = null;
                }
                String strMillis2String = TimeUtils.millis2String(jArr[0] + ((long) (60000 * i)), simpleDateFormatIXI);
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                arrayList.add(strMillis2String);
                if (i == iXIi00iiXO) {
                    break;
                } else {
                    i++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
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
        LineChart lineChart9 = this.lineChart;
        if (lineChart9 == null) {
            Intrinsics.XXO("lineChart");
        } else {
            lineChart2 = lineChart9;
        }
        lineChart2.setData(c2305co);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initChart(@aa1 List<Electrocardiogram> list) {
        Intrinsics.X0O(list, "list");
        this.filterData.clear();
        long[] jArr = this.range;
        LineChart lineChart = null;
        if (jArr == null) {
            Intrinsics.XXO("range");
            jArr = null;
        }
        long j = jArr[0];
        long[] jArr2 = this.range;
        if (jArr2 == null) {
            Intrinsics.XXO("range");
            jArr2 = null;
        }
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, jArr2[1], 60000L);
        if (j <= jXO0O10) {
            while (true) {
                this.filterData.put(Long.valueOf(j), new ECGMinuteData(0, 0));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Electrocardiogram electrocardiogram : list) {
            for (Map.Entry<Long, ECGMinuteData> entry : this.filterData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ECGMinuteData value = entry.getValue();
                if (electrocardiogram.getMTime() < jLongValue) {
                    value.setTotal(value.getTotal() + electrocardiogram.getMValue());
                    value.setNum(value.getNum() + 1);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, ECGMinuteData>> it = this.filterData.entrySet().iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            ECGMinuteData value2 = it.next().getValue();
            if (value2.getNum() != 0 && value2.getTotal() != 0) {
                arrayList.add(new Entry(f, value2.getTotal() / value2.getNum()));
            }
            f += 1.0f;
        }
        LineChart lineChart2 = this.lineChart;
        if (lineChart2 == null) {
            Intrinsics.XXO("lineChart");
            lineChart2 = null;
        }
        Object obj = ((C2305co) lineChart2.getData()).I1XOi1().get(0);
        Intrinsics.X1ii(obj, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List<T> listI0O = ((LineDataSet) obj).i0O();
        listI0O.clear();
        listI0O.addAll(arrayList);
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
        } else {
            lineChart = lineChart3;
        }
        lineChart.invalidate();
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
        DINCondBold dINCondBold = null;
        long[] jArr = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = jArrIOOX010X;
        ElectrocardiogramDao electrocardiogramDao = this.mElectrocardiogramDao;
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
        List<Electrocardiogram> electrocardiograms = electrocardiogramDao.getElectrocardiograms(j, jArr2[1]);
        if (!electrocardiograms.isEmpty()) {
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
            DINCondBold dINCondBold2 = this.noData;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("noData");
                dINCondBold2 = null;
            }
            dINCondBold2.setVisibility(8);
            DINCondBold dINCondBold3 = this.tvTime;
            if (dINCondBold3 == null) {
                Intrinsics.XXO("tvTime");
                dINCondBold3 = null;
            }
            dINCondBold3.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(((Electrocardiogram) CollectionsKt___CollectionsKt.Xi1XO00(electrocardiograms)).getMTime())));
            DINCondBold dINCondBold4 = this.tvBpm;
            if (dINCondBold4 == null) {
                Intrinsics.XXO("tvBpm");
            } else {
                dINCondBold = dINCondBold4;
            }
            dINCondBold.setText(String.valueOf(((Electrocardiogram) CollectionsKt___CollectionsKt.Xi1XO00(electrocardiograms)).getMValue()));
            initChart(electrocardiograms);
            return;
        }
        DINCondBold dINCondBold5 = this.tvTime;
        if (dINCondBold5 == null) {
            Intrinsics.XXO("tvTime");
            dINCondBold5 = null;
        }
        dINCondBold5.setText(R.string.data_none);
        DINCondBold dINCondBold6 = this.tvBpm;
        if (dINCondBold6 == null) {
            Intrinsics.XXO("tvBpm");
            dINCondBold6 = null;
        }
        dINCondBold6.setText(R.string.data_none);
        LineChart lineChart3 = this.lineChart;
        if (lineChart3 == null) {
            Intrinsics.XXO("lineChart");
            lineChart3 = null;
        }
        lineChart3.setVisibility(8);
        DINCondBold dINCondBold7 = this.noData;
        if (dINCondBold7 == null) {
            Intrinsics.XXO("noData");
            dINCondBold7 = null;
        }
        dINCondBold7.setVisibility(0);
        if (i72.OXO1.XIIO11I()) {
            LineChart lineChart4 = this.lineChart;
            if (lineChart4 == null) {
                Intrinsics.XXO("lineChart");
                lineChart4 = null;
            }
            lineChart4.getXAxis().X00Xi1X(false);
            LineChart lineChart5 = this.lineChart;
            if (lineChart5 == null) {
                Intrinsics.XXO("lineChart");
                lineChart5 = null;
            }
            lineChart5.setVisibility(0);
            DINCondBold dINCondBold8 = this.noData;
            if (dINCondBold8 == null) {
                Intrinsics.XXO("noData");
                dINCondBold8 = null;
            }
            dINCondBold8.setVisibility(8);
            ElectrocardiogramDao electrocardiogramDao2 = this.mElectrocardiogramDao;
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
            initChart(electrocardiogramDao2.getTestElectrocardiograms(j2, jArr[1]));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_electrocardiogram;
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onHeartRateChanged");
        initView();
    }
}
