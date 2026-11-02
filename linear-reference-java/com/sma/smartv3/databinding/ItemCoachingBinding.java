package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemCoachingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivSync;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvDescription;

    @NonNull
    public final PFMedium tvTitle;

    private ItemCoachingBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivSync, @NonNull PFMedium tvDescription, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.ivSync = ivSync;
        this.tvDescription = tvDescription;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ItemCoachingBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_sync;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_sync);
        if (r1 == null) goto L11;
        r0 = R.id.tv_description;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_description);
        if (r2 == null) goto L11;
        r0 = R.id.tv_title;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r3 == null) goto L11;
        return new ItemCoachingBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemCoachingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemCoachingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_coaching, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
