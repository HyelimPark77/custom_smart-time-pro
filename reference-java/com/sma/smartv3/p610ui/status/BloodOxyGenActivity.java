package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.BloodOxyGenDayFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodOxyGenMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodOxyGenWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodOxyGenActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new BloodOxyGenDayFragment());
        setWeeFragment(new BloodOxyGenWeekFragment());
        setMonthFragment(new BloodOxyGenMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.blood_oxygen);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
