package com.sma.smartv3.ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaloriesDayFragment extends ActivityBaseDayFragment {
    public CaloriesDayFragment() {
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> r11) {
        Intrinsics.X0O(r11, "data");
        super.filterData(r11);
        if (r11.isEmpty() == false) goto L5;
        getTwoValue().setText(UtilsKt.Ii1iii0("0"));
    L6:
        Iterator<Activity> r0 = r11.iterator();
    L8:
        if (r0.hasNext() == false) goto L15;
        Activity r1 = r0.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r2 = getFilterData().entrySet().iterator();
    L11:
        if (r2.hasNext() == false) goto L8;
        Map.Entry<Long, ArrayList<Activity>> r3 = r2.next();
        long r4 = r3.getKey().longValue();
        ArrayList<Activity> r5 = r3.getValue();
        if (r1.getMTime() > r4) goto L11;
        r5.add(r1);
        goto L8
    L15:
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r6 = getFilterData().entrySet().iterator();
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
    L17:
        if (r6.hasNext() == false) goto L35;
        ArrayList<Activity> r10 = r6.next().getValue();
        if (r10.isEmpty() == false) goto L21;
        int r12 = 0;
    L34:
        getValues().add(new BarEntry(r8, r12));
        r8 = r8 + 1;
        goto L17
    L21:
        Iterator<Activity> r13 = r10.iterator();
        Intrinsics.O10IXXX0X(r13, "iterator(...)");
        r12 = 0;
        int r14 = 0;
    L23:
        if (r13.hasNext() == false) goto L33;
        Activity r15 = r13.next();
        Intrinsics.O10IXXX0X(r15, "next(...)");
        int r16 = r15.getMCalorie() / 10000;
        if (r14 > r16) goto L32;
        if (r14 != 0) goto L30;
        if (r9 == 0) goto L30;
        if (r16 < r9) goto L30;
        int r17 = r16 - r9;
    L31:
        r12 = r12 + r17;
    L30:
        r17 = r16 - r14;
    L32:
        r14 = r16;
        goto L23
    L33:
        r9 = ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(r10)).getMCalorie() / 10000;
        goto L34
    L35:
        Iterator<Activity> r18 = r11.iterator();
        int r19 = 0;
    L37:
        if (r18.hasNext() == false) goto L42;
        int r20 = r18.next().getMCalorie() / 10000;
        if (r19 > r20) goto L41;
        r7 = r7 + (r20 - r19);
    L41:
        r19 = r20;
        goto L37
    L42:
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(r7)));
        return;
    L5:
        getTwoValue().setText(String.valueOf(r11.get(r11.size() - 1).getMCalorie() / 10000));
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_calories_info);
        getValueUnit().setText(R.string.kcal);
        getOneTV().setText(R.string.total_calories);
        getTotalUnit().setText(R.string.kcal);
        getTwoTV().setText(R.string.current_device_total_calories);
        getTwoUnit().setText(R.string.kcal);
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.calories_show_1), ContextCompat.getColor(getMActivity(), R.color.calories_show_2));
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Calories day Data";
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) r2.O00())));
    }
}
