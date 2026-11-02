package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.SleepAllDayDayFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepAllDayMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepAllDayWeekFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepDayFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        q62 q62Var = q62.OXO1;
        LogUtils.m11128d("initFragment -> " + q62Var.IXi01O());
        if (q62Var.IXi01O()) {
            setDayFragment(new SleepAllDayDayFragment());
            setWeeFragment(new SleepAllDayWeekFragment());
            setMonthFragment(new SleepAllDayMonthFragment());
        } else {
            setDayFragment(new SleepDayFragment());
            setWeeFragment(new SleepWeekFragment());
            setMonthFragment(new SleepMonthFragment());
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.sleep);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
