package com.sma.smartv3.p610ui.device.dial;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes18.dex */
public final class DialV2Activity extends DialActivity {
    @Override // com.sma.smartv3.p610ui.device.dial.DialActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setOnlineFragment(new DialOnlineV2Fragment());
        DialOnlineFragment onlineFragment = getOnlineFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", getMArg0());
        bundle2.putInt("mArg1", getMArg1());
        onlineFragment.setArguments(bundle2);
        setCustomizeFragment(new DialCustomizeFragment());
        setAigcFragment(new AIGCFragment());
        setDialRecordingFragment(new DialRecordingFragment());
        setShowCustom(q62.OXO1.IXiOXO() && getMArg1() == -1);
    }
}
