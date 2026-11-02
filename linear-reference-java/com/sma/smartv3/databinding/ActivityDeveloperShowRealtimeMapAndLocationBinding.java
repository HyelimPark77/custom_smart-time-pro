package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperShowRealtimeMapAndLocationBinding implements ViewBinding {

    @NonNull
    public final ListView listView;

    @NonNull
    public final TextureMapView mapView;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDeveloperShowRealtimeMapAndLocationBinding(@NonNull LinearLayout rootView, @NonNull ListView listView, @NonNull TextureMapView mapView) {
        this.rootView = rootView;
        this.listView = listView;
        this.mapView = mapView;
    }

    @NonNull
    public static ActivityDeveloperShowRealtimeMapAndLocationBinding bind(@NonNull View rootView) {
        int r0 = R.id.list_view;
        ListView r1 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r1 == null) goto L9;
        r0 = R.id.mapView;
        TextureMapView r2 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.mapView);
        if (r2 == null) goto L9;
        return new ActivityDeveloperShowRealtimeMapAndLocationBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperShowRealtimeMapAndLocationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperShowRealtimeMapAndLocationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_show_realtime_map_and_location, parent, false);
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
