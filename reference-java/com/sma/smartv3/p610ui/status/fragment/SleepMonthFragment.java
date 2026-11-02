package com.sma.smartv3.p610ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.he6;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.model.SleepDataParse;
import com.sma.smartv3.model.SleepDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepMonthFragment extends StatusBaseMonthFragment<Sleep> {

    @aa1
    private final SleepDao mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();

    @aa1
    private final List<SleepDayData> sleepDayDataList = new ArrayList();

    public static final class OXO1 extends he6 {
        @Override // com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            if (f == 0.0f) {
                return String.valueOf((int) f);
            }
            return ((int) f) + O0X11OiO.iOO1ii1;
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends Sleep> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        this.sleepDayDataList.clear();
        getTwoValue().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        int iFilterDayData = SleepDataParse.INSTANCE.filterDayData(getMActivity(), data, getMonthData(), this.sleepDayDataList, getValues());
        DINCondBold oneValue = getOneValue();
        Intrinsics.O10IXXX0X(oneValue, "<get-oneValue>(...)");
        cp5.O1O(iFilterDayData, oneValue, getMActivity(), 0, 0, 24, null);
        updateChartData(getValues());
        if (getValues().size() == 0) {
            int size = getValues().size();
            DINCondBold nowValue = getNowValue();
            Intrinsics.O10IXXX0X(nowValue, "<get-nowValue>(...)");
            cp5.O1O(size, nowValue, getMActivity(), 0, 0, 24, null);
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        DINCondBold nowValue = getNowValue();
        if (nowValue != null) {
            nowValue.setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        }
        super.initView();
        getImage().setImageResource(R.drawable.icon_sleep);
        getValueUnit().setText("");
        getOneTV().setText(R.string.avg_sleep);
        getOneUnit().setText("");
        getTwoTV().setText(R.string.monitoring_results);
        getTwoUnit().setText("");
        getBarChart().getAxisRight().m603Oi(new OXO1());
        getNowTimeDetails().setVisibility(8);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Sleep> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Sleep> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setMonthDays(O0X11OiO.XiOIO(jArrM787I1[0], null, 2, null));
        long j = jArrM787I1[0];
        long j2 = O0X11OiO.iXiX011;
        clearCache(j - j2);
        return this.mSleepDao.getSleeps(jArrM787I1[0] - j2, jArrM787I1[1] - j2);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.sleep_show_5), ContextCompat.getColor(getMActivity(), R.color.sleep_show_7));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "Sleep month Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        SleepDayData sleepDayData = this.sleepDayDataList.get((int) e.OIX0iXi());
        int total = sleepDayData.getTotal();
        DINCondBold nowValue = getNowValue();
        Intrinsics.O10IXXX0X(nowValue, "<get-nowValue>(...)");
        cp5.O1O(total, nowValue, getMActivity(), 0, 0, 24, null);
        getTwoValue().setText(sleepDayData.getEvaluation());
    }
}
