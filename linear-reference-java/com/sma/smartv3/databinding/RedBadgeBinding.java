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

/* JADX INFO: loaded from: classes19.dex */
public final class RedBadgeBinding implements ViewBinding {

    @NonNull
    public final ImageView ivRemind;

    @NonNull
    private final RelativeLayout rootView;

    private RedBadgeBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivRemind) {
        this.rootView = rootView;
        this.ivRemind = ivRemind;
    }

    @NonNull
    public static RedBadgeBinding bind(@NonNull View rootView) {
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
        if (r1 == null) goto L7;
        return new RedBadgeBinding((RelativeLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ivRemind)));
    }

    @NonNull
    public static RedBadgeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static RedBadgeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.red_badge, parent, false);
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
