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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityElectrocardiogramV3Binding implements ViewBinding {

    @NonNull
    public final FrameLayout layoutFrame;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityElectrocardiogramV3Binding(@NonNull LinearLayout rootView, @NonNull FrameLayout layoutFrame, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.layoutFrame = layoutFrame;
        this.root = root;
    }

    @NonNull
    public static ActivityElectrocardiogramV3Binding bind(@NonNull View rootView) {
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.layout_frame);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.layout_frame)));
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ActivityElectrocardiogramV3Binding(linearLayout, frameLayout, linearLayout);
    }

    @NonNull
    public static ActivityElectrocardiogramV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityElectrocardiogramV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_electrocardiogram_v3, parent, false);
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
