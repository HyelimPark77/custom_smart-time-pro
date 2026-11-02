package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.NoScollViewPager;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStatusWeightBinding implements ViewBinding {

    @NonNull
    public final View line;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final NoScollViewPager viewPager;

    private ActivityStatusWeightBinding(@NonNull LinearLayout rootView, @NonNull View line, @NonNull TabLayout table, @NonNull NoScollViewPager viewPager) {
        this.rootView = rootView;
        this.line = line;
        this.table = table;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityStatusWeightBinding bind(@NonNull View rootView) {
        int r0 = R.id.line;
        View r1 = ViewBindings.findChildViewById(rootView, R.id.line);
        if (r1 == null) goto L11;
        r0 = R.id.table;
        TabLayout r2 = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (r2 == null) goto L11;
        r0 = R.id.view_pager;
        NoScollViewPager r3 = (NoScollViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r3 == null) goto L11;
        return new ActivityStatusWeightBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityStatusWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStatusWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_status_weight, parent, false);
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
