package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.EcgDayFragment;
import com.sma.smartv3.p610ui.status.fragment.EcgMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.EcgWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ElectrocardiogramActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new EcgDayFragment());
        setWeeFragment(new EcgWeekFragment());
        setMonthFragment(new EcgMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.electrocardiogram);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
