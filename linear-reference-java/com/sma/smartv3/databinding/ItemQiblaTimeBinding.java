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
public final class ItemQiblaTimeBinding implements ViewBinding {

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvMin;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvTime;

    private ItemQiblaTimeBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout container, @NonNull ImageView ivIcon, @NonNull LinearLayout llContent, @NonNull PFMedium tvMin, @NonNull PFMedium tvName, @NonNull PFMedium tvTime) {
        this.rootView = rootView;
        this.container = container;
        this.ivIcon = ivIcon;
        this.llContent = llContent;
        this.tvMin = tvMin;
        this.tvName = tvName;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ItemQiblaTimeBinding bind(@NonNull View rootView) {
        FrameLayout r1 = (FrameLayout) rootView;
        int r0 = R.id.iv_icon;
        ImageView r3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (r3 == null) goto L15;
        r0 = R.id.ll_content;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_content);
        if (r4 == null) goto L15;
        r0 = R.id.tv_min;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min);
        if (r5 == null) goto L15;
        r0 = R.id.tv_name;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r6 == null) goto L15;
        r0 = R.id.tv_time;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r7 == null) goto L15;
        return new ItemQiblaTimeBinding(r1, r1, r3, r4, r5, r6, r7);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemQiblaTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemQiblaTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_qibla_time, parent, false);
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
