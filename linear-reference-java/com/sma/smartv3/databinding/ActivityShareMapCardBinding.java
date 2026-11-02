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
public final class ActivityShareMapCardBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final LinearLayout topPanel;

    @NonNull
    public final ViewPager viewPager;

    private ActivityShareMapCardBinding(@NonNull LinearLayout rootView, @NonNull TabLayout table, @NonNull LinearLayout topPanel, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.table = table;
        this.topPanel = topPanel;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityShareMapCardBinding bind(@NonNull View rootView) {
        int r0 = R.id.table;
        TabLayout r1 = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (r1 == null) goto L11;
        r0 = R.id.top_panel;
        LinearLayout r2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.top_panel);
        if (r2 == null) goto L11;
        r0 = R.id.view_pager;
        ViewPager r3 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r3 == null) goto L11;
        return new ActivityShareMapCardBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityShareMapCardBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityShareMapCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_share_map_card, parent, false);
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
