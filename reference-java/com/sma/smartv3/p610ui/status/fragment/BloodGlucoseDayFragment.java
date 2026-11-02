package com.sma.smartv3.p610ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.model.BloodGlucoseDataParse;
import com.sma.smartv3.model.BloodGlucoseDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodGlucoseDao;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucoseDayFragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseDayFragment extends BaseDetailDaysFragment<BloodGlucose> {
    public LineDataSet setValue;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOIXXO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseDayFragment.lineChart_delegate$lambda$0(this.f5059IO);
        }
    });

    @aa1
    private final Lazy minValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xi0I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseDayFragment.minValue_delegate$lambda$0(this.f5190IO);
        }
    });

    @aa1
    private final Lazy maxValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOOIIOX1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseDayFragment.maxValue_delegate$lambda$0(this.f8114IO);
        }
    });

    @aa1
    private final Lazy avValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i10IXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseDayFragment.avValue_delegate$lambda$0(this.f7507IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();
    private final int dayMinute = O0X11OiO.XIi00iiXO();

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            BloodGlucoseDayFragment.this.updateItemData(e);
            int iOIX0iXi = (int) e.OIX0iXi();
            int i = iOIX0iXi / 60;
            BloodGlucoseDayFragment.this.getMCalendar().set(11, i);
            BloodGlucoseDayFragment.this.getMCalendar().set(12, iOIX0iXi - (i * 60));
            BloodGlucoseDayFragment.this.getNowTimeDetails().setText(TimeUtils.millis2String(BloodGlucoseDayFragment.this.getMCalendar().getTimeInMillis(), this.XIi00iiXO));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public static final class XIi00iiXO extends C2829q4 {
        @Override // com.android.mltcode.paycertificationapi.C2829q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f / 10.0f)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold avValue_delegate$lambda$0(BloodGlucoseDayFragment bloodGlucoseDayFragment) {
        return (DINCondBold) bloodGlucoseDayFragment.getMView().findViewById(R.id.avValue);
    }

    @SuppressLint({"DefaultLocale"})
    private final void filterData(List<BloodGlucose> list) {
        this.values.clear();
        BloodGlucoseDayData bloodGlucoseDayDataFilterMinuteData = BloodGlucoseDataParse.INSTANCE.filterMinuteData(getRange(), list, this.values);
        getMinValue().setText(UtilsKt.i010I(bloodGlucoseDayDataFilterMinuteData.getMin()));
        getMaxValue().setText(UtilsKt.i010I(bloodGlucoseDayDataFilterMinuteData.getMax()));
        getAvValue().setText(UtilsKt.i010I(bloodGlucoseDayDataFilterMinuteData.getAvg()));
        getNowValue().setText(UtilsKt.i010I(bloodGlucoseDayDataFilterMinuteData.getAvg()));
        updateChartData(this.values);
    }

    private final DINCondBold getAvValue() {
        return (DINCondBold) this.avValue$delegate.getValue();
    }

    private final LineChart getLineChart() {
        return (LineChart) this.lineChart$delegate.getValue();
    }

    private final DINCondBold getMaxValue() {
        return (DINCondBold) this.maxValue$delegate.getValue();
    }

    private final DINCondBold getMinValue() {
        return (DINCondBold) this.minValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(BloodGlucoseDayFragment bloodGlucoseDayFragment) {
        return (LineChart) bloodGlucoseDayFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold maxValue_delegate$lambda$0(BloodGlucoseDayFragment bloodGlucoseDayFragment) {
        return (DINCondBold) bloodGlucoseDayFragment.getMView().findViewById(R.id.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold minValue_delegate$lambda$0(BloodGlucoseDayFragment bloodGlucoseDayFragment) {
        return (DINCondBold) bloodGlucoseDayFragment.getMView().findViewById(R.id.minValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> list) {
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(list, setDataLabel()));
            getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.hr_color));
            getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.hr_color));
            getSetValue().I1XII0X(2.0f);
            getSetValue().iXOII(1.0f);
            getSetValue().IOI0i0I(false);
            getSetValue().XXI(false);
            getSetValue().O1iXiI(true);
            Drawable drawable = ContextCompat.getDrawable(getMActivity(), R.drawable.shape_hr);
            Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            getSetValue().I0i1OXiI(drawable);
            C2305co c2305co = new C2305co(getSetValue());
            c2305co.m1316iI(false);
            getLineChart().setData(c2305co);
        } else {
            T tOIX0iXi = ((C2305co) getLineChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            setSetValue((LineDataSet) tOIX0iXi);
            getSetValue().IOX1(list);
            getSetValue().i0X1iIO();
            ((C2305co) getLineChart().getData()).mo1167iX();
            getLineChart().X0i1O();
        }
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        getLineChart().II1Xi0(list.size() == 0 ? 0.0f : list.get(list.size() - 1).OIX0iXi(), 0);
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet lineDataSet = this.setValue;
        if (lineDataSet != null) {
            return lineDataSet;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 80.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, true, context);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        xAxis.IXOIIIO(this.dayMinute / 6);
        xAxis.i0X000X0O(-10.0f);
        xAxis.iOiXi11II(this.dayMinute + 10.0f);
        SimpleDateFormat simpleDateFormatXXiIiX10 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList arrayList = new ArrayList();
        int i = this.dayMinute;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                String strMillis2String = TimeUtils.millis2String(getRange()[0] + ((long) (60000 * i2)), simpleDateFormatXXiIiX10);
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                arrayList.add(strMillis2String);
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        LineChart lineChart2 = getLineChart();
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
        getLineChart().setOnChartValueSelectedListener(new OXO1(O0X11OiO.XO0X10iO(false, 1, null)));
        getLineChart().getAxisRight().m603Oi(new XIi00iiXO());
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_blood_glucose_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodGlucose> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodGlucose> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return this.mBloodGlucoseDao.getListDesc(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BloodGlucose day Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(UtilsKt.X01IiOiIi(e.O00()));
    }
}
