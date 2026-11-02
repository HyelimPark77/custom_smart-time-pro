package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucoseDayFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucoseMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucoseWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new BloodGlucoseDayFragment());
        setWeeFragment(new BloodGlucoseWeekFragment());
        setMonthFragment(new BloodGlucoseMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.blood_glucose);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
