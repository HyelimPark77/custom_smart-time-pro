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

    public BaseStatePagerAdapter(jl1 jl1Var) {
        super(jl1Var.provideFragmentManager());
        this.mFragments = jl1Var.initFragments();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.mFragments.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @aa1
    public Fragment getItem(int i) {
        return this.mFragments.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i) {
        CharSequence[] charSequenceArr = this.mTitles;
        return (charSequenceArr == null || charSequenceArr.length <= i) ? super.getPageTitle(i) : charSequenceArr[i];
    }

    public BaseStatePagerAdapter(jl1 jl1Var, CharSequence[] charSequenceArr) {
        super(jl1Var.provideFragmentManager());
        this.mFragments = jl1Var.initFragments();
        this.mTitles = charSequenceArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseStatePagerAdapter(jl1 jl1Var, int i) {
        super(jl1Var.provideFragmentManager());
        if (jl1Var instanceof Activity) {
            this.mTitles = ((Activity) jl1Var).getResources().getStringArray(i);
        } else if (jl1Var instanceof Fragment) {
            this.mTitles = ((Fragment) jl1Var).getResources().getStringArray(i);
        } else {
            throw new IllegalArgumentException("provider must be an instance of Activity or Fragment");
        }
        this.mFragments = jl1Var.initFragments();
    }
}
