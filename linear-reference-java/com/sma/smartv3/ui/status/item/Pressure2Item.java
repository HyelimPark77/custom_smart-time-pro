package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
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
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
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
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Pressure2Item extends BaseDslItem {
    private BarChart barChart;
    private View dataPanel;
    private View emptyPanel;

    @aa1
    private final LinkedHashMap<Long, ArrayList<Pressure>> filterData;
    private final boolean initEvent;
    private final int intervalTime;
    private Context mContext;

    @aa1
    private final PressureDao mPressureDao;
    private final int maxHour;
    private long[] range;
    private TextView tvChartBottomText;
    private TextView tvTime;
    private TextView tvValue;

    @aa1
    private final List<BarEntry> values;

    public Pressure2Item() {
        this.mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();
        this.filterData = new LinkedHashMap();
        this.values = new ArrayList();
        this.maxHour = 8;
        this.intervalTime = TimeConstants.HOUR;
        this.initEvent = true;
    }

    private final void showChartData(List<Pressure> r17) {
        this.filterData.clear();
        int r1 = this.maxHour;
        if (1 > r1) goto L11;
        int r5 = 1;
    L5:
        LinkedHashMap<Long, ArrayList<Pressure>> r6 = this.filterData;
        long[] r7 = this.range;
        if (r7 != null) goto L8;
        Intrinsics.XXO("range");
        r7 = null;
    L8:
        r6.put(Long.valueOf(r7[0] + ((long) (this.intervalTime * r5))), new ArrayList());
        if (r5 == r1) goto L11;
        r5 = r5 + 1;
    L11:
        Iterator<Pressure> r2 = r17.iterator();
    L13:
        if (r2.hasNext() == false) goto L20;
        Pressure r8 = r2.next();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r9 = this.filterData.entrySet().iterator();
    L16:
        if (r9.hasNext() == false) goto L13;
        Map.Entry<Long, ArrayList<Pressure>> r10 = r9.next();
        long r11 = r10.getKey().longValue();
        ArrayList<Pressure> r12 = r10.getValue();
        if (r8.getMTime() > r11) goto L16;
        r12.add(r8);
        goto L13
    L20:
        ArrayList r3 = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Pressure>>> r13 = this.filterData.entrySet().iterator();
    L22:
        if (r13.hasNext() == false) goto L39;
        ArrayList<Pressure> r14 = r13.next().getValue();
        PressureDayData r15 = new PressureDayData(0, 0, 0, null, 15, null);
        if (r14.size() == 0) goto L38;
        Iterator<Pressure> r16 = r14.iterator();
        Intrinsics.O10IXXX0X(r16, "iterator(...)");
        int r18 = 0;
    L27:
        if (r16.hasNext() == false) goto L37;
        Pressure r19 = r16.next();
        Intrinsics.O10IXXX0X(r19, "next(...)");
        Pressure r110 = r19;
        if (r15.getMin() != 0) goto L31;
    L32:
        r15.setMin(r110.getMValue());
    L34:
        if (r15.getMax() >= r110.getMValue()) goto L36;
        r15.setMax(r110.getMValue());
    L36:
        r18 = r18 + r110.getMValue();
        goto L27
    L31:
        if (r15.getMin() <= r110.getMValue()) goto L34;
    L37:
        r15.setAvg(r18 / r14.size());
    L38:
        r3.add(r15);
        goto L22
    L39:
        Iterator r4 = r3.iterator();
        int r20 = 0;
        int r21 = 0;
        float r22 = 0.0f;
    L41:
        if (r4.hasNext() == false) goto L57;
        PressureDayData r23 = (PressureDayData) r4.next();
        float r111 = r23.getMin();
        float r112 = r23.getMax();
        float r113 = r23.getAvg();
        List<BarEntry> r114 = this.values;
        float[] r115 = {0.0f, r113};
        Context r116 = this.mContext;
        if (r116 != null) goto L45;
        Intrinsics.XXO("mContext");
        r116 = null;
    L45:
        r114.add(new BarEntry(r22, r115, PressureDataKt.getBarColors(r116, r23.getAvg())));
        if (r20 >= r112) goto L48;
        r20 = (int) r112;
    L48:
        if (r21 != 0) goto L51;
        r21 = r23.getAvg();
    L51:
        if (r111 == 0.0f) goto L56;
        if (r21 <= r111) goto L56;
        r21 = (int) r111;
    L56:
        r23.getAvg();
        r22 = r22 + 1.0f;
        goto L41
    L57:
        updateData(this.values);
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
        XXX1X11 r5 = new XXX1X11(r7, "");
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
    public void bindView(@aa1 DslViewHolder r9) {
        Intrinsics.X0O(r9, "itemHolder");
        this.range = O0X11OiO.OiIIX101O(this.maxHour);
        View r0 = r9.v(R.id.pressureBarChart);
        Intrinsics.XXI(r0);
        this.barChart = (BarChart) r0;
        View r1 = r9.v(R.id.pressureLastTime);
        Intrinsics.XXI(r1);
        this.tvTime = (TextView) r1;
        View r2 = r9.v(R.id.pressureLastValue);
        Intrinsics.XXI(r2);
        this.tvValue = (TextView) r2;
        BarChart r3 = this.barChart;
        BarChart r4 = null;
        if (r3 != null) goto L5;
        Intrinsics.XXO("barChart");
        r3 = null;
    L5:
        Context r5 = r3.getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        this.mContext = r5;
        View r6 = r9.v(R.id.tv_chart_bottom_text);
        Intrinsics.XXI(r6);
        TextView r7 = (TextView) r6;
        this.tvChartBottomText = r7;
        if (r7 != null) goto L8;
        Intrinsics.XXO("tvChartBottomText");
        r7 = null;
    L8:
        Context r8 = this.mContext;
        if (r8 != null) goto L11;
        Intrinsics.XXO("mContext");
        r8 = null;
    L11:
        r7.setText(r8.getString(R.string.last_few_hours, new Object[]{Integer.valueOf(this.maxHour)}));
        View r10 = r9.v(R.id.empty_panel);
        Intrinsics.XXI(r10);
        this.emptyPanel = r10;
        if (r10 != null) goto L14;
        Intrinsics.XXO("emptyPanel");
        r10 = null;
    L14:
        UtilsKt.IX1XiI(r10, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r11 = r9.v(R.id.data_panel);
        Intrinsics.XXI(r11);
        this.dataPanel = r11;
        BarChart r12 = this.barChart;
        if (r12 != null) goto L17;
        Intrinsics.XXO("barChart");
        r12 = null;
    L17:
        r12.i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        BarChart r13 = this.barChart;
        if (r13 != null) goto L20;
        Intrinsics.XXO("barChart");
        r13 = null;
    L20:
        r13.setTouchEnabled(false);
        r13.getDescription().XOO0ii0(false);
        r13.getLegend().XOO0ii0(false);
        YAxis r14 = r13.getAxisLeft();
        r14.Ii0X0X(false);
        r14.iOiXi11II(100.0f);
        r14.X00Xi1X(false);
        r14.XO0X10iO(false);
        r14.Ii0X0X(false);
        r14.i0X000X0O(0.0f);
        r14.iIi0(0.0f);
        YAxis r15 = r13.getAxisRight();
        r15.XOO0ii0(false);
        r15.i0X000X0O(0.0f);
        r15.iIi0(0.0f);
        r15.X00Xi1X(false);
        r15.Ii0X0X(false);
        XAxis r16 = r13.getXAxis();
        iO1Xi1X1i r17 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r16);
        BarChart r18 = this.barChart;
        if (r18 != null) goto L23;
        Intrinsics.XXO("barChart");
        r18 = null;
    L23:
        Context r19 = r18.getContext();
        Intrinsics.O10IXXX0X(r19, "getContext(...)");
        r17.OIi0(r16, true, r19);
        r16.O1O = 0.0f;
        r16.iOO1ii1 = this.maxHour;
        r16.X00Xi1X(false);
        r16.Ii0X0X(false);
        BarChart r20 = this.barChart;
        if (r20 != null) goto L26;
        Intrinsics.XXO("barChart");
        r20 = null;
    L26:
        BarChart r21 = this.barChart;
        if (r21 != null) goto L29;
        Intrinsics.XXO("barChart");
        r21 = null;
    L29:
        X1i1iOX r22 = r21.getAnimator();
        BarChart r23 = this.barChart;
        if (r23 != null) goto L32;
        Intrinsics.XXO("barChart");
        r23 = null;
    L32:
        Oi01X10i r24 = new Oi01X10i(r20, r22, r23.getViewPortHandler());
        Context r25 = this.mContext;
        if (r25 != null) goto L35;
        Intrinsics.XXO("mContext");
        r25 = null;
    L35:
        r24.iOOX010X(gk4.iO(r25, R.color.line_color));
        Context r26 = this.mContext;
        if (r26 != null) goto L38;
        Intrinsics.XXO("mContext");
        r26 = null;
    L38:
        int r27 = ContextCompat.getColor(r26, R.color.p_show_1);
        Context r28 = this.mContext;
        if (r28 != null) goto L41;
        Intrinsics.XXO("mContext");
        r28 = null;
    L41:
        r24.I1(new int[]{r27, ContextCompat.getColor(r28, R.color.p_show_2)});
        r24.iIiiO(5);
        BarChart r29 = this.barChart;
        if (r29 != null) goto L44;
        Intrinsics.XXO("barChart");
    L45:
        r4.setRenderer(r24);
        return;
    L44:
        r4 = r29;
        goto L45
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        this.values.clear();
        long[] r0 = O0X11OiO.OiIIX101O(this.maxHour);
        this.range = r0;
        PressureDao r1 = this.mPressureDao;
        TextView r3 = null;
        View r4 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r5 = r0[0];
        long[] r2 = this.range;
        if (r2 != null) goto L8;
        Intrinsics.XXO("range");
        r2 = null;
    L8:
        List<Pressure> r6 = r1.getPressures(r5, r2[1]);
        if (r6.isEmpty() == false) goto L21;
        TextView r7 = this.tvTime;
        if (r7 != null) goto L13;
        Intrinsics.XXO("tvTime");
        r7 = null;
    L13:
        r7.setText("");
        View r8 = this.emptyPanel;
        if (r8 != null) goto L16;
        Intrinsics.XXO("emptyPanel");
        r8 = null;
    L16:
        r8.setVisibility(0);
        View r9 = this.dataPanel;
        if (r9 != null) goto L19;
        Intrinsics.XXO("dataPanel");
    L20:
        r4.setVisibility(8);
    L38:
        showChartData(r6);
        return;
    L19:
        r4 = r9;
        goto L20
    L21:
        View r10 = this.emptyPanel;
        if (r10 != null) goto L24;
        Intrinsics.XXO("emptyPanel");
        r10 = null;
    L24:
        r10.setVisibility(8);
        View r11 = this.dataPanel;
        if (r11 != null) goto L27;
        Intrinsics.XXO("dataPanel");
        r11 = null;
    L27:
        r11.setVisibility(0);
        BarChart r12 = this.barChart;
        if (r12 != null) goto L30;
        Intrinsics.XXO("barChart");
        r12 = null;
    L30:
        r12.getXAxis().X00Xi1X(true);
        TextView r13 = this.tvTime;
        if (r13 != null) goto L33;
        Intrinsics.XXO("tvTime");
        r13 = null;
    L33:
        r13.setText(O0X11OiO.XXX11i().format(new Date(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMTime())));
        TextView r14 = this.tvValue;
        if (r14 != null) goto L36;
        Intrinsics.XXO("tvValue");
    L37:
        r3.setText(String.valueOf(((Pressure) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMValue()));
        goto L38
    L36:
        r3 = r14;
        goto L37
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_pressure;
    }

    @sf5(tag = I01XX0.XXI)
    public final void onPressureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onPressureChanged"});
        initView();
    }
}
