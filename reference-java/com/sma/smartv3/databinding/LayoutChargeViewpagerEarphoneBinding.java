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

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutChargeViewpagerEarphoneBinding implements ViewBinding {

    @NonNull
    public final FrameLayout itemEarphoneBind;

    @NonNull
    private final FrameLayout rootView;

    private LayoutChargeViewpagerEarphoneBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout itemEarphoneBind) {
        this.rootView = rootView;
        this.itemEarphoneBind = itemEarphoneBind;
    }

    @NonNull
    public static LayoutChargeViewpagerEarphoneBinding bind(@NonNull View rootView) {
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_earphone_bind);
        if (frameLayout != null) {
            return new LayoutChargeViewpagerEarphoneBinding((FrameLayout) rootView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.item_earphone_bind)));
    }

    @NonNull
    public static LayoutChargeViewpagerEarphoneBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutChargeViewpagerEarphoneBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_charge_viewpager_earphone, parent, false);
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
