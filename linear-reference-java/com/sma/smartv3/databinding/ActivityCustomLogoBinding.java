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
        int r0 = R.id.face_panel;
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.face_panel);
        if (r1 == null) goto L9;
        r0 = R.id.iv_add;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_add);
        if (r2 == null) goto L9;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityCustomLogoBinding(r3, r1, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCustomLogoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCustomLogoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_custom_logo, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
