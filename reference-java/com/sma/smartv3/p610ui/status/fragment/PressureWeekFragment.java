package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.model.PressureDataKt;
import com.sma.smartv3.model.PressureDataParse;
import com.sma.smartv3.model.PressureDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.p610ui.status.fragment.PressureWeekFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PressureWeekFragment extends StatusBaseWeekFragment<Pressure> {

    @aa1
    private final PressureDao mPressureDao = MyDb.INSTANCE.getMDatabase().pressureDao();

    @aa1
    private final List<PressureDayData> pressureDayDataList = new ArrayList();

    @aa1
    private final Lazy mSbv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a52
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureWeekFragment.mSbv_delegate$lambda$0(this.f5423IO);
        }
    });

    private final CircleThumbSegmentedBarView getMSbv() {
        return (CircleThumbSegmentedBarView) this.mSbv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleThumbSegmentedBarView mSbv_delegate$lambda$0(PressureWeekFragment pressureWeekFragment) {
        return (CircleThumbSegmentedBarView) pressureWeekFragment.getMView().findViewById(R.id.sbv);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Pressure> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        PressureDataParse.INSTANCE.filterDayData(getMActivity(), data, getWeekData(), this.pressureDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_pressure);
        getValueUnit().setText("");
        getOneTV().setText(R.string.ave_value);
        getOneUnit().setText("");
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
        Context context = getContext();
        Intrinsics.XXI(context);
        CircleThumbSegmentedBarView mSbv = getMSbv();
        Intrinsics.O10IXXX0X(mSbv, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbv(context, mSbv);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_pressure_week;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Pressure> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Pressure> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setWeekDay(O0X11OiO.IXXOO(jArrM787I1[0]));
        clearCache(jArrM787I1[0]);
        return this.mPressureDao.getPressures(jArrM787I1[0], jArrM787I1[1]);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setChartRenderer() {
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.p_show_1), ContextCompat.getColor(getMActivity(), R.color.p_show_2)});
        oi01X10i.iIiiO(5);
        getBarChart().setRenderer(oi01X10i);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "Pressure week Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        PressureDayData pressureDayData = this.pressureDayDataList.get((int) e.OIX0iXi());
        getNowValue().setText(UtilsKt.m38849iX(pressureDayData.getMin(), pressureDayData.getMax()));
        getValueUnit().setText("");
        getOneValue().setText(UtilsKt.iXiiiO(pressureDayData.getAvg()));
        getTwoValue().setText(UtilsKt.Ii1iii0(pressureDayData.getStatus()));
        CircleThumbSegmentedBarView mSbv = getMSbv();
        Intrinsics.O10IXXX0X(mSbv, "<get-mSbv>(...)");
        PressureDataKt.setPressureSbvValue(mSbv, pressureDayData.getAvg());
    }
}
