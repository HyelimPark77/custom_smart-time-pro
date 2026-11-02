package com.sma.smartv3.ui.me;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.l76;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class CompatibleUserActivity extends UserInfoActivity {
    public CompatibleUserActivity() {
    }

    @Override // com.sma.smartv3.ui.me.UserInfoActivity
    public void setupHeight() {
        i1O0OXO1O.OXO1.OXO1("AppUser:" + getMAppUser());
        if (getMAppUser().getUnit() != 0) goto L6;
        getTvHeight().setText(getString(R.string.f_cm_compatible, new Object[]{Float.valueOf(getMAppUser().getHeight())}));
        return;
    L6:
        int[] r0 = l76.OXO1(getMAppUser().getHeight());
        getTvHeight().setText(getString(R.string.d_feet_d_inch, new Object[]{Integer.valueOf(r0[0]), Integer.valueOf(r0[1])}));
    }
}
