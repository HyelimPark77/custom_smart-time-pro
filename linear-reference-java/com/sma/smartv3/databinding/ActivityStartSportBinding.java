package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStartSportBinding implements ViewBinding {

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final ViewPager viewPager;

    private ActivityStartSportBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout root, @NonNull TabLayout table, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.root = root;
        this.table = table;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityStartSportBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        int r1 = R.id.table;
        TabLayout r2 = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (r2 == null) goto L9;
        r1 = R.id.view_pager;
        ViewPager r3 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r3 == null) goto L9;
        return new ActivityStartSportBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityStartSportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStartSportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_start_sport, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
