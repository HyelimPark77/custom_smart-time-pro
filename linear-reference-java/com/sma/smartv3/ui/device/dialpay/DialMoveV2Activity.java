package com.sma.smartv3.ui.device.dialpay;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveFragment;
import com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveV2Fragment;

/* JADX INFO: loaded from: classes18.dex */
public final class DialMoveV2Activity extends DialMoveActivity {
    public DialMoveV2Activity() {
    }

    @Override // com.sma.smartv3.ui.device.dialpay.DialMoveActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        setOnlineFragment(new PayOnlineMoveV2Fragment());
        PayOnlineMoveFragment r5 = getOnlineFragment();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", getMArg0());
        r0.putInt("mArg1", getMArg1());
        r5.setArguments(r0);
    }
}
