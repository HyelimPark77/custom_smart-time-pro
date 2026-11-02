package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemCoachPlanDetailItemBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemDetailItemHrTv;

    @NonNull
    public final ImageView itemDetailItemIcon;

    @NonNull
    public final PFMedium itemDetailItemPaceTv;

    @NonNull
    public final PFMedium itemDetailItemTimeTv;

    @NonNull
    public final PFMedium itemDetailItemTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemCoachPlanDetailItemBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemDetailItemHrTv, @NonNull ImageView itemDetailItemIcon, @NonNull PFMedium itemDetailItemPaceTv, @NonNull PFMedium itemDetailItemTimeTv, @NonNull PFMedium itemDetailItemTitle) {
        this.rootView = rootView;
        this.itemDetailItemHrTv = itemDetailItemHrTv;
        this.itemDetailItemIcon = itemDetailItemIcon;
        this.itemDetailItemPaceTv = itemDetailItemPaceTv;
        this.itemDetailItemTimeTv = itemDetailItemTimeTv;
        this.itemDetailItemTitle = itemDetailItemTitle;
    }

    @NonNull
    public static ItemCoachPlanDetailItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_detail_item_hr_tv;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_hr_tv);
        if (r4 == null) goto L15;
        r0 = R.id.item_detail_item_icon;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_icon);
        if (r5 == null) goto L15;
        r0 = R.id.item_detail_item_pace_tv;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_pace_tv);
        if (r6 == null) goto L15;
        r0 = R.id.item_detail_item_time_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_time_tv);
        if (r7 == null) goto L15;
        r0 = R.id.item_detail_item_title;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_title);
        if (r8 == null) goto L15;
        return new ItemCoachPlanDetailItemBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemCoachPlanDetailItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemCoachPlanDetailItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_coach_plan_detail_item, parent, false);
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
