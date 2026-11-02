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
import com.sma.smartv3.view.CustomGoogleMapView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentGoogleMapSportRecordBinding implements ViewBinding {

    @NonNull
    public final CustomGoogleMapView mapView;

    @NonNull
    private final LinearLayout rootView;

    private FragmentGoogleMapSportRecordBinding(@NonNull LinearLayout rootView, @NonNull CustomGoogleMapView mapView) {
        this.rootView = rootView;
        this.mapView = mapView;
    }

    @NonNull
    public static FragmentGoogleMapSportRecordBinding bind(@NonNull View rootView) {
        CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.mapView);
        if (customGoogleMapView != null) {
            return new FragmentGoogleMapSportRecordBinding((LinearLayout) rootView, customGoogleMapView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.mapView)));
    }

    @NonNull
    public static FragmentGoogleMapSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentGoogleMapSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_google_map_sport_record, parent, false);
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
