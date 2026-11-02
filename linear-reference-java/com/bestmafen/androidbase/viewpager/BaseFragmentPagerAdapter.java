package com.bestmafen.androidbase.viewpager;

import android.app.Activity;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.jl1;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BaseFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments;
    private CharSequence[] mTitles;

    public BaseFragmentPagerAdapter(jl1 r2) {
        super(r2.provideFragmentManager());
        this.mFragments = r2.initFragments();
    }

    public void cleanFragment() {
        List<Fragment> r0 = this.mFragments;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L10;
        this.mFragments.clear();
        return;
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

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    public void setFragments(List<Fragment> r1) {
        this.mFragments = r1;
    }

    public void setTitles(CharSequence[] r1) {
        this.mTitles = r1;
    }

    public BaseFragmentPagerAdapter(jl1 r2, CharSequence[] r3) {
        super(r2.provideFragmentManager());
        this.mFragments = r2.initFragments();
        this.mTitles = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseFragmentPagerAdapter(jl1 r2, int r3) {
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
