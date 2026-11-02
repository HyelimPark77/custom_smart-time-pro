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

    @NonNull
    public final TintImageView iv;

    @NonNull
    private final LinearLayout rootView;

    private DeviceItemDisturbBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout disturbLl, @NonNull TintImageView iv) {
        this.rootView = rootView;
        this.disturbLl = disturbLl;
        this.iv = iv;
    }

    @NonNull
    public static DeviceItemDisturbBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        TintImageView r2 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r2 == null) goto L7;
        return new DeviceItemDisturbBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.iv)));
    }

    @NonNull
    public static DeviceItemDisturbBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DeviceItemDisturbBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.device_item_disturb, parent, false);
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
