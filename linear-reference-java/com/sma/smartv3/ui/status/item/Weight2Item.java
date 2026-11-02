package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AppUser;
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

    @aa1
    private final List<Entry> entries;
    private final boolean initEvent;
    private boolean isImperial;
    private LineChart lineChart;
    private Context mContext;

    @aa1
    private final WeightDao mWeightDao;
    private TextView weightLastTime;
    private TextView weightLastValue;
    private TextView weightUnit;

    public Weight2Item() {
        this.entries = new ArrayList();
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        this.initEvent = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showChartData(List<Weight> r7) {
        this.entries.clear();
        Iterator<T> r8 = r7.iterator();
        int r1 = 0;
    L4:
        if (r8.hasNext() == false) goto L6;
        this.entries.add(new Entry(r1, ((Weight) r8.next()).getMWeight()));
        r1 = r1 + 1;
        goto L4
    L6:
        LineChart r9 = this.lineChart;
        LineChart r2 = null;
        if (r9 != null) goto L9;
        Intrinsics.XXO("lineChart");
        r9 = null;
    L9:
        T r10 = ((co) r9.getData()).OIX0iXi(0);
        Intrinsics.X1ii(r10, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        ((LineDataSet) r10).IOX1(this.entries);
        LineChart r11 = this.lineChart;
        if (r11 != null) goto L12;
        Intrinsics.XXO("lineChart");
        r11 = null;
    L12:
        ((co) r11.getData()).iX();
        LineChart r12 = this.lineChart;
        if (r12 != null) goto L15;
        Intrinsics.XXO("lineChart");
    L16:
        r2.invalidate();
        return;
    L15:
        r2 = r12;
        goto L16
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r9) {
        Intrinsics.X0O(r9, "itemHolder");
        View r2 = r9.v(R.id.weightChart);
        Intrinsics.XXI(r2);
        this.lineChart = (LineChart) r2;
        View r3 = r9.v(R.id.weightLastTime);
        Intrinsics.XXI(r3);
        this.weightLastTime = (TextView) r3;
        View r4 = r9.v(R.id.weightLastValue);
        Intrinsics.XXI(r4);
        this.weightLastValue = (TextView) r4;
        View r5 = r9.v(R.id.weightUnit);
        Intrinsics.XXI(r5);
        this.weightUnit = (TextView) r5;
        View r6 = r9.v(R.id.bmi);
        Intrinsics.XXI(r6);
        this.bmiValue = (TextView) r6;
        View r7 = r9.v(R.id.empty_panel);
        Intrinsics.XXI(r7);
        this.emptyPanel = r7;
        LineChart r8 = null;
        if (r7 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r7 = null;
    L5:
        UtilsKt.IX1XiI(r7, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r10 = r9.v(R.id.data_panel);
        Intrinsics.XXI(r10);
        this.dataPanel = r10;
        LineChart r11 = this.lineChart;
        if (r11 != null) goto L8;
        Intrinsics.XXO("lineChart");
        r11 = null;
    L8:
        Context r12 = r11.getContext();
        Intrinsics.O10IXXX0X(r12, "getContext(...)");
        this.mContext = r12;
        LineChart r13 = this.lineChart;
        if (r13 != null) goto L11;
        Intrinsics.XXO("lineChart");
        r13 = null;
    L11:
        r13.i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        LineChart r14 = this.lineChart;
        if (r14 != null) goto L14;
        Intrinsics.XXO("lineChart");
        r14 = null;
    L14:
        r14.setTouchEnabled(false);
        r14.getDescription().XOO0ii0(false);
        r14.getLegend().XOO0ii0(false);
        YAxis r15 = r14.getAxisLeft();
        r15.Ii0X0X(false);
        r15.iOiXi11II(200.0f);
        r15.X00Xi1X(false);
        r15.XO0X10iO(false);
        r15.Ii0X0X(false);
        r15.i0X000X0O(30.0f);
        r15.iIi0(0.0f);
        YAxis r16 = r14.getAxisRight();
        r16.XOO0ii0(false);
        r16.i0X000X0O(30.0f);
        r16.iIi0(0.0f);
        r16.X00Xi1X(false);
        r16.Ii0X0X(false);
        XAxis r17 = r14.getXAxis();
        iO1Xi1X1i r18 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r17);
        LineChart r19 = this.lineChart;
        if (r19 != null) goto L17;
        Intrinsics.XXO("lineChart");
        r19 = null;
    L17:
        Context r20 = r19.getContext();
        Intrinsics.O10IXXX0X(r20, "getContext(...)");
        r18.OIi0(r17, true, r20);
        r17.i0X000X0O(-0.5f);
        r17.IXOIIIO(1.0f);
        r17.iOiXi11II(7.5f);
        r17.X00Xi1X(false);
        r17.Ii0X0X(false);
        LineDataSet r21 = new LineDataSet(this.entries, "Weight item Data");
        Context r22 = this.mContext;
        if (r22 != null) goto L20;
        Intrinsics.XXO("mContext");
        r22 = null;
    L20:
        r21.II1(ContextCompat.getColor(r22, R.color.weight_show_1));
        Context r23 = this.mContext;
        if (r23 != null) goto L23;
        Intrinsics.XXO("mContext");
        r23 = null;
    L23:
        r21.I00(ContextCompat.getColor(r23, R.color.weight_show_1));
        r21.I1XII0X(1.5f);
        r21.iXOII(3.5f);
        r21.XX00XX(2.0f);
        r21.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        Context r24 = this.mContext;
        if (r24 != null) goto L26;
        Intrinsics.XXO("mContext");
        r24 = null;
    L26:
        r21.IIX(ContextCompat.getColor(r24, R.color.weight_show_0));
        r21.IOI0i0I(true);
        r21.XXI(false);
        co r25 = new co(new IiXO1XOi[]{r21});
        r25.iI(false);
        LineChart r26 = this.lineChart;
        if (r26 != null) goto L29;
        Intrinsics.XXO("lineChart");
    L30:
        r8.setData(r25);
        return;
    L29:
        r8 = r26;
        goto L30
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
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
        TextView r16 = null;
        if (r9.isEmpty() == false) goto L33;
        TextView r17 = this.weightLastTime;
        if (r17 != null) goto L26;
        Intrinsics.XXO("weightLastTime");
        r17 = null;
    L26:
        r17.setText("");
        View r18 = this.emptyPanel;
        if (r18 != null) goto L29;
        Intrinsics.XXO("emptyPanel");
        r18 = null;
    L29:
        r18.setVisibility(0);
        View r19 = this.dataPanel;
        if (r19 != null) goto L32;
        Intrinsics.XXO("dataPanel");
        r19 = null;
    L32:
        r19.setVisibility(8);
    L59:
        TextView r20 = this.weightUnit;
        if (r20 != null) goto L62;
        Intrinsics.XXO("weightUnit");
    L63:
        r16.setText(cp5.iX(r4.getUnit()));
        showChartData(r9);
        return;
    L62:
        r16 = r20;
        goto L63
    L33:
        View r21 = this.emptyPanel;
        if (r21 != null) goto L36;
        Intrinsics.XXO("emptyPanel");
        r21 = null;
    L36:
        r21.setVisibility(8);
        View r22 = this.dataPanel;
        if (r22 != null) goto L39;
        Intrinsics.XXO("dataPanel");
        r22 = null;
    L39:
        r22.setVisibility(0);
        LineChart r23 = this.lineChart;
        if (r23 != null) goto L42;
        Intrinsics.XXO("lineChart");
        r23 = null;
    L42:
        r23.getXAxis().X00Xi1X(true);
        LineChart r24 = this.lineChart;
        if (r24 != null) goto L45;
        Intrinsics.XXO("lineChart");
        r24 = null;
    L45:
        r24.setVisibility(0);
        Weight r25 = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(r9);
        TextView r26 = this.weightLastTime;
        if (r26 != null) goto L48;
        Intrinsics.XXO("weightLastTime");
        r26 = null;
    L48:
        r26.setText(O0X11OiO.XXX11i().format(new Date(r25.getMTime())));
        TextView r27 = this.weightLastValue;
        if (r27 != null) goto L52;
        Intrinsics.XXO("weightLastValue");
        r27 = null;
    L52:
        if (this.isImperial == false) goto L54;
        float r28 = l76.iO(r25.getMWeight());
    L55:
        r27.setText(String.valueOf(cp5.OIX0iXi(r28)));
        TextView r29 = this.bmiValue;
        if (r29 != null) goto L58;
        Intrinsics.XXO("bmiValue");
        r29 = null;
    L58:
        r29.setText(cp5.I0IIOi(r25.getMWeight(), r4.getHeight()));
        goto L59
    L54:
        r28 = r25.getMWeight();
        goto L55
    L9:
        r5 = false;
        goto L10
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_weight;
    }

    @sf5(tag = I01XX0.IiI10X)
    public final void onWeightChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onWeightChanged"});
        initView();
    }
}
