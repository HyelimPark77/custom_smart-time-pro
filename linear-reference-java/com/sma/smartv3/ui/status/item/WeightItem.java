package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.q4;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AppUser;
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

    @aa1
    private final List<Entry> entries;
    private final boolean initEvent;
    private boolean isImperial;
    public LineChart lineChart;
    public Context mContext;

    @aa1
    private final WeightDao mWeightDao;
    private DINCondBold noData;
    private DINCondBold weightLastTime;
    private DINCondBold weightLastValue;
    private PFRegular weightUnit;

    public WeightItem() {
        this.entries = new ArrayList();
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        this.initEvent = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initChart(List<Weight> r8) {
        this.entries.clear();
        Iterator<T> r0 = r8.iterator();
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        this.entries.add(new Entry(r2, ((Weight) r0.next()).getMWeight()));
        r2 = r2 + 1;
        goto L4
    L6:
        setXAxis(r8);
        T r9 = ((co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        ((LineDataSet) r9).IOX1(this.entries);
        ((co) getLineChart().getData()).iX();
        getLineChart().invalidate();
    }

    private final void setXAxis(List<Weight> r7) {
        XAxis r0 = getLineChart().getXAxis();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        SimpleDateFormat r1 = O0X11OiO.XXX11i();
        ArrayList r2 = new ArrayList();
        Iterator<Weight> r3 = r7.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        String r4 = TimeUtils.millis2String(r3.next().getMTime(), r1);
        Intrinsics.O10IXXX0X(r4, "millis2String(...)");
        r2.add(r4);
        goto L4
    L6:
        r0.Oi(new q4(r2));
        r0.i0X000X0O(0.0f);
        r0.IXOIIIO(1.0f);
        r0.iOiXi11II(r7.size());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r6) {
        Intrinsics.X0O(r6, "itemHolder");
        View r0 = r6.v(R.id.weightChart);
        Intrinsics.XXI(r0);
        setLineChart((LineChart) r0);
        View r1 = r6.v(R.id.weightLastTime);
        Intrinsics.XXI(r1);
        this.weightLastTime = (DINCondBold) r1;
        View r2 = r6.v(R.id.weightLastValue);
        Intrinsics.XXI(r2);
        this.weightLastValue = (DINCondBold) r2;
        View r3 = r6.v(R.id.weightUnit);
        Intrinsics.XXI(r3);
        this.weightUnit = (PFRegular) r3;
        View r4 = r6.v(R.id.bmi);
        Intrinsics.XXI(r4);
        this.bmiValue = (PFRegular) r4;
        View r7 = r6.v(R.id.noData);
        Intrinsics.XXI(r7);
        this.noData = (DINCondBold) r7;
        Context r8 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r8, "getContext(...)");
        setMContext(r8);
        iO1Xi1X1i r9 = iO1Xi1X1i.OXO1;
        r9.XIi00iiXO(getLineChart());
        YAxis r5 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r5, "getAxisLeft(...)");
        YAxis r10 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r10, "getAxisRight(...)");
        r9.IO(r5, r10, 200.0f, 30.0f);
        XAxis r11 = getLineChart().getXAxis();
        Intrinsics.O10IXXX0X(r11, "getXAxis(...)");
        Context r12 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r12, "getContext(...)");
        r9.OIi0(r11, true, r12);
        LineChart r13 = getLineChart();
        r13.setTouchEnabled(false);
        r13.getDescription().XOO0ii0(false);
        r13.getLegend().XOO0ii0(false);
        r13.getAxisLeft().XXI(r9.iO(getMContext()));
        LineDataSet r14 = new LineDataSet(this.entries, "Weight item Data");
        r14.II1(ContextCompat.getColor(getMContext(), R.color.weight_show_1));
        r14.I00(ContextCompat.getColor(getMContext(), R.color.weight_show_1));
        r14.I1XII0X(1.5f);
        r14.iXOII(3.5f);
        r14.XX00XX(2.0f);
        r14.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        r14.IIX(ContextCompat.getColor(getMContext(), R.color.weight_show_0));
        r14.IOI0i0I(true);
        r14.XXI(false);
        co r15 = new co(new IiXO1XOi[]{r14});
        r15.iI(false);
        getLineChart().setData(r15);
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

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        AppUser r4 = (AppUser) r2;
        if (r4.getUnit() != 1) goto L9;
        boolean r5 = true;
    L10:
        this.isImperial = r5;
        Calendar r6 = Calendar.getInstance();
        Intrinsics.XXI(r6);
        OIi1iX.XX0(r6, 0);
        OIi1iX.I1(r6, 0);
        OIi1iX.OiIIX101O(r6, 0);
        OIi1iX.iIiiO(r6, 0);
        r6.setMinimalDaysInFirstWeek(7);
        OIi1iX.XiOIO(r6, r6.getFirstDayOfWeek());
        Intrinsics.O10IXXX0X(r6, "apply(...)");
        long[] r7 = O0X11OiO.I1(r6, TimePeriod.WEEK, 0);
        List<Weight> r8 = this.mWeightDao.getWeightsASC(r7[0], r7[1]);
        ArrayList r9 = new ArrayList();
        LinkedHashMap r10 = new LinkedHashMap();
        Iterator<T> r11 = r8.iterator();
    L12:
        if (r11.hasNext() == false) goto L17;
        Object r12 = r11.next();
        String r13 = O0X11OiO.iiIOiX().format(Long.valueOf(((Weight) r12).getMTime()));
        Object r14 = r10.get(r13);
        if (r14 != null) goto L16;
        r14 = new ArrayList();
        r10.put(r13, r14);
    L16:
        ((List) r14).add(r12);
        goto L12
    L17:
        Iterator r15 = r10.entrySet().iterator();
    L19:
        if (r15.hasNext() == false) goto L21;
        r9.addAll(CollectionsKt___CollectionsKt.IiII0((List) ((Map.Entry) r15.next()).getValue(), 1));
        goto L19
    L21:
        PFRegular r16 = null;
        if (r9.isEmpty() == false) goto L41;
        DINCondBold r17 = this.weightLastTime;
        if (r17 != null) goto L26;
        Intrinsics.XXO("weightLastTime");
        r17 = null;
    L26:
        r17.setText(R.string.data_none);
        DINCondBold r18 = this.weightLastValue;
        if (r18 != null) goto L29;
        Intrinsics.XXO("weightLastValue");
        r18 = null;
    L29:
        r18.setText(R.string.data_none);
        PFRegular r19 = this.bmiValue;
        if (r19 != null) goto L32;
        Intrinsics.XXO("bmiValue");
        r19 = null;
    L32:
        r19.setText(R.string.data_none);
        getLineChart().setVisibility(8);
        DINCondBold r20 = this.noData;
        if (r20 != null) goto L35;
        Intrinsics.XXO("noData");
        r20 = null;
    L35:
        r20.setVisibility(0);
        if (i72.OXO1.XIIO11I() == false) goto L65;
        getLineChart().getXAxis().X00Xi1X(false);
        getLineChart().setVisibility(0);
        DINCondBold r21 = this.noData;
        if (r21 != null) goto L40;
        Intrinsics.XXO("noData");
        r21 = null;
    L40:
        r21.setVisibility(8);
        initChart(this.mWeightDao.getTestWeights(r7[0], r7[1]));
    L65:
        PFRegular r22 = this.weightUnit;
        if (r22 != null) goto L68;
        Intrinsics.XXO("weightUnit");
    L69:
        r16.setText(cp5.iX(r4.getUnit()));
        return;
    L68:
        r16 = r22;
        goto L69
    L41:
        getLineChart().getXAxis().X00Xi1X(true);
        getLineChart().setVisibility(0);
        DINCondBold r23 = this.noData;
        if (r23 != null) goto L44;
        Intrinsics.XXO("noData");
        r23 = null;
    L44:
        r23.setVisibility(8);
        Weight r24 = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(r9);
        if (Intrinsics.XOO0ii0(TimeUtils.millis2String(r24.getMTime(), O0X11OiO.XO0O10()), r24.getMLocalTime()) == false) goto L50;
        DINCondBold r25 = this.weightLastTime;
        if (r25 != null) goto L49;
        Intrinsics.XXO("weightLastTime");
        r25 = null;
    L49:
        r25.setText(TimeUtils.millis2String(r24.getMTime(), O0X11OiO.X0i1O(null, 1, null)));
    L54:
        DINCondBold r26 = this.weightLastValue;
        if (r26 != null) goto L58;
        Intrinsics.XXO("weightLastValue");
        r26 = null;
    L58:
        if (this.isImperial == false) goto L60;
        float r27 = l76.iO(r24.getMWeight());
    L61:
        r26.setText(cp5.iX1O1(r27, true));
        PFRegular r28 = this.bmiValue;
        if (r28 != null) goto L64;
        Intrinsics.XXO("bmiValue");
        r28 = null;
    L64:
        r28.setText(cp5.I0IIOi(r24.getMWeight(), r4.getHeight()));
        initChart(r9);
        goto L65
    L60:
        r27 = r24.getMWeight();
        goto L61
    L50:
        DINCondBold r29 = this.weightLastTime;
        if (r29 != null) goto L53;
        Intrinsics.XXO("weightLastTime");
        r29 = null;
    L53:
        r29.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(TimeUtils.string2Millis(r24.getMLocalTime(), "yyyy/MM/dd HH:mm:ss"))));
        goto L54
    L9:
        r5 = false;
        goto L10
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_weight;
    }

    @sf5(tag = I01XX0.IiI10X)
    public final void onWeightChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onWeightChanged"});
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
