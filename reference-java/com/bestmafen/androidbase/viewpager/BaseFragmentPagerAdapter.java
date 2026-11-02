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

    public BaseFragmentPagerAdapter(jl1 jl1Var) {
        super(jl1Var.provideFragmentManager());
        this.mFragments = jl1Var.initFragments();
    }

    public void cleanFragment() {
        List<Fragment> list = this.mFragments;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mFragments.clear();
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

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    public void setFragments(List<Fragment> list) {
        this.mFragments = list;
    }

    public void setTitles(CharSequence[] charSequenceArr) {
        this.mTitles = charSequenceArr;
    }

    public BaseFragmentPagerAdapter(jl1 jl1Var, CharSequence[] charSequenceArr) {
        super(jl1Var.provideFragmentManager());
        this.mFragments = jl1Var.initFragments();
        this.mTitles = charSequenceArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseFragmentPagerAdapter(jl1 jl1Var, int i) {
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
