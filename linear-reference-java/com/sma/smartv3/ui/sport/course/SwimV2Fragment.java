package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes3.dex */
public final class SwimV2Fragment extends BaseNoGpsSportV2Fragment {
    public SwimV2Fragment() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        setMSportMode(11);
    }

    @Override // com.sma.smartv3.ui.sport.course.BaseNoGpsSportV2Fragment, com.sma.smartv3.ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvBg().setVisibility(4);
    }
}
