package com.sma.smartv3.p610ui.device.guide;

import android.os.Bundle;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class WelcomeGuideFragment extends BaseGuideFragment {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ImageView ivPic = getIvPic();
        q62 q62Var = q62.OXO1;
        ivPic.setImageResource((q62.OiO0IOX(q62Var, null, 1, null) || q62Var.OiO()) ? R.drawable.pic_guide_welcome_ring : R.drawable.pic_guide_welcome);
        getTvTitle().setText(R.string.use_reminder);
        getTvTip().setText(R.string.guide_welcome_tip);
        getBtnSet().setVisibility(4);
    }
}
