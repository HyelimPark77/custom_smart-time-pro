package com.sma.smartv3.ui.main;

import androidx.fragment.app.Fragment;
import com.sma.smartv3.ui.ai.fragment.AI2Fragment;
import com.sma.smartv3.ui.me.Me2Fragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MainActivity extends BaseMain2Activity {
    public MainActivity() {
    }

    @Override // com.sma.smartv3.ui.main.BaseMainActivity
    public void viewPagerSelected(int r3) {
        super.viewPagerSelected(r3);
        List<Fragment> r0 = getSupportFragmentManager().getFragments();
        Intrinsics.O10IXXX0X(r0, "getFragments(...)");
        Fragment r4 = r0.get(r3);
        if ((r4 instanceof AI2Fragment) == false) goto L7;
        ((AI2Fragment) r4).onFragmentVisibilityChanged(true);
        return;
    L7:
        if ((r4 instanceof Me2Fragment) == false) goto L10;
        ((Me2Fragment) r4).onFragmentVisibilityChanged(true);
        return;
    }
}
