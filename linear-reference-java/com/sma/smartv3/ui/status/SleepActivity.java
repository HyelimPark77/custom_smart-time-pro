package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.SleepAllDayDayFragment;
import com.sma.smartv3.ui.status.fragment.SleepAllDayMonthFragment;
import com.sma.smartv3.ui.status.fragment.SleepAllDayWeekFragment;
import com.sma.smartv3.ui.status.fragment.SleepDayFragment;
import com.sma.smartv3.ui.status.fragment.SleepMonthFragment;
import com.sma.smartv3.ui.status.fragment.SleepWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepActivity extends StatusBaseActivity {
    public SleepActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        q62 r0 = q62.OXO1;
        LogUtils.d(new Object[]{"initFragment -> " + r0.IXi01O()});
        if (r0.IXi01O() == false) goto L6;
        setDayFragment(new SleepAllDayDayFragment());
        setWeeFragment(new SleepAllDayWeekFragment());
        setMonthFragment(new SleepAllDayMonthFragment());
        return;
    L6:
        setDayFragment(new SleepDayFragment());
        setWeeFragment(new SleepWeekFragment());
        setMonthFragment(new SleepMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.sleep);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
