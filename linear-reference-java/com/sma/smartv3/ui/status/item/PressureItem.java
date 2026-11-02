package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.model.PressureDataKt;
import com.sma.smartv3.model.PressureDayData;
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

    @aa1
    private final LinkedHashMap<Long, ArrayList<Pressure>> filterData;
    private final boolean initEvent;
    public Context mContext;

    @aa1
    private final PressureDao mPressureDao;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold tvTime;
    private DINCondBold tvValue;

    @aa1
    private final List<BarEntry> values;

    public PressureItem() {
        this.mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();
        this.filterData = new LinkedHashMap();
        this.values = new ArrayList();
        this.initEvent = true;
    }

    private final List<PressureDayData> initChart(List<Pressure> r17) {
        char r1 = 0;
        this.filterData.clear();
        int r3 = 1;
    L4:
        if (r3 >= 25) goto L9;
        LinkedHashMap<Long, ArrayList<Pressure>> r4 = this.filterData;
        long[] r5 = this.range;
        if (r5 != null) goto L8;
        Intrinsics.XXO("range");
        r5 = null;
    L8:
        r4.put(Long.valueOf(r5[0] + (((long) (r3 * 3600)) * 1000)), new ArrayList());
        r3 = r3 + 1;
        goto L4
    L9:
        Iterator<Pressure> r6 = r17.iterator();
    L11:
        if (r6.hasNext() == false) goto L18;
        Pressure r7 = r6.next();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r8 = this.filterData.entrySet().iterator();
    L14:
        if (r8.hasNext() == false) goto L11;
        Map.Entry<Long, ArrayList<Pressure>> r9 = r8.next();
        long r10 = r9.getKey().longValue();
        ArrayList<Pressure> r11 = r9.getValue();
        if (r7.getMTime() > r10) goto L14;
        r11.add(r7);
        goto L11
    L18:
        ArrayList r12 = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r13 = this.filterData.entrySet().iterator();
    L20:
        if (r13.hasNext() == false) goto L46;
        ArrayList<Pressure> r14 = r13.next().getValue();
        PressureDayData r15 = new PressureDayData(0, 0, 0, null, 15, null);
        if (r14.size() == 0) goto L45;
        Iterator<Pressure> r16 = r14.iterator();
        Intrinsics.O10IXXX0X(r16, "iterator(...)");
        int r18 = 0;
    L25:
        if (r16.hasNext() == false) goto L35;
        Pressure r19 = r16.next();
        Intrinsics.O10IXXX0X(r19, "next(...)");
        Pressure r110 = r19;
        if (r15.getMin() != 0) goto L29;
    L30:
        r15.setMin(r110.getMValue());
    L32:
        if (r15.getMax() >= r110.getMValue()) goto L34;
        r15.setMax(r110.getMValue());
    L34:
        r18 = r18 + r110.getMValue();
        goto L25
    L29:
        if (r15.getMin() <= r110.getMValue()) goto L32;
    L35:
        r15.setAvg(r18 / r14.size());
        r15.setAvg(r18 / r14.size());
        if (r15.getAvg() >= 25) goto L39;
        r15.setStatus(UtilsKt.XXO(R.string.pressure_level_relax));
        goto L45
    L39:
        if (r15.getAvg() >= 50) goto L42;
        r15.setStatus(UtilsKt.XXO(R.string.pressure_level_normal));
        goto L45
    L42:
        if (r15.getAvg() >= 75) goto L44;
        r15.setStatus(UtilsKt.XXO(R.string.pressure_level_moderate_stress));
        goto L45
    L44:
        r15.setStatus(UtilsKt.XXO(R.string.pressure_level_overstress));
    L45:
        r12.add(r15);
        goto L20
    L46:
        Iterator r20 = r12.iterator();
        int r21 = 0;
        int r22 = 0;
        float r23 = 0.0f;
    L48:
        if (r20.hasNext() == false) goto L61;
        PressureDayData r24 = (PressureDayData) r20.next();
        float r111 = r24.getMin();
        float r112 = r24.getMax();
        float r113 = r24.getAvg();
        List<BarEntry> r114 = this.values;
        float[] r115 = new float[2];
        r115[r1] = 0.0f;
        r115[1] = r113;
        r114.add(new BarEntry(r23, r115, PressureDataKt.getBarColors(getMContext(), r24.getAvg())));
        if (r21 >= r112) goto L52;
        r21 = (int) r112;
    L52:
        if (r22 != 0) goto L55;
        r22 = r24.getAvg();
    L55:
        if (r111 == 0.0f) goto L60;
        if (r22 <= r111) goto L60;
        r22 = (int) r111;
    L60:
        r24.getAvg();
        r23 = r23 + 1.0f;
        r1 = 0;
        goto L48
    L61:
        iO1Xi1X1i r2 = iO1Xi1X1i.OXO1;
        YAxis r25 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r25, "getAxisLeft(...)");
        YAxis r26 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r26, "getAxisRight(...)");
        r2.IO(r25, r26, 100.0f, 0.0f);
        updateData(this.values);
        return r12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> r5) {
        if (getBarChart().getData() != 0) goto L5;
    L7:
        XXX1X11 r0 = new XXX1X11(r5, "");
        r0.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMContext(), R.color.colorAccent))}));
        IXIX1X1 r6 = new IXIX1X1(new XIXi1iX00[]{r0});
        r6.iI(false);
        getBarChart().setData(r6);
        getBarChart().invalidate();
        return;
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L7;
        ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        goto L7
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r14) {
        Intrinsics.X0O(r14, "itemHolder");
        View r0 = r14.v(R.id.pressureBarChart);
        Intrinsics.XXI(r0);
        setBarChart((BarChart) r0);
        View r1 = r14.v(R.id.pressureLastTime);
        Intrinsics.XXI(r1);
        this.tvTime = (DINCondBold) r1;
        View r2 = r14.v(R.id.pressureLastValue);
        Intrinsics.XXI(r2);
        this.tvValue = (DINCondBold) r2;
        View r15 = r14.v(R.id.noData);
        Intrinsics.XXI(r15);
        this.noData = (DINCondBold) r15;
        Context r16 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r16, "getContext(...)");
        setMContext(r16);
        iO1Xi1X1i r17 = iO1Xi1X1i.OXO1;
        r17.OXO1(getBarChart());
        YAxis r3 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r3, "getAxisLeft(...)");
        YAxis r4 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r4, "getAxisRight(...)");
        r17.IO(r3, r4, 100.0f, 0.0f);
        BarChart r5 = getBarChart();
        r5.setTouchEnabled(false);
        r5.getDescription().XOO0ii0(false);
        r5.getLegend().XOO0ii0(false);
        r5.getAxisLeft().XXI(r17.iO(getMContext()));
        XAxis r6 = getBarChart().getXAxis();
        Intrinsics.XXI(r6);
        Context r7 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r7, "getContext(...)");
        int r8 = 1;
        r17.OIi0(r6, true, r7);
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        r6.O1O = 0.0f;
        r6.iOO1ii1 = 24.0f;
        SimpleDateFormat r18 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList r9 = new ArrayList();
    L4:
        if (r8 >= 25) goto L9;
        long[] r10 = this.range;
        if (r10 != null) goto L8;
        Intrinsics.XXO("range");
        r10 = null;
    L8:
        String r11 = TimeUtils.millis2String(r10[0] + (((long) (r8 * 3600)) * 1000), r18);
        Intrinsics.O10IXXX0X(r11, "millis2String(...)");
        r9.add(r11);
        r8 = r8 + 1;
        goto L4
    L9:
        r6.Oi(new q4(r9));
        Oi01X10i r19 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r19.iOOX010X(gk4.iO(getMContext(), R.color.line_color));
        r19.I1(new int[]{ContextCompat.getColor(getMContext(), R.color.p_show_1), ContextCompat.getColor(getMContext(), R.color.p_show_2)});
        r19.iIiiO(5);
        getBarChart().setRenderer(r19);
    }

    @aa1
    public final BarChart getBarChart() {
        BarChart r0 = this.barChart;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("barChart");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
        setItemHidden(!BleConnector.INSTANCE.isBound());
        this.values.clear();
        DINCondBold r3 = null;
        long[] r4 = null;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = r0;
        PressureDao r2 = this.mPressureDao;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r6 = r0[0];
        long[] r1 = this.range;
        if (r1 != null) goto L8;
        Intrinsics.XXO("range");
        r1 = null;
    L8:
        List<Pressure> r5 = r2.getPressures(r6, r1[1]);
        if (r5.isEmpty() == false) goto L33;
        DINCondBold r7 = this.tvTime;
        if (r7 != null) goto L13;
        Intrinsics.XXO("tvTime");
        r7 = null;
    L13:
        r7.setText(R.string.data_none);
        DINCondBold r8 = this.tvValue;
        if (r8 != null) goto L16;
        Intrinsics.XXO("tvValue");
        r8 = null;
    L16:
        r8.setText(R.string.data_none);
        getBarChart().setVisibility(8);
        DINCondBold r9 = this.noData;
        if (r9 != null) goto L19;
        Intrinsics.XXO("noData");
        r9 = null;
    L19:
        r9.setVisibility(0);
        if (i72.OXO1.XIIO11I() == false) goto L62;
        getBarChart().getXAxis().X00Xi1X(false);
        getBarChart().setVisibility(0);
        DINCondBold r10 = this.noData;
        if (r10 != null) goto L24;
        Intrinsics.XXO("noData");
        r10 = null;
    L24:
        r10.setVisibility(8);
        PressureDao r11 = this.mPressureDao;
        long[] r12 = this.range;
        if (r12 != null) goto L27;
        Intrinsics.XXO("range");
        r12 = null;
    L27:
        long r13 = r12[0];
        long[] r14 = this.range;
        if (r14 != null) goto L30;
        Intrinsics.XXO("range");
    L31:
        initChart(r11.getTestPressures(r13, r4[1]));
        return;
    L30:
        r4 = r14;
        goto L31
    L62:
        return;
    L33:
        getBarChart().getXAxis().X00Xi1X(true);
        getBarChart().setVisibility(0);
        DINCondBold r15 = this.noData;
        if (r15 != null) goto L36;
        Intrinsics.XXO("noData");
        r15 = null;
    L36:
        r15.setVisibility(8);
        DINCondBold r16 = this.tvTime;
        if (r16 != null) goto L39;
        Intrinsics.XXO("tvTime");
        r16 = null;
    L39:
        r16.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(r5)).getMTime())));
        DINCondBold r17 = this.tvValue;
        if (r17 != null) goto L42;
        Intrinsics.XXO("tvValue");
        r17 = null;
    L42:
        r17.setText(String.valueOf(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(r5)).getMValue()));
        List<PressureDayData> r18 = initChart(r5);
        if (i72.OXO1.i000X() == false) goto L63;
        ListIterator<PressureDayData> r19 = r18.listIterator(r18.size());
    L46:
        if (r19.hasPrevious() == false) goto L50;
        PressureDayData r20 = r19.previous();
        if (r20.getAvg() <= 0) goto L46;
    L51:
        PressureDayData r21 = r20;
        if (r21 == null) goto L64;
        String r22 = r21.getAvg() + " " + r21.getStatus();
        SpannableString r23 = new SpannableString(r22);
        r23.setSpan(new RelativeSizeSpan(0.5f), String.valueOf(r21.getAvg()).length(), r22.length(), 33);
        DINCondBold r24 = this.tvValue;
        if (r24 != null) goto L56;
        Intrinsics.XXO("tvValue");
    L57:
        r3.setText(r23);
        return;
    L56:
        r3 = r24;
        goto L57
    L64:
        return;
    L50:
        r20 = null;
        goto L51
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_pressure;
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onPressureChanged"});
        initView();
    }

    public final void setBarChart(@aa1 BarChart r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.barChart = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
