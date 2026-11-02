package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.DistanceDayFragment;
import com.sma.smartv3.p610ui.status.fragment.DistanceMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.DistanceWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DistanceActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new DistanceDayFragment());
        setWeeFragment(new DistanceWeekFragment());
        setMonthFragment(new DistanceMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.distance);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
