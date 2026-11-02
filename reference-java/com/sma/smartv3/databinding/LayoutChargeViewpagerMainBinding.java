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
public final class LayoutChargeViewpagerMainBinding implements ViewBinding {

    @NonNull
    public final FrameLayout itemChargeBind;

    @NonNull
    public final ImageViewRound ivScreensaver;

    @NonNull
    private final FrameLayout rootView;

    private LayoutChargeViewpagerMainBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout itemChargeBind, @NonNull ImageViewRound ivScreensaver) {
        this.rootView = rootView;
        this.itemChargeBind = itemChargeBind;
        this.ivScreensaver = ivScreensaver;
    }

    @NonNull
    public static LayoutChargeViewpagerMainBinding bind(@NonNull View rootView) {
        int i = R.id.item_charge_bind;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_charge_bind);
        if (frameLayout != null) {
            i = R.id.iv_screensaver;
            ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_screensaver);
            if (imageViewRound != null) {
                return new LayoutChargeViewpagerMainBinding((FrameLayout) rootView, frameLayout, imageViewRound);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutChargeViewpagerMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutChargeViewpagerMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_charge_viewpager_main, parent, false);
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
