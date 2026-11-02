package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemEqModeBinding implements ViewBinding {

    @NonNull
    public final ImageView ivEqModeBmp;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvEqModeName;

    private ItemEqModeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivEqModeBmp, @NonNull TextView tvEqModeName) {
        this.rootView = rootView;
        this.ivEqModeBmp = ivEqModeBmp;
        this.tvEqModeName = tvEqModeName;
    }

    @NonNull
    public static ItemEqModeBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_eq_mode_bmp;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_eq_mode_bmp);
        if (r1 == null) goto L9;
        r0 = R.id.tv_eq_mode_name;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_name);
        if (r2 == null) goto L9;
        return new ItemEqModeBinding((ConstraintLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemEqModeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemEqModeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_eq_mode, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
