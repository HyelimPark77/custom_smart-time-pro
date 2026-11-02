package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.OOIOOiO;
import com.android.mltcode.paycertificationapi.Oi01I0iX1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.X1i0OO;
import com.android.mltcode.paycertificationapi.XIiX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iXIXX1OiX;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ElectrocardiogramDao;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.model.ECGDataParse;
import com.sma.smartv3.model.ECGDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.MyLineChart;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EcgDayFragment extends BaseDetailDaysFragment<Electrocardiogram> {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy avEcgValue$delegate;
    private final int dayMinute;

    @aa1
    private final Lazy lineChart$delegate;
    private final float mAxisMaximum;

    @aa1
    private final ElectrocardiogramDao mElectrocardiogram;

    @aa1
    private final Lazy maxEcgValue$delegate;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final Lazy minEcgValue$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;
    private float xTargetNumber;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ EcgDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(EcgDayFragment r1, SimpleDateFormat r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r4, X110O r5) {
            Intrinsics.X0O(r4, "e");
            Intrinsics.X0O(r5, "h");
            this.OXO1.updateItemData(r4);
            int r6 = (int) r4.OIX0iXi();
            Calendar r7 = Calendar.getInstance();
            int r0 = r6 / 60;
            r7.set(11, r0 / 60);
            r7.set(12, r0 % 60);
            r7.set(13, r6 % 60);
            this.OXO1.getNowTimeDetails().setText(TimeUtils.millis2String(r7.getTimeInMillis(), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public EcgDayFragment() {
        this.TAG = "EcgDayFragment";
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new X1i0OO(this));
        this.minEcgValue$delegate = LazyKt__LazyJVMKt.iO(new XIiX0(this));
        this.maxEcgValue$delegate = LazyKt__LazyJVMKt.iO(new Oi01I0iX1(this));
        this.avEcgValue$delegate = LazyKt__LazyJVMKt.iO(new iXIXX1OiX(this));
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new OOIOOiO(this));
        this.values = new ArrayList();
        this.dayMinute = O0X11OiO.XIi00iiXO() * 60;
        this.mElectrocardiogram = MyDb.INSTANCE.getMDatabase().electrocardiogramDao();
        this.mAxisMaximum = 200.0f;
    }

    public static /* synthetic */ DINCondBold I1XOi1(EcgDayFragment r0) {
        return minEcgValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(EcgDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MyLineChart X0O(EcgDayFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(EcgDayFragment r0) {
        return maxEcgValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(EcgDayFragment r0) {
        return avEcgValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold avEcgValue_delegate$lambda$0(EcgDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.avHrValue);
    }

    private final void filterData(List<Electrocardiogram> r9) {
        LogUtils.d(new Object[]{this.TAG + " filterData heartRates.size = " + r9.size()});
        this.values.clear();
        ECGDayData r1 = new ECGDayData(0, 0, 0, null, 15, null);
        if (r9.isEmpty() == true) goto L5;
        r1 = ECGDataParse.INSTANCE.filterMinuteData(getRange(), r9, this.values);
    L5:
        getMinEcgValue().setText(UtilsKt.iXiiiO(r1.getMin()));
        getMaxEcgValue().setText(UtilsKt.iXiiiO(r1.getMax()));
        getAvEcgValue().setText(UtilsKt.iXiiiO(r1.getAvg()));
        getNowValue().setText(UtilsKt.iXiiiO(r1.getAvg()));
        MyLineChart r10 = getLineChart();
        if (this.values.size() != 0) goto L8;
        r10.setDragEnabled(false);
        r10.setDisallowIntercept(false);
        r10.iiII(0.0f, 1.0f, 0.0f, 0.0f);
    L9:
        updateChartData(this.values);
        return;
    L8:
        r10.setDisallowIntercept(true);
        r10.setDragEnabled(true);
        r10.iiII(150.0f, 1.0f, 0.0f, 0.0f);
        goto L9
    }

    private final DINCondBold getAvEcgValue() {
        return (DINCondBold) getValue();
    }

    private final MyLineChart getLineChart() {
        return (MyLineChart) getValue();
    }

    private final DINCondBold getMaxEcgValue() {
        return (DINCondBold) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final DINCondBold getMinEcgValue() {
        return (DINCondBold) getValue();
    }

    private static final MyLineChart lineChart_delegate$lambda$0(EcgDayFragment r1) {
        return (MyLineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxEcgValue_delegate$lambda$0(EcgDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxHrValue);
    }

    private static final View measurePanel_delegate$lambda$0(EcgDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final DINCondBold minEcgValue_delegate$lambda$0(EcgDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minHrValue);
    }

    private final void setLineChartXAxis() {
        XAxis r0 = getLineChart().getXAxis();
        iO1Xi1X1i r1 = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(r0);
        Context r2 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r2, "getContext(...)");
        r1.OIi0(r0, true, r2);
        int r4 = 0;
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        this.xTargetNumber = this.dayMinute;
        getLineChart().getXAxis().IXOIIIO(this.xTargetNumber / 6);
        r0.i0X000X0O(-1.0f);
        r0.iOiXi11II(this.dayMinute + 1.0f);
        ArrayList r3 = new ArrayList();
        int r5 = this.dayMinute;
        if (r5 < 0) goto L7;
    L4:
        r3.add(String.valueOf((r4 / 60) / 60));
        if (r4 == r5) goto L7;
        r4 = r4 + 1;
    L7:
        r0.Oi(new q4(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> r6) {
        LogUtils.d(new Object[]{this.TAG + " updateChartData values.size = " + r6.size()});
        if (getLineChart().getData() != 0) goto L5;
    L7:
        setSetValue(new LineDataSet(r6, setDataLabel()));
        getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hr_color));
        getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hr_color));
        getSetValue().I1XII0X(1.0f);
        getSetValue().iXOII(1.0f);
        getSetValue().OXOO0X0i(false);
        getSetValue().IOI0i0I(false);
        getSetValue().XXI(false);
        getSetValue().O1iXiI(false);
        getSetValue().OXXO0O1X(LineDataSet.Mode.HORIZONTAL_BEZIER);
        co r1 = new co(new IiXO1XOi[]{getSetValue()});
        r1.iI(false);
        getLineChart().setData(r1);
    L8:
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        MyLineChart r2 = getLineChart();
        if (r6.size() != 0) goto L12;
        float r7 = 0.0f;
    L16:
        r2.II1Xi0(r7, 0);
        return;
    L12:
        if (r6.size() <= 60) goto L14;
        getLineChart().Xi1i0XOX0(r6.get(r6.size() - 50).OIX0iXi());
    L15:
        r7 = r6.get(r6.size() - 1).OIX0iXi();
        goto L16
    L14:
        getLineChart().Xi1i0XOX0(r6.get(0).OIX0iXi());
        goto L15
    L5:
        if (((co) getLineChart().getData()).XXI() <= 0) goto L7;
        T r3 = ((co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        setSetValue((LineDataSet) r3);
        getSetValue().IOX1(r6);
        getSetValue().OXXO0O1X(LineDataSet.Mode.HORIZONTAL_BEZIER);
        getSetValue().i0X1iIO();
        ((co) getLineChart().getData()).iX();
        getLineChart().X0i1O();
        goto L8
    }

    public final float getMAxisMaximum() {
        return this.mAxisMaximum;
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

    public final float getXTargetNumber() {
        return this.xTargetNumber;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        LogUtils.d(new Object[]{this.TAG + " initView"});
        View r0 = getMeasurePanel();
        if (r0 == null) goto L5;
        r0.setVisibility(8);
    L5:
        iO1Xi1X1i r2 = iO1Xi1X1i.OXO1;
        MyLineChart r1 = getLineChart();
        Intrinsics.O10IXXX0X(r1, "<get-lineChart>(...)");
        r2.XIi00iiXO(r1);
        YAxis r3 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r3, "getAxisLeft(...)");
        YAxis r4 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r4, "getAxisRight(...)");
        r2.OIX0iXi(r3, r4, 0.0f, 30.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        setLineChartXAxis();
        MyLineChart r5 = getLineChart();
        r5.getDescription().XOO0ii0(false);
        r5.getLegend().XOO0ii0(false);
        r5.setScaleEnabled(false);
        r5.getAxisLeft().iOiXi11II(this.mAxisMaximum);
        r5.getAxisRight().iOiXi11II(this.mAxisMaximum);
        O11X1i1 r6 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r6.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r6);
        getLineChart().setOnChartValueSelectedListener(new OXO1(this, O0X11OiO.iX1O1()));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_ecg_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Electrocardiogram> r3) {
        Intrinsics.X0O(r3, "data");
        LogUtils.d(new Object[]{this.TAG + " onDataChange"});
        filterData(r3);
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
    public List<Electrocardiogram> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        return this.mElectrocardiogram.getElectrocardiograms(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "ecg day Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void setXTargetNumber(float r1) {
        this.xTargetNumber = r1;
    }

    public final void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(String.valueOf((int) r2.O00()));
    }
}
