package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentGpsSportV2Binding implements ViewBinding {

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
    private final ConstraintLayout rootView_;

    @NonNull
    public final PFMedium sportRecommendationCourse;

    @NonNull
    public final RecyclerView sportRecommendationRecycler;

    private FragmentGpsSportV2Binding(@NonNull ConstraintLayout rootView_, @NonNull TextureMapView bMapView, @NonNull FrameLayout flMap, @NonNull CustomGoogleMapView gMapView, @NonNull ImageView ivBg, @NonNull RelativeLayout rootView, @NonNull PFMedium sportRecommendationCourse, @NonNull RecyclerView sportRecommendationRecycler) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.flMap = flMap;
        this.gMapView = gMapView;
        this.ivBg = ivBg;
        this.rootView = rootView;
        this.sportRecommendationCourse = sportRecommendationCourse;
        this.sportRecommendationRecycler = sportRecommendationRecycler;
    }

    @NonNull
    public static FragmentGpsSportV2Binding bind(@NonNull View rootView) {
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
                        i = R.id.root_view;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
                        if (relativeLayout != null) {
                            i = R.id.sportRecommendationCourse;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecommendationCourse);
                            if (pFMedium != null) {
                                i = R.id.sportRecommendationRecycler;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.sportRecommendationRecycler);
                                if (recyclerView != null) {
                                    return new FragmentGpsSportV2Binding((ConstraintLayout) rootView, textureMapView, frameLayout, customGoogleMapView, imageView, relativeLayout, pFMedium, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentGpsSportV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentGpsSportV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_gps_sport_v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView_;
    }
}
