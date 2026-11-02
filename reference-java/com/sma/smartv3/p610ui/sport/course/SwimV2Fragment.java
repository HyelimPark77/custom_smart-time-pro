package com.sma.smartv3.p610ui.sport.course;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes3.dex */
public final class SwimV2Fragment extends BaseNoGpsSportV2Fragment {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setMSportMode(11);
    }

    @Override // com.sma.smartv3.p610ui.sport.course.BaseNoGpsSportV2Fragment, com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getIvBg().setVisibility(4);
    }
}
