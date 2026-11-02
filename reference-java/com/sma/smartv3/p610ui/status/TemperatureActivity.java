package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.TemperatureDayFragment;
import com.sma.smartv3.p610ui.status.fragment.TemperatureMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.TemperatureWeekFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TemperatureActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        setDayFragment(new TemperatureDayFragment());
        setWeeFragment(new TemperatureWeekFragment());
        setMonthFragment(new TemperatureMonthFragment());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        if (q62.OXO1.XI1OX0IO()) {
            String string = getString(R.string.body_surface_temperature);
            Intrinsics.XXI(string);
            return string;
        }
        String string2 = getString(R.string.temperature);
        Intrinsics.XXI(string2);
        return string2;
    }
}
