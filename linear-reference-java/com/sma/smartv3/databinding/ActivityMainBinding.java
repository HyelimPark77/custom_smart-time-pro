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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMainBinding implements ViewBinding {

    @NonNull
    public final BottomNavigationView bottomNav;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final ViewPager viewPager;

    private ActivityMainBinding(@NonNull RelativeLayout rootView_, @NonNull BottomNavigationView bottomNav, @NonNull RelativeLayout rootView, @NonNull ViewPager viewPager) {
        this.rootView_ = rootView_;
        this.bottomNav = bottomNav;
        this.rootView = rootView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityMainBinding bind(@NonNull View rootView) {
        int r0 = R.id.bottomNav;
        BottomNavigationView r1 = (BottomNavigationView) ViewBindings.findChildViewById(rootView, R.id.bottomNav);
        if (r1 == null) goto L10;
        RelativeLayout r2 = (RelativeLayout) rootView;
        ViewPager r3 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r3 != null) goto L7;
        r0 = R.id.view_pager;
        goto L10
    L7:
        return new ActivityMainBinding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_main, parent, false);
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
