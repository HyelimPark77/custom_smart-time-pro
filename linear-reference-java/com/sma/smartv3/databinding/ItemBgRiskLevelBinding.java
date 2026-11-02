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
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.fl_bg;
        FrameLayout r3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_bg);
        if (r3 == null) goto L13;
        r0 = R.id.fl_bg_select;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_bg_select);
        if (r4 == null) goto L13;
        r0 = R.id.iv_risk_level_icon;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_risk_level_icon);
        if (r5 == null) goto L13;
        r0 = R.id.tv_title;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r6 == null) goto L13;
        return new ItemBgRiskLevelBinding(r1, r1, r3, r4, r5, r6);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemBgRiskLevelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemBgRiskLevelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_bg_risk_level, parent, false);
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
