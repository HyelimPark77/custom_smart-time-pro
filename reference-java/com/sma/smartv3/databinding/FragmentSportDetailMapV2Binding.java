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
                                i = R.id.data_panel;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
                                if (linearLayout2 != null) {
                                    i = R.id.downloadGpxIb;
                                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
                                    if (checkBox4 != null) {
                                        i = R.id.edt_nickname;
                                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
                                        if (pFMedium != null) {
                                            i = R.id.edt_nickname2;
                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname2);
                                            if (pFMedium2 != null) {
                                                i = R.id.gMapView;
                                                CustomGoogleMapView customGoogleMapView = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
                                                if (customGoogleMapView != null) {
                                                    i = R.id.iv_avatar;
                                                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                                                    if (imageViewRound != null) {
                                                        i = R.id.iv_avatar1_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.iv_avatar1_layout);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.iv_avatar2;
                                                            ImageViewRound imageViewRound2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar2);
                                                            if (imageViewRound2 != null) {
                                                                i = R.id.iv_avatar2_layout;
                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.iv_avatar2_layout);
                                                                if (linearLayout4 != null) {
                                                                    i = R.id.mapView_layout;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mapView_layout);
                                                                    if (frameLayout != null) {
                                                                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                                                        i = R.id.sport_detail_map_v2_recycler;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.sport_detail_map_v2_recycler);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.sport_detail_maxpace;
                                                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_detail_maxpace);
                                                                            if (pFMedium3 != null) {
                                                                                i = R.id.sport_detail_minpace;
                                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_detail_minpace);
                                                                                if (pFMedium4 != null) {
                                                                                    i = R.id.sport_detail_pace_layout;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_pace_layout);
                                                                                    if (linearLayout5 != null) {
                                                                                        i = R.id.sport_detail_progressbar;
                                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.sport_detail_progressbar);
                                                                                        if (progressBar != null) {
                                                                                            i = R.id.sport_detail_progressbar_layout;
                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_progressbar_layout);
                                                                                            if (relativeLayout2 != null) {
                                                                                                i = R.id.sport_detail_steps_layout;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_steps_layout);
                                                                                                if (linearLayout6 != null) {
                                                                                                    i = R.id.tv_airpressure_layout;
                                                                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_layout);
                                                                                                    if (linearLayout7 != null) {
                                                                                                        i = R.id.tv_airpressure_unit;
                                                                                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_unit);
                                                                                                        if (pFMedium5 != null) {
                                                                                                            i = R.id.tv_airpressure_value;
                                                                                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_value);
                                                                                                            if (pFMedium6 != null) {
                                                                                                                i = R.id.tv_avg_bpm_value;
                                                                                                                PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
                                                                                                                if (pFMedium7 != null) {
                                                                                                                    i = R.id.tv_calories_value;
                                                                                                                    PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
                                                                                                                    if (pFMedium8 != null) {
                                                                                                                        i = R.id.tv_dateTime;
                                                                                                                        PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
                                                                                                                        if (pFMedium9 != null) {
                                                                                                                            i = R.id.tv_dateTime_noMap;
                                                                                                                            PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime_noMap);
                                                                                                                            if (pFMedium10 != null) {
                                                                                                                                i = R.id.tv_detail_name;
                                                                                                                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
                                                                                                                                if (dINCondBold != null) {
                                                                                                                                    i = R.id.tv_detail_name_noMap;
                                                                                                                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name_noMap);
                                                                                                                                    if (dINCondBold2 != null) {
                                                                                                                                        i = R.id.tv_distance_unit;
                                                                                                                                        PFMedium pFMedium11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                                                                                                                                        if (pFMedium11 != null) {
                                                                                                                                            i = R.id.tv_distance_value;
                                                                                                                                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                                                                                                                            if (dINCondBold3 != null) {
                                                                                                                                                i = R.id.tv_duration;
                                                                                                                                                PFMedium pFMedium12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
                                                                                                                                                if (pFMedium12 != null) {
                                                                                                                                                    i = R.id.tv_duration_title;
                                                                                                                                                    PFMedium pFMedium13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration_title);
                                                                                                                                                    if (pFMedium13 != null) {
                                                                                                                                                        i = R.id.tv_hr_value;
                                                                                                                                                        PFMedium pFMedium14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hr_value);
                                                                                                                                                        if (pFMedium14 != null) {
                                                                                                                                                            i = R.id.tv_pace_unit;
                                                                                                                                                            PFMedium pFMedium15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_unit);
                                                                                                                                                            if (pFMedium15 != null) {
                                                                                                                                                                i = R.id.tv_pace_value;
                                                                                                                                                                PFMedium pFMedium16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
                                                                                                                                                                if (pFMedium16 != null) {
                                                                                                                                                                    i = R.id.tv_step_value;
                                                                                                                                                                    PFMedium pFMedium17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_step_value);
                                                                                                                                                                    if (pFMedium17 != null) {
                                                                                                                                                                        i = R.id.tv_view_field_explanation;
                                                                                                                                                                        PFMedium pFMedium18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_view_field_explanation);
                                                                                                                                                                        if (pFMedium18 != null) {
                                                                                                                                                                            return new FragmentSportDetailMapV2Binding(relativeLayout, textureMapView, checkBox, checkBox2, checkBox3, button, linearLayout, linearLayout2, checkBox4, pFMedium, pFMedium2, customGoogleMapView, imageViewRound, linearLayout3, imageViewRound2, linearLayout4, frameLayout, relativeLayout, recyclerView, pFMedium3, pFMedium4, linearLayout5, progressBar, relativeLayout2, linearLayout6, linearLayout7, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9, pFMedium10, dINCondBold, dINCondBold2, pFMedium11, dINCondBold3, pFMedium12, pFMedium13, pFMedium14, pFMedium15, pFMedium16, pFMedium17, pFMedium18);
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
    public static FragmentSportDetailMapV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailMapV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_map_v2, parent, false);
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
