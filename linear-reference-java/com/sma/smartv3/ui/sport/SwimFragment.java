package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes3.dex */
public final class SwimFragment extends BaseNoGpsSportFragment {
    public SwimFragment() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        setMSportMode(11);
    }

    @Override // com.sma.smartv3.ui.sport.BaseNoGpsSportFragment, com.sma.smartv3.ui.sport.BaseSportFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvBg().setVisibility(4);
    }
}
