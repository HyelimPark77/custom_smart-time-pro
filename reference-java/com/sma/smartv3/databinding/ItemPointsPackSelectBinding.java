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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final FrameLayout f51157rv;

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
        this.f51157rv = rv;
        this.selectStatusAmount = selectStatusAmount;
        this.tvAmount = tvAmount;
        this.tvOriginalAmount = tvOriginalAmount;
        this.tvPackName = tvPackName;
    }

    @NonNull
    public static ItemPointsPackSelectBinding bind(@NonNull View rootView) {
        int i = R.id.recommendStatus;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.recommendStatus);
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) rootView;
            i = R.id.selectStatusAmount;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.selectStatusAmount);
            if (linearLayout != null) {
                i = R.id.tv_amount;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_amount);
                if (pFMedium != null) {
                    i = R.id.tv_original_amount;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original_amount);
                    if (pFMedium2 != null) {
                        i = R.id.tv_pack_name;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pack_name);
                        if (pFMedium3 != null) {
                            return new ItemPointsPackSelectBinding(frameLayout2, frameLayout, frameLayout2, linearLayout, pFMedium, pFMedium2, pFMedium3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPointsPackSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemPointsPackSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_points_pack_select, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
