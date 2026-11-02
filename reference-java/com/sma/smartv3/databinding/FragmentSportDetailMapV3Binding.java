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
                            i = R.id.check_layout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.check_layout);
                            if (linearLayout != null) {
                                i = R.id.downloadGpxIb;
                                CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
                                if (checkBox4 != null) {
                                    i = R.id.edt_nickname;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
                                    if (pFMedium != null) {
                                        i = R.id.gMapView;
                                        CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
                                        if (customGoogleMapView != null) {
                                            i = R.id.hrLineChart;
                                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
                                            if (lineChart != null) {
                                                i = R.id.iv_avatar;
                                                ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                                                if (imageViewRound != null) {
                                                    i = R.id.ll_hr;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_hr);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.mapView_layout;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapView_layout);
                                                        if (frameLayout != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                                            i = R.id.share_video_map_btn_ll;
                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_video_map_btn_ll);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.share_video_save_btn;
                                                                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.share_video_save_btn);
                                                                if (button2 != null) {
                                                                    i = R.id.tv_avg_bpm_value;
                                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
                                                                    if (pFMedium2 != null) {
                                                                        i = R.id.tv_calories_value;
                                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
                                                                        if (pFMedium3 != null) {
                                                                            i = R.id.tv_dateTime;
                                                                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
                                                                            if (pFMedium4 != null) {
                                                                                i = R.id.tv_detail_name;
                                                                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
                                                                                if (dINCondBold != null) {
                                                                                    i = R.id.tv_distance_unit;
                                                                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                                                                                    if (dINCondBold2 != null) {
                                                                                        i = R.id.tv_distance_value;
                                                                                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                                                                        if (dINCondBold3 != null) {
                                                                                            i = R.id.tv_distance_value_ll;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value_ll);
                                                                                            if (linearLayout4 != null) {
                                                                                                i = R.id.tv_duration;
                                                                                                PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
                                                                                                if (pFMedium5 != null) {
                                                                                                    i = R.id.tv_hr_value;
                                                                                                    PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hr_value);
                                                                                                    if (pFMedium6 != null) {
                                                                                                        return new FragmentSportDetailMapV3Binding(relativeLayout, textureMapView, checkBox, checkBox2, checkBox3, button, linearLayout, checkBox4, pFMedium, customGoogleMapView, lineChart, imageViewRound, linearLayout2, frameLayout, relativeLayout, linearLayout3, button2, pFMedium2, pFMedium3, pFMedium4, dINCondBold, dINCondBold2, dINCondBold3, linearLayout4, pFMedium5, pFMedium6);
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
    public static FragmentSportDetailMapV3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailMapV3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_map_v3, parent, false);
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
