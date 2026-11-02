package com.sma.smartv3.ui.status.base;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b95;
import com.android.mltcode.paycertificationapi.c95;
import com.android.mltcode.paycertificationapi.d95;
import com.android.mltcode.paycertificationapi.e95;
import com.android.mltcode.paycertificationapi.f95;
import com.android.mltcode.paycertificationapi.g95;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.h95;
import com.android.mltcode.paycertificationapi.i95;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.uf1;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStatusBaseMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1869#2,2:158\n*S KotlinDebug\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n*L\n145#1:158,2\n*E\n"})
public abstract class StatusBaseMonthFragment<T> extends BaseDetailsMonthFragment<T> {
    private float axisMinimum;

    @aa1
    private final Lazy barChart$delegate;
    private float highlight;
    private float maxHeight;

    @aa1
    private final LinkedHashMap<Long, ArrayList<T>> monthData;
    public List<String> monthDays;

    @aa1
    private final Lazy oneLl$delegate;

    @aa1
    private final Lazy oneTV$delegate;

    @aa1
    private final Lazy oneUnit$delegate;

    @aa1
    private final Lazy oneValue$delegate;
    private XXX1X11 setValue;

    @aa1
    private final Lazy twoTV$delegate;

    @aa1
    private final Lazy twoUnit$delegate;

    @aa1
    private final Lazy twoValue$delegate;

    @aa1
    private final List<BarEntry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ StatusBaseMonthFragment<T> OXO1;

