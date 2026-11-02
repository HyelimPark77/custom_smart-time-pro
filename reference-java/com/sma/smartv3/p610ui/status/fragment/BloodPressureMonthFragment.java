package com.sma.smartv3.p610ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.model.BPDataParse;
import com.sma.smartv3.model.BPDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodPressureMonthFragment extends StatusBaseMonthFragment<BloodPressure> {

    @aa1
    private final BloodPressureDao mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();

    @aa1
    private final List<BPDayData> bpDayDataList = new ArrayList();

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends BloodPressure> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        BPDataParse.INSTANCE.filterDayData(getMActivity(), data, getMonthData(), this.bpDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setAxisMinimum(50.0f);
        super.initView();
        getOneLl().setVisibility(8);
        getImage().setImageResource(R.drawable.icon_bp);
        getValueUnit().setText(getString(R.string.mmhg));
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodPressure> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodPressure> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setMonthDays(O0X11OiO.XiOIO(jArrM787I1[0], null, 2, null));
        clearCache(jArrM787I1[0]);
        return this.mBloodPressureDao.getBloodPressures(jArrM787I1[0], jArrM787I1[1]);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void setChartRenderer() {
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.bp_color), ContextCompat.getColor(getMActivity(), R.color.bp_secondary_color)});
        oi01X10i.iIiiO(1);
        getBarChart().setRenderer(oi01X10i);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "BP month Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        BPDayData bPDayData = this.bpDayDataList.get((int) e.OIX0iXi());
        DINCondBold nowValue = getNowValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%d / %d", Arrays.copyOf(new Object[]{Integer.valueOf(bPDayData.getSbpMax()), Integer.valueOf(bPDayData.getDbpMin())}, 2));
        Intrinsics.O10IXXX0X(str, "format(...)");
        nowValue.setText(str);
        getTwoValue().setText(bPDayData.getStatus());
    }
}
