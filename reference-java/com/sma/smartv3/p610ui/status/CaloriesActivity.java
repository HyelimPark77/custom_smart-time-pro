package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.CaloriesDayFragment;
import com.sma.smartv3.p610ui.status.fragment.CaloriesMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.CaloriesWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaloriesActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new CaloriesDayFragment());
        setWeeFragment(new CaloriesWeekFragment());
        setMonthFragment(new CaloriesMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.calories);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
