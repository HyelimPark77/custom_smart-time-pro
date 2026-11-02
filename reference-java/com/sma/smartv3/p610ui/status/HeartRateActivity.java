package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.HeartRateDayFragment;
import com.sma.smartv3.p610ui.status.fragment.HeartRateMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.HeartRateWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRateActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new HeartRateDayFragment());
        setWeeFragment(new HeartRateWeekFragment());
        setMonthFragment(new HeartRateMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.heart_rate);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
