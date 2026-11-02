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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCustomLogoBinding implements ViewBinding {

    @NonNull
    public final FrameLayout facePanel;

    @NonNull
    public final ImageView ivAdd;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityCustomLogoBinding(@NonNull LinearLayout rootView_, @NonNull FrameLayout facePanel, @NonNull ImageView ivAdd, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.facePanel = facePanel;
        this.ivAdd = ivAdd;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityCustomLogoBinding bind(@NonNull View rootView) {
        int i = R.id.face_panel;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.face_panel);
        if (frameLayout != null) {
            i = R.id.iv_add;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_add);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                return new ActivityCustomLogoBinding(linearLayout, frameLayout, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCustomLogoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCustomLogoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_custom_logo, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
