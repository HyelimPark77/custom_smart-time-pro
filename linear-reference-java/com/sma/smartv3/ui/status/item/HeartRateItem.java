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
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.model.HRMinuteData;
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
public class HeartRateItem extends BaseDslItem {

    @aa1
    private final LinkedHashMap<Long, HRMinuteData> filterData;
    private final boolean initEvent;
    public LineChart lineChart;
    public Context mContext;

    @aa1
    private final HeartRateDao mHeartRateDao;
    private DINCondBold noData;
    private long[] range;
    private DINCondBold tvBpm;
    private DINCondBold tvTime;

    public HeartRateItem() {
        this.mHeartRateDao = MyDb.INSTANCE.getMDatabase().heartRateDao();
        this.filterData = new LinkedHashMap();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r13) {
        Intrinsics.X0O(r13, "itemHolder");
        View r0 = r13.v(R.id.hrLineChart);
        Intrinsics.XXI(r0);
        setLineChart((LineChart) r0);
        View r1 = r13.v(R.id.hrLastTime);
        Intrinsics.XXI(r1);
        this.tvTime = (DINCondBold) r1;
        View r2 = r13.v(R.id.hrLastValue);
        Intrinsics.XXI(r2);
        this.tvBpm = (DINCondBold) r2;
        View r14 = r13.v(R.id.noData);
        Intrinsics.XXI(r14);
        this.noData = (DINCondBold) r14;
        Context r15 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r15, "getContext(...)");
        setMContext(r15);
        iO1Xi1X1i r16 = iO1Xi1X1i.OXO1;
        r16.XIi00iiXO(getLineChart());
        YAxis r3 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r3, "getAxisLeft(...)");
        YAxis r4 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r4, "getAxisRight(...)");
        r16.IO(r3, r4, 200.0f, 30.0f);
        LineChart r5 = getLineChart();
        r5.setTouchEnabled(false);
        r5.getDescription().XOO0ii0(false);
        r5.getLegend().XOO0ii0(false);
        r5.getAxisLeft().XXI(r16.iO(getMContext()));
        XAxis r6 = getLineChart().getXAxis();
        Intrinsics.XXI(r6);
        Context r7 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r7, "getContext(...)");
        r16.OIi0(r6, true, r7);
        int r17 = O0X11OiO.XIi00iiXO();
        this.range = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        r6.i0X000X0O(0.0f);
        float r8 = r17;
        r6.IXOIIIO(r8 / 6);
        r6.iOiXi11II(r8);
        SimpleDateFormat r9 = O0X11OiO.IXI(false, 1, null);
        ArrayList r10 = new ArrayList();
        if (r17 < 0) goto L11;
        int r11 = 0;
    L5:
        long[] r12 = this.range;
        if (r12 != null) goto L8;
        Intrinsics.XXO("range");
        r12 = null;
    L8:
        String r18 = TimeUtils.millis2String(r12[0] + ((long) (60000 * r11)), r9);
        Intrinsics.O10IXXX0X(r18, "millis2String(...)");
        r10.add(r18);
        if (r11 == r17) goto L11;
        r11 = r11 + 1;
    L11:
        r6.Oi(new q4(r10));
        LineDataSet r19 = new LineDataSet(null, "");
        r19.II1(ContextCompat.getColor(getMContext(), R.color.hr_color));
        r19.I00(ContextCompat.getColor(getMContext(), R.color.hr_color));
        r19.I1XII0X(2.0f);
        r19.iXOII(1.0f);
        r19.I0i1OXiI(ContextCompat.getDrawable(getMContext(), R.drawable.shape_hr));
        r19.IOI0i0I(false);
        r19.XXI(false);
        r19.O1iXiI(true);
        co r20 = new co(new IiXO1XOi[]{r19});
        r20.iI(false);
        getLineChart().setData(r20);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final LineChart getLineChart() {
        LineChart r0 = this.lineChart;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("lineChart");
        return null;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void initChart(@aa1 List<HeartRate> r11) {
        Intrinsics.X0O(r11, "list");
        this.filterData.clear();
        long[] r0 = this.range;
        long[] r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r4 = r0[0];
        long[] r2 = this.range;
        if (r2 != null) goto L8;
        Intrinsics.XXO("range");
    L9:
        long r3 = ProgressionUtilKt.XO0O10(r4, r1[1], 60000);
        if (r4 > r3) goto L14;
    L11:
        this.filterData.put(Long.valueOf(r4), new HRMinuteData(0, 0));
        if (r4 == r3) goto L14;
        r4 = r4 + 60000;
    L14:
        ArrayList r5 = new ArrayList();
        Iterator<HeartRate> r12 = r11.iterator();
    L16:
        if (r12.hasNext() == false) goto L23;
        HeartRate r6 = r12.next();
        Iterator<Map.Entry<Long, HRMinuteData>> r7 = this.filterData.entrySet().iterator();
    L19:
        if (r7.hasNext() == false) goto L16;
        Map.Entry<Long, HRMinuteData> r8 = r7.next();
        long r9 = r8.getKey().longValue();
        HRMinuteData r10 = r8.getValue();
        if (r6.getMTime() >= r9) goto L19;
        r10.setTotal(r10.getTotal() + r6.getMBpm());
        r10.setNum(r10.getNum() + 1);
        goto L16
    L23:
        Iterator<Map.Entry<Long, HRMinuteData>> r13 = this.filterData.entrySet().iterator();
        float r14 = 0.0f;
    L25:
        if (r13.hasNext() == false) goto L32;
        HRMinuteData r15 = r13.next().getValue();
        if (r15.getNum() == 0) goto L31;
        if (r15.getTotal() == 0) goto L31;
        r5.add(new Entry(r14, r15.getTotal() / r15.getNum()));
    L31:
        r14 = r14 + 1.0f;
        goto L25
    L32:
        Object r16 = ((co) getLineChart().getData()).I1XOi1().get(0);
        Intrinsics.X1ii(r16, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List<T> r17 = ((LineDataSet) r16).i0O();
        r17.clear();
        r17.addAll(r5);
        getLineChart().invalidate();
        return;
    L8:
        r1 = r2;
        goto L9
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
        HeartRateDao r1 = this.mHeartRateDao;
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
        List<HeartRate> r6 = r1.getHeartRates(r5, r4[1]);
        if (r6.isEmpty() == false) goto L33;
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
        getLineChart().setVisibility(8);
        DINCondBold r9 = this.noData;
        if (r9 != null) goto L19;
        Intrinsics.XXO("noData");
        r9 = null;
    L19:
        r9.setVisibility(0);
        if (i72.OXO1.XIIO11I() == false) goto L45;
        getLineChart().getXAxis().X00Xi1X(false);
        getLineChart().setVisibility(0);
        DINCondBold r10 = this.noData;
        if (r10 != null) goto L24;
        Intrinsics.XXO("noData");
        r10 = null;
    L24:
        r10.setVisibility(8);
        HeartRateDao r11 = this.mHeartRateDao;
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
        initChart(r11.getTestHeartRates(r13, r3[1]));
        return;
    L30:
        r3 = r14;
        goto L31
    L45:
        return;
    L33:
        getLineChart().getXAxis().X00Xi1X(true);
        getLineChart().setVisibility(0);
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
        r16.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(((HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMTime())));
        DINCondBold r17 = this.tvBpm;
        if (r17 != null) goto L42;
        Intrinsics.XXO("tvBpm");
    L43:
        r2.setText(String.valueOf(((HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMBpm()));
        initChart(r6);
        return;
    L42:
        r2 = r17;
        goto L43
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_heart_rate;
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onHeartRateChanged"});
        initView();
    }

    public final void setLineChart(@aa1 LineChart r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lineChart = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
