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
        int i = R.id.item_detail_item_hr_tv;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_hr_tv);
        if (pFMedium != null) {
            i = R.id.item_detail_item_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_icon);
            if (imageView != null) {
                i = R.id.item_detail_item_pace_tv;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_pace_tv);
                if (pFMedium2 != null) {
                    i = R.id.item_detail_item_time_tv;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_time_tv);
                    if (pFMedium3 != null) {
                        i = R.id.item_detail_item_title;
                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_detail_item_title);
                        if (pFMedium4 != null) {
                            return new ItemCoachPlanDetailItemBinding((LinearLayout) rootView, pFMedium, imageView, pFMedium2, pFMedium3, pFMedium4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemCoachPlanDetailItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemCoachPlanDetailItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_coach_plan_detail_item, parent, false);
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
