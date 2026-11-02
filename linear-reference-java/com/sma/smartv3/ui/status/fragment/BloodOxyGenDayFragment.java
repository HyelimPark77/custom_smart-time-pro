package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0OOOIOiO;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.OIIIO0I0X;
import com.android.mltcode.paycertificationapi.Oi11I;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0OXiOIi;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XI1iX0Oi;
import com.android.mltcode.paycertificationapi.XOIXO1I;
import com.android.mltcode.paycertificationapi.XOXiiX0O;
import com.android.mltcode.paycertificationapi.XXO0XiIii;
import com.android.mltcode.paycertificationapi.Xi1OXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i10X1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Oi0O1i;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.ii011IO;
import com.android.mltcode.paycertificationapi.iiIi0XOX;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.model.BloodOxyGenDataParse;
import com.sma.smartv3.model.BloodOxyGenDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodOxyGenDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1869#2,2:260\n99#3,7:262\n106#3,3:270\n79#3,7:273\n109#3:280\n1#4:269\n*S KotlinDebug\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n*L\n235#1:260,2\n94#1:262,7\n94#1:270,3\n94#1:273,7\n94#1:280\n94#1:269\n*E\n"})
public final class BloodOxyGenDayFragment extends BaseDetailDaysFragment<BloodOxygen> {

    @aa1
    private final Lazy avValue$delegate;

    @aa1
    private final Lazy btnMeasure$delegate;
    private final int dayMinute;

    @aa1
    private final Lazy healthBtn$delegate;

    @aa1
    private final Lazy healthLayout$delegate;

    @aa1
    private final Lazy healthQuestions$delegate;

    @aa1
    private final Lazy healthTipLayout$delegate;

