package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a52;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.model.PressureDataKt;
import com.sma.smartv3.model.PressureDataParse;
import com.sma.smartv3.model.PressureDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PressureWeekFragment extends StatusBaseWeekFragment<Pressure> {

    @aa1
    private final PressureDao mPressureDao;

    @aa1
    private final Lazy mSbv$delegate;

    @aa1
    private final List<PressureDayData> pressureDayDataList;

    public PressureWeekFragment() {
        this.mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();
        this.pressureDayDataList = new ArrayList();
        this.mSbv$delegate = LazyKt__LazyJVMKt.iO(new a52(this));
    }

    public static /* synthetic */ CircleThumbSegmentedBarView XX0(PressureWeekFragment r0) {
        return mSbv_delegate$lambda$0(r0);
    }

    private final CircleThumbSegmentedBarView getMSbv() {
        return (CircleThumbSegmentedBarView) getValue();
    }

    private static final CircleThumbSegmentedBarView mSbv_delegate$lambda$0(PressureWeekFragment r1) {
        return (CircleThumbSegmentedBarView) r1.getMView().findViewById(R.id.sbv);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Pressure> r8) {
        Intrinsics.X0O(r8, "data");
        super.filterData(r8);
        PressureDataParse.INSTANCE.filterDayData(getMActivity(), r8, getWeekData(), this.pressureDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_pressure);
        getValueUnit().setText("");
        getOneTV().setText(R.string.ave_value);
        getOneUnit().setText("");
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
        Context r0 = getContext();
        Intrinsics.XXI(r0);
        CircleThumbSegmentedBarView r1 = getMSbv();
        Intrinsics.O10IXXX0X(r1, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbv(r0, r1);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_pressure_week;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Pressure> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Pressure> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        setWeekDay(O0X11OiO.IXXOO(r8[0]));
        clearCache(r8[0]);
        return this.mPressureDao.getPressures(r8[0], r8[1]);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setChartRenderer() {
        Oi01X10i r0 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r0.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        r0.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.p_show_1), ContextCompat.getColor(getMActivity(), R.color.p_show_2)});
        r0.iIiiO(5);
        getBarChart().setRenderer(r0);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))}));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "Pressure week Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry r4) {
        Intrinsics.X0O(r4, "e");
        PressureDayData r5 = this.pressureDayDataList.get((int) r4.OIX0iXi());
        getNowValue().setText(UtilsKt.iX(r5.getMin(), r5.getMax()));
        getValueUnit().setText("");
        getOneValue().setText(UtilsKt.iXiiiO(r5.getAvg()));
        getTwoValue().setText(UtilsKt.Ii1iii0(r5.getStatus()));
        CircleThumbSegmentedBarView r0 = getMSbv();
        Intrinsics.O10IXXX0X(r0, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(r0, r5.getAvg());
    }
}
