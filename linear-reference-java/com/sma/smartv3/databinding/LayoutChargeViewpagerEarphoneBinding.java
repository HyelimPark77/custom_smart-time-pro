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
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_earphone_bind);
        if (r1 == null) goto L7;
        return new LayoutChargeViewpagerEarphoneBinding((FrameLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.item_earphone_bind)));
    }

    @NonNull
    public static LayoutChargeViewpagerEarphoneBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutChargeViewpagerEarphoneBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_charge_viewpager_earphone, parent, false);
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
