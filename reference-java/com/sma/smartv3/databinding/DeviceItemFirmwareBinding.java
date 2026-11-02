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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final TintImageView f51038iv;

    @NonNull
    public final ImageView ivRemind;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemFirmwareBinding(@NonNull LinearLayout rootView, @NonNull TintImageView iv, @NonNull ImageView ivRemind) {
        this.rootView = rootView;
        this.f51038iv = iv;
        this.ivRemind = ivRemind;
    }

    @NonNull
    public static DeviceItemFirmwareBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (tintImageView != null) {
            i = R.id.ivRemind;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
            if (imageView != null) {
                return new DeviceItemFirmwareBinding((LinearLayout) rootView, tintImageView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DeviceItemFirmwareBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemFirmwareBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_firmware, parent, false);
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
