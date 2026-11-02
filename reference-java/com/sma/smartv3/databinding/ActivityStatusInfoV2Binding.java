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
public final class ActivityStatusInfoV2Binding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final View topLine;

    @NonNull
    public final ViewPager viewPager;

    private ActivityStatusInfoV2Binding(@NonNull LinearLayout rootView, @NonNull TabLayout table, @NonNull View topLine, @NonNull ViewPager viewPager) {
        this.rootView = rootView;
        this.table = table;
        this.topLine = topLine;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityStatusInfoV2Binding bind(@NonNull View rootView) {
        int i = R.id.table;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (tabLayout != null) {
            i = R.id.top_line;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.top_line);
            if (viewFindChildViewById != null) {
                i = R.id.view_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                if (viewPager != null) {
                    return new ActivityStatusInfoV2Binding((LinearLayout) rootView, tabLayout, viewFindChildViewById, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStatusInfoV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStatusInfoV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_status_info_v2, parent, false);
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
