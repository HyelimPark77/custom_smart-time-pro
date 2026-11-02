package com.sma.smartv3.p610ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaloriesMonthFragment extends StatusBaseMonthFragment<Activity> {

    @aa1
    private final ActivityDao mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends Activity> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        int mCalorie = 0;
        int i = 0;
        for (Activity activity : data) {
            getValues().add(new BarEntry(i, activity.getMCalorie()));
            mCalorie += activity.getMCalorie();
            i++;
        }
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(mCalorie)));
        getTwoValue().setText(UtilsKt.Ii1iii0(String.valueOf(mCalorie / i)));
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_calories_info);
        getValueUnit().setText(R.string.kcal);
        getOneTV().setText(R.string.total_calories);
        getOneUnit().setText(R.string.kcal);
        getTwoTV().setText(R.string.average_calories);
        getTwoUnit().setText(R.string.kcal);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Activity> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Activity> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        List<Activity> listASC = this.mActivityDao.getListASC(jArrM787I1[0], jArrM787I1[1]);
        setMonthDays(O0X11OiO.XiOIO(jArrM787I1[0], null, 2, null));
        clearCache(jArrM787I1[0]);
        for (Activity activity : listASC) {
            for (Map.Entry<Long, ArrayList<Activity>> entry : getMonthData().entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Activity> value = entry.getValue();
                if (activity.getMTime() < jLongValue) {
                    value.add(activity);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> it = getMonthData().entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Activity> value2 = it.next().getValue();
            if (value2.isEmpty()) {
                arrayList.add(new Activity(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 1023, null));
            } else {
                Iterator<Activity> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int i2 = 0;
                int i3 = 0;
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    int mCalorie = next.getMCalorie() / 10000;
                    if (i2 <= mCalorie) {
                        i3 += mCalorie - i2;
                    }
                    i2 = mCalorie;
                }
                arrayList.add(new Activity(0, 0L, null, 0, 0, 0, i3, 0, 0, 0, 959, null));
            }
        }
        return arrayList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.calories_show_1), ContextCompat.getColor(getMActivity(), R.color.calories_show_2));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "Calories month Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) e.O00())));
    }
}
