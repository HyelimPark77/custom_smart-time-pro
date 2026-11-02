package com.sma.smartv3.p610ui.main;

import androidx.fragment.app.Fragment;
import com.sma.smartv3.p610ui.p611ai.fragment.AI2Fragment;
import com.sma.smartv3.p610ui.p612me.Me2Fragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MainActivity extends BaseMain2Activity {
    @Override // com.sma.smartv3.p610ui.main.BaseMainActivity
    public void viewPagerSelected(int i) {
        super.viewPagerSelected(i);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.O10IXXX0X(fragments, "getFragments(...)");
        Fragment fragment = fragments.get(i);
        if (fragment instanceof AI2Fragment) {
            ((AI2Fragment) fragment).onFragmentVisibilityChanged(true);
        } else if (fragment instanceof Me2Fragment) {
            ((Me2Fragment) fragment).onFragmentVisibilityChanged(true);
        }
    }
}
