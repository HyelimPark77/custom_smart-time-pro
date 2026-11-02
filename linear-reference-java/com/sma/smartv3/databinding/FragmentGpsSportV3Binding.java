package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.adam.gpsstatus.GpsStatusImageView;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentGpsSportV3Binding implements ViewBinding {

    @NonNull
    public final TextureMapView bMapView;

    @NonNull
    public final ImageView curModeIcon;

    @NonNull
    public final FrameLayout flMap;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final LinearLayout gpsLl;

    @NonNull
    public final ImageView ivBg;

    @NonNull
    public final GpsStatusImageView ivGpsSignal;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final ConstraintLayout rootView_;

    @NonNull
    public final PFMedium sportRecommendationCourse;

    @NonNull
    public final RecyclerView sportRecommendationRecycler;

    private FragmentGpsSportV3Binding(@NonNull ConstraintLayout rootView_, @NonNull TextureMapView bMapView, @NonNull ImageView curModeIcon, @NonNull FrameLayout flMap, @NonNull CustomGoogleMapView gMapView, @NonNull LinearLayout gpsLl, @NonNull ImageView ivBg, @NonNull GpsStatusImageView ivGpsSignal, @NonNull RelativeLayout rootView, @NonNull PFMedium sportRecommendationCourse, @NonNull RecyclerView sportRecommendationRecycler) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.curModeIcon = curModeIcon;
        this.flMap = flMap;
        this.gMapView = gMapView;
        this.gpsLl = gpsLl;
        this.ivBg = ivBg;
        this.ivGpsSignal = ivGpsSignal;
        this.rootView = rootView;
        this.sportRecommendationCourse = sportRecommendationCourse;
        this.sportRecommendationRecycler = sportRecommendationRecycler;
    }

    @NonNull
    public static FragmentGpsSportV3Binding bind(@NonNull View rootView) {
        int r0 = R.id.bMapView;
        TextureMapView r4 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r4 == null) goto L25;
        r0 = R.id.cur_mode_icon;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cur_mode_icon);
        if (r5 == null) goto L25;
        r0 = R.id.fl_map;
        FrameLayout r6 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_map);
        if (r6 == null) goto L25;
        r0 = R.id.gMapView;
        CustomGoogleMapView r7 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r7 == null) goto L25;
        r0 = R.id.gpsLl;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.gpsLl);
        if (r8 == null) goto L25;
        r0 = R.id.iv_bg;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bg);
        if (r9 == null) goto L25;
        r0 = R.id.ivGpsSignal;
        GpsStatusImageView r10 = (GpsStatusImageView) ViewBindings.findChildViewById(rootView, R.id.ivGpsSignal);
        if (r10 == null) goto L25;
        r0 = R.id.root_view;
        RelativeLayout r11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.root_view);
        if (r11 == null) goto L25;
        r0 = R.id.sportRecommendationCourse;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sportRecommendationCourse);
        if (r12 == null) goto L25;
        r0 = R.id.sportRecommendationRecycler;
        RecyclerView r13 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.sportRecommendationRecycler);
        if (r13 == null) goto L25;
        return new FragmentGpsSportV3Binding((ConstraintLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentGpsSportV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentGpsSportV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_gps_sport_v3, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView_;
    }
}
