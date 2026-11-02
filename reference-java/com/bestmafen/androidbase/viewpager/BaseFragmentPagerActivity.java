package com.bestmafen.androidbase.viewpager;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.jl1;
import com.bestmafen.androidbase.C4238R;
import com.bestmafen.androidbase.base.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseFragmentPagerActivity extends BaseActivity implements jl1 {
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;
    protected ViewPager mViewPager;

    @aa1
    public final BaseFragmentPagerAdapter getMFragmentPagerAdapter() {
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = this.mFragmentPagerAdapter;
        if (baseFragmentPagerAdapter != null) {
            return baseFragmentPagerAdapter;
        }
        Intrinsics.XXO("mFragmentPagerAdapter");
        return null;
    }

    @aa1
    public final ViewPager getMViewPager() {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.XXO("mViewPager");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @CallSuper
    public void initView() {
        View viewFindViewById = findViewById(C4238R.id.view_pager);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        setMViewPager((ViewPager) viewFindViewById);
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(baseFragmentPagerAdapter);
        getMViewPager().setOffscreenPageLimit(baseFragmentPagerAdapter.getCount());
        setMFragmentPagerAdapter(baseFragmentPagerAdapter);
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public FragmentManager provideFragmentManager() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.O10IXXX0X(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter baseFragmentPagerAdapter) {
        Intrinsics.X0O(baseFragmentPagerAdapter, "<set-?>");
        this.mFragmentPagerAdapter = baseFragmentPagerAdapter;
    }

    public final void setMViewPager(@aa1 ViewPager viewPager) {
        Intrinsics.X0O(viewPager, "<set-?>");
        this.mViewPager = viewPager;
    }
}
