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
        int i = R.id.bMapView;
        TextureMapView textureMapView = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (textureMapView != null) {
            i = R.id.fl_map;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_map);
            if (frameLayout != null) {
                i = R.id.gMapView;
                CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
                if (customGoogleMapView != null) {
                    i = R.id.iv_bg;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bg);
                    if (imageView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                        return new FragmentGpsSportBinding(relativeLayout, textureMapView, frameLayout, customGoogleMapView, imageView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentGpsSportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentGpsSportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_gps_sport, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
