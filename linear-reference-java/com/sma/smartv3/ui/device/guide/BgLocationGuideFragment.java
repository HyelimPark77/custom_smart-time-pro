package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.iXiOX1OXO;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.sma.smartv3.pro.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public final class BgLocationGuideFragment extends BaseGuideFragment {
    public BgLocationGuideFragment() {
    }

    public static /* synthetic */ Unit iO(BgLocationGuideFragment r0, boolean r1) {
        return onSetClick$lambda$0(r0, r1);
    }

    private static final Unit onSetClick$lambda$0(BgLocationGuideFragment r0, boolean r1) {
        r0.initView();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_location);
        getTvTitle().setText(R.string.location_permissions);
        getTvTip().setText(getString(R.string.location_permissions_tip, new Object[]{AppUtils.getAppName(), AppUtils.getAppName()}));
        Button r0 = getBtnSet();
        if (hr1.OXO1.X00Xi1X(getMActivity()) == false) goto L5;
        int r1 = 8;
    L6:
        r0.setVisibility(r1);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        hr1.XXIIO1i11(hr1.OXO1, getMActivity(), false, new iXiOX1OXO(this), 2, null);
    }
}
