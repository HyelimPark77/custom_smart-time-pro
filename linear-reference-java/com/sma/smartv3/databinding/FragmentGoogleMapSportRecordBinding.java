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
        CustomGoogleMapView r1 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.mapView);
        if (r1 == null) goto L7;
        return new FragmentGoogleMapSportRecordBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.mapView)));
    }

    @NonNull
    public static FragmentGoogleMapSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentGoogleMapSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_google_map_sport_record, parent, false);
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
