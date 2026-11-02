package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.adam.gpsstatus.GpsStatusImageView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutGpsStatusBinding implements ViewBinding {

    @NonNull
    public final LinearLayout gpsLl;

    @NonNull
    public final GpsStatusImageView ivGpsSignal;

    @NonNull
    private final LinearLayout rootView;

    private LayoutGpsStatusBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout gpsLl, @NonNull GpsStatusImageView ivGpsSignal) {
        this.rootView = rootView;
        this.gpsLl = gpsLl;
        this.ivGpsSignal = ivGpsSignal;
    }

    @NonNull
    public static LayoutGpsStatusBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        GpsStatusImageView r2 = (GpsStatusImageView) ViewBindings.findChildViewById(rootView, R.id.ivGpsSignal);
        if (r2 == null) goto L7;
        return new LayoutGpsStatusBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ivGpsSignal)));
    }

    @NonNull
    public static LayoutGpsStatusBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutGpsStatusBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_gps_status, parent, false);
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
