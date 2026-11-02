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
        int i = R.id.line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.line);
        if (viewFindChildViewById != null) {
            i = R.id.table;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
            if (tabLayout != null) {
                i = R.id.view_pager;
                NoScollViewPager noScollViewPager = (NoScollViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                if (noScollViewPager != null) {
                    return new ActivityStatusWeightBinding((LinearLayout) rootView, viewFindChildViewById, tabLayout, noScollViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStatusWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStatusWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_status_weight, parent, false);
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
