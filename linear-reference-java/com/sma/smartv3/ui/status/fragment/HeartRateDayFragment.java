package com.sma.smartv3.ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I00Xi;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I01iX;
import com.android.mltcode.paycertificationapi.IX1XI1O;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.O1O00IX;
import com.android.mltcode.paycertificationapi.OIX1XO;
import com.android.mltcode.paycertificationapi.Oii100I0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.X1110XIO;
import com.android.mltcode.paycertificationapi.XO110;
import com.android.mltcode.paycertificationapi.XXXIXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i00IIOiI;
import com.android.mltcode.paycertificationapi.i01OI;
import com.android.mltcode.paycertificationapi.i0iO1X0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIX10O0;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
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
import com.sma.smartv3.model.HRDataParse;
import com.sma.smartv3.model.HRDayData;
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
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeartRateDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HeartRateDayFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n99#2,7:315\n106#2,3:323\n79#2,7:326\n109#2:333\n1#3:322\n*S KotlinDebug\n*F\n+ 1 HeartRateDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/HeartRateDayFragment\n*L\n94#1:315,7\n94#1:323,3\n94#1:326,7\n94#1:333\n94#1:322\n*E\n"})
public final class HeartRateDayFragment extends BaseDetailDaysFragment<HeartRate> {

    @aa1
    private final Lazy avHrValue$delegate;

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

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private HeartRateDao mHeartRateDao;

