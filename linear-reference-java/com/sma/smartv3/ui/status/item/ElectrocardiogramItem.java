package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ElectrocardiogramDao;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.model.ECGMinuteData;
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

    @aa1
    private final LinkedHashMap<Long, ECGMinuteData> filterData;
    private final boolean initEvent;
    private LineChart lineChart;
    private Context mContext;

    @aa1
    private final ElectrocardiogramDao mElectrocardiogramDao;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold tvBpm;
    private DINCondBold tvTime;

    public ElectrocardiogramItem() {
        this.mElectrocardiogramDao = MyDb.INSTANCE.getMDatabase().electrocardiogramDao();
        this.filterData = new LinkedHashMap();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r15) {
        Intrinsics.X0O(r15, "itemHolder");
        View r2 = r15.v(R.id.hrLineChart);
        Intrinsics.XXI(r2);
        this.lineChart = (LineChart) r2;
        View r3 = r15.v(R.id.hrLastTime);
        Intrinsics.XXI(r3);
        this.tvTime = (DINCondBold) r3;
        View r4 = r15.v(R.id.hrLastValue);
        Intrinsics.XXI(r4);
        this.tvBpm = (DINCondBold) r4;
        View r16 = r15.v(R.id.noData);
        Intrinsics.XXI(r16);
        this.noData = (DINCondBold) r16;
        LineChart r17 = this.lineChart;
        LineChart r5 = null;
        if (r17 != null) goto L5;
        Intrinsics.XXO("lineChart");
        r17 = null;
    L5:
        Context r18 = r17.getContext();
        Intrinsics.O10IXXX0X(r18, "getContext(...)");
        this.mContext = r18;
        iO1Xi1X1i r19 = iO1Xi1X1i.OXO1;
        LineChart r6 = this.lineChart;
        if (r6 != null) goto L8;
        Intrinsics.XXO("lineChart");
        r6 = null;
    L8:
        r19.XIi00iiXO(r6);
        LineChart r7 = this.lineChart;
        if (r7 != null) goto L11;
        Intrinsics.XXO("lineChart");
        r7 = null;
    L11:
        YAxis r8 = r7.getAxisLeft();
        Intrinsics.O10IXXX0X(r8, "getAxisLeft(...)");
        LineChart r9 = this.lineChart;
        if (r9 != null) goto L14;
        Intrinsics.XXO("lineChart");
        r9 = null;
    L14:
        YAxis r10 = r9.getAxisRight();
        Intrinsics.O10IXXX0X(r10, "getAxisRight(...)");
        r19.IO(r8, r10, 200.0f, 30.0f);
        LineChart r11 = this.lineChart;
        if (r11 != null) goto L17;
        Intrinsics.XXO("lineChart");
        r11 = null;
    L17:
        r11.setTouchEnabled(false);
        r11.getDescription().XOO0ii0(false);
        r11.getLegend().XOO0ii0(false);
        YAxis r12 = r11.getAxisLeft();
        Context r13 = this.mContext;
        if (r13 != null) goto L20;
        Intrinsics.XXO("mContext");
        r13 = null;
    L20:
        r12.XXI(r19.iO(r13));
        LineChart r14 = this.lineChart;
        if (r14 != null) goto L23;
        Intrinsics.XXO("lineChart");
        r14 = null;
    L23:
        XAxis r20 = r14.getXAxis();
        Intrinsics.XXI(r20);
        LineChart r21 = this.lineChart;
        if (r21 != null) goto L26;
        Intrinsics.XXO("lineChart");
        r21 = null;
    L26:
        Context r22 = r21.getContext();
        Intrinsics.O10IXXX0X(r22, "getContext(...)");
        r19.OIi0(r20, true, r22);
        int r110 = O0X11OiO.XIi00iiXO();
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        r20.i0X000X0O(0.0f);
        float r23 = r110;
        r20.IXOIIIO(r23 / 6);
        r20.iOiXi11II(r23);
        SimpleDateFormat r24 = O0X11OiO.IXI(false, 1, null);
        ArrayList r25 = new ArrayList();
        if (r110 < 0) goto L35;
        int r26 = 0;
    L29:
        long[] r27 = this.range;
        if (r27 != null) goto L32;
        Intrinsics.XXO("range");
        r27 = null;
    L32:
        String r28 = TimeUtils.millis2String(r27[0] + ((long) (60000 * r26)), r24);
        Intrinsics.O10IXXX0X(r28, "millis2String(...)");
        r25.add(r28);
        if (r26 == r110) goto L35;
        r26 = r26 + 1;
    L35:
        r20.Oi(new q4(r25));
        LineDataSet r111 = new LineDataSet(null, "");
        Context r29 = this.mContext;
        if (r29 != null) goto L38;
        Intrinsics.XXO("mContext");
        r29 = null;
    L38:
        r111.II1(ContextCompat.getColor(r29, R.color.hr_color));
        Context r30 = this.mContext;
        if (r30 != null) goto L41;
        Intrinsics.XXO("mContext");
        r30 = null;
    L41:
        r111.I00(ContextCompat.getColor(r30, R.color.hr_color));
        r111.I1XII0X(2.0f);
        r111.iXOII(1.0f);
        Context r31 = this.mContext;
        if (r31 != null) goto L44;
        Intrinsics.XXO("mContext");
        r31 = null;
    L44:
        r111.I0i1OXiI(ContextCompat.getDrawable(r31, R.drawable.shape_hr));
        r111.IOI0i0I(false);
        r111.XXI(false);
        r111.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        r111.O1iXiI(true);
        co r32 = new co(new IiXO1XOi[]{r111});
        r32.iI(false);
        LineChart r112 = this.lineChart;
        if (r112 != null) goto L47;
        Intrinsics.XXO("lineChart");
    L48:
        r5.setData(r32);
        return;
    L47:
        r5 = r112;
        goto L48
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initChart(@aa1 List<Electrocardiogram> r12) {
        Intrinsics.X0O(r12, "list");
        this.filterData.clear();
        long[] r0 = this.range;
        LineChart r2 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r4 = r0[0];
        long[] r1 = this.range;
        if (r1 != null) goto L8;
        Intrinsics.XXO("range");
        r1 = null;
    L8:
        long r6 = ProgressionUtilKt.XO0O10(r4, r1[1], 60000);
        if (r4 > r6) goto L13;
    L10:
        this.filterData.put(Long.valueOf(r4), new ECGMinuteData(0, 0));
        if (r4 == r6) goto L13;
        r4 = r4 + 60000;
    L13:
        ArrayList r3 = new ArrayList();
        Iterator<Electrocardiogram> r13 = r12.iterator();
    L15:
        if (r13.hasNext() == false) goto L22;
        Electrocardiogram r5 = r13.next();
        Iterator<Map.Entry<Long, ECGMinuteData>> r7 = this.filterData.entrySet().iterator();
    L18:
        if (r7.hasNext() == false) goto L15;
        Map.Entry<Long, ECGMinuteData> r8 = r7.next();
        long r9 = r8.getKey().longValue();
        ECGMinuteData r10 = r8.getValue();
        if (r5.getMTime() >= r9) goto L18;
        r10.setTotal(r10.getTotal() + r5.getMValue());
        r10.setNum(r10.getNum() + 1);
        goto L15
    L22:
        Iterator<Map.Entry<Long, ECGMinuteData>> r14 = this.filterData.entrySet().iterator();
        float r11 = 0.0f;
    L24:
        if (r14.hasNext() == false) goto L31;
        ECGMinuteData r15 = r14.next().getValue();
        if (r15.getNum() == 0) goto L30;
        if (r15.getTotal() == 0) goto L30;
        r3.add(new Entry(r11, r15.getTotal() / r15.getNum()));
    L30:
        r11 = r11 + 1.0f;
        goto L24
    L31:
        LineChart r16 = this.lineChart;
        if (r16 != null) goto L34;
        Intrinsics.XXO("lineChart");
        r16 = null;
    L34:
        Object r17 = ((co) r16.getData()).I1XOi1().get(0);
        Intrinsics.X1ii(r17, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List<T> r18 = ((LineDataSet) r17).i0O();
        r18.clear();
        r18.addAll(r3);
        LineChart r19 = this.lineChart;
        if (r19 != null) goto L37;
        Intrinsics.XXO("lineChart");
    L38:
        r2.invalidate();
        return;
    L37:
        r2 = r19;
        goto L38
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
        DINCondBold r2 = null;
        long[] r3 = null;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = r0;
        ElectrocardiogramDao r1 = this.mElectrocardiogramDao;
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
        List<Electrocardiogram> r6 = r1.getElectrocardiograms(r5, r4[1]);
        if (r6.isEmpty() == false) goto L42;
        DINCondBold r7 = this.tvTime;
        if (r7 != null) goto L13;
        Intrinsics.XXO("tvTime");
        r7 = null;
    L13:
        r7.setText(R.string.data_none);
        DINCondBold r8 = this.tvBpm;
        if (r8 != null) goto L16;
        Intrinsics.XXO("tvBpm");
        r8 = null;
    L16:
        r8.setText(R.string.data_none);
        LineChart r9 = this.lineChart;
        if (r9 != null) goto L19;
        Intrinsics.XXO("lineChart");
        r9 = null;
    L19:
        r9.setVisibility(8);
        DINCondBold r10 = this.noData;
        if (r10 != null) goto L22;
        Intrinsics.XXO("noData");
        r10 = null;
    L22:
        r10.setVisibility(0);
        if (i72.OXO1.XIIO11I() == false) goto L60;
        LineChart r11 = this.lineChart;
        if (r11 != null) goto L27;
        Intrinsics.XXO("lineChart");
        r11 = null;
    L27:
        r11.getXAxis().X00Xi1X(false);
        LineChart r12 = this.lineChart;
        if (r12 != null) goto L30;
        Intrinsics.XXO("lineChart");
        r12 = null;
    L30:
        r12.setVisibility(0);
        DINCondBold r13 = this.noData;
        if (r13 != null) goto L33;
        Intrinsics.XXO("noData");
        r13 = null;
    L33:
        r13.setVisibility(8);
        ElectrocardiogramDao r14 = this.mElectrocardiogramDao;
        long[] r15 = this.range;
        if (r15 != null) goto L36;
        Intrinsics.XXO("range");
        r15 = null;
    L36:
        long r16 = r15[0];
        long[] r17 = this.range;
        if (r17 != null) goto L39;
        Intrinsics.XXO("range");
    L40:
        initChart(r14.getTestElectrocardiograms(r16, r3[1]));
        return;
    L39:
        r3 = r17;
        goto L40
    L60:
        return;
    L42:
        LineChart r18 = this.lineChart;
        if (r18 != null) goto L45;
        Intrinsics.XXO("lineChart");
        r18 = null;
    L45:
        r18.getXAxis().X00Xi1X(true);
        LineChart r19 = this.lineChart;
        if (r19 != null) goto L48;
        Intrinsics.XXO("lineChart");
        r19 = null;
    L48:
        r19.setVisibility(0);
        DINCondBold r20 = this.noData;
        if (r20 != null) goto L51;
        Intrinsics.XXO("noData");
        r20 = null;
    L51:
        r20.setVisibility(8);
        DINCondBold r21 = this.tvTime;
        if (r21 != null) goto L54;
        Intrinsics.XXO("tvTime");
        r21 = null;
    L54:
        r21.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(((Electrocardiogram) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMTime())));
        DINCondBold r22 = this.tvBpm;
        if (r22 != null) goto L57;
        Intrinsics.XXO("tvBpm");
    L58:
        r2.setText(String.valueOf(((Electrocardiogram) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMValue()));
        initChart(r6);
        return;
    L57:
        r2 = r22;
        goto L58
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_electrocardiogram;
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onHeartRateChanged"});
        initView();
    }
}
