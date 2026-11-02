package com.sma.smartv3.p610ui.main;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.sma.smartv3.p610ui.device.Device2Fragment;
import com.sma.smartv3.p610ui.p611ai.fragment.AI2Fragment;
import com.sma.smartv3.p610ui.p612me.Me2Fragment;
import com.sma.smartv3.p610ui.sport.Sport2Fragment;
import com.sma.smartv3.p610ui.status.MainStatus2Fragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BaseMain2Activity extends BaseMainActivity {
    @Override // com.sma.smartv3.p610ui.main.BaseMainActivity, com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        setStatusFragment(new MainStatus2Fragment());
        ArrayList arrayList = new ArrayList();
        arrayList.add(getStatusFragment());
        i72 i72Var = i72.OXO1;
        if (i72Var.IOI0i0I()) {
            arrayList.add(new Sport2Fragment());
            MenuItem menuItemFindItem = getBottomNav().getMenu().findItem(R.id.item_bottom_sport);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(true);
            }
        } else {
            getBottomNav().getMenu().removeItem(R.id.item_bottom_sport);
        }
        if (i72Var.OXi001()) {
            arrayList.add(new AI2Fragment());
            MenuItem menuItemFindItem2 = getBottomNav().getMenu().findItem(R.id.item_bottom_ai);
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setVisible(true);
            }
        } else {
            getBottomNav().getMenu().removeItem(R.id.item_bottom_ai);
        }
        arrayList.add(new Device2Fragment());
        arrayList.add(new Me2Fragment());
        return arrayList;
    }

    @Override // com.sma.smartv3.p610ui.main.BaseMainActivity, com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        transparentStatusBar();
    }
}
