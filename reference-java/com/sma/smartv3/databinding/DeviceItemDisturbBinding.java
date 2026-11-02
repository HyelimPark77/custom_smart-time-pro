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
public final class DeviceItemDisturbBinding implements ViewBinding {

    @NonNull
    public final LinearLayout disturbLl;

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final TintImageView f51031iv;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemDisturbBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout disturbLl, @NonNull TintImageView iv) {
        this.rootView = rootView;
        this.disturbLl = disturbLl;
        this.f51031iv = iv;
    }

    @NonNull
    public static DeviceItemDisturbBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (tintImageView != null) {
            return new DeviceItemDisturbBinding(linearLayout, linearLayout, tintImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51417iv)));
    }

    @NonNull
    public static DeviceItemDisturbBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemDisturbBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_disturb, parent, false);
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
