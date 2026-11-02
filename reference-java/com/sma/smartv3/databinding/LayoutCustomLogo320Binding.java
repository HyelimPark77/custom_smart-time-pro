package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutCustomLogo320Binding implements ViewBinding {

    @NonNull
    public final ImageViewRound customBg;

    @NonNull
    private final FrameLayout rootView;

    private LayoutCustomLogo320Binding(@NonNull FrameLayout rootView, @NonNull ImageViewRound customBg) {
        this.rootView = rootView;
        this.customBg = customBg;
    }

    @NonNull
    public static LayoutCustomLogo320Binding bind(@NonNull View rootView) {
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customBg);
        if (imageViewRound != null) {
            return new LayoutCustomLogo320Binding((FrameLayout) rootView, imageViewRound);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.customBg)));
    }

    @NonNull
    public static LayoutCustomLogo320Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutCustomLogo320Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_custom_logo_320, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
