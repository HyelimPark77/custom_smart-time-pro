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
        int r0 = R.id.item_sport_detail_content;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_sport_detail_content);
        if (r4 == null) goto L13;
        r0 = R.id.item_sport_detail_title;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_sport_detail_title);
        if (r5 == null) goto L13;
        r0 = R.id.item_sport_detail_unit;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_sport_detail_unit);
        if (r6 == null) goto L13;
        r0 = R.id.sport_detail_steps_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_steps_layout);
        if (r7 == null) goto L13;
        return new ItemSportDetailMapBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSportDetailMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSportDetailMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sport_detail_map, parent, false);
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
