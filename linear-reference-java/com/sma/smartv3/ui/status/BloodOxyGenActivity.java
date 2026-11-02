package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.BloodOxyGenDayFragment;
import com.sma.smartv3.ui.status.fragment.BloodOxyGenMonthFragment;
import com.sma.smartv3.ui.status.fragment.BloodOxyGenWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodOxyGenActivity extends StatusBaseActivity {
    public BloodOxyGenActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new BloodOxyGenDayFragment());
        setWeeFragment(new BloodOxyGenWeekFragment());
        setMonthFragment(new BloodOxyGenMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.blood_oxygen);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
