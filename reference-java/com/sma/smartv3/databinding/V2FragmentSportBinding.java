package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class V2FragmentSportBinding implements ViewBinding {

    @NonNull
    public final ImageView ivMoreSport;

    @NonNull
    public final LinearLayout llTop;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final ViewPager viewPager;

    private V2FragmentSportBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivMoreSport, @NonNull LinearLayout llTop, @NonNull TabLayout table, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.ivMoreSport = ivMoreSport;
        this.llTop = llTop;
        this.table = table;
        this.viewPager = viewPager;
    }

    @NonNull
    public static V2FragmentSportBinding bind(@NonNull View rootView) {
        int i = R.id.iv_more_sport;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_more_sport);
        if (imageView != null) {
            i = R.id.ll_top;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_top);
            if (linearLayout != null) {
                i = R.id.table;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
                if (tabLayout != null) {
                    i = R.id.view_pager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                    if (viewPager != null) {
                        return new V2FragmentSportBinding((LinearLayout) rootView, imageView, linearLayout, tabLayout, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static V2FragmentSportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2FragmentSportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_fragment_sport, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
