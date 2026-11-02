package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailMapV2Binding implements ViewBinding {

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
    public final LinearLayout checkLayout;

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final CheckBox downloadGpxIb;

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final PFMedium edtNickname2;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final LinearLayout ivAvatar1Layout;

    @NonNull
    public final ImageViewRound ivAvatar2;

    @NonNull
    public final LinearLayout ivAvatar2Layout;

    @NonNull
    public final FrameLayout mapViewLayout;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final RecyclerView sportDetailMapV2Recycler;

    @NonNull
    public final PFMedium sportDetailMaxpace;

    @NonNull
    public final PFMedium sportDetailMinpace;

    @NonNull
    public final LinearLayout sportDetailPaceLayout;

    @NonNull
    public final ProgressBar sportDetailProgressbar;

    @NonNull
    public final RelativeLayout sportDetailProgressbarLayout;

    @NonNull
    public final LinearLayout sportDetailStepsLayout;

    @NonNull
    public final LinearLayout tvAirpressureLayout;

    @NonNull
    public final PFMedium tvAirpressureUnit;

    @NonNull
    public final PFMedium tvAirpressureValue;

    @NonNull
    public final PFMedium tvAvgBpmValue;

    @NonNull
    public final PFMedium tvCaloriesValue;

    @NonNull
    public final PFMedium tvDateTime;

    @NonNull
    public final PFMedium tvDateTimeNoMap;

    @NonNull
    public final DINCondBold tvDetailName;

    @NonNull
    public final DINCondBold tvDetailNameNoMap;

    @NonNull
    public final PFMedium tvDistanceUnit;

    @NonNull
    public final DINCondBold tvDistanceValue;

    @NonNull
    public final PFMedium tvDuration;

    @NonNull
    public final PFMedium tvDurationTitle;

    @NonNull
    public final PFMedium tvHrValue;

    @NonNull
    public final PFMedium tvPaceUnit;

    @NonNull
    public final PFMedium tvPaceValue;

    @NonNull
    public final PFMedium tvStepValue;

    @NonNull
    public final PFMedium tvViewFieldExplanation;

    private FragmentSportDetailMapV2Binding(@NonNull RelativeLayout rootView_, @NonNull TextureMapView bMapView, @NonNull CheckBox btnMap3d, @NonNull CheckBox btnMapHot, @NonNull CheckBox btnMapMark, @NonNull Button btnTrackPlay, @NonNull LinearLayout checkLayout, @NonNull LinearLayout dataPanel, @NonNull CheckBox downloadGpxIb, @NonNull PFMedium edtNickname, @NonNull PFMedium edtNickname2, @NonNull CustomGoogleMapView gMapView, @NonNull ImageViewRound ivAvatar, @NonNull LinearLayout ivAvatar1Layout, @NonNull ImageViewRound ivAvatar2, @NonNull LinearLayout ivAvatar2Layout, @NonNull FrameLayout mapViewLayout, @NonNull RelativeLayout rootView, @NonNull RecyclerView sportDetailMapV2Recycler, @NonNull PFMedium sportDetailMaxpace, @NonNull PFMedium sportDetailMinpace, @NonNull LinearLayout sportDetailPaceLayout, @NonNull ProgressBar sportDetailProgressbar, @NonNull RelativeLayout sportDetailProgressbarLayout, @NonNull LinearLayout sportDetailStepsLayout, @NonNull LinearLayout tvAirpressureLayout, @NonNull PFMedium tvAirpressureUnit, @NonNull PFMedium tvAirpressureValue, @NonNull PFMedium tvAvgBpmValue, @NonNull PFMedium tvCaloriesValue, @NonNull PFMedium tvDateTime, @NonNull PFMedium tvDateTimeNoMap, @NonNull DINCondBold tvDetailName, @NonNull DINCondBold tvDetailNameNoMap, @NonNull PFMedium tvDistanceUnit, @NonNull DINCondBold tvDistanceValue, @NonNull PFMedium tvDuration, @NonNull PFMedium tvDurationTitle, @NonNull PFMedium tvHrValue, @NonNull PFMedium tvPaceUnit, @NonNull PFMedium tvPaceValue, @NonNull PFMedium tvStepValue, @NonNull PFMedium tvViewFieldExplanation) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.btnMap3d = btnMap3d;
        this.btnMapHot = btnMapHot;
        this.btnMapMark = btnMapMark;
        this.btnTrackPlay = btnTrackPlay;
        this.checkLayout = checkLayout;
        this.dataPanel = dataPanel;
        this.downloadGpxIb = downloadGpxIb;
        this.edtNickname = edtNickname;
        this.edtNickname2 = edtNickname2;
        this.gMapView = gMapView;
        this.ivAvatar = ivAvatar;
        this.ivAvatar1Layout = ivAvatar1Layout;
        this.ivAvatar2 = ivAvatar2;
        this.ivAvatar2Layout = ivAvatar2Layout;
        this.mapViewLayout = mapViewLayout;
        this.rootView = rootView;
        this.sportDetailMapV2Recycler = sportDetailMapV2Recycler;
        this.sportDetailMaxpace = sportDetailMaxpace;
        this.sportDetailMinpace = sportDetailMinpace;
        this.sportDetailPaceLayout = sportDetailPaceLayout;
        this.sportDetailProgressbar = sportDetailProgressbar;
        this.sportDetailProgressbarLayout = sportDetailProgressbarLayout;
        this.sportDetailStepsLayout = sportDetailStepsLayout;
        this.tvAirpressureLayout = tvAirpressureLayout;
        this.tvAirpressureUnit = tvAirpressureUnit;
        this.tvAirpressureValue = tvAirpressureValue;
        this.tvAvgBpmValue = tvAvgBpmValue;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDateTimeNoMap = tvDateTimeNoMap;
        this.tvDetailName = tvDetailName;
        this.tvDetailNameNoMap = tvDetailNameNoMap;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvDistanceValue = tvDistanceValue;
        this.tvDuration = tvDuration;
        this.tvDurationTitle = tvDurationTitle;
        this.tvHrValue = tvHrValue;
        this.tvPaceUnit = tvPaceUnit;
        this.tvPaceValue = tvPaceValue;
        this.tvStepValue = tvStepValue;
        this.tvViewFieldExplanation = tvViewFieldExplanation;
    }

    @NonNull
    public static FragmentSportDetailMapV2Binding bind(@NonNull View rootView) {
        int r1 = R.id.bMapView;
        TextureMapView r5 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r5 == null) goto L87;
        r1 = R.id.btn_map_3d;
        CheckBox r6 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_3d);
        if (r6 == null) goto L87;
        r1 = R.id.btn_map_hot;
        CheckBox r7 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_hot);
        if (r7 == null) goto L87;
        r1 = R.id.btn_map_mark;
        CheckBox r8 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_mark);
        if (r8 == null) goto L87;
        r1 = R.id.btn_track_play;
        Button r9 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_track_play);
        if (r9 == null) goto L87;
        r1 = R.id.check_layout;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.check_layout);
        if (r10 == null) goto L87;
        r1 = R.id.data_panel;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r11 == null) goto L87;
        r1 = R.id.downloadGpxIb;
        CheckBox r12 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
        if (r12 == null) goto L87;
        r1 = R.id.edt_nickname;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r13 == null) goto L87;
        r1 = R.id.edt_nickname2;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname2);
        if (r14 == null) goto L87;
        r1 = R.id.gMapView;
        CustomGoogleMapView r15 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r15 == null) goto L87;
        r1 = R.id.iv_avatar;
        ImageViewRound r16 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r16 == null) goto L87;
        r1 = R.id.iv_avatar1_layout;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.iv_avatar1_layout);
        if (r17 == null) goto L87;
        r1 = R.id.iv_avatar2;
        ImageViewRound r18 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar2);
        if (r18 == null) goto L87;
        r1 = R.id.iv_avatar2_layout;
        LinearLayout r19 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.iv_avatar2_layout);
        if (r19 == null) goto L87;
        r1 = R.id.mapView_layout;
        FrameLayout r20 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapView_layout);
        if (r20 == null) goto L87;
        RelativeLayout r4 = (RelativeLayout) rootView;
        r1 = R.id.sport_detail_map_v2_recycler;
        RecyclerView r22 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.sport_detail_map_v2_recycler);
        if (r22 == null) goto L87;
        r1 = R.id.sport_detail_maxpace;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_detail_maxpace);
        if (r23 == null) goto L87;
        r1 = R.id.sport_detail_minpace;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_detail_minpace);
        if (r24 == null) goto L87;
        r1 = R.id.sport_detail_pace_layout;
        LinearLayout r25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_pace_layout);
        if (r25 == null) goto L87;
        r1 = R.id.sport_detail_progressbar;
        ProgressBar r26 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.sport_detail_progressbar);
        if (r26 == null) goto L87;
        r1 = R.id.sport_detail_progressbar_layout;
        RelativeLayout r27 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_progressbar_layout);
        if (r27 == null) goto L87;
        r1 = R.id.sport_detail_steps_layout;
        LinearLayout r28 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_steps_layout);
        if (r28 == null) goto L87;
        r1 = R.id.tv_airpressure_layout;
        LinearLayout r29 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_layout);
        if (r29 == null) goto L87;
        r1 = R.id.tv_airpressure_unit;
        PFMedium r30 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_unit);
        if (r30 == null) goto L87;
        r1 = R.id.tv_airpressure_value;
        PFMedium r31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_value);
        if (r31 == null) goto L87;
        r1 = R.id.tv_avg_bpm_value;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r32 == null) goto L87;
        r1 = R.id.tv_calories_value;
        PFMedium r33 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r33 == null) goto L87;
        r1 = R.id.tv_dateTime;
        PFMedium r34 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r34 == null) goto L87;
        r1 = R.id.tv_dateTime_noMap;
        PFMedium r35 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime_noMap);
        if (r35 == null) goto L87;
        r1 = R.id.tv_detail_name;
        DINCondBold r36 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
        if (r36 == null) goto L87;
        r1 = R.id.tv_detail_name_noMap;
        DINCondBold r37 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name_noMap);
        if (r37 == null) goto L87;
        r1 = R.id.tv_distance_unit;
        PFMedium r38 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r38 == null) goto L87;
        r1 = R.id.tv_distance_value;
        DINCondBold r39 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
        if (r39 == null) goto L87;
        r1 = R.id.tv_duration;
        PFMedium r40 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
        if (r40 == null) goto L87;
        r1 = R.id.tv_duration_title;
        PFMedium r41 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration_title);
        if (r41 == null) goto L87;
        r1 = R.id.tv_hr_value;
        PFMedium r42 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hr_value);
        if (r42 == null) goto L87;
        r1 = R.id.tv_pace_unit;
        PFMedium r43 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_unit);
        if (r43 == null) goto L87;
        r1 = R.id.tv_pace_value;
        PFMedium r44 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
        if (r44 == null) goto L87;
        r1 = R.id.tv_step_value;
        PFMedium r45 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_step_value);
        if (r45 == null) goto L87;
        r1 = R.id.tv_view_field_explanation;
        PFMedium r46 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_view_field_explanation);
        if (r46 == null) goto L87;
        return new FragmentSportDetailMapV2Binding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r4, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46);
    L87:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailMapV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailMapV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_map_v2, parent, false);
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
