package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.OIIOIX0O;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public final class BgRunGuideFragment extends BaseGuideFragment {
    public BgRunGuideFragment() {
    }

    public static /* synthetic */ Unit iO(BgRunGuideFragment r0, boolean r1) {
        return onSetClick$lambda$0(r0, r1);
    }

    private static final Unit onSetClick$lambda$0(BgRunGuideFragment r0, boolean r1) {
        r0.initView();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_bg_run);
        getTvTitle().setText(R.string.battery_permissions);
        getTvTip().setText(R.string.guide_battery_tip);
        Button r0 = getBtnSet();
        if (hr1.OXO1.XXiIiX10(getMActivity()) == false) goto L5;
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
        hr1.OXO1.iOO1ii1(getMActivity(), new OIIOIX0O(this));
    }
}
