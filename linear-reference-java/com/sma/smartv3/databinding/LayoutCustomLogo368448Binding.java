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
public final class LayoutCustomLogo368448Binding implements ViewBinding {

    @NonNull
    public final ImageViewRound customBg;

    @NonNull
    private final FrameLayout rootView;

    private LayoutCustomLogo368448Binding(@NonNull FrameLayout rootView, @NonNull ImageViewRound customBg) {
        this.rootView = rootView;
        this.customBg = customBg;
    }

    @NonNull
    public static LayoutCustomLogo368448Binding bind(@NonNull View rootView) {
        ImageViewRound r1 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customBg);
        if (r1 == null) goto L7;
        return new LayoutCustomLogo368448Binding((FrameLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.customBg)));
    }

    @NonNull
    public static LayoutCustomLogo368448Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutCustomLogo368448Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_custom_logo_368_448, parent, false);
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
