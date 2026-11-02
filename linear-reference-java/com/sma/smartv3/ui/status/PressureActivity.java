package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.PressureDayFragment;
import com.sma.smartv3.ui.status.fragment.PressureMonthFragment;
import com.sma.smartv3.ui.status.fragment.PressureWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PressureActivity extends StatusBaseActivity {
    public PressureActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new PressureDayFragment());
        setWeeFragment(new PressureWeekFragment());
        setMonthFragment(new PressureMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.pressure);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
