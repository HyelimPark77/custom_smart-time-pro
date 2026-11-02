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
        LinearLayout linearLayout = (LinearLayout) rootView;
        GpsStatusImageView gpsStatusImageView = (GpsStatusImageView) ViewBindings.findChildViewById(rootView, R.id.ivGpsSignal);
        if (gpsStatusImageView != null) {
            return new LayoutGpsStatusBinding(linearLayout, linearLayout, gpsStatusImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ivGpsSignal)));
    }

    @NonNull
    public static LayoutGpsStatusBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutGpsStatusBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_gps_status, parent, false);
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
