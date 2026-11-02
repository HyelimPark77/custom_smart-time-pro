package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class EarphonesGuideFragment extends BaseGuideFragment {
    public EarphonesGuideFragment() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.icon_earphones_guide);
        getTvTitle().setText(R.string.earphone_connect_title);
        getTvTip().setText(R.string.earphone_connect_tip);
        getBtnSet().setVisibility(4);
    }
}
