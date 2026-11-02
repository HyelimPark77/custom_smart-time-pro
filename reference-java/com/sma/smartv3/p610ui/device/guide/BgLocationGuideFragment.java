package com.sma.smartv3.p610ui.device.guide;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.sma.smartv3.p610ui.device.guide.BgLocationGuideFragment;
import com.sma.smartv3.pro.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class BgLocationGuideFragment extends BaseGuideFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetClick$lambda$0(BgLocationGuideFragment bgLocationGuideFragment, boolean z) {
        bgLocationGuideFragment.initView();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_location);
        getTvTitle().setText(R.string.location_permissions);
        getTvTip().setText(getString(R.string.location_permissions_tip, AppUtils.getAppName(), AppUtils.getAppName()));
        getBtnSet().setVisibility(hr1.OXO1.X00Xi1X(getMActivity()) ? 8 : 0);
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        hr1.XXIIO1i11(hr1.OXO1, getMActivity(), false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iXiOX1OXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BgLocationGuideFragment.onSetClick$lambda$0(this.f8447IO, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
    }
}
