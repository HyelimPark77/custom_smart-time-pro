package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceItemFirmwareBinding implements ViewBinding {

    @NonNull
    public final TintImageView iv;

    @NonNull
    public final ImageView ivRemind;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemFirmwareBinding(@NonNull LinearLayout rootView, @NonNull TintImageView iv, @NonNull ImageView ivRemind) {
        this.rootView = rootView;
        this.iv = iv;
        this.ivRemind = ivRemind;
    }

    @NonNull
    public static DeviceItemFirmwareBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        TintImageView r1 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L9;
        r0 = R.id.ivRemind;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
        if (r2 == null) goto L9;
        return new DeviceItemFirmwareBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DeviceItemFirmwareBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemFirmwareBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_firmware, parent, false);
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
