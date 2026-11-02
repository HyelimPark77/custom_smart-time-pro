package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.HrvDayFragment;
import com.sma.smartv3.p610ui.status.fragment.HrvMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.HrvWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HrvActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new HrvDayFragment());
        setWeeFragment(new HrvWeekFragment());
        setMonthFragment(new HrvMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.hrv);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
