package com.sma.smartv3.p610ui.p612me;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.l76;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class CompatibleUserActivity extends UserInfoActivity {
    @Override // com.sma.smartv3.p610ui.p612me.UserInfoActivity
    public void setupHeight() {
        i1O0OXO1O.OXO1.OXO1("AppUser:" + getMAppUser());
        if (getMAppUser().getUnit() == 0) {
            getTvHeight().setText(getString(R.string.f_cm_compatible, Float.valueOf(getMAppUser().getHeight())));
        } else {
            int[] iArrOXO1 = l76.OXO1(getMAppUser().getHeight());
            getTvHeight().setText(getString(R.string.d_feet_d_inch, Integer.valueOf(iArrOXO1[0]), Integer.valueOf(iArrOXO1[1])));
        }
    }
}
