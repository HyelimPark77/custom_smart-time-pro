package com.sma.smartv3.ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.he6;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepMonthFragment extends StatusBaseMonthFragment<Sleep> {

    @aa1
    private final SleepDao mSleepDao;

    @aa1
    private final List<SleepDayData> sleepDayDataList;

    public static final class OXO1 extends he6 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            if (r2 != 0.0f) goto L7;
            return String.valueOf((int) r2);
        L7:
            return ((int) r2) + O0X11OiO.iOO1ii1;
        }
    }

    public SleepMonthFragment() {
        this.mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
        this.sleepDayDataList = new ArrayList();
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends Sleep> r15) {
        Intrinsics.X0O(r15, "data");
        super.filterData(r15);
        this.sleepDayDataList.clear();
        getTwoValue().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        int r7 = SleepDataParse.INSTANCE.filterDayData(getMActivity(), r15, getMonthData(), this.sleepDayDataList, getValues());
        DINCondBold r8 = getOneValue();
        Intrinsics.O10IXXX0X(r8, "<get-oneValue>(...)");
        cp5.O1O(r7, r8, getMActivity(), 0, 0, 24, null);
        updateChartData(getValues());
        if (getValues().size() != 0) goto L6;
        int r1 = getValues().size();
        DINCondBold r2 = getNowValue();
        Intrinsics.O10IXXX0X(r2, "<get-nowValue>(...)");
        cp5.O1O(r1, r2, getMActivity(), 0, 0, 24, null);
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        DINCondBold r0 = getNowValue();
        if (r0 == null) goto L5;
        r0.setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    L5:
        super.initView();
        getImage().setImageResource(R.drawable.icon_sleep);
        getValueUnit().setText("");
        getOneTV().setText(R.string.avg_sleep);
        getOneUnit().setText("");
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
        getBarChart().getAxisRight().Oi(new OXO1());
        getNowTimeDetails().setVisibility(8);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Sleep> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Sleep> onTimePeriodChange(@aa1 Calendar r7, int r8, @aa1 TimePeriod r9) {
        Intrinsics.X0O(r7, "calendar");
        Intrinsics.X0O(r9, "timePeriod");
        long[] r10 = O0X11OiO.I1(r7, r9, r8);
        setMonthDays(O0X11OiO.XiOIO(r10[0], null, 2, null));
        long r0 = r10[0];
        long r2 = O0X11OiO.iXiX011;
        clearCache(r0 - r2);
        return this.mSleepDao.getSleeps(r10[0] - r2, r10[1] - r2);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.sleep_show_5), ContextCompat.getColor(getMActivity(), R.color.sleep_show_7));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "Sleep month Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry r8) {
        Intrinsics.X0O(r8, "e");
        SleepDayData r9 = this.sleepDayDataList.get((int) r8.OIX0iXi());
        int r0 = r9.getTotal();
        DINCondBold r1 = getNowValue();
        Intrinsics.O10IXXX0X(r1, "<get-nowValue>(...)");
        cp5.O1O(r0, r1, getMActivity(), 0, 0, 24, null);
        getTwoValue().setText(r9.getEvaluation());
    }
}
