package com.sma.smartv3.ui.device.dial;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes18.dex */
public final class DialV2Activity extends DialActivity {
    public DialV2Activity() {
    }

    @Override // com.sma.smartv3.ui.device.dial.DialActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        setOnlineFragment(new DialOnlineV2Fragment());
        DialOnlineFragment r5 = getOnlineFragment();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", getMArg0());
        r0.putInt("mArg1", getMArg1());
        r5.setArguments(r0);
        setCustomizeFragment(new DialCustomizeFragment());
        setAigcFragment(new AIGCFragment());
        setDialRecordingFragment(new DialRecordingFragment());
        if (q62.OXO1.IXiOXO() == true) goto L5;
    L7:
        boolean r6 = false;
    L8:
        setShowCustom(r6);
        return;
    L5:
        if (getMArg1() != (-1)) goto L7;
        r6 = true;
        goto L8
    }
}
