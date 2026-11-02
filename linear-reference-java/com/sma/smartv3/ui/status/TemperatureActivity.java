package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.TemperatureDayFragment;
import com.sma.smartv3.ui.status.fragment.TemperatureMonthFragment;
import com.sma.smartv3.ui.status.fragment.TemperatureWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TemperatureActivity extends StatusBaseActivity {
    public TemperatureActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new TemperatureDayFragment());
        setWeeFragment(new TemperatureWeekFragment());
        setMonthFragment(new TemperatureMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        if (q62.OXO1.XI1OX0IO() == false) goto L6;
        String r0 = getString(R.string.body_surface_temperature);
        Intrinsics.XXI(r0);
        return r0;
    L6:
        String r1 = getString(R.string.temperature);
        Intrinsics.XXI(r1);
        return r1;
    }
}
