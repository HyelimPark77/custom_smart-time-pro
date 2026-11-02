package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.GuideRelativeLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMainGuideBinding implements ViewBinding {

    @NonNull
    public final BottomNavigationView bottomNav;

    @NonNull
    public final GuideRelativeLayout guideLayout;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final ViewPager viewPager;

    private ActivityMainGuideBinding(@NonNull RelativeLayout rootView_, @NonNull BottomNavigationView bottomNav, @NonNull GuideRelativeLayout guideLayout, @NonNull RelativeLayout rootView, @NonNull ViewPager viewPager) {
        this.rootView_ = rootView_;
        this.bottomNav = bottomNav;
        this.guideLayout = guideLayout;
        this.rootView = rootView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityMainGuideBinding bind(@NonNull View rootView) {
        int i = R.id.bottomNav;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(rootView, R.id.bottomNav);
        if (bottomNavigationView != null) {
            i = R.id.guide_layout;
            GuideRelativeLayout guideRelativeLayout = (GuideRelativeLayout) ViewBindings.findChildViewById(rootView, R.id.guide_layout);
            if (guideRelativeLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                i = R.id.view_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                if (viewPager != null) {
                    return new ActivityMainGuideBinding(relativeLayout, bottomNavigationView, guideRelativeLayout, relativeLayout, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMainGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMainGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_main_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
