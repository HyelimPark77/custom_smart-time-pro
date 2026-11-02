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
public final class DeviceItemAppStoreBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final TintImageView f51021iv;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemAppStoreBinding(@NonNull LinearLayout rootView, @NonNull TintImageView iv) {
        this.rootView = rootView;
        this.f51021iv = iv;
    }

    @NonNull
    public static DeviceItemAppStoreBinding bind(@NonNull View rootView) {
        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (tintImageView != null) {
            return new DeviceItemAppStoreBinding((LinearLayout) rootView, tintImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51417iv)));
    }

    @NonNull
    public static DeviceItemAppStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemAppStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_app_store, parent, false);
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
