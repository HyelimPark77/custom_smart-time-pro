package com.sma.smartv3.p610ui.sport;

import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNoGpsSportFragment extends BaseSportFragment {
    @Override // com.sma.smartv3.p610ui.sport.BaseSportFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getGpsLl().setVisibility(4);
        getIvBg().setImageResource(R.drawable.pic_indoor);
    }
}
