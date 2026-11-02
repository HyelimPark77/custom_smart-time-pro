package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.BloodPressureDayFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodPressureMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodPressureWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodPressureActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new BloodPressureDayFragment());
        setWeeFragment(new BloodPressureWeekFragment());
        setMonthFragment(new BloodPressureMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.blood_pressure);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
