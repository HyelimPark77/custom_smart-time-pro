package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentGpsSportBinding implements ViewBinding {

    @NonNull
    public final TextureMapView bMapView;

    @NonNull
    public final FrameLayout flMap;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final ImageView ivBg;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    private FragmentGpsSportBinding(@NonNull RelativeLayout rootView_, @NonNull TextureMapView bMapView, @NonNull FrameLayout flMap, @NonNull CustomGoogleMapView gMapView, @NonNull ImageView ivBg, @NonNull RelativeLayout rootView) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.flMap = flMap;
        this.gMapView = gMapView;
        this.ivBg = ivBg;
        this.rootView = rootView;
    }

    @NonNull
    public static FragmentGpsSportBinding bind(@NonNull View rootView) {
        int r0 = R.id.bMapView;
        TextureMapView r4 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r4 == null) goto L13;
        r0 = R.id.fl_map;
        FrameLayout r5 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_map);
        if (r5 == null) goto L13;
        r0 = R.id.gMapView;
        CustomGoogleMapView r6 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r6 == null) goto L13;
        r0 = R.id.iv_bg;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bg);
        if (r7 == null) goto L13;
        RelativeLayout r3 = (RelativeLayout) rootView;
        return new FragmentGpsSportBinding(r3, r4, r5, r6, r7, r3);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentGpsSportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentGpsSportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_gps_sport, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
