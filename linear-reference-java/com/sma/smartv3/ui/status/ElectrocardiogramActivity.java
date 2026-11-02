package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.EcgDayFragment;
import com.sma.smartv3.ui.status.fragment.EcgMonthFragment;
import com.sma.smartv3.ui.status.fragment.EcgWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ElectrocardiogramActivity extends StatusBaseActivity {
    public ElectrocardiogramActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new EcgDayFragment());
        setWeeFragment(new EcgWeekFragment());
        setMonthFragment(new EcgMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.electrocardiogram);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
