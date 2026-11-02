package com.sma.smartv3.p610ui.device.guide;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.device.guide.BgRunGuideFragment;
import com.sma.smartv3.pro.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class BgRunGuideFragment extends BaseGuideFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetClick$lambda$0(BgRunGuideFragment bgRunGuideFragment, boolean z) {
        bgRunGuideFragment.initView();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_bg_run);
        getTvTitle().setText(R.string.battery_permissions);
        getTvTip().setText(R.string.guide_battery_tip);
        getBtnSet().setVisibility(hr1.OXO1.XXiIiX10(getMActivity()) ? 8 : 0);
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        hr1.OXO1.iOO1ii1(getMActivity(), new Function1() { // from class: com.android.mltcode.paycertificationapi.OIIOIX0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BgRunGuideFragment.onSetClick$lambda$0(this.f2974IO, ((Boolean) obj).booleanValue());
            }
        });
    }
}
