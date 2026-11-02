package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0I1001OI;
import com.android.mltcode.paycertificationapi.IOiiOO1;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0100;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.OO0i1X;
import com.android.mltcode.paycertificationapi.OOO0iI1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXOO1010;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0OiI10X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.model.HRVDataParse;
import com.sma.smartv3.model.HRVDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHrvDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrvDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HrvDayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n257#2,2:212\n99#3,7:214\n106#3,3:222\n79#3,7:225\n109#3:232\n1#4:221\n*S KotlinDebug\n*F\n+ 1 HrvDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HrvDayFragment\n*L\n128#1:212,2\n125#1:214,7\n125#1:222,3\n125#1:225,7\n125#1:232\n125#1:221\n*E\n"})
public final class HrvDayFragment extends BaseDetailDaysFragment<Hrv> {

    @aa1
    private final Lazy btnMeasure$delegate;
    private final int dayMinute;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final HrvDao mHrvDao;

    @aa1
    private final Lazy maxValue$delegate;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final Lazy minValue$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ HrvDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(HrvDayFragment r1, SimpleDateFormat r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r3, X110O r4) {
            Intrinsics.X0O(r3, "e");
            Intrinsics.X0O(r4, "h");
            this.OXO1.updateItemData(r3);
            int r5 = (int) r3.OIX0iXi();
            int r6 = r5 / 60;
            this.OXO1.getMCalendar().set(11, r6);
            this.OXO1.getMCalendar().set(12, r5 - (r6 * 60));
            this.OXO1.getNowTimeDetails().setText(TimeUtils.millis2String(this.OXO1.getMCalendar().getTimeInMillis(), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public HrvDayFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new OO0i1X(this));
        this.minValue$delegate = LazyKt__LazyJVMKt.iO(new OOO0iI1(this));
        this.maxValue$delegate = LazyKt__LazyJVMKt.iO(new I0I1001OI(this));
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new O0100(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new IOiiOO1(this));
        this.values = new ArrayList();
        this.dayMinute = O0X11OiO.XIi00iiXO();
        this.mHrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();
    }

    public static /* synthetic */ void I1XOi1(HrvDayFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ LineChart IIX1OXO(HrvDayFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O10IXXX0X(HrvDayFragment r0) {
        return maxValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(HrvDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(HrvDayFragment r0) {
        return minValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(HrvDayFragment r0, BleConnector r1) {
        return initView$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ View XiOIO(HrvDayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    private static final View btnMeasure_delegate$lambda$0(HrvDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<Hrv> r4) {
        this.values.clear();
        HRVDayData r5 = HRVDataParse.INSTANCE.filterMinuteData(getRange(), r4, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(r5.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(r5.getMax()));
        getNowValue().setText(UtilsKt.iXiiiO(r5.getAvg()));
        updateChartData(this.values);
    }

    private final View getBtnMeasure() {
        return (View) getValue();
    }

    private final LineChart getLineChart() {
        return (LineChart) getValue();
    }

    private final DINCondBold getMaxValue() {
        return (DINCondBold) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) getValue();
    }

    private static final void initView$lambda$2(final HrvDayFragment r2, View r3) {
        i1O0OXO1O.OXO1.IiI10X("start measure HRV");
        X0IOiX1O.XIi00iiXO(false, new i0OiI10X(r2), 1, null);
    }

    private static final Unit initView$lambda$2$0(HrvDayFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 5);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), RealTimeMeasurementActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final LineChart lineChart_delegate$lambda$0(HrvDayFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxValue_delegate$lambda$0(HrvDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxValue);
    }

    private static final View measurePanel_delegate$lambda$0(HrvDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final DINCondBold minValue_delegate$lambda$0(HrvDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> r6) {
        if (getLineChart().getData() != 0) goto L5;
    L7:
        setSetValue(new LineDataSet(r6, setDataLabel()));
        getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
        getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hrv_color));
        getSetValue().I1XII0X(2.0f);
        getSetValue().iXOII(1.0f);
        getSetValue().IOI0i0I(false);
        getSetValue().XXI(false);
        getSetValue().O1iXiI(true);
        Drawable r0 = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hrv);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        getSetValue().I0i1OXiI(r0);
        co r1 = new co(new IiXO1XOi[]{getSetValue()});
        r1.iI(false);
        getLineChart().setData(r1);
    L8:
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        LineChart r2 = getLineChart();
        if (r6.size() != 0) goto L11;
        float r7 = 0.0f;
    L12:
        r2.II1Xi0(r7, 0);
        return;
    L11:
        r7 = r6.get(r6.size() - 1).OIX0iXi();
        goto L12
    L5:
        if (((co) getLineChart().getData()).XXI() <= 0) goto L7;
        T r3 = ((co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        setSetValue((LineDataSet) r3);
        getSetValue().IOX1(r6);
        getSetValue().i0X1iIO();
        ((co) getLineChart().getData()).iX();
        getLineChart().X0i1O();
        goto L8
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        LineChart r1 = getLineChart();
        Intrinsics.O10IXXX0X(r1, "<get-lineChart>(...)");
        r0.XIi00iiXO(r1);
        YAxis r2 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r2, "getAxisLeft(...)");
        YAxis r3 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r3, "getAxisRight(...)");
        r0.OIX0iXi(r2, r3, 200.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        XAxis r4 = getLineChart().getXAxis();
        Intrinsics.XXI(r4);
        Context r5 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        r0.OIi0(r4, true, r5);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        r4.IXOIIIO(this.dayMinute / 6);
        r4.i0X000X0O(-10.0f);
        r4.iOiXi11II(this.dayMinute + 10.0f);
        SimpleDateFormat r6 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList r7 = new ArrayList();
        int r8 = this.dayMinute;
        if (r8 < 0) goto L8;
        int r9 = 0;
    L5:
        String r10 = TimeUtils.millis2String(getRange()[0] + ((long) (60000 * r9)), r6);
        Intrinsics.O10IXXX0X(r10, "millis2String(...)");
        r7.add(r10);
        if (r9 == r8) goto L8;
        r9 = r9 + 1;
    L8:
        r4.Oi(new q4(r7));
        LineChart r11 = getLineChart();
        r11.getDescription().XOO0ii0(false);
        r11.getLegend().XOO0ii0(false);
        r11.setScaleEnabled(false);
        O11X1i1 r12 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r12.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r12);
        getLineChart().setOnChartValueSelectedListener(new OXO1(this, O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
        q62 r13 = q62.OXO1;
        if (r13.iOi1010() == true) goto L11;
    L22:
        View r14 = getMeasurePanel();
        if (r14 == null) goto L28;
        r14.setVisibility(8);
        return;
    L28:
        return;
    L11:
        if (r13.XI1OX0IO() == false) goto L22;
        View r15 = getMeasurePanel();
        if (r15 == null) goto L15;
        r15.setVisibility(0);
    L15:
        View r16 = getBtnMeasure();
        if (r16 == null) goto L18;
        r16.setOnClickListener(new XXOO1010(this));
    L18:
        View r17 = getMView().findViewById(R.id.ll_hrv_info);
        if (r17 == null) goto L27;
        r17.setVisibility(0);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_hrv_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Hrv> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @sf5(tag = I01XX0.OIi0)
    public final void onHrvChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.IiI10X("onHrvChanged! refresh");
        changeTime();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Hrv> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        return this.mHrvDao.getHrv(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "HRV day Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(String.valueOf((int) r2.O00()));
    }
}
