package com.sma.smartv3.ui.status.base;

import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IIXXi1;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X01I1OX1i;
import com.android.mltcode.paycertificationapi.X0i0;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iXX;
import com.android.mltcode.paycertificationapi.iXi1;
import com.android.mltcode.paycertificationapi.ii0I0;
import com.android.mltcode.paycertificationapi.iiO;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.TimeUtils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nActivityBaseDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1869#2,2:191\n*S KotlinDebug\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n*L\n166#1:191,2\n*E\n"})
public class ActivityBaseDayFragment extends BaseDetailDaysFragment<Activity> {

    @aa1
    private final Lazy barChart$delegate;

    @aa1
    private LinkedHashMap<Long, ArrayList<Activity>> filterData;
    private float highlight;

    @aa1
    private final ActivityDao mActivityDao;

    @aa1
    private final Lazy oneTV$delegate;

    @aa1
    private final Lazy oneValue$delegate;
    public XXX1X11 setValue;

    @aa1
    private final Lazy totalUnit$delegate;

    @aa1
    private final Lazy twoTV$delegate;

    @aa1
    private final Lazy twoUnit$delegate;

    @aa1
    private final Lazy twoValue$delegate;

    @aa1
    private final List<BarEntry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ ActivityBaseDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(ActivityBaseDayFragment r1, SimpleDateFormat r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r6, X110O r7) {
            Intrinsics.X0O(r6, "e");
            Intrinsics.X0O(r7, "h");
            this.OXO1.updateItemData(r6);
            this.OXO1.getMCalendar().set(11, (int) r6.OIX0iXi());
            DINCondBold r8 = this.OXO1.getNowTimeDetails();
            ActivityBaseDayFragment r9 = this.OXO1;
            r8.setText(r9.getString(R.string.time_range, new Object[]{TimeUtils.millis2String(r9.getMCalendar().getTimeInMillis(), this.XIi00iiXO), TimeUtils.millis2String(this.OXO1.getMCalendar().getTimeInMillis() + ((long) TimeConstants.HOUR), this.XIi00iiXO)}));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public ActivityBaseDayFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new X01I1OX1i(this));
        this.oneValue$delegate = LazyKt__LazyJVMKt.iO(new ii0I0(this));
        this.oneTV$delegate = LazyKt__LazyJVMKt.iO(new X0i0(this));
        this.totalUnit$delegate = LazyKt__LazyJVMKt.iO(new iiO(this));
        this.twoValue$delegate = LazyKt__LazyJVMKt.iO(new iXi1(this));
        this.twoTV$delegate = LazyKt__LazyJVMKt.iO(new iXX(this));
        this.twoUnit$delegate = LazyKt__LazyJVMKt.iO(new IIXXi1(this));
        this.values = new ArrayList();
        this.filterData = new LinkedHashMap();
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        this.highlight = 3.0f;
    }

    public static /* synthetic */ DINCondBold I1XOi1(ActivityBaseDayFragment r0) {
        return twoValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ BarChart IIX1OXO(ActivityBaseDayFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(ActivityBaseDayFragment r0) {
        return twoUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(ActivityBaseDayFragment r0) {
        return oneValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1ii(ActivityBaseDayFragment r0) {
        return twoTV_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(ActivityBaseDayFragment r0) {
        return oneTV_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIO(ActivityBaseDayFragment r0) {
        return totalUnit_delegate$lambda$0(r0);
    }

    private static final BarChart barChart_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (BarChart) r1.getMView().findViewById(R.id.barChart);
    }

    private final BarChart getBarChart() {
        return (BarChart) getValue();
    }

    private static final PFMedium oneTV_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.oneTV);
    }

    private static final DINCondBold oneValue_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.oneValue);
    }

    private static final PFMedium totalUnit_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.oneUnit);
    }

    private static final PFMedium twoTV_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.twoTV);
    }

    private static final PFMedium twoUnit_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.twoUnit);
    }

    private static final DINCondBold twoValue_delegate$lambda$0(ActivityBaseDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.twoValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData() {
        Iterator<BarEntry> r1 = this.values.iterator();
        float r3 = 0.0f;
    L4:
        if (r1.hasNext() == false) goto L8;
        BarEntry r4 = r1.next();
        if (r3 >= r4.O00()) goto L4;
        r3 = r4.O00();
        goto L4
    L8:
        iO1Xi1X1i r2 = iO1Xi1X1i.OXO1;
        YAxis r5 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r5, "getAxisLeft(...)");
        YAxis r6 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r6, "getAxisRight(...)");
        r2.IiI10X(r5, r6, r3);
        if (getBarChart().getData() != 0) goto L11;
    L13:
        setSetValue(new XXX1X11(this.values, setDataLabel()));
        setColor(getSetValue());
        IXIX1X1 r7 = new IXIX1X1(new XIXi1iX00[]{getSetValue()});
        r7.iI(false);
        getBarChart().setData(r7);
    L14:
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        Iterator<T> r8 = this.values.iterator();
    L16:
        if (r8.hasNext() == false) goto L20;
        BarEntry r9 = (BarEntry) r8.next();
        if (r9.O00() <= 0.0f) goto L16;
        this.highlight = r9.OIX0iXi();
        goto L16
    L20:
        getBarChart().II1Xi0(this.highlight, 0);
        return;
    L11:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L13;
        T r10 = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r10, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
        setSetValue((XXX1X11) r10);
        getSetValue().IOX1(this.values);
        getSetValue().i0X1iIO();
        ((IXIX1X1) getBarChart().getData()).iX();
        getBarChart().X0i1O();
        goto L14
    }

    @CallSuper
    public void filterData(@aa1 List<Activity> r2) {
        Intrinsics.X0O(r2, "data");
        this.values.clear();
    }

    @aa1
    public final LinkedHashMap<Long, ArrayList<Activity>> getFilterData() {
        return this.filterData;
    }

    public final float getHighlight() {
        return this.highlight;
    }

    public final PFMedium getOneTV() {
        return (PFMedium) getValue();
    }

    public final DINCondBold getOneValue() {
        return (DINCondBold) getValue();
    }

    @aa1
    public final XXX1X11 getSetValue() {
        XXX1X11 r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    public final PFMedium getTotalUnit() {
        return (PFMedium) getValue();
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
    public void initView() {
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        BarChart r1 = getBarChart();
        Intrinsics.O10IXXX0X(r1, "<get-barChart>(...)");
        r0.OXO1(r1);
        YAxis r2 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r2, "getAxisLeft(...)");
        YAxis r3 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r3, "getAxisRight(...)");
        r0.OIX0iXi(r2, r3, 0.0f, 0.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        BarChart r4 = getBarChart();
        r4.setDrawValueAboveBar(false);
        r4.setScaleEnabled(false);
        r4.getDescription().XOO0ii0(false);
        r4.getLegend().XOO0ii0(false);
        XAxis r5 = getBarChart().getXAxis();
        Intrinsics.XXI(r5);
        Context r6 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        r0.OIi0(r5, false, r6);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        r5.IXOIIIO(4.0f);
        r5.i0X000X0O(-1.0f);
        r5.iOiXi11II(25.0f);
        SimpleDateFormat r7 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList r8 = new ArrayList();
        int r9 = 0;
    L4:
        if (r9 >= 25) goto L11;
        String r10 = TimeUtils.millis2String(getRange()[0] + (((long) (r9 * 3600)) * 1000), r7);
        if (r8.size() <= 12) goto L10;
        if (Intrinsics.XOO0ii0(r10, "0") == false) goto L10;
        r10 = X10i1i.XOOXII;
    L10:
        Intrinsics.XXI(r10);
        r8.add(r10);
        r9 = r9 + 1;
        goto L4
    L11:
        r5.Oi(new q4(r8));
        Oi01X10i r11 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r11.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        getBarChart().setRenderer(r11);
        getBarChart().setOnChartValueSelectedListener(new OXO1(this, O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Activity> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
        updateChartData();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Activity> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        this.filterData.clear();
        int r8 = 1;
    L4:
        if (r8 >= 25) goto L7;
        this.filterData.put(Long.valueOf(getRange()[0] + ((long) (TimeConstants.HOUR * r8))), new ArrayList());
        r8 = r8 + 1;
        goto L4
    L7:
        return this.mActivityDao.getListASC(getRange()[0] + ((long) 1000), getRange()[1]);
    }

    public void setColor(@aa1 XXX1X11 r2) {
        Intrinsics.X0O(r2, "value");
    }

    @aa1
    public String setDataLabel() {
        return "";
    }

    public final void setFilterData(@aa1 LinkedHashMap<Long, ArrayList<Activity>> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.filterData = r2;
    }

    public final void setHighlight(float r1) {
        this.highlight = r1;
    }

    public final void setSetValue(@aa1 XXX1X11 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
    }
}
