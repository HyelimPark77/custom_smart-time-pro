package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.HeartRateDayFragment;
import com.sma.smartv3.ui.status.fragment.HeartRateMonthFragment;
import com.sma.smartv3.ui.status.fragment.HeartRateWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRateActivity extends StatusBaseActivity {
    public HeartRateActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new HeartRateDayFragment());
        setWeeFragment(new HeartRateWeekFragment());
        setMonthFragment(new HeartRateMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.heart_rate);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
