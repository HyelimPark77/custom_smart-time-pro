package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiPlanItemGroupHeadBinding implements ViewBinding {

    @NonNull
    public final PFMedium planWeekTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ViewPager2 viewPager;

    private AiPlanItemGroupHeadBinding(@NonNull LinearLayout rootView, @NonNull PFMedium planWeekTv, @NonNull ViewPager2 viewPager) {
        this.rootView = rootView;
        this.planWeekTv = planWeekTv;
        this.viewPager = viewPager;
    }

    @NonNull
    public static AiPlanItemGroupHeadBinding bind(@NonNull View rootView) {
        int i = R.id.plan_week_tv;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_week_tv);
        if (pFMedium != null) {
            i = R.id.view_pager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, R.id.view_pager);
            if (viewPager2 != null) {
                return new AiPlanItemGroupHeadBinding((LinearLayout) rootView, pFMedium, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiPlanItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiPlanItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_plan_item_group_head, parent, false);
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
