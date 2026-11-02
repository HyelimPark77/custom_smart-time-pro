package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceItemCustomLogoBinding implements ViewBinding {

    @NonNull
    public final TintImageView iv;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemCustomLogoBinding(@NonNull LinearLayout rootView, @NonNull TintImageView iv) {
        this.rootView = rootView;
        this.iv = iv;
    }

    @NonNull
    public static DeviceItemCustomLogoBinding bind(@NonNull View rootView) {
        TintImageView r1 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L7;
        return new DeviceItemCustomLogoBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.iv)));
    }

    @NonNull
    public static DeviceItemCustomLogoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemCustomLogoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_custom_logo, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
