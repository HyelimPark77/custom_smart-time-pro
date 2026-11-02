package com.sma.smartv3.p610ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.model.HRDataParse;
import com.sma.smartv3.model.HRDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRateWeekFragment extends StatusBaseWeekFragment<HeartRate> {

    @aa1
    private final HeartRateDao mHeartRateDao = MyDb.INSTANCE.getMDatabase().heartRateDao();

    @aa1
    private final List<HRDayData> hrDayDataList = new ArrayList();

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends HeartRate> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        HRDataParse.INSTANCE.filterDayData(getMActivity(), data, getWeekData(), this.hrDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setAxisMinimum(30.0f);
        super.initView();
        getImage().setImageResource(R.drawable.icon_hr);
        getValueUnit().setText(R.string.bpm);
        getOneTV().setText(R.string.ave_hr);
        getOneUnit().setText(R.string.bpm);
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<HeartRate> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<HeartRate> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setWeekDay(O0X11OiO.IXXOO(jArrM787I1[0]));
        clearCache(jArrM787I1[0]);
        return this.mHeartRateDao.getHeartRates(jArrM787I1[0], jArrM787I1[1]);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setChartRenderer() {
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.hr_show_1), ContextCompat.getColor(getMActivity(), R.color.hr_show_2)});
        oi01X10i.iIiiO(1);
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
        return "HR week Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        HRDayData hRDayData = this.hrDayDataList.get((int) e.OIX0iXi());
        getNowValue().setText(UtilsKt.m38849iX(hRDayData.getMin(), hRDayData.getMax()));
        getOneValue().setText(UtilsKt.iXiiiO(hRDayData.getAvg()));
        getTwoValue().setText(hRDayData.getStatus());
    }
}
