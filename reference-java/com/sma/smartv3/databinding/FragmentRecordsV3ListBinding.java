package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentRecordsV3ListBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final FrameLayout tableLayout;

    @NonNull
    public final ViewPager viewPager;

    private FragmentRecordsV3ListBinding(@NonNull LinearLayout rootView, @NonNull TabLayout table, @NonNull FrameLayout tableLayout, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.table = table;
        this.tableLayout = tableLayout;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentRecordsV3ListBinding bind(@NonNull View rootView) {
        int i = R.id.table;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (tabLayout != null) {
            i = R.id.table_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.table_layout);
            if (frameLayout != null) {
                i = R.id.view_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                if (viewPager != null) {
                    return new FragmentRecordsV3ListBinding((LinearLayout) rootView, tabLayout, frameLayout, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRecordsV3ListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentRecordsV3ListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_records_v3_list, parent, false);
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
