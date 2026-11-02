package com.bestmafen.androidbase.viewpager;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.jl1;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BaseStatePagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments;
    private CharSequence[] mTitles;

    public BaseStatePagerAdapter(jl1 r2) {
        super(r2.provideFragmentManager());
        this.mFragments = r2.initFragments();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.mFragments.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @aa1
    public Fragment getItem(int r2) {
        return this.mFragments.get(r2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int r3) {
        CharSequence[] r0 = this.mTitles;
        if (r0 == null) goto L9;
        if (r0.length <= r3) goto L9;
        return r0[r3];
    L9:
        return super.getPageTitle(r3);
    }

    public BaseStatePagerAdapter(jl1 r2, CharSequence[] r3) {
        super(r2.provideFragmentManager());
        this.mFragments = r2.initFragments();
        this.mTitles = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseStatePagerAdapter(jl1 r2, int r3) {
        super(r2.provideFragmentManager());
        if ((r2 instanceof Activity) == false) goto L6;
        this.mTitles = ((Activity) r2).getResources().getStringArray(r3);
    L8:
        this.mFragments = r2.initFragments();
        return;
    L6:
        if ((r2 instanceof Fragment) == false) goto L11;
        this.mTitles = ((Fragment) r2).getResources().getStringArray(r3);
        goto L8
    L11:
        throw new IllegalArgumentException("provider must be an instance of Activity or Fragment");
    }
}
