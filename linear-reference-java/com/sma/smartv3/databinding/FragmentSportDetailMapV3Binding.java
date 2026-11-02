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
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailMapV3Binding implements ViewBinding {

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
    public final CheckBox downloadGpxIb;

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final LineChart hrLineChart;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final LinearLayout llHr;

    @NonNull
    public final FrameLayout mapViewLayout;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final LinearLayout shareVideoMapBtnLl;

    @NonNull
    public final Button shareVideoSaveBtn;

    @NonNull
    public final PFMedium tvAvgBpmValue;

    @NonNull
    public final PFMedium tvCaloriesValue;

    @NonNull
    public final PFMedium tvDateTime;

    @NonNull
    public final DINCondBold tvDetailName;

    @NonNull
    public final DINCondBold tvDistanceUnit;

    @NonNull
    public final DINCondBold tvDistanceValue;

    @NonNull
    public final LinearLayout tvDistanceValueLl;

    @NonNull
    public final PFMedium tvDuration;

    @NonNull
    public final PFMedium tvHrValue;

    private FragmentSportDetailMapV3Binding(@NonNull RelativeLayout rootView_, @NonNull TextureMapView bMapView, @NonNull CheckBox btnMap3d, @NonNull CheckBox btnMapHot, @NonNull CheckBox btnMapMark, @NonNull Button btnTrackPlay, @NonNull LinearLayout checkLayout, @NonNull CheckBox downloadGpxIb, @NonNull PFMedium edtNickname, @NonNull CustomGoogleMapView gMapView, @NonNull LineChart hrLineChart, @NonNull ImageViewRound ivAvatar, @NonNull LinearLayout llHr, @NonNull FrameLayout mapViewLayout, @NonNull RelativeLayout rootView, @NonNull LinearLayout shareVideoMapBtnLl, @NonNull Button shareVideoSaveBtn, @NonNull PFMedium tvAvgBpmValue, @NonNull PFMedium tvCaloriesValue, @NonNull PFMedium tvDateTime, @NonNull DINCondBold tvDetailName, @NonNull DINCondBold tvDistanceUnit, @NonNull DINCondBold tvDistanceValue, @NonNull LinearLayout tvDistanceValueLl, @NonNull PFMedium tvDuration, @NonNull PFMedium tvHrValue) {
        this.rootView_ = rootView_;
        this.bMapView = bMapView;
        this.btnMap3d = btnMap3d;
        this.btnMapHot = btnMapHot;
        this.btnMapMark = btnMapMark;
        this.btnTrackPlay = btnTrackPlay;
        this.checkLayout = checkLayout;
        this.downloadGpxIb = downloadGpxIb;
        this.edtNickname = edtNickname;
        this.gMapView = gMapView;
        this.hrLineChart = hrLineChart;
        this.ivAvatar = ivAvatar;
        this.llHr = llHr;
        this.mapViewLayout = mapViewLayout;
        this.rootView = rootView;
        this.shareVideoMapBtnLl = shareVideoMapBtnLl;
        this.shareVideoSaveBtn = shareVideoSaveBtn;
        this.tvAvgBpmValue = tvAvgBpmValue;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDetailName = tvDetailName;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvDistanceValue = tvDistanceValue;
        this.tvDistanceValueLl = tvDistanceValueLl;
        this.tvDuration = tvDuration;
        this.tvHrValue = tvHrValue;
    }

    @NonNull
    public static FragmentSportDetailMapV3Binding bind(@NonNull View rootView) {
        int r1 = R.id.bMapView;
        TextureMapView r5 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r5 == null) goto L53;
        r1 = R.id.btn_map_3d;
        CheckBox r6 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_3d);
        if (r6 == null) goto L53;
        r1 = R.id.btn_map_hot;
        CheckBox r7 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_hot);
        if (r7 == null) goto L53;
        r1 = R.id.btn_map_mark;
        CheckBox r8 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_mark);
        if (r8 == null) goto L53;
        r1 = R.id.btn_track_play;
        Button r9 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_track_play);
        if (r9 == null) goto L53;
        r1 = R.id.check_layout;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.check_layout);
        if (r10 == null) goto L53;
        r1 = R.id.downloadGpxIb;
        CheckBox r11 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
        if (r11 == null) goto L53;
        r1 = R.id.edt_nickname;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r12 == null) goto L53;
        r1 = R.id.gMapView;
        CustomGoogleMapView r13 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r13 == null) goto L53;
        r1 = R.id.hrLineChart;
        LineChart r14 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
        if (r14 == null) goto L53;
        r1 = R.id.iv_avatar;
        ImageViewRound r15 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r15 == null) goto L53;
        r1 = R.id.ll_hr;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hr);
        if (r16 == null) goto L53;
        r1 = R.id.mapView_layout;
        FrameLayout r17 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapView_layout);
        if (r17 == null) goto L53;
        RelativeLayout r4 = (RelativeLayout) rootView;
        r1 = R.id.share_video_map_btn_ll;
        LinearLayout r19 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_video_map_btn_ll);
        if (r19 == null) goto L53;
        r1 = R.id.share_video_save_btn;
        Button r20 = (Button) ViewBindings.findChildViewById(rootView, R.id.share_video_save_btn);
        if (r20 == null) goto L53;
        r1 = R.id.tv_avg_bpm_value;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r21 == null) goto L53;
        r1 = R.id.tv_calories_value;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r22 == null) goto L53;
        r1 = R.id.tv_dateTime;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r23 == null) goto L53;
        r1 = R.id.tv_detail_name;
        DINCondBold r24 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
        if (r24 == null) goto L53;
        r1 = R.id.tv_distance_unit;
        DINCondBold r25 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r25 == null) goto L53;
        r1 = R.id.tv_distance_value;
        DINCondBold r26 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
        if (r26 == null) goto L53;
        r1 = R.id.tv_distance_value_ll;
        LinearLayout r27 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value_ll);
        if (r27 == null) goto L53;
        r1 = R.id.tv_duration;
        PFMedium r28 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
        if (r28 == null) goto L53;
        r1 = R.id.tv_hr_value;
        PFMedium r29 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hr_value);
        if (r29 == null) goto L53;
        return new FragmentSportDetailMapV3Binding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r4, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
    L53:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailMapV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailMapV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_map_v3, parent, false);
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
