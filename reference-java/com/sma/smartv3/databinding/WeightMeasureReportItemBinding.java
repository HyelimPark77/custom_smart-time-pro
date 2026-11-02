package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ExpandableLayout;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightMeasureReportItemBinding implements ViewBinding {

    @NonNull
    public final ExpandableLayout expandableLayout;

    @NonNull
    public final TintImageView ivIcon;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CircleThumbSegmentedBarView sbv;

    @NonNull
    public final TintImageView switcher;

    @NonNull
    public final PFMedium tvLevel;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final DINCondBold tvTips;

    @NonNull
    public final PFMedium tvValue;

    private WeightMeasureReportItemBinding(@NonNull LinearLayout rootView, @NonNull ExpandableLayout expandableLayout, @NonNull TintImageView ivIcon, @NonNull RecyclerView recyclerView, @NonNull CircleThumbSegmentedBarView sbv, @NonNull TintImageView switcher, @NonNull PFMedium tvLevel, @NonNull PFMedium tvName, @NonNull DINCondBold tvTips, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.expandableLayout = expandableLayout;
        this.ivIcon = ivIcon;
        this.recyclerView = recyclerView;
        this.sbv = sbv;
        this.switcher = switcher;
        this.tvLevel = tvLevel;
        this.tvName = tvName;
        this.tvTips = tvTips;
        this.tvValue = tvValue;
    }

    @NonNull
    public static WeightMeasureReportItemBinding bind(@NonNull View rootView) {
        int i = R.id.expandable_layout;
        ExpandableLayout expandableLayout = (ExpandableLayout) ViewBindings.findChildViewById(rootView, R.id.expandable_layout);
        if (expandableLayout != null) {
            i = R.id.iv_icon;
            TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
            if (tintImageView != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.sbv;
                    CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv);
                    if (circleThumbSegmentedBarView != null) {
                        i = R.id.switcher;
                        TintImageView tintImageView2 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.switcher);
                        if (tintImageView2 != null) {
                            i = R.id.tv_level;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_level);
                            if (pFMedium != null) {
                                i = R.id.tv_name;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                                if (pFMedium2 != null) {
                                    i = R.id.tv_tips;
                                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_tips);
                                    if (dINCondBold != null) {
                                        i = R.id.tv_value;
                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                                        if (pFMedium3 != null) {
                                            return new WeightMeasureReportItemBinding((LinearLayout) rootView, expandableLayout, tintImageView, recyclerView, circleThumbSegmentedBarView, tintImageView2, pFMedium, pFMedium2, dINCondBold, pFMedium3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WeightMeasureReportItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WeightMeasureReportItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.weight_measure_report_item, parent, false);
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
