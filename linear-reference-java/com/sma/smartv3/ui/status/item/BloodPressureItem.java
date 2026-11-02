package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X1i1iOX;
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
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.model.BPHourData;
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

    @aa1
    private final LinkedHashMap<Long, BPHourData> dataMap;
    private DINCondBold dbp;
    private final boolean initEvent;

    @aa1
    private final BloodPressureDao mBloodPressureDao;
    private Context mContext;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold sbp;

    @aa1
    private final List<BarEntry> values;

    public BloodPressureItem() {
        this.mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();
        this.dataMap = new LinkedHashMap();
        this.values = new ArrayList();
        this.initEvent = true;
    }

    private final void initChart(List<BloodPressure> r21) {
        this.dataMap.clear();
        long[] r3 = this.range;
        long[] r4 = null;
        if (r3 != null) goto L5;
        Intrinsics.XXO("range");
        r3 = null;
    L5:
        long r6 = r3[0];
        long[] r5 = this.range;
        if (r5 != null) goto L8;
        Intrinsics.XXO("range");
    L9:
        long r7 = ProgressionUtilKt.XO0O10(r6, r4[1], DateUtils.iO);
        if (r6 > r7) goto L14;
    L11:
        this.dataMap.put(Long.valueOf(r6), new BPHourData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
        if (r6 == r7) goto L14;
        r6 = r6 + DateUtils.iO;
    L14:
        Iterator<BloodPressure> r8 = r21.iterator();
    L16:
        if (r8.hasNext() == false) goto L39;
        BloodPressure r9 = r8.next();
        Iterator<Map.Entry<Long, BPHourData>> r10 = this.dataMap.entrySet().iterator();
    L19:
        if (r10.hasNext() == false) goto L16;
        Map.Entry<Long, BPHourData> r11 = r10.next();
        long r12 = r11.getKey().longValue();
        BPHourData r13 = r11.getValue();
        if (r9.getMTime() >= r12) goto L19;
        if (r13.getDbpMax() >= r9.getMDiastolic()) goto L26;
        r13.setDbpMax(r9.getMDiastolic());
    L26:
        if (r13.getDbpMin() <= r9.getMDiastolic()) goto L28;
    L29:
        r13.setDbpMin(r9.getMDiastolic());
    L31:
        if (r13.getSbpMax() >= r9.getMSystolic()) goto L34;
        r13.setSbpMax(r9.getMSystolic());
    L34:
        if (r13.getSbpMin() <= r9.getMSystolic()) goto L36;
    L37:
        r13.setSbpMin(r9.getMSystolic());
    L38:
        r13.setDbpTotal(r13.getDbpTotal() + r9.getMDiastolic());
        r13.setDbpNum(r13.getDbpNum() + 1);
        r13.setSbpTotal(r13.getSbpTotal() + r9.getMSystolic());
        r13.setSbpNum(r13.getSbpNum() + 1);
        goto L16
    L36:
        if (r13.getSbpMin() != 0) goto L38;
    L28:
        if (r13.getDbpMin() != 0) goto L31;
    L39:
        Iterator<Map.Entry<Long, BPHourData>> r14 = this.dataMap.entrySet().iterator();
        int r15 = 0;
    L41:
        if (r14.hasNext() == false) goto L43;
        BPHourData r16 = r14.next().getValue();
        this.values.add(new BarEntry(r15, new float[]{r16.getDbpMin(), r16.getSbpMax() - r16.getDbpMin()}));
        r15 = r15 + 1;
        goto L41
    L43:
        updateData(this.values);
        return;
    L8:
        r4 = r5;
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<BarEntry> r7) {
        BarChart r1 = this.barChart;
        BarChart r3 = null;
        if (r1 != null) goto L6;
        Intrinsics.XXO("barChart");
        r1 = null;
    L6:
        if (r1.getData() == 0) goto L16;
        BarChart r2 = this.barChart;
        if (r2 != null) goto L11;
        Intrinsics.XXO("barChart");
        r2 = null;
    L11:
        if (((IXIX1X1) r2.getData()).XXI() <= 0) goto L16;
        BarChart r4 = this.barChart;
        if (r4 != null) goto L15;
        Intrinsics.XXO("barChart");
        r4 = null;
    L15:
        ((IXIX1X1) r4.getData()).IXXOO(0);
    L16:
        XXX1X11 r5 = new XXX1X11(r7, "BP Data");
        Context r6 = this.mContext;
        if (r6 != null) goto L19;
        Intrinsics.XXO("mContext");
        r6 = null;
    L19:
        r5.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(r6, R.color.colorAccent))}));
        IXIX1X1 r8 = new IXIX1X1(new XIXi1iX00[]{r5});
        r8.iI(false);
        BarChart r0 = this.barChart;
        if (r0 != null) goto L22;
        Intrinsics.XXO("barChart");
        r0 = null;
    L22:
        r0.setData(r8);
        BarChart r9 = this.barChart;
        if (r9 != null) goto L25;
        Intrinsics.XXO("barChart");
    L26:
        r3.invalidate();
        return;
    L25:
        r3 = r9;
        goto L26
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r15) {
        Intrinsics.X0O(r15, "itemHolder");
        View r0 = r15.v(R.id.bpChart);
        Intrinsics.XXI(r0);
        this.barChart = (BarChart) r0;
        View r1 = r15.v(R.id.bpLastTime);
        Intrinsics.XXI(r1);
        this.bpLastTime = (DINCondBold) r1;
        View r2 = r15.v(R.id.sbp);
        Intrinsics.XXI(r2);
        this.sbp = (DINCondBold) r2;
        View r3 = r15.v(R.id.dbp);
        Intrinsics.XXI(r3);
        this.dbp = (DINCondBold) r3;
        View r16 = r15.v(R.id.noData);
        Intrinsics.XXI(r16);
        this.noData = (DINCondBold) r16;
        BarChart r17 = this.barChart;
        BarChart r4 = null;
        if (r17 != null) goto L5;
        Intrinsics.XXO("barChart");
        r17 = null;
    L5:
        Context r18 = r17.getContext();
        Intrinsics.O10IXXX0X(r18, "getContext(...)");
        this.mContext = r18;
        iO1Xi1X1i r19 = iO1Xi1X1i.OXO1;
        BarChart r5 = this.barChart;
        if (r5 != null) goto L8;
        Intrinsics.XXO("barChart");
        r5 = null;
    L8:
        r19.OXO1(r5);
        BarChart r6 = this.barChart;
        if (r6 != null) goto L11;
        Intrinsics.XXO("barChart");
        r6 = null;
    L11:
        YAxis r7 = r6.getAxisLeft();
        Intrinsics.O10IXXX0X(r7, "getAxisLeft(...)");
        BarChart r8 = this.barChart;
        if (r8 != null) goto L14;
        Intrinsics.XXO("barChart");
        r8 = null;
    L14:
        YAxis r9 = r8.getAxisRight();
        Intrinsics.O10IXXX0X(r9, "getAxisRight(...)");
        r19.IO(r7, r9, 200.0f, 30.0f);
        BarChart r10 = this.barChart;
        if (r10 != null) goto L17;
        Intrinsics.XXO("barChart");
        r10 = null;
    L17:
        r10.getLegend().XOO0ii0(false);
        r10.getDescription().XOO0ii0(false);
        r10.setTouchEnabled(false);
        r10.setDrawValueAboveBar(false);
        YAxis r11 = r10.getAxisLeft();
        Context r12 = this.mContext;
        if (r12 != null) goto L20;
        Intrinsics.XXO("mContext");
        r12 = null;
    L20:
        r11.XXI(r19.iO(r12));
        BarChart r13 = this.barChart;
        if (r13 != null) goto L23;
        Intrinsics.XXO("barChart");
        r13 = null;
    L23:
        XAxis r14 = r13.getXAxis();
        Intrinsics.XXI(r14);
        Context r20 = this.mContext;
        if (r20 != null) goto L26;
        Intrinsics.XXO("mContext");
        r20 = null;
    L26:
        r19.OIi0(r14, true, r20);
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        r14.IXOIIIO(1.0f);
        r14.XOIX(7);
        r14.iOiXi11II(24.0f);
        SimpleDateFormat r110 = O0X11OiO.IXI(false, 1, null);
        ArrayList r21 = new ArrayList();
        int r22 = 0;
    L28:
        if (r22 >= 25) goto L33;
        long[] r23 = this.range;
        if (r23 != null) goto L32;
        Intrinsics.XXO("range");
        r23 = null;
    L32:
        String r24 = TimeUtils.millis2String(r23[0] + (((long) (r22 * 3600)) * 1000), r110);
        Intrinsics.O10IXXX0X(r24, "millis2String(...)");
        r21.add(r24);
        r22 = r22 + 1;
        goto L28
    L33:
        r14.Oi(new q4(r21));
        BarChart r25 = this.barChart;
        if (r25 != null) goto L36;
        Intrinsics.XXO("barChart");
        r25 = null;
    L36:
        BarChart r26 = this.barChart;
        if (r26 != null) goto L39;
        Intrinsics.XXO("barChart");
        r26 = null;
    L39:
        X1i1iOX r27 = r26.getAnimator();
        BarChart r28 = this.barChart;
        if (r28 != null) goto L42;
        Intrinsics.XXO("barChart");
        r28 = null;
    L42:
        Oi01X10i r111 = new Oi01X10i(r25, r27, r28.getViewPortHandler());
        Context r29 = this.mContext;
        if (r29 != null) goto L45;
        Intrinsics.XXO("mContext");
        r29 = null;
    L45:
        r111.iOOX010X(gk4.iO(r29, R.color.line_color));
        r111.II1Xi0(8);
        Context r30 = this.mContext;
        if (r30 != null) goto L48;
        Intrinsics.XXO("mContext");
        r30 = null;
    L48:
        r111.OII(gk4.iO(r30, R.color.bp_line_color));
        Context r31 = this.mContext;
        if (r31 != null) goto L51;
        Intrinsics.XXO("mContext");
        r31 = null;
    L51:
        int r32 = ContextCompat.getColor(r31, R.color.bp_secondary_color);
        Context r33 = this.mContext;
        if (r33 != null) goto L54;
        Intrinsics.XXO("mContext");
        r33 = null;
    L54:
        r111.I1(new int[]{r32, ContextCompat.getColor(r33, R.color.bp_color)});
        r111.iIiiO(3);
        BarChart r34 = this.barChart;
        if (r34 != null) goto L57;
        Intrinsics.XXO("barChart");
    L58:
        r4.setRenderer(r111);
        return;
    L57:
        r4 = r34;
        goto L58
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
        DINCondBold r2 = null;
        long[] r3 = null;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = r0;
        BloodPressureDao r1 = this.mBloodPressureDao;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r5 = r0[0];
        long[] r4 = this.range;
        if (r4 != null) goto L8;
        Intrinsics.XXO("range");
        r4 = null;
    L8:
        List<BloodPressure> r6 = r1.getBloodPressures(r5, r4[1]);
        if (r6.isEmpty() == false) goto L45;
        DINCondBold r7 = this.bpLastTime;
        if (r7 != null) goto L13;
        Intrinsics.XXO("bpLastTime");
        r7 = null;
    L13:
        r7.setText(R.string.data_none);
        DINCondBold r8 = this.sbp;
        if (r8 != null) goto L16;
        Intrinsics.XXO("sbp");
        r8 = null;
    L16:
        r8.setText(R.string.data_none);
        DINCondBold r9 = this.dbp;
        if (r9 != null) goto L19;
        Intrinsics.XXO("dbp");
        r9 = null;
    L19:
        r9.setText(R.string.data_none);
        BarChart r10 = this.barChart;
        if (r10 != null) goto L22;
        Intrinsics.XXO("barChart");
        r10 = null;
    L22:
        r10.setVisibility(8);
        DINCondBold r11 = this.noData;
        if (r11 != null) goto L25;
        Intrinsics.XXO("noData");
        r11 = null;
    L25:
        r11.setVisibility(0);
        if (i72.OXO1.XIIO11I() == false) goto L66;
        BarChart r12 = this.barChart;
        if (r12 != null) goto L30;
        Intrinsics.XXO("barChart");
        r12 = null;
    L30:
        r12.getXAxis().X00Xi1X(false);
        BarChart r13 = this.barChart;
        if (r13 != null) goto L33;
        Intrinsics.XXO("barChart");
        r13 = null;
    L33:
        r13.setVisibility(0);
        DINCondBold r14 = this.noData;
        if (r14 != null) goto L36;
        Intrinsics.XXO("noData");
        r14 = null;
    L36:
        r14.setVisibility(8);
        BloodPressureDao r15 = this.mBloodPressureDao;
        long[] r16 = this.range;
        if (r16 != null) goto L39;
        Intrinsics.XXO("range");
        r16 = null;
    L39:
        long r17 = r16[0];
        long[] r18 = this.range;
        if (r18 != null) goto L42;
        Intrinsics.XXO("range");
    L43:
        initChart(r15.getTestBloodPressures(r17, r3[1]));
        return;
    L42:
        r3 = r18;
        goto L43
    L66:
        return;
    L45:
        BarChart r19 = this.barChart;
        if (r19 != null) goto L48;
        Intrinsics.XXO("barChart");
        r19 = null;
    L48:
        r19.getXAxis().X00Xi1X(true);
        BarChart r20 = this.barChart;
        if (r20 != null) goto L51;
        Intrinsics.XXO("barChart");
        r20 = null;
    L51:
        r20.setVisibility(0);
        DINCondBold r21 = this.noData;
        if (r21 != null) goto L54;
        Intrinsics.XXO("noData");
        r21 = null;
    L54:
        r21.setVisibility(8);
        BloodPressure r22 = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r6);
        DINCondBold r23 = this.bpLastTime;
        if (r23 != null) goto L57;
        Intrinsics.XXO("bpLastTime");
        r23 = null;
    L57:
        r23.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(r22.getMTime())));
        DINCondBold r24 = this.sbp;
        if (r24 != null) goto L60;
        Intrinsics.XXO("sbp");
        r24 = null;
    L60:
        r24.setText(String.valueOf(r22.getMSystolic()));
        DINCondBold r25 = this.dbp;
        if (r25 != null) goto L63;
        Intrinsics.XXO("dbp");
    L64:
        r2.setText(String.valueOf(r22.getMDiastolic()));
        initChart(r6);
        return;
    L63:
        r2 = r25;
        goto L64
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_blood_pressure;
    }

    @sf5(tag = I01XX0.iO)
    public final void onBloodPressureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodPressureChanged"});
        initView();
    }
}
