package com.sma.smartv3.ui.ai.fragment;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.iiO11XiX;
import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AI2Fragment extends AIFragment implements iiO11XiX {
    public AI2Fragment() {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.rv));
    }

    @Override // com.sma.smartv3.ui.ai.fragment.AIFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.v2_fragment_ai;
    }

    @Override // com.android.mltcode.paycertificationapi.iiO11XiX
    public void onFragmentVisibilityChanged(boolean r3) {
        I01XX0.XIi00iiXO(I01XX0.IOi1O0, null, 2, null);
    }
}
