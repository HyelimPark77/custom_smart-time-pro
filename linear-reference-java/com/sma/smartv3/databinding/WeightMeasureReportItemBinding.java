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
        int r0 = R.id.expandable_layout;
        ExpandableLayout r4 = (ExpandableLayout) ViewBindings.findChildViewById(rootView, R.id.expandable_layout);
        if (r4 == null) goto L23;
        r0 = R.id.iv_icon;
        TintImageView r5 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (r5 == null) goto L23;
        r0 = R.id.recyclerView;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
        if (r6 == null) goto L23;
        r0 = R.id.sbv;
        CircleThumbSegmentedBarView r7 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv);
        if (r7 == null) goto L23;
        r0 = R.id.switcher;
        TintImageView r8 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.switcher);
        if (r8 == null) goto L23;
        r0 = R.id.tv_level;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_level);
        if (r9 == null) goto L23;
        r0 = R.id.tv_name;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r10 == null) goto L23;
        r0 = R.id.tv_tips;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_tips);
        if (r11 == null) goto L23;
        r0 = R.id.tv_value;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
        if (r12 == null) goto L23;
        return new WeightMeasureReportItemBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static WeightMeasureReportItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static WeightMeasureReportItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.weight_measure_report_item, parent, false);
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
