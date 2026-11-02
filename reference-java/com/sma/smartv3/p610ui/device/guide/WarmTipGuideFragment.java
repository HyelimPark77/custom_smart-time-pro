package com.sma.smartv3.p610ui.device.guide;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class WarmTipGuideFragment extends BaseGuideFragment {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_warn_tip);
        getTvTitle().setText(R.string.guide_warm_title);
        getTvTip().setText(q62.OXO1.iXiiiO());
        getBtnSet().setVisibility(4);
    }
}
