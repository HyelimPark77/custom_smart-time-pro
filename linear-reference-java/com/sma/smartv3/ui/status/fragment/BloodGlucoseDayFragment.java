package com.sma.smartv3.ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXOIXXO1;
import com.android.mltcode.paycertificationapi.Xi0I0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i10IXi;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iOOIIOX1X;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.model.BloodGlucoseDataParse;
import com.sma.smartv3.model.BloodGlucoseDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseDayFragment extends BaseDetailDaysFragment<BloodGlucose> {

    @aa1
    private final Lazy avValue$delegate;
    private final int dayMinute;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao;

    @aa1
    private final Lazy maxValue$delegate;

    @aa1
    private final Lazy minValue$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ BloodGlucoseDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(BloodGlucoseDayFragment r1, SimpleDateFormat r2) {
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

    public static final class XIi00iiXO extends q4 {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            StringCompanionObject r0 = StringCompanionObject.OXO1;
            String r3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r2 / 10.0f)}, 1));
            Intrinsics.O10IXXX0X(r3, "format(...)");
            return r3;
        }
    }

    public BloodGlucoseDayFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new XXOIXXO1(this));
        this.minValue$delegate = LazyKt__LazyJVMKt.iO(new Xi0I0(this));
        this.maxValue$delegate = LazyKt__LazyJVMKt.iO(new iOOIIOX1X(this));
        this.avValue$delegate = LazyKt__LazyJVMKt.iO(new i10IXi(this));
        this.values = new ArrayList();
        this.dayMinute = O0X11OiO.XIi00iiXO();
        this.mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
    }

    public static /* synthetic */ DINCondBold O10IXXX0X(BloodGlucoseDayFragment r0) {
        return maxValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(BloodGlucoseDayFragment r0) {
        return minValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart X1ii(BloodGlucoseDayFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(BloodGlucoseDayFragment r0) {
        return avValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold avValue_delegate$lambda$0(BloodGlucoseDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.avValue);
    }

    @SuppressLint({"DefaultLocale"})
    private final void filterData(List<BloodGlucose> r4) {
        this.values.clear();
        BloodGlucoseDayData r5 = BloodGlucoseDataParse.INSTANCE.filterMinuteData(getRange(), r4, this.values);
        getMinValue().setText(UtilsKt.i010I(r5.getMin()));
        getMaxValue().setText(UtilsKt.i010I(r5.getMax()));
        getAvValue().setText(UtilsKt.i010I(r5.getAvg()));
        getNowValue().setText(UtilsKt.i010I(r5.getAvg()));
        updateChartData(this.values);
    }

    private final DINCondBold getAvValue() {
        return (DINCondBold) getValue();
    }

    private final LineChart getLineChart() {
        return (LineChart) getValue();
    }

    private final DINCondBold getMaxValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) getValue();
    }

    private static final LineChart lineChart_delegate$lambda$0(BloodGlucoseDayFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final DINCondBold maxValue_delegate$lambda$0(BloodGlucoseDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.maxValue);
    }

    private static final DINCondBold minValue_delegate$lambda$0(BloodGlucoseDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.minValue);
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
        r0.OIX0iXi(r2, r3, 80.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
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
        getLineChart().getAxisRight().Oi(new XIi00iiXO());
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_blood_glucose_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodGlucose> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodGlucose> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        return this.mBloodGlucoseDao.getListDesc(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodGlucose day Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(UtilsKt.X01IiOiIi(r2.O00()));
    }
}
