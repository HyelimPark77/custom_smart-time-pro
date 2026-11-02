package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.BloodPressureDayFragment;
import com.sma.smartv3.ui.status.fragment.BloodPressureMonthFragment;
import com.sma.smartv3.ui.status.fragment.BloodPressureWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodPressureActivity extends StatusBaseActivity {
    public BloodPressureActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new BloodPressureDayFragment());
        setWeeFragment(new BloodPressureWeekFragment());
        setMonthFragment(new BloodPressureMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.blood_pressure);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
