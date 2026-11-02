package com.sma.smartv3.p610ui.sport;

import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public final class Sport2Fragment extends SportFragment {
    @Override // com.sma.smartv3.p610ui.sport.SportFragment, com.bestmafen.androidbase.viewpager.BaseFragmentPagerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.ll_top));
    }

    @Override // com.sma.smartv3.p610ui.sport.SportFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.v2_fragment_sport;
    }
}
