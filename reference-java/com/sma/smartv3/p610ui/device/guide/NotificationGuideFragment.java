package com.sma.smartv3.p610ui.device.guide;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class NotificationGuideFragment extends BaseGuideFragment {
    private final void refresh() {
        getBtnSet().setVisibility(MyNotificationListenerService.O001I.O00(getMActivity()) ? 8 : 0);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getIvPic().setImageResource(R.drawable.pic_guide_notification);
        getTvTitle().setText(R.string.notification_permissions);
        getTvTip().setText(R.string.guide_notification_tip);
        refresh();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        refresh();
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        MyNotificationListenerService.O001I.I0IIOi(getMActivity());
    }
}