        public OXO1(StatusBaseMonthFragment<T> r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r2, X110O r3) {
            Intrinsics.X0O(r2, "e");
            Intrinsics.X0O(r3, "h");
            this.OXO1.updateItemData(r2);
            this.OXO1.getNowTimeDetails().setText(this.OXO1.getMonthDays().get((int) r2.OIX0iXi()));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public StatusBaseMonthFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new b95(this));
        this.oneValue$delegate = LazyKt__LazyJVMKt.iO(new c95(this));
        this.twoValue$delegate = LazyKt__LazyJVMKt.iO(new d95(this));
        this.oneTV$delegate = LazyKt__LazyJVMKt.iO(new e95(this));
        this.oneUnit$delegate = LazyKt__LazyJVMKt.iO(new f95(this));
        this.twoTV$delegate = LazyKt__LazyJVMKt.iO(new g95(this));
        this.twoUnit$delegate = LazyKt__LazyJVMKt.iO(new h95(this));
        this.oneLl$delegate = LazyKt__LazyJVMKt.iO(new i95(this));
        this.values = new ArrayList();
        this.monthData = new LinkedHashMap();
    }

    public static /* synthetic */ PFMedium I1XOi1(StatusBaseMonthFragment r0) {
        return oneUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(StatusBaseMonthFragment r0) {
        return twoTV_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O10IXXX0X(StatusBaseMonthFragment r0) {
        return twoValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(StatusBaseMonthFragment r0) {
        return oneValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1ii(StatusBaseMonthFragment r0) {
        return oneLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(StatusBaseMonthFragment r0) {
        return twoUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIO(StatusBaseMonthFragment r0) {
        return oneTV_delegate$lambda$0(r0);
    }

    private static final CustomBarChartView barChart_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (CustomBarChartView) r1.getMView().findViewById(R.id.barChart);
    }

    public static /* synthetic */ CustomBarChartView iIiiO(StatusBaseMonthFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    private static final LinearLayout oneLl_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.oneLl);
    }

    private static final PFMedium oneTV_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.oneTV);
    }

    private static final PFMedium oneUnit_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.oneUnit);
    }

    private static final DINCondBold oneValue_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.oneValue);
    }

    private static final PFMedium twoTV_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.twoTV);
    }

    private static final PFMedium twoUnit_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.twoUnit);
    }

    private static final DINCondBold twoValue_delegate$lambda$0(StatusBaseMonthFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.twoValue);
    }

    public final void clearCache(long r8) {
        this.monthData.clear();
        int r0 = getMonthDays().size();
        int r1 = 1;
        if (1 > r0) goto L7;
    L4:
        this.monthData.put(Long.valueOf((((long) (86400 * r1)) * 1000) + r8), new ArrayList());
        if (r1 == r0) goto L9;
        r1 = r1 + 1;
        goto L4
    L9:
        return;
    }

    @CallSuper
    public void filterData(@aa1 List<? extends T> r2) {
        Intrinsics.X0O(r2, "data");
        this.values.clear();
    }

    public final float getAxisMinimum() {
        return this.axisMinimum;
    }

    public final CustomBarChartView getBarChart() {
        return (CustomBarChartView) getValue();
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
        List<String> r0 = this.monthDays;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("monthDays");
        return null;
    }

    public final LinearLayout getOneLl() {
        return (LinearLayout) getValue();
    }

    public final PFMedium getOneTV() {
        return (PFMedium) getValue();
    }

    public final PFMedium getOneUnit() {
        return (PFMedium) getValue();
    }

    public final DINCondBold getOneValue() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getTwoTV() {
        return (PFMedium) getValue();
    }

    public final PFMedium getTwoUnit() {
        return (PFMedium) getValue();
    }

    public final DINCondBold getTwoValue() {
        return (DINCondBold) getValue();
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    @CallSuper
    public void initView() {
        setMonthDays(O0X11OiO.XiOIO(getMCalendar().getTimeInMillis(), null, 2, null));
        getTvCurrent().setText(O0X11OiO.iiiO().format(new Date()));
        iO1Xi1X1i r2 = iO1Xi1X1i.OXO1;
        CustomBarChartView r0 = getBarChart();
        Intrinsics.O10IXXX0X(r0, "<get-barChart>(...)");
        r2.OXO1(r0);
        YAxis r3 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r3, "getAxisLeft(...)");
        YAxis r4 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r4, "getAxisRight(...)");
        r2.OIX0iXi(r3, r4, this.maxHeight, this.axisMinimum, ContextCompat.getColor(getMActivity(), R.color.line_color));
        CustomBarChartView r1 = getBarChart();
        int r5 = 0;
        r1.setDrawValueAboveBar(false);
        r1.setScaleEnabled(false);
        r1.getDescription().XOO0ii0(false);
        r1.getLegend().XOO0ii0(false);
        XAxis r6 = getBarChart().getXAxis();
        Intrinsics.XXI(r6);
        Context r7 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r7, "getContext(...)");
        r2.OIi0(r6, false, r7);
        r6.IXOIIIO(1.0f);
        ArrayList r8 = new ArrayList();
        Iterator<T> r9 = getMonthDays().iterator();
    L4:
        if (r9.hasNext() == false) goto L6;
        r5 = r5 + 1;
        r9.next();
        r8.add(String.valueOf(r5));
        goto L4
    L6:
        r6.Oi(new q4(r8));
        setChartRenderer();
        getBarChart().setOnChartValueSelectedListener(new OXO1(this));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_month;
    }

    public final void setAxisMinimum(float r1) {
        this.axisMinimum = r1;
    }

    public void setChartRenderer() {
        Oi01X10i r0 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r0.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        getBarChart().setRenderer(r0);
    }

    public abstract void setColor(@aa1 XXX1X11 r1);

    @aa1
    public abstract String setDataLabel();

    public final void setHighlight(float r1) {
        this.highlight = r1;
    }

    public final void setMaxHeight(float r1) {
        this.maxHeight = r1;
    }

    public final void setMonthDays(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.monthDays = r2;
    }

    public final void updateChartData(@aa1 List<BarEntry> r6) {
        Intrinsics.X0O(r6, "values");
        XXX1X11 r1 = null;
        if (getBarChart().getData() != null) goto L5;
    L14:
        XXX1X11 r0 = new XXX1X11(r6, setDataLabel());
        this.setValue = r0;
        setColor(r0);
        XXX1X11 r4 = this.setValue;
        if (r4 != null) goto L17;
        Intrinsics.XXO("setValue");
    L18:
        IXIX1X1 r2 = new IXIX1X1(new XIXi1iX00[]{r1});
        r2.iI(false);
        getBarChart().setData(r2);
    L19:
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        this.highlight = r6.size() / 2;
        Iterator<T> r7 = r6.iterator();
    L21:
        if (r7.hasNext() == false) goto L25;
        BarEntry r3 = (BarEntry) r7.next();
        if (r3.O00() <= 0.0f) goto L21;
        this.highlight = r3.OIX0iXi();
        goto L21
    L25:
        getBarChart().II1Xi0(this.highlight, 0);
        return;
    L17:
        r1 = r4;
        goto L18
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L14;
        T r5 = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
        XXX1X11 r8 = (XXX1X11) r5;
        this.setValue = r8;
        if (r8 != null) goto L9;
        Intrinsics.XXO("setValue");
        r8 = null;
    L9:
        r8.IOX1(r6);
        XXX1X11 r9 = this.setValue;
        if (r9 != null) goto L12;
        Intrinsics.XXO("setValue");
    L13:
        r1.i0X1iIO();
        ((IXIX1X1) getBarChart().getData()).iX();
        getBarChart().X0i1O();
        goto L19
    L12:
        r1 = r9;
        goto L13
    }

    public abstract void updateItemData(@aa1 Entry r1);
}
