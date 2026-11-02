package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.CaloriesDayFragment;
import com.sma.smartv3.ui.status.fragment.CaloriesMonthFragment;
import com.sma.smartv3.ui.status.fragment.CaloriesWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaloriesActivity extends StatusBaseActivity {
    public CaloriesActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new CaloriesDayFragment());
        setWeeFragment(new CaloriesWeekFragment());
        setMonthFragment(new CaloriesMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.calories);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
