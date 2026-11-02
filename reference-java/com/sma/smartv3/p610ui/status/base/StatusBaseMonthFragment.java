package com.sma.smartv3.p610ui.status.base;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStatusBaseMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1869#2,2:158\n*S KotlinDebug\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n*L\n145#1:158,2\n*E\n"})
public abstract class StatusBaseMonthFragment<T> extends BaseDetailsMonthFragment<T> {
    private float axisMinimum;
    private float highlight;
    private float maxHeight;
    public List<String> monthDays;
    private XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.barChart_delegate$lambda$0(this.f5689IO);
        }
    });

    @aa1
    private final Lazy oneValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.oneValue_delegate$lambda$0(this.f5932IO);
        }
    });

    @aa1
    private final Lazy twoValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.twoValue_delegate$lambda$0(this.f6150IO);
        }
    });

    @aa1
    private final Lazy oneTV$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.oneTV_delegate$lambda$0(this.f6363IO);
        }
    });

    @aa1
    private final Lazy oneUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.oneUnit_delegate$lambda$0(this.f6600IO);
        }
    });

    @aa1
    private final Lazy twoTV$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.twoTV_delegate$lambda$0(this.f6835IO);
        }
    });

    @aa1
    private final Lazy twoUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.twoUnit_delegate$lambda$0(this.f7066IO);
        }
    });

    @aa1
    private final Lazy oneLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseMonthFragment.oneLl_delegate$lambda$0(this.f7775IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();

    @aa1
    private final LinkedHashMap<Long, ArrayList<T>> monthData = new LinkedHashMap<>();

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ StatusBaseMonthFragment<T> OXO1;

        public OXO1(StatusBaseMonthFragment<T> statusBaseMonthFragment) {
            this.OXO1 = statusBaseMonthFragment;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            this.OXO1.updateItemData(e);
            this.OXO1.getNowTimeDetails().setText(this.OXO1.getMonthDays().get((int) e.OIX0iXi()));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomBarChartView barChart_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (CustomBarChartView) statusBaseMonthFragment.getMView().findViewById(R.id.barChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout oneLl_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (LinearLayout) statusBaseMonthFragment.getMView().findViewById(R.id.oneLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium oneTV_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (PFMedium) statusBaseMonthFragment.getMView().findViewById(R.id.oneTV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium oneUnit_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (PFMedium) statusBaseMonthFragment.getMView().findViewById(R.id.oneUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold oneValue_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (DINCondBold) statusBaseMonthFragment.getMView().findViewById(R.id.oneValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium twoTV_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (PFMedium) statusBaseMonthFragment.getMView().findViewById(R.id.twoTV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium twoUnit_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (PFMedium) statusBaseMonthFragment.getMView().findViewById(R.id.twoUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold twoValue_delegate$lambda$0(StatusBaseMonthFragment statusBaseMonthFragment) {
        return (DINCondBold) statusBaseMonthFragment.getMView().findViewById(R.id.twoValue);
    }

    public final void clearCache(long j) {
        this.monthData.clear();
        int size = getMonthDays().size();
        int i = 1;
        if (1 > size) {
            return;
        }
        while (true) {
            this.monthData.put(Long.valueOf((((long) (86400 * i)) * 1000) + j), new ArrayList<>());
            if (i == size) {
                return;
            } else {
                i++;
            }
        }
    }

    @CallSuper
    public void filterData(@aa1 List<? extends T> data) {
        Intrinsics.X0O(data, "data");
        this.values.clear();
    }

    public final float getAxisMinimum() {
        return this.axisMinimum;
    }

    public final CustomBarChartView getBarChart() {
        return (CustomBarChartView) this.barChart$delegate.getValue();
    }

    public final float getHighlight() {
        return this.highlight;
    }

    public final float getMaxHeight() {
        return this.maxHeight;
    }

    @aa1
    public final LinkedHashMap<Long, ArrayList<T>> getMonthData() {
        return this.monthData;
    }

    @aa1
    public final List<String> getMonthDays() {
        List<String> list = this.monthDays;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("monthDays");
        return null;
    }

    public final LinearLayout getOneLl() {
        return (LinearLayout) this.oneLl$delegate.getValue();
    }

    public final PFMedium getOneTV() {
        return (PFMedium) this.oneTV$delegate.getValue();
    }

    public final PFMedium getOneUnit() {
        return (PFMedium) this.oneUnit$delegate.getValue();
    }

    public final DINCondBold getOneValue() {
        return (DINCondBold) this.oneValue$delegate.getValue();
    }

    public final PFMedium getTwoTV() {
        return (PFMedium) this.twoTV$delegate.getValue();
    }

    public final PFMedium getTwoUnit() {
        return (PFMedium) this.twoUnit$delegate.getValue();
    }

    public final DINCondBold getTwoValue() {
        return (DINCondBold) this.twoValue$delegate.getValue();
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @CallSuper
    public void initView() {
        setMonthDays(O0X11OiO.XiOIO(getMCalendar().getTimeInMillis(), null, 2, null));
        getTvCurrent().setText(O0X11OiO.iiiO().format(new Date()));
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        CustomBarChartView barChart = getBarChart();
        Intrinsics.O10IXXX0X(barChart, "<get-barChart>(...)");
        io1xi1x1i.OXO1(barChart);
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, this.maxHeight, this.axisMinimum, ContextCompat.getColor(getMActivity(), R.color.line_color));
        CustomBarChartView barChart2 = getBarChart();
        int i = 0;
        barChart2.setDrawValueAboveBar(false);
        barChart2.setScaleEnabled(false);
        barChart2.getDescription().XOO0ii0(false);
        barChart2.getLegend().XOO0ii0(false);
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.IXOIIIO(1.0f);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getMonthDays().iterator();
        while (it.hasNext()) {
            i++;
            it.next();
            arrayList.add(String.valueOf(i));
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        setChartRenderer();
        getBarChart().setOnChartValueSelectedListener(new OXO1(this));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_month;
    }

    public final void setAxisMinimum(float f) {
        this.axisMinimum = f;
    }

    public void setChartRenderer() {
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        getBarChart().setRenderer(oi01X10i);
    }

    public abstract void setColor(@aa1 XXX1X11 xxx1x11);

    @aa1
    public abstract String setDataLabel();

    public final void setHighlight(float f) {
        this.highlight = f;
    }

    public final void setMaxHeight(float f) {
        this.maxHeight = f;
    }

    public final void setMonthDays(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.monthDays = list;
    }

    public final void updateChartData(@aa1 List<BarEntry> values) {
        Intrinsics.X0O(values, "values");
        XXX1X11 xxx1x11 = null;
        if (getBarChart().getData() == null || ((IXIX1X1) getBarChart().getData()).XXI() <= 0) {
            XXX1X11 xxx1x12 = new XXX1X11(values, setDataLabel());
            this.setValue = xxx1x12;
            setColor(xxx1x12);
            XXX1X11 xxx1x13 = this.setValue;
            if (xxx1x13 == null) {
                Intrinsics.XXO("setValue");
            } else {
                xxx1x11 = xxx1x13;
            }
            IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
            ixix1x1.m1316iI(false);
            getBarChart().setData(ixix1x1);
        } else {
            T tOIX0iXi = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            XXX1X11 xxx1x14 = (XXX1X11) tOIX0iXi;
            this.setValue = xxx1x14;
            if (xxx1x14 == null) {
                Intrinsics.XXO("setValue");
                xxx1x14 = null;
            }
            xxx1x14.IOX1(values);
            XXX1X11 xxx1x15 = this.setValue;
            if (xxx1x15 == null) {
                Intrinsics.XXO("setValue");
            } else {
                xxx1x11 = xxx1x15;
            }
            xxx1x11.i0X1iIO();
            ((IXIX1X1) getBarChart().getData()).mo1167iX();
            getBarChart().X0i1O();
        }
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        this.highlight = values.size() / 2;
        for (BarEntry barEntry : values) {
            if (barEntry.O00() > 0.0f) {
                this.highlight = barEntry.OIX0iXi();
            }
        }
        getBarChart().II1Xi0(this.highlight, 0);
    }

    public abstract void updateItemData(@aa1 Entry entry);
}
