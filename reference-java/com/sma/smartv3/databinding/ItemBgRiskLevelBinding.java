package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemBgRiskLevelBinding implements ViewBinding {

    @NonNull
    public final LinearLayout container;

    @NonNull
    public final FrameLayout flBg;

    @NonNull
    public final FrameLayout flBgSelect;

    @NonNull
    public final ImageView ivRiskLevelIcon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTitle;

    private ItemBgRiskLevelBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout container, @NonNull FrameLayout flBg, @NonNull FrameLayout flBgSelect, @NonNull ImageView ivRiskLevelIcon, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.container = container;
        this.flBg = flBg;
        this.flBgSelect = flBgSelect;
        this.ivRiskLevelIcon = ivRiskLevelIcon;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ItemBgRiskLevelBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.fl_bg;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_bg);
        if (frameLayout != null) {
            i = R.id.fl_bg_select;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_bg_select);
            if (frameLayout2 != null) {
                i = R.id.iv_risk_level_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_risk_level_icon);
                if (imageView != null) {
                    i = R.id.tv_title;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                    if (pFMedium != null) {
                        return new ItemBgRiskLevelBinding(linearLayout, linearLayout, frameLayout, frameLayout2, imageView, pFMedium);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBgRiskLevelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemBgRiskLevelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_bg_risk_level, parent, false);
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
