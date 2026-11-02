package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.HrvDayFragment;
import com.sma.smartv3.ui.status.fragment.HrvMonthFragment;
import com.sma.smartv3.ui.status.fragment.HrvWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HrvActivity extends StatusBaseActivity {
    public HrvActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new HrvDayFragment());
        setWeeFragment(new HrvWeekFragment());
        setMonthFragment(new HrvMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.hrv);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
