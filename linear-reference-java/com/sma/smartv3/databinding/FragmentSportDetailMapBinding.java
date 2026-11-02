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
        int r1 = R.id.bMapView;
        TextureMapView r5 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r5 == null) goto L35;
        r1 = R.id.btn_map_3d;
        CheckBox r6 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_3d);
        if (r6 == null) goto L35;
        r1 = R.id.btn_map_hot;
        CheckBox r7 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_hot);
        if (r7 == null) goto L35;
        r1 = R.id.btn_map_mark;
        CheckBox r8 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_mark);
        if (r8 == null) goto L35;
        r1 = R.id.btn_track_play;
        Button r9 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_track_play);
        if (r9 == null) goto L35;
        r1 = R.id.data_panel;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r10 == null) goto L35;
        r1 = R.id.downloadGpxIb;
        CheckBox r11 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
        if (r11 == null) goto L35;
        r1 = R.id.gMapView;
        CustomGoogleMapView r12 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r12 == null) goto L35;
        r1 = R.id.mapView_layout;
        FrameLayout r13 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapView_layout);
        if (r13 == null) goto L35;
        RelativeLayout r4 = (RelativeLayout) rootView;
        r1 = R.id.tv_avg_bpm_value;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r15 == null) goto L35;
        r1 = R.id.tv_calories_value;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r16 == null) goto L35;
        r1 = R.id.tv_dateTime;
        DINCondBold r17 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r17 == null) goto L35;
        r1 = R.id.tv_distance_unit;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r18 == null) goto L35;
        r1 = R.id.tv_distance_value;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
        if (r19 == null) goto L35;
        r1 = R.id.tv_duration;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
        if (r20 == null) goto L35;
        return new FragmentSportDetailMapBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r4, r15, r16, r17, r18, r19, r20);
    L35:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_map, parent, false);
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
