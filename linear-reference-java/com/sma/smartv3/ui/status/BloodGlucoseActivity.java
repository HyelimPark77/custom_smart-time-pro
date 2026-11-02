package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.BloodGlucoseDayFragment;
import com.sma.smartv3.ui.status.fragment.BloodGlucoseMonthFragment;
import com.sma.smartv3.ui.status.fragment.BloodGlucoseWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseActivity extends StatusBaseActivity {
    public BloodGlucoseActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new BloodGlucoseDayFragment());
        setWeeFragment(new BloodGlucoseWeekFragment());
        setMonthFragment(new BloodGlucoseMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.blood_glucose);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
