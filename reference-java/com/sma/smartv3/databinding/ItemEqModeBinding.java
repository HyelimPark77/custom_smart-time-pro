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
        int i = R.id.iv_eq_mode_bmp;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_eq_mode_bmp);
        if (imageView != null) {
            i = R.id.tv_eq_mode_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_name);
            if (textView != null) {
                return new ItemEqModeBinding((ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemEqModeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemEqModeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_eq_mode, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
