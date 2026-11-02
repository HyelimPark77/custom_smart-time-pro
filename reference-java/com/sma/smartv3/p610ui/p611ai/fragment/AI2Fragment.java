package com.sma.smartv3.p610ui.p611ai.fragment;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.iiO11XiX;
import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AI2Fragment extends AIFragment implements iiO11XiX {
    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.f51422rv));
    }

    @Override // com.sma.smartv3.p610ui.p611ai.fragment.AIFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.v2_fragment_ai;
    }

    @Override // com.android.mltcode.paycertificationapi.iiO11XiX
    public void onFragmentVisibilityChanged(boolean z) {
        I01XX0.XIi00iiXO(I01XX0.IOi1O0, null, 2, null);
    }
}
