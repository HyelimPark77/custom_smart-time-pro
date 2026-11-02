package com.sma.smartv3.ui.main;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.fragment.AI2Fragment;
import com.sma.smartv3.ui.device.Device2Fragment;
import com.sma.smartv3.ui.me.Me2Fragment;
import com.sma.smartv3.ui.sport.Sport2Fragment;
import com.sma.smartv3.ui.status.MainStatus2Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BaseMain2Activity extends BaseMainActivity {
    public BaseMain2Activity() {
    }

    @Override // com.sma.smartv3.ui.main.BaseMainActivity, com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        setStatusFragment(new MainStatus2Fragment());
        ArrayList r0 = new ArrayList();
        r0.add(getStatusFragment());
        i72 r1 = i72.OXO1;
        if (r1.IOI0i0I() == false) goto L7;
        r0.add(new Sport2Fragment());
        MenuItem r2 = getBottomNav().getMenu().findItem(R.id.item_bottom_sport);
        if (r2 == null) goto L9;
        r2.setVisible(true);
    L9:
        if (r1.OXi001() == false) goto L13;
        r0.add(new AI2Fragment());
        MenuItem r3 = getBottomNav().getMenu().findItem(R.id.item_bottom_ai);
        if (r3 == null) goto L14;
        r3.setVisible(true);
    L14:
        r0.add(new Device2Fragment());
        r0.add(new Me2Fragment());
        return r0;
    L13:
        getBottomNav().getMenu().removeItem(R.id.item_bottom_ai);
        goto L14
    L7:
        getBottomNav().getMenu().removeItem(R.id.item_bottom_sport);
        goto L9
    }

    @Override // com.sma.smartv3.ui.main.BaseMainActivity, com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        transparentStatusBar();
    }
}
