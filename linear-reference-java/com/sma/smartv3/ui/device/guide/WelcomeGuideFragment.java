package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class WelcomeGuideFragment extends BaseGuideFragment {
    public WelcomeGuideFragment() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ImageView r0 = getIvPic();
        q62 r1 = q62.OXO1;
        if (q62.OiO0IOX(r1, null, 1, null) == false) goto L5;
    L8:
        int r2 = R.drawable.pic_guide_welcome_ring;
    L9:
        r0.setImageResource(r2);
        getTvTitle().setText(R.string.use_reminder);
        getTvTip().setText(R.string.guide_welcome_tip);
        getBtnSet().setVisibility(4);
        return;
    L5:
        if (r1.OiO() == true) goto L8;
        r2 = R.drawable.pic_guide_welcome;
        goto L9
    }
}
