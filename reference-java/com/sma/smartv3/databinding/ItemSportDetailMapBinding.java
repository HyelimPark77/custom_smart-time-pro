package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSportDetailMapBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemSportDetailContent;

    @NonNull
    public final PFMedium itemSportDetailTitle;

    @NonNull
    public final PFMedium itemSportDetailUnit;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sportDetailStepsLayout;

    private ItemSportDetailMapBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemSportDetailContent, @NonNull PFMedium itemSportDetailTitle, @NonNull PFMedium itemSportDetailUnit, @NonNull LinearLayout sportDetailStepsLayout) {
        this.rootView = rootView;
        this.itemSportDetailContent = itemSportDetailContent;
        this.itemSportDetailTitle = itemSportDetailTitle;
        this.itemSportDetailUnit = itemSportDetailUnit;
        this.sportDetailStepsLayout = sportDetailStepsLayout;
    }

    @NonNull
    public static ItemSportDetailMapBinding bind(@NonNull View rootView) {
        int i = R.id.item_sport_detail_content;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_sport_detail_content);
        if (pFMedium != null) {
            i = R.id.item_sport_detail_title;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_sport_detail_title);
            if (pFMedium2 != null) {
                i = R.id.item_sport_detail_unit;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_sport_detail_unit);
                if (pFMedium3 != null) {
                    i = R.id.sport_detail_steps_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_steps_layout);
                    if (linearLayout != null) {
                        return new ItemSportDetailMapBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFMedium3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportDetailMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportDetailMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_detail_map, parent, false);
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
