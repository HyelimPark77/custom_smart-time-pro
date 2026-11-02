package com.sma.smartv3.ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaloriesWeekFragment extends StatusBaseWeekFragment<Activity> {

    @aa1
    private final ActivityDao mActivityDao;

    public CaloriesWeekFragment() {
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Activity> r8) {
        Intrinsics.X0O(r8, "data");
        super.filterData(r8);
        Iterator<? extends Activity> r9 = r8.iterator();
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r9.hasNext() == false) goto L6;
        Activity r2 = r9.next();
        getValues().add(new BarEntry(r1, r2.getMCalorie()));
        r0 = r0 + r2.getMCalorie();
        r1 = r1 + 1;
        goto L4
    L6:
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(r0)));
        getTwoValue().setText(UtilsKt.Ii1iii0(String.valueOf(r0 / r1)));
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_calories_info);
        getValueUnit().setText(R.string.kcal);
        getOneTV().setText(R.string.total_calories);
        getOneUnit().setText(R.string.kcal);
        getTwoTV().setText(R.string.average_calories);
        getTwoUnit().setText(R.string.kcal);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Activity> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Activity> onTimePeriodChange(@aa1 Calendar r21, int r22, @aa1 TimePeriod r23) {
        Intrinsics.X0O(r21, "calendar");
        Intrinsics.X0O(r23, "timePeriod");
        long[] r1 = O0X11OiO.I1(r21, r23, r22);
        List<Activity> r2 = this.mActivityDao.getListASC(r1[0], r1[1]);
        setWeekDay(O0X11OiO.IXXOO(r1[0]));
        clearCache(r1[0]);
        Iterator<Activity> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L11;
        Activity r4 = r3.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r5 = getWeekData().entrySet().iterator();
    L7:
        if (r5.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<Activity>> r6 = r5.next();
        long r7 = r6.getKey().longValue();
        ArrayList<Activity> r8 = r6.getValue();
        if (r4.getMTime() >= r7) goto L7;
        r8.add(r4);
        goto L4
    L11:
        ArrayList r9 = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r10 = getWeekData().entrySet().iterator();
    L13:
        if (r10.hasNext() == false) goto L25;
        ArrayList<Activity> r11 = r10.next().getValue();
        if (r11.isEmpty() == true) goto L16;
        Iterator<Activity> r12 = r11.iterator();
        Intrinsics.O10IXXX0X(r12, "iterator(...)");
        int r13 = 0;
        int r14 = 0;
    L19:
        if (r12.hasNext() == false) goto L24;
        Activity r15 = r12.next();
        Intrinsics.O10IXXX0X(r15, "next(...)");
        int r16 = r15.getMCalorie() / 10000;
        if (r13 > r16) goto L23;
        r14 = r14 + (r16 - r13);
    L23:
        r13 = r16;
        goto L19
    L24:
        r9.add(new Activity(0, 0, null, 0, 0, 0, r14, 0, 0, 0, 959, null));
        goto L13
    L16:
        r9.add(new Activity(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 1023, null));
        goto L13
    L25:
        return r9;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.calories_show_1), ContextCompat.getColor(getMActivity(), R.color.calories_show_2));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "Calories week Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) r2.O00())));
    }
}
