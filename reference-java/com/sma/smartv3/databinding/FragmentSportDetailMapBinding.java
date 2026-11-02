package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailMapBinding implements ViewBinding {

    @NonNull
    public final TextureMapView bMapView;

    @NonNull
    public final CheckBox btnMap3d;

    @NonNull
    public final CheckBox btnMapHot;

    @NonNull
    public final CheckBox btnMapMark;

    @NonNull
    public final Button btnTrackPlay;

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final CheckBox downloadGpxIb;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final FrameLayout mapViewLayout;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final PFMedium tvAvgBpmValue;

    @NonNull
    public final PFMedium tvCaloriesValue;

    @NonNull
    public final DINCondBold tvDateTime;

    @NonNull
    public final PFMedium tvDistanceUnit;

    @NonNull
    public final PFMedium tvDistanceValue;

    @NonNull
    public final DINCondBold tvDuration;

    private FragmentSportDetailMapBinding(@NonNull RelativeLayout rootView_, @NonNull TextureMapView bMapView, @NonNull CheckBox btnMap3d, @NonNull CheckBox btnMapHot, @NonNull CheckBox btnMapMark, @NonNull Button btnTrackPlay, @NonNull LinearLayout dataPanel, @NonNull CheckBox downloadGpxIb, @NonNull CustomGoogleMapView gMapView, @NonNull FrameLayout mapViewLayout, @NonNull RelativeLayout rootView, @NonNull PFMedium tvAvgBpmValue, @NonNull PFMedium tvCaloriesValue, @NonNull DINCondBold tvDateTime, @NonNull PFMedium tvDistanceUnit, @NonNull PFMedium tvDistanceValue, @NonNull DINCondBold tvDuration) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.btnMap3d = btnMap3d;
        this.btnMapHot = btnMapHot;
        this.btnMapMark = btnMapMark;
        this.btnTrackPlay = btnTrackPlay;
        this.dataPanel = dataPanel;
        this.downloadGpxIb = downloadGpxIb;
        this.gMapView = gMapView;
        this.mapViewLayout = mapViewLayout;
        this.rootView = rootView;
        this.tvAvgBpmValue = tvAvgBpmValue;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvDistanceValue = tvDistanceValue;
        this.tvDuration = tvDuration;
    }

    @NonNull
    public static FragmentSportDetailMapBinding bind(@NonNull View rootView) {
        int i = R.id.bMapView;
        TextureMapView textureMapView = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (textureMapView != null) {
            i = R.id.btn_map_3d;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_3d);
            if (checkBox != null) {
                i = R.id.btn_map_hot;
                CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_hot);
                if (checkBox2 != null) {
                    i = R.id.btn_map_mark;
                    CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_mark);
                    if (checkBox3 != null) {
                        i = R.id.btn_track_play;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_track_play);
                        if (button != null) {
                            i = R.id.data_panel;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
                            if (linearLayout != null) {
                                i = R.id.downloadGpxIb;
                                CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
                                if (checkBox4 != null) {
                                    i = R.id.gMapView;
                                    CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
                                    if (customGoogleMapView != null) {
                                        i = R.id.mapView_layout;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapView_layout);
                                        if (frameLayout != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                            i = R.id.tv_avg_bpm_value;
                                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
                                            if (pFMedium != null) {
                                                i = R.id.tv_calories_value;
                                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
                                                if (pFMedium2 != null) {
                                                    i = R.id.tv_dateTime;
                                                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
                                                    if (dINCondBold != null) {
                                                        i = R.id.tv_distance_unit;
                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                                                        if (pFMedium3 != null) {
                                                            i = R.id.tv_distance_value;
                                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                                            if (pFMedium4 != null) {
                                                                i = R.id.tv_duration;
                                                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
                                                                if (dINCondBold2 != null) {
                                                                    return new FragmentSportDetailMapBinding(relativeLayout, textureMapView, checkBox, checkBox2, checkBox3, button, linearLayout, checkBox4, customGoogleMapView, frameLayout, relativeLayout, pFMedium, pFMedium2, dINCondBold, pFMedium3, pFMedium4, dINCondBold2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static FragmentSportDetailMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_map, parent, false);
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
