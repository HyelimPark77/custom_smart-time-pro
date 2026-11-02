package com.sma.smartv3.ui.sport;

import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNoGpsSportFragment extends BaseSportFragment {
    public BaseNoGpsSportFragment() {
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getGpsLl().setVisibility(4);
        getIvBg().setImageResource(R.drawable.pic_indoor);
    }
}
