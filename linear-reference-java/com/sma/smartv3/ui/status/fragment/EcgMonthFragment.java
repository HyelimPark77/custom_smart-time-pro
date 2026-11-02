package com.sma.smartv3.ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ElectrocardiogramDao;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.model.ECGDataParse;
import com.sma.smartv3.model.ECGDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EcgMonthFragment extends StatusBaseMonthFragment<Electrocardiogram> {

    @aa1
    private final List<ECGDayData> hrDayDataList;

    @aa1
    private final ElectrocardiogramDao mElectrocardiogram;

    public EcgMonthFragment() {
        this.mElectrocardiogram = MyDb.INSTANCE.getMDatabase().electrocardiogramDao();
        this.hrDayDataList = new ArrayList();
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends Electrocardiogram> r8) {
        Intrinsics.X0O(r8, "data");
        super.filterData(r8);
        ECGDataParse.INSTANCE.filterDayData(getMActivity(), r8, getMonthData(), this.hrDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setAxisMinimum(30.0f);
        super.initView();
        getImage().setImageResource(R.drawable.icon_ecg);
        getValueUnit().setText(R.string.bpm);
        getOneTV().setText(R.string.ave_hr);
        getOneUnit().setText(R.string.bpm);
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Electrocardiogram> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Electrocardiogram> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        setMonthDays(O0X11OiO.XiOIO(r8[0], null, 2, null));
        clearCache(r8[0]);
        return this.mElectrocardiogram.getElectrocardiograms(r8[0], r8[1]);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void setChartRenderer() {
        Oi01X10i r0 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r0.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        r0.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.hr_show_1), ContextCompat.getColor(getMActivity(), R.color.hr_show_2)});
        r0.iIiiO(1);
        getBarChart().setRenderer(r0);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))}));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "ecg month Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry r4) {
        Intrinsics.X0O(r4, "e");
        ECGDayData r5 = this.hrDayDataList.get((int) r4.OIX0iXi());
        DINCondBold r0 = getNowValue();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("%s - %s", Arrays.copyOf(new Object[]{UtilsKt.iXiiiO(r5.getMin()), UtilsKt.iXiiiO(r5.getMax())}, 2));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.setText(r2);
        getOneValue().setText(UtilsKt.iXiiiO(r5.getAvg()));
        getTwoValue().setText(r5.getStatus());
    }
}
