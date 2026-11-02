package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperWeaterTestBinding implements ViewBinding {

    @NonNull
    public final TextureMapView mapView;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDeveloperWeaterTestBinding(@NonNull LinearLayout rootView, @NonNull TextureMapView mapView) {
        this.rootView = rootView;
        this.mapView = mapView;
    }

    @NonNull
    public static ActivityDeveloperWeaterTestBinding bind(@NonNull View rootView) {
        TextureMapView r1 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.mapView);
        if (r1 == null) goto L7;
        return new ActivityDeveloperWeaterTestBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.mapView)));
    }

    @NonNull
    public static ActivityDeveloperWeaterTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperWeaterTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_weater_test, parent, false);
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
