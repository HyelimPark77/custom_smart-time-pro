package com.sma.smartv3.p610ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.he6;
import com.blankj.utilcode.util.LogUtils;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepAllDayWeekFragment extends StatusBaseWeekFragment<Sleep> {

    @aa1
    private final SleepDao mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();

    @aa1
    private final List<SleepAllDayData> sleepDayDataList = new ArrayList();

    public static final class OXO1 extends he6 {
        @Override // com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            if (f == 0.0f) {
                return String.valueOf((int) f);
            }
            return ((int) f) + O0X11OiO.iOO1ii1;
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Sleep> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        this.sleepDayDataList.clear();
        getTwoValue().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        SleepAllDayDataParse.INSTANCE.filterDayData(getMActivity(), data, getWeekData(), this.sleepDayDataList, getValues());
        updateChartData(getValues());
        if (getValues().size() == 0) {
            int size = getValues().size();
            DINCondBold nowValue = getNowValue();
            Intrinsics.O10IXXX0X(nowValue, "<get-nowValue>(...)");
            cp5.O1O(size, nowValue, getMActivity(), 0, 0, 24, null);
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getOneLl().setVisibility(8);
        getImage().setImageResource(R.drawable.icon_sleep);
        getValueUnit().setText("");
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
        LogUtils.m11128d("week => " + jArrM787I1[0] + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + jArrM787I1[1]);
        SimpleDateFormat simpleDateFormatIO0iXO0O = O0X11OiO.IO0iXO0O();
        long j = jArrM787I1[0];
        long j2 = (long) O0X11OiO.iXiX011;
        LogUtils.m11128d("week => " + simpleDateFormatIO0iXO0O.format(Long.valueOf(j - j2)) + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + O0X11OiO.IO0iXO0O().format(Long.valueOf(jArrM787I1[1])));
        setWeekDay(O0X11OiO.IXXOO(jArrM787I1[0]));
        clearCache(jArrM787I1[0]);
        return this.mSleepDao.getSleeps(jArrM787I1[0] - j2, jArrM787I1[1]);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.sleep_show_5), ContextCompat.getColor(getMActivity(), R.color.sleep_show_7));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "sleep week Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        SleepAllDayData sleepAllDayData = this.sleepDayDataList.get((int) e.OIX0iXi());
        int total = sleepAllDayData.getTotal();
        DINCondBold nowValue = getNowValue();
        Intrinsics.O10IXXX0X(nowValue, "<get-nowValue>(...)");
        cp5.O1O(total, nowValue, getMActivity(), 0, 0, 24, null);
        getTwoValue().setText(sleepAllDayData.getEvaluation());
    }
}
