package com.sma.smartv3.p610ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaloriesDayFragment extends ActivityBaseDayFragment {
    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> data) {
        int i;
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        if (data.isEmpty()) {
            getTwoValue().setText(UtilsKt.Ii1iii0("0"));
        } else {
            getTwoValue().setText(String.valueOf(data.get(data.size() - 1).getMCalorie() / 10000));
        }
        for (Activity activity : data) {
            for (Map.Entry<Long, ArrayList<Activity>> entry : getFilterData().entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Activity> value = entry.getValue();
                if (activity.getMTime() <= jLongValue) {
                    value.add(activity);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, ArrayList<Activity>>> it = getFilterData().entrySet().iterator();
        int i2 = 0;
        int i3 = 0;
        int mCalorie = 0;
        while (it.hasNext()) {
            ArrayList<Activity> value2 = it.next().getValue();
            if (value2.isEmpty()) {
                i = 0;
            } else {
                Iterator<Activity> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                i = 0;
                int i4 = 0;
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    int mCalorie2 = next.getMCalorie() / 10000;
                    if (i4 <= mCalorie2) {
                        i += (i4 != 0 || mCalorie == 0 || mCalorie2 < mCalorie) ? mCalorie2 - i4 : mCalorie2 - mCalorie;
                    }
                    i4 = mCalorie2;
                }
                mCalorie = ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(value2)).getMCalorie() / 10000;
            }
            getValues().add(new BarEntry(i3, i));
            i3++;
        }
        Iterator<Activity> it3 = data.iterator();
        int i5 = 0;
        while (it3.hasNext()) {
            int mCalorie3 = it3.next().getMCalorie() / 10000;
            if (i5 <= mCalorie3) {
                i2 += mCalorie3 - i5;
            }
            i5 = mCalorie3;
        }
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(i2)));
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_calories_info);
        getValueUnit().setText(R.string.kcal);
        getOneTV().setText(R.string.total_calories);
        getTotalUnit().setText(R.string.kcal);
        getTwoTV().setText(R.string.current_device_total_calories);
        getTwoUnit().setText(R.string.kcal);
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.calories_show_1), ContextCompat.getColor(getMActivity(), R.color.calories_show_2));
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Calories day Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) e.O00())));
    }
}
