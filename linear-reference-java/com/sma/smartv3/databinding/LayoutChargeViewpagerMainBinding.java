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
        int r0 = R.id.item_charge_bind;
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_charge_bind);
        if (r1 == null) goto L9;
        r0 = R.id.iv_screensaver;
        ImageViewRound r2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_screensaver);
        if (r2 == null) goto L9;
        return new LayoutChargeViewpagerMainBinding((FrameLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutChargeViewpagerMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutChargeViewpagerMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_charge_viewpager_main, parent, false);
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