    @aa1
    private final Lazy healthTv$delegate;
    private float highlight;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final BloodOxygenDao mBloodOxyGenDao;

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
        public final /* synthetic */ BloodOxyGenDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(BloodOxyGenDayFragment r1, SimpleDateFormat r2) {
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

    public BloodOxyGenDayFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new i10X1000(this));
        this.minValue$delegate = LazyKt__LazyJVMKt.iO(new OIIIO0I0X(this));
        this.maxValue$delegate = LazyKt__LazyJVMKt.iO(new Oi11I(this));
        this.avValue$delegate = LazyKt__LazyJVMKt.iO(new XXO0XiIii(this));
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new iO1Oi0O1i(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new X0OXiOIi(this));
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new iiIi0XOX(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new XOXiiX0O(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new ii011IO(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new XI1iX0Oi(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new I0OOOIOiO(this));
        this.values = new ArrayList();
        this.dayMinute = O0X11OiO.XIi00iiXO();
        this.mBloodOxyGenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
    }

    public static /* synthetic */ LinearLayout I1XOi1(BloodOxyGenDayFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IIX1OXO(BloodOxyGenDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(BloodOxyGenDayFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(BloodOxyGenDayFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold OX(BloodOxyGenDayFragment r0) {
        return maxValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(BloodOxyGenDayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button X0O(BloodOxyGenDayFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(BloodOxyGenDayFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ LineChart XX0(BloodOxyGenDayFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(BloodOxyGenDayFragment r0) {
        return avValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(BloodOxyGenDayFragment r0, BleConnector r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ DINCondBold XiOIii1(BloodOxyGenDayFragment r0) {
        return minValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold avValue_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.avValue);
    }

    private static final View btnMeasure_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<BloodOxygen> r14) {
        this.values.clear();
        BloodOxyGenDayData r0 = BloodOxyGenDataParse.INSTANCE.filterMinuteData(getRange(), r14, this.values);
        getMinValue().setText(UtilsKt.iXiiiO(r0.getMin()));
        getMaxValue().setText(UtilsKt.iXiiiO(r0.getMax()));
        getAvValue().setText(UtilsKt.iXiiiO(r0.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(r0.getAvg()));
        updateChartData(this.values);
        if (r14.isEmpty() == true) goto L16;
        BloodOxygen r15 = (BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(r14);
        if (r15.getMValue() != 0) goto L10;
        Button r16 = getHealthBtn();
        if (r16 == null) goto L17;
        r16.setEnabled(false);
        return;
    L17:
        return;
    L10:
        HeathReportsUtils r2 = HeathReportsUtils.OXO1;
        long r4 = r15.getMTime();
        Button r6 = getHealthBtn();
        Intrinsics.O10IXXX0X(r6, "<get-healthBtn>(...)");
        PFMedium r7 = getHealthTv();
        Intrinsics.O10IXXX0X(r7, "<get-healthTv>(...)");
        LinearLayout r8 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r8, "<get-healthTipLayout>(...)");
        PFMedium r9 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r9, "<get-healthQuestions>(...)");
        r2.X1(q62.IiOIO1OX, r4, r6, r7, r8, r9, getMActivity());
        i72 r3 = i72.OXO1;
        boolean r5 = r3.I0i0();
        if (r3.OIIOI() == false) goto L13;
        boolean r12 = false;
    L14:
        LinearLayout r10 = getHealthLayout();
        Intrinsics.O10IXXX0X(r10, "<get-healthLayout>(...)");
        Button r11 = getHealthBtn();
        Intrinsics.O10IXXX0X(r11, "<get-healthBtn>(...)");
        PFMedium r13 = getHealthTv();
        Intrinsics.O10IXXX0X(r13, "<get-healthTv>(...)");
        r2.iOiXi11II(r10, r11, r13, getMActivity(), q62.IiOIO1OX, r15.getMValue() + "%", r15.getMTime(), "", r12);
        return;
    L13:
        r12 = r5;
        goto L14
    }

    private final DINCondBold getAvValue() {
        return (DINCondBold) getValue();
    }

    private final View getBtnMeasure() {
        return (View) getValue();
    }

    private final Button getHealthBtn() {
        return (Button) getValue();
    }

    private final LinearLayout getHealthLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getHealthQuestions() {
        return (PFMedium) getValue();
    }

    private final LinearLayout getHealthTipLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getHealthTv() {
        return (PFMedium) getValue();
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

    private static final Button healthBtn_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ PFMedium iIiiO(BloodOxyGenDayFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(final BloodOxyGenDayFragment r2, View r3) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new Xi1OXI(r2), 1, null);
    }

    private static final Unit initView$lambda$0$0(BloodOxyGenDayFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 2);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), RealTimeMeasurementActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final LineChart lineChart_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxValue_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxValue);
    }

    private static final View measurePanel_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final DINCondBold minValue_delegate$lambda$0(BloodOxyGenDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minValue);
    }

    private final void showError() {
        ToastUtils.showLong(R.string.measurement_failed_again);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> r6) {
        if (getLineChart().getData() != 0) goto L5;
    L7:
        setSetValue(new LineDataSet(r6, setDataLabel()));
        getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hr_color));
        getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hr_color));
        getSetValue().I1XII0X(2.0f);
        getSetValue().iXOII(1.0f);
        getSetValue().IOI0i0I(false);
        getSetValue().XXI(false);
        getSetValue().O1iXiI(true);
        Drawable r1 = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hr);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        getSetValue().I0i1OXiI(r1);
        co r2 = new co(new IiXO1XOi[]{getSetValue()});
        r2.iI(false);
        getLineChart().setData(r2);
    L8:
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        Iterator<T> r7 = r6.iterator();
    L10:
        if (r7.hasNext() == false) goto L14;
        Entry r0 = (Entry) r7.next();
        if (r0.O00() <= 0.0f) goto L10;
        this.highlight = r0.OIX0iXi();
        goto L10
    L14:
        getLineChart().II1Xi0(this.highlight, 0);
        return;
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

    public final float getHighlight() {
        return this.highlight;
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
        if (q62.OXO1.iOi1010() == false) goto L10;
        View r0 = getMeasurePanel();
        if (r0 == null) goto L7;
        r0.setVisibility(0);
    L7:
        View r1 = getBtnMeasure();
        if (r1 == null) goto L13;
        r1.setOnClickListener(new XOIXO1I(this));
    L13:
        iO1Xi1X1i r3 = iO1Xi1X1i.OXO1;
        LineChart r2 = getLineChart();
        Intrinsics.O10IXXX0X(r2, "<get-lineChart>(...)");
        r3.XIi00iiXO(r2);
        YAxis r4 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r4, "getAxisLeft(...)");
        YAxis r5 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r5, "getAxisRight(...)");
        r3.OIX0iXi(r4, r5, 100.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        XAxis r6 = getLineChart().getXAxis();
        Intrinsics.XXI(r6);
        Context r7 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r7, "getContext(...)");
        r3.OIi0(r6, true, r7);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        r6.IXOIIIO(this.dayMinute / 6);
        r6.i0X000X0O(-10.0f);
        r6.iOiXi11II(this.dayMinute + 10.0f);
        SimpleDateFormat r8 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList r9 = new ArrayList();
        int r10 = this.dayMinute;
        if (r10 < 0) goto L24;
        int r11 = 0;
    L16:
        String r12 = TimeUtils.millis2String(getRange()[0] + ((long) (60000 * r11)), r8);
        if (r9.size() > 12) goto L19;
    L21:
        Intrinsics.XXI(r12);
        r9.add(r12);
        if (r11 == r10) goto L24;
        r11 = r11 + 1;
        goto L16
    L19:
        if (Intrinsics.XOO0ii0(r12, "0") == false) goto L21;
        r12 = X10i1i.XOOXII;
    L24:
        r6.Oi(new q4(r9));
        LineChart r13 = getLineChart();
        r13.getDescription().XOO0ii0(false);
        r13.getLegend().XOO0ii0(false);
        r13.setScaleEnabled(false);
        O11X1i1 r14 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r14.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r14);
        getLineChart().setOnChartValueSelectedListener(new OXO1(this, O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
        return;
    L10:
        View r15 = getMeasurePanel();
        if (r15 == null) goto L13;
        r15.setVisibility(8);
        goto L13
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_blood_oxygen_day;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodoxygenChanged(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.IiI10X("onBloodOxygenChanged! refresh");
        setMOffset(0);
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        String r4 = O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod());
        if (TimePeriod.DAY == getMTimePeriod()) goto L5;
        return;
    L5:
        if (Intrinsics.XOO0ii0(O0X11OiO.X0i1O(null, 1, null).format(new Date()), r4) == false) goto L8;
        getTvCurrent().setText(R.string.today);
        return;
    L8:
        getTvCurrent().setText(r4);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodOxygen> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodOxygen> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        return this.mBloodOxyGenDao.getBloodOxygen(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodOxyGen day Data";
    }

    public final void setHighlight(float r1) {
        this.highlight = r1;
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
