package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class NotificationGuideFragment extends BaseGuideFragment {
    public NotificationGuideFragment() {
    }

    private final void refresh() {
        Button r0 = getBtnSet();
        if (MyNotificationListenerService.O001I.O00(getMActivity()) == false) goto L5;
        int r1 = 8;
    L6:
        r0.setVisibility(r1);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment, com.android.mltcode.paycertificationapi.k5
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

    @Override // com.sma.smartv3.ui.device.guide.BaseGuideFragment
    public void onSetClick() {
        MyNotificationListenerService.O001I.I0IIOi(getMActivity());
    }
}