    @aa1
    private final Lazy maxHrValue$delegate;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final Lazy minHrValue$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ HeartRateDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(HeartRateDayFragment r1, SimpleDateFormat r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r5, X110O r6) {
            Intrinsics.X0O(r5, "e");
            Intrinsics.X0O(r6, "h");
            this.OXO1.updateItemData(r5);
            int r7 = (int) r5.OIX0iXi();
            int r8 = r7 / 60;
            this.OXO1.getMCalendar().set(11, r8);
            this.OXO1.getMCalendar().set(12, r7 - (r8 * 60));
            this.OXO1.getNowTimeDetails().setText(TimeUtils.millis2String(this.OXO1.getMCalendar().getTimeInMillis() - ((long) 60000), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public HeartRateDayFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new X1110XIO(this));
        this.minHrValue$delegate = LazyKt__LazyJVMKt.iO(new XO110(this));
        this.maxHrValue$delegate = LazyKt__LazyJVMKt.iO(new Oii100I0(this));
        this.avHrValue$delegate = LazyKt__LazyJVMKt.iO(new i00IIOiI(this));
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new iIX10O0(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new IX1XI1O(this));
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new i0iO1X0(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new OIX1XO(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new XXXIXI(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new i01OI(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new I00Xi(this));
        this.values = new ArrayList();
        this.dayMinute = O0X11OiO.XIi00iiXO();
        this.mHeartRateDao = MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    public static /* synthetic */ View I1XOi1(HeartRateDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart IIX1OXO(HeartRateDayFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O10IXXX0X(HeartRateDayFragment r0) {
        return maxHrValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold OII(HeartRateDayFragment r0) {
        return minHrValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OX(HeartRateDayFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(HeartRateDayFragment r0, BleConnector r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ DINCondBold X0O(HeartRateDayFragment r0) {
        return avHrValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button X1ii(HeartRateDayFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XX0(HeartRateDayFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(HeartRateDayFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ View XiOIO(HeartRateDayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XiOIii1(HeartRateDayFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    private final void addLastData(List<HeartRate> r4) {
        if (this.values.isEmpty() == false) goto L5;
        return;
    L5:
        if (r4.isEmpty() == true) goto L9;
        LogUtils.i(new Object[]{"filterData", "last:" + ((HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(r4)).getMBpm()});
        ((Entry) CollectionsKt___CollectionsKt.Xi1XO00(this.values)).I0IIOi((float) ((HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(r4)).getMBpm());
        return;
    }

    private static final DINCondBold avHrValue_delegate$lambda$0(HeartRateDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.avHrValue);
    }

    private static final View btnMeasure_delegate$lambda$0(HeartRateDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<HeartRate> r13) {
        this.values.clear();
        HRDayData r0 = HRDataParse.INSTANCE.filterMinuteData(getRange(), r13, this.values);
        getMinHrValue().setText(UtilsKt.iXiiiO(r0.getMin()));
        getMaxHrValue().setText(UtilsKt.iXiiiO(r0.getMax()));
        getAvHrValue().setText(UtilsKt.iXiiiO(r0.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(r0.getAvg()));
        addLastData(r13);
        updateChartData(this.values);
        if (r13.isEmpty() == true) goto L16;
        HeartRate r14 = (HeartRate) CollectionsKt___CollectionsKt.Xi1XO00(r13);
        if (r14.getMBpm() != 0) goto L10;
        Button r15 = getHealthBtn();
        if (r15 == null) goto L17;
        r15.setEnabled(false);
        return;
    L17:
        return;
    L10:
        HeathReportsUtils r1 = HeathReportsUtils.OXO1;
        long r3 = r14.getMTime();
        Button r5 = getHealthBtn();
        Intrinsics.O10IXXX0X(r5, "<get-healthBtn>(...)");
        PFMedium r6 = getHealthTv();
        Intrinsics.O10IXXX0X(r6, "<get-healthTv>(...)");
        LinearLayout r7 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r7, "<get-healthTipLayout>(...)");
        PFMedium r8 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r8, "<get-healthQuestions>(...)");
        r1.X1("heart_rate", r3, r5, r6, r7, r8, getMActivity());
        i72 r2 = i72.OXO1;
        boolean r4 = r2.I0i0();
        if (r2.OIIOI() == false) goto L13;
        String r9 = getString(R.string.hr_ai_health_analysis_v2);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        boolean r11 = r2.I0i0();
    L14:
        LinearLayout r10 = getHealthLayout();
        Intrinsics.O10IXXX0X(r10, "<get-healthLayout>(...)");
        String r12 = r9;
        Button r16 = getHealthBtn();
        Intrinsics.O10IXXX0X(r16, "<get-healthBtn>(...)");
        PFMedium r17 = getHealthTv();
        Intrinsics.O10IXXX0X(r17, "<get-healthTv>(...)");
        r1.iOiXi11II(r10, r16, r17, getMActivity(), "heart_rate", r14.getMBpm() + getString(R.string.bpm), r14.getMTime(), r12, r11);
        return;
    L13:
        r11 = r4;
        r9 = "";
        goto L14
    }

    private final DINCondBold getAvHrValue() {
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

    private final DINCondBold getMaxHrValue() {
        return (DINCondBold) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final DINCondBold getMinHrValue() {
        return (DINCondBold) getValue();
    }

    private static final Button healthBtn_delegate$lambda$0(HeartRateDayFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(HeartRateDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(HeartRateDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(HeartRateDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(HeartRateDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ PFMedium iIiiO(HeartRateDayFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(final HeartRateDayFragment r2, View r3) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new O1O00IX(r2), 1, null);
    }

    private static final Unit initView$lambda$0$0(HeartRateDayFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 0);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), RealTimeMeasurementActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final LineChart lineChart_delegate$lambda$0(HeartRateDayFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxHrValue_delegate$lambda$0(HeartRateDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxHrValue);
    }

    private static final View measurePanel_delegate$lambda$0(HeartRateDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final DINCondBold minHrValue_delegate$lambda$0(HeartRateDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minHrValue);
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
        Drawable r0 = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hr);
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
        LogUtils.i(new Object[]{"updateChartData", "values:" + r6.size() + r6});
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
        if (q62.OXO1.iOi1010() == false) goto L10;
        View r0 = getMeasurePanel();
        if (r0 == null) goto L7;
        r0.setVisibility(0);
    L7:
        View r1 = getBtnMeasure();
        if (r1 == null) goto L13;
        r1.setOnClickListener(new I01iX(this));
    L13:
        iO1Xi1X1i r3 = iO1Xi1X1i.OXO1;
        LineChart r2 = getLineChart();
        Intrinsics.O10IXXX0X(r2, "<get-lineChart>(...)");
        r3.XIi00iiXO(r2);
        YAxis r4 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r4, "getAxisLeft(...)");
        YAxis r5 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r5, "getAxisRight(...)");
        r3.OIX0iXi(r4, r5, 210.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
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
        return R.layout.fragment_status_hr_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<HeartRate> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.IiI10X("onHeartRateChanged! refresh");
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
    @aa1
    public List<HeartRate> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        return this.mHeartRateDao.getHeartRates(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "HR day Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(String.valueOf((int) r2.O00()));
    }
}
