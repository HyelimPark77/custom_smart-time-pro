package com.bestmafen.androidbase.viewpager;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.jl1;
import com.bestmafen.androidbase.R;
import com.bestmafen.androidbase.base.BaseFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseFragmentPagerFragment extends BaseFragment implements jl1 {
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;
    protected ViewPager mViewPager;

    public BaseFragmentPagerFragment() {
    }

    @aa1
    public final BaseFragmentPagerAdapter getMFragmentPagerAdapter() {
        BaseFragmentPagerAdapter r0 = this.mFragmentPagerAdapter;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mFragmentPagerAdapter");
        return null;
    }

    @aa1
    public final ViewPager getMViewPager() {
        ViewPager r0 = this.mViewPager;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mViewPager");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @CallSuper
    public void initView() {
        View r0 = getMView().findViewById(R.id.view_pager);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        setMViewPager((ViewPager) r0);
        BaseFragmentPagerAdapter r1 = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(r1);
        getMViewPager().setOffscreenPageLimit(r1.getCount());
        setMFragmentPagerAdapter(r1);
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public FragmentManager provideFragmentManager() {
        FragmentManager r0 = getChildFragmentManager();
        Intrinsics.O10IXXX0X(r0, "getChildFragmentManager(...)");
        return r0;
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFragmentPagerAdapter = r2;
    }

    public final void setMViewPager(@aa1 ViewPager r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mViewPager = r2;
    }
}
