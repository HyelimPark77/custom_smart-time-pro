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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemPointsPackSelectBinding implements ViewBinding {

    @NonNull
    public final FrameLayout recommendStatus;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout rv;

    @NonNull
    public final LinearLayout selectStatusAmount;

    @NonNull
    public final PFMedium tvAmount;

    @NonNull
    public final PFMedium tvOriginalAmount;

    @NonNull
    public final PFMedium tvPackName;

    private ItemPointsPackSelectBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout recommendStatus, @NonNull FrameLayout rv, @NonNull LinearLayout selectStatusAmount, @NonNull PFMedium tvAmount, @NonNull PFMedium tvOriginalAmount, @NonNull PFMedium tvPackName) {
        this.rootView = rootView;
        this.recommendStatus = recommendStatus;
        this.rv = rv;
        this.selectStatusAmount = selectStatusAmount;
        this.tvAmount = tvAmount;
        this.tvOriginalAmount = tvOriginalAmount;
        this.tvPackName = tvPackName;
    }

    @NonNull
    public static ItemPointsPackSelectBinding bind(@NonNull View rootView) {
        int r0 = R.id.recommendStatus;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.recommendStatus);
        if (r4 == null) goto L15;
        FrameLayout r3 = (FrameLayout) rootView;
        r0 = R.id.selectStatusAmount;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.selectStatusAmount);
        if (r6 == null) goto L15;
        r0 = R.id.tv_amount;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_amount);
        if (r7 == null) goto L15;
        r0 = R.id.tv_original_amount;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original_amount);
        if (r8 == null) goto L15;
        r0 = R.id.tv_pack_name;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pack_name);
        if (r9 == null) goto L15;
        return new ItemPointsPackSelectBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemPointsPackSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemPointsPackSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_points_pack_select, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
