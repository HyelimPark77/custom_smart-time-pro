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
        int r0 = R.id.bottomNav;
        BottomNavigationView r4 = (BottomNavigationView) ViewBindings.findChildViewById(rootView, R.id.bottomNav);
        if (r4 == null) goto L11;
        r0 = R.id.guide_layout;
        GuideRelativeLayout r5 = (GuideRelativeLayout) ViewBindings.findChildViewById(rootView, R.id.guide_layout);
        if (r5 == null) goto L11;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.view_pager;
        ViewPager r7 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r7 == null) goto L11;
        return new ActivityMainGuideBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityMainGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMainGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_main_guide, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
