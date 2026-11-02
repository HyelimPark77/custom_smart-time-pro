package com.sma.smartv3.ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.model.BPDataParse;
import com.sma.smartv3.model.BPDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseWeekFragment;
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
public final class BloodPressureWeekFragment extends StatusBaseWeekFragment<BloodPressure> {

    @aa1
    private final List<BPDayData> bpDayDataList;

    @aa1
    private final BloodPressureDao mBloodPressureDao;

    public BloodPressureWeekFragment() {
        this.mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();
        this.bpDayDataList = new ArrayList();
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends BloodPressure> r8) {
        Intrinsics.X0O(r8, "data");
        super.filterData(r8);
        BPDataParse.INSTANCE.filterDayData(getMActivity(), r8, getWeekData(), this.bpDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setAxisMinimum(50.0f);
        super.initView();
        getOneLl().setVisibility(8);
        getImage().setImageResource(R.drawable.icon_bp);
        getValueUnit().setText(getString(R.string.mmhg));
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodPressure> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodPressure> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        setWeekDay(O0X11OiO.IXXOO(r8[0]));
        clearCache(r8[0]);
        return this.mBloodPressureDao.getBloodPressures(r8[0], r8[1]);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setChartRenderer() {
        Oi01X10i r0 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r0.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        r0.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.bp_color), ContextCompat.getColor(getMActivity(), R.color.bp_secondary_color)});
        r0.iIiiO(1);
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
        return "BP week Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry r4) {
        Intrinsics.X0O(r4, "e");
        BPDayData r5 = this.bpDayDataList.get((int) r4.OIX0iXi());
        DINCondBold r0 = getNowValue();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("%d / %d", Arrays.copyOf(new Object[]{Integer.valueOf(r5.getSbpMax()), Integer.valueOf(r5.getDbpMin())}, 2));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.setText(r2);
        getTwoValue().setText(r5.getStatus());
    }
}
