package com.sma.smartv3.p610ui.sport.course;

import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNoGpsSportV2Fragment extends BaseSportV2Fragment {
    @Override // com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getGpsLl().setVisibility(4);
        getIvBg().setImageResource(R.drawable.pic_indoor);
    }
}
