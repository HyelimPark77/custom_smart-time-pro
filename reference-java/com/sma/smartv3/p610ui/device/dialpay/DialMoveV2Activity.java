package com.sma.smartv3.p610ui.device.dialpay;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayOnlineMoveFragment;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayOnlineMoveV2Fragment;

/* JADX INFO: loaded from: classes18.dex */
public final class DialMoveV2Activity extends DialMoveActivity {
    @Override // com.sma.smartv3.p610ui.device.dialpay.DialMoveActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setOnlineFragment(new PayOnlineMoveV2Fragment());
        PayOnlineMoveFragment onlineFragment = getOnlineFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", getMArg0());
        bundle2.putInt("mArg1", getMArg1());
        onlineFragment.setArguments(bundle2);
    }
}
