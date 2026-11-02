package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Electrocardiogram3Item extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private final boolean initEvent;
    private final int intervalTime;
    private LineChart lineChart;
    private Context mContext;
    private final int maxHour;
    private final int maxNum;

    @aa1
    private long[] range;
    private final int totalTime;
    private TextView tvChartBottomText;
    private TextView tvTime;
    private TextView tvValue;

    public Electrocardiogram3Item() {
        this.range = new long[]{0, 0};
        this.maxHour = 4;
        int r0 = (4 * 60) * 60000;
        this.totalTime = r0;
        this.intervalTime = 300000;
        this.maxNum = r0 / 300000;
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r10) {
        Intrinsics.X0O(r10, "itemHolder");
        this.range = O0X11OiO.OiIIX101O(this.maxHour);
        View r2 = r10.v(R.id.hrLineChart);
        Intrinsics.XXI(r2);
        this.lineChart = (LineChart) r2;
        View r3 = r10.v(R.id.hrLastTime);
        Intrinsics.XXI(r3);
        this.tvTime = (TextView) r3;
        View r4 = r10.v(R.id.hrLastValue);
        Intrinsics.XXI(r4);
        this.tvValue = (TextView) r4;
        View r5 = r10.v(R.id.tv_chart_bottom_text);
        Intrinsics.XXI(r5);
        this.tvChartBottomText = (TextView) r5;
        View r6 = r10.v(R.id.empty_panel);
        Intrinsics.XXI(r6);
        this.emptyPanel = r6;
        LineChart r7 = null;
        if (r6 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r6 = null;
    L5:
        UtilsKt.IX1XiI(r6, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r11 = r10.v(R.id.data_panel);
        Intrinsics.XXI(r11);
        this.dataPanel = r11;
        LineChart r12 = this.lineChart;
        if (r12 != null) goto L8;
        Intrinsics.XXO("lineChart");
        r12 = null;
    L8:
        Context r13 = r12.getContext();
        Intrinsics.O10IXXX0X(r13, "getContext(...)");
        this.mContext = r13;
        TextView r14 = this.tvChartBottomText;
        if (r14 != null) goto L11;
        Intrinsics.XXO("tvChartBottomText");
        r14 = null;
    L11:
        Context r8 = this.mContext;
        if (r8 != null) goto L14;
        Intrinsics.XXO("mContext");
        r8 = null;
    L14:
        r14.setText(r8.getString(R.string.last_few_hours, new Object[]{Integer.valueOf(this.maxHour)}));
        LineChart r15 = this.lineChart;
        if (r15 != null) goto L17;
        Intrinsics.XXO("lineChart");
        r15 = null;
    L17:
        r15.i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        LineChart r16 = this.lineChart;
        if (r16 != null) goto L20;
        Intrinsics.XXO("lineChart");
        r16 = null;
    L20:
        r16.setTouchEnabled(false);
        r16.getDescription().XOO0ii0(false);
        r16.getLegend().XOO0ii0(false);
        YAxis r9 = r16.getAxisLeft();
        r9.Ii0X0X(false);
        r9.iOiXi11II(200.0f);
        r9.X00Xi1X(false);
        r9.XO0X10iO(false);
        r9.Ii0X0X(false);
        r9.i0X000X0O(30.0f);
        r9.iIi0(0.0f);
        YAxis r17 = r16.getAxisRight();
        r17.XOO0ii0(false);
        r17.i0X000X0O(30.0f);
        r17.iIi0(0.0f);
        r17.X00Xi1X(false);
        r17.Ii0X0X(false);
        XAxis r18 = r16.getXAxis();
        iO1Xi1X1i r19 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r18);
        LineChart r20 = this.lineChart;
        if (r20 != null) goto L23;
        Intrinsics.XXO("lineChart");
        r20 = null;
    L23:
        Context r21 = r20.getContext();
        Intrinsics.O10IXXX0X(r21, "getContext(...)");
        r19.OIi0(r18, true, r21);
        r18.i0X000X0O(0.0f);
        r18.IXOIIIO(1.0f);
        r18.iOiXi11II(this.maxNum);
        r18.X00Xi1X(false);
        r18.Ii0X0X(false);
        LineDataSet r110 = new LineDataSet(null, "");
        Context r22 = this.mContext;
        if (r22 != null) goto L26;
        Intrinsics.XXO("mContext");
        r22 = null;
    L26:
        r110.II1(ContextCompat.getColor(r22, R.color.hr_color));
        Context r23 = this.mContext;
        if (r23 != null) goto L29;
        Intrinsics.XXO("mContext");
        r23 = null;
    L29:
        r110.I00(ContextCompat.getColor(r23, R.color.hr_color));
        r110.I1XII0X(2.0f);
        r110.iXOII(1.0f);
        Context r24 = this.mContext;
        if (r24 != null) goto L32;
        Intrinsics.XXO("mContext");
        r24 = null;
    L32:
        r110.I0i1OXiI(ContextCompat.getDrawable(r24, R.drawable.shape_hr));
        r110.IOI0i0I(false);
        r110.XXI(false);
        r110.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        r110.O1iXiI(true);
        co r25 = new co(new IiXO1XOi[]{r110});
        r25.iI(false);
        LineChart r111 = this.lineChart;
        if (r111 != null) goto L35;
        Intrinsics.XXO("lineChart");
    L36:
        r7.setData(r25);
        return;
    L35:
        r7 = r111;
        goto L36
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        this.range = O0X11OiO.OiIIX101O(this.maxHour);
        View r0 = this.emptyPanel;
        View r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r0 = null;
    L5:
        r0.setVisibility(0);
        View r2 = this.dataPanel;
        if (r2 != null) goto L8;
        Intrinsics.XXO("dataPanel");
    L9:
        r1.setVisibility(8);
        return;
    L8:
        r1 = r2;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_electrocardiogram;
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onHeartRateChanged"});
        initView();
    }

    public final void showChartData(@aa1 List<Electrocardiogram> r2) {
        Intrinsics.X0O(r2, "list");
    }
}
